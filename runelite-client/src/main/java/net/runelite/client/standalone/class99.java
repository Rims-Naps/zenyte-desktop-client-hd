package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
public class class99 implements Runnable {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "[Lch;"
   )
   volatile class40[] field915;

   class99() {
      this.field915 = new class40[2];
   }

   public void run() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            class40 var2 = this.field915[var1];
            if(var2 != null) {
               var2.method646();
            }
         }
      } catch (Exception var4) {
         class295.method5145((String)null, var4, -1845537571);
      }

   }
}
