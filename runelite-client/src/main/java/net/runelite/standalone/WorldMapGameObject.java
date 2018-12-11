package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("n")
public class WorldMapGameObject {
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 29952049
   )
   final int field1708;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1722255739
   )
   final int objectId;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 356522979
   )
   final int field1710;

   WorldMapGameObject(int var1, int var2, int var3) {
      this.objectId = var1;
      this.field1708 = var2;
      this.field1710 = var3;
   }

   @ObfuscatedName("gm")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-301221279"
   )
   static final void method2481(int var0, int var1) {
      if(client.field2173 == 2) {
         class103.method1855((client.field2176 - class229.field3067 << 7) + client.field2179, (client.field2320 - class35.field360 << 7) + client.field2180, client.field2423 * 2);
         if(client.field2252 > -1 && client.field2165 % 20 < 10) {
            class170.field2023[0].method215(var0 + client.field2252 - 12, client.field2253 + var1 - 28);
         }

      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)Lji;",
      garbageValue = "2064114689"
   )
   public static class315 method2480(int var0) {
      class315 var1 = (class315)class315.field3858.method1813((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class315.field3891.method4398(9, var0, 169126096);
         var1 = new class315();
         var1.field3875 = var0;
         if(var2 != null) {
            var1.method6150(new Buffer(var2));
         }

         var1.method6149();
         class315.field3858.method1820(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-21"
   )
   public static void method2483(int var0, int var1) {
      class72 var3 = (class72)class72.field827.method1813((long)var0);
      class72 var2;
      if(var3 != null) {
         var2 = var3;
      } else {
         byte[] var8 = class72.field832.method4398(14, var0, -1087065750);
         var3 = new class72();
         if(var8 != null) {
            var3.method1543(new Buffer(var8));
         }

         class72.field827.method1820(var3, (long)var0);
         var2 = var3;
      }

      int var4 = var2.field828;
      int var5 = var2.field830;
      int var6 = var2.field831;
      int var7 = class81.field899[var6 - var5];
      if(var1 < 0 || var1 > var7) {
         var1 = 0;
      }

      var7 <<= var5;
      class81.field898[var4] = class81.field898[var4] & ~var7 | var1 << var5 & var7;
      client.settingsChanged(var4);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IB)I",
      garbageValue = "-34"
   )
   public static int method2482(CharSequence var0, CharSequence var1, int var2) {
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

         var7 = class31.method527(var9);
         var8 = class31.method527(var10);
         var9 = class90.method1711(var9, var2);
         var10 = class90.method1711(var10, var2);
         if(var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
            var9 = Character.toLowerCase(var9);
            var10 = Character.toLowerCase(var10);
            if(var9 != var10) {
               return class193.method3912(var9, var2) - class193.method3912(var10, var2);
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
               return class193.method3912(var11, var2) - class193.method3912(var12, var2);
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
               return class193.method3912(var12, var2) - class193.method3912(var13, var2);
            }
         }

         return 0;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1264126601"
   )
   public static void method2484(int var0) {
      if(var0 != -1) {
         if(class210.field2893[var0]) {
            class187.field2586.method4458(var0);
            if(class187.field2547[var0] != null) {
               boolean var1 = true;

               for(int var2 = 0; var2 < class187.field2547[var0].length; ++var2) {
                  if(class187.field2547[var0][var2] != null) {
                     if(class187.field2547[var0][var2].field2560 != 2) {
                        class187.field2547[var0][var2] = null;
                     } else {
                        var1 = false;
                     }
                  }
               }

               if(var1) {
                  class187.field2547[var0] = null;
               }

               class210.field2893[var0] = false;
            }
         }
      }
   }
}
