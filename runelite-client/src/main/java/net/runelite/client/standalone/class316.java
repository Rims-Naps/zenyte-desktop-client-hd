package net.runelite.client.standalone;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
public class class316 implements Iterable {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lhe;"
   )
   public class193 field3392;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lhe;"
   )
   class193 field3393;

   public class316() {
      this.field3392 = new class193();
      this.field3392.field1843 = this.field3392;
      this.field3392.field1844 = this.field3392;
   }

   @ObfuscatedName("f")
   public void method5554() {
      while(this.field3392.field1843 != this.field3392) {
         this.field3392.field1843.method3298();
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "()Lhe;"
   )
   class193 method5553() {
      class193 var1 = this.field3393;
      if(var1 == this.field3392) {
         this.field3393 = null;
         return null;
      } else {
         this.field3393 = var1.field1843;
         return var1;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Lhe;)Lhe;"
   )
   class193 method5557(class193 var1) {
      class193 var2;
      if(var1 == null) {
         var2 = this.field3392.field1843;
      } else {
         var2 = var1;
      }

      if(var2 == this.field3392) {
         this.field3393 = null;
         return null;
      } else {
         this.field3393 = var2.field1843;
         return var2;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lhe;)V"
   )
   public void method5556(class193 var1) {
      if(var1.field1844 != null) {
         var1.method3298();
      }

      var1.field1844 = this.field3392.field1844;
      var1.field1843 = this.field3392;
      var1.field1844.field1843 = var1;
      var1.field1843.field1844 = var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "()Lhe;"
   )
   class193 method5564() {
      return this.method5557((class193)null);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "()Lhe;"
   )
   class193 method5555() {
      class193 var1 = this.field3392.field1843;
      if(var1 == this.field3392) {
         return null;
      } else {
         var1.method3298();
         return var1;
      }
   }

   public Iterator iterator() {
      return new class271(this);
   }
}
