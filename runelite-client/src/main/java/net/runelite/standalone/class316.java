package net.runelite.standalone;

import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.standalone.assets.Assets;

@ObfuscatedName("ea")
public class class316 {
   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      signature = "[Lle;"
   )
   static class303[] field3893;
   @ObfuscatedName("l")
   volatile boolean field3894;
   @ObfuscatedName("f")
   final URL field3898;
   @ObfuscatedName("w")
   volatile byte[] field3895;

   class316(URL var1) {
      this.field3898 = var1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)[B",
      garbageValue = "-1357685877"
   )
   public byte[] method6190() {
      return this.field3895;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "76"
   )
   public boolean method6191() {
      return this.field3894;
   }

   @ObfuscatedName("ju")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1938674176"
   )
   static final void method6199() {
      class233.method4665();
      if(class250.field3328 != null) {
         class250.field3328.method5089();
      }

   }

   @ObfuscatedName("jp")
   @ObfuscatedSignature(
      signature = "(Lhw;IIII)V",
      garbageValue = "-885995524"
   )
   static final void method6198(class187 var0, int var1, int var2, int var3) {
      class198 var4 = var0.method3762(false);
      if(var4 != null) {
         if(client.field2411 < 3) {
            class307.field3798.method231(var1, var2, var4.field2798, var4.field2795, 25, 25, client.field2223, 256, var4.field2796, var4.field2793);
         } else {
            Rasterizer2D.method3157(var1, var2, 0, var4.field2796, var4.field2793);
         }

      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(CB)Z",
      garbageValue = "1"
   )
   public static boolean method6204(char var0) {
      if((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if(var0 != 0) {
            char[] var1 = class284.field3566;

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
   static void method6200(Js5Index var0, Js5Index var1, boolean var2, int var3) {
      if(class39.field395) {
         if(var3 == 4) {
            class39.field398 = 4;
         }

      } else {
         class39.field398 = var3;
         Rasterizer2D.method3137();
         /*byte[] var4 = var0.takeRecordByNames("title.jpg", "");
         class39.leftBackground = class96.method1774(var4);
         class107.rightBackground = class39.leftBackground.method220();*/
         Assets.init();
         if((client.field2154 & 536870912) != 0) {
            class48.field545 = class124.method2237(var1, "logo_deadman_mode", "");
         } else {
            class48.field545 = class124.method2237(var1, "logo", "");
         }

         class39.field381 = class124.method2237(var1, "titlebox", "");
         class39.field374 = class124.method2237(var1, "titlebutton", "");
         int var6 = var1.getGroupId("runes");
         int var7 = var1.getChild(var6, "");
         class303[] var5 = class159.method2957(var1, var6, var7);
         class142.field1805 = var5;
         var7 = var1.getGroupId("title_mute");
         int var8 = var1.getChild(var7, "");
         class303[] var10 = class159.method2957(var1, var7, var8);
         class121.field1651 = var10;
         class39.field376 = class124.method2237(var1, "options_radio_buttons,0", "");
         class32.field297 = class124.method2237(var1, "options_radio_buttons,4", "");
         class135.field1744 = class124.method2237(var1, "options_radio_buttons,2", "");
         class174.field2127 = class124.method2237(var1, "options_radio_buttons,6", "");
         class213.field2929 = class39.field376.field3759;
         class164.field1990 = class39.field376.field3762;
         MapIcon.field249 = new int[256];

         for(var7 = 0; var7 < 64; ++var7) {
            MapIcon.field249[var7] = var7 * 262144;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            MapIcon.field249[var7 + 64] = var7 * 1024 + 16711680;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            MapIcon.field249[var7 + 128] = var7 * 4 + 16776960;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            MapIcon.field249[var7 + 192] = 16777215;
         }

         class103.field1147 = new int[256];

         for(var7 = 0; var7 < 64; ++var7) {
            class103.field1147[var7] = var7 * 1024;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            class103.field1147[var7 + 64] = var7 * 4 + 65280;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            class103.field1147[var7 + 128] = var7 * 262144 + 65535;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            class103.field1147[var7 + 192] = 16777215;
         }

         class302.field3754 = new int[256];

         for(var7 = 0; var7 < 64; ++var7) {
            class302.field3754[var7] = var7 * 4;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            class302.field3754[var7 + 64] = var7 * 262144 + 255;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            class302.field3754[var7 + 128] = var7 * 1024 + 16711935;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            class302.field3754[var7 + 192] = 16777215;
         }

         class179.field2462 = new int[256];
         class219.field2983 = new int['耀'];
         class218.field2972 = new int['耀'];
         class193.method3915((class303)null);
         class31.field293 = new int['耀'];
         class163.field1986 = new int['耀'];
         if(var2) {
            class39.field386 = "";
            client.onUsernameChanged(-1);
            class39.field396 = "";
         }

         class84.field909 = 0;
         class184.field2510 = "";
         class39.field399 = true;
         class39.field403 = false;
         if(!WorldMapNode.field2134.field855) {
            class6 var11 = client.field2428;
            var8 = var11.getGroupId("scape main");
            int var9 = var11.getChild(var8, "");
            class294.method5775(2, var11, var8, var9, 255, false);
         } else {
            class64.method1353(2);
         }

         class134.method2561(false);
         class39.field395 = true;
         class39.field407 = (class167.field2010 - 765) / 2;
         class39.field388 = class39.field407 + 202;
         class329.field3984 = class39.field388 + 180;
         class39.leftBackground.method213(class39.field407, 0);
         class107.rightBackground.method213(class39.field407 + 382, 0);
         //class48.field545.method5980(class39.field407 + 382 - class48.field545.field3759 / 2, 18);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgl;IB)V",
      garbageValue = "4"
   )
   static void method6192(class1 var0, int var1) {
      boolean var2 = var0.method8(1) == 1;
      if(var2) {
         class152.field1878[++class152.field1881 - 1] = var1;
      }

      int var3 = var0.method8(2);
      class199 var4 = client.field2269[var1];
      if(var3 == 0) {
         if(var2) {
            var4.field2826 = false;
         } else if(client.field2186 == var1) {
            throw new RuntimeException();
         } else {
            class152.field1873[var1] = (var4.field2805 << 28) + (class35.field360 + var4.field1128[0] >> 13) + (class229.field3067 + var4.field1101[0] >> 13 << 14);
            if(var4.field1114 != -1) {
               class152.field1879[var1] = var4.field1114;
            } else {
               class152.field1879[var1] = var4.field1123;
            }

            class152.field1880[var1] = var4.field1098;
            client.field2269[var1] = null;
            client.cachedPlayersChanged(var1);
            if(var0.method8(1) != 0) {
               class225.method4564(var0, var1);
            }

         }
      } else {
         int var5;
         int var6;
         int var7;
         if(var3 == 1) {
            var5 = var0.method8(3);
            var6 = var4.field1101[0];
            var7 = var4.field1128[0];
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

            if(client.field2186 != var1 || var4.field1090 >= 1536 && var4.field1072 >= 1536 && var4.field1090 < 11776 && var4.field1072 < 11776) {
               if(var2) {
                  var4.field2826 = true;
                  var4.field2827 = var6;
                  var4.field2806 = var7;
               } else {
                  var4.field2826 = false;
                  var4.method3947(var6, var7, class152.field1877[var1]);
               }
            } else {
               var4.method3961(var6, var7);
               var4.field2826 = false;
            }

         } else if(var3 == 2) {
            var5 = var0.method8(4);
            var6 = var4.field1101[0];
            var7 = var4.field1128[0];
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

            if(client.field2186 != var1 || var4.field1090 >= 1536 && var4.field1072 >= 1536 && var4.field1090 < 11776 && var4.field1072 < 11776) {
               if(var2) {
                  var4.field2826 = true;
                  var4.field2827 = var6;
                  var4.field2806 = var7;
               } else {
                  var4.field2826 = false;
                  var4.method3947(var6, var7, class152.field1877[var1]);
               }
            } else {
               var4.method3961(var6, var7);
               var4.field2826 = false;
            }

         } else {
            var5 = var0.method8(1);
            int var8;
            int var9;
            int var10;
            int var11;
            if(var5 == 0) {
               var6 = var0.method8(12);
               var7 = var6 >> 10;
               var8 = var6 >> 5 & 31;
               if(var8 > 15) {
                  var8 -= 32;
               }

               var9 = var6 & 31;
               if(var9 > 15) {
                  var9 -= 32;
               }

               var10 = var8 + var4.field1101[0];
               var11 = var9 + var4.field1128[0];
               if(client.field2186 == var1 && (var4.field1090 < 1536 || var4.field1072 < 1536 || var4.field1090 >= 11776 || var4.field1072 >= 11776)) {
                  var4.method3961(var10, var11);
                  var4.field2826 = false;
               } else if(var2) {
                  var4.field2826 = true;
                  var4.field2827 = var10;
                  var4.field2806 = var11;
               } else {
                  var4.field2826 = false;
                  var4.method3947(var10, var11, class152.field1877[var1]);
               }

               var4.field2805 = (byte)(var7 + var4.field2805 & 3);
               if(client.field2186 == var1) {
                  class260.field3393 = var4.field2805;
               }

            } else {
               var6 = var0.method8(30);
               var7 = var6 >> 28;
               var8 = var6 >> 14 & 16383;
               var9 = var6 & 16383;
               var10 = (var8 + class229.field3067 + var4.field1101[0] & 16383) - class229.field3067;
               var11 = (var9 + class35.field360 + var4.field1128[0] & 16383) - class35.field360;
               if(client.field2186 == var1 && (var4.field1090 < 1536 || var4.field1072 < 1536 || var4.field1090 >= 11776 || var4.field1072 >= 11776)) {
                  var4.method3961(var10, var11);
                  var4.field2826 = false;
               } else if(var2) {
                  var4.field2826 = true;
                  var4.field2827 = var10;
                  var4.field2806 = var11;
               } else {
                  var4.field2826 = false;
                  var4.method3947(var10, var11, class152.field1877[var1]);
               }

               var4.field2805 = (byte)(var7 + var4.field2805 & 3);
               if(client.field2186 == var1) {
                  class260.field3393 = var4.field2805;
               }

            }
         }
      }
   }

   @ObfuscatedName("f")
   public static final int method6202(double var0, double var2, double var4) {
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

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-1795154637"
   )
   static final int method6203(int var0, int var1) {
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

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-9"
   )
   public static void method6193(int var0) {
      class163.field1969 = var0;
   }
}
