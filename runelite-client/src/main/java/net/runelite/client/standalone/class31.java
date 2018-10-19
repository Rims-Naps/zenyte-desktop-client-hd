package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
public final class class31 {
   @ObfuscatedName("f")
   static int[][][] field249;
   @ObfuscatedName("n")
   static final int[] field238;
   @ObfuscatedName("m")
   static int[] field244;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -723022339
   )
   static int field251;
   @ObfuscatedName("h")
   static final int[] field240;
   @ObfuscatedName("c")
   static byte[][][] field243;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lal;"
   )
   static class326 field254;
   @ObfuscatedName("t")
   static final int[] field245;
   @ObfuscatedName("l")
   static byte[][][] field239;
   @ObfuscatedName("o")
   static final int[] field248;
   @ObfuscatedName("s")
   static byte[][][] field241;
   @ObfuscatedName("a")
   static byte[][][] field242;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 249756527
   )
   static int field246;
   @ObfuscatedName("k")
   static final int[] field250;
   @ObfuscatedName("i")
   static final int[] field253;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -156681747
   )
   static int field252;

   static {
      field249 = new int[4][105][105];
      field239 = new byte[4][104][104];
      field246 = 99;
      field245 = new int[]{1, 2, 4, 8};
      field238 = new int[]{16, 32, 64, 128};
      field240 = new int[]{1, 0, -1, 0};
      field248 = new int[]{0, -1, 0, 1};
      field253 = new int[]{1, -1, -1, 1};
      field250 = new int[]{-1, -1, 1, 1};
      field251 = (int)(Math.random() * 17.0D) - 8;
      field252 = (int)(Math.random() * 33.0D) - 16;
   }

   @ObfuscatedName("fm")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1525192535"
   )
   static final void method519() {
      if(class311.field3296 != null) {
         class311.field3296.method646();
      }

      if(class153.field1468 != null) {
         class153.field1468.method646();
      }

   }

   @ObfuscatedName("hs")
   @ObfuscatedSignature(
      signature = "(Lbh;IIB)V",
      garbageValue = "-22"
   )
   static final void method528(class152 var0, int var1, int var2) {
      class98.method1686(var0.field1446, var0.field1453, var0.field1448, var0.field1449, var0.field1451, var0.field1451, var1, var2, (byte)102);
   }

   @ObfuscatedName("ew")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "284329522"
   )
   static void method526(int var0, int var1) {
      int[] var2 = new int[9];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         int var4 = var3 * 32 + 15 + 128;
         int var5 = class87.method1308(var4);
         int var6 = class257.field2564[var4];
         int var8 = var1 - 334;
         if(var8 < 0) {
            var8 = 0;
         } else if(var8 > 100) {
            var8 = 100;
         }

         int var9 = (client.field3985 - client.field3838) * var8 / 100 + client.field3838;
         int var7 = var5 * var9 / 256;
         var2[var3] = var6 * var7 >> 16;
      }

      class312.method5378(var2, 500, 800, var0 * 334 / var1, 334);
   }

   @ObfuscatedName("iy")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "377376168"
   )
   static boolean method498(int var0) {
      for(int var1 = 0; var1 < client.field3994; ++var1) {
         if(client.field3955[var1] == var0) {
            return true;
         }
      }

      return false;
   }
}
