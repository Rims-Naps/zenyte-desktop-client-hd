package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSNode;

@ObfuscatedName("gu")
public class class197 implements RSNode {
   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   public class197 field2790;
   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   class197 field2791;
   @ObfuscatedName("cb")
   public long field2792;

   public void onUnlink() {
   }

   public void rl$unlink() {
      this.onUnlink();
   }

   public long getHash() {
      return this.field2792;
   }

   public RSNode getNext() {
      return this.field2790;
   }

   public RSNode getPrevious() {
      return this.field2791;
   }

   public void unlink() {
      this.method3937();
   }

   @ObfuscatedName("jh")
   public boolean method3938() {
      return this.field2791 != null;
   }

   @ObfuscatedName("jr")
   public void method3937() {
      this.rl$unlink();
      if(this.field2791 != null) {
         this.field2791.field2790 = this.field2790;
         this.field2790.field2791 = this.field2791;
         this.field2790 = null;
         this.field2791 = null;
      }
   }
}
