package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
public class class101 extends class76 {
   @ObfuscatedName("af")
   static float[] field953;
   @ObfuscatedName("j")
   static boolean[] field940;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "[Lca;"
   )
   static class28[] field939;
   @ObfuscatedName("m")
   static int field934;
   @ObfuscatedName("q")
   static float[] field949;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "[Lcb;"
   )
   static class39[] field936;
   @ObfuscatedName("r")
   static int field933;
   @ObfuscatedName("ag")
   static float[] field952;
   @ObfuscatedName("p")
   static int field932;
   @ObfuscatedName("u")
   static boolean field931;
   @ObfuscatedName("c")
   static byte[] field935;
   @ObfuscatedName("b")
   static int[] field941;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "[Lcd;"
   )
   static class85[] field938;
   @ObfuscatedName("az")
   static int[] field954;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "[Ldy;"
   )
   static class19[] field942;
   @ObfuscatedName("k")
   static float[] field956;
   @ObfuscatedName("i")
   static float[] field947;
   @ObfuscatedName("y")
   static float[] field950;
   @ObfuscatedName("d")
   static int field925;
   @ObfuscatedName("at")
   static int[] field955;
   @ObfuscatedName("av")
   static float[] field951;
   @ObfuscatedName("aw")
   int field958;
   @ObfuscatedName("f")
   byte[][] field948;
   @ObfuscatedName("n")
   int field944;
   @ObfuscatedName("ac")
   byte[] field957;
   @ObfuscatedName("h")
   int field945;
   @ObfuscatedName("e")
   int field930;
   @ObfuscatedName("t")
   float[] field943;
   @ObfuscatedName("l")
   int field926;
   @ObfuscatedName("o")
   boolean field946;
   @ObfuscatedName("s")
   int field928;
   @ObfuscatedName("a")
   boolean field929;
   @ObfuscatedName("w")
   int field927;
   @ObfuscatedName("am")
   int field937;

   static {
      field931 = false;
   }

   class101(byte[] var1) {
      this.method1696(var1);
   }

   @ObfuscatedName("p")
   float[] method1697(int var1) {
      method1699(this.field948[var1], 0);
      method1694();
      int var2 = method1693(class12.method136(field941.length - 1));
      boolean var3 = field940[var2];
      int var4 = var3?field925:field934;
      boolean var5 = false;
      boolean var6 = false;
      if(var3) {
         var5 = method1694() != 0;
         var6 = method1694() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if(var3 && !var5) {
         var8 = (var4 >> 2) - (field934 >> 2);
         var9 = (field934 >> 2) + (var4 >> 2);
         var10 = field934 >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if(var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (field934 >> 2);
         var12 = (field934 >> 2) + (var4 - (var4 >> 2));
         var13 = field934 >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      class19 var14 = field942[field941[var2]];
      int var16 = var14.field150;
      int var17 = var14.field152[var16];
      boolean var15 = !field938[var17].method1233();
      boolean var45 = var15;

      for(var17 = 0; var17 < var14.field153; ++var17) {
         class28 var18 = field939[var14.field151[var17]];
         float[] var19 = field947;
         var18.method484(var19, var4 >> 1, var45);
      }

      int var40;
      if(!var15) {
         var17 = var14.field150;
         var40 = var14.field152[var17];
         field938[var40].method1231(field947, var4 >> 1);
      }

      int var41;
      if(var15) {
         for(var17 = var4 >> 1; var17 < var4; ++var17) {
            field947[var17] = 0.0F;
         }
      } else {
         var17 = var4 >> 1;
         var40 = var4 >> 2;
         var41 = var4 >> 3;
         float[] var20 = field947;

         int var21;
         for(var21 = 0; var21 < var17; ++var21) {
            var20[var21] *= 0.5F;
         }

         for(var21 = var17; var21 < var4; ++var21) {
            var20[var21] = -var20[var4 - var21 - 1];
         }

         float[] var44 = var3?field951:field956;
         float[] var22 = var3?field952:field949;
         float[] var23 = var3?field953:field950;
         int[] var24 = var3?field955:field954;

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

         var25 = class12.method136(var4 - 1);

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
            field947[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
         }

         for(var47 = var11; var47 < var12; ++var47) {
            var27 = (float)Math.sin(((double)(var47 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            field947[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
         }
      }

      float[] var42 = null;
      if(this.field944 > 0) {
         var40 = var4 + this.field944 >> 2;
         var42 = new float[var40];
         int var43;
         if(!this.field946) {
            for(var41 = 0; var41 < this.field945; ++var41) {
               var43 = var41 + (this.field944 >> 1);
               var42[var41] += this.field943[var43];
            }
         }

         if(!var15) {
            for(var41 = var8; var41 < var4 >> 1; ++var41) {
               var43 = var42.length - (var4 >> 1) + var41;
               var42[var43] += field947[var41];
            }
         }
      }

      float[] var46 = this.field943;
      this.field943 = field947;
      field947 = var46;
      this.field944 = var4;
      this.field945 = var12 - (var4 >> 1);
      this.field946 = var15;
      return var42;
   }

   @ObfuscatedName("e")
   void method1696(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      this.field926 = var2.readInt();
      this.field927 = var2.readInt();
      this.field928 = var2.readInt();
      this.field930 = var2.readInt();
      if(this.field930 < 0) {
         this.field930 = ~this.field930;
         this.field929 = true;
      }

      int var3 = var2.readInt();
      this.field948 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.readUnsignedByte();
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.readBytes(var7, 0, var5);
         this.field948[var4] = var7;
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "([I)Lcr;"
   )
   class58 method1701(int[] var1) {
      if(var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if(this.field957 == null) {
            this.field944 = 0;
            this.field943 = new float[field925];
            this.field957 = new byte[this.field927];
            this.field937 = 0;
            this.field958 = 0;
         }

         for(; this.field958 < this.field948.length; ++this.field958) {
            if(var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.method1697(this.field958);
            if(var2 != null) {
               int var3 = this.field937;
               int var4 = var2.length;
               if(var4 > this.field927 - var3) {
                  var4 = this.field927 - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.field957[var3++] = (byte)(var6 - 128);
               }

               if(var1 != null) {
                  var1[0] -= var3 - this.field937;
               }

               this.field937 = var3;
            }
         }

         this.field943 = null;
         byte[] var7 = this.field957;
         this.field957 = null;
         return new class58(this.field926, var7, this.field928, this.field930, this.field929);
      }
   }

   @ObfuscatedName("f")
   static float method1711(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if(var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lik;II)Lce;"
   )
   static class101 method1700(class148 var0, int var1, int var2) {
      if(!method1715(var0)) {
         var0.method2649(var1, var2);
         return null;
      } else {
         byte[] var3 = var0.method2579(var1, var2, -1592124029);
         return var3 == null?null:new class101(var3);
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Lik;)Z"
   )
   static boolean method1715(class148 var0) {
      if(!field931) {
         byte[] var1 = var0.method2579(0, 0, 644685957);
         if(var1 == null) {
            return false;
         }

         method1708(var1);
         field931 = true;
      }

      return true;
   }

   @ObfuscatedName("c")
   static void method1708(byte[] var0) {
      method1699(var0, 0);
      field934 = 1 << method1693(4);
      field925 = 1 << method1693(4);
      field947 = new float[field925];

      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      for(var1 = 0; var1 < 2; ++var1) {
         var2 = var1 != 0?field925:field934;
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
         int var10 = class12.method136(var5 - 1);

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
            field951 = var6;
            field952 = var18;
            field953 = var19;
            field955 = var20;
         } else {
            field956 = var6;
            field949 = var18;
            field950 = var19;
            field954 = var20;
         }
      }

      var1 = method1693(8) + 1;
      field936 = new class39[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         field936[var2] = new class39();
      }

      var2 = method1693(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         method1693(16);
      }

      var2 = method1693(6) + 1;
      field938 = new class85[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         field938[var3] = new class85();
      }

      var3 = method1693(6) + 1;
      field939 = new class28[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         field939[var4] = new class28();
      }

      var4 = method1693(6) + 1;
      field942 = new class19[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         field942[var5] = new class19();
      }

      var5 = method1693(6) + 1;
      field940 = new boolean[var5];
      field941 = new int[var5];

      for(int var21 = 0; var21 < var5; ++var21) {
         field940[var21] = method1694() != 0;
         method1693(16);
         method1693(16);
         field941[var21] = method1693(8);
      }

   }

   @ObfuscatedName("l")
   static void method1699(byte[] var0, int var1) {
      field935 = var0;
      field932 = var1;
      field933 = 0;
   }

   @ObfuscatedName("s")
   static int method1693(int var0) {
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var0 >= 8 - field933; var0 -= var3) {
         var3 = 8 - field933;
         int var4 = (1 << var3) - 1;
         var1 += (field935[field932] >> field933 & var4) << var2;
         field933 = 0;
         ++field932;
         var2 += var3;
      }

      if(var0 > 0) {
         var3 = (1 << var0) - 1;
         var1 += (field935[field932] >> field933 & var3) << var2;
         field933 += var0;
      }

      return var1;
   }

   @ObfuscatedName("w")
   static int method1694() {
      int var0 = field935[field932] >> field933 & 1;
      ++field933;
      field932 += field933 >> 3;
      field933 &= 7;
      return var0;
   }
}
