package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public class class313 {
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-1559194507"
   )
   static final boolean method6139(int var0, int var1) {
      class15 var2 = class285.method5484(var0);
      if(var1 == 11) {
         var1 = 10;
      }

      if(var1 >= 5 && var1 <= 8) {
         var1 = 4;
      }

      return var2.method351(var1);
   }

   @ObfuscatedName("fe")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "1"
   )
   static final void method6136(String var0) {
      if(var0.equalsIgnoreCase("toggleroof")) {
         class175.field2134.field854 = !class175.field2134.field854;
         class236.method4709();
         if(class175.field2134.field854) {
            ServerProt.method3131(99, "", "Roofs are now all hidden");
         } else {
            ServerProt.method3131(99, "", "Roofs will only be removed selectively");
         }
      }

      if(var0.equalsIgnoreCase("displayfps")) {
         client.field2171 = !client.field2171;
      }

      if(var0.equalsIgnoreCase("renderself")) {
         client.field2272 = !client.field2272;
      }

      if(var0.equalsIgnoreCase("mouseovertext")) {
         client.field2301 = !client.field2301;
      }

      if(client.field2263 >= 2) {
         if(var0.equalsIgnoreCase("showcoord")) {
            class199.field2812.field3638 = !class199.field2812.field3638;
         }

         if(var0.equalsIgnoreCase("fpson")) {
            client.field2171 = true;
         }

         if(var0.equalsIgnoreCase("fpsoff")) {
            client.field2171 = false;
         }

         if(var0.equalsIgnoreCase("gc")) {
            System.gc();
         }

         if(var0.equalsIgnoreCase("clientdrop")) {
            class241.method4744();
         }
      }

      class12 var1 = class150.method2761(ClientProt.field3216, client.field2384.field1770);
      var1.field121.method2288(var0.length() + 1);
      var1.field121.writeString(var0);
      client.field2384.method2573(var1);
   }
}
