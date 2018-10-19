package net.runelite.client.standalone;

import java.net.URL;

import net.runelite.api.Constants;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
public class class156 {
   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      signature = "[Lle;"
   )
   static class32[] field1484;
   @ObfuscatedName("f")
   final URL field1489;
   @ObfuscatedName("l")
   volatile boolean field1485;
   @ObfuscatedName("w")
   volatile byte[] field1486;

   class156(URL var1) {
      this.field1489 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "76"
   )
   public boolean method2728() {
      return this.field1485;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)[B",
      garbageValue = "-1357685877"
   )
   public byte[] method2727() {
      return this.field1486;
   }

   @ObfuscatedName("f")
   public static final int method2739(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if(var2 != 0.0D) {
         double var12;
         if(var4 < 0.5D) {
            var12 = (1.0D + var2) * var4;
         } else {
            var12 = var4 + var2 - var4 * var2;
         }

         double var14 = var4 * 2.0D - var12;
         double var16 = var0 + 0.3333333333333333D;
         if(var16 > 1.0D) {
            --var16;
         }

         double var20 = var0 - 0.3333333333333333D;
         if(var20 < 0.0D) {
            ++var20;
         }

         if(var16 * 6.0D < 1.0D) {
            var6 = var14 + (var12 - var14) * 6.0D * var16;
         } else if(2.0D * var16 < 1.0D) {
            var6 = var12;
         } else if(3.0D * var16 < 2.0D) {
            var6 = var14 + (0.6666666666666666D - var16) * (var12 - var14) * 6.0D;
         } else {
            var6 = var14;
         }

         if(var0 * 6.0D < 1.0D) {
            var8 = 6.0D * (var12 - var14) * var0 + var14;
         } else if(2.0D * var0 < 1.0D) {
            var8 = var12;
         } else if(var0 * 3.0D < 2.0D) {
            var8 = 6.0D * (var12 - var14) * (0.6666666666666666D - var0) + var14;
         } else {
            var8 = var14;
         }

         if(var20 * 6.0D < 1.0D) {
            var10 = var14 + (var12 - var14) * 6.0D * var20;
         } else if(2.0D * var20 < 1.0D) {
            var10 = var12;
         } else if(var20 * 3.0D < 2.0D) {
            var10 = 6.0D * (0.6666666666666666D - var20) * (var12 - var14) + var14;
         } else {
            var10 = var14;
         }
      }

      int var22 = (int)(var6 * 256.0D);
      int var13 = (int)(var8 * 256.0D);
      int var23 = (int)(256.0D * var10);
      int var15 = var23 + (var13 << 8) + (var22 << 16);
      return var15;
   }

   @ObfuscatedName("ju")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1938674176"
   )
   static final void method2736() {
      class205.method3503();
      if(class165.field1533 != null) {
         class165.field1533.method2984();
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-1795154637"
   )
   static final int method2740(int var0, int var1) {
      if(var0 == -1) {
         return 12345678;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & 65408) + var1;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(CB)Z",
      garbageValue = "1"
   )
   public static boolean method2741(char var0) {
      if((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if(var0 != 0) {
            char[] var1 = class20.field156;

            for(int var2 = 0; var2 < var1.length; ++var2) {
               char var3 = var1[var2];
               if(var0 == var3) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lik;Lik;ZII)V",
      garbageValue = "-1181238776"
   )
   static void method2737(class148 var0, class148 var1, boolean var2, int var3) {
      if(class325.field3489) {
         if(var3 == 4) {
            class325.field3492 = 4;
         }

      } else {
         class325.field3492 = var3;
         class89.method1531();
         byte[] var4 = var0.method2599("title.jpg", "");
         class325.field3500 = class135.method2509(var4);
         class275.field3008 = class325.field3500.method383();
         if((client.field3733 & 536870912) != 0) {
            class189.logoSprite = class146.method2574(var1, "logo_deadman_mode", "");
         } else {
            class189.logoSprite = class146.method2574(var1, "logo", "");
         }

         class325.field3475 = class146.method2574(var1, "titlebox", "");
         class325.field3468 = class146.method2574(var1, "titlebutton", "");
         int var6 = var1.method2602("runes");
         int var7 = var1.method2581(var6, "");
         class32[] var5 = class328.method5877(var1, var6, var7);
         class188.field1798 = var5;
         var7 = var1.method2602("title_mute");
         int var8 = var1.method2581(var7, "");
         class32[] var10 = class328.method5877(var1, var7, var8);
         class306.field3274 = var10;
         class325.field3470 = class146.method2574(var1, "options_radio_buttons,0", "");
         class5.field37 = class146.method2574(var1, "options_radio_buttons,4", "");
         class201.field1946 = class146.method2574(var1, "options_radio_buttons,2", "");
         class313.field3373 = class146.method2574(var1, "options_radio_buttons,6", "");
         class176.field1684 = class325.field3470.field257;
         class67.field620 = class325.field3470.field260;
         class2.field14 = new int[256];

         for(var7 = 0; var7 < 64; ++var7) {
            class2.field14[var7] = var7 * 262144;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            class2.field14[var7 + 64] = var7 * 1024 + 16711680;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            class2.field14[var7 + 128] = var7 * 4 + 16776960;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            class2.field14[var7 + 192] = 16777215;
         }

         class272.field2979 = new int[256];

         for(var7 = 0; var7 < 64; ++var7) {
            class272.field2979[var7] = var7 * 1024;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            class272.field2979[var7 + 64] = var7 * 4 + 65280;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            class272.field2979[var7 + 128] = var7 * 262144 + 65535;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            class272.field2979[var7 + 192] = 16777215;
         }

         class113.field1063 = new int[256];

         for(var7 = 0; var7 < 64; ++var7) {
            class113.field1063[var7] = var7 * 4;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            class113.field1063[var7 + 64] = var7 * 262144 + 255;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            class113.field1063[var7 + 128] = var7 * 1024 + 16711935;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            class113.field1063[var7 + 192] = 16777215;
         }

         class118.field1089 = new int[256];
         class293.field3166 = new int['耀'];
         class180.field1713 = new int['耀'];
         class330.method5932((class32)null);
         class48.field365 = new int['耀'];
         class226.field2226 = new int['耀'];
         if(var2) {
            class325.field3480 = "";
            client.onUsernameChanged(-1);
            class325.field3490 = "";
         }

         class177.field1688 = 0;
         class10.field84 = "";
         class325.field3493 = true;
         class325.field3497 = false;
         if(!class153.field1455.field1857) {
            class108 var11 = client.field4007;
            var8 = var11.method2602("scape main");
            int var9 = var11.method2581(var8, "");
            class326.method5777(2, var11, var8, var9, 255, false);
         } else {
            class294.method5135(2);
         }

         class70.method1170(false);
         class325.field3489 = true;
         class325.field3501 = (class47.field359 - 765) / 2;
         class325.field3482 = class325.field3501 + 202;
         class251.field2488 = class325.field3482 + 180;
         class325.field3500.method376(class325.field3501, 0);
         class275.field3008.method376(class325.field3501 + 382, 0);
         class189.logoSprite.method530(class325.field3501 + 382 - class189.logoSprite.field257 / 2, Constants.LOGO_Y_OFFSET);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgl;IB)V",
      garbageValue = "4"
   )
   static void method2729(class214 var0, int var1) {
      boolean var2 = var0.readBits(1) == 1;
      if(var2) {
         class11.field94[++class11.field97 - 1] = var1;
      }

      int var3 = var0.readBits(2);
      class63 var4 = client.field3848[var1];
      if(var3 == 0) {
         if(var2) {
            var4.field601 = false;
         } else if(client.field3765 == var1) {
            throw new RuntimeException();
         } else {
            class11.field89[var1] = (var4.field580 << 28) + (class284.somey + var4.field1315[0] >> 13) + (class296.somex + var4.field1288[0] >> 13 << 14);
            if(var4.field1301 != -1) {
               class11.field95[var1] = var4.field1301;
            } else {
               class11.field95[var1] = var4.field1310;
            }

            class11.field96[var1] = var4.field1285;
            client.field3848[var1] = null;
            client.cachedPlayersChanged(var1);
            if(var0.readBits(1) != 0) {
               class192.method3295(var0, var1);
            }

         }
      } else {
         int var5;
         int var6;
         int var7;
         if(var3 == 1) {
            var5 = var0.readBits(3);
            var6 = var4.field1288[0];
            var7 = var4.field1315[0];
            if(var5 == 0) {
               --var6;
               --var7;
            } else if(var5 == 1) {
               --var7;
            } else if(var5 == 2) {
               ++var6;
               --var7;
            } else if(var5 == 3) {
               --var6;
            } else if(var5 == 4) {
               ++var6;
            } else if(var5 == 5) {
               --var6;
               ++var7;
            } else if(var5 == 6) {
               ++var7;
            } else if(var5 == 7) {
               ++var6;
               ++var7;
            }

            if(client.field3765 != var1 || var4.field1277 >= 1536 && var4.field1259 >= 1536 && var4.field1277 < 11776 && var4.field1259 < 11776) {
               if(var2) {
                  var4.field601 = true;
                  var4.field602 = var6;
                  var4.field581 = var7;
               } else {
                  var4.field601 = false;
                  var4.method1081(var6, var7, class11.field93[var1]);
               }
            } else {
               var4.method1095(var6, var7);
               var4.field601 = false;
            }

         } else if(var3 == 2) {
            var5 = var0.readBits(4);
            var6 = var4.field1288[0];
            var7 = var4.field1315[0];
            if(var5 == 0) {
               var6 -= 2;
               var7 -= 2;
            } else if(var5 == 1) {
               --var6;
               var7 -= 2;
            } else if(var5 == 2) {
               var7 -= 2;
            } else if(var5 == 3) {
               ++var6;
               var7 -= 2;
            } else if(var5 == 4) {
               var6 += 2;
               var7 -= 2;
            } else if(var5 == 5) {
               var6 -= 2;
               --var7;
            } else if(var5 == 6) {
               var6 += 2;
               --var7;
            } else if(var5 == 7) {
               var6 -= 2;
            } else if(var5 == 8) {
               var6 += 2;
            } else if(var5 == 9) {
               var6 -= 2;
               ++var7;
            } else if(var5 == 10) {
               var6 += 2;
               ++var7;
            } else if(var5 == 11) {
               var6 -= 2;
               var7 += 2;
            } else if(var5 == 12) {
               --var6;
               var7 += 2;
            } else if(var5 == 13) {
               var7 += 2;
            } else if(var5 == 14) {
               ++var6;
               var7 += 2;
            } else if(var5 == 15) {
               var6 += 2;
               var7 += 2;
            }

            if(client.field3765 != var1 || var4.field1277 >= 1536 && var4.field1259 >= 1536 && var4.field1277 < 11776 && var4.field1259 < 11776) {
               if(var2) {
                  var4.field601 = true;
                  var4.field602 = var6;
                  var4.field581 = var7;
               } else {
                  var4.field601 = false;
                  var4.method1081(var6, var7, class11.field93[var1]);
               }
            } else {
               var4.method1095(var6, var7);
               var4.field601 = false;
            }

         } else {
            var5 = var0.readBits(1);
            int var8;
            int var9;
            int var10;
            int var11;
            if(var5 == 0) {
               var6 = var0.readBits(12);
               var7 = var6 >> 10;
               var8 = var6 >> 5 & 31;
               if(var8 > 15) {
                  var8 -= 32;
               }

               var9 = var6 & 31;
               if(var9 > 15) {
                  var9 -= 32;
               }

               var10 = var8 + var4.field1288[0];
               var11 = var9 + var4.field1315[0];
               if(client.field3765 == var1 && (var4.field1277 < 1536 || var4.field1259 < 1536 || var4.field1277 >= 11776 || var4.field1259 >= 11776)) {
                  var4.method1095(var10, var11);
                  var4.field601 = false;
               } else if(var2) {
                  var4.field601 = true;
                  var4.field602 = var10;
                  var4.field581 = var11;
               } else {
                  var4.field601 = false;
                  var4.method1081(var10, var11, class11.field93[var1]);
               }

               var4.field580 = (byte)(var7 + var4.field580 & 3);
               if(client.field3765 == var1) {
                  class315.plane = var4.field580;
               }

            } else {
               var6 = var0.readBits(30);
               var7 = var6 >> 28;
               var8 = var6 >> 14 & 16383;
               var9 = var6 & 16383;
               var10 = (var8 + class296.somex + var4.field1288[0] & 16383) - class296.somex;
               var11 = (var9 + class284.somey + var4.field1315[0] & 16383) - class284.somey;
               if(client.field3765 == var1 && (var4.field1277 < 1536 || var4.field1259 < 1536 || var4.field1277 >= 11776 || var4.field1259 >= 11776)) {
                  var4.method1095(var10, var11);
                  var4.field601 = false;
               } else if(var2) {
                  var4.field601 = true;
                  var4.field602 = var10;
                  var4.field581 = var11;
               } else {
                  var4.field601 = false;
                  var4.method1081(var10, var11, class11.field93[var1]);
               }

               var4.field580 = (byte)(var7 + var4.field580 & 3);
               if(client.field3765 == var1) {
                  class315.plane = var4.field580;
               }

            }
         }
      }
   }

   @ObfuscatedName("jp")
   @ObfuscatedSignature(
      signature = "(Lhw;IIII)V",
      garbageValue = "-885995524"
   )
   static final void method2735(class329 var0, int var1, int var2, int var3) {
      class123 var4 = var0.method5887(false);
      if(var4 != null) {
         if(client.minimapState < 3) {
            class150.field1436.method394(var1, var2, var4.field1174, var4.field1171, 25, 25, client.field3802, 256, var4.field1172, var4.field1169);
         } else {
            class89.method1551(var1, var2, 0, var4.field1172, var4.field1169);
         }

      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-9"
   )
   public static void method2730(int var0) {
      class226.field2209 = var0;
   }
}
