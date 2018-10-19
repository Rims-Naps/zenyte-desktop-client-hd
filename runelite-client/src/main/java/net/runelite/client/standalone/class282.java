package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public final class class282 extends class76 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   static class320 field3050;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 184502367
   )
   int field3045;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 295870579
   )
   int field3042;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -506211551
   )
   int field3048;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Ljq;"
   )
   class172 field3052;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1038656789
   )
   int field3044;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 607145229
   )
   int field3043;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1284337653
   )
   int field3041;
   @ObfuscatedName("x")
   int[] field3038;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -201658339
   )
   int field3039;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1368991807
   )
   int field3047;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1695114923
   )
   int field3049;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Ldl;"
   )
   class243 field3051;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -629560279
   )
   int field3040;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Ldl;"
   )
   class243 field3046;

   static {
      field3050 = new class320();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-117"
   )
   void method5018() {
      int var1 = this.field3042;
      class172 var2 = this.field3052.method2898();
      if(var2 != null) {
         this.field3042 = var2.field1634;
         this.field3044 = var2.field1593 * 128;
         this.field3047 = var2.field1636;
         this.field3048 = var2.field1637;
         this.field3038 = var2.field1602;
      } else {
         this.field3042 = -1;
         this.field3044 = 0;
         this.field3047 = 0;
         this.field3048 = 0;
         this.field3038 = null;
      }

      if(var1 != this.field3042 && this.field3046 != null) {
         class61.field468.method4960(this.field3046);
         this.field3046 = null;
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-1778251657"
   )
   static int method5021(int var0, class252 var1, boolean var2) {
      class329 var3 = var2?class182.field1766:class20.field155;
      if(var0 == 1700) {
         class55.field407[++class171.field1587 - 1] = var3.field3662;
         return 1;
      } else if(var0 == 1701) {
         if(var3.field3662 != -1) {
            class55.field407[++class171.field1587 - 1] = var3.field3671;
         } else {
            class55.field407[++class171.field1587 - 1] = 0;
         }

         return 1;
      } else if(var0 == 1702) {
         class55.field407[++class171.field1587 - 1] = var3.field3606;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "1696404291"
   )
   static synchronized void method5015(byte[] var0) {
      if(var0.length == 100 && class232.field2290 < 1000) {
         class232.field2284[++class232.field2290 - 1] = var0;
      } else if(var0.length == 5000 && class232.field2289 < 250) {
         class232.field2282[++class232.field2289 - 1] = var0;
      } else if(var0.length == 30000 && class232.field2283 < 50) {
         class232.field2286[++class232.field2283 - 1] = var0;
      } else {
         if(class315.field3388 != null) {
            for(int var1 = 0; var1 < class232.field2287.length; ++var1) {
               if(var0.length == class232.field2287[var1] && class232.field2285[var1] < class315.field3388[var1].length) {
                  class315.field3388[var1][class232.field2285[var1]++] = var0;
                  return;
               }
            }
         }

      }
   }
}
