package net.runelite.standalone;

import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class328 {
   @ObfuscatedName("l")
   static File field3968;
   @ObfuscatedName("f")
   static boolean field3970;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1806950525
   )
   public static int field3971;
   @ObfuscatedName("w")
   static Hashtable field3969;

   static {
      field3970 = false;
      field3969 = new Hashtable(16);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "656769595"
   )
   public static int method6316(int var0) {
      var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
      var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
      var0 = var0 + (var0 >>> 4) & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }
}
