package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
public class class33 extends class280 {
   @ObfuscatedName("l")
   public byte[] field307;
   @ObfuscatedName("s")
   int field306;
   @ObfuscatedName("f")
   public int field310;
   @ObfuscatedName("e")
   public boolean field309;
   @ObfuscatedName("w")
   public int field308;

   class33(int var1, byte[] var2, int var3, int var4) {
      this.field310 = var1;
      this.field307 = var2;
      this.field308 = var3;
      this.field306 = var4;
   }

   class33(int var1, byte[] var2, int var3, int var4, boolean var5) {
      this.field310 = var1;
      this.field307 = var2;
      this.field308 = var3;
      this.field306 = var4;
      this.field309 = var5;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ldt;)Lcr;"
   )
   public class33 method537(class119 var1) {
      this.field307 = var1.method2153(this.field307);
      this.field310 = var1.method2155(this.field310);
      if(this.field308 == this.field306) {
         this.field308 = this.field306 = var1.method2154(this.field308);
      } else {
         this.field308 = var1.method2154(this.field308);
         this.field306 = var1.method2154(this.field306);
         if(this.field308 == this.field306) {
            --this.field308;
         }
      }

      return this;
   }
}
