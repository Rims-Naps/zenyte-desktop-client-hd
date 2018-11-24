package net.runelite.standalone;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
public class class60 extends class293 {
   @ObfuscatedName("l")
   SourceDataLine field730;
   @ObfuscatedName("s")
   byte[] field729;
   @ObfuscatedName("f")
   AudioFormat field731;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -166745103
   )
   int field732;

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1732447930"
   )
   protected void vmethod5728() {
      this.field730.flush();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1371354819"
   )
   protected void vmethod5727(int var1) throws LineUnavailableException {
      try {
         Info var2 = new Info(SourceDataLine.class, this.field731, var1 << (class268.field3462?2:1));
         this.field730 = (SourceDataLine)AudioSystem.getLine(var2);
         this.field730.open();
         this.field730.start();
         this.field732 = var1;
      } catch (LineUnavailableException var5) {
         if(class328.method6316(var1) != 1) {
            int var4 = var1 - 1;
            var4 |= var4 >>> 1;
            var4 |= var4 >>> 2;
            var4 |= var4 >>> 4;
            var4 |= var4 >>> 8;
            var4 |= var4 >>> 16;
            int var3 = var4 + 1;
            this.vmethod5727(var3);
         } else {
            this.field730 = null;
            throw var5;
         }
      }
   }

   @ObfuscatedName("s")
   protected void vmethod5723() {
      int var1 = 256;
      if(class268.field3462) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = super.field3667[var2];
         if((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field729[var2 * 2] = (byte)(var3 >> 8);
         this.field729[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field730.write(this.field729, 0, var1 << 1);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1185336736"
   )
   protected void vmethod5726() {
      this.field731 = new AudioFormat((float)class293.field3657, 16, class268.field3462?2:1, true, false);
      this.field729 = new byte[256 << (class268.field3462?2:1)];
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-18"
   )
   protected void vmethod5730() {
      if(this.field730 != null) {
         this.field730.close();
         this.field730 = null;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "16711935"
   )
   protected int vmethod5754() {
      return this.field732 - (this.field730.available() >> (class268.field3462?2:1));
   }
}
