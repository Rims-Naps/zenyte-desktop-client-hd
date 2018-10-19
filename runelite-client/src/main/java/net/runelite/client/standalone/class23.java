package net.runelite.client.standalone;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
public class class23 implements Iterator {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lga;"
   )
   class46 field166;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   class76 field164;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   class76 field165;
   @ObfuscatedName("w")
   int field167;

   @ObfuscatedSignature(
      signature = "(Lga;)V"
   )
   class23(class46 var1) {
      this.field165 = null;
      this.field166 = var1;
      this.method229();
   }

   @ObfuscatedName("z")
   void method229() {
      this.field164 = this.field166.field355[0].field702;
      this.field167 = 1;
      this.field165 = null;
   }

   public Object next() {
      class76 var1;
      if(this.field166.field355[this.field167 - 1] != this.field164) {
         var1 = this.field164;
         this.field164 = var1.field702;
         this.field165 = var1;
         return var1;
      } else {
         do {
            if(this.field167 >= this.field166.field357) {
               return null;
            }

            var1 = this.field166.field355[this.field167++].field702;
         } while(var1 == this.field166.field355[this.field167 - 1]);

         this.field164 = var1.field702;
         this.field165 = var1;
         return var1;
      }
   }

   public boolean hasNext() {
      if(this.field166.field355[this.field167 - 1] != this.field164) {
         return true;
      } else {
         while(this.field167 < this.field166.field357) {
            if(this.field166.field355[this.field167++].field702 != this.field166.field355[this.field167 - 1]) {
               this.field164 = this.field166.field355[this.field167 - 1].field702;
               return true;
            }

            this.field164 = this.field166.field355[this.field167 - 1];
         }

         return false;
      }
   }

   public void remove() {
      if(this.field165 == null) {
         throw new IllegalStateException();
      } else {
         this.field165.method1186();
         this.field165 = null;
      }
   }
}
