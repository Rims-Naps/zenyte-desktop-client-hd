package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
public class class167 {
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1802856519
   )
   public static int field2010;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Lic;",
      garbageValue = "277868076"
   )
   public static class25 method3025(int var0) {
      class25 var1 = (class25)class25.field264.method1813((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class25.field263.method4398(19, var0, 348531754);
         var1 = new class25();
         if(var2 != null) {
            var1.method452(new class125(var2));
         }

         class25.field264.method1820(var1, (long)var0);
         return var1;
      }
   }
}
