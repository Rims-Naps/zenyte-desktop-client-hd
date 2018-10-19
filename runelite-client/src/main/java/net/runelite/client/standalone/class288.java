package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
public class class288 extends class193 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class148 field3125;
   @ObfuscatedName("dk")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class108 field3128;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   public static class124 field3127;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lga;"
   )
   class46 field3126;

   static {
      field3127 = new class124(64);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1838617375"
   )
   public String method5099(int var1, String var2) {
      class46 var4 = this.field3126;
      String var3;
      if(var4 == null) {
         var3 = var2;
      } else {
         class97 var5 = (class97)var4.method792((long)var1);
         if(var5 == null) {
            var3 = var2;
         } else {
            var3 = (String)var5.field911;
         }
      }

      return var3;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-110114517"
   )
   public int method5091(int var1, int var2) {
      return class263.method4819(this.field3126, var1, var2);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "-23696"
   )
   void method5095() {
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgm;IB)V",
      garbageValue = "-59"
   )
   void method5090(Buffer var1, int var2) {
      if(var2 == 249) {
         this.field3126 = class286.method5037(var1, this.field3126);
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "-1491263996"
   )
   void method5089(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method5090(var1, var2);
      }
   }
}
