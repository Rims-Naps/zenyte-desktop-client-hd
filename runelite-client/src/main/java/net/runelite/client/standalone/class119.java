package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public final class class119 {
   @ObfuscatedName("f")
   int field1091;
   @ObfuscatedName("l")
   int field1090;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lhf;"
   )
   class316 field1093;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lga;"
   )
   class46 field1092;

   public class119(int var1, int var2) {
      this.field1093 = new class316();
      this.field1091 = var1;
      this.field1090 = var1;

      int var3;
      for(var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
         ;
      }

      this.field1092 = new class46(var3);
   }

   @ObfuscatedName("f")
   public Object method2133(long var1) {
      class238 var3 = (class238)this.field1092.method792(var1);
      if(var3 == null) {
         return null;
      } else {
         Object var4 = var3.vmethod5023();
         if(var4 == null) {
            var3.method1186();
            var3.method3298();
            this.field1090 += var3.field2401;
            return null;
         } else {
            if(var3.vmethod5024()) {
               class283 var5 = new class283(var4, var3.field2401);
               this.field1092.method794(var5, var3.field704);
               this.field1093.method5556(var5);
               var5.field1842 = 0L;
               var3.method1186();
               var3.method3298();
            } else {
               this.field1093.method5556(var3);
               var3.field1842 = 0L;
            }

            return var4;
         }
      }
   }

   @ObfuscatedName("p")
   public void method2138() {
      this.field1093.method5554();
      this.field1092.method795();
      this.field1090 = this.field1091;
   }

   @ObfuscatedName("c")
   public void method2134(int var1) {
      for(class238 var2 = (class238)this.field1093.method5564(); var2 != null; var2 = (class238)this.field1093.method5553()) {
         if(var2.vmethod5024()) {
            if(var2.vmethod5023() == null) {
               var2.method1186();
               var2.method3298();
               this.field1090 += var2.field2401;
            }
         } else if(++var2.field1842 > (long)var1) {
            class208 var3 = new class208(var2.vmethod5023(), var2.field2401);
            this.field1092.method794(var3, var2.field704);
            class134.method2472(var3, var2);
            var2.method1186();
            var2.method3298();
         }
      }

   }

   @ObfuscatedName("e")
   public void method2137(Object var1, long var2, int var4) {
      this.method2144(var2);
      this.field1090 -= var4;

      while(this.field1090 < 0) {
         class238 var5 = (class238)this.field1093.method5555();
         this.method2135(var5);
      }

      class283 var6 = new class283(var1, var4);
      this.field1092.method794(var6, var2);
      this.field1093.method5556(var6);
      var6.field1842 = 0L;
   }

   @ObfuscatedName("l")
   void method2144(long var1) {
      class238 var3 = (class238)this.field1092.method792(var1);
      this.method2135(var3);
   }

   @ObfuscatedName("s")
   public void method2136(Object var1, long var2) {
      this.method2137(var1, var2, 1);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lhv;)V"
   )
   void method2135(class238 var1) {
      if(var1 != null) {
         var1.method1186();
         var1.method3298();
         this.field1090 += var1.field2401;
      }

   }
}
