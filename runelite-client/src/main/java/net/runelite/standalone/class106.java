package net.runelite.standalone;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
public class class106 implements Iterator {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   class197 field1161;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   class197 field1162;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lga;"
   )
   class235 field1163;
   @ObfuscatedName("w")
   int field1164;

   @ObfuscatedSignature(
      signature = "(Lga;)V"
   )
   class106(class235 var1) {
      this.field1162 = null;
      this.field1163 = var1;
      this.method1873();
   }

   @ObfuscatedName("z")
   void method1873() {
      this.field1161 = this.field1163.field3101[0].field2790;
      this.field1164 = 1;
      this.field1162 = null;
   }

   public Object next() {
      class197 var1;
      if(this.field1163.field3101[this.field1164 - 1] != this.field1161) {
         var1 = this.field1161;
         this.field1161 = var1.field2790;
         this.field1162 = var1;
         return var1;
      } else {
         do {
            if(this.field1164 >= this.field1163.field3103) {
               return null;
            }

            var1 = this.field1163.field3101[this.field1164++].field2790;
         } while(var1 == this.field1163.field3101[this.field1164 - 1]);

         this.field1161 = var1.field2790;
         this.field1162 = var1;
         return var1;
      }
   }

   public boolean hasNext() {
      if(this.field1163.field3101[this.field1164 - 1] != this.field1161) {
         return true;
      } else {
         while(this.field1164 < this.field1163.field3103) {
            if(this.field1163.field3101[this.field1164++].field2790 != this.field1163.field3101[this.field1164 - 1]) {
               this.field1161 = this.field1163.field3101[this.field1164 - 1].field2790;
               return true;
            }

            this.field1161 = this.field1163.field3101[this.field1164 - 1];
         }

         return false;
      }
   }

   public void remove() {
      if(this.field1162 == null) {
         throw new IllegalStateException();
      } else {
         this.field1162.method3937();
         this.field1162 = null;
      }
   }
}
