package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
public class class332 extends class193 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   public class108 field3724;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -916173195
   )
   public int field3723;
   @ObfuscatedName("w")
   public byte field3725;

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-2074622764"
   )
   static int method5947(int var0, class252 var1, boolean var2) {
      if(var0 == 5000) {
         class55.field407[++class171.field1587 - 1] = client.publicChatMode;
         return 1;
      } else if(var0 == 5001) {
         class171.field1587 -= 3;
         client.publicChatMode = class55.field407[class171.field1587];
         class83.field750 = class138.method2516(class55.field407[class171.field1587 + 1]);
         if(class83.field750 == null) {
            class83.field750 = class114.field1067;
         }

         client.field3937 = class55.field407[class171.field1587 + 2];
         class279 var18 = class95.writeClientProt(ClientProt.CHAT_SET_MODE, client.field3963.field1162);
         var18.field3018.writeByte(client.publicChatMode);
         var18.field3018.writeByte(class83.field750.field1069);
         var18.field3018.writeByte(client.field3937);
         client.field3963.method2235(var18);
         return 1;
      } else {
         String var3;
         int var4;
         if(var0 == 5002) {
            var3 = class55.field408[--class272.field2978];
            class171.field1587 -= 2;
            var4 = class55.field407[class171.field1587];
            int var5 = class55.field407[class171.field1587 + 1];
            class279 var6 = class95.writeClientProt(ClientProt.PLAYER_REPORT, client.field3963.field1162);
            var6.field3018.writeByte(class164.method2819(var3) + 2);
            var6.field3018.writeString(var3);
            var6.field3018.writeByte(var4 - 1);
            var6.field3018.writeByte(var5);
            client.field3963.method2235(var6);
            return 1;
         } else {
            int var10;
            if(var0 == 5003) {
               class171.field1587 -= 2;
               var10 = class55.field407[class171.field1587];
               var4 = class55.field407[class171.field1587 + 1];
               class286 var15 = class261.method4813(var10, var4);
               if(var15 != null) {
                  class55.field407[++class171.field1587 - 1] = var15.field3113;
                  class55.field407[++class171.field1587 - 1] = var15.field3105;
                  class55.field408[++class272.field2978 - 1] = var15.field3110 != null?var15.field3110:"";
                  class55.field408[++class272.field2978 - 1] = var15.field3106 != null?var15.field3106:"";
                  class55.field408[++class272.field2978 - 1] = var15.field3108 != null?var15.field3108:"";
                  class55.field407[++class171.field1587 - 1] = var15.method5040()?1:(var15.method5043()?2:0);
               } else {
                  class55.field407[++class171.field1587 - 1] = -1;
                  class55.field407[++class171.field1587 - 1] = 0;
                  class55.field408[++class272.field2978 - 1] = "";
                  class55.field408[++class272.field2978 - 1] = "";
                  class55.field408[++class272.field2978 - 1] = "";
                  class55.field407[++class171.field1587 - 1] = 0;
               }

               return 1;
            } else if(var0 == 5004) {
               var10 = class55.field407[--class171.field1587];
               class286 var16 = class274.method4909(var10);
               if(var16 != null) {
                  class55.field407[++class171.field1587 - 1] = var16.field3107;
                  class55.field407[++class171.field1587 - 1] = var16.field3105;
                  class55.field408[++class272.field2978 - 1] = var16.field3110 != null?var16.field3110:"";
                  class55.field408[++class272.field2978 - 1] = var16.field3106 != null?var16.field3106:"";
                  class55.field408[++class272.field2978 - 1] = var16.field3108 != null?var16.field3108:"";
                  class55.field407[++class171.field1587 - 1] = var16.method5040()?1:(var16.method5043()?2:0);
               } else {
                  class55.field407[++class171.field1587 - 1] = -1;
                  class55.field407[++class171.field1587 - 1] = 0;
                  class55.field408[++class272.field2978 - 1] = "";
                  class55.field408[++class272.field2978 - 1] = "";
                  class55.field408[++class272.field2978 - 1] = "";
                  class55.field407[++class171.field1587 - 1] = 0;
               }

               return 1;
            } else if(var0 == 5005) {
               if(class83.field750 == null) {
                  class55.field407[++class171.field1587 - 1] = -1;
               } else {
                  class55.field407[++class171.field1587 - 1] = class83.field750.field1069;
               }

               return 1;
            } else if(var0 == 5008) {
               var3 = class55.field408[--class272.field2978];
               var4 = class55.field407[--class171.field1587];
               String var14 = var3.toLowerCase();
               byte var17 = 0;
               if(var14.startsWith("yellow:")) {
                  var17 = 0;
                  var3 = var3.substring("yellow:".length());
               } else if(var14.startsWith("red:")) {
                  var17 = 1;
                  var3 = var3.substring("red:".length());
               } else if(var14.startsWith("green:")) {
                  var17 = 2;
                  var3 = var3.substring("green:".length());
               } else if(var14.startsWith("cyan:")) {
                  var17 = 3;
                  var3 = var3.substring("cyan:".length());
               } else if(var14.startsWith("purple:")) {
                  var17 = 4;
                  var3 = var3.substring("purple:".length());
               } else if(var14.startsWith("white:")) {
                  var17 = 5;
                  var3 = var3.substring("white:".length());
               } else if(var14.startsWith("flash1:")) {
                  var17 = 6;
                  var3 = var3.substring("flash1:".length());
               } else if(var14.startsWith("flash2:")) {
                  var17 = 7;
                  var3 = var3.substring("flash2:".length());
               } else if(var14.startsWith("flash3:")) {
                  var17 = 8;
                  var3 = var3.substring("flash3:".length());
               } else if(var14.startsWith("glow1:")) {
                  var17 = 9;
                  var3 = var3.substring("glow1:".length());
               } else if(var14.startsWith("glow2:")) {
                  var17 = 10;
                  var3 = var3.substring("glow2:".length());
               } else if(var14.startsWith("glow3:")) {
                  var17 = 11;
                  var3 = var3.substring("glow3:".length());
               } else if(client.field3737 != 0) {
                  if(var14.startsWith("yellow:")) {
                     var17 = 0;
                     var3 = var3.substring("yellow:".length());
                  } else if(var14.startsWith("red:")) {
                     var17 = 1;
                     var3 = var3.substring("red:".length());
                  } else if(var14.startsWith("green:")) {
                     var17 = 2;
                     var3 = var3.substring("green:".length());
                  } else if(var14.startsWith("cyan:")) {
                     var17 = 3;
                     var3 = var3.substring("cyan:".length());
                  } else if(var14.startsWith("purple:")) {
                     var17 = 4;
                     var3 = var3.substring("purple:".length());
                  } else if(var14.startsWith("white:")) {
                     var17 = 5;
                     var3 = var3.substring("white:".length());
                  } else if(var14.startsWith("flash1:")) {
                     var17 = 6;
                     var3 = var3.substring("flash1:".length());
                  } else if(var14.startsWith("flash2:")) {
                     var17 = 7;
                     var3 = var3.substring("flash2:".length());
                  } else if(var14.startsWith("flash3:")) {
                     var17 = 8;
                     var3 = var3.substring("flash3:".length());
                  } else if(var14.startsWith("glow1:")) {
                     var17 = 9;
                     var3 = var3.substring("glow1:".length());
                  } else if(var14.startsWith("glow2:")) {
                     var17 = 10;
                     var3 = var3.substring("glow2:".length());
                  } else if(var14.startsWith("glow3:")) {
                     var17 = 11;
                     var3 = var3.substring("glow3:".length());
                  }
               }

               var14 = var3.toLowerCase();
               byte var7 = 0;
               if(var14.startsWith("wave:")) {
                  var7 = 1;
                  var3 = var3.substring("wave:".length());
               } else if(var14.startsWith("wave2:")) {
                  var7 = 2;
                  var3 = var3.substring("wave2:".length());
               } else if(var14.startsWith("shake:")) {
                  var7 = 3;
                  var3 = var3.substring("shake:".length());
               } else if(var14.startsWith("scroll:")) {
                  var7 = 4;
                  var3 = var3.substring("scroll:".length());
               } else if(var14.startsWith("slide:")) {
                  var7 = 5;
                  var3 = var3.substring("slide:".length());
               } else if(client.field3737 != 0) {
                  if(var14.startsWith("wave:")) {
                     var7 = 1;
                     var3 = var3.substring("wave:".length());
                  } else if(var14.startsWith("wave2:")) {
                     var7 = 2;
                     var3 = var3.substring("wave2:".length());
                  } else if(var14.startsWith("shake:")) {
                     var7 = 3;
                     var3 = var3.substring("shake:".length());
                  } else if(var14.startsWith("scroll:")) {
                     var7 = 4;
                     var3 = var3.substring("scroll:".length());
                  } else if(var14.startsWith("slide:")) {
                     var7 = 5;
                     var3 = var3.substring("slide:".length());
                  }
               }

               class279 var8 = class95.writeClientProt(ClientProt.CHAT, client.field3963.field1162);
               var8.field3018.writeByte(0);
               int var9 = var8.field3018.field1073;
               var8.field3018.writeByte(var4);
               var8.field3018.writeByte(var17);
               var8.field3018.writeByte(var7);
               class222.method3987(var8.field3018, var3);
               var8.field3018.method1903(var8.field3018.field1073 - var9);
               client.field3963.method2235(var8);
               return 1;
            } else if(var0 == 5009) {
               class272.field2978 -= 2;
               var3 = class55.field408[class272.field2978];
               String var12 = class55.field408[class272.field2978 + 1];
               class279 var11 = class95.writeClientProt(ClientProt.MESSAGE_PRIVATE, client.field3963.field1162);
               var11.field3018.writeShort(0);
               int var13 = var11.field3018.field1073;
               var11.field3018.writeString(var3);
               class222.method3987(var11.field3018, var12);
               var11.field3018.method1902(var11.field3018.field1073 - var13);
               client.field3963.method2235(var11);
               return 1;
            } else if(var0 != 5015) {
               if(var0 == 5016) {
                  class55.field407[++class171.field1587 - 1] = client.field3937;
                  return 1;
               } else if(var0 == 5017) {
                  var10 = class55.field407[--class171.field1587];
                  class55.field407[++class171.field1587 - 1] = class121.method2250(var10);
                  return 1;
               } else if(var0 == 5018) {
                  var10 = class55.field407[--class171.field1587];
                  class55.field407[++class171.field1587 - 1] = class130.method2393(var10);
                  return 1;
               } else if(var0 == 5019) {
                  var10 = class55.field407[--class171.field1587];
                  class55.field407[++class171.field1587 - 1] = class325.method5775(var10);
                  return 1;
               } else if(var0 == 5020) {
                  var3 = class55.field408[--class272.field2978];
                  class301.method5199(var3);
                  return 1;
               } else if(var0 == 5021) {
                  client.field3950 = class55.field408[--class272.field2978].toLowerCase().trim();
                  return 1;
               } else if(var0 == 5022) {
                  class55.field408[++class272.field2978 - 1] = client.field3950;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if(class5.field43 != null && class5.field43.field577 != null) {
                  var3 = class5.field43.field577.method821();
               } else {
                  var3 = "";
               }

               class55.field408[++class272.field2978 - 1] = var3;
               return 1;
            }
         }
      }
   }
}
