package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
public enum AttackOpPriority implements Enumerated {
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lcb;"
   )
   COMBAT_LEVEL_BASED(0),
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lcb;"
   )
   UNPRIORITISED(1),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lcb;"
   )
   PRIORITISED(2),
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lcb;"
   )
   HIDDEN(3);

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      signature = "[Lls;"
   )
   static SpritePixels[] field1137;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -538686965
   )
   final int id;

   AttackOpPriority(int var3) {
      this.id = var3;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "1"
   )
   public int vmethod5358() {
      return this.id;
   }
}
