package net.runelite.client.standalone;

import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
public class class110 {
   @ObfuscatedName("n")
   static int[] field1041;
   @ObfuscatedName("q")
   static int[] field1048;
   @ObfuscatedName("u")
   static int[] field1043;
   @ObfuscatedName("t")
   static int[] field1049;
   @ObfuscatedName("o")
   static int[] field1047;
   @ObfuscatedName("k")
   static int[] field1050;
   @ObfuscatedName("i")
   static int[] field1026;
   @ObfuscatedName("y")
   static int[] field1029;
   @ObfuscatedName("j")
   int field1045;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lcl;"
   )
   class30 field1039;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Ldd;"
   )
   class265 field1040;
   @ObfuscatedName("m")
   int[] field1035;
   @ObfuscatedName("z")
   int field1037;
   @ObfuscatedName("r")
   int[] field1034;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lcl;"
   )
   class30 field1033;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lcl;"
   )
   class30 field1032;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lcl;"
   )
   class30 field1030;
   @ObfuscatedName("b")
   int field1042;
   @ObfuscatedName("x")
   int field1038;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lcl;"
   )
   class30 field1027;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lcl;"
   )
   class30 field1044;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lcl;"
   )
   class30 field1031;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lcl;"
   )
   class30 field1051;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lcl;"
   )
   class30 field1028;
   @ObfuscatedName("d")
   int[] field1036;

   static {
      field1049 = new int['耀'];
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < 32768; ++var1) {
         field1049[var1] = (var0.nextInt() & 2) - 1;
      }

      field1041 = new int['耀'];

      for(var1 = 0; var1 < 32768; ++var1) {
         field1041[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
      }

      field1043 = new int[220500];
      field1047 = new int[5];
      field1026 = new int[5];
      field1050 = new int[5];
      field1048 = new int[5];
      field1029 = new int[5];
   }

   class110() {
      this.field1034 = new int[]{0, 0, 0, 0, 0};
      this.field1035 = new int[]{0, 0, 0, 0, 0};
      this.field1036 = new int[]{0, 0, 0, 0, 0};
      this.field1037 = 0;
      this.field1038 = 100;
      this.field1045 = 500;
      this.field1042 = 0;
   }

   @ObfuscatedName("f")
   final int[] method1837(int var1, int var2) {
      class196.method3317(field1043, 0, var1);
      if(var2 < 10) {
         return field1043;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.field1039.method494();
         this.field1027.method494();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if(this.field1028 != null) {
            this.field1028.method494();
            this.field1044.method494();
            var5 = (int)((double)(this.field1028.field231 - this.field1028.field230) * 32.768D / var3);
            var6 = (int)((double)this.field1028.field230 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if(this.field1030 != null) {
            this.field1030.method494();
            this.field1031.method494();
            var8 = (int)((double)(this.field1030.field231 - this.field1030.field230) * 32.768D / var3);
            var9 = (int)((double)this.field1030.field230 * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if(this.field1034[var11] != 0) {
               field1047[var11] = 0;
               field1026[var11] = (int)((double)this.field1036[var11] * var3);
               field1050[var11] = (this.field1034[var11] << 14) / 100;
               field1048[var11] = (int)((double)(this.field1039.field231 - this.field1039.field230) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field1035[var11]) / var3);
               field1029[var11] = (int)((double)this.field1039.field230 * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.field1039.method489(var1);
            var13 = this.field1027.method489(var1);
            if(this.field1028 != null) {
               var14 = this.field1028.method489(var1);
               var15 = this.field1044.method489(var1);
               var12 += this.method1838(var7, var15, this.field1028.field227) >> 1;
               var7 = var7 + var6 + (var14 * var5 >> 16);
            }

            if(this.field1030 != null) {
               var14 = this.field1030.method489(var1);
               var15 = this.field1031.method489(var1);
               var13 = var13 * ((this.method1838(var10, var15, this.field1030.field227) >> 1) + 32768) >> 15;
               var10 = var10 + var9 + (var14 * var8 >> 16);
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if(this.field1034[var14] != 0) {
                  var15 = field1026[var14] + var11;
                  if(var15 < var1) {
                     field1043[var15] += this.method1838(field1047[var14], var13 * field1050[var14] >> 15, this.field1039.field227);
                     field1047[var14] += (var12 * field1048[var14] >> 16) + field1029[var14];
                  }
               }
            }
         }

         int var16;
         if(this.field1032 != null) {
            this.field1032.method494();
            this.field1033.method494();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.field1032.method489(var1);
               var16 = this.field1033.method489(var1);
               if(var20) {
                  var12 = (var15 * (this.field1032.field231 - this.field1032.field230) >> 8) + this.field1032.field230;
               } else {
                  var12 = (var16 * (this.field1032.field231 - this.field1032.field230) >> 8) + this.field1032.field230;
               }

               var11 += 256;
               if(var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if(var20) {
                  field1043[var14] = 0;
               }
            }
         }

         if(this.field1037 > 0 && this.field1038 > 0) {
            var11 = (int)((double)this.field1037 * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               field1043[var12] += field1043[var12 - var11] * this.field1038 / 100;
            }
         }

         if(this.field1040.field2925[0] > 0 || this.field1040.field2925[1] > 0) {
            this.field1051.method494();
            var11 = this.field1051.method489(var1 + 1);
            var12 = this.field1040.method4840(0, (float)var11 / 65536.0F);
            var13 = this.field1040.method4840(1, (float)var11 / 65536.0F);
            if(var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if(var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)field1043[var14 + var12] * (long)class265.field2926 >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)field1043[var14 + var12 - 1 - var17] * (long)class265.field2919[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)field1043[var14 - 1 - var17] * (long)class265.field2919[1][var17] >> 16);
                  }

                  field1043[var14] = var16;
                  var11 = this.field1051.method489(var1 + 1);
                  ++var14;
               }

               var15 = 128;

               while(true) {
                  if(var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)field1043[var14 + var12] * (long)class265.field2926 >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)field1043[var14 + var12 - 1 - var18] * (long)class265.field2919[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)field1043[var14 - 1 - var18] * (long)class265.field2919[1][var18] >> 16);
                     }

                     field1043[var14] = var17;
                     var11 = this.field1051.method489(var1 + 1);
                     ++var14;
                  }

                  if(var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)field1043[var14 + var12 - 1 - var18] * (long)class265.field2919[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)field1043[var14 - 1 - var18] * (long)class265.field2919[1][var18] >> 16);
                        }

                        field1043[var14] = var17;
                        this.field1051.method489(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.field1040.method4840(0, (float)var11 / 65536.0F);
                  var13 = this.field1040.method4840(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if(field1043[var11] < -32768) {
               field1043[var11] = -32768;
            }

            if(field1043[var11] > 32767) {
               field1043[var11] = 32767;
            }
         }

         return field1043;
      }
   }

   @ObfuscatedName("l")
   final int method1838(int var1, int var2, int var3) {
      return var3 == 1?((var1 & 32767) < 16384?var2:-var2):(var3 == 2?field1041[var1 & 32767] * var2 >> 14:(var3 == 3?(var2 * (var1 & 32767) >> 14) - var2:(var3 == 4?var2 * field1049[var1 / 2607 & 32767]:0)));
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;)V"
   )
   final void method1839(Buffer var1) {
      this.field1039 = new class30();
      this.field1039.method487(var1);
      this.field1027 = new class30();
      this.field1027.method487(var1);
      int var2 = var1.readUnsignedByte();
      if(var2 != 0) {
         --var1.field1073;
         this.field1028 = new class30();
         this.field1028.method487(var1);
         this.field1044 = new class30();
         this.field1044.method487(var1);
      }

      var2 = var1.readUnsignedByte();
      if(var2 != 0) {
         --var1.field1073;
         this.field1030 = new class30();
         this.field1030.method487(var1);
         this.field1031 = new class30();
         this.field1031.method487(var1);
      }

      var2 = var1.readUnsignedByte();
      if(var2 != 0) {
         --var1.field1073;
         this.field1032 = new class30();
         this.field1032.method487(var1);
         this.field1033 = new class30();
         this.field1033.method487(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.readSmart();
         if(var4 == 0) {
            break;
         }

         this.field1034[var3] = var4;
         this.field1035[var3] = var1.method1988();
         this.field1036[var3] = var1.readSmart();
      }

      this.field1037 = var1.readSmart();
      this.field1038 = var1.readSmart();
      this.field1045 = var1.readUnsignedShort();
      this.field1042 = var1.readUnsignedShort();
      this.field1040 = new class265();
      this.field1051 = new class30();
      this.field1040.method4828(var1, this.field1051);
   }
}
