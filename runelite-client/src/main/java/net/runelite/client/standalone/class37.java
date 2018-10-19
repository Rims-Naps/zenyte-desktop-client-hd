package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
public class class37 {
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Lhw;IIII)V",
      garbageValue = "-59478638"
   )
   static final void method594(class329 var0, int var1, int var2, int var3) {
      if(var0.field3621 == null) {
         throw new RuntimeException();
      } else {
         var0.field3621[var1] = var2;
         var0.field3622[var1] = var3;
      }
   }
}
