package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSPacketBuffer;

@ObfuscatedName("gl")
public final class class214 extends Buffer implements RSPacketBuffer {
   @ObfuscatedName("m")
   static final int[] field2067;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lgy;"
   )
   class298 field2066;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -43768687
   )
   int field2068;

   static {
      field2067 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   }

   public class214(int var1) {
      super(var1);
   }

   @ObfuscatedName("ia")
   @ObfuscatedSignature(
      signature = "(Lgy;B)V",
      garbageValue = "0"
   )
   public void method3758(class298 var1) {
      this.field2066 = var1;
   }

   @ObfuscatedName("ir")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "106373974"
   )
   public int readBits(int var1) {
      int var2 = this.field2068 >> 3;
      int var3 = 8 - (this.field2068 & 7);
      int var4 = 0;

      for(this.field2068 += var1; var1 > var3; var3 = 8) {
         var4 += (super.field1074[var2++] & field2067[var3]) << var1 - var3;
         var1 -= var3;
      }

      if(var3 == var1) {
         var4 += super.field1074[var2] & field2067[var3];
      } else {
         var4 += super.field1074[var2] >> var3 - var1 & field2067[var1];
      }

      return var4;
   }

   @ObfuscatedName("im")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-17"
   )
   public void method3759() {
      super.field1073 = (this.field2068 + 7) / 8;
   }

   @ObfuscatedName("io")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1058998792"
   )
   public int method3765() {
      return super.field1074[++super.field1073 - 1] - this.field2066.method5179() & 255;
   }

   @ObfuscatedName("ik")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1073609166"
   )
   public void method3760() {
      this.field2068 = super.field1073 * 8;
   }

   @ObfuscatedName("iu")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-764562175"
   )
   public int method3770() {
      int var1 = super.field1074[++super.field1073 - 1] - this.field2066.method5179() & 255;
      return var1 < 128?var1:(var1 - 128 << 8) + (super.field1074[++super.field1073 - 1] - this.field2066.method5179() & 255);
   }

   @ObfuscatedName("is")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1681788660"
   )
   public void method3756(int var1) {
      super.field1074[++super.field1073 - 1] = (byte)(var1 + this.field2066.method5179());
   }

   @ObfuscatedName("ij")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1294306232"
   )
   public int method3763(int var1) {
      return var1 * 8 - this.field2068;
   }

   @ObfuscatedName("ib")
   @ObfuscatedSignature(
      signature = "([II)V",
      garbageValue = "224415059"
   )
   public void method3755(int[] var1) {
      this.field2066 = new class298(var1);
   }

   @ObfuscatedName("ih")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1575762707"
   )
   public boolean method3791() {
      int var1 = super.field1074[super.field1073] - this.field2066.method5178() & 255;
      return var1 >= 128;
   }

   @ObfuscatedName("iw")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "1064555028"
   )
   public void method3753(byte[] var1, int var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         var1[var4 + var2] = (byte)(super.field1074[++super.field1073 - 1] - this.field2066.method5179());
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-1612116768"
   )
   static int method3757(int var0, class252 var1, boolean var2) {
      if(var0 == 3300) {
         class55.field407[++class171.field1587 - 1] = client.field3744;
         return 1;
      } else {
         int var3;
         int var4;
         if(var0 == 3301) {
            class171.field1587 -= 2;
            var3 = class55.field407[class171.field1587];
            var4 = class55.field407[class171.field1587 + 1];
            class55.field407[++class171.field1587 - 1] = class248.method4491(var3, var4);
            return 1;
         } else if(var0 == 3302) {
            class171.field1587 -= 2;
            var3 = class55.field407[class171.field1587];
            var4 = class55.field407[class171.field1587 + 1];
            class55.field407[++class171.field1587 - 1] = class181.method3055(var3, var4);
            return 1;
         } else if(var0 == 3303) {
            class171.field1587 -= 2;
            var3 = class55.field407[class171.field1587];
            var4 = class55.field407[class171.field1587 + 1];
            class55.field407[++class171.field1587 - 1] = client.method6375(var3, var4);
            return 1;
         } else if(var0 == 3304) {
            var3 = class55.field407[--class171.field1587];
            class55.field407[++class171.field1587 - 1] = class73.method1177(var3).field3278;
            return 1;
         } else if(var0 == 3305) {
            var3 = class55.field407[--class171.field1587];
            class55.field407[++class171.field1587 - 1] = client.field3940[var3];
            return 1;
         } else if(var0 == 3306) {
            var3 = class55.field407[--class171.field1587];
            class55.field407[++class171.field1587 - 1] = client.field3865[var3];
            return 1;
         } else if(var0 == 3307) {
            var3 = class55.field407[--class171.field1587];
            class55.field407[++class171.field1587 - 1] = client.field3797[var3];
            return 1;
         } else {
            int var5;
            if(var0 == 3308) {
               var3 = class315.plane;
               var4 = (class5.field43.field1277 >> 7) + class296.somex;
               var5 = (class5.field43.field1259 >> 7) + class284.somey;
               class55.field407[++class171.field1587 - 1] = (var4 << 14) + var5 + (var3 << 28);
               return 1;
            } else if(var0 == 3309) {
               var3 = class55.field407[--class171.field1587];
               class55.field407[++class171.field1587 - 1] = var3 >> 14 & 16383;
               return 1;
            } else if(var0 == 3310) {
               var3 = class55.field407[--class171.field1587];
               class55.field407[++class171.field1587 - 1] = var3 >> 28;
               return 1;
            } else if(var0 == 3311) {
               var3 = class55.field407[--class171.field1587];
               class55.field407[++class171.field1587 - 1] = var3 & 16383;
               return 1;
            } else if(var0 == 3312) {
               class55.field407[++class171.field1587 - 1] = client.field3735?1:0;
               return 1;
            } else if(var0 == 3313) {
               class171.field1587 -= 2;
               var3 = class55.field407[class171.field1587] + 32768;
               var4 = class55.field407[class171.field1587 + 1];
               class55.field407[++class171.field1587 - 1] = class248.method4491(var3, var4);
               return 1;
            } else if(var0 == 3314) {
               class171.field1587 -= 2;
               var3 = class55.field407[class171.field1587] + 32768;
               var4 = class55.field407[class171.field1587 + 1];
               class55.field407[++class171.field1587 - 1] = class181.method3055(var3, var4);
               return 1;
            } else if(var0 == 3315) {
               class171.field1587 -= 2;
               var3 = class55.field407[class171.field1587] + 32768;
               var4 = class55.field407[class171.field1587 + 1];
               class55.field407[++class171.field1587 - 1] = client.method6375(var3, var4);
               return 1;
            } else if(var0 == 3316) {
               if(client.field3842 >= 2) {
                  class55.field407[++class171.field1587 - 1] = client.field3842;
               } else {
                  class55.field407[++class171.field1587 - 1] = 0;
               }

               return 1;
            } else if(var0 == 3317) {
               class55.field407[++class171.field1587 - 1] = client.field3751;
               return 1;
            } else if(var0 == 3318) {
               class55.field407[++class171.field1587 - 1] = client.field3785;
               return 1;
            } else if(var0 == 3321) {
               class55.field407[++class171.field1587 - 1] = client.energy;
               return 1;
            } else if(var0 == 3322) {
               class55.field407[++class171.field1587 - 1] = client.weight;
               return 1;
            } else if(var0 == 3323) {
               if(client.field3829) {
                  class55.field407[++class171.field1587 - 1] = 1;
               } else {
                  class55.field407[++class171.field1587 - 1] = 0;
               }

               return 1;
            } else if(var0 == 3324) {
               class55.field407[++class171.field1587 - 1] = client.field3733;
               return 1;
            } else if(var0 == 3325) {
               class171.field1587 -= 4;
               var3 = class55.field407[class171.field1587];
               var4 = class55.field407[class171.field1587 + 1];
               var5 = class55.field407[class171.field1587 + 2];
               int var6 = class55.field407[class171.field1587 + 3];
               var3 += var4 << 14;
               var3 += var5 << 28;
               var3 += var6;
               class55.field407[++class171.field1587 - 1] = var3;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }
}
