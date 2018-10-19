package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSNode;

@ObfuscatedName("gu")
public class class76 implements RSNode {
   @ObfuscatedName("cb")
   public long field704;
   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   public class76 field702;
   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   class76 field703;

   @ObfuscatedName("jh")
   public boolean method1187() {
      return this.field703 != null;
   }

   @ObfuscatedName("jr")
   public void method1186() {
      this.rl$unlink();
      if(this.field703 != null) {
         this.field703.field702 = this.field702;
         this.field702.field703 = this.field703;
         this.field702 = null;
         this.field703 = null;
      }
   }

   public void onUnlink() {
   }

   public void rl$unlink() {
      this.onUnlink();
   }

   public long getHash() {
      return this.field704;
   }

   public RSNode getNext() {
      return this.field702;
   }

   public RSNode getPrevious() {
      return this.field703;
   }

   public void unlink() {
      this.method1186();
   }
}
