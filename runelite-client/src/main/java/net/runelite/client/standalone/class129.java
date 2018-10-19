package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public final class class129 {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1830498981
   )
   int field1226;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -297101631
   )
   int field1225;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1394682619
   )
   int field1228;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1886120661
   )
   int field1227;
   // $FF: synthetic field
   @ObfuscatedSignature(
      signature = "Lat;"
   )
   final class322 this$0;

   @ObfuscatedSignature(
      signature = "(Lat;)V"
   )
   class129(class322 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)[Lkr;",
      garbageValue = "-1784728620"
   )
   static class114[] method2386() {
      return new class114[]{class114.field1067, class114.field1068, class114.field1070};
   }

   @ObfuscatedName("ek")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "8"
   )
   static void method2383() {
      int var21;
      if(client.field3762 == 0) {
         class258.field2566 = new class312(4, 104, 104, class31.field249);

         for(var21 = 0; var21 < 4; ++var21) {
            client.field3790[var21] = new class182(104, 104);
         }

         class5.field44 = new class26(512, 512);
         class325.field3481 = "Starting game engine...";
         class325.field3469 = 5;
         client.field3762 = 20;
      } else if(client.field3762 == 20) {
         class325.field3481 = "Prepared visibility map";
         class325.field3469 = 10;
         client.field3762 = 30;
      } else if(client.field3762 == 30) {
         class77.field705 = class63.method1087(0, false, true, true);
         class330.field3690 = class63.method1087(1, false, true, true);
         class295.field3175 = class63.method1087(2, true, false, true);
         class205.field1992 = class63.method1087(3, false, true, true);
         class104.field971 = class63.method1087(4, false, true, true);
         class11.field85 = class63.method1087(5, true, true, true);
         client.field4007 = class63.method1087(6, true, true, true);
         class87.field801 = class63.method1087(7, false, true, true);
         class170.field1577 = class63.method1087(8, false, true, true);
         class138.field1365 = class63.method1087(9, false, true, true);
         class293.field3165 = class63.method1087(10, false, true, true);
         class78.field717 = class63.method1087(11, false, true, true);
         class126.field1194 = class63.method1087(12, false, true, true);
         class288.field3128 = class63.method1087(13, true, false, true);
         class261.field2898 = class63.method1087(14, false, true, true);
         class157.field1497 = class63.method1087(15, false, true, true);
         class313.field3372 = class63.method1087(16, true, true, true);
         class133.field1319 = class63.method1087(17, true, true, true);
         class325.field3481 = "Connecting to update server";
         class325.field3469 = 20;
         client.field3762 = 40;
      } else if(client.field3762 != 40) {
         if(client.field3762 == 45) {
            class0.method10(22050, !client.field3736, 2);
            class24 var27 = new class24();
            var27.method251(9, 128);
            class153.field1468 = class130.method2391(class181.field1743, 0, 22050);
            class153.field1468.method640(var27);
            class9.method100(class157.field1497, class261.field2898, class104.field971, var27);
            class311.field3296 = class130.method2391(class181.field1743, 1, 2048);
            class61.field468 = new class280();
            class311.field3296.method640(class61.field468);
            class287.field3121 = new class157(22050, class40.field294);
            class325.field3481 = "Prepared sound engine";
            class325.field3469 = 35;
            client.field3762 = 50;
            class139.field1376 = new class166(class170.field1577, class288.field3128);
         } else {
            int var1;
            if(client.field3762 == 50) {
               class86[] var26 = new class86[]{class86.field780, class86.field779, class86.field776, class86.field775, class86.field783, class86.field778};
               var1 = var26.length;
               class166 var23 = class139.field1376;
               class86[] var24 = new class86[]{class86.field780, class86.field779, class86.field776, class86.field775, class86.field783, class86.field778};
               client.field3784 = var23.method2843(var24);
               if(client.field3784.size() < var1) {
                  class325.field3481 = "Loading fonts - " + client.field3784.size() * 100 / var1 + "%";
                  class325.field3469 = 40;
               } else {
                  class272.field2981 = (class277)client.field3784.get(class86.field783);
                  class9.field76 = (class277)client.field3784.get(class86.field775);
                  class246.field2467 = (class277)client.field3784.get(class86.field776);
                  class296.field3184 = client.field3998.vmethod3225();
                  class325.field3481 = "Loaded fonts";
                  class325.field3469 = 40;
                  client.field3762 = 60;
               }
            } else if(client.field3762 == 60) {
               var21 = class171.method2887(class293.field3165, class170.field1577);
               byte var22 = 11;
               if(var21 < var22) {
                  class325.field3481 = "Loading title screen - " + var21 * 100 / var22 + "%";
                  class325.field3469 = 50;
               } else {
                  class325.field3481 = "Loaded title screen";
                  class325.field3469 = 50;
                  class188.method3239(5);
                  client.field3762 = 70;
               }
            } else if(client.field3762 == 70) {
               if(!class295.field3175.method2584()) {
                  class325.field3481 = "Loading config - " + class295.field3175.method1792() + "%";
                  class325.field3469 = 60;
               } else {
                  class108 var25 = class295.field3175;
                  class105.field987 = var25;
                  class108 var18 = class295.field3175;
                  class287.field3123 = var18;
                  class313.method5513(class295.field3175, class87.field801);
                  class5.method74(class295.field3175, class87.field801, client.field3736);
                  class187.method3227(class295.field3175, class87.field801);
                  class108 var2 = class295.field3175;
                  class288.field3125 = var2;
                  class195.method3306(class295.field3175, class87.field801, client.field3735, class272.field2981);
                  class108 var3 = class295.field3175;
                  class108 var4 = class77.field705;
                  class108 var5 = class330.field3690;
                  class321.field3416 = var3;
                  class321.field3421 = var4;
                  class321.field3413 = var5;
                  class108 var6 = class295.field3175;
                  class108 var7 = class87.field801;
                  class90.field884 = var6;
                  class128.field1223 = var7;
                  class108 var8 = class295.field3175;
                  class213.field2065 = var8;
                  class237.method4201(class295.field3175);
                  class22.method227(class205.field1992, class87.field801, class170.field1577, class288.field3128);
                  class267.method4847(class295.field3175);
                  class108 var9 = class295.field3175;
                  class258.field2571 = var9;
                  class108 var10 = class295.field3175;
                  class244.field2435 = var10;
                  class108 var11 = class295.field3175;
                  class16.field139 = var11;
                  class108 var12 = class295.field3175;
                  class183.field1772 = var12;
                  class125.field1183 = new class54();
                  class108 var13 = class295.field3175;
                  class108 var14 = class170.field1577;
                  class108 var15 = class288.field3128;
                  class231.field2260 = var13;
                  class231.field2277 = var14;
                  class231.field2255 = var15;
                  class211.method3725(class295.field3175, class170.field1577);
                  class177.method2970(class295.field3175, class170.field1577);
                  class325.field3481 = "Loaded config";
                  class325.field3469 = 60;
                  client.field3762 = 80;
               }
            } else if(client.field3762 == 80) {
               var21 = 0;
               if(class150.field1436 == null) {
                  class150.field1436 = class225.method4022(class170.field1577, class59.field465.field2530, 0, (byte)-76);
               } else {
                  ++var21;
               }

               if(class83.field748 == null) {
                  class83.field748 = class225.method4022(class170.field1577, class59.field465.field2526, 0, (byte)-60);
               } else {
                  ++var21;
               }

               if(class294.field3173 == null) {
                  class294.field3173 = class328.method5877(class170.field1577, class59.field465.field2527, 0);
               } else {
                  ++var21;
               }

               if(class247.field2471 == null) {
                  class247.field2471 = class272.method4897(class170.field1577, class59.field465.field2533, 0);
               } else {
                  ++var21;
               }

               if(class126.field1202 == null) {
                  class126.field1202 = class272.method4897(class170.field1577, class59.field465.field2529, 0);
               } else {
                  ++var21;
               }

               if(class131.field1253 == null) {
                  class131.field1253 = class272.method4897(class170.field1577, class59.field465.field2525, 0);
               } else {
                  ++var21;
               }

               if(class253.field2514 == null) {
                  class253.field2514 = class272.method4897(class170.field1577, class59.field465.field2531, 0);
               } else {
                  ++var21;
               }

               if(class10.field79 == null) {
                  class10.field79 = class272.method4897(class170.field1577, class59.field465.field2532, 0);
               } else {
                  ++var21;
               }

               if(class241.field2414 == null) {
                  class241.field2414 = class272.method4897(class170.field1577, class59.field465.field2528, 0);
               } else {
                  ++var21;
               }

               if(class53.field387 == null) {
                  class53.field387 = class328.method5877(class170.field1577, class59.field465.field2534, 0);
               } else {
                  ++var21;
               }

               if(class260.field2881 == null) {
                  class260.field2881 = class328.method5877(class170.field1577, class59.field465.field2535, 0);
               } else {
                  ++var21;
               }

               if(var21 < 11) {
                  class325.field3481 = "Loading sprites - " + var21 * 100 / 12 + "%";
                  class325.field3469 = 70;
               } else {
                  class207.field2025 = class260.field2881;
                  class83.field748.method370();
                  var1 = (int)(Math.random() * 21.0D) - 10;
                  int var17 = (int)(Math.random() * 21.0D) - 10;
                  int var19 = (int)(Math.random() * 21.0D) - 10;
                  int var20 = (int)(Math.random() * 41.0D) - 20;
                  class294.field3173[0].method532(var20 + var1, var17 + var20, var20 + var19);
                  class325.field3481 = "Loaded sprites";
                  class325.field3469 = 70;
                  client.field3762 = 90;
               }
            } else if(client.field3762 == 90) {
               if(!class138.field1365.method2584()) {
                  class325.field3481 = "Loading textures - " + "0%";
                  class325.field3469 = 90;
               } else {
                  class237.field2396 = new class254(class138.field1365, class170.field1577, 20, 0.8D, client.field3736?64:128);
                  class257.method4574(class237.field2396);
                  class257.method4575(0.8D);
                  client.field3762 = 100;
               }
            } else if(client.field3762 == 100) {
               var21 = class237.field2396.method4528();
               if(var21 < 100) {
                  class325.field3481 = "Loading textures - " + var21 + "%";
                  class325.field3469 = 90;
               } else {
                  class325.field3481 = "Loaded textures";
                  class325.field3469 = 90;
                  client.field3762 = 110;
               }
            } else if(client.field3762 == 110) {
               class322.field3442 = new class278();
               class181.field1743.method2821(class322.field3442, 10);
               class325.field3481 = "Loaded input handler";
               class325.field3469 = 92;
               client.field3762 = 120;
            } else if(client.field3762 == 120) {
               if(!class293.field3165.method2600("huffman", "")) {
                  class325.field3481 = "Loading wordpack - " + 0 + "%";
                  class325.field3469 = 94;
               } else {
                  class165 var16 = new class165(class293.field3165.method2599("huffman", ""));
                  class279.method4957(var16);
                  class325.field3481 = "Loaded wordpack";
                  class325.field3469 = 94;
                  client.field3762 = 130;
               }
            } else if(client.field3762 == 130) {
               if(!class205.field1992.method2584()) {
                  class325.field3481 = "Loading interfaces - " + class205.field1992.method1792() * 4 / 5 + "%";
                  class325.field3469 = 96;
               } else if(!class126.field1194.method2584()) {
                  class325.field3481 = "Loading interfaces - " + (80 + class126.field1194.method1792() / 6) + "%";
                  class325.field3469 = 96;
               } else if(!class288.field3128.method2584()) {
                  class325.field3481 = "Loading interfaces - " + (96 + class288.field3128.method1792() / 50) + "%";
                  class325.field3469 = 96;
               } else {
                  class325.field3481 = "Loaded interfaces";
                  class325.field3469 = 98;
                  client.field3762 = 140;
               }
            } else if(client.field3762 == 140) {
               class325.field3469 = 100;
               if(!class313.field3372.method2601(class171.field1584.field1585)) {
                  class325.field3481 = "Loading world map - " + class313.field3372.method2594(class171.field1584.field1585) / 10 + "%";
               } else {
                  if(class63.field587 == null) {
                     class63.field587 = new class88();
                     class63.field587.method1329(class313.field3372, class246.field2467, client.field3784, class294.field3173);
                  }

                  var21 = class63.field587.method1330();
                  if(var21 < 100) {
                     class325.field3481 = "Loading world map - " + (var21 * 9 / 10 + 10) + "%";
                  } else {
                     class325.field3481 = "Loaded world map";
                     client.field3762 = 150;
                  }
               }
            } else if(client.field3762 == 150) {
               class188.method3239(10);
            }
         }
      } else {
         byte var0 = 0;
         var21 = var0 + class77.field705.method1808() * 4 / 100;
         var21 += class330.field3690.method1808() * 4 / 100;
         var21 += class295.field3175.method1808() * 2 / 100;
         var21 += class205.field1992.method1808() * 2 / 100;
         var21 += class104.field971.method1808() * 6 / 100;
         var21 += class11.field85.method1808() * 4 / 100;
         var21 += client.field4007.method1808() * 2 / 100;
         var21 += class87.field801.method1808() * 57 / 100;
         var21 += class170.field1577.method1808() * 2 / 100;
         var21 += class138.field1365.method1808() * 2 / 100;
         var21 += class293.field3165.method1808() * 2 / 100;
         var21 += class78.field717.method1808() * 2 / 100;
         var21 += class126.field1194.method1808() * 2 / 100;
         var21 += class288.field3128.method1808() * 2 / 100;
         var21 += class261.field2898.method1808() * 2 / 100;
         var21 += class157.field1497.method1808() * 2 / 100;
         var21 += class313.field3372.method1808() * 2 / 100;
         var21 += class133.field1319.method1793() && class133.field1319.method2584()?1:0;
         if(var21 != 100) {
            if(var21 != 0) {
               class325.field3481 = "Checking for updates - " + var21 + "%";
            }

            class325.field3469 = 30;
         } else {
            class122.method2258(class77.field705, "Animations");
            class122.method2258(class330.field3690, "Skeletons");
            class122.method2258(class104.field971, "Sound FX");
            class122.method2258(class11.field85, "Maps");
            class122.method2258(client.field4007, "Music Tracks");
            class122.method2258(class87.field801, "Models");
            class122.method2258(class170.field1577, "Sprites");
            class122.method2258(class78.field717, "Music Jingles");
            class122.method2258(class261.field2898, "Music Samples");
            class122.method2258(class157.field1497, "Music Patches");
            class122.method2258(class313.field3372, "World Map");
            class59.field465 = new class255();
            class59.field465.method4555(class133.field1319);
            class325.field3481 = "Loaded update list";
            class325.field3469 = 30;
            client.field3762 = 45;
         }
      }
   }

   @ObfuscatedName("ja")
   @ObfuscatedSignature(
      signature = "(Lhw;I)Ljava/lang/String;",
      garbageValue = "1571232532"
   )
   static String method2384(class329 var0) {
      return class148.method2674(class104.method1771(var0)) == 0?null:(var0.field3633 != null && var0.field3633.trim().length() != 0?var0.field3633:null);
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(ILcz;ZS)I",
      garbageValue = "4032"
   )
   static int method2385(int var0, class252 var1, boolean var2) {
      class329 var3;
      if(var0 == 2700) {
         var3 = class189.getWidget(class55.field407[--class171.field1587]);
         class55.field407[++class171.field1587 - 1] = var3.field3662;
         return 1;
      } else if(var0 == 2701) {
         var3 = class189.getWidget(class55.field407[--class171.field1587]);
         if(var3.field3662 != -1) {
            class55.field407[++class171.field1587 - 1] = var3.field3671;
         } else {
            class55.field407[++class171.field1587 - 1] = 0;
         }

         return 1;
      } else if(var0 == 2702) {
         int var5 = class55.field407[--class171.field1587];
         class45 var4 = (class45)client.field3991.method5310((long)var5);
         if(var4 != null) {
            class55.field407[++class171.field1587 - 1] = 1;
         } else {
            class55.field407[++class171.field1587 - 1] = 0;
         }

         return 1;
      } else if(var0 == 2706) {
         class55.field407[++class171.field1587 - 1] = client.field3892;
         return 1;
      } else {
         return 2;
      }
   }
}
