package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
public class class73 {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IB)Liq;",
      garbageValue = "-115"
   )
   public static class307 method1177(int var0) {
      class307 var1 = (class307)class307.field3277.method2268((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class307.field3276.method2579(5, var0, -112076642);
         var1 = new class307();
         if(var2 != null) {
            var1.method5278(new Buffer(var2));
         }

         class307.field3277.method2275(var1, (long)var0);
         return var1;
      }
   }
}
