package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
public enum class151 implements class91 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Llj;"
   )
   field1443(2, 0),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Llj;"
   )
   field1442(1, 1),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Llj;"
   )
   field1444(0, 2);

   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -50851413
   )
   final int field1441;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1957023797
   )
   final int field1445;

   class151(int var3, int var4) {
      this.field1445 = var3;
      this.field1441 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "87"
   )
   public int vmethod5937() {
      return this.field1441;
   }
}
