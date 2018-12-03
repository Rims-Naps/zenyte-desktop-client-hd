package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSPacketBuffer;

@ObfuscatedName("gl")
public final class class1 extends Buffer implements RSPacketBuffer {
   @ObfuscatedName("m")
   static final int[] field12;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lgy;"
   )
   class216 field11;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -43768687
   )
   int field13;

   static {
      field12 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   }

   public class1(int var1) {
      super(var1);
   }

   @ObfuscatedName("im")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-17"
   )
   public void method6() {
      super.field1693 = (this.field13 + 7) / 8;
   }

   @ObfuscatedName("ih")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1575762707"
   )
   public boolean method38() {
      int var1 = super.field1694[super.field1693] - this.field11.method4383() & 255;
      return var1 >= 128;
   }

   @ObfuscatedName("ib")
   @ObfuscatedSignature(
      signature = "([II)V",
      garbageValue = "224415059"
   )
   public void method2(int[] var1) {
      this.field11 = new class216(var1);
   }

   @ObfuscatedName("io")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1058998792"
   )
   public int method12() {
      return super.field1694[++super.field1693 - 1] - this.field11.method4384() & 255;
   }

   @ObfuscatedName("ia")
   @ObfuscatedSignature(
      signature = "(Lgy;B)V",
      garbageValue = "0"
   )
   public void method5(class216 var1) {
      this.field11 = var1;
   }

   @ObfuscatedName("iu")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-764562175"
   )
   public int method17() {
      int var1 = super.field1694[++super.field1693 - 1] - this.field11.method4384() & 255;
      return var1 < 128?var1:(var1 - 128 << 8) + (super.field1694[++super.field1693 - 1] - this.field11.method4384() & 255);
   }

   @ObfuscatedName("ik")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1073609166"
   )
   public void method7() {
      this.field13 = super.field1693 * 8;
   }

   @ObfuscatedName("is")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1681788660"
   )
   public void method3(int var1) {
      super.field1694[++super.field1693 - 1] = (byte)(var1 + this.field11.method4384());
   }

   @ObfuscatedName("ij")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1294306232"
   )
   public int method10(int var1) {
      return var1 * 8 - this.field13;
   }

   @ObfuscatedName("ir")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "106373974"
   )
   public int method8(int var1) {
      int var2 = this.field13 >> 3;
      int var3 = 8 - (this.field13 & 7);
      int var4 = 0;

      for(this.field13 += var1; var1 > var3; var3 = 8) {
         var4 += (super.field1694[var2++] & field12[var3]) << var1 - var3;
         var1 -= var3;
      }

      if(var3 == var1) {
         var4 += super.field1694[var2] & field12[var3];
      } else {
         var4 += super.field1694[var2] >> var3 - var1 & field12[var1];
      }

      return var4;
   }

   @ObfuscatedName("iw")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "1064555028"
   )
   public void method0(byte[] var1, int var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         var1[var4 + var2] = (byte)(super.field1694[++super.field1693 - 1] - this.field11.method4384());
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-1612116768"
   )
   static int method4(int var0, class296 var1, boolean var2) {
      if(var0 == 3300) {
         class249.field3312[++class308.field3811 - 1] = client.field2165;
         return 1;
      } else {
         int var3;
         int var4;
         if(var0 == 3301) {
            class308.field3811 -= 2;
            var3 = class249.field3312[class308.field3811];
            var4 = class249.field3312[class308.field3811 + 1];
            class249.field3312[++class308.field3811 - 1] = class301.method5973(var3, var4);
            return 1;
         } else if(var0 == 3302) {
            class308.field3811 -= 2;
            var3 = class249.field3312[class308.field3811];
            var4 = class249.field3312[class308.field3811 + 1];
            class249.field3312[++class308.field3811 - 1] = GameEngine.method5863(var3, var4);
            return 1;
         } else if(var0 == 3303) {
            class308.field3811 -= 2;
            var3 = class249.field3312[class308.field3811];
            var4 = class249.field3312[class308.field3811 + 1];
            class249.field3312[++class308.field3811 - 1] = client.method3659(var3, var4);
            return 1;
         } else if(var0 == 3304) {
            var3 = class249.field3312[--class308.field3811];
            class249.field3312[++class308.field3811 - 1] = class183.method3708(var3).field1140;
            return 1;
         } else if(var0 == 3305) {
            var3 = class249.field3312[--class308.field3811];
            class249.field3312[++class308.field3811 - 1] = client.field2361[var3];
            return 1;
         } else if(var0 == 3306) {
            var3 = class249.field3312[--class308.field3811];
            class249.field3312[++class308.field3811 - 1] = client.field2286[var3];
            return 1;
         } else if(var0 == 3307) {
            var3 = class249.field3312[--class308.field3811];
            class249.field3312[++class308.field3811 - 1] = client.field2218[var3];
            return 1;
         } else {
            int var5;
            if(var0 == 3308) {
               var3 = class260.field3393;
               var4 = (class32.field303.field1090 >> 7) + class229.field3067;
               var5 = (class32.field303.field1072 >> 7) + class35.field360;
               class249.field3312[++class308.field3811 - 1] = (var4 << 14) + var5 + (var3 << 28);
               return 1;
            } else if(var0 == 3309) {
               var3 = class249.field3312[--class308.field3811];
               class249.field3312[++class308.field3811 - 1] = var3 >> 14 & 16383;
               return 1;
            } else if(var0 == 3310) {
               var3 = class249.field3312[--class308.field3811];
               class249.field3312[++class308.field3811 - 1] = var3 >> 28;
               return 1;
            } else if(var0 == 3311) {
               var3 = class249.field3312[--class308.field3811];
               class249.field3312[++class308.field3811 - 1] = var3 & 16383;
               return 1;
            } else if(var0 == 3312) {
               class249.field3312[++class308.field3811 - 1] = client.field2156?1:0;
               return 1;
            } else if(var0 == 3313) {
               class308.field3811 -= 2;
               var3 = class249.field3312[class308.field3811] + 32768;
               var4 = class249.field3312[class308.field3811 + 1];
               class249.field3312[++class308.field3811 - 1] = class301.method5973(var3, var4);
               return 1;
            } else if(var0 == 3314) {
               class308.field3811 -= 2;
               var3 = class249.field3312[class308.field3811] + 32768;
               var4 = class249.field3312[class308.field3811 + 1];
               class249.field3312[++class308.field3811 - 1] = GameEngine.method5863(var3, var4);
               return 1;
            } else if(var0 == 3315) {
               class308.field3811 -= 2;
               var3 = class249.field3312[class308.field3811] + 32768;
               var4 = class249.field3312[class308.field3811 + 1];
               class249.field3312[++class308.field3811 - 1] = client.method3659(var3, var4);
               return 1;
            } else if(var0 == 3316) {
               if(client.field2263 >= 2) {
                  class249.field3312[++class308.field3811 - 1] = client.field2263;
               } else {
                  class249.field3312[++class308.field3811 - 1] = 0;
               }

               return 1;
            } else if(var0 == 3317) {
               class249.field3312[++class308.field3811 - 1] = client.field2172;
               return 1;
            } else if(var0 == 3318) {
               class249.field3312[++class308.field3811 - 1] = client.field2206;
               return 1;
            } else if(var0 == 3321) {
               class249.field3312[++class308.field3811 - 1] = client.field2163;
               return 1;
            } else if(var0 == 3322) {
               class249.field3312[++class308.field3811 - 1] = client.field2321;
               return 1;
            } else if(var0 == 3323) {
               if(client.field2250) {
                  class249.field3312[++class308.field3811 - 1] = 1;
               } else {
                  class249.field3312[++class308.field3811 - 1] = 0;
               }

               return 1;
            } else if(var0 == 3324) {
               class249.field3312[++class308.field3811 - 1] = client.field2154;
               return 1;
            } else if(var0 == 3325) {
               class308.field3811 -= 4;
               var3 = class249.field3312[class308.field3811];
               var4 = class249.field3312[class308.field3811 + 1];
               var5 = class249.field3312[class308.field3811 + 2];
               int var6 = class249.field3312[class308.field3811 + 3];
               var3 += var4 << 14;
               var3 += var5 << 28;
               var3 += var6;
               class249.field3312[++class308.field3811 - 1] = var3;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }
}
