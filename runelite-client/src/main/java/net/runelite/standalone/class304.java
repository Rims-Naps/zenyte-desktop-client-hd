package net.runelite.standalone;

import java.awt.Component;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
public class class304 {
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 969812787
   )
   int field3766;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 891800655
   )
   int field3768;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 2046469953
   )
   int field3765;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -852216871
   )
   int field3770;

   class304() {
   }

   @ObfuscatedSignature(
      signature = "(Ldi;)V"
   )
   class304(class304 var1) {
      this.field3765 = var1.field3765;
      this.field3766 = var1.field3766;
      this.field3770 = var1.field3770;
      this.field3768 = var1.field3768;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "11122"
   )
   static void method5996() {
      class185.field2514 = null;
      class210.field2891 = null;
      class185.field2515 = null;
      class185.field2516 = null;
      class142.field1808 = null;
      class285.field3573 = null;
      class30.field286 = null;
      class185.field2517 = null;
      class74.field839 = null;
      class212.field2923 = null;
      class62.field735 = null;
      class142.field1803 = null;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;I)V",
      garbageValue = "528487552"
   )
   static void method5997(Component var0) {
      var0.addMouseListener(class163.field1968);
      var0.addMouseMotionListener(class163.field1968);
      var0.addFocusListener(class163.field1968);
   }

   @ObfuscatedName("ig")
   @ObfuscatedSignature(
      signature = "([Lhw;IIIIIIIII)V",
      garbageValue = "1880618670"
   )
   static final void method5998(class187[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      client.gameDraw(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      class173.method3138(var2, var3, var4, var5);
      class211.method4247();

      for(int var9 = 0; var9 < var0.length; ++var9) {
         class187 var10 = var0[var9];
         if(var10 != null && (var10.field2577 == var1 || var1 == -1412584499 && var10 == client.field2326)) {
            int var11;
            if(var8 == -1) {
               client.field2322[client.field2356] = var10.field2634 + var6;
               client.field2362[client.field2356] = var7 + var10.field2572;
               client.field2363[client.field2356] = var10.field2573;
               client.field2364[client.field2356] = var10.field2574;
               var11 = ++client.field2356 - 1;
            } else {
               var11 = var8;
            }

            var10.field2695 = var11;
            var10.field2667 = client.field2165;
            if(!var10.field2557 || !class267.method5315(var10)) {
               if(var10.field2562 > 0) {
                  class59.method1282(var10);
               }

               int var12 = var10.field2634 + var6;
               int var13 = var7 + var10.field2572;
               int var14 = var10.field2652;
               int var15;
               int var16;
               if(var10 == client.field2326) {
                  if(var1 != -1412584499 && !var10.field2646) {
                     class218.field2973 = var0;
                     class149.field1849 = var6;
                     class54.field661 = var7;
                     continue;
                  }

                  if(client.field2337 && client.field2331) {
                     var15 = class163.field1975;
                     var16 = class163.field1976;
                     var15 -= client.field2304;
                     var16 -= client.field2307;
                     if(var15 < client.field2248) {
                        var15 = client.field2248;
                     }

                     if(var15 + var10.field2573 > client.field2248 + client.field2335.field2573) {
                        var15 = client.field2248 + client.field2335.field2573 - var10.field2573;
                     }

                     if(var16 < client.field2333) {
                        var16 = client.field2333;
                     }

                     if(var16 + var10.field2574 > client.field2333 + client.field2335.field2574) {
                        var16 = client.field2333 + client.field2335.field2574 - var10.field2574;
                     }

                     var12 = var15;
                     var13 = var16;
                  }

                  if(!var10.field2646) {
                     var14 = 128;
                  }
               }

               int var17;
               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               if(var10.field2560 == 2) {
                  var15 = var2;
                  var16 = var3;
                  var17 = var4;
                  var18 = var5;
               } else if(var10.field2560 == 9) {
                  var19 = var12;
                  var20 = var13;
                  var21 = var12 + var10.field2573;
                  var22 = var13 + var10.field2574;
                  if(var21 < var12) {
                     var19 = var21;
                     var21 = var12;
                  }

                  if(var22 < var13) {
                     var20 = var22;
                     var22 = var13;
                  }

                  ++var21;
                  ++var22;
                  var15 = var19 > var2?var19:var2;
                  var16 = var20 > var3?var20:var3;
                  var17 = var21 < var4?var21:var4;
                  var18 = var22 < var5?var22:var5;
               } else {
                  var19 = var12 + var10.field2573;
                  var20 = var13 + var10.field2574;
                  var15 = var12 > var2?var12:var2;
                  var16 = var13 > var3?var13:var3;
                  var17 = var19 < var4?var19:var4;
                  var18 = var20 < var5?var20:var5;
               }

               if(!var10.field2557 || var15 < var17 && var16 < var18) {
                  if(var10.field2562 != 0) {
                     if(var10.field2562 == 1336) {
                        if(client.field2171) {
                           var13 += 15;
                           class194.field2772.method3816("Fps:" + GameEngine.field3723, var12 + var10.field2573, var13, 16776960, -1);
                           var13 += 15;
                           Runtime var42 = Runtime.getRuntime();
                           var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L);
                           var21 = 16776960;
                           if(var20 > 327680 && !client.field2157) {
                              var21 = 16711680;
                           }

                           class194.field2772.method3816("Mem:" + var20 + "k", var12 + var10.field2573, var13, var21, -1);
                           var13 += 15;
                        }
                        continue;
                     }

                     if(var10.field2562 == 1337) {
                        client.field2302 = var12;
                        client.field2303 = var13;
                        class164.method3012(var12, var13, var10.field2573, var10.field2574);
                        client.field2351[var10.field2695] = true;
                        class173.method3138(var2, var3, var4, var5);
                        continue;
                     }

                     if(var10.field2562 == 1338) {
                        class317.method6212(var10, var12, var13, var11);
                        class173.method3138(var2, var3, var4, var5);
                        continue;
                     }

                     if(var10.field2562 == 1339) {
                        class316.method6198(var10, var12, var13, var11);
                        class173.method3138(var2, var3, var4, var5);
                        continue;
                     }

                     if(var10.field2562 == 1400) {
                        class199.field2812.method5560(var12, var13, var10.field2573, var10.field2574, client.field2165);
                     }

                     if(var10.field2562 == 1401) {
                        class199.field2812.method5511(var12, var13, var10.field2573, var10.field2574);
                     }
                  }

                  if(var10.field2560 == 0) {
                     if(!var10.field2557 && class267.method5315(var10) && var10 != class263.field3408) {
                        continue;
                     }

                     if(!var10.field2557) {
                        if(var10.field2580 > var10.field2582 - var10.field2574) {
                           var10.field2580 = var10.field2582 - var10.field2574;
                        }

                        if(var10.field2580 < 0) {
                           var10.field2580 = 0;
                        }
                     }

                     method5998(var0, var10.field2621, var15, var16, var17, var18, var12 - var10.field2579, var13 - var10.field2580, var11);
                     if(var10.field2688 != null) {
                        method5998(var10.field2688, var10.field2621, var15, var16, var17, var18, var12 - var10.field2579, var13 - var10.field2580, var11);
                     }

                     class322 var30 = (class322)client.field2412.method1776((long)var10.field2621);
                     if(var30 != null) {
                        class88.method1679(var30.field3937, var15, var16, var17, var18, var12, var13, var11);
                     }

                     class173.method3138(var2, var3, var4, var5);
                     class211.method4247();
                  }

                  if(client.field2367 || client.field2168[var11] || client.field2365 > 1) {
                     if(var10.field2560 == 0 && !var10.field2557 && var10.field2582 > var10.field2574) {
                        class218.method4496(var12 + var10.field2573, var13, var10.field2580, var10.field2574, var10.field2582);
                     }

                     if(var10.field2560 != 1) {
                        int var23;
                        int var24;
                        int var25;
                        int var26;
                        if(var10.field2560 == 2) {
                           var19 = 0;

                           for(var20 = 0; var20 < var10.field2570; ++var20) {
                              for(var21 = 0; var21 < var10.field2569; ++var21) {
                                 var22 = var12 + var21 * (var10.field2555 + 32);
                                 var23 = var13 + var20 * (var10.field2655 + 32);
                                 if(var19 < 20) {
                                    var22 += var10.field2627[var19];
                                    var23 += var10.field2628[var19];
                                 }

                                 if(var10.field2682[var19] <= 0) {
                                    if(var10.field2629 != null && var19 < 20) {
                                       SpritePixels var45 = var10.method3760(var19);
                                       if(var45 != null) {
                                          var45.method215(var22, var23);
                                       } else if(class187.field2578) {
                                          class230.method4617(var10);
                                       }
                                    }
                                 } else {
                                    boolean var37 = false;
                                    boolean var38 = false;
                                    var26 = var10.field2682[var19] - 1;
                                    if(var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == class283.field3562 && var19 == client.field2261) {
                                       SpritePixels var27;
                                       if(client.field2306 == 1 && var19 == class72.field826 && var10.field2621 == class314.field3853) {
                                          var27 = class64.method1356(var26, var10.field2696[var19], 2, 0, 2, false);
                                       } else {
                                          var27 = class64.method1356(var26, var10.field2696[var19], 1, 3153952, 2, false);
                                       }

                                       if(var27 != null) {
                                          if(var10 == class283.field3562 && var19 == client.field2261) {
                                             var24 = class163.field1975 - client.field2262;
                                             var25 = class163.field1976 - client.field2352;
                                             if(var24 < 5 && var24 > -5) {
                                                var24 = 0;
                                             }

                                             if(var25 < 5 && var25 > -5) {
                                                var25 = 0;
                                             }

                                             if(client.field2266 < 5) {
                                                var24 = 0;
                                                var25 = 0;
                                             }

                                             var27.method221(var24 + var22, var23 + var25, 128);
                                             if(var1 != -1) {
                                                class187 var28 = var0[var1 & 65535];
                                                int var29;
                                                if(var23 + var25 < class173.field2122 && var28.field2580 > 0) {
                                                   var29 = (class173.field2122 - var23 - var25) * client.field2410 / 3;
                                                   if(var29 > client.field2410 * 10) {
                                                      var29 = client.field2410 * 10;
                                                   }

                                                   if(var29 > var28.field2580) {
                                                      var29 = var28.field2580;
                                                   }

                                                   var28.field2580 -= var29;
                                                   client.field2352 += var29;
                                                   class230.method4617(var28);
                                                }

                                                if(var23 + var25 + 32 > class173.field2123 && var28.field2580 < var28.field2582 - var28.field2574) {
                                                   var29 = (var25 + var23 + 32 - class173.field2123) * client.field2410 / 3;
                                                   if(var29 > client.field2410 * 10) {
                                                      var29 = client.field2410 * 10;
                                                   }

                                                   if(var29 > var28.field2582 - var28.field2574 - var28.field2580) {
                                                      var29 = var28.field2582 - var28.field2574 - var28.field2580;
                                                   }

                                                   var28.field2580 += var29;
                                                   client.field2352 -= var29;
                                                   class230.method4617(var28);
                                                }
                                             }
                                          } else if(var10 == class265.field3448 && var19 == client.field2260) {
                                             var27.method221(var22, var23, 128);
                                          } else {
                                             var27.method215(var22, var23);
                                          }
                                       } else {
                                          class230.method4617(var10);
                                       }
                                    }
                                 }

                                 ++var19;
                              }
                           }
                        } else if(var10.field2560 == 3) {
                           if(class188.method3803(var10)) {
                              var19 = var10.field2584;
                              if(var10 == class263.field3408 && var10.field2554 != 0) {
                                 var19 = var10.field2554;
                              }
                           } else {
                              var19 = var10.field2633;
                              if(var10 == class263.field3408 && var10.field2697 != 0) {
                                 var19 = var10.field2697;
                              }
                           }

                           if(var10.field2587) {
                              switch(var10.field2588.field1756) {
                              case 1:
                                 class173.method3142(var12, var13, var10.field2573, var10.field2574, var10.field2633, var10.field2584);
                                 break;
                              case 2:
                                 class173.method3147(var12, var13, var10.field2573, var10.field2574, var10.field2633, var10.field2584, 255 - (var10.field2652 & 255), 255 - (var10.field2558 & 255));
                                 break;
                              default:
                                 if(var14 == 0) {
                                    class173.method3167(var12, var13, var10.field2573, var10.field2574, var19);
                                 } else {
                                    class173.method3145(var12, var13, var10.field2573, var10.field2574, var19, 256 - (var14 & 255));
                                 }
                              }
                           } else if(var14 == 0) {
                              class173.method3149(var12, var13, var10.field2573, var10.field2574, var19);
                           } else {
                              class173.method3150(var12, var13, var10.field2573, var10.field2574, var19, 256 - (var14 & 255));
                           }
                        } else {
                           class299 var39;
                           if(var10.field2560 == 4) {
                              var39 = var10.method3759();
                              if(var39 == null) {
                                 if(class187.field2578) {
                                    class230.method4617(var10);
                                 }
                              } else {
                                 String var44 = var10.field2619;
                                 if(class188.method3803(var10)) {
                                    var20 = var10.field2584;
                                    if(var10 == class263.field3408 && var10.field2554 != 0) {
                                       var20 = var10.field2554;
                                    }

                                    if(var10.field2669.length() > 0) {
                                       var44 = var10.field2669;
                                    }
                                 } else {
                                    var20 = var10.field2633;
                                    if(var10 == class263.field3408 && var10.field2697 != 0) {
                                       var20 = var10.field2697;
                                    }
                                 }

                                 if(var10.field2557 && var10.field2676 != -1) {
                                    class42 var47 = class164.method3014(var10.field2676);
                                    var44 = var47.field446;
                                    if(var44 == null) {
                                       var44 = "null";
                                    }

                                    if((var47.field435 == 1 || var10.field2685 != 1) && var10.field2685 != -1) {
                                       var44 = class64.method1354(16748608) + var44 + "</col>" + " " + 'x' + class177.method3677(var10.field2685);
                                    }
                                 }

                                 if(var10 == client.field2319) {
                                    var44 = "Please wait...";
                                    var20 = var10.field2633;
                                 }

                                 if(!var10.field2557) {
                                    var44 = class109.method1922(var44, var10);
                                 }

                                 var39.method3868(var44, var12, var13, var10.field2573, var10.field2574, var20, var10.field2624?0:-1, var10.field2601, var10.field2623, var10.field2597);
                              }
                           } else if(var10.field2560 == 5) {
                              SpritePixels var40;
                              if(!var10.field2557) {
                                 var40 = var10.method3758(class188.method3803(var10), -2104496961);
                                 if(var40 != null) {
                                    var40.method215(var12, var13);
                                 } else if(class187.field2578) {
                                    class230.method4617(var10);
                                 }
                              } else {
                                 if(var10.field2676 != -1) {
                                    var40 = class64.method1356(var10.field2676, var10.field2685, var10.field2594, var10.field2598, var10.field2617, false);
                                 } else {
                                    var40 = var10.method3758(false, 65816934);
                                 }

                                 if(var40 == null) {
                                    if(class187.field2578) {
                                       class230.method4617(var10);
                                    }
                                 } else {
                                    var20 = var40.maxWidth;
                                    var21 = var40.maxHeight;
                                    if(!var10.field2637) {
                                       var22 = var10.field2573 * 4096 / var20;
                                       if(var10.field2592 != 0) {
                                          var40.method233(var10.field2573 / 2 + var12, var10.field2574 / 2 + var13, var10.field2592, var22);
                                       } else if(var14 != 0) {
                                          var40.method300(var12, var13, var10.field2573, var10.field2574, 256 - (var14 & 255));
                                       } else if(var20 == var10.field2573 && var21 == var10.field2574) {
                                          var40.method215(var12, var13);
                                       } else {
                                          var40.method294(var12, var13, var10.field2573, var10.field2574);
                                       }
                                    } else {
                                       class173.method3158(var12, var13, var12 + var10.field2573, var13 + var10.field2574);
                                       var22 = (var20 - 1 + var10.field2573) / var20;
                                       var23 = (var21 - 1 + var10.field2574) / var21;

                                       for(var24 = 0; var24 < var22; ++var24) {
                                          for(var25 = 0; var25 < var23; ++var25) {
                                             if(var10.field2592 != 0) {
                                                var40.method233(var20 / 2 + var12 + var20 * var24, var21 / 2 + var13 + var21 * var25, var10.field2592, 4096);
                                             } else if(var14 != 0) {
                                                var40.method221(var12 + var20 * var24, var13 + var21 * var25, 256 - (var14 & 255));
                                             } else {
                                                var40.method215(var12 + var24 * var20, var13 + var25 * var21);
                                             }
                                          }
                                       }

                                       class173.method3138(var2, var3, var4, var5);
                                    }
                                 }
                              }
                           } else {
                              class42 var32;
                              if(var10.field2560 == 6) {
                                 boolean var36 = class188.method3803(var10);
                                 if(var36) {
                                    var20 = var10.field2606;
                                 } else {
                                    var20 = var10.field2605;
                                 }

                                 class52 var41 = null;
                                 var22 = 0;
                                 if(var10.field2676 != -1) {
                                    var32 = class164.method3014(var10.field2676);
                                    if(var32 != null) {
                                       var32 = var32.method778(var10.field2685);
                                       var41 = var32.method777(1);
                                       if(var41 != null) {
                                          var41.method1126();
                                          var22 = var41.field1143 / 2;
                                       } else {
                                          class230.method4617(var10);
                                       }
                                    }
                                 } else if(var10.field2566 == 5) {
                                    if(var10.field2602 == 0) {
                                       var41 = client.field2275.method6288((class312)null, -1, (class312)null, -1);
                                    } else {
                                       var41 = class32.field303.vmethod6253((short)-24950);
                                    }
                                 } else if(var20 == -1) {
                                    var41 = var10.method3761((class312)null, -1, var36, class32.field303.field2801);
                                    if(var41 == null && class187.field2578) {
                                       class230.method4617(var10);
                                    }
                                 } else {
                                    class312 var46 = class3.method74(var20);
                                    var41 = var10.method3761(var46, var10.field2686, var36, class32.field303.field2801);
                                    if(var41 == null && class187.field2578) {
                                       class230.method4617(var10);
                                    }
                                 }

                                 class211.method4250(var10.field2573 / 2 + var12, var10.field2574 / 2 + var13);
                                 var23 = class211.field2920[var10.field2687] * var10.field2612 >> 16;
                                 var24 = class211.field2914[var10.field2687] * var10.field2612 >> 16;
                                 if(var41 != null) {
                                    if(!var10.field2557) {
                                       var41.method1139(0, var10.field2610, 0, var10.field2687, 0, var23, var24);
                                    } else {
                                       var41.method1126();
                                       if(var10.field2615) {
                                          var41.method1140(0, var10.field2610, var10.field2671, var10.field2687, var10.field2607, var23 + var22 + var10.field2608, var24 + var10.field2608, var10.field2612);
                                       } else {
                                          var41.method1139(0, var10.field2610, var10.field2671, var10.field2687, var10.field2607, var22 + var23 + var10.field2608, var24 + var10.field2608);
                                       }
                                    }
                                 }

                                 class211.method4326();
                              } else {
                                 if(var10.field2560 == 7) {
                                    var39 = var10.method3759();
                                    if(var39 == null) {
                                       if(class187.field2578) {
                                          class230.method4617(var10);
                                       }
                                       continue;
                                    }

                                    var20 = 0;

                                    for(var21 = 0; var21 < var10.field2570; ++var21) {
                                       for(var22 = 0; var22 < var10.field2569; ++var22) {
                                          if(var10.field2682[var20] > 0) {
                                             var32 = class164.method3014(var10.field2682[var20] - 1);
                                             String var33;
                                             if(var32.field435 != 1 && var10.field2696[var20] == 1) {
                                                var33 = class64.method1354(16748608) + var32.field446 + "</col>";
                                             } else {
                                                var33 = class64.method1354(16748608) + var32.field446 + "</col>" + " " + 'x' + class177.method3677(var10.field2696[var20]);
                                             }

                                             var25 = var22 * (var10.field2555 + 115) + var12;
                                             var26 = var21 * (var10.field2655 + 12) + var13;
                                             if(var10.field2601 == 0) {
                                                var39.method3832(var33, var25, var26, var10.field2633, var10.field2624?0:-1);
                                             } else if(var10.field2601 == 1) {
                                                var39.method3879(var33, var10.field2573 / 2 + var25, var26, var10.field2633, var10.field2624?0:-1);
                                             } else {
                                                var39.method3816(var33, var25 + var10.field2573 - 1, var26, var10.field2633, var10.field2624?0:-1);
                                             }
                                          }

                                          ++var20;
                                       }
                                    }
                                 }

                                 if(var10.field2560 == 8 && var10 == class305.field3786 && client.field2374 == client.field2332) {
                                    var19 = 0;
                                    var20 = 0;
                                    class299 var31 = class194.field2772;
                                    String var34 = var10.field2619;

                                    String var43;
                                    for(var34 = class109.method1922(var34, var10); var34.length() > 0; var20 = var20 + var31.field2718 + 1) {
                                       var24 = var34.indexOf("<br>");
                                       if(var24 != -1) {
                                          var43 = var34.substring(0, var24);
                                          var34 = var34.substring(var24 + 4);
                                       } else {
                                          var43 = var34;
                                          var34 = "";
                                       }

                                       var25 = var31.method3890(var43);
                                       if(var25 > var19) {
                                          var19 = var25;
                                       }
                                    }

                                    var19 += 6;
                                    var20 += 7;
                                    var24 = var12 + var10.field2573 - 5 - var19;
                                    var25 = var13 + var10.field2574 + 5;
                                    if(var24 < var12 + 5) {
                                       var24 = var12 + 5;
                                    }

                                    if(var24 + var19 > var4) {
                                       var24 = var4 - var19;
                                    }

                                    if(var25 + var20 > var5) {
                                       var25 = var5 - var20;
                                    }

                                    class173.method3167(var24, var25, var19, var20, 16777120);
                                    class173.method3149(var24, var25, var19, var20, 0);
                                    var34 = var10.field2619;
                                    var26 = var25 + var31.field2718 + 2;

                                    for(var34 = class109.method1922(var34, var10); var34.length() > 0; var26 = var26 + var31.field2718 + 1) {
                                       int var35 = var34.indexOf("<br>");
                                       if(var35 != -1) {
                                          var43 = var34.substring(0, var35);
                                          var34 = var34.substring(var35 + 4);
                                       } else {
                                          var43 = var34;
                                          var34 = "";
                                       }

                                       var31.method3832(var43, var24 + 3, var26, 0, -1);
                                    }
                                 }

                                 if(var10.field2560 == 9) {
                                    if(var10.field2618) {
                                       var19 = var12;
                                       var20 = var13 + var10.field2574;
                                       var21 = var12 + var10.field2573;
                                       var22 = var13;
                                    } else {
                                       var19 = var12;
                                       var20 = var13;
                                       var21 = var12 + var10.field2573;
                                       var22 = var13 + var10.field2574;
                                    }

                                    if(var10.field2591 == 1) {
                                       class173.method3153(var19, var20, var21, var22, var10.field2633);
                                    } else {
                                       class277.method5378(var19, var20, var21, var22, var10.field2633, var10.field2591);
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }
}
