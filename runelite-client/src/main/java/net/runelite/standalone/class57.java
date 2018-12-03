package net.runelite.standalone;

import java.applet.Applet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSRunException;

@ObfuscatedName("ep")
public class class57 extends RuntimeException implements RSRunException {
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 571798449
   )
   static int field715;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lgm;"
   )
   public static Buffer field714;
   @ObfuscatedName("l")
   public static String field706;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1004536935
   )
   public static int field705;
   @ObfuscatedName("f")
   public static Applet field710;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 74518771
   )
   static int field711;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1347342793
   )
   public static int field707;
   @ObfuscatedName("a")
   Throwable field708;
   @ObfuscatedName("e")
   String field709;

   class57(Throwable var1, String var2) {
      this.field709 = var2;
      this.field708 = var1;
   }

   public Throwable getParent() {
      return this.field708;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IILfh;Lfr;I)Z",
      garbageValue = "2104181159"
   )
   public static final boolean method1249(int var0, int var1, class31 var2, class3 var3) {
      int var4 = var0;
      int var5 = var1;
      byte var6 = 64;
      byte var7 = 64;
      int var8 = var0 - var6;
      int var9 = var1 - var7;
      class180.field2465[var6][var7] = 99;
      class180.field2468[var6][var7] = 0;
      byte var10 = 0;
      int var11 = 0;
      class180.field2467[var10] = var0;
      byte var10001 = var10;
      int var18 = var10 + 1;
      class180.field2463[var10001] = var1;
      int[][] var12 = var3.field35;

      while(var18 != var11) {
         var4 = class180.field2467[var11];
         var5 = class180.field2463[var11];
         var11 = var11 + 1 & 4095;
         int var16 = var4 - var8;
         int var17 = var5 - var9;
         int var13 = var4 - var3.field31;
         int var14 = var5 - var3.field32;
         if(var2.vmethod5314(1, var4, var5, var3)) {
            class22.field240 = var4;
            class328.field3971 = var5;
            return true;
         }

         int var15 = class180.field2468[var16][var17] + 1;
         if(var16 > 0 && class180.field2465[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136776) == 0) {
            class180.field2467[var18] = var4 - 1;
            class180.field2463[var18] = var5;
            var18 = var18 + 1 & 4095;
            class180.field2465[var16 - 1][var17] = 2;
            class180.field2468[var16 - 1][var17] = var15;
         }

         if(var16 < 127 && class180.field2465[var16 + 1][var17] == 0 && (var12[var13 + 1][var14] & 19136896) == 0) {
            class180.field2467[var18] = var4 + 1;
            class180.field2463[var18] = var5;
            var18 = var18 + 1 & 4095;
            class180.field2465[var16 + 1][var17] = 8;
            class180.field2468[var16 + 1][var17] = var15;
         }

         if(var17 > 0 && class180.field2465[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
            class180.field2467[var18] = var4;
            class180.field2463[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            class180.field2465[var16][var17 - 1] = 1;
            class180.field2468[var16][var17 - 1] = var15;
         }

         if(var17 < 127 && class180.field2465[var16][var17 + 1] == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
            class180.field2467[var18] = var4;
            class180.field2463[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            class180.field2465[var16][var17 + 1] = 4;
            class180.field2468[var16][var17 + 1] = var15;
         }

         if(var16 > 0 && var17 > 0 && class180.field2465[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
            class180.field2467[var18] = var4 - 1;
            class180.field2463[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            class180.field2465[var16 - 1][var17 - 1] = 3;
            class180.field2468[var16 - 1][var17 - 1] = var15;
         }

         if(var16 < 127 && var17 > 0 && class180.field2465[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
            class180.field2467[var18] = var4 + 1;
            class180.field2463[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            class180.field2465[var16 + 1][var17 - 1] = 9;
            class180.field2468[var16 + 1][var17 - 1] = var15;
         }

         if(var16 > 0 && var17 < 127 && class180.field2465[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
            class180.field2467[var18] = var4 - 1;
            class180.field2463[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            class180.field2465[var16 - 1][var17 + 1] = 6;
            class180.field2468[var16 - 1][var17 + 1] = var15;
         }

         if(var16 < 127 && var17 < 127 && class180.field2465[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 1] & 19136992) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
            class180.field2467[var18] = var4 + 1;
            class180.field2463[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            class180.field2465[var16 + 1][var17 + 1] = 12;
            class180.field2468[var16 + 1][var17 + 1] = var15;
         }
      }

      class22.field240 = var4;
      class328.field3971 = var5;
      return false;
   }
}
