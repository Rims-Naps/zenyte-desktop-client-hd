package net.runelite.standalone;

import java.awt.Component;
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
public class class311 extends class320 {
   @ObfuscatedName("p")
   static ScheduledExecutorService field3824;
   @ObfuscatedName("f")
   final boolean field3827;

   public class311(boolean var1) {
      this.field3827 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lkj;Lkj;I)I",
      garbageValue = "948879523"
   )
   int method6088(class62 var1, class62 var2) {
      return var1.field737 != 0 && var2.field737 != 0?(this.field3827?var1.method6338().method2888(var2.method6338()):var2.method6338().method2888(var1.method6338())):this.method6239(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method6088((class62)var1, (class62)var2);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;I)V",
      garbageValue = "-1843975572"
   )
   static void method6089(Component var0) {
      var0.setFocusTraversalKeysEnabled(false);
      var0.addKeyListener(class96.field1057);
      var0.addFocusListener(class96.field1057);
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Lik;II)Z",
      garbageValue = "-69884127"
   )
   static boolean method6094(class217 var0, int var1) {
      byte[] var2 = var0.method4405(var1);
      if(var2 == null) {
         return false;
      } else {
         class253.method5080(var2);
         return true;
      }
   }
}
