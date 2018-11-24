package net.runelite.standalone;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
final class class147 implements Comparator {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lw;Lw;S)I",
      garbageValue = "5523"
   )
   int method2670(class317 var1, class317 var2) {
      return var1.field3900 < var2.field3900?-1:(var2.field3900 == var1.field3900?0:1);
   }

   public int compare(Object var1, Object var2) {
      return this.method2670((class317)var1, (class317)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("fw")
   @ObfuscatedSignature(
      signature = "(Lbw;III)V",
      garbageValue = "-1389655789"
   )
   static void method2675(class199 var0, int var1, int var2) {
      if(var0.field1086 == var1 && var1 != -1) {
         int var3 = class3.method74(var1).field3830;
         if(var3 == 1) {
            var0.field1105 = 0;
            var0.field1130 = 0;
            var0.field1107 = var2;
            var0.field1108 = 0;
         }

         if(var3 == 2) {
            var0.field1108 = 0;
         }
      } else if(var1 == -1 || var0.field1086 == -1 || class3.method74(var1).field3841 >= class3.method74(var0.field1086).field3841) {
         var0.field1086 = var1;
         var0.animationChanged(-1);
         var0.field1105 = 0;
         var0.field1130 = 0;
         var0.field1107 = var2;
         var0.field1108 = 0;
         var0.field1131 = var0.field1092;
      }

   }
}
