package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
public class class30 {
   @ObfuscatedName("f")
   int field235;
   @ObfuscatedName("m")
   int field234;
   @ObfuscatedName("r")
   int field236;
   @ObfuscatedName("p")
   int field232;
   @ObfuscatedName("c")
   int field233;
   @ObfuscatedName("e")
   int field231;
   @ObfuscatedName("l")
   int[] field228;
   @ObfuscatedName("s")
   int field230;
   @ObfuscatedName("a")
   int field227;
   @ObfuscatedName("w")
   int[] field229;
   @ObfuscatedName("d")
   int field237;

   class30() {
      this.field235 = 2;
      this.field228 = new int[2];
      this.field229 = new int[2];
      this.field228[0] = 0;
      this.field228[1] = 65535;
      this.field229[0] = 0;
      this.field229[1] = 65535;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgm;)V"
   )
   final void method487(Buffer var1) {
      this.field227 = var1.readUnsignedByte();
      this.field230 = var1.readInt();
      this.field231 = var1.readInt();
      this.method488(var1);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgm;)V"
   )
   final void method488(Buffer var1) {
      this.field235 = var1.readUnsignedByte();
      this.field228 = new int[this.field235];
      this.field229 = new int[this.field235];

      for(int var2 = 0; var2 < this.field235; ++var2) {
         this.field228[var2] = var1.readUnsignedShort();
         this.field229[var2] = var1.readUnsignedShort();
      }

   }

   @ObfuscatedName("s")
   final int method489(int var1) {
      if(this.field237 >= this.field233) {
         this.field234 = this.field229[this.field232++] << 15;
         if(this.field232 >= this.field235) {
            this.field232 = this.field235 - 1;
         }

         this.field233 = (int)((double)this.field228[this.field232] / 65536.0D * (double)var1);
         if(this.field233 > this.field237) {
            this.field236 = ((this.field229[this.field232] << 15) - this.field234) / (this.field233 - this.field237);
         }
      }

      this.field234 += this.field236;
      ++this.field237;
      return this.field234 - this.field236 >> 15;
   }

   @ObfuscatedName("w")
   final void method494() {
      this.field233 = 0;
      this.field232 = 0;
      this.field236 = 0;
      this.field234 = 0;
      this.field237 = 0;
   }
}
