package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
public class class183 {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IB)Liq;",
      garbageValue = "-115"
   )
   public static class101 method3708(int var0) {
      class101 var1 = (class101)class101.field1139.method1813((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class101.field1138.method4398(5, var0, -112076642);
         var1 = new class101();
         if(var2 != null) {
            var1.method1831(new class125(var2));
         }

         class101.field1139.method1820(var1, (long)var0);
         return var1;
      }
   }
}
