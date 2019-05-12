package net.runelite.standalone;

import javax.imageio.ImageIO;
import net.runelite.client.callback.Hooks;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
public class class234 {
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1520073519
   )
   static int field429;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   public static Js5Index componentIndex;

   static {
      ImageIO.setUseCache(false);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Liz;Liz;I)V",
      garbageValue = "-731572457"
   )
   public static void method4541(Js5Index var0, Js5Index var1) {
      Spotanim.SpotAnimationDefinition_indexCache = var0;
      Spotanim.SpotAnimationDefinition_modelIndexCache = var1;
   }

   @ObfuscatedName("ge")
   @ObfuscatedSignature(
      signature = "(IIIIS)V",
      garbageValue = "2179"
   )
   static final void method4540(int var0, int var1, int var2, int var3) {
      ++Client.field907;
      if(class71.localPlayer.x * -1234429701 >> 7 == Client.destinationX && class71.localPlayer.y >> 7 == Client.destinationY) {
         Client.destinationX = 0;
      }

      if(Client.field768) {
         class82.method1102(class71.localPlayer, false);
      }

      if(Client.field776 >= 0 && Client.players[Client.field776] != null) {
         class82.method1102(Client.players[Client.field776], false);
      }

      TradingPost.method1608(true);
      WorldMapType3.method600();
      TradingPost.method1608(false);
      class308.method6155();

      for(SpotAnimation var4 = (SpotAnimation)Client.spotAnimationDeque.method3930(); var4 != null; var4 = (SpotAnimation)Client.spotAnimationDeque.method3924()) {
         if(var4.level == ServerProt.level && !var4.finished) {
            if(Client.gameCycle >= var4.startCycle) {
               var4.method1572(Client.field710);
               if(var4.finished) {
                  var4.method432();
               } else {
                  class312.sceneManager.method3754(var4.level, var4.x, var4.y, var4.height, 60, var4, 0, -1L, false);
               }
            }
         } else {
            var4.method432();
         }
      }

      class7.method111(var0, var1, var2, var3, true);
      var0 = Client.Viewport_xOffset;
      var1 = Client.Viewport_yOffset;
      var2 = Client.viewportWidth;
      var3 = Client.viewportHeight;
      Rasterizer2D.method684(var0, var1, var0 + var2, var3 + var1);
      Graphics3D.method2087();
      int var5;
      int var6;
      int var7;
      int var8;
      int var11;
      int var28;
      if(!Client.field893) {
         var28 = Client.cameraPitchTarget;
         if(Client.field735 / 256 > var28) {
            var28 = Client.field735 / 256;
         }

         if(Client.field894[4] && Client.field896[4] + 128 > var28) {
            var28 = Client.field896[4] + 128;
         }

         var5 = Client.mapAngle & 2047;
         var6 = Client.field725;
         var7 = class252.field2538;
         var8 = class69.field135;
         var11 = var28 * 3 + 600;
         GameCanvas.method4865(var6, var7, var8, var28, var5, var11, var3);
      }

      int var9;
      int var10;
      int var12;
      int var13;
      int var14;
      if(!Client.field893) {
         if(class312.options.hideRoofs) {
            var5 = ServerProt.level;
         } else {
            label601: {
               var6 = 3;
               if(GZipDecompressor.cameraPitch < 310) {
                  if(Client.camModeType == 1) {
                     var7 = Client.field725 >> 7;
                     var8 = class69.field135 >> 7;
                  } else {
                     var7 = class71.localPlayer.x * -1234429701 >> 7;
                     var8 = class71.localPlayer.y >> 7;
                  }

                  var9 = class258.cameraX >> 7;
                  var10 = FontName.cameraY >> 7;
                  if(var9 < 0 || var10 < 0 || var9 >= 104 || var10 >= 104) {
                     var5 = ServerProt.level;
                     break label601;
                  }

                  if(var7 < 0 || var8 < 0 || var7 >= 104 || var8 >= 104) {
                     var5 = ServerProt.level;
                     break label601;
                  }

                  if((class91.tileSettings[ServerProt.level][var9][var10] & 4) != 0) {
                     var6 = ServerProt.level;
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

                  if(var11 > var12) {
                     var13 = var12 * 65536 / var11;
                     var14 = 32768;

                     while(var7 != var9) {
                        if(var9 < var7) {
                           ++var9;
                        } else if(var9 > var7) {
                           --var9;
                        }

                        if((class91.tileSettings[ServerProt.level][var9][var10] & 4) != 0) {
                           var6 = ServerProt.level;
                        }

                        var14 += var13;
                        if(var14 >= 65536) {
                           var14 -= 65536;
                           if(var10 < var8) {
                              ++var10;
                           } else if(var10 > var8) {
                              --var10;
                           }

                           if((class91.tileSettings[ServerProt.level][var9][var10] & 4) != 0) {
                              var6 = ServerProt.level;
                           }
                        }
                     }
                  } else if(var12 > 0) {
                     var13 = var11 * 65536 / var12;
                     var14 = 32768;

                     while(var8 != var10) {
                        if(var10 < var8) {
                           ++var10;
                        } else if(var10 > var8) {
                           --var10;
                        }

                        if((class91.tileSettings[ServerProt.level][var9][var10] & 4) != 0) {
                           var6 = ServerProt.level;
                        }

                        var14 += var13;
                        if(var14 >= 65536) {
                           var14 -= 65536;
                           if(var9 < var7) {
                              ++var9;
                           } else if(var9 > var7) {
                              --var9;
                           }

                           if((class91.tileSettings[ServerProt.level][var9][var10] & 4) != 0) {
                              var6 = ServerProt.level;
                           }
                        }
                     }
                  }
               }

               if(class71.localPlayer.x * -1234429701 >= 0 && class71.localPlayer.y >= 0 && class71.localPlayer.x * -1234429701 < 13312 && class71.localPlayer.y < 13312) {
                  if((class91.tileSettings[ServerProt.level][class71.localPlayer.x * -1234429701 >> 7][class71.localPlayer.y >> 7] & 4) != 0) {
                     var6 = ServerProt.level;
                  }

                  var5 = var6;
               } else {
                  var5 = ServerProt.level;
               }
            }
         }

         var28 = var5;
      } else {
         if(class312.options.hideRoofs) {
            var5 = ServerProt.level;
         } else {
            var6 = TcpConnectionMessage.method5618(class258.cameraX, FontName.cameraY, ServerProt.level);
            if(var6 - class2.cameraZ < 800 && (class91.tileSettings[ServerProt.level][class258.cameraX >> 7][FontName.cameraY >> 7] & 4) != 0) {
               var5 = ServerProt.level;
            } else {
               var5 = 3;
            }
         }

         var28 = var5;
      }

      var5 = class258.cameraX;
      var6 = class2.cameraZ;
      var7 = FontName.cameraY;
      var8 = GZipDecompressor.cameraPitch;
      var9 = class142.cameraYaw;

      for(var10 = 0; var10 < 5; ++var10) {
         if(Client.field894[var10]) {
            var11 = (int)(Math.random() * (double)(Client.field895[var10] * 2 + 1) - (double)Client.field895[var10] + Math.sin((double)Client.field897[var10] / 100.0D * (double)Client.field761[var10]) * (double)Client.field896[var10]);
            if(var10 == 0) {
               class258.cameraX += var11;
            }

            if(var10 == 1) {
               class2.cameraZ += var11;
            }

            if(var10 == 2) {
               FontName.cameraY += var11;
            }

            if(var10 == 3) {
               class142.cameraYaw = var11 + class142.cameraYaw & 2047;
            }

            if(var10 == 4) {
               GZipDecompressor.cameraPitch += var11;
               Client.onCameraPitchChanged(-1);
               if(GZipDecompressor.cameraPitch < 128) {
                  GZipDecompressor.cameraPitch = 128;
                  Client.onCameraPitchChanged(-1);
               }

               if(GZipDecompressor.cameraPitch > 383) {
                  GZipDecompressor.cameraPitch = 383;
                  Client.onCameraPitchChanged(-1);
               }
            }
         }
      }

      var10 = MouseInput.mouseLastX;
      var11 = MouseInput.mouseLastY;
      if(MouseInput.mouseLastButton != 0) {
         var10 = MouseInput.mouseLastPressedX;
         var11 = MouseInput.mouseLastPressedY;
      }

      if(var10 >= var0 && var10 < var0 + var2 && var11 >= var1 && var11 < var3 + var1) {
         var12 = var10 - var0;
         var13 = var11 - var1;
         class47.Viewport_mouseX = var12;
         class47.Viewport_mouseY = var13;
         class47.Viewport_containsMouse = true;
         class47.Viewport_entityCountAtMouse = 0;
         class47.Viewport_false0 = false;
      } else {
         class47.Viewport_containsMouse = false;
         class47.Viewport_entityCountAtMouse = 0;
      }

      FontName.method513();
      Hooks.clearColorBuffer(var0, var1, var2, var3, 0);
      FontName.method513();
      var12 = Graphics3D.Rasterizer3D_zoom;
      Graphics3D.Rasterizer3D_zoom = Client.scale;
      class312.sceneManager.method3704(class258.cameraX, class2.cameraZ, FontName.cameraY, GZipDecompressor.cameraPitch, class142.cameraYaw, var28);
      Graphics3D.Rasterizer3D_zoom = var12;
      FontName.method513();
      class312.sceneManager.method3635();
      Client.overheadTextCount = 0;
      boolean var31 = false;
      var14 = -1;
      int var15 = -1;
      int var16 = PlayerList.highResolutionPlayerCount;
      int[] var17 = PlayerList.highResolutionPlayerIndexes;

      int var18;
      for(var18 = 0; var18 < var16 + Client.highResolutionNpcCount; ++var18) {
         Object var19;
         if(var18 < var16) {
            var19 = Client.players[var17[var18]];
            if(var17[var18] == Client.field776) {
               var31 = true;
               var14 = var18;
               continue;
            }

            if(var19 == class71.localPlayer) {
               var15 = var18;
               continue;
            }
         } else {
            var19 = Client.npcs[Client.highResolutionNpcIndexes[var18 - var16]];
         }

         class87.method1134((PathingEntity)var19, var18, var0, var1, var2, var3, 1469155852);
      }

      if(Client.field768 && var15 != -1) {
         class87.method1134(class71.localPlayer, var15, var0, var1, var2, var3, -1100755272);
      }

      if(var31) {
         class87.method1134(Client.players[Client.field776], var14, var0, var1, var2, var3, -1916527288);
      }

      for(var18 = 0; var18 < Client.overheadTextCount; ++var18) {
         int var29 = Client.overheadTextsX[var18];
         int var20 = Client.overheadTextsY[var18];
         int var21 = Client.overheadTextsOffsetX[var18];
         int var22 = Client.overheadTextsOffsetY[var18];
         boolean var23 = true;

         while(var23) {
            var23 = false;

            for(int var24 = 0; var24 < var18; ++var24) {
               if(var20 + 2 > Client.overheadTextsY[var24] - Client.overheadTextsOffsetY[var24] && var20 - var22 < Client.overheadTextsY[var24] + 2 && var29 - var21 < Client.overheadTextsOffsetX[var24] + Client.overheadTextsX[var24] && var29 + var21 > Client.overheadTextsX[var24] - Client.overheadTextsOffsetX[var24] && Client.overheadTextsY[var24] - Client.overheadTextsOffsetY[var24] < var20) {
                  var20 = Client.overheadTextsY[var24] - Client.overheadTextsOffsetY[var24];
                  var23 = true;
               }
            }
         }

         Client.screenX = Client.overheadTextsX[var18];
         Client.screenY = Client.overheadTextsY[var18] = var20;
         String var30 = Client.overheadTexts[var18];
         if(Client.field813 == 0) {
            int var25 = 16776960;
            if(Client.field742[var18] < 6) {
               var25 = Client.field713[Client.field742[var18]];
            }

            if(Client.field742[var18] == 6) {
               var25 = Client.field907 % 20 < 10?16711680:16776960;
            }

            if(Client.field742[var18] == 7) {
               var25 = Client.field907 % 20 < 10?255:'\uffff';
            }

            if(Client.field742[var18] == 8) {
               var25 = Client.field907 % 20 < 10?'뀀':8454016;
            }

            int var26;
            if(Client.field742[var18] == 9) {
               var26 = 150 - Client.overheadTextsCyclesRemaining[var18];
               if(var26 < 50) {
                  var25 = var26 * 1280 + 16711680;
               } else if(var26 < 100) {
                  var25 = 16776960 - (var26 - 50) * 327680;
               } else if(var26 < 150) {
                  var25 = (var26 - 100) * 5 + 65280;
               }
            }

            if(Client.field742[var18] == 10) {
               var26 = 150 - Client.overheadTextsCyclesRemaining[var18];
               if(var26 < 50) {
                  var25 = var26 * 5 + 16711680;
               } else if(var26 < 100) {
                  var25 = 16711935 - (var26 - 50) * 327680;
               } else if(var26 < 150) {
                  var25 = (var26 - 100) * 327680 + 255 - (var26 - 100) * 5;
               }
            }

            if(Client.field742[var18] == 11) {
               var26 = 150 - Client.overheadTextsCyclesRemaining[var18];
               if(var26 < 50) {
                  var25 = 16777215 - var26 * 327685;
               } else if(var26 < 100) {
                  var25 = (var26 - 50) * 327685 + 65280;
               } else if(var26 < 150) {
                  var25 = 16777215 - (var26 - 100) * 327680;
               }
            }

            if(Client.field743[var18] == 0) {
               class191.fontBold12.method6222(var30, var0 + Client.screenX, Client.screenY + var1, var25, 0);
            }

            if(Client.field743[var18] == 1) {
               class191.fontBold12.method6170(var30, var0 + Client.screenX, Client.screenY + var1, var25, 0, Client.field907);
            }

            if(Client.field743[var18] == 2) {
               class191.fontBold12.method6171(var30, var0 + Client.screenX, Client.screenY + var1, var25, 0, Client.field907);
            }

            if(Client.field743[var18] == 3) {
               class191.fontBold12.method6172(var30, var0 + Client.screenX, Client.screenY + var1, var25, 0, Client.field907, 150 - Client.overheadTextsCyclesRemaining[var18]);
            }

            if(Client.field743[var18] == 4) {
               var26 = (150 - Client.overheadTextsCyclesRemaining[var18]) * (class191.fontBold12.method6160(var30) + 100) / 150;
               Rasterizer2D.method685(var0 + Client.screenX - 50, var1, var0 + Client.screenX + 50, var3 + var1);
               class191.fontBold12.method6165(var30, var0 + Client.screenX + 50 - var26, Client.screenY + var1, var25, 0);
               Rasterizer2D.method684(var0, var1, var0 + var2, var3 + var1);
            }

            if(Client.field743[var18] == 5) {
               var26 = 150 - Client.overheadTextsCyclesRemaining[var18];
               int var27 = 0;
               if(var26 < 25) {
                  var27 = var26 - 25;
               } else if(var26 > 125) {
                  var27 = var26 - 125;
               }

               Rasterizer2D.method685(var0, Client.screenY + var1 - class191.fontBold12.verticalSpace - 1, var0 + var2, Client.screenY + var1 + 5);
               class191.fontBold12.method6222(var30, var0 + Client.screenX, var27 + Client.screenY + var1, var25, 0);
               Rasterizer2D.method684(var0, var1, var0 + var2, var3 + var1);
            }
         } else {
            class191.fontBold12.method6222(var30, var0 + Client.screenX, Client.screenY + var1, 16776960, 0);
         }
      }

      class64.method949(var0, var1);
      ((TextureProvider)Graphics3D.textureLoader).method1155(Client.field710);
      ClientOptions.method1092(var0, var1, var2, var3);
      class258.cameraX = var5;
      class2.cameraZ = var6;
      FontName.cameraY = var7;
      GZipDecompressor.cameraPitch = var8;
      Client.onCameraPitchChanged(-1);
      class142.cameraYaw = var9;
      if(Client.field663) {
         byte var32 = 0;
         var14 = var32 + class321.NetCache_pendingPriorityResponsesCount + class321.NetCache_pendingPriorityWritesCount;
         if(var14 == 0) {
            Client.field663 = false;
         }
      }

      if(Client.field663) {
         Hooks.clearColorBuffer(var0, var1, var2, var3, 0);
         Varcs.method351("Loading - please wait.", false);
      }

   }
}
