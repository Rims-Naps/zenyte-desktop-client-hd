package net.runelite.standalone;

import net.runelite.api.widgets.JavaScriptCallback;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
public class class259 {
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1038788191
   )
   static int field3385;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   class217 field3378;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   class98 field3380;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   class217 field3383;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   class98 field3382;

   @ObfuscatedSignature(
      signature = "(Lik;Lik;)V"
   )
   public class259(class217 var1, class217 var2) {
      this.field3382 = new class98(256);
      this.field3380 = new class98(256);
      this.field3383 = var1;
      this.field3378 = var2;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II[II)Lcr;",
      garbageValue = "233329081"
   )
   class33 method5165(int var1, int var2, int[] var3) {
      int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
      var4 |= var1 << 16;
      long var5 = (long)var4 ^ 4294967296L;
      class33 var7 = (class33)this.field3380.method1776(var5);
      if(var7 != null) {
         return var7;
      } else if(var3 != null && var3[0] <= 0) {
         return null;
      } else {
         class157 var8 = (class157)this.field3382.method1776(var5);
         if(var8 == null) {
            var8 = class157.method2849(this.field3378, var1, var2);
            if(var8 == null) {
               return null;
            }

            this.field3382.method1775(var8, var5);
         }

         var7 = var8.method2850(var3);
         if(var7 == null) {
            return null;
         } else {
            var8.method3937();
            this.field3380.method1775(var7, var5);
            return var7;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I[IB)Lcr;",
      garbageValue = "2"
   )
   public class33 method5176(int var1, int[] var2) {
      if(this.field3378.method4411() == 1) {
         return this.method5165(0, var1, var2);
      } else if(this.field3378.method4435(var1) == 1) {
         return this.method5165(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II[II)Lcr;",
      garbageValue = "78238974"
   )
   class33 method5164(int var1, int var2, int[] var3) {
      int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
      var4 |= var1 << 16;
      long var5 = (long)var4;
      class33 var7 = (class33)this.field3380.method1776(var5);
      if(var7 != null) {
         return var7;
      } else if(var3 != null && var3[0] <= 0) {
         return null;
      } else {
         class130 var8 = class130.method2499(this.field3383, var1, var2);
         if(var8 == null) {
            return null;
         } else {
            var7 = var8.method2509();
            this.field3380.method1775(var7, var5);
            if(var3 != null) {
               var3[0] -= var7.field307.length;
            }

            return var7;
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I[II)Lcr;",
      garbageValue = "768957538"
   )
   public class33 method5173(int var1, int[] var2) {
      if(this.field3383.method4411() == 1) {
         return this.method5164(0, var1, var2);
      } else if(this.field3383.method4435(var1) == 1) {
         return this.method5164(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lbs;IB)V"
   )
   static void method5166(class194 var0, int var1, byte var2) {
      Object[] var3 = var0.getArguments();
      if(var3 != null && var3.length > 0 && var3[0] instanceof JavaScriptCallback) {
         try {
            ((JavaScriptCallback)var3[0]).run(var0);
         } catch (Exception var8) {
            class302.field3755.getLogger().error("Error in JavaScriptCallback", var8);
         }

      } else {
         try {
            client.copy$runScript(var0, var1, var2);
         } finally {
            client.currentScript = null;
         }

      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "-5"
   )
   public static int method5178(int var0) {
      class72 var2 = (class72)class72.field827.method1813((long)var0);
      class72 var1;
      if(var2 != null) {
         var1 = var2;
      } else {
         byte[] var7 = class72.field832.method4398(14, var0, 1041808246);
         var2 = new class72();
         if(var7 != null) {
            var2.method1543(new Buffer(var7));
         }

         class72.field827.method1820(var2, (long)var0);
         var1 = var2;
      }

      int var3 = var1.field828;
      int var4 = var1.field830;
      int var5 = var1.field831;
      int var6 = class81.field899[var5 - var4];
      return class81.field898[var3] >> var4 & var6;
   }
}
