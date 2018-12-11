package net.runelite.standalone;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Area;
import net.runelite.api.Model;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSDecorativeObject;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSRenderable;
import net.runelite.rs.api.RSSpritePixels;

@ObfuscatedName("eo")
public final class class91 implements RSDecorativeObject {
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Ldj;"
   )
   public class102 field991;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1927968227
   )
   int field990;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1053401925
   )
   int field996;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -17796891
   )
   int field985;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -281707569
   )
   int field986;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Ldj;"
   )
   public class102 field984;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      longValue = -1060322959283985639L
   )
   public long field993;
   public int decorativeObjectPlane;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 2004082509
   )
   int field994;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 722040379
   )
   int field989;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -872497631
   )
   int field988;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 144686039
   )
   int field992;

   class91() {
      this.field993 = 0L;
      this.field994 = 0;
   }

   public Point getCanvasLocation(int var1) {
      return Perspective.localToCanvas(class302.field3755, this.getLocalLocation(), this.getPlane(), var1);
   }

   public long getHash() {
      return this.field993;
   }

   public RSModel getModel() {
      RSRenderable var1 = this.getRenderable();
      if(var1 == null) {
         return null;
      } else {
         RSModel var2;
         if(var1 instanceof Model) {
            var2 = (RSModel)var1;
         } else {
            var2 = var1.getModel();
         }

         return var2;
      }
   }

   public RSRenderable getRenderable() {
      return this.field991;
   }

   public int getX() {
      return this.field996;
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY());
   }

   public int getY() {
      return this.field992;
   }

   public int getOrientation() {
      return this.field988;
   }

   public int getPlane() {
      return this.decorativeObjectPlane;
   }

   public void setPlane(int var1) {
      this.decorativeObjectPlane = var1;
   }

   public Area getClickbox() {
      return Perspective.getClickbox(class302.field3755, this.getModel(), this.getOrientation(), this.getLocalLocation());
   }

   public Polygon getConvexHull() {
      RSModel var1 = this.getModel();
      return var1 == null?null:var1.getConvexHull(this.getX(), this.getY(), this.getOrientation());
   }

   public int getId() {
      long var1 = this.getHash();
      return (int)(var1 >>> 17 & 4294967295L);
   }

   public WorldPoint getWorldLocation() {
      return WorldPoint.fromLocal(class302.field3755, this.getX(), this.getY(), this.getPlane());
   }

   public Point getCanvasLocation() {
      return this.getCanvasLocation(0);
   }

   public Polygon getCanvasTilePoly() {
      return Perspective.getCanvasTilePoly(class302.field3755, this.getLocalLocation());
   }

   public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
      return Perspective.getCanvasTextLocation(class302.field3755, var1, this.getLocalLocation(), var2, var3);
   }

   public Point getMinimapLocation() {
      return Perspective.localToMinimap(class302.field3755, this.getLocalLocation());
   }

   public RSRenderable getRenderable2() {
      return this.field984;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1553308519"
   )
   static final int method1714(int var0, int var1) {
      int var2 = var0 + var1 * 57;
      var2 ^= var2 << 13;
      int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
      return var3 >> 19 & 255;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IB)Ljc;",
      garbageValue = "-81"
   )
   public static class244 method1713(int var0) {
      class244 var1 = (class244)class244.field3278.method1813((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class244.field3280.method4398(33, var0, -1088106591);
         var1 = new class244();
         if(var2 != null) {
            var1.method4941(new Buffer(var2));
         }

         class244.field3278.method1820(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lik;IIB)Llp;"
   )
   public static SpritePixels method1715(Js5Index var0, int var1, int var2, byte var3) {
      net.runelite.api.SpritePixels var4 = (net.runelite.api.SpritePixels)client.spriteOverrides.get(Integer.valueOf(var1));
      return var4 != null?(SpritePixels)((RSSpritePixels)var4):(SpritePixels)client.copy$getSpriteAsSpritePixels(var0, var1, var2, var3);
   }
}
