package net.runelite.client.standalone;

import java.awt.Component;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
public class class224 {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 2046469953
   )
   int field2187;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 969812787
   )
   int field2188;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 891800655
   )
   int field2190;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -852216871
   )
   int field2192;

   class224() {
   }

   @ObfuscatedSignature(
      signature = "(Ldi;)V"
   )
   class224(class224 var1) {
      this.field2187 = var1.field2187;
      this.field2188 = var1.field2188;
      this.field2192 = var1.field2192;
      this.field2190 = var1.field2190;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;I)V",
      garbageValue = "528487552"
   )
   static void method4018(Component var0) {
      var0.addMouseListener(class226.field2208);
      var0.addMouseMotionListener(class226.field2208);
      var0.addFocusListener(class226.field2208);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "11122"
   )
   static void method4017() {
      class31.field241 = null;
      class102.field961 = null;
      class31.field242 = null;
      class31.field243 = null;
      class188.field1801 = null;
      class152.field1452 = null;
      class198.field1868 = null;
      class31.field244 = null;
      class86.field777 = null;
      class112.field1053 = null;
      class305.field3263 = null;
      class188.field1796 = null;
   }

   @ObfuscatedName("ig")
   @ObfuscatedSignature(
      signature = "([Lhw;IIIIIIIII)V",
      garbageValue = "1880618670"
   )
   static final void method4019(class329[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      client.gameDraw(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      class89.method1532(var2, var3, var4, var5);
      class257.method4570();

      for(int var9 = 0; var9 < var0.length; ++var9) {
         class329 var10 = var0[var9];
         if(var10 != null && (var10.field3563 == var1 || var1 == -1412584499 && var10 == client.field3905)) {
            int var11;
            if(var8 == -1) {
               client.field3901[client.field3935] = var10.field3620 + var6;
               client.field3941[client.field3935] = var7 + var10.field3558;
               client.field3942[client.field3935] = var10.field3559;
               client.field3943[client.field3935] = var10.field3560;
               var11 = ++client.field3935 - 1;
            } else {
               var11 = var8;
            }

            var10.field3681 = var11;
            var10.field3653 = client.field3744;
            if(!var10.field3543 || !class125.method2286(var10)) {
               if(var10.field3548 > 0) {
                  class96.method1673(var10);
               }

               int var12 = var10.field3620 + var6;
               int var13 = var7 + var10.field3558;
               int var14 = var10.field3638;
               int var15;
               int var16;
               if(var10 == client.field3905) {
                  if(var1 != -1412584499 && !var10.field3632) {
                     class180.field1714 = var0;
                     class87.field799 = var6;
                     class285.field3067 = var7;
                     continue;
                  }

                  if(client.field3916 && client.field3910) {
                     var15 = class226.field2215;
                     var16 = class226.field2216;
                     var15 -= client.field3883;
                     var16 -= client.field3886;
                     if(var15 < client.field3827) {
                        var15 = client.field3827;
                     }

                     if(var15 + var10.field3559 > client.field3827 + client.field3914.field3559) {
                        var15 = client.field3827 + client.field3914.field3559 - var10.field3559;
                     }

                     if(var16 < client.field3912) {
                        var16 = client.field3912;
                     }

                     if(var16 + var10.field3560 > client.field3912 + client.field3914.field3560) {
                        var16 = client.field3912 + client.field3914.field3560 - var10.field3560;
                     }

                     var12 = var15;
                     var13 = var16;
                  }

                  if(!var10.field3632) {
                     var14 = 128;
                  }
               }

               int var17;
               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               if(var10.field3546 == 2) {
                  var15 = var2;
                  var16 = var3;
                  var17 = var4;
                  var18 = var5;
               } else if(var10.field3546 == 9) {
                  var19 = var12;
                  var20 = var13;
                  var21 = var12 + var10.field3559;
                  var22 = var13 + var10.field3560;
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
                  var19 = var12 + var10.field3559;
                  var20 = var13 + var10.field3560;
                  var15 = var12 > var2?var12:var2;
                  var16 = var13 > var3?var13:var3;
                  var17 = var19 < var4?var19:var4;
                  var18 = var20 < var5?var20:var5;
               }

               if(!var10.field3543 || var15 < var17 && var16 < var18) {
                  if(var10.field3548 != 0) {
                     if(var10.field3548 == 1336) {
                        if(client.field3750) {
                           var13 += 15;
                           class9.field76.method3527("Fps:" + class181.field1725, var12 + var10.field3559, var13, 16776960, -1);
                           var13 += 15;
                           Runtime var42 = Runtime.getRuntime();
                           var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L);
                           var21 = 16776960;
                           if(var20 > 327680 && !client.field3736) {
                              var21 = 16711680;
                           }

                           class9.field76.method3527("Mem:" + var20 + "k", var12 + var10.field3559, var13, var21, -1);
                           var13 += 15;
                        }
                        continue;
                     }

                     if(var10.field3548 == 1337) {
                        client.field3881 = var12;
                        client.field3882 = var13;
                        class67.method1150(var12, var13, var10.field3559, var10.field3560);
                        client.field3930[var10.field3681] = true;
                        class89.method1532(var2, var3, var4, var5);
                        continue;
                     }

                     if(var10.field3548 == 1338) {
                        class230.method4116(var10, var12, var13, var11);
                        class89.method1532(var2, var3, var4, var5);
                        continue;
                     }

                     if(var10.field3548 == 1339) {
                        class156.method2735(var10, var12, var13, var11);
                        class89.method1532(var2, var3, var4, var5);
                        continue;
                     }

                     if(var10.field3548 == 1400) {
                        class63.field587.method1401(var12, var13, var10.field3559, var10.field3560, client.field3744);
                     }

                     if(var10.field3548 == 1401) {
                        class63.field587.method1352(var12, var13, var10.field3559, var10.field3560);
                     }
                  }

                  if(var10.field3546 == 0) {
                     if(!var10.field3543 && class125.method2286(var10) && var10 != class281.field3036) {
                        continue;
                     }

                     if(!var10.field3543) {
                        if(var10.field3566 > var10.field3568 - var10.field3560) {
                           var10.field3566 = var10.field3568 - var10.field3560;
                        }

                        if(var10.field3566 < 0) {
                           var10.field3566 = 0;
                        }
                     }

                     method4019(var0, var10.field3607, var15, var16, var17, var18, var12 - var10.field3565, var13 - var10.field3566, var11);
                     if(var10.field3674 != null) {
                        method4019(var10.field3674, var10.field3607, var15, var16, var17, var18, var12 - var10.field3565, var13 - var10.field3566, var11);
                     }

                     class45 var30 = (class45)client.field3991.method5310((long)var10.field3607);
                     if(var30 != null) {
                        class126.method2331(var30.field351, var15, var16, var17, var18, var12, var13, var11);
                     }

                     class89.method1532(var2, var3, var4, var5);
                     class257.method4570();
                  }

                  if(client.field3946 || client.field3747[var11] || client.field3944 > 1) {
                     if(var10.field3546 == 0 && !var10.field3543 && var10.field3568 > var10.field3560) {
                        class180.method3017(var12 + var10.field3559, var13, var10.field3566, var10.field3560, var10.field3568);
                     }

                     if(var10.field3546 != 1) {
                        int var23;
                        int var24;
                        int var25;
                        int var26;
                        if(var10.field3546 == 2) {
                           var19 = 0;

                           for(var20 = 0; var20 < var10.field3556; ++var20) {
                              for(var21 = 0; var21 < var10.field3555; ++var21) {
                                 var22 = var12 + var21 * (var10.field3541 + 32);
                                 var23 = var13 + var20 * (var10.field3641 + 32);
                                 if(var19 < 20) {
                                    var22 += var10.field3613[var19];
                                    var23 += var10.field3614[var19];
                                 }

                                 if(var10.field3668[var19] <= 0) {
                                    if(var10.field3615 != null && var19 < 20) {
                                       class26 var45 = var10.method5885(var19);
                                       if(var45 != null) {
                                          var45.method378(var22, var23);
                                       } else if(class329.field3564) {
                                          class184.method3216(var10);
                                       }
                                    }
                                 } else {
                                    boolean var37 = false;
                                    boolean var38 = false;
                                    var26 = var10.field3668[var19] - 1;
                                    if(var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == class38.field286 && var19 == client.field3840) {
                                       class26 var27;
                                       if(client.field3885 == 1 && var19 == class213.field2059 && var10.field3607 == class7.field53) {
                                          var27 = class294.method5138(var26, var10.field3682[var19], 2, 0, 2, false);
                                       } else {
                                          var27 = class294.method5138(var26, var10.field3682[var19], 1, 3153952, 2, false);
                                       }

                                       if(var27 != null) {
                                          if(var10 == class38.field286 && var19 == client.field3840) {
                                             var24 = class226.field2215 - client.field3841;
                                             var25 = class226.field2216 - client.field3931;
                                             if(var24 < 5 && var24 > -5) {
                                                var24 = 0;
                                             }

                                             if(var25 < 5 && var25 > -5) {
                                                var25 = 0;
                                             }

                                             if(client.field3845 < 5) {
                                                var24 = 0;
                                                var25 = 0;
                                             }

                                             var27.method384(var24 + var22, var23 + var25, 128);
                                             if(var1 != -1) {
                                                class329 var28 = var0[var1 & 65535];
                                                int var29;
                                                if(var23 + var25 < class89.field865 && var28.field3566 > 0) {
                                                   var29 = (class89.field865 - var23 - var25) * client.field3989 / 3;
                                                   if(var29 > client.field3989 * 10) {
                                                      var29 = client.field3989 * 10;
                                                   }

                                                   if(var29 > var28.field3566) {
                                                      var29 = var28.field3566;
                                                   }

                                                   var28.field3566 -= var29;
                                                   client.field3931 += var29;
                                                   class184.method3216(var28);
                                                }

                                                if(var23 + var25 + 32 > class89.field866 && var28.field3566 < var28.field3568 - var28.field3560) {
                                                   var29 = (var25 + var23 + 32 - class89.field866) * client.field3989 / 3;
                                                   if(var29 > client.field3989 * 10) {
                                                      var29 = client.field3989 * 10;
                                                   }

                                                   if(var29 > var28.field3568 - var28.field3560 - var28.field3566) {
                                                      var29 = var28.field3568 - var28.field3560 - var28.field3566;
                                                   }

                                                   var28.field3566 += var29;
                                                   client.field3931 -= var29;
                                                   class184.method3216(var28);
                                                }
                                             }
                                          } else if(var10 == class168.field1558 && var19 == client.field3839) {
                                             var27.method384(var22, var23, 128);
                                          } else {
                                             var27.method378(var22, var23);
                                          }
                                       } else {
                                          class184.method3216(var10);
                                       }
                                    }
                                 }

                                 ++var19;
                              }
                           }
                        } else if(var10.field3546 == 3) {
                           if(class72.method1171(var10)) {
                              var19 = var10.field3570;
                              if(var10 == class281.field3036 && var10.field3540 != 0) {
                                 var19 = var10.field3540;
                              }
                           } else {
                              var19 = var10.field3619;
                              if(var10 == class281.field3036 && var10.field3683 != 0) {
                                 var19 = var10.field3683;
                              }
                           }

                           if(var10.field3573) {
                              switch(var10.field3574.field736) {
                              case 1:
                                 class89.method1536(var12, var13, var10.field3559, var10.field3560, var10.field3619, var10.field3570);
                                 break;
                              case 2:
                                 class89.method1541(var12, var13, var10.field3559, var10.field3560, var10.field3619, var10.field3570, 255 - (var10.field3638 & 255), 255 - (var10.field3544 & 255));
                                 break;
                              default:
                                 if(var14 == 0) {
                                    class89.method1561(var12, var13, var10.field3559, var10.field3560, var19);
                                 } else {
                                    class89.method1539(var12, var13, var10.field3559, var10.field3560, var19, 256 - (var14 & 255));
                                 }
                              }
                           } else if(var14 == 0) {
                              class89.method1543(var12, var13, var10.field3559, var10.field3560, var19);
                           } else {
                              class89.method1544(var12, var13, var10.field3559, var10.field3560, var19, 256 - (var14 & 255));
                           }
                        } else {
                           class277 var39;
                           if(var10.field3546 == 4) {
                              var39 = var10.method5884();
                              if(var39 == null) {
                                 if(class329.field3564) {
                                    class184.method3216(var10);
                                 }
                              } else {
                                 String var44 = var10.field3605;
                                 if(class72.method1171(var10)) {
                                    var20 = var10.field3570;
                                    if(var10 == class281.field3036 && var10.field3540 != 0) {
                                       var20 = var10.field3540;
                                    }

                                    if(var10.field3655.length() > 0) {
                                       var44 = var10.field3655;
                                    }
                                 } else {
                                    var20 = var10.field3619;
                                    if(var10 == class281.field3036 && var10.field3683 != 0) {
                                       var20 = var10.field3683;
                                    }
                                 }

                                 if(var10.field3543 && var10.field3662 != -1) {
                                    class120 var47 = class67.method1152(var10.field3662);
                                    var44 = var47.field1119;
                                    if(var44 == null) {
                                       var44 = "null";
                                    }

                                    if((var47.field1108 == 1 || var10.field3671 != 1) && var10.field3671 != -1) {
                                       var44 = class294.method5136(16748608) + var44 + "</col>" + " " + 'x' + class263.method4815(var10.field3671);
                                    }
                                 }

                                 if(var10 == client.field3898) {
                                    var44 = "Please wait...";
                                    var20 = var10.field3619;
                                 }

                                 if(!var10.field3543) {
                                    var44 = class289.method5108(var44, var10);
                                 }

                                 var39.method3579(var44, var12, var13, var10.field3559, var10.field3560, var20, var10.field3610?0:-1, var10.field3587, var10.field3609, var10.field3583);
                              }
                           } else if(var10.field3546 == 5) {
                              class26 var40;
                              if(!var10.field3543) {
                                 var40 = var10.method5883(class72.method1171(var10), -2104496961);
                                 if(var40 != null) {
                                    var40.method378(var12, var13);
                                 } else if(class329.field3564) {
                                    class184.method3216(var10);
                                 }
                              } else {
                                 if(var10.field3662 != -1) {
                                    var40 = class294.method5138(var10.field3662, var10.field3671, var10.field3580, var10.field3584, var10.field3603, false);
                                 } else {
                                    var40 = var10.method5883(false, 65816934);
                                 }

                                 if(var40 == null) {
                                    if(class329.field3564) {
                                       class184.method3216(var10);
                                    }
                                 } else {
                                    var20 = var40.field207;
                                    var21 = var40.field210;
                                    if(!var10.field3623) {
                                       var22 = var10.field3559 * 4096 / var20;
                                       if(var10.field3578 != 0) {
                                          var40.method396(var10.field3559 / 2 + var12, var10.field3560 / 2 + var13, var10.field3578, var22);
                                       } else if(var14 != 0) {
                                          var40.method463(var12, var13, var10.field3559, var10.field3560, 256 - (var14 & 255));
                                       } else if(var20 == var10.field3559 && var21 == var10.field3560) {
                                          var40.method378(var12, var13);
                                       } else {
                                          var40.method457(var12, var13, var10.field3559, var10.field3560);
                                       }
                                    } else {
                                       class89.method1552(var12, var13, var12 + var10.field3559, var13 + var10.field3560);
                                       var22 = (var20 - 1 + var10.field3559) / var20;
                                       var23 = (var21 - 1 + var10.field3560) / var21;

                                       for(var24 = 0; var24 < var22; ++var24) {
                                          for(var25 = 0; var25 < var23; ++var25) {
                                             if(var10.field3578 != 0) {
                                                var40.method396(var20 / 2 + var12 + var20 * var24, var21 / 2 + var13 + var21 * var25, var10.field3578, 4096);
                                             } else if(var14 != 0) {
                                                var40.method384(var12 + var20 * var24, var13 + var21 * var25, 256 - (var14 & 255));
                                             } else {
                                                var40.method378(var12 + var24 * var20, var13 + var25 * var21);
                                             }
                                          }
                                       }

                                       class89.method1532(var2, var3, var4, var5);
                                    }
                                 }
                              }
                           } else {
                              class120 var32;
                              if(var10.field3546 == 6) {
                                 boolean var36 = class72.method1171(var10);
                                 if(var36) {
                                    var20 = var10.field3592;
                                 } else {
                                    var20 = var10.field3591;
                                 }

                                 class200 var41 = null;
                                 var22 = 0;
                                 if(var10.field3662 != -1) {
                                    var32 = class67.method1152(var10.field3662);
                                    if(var32 != null) {
                                       var32 = var32.method2160(var10.field3671);
                                       var41 = var32.method2159(1);
                                       if(var41 != null) {
                                          var41.method3374();
                                          var22 = var41.field3281 / 2;
                                       } else {
                                          class184.method3216(var10);
                                       }
                                    }
                                 } else if(var10.field3552 == 5) {
                                    if(var10.field3588 == 0) {
                                       var41 = client.field3854.method761((class321)null, -1, (class321)null, -1);
                                    } else {
                                       var41 = class5.field43.vmethod5291((short)-24950);
                                    }
                                 } else if(var20 == -1) {
                                    var41 = var10.method5886((class321)null, -1, var36, class5.field43.field576);
                                    if(var41 == null && class329.field3564) {
                                       class184.method3216(var10);
                                    }
                                 } else {
                                    class321 var46 = class182.method3192(var20);
                                    var41 = var10.method5886(var46, var10.field3672, var36, class5.field43.field576);
                                    if(var41 == null && class329.field3564) {
                                       class184.method3216(var10);
                                    }
                                 }

                                 class257.method4573(var10.field3559 / 2 + var12, var10.field3560 / 2 + var13);
                                 var23 = class257.field2564[var10.field3673] * var10.field3598 >> 16;
                                 var24 = class257.field2558[var10.field3673] * var10.field3598 >> 16;
                                 if(var41 != null) {
                                    if(!var10.field3543) {
                                       var41.method3387(0, var10.field3596, 0, var10.field3673, 0, var23, var24);
                                    } else {
                                       var41.method3374();
                                       if(var10.field3601) {
                                          var41.method3388(0, var10.field3596, var10.field3657, var10.field3673, var10.field3593, var23 + var22 + var10.field3594, var24 + var10.field3594, var10.field3598);
                                       } else {
                                          var41.method3387(0, var10.field3596, var10.field3657, var10.field3673, var10.field3593, var22 + var23 + var10.field3594, var24 + var10.field3594);
                                       }
                                    }
                                 }

                                 class257.method4649();
                              } else {
                                 if(var10.field3546 == 7) {
                                    var39 = var10.method5884();
                                    if(var39 == null) {
                                       if(class329.field3564) {
                                          class184.method3216(var10);
                                       }
                                       continue;
                                    }

                                    var20 = 0;

                                    for(var21 = 0; var21 < var10.field3556; ++var21) {
                                       for(var22 = 0; var22 < var10.field3555; ++var22) {
                                          if(var10.field3668[var20] > 0) {
                                             var32 = class67.method1152(var10.field3668[var20] - 1);
                                             String var33;
                                             if(var32.field1108 != 1 && var10.field3682[var20] == 1) {
                                                var33 = class294.method5136(16748608) + var32.field1119 + "</col>";
                                             } else {
                                                var33 = class294.method5136(16748608) + var32.field1119 + "</col>" + " " + 'x' + class263.method4815(var10.field3682[var20]);
                                             }

                                             var25 = var22 * (var10.field3541 + 115) + var12;
                                             var26 = var21 * (var10.field3641 + 12) + var13;
                                             if(var10.field3587 == 0) {
                                                var39.method3543(var33, var25, var26, var10.field3619, var10.field3610?0:-1);
                                             } else if(var10.field3587 == 1) {
                                                var39.method3590(var33, var10.field3559 / 2 + var25, var26, var10.field3619, var10.field3610?0:-1);
                                             } else {
                                                var39.method3527(var33, var25 + var10.field3559 - 1, var26, var10.field3619, var10.field3610?0:-1);
                                             }
                                          }

                                          ++var20;
                                       }
                                    }
                                 }

                                 if(var10.field3546 == 8 && var10 == class323.field3463 && client.field3953 == client.field3911) {
                                    var19 = 0;
                                    var20 = 0;
                                    class277 var31 = class9.field76;
                                    String var34 = var10.field3605;

                                    String var43;
                                    for(var34 = class289.method5108(var34, var10); var34.length() > 0; var20 = var20 + var31.field2015 + 1) {
                                       var24 = var34.indexOf("<br>");
                                       if(var24 != -1) {
                                          var43 = var34.substring(0, var24);
                                          var34 = var34.substring(var24 + 4);
                                       } else {
                                          var43 = var34;
                                          var34 = "";
                                       }

                                       var25 = var31.method3601(var43);
                                       if(var25 > var19) {
                                          var19 = var25;
                                       }
                                    }

                                    var19 += 6;
                                    var20 += 7;
                                    var24 = var12 + var10.field3559 - 5 - var19;
                                    var25 = var13 + var10.field3560 + 5;
                                    if(var24 < var12 + 5) {
                                       var24 = var12 + 5;
                                    }

                                    if(var24 + var19 > var4) {
                                       var24 = var4 - var19;
                                    }

                                    if(var25 + var20 > var5) {
                                       var25 = var5 - var20;
                                    }

                                    class89.method1561(var24, var25, var19, var20, 16777120);
                                    class89.method1543(var24, var25, var19, var20, 0);
                                    var34 = var10.field3605;
                                    var26 = var25 + var31.field2015 + 2;

                                    for(var34 = class289.method5108(var34, var10); var34.length() > 0; var26 = var26 + var31.field2015 + 1) {
                                       int var35 = var34.indexOf("<br>");
                                       if(var35 != -1) {
                                          var43 = var34.substring(0, var35);
                                          var34 = var34.substring(var35 + 4);
                                       } else {
                                          var43 = var34;
                                          var34 = "";
                                       }

                                       var31.method3543(var43, var24 + 3, var26, 0, -1);
                                    }
                                 }

                                 if(var10.field3546 == 9) {
                                    if(var10.field3604) {
                                       var19 = var12;
                                       var20 = var13 + var10.field3560;
                                       var21 = var12 + var10.field3559;
                                       var22 = var13;
                                    } else {
                                       var19 = var12;
                                       var20 = var13;
                                       var21 = var12 + var10.field3559;
                                       var22 = var13 + var10.field3560;
                                    }

                                    if(var10.field3577 == 1) {
                                       class89.method1547(var19, var20, var21, var22, var10.field3619);
                                    } else {
                                       class278.method4941(var19, var20, var21, var22, var10.field3619, var10.field3577);
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
