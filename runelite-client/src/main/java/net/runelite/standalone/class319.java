package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
public enum class319 implements class26 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Llj;"
   )
   field3919(2, 0),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Llj;"
   )
   field3918(1, 1),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Llj;"
   )
   field3920(0, 2);

   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1957023797
   )
   final int field3921;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -50851413
   )
   final int field3917;

   class319(int var3, int var4) {
      this.field3921 = var3;
      this.field3917 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "87"
   )
   public int vmethod6234() {
      return this.field3917;
   }
}
