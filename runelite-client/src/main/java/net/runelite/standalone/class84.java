package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class84 {
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = -571797693
   )
   static int field909;

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "([BB)[B",
      garbageValue = "105"
   )
   static final byte[] method1618(byte[] var0) {
      Buffer var1 = new Buffer(var0);
      int var2 = var1.readUnsignedByte();
      int var3 = var1.readInt();
      if(var3 < 0 || class217.field2969 != 0 && var3 > class217.field2969) {
         throw new RuntimeException();
      } else if(var2 == 0) {
         byte[] var4 = new byte[var3];
         var1.method2295(var4, 0, var3);
         return var4;
      } else {
         int var6 = var1.readInt();
         if(var6 >= 0 && (class217.field2969 == 0 || var6 <= class217.field2969)) {
            byte[] var5 = new byte[var6];
            if(var2 == 1) {
               class257.method5140(var5, var6, var0, var3, 9);
            } else {
               class217.field2952.method5332(var1, var5);
            }

            return var5;
         } else {
            throw new RuntimeException();
         }
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;Lik;I)Z",
      garbageValue = "-1388287097"
   )
   public static boolean method1620(class217 var0, class217 var1) {
      class123.field1671 = var1;
      if(!var0.method4403()) {
         return false;
      } else {
         class123.field1663 = var0.method4435(35);
         class123.field1680 = new class123[class123.field1663];

         for(int var2 = 0; var2 < class123.field1663; ++var2) {
            byte[] var3 = var0.method4398(35, var2, -202715873);
            class123.field1680[var2] = new class123(var2);
            if(var3 != null) {
               class123.field1680[var2].method2199(new Buffer(var3));
               class123.field1680[var2].method2201();
            }
         }

         return true;
      }
   }
}
