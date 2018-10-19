package net.runelite.client.standalone;

import java.io.IOException;
import java.net.Socket;

import net.runelite.api.Constants;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
public class class330 {
   @ObfuscatedName("by")
   @ObfuscatedSignature(
      signature = "[Llp;"
   )
   static class26[] field3691;
   @ObfuscatedName("bq")
   static String field3693;
   @ObfuscatedName("dr")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class108 field3690;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -301221279
   )
   public static int field3689;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/net/Socket;III)Lfo;",
      garbageValue = "2028894137"
   )
   public static class314 method5935(Socket var0, int var1, int var2) throws IOException {
      return new class59(var0, var1, var2);
   }

   @ObfuscatedName("ga")
   @ObfuscatedSignature(
      signature = "(Lfu;B)V",
      garbageValue = "1"
   )
   static final void method5928(class251 var0) {
      class214 var1 = client.field3963.field1156;
      int var3;
      int var5;
      int var6;
      int var7;
      int var8;
      int var37;
      int var38;
      if(class251.LOC_DEL == var0) {
         var37 = var1.readUnsigned128Byte();
         var3 = var37 >> 2;
         var38 = var37 & 3;
         var5 = client.field3978[var3];
         var6 = var1.readUnsigned128Byte();
         var7 = (var6 >> 4 & 7) + class106.field992;
         var8 = (var6 & 7) + class232.field2288;
         if(var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
            class102.method1757(var1.readUnsignedByte(), var7, var8, var5, -1, var3, var38, 0, -1);
         }

      } else {
         int var9;
         int var10;
         int var12;
         byte var13;
         int var14;
         if(class251.ATTACHED_PLAYER_OBJECT == var0) {
            byte var2 = var1.readByteC();//max x
            var3 = var1.readUnsignedShortLE128();//endtime
            byte var4 = var1.readByteC();//max y
            var5 = var1.readUnsignedShort128();//id
            var6 = var1.readUnsignedShort();//start time
            var7 = var1.readUnsignedByte128();//type rot
            var8 = var7 >> 2;
            var9 = var7 & 3;
            var10 = client.field3978[var8];
            byte var11 = var1.readByte128();//min y
            var12 = var1.readUnsignedShortLE();//index
            var13 = var1.readByteC();//minx
            var14 = var1.readUnsignedByteC();//srchash
            int var15 = (var14 >> 4 & 7) + class106.field992;
            int var16 = (var14 & 7) + class232.field2288;
            class63 var17;
            if(var12 == client.field3765) {
               var17 = class5.field43;
            } else {
               var17 = client.field3848[var12];
            }

            if(var17 != null) {
               class172 var18 = class152.method2696(var5);
               int var19;
               int var20;
               if(var9 != 1 && var9 != 3) {
                  var19 = var18.field1592;
                  var20 = var18.field1635;
               } else {
                  var19 = var18.field1635;
                  var20 = var18.field1592;
               }

               int var21 = var15 + (var19 >> 1);
               int var22 = var15 + (var19 + 1 >> 1);
               int var23 = var16 + (var20 >> 1);
               int var24 = var16 + (var20 + 1 >> 1);
               int[][] var25 = class31.field249[class315.plane];
               int var26 = var25[var22][var24] + var25[var22][var23] + var25[var21][var23] + var25[var21][var24] >> 2;
               int var27 = (var15 << 7) + (var19 << 6);
               int var28 = (var16 << 7) + (var20 << 6);
               class200 var29 = var18.method2895(var8, var9, var25, var27, var26, var28);
               if(var29 != null) {
                  class102.method1757(class315.plane, var15, var16, var10, -1, 0, 0, var6 + 1, var3 + 1);
                  var17.field584 = var6 + client.field3744;
                  var17.field585 = var3 + client.field3744;
                  var17.field589 = var29;
                  var17.field586 = var15 * 128 + var19 * 64;
                  var17.field596 = var16 * 128 + var20 * 64;
                  var17.field594 = var26;
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

                  var17.field590 = var15 + var2;
                  var17.field592 = var13 + var15;
                  var17.field603 = var11 + var16;
                  var17.field593 = var16 + var4;
               }
            }
         }

         if(class251.OBJ_UPDATE == var0) {
            var37 = var1.readUnsignedShortLE();//id
            var3 = var1.readUnsignedShortLE128();//quanity
            var38 = var1.readUnsignedShortLE();//old
            var5 = var1.readUnsignedByte128();
            var6 = (var5 >> 4 & 7) + class106.field992;
            var7 = (var5 & 7) + class232.field2288;
            if(var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
               class320 var42 = client.field3761[class315.plane][var6][var7];
               if(var42 != null) {
                  for(class161 var32 = (class161)var42.method5604(); var32 != null; var32 = (class161)var42.method5606()) {
                     if((var37 & 32767) == var32.field1504 && var38 == var32.field1503) {
                        var32.quantityChanged(var3);
                        var32.field1503 = var3;
                        break;
                     }
                  }

                  class57.method1018(var6, var7);
               }
            }

         } else {
            int var39;
            if(class251.MAP_PROJANIM == var0) {
               var37 = var1.readUnsigned128Byte() * 4;//end
               var3 = var1.readUnsignedShort();//speed
               var38 = var1.readUnsignedShort128();//id
               var5 = var1.readUnsigned128Byte() * 4;//start
               var6 = var1.readShortLE();//index
               var7 = var1.readUnsignedByte();//angle
               var8 = var1.readUnsigned128Byte();//offset/size
               var9 = var1.readUnsignedShortLE();//delay
               var10 = var1.readUnsignedByte128();//srchash
               var39 = (var10 >> 4 & 7) + class106.field992;
               var12 = (var10 & 7) + class232.field2288;
               var13 = var1.readByte128();//y
               byte var40 = var1.readByteC();//x
               var14 = var40 + var39;
               int var41 = var13 + var12;
               if(var39 >= 0 && var12 >= 0 && var39 < 104 && var12 < 104 && var14 >= 0 && var41 >= 0 && var14 < 104 && var41 < 104 && var38 != 65535) {
                  var39 = var39 * 128 + 64;
                  var12 = var12 * 128 + 64;
                  var14 = var14 * 128 + 64;
                  var41 = var41 * 128 + 64;
                  class203 var33 = new class203(var38, class315.plane, var39, var12, class7.method85(var39, var12, class315.plane) - var5, var9 + client.field3744, var3 + client.field3744, var7, var8, var6, var37);
                  var33.method3473(var14, var41, class7.method85(var14, var41, class315.plane) - var37, var9 + client.field3744);
                  client.field3862.method5600(var33);
               }

            } else {
               if(class251.AREA_SOUND == var0) {
                  var37 = var1.readUnsignedByte();
                  var3 = (var37 >> 4 & 7) + class106.field992;
                  var38 = (var37 & 7) + class232.field2288;
                  var5 = var1.readUnsigned128Byte();
                  var6 = var1.readUnsignedByte128();
                  var7 = var6 >> 4 & 15;
                  var8 = var6 & 7;
                  var9 = var1.readUnsignedShortLE128();
                  if(var3 >= 0 && var38 >= 0 && var3 < 104 && var38 < 104) {
                     var10 = var7 + 1;
                     if(class5.field43.field1288[0] >= var3 - var10 && class5.field43.field1288[0] <= var3 + var10 && class5.field43.field1315[0] >= var38 - var10 && class5.field43.field1315[0] <= var38 + var10 && client.field3969 != 0 && var8 > 0 && client.field3970 < 50) {
                        client.field3873[client.field3970] = var9;//id
                        client.field3924[client.field3970] = var8;
                        client.field3973[client.field3970] = var5;
                        client.field3767[client.field3970] = null;
                        client.field4008[client.field3970] = var7 + (var38 << 8) + (var3 << 16);
                        ++client.field3970;
                     }
                  }
               }

               if(class251.LOC_ANIM == var0) {
                  var37 = var1.readUnsigned128Byte();
                  var3 = var37 >> 2;
                  var38 = var37 & 3;
                  var5 = client.field3978[var3];
                  var6 = var1.readUnsignedByteC();
                  var7 = (var6 >> 4 & 7) + class106.field992;
                  var8 = (var6 & 7) + class232.field2288;
                  var9 = var1.readUnsignedShort();
                  if(var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) {
                     if(var5 == 0) {
                        class12 var34 = class258.field2566.method5353(class315.plane, var7, var8);
                        if(var34 != null) {
                           var39 = class233.method4163(var34.field105);
                           if(var3 == 2) {
                              var34.field109 = new class234(var39, 2, var38 + 4, class315.plane, var7, var8, var9, false, var34.field109);
                              var34.field111 = new class234(var39, 2, var38 + 1 & 3, class315.plane, var7, var8, var9, false, var34.field111);
                           } else {
                              var34.field109 = new class234(var39, var3, var38, class315.plane, var7, var8, var9, false, var34.field109);
                           }
                        }
                     }

                     if(var5 == 1) {
                        class225 var43 = class258.field2566.method5354(class315.plane, var7, var8);
                        if(var43 != null) {
                           var39 = class233.method4163(var43.field2202);
                           if(var3 != 4 && var3 != 5) {
                              if(var3 == 6) {
                                 var43.field2200 = new class234(var39, 4, var38 + 4, class315.plane, var7, var8, var9, false, var43.field2200);
                              } else if(var3 == 7) {
                                 var43.field2200 = new class234(var39, 4, (var38 + 2 & 3) + 4, class315.plane, var7, var8, var9, false, var43.field2200);
                              } else if(var3 == 8) {
                                 var43.field2200 = new class234(var39, 4, var38 + 4, class315.plane, var7, var8, var9, false, var43.field2200);
                                 var43.field2193 = new class234(var39, 4, (var38 + 2 & 3) + 4, class315.plane, var7, var8, var9, false, var43.field2193);
                              }
                           } else {
                              var43.field2200 = new class234(var39, 4, var38, class315.plane, var7, var8, var9, false, var43.field2200);
                           }
                        }
                     }

                     if(var5 == 2) {
                        class299 var44 = class258.field2566.method5476(class315.plane, var7, var8);
                        if(var3 == 11) {
                           var3 = 10;
                        }

                        if(var44 != null) {
                           var44.field3220 = new class234(class233.method4163(var44.field3219), var3, var38, class315.plane, var7, var8, var9, false, var44.field3220);
                        }
                     }

                     if(var5 == 3) {
                        class195 var45 = class258.field2566.method5356(class315.plane, var7, var8);
                        if(var45 != null) {
                           var45.field1849 = new class234(class233.method4163(var45.field1854), 22, var38, class315.plane, var7, var8, var9, false, var45.field1849);
                        }
                     }
                  }

               } else if(class251.SPOTANIM_SPECIFIC == var0) {
                  var37 = var1.readUnsignedShort();
                  var3 = var1.readUnsignedByte128();
                  var38 = var1.readUnsignedShort128();
                  var5 = var1.readUnsignedByte();
                  var6 = (var5 >> 4 & 7) + class106.field992;
                  var7 = (var5 & 7) + class232.field2288;
                  if(var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                     var6 = var6 * 128 + 64;
                     var7 = var7 * 128 + 64;
                     class130 var31 = new class130(var37, class315.plane, var6, var7, class7.method85(var6, var7, class315.plane) - var3, var38, client.field3744);
                     client.field3863.method5600(var31);
                  }

               } else {
                  class161 var36;
                  if(class251.OBJ_DEL != var0) {
                     if(class251.OBJ_ADD == var0) {
                        var37 = var1.readUnsignedShort128();
                        var3 = var1.readUnsignedShortLE128();
                        var38 = var1.readUnsignedByte128();
                        var5 = (var38 >> 4 & 7) + class106.field992;
                        var6 = (var38 & 7) + class232.field2288;
                        if(var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                           var36 = new class161();
                           var36.field1504 = var3;
                           var36.quantityChanged(var37);
                           var36.field1503 = var37;
                           if(client.field3761[class315.plane][var5][var6] == null) {
                              client.field3761[class315.plane][var5][var6] = new class320();
                           }

                           client.field3761[class315.plane][var5][var6].method5600(var36);
                           class57.method1018(var5, var6);
                        }

                     } else if(class251.LOC_ADD == var0) {
                        var37 = var1.readUnsignedByte128();
                        var3 = (var37 >> 4 & 7) + class106.field992;
                        var38 = (var37 & 7) + class232.field2288;
                        var5 = var1.readUnsigned128Byte();
                        var6 = var5 >> 2;
                        var7 = var5 & 3;
                        var8 = client.field3978[var6];
                        var9 = var1.readUnsignedShort128();
                        if(var3 >= 0 && var38 >= 0 && var3 < 104 && var38 < 104) {
                           class102.method1757(var1.readUnsignedByte(), var3, var38, var8, var9, var6, var7, 0, -1);
                        }

                     }
                  } else {
                     var37 = var1.readUnsignedByte128();
                     var3 = (var37 >> 4 & 7) + class106.field992;
                     var38 = (var37 & 7) + class232.field2288;
                     var5 = var1.readUnsignedShortLE128();
                     if(var3 >= 0 && var38 >= 0 && var3 < 104 && var38 < 104) {
                        class320 var35 = client.field3761[class315.plane][var3][var38];
                        if(var35 != null) {
                           for(var36 = (class161)var35.method5604(); var36 != null; var36 = (class161)var35.method5606()) {
                              if((var5 & 32767) == var36.field1504) {
                                 var36.method1186();
                                 break;
                              }
                           }

                           if(var35.method5604() == null) {
                              client.field3761[class315.plane][var3][var38] = null;
                           }

                           class57.method1018(var3, var38);
                        }
                     }

                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Lah;I)V",
      garbageValue = "-1371754657"
   )
   static void method5934(class181 var0) {
      if(class226.field2222 == 1 || !class192.field1840 && class226.field2222 == 4) {
         int var1 = class325.field3501 + 280;
         if(class226.field2220 >= var1 && class226.field2220 <= var1 + 14 && class226.field2224 >= 4 && class226.field2224 <= 18) {
            class127.method2366(0, 0);
            return;
         }

         if(class226.field2220 >= var1 + 15 && class226.field2220 <= var1 + 80 && class226.field2224 >= 4 && class226.field2224 <= 18) {
            class127.method2366(0, 1);
            return;
         }

         int var2 = class325.field3501 + 390;
         if(class226.field2220 >= var2 && class226.field2220 <= var2 + 14 && class226.field2224 >= 4 && class226.field2224 <= 18) {
            class127.method2366(1, 0);
            return;
         }

         if(class226.field2220 >= var2 + 15 && class226.field2220 <= var2 + 80 && class226.field2224 >= 4 && class226.field2224 <= 18) {
            class127.method2366(1, 1);
            return;
         }

         int var3 = class325.field3501 + 500;
         if(class226.field2220 >= var3 && class226.field2220 <= var3 + 14 && class226.field2224 >= 4 && class226.field2224 <= 18) {
            class127.method2366(2, 0);
            return;
         }

         if(class226.field2220 >= var3 + 15 && class226.field2220 <= var3 + 80 && class226.field2224 >= 4 && class226.field2224 <= 18) {
            class127.method2366(2, 1);
            return;
         }

         int var4 = class325.field3501 + 610;
         if(class226.field2220 >= var4 && class226.field2220 <= var4 + 14 && class226.field2224 >= 4 && class226.field2224 <= 18) {
            class127.method2366(3, 0);
            return;
         }

         if(class226.field2220 >= var4 + 15 && class226.field2220 <= var4 + 80 && class226.field2224 >= 4 && class226.field2224 <= 18) {
            class127.method2366(3, 1);
            return;
         }

         if(class226.field2220 >= class325.field3501 + 708 && class226.field2224 >= 4 && class226.field2220 <= class325.field3501 + 708 + 50 && class226.field2224 <= 20) {
            class325.field3497 = false;
            class325.field3500.method376(class325.field3501, 0);
            class275.field3008.method376(class325.field3501 + 382, 0);
            class189.logoSprite.method530(class325.field3501 + 382 - class189.logoSprite.field257 / 2, Constants.LOGO_Y_OFFSET);
            return;
         }

         if(class325.field3498 != -1) {
            class126 var5 = class126.field1187[class325.field3498];
            class86.method1252(var5);
            class325.field3497 = false;
            class325.field3500.method376(class325.field3501, 0);
            class275.field3008.method376(class325.field3501 + 382, 0);
            class189.logoSprite.method530(class325.field3501 + 382 - class189.logoSprite.field257 / 2, Constants.LOGO_Y_OFFSET);
            return;
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(CII)I",
      garbageValue = "571371273"
   )
   static int method5929(char var0, int var1) {
      int var2 = var0 << 4;
      if(Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = (var0 << 4) + 1;
      }

      return var2;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Lle;I)V",
      garbageValue = "-913511761"
   )
   static final void method5932(class32 var0) {
      short var1 = 256;

      int var2;
      for(var2 = 0; var2 < class293.field3166.length; ++var2) {
         class293.field3166[var2] = 0;
      }

      int var3;
      for(var2 = 0; var2 < 5000; ++var2) {
         var3 = (int)(Math.random() * 128.0D * (double)var1);
         class293.field3166[var3] = (int)(Math.random() * 256.0D);
      }

      int var4;
      int var5;
      for(var2 = 0; var2 < 20; ++var2) {
         for(var3 = 1; var3 < var1 - 1; ++var3) {
            for(var4 = 1; var4 < 127; ++var4) {
               var5 = var4 + (var3 << 7);
               class180.field1713[var5] = (class293.field3166[var5 - 128] + class293.field3166[var5 + 1] + class293.field3166[var5 + 128] + class293.field3166[var5 - 1]) / 4;
            }
         }

         int[] var8 = class293.field3166;
         class293.field3166 = class180.field1713;
         class180.field1713 = var8;
      }

      if(var0 != null) {
         var2 = 0;

         for(var3 = 0; var3 < var0.field260; ++var3) {
            for(var4 = 0; var4 < var0.field257; ++var4) {
               if(var0.field258[var2++] != 0) {
                  var5 = var4 + var0.field259 + 16;
                  int var6 = var3 + var0.field255 + 16;
                  int var7 = var5 + (var6 << 7);
                  class293.field3166[var7] = 0;
               }
            }
         }
      }

   }
}
