package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public enum class269 implements class91 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lew;"
   )
   field2952(1, 0),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lew;"
   )
   field2947(3, 1),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lew;"
   )
   field2949(0, 2),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lew;"
   )
   field2950(2, 3);

   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -632771497
   )
   public final int field2948;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1756504373
   )
   final int field2951;

   class269(int var3, int var4) {
      this.field2948 = var3;
      this.field2951 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "87"
   )
   public int vmethod5937() {
      return this.field2951;
   }
}
