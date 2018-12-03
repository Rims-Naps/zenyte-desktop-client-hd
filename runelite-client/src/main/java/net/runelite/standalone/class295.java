package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
public class class295 implements class288 {
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1658087069
   )
   static int field3684;

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;IB)V",
      garbageValue = "-76"
   )
   static final void method5781(String var0, int var1) {
      class12 var2 = class150.method2761(ClientProt.field3193, client.field2384.field1770);
      var2.field121.method2288(class118.method2136(var0) + 1);
      var2.field121.writeString(var0);
      var2.field121.method2288(var1);
      client.field2384.method2573(var2);
   }

   @ObfuscatedName("ev")
   @ObfuscatedSignature(
      signature = "(Lim;Ljava/lang/String;I)V",
      garbageValue = "-119472174"
   )
   static void method5780(class6 var0, String var1) {
      class135 var2 = new class135(var0, var1);
      client.field2270.add(var2);
   }
}
