package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
public enum class222 implements class26 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   field3001(0, -1, true, false, true),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   field2990(1, 0, true, true, true),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   field2991(2, 1, true, true, false),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   field2993(3, 2, false, false, true),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   field2994(4, 3, false, false, true),
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   field2995(5, 10, false, false, true);

   @ObfuscatedName("gg")
   @ObfuscatedSignature(
      signature = "[Llp;"
   )
   static SpritePixels[] field3000;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1506660399
   )
   public final int field2992;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 170205525
   )
   final int field2996;
   @ObfuscatedName("r")
   public final boolean field2998;
   @ObfuscatedName("m")
   public final boolean field2999;

   class222(int var3, int var4, boolean var5, boolean var6, boolean var7) {
      this.field2996 = var3;
      this.field2992 = var4;
      this.field2998 = var6;
      this.field2999 = var7;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "87"
   )
   public int vmethod6234() {
      return this.field2996;
   }
}
