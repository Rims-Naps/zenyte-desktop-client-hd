package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
public class class47 {
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1802856519
   )
   public static int field359;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Lic;",
      garbageValue = "277868076"
   )
   public static class244 method815(int var0) {
      class244 var1 = (class244)class244.field2436.method2268((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class244.field2435.method2579(19, var0, 348531754);
         var1 = new class244();
         if(var2 != null) {
            var1.method4473(new Buffer(var2));
         }

         class244.field2436.method2275(var1, (long)var0);
         return var1;
      }
   }
}
