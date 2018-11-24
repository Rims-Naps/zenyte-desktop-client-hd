package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
public class class25 extends class324 {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class100 field264;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class217 field263;
   @ObfuscatedName("w")
   public boolean field265;

   static {
      field264 = new class100(64);
   }

   class25() {
      this.field265 = false;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgm;B)V",
      garbageValue = "-10"
   )
   void method452(class125 var1) {
      while(true) {
         int var2 = var1.method2256();
         if(var2 == 0) {
            return;
         }

         this.method450(var1, var2);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "-1144596178"
   )
   void method450(class125 var1, int var2) {
      if(var2 == 2) {
         this.field265 = true;
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(CI)Z",
      garbageValue = "1667428276"
   )
   public static boolean method459(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-52"
   )
   public static void method451() {
      class315.field3858.method1816();
      class315.field3871.method1816();
   }
}
