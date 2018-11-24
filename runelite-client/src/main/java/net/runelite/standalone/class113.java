package net.runelite.standalone;

import java.awt.Font;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public class class113 extends class320 {
   @ObfuscatedName("d")
   static boolean field1296;
   @ObfuscatedName("az")
   static Font field1292;
   @ObfuscatedName("f")
   final boolean field1293;

   public class113(boolean var1) {
      this.field1293 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lkj;Lkj;I)I",
      garbageValue = "677998643"
   )
   int method2111(class62 var1, class62 var2) {
      return var2.field733 != var1.field733?(this.field1293?var1.field733 - var2.field733:var2.field733 - var1.field733):this.method6239(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method2111((class62)var1, (class62)var2);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IB)Liy;",
      garbageValue = "53"
   )
   public static class278 method2120(int var0) {
      class278 var1 = (class278)class278.field3515.method1813((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class278.field3518.method4398(16, var0, 927269169);
         var1 = new class278();
         if(var2 != null) {
            var1.method5386(new class125(var2));
         }

         class278.field3515.method1820(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Ljv;",
      garbageValue = "-1154679082"
   )
   public static class40 method2121(int var0) {
      class40 var1 = (class40)class40.field409.method1813((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class40.field418.method4398(1, var0, 70368649);
         var1 = new class40();
         if(var2 != null) {
            var1.method719(new class125(var2), var0);
         }

         var1.method721();
         class40.field409.method1820(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "826176706"
   )
   static void method2119() {
      class206.field2867 = new int[2000];
      int var0 = 0;
      int var1 = 240;

      int var3;
      for(byte var2 = 12; var0 < 16; var1 -= var2) {
         var3 = class316.method6202((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.075F + 0.425F * (float)var0 / 16.0F));
         class206.field2867[var0] = var3;
         ++var0;
      }

      var1 = 48;

      for(int var5 = var1 / 6; var0 < class206.field2867.length; var1 -= var5) {
         var3 = var0 * 2;

         for(int var4 = class316.method6202((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < class206.field2867.length; ++var0) {
            class206.field2867[var0] = var4;
         }
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-200857415"
   )
   static final int method2118(int var0, int var1) {
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
   static int method2115(CharSequence var0, int var1, boolean var2) {
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
}
