package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hj")
public class class81 {
   @ObfuscatedName("l")
   public static int[] field896;
   @ObfuscatedName("f")
   static int[] field899;
   @ObfuscatedName("w")
   public static int[] field898;

   static {
      field899 = new int[32];
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field899[var1] = var0 - 1;
         var0 += var0;
      }

      field896 = new int[4000];
      field898 = new int[4000];
   }
}
