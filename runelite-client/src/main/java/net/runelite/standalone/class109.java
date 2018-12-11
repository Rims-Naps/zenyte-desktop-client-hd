package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
public class class109 {
   @ObfuscatedName("sn")
   static short[] field1193;

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "849146229"
   )
   static int method1921(int var0, class296 var1, boolean var2) {
      int var4 = -1;
      class187 var3;
      if(var0 >= 2000) {
         var0 -= 1000;
         var4 = class249.field3312[--MapCacheArchiveNames.field3811];
         var3 = class48.method1047(var4);
      } else {
         var3 = var2?class3.field36:class284.field3565;
      }

      if(var0 == 1100) {
         MapCacheArchiveNames.field3811 -= 2;
         var3.field2579 = class249.field3312[MapCacheArchiveNames.field3811];
         if(var3.field2579 > var3.field2581 - var3.field2573) {
            var3.field2579 = var3.field2581 - var3.field2573;
         }

         if(var3.field2579 < 0) {
            var3.field2579 = 0;
         }

         var3.field2580 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
         if(var3.field2580 > var3.field2582 - var3.field2574) {
            var3.field2580 = var3.field2582 - var3.field2574;
         }

         if(var3.field2580 < 0) {
            var3.field2580 = 0;
         }

         class230.method4617(var3);
         return 1;
      } else if(var0 == 1101) {
         var3.field2633 = class249.field3312[--MapCacheArchiveNames.field3811];
         class230.method4617(var3);
         return 1;
      } else if(var0 == 1102) {
         var3.field2587 = class249.field3312[--MapCacheArchiveNames.field3811] == 1;
         class230.method4617(var3);
         return 1;
      } else if(var0 == 1103) {
         var3.field2652 = class249.field3312[--MapCacheArchiveNames.field3811];
         class230.method4617(var3);
         return 1;
      } else if(var0 == 1104) {
         var3.field2591 = class249.field3312[--MapCacheArchiveNames.field3811];
         class230.method4617(var3);
         return 1;
      } else if(var0 == 1105) {
         var3.field2593 = class249.field3312[--MapCacheArchiveNames.field3811];
         class230.method4617(var3);
         return 1;
      } else if(var0 == 1106) {
         var3.field2592 = class249.field3312[--MapCacheArchiveNames.field3811];
         class230.method4617(var3);
         return 1;
      } else if(var0 == 1107) {
         var3.field2637 = class249.field3312[--MapCacheArchiveNames.field3811] == 1;
         class230.method4617(var3);
         return 1;
      } else if(var0 == 1108) {
         var3.field2566 = 1;
         var3.field2602 = class249.field3312[--MapCacheArchiveNames.field3811];
         class230.method4617(var3);
         return 1;
      } else if(var0 == 1109) {
         MapCacheArchiveNames.field3811 -= 6;
         var3.field2607 = class249.field3312[MapCacheArchiveNames.field3811];
         var3.field2608 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
         var3.field2687 = class249.field3312[MapCacheArchiveNames.field3811 + 2];
         var3.field2610 = class249.field3312[MapCacheArchiveNames.field3811 + 3];
         var3.field2671 = class249.field3312[MapCacheArchiveNames.field3811 + 4];
         var3.field2612 = class249.field3312[MapCacheArchiveNames.field3811 + 5];
         class230.method4617(var3);
         return 1;
      } else {
         int var8;
         if(var0 == 1110) {
            var8 = class249.field3312[--MapCacheArchiveNames.field3811];
            if(var8 != var3.field2605) {
               var3.field2605 = var8;
               var3.field2686 = 0;
               var3.field2663 = 0;
               class230.method4617(var3);
            }

            return 1;
         } else if(var0 == 1111) {
            var3.field2615 = class249.field3312[--MapCacheArchiveNames.field3811] == 1;
            class230.method4617(var3);
            return 1;
         } else if(var0 == 1112) {
            String var7 = class249.field3313[--class103.field1146];
            if(!var7.equals(var3.field2619)) {
               var3.field2619 = var7;
               class230.method4617(var3);
            }

            return 1;
         } else if(var0 == 1113) {
            var3.field2642 = class249.field3312[--MapCacheArchiveNames.field3811];
            class230.method4617(var3);
            return 1;
         } else if(var0 == 1114) {
            MapCacheArchiveNames.field3811 -= 3;
            var3.field2601 = class249.field3312[MapCacheArchiveNames.field3811];
            var3.field2623 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
            var3.field2597 = class249.field3312[MapCacheArchiveNames.field3811 + 2];
            class230.method4617(var3);
            return 1;
         } else if(var0 == 1115) {
            var3.field2624 = class249.field3312[--MapCacheArchiveNames.field3811] == 1;
            class230.method4617(var3);
            return 1;
         } else if(var0 == 1116) {
            var3.field2594 = class249.field3312[--MapCacheArchiveNames.field3811];
            class230.method4617(var3);
            return 1;
         } else if(var0 == 1117) {
            var3.field2598 = class249.field3312[--MapCacheArchiveNames.field3811];
            class230.method4617(var3);
            return 1;
         } else if(var0 == 1118) {
            var3.field2599 = class249.field3312[--MapCacheArchiveNames.field3811] == 1;
            class230.method4617(var3);
            return 1;
         } else if(var0 == 1119) {
            var3.field2600 = class249.field3312[--MapCacheArchiveNames.field3811] == 1;
            class230.method4617(var3);
            return 1;
         } else if(var0 == 1120) {
            MapCacheArchiveNames.field3811 -= 2;
            var3.field2581 = class249.field3312[MapCacheArchiveNames.field3811];
            var3.field2582 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
            class230.method4617(var3);
            if(var4 != -1 && var3.field2560 == 0) {
               class79.method1593(class187.field2547[var4 >> 16], var3, false);
            }

            return 1;
         } else if(var0 == 1121) {
            class103.method1854(var3.field2621, var3.field2620);
            client.field2319 = var3;
            class230.method4617(var3);
            return 1;
         } else if(var0 == 1122) {
            var3.field2640 = class249.field3312[--MapCacheArchiveNames.field3811];
            class230.method4617(var3);
            return 1;
         } else if(var0 == 1123) {
            var3.field2584 = class249.field3312[--MapCacheArchiveNames.field3811];
            class230.method4617(var3);
            return 1;
         } else if(var0 == 1124) {
            var3.field2558 = class249.field3312[--MapCacheArchiveNames.field3811];
            class230.method4617(var3);
            return 1;
         } else if(var0 == 1125) {
            var8 = class249.field3312[--MapCacheArchiveNames.field3811];
            class136 var6 = (class136)class38.method678(class148.method2686(), var8);
            if(var6 != null) {
               var3.field2588 = var6;
               class230.method4617(var3);
            }

            return 1;
         } else {
            boolean var5;
            if(var0 == 1126) {
               var5 = class249.field3312[--MapCacheArchiveNames.field3811] == 1;
               var3.field2618 = var5;
               return 1;
            } else if(var0 == 1127) {
               var5 = class249.field3312[--MapCacheArchiveNames.field3811] == 1;
               var3.field2616 = var5;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }

   @ObfuscatedName("id")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Lhw;I)Ljava/lang/String;",
      garbageValue = "516537873"
   )
   static String method1922(String var0, class187 var1) {
      if(var0.indexOf("%") != -1) {
         for(int var2 = 1; var2 <= 5; ++var2) {
            while(true) {
               int var3 = var0.indexOf("%" + var2);
               if(var3 == -1) {
                  break;
               }

               String var4 = var0.substring(0, var3);
               int var6 = class255.method5123(var1, var2 - 1);
               String var5;
               if(var6 < 999999999) {
                  var5 = Integer.toString(var6);
               } else {
                  var5 = "*";
               }

               var0 = var4 + var5 + var0.substring(var3 + 2);
            }
         }
      }

      return var0;
   }

   @ObfuscatedName("fn")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-397167485"
   )
   static void method1920(int var0) {
      client.field2366 = 0L;
      if(var0 >= 2) {
         client.field2367 = true;
         client.resizeChanged(-1);
      } else {
         client.field2367 = false;
         client.resizeChanged(-1);
      }

      if(WorldMapRegion.method4379() == 1) {
         class302.field3755.method5833(765, 503, (byte)11);
      } else {
         class302.field3755.method5833(7680, 2160, (byte)11);
      }

      if(client.field2161 >= 25) {
         class198.method3945();
      }

   }
}
