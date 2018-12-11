package net.runelite.standalone;

import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("b")
public abstract class WorldMapNode {
   @ObfuscatedName("ss")
   @ObfuscatedSignature(
      signature = "Lbk;"
   )
   static class77 field2134;
   @ObfuscatedName("qm")
   @ObfuscatedSignature(
      signature = "Lch;"
   )
   static class293 field2147;
   @ObfuscatedName("qh")
   @ObfuscatedGetter(
      intValue = 482809173
   )
   static int field2135;
   @ObfuscatedName("p")
   short[][][] field2141;
   @ObfuscatedName("c")
   short[][][] field2140;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1873682765
   )
   int field2144;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1390973181
   )
   int field2137;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 826682511
   )
   int field2150;
   @ObfuscatedName("r")
   byte[][][] field2142;
   @ObfuscatedName("m")
   byte[][][] field2143;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "[[[[Ln;"
   )
   WorldMapGameObject[][][][] objects;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 631004899
   )
   int field2139;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 452866293
   )
   int field2146;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -404154089
   )
   int field2138;

   WorldMapNode() {
      new LinkedList();
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "822391461"
   )
   int method3227(int var1, int var2) {
      return var1 >= 0 && var2 >= 0?(var1 < 64 && var2 < 64?this.field2140[0][var1][var2] - 1:-1):-1;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(IILgm;IB)V",
      garbageValue = "-116"
   )
   void method3235(int var1, int var2, Buffer var3, int var4) {
      int var5 = ((var4 & 24) >> 3) + 1;
      boolean var6 = (var4 & 2) != 0;
      boolean var7 = (var4 & 4) != 0;
      this.field2140[0][var1][var2] = (short)var3.readUnsignedByte();
      int var8;
      int var9;
      int var11;
      if(var6) {
         var8 = var3.readUnsignedByte();

         for(var9 = 0; var9 < var8; ++var9) {
            int var10 = var3.readUnsignedByte();
            if(var10 != 0) {
               this.field2141[var9][var1][var2] = (short)var10;
               var11 = var3.readUnsignedByte();
               this.field2142[var9][var1][var2] = (byte)(var11 >> 2);
               this.field2143[var9][var1][var2] = (byte)(var11 & 3);
            }
         }
      }

      if(var7) {
         for(var8 = 0; var8 < var5; ++var8) {
            var9 = var3.readUnsignedByte();
            if(var9 != 0) {
               WorldMapGameObject[] var14 = this.objects[var8][var1][var2] = new WorldMapGameObject[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  int var12 = var3.method2293();
                  int var13 = var3.readUnsignedByte();
                  var14[var11] = new WorldMapGameObject(var12, var13 >> 2, var13 & 3);
               }
            }
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IILgm;B)V",
      garbageValue = "-47"
   )
   void method3224(int var1, int var2, Buffer var3) {
      int var4 = var3.readUnsignedByte();
      if(var4 != 0) {
         if((var4 & 1) != 0) {
            this.method3225(var1, var2, var3, var4);
         } else {
            this.method3235(var1, var2, var3, var4);
         }

      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1235745297"
   )
   int method3228() {
      return this.field2138;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1251223150"
   )
   int method3229() {
      return this.field2137;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IILgm;II)V",
      garbageValue = "-585747485"
   )
   void method3225(int var1, int var2, Buffer var3, int var4) {
      boolean var5 = (var4 & 2) != 0;
      if(var5) {
         this.field2141[0][var1][var2] = (short)var3.readUnsignedByte();
      }

      this.field2140[0][var1][var2] = (short)var3.readUnsignedByte();
   }

   @ObfuscatedName("hw")
   @ObfuscatedSignature(
      signature = "(Lbw;IIII)V",
      garbageValue = "-1656765897"
   )
   static final void method3241(class199 var0, int var1, int var2, int var3) {
      if(class32.field303 != var0) {
         if(client.field2290 < 400) {
            String var4;
            int var7;
            if(var0.field2822 == 0) {
               String var5 = var0.field2813[0] + var0.field2802 + var0.field2813[1];
               var7 = var0.field2807;
               int var8 = class32.field303.field2807;
               int var9 = var8 - var7;
               String var6;
               if(var9 < -9) {
                  var6 = class64.method1354(16711680);
               } else if(var9 < -6) {
                  var6 = class64.method1354(16723968);
               } else if(var9 < -3) {
                  var6 = class64.method1354(16740352);
               } else if(var9 < 0) {
                  var6 = class64.method1354(16756736);
               } else if(var9 > 9) {
                  var6 = class64.method1354(65280);
               } else if(var9 > 6) {
                  var6 = class64.method1354(4259584);
               } else if(var9 > 3) {
                  var6 = class64.method1354(8453888);
               } else if(var9 > 0) {
                  var6 = class64.method1354(12648192);
               } else {
                  var6 = class64.method1354(16776960);
               }

               var4 = var5 + var6 + " " + " (" + "level-" + var0.field2807 + ")" + var0.field2813[2];
            } else {
               var4 = var0.field2813[0] + var0.field2802 + var0.field2813[1] + " " + " (" + "skill-" + var0.field2822 + ")" + var0.field2813[2];
            }

            int var10;
            if(client.field2306 == 1) {
               class28.method484("Use", client.field2256 + " " + "->" + " " + class64.method1354(16777215) + var4, 14, var1, var2, var3);
            } else if(client.field2308) {
               if((class230.field3072 & 8) == 8) {
                  class28.method484(client.field2311, client.field2312 + " " + "->" + " " + class64.method1354(16777215) + var4, 15, var1, var2, var3);
               }
            } else {
               for(var10 = 7; var10 >= 0; --var10) {
                  if(client.field2277[var10] != null) {
                     short var11 = 0;
                     if(client.field2277[var10].equalsIgnoreCase("Attack")) {
                        if(class302.field3752 == client.field2181) {
                           continue;
                        }

                        if(client.field2181 == class302.field3756 || class302.field3750 == client.field2181 && var0.field2807 > class32.field303.field2807) {
                           var11 = 2000;
                        }

                        if(class32.field303.field2820 != 0 && var0.field2820 != 0) {
                           if(var0.field2820 == class32.field303.field2820) {
                              var11 = 2000;
                           } else {
                              var11 = 0;
                           }
                        }
                     } else if(client.field2278[var10]) {
                        var11 = 2000;
                     }

                     boolean var12 = false;
                     var7 = client.field2276[var10] + var11;
                     class28.method484(client.field2277[var10], class64.method1354(16777215) + var4, var7, var1, var2, var3);
                  }
               }
            }

            for(var10 = 0; var10 < client.field2290; ++var10) {
               if(client.field2293[var10] == 23) {
                  client.field2296[var10] = class64.method1354(16777215) + var4;
                  break;
               }
            }

         }
      }
   }
}
