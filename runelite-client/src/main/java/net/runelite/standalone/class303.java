package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.rs.api.RSIndexedSprite;

@ObfuscatedName("le")
public final class class303 extends Rasterizer2D implements RSIndexedSprite {
   @ObfuscatedName("p")
   public int field3764;
   @ObfuscatedName("c")
   public int field3763;
   @ObfuscatedName("l")
   public int[] field3758;
   @ObfuscatedName("s")
   public int field3762;
   @ObfuscatedName("f")
   public byte[] field3760;
   @ObfuscatedName("a")
   public int field3757;
   @ObfuscatedName("e")
   public int field3761;
   @ObfuscatedName("w")
   public int field3759;

   @ObfuscatedName("l")
   public void method5982(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field3758.length; ++var4) {
         int var5 = this.field3758[var4] >> 16 & 255;
         var5 += var1;
         if(var5 < 0) {
            var5 = 0;
         } else if(var5 > 255) {
            var5 = 255;
         }

         int var6 = this.field3758[var4] >> 8 & 255;
         var6 += var2;
         if(var6 < 0) {
            var6 = 0;
         } else if(var6 > 255) {
            var6 = 255;
         }

         int var7 = this.field3758[var4] & 255;
         var7 += var3;
         if(var7 < 0) {
            var7 = 0;
         } else if(var7 > 255) {
            var7 = 255;
         }

         this.field3758[var4] = var7 + (var6 << 8) + (var5 << 16);
      }

   }

   @ObfuscatedName("f")
   public void method5981() {
      if(this.field3759 != this.field3763 || this.field3762 != this.field3764) {
         byte[] var1 = new byte[this.field3763 * this.field3764];
         int var2 = 0;

         for(int var3 = 0; var3 < this.field3762; ++var3) {
            for(int var4 = 0; var4 < this.field3759; ++var4) {
               var1[var4 + (var3 + this.field3757) * this.field3763 + this.field3761] = this.field3760[var2++];
            }
         }

         this.field3760 = var1;
         this.field3759 = this.field3763;
         this.field3762 = this.field3764;
         this.field3761 = 0;
         this.field3757 = 0;
      }
   }

   public void setPixels(byte[] var1) {
      this.field3760 = var1;
   }

   public byte[] getPixels() {
      return this.field3760;
   }

   public void setPalette(int[] var1) {
      this.field3758 = var1;
   }

   public int[] getPalette() {
      return this.field3758;
   }

   public void setWidth(int var1) {
      this.field3759 = var1;
   }

   public int getWidth() {
      return this.field3759;
   }

   public void setHeight(int var1) {
      this.field3762 = var1;
   }

   public int getHeight() {
      return this.field3762;
   }

   public void setOffsetX(int var1) {
      this.field3761 = var1;
   }

   public int getOffsetX() {
      return this.field3761;
   }

   public void setOffsetY(int var1) {
      this.field3757 = var1;
   }

   public int getOffsetY() {
      return this.field3757;
   }

   public void setOriginalWidth(int var1) {
      this.field3763 = var1;
   }

   public int getOriginalWidth() {
      return this.field3763;
   }

   public void setOriginalHeight(int var1) {
      this.field3764 = var1;
   }

   public int getOriginalHeight() {
      return this.field3764;
   }

   @ObfuscatedName("e")
   public void method5992(int var1, int var2, int var3, int var4) {
      int var5 = this.field3759;
      int var6 = this.field3762;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.field3763;
      int var10 = this.field3764;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if(this.field3761 > 0) {
         var13 = (var11 + (this.field3761 << 16) - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.field3761 << 16);
      }

      if(this.field3757 > 0) {
         var13 = (var12 + (this.field3757 << 16) - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (this.field3757 << 16);
      }

      if(var5 < var9) {
         var3 = (var11 + ((var5 << 16) - var7) - 1) / var11;
      }

      if(var6 < var10) {
         var4 = (var12 + ((var6 << 16) - var8) - 1) / var12;
      }

      var13 = var1 + var2 * Rasterizer2D.field2119;
      int var14 = Rasterizer2D.field2119 - var3;
      if(var2 + var4 > Rasterizer2D.field2123) {
         var4 -= var2 + var4 - Rasterizer2D.field2123;
      }

      int var15;
      if(var2 < Rasterizer2D.field2122) {
         var15 = Rasterizer2D.field2122 - var2;
         var4 -= var15;
         var13 += var15 * Rasterizer2D.field2119;
         var8 += var12 * var15;
      }

      if(var3 + var1 > Rasterizer2D.field2125) {
         var15 = var3 + var1 - Rasterizer2D.field2125;
         var3 -= var15;
         var14 += var15;
      }

      if(var1 < Rasterizer2D.field2124) {
         var15 = Rasterizer2D.field2124 - var1;
         var3 -= var15;
         var13 += var15;
         var7 += var11 * var15;
         var14 += var15;
      }

      method5985(Rasterizer2D.field2121, this.field3760, this.field3758, var7, var8, var13, var14, var3, var4, var11, var12, var5);
   }

   @ObfuscatedName("w")
   public void method5980(int var1, int var2) {
      var1 += this.field3761;
      var2 += this.field3757;
      int var3 = var1 + var2 * Rasterizer2D.field2119;
      int var4 = 0;
      int var5 = this.field3762;
      int var6 = this.field3759;
      int var7 = Rasterizer2D.field2119 - var6;
      int var8 = 0;
      int var9;
      if(var2 < Rasterizer2D.field2122) {
         var9 = Rasterizer2D.field2122 - var2;
         var5 -= var9;
         var2 = Rasterizer2D.field2122;
         var4 += var9 * var6;
         var3 += var9 * Rasterizer2D.field2119;
      }

      if(var5 + var2 > Rasterizer2D.field2123) {
         var5 -= var5 + var2 - Rasterizer2D.field2123;
      }

      if(var1 < Rasterizer2D.field2124) {
         var9 = Rasterizer2D.field2124 - var1;
         var6 -= var9;
         var1 = Rasterizer2D.field2124;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 + var1 > Rasterizer2D.field2125) {
         var9 = var6 + var1 - Rasterizer2D.field2125;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 > 0 && var5 > 0) {
         method5991(Rasterizer2D.field2121, this.field3760, this.field3758, var4, var3, var6, var5, var7, var8);
      }
   }

   @ObfuscatedName("c")
   static void method5985(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = var11 * (var4 >> 16);

         for(int var15 = -var7; var15 < 0; ++var15) {
            byte var16 = var1[(var3 >> 16) + var14];
            if(var16 != 0) {
               var0[var5++] = var2[var16 & 255] | -16777216;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }

   }

   @ObfuscatedName("s")
   static void method5991(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         byte var12;
         for(var11 = var9; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255] | -16777216;
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255] | -16777216;
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255] | -16777216;
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255] | -16777216;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255] | -16777216;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }
}
