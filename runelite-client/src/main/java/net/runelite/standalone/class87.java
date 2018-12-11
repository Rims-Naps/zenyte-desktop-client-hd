package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
public final class class87 extends class197 {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -126389271
   )
   int field939;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -743523933
   )
   int field937;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 94863971
   )
   int field936;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1880131701
   )
   int field931;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -409119541
   )
   int field933;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 40717691
   )
   int field938;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1067843887
   )
   int field930;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -537345703
   )
   int field934;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1761029311
   )
   int field940;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -707396643
   )
   int field935;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1629400255
   )
   int field943;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -426011773
   )
   int field932;

   class87() {
      this.field940 = 0;
      this.field939 = -1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)Lbm;",
      garbageValue = "22"
   )
   static class227 method1635(int var0) {
      return (class227)class38.field366.method4670((long)var0);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "2002404516"
   )
   static int method1634(int var0, class296 var1, boolean var2) {
      int var3;
      if(var0 == 4200) {
         var3 = class249.field3312[--MapCacheArchiveNames.field3811];
         class249.field3313[++class103.field1146 - 1] = class164.method3014(var3).field446;
         return 1;
      } else {
         int var4;
         class42 var5;
         if(var0 == 4201) {
            MapCacheArchiveNames.field3811 -= 2;
            var3 = class249.field3312[MapCacheArchiveNames.field3811];
            var4 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
            var5 = class164.method3014(var3);
            if(var4 >= 1 && var4 <= 5 && var5.field469[var4 - 1] != null) {
               class249.field3313[++class103.field1146 - 1] = var5.field469[var4 - 1];
            } else {
               class249.field3313[++class103.field1146 - 1] = "";
            }

            return 1;
         } else if(var0 == 4202) {
            MapCacheArchiveNames.field3811 -= 2;
            var3 = class249.field3312[MapCacheArchiveNames.field3811];
            var4 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
            var5 = class164.method3014(var3);
            if(var4 >= 1 && var4 <= 5 && var5.field455[var4 - 1] != null) {
               class249.field3313[++class103.field1146 - 1] = var5.field455[var4 - 1];
            } else {
               class249.field3313[++class103.field1146 - 1] = "";
            }

            return 1;
         } else if(var0 == 4203) {
            var3 = class249.field3312[--MapCacheArchiveNames.field3811];
            class249.field3312[++MapCacheArchiveNames.field3811 - 1] = class164.method3014(var3).field443;
            return 1;
         } else if(var0 == 4204) {
            var3 = class249.field3312[--MapCacheArchiveNames.field3811];
            class249.field3312[++MapCacheArchiveNames.field3811 - 1] = class164.method3014(var3).field435 == 1?1:0;
            return 1;
         } else {
            class42 var6;
            if(var0 == 4205) {
               var3 = class249.field3312[--MapCacheArchiveNames.field3811];
               var6 = class164.method3014(var3);
               if(var6.field456 == -1 && var6.field462 >= 0) {
                  class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var6.field462;
               } else {
                  class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3;
               }

               return 1;
            } else if(var0 == 4206) {
               var3 = class249.field3312[--MapCacheArchiveNames.field3811];
               var6 = class164.method3014(var3);
               if(var6.field456 >= 0 && var6.field462 >= 0) {
                  class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var6.field462;
               } else {
                  class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3;
               }

               return 1;
            } else if(var0 == 4207) {
               var3 = class249.field3312[--MapCacheArchiveNames.field3811];
               class249.field3312[++MapCacheArchiveNames.field3811 - 1] = class164.method3014(var3).field444?1:0;
               return 1;
            } else if(var0 == 4208) {
               var3 = class249.field3312[--MapCacheArchiveNames.field3811];
               var6 = class164.method3014(var3);
               if(var6.field475 == -1 && var6.field474 >= 0) {
                  class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var6.field474;
               } else {
                  class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3;
               }

               return 1;
            } else if(var0 == 4209) {
               var3 = class249.field3312[--MapCacheArchiveNames.field3811];
               var6 = class164.method3014(var3);
               if(var6.field475 >= 0 && var6.field474 >= 0) {
                  class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var6.field474;
               } else {
                  class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3;
               }

               return 1;
            } else if(var0 == 4210) {
               String var7 = class249.field3313[--class103.field1146];
               var4 = class249.field3312[--MapCacheArchiveNames.field3811];
               class110.method1923(var7, var4 == 1);
               class249.field3312[++MapCacheArchiveNames.field3811 - 1] = class94.field1020;
               return 1;
            } else if(var0 != 4211) {
               if(var0 == 4212) {
                  class322.field3938 = 0;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if(class109.field1193 != null && class322.field3938 < class94.field1020) {
                  class249.field3312[++MapCacheArchiveNames.field3811 - 1] = class109.field1193[++class322.field3938 - 1] & '\uffff';
               } else {
                  class249.field3312[++MapCacheArchiveNames.field3811 - 1] = -1;
               }

               return 1;
            }
         }
      }
   }
}
