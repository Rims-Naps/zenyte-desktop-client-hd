package net.runelite.client.standalone;

import java.applet.Applet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
public class class2 {
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1613799343
   )
   static int field12;
   @ObfuscatedName("gv")
   static int[] field20;
   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      signature = "[Lle;"
   )
   static class32[] field22;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = 1439132281
   )
   static int field19;
   @ObfuscatedName("i")
   static int[] field14;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 596528353
   )
   public final int field23;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1274414739
   )
   int field18;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1047812733
   )
   int field15;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1349931593
   )
   final int field11;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lhx;"
   )
   public final class34 field24;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1207766541
   )
   final int field17;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Li;"
   )
   final class275 field16;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lhx;"
   )
   public final class34 field13;

   @ObfuscatedSignature(
      signature = "(ILhx;Lhx;Li;)V"
   )
   class2(int var1, class34 var2, class34 var3, class275 var4) {
      this.field23 = var1;
      this.field13 = var2;
      this.field24 = var3;
      this.field16 = var4;
      class191 var5 = class59.method1036(this.field23);
      class26 var6 = var5.method3266(false);
      if(var6 != null) {
         this.field17 = var6.field202;
         this.field11 = var6.field201;
      } else {
         this.field17 = 0;
         this.field11 = 0;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "2123193197"
   )
   boolean method18(int var1, int var2) {
      return this.method21(var1, var2)?true:this.method20(var1, var2);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-2011704690"
   )
   boolean method21(int var1, int var2) {
      class191 var3 = class59.method1036(this.field23);
      switch(var3.field1826.field1867) {
      case 0:
         if(var1 < this.field15 - this.field17 / 2 || var1 > this.field17 / 2 + this.field15) {
            return false;
         }
         break;
      case 1:
         if(var1 > this.field15 - this.field17 && var1 <= this.field15) {
            break;
         }

         return false;
      case 2:
         if(var1 < this.field15 || var1 >= this.field15 + this.field17) {
            return false;
         }
      }

      switch(var3.field1820.field2916) {
      case 0:
         if(var2 >= this.field18 && var2 < this.field11 + this.field18) {
            break;
         }

         return false;
      case 1:
         if(var2 > this.field18 - this.field11 && var2 <= this.field18) {
            break;
         }

         return false;
      case 2:
         if(var2 < this.field18 - this.field11 / 2 || var2 > this.field11 / 2 + this.field18) {
            return false;
         }
      }

      return true;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "2140575104"
   )
   boolean method20(int var1, int var2) {
      return this.field16 == null?false:(var1 >= this.field15 - this.field16.field3004 / 2 && var1 <= this.field16.field3004 / 2 + this.field15?var2 >= this.field18 && var2 <= this.field16.field3006 + this.field18:false);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/applet/Applet;Ljava/lang/String;S)V",
      garbageValue = "19104"
   )
   public static void method27(Applet var0, String var1) {
      class7.field56 = var0;
      if(var1 != null) {
         class7.field50 = var1;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)[Lfu;",
      garbageValue = "-1420121024"
   )
   public static class251[] method29() {
      return new class251[]{class251.OBJ_UPDATE, class251.MAP_PROJANIM, class251.ATTACHED_PLAYER_OBJECT, class251.SPOTANIM_SPECIFIC, class251.LOC_ANIM, class251.AREA_SOUND, class251.LOC_DEL, class251.OBJ_DEL, class251.OBJ_ADD, class251.LOC_ADD};
   }

   @ObfuscatedName("io")
   @ObfuscatedSignature(
      signature = "(Lhw;IIIIIII)V",
      garbageValue = "-1399360833"
   )
   static final void method26(class329 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if(client.field3879) {
         client.field3800 = 32;
      } else {
         client.field3800 = 0;
      }

      client.field3879 = false;
      int var7;
      if(class226.field2223 == 1 || !class192.field1840 && class226.field2223 == 4) {
         if(var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
            var0.field3566 -= 4;
            class184.method3216(var0);
         } else if(var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
            var0.field3566 += 4;
            class184.method3216(var0);
         } else if(var5 >= var1 - client.field3800 && var5 < client.field3800 + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
            var7 = var3 * (var3 - 32) / var4;
            if(var7 < 8) {
               var7 = 8;
            }

            int var8 = var6 - var2 - 16 - var7 / 2;
            int var9 = var3 - 32 - var7;
            var0.field3566 = var8 * (var4 - var3) / var9;
            class184.method3216(var0);
            client.field3879 = true;
         }
      }

      if(client.field3974 != 0) {
         var7 = var0.field3559;
         if(var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
            var0.field3566 += client.field3974 * 45;
            class184.method3216(var0);
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "649301199"
   )
   static void method28(int var0, int var1, int var2, int var3) {
      for(class282 var4 = (class282)class282.field3050.method5604(); var4 != null; var4 = (class282)class282.field3050.method5606()) {
         if(var4.field3042 != -1 || var4.field3038 != null) {
            int var5 = 0;
            if(var1 > var4.field3049) {
               var5 += var1 - var4.field3049;
            } else if(var1 < var4.field3040) {
               var5 += var4.field3040 - var1;
            }

            if(var2 > var4.field3043) {
               var5 += var2 - var4.field3043;
            } else if(var2 < var4.field3041) {
               var5 += var4.field3041 - var2;
            }

            if(var5 - 64 <= var4.field3044 && client.field3969 != 0 && var0 == var4.field3039) {
               var5 -= 64;
               if(var5 < 0) {
                  var5 = 0;
               }

               int var6 = (var4.field3044 - var5) * client.field3969 / var4.field3044;
               if(var4.field3046 == null) {
                  if(var4.field3042 >= 0) {
                     class93 var7 = class93.method1640(class104.field971, var4.field3042, 0);
                     if(var7 != null) {
                        class58 var8 = var7.method1650().method1020(class287.field3121);
                        class243 var9 = class243.method4313(var8, 100, var6);
                        var9.method4316(-1);
                        class61.field468.method4958(var9);
                        var4.field3046 = var9;
                     }
                  }
               } else {
                  var4.field3046.method4317(var6);
               }

               if(var4.field3051 == null) {
                  if(var4.field3038 != null && (var4.field3045 -= var3) <= 0) {
                     int var11 = (int)(Math.random() * (double)var4.field3038.length);
                     class93 var12 = class93.method1640(class104.field971, var4.field3038[var11], 0);
                     if(var12 != null) {
                        class58 var13 = var12.method1650().method1020(class287.field3121);
                        class243 var10 = class243.method4313(var13, 100, var6);
                        var10.method4316(0);
                        class61.field468.method4958(var10);
                        var4.field3051 = var10;
                        var4.field3045 = var4.field3047 + (int)(Math.random() * (double)(var4.field3048 - var4.field3047));
                     }
                  }
               } else {
                  var4.field3051.method4317(var6);
                  if(!var4.field3051.method1187()) {
                     var4.field3051 = null;
                  }
               }
            } else {
               if(var4.field3046 != null) {
                  class61.field468.method4960(var4.field3046);
                  var4.field3046 = null;
               }

               if(var4.field3051 != null) {
                  class61.field468.method4960(var4.field3051);
                  var4.field3051 = null;
               }
            }
         }
      }

   }
}
