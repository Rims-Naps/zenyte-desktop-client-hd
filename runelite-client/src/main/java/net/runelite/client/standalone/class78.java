package net.runelite.client.standalone;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
public class class78 {
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -985001373
   )
   public static int field720;
   @ObfuscatedName("gm")
   static int[] field721;
   @ObfuscatedName("di")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class108 field717;

   @ObfuscatedName("gt")
   @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "-47"
   )
   static final void method1193(boolean var0) {
      class31.method519();
      ++client.field3963.field1154;
      if(client.field3963.field1154 >= 50 || var0) {
         client.field3963.field1154 = 0;
         if(!client.field4000 && client.field3963.method2248() != null) {
            class279 var1 = class95.writeClientProt(ClientProt.NO_TIME_OUT, client.field3963.field1162);
            client.field3963.method2235(var1);

            try {
               client.field3963.method2253();
            } catch (IOException var3) {
               client.field4000 = true;
            }
         }

      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1802767349"
   )
   public static void method1192() {
      class183.field1767.method2271();
   }

   @ObfuscatedName("jj")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "841118834"
   )
   static final void method1191(String var0) {
      if(!var0.equals("")) {
         class279 var1 = class95.writeClientProt(ClientProt.JOIN_CLAN_CHAT, client.field3963.field1162);
         var1.field3018.writeByte(class164.method2819(var0));
         var1.field3018.writeString(var0);
         client.field3963.method2235(var1);
      }
   }
}
