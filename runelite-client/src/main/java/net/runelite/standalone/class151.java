package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public final class class151 {
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -297101631
   )
   int field1861;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1394682619
   )
   int field1864;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1830498981
   )
   int field1862;
   // $FF: synthetic field
   @ObfuscatedSignature(
      signature = "Lat;"
   )
   final WorldMapManager this$0;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1886120661
   )
   int field1863;

   @ObfuscatedSignature(
      signature = "(Lat;)V"
   )
   class151(WorldMapManager var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)[Lkr;",
      garbageValue = "-1784728620"
   )
   static class22[] method2765() {
      return new class22[]{class22.field241, class22.field242, class22.field244};
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(ILcz;ZS)I",
      garbageValue = "4032"
   )
   static int method2764(int var0, class296 var1, boolean var2) {
      class187 var3;
      if(var0 == 2700) {
         var3 = class48.method1047(class249.field3312[--MapCacheArchiveNames.field3811]);
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2676;
         return 1;
      } else if(var0 == 2701) {
         var3 = class48.method1047(class249.field3312[--MapCacheArchiveNames.field3811]);
         if(var3.field2676 != -1) {
            class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2685;
         } else {
            class249.field3312[++MapCacheArchiveNames.field3811 - 1] = 0;
         }

         return 1;
      } else if(var0 == 2702) {
         int var5 = class249.field3312[--MapCacheArchiveNames.field3811];
         class322 var4 = (class322)client.field2412.method1776((long)var5);
         if(var4 != null) {
            class249.field3312[++MapCacheArchiveNames.field3811 - 1] = 1;
         } else {
            class249.field3312[++MapCacheArchiveNames.field3811 - 1] = 0;
         }

         return 1;
      } else if(var0 == 2706) {
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = client.field2313;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("ja")
   @ObfuscatedSignature(
      signature = "(Lhw;I)Ljava/lang/String;",
      garbageValue = "1571232532"
   )
   static String method2763(class187 var0) {
      return Js5Index.method4493(class203.method4026(var0)) == 0?null:(var0.field2647 != null && var0.field2647.trim().length() != 0?var0.field2647:null);
   }

   @ObfuscatedName("ek")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "8"
   )
   static void method2762() {
      int var21;
      if(client.field2183 == 0) {
         class269.field3464 = new class111(4, 104, 104, class185.field2522);

         for(var21 = 0; var21 < 4; ++var21) {
            client.field2211[var21] = new class3(104, 104);
         }

         class32.field304 = new SpritePixels(512, 512);
         class39.field387 = "Starting game engine...";
         class39.field375 = 5;
         client.field2183 = 20;
      } else if(client.field2183 == 20) {
         class39.field387 = "Prepared visibility map";
         class39.field375 = 10;
         client.field2183 = 30;
      } else if(client.field2183 == 30) { //readindexes
         class286.field3576 = class199.readIndex(0, false, true, true);
         class193.field2749 = class199.readIndex(1, false, true, true);
         class202.configsIndex = class199.readIndex(2, true, false, true);
         class233.field3084 = class199.readIndex(3, false, true, true);
         class203.field2849 = class199.readIndex(4, false, true, true);
         class152.mapsIndex = class199.readIndex(5, true, true, true);
         client.field2428 = class199.readIndex(6, true, true, true);
         WorldMapData.field1851 = class199.readIndex(7, false, true, true);
         class138.spritesIndex = class199.readIndex(8, false, true, true);
         class94.field1014 = class199.readIndex(9, false, true, true);
         class219.binaryIndex = class199.readIndex(10, false, true, true);
         class226.field3043 = class199.readIndex(11, false, true, true);
         class88.clientScriptIndex = class199.readIndex(12, false, true, true);
         class20.fontsIndex = class199.readIndex(13, true, false, true);
         SomeWorldMapObject.field535 = class199.readIndex(14, false, true, true);
         class119.field1640 = class199.readIndex(15, false, true, true);
         class174.worldMapIndex = class199.readIndex(16, true, true, true);
         class99.field1132 = class199.readIndex(17, true, true, true);
         class39.field387 = "Connecting to update server";
         class39.field375 = 20;
         client.field2183 = 40;
      } else if(client.field2183 != 40) {
         if(client.field2183 == 45) {
            class129.method2495(22050, !client.field2157, 2);
            class66 var27 = new class66();
            var27.method1377(9, 128);
            WorldMapNode.field2147 = class79.method1589(GameEngine.field3741, 0, 22050);
            WorldMapNode.field2147.method5718(var27);
            class194.method3919(class119.field1640, SomeWorldMapObject.field535, class203.field2849, var27);
            class49.field553 = class79.method1589(GameEngine.field3741, 1, 2048);
            class220.field2985 = new class262();
            class49.field553.method5718(class220.field2985);
            class40.field416 = new class119(22050, class293.field3657);
            class39.field387 = "Prepared sound engine";
            class39.field375 = 35;
            client.field2183 = 50;
            class126.field1704 = new class223(class138.spritesIndex, class20.fontsIndex);
         } else {
            int var1;
            if(client.field2183 == 50) {
               class74[] var26 = new class74[]{class74.field842, class74.field841, class74.field838, class74.field837, class74.field845, class74.field840};
               var1 = var26.length;
               class223 var23 = class126.field1704;
               class74[] var24 = new class74[]{class74.field842, class74.field841, class74.field838, class74.field837, class74.field845, class74.field840};
               client.field2205 = var23.method4521(var24);
               if(client.field2205.size() < var1) {
                  class39.field387 = "Loading fonts - " + client.field2205.size() * 100 / var1 + "%";
                  class39.field375 = 40;
               } else {
                  class103.field1149 = (class299)client.field2205.get(class74.field845);
                  class194.field2772 = (class299)client.field2205.get(class74.field837);
                  class172.field2117 = (class299)client.field2205.get(class74.field838);
                  class229.field3061 = client.field2419.vmethod5193();
                  class39.field387 = "Loaded fonts";
                  class39.field375 = 40;
                  client.field2183 = 60;
               }
            } else if(client.field2183 == 60) {
               var21 = MapCacheArchiveNames.method6052(class219.binaryIndex, class138.spritesIndex);
               byte var22 = 11;
               if(var21 < var22) {
                  class39.field387 = "Loading title screen - " + var21 * 100 / var22 + "%";
                  class39.field375 = 50;
               } else {
                  class39.field387 = "Loaded title screen";
                  class39.field375 = 50;
                  class142.method2635(5);
                  client.field2183 = 70;
               }
            } else if(client.field2183 == 70) {
               if(!class202.configsIndex.method4403()) {
                  class39.field387 = "Loading config - " + class202.configsIndex.method95() + "%";
                  class39.field375 = 60;
               } else {
                  class6 var25 = class202.configsIndex;
                  class93.field1012 = var25;
                  class6 var18 = class202.configsIndex;
                  class40.field418 = var18;
                  class174.method3221(class202.configsIndex, WorldMapData.field1851);
                  class32.method535(class202.configsIndex, WorldMapData.field1851, client.field2157);
                  class247.method4956(class202.configsIndex, WorldMapData.field1851);
                  class6 var2 = class202.configsIndex;
                  class20.field228 = var2;
                  class215.method4382(class202.configsIndex, WorldMapData.field1851, client.field2156, class103.field1149);
                  class6 var3 = class202.configsIndex;
                  class6 var4 = class286.field3576;
                  class6 var5 = class193.field2749;
                  class312.field3834 = var3;
                  class312.field3839 = var4;
                  class312.field3831 = var5;
                  class6 var6 = class202.configsIndex;
                  class6 var7 = WorldMapData.field1851;
                  class71.field825 = var6;
                  class95.field1027 = var7;
                  class6 var8 = class202.configsIndex;
                  class72.field832 = var8;
                  class176.method3675(class202.configsIndex);
                  class112.method2110(class233.field3084, WorldMapData.field1851, class138.spritesIndex, class20.fontsIndex);
                  class80.method1600(class202.configsIndex);
                  class6 var9 = class202.configsIndex;
                  class269.field3469 = var9;
                  class6 var10 = class202.configsIndex;
                  class25.field263 = var10;
                  class6 var11 = class202.configsIndex;
                  class56.field704 = var11;
                  class6 var12 = class202.configsIndex;
                  class104.field1156 = var12;
                  class267.field3459 = new class90();
                  class6 var13 = class202.configsIndex;
                  class6 var14 = class138.spritesIndex;
                  class6 var15 = class20.fontsIndex;
                  class224.field3016 = var13;
                  class224.field3033 = var14;
                  class224.field3011 = var15;
                  class18.method382(class202.configsIndex, class138.spritesIndex);
                  class84.method1620(class202.configsIndex, class138.spritesIndex);
                  class39.field387 = "Loaded config";
                  class39.field375 = 60;
                  client.field2183 = 80;
               }
            } else if(client.field2183 == 80) {
               var21 = 0;
               if(class307.field3798 == null) {
                  class307.field3798 = class91.method1715(class138.spritesIndex, class133.field1739.field867, 0, (byte)-76);
               } else {
                  ++var21;
               }

               if(class85.field922 == null) {
                  class85.field922 = class91.method1715(class138.spritesIndex, class133.field1739.field863, 0, (byte)-60);
               } else {
                  ++var21;
               }

               if(class64.field748 == null) {
                  class64.field748 = class159.method2957(class138.spritesIndex, class133.field1739.field864, 0);
               } else {
                  ++var21;
               }

               if(class86.field928 == null) {
                  class86.field928 = class103.method1851(class138.spritesIndex, class133.field1739.field870, 0);
               } else {
                  ++var21;
               }

               if(class88.field962 == null) {
                  class88.field962 = class103.method1851(class138.spritesIndex, class133.field1739.field866, 0);
               } else {
                  ++var21;
               }

               if(class170.field2023 == null) {
                  class170.field2023 = class103.method1851(class138.spritesIndex, class133.field1739.field862, 0);
               } else {
                  ++var21;
               }

               if(class222.field3000 == null) {
                  class222.field3000 = class103.method1851(class138.spritesIndex, class133.field1739.field868, 0);
               } else {
                  ++var21;
               }

               if(class184.field2505 == null) {
                  class184.field2505 = class103.method1851(class138.spritesIndex, class133.field1739.field869, 0);
               } else {
                  ++var21;
               }

               if(class272.field3484 == null) {
                  class272.field3484 = class103.method1851(class138.spritesIndex, class133.field1739.field865, 0);
               } else {
                  ++var21;
               }

               if(class270.field3476 == null) {
                  class270.field3476 = class159.method2957(class138.spritesIndex, class133.field1739.field871, 0);
               } else {
                  ++var21;
               }

               if(class275.field3501 == null) {
                  class275.field3501 = class159.method2957(class138.spritesIndex, class133.field1739.field872, 0);
               } else {
                  ++var21;
               }

               if(var21 < 11) {
                  class39.field387 = "Loading sprites - " + var21 * 100 / 12 + "%";
                  class39.field375 = 70;
               } else {
                  class190.field2728 = class275.field3501;
                  class85.field922.method207();
                  var1 = (int)(Math.random() * 21.0D) - 10;
                  int var17 = (int)(Math.random() * 21.0D) - 10;
                  int var19 = (int)(Math.random() * 21.0D) - 10;
                  int var20 = (int)(Math.random() * 41.0D) - 20;
                  class64.field748[0].method5982(var20 + var1, var17 + var20, var20 + var19);
                  class39.field387 = "Loaded sprites";
                  class39.field375 = 70;
                  client.field2183 = 90;
               }
            } else if(client.field2183 == 90) {
               if(!class94.field1014.method4403()) {
                  class39.field387 = "Loading textures - " + "0%";
                  class39.field375 = 90;
               } else {
                  class176.field2433 = new class266(class94.field1014, class138.spritesIndex, 20, 0.8D, client.field2157?64:128);
                  class211.method4251(class176.field2433);
                  class211.method4252(0.8D);
                  client.field2183 = 100;
               }
            } else if(client.field2183 == 100) {
               var21 = class176.field2433.method5290();
               if(var21 < 100) {
                  class39.field387 = "Loading textures - " + var21 + "%";
                  class39.field375 = 90;
               } else {
                  class39.field387 = "Loaded textures";
                  class39.field375 = 90;
                  client.field2183 = 110;
               }
            } else if(client.field2183 == 110) {
               WorldMapManager.field2882 = new class277();
               GameEngine.field3741.method2138(WorldMapManager.field2882, 10);
               class39.field387 = "Loaded input handler";
               class39.field375 = 92;
               client.field2183 = 120;
            } else if(client.field2183 == 120) {
               if(!class219.binaryIndex.method4419("huffman", "")) {
                  class39.field387 = "Loading wordpack - " + 0 + "%";
                  class39.field375 = 94;
               } else {
                  class250 var16 = new class250(class219.binaryIndex.takeRecordByNames("huffman", ""));
                  class12.method196(var16);
                  class39.field387 = "Loaded wordpack";
                  class39.field375 = 94;
                  client.field2183 = 130;
               }
            } else if(client.field2183 == 130) {
               if(!class233.field3084.method4403()) {
                  class39.field387 = "Loading interfaces - " + class233.field3084.method95() * 4 / 5 + "%";
                  class39.field375 = 96;
               } else if(!class88.clientScriptIndex.method4403()) {
                  class39.field387 = "Loading interfaces - " + (80 + class88.clientScriptIndex.method95() / 6) + "%";
                  class39.field375 = 96;
               } else if(!class20.fontsIndex.method4403()) {
                  class39.field387 = "Loading interfaces - " + (96 + class20.fontsIndex.method95() / 50) + "%";
                  class39.field375 = 96;
               } else {
                  class39.field387 = "Loaded interfaces";
                  class39.field375 = 98;
                  client.field2183 = 140;
               }
            } else if(client.field2183 == 140) {
               class39.field375 = 100;
               if(!class174.worldMapIndex.method4420(MapCacheArchiveNames.field3808.name)) {
                  class39.field387 = "Loading world map - " + class174.worldMapIndex.method4413(MapCacheArchiveNames.field3808.name) / 10 + "%";
               } else {
                  if(class199.field2812 == null) {
                     class199.field2812 = new WorldMap();
                     class199.field2812.method5488(class174.worldMapIndex, class172.field2117, client.field2205, class64.field748);
                  }

                  var21 = class199.field2812.method5489();
                  if(var21 < 100) {
                     class39.field387 = "Loading world map - " + (var21 * 9 / 10 + 10) + "%";
                  } else {
                     class39.field387 = "Loaded world map";
                     client.field2183 = 150;
                  }
               }
            } else if(client.field2183 == 150) {
               class142.method2635(10);
            }
         }
      } else {
         byte var0 = 0;
         var21 = var0 + class286.field3576.method111() * 4 / 100;
         var21 += class193.field2749.method111() * 4 / 100;
         var21 += class202.configsIndex.method111() * 2 / 100;
         var21 += class233.field3084.method111() * 2 / 100;
         var21 += class203.field2849.method111() * 6 / 100;
         var21 += class152.mapsIndex.method111() * 4 / 100;
         var21 += client.field2428.method111() * 2 / 100;
         var21 += WorldMapData.field1851.method111() * 57 / 100;
         var21 += class138.spritesIndex.method111() * 2 / 100;
         var21 += class94.field1014.method111() * 2 / 100;
         var21 += class219.binaryIndex.method111() * 2 / 100;
         var21 += class226.field3043.method111() * 2 / 100;
         var21 += class88.clientScriptIndex.method111() * 2 / 100;
         var21 += class20.fontsIndex.method111() * 2 / 100;
         var21 += SomeWorldMapObject.field535.method111() * 2 / 100;
         var21 += class119.field1640.method111() * 2 / 100;
         var21 += class174.worldMapIndex.method111() * 2 / 100;
         var21 += class99.field1132.method96() && class99.field1132.method4403()?1:0;
         if(var21 != 100) {
            if(var21 != 0) {
               class39.field387 = "Checking for updates - " + var21 + "%";
            }

            class39.field375 = 30;
         } else {
            class295.method5780(class286.field3576, "Animations");
            class295.method5780(class193.field2749, "Skeletons");
            class295.method5780(class203.field2849, "Sound FX");
            class295.method5780(class152.mapsIndex, "Maps");
            class295.method5780(client.field2428, "Music Tracks");
            class295.method5780(WorldMapData.field1851, "Models");
            class295.method5780(class138.spritesIndex, "Sprites");
            class295.method5780(class226.field3043, "Music Jingles");
            class295.method5780(SomeWorldMapObject.field535, "Music Samples");
            class295.method5780(class119.field1640, "Music Patches");
            class295.method5780(class174.worldMapIndex, "World Map");
            class133.field1739 = new class78();
            class133.field1739.method1584(class99.field1132);
            class39.field387 = "Loaded update list";
            class39.field375 = 30;
            client.field2183 = 45;
         }
      }
   }
}
