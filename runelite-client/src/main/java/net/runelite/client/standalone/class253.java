package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
public enum class253 implements class91 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   field2515(0, -1, true, false, true),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   field2504(1, 0, true, true, true),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   field2505(2, 1, true, true, false),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   field2507(3, 2, false, false, true),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   field2508(4, 3, false, false, true),
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   field2509(5, 10, false, false, true);

   @ObfuscatedName("gg")
   @ObfuscatedSignature(
      signature = "[Llp;"
   )
   static class26[] field2514;
   @ObfuscatedName("m")
   public final boolean field2513;
   @ObfuscatedName("r")
   public final boolean field2512;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1506660399
   )
   public final int field2506;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 170205525
   )
   final int field2510;

   class253(int var3, int var4, boolean var5, boolean var6, boolean var7) {
      this.field2510 = var3;
      this.field2506 = var4;
      this.field2512 = var6;
      this.field2513 = var7;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "87"
   )
   public int vmethod5937() {
      return this.field2510;
   }
}
