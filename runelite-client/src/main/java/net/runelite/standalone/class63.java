package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
public enum class63 implements class26 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   field742(1, 0),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   field738(2, 1),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   field740(0, 2);

   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -974031821
   )
   public final int field741;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1791973143
   )
   final int field739;

   class63(int var3, int var4) {
      this.field741 = var3;
      this.field739 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "87"
   )
   public int vmethod6234() {
      return this.field739;
   }
}
