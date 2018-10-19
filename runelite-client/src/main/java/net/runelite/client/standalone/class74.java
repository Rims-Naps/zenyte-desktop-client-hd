package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
public class class74 {
   @ObfuscatedName("bw")
   static String field679;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Lio;",
      garbageValue = "104676675"
   )
   public static class138 method1178(int var0) {
      class138[] var1 = new class138[]{class138.field1370, class138.field1367, class138.field1364, class138.field1366};
      class138[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class138 var4 = var2[var3];
         if(var0 == var4.field1369) {
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
   static void method1179(class126[] var0, int var1, int var2, int[] var3, int[] var4) {
      if(var1 < var2) {
         int var5 = var1 - 1;
         int var6 = var2 + 1;
         int var7 = (var2 + var1) / 2;
         class126 var8 = var0[var7];
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
                     var11 = var0[var6].field1201;
                     var12 = var8.field1201;
                  } else if(var3[var10] == 1) {
                     var11 = var0[var6].field1192;
                     var12 = var8.field1192;
                     if(var11 == -1 && var4[var10] == 1) {
                        var11 = 2001;
                     }

                     if(var12 == -1 && var4[var10] == 1) {
                        var12 = 2001;
                     }
                  } else if(var3[var10] == 3) {
                     var11 = var0[var6].method2288()?1:0;
                     var12 = var8.method2288()?1:0;
                  } else {
                     var11 = var0[var6].field1198;
                     var12 = var8.field1198;
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
                     var11 = var0[var5].field1201;
                     var12 = var8.field1201;
                  } else if(var3[var10] == 1) {
                     var11 = var0[var5].field1192;
                     var12 = var8.field1192;
                     if(var11 == -1 && var4[var10] == 1) {
                        var11 = 2001;
                     }

                     if(var12 == -1 && var4[var10] == 1) {
                        var12 = 2001;
                     }
                  } else if(var3[var10] == 3) {
                     var11 = var0[var5].method2288()?1:0;
                     var12 = var8.method2288()?1:0;
                  } else {
                     var11 = var0[var5].field1198;
                     var12 = var8.field1198;
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
               class126 var13 = var0[var5];
               var0[var5] = var0[var6];
               var0[var6] = var13;
            }
         }

         method1179(var0, var1, var6, var3, var4);
         method1179(var0, var6 + 1, var2, var3, var4);
      }

   }
}
