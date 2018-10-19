package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
public class class244 extends class193 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class148 field2435;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class124 field2436;
   @ObfuscatedName("w")
   public boolean field2437;

   static {
      field2436 = new class124(64);
   }

   class244() {
      this.field2437 = false;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgm;B)V",
      garbageValue = "-10"
   )
   void method4473(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method4471(var1, var2);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "-1144596178"
   )
   void method4471(Buffer var1, int var2) {
      if(var2 == 2) {
         this.field2437 = true;
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(CI)Z",
      garbageValue = "1667428276"
   )
   public static boolean method4480(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-52"
   )
   public static void method4472() {
      class222.field2140.method2271();
      class222.field2153.method2271();
   }
}
