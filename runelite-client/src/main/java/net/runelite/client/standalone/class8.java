package net.runelite.client.standalone;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
final class class8 implements Comparator {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lw;Lw;S)I",
      garbageValue = "5523"
   )
   int method94(class230 var1, class230 var2) {
      return var1.field2247 < var2.field2247?-1:(var2.field2247 == var1.field2247?0:1);
   }

   public int compare(Object var1, Object var2) {
      return this.method94((class230)var1, (class230)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("fw")
   @ObfuscatedSignature(
      signature = "(Lbw;III)V",
      garbageValue = "-1389655789"
   )
   static void method99(class63 var0, int var1, int var2) {
      if(var0.field1273 == var1 && var1 != -1) {
         int var3 = class182.method3192(var1).field3412;
         if(var3 == 1) {
            var0.field1292 = 0;
            var0.field1317 = 0;
            var0.field1294 = var2;
            var0.field1295 = 0;
         }

         if(var3 == 2) {
            var0.field1295 = 0;
         }
      } else if(var1 == -1 || var0.field1273 == -1 || class182.method3192(var1).field3423 >= class182.method3192(var0.field1273).field3423) {
         var0.field1273 = var1;
         var0.animationChanged(-1);
         var0.field1292 = 0;
         var0.field1317 = 0;
         var0.field1294 = var2;
         var0.field1295 = 0;
         var0.field1318 = var0.field1279;
      }

   }
}
