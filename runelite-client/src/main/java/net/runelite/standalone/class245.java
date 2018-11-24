package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ca")
public class class245 {
   @ObfuscatedName("c")
   int[] field3296;
   @ObfuscatedName("l")
   int field3294;
   @ObfuscatedName("s")
   int field3291;
   @ObfuscatedName("f")
   int field3290;
   @ObfuscatedName("a")
   int field3295;
   @ObfuscatedName("e")
   int field3293;
   @ObfuscatedName("w")
   int field3292;

   class245() {
      this.field3290 = class157.method2842(16);
      this.field3294 = class157.method2842(24);
      this.field3292 = class157.method2842(24);
      this.field3291 = class157.method2842(24) + 1;
      this.field3293 = class157.method2842(6) + 1;
      this.field3295 = class157.method2842(8);
      int[] var1 = new int[this.field3293];

      int var2;
      for(var2 = 0; var2 < this.field3293; ++var2) {
         int var3 = 0;
         int var4 = class157.method2842(3);
         boolean var5 = class157.method2843() != 0;
         if(var5) {
            var3 = class157.method2842(5);
         }

         var1[var2] = var3 << 3 | var4;
      }

      this.field3296 = new int[this.field3293 * 8];

      for(var2 = 0; var2 < this.field3293 * 8; ++var2) {
         this.field3296[var2] = (var1[var2 >> 3] & 1 << (var2 & 7)) != 0?class157.method2842(8):-1;
      }

   }

   @ObfuscatedName("f")
   void method4950(float[] var1, int var2, boolean var3) {
      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var1[var4] = 0.0F;
      }

      if(!var3) {
         var4 = class157.field1918[this.field3295].field2835;
         int var5 = this.field3292 - this.field3294;
         int var6 = var5 / this.field3291;
         int[] var7 = new int[var6];

         for(int var8 = 0; var8 < 8; ++var8) {
            int var9 = 0;

            while(var9 < var6) {
               int var10;
               int var11;
               if(var8 == 0) {
                  var10 = class157.field1918[this.field3295].method4003();

                  for(var11 = var4 - 1; var11 >= 0; --var11) {
                     if(var9 + var11 < var6) {
                        var7[var9 + var11] = var10 % this.field3293;
                     }

                     var10 /= this.field3293;
                  }
               }

               for(var10 = 0; var10 < var4; ++var10) {
                  var11 = var7[var9];
                  int var12 = this.field3296[var8 + var11 * 8];
                  if(var12 >= 0) {
                     int var13 = var9 * this.field3291 + this.field3294;
                     class200 var14 = class157.field1918[var12];
                     int var15;
                     if(this.field3290 == 0) {
                        var15 = this.field3291 / var14.field2835;

                        for(int var16 = 0; var16 < var15; ++var16) {
                           float[] var17 = var14.method4000();

                           for(int var18 = 0; var18 < var14.field2835; ++var18) {
                              var1[var13 + var16 + var18 * var15] += var17[var18];
                           }
                        }
                     } else {
                        var15 = 0;

                        while(var15 < this.field3291) {
                           float[] var19 = var14.method4000();

                           for(int var20 = 0; var20 < var14.field2835; ++var20) {
                              var1[var13 + var15] += var19[var20];
                              ++var15;
                           }
                        }
                     }
                  }

                  ++var9;
                  if(var9 >= var6) {
                     break;
                  }
               }
            }
         }

      }
   }
}
