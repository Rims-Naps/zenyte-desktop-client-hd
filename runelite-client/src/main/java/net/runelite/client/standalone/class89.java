package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
public class class89 extends class193 {
   @ObfuscatedName("af")
   public static int field862;
   @ObfuscatedName("aw")
   protected static int field868;
   @ObfuscatedName("ac")
   public static int field866;
   @ObfuscatedName("ag")
   public static int[] field864;
   @ObfuscatedName("az")
   public static int field863;
   @ObfuscatedName("am")
   public static int field867;
   @ObfuscatedName("at")
   public static int field865;

   static {
      field865 = 0;
      field866 = 0;
      field867 = 0;
      field868 = 0;
   }

   @ObfuscatedName("eg")
   static void method1550(int var0, int var1, int var2) {
      if(var0 >= field867 && var1 >= field865 && var0 < field868 && var1 < field866) {
         field864[var0 + field862 * var1] = var2;
      }
   }

   @ObfuscatedName("dk")
   public static void method1607(int var0, int var1, int var2, int var3) {
      if(var1 >= field865 && var1 < field866) {
         if(var0 < field867) {
            var2 -= field867 - var0;
            var0 = field867;
         }

         if(var0 + var2 > field868) {
            var2 = field868 - var0;
         }

         int var4 = var0 + field862 * var1;

         for(int var5 = 0; var5 < var2; ++var5) {
            field864[var4 + var5] = var3;
         }

      }
   }

