package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
public class class326 extends class324 {
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -916173195
   )
   public int field3952;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   public class6 field3953;
   @ObfuscatedName("w")
   public byte field3954;

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-2074622764"
   )
   static int method6280(int var0, class296 var1, boolean var2) {
      if(var0 == 5000) {
         class249.field3312[++class308.field3811 - 1] = client.field2369;
         return 1;
      } else if(var0 == 5001) {
         class308.field3811 -= 3;
         client.field2369 = class249.field3312[class308.field3811];
         class85.field924 = class94.method1735(class249.field3312[class308.field3811 + 1]);
         if(class85.field924 == null) {
            class85.field924 = class22.field241;
         }

         client.field2358 = class249.field3312[class308.field3811 + 2];
         class12 var18 = class150.method2761(ClientProt.field3171, client.field2384.field1770);
         var18.field121.method2288(client.field2369);
         var18.field121.method2288(class85.field924.field243);
         var18.field121.method2288(client.field2358);
         client.field2384.method2573(var18);
         return 1;
      } else {
         String var3;
         int var4;
         if(var0 == 5002) {
            var3 = class249.field3313[--class103.field1146];
            class308.field3811 -= 2;
            var4 = class249.field3312[class308.field3811];
            int var5 = class249.field3312[class308.field3811 + 1];
            class12 var6 = class150.method2761(ClientProt.field3253, client.field2384.field1770);
            var6.field121.method2288(class118.method2136(var3) + 2);
            var6.field121.writeString(var3);
            var6.field121.method2288(var4 - 1);
            var6.field121.method2288(var5);
            client.field2384.method2573(var6);
            return 1;
         } else {
            int var10;
            if(var0 == 5003) {
               class308.field3811 -= 2;
               var10 = class249.field3312[class308.field3811];
               var4 = class249.field3312[class308.field3811 + 1];
               class227 var15 = WorldMapRegion.method1036(var10, var4);
               if(var15 != null) {
                  class249.field3312[++class308.field3811 - 1] = var15.field3056;
                  class249.field3312[++class308.field3811 - 1] = var15.field3048;
                  class249.field3313[++class103.field1146 - 1] = var15.field3053 != null?var15.field3053:"";
                  class249.field3313[++class103.field1146 - 1] = var15.field3049 != null?var15.field3049:"";
                  class249.field3313[++class103.field1146 - 1] = var15.field3051 != null?var15.field3051:"";
                  class249.field3312[++class308.field3811 - 1] = var15.method4573()?1:(var15.method4576()?2:0);
               } else {
                  class249.field3312[++class308.field3811 - 1] = -1;
                  class249.field3312[++class308.field3811 - 1] = 0;
                  class249.field3313[++class103.field1146 - 1] = "";
                  class249.field3313[++class103.field1146 - 1] = "";
                  class249.field3313[++class103.field1146 - 1] = "";
                  class249.field3312[++class308.field3811 - 1] = 0;
               }

               return 1;
            } else if(var0 == 5004) {
               var10 = class249.field3312[--class308.field3811];
               class227 var16 = class87.method1635(var10);
               if(var16 != null) {
                  class249.field3312[++class308.field3811 - 1] = var16.field3050;
                  class249.field3312[++class308.field3811 - 1] = var16.field3048;
                  class249.field3313[++class103.field1146 - 1] = var16.field3053 != null?var16.field3053:"";
                  class249.field3313[++class103.field1146 - 1] = var16.field3049 != null?var16.field3049:"";
                  class249.field3313[++class103.field1146 - 1] = var16.field3051 != null?var16.field3051:"";
                  class249.field3312[++class308.field3811 - 1] = var16.method4573()?1:(var16.method4576()?2:0);
               } else {
                  class249.field3312[++class308.field3811 - 1] = -1;
                  class249.field3312[++class308.field3811 - 1] = 0;
                  class249.field3313[++class103.field1146 - 1] = "";
                  class249.field3313[++class103.field1146 - 1] = "";
                  class249.field3313[++class103.field1146 - 1] = "";
                  class249.field3312[++class308.field3811 - 1] = 0;
               }

               return 1;
            } else if(var0 == 5005) {
               if(class85.field924 == null) {
                  class249.field3312[++class308.field3811 - 1] = -1;
               } else {
                  class249.field3312[++class308.field3811 - 1] = class85.field924.field243;
               }

               return 1;
            } else if(var0 == 5008) {
               var3 = class249.field3313[--class103.field1146];
               var4 = class249.field3312[--class308.field3811];
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
               } else if(client.field2158 != 0) {
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
               } else if(client.field2158 != 0) {
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

               class12 var8 = class150.method2761(ClientProt.field3214, client.field2384.field1770);
               var8.field121.method2288(0);
               int var9 = var8.field121.field1693;
               var8.field121.method2288(var4);
               var8.field121.method2288(var17);
               var8.field121.method2288(var7);
               class315.method6188(var8.field121, var3);
               var8.field121.method2254(var8.field121.field1693 - var9);
               client.field2384.method2573(var8);
               return 1;
            } else if(var0 == 5009) {
               class103.field1146 -= 2;
               var3 = class249.field3313[class103.field1146];
               String var12 = class249.field3313[class103.field1146 + 1];
               class12 var11 = class150.method2761(ClientProt.field3181, client.field2384.field1770);
               var11.field121.method2242(0);
               int var13 = var11.field121.field1693;
               var11.field121.writeString(var3);
               class315.method6188(var11.field121, var12);
               var11.field121.method2253(var11.field121.field1693 - var13);
               client.field2384.method2573(var11);
               return 1;
            } else if(var0 != 5015) {
               if(var0 == 5016) {
                  class249.field3312[++class308.field3811 - 1] = client.field2358;
                  return 1;
               } else if(var0 == 5017) {
                  var10 = class249.field3312[--class308.field3811];
                  class249.field3312[++class308.field3811 - 1] = class137.method2588(var10);
                  return 1;
               } else if(var0 == 5018) {
                  var10 = class249.field3312[--class308.field3811];
                  class249.field3312[++class308.field3811 - 1] = class79.method1591(var10);
                  return 1;
               } else if(var0 == 5019) {
                  var10 = class249.field3312[--class308.field3811];
                  class249.field3312[++class308.field3811 - 1] = class39.method716(var10);
                  return 1;
               } else if(var0 == 5020) {
                  var3 = class249.field3313[--class103.field1146];
                  class313.method6136(var3);
                  return 1;
               } else if(var0 == 5021) {
                  client.field2371 = class249.field3313[--class103.field1146].toLowerCase().trim();
                  return 1;
               } else if(var0 == 5022) {
                  class249.field3313[++class103.field1146 - 1] = client.field2371;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if(class32.field303 != null && class32.field303.field2802 != null) {
                  var3 = class32.field303.field2802.method2869();
               } else {
                  var3 = "";
               }

               class249.field3313[++class103.field1146 - 1] = var3;
               return 1;
            }
         }
      }
   }
}
