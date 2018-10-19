package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
public class class122 implements class111 {
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1658087069
   )
   static int field1166;

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;IB)V",
      garbageValue = "-76"
   )
   static final void method2259(String var0, int var1) {
      class279 var2 = class95.writeClientProt(ClientProt.FRIEND_SETRANK, client.field3963.field1162);
      var2.field3018.writeByte(class164.method2819(var0) + 1);
      var2.field3018.writeString(var0);
      var2.field3018.writeByte(var1);
      client.field3963.method2235(var2);
   }

   @ObfuscatedName("ev")
   @ObfuscatedSignature(
      signature = "(Lim;Ljava/lang/String;I)V",
      garbageValue = "-119472174"
   )
   static void method2258(class108 var0, String var1) {
      class201 var2 = new class201(var0, var1);
      client.field3849.add(var2);
   }
}
