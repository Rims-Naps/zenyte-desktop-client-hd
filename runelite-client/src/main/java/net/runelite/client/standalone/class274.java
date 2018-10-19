package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
public final class class274 extends class76 {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 40717691
   )
   int field2998;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -537345703
   )
   int field2994;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -126389271
   )
   int field2999;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1067843887
   )
   int field2990;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -743523933
   )
   int field2997;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 94863971
   )
   int field2996;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1629400255
   )
   int field3003;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1880131701
   )
   int field2991;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -409119541
   )
   int field2993;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -707396643
   )
   int field2995;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -426011773
   )
   int field2992;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1761029311
   )
   int field3000;

   class274() {
      this.field3000 = 0;
      this.field2999 = -1;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "2002404516"
   )
   static int method4908(int var0, class252 var1, boolean var2) {
      int var3;
      if(var0 == 4200) {
         var3 = class55.field407[--class171.field1587];
         class55.field408[++class272.field2978 - 1] = class67.method1152(var3).field1119;
         return 1;
      } else {
         int var4;
         class120 var5;
         if(var0 == 4201) {
            class171.field1587 -= 2;
            var3 = class55.field407[class171.field1587];
            var4 = class55.field407[class171.field1587 + 1];
            var5 = class67.method1152(var3);
            if(var4 >= 1 && var4 <= 5 && var5.field1142[var4 - 1] != null) {
               class55.field408[++class272.field2978 - 1] = var5.field1142[var4 - 1];
            } else {
               class55.field408[++class272.field2978 - 1] = "";
            }

            return 1;
         } else if(var0 == 4202) {
            class171.field1587 -= 2;
            var3 = class55.field407[class171.field1587];
            var4 = class55.field407[class171.field1587 + 1];
            var5 = class67.method1152(var3);
            if(var4 >= 1 && var4 <= 5 && var5.field1128[var4 - 1] != null) {
               class55.field408[++class272.field2978 - 1] = var5.field1128[var4 - 1];
            } else {
               class55.field408[++class272.field2978 - 1] = "";
            }

            return 1;
         } else if(var0 == 4203) {
            var3 = class55.field407[--class171.field1587];
            class55.field407[++class171.field1587 - 1] = class67.method1152(var3).field1116;
            return 1;
         } else if(var0 == 4204) {
            var3 = class55.field407[--class171.field1587];
            class55.field407[++class171.field1587 - 1] = class67.method1152(var3).field1108 == 1?1:0;
            return 1;
         } else {
            class120 var6;
            if(var0 == 4205) {
               var3 = class55.field407[--class171.field1587];
               var6 = class67.method1152(var3);
               if(var6.field1129 == -1 && var6.field1135 >= 0) {
                  class55.field407[++class171.field1587 - 1] = var6.field1135;
               } else {
                  class55.field407[++class171.field1587 - 1] = var3;
               }

               return 1;
            } else if(var0 == 4206) {
               var3 = class55.field407[--class171.field1587];
               var6 = class67.method1152(var3);
               if(var6.field1129 >= 0 && var6.field1135 >= 0) {
                  class55.field407[++class171.field1587 - 1] = var6.field1135;
               } else {
                  class55.field407[++class171.field1587 - 1] = var3;
               }

               return 1;
            } else if(var0 == 4207) {
               var3 = class55.field407[--class171.field1587];
               class55.field407[++class171.field1587 - 1] = class67.method1152(var3).field1117?1:0;
               return 1;
            } else if(var0 == 4208) {
               var3 = class55.field407[--class171.field1587];
               var6 = class67.method1152(var3);
               if(var6.field1148 == -1 && var6.field1147 >= 0) {
                  class55.field407[++class171.field1587 - 1] = var6.field1147;
               } else {
                  class55.field407[++class171.field1587 - 1] = var3;
               }

               return 1;
            } else if(var0 == 4209) {
               var3 = class55.field407[--class171.field1587];
               var6 = class67.method1152(var3);
               if(var6.field1148 >= 0 && var6.field1147 >= 0) {
                  class55.field407[++class171.field1587 - 1] = var6.field1147;
               } else {
                  class55.field407[++class171.field1587 - 1] = var3;
               }

               return 1;
            } else if(var0 == 4210) {
               String var7 = class55.field408[--class272.field2978];
               var4 = class55.field407[--class171.field1587];
               class56.method992(var7, var4 == 1);
               class55.field407[++class171.field1587 - 1] = class138.field1371;
               return 1;
            } else if(var0 != 4211) {
               if(var0 == 4212) {
                  class45.field352 = 0;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if(class289.field3147 != null && class45.field352 < class138.field1371) {
                  class55.field407[++class171.field1587 - 1] = class289.field3147[++class45.field352 - 1] & '\uffff';
               } else {
                  class55.field407[++class171.field1587 - 1] = -1;
               }

               return 1;
            }
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)Lbm;",
      garbageValue = "22"
   )
   static class286 method4909(int var0) {
      return (class286)class297.field3193.method792((long)var0);
   }
}
