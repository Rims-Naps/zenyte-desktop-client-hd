package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
public class class203 extends class320 {
   @ObfuscatedName("dp")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class6 field2849;
   @ObfuscatedName("f")
   final boolean field2846;

   public class203(boolean var1) {
      this.field2846 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lkj;Lkj;I)I",
      garbageValue = "-815741772"
   )
   int method4020(class62 var1, class62 var2) {
      return var1.field737 != 0 && var2.field737 != 0?(this.field2846?var1.field734 - var2.field734:var2.field734 - var1.field734):this.method6239(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method4020((class62)var1, (class62)var2);
   }

   @ObfuscatedName("jh")
   @ObfuscatedSignature(
      signature = "(Lhw;I)I",
      garbageValue = "-1919214033"
   )
   static int method4026(class187 var0) {
      class228 var1 = (class228)client.field2355.method1776((long)var0.field2620 + ((long)var0.field2621 << 32));
      return var1 != null?var1.field3057:var0.field2631;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-1030428132"
   )
   static int method4025(int var0) {
      return (int)((Math.log((double)var0) / class249.field3321 - 7.0D) * 256.0D);
   }
}
