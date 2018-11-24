package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cb")
public class class200 {
   @ObfuscatedName("l")
   int field2831;
   @ObfuscatedName("s")
   int[] field2834;
   @ObfuscatedName("f")
   int field2835;
   @ObfuscatedName("a")
   int[] field2833;
   @ObfuscatedName("e")
   float[][] field2830;
   @ObfuscatedName("w")
   int[] field2832;

   class200() {
      class157.method2842(24);
      this.field2835 = class157.method2842(16);
      this.field2831 = class157.method2842(24);
      this.field2832 = new int[this.field2831];
      boolean var1 = class157.method2843() != 0;
      int var2;
      int var3;
      int var5;
      if(var1) {
         var2 = 0;

         for(var3 = class157.method2842(5) + 1; var2 < this.field2831; ++var3) {
            int var4 = class157.method2842(class162.method2968(this.field2831 - var2));

            for(var5 = 0; var5 < var4; ++var5) {
               this.field2832[var2++] = var3;
            }
         }
      } else {
         boolean var14 = class157.method2843() != 0;

         for(var3 = 0; var3 < this.field2831; ++var3) {
            if(var14 && class157.method2843() == 0) {
               this.field2832[var3] = 0;
            } else {
               this.field2832[var3] = class157.method2842(5) + 1;
            }
         }
      }

      this.method3998();
      var2 = class157.method2842(4);
      if(var2 > 0) {
         float var15 = class157.method2860(class157.method2842(32));
         float var16 = class157.method2860(class157.method2842(32));
         var5 = class157.method2842(4) + 1;
         boolean var6 = class157.method2843() != 0;
         int var7;
         if(var2 == 1) {
            var7 = method4001(this.field2831, this.field2835);
         } else {
            var7 = this.field2831 * this.field2835;
         }

         this.field2834 = new int[var7];

         int var8;
         for(var8 = 0; var8 < var7; ++var8) {
            this.field2834[var8] = class157.method2842(var5);
         }

         this.field2830 = new float[this.field2831][this.field2835];
         float var9;
         int var10;
         int var11;
         if(var2 == 1) {
            for(var8 = 0; var8 < this.field2831; ++var8) {
               var9 = 0.0F;
               var10 = 1;

               for(var11 = 0; var11 < this.field2835; ++var11) {
                  int var12 = var8 / var10 % var7;
                  float var13 = (float)this.field2834[var12] * var16 + var15 + var9;
                  this.field2830[var8][var11] = var13;
                  if(var6) {
                     var9 = var13;
                  }

                  var10 *= var7;
               }
            }
         } else {
            for(var8 = 0; var8 < this.field2831; ++var8) {
               var9 = 0.0F;
               var10 = var8 * this.field2835;

               for(var11 = 0; var11 < this.field2835; ++var11) {
                  float var17 = (float)this.field2834[var10] * var16 + var15 + var9;
                  this.field2830[var8][var11] = var17;
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
   void method3998() {
      int[] var1 = new int[this.field2831];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.field2831; ++var3) {
         var4 = this.field2832[var3];
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

      this.field2833 = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.field2831; ++var3) {
         var4 = this.field2832[var3];
         if(var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if((var5 & var8) != 0) {
                  if(this.field2833[var6] == 0) {
                     this.field2833[var6] = var11;
                  }

                  var6 = this.field2833[var6];
               } else {
                  ++var6;
               }

               if(var6 >= this.field2833.length) {
                  int[] var9 = new int[this.field2833.length * 2];

                  for(var10 = 0; var10 < this.field2833.length; ++var10) {
                     var9[var10] = this.field2833[var10];
                  }

                  this.field2833 = var9;
               }

               var8 >>>= 1;
            }

            this.field2833[var6] = ~var3;
            if(var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   @ObfuscatedName("s")
   float[] method4000() {
      return this.field2830[this.method4003()];
   }

   @ObfuscatedName("w")
   int method4003() {
      int var1;
      for(var1 = 0; this.field2833[var1] >= 0; var1 = class157.method2843() != 0?this.field2833[var1]:var1 + 1) {
         ;
      }

      return ~this.field2833[var1];
   }

   @ObfuscatedName("f")
   static int method4001(int var0, int var1) {
      int var2;
      for(var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1; class132.method2532(var2, var1) > var0; --var2) {
         ;
      }

      return var2;
   }
}
