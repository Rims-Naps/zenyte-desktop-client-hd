package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
public class class42 {
   @ObfuscatedName("r")
   boolean field335;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 600644965
   )
   int field334;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   class148 field327;
   @ObfuscatedName("a")
   String field332;

   @ObfuscatedSignature(
      signature = "(Lik;)V"
   )
   class42(class148 var1) {
      this.field334 = 0;
      this.field335 = false;
      this.field327 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "24"
   )
   void method733(String var1) {
      if(var1 != null && !var1.isEmpty()) {
         if(var1 != this.field332) {
            this.field332 = var1;
            this.field334 = 0;
            this.field335 = false;
            this.method725();
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1064848029"
   )
   int method725() {
      if(this.field334 < 25) {
         if(!this.field327.method2600(class171.field1580.field1585, this.field332)) {
            return this.field334;
         }

         this.field334 = 25;
      }

      if(this.field334 == 25) {
         if(!this.field327.method2600(this.field332, class171.field1582.field1585)) {
            return 25 + this.field327.method2594(this.field332) * 25 / 100;
         }

         this.field334 = 50;
      }

      if(this.field334 == 50) {
         if(this.field327.method2598(class171.field1583.field1585, this.field332) && !this.field327.method2600(class171.field1583.field1585, this.field332)) {
            return 50;
         }

         this.field334 = 75;
      }

      if(this.field334 == 75) {
         if(!this.field327.method2600(this.field332, class171.field1579.field1585)) {
            return 75;
         }

         this.field334 = 100;
         this.field335 = true;
      }

      return this.field334;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "345956177"
   )
   int method727() {
      return this.field334;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "401504317"
   )
   boolean method726() {
      return this.field335;
   }
}
