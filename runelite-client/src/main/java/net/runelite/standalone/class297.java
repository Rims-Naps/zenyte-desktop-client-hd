package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
public class class297 implements Runnable {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "[Lch;"
   )
   volatile class293[] field3702;

   class297() {
      this.field3702 = new class293[2];
   }

   public void run() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            class293 var2 = this.field3702[var1];
            if(var2 != null) {
               var2.method5724();
            }
         }
      } catch (Exception var4) {
         class202.method4018((String)null, var4, -1845537571);
      }

   }
}
