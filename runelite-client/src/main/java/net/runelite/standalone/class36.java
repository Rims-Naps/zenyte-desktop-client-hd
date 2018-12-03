package net.runelite.standalone;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public abstract class class36 {
   @ObfuscatedName("qa")
   @ObfuscatedGetter(
      intValue = -1691496239
   )
   static int field362;

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1713323068"
   )
   public abstract void vmethod2787();

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "639255468"
   )
   public abstract void vmethod2791(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1634520966"
   )
   public abstract boolean vmethod2817(int var1) throws IOException;

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1393494996"
   )
   public abstract int vmethod2793() throws IOException;

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "([BIIS)I",
      garbageValue = "-23781"
   )
   public abstract int vmethod2803(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1692386525"
   )
   public abstract int vmethod2789() throws IOException;

   @ObfuscatedName("jf")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1700230837"
   )
   static final void method654() {
      class12 var0 = class150.method2761(ClientProt.field3176, client.field2384.field1770);
      client.field2384.method2573(var0);

      for(class322 var1 = (class322)client.field2412.method1783(); var1 != null; var1 = (class322)client.field2412.method1779()) {
         if(var1.field3934 == 0 || var1.field3934 == 3) {
            class30.method523(var1, true);
         }
      }

      if(client.field2319 != null) {
         class230.method4617(client.field2319);
         client.field2319 = null;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([BIII)I",
      garbageValue = "-1155389508"
   )
   public static int method653(byte[] var0, int var1, int var2) {
      int var3 = -1;

      for(int var4 = var1; var4 < var2; ++var4) {
         var3 = var3 >>> 8 ^ Buffer.field1695[(var3 ^ var0[var4]) & 255];
      }

      var3 = ~var3;
      return var3;
   }
}
