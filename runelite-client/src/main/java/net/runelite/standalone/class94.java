package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
public class class94 {
   @ObfuscatedName("sk")
   @ObfuscatedGetter(
      intValue = 512714597
   )
   static int field1020;
   @ObfuscatedName("ds")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class6 field1014;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lio;"
   )
   static final class94 field1015;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lio;"
   )
   static final class94 field1016;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lio;"
   )
   static final class94 field1019;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lio;"
   )
   static final class94 field1013;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1351695829
   )
   final int field1018;
   @ObfuscatedName("e")
   public final String field1017;

   static {
      field1019 = new class94("LIVE", 0);
      field1015 = new class94("BUILDLIVE", 3);
      field1013 = new class94("RC", 1);
      field1016 = new class94("WIP", 2);
   }

   class94(String var1, int var2) {
      this.field1017 = var1;
      this.field1018 = var2;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IB)Lkr;",
      garbageValue = "0"
   )
   public static class22 method1735(int var0) {
      class22[] var1 = class151.method2765();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class22 var3 = var1[var2];
         if(var0 == var3.field243) {
            return var3;
         }
      }

      return null;
   }
}
