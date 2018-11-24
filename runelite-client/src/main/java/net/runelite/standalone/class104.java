package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
public class class104 extends class324 {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class100 field1151;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class217 field1156;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1449440461
   )
   public int field1154;
   @ObfuscatedName("a")
   boolean field1152;
   @ObfuscatedName("e")
   public String field1155;
   @ObfuscatedName("w")
   char field1153;

   static {
      field1151 = new class100(64);
   }

   class104() {
      this.field1152 = true;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-29"
   )
   void method1861() {
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgm;IB)V",
      garbageValue = "44"
   )
   void method1859(class125 var1, int var2) {
      if(var2 == 1) {
         this.field1153 = class274.method5367(var1.method2257());
      } else if(var2 == 2) {
         this.field1154 = var1.method2344();
      } else if(var2 == 4) {
         this.field1152 = false;
      } else if(var2 == 5) {
         this.field1155 = var1.method2265();
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "1"
   )
   public boolean method1870() {
      return this.field1153 == 's';
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "-1661276391"
   )
   void method1857(class125 var1) {
      while(true) {
         int var2 = var1.method2256();
         if(var2 == 0) {
            return;
         }

         this.method1859(var1, var2);
      }
   }
}
