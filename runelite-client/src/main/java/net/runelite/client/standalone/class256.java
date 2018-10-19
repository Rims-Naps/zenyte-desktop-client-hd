package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
public class class256 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lfq;"
   )
   static class165 field2538;

   @ObfuscatedName("is")
   @ObfuscatedSignature(
      signature = "(Lhw;III)V",
      garbageValue = "-1694025271"
   )
   static void method4564(class329 var0, int var1, int var2) {
      if(var0.field3571 == 0) {
         var0.field3620 = var0.field3611;
      } else if(var0.field3571 == 1) {
         var0.field3620 = var0.field3611 + (var1 - var0.field3559) / 2;
      } else if(var0.field3571 == 2) {
         var0.field3620 = var1 - var0.field3559 - var0.field3611;
      } else if(var0.field3571 == 3) {
         var0.field3620 = var0.field3611 * var1 >> 14;
      } else if(var0.field3571 == 4) {
         var0.field3620 = (var1 - var0.field3559) / 2 + (var0.field3611 * var1 >> 14);
      } else {
         var0.field3620 = var1 - var0.field3559 - (var0.field3611 * var1 >> 14);
      }

      if(var0.field3545 == 0) {
         var0.field3558 = var0.field3554;
         var0.onPositionChanged(-1);
      } else if(var0.field3545 == 1) {
         var0.field3558 = (var2 - var0.field3560) / 2 + var0.field3554;
         var0.onPositionChanged(-1);
      } else if(var0.field3545 == 2) {
         var0.field3558 = var2 - var0.field3560 - var0.field3554;
         var0.onPositionChanged(-1);
      } else if(var0.field3545 == 3) {
         var0.field3558 = var2 * var0.field3554 >> 14;
         var0.onPositionChanged(-1);
      } else if(var0.field3545 == 4) {
         var0.field3558 = (var2 - var0.field3560) / 2 + (var2 * var0.field3554 >> 14);
         var0.onPositionChanged(-1);
      } else {
         var0.field3558 = var2 - var0.field3560 - (var2 * var0.field3554 >> 14);
         var0.onPositionChanged(-1);
      }

   }
}
