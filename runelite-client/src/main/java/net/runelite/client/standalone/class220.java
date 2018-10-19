package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
public class class220 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lhu;"
   )
   class212 field2136;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lhu;"
   )
   class212 field2135;

   public class220() {
      this.field2136 = new class212();
      this.field2136.field2058 = this.field2136;
      this.field2136.field2057 = this.field2136;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lhu;)V"
   )
   public void method3936(class212 var1) {
      if(var1.field2057 != null) {
         var1.method3742();
      }

      var1.field2057 = this.field2136.field2057;
      var1.field2058 = this.field2136;
      var1.field2057.field2058 = var1;
      var1.field2058.field2057 = var1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "()Lhu;"
   )
   public class212 method3935() {
      class212 var1 = this.field2136.field2058;
      if(var1 == this.field2136) {
         this.field2135 = null;
         return null;
      } else {
         this.field2135 = var1.field2058;
         return var1;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "()Lhu;"
   )
   public class212 method3938() {
      class212 var1 = this.field2135;
      if(var1 == this.field2136) {
         this.field2135 = null;
         return null;
      } else {
         this.field2135 = var1.field2058;
         return var1;
      }
   }
}
