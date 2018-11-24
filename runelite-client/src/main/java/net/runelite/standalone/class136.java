package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
public enum class136 implements class26 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lln;"
   )
   field1757(0, 0),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lln;"
   )
   field1754(1, 1),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lln;"
   )
   field1755(2, 2);

   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1732684597
   )
   public final int field1756;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1813097869
   )
   final int field1753;

   class136(int var3, int var4) {
      this.field1756 = var3;
      this.field1753 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "87"
   )
   public int vmethod6234() {
      return this.field1753;
   }
}
