package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
public class class229 {
   @ObfuscatedName("sp")
   @ObfuscatedSignature(
      signature = "Lls;"
   )
   static class5 field3061;
   @ObfuscatedName("hh")
   @ObfuscatedGetter(
      intValue = 385667995
   )
   static int field3068;
   @ObfuscatedName("fu")
   @ObfuscatedGetter(
      intValue = -175038441
   )
   static int field3067;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1538994677
   )
   int field3059;
   @ObfuscatedName("s")
   int[][] field3064;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -717266105
   )
   int field3069;
   @ObfuscatedName("a")
   int[][] field3063;
   @ObfuscatedName("e")
   int[][] field3066;
   @ObfuscatedName("w")
   int[][] field3060;

   class229(int var1, int var2) {
      this.field3069 = var1;
      this.field3059 = var2;
      this.field3060 = new int[var1][var2];
      this.field3064 = new int[var1][var2];
      this.field3066 = new int[var1][var2];
      this.field3063 = new int[var1][var2];
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "594438740"
   )
   int method4600(int var1, int var2) {
      if(var1 >= 0 && var2 >= 0 && var1 < this.field3069 && var2 < this.field3059) {
         if(this.field3066[var1][var2] == 0) {
            return 0;
         } else {
            int var3 = this.field3060[var1][var2] / this.field3063[var1][var2];
            int var4 = this.field3064[var1][var2] / this.field3063[var1][var2];
            int var5 = this.field3066[var1][var2] / this.field3063[var1][var2];
            return class316.method6202((double)var3 / 256.0D, (double)var4 / 256.0D, (double)var5 / 256.0D);
         }
      } else {
         return 0;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIILjv;I)V",
      garbageValue = "-1517806"
   )
   void method4599(int var1, int var2, int var3, class40 var4) {
      if(var4 != null) {
         if(var3 + var1 >= 0 && var3 + var2 >= 0) {
            if(var1 - var3 <= this.field3069 && var2 - var3 <= this.field3059) {
               int var5 = Math.max(0, var1 - var3);
               int var6 = Math.min(this.field3069, var3 + var1);
               int var7 = Math.max(0, var2 - var3);
               int var8 = Math.min(this.field3059, var3 + var2);

               for(int var9 = var5; var9 < var6; ++var9) {
                  for(int var10 = var7; var10 < var8; ++var10) {
                     this.field3060[var9][var10] += var4.field414 * 256 / var4.field415;
                     this.field3064[var9][var10] += var4.field413;
                     this.field3066[var9][var10] += var4.field412;
                     ++this.field3063[var9][var10];
                  }
               }

            }
         }
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-465510137"
   )
   static final void drawFlames(int var0) {
      short var1 = 256;
      class39.field382 += var0 * 128;
      int var2;
      if(class39.field382 > class219.field2983.length) {
         class39.field382 -= class219.field2983.length;
         var2 = (int)(Math.random() * 12.0D);
         class193.method3915(class142.field1805[var2]);
      }

      var2 = 0;
      int var3 = var0 * 128;
      int var4 = (var1 - var0) * 128;

      int var5;
      int var6;
      for(var5 = 0; var5 < var4; ++var5) {
         var6 = class31.field293[var2 + var3] - class219.field2983[var2 + class39.field382 & class219.field2983.length - 1] * var0 / 6;
         if(var6 < 0) {
            var6 = 0;
         }

         class31.field293[var2++] = var6;
      }

      int var7;
      int var8;
      for(var5 = var1 - var0; var5 < var1; ++var5) {
         var6 = var5 * 128;

         for(var7 = 0; var7 < 128; ++var7) {
            var8 = (int)(Math.random() * 100.0D);
            if(var8 < 50 && var7 > 10 && var7 < 118) {
               class31.field293[var7 + var6] = 255;
            } else {
               class31.field293[var6 + var7] = 0;
            }
         }
      }

      if(class39.field380 > 0) {
         class39.field380 -= var0 * 4;
      }

      if(class39.field385 > 0) {
         class39.field385 -= var0 * 4;
      }

      if(class39.field380 == 0 && class39.field385 == 0) {
         var5 = (int)(Math.random() * (double)(2000 / var0));
         if(var5 == 0) {
            class39.field380 = 1024;
         }

         if(var5 == 1) {
            class39.field385 = 1024;
         }
      }

      for(var5 = 0; var5 < var1 - var0; ++var5) {
         class39.field379[var5] = class39.field379[var0 + var5];
      }

      for(var5 = var1 - var0; var5 < var1; ++var5) {
         class39.field379[var5] = (int)(Math.sin((double)class39.field373 / 14.0D) * 16.0D + Math.sin((double)class39.field373 / 15.0D) * 14.0D + Math.sin((double)class39.field373 / 16.0D) * 12.0D);
         ++class39.field373;
      }

      class39.field383 += var0;
      var5 = (var0 + (client.field2165 & 1)) / 2;
      if(var5 > 0) {
         for(var6 = 0; var6 < class39.field383 * 100; ++var6) {
            var7 = (int)(Math.random() * 124.0D) + 2;
            var8 = (int)(Math.random() * 128.0D) + 128;
            class31.field293[var7 + (var8 << 7)] = 192;
         }

         class39.field383 = 0;

         int var9;
         for(var6 = 0; var6 < var1; ++var6) {
            var7 = 0;
            var8 = var6 * 128;

            for(var9 = -var5; var9 < 128; ++var9) {
               if(var9 + var5 < 128) {
                  var7 += class31.field293[var9 + var8 + var5];
               }

               if(var9 - (var5 + 1) >= 0) {
                  var7 -= class31.field293[var9 + var8 - (var5 + 1)];
               }

               if(var9 >= 0) {
                  class163.field1986[var8 + var9] = var7 / (var5 * 2 + 1);
               }
            }
         }

         for(var6 = 0; var6 < 128; ++var6) {
            var7 = 0;

            for(var8 = -var5; var8 < var1; ++var8) {
               var9 = var8 * 128;
               if(var8 + var5 < var1) {
                  var7 += class163.field1986[var5 * 128 + var9 + var6];
               }

               if(var8 - (var5 + 1) >= 0) {
                  var7 -= class163.field1986[var9 + var6 - (var5 + 1) * 128];
               }

               if(var8 >= 0) {
                  class31.field293[var9 + var6] = var7 / (var5 * 2 + 1);
               }
            }
         }
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Ljz;",
      garbageValue = "1542692388"
   )
   public static class224 method4609(int var0) {
      class224 var1 = (class224)class224.field3012.method1813((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class224.field3016.method4398(32, var0, 644655751);
         var1 = new class224();
         if(var2 != null) {
            var1.method4524(new Buffer(var2));
         }

         class224.field3012.method1820(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("fs")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-1081380217"
   )
   static final void method4606(boolean var0) {
      for(int var1 = 0; var1 < client.field2196; ++var1) {
         class176 var2 = client.field2195[client.field2197[var1]];
         if(var2 != null && var2.vmethod3957() && var2.field2437.field3881 == var0 && var2.field2437.method6157()) {
            int var3 = var2.field1090 >> 7;
            int var4 = var2.field1072 >> 7;
            if(var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
               if(var2.field1075 == 1 && (var2.field1090 & 127) == 64 && (var2.field1072 & 127) == 64) {
                  if(client.field2314[var3][var4] == client.field2251) {
                     continue;
                  }

                  client.field2314[var3][var4] = client.field2251;
               }

               long var5 = class282.method5439(0, 0, 1, !var2.field2437.field3889, client.field2197[var1]);
               var2.field1076 = client.field2165;
               class269.field3464.method1936(class260.field3393, var2.field1090, var2.field1072, class314.method6140(var2.field1075 * 64 - 64 + var2.field1090, var2.field1075 * 64 - 64 + var2.field1072, class260.field3393), var2.field1075 * 64 - 64 + 60, var2, var2.field1073, var5, var2.field1074);
            }
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([BI)Lcz;",
      garbageValue = "-1798562082"
   )
   static class296 method4604(byte[] var0) {
      class296 var1 = new class296();
      Buffer var2 = new Buffer(var0);
      var2.position = var2.field1694.length - 2;
      int var3 = var2.readUnsignedShort();
      int var4 = var2.field1694.length - 2 - var3 - 12;
      var2.position = var4;
      int var5 = var2.readInt();
      var1.field3691 = var2.readUnsignedShort();
      var1.field3700 = var2.readUnsignedShort();
      var1.field3693 = var2.readUnsignedShort();
      var1.field3692 = var2.readUnsignedShort();
      int var6 = var2.readUnsignedByte();
      int var7;
      int var8;
      if(var6 > 0) {
         var1.field3695 = var1.method5783(var6);

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = var2.readUnsignedShort();
            int var9;
            int var11;
            if(var8 > 0) {
               var11 = var8 - 1;
               var11 |= var11 >>> 1;
               var11 |= var11 >>> 2;
               var11 |= var11 >>> 4;
               var11 |= var11 >>> 8;
               var11 |= var11 >>> 16;
               int var10 = var11 + 1;
               var9 = var10;
            } else {
               var9 = 1;
            }

            class235 var13 = new class235(var9);
            var1.field3695[var7] = var13;

            while(var8-- > 0) {
               var11 = var2.readInt();
               int var12 = var2.readInt();
               var13.method4672(new class228(var12), (long)var11);
            }
         }
      }

      var2.position = 0;
      var2.method2264();
      var1.field3697 = new int[var5];
      var1.field3689 = new int[var5];
      var1.field3690 = new String[var5];

      for(var7 = 0; var2.position < var4; var1.field3697[var7++] = var8) {
         var8 = var2.readUnsignedShort();
         if(var8 == 3) {
            var1.field3690[var7] = var2.readString();
         } else if(var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
            var1.field3689[var7] = var2.readInt();
         } else {
            var1.field3689[var7] = var2.readUnsignedByte();
         }
      }

      return var1;
   }
}
