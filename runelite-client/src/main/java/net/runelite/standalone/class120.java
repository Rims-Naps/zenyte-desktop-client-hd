package net.runelite.standalone;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
public class class120 implements Iterable {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lhe;"
   )
   class324 field1642;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lhe;"
   )
   public class324 field1641;

   public class120() {
      this.field1641 = new class324();
      this.field1641.field3944 = this.field1641;
      this.field1641.field3945 = this.field1641;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "()Lhe;"
   )
   class324 method2165() {
      class324 var1 = this.field1642;
      if(var1 == this.field1641) {
         this.field1642 = null;
         return null;
      } else {
         this.field1642 = var1.field3944;
         return var1;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lhe;)V"
   )
   public void method2168(class324 var1) {
      if(var1.field3945 != null) {
         var1.method6268();
      }

      var1.field3945 = this.field1641.field3945;
      var1.field3944 = this.field1641;
      var1.field3945.field3944 = var1;
      var1.field3944.field3945 = var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "()Lhe;"
   )
   class324 method2176() {
      return this.method2169((class324)null);
   }

   @ObfuscatedName("f")
   public void method2166() {
      while(this.field1641.field3944 != this.field1641) {
         this.field1641.field3944.method6268();
      }

   }

   public Iterator iterator() {
      return new class251(this);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Lhe;)Lhe;"
   )
   class324 method2169(class324 var1) {
      class324 var2;
      if(var1 == null) {
         var2 = this.field1641.field3944;
      } else {
         var2 = var1;
      }

      if(var2 == this.field1641) {
         this.field1642 = null;
         return null;
      } else {
         this.field1642 = var2.field3944;
         return var2;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "()Lhe;"
   )
   class324 method2167() {
      class324 var1 = this.field1641.field3944;
      if(var1 == this.field1641) {
         return null;
      } else {
         var1.method6268();
         return var1;
      }
   }
}
