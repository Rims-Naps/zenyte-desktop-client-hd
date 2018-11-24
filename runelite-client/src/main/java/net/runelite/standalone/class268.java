package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("id")
public class class268 {
   @ObfuscatedName("l")
   public static final boolean[] field3463;
   @ObfuscatedName("a")
   protected static boolean field3462;
   @ObfuscatedName("w")
   public static int[] field3461;

   static {
      field3463 = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
      field3461 = new int[99];
      int var0 = 0;

      for(int var1 = 0; var1 < 99; ++var1) {
         int var2 = var1 + 1;
         int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
         var0 += var3;
         field3461[var1] = var0 / 4;
      }

   }
}
