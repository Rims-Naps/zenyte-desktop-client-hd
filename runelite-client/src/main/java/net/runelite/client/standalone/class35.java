package net.runelite.client.standalone;

import java.awt.Component;
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
public class class35 extends class236 {
   @ObfuscatedName("p")
   static ScheduledExecutorService field271;
   @ObfuscatedName("f")
   final boolean field274;

   public class35(boolean var1) {
      this.field274 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lkj;Lkj;I)I",
      garbageValue = "948879523"
   )
   int method575(class305 var1, class305 var2) {
      return var1.field3265 != 0 && var2.field3265 != 0?(this.field274?var1.method4300().method840(var2.method4300()):var2.method4300().method840(var1.method4300())):this.method4178(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method575((class305)var1, (class305)var2);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;I)V",
      garbageValue = "-1843975572"
   )
   static void method576(Component var0) {
      var0.setFocusTraversalKeysEnabled(false);
      var0.addKeyListener(class135.field1349);
      var0.addFocusListener(class135.field1349);
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Lik;II)Z",
      garbageValue = "-69884127"
   )
   static boolean method581(class148 var0, int var1) {
      byte[] var2 = var0.method2586(var1);
      if(var2 == null) {
         return false;
      } else {
         class194.method3303(var2);
         return true;
      }
   }
}
