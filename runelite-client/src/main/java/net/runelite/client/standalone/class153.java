package net.runelite.client.standalone;

import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("b")
public abstract class class153 {
   @ObfuscatedName("ss")
   @ObfuscatedSignature(
      signature = "Lbk;"
   )
   static class197 field1455;
   @ObfuscatedName("qm")
   @ObfuscatedSignature(
      signature = "Lch;"
   )
   static class40 field1468;
   @ObfuscatedName("qh")
   @ObfuscatedGetter(
      intValue = 482809173
   )
   static int field1456;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 826682511
   )
   int field1471;
   @ObfuscatedName("m")
   byte[][][] field1464;
   @ObfuscatedName("r")
   byte[][][] field1463;
   @ObfuscatedName("p")
   short[][][] field1462;
   @ObfuscatedName("c")
   short[][][] field1461;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 452866293
   )
   int field1467;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1873682765
   )
   int field1465;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1390973181
   )
   int field1458;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 631004899
   )
   int field1460;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -404154089
   )
   int field1459;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "[[[[Ln;"
   )
   class25[][][][] field1470;

   class153() {
      new LinkedList();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1251223150"
   )
   int method2703() {
      return this.field1458;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1235745297"
   )
   int method2702() {
      return this.field1459;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "822391461"
   )
   int method2701(int var1, int var2) {
      return var1 >= 0 && var2 >= 0?(var1 < 64 && var2 < 64?this.field1461[0][var1][var2] - 1:-1):-1;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(IILgm;IB)V",
      garbageValue = "-116"
   )
   void method2709(int var1, int var2, Buffer var3, int var4) {
      int var5 = ((var4 & 24) >> 3) + 1;
      boolean var6 = (var4 & 2) != 0;
      boolean var7 = (var4 & 4) != 0;
      this.field1461[0][var1][var2] = (short)var3.readUnsignedByte();
      int var8;
      int var9;
      int var11;
      if(var6) {
         var8 = var3.readUnsignedByte();

         for(var9 = 0; var9 < var8; ++var9) {
            int var10 = var3.readUnsignedByte();
            if(var10 != 0) {
               this.field1462[var9][var1][var2] = (short)var10;
               var11 = var3.readUnsignedByte();
               this.field1463[var9][var1][var2] = (byte)(var11 >> 2);
               this.field1464[var9][var1][var2] = (byte)(var11 & 3);
            }
         }
      }

      if(var7) {
         for(var8 = 0; var8 < var5; ++var8) {
            var9 = var3.readUnsignedByte();
            if(var9 != 0) {
               class25[] var14 = this.field1470[var8][var1][var2] = new class25[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  int var12 = var3.method1942();
                  int var13 = var3.readUnsignedByte();
                  var14[var11] = new class25(var12, var13 >> 2, var13 & 3);
               }
            }
         }
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IILgm;II)V",
      garbageValue = "-585747485"
   )
   void method2699(int var1, int var2, Buffer var3, int var4) {
      boolean var5 = (var4 & 2) != 0;
      if(var5) {
         this.field1462[0][var1][var2] = (short)var3.readUnsignedByte();
      }

      this.field1461[0][var1][var2] = (short)var3.readUnsignedByte();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IILgm;B)V",
      garbageValue = "-47"
   )
   void method2698(int var1, int var2, Buffer var3) {
      int var4 = var3.readUnsignedByte();
      if(var4 != 0) {
         if((var4 & 1) != 0) {
            this.method2699(var1, var2, var3, var4);
         } else {
            this.method2709(var1, var2, var3, var4);
         }

      }
   }

   @ObfuscatedName("hw")
   @ObfuscatedSignature(
      signature = "(Lbw;IIII)V",
      garbageValue = "-1656765897"
   )
   static final void method2715(class63 var0, int var1, int var2, int var3) {
      if(class5.field43 != var0) {
         if(client.field3869 < 400) {
            String var4;
            int var7;
            if(var0.field597 == 0) {
               String var5 = var0.field588[0] + var0.field577 + var0.field588[1];
               var7 = var0.field582;
               int var8 = class5.field43.field582;
               int var9 = var8 - var7;
               String var6;
               if(var9 < -9) {
                  var6 = class294.method5136(16711680);
               } else if(var9 < -6) {
                  var6 = class294.method5136(16723968);
               } else if(var9 < -3) {
                  var6 = class294.method5136(16740352);
               } else if(var9 < 0) {
                  var6 = class294.method5136(16756736);
               } else if(var9 > 9) {
                  var6 = class294.method5136(65280);
               } else if(var9 > 6) {
                  var6 = class294.method5136(4259584);
               } else if(var9 > 3) {
                  var6 = class294.method5136(8453888);
               } else if(var9 > 0) {
                  var6 = class294.method5136(12648192);
               } else {
                  var6 = class294.method5136(16776960);
               }

               var4 = var5 + var6 + " " + " (" + "level-" + var0.field582 + ")" + var0.field588[2];
            } else {
               var4 = var0.field588[0] + var0.field577 + var0.field588[1] + " " + " (" + "skill-" + var0.field597 + ")" + var0.field588[2];
            }

            int var10;
            if(client.field3885 == 1) {
               class98.method1687("Use", client.field3835 + " " + "->" + " " + class294.method5136(16777215) + var4, 14, var1, var2, var3);
            } else if(client.field3887) {
               if((class184.field1776 & 8) == 8) {
                  class98.method1687(client.field3890, client.field3891 + " " + "->" + " " + class294.method5136(16777215) + var4, 15, var1, var2, var3);
               }
            } else {
               for(var10 = 7; var10 >= 0; --var10) {
                  if(client.field3856[var10] != null) {
                     short var11 = 0;
                     if(client.field3856[var10].equalsIgnoreCase("Attack")) {
                        if(class113.field1061 == client.field3760) {
                           continue;
                        }

                        if(client.field3760 == class113.field1065 || class113.field1059 == client.field3760 && var0.field582 > class5.field43.field582) {
                           var11 = 2000;
                        }

                        if(class5.field43.field595 != 0 && var0.field595 != 0) {
                           if(var0.field595 == class5.field43.field595) {
                              var11 = 2000;
                           } else {
                              var11 = 0;
                           }
                        }
                     } else if(client.field3857[var10]) {
                        var11 = 2000;
                     }

                     boolean var12 = false;
                     var7 = client.field3855[var10] + var11;
                     class98.method1687(client.field3856[var10], class294.method5136(16777215) + var4, var7, var1, var2, var3);
                  }
               }
            }

            for(var10 = 0; var10 < client.field3869; ++var10) {
               if(client.field3872[var10] == 23) {
                  client.field3875[var10] = class294.method5136(16777215) + var4;
                  break;
               }
            }

         }
      }
   }
}
