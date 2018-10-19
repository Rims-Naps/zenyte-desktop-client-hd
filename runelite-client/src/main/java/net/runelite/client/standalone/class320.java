package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSDeque;
import net.runelite.rs.api.RSNode;

@ObfuscatedName("gs")
public class class320 implements RSDeque {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   public class76 field3409;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   class76 field3410;

   public class320() {
      this.field3409 = new class76();
      this.field3409.field702 = this.field3409;
      this.field3409.field703 = this.field3409;
   }

   @ObfuscatedName("f")
   public void method5621() {
      while(true) {
         class76 var1 = this.field3409.field702;
         if(var1 == this.field3409) {
            this.field3410 = null;
            return;
         }

         var1.method1186();
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "()Lgu;"
   )
   public class76 method5606() {
      class76 var1 = this.field3410;
      if(var1 == this.field3409) {
         this.field3410 = null;
         return null;
      } else {
         this.field3410 = var1.field702;
         return var1;
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "()Lgu;"
   )
   public class76 method5605() {
      class76 var1 = this.field3409.field703;
      if(var1 == this.field3409) {
         this.field3410 = null;
         return null;
      } else {
         this.field3410 = var1.field703;
         return var1;
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "()Lgu;"
   )
   public class76 method5604() {
      class76 var1 = this.field3409.field702;
      if(var1 == this.field3409) {
         this.field3410 = null;
         return null;
      } else {
         this.field3410 = var1.field702;
         return var1;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "()Lgu;"
   )
   public class76 method5603() {
      class76 var1 = this.field3409.field703;
      if(var1 == this.field3409) {
         return null;
      } else {
         var1.method1186();
         return var1;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "()Lgu;"
   )
   public class76 method5599() {
      class76 var1 = this.field3409.field702;
      if(var1 == this.field3409) {
         return null;
      } else {
         var1.method1186();
         return var1;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgu;)V"
   )
   public void method5600(class76 var1) {
      if(var1.field703 != null) {
         var1.method1186();
      }

      var1.field703 = this.field3409.field703;
      var1.field702 = this.field3409;
      var1.field703.field702 = var1;
      var1.field702.field703 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgu;)V"
   )
   public void method5601(class76 var1) {
      if(var1.field703 != null) {
         var1.method1186();
      }

      var1.field703 = this.field3409;
      var1.field702 = this.field3409.field702;
      var1.field703.field702 = var1;
      var1.field702.field703 = var1;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "()Lgu;"
   )
   public class76 method5607() {
      class76 var1 = this.field3410;
      if(var1 == this.field3409) {
         this.field3410 = null;
         return null;
      } else {
         this.field3410 = var1.field703;
         return var1;
      }
   }

   public RSNode getHead() {
      return this.field3409;
   }

   public RSNode getCurrent() {
      return this.field3410;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgu;Lgu;)V"
   )
   public static void method5622(class76 var0, class76 var1) {
      if(var0.field703 != null) {
         var0.method1186();
      }

      var0.field703 = var1.field703;
      var0.field702 = var1;
      var0.field703.field702 = var0;
      var0.field702.field703 = var0;
   }
}
