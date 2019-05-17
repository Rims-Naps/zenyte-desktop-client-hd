package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
public enum ChatCrownType implements Enumerated {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   NONE(0, -1, true, false, true),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   PLAYER_MOD(1, 0, true, true, true),
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   STAFF_MOD(2, 1, true, true, false),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   IRONMAN(3, 2, false, false, true),
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   ULTIMATE_IRONMAN(4, 3, false, false, true),
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   HARDCORE_IRONMAN(5, 10, false, false, true);

   @ObfuscatedName("e")
   static int[] field3209;
   @ObfuscatedName("q")
   public final boolean moderator;
   @ObfuscatedName("m")
   public final int icon;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1798871115
   )
   final int id;
   @ObfuscatedName("b")
   public final boolean ignorable;

   ChatCrownType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
      this.id = var3;
      this.icon = var4;
      this.moderator = var6;
      this.ignorable = var7;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-303219076"
   )
   public int vmethod6373() {
      return this.id;
   }
}
