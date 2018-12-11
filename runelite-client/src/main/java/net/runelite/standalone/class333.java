package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSBufferProvider;

@ObfuscatedName("lb")
public abstract class class333 implements RSBufferProvider {
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -879226253
   )
   public int field4010;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1523428005
   )
   public int field4009;
   @ObfuscatedName("w")
   public int[] field4011;

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2026259752"
   )
   public final void method6367() {
      Rasterizer2D.method3136(this.field4011, this.field4010, this.field4009);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-939449216"
   )
   public abstract void vmethod6366(int var1, int var2);

   public int[] getPixels() {
      return this.field4011;
   }

   public int getWidth() {
      return this.field4010;
   }

   public int getHeight() {
      return this.field4009;
   }

   public void setRaster() {
      this.method6367();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIIIB)V",
      garbageValue = "-119"
   )
   public abstract void vmethod6369(int var1, int var2, int var3, int var4);
}
