package net.runelite.client.standalone;

import java.applet.Applet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSRunException;

@ObfuscatedName("ep")
public class class302 extends RuntimeException implements RSRunException {
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 571798449
   )
   static int field3241;
   @ObfuscatedName("f")
   public static Applet field3236;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lgm;"
   )
   public static Buffer field3240;
   @ObfuscatedName("l")
   public static String field3232;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1004536935
   )
   public static int field3231;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1347342793
   )
   public static int field3233;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 74518771
   )
   static int field3237;
   @ObfuscatedName("e")
   String field3235;
   @ObfuscatedName("a")
   Throwable field3234;

   class302(Throwable var1, String var2) {
      this.field3235 = var2;
      this.field3234 = var1;
   }

   public Throwable getParent() {
      return this.field3234;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IILfh;Lfr;I)Z",
      garbageValue = "2104181159"
   )
   public static final boolean method5205(int var0, int var1, class48 var2, class182 var3) {
      int var4 = var0;
      int var5 = var1;
      byte var6 = 64;
      byte var7 = 64;
      int var8 = var0 - var6;
      int var9 = var1 - var7;
      class154.field1474[var6][var7] = 99;
      class154.field1477[var6][var7] = 0;
      byte var10 = 0;
      int var11 = 0;
      class154.field1476[var10] = var0;
      byte var10001 = var10;
      int var18 = var10 + 1;
      class154.field1472[var10001] = var1;
      int[][] var12 = var3.field1765;

      while(var18 != var11) {
         var4 = class154.field1476[var11];
         var5 = class154.field1472[var11];
         var11 = var11 + 1 & 4095;
         int var16 = var4 - var8;
         int var17 = var5 - var9;
         int var13 = var4 - var3.field1761;
         int var14 = var5 - var3.field1762;
         if(var2.vmethod2285(1, var4, var5, var3)) {
            class114.field1066 = var4;
            class1.field9 = var5;
            return true;
         }

         int var15 = class154.field1477[var16][var17] + 1;
         if(var16 > 0 && class154.field1474[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136776) == 0) {
            class154.field1476[var18] = var4 - 1;
            class154.field1472[var18] = var5;
            var18 = var18 + 1 & 4095;
            class154.field1474[var16 - 1][var17] = 2;
            class154.field1477[var16 - 1][var17] = var15;
         }

         if(var16 < 127 && class154.field1474[var16 + 1][var17] == 0 && (var12[var13 + 1][var14] & 19136896) == 0) {
            class154.field1476[var18] = var4 + 1;
            class154.field1472[var18] = var5;
            var18 = var18 + 1 & 4095;
            class154.field1474[var16 + 1][var17] = 8;
            class154.field1477[var16 + 1][var17] = var15;
         }

         if(var17 > 0 && class154.field1474[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
            class154.field1476[var18] = var4;
            class154.field1472[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            class154.field1474[var16][var17 - 1] = 1;
            class154.field1477[var16][var17 - 1] = var15;
         }

         if(var17 < 127 && class154.field1474[var16][var17 + 1] == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
            class154.field1476[var18] = var4;
            class154.field1472[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            class154.field1474[var16][var17 + 1] = 4;
            class154.field1477[var16][var17 + 1] = var15;
         }

         if(var16 > 0 && var17 > 0 && class154.field1474[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
            class154.field1476[var18] = var4 - 1;
            class154.field1472[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            class154.field1474[var16 - 1][var17 - 1] = 3;
            class154.field1477[var16 - 1][var17 - 1] = var15;
         }

         if(var16 < 127 && var17 > 0 && class154.field1474[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
            class154.field1476[var18] = var4 + 1;
            class154.field1472[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            class154.field1474[var16 + 1][var17 - 1] = 9;
            class154.field1477[var16 + 1][var17 - 1] = var15;
         }

         if(var16 > 0 && var17 < 127 && class154.field1474[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
            class154.field1476[var18] = var4 - 1;
            class154.field1472[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            class154.field1474[var16 - 1][var17 + 1] = 6;
            class154.field1477[var16 - 1][var17 + 1] = var15;
         }

         if(var16 < 127 && var17 < 127 && class154.field1474[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 1] & 19136992) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
            class154.field1476[var18] = var4 + 1;
            class154.field1472[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            class154.field1474[var16 + 1][var17 + 1] = 12;
            class154.field1477[var16 + 1][var17 + 1] = var15;
         }
      }

      class114.field1066 = var4;
      class1.field9 = var5;
      return false;
   }
}
