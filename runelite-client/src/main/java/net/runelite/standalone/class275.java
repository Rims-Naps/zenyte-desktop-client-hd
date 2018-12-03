package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class275 implements class273 {
   @ObfuscatedName("gk")
   @ObfuscatedSignature(
      signature = "[Lle;"
   )
   static class303[] field3501;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lfn;"
   )
   static final class275 field3500;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lfn;"
   )
   public static final class275 field3497;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lfn;"
   )
   public static final class275 field3502;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "[Lfn;"
   )
   static final class275[] field3499;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lfn;"
   )
   public static final class275 field3496;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -830013223
   )
   public final int field3498;

   static {
      field3502 = new class275(14, 0);
      field3500 = new class275(15, 4);
      field3496 = new class275(16, -2);
      field3497 = new class275(18, -2);
      field3499 = new class275[32];
      class275[] var0 = new class275[]{field3497, field3502, field3496, field3500};
      class275[] var1 = var0;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         field3499[var1[var2].field3498] = var1[var2];
      }

   }

   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "0"
   )
   class275(int var1, int var2) {
      this.field3498 = var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "71"
   )
   public static boolean method5369(int var0) {
      return var0 >= class264.field3412.field3433 && var0 <= class264.field3422.field3433 || var0 == class264.field3432.field3433;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IB)Ljf;",
      garbageValue = "1"
   )
   public static class20 method5368(int var0) {
      class20 var1 = (class20)class20.field230.method1813((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class20.field228.method4398(34, var0, -1700331856);
         var1 = new class20();
         if(var2 != null) {
            var1.method404(new Buffer(var2));
         }

         var1.method410();
         class20.field230.method1820(var1, (long)var0);
         return var1;
      }
   }
}
