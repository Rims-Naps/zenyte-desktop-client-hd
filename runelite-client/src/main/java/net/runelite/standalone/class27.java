package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
public class class27 {
   @ObfuscatedName("p")
   static float field277;
   @ObfuscatedName("c")
   static int[][] field268;
   @ObfuscatedName("r")
   static int field275;
   @ObfuscatedName("a")
   static float[][] field273;
   @ObfuscatedName("s")
   int[][][] field270;
   @ObfuscatedName("f")
   int[] field274;
   @ObfuscatedName("e")
   int[] field271;
   @ObfuscatedName("w")
   int[][][] field269;

   static {
      field273 = new float[2][8];
      field268 = new int[2][8];
   }

   class27() {
      this.field274 = new int[2];
      this.field269 = new int[2][2][4];
      this.field270 = new int[2][2][4];
      this.field271 = new int[2];
   }

   @ObfuscatedName("s")
   int method480(int var1, float var2) {
      float var3;
      if(var1 == 0) {
         var3 = (float)this.field271[0] + (float)(this.field271[1] - this.field271[0]) * var2;
         var3 *= 0.0030517578F;
         field277 = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
         field275 = (int)(field277 * 65536.0F);
      }

      if(this.field274[var1] == 0) {
         return 0;
      } else {
         var3 = this.method478(var1, 0, var2);
         field273[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.method466(var1, 0, var2));
         field273[var1][1] = var3 * var3;

         int var4;
         for(var4 = 1; var4 < this.field274[var1]; ++var4) {
            var3 = this.method478(var1, var4, var2);
            float var5 = -2.0F * var3 * (float)Math.cos((double)this.method466(var1, var4, var2));
            float var6 = var3 * var3;
            field273[var1][var4 * 2 + 1] = field273[var1][var4 * 2 - 1] * var6;
            field273[var1][var4 * 2] = field273[var1][var4 * 2 - 1] * var5 + field273[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               field273[var1][var7] += field273[var1][var7 - 1] * var5 + field273[var1][var7 - 2] * var6;
            }

            field273[var1][1] += field273[var1][0] * var5 + var6;
            field273[var1][0] += var5;
         }

         if(var1 == 0) {
            for(var4 = 0; var4 < this.field274[0] * 2; ++var4) {
               field273[0][var4] *= field277;
            }
         }

         for(var4 = 0; var4 < this.field274[var1] * 2; ++var4) {
            field268[var1][var4] = (int)(field273[var1][var4] * 65536.0F);
         }

         return this.field274[var1] * 2;
      }
   }

   @ObfuscatedName("f")
   float method478(int var1, int var2, float var3) {
      float var4 = (float)this.field270[var1][0][var2] + var3 * (float)(this.field270[var1][1][var2] - this.field270[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Lgm;Lcl;)V"
   )
   final void method468(Buffer var1, class46 var2) {
      int var3 = var1.readUnsignedByte();
      this.field274[0] = var3 >> 4;
      this.field274[1] = var3 & 15;
      if(var3 != 0) {
         this.field271[0] = var1.readUnsignedShort();
         this.field271[1] = var1.readUnsignedShort();
         int var4 = var1.readUnsignedByte();

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.field274[var5]; ++var6) {
               this.field269[var5][0][var6] = var1.readUnsignedShort();
               this.field270[var5][0][var6] = var1.readUnsignedShort();
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.field274[var5]; ++var6) {
               if((var4 & 1 << var5 * 4 << var6) != 0) {
                  this.field269[var5][1][var6] = var1.readUnsignedShort();
                  this.field270[var5][1][var6] = var1.readUnsignedShort();
               } else {
                  this.field269[var5][1][var6] = this.field269[var5][0][var6];
                  this.field270[var5][1][var6] = this.field270[var5][0][var6];
               }
            }
         }

         if(var4 != 0 || this.field271[1] != this.field271[0]) {
            var2.method881(var1);
         }
      } else {
         int[] var7 = this.field271;
         this.field271[1] = 0;
         var7[0] = 0;
      }

   }

   @ObfuscatedName("w")
   float method466(int var1, int var2, float var3) {
      float var4 = (float)this.field269[var1][0][var2] + var3 * (float)(this.field269[var1][1][var2] - this.field269[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return method465(var4);
   }

   @ObfuscatedName("l")
   static float method465(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }
}
