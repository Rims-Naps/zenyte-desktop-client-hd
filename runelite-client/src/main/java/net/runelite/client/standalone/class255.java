package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
public class class255 {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 256503451
   )
   public int field2530;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1906910519
   )
   public int field2534;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1989421783
   )
   public int field2528;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1730404637
   )
   public int field2532;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1691321545
   )
   public int field2531;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -537863113
   )
   public int field2529;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 894711017
   )
   public int field2526;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 413476637
   )
   public int field2533;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1122196817
   )
   public int field2525;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -168396461
   )
   public int field2527;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1065000831
   )
   public int field2535;

   public class255() {
      this.field2530 = -1;
      this.field2526 = -1;
      this.field2527 = -1;
      this.field2533 = -1;
      this.field2529 = -1;
      this.field2525 = -1;
      this.field2531 = -1;
      this.field2532 = -1;
      this.field2528 = -1;
      this.field2534 = -1;
      this.field2535 = -1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;I)V",
      garbageValue = "-1506588001"
   )
   public void method4555(class148 var1) {
      byte[] var2 = var1.method2586(class72.field672.field671);
      Buffer var3 = new Buffer(var2);

      while(true) {
         int var4 = var3.readUnsignedByte();
         if(var4 == 0) {
            return;
         }

         switch(var4) {
         case 1:
            var3.method1909();
            break;
         case 2:
            this.field2530 = var3.method1942();
            this.field2526 = var3.method1942();
            this.field2527 = var3.method1942();
            this.field2533 = var3.method1942();
            this.field2529 = var3.method1942();
            this.field2525 = var3.method1942();
            this.field2531 = var3.method1942();
            this.field2532 = var3.method1942();
            this.field2528 = var3.method1942();
            this.field2534 = var3.method1942();
            this.field2535 = var3.method1942();
         }
      }
   }
}
