package net.runelite.standalone;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Area;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSItemLayer;
import net.runelite.rs.api.RSRenderable;

@ObfuscatedName("dc")
public final class class89 implements RSItemLayer {
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -2008122145
   )
   static int field974;
   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      signature = "[Lle;"
   )
   static class303[] field972;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 419484041
   )
   int field971;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      longValue = -7784442418912494785L
   )
   long field970;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 935197717
   )
   int field965;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Ldj;"
   )
   class102 field967;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -2115200701
   )
   int field964;
   public int itemLayerPlane;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Ldj;"
   )
   class102 field966;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Ldj;"
   )
   class102 field968;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1445135651
   )
   int field969;

   public Point getCanvasLocation(int var1) {
      return Perspective.localToCanvas(class302.field3755, this.getLocalLocation(), this.getPlane(), var1);
   }

   public long getHash() {
      return this.field970;
   }

   public int getX() {
      return this.field965;
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY());
   }

   public int getY() {
      return this.field969;
   }

   public int getPlane() {
      return this.itemLayerPlane;
   }

   public void setPlane(int var1) {
      this.itemLayerPlane = var1;
   }

   public Area getClickbox() {
      throw new UnsupportedOperationException();
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

   public RSRenderable getBottom() {
      return this.field967;
   }

   public RSRenderable getMiddle() {
      return this.field968;
   }

   public RSRenderable getTop() {
      return this.field966;
   }

   public int getHeight() {
      return this.field971;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/CharSequence;IIB)Ljava/lang/String;",
      garbageValue = "1"
   )
   public static String method1680(CharSequence[] var0, int var1, int var2) {
      if(var2 == 0) {
         return "";
      } else if(var2 == 1) {
         CharSequence var3 = var0[var1];
         return var3 == null?"null":var3.toString();
      } else {
         int var8 = var2 + var1;
         int var4 = 0;

         for(int var5 = var1; var5 < var8; ++var5) {
            CharSequence var6 = var0[var5];
            if(var6 == null) {
               var4 += 4;
            } else {
               var4 += var6.length();
            }
         }

         StringBuilder var9 = new StringBuilder(var4);

         for(int var10 = var1; var10 < var8; ++var10) {
            CharSequence var7 = var0[var10];
            if(var7 == null) {
               var9.append("null");
            } else {
               var9.append(var7);
            }
         }

         return var9.toString();
      }
   }
}
