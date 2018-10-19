package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
public class class232 {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -221550889
   )
   static int field2290;
   @ObfuscatedName("gh")
   @ObfuscatedGetter(
      intValue = 1165786553
   )
   static int field2288;
   @ObfuscatedName("p")
   public static int[] field2285;
   @ObfuscatedName("c")
   public static int[] field2287;
   @ObfuscatedName("e")
   static byte[][] field2282;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 456373061
   )
   static int field2289;
   @ObfuscatedName("s")
   static byte[][] field2284;
   @ObfuscatedName("a")
   static byte[][] field2286;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 969470695
   )
   static int field2283;

   static {
      field2290 = 0;
      field2289 = 0;
      field2283 = 0;
      field2284 = new byte[1000][];
      field2282 = new byte[250][];
      field2286 = new byte[50][];
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IZI)[B",
      garbageValue = "-751191230"
   )
   static synchronized byte[] method4160(int var0, boolean var1) {
      byte[] var2;
      if(var0 != 100) {
         if(var0 < 100) {
            ;
         }
      } else if(field2290 > 0) {
         var2 = field2284[--field2290];
         field2284[field2290] = null;
         return var2;
      }

      if(var0 != 5000) {
         if(var0 < 5000) {
            ;
         }
      } else if(field2289 > 0) {
         var2 = field2282[--field2289];
         field2282[field2289] = null;
         return var2;
      }

      if(var0 != 30000) {
         if(var0 < 30000) {
            ;
         }
      } else if(field2283 > 0) {
         var2 = field2286[--field2283];
         field2286[field2283] = null;
         return var2;
      }

      if(class315.field3388 != null) {
         for(int var4 = 0; var4 < field2287.length; ++var4) {
            if(field2287[var4] != var0) {
               if(var0 < field2287[var4]) {
                  ;
               }
            } else if(field2285[var4] > 0) {
               byte[] var3 = class315.field3388[var4][--field2285[var4]];
               class315.field3388[var4][field2285[var4]] = null;
               return var3;
            }
         }
      }

      return new byte[var0];
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
      garbageValue = "967477584"
   )
   public static String method4162(CharSequence var0) {
      int var1 = var0.length();
      StringBuilder var2 = new StringBuilder(var1);

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
            if(var4 == ' ') {
               var2.append('+');
            } else {
               byte var5 = class164.method2834(var4);
               var2.append('%');
               int var6 = var5 >> 4 & 15;
               if(var6 >= 10) {
                  var2.append((char)(var6 + 55));
               } else {
                  var2.append((char)(var6 + 48));
               }

               var6 = var5 & 15;
               if(var6 >= 10) {
                  var2.append((char)(var6 + 55));
               } else {
                  var2.append((char)(var6 + 48));
               }
            }
         } else {
            var2.append(var4);
         }
      }

      return var2.toString();
   }
}
