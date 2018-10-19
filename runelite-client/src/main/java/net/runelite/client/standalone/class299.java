package net.runelite.client.standalone;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Area;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.Angle;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSGameObject;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSRenderable;

@ObfuscatedName("ef")
public final class class299 implements RSGameObject {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1248530907
   )
   int field3209;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1186109173
   )
   int field3221;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -408996237
   )
   int field3222;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 882940933
   )
   int field3218;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1016827479
   )
   int field3215;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1149846235
   )
   int field3214;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1312829137
   )
   int field3213;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Ldj;"
   )
   public class308 field3220;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      longValue = 4093508849322709301L
   )
   public long field3219;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -288374685
   )
   int field3208;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 78157289
   )
   int field3210;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -2092167067
   )
   int field3212;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1134119145
   )
   int field3216;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 427791467
   )
   int field3207;

   class299() {
      this.field3219 = 0L;
      this.field3221 = 0;
   }

   public Point getCanvasLocation(int var1) {
      return Perspective.localToCanvas(class113.field1064, this.getLocalLocation(), this.getPlane(), var1);
   }

   public int getRelativeX() {
      return this.field3213;
   }

   public int getOffsetX() {
      return this.field3214;
   }

   public long getHash() {
      return this.field3219;
   }

   public RSModel getModel() {
      RSRenderable var1 = this.getRenderable();
      return var1 == null?null:(var1 instanceof RSModel?(RSModel)var1:var1.getModel());
   }

   public RSRenderable getRenderable() {
      return this.field3220;
   }

   public int getRsOrientation() {
      return this.field3212;
   }

   public int getX() {
      return this.field3216;
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY());
   }

   public int getRelativeY() {
      return this.field3215;
   }

   public int getOffsetY() {
      return this.field3222;
   }

   public int getFlags() {
      return this.field3221;
   }

   public int getY() {
      return this.field3210;
   }

   public int getPlane() {
      return this.field3209;
   }

   public Point getSceneMinLocation() {
      return new Point(this.getRelativeX(), this.getRelativeY());
   }

   public Point getSceneMaxLocation() {
      return new Point(this.getOffsetX(), this.getOffsetY());
   }

   public Area getClickbox() {
      return Perspective.getClickbox(class113.field1064, this.getModel(), this.getRsOrientation(), this.getLocalLocation());
   }

   public Polygon getConvexHull() {
      RSModel var1 = this.getModel();
      return var1 == null?null:var1.getConvexHull(this.getX(), this.getY(), this.getRsOrientation());
   }

   public Angle getOrientation() {
      int var1 = this.getRsOrientation();
      int var2 = this.getFlags() >> 6 & 3;
      return new Angle(var1 + var2 * 512);
   }

   public int getId() {
      long var1 = this.getHash();
      return (int)(var1 >>> 17 & 4294967295L);
   }

   public WorldPoint getWorldLocation() {
      return WorldPoint.fromLocal(class113.field1064, this.getX(), this.getY(), this.getPlane());
   }

   public Point getCanvasLocation() {
      return this.getCanvasLocation(0);
   }

   public Polygon getCanvasTilePoly() {
      return Perspective.getCanvasTilePoly(class113.field1064, this.getLocalLocation());
   }

   public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
      return Perspective.getCanvasTextLocation(class113.field1064, var1, this.getLocalLocation(), var2, var3);
   }

   public Point getMinimapLocation() {
      return Perspective.localToMinimap(class113.field1064, this.getLocalLocation());
   }

   public int getHeight() {
      return this.field3208;
   }

   @ObfuscatedName("hx")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "57"
   )
   static final int method5190() {
      return client.field3869 - 1;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(CB)Z",
      garbageValue = "76"
   )
   public static boolean method5191(char var0) {
      return var0 >= ' ' && var0 <= '~'?true:(var0 >= 160 && var0 <= 255?true:var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376);
   }
}
