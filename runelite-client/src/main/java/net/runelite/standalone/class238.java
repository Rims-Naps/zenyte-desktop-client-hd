package net.runelite.standalone;

import java.nio.ByteBuffer;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
public class class238 extends class132 {
   @ObfuscatedName("f")
   ByteBuffer field3121;

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "601020153"
   )
   void vmethod4714(byte[] var1) {
      this.field3121 = ByteBuffer.allocateDirect(var1.length);
      this.field3121.position(0);
      this.field3121.put(var1);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)[B",
      garbageValue = "72"
   )
   byte[] vmethod4715() {
      byte[] var1 = new byte[this.field3121.capacity()];
      this.field3121.position(0);
      this.field3121.get(var1);
      return var1;
   }
}
