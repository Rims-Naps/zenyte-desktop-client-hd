package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
public class class301 {
   @ObfuscatedName("pt")
   static boolean field3748;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "60"
   )
   static int method5973(int var0, int var1) {
      class231 var2 = (class231)class231.field3079.method1776((long)var0);
      return var2 == null?-1:(var1 >= 0 && var1 < var2.field3076.length?var2.field3076[var1]:-1);
   }

   @ObfuscatedName("gb")
   @ObfuscatedSignature(
      signature = "(IIIIIB)V",
      garbageValue = "-90"
   )
   static final void method5972(int var0, int var1, int var2, int var3, int var4) {
      long var5 = class269.field3464.method1951(var0, var1, var2);
      int var7;
      int var8;
      int var9;
      int var10;
      int var14;
      int var26;
      if(var5 != 0L) {
         var7 = class269.field3464.method1955(var0, var1, var2, var5);
         var8 = var7 >> 6 & 3;
         var9 = var7 & 31;
         var10 = var3;
         boolean var12 = 0L != var5;
         if(var12) {
            boolean var13 = (int)(var5 >>> 16 & 1L) == 1;
            var12 = !var13;
         }

         if(var12) {
            var10 = var4;
         }

         int[] var19 = class32.field304.pixels;
         var26 = var1 * 4 + (103 - var2) * 2048 + 24624;
         var14 = class178.method3682(var5);
         class15 var15 = class285.method5484(var14);
         if(var15.field158 != -1) {
            class303 var16 = class64.field748[var15.field158];
            if(var16 != null) {
               int var17 = (var15.field150 * 4 - var16.field3759) / 2;
               int var18 = (var15.field193 * 4 - var16.field3762) / 2;
               var16.method5980(var17 + var1 * 4 + 48, (104 - var2 - var15.field193) * 4 + var18 + 48);
            }
         } else {
            if(var9 == 0 || var9 == 2) {
               if(var8 == 0) {
                  var19[var26] = var10;
                  var19[var26 + 512] = var10;
                  var19[var26 + 1024] = var10;
                  var19[var26 + 1536] = var10;
               } else if(var8 == 1) {
                  var19[var26] = var10;
                  var19[var26 + 1] = var10;
                  var19[var26 + 2] = var10;
                  var19[var26 + 3] = var10;
               } else if(var8 == 2) {
                  var19[var26 + 3] = var10;
                  var19[var26 + 512 + 3] = var10;
                  var19[var26 + 1024 + 3] = var10;
                  var19[var26 + 1536 + 3] = var10;
               } else if(var8 == 3) {
                  var19[var26 + 1536] = var10;
                  var19[var26 + 1536 + 1] = var10;
                  var19[var26 + 1536 + 2] = var10;
                  var19[var26 + 1536 + 3] = var10;
               }
            }

            if(var9 == 3) {
               if(var8 == 0) {
                  var19[var26] = var10;
               } else if(var8 == 1) {
                  var19[var26 + 3] = var10;
               } else if(var8 == 2) {
                  var19[var26 + 1536 + 3] = var10;
               } else if(var8 == 3) {
                  var19[var26 + 1536] = var10;
               }
            }

            if(var9 == 2) {
               if(var8 == 3) {
                  var19[var26] = var10;
                  var19[var26 + 512] = var10;
                  var19[var26 + 1024] = var10;
                  var19[var26 + 1536] = var10;
               } else if(var8 == 0) {
                  var19[var26] = var10;
                  var19[var26 + 1] = var10;
                  var19[var26 + 2] = var10;
                  var19[var26 + 3] = var10;
               } else if(var8 == 1) {
                  var19[var26 + 3] = var10;
                  var19[var26 + 512 + 3] = var10;
                  var19[var26 + 1024 + 3] = var10;
                  var19[var26 + 1536 + 3] = var10;
               } else if(var8 == 2) {
                  var19[var26 + 1536] = var10;
                  var19[var26 + 1536 + 1] = var10;
                  var19[var26 + 1536 + 2] = var10;
                  var19[var26 + 1536 + 3] = var10;
               }
            }
         }
      }

      var5 = class269.field3464.method1981(var0, var1, var2);
      if(var5 != 0L) {
         var7 = class269.field3464.method1955(var0, var1, var2, var5);
         var8 = var7 >> 6 & 3;
         var9 = var7 & 31;
         var10 = class178.method3682(var5);
         class15 var20 = class285.method5484(var10);
         if(var20.field158 != -1) {
            class303 var28 = class64.field748[var20.field158];
            if(var28 != null) {
               var26 = (var20.field150 * 4 - var28.field3759) / 2;
               var14 = (var20.field193 * 4 - var28.field3762) / 2;
               var28.method5980(var26 + var1 * 4 + 48, (104 - var2 - var20.field193) * 4 + var14 + 48);
            }
         } else if(var9 == 9) {
            int var25 = 15658734;
            boolean var27 = 0L != var5;
            if(var27) {
               boolean var23 = (int)(var5 >>> 16 & 1L) == 1;
               var27 = !var23;
            }

            if(var27) {
               var25 = 15597568;
            }

            int[] var24 = class32.field304.pixels;
            int var29 = var1 * 4 + (103 - var2) * 2048 + 24624;
            if(var8 != 0 && var8 != 2) {
               var24[var29] = var25;
               var24[var29 + 1 + 512] = var25;
               var24[var29 + 1024 + 2] = var25;
               var24[var29 + 1536 + 3] = var25;
            } else {
               var24[var29 + 1536] = var25;
               var24[var29 + 1 + 1024] = var25;
               var24[var29 + 512 + 2] = var25;
               var24[var29 + 3] = var25;
            }
         }
      }

      var5 = class269.field3464.method1992(var0, var1, var2);
      if(var5 != 0L) {
         var7 = class178.method3682(var5);
         class15 var21 = class285.method5484(var7);
         if(var21.field158 != -1) {
            class303 var22 = class64.field748[var21.field158];
            if(var22 != null) {
               var10 = (var21.field150 * 4 - var22.field3759) / 2;
               int var11 = (var21.field193 * 4 - var22.field3762) / 2;
               var22.method5980(var10 + var1 * 4 + 48, var11 + (104 - var2 - var21.field193) * 4 + 48);
            }
         }
      }

   }
}
