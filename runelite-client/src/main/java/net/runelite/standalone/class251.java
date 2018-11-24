package net.runelite.standalone;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
public class class251 implements Iterator {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lhe;"
   )
   class324 field3329;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lhf;"
   )
   class120 field3330;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lhe;"
   )
   class324 field3331;

   @ObfuscatedSignature(
      signature = "(Lhf;)V"
   )
   class251(class120 var1) {
      this.field3331 = null;
      this.field3330 = var1;
      this.field3329 = this.field3330.field1641.field3944;
      this.field3331 = null;
   }

   public void remove() {
      if(this.field3331 == null) {
         throw new IllegalStateException();
      } else {
         this.field3331.method6268();
         this.field3331 = null;
      }
   }

   public Object next() {
      class324 var1 = this.field3329;
      if(var1 == this.field3330.field1641) {
         var1 = null;
         this.field3329 = null;
      } else {
         this.field3329 = var1.field3944;
      }

      this.field3331 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field3330.field1641 != this.field3329;
   }
}
