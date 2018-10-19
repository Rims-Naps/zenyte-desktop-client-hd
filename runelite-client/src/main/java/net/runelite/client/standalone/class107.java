package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ku")
public class class107 {
   @ObfuscatedName("f")
   static char[] field993;
   @ObfuscatedName("l")
   static char[] field994;
   @ObfuscatedName("s")
   static int[] field996;
   @ObfuscatedName("w")
   static char[] field995;

   static {
      field993 = new char[64];

      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         field993[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field993[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field993[var0] = (char)(var0 + 48 - 52);
      }

      field993[62] = '+';
      field993[63] = '/';
      field994 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field994[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field994[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field994[var0] = (char)(var0 + 48 - 52);
      }

      field994[62] = '*';
      field994[63] = '-';
      field995 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field995[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field995[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field995[var0] = (char)(var0 + 48 - 52);
      }

      field995[62] = '-';
      field995[63] = '_';
      field996 = new int[128];

      for(var0 = 0; var0 < field996.length; ++var0) {
         field996[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         field996[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         field996[var0] = var0 - 97 + 26;
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         field996[var0] = var0 - 48 + 52;
      }

      int[] var2 = field996;
      field996[43] = 62;
      var2[42] = 62;
      int[] var1 = field996;
      field996[47] = 63;
      var1[45] = 63;
   }
}
