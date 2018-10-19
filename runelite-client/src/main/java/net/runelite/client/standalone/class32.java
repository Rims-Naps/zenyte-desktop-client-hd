package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.rs.api.RSIndexedSprite;

@ObfuscatedName("le")
public final class class32 extends class89 implements RSIndexedSprite {
   @ObfuscatedName("f")
   public byte[] field258;
   @ObfuscatedName("p")
   public int field262;
   @ObfuscatedName("c")
   public int field261;
   @ObfuscatedName("e")
   public int field259;
   @ObfuscatedName("l")
   public int[] field256;
   @ObfuscatedName("s")
   public int field260;
   @ObfuscatedName("a")
   public int field255;
   @ObfuscatedName("w")
   public int field257;

   @ObfuscatedName("f")
   public void method531() {
      if(this.field257 != this.field261 || this.field260 != this.field262) {
         byte[] var1 = new byte[this.field261 * this.field262];
         int var2 = 0;

         for(int var3 = 0; var3 < this.field260; ++var3) {
            for(int var4 = 0; var4 < this.field257; ++var4) {
               var1[var4 + (var3 + this.field255) * this.field261 + this.field259] = this.field258[var2++];
            }
         }

         this.field258 = var1;
         this.field257 = this.field261;
         this.field260 = this.field262;
         this.field259 = 0;
         this.field255 = 0;
      }
   }

   @ObfuscatedName("e")
   public void method542(int var1, int var2, int var3, int var4) {
      int var5 = this.field257;
      int var6 = this.field260;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.field261;
      int var10 = this.field262;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if(this.field259 > 0) {
         var13 = (var11 + (this.field259 << 16) - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.field259 << 16);
      }

      if(this.field255 > 0) {
         var13 = (var12 + (this.field255 << 16) - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (this.field255 << 16);
      }

      if(var5 < var9) {
         var3 = (var11 + ((var5 << 16) - var7) - 1) / var11;
      }

      if(var6 < var10) {
         var4 = (var12 + ((var6 << 16) - var8) - 1) / var12;
      }

      var13 = var1 + var2 * class89.field862;
      int var14 = class89.field862 - var3;
      if(var2 + var4 > class89.field866) {
         var4 -= var2 + var4 - class89.field866;
      }

      int var15;
      if(var2 < class89.field865) {
         var15 = class89.field865 - var2;
         var4 -= var15;
         var13 += var15 * class89.field862;
         var8 += var12 * var15;
      }

      if(var3 + var1 > class89.field868) {
         var15 = var3 + var1 - class89.field868;
         var3 -= var15;
         var14 += var15;
      }

      if(var1 < class89.field867) {
         var15 = class89.field867 - var1;
         var3 -= var15;
         var13 += var15;
         var7 += var11 * var15;
         var14 += var15;
      }

      method535(class89.field864, this.field258, this.field256, var7, var8, var13, var14, var3, var4, var11, var12, var5);
   }

   @ObfuscatedName("l")
   public void method532(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field256.length; ++var4) {
         int var5 = this.field256[var4] >> 16 & 255;
         var5 += var1;
         if(var5 < 0) {
            var5 = 0;
         } else if(var5 > 255) {
            var5 = 255;
         }

         int var6 = this.field256[var4] >> 8 & 255;
         var6 += var2;
         if(var6 < 0) {
            var6 = 0;
         } else if(var6 > 255) {
            var6 = 255;
         }

         int var7 = this.field256[var4] & 255;
         var7 += var3;
         if(var7 < 0) {
            var7 = 0;
         } else if(var7 > 255) {
            var7 = 255;
         }

         this.field256[var4] = var7 + (var6 << 8) + (var5 << 16);
      }

   }

   @ObfuscatedName("w")
   public void method530(int var1, int var2) {
      var1 += this.field259;
      var2 += this.field255;
      int var3 = var1 + var2 * class89.field862;
      int var4 = 0;
      int var5 = this.field260;
      int var6 = this.field257;
      int var7 = class89.field862 - var6;
      int var8 = 0;
      int var9;
      if(var2 < class89.field865) {
         var9 = class89.field865 - var2;
         var5 -= var9;
         var2 = class89.field865;
         var4 += var9 * var6;
         var3 += var9 * class89.field862;
      }

      if(var5 + var2 > class89.field866) {
         var5 -= var5 + var2 - class89.field866;
      }

      if(var1 < class89.field867) {
         var9 = class89.field867 - var1;
         var6 -= var9;
         var1 = class89.field867;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 + var1 > class89.field868) {
         var9 = var6 + var1 - class89.field868;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 > 0 && var5 > 0) {
         method541(class89.field864, this.field258, this.field256, var4, var3, var6, var5, var7, var8);
      }
   }

   public void setPixels(byte[] var1) {
      this.field258 = var1;
   }

   public byte[] getPixels() {
      return this.field258;
   }

   public void setPalette(int[] var1) {
      this.field256 = var1;
   }

   public int[] getPalette() {
      return this.field256;
   }

   public void setWidth(int var1) {
      this.field257 = var1;
   }

   public int getWidth() {
      return this.field257;
   }

   public void setHeight(int var1) {
      this.field260 = var1;
   }

   public int getHeight() {
      return this.field260;
   }

   public void setOffsetX(int var1) {
      this.field259 = var1;
   }

   public int getOffsetX() {
      return this.field259;
   }

   public void setOffsetY(int var1) {
      this.field255 = var1;
   }

   public int getOffsetY() {
      return this.field255;
   }

   public void setOriginalWidth(int var1) {
      this.field261 = var1;
   }

   public int getOriginalWidth() {
      return this.field261;
   }

   public void setOriginalHeight(int var1) {
      this.field262 = var1;
   }

   public int getOriginalHeight() {
      return this.field262;
   }

   @ObfuscatedName("c")
   static void method535(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = var11 * (var4 >> 16);

         for(int var15 = -var7; var15 < 0; ++var15) {
            byte var16 = var1[(var3 >> 16) + var14];
            if(var16 != 0) {
               var0[var5++] = var2[var16 & 255];
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
   static void method541(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         byte var12;
         for(var11 = var9; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }
}
