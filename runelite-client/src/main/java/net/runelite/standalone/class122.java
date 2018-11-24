package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
public class class122 {
   @ObfuscatedName("p")
   public static int[] field1657;
   @ObfuscatedName("c")
   public static int[] field1659;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 456373061
   )
   static int field1661;
   @ObfuscatedName("s")
   static byte[][] field1656;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -221550889
   )
   static int field1662;
   @ObfuscatedName("a")
   static byte[][] field1658;
   @ObfuscatedName("gh")
   @ObfuscatedGetter(
      intValue = 1165786553
   )
   static int field1660;
   @ObfuscatedName("e")
   static byte[][] field1654;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 969470695
   )
   static int field1655;

   static {
      field1662 = 0;
      field1661 = 0;
      field1655 = 0;
      field1656 = new byte[1000][];
      field1654 = new byte[250][];
      field1658 = new byte[50][];
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IZI)[B",
      garbageValue = "-751191230"
   )
   static synchronized byte[] method2195(int var0, boolean var1) {
      byte[] var2;
      if(var0 != 100) {
         if(var0 < 100) {
            ;
         }
      } else if(field1662 > 0) {
         var2 = field1656[--field1662];
         field1656[field1662] = null;
         return var2;
      }

      if(var0 != 5000) {
         if(var0 < 5000) {
            ;
         }
      } else if(field1661 > 0) {
         var2 = field1654[--field1661];
         field1654[field1661] = null;
         return var2;
      }

      if(var0 != 30000) {
         if(var0 < 30000) {
            ;
         }
      } else if(field1655 > 0) {
         var2 = field1658[--field1655];
         field1658[field1655] = null;
         return var2;
      }

      if(class260.field3392 != null) {
         for(int var4 = 0; var4 < field1659.length; ++var4) {
            if(field1659[var4] != var0) {
               if(var0 < field1659[var4]) {
                  ;
               }
            } else if(field1657[var4] > 0) {
               byte[] var3 = class260.field3392[var4][--field1657[var4]];
               class260.field3392[var4][field1657[var4]] = null;
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
   public static String method2197(CharSequence var0) {
      int var1 = var0.length();
      StringBuilder var2 = new StringBuilder(var1);

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
            if(var4 == ' ') {
               var2.append('+');
            } else {
               byte var5 = class118.method2151(var4);
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
