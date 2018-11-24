package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSChatPlayer;

@ObfuscatedName("kj")
public class class62 extends class330 implements RSChatPlayer {
   @ObfuscatedName("x")
   static int[] field735;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1451534115
   )
   public int field733;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1607302947
   )
   public int field734;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 634317765
   )
   public int field737;

   class62() {
      this.field737 = -1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1205762778"
   )
   void method1338(int var1, int var2) {
      this.field737 = var1;
      this.field734 = var2;
   }

   public int getRSRank() {
      return this.field733;
   }

   public int getWorld() {
      return this.field737;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-72840214"
   )
   public boolean method1346() {
      return this.field737 > 0;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2056681086"
   )
   public int method1339() {
      return this.field737;
   }
}
