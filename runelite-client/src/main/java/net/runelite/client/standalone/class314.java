package net.runelite.client.standalone;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public abstract class class314 {
   @ObfuscatedName("qa")
   @ObfuscatedGetter(
      intValue = -1691496239
   )
   static int field3380;

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1713323068"
   )
   public abstract void vmethod5521();

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "639255468"
   )
   public abstract void vmethod5520(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "([BIIS)I",
      garbageValue = "-23781"
   )
   public abstract int vmethod5519(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1634520966"
   )
   public abstract boolean vmethod5527(int var1) throws IOException;

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1393494996"
   )
   public abstract int vmethod5518() throws IOException;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1692386525"
   )
   public abstract int vmethod5516() throws IOException;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([BIII)I",
      garbageValue = "-1155389508"
   )
   public static int method5540(byte[] var0, int var1, int var2) {
      int var3 = -1;

      for(int var4 = var1; var4 < var2; ++var4) {
         var3 = var3 >>> 8 ^ Buffer.field1075[(var3 ^ var0[var4]) & 255];
      }

      var3 = ~var3;
      return var3;
   }

   @ObfuscatedName("jf")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1700230837"
   )
   static final void method5541() {
      class279 var0 = class95.writeClientProt(ClientProt.CLOSE_MODAL, client.field3963.field1162);
      client.field3963.method2235(var0);

      for(class45 var1 = (class45)client.field3991.method5317(); var1 != null; var1 = (class45)client.field3991.method5313()) {
         if(var1.field348 == 0 || var1.field348 == 3) {
            class198.method3355(var1, true);
         }
      }

      if(client.field3898 != null) {
         class184.method3216(client.field3898);
         client.field3898 = null;
      }

   }
}
