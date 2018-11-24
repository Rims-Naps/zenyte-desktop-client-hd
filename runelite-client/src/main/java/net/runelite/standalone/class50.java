package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public final class class50 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lhe;"
   )
   class324 field562;

   public class50() {
      this.field562 = new class324();
      this.field562.field3944 = this.field562;
      this.field562.field3945 = this.field562;
   }

   @ObfuscatedName("c")
   void method1071() {
      while(true) {
         class324 var1 = this.field562.field3944;
         if(var1 == this.field562) {
            return;
         }

         var1.method6268();
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lhe;)V"
   )
   public void method1056(class324 var1) {
      if(var1.field3945 != null) {
         var1.method6268();
      }

      var1.field3945 = this.field562;
      var1.field3944 = this.field562.field3944;
      var1.field3945.field3944 = var1;
      var1.field3944.field3945 = var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "()Lhe;"
   )
   class324 method1060() {
      class324 var1 = this.field562.field3944;
      if(var1 == this.field562) {
         return null;
      } else {
         var1.method6268();
         return var1;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lhe;)V"
   )
   public void method1057(class324 var1) {
      if(var1.field3945 != null) {
         var1.method6268();
      }

      var1.field3945 = this.field562.field3945;
      var1.field3944 = this.field562;
      var1.field3945.field3944 = var1;
      var1.field3944.field3945 = var1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "()Lhe;"
   )
   public class324 method1061() {
      class324 var1 = this.field562.field3944;
      return var1 == this.field562?null:var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lhe;Lhe;)V"
   )
   static void method1059(class324 var0, class324 var1) {
      if(var0.field3945 != null) {
         var0.method6268();
      }

      var0.field3945 = var1;
      var0.field3944 = var1.field3944;
      var0.field3945.field3944 = var0;
      var0.field3944.field3945 = var0;
   }
}
