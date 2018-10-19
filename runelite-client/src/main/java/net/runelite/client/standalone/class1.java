package net.runelite.client.standalone;

import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class1 {
   @ObfuscatedName("f")
   static boolean field8;
   @ObfuscatedName("l")
   static File field6;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1806950525
   )
   public static int field9;
   @ObfuscatedName("w")
   static Hashtable field7;

   static {
      field8 = false;
      field7 = new Hashtable(16);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "656769595"
   )
   public static int method14(int var0) {
      var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
      var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
      var0 = var0 + (var0 >>> 4) & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }
}
