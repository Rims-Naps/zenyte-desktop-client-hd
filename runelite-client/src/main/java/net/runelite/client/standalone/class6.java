package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSBufferProvider;

@ObfuscatedName("lb")
public abstract class class6 implements RSBufferProvider {
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1523428005
   )
   public int field46;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -879226253
   )
   public int field47;
   @ObfuscatedName("w")
   public int[] field48;

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-939449216"
   )
   public abstract void vmethod4918(int var1, int var2);

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIIIB)V",
      garbageValue = "-119"
   )
   public abstract void vmethod4919(int var1, int var2, int var3, int var4);

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2026259752"
   )
   public final void method76() {
      class89.method1530(this.field48, this.field47, this.field46);
   }

   public void setRaster() {
      this.method76();
   }
}
