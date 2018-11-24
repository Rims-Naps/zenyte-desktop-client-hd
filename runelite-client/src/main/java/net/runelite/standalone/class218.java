package net.runelite.standalone;

import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
public class class218 {
   @ObfuscatedName("nj")
   @ObfuscatedSignature(
      signature = "[Lhw;"
   )
   static class187[] field2973;
   @ObfuscatedName("af")
   static int[] field2972;

   static {
      ImageIO.setUseCache(false);
   }

   @ObfuscatedName("ih")
   @ObfuscatedSignature(
      signature = "(IIIIII)V",
      garbageValue = "-488317947"
   )
   static final void method4496(int var0, int var1, int var2, int var3, int var4) {
      class270.field3476[0].method5980(var0, var1);
      class270.field3476[1].method5980(var0, var3 + var1 - 16);
      class173.method3167(var0, var1 + 16, 16, var3 - 32, client.field2159);
      int var5 = var3 * (var3 - 32) / var4;
      if(var5 < 8) {
         var5 = 8;
      }

      int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
      class173.method3167(var0, var6 + var1 + 16, 16, var5, client.field2217);
      class173.method3206(var0, var6 + var1 + 16, var5, client.field2219);
      class173.method3206(var0 + 1, var6 + var1 + 16, var5, client.field2219);
      class173.method3213(var0, var6 + var1 + 16, 16, client.field2219);
      class173.method3213(var0, var6 + var1 + 17, 16, client.field2219);
      class173.method3206(var0 + 15, var6 + var1 + 16, var5, client.field2285);
      class173.method3206(var0 + 14, var6 + var1 + 17, var5 - 1, client.field2285);
      class173.method3213(var0, var6 + var5 + var1 + 15, 16, client.field2285);
      class173.method3213(var0 + 1, var6 + var5 + var1 + 14, 15, client.field2285);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1168973651"
   )
   static int method4502(int var0, int var1) {
      if(var0 == -2) {
         return 12345678;
      } else if(var0 == -1) {
         if(var1 < 0) {
            var1 = 0;
         } else if(var1 > 127) {
            var1 = 127;
         }

         var1 = 127 - var1;
         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & 65408) + var1;
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1478985334"
   )
   static final void method4501() {
      class149.method2707("Your ignore list is full. Max of 100 for free users, and 400 for members");
   }

   @ObfuscatedName("ex")
   @ObfuscatedSignature(
      signature = "(I)Lla;",
      garbageValue = "-1244352842"
   )
   static class287 method4500() {
      return class199.field2812;
   }
}
