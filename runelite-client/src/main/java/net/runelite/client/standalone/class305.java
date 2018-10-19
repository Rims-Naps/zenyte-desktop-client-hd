package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSChatPlayer;

@ObfuscatedName("kj")
public class class305 extends class242 implements RSChatPlayer {
   @ObfuscatedName("x")
   static int[] field3263;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1451534115
   )
   public int field3261;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 634317765
   )
   public int field3265;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1607302947
   )
   public int field3262;

   class305() {
      this.field3265 = -1;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2056681086"
   )
   public int method5266() {
      return this.field3265;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-72840214"
   )
   public boolean method5273() {
      return this.field3265 > 0;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1205762778"
   )
   void method5265(int var1, int var2) {
      this.field3265 = var1;
      this.field3262 = var2;
   }

   public int getRSRank() {
      return this.field3261;
   }

   public int getWorld() {
      return this.field3265;
   }
}
