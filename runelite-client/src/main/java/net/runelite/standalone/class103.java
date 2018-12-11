package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
public final class class103 {
   @ObfuscatedName("k")
   static int[] field1147;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 588085773
   )
   static int field1146;
   @ObfuscatedName("ff")
   @ObfuscatedSignature(
      signature = "Lkn;"
   )
   static class299 field1149;

   @ObfuscatedName("gl")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "-1261897990"
   )
   static final void method1855(int var0, int var1, int var2) {
      if(var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         int var3 = class314.method6140(var0, var1, class260.field3393) - var2;
         var0 -= class85.field912;
         var3 -= class229.field3068;
         var1 -= class116.field1324;
         int var4 = class211.field2920[client.field2430];
         int var5 = class211.field2914[client.field2430];
         int var6 = class211.field2920[class220.field2986];
         int var7 = class211.field2914[class220.field2986];
         int var8 = var6 * var1 + var0 * var7 >> 16;
         var1 = var7 * var1 - var0 * var6 >> 16;
         var0 = var8;
         var8 = var5 * var3 - var4 * var1 >> 16;
         var1 = var5 * var1 + var3 * var4 >> 16;
         if(var1 >= 50) {
            client.field2252 = var0 * client.field2230 / var1 + client.field2413 / 2;
            client.field2253 = client.field2359 / 2 + var8 * client.field2230 / var1;
         } else {
            client.field2252 = -1;
            client.field2253 = -1;
         }

      } else {
         client.field2252 = -1;
         client.field2253 = -1;
      }
   }

   @ObfuscatedName("hy")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1102483836"
   )
   static void method1853() {
      if(client.field2308) {
         class187 var0 = class174.method3220(class28.field281, client.field2309);
         if(var0 != null && var0.field2656 != null) {
            class194 var1 = new class194();
            var1.field2759 = var0;
            var1.field2765 = var0.field2656;
            class209.method4198(var1);
         }

         client.field2308 = false;
         class230.method4617(var0);
      }
   }

   @ObfuscatedName("hp")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-49"
   )
   static void method1854(int var0, int var1) {
      class12 var2 = class150.method2761(ClientProt.field3226, client.field2384.field1770);
      var2.field121.method2302(var0);
      var2.field121.method2292(var1);
      client.field2384.method2573(var2);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lik;IIB)[Llp;",
      garbageValue = "-26"
   )
   public static SpritePixels[] method1851(Js5Index var0, int var1, int var2) {
      byte[] var4 = var0.method4398(var1, var2, -206190060);
      boolean var3;
      if(var4 == null) {
         var3 = false;
      } else {
         class253.method5080(var4);
         var3 = true;
      }

      if(!var3) {
         return null;
      } else {
         SpritePixels[] var5 = new SpritePixels[class212.field2926];

         for(int var6 = 0; var6 < class212.field2926; ++var6) {
            SpritePixels var7 = var5[var6] = new SpritePixels();
            var7.maxWidth = class212.field2927;
            var7.maxHeight = class212.field2924;
            var7.offsetX = class42.field476[var6];
            var7.offsetY = class212.field2925[var6];
            var7.width = class212.field2922[var6];
            var7.height = class192.field2745[var6];
            int var8 = var7.width * var7.height;
            byte[] var9 = class191.field2740[var6];
            var7.pixels = new int[var8];

            for(int var10 = 0; var10 < var8; ++var10) {
               var7.pixels[var10] = class225.field3040[var9[var10] & 255];
            }
         }

         class42.field476 = null;
         class212.field2925 = null;
         class212.field2922 = null;
         class192.field2745 = null;
         class225.field3040 = null;
         class191.field2740 = null;
         return var5;
      }
   }
}
