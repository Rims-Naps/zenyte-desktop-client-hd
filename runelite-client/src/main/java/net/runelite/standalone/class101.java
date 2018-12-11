package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
public class class101 extends class324 {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class100 field1139;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   static Js5Index field1138;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1193379705
   )
   public int field1140;

   static {
      field1139 = new class100(64);
   }

   class101() {
      this.field1140 = 0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "1016123430"
   )
   void method1832(Buffer var1, int var2) {
      if(var2 == 2) {
         this.field1140 = var1.readUnsignedShort();
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;B)V",
      garbageValue = "7"
   )
   void method1831(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method1832(var1, var2);
      }
   }
}
