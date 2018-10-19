package net.runelite.client.standalone;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSMainBufferProvider;

@ObfuscatedName("aj")
public final class class276 extends class6 implements RSMainBufferProvider {
   @ObfuscatedName("f")
   Component field3009;
   @ObfuscatedName("l")
   Image field3010;

   class276(int var1, int var2, Component var3) {
      super.field47 = var1;
      super.field46 = var2;
      super.field48 = new int[var2 * var1 + 1];
      DataBufferInt var4 = new DataBufferInt(super.field48, super.field48.length);
      DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(super.field47, super.field46), var4, (Point)null);
      this.field3010 = new BufferedImage(var5, var6, false, new Hashtable());
      this.method4917(var3);
      this.method76();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;I)V",
      garbageValue = "1240490943"
   )
   final void method4917(Component var1) {
      this.field3009 = var1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Graphics;IIIII)V",
      garbageValue = "2117862101"
   )
   final void method4920(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var6 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.field3010, 0, 0, this.field3009);
         var1.setClip(var6);
      } catch (Exception var7) {
         this.field3009.repaint();
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-939449216"
   )
   public final void vmethod4918(int var1, int var2) {
      this.method4924(this.field3009.getGraphics(), var1, var2);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Graphics;IIB)V",
      garbageValue = "35"
   )
   final void method4924(Graphics var1, int var2, int var3) {
      class113.field1064.getCallbacks().draw(this, var1, var2, var3);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIIIB)V",
      garbageValue = "-119"
   )
   public final void vmethod4919(int var1, int var2, int var3, int var4) {
      this.method4920(this.field3009.getGraphics(), var1, var2, var3, var4);
   }

   public Image getImage() {
      return this.field3010;
   }
}
