package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public class class13 extends class236 {
   @ObfuscatedName("f")
   final boolean field118;

   public class13(boolean var1) {
      this.field118 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lkj;Lkj;I)I",
      garbageValue = "-1105902737"
   )
   int method139(class305 var1, class305 var2) {
      return var2.field3265 != var1.field3265?(this.field118?var1.field3265 - var2.field3265:var2.field3265 - var1.field3265):this.method4178(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method139((class305)var1, (class305)var2);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-32841725"
   )
   static final void method145(String var0) {
      class87.method1275("Please remove " + var0 + " from your ignore list first");
   }
}
