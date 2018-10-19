package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
public class class265 {
   @ObfuscatedName("r")
   static int field2926;
   @ObfuscatedName("p")
   static float field2928;
   @ObfuscatedName("c")
   static int[][] field2919;
   @ObfuscatedName("a")
   static float[][] field2924;
   @ObfuscatedName("f")
   int[] field2925;
   @ObfuscatedName("e")
   int[] field2922;
   @ObfuscatedName("s")
   int[][][] field2921;
   @ObfuscatedName("w")
   int[][][] field2920;

   static {
      field2924 = new float[2][8];
      field2919 = new int[2][8];
   }

   class265() {
      this.field2925 = new int[2];
      this.field2920 = new int[2][2][4];
      this.field2921 = new int[2][2][4];
      this.field2922 = new int[2];
   }

   @ObfuscatedName("f")
   float method4838(int var1, int var2, float var3) {
      float var4 = (float)this.field2921[var1][0][var2] + var3 * (float)(this.field2921[var1][1][var2] - this.field2921[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Lgm;Lcl;)V"
   )
   final void method4828(Buffer var1, class30 var2) {
      int var3 = var1.readUnsignedByte();
      this.field2925[0] = var3 >> 4;
      this.field2925[1] = var3 & 15;
      if(var3 != 0) {
         this.field2922[0] = var1.readUnsignedShort();
         this.field2922[1] = var1.readUnsignedShort();
         int var4 = var1.readUnsignedByte();

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.field2925[var5]; ++var6) {
               this.field2920[var5][0][var6] = var1.readUnsignedShort();
               this.field2921[var5][0][var6] = var1.readUnsignedShort();
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.field2925[var5]; ++var6) {
               if((var4 & 1 << var5 * 4 << var6) != 0) {
                  this.field2920[var5][1][var6] = var1.readUnsignedShort();
                  this.field2921[var5][1][var6] = var1.readUnsignedShort();
               } else {
                  this.field2920[var5][1][var6] = this.field2920[var5][0][var6];
                  this.field2921[var5][1][var6] = this.field2921[var5][0][var6];
               }
            }
         }

         if(var4 != 0 || this.field2922[1] != this.field2922[0]) {
            var2.method488(var1);
         }
      } else {
         int[] var7 = this.field2922;
         this.field2922[1] = 0;
         var7[0] = 0;
      }

   }

   @ObfuscatedName("s")
   int method4840(int var1, float var2) {
      float var3;
      if(var1 == 0) {
         var3 = (float)this.field2922[0] + (float)(this.field2922[1] - this.field2922[0]) * var2;
         var3 *= 0.0030517578F;
         field2928 = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
         field2926 = (int)(field2928 * 65536.0F);
      }

      if(this.field2925[var1] == 0) {
         return 0;
      } else {
         var3 = this.method4838(var1, 0, var2);
         field2924[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.method4826(var1, 0, var2));
         field2924[var1][1] = var3 * var3;

         int var4;
         for(var4 = 1; var4 < this.field2925[var1]; ++var4) {
            var3 = this.method4838(var1, var4, var2);
            float var5 = -2.0F * var3 * (float)Math.cos((double)this.method4826(var1, var4, var2));
            float var6 = var3 * var3;
            field2924[var1][var4 * 2 + 1] = field2924[var1][var4 * 2 - 1] * var6;
            field2924[var1][var4 * 2] = field2924[var1][var4 * 2 - 1] * var5 + field2924[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               field2924[var1][var7] += field2924[var1][var7 - 1] * var5 + field2924[var1][var7 - 2] * var6;
            }

            field2924[var1][1] += field2924[var1][0] * var5 + var6;
            field2924[var1][0] += var5;
         }

         if(var1 == 0) {
            for(var4 = 0; var4 < this.field2925[0] * 2; ++var4) {
               field2924[0][var4] *= field2928;
            }
         }

         for(var4 = 0; var4 < this.field2925[var1] * 2; ++var4) {
            field2919[var1][var4] = (int)(field2924[var1][var4] * 65536.0F);
         }

         return this.field2925[var1] * 2;
      }
   }

   @ObfuscatedName("w")
   float method4826(int var1, int var2, float var3) {
      float var4 = (float)this.field2920[var1][0][var2] + var3 * (float)(this.field2920[var1][1][var2] - this.field2920[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return method4825(var4);
   }

   @ObfuscatedName("l")
   static float method4825(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }
}
