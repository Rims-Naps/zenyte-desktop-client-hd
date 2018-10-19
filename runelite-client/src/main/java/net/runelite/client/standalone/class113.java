package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
public enum class113 implements class91 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lcf;"
   )
   field1059(0),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lcf;"
   )
   field1065(1),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lcf;"
   )
   field1060(2),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lcf;"
   )
   field1061(3);

   @ObfuscatedName("ay")
   static client field1064;
   @ObfuscatedName("q")
   static int[] field1063;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -264013547
   )
   final int field1062;

   class113(int var3) {
      this.field1062 = var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "87"
   )
   public int vmethod5937() {
      return this.field1062;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIII)I",
      garbageValue = "1197981744"
   )
   static final int method1876(int var0, int var1, int var2) {
      int var3 = 256 - var2;
      return ((var1 & 65280) * var2 + (var0 & 65280) * var3 & 16711680) + (var3 * (var0 & 16711935) + (var1 & 16711935) * var2 & -16711936) >> 8;
   }
}
