package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public class class253 {
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      longValue = -8064578899792517985L
   )
   static long field3338;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      longValue = -4800651462629328071L
   )
   static long field3340;

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "-1561003737"
   )
   static void method5080(byte[] var0) {
      Buffer var1 = new Buffer(var0);
      var1.position = var0.length - 2;
      class212.field2926 = var1.readUnsignedShort();
      class42.field476 = new int[class212.field2926];
      class212.field2925 = new int[class212.field2926];
      class212.field2922 = new int[class212.field2926];
      class192.field2745 = new int[class212.field2926];
      class191.field2740 = new byte[class212.field2926][];
      var1.position = var0.length - 7 - class212.field2926 * 8;
      class212.field2927 = var1.readUnsignedShort();
      class212.field2924 = var1.readUnsignedShort();
      int var2 = (var1.readUnsignedByte() & 255) + 1;

      int var3;
      for(var3 = 0; var3 < class212.field2926; ++var3) {
         class42.field476[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class212.field2926; ++var3) {
         class212.field2925[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class212.field2926; ++var3) {
         class212.field2922[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class212.field2926; ++var3) {
         class192.field2745[var3] = var1.readUnsignedShort();
      }

      var1.position = var0.length - 7 - class212.field2926 * 8 - (var2 - 1) * 3;
      class225.field3040 = new int[var2];

      for(var3 = 1; var3 < var2; ++var3) {
         class225.field3040[var3] = var1.method2260();
         if(class225.field3040[var3] == 0) {
            class225.field3040[var3] = 1;
         }
      }

      var1.position = 0;

      for(var3 = 0; var3 < class212.field2926; ++var3) {
         int var4 = class212.field2922[var3];
         int var5 = class192.field2745[var3];
         int var6 = var4 * var5;
         byte[] var7 = new byte[var6];
         class191.field2740[var3] = var7;
         int var8 = var1.readUnsignedByte();
         int var9;
         if(var8 == 0) {
            for(var9 = 0; var9 < var6; ++var9) {
               var7[var9] = var1.method2257();
            }
         } else if(var8 == 1) {
            for(var9 = 0; var9 < var4; ++var9) {
               for(int var10 = 0; var10 < var5; ++var10) {
                  var7[var9 + var4 * var10] = var1.method2257();
               }
            }
         }
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "([BIIIIIIILdh;[Lfr;I)V",
      garbageValue = "1846703706"
   )
   static final void method5079(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class111 var8, class3[] var9) {
      Buffer var10 = new Buffer(var0);
      int var11 = -1;

      while(true) {
         int var12 = var10.method2315();
         if(var12 == 0) {
            return;
         }

         var11 += var12;
         int var13 = 0;

         while(true) {
            int var14 = var10.method2270();
            if(var14 == 0) {
               break;
            }

            var13 += var14 - 1;
            int var15 = var13 & 63;
            int var16 = var13 >> 6 & 63;
            int var17 = var13 >> 12;
            int var18 = var10.readUnsignedByte();
            int var19 = var18 >> 2;
            int var20 = var18 & 3;
            if(var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
               ObjectDef var21 = class285.getObjectDef(var11);
               int var22 = var2 + class194.method3929(var16 & 7, var15 & 7, var7, var21.field150, var21.field193, var20);
               int var23 = var3 + WorldMapManager.method4158(var16 & 7, var15 & 7, var7, var21.field150, var21.field193, var20);
               if(var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                  int var24 = var1;
                  if((class185.field2512[1][var22][var23] & 2) == 2) {
                     var24 = var1 - 1;
                  }

                  class3 var25 = null;
                  if(var24 >= 0) {
                     var25 = var9[var24];
                  }

                  class35.method624(var1, var22, var23, var11, var20 + var7 & 3, var19, var8, var25);
               }
            }
         }
      }
   }
}
