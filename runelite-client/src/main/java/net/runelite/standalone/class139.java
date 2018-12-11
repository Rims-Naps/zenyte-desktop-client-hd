package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
public class class139 {
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 600644965
   )
   int field1791;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   Js5Index field1784;
   @ObfuscatedName("r")
   boolean field1792;
   @ObfuscatedName("a")
   String field1789;

   @ObfuscatedSignature(
      signature = "(Lik;)V"
   )
   class139(Js5Index var1) {
      this.field1791 = 0;
      this.field1792 = false;
      this.field1784 = var1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1064848029"
   )
   int method2604() {
      if(this.field1791 < 25) {
         if(!this.field1784.method4419(MapCacheArchiveNames.field3804.name, this.field1789)) {
            return this.field1791;
         }

         this.field1791 = 25;
      }

      if(this.field1791 == 25) {
         if(!this.field1784.method4419(this.field1789, MapCacheArchiveNames.field3806.name)) {
            return 25 + this.field1784.method4413(this.field1789) * 25 / 100;
         }

         this.field1791 = 50;
      }

      if(this.field1791 == 50) {
         if(this.field1784.method4417(MapCacheArchiveNames.field3807.name, this.field1789) && !this.field1784.method4419(MapCacheArchiveNames.field3807.name, this.field1789)) {
            return 50;
         }

         this.field1791 = 75;
      }

      if(this.field1791 == 75) {
         if(!this.field1784.method4419(this.field1789, MapCacheArchiveNames.field3803.name)) {
            return 75;
         }

         this.field1791 = 100;
         this.field1792 = true;
      }

      return this.field1791;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "345956177"
   )
   int method2606() {
      return this.field1791;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "24"
   )
   void method2612(String var1) {
      if(var1 != null && !var1.isEmpty()) {
         if(var1 != this.field1789) {
            this.field1789 = var1;
            this.field1791 = 0;
            this.field1792 = false;
            this.method2604();
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "401504317"
   )
   boolean method2605() {
      return this.field1792;
   }
}
