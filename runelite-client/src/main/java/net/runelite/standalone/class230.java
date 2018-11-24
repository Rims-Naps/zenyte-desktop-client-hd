package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
public final class class230 {
   @ObfuscatedName("lr")
   @ObfuscatedGetter(
      intValue = 1925789719
   )
   static int field3072;
   @ObfuscatedName("l")
   final int[] field3071;

   class230() {
      this.field3071 = new int[4096];
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-1494303787"
   )
   final int method4615(int var1, int var2) {
      return this.field3071[var2 + var1 * 64];
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lam;I)V",
      garbageValue = "-1839236628"
   )
   final void method4612(class229 var1) {
      for(int var2 = 0; var2 < 64; ++var2) {
         for(int var3 = 0; var3 < 64; ++var3) {
            this.field3071[var2 * 64 + var3] = var1.method4600(var2, var3) | -16777216;
         }
      }

   }

   @ObfuscatedName("jv")
   @ObfuscatedSignature(
      signature = "(Lhw;I)V",
      garbageValue = "-18166832"
   )
   static void method4617(class187 var0) {
      if(var0.field2667 == client.field2380) {
         client.field2351[var0.field2695] = true;
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-636544783"
   )
   static int method4614(int var0, class296 var1, boolean var2) {
      if(var0 == 5630) {
         client.field2298 = 250;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("fb")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "611286336"
   )
   static void method4619(int var0) {
      if(var0 == -1 && !client.field2393) {
         class43.field483.method1375();
         class43.field481 = 1;
         class270.field3480 = null;
      } else if(var0 != -1 && var0 != client.field2328 && client.field2386 != 0 && !client.field2393) {
         class294.method5775(2, client.field2428, var0, 0, client.field2386, false);
      }

      client.field2328 = var0;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Lgm;J)V"
   )
   static void method4622(class125 var0, long var1) {
      var1 /= 10L;
      if(var1 < 0L) {
         var1 = 0L;
      } else if(var1 > 65535L) {
         var1 = 65535L;
      }

      var0.method2242((int)var1);
   }

   @ObfuscatedName("fi")
   @ObfuscatedSignature(
      signature = "(Lhw;III)V",
      garbageValue = "-1215534032"
   )
   static final void method4621(class187 var0, int var1, int var2) {
      if(client.field2411 == 0 || client.field2411 == 3) {
         if(!client.field2360 && (class163.field1982 == 1 || !class225.field3039 && class163.field1982 == 4)) {
            class198 var3 = var0.method3762(true);
            if(var3 == null) {
               return;
            }

            int var4 = class163.field1980 - var1;
            int var5 = class163.field1984 - var2;
            if(var3.method3940(var4, var5)) {
               var4 -= var3.field2798 / 2;
               var5 -= var3.field2795 / 2;
               int var6 = client.field2223 & 2047;
               int var7 = class211.field2920[var6];
               int var8 = class211.field2914[var6];
               int var9 = var4 * var8 + var5 * var7 >> 11;
               int var10 = var5 * var8 - var7 * var4 >> 11;
               int var11 = var9 + class32.field303.field1090 >> 7;
               int var12 = class32.field303.field1072 - var10 >> 7;
               class12 var13 = class150.method2761(ClientProt.field3231, client.field2384.field1770);
               var13.field121.method2288(18);
               var13.field121.method2292(var12 + class35.field360);
               var13.field121.method2292(var11 + class229.field3067);
               var13.field121.method2282(class96.field1040[82]?(class96.field1040[81]?2:1):0);
               var13.field121.method2288(var4);
               var13.field121.method2288(var5);
               var13.field121.method2242(client.field2223);
               var13.field121.method2288(57);
               var13.field121.method2288(0);
               var13.field121.method2288(0);
               var13.field121.method2288(89);
               var13.field121.method2242(class32.field303.field1090);
               var13.field121.method2242(class32.field303.field1072);
               var13.field121.method2288(63);
               client.field2384.method2573(var13);
               client.field2216 = var11;
               client.field2414 = var12;
            }
         }

      }
   }

   @ObfuscatedName("jl")
   @ObfuscatedSignature(
      signature = "(IIII)Lbl;",
      garbageValue = "-1985952342"
   )
   static final class322 method4618(int var0, int var1, int var2) {
      class322 var3 = new class322();
      var3.field3937 = var1;
      var3.field3934 = var2;
      client.field2412.method1775(var3, (long)var0);
      class154.method2819(var1);
      class187 var4 = class48.method1047(var0);
      method4617(var4);
      if(client.field2319 != null) {
         method4617(client.field2319);
         client.field2319 = null;
      }

      for(int var5 = 0; var5 < client.field2290; ++var5) {
         int var7 = client.field2293[var5];
         boolean var6 = var7 == 57 || var7 == 58 || var7 == 1007 || var7 == 25 || var7 == 30;
         if(var6) {
            if(var5 < client.field2290 - 1) {
               for(int var8 = var5; var8 < client.field2290 - 1; ++var8) {
                  client.field2295[var8] = client.field2295[var8 + 1];
                  client.field2296[var8] = client.field2296[var8 + 1];
                  client.field2293[var8] = client.field2293[var8 + 1];
                  client.field2368[var8] = client.field2368[var8 + 1];
                  client.field2291[var8] = client.field2291[var8 + 1];
                  client.field2292[var8] = client.field2292[var8 + 1];
                  client.field2327[var8] = client.field2327[var8 + 1];
               }
            }

            --var5;
            --client.field2290;
            client.onMenuOptionsChanged(-1);
         }
      }

      class177.method3678();
      class79.method1593(class187.field2547[var0 >> 16], var4, false);
      class54.method1224(var1, 294669053);
      if(client.field2313 != -1) {
         class191.method3910(client.field2313, 1);
      }

      return var3;
   }
}
