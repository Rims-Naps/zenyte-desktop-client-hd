package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("id")
public class class137 {
   @ObfuscatedName("l")
   public static final boolean[] field1363;
   @ObfuscatedName("a")
   protected static boolean field1362;
   @ObfuscatedName("w")
   public static int[] field1361;

   static {
      field1363 = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
      field1361 = new int[99];
      int var0 = 0;

      for(int var1 = 0; var1 < 99; ++var1) {
         int var2 = var1 + 1;
         int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
         var0 += var3;
         field1361[var1] = var0 / 4;
      }

   }
}
