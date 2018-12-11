package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("kn")
public final class class299 extends class190 {
   public class299(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   public class299(byte[] var1) {
      super(var1);
   }

   @ObfuscatedName("l")
   final void vmethod5826(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var3 * Rasterizer2D.field2119 + var2;
      int var9 = Rasterizer2D.field2119 - var4;
      int var10 = 0;
      int var11 = 0;
      int var12;
      if(var3 < Rasterizer2D.field2122) {
         var12 = Rasterizer2D.field2122 - var3;
         var5 -= var12;
         var3 = Rasterizer2D.field2122;
         var11 += var12 * var4;
         var8 += var12 * Rasterizer2D.field2119;
      }

      if(var3 + var5 > Rasterizer2D.field2123) {
         var5 -= var3 + var5 - Rasterizer2D.field2123;
      }

      if(var2 < Rasterizer2D.field2124) {
         var12 = Rasterizer2D.field2124 - var2;
         var4 -= var12;
         var2 = Rasterizer2D.field2124;
         var11 += var12;
         var8 += var12;
         var10 += var12;
         var9 += var12;
      }

      if(var2 + var4 > Rasterizer2D.field2125) {
         var12 = var2 + var4 - Rasterizer2D.field2125;
         var4 -= var12;
         var10 += var12;
         var9 += var12;
      }

      if(var4 > 0 && var5 > 0) {
         class190.method3814(Rasterizer2D.field2121, var1, var6, var11, var8, var4, var5, var9, var10, var7);
      }
   }

   @ObfuscatedName("f")
   final void vmethod5828(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var3 * Rasterizer2D.field2119 + var2;
      int var8 = Rasterizer2D.field2119 - var4;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if(var3 < Rasterizer2D.field2122) {
         var11 = Rasterizer2D.field2122 - var3;
         var5 -= var11;
         var3 = Rasterizer2D.field2122;
         var10 += var11 * var4;
         var7 += var11 * Rasterizer2D.field2119;
      }

      if(var3 + var5 > Rasterizer2D.field2123) {
         var5 -= var3 + var5 - Rasterizer2D.field2123;
      }

      if(var2 < Rasterizer2D.field2124) {
         var11 = Rasterizer2D.field2124 - var2;
         var4 -= var11;
         var2 = Rasterizer2D.field2124;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if(var2 + var4 > Rasterizer2D.field2125) {
         var11 = var2 + var4 - Rasterizer2D.field2125;
         var4 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if(var4 > 0 && var5 > 0) {
         class190.method3883(Rasterizer2D.field2121, var1, var6, var10, var7, var4, var5, var8, var9);
      }
   }
}
