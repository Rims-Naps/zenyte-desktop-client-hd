package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
public class class307 extends class193 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   static class148 field3276;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class124 field3277;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1193379705
   )
   public int field3278;

   static {
      field3277 = new class124(64);
   }

   class307() {
      this.field3278 = 0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "1016123430"
   )
   void method5279(Buffer var1, int var2) {
      if(var2 == 2) {
         this.field3278 = var1.readUnsignedShort();
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;B)V",
      garbageValue = "7"
   )
   void method5278(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method5279(var1, var2);
      }
   }
}
