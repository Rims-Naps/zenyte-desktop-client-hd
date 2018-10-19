package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
public class class123 extends class193 {
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -887733333
   )
   static int field1173;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -597748565
   )
   public final int field1174;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1696504905
   )
   public final int field1171;
   @ObfuscatedName("s")
   public final int[] field1172;
   @ObfuscatedName("w")
   public final int[] field1169;

   class123(int var1, int var2, int[] var3, int[] var4, int var5) {
      this.field1174 = var1;
      this.field1171 = var2;
      this.field1169 = var3;
      this.field1172 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "818283804"
   )
   public boolean method2260(int var1, int var2) {
      if(var2 >= 0 && var2 < this.field1172.length) {
         int var3 = this.field1172[var2];
         if(var1 >= var3 && var1 <= var3 + this.field1169[var2]) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)[Lis;",
      garbageValue = "997543006"
   )
   public static class253[] method2266() {
      return new class253[]{class253.field2505, class253.field2509, class253.field2504, class253.field2507, class253.field2515, class253.field2508};
   }

   @ObfuscatedName("ip")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "2045754780"
   )
   static boolean method2261() {
      return client.field3732 || class135.field1332[81];
   }

   @ObfuscatedName("fu")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1917903280"
   )
   static void method2265() {
      class279 var0 = class95.writeClientProt(ClientProt.WINDOW_STATUS, client.field3963.field1162);
      var0.field3018.writeByte(class319.method5597());
      var0.field3018.writeShort(class47.field359);
      var0.field3018.writeShort(class330.field3689);
      client.field3963.method2235(var0);
   }
}
