package net.runelite.client.standalone;

import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
public class class118 implements Callable {
   @ObfuscatedName("o")
   static int[] field1089;
   @ObfuscatedName("fe")
   @ObfuscatedSignature(
      signature = "Les;"
   )
   static class146 field1081;
   @ObfuscatedName("ec")
   @ObfuscatedGetter(
      intValue = 1959852303
   )
   static int field1082;

   public Object call() {
      return class168.method2865();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([BIIB)Ljava/lang/String;",
      garbageValue = "127"
   )
   public static String method2128(byte[] var0, int var1, int var2) {
      StringBuilder var3 = new StringBuilder();

      for(int var4 = var1; var4 < var2 + var1; var4 += 3) {
         int var5 = var0[var4] & 255;
         var3.append(class107.field993[var5 >>> 2]);
         if(var4 < var2 - 1) {
            int var6 = var0[var4 + 1] & 255;
            var3.append(class107.field993[(var5 & 3) << 4 | var6 >>> 4]);
            if(var4 < var2 - 2) {
               int var7 = var0[var4 + 2] & 255;
               var3.append(class107.field993[(var6 & 15) << 2 | var7 >>> 6]).append(class107.field993[var7 & 63]);
            } else {
               var3.append(class107.field993[(var6 & 15) << 2]).append("=");
            }
         } else {
            var3.append(class107.field993[(var5 & 3) << 4]).append("==");
         }
      }

      return var3.toString();
   }
}
