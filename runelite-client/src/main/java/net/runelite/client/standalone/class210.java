package net.runelite.client.standalone;

import net.runelite.api.MessageNode;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSChatLineBuffer;

@ObfuscatedName("co")
public class class210 implements RSChatLineBuffer {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "[Lbm;"
   )
   class286[] field2042;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1456511617
   )
   int field2039;

   class210() {
      this.field2042 = new class286[100];
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbm;",
      garbageValue = "1653176749"
   )
   class286 method3704(int var1, String var2, String var3, String var4) {
      class286 var5 = this.field2042[99];

      for(int var6 = this.field2039; var6 > 0; --var6) {
         if(var6 != 100) {
            this.field2042[var6] = this.field2042[var6 - 1];
         }
      }

      if(var5 == null) {
         var5 = new class286(var1, var2, var4, var3);
      } else {
         var5.method1186();
         var5.method3298();
         var5.method5038(var1, var2, var4, var3);
      }

      this.field2042[0] = var5;
      if(this.field2039 < 100) {
         ++this.field2039;
      }

      return var5;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IS)Lbm;",
      garbageValue = "25107"
   )
   class286 method3700(int var1) {
      return var1 >= 0 && var1 < this.field2039?this.field2042[var1]:null;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1965511976"
   )
   int method3703() {
      return this.field2039;
   }

   public MessageNode[] getLines() {
      return this.field2042;
   }

   public int getLength() {
      return this.field2039;
   }
}
