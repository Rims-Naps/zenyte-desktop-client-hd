/*
 * Copyright (c) 2017, Seth <Sethtroll3@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.fishing;

import lombok.AccessLevel;
import lombok.Setter;
import net.runelite.api.Point;
import net.runelite.api.*;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.ui.overlay.components.ProgressPieComponent;
import net.runelite.client.util.ImageUtil;

import javax.inject.Inject;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.time.Duration;
import java.time.Instant;

class FishingSpotOverlay extends Overlay
{
	private static final Duration MINNOW_MOVE = Duration.ofSeconds(15);
	private static final Duration MINNOW_WARN = Duration.ofSeconds(3);
	private static final int ONE_TICK_AERIAL_FISHING = 3;

	private final FishingPlugin plugin;
	private final FishingConfig config;
	private final Client client;
	private final ItemManager itemManager;

	@Setter(AccessLevel.PACKAGE)
	private boolean hidden;

	@Inject
	private FishingSpotOverlay(FishingPlugin plugin, FishingConfig config, Client client, ItemManager itemManager)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_SCENE);
		this.plugin = plugin;
		this.config = config;
		this.client = client;
		this.itemManager = itemManager;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (hidden)
		{
			return null;
		}

		for (NPC npc : plugin.getFishingSpots())
		{
			FishingSpot spot = FishingSpot.getSPOTS().get(npc.getId());

			if (spot == null)
			{
				continue;
			}

			if (config.onlyCurrentSpot() && plugin.getCurrentSpot() != null && plugin.getCurrentSpot() != spot)
			{
				continue;
			}

			Color color = npc.getGraphic() == GraphicID.FLYING_FISH ? Color.RED : Color.CYAN;

			if (spot == FishingSpot.MINNOW && config.showMinnowOverlay())
			{
				MinnowSpot minnowSpot = plugin.getMinnowSpots().get(npc.getIndex());
				if (minnowSpot != null)
				{
					long millisLeft = MINNOW_MOVE.toMillis() - Duration.between(minnowSpot.getTime(), Instant.now()).toMillis();
					if (millisLeft < MINNOW_WARN.toMillis())
					{
						color = Color.ORANGE;
					}

					LocalPoint localPoint = npc.getLocalLocation();
					Point location = Perspective.localToCanvas(client, localPoint, client.getPlane());

					if (location != null)
					{
						ProgressPieComponent pie = new ProgressPieComponent();
						pie.setFill(color);
						pie.setBorderColor(color);
						pie.setPosition(location);
						pie.setProgress((float) millisLeft / MINNOW_MOVE.toMillis());
						pie.render(graphics);
					}
				}
			}

			if (config.showSpotTiles())
			{
				Polygon poly = npc.getCanvasTilePoly();

				if (spot == FishingSpot.COMMON_TENCH
					&& npc.getWorldLocation().distanceTo2D(client.getLocalPlayer().getWorldLocation()) <= ONE_TICK_AERIAL_FISHING)
				{
					color = Color.GREEN;
				}

				if (poly != null)
				{
					OverlayUtil.renderPolygon(graphics, poly, color.darker());
				}
			}

			if (config.showSpotIcons())
			{
				BufferedImage fishImage = itemManager.getImage(spot.getFishSpriteId());;

				if (spot == FishingSpot.COMMON_TENCH
					&& npc.getWorldLocation().distanceTo2D(client.getLocalPlayer().getWorldLocation()) <= ONE_TICK_AERIAL_FISHING)
				{
					fishImage = ImageUtil.outlineImage(itemManager.getImage(spot.getFishSpriteId()), Color.GREEN);
				}

				if (fishImage != null)
				{
					Point imageLocation = npc.getCanvasImageLocation(fishImage, npc.getLogicalHeight());
					if (imageLocation != null)
					{
						OverlayUtil.renderImageLocation(graphics, imageLocation, fishImage);
					}
				}
			}

			if (config.showSpotNames())
			{
				String text = spot.getName();
				Point textLocation = npc.getCanvasTextLocation(graphics, text, npc.getLogicalHeight() + 40);

				if (spot == FishingSpot.COMMON_TENCH
					&& npc.getWorldLocation().distanceTo2D(client.getLocalPlayer().getWorldLocation()) <= ONE_TICK_AERIAL_FISHING)
				{
					color = Color.GREEN;
				}

				if (textLocation != null)
				{
					OverlayUtil.renderTextLocation(graphics, textLocation, text, color.darker());
				}
			}
		}

		return null;
	}
}
