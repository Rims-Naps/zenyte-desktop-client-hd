package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public final class class204 {
   @ObfuscatedName("l")
   int field2852;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lhf;"
   )
   class120 field2855;
   @ObfuscatedName("f")
   int field2853;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lga;"
   )
   class235 field2854;

   public class204(int var1, int var2) {
      this.field2855 = new class120();
      this.field2853 = var1;
      this.field2852 = var1;

      int var3;
      for(var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
         ;
      }

      this.field2854 = new class235(var3);
   }

   @ObfuscatedName("p")
   public void method4033() {
      this.field2855.method2166();
      this.field2854.method4673();
      this.field2852 = this.field2853;
   }

   @ObfuscatedName("c")
   public void method4029(int var1) {
      for(class281 var2 = (class281)this.field2855.method2176(); var2 != null; var2 = (class281)this.field2855.method2165()) {
         if(var2.vmethod5410()) {
            if(var2.vmethod5411() == null) {
               var2.method3937();
               var2.method6268();
               this.field2852 += var2.field3547;
            }
         } else if(++var2.field3943 > (long)var1) {
            class10 var3 = new class10(var2.vmethod5411(), var2.field3547);
            this.field2854.method4672(var3, var2.field2792);
            class50.method1059(var3, var2);
            var2.method3937();
            var2.method6268();
         }
      }

   }

   @ObfuscatedName("l")
   void method4039(long var1) {
      class281 var3 = (class281)this.field2854.method4670(var1);
      this.method4030(var3);
   }

   @ObfuscatedName("s")
   public void method4031(Object var1, long var2) {
      this.method4032(var1, var2, 1);
   }

   @ObfuscatedName("f")
   public Object method4028(long var1) {
      class281 var3 = (class281)this.field2854.method4670(var1);
      if(var3 == null) {
         return null;
      } else {
         Object var4 = var3.vmethod5411();
         if(var4 == null) {
            var3.method3937();
            var3.method6268();
            this.field2852 += var3.field3547;
            return null;
         } else {
            if(var3.vmethod5410()) {
               class19 var5 = new class19(var4, var3.field3547);
               this.field2854.method4672(var5, var3.field2792);
               this.field2855.method2168(var5);
               var5.field3943 = 0L;
               var3.method3937();
               var3.method6268();
            } else {
               this.field2855.method2168(var3);
               var3.field3943 = 0L;
            }

            return var4;
         }
      }
   }

   @ObfuscatedName("e")
   public void method4032(Object var1, long var2, int var4) {
      this.method4039(var2);
      this.field2852 -= var4;

      while(this.field2852 < 0) {
         class281 var5 = (class281)this.field2855.method2167();
         this.method4030(var5);
      }

      class19 var6 = new class19(var1, var4);
      this.field2854.method4672(var6, var2);
      this.field2855.method2168(var6);
      var6.field3943 = 0L;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lhv;)V"
   )
   void method4030(class281 var1) {
      if(var1 != null) {
         var1.method3937();
         var1.method6268();
         this.field2852 += var1.field3547;
      }

   }
}
