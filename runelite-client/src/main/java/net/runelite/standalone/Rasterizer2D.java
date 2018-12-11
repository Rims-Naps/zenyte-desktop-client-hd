package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("lz")
public class Rasterizer2D extends class324 {
   @ObfuscatedName("af")
   public static int field2119;
   @ObfuscatedName("ag")
   public static int[] field2121;
   @ObfuscatedName("ac")
   public static int field2123;
   @ObfuscatedName("aw")
   protected static int field2125;
   @ObfuscatedName("at")
   public static int field2122;
   @ObfuscatedName("am")
   public static int field2124;
   @ObfuscatedName("az")
   public static int field2120;

   static {
      field2122 = 0;
      field2123 = 0;
      field2124 = 0;
      field2125 = 0;
   }

   @ObfuscatedName("dg")
   public static void method3167(int var0, int var1, int var2, int var3, int var4) {
      if(var0 < field2124) {
         var2 -= field2124 - var0;
         var0 = field2124;
      }

      if(var1 < field2122) {
         var3 -= field2122 - var1;
         var1 = field2122;
      }

      if(var0 + var2 > field2125) {
         var2 = field2125 - var0;
      }

      if(var3 + var1 > field2123) {
         var3 = field2123 - var1;
      }

      int var5 = field2119 - var2;
      int var6 = var0 + field2119 * var1;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            field2121[var6++] = var4 | -16777216;
         }

