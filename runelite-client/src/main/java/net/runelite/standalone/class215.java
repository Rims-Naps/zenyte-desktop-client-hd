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
import net.runelite.rs.api.RSGroundObject;
import net.runelite.rs.api.RSRenderable;

@ObfuscatedName("dw")
public final class class215 implements RSGroundObject {
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -599982245
   )
   int field2938;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Ldj;"
   )
   public class102 field2937;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1978587533
   )
   int field2941;
   public int groundObjectPlane;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -598476969
   )
   int field2940;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      longValue = 2329026692373815313L
   )
   public long field2942;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1408344723
   )
   int field2939;

   public Point getCanvasLocation(int var1) {
      return Perspective.localToCanvas(class302.field3755, this.getLocalLocation(), this.getPlane(), var1);
   }

   public long getHash() {
      return this.field2942;
   }

   public RSRenderable getRenderable() {
      return this.field2937;
   }

   public int getX() {
      return this.field2938;
   }

   public Model getModel() {
      RSRenderable var1 = this.getRenderable();
      return var1 == null?null:(var1 instanceof Model?(Model)var1:var1.getModel());
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY());
   }

   public int getY() {
      return this.field2939;
   }

   public int getPlane() {
      return this.groundObjectPlane;
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

   public void setPlane(int var1) {
      this.groundObjectPlane = var1;
   }

   public Area getClickbox() {
      return Perspective.getClickbox(class302.field3755, this.getModel(), 0, this.getLocalLocation());
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "392425741"
   )
   static int method4381(int var0, class296 var1, boolean var2) {
      int var3;
      if(var0 == 5504) {
         MapCacheArchiveNames.field3811 -= 2;
         var3 = class249.field3312[MapCacheArchiveNames.field3811];
         int var4 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
         if(!client.field2397) {
            client.field2222 = var3;
            client.onCameraPitchTargetChanged(-1);
            client.field2223 = var4;
         }

         return 1;
      } else if(var0 == 5505) {
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = client.field2222;
         return 1;
      } else if(var0 == 5506) {
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = client.field2223;
         return 1;
      } else if(var0 == 5530) {
         var3 = class249.field3312[--MapCacheArchiveNames.field3811];
         if(var3 < 0) {
            var3 = 0;
         }

         client.field2229 = var3;
         return 1;
      } else if(var0 == 5531) {
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = client.field2229;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;Lik;ZLkn;I)V",
      garbageValue = "502257140"
   )
   public static void method4382(Js5Index var0, Js5Index var1, boolean var2, class299 var3) {
      class42.field424 = var0;
      class148.field1833 = var1;
      class213.field2928 = var2;
      class42.field425 = class42.field424.method4435(10);
      class150.field1858 = var3;
   }

   @ObfuscatedName("jo")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "259078230"
   )
   static final void method4380() {
      client.field2347 = client.field2338;
      class301.field3748 = true;
   }
}
