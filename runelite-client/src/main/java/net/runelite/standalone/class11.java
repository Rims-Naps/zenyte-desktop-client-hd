package net.runelite.standalone;

import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
public class class11 {
   @ObfuscatedName("k")
   static int[] field118;
   @ObfuscatedName("i")
   static int[] field94;
   @ObfuscatedName("n")
   static int[] field109;
   @ObfuscatedName("u")
   static int[] field111;
   @ObfuscatedName("y")
   static int[] field97;
   @ObfuscatedName("o")
   static int[] field115;
   @ObfuscatedName("t")
   static int[] field117;
   @ObfuscatedName("q")
   static int[] field116;
   @ObfuscatedName("j")
   int field113;
   @ObfuscatedName("z")
   int field105;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lcl;"
   )
   class46 field101;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lcl;"
   )
   class46 field100;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lcl;"
   )
   class46 field95;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lcl;"
   )
   class46 field112;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lcl;"
   )
   class46 field107;
   @ObfuscatedName("r")
   int[] field102;
   @ObfuscatedName("m")
   int[] field103;
   @ObfuscatedName("b")
   int field110;
   @ObfuscatedName("x")
   int field106;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Ldd;"
   )
   class27 field108;
   @ObfuscatedName("d")
   int[] field104;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lcl;"
   )
   class46 field99;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lcl;"
   )
   class46 field119;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lcl;"
   )
   class46 field98;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lcl;"
   )
   class46 field96;

   static {
      field117 = new int['耀'];
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < 32768; ++var1) {
         field117[var1] = (var0.nextInt() & 2) - 1;
      }

      field109 = new int['耀'];

      for(var1 = 0; var1 < 32768; ++var1) {
         field109[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
      }

      field111 = new int[220500];
      field115 = new int[5];
      field94 = new int[5];
      field118 = new int[5];
      field116 = new int[5];
      field97 = new int[5];
   }

   class11() {
      this.field102 = new int[]{0, 0, 0, 0, 0};
      this.field103 = new int[]{0, 0, 0, 0, 0};
      this.field104 = new int[]{0, 0, 0, 0, 0};
      this.field105 = 0;
      this.field106 = 100;
      this.field113 = 500;
      this.field110 = 0;
   }

   @ObfuscatedName("l")
   final int method180(int var1, int var2, int var3) {
      return var3 == 1?((var1 & 32767) < 16384?var2:-var2):(var3 == 2?field109[var1 & 32767] * var2 >> 14:(var3 == 3?(var2 * (var1 & 32767) >> 14) - var2:(var3 == 4?var2 * field117[var1 / 2607 & 32767]:0)));
   }

   @ObfuscatedName("f")
   final int[] method179(int var1, int var2) {
      class29.method495(field111, 0, var1);
      if(var2 < 10) {
         return field111;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.field107.method887();
         this.field95.method887();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if(this.field96 != null) {
            this.field96.method887();
            this.field112.method887();
            var5 = (int)((double)(this.field96.field514 - this.field96.field513) * 32.768D / var3);
            var6 = (int)((double)this.field96.field513 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if(this.field98 != null) {
            this.field98.method887();
            this.field99.method887();
            var8 = (int)((double)(this.field98.field514 - this.field98.field513) * 32.768D / var3);
            var9 = (int)((double)this.field98.field513 * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if(this.field102[var11] != 0) {
               field115[var11] = 0;
               field94[var11] = (int)((double)this.field104[var11] * var3);
               field118[var11] = (this.field102[var11] << 14) / 100;
               field116[var11] = (int)((double)(this.field107.field514 - this.field107.field513) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field103[var11]) / var3);
               field97[var11] = (int)((double)this.field107.field513 * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.field107.method882(var1);
            var13 = this.field95.method882(var1);
            if(this.field96 != null) {
               var14 = this.field96.method882(var1);
               var15 = this.field112.method882(var1);
               var12 += this.method180(var7, var15, this.field96.field510) >> 1;
               var7 = var7 + var6 + (var14 * var5 >> 16);
            }

            if(this.field98 != null) {
               var14 = this.field98.method882(var1);
               var15 = this.field99.method882(var1);
               var13 = var13 * ((this.method180(var10, var15, this.field98.field510) >> 1) + 32768) >> 15;
               var10 = var10 + var9 + (var14 * var8 >> 16);
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if(this.field102[var14] != 0) {
                  var15 = field94[var14] + var11;
                  if(var15 < var1) {
                     field111[var15] += this.method180(field115[var14], var13 * field118[var14] >> 15, this.field107.field510);
                     field115[var14] += (var12 * field116[var14] >> 16) + field97[var14];
                  }
               }
            }
         }

         int var16;
         if(this.field100 != null) {
            this.field100.method887();
            this.field101.method887();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.field100.method882(var1);
               var16 = this.field101.method882(var1);
               if(var20) {
                  var12 = (var15 * (this.field100.field514 - this.field100.field513) >> 8) + this.field100.field513;
               } else {
                  var12 = (var16 * (this.field100.field514 - this.field100.field513) >> 8) + this.field100.field513;
               }

               var11 += 256;
               if(var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if(var20) {
                  field111[var14] = 0;
               }
            }
         }

         if(this.field105 > 0 && this.field106 > 0) {
            var11 = (int)((double)this.field105 * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               field111[var12] += field111[var12 - var11] * this.field106 / 100;
            }
         }

         if(this.field108.field274[0] > 0 || this.field108.field274[1] > 0) {
            this.field119.method887();
            var11 = this.field119.method882(var1 + 1);
            var12 = this.field108.method480(0, (float)var11 / 65536.0F);
            var13 = this.field108.method480(1, (float)var11 / 65536.0F);
            if(var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if(var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)field111[var14 + var12] * (long)class27.field275 >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)field111[var14 + var12 - 1 - var17] * (long)class27.field268[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)field111[var14 - 1 - var17] * (long)class27.field268[1][var17] >> 16);
                  }

                  field111[var14] = var16;
                  var11 = this.field119.method882(var1 + 1);
                  ++var14;
               }

               var15 = 128;

               while(true) {
                  if(var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)field111[var14 + var12] * (long)class27.field275 >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)field111[var14 + var12 - 1 - var18] * (long)class27.field268[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)field111[var14 - 1 - var18] * (long)class27.field268[1][var18] >> 16);
                     }

                     field111[var14] = var17;
                     var11 = this.field119.method882(var1 + 1);
                     ++var14;
                  }

                  if(var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)field111[var14 + var12 - 1 - var18] * (long)class27.field268[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)field111[var14 - 1 - var18] * (long)class27.field268[1][var18] >> 16);
                        }

                        field111[var14] = var17;
                        this.field119.method882(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.field108.method480(0, (float)var11 / 65536.0F);
                  var13 = this.field108.method480(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if(field111[var11] < -32768) {
               field111[var11] = -32768;
            }

            if(field111[var11] > 32767) {
               field111[var11] = 32767;
            }
         }

         return field111;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;)V"
   )
   final void method181(class125 var1) {
      this.field107 = new class46();
      this.field107.method880(var1);
      this.field95 = new class46();
      this.field95.method880(var1);
      int var2 = var1.method2256();
      if(var2 != 0) {
         --var1.field1693;
         this.field96 = new class46();
         this.field96.method880(var1);
         this.field112 = new class46();
         this.field112.method880(var1);
      }

      var2 = var1.method2256();
      if(var2 != 0) {
         --var1.field1693;
         this.field98 = new class46();
         this.field98.method880(var1);
         this.field99 = new class46();
         this.field99.method880(var1);
      }

      var2 = var1.method2256();
      if(var2 != 0) {
         --var1.field1693;
         this.field100 = new class46();
         this.field100.method880(var1);
         this.field101 = new class46();
         this.field101.method880(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.method2270();
         if(var4 == 0) {
            break;
         }

         this.field102[var3] = var4;
         this.field103[var3] = var1.method2339();
         this.field104[var3] = var1.method2270();
      }

      this.field105 = var1.method2270();
      this.field106 = var1.method2270();
      this.field113 = var1.method2258();
      this.field110 = var1.method2258();
      this.field108 = new class27();
      this.field119 = new class46();
      this.field108.method468(var1, this.field119);
   }
}
