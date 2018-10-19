package net.runelite.client.standalone;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Area;
import net.runelite.api.Model;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.Renderable;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSGroundObject;

@ObfuscatedName("dw")
public final class class195 implements RSGroundObject {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1978587533
   )
   int field1853;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      longValue = 2329026692373815313L
   )
   public long field1854;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -599982245
   )
   int field1850;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Ldj;"
   )
   public class308 field1849;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -598476969
   )
   int field1852;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1408344723
   )
   int field1851;
   public int groundObjectPlane;

   public Point getCanvasLocation(int var1) {
      return Perspective.localToCanvas(class113.field1064, this.getLocalLocation(), this.getPlane(), var1);
   }

   public long getHash() {
      return this.field1854;
   }

   public Renderable getRenderable() {
      return this.field1849;
   }

   public int getX() {
      return this.field1850;
   }

   public Model getModel() {
      Renderable var1 = this.getRenderable();
      return var1 == null?null:(var1 instanceof Model?(Model)var1:var1.getModel());
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY());
   }

   public int getY() {
      return this.field1851;
   }

   public int getPlane() {
      return this.groundObjectPlane;
   }

   public void setPlane(int var1) {
      this.groundObjectPlane = var1;
   }

   public Area getClickbox() {
      return Perspective.getClickbox(class113.field1064, this.getModel(), 0, this.getLocalLocation());
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

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;Lik;ZLkn;I)V",
      garbageValue = "502257140"
   )
   public static void method3306(class148 var0, class148 var1, boolean var2, class277 var3) {
      class120.field1097 = var0;
      class303.field3243 = var1;
      class176.field1683 = var2;
      class120.field1098 = class120.field1097.method2616(10);
      class95.field900 = var3;
   }

   @ObfuscatedName("jo")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "259078230"
   )
   static final void method3304() {
      client.field3926 = client.field3917;
      class248.field2473 = true;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "392425741"
   )
   static int method3305(int var0, class252 var1, boolean var2) {
      int var3;
      if(var0 == 5504) {
         class171.field1587 -= 2;
         var3 = class55.field407[class171.field1587];
         int var4 = class55.field407[class171.field1587 + 1];
         if(!client.field3976) {
            client.field3801 = var3;
            client.onCameraPitchTargetChanged(-1);
            client.field3802 = var4;
         }

         return 1;
      } else if(var0 == 5505) {
         class55.field407[++class171.field1587 - 1] = client.field3801;
         return 1;
      } else if(var0 == 5506) {
         class55.field407[++class171.field1587 - 1] = client.field3802;
         return 1;
      } else if(var0 == 5530) {
         var3 = class55.field407[--class171.field1587];
         if(var3 < 0) {
            var3 = 0;
         }

         client.field3808 = var3;
         return 1;
      } else if(var0 == 5531) {
         class55.field407[++class171.field1587 - 1] = client.field3808;
         return 1;
      } else {
         return 2;
      }
   }
}
