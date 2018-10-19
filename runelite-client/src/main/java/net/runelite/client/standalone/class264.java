package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
public enum class264 implements class91 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   field2917(1, 0),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   field2913(2, 1),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   field2915(0, 2);

   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1791973143
   )
   final int field2914;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -974031821
   )
   public final int field2916;

   class264(int var3, int var4) {
      this.field2916 = var3;
      this.field2914 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "87"
   )
   public int vmethod5937() {
      return this.field2914;
   }
}
