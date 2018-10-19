package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("n")
public class class25 {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1722255739
   )
   final int field196;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 29952049
   )
   final int field197;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 356522979
   )
   final int field199;

   class25(int var1, int var2, int var3) {
      this.field196 = var1;
      this.field197 = var2;
      this.field199 = var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IB)I",
      garbageValue = "-34"
   )
   public static int method363(CharSequence var0, CharSequence var1, int var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      char var7 = 0;
      char var8 = 0;

      while(var5 - var7 < var3 || var6 - var8 < var4) {
         if(var5 - var7 >= var3) {
            return -1;
         }

         if(var6 - var8 >= var4) {
            return 1;
         }

         char var9;
         if(var7 != 0) {
            var9 = var7;
            boolean var14 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         char var10;
         if(var8 != 0) {
            var10 = var8;
            boolean var15 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         var7 = class48.method818(var9);
         var8 = class48.method818(var10);
         var9 = class54.method894(var9, var2);
         var10 = class54.method894(var10, var2);
         if(var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
            var9 = Character.toLowerCase(var9);
            var10 = Character.toLowerCase(var10);
            if(var9 != var10) {
               return class330.method5929(var9, var2) - class330.method5929(var10, var2);
            }
         }
      }

      int var16 = Math.min(var3, var4);

      char var12;
      int var17;
      for(var17 = 0; var17 < var16; ++var17) {
         char var11 = var0.charAt(var17);
         var12 = var1.charAt(var17);
         if(var12 != var11 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) {
            var11 = Character.toLowerCase(var11);
            var12 = Character.toLowerCase(var12);
            if(var12 != var11) {
               return class330.method5929(var11, var2) - class330.method5929(var12, var2);
            }
         }
      }

      var17 = var3 - var4;
      if(var17 != 0) {
         return var17;
      } else {
         for(int var18 = 0; var18 < var16; ++var18) {
            var12 = var0.charAt(var18);
            char var13 = var1.charAt(var18);
            if(var13 != var12) {
               return class330.method5929(var12, var2) - class330.method5929(var13, var2);
            }
         }

         return 0;
      }
   }

   @ObfuscatedName("gm")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-301221279"
   )
   static final void method362(int var0, int var1) {
      if(client.field3752 == 2) {
         class272.method4901((client.field3755 - class296.somex << 7) + client.field3758, (client.field3899 - class284.somey << 7) + client.field3759, client.field4002 * 2);
         if(client.field3831 > -1 && client.field3744 % 20 < 10) {
            class131.field1253[0].method378(var0 + client.field3831 - 12, client.field3832 + var1 - 28);
         }

      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1264126601"
   )
   public static void method365(int var0) {
      if(var0 != -1) {
         if(class102.field963[var0]) {
            class329.field3572.method2639(var0);
            if(class329.field3533[var0] != null) {
               boolean var1 = true;

               for(int var2 = 0; var2 < class329.field3533[var0].length; ++var2) {
                  if(class329.field3533[var0][var2] != null) {
                     if(class329.field3533[var0][var2].field3546 != 2) {
                        class329.field3533[var0][var2] = null;
                     } else {
                        var1 = false;
                     }
                  }
               }

               if(var1) {
                  class329.field3533[var0] = null;
               }

               class102.field963[var0] = false;
            }
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)Lji;",
      garbageValue = "2064114689"
   )
   public static class222 method361(int var0) {
      class222 var1 = (class222)class222.field2140.method2268((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class222.field2173.method2579(9, var0, 169126096);
         var1 = new class222();
         var1.field2157 = var0;
         if(var2 != null) {
            var1.method3949(new Buffer(var2));
         }

         var1.method3948();
         class222.field2140.method2275(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-21"
   )
   public static void method364(int var0, int var1) {
      class213 var3 = (class213)class213.field2060.method2268((long)var0);
      class213 var2;
      if(var3 != null) {
         var2 = var3;
      } else {
         byte[] var8 = class213.field2065.method2579(14, var0, -1087065750);
         var3 = new class213();
         if(var8 != null) {
            var3.method3747(new Buffer(var8));
         }

         class213.field2060.method2275(var3, (long)var0);
         var2 = var3;
      }

      int var4 = var2.field2061;
      int var5 = var2.field2063;
      int var6 = var2.field2064;
      int var7 = class215.field2072[var6 - var5];
      if(var1 < 0 || var1 > var7) {
         var1 = 0;
      }

      var7 <<= var5;
      class215.field2071[var4] = class215.field2071[var4] & ~var7 | var1 << var5 & var7;
      client.settingsChanged(var4);
   }
}
