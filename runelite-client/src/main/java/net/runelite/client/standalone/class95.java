package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("r")
public class class95 {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lkn;"
   )
   static class277 field900;

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lfg;Lgy;B)Lfl;",
      garbageValue = "0"
   )
   public static class279 writeClientProt(ClientProt var0, class298 var1) {
      class279 var2 = class57.method1017();
      var2.field3024 = var0;
      var2.field3017 = var0.field572;
      if(var2.field3017 == -1) {
         var2.field3018 = new class214(260);
      } else if(var2.field3017 == -2) {
         var2.field3018 = new class214(10000);
      } else if(var2.field3017 <= 18) {
         var2.field3018 = new class214(20);
      } else if(var2.field3017 <= 98) {
         var2.field3018 = new class214(100);
      } else {
         var2.field3018 = new class214(260);
      }

      var2.field3018.method3758(var1);
      var2.field3018.method3756(var2.field3024.field569);
      var2.field3020 = 0;
      return var2;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-68"
   )
   static void method1661() {
      class261.field2890.method2138();
      class261.field2899.method2138();
   }
}
