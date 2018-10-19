package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class260 implements class249 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lfn;"
   )
   public static final class260 field2882;
   @ObfuscatedName("gk")
   @ObfuscatedSignature(
      signature = "[Lle;"
   )
   static class32[] field2881;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lfn;"
   )
   static final class260 field2880;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lfn;"
   )
   public static final class260 field2877;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "[Lfn;"
   )
   static final class260[] field2879;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lfn;"
   )
   public static final class260 field2876;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -830013223
   )
   public final int field2878;

   static {
      field2882 = new class260(14, 0);
      field2880 = new class260(15, 4);
      field2876 = new class260(16, -2);
      field2877 = new class260(18, -2);
      field2879 = new class260[32];
      class260[] var0 = new class260[]{field2877, field2882, field2876, field2880};
      class260[] var1 = var0;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         field2879[var1[var2].field2878] = var1[var2];
      }

   }

   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "0"
   )
   class260(int var1, int var2) {
      this.field2878 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IB)Ljf;",
      garbageValue = "1"
   )
   public static class288 method4665(int var0) {
      class288 var1 = (class288)class288.field3127.method2268((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class288.field3125.method2579(34, var0, -1700331856);
         var1 = new class288();
         if(var2 != null) {
            var1.method5089(new Buffer(var2));
         }

         var1.method5095();
         class288.field3127.method2275(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "71"
   )
   public static boolean method4666(int var0) {
      return var0 >= class331.field3700.field3721 && var0 <= class331.field3710.field3721 || var0 == class331.field3720.field3721;
   }
}
