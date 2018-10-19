package net.runelite.client.standalone;

import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class229 {
   static {
      new HashMap();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "84343281"
   )
   static int method4108(int var0, class252 var1, boolean var2) {
      int var3 = -1;
      class329 var4;
      if(var0 >= 2000) {
         var0 -= 1000;
         var3 = class55.field407[--class171.field1587];
         var4 = class189.getWidget(var3);
      } else {
         var4 = var2?class182.field1766:class20.field155;
      }

      if(var0 == 1000) {
         class171.field1587 -= 4;
         var4.field3611 = class55.field407[class171.field1587];
         var4.field3554 = class55.field407[class171.field1587 + 1];
         var4.field3571 = class55.field407[class171.field1587 + 2];
         var4.field3545 = class55.field407[class171.field1587 + 3];
         class184.method3216(var4);
         class113.field1064.method6330(var4);
         if(var3 != -1 && var4.field3546 == 0) {
            class130.method2395(class329.field3533[var3 >> 16], var4, false);
         }

         return 1;
      } else if(var0 == 1001) {
         class171.field1587 -= 4;
         var4.field3555 = class55.field407[class171.field1587];
         var4.field3556 = class55.field407[class171.field1587 + 1];
         var4.field3551 = class55.field407[class171.field1587 + 2];
         var4.field3678 = class55.field407[class171.field1587 + 3];
         class184.method3216(var4);
         class113.field1064.method6330(var4);
         if(var3 != -1 && var4.field3546 == 0) {
            class130.method2395(class329.field3533[var3 >> 16], var4, false);
         }

         return 1;
      } else if(var0 == 1003) {
         boolean var5 = class55.field407[--class171.field1587] == 1;
         if(var5 != var4.field3569) {
            var4.field3569 = var5;
            var4.onHiddenChanged(-1);
            class184.method3216(var4);
         }

         return 1;
      } else if(var0 == 1005) {
         var4.field3684 = class55.field407[--class171.field1587] == 1;
         return 1;
      } else if(var0 == 1006) {
         var4.field3685 = class55.field407[--class171.field1587] == 1;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Lah;I)V",
      garbageValue = "789757018"
   )
   static void method4107(class181 var0) {
      if(class325.field3497) {
         class330.method5934(var0);
      } else {
         if((class226.field2222 == 1 || !class192.field1840 && class226.field2222 == 4) && class226.field2220 >= class325.field3501 + 765 - 50 && class226.field2224 >= 453) {
            class153.field1455.field1857 = !class153.field1455.field1857;
            class57.method1015();
            if(!class153.field1455.field1857) {
               class128.method2370(client.field4007, "scape main", "", 255, false);
            } else {
               class227.field2234.method249();
               class227.field2232 = 1;
               class53.field391 = null;
            }
         }

         if(client.field3740 != 5) {
            if(-1L == class325.field3499) {
               class325.field3499 = class234.method4170() + 1000L;
            }

            long var1 = class234.method4170();
            boolean var3;
            if(client.field3849 != null && client.field4003 < client.field3849.size()) {
               while(true) {
                  if(client.field4003 >= client.field3849.size()) {
                     var3 = true;
                     break;
                  }

                  class201 var12 = (class201)client.field3849.get(client.field4003);
                  if(!var12.method3447()) {
                     var3 = false;
                     break;
                  }

                  ++client.field4003;
               }
            } else {
               var3 = true;
            }

            if(var3 && -1L == class325.field3484) {
               class325.field3484 = var1;
               if(class325.field3484 > class325.field3499) {
                  class325.field3499 = class325.field3484;
               }
            }

            ++class325.field3478;
            if(client.field3740 == 10 || client.field3740 == 11) {
               int var4;
               if(client.field3737 == 0) {
                  if(class226.field2222 == 1 || !class192.field1840 && class226.field2222 == 4) {
                     var4 = class325.field3501 + 5;
                     short var5 = 463;
                     byte var6 = 100;
                     byte var7 = 35;
                     if(class226.field2220 >= var4 && class226.field2220 <= var4 + var6 && class226.field2224 >= var5 && class226.field2224 <= var5 + var7) {
                        if(class326.method5778()) {
                           class325.field3497 = true;
                        }

                        return;
                     }
                  }

                  if(class252.field2498 != null && class326.method5778()) {
                     class325.field3497 = true;
                  }
               }

               var4 = class226.field2222;
               int var14 = class226.field2220;
               int var15 = class226.field2224;
               if(var4 == 0) {
                  var14 = class226.field2215;
                  var15 = class226.field2216;
               }

               if(!class192.field1840 && var4 == 4) {
                  var4 = 1;
               }

               int var8;
               short var9;
               if(class325.field3492 == 0) {
                  boolean var16 = false;

                  while(ServerProt.method4175()) {
                     if(class77.field713 == 84) {
                        var16 = true;
                     }
                  }

                  var8 = class251.field2488 - 80;
                  var9 = 291;
                  if(var4 == 1 && var14 >= var8 - 75 && var14 <= var8 + 75 && var15 >= var9 - 20 && var15 <= var9 + 20) {
                     class112.method1875(class163.method2811("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                  }

                  var8 = class251.field2488 + 80;
                  if(var4 == 1 && var14 >= var8 - 75 && var14 <= var8 + 75 && var15 >= var9 - 20 && var15 <= var9 + 20 || var16) {
                     if((client.field3733 & 33554432) != 0) {
                        class325.field3485 = "";
                        class325.field3486 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                        class325.field3487 = "Your normal account will not be affected.";
                        class325.field3488 = "";
                        class325.field3492 = 1;
                        class176.method2957();
                     } else if((client.field3733 & 4) != 0) {
                        if((client.field3733 & 1024) != 0) {
                           class325.field3486 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
                           class325.field3487 = "Players can attack each other almost everywhere";
                           class325.field3488 = "and the Protect Item prayer won\'t work.";
                        } else {
                           class325.field3486 = "This is a <col=ff0000>PvP<col=ffffff> world.";
                           class325.field3487 = "Players can attack each other";
                           class325.field3488 = "almost everywhere.";
                        }

                        class325.field3485 = "Warning!";
                        class325.field3492 = 1;
                        class176.method2957();
                     } else if((client.field3733 & 1024) != 0) {
                        class325.field3486 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                        class325.field3487 = "The Protect Item prayer will";
                        class325.field3488 = "not work on this world.";
                        class325.field3485 = "Warning!";
                        class325.field3492 = 1;
                        class176.method2957();
                     } else {
                        class192.method3294(false);
                     }
                  }
               } else {
                  int var17;
                  short var19;
                  if(class325.field3492 != 1) {
                     short var18;
                     if(class325.field3492 == 2) {
                        var18 = 201;
                        var17 = var18 + 52;
                        if(var4 == 1 && var15 >= var17 - 12 && var15 < var17 + 2) {
                           class325.field3494 = 0;
                        }

                        var17 += 15;
                        if(var4 == 1 && var15 >= var17 - 12 && var15 < var17 + 2) {
                           class325.field3494 = 1;
                        }

                        var17 += 15;
                        var18 = 361;
                        if(class103.field967 != null) {
                           var8 = class103.field967.field1250 / 2;
                           if(var4 == 1 && var14 >= class103.field967.field1248 - var8 && var14 <= var8 + class103.field967.field1248 && var15 >= var18 - 15 && var15 < var18) {
                              switch(class325.field3483) {
                              case 1:
                                 class226.method4059("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                                 class325.field3492 = 5;
                                 return;
                              case 2:
                                 class112.method1875("https://support.runescape.com/hc/en-gb", true, false);
                              }
                           }
                        }

                        var8 = class251.field2488 - 80;
                        var9 = 321;
                        if(var4 == 1 && var14 >= var8 - 75 && var14 <= var8 + 75 && var15 >= var9 - 20 && var15 <= var9 + 20) {
                           class325.field3480 = class325.field3480.trim();
                           client.onUsernameChanged(-1);
                           if(class325.field3480.length() == 0) {
                              class226.method4059("", "Please enter your username/email address.", "");
                              return;
                           }

                           if(class325.field3490.length() == 0) {
                              class226.method4059("", "Please enter your password.", "");
                              return;
                           }

                           class226.method4059("", "Connecting to server...", "");
                           class241.method4288(false);
                           class188.method3239(20);
                           return;
                        }

                        var8 = class325.field3482 + 180 + 80;
                        if(var4 == 1 && var14 >= var8 - 75 && var14 <= var8 + 75 && var15 >= var9 - 20 && var15 <= var9 + 20) {
                           class325.field3492 = 0;
                           class325.field3480 = "";
                           client.onUsernameChanged(-1);
                           class325.field3490 = "";
                           class177.field1688 = 0;
                           class10.field84 = "";
                           class325.field3493 = true;
                        }

                        var8 = class251.field2488 + -117;
                        var9 = 277;
                        class325.field3491 = var14 >= var8 && var14 < var8 + class176.field1684 && var15 >= var9 && var15 < var9 + class67.field620;
                        if(var4 == 1 && class325.field3491) {
                           client.field3771 = !client.field3771;
                           if(!client.field3771 && class153.field1455.field1860 != null) {
                              class153.field1455.field1860 = null;
                              class57.method1015();
                           }
                        }

                        var8 = class251.field2488 + 24;
                        var9 = 277;
                        class325.field3466 = var14 >= var8 && var14 < var8 + class176.field1684 && var15 >= var9 && var15 < var9 + class67.field620;
                        if(var4 == 1 && class325.field3466) {
                           class153.field1455.field1863 = !class153.field1455.field1863;
                           if(!class153.field1455.field1863) {
                              class325.field3480 = "";
                              client.onUsernameChanged(-1);
                              class153.field1455.field1860 = null;
                              class176.method2957();
                           }

                           class57.method1015();
                        }

                        while(true) {
                           while(ServerProt.method4175()) {
                              boolean var10 = false;

                              for(int var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); ++var11) {
                                 if(class90.field883 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var11)) {
                                    var10 = true;
                                    break;
                                 }
                              }

                              if(class77.field713 == 13) {
                                 class325.field3492 = 0;
                                 class325.field3480 = "";
                                 client.onUsernameChanged(-1);
                                 class325.field3490 = "";
                                 class177.field1688 = 0;
                                 class10.field84 = "";
                                 class325.field3493 = true;
                              } else if(class325.field3494 == 0) {
                                 if(class77.field713 == 85 && class325.field3480.length() > 0) {
                                    class325.field3480 = class325.field3480.substring(0, class325.field3480.length() - 1);
                                    client.onUsernameChanged(-1);
                                 }

                                 if(class77.field713 == 84 || class77.field713 == 80) {
                                    class325.field3494 = 1;
                                 }

                                 if(var10 && class325.field3480.length() < 320) {
                                    class325.field3480 = class325.field3480 + class90.field883;
                                    client.onUsernameChanged(-1);
                                 }
                              } else if(class325.field3494 == 1) {
                                 if(class77.field713 == 85 && class325.field3490.length() > 0) {
                                    class325.field3490 = class325.field3490.substring(0, class325.field3490.length() - 1);
                                 }

                                 if(class77.field713 == 84 || class77.field713 == 80) {
                                    class325.field3494 = 0;
                                 }

                                 if(class77.field713 == 84) {
                                    class325.field3480 = class325.field3480.trim();
                                    client.onUsernameChanged(-1);
                                    if(class325.field3480.length() == 0) {
                                       class226.method4059("", "Please enter your username/email address.", "");
                                       return;
                                    }

                                    if(class325.field3490.length() == 0) {
                                       class226.method4059("", "Please enter your password.", "");
                                       return;
                                    }

                                    class226.method4059("", "Connecting to server...", "");
                                    class241.method4288(false);
                                    class188.method3239(20);
                                    return;
                                 }

                                 if(var10 && class325.field3490.length() < 20) {
                                    class325.field3490 = class325.field3490 + class90.field883;
                                 }
                              }
                           }

                           return;
                        }
                     } else if(class325.field3492 == 3) {
                        var17 = class325.field3482 + 180;
                        var19 = 276;
                        if(var4 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var19 - 20 && var15 <= var19 + 20) {
                           class192.method3294(false);
                        }

                        var17 = class325.field3482 + 180;
                        var19 = 326;
                        if(var4 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var19 - 20 && var15 <= var19 + 20) {
                           class226.method4059("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                           class325.field3492 = 5;
                           return;
                        }
                     } else {
                        boolean var20;
                        int var21;
                        if(class325.field3492 == 4) {
                           var17 = class325.field3482 + 180 - 80;
                           var19 = 321;
                           if(var4 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var19 - 20 && var15 <= var19 + 20) {
                              class10.field84.trim();
                              if(class10.field84.length() != 6) {
                                 class226.method4059("", "Please enter a 6-digit PIN.", "");
                                 return;
                              }

                              class177.field1688 = Integer.parseInt(class10.field84);
                              class10.field84 = "";
                              class241.method4288(true);
                              class226.method4059("", "Connecting to server...", "");
                              class188.method3239(20);
                              return;
                           }

                           if(var4 == 1 && var14 >= class325.field3482 + 180 - 9 && var14 <= class325.field3482 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                              class325.field3493 = !class325.field3493;
                           }

                           if(var4 == 1 && var14 >= class325.field3482 + 180 - 34 && var14 <= class325.field3482 + 34 + 180 && var15 >= 351 && var15 <= 363) {
                              class112.method1875(class163.method2811("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                           }

                           var17 = class325.field3482 + 180 + 80;
                           if(var4 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var19 - 20 && var15 <= var19 + 20) {
                              class325.field3492 = 0;
                              class325.field3480 = "";
                              client.onUsernameChanged(-1);
                              class325.field3490 = "";
                              class177.field1688 = 0;
                              class10.field84 = "";
                           }

                           while(ServerProt.method4175()) {
                              var20 = false;

                              for(var21 = 0; var21 < "1234567890".length(); ++var21) {
                                 if(class90.field883 == "1234567890".charAt(var21)) {
                                    var20 = true;
                                    break;
                                 }
                              }

                              if(class77.field713 == 13) {
                                 class325.field3492 = 0;
                                 class325.field3480 = "";
                                 client.onUsernameChanged(-1);
                                 class325.field3490 = "";
                                 class177.field1688 = 0;
                                 class10.field84 = "";
                              } else {
                                 if(class77.field713 == 85 && class10.field84.length() > 0) {
                                    class10.field84 = class10.field84.substring(0, class10.field84.length() - 1);
                                 }

                                 if(class77.field713 == 84) {
                                    class10.field84.trim();
                                    if(class10.field84.length() != 6) {
                                       class226.method4059("", "Please enter a 6-digit PIN.", "");
                                       return;
                                    }

                                    class177.field1688 = Integer.parseInt(class10.field84);
                                    class10.field84 = "";
                                    class241.method4288(true);
                                    class226.method4059("", "Connecting to server...", "");
                                    class188.method3239(20);
                                    return;
                                 }

                                 if(var20 && class10.field84.length() < 6) {
                                    class10.field84 = class10.field84 + class90.field883;
                                 }
                              }
                           }
                        } else if(class325.field3492 == 5) {
                           var17 = class325.field3482 + 180 - 80;
                           var19 = 321;
                           if(var4 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var19 - 20 && var15 <= var19 + 20) {
                              class146.method2572();
                              return;
                           }

                           var17 = class325.field3482 + 180 + 80;
                           if(var4 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var19 - 20 && var15 <= var19 + 20) {
                              class192.method3294(true);
                           }

                           while(ServerProt.method4175()) {
                              var20 = false;

                              for(var21 = 0; var21 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); ++var21) {
                                 if(class90.field883 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var21)) {
                                    var20 = true;
                                    break;
                                 }
                              }

                              if(class77.field713 == 13) {
                                 class192.method3294(true);
                              } else {
                                 if(class77.field713 == 85 && class325.field3480.length() > 0) {
                                    class325.field3480 = class325.field3480.substring(0, class325.field3480.length() - 1);
                                    client.onUsernameChanged(-1);
                                 }

                                 if(class77.field713 == 84) {
                                    class146.method2572();
                                    return;
                                 }

                                 if(var20 && class325.field3480.length() < 320) {
                                    class325.field3480 = class325.field3480 + class90.field883;
                                    client.onUsernameChanged(-1);
                                 }
                              }
                           }
                        } else if(class325.field3492 == 6) {
                           while(true) {
                              do {
                                 if(!ServerProt.method4175()) {
                                    var18 = 321;
                                    if(var4 == 1 && var15 >= var18 - 20 && var15 <= var18 + 20) {
                                       class192.method3294(true);
                                    }

                                    return;
                                 }
                              } while(class77.field713 != 84 && class77.field713 != 13);

                              class192.method3294(true);
                           }
                        } else if(class325.field3492 == 7) {
                           var17 = class325.field3482 + 180 - 80;
                           var19 = 321;
                           if(var4 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var19 - 20 && var15 <= var19 + 20) {
                              class112.method1875(class163.method2811("secure", true) + "m=dob/set_dob.ws", true, false);
                              class226.method4059("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                              class325.field3492 = 6;
                              return;
                           }

                           var17 = class325.field3482 + 180 + 80;
                           if(var4 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var19 - 20 && var15 <= var19 + 20) {
                              class192.method3294(true);
                           }
                        } else if(class325.field3492 == 8) {
                           var17 = class325.field3482 + 180 - 80;
                           var19 = 321;
                           if(var4 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var19 - 20 && var15 <= var19 + 20) {
                              class112.method1875("https://www.jagex.com/terms/privacy/#eight", true, false);
                              class226.method4059("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                              class325.field3492 = 6;
                              return;
                           }

                           var17 = class325.field3482 + 180 + 80;
                           if(var4 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var19 - 20 && var15 <= var19 + 20) {
                              class192.method3294(true);
                           }
                        } else if(class325.field3492 == 12) {
                           String var13 = "";
                           switch(class325.field3465) {
                           case 0:
                              var13 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                              break;
                           case 1:
                              var13 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                              break;
                           default:
                              class192.method3294(false);
                           }

                           var8 = class325.field3482 + 180;
                           var9 = 276;
                           if(var4 == 1 && var14 >= var8 - 75 && var14 <= var8 + 75 && var15 >= var9 - 20 && var15 <= var9 + 20) {
                              class112.method1875(var13, true, false);
                              class226.method4059("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                              class325.field3492 = 6;
                              return;
                           }

                           var8 = class325.field3482 + 180;
                           var9 = 326;
                           if(var4 == 1 && var14 >= var8 - 75 && var14 <= var8 + 75 && var15 >= var9 - 20 && var15 <= var9 + 20) {
                              class192.method3294(false);
                           }
                        }
                     }
                  } else {
                     while(ServerProt.method4175()) {
                        if(class77.field713 == 84) {
                           class192.method3294(false);
                        } else if(class77.field713 == 13) {
                           class325.field3492 = 0;
                        }
                     }

                     var17 = class251.field2488 - 80;
                     var19 = 321;
                     if(var4 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var19 - 20 && var15 <= var19 + 20) {
                        class192.method3294(false);
                     }

                     var17 = class251.field2488 + 80;
                     if(var4 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var19 - 20 && var15 <= var19 + 20) {
                        class325.field3492 = 0;
                     }
                  }
               }

            }
         }
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "821328278"
   )
   static final void method4106() {
      class87.method1275("You can\'t add yourself to your own ignore list");
   }
}
