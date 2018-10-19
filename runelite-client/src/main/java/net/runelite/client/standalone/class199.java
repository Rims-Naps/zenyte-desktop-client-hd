package net.runelite.client.standalone;

import java.awt.Font;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public class class199 extends class236 {
   @ObfuscatedName("az")
   static Font field1870;
   @ObfuscatedName("d")
   static boolean field1874;
   @ObfuscatedName("f")
   final boolean field1871;

   public class199(boolean var1) {
      this.field1871 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lkj;Lkj;I)I",
      garbageValue = "677998643"
   )
   int method3357(class305 var1, class305 var2) {
      return var2.field3261 != var1.field3261?(this.field1871?var1.field3261 - var2.field3261:var2.field3261 - var1.field3261):this.method4178(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method3357((class305)var1, (class305)var2);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Ljv;",
      garbageValue = "-1154679082"
   )
   public static class287 method3367(int var0) {
      class287 var1 = (class287)class287.field3114.method2268((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class287.field3123.method2579(1, var0, 70368649);
         var1 = new class287();
         if(var2 != null) {
            var1.method5066(new Buffer(var2), var0);
         }

         var1.method5068();
         class287.field3114.method2275(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "826176706"
   )
   static void method3365() {
      class219.field2133 = new int[2000];
      int var0 = 0;
      int var1 = 240;

      int var3;
      for(byte var2 = 12; var0 < 16; var1 -= var2) {
         var3 = class156.method2739((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.075F + 0.425F * (float)var0 / 16.0F));
         class219.field2133[var0] = var3;
         ++var0;
      }

      var1 = 48;

      for(int var5 = var1 / 6; var0 < class219.field2133.length; var1 -= var5) {
         var3 = var0 * 2;

         for(int var4 = class156.method2739((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < class219.field2133.length; ++var0) {
            class219.field2133[var0] = var4;
         }
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-200857415"
   )
   static final int method3364(int var0, int var1) {
      if(var0 == -2) {
         return 12345678;
      } else if(var0 == -1) {
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & 65408) + var1;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;IZB)I",
      garbageValue = "97"
   )
   static int method3361(CharSequence var0, int var1, boolean var2) {
      if(var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7);
            if(var7 == 0) {
               if(var8 == '-') {
                  var3 = true;
                  continue;
               }

               if(var8 == '+') {
                  continue;
               }
            }

            int var10;
            if(var8 >= '0' && var8 <= '9') {
               var10 = var8 - '0';
            } else if(var8 >= 'A' && var8 <= 'Z') {
               var10 = var8 - '7';
            } else {
               if(var8 < 'a' || var8 > 'z') {
                  throw new NumberFormatException();
               }

               var10 = var8 - 'W';
            }

            if(var10 >= var1) {
               throw new NumberFormatException();
            }

            if(var3) {
               var10 = -var10;
            }

            int var9 = var10 + var5 * var1;
            if(var9 / var1 != var5) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if(!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("");
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IB)Liy;",
      garbageValue = "53"
   )
   public static class309 method3366(int var0) {
      class309 var1 = (class309)class309.field3284.method2268((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class309.field3287.method2579(16, var0, 927269169);
         var1 = new class309();
         if(var2 != null) {
            var1.method5298(new Buffer(var2));
         }

         class309.field3284.method2275(var1, (long)var0);
         return var1;
      }
   }
}
