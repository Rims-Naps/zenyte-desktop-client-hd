package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFrameMap;

@ObfuscatedName("dq")
public class class29 extends class76 implements RSFrameMap {
   @ObfuscatedName("sv")
   @ObfuscatedSignature(
      signature = "Ll;"
   )
   static class170 field225;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 611870707
   )
   int field220;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1640177435
   )
   int field221;
   @ObfuscatedName("s")
   int[][] field223;
   @ObfuscatedName("w")
   int[] field222;

   class29(int var1, byte[] var2) {
      this.field220 = var1;
      Buffer var3 = new Buffer(var2);
      this.field221 = var3.readUnsignedByte();
      this.field222 = new int[this.field221];
      this.field223 = new int[this.field221][];

      int var4;
      for(var4 = 0; var4 < this.field221; ++var4) {
         this.field222[var4] = var3.readUnsignedByte();
      }

      for(var4 = 0; var4 < this.field221; ++var4) {
         this.field223[var4] = new int[var3.readUnsignedByte()];
      }

      for(var4 = 0; var4 < this.field221; ++var4) {
         for(int var5 = 0; var5 < this.field223[var4].length; ++var5) {
            this.field223[var4][var5] = var3.readUnsignedByte();
         }
      }

   }

   public int getCount() {
      return this.field221;
   }

   public int[] getTypes() {
      return this.field222;
   }

   public int[][] getList() {
      return this.field223;
   }
}
