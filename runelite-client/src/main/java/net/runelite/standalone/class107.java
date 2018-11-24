package net.runelite.standalone;

import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
public class class107 {
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Llp;"
   )
   public static SpritePixels rightBackground;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1649906789
   )
   int field1165;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lx;"
   )
   class181 field1168;
   @ObfuscatedName("f")
   String field1166;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1101458659
   )
   int field1167;

   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;IILx;)V"
   )
   class107(String var1, int var2, int var3, class181 var4) {
      this.field1166 = var1;
      this.field1165 = var2;
      this.field1167 = var3;
      this.field1168 = var4;
   }

   @ObfuscatedName("jq")
   @ObfuscatedSignature(
      signature = "(Lhw;I)Z",
      garbageValue = "387146429"
   )
   static final boolean method1888(class187 var0) {
      int var1 = var0.field2562;
      if(var1 == 205) {
         client.field2298 = 250;
         return true;
      } else {
         int var2;
         int var3;
         if(var1 >= 300 && var1 <= 313) {
            var2 = (var1 - 300) / 2;
            var3 = var1 & 1;
            client.field2275.method6313(var2, var3 == 1);
         }

         if(var1 >= 314 && var1 <= 323) {
            var2 = (var1 - 314) / 2;
            var3 = var1 & 1;
            client.field2275.method6282(var2, var3 == 1);
         }

         if(var1 == 324) {
            client.field2275.method6285(false);
         }

         if(var1 == 325) {
            client.field2275.method6285(true);
         }

         if(var1 == 326) {
            class12 var4 = class150.method2761(ClientProt.field3168, client.field2384.field1770);
            client.field2275.method6287(var4.field121);
            client.field2384.method2573(var4);
            return true;
         } else {
            return false;
         }
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1128619564"
   )
   static void method1887(int var0) {
      class231 var1 = (class231)class231.field3079.method1776((long)var0);
      if(var1 != null) {
         var1.method3937();
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;Lly;I)Ljava/lang/String;",
      garbageValue = "35214901"
   )
   public static String method1891(CharSequence var0, class258 var1) {
      if(var0 == null) {
         return null;
      } else {
         int var2 = 0;

         int var3;
         for(var3 = var0.length(); var2 < var3 && class143.method2641(var0.charAt(var2)); ++var2) {
            ;
         }

         while(var3 > var2 && class143.method2641(var0.charAt(var3 - 1))) {
            --var3;
         }

         int var4 = var3 - var2;
         if(var4 >= 1) {
            byte var6;
            if(var1 == null) {
               var6 = 12;
            } else {
               switch(var1.field3367) {
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
                  } else if(class25.method459(var7)) {
                     var8 = true;
                  } else {
                     char[] var9 = class13.field130;
                     int var10 = 0;

                     label97:
                     while(true) {
                        char var11;
                        if(var10 >= var9.length) {
                           var9 = class13.field132;

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
   static boolean method1886(String var0) {
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

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Ljx;",
      garbageValue = "-1122228825"
   )
   public static class104 method1889(int var0) {
      class104 var1 = (class104)class104.field1151.method1813((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class104.field1156.method4398(11, var0, -1932849649);
         var1 = new class104();
         if(var2 != null) {
            var1.method1857(new class125(var2));
         }

         var1.method1861();
         class104.field1151.method1820(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1684113654"
   )
   static void method1890() {
      class185.field2519 = 99;
      class185.field2514 = new byte[4][104][104];
      class210.field2891 = new byte[4][104][104];
      class185.field2515 = new byte[4][104][104];
      class185.field2516 = new byte[4][104][104];
      class142.field1808 = new int[4][105][105];
      class285.field3573 = new byte[4][105][105];
      class30.field286 = new int[105][105];
      class185.field2517 = new int[104];
      class74.field839 = new int[104];
      class212.field2923 = new int[104];
      class62.field735 = new int[104];
      class142.field1803 = new int[104];
   }
}
