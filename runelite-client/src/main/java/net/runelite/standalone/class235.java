package net.runelite.standalone;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public final class class235 implements Iterable {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "[Lgu;"
   )
   class197[] field3101;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   class197 field3102;
   @ObfuscatedName("f")
   int field3103;
   @ObfuscatedName("e")
   int field3104;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   class197 field3100;

   public class235(int var1) {
      this.field3104 = 0;
      this.field3103 = var1;
      this.field3101 = new class197[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class197 var3 = this.field3101[var2] = new class197();
         var3.field2790 = var3;
         var3.field2791 = var3;
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgu;J)V"
   )
   public void method4672(class197 var1, long var2) {
      if(var1.field2791 != null) {
         var1.method3937();
      }

      class197 var4 = this.field3101[(int)(var2 & (long)(this.field3103 - 1))];
      var1.field2791 = var4.field2791;
      var1.field2790 = var4;
      var1.field2791.field2790 = var1;
      var1.field2790.field2791 = var1;
      var1.field2792 = var2;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "()Lgu;"
   )
   public class197 method4674() {
      this.field3104 = 0;
      return this.method4675();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(J)Lgu;"
   )
   public class197 method4670(long var1) {
      class197 var3 = this.field3101[(int)(var1 & (long)(this.field3103 - 1))];

      for(this.field3100 = var3.field2790; var3 != this.field3100; this.field3100 = this.field3100.field2790) {
         if(this.field3100.field2792 == var1) {
            class197 var4 = this.field3100;
            this.field3100 = this.field3100.field2790;
            return var4;
         }
      }

      this.field3100 = null;
      return null;
   }

   public Iterator iterator() {
      return new class106(this);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "()Lgu;"
   )
   public class197 method4675() {
      class197 var1;
      if(this.field3104 > 0 && this.field3101[this.field3104 - 1] != this.field3102) {
         var1 = this.field3102;
         this.field3102 = var1.field2790;
         return var1;
      } else {
         do {
            if(this.field3104 >= this.field3103) {
               return null;
            }

            var1 = this.field3101[this.field3104++].field2790;
         } while(var1 == this.field3101[this.field3104 - 1]);

         this.field3102 = var1.field2790;
         return var1;
      }
   }

   @ObfuscatedName("w")
   public void method4673() {
      for(int var1 = 0; var1 < this.field3103; ++var1) {
         class197 var2 = this.field3101[var1];

         while(true) {
            class197 var3 = var2.field2790;
            if(var3 == var2) {
               break;
            }

            var3.method3937();
         }
      }

      this.field3100 = null;
      this.field3102 = null;
   }
}
