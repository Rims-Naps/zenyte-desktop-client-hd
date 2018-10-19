package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
public class class68 {
   @ObfuscatedName("kr")
   @ObfuscatedGetter(
      intValue = -507528251
   )
   static int field631;

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Llp;IIII)V",
      garbageValue = "-441852182"
   )
   static void method1158(class26 var0, int var1, int var2, int var3) {
      class119 var4 = class261.field2890;
      long var6 = (long)(var3 << 16 | var1 << 8 | var2);
      var4.method2137(var0, var6, var0.field203.length * 4);
   }
}
