///*
// * Copyright (c) 2017, Levi <me@levischuck.com>
// * All rights reserved.
// *
// * Redistribution and use in source and binary forms, with or without
// * modification, are permitted provided that the following conditions are met:
// *
// * 1. Redistributions of source code must retain the above copyright notice, this
// *    list of conditions and the following disclaimer.
// * 2. Redistributions in binary form must reproduce the above copyright notice,
// *    this list of conditions and the following disclaimer in the documentation
// *    and/or other materials provided with the distribution.
// *
// * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
// * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
// * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
// * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
// * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
// * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
// * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
// * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
// * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
// */
//package net.runelite.client.plugins.fps;
//
//import net.runelite.client.config.Config;
//import net.runelite.client.config.ConfigGroup;
//import net.runelite.client.config.ConfigItem;
//
//@ConfigGroup(FpsPlugin.CONFIG_GROUP_KEY)
//public interface FpsConfig extends Config
//{
//	@ConfigItem(
//		keyName = "limitMode",
//		name = "Limit Mode",
//		description = "Stay at or under the target frames per second even when in this mode",
//		position = 1
//	)
//	default FpsLimitMode limitMode()
//	{
//		return FpsLimitMode.NEVER;
//	}
//
//	@ConfigItem(
//		keyName = "maxFps",
//		name = "FPS target",
//		description = "Desired max frames per second",
//		position = 2
//	)
//	default int maxFps()
//	{
//		return 50;
//	}
//
//	@ConfigItem(
//		keyName = "drawFps",
//		name = "Draw FPS indicator",
//		description = "Show a number in the corner for the current FPS",
//		position = 3
//	)
//	default boolean drawFps()
//	{
//		return true;
//	}
//}