   @ObfuscatedName("dq")
   static void method1546(int var0, int var1, int var2, int var3, int var4) {
      if(var1 >= field865 && var1 < field866) {
         if(var0 < field867) {
            var2 -= field867 - var0;
            var0 = field867;
         }

         if(var0 + var2 > field868) {
            var2 = field868 - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = var4 * (var3 & 255);
         int var12 = var0 + field862 * var1;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = var5 * (field864[var12] >> 16 & 255);
            int var10 = (field864[var12] >> 8 & 255) * var5;
            int var11 = var5 * (field864[var12] & 255);
            int var14 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8);
            field864[var12++] = var14;
         }

      }
   }

   @ObfuscatedName("da")
   public static void method1552(int var0, int var1, int var2, int var3) {
      if(field867 < var0) {
         field867 = var0;
      }

      if(field865 < var1) {
         field865 = var1;
      }

      if(field868 > var2) {
         field868 = var2;
      }

      if(field866 > var3) {
         field866 = var3;
      }

   }

   @ObfuscatedName("dx")
   public static void method1536(int var0, int var1, int var2, int var3, int var4, int var5) {
      if(var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if(var0 < field867) {
            var2 -= field867 - var0;
            var0 = field867;
         }

         if(var1 < field865) {
            var6 += (field865 - var1) * var7;
            var3 -= field865 - var1;
            var1 = field865;
         }

         if(var0 + var2 > field868) {
            var2 = field868 - var0;
         }

         if(var3 + var1 > field866) {
            var3 = field866 - var1;
         }

         int var8 = field862 - var2;
         int var9 = var0 + field862 * var1;

         for(int var10 = -var3; var10 < 0; ++var10) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = (var12 * (var5 & 16711935) + var11 * (var4 & 16711935) & -16711936) + (var12 * (var5 & 65280) + var11 * (var4 & 65280) & 16711680) >>> 8;

            for(int var14 = -var2; var14 < 0; ++var14) {
               field864[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
         }

      }
   }

   @ObfuscatedName("dg")
   public static void method1561(int var0, int var1, int var2, int var3, int var4) {
      if(var0 < field867) {
         var2 -= field867 - var0;
         var0 = field867;
      }

      if(var1 < field865) {
         var3 -= field865 - var1;
         var1 = field865;
      }

      if(var0 + var2 > field868) {
         var2 = field868 - var0;
      }

      if(var3 + var1 > field866) {
         var3 = field866 - var1;
      }

      int var5 = field862 - var2;
      int var6 = var0 + field862 * var1;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            field864[var6++] = var4;
         }

         var6 += var5;
      }

   }

   @ObfuscatedName("du")
   public static void method1539(int var0, int var1, int var2, int var3, int var4, int var5) {
      if(var0 < field867) {
         var2 -= field867 - var0;
         var0 = field867;
      }

      if(var1 < field865) {
         var3 -= field865 - var1;
         var1 = field865;
      }

      if(var0 + var2 > field868) {
         var2 = field868 - var0;
      }

      if(var3 + var1 > field866) {
         var3 = field866 - var1;
      }

      var4 = (var5 * (var4 & 16711935) >> 8 & 16711935) + (var5 * (var4 & 65280) >> 8 & 65280);
      int var6 = 256 - var5;
      int var7 = field862 - var2;
      int var8 = var0 + field862 * var1;

      for(int var9 = 0; var9 < var3; ++var9) {
         for(int var10 = -var2; var10 < 0; ++var10) {
            int var11 = field864[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + (var6 * (var11 & 65280) >> 8 & 65280);
            field864[var8++] = var11 + var4;
         }

         var8 += var7;
      }

   }

   @ObfuscatedName("df")
   static void method1548(int var0, int var1, int var2, int var3, int var4) {
      if(var0 >= field867 && var0 < field868) {
         if(var1 < field865) {
            var2 -= field865 - var1;
            var1 = field865;
         }

         if(var2 + var1 > field866) {
            var2 = field866 - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = var4 * (var3 & 255);
         int var12 = var0 + field862 * var1;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = var5 * (field864[var12] >> 16 & 255);
            int var10 = (field864[var12] >> 8 & 255) * var5;
            int var11 = var5 * (field864[var12] & 255);
            int var14 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8);
            field864[var12] = var14;
            var12 += field862;
         }

      }
   }

   @ObfuscatedName("dn")
   public static void method1545() {
      field867 = 0;
      field865 = 0;
      field868 = field862;
      field866 = field863;
   }

   @ObfuscatedName("dv")
   public static void method1530(int[] var0, int var1, int var2) {
      field864 = var0;
      field862 = var1;
      field863 = var2;
      method1532(0, 0, var1, var2);
   }

   @ObfuscatedName("dw")
   public static void method1538(int var0, int var1, int var2, int var3, int var4) {
      if(var4 != 0) {
         if(var4 == 256) {
            method1537(var0, var1, var2, var3);
         } else {
            if(var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = var4 * (var3 & 255);
            int var12 = var1 - var2;
            if(var12 < field865) {
               var12 = field865;
            }

            int var13 = var2 + var1 + 1;
            if(var13 > field866) {
               var13 = field866;
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
               if(var20 < field867) {
                  var20 = field867;
               }

               var21 = var0 + var16;
               if(var21 > field868) {
                  var21 = field868;
               }

               var22 = var20 + var14 * field862;

               for(var23 = var20; var23 < var21; ++var23) {
                  var9 = var5 * (field864[var22] >> 16 & 255);
                  var10 = (field864[var22] >> 8 & 255) * var5;
                  var11 = var5 * (field864[var22] & 255);
                  var24 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8);
                  field864[var22++] = var24;
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
               if(var20 < field867) {
                  var20 = field867;
               }

               var21 = var0 + var16;
               if(var21 > field868 - 1) {
                  var21 = field868 - 1;
               }

               var22 = var20 + var14 * field862;

               for(var23 = var20; var23 <= var21; ++var23) {
                  var9 = var5 * (field864[var22] >> 16 & 255);
                  var10 = (field864[var22] >> 8 & 255) * var5;
                  var11 = var5 * (field864[var22] & 255);
                  var24 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8);
                  field864[var22++] = var24;
               }

               ++var14;
               var19 = var19 + var17 + var17;
            }

         }
      }
   }

   @ObfuscatedName("ds")
   public static void method1541(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = 65536 / var3;
         if(var0 < field867) {
            var2 -= field867 - var0;
            var0 = field867;
         }

         if(var1 < field865) {
            var8 += (field865 - var1) * var9;
            var3 -= field865 - var1;
            var1 = field865;
         }

         if(var0 + var2 > field868) {
            var2 = field868 - var0;
         }

         if(var3 + var1 > field866) {
            var3 = field866 - var1;
         }

         int var10 = field862 - var2;
         int var11 = var0 + field862 * var1;

         for(int var12 = -var3; var12 < 0; ++var12) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (var13 * var6 + var14 * var7 & 65280) >>> 8;
            if(var15 == 0) {
               var11 += field862;
               var8 += var9;
            } else {
               int var16 = (var14 * (var5 & 16711935) + var13 * (var4 & 16711935) & -16711936) + (var14 * (var5 & 65280) + var13 * (var4 & 65280) & 16711680) >>> 8;
               int var17 = 255 - var15;
               int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + (var15 * (var16 & 65280) >> 8 & 65280);

               for(int var19 = -var2; var19 < 0; ++var19) {
                  int var20 = field864[var11];
                  if(var20 == 0) {
                     field864[var11++] = var18;
                  } else {
                     var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + (var17 * (var20 & 65280) >> 8 & 65280);
                     field864[var11++] = var18 + var20;
                  }
               }

               var11 += var10;
               var8 += var9;
            }
         }

      }
   }

   @ObfuscatedName("dc")
   public static void method1535(int[] var0) {
      field867 = var0[0];
      field865 = var0[1];
      field868 = var0[2];
      field866 = var0[3];
   }

   @ObfuscatedName("do")
   public static void method1532(int var0, int var1, int var2, int var3) {
      if(var0 < 0) {
         var0 = 0;
      }

      if(var1 < 0) {
         var1 = 0;
      }

      if(var2 > field862) {
         var2 = field862;
      }

      if(var3 > field863) {
         var3 = field863;
      }

      field867 = var0;
      field865 = var1;
      field868 = var2;
      field866 = var3;
   }

   @ObfuscatedName("db")
   public static void method1531() {
      int var0 = 0;

      int var1;
      for(var1 = field862 * field863 - 7; var0 < var1; field864[var0++] = 0) {
         field864[var0++] = 0;
         field864[var0++] = 0;
         field864[var0++] = 0;
         field864[var0++] = 0;
         field864[var0++] = 0;
         field864[var0++] = 0;
         field864[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; field864[var0++] = 0) {
         ;
      }

   }

   @ObfuscatedName("di")
   public static void method1543(int var0, int var1, int var2, int var3, int var4) {
      method1607(var0, var1, var2, var4);
      method1607(var0, var3 + var1 - 1, var2, var4);
      method1600(var0, var1, var3, var4);
      method1600(var0 + var2 - 1, var1, var3, var4);
   }

   @ObfuscatedName("dp")
   static void method1537(int var0, int var1, int var2, int var3) {
      if(var2 == 0) {
         method1550(var0, var1, var3);
      } else {
         if(var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if(var4 < field865) {
            var4 = field865;
         }

         int var5 = var2 + var1 + 1;
         if(var5 > field866) {
            var5 = field866;
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
            if(var12 < field867) {
               var12 = field867;
            }

            var13 = var0 + var8;
            if(var13 > field868) {
               var13 = field868;
            }

            var14 = var12 + var6 * field862;

            for(var15 = var12; var15 < var13; ++var15) {
               field864[var14++] = var3;
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
            if(var12 < field867) {
               var12 = field867;
            }

            var13 = var0 + var8;
            if(var13 > field868 - 1) {
               var13 = field868 - 1;
            }

            var14 = var12 + var6 * field862;

            for(var15 = var12; var15 <= var13; ++var15) {
               field864[var14++] = var3;
            }

            ++var6;
            var11 = var11 + var9 + var9;
         }

      }
   }

   @ObfuscatedName("dr")
   public static void method1583(int[] var0) {
      var0[0] = field867;
      var0[1] = field865;
      var0[2] = field868;
      var0[3] = field866;
   }

   @ObfuscatedName("dz")
   public static void method1544(int var0, int var1, int var2, int var3, int var4, int var5) {
      method1546(var0, var1, var2, var4, var5);
      method1546(var0, var3 + var1 - 1, var2, var4, var5);
      if(var3 >= 3) {
         method1548(var0, var1 + 1, var3 - 2, var4, var5);
         method1548(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   @ObfuscatedName("ey")
   public static void method1551(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + field862 * var1;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            field864[var6++] = var2;
         }

         var5 += field862;
      }

   }

   @ObfuscatedName("dj")
   public static void method1547(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if(var3 == 0) {
         if(var2 >= 0) {
            method1607(var0, var1, var2 + 1, var4);
         } else {
            method1607(var0 + var2, var1, -var2 + 1, var4);
         }

      } else if(var2 == 0) {
         if(var3 >= 0) {
            method1600(var0, var1, var3 + 1, var4);
         } else {
            method1600(var0, var3 + var1, -var3 + 1, var4);
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
            if(var0 < field867) {
               var1 += var5 * (field867 - var0);
               var0 = field867;
            }

            if(var2 >= field868) {
               var2 = field868 - 1;
            }

            while(var0 <= var2) {
               var6 = var1 >> 16;
               if(var6 >= field865 && var6 < field866) {
                  field864[var0 + var6 * field862] = var4;
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
            if(var1 < field865) {
               var0 += (field865 - var1) * var5;
               var1 = field865;
            }

            if(var3 >= field866) {
               var3 = field866 - 1;
            }

            while(var1 <= var3) {
               var6 = var0 >> 16;
               if(var6 >= field867 && var6 < field868) {
                  field864[var6 + field862 * var1] = var4;
               }

               var0 += var5;
               ++var1;
            }
         }

      }
   }

   @ObfuscatedName("dh")
   public static void method1600(int var0, int var1, int var2, int var3) {
      if(var0 >= field867 && var0 < field868) {
         if(var1 < field865) {
            var2 -= field865 - var1;
            var1 = field865;
         }

         if(var2 + var1 > field866) {
            var2 = field866 - var1;
         }

         int var4 = var0 + field862 * var1;

         for(int var5 = 0; var5 < var2; ++var5) {
            field864[var4 + var5 * field862] = var3;
         }

      }
   }

   @ObfuscatedName("de")
   @ObfuscatedSignature(
      signature = "(IIIIII[BIZ)V",
      garbageValue = "1"
   )
   public static void method1542(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7) {
      if(var0 + var2 >= 0 && var3 + var1 >= 0) {
         if(var0 < field862 && var1 < field863) {
            int var8 = 0;
            int var9 = 0;
            if(var0 < 0) {
               var8 -= var0;
               var2 += var0;
            }

            if(var1 < 0) {
               var9 -= var1;
               var3 += var1;
            }

            if(var0 + var2 > field862) {
               var2 = field862 - var0;
            }

            if(var3 + var1 > field863) {
               var3 = field863 - var1;
            }

            int var10 = var6.length / var7;
            int var11 = field862 - var2;
            int var12 = var4 >>> 24;
            int var13 = var5 >>> 24;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            if(var12 == 255 && var13 == 255) {
               var14 = var0 + var8 + (var9 + var1) * field862;

               for(var15 = var9 + var1; var15 < var3 + var9 + var1; ++var15) {
                  for(var16 = var0 + var8; var16 < var0 + var8 + var2; ++var16) {
                     var17 = (var15 - var1) % var10;
                     var18 = (var16 - var0) % var7;
                     if(var6[var18 + var17 * var7] != 0) {
                        field864[var14++] = var5;
                     } else {
                        field864[var14++] = var4;
                     }
                  }

                  var14 += var11;
               }
            } else {
               var14 = var0 + var8 + (var9 + var1) * field862;

               for(var15 = var9 + var1; var15 < var3 + var9 + var1; ++var15) {
                  for(var16 = var0 + var8; var16 < var0 + var8 + var2; ++var16) {
                     var17 = (var15 - var1) % var10;
                     var18 = (var16 - var0) % var7;
                     int var19 = var4;
                     if(var6[var18 + var17 * var7] != 0) {
                        var19 = var5;
                     }

                     int var20 = var19 >>> 24;
                     int var21 = 255 - var20;
                     int var22 = field864[var14];
                     int var23 = ((var19 & 16711935) * var20 + (var22 & 16711935) * var21 & -16711936) + (var20 * (var19 & 65280) + var21 * (var22 & 65280) & 16711680) >> 8;
                     field864[var14++] = var23;
                  }

                  var14 += var11;
               }
            }

         }
      }
   }
}
