package net.runelite.client.standalone;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
final class class192 implements Comparator {
   @ObfuscatedName("rd")
   @ObfuscatedGetter(
      intValue = -396366625
   )
   static int field1839;
   @ObfuscatedName("cp")
   static boolean field1840;
   @ObfuscatedName("p")
   static int[] field1841;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lw;Lw;I)I",
      garbageValue = "1047733294"
   )
   int method3288(class230 var1, class230 var2) {
      return var1.field2246.field1437 < var2.field2246.field1437?-1:(var2.field2246.field1437 == var1.field2246.field1437?0:1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method3288((class230)var1, (class230)var2);
   }

   @ObfuscatedName("fh")
   @ObfuscatedSignature(
      signature = "(Lbn;IS)V",
      garbageValue = "128"
   )
   static final void method3293(class133 var0, int var1) {
      int var2;
      int var3;
      int var4;
      class321 var11;
      if(var0.field1305 > client.field3744) {
         class295.method5144(var0);
      } else {
         int var5;
         int var7;
         if(var0.field1306 >= client.field3744) {
            if(var0.field1306 == client.field3744 || var0.field1273 == -1 || var0.field1294 != 0 || var0.field1317 + 1 > class182.method3192(var0.field1273).field3418[var0.field1292]) {
               var2 = var0.field1306 - var0.field1305;
               var3 = client.field3744 - var0.field1305;
               var4 = var0.field1313 * 128 + var0.field1262 * 64;
               var5 = var0.field1303 * 128 + var0.field1262 * 64;
               int var6 = var0.field1302 * 128 + var0.field1262 * 64;
               var7 = var0.field1304 * 128 + var0.field1262 * 64;
               var0.field1277 = (var6 * var3 + var4 * (var2 - var3)) / var2;
               var0.field1259 = (var3 * var7 + var5 * (var2 - var3)) / var2;
            }

            var0.field1307 = 0;
            var0.field1310 = var0.field1300;
            var0.field1260 = var0.field1310;
         } else {
            var0.field1265 = var0.field1276;
            if(var0.field1279 == 0) {
               var0.field1307 = 0;
            } else {
               label560: {
                  if(var0.field1273 != -1 && var0.field1294 == 0) {
                     var11 = class182.method3192(var0.field1273);
                     if(var0.field1318 > 0 && var11.field3427 == 0) {
                        ++var0.field1307;
                        break label560;
                     }

                     if(var0.field1318 <= 0 && var11.field3411 == 0) {
                        ++var0.field1307;
                        break label560;
                     }
                  }

                  var2 = var0.field1277;
                  var3 = var0.field1259;
                  var4 = var0.field1288[var0.field1279 - 1] * 128 + var0.field1262 * 64;
                  var5 = var0.field1315[var0.field1279 - 1] * 128 + var0.field1262 * 64;
                  if(var2 < var4) {
                     if(var3 < var5) {
                        var0.field1310 = 1280;
                     } else if(var3 > var5) {
                        var0.field1310 = 1792;
                     } else {
                        var0.field1310 = 1536;
                     }
                  } else if(var2 > var4) {
                     if(var3 < var5) {
                        var0.field1310 = 768;
                     } else if(var3 > var5) {
                        var0.field1310 = 256;
                     } else {
                        var0.field1310 = 512;
                     }
                  } else if(var3 < var5) {
                     var0.field1310 = 1024;
                  } else if(var3 > var5) {
                     var0.field1310 = 0;
                  }

                  byte var14 = var0.field1316[var0.field1279 - 1];
                  if(var4 - var2 <= 256 && var4 - var2 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) {
                     var7 = var0.field1310 - var0.field1260 & 2047;
                     if(var7 > 1024) {
                        var7 -= 2048;
                     }

                     int var8 = var0.field1267;
                     if(var7 >= -256 && var7 <= 256) {
                        var8 = var0.field1290;
                     } else if(var7 >= 256 && var7 < 768) {
                        var8 = var0.field1270;
                     } else if(var7 >= -768 && var7 <= -256) {
                        var8 = var0.field1264;
                     }

                     if(var8 == -1) {
                        var8 = var0.field1290;
                     }

                     var0.field1265 = var8;
                     int var9 = 4;
                     boolean var10 = true;
                     if(var0 instanceof class237) {
                        var10 = ((class237)var0).field2400.field2149;
                     }

                     if(var10) {
                        if(var0.field1260 != var0.field1310 && var0.field1285 == -1 && var0.field1312 != 0) {
                           var9 = 2;
                        }

                        if(var0.field1279 > 2) {
                           var9 = 6;
                        }

                        if(var0.field1279 > 3) {
                           var9 = 8;
                        }

                        if(var0.field1307 > 0 && var0.field1279 > 1) {
                           var9 = 8;
                           --var0.field1307;
                        }
                     } else {
                        if(var0.field1279 > 1) {
                           var9 = 6;
                        }

                        if(var0.field1279 > 2) {
                           var9 = 8;
                        }

                        if(var0.field1307 > 0 && var0.field1279 > 1) {
                           var9 = 8;
                           --var0.field1307;
                        }
                     }

                     if(var14 == 2) {
                        var9 <<= 1;
                     }

                     if(var9 >= 8 && var0.field1265 == var0.field1290 && var0.field1271 != -1) {
                        var0.field1265 = var0.field1271;
                     }

                     if(var4 != var2 || var3 != var5) {
                        if(var2 < var4) {
                           var0.field1277 += var9;
                           if(var0.field1277 > var4) {
                              var0.field1277 = var4;
                           }
                        } else if(var2 > var4) {
                           var0.field1277 -= var9;
                           if(var0.field1277 < var4) {
                              var0.field1277 = var4;
                           }
                        }

                        if(var3 < var5) {
                           var0.field1259 += var9;
                           if(var0.field1259 > var5) {
                              var0.field1259 = var5;
                           }
                        } else if(var3 > var5) {
                           var0.field1259 -= var9;
                           if(var0.field1259 < var5) {
                              var0.field1259 = var5;
                           }
                        }
                     }

                     if(var4 == var0.field1277 && var5 == var0.field1259) {
                        --var0.field1279;
                        if(var0.field1318 > 0) {
                           --var0.field1318;
                        }
                     }
                  } else {
                     var0.field1277 = var4;
                     var0.field1259 = var5;
                     --var0.field1279;
                     if(var0.field1318 > 0) {
                        --var0.field1318;
                     }
                  }
               }
            }
         }
      }

      if(var0.field1277 < 128 || var0.field1259 < 128 || var0.field1277 >= 13184 || var0.field1259 >= 13184) {
         var0.field1273 = -1;
         var0.animationChanged(-1);
         var0.field1296 = -1;
         var0.graphicChanged(-1);
         var0.field1305 = 0;
         var0.field1306 = 0;
         var0.field1277 = var0.field1288[0] * 128 + var0.field1262 * 64;
         var0.field1259 = var0.field1315[0] * 128 + var0.field1262 * 64;
         var0.method2460();
      }

      if(class5.field43 == var0 && (var0.field1277 < 1536 || var0.field1259 < 1536 || var0.field1277 >= 11776 || var0.field1259 >= 11776)) {
         var0.field1273 = -1;
         var0.animationChanged(-1);
         var0.field1296 = -1;
         var0.graphicChanged(-1);
         var0.field1305 = 0;
         var0.field1306 = 0;
         var0.field1277 = var0.field1288[0] * 128 + var0.field1262 * 64;
         var0.field1259 = var0.field1315[0] * 128 + var0.field1262 * 64;
         var0.method2460();
      }

      if(var0.field1312 != 0) {
         if(var0.field1285 != -1) {
            Object var15 = null;
            if(var0.field1285 < 32768) {
               var15 = client.field3774[var0.field1285];
            } else if(var0.field1285 >= 32768) {
               var15 = client.field3848[var0.field1285 - 32768];
            }

            if(var15 != null) {
               var3 = var0.field1277 - ((class133)var15).field1277;
               var4 = var0.field1259 - ((class133)var15).field1259;
               if(var3 != 0 || var4 != 0) {
                  var0.field1310 = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
               }
            } else if(var0.field1283) {
               var0.field1285 = -1;
               var0.interactingChanged(-1);
               var0.field1283 = false;
            }
         }

         if(var0.field1301 != -1 && (var0.field1279 == 0 || var0.field1307 > 0)) {
            var0.field1310 = var0.field1301;
            var0.field1301 = -1;
         }

         var2 = var0.field1310 - var0.field1260 & 2047;
         if(var2 == 0 && var0.field1283) {
            var0.field1285 = -1;
            var0.interactingChanged(-1);
            var0.field1283 = false;
         }

         if(var2 != 0) {
            ++var0.field1311;
            boolean var13;
            if(var2 > 1024) {
               var0.field1260 -= var0.field1312;
               var13 = true;
               if(var2 < var0.field1312 || var2 > 2048 - var0.field1312) {
                  var0.field1260 = var0.field1310;
                  var13 = false;
               }

               if(var0.field1276 == var0.field1265 && (var0.field1311 > 25 || var13)) {
                  if(var0.field1314 != -1) {
                     var0.field1265 = var0.field1314;
                  } else {
                     var0.field1265 = var0.field1290;
                  }
               }
            } else {
               var0.field1260 += var0.field1312;
               var13 = true;
               if(var2 < var0.field1312 || var2 > 2048 - var0.field1312) {
                  var0.field1260 = var0.field1310;
                  var13 = false;
               }

               if(var0.field1265 == var0.field1276 && (var0.field1311 > 25 || var13)) {
                  if(var0.field1309 != -1) {
                     var0.field1265 = var0.field1309;
                  } else {
                     var0.field1265 = var0.field1290;
                  }
               }
            }

            var0.field1260 &= 2047;
         } else {
            var0.field1311 = 0;
         }
      }

      var0.field1261 = false;
      if(var0.field1265 != -1) {
         var11 = class182.method3192(var0.field1265);
         if(var11 != null && var11.field3426 != null) {
            ++var0.field1280;
            if(var0.field1289 < var11.field3426.length && var0.field1280 > var11.field3418[var0.field1289]) {
               var0.field1280 = 1;
               ++var0.field1289;
               class311.method5329(var11, var0.field1289, var0.field1277, var0.field1259);
            }

            if(var0.field1289 >= var11.field3426.length) {
               var0.field1280 = 0;
               var0.field1289 = 0;
               class311.method5329(var11, var0.field1289, var0.field1277, var0.field1259);
            }
         } else {
            var0.field1265 = -1;
         }
      }

      if(var0.field1296 != -1 && client.field3744 >= var0.field1299) {
         if(var0.field1297 < 0) {
            var0.field1297 = 0;
         }

         var2 = class38.method619(var0.field1296).field872;
         if(var2 != -1) {
            class321 var12 = class182.method3192(var2);
            if(var12 != null && var12.field3426 != null) {
               ++var0.field1298;
               if(var0.field1297 < var12.field3426.length && var0.field1298 > var12.field3418[var0.field1297]) {
                  var0.field1298 = 1;
                  ++var0.field1297;
                  class311.method5329(var12, var0.field1297, var0.field1277, var0.field1259);
               }

               if(var0.field1297 >= var12.field3426.length && (var0.field1297 < 0 || var0.field1297 >= var12.field3426.length)) {
                  var0.field1296 = -1;
                  var0.graphicChanged(-1);
               }
            } else {
               var0.field1296 = -1;
               var0.graphicChanged(-1);
            }
         } else {
            var0.field1296 = -1;
            var0.graphicChanged(-1);
         }
      }

      if(var0.field1273 != -1 && var0.field1294 <= 1) {
         var11 = class182.method3192(var0.field1273);
         if(var11.field3427 == 1 && var0.field1318 > 0 && var0.field1305 <= client.field3744 && var0.field1306 < client.field3744) {
            var0.field1294 = 1;
            return;
         }
      }

      if(var0.field1273 != -1 && var0.field1294 == 0) {
         var11 = class182.method3192(var0.field1273);
         if(var11 != null && var11.field3426 != null) {
            ++var0.field1317;
            if(var0.field1292 < var11.field3426.length && var0.field1317 > var11.field3418[var0.field1292]) {
               var0.field1317 = 1;
               ++var0.field1292;
               class311.method5329(var11, var0.field1292, var0.field1277, var0.field1259);
            }

            if(var0.field1292 >= var11.field3426.length) {
               var0.field1292 -= var11.field3420;
               ++var0.field1295;
               if(var0.field1295 >= var11.field3422) {
                  var0.field1273 = -1;
                  var0.animationChanged(-1);
               } else if(var0.field1292 >= 0 && var0.field1292 < var11.field3426.length) {
                  class311.method5329(var11, var0.field1292, var0.field1277, var0.field1259);
               } else {
                  var0.field1273 = -1;
                  var0.animationChanged(-1);
               }
            }

            var0.field1261 = var11.field3424;
         } else {
            var0.field1273 = -1;
            var0.animationChanged(-1);
         }
      }

      if(var0.field1294 > 0) {
         --var0.field1294;
      }

   }

   @ObfuscatedName("fj")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "-454360130"
   )
   static void method3287(int var0, int var1, int var2) {
      if(client.field3968 != 0 && var1 != 0 && client.field3970 < 50) {
         client.field3873[client.field3970] = var0;
         client.field3924[client.field3970] = var1;
         client.field3973[client.field3970] = var2;
         client.field3767[client.field3970] = null;
         client.field4008[client.field3970] = 0;
         ++client.field3970;
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "([BIII)Ljava/lang/String;",
      garbageValue = "2104510009"
   )
   public static String method3297(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         int var6 = var0[var5 + var1] & 255;
         if(var6 != 0) {
            if(var6 >= 128 && var6 < 160) {
               char var7 = class20.field156[var6 - 128];
               if(var7 == 0) {
                  var7 = '?';
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "2121314595"
   )
   static void method3294(boolean var0) {
      class325.field3486 = "";
      class325.field3487 = "Enter your username/email & password.";
      class325.field3488 = "";
      class325.field3492 = 2;
      if(var0) {
         class325.field3490 = "";
      }

      class157.method2748();
      class176.method2957();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Lgl;II)Z",
      garbageValue = "687115478"
   )
   static boolean method3295(class214 var0, int var1) {
      int var2 = var0.readBits(2);
      int var3;
      int var4;
      int var7;
      int var8;
      int var9;
      int var10;
      if(var2 == 0) {
         if(var0.readBits(1) != 0) {
            method3295(var0, var1);
         }

         var3 = var0.readBits(13);
         var4 = var0.readBits(13);
         boolean var12 = var0.readBits(1) == 1;
         if(var12) {
            class11.field94[++class11.field97 - 1] = var1;
         }

         if(client.field3848[var1] != null) {
            throw new RuntimeException();
         } else {
            class63 var10000 = client.field3848[var1] = new class63();
            client.cachedPlayersChanged(var1);
            class63 var6 = var10000;
            var6.field598 = var1;
            if(class11.field104[var1] != null) {
               var6.method1082(class11.field104[var1]);
            }

            var6.field1310 = class11.field95[var1];
            var6.field1285 = class11.field96[var1];
            var6.interactingChanged(-1);
            var7 = class11.field89[var1];
            var8 = var7 >> 28;
            var9 = var7 >> 14 & 255;
            var10 = var7 & 255;
            var6.field1316[0] = class11.field93[var1];
            var6.field580 = (byte)var8;
            var6.method1095((var9 << 13) + var3 - class296.somex, (var10 << 13) + var4 - class284.somey);
            var6.field601 = false;
            return true;
         }
      } else if(var2 == 1) {
         var3 = var0.readBits(2);
         var4 = class11.field89[var1];
         class11.field89[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28);
         return false;
      } else {
         int var5;
         int var11;
         if(var2 == 2) {
            var3 = var0.readBits(5);
            var4 = var3 >> 3;
            var5 = var3 & 7;
            var11 = class11.field89[var1];
            var7 = (var11 >> 28) + var4 & 3;
            var8 = var11 >> 14 & 255;
            var9 = var11 & 255;
            if(var5 == 0) {
               --var8;
               --var9;
            }

            if(var5 == 1) {
               --var9;
            }

            if(var5 == 2) {
               ++var8;
               --var9;
            }

            if(var5 == 3) {
               --var8;
            }

            if(var5 == 4) {
               ++var8;
            }

            if(var5 == 5) {
               --var8;
               ++var9;
            }

            if(var5 == 6) {
               ++var9;
            }

            if(var5 == 7) {
               ++var8;
               ++var9;
            }

            class11.field89[var1] = (var8 << 14) + var9 + (var7 << 28);
            return false;
         } else {
            var3 = var0.readBits(18);
            var4 = var3 >> 16;
            var5 = var3 >> 8 & 255;
            var11 = var3 & 255;
            var7 = class11.field89[var1];
            var8 = (var7 >> 28) + var4 & 3;
            var9 = var5 + (var7 >> 14) & 255;
            var10 = var7 + var11 & 255;
            class11.field89[var1] = (var9 << 14) + var10 + (var8 << 28);
            return false;
         }
      }
   }
}
