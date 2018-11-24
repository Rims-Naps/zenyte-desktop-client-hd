package net.runelite.standalone;

import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class133 extends class36 {
   @ObfuscatedName("ey")
   @ObfuscatedSignature(
      signature = "Lkw;"
   )
   static class78 field1739;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Len;"
   )
   class282 field1737;
   @ObfuscatedName("f")
   Socket field1738;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lfe;"
   )
   class318 field1736;

   class133(Socket var1, int var2, int var3) throws IOException {
      this.field1738 = var1;
      this.field1738.setSoTimeout(30000);
      this.field1738.setTcpNoDelay(true);
      this.field1738.setReceiveBufferSize(65536);
      this.field1738.setSendBufferSize(65536);
      this.field1737 = new class282(this.field1738.getInputStream(), var2);
      this.field1736 = new class318(this.field1738.getOutputStream(), var3);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1713323068"
   )
   public void vmethod2787() {
      this.field1736.method6220();

      try {
         this.field1738.close();
      } catch (IOException var2) {
         ;
      }

      this.field1737.method5428();
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "639255468"
   )
   public void vmethod2791(byte[] var1, int var2, int var3) throws IOException {
      this.field1736.method6233(var1, var2, var3);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1634520966"
   )
   public boolean vmethod2817(int var1) throws IOException {
      return this.field1737.method5420(var1);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1393494996"
   )
   public int vmethod2793() throws IOException {
      return this.field1737.method5418();
   }

   protected void finalize() {
      this.vmethod2787();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "([BIIS)I",
      garbageValue = "-23781"
   )
   public int vmethod2803(byte[] var1, int var2, int var3) throws IOException {
      return this.field1737.method5419(var1, var2, var3);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1692386525"
   )
   public int vmethod2789() throws IOException {
      return this.field1737.method5438();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)Lif;",
      garbageValue = "1365269897"
   )
   public static class123 method2550(int var0) {
      return var0 >= 0 && var0 < class123.field1680.length && class123.field1680[var0] != null?class123.field1680[var0]:new class123(var0);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)[B",
      garbageValue = "246175447"
   )
   static synchronized byte[] method2559(int var0) {
      return class122.method2195(var0, false);
   }
}
