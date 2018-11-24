package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSCacheableNode;

@ObfuscatedName("he")
public class class324 extends class197 implements RSCacheableNode {
   @ObfuscatedName("cr")
   long field3943;
   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      signature = "Lhe;"
   )
   public class324 field3944;
   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      signature = "Lhe;"
   )
   public class324 field3945;

   @ObfuscatedName("cb")
   public void method6268() {
      if(this.field3945 != null) {
         this.field3945.field3944 = this.field3944;
         this.field3944.field3945 = this.field3945;
         this.field3944 = null;
         this.field3945 = null;
      }
   }
}
