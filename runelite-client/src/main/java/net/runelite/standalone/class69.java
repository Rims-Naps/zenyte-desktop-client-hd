package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ku")
public class class69 {
   @ObfuscatedName("l")
   static char[] field805;
   @ObfuscatedName("s")
   static int[] field807;
   @ObfuscatedName("f")
   static char[] field804;
   @ObfuscatedName("w")
   static char[] field806;

   static {
      field804 = new char[64];

      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         field804[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field804[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field804[var0] = (char)(var0 + 48 - 52);
      }

      field804[62] = '+';
      field804[63] = '/';
      field805 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field805[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field805[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field805[var0] = (char)(var0 + 48 - 52);
      }

      field805[62] = '*';
      field805[63] = '-';
      field806 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field806[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field806[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field806[var0] = (char)(var0 + 48 - 52);
      }

      field806[62] = '-';
      field806[63] = '_';
      field807 = new int[128];

      for(var0 = 0; var0 < field807.length; ++var0) {
         field807[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         field807[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         field807[var0] = var0 - 97 + 26;
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         field807[var0] = var0 - 48 + 52;
      }

      int[] var2 = field807;
      field807[43] = 62;
      var2[42] = 62;
      int[] var1 = field807;
      field807[47] = 63;
      var1[45] = 63;
   }
}
