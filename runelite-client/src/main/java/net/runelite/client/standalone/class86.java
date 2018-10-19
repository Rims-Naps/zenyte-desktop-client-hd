package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
public class class86 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   public static final class86 field783;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   public static final class86 field779;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   public static final class86 field775;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   public static final class86 field778;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   public static final class86 field780;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   public static final class86 field776;
   @ObfuscatedName("d")
   static int[] field777;
   @ObfuscatedName("c")
   String field781;

   static {
      field783 = new class86("p11_full");
      field775 = new class86("p12_full");
      field776 = new class86("b12_full");
      field778 = new class86("verdana_11pt_regular");
      field779 = new class86("verdana_13pt_regular");
      field780 = new class86("verdana_15pt_regular");
   }

   class86(String var1) {
      this.field781 = var1;
   }

   @ObfuscatedName("jk")
   @ObfuscatedSignature(
      signature = "([Lhw;II)V",
      garbageValue = "-687373472"
   )
   static final void method1253(class329[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         class329 var3 = var0[var2];
         if(var3 != null && var3.field3563 == var1 && (!var3.field3543 || !class125.method2286(var3))) {
            int var5;
            if(var3.field3546 == 0) {
               if(!var3.field3543 && class125.method2286(var3) && var3 != class281.field3036) {
                  continue;
               }

               method1253(var0, var3.field3607);
               if(var3.field3674 != null) {
                  method1253(var3.field3674, var3.field3607);
               }

               class45 var4 = (class45)client.field3991.method5310((long)var3.field3607);
               if(var4 != null) {
                  var5 = var4.field351;
                  if(class267.method4843(var5)) {
                     method1253(class329.field3533[var5], -1);
                  }
               }
            }

            if(var3.field3546 == 6) {
               if(var3.field3591 != -1 || var3.field3592 != -1) {
                  boolean var7 = class72.method1171(var3);
                  if(var7) {
                     var5 = var3.field3592;
                  } else {
                     var5 = var3.field3591;
                  }

                  if(var5 != -1) {
                     class321 var6 = class182.method3192(var5);

                     for(var3.field3649 += client.field3989; var3.field3649 > var6.field3418[var3.field3672]; class184.method3216(var3)) {
                        var3.field3649 -= var6.field3418[var3.field3672];
                        ++var3.field3672;
                        if(var3.field3672 >= var6.field3426.length) {
                           var3.field3672 -= var6.field3420;
                           if(var3.field3672 < 0 || var3.field3672 >= var6.field3426.length) {
                              var3.field3672 = 0;
                           }
                        }
                     }
                  }
               }

               if(var3.field3600 != 0 && !var3.field3543) {
                  int var8 = var3.field3600 >> 16;
                  var5 = var3.field3600 << 16 >> 16;
                  var8 *= client.field3989;
                  var5 *= client.field3989;
                  var3.field3673 = var8 + var3.field3673 & 2047;
                  var3.field3596 = var5 + var3.field3596 & 2047;
                  class184.method3216(var3);
               }
            }
         }
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1678777503"
   )
   public static void method1254() {
      class287.field3114.method2271();
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(Lbu;I)V",
      garbageValue = "437597844"
   )
   static void method1252(class126 var0) {
      if(var0.method2288() != client.field3735) {
         client.field3735 = var0.method2288();
         class146.method2573(var0.method2288());
      }

      class143.field1395 = var0.field1195;
      client.field3785 = var0.field1198;
      client.field3733 = var0.field1193;
      class306.field3275 = client.field3734 == 0?43594:var0.field1198 + 40000;
      class118.field1082 = client.field3734 == 0?443:var0.field1198 + 50000;
      class75.field701 = class306.field3275;
   }
}
