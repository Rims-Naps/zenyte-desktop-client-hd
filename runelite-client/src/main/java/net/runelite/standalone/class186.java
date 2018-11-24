package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public final class class186 extends class197 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   static class70 field2540;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -506211551
   )
   int field2538;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1038656789
   )
   int field2534;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 607145229
   )
   int field2533;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -201658339
   )
   int field2529;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1368991807
   )
   int field2537;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Ljq;"
   )
   class15 field2542;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 295870579
   )
   int field2532;
   @ObfuscatedName("x")
   int[] field2528;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 184502367
   )
   int field2535;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Ldl;"
   )
   class243 field2536;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1695114923
   )
   int field2539;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Ldl;"
   )
   class243 field2541;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1284337653
   )
   int field2531;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -629560279
   )
   int field2530;

   static {
      field2540 = new class70();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-117"
   )
   void method3749() {
      int var1 = this.field2532;
      class15 var2 = this.field2542.method325();
      if(var2 != null) {
         this.field2532 = var2.field192;
         this.field2534 = var2.field151 * 128;
         this.field2537 = var2.field194;
         this.field2538 = var2.field195;
         this.field2528 = var2.field160;
      } else {
         this.field2532 = -1;
         this.field2534 = 0;
         this.field2537 = 0;
         this.field2538 = 0;
         this.field2528 = null;
      }

      if(var1 != this.field2532 && this.field2536 != null) {
         class220.field2985.method5197(this.field2536);
         this.field2536 = null;
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-1778251657"
   )
   static int method3752(int var0, class296 var1, boolean var2) {
      class187 var3 = var2?class3.field36:class284.field3565;
      if(var0 == 1700) {
         class249.field3312[++class308.field3811 - 1] = var3.field2676;
         return 1;
      } else if(var0 == 1701) {
         if(var3.field2676 != -1) {
            class249.field3312[++class308.field3811 - 1] = var3.field2685;
         } else {
            class249.field3312[++class308.field3811 - 1] = 0;
         }

         return 1;
      } else if(var0 == 1702) {
         class249.field3312[++class308.field3811 - 1] = var3.field2620;
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
   static synchronized void method3746(byte[] var0) {
      if(var0.length == 100 && class122.field1662 < 1000) {
         class122.field1656[++class122.field1662 - 1] = var0;
      } else if(var0.length == 5000 && class122.field1661 < 250) {
         class122.field1654[++class122.field1661 - 1] = var0;
      } else if(var0.length == 30000 && class122.field1655 < 50) {
         class122.field1658[++class122.field1655 - 1] = var0;
      } else {
         if(class260.field3392 != null) {
            for(int var1 = 0; var1 < class122.field1659.length; ++var1) {
               if(var0.length == class122.field1659[var1] && class122.field1657[var1] < class260.field3392[var1].length) {
                  class260.field3392[var1][class122.field1657[var1]++] = var0;
                  return;
               }
            }
         }

      }
   }
}
