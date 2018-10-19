package net.runelite.client.standalone;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
public class class132 extends class40 {
   @ObfuscatedName("f")
   AudioFormat field1256;
   @ObfuscatedName("l")
   SourceDataLine field1255;
   @ObfuscatedName("s")
   byte[] field1254;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -166745103
   )
   int field1257;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1185336736"
   )
   protected void vmethod2426() {
      this.field1256 = new AudioFormat((float)class40.field294, 16, class137.field1362?2:1, true, false);
      this.field1254 = new byte[256 << (class137.field1362?2:1)];
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1732447930"
   )
   protected void vmethod2431() {
      this.field1255.flush();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-18"
   )
   protected void vmethod2425() {
      if(this.field1255 != null) {
         this.field1255.close();
         this.field1255 = null;
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1371354819"
   )
   protected void vmethod2427(int var1) throws LineUnavailableException {
      try {
         Info var2 = new Info(SourceDataLine.class, this.field1256, var1 << (class137.field1362?2:1));
         this.field1255 = (SourceDataLine)AudioSystem.getLine(var2);
         this.field1255.open();
         this.field1255.start();
         this.field1257 = var1;
      } catch (LineUnavailableException var5) {
         if(class1.method14(var1) != 1) {
            int var4 = var1 - 1;
            var4 |= var4 >>> 1;
            var4 |= var4 >>> 2;
            var4 |= var4 >>> 4;
            var4 |= var4 >>> 8;
            var4 |= var4 >>> 16;
            int var3 = var4 + 1;
            this.vmethod2427(var3);
         } else {
            this.field1255 = null;
            throw var5;
         }
      }
   }

   @ObfuscatedName("s")
   protected void vmethod2429() {
      int var1 = 256;
      if(class137.field1362) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = super.field304[var2];
         if((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field1254[var2 * 2] = (byte)(var3 >> 8);
         this.field1254[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field1255.write(this.field1254, 0, var1 << 1);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "16711935"
   )
   protected int vmethod2428() {
      return this.field1257 - (this.field1255.available() >> (class137.field1362?2:1));
   }
}
