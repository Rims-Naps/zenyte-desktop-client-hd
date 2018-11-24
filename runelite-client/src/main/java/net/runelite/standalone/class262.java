package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
public class class262 extends class309 {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   class70 field3400;
   @ObfuscatedName("s")
   int field3401;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   class70 field3399;
   @ObfuscatedName("e")
   int field3402;

   public class262() {
      this.field3399 = new class70();
      this.field3400 = new class70();
      this.field3401 = 0;
      this.field3402 = -1;
   }

   @ObfuscatedName("z")
   public final synchronized void vmethod6061(int var1) {
      do {
         if(this.field3402 < 0) {
            this.method5206(var1);
            return;
         }

         if(this.field3401 + var1 < this.field3402) {
            this.field3401 += var1;
            this.method5206(var1);
            return;
         }

         int var2 = this.field3402 - this.field3401;
         this.method5206(var2);
         var1 -= var2;
         this.field3401 += var2;
         this.method5198();
         class156 var3 = (class156)this.field3400.method1503();
         synchronized(var3) {
            int var5 = var3.method2837();
            if(var5 < 0) {
               var3.field1906 = 0;
               this.method5229(var3);
            } else {
               var3.field1906 = var5;
               this.method5199(var3.field2790, var3);
            }
         }
      } while(var1 != 0);

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "()Ldm;"
   )
   protected class309 vmethod6059() {
      return (class309)this.field3399.method1505();
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "()Ldm;"
   )
   protected class309 vmethod6056() {
      return (class309)this.field3399.method1503();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ldm;)V"
   )
   public final synchronized void method5197(class309 var1) {
      var1.method3937();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgu;Lcp;)V"
   )
   void method5199(class197 var1, class156 var2) {
      while(this.field3400.field808 != var1 && ((class156)var1).field1906 <= var2.field1906) {
         var1 = var1.field2790;
      }

      class70.method1521(var2, var1);
      this.field3402 = ((class156)this.field3400.field808.field2790).field1906;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ldm;)V"
   )
   public final synchronized void method5195(class309 var1) {
      this.field3399.method1500(var1);
   }

   @ObfuscatedName("r")
   protected int vmethod6057() {
      return 0;
   }

   @ObfuscatedName("m")
   public final synchronized void vmethod6060(int[] var1, int var2, int var3) {
      do {
         if(this.field3402 < 0) {
            this.method5230(var1, var2, var3);
            return;
         }

         if(var3 + this.field3401 < this.field3402) {
            this.field3401 += var3;
            this.method5230(var1, var2, var3);
            return;
         }

         int var4 = this.field3402 - this.field3401;
         this.method5230(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field3401 += var4;
         this.method5198();
         class156 var5 = (class156)this.field3400.method1503();
         synchronized(var5) {
            int var7 = var5.method2837();
            if(var7 < 0) {
               var5.field1906 = 0;
               this.method5229(var5);
            } else {
               var5.field1906 = var7;
               this.method5199(var5.field2790, var5);
            }
         }
      } while(var3 != 0);

   }

   @ObfuscatedName("x")
   void method5206(int var1) {
      for(class309 var2 = (class309)this.field3399.method1503(); var2 != null; var2 = (class309)this.field3399.method1505()) {
         var2.vmethod6061(var1);
      }

   }

   @ObfuscatedName("d")
   void method5230(int[] var1, int var2, int var3) {
      for(class309 var4 = (class309)this.field3399.method1503(); var4 != null; var4 = (class309)this.field3399.method1505()) {
         var4.method6064(var1, var2, var3);
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Lcp;)V"
   )
   void method5229(class156 var1) {
      var1.method3937();
      var1.method2836();
      class197 var2 = this.field3400.field808.field2790;
      if(var2 == this.field3400.field808) {
         this.field3402 = -1;
      } else {
         this.field3402 = ((class156)var2).field1906;
      }

   }

   @ObfuscatedName("w")
   void method5198() {
      if(this.field3401 > 0) {
         for(class156 var1 = (class156)this.field3400.method1503(); var1 != null; var1 = (class156)this.field3400.method1505()) {
            var1.field1906 -= this.field3401;
         }

         this.field3402 -= this.field3401;
         this.field3401 = 0;
      }

   }
}
