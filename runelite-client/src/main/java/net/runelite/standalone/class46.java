package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
public class class46 {
   @ObfuscatedName("p")
   int field515;
   @ObfuscatedName("c")
   int field516;
   @ObfuscatedName("l")
   int[] field511;
   @ObfuscatedName("s")
   int field513;
   @ObfuscatedName("f")
   int field518;
   @ObfuscatedName("r")
   int field519;
   @ObfuscatedName("m")
   int field517;
   @ObfuscatedName("d")
   int field520;
   @ObfuscatedName("a")
   int field510;
   @ObfuscatedName("e")
   int field514;
   @ObfuscatedName("w")
   int[] field512;

   class46() {
      this.field518 = 2;
      this.field511 = new int[2];
      this.field512 = new int[2];
      this.field511[0] = 0;
      this.field511[1] = 65535;
      this.field512[0] = 0;
      this.field512[1] = 65535;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgm;)V"
   )
   final void method881(class125 var1) {
      this.field518 = var1.method2256();
      this.field511 = new int[this.field518];
      this.field512 = new int[this.field518];

      for(int var2 = 0; var2 < this.field518; ++var2) {
         this.field511[var2] = var1.method2258();
         this.field512[var2] = var1.method2258();
      }

   }

   @ObfuscatedName("s")
   final int method882(int var1) {
      if(this.field520 >= this.field516) {
         this.field517 = this.field512[this.field515++] << 15;
         if(this.field515 >= this.field518) {
            this.field515 = this.field518 - 1;
         }

         this.field516 = (int)((double)this.field511[this.field515] / 65536.0D * (double)var1);
         if(this.field516 > this.field520) {
            this.field519 = ((this.field512[this.field515] << 15) - this.field517) / (this.field516 - this.field520);
         }
      }

      this.field517 += this.field519;
      ++this.field520;
      return this.field517 - this.field519 >> 15;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgm;)V"
   )
   final void method880(class125 var1) {
      this.field510 = var1.method2256();
      this.field513 = var1.method2344();
      this.field514 = var1.method2344();
      this.method881(var1);
   }

   @ObfuscatedName("w")
   final void method887() {
      this.field516 = 0;
      this.field515 = 0;
      this.field519 = 0;
      this.field517 = 0;
      this.field520 = 0;
   }
}
