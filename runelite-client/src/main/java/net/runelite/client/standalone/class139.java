package net.runelite.client.standalone;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("c")
final class class139 implements Comparator {
   @ObfuscatedName("fr")
   @ObfuscatedSignature(
      signature = "Lkm;"
   )
   static class166 field1376;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lw;Lw;I)I",
      garbageValue = "-1791011267"
   )
   int method2518(class230 var1, class230 var2) {
      return var1.method4110().compareTo(var2.method4110());
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method2518((class230)var1, (class230)var2);
   }
}
