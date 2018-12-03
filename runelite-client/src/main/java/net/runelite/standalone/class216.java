package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public final class class216 {
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1771746201
   )
   int field2950;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1936626895
   )
   int field2944;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -702208999
   )
   int field2947;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1688210203
   )
   int field2949;
   @ObfuscatedName("a")
   int[] field2948;
   @ObfuscatedName("e")
   int[] field2951;

   public class216(int[] var1) {
      this.field2948 = new int[256];
      this.field2951 = new int[256];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.field2951[var2] = var1[var2];
      }

      this.method4385();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "1"
   )
   final int method4383() {
      if(this.field2947 == 0) {
         this.method4386();
         this.field2947 = 256;
      }

      return this.field2951[this.field2947 - 1];
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-279948349"
   )
   final void method4385() {
      int var9 = -1640531527;
      int var8 = -1640531527;
      int var7 = -1640531527;
      int var6 = -1640531527;
      int var5 = -1640531527;
      int var4 = -1640531527;
      int var3 = -1640531527;
      int var2 = -1640531527;

      int var1;
      for(var1 = 0; var1 < 4; ++var1) {
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
      }

      for(var1 = 0; var1 < 256; var1 += 8) {
         var2 += this.field2951[var1];
         var3 += this.field2951[var1 + 1];
         var4 += this.field2951[var1 + 2];
         var5 += this.field2951[var1 + 3];
         var6 += this.field2951[var1 + 4];
         var7 += this.field2951[var1 + 5];
         var8 += this.field2951[var1 + 6];
         var9 += this.field2951[var1 + 7];
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
         this.field2948[var1] = var2;
         this.field2948[var1 + 1] = var3;
         this.field2948[var1 + 2] = var4;
         this.field2948[var1 + 3] = var5;
         this.field2948[var1 + 4] = var6;
         this.field2948[var1 + 5] = var7;
         this.field2948[var1 + 6] = var8;
         this.field2948[var1 + 7] = var9;
      }

      for(var1 = 0; var1 < 256; var1 += 8) {
         var2 += this.field2948[var1];
         var3 += this.field2948[var1 + 1];
         var4 += this.field2948[var1 + 2];
         var5 += this.field2948[var1 + 3];
         var6 += this.field2948[var1 + 4];
         var7 += this.field2948[var1 + 5];
         var8 += this.field2948[var1 + 6];
         var9 += this.field2948[var1 + 7];
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
         this.field2948[var1] = var2;
         this.field2948[var1 + 1] = var3;
         this.field2948[var1 + 2] = var4;
         this.field2948[var1 + 3] = var5;
         this.field2948[var1 + 4] = var6;
         this.field2948[var1 + 5] = var7;
         this.field2948[var1 + 6] = var8;
         this.field2948[var1 + 7] = var9;
      }

      this.method4386();
      this.field2947 = 256;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "16"
   )
   final int method4384() {
      if(0 == --this.field2947 + 1) {
         this.method4386();
         this.field2947 = 255;
      }

      return this.field2951[this.field2947];
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "383565077"
   )
   final void method4386() {
      this.field2950 += ++this.field2949;

      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = this.field2948[var1];
         if((var1 & 2) == 0) {
            if((var1 & 1) == 0) {
               this.field2944 ^= this.field2944 << 13;
            } else {
               this.field2944 ^= this.field2944 >>> 6;
            }
         } else if((var1 & 1) == 0) {
            this.field2944 ^= this.field2944 << 2;
         } else {
            this.field2944 ^= this.field2944 >>> 16;
         }

         this.field2944 += this.field2948[var1 + 128 & 255];
         int var3;
         this.field2948[var1] = var3 = this.field2948[(var2 & 1020) >> 2] + this.field2950 + this.field2944;
         this.field2951[var1] = this.field2950 = this.field2948[(var3 >> 8 & 1020) >> 2] + var2;
      }

   }

   @ObfuscatedName("ib")
   @ObfuscatedSignature(
      signature = "([Lhw;IIIZB)V",
      garbageValue = "101"
   )
   static void method4387(class187[] var0, int var1, int var2, int var3, boolean var4) {
      for(int var5 = 0; var5 < var0.length; ++var5) {
         class187 var6 = var0[var5];
         if(var6 != null && var6.field2577 == var1) {
            class286.method5486(var6, var2, var3, var4);
            class155.method2830(var6, var2, var3);
            if(var6.field2579 > var6.field2581 - var6.field2573) {
               var6.field2579 = var6.field2581 - var6.field2573;
            }

            if(var6.field2579 < 0) {
               var6.field2579 = 0;
            }

            if(var6.field2580 > var6.field2582 - var6.field2574) {
               var6.field2580 = var6.field2582 - var6.field2574;
            }

            if(var6.field2580 < 0) {
               var6.field2580 = 0;
            }

            if(var6.field2560 == 0) {
               class79.method1593(var0, var6, var4);
            }
         }
      }

   }

   @ObfuscatedName("kc")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1628096909"
   )
   static String method4394(String var0) {
      class222[] var1 = class198.method3946();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class222 var3 = var1[var2];
         if(var3.field2992 != -1 && var0.startsWith(class164.method3009(var3.field2992))) {
            var0 = var0.substring(6 + Integer.toString(var3.field2992).length());
            break;
         }
      }

      return var0;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Lgm;IIIIIIB)V",
      garbageValue = "-16"
   )
   static final void method4389(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      if(var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         class185.field2512[var1][var2][var3] = 0;

         while(true) {
            var7 = var0.readUnsignedByte();
            if(var7 == 0) {
               if(var1 == 0) {
                  int[] var8 = class185.field2522[0][var2];
                  int var11 = var2 + var4 + 932731;
                  int var12 = var3 + var5 + 556238;
                  int var13 = class164.method3010(45365 + var11, 91923 + var12, 4) - 128 + (class164.method3010(var11 + 10294, var12 + 37821, 2) - 128 >> 1) + (class164.method3010(var11, var12, 1) - 128 >> 2);
                  var13 = (int)(0.3D * (double)var13) + 35;
                  if(var13 < 10) {
                     var13 = 10;
                  } else if(var13 > 60) {
                     var13 = 60;
                  }

                  var8[var3] = -var13 * 8;
               } else {
                  class185.field2522[var1][var2][var3] = class185.field2522[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if(var7 == 1) {
               int var14 = var0.readUnsignedByte();
               if(var14 == 1) {
                  var14 = 0;
               }

               if(var1 == 0) {
                  class185.field2522[0][var2][var3] = -var14 * 8;
               } else {
                  class185.field2522[var1][var2][var3] = class185.field2522[var1 - 1][var2][var3] - var14 * 8;
               }
               break;
            }

            if(var7 <= 49) {
               class210.field2891[var1][var2][var3] = var0.method2257();
               class185.field2515[var1][var2][var3] = (byte)((var7 - 2) / 4);
               class185.field2516[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
            } else if(var7 <= 81) {
               class185.field2512[var1][var2][var3] = (byte)(var7 - 49);
            } else {
               class185.field2514[var1][var2][var3] = (byte)(var7 - 81);
            }
         }
      } else {
         while(true) {
            var7 = var0.readUnsignedByte();
            if(var7 == 0) {
               break;
            }

            if(var7 == 1) {
               var0.readUnsignedByte();
               break;
            }

            if(var7 <= 49) {
               var0.readUnsignedByte();
            }
         }
      }

   }
}
