package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
public class class205 extends class309 {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   class70 field2856;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lcw;"
   )
   class262 field2858;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lhc;"
   )
   class66 field2857;

   @ObfuscatedSignature(
      signature = "(Lhc;)V"
   )
   class205(class66 var1) {
      this.field2856 = new class70();
      this.field2858 = new class262();
      this.field2857 = var1;
   }

   @ObfuscatedName("z")
   protected void vmethod6061(int var1) {
      this.field2858.vmethod6061(var1);

      for(class45 var3 = (class45)this.field2856.method1503(); var3 != null; var3 = (class45)this.field2856.method1505()) {
         if(!this.field2857.method1402(var3)) {
            int var2 = var1;

            do {
               if(var2 <= var3.field491) {
                  this.method4053(var3, var2);
                  var3.field491 -= var2;
                  break;
               }

               this.method4053(var3, var3.field491);
               var2 -= var3.field491;
            } while(!this.field2857.method1475(var3, (int[])null, 0, var2));
         }
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "()Ldm;"
   )
   protected class309 vmethod6059() {
      class45 var1;
      do {
         var1 = (class45)this.field2856.method1505();
         if(var1 == null) {
            return null;
         }
      } while(var1.field503 == null);

      return var1.field503;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "()Ldm;"
   )
   protected class309 vmethod6056() {
      class45 var1 = (class45)this.field2856.method1503();
      return (class309)(var1 == null?null:(var1.field503 != null?var1.field503:this.vmethod6059()));
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lhz;IB)V",
      garbageValue = "-51"
   )
   void method4053(class45 var1, int var2) {
      if((this.field2857.field778[var1.field494] & 4) != 0 && var1.field502 < 0) {
         int var3 = this.field2857.field783[var1.field494] / class293.field3657;
         int var4 = (var3 + 1048575 - var1.field508) / var3;
         var1.field508 = var3 * var2 + var1.field508 & 1048575;
         if(var4 <= var2) {
            if(this.field2857.field781[var1.field494] == 0) {
               var1.field503 = class243.method4771(var1.field490, var1.field503.method4785(), var1.field503.method4776(), var1.field503.method4875());
            } else {
               var1.field503 = class243.method4771(var1.field490, var1.field503.method4785(), 0, var1.field503.method4875());
               this.field2857.method1381(var1, var1.field495.field351[var1.field493] < 0);
            }

            if(var1.field495.field351[var1.field493] < 0) {
               var1.field503.method4772(-1);
            }

            var2 = var1.field508 / var3;
         }
      }

      var1.field503.vmethod6061(var2);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lhz;[IIIII)V",
      garbageValue = "-1103416882"
   )
   void method4048(class45 var1, int[] var2, int var3, int var4, int var5) {
      if((this.field2857.field778[var1.field494] & 4) != 0 && var1.field502 < 0) {
         int var6 = this.field2857.field783[var1.field494] / class293.field3657;

         while(true) {
            int var7 = (var6 + 1048575 - var1.field508) / var6;
            if(var7 > var4) {
               var1.field508 += var6 * var4;
               break;
            }

            var1.field503.vmethod6060(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.field508 += var7 * var6 - 1048576;
            int var8 = class293.field3657 / 100;
            int var9 = 262144 / var6;
            if(var9 < var8) {
               var8 = var9;
            }

            class243 var10 = var1.field503;
            if(this.field2857.field781[var1.field494] == 0) {
               var1.field503 = class243.method4771(var1.field490, var10.method4785(), var10.method4776(), var10.method4875());
            } else {
               var1.field503 = class243.method4771(var1.field490, var10.method4785(), 0, var10.method4875());
               this.field2857.method1381(var1, var1.field495.field351[var1.field493] < 0);
               var1.field503.method4781(var8, var10.method4776());
            }

            if(var1.field495.field351[var1.field493] < 0) {
               var1.field503.method4772(-1);
            }

            var10.method4783(var8);
            var10.vmethod6060(var2, var3, var5 - var3);
            if(var10.method4860()) {
               this.field2858.method5195(var10);
            }
         }
      }

      var1.field503.vmethod6060(var2, var3, var4);
   }

   @ObfuscatedName("r")
   protected int vmethod6057() {
      return 0;
   }

   @ObfuscatedName("m")
   protected void vmethod6060(int[] var1, int var2, int var3) {
      this.field2858.vmethod6060(var1, var2, var3);

      for(class45 var6 = (class45)this.field2856.method1503(); var6 != null; var6 = (class45)this.field2856.method1505()) {
         if(!this.field2857.method1402(var6)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if(var5 <= var6.field491) {
                  this.method4048(var6, var1, var4, var5, var4 + var5);
                  var6.field491 -= var5;
                  break;
               }

               this.method4048(var6, var1, var4, var6.field491, var4 + var5);
               var4 += var6.field491;
               var5 -= var6.field491;
            } while(!this.field2857.method1475(var6, var1, var4, var5));
         }
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)I",
      garbageValue = "-1004071523"
   )
   public static int method4047(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + class118.method2151(var0.charAt(var3));
      }

      return var2;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2146420868"
   )
   public static void method4050() {
      class93.field1005.method1816();
   }

   @ObfuscatedName("jb")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZB)Ljava/lang/String;",
      garbageValue = "-6"
   )
   static String method4077(String var0, boolean var1) {
      String var2 = var1?"https://":"http://";
      if(client.field2155 == 1) {
         var0 = var0 + "-wtrc";
      } else if(client.field2155 == 2) {
         var0 = var0 + "-wtqa";
      } else if(client.field2155 == 3) {
         var0 = var0 + "-wtwip";
      } else if(client.field2155 == 5) {
         var0 = var0 + "-wti";
      } else if(client.field2155 == 4) {
         var0 = "local";
      }

      String var3 = "";
      if(class193.field2752 != null) {
         var3 = "/p=" + class193.field2752;
      }

      String var4 = "runescape.com";
      return var2 + var0 + "." + var4 + "/l=" + client.field2158 + "/a=" + class23.field254 + var3 + "/";
   }
}
