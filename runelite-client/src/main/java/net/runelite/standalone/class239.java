package net.runelite.standalone;

import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
public class class239 {
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -654408005
   )
   public static int field3141;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1700037787
   )
   public static int field3123;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lgt;"
   )
   public static class50 field3128;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 13824407
   )
   public static int field3129;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1313916093
   )
   public static int field3122;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 946147765
   )
   public static int field3130;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static class98 field3132;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lfo;"
   )
   public static class36 field3135;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "[Lim;"
   )
   public static class6[] field3138;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static class98 field3127;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -95067997
   )
   public static int field3133;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1389949405
   )
   public static int field3136;
   @ObfuscatedName("x")
   public static boolean field3140;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Liw;"
   )
   public static class326 field3134;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static class98 field3131;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static class98 field3126;
   @ObfuscatedName("o")
   public static byte field3139;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lgm;"
   )
   public static class125 field3125;
   @ObfuscatedName("t")
   public static CRC32 field3137;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1313463487
   )
   public static int field3124;

   static {
      field3130 = 0;
      field3132 = new class98(4096);
      field3124 = 0;
      field3126 = new class98(32);
      field3122 = 0;
      field3128 = new class50();
      field3127 = new class98(4096);
      field3133 = 0;
      field3131 = new class98(4096);
      field3123 = 0;
      field3125 = new class125(8);
      field3136 = 0;
      field3137 = new CRC32();
      field3138 = new class6[256];
      field3139 = 0;
      field3129 = 0;
      field3141 = 0;
   }

   @ObfuscatedName("kj")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "0"
   )
   public static boolean method4720() {
      return client.field2263 >= 2;
   }
}
