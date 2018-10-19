package net.runelite.client.standalone;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSCombatInfoList;
import net.runelite.rs.api.RSNode;

@ObfuscatedName("gk")
public class class60 implements Iterable, RSCombatInfoList {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   class76 field467;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   class76 field466;

   public class60() {
      this.field467 = new class76();
      this.field467.field702 = this.field467;
      this.field467.field703 = this.field467;
   }

   @ObfuscatedName("f")
   public void method1059() {
      while(this.field467.field702 != this.field467) {
         this.field467.field702.method1186();
      }

   }

   @ObfuscatedName("r")
   public boolean method1063() {
      return this.field467.field702 == this.field467;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "()Lgu;"
   )
   public class76 method1053() {
      class76 var1 = this.field466;
      if(var1 == this.field467) {
         this.field466 = null;
         return null;
      } else {
         this.field466 = var1.field702;
         return var1;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lgu;)Lgu;"
   )
   class76 method1052(class76 var1) {
      class76 var2;
      if(var1 == null) {
         var2 = this.field467.field702;
      } else {
         var2 = var1;
      }

      if(var2 == this.field467) {
         this.field466 = null;
         return null;
      } else {
         this.field466 = var2.field702;
         return var2;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "()Lgu;"
   )
   public class76 method1051() {
      return this.method1052((class76)null);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgu;)V"
   )
   public void method1054(class76 var1) {
      if(var1.field703 != null) {
         var1.method1186();
      }

      var1.field703 = this.field467.field703;
      var1.field702 = this.field467;
      var1.field703.field702 = var1;
      var1.field702.field703 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgu;)V"
   )
   public void method1068(class76 var1) {
      if(var1.field703 != null) {
         var1.method1186();
      }

      var1.field703 = this.field467;
      var1.field702 = this.field467.field702;
      var1.field703.field702 = var1;
      var1.field702.field703 = var1;
   }

   public Iterator iterator() {
      return new class217(this);
   }

   public RSNode getNode() {
      return this.field467;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgu;Lgu;)V"
   )
   public static void method1050(class76 var0, class76 var1) {
      if(var0.field703 != null) {
         var0.method1186();
      }

      var0.field703 = var1;
      var0.field702 = var1.field702;
      var0.field703.field702 = var0;
      var0.field702.field703 = var0;
   }
}
