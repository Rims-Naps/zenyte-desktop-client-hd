package net.runelite.standalone;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("c")
final class class126 implements Comparator {
   @ObfuscatedName("fr")
   @ObfuscatedSignature(
      signature = "Lkm;"
   )
   static class223 field1704;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lw;Lw;I)I",
      garbageValue = "-1791011267"
   )
   int method2475(class317 var1, class317 var2) {
      return var1.method6206().compareTo(var2.method6206());
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method2475((class317)var1, (class317)var2);
   }
}
