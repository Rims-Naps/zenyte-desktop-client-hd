package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public final class class134 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lhe;"
   )
   class193 field1320;

   public class134() {
      this.field1320 = new class193();
      this.field1320.field1843 = this.field1320;
      this.field1320.field1844 = this.field1320;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lhe;)V"
   )
   public void method2470(class193 var1) {
      if(var1.field1844 != null) {
         var1.method3298();
      }

      var1.field1844 = this.field1320.field1844;
      var1.field1843 = this.field1320;
      var1.field1844.field1843 = var1;
      var1.field1843.field1844 = var1;
   }

   @ObfuscatedName("c")
   void method2484() {
      while(true) {
         class193 var1 = this.field1320.field1843;
         if(var1 == this.field1320) {
            return;
         }

         var1.method3298();
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "()Lhe;"
   )
   public class193 method2474() {
      class193 var1 = this.field1320.field1843;
      return var1 == this.field1320?null:var1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lhe;)V"
   )
   public void method2469(class193 var1) {
      if(var1.field1844 != null) {
         var1.method3298();
      }

      var1.field1844 = this.field1320;
      var1.field1843 = this.field1320.field1843;
      var1.field1844.field1843 = var1;
      var1.field1843.field1844 = var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "()Lhe;"
   )
   class193 method2473() {
      class193 var1 = this.field1320.field1843;
      if(var1 == this.field1320) {
         return null;
      } else {
         var1.method3298();
         return var1;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lhe;Lhe;)V"
   )
   static void method2472(class193 var0, class193 var1) {
      if(var0.field1844 != null) {
         var0.method3298();
      }

      var0.field1844 = var1;
      var0.field1843 = var1.field1843;
      var0.field1844.field1843 = var0;
      var0.field1843.field1844 = var0;
   }
}
