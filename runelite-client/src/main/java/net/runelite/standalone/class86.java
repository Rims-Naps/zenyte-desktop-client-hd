package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
public class class86 extends class320 {
   @ObfuscatedName("gz")
   @ObfuscatedSignature(
      signature = "[Llp;"
   )
   static SpritePixels[] field928;
   @ObfuscatedName("f")
   final boolean field929;

   public class86(boolean var1) {
      this.field929 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lkj;Lkj;B)I",
      garbageValue = "-1"
   )
   int method1630(class62 var1, class62 var2) {
      if(client.field2206 == var1.field737) {
         if(var2.field737 != client.field2206) {
            return this.field929?-1:1;
         }
      } else if(var2.field737 == client.field2206) {
         return this.field929?1:-1;
      }

      return this.method6239(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method1630((class62)var1, (class62)var2);
   }
}
