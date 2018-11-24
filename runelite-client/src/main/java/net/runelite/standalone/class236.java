package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
public class class236 implements class61 {
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "Lgm;"
   )
   public static class125 field3118;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1739877053
   )
   int field3114;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 430032935
   )
   int field3111;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1646699717
   )
   int field3117;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1865314997
   )
   int field3108;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 308599917
   )
   int field3112;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1421718207
   )
   int field3105;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 604673161
   )
   int field3109;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1019092883
   )
   int field3110;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1539397489
   )
   int field3113;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -531319093
   )
   int field3107;

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1680935148"
   )
   void method4690() {
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "116686342"
   )
   public void vmethod5267(class125 var1) {
      this.field3112 = var1.method2256();
      this.field3117 = var1.method2256();
      this.field3107 = var1.method2258();
      this.field3111 = var1.method2256();
      this.field3108 = var1.method2258();
      this.field3114 = var1.method2256();
      this.field3113 = var1.method2258();
      this.field3105 = var1.method2256();
      this.field3110 = var1.method2258();
      this.field3109 = var1.method2256();
      this.method4690();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIIB)Z",
      garbageValue = "37"
   )
   public boolean vmethod5263(int var1, int var2, int var3) {
      return var1 >= this.field3112 && var1 < this.field3117 + this.field3112?var2 >= (this.field3107 << 6) + (this.field3111 << 3) && var2 <= (this.field3107 << 6) + (this.field3111 << 3) + 7 && var3 >= (this.field3108 << 6) + (this.field3114 << 3) && var3 <= (this.field3108 << 6) + (this.field3114 << 3) + 7:false;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIII)[I",
      garbageValue = "-161024515"
   )
   public int[] vmethod5265(int var1, int var2, int var3) {
      if(!this.vmethod5263(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field3113 * 64 - this.field3107 * 64 + var2 + (this.field3105 * 8 - this.field3111 * 8), var3 + (this.field3110 * 64 - this.field3108 * 64) + (this.field3109 * 8 - this.field3114 * 8)};
         return var4;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lh;B)V",
      garbageValue = "-105"
   )
   public void vmethod5276(class149 var1) {
      if(var1.field1843 > this.field3113) {
         var1.field1843 = this.field3113;
      }

      if(var1.field1844 < this.field3113) {
         var1.field1844 = this.field3113;
      }

      if(var1.field1839 > this.field3110) {
         var1.field1839 = this.field3110;
      }

      if(var1.field1846 < this.field3110) {
         var1.field1846 = this.field3110;
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIB)Lhx;",
      garbageValue = "26"
   )
   public class58 vmethod5264(int var1, int var2) {
      if(!this.vmethod5282(var1, var2)) {
         return null;
      } else {
         int var3 = this.field3107 * 64 - this.field3113 * 64 + (this.field3111 * 8 - this.field3105 * 8) + var1;
         int var4 = this.field3108 * 64 - this.field3110 * 64 + var2 + (this.field3114 * 8 - this.field3109 * 8);
         return new class58(this.field3112, var3, var4);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)Z",
      garbageValue = "16"
   )
   public boolean vmethod5282(int var1, int var2) {
      return var1 >= (this.field3113 << 6) + (this.field3105 << 3) && var1 <= (this.field3113 << 6) + (this.field3105 << 3) + 7 && var2 >= (this.field3110 << 6) + (this.field3109 << 3) && var2 <= (this.field3110 << 6) + (this.field3109 << 3) + 7;
   }

   @ObfuscatedName("gk")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-64"
   )
   static final void method4712(int var0, int var1) {
      class70 var2 = client.field2182[class260.field3393][var0][var1];
      if(var2 == null) {
         class269.field3464.method2003(class260.field3393, var0, var1);
      } else {
         long var3 = -99999999L;
         class191 var5 = null;

         class191 var6;
         for(var6 = (class191)var2.method1503(); var6 != null; var6 = (class191)var2.method1505()) {
            class42 var7 = class164.method3014(var6.field2737);
            long var8 = (long)var7.field443;
            if(var7.field435 == 1) {
               var8 *= (long)(var6.field2736 + 1);
            }

            if(var8 > var3) {
               var3 = var8;
               var5 = var6;
            }
         }

         if(var5 == null) {
            class269.field3464.method2003(class260.field3393, var0, var1);
         } else {
            var2.method1500(var5);
            class191 var12 = null;
            class191 var11 = null;

            for(var6 = (class191)var2.method1503(); var6 != null; var6 = (class191)var2.method1505()) {
               if(var5.field2737 != var6.field2737) {
                  if(var12 == null) {
                     var12 = var6;
                  }

                  if(var6.field2737 != var12.field2737 && var11 == null) {
                     var11 = var6;
                  }
               }
            }

            long var9 = class282.method5439(var0, var1, 3, false, 0);
            class269.field3464.method1958(class260.field3393, var0, var1, class314.method6140(var0 * 128 + 64, var1 * 128 + 64, class260.field3393), var5, var9, var12, var11);
         }
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Lfl;",
      garbageValue = "224262395"
   )
   static class12 method4711() {
      return class12.field125 == 0?new class12():class12.field124[--class12.field125];
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-457860005"
   )
   static int method4710(int var0, class296 var1, boolean var2) {
      return var0 < 1000?class77.method1580(var0, var1, var2):(var0 < 1100?class92.method1718(var0, var1, var2):(var0 < 1200?class109.method1921(var0, var1, var2):(var0 < 1300?class108.method1918(var0, var1, var2):(var0 < 1400?class189.method3804(var0, var1, var2):(var0 < 1500?client.method3658(var0, var1, var2):(var0 < 1600?class181.method3699(var0, var1, var2):(var0 < 1700?class249.method5055(var0, var1, var2):(var0 < 1800?class186.method3752(var0, var1, var2):(var0 < 1900?class294.method5777(var0, var1, var2):(var0 < 2000?class322.method6256(var0, var1, var2):(var0 < 2100?class92.method1718(var0, var1, var2):(var0 < 2200?class109.method1921(var0, var1, var2):(var0 < 2300?class108.method1918(var0, var1, var2):(var0 < 2400?class189.method3804(var0, var1, var2):(var0 < 2500?client.method3658(var0, var1, var2):(var0 < 2600?class194.method3932(var0, var1, var2):(var0 < 2700?class252.method5077(var0, var1, var2):(var0 < 2800?class151.method2764(var0, var1, var2):(var0 < 2900?class256.method5129(var0, var1, var2):(var0 < 3000?class322.method6256(var0, var1, var2):(var0 < 3200?class95.method1746(var0, var1, var2):(var0 < 3300?class293.method5771(var0, var1, var2):(var0 < 3400?class1.method4(var0, var1, var2):(var0 < 3500?class45.method875(var0, var1, var2):(var0 < 3700?class278.method5396(var0, var1, var2):(var0 < 4000?class276.method5370(var0, var1, var2):(var0 < 4100?class30.method524(var0, var1, var2):(var0 < 4200?class277.method5383(var0, var1, var2):(var0 < 4300?class87.method1634(var0, var1, var2):(var0 < 5100?class326.method6280(var0, var1, var2):(var0 < 5400?class194.method3931(var0, var1, var2):(var0 < 5600?class215.method4381(var0, var1, var2):(var0 < 5700?class230.method4614(var0, var1, var2):(var0 < 6300?class286.method5485(var0, var1, var2):(var0 < 6600?class88.method1649(var0, var1, var2):(var0 < 6700?class292.method5715(var0, var1, var2):2))))))))))))))))))))))))))))))))))));
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1365269897"
   )
   static void method4709() {
      class283 var0 = null;

      try {
         var0 = class177.method3679("", class210.field2889.field238, true);
         class125 var1 = class175.field2134.method1573();
         var0.method5442(var1.field1694, 0, var1.field1693);
      } catch (Exception var3) {
         ;
      }

      try {
         if(var0 != null) {
            var0.method5444(true);
         }
      } catch (Exception var2) {
         ;
      }

   }
}
