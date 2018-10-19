package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
public abstract class class3 extends class76 {
   @ObfuscatedName("u")
   int field26;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Ldm;"
   )
   class3 field25;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Ldn;"
   )
   class81 field28;
   @ObfuscatedName("w")
   volatile boolean field27;

   protected class3() {
      this.field27 = true;
   }

   @ObfuscatedName("m")
   protected abstract void vmethod4966(int[] var1, int var2, int var3);

   @ObfuscatedName("z")
   protected abstract void vmethod4968(int var1);

   @ObfuscatedName("r")
   protected abstract int vmethod4965();

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "()Ldm;"
   )
   protected abstract class3 vmethod4973();

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "()Ldm;"
   )
   protected abstract class3 vmethod4963();

   @ObfuscatedName("ff")
   final void method40(int[] var1, int var2, int var3) {
      if(this.field27) {
         this.vmethod4966(var1, var2, var3);
      } else {
         this.vmethod4968(var3);
      }

   }

   @ObfuscatedName("ah")
   int vmethod4414() {
      return 255;
   }
}
