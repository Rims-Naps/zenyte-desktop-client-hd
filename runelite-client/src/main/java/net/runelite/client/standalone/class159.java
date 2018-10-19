package net.runelite.client.standalone;

import java.nio.ByteBuffer;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
public class class159 extends class324 {
   @ObfuscatedName("f")
   ByteBuffer field1499;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)[B",
      garbageValue = "72"
   )
   byte[] vmethod5727() {
      byte[] var1 = new byte[this.field1499.capacity()];
      this.field1499.position(0);
      this.field1499.get(var1);
      return var1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "601020153"
   )
   void vmethod5728(byte[] var1) {
      this.field1499 = ByteBuffer.allocateDirect(var1.length);
      this.field1499.position(0);
      this.field1499.put(var1);
   }
}
