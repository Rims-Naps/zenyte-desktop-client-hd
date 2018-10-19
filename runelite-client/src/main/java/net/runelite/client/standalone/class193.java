package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSCacheableNode;

@ObfuscatedName("he")
public class class193 extends class76 implements RSCacheableNode {
   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      signature = "Lhe;"
   )
   public class193 field1844;
   @ObfuscatedName("cr")
   long field1842;
   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      signature = "Lhe;"
   )
   public class193 field1843;

   @ObfuscatedName("cb")
   public void method3298() {
      if(this.field1844 != null) {
         this.field1844.field1843 = this.field1843;
         this.field1843.field1844 = this.field1844;
         this.field1843 = null;
         this.field1844 = null;
      }
   }
}
