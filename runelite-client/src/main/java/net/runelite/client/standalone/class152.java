package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
public class class152 {
   @ObfuscatedName("p")
   static byte[][][] field1452;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1086404361
   )
   int field1446;
   @ObfuscatedName("e")
   String field1451;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 2022016867
   )
   int field1453;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 50457703
   )
   int field1449;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -837425621
   )
   int field1448;

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)Ljq;",
      garbageValue = "-319482564"
   )
   public static class172 method2696(int var0) {
      class172 var1 = (class172)class172.field1612.method2268((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class172.field1624.method2579(6, var0, -825167704);
         var1 = new class172();
         var1.field1597 = var0;
         if(var2 != null) {
            var1.method2896(new Buffer(var2));
         }

         var1.method2907();
         if(var1.field1629) {
            var1.field1615 = 0;
            var1.field1608 = false;
         }

         class172.field1612.method2275(var1, (long)var0);
         return var1;
      }
   }
}
