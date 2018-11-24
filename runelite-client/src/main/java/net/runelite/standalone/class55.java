package net.runelite.standalone;

import net.runelite.api.MessageNode;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSChatLineBuffer;

@ObfuscatedName("co")
public class class55 implements RSChatLineBuffer {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "[Lbm;"
   )
   class227[] field703;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1456511617
   )
   int field700;

   class55() {
      this.field703 = new class227[100];
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IS)Lbm;",
      garbageValue = "25107"
   )
   class227 method1227(int var1) {
      return var1 >= 0 && var1 < this.field700?this.field703[var1]:null;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbm;",
      garbageValue = "1653176749"
   )
   class227 method1231(int var1, String var2, String var3, String var4) {
      class227 var5 = this.field703[99];

      for(int var6 = this.field700; var6 > 0; --var6) {
         if(var6 != 100) {
            this.field703[var6] = this.field703[var6 - 1];
         }
      }

      if(var5 == null) {
         var5 = new class227(var1, var2, var4, var3);
      } else {
         var5.method3937();
         var5.method6268();
         var5.method4571(var1, var2, var4, var3);
      }

      this.field703[0] = var5;
      if(this.field700 < 100) {
         ++this.field700;
      }

      return var5;
   }

   public MessageNode[] getLines() {
      return this.field703;
   }

   public int getLength() {
      return this.field700;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1965511976"
   )
   int method1230() {
      return this.field700;
   }
}
