package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
public class class212 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lhu;"
   )
   class212 field2058;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lhu;"
   )
   class212 field2057;

   @ObfuscatedName("f")
   public void method3742() {
      if(this.field2057 != null) {
         this.field2057.field2058 = this.field2058;
         this.field2058.field2057 = this.field2057;
         this.field2058 = null;
         this.field2057 = null;
      }
   }
}
