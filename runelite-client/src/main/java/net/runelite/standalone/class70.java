package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSDeque;
import net.runelite.rs.api.RSNode;

@ObfuscatedName("gs")
public class class70 implements RSDeque {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   class197 field809;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   public class197 field808;

   public class70() {
      this.field808 = new class197();
      this.field808.field2790 = this.field808;
      this.field808.field2791 = this.field808;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "()Lgu;"
   )
   public class197 method1503() {
      class197 var1 = this.field808.field2790;
      if(var1 == this.field808) {
         this.field809 = null;
         return null;
      } else {
         this.field809 = var1.field2790;
         return var1;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "()Lgu;"
   )
   public class197 method1502() {
      class197 var1 = this.field808.field2791;
      if(var1 == this.field808) {
         return null;
      } else {
         var1.method3937();
         return var1;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgu;)V"
   )
   public void method1499(class197 var1) {
      if(var1.field2791 != null) {
         var1.method3937();
      }

      var1.field2791 = this.field808.field2791;
      var1.field2790 = this.field808;
      var1.field2791.field2790 = var1;
      var1.field2790.field2791 = var1;
   }

   @ObfuscatedName("f")
   public void method1520() {
      while(true) {
         class197 var1 = this.field808.field2790;
         if(var1 == this.field808) {
            this.field809 = null;
            return;
         }

         var1.method3937();
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "()Lgu;"
   )
   public class197 method1504() {
      class197 var1 = this.field808.field2791;
      if(var1 == this.field808) {
         this.field809 = null;
         return null;
      } else {
         this.field809 = var1.field2791;
         return var1;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "()Lgu;"
   )
   public class197 method1505() {
      class197 var1 = this.field809;
      if(var1 == this.field808) {
         this.field809 = null;
         return null;
      } else {
         this.field809 = var1.field2790;
         return var1;
      }
   }

   public RSNode getHead() {
      return this.field808;
   }

   public RSNode getCurrent() {
      return this.field809;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "()Lgu;"
   )
   public class197 method1506() {
      class197 var1 = this.field809;
      if(var1 == this.field808) {
         this.field809 = null;
         return null;
      } else {
         this.field809 = var1.field2791;
         return var1;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "()Lgu;"
   )
   public class197 method1498() {
      class197 var1 = this.field808.field2790;
      if(var1 == this.field808) {
         return null;
      } else {
         var1.method3937();
         return var1;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgu;)V"
   )
   public void method1500(class197 var1) {
      if(var1.field2791 != null) {
         var1.method3937();
      }

      var1.field2791 = this.field808;
      var1.field2790 = this.field808.field2790;
      var1.field2791.field2790 = var1;
      var1.field2790.field2791 = var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgu;Lgu;)V"
   )
   public static void method1521(class197 var0, class197 var1) {
      if(var0.field2791 != null) {
         var0.method3937();
      }

      var0.field2791 = var1.field2791;
      var0.field2790 = var1;
      var0.field2791.field2790 = var0;
      var0.field2790.field2791 = var0;
   }
}
