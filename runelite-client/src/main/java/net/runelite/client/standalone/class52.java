package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
public class class52 {
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1038788191
   )
   static int field386;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   class148 field384;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   class148 field379;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   class310 field381;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   class310 field383;

   @ObfuscatedSignature(
      signature = "(Lik;Lik;)V"
   )
   public class52(class148 var1, class148 var2) {
      this.field383 = new class310(256);
      this.field381 = new class310(256);
      this.field384 = var1;
      this.field379 = var2;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II[II)Lcr;",
      garbageValue = "78238974"
   )
   class58 method845(int var1, int var2, int[] var3) {
      int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
      var4 |= var1 << 16;
      long var5 = (long)var4;
      class58 var7 = (class58)this.field381.method5310(var5);
      if(var7 != null) {
         return var7;
      } else if(var3 != null && var3[0] <= 0) {
         return null;
      } else {
         class93 var8 = class93.method1640(this.field384, var1, var2);
         if(var8 == null) {
            return null;
         } else {
            var7 = var8.method1650();
            this.field381.method5309(var7, var5);
            if(var3 != null) {
               var3[0] -= var7.field458.length;
            }

            return var7;
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II[II)Lcr;",
      garbageValue = "233329081"
   )
   class58 method846(int var1, int var2, int[] var3) {
      int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
      var4 |= var1 << 16;
      long var5 = (long)var4 ^ 4294967296L;
      class58 var7 = (class58)this.field381.method5310(var5);
      if(var7 != null) {
         return var7;
      } else if(var3 != null && var3[0] <= 0) {
         return null;
      } else {
         class101 var8 = (class101)this.field383.method5310(var5);
         if(var8 == null) {
            var8 = class101.method1700(this.field379, var1, var2);
            if(var8 == null) {
               return null;
            }

            this.field383.method5309(var8, var5);
         }

         var7 = var8.method1701(var3);
         if(var7 == null) {
            return null;
         } else {
            var8.method1186();
            this.field381.method5309(var7, var5);
            return var7;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I[IB)Lcr;",
      garbageValue = "2"
   )
   public class58 method857(int var1, int[] var2) {
      if(this.field379.method2592() == 1) {
         return this.method846(0, var1, var2);
      } else if(this.field379.method2616(var1) == 1) {
         return this.method846(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I[II)Lcr;",
      garbageValue = "768957538"
   )
   public class58 method854(int var1, int[] var2) {
      if(this.field384.method2592() == 1) {
         return this.method845(0, var1, var2);
      } else if(this.field384.method2616(var1) == 1) {
         return this.method845(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "-5"
   )
   public static int method859(int var0) {
      class213 var2 = (class213)class213.field2060.method2268((long)var0);
      class213 var1;
      if(var2 != null) {
         var1 = var2;
      } else {
         byte[] var7 = class213.field2065.method2579(14, var0, 1041808246);
         var2 = new class213();
         if(var7 != null) {
            var2.method3747(new Buffer(var7));
         }

         class213.field2060.method2275(var2, (long)var0);
         var1 = var2;
      }

      int var3 = var1.field2061;
      int var4 = var1.field2063;
      int var5 = var1.field2064;
      int var6 = class215.field2072[var5 - var4];
      return class215.field2071[var3] >> var4 & var6;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lbs;IB)V"
   )
   static void method847(class9 var0, int var1, byte var2) {
      try {
         client.copy$runScript(var0, var1, var2);
      } finally {
         client.currentScript = null;
      }

   }
}
