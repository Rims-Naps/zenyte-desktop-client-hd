package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
public class class75 extends class76 {
   @ObfuscatedName("ex")
   @ObfuscatedGetter(
      intValue = 550146725
   )
   static int field701;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1995316013
   )
   int field693;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -698083123
   )
   int field686;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 743753079
   )
   int field697;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -2064841583
   )
   int field683;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1611019685
   )
   int field689;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -174213225
   )
   int field691;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1761968505
   )
   int field688;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -901601033
   )
   int field699;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1307520529
   )
   int field692;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -485353269
   )
   int field696;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -161776469
   )
   int field684;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1590256217
   )
   int field680;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Ldl;"
   )
   class243 field695;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1590996343
   )
   int field681;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lhy;"
   )
   class284 field687;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 1497242435
   )
   int field700;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lcr;"
   )
   class58 field682;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -143288113
   )
   int field685;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1343253807
   )
   int field694;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   class136 field698;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1626363913
   )
   int field690;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1734609791"
   )
   void method1180() {
      this.field687 = null;
      this.field682 = null;
      this.field698 = null;
      this.field695 = null;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "452877908"
   )
   static int method1181(int var0, class252 var1, boolean var2) {
      int var3;
      int var4;
      int var6;
      if(var0 == 3400) {
         class171.field1587 -= 2;
         var3 = class55.field407[class171.field1587];
         var4 = class55.field407[class171.field1587 + 1];
         class258 var5 = class164.method2833(var3);
         if(var5.field2569 != 's') {
            ;
         }

         for(var6 = 0; var6 < var5.field2574; ++var6) {
            if(var4 == var5.field2573[var6]) {
               class55.field408[++class272.field2978 - 1] = var5.field2575[var6];
               var5 = null;
               break;
            }
         }

         if(var5 != null) {
            class55.field408[++class272.field2978 - 1] = var5.field2570;
         }

         return 1;
      } else if(var0 != 3408) {
         if(var0 == 3411) {
            var3 = class55.field407[--class171.field1587];
            class258 var10 = class164.method2833(var3);
            class55.field407[++class171.field1587 - 1] = var10.method4651();
            return 1;
         } else {
            return 2;
         }
      } else {
         class171.field1587 -= 4;
         var3 = class55.field407[class171.field1587];
         var4 = class55.field407[class171.field1587 + 1];
         int var9 = class55.field407[class171.field1587 + 2];
         var6 = class55.field407[class171.field1587 + 3];
         class258 var7 = class164.method2833(var9);
         if(var3 == var7.field2568 && var4 == var7.field2569) {
            for(int var8 = 0; var8 < var7.field2574; ++var8) {
               if(var6 == var7.field2573[var8]) {
                  if(var4 == 115) {
                     class55.field408[++class272.field2978 - 1] = var7.field2575[var8];
                  } else {
                     class55.field407[++class171.field1587 - 1] = var7.field2567[var8];
                  }

                  var7 = null;
                  break;
               }
            }

            if(var7 != null) {
               if(var4 == 115) {
                  class55.field408[++class272.field2978 - 1] = var7.field2570;
               } else {
                  class55.field407[++class171.field1587 - 1] = var7.field2572;
               }
            }

            return 1;
         } else {
            if(var4 == 115) {
               class55.field408[++class272.field2978 - 1] = "null";
            } else {
               class55.field407[++class171.field1587 - 1] = 0;
            }

            return 1;
         }
      }
   }
}