         var6 += var5;
      }

   }

   @ObfuscatedName("dv")
   public static void method3136(int[] var0, int var1, int var2) {
      field2121 = var0;
      field2119 = var1;
      field2120 = var2;
      method3138(0, 0, var1, var2);
   }

   @ObfuscatedName("do")
   public static void method3138(int var0, int var1, int var2, int var3) {
      if(var0 < 0) {
         var0 = 0;
      }

      if(var1 < 0) {
         var1 = 0;
      }

      if(var2 > field2119) {
         var2 = field2119;
      }

      if(var3 > field2120) {
         var3 = field2120;
      }

      field2124 = var0;
      field2122 = var1;
      field2125 = var2;
      field2123 = var3;
   }

   @ObfuscatedName("db")
   public static void method3137() {
      int var0 = 0;

      int var1;
      for(var1 = field2119 * field2120 - 7; var0 < var1; field2121[var0++] = 0) {
         field2121[var0++] = 0;
         field2121[var0++] = 0;
         field2121[var0++] = 0;
         field2121[var0++] = 0;
         field2121[var0++] = 0;
         field2121[var0++] = 0;
         field2121[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; field2121[var0++] = 0) {
         ;
      }

   }

   @ObfuscatedName("ds")
   public static void method3147(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = class302.field3755.getGraphicsPixelsWidth();
      int var9 = class302.field3755.getStartX();
      int var10 = class302.field3755.getStartY();
      int var11 = class302.field3755.getEndX();
      int var12 = class302.field3755.getEndY();
      int[] var13 = class302.field3755.getGraphicsPixels();
      if(!class302.field3755.isGpu()) {
         client.copy$drawGradientAlpha(var0, var1, var2, var3, var4, var5, var6, var7);
      } else {
         if(var2 > 0 && var3 > 0) {
            int var14 = 0;
            int var15 = 65536 / var3;
            if(var0 < var9) {
               var2 -= var9 - var0;
               var0 = var9;
            }

            if(var1 < var10) {
               var14 += (var10 - var1) * var15;
               var3 -= var10 - var1;
               var1 = var10;
            }

            if(var0 + var2 > var11) {
               var2 = var11 - var0;
            }

            if(var3 + var1 > var12) {
               var3 = var12 - var1;
            }

            int var16 = var8 - var2;
            int var17 = var0 + var8 * var1;

            for(int var18 = -var3; var18 < 0; ++var18) {
               int var19 = 65536 - var14 >> 8;
               int var20 = var14 >> 8;
               int var21 = (var19 * var6 + var20 * var7 & 65280) >>> 8;
               if(var21 == 0) {
                  var17 += var8;
                  var14 += var15;
               } else {
                  int var22 = (var19 * (var4 & 65280) + var20 * (var5 & 65280) & 16711680) + (var19 * (var4 & 16711935) + var20 * (var5 & 16711935) & -16711936) >>> 8;

                  for(int var23 = -var2; var23 < 0; ++var23) {
                     client.drawAlpha(var13, var17++, 0, var22, var21);
                  }

                  var17 += var16;
                  var14 += var15;
               }
            }
         }

      }
   }

   @ObfuscatedName("ey")
   public static void method3157(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + field2119 * var1;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            field2121[var6++] = var2 | -16777216;
         }

         var5 += field2119;
      }

   }

   @ObfuscatedName("du")
   public static void method3145(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var12 = var4;
      if(var0 < field2124) {
         var2 -= field2124 - var0;
         var0 = field2124;
      }

      if(var1 < field2122) {
         var3 -= field2122 - var1;
         var1 = field2122;
      }

      if(var0 + var2 > field2125) {
         var2 = field2125 - var0;
      }

      if(var3 + var1 > field2123) {
         var3 = field2123 - var1;
      }

      var4 = (var5 * (var4 & 16711935) >> 8 & 16711935) + (var5 * (var4 & 65280) >> 8 & 65280);
      int var6 = 256 - var5;
      int var7 = field2119 - var2;
      int var8 = var0 + field2119 * var1;

      for(int var9 = 0; var9 < var3; ++var9) {
         for(int var10 = -var2; var10 < 0; ++var10) {
            int var11 = field2121[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + (var6 * (var11 & 65280) >> 8 & 65280);
            client.drawAlpha(field2121, var8++, var11 + var4, var12, var5);
         }

         var8 += var7;
      }

   }

   @ObfuscatedName("dc")
   public static void method3141(int[] var0) {
      field2124 = var0[0];
      field2122 = var0[1];
      field2125 = var0[2];
      field2123 = var0[3];
   }

   @ObfuscatedName("dj")
   public static void method3153(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if(var3 == 0) {
         if(var2 >= 0) {
            method3213(var0, var1, var2 + 1, var4);
         } else {
            method3213(var0 + var2, var1, -var2 + 1, var4);
         }

      } else if(var2 == 0) {
         if(var3 >= 0) {
            method3206(var0, var1, var3 + 1, var4);
         } else {
            method3206(var0, var3 + var1, -var3 + 1, var4);
         }

      } else {
         if(var3 + var2 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         int var5;
         int var6;
         if(var2 > var3) {
            var1 <<= 16;
            var1 += 32768;
            var3 <<= 16;
            var5 = (int)Math.floor((double)var3 / (double)var2 + 0.5D);
            var2 += var0;
            if(var0 < field2124) {
               var1 += var5 * (field2124 - var0);
               var0 = field2124;
            }

            if(var2 >= field2125) {
               var2 = field2125 - 1;
            }

            while(var0 <= var2) {
               var6 = var1 >> 16;
               if(var6 >= field2122 && var6 < field2123) {
                  field2121[var0 + var6 * field2119] = var4 | -16777216;
               }

               var1 += var5;
               ++var0;
            }
         } else {
            var0 <<= 16;
            var0 += 32768;
            var2 <<= 16;
            var5 = (int)Math.floor((double)var2 / (double)var3 + 0.5D);
            var3 += var1;
            if(var1 < field2122) {
               var0 += (field2122 - var1) * var5;
               var1 = field2122;
            }

            if(var3 >= field2123) {
               var3 = field2123 - 1;
            }

            while(var1 <= var3) {
               var6 = var0 >> 16;
               if(var6 >= field2124 && var6 < field2125) {
                  field2121[var6 + field2119 * var1] = var4 | -16777216;
               }

               var0 += var5;
               ++var1;
            }
         }

      }
   }

   @ObfuscatedName("dx")
   public static void method3142(int var0, int var1, int var2, int var3, int var4, int var5) {
      if(var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if(var0 < field2124) {
            var2 -= field2124 - var0;
            var0 = field2124;
         }

         if(var1 < field2122) {
            var6 += (field2122 - var1) * var7;
            var3 -= field2122 - var1;
            var1 = field2122;
         }

         if(var0 + var2 > field2125) {
            var2 = field2125 - var0;
         }

         if(var3 + var1 > field2123) {
            var3 = field2123 - var1;
         }

         int var8 = field2119 - var2;
         int var9 = var0 + field2119 * var1;

         for(int var10 = -var3; var10 < 0; ++var10) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = (var12 * (var5 & 16711935) + var11 * (var4 & 16711935) & -16711936) + (var12 * (var5 & 65280) + var11 * (var4 & 65280) & 16711680) >>> 8;

            for(int var14 = -var2; var14 < 0; ++var14) {
               field2121[var9++] = var13 | -16777216;
            }

            var9 += var8;
            var6 += var7;
         }

      }
   }

   @ObfuscatedName("dh")
   public static void method3206(int var0, int var1, int var2, int var3) {
      if(var0 >= field2124 && var0 < field2125) {
         if(var1 < field2122) {
            var2 -= field2122 - var1;
            var1 = field2122;
         }

         if(var2 + var1 > field2123) {
            var2 = field2123 - var1;
         }

         int var4 = var0 + field2119 * var1;

         for(int var5 = 0; var5 < var2; ++var5) {
            field2121[var4 + var5 * field2119] = var3 | -16777216;
         }

      }
   }

   @ObfuscatedName("dp")
   static void method3143(int var0, int var1, int var2, int var3) {
      if(var2 == 0) {
         method3156(var0, var1, var3);
      } else {
         if(var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if(var4 < field2122) {
            var4 = field2122;
         }

         int var5 = var2 + var1 + 1;
         if(var5 > field2123) {
            var5 = field2123;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if(var1 > var5) {
            var1 = var5;
         }

         int var12;
         int var13;
         int var14;
         int var15;
         while(var6 < var1) {
            while(var11 <= var7 || var10 <= var7) {
               var10 = var10 + var8 + var8;
               var11 += var8++ + var8;
            }

            var12 = var0 - var8 + 1;
            if(var12 < field2124) {
               var12 = field2124;
            }

            var13 = var0 + var8;
            if(var13 > field2125) {
               var13 = field2125;
            }

            var14 = var12 + var6 * field2119;

            for(var15 = var12; var15 < var13; ++var15) {
               field2121[var14++] = var3 | -16777216;
            }

            ++var6;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var7 + var9 * var9;
         var10 = var11 - var2;

         for(var11 -= var9; var6 < var5; var10 += var9++ + var9) {
            while(var11 > var7 && var10 > var7) {
               var11 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            var12 = var0 - var8;
            if(var12 < field2124) {
               var12 = field2124;
            }

            var13 = var0 + var8;
            if(var13 > field2125 - 1) {
               var13 = field2125 - 1;
            }

            var14 = var12 + var6 * field2119;

            for(var15 = var12; var15 <= var13; ++var15) {
               field2121[var14++] = var3 | -16777216;
            }

            ++var6;
            var11 = var11 + var9 + var9;
         }

      }
   }

   @ObfuscatedName("dq")
   static void method3152(int var0, int var1, int var2, int var3, int var4) {
      if(var1 >= field2122 && var1 < field2123) {
         if(var0 < field2124) {
            var2 -= field2124 - var0;
            var0 = field2124;
         }

         if(var0 + var2 > field2125) {
            var2 = field2125 - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = var4 * (var3 & 255);
         int var12 = var0 + field2119 * var1;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = var5 * (field2121[var12] >> 16 & 255);
            int var10 = (field2121[var12] >> 8 & 255) * var5;
            int var11 = var5 * (field2121[var12] & 255);
            int var14 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8);
            client.drawAlpha(field2121, var12++, var14, var3, var4);
         }

      }
   }

   @ObfuscatedName("eg")
   static void method3156(int var0, int var1, int var2) {
      if(var0 >= field2124 && var1 >= field2122 && var0 < field2125 && var1 < field2123) {
         field2121[var0 + field2119 * var1] = var2 | -16777216;
      }
   }

   @ObfuscatedName("dk")
   public static void method3213(int var0, int var1, int var2, int var3) {
      if(var1 >= field2122 && var1 < field2123) {
         if(var0 < field2124) {
            var2 -= field2124 - var0;
            var0 = field2124;
         }

         if(var0 + var2 > field2125) {
            var2 = field2125 - var0;
         }

         int var4 = var0 + field2119 * var1;

         for(int var5 = 0; var5 < var2; ++var5) {
            field2121[var4 + var5] = var3 | -16777216;
         }

      }
   }

   @ObfuscatedName("dz")
   public static void method3150(int var0, int var1, int var2, int var3, int var4, int var5) {
      method3152(var0, var1, var2, var4, var5);
      method3152(var0, var3 + var1 - 1, var2, var4, var5);
      if(var3 >= 3) {
         method3154(var0, var1 + 1, var3 - 2, var4, var5);
         method3154(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   @ObfuscatedName("dw")
   public static void method3144(int var0, int var1, int var2, int var3, int var4) {
      if(var4 != 0) {
         if(var4 == 256) {
            method3143(var0, var1, var2, var3);
         } else {
            if(var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = var4 * (var3 & 255);
            int var12 = var1 - var2;
            if(var12 < field2122) {
               var12 = field2122;
            }

            int var13 = var2 + var1 + 1;
            if(var13 > field2123) {
               var13 = field2123;
            }

            int var14 = var12;
            int var15 = var2 * var2;
            int var16 = 0;
            int var17 = var1 - var12;
            int var18 = var17 * var17;
            int var19 = var18 - var17;
            if(var1 > var13) {
               var1 = var13;
            }

            int var9;
            int var10;
            int var11;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            while(var14 < var1) {
               while(var19 <= var15 || var18 <= var15) {
                  var18 = var18 + var16 + var16;
                  var19 += var16++ + var16;
               }

               var20 = var0 - var16 + 1;
               if(var20 < field2124) {
                  var20 = field2124;
               }

               var21 = var0 + var16;
               if(var21 > field2125) {
                  var21 = field2125;
               }

               var22 = var20 + var14 * field2119;

               for(var23 = var20; var23 < var21; ++var23) {
                  var9 = var5 * (field2121[var22] >> 16 & 255);
                  var10 = (field2121[var22] >> 8 & 255) * var5;
                  var11 = var5 * (field2121[var22] & 255);
                  var24 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8);
                  client.drawAlpha(field2121, var22++, var24, var3, var4);
               }

               ++var14;
               var18 -= var17-- + var17;
               var19 -= var17 + var17;
            }

            var16 = var2;
            var17 = -var17;
            var19 = var15 + var17 * var17;
            var18 = var19 - var2;

            for(var19 -= var17; var14 < var13; var18 += var17++ + var17) {
               while(var19 > var15 && var18 > var15) {
                  var19 -= var16-- + var16;
                  var18 -= var16 + var16;
               }

               var20 = var0 - var16;
               if(var20 < field2124) {
                  var20 = field2124;
               }

               var21 = var0 + var16;
               if(var21 > field2125 - 1) {
                  var21 = field2125 - 1;
               }

               var22 = var20 + var14 * field2119;

               for(var23 = var20; var23 <= var21; ++var23) {
                  var9 = var5 * (field2121[var22] >> 16 & 255);
                  var10 = (field2121[var22] >> 8 & 255) * var5;
                  var11 = var5 * (field2121[var22] & 255);
                  var24 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8);
                  client.drawAlpha(field2121, var22++, var24, var3, var4);
               }

               ++var14;
               var19 = var19 + var17 + var17;
            }

         }
      }
   }

   @ObfuscatedName("df")
   static void method3154(int var0, int var1, int var2, int var3, int var4) {
      if(var0 >= field2124 && var0 < field2125) {
         if(var1 < field2122) {
            var2 -= field2122 - var1;
            var1 = field2122;
         }

         if(var2 + var1 > field2123) {
            var2 = field2123 - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = var4 * (var3 & 255);
         int var12 = var0 + field2119 * var1;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = var5 * (field2121[var12] >> 16 & 255);
            int var10 = (field2121[var12] >> 8 & 255) * var5;
            int var11 = var5 * (field2121[var12] & 255);
            int var14 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8);
            client.drawAlpha(field2121, var12, var14, var3, var4);
            var12 += field2119;
         }

      }
   }

   @ObfuscatedName("dr")
   public static void method3189(int[] var0) {
      var0[0] = field2124;
      var0[1] = field2122;
      var0[2] = field2125;
      var0[3] = field2123;
   }

   @ObfuscatedName("dn")
   public static void method3151() {
      field2124 = 0;
      field2122 = 0;
      field2125 = field2119;
      field2123 = field2120;
   }

   @ObfuscatedName("da")
   public static void method3158(int var0, int var1, int var2, int var3) {
      if(field2124 < var0) {
         field2124 = var0;
      }

      if(field2122 < var1) {
         field2122 = var1;
      }

      if(field2125 > var2) {
         field2125 = var2;
      }

      if(field2123 > var3) {
         field2123 = var3;
      }

   }

   @ObfuscatedName("de")
   public static void method3148(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      int var9 = class302.field3755.getGraphicsPixelsWidth();
      int var10 = class302.field3755.getGraphicsPixelsHeight();
      int[] var11 = class302.field3755.getGraphicsPixels();
      if(!class302.field3755.isGpu()) {
         client.copy$raster2d7(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      } else {
         if(var0 + var2 >= 0 && var3 + var1 >= 0 && var0 < var9 && var1 < var10) {
            int var12 = 0;
            int var13 = 0;
            if(var0 < 0) {
               var12 -= var0;
               var2 += var0;
            }

            if(var1 < 0) {
               var13 -= var1;
               var3 += var1;
            }

            if(var0 + var2 > var9) {
               var2 = var9 - var0;
            }

            if(var3 + var1 > var10) {
               var3 = var10 - var1;
            }

            int var14 = var6.length / var7;
            int var15 = var9 - var2;
            int var16 = var4 >>> 24;
            int var17 = var5 >>> 24;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            if(var16 == 255 && var17 == 255) {
               var18 = var0 + var12 + var9 * (var13 + var1);

               for(var19 = var13 + var1; var19 < var3 + var13 + var1; ++var19) {
                  for(var20 = var0 + var12; var20 < var0 + var12 + var2; ++var20) {
                     var21 = (var19 - var1) % var14;
                     var22 = (var20 - var0) % var7;
                     if(var6[var22 + var21 * var7] != 0) {
                        var11[var18++] = var5;
                     } else {
                        var11[var18++] = var4;
                     }
                  }

                  var18 += var15;
               }
            } else {
               var18 = var0 + var12 + var9 * (var13 + var1);

               for(var19 = var13 + var1; var19 < var3 + var13 + var1; ++var19) {
                  for(var20 = var0 + var12; var20 < var0 + var12 + var2; ++var20) {
                     var21 = (var19 - var1) % var14;
                     var22 = (var20 - var0) % var7;
                     int var23 = var4;
                     if(var6[var22 + var21 * var7] != 0) {
                        var23 = var5;
                     }

                     int var24 = var23 >>> 24;
                     client.drawAlpha(var11, var18++, 0, var23, var24);
                  }

                  var18 += var15;
               }
            }
         }

      }
   }

   @ObfuscatedName("di")
   public static void method3149(int var0, int var1, int var2, int var3, int var4) {
      method3213(var0, var1, var2, var4);
      method3213(var0, var3 + var1 - 1, var2, var4);
      method3206(var0, var1, var3, var4);
      method3206(var0 + var2 - 1, var1, var3, var4);
   }
}
