package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
public class class104 extends class236 {
   @ObfuscatedName("dp")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class108 field971;
   @ObfuscatedName("f")
   final boolean field968;

   public class104(boolean var1) {
      this.field968 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lkj;Lkj;I)I",
      garbageValue = "-815741772"
   )
   int method1765(class305 var1, class305 var2) {
      return var1.field3265 != 0 && var2.field3265 != 0?(this.field968?var1.field3262 - var2.field3262:var2.field3262 - var1.field3262):this.method4178(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method1765((class305)var1, (class305)var2);
   }

   @ObfuscatedName("jh")
   @ObfuscatedSignature(
      signature = "(Lhw;I)I",
      garbageValue = "-1919214033"
   )
   static int method1771(class329 var0) {
      class262 var1 = (class262)client.field3934.method5310((long)var0.field3606 + ((long)var0.field3607 << 32));
      return var1 != null?var1.field2904:var0.field3617;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-1030428132"
   )
   static int method1770(int var0) {
      return (int)((Math.log((double)var0) / class55.field416 - 7.0D) * 256.0D);
   }
}
