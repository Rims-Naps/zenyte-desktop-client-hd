package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
public class class64 {
   @ObfuscatedName("gb")
   @ObfuscatedSignature(
      signature = "[Lle;"
   )
   static class303[] field748;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1396018901
   )
   int field743;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -270990651
   )
   int field744;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 2128822717
   )
   int field745;

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IB)Ljava/lang/String;",
      garbageValue = "-69"
   )
   static String method1354(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIIIIZI)Llp;",
      garbageValue = "1331080378"
   )
   public static final SpritePixels method1356(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if(var1 == -1) {
         var4 = 0;
      } else if(var4 == 2 && var1 != 1) {
         var4 = 1;
      }

      long var6 = ((long)var1 << 16) + (long)var0 + ((long)var2 << 38) + ((long)var4 << 40) + ((long)var3 << 42);
      SpritePixels var8;
      if(!var5) {
         var8 = (SpritePixels)class42.field449.method1813(var6);
         if(var8 != null) {
            return var8;
         }
      }

      class42 var9 = class164.method3014(var0);
      if(var1 > 1 && var9.field468 != null) {
         int var10 = -1;

         for(int var11 = 0; var11 < 10; ++var11) {
            if(var1 >= var9.field461[var11] && var9.field461[var11] != 0) {
               var10 = var9.field468[var11];
            }
         }

         if(var10 != -1) {
            var9 = class164.method3014(var10);
         }
      }

      class52 var19 = var9.method777(1);
      if(var19 == null) {
         return null;
      } else {
         SpritePixels var20 = null;
         if(var9.field456 != -1) {
            var20 = method1356(var9.field462, 10, 1, 0, 0, true);
            if(var20 == null) {
               return null;
            }
         } else if(var9.field473 != -1) {
            var20 = method1356(var9.field472, var1, var2, var3, 0, false);
            if(var20 == null) {
               return null;
            }
         } else if(var9.field475 != -1) {
            var20 = method1356(var9.field474, var1, 0, 0, 0, false);
            if(var20 == null) {
               return null;
            }
         }

         int[] var12 = Rasterizer2D.field2121;
         int var13 = Rasterizer2D.field2119;
         int var14 = Rasterizer2D.field2120;
         int[] var15 = new int[4];
         Rasterizer2D.method3189(var15);
         var8 = new SpritePixels(36, 32);
         Rasterizer2D.method3136(var8.pixels, 36, 32);
         Rasterizer2D.method3137();
         class211.method4247();
         class211.method4250(16, 16);
         class211.field2898 = false;
         if(var9.field475 != -1) {
            var20.method215(0, 0);
         }

         int var16 = var9.field436;
         if(var5) {
            var16 = (int)((double)var16 * 1.5D);
         } else if(var2 == 2) {
            var16 = (int)(1.04D * (double)var16);
         }

         int var17 = var16 * class211.field2920[var9.field459] >> 16;
         int var18 = var16 * class211.field2914[var9.field459] >> 16;
         var19.method1126();
         var19.method1139(0, var9.field445, var9.field439, var9.field459, var9.field426, var19.field1143 / 2 + var17 + var9.field438, var18 + var9.field438);
         if(var9.field473 != -1) {
            var20.method215(0, 0);
         }

         if(var2 >= 1) {
            var8.method211(1);
         }

         if(var2 >= 2) {
            var8.method211(16777215);
         }

         if(var3 != 0) {
            var8.method284(var3);
         }

         Rasterizer2D.method3136(var8.pixels, 36, 32);
         if(var9.field456 != -1) {
            var20.method215(0, 0);
         }

         if(var4 == 1 || var4 == 2 && var9.field435 == 1) {
            class150.field1858.method3832(WorldMapManager.method4123(var1), 0, 9, 16776960, 1);
         }

         if(!var5) {
            class42.field449.method1820(var8, var6);
         }

         Rasterizer2D.method3136(var12, var13, var14);
         Rasterizer2D.method3141(var15);
         class211.method4247();
         class211.field2898 = true;
         return var8;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "97"
   )
   static final void method1355() {
      WorldMapData.method2707("You can\'t add yourself to your own friend list");
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1427355182"
   )
   public static void method1353(int var0) {
      class43.field481 = 1;
      class270.field3480 = null;
      class259.field3385 = -1;
      class177.field2443 = -1;
      class226.field3046 = 0;
      class113.field1296 = false;
      class89.field974 = var0;
   }
}
