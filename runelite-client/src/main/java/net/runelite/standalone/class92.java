package net.runelite.standalone;

import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class92 {
   static {
      new HashMap();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "821328278"
   )
   static final void method1716() {
      WorldMapData.method2707("You can\'t add yourself to your own ignore list");
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "84343281"
   )
   static int method1718(int var0, class296 var1, boolean var2) {
      int var3 = -1;
      class187 var4;
      if(var0 >= 2000) {
         var0 -= 1000;
         var3 = class249.field3312[--MapCacheArchiveNames.field3811];
         var4 = class48.method1047(var3);
      } else {
         var4 = var2?class3.field36:class284.field3565;
      }

      if(var0 == 1000) {
         MapCacheArchiveNames.field3811 -= 4;
         var4.field2625 = class249.field3312[MapCacheArchiveNames.field3811];
         var4.field2568 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
         var4.field2585 = class249.field3312[MapCacheArchiveNames.field3811 + 2];
         var4.field2559 = class249.field3312[MapCacheArchiveNames.field3811 + 3];
         class230.method4617(var4);
         class302.field3755.method3614(var4);
         if(var3 != -1 && var4.field2560 == 0) {
            class79.method1593(class187.field2547[var3 >> 16], var4, false);
         }

         return 1;
      } else if(var0 == 1001) {
         MapCacheArchiveNames.field3811 -= 4;
         var4.field2569 = class249.field3312[MapCacheArchiveNames.field3811];
         var4.field2570 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
         var4.field2565 = class249.field3312[MapCacheArchiveNames.field3811 + 2];
         var4.field2692 = class249.field3312[MapCacheArchiveNames.field3811 + 3];
         class230.method4617(var4);
         class302.field3755.method3614(var4);
         if(var3 != -1 && var4.field2560 == 0) {
            class79.method1593(class187.field2547[var3 >> 16], var4, false);
         }

         return 1;
      } else if(var0 == 1003) {
         boolean var5 = class249.field3312[--MapCacheArchiveNames.field3811] == 1;
         if(var5 != var4.field2583) {
            var4.field2583 = var5;
            var4.onHiddenChanged(-1);
            class230.method4617(var4);
         }

         return 1;
      } else if(var0 == 1005) {
         var4.field2698 = class249.field3312[--MapCacheArchiveNames.field3811] == 1;
         return 1;
      } else if(var0 == 1006) {
         var4.field2699 = class249.field3312[--MapCacheArchiveNames.field3811] == 1;
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
   static void method1717(GameEngine var0) {
      if(class39.field403) {
         class193.method3917(var0);
      } else {
         if((class163.field1982 == 1 || !class225.field3039 && class163.field1982 == 4) && class163.field1980 >= class39.field407 + 765 - 50 && class163.field1984 >= 453) {
            WorldMapNode.field2134.field855 = !WorldMapNode.field2134.field855;
            class236.method4709();
            if(!WorldMapNode.field2134.field855) {
               class95.method1738(client.field2428, "scape main", "", 255, false);
            } else {
               class43.field483.method1375();
               class43.field481 = 1;
               class270.field3480 = null;
            }
         }

         if(client.field2161 != 5) {
            if(-1L == class39.field405) {
               class39.field405 = class321.method6252() + 1000L;
            }

            long var1 = class321.method6252();
            boolean var3;
            if(client.field2270 != null && client.field2424 < client.field2270.size()) {
               while(true) {
                  if(client.field2424 >= client.field2270.size()) {
                     var3 = true;
                     break;
                  }

                  class135 var12 = (class135)client.field2270.get(client.field2424);
                  if(!var12.method2563()) {
                     var3 = false;
                     break;
                  }

                  ++client.field2424;
               }
            } else {
               var3 = true;
            }

            if(var3 && -1L == class39.field390) {
               class39.field390 = var1;
               if(class39.field390 > class39.field405) {
                  class39.field405 = class39.field390;
               }
            }

            ++class39.field384;
            if(client.field2161 == 10 || client.field2161 == 11) {
               int var4;
               if(client.field2158 == 0) {
                  if(class163.field1982 == 1 || !class225.field3039 && class163.field1982 == 4) {
                     var4 = class39.field407 + 5;
                     short var5 = 463;
                     byte var6 = 100;
                     byte var7 = 35;
                     if(class163.field1980 >= var4 && class163.field1980 <= var4 + var6 && class163.field1984 >= var5 && class163.field1984 <= var5 + var7) {
                        if(class294.method5776()) {
                           class39.field403 = true;
                        }

                        return;
                     }
                  }

                  if(class296.field3696 != null && class294.method5776()) {
                     class39.field403 = true;
                  }
               }

               var4 = class163.field1982;
               int var14 = class163.field1980;
               int var15 = class163.field1984;
               if(var4 == 0) {
                  var14 = class163.field1975;
                  var15 = class163.field1976;
               }

               if(!class225.field3039 && var4 == 4) {
                  var4 = 1;
               }

               int var8;
               short var9;
               if(class39.field398 == 0) {
                  boolean var16 = false;

                  while(ServerProt.method3134()) {
                     if(class286.field3584 == 84) {
                        var16 = true;
                     }
                  }

                  var8 = class329.field3984 - 80;
                  var9 = 291;
                  if(var4 == 1 && var14 >= var8 - 75 && var14 <= var8 + 75 && var15 >= var9 - 20 && var15 <= var9 + 20) {
                     class212.method4358(class205.method4077("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                  }

                  var8 = class329.field3984 + 80;
                  if(var4 == 1 && var14 >= var8 - 75 && var14 <= var8 + 75 && var15 >= var9 - 20 && var15 <= var9 + 20 || var16) {
                     if((client.field2154 & 33554432) != 0) {
                        class39.field391 = "";
                        class39.field392 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                        class39.field393 = "Your normal account will not be affected.";
                        class39.field394 = "";
                        class39.field398 = 1;
                        class213.method4360();
                     } else if((client.field2154 & 4) != 0) {
                        if((client.field2154 & 1024) != 0) {
                           class39.field392 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
                           class39.field393 = "Players can attack each other almost everywhere";
                           class39.field394 = "and the Protect Item prayer won\'t work.";
                        } else {
                           class39.field392 = "This is a <col=ff0000>PvP<col=ffffff> world.";
                           class39.field393 = "Players can attack each other";
                           class39.field394 = "almost everywhere.";
                        }

                        class39.field391 = "Warning!";
                        class39.field398 = 1;
                        class213.method4360();
                     } else if((client.field2154 & 1024) != 0) {
                        class39.field392 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                        class39.field393 = "The Protect Item prayer will";
                        class39.field394 = "not work on this world.";
                        class39.field391 = "Warning!";
                        class39.field398 = 1;
                        class213.method4360();
                     } else {
                        class225.method4563(false);
                     }
                  }
               } else {
                  int var17;
                  short var19;
                  if(class39.field398 != 1) {
                     short var18;
                     if(class39.field398 == 2) {
                        var18 = 201;
                        var17 = var18 + 52;
                        if(var4 == 1 && var15 >= var17 - 12 && var15 < var17 + 2) {
                           class39.field400 = 0;
                        }

                        var17 += 15;
                        if(var4 == 1 && var15 >= var17 - 12 && var15 < var17 + 2) {
                           class39.field400 = 1;
                        }

                        var17 += 15;
                        var18 = 361;
                        if(class105.field1160 != null) {
                           var8 = class105.field1160.field2020 / 2;
                           if(var4 == 1 && var14 >= class105.field1160.field2018 - var8 && var14 <= var8 + class105.field1160.field2018 && var15 >= var18 - 15 && var15 < var18) {
                              switch(class39.field389) {
                              case 1:
                                 class163.method3007("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                                 class39.field398 = 5;
                                 return;
                              case 2:
                                 class212.method4358("https://support.runescape.com/hc/en-gb", true, false);
                              }
                           }
                        }

                        var8 = class329.field3984 - 80;
                        var9 = 321;
                        if(var4 == 1 && var14 >= var8 - 75 && var14 <= var8 + 75 && var15 >= var9 - 20 && var15 <= var9 + 20) {
                           class39.field386 = class39.field386.trim();
                           client.onUsernameChanged(-1);
                           if(class39.field386.length() == 0) {
                              class163.method3007("", "Please enter your username/email address.", "");
                              return;
                           }

                           if(class39.field396.length() == 0) {
                              class163.method3007("", "Please enter your password.", "");
                              return;
                           }

                           class163.method3007("", "Connecting to server...", "");
                           class272.method5365(false);
                           class142.method2635(20);
                           return;
                        }

                        var8 = class39.field388 + 180 + 80;
                        if(var4 == 1 && var14 >= var8 - 75 && var14 <= var8 + 75 && var15 >= var9 - 20 && var15 <= var9 + 20) {
                           class39.field398 = 0;
                           class39.field386 = "";
                           client.onUsernameChanged(-1);
                           class39.field396 = "";
                           class84.field909 = 0;
                           class184.field2510 = "";
                           class39.field399 = true;
                        }

                        var8 = class329.field3984 + -117;
                        var9 = 277;
                        class39.field397 = var14 >= var8 && var14 < var8 + class213.field2929 && var15 >= var9 && var15 < var9 + class164.field1990;
                        if(var4 == 1 && class39.field397) {
                           client.field2192 = !client.field2192;
                           if(!client.field2192 && WorldMapNode.field2134.field858 != null) {
                              WorldMapNode.field2134.field858 = null;
                              class236.method4709();
                           }
                        }

                        var8 = class329.field3984 + 24;
                        var9 = 277;
                        class39.field372 = var14 >= var8 && var14 < var8 + class213.field2929 && var15 >= var9 && var15 < var9 + class164.field1990;
                        if(var4 == 1 && class39.field372) {
                           WorldMapNode.field2134.field861 = !WorldMapNode.field2134.field861;
                           if(!WorldMapNode.field2134.field861) {
                              class39.field386 = "";
                              client.onUsernameChanged(-1);
                              WorldMapNode.field2134.field858 = null;
                              class213.method4360();
                           }

                           class236.method4709();
                        }

                        while(true) {
                           while(ServerProt.method3134()) {
                              boolean var10 = false;

                              for(int var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); ++var11) {
                                 if(class71.field824 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var11)) {
                                    var10 = true;
                                    break;
                                 }
                              }

                              if(class286.field3584 == 13) {
                                 class39.field398 = 0;
                                 class39.field386 = "";
                                 client.onUsernameChanged(-1);
                                 class39.field396 = "";
                                 class84.field909 = 0;
                                 class184.field2510 = "";
                                 class39.field399 = true;
                              } else if(class39.field400 == 0) {
                                 if(class286.field3584 == 85 && class39.field386.length() > 0) {
                                    class39.field386 = class39.field386.substring(0, class39.field386.length() - 1);
                                    client.onUsernameChanged(-1);
                                 }

                                 if(class286.field3584 == 84 || class286.field3584 == 80) {
                                    class39.field400 = 1;
                                 }

                                 if(var10 && class39.field386.length() < 320) {
                                    class39.field386 = class39.field386 + class71.field824;
                                    client.onUsernameChanged(-1);
                                 }
                              } else if(class39.field400 == 1) {
                                 if(class286.field3584 == 85 && class39.field396.length() > 0) {
                                    class39.field396 = class39.field396.substring(0, class39.field396.length() - 1);
                                 }

                                 if(class286.field3584 == 84 || class286.field3584 == 80) {
                                    class39.field400 = 0;
                                 }

                                 if(class286.field3584 == 84) {
                                    class39.field386 = class39.field386.trim();
                                    client.onUsernameChanged(-1);
                                    if(class39.field386.length() == 0) {
                                       class163.method3007("", "Please enter your username/email address.", "");
                                       return;
                                    }

                                    if(class39.field396.length() == 0) {
                                       class163.method3007("", "Please enter your password.", "");
                                       return;
                                    }

                                    class163.method3007("", "Connecting to server...", "");
                                    class272.method5365(false);
                                    class142.method2635(20);
                                    return;
                                 }

                                 if(var10 && class39.field396.length() < 20) {
                                    class39.field396 = class39.field396 + class71.field824;
                                 }
                              }
                           }

                           return;
                        }
                     } else if(class39.field398 == 3) {
                        var17 = class39.field388 + 180;
                        var19 = 276;
                        if(var4 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var19 - 20 && var15 <= var19 + 20) {
                           class225.method4563(false);
                        }

                        var17 = class39.field388 + 180;
                        var19 = 326;
                        if(var4 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var19 - 20 && var15 <= var19 + 20) {
                           class163.method3007("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                           class39.field398 = 5;
                           return;
                        }
                     } else {
                        boolean var20;
                        int var21;
                        if(class39.field398 == 4) {
                           var17 = class39.field388 + 180 - 80;
                           var19 = 321;
                           if(var4 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var19 - 20 && var15 <= var19 + 20) {
                              class184.field2510.trim();
                              if(class184.field2510.length() != 6) {
                                 class163.method3007("", "Please enter a 6-digit PIN.", "");
                                 return;
                              }

                              class84.field909 = Integer.parseInt(class184.field2510);
                              class184.field2510 = "";
                              class272.method5365(true);
                              class163.method3007("", "Connecting to server...", "");
                              class142.method2635(20);
                              return;
                           }

                           if(var4 == 1 && var14 >= class39.field388 + 180 - 9 && var14 <= class39.field388 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                              class39.field399 = !class39.field399;
                           }

                           if(var4 == 1 && var14 >= class39.field388 + 180 - 34 && var14 <= class39.field388 + 34 + 180 && var15 >= 351 && var15 <= 363) {
                              class212.method4358(class205.method4077("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                           }

                           var17 = class39.field388 + 180 + 80;
                           if(var4 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var19 - 20 && var15 <= var19 + 20) {
                              class39.field398 = 0;
                              class39.field386 = "";
                              client.onUsernameChanged(-1);
                              class39.field396 = "";
                              class84.field909 = 0;
                              class184.field2510 = "";
                           }

                           while(ServerProt.method3134()) {
                              var20 = false;

                              for(var21 = 0; var21 < "1234567890".length(); ++var21) {
                                 if(class71.field824 == "1234567890".charAt(var21)) {
                                    var20 = true;
                                    break;
                                 }
                              }

                              if(class286.field3584 == 13) {
                                 class39.field398 = 0;
                                 class39.field386 = "";
                                 client.onUsernameChanged(-1);
                                 class39.field396 = "";
                                 class84.field909 = 0;
                                 class184.field2510 = "";
                              } else {
                                 if(class286.field3584 == 85 && class184.field2510.length() > 0) {
                                    class184.field2510 = class184.field2510.substring(0, class184.field2510.length() - 1);
                                 }

                                 if(class286.field3584 == 84) {
                                    class184.field2510.trim();
                                    if(class184.field2510.length() != 6) {
                                       class163.method3007("", "Please enter a 6-digit PIN.", "");
                                       return;
                                    }

                                    class84.field909 = Integer.parseInt(class184.field2510);
                                    class184.field2510 = "";
                                    class272.method5365(true);
                                    class163.method3007("", "Connecting to server...", "");
                                    class142.method2635(20);
                                    return;
                                 }

                                 if(var20 && class184.field2510.length() < 6) {
                                    class184.field2510 = class184.field2510 + class71.field824;
                                 }
                              }
                           }
                        } else if(class39.field398 == 5) {
                           var17 = class39.field388 + 180 - 80;
                           var19 = 321;
                           if(var4 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var19 - 20 && var15 <= var19 + 20) {
                              class124.method2235();
                              return;
                           }

                           var17 = class39.field388 + 180 + 80;
                           if(var4 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var19 - 20 && var15 <= var19 + 20) {
                              class225.method4563(true);
                           }

                           while(ServerProt.method3134()) {
                              var20 = false;

                              for(var21 = 0; var21 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); ++var21) {
                                 if(class71.field824 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var21)) {
                                    var20 = true;
                                    break;
                                 }
                              }

                              if(class286.field3584 == 13) {
                                 class225.method4563(true);
                              } else {
                                 if(class286.field3584 == 85 && class39.field386.length() > 0) {
                                    class39.field386 = class39.field386.substring(0, class39.field386.length() - 1);
                                    client.onUsernameChanged(-1);
                                 }

                                 if(class286.field3584 == 84) {
                                    class124.method2235();
                                    return;
                                 }

                                 if(var20 && class39.field386.length() < 320) {
                                    class39.field386 = class39.field386 + class71.field824;
                                    client.onUsernameChanged(-1);
                                 }
                              }
                           }
                        } else if(class39.field398 == 6) {
                           while(true) {
                              do {
                                 if(!ServerProt.method3134()) {
                                    var18 = 321;
                                    if(var4 == 1 && var15 >= var18 - 20 && var15 <= var18 + 20) {
                                       class225.method4563(true);
                                    }

                                    return;
                                 }
                              } while(class286.field3584 != 84 && class286.field3584 != 13);

                              class225.method4563(true);
                           }
                        } else if(class39.field398 == 7) {
                           var17 = class39.field388 + 180 - 80;
                           var19 = 321;
                           if(var4 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var19 - 20 && var15 <= var19 + 20) {
                              class212.method4358(class205.method4077("secure", true) + "m=dob/set_dob.ws", true, false);
                              class163.method3007("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                              class39.field398 = 6;
                              return;
                           }

                           var17 = class39.field388 + 180 + 80;
                           if(var4 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var19 - 20 && var15 <= var19 + 20) {
                              class225.method4563(true);
                           }
                        } else if(class39.field398 == 8) {
                           var17 = class39.field388 + 180 - 80;
                           var19 = 321;
                           if(var4 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var19 - 20 && var15 <= var19 + 20) {
                              class212.method4358("https://www.jagex.com/terms/privacy/#eight", true, false);
                              class163.method3007("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                              class39.field398 = 6;
                              return;
                           }

                           var17 = class39.field388 + 180 + 80;
                           if(var4 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var19 - 20 && var15 <= var19 + 20) {
                              class225.method4563(true);
                           }
                        } else if(class39.field398 == 12) {
                           String var13 = "";
                           switch(class39.field371) {
                           case 0:
                              var13 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                              break;
                           case 1:
                              var13 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                              break;
                           default:
                              class225.method4563(false);
                           }

                           var8 = class39.field388 + 180;
                           var9 = 276;
                           if(var4 == 1 && var14 >= var8 - 75 && var14 <= var8 + 75 && var15 >= var9 - 20 && var15 <= var9 + 20) {
                              class212.method4358(var13, true, false);
                              class163.method3007("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                              class39.field398 = 6;
                              return;
                           }

                           var8 = class39.field388 + 180;
                           var9 = 326;
                           if(var4 == 1 && var14 >= var8 - 75 && var14 <= var8 + 75 && var15 >= var9 - 20 && var15 <= var9 + 20) {
                              class225.method4563(false);
                           }
                        }
                     }
                  } else {
                     while(ServerProt.method3134()) {
                        if(class286.field3584 == 84) {
                           class225.method4563(false);
                        } else if(class286.field3584 == 13) {
                           class39.field398 = 0;
                        }
                     }

                     var17 = class329.field3984 - 80;
                     var19 = 321;
                     if(var4 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var19 - 20 && var15 <= var19 + 20) {
                        class225.method4563(false);
                     }

                     var17 = class329.field3984 + 80;
                     if(var4 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var19 - 20 && var15 <= var19 + 20) {
                        class39.field398 = 0;
                     }
                  }
               }

            }
         }
      }
   }
}
