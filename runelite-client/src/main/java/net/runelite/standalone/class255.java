package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public class class255 extends class320 {
   @ObfuscatedName("f")
   final boolean field3350;

   public class255(boolean var1) {
      this.field3350 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lkj;Lkj;I)I",
      garbageValue = "101003208"
   )
   int method5118(class62 var1, class62 var2) {
      return client.field2206 == var1.field737 && var2.field737 == client.field2206?(this.field3350?var1.method6338().method2888(var2.method6338()):var2.method6338().method2888(var1.method6338())):this.method6239(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method5118((class62)var1, (class62)var2);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-77"
   )
   public static void method5122() {
      class224.field3012.method1816();
      class224.field3013.method1816();
      class224.field3014.method1816();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "([BIIIIIII[Lfr;I)V",
      garbageValue = "1766881808"
   )
   static final void method5128(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class3[] var8) {
      int var10;
      for(int var9 = 0; var9 < 8; ++var9) {
         for(var10 = 0; var10 < 8; ++var10) {
            if(var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) {
               var8[var1].field35[var9 + var2][var10 + var3] &= -16777217;
            }
         }
      }

      class125 var20 = new class125(var0);

      for(var10 = 0; var10 < 4; ++var10) {
         for(int var11 = 0; var11 < 64; ++var11) {
            for(int var12 = 0; var12 < 64; ++var12) {
               if(var10 == var4 && var11 >= var5 && var11 < var5 + 8 && var12 >= var6 && var12 < var6 + 8) {
                  int var17 = var11 & 7;
                  int var18 = var12 & 7;
                  int var19 = var7 & 3;
                  int var16;
                  if(var19 == 0) {
                     var16 = var17;
                  } else if(var19 == 1) {
                     var16 = var18;
                  } else if(var19 == 2) {
                     var16 = 7 - var17;
                  } else {
                     var16 = 7 - var18;
                  }

                  class216.method4389(var20, var1, var16 + var2, var3 + class112.method2109(var11 & 7, var12 & 7, var7), 0, 0, var7);
               } else {
                  class216.method4389(var20, 0, -1, -1, 0, 0, 0);
               }
            }
         }
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([BILjava/lang/CharSequence;I)I",
      garbageValue = "1503519247"
   )
   public static int method5126(byte[] var0, int var1, CharSequence var2) {
      int var3 = var2.length();
      int var4 = var1;

      for(int var5 = 0; var5 < var3; ++var5) {
         char var6 = var2.charAt(var5);
         if(var6 <= 127) {
            var0[var4++] = (byte)var6;
         } else if(var6 <= 2047) {
            var0[var4++] = (byte)(192 | var6 >> 6);
            var0[var4++] = (byte)(128 | var6 & '?');
         } else {
            var0[var4++] = (byte)(224 | var6 >> '\f');
            var0[var4++] = (byte)(128 | var6 >> 6 & 63);
            var0[var4++] = (byte)(128 | var6 & '?');
         }
      }

      return var4 - var1;
   }

   @ObfuscatedName("hg")
   @ObfuscatedSignature(
      signature = "(IIIILjava/lang/String;B)V",
      garbageValue = "6"
   )
   static void method5124(int var0, int var1, int var2, int var3, String var4) {
      class187 var5 = class174.method3220(var1, var2);
      if(var5 != null) {
         if(var5.field2664 != null) {
            class194 var6 = new class194();
            var6.field2759 = var5;
            var6.field2762 = var0;
            var6.field2766 = var4;
            var6.field2765 = var5.field2664;
            class209.method4198(var6);
         }

         boolean var8 = true;
         if(var5.field2562 > 0) {
            var8 = class107.method1888(var5);
         }

         if(var8) {
            if(class265.method5285(class203.method4026(var5), var0 - 1)) {
               class12 var7;
               if(var0 == 1) {
                  var7 = class150.method2761(ClientProt.field3224, client.field2384.field1770);
                  var7.field121.method2334(var1);
                  var7.field121.method2242(var2);
                  var7.field121.method2242(var3);
                  client.field2384.method2573(var7);
               }

               if(var0 == 2) {
                  var7 = class150.method2761(ClientProt.field3177, client.field2384.field1770);
                  var7.field121.method2334(var1);
                  var7.field121.method2242(var2);
                  var7.field121.method2242(var3);
                  client.field2384.method2573(var7);
               }

               if(var0 == 3) {
                  var7 = class150.method2761(ClientProt.field3204, client.field2384.field1770);
                  var7.field121.method2334(var1);
                  var7.field121.method2242(var2);
                  var7.field121.method2242(var3);
                  client.field2384.method2573(var7);
               }

               if(var0 == 4) {
                  var7 = class150.method2761(ClientProt.field3192, client.field2384.field1770);
                  var7.field121.method2334(var1);
                  var7.field121.method2242(var2);
                  var7.field121.method2242(var3);
                  client.field2384.method2573(var7);
               }

               if(var0 == 5) {
                  var7 = class150.method2761(ClientProt.field3196, client.field2384.field1770);
                  var7.field121.method2334(var1);
                  var7.field121.method2242(var2);
                  var7.field121.method2242(var3);
                  client.field2384.method2573(var7);
               }

               if(var0 == 6) {
                  var7 = class150.method2761(ClientProt.field3191, client.field2384.field1770);
                  var7.field121.method2334(var1);
                  var7.field121.method2242(var2);
                  var7.field121.method2242(var3);
                  client.field2384.method2573(var7);
               }

               if(var0 == 7) {
                  var7 = class150.method2761(ClientProt.field3241, client.field2384.field1770);
                  var7.field121.method2334(var1);
                  var7.field121.method2242(var2);
                  var7.field121.method2242(var3);
                  client.field2384.method2573(var7);
               }

               if(var0 == 8) {
                  var7 = class150.method2761(ClientProt.field3172, client.field2384.field1770);
                  var7.field121.method2334(var1);
                  var7.field121.method2242(var2);
                  var7.field121.method2242(var3);
                  client.field2384.method2573(var7);
               }

               if(var0 == 9) {
                  var7 = class150.method2761(ClientProt.field3240, client.field2384.field1770);
                  var7.field121.method2334(var1);
                  var7.field121.method2242(var2);
                  var7.field121.method2242(var3);
                  client.field2384.method2573(var7);
               }

               if(var0 == 10) {
                  var7 = class150.method2761(ClientProt.field3248, client.field2384.field1770);
                  var7.field121.method2334(var1);
                  var7.field121.method2242(var2);
                  var7.field121.method2242(var3);
                  client.field2384.method2573(var7);
               }

            }
         }
      }
   }

   @ObfuscatedName("gh")
   @ObfuscatedSignature(
      signature = "(IIIIIIII)V",
      garbageValue = "-1917790959"
   )
   static final void method5125(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var8 = var6 - 334;
      if(var8 < 0) {
         var8 = 0;
      } else if(var8 > 100) {
         var8 = 100;
      }

      int var9 = (client.field2406 - client.field2259) * var8 / 100 + client.field2259;
      int var7 = var5 * var9 / 256;
      var8 = 2048 - var3 & 2047;
      var9 = 2048 - var4 & 2047;
      int var10 = 0;
      int var11 = 0;
      int var12 = var7;
      int var13;
      int var14;
      int var15;
      if(var8 != 0) {
         var13 = class211.field2920[var8];
         var14 = class211.field2914[var8];
         var15 = var11 * var14 - var13 * var7 >> 16;
         var12 = var13 * var11 + var14 * var7 >> 16;
         var11 = var15;
      }

      if(var9 != 0) {
         var13 = class211.field2920[var9];
         var14 = class211.field2914[var9];
         var15 = var12 * var13 + var14 * var10 >> 16;
         var12 = var14 * var12 - var13 * var10 >> 16;
         var10 = var15;
      }

      class85.field912 = var0 - var10;
      class229.field3068 = var1 - var11;
      class116.field1324 = var2 - var12;
      client.field2430 = var3;
      client.onCameraPitchChanged(-1);
      class220.field2986 = var4;
      if(client.field2228 == 1 && client.field2263 >= 2 && client.field2165 % 50 == 0 && (class267.field3457 >> 7 != class32.field303.field1090 >> 7 || class148.field1834 >> 7 != class32.field303.field1072 >> 7)) {
         var13 = class32.field303.field2805;
         var14 = (class267.field3457 >> 7) + class229.field3067;
         var15 = (class148.field1834 >> 7) + class35.field360;
         class12 var16 = class150.method2761(ClientProt.field3217, client.field2384.field1770);
         var16.field121.method2301(client.field2235);
         var16.field121.method2255(var15);
         var16.field121.method2283(var13);
         var16.field121.method2242(var14);
         client.field2384.method2573(var16);
      }

   }

   @ObfuscatedName("iw")
   @ObfuscatedSignature(
      signature = "(Lhw;IB)I",
      garbageValue = "0"
   )
   static final int method5123(class187 var0, int var1) {
      if(var0.field2645 != null && var1 < var0.field2645.length) {
         try {
            int[] var2 = var0.field2645[var1];
            int var3 = 0;
            int var4 = 0;
            byte var5 = 0;

            while(true) {
               int var6 = var2[var4++];
               int var7 = 0;
               byte var8 = 0;
               if(var6 == 0) {
                  return var3;
               }

               if(var6 == 1) {
                  var7 = client.field2361[var2[var4++]];
               }

               if(var6 == 2) {
                  var7 = client.field2286[var2[var4++]];
               }

               if(var6 == 3) {
                  var7 = client.field2218[var2[var4++]];
               }

               int var9;
               class187 var10;
               int var11;
               int var12;
               if(var6 == 4) {
                  var9 = var2[var4++] << 16;
                  var9 += var2[var4++];
                  var10 = class48.method1047(var9);
                  var11 = var2[var4++];
                  if(var11 != -1 && (!class164.method3014(var11).field444 || client.field2156)) {
                     for(var12 = 0; var12 < var10.field2682.length; ++var12) {
                        if(var11 + 1 == var10.field2682[var12]) {
                           var7 += var10.field2696[var12];
                        }
                     }
                  }
               }

               if(var6 == 5) {
                  var7 = class81.field898[var2[var4++]];
               }

               if(var6 == 6) {
                  var7 = class268.field3461[client.field2286[var2[var4++]] - 1];
               }

               if(var6 == 7) {
                  var7 = class81.field898[var2[var4++]] * 100 / 46875;
               }

               if(var6 == 8) {
                  var7 = class32.field303.field2807;
               }

               if(var6 == 9) {
                  for(var9 = 0; var9 < 25; ++var9) {
                     if(class268.field3463[var9]) {
                        var7 += client.field2286[var9];
                     }
                  }
               }

               if(var6 == 10) {
                  var9 = var2[var4++] << 16;
                  var9 += var2[var4++];
                  var10 = class48.method1047(var9);
                  var11 = var2[var4++];
                  if(var11 != -1 && (!class164.method3014(var11).field444 || client.field2156)) {
                     for(var12 = 0; var12 < var10.field2682.length; ++var12) {
                        if(var11 + 1 == var10.field2682[var12]) {
                           var7 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if(var6 == 11) {
                  var7 = client.field2163;
               }

               if(var6 == 12) {
                  var7 = client.field2321;
               }

               if(var6 == 13) {
                  var9 = class81.field898[var2[var4++]];
                  int var13 = var2[var4++];
                  var7 = (var9 & 1 << var13) != 0?1:0;
               }

               if(var6 == 14) {
                  var9 = var2[var4++];
                  var7 = class259.method5178(var9);
               }

               if(var6 == 15) {
                  var8 = 1;
               }

               if(var6 == 16) {
                  var8 = 2;
               }

               if(var6 == 17) {
                  var8 = 3;
               }

               if(var6 == 18) {
                  var7 = (class32.field303.field1090 >> 7) + class229.field3067;
               }

               if(var6 == 19) {
                  var7 = (class32.field303.field1072 >> 7) + class35.field360;
               }

               if(var6 == 20) {
                  var7 = var2[var4++];
               }

               if(var8 == 0) {
                  if(var5 == 0) {
                     var3 += var7;
                  }

                  if(var5 == 1) {
                     var3 -= var7;
                  }

                  if(var5 == 2 && var7 != 0) {
                     var3 /= var7;
                  }

                  if(var5 == 3) {
                     var3 *= var7;
                  }

                  var5 = 0;
               } else {
                  var5 = var8;
               }
            }
         } catch (Exception var14) {
            return -1;
         }
      } else {
         return -2;
      }
   }
}
