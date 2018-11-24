package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public enum class21 implements class26 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lih;"
   )
   field232("runescape", "RuneScape", 0),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lih;"
   )
   field233("stellardawn", "Stellar Dawn", 1),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lih;"
   )
   field234("game3", "Game 3", 2),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lih;"
   )
   field235("game4", "Game 4", 3),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lih;"
   )
   field236("game5", "Game 5", 4),
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lih;"
   )
   field237("oldscape", "RuneScape 2007", 5);

   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 782184231
   )
   final int field239;
   @ObfuscatedName("c")
   public final String field238;

   class21(String var3, String var4, int var5) {
      this.field238 = var3;
      this.field239 = var5;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "87"
   )
   public int vmethod6234() {
      return this.field239;
   }
}
