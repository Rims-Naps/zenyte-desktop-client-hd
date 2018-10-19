package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
public class class131 {
   @ObfuscatedName("gc")
   @ObfuscatedSignature(
      signature = "[Llp;"
   )
   static class26[] field1253;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 523532977
   )
   public int field1248;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1811851351
   )
   public int field1249;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -218751737
   )
   public int field1251;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -818438797
   )
   public int field1250;

   public class131(int var1, int var2, int var3, int var4) {
      this.method2399(var1, var2);
      this.method2400(var3, var4);
   }

   public class131(int var1, int var2) {
      this(0, 0, var1, var2);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1392269668"
   )
   public void method2399(int var1, int var2) {
      this.field1248 = var1;
      this.field1249 = var2;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1588480678"
   )
   int method2405() {
      return this.field1251 + this.field1249;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "65"
   )
   int method2398() {
      return this.field1248 + this.field1250;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Llo;Llo;I)V",
      garbageValue = "1066785556"
   )
   void method2404(class131 var1, class131 var2) {
      var2.field1249 = this.field1249;
      var2.field1251 = this.field1251;
      if(this.field1249 < var1.field1249) {
         var2.field1251 -= var1.field1249 - this.field1249;
         var2.field1249 = var1.field1249;
      }

      if(var2.method2405() > var1.method2405()) {
         var2.field1251 -= var2.method2405() - var1.method2405();
      }

      if(var2.field1251 < 0) {
         var2.field1251 = 0;
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "2028894137"
   )
   public void method2400(int var1, int var2) {
      this.field1250 = var1;
      this.field1251 = var2;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Llo;Llo;I)V",
      garbageValue = "-1706945741"
   )
   void method2403(class131 var1, class131 var2) {
      var2.field1248 = this.field1248;
      var2.field1250 = this.field1250;
      if(this.field1248 < var1.field1248) {
         var2.field1250 -= var1.field1248 - this.field1248;
         var2.field1248 = var1.field1248;
      }

      if(var2.method2398() > var1.method2398()) {
         var2.field1250 -= var2.method2398() - var1.method2398();
      }

      if(var2.field1250 < 0) {
         var2.field1250 = 0;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Llo;Llo;B)V",
      garbageValue = "-110"
   )
   public void method2422(class131 var1, class131 var2) {
      this.method2403(var1, var2);
      this.method2404(var1, var2);
   }

   public String toString() {
      return null;
   }
}
