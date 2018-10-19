package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
public class class280 extends class3 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   class320 field3027;
   @ObfuscatedName("e")
   int field3030;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   class320 field3028;
   @ObfuscatedName("s")
   int field3029;

   public class280() {
      this.field3027 = new class320();
      this.field3028 = new class320();
      this.field3029 = 0;
      this.field3030 = -1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ldm;)V"
   )
   public final synchronized void method4958(class3 var1) {
      this.field3027.method5601(var1);
   }

   @ObfuscatedName("m")
   public final synchronized void vmethod4966(int[] var1, int var2, int var3) {
      do {
         if(this.field3030 < 0) {
            this.method4993(var1, var2, var3);
            return;
         }

         if(var3 + this.field3029 < this.field3030) {
            this.field3029 += var3;
            this.method4993(var1, var2, var3);
            return;
         }

         int var4 = this.field3030 - this.field3029;
         this.method4993(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field3029 += var4;
         this.method4961();
         class64 var5 = (class64)this.field3028.method5604();
         synchronized(var5) {
            int var7 = var5.method1133();
            if(var7 < 0) {
               var5.field605 = 0;
               this.method4992(var5);
            } else {
               var5.field605 = var7;
               this.method4962(var5.field702, var5);
            }
         }
      } while(var3 != 0);

   }

   @ObfuscatedName("z")
   public final synchronized void vmethod4968(int var1) {
      do {
         if(this.field3030 < 0) {
            this.method4969(var1);
            return;
         }

         if(this.field3029 + var1 < this.field3030) {
            this.field3029 += var1;
            this.method4969(var1);
            return;
         }

         int var2 = this.field3030 - this.field3029;
         this.method4969(var2);
         var1 -= var2;
         this.field3029 += var2;
         this.method4961();
         class64 var3 = (class64)this.field3028.method5604();
         synchronized(var3) {
            int var5 = var3.method1133();
            if(var5 < 0) {
               var3.field605 = 0;
               this.method4992(var3);
            } else {
               var3.field605 = var5;
               this.method4962(var3.field702, var3);
            }
         }
      } while(var1 != 0);

   }

   @ObfuscatedName("r")
   protected int vmethod4965() {
      return 0;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "()Ldm;"
   )
   protected class3 vmethod4973() {
      return (class3)this.field3027.method5606();
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "()Ldm;"
   )
   protected class3 vmethod4963() {
      return (class3)this.field3027.method5604();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Lcp;)V"
   )
   void method4992(class64 var1) {
      var1.method1186();
      var1.method1132();
      class76 var2 = this.field3028.field3409.field702;
      if(var2 == this.field3028.field3409) {
         this.field3030 = -1;
      } else {
         this.field3030 = ((class64)var2).field605;
      }

   }

   @ObfuscatedName("x")
   void method4969(int var1) {
      for(class3 var2 = (class3)this.field3027.method5604(); var2 != null; var2 = (class3)this.field3027.method5606()) {
         var2.vmethod4968(var1);
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ldm;)V"
   )
   public final synchronized void method4960(class3 var1) {
      var1.method1186();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgu;Lcp;)V"
   )
   void method4962(class76 var1, class64 var2) {
      while(this.field3028.field3409 != var1 && ((class64)var1).field605 <= var2.field605) {
         var1 = var1.field702;
      }

      class320.method5622(var2, var1);
      this.field3030 = ((class64)this.field3028.field3409.field702).field605;
   }

   @ObfuscatedName("w")
   void method4961() {
      if(this.field3029 > 0) {
         for(class64 var1 = (class64)this.field3028.method5604(); var1 != null; var1 = (class64)this.field3028.method5606()) {
            var1.field605 -= this.field3029;
         }

         this.field3030 -= this.field3029;
         this.field3029 = 0;
      }

   }

   @ObfuscatedName("d")
   void method4993(int[] var1, int var2, int var3) {
      for(class3 var4 = (class3)this.field3027.method5604(); var4 != null; var4 = (class3)this.field3027.method5606()) {
         var4.method40(var1, var2, var3);
      }

   }
}
