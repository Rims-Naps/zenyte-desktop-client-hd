package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
public enum class82 implements class91 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lln;"
   )
   field737(0, 0),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lln;"
   )
   field734(1, 1),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lln;"
   )
   field735(2, 2);

   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1813097869
   )
   final int field733;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1732684597
   )
   public final int field736;

   class82(int var3, int var4) {
      this.field736 = var3;
      this.field733 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "87"
   )
   public int vmethod5937() {
      return this.field733;
   }
}
