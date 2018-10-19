package net.runelite.client.standalone;

import java.applet.Applet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public class class7 {
   @ObfuscatedName("f")
   static Applet field56;
   @ObfuscatedName("ix")
   @ObfuscatedGetter(
      intValue = 2037366283
   )
   static int field53;
   @ObfuscatedName("l")
   static String field50;

   static {
      field56 = null;
      field50 = "";
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Lik;Lik;III)Lkn;",
      garbageValue = "559953092"
   )
   public static class277 method92(class148 var0, class148 var1, int var2, int var3) {
      byte[] var5 = var0.method2579(var2, var3, -212174985);
      boolean var4;
      if(var5 == null) {
         var4 = false;
      } else {
         class194.method3303(var5);
         var4 = true;
      }

      return !var4?null:class40.method696(var1.method2579(var2, var3, -1498044373));
   }

   @ObfuscatedName("gy")
   @ObfuscatedSignature(
      signature = "(IIIB)I",
      garbageValue = "122"
   )
   static final int method85(int var0, int var1, int var2) {
      int var3 = var0 >> 7;
      int var4 = var1 >> 7;
      if(var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
         int var5 = var2;
         if(var2 < 3 && (class31.field239[1][var3][var4] & 2) == 2) {
            var5 = var2 + 1;
         }

         int var6 = var0 & 127;
         int var7 = var1 & 127;
         int var8 = (128 - var6) * class31.field249[var5][var3][var4] + var6 * class31.field249[var5][var3 + 1][var4] >> 7;
         int var9 = var6 * class31.field249[var5][var3 + 1][var4 + 1] + class31.field249[var5][var3][var4 + 1] * (128 - var6) >> 7;
         return var8 * (128 - var7) + var7 * var9 >> 7;
      } else {
         return 0;
      }
   }
}
