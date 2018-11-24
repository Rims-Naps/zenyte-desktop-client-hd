package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
public class class45 extends class197 {
   @ObfuscatedName("ex")
   @ObfuscatedGetter(
      intValue = 550146725
   )
   static int field509;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1995316013
   )
   int field501;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -174213225
   )
   int field499;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -901601033
   )
   int field507;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -485353269
   )
   int field504;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -2064841583
   )
   int field491;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lhy;"
   )
   class35 field495;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lcr;"
   )
   class33 field490;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -698083123
   )
   int field494;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1761968505
   )
   int field496;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1307520529
   )
   int field500;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1611019685
   )
   int field497;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1590256217
   )
   int field488;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1590996343
   )
   int field489;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 743753079
   )
   int field505;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1626363913
   )
   int field498;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -143288113
   )
   int field493;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 1497242435
   )
   int field508;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1343253807
   )
   int field502;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Ldl;"
   )
   class243 field503;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -161776469
   )
   int field492;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   class67 field506;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1734609791"
   )
   void method874() {
      this.field495 = null;
      this.field490 = null;
      this.field506 = null;
      this.field503 = null;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "452877908"
   )
   static int method875(int var0, class296 var1, boolean var2) {
      int var3;
      int var4;
      int var6;
      if(var0 == 3400) {
         class308.field3811 -= 2;
         var3 = class249.field3312[class308.field3811];
         var4 = class249.field3312[class308.field3811 + 1];
         class269 var5 = class118.method2150(var3);
         if(var5.field3467 != 's') {
            ;
         }

         for(var6 = 0; var6 < var5.field3472; ++var6) {
            if(var4 == var5.field3471[var6]) {
               class249.field3313[++class103.field1146 - 1] = var5.field3473[var6];
               var5 = null;
               break;
            }
         }

         if(var5 != null) {
            class249.field3313[++class103.field1146 - 1] = var5.field3468;
         }

         return 1;
      } else if(var0 != 3408) {
         if(var0 == 3411) {
            var3 = class249.field3312[--class308.field3811];
            class269 var10 = class118.method2150(var3);
            class249.field3312[++class308.field3811 - 1] = var10.method5317();
            return 1;
         } else {
            return 2;
         }
      } else {
         class308.field3811 -= 4;
         var3 = class249.field3312[class308.field3811];
         var4 = class249.field3312[class308.field3811 + 1];
         int var9 = class249.field3312[class308.field3811 + 2];
         var6 = class249.field3312[class308.field3811 + 3];
         class269 var7 = class118.method2150(var9);
         if(var3 == var7.field3466 && var4 == var7.field3467) {
            for(int var8 = 0; var8 < var7.field3472; ++var8) {
               if(var6 == var7.field3471[var8]) {
                  if(var4 == 115) {
                     class249.field3313[++class103.field1146 - 1] = var7.field3473[var8];
                  } else {
                     class249.field3312[++class308.field3811 - 1] = var7.field3465[var8];
                  }

                  var7 = null;
                  break;
               }
            }

            if(var7 != null) {
               if(var4 == 115) {
                  class249.field3313[++class103.field1146 - 1] = var7.field3468;
               } else {
                  class249.field3312[++class308.field3811 - 1] = var7.field3470;
               }
            }

            return 1;
         } else {
            if(var4 == 115) {
               class249.field3313[++class103.field1146 - 1] = "null";
            } else {
               class249.field3312[++class308.field3811 - 1] = 0;
            }

            return 1;
         }
      }
   }
}
