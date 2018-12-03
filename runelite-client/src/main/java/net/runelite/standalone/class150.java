package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("r")
public class class150 {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lkn;"
   )
   static class299 field1858;

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lfg;Lgy;B)Lfl;",
      garbageValue = "0"
   )
   public static class12 method2761(ClientProt var0, class216 var1) {
      class12 var2 = class236.method4711();
      var2.field127 = var0;
      var2.field120 = var0.field3257;
      if(var2.field120 == -1) {
         var2.field121 = new class1(260);
      } else if(var2.field120 == -2) {
         var2.field121 = new class1(10000);
      } else if(var2.field120 <= 18) {
         var2.field121 = new class1(20);
      } else if(var2.field120 <= 98) {
         var2.field121 = new class1(100);
      } else {
         var2.field121 = new class1(260);
      }

      var2.field121.method5(var1);
      var2.field121.method3(var2.field127.field3254);
      var2.field123 = 0;
      return var2;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-68"
   )
   static void method2760() {
      WorldMapRegion.field527.method4033();
      WorldMapRegion.field536.method4033();
   }
}
