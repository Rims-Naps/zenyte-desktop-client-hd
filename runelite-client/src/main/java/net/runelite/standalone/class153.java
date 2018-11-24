package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
public class class153 {
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Lhw;IIII)V",
      garbageValue = "-59478638"
   )
   static final void method2785(class187 var0, int var1, int var2, int var3) {
      if(var0.field2635 == null) {
         throw new RuntimeException();
      } else {
         var0.field2635[var1] = var2;
         var0.field2636[var1] = var3;
      }
   }
}
