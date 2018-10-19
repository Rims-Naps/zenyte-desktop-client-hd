package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
public class class138 {
   @ObfuscatedName("sk")
   @ObfuscatedGetter(
      intValue = 512714597
   )
   static int field1371;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lio;"
   )
   static final class138 field1370;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lio;"
   )
   static final class138 field1366;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lio;"
   )
   static final class138 field1367;
   @ObfuscatedName("ds")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class108 field1365;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lio;"
   )
   static final class138 field1364;
   @ObfuscatedName("e")
   public final String field1368;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1351695829
   )
   final int field1369;

   static {
      field1370 = new class138("LIVE", 0);
      field1366 = new class138("BUILDLIVE", 3);
      field1364 = new class138("RC", 1);
      field1367 = new class138("WIP", 2);
   }

   class138(String var1, int var2) {
      this.field1368 = var1;
      this.field1369 = var2;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IB)Lkr;",
      garbageValue = "0"
   )
   public static class114 method2516(int var0) {
      class114[] var1 = class129.method2386();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class114 var3 = var1[var2];
         if(var0 == var3.field1069) {
            return var3;
         }
      }

      return null;
   }
}
