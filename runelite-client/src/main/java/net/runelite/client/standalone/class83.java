package net.runelite.client.standalone;

import java.awt.FontMetrics;

import net.runelite.api.Constants;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("z")
public class class83 {
   @ObfuscatedName("po")
   @ObfuscatedSignature(
      signature = "Lkr;"
   )
   static class114 field750;
   @ObfuscatedName("gt")
   @ObfuscatedSignature(
      signature = "Llp;"
   )
   static class26 field748;
   @ObfuscatedName("hv")
   @ObfuscatedGetter(
      intValue = -1937290983
   )
   static int field738;
   @ObfuscatedName("at")
   static FontMetrics field742;

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Lkn;Lkn;Lkn;ZI)V",
      garbageValue = "-758579829"
   )
   static void method1228(class277 var0, class277 var1, class277 var2, boolean var3) {
      if(var3) {
         class325.field3501 = (class47.field359 - 765) / 2;
         class325.field3482 = class325.field3501 + 202;
         class251.field2488 = class325.field3482 + 180;
      }

      if(class325.field3497) {
         class133.method2453(var0, var1);
      } else {
         if(var3) {
            class325.field3500.method376(class325.field3501, 0);
            class275.field3008.method376(class325.field3501 + 382, 0);
            class189.logoSprite.method530(class325.field3501 + 382 - class189.logoSprite.field257 / 2, Constants.LOGO_Y_OFFSET);
         }

         int var5;
         if(client.field3740 == 0 || client.field3740 == 5) {
            byte var4 = 20;
            var0.method3590("Zenyte is loading - please wait...", class325.field3482 + 180, 245 - var4, 16777215, -1);
            var5 = 253 - var4;
            class89.method1543(class325.field3482 + 180 - 152, var5, 304, 34, 9179409);
            class89.method1543(class325.field3482 + 180 - 151, var5 + 1, 302, 32, 0);
            class89.method1561(class325.field3482 + 180 - 150, var5 + 2, class325.field3469 * 3, 30, 9179409);
            class89.method1561(class325.field3469 * 3 + (class325.field3482 + 180 - 150), var5 + 2, 300 - class325.field3469 * 3, 30, 0);
            var0.method3590(class325.field3481, class325.field3482 + 180, 276 - var4, 16777215, -1);
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
         if(client.field3740 == 20) {
            class325.field3475.method530(class325.field3482 + 180 - class325.field3475.field257 / 2, 271 - class325.field3475.field260 / 2);
            var32 = 201;
            var0.method3590(class325.field3486, class325.field3482 + 180, var32, 16776960, 0);
            var33 = var32 + 15;
            var0.method3590(class325.field3487, class325.field3482 + 180, var33, 16776960, 0);
            var33 += 15;
            var0.method3590(class325.field3488, class325.field3482 + 180, var33, 16776960, 0);
            var33 += 15;
            var33 += 7;
            if(class325.field3492 != 4) {
               var0.method3543("Login: ", class325.field3482 + 180 - 110, var33, 16777215, 0);
               var34 = 200;
               if(!class153.field1455.field1863) {
                  var7 = class325.field3480;
               } else {
                  var9 = class325.field3480;
                  var11 = var9.length();
                  var12 = new char[var11];

                  for(var13 = 0; var13 < var11; ++var13) {
                     var12[var13] = '*';
                  }

                  var10 = new String(var12);
                  var7 = var10;
               }

               for(var7 = var7; var0.method3601(var7) > var34; var7 = var7.substring(0, var7.length() - 1)) {
                  ;
               }

               var0.method3543(class207.method3524(var7), class325.field3482 + 180 - 70, var33, 16777215, 0);
               var33 += 15;
               var9 = "Password: ";
               var24 = class325.field3490;
               var13 = var24.length();
               var14 = new char[var13];

               for(var15 = 0; var15 < var13; ++var15) {
                  var14[var15] = '*';
               }

               var36 = new String(var14);
               var0.method3543(var9 + var36, class325.field3482 + 180 - 108, var33, 16777215, 0);
               var33 += 15;
            }
         }

         if(client.field3740 == 10 || client.field3740 == 11) {
            class325.field3475.method530(class325.field3482, 171);
            short var6;
            if(class325.field3492 == 0) {
               var32 = 251;
               var0.method3590("Welcome to Zenyte", class325.field3482 + 180, var32, 16776960, 0);
               var33 = var32 + 30;
               var5 = class325.field3482 + 180 - 80;
               var6 = 291;
               class325.field3468.method530(var5 - 73, var6 - 20);
               var0.method3579("New User", var5 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var5 = class325.field3482 + 180 + 80;
               class325.field3468.method530(var5 - 73, var6 - 20);
               var0.method3579("Existing User", var5 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if(class325.field3492 == 1) {
               var0.method3590(class325.field3485, class325.field3482 + 180, 201, 16776960, 0);
               var32 = 236;
               var0.method3590(class325.field3486, class325.field3482 + 180, var32, 16777215, 0);
               var33 = var32 + 15;
               var0.method3590(class325.field3487, class325.field3482 + 180, var33, 16777215, 0);
               var33 += 15;
               var0.method3590(class325.field3488, class325.field3482 + 180, var33, 16777215, 0);
               var33 += 15;
               var5 = class325.field3482 + 180 - 80;
               var6 = 321;
               class325.field3468.method530(var5 - 73, var6 - 20);
               var0.method3590("Continue", var5, var6 + 5, 16777215, 0);
               var5 = class325.field3482 + 180 + 80;
               class325.field3468.method530(var5 - 73, var6 - 20);
               var0.method3590("Cancel", var5, var6 + 5, 16777215, 0);
            } else {
               int var27;
               if(class325.field3492 == 2) {
                  var32 = 201;
                  var0.method3590(class325.field3486, class251.field2488, var32, 16776960, 0);
                  var33 = var32 + 15;
                  var0.method3590(class325.field3487, class251.field2488, var33, 16776960, 0);
                  var33 += 15;
                  var0.method3590(class325.field3488, class251.field2488, var33, 16776960, 0);
                  var33 += 15;
                  var33 += 7;
                  var0.method3543("Login: ", class251.field2488 - 110, var33, 16777215, 0);
                  var34 = 200;
                  if(!class153.field1455.field1863) {
                     var7 = class325.field3480;
                  } else {
                     var9 = class325.field3480;
                     var11 = var9.length();
                     var12 = new char[var11];

                     for(var13 = 0; var13 < var11; ++var13) {
                        var12[var13] = '*';
                     }

                     var10 = new String(var12);
                     var7 = var10;
                  }

                  for(var7 = var7; var0.method3601(var7) > var34; var7 = var7.substring(1)) {
                     ;
                  }

                  var0.method3543(class207.method3524(var7) + (class325.field3494 == 0 & client.field3744 % 40 < 20?class294.method5136(16776960) + "|":""), class251.field2488 - 70, var33, 16777215, 0);
                  var33 += 15;
                  var9 = "Password: ";
                  var24 = class325.field3490;
                  var13 = var24.length();
                  var14 = new char[var13];

                  for(var15 = 0; var15 < var13; ++var15) {
                     var14[var15] = '*';
                  }

                  var36 = new String(var14);
                  var0.method3543(var9 + var36 + (class325.field3494 == 1 & client.field3744 % 40 < 20?class294.method5136(16776960) + "|":""), class251.field2488 - 108, var33, 16777215, 0);
                  var33 += 15;
                  var32 = 277;
                  var27 = class251.field2488 + -117;
                  boolean var28 = client.field3771;
                  boolean var38 = class325.field3491;
                  class32 var29 = var28?(var38?class313.field3373:class201.field1946):(var38?class5.field37:class325.field3470);
                  var29.method530(var27, var32);
                  var27 = var27 + var29.field257 + 5;
                  var1.method3543("Remember username", var27, var32 + 13, 16776960, 0);
                  var27 = class251.field2488 + 24;
                  boolean var18 = class153.field1455.field1863;
                  boolean var19 = class325.field3466;
                  class32 var17 = var18?(var19?class313.field3373:class201.field1946):(var19?class5.field37:class325.field3470);
                  var17.method530(var27, var32);
                  var27 = var27 + var17.field257 + 5;
                  var1.method3543("Hide username", var27, var32 + 13, 16776960, 0);
                  var33 = var32 + 15;
                  int var20 = class251.field2488 - 80;
                  short var21 = 321;
                  class325.field3468.method530(var20 - 73, var21 - 20);
                  var0.method3590("Login", var20, var21 + 5, 16777215, 0);
                  var20 = class251.field2488 + 80;
                  class325.field3468.method530(var20 - 73, var21 - 20);
                  var0.method3590("Cancel", var20, var21 + 5, 16777215, 0);
                  var32 = 357;
                  switch(class325.field3483) {
                  case 2:
                     class56.field440 = "Having trouble logging in?";
                     break;
                  default:
                     class56.field440 = "Forgotten your password? <col=ffffff>Click here.";
                  }

                  class103.field967 = new class131(class251.field2488, var32, var1.method3601(class56.field440), 11);
                  var1.method3590(class56.field440, class251.field2488, var32, 16777215, 0);
               } else if(class325.field3492 == 3) {
                  var32 = 201;
                  var0.method3590("Invalid username or password.", class325.field3482 + 180, var32, 16776960, 0);
                  var33 = var32 + 20;
                  var1.method3590("For accounts created after 24th November 2010, please use your", class325.field3482 + 180, var33, 16776960, 0);
                  var33 += 15;
                  var1.method3590("email address to login. Otherwise please login with your username.", class325.field3482 + 180, var33, 16776960, 0);
                  var33 += 15;
                  var5 = class325.field3482 + 180;
                  var6 = 276;
                  class325.field3468.method530(var5 - 73, var6 - 20);
                  var2.method3590("Try again", var5, var6 + 5, 16777215, 0);
                  var5 = class325.field3482 + 180;
                  var6 = 326;
                  class325.field3468.method530(var5 - 73, var6 - 20);
                  var2.method3590("Forgotten password?", var5, var6 + 5, 16777215, 0);
               } else {
                  String var22;
                  if(class325.field3492 == 4) {
                     var0.method3590("Authenticator", class325.field3482 + 180, 201, 16776960, 0);
                     var32 = 236;
                     var0.method3590(class325.field3486, class325.field3482 + 180, var32, 16777215, 0);
                     var33 = var32 + 15;
                     var0.method3590(class325.field3487, class325.field3482 + 180, var33, 16777215, 0);
                     var33 += 15;
                     var0.method3590(class325.field3488, class325.field3482 + 180, var33, 16777215, 0);
                     var33 += 15;
                     var22 = "PIN: ";
                     String var8 = class10.field84;
                     int var26 = var8.length();
                     char[] var39 = new char[var26];

                     for(var27 = 0; var27 < var26; ++var27) {
                        var39[var27] = '*';
                     }

                     var9 = new String(var39);
                     var0.method3543(var22 + var9 + (client.field3744 % 40 < 20?class294.method5136(16776960) + "|":""), class325.field3482 + 180 - 108, var33, 16777215, 0);
                     var33 -= 8;
                     var0.method3543("Trust this computer", class325.field3482 + 180 - 9, var33, 16776960, 0);
                     var33 += 15;
                     var0.method3543("for 30 days: ", class325.field3482 + 180 - 9, var33, 16776960, 0);
                     int var30 = 180 + class325.field3482 - 9 + var0.method3601("for 30 days: ") + 15;
                     var26 = var33 - var0.field2015;
                     class32 var40;
                     if(class325.field3493) {
                        var40 = class201.field1946;
                     } else {
                        var40 = class325.field3470;
                     }

                     var40.method530(var30, var26);
                     var33 += 15;
                     var27 = class325.field3482 + 180 - 80;
                     short var37 = 321;
                     class325.field3468.method530(var27 - 73, var37 - 20);
                     var0.method3590("Continue", var27, var37 + 5, 16777215, 0);
                     var27 = class325.field3482 + 180 + 80;
                     class325.field3468.method530(var27 - 73, var37 - 20);
                     var0.method3590("Cancel", var27, var37 + 5, 16777215, 0);
                     var1.method3590("<u=ff>Can\'t Log In?</u>", class325.field3482 + 180, var37 + 36, 255, 0);
                  } else {
                     int var31;
                     short var41;
                     if(class325.field3492 == 5) {
                        var0.method3590("Forgotten your password?", class325.field3482 + 180, 201, 16776960, 0);
                        var32 = 221;
                        var2.method3590(class325.field3486, class325.field3482 + 180, var32, 16776960, 0);
                        var33 = var32 + 15;
                        var2.method3590(class325.field3487, class325.field3482 + 180, var33, 16776960, 0);
                        var33 += 15;
                        var2.method3590(class325.field3488, class325.field3482 + 180, var33, 16776960, 0);
                        var33 += 15;
                        var33 += 14;
                        var0.method3543("Username/email: ", class325.field3482 + 180 - 145, var33, 16777215, 0);
                        var34 = 174;
                        if(!class153.field1455.field1863) {
                           var7 = class325.field3480;
                        } else {
                           var9 = class325.field3480;
                           var11 = var9.length();
                           var12 = new char[var11];

                           for(var13 = 0; var13 < var11; ++var13) {
                              var12[var13] = '*';
                           }

                           var10 = new String(var12);
                           var7 = var10;
                        }

                        for(var7 = var7; var0.method3601(var7) > var34; var7 = var7.substring(1)) {
                           ;
                        }

                        var0.method3543(class207.method3524(var7) + (client.field3744 % 40 < 20?class294.method5136(16776960) + "|":""), class325.field3482 + 180 - 34, var33, 16777215, 0);
                        var33 += 15;
                        var31 = class325.field3482 + 180 - 80;
                        var41 = 321;
                        class325.field3468.method530(var31 - 73, var41 - 20);
                        var0.method3590("Recover", var31, var41 + 5, 16777215, 0);
                        var31 = class325.field3482 + 180 + 80;
                        class325.field3468.method530(var31 - 73, var41 - 20);
                        var0.method3590("Back", var31, var41 + 5, 16777215, 0);
                     } else if(class325.field3492 == 6) {
                        var32 = 201;
                        var0.method3590(class325.field3486, class325.field3482 + 180, var32, 16776960, 0);
                        var33 = var32 + 15;
                        var0.method3590(class325.field3487, class325.field3482 + 180, var33, 16776960, 0);
                        var33 += 15;
                        var0.method3590(class325.field3488, class325.field3482 + 180, var33, 16776960, 0);
                        var33 += 15;
                        var5 = class325.field3482 + 180;
                        var6 = 321;
                        class325.field3468.method530(var5 - 73, var6 - 20);
                        var0.method3590("Back", var5, var6 + 5, 16777215, 0);
                     } else if(class325.field3492 == 7) {
                        var32 = 216;
                        var0.method3590("Your date of birth isn\'t set.", class325.field3482 + 180, var32, 16776960, 0);
                        var33 = var32 + 15;
                        var2.method3590("Please verify your account status by", class325.field3482 + 180, var33, 16776960, 0);
                        var33 += 15;
                        var2.method3590("setting your date of birth.", class325.field3482 + 180, var33, 16776960, 0);
                        var33 += 15;
                        var5 = class325.field3482 + 180 - 80;
                        var6 = 321;
                        class325.field3468.method530(var5 - 73, var6 - 20);
                        var0.method3590("Set Date of Birth", var5, var6 + 5, 16777215, 0);
                        var5 = class325.field3482 + 180 + 80;
                        class325.field3468.method530(var5 - 73, var6 - 20);
                        var0.method3590("Back", var5, var6 + 5, 16777215, 0);
                     } else if(class325.field3492 == 8) {
                        var32 = 216;
                        var0.method3590("Sorry, but your account is not eligible to play.", class325.field3482 + 180, var32, 16776960, 0);
                        var33 = var32 + 15;
                        var2.method3590("For more information, please take a look at", class325.field3482 + 180, var33, 16776960, 0);
                        var33 += 15;
                        var2.method3590("our privacy policy.", class325.field3482 + 180, var33, 16776960, 0);
                        var33 += 15;
                        var5 = class325.field3482 + 180 - 80;
                        var6 = 321;
                        class325.field3468.method530(var5 - 73, var6 - 20);
                        var0.method3590("Privacy Policy", var5, var6 + 5, 16777215, 0);
                        var5 = class325.field3482 + 180 + 80;
                        class325.field3468.method530(var5 - 73, var6 - 20);
                        var0.method3590("Back", var5, var6 + 5, 16777215, 0);
                     } else if(class325.field3492 == 12) {
                        var32 = 201;
                        String var25 = "";
                        var22 = "";
                        var7 = "";
                        switch(class325.field3465) {
                        case 0:
                           var25 = "Your account has been disabled.";
                           var22 = class259.field2633;
                           var7 = "";
                           break;
                        case 1:
                           var25 = "Account locked as we suspect it has been stolen.";
                           var22 = class259.field2672;
                           var7 = "";
                           break;
                        default:
                           class192.method3294(false);
                        }

                        var0.method3590(var25, class325.field3482 + 180, var32, 16776960, 0);
                        var33 = var32 + 15;
                        var2.method3590(var22, class325.field3482 + 180, var33, 16776960, 0);
                        var33 += 15;
                        var2.method3590(var7, class325.field3482 + 180, var33, 16776960, 0);
                        var33 += 15;
                        var31 = class325.field3482 + 180;
                        var41 = 276;
                        class325.field3468.method530(var31 - 73, var41 - 20);
                        var0.method3590("Support Page", var31, var41 + 5, 16777215, 0);
                        var31 = class325.field3482 + 180;
                        var41 = 326;
                        class325.field3468.method530(var31 - 73, var41 - 20);
                        var0.method3590("Back", var31, var41 + 5, 16777215, 0);
                     }
                  }
               }
            }
         }

         if(class325.field3478 > 0) {
            class296.method5155(class325.field3478);
            class325.field3478 = 0;
         }

         class239.method4220();
         class306.field3274[class153.field1455.field1857?1:0].method530(class325.field3501 + 765 - 40, 463);
         if(client.field3740 > 5 && client.field3737 == 0) {
            if(class102.field962 != null) {
               var33 = class325.field3501 + 5;
               var34 = 463;
               byte var35 = 100;
               byte var23 = 35;
               class102.field962.method530(var33, var34);
               var0.method3590("World" + " " + client.field3785, var35 / 2 + var33, var23 / 2 + var34 - 2, 16777215, 0);
               if(class252.field2498 != null) {
                  var1.method3590("Loading...", var35 / 2 + var33, var23 / 2 + var34 + 12, 16777215, 0);
               } else {
                  var1.method3590("Click to switch", var35 / 2 + var33, var23 / 2 + var34 + 12, 16777215, 0);
               }
            } else {
               class102.field962 = class146.method2574(class170.field1577, "sl_button", "");
            }
         }

      }
   }

   @ObfuscatedName("ie")
   @ObfuscatedSignature(
      signature = "(IIIZB)V",
      garbageValue = "36"
   )
   static final void method1227(int var0, int var1, int var2, boolean var3) {
      if(class267.method4843(var0)) {
         class298.method5182(class329.field3533[var0], -1, var1, var2, var3);
      }
   }

   @ObfuscatedName("gr")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2043132530"
   )
   static final int method1226() {
      if(class153.field1455.field1856) {
         return class315.plane;
      } else {
         int var0 = class7.method85(field738, class50.field375, class315.plane);
         return var0 - class296.field3191 < 800 && (class31.field239[class315.plane][field738 >> 7][class50.field375 >> 7] & 4) != 0?class315.plane :3;
      }
   }
}
