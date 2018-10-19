package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class class92 extends class303 {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      longValue = 912737176274829863L
   )
   long field885;

   public class92() {
      this.field885 = System.nanoTime();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1412174677"
   )
   public void vmethod5547() {
      this.field885 = System.nanoTime();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-673206051"
   )
   public int vmethod5544(int var1, int var2) {
      long var3 = 1000000L * (long)var2;
      long var5 = this.field885 - System.nanoTime();
      if(var5 < var3) {
         var5 = var3;
      }

      class189.method3249(var5 / 1000000L);
      long var7 = System.nanoTime();

      int var9;
      for(var9 = 0; var9 < 10 && (var9 < 1 || this.field885 < var7); this.field885 += 1000000L * (long)var1) {
         ++var9;
      }

      if(this.field885 < var7) {
         this.field885 = var7;
      }

      return var9;
   }
}
