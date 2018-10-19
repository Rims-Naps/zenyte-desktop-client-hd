package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
public class class296 {
   @ObfuscatedName("sp")
   @ObfuscatedSignature(
      signature = "Lls;"
   )
   static class175 field3184;
   @ObfuscatedName("hh")
   @ObfuscatedGetter(
      intValue = 385667995
   )
   static int field3191;
   @ObfuscatedName("fu")
   @ObfuscatedGetter(
      intValue = -175038441
   )
   static int somex;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -717266105
   )
   int field3192;
   @ObfuscatedName("e")
   int[][] field3189;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1538994677
   )
   int field3182;
   @ObfuscatedName("s")
   int[][] field3187;
   @ObfuscatedName("a")
   int[][] field3186;
   @ObfuscatedName("w")
   int[][] field3183;

   class296(int var1, int var2) {
      this.field3192 = var1;
      this.field3182 = var2;
      this.field3183 = new int[var1][var2];
      this.field3187 = new int[var1][var2];
      this.field3189 = new int[var1][var2];
      this.field3186 = new int[var1][var2];
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIILjv;I)V",
      garbageValue = "-1517806"
   )
   void method5147(int var1, int var2, int var3, class287 var4) {
      if(var4 != null) {
         if(var3 + var1 >= 0 && var3 + var2 >= 0) {
            if(var1 - var3 <= this.field3192 && var2 - var3 <= this.field3182) {
               int var5 = Math.max(0, var1 - var3);
               int var6 = Math.min(this.field3192, var3 + var1);
               int var7 = Math.max(0, var2 - var3);
               int var8 = Math.min(this.field3182, var3 + var2);

               for(int var9 = var5; var9 < var6; ++var9) {
                  for(int var10 = var7; var10 < var8; ++var10) {
                     this.field3183[var9][var10] += var4.field3119 * 256 / var4.field3120;
                     this.field3187[var9][var10] += var4.field3118;
                     this.field3189[var9][var10] += var4.field3117;
                     ++this.field3186[var9][var10];
                  }
               }

            }
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "594438740"
   )
   int method5148(int var1, int var2) {
      if(var1 >= 0 && var2 >= 0 && var1 < this.field3192 && var2 < this.field3182) {
         if(this.field3189[var1][var2] == 0) {
            return 0;
         } else {
            int var3 = this.field3183[var1][var2] / this.field3186[var1][var2];
            int var4 = this.field3187[var1][var2] / this.field3186[var1][var2];
            int var5 = this.field3189[var1][var2] / this.field3186[var1][var2];
            return class156.method2739((double)var3 / 256.0D, (double)var4 / 256.0D, (double)var5 / 256.0D);
         }
      } else {
         return 0;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Ljz;",
      garbageValue = "1542692388"
   )
   public static class231 method5157(int var0) {
      class231 var1 = (class231)class231.field2256.method2268((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class231.field2260.method2579(32, var0, 644655751);
         var1 = new class231();
         if(var2 != null) {
            var1.method4121(new Buffer(var2));
         }

         class231.field2256.method2275(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-465510137"
   )
   static final void method5155(int var0) {
      short var1 = 256;
      class325.field3476 += var0 * 128;
      int var2;
      if(class325.field3476 > class293.field3166.length) {
         class325.field3476 -= class293.field3166.length;
         var2 = (int)(Math.random() * 12.0D);
         class330.method5932(class188.field1798[var2]);
      }

      var2 = 0;
      int var3 = var0 * 128;
      int var4 = (var1 - var0) * 128;

      int var5;
      int var6;
      for(var5 = 0; var5 < var4; ++var5) {
         var6 = class48.field365[var2 + var3] - class293.field3166[var2 + class325.field3476 & class293.field3166.length - 1] * var0 / 6;
         if(var6 < 0) {
            var6 = 0;
         }

         class48.field365[var2++] = var6;
      }

      int var7;
      int var8;
      for(var5 = var1 - var0; var5 < var1; ++var5) {
         var6 = var5 * 128;

         for(var7 = 0; var7 < 128; ++var7) {
            var8 = (int)(Math.random() * 100.0D);
            if(var8 < 50 && var7 > 10 && var7 < 118) {
               class48.field365[var7 + var6] = 255;
            } else {
               class48.field365[var6 + var7] = 0;
            }
         }
      }

      if(class325.field3474 > 0) {
         class325.field3474 -= var0 * 4;
      }

      if(class325.field3479 > 0) {
         class325.field3479 -= var0 * 4;
      }

      if(class325.field3474 == 0 && class325.field3479 == 0) {
         var5 = (int)(Math.random() * (double)(2000 / var0));
         if(var5 == 0) {
            class325.field3474 = 1024;
         }

         if(var5 == 1) {
            class325.field3479 = 1024;
         }
      }

      for(var5 = 0; var5 < var1 - var0; ++var5) {
         class325.field3473[var5] = class325.field3473[var0 + var5];
      }

      for(var5 = var1 - var0; var5 < var1; ++var5) {
         class325.field3473[var5] = (int)(Math.sin((double)class325.field3467 / 14.0D) * 16.0D + Math.sin((double)class325.field3467 / 15.0D) * 14.0D + Math.sin((double)class325.field3467 / 16.0D) * 12.0D);
         ++class325.field3467;
      }

      class325.field3477 += var0;
      var5 = (var0 + (client.field3744 & 1)) / 2;
      if(var5 > 0) {
         for(var6 = 0; var6 < class325.field3477 * 100; ++var6) {
            var7 = (int)(Math.random() * 124.0D) + 2;
            var8 = (int)(Math.random() * 128.0D) + 128;
            class48.field365[var7 + (var8 << 7)] = 192;
         }

         class325.field3477 = 0;

         int var9;
         for(var6 = 0; var6 < var1; ++var6) {
            var7 = 0;
            var8 = var6 * 128;

            for(var9 = -var5; var9 < 128; ++var9) {
               if(var9 + var5 < 128) {
                  var7 += class48.field365[var9 + var8 + var5];
               }

               if(var9 - (var5 + 1) >= 0) {
                  var7 -= class48.field365[var9 + var8 - (var5 + 1)];
               }

               if(var9 >= 0) {
                  class226.field2226[var8 + var9] = var7 / (var5 * 2 + 1);
               }
            }
         }

         for(var6 = 0; var6 < 128; ++var6) {
            var7 = 0;

            for(var8 = -var5; var8 < var1; ++var8) {
               var9 = var8 * 128;
               if(var8 + var5 < var1) {
                  var7 += class226.field2226[var5 * 128 + var9 + var6];
               }

               if(var8 - (var5 + 1) >= 0) {
                  var7 -= class226.field2226[var9 + var6 - (var5 + 1) * 128];
               }

               if(var8 >= 0) {
                  class48.field365[var9 + var6] = var7 / (var5 * 2 + 1);
               }
            }
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([BI)Lcz;",
      garbageValue = "-1798562082"
   )
   static class252 method5152(byte[] var0) {
      class252 var1 = new class252();
      Buffer var2 = new Buffer(var0);
      var2.field1073 = var2.field1074.length - 2;
      int var3 = var2.readUnsignedShort();
      int var4 = var2.field1074.length - 2 - var3 - 12;
      var2.field1073 = var4;
      int var5 = var2.readInt();
      var1.field2493 = var2.readUnsignedShort();
      var1.field2502 = var2.readUnsignedShort();
      var1.field2495 = var2.readUnsignedShort();
      var1.field2494 = var2.readUnsignedShort();
      int var6 = var2.readUnsignedByte();
      int var7;
      int var8;
      if(var6 > 0) {
         var1.field2497 = var1.method4512(var6);

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

            class46 var13 = new class46(var9);
            var1.field2497[var7] = var13;

            while(var8-- > 0) {
               var11 = var2.readInt();
               int var12 = var2.readInt();
               var13.method794(new class262(var12), (long)var11);
            }
         }
      }

      var2.field1073 = 0;
      var2.method1913();
      var1.field2499 = new int[var5];
      var1.field2491 = new int[var5];
      var1.field2492 = new String[var5];

      for(var7 = 0; var2.field1073 < var4; var1.field2499[var7++] = var8) {
         var8 = var2.readUnsignedShort();
         if(var8 == 3) {
            var1.field2492[var7] = var2.readString();
         } else if(var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
            var1.field2491[var7] = var2.readInt();
         } else {
            var1.field2491[var7] = var2.readUnsignedByte();
         }
      }

      return var1;
   }

   @ObfuscatedName("fs")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-1081380217"
   )
   static final void method5154(boolean var0) {
      for(int var1 = 0; var1 < client.field3775; ++var1) {
         class237 var2 = client.field3774[client.field3776[var1]];
         if(var2 != null && var2.vmethod4190() && var2.field2400.field2163 == var0 && var2.field2400.method3956()) {
            int var3 = var2.field1277 >> 7;
            int var4 = var2.field1259 >> 7;
            if(var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
               if(var2.field1262 == 1 && (var2.field1277 & 127) == 64 && (var2.field1259 & 127) == 64) {
                  if(client.field3893[var3][var4] == client.field3830) {
                     continue;
                  }

                  client.field3893[var3][var4] = client.field3830;
               }

               long var5 = class216.method3818(0, 0, 1, !var2.field2400.field2171, client.field3776[var1]);
               var2.field1263 = client.field3744;
               class258.field2566.method5342(class315.plane, var2.field1277, var2.field1259, class7.method85(var2.field1262 * 64 - 64 + var2.field1277, var2.field1262 * 64 - 64 + var2.field1259, class315.plane), var2.field1262 * 64 - 64 + 60, var2, var2.field1260, var5, var2.field1261);
            }
         }
      }

   }
}
