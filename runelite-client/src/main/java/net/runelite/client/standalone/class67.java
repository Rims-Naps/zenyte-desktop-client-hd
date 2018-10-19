package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
public class class67 {
   @ObfuscatedName("sz")
   @ObfuscatedSignature(
      signature = "Lfi;"
   )
   static class281 field619;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = -1489761915
   )
   static int field620;
   @ObfuscatedName("eu")
   @ObfuscatedGetter(
      intValue = 653017569
   )
   static int field618;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IB)Ljava/lang/String;",
      garbageValue = "36"
   )
   static String method1147(int var0) {
      return "<img=" + var0 + ">";
   }

   @ObfuscatedName("fv")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-1820641322"
   )
   static final void method1150(int var0, int var1, int var2, int var3) {
      ++client.field3830;
      if(class5.field43.field1277 >> 7 == client.field3795 && class5.field43.field1259 >> 7 == client.field3993) {
         client.field3795 = 0;
      }

      if(client.field3851) {
         class176.method2956(class5.field43, false);
      }

      if(client.field3922 >= 0 && client.field3848[client.field3922] != null) {
         class176.method2956(client.field3848[client.field3922], false);
      }

      class296.method5154(true);
      class168.method2872();
      class296.method5154(false);
      class326.method5781();

      for(class130 var4 = (class130)client.field3863.method5604(); var4 != null; var4 = (class130)client.field3863.method5606()) {
         if(var4.field1246 == class315.plane && !var4.field1244) {
            if(client.field3744 >= var4.field1234) {
               var4.method2387(client.field3989);
               if(var4.field1244) {
                  var4.method1186();
               } else {
                  class258.field2566.method5342(var4.field1246, var4.field1236, var4.field1237, var4.field1238, 60, var4, 0, -1L, false);
               }
            }
         } else {
            var4.method1186();
         }
      }

      class12.method137(var0, var1, var2, var3, true);
      var0 = client.field3823;
      var1 = client.field3816;
      var2 = client.field3992;
      var3 = client.field3938;
      class89.method1532(var0, var1, var0 + var2, var3 + var1);
      class257.method4570();
      int var5;
      int var28;
      if(!client.field3976) {
         var28 = client.field3801;
         if(client.field3846 / 256 > var28) {
            var28 = client.field3846 / 256;
         }

         if(client.field3787[4] && client.field3979[4] + 128 > var28) {
            var28 = client.field3979[4] + 128;
         }

         var5 = client.field3802 & 2047;
         class21.method218(class125.field1181, class164.field1526, class303.field3244, var28, var5, class87.method1308(var28), var3);
      }

      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var14;
      if(!client.field3976) {
         if(class153.field1455.field1856) {
            var5 = class315.plane;
         } else {
            label606: {
               var6 = 3;
               if(client.field4009 < 310) {
                  if(client.field3807 == 1) {
                     var7 = class125.field1181 >> 7;
                     var8 = class303.field3244 >> 7;
                  } else {
                     var7 = class5.field43.field1277 >> 7;
                     var8 = class5.field43.field1259 >> 7;
                  }

                  var9 = class83.field738 >> 7;
                  var10 = class50.field375 >> 7;
                  if(var9 < 0 || var10 < 0 || var9 >= 104 || var10 >= 104) {
                     var5 = class315.plane;
                     break label606;
                  }

                  if(var7 < 0 || var8 < 0 || var7 >= 104 || var8 >= 104) {
                     var5 = class315.plane;
                     break label606;
                  }

                  if((class31.field239[class315.plane][var9][var10] & 4) != 0) {
                     var6 = class315.plane;
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

                  int var13;
                  if(var11 > var12) {
                     var13 = var12 * 65536 / var11;
                     var14 = 32768;

                     while(var9 != var7) {
                        if(var9 < var7) {
                           ++var9;
                        } else if(var9 > var7) {
                           --var9;
                        }

                        if((class31.field239[class315.plane][var9][var10] & 4) != 0) {
                           var6 = class315.plane;
                        }

                        var14 += var13;
                        if(var14 >= 65536) {
                           var14 -= 65536;
                           if(var10 < var8) {
                              ++var10;
                           } else if(var10 > var8) {
                              --var10;
                           }

                           if((class31.field239[class315.plane][var9][var10] & 4) != 0) {
                              var6 = class315.plane;
                           }
                        }
                     }
                  } else if(var12 > 0) {
                     var13 = var11 * 65536 / var12;
                     var14 = 32768;

                     while(var10 != var8) {
                        if(var10 < var8) {
                           ++var10;
                        } else if(var10 > var8) {
                           --var10;
                        }

                        if((class31.field239[class315.plane][var9][var10] & 4) != 0) {
                           var6 = class315.plane;
                        }

                        var14 += var13;
                        if(var14 >= 65536) {
                           var14 -= 65536;
                           if(var9 < var7) {
                              ++var9;
                           } else if(var9 > var7) {
                              --var9;
                           }

                           if((class31.field239[class315.plane][var9][var10] & 4) != 0) {
                              var6 = class315.plane;
                           }
                        }
                     }
                  }
               }

               if(class5.field43.field1277 >= 0 && class5.field43.field1259 >= 0 && class5.field43.field1277 < 13312 && class5.field43.field1259 < 13312) {
                  if((class31.field239[class315.plane][class5.field43.field1277 >> 7][class5.field43.field1259 >> 7] & 4) != 0) {
                     var6 = class315.plane;
                  }

                  var5 = var6;
               } else {
                  var5 = class315.plane;
               }
            }
         }

         var28 = var5;
      } else {
         var28 = class83.method1226();
      }

      var5 = class83.field738;
      var6 = class296.field3191;
      var7 = class50.field375;
      var8 = client.field4009;
      var9 = class61.field469;

      for(var10 = 0; var10 < 5; ++var10) {
         if(client.field3787[var10]) {
            var11 = (int)(Math.random() * (double)(client.field3780[var10] * 2 + 1) - (double)client.field3780[var10] + Math.sin((double)client.field3980[var10] / 100.0D * (double)client.field3981[var10]) * (double)client.field3979[var10]);
            if(var10 == 0) {
               class83.field738 += var11;
            }

            if(var10 == 1) {
               class296.field3191 += var11;
            }

            if(var10 == 2) {
               class50.field375 += var11;
            }

            if(var10 == 3) {
               class61.field469 = var11 + class61.field469 & 2047;
            }

            if(var10 == 4) {
               client.field4009 += var11;
               client.onCameraPitchChanged(-1);
               if(client.field4009 < 128) {
                  client.field4009 = 128;
                  client.onCameraPitchChanged(-1);
               }

               if(client.field4009 > 383) {
                  client.field4009 = 383;
                  client.onCameraPitchChanged(-1);
               }
            }
         }
      }

      var10 = class226.field2215;
      var11 = class226.field2216;
      if(class226.field2222 != 0) {
         var10 = class226.field2220;
         var11 = class226.field2224;
      }

      if(var10 >= var0 && var10 < var0 + var2 && var11 >= var1 && var11 < var3 + var1) {
         class161.method2768(var10 - var0, var11 - var1);
      } else {
         class327.field3519 = false;
         class327.field3509 = 0;
      }

      class31.method519();
      class89.method1561(var0, var1, var2, var3, 0);
      class31.method519();
      var12 = class257.field2550;
      class257.field2550 = client.field3809;
      class258.field2566.method5355(class83.field738, class296.field3191, class50.field375, client.field4009, class61.field469, var28);
      class257.field2550 = var12;
      class31.method519();
      class258.field2566.method5345();
      client.field3819 = 0;
      boolean var31 = false;
      var14 = -1;
      int var15 = -1;
      int var16 = class11.field90;
      int[] var17 = class11.field91;

      int var18;
      for(var18 = 0; var18 < var16 + client.field3775; ++var18) {
         Object var19;
         if(var18 < var16) {
            var19 = client.field3848[var17[var18]];
            if(var17[var18] == client.field3922) {
               var31 = true;
               var14 = var18;
               continue;
            }

            if(var19 == class5.field43) {
               var15 = var18;
               continue;
            }
         } else {
            var19 = client.field3774[client.field3776[var18 - var16]];
         }

         class148.method2675((class133)var19, var18, var0, var1, var2, var3, -1781715326);
      }

      if(client.field3851 && var15 != -1) {
         class148.method2675(class5.field43, var15, var0, var1, var2, var3, -1781715326);
      }

      if(var31) {
         class148.method2675(client.field3848[client.field3922], var14, var0, var1, var2, var3, -1781715326);
      }

      for(var18 = 0; var18 < client.field3819; ++var18) {
         int var29 = client.field3821[var18];
         int var20 = client.field3852[var18];
         int var21 = client.field3754[var18];
         int var22 = client.field3964[var18];
         boolean var23 = true;

         while(var23) {
            var23 = false;

            for(int var24 = 0; var24 < var18; ++var24) {
               if(var20 + 2 > client.field3852[var24] - client.field3964[var24] && var20 - var22 < client.field3852[var24] + 2 && var29 - var21 < client.field3754[var24] + client.field3821[var24] && var21 + var29 > client.field3821[var24] - client.field3754[var24] && client.field3852[var24] - client.field3964[var24] < var20) {
                  var20 = client.field3852[var24] - client.field3964[var24];
                  var23 = true;
               }
            }
         }

         client.field3831 = client.field3821[var18];
         client.field3832 = client.field3852[var18] = var20;
         String var30 = client.field3828[var18];
         if(client.field3896 == 0) {
            int var25 = 16776960;
            if(client.field3825[var18] < 6) {
               var25 = client.field3822[client.field3825[var18]];
            }

            if(client.field3825[var18] == 6) {
               var25 = client.field3830 % 20 < 10?16711680:16776960;
            }

            if(client.field3825[var18] == 7) {
               var25 = client.field3830 % 20 < 10?255:'\uffff';
            }

            if(client.field3825[var18] == 8) {
               var25 = client.field3830 % 20 < 10?'뀀':8454016;
            }

            int var26;
            if(client.field3825[var18] == 9) {
               var26 = 150 - client.field3925[var18];
               if(var26 < 50) {
                  var25 = var26 * 1280 + 16711680;
               } else if(var26 < 100) {
                  var25 = 16776960 - (var26 - 50) * 327680;
               } else if(var26 < 150) {
                  var25 = (var26 - 100) * 5 + 65280;
               }
            }

            if(client.field3825[var18] == 10) {
               var26 = 150 - client.field3925[var18];
               if(var26 < 50) {
                  var25 = var26 * 5 + 16711680;
               } else if(var26 < 100) {
                  var25 = 16711935 - (var26 - 50) * 327680;
               } else if(var26 < 150) {
                  var25 = (var26 - 100) * 327680 + 255 - (var26 - 100) * 5;
               }
            }

            if(client.field3825[var18] == 11) {
               var26 = 150 - client.field3925[var18];
               if(var26 < 50) {
                  var25 = 16777215 - var26 * 327685;
               } else if(var26 < 100) {
                  var25 = (var26 - 50) * 327685 + 65280;
               } else if(var26 < 150) {
                  var25 = 16777215 - (var26 - 100) * 327680;
               }
            }

            if(client.field3826[var18] == 0) {
               class246.field2467.method3590(var30, var0 + client.field3831, client.field3832 + var1, var25, 0);
            }

            if(client.field3826[var18] == 1) {
               class246.field2467.method3530(var30, var0 + client.field3831, client.field3832 + var1, var25, 0, client.field3830);
            }

            if(client.field3826[var18] == 2) {
               class246.field2467.method3531(var30, var0 + client.field3831, client.field3832 + var1, var25, 0, client.field3830);
            }

            if(client.field3826[var18] == 3) {
               class246.field2467.method3522(var30, var0 + client.field3831, client.field3832 + var1, var25, 0, client.field3830, 150 - client.field3925[var18]);
            }

            if(client.field3826[var18] == 4) {
               var26 = (150 - client.field3925[var18]) * (class246.field2467.method3601(var30) + 100) / 150;
               class89.method1552(var0 + client.field3831 - 50, var1, var0 + client.field3831 + 50, var3 + var1);
               class246.field2467.method3543(var30, var0 + client.field3831 + 50 - var26, client.field3832 + var1, var25, 0);
               class89.method1532(var0, var1, var0 + var2, var3 + var1);
            }

            if(client.field3826[var18] == 5) {
               var26 = 150 - client.field3925[var18];
               int var27 = 0;
               if(var26 < 25) {
                  var27 = var26 - 25;
               } else if(var26 > 125) {
                  var27 = var26 - 125;
               }

               class89.method1552(var0, client.field3832 + var1 - class246.field2467.field2015 - 1, var0 + var2, client.field3832 + var1 + 5);
               class246.field2467.method3590(var30, var0 + client.field3831, var27 + client.field3832 + var1, var25, 0);
               class89.method1532(var0, var1, var0 + var2, var3 + var1);
            }
         } else {
            class246.field2467.method3590(var30, var0 + client.field3831, client.field3832 + var1, 16776960, 0);
         }
      }

      class25.method362(var0, var1);
      ((class254)class257.field2539).method4534(client.field3989);
      class293.method5133(var0, var1, var2, var3);
      class83.field738 = var5;
      class296.field3191 = var6;
      class50.field375 = var7;
      client.field4009 = var8;
      client.onCameraPitchChanged(-1);
      class61.field469 = var9;
      if(client.field3794) {
         byte var32 = 0;
         var14 = var32 + class270.field2953 + class270.field2955;
         if(var14 == 0) {
            client.field3794 = false;
         }
      }

      if(client.field3794) {
         class89.method1561(var0, var1, var2, var3, 0);
         class319.method5587("Loading - please wait.", false);
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIII)I",
      garbageValue = "447874722"
   )
   static final int method1148(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = class205.method3501(var3, var5);
      int var8 = class205.method3501(var3 + 1, var5);
      int var9 = class205.method3501(var3, var5 + 1);
      int var10 = class205.method3501(var3 + 1, var5 + 1);
      int var12 = 65536 - class257.field2558[var4 * 1024 / var2] >> 1;
      int var11 = ((65536 - var12) * var7 >> 16) + (var12 * var8 >> 16);
      int var14 = 65536 - class257.field2558[var4 * 1024 / var2] >> 1;
      int var13 = ((65536 - var14) * var9 >> 16) + (var14 * var10 >> 16);
      int var16 = 65536 - class257.field2558[var6 * 1024 / var2] >> 1;
      int var15 = ((65536 - var16) * var11 >> 16) + (var16 * var13 >> 16);
      return var15;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1757252171"
   )
   public static void method1153() {
      class321.field3414.method2271();
      class321.field3415.method2271();
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1288269072"
   )
   static void method1151() {
      class11.field90 = 0;

      for(int var0 = 0; var0 < 2048; ++var0) {
         class11.field104[var0] = null;
         class11.field93[var0] = 1;
      }

   }

   @ObfuscatedName("kg")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1478392897"
   )
   static void method1146() {
      if(client.field3807 == 1) {
         client.field3815 = true;
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)Ljs;",
      garbageValue = "-2113695315"
   )
   public static class120 method1152(int var0) {
      class120 var1 = (class120)class120.field1114.method2268((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class120.field1097.method2579(10, var0, 407483835);
         var1 = new class120();
         var1.field1102 = var0;
         if(var2 != null) {
            var1.method2153(new Buffer(var2));
         }

         var1.method2158();
         if(var1.field1129 != -1) {
            var1.method2155(method1152(var1.field1129), method1152(var1.field1135));
         }

         if(var1.field1146 != -1) {
            var1.method2156(method1152(var1.field1146), method1152(var1.field1145));
         }

         if(var1.field1148 != -1) {
            var1.method2227(method1152(var1.field1148), method1152(var1.field1147));
         }

         if(!class176.field1683 && var1.field1117) {
            var1.field1119 = "Members object";
            var1.field1144 = false;
            var1.field1142 = null;
            var1.field1128 = null;
            var1.field1120 = -1;
            var1.field1115 = 0;
            if(var1.field1101 != null) {
               boolean var3 = false;

               for(class76 var4 = var1.field1101.method796(); var4 != null; var4 = var1.field1101.method797()) {
                  class183 var5 = class275.method4913((int)var4.field704);
                  if(var5.field1768) {
                     var4.method1186();
                  } else {
                     var3 = true;
                  }
               }

               if(!var3) {
                  var1.field1101 = null;
               }
            }
         }

         class120.field1114.method2275(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Lds;IIII)Z",
      garbageValue = "-430577921"
   )
   static final boolean method1154(class200 var0, int var1, int var2, int var3) {
      if(!class102.method1761()) {
         return false;
      } else {
         int var4;
         int var5;
         int var6;
         int var7;
         int var10;
         int var11;
         int var12;
         int var15;
         int var16;
         if(!class327.field3510) {
            var4 = class312.field3331;
            var5 = class312.field3332;
            var6 = class312.field3333;
            var7 = class312.field3334;
            byte var8 = 50;
            short var9 = 3500;
            var10 = (class327.field3512 - class257.field2551) * var8 / class257.field2550;
            var11 = (class327.field3511 - class257.field2541) * var8 / class257.field2550;
            var12 = (class327.field3512 - class257.field2551) * var9 / class257.field2550;
            int var13 = (class327.field3511 - class257.field2541) * var9 / class257.field2550;
            int var14 = class257.method4592(var11, var8, var5, var4);
            var15 = class257.method4593(var11, var8, var5, var4);
            var11 = var14;
            var14 = class257.method4592(var13, var9, var5, var4);
            var16 = class257.method4593(var13, var9, var5, var4);
            var13 = var14;
            var14 = class257.method4591(var10, var15, var7, var6);
            var15 = class257.method4635(var10, var15, var7, var6);
            var10 = var14;
            var14 = class257.method4591(var12, var16, var7, var6);
            var16 = class257.method4635(var12, var16, var7, var6);
            class327.field3513 = (var10 + var14) / 2;
            class327.field3514 = (var13 + var11) / 2;
            class123.field1173 = (var15 + var16) / 2;
            class122.field1166 = (var14 - var10) / 2;
            class125.field1182 = (var13 - var11) / 2;
            class297.field3197 = (var16 - var15) / 2;
            class302.field3237 = Math.abs(class122.field1166);
            class18.field147 = Math.abs(class125.field1182);
            class157.field1494 = Math.abs(class297.field3197);
         }

         var4 = var0.field1907 + var1;
         var5 = var2 + var0.field1897;
         var6 = var3 + var0.field1909;
         var7 = var0.field1924;
         var15 = var0.field1911;
         var16 = var0.field1912;
         var10 = class327.field3513 - var4;
         var11 = class327.field3514 - var5;
         var12 = class123.field1173 - var6;
         return Math.abs(var10) > var7 + class302.field3237?false:(Math.abs(var11) > var15 + class18.field147?false:(Math.abs(var12) > var16 + class157.field1494?false:(Math.abs(var12 * class125.field1182 - var11 * class297.field3197) > var16 * class18.field147 + var15 * class157.field1494?false:(Math.abs(var10 * class297.field3197 - var12 * class122.field1166) > var7 * class157.field1494 + var16 * class302.field3237?false:Math.abs(var11 * class122.field1166 - var10 * class125.field1182) <= var7 * class18.field147 + var15 * class302.field3237))));
      }
   }
}
