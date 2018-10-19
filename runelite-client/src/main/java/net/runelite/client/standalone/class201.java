package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
public class class201 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lle;"
   )
   static class32 field1946;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   final class108 field1950;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 504946149
   )
   final int field1952;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1686711119
   )
   int field1947;

   @ObfuscatedSignature(
      signature = "(Lim;Ljava/lang/String;)V"
   )
   class201(class108 var1, String var2) {
      this.field1947 = 0;
      this.field1950 = var1;
      this.field1952 = var1.method2592();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-460037663"
   )
   boolean method3447() {
      this.field1947 = 0;

      for(int var1 = 0; var1 < this.field1952; ++var1) {
         if(!this.field1950.method1803(var1) || this.field1950.method1802(var1)) {
            ++this.field1947;
         }
      }

      return this.field1947 >= this.field1952;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "-1980051772"
   )
   public static boolean method3448(int var0) {
      return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
   }
}
