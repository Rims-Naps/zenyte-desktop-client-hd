package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
public class class246 {
   @ObfuscatedName("kr")
   @ObfuscatedGetter(
      intValue = -507528251
   )
   static int field3300;

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Llp;IIII)V",
      garbageValue = "-441852182"
   )
   static void method4955(SpritePixels var0, int var1, int var2, int var3) {
      class204 var4 = class47.field527;
      long var6 = (long)(var3 << 16 | var1 << 8 | var2);
      var4.method4032(var0, var6, var0.pixels.length * 4);
   }
}
