package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public class class21 extends class236 {
   @ObfuscatedName("f")
   final boolean field158;

   public class21(boolean var1) {
      this.field158 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lkj;Lkj;I)I",
      garbageValue = "101003208"
   )
   int method211(class305 var1, class305 var2) {
      return client.field3785 == var1.field3265 && var2.field3265 == client.field3785?(this.field158?var1.method4300().method840(var2.method4300()):var2.method4300().method840(var1.method4300())):this.method4178(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method211((class305)var1, (class305)var2);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([BILjava/lang/CharSequence;I)I",
      garbageValue = "1503519247"
   )
   public static int method219(byte[] var0, int var1, CharSequence var2) {
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

   @ObfuscatedName("gh")
   @ObfuscatedSignature(
      signature = "(IIIIIIII)V",
      garbageValue = "-1917790959"
   )
   static final void method218(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var8 = var6 - 334;
      if(var8 < 0) {
         var8 = 0;
      } else if(var8 > 100) {
         var8 = 100;
      }

      int var9 = (client.field3985 - client.field3838) * var8 / 100 + client.field3838;
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
         var13 = class257.field2564[var8];
         var14 = class257.field2558[var8];
         var15 = var11 * var14 - var13 * var7 >> 16;
         var12 = var13 * var11 + var14 * var7 >> 16;
         var11 = var15;
      }

      if(var9 != 0) {
         var13 = class257.field2564[var9];
         var14 = class257.field2558[var9];
         var15 = var12 * var13 + var14 * var10 >> 16;
         var12 = var14 * var12 - var13 * var10 >> 16;
         var10 = var15;
      }

      class83.field738 = var0 - var10;
      class296.field3191 = var1 - var11;
      class50.field375 = var2 - var12;
      client.field4009 = var3;
      client.onCameraPitchChanged(-1);
      class61.field469 = var4;
      if(client.field3807 == 1 && client.field3842 >= 2 && client.field3744 % 50 == 0 && (class125.field1181 >> 7 != class5.field43.field1277 >> 7 || class303.field3244 >> 7 != class5.field43.field1259 >> 7)) {
         var13 = class5.field43.field580;
         var14 = (class125.field1181 >> 7) + class296.somex;
         var15 = (class303.field3244 >> 7) + class284.somey;
         class279 var16 = class95.writeClientProt(ClientProt.WORLD_MAP_CLICK, client.field3963.field1162);
         var16.field3018.writeIntV1(client.field3814);
         var16.field3018.writeShortLE(var15);
         var16.field3018.writeByteC(var13);
         var16.field3018.writeShort(var14);
         client.field3963.method2235(var16);
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-77"
   )
   public static void method215() {
      class231.field2256.method2271();
      class231.field2257.method2271();
      class231.field2258.method2271();
   }

   @ObfuscatedName("hg")
   @ObfuscatedSignature(
      signature = "(IIIILjava/lang/String;B)V",
      garbageValue = "6"
   )
   static void method217(int var0, int var1, int var2, int var3, String var4) {
      class329 var5 = class313.method5512(var1, var2);
      if(var5 != null) {
         if(var5.field3650 != null) {
            class9 var6 = new class9();
            var6.field63 = var5;
            var6.field66 = var0;
            var6.field70 = var4;
            var6.field69 = var5.field3650;
            class240.method4263(var6);
         }

         boolean var8 = true;
         if(var5.field3548 > 0) {
            var8 = class275.method4912(var5);
         }

         if(var8) {
            if(class168.method2869(class104.method1771(var5), var0 - 1)) {
               class279 var7;
               if(var0 == 1) {
                  var7 = class95.writeClientProt(ClientProt.IF3_ACTION1, client.field3963.field1162);
                  var7.field3018.writeInt(var1);
                  var7.field3018.writeShort(var2);
                  var7.field3018.writeShort(var3);
                  client.field3963.method2235(var7);
               }

               if(var0 == 2) {
                  var7 = class95.writeClientProt(ClientProt.IF3_ACTION2, client.field3963.field1162);
                  var7.field3018.writeInt(var1);
                  var7.field3018.writeShort(var2);
                  var7.field3018.writeShort(var3);
                  client.field3963.method2235(var7);
               }

               if(var0 == 3) {
                  var7 = class95.writeClientProt(ClientProt.IF3_ACTION3, client.field3963.field1162);
                  var7.field3018.writeInt(var1);
                  var7.field3018.writeShort(var2);
                  var7.field3018.writeShort(var3);
                  client.field3963.method2235(var7);
               }

               if(var0 == 4) {
                  var7 = class95.writeClientProt(ClientProt.IF3_ACTION4, client.field3963.field1162);
                  var7.field3018.writeInt(var1);
                  var7.field3018.writeShort(var2);
                  var7.field3018.writeShort(var3);
                  client.field3963.method2235(var7);
               }

               if(var0 == 5) {
                  var7 = class95.writeClientProt(ClientProt.IF3_ACTION5, client.field3963.field1162);
                  var7.field3018.writeInt(var1);
                  var7.field3018.writeShort(var2);
                  var7.field3018.writeShort(var3);
                  client.field3963.method2235(var7);
               }

               if(var0 == 6) {
                  var7 = class95.writeClientProt(ClientProt.IF3_ACTION6, client.field3963.field1162);
                  var7.field3018.writeInt(var1);
                  var7.field3018.writeShort(var2);
                  var7.field3018.writeShort(var3);
                  client.field3963.method2235(var7);
               }

               if(var0 == 7) {
                  var7 = class95.writeClientProt(ClientProt.IF3_ACTION7, client.field3963.field1162);
                  var7.field3018.writeInt(var1);
                  var7.field3018.writeShort(var2);
                  var7.field3018.writeShort(var3);
                  client.field3963.method2235(var7);
               }

               if(var0 == 8) {
                  var7 = class95.writeClientProt(ClientProt.IF3_ACTION8, client.field3963.field1162);
                  var7.field3018.writeInt(var1);
                  var7.field3018.writeShort(var2);
                  var7.field3018.writeShort(var3);
                  client.field3963.method2235(var7);
               }

               if(var0 == 9) {
                  var7 = class95.writeClientProt(ClientProt.IF3_ACTION9, client.field3963.field1162);
                  var7.field3018.writeInt(var1);
                  var7.field3018.writeShort(var2);
                  var7.field3018.writeShort(var3);
                  client.field3963.method2235(var7);
               }

               if(var0 == 10) {
                  var7 = class95.writeClientProt(ClientProt.IF3_ACTION10, client.field3963.field1162);
                  var7.field3018.writeInt(var1);
                  var7.field3018.writeShort(var2);
                  var7.field3018.writeShort(var3);
                  client.field3963.method2235(var7);
               }

            }
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "([BIIIIIII[Lfr;I)V",
      garbageValue = "1766881808"
   )
   static final void method221(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class182[] var8) {
      int var10;
      for(int var9 = 0; var9 < 8; ++var9) {
         for(var10 = 0; var10 < 8; ++var10) {
            if(var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) {
               var8[var1].field1765[var9 + var2][var10 + var3] &= -16777217;
            }
         }
      }

      Buffer var20 = new Buffer(var0);

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

                  class298.method5184(var20, var1, var16 + var2, var3 + class22.method226(var11 & 7, var12 & 7, var7), 0, 0, var7);
               } else {
                  class298.method5184(var20, 0, -1, -1, 0, 0, 0);
               }
            }
         }
      }

   }

   @ObfuscatedName("iw")
   @ObfuscatedSignature(
      signature = "(Lhw;IB)I",
      garbageValue = "0"
   )
   static final int method216(class329 var0, int var1) {
      if(var0.field3631 != null && var1 < var0.field3631.length) {
         try {
            int[] var2 = var0.field3631[var1];
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
                  var7 = client.field3940[var2[var4++]];
               }

               if(var6 == 2) {
                  var7 = client.field3865[var2[var4++]];
               }

               if(var6 == 3) {
                  var7 = client.field3797[var2[var4++]];
               }

               int var9;
               class329 var10;
               int var11;
               int var12;
               if(var6 == 4) {
                  var9 = var2[var4++] << 16;
                  var9 += var2[var4++];
                  var10 = class189.getWidget(var9);
                  var11 = var2[var4++];
                  if(var11 != -1 && (!class67.method1152(var11).field1117 || client.field3735)) {
                     for(var12 = 0; var12 < var10.field3668.length; ++var12) {
                        if(var11 + 1 == var10.field3668[var12]) {
                           var7 += var10.field3682[var12];
                        }
                     }
                  }
               }

               if(var6 == 5) {
                  var7 = class215.field2071[var2[var4++]];
               }

               if(var6 == 6) {
                  var7 = class137.field1361[client.field3865[var2[var4++]] - 1];
               }

               if(var6 == 7) {
                  var7 = class215.field2071[var2[var4++]] * 100 / 46875;
               }

               if(var6 == 8) {
                  var7 = class5.field43.field582;
               }

               if(var6 == 9) {
                  for(var9 = 0; var9 < 25; ++var9) {
                     if(class137.field1363[var9]) {
                        var7 += client.field3865[var9];
                     }
                  }
               }

               if(var6 == 10) {
                  var9 = var2[var4++] << 16;
                  var9 += var2[var4++];
                  var10 = class189.getWidget(var9);
                  var11 = var2[var4++];
                  if(var11 != -1 && (!class67.method1152(var11).field1117 || client.field3735)) {
                     for(var12 = 0; var12 < var10.field3668.length; ++var12) {
                        if(var11 + 1 == var10.field3668[var12]) {
                           var7 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if(var6 == 11) {
                  var7 = client.energy;
               }

               if(var6 == 12) {
                  var7 = client.weight;
               }

               if(var6 == 13) {
                  var9 = class215.field2071[var2[var4++]];
                  int var13 = var2[var4++];
                  var7 = (var9 & 1 << var13) != 0?1:0;
               }

               if(var6 == 14) {
                  var9 = var2[var4++];
                  var7 = class52.method859(var9);
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
                  var7 = (class5.field43.field1277 >> 7) + class296.somex;
               }

               if(var6 == 19) {
                  var7 = (class5.field43.field1259 >> 7) + class284.somey;
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
