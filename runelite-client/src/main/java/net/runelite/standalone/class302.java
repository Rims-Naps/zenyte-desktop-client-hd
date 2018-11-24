package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
public enum class302 implements class26 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lcf;"
   )
   field3750(0),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lcf;"
   )
   field3756(1),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lcf;"
   )
   field3751(2),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lcf;"
   )
   field3752(3);

   @ObfuscatedName("ay")
   static client field3755;
   @ObfuscatedName("q")
   static int[] field3754;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -264013547
   )
   final int field3753;

   class302(int var3) {
      this.field3753 = var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "87"
   )
   public int vmethod6234() {
      return this.field3753;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIII)I",
      garbageValue = "1197981744"
   )
   static final int method5976(int var0, int var1, int var2) {
      int var3 = 256 - var2;
      return ((var1 & 65280) * var2 + (var0 & 65280) * var3 & 16711680) + (var3 * (var0 & 16711935) + (var1 & 16711935) * var2 & -16711936) >> 8;
   }
}
