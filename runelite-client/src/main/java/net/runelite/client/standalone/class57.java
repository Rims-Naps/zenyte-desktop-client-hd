package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
public class class57 implements class43 {
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "Lgm;"
   )
   public static Buffer field455;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 308599917
   )
   int field449;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 604673161
   )
   int field446;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1421718207
   )
   int field442;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1739877053
   )
   int field451;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 430032935
   )
   int field448;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1539397489
   )
   int field450;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1646699717
   )
   int field454;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1865314997
   )
   int field445;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1019092883
   )
   int field447;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -531319093
   )
   int field444;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lh;B)V",
      garbageValue = "-105"
   )
   public void vmethod3479(class87 var1) {
      if(var1.field793 > this.field450) {
         var1.field793 = this.field450;
      }

      if(var1.field794 < this.field450) {
         var1.field794 = this.field450;
      }

      if(var1.field789 > this.field447) {
         var1.field789 = this.field447;
      }

      if(var1.field796 < this.field447) {
         var1.field796 = this.field447;
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1680935148"
   )
   void method996() {
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "116686342"
   )
   public void vmethod3484(Buffer var1) {
      this.field449 = var1.readUnsignedByte();
      this.field454 = var1.readUnsignedByte();
      this.field444 = var1.readUnsignedShort();
      this.field448 = var1.readUnsignedByte();
      this.field445 = var1.readUnsignedShort();
      this.field451 = var1.readUnsignedByte();
      this.field450 = var1.readUnsignedShort();
      this.field442 = var1.readUnsignedByte();
      this.field447 = var1.readUnsignedShort();
      this.field446 = var1.readUnsignedByte();
      this.method996();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIB)Lhx;",
      garbageValue = "26"
   )
   public class34 vmethod3483(int var1, int var2) {
      if(!this.vmethod3489(var1, var2)) {
         return null;
      } else {
         int var3 = this.field444 * 64 - this.field450 * 64 + (this.field448 * 8 - this.field442 * 8) + var1;
         int var4 = this.field445 * 64 - this.field447 * 64 + var2 + (this.field451 * 8 - this.field446 * 8);
         return new class34(this.field449, var3, var4);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIIB)Z",
      garbageValue = "37"
   )
   public boolean vmethod3480(int var1, int var2, int var3) {
      return var1 >= this.field449 && var1 < this.field454 + this.field449?var2 >= (this.field444 << 6) + (this.field448 << 3) && var2 <= (this.field444 << 6) + (this.field448 << 3) + 7 && var3 >= (this.field445 << 6) + (this.field451 << 3) && var3 <= (this.field445 << 6) + (this.field451 << 3) + 7:false;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIII)[I",
      garbageValue = "-161024515"
   )
   public int[] vmethod3482(int var1, int var2, int var3) {
      if(!this.vmethod3480(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field450 * 64 - this.field444 * 64 + var2 + (this.field442 * 8 - this.field448 * 8), var3 + (this.field447 * 64 - this.field445 * 64) + (this.field446 * 8 - this.field451 * 8)};
         return var4;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)Z",
      garbageValue = "16"
   )
   public boolean vmethod3489(int var1, int var2) {
      return var1 >= (this.field450 << 6) + (this.field442 << 3) && var1 <= (this.field450 << 6) + (this.field442 << 3) + 7 && var2 >= (this.field447 << 6) + (this.field446 << 3) && var2 <= (this.field447 << 6) + (this.field446 << 3) + 7;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Lfl;",
      garbageValue = "224262395"
   )
   static class279 method1017() {
      return class279.field3022 == 0?new class279():class279.field3021[--class279.field3022];
   }

   @ObfuscatedName("gk")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-64"
   )
   static final void method1018(int var0, int var1) {
      class320 var2 = client.field3761[class315.plane][var0][var1];
      if(var2 == null) {
         class258.field2566.method5409(class315.plane, var0, var1);
      } else {
         long var3 = -99999999L;
         class161 var5 = null;

         class161 var6;
         for(var6 = (class161)var2.method5604(); var6 != null; var6 = (class161)var2.method5606()) {
            class120 var7 = class67.method1152(var6.field1504);
            long var8 = (long)var7.field1116;
            if(var7.field1108 == 1) {
               var8 *= (long)(var6.field1503 + 1);
            }

            if(var8 > var3) {
               var3 = var8;
               var5 = var6;
            }
         }

         if(var5 == null) {
            class258.field2566.method5409(class315.plane, var0, var1);
         } else {
            var2.method5601(var5);
            class161 var12 = null;
            class161 var11 = null;

            for(var6 = (class161)var2.method5604(); var6 != null; var6 = (class161)var2.method5606()) {
               if(var5.field1504 != var6.field1504) {
                  if(var12 == null) {
                     var12 = var6;
                  }

                  if(var6.field1504 != var12.field1504 && var11 == null) {
                     var11 = var6;
                  }
               }
            }

            long var9 = class216.method3818(var0, var1, 3, false, 0);
            class258.field2566.method5364(class315.plane, var0, var1, class7.method85(var0 * 128 + 64, var1 * 128 + 64, class315.plane), var5, var9, var12, var11);
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-457860005"
   )
   static int method1016(int var0, class252 var1, boolean var2) {
      return var0 < 1000?class197.method3351(var0, var1, var2):(var0 < 1100?class229.method4108(var0, var1, var2):(var0 < 1200?class289.method5107(var0, var1, var2):(var0 < 1300?class268.method4874(var0, var1, var2):(var0 < 1400?class18.method195(var0, var1, var2):(var0 < 1500?client.method6374(var0, var1, var2):(var0 < 1600?class169.method2877(var0, var1, var2):(var0 < 1700?class55.method989(var0, var1, var2):(var0 < 1800?class282.method5021(var0, var1, var2):(var0 < 1900?class326.method5779(var0, var1, var2):(var0 < 2000?class45.method790(var0, var1, var2):(var0 < 2100?class229.method4108(var0, var1, var2):(var0 < 2200?class289.method5107(var0, var1, var2):(var0 < 2300?class268.method4874(var0, var1, var2):(var0 < 2400?class18.method195(var0, var1, var2):(var0 < 2500?client.method6374(var0, var1, var2):(var0 < 2600?class9.method113(var0, var1, var2):(var0 < 2700?class106.method1787(var0, var1, var2):(var0 < 2800?class129.method2385(var0, var1, var2):(var0 < 2900?class143.method2543(var0, var1, var2):(var0 < 3000?class45.method790(var0, var1, var2):(var0 < 3200?class128.method2378(var0, var1, var2):(var0 < 3300?class40.method693(var0, var1, var2):(var0 < 3400?class214.method3757(var0, var1, var2):(var0 < 3500?class75.method1181(var0, var1, var2):(var0 < 3700?class309.method5308(var0, var1, var2):(var0 < 4000?class190.method3255(var0, var1, var2):(var0 < 4100?class198.method3356(var0, var1, var2):(var0 < 4200?class278.method4946(var0, var1, var2):(var0 < 4300?class274.method4908(var0, var1, var2):(var0 < 5100?class332.method5947(var0, var1, var2):(var0 < 5400?class9.method112(var0, var1, var2):(var0 < 5600?class195.method3305(var0, var1, var2):(var0 < 5700?class184.method3213(var0, var1, var2):(var0 < 6300?class77.method1189(var0, var1, var2):(var0 < 6600?class126.method2301(var0, var1, var2):(var0 < 6700?class250.method4501(var0, var1, var2):2))))))))))))))))))))))))))))))))))));
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1365269897"
   )
   static void method1015() {
      class38 var0 = null;

      try {
         var0 = class263.method4817("", class102.field959.field3400, true);
         Buffer var1 = class153.field1455.method3344();
         var0.method597(var1.field1074, 0, var1.field1073);
      } catch (Exception var3) {
         ;
      }

      try {
         if(var0 != null) {
            var0.method599(true);
         }
      } catch (Exception var2) {
         ;
      }

   }
}
