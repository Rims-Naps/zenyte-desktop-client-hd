package net.runelite.client.standalone;

import java.applet.Applet;
import java.net.URL;
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("p")
final class class128 implements Comparator {
   @ObfuscatedName("m")
   public static short[][] field1221;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class148 field1223;
   @ObfuscatedName("s")
   static String[] field1219;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "[Ldo;"
   )
   public static class211[] field1220;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lw;Lw;I)I",
      garbageValue = "-1134395895"
   )
   int method2379(class230 var1, class230 var2) {
      return var1.field2252 < var2.field2252?-1:(var1.field2252 == var2.field2252?0:1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method2379((class230)var1, (class230)var2);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "102734824"
   )
   public static int method2382(int var0, int var1) {
      return (var0 << 8) + var1;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-1663722094"
   )
   static int method2378(int var0, class252 var1, boolean var2) {
      String var3;
      if(var0 == 3100) {
         var3 = class55.field408[--class272.field2978];
         ServerProt.method4172(0, "", var3);
         return 1;
      } else if(var0 == 3101) {
         class171.field1587 -= 2;
         class8.method99(class5.field43, class55.field407[class171.field1587], class55.field407[class171.field1587 + 1]);
         return 1;
      } else if(var0 == 3103) {
         if(!class55.field414) {
            class55.field413 = true;
         }

         return 1;
      } else {
         int var10;
         if(var0 == 3104) {
            var3 = class55.field408[--class272.field2978];
            var10 = 0;
            if(class136.method2512(var3)) {
               var10 = class140.method2525(var3);
            }

            class279 var12 = class95.writeClientProt(ClientProt.INTEGER_INPUT, client.field3963.field1162);
            var12.field3018.writeInt(var10);
            client.field3963.method2235(var12);
            return 1;
         } else {
            class279 var14;
            if(var0 == 3105) {
               var3 = class55.field408[--class272.field2978];
               var14 = class95.writeClientProt(ClientProt.NAME_INPUT, client.field3963.field1162);
               var14.field3018.writeByte(var3.length() + 1);
               var14.field3018.writeString(var3);
               client.field3963.method2235(var14);
               return 1;
            } else if(var0 == 3106) {
               var3 = class55.field408[--class272.field2978];
               var14 = class95.writeClientProt(ClientProt.STRING_INPUT, client.field3963.field1162);
               var14.field3018.writeByte(var3.length() + 1);
               var14.field3018.writeString(var3);
               client.field3963.method2235(var14);
               return 1;
            } else {
               String var7;
               int var15;
               if(var0 == 3107) {
                  var15 = class55.field407[--class171.field1587];
                  var7 = class55.field408[--class272.field2978];
                  class130.method2396(var15, var7);
                  return 1;
               } else if(var0 == 3108) {
                  class171.field1587 -= 3;
                  var15 = class55.field407[class171.field1587];
                  var10 = class55.field407[class171.field1587 + 1];
                  int var9 = class55.field407[class171.field1587 + 2];
                  class329 var13 = class189.getWidget(var9);
                  class38.method621(var13, var15, var10);
                  return 1;
               } else if(var0 == 3109) {
                  class171.field1587 -= 2;
                  var15 = class55.field407[class171.field1587];
                  var10 = class55.field407[class171.field1587 + 1];
                  class329 var11 = var2?class182.field1766:class20.field155;
                  class38.method621(var11, var15, var10);
                  return 1;
               } else if(var0 == 3110) {
                  class192.field1840 = class55.field407[--class171.field1587] == 1;
                  return 1;
               } else if(var0 == 3111) {
                  class55.field407[++class171.field1587 - 1] = class153.field1455.field1856?1:0;
                  return 1;
               } else if(var0 == 3112) {
                  class153.field1455.field1856 = class55.field407[--class171.field1587] == 1;
                  class57.method1015();
                  return 1;
               } else if(var0 == 3113) {
                  var3 = class55.field408[--class272.field2978];
                  boolean var4 = class55.field407[--class171.field1587] == 1;
                  class112.method1875(var3, var4, false);
                  return 1;
               } else if(var0 == 3115) {
                  var15 = class55.field407[--class171.field1587];
                  var14 = class95.writeClientProt(ClientProt.SELECT_ITEM_FROM_SELECTION, client.field3963.field1162);
                  var14.field3018.writeShort(var15);
                  client.field3963.method2235(var14);
                  return 1;
               } else if(var0 == 3116) {
                  var15 = class55.field407[--class171.field1587];
                  class272.field2978 -= 2;
                  var7 = class55.field408[class272.field2978];
                  String var5 = class55.field408[class272.field2978 + 1];
                  if(var7.length() > 500) {
                     return 1;
                  } else if(var5.length() > 500) {
                     return 1;
                  } else {
                     class279 var6 = class95.writeClientProt(ClientProt.BUG_REPORT, client.field3963.field1162);
                     var6.field3018.writeShort(1 + class164.method2819(var7) + class164.method2819(var5));
                     var6.field3018.writeString(var7);
                     var6.field3018.writeByte(var15);
                     var6.field3018.writeString(var5);
                     client.field3963.method2235(var6);
                     return 1;
                  }
               } else if(var0 == 3117) {
                  client.field3878 = class55.field407[--class171.field1587] == 1;
                  return 1;
               } else if(var0 == 3118) {
                  client.field3880 = class55.field407[--class171.field1587] == 1;
                  return 1;
               } else if(var0 == 3119) {
                  client.field3851 = class55.field407[--class171.field1587] == 1;
                  return 1;
               } else if(var0 == 3120) {
                  if(class55.field407[--class171.field1587] == 1) {
                     client.field3962 |= 1;
                  } else {
                     client.field3962 &= -2;
                  }

                  return 1;
               } else if(var0 == 3121) {
                  if(class55.field407[--class171.field1587] == 1) {
                     client.field3962 |= 2;
                  } else {
                     client.field3962 &= -3;
                  }

                  return 1;
               } else if(var0 == 3122) {
                  if(class55.field407[--class171.field1587] == 1) {
                     client.field3962 |= 4;
                  } else {
                     client.field3962 &= -5;
                  }

                  return 1;
               } else if(var0 == 3123) {
                  if(class55.field407[--class171.field1587] == 1) {
                     client.field3962 |= 8;
                  } else {
                     client.field3962 &= -9;
                  }

                  return 1;
               } else if(var0 == 3124) {
                  client.field3962 = 0;
                  return 1;
               } else if(var0 == 3125) {
                  client.field3837 = class55.field407[--class171.field1587] == 1;
                  return 1;
               } else if(var0 == 3126) {
                  client.field3847 = class55.field407[--class171.field1587] == 1;
                  return 1;
               } else if(var0 == 3127) {
                  class171.method2888(class55.field407[--class171.field1587] == 1);
                  return 1;
               } else if(var0 == 3128) {
                  class55.field407[++class171.field1587 - 1] = method2375()?1:0;
                  return 1;
               } else if(var0 == 3129) {
                  class171.field1587 -= 2;
                  client.field3812 = class55.field407[class171.field1587];
                  client.field3813 = class55.field407[class171.field1587 + 1];
                  return 1;
               } else if(var0 == 3130) {
                  class171.field1587 -= 2;
                  return 1;
               } else if(var0 == 3131) {
                  --class171.field1587;
                  return 1;
               } else if(var0 == 3132) {
                  class55.field407[++class171.field1587 - 1] = class47.field359;
                  class55.field407[++class171.field1587 - 1] = class330.field3689;
                  return 1;
               } else if(var0 == 3133) {
                  --class171.field1587;
                  return 1;
               } else if(var0 == 3134) {
                  return 1;
               } else if(var0 == 3135) {
                  class171.field1587 -= 2;
                  return 1;
               } else if(var0 == 3136) {
                  client.field3915 = 3;
                  client.field3895 = class55.field407[--class171.field1587];
                  return 1;
               } else if(var0 == 3137) {
                  client.field3915 = 2;
                  client.field3895 = class55.field407[--class171.field1587];
                  return 1;
               } else if(var0 == 3138) {
                  client.field3915 = 0;
                  return 1;
               } else if(var0 == 3139) {
                  client.field3915 = 1;
                  return 1;
               } else if(var0 == 3140) {
                  client.field3915 = 3;
                  client.field3895 = var2?class182.field1766.field3607:class20.field155.field3607;
                  return 1;
               } else {
                  boolean var8;
                  if(var0 == 3141) {
                     var8 = class55.field407[--class171.field1587] == 1;
                     class153.field1455.field1863 = var8;
                     class57.method1015();
                     return 1;
                  } else if(var0 == 3142) {
                     class55.field407[++class171.field1587 - 1] = class153.field1455.field1863?1:0;
                     return 1;
                  } else if(var0 == 3143) {
                     var8 = class55.field407[--class171.field1587] == 1;
                     client.field3771 = var8;
                     if(!var8) {
                        class153.field1455.field1860 = "";
                        class57.method1015();
                     }

                     return 1;
                  } else if(var0 == 3144) {
                     class55.field407[++class171.field1587 - 1] = client.field3771?1:0;
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
   public static void method2376() {
      try {
         if(class227.field2232 == 1) {
            int var0 = class227.field2234.method268();
            if(var0 > 0 && class227.field2234.method307()) {
               var0 -= class204.field1991;
               if(var0 < 0) {
                  var0 = 0;
               }

               class227.field2234.method243(var0);
               return;
            }

            class227.field2234.method249();
            class227.field2234.method277();
            if(class53.field391 != null) {
               class227.field2232 = 2;
            } else {
               class227.field2232 = 0;
            }

            class292.field3157 = null;
            class227.field2233 = null;
         }
      } catch (Exception var2) {
         var2.printStackTrace();
         class227.field2234.method249();
         class227.field2232 = 0;
         class292.field3157 = null;
         class227.field2233 = null;
         class53.field391 = null;
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ILjava/lang/String;B)Z",
      garbageValue = "-126"
   )
   static boolean method2380(String var0, int var1, String var2) {
      if(var1 == 0) {
         try {
            if(!class7.field50.startsWith("win")) {
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
            Object var10 = class290.method5110(class7.field56, var2, new Object[]{(new URL(class7.field56.getCodeBase(), var0)).toString()});
            return var10 != null;
         } catch (Throwable var6) {
            return false;
         }
      } else if(var1 == 2) {
         try {
            class7.field56.getAppletContext().showDocument(new URL(class7.field56.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var7) {
            return false;
         }
      } else if(var1 == 3) {
         try {
            Applet var3 = class7.field56;
            JSObject.getWindow(var3).call("loggedout", (Object[])null);
         } catch (Throwable var9) {
            ;
         }

         try {
            class7.field56.getAppletContext().showDocument(new URL(class7.field56.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lik;Ljava/lang/String;Ljava/lang/String;IZI)V",
      garbageValue = "-236395019"
   )
   public static void method2370(class148 var0, String var1, String var2, int var3, boolean var4) {
      int var5 = var0.method2602(var1);
      int var6 = var0.method2581(var5, var2);
      class136.method2511(var0, var5, var6, var3, var4);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "2068040697"
   )
   public static boolean method2377(int var0) {
      return (var0 >> 28 & 1) != 0;
   }

   @ObfuscatedName("ij")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1039803569"
   )
   static boolean method2375() {
      return client.field3732;
   }

   @ObfuscatedName("gf")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-671140234"
   )
   static final void method2381() {
      client.field3908 = 0;
      int var0 = (class5.field43.field1277 >> 7) + class296.somex;
      int var1 = (class5.field43.field1259 >> 7) + class284.somey;
      if(var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
         client.field3908 = 1;
      }

      if(var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
         client.field3908 = 1;
      }

      if(client.field3908 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
         client.field3908 = 0;
      }

   }
}
