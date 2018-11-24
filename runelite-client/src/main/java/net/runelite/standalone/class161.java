package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
public class class161 {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lhu;"
   )
   class161 field1955;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lhu;"
   )
   class161 field1956;

   @ObfuscatedName("f")
   public void method2964() {
      if(this.field1955 != null) {
         this.field1955.field1956 = this.field1956;
         this.field1956.field1955 = this.field1955;
         this.field1956 = null;
         this.field1955 = null;
      }
   }
}
