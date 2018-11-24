package net.runelite.standalone;

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
public final class class331 extends class333 implements RSMainBufferProvider {
   @ObfuscatedName("l")
   Image field3989;
   @ObfuscatedName("f")
   Component field3988;

   class331(int var1, int var2, Component var3) {
      super.field4010 = var1;
      super.field4009 = var2;
      super.field4011 = new int[var2 * var1 + 1];
      DataBufferInt var4 = new DataBufferInt(super.field4011, super.field4011.length);
      DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(super.field4010, super.field4009), var4, (Point)null);
      this.field3989 = new BufferedImage(var5, var6, false, new Hashtable());
      this.method6349(var3);
      this.method6367();
      this.init(var1, var2, var3);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-939449216"
   )
   public final void vmethod6366(int var1, int var2) {
      this.method6356(this.field3988.getGraphics(), var1, var2);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Graphics;IIB)V",
      garbageValue = "35"
   )
   final void method6356(Graphics var1, int var2, int var3) {
      class302.field3755.getCallbacks().draw(this, var1, var2, var3);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;I)V",
      garbageValue = "1240490943"
   )
   final void method6349(Component var1) {
      this.field3988 = var1;
   }

   public void setImage(Image var1) {
      this.field3989 = var1;
   }

   public void init(int var1, int var2, Component var3) {
      if(class302.field3755.isGpu()) {
         int[] var4 = this.getPixels();
         DataBufferInt var5 = new DataBufferInt(var4, var4.length);
         DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255, -16777216);
         WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(var1, var2), var5, (Point)null);
         BufferedImage var8 = new BufferedImage(var6, var7, false, new Hashtable());
         this.setImage(var8);
      }
   }

   public Component getCanvas() {
      return this.field3988;
   }

   public Image getImage() {
      return this.field3989;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Graphics;IIIII)V",
      garbageValue = "2117862101"
   )
   final void method6352(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var6 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.field3989, 0, 0, this.field3988);
         var1.setClip(var6);
      } catch (Exception var7) {
         this.field3988.repaint();
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIIIB)V",
      garbageValue = "-119"
   )
   public final void vmethod6369(int var1, int var2, int var3, int var4) {
      this.method6352(this.field3988.getGraphics(), var1, var2, var3, var4);
   }
}
