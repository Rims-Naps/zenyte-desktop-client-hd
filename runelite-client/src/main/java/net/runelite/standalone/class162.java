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
import net.runelite.rs.api.RSRenderable;
import net.runelite.rs.api.RSWallObject;

@ObfuscatedName("eg")
public final class class162 implements RSWallObject {
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      longValue = -8391579008094463485L
   )
   public long field1957;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Ldj;"
   )
   public class102 field1963;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -132920147
   )
   int field1958;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -712792173
   )
   int field1960;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 50890113
   )
   int field1964;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -132899539
   )
   int field1965;
   public int wallPlane;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Ldj;"
   )
   public class102 field1961;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 966613493
   )
   int field1962;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 295956839
   )
   int field1959;

   class162() {
      this.field1957 = 0L;
      this.field1965 = 0;
   }

   public Point getCanvasLocation(int var1) {
      return Perspective.localToCanvas(class302.field3755, this.getLocalLocation(), this.getPlane(), var1);
   }

   public long getHash() {
      return this.field1957;
   }

   public RSRenderable getRenderable1() {
      return this.field1961;
   }

   public RSRenderable getRenderable2() {
      return this.field1963;
   }

   public int getX() {
      return this.field1958;
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY());
   }

   public Model getModelA() {
      RSRenderable var1 = this.getRenderable1();
      return var1 == null?null:(var1 instanceof Model?(Model)var1:var1.getModel());
   }

   public int getY() {
      return this.field1959;
   }

   public int getPlane() {
      return this.wallPlane;
   }

   public int getOrientationA() {
      return this.field1960;
   }

   public Model getModelB() {
      RSRenderable var1 = this.getRenderable2();
      return var1 == null?null:(var1 instanceof Model?(Model)var1:var1.getModel());
   }

   public int getOrientationB() {
      return this.field1962;
   }

   public void setPlane(int var1) {
      this.wallPlane = var1;
   }

   public Area getClickbox() {
      Area var1 = new Area();
      Area var2 = Perspective.getClickbox(class302.field3755, this.getModelA(), this.getOrientationA(), this.getLocalLocation());
      Area var3 = Perspective.getClickbox(class302.field3755, this.getModelB(), this.getOrientationB(), this.getLocalLocation());
      if(var2 == null && var3 == null) {
         return null;
      } else {
         if(var2 != null) {
            var1.add(var2);
         }

         if(var3 != null) {
            var1.add(var3);
         }

         return var1;
      }
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

   public int getConfig() {
      return this.field1965;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1443045173"
   )
   public static int method2968(int var0) {
      int var1 = 0;
      if(var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var1 += 16;
      }

      if(var0 >= 256) {
         var0 >>>= 8;
         var1 += 8;
      }

      if(var0 >= 16) {
         var0 >>>= 4;
         var1 += 4;
      }

      if(var0 >= 4) {
         var0 >>>= 2;
         var1 += 2;
      }

      if(var0 >= 1) {
         var0 >>>= 1;
         ++var1;
      }

      return var0 + var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)I",
      garbageValue = "99"
   )
   public static int method2970(String var0) {
      return var0.length() + 2;
   }

   @ObfuscatedName("fp")
   @ObfuscatedSignature(
      signature = "(IIIIZB)V",
      garbageValue = "-93"
   )
   static final void method2969(int var0, int var1, int var2, int var3, boolean var4) {
      if(var2 < 1) {
         var2 = 1;
      }

      if(var3 < 1) {
         var3 = 1;
      }

      int var5 = var3 - 334;
      int var6;
      if(var5 < 0) {
         var6 = client.field2396;
      } else if(var5 >= 100) {
         var6 = client.field2405;
      } else {
         var6 = (client.field2405 - client.field2396) * var5 / 100 + client.field2396;
      }

      int var7 = var3 * var6 * 512 / (var2 * 334);
      int var8;
      int var9;
      short var10;
      if(var7 < client.field2409) {
         var10 = client.field2409;
         var6 = var10 * var2 * 334 / (var3 * 512);
         if(var6 > client.field2408) {
            var6 = client.field2408;
            var8 = var3 * var6 * 512 / (var10 * 334);
            var9 = (var2 - var8) / 2;
            if(var4) {
               class173.method3151();
               class173.method3167(var0, var1, var9, var3, -16777216);
               class173.method3167(var0 + var2 - var9, var1, var9, var3, -16777216);
            }

            var0 += var9;
            var2 -= var9 * 2;
         }
      } else if(var7 > client.field2341) {
         var10 = client.field2341;
         var6 = var10 * var2 * 334 / (var3 * 512);
         if(var6 < client.field2407) {
            var6 = client.field2407;
            var8 = var10 * var2 * 334 / (var6 * 512);
            var9 = (var3 - var8) / 2;
            if(var4) {
               class173.method3151();
               class173.method3167(var0, var1, var2, var9, -16777216);
               class173.method3167(var0, var3 + var1 - var9, var2, var9, -16777216);
            }

            var1 += var9;
            var3 -= var9 * 2;
         }
      }

      client.field2230 = var3 * var6 / 334;
      if(var2 != client.field2413 || var3 != client.field2359) {
         class185.method3740(var2, var3);
      }

      client.field2244 = var0;
      client.field2237 = var1;
      client.field2413 = var2;
      client.field2359 = var3;
   }
}
