package net.runelite.standalone;

import java.applet.Applet;
import java.net.URL;
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("p")
final class class95 implements Comparator {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class217 field1027;
   @ObfuscatedName("s")
   static String[] field1023;
   @ObfuscatedName("m")
   public static short[][] field1025;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "[Ldo;"
   )
   public static class18[] field1024;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lw;Lw;I)I",
      garbageValue = "-1134395895"
   )
   int method1747(class317 var1, class317 var2) {
      return var1.field3905 < var2.field3905?-1:(var1.field3905 == var2.field3905?0:1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method1747((class317)var1, (class317)var2);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-1663722094"
   )
   static int method1746(int var0, class296 var1, boolean var2) {
      String var3;
      if(var0 == 3100) {
         var3 = class249.field3313[--class103.field1146];
         ServerProt.method3131(0, "", var3);
         return 1;
      } else if(var0 == 3101) {
         class308.field3811 -= 2;
         class147.method2675(class32.field303, class249.field3312[class308.field3811], class249.field3312[class308.field3811 + 1]);
         return 1;
      } else if(var0 == 3103) {
         if(!class249.field3319) {
            class249.field3318 = true;
         }

         return 1;
      } else {
         int var10;
         if(var0 == 3104) {
            var3 = class249.field3313[--class103.field1146];
            var10 = 0;
            if(class67.method1489(var3)) {
               var10 = class17.method368(var3);
            }

            class12 var12 = class150.method2761(ClientProt.field3173, client.field2384.field1770);
            var12.field121.writeByte(var10);
            client.field2384.method2573(var12);
            return 1;
         } else {
            class12 var14;
            if(var0 == 3105) {
               var3 = class249.field3313[--class103.field1146];
               var14 = class150.method2761(ClientProt.field3251, client.field2384.field1770);
               var14.field121.method2288(var3.length() + 1);
               var14.field121.writeString(var3);
               client.field2384.method2573(var14);
               return 1;
            } else if(var0 == 3106) {
               var3 = class249.field3313[--class103.field1146];
               var14 = class150.method2761(ClientProt.field3188, client.field2384.field1770);
               var14.field121.method2288(var3.length() + 1);
               var14.field121.writeString(var3);
               client.field2384.method2573(var14);
               return 1;
            } else {
               String var7;
               int var15;
               if(var0 == 3107) {
                  var15 = class249.field3312[--class308.field3811];
                  var7 = class249.field3313[--class103.field1146];
                  class79.method1594(var15, var7);
                  return 1;
               } else if(var0 == 3108) {
                  class308.field3811 -= 3;
                  var15 = class249.field3312[class308.field3811];
                  var10 = class249.field3312[class308.field3811 + 1];
                  int var9 = class249.field3312[class308.field3811 + 2];
                  class187 var13 = class48.method1047(var9);
                  class283.method5466(var13, var15, var10);
                  return 1;
               } else if(var0 == 3109) {
                  class308.field3811 -= 2;
                  var15 = class249.field3312[class308.field3811];
                  var10 = class249.field3312[class308.field3811 + 1];
                  class187 var11 = var2?class3.field36:class284.field3565;
                  class283.method5466(var11, var15, var10);
                  return 1;
               } else if(var0 == 3110) {
                  class225.field3039 = class249.field3312[--class308.field3811] == 1;
                  return 1;
               } else if(var0 == 3111) {
                  class249.field3312[++class308.field3811 - 1] = class175.field2134.field854?1:0;
                  return 1;
               } else if(var0 == 3112) {
                  class175.field2134.field854 = class249.field3312[--class308.field3811] == 1;
                  class236.method4709();
                  return 1;
               } else if(var0 == 3113) {
                  var3 = class249.field3313[--class103.field1146];
                  boolean var4 = class249.field3312[--class308.field3811] == 1;
                  class212.method4358(var3, var4, false);
                  return 1;
               } else if(var0 == 3115) {
                  var15 = class249.field3312[--class308.field3811];
                  var14 = class150.method2761(ClientProt.field3198, client.field2384.field1770);
                  var14.field121.method2242(var15);
                  client.field2384.method2573(var14);
                  return 1;
               } else if(var0 == 3116) {
                  var15 = class249.field3312[--class308.field3811];
                  class103.field1146 -= 2;
                  var7 = class249.field3313[class103.field1146];
                  String var5 = class249.field3313[class103.field1146 + 1];
                  if(var7.length() > 500) {
                     return 1;
                  } else if(var5.length() > 500) {
                     return 1;
                  } else {
                     class12 var6 = class150.method2761(ClientProt.field3184, client.field2384.field1770);
                     var6.field121.method2242(1 + class118.method2136(var7) + class118.method2136(var5));
                     var6.field121.writeString(var7);
                     var6.field121.method2288(var15);
                     var6.field121.writeString(var5);
                     client.field2384.method2573(var6);
                     return 1;
                  }
               } else if(var0 == 3117) {
                  client.field2299 = class249.field3312[--class308.field3811] == 1;
                  return 1;
               } else if(var0 == 3118) {
                  client.field2301 = class249.field3312[--class308.field3811] == 1;
                  return 1;
               } else if(var0 == 3119) {
                  client.field2272 = class249.field3312[--class308.field3811] == 1;
                  return 1;
               } else if(var0 == 3120) {
                  if(class249.field3312[--class308.field3811] == 1) {
                     client.field2383 |= 1;
                  } else {
                     client.field2383 &= -2;
                  }

                  return 1;
               } else if(var0 == 3121) {
                  if(class249.field3312[--class308.field3811] == 1) {
                     client.field2383 |= 2;
                  } else {
                     client.field2383 &= -3;
                  }

                  return 1;
               } else if(var0 == 3122) {
                  if(class249.field3312[--class308.field3811] == 1) {
                     client.field2383 |= 4;
                  } else {
                     client.field2383 &= -5;
                  }

                  return 1;
               } else if(var0 == 3123) {
                  if(class249.field3312[--class308.field3811] == 1) {
                     client.field2383 |= 8;
                  } else {
                     client.field2383 &= -9;
                  }

                  return 1;
               } else if(var0 == 3124) {
                  client.field2383 = 0;
                  return 1;
               } else if(var0 == 3125) {
                  client.field2258 = class249.field3312[--class308.field3811] == 1;
                  return 1;
               } else if(var0 == 3126) {
                  client.field2268 = class249.field3312[--class308.field3811] == 1;
                  return 1;
               } else if(var0 == 3127) {
                  class308.method6053(class249.field3312[--class308.field3811] == 1);
                  return 1;
               } else if(var0 == 3128) {
                  class249.field3312[++class308.field3811 - 1] = method1743()?1:0;
                  return 1;
               } else if(var0 == 3129) {
                  class308.field3811 -= 2;
                  client.field2233 = class249.field3312[class308.field3811];
                  client.field2234 = class249.field3312[class308.field3811 + 1];
                  return 1;
               } else if(var0 == 3130) {
                  class308.field3811 -= 2;
                  return 1;
               } else if(var0 == 3131) {
                  --class308.field3811;
                  return 1;
               } else if(var0 == 3132) {
                  class249.field3312[++class308.field3811 - 1] = class167.field2010;
                  class249.field3312[++class308.field3811 - 1] = class193.field2748;
                  return 1;
               } else if(var0 == 3133) {
                  --class308.field3811;
                  return 1;
               } else if(var0 == 3134) {
                  return 1;
               } else if(var0 == 3135) {
                  class308.field3811 -= 2;
                  return 1;
               } else if(var0 == 3136) {
                  client.field2336 = 3;
                  client.field2316 = class249.field3312[--class308.field3811];
                  return 1;
               } else if(var0 == 3137) {
                  client.field2336 = 2;
                  client.field2316 = class249.field3312[--class308.field3811];
                  return 1;
               } else if(var0 == 3138) {
                  client.field2336 = 0;
                  return 1;
               } else if(var0 == 3139) {
                  client.field2336 = 1;
                  return 1;
               } else if(var0 == 3140) {
                  client.field2336 = 3;
                  client.field2316 = var2?class3.field36.field2621:class284.field3565.field2621;
                  return 1;
               } else {
                  boolean var8;
                  if(var0 == 3141) {
                     var8 = class249.field3312[--class308.field3811] == 1;
                     class175.field2134.field861 = var8;
                     class236.method4709();
                     return 1;
                  } else if(var0 == 3142) {
                     class249.field3312[++class308.field3811 - 1] = class175.field2134.field861?1:0;
                     return 1;
                  } else if(var0 == 3143) {
                     var8 = class249.field3312[--class308.field3811] == 1;
                     client.field2192 = var8;
                     if(!var8) {
                        class175.field2134.field858 = "";
                        class236.method4709();
                     }

                     return 1;
                  } else if(var0 == 3144) {
                     class249.field3312[++class308.field3811 - 1] = client.field2192?1:0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-7"
   )
   public static void method1744() {
      try {
         if(class43.field481 == 1) {
            int var0 = class43.field483.method1394();
            if(var0 > 0 && class43.field483.method1433()) {
               var0 -= class89.field974;
               if(var0 < 0) {
                  var0 = 0;
               }

               class43.field483.method1369(var0);
               return;
            }

            class43.field483.method1375();
            class43.field483.method1403();
            if(class270.field3480 != null) {
               class43.field481 = 2;
            } else {
               class43.field481 = 0;
            }

            class231.field3083 = null;
            class43.field482 = null;
         }
      } catch (Exception var2) {
         var2.printStackTrace();
         class43.field483.method1375();
         class43.field481 = 0;
         class231.field3083 = null;
         class43.field482 = null;
         class270.field3480 = null;
      }

   }

   @ObfuscatedName("gf")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-671140234"
   )
   static final void method1749() {
      client.field2329 = 0;
      int var0 = (class32.field303.field1090 >> 7) + class229.field3067;
      int var1 = (class32.field303.field1072 >> 7) + class35.field360;
      if(var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
         client.field2329 = 1;
      }

      if(var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
         client.field2329 = 1;
      }

      if(client.field2329 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
         client.field2329 = 0;
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lik;Ljava/lang/String;Ljava/lang/String;IZI)V",
      garbageValue = "-236395019"
   )
   public static void method1738(class217 var0, String var1, String var2, int var3, boolean var4) {
      int var5 = var0.method4421(var1);
      int var6 = var0.method4400(var5, var2);
      class67.method1488(var0, var5, var6, var3, var4);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "2068040697"
   )
   public static boolean method1745(int var0) {
      return (var0 >> 28 & 1) != 0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "102734824"
   )
   public static int method1750(int var0, int var1) {
      return (var0 << 8) + var1;
   }

   @ObfuscatedName("ij")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1039803569"
   )
   static boolean method1743() {
      return client.field2153;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ILjava/lang/String;B)Z",
      garbageValue = "-126"
   )
   static boolean method1748(String var0, int var1, String var2) {
      if(var1 == 0) {
         try {
            if(!class314.field3850.startsWith("win")) {
               throw new Exception();
            } else if(!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var4 = 0; var4 < var0.length(); ++var4) {
                  if(var11.indexOf(var0.charAt(var4)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var5) {
            return false;
         }
      } else if(var1 == 1) {
         try {
            Object var10 = class248.method4960(class314.field3856, var2, new Object[]{(new URL(class314.field3856.getCodeBase(), var0)).toString()});
            return var10 != null;
         } catch (Throwable var6) {
            return false;
         }
      } else if(var1 == 2) {
         try {
            class314.field3856.getAppletContext().showDocument(new URL(class314.field3856.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var7) {
            return false;
         }
      } else if(var1 == 3) {
         try {
            Applet var3 = class314.field3856;
            JSObject.getWindow(var3).call("loggedout", (Object[])null);
         } catch (Throwable var9) {
            ;
         }

         try {
            class314.field3856.getAppletContext().showDocument(new URL(class314.field3856.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }
}
