package net.runelite.client.standalone;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public final class class46 implements Iterable {
   @ObfuscatedName("f")
   int field357;
   @ObfuscatedName("e")
   int field358;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "[Lgu;"
   )
   class76[] field355;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   class76 field356;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   class76 field354;

   public class46(int var1) {
      this.field358 = 0;
      this.field357 = var1;
      this.field355 = new class76[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class76 var3 = this.field355[var2] = new class76();
         var3.field702 = var3;
         var3.field703 = var3;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(J)Lgu;"
   )
   public class76 method792(long var1) {
      class76 var3 = this.field355[(int)(var1 & (long)(this.field357 - 1))];

      for(this.field354 = var3.field702; var3 != this.field354; this.field354 = this.field354.field702) {
         if(this.field354.field704 == var1) {
            class76 var4 = this.field354;
            this.field354 = this.field354.field702;
            return var4;
         }
      }

      this.field354 = null;
      return null;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "()Lgu;"
   )
   public class76 method797() {
      class76 var1;
      if(this.field358 > 0 && this.field355[this.field358 - 1] != this.field356) {
         var1 = this.field356;
         this.field356 = var1.field702;
         return var1;
      } else {
         do {
            if(this.field358 >= this.field357) {
               return null;
            }

            var1 = this.field355[this.field358++].field702;
         } while(var1 == this.field355[this.field358 - 1]);

         this.field356 = var1.field702;
         return var1;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgu;J)V"
   )
   public void method794(class76 var1, long var2) {
      if(var1.field703 != null) {
         var1.method1186();
      }

      class76 var4 = this.field355[(int)(var2 & (long)(this.field357 - 1))];
      var1.field703 = var4.field703;
      var1.field702 = var4;
      var1.field703.field702 = var1;
      var1.field702.field703 = var1;
      var1.field704 = var2;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "()Lgu;"
   )
   public class76 method796() {
      this.field358 = 0;
      return this.method797();
   }

   @ObfuscatedName("w")
   public void method795() {
      for(int var1 = 0; var1 < this.field357; ++var1) {
         class76 var2 = this.field355[var1];

         while(true) {
            class76 var3 = var2.field702;
            if(var3 == var2) {
               break;
            }

            var3.method1186();
         }
      }

      this.field354 = null;
      this.field356 = null;
   }

   public Iterator iterator() {
      return new class23(this);
   }
}
