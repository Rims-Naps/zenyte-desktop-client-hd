package net.runelite.standalone;

import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
public class class193 {
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -301221279
   )
   public static int field2748;
   @ObfuscatedName("by")
   @ObfuscatedSignature(
      signature = "[Llp;"
   )
   static SpritePixels[] field2750;
   @ObfuscatedName("dr")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class6 field2749;
   @ObfuscatedName("bq")
   static String field2752;

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(CII)I",
      garbageValue = "571371273"
   )
   static int method3912(char var0, int var1) {
      int var2 = var0 << 4;
      if(Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = (var0 << 4) + 1;
      }

      return var2;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/net/Socket;III)Lfo;",
      garbageValue = "2028894137"
   )
   public static class36 method3918(Socket var0, int var1, int var2) throws IOException {
      return new class133(var0, var1, var2);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Lah;I)V",
      garbageValue = "-1371754657"
   )
   static void method3917(GameEngine var0) {
      if(class163.field1982 == 1 || !class225.field3039 && class163.field1982 == 4) {
         int var1 = class39.field407 + 280;
         if(class163.field1980 >= var1 && class163.field1980 <= var1 + 14 && class163.field1984 >= 4 && class163.field1984 <= 18) {
            class154.method2820(0, 0);
            return;
         }

         if(class163.field1980 >= var1 + 15 && class163.field1980 <= var1 + 80 && class163.field1984 >= 4 && class163.field1984 <= 18) {
            class154.method2820(0, 1);
            return;
         }

         int var2 = class39.field407 + 390;
         if(class163.field1980 >= var2 && class163.field1980 <= var2 + 14 && class163.field1984 >= 4 && class163.field1984 <= 18) {
            class154.method2820(1, 0);
            return;
         }

         if(class163.field1980 >= var2 + 15 && class163.field1980 <= var2 + 80 && class163.field1984 >= 4 && class163.field1984 <= 18) {
            class154.method2820(1, 1);
            return;
         }

         int var3 = class39.field407 + 500;
         if(class163.field1980 >= var3 && class163.field1980 <= var3 + 14 && class163.field1984 >= 4 && class163.field1984 <= 18) {
            class154.method2820(2, 0);
            return;
         }

         if(class163.field1980 >= var3 + 15 && class163.field1980 <= var3 + 80 && class163.field1984 >= 4 && class163.field1984 <= 18) {
            class154.method2820(2, 1);
            return;
         }

         int var4 = class39.field407 + 610;
         if(class163.field1980 >= var4 && class163.field1980 <= var4 + 14 && class163.field1984 >= 4 && class163.field1984 <= 18) {
            class154.method2820(3, 0);
            return;
         }

         if(class163.field1980 >= var4 + 15 && class163.field1980 <= var4 + 80 && class163.field1984 >= 4 && class163.field1984 <= 18) {
            class154.method2820(3, 1);
            return;
         }

         if(class163.field1980 >= class39.field407 + 708 && class163.field1984 >= 4 && class163.field1980 <= class39.field407 + 708 + 50 && class163.field1984 <= 20) {
            class39.field403 = false;
            class39.leftBackground.method213(class39.field407, 0);
            class107.rightBackground.method213(class39.field407 + 382, 0);
            class48.field545.method5980(class39.field407 + 382 - class48.field545.field3759 / 2, 18);
            return;
         }

         if(class39.field404 != -1) {
            class88 var5 = class88.field947[class39.field404];
            class74.method1558(var5);
            class39.field403 = false;
            class39.leftBackground.method213(class39.field407, 0);
            class107.rightBackground.method213(class39.field407 + 382, 0);
            //class48.field545.method5980(class39.field407 + 382 - class48.field545.field3759 / 2, 18);
            return;
         }
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Lle;I)V",
      garbageValue = "-913511761"
   )
   static final void method3915(class303 var0) {
      short var1 = 256;

      int var2;
      for(var2 = 0; var2 < class219.field2983.length; ++var2) {
         class219.field2983[var2] = 0;
      }

      int var3;
      for(var2 = 0; var2 < 5000; ++var2) {
         var3 = (int)(Math.random() * 128.0D * (double)var1);
         class219.field2983[var3] = (int)(Math.random() * 256.0D);
      }

      int var4;
      int var5;
      for(var2 = 0; var2 < 20; ++var2) {
         for(var3 = 1; var3 < var1 - 1; ++var3) {
            for(var4 = 1; var4 < 127; ++var4) {
               var5 = var4 + (var3 << 7);
               class218.field2972[var5] = (class219.field2983[var5 - 128] + class219.field2983[var5 + 1] + class219.field2983[var5 + 128] + class219.field2983[var5 - 1]) / 4;
            }
         }

         int[] var8 = class219.field2983;
         class219.field2983 = class218.field2972;
         class218.field2972 = var8;
      }

      if(var0 != null) {
         var2 = 0;

         for(var3 = 0; var3 < var0.field3762; ++var3) {
            for(var4 = 0; var4 < var0.field3759; ++var4) {
               if(var0.field3760[var2++] != 0) {
                  var5 = var4 + var0.field3761 + 16;
                  int var6 = var3 + var0.field3757 + 16;
                  int var7 = var5 + (var6 << 7);
                  class219.field2983[var7] = 0;
               }
            }
         }
      }

   }

   @ObfuscatedName("ga")
   @ObfuscatedSignature(
      signature = "(Lfu;B)V",
      garbageValue = "1"
   )
   static final void method3911(class329 var0) {
      class1 var1 = client.field2384.field1764;
      int var3;
      int var5;
      int var6;
      int var7;
      int var8;
      int var37;
      int var38;
      if(class329.field3979 == var0) {
         var37 = var1.method2287();
         var3 = var37 >> 2;
         var38 = var37 & 3;
         var5 = client.field2399[var3];
         var6 = var1.method2287();
         var7 = (var6 >> 4 & 7) + class252.field3336;
         var8 = (var6 & 7) + class122.field1660;
         if(var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
            class210.method4239(class260.field3393, var7, var8, var5, -1, var3, var38, 0, -1);
         }

      } else {
         int var9;
         int var10;
         int var12;
         byte var13;
         int var14;
         if(class329.field3973 == var0) {
            byte var2 = var1.method2296();
            var3 = var1.method2332();
            byte var4 = var1.method2296();
            var5 = var1.method2460();
            var6 = var1.method2258();
            var7 = var1.method2285();
            var8 = var7 >> 2;
            var9 = var7 & 3;
            var10 = client.field2399[var8];
            byte var11 = var1.method2434();
            var12 = var1.method2268();
            var13 = var1.method2296();
            var14 = var1.method2286();
            int var15 = (var14 >> 4 & 7) + class252.field3336;
            int var16 = (var14 & 7) + class122.field1660;
            class199 var17;
            if(var12 == client.field2186) {
               var17 = class32.field303;
            } else {
               var17 = client.field2269[var12];
            }

            if(var17 != null) {
               class15 var18 = class285.method5484(var5);
               int var19;
               int var20;
               if(var9 != 1 && var9 != 3) {
                  var19 = var18.field150;
                  var20 = var18.field193;
               } else {
                  var19 = var18.field193;
                  var20 = var18.field150;
               }

               int var21 = var15 + (var19 >> 1);
               int var22 = var15 + (var19 + 1 >> 1);
               int var23 = var16 + (var20 >> 1);
               int var24 = var16 + (var20 + 1 >> 1);
               int[][] var25 = class185.field2522[class260.field3393];
               int var26 = var25[var22][var24] + var25[var22][var23] + var25[var21][var23] + var25[var21][var24] >> 2;
               int var27 = (var15 << 7) + (var19 << 6);
               int var28 = (var16 << 7) + (var20 << 6);
               class52 var29 = var18.method322(var8, var9, var25, var27, var26, var28);
               if(var29 != null) {
                  class210.method4239(class260.field3393, var15, var16, var10, -1, 0, 0, var6 + 1, var3 + 1);
                  var17.field2809 = var6 + client.field2165;
                  var17.field2810 = var3 + client.field2165;
                  var17.field2814 = var29;
                  var17.field2811 = var15 * 128 + var19 * 64;
                  var17.field2821 = var16 * 128 + var20 * 64;
                  var17.field2819 = var26;
                  byte var30;
                  if(var2 > var13) {
                     var30 = var2;
                     var2 = var13;
                     var13 = var30;
                  }

                  if(var11 > var4) {
                     var30 = var11;
                     var11 = var4;
                     var4 = var30;
                  }

                  var17.field2815 = var15 + var2;
                  var17.field2817 = var13 + var15;
                  var17.field2828 = var11 + var16;
                  var17.field2818 = var16 + var4;
               }
            }
         }

         if(class329.field3981 == var0) {
            var37 = var1.method2268();
            var3 = var1.method2332();
            var38 = var1.method2268();
            var5 = var1.method2285();
            var6 = (var5 >> 4 & 7) + class252.field3336;
            var7 = (var5 & 7) + class122.field1660;
            if(var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
               class70 var42 = client.field2182[class260.field3393][var6][var7];
               if(var42 != null) {
                  for(class191 var32 = (class191)var42.method1503(); var32 != null; var32 = (class191)var42.method1505()) {
                     if((var37 & 32767) == var32.field2737 && var38 == var32.field2736) {
                        var32.quantityChanged(var3);
                        var32.field2736 = var3;
                        break;
                     }
                  }

                  class236.method4712(var6, var7);
               }
            }

         } else {
            int var39;
            if(class329.field3974 == var0) {
               var37 = var1.method2287() * 4;
               var3 = var1.method2258();
               var38 = var1.method2460();
               var5 = var1.method2287() * 4;
               var6 = var1.method2297();
               var7 = var1.method2256();
               var8 = var1.method2287();
               var9 = var1.method2268();
               var10 = var1.method2285();
               var39 = (var10 >> 4 & 7) + class252.field3336;
               var12 = (var10 & 7) + class122.field1660;
               var13 = var1.method2434();
               byte var40 = var1.method2296();
               var14 = var40 + var39;
               int var41 = var13 + var12;
               if(var39 >= 0 && var12 >= 0 && var39 < 104 && var12 < 104 && var14 >= 0 && var41 >= 0 && var14 < 104 && var41 < 104 && var38 != 65535) {
                  var39 = var39 * 128 + 64;
                  var12 = var12 * 128 + 64;
                  var14 = var14 * 128 + 64;
                  var41 = var41 * 128 + 64;
                  class279 var33 = new class279(var38, class260.field3393, var39, var12, class314.method6140(var39, var12, class260.field3393) - var5, var9 + client.field2165, var3 + client.field2165, var7, var8, var6, var37);
                  var33.method5406(var14, var41, class314.method6140(var14, var41, class260.field3393) - var37, var9 + client.field2165);
                  client.field2283.method1499(var33);
               }

            } else {
               if(class329.field3978 == var0) {
                  var37 = var1.method2256();
                  var3 = (var37 >> 4 & 7) + class252.field3336;
                  var38 = (var37 & 7) + class122.field1660;
                  var5 = var1.method2287();
                  var6 = var1.method2285();
                  var7 = var6 >> 4 & 15;
                  var8 = var6 & 7;
                  var9 = var1.method2332();
                  if(var3 >= 0 && var38 >= 0 && var3 < 104 && var38 < 104) {
                     var10 = var7 + 1;
                     if(class32.field303.field1101[0] >= var3 - var10 && class32.field303.field1101[0] <= var3 + var10 && class32.field303.field1128[0] >= var38 - var10 && class32.field303.field1128[0] <= var38 + var10 && client.field2390 != 0 && var8 > 0 && client.field2391 < 50) {
                        client.field2294[client.field2391] = var9;
                        client.field2345[client.field2391] = var8;
                        client.field2394[client.field2391] = var5;
                        client.field2188[client.field2391] = null;
                        client.field2429[client.field2391] = var7 + (var38 << 8) + (var3 << 16);
                        ++client.field2391;
                     }
                  }
               }

               if(class329.field3977 == var0) {
                  var37 = var1.method2287();
                  var3 = var37 >> 2;
                  var38 = var37 & 3;
                  var5 = client.field2399[var3];
                  var6 = var1.method2286();
                  var7 = (var6 >> 4 & 7) + class252.field3336;
                  var8 = (var6 & 7) + class122.field1660;
                  var9 = var1.method2258();
                  if(var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) {
                     if(var5 == 0) {
                        class162 var34 = class269.field3464.method1947(class260.field3393, var7, var8);
                        if(var34 != null) {
                           var39 = class178.method3682(var34.field1957);
                           if(var3 == 2) {
                              var34.field1961 = new class321(var39, 2, var38 + 4, class260.field3393, var7, var8, var9, false, var34.field1961);
                              var34.field1963 = new class321(var39, 2, var38 + 1 & 3, class260.field3393, var7, var8, var9, false, var34.field1963);
                           } else {
                              var34.field1961 = new class321(var39, var3, var38, class260.field3393, var7, var8, var9, false, var34.field1961);
                           }
                        }
                     }

                     if(var5 == 1) {
                        class91 var43 = class269.field3464.method1948(class260.field3393, var7, var8);
                        if(var43 != null) {
                           var39 = class178.method3682(var43.field993);
                           if(var3 != 4 && var3 != 5) {
                              if(var3 == 6) {
                                 var43.field991 = new class321(var39, 4, var38 + 4, class260.field3393, var7, var8, var9, false, var43.field991);
                              } else if(var3 == 7) {
                                 var43.field991 = new class321(var39, 4, (var38 + 2 & 3) + 4, class260.field3393, var7, var8, var9, false, var43.field991);
                              } else if(var3 == 8) {
                                 var43.field991 = new class321(var39, 4, var38 + 4, class260.field3393, var7, var8, var9, false, var43.field991);
                                 var43.field984 = new class321(var39, 4, (var38 + 2 & 3) + 4, class260.field3393, var7, var8, var9, false, var43.field984);
                              }
                           } else {
                              var43.field991 = new class321(var39, 4, var38, class260.field3393, var7, var8, var9, false, var43.field991);
                           }
                        }
                     }

                     if(var5 == 2) {
                        class195 var44 = class269.field3464.method2070(class260.field3393, var7, var8);
                        if(var3 == 11) {
                           var3 = 10;
                        }

                        if(var44 != null) {
                           var44.field2786 = new class321(class178.method3682(var44.field2785), var3, var38, class260.field3393, var7, var8, var9, false, var44.field2786);
                        }
                     }

                     if(var5 == 3) {
                        class215 var45 = class269.field3464.method1950(class260.field3393, var7, var8);
                        if(var45 != null) {
                           var45.field2937 = new class321(class178.method3682(var45.field2942), 22, var38, class260.field3393, var7, var8, var9, false, var45.field2937);
                        }
                     }
                  }

               } else if(class329.field3976 == var0) {
                  var37 = var1.method2258();
                  var3 = var1.method2285();
                  var38 = var1.method2460();
                  var5 = var1.method2256();
                  var6 = (var5 >> 4 & 7) + class252.field3336;
                  var7 = (var5 & 7) + class122.field1660;
                  if(var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                     var6 = var6 * 128 + 64;
                     var7 = var7 * 128 + 64;
                     class79 var31 = new class79(var37, class260.field3393, var6, var7, class314.method6140(var6, var7, class260.field3393) - var3, var38, client.field2165);
                     client.field2284.method1499(var31);
                  }

               } else {
                  class191 var36;
                  if(class329.field3975 != var0) {
                     if(class329.field3980 == var0) {
                        var37 = var1.method2460();
                        var3 = var1.method2332();
                        var38 = var1.method2285();
                        var5 = (var38 >> 4 & 7) + class252.field3336;
                        var6 = (var38 & 7) + class122.field1660;
                        if(var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                           var36 = new class191();
                           var36.field2737 = var3;
                           var36.quantityChanged(var37);
                           var36.field2736 = var37;
                           if(client.field2182[class260.field3393][var5][var6] == null) {
                              client.field2182[class260.field3393][var5][var6] = new class70();
                           }

                           client.field2182[class260.field3393][var5][var6].method1499(var36);
                           class236.method4712(var5, var6);
                        }

                     } else if(class329.field3982 == var0) {
                        var37 = var1.method2285();
                        var3 = (var37 >> 4 & 7) + class252.field3336;
                        var38 = (var37 & 7) + class122.field1660;
                        var5 = var1.method2287();
                        var6 = var5 >> 2;
                        var7 = var5 & 3;
                        var8 = client.field2399[var6];
                        var9 = var1.method2460();
                        if(var3 >= 0 && var38 >= 0 && var3 < 104 && var38 < 104) {
                           class210.method4239(class260.field3393, var3, var38, var8, var9, var6, var7, 0, -1);
                        }

                     }
                  } else {
                     var37 = var1.method2285();
                     var3 = (var37 >> 4 & 7) + class252.field3336;
                     var38 = (var37 & 7) + class122.field1660;
                     var5 = var1.method2332();
                     if(var3 >= 0 && var38 >= 0 && var3 < 104 && var38 < 104) {
                        class70 var35 = client.field2182[class260.field3393][var3][var38];
                        if(var35 != null) {
                           for(var36 = (class191)var35.method1503(); var36 != null; var36 = (class191)var35.method1505()) {
                              if((var5 & 32767) == var36.field2737) {
                                 var36.method3937();
                                 break;
                              }
                           }

                           if(var35.method1503() == null) {
                              client.field2182[class260.field3393][var3][var38] = null;
                           }

                           class236.method4712(var3, var38);
                        }
                     }

                  }
               }
            }
         }
      }
   }
}
