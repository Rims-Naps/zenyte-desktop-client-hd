package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
public class class157 extends class197 {
   @ObfuscatedName("af")
   static float[] field1935;
   @ObfuscatedName("j")
   static boolean[] field1922;
   @ObfuscatedName("k")
   static float[] field1938;
   @ObfuscatedName("ag")
   static float[] field1934;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "[Lcb;"
   )
   static class200[] field1918;
   @ObfuscatedName("p")
   static int field1914;
   @ObfuscatedName("i")
   static float[] field1929;
   @ObfuscatedName("c")
   static byte[] field1917;
   @ObfuscatedName("r")
   static int field1915;
   @ObfuscatedName("u")
   static boolean field1913;
   @ObfuscatedName("m")
   static int field1916;
   @ObfuscatedName("y")
   static float[] field1932;
   @ObfuscatedName("b")
   static int[] field1923;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "[Lcd;"
   )
   static class144[] field1920;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "[Lca;"
   )
   static class245[] field1921;
   @ObfuscatedName("av")
   static float[] field1933;
   @ObfuscatedName("at")
   static int[] field1937;
   @ObfuscatedName("d")
   static int field1907;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "[Ldy;"
   )
   static class16[] field1924;
   @ObfuscatedName("q")
   static float[] field1931;
   @ObfuscatedName("az")
   static int[] field1936;
   @ObfuscatedName("ac")
   byte[] field1939;
   @ObfuscatedName("n")
   int field1926;
   @ObfuscatedName("aw")
   int field1940;
   @ObfuscatedName("l")
   int field1908;
   @ObfuscatedName("s")
   int field1910;
   @ObfuscatedName("f")
   byte[][] field1930;
   @ObfuscatedName("h")
   int field1927;
   @ObfuscatedName("a")
   boolean field1911;
   @ObfuscatedName("am")
   int field1919;
   @ObfuscatedName("o")
   boolean field1928;
   @ObfuscatedName("t")
   float[] field1925;
   @ObfuscatedName("e")
   int field1912;
   @ObfuscatedName("w")
   int field1909;

   static {
      field1913 = false;
   }

   class157(byte[] var1) {
      this.method2845(var1);
   }

   @ObfuscatedName("p")
   float[] method2846(int var1) {
      method2848(this.field1930[var1], 0);
      method2843();
      int var2 = method2842(class162.method2968(field1923.length - 1));
      boolean var3 = field1922[var2];
      int var4 = var3?field1907:field1916;
      boolean var5 = false;
      boolean var6 = false;
      if(var3) {
         var5 = method2843() != 0;
         var6 = method2843() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if(var3 && !var5) {
         var8 = (var4 >> 2) - (field1916 >> 2);
         var9 = (field1916 >> 2) + (var4 >> 2);
         var10 = field1916 >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if(var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (field1916 >> 2);
         var12 = (field1916 >> 2) + (var4 - (var4 >> 2));
         var13 = field1916 >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      class16 var14 = field1924[field1923[var2]];
      int var16 = var14.field199;
      int var17 = var14.field201[var16];
      boolean var15 = !field1920[var17].method2646();
      boolean var45 = var15;

      for(var17 = 0; var17 < var14.field202; ++var17) {
         class245 var18 = field1921[var14.field200[var17]];
         float[] var19 = field1929;
         var18.method4950(var19, var4 >> 1, var45);
      }

      int var40;
      if(!var15) {
         var17 = var14.field199;
         var40 = var14.field201[var17];
         field1920[var40].method2644(field1929, var4 >> 1);
      }

      int var41;
      if(var15) {
         for(var17 = var4 >> 1; var17 < var4; ++var17) {
            field1929[var17] = 0.0F;
         }
      } else {
         var17 = var4 >> 1;
         var40 = var4 >> 2;
         var41 = var4 >> 3;
         float[] var20 = field1929;

         int var21;
         for(var21 = 0; var21 < var17; ++var21) {
            var20[var21] *= 0.5F;
         }

         for(var21 = var17; var21 < var4; ++var21) {
            var20[var21] = -var20[var4 - var21 - 1];
         }

         float[] var44 = var3?field1933:field1938;
         float[] var22 = var3?field1934:field1931;
         float[] var23 = var3?field1935:field1932;
         int[] var24 = var3?field1937:field1936;

         int var25;
         float var26;
         float var27;
         float var28;
         float var29;
         for(var25 = 0; var25 < var40; ++var25) {
            var26 = var20[var25 * 4] - var20[var4 - var25 * 4 - 1];
            var27 = var20[var25 * 4 + 2] - var20[var4 - var25 * 4 - 3];
            var28 = var44[var25 * 2];
            var29 = var44[var25 * 2 + 1];
            var20[var4 - var25 * 4 - 1] = var26 * var28 - var27 * var29;
            var20[var4 - var25 * 4 - 3] = var26 * var29 + var27 * var28;
         }

         float var30;
         float var31;
         for(var25 = 0; var25 < var41; ++var25) {
            var26 = var20[var17 + var25 * 4 + 3];
            var27 = var20[var17 + var25 * 4 + 1];
            var28 = var20[var25 * 4 + 3];
            var29 = var20[var25 * 4 + 1];
            var20[var17 + var25 * 4 + 3] = var26 + var28;
            var20[var17 + var25 * 4 + 1] = var27 + var29;
            var30 = var44[var17 - 4 - var25 * 4];
            var31 = var44[var17 - 3 - var25 * 4];
            var20[var25 * 4 + 3] = (var26 - var28) * var30 - (var27 - var29) * var31;
            var20[var25 * 4 + 1] = (var27 - var29) * var30 + (var26 - var28) * var31;
         }

         var25 = class162.method2968(var4 - 1);

         int var47;
         int var48;
         int var49;
         int var50;
         for(var47 = 0; var47 < var25 - 3; ++var47) {
            var48 = var4 >> var47 + 2;
            var49 = 8 << var47;

            for(var50 = 0; var50 < 2 << var47; ++var50) {
               int var51 = var4 - var48 * var50 * 2;
               int var52 = var4 - var48 * (var50 * 2 + 1);

               for(int var32 = 0; var32 < var4 >> var47 + 4; ++var32) {
                  int var33 = var32 * 4;
                  float var34 = var20[var51 - 1 - var33];
                  float var35 = var20[var51 - 3 - var33];
                  float var36 = var20[var52 - 1 - var33];
                  float var37 = var20[var52 - 3 - var33];
                  var20[var51 - 1 - var33] = var34 + var36;
                  var20[var51 - 3 - var33] = var35 + var37;
                  float var38 = var44[var32 * var49];
                  float var39 = var44[var32 * var49 + 1];
                  var20[var52 - 1 - var33] = (var34 - var36) * var38 - (var35 - var37) * var39;
                  var20[var52 - 3 - var33] = (var35 - var37) * var38 + (var34 - var36) * var39;
               }
            }
         }

         for(var47 = 1; var47 < var41 - 1; ++var47) {
            var48 = var24[var47];
            if(var47 < var48) {
               var49 = var47 * 8;
               var50 = var48 * 8;
               var30 = var20[var49 + 1];
               var20[var49 + 1] = var20[var50 + 1];
               var20[var50 + 1] = var30;
               var30 = var20[var49 + 3];
               var20[var49 + 3] = var20[var50 + 3];
               var20[var50 + 3] = var30;
               var30 = var20[var49 + 5];
               var20[var49 + 5] = var20[var50 + 5];
               var20[var50 + 5] = var30;
               var30 = var20[var49 + 7];
               var20[var49 + 7] = var20[var50 + 7];
               var20[var50 + 7] = var30;
            }
         }

         for(var47 = 0; var47 < var17; ++var47) {
            var20[var47] = var20[var47 * 2 + 1];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var4 - 1 - var47 * 2] = var20[var47 * 4];
            var20[var4 - 2 - var47 * 2] = var20[var47 * 4 + 1];
            var20[var4 - var40 - 1 - var47 * 2] = var20[var47 * 4 + 2];
            var20[var4 - var40 - 2 - var47 * 2] = var20[var47 * 4 + 3];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var27 = var23[var47 * 2];
            var28 = var23[var47 * 2 + 1];
            var29 = var20[var17 + var47 * 2];
            var30 = var20[var17 + var47 * 2 + 1];
            var31 = var20[var4 - 2 - var47 * 2];
            float var53 = var20[var4 - 1 - var47 * 2];
            float var54 = var28 * (var29 - var31) + var27 * (var30 + var53);
            var20[var17 + var47 * 2] = (var29 + var31 + var54) * 0.5F;
            var20[var4 - 2 - var47 * 2] = (var29 + var31 - var54) * 0.5F;
            var54 = var28 * (var30 + var53) - var27 * (var29 - var31);
            var20[var17 + var47 * 2 + 1] = (var30 - var53 + var54) * 0.5F;
            var20[var4 - 1 - var47 * 2] = (-var30 + var53 + var54) * 0.5F;
         }

         for(var47 = 0; var47 < var40; ++var47) {
            var20[var47] = var20[var17 + var47 * 2] * var22[var47 * 2] + var20[var17 + var47 * 2 + 1] * var22[var47 * 2 + 1];
            var20[var17 - 1 - var47] = var20[var17 + var47 * 2] * var22[var47 * 2 + 1] - var20[var17 + var47 * 2 + 1] * var22[var47 * 2];
         }

         for(var47 = 0; var47 < var40; ++var47) {
            var20[var47 + (var4 - var40)] = -var20[var47];
         }

         for(var47 = 0; var47 < var40; ++var47) {
            var20[var47] = var20[var40 + var47];
         }

         for(var47 = 0; var47 < var40; ++var47) {
            var20[var40 + var47] = -var20[var40 - var47 - 1];
         }

         for(var47 = 0; var47 < var40; ++var47) {
            var20[var17 + var47] = var20[var4 - var47 - 1];
         }

         for(var47 = var8; var47 < var9; ++var47) {
            var27 = (float)Math.sin(((double)(var47 - var8) + 0.5D) / (double)var10 * 0.5D * 3.141592653589793D);
            field1929[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
         }

         for(var47 = var11; var47 < var12; ++var47) {
            var27 = (float)Math.sin(((double)(var47 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            field1929[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
         }
      }

      float[] var42 = null;
      if(this.field1926 > 0) {
         var40 = var4 + this.field1926 >> 2;
         var42 = new float[var40];
         int var43;
         if(!this.field1928) {
            for(var41 = 0; var41 < this.field1927; ++var41) {
               var43 = var41 + (this.field1926 >> 1);
               var42[var41] += this.field1925[var43];
            }
         }

         if(!var15) {
            for(var41 = var8; var41 < var4 >> 1; ++var41) {
               var43 = var42.length - (var4 >> 1) + var41;
               var42[var43] += field1929[var41];
            }
         }
      }

      float[] var46 = this.field1925;
      this.field1925 = field1929;
      field1929 = var46;
      this.field1926 = var4;
      this.field1927 = var12 - (var4 >> 1);
      this.field1928 = var15;
      return var42;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "([I)Lcr;"
   )
   class33 method2850(int[] var1) {
      if(var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if(this.field1939 == null) {
            this.field1926 = 0;
            this.field1925 = new float[field1907];
            this.field1939 = new byte[this.field1909];
            this.field1919 = 0;
            this.field1940 = 0;
         }

         for(; this.field1940 < this.field1930.length; ++this.field1940) {
            if(var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.method2846(this.field1940);
            if(var2 != null) {
               int var3 = this.field1919;
               int var4 = var2.length;
               if(var4 > this.field1909 - var3) {
                  var4 = this.field1909 - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.field1939[var3++] = (byte)(var6 - 128);
               }

               if(var1 != null) {
                  var1[0] -= var3 - this.field1919;
               }

               this.field1919 = var3;
            }
         }

         this.field1925 = null;
         byte[] var7 = this.field1939;
         this.field1939 = null;
         return new class33(this.field1908, var7, this.field1910, this.field1912, this.field1911);
      }
   }

   @ObfuscatedName("e")
   void method2845(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      this.field1908 = var2.readInt();
      this.field1909 = var2.readInt();
      this.field1910 = var2.readInt();
      this.field1912 = var2.readInt();
      if(this.field1912 < 0) {
         this.field1912 = ~this.field1912;
         this.field1911 = true;
      }

      int var3 = var2.readInt();
      this.field1930 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.readUnsignedByte();
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.method2295(var7, 0, var5);
         this.field1930[var4] = var7;
      }

   }

   @ObfuscatedName("c")
   static void method2857(byte[] var0) {
      method2848(var0, 0);
      field1916 = 1 << method2842(4);
      field1907 = 1 << method2842(4);
      field1929 = new float[field1907];

      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      for(var1 = 0; var1 < 2; ++var1) {
         var2 = var1 != 0?field1907:field1916;
         var3 = var2 >> 1;
         var4 = var2 >> 2;
         var5 = var2 >> 3;
         float[] var6 = new float[var3];

         for(int var7 = 0; var7 < var4; ++var7) {
            var6[var7 * 2] = (float)Math.cos((double)(var7 * 4) * 3.141592653589793D / (double)var2);
            var6[var7 * 2 + 1] = -((float)Math.sin((double)(var7 * 4) * 3.141592653589793D / (double)var2));
         }

         float[] var18 = new float[var3];

         for(int var8 = 0; var8 < var4; ++var8) {
            var18[var8 * 2] = (float)Math.cos((double)(var8 * 2 + 1) * 3.141592653589793D / (double)(var2 * 2));
            var18[var8 * 2 + 1] = (float)Math.sin((double)(var8 * 2 + 1) * 3.141592653589793D / (double)(var2 * 2));
         }

         float[] var19 = new float[var4];

         for(int var9 = 0; var9 < var5; ++var9) {
            var19[var9 * 2] = (float)Math.cos((double)(var9 * 4 + 2) * 3.141592653589793D / (double)var2);
            var19[var9 * 2 + 1] = -((float)Math.sin((double)(var9 * 4 + 2) * 3.141592653589793D / (double)var2));
         }

         int[] var20 = new int[var5];
         int var10 = class162.method2968(var5 - 1);

         for(int var11 = 0; var11 < var5; ++var11) {
            int var15 = var11;
            int var16 = var10;

            int var17;
            for(var17 = 0; var16 > 0; --var16) {
               var17 = var17 << 1 | var15 & 1;
               var15 >>>= 1;
            }

            var20[var11] = var17;
         }

         if(var1 != 0) {
            field1933 = var6;
            field1934 = var18;
            field1935 = var19;
            field1937 = var20;
         } else {
            field1938 = var6;
            field1931 = var18;
            field1932 = var19;
            field1936 = var20;
         }
      }

      var1 = method2842(8) + 1;
      field1918 = new class200[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         field1918[var2] = new class200();
      }

      var2 = method2842(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         method2842(16);
      }

      var2 = method2842(6) + 1;
      field1920 = new class144[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         field1920[var3] = new class144();
      }

      var3 = method2842(6) + 1;
      field1921 = new class245[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         field1921[var4] = new class245();
      }

      var4 = method2842(6) + 1;
      field1924 = new class16[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         field1924[var5] = new class16();
      }

      var5 = method2842(6) + 1;
      field1922 = new boolean[var5];
      field1923 = new int[var5];

      for(int var21 = 0; var21 < var5; ++var21) {
         field1922[var21] = method2843() != 0;
         method2842(16);
         method2842(16);
         field1923[var21] = method2842(8);
      }

   }

   @ObfuscatedName("l")
   static void method2848(byte[] var0, int var1) {
      field1917 = var0;
      field1914 = var1;
      field1915 = 0;
   }

   @ObfuscatedName("s")
   static int method2842(int var0) {
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var0 >= 8 - field1915; var0 -= var3) {
         var3 = 8 - field1915;
         int var4 = (1 << var3) - 1;
         var1 += (field1917[field1914] >> field1915 & var4) << var2;
         field1915 = 0;
         ++field1914;
         var2 += var3;
      }

      if(var0 > 0) {
         var3 = (1 << var0) - 1;
         var1 += (field1917[field1914] >> field1915 & var3) << var2;
         field1915 += var0;
      }

      return var1;
   }

   @ObfuscatedName("f")
   static float method2860(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if(var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Lik;)Z"
   )
   static boolean method2864(Js5Index var0) {
      if(!field1913) {
         byte[] var1 = var0.method4398(0, 0, 644685957);
         if(var1 == null) {
            return false;
         }

         method2857(var1);
         field1913 = true;
      }

      return true;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lik;II)Lce;"
   )
   static class157 method2849(Js5Index var0, int var1, int var2) {
      if(!method2864(var0)) {
         var0.method4468(var1, var2);
         return null;
      } else {
         byte[] var3 = var0.method4398(var1, var2, -1592124029);
         return var3 == null?null:new class157(var3);
      }
   }

   @ObfuscatedName("w")
   static int method2843() {
      int var0 = field1917[field1914] >> field1915 & 1;
      ++field1915;
      field1914 += field1915 >> 3;
      field1915 &= 7;
      return var0;
   }
}
