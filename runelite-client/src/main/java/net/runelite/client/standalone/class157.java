package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
public class class157 {
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 969829275
   )
   static int field1494;
   @ObfuscatedName("dh")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class108 field1497;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 793477097
   )
   int field1490;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 616968121
   )
   int field1495;
   @ObfuscatedName("a")
   int[][] field1496;

   public class157(int var1, int var2) {
      if(var2 != var1) {
         int var3 = class136.method2513(var1, var2);
         var1 /= var3;
         var2 /= var3;
         this.field1495 = var1;
         this.field1490 = var2;
         this.field1496 = new int[var1][14];

         for(int var4 = 0; var4 < var1; ++var4) {
            int[] var5 = this.field1496[var4];
            double var6 = (double)var4 / (double)var1 + 6.0D;
            int var8 = (int)Math.floor(1.0D + (var6 - 7.0D));
            if(var8 < 0) {
               var8 = 0;
            }

            int var9 = (int)Math.ceil(7.0D + var6);
            if(var9 > 14) {
               var9 = 14;
            }

            for(double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) {
               double var12 = 3.141592653589793D * ((double)var8 - var6);
               double var14 = var10;
               if(var12 < -1.0E-4D || var12 > 1.0E-4D) {
                  var14 = var10 * (Math.sin(var12) / var12);
               }

               var14 *= 0.54D + 0.46D * Math.cos(((double)var8 - var6) * 0.2243994752564138D);
               var5[var8] = (int)Math.floor(var14 * 65536.0D + 0.5D);
            }
         }

      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([BB)[B",
      garbageValue = "-63"
   )
   byte[] method2743(byte[] var1) {
      if(this.field1496 != null) {
         int var2 = (int)((long)this.field1490 * (long)var1.length / (long)this.field1495) + 14;
         int[] var3 = new int[var2];
         int var4 = 0;
         int var5 = 0;

         int var6;
         for(var6 = 0; var6 < var1.length; ++var6) {
            byte var7 = var1[var6];
            int[] var8 = this.field1496[var5];

            int var9;
            for(var9 = 0; var9 < 14; ++var9) {
               var3[var9 + var4] += var7 * var8[var9];
            }

            var5 += this.field1490;
            var9 = var5 / this.field1495;
            var4 += var9;
            var5 -= var9 * this.field1495;
         }

         var1 = new byte[var2];

         for(var6 = 0; var6 < var2; ++var6) {
            int var10 = var3[var6] + 32768 >> 16;
            if(var10 < -128) {
               var1[var6] = -128;
            } else if(var10 > 127) {
               var1[var6] = 127;
            } else {
               var1[var6] = (byte)var10;
            }
         }
      }

      return var1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "627318930"
   )
   int method2745(int var1) {
      if(this.field1496 != null) {
         var1 = (int)((long)var1 * (long)this.field1490 / (long)this.field1495);
      }

      return var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "5"
   )
   int method2744(int var1) {
      if(this.field1496 != null) {
         var1 = (int)((long)this.field1490 * (long)var1 / (long)this.field1495) + 6;
      }

      return var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1787486325"
   )
   static void method2748() {
      if(class325.field3480 == null || class325.field3480.length() <= 0) {
         if(class153.field1455.field1860 != null) {
            class325.field3480 = class153.field1455.field1860;
            client.onUsernameChanged(-1);
            client.field3771 = true;
         } else {
            client.field3771 = false;
         }

      }
   }
}
