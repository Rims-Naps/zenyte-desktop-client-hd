package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
public enum class264 implements class26 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3412(0, 0),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3411(1, 0),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3414(2, 0),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3422(3, 0),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3432(9, 2),
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3415(4, 1),
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3426(5, 1),
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3417(6, 1),
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3418(7, 1),
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3419(8, 1),
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3420(12, 2),
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3421(13, 2),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3413(14, 2),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3423(15, 2),
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3424(16, 2),
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3410(17, 2),
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3425(18, 2),
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3427(19, 2),
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3428(20, 2),
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3429(21, 2),
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3430(10, 2),
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3431(11, 2),
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3416(22, 3);

   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 171004927
   )
   public final int field3433;

   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "0"
   )
   class264(int var3, int var4) {
      this.field3433 = var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "87"
   )
   public int vmethod6234() {
      return this.field3433;
   }

   @ObfuscatedName("iq")
   @ObfuscatedSignature(
      signature = "([Lhw;IIIIIIIS)V",
      garbageValue = "-10952"
   )
   static final void method5259(class187[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = 0; var8 < var0.length; ++var8) {
         class187 var9 = var0[var8];
         if(var9 != null && var9.field2577 == var1 && (!var9.field2557 || var9.field2560 == 0 || var9.field2644 || class203.method4026(var9) != 0 || var9 == client.field2335 || var9.field2562 == 1338)) {
            if(var9.field2557) {
               if(class267.method5315(var9)) {
                  continue;
               }
            } else if(var9.field2560 == 0 && var9 != class263.field3408 && class267.method5315(var9)) {
               continue;
            }

            int var10 = var9.field2634 + var6;
            int var11 = var7 + var9.field2572;
            int var12;
            int var13;
            int var14;
            int var15;
            int var17;
            int var18;
            if(var9.field2560 == 2) {
               var12 = var2;
               var13 = var3;
               var14 = var4;
               var15 = var5;
            } else {
               int var16;
               if(var9.field2560 == 9) {
                  var16 = var10;
                  var17 = var11;
                  var18 = var10 + var9.field2573;
                  int var19 = var11 + var9.field2574;
                  if(var18 < var10) {
                     var16 = var18;
                     var18 = var10;
                  }

                  if(var19 < var11) {
                     var17 = var19;
                     var19 = var11;
                  }

                  ++var18;
                  ++var19;
                  var12 = var16 > var2?var16:var2;
                  var13 = var17 > var3?var17:var3;
                  var14 = var18 < var4?var18:var4;
                  var15 = var19 < var5?var19:var5;
               } else {
                  var16 = var10 + var9.field2573;
                  var17 = var11 + var9.field2574;
                  var12 = var10 > var2?var10:var2;
                  var13 = var11 > var3?var11:var3;
                  var14 = var16 < var4?var16:var4;
                  var15 = var17 < var5?var17:var5;
               }
            }

            if(var9 == client.field2326) {
               client.field2334 = true;
               client.field2204 = var10;
               client.field2281 = var11;
            }

            boolean var32 = false;
            if(var9.field2632) {
               switch(client.field2336) {
               case 0:
                  var32 = true;
               case 1:
               default:
                  break;
               case 2:
                  if(client.field2316 == var9.field2621 >>> 16) {
                     var32 = true;
                  }
                  break;
               case 3:
                  if(var9.field2621 == client.field2316) {
                     var32 = true;
                  }
               }
            }

            if(var32 || !var9.field2557 || var12 < var14 && var13 < var15) {
               if(var9.field2557) {
                  class194 var26;
                  if(var9.field2698) {
                     if(class163.field1975 >= var12 && class163.field1976 >= var13 && class163.field1975 < var14 && class163.field1976 < var15) {
                        for(var26 = (class194)client.field2232.method1503(); var26 != null; var26 = (class194)client.field2232.method1505()) {
                           if(var26.field2758) {
                              var26.method3937();
                              var26.field2759.field2689 = false;
                           }
                        }

                        if(class158.field1945 == 0) {
                           client.field2326 = null;
                           client.field2335 = null;
                        }

                        if(!client.field2360) {
                           class32.method530();
                        }
                     }
                  } else if(var9.field2699 && class163.field1975 >= var12 && class163.field1976 >= var13 && class163.field1975 < var14 && class163.field1976 < var15) {
                     for(var26 = (class194)client.field2232.method1503(); var26 != null; var26 = (class194)client.field2232.method1505()) {
                        if(var26.field2758 && var26.field2759.field2665 == var26.field2765) {
                           var26.method3937();
                        }
                     }
                  }
               }

               var17 = class163.field1975;
               var18 = class163.field1976;
               if(class163.field1982 != 0) {
                  var17 = class163.field1980;
                  var18 = class163.field1984;
               }

               boolean var33 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15;
               if(var9.field2562 == 1337) {
                  if(!client.field2215 && !client.field2360 && var33) {
                     class31.method526(var17, var18, var12, var13);
                  }
               } else if(var9.field2562 == 1338) {
                  class230.method4621(var9, var10, var11);
               } else {
                  if(var9.field2562 == 1400) {
                     class199.field2812.method5491(class163.field1975, class163.field1976, var33, var10, var11, var9.field2573, var9.field2574);
                  }

                  if(!client.field2360 && var33) {
                     if(var9.field2562 == 1400) {
                        class199.field2812.method5653(var10, var11, var9.field2573, var9.field2574, var17, var18);
                     } else {
                        class108.method1906(var9, var17 - var10, var18 - var11);
                     }
                  }

                  boolean var21;
                  int var23;
                  if(var32) {
                     for(int var20 = 0; var20 < var9.field2543.length; ++var20) {
                        var21 = false;
                        boolean var22 = false;
                        if(!var21 && var9.field2543[var20] != null) {
                           for(var23 = 0; var23 < var9.field2543[var20].length; ++var23) {
                              boolean var24 = false;
                              if(var9.field2571 != null) {
                                 var24 = class96.field1040[var9.field2543[var20][var23]];
                              }

                              if(class185.method3712(var9.field2543[var20][var23]) || var24) {
                                 var21 = true;
                                 if(var9.field2571 != null && var9.field2571[var20] > client.field2165) {
                                    break;
                                 }

                                 byte var25 = var9.field2662[var20][var23];
                                 if(var25 == 0 || ((var25 & 8) == 0 || !class96.field1040[86] && !class96.field1040[82] && !class96.field1040[81]) && ((var25 & 2) == 0 || class96.field1040[86]) && ((var25 & 1) == 0 || class96.field1040[82]) && ((var25 & 4) == 0 || class96.field1040[81])) {
                                    var22 = true;
                                    break;
                                 }
                              }
                           }
                        }

                        if(var22) {
                           if(var20 < 10) {
                              class255.method5124(var20 + 1, var9.field2621, var9.field2620, var9.field2676, "");
                           } else if(var20 == 10) {
                              class103.method1853();
                              class174.method3219(var9.field2621, var9.field2620, class217.method4493(class203.method4026(var9)), var9.field2676);
                              client.field2311 = class151.method2763(var9);
                              if(client.field2311 == null) {
                                 client.field2311 = "null";
                              }

                              client.field2312 = var9.field2683 + class64.method1354(16777215);
                           }

                           var23 = var9.field2635[var20];
                           if(var9.field2571 == null) {
                              var9.field2571 = new int[var9.field2543.length];
                           }

                           if(var9.field2636 == null) {
                              var9.field2636 = new int[var9.field2543.length];
                           }

                           if(var23 != 0) {
                              if(var9.field2571[var20] == 0) {
                                 var9.field2571[var20] = var23 + client.field2165 + var9.field2636[var20];
                              } else {
                                 var9.field2571[var20] = var23 + client.field2165;
                              }
                           } else {
                              var9.field2571[var20] = Integer.MAX_VALUE;
                           }
                        }

                        if(!var21 && var9.field2571 != null) {
                           var9.field2571[var20] = 0;
                        }
                     }
                  }

                  if(var9.field2557) {
                     if(class163.field1975 >= var12 && class163.field1976 >= var13 && class163.field1975 < var14 && class163.field1976 < var15) {
                        var33 = true;
                     } else {
                        var33 = false;
                     }

                     boolean var34 = false;
                     if((class163.field1983 == 1 || !class225.field3039 && class163.field1983 == 4) && var33) {
                        var34 = true;
                     }

                     var21 = false;
                     if((class163.field1982 == 1 || !class225.field3039 && class163.field1982 == 4) && class163.field1980 >= var12 && class163.field1984 >= var13 && class163.field1980 < var14 && class163.field1984 < var15) {
                        var21 = true;
                     }

                     if(var21) {
                        class283.method5466(var9, class163.field1980 - var10, class163.field1984 - var11);
                     }

                     if(var9.field2562 == 1400) {
                        class199.field2812.method5584(var17, var18, var33 & var34, var33 & var21);
                     }

                     if(client.field2326 != null && var9 != client.field2326 && var33 && class271.method5342(class203.method4026(var9))) {
                        client.field2330 = var9;
                     }

                     if(var9 == client.field2335) {
                        client.field2331 = true;
                        client.field2248 = var10;
                        client.field2333 = var11;
                     }

                     if(var9.field2644) {
                        class194 var29;
                        if(var33 && client.field2395 != 0 && var9.field2665 != null) {
                           var29 = new class194();
                           var29.field2758 = true;
                           var29.field2759 = var9;
                           var29.field2761 = client.field2395;
                           var29.field2765 = var9.field2665;
                           client.field2232.method1499(var29);
                        }

                        if(client.field2326 != null || class283.field3562 != null || client.field2360) {
                           var21 = false;
                           var34 = false;
                           var33 = false;
                        }

                        if(!var9.field2690 && var21) {
                           var9.field2690 = true;
                           if(var9.field2643 != null) {
                              var29 = new class194();
                              var29.field2758 = true;
                              var29.field2759 = var9;
                              var29.field2764 = class163.field1980 - var10;
                              var29.field2761 = class163.field1984 - var11;
                              var29.field2765 = var9.field2643;
                              client.field2232.method1499(var29);
                           }
                        }

                        if(var9.field2690 && var34 && var9.field2668 != null) {
                           var29 = new class194();
                           var29.field2758 = true;
                           var29.field2759 = var9;
                           var29.field2764 = class163.field1975 - var10;
                           var29.field2761 = class163.field1976 - var11;
                           var29.field2765 = var9.field2668;
                           client.field2232.method1499(var29);
                        }

                        if(var9.field2690 && !var34) {
                           var9.field2690 = false;
                           if(var9.field2556 != null) {
                              var29 = new class194();
                              var29.field2758 = true;
                              var29.field2759 = var9;
                              var29.field2764 = class163.field1975 - var10;
                              var29.field2761 = class163.field1976 - var11;
                              var29.field2765 = var9.field2556;
                              client.field2354.method1499(var29);
                           }
                        }

                        if(var34 && var9.field2649 != null) {
                           var29 = new class194();
                           var29.field2758 = true;
                           var29.field2759 = var9;
                           var29.field2764 = class163.field1975 - var10;
                           var29.field2761 = class163.field1976 - var11;
                           var29.field2765 = var9.field2649;
                           client.field2232.method1499(var29);
                        }

                        if(!var9.field2689 && var33) {
                           var9.field2689 = true;
                           if(var9.field2650 != null) {
                              var29 = new class194();
                              var29.field2758 = true;
                              var29.field2759 = var9;
                              var29.field2764 = class163.field1975 - var10;
                              var29.field2761 = class163.field1976 - var11;
                              var29.field2765 = var9.field2650;
                              client.field2232.method1499(var29);
                           }
                        }

                        if(var9.field2689 && var33 && var9.field2622 != null) {
                           var29 = new class194();
                           var29.field2758 = true;
                           var29.field2759 = var9;
                           var29.field2764 = class163.field1975 - var10;
                           var29.field2761 = class163.field1976 - var11;
                           var29.field2765 = var9.field2622;
                           client.field2232.method1499(var29);
                        }

                        if(var9.field2689 && !var33) {
                           var9.field2689 = false;
                           if(var9.field2648 != null) {
                              var29 = new class194();
                              var29.field2758 = true;
                              var29.field2759 = var9;
                              var29.field2764 = class163.field1975 - var10;
                              var29.field2761 = class163.field1976 - var11;
                              var29.field2765 = var9.field2648;
                              client.field2354.method1499(var29);
                           }
                        }

                        if(var9.field2684 != null) {
                           var29 = new class194();
                           var29.field2759 = var9;
                           var29.field2765 = var9.field2684;
                           client.field2353.method1499(var29);
                        }

                        class194 var30;
                        int var35;
                        int var36;
                        if(var9.field2657 != null && client.field2340 > var9.field2626) {
                           if(var9.field2658 != null && client.field2340 - var9.field2626 <= 32) {
                              label880:
                              for(var35 = var9.field2626; var35 < client.field2340; ++var35) {
                                 var23 = client.field2339[var35 & 31];

                                 for(var36 = 0; var36 < var9.field2658.length; ++var36) {
                                    if(var23 == var9.field2658[var36]) {
                                       var30 = new class194();
                                       var30.field2759 = var9;
                                       var30.field2765 = var9.field2657;
                                       client.field2232.method1499(var30);
                                       break label880;
                                    }
                                 }
                              }
                           } else {
                              var29 = new class194();
                              var29.field2759 = var9;
                              var29.field2765 = var9.field2657;
                              client.field2232.method1499(var29);
                           }

                           var9.field2626 = client.field2340;
                        }

                        if(var9.field2659 != null && client.field2342 > var9.field2693) {
                           if(var9.field2660 != null && client.field2342 - var9.field2693 <= 32) {
                              label856:
                              for(var35 = var9.field2693; var35 < client.field2342; ++var35) {
                                 var23 = client.field2177[var35 & 31];

                                 for(var36 = 0; var36 < var9.field2660.length; ++var36) {
                                    if(var23 == var9.field2660[var36]) {
                                       var30 = new class194();
                                       var30.field2759 = var9;
                                       var30.field2765 = var9.field2659;
                                       client.field2232.method1499(var30);
                                       break label856;
                                    }
                                 }
                              }
                           } else {
                              var29 = new class194();
                              var29.field2759 = var9;
                              var29.field2765 = var9.field2659;
                              client.field2232.method1499(var29);
                           }

                           var9.field2693 = client.field2342;
                        }

                        if(var9.field2661 != null && client.field2416 > var9.field2694) {
                           if(var9.field2638 != null && client.field2416 - var9.field2694 <= 32) {
                              label832:
                              for(var35 = var9.field2694; var35 < client.field2416; ++var35) {
                                 var23 = client.field2289[var35 & 31];

                                 for(var36 = 0; var36 < var9.field2638.length; ++var36) {
                                    if(var23 == var9.field2638[var36]) {
                                       var30 = new class194();
                                       var30.field2759 = var9;
                                       var30.field2765 = var9.field2661;
                                       client.field2232.method1499(var30);
                                       break label832;
                                    }
                                 }
                              }
                           } else {
                              var29 = new class194();
                              var29.field2759 = var9;
                              var29.field2765 = var9.field2661;
                              client.field2232.method1499(var29);
                           }

                           var9.field2694 = client.field2416;
                        }

                        if(client.field2315 > var9.field2691 && var9.field2666 != null) {
                           var29 = new class194();
                           var29.field2759 = var9;
                           var29.field2765 = var9.field2666;
                           client.field2232.method1499(var29);
                        }

                        if(client.field2404 > var9.field2691 && var9.field2603 != null) {
                           var29 = new class194();
                           var29.field2759 = var9;
                           var29.field2765 = var9.field2603;
                           client.field2232.method1499(var29);
                        }

                        if(client.field2347 > var9.field2691 && var9.field2590 != null) {
                           var29 = new class194();
                           var29.field2759 = var9;
                           var29.field2765 = var9.field2590;
                           client.field2232.method1499(var29);
                        }

                        if(client.field2348 > var9.field2691 && var9.field2674 != null) {
                           var29 = new class194();
                           var29.field2759 = var9;
                           var29.field2765 = var9.field2674;
                           client.field2232.method1499(var29);
                        }

                        if(client.field2349 > var9.field2691 && var9.field2675 != null) {
                           var29 = new class194();
                           var29.field2759 = var9;
                           var29.field2765 = var9.field2675;
                           client.field2232.method1499(var29);
                        }

                        if(client.field2350 > var9.field2691 && var9.field2651 != null) {
                           var29 = new class194();
                           var29.field2759 = var9;
                           var29.field2765 = var9.field2651;
                           client.field2232.method1499(var29);
                        }

                        var9.field2691 = client.field2338;
                        if(var9.field2589 != null) {
                           for(var35 = 0; var35 < client.field2415; ++var35) {
                              class194 var31 = new class194();
                              var31.field2759 = var9;
                              var31.field2760 = client.field2376[var35];
                              var31.field2771 = client.field2375[var35];
                              var31.field2765 = var9.field2589;
                              client.field2232.method1499(var31);
                           }
                        }
                     }
                  }

                  if(!var9.field2557) {
                     if(client.field2326 != null || class283.field3562 != null || client.field2360) {
                        continue;
                     }

                     if((var9.field2679 >= 0 || var9.field2697 != 0) && class163.field1975 >= var12 && class163.field1976 >= var13 && class163.field1975 < var14 && class163.field1976 < var15) {
                        if(var9.field2679 >= 0) {
                           class263.field3408 = var0[var9.field2679];
                        } else {
                           class263.field3408 = var9;
                        }
                     }

                     if(var9.field2560 == 8 && class163.field1975 >= var12 && class163.field1976 >= var13 && class163.field1975 < var14 && class163.field1976 < var15) {
                        class305.field3786 = var9;
                     }

                     if(var9.field2582 > var9.field2574) {
                        class23.method439(var9, var10 + var9.field2573, var11, var9.field2574, var9.field2582, class163.field1975, class163.field1976);
                     }
                  }

                  if(var9.field2560 == 0) {
                     method5259(var0, var9.field2621, var12, var13, var14, var15, var10 - var9.field2579, var11 - var9.field2580);
                     if(var9.field2688 != null) {
                        method5259(var9.field2688, var9.field2621, var12, var13, var14, var15, var10 - var9.field2579, var11 - var9.field2580);
                     }

                     class322 var27 = (class322)client.field2412.method1776((long)var9.field2621);
                     if(var27 != null) {
                        if(var27.field3934 == 0 && class163.field1975 >= var12 && class163.field1976 >= var13 && class163.field1975 < var14 && class163.field1976 < var15 && !client.field2360) {
                           for(class194 var28 = (class194)client.field2232.method1503(); var28 != null; var28 = (class194)client.field2232.method1505()) {
                              if(var28.field2758) {
                                 var28.method3937();
                                 var28.field2759.field2689 = false;
                              }
                           }

                           if(class158.field1945 == 0) {
                              client.field2326 = null;
                              client.field2335 = null;
                           }

                           if(!client.field2360) {
                              class32.method530();
                           }
                        }

                        class184.method3709(var27.field3937, var12, var13, var14, var15, var10, var11);
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "1"
   )
   public static String method5250(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for(int var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if(var3 == 0) {
            var5 = Character.toLowerCase(var5);
         } else if(var3 == 2 || Character.isUpperCase(var5)) {
            var5 = class279.method5408(var5);
         }

         if(Character.isLetter(var5)) {
            var3 = 0;
         } else if(var5 != '.' && var5 != '?' && var5 != '!') {
            if(Character.isSpaceChar(var5)) {
               if(var3 != 2) {
                  var3 = 1;
               }
            } else {
               var3 = 1;
            }
         } else {
            var3 = 2;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }
}
