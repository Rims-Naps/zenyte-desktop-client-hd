package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSChatPlayer;

@ObfuscatedName("kv")
public class ChatPlayer extends Nameable implements RSChatPlayer {
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Liu;"
   )
   static Js5Index field3709;
   @ObfuscatedName("j")
   static int[] field3707;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 845682055
   )
   public int field3706;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -849994939
   )
   public int rank;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1910801327
   )
   public int world;

   ChatPlayer() {
      this.world = -1;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "0"
   )
   public int method793() {
      return this.world;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1699750405"
   )
   public boolean method797() {
      return this.world > 0;
   }

   public int getRSRank() {
      return this.rank;
   }

   public int getWorld() {
      return this.world;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1946948981"
   )
   void method794(int var1, int var2) {
      this.world = var1;
      this.field3706 = var2;
   }
}
