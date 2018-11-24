package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
public class class286 {
   @ObfuscatedName("co")
   @ObfuscatedGetter(
      intValue = -171177635
   )
   public static int field3584;
   @ObfuscatedName("gw")
   static int[][] field3582;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lq;"
   )
   static final class286 field3577;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lq;"
   )
   static final class286 field3581;
   @ObfuscatedName("da")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class6 field3576;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1116137403
   )
   final int field3578;

   static {
      field3581 = new class286(0);
      field3577 = new class286(1);
   }

   class286(int var1) {
      this.field3578 = var1;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-1973531470"
   )
   static int method5485(int var0, class296 var1, boolean var2) {
      if(var0 == 6200) {
         class308.field3811 -= 2;
         client.field2396 = (short)class177.method3676(class249.field3312[class308.field3811]);
         if(client.field2396 <= 0) {
            client.field2396 = 256;
         }

         client.field2405 = (short)class177.method3676(class249.field3312[class308.field3811 + 1]);
         if(client.field2405 <= 0) {
            client.field2405 = 256;
         }

         return 1;
      } else if(var0 == 6201) {
         class308.field3811 -= 2;
         client.field2259 = (short)class249.field3312[class308.field3811];
         if(client.field2259 <= 0) {
            client.field2259 = 256;
         }

         client.field2406 = (short)class249.field3312[class308.field3811 + 1];
         if(client.field2406 <= 0) {
            client.field2406 = 320;
         }

         return 1;
      } else if(var0 == 6202) {
         class308.field3811 -= 4;
         client.field2407 = (short)class249.field3312[class308.field3811];
         if(client.field2407 <= 0) {
            client.field2407 = 1;
         }

         client.field2408 = (short)class249.field3312[class308.field3811 + 1];
         if(client.field2408 <= 0) {
            client.field2408 = 32767;
         } else if(client.field2408 < client.field2407) {
            client.field2408 = client.field2407;
         }

         client.field2409 = (short)class249.field3312[class308.field3811 + 2];
         if(client.field2409 <= 0) {
            client.field2409 = 1;
         }

         client.field2341 = (short)class249.field3312[class308.field3811 + 3];
         if(client.field2341 <= 0) {
            client.field2341 = 32767;
         } else if(client.field2341 < client.field2409) {
            client.field2341 = client.field2409;
         }

         return 1;
      } else if(var0 == 6203) {
         if(client.field2325 != null) {
            class162.method2969(0, 0, client.field2325.field2573, client.field2325.field2574, false);
            class249.field3312[++class308.field3811 - 1] = client.field2413;
            class249.field3312[++class308.field3811 - 1] = client.field2359;
         } else {
            class249.field3312[++class308.field3811 - 1] = -1;
            class249.field3312[++class308.field3811 - 1] = -1;
         }

         return 1;
      } else if(var0 == 6204) {
         class249.field3312[++class308.field3811 - 1] = client.field2259;
         class249.field3312[++class308.field3811 - 1] = client.field2406;
         return 1;
      } else if(var0 == 6205) {
         class249.field3312[++class308.field3811 - 1] = class203.method4025(client.field2396);
         class249.field3312[++class308.field3811 - 1] = class203.method4025(client.field2405);
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("ia")
   @ObfuscatedSignature(
      signature = "(Lhw;IIZI)V",
      garbageValue = "-935605160"
   )
   static void method5486(class187 var0, int var1, int var2, boolean var3) {
      int var4 = var0.field2573;
      int var5 = var0.field2574;
      if(var0.field2565 == 0) {
         var0.field2573 = var0.field2569;
      } else if(var0.field2565 == 1) {
         var0.field2573 = var1 - var0.field2569;
      } else if(var0.field2565 == 2) {
         var0.field2573 = var0.field2569 * var1 >> 14;
      }

      if(var0.field2692 == 0) {
         var0.field2574 = var0.field2570;
      } else if(var0.field2692 == 1) {
         var0.field2574 = var2 - var0.field2570;
      } else if(var0.field2692 == 2) {
         var0.field2574 = var2 * var0.field2570 >> 14;
      }

      if(var0.field2565 == 4) {
         var0.field2573 = var0.field2574 * var0.field2575 / var0.field2563;
      }

      if(var0.field2692 == 4) {
         var0.field2574 = var0.field2573 * var0.field2563 / var0.field2575;
      }

      if(var0.field2562 == 1337) {
         client.field2325 = var0;
      }

      if(var3 && var0.field2673 != null && (var4 != var0.field2573 || var5 != var0.field2574)) {
         class194 var6 = new class194();
         var6.field2759 = var0;
         var6.field2765 = var0.field2673;
         client.field2232.method1499(var6);
      }

   }
}
