package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public enum class2 implements class26 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lew;"
   )
   field19(1, 0),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lew;"
   )
   field14(3, 1),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lew;"
   )
   field16(0, 2),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lew;"
   )
   field17(2, 3);

   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1756504373
   )
   final int field18;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -632771497
   )
   public final int field15;

   class2(int var3, int var4) {
      this.field15 = var3;
      this.field18 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "87"
   )
   public int vmethod6234() {
      return this.field18;
   }
}
