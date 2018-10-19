package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
public class class289 {
   @ObfuscatedName("sn")
   static short[] field3147;

   @ObfuscatedName("id")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Lhw;I)Ljava/lang/String;",
      garbageValue = "516537873"
   )
   static String method5108(String var0, class329 var1) {
      if(var0.indexOf("%") != -1) {
         for(int var2 = 1; var2 <= 5; ++var2) {
            while(true) {
               int var3 = var0.indexOf("%" + var2);
               if(var3 == -1) {
                  break;
               }

               String var4 = var0.substring(0, var3);
               int var6 = class21.method216(var1, var2 - 1);
               String var5;
               if(var6 < 999999999) {
                  var5 = Integer.toString(var6);
               } else {
                  var5 = "*";
               }

               var0 = var4 + var5 + var0.substring(var3 + 2);
            }
         }
      }

      return var0;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "849146229"
   )
   static int method5107(int var0, class252 var1, boolean var2) {
      int var4 = -1;
      class329 var3;
      if(var0 >= 2000) {
         var0 -= 1000;
         var4 = class55.field407[--class171.field1587];
         var3 = class189.getWidget(var4);
      } else {
         var3 = var2?class182.field1766:class20.field155;
      }

      if(var0 == 1100) {
         class171.field1587 -= 2;
         var3.field3565 = class55.field407[class171.field1587];
         if(var3.field3565 > var3.field3567 - var3.field3559) {
            var3.field3565 = var3.field3567 - var3.field3559;
         }

         if(var3.field3565 < 0) {
            var3.field3565 = 0;
         }

         var3.field3566 = class55.field407[class171.field1587 + 1];
         if(var3.field3566 > var3.field3568 - var3.field3560) {
            var3.field3566 = var3.field3568 - var3.field3560;
         }

         if(var3.field3566 < 0) {
            var3.field3566 = 0;
         }

         class184.method3216(var3);
         return 1;
      } else if(var0 == 1101) {
         var3.field3619 = class55.field407[--class171.field1587];
         class184.method3216(var3);
         return 1;
      } else if(var0 == 1102) {
         var3.field3573 = class55.field407[--class171.field1587] == 1;
         class184.method3216(var3);
         return 1;
      } else if(var0 == 1103) {
         var3.field3638 = class55.field407[--class171.field1587];
         class184.method3216(var3);
         return 1;
      } else if(var0 == 1104) {
         var3.field3577 = class55.field407[--class171.field1587];
         class184.method3216(var3);
         return 1;
      } else if(var0 == 1105) {
         var3.field3579 = class55.field407[--class171.field1587];
         class184.method3216(var3);
         return 1;
      } else if(var0 == 1106) {
         var3.field3578 = class55.field407[--class171.field1587];
         class184.method3216(var3);
         return 1;
      } else if(var0 == 1107) {
         var3.field3623 = class55.field407[--class171.field1587] == 1;
         class184.method3216(var3);
         return 1;
      } else if(var0 == 1108) {
         var3.field3552 = 1;
         var3.field3588 = class55.field407[--class171.field1587];
         class184.method3216(var3);
         return 1;
      } else if(var0 == 1109) {
         class171.field1587 -= 6;
         var3.field3593 = class55.field407[class171.field1587];
         var3.field3594 = class55.field407[class171.field1587 + 1];
         var3.field3673 = class55.field407[class171.field1587 + 2];
         var3.field3596 = class55.field407[class171.field1587 + 3];
         var3.field3657 = class55.field407[class171.field1587 + 4];
         var3.field3598 = class55.field407[class171.field1587 + 5];
         class184.method3216(var3);
         return 1;
      } else {
         int var8;
         if(var0 == 1110) {
            var8 = class55.field407[--class171.field1587];
            if(var8 != var3.field3591) {
               var3.field3591 = var8;
               var3.field3672 = 0;
               var3.field3649 = 0;
               class184.method3216(var3);
            }

            return 1;
         } else if(var0 == 1111) {
            var3.field3601 = class55.field407[--class171.field1587] == 1;
            class184.method3216(var3);
            return 1;
         } else if(var0 == 1112) {
            String var7 = class55.field408[--class272.field2978];
            if(!var7.equals(var3.field3605)) {
               var3.field3605 = var7;
               class184.method3216(var3);
            }

            return 1;
         } else if(var0 == 1113) {
            var3.field3628 = class55.field407[--class171.field1587];
            class184.method3216(var3);
            return 1;
         } else if(var0 == 1114) {
            class171.field1587 -= 3;
            var3.field3587 = class55.field407[class171.field1587];
            var3.field3609 = class55.field407[class171.field1587 + 1];
            var3.field3583 = class55.field407[class171.field1587 + 2];
            class184.method3216(var3);
            return 1;
         } else if(var0 == 1115) {
            var3.field3610 = class55.field407[--class171.field1587] == 1;
            class184.method3216(var3);
            return 1;
         } else if(var0 == 1116) {
            var3.field3580 = class55.field407[--class171.field1587];
            class184.method3216(var3);
            return 1;
         } else if(var0 == 1117) {
            var3.field3584 = class55.field407[--class171.field1587];
            class184.method3216(var3);
            return 1;
         } else if(var0 == 1118) {
            var3.field3585 = class55.field407[--class171.field1587] == 1;
            class184.method3216(var3);
            return 1;
         } else if(var0 == 1119) {
            var3.field3586 = class55.field407[--class171.field1587] == 1;
            class184.method3216(var3);
            return 1;
         } else if(var0 == 1120) {
            class171.field1587 -= 2;
            var3.field3567 = class55.field407[class171.field1587];
            var3.field3568 = class55.field407[class171.field1587 + 1];
            class184.method3216(var3);
            if(var4 != -1 && var3.field3546 == 0) {
               class130.method2395(class329.field3533[var4 >> 16], var3, false);
            }

            return 1;
         } else if(var0 == 1121) {
            class272.method4900(var3.field3607, var3.field3606);
            client.field3898 = var3;
            class184.method3216(var3);
            return 1;
         } else if(var0 == 1122) {
            var3.field3626 = class55.field407[--class171.field1587];
            class184.method3216(var3);
            return 1;
         } else if(var0 == 1123) {
            var3.field3570 = class55.field407[--class171.field1587];
            class184.method3216(var3);
            return 1;
         } else if(var0 == 1124) {
            var3.field3544 = class55.field407[--class171.field1587];
            class184.method3216(var3);
            return 1;
         } else if(var0 == 1125) {
            var8 = class55.field407[--class171.field1587];
            class82 var6 = (class82)class297.method5176(class303.method5216(), var8);
            if(var6 != null) {
               var3.field3574 = var6;
               class184.method3216(var3);
            }

            return 1;
         } else {
            boolean var5;
            if(var0 == 1126) {
               var5 = class55.field407[--class171.field1587] == 1;
               var3.field3604 = var5;
               return 1;
            } else if(var0 == 1127) {
               var5 = class55.field407[--class171.field1587] == 1;
               var3.field3602 = var5;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }

   @ObfuscatedName("fn")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-397167485"
   )
   static void method5106(int var0) {
      client.field3945 = 0L;
      if(var0 >= 2) {
         client.field3946 = true;
         client.resizeChanged(-1);
      } else {
         client.field3946 = false;
         client.resizeChanged(-1);
      }

      if(class319.method5597() == 1) {
         class113.field1064.method3025(765, 503);
      } else {
         class113.field1064.method3025(7680, 2160);
      }

      if(client.field3740 >= 25) {
         class123.method2265();
      }

   }
}
