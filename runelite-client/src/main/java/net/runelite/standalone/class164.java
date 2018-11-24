package net.runelite.standalone;

import net.runelite.client.callback.Hooks;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
public class class164 {
   @ObfuscatedName("sz")
   @ObfuscatedSignature(
      signature = "Lfi;"
   )
   static class263 field1989;
   @ObfuscatedName("eu")
   @ObfuscatedGetter(
      intValue = 653017569
   )
   static int field1988;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = -1489761915
   )
   static int field1990;

   @ObfuscatedName("kg")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1478392897"
   )
   static void method3008() {
      if(client.field2228 == 1) {
         client.field2236 = true;
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1757252171"
   )
   public static void method3015() {
      class312.field3832.method1816();
      class312.field3833.method1816();
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1288269072"
   )
   static void method3013() {
      class152.field1874 = 0;

      for(int var0 = 0; var0 < 2048; ++var0) {
         class152.field1888[var0] = null;
         class152.field1877[var0] = 1;
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)Ljs;",
      garbageValue = "-2113695315"
   )
   public static class42 method3014(int var0) {
      class42 var1 = (class42)class42.field441.method1813((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class42.field424.method4398(10, var0, 407483835);
         var1 = new class42();
         var1.field429 = var0;
         if(var2 != null) {
            var1.method771(new class125(var2));
         }

         var1.method776();
         if(var1.field456 != -1) {
            var1.method773(method3014(var1.field456), method3014(var1.field462));
         }

         if(var1.field473 != -1) {
            var1.method774(method3014(var1.field473), method3014(var1.field472));
         }

         if(var1.field475 != -1) {
            var1.method845(method3014(var1.field475), method3014(var1.field474));
         }

         if(!class213.field2928 && var1.field444) {
            var1.field446 = "Members object";
            var1.field471 = false;
            var1.field469 = null;
            var1.field455 = null;
            var1.field447 = -1;
            var1.field442 = 0;
            if(var1.field428 != null) {
               boolean var3 = false;

               for(class197 var4 = var1.field428.method4674(); var4 != null; var4 = var1.field428.method4675()) {
                  class104 var5 = class107.method1889((int)var4.field2792);
                  if(var5.field1152) {
                     var4.method3937();
                  } else {
                     var3 = true;
                  }
               }

               if(!var3) {
                  var1.field428 = null;
               }
            }
         }

         class42.field441.method1820(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IB)Ljava/lang/String;",
      garbageValue = "36"
   )
   static String method3009(int var0) {
      return "<img=" + var0 + ">";
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIII)I",
      garbageValue = "447874722"
   )
   static final int method3010(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = class233.method4663(var3, var5);
      int var8 = class233.method4663(var3 + 1, var5);
      int var9 = class233.method4663(var3, var5 + 1);
      int var10 = class233.method4663(var3 + 1, var5 + 1);
      int var12 = 65536 - class211.field2914[var4 * 1024 / var2] >> 1;
      int var11 = ((65536 - var12) * var7 >> 16) + (var12 * var8 >> 16);
      int var14 = 65536 - class211.field2914[var4 * 1024 / var2] >> 1;
      int var13 = ((65536 - var14) * var9 >> 16) + (var14 * var10 >> 16);
      int var16 = 65536 - class211.field2914[var6 * 1024 / var2] >> 1;
      int var15 = ((65536 - var16) * var11 >> 16) + (var16 * var13 >> 16);
      return var15;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Lds;IIII)Z",
      garbageValue = "-430577921"
   )
   static final boolean method3016(class52 var0, int var1, int var2, int var3) {
      if(!class210.method4243()) {
         return false;
      } else {
         int var4;
         int var5;
         int var6;
         int var7;
         int var10;
         int var11;
         int var12;
         int var15;
         int var16;
         if(!class298.field3704) {
            var4 = class111.field1246;
            var5 = class111.field1247;
            var6 = class111.field1248;
            var7 = class111.field1249;
            byte var8 = 50;
            short var9 = 3500;
            var10 = (class298.field3706 - class211.field2907) * var8 / class211.field2906;
            var11 = (class298.field3705 - class211.field2897) * var8 / class211.field2906;
            var12 = (class298.field3706 - class211.field2907) * var9 / class211.field2906;
            int var13 = (class298.field3705 - class211.field2897) * var9 / class211.field2906;
            int var14 = class211.method4269(var11, var8, var5, var4);
            var15 = class211.method4270(var11, var8, var5, var4);
            var11 = var14;
            var14 = class211.method4269(var13, var9, var5, var4);
            var16 = class211.method4270(var13, var9, var5, var4);
            var13 = var14;
            var14 = class211.method4268(var10, var15, var7, var6);
            var15 = class211.method4312(var10, var15, var7, var6);
            var10 = var14;
            var14 = class211.method4268(var12, var16, var7, var6);
            var16 = class211.method4312(var12, var16, var7, var6);
            class298.field3707 = (var10 + var14) / 2;
            class298.field3708 = (var13 + var11) / 2;
            class198.field2797 = (var15 + var16) / 2;
            class295.field3684 = (var14 - var10) / 2;
            class267.field3458 = (var13 - var11) / 2;
            class38.field370 = (var16 - var15) / 2;
            class57.field711 = Math.abs(class295.field3684);
            class189.field2709 = Math.abs(class267.field3458);
            class119.field1637 = Math.abs(class38.field370);
         }

         var4 = var0.field609 + var1;
         var5 = var2 + var0.field599;
         var6 = var3 + var0.field611;
         var7 = var0.field626;
         var15 = var0.field613;
         var16 = var0.field614;
         var10 = class298.field3707 - var4;
         var11 = class298.field3708 - var5;
         var12 = class198.field2797 - var6;
         return Math.abs(var10) > var7 + class57.field711?false:(Math.abs(var11) > var15 + class189.field2709?false:(Math.abs(var12) > var16 + class119.field1637?false:(Math.abs(var12 * class267.field3458 - var11 * class38.field370) > var16 * class189.field2709 + var15 * class119.field1637?false:(Math.abs(var10 * class38.field370 - var12 * class295.field3684) > var7 * class119.field1637 + var16 * class57.field711?false:Math.abs(var11 * class295.field3684 - var10 * class267.field3458) <= var7 * class189.field2709 + var15 * class57.field711))));
      }
   }

   @ObfuscatedName("fv")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-1820641322"
   )
   static final void method3012(int var0, int var1, int var2, int var3) {
      ++client.field2251;
      if(class32.field303.field1090 >> 7 == client.field2216 && class32.field303.field1072 >> 7 == client.field2414) {
         client.field2216 = 0;
      }

      if(client.field2272) {
         class213.method4359(class32.field303, false);
      }

      if(client.field2343 >= 0 && client.field2269[client.field2343] != null) {
         class213.method4359(client.field2269[client.field2343], false);
      }

      class229.method4606(true);
      class265.method5288();
      class229.method4606(false);
      class294.method5779();

      for(class79 var4 = (class79)client.field2284.method1503(); var4 != null; var4 = (class79)client.field2284.method1505()) {
         if(var4.field886 == class260.field3393 && !var4.field884) {
            if(client.field2165 >= var4.field874) {
               var4.method1585(client.field2410);
               if(var4.field884) {
                  var4.method3937();
               } else {
                  class269.field3464.method1936(var4.field886, var4.field876, var4.field877, var4.field878, 60, var4, 0, -1L, false);
               }
            }
         } else {
            var4.method3937();
         }
      }

      class162.method2969(var0, var1, var2, var3, true);
      var0 = client.field2244;
      var1 = client.field2237;
      var2 = client.field2413;
      var3 = client.field2359;
      class173.method3138(var0, var1, var0 + var2, var3 + var1);
      class211.method4247();
      int var5;
      int var28;
      if(!client.field2397) {
         var28 = client.field2222;
         if(client.field2267 / 256 > var28) {
            var28 = client.field2267 / 256;
         }

         if(client.field2208[4] && client.field2400[4] + 128 > var28) {
            var28 = client.field2400[4] + 128;
         }

         var5 = client.field2223 & 2047;
         class255.method5125(class267.field3457, class118.field1632, class148.field1834, var28, var5, class149.method2740(var28), var3);
      }

      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var14;
      if(!client.field2397) {
         if(class175.field2134.field854) {
            var5 = class260.field3393;
         } else {
            label606: {
               var6 = 3;
               if(client.field2430 < 310) {
                  if(client.field2228 == 1) {
                     var7 = class267.field3457 >> 7;
                     var8 = class148.field1834 >> 7;
                  } else {
                     var7 = class32.field303.field1090 >> 7;
                     var8 = class32.field303.field1072 >> 7;
                  }

                  var9 = class85.field912 >> 7;
                  var10 = class116.field1324 >> 7;
                  if(var9 < 0 || var10 < 0 || var9 >= 104 || var10 >= 104) {
                     var5 = class260.field3393;
                     break label606;
                  }

                  if(var7 < 0 || var8 < 0 || var7 >= 104 || var8 >= 104) {
                     var5 = class260.field3393;
                     break label606;
                  }

                  if((class185.field2512[class260.field3393][var9][var10] & 4) != 0) {
                     var6 = class260.field3393;
                  }

                  if(var7 > var9) {
                     var11 = var7 - var9;
                  } else {
                     var11 = var9 - var7;
                  }

                  if(var8 > var10) {
                     var12 = var8 - var10;
                  } else {
                     var12 = var10 - var8;
                  }

                  int var13;
                  if(var11 > var12) {
                     var13 = var12 * 65536 / var11;
                     var14 = 32768;

                     while(var9 != var7) {
                        if(var9 < var7) {
                           ++var9;
                        } else if(var9 > var7) {
                           --var9;
                        }

                        if((class185.field2512[class260.field3393][var9][var10] & 4) != 0) {
                           var6 = class260.field3393;
                        }

                        var14 += var13;
                        if(var14 >= 65536) {
                           var14 -= 65536;
                           if(var10 < var8) {
                              ++var10;
                           } else if(var10 > var8) {
                              --var10;
                           }

                           if((class185.field2512[class260.field3393][var9][var10] & 4) != 0) {
                              var6 = class260.field3393;
                           }
                        }
                     }
                  } else if(var12 > 0) {
                     var13 = var11 * 65536 / var12;
                     var14 = 32768;

                     while(var10 != var8) {
                        if(var10 < var8) {
                           ++var10;
                        } else if(var10 > var8) {
                           --var10;
                        }

                        if((class185.field2512[class260.field3393][var9][var10] & 4) != 0) {
                           var6 = class260.field3393;
                        }

                        var14 += var13;
                        if(var14 >= 65536) {
                           var14 -= 65536;
                           if(var9 < var7) {
                              ++var9;
                           } else if(var9 > var7) {
                              --var9;
                           }

                           if((class185.field2512[class260.field3393][var9][var10] & 4) != 0) {
                              var6 = class260.field3393;
                           }
                        }
                     }
                  }
               }

               if(class32.field303.field1090 >= 0 && class32.field303.field1072 >= 0 && class32.field303.field1090 < 13312 && class32.field303.field1072 < 13312) {
                  if((class185.field2512[class260.field3393][class32.field303.field1090 >> 7][class32.field303.field1072 >> 7] & 4) != 0) {
                     var6 = class260.field3393;
                  }

                  var5 = var6;
               } else {
                  var5 = class260.field3393;
               }
            }
         }

         var28 = var5;
      } else {
         var28 = class85.method1626();
      }

      var5 = class85.field912;
      var6 = class229.field3068;
      var7 = class116.field1324;
      var8 = client.field2430;
      var9 = class220.field2986;

      for(var10 = 0; var10 < 5; ++var10) {
         if(client.field2208[var10]) {
            var11 = (int)(Math.random() * (double)(client.field2201[var10] * 2 + 1) - (double)client.field2201[var10] + Math.sin((double)client.field2401[var10] / 100.0D * (double)client.field2402[var10]) * (double)client.field2400[var10]);
            if(var10 == 0) {
               class85.field912 += var11;
            }

            if(var10 == 1) {
               class229.field3068 += var11;
            }

            if(var10 == 2) {
               class116.field1324 += var11;
            }

            if(var10 == 3) {
               class220.field2986 = var11 + class220.field2986 & 2047;
            }

            if(var10 == 4) {
               client.field2430 += var11;
               client.onCameraPitchChanged(-1);
               if(client.field2430 < 128) {
                  client.field2430 = 128;
                  client.onCameraPitchChanged(-1);
               }

               if(client.field2430 > 383) {
                  client.field2430 = 383;
                  client.onCameraPitchChanged(-1);
               }
            }
         }
      }

      var10 = class163.field1975;
      var11 = class163.field1976;
      if(class163.field1982 != 0) {
         var10 = class163.field1980;
         var11 = class163.field1984;
      }

      if(var10 >= var0 && var10 < var0 + var2 && var11 >= var1 && var11 < var3 + var1) {
         class191.method3908(var10 - var0, var11 - var1);
      } else {
         class298.field3713 = false;
         class298.field3703 = 0;
      }

      class185.method3733();
      Hooks.clearColorBuffer(var0, var1, var2, var3, 0);
      class185.method3733();
      var12 = class211.field2906;
      class211.field2906 = client.field2230;
      class269.field3464.method1949(class85.field912, class229.field3068, class116.field1324, client.field2430, class220.field2986, var28);
      class211.field2906 = var12;
      class185.method3733();
      class269.field3464.method1939();
      client.field2240 = 0;
      boolean var31 = false;
      var14 = -1;
      int var15 = -1;
      int var16 = class152.field1874;
      int[] var17 = class152.field1875;

      int var18;
      for(var18 = 0; var18 < var16 + client.field2196; ++var18) {
         Object var19;
         if(var18 < var16) {
            var19 = client.field2269[var17[var18]];
            if(var17[var18] == client.field2343) {
               var31 = true;
               var14 = var18;
               continue;
            }

            if(var19 == class32.field303) {
               var15 = var18;
               continue;
            }
         } else {
            var19 = client.field2195[client.field2197[var18 - var16]];
         }

         class217.method4494((class99)var19, var18, var0, var1, var2, var3, -1781715326);
      }

      if(client.field2272 && var15 != -1) {
         class217.method4494(class32.field303, var15, var0, var1, var2, var3, -1781715326);
      }

      if(var31) {
         class217.method4494(client.field2269[client.field2343], var14, var0, var1, var2, var3, -1781715326);
      }

      for(var18 = 0; var18 < client.field2240; ++var18) {
         int var29 = client.field2242[var18];
         int var20 = client.field2273[var18];
         int var21 = client.field2175[var18];
         int var22 = client.field2385[var18];
         boolean var23 = true;

         while(var23) {
            var23 = false;

            for(int var24 = 0; var24 < var18; ++var24) {
               if(var20 + 2 > client.field2273[var24] - client.field2385[var24] && var20 - var22 < client.field2273[var24] + 2 && var29 - var21 < client.field2175[var24] + client.field2242[var24] && var21 + var29 > client.field2242[var24] - client.field2175[var24] && client.field2273[var24] - client.field2385[var24] < var20) {
                  var20 = client.field2273[var24] - client.field2385[var24];
                  var23 = true;
               }
            }
         }

         client.field2252 = client.field2242[var18];
         client.field2253 = client.field2273[var18] = var20;
         String var30 = client.field2249[var18];
         if(client.field2317 == 0) {
            int var25 = 16776960;
            if(client.field2246[var18] < 6) {
               var25 = client.field2243[client.field2246[var18]];
            }

            if(client.field2246[var18] == 6) {
               var25 = client.field2251 % 20 < 10?16711680:16776960;
            }

            if(client.field2246[var18] == 7) {
               var25 = client.field2251 % 20 < 10?255:'\uffff';
            }

            if(client.field2246[var18] == 8) {
               var25 = client.field2251 % 20 < 10?'뀀':8454016;
            }

            int var26;
            if(client.field2246[var18] == 9) {
               var26 = 150 - client.field2346[var18];
               if(var26 < 50) {
                  var25 = var26 * 1280 + 16711680;
               } else if(var26 < 100) {
                  var25 = 16776960 - (var26 - 50) * 327680;
               } else if(var26 < 150) {
                  var25 = (var26 - 100) * 5 + 65280;
               }
            }

            if(client.field2246[var18] == 10) {
               var26 = 150 - client.field2346[var18];
               if(var26 < 50) {
                  var25 = var26 * 5 + 16711680;
               } else if(var26 < 100) {
                  var25 = 16711935 - (var26 - 50) * 327680;
               } else if(var26 < 150) {
                  var25 = (var26 - 100) * 327680 + 255 - (var26 - 100) * 5;
               }
            }

            if(client.field2246[var18] == 11) {
               var26 = 150 - client.field2346[var18];
               if(var26 < 50) {
                  var25 = 16777215 - var26 * 327685;
               } else if(var26 < 100) {
                  var25 = (var26 - 50) * 327685 + 65280;
               } else if(var26 < 150) {
                  var25 = 16777215 - (var26 - 100) * 327680;
               }
            }

            if(client.field2247[var18] == 0) {
               class172.field2117.method3879(var30, var0 + client.field2252, client.field2253 + var1, var25, 0);
            }

            if(client.field2247[var18] == 1) {
               class172.field2117.method3819(var30, var0 + client.field2252, client.field2253 + var1, var25, 0, client.field2251);
            }

            if(client.field2247[var18] == 2) {
               class172.field2117.method3820(var30, var0 + client.field2252, client.field2253 + var1, var25, 0, client.field2251);
            }

            if(client.field2247[var18] == 3) {
               class172.field2117.method3811(var30, var0 + client.field2252, client.field2253 + var1, var25, 0, client.field2251, 150 - client.field2346[var18]);
            }

            if(client.field2247[var18] == 4) {
               var26 = (150 - client.field2346[var18]) * (class172.field2117.method3890(var30) + 100) / 150;
               class173.method3158(var0 + client.field2252 - 50, var1, var0 + client.field2252 + 50, var3 + var1);
               class172.field2117.method3832(var30, var0 + client.field2252 + 50 - var26, client.field2253 + var1, var25, 0);
               class173.method3138(var0, var1, var0 + var2, var3 + var1);
            }

            if(client.field2247[var18] == 5) {
               var26 = 150 - client.field2346[var18];
               int var27 = 0;
               if(var26 < 25) {
                  var27 = var26 - 25;
               } else if(var26 > 125) {
                  var27 = var26 - 125;
               }

               class173.method3158(var0, client.field2253 + var1 - class172.field2117.field2718 - 1, var0 + var2, client.field2253 + var1 + 5);
               class172.field2117.method3879(var30, var0 + client.field2252, var27 + client.field2253 + var1, var25, 0);
               class173.method3138(var0, var1, var0 + var2, var3 + var1);
            }
         } else {
            class172.field2117.method3879(var30, var0 + client.field2252, client.field2253 + var1, 16776960, 0);
         }
      }

      class127.method2481(var0, var1);
      ((class266)class211.field2895).method5296(client.field2410);
      class219.method4507(var0, var1, var2, var3);
      class85.field912 = var5;
      class229.field3068 = var6;
      class116.field1324 = var7;
      client.field2430 = var8;
      client.onCameraPitchChanged(-1);
      class220.field2986 = var9;
      if(client.field2215) {
         byte var32 = 0;
         var14 = var32 + class239.field3122 + class239.field3124;
         if(var14 == 0) {
            client.field2215 = false;
         }
      }

      if(client.field2215) {
         class173.method3167(var0, var1, var2, var3, 0);
         class214.method4369("Loading - please wait.", false);
      }

   }
}
