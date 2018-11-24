package net.runelite.standalone;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class83 implements Iterator {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   class197 field906;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgk;"
   )
   class41 field907;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   class197 field908;

   @ObfuscatedSignature(
      signature = "(Lgk;)V"
   )
   class83(class41 var1) {
      this.field908 = null;
      this.field907 = var1;
      this.field906 = this.field907.field420.field2790;
      this.field908 = null;
   }

   public Object next() {
      class197 var1 = this.field906;
      if(var1 == this.field907.field420) {
         var1 = null;
         this.field906 = null;
      } else {
         this.field906 = var1.field2790;
      }

      this.field908 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field907.field420 != this.field906;
   }

   public void remove() {
      if(this.field908 == null) {
         throw new IllegalStateException();
      } else {
         this.field908.method3937();
         this.field908 = null;
      }
   }
}
