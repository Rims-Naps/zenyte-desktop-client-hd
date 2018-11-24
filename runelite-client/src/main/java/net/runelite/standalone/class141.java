package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFrameMap;

@ObfuscatedName("dq")
public class class141 extends class197 implements RSFrameMap {
   @ObfuscatedName("sv")
   @ObfuscatedSignature(
      signature = "Ll;"
   )
   static class138 field1801;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1640177435
   )
   int field1797;
   @ObfuscatedName("s")
   int[][] field1799;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 611870707
   )
   int field1796;
   @ObfuscatedName("w")
   int[] field1798;

   class141(int var1, byte[] var2) {
      this.field1796 = var1;
      class125 var3 = new class125(var2);
      this.field1797 = var3.method2256();
      this.field1798 = new int[this.field1797];
      this.field1799 = new int[this.field1797][];

      int var4;
      for(var4 = 0; var4 < this.field1797; ++var4) {
         this.field1798[var4] = var3.method2256();
      }

      for(var4 = 0; var4 < this.field1797; ++var4) {
         this.field1799[var4] = new int[var3.method2256()];
      }

      for(var4 = 0; var4 < this.field1797; ++var4) {
         for(int var5 = 0; var5 < this.field1799[var4].length; ++var5) {
            this.field1799[var4][var5] = var3.method2256();
         }
      }

   }

   public int getCount() {
      return this.field1797;
   }

   public int[] getTypes() {
      return this.field1798;
   }

   public int[][] getList() {
      return this.field1799;
   }
}
