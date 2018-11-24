package net.runelite.standalone;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
public class class276 implements Comparator {
   @ObfuscatedName("qr")
   @ObfuscatedGetter(
      intValue = 2085029459
   )
   static int field3504;
   @ObfuscatedName("f")
   boolean field3505;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lw;Lw;S)I",
      garbageValue = "-2301"
   )
   int method5372(class317 var1, class317 var2) {
      if(var2.field3900 == var1.field3900) {
         return 0;
      } else {
         if(this.field3505) {
            if(client.field2206 == var1.field3900) {
               return -1;
            }

            if(var2.field3900 == client.field2206) {
               return 1;
            }
         }

         return var1.field3900 < var2.field3900?-1:1;
      }
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method5372((class317)var1, (class317)var2);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Ldh;[Lfr;I)V",
      garbageValue = "968220850"
   )
   static final void method5376(class111 var0, class3[] var1) {
      int var2;
      int var3;
      int var4;
      int var5;
      for(var2 = 0; var2 < 4; ++var2) {
         for(var3 = 0; var3 < 104; ++var3) {
            for(var4 = 0; var4 < 104; ++var4) {
               if((class185.field2512[var2][var3][var4] & 1) == 1) {
                  var5 = var2;
                  if((class185.field2512[1][var3][var4] & 2) == 2) {
                     var5 = var2 - 1;
                  }

                  if(var5 >= 0) {
                     var1[var5].method49(var3, var4);
                  }
               }
            }
         }
      }

      class185.field2524 += (int)(Math.random() * 5.0D) - 2;
      if(class185.field2524 < -8) {
         class185.field2524 = -8;
      }

      if(class185.field2524 > 8) {
         class185.field2524 = 8;
      }

      class185.field2525 += (int)(Math.random() * 5.0D) - 2;
      if(class185.field2525 < -16) {
         class185.field2525 = -16;
      }

      if(class185.field2525 > 16) {
         class185.field2525 = 16;
      }

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      int var18;
      for(var2 = 0; var2 < 4; ++var2) {
         byte[][] var44 = class285.field3573[var2];
         var9 = (int)Math.sqrt(5100.0D);
         var10 = var9 * 768 >> 8;

         int var19;
         int var20;
         for(var11 = 1; var11 < 103; ++var11) {
            for(var12 = 1; var12 < 103; ++var12) {
               var13 = class185.field2522[var2][var12 + 1][var11] - class185.field2522[var2][var12 - 1][var11];
               var14 = class185.field2522[var2][var12][var11 + 1] - class185.field2522[var2][var12][var11 - 1];
               var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536));
               var16 = (var13 << 8) / var15;
               var17 = 65536 / var15;
               var18 = (var14 << 8) / var15;
               var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96;
               var20 = (var44[var12 - 1][var11] >> 2) + (var44[var12][var11 - 1] >> 2) + (var44[var12 + 1][var11] >> 3) + (var44[var12][var11 + 1] >> 3) + (var44[var12][var11] >> 1);
               class30.field286[var12][var11] = var19 - var20;
            }
         }

         for(var11 = 0; var11 < 104; ++var11) {
            class185.field2517[var11] = 0;
            class74.field839[var11] = 0;
            class212.field2923[var11] = 0;
            class62.field735[var11] = 0;
            class142.field1803[var11] = 0;
         }

         for(var11 = -5; var11 < 109; ++var11) {
            for(var12 = 0; var12 < 104; ++var12) {
               var13 = var11 + 5;
               if(var13 >= 0 && var13 < 104) {
                  var14 = class185.field2514[var2][var13][var12] & 255;
                  if(var14 > 0) {
                     class40 var47 = class113.method2121(var14 - 1);
                     class185.field2517[var12] += var47.field414;
                     class74.field839[var12] += var47.field413;
                     class212.field2923[var12] += var47.field412;
                     class62.field735[var12] += var47.field415;
                     ++class142.field1803[var12];
                  }
               }

               var14 = var11 - 5;
               if(var14 >= 0 && var14 < 104) {
                  var15 = class185.field2514[var2][var14][var12] & 255;
                  if(var15 > 0) {
                     class40 var45 = class113.method2121(var15 - 1);
                     class185.field2517[var12] -= var45.field414;
                     class74.field839[var12] -= var45.field413;
                     class212.field2923[var12] -= var45.field412;
                     class62.field735[var12] -= var45.field415;
                     --class142.field1803[var12];
                  }
               }
            }

            if(var11 >= 1 && var11 < 103) {
               var12 = 0;
               var13 = 0;
               var14 = 0;
               var15 = 0;
               var16 = 0;

               for(var17 = -5; var17 < 109; ++var17) {
                  var18 = var17 + 5;
                  if(var18 >= 0 && var18 < 104) {
                     var12 += class185.field2517[var18];
                     var13 += class74.field839[var18];
                     var14 += class212.field2923[var18];
                     var15 += class62.field735[var18];
                     var16 += class142.field1803[var18];
                  }

                  var19 = var17 - 5;
                  if(var19 >= 0 && var19 < 104) {
                     var12 -= class185.field2517[var19];
                     var13 -= class74.field839[var19];
                     var14 -= class212.field2923[var19];
                     var15 -= class62.field735[var19];
                     var16 -= class142.field1803[var19];
                  }

                  if(var17 >= 1 && var17 < 103 && (!client.field2157 || (class185.field2512[0][var11][var17] & 2) != 0 || (class185.field2512[var2][var11][var17] & 16) == 0)) {
                     if(var2 < class185.field2519) {
                        class185.field2519 = var2;
                     }

                     var20 = class185.field2514[var2][var11][var17] & 255;
                     int var21 = class210.field2891[var2][var11][var17] & 255;
                     if(var20 > 0 || var21 > 0) {
                        int var22 = class185.field2522[var2][var11][var17];
                        int var23 = class185.field2522[var2][var11 + 1][var17];
                        int var24 = class185.field2522[var2][var11 + 1][var17 + 1];
                        int var25 = class185.field2522[var2][var11][var17 + 1];
                        int var26 = class30.field286[var11][var17];
                        int var27 = class30.field286[var11 + 1][var17];
                        int var28 = class30.field286[var11 + 1][var17 + 1];
                        int var29 = class30.field286[var11][var17 + 1];
                        int var30 = -1;
                        int var31 = -1;
                        int var32;
                        int var33;
                        int var34;
                        if(var20 > 0) {
                           var32 = var12 * 256 / var15;
                           var33 = var13 / var16;
                           var34 = var14 / var16;
                           var30 = class263.method5248(var32, var33, var34);
                           var32 = var32 + class185.field2524 & 255;
                           var34 += class185.field2525;
                           if(var34 < 0) {
                              var34 = 0;
                           } else if(var34 > 255) {
                              var34 = 255;
                           }

                           var31 = class263.method5248(var32, var33, var34);
                        }

                        class93 var35;
                        if(var2 > 0) {
                           boolean var52 = true;
                           if(var20 == 0 && class185.field2515[var2][var11][var17] != 0) {
                              var52 = false;
                           }

                           if(var21 > 0) {
                              var34 = var21 - 1;
                              var35 = (class93)class93.field1005.method1813((long)var34);
                              class93 var48;
                              if(var35 != null) {
                                 var48 = var35;
                              } else {
                                 byte[] var50 = class93.field1012.method4398(4, var34, 1004336283);
                                 var35 = new class93();
                                 if(var50 != null) {
                                    var35.method1721(new class125(var50), var34);
                                 }

                                 var35.method1720();
                                 class93.field1005.method1820(var35, (long)var34);
                                 var48 = var35;
                              }

                              if(!var48.field1000) {
                                 var52 = false;
                              }
                           }

                           if(var52 && var23 == var22 && var22 == var24 && var22 == var25) {
                              class142.field1808[var2][var11][var17] |= 2340;
                           }
                        }

                        var32 = 0;
                        if(var31 != -1) {
                           var32 = class211.field2916[class316.method6203(var31, 96)];
                        }

                        if(var21 == 0) {
                           var0.method1930(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, class316.method6203(var30, var26), class316.method6203(var30, var27), class316.method6203(var30, var28), class316.method6203(var30, var29), 0, 0, 0, 0, var32, 0);
                        } else {
                           var33 = class185.field2515[var2][var11][var17] + 1;
                           byte var53 = class185.field2516[var2][var11][var17];
                           int var36 = var21 - 1;
                           class93 var37 = (class93)class93.field1005.method1813((long)var36);
                           if(var37 != null) {
                              var35 = var37;
                           } else {
                              byte[] var49 = class93.field1012.method4398(4, var36, -1676938535);
                              var37 = new class93();
                              if(var49 != null) {
                                 var37.method1721(new class125(var49), var36);
                              }

                              var37.method1720();
                              class93.field1005.method1820(var37, (long)var36);
                              var35 = var37;
                           }

                           int var38 = var35.field1002;
                           int var39;
                           int var40;
                           int var41;
                           int var42;
                           if(var38 >= 0) {
                              var40 = class211.field2895.vmethod5292(var38);
                              var39 = -1;
                           } else if(var35.field1001 == 16711935) {
                              var39 = -2;
                              var38 = -1;
                              var40 = -2;
                           } else {
                              var39 = class263.method5248(var35.field1006, var35.field1007, var35.field999);
                              var41 = var35.field1006 + class185.field2524 & 255;
                              var42 = var35.field999 + class185.field2525;
                              if(var42 < 0) {
                                 var42 = 0;
                              } else if(var42 > 255) {
                                 var42 = 255;
                              }

                              var40 = class263.method5248(var41, var35.field1007, var42);
                           }

                           var41 = 0;
                           if(var40 != -2) {
                              var41 = class211.field2916[class113.method2118(var40, 96)];
                           }

                           if(var35.field1004 != -1) {
                              var42 = var35.field1008 + class185.field2524 & 255;
                              int var43 = var35.field1010 + class185.field2525;
                              if(var43 < 0) {
                                 var43 = 0;
                              } else if(var43 > 255) {
                                 var43 = 255;
                              }

                              var40 = class263.method5248(var42, var35.field1009, var43);
                              var41 = class211.field2916[class113.method2118(var40, 96)];
                           }

                           var0.method1930(var2, var11, var17, var33, var53, var38, var22, var23, var24, var25, class316.method6203(var30, var26), class316.method6203(var30, var27), class316.method6203(var30, var28), class316.method6203(var30, var29), class113.method2118(var39, var26), class113.method2118(var39, var27), class113.method2118(var39, var28), class113.method2118(var39, var29), var32, var41);
                        }
                     }
                  }
               }
            }
         }

         for(var11 = 1; var11 < 103; ++var11) {
            for(var12 = 1; var12 < 103; ++var12) {
               if((class185.field2512[var2][var12][var11] & 8) != 0) {
                  var17 = 0;
               } else if(var2 > 0 && (class185.field2512[1][var12][var11] & 2) != 0) {
                  var17 = var2 - 1;
               } else {
                  var17 = var2;
               }

               var0.method1929(var2, var12, var11, var17);
            }
         }

         class185.field2514[var2] = null;
         class210.field2891[var2] = null;
         class185.field2515[var2] = null;
         class185.field2516[var2] = null;
         class285.field3573[var2] = null;
      }

      var0.method2055(-50, -10, -50);

      for(var2 = 0; var2 < 104; ++var2) {
         for(var3 = 0; var3 < 104; ++var3) {
            if((class185.field2512[1][var2][var3] & 2) == 2) {
               var0.method2039(var2, var3);
            }
         }
      }

      var2 = 1;
      var3 = 2;
      var4 = 4;

      for(var5 = 0; var5 < 4; ++var5) {
         if(var5 > 0) {
            var2 <<= 3;
            var3 <<= 3;
            var4 <<= 3;
         }

         for(int var6 = 0; var6 <= var5; ++var6) {
            for(int var7 = 0; var7 <= 104; ++var7) {
               for(int var8 = 0; var8 <= 104; ++var8) {
                  short var51;
                  if((class142.field1808[var6][var8][var7] & var2) != 0) {
                     var9 = var7;
                     var10 = var7;
                     var11 = var6;

                     for(var12 = var6; var9 > 0 && (class142.field1808[var6][var8][var9 - 1] & var2) != 0; --var9) {
                        ;
                     }

                     while(var10 < 104 && (class142.field1808[var6][var8][var10 + 1] & var2) != 0) {
                        ++var10;
                     }

                     label501:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if((class142.field1808[var11 - 1][var8][var13] & var2) == 0) {
                              break label501;
                           }
                        }

                        --var11;
                     }

                     label490:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if((class142.field1808[var12 + 1][var8][var13] & var2) == 0) {
                              break label490;
                           }
                        }

                        ++var12;
                     }

                     var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
                     if(var13 >= 8) {
                        var51 = 240;
                        var15 = class185.field2522[var12][var8][var9] - var51;
                        var16 = class185.field2522[var11][var8][var9];
                        class111.method1928(var5, 1, var8 * 128, var8 * 128, var9 * 128, var10 * 128 + 128, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              class142.field1808[var17][var8][var18] &= ~var2;
                           }
                        }
                     }
                  }

                  if((class142.field1808[var6][var8][var7] & var3) != 0) {
                     var9 = var8;
                     var10 = var8;
                     var11 = var6;

                     for(var12 = var6; var9 > 0 && (class142.field1808[var6][var9 - 1][var7] & var3) != 0; --var9) {
                        ;
                     }

                     while(var10 < 104 && (class142.field1808[var6][var10 + 1][var7] & var3) != 0) {
                        ++var10;
                     }

                     label554:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if((class142.field1808[var11 - 1][var13][var7] & var3) == 0) {
                              break label554;
                           }
                        }

                        --var11;
                     }

                     label543:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if((class142.field1808[var12 + 1][var13][var7] & var3) == 0) {
                              break label543;
                           }
                        }

                        ++var12;
                     }

                     var13 = (var12 + 1 - var11) * (var10 - var9 + 1);
                     if(var13 >= 8) {
                        var51 = 240;
                        var15 = class185.field2522[var12][var9][var7] - var51;
                        var16 = class185.field2522[var11][var9][var7];
                        class111.method1928(var5, 2, var9 * 128, var10 * 128 + 128, var7 * 128, var7 * 128, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              class142.field1808[var17][var18][var7] &= ~var3;
                           }
                        }
                     }
                  }

                  if((class142.field1808[var6][var8][var7] & var4) != 0) {
                     var9 = var8;
                     var10 = var8;
                     var11 = var7;

                     for(var12 = var7; var11 > 0 && (class142.field1808[var6][var8][var11 - 1] & var4) != 0; --var11) {
                        ;
                     }

                     while(var12 < 104 && (class142.field1808[var6][var8][var12 + 1] & var4) != 0) {
                        ++var12;
                     }

                     label607:
                     while(var9 > 0) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if((class142.field1808[var6][var9 - 1][var13] & var4) == 0) {
                              break label607;
                           }
                        }

                        --var9;
                     }

                     label596:
                     while(var10 < 104) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if((class142.field1808[var6][var10 + 1][var13] & var4) == 0) {
                              break label596;
                           }
                        }

                        ++var10;
                     }

                     if((var12 - var11 + 1) * (var10 - var9 + 1) >= 4) {
                        var13 = class185.field2522[var6][var9][var11];
                        class111.method1928(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13);

                        for(var14 = var9; var14 <= var10; ++var14) {
                           for(var15 = var11; var15 <= var12; ++var15) {
                              class142.field1808[var6][var14][var15] &= ~var4;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-690199085"
   )
   static int method5370(int var0, class296 var1, boolean var2) {
      int var3;
      if(var0 == 3903) {
         var3 = class249.field3312[--class308.field3811];
         class249.field3312[++class308.field3811 - 1] = client.field2420[var3].method6039();
         return 1;
      } else if(var0 == 3904) {
         var3 = class249.field3312[--class308.field3811];
         class249.field3312[++class308.field3811 - 1] = client.field2420[var3].field3792;
         return 1;
      } else if(var0 == 3905) {
         var3 = class249.field3312[--class308.field3811];
         class249.field3312[++class308.field3811 - 1] = client.field2420[var3].field3799;
         return 1;
      } else if(var0 == 3906) {
         var3 = class249.field3312[--class308.field3811];
         class249.field3312[++class308.field3811 - 1] = client.field2420[var3].field3794;
         return 1;
      } else if(var0 == 3907) {
         var3 = class249.field3312[--class308.field3811];
         class249.field3312[++class308.field3811 - 1] = client.field2420[var3].field3795;
         return 1;
      } else if(var0 == 3908) {
         var3 = class249.field3312[--class308.field3811];
         class249.field3312[++class308.field3811 - 1] = client.field2420[var3].field3796;
         return 1;
      } else {
         int var12;
         if(var0 == 3910) {
            var3 = class249.field3312[--class308.field3811];
            var12 = client.field2420[var3].method6038();
            class249.field3312[++class308.field3811 - 1] = var12 == 0?1:0;
            return 1;
         } else if(var0 == 3911) {
            var3 = class249.field3312[--class308.field3811];
            var12 = client.field2420[var3].method6038();
            class249.field3312[++class308.field3811 - 1] = var12 == 2?1:0;
            return 1;
         } else if(var0 == 3912) {
            var3 = class249.field3312[--class308.field3811];
            var12 = client.field2420[var3].method6038();
            class249.field3312[++class308.field3811 - 1] = var12 == 5?1:0;
            return 1;
         } else if(var0 == 3913) {
            var3 = class249.field3312[--class308.field3811];
            var12 = client.field2420[var3].method6038();
            class249.field3312[++class308.field3811 - 1] = var12 == 1?1:0;
            return 1;
         } else {
            boolean var13;
            if(var0 == 3914) {
               var13 = class249.field3312[--class308.field3811] == 1;
               if(class141.field1801 != null) {
                  class141.field1801.method2597(class138.field1777, var13);
               }

               return 1;
            } else if(var0 == 3915) {
               var13 = class249.field3312[--class308.field3811] == 1;
               if(class141.field1801 != null) {
                  class141.field1801.method2597(class138.field1780, var13);
               }

               return 1;
            } else if(var0 == 3916) {
               class308.field3811 -= 2;
               var13 = class249.field3312[class308.field3811] == 1;
               boolean var4 = class249.field3312[class308.field3811 + 1] == 1;
               if(class141.field1801 != null) {
                  client.field2357.field3505 = var4;
                  class141.field1801.method2597(client.field2357, var13);
               }

               return 1;
            } else if(var0 == 3917) {
               var13 = class249.field3312[--class308.field3811] == 1;
               if(class141.field1801 != null) {
                  class141.field1801.method2597(class138.field1775, var13);
               }

               return 1;
            } else if(var0 == 3918) {
               var13 = class249.field3312[--class308.field3811] == 1;
               if(class141.field1801 != null) {
                  class141.field1801.method2597(class138.field1778, var13);
               }

               return 1;
            } else if(var0 == 3919) {
               class249.field3312[++class308.field3811 - 1] = class141.field1801 == null?0:class141.field1801.field1783.size();
               return 1;
            } else {
               class317 var11;
               if(var0 == 3920) {
                  var3 = class249.field3312[--class308.field3811];
                  var11 = (class317)class141.field1801.field1783.get(var3);
                  class249.field3312[++class308.field3811 - 1] = var11.field3900;
                  return 1;
               } else if(var0 == 3921) {
                  var3 = class249.field3312[--class308.field3811];
                  var11 = (class317)class141.field1801.field1783.get(var3);
                  class249.field3313[++class103.field1146 - 1] = var11.method6206();
                  return 1;
               } else if(var0 == 3922) {
                  var3 = class249.field3312[--class308.field3811];
                  var11 = (class317)class141.field1801.field1783.get(var3);
                  class249.field3313[++class103.field1146 - 1] = var11.method6211();
                  return 1;
               } else if(var0 == 3923) {
                  var3 = class249.field3312[--class308.field3811];
                  var11 = (class317)class141.field1801.field1783.get(var3);
                  long var5 = class321.method6252() - class152.field1884 - var11.field3905;
                  int var7 = (int)(var5 / 3600000L);
                  int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
                  int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L);
                  String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
                  class249.field3313[++class103.field1146 - 1] = var10;
                  return 1;
               } else if(var0 == 3924) {
                  var3 = class249.field3312[--class308.field3811];
                  var11 = (class317)class141.field1801.field1783.get(var3);
                  class249.field3312[++class308.field3811 - 1] = var11.field3899.field3794;
                  return 1;
               } else if(var0 == 3925) {
                  var3 = class249.field3312[--class308.field3811];
                  var11 = (class317)class141.field1801.field1783.get(var3);
                  class249.field3312[++class308.field3811 - 1] = var11.field3899.field3799;
                  return 1;
               } else if(var0 == 3926) {
                  var3 = class249.field3312[--class308.field3811];
                  var11 = (class317)class141.field1801.field1783.get(var3);
                  class249.field3312[++class308.field3811 - 1] = var11.field3899.field3792;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }
}
