package net.runelite.client.standalone;

import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
public class class270 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lfo;"
   )
   public static class314 field2966;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Liw;"
   )
   public static class332 field2965;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -95067997
   )
   public static int field2964;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1700037787
   )
   public static int field2954;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "[Lim;"
   )
   public static class108[] field2969;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static class310 field2958;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lgt;"
   )
   public static class134 field2959;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1313916093
   )
   public static int field2953;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1313463487
   )
   public static int field2955;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1389949405
   )
   public static int field2967;
   @ObfuscatedName("t")
   public static CRC32 field2968;
   @ObfuscatedName("x")
   public static boolean field2971;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 946147765
   )
   public static int field2961;
   @ObfuscatedName("o")
   public static byte field2970;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static class310 field2963;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static class310 field2957;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lgm;"
   )
   public static Buffer field2956;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -654408005
   )
   public static int field2972;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 13824407
   )
   public static int field2960;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static class310 field2962;

   static {
      field2961 = 0;
      field2963 = new class310(4096);
      field2955 = 0;
      field2957 = new class310(32);
      field2953 = 0;
      field2959 = new class134();
      field2958 = new class310(4096);
      field2964 = 0;
      field2962 = new class310(4096);
      field2954 = 0;
      field2956 = new Buffer(8);
      field2967 = 0;
      field2968 = new CRC32();
      field2969 = new class108[256];
      field2970 = 0;
      field2960 = 0;
      field2972 = 0;
   }

   @ObfuscatedName("kj")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "0"
   )
   public static boolean method4879() {
      return client.field3842 >= 2;
   }
}
