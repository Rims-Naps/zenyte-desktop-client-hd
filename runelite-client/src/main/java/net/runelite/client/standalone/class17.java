package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
public class class17 extends class236 {
   @ObfuscatedName("f")
   final boolean field141;

   public class17(boolean var1) {
      this.field141 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lkj;Lkj;B)I",
      garbageValue = "-38"
   )
   int method187(class305 var1, class305 var2) {
      return client.field3785 == var1.field3265 && var2.field3265 == client.field3785?(this.field141?var1.field3262 - var2.field3262:var2.field3262 - var1.field3262):this.method4178(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method187((class305)var1, (class305)var2);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "165555937"
   )
   public static boolean method194(int var0) {
      return (var0 >> 20 & 1) != 0;
   }
}
