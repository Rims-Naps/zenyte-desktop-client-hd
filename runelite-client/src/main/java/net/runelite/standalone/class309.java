package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
public abstract class class309 extends class197 {
   @ObfuscatedName("u")
   int field3814;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Ldm;"
   )
   class309 field3813;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Ldn;"
   )
   class280 field3816;
   @ObfuscatedName("w")
   volatile boolean field3815;

   protected class309() {
      this.field3815 = true;
   }

   @ObfuscatedName("z")
   protected abstract void vmethod6061(int var1);

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "()Ldm;"
   )
   protected abstract class309 vmethod6059();

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "()Ldm;"
   )
   protected abstract class309 vmethod6056();

   @ObfuscatedName("r")
   protected abstract int vmethod6057();

   @ObfuscatedName("m")
   protected abstract void vmethod6060(int[] var1, int var2, int var3);

   @ObfuscatedName("ff")
   final void method6064(int[] var1, int var2, int var3) {
      if(this.field3815) {
         this.vmethod6060(var1, var2, var3);
      } else {
         this.vmethod6061(var3);
      }

   }

   @ObfuscatedName("ah")
   int vmethod6079() {
      return 255;
   }
}
