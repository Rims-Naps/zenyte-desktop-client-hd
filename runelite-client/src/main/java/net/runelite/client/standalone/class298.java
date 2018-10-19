package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public final class class298 {
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1688210203
   )
   int field3204;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1771746201
   )
   int field3205;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1936626895
   )
   int field3199;
   @ObfuscatedName("e")
   int[] field3206;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -702208999
   )
   int field3202;
   @ObfuscatedName("a")
   int[] field3203;

   public class298(int[] var1) {
      this.field3203 = new int[256];
      this.field3206 = new int[256];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.field3206[var2] = var1[var2];
      }

      this.method5180();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "16"
   )
   final int method5179() {
      if(0 == --this.field3202 + 1) {
         this.method5181();
         this.field3202 = 255;
      }

      return this.field3206[this.field3202];
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "1"
   )
   final int method5178() {
      if(this.field3202 == 0) {
         this.method5181();
         this.field3202 = 256;
      }

      return this.field3206[this.field3202 - 1];
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-279948349"
   )
   final void method5180() {
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
         var2 += this.field3206[var1];
         var3 += this.field3206[var1 + 1];
         var4 += this.field3206[var1 + 2];
         var5 += this.field3206[var1 + 3];
         var6 += this.field3206[var1 + 4];
         var7 += this.field3206[var1 + 5];
         var8 += this.field3206[var1 + 6];
         var9 += this.field3206[var1 + 7];
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
         this.field3203[var1] = var2;
         this.field3203[var1 + 1] = var3;
         this.field3203[var1 + 2] = var4;
         this.field3203[var1 + 3] = var5;
         this.field3203[var1 + 4] = var6;
         this.field3203[var1 + 5] = var7;
         this.field3203[var1 + 6] = var8;
         this.field3203[var1 + 7] = var9;
      }

      for(var1 = 0; var1 < 256; var1 += 8) {
         var2 += this.field3203[var1];
         var3 += this.field3203[var1 + 1];
         var4 += this.field3203[var1 + 2];
         var5 += this.field3203[var1 + 3];
         var6 += this.field3203[var1 + 4];
         var7 += this.field3203[var1 + 5];
         var8 += this.field3203[var1 + 6];
         var9 += this.field3203[var1 + 7];
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
         this.field3203[var1] = var2;
         this.field3203[var1 + 1] = var3;
         this.field3203[var1 + 2] = var4;
         this.field3203[var1 + 3] = var5;
         this.field3203[var1 + 4] = var6;
         this.field3203[var1 + 5] = var7;
         this.field3203[var1 + 6] = var8;
         this.field3203[var1 + 7] = var9;
      }

      this.method5181();
      this.field3202 = 256;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "383565077"
   )
   final void method5181() {
      this.field3205 += ++this.field3204;

      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = this.field3203[var1];
         if((var1 & 2) == 0) {
            if((var1 & 1) == 0) {
               this.field3199 ^= this.field3199 << 13;
            } else {
               this.field3199 ^= this.field3199 >>> 6;
            }
         } else if((var1 & 1) == 0) {
            this.field3199 ^= this.field3199 << 2;
         } else {
            this.field3199 ^= this.field3199 >>> 16;
         }

         this.field3199 += this.field3203[var1 + 128 & 255];
         int var3;
         this.field3203[var1] = var3 = this.field3203[(var2 & 1020) >> 2] + this.field3205 + this.field3199;
         this.field3206[var1] = this.field3205 = this.field3203[(var3 >> 8 & 1020) >> 2] + var2;
      }

   }

   @ObfuscatedName("kc")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1628096909"
   )
   static String method5189(String var0) {
      class253[] var1 = class123.method2266();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class253 var3 = var1[var2];
         if(var3.field2506 != -1 && var0.startsWith(class67.method1147(var3.field2506))) {
            var0 = var0.substring(6 + Integer.toString(var3.field2506).length());
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
   static final void method5184(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      if(var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         class31.field239[var1][var2][var3] = 0;

         while(true) {
            var7 = var0.readUnsignedByte();
            if(var7 == 0) {
               if(var1 == 0) {
                  int[] var8 = class31.field249[0][var2];
                  int var11 = var2 + var4 + 932731;
                  int var12 = var3 + var5 + 556238;
                  int var13 = class67.method1148(45365 + var11, 91923 + var12, 4) - 128 + (class67.method1148(var11 + 10294, var12 + 37821, 2) - 128 >> 1) + (class67.method1148(var11, var12, 1) - 128 >> 2);
                  var13 = (int)(0.3D * (double)var13) + 35;
                  if(var13 < 10) {
                     var13 = 10;
                  } else if(var13 > 60) {
                     var13 = 60;
                  }

                  var8[var3] = -var13 * 8;
               } else {
                  class31.field249[var1][var2][var3] = class31.field249[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if(var7 == 1) {
               int var14 = var0.readUnsignedByte();
               if(var14 == 1) {
                  var14 = 0;
               }

               if(var1 == 0) {
                  class31.field249[0][var2][var3] = -var14 * 8;
               } else {
                  class31.field249[var1][var2][var3] = class31.field249[var1 - 1][var2][var3] - var14 * 8;
               }
               break;
            }

            if(var7 <= 49) {
               class102.field961[var1][var2][var3] = var0.method1906();
               class31.field242[var1][var2][var3] = (byte)((var7 - 2) / 4);
               class31.field243[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
            } else if(var7 <= 81) {
               class31.field239[var1][var2][var3] = (byte)(var7 - 49);
            } else {
               class31.field241[var1][var2][var3] = (byte)(var7 - 81);
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

   @ObfuscatedName("ib")
   @ObfuscatedSignature(
      signature = "([Lhw;IIIZB)V",
      garbageValue = "101"
   )
   static void method5182(class329[] var0, int var1, int var2, int var3, boolean var4) {
      for(int var5 = 0; var5 < var0.length; ++var5) {
         class329 var6 = var0[var5];
         if(var6 != null && var6.field3563 == var1) {
            class77.method1190(var6, var2, var3, var4);
            class256.method4564(var6, var2, var3);
            if(var6.field3565 > var6.field3567 - var6.field3559) {
               var6.field3565 = var6.field3567 - var6.field3559;
            }

            if(var6.field3565 < 0) {
               var6.field3565 = 0;
            }

            if(var6.field3566 > var6.field3568 - var6.field3560) {
               var6.field3566 = var6.field3568 - var6.field3560;
            }

            if(var6.field3566 < 0) {
               var6.field3566 = 0;
            }

            if(var6.field3546 == 0) {
               class130.method2395(var0, var6, var4);
            }
         }
      }

   }
}
