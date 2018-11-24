package net.runelite.standalone;

import java.awt.FontMetrics;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("z")
public class class85 {
   @ObfuscatedName("po")
   @ObfuscatedSignature(
      signature = "Lkr;"
   )
   static class22 field924;
   @ObfuscatedName("gt")
   @ObfuscatedSignature(
      signature = "Llp;"
   )
   static SpritePixels field922;
   @ObfuscatedName("at")
   static FontMetrics field916;
   @ObfuscatedName("hv")
   @ObfuscatedGetter(
      intValue = -1937290983
   )
   static int field912;

   @ObfuscatedName("gr")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2043132530"
   )
   static final int method1626() {
      if(class175.field2134.field854) {
         return class260.field3393;
      } else {
         int var0 = class314.method6140(field912, class116.field1324, class260.field3393);
         return var0 - class229.field3068 < 800 && (class185.field2512[class260.field3393][field912 >> 7][class116.field1324 >> 7] & 4) != 0?class260.field3393:3;
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Lkn;Lkn;Lkn;ZI)V",
      garbageValue = "-758579829"
   )
   static void method1628(class299 var0, class299 var1, class299 var2, boolean var3) {
      if(var3) {
         class39.field407 = (class167.field2010 - 765) / 2;
         class39.field388 = class39.field407 + 202;
         class329.field3984 = class39.field388 + 180;
      }

      if(class39.field403) {
         class99.method1796(var0, var1);
      } else {
         if(var3) {
            class39.leftBackground.method213(class39.field407, 0);
            class107.rightBackground.method213(class39.field407 + 382, 0);
            //class48.field545.method5980(class39.field407 + 382 - class48.field545.field3759 / 2, 18);
         }

         int var5;
         if(client.field2161 == 0 || client.field2161 == 5) {
            byte var4 = 20;
            var0.method3879("Zenyte is loading - please wait...", class39.field388 + 180, 245 - var4, 16777215, -1);
            var5 = 253 - var4;
            class173.method3149(class39.field388 + 180 - 152, var5, 304, 34, 9179409);
            class173.method3149(class39.field388 + 180 - 151, var5 + 1, 302, 32, 0);
            class173.method3167(class39.field388 + 180 - 150, var5 + 2, class39.field375 * 3, 30, 9179409);
            class173.method3167(class39.field375 * 3 + (class39.field388 + 180 - 150), var5 + 2, 300 - class39.field375 * 3, 30, 0);
            var0.method3879(class39.field387, class39.field388 + 180, 276 - var4, 16777215, -1);
         }

         String var7;
         String var9;
         String var10;
         int var11;
         char[] var12;
         int var13;
         char[] var14;
         int var15;
         String var24;
         short var32;
         int var33;
         short var34;
         String var36;
         if(client.field2161 == 20) {
            class39.field381.method5980(class39.field388 + 180 - class39.field381.field3759 / 2, 271 - class39.field381.field3762 / 2);
            var32 = 201;
            var0.method3879(class39.field392, class39.field388 + 180, var32, 16776960, 0);
            var33 = var32 + 15;
            var0.method3879(class39.field393, class39.field388 + 180, var33, 16776960, 0);
            var33 += 15;
            var0.method3879(class39.field394, class39.field388 + 180, var33, 16776960, 0);
            var33 += 15;
            var33 += 7;
            if(class39.field398 != 4) {
               var0.method3832("Login: ", class39.field388 + 180 - 110, var33, 16777215, 0);
               var34 = 200;
               if(!class175.field2134.field861) {
                  var7 = class39.field386;
               } else {
                  var9 = class39.field386;
                  var11 = var9.length();
                  var12 = new char[var11];

                  for(var13 = 0; var13 < var11; ++var13) {
                     var12[var13] = '*';
                  }

                  var10 = new String(var12);
                  var7 = var10;
               }

               for(var7 = var7; var0.method3890(var7) > var34; var7 = var7.substring(0, var7.length() - 1)) {
                  ;
               }

               var0.method3832(class190.method3813(var7), class39.field388 + 180 - 70, var33, 16777215, 0);
               var33 += 15;
               var9 = "Password: ";
               var24 = class39.field396;
               var13 = var24.length();
               var14 = new char[var13];

               for(var15 = 0; var15 < var13; ++var15) {
                  var14[var15] = '*';
               }

               var36 = new String(var14);
               var0.method3832(var9 + var36, class39.field388 + 180 - 108, var33, 16777215, 0);
               var33 += 15;
            }
         }

         if(client.field2161 == 10 || client.field2161 == 11) {
            class39.field381.method5980(class39.field388, 171);
            short var6;
            if(class39.field398 == 0) {
               var32 = 251;
               var0.method3879("Welcome to Zenyte", class39.field388 + 180, var32, 16776960, 0);
               var33 = var32 + 30;
               var5 = class39.field388 + 180 - 80;
               var6 = 291;
               class39.field374.method5980(var5 - 73, var6 - 20);
               var0.method3868("New User", var5 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var5 = class39.field388 + 180 + 80;
               class39.field374.method5980(var5 - 73, var6 - 20);
               var0.method3868("Existing User", var5 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if(class39.field398 == 1) {
               var0.method3879(class39.field391, class39.field388 + 180, 201, 16776960, 0);
               var32 = 236;
               var0.method3879(class39.field392, class39.field388 + 180, var32, 16777215, 0);
               var33 = var32 + 15;
               var0.method3879(class39.field393, class39.field388 + 180, var33, 16777215, 0);
               var33 += 15;
               var0.method3879(class39.field394, class39.field388 + 180, var33, 16777215, 0);
               var33 += 15;
               var5 = class39.field388 + 180 - 80;
               var6 = 321;
               class39.field374.method5980(var5 - 73, var6 - 20);
               var0.method3879("Continue", var5, var6 + 5, 16777215, 0);
               var5 = class39.field388 + 180 + 80;
               class39.field374.method5980(var5 - 73, var6 - 20);
               var0.method3879("Cancel", var5, var6 + 5, 16777215, 0);
            } else {
               int var27;
               if(class39.field398 == 2) {
                  var32 = 201;
                  var0.method3879(class39.field392, class329.field3984, var32, 16776960, 0);
                  var33 = var32 + 15;
                  var0.method3879(class39.field393, class329.field3984, var33, 16776960, 0);
                  var33 += 15;
                  var0.method3879(class39.field394, class329.field3984, var33, 16776960, 0);
                  var33 += 15;
                  var33 += 7;
                  var0.method3832("Login: ", class329.field3984 - 110, var33, 16777215, 0);
                  var34 = 200;
                  if(!class175.field2134.field861) {
                     var7 = class39.field386;
                  } else {
                     var9 = class39.field386;
                     var11 = var9.length();
                     var12 = new char[var11];

                     for(var13 = 0; var13 < var11; ++var13) {
                        var12[var13] = '*';
                     }

                     var10 = new String(var12);
                     var7 = var10;
                  }

                  for(var7 = var7; var0.method3890(var7) > var34; var7 = var7.substring(1)) {
                     ;
                  }

                  var0.method3832(class190.method3813(var7) + (class39.field400 == 0 & client.field2165 % 40 < 20?class64.method1354(16776960) + "|":""), class329.field3984 - 70, var33, 16777215, 0);
                  var33 += 15;
                  var9 = "Password: ";
                  var24 = class39.field396;
                  var13 = var24.length();
                  var14 = new char[var13];

                  for(var15 = 0; var15 < var13; ++var15) {
                     var14[var15] = '*';
                  }

                  var36 = new String(var14);
                  var0.method3832(var9 + var36 + (class39.field400 == 1 & client.field2165 % 40 < 20?class64.method1354(16776960) + "|":""), class329.field3984 - 108, var33, 16777215, 0);
                  var33 += 15;
                  var32 = 277;
                  var27 = class329.field3984 + -117;
                  boolean var28 = client.field2192;
                  boolean var38 = class39.field397;
                  class303 var29 = var28?(var38?class174.field2127:class135.field1744):(var38?class32.field297:class39.field376);
                  var29.method5980(var27, var32);
                  var27 = var27 + var29.field3759 + 5;
                  var1.method3832("Remember username", var27, var32 + 13, 16776960, 0);
                  var27 = class329.field3984 + 24;
                  boolean var18 = class175.field2134.field861;
                  boolean var19 = class39.field372;
                  class303 var17 = var18?(var19?class174.field2127:class135.field1744):(var19?class32.field297:class39.field376);
                  var17.method5980(var27, var32);
                  var27 = var27 + var17.field3759 + 5;
                  var1.method3832("Hide username", var27, var32 + 13, 16776960, 0);
                  var33 = var32 + 15;
                  int var20 = class329.field3984 - 80;
                  short var21 = 321;
                  class39.field374.method5980(var20 - 73, var21 - 20);
                  var0.method3879("Login", var20, var21 + 5, 16777215, 0);
                  var20 = class329.field3984 + 80;
                  class39.field374.method5980(var20 - 73, var21 - 20);
                  var0.method3879("Cancel", var20, var21 + 5, 16777215, 0);
                  var32 = 357;
                  switch(class39.field389) {
                  case 2:
                     class110.field1218 = "Having trouble logging in?";
                     break;
                  default:
                     class110.field1218 = "Forgotten your password? <col=ffffff>Click here.";
                  }

                  class105.field1160 = new class170(class329.field3984, var32, var1.method3890(class110.field1218), 11);
                  var1.method3879(class110.field1218, class329.field3984, var32, 16777215, 0);
               } else if(class39.field398 == 3) {
                  var32 = 201;
                  var0.method3879("Invalid username or password.", class39.field388 + 180, var32, 16776960, 0);
                  var33 = var32 + 20;
                  var1.method3879("For accounts created after 24th November 2010, please use your", class39.field388 + 180, var33, 16776960, 0);
                  var33 += 15;
                  var1.method3879("email address to login. Otherwise please login with your username.", class39.field388 + 180, var33, 16776960, 0);
                  var33 += 15;
                  var5 = class39.field388 + 180;
                  var6 = 276;
                  class39.field374.method5980(var5 - 73, var6 - 20);
                  var2.method3879("Try again", var5, var6 + 5, 16777215, 0);
                  var5 = class39.field388 + 180;
                  var6 = 326;
                  class39.field374.method5980(var5 - 73, var6 - 20);
                  var2.method3879("Forgotten password?", var5, var6 + 5, 16777215, 0);
               } else {
                  String var22;
                  if(class39.field398 == 4) {
                     var0.method3879("Authenticator", class39.field388 + 180, 201, 16776960, 0);
                     var32 = 236;
                     var0.method3879(class39.field392, class39.field388 + 180, var32, 16777215, 0);
                     var33 = var32 + 15;
                     var0.method3879(class39.field393, class39.field388 + 180, var33, 16777215, 0);
                     var33 += 15;
                     var0.method3879(class39.field394, class39.field388 + 180, var33, 16777215, 0);
                     var33 += 15;
                     var22 = "PIN: ";
                     String var8 = class184.field2510;
                     int var26 = var8.length();
                     char[] var39 = new char[var26];

                     for(var27 = 0; var27 < var26; ++var27) {
                        var39[var27] = '*';
                     }

                     var9 = new String(var39);
                     var0.method3832(var22 + var9 + (client.field2165 % 40 < 20?class64.method1354(16776960) + "|":""), class39.field388 + 180 - 108, var33, 16777215, 0);
                     var33 -= 8;
                     var0.method3832("Trust this computer", class39.field388 + 180 - 9, var33, 16776960, 0);
                     var33 += 15;
                     var0.method3832("for 30 days: ", class39.field388 + 180 - 9, var33, 16776960, 0);
                     int var30 = 180 + class39.field388 - 9 + var0.method3890("for 30 days: ") + 15;
                     var26 = var33 - var0.field2718;
                     class303 var40;
                     if(class39.field399) {
                        var40 = class135.field1744;
                     } else {
                        var40 = class39.field376;
                     }

                     var40.method5980(var30, var26);
                     var33 += 15;
                     var27 = class39.field388 + 180 - 80;
                     short var37 = 321;
                     class39.field374.method5980(var27 - 73, var37 - 20);
                     var0.method3879("Continue", var27, var37 + 5, 16777215, 0);
                     var27 = class39.field388 + 180 + 80;
                     class39.field374.method5980(var27 - 73, var37 - 20);
                     var0.method3879("Cancel", var27, var37 + 5, 16777215, 0);
                     var1.method3879("<u=ff>Can\'t Log In?</u>", class39.field388 + 180, var37 + 36, 255, 0);
                  } else {
                     int var31;
                     short var41;
                     if(class39.field398 == 5) {
                        var0.method3879("Forgotten your password?", class39.field388 + 180, 201, 16776960, 0);
                        var32 = 221;
                        var2.method3879(class39.field392, class39.field388 + 180, var32, 16776960, 0);
                        var33 = var32 + 15;
                        var2.method3879(class39.field393, class39.field388 + 180, var33, 16776960, 0);
                        var33 += 15;
                        var2.method3879(class39.field394, class39.field388 + 180, var33, 16776960, 0);
                        var33 += 15;
                        var33 += 14;
                        var0.method3832("Username/email: ", class39.field388 + 180 - 145, var33, 16777215, 0);
                        var34 = 174;
                        if(!class175.field2134.field861) {
                           var7 = class39.field386;
                        } else {
                           var9 = class39.field386;
                           var11 = var9.length();
                           var12 = new char[var11];

                           for(var13 = 0; var13 < var11; ++var13) {
                              var12[var13] = '*';
                           }

                           var10 = new String(var12);
                           var7 = var10;
                        }

                        for(var7 = var7; var0.method3890(var7) > var34; var7 = var7.substring(1)) {
                           ;
                        }

                        var0.method3832(class190.method3813(var7) + (client.field2165 % 40 < 20?class64.method1354(16776960) + "|":""), class39.field388 + 180 - 34, var33, 16777215, 0);
                        var33 += 15;
                        var31 = class39.field388 + 180 - 80;
                        var41 = 321;
                        class39.field374.method5980(var31 - 73, var41 - 20);
                        var0.method3879("Recover", var31, var41 + 5, 16777215, 0);
                        var31 = class39.field388 + 180 + 80;
                        class39.field374.method5980(var31 - 73, var41 - 20);
                        var0.method3879("Back", var31, var41 + 5, 16777215, 0);
                     } else if(class39.field398 == 6) {
                        var32 = 201;
                        var0.method3879(class39.field392, class39.field388 + 180, var32, 16776960, 0);
                        var33 = var32 + 15;
                        var0.method3879(class39.field393, class39.field388 + 180, var33, 16776960, 0);
                        var33 += 15;
                        var0.method3879(class39.field394, class39.field388 + 180, var33, 16776960, 0);
                        var33 += 15;
                        var5 = class39.field388 + 180;
                        var6 = 321;
                        class39.field374.method5980(var5 - 73, var6 - 20);
                        var0.method3879("Back", var5, var6 + 5, 16777215, 0);
                     } else if(class39.field398 == 7) {
                        var32 = 216;
                        var0.method3879("Your date of birth isn\'t set.", class39.field388 + 180, var32, 16776960, 0);
                        var33 = var32 + 15;
                        var2.method3879("Please verify your account status by", class39.field388 + 180, var33, 16776960, 0);
                        var33 += 15;
                        var2.method3879("setting your date of birth.", class39.field388 + 180, var33, 16776960, 0);
                        var33 += 15;
                        var5 = class39.field388 + 180 - 80;
                        var6 = 321;
                        class39.field374.method5980(var5 - 73, var6 - 20);
                        var0.method3879("Set Date of Birth", var5, var6 + 5, 16777215, 0);
                        var5 = class39.field388 + 180 + 80;
                        class39.field374.method5980(var5 - 73, var6 - 20);
                        var0.method3879("Back", var5, var6 + 5, 16777215, 0);
                     } else if(class39.field398 == 8) {
                        var32 = 216;
                        var0.method3879("Sorry, but your account is not eligible to play.", class39.field388 + 180, var32, 16776960, 0);
                        var33 = var32 + 15;
                        var2.method3879("For more information, please take a look at", class39.field388 + 180, var33, 16776960, 0);
                        var33 += 15;
                        var2.method3879("our privacy policy.", class39.field388 + 180, var33, 16776960, 0);
                        var33 += 15;
                        var5 = class39.field388 + 180 - 80;
                        var6 = 321;
                        class39.field374.method5980(var5 - 73, var6 - 20);
                        var0.method3879("Privacy Policy", var5, var6 + 5, 16777215, 0);
                        var5 = class39.field388 + 180 + 80;
                        class39.field374.method5980(var5 - 73, var6 - 20);
                        var0.method3879("Back", var5, var6 + 5, 16777215, 0);
                     } else if(class39.field398 == 12) {
                        var32 = 201;
                        String var25 = "";
                        var22 = "";
                        var7 = "";
                        switch(class39.field371) {
                        case 0:
                           var25 = "Your account has been disabled.";
                           var22 = class117.field1380;
                           var7 = "";
                           break;
                        case 1:
                           var25 = "Account locked as we suspect it has been stolen.";
                           var22 = class117.field1419;
                           var7 = "";
                           break;
                        default:
                           class225.method4563(false);
                        }

                        var0.method3879(var25, class39.field388 + 180, var32, 16776960, 0);
                        var33 = var32 + 15;
                        var2.method3879(var22, class39.field388 + 180, var33, 16776960, 0);
                        var33 += 15;
                        var2.method3879(var7, class39.field388 + 180, var33, 16776960, 0);
                        var33 += 15;
                        var31 = class39.field388 + 180;
                        var41 = 276;
                        class39.field374.method5980(var31 - 73, var41 - 20);
                        var0.method3879("Support Page", var31, var41 + 5, 16777215, 0);
                        var31 = class39.field388 + 180;
                        var41 = 326;
                        class39.field374.method5980(var31 - 73, var41 - 20);
                        var0.method3879("Back", var31, var41 + 5, 16777215, 0);
                     }
                  }
               }
            }
         }

         if(class39.field384 > 0) {
            //class229.drawFlames(class39.field384);
            class39.field384 = 0;
         }

         class318.method6229();
         class121.field1651[class175.field2134.field855?1:0].method5980(class39.field407 + 765 - 40, 463);
         if(client.field2161 > 5 && client.field2158 == 0) {
            if(class210.field2892 != null) {
               var33 = class39.field407 + 5;
               var34 = 463;
               byte var35 = 100;
               byte var23 = 35;
               class210.field2892.method5980(var33, var34);
               var0.method3879("World" + " " + client.field2206, var35 / 2 + var33, var23 / 2 + var34 - 2, 16777215, 0);
               if(class296.field3696 != null) {
                  var1.method3879("Loading...", var35 / 2 + var33, var23 / 2 + var34 + 12, 16777215, 0);
               } else {
                  var1.method3879("Click to switch", var35 / 2 + var33, var23 / 2 + var34 + 12, 16777215, 0);
               }
            } else {
               class210.field2892 = class124.method2237(class138.field1782, "sl_button", "");
            }
         }

      }
   }

   @ObfuscatedName("ie")
   @ObfuscatedSignature(
      signature = "(IIIZB)V",
      garbageValue = "36"
   )
   static final void method1627(int var0, int var1, int var2, boolean var3) {
      if(class80.method1596(var0)) {
         class216.method4387(class187.field2547[var0], -1, var1, var2, var3);
      }
   }
}
