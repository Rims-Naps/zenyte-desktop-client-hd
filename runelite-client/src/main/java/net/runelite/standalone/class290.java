package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public class class290 extends class320 {
   @ObfuscatedName("f")
   final boolean field3650;

   public class290(boolean var1) {
      this.field3650 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lkj;Lkj;I)I",
      garbageValue = "-1105902737"
   )
   int method5700(class62 var1, class62 var2) {
      return var2.field737 != var1.field737?(this.field3650?var1.field737 - var2.field737:var2.field737 - var1.field737):this.method6239(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method5700((class62)var1, (class62)var2);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-32841725"
   )
   static final void method5706(String var0) {
      WorldMapData.method2707("Please remove " + var0 + " from your ignore list first");
   }
}
