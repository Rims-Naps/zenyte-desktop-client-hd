package net.runelite.client.standalone;

import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class59 extends class314 {
   @ObfuscatedName("ey")
   @ObfuscatedSignature(
      signature = "Lkw;"
   )
   static class255 field465;
   @ObfuscatedName("f")
   Socket field464;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Len;"
   )
   class216 field463;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lfe;"
   )
   class239 field462;

   class59(Socket var1, int var2, int var3) throws IOException {
      this.field464 = var1;
      this.field464.setSoTimeout(30000);
      this.field464.setTcpNoDelay(true);
      this.field464.setReceiveBufferSize(65536);
      this.field464.setSendBufferSize(65536);
      this.field463 = new class216(this.field464.getInputStream(), var2);
      this.field462 = new class239(this.field464.getOutputStream(), var3);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1713323068"
   )
   public void vmethod5521() {
      this.field462.method4211();

      try {
         this.field464.close();
      } catch (IOException var2) {
         ;
      }

      this.field463.method3807();
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "639255468"
   )
   public void vmethod5520(byte[] var1, int var2, int var3) throws IOException {
      this.field462.method4224(var1, var2, var3);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "([BIIS)I",
      garbageValue = "-23781"
   )
   public int vmethod5519(byte[] var1, int var2, int var3) throws IOException {
      return this.field463.method3798(var1, var2, var3);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1634520966"
   )
   public boolean vmethod5527(int var1) throws IOException {
      return this.field463.method3799(var1);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1393494996"
   )
   public int vmethod5518() throws IOException {
      return this.field463.method3797();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1692386525"
   )
   public int vmethod5516() throws IOException {
      return this.field463.method3817();
   }

   protected void finalize() {
      this.vmethod5521();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)Lif;",
      garbageValue = "1365269897"
   )
   public static class191 method1036(int var0) {
      return var0 >= 0 && var0 < class191.field1833.length && class191.field1833[var0] != null?class191.field1833[var0]:new class191(var0);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)[B",
      garbageValue = "246175447"
   )
   static synchronized byte[] method1045(int var0) {
      return class232.method4160(var0, false);
   }
}
