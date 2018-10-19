package net.runelite.client.standalone;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
public class class271 implements Iterator {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lhf;"
   )
   class316 field2974;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lhe;"
   )
   class193 field2973;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lhe;"
   )
   class193 field2975;

   @ObfuscatedSignature(
      signature = "(Lhf;)V"
   )
   class271(class316 var1) {
      this.field2975 = null;
      this.field2974 = var1;
      this.field2973 = this.field2974.field3392.field1843;
      this.field2975 = null;
   }

   public void remove() {
      if(this.field2975 == null) {
         throw new IllegalStateException();
      } else {
         this.field2975.method3298();
         this.field2975 = null;
      }
   }

   public Object next() {
      class193 var1 = this.field2973;
      if(var1 == this.field2974.field3392) {
         var1 = null;
         this.field2973 = null;
      } else {
         this.field2973 = var1.field1843;
      }

      this.field2975 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field2974.field3392 != this.field2973;
   }
}
