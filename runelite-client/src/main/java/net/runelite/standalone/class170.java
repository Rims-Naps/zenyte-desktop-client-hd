package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
public class class170 {
   @ObfuscatedName("gc")
   @ObfuscatedSignature(
      signature = "[Llp;"
   )
   static SpritePixels[] field2023;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1811851351
   )
   public int field2019;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -218751737
   )
   public int field2021;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 523532977
   )
   public int field2018;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -818438797
   )
   public int field2020;

   public class170(int var1, int var2, int var3, int var4) {
      this.method3105(var1, var2);
      this.method3106(var3, var4);
   }

   public class170(int var1, int var2) {
      this(0, 0, var1, var2);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1588480678"
   )
   int method3111() {
      return this.field2021 + this.field2019;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "65"
   )
   int method3104() {
      return this.field2018 + this.field2020;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "2028894137"
   )
   public void method3106(int var1, int var2) {
      this.field2020 = var1;
      this.field2021 = var2;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Llo;Llo;I)V",
      garbageValue = "-1706945741"
   )
   void method3109(class170 var1, class170 var2) {
      var2.field2018 = this.field2018;
      var2.field2020 = this.field2020;
      if(this.field2018 < var1.field2018) {
         var2.field2020 -= var1.field2018 - this.field2018;
         var2.field2018 = var1.field2018;
      }

      if(var2.method3104() > var1.method3104()) {
         var2.field2020 -= var2.method3104() - var1.method3104();
      }

      if(var2.field2020 < 0) {
         var2.field2020 = 0;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1392269668"
   )
   public void method3105(int var1, int var2) {
      this.field2018 = var1;
      this.field2019 = var2;
   }

   public String toString() {
      return null;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Llo;Llo;I)V",
      garbageValue = "1066785556"
   )
   void method3110(class170 var1, class170 var2) {
      var2.field2019 = this.field2019;
      var2.field2021 = this.field2021;
      if(this.field2019 < var1.field2019) {
         var2.field2021 -= var1.field2019 - this.field2019;
         var2.field2019 = var1.field2019;
      }

      if(var2.method3111() > var1.method3111()) {
         var2.field2021 -= var2.method3111() - var1.method3111();
      }

      if(var2.field2021 < 0) {
         var2.field2021 = 0;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Llo;Llo;B)V",
      garbageValue = "-110"
   )
   public void method3128(class170 var1, class170 var2) {
      this.method3109(var1, var2);
      this.method3110(var1, var2);
   }
}
