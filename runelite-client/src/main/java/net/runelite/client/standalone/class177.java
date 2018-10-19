package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class177 {
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = -571797693
   )
   static int field1688;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;Lik;I)Z",
      garbageValue = "-1388287097"
   )
   public static boolean method2970(class148 var0, class148 var1) {
      class191.field1824 = var1;
      if(!var0.method2584()) {
         return false;
      } else {
         class191.field1816 = var0.method2616(35);
         class191.field1833 = new class191[class191.field1816];

         for(int var2 = 0; var2 < class191.field1816; ++var2) {
            byte[] var3 = var0.method2579(35, var2, -202715873);
            class191.field1833[var2] = new class191(var2);
            if(var3 != null) {
               class191.field1833[var2].method3263(new Buffer(var3));
               class191.field1833[var2].method3265();
            }
         }

         return true;
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "([BB)[B",
      garbageValue = "105"
   )
   static final byte[] method2968(byte[] var0) {
      Buffer var1 = new Buffer(var0);
      int var2 = var1.readUnsignedByte();
      int var3 = var1.readInt();
      if(var3 < 0 || class148.field1425 != 0 && var3 > class148.field1425) {
         throw new RuntimeException();
      } else if(var2 == 0) {
         byte[] var4 = new byte[var3];
         var1.readBytes(var4, 0, var3);
         return var4;
      } else {
         int var6 = var1.readInt();
         if(var6 >= 0 && (class148.field1425 == 0 || var6 <= class148.field1425)) {
            byte[] var5 = new byte[var6];
            if(var2 == 1) {
               class228.method4087(var5, var6, var0, var3, 9);
            } else {
               class148.field1408.method861(var1, var5);
            }

            return var5;
         } else {
            throw new RuntimeException();
         }
      }
   }
}
