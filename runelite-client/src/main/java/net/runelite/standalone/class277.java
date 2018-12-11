package net.runelite.standalone;

import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
public class class277 implements Runnable {
   @ObfuscatedName("l")
   Object field3511;
   @ObfuscatedName("s")
   int[] field3510;
   @ObfuscatedName("f")
   boolean field3512;
   @ObfuscatedName("a")
   long[] field3508;
   @ObfuscatedName("e")
   int[] field3507;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -602861203
   )
   int field3509;

   class277() {
      this.field3512 = true;
      this.field3511 = new Object();
      this.field3509 = 0;
      this.field3510 = new int[500];
      this.field3507 = new int[500];
      this.field3508 = new long[500];
   }

   public void run() {
      for(; this.field3512; class48.method1045(50L)) {
         Object var1 = this.field3511;
         synchronized(this.field3511) {
            if(this.field3509 < 500) {
               this.field3510[this.field3509] = class163.field1975;
               this.field3507[this.field3509] = class163.field1976;
               this.field3508[this.field3509] = class163.field1974;
               ++this.field3509;
            }
         }
      }

   }

   @ObfuscatedName("jy")
   @ObfuscatedSignature(
      signature = "(IIIILlp;Lht;I)V",
      garbageValue = "-157924081"
   )
   static final void method5381(int var0, int var1, int var2, int var3, SpritePixels var4, class198 var5) {
      if(var4 != null) {
         int var6 = client.field2223 & 2047;
         int var7 = var3 * var3 + var2 * var2;
         if(var7 <= 6400) {
            int var8 = class211.field2920[var6];
            int var9 = class211.field2914[var6];
            int var10 = var9 * var2 + var3 * var8 >> 16;
            int var11 = var3 * var9 - var8 * var2 >> 16;
            if(var7 > 2500) {
               var4.method235(var10 + var5.field2798 / 2 - var4.maxWidth / 2, var5.field2795 / 2 - var11 - var4.maxHeight / 2, var0, var1, var5.field2798, var5.field2795, var5.field2796, var5.field2793);
            } else {
               var4.method215(var0 + var10 + var5.field2798 / 2 - var4.maxWidth / 2, var5.field2795 / 2 + var1 - var11 - var4.maxHeight / 2);
            }

         }
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "355877661"
   )
   static int method5383(int var0, class296 var1, boolean var2) {
      String var3;
      int var4;
      if(var0 == 4100) {
         var3 = class249.field3313[--class103.field1146];
         var4 = class249.field3312[--MapCacheArchiveNames.field3811];
         class249.field3313[++class103.field1146 - 1] = var3 + var4;
         return 1;
      } else {
         String var9;
         if(var0 == 4101) {
            class103.field1146 -= 2;
            var3 = class249.field3313[class103.field1146];
            var9 = class249.field3313[class103.field1146 + 1];
            class249.field3313[++class103.field1146 - 1] = var3 + var9;
            return 1;
         } else if(var0 == 4102) {
            var3 = class249.field3313[--class103.field1146];
            var4 = class249.field3312[--MapCacheArchiveNames.field3811];
            class249.field3313[++class103.field1146 - 1] = var3 + class73.method1557(var4, true);
            return 1;
         } else if(var0 == 4103) {
            var3 = class249.field3313[--class103.field1146];
            class249.field3313[++class103.field1146 - 1] = var3.toLowerCase();
            return 1;
         } else {
            int var6;
            int var10;
            if(var0 == 4104) {
               var10 = class249.field3312[--MapCacheArchiveNames.field3811];
               long var11 = 86400000L * (11745L + (long)var10);
               class249.field3316.setTime(new Date(var11));
               var6 = class249.field3316.get(5);
               int var16 = class249.field3316.get(2);
               int var8 = class249.field3316.get(1);
               class249.field3313[++class103.field1146 - 1] = var6 + "-" + class249.field3317[var16] + "-" + var8;
               return 1;
            } else if(var0 != 4105) {
               if(var0 == 4106) {
                  var10 = class249.field3312[--MapCacheArchiveNames.field3811];
                  class249.field3313[++class103.field1146 - 1] = Integer.toString(var10);
                  return 1;
               } else if(var0 == 4107) {
                  class103.field1146 -= 2;
                  class249.field3312[++MapCacheArchiveNames.field3811 - 1] = GameEngine.method5967(WorldMapGameObject.method2482(class249.field3313[class103.field1146], class249.field3313[class103.field1146 + 1], client.field2158));
                  return 1;
               } else {
                  int var5;
                  byte[] var13;
                  class299 var14;
                  if(var0 == 4108) {
                     var3 = class249.field3313[--class103.field1146];
                     MapCacheArchiveNames.field3811 -= 2;
                     var4 = class249.field3312[MapCacheArchiveNames.field3811];
                     var5 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
                     var13 = class20.fontsIndex.method4398(var5, 0, 549820083);
                     var14 = new class299(var13);
                     class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var14.method3812(var3, var4);
                     return 1;
                  } else if(var0 == 4109) {
                     var3 = class249.field3313[--class103.field1146];
                     MapCacheArchiveNames.field3811 -= 2;
                     var4 = class249.field3312[MapCacheArchiveNames.field3811];
                     var5 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
                     var13 = class20.fontsIndex.method4398(var5, 0, -32568540);
                     var14 = new class299(var13);
                     class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var14.method3857(var3, var4);
                     return 1;
                  } else if(var0 == 4110) {
                     class103.field1146 -= 2;
                     var3 = class249.field3313[class103.field1146];
                     var9 = class249.field3313[class103.field1146 + 1];
                     if(class249.field3312[--MapCacheArchiveNames.field3811] == 1) {
                        class249.field3313[++class103.field1146 - 1] = var3;
                     } else {
                        class249.field3313[++class103.field1146 - 1] = var9;
                     }

                     return 1;
                  } else if(var0 == 4111) {
                     var3 = class249.field3313[--class103.field1146];
                     class249.field3313[++class103.field1146 - 1] = class190.method3813(var3);
                     return 1;
                  } else if(var0 == 4112) {
                     var3 = class249.field3313[--class103.field1146];
                     var4 = class249.field3312[--MapCacheArchiveNames.field3811];
                     class249.field3313[++class103.field1146 - 1] = var3 + (char)var4;
                     return 1;
                  } else if(var0 == 4113) {
                     var10 = class249.field3312[--MapCacheArchiveNames.field3811];
                     class249.field3312[++MapCacheArchiveNames.field3811 - 1] = class195.method3935((char)var10)?1:0;
                     return 1;
                  } else if(var0 == 4114) {
                     var10 = class249.field3312[--MapCacheArchiveNames.field3811];
                     class249.field3312[++MapCacheArchiveNames.field3811 - 1] = class25.method459((char)var10)?1:0;
                     return 1;
                  } else if(var0 == 4115) {
                     var10 = class249.field3312[--MapCacheArchiveNames.field3811];
                     class249.field3312[++MapCacheArchiveNames.field3811 - 1] = class274.method5366((char)var10)?1:0;
                     return 1;
                  } else if(var0 == 4116) {
                     var10 = class249.field3312[--MapCacheArchiveNames.field3811];
                     class249.field3312[++MapCacheArchiveNames.field3811 - 1] = class320.method6246((char)var10)?1:0;
                     return 1;
                  } else if(var0 == 4117) {
                     var3 = class249.field3313[--class103.field1146];
                     if(var3 != null) {
                        class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3.length();
                     } else {
                        class249.field3312[++MapCacheArchiveNames.field3811 - 1] = 0;
                     }

                     return 1;
                  } else if(var0 == 4118) {
                     var3 = class249.field3313[--class103.field1146];
                     MapCacheArchiveNames.field3811 -= 2;
                     var4 = class249.field3312[MapCacheArchiveNames.field3811];
                     var5 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
                     class249.field3313[++class103.field1146 - 1] = var3.substring(var4, var5);
                     return 1;
                  } else if(var0 == 4119) {
                     var3 = class249.field3313[--class103.field1146];
                     StringBuilder var17 = new StringBuilder(var3.length());
                     boolean var15 = false;

                     for(var6 = 0; var6 < var3.length(); ++var6) {
                        char var7 = var3.charAt(var6);
                        if(var7 == '<') {
                           var15 = true;
                        } else if(var7 == '>') {
                           var15 = false;
                        } else if(!var15) {
                           var17.append(var7);
                        }
                     }

                     class249.field3313[++class103.field1146 - 1] = var17.toString();
                     return 1;
                  } else if(var0 == 4120) {
                     var3 = class249.field3313[--class103.field1146];
                     var4 = class249.field3312[--MapCacheArchiveNames.field3811];
                     class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3.indexOf(var4);
                     return 1;
                  } else if(var0 == 4121) {
                     class103.field1146 -= 2;
                     var3 = class249.field3313[class103.field1146];
                     var9 = class249.field3313[class103.field1146 + 1];
                     var5 = class249.field3312[--MapCacheArchiveNames.field3811];
                     class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3.indexOf(var9, var5);
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               class103.field1146 -= 2;
               var3 = class249.field3313[class103.field1146];
               var9 = class249.field3313[class103.field1146 + 1];
               if(class32.field303.field2801 != null && class32.field303.field2801.field3964) {
                  class249.field3313[++class103.field1146 - 1] = var9;
               } else {
                  class249.field3313[++class103.field1146 - 1] = var3;
               }

               return 1;
            }
         }
      }
   }

   @ObfuscatedName("hu")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-1718985240"
   )
   static final void method5384(int var0, int var1, int var2, int var3) {
      for(int var4 = 0; var4 < client.field2356; ++var4) {
         if(client.field2363[var4] + client.field2322[var4] > var0 && client.field2322[var4] < var0 + var2 && client.field2364[var4] + client.field2362[var4] > var1 && client.field2362[var4] < var3 + var1) {
            client.field2287[var4] = true;
         }
      }

   }

   @ObfuscatedName("iv")
   @ObfuscatedSignature(
      signature = "(IIIIIIB)V",
      garbageValue = "0"
   )
   static final void method5378(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 - var0;
      int var7 = var3 - var1;
      int var8 = var6 >= 0?var6:-var6;
      int var9 = var7 >= 0?var7:-var7;
      int var10 = var8;
      if(var8 < var9) {
         var10 = var9;
      }

      if(var10 != 0) {
         int var11 = (var6 << 16) / var10;
         int var12 = (var7 << 16) / var10;
         if(var12 <= var11) {
            var11 = -var11;
         } else {
            var12 = -var12;
         }

         int var13 = var5 * var12 >> 17;
         int var14 = var5 * var12 + 1 >> 17;
         int var15 = var5 * var11 >> 17;
         int var16 = var5 * var11 + 1 >> 17;
         var0 -= Rasterizer2D.field2124;
         var1 -= Rasterizer2D.field2122;
         int var17 = var0 + var13;
         int var18 = var0 - var14;
         int var19 = var0 + var6 - var14;
         int var20 = var0 + var6 + var13;
         int var21 = var15 + var1;
         int var22 = var1 - var16;
         int var23 = var7 + var1 - var16;
         int var24 = var7 + var15 + var1;
         class211.method4262(var17, var18, var19);
         class211.method4325(var21, var22, var23, var17, var18, var19, var4);
         class211.method4262(var17, var19, var20);
         class211.method4325(var21, var23, var24, var17, var19, var20, var4);
      }
   }
}
