package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
public class class82 {
   @ObfuscatedName("bw")
   static String field905;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Lio;",
      garbageValue = "104676675"
   )
   public static class94 method1603(int var0) {
      class94[] var1 = new class94[]{class94.field1019, class94.field1016, class94.field1013, class94.field1015};
      class94[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class94 var4 = var2[var3];
         if(var0 == var4.field1018) {
            return var4;
         }
      }

      return null;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([Lbu;II[I[II)V",
      garbageValue = "1871365961"
   )
   static void method1604(class88[] var0, int var1, int var2, int[] var3, int[] var4) {
      if(var1 < var2) {
         int var5 = var1 - 1;
         int var6 = var2 + 1;
         int var7 = (var2 + var1) / 2;
         class88 var8 = var0[var7];
         var0[var7] = var0[var1];
         var0[var1] = var8;

         while(var5 < var6) {
            boolean var9 = true;

            int var10;
            int var11;
            int var12;
            do {
               --var6;

               for(var10 = 0; var10 < 4; ++var10) {
                  if(var3[var10] == 2) {
                     var11 = var0[var6].field961;
                     var12 = var8.field961;
                  } else if(var3[var10] == 1) {
                     var11 = var0[var6].field952;
                     var12 = var8.field952;
                     if(var11 == -1 && var4[var10] == 1) {
                        var11 = 2001;
                     }

                     if(var12 == -1 && var4[var10] == 1) {
                        var12 = 2001;
                     }
                  } else if(var3[var10] == 3) {
                     var11 = var0[var6].method1636()?1:0;
                     var12 = var8.method1636()?1:0;
                  } else {
                     var11 = var0[var6].field958;
                     var12 = var8.field958;
                  }

                  if(var11 != var12) {
                     if((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if(var10 == 3) {
                     var9 = false;
                  }
               }
            } while(var9);

            var9 = true;

            do {
               ++var5;

               for(var10 = 0; var10 < 4; ++var10) {
                  if(var3[var10] == 2) {
                     var11 = var0[var5].field961;
                     var12 = var8.field961;
                  } else if(var3[var10] == 1) {
                     var11 = var0[var5].field952;
                     var12 = var8.field952;
                     if(var11 == -1 && var4[var10] == 1) {
                        var11 = 2001;
                     }

                     if(var12 == -1 && var4[var10] == 1) {
                        var12 = 2001;
                     }
                  } else if(var3[var10] == 3) {
                     var11 = var0[var5].method1636()?1:0;
                     var12 = var8.method1636()?1:0;
                  } else {
                     var11 = var0[var5].field958;
                     var12 = var8.field958;
                  }

                  if(var12 != var11) {
                     if((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if(var10 == 3) {
                     var9 = false;
                  }
               }
            } while(var9);

            if(var5 < var6) {
               class88 var13 = var0[var5];
               var0[var5] = var0[var6];
               var0[var6] = var13;
            }
         }

         method1604(var0, var1, var6, var3, var4);
         method1604(var0, var6 + 1, var2, var3, var4);
      }

   }
}
