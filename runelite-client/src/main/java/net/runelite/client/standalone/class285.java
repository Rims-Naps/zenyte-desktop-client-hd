package net.runelite.client.standalone;

import net.runelite.api.events.WidgetLoaded;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.rs.api.RSWidget;

@ObfuscatedName("gr")
public final class class285 {
   @ObfuscatedName("nf")
   @ObfuscatedGetter(
      intValue = 1311963653
   )
   static int field3067;
   @ObfuscatedName("gr")
   static int[] field3103;
   @ObfuscatedName("af")
   byte[] field3092;
   @ObfuscatedName("aw")
   byte[][] field3097;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1654948931
   )
   int field3080;
   @ObfuscatedName("f")
   final int field3069;
   @ObfuscatedName("v")
   byte field3078;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1554831175
   )
   int field3084;
   @ObfuscatedName("ac")
   byte[] field3095;
   @ObfuscatedName("ad")
   int[] field3101;
   @ObfuscatedName("m")
   byte[] field3074;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1366324841
   )
   int field3076;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1084832807
   )
   int field3065;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 960195045
   )
   int field3093;
   @ObfuscatedName("ag")
   boolean[] field3091;
   @ObfuscatedName("as")
   int[][] field3099;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -2083747855
   )
   int field3072;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1615759625
   )
   int field3066;
   @ObfuscatedName("c")
   byte[] field3073;
   @ObfuscatedName("e")
   final int field3079;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1107130153
   )
   int field3081;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 1839021259
   )
   int field3087;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -305793249
   )
   int field3071;
   @ObfuscatedName("l")
   final int field3085;
   @ObfuscatedName("az")
   byte[] field3082;
   @ObfuscatedName("o")
   int[] field3068;
   @ObfuscatedName("s")
   final int field3083;
   @ObfuscatedName("a")
   final int field3070;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1041307307
   )
   int field3089;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1148680983
   )
   int field3102;
   @ObfuscatedName("w")
   final int field3104;
   @ObfuscatedName("k")
   int[] field3088;
   @ObfuscatedName("aa")
   int[][] field3098;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 393013985
   )
   int field3096;
   @ObfuscatedName("am")
   byte[] field3077;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -49213987
   )
   int field3086;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -427343057
   )
   int field3075;
   @ObfuscatedName("at")
   int[] field3094;
   @ObfuscatedName("al")
   int[][] field3100;
   @ObfuscatedName("av")
   boolean[] field3090;

   class285() {
      this.field3069 = 4096;
      this.field3085 = 16;
      this.field3104 = 258;
      this.field3083 = 6;
      this.field3079 = 50;
      this.field3070 = 18002;
      this.field3072 = 0;
      this.field3075 = 0;
      this.field3068 = new int[256];
      this.field3088 = new int[257];
      this.field3090 = new boolean[256];
      this.field3091 = new boolean[16];
      this.field3092 = new byte[256];
      this.field3082 = new byte[4096];
      this.field3094 = new int[16];
      this.field3095 = new byte[18002];
      this.field3077 = new byte[18002];
      this.field3097 = new byte[6][258];
      this.field3098 = new int[6][258];
      this.field3099 = new int[6][258];
      this.field3100 = new int[6][258];
      this.field3101 = new int[6];
   }

   @ObfuscatedName("au")
   static void method5036(int var0, int var1) {
      client.copy$runWidgetOnLoadListener(var0, var1);
      RSWidget[][] var2 = class113.field1064.getWidgets();
      boolean var3 = var2 != null && var2[var0] != null;
      if(var3) {
         WidgetLoaded var4 = new WidgetLoaded();
         var4.setGroupId(var0);
         class113.field1064.getCallbacks().post(var4);
      }

   }
}
