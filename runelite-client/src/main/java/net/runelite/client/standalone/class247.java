package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
public class class247 extends class236 {
   @ObfuscatedName("gz")
   @ObfuscatedSignature(
      signature = "[Llp;"
   )
   static class26[] field2471;
   @ObfuscatedName("f")
   final boolean field2472;

   public class247(boolean var1) {
      this.field2472 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lkj;Lkj;B)I",
      garbageValue = "-1"
   )
   int method4482(class305 var1, class305 var2) {
      if(client.field3785 == var1.field3265) {
         if(var2.field3265 != client.field3785) {
            return this.field2472?-1:1;
         }
      } else if(var2.field3265 == client.field3785) {
         return this.field2472?1:-1;
      }

      return this.method4178(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method4482((class305)var1, (class305)var2);
   }
}
