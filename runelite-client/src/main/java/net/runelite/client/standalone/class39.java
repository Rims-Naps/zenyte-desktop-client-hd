package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cb")
public class class39 {
   @ObfuscatedName("f")
   int field293;
   @ObfuscatedName("e")
   float[][] field288;
   @ObfuscatedName("l")
   int field289;
   @ObfuscatedName("s")
   int[] field292;
   @ObfuscatedName("a")
   int[] field291;
   @ObfuscatedName("w")
   int[] field290;

   class39() {
      class101.method1693(24);
      this.field293 = class101.method1693(16);
      this.field289 = class101.method1693(24);
      this.field290 = new int[this.field289];
      boolean var1 = class101.method1694() != 0;
      int var2;
      int var3;
      int var5;
      if(var1) {
         var2 = 0;

         for(var3 = class101.method1693(5) + 1; var2 < this.field289; ++var3) {
            int var4 = class101.method1693(class12.method136(this.field289 - var2));

            for(var5 = 0; var5 < var4; ++var5) {
               this.field290[var2++] = var3;
            }
         }
      } else {
         boolean var14 = class101.method1694() != 0;

         for(var3 = 0; var3 < this.field289; ++var3) {
            if(var14 && class101.method1694() == 0) {
               this.field290[var3] = 0;
            } else {
               this.field290[var3] = class101.method1693(5) + 1;
            }
         }
      }

      this.method625();
      var2 = class101.method1693(4);
      if(var2 > 0) {
         float var15 = class101.method1711(class101.method1693(32));
         float var16 = class101.method1711(class101.method1693(32));
         var5 = class101.method1693(4) + 1;
         boolean var6 = class101.method1694() != 0;
         int var7;
         if(var2 == 1) {
            var7 = method628(this.field289, this.field293);
         } else {
            var7 = this.field289 * this.field293;
         }

         this.field292 = new int[var7];

         int var8;
         for(var8 = 0; var8 < var7; ++var8) {
            this.field292[var8] = class101.method1693(var5);
         }

         this.field288 = new float[this.field289][this.field293];
         float var9;
         int var10;
         int var11;
         if(var2 == 1) {
            for(var8 = 0; var8 < this.field289; ++var8) {
               var9 = 0.0F;
               var10 = 1;

               for(var11 = 0; var11 < this.field293; ++var11) {
                  int var12 = var8 / var10 % var7;
                  float var13 = (float)this.field292[var12] * var16 + var15 + var9;
                  this.field288[var8][var11] = var13;
                  if(var6) {
                     var9 = var13;
                  }

                  var10 *= var7;
               }
            }
         } else {
            for(var8 = 0; var8 < this.field289; ++var8) {
               var9 = 0.0F;
               var10 = var8 * this.field293;

               for(var11 = 0; var11 < this.field293; ++var11) {
                  float var17 = (float)this.field292[var10] * var16 + var15 + var9;
                  this.field288[var8][var11] = var17;
                  if(var6) {
                     var9 = var17;
                  }

                  ++var10;
               }
            }
         }
      }

   }

   @ObfuscatedName("l")
   void method625() {
      int[] var1 = new int[this.field289];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.field289; ++var3) {
         var4 = this.field290[var3];
         if(var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var12;
            if((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var12 = var2[var8];
                  if(var12 != var6) {
                     break;
                  }

                  var10 = 1 << 32 - var8;
                  if((var12 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var12 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var12 = var2[var8];
               if(var12 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.field291 = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.field289; ++var3) {
         var4 = this.field290[var3];
         if(var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if((var5 & var8) != 0) {
                  if(this.field291[var6] == 0) {
                     this.field291[var6] = var11;
                  }

                  var6 = this.field291[var6];
               } else {
                  ++var6;
               }

               if(var6 >= this.field291.length) {
                  int[] var9 = new int[this.field291.length * 2];

                  for(var10 = 0; var10 < this.field291.length; ++var10) {
                     var9[var10] = this.field291[var10];
                  }

                  this.field291 = var9;
               }

               var8 >>>= 1;
            }

            this.field291[var6] = ~var3;
            if(var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   @ObfuscatedName("s")
   float[] method627() {
      return this.field288[this.method630()];
   }

   @ObfuscatedName("w")
   int method630() {
      int var1;
      for(var1 = 0; this.field291[var1] >= 0; var1 = class101.method1694() != 0?this.field291[var1]:var1 + 1) {
         ;
      }

      return ~this.field291[var1];
   }

   @ObfuscatedName("f")
   static int method628(int var0, int var1) {
      int var2;
      for(var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1; class324.method5735(var2, var1) > var0; --var2) {
         ;
      }

      return var2;
   }
}
