package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
public final class class185 {
   @ObfuscatedName("k")
   static final int[] field2523;
   @ObfuscatedName("i")
   static final int[] field2526;
   @ObfuscatedName("c")
   static byte[][][] field2516;
   @ObfuscatedName("n")
   static final int[] field2511;
   @ObfuscatedName("l")
   static byte[][][] field2512;
   @ObfuscatedName("s")
   static byte[][][] field2514;
   @ObfuscatedName("f")
   static int[][][] field2522;
   @ObfuscatedName("h")
   static final int[] field2513;
   @ObfuscatedName("m")
   static int[] field2517;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -156681747
   )
   static int field2525;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lal;"
   )
   static class294 field2527;
   @ObfuscatedName("a")
   static byte[][][] field2515;
   @ObfuscatedName("o")
   static final int[] field2521;
   @ObfuscatedName("t")
   static final int[] field2518;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -723022339
   )
   static int field2524;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 249756527
   )
   static int field2519;

   static {
      field2522 = new int[4][105][105];
      field2512 = new byte[4][104][104];
      field2519 = 99;
      field2518 = new int[]{1, 2, 4, 8};
      field2511 = new int[]{16, 32, 64, 128};
      field2513 = new int[]{1, 0, -1, 0};
      field2521 = new int[]{0, -1, 0, 1};
      field2526 = new int[]{1, -1, -1, 1};
      field2523 = new int[]{-1, -1, 1, 1};
      field2524 = (int)(Math.random() * 17.0D) - 8;
      field2525 = (int)(Math.random() * 33.0D) - 16;
   }

   @ObfuscatedName("ew")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "284329522"
   )
   static void method3740(int var0, int var1) {
      int[] var2 = new int[9];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         int var4 = var3 * 32 + 15 + 128;
         int var5 = WorldMapData.method2740(var4);
         int var6 = class211.field2920[var4];
         int var8 = var1 - 334;
         if(var8 < 0) {
            var8 = 0;
         } else if(var8 > 100) {
            var8 = 100;
         }

         int var9 = (client.field2406 - client.field2259) * var8 / 100 + client.field2259;
         int var7 = var5 * var9 / 256;
         var2[var3] = var6 * var7 >> 16;
      }

      class111.method1972(var2, 500, 800, var0 * 334 / var1, 334);
   }

   @ObfuscatedName("hs")
   @ObfuscatedSignature(
      signature = "(Lbh;IIB)V",
      garbageValue = "-22"
   )
   static final void method3742(class285 var0, int var1, int var2) {
      class28.method483(var0.field3567, var0.field3574, var0.field3569, var0.field3570, var0.field3572, var0.field3572, var1, var2, (byte)102);
   }

   @ObfuscatedName("fm")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1525192535"
   )
   static final void method3733() {
      if(class49.field553 != null) {
         class49.field553.method5724();
      }

      if(class175.field2147 != null) {
         class175.field2147.method5724();
      }

   }

   @ObfuscatedName("iy")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "377376168"
   )
   static boolean method3712(int var0) {
      for(int var1 = 0; var1 < client.field2415; ++var1) {
         if(client.field2376[var1] == var0) {
            return true;
         }
      }

      return false;
   }
}
