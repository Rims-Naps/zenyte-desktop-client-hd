package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public enum class317 implements class91 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lih;"
   )
   field3394("runescape", "RuneScape", 0),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lih;"
   )
   field3395("stellardawn", "Stellar Dawn", 1),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lih;"
   )
   field3396("game3", "Game 3", 2),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lih;"
   )
   field3397("game4", "Game 4", 3),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lih;"
   )
   field3398("game5", "Game 5", 4),
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lih;"
   )
   field3399("oldscape", "RuneScape 2007", 5);

   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 782184231
   )
   final int field3401;
   @ObfuscatedName("c")
   public final String field3400;

   class317(String var3, String var4, int var5) {
      this.field3400 = var3;
      this.field3401 = var5;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "87"
   )
   public int vmethod5937() {
      return this.field3401;
   }
}
