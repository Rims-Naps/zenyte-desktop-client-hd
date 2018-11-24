package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
public class class20 extends class324 {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   public static class100 field230;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class217 field228;
   @ObfuscatedName("dk")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class6 field231;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lga;"
   )
   class235 field229;

   static {
      field230 = new class100(64);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1838617375"
   )
   public String method414(int var1, String var2) {
      class235 var4 = this.field229;
      String var3;
      if(var4 == null) {
         var3 = var2;
      } else {
         class196 var5 = (class196)var4.method4670((long)var1);
         if(var5 == null) {
            var3 = var2;
         } else {
            var3 = (String)var5.field2789;
         }
      }

      return var3;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "-23696"
   )
   void method410() {
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgm;IB)V",
      garbageValue = "-59"
   )
   void method405(class125 var1, int var2) {
      if(var2 == 249) {
         this.field229 = class227.method4570(var1, this.field229);
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-110114517"
   )
   public int method406(int var1, int var2) {
      return class177.method3681(this.field229, var1, var2);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "-1491263996"
   )
   void method404(class125 var1) {
      while(true) {
         int var2 = var1.method2256();
         if(var2 == 0) {
            return;
         }

         this.method405(var1, var2);
      }
   }
}
