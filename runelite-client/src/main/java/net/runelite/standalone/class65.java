package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSTexture;

@ObfuscatedName("du")
public class class65 extends class197 implements RSTexture {
   @ObfuscatedName("g")
   static int[] field764;
   @ObfuscatedName("z")
   int field751;
   @ObfuscatedName("p")
   int[] field757;
   @ObfuscatedName("c")
   int[] field756;
   @ObfuscatedName("r")
   int[] field758;
   @ObfuscatedName("m")
   int[] field750;
   public float rl$u;
   public float rl$v;
   @ObfuscatedName("x")
   int[] field761;
   @ObfuscatedName("v")
   boolean field763;
   @ObfuscatedName("d")
   int field760;
   @ObfuscatedName("a")
   boolean field759;
   @ObfuscatedName("e")
   int field754;

   @ObfuscatedSignature(
      signature = "(Lgm;)V"
   )
   class65(class125 var1) {
      this.field763 = false;
      this.field754 = var1.method2258();
      this.field759 = var1.method2256() == 1;
      int var2 = var1.method2256();
      if(var2 >= 1 && var2 <= 4) {
         this.field756 = new int[var2];

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            this.field756[var3] = var1.method2258();
         }

         if(var2 > 1) {
            this.field757 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field757[var3] = var1.method2256();
            }
         }

         if(var2 > 1) {
            this.field758 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field758[var3] = var1.method2256();
            }
         }

         this.field750 = new int[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            this.field750[var3] = var1.method2344();
         }

         this.field760 = var1.method2256();
         this.field751 = var1.method2256();
         this.field761 = null;
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("l")
   void method1366() {
      this.field761 = null;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(DILik;)Z"
   )
   boolean method1358(double var1, int var3, class217 var4) {
      int var5;
      for(var5 = 0; var5 < this.field756.length; ++var5) {
         if(var4.method4407(this.field756[var5]) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.field761 = new int[var5];

      for(int var6 = 0; var6 < this.field756.length; ++var6) {
         class303 var7 = class220.method4514(var4, this.field756[var6]);
         var7.method5981();
         byte[] var8 = var7.field3760;
         int[] var9 = var7.field3758;
         int var10 = this.field750[var6];
         if((var10 & -16777216) == 16777216) {
            ;
         }

         if((var10 & -16777216) == 33554432) {
            ;
         }

         int var11;
         int var12;
         int var13;
         int var14;
         if((var10 & -16777216) == 50331648) {
            var11 = var10 & 16711935;
            var12 = var10 >> 8 & 255;

            for(var13 = 0; var13 < var9.length; ++var13) {
               var14 = var9[var13];
               if(var14 >> 8 == (var14 & 65535)) {
                  var14 &= 255;
                  var9[var13] = var11 * var14 >> 8 & 16711935 | var12 * var14 & 65280;
               }
            }
         }

         for(var11 = 0; var11 < var9.length; ++var11) {
            var9[var11] = class211.method4254(var9[var11], var1);
         }

         if(var6 == 0) {
            var11 = 0;
         } else {
            var11 = this.field757[var6 - 1];
         }

         if(var11 == 0) {
            if(var3 == var7.field3759) {
               for(var12 = 0; var12 < var5; ++var12) {
                  this.field761[var12] = var9[var8[var12] & 255];
               }
            } else if(var7.field3759 == 64 && var3 == 128) {
               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.field761[var12++] = var9[var8[(var13 >> 1 << 6) + (var14 >> 1)] & 255];
                  }
               }
            } else {
               if(var7.field3759 != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.field761[var12++] = var9[var8[(var14 << 1) + (var13 << 1 << 7)] & 255];
                  }
               }
            }
         }

         if(var11 == 1) {
            ;
         }

         if(var11 == 2) {
            ;
         }

         if(var11 == 3) {
            ;
         }
      }

      return true;
   }

   public void copy$animate(int var1) {
      if(this.field761 != null) {
         short var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var10;
         if(this.field760 == 1 || this.field760 == 3) {
            if(field764 == null || field764.length < this.field761.length) {
               field764 = new int[this.field761.length];
            }

            if(this.field761.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field761.length;
            var4 = var2 * this.field751 * var1;
            var5 = var3 - 1;
            if(this.field760 == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               field764[var6] = this.field761[var7];
            }

            var10 = this.field761;
            this.field761 = field764;
            field764 = var10;
         }

         if(this.field760 == 2 || this.field760 == 4) {
            if(field764 == null || field764.length < this.field761.length) {
               field764 = new int[this.field761.length];
            }

            if(this.field761.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field761.length;
            var4 = this.field751 * var1;
            var5 = var2 - 1;
            if(this.field760 == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  field764[var8] = this.field761[var9];
               }
            }

            var10 = this.field761;
            this.field761 = field764;
            field764 = var10;
         }

      }
   }

   public float getU() {
      return this.rl$u;
   }

   public void setU(float var1) {
      this.rl$u = var1;
   }

   public float getV() {
      return this.rl$v;
   }

   public void setV(float var1) {
      this.rl$v = var1;
   }

   public int getAnimationDirection() {
      return this.field760;
   }

   public int getAnimationSpeed() {
      return this.field751;
   }

   public int[] getPixels() {
      return this.field761;
   }

   public boolean isLoaded() {
      return this.field763;
   }

   @ObfuscatedName("w")
   void method1360(int var1) {
      if(!class302.field3755.isGpu()) {
         this.copy$animate(var1);
      } else {
         class302.field3755.getDrawCallbacks().animate(this, var1);
      }
   }
}
