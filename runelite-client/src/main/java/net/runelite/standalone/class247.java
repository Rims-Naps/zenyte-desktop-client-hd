package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
public class class247 {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "117"
   )
   static void method4957() {
      Object var0 = class325.field3948;
      synchronized(class325.field3948) {
         if(class325.field3950 == 0) {
            class325.field3946 = new Thread(new class325());
            class325.field3946.setDaemon(true);
            class325.field3946.start();
            class325.field3946.setPriority(5);
         }

         class325.field3950 = 600;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;II)Z",
      garbageValue = "-1573960834"
   )
   static boolean method4958(String var0, int var1) {
      return class95.method1748(var0, var1, "openjs");
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;Lik;I)V",
      garbageValue = "-1255404096"
   )
   public static void method4956(class217 var0, class217 var1) {
      class315.field3891 = var0;
      class323.field3940 = var1;
   }
}
