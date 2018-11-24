package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
public class class271 extends class320 {
   @ObfuscatedName("f")
   final boolean field3483;

   public class271(boolean var1) {
      this.field3483 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lkj;Lkj;B)I",
      garbageValue = "-38"
   )
   int method5335(class62 var1, class62 var2) {
      return client.field2206 == var1.field737 && var2.field737 == client.field2206?(this.field3483?var1.field734 - var2.field734:var2.field734 - var1.field734):this.method6239(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method5335((class62)var1, (class62)var2);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "165555937"
   )
   public static boolean method5342(int var0) {
      return (var0 >> 20 & 1) != 0;
   }
}
