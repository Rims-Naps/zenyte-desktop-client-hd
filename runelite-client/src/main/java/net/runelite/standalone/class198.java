package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
public class class198 extends class324 {
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -887733333
   )
   static int field2797;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1696504905
   )
   public final int field2795;
   @ObfuscatedName("s")
   public final int[] field2796;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -597748565
   )
   public final int field2798;
   @ObfuscatedName("w")
   public final int[] field2793;

   class198(int var1, int var2, int[] var3, int[] var4, int var5) {
      this.field2798 = var1;
      this.field2795 = var2;
      this.field2793 = var3;
      this.field2796 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "818283804"
   )
   public boolean method3940(int var1, int var2) {
      if(var2 >= 0 && var2 < this.field2796.length) {
         int var3 = this.field2796[var2];
         if(var1 >= var3 && var1 <= var3 + this.field2793[var2]) {
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
   public static class222[] method3946() {
      return new class222[]{class222.field2991, class222.field2995, class222.field2990, class222.field2993, class222.field3001, class222.field2994};
   }

   @ObfuscatedName("ip")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "2045754780"
   )
   static boolean method3941() {
      return client.field2153 || class96.field1040[81];
   }

   @ObfuscatedName("fu")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-537851765"
   )
   static void method3945() {
      class12 var0 = class150.method2761(ClientProt.field3158, client.field2384.field1770);
      var0.field121.method2288(WorldMapRegion.method4379());
      var0.field121.method2242(class167.field2010);
      var0.field121.method2242(class193.field2748);
      client.field2384.method2573(var0);
   }
}
