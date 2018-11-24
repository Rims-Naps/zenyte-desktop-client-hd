package net.runelite.standalone;

import net.runelite.api.events.WidgetLoaded;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.rs.api.RSWidget;

@ObfuscatedName("gr")
public final class class54 {
   @ObfuscatedName("nf")
   @ObfuscatedGetter(
      intValue = 1311963653
   )
   static int field661;
   @ObfuscatedName("gr")
   static int[] field697;
   @ObfuscatedName("af")
   byte[] field686;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1654948931
   )
   int field674;
   @ObfuscatedName("k")
   int[] field682;
   @ObfuscatedName("ag")
   boolean[] field685;
   @ObfuscatedName("ac")
   byte[] field689;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1148680983
   )
   int field696;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1366324841
   )
   int field670;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -2083747855
   )
   int field666;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 393013985
   )
   int field690;
   @ObfuscatedName("aa")
   int[][] field692;
   @ObfuscatedName("c")
   byte[] field667;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1554831175
   )
   int field678;
   @ObfuscatedName("aw")
   byte[][] field691;
   @ObfuscatedName("l")
   final int field679;
   @ObfuscatedName("s")
   final int field677;
   @ObfuscatedName("f")
   final int field663;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1084832807
   )
   int field659;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 960195045
   )
   int field687;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1615759625
   )
   int field660;
   @ObfuscatedName("m")
   byte[] field668;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -49213987
   )
   int field680;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1107130153
   )
   int field675;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -305793249
   )
   int field665;
   @ObfuscatedName("v")
   byte field672;
   @ObfuscatedName("av")
   boolean[] field684;
   @ObfuscatedName("at")
   int[] field688;
   @ObfuscatedName("as")
   int[][] field693;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -427343057
   )
   int field669;
   @ObfuscatedName("a")
   final int field664;
   @ObfuscatedName("am")
   byte[] field671;
   @ObfuscatedName("o")
   int[] field662;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1041307307
   )
   int field683;
   @ObfuscatedName("ad")
   int[] field695;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 1839021259
   )
   int field681;
   @ObfuscatedName("al")
   int[][] field694;
   @ObfuscatedName("e")
   final int field673;
   @ObfuscatedName("az")
   byte[] field676;
   @ObfuscatedName("w")
   final int field698;

   class54() {
      this.field663 = 4096;
      this.field679 = 16;
      this.field698 = 258;
      this.field677 = 6;
      this.field673 = 50;
      this.field664 = 18002;
      this.field666 = 0;
      this.field669 = 0;
      this.field662 = new int[256];
      this.field682 = new int[257];
      this.field684 = new boolean[256];
      this.field685 = new boolean[16];
      this.field686 = new byte[256];
      this.field676 = new byte[4096];
      this.field688 = new int[16];
      this.field689 = new byte[18002];
      this.field671 = new byte[18002];
      this.field691 = new byte[6][258];
      this.field692 = new int[6][258];
      this.field693 = new int[6][258];
      this.field694 = new int[6][258];
      this.field695 = new int[6];
   }

   @ObfuscatedName("au")
   static void method1224(int var0, int var1) {
      client.copy$runWidgetOnLoadListener(var0, var1);
      RSWidget[][] var2 = class302.field3755.getWidgets();
      boolean var3 = var2 != null && var2[var0] != null;
      if(var3) {
         WidgetLoaded var4 = new WidgetLoaded();
         var4.setGroupId(var0);
         class302.field3755.getCallbacks().post(var4);
      }

   }
}
