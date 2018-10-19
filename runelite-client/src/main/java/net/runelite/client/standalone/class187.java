package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
public class class187 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;Lik;I)V",
      garbageValue = "-1255404096"
   )
   public static void method3227(class148 var0, class148 var1) {
      class222.field2173 = var0;
      class333.field3727 = var1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "117"
   )
   static void method3228() {
      Object var0 = class94.field892;
      synchronized(class94.field892) {
         if(class94.field894 == 0) {
            class94.field890 = new Thread(new class94());
            class94.field890.setDaemon(true);
            class94.field890.start();
            class94.field890.setPriority(5);
         }

         class94.field894 = 600;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;II)Z",
      garbageValue = "-1573960834"
   )
   static boolean method3229(String var0, int var1) {
      return class128.method2380(var0, var1, "openjs");
   }
}
