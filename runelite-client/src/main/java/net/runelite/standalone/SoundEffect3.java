package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
public class SoundEffect3 {
   @ObfuscatedName("l")
   static float[][] minimisedCoefficients;
   @ObfuscatedName("w")
   static float fowardMinimisedCoefficientMultiplier;
   @ObfuscatedName("b")
   static int[][] coefficients;
   @ObfuscatedName("n")
   static int fowardMultiplier;
   @ObfuscatedName("e")
   int[][][] phases;
   @ObfuscatedName("q")
   int[][][] magnitudes;
   @ObfuscatedName("c")
   int[] unity;
   @ObfuscatedName("g")
   int[] pairs;

   static {
      minimisedCoefficients = new float[2][8];
      coefficients = new int[2][8];
   }

   SoundEffect3() {
      this.pairs = new int[2];
      this.phases = new int[2][2][4];
      this.magnitudes = new int[2][2][4];
      this.unity = new int[2];
   }

   @ObfuscatedName("e")
   float method1059(int var1, int var2, float var3) {
      float var4 = (float)this.phases[var1][0][var2] + var3 * (float)(this.phases[var1][1][var2] - this.phases[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return method1072(var4);
   }

   @ObfuscatedName("q")
   int method1073(int var1, float var2) {
      float var3;
      if(var1 == 0) {
         var3 = (float)this.unity[0] + (float)(this.unity[1] - this.unity[0]) * var2;
         var3 *= 0.0030517578F;
         fowardMinimisedCoefficientMultiplier = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
         fowardMultiplier = (int)(fowardMinimisedCoefficientMultiplier * 65536.0F);
      }

      if(this.pairs[var1] == 0) {
         return 0;
      } else {
         var3 = this.method1057(var1, 0, var2);
         minimisedCoefficients[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.method1059(var1, 0, var2));
         minimisedCoefficients[var1][1] = var3 * var3;

         int var4;
         for(var4 = 1; var4 < this.pairs[var1]; ++var4) {
            var3 = this.method1057(var1, var4, var2);
            float var5 = -2.0F * var3 * (float)Math.cos((double)this.method1059(var1, var4, var2));
            float var6 = var3 * var3;
            minimisedCoefficients[var1][var4 * 2 + 1] = minimisedCoefficients[var1][var4 * 2 - 1] * var6;
            minimisedCoefficients[var1][var4 * 2] = minimisedCoefficients[var1][var4 * 2 - 1] * var5 + minimisedCoefficients[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               minimisedCoefficients[var1][var7] += minimisedCoefficients[var1][var7 - 1] * var5 + minimisedCoefficients[var1][var7 - 2] * var6;
            }

            minimisedCoefficients[var1][1] += minimisedCoefficients[var1][0] * var5 + var6;
            minimisedCoefficients[var1][0] += var5;
         }

         if(var1 == 0) {
            for(var4 = 0; var4 < this.pairs[0] * 2; ++var4) {
               minimisedCoefficients[0][var4] *= fowardMinimisedCoefficientMultiplier;
            }
         }

         for(var4 = 0; var4 < this.pairs[var1] * 2; ++var4) {
            coefficients[var1][var4] = (int)(minimisedCoefficients[var1][var4] * 65536.0F);
         }

         return this.pairs[var1] * 2;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lgl;Lcj;)V"
   )
   final void method1061(Buffer var1, AudioEnvelope var2) {
      int var3 = var1.readUnsignedByte();
      this.pairs[0] = var3 >> 4;
      this.pairs[1] = var3 & 15;
      if(var3 != 0) {
         this.unity[0] = var1.method6080();
         this.unity[1] = var1.method6080();
         int var4 = var1.readUnsignedByte();

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.pairs[var5]; ++var6) {
               this.phases[var5][0][var6] = var1.method6080();
               this.magnitudes[var5][0][var6] = var1.method6080();
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.pairs[var5]; ++var6) {
               if((var4 & 1 << var5 * 4 << var6) != 0) {
                  this.phases[var5][1][var6] = var1.method6080();
                  this.magnitudes[var5][1][var6] = var1.method6080();
               } else {
                  this.phases[var5][1][var6] = this.phases[var5][0][var6];
                  this.magnitudes[var5][1][var6] = this.magnitudes[var5][0][var6];
               }
            }
         }

         if(var4 != 0 || this.unity[1] != this.unity[0]) {
            var2.method2168(var1);
         }
      } else {
         int[] var7 = this.unity;
         this.unity[1] = 0;
         var7[0] = 0;
      }

   }

   @ObfuscatedName("g")
   float method1057(int var1, int var2, float var3) {
      float var4 = (float)this.magnitudes[var1][0][var2] + var3 * (float)(this.magnitudes[var1][1][var2] - this.magnitudes[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }

   @ObfuscatedName("r")
   static float method1072(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }
}