package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
public class class289 {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lhu;"
   )
   class161 field3644;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lhu;"
   )
   class161 field3645;

   public class289() {
      this.field3645 = new class161();
      this.field3645.field1956 = this.field3645;
      this.field3645.field1955 = this.field3645;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "()Lhu;"
   )
   public class161 method5688() {
      class161 var1 = this.field3645.field1956;
      if(var1 == this.field3645) {
         this.field3644 = null;
         return null;
      } else {
         this.field3644 = var1.field1956;
         return var1;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lhu;)V"
   )
   public void method5689(class161 var1) {
      if(var1.field1955 != null) {
         var1.method2964();
      }

      var1.field1955 = this.field3645.field1955;
      var1.field1956 = this.field3645;
      var1.field1955.field1956 = var1;
      var1.field1956.field1955 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "()Lhu;"
   )
   public class161 method5691() {
      class161 var1 = this.field3644;
      if(var1 == this.field3645) {
         this.field3644 = null;
         return null;
      } else {
         this.field3644 = var1.field1956;
         return var1;
      }
   }
}
