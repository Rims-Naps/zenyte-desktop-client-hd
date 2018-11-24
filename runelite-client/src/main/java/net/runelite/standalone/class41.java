package net.runelite.standalone;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSCombatInfoList;
import net.runelite.rs.api.RSNode;

@ObfuscatedName("gk")
public class class41 implements Iterable, RSCombatInfoList {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   class197 field419;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   class197 field420;

   public class41() {
      this.field420 = new class197();
      this.field420.field2790 = this.field420;
      this.field420.field2791 = this.field420;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "()Lgu;"
   )
   public class197 method747() {
      class197 var1 = this.field419;
      if(var1 == this.field420) {
         this.field419 = null;
         return null;
      } else {
         this.field419 = var1.field2790;
         return var1;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lgu;)Lgu;"
   )
   class197 method746(class197 var1) {
      class197 var2;
      if(var1 == null) {
         var2 = this.field420.field2790;
      } else {
         var2 = var1;
      }

      if(var2 == this.field420) {
         this.field419 = null;
         return null;
      } else {
         this.field419 = var2.field2790;
         return var2;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgu;)V"
   )
   public void method748(class197 var1) {
      if(var1.field2791 != null) {
         var1.method3937();
      }

      var1.field2791 = this.field420.field2791;
      var1.field2790 = this.field420;
      var1.field2791.field2790 = var1;
      var1.field2790.field2791 = var1;
   }

   @ObfuscatedName("f")
   public void method753() {
      while(this.field420.field2790 != this.field420) {
         this.field420.field2790.method3937();
      }

   }

   @ObfuscatedName("r")
   public boolean method757() {
      return this.field420.field2790 == this.field420;
   }

   public Iterator iterator() {
      return new class83(this);
   }

   public RSNode getNode() {
      return this.field420;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "()Lgu;"
   )
   public class197 method745() {
      return this.method746((class197)null);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgu;)V"
   )
   public void method762(class197 var1) {
      if(var1.field2791 != null) {
         var1.method3937();
      }

      var1.field2791 = this.field420;
      var1.field2790 = this.field420.field2790;
      var1.field2791.field2790 = var1;
      var1.field2790.field2791 = var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgu;Lgu;)V"
   )
   public static void method744(class197 var0, class197 var1) {
      if(var0.field2791 != null) {
         var0.method3937();
      }

      var0.field2791 = var1;
      var0.field2790 = var1.field2790;
      var0.field2791.field2790 = var0;
      var0.field2790.field2791 = var0;
   }
}
