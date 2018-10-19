package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hj")
public class class215 {
   @ObfuscatedName("f")
   static int[] field2072;
   @ObfuscatedName("l")
   public static int[] field2069;
   @ObfuscatedName("w")
   public static int[] field2071;

   static {
      field2072 = new int[32];
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field2072[var1] = var0 - 1;
         var0 += var0;
      }

      field2069 = new int[2000];
      field2071 = new int[2000];
   }
}
