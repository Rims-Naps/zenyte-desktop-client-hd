package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
public class class135 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lle;"
   )
   static class303 field1744;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 504946149
   )
   final int field1750;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   final class6 field1748;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1686711119
   )
   int field1745;

   @ObfuscatedSignature(
      signature = "(Lim;Ljava/lang/String;)V"
   )
   class135(class6 var1, String var2) {
      this.field1745 = 0;
      this.field1748 = var1;
      this.field1750 = var1.method4411();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-460037663"
   )
   boolean method2563() {
      this.field1745 = 0;

      for(int var1 = 0; var1 < this.field1750; ++var1) {
         if(!this.field1748.method106(var1) || this.field1748.method105(var1)) {
            ++this.field1745;
         }
      }

      return this.field1745 >= this.field1750;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "-1980051772"
   )
   public static boolean method2564(int var0) {
      return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
   }
}
