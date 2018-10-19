package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ca")
public class class28 {
   @ObfuscatedName("f")
   int field213;
   @ObfuscatedName("c")
   int[] field219;
   @ObfuscatedName("e")
   int field216;
   @ObfuscatedName("l")
   int field217;
   @ObfuscatedName("s")
   int field214;
   @ObfuscatedName("a")
   int field218;
   @ObfuscatedName("w")
   int field215;

   class28() {
      this.field213 = class101.method1693(16);
      this.field217 = class101.method1693(24);
      this.field215 = class101.method1693(24);
      this.field214 = class101.method1693(24) + 1;
      this.field216 = class101.method1693(6) + 1;
      this.field218 = class101.method1693(8);
      int[] var1 = new int[this.field216];

      int var2;
      for(var2 = 0; var2 < this.field216; ++var2) {
         int var3 = 0;
         int var4 = class101.method1693(3);
         boolean var5 = class101.method1694() != 0;
         if(var5) {
            var3 = class101.method1693(5);
         }

         var1[var2] = var3 << 3 | var4;
      }

      this.field219 = new int[this.field216 * 8];

      for(var2 = 0; var2 < this.field216 * 8; ++var2) {
         this.field219[var2] = (var1[var2 >> 3] & 1 << (var2 & 7)) != 0?class101.method1693(8):-1;
      }

   }

   @ObfuscatedName("f")
   void method484(float[] var1, int var2, boolean var3) {
      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var1[var4] = 0.0F;
      }

      if(!var3) {
         var4 = class101.field936[this.field218].field293;
         int var5 = this.field215 - this.field217;
         int var6 = var5 / this.field214;
         int[] var7 = new int[var6];

         for(int var8 = 0; var8 < 8; ++var8) {
            int var9 = 0;

            while(var9 < var6) {
               int var10;
               int var11;
               if(var8 == 0) {
                  var10 = class101.field936[this.field218].method630();

                  for(var11 = var4 - 1; var11 >= 0; --var11) {
                     if(var9 + var11 < var6) {
                        var7[var9 + var11] = var10 % this.field216;
                     }

                     var10 /= this.field216;
                  }
               }

               for(var10 = 0; var10 < var4; ++var10) {
                  var11 = var7[var9];
                  int var12 = this.field219[var8 + var11 * 8];
                  if(var12 >= 0) {
                     int var13 = var9 * this.field214 + this.field217;
                     class39 var14 = class101.field936[var12];
                     int var15;
                     if(this.field213 == 0) {
                        var15 = this.field214 / var14.field293;

                        for(int var16 = 0; var16 < var15; ++var16) {
                           float[] var17 = var14.method627();

                           for(int var18 = 0; var18 < var14.field293; ++var18) {
                              var1[var13 + var16 + var18 * var15] += var17[var18];
                           }
                        }
                     } else {
                        var15 = 0;

                        while(var15 < this.field214) {
                           float[] var19 = var14.method627();

                           for(int var20 = 0; var20 < var14.field293; ++var20) {
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
