package net.runelite.client.standalone;

import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
public class class275 {
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Llp;"
   )
   static class26 field3008;
   @ObfuscatedName("f")
   String field3005;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1649906789
   )
   int field3004;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lx;"
   )
   class169 field3007;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1101458659
   )
   int field3006;

   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;IILx;)V"
   )
   class275(String var1, int var2, int var3, class169 var4) {
      this.field3005 = var1;
      this.field3004 = var2;
      this.field3006 = var3;
      this.field3007 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Ljx;",
      garbageValue = "-1122228825"
   )
   public static class183 method4913(int var0) {
      class183 var1 = (class183)class183.field1767.method2268((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class183.field1772.method2579(11, var0, -1932849649);
         var1 = new class183();
         if(var2 != null) {
            var1.method3194(new Buffer(var2));
         }

         var1.method3198();
         class183.field1767.method2275(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1684113654"
   )
   static void method4914() {
      class31.field246 = 99;
      class31.field241 = new byte[4][104][104];
      class102.field961 = new byte[4][104][104];
      class31.field242 = new byte[4][104][104];
      class31.field243 = new byte[4][104][104];
      class188.field1801 = new int[4][105][105];
      class152.field1452 = new byte[4][105][105];
      class198.field1868 = new int[105][105];
      class31.field244 = new int[104];
      class86.field777 = new int[104];
      class112.field1053 = new int[104];
      class305.field3263 = new int[104];
      class188.field1796 = new int[104];
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1128619564"
   )
   static void method4911(int var0) {
      class292 var1 = (class292)class292.field3153.method5310((long)var0);
      if(var1 != null) {
         var1.method1186();
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;Lly;I)Ljava/lang/String;",
      garbageValue = "35214901"
   )
   public static String method4915(CharSequence var0, class179 var1) {
      if(var0 == null) {
         return null;
      } else {
         int var2 = 0;

         int var3;
         for(var3 = var0.length(); var2 < var3 && class273.method4907(var0.charAt(var2)); ++var2) {
            ;
         }

         while(var3 > var2 && class273.method4907(var0.charAt(var3 - 1))) {
            --var3;
         }

         int var4 = var3 - var2;
         if(var4 >= 1) {
            byte var6;
            if(var1 == null) {
               var6 = 12;
            } else {
               switch(var1.field1701) {
               case 4:
                  var6 = 20;
                  break;
               default:
                  var6 = 12;
               }
            }

            if(var4 <= var6) {
               StringBuilder var12 = new StringBuilder(var4);

               for(int var14 = var2; var14 < var3; ++var14) {
                  char var7 = var0.charAt(var14);
                  boolean var8;
                  if(Character.isISOControl(var7)) {
                     var8 = false;
                  } else if(class244.method4480(var7)) {
                     var8 = true;
                  } else {
                     char[] var9 = class173.field1641;
                     int var10 = 0;

                     label97:
                     while(true) {
                        char var11;
                        if(var10 >= var9.length) {
                           var9 = class173.field1643;

                           for(var10 = 0; var10 < var9.length; ++var10) {
                              var11 = var9[var10];
                              if(var11 == var7) {
                                 var8 = true;
                                 break label97;
                              }
                           }

                           var8 = false;
                           break;
                        }

                        var11 = var9[var10];
                        if(var7 == var11) {
                           var8 = true;
                           break;
                        }

                        ++var10;
                     }
                  }

                  if(var8) {
                     char var13;
                     switch(var7) {
                     case ' ':
                     case '-':
                     case '_':
                     case ' ':
                        var13 = '_';
                        break;
                     case '#':
                     case '[':
                     case ']':
                        var13 = var7;
                        break;
                     case 'À':
                     case 'Á':
                     case 'Â':
                     case 'Ã':
                     case 'Ä':
                     case 'à':
                     case 'á':
                     case 'â':
                     case 'ã':
                     case 'ä':
                        var13 = 'a';
                        break;
                     case 'Ç':
                     case 'ç':
                        var13 = 'c';
                        break;
                     case 'È':
                     case 'É':
                     case 'Ê':
                     case 'Ë':
                     case 'è':
                     case 'é':
                     case 'ê':
                     case 'ë':
                        var13 = 'e';
                        break;
                     case 'Í':
                     case 'Î':
                     case 'Ï':
                     case 'í':
                     case 'î':
                     case 'ï':
                        var13 = 'i';
                        break;
                     case 'Ñ':
                     case 'ñ':
                        var13 = 'n';
                        break;
                     case 'Ò':
                     case 'Ó':
                     case 'Ô':
                     case 'Õ':
                     case 'Ö':
                     case 'ò':
                     case 'ó':
                     case 'ô':
                     case 'õ':
                     case 'ö':
                        var13 = 'o';
                        break;
                     case 'Ù':
                     case 'Ú':
                     case 'Û':
                     case 'Ü':
                     case 'ù':
                     case 'ú':
                     case 'û':
                     case 'ü':
                        var13 = 'u';
                        break;
                     case 'ß':
                        var13 = 'b';
                        break;
                     case 'ÿ':
                     case 'Ÿ':
                        var13 = 'y';
                        break;
                     default:
                        var13 = Character.toLowerCase(var7);
                     }

                     if(var13 != 0) {
                        var12.append(var13);
                     }
                  }
               }

               if(var12.length() == 0) {
                  return null;
               }

               return var12.toString();
            }
         }

         return null;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)Z",
      garbageValue = "-84"
   )
   static boolean method4910(String var0) {
      if(var0 == null) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var2) {
            return false;
         }
      }
   }

   @ObfuscatedName("jq")
   @ObfuscatedSignature(
      signature = "(Lhw;I)Z",
      garbageValue = "387146429"
   )
   static final boolean method4912(class329 var0) {
      int var1 = var0.field3548;
      if(var1 == 205) {
         client.field3877 = 250;
         return true;
      } else {
         int var2;
         int var3;
         if(var1 >= 300 && var1 <= 313) {
            var2 = (var1 - 300) / 2;
            var3 = var1 & 1;
            client.field3854.method786(var2, var3 == 1);
         }

         if(var1 >= 314 && var1 <= 323) {
            var2 = (var1 - 314) / 2;
            var3 = var1 & 1;
            client.field3854.method755(var2, var3 == 1);
         }

         if(var1 == 324) {
            client.field3854.method758(false);
         }

         if(var1 == 325) {
            client.field3854.method758(true);
         }

         if(var1 == 326) {
            class279 var4 = class95.writeClientProt(ClientProt.SET_APPEARANCE, client.field3963.field1162);
            client.field3854.method760(var4.field3018);
            client.field3963.method2235(var4);
            return true;
         } else {
            return false;
         }
      }
   }
}
