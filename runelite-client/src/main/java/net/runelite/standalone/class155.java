package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
public class class155 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lfq;"
   )
   static class250 field1905;

   @ObfuscatedName("is")
   @ObfuscatedSignature(
      signature = "(Lhw;III)V",
      garbageValue = "-1694025271"
   )
   static void method2830(class187 var0, int var1, int var2) {
      if(var0.field2585 == 0) {
         var0.field2634 = var0.field2625;
      } else if(var0.field2585 == 1) {
         var0.field2634 = var0.field2625 + (var1 - var0.field2573) / 2;
      } else if(var0.field2585 == 2) {
         var0.field2634 = var1 - var0.field2573 - var0.field2625;
      } else if(var0.field2585 == 3) {
         var0.field2634 = var0.field2625 * var1 >> 14;
      } else if(var0.field2585 == 4) {
         var0.field2634 = (var1 - var0.field2573) / 2 + (var0.field2625 * var1 >> 14);
      } else {
         var0.field2634 = var1 - var0.field2573 - (var0.field2625 * var1 >> 14);
      }

      if(var0.field2559 == 0) {
         var0.field2572 = var0.field2568;
         var0.onPositionChanged(-1);
      } else if(var0.field2559 == 1) {
         var0.field2572 = (var2 - var0.field2574) / 2 + var0.field2568;
         var0.onPositionChanged(-1);
      } else if(var0.field2559 == 2) {
         var0.field2572 = var2 - var0.field2574 - var0.field2568;
         var0.onPositionChanged(-1);
      } else if(var0.field2559 == 3) {
         var0.field2572 = var2 * var0.field2568 >> 14;
         var0.onPositionChanged(-1);
      } else if(var0.field2559 == 4) {
         var0.field2572 = (var2 - var0.field2574) / 2 + (var2 * var0.field2568 >> 14);
         var0.onPositionChanged(-1);
      } else {
         var0.field2572 = var2 - var0.field2574 - (var2 * var0.field2568 >> 14);
         var0.onPositionChanged(-1);
      }

   }
}
