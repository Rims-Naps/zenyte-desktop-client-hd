package net.runelite.client.standalone;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class217 implements Iterator {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgk;"
   )
   class60 field2084;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   class76 field2083;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   class76 field2085;

   @ObfuscatedSignature(
      signature = "(Lgk;)V"
   )
   class217(class60 var1) {
      this.field2085 = null;
      this.field2084 = var1;
      this.field2083 = this.field2084.field467.field702;
      this.field2085 = null;
   }

   public Object next() {
      class76 var1 = this.field2083;
      if(var1 == this.field2084.field467) {
         var1 = null;
         this.field2083 = null;
      } else {
         this.field2083 = var1.field702;
      }

      this.field2085 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field2084.field467 != this.field2083;
   }

   public void remove() {
      if(this.field2085 == null) {
         throw new IllegalStateException();
      } else {
         this.field2085.method1186();
         this.field2085 = null;
      }
   }
}
