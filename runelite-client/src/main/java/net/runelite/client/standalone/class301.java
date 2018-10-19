package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public class class301 {
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-1559194507"
   )
   static final boolean method5202(int var0, int var1) {
      class172 var2 = class152.method2696(var0);
      if(var1 == 11) {
         var1 = 10;
      }

      if(var1 >= 5 && var1 <= 8) {
         var1 = 4;
      }

      return var2.method2924(var1);
   }

   @ObfuscatedName("fe")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "1"
   )
   static final void method5199(String var0) {
      if(var0.equalsIgnoreCase("toggleroof")) {
         class153.field1455.field1856 = !class153.field1455.field1856;
         class57.method1015();
         if(class153.field1455.field1856) {
            ServerProt.method4172(99, "", "Roofs are now all hidden");
         } else {
            ServerProt.method4172(99, "", "Roofs will only be removed selectively");
         }
      }

      if(var0.equalsIgnoreCase("displayfps")) {
         client.field3750 = !client.field3750;
      }

      if(var0.equalsIgnoreCase("renderself")) {
         client.field3851 = !client.field3851;
      }

      if(var0.equalsIgnoreCase("mouseovertext")) {
         client.field3880 = !client.field3880;
      }

      if(client.field3842 >= 2) {
         if(var0.equalsIgnoreCase("showcoord")) {
            class63.field587.field856 = !class63.field587.field856;
         }

         if(var0.equalsIgnoreCase("fpson")) {
            client.field3750 = true;
         }

         if(var0.equalsIgnoreCase("fpsoff")) {
            client.field3750 = false;
         }

         if(var0.equalsIgnoreCase("gc")) {
            System.gc();
         }

         if(var0.equalsIgnoreCase("clientdrop")) {
            class223.method3995();
         }
      }

      class279 var1 = class95.writeClientProt(ClientProt.COMMAND, client.field3963.field1162);
      var1.field3018.writeByte(var0.length() + 1);
      var1.field3018.writeString(var0);
      client.field3963.method2235(var1);
   }
}
