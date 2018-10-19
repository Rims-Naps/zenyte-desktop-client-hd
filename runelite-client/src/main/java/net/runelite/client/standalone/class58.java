package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
public class class58 extends class81 {
   @ObfuscatedName("f")
   public int field461;
   @ObfuscatedName("e")
   public boolean field460;
   @ObfuscatedName("l")
   public byte[] field458;
   @ObfuscatedName("s")
   int field457;
   @ObfuscatedName("w")
   public int field459;

   class58(int var1, byte[] var2, int var3, int var4) {
      this.field461 = var1;
      this.field458 = var2;
      this.field459 = var3;
      this.field457 = var4;
   }

   class58(int var1, byte[] var2, int var3, int var4, boolean var5) {
      this.field461 = var1;
      this.field458 = var2;
      this.field459 = var3;
      this.field457 = var4;
      this.field460 = var5;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ldt;)Lcr;"
   )
   public class58 method1020(class157 var1) {
      this.field458 = var1.method2743(this.field458);
      this.field461 = var1.method2745(this.field461);
      if(this.field459 == this.field457) {
         this.field459 = this.field457 = var1.method2744(this.field459);
      } else {
         this.field459 = var1.method2744(this.field459);
         this.field457 = var1.method2744(this.field457);
         if(this.field459 == this.field457) {
            --this.field459;
         }
      }

      return this;
   }
}
