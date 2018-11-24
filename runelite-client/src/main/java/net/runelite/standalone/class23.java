package net.runelite.standalone;

import java.applet.Applet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
public class class23 {
   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      signature = "[Lle;"
   )
   static class303[] field257;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = 1439132281
   )
   static int field254;
   @ObfuscatedName("i")
   static int[] field249;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1613799343
   )
   static int field247;
   @ObfuscatedName("gv")
   static int[] field255;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1274414739
   )
   int field253;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1047812733
   )
   int field250;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lhx;"
   )
   public final class58 field259;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1207766541
   )
   final int field252;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 596528353
   )
   public final int field258;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Li;"
   )
   final class107 field251;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1349931593
   )
   final int field246;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lhx;"
   )
   public final class58 field248;

   @ObfuscatedSignature(
      signature = "(ILhx;Lhx;Li;)V"
   )
   class23(int var1, class58 var2, class58 var3, class107 var4) {
      this.field258 = var1;
      this.field248 = var2;
      this.field259 = var3;
      this.field251 = var4;
      class123 var5 = class133.method2550(this.field258);
      SpritePixels var6 = var5.method2202(false);
      if(var6 != null) {
         this.field252 = var6.width;
         this.field246 = var6.height;
      } else {
         this.field252 = 0;
         this.field246 = 0;
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-2011704690"
   )
   boolean method434(int var1, int var2) {
      class123 var3 = class133.method2550(this.field258);
      switch(var3.field1673.field285) {
      case 0:
         if(var1 < this.field250 - this.field252 / 2 || var1 > this.field252 / 2 + this.field250) {
            return false;
         }
         break;
      case 1:
         if(var1 > this.field250 - this.field252 && var1 <= this.field250) {
            break;
         }

         return false;
      case 2:
         if(var1 < this.field250 || var1 >= this.field250 + this.field252) {
            return false;
         }
      }

      switch(var3.field1667.field741) {
      case 0:
         if(var2 >= this.field253 && var2 < this.field246 + this.field253) {
            break;
         }

         return false;
      case 1:
         if(var2 > this.field253 - this.field246 && var2 <= this.field253) {
            break;
         }

         return false;
      case 2:
         if(var2 < this.field253 - this.field246 / 2 || var2 > this.field246 / 2 + this.field253) {
            return false;
         }
      }

      return true;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "2123193197"
   )
   boolean method431(int var1, int var2) {
      return this.method434(var1, var2)?true:this.method433(var1, var2);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "2140575104"
   )
   boolean method433(int var1, int var2) {
      return this.field251 == null?false:(var1 >= this.field250 - this.field251.field1165 / 2 && var1 <= this.field251.field1165 / 2 + this.field250?var2 >= this.field253 && var2 <= this.field251.field1167 + this.field253:false);
   }

   @ObfuscatedName("io")
   @ObfuscatedSignature(
      signature = "(Lhw;IIIIIII)V",
      garbageValue = "-1399360833"
   )
   static final void method439(class187 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if(client.field2300) {
         client.field2221 = 32;
      } else {
         client.field2221 = 0;
      }

      client.field2300 = false;
      int var7;
      if(class163.field1983 == 1 || !class225.field3039 && class163.field1983 == 4) {
         if(var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
            var0.field2580 -= 4;
            class230.method4617(var0);
         } else if(var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
            var0.field2580 += 4;
            class230.method4617(var0);
         } else if(var5 >= var1 - client.field2221 && var5 < client.field2221 + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
            var7 = var3 * (var3 - 32) / var4;
            if(var7 < 8) {
               var7 = 8;
            }

            int var8 = var6 - var2 - 16 - var7 / 2;
            int var9 = var3 - 32 - var7;
            var0.field2580 = var8 * (var4 - var3) / var9;
            class230.method4617(var0);
            client.field2300 = true;
         }
      }

      if(client.field2395 != 0) {
         var7 = var0.field2573;
         if(var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
            var0.field2580 += client.field2395 * 45;
            class230.method4617(var0);
         }
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/applet/Applet;Ljava/lang/String;S)V",
      garbageValue = "19104"
   )
   public static void method440(Applet var0, String var1) {
      class314.field3856 = var0;
      if(var1 != null) {
         class314.field3850 = var1;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)[Lfu;",
      garbageValue = "-1420121024"
   )
   public static class329[] method442() {
      return new class329[]{class329.field3981, class329.field3974, class329.field3973, class329.field3976, class329.field3977, class329.field3978, class329.field3979, class329.field3975, class329.field3980, class329.field3982};
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "649301199"
   )
   static void method441(int var0, int var1, int var2, int var3) {
      for(class186 var4 = (class186)class186.field2540.method1503(); var4 != null; var4 = (class186)class186.field2540.method1505()) {
         if(var4.field2532 != -1 || var4.field2528 != null) {
            int var5 = 0;
            if(var1 > var4.field2539) {
               var5 += var1 - var4.field2539;
            } else if(var1 < var4.field2530) {
               var5 += var4.field2530 - var1;
            }

            if(var2 > var4.field2533) {
               var5 += var2 - var4.field2533;
            } else if(var2 < var4.field2531) {
               var5 += var4.field2531 - var2;
            }

            if(var5 - 64 <= var4.field2534 && client.field2390 != 0 && var0 == var4.field2529) {
               var5 -= 64;
               if(var5 < 0) {
                  var5 = 0;
               }

               int var6 = (var4.field2534 - var5) * client.field2390 / var4.field2534;
               if(var4.field2536 == null) {
                  if(var4.field2532 >= 0) {
                     class130 var7 = class130.method2499(class203.field2849, var4.field2532, 0);
                     if(var7 != null) {
                        class33 var8 = var7.method2509().method537(class40.field416);
                        class243 var9 = class243.method4769(var8, 100, var6);
                        var9.method4772(-1);
                        class220.field2985.method5195(var9);
                        var4.field2536 = var9;
                     }
                  }
               } else {
                  var4.field2536.method4773(var6);
               }

               if(var4.field2541 == null) {
                  if(var4.field2528 != null && (var4.field2535 -= var3) <= 0) {
                     int var11 = (int)(Math.random() * (double)var4.field2528.length);
                     class130 var12 = class130.method2499(class203.field2849, var4.field2528[var11], 0);
                     if(var12 != null) {
                        class33 var13 = var12.method2509().method537(class40.field416);
                        class243 var10 = class243.method4769(var13, 100, var6);
                        var10.method4772(0);
                        class220.field2985.method5195(var10);
                        var4.field2541 = var10;
                        var4.field2535 = var4.field2537 + (int)(Math.random() * (double)(var4.field2538 - var4.field2537));
                     }
                  }
               } else {
                  var4.field2541.method4773(var6);
                  if(!var4.field2541.method3938()) {
                     var4.field2541 = null;
                  }
               }
            } else {
               if(var4.field2536 != null) {
                  class220.field2985.method5197(var4.field2536);
                  var4.field2536 = null;
               }

               if(var4.field2541 != null) {
                  class220.field2985.method5197(var4.field2541);
                  var4.field2541 = null;
               }
            }
         }
      }

   }
}
