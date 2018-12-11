package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
public class class66 extends class309 {
   @ObfuscatedName("af")
   boolean field779;
   @ObfuscatedName("k")
   int[] field782;
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "Lhm;"
   )
   class51 field786;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      longValue = -6038031989989024739L
   )
   long field767;
   @ObfuscatedName("z")
   int[] field772;
   @ObfuscatedName("p")
   int[] field771;
   @ObfuscatedName("i")
   int[] field781;
   @ObfuscatedName("c")
   int[] field770;
   @ObfuscatedName("n")
   int[] field778;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "Lhp;"
   )
   class205 field792;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 594844751
   )
   int field766;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1810487307
   )
   int field787;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   class98 field775;
   @ObfuscatedName("h")
   int[] field765;
   @ObfuscatedName("r")
   int[] field788;
   @ObfuscatedName("m")
   int[] field773;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "[[Lhz;"
   )
   class45[][] field784;
   @ObfuscatedName("x")
   int[] field776;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "[[Lhz;"
   )
   class45[][] field785;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1977262305
   )
   int field789;
   @ObfuscatedName("d")
   int[] field774;
   @ObfuscatedName("a")
   int[] field769;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      longValue = -7188249514793649391L
   )
   long field791;
   @ObfuscatedName("o")
   int[] field780;
   @ObfuscatedName("q")
   int[] field783;
   @ObfuscatedName("e")
   int[] field768;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -1062757509
   )
   int field790;

   public class66() {
      this.field766 = 256;
      this.field787 = 1000000;
      this.field768 = new int[16];
      this.field769 = new int[16];
      this.field770 = new int[16];
      this.field771 = new int[16];
      this.field788 = new int[16];
      this.field773 = new int[16];
      this.field774 = new int[16];
      this.field772 = new int[16];
      this.field776 = new int[16];
      this.field778 = new int[16];
      this.field765 = new int[16];
      this.field780 = new int[16];
      this.field781 = new int[16];
      this.field782 = new int[16];
      this.field783 = new int[16];
      this.field784 = new class45[16][128];
      this.field785 = new class45[16][128];
      this.field786 = new class51();
      this.field792 = new class205(this);
      this.field775 = new class98(128);
      this.method1388();
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(Lhz;ZI)V",
      garbageValue = "-1597523624"
   )
   void method1381(class45 var1, boolean var2) {
      int var3 = var1.field490.field307.length;
      int var4;
      if(var2 && var1.field490.field309) {
         int var5 = var3 + var3 - var1.field490.field308;
         var4 = (int)((long)var5 * (long)this.field781[var1.field494] >> 6);
         var3 <<= 8;
         if(var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.field503.method4826();
         }
      } else {
         var4 = (int)((long)this.field781[var1.field494] * (long)var3 >> 6);
      }

      var1.field503.method4778(var4);
   }

   @ObfuscatedName("z")
   protected synchronized void vmethod6061(int var1) {
      if(this.field786.method1094()) {
         int var2 = this.field786.field564 * this.field787 / class293.field3657;

         do {
            long var3 = (long)var1 * (long)var2 + this.field767;
            if(this.field791 - var3 >= 0L) {
               this.field767 = var3;
               break;
            }

            int var5 = (int)((this.field791 - this.field767 + (long)var2 - 1L) / (long)var2);
            this.field767 += (long)var5 * (long)var2;
            this.field792.vmethod6061(var5);
            var1 -= var5;
            this.method1414();
         } while(this.field786.method1094());
      }

      this.field792.vmethod6061(var1);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "()Ldm;"
   )
   protected synchronized class309 vmethod6059() {
      return null;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1492080524"
   )
   void method1389(int var1) {
      if((this.field778[var1] & 2) != 0) {
         for(class45 var2 = (class45)this.field792.field2856.method1503(); var2 != null; var2 = (class45)this.field792.field2856.method1505()) {
            if(var2.field494 == var1 && this.field784[var1][var2.field493] == null && var2.field502 < 0) {
               var2.field502 = 0;
            }
         }
      }

   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "-908964981"
   )
   void method1421(int var1, int var2, int var3) {
      this.method1370(var1, var2, 64);
      if((this.field778[var1] & 2) != 0) {
         for(class45 var4 = (class45)this.field792.field2856.method1504(); var4 != null; var4 = (class45)this.field792.field2856.method1506()) {
            if(var4.field494 == var1 && var4.field502 < 0) {
               this.field784[var1][var4.field493] = null;
               this.field784[var1][var2] = var4;
               int var5 = (var4.field497 * var4.field498 >> 12) + var4.field496;
               var4.field496 += var2 - var4.field493 << 8;
               var4.field497 = var5 - var4.field496;
               var4.field498 = 4096;
               var4.field493 = var2;
               return;
            }
         }
      }

      class35 var9 = (class35)this.field775.method1776((long)this.field788[var1]);
      if(var9 != null) {
         class33 var8 = var9.field352[var2];
         if(var8 != null) {
            class45 var6 = new class45();
            var6.field494 = var1;
            var6.field495 = var9;
            var6.field490 = var8;
            var6.field506 = var9.field356[var2];
            var6.field492 = var9.field357[var2];
            var6.field493 = var2;
            var6.field504 = var3 * var3 * var9.field354[var2] * var9.field361 + 1024 >> 11;
            var6.field507 = var9.field355[var2] & 255;
            var6.field496 = (var2 << 8) - (var9.field351[var2] & 32767);
            var6.field499 = 0;
            var6.field489 = 0;
            var6.field505 = 0;
            var6.field502 = -1;
            var6.field501 = 0;
            if(this.field781[var1] == 0) {
               var6.field503 = class243.method4771(var8, this.method1393(var6), this.method1382(var6), this.method1395(var6));
            } else {
               var6.field503 = class243.method4771(var8, this.method1393(var6), 0, this.method1395(var6));
               this.method1381(var6, var9.field351[var2] < 0);
            }

            if(var9.field351[var2] < 0) {
               var6.field503.method4772(-1);
            }

            if(var6.field492 >= 0) {
               class45 var7 = this.field785[var1][var6.field492];
               if(var7 != null && var7.field502 < 0) {
                  this.field784[var1][var7.field493] = null;
                  var7.field502 = 0;
               }

               this.field785[var1][var6.field492] = var6;
            }

            this.field792.field2856.method1499(var6);
            this.field784[var1][var2] = var6;
         }
      }
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "(Lhz;I)I",
      garbageValue = "-477399288"
   )
   int method1395(class45 var1) {
      int var2 = this.field769[var1.field494];
      return var2 < 8192?var2 * var1.field507 + 32 >> 6:16384 - ((128 - var1.field507) * (16384 - var2) + 32 >> 6);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "()Ldm;"
   )
   protected synchronized class309 vmethod6056() {
      return this.field792;
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "(Lhz;I)I",
      garbageValue = "1669351248"
   )
   int method1393(class45 var1) {
      int var2 = (var1.field497 * var1.field498 >> 12) + var1.field496;
      var2 += (this.field774[var1.field494] - 8192) * this.field780[var1.field494] >> 12;
      class67 var3 = var1.field506;
      int var4;
      if(var3.field800 > 0 && (var3.field795 > 0 || this.field772[var1.field494] > 0)) {
         var4 = var3.field795 << 2;
         int var5 = var3.field801 << 1;
         if(var1.field488 < var5) {
            var4 = var4 * var1.field488 / var5;
         }

         var4 += this.field772[var1.field494] >> 7;
         double var6 = Math.sin((double)(var1.field500 & 511) * 0.01227184630308513D);
         var2 += (int)(var6 * (double)var4);
      }

      var4 = (int)((double)(var1.field490.field310 * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)class293.field3657 + 0.5D);
      return var4 < 1?1:var4;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1870795976"
   )
   int method1394() {
      return this.field766;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "100"
   )
   synchronized void method1428() {
      for(class35 var1 = (class35)this.field775.method1783(); var1 != null; var1 = (class35)this.field775.method1779()) {
         var1.method620();
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-2083173787"
   )
   public synchronized void method1369(int var1) {
      this.field766 = var1;
   }

   @ObfuscatedName("r")
   protected synchronized int vmethod6057() {
      return 0;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-2078105163"
   )
   void method1378(int var1, int var2) {
      this.field771[var1] = var2;
      this.field773[var1] = var2 & -128;
      this.method1379(var1, var2);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-106"
   )
   void method1388() {
      this.method1386(-1);
      this.method1476(-1);

      int var1;
      for(var1 = 0; var1 < 16; ++var1) {
         this.field788[var1] = this.field771[var1];
      }

      for(var1 = 0; var1 < 16; ++var1) {
         this.field773[var1] = this.field771[var1] & -128;
      }

   }

   @ObfuscatedName("m")
   protected synchronized void vmethod6060(int[] var1, int var2, int var3) {
      if(this.field786.method1094()) {
         int var4 = this.field786.field564 * this.field787 / class293.field3657;

         do {
            long var5 = this.field767 + (long)var4 * (long)var3;
            if(this.field791 - var5 >= 0L) {
               this.field767 = var5;
               break;
            }

            int var7 = (int)((this.field791 - this.field767 + (long)var4 - 1L) / (long)var4);
            this.field767 += (long)var4 * (long)var7;
            this.field792.vmethod6060(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method1414();
         } while(this.field786.method1094());
      }

      this.field792.vmethod6060(var1, var2, var3);
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(IIIB)V",
      garbageValue = "20"
   )
   void method1383(int var1, int var2, int var3) {
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-11"
   )
   void method1391(int var1) {
      int var2 = var1 & 240;
      int var3;
      int var4;
      int var5;
      if(var2 == 128) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method1370(var3, var4, var5);
      } else if(var2 == 144) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if(var5 > 0) {
            this.method1421(var3, var4, var5);
         } else {
            this.method1370(var3, var4, 64);
         }

      } else if(var2 == 160) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method1383(var3, var4, var5);
      } else if(var2 == 176) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if(var4 == 0) {
            this.field773[var3] = (var5 << 14) + (this.field773[var3] & -2080769);
         }

         if(var4 == 32) {
            this.field773[var3] = (var5 << 7) + (this.field773[var3] & -16257);
         }

         if(var4 == 1) {
            this.field772[var3] = (var5 << 7) + (this.field772[var3] & -16257);
         }

         if(var4 == 33) {
            this.field772[var3] = var5 + (this.field772[var3] & -128);
         }

         if(var4 == 5) {
            this.field776[var3] = (var5 << 7) + (this.field776[var3] & -16257);
         }

         if(var4 == 37) {
            this.field776[var3] = var5 + (this.field776[var3] & -128);
         }

         if(var4 == 7) {
            this.field768[var3] = (var5 << 7) + (this.field768[var3] & -16257);
         }

         if(var4 == 39) {
            this.field768[var3] = var5 + (this.field768[var3] & -128);
         }

         if(var4 == 10) {
            this.field769[var3] = (var5 << 7) + (this.field769[var3] & -16257);
         }

         if(var4 == 42) {
            this.field769[var3] = var5 + (this.field769[var3] & -128);
         }

         if(var4 == 11) {
            this.field770[var3] = (var5 << 7) + (this.field770[var3] & -16257);
         }

         if(var4 == 43) {
            this.field770[var3] = var5 + (this.field770[var3] & -128);
         }

         if(var4 == 64) {
            if(var5 >= 64) {
               this.field778[var3] |= 1;
            } else {
               this.field778[var3] &= -2;
            }
         }

         if(var4 == 65) {
            if(var5 >= 64) {
               this.field778[var3] |= 2;
            } else {
               this.method1389(var3);
               this.field778[var3] &= -3;
            }
         }

         if(var4 == 99) {
            this.field765[var3] = (var5 << 7) + (this.field765[var3] & 127);
         }

         if(var4 == 98) {
            this.field765[var3] = (this.field765[var3] & 16256) + var5;
         }

         if(var4 == 101) {
            this.field765[var3] = (var5 << 7) + (this.field765[var3] & 127) + 16384;
         }

         if(var4 == 100) {
            this.field765[var3] = (this.field765[var3] & 16256) + var5 + 16384;
         }

         if(var4 == 120) {
            this.method1386(var3);
         }

         if(var4 == 121) {
            this.method1476(var3);
         }

         if(var4 == 123) {
            this.method1438(var3);
         }

         int var6;
         if(var4 == 6) {
            var6 = this.field765[var3];
            if(var6 == 16384) {
               this.field780[var3] = (var5 << 7) + (this.field780[var3] & -16257);
            }
         }

         if(var4 == 38) {
            var6 = this.field765[var3];
            if(var6 == 16384) {
               this.field780[var3] = var5 + (this.field780[var3] & -128);
            }
         }

         if(var4 == 16) {
            this.field781[var3] = (var5 << 7) + (this.field781[var3] & -16257);
         }

         if(var4 == 48) {
            this.field781[var3] = var5 + (this.field781[var3] & -128);
         }

         if(var4 == 81) {
            if(var5 >= 64) {
               this.field778[var3] |= 4;
            } else {
               this.method1390(var3);
               this.field778[var3] &= -5;
            }
         }

         if(var4 == 17) {
            this.method1392(var3, (var5 << 7) + (this.field782[var3] & -16257));
         }

         if(var4 == 49) {
            this.method1392(var3, var5 + (this.field782[var3] & -128));
         }

      } else if(var2 == 192) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.method1379(var3, var4 + this.field773[var3]);
      } else if(var2 == 208) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.method1384(var3, var4);
      } else if(var2 == 224) {
         var3 = var1 & 15;
         var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
         this.method1467(var3, var4);
      } else {
         var2 = var1 & 255;
         if(var2 == 255) {
            this.method1388();
         }
      }
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1812489578"
   )
   void method1392(int var1, int var2) {
      this.field782[var1] = var2;
      this.field783[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1113474101"
   )
   public synchronized void method1375() {
      this.field786.method1076();
      this.method1388();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1946705854"
   )
   synchronized boolean method1433() {
      return this.field786.method1094();
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1445162097"
   )
   void method1390(int var1) {
      if((this.field778[var1] & 4) != 0) {
         for(class45 var2 = (class45)this.field792.field2856.method1503(); var2 != null; var2 = (class45)this.field792.field2856.method1505()) {
            if(var2.field494 == var1) {
               var2.field508 = 0;
            }
         }
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-122"
   )
   void method1384(int var1, int var2) {
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      signature = "(Lhz;B)Z",
      garbageValue = "87"
   )
   boolean method1402(class45 var1) {
      if(var1.field503 == null) {
         if(var1.field502 >= 0) {
            var1.method3937();
            if(var1.field492 > 0 && var1 == this.field785[var1.field494][var1.field492]) {
               this.field785[var1.field494][var1.field492] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-1"
   )
   void method1467(int var1, int var2) {
      this.field774[var1] = var2;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Lhg;ZB)V",
      garbageValue = "-113"
   )
   synchronized void method1448(class240 var1, boolean var2) {
      this.method1375();
      this.field786.method1075(var1.field3143);
      this.field779 = var2;
      this.field767 = 0L;
      int var3 = this.field786.method1109();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field786.method1088(var4);
         this.field786.method1082(var4);
         this.field786.method1080(var4);
      }

      this.field790 = this.field786.method1087();
      this.field789 = this.field786.field570[this.field790];
      this.field791 = this.field786.method1086(this.field789);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "324796583"
   )
   void method1379(int var1, int var2) {
      if(var2 != this.field788[var1]) {
         this.field788[var1] = var2;

         for(int var3 = 0; var3 < 128; ++var3) {
            this.field785[var1][var3] = null;
         }
      }

   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      signature = "(Lhz;B)I",
      garbageValue = "-68"
   )
   int method1382(class45 var1) {
      class67 var2 = var1.field506;
      int var3 = this.field768[var1.field494] * this.field770[var1.field494] + 4096 >> 13;
      var3 = var3 * var3 + 16384 >> 15;
      var3 = var3 * var1.field504 + 16384 >> 15;
      var3 = var3 * this.field766 + 128 >> 8;
      if(var2.field802 > 0) {
         var3 = (int)((double)var3 * Math.pow(0.5D, 1.953125E-5D * (double)var1.field499 * (double)var2.field802) + 0.5D);
      }

      int var4;
      int var5;
      int var6;
      int var7;
      if(var2.field793 != null) {
         var4 = var1.field489;
         var5 = var2.field793[var1.field505 + 1];
         if(var1.field505 < var2.field793.length - 2) {
            var6 = (var2.field793[var1.field505] & 255) << 8;
            var7 = (var2.field793[var1.field505 + 2] & 255) << 8;
            var5 += (var4 - var6) * (var2.field793[var1.field505 + 3] - var5) / (var7 - var6);
         }

         var3 = var5 * var3 + 32 >> 6;
      }

      if(var1.field502 > 0 && var2.field794 != null) {
         var4 = var1.field502;
         var5 = var2.field794[var1.field501 + 1];
         if(var1.field501 < var2.field794.length - 2) {
            var6 = (var2.field794[var1.field501] & 255) << 8;
            var7 = (var2.field794[var1.field501 + 2] & 255) << 8;
            var5 += (var4 - var6) * (var2.field794[var1.field501 + 3] - var5) / (var7 - var6);
         }

         var3 = var3 * var5 + 32 >> 6;
      }

      return var3;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "1"
   )
   public synchronized void method1377(int var1, int var2) {
      this.method1378(var1, var2);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "2083214567"
   )
   void method1386(int var1) {
      for(class45 var2 = (class45)this.field792.field2856.method1503(); var2 != null; var2 = (class45)this.field792.field2856.method1505()) {
         if(var1 < 0 || var2.field494 == var1) {
            if(var2.field503 != null) {
               var2.field503.method4783(class293.field3657 / 100);
               if(var2.field503.method4860()) {
                  this.field792.field2858.method5195(var2.field503);
               }

               var2.method874();
            }

            if(var2.field502 < 0) {
               this.field784[var2.field494][var2.field493] = null;
            }

            var2.method3937();
         }
      }

   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      signature = "(Lhz;[IIII)Z",
      garbageValue = "-1999971207"
   )
   boolean method1475(class45 var1, int[] var2, int var3, int var4) {
      var1.field491 = class293.field3657 / 100;
      if(var1.field502 < 0 || var1.field503 != null && !var1.field503.method4786()) {
         int var5 = var1.field498;
         if(var5 > 0) {
            var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field776[var1.field494]) + 0.5D);
            if(var5 < 0) {
               var5 = 0;
            }

            var1.field498 = var5;
         }

         var1.field503.method4784(this.method1393(var1));
         class67 var6 = var1.field506;
         boolean var7 = false;
         ++var1.field488;
         var1.field500 += var6.field800;
         double var8 = 5.086263020833333E-6D * (double)((var1.field493 - 60 << 8) + (var1.field497 * var1.field498 >> 12));
         if(var6.field802 > 0) {
            if(var6.field798 > 0) {
               var1.field499 += (int)(128.0D * Math.pow(2.0D, (double)var6.field798 * var8) + 0.5D);
            } else {
               var1.field499 += 128;
            }
         }

         if(var6.field793 != null) {
            if(var6.field796 > 0) {
               var1.field489 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field796) + 0.5D);
            } else {
               var1.field489 += 128;
            }

            while(var1.field505 < var6.field793.length - 2 && var1.field489 > (var6.field793[var1.field505 + 2] & 255) << 8) {
               var1.field505 += 2;
            }

            if(var6.field793.length - 2 == var1.field505 && var6.field793[var1.field505 + 1] == 0) {
               var7 = true;
            }
         }

         if(var1.field502 >= 0 && var6.field794 != null && (this.field778[var1.field494] & 1) == 0 && (var1.field492 < 0 || var1 != this.field785[var1.field494][var1.field492])) {
            if(var6.field797 > 0) {
               var1.field502 += (int)(128.0D * Math.pow(2.0D, (double)var6.field797 * var8) + 0.5D);
            } else {
               var1.field502 += 128;
            }

            while(var1.field501 < var6.field794.length - 2 && var1.field502 > (var6.field794[var1.field501 + 2] & 255) << 8) {
               var1.field501 += 2;
            }

            if(var6.field794.length - 2 == var1.field501) {
               var7 = true;
            }
         }

         if(var7) {
            var1.field503.method4783(var1.field491);
            if(var2 != null) {
               var1.field503.vmethod6060(var2, var3, var4);
            } else {
               var1.field503.vmethod6061(var4);
            }

            if(var1.field503.method4860()) {
               this.field792.field2858.method5195(var1.field503);
            }

            var1.method874();
            if(var1.field502 >= 0) {
               var1.method3937();
               if(var1.field492 > 0 && var1 == this.field785[var1.field494][var1.field492]) {
                  this.field785[var1.field494][var1.field492] = null;
               }
            }

            return true;
         } else {
            var1.field503.method4863(var1.field491, this.method1382(var1), this.method1395(var1));
            return false;
         }
      } else {
         var1.method874();
         var1.method3937();
         if(var1.field492 > 0 && var1 == this.field785[var1.field494][var1.field492]) {
            this.field785[var1.field494][var1.field492] = null;
         }

         return true;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "1874011993"
   )
   void method1370(int var1, int var2, int var3) {
      class45 var4 = this.field784[var1][var2];
      if(var4 != null) {
         this.field784[var1][var2] = null;
         if((this.field778[var1] & 2) != 0) {
            for(class45 var5 = (class45)this.field792.field2856.method1503(); var5 != null; var5 = (class45)this.field792.field2856.method1505()) {
               if(var5.field494 == var4.field494 && var5.field502 < 0 && var5 != var4) {
                  var4.field502 = 0;
                  break;
               }
            }
         } else {
            var4.field502 = 0;
         }

      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-39"
   )
   synchronized void method1403() {
      for(class35 var1 = (class35)this.field775.method1783(); var1 != null; var1 = (class35)this.field775.method1779()) {
         var1.method3937();
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "75"
   )
   void method1476(int var1) {
      if(var1 >= 0) {
         this.field768[var1] = 12800;
         this.field769[var1] = 8192;
         this.field770[var1] = 16383;
         this.field774[var1] = 8192;
         this.field772[var1] = 0;
         this.field776[var1] = 8192;
         this.method1389(var1);
         this.method1390(var1);
         this.field778[var1] = 0;
         this.field765[var1] = 32767;
         this.field780[var1] = 256;
         this.field781[var1] = 0;
         this.method1392(var1, 8192);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.method1476(var1);
         }

      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lhg;Lik;Lct;II)Z",
      garbageValue = "-64816948"
   )
   synchronized boolean method1371(class240 var1, Js5Index var2, class259 var3, int var4) {
      var1.method4728();
      boolean var5 = true;
      int[] var6 = null;
      if(var4 > 0) {
         var6 = new int[]{var4};
      }

      for(class237 var7 = (class237)var1.field3142.method1783(); var7 != null; var7 = (class237)var1.field3142.method1779()) {
         int var8 = (int)var7.field2792;
         class35 var9 = (class35)this.field775.method1776((long)var8);
         if(var9 == null) {
            byte[] var11 = var2.method4405(var8);
            class35 var10;
            if(var11 == null) {
               var10 = null;
            } else {
               var10 = new class35(var11);
            }

            var9 = var10;
            if(var10 == null) {
               var5 = false;
               continue;
            }

            this.field775.method1775(var10, (long)var8);
         }

         if(!var9.method622(var3, var7.field3120, var6)) {
            var5 = false;
         }
      }

      if(var5) {
         var1.method4736();
      }

      return var5;
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1359219141"
   )
   void method1414() {
      int var1 = this.field790;
      int var2 = this.field789;

      long var3;
      for(var3 = this.field791; var2 == this.field789; var3 = this.field786.method1086(var2)) {
         while(var2 == this.field786.field570[var1]) {
            this.field786.method1088(var1);
            int var5 = this.field786.method1083(var1);
            if(var5 == 1) {
               this.field786.method1073();
               this.field786.method1080(var1);
               if(this.field786.method1096()) {
                  if(!this.field779 || var2 == 0) {
                     this.method1388();
                     this.field786.method1076();
                     return;
                  }

                  this.field786.method1089(var3);
               }
               break;
            }

            if((var5 & 128) != 0) {
               this.method1391(var5);
            }

            this.field786.method1082(var1);
            this.field786.method1080(var1);
         }

         var1 = this.field786.method1087();
         var2 = this.field786.field570[var1];
      }

      this.field790 = var1;
      this.field789 = var2;
      this.field791 = var3;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1327453608"
   )
   void method1438(int var1) {
      for(class45 var2 = (class45)this.field792.field2856.method1503(); var2 != null; var2 = (class45)this.field792.field2856.method1505()) {
         if((var1 < 0 || var2.field494 == var1) && var2.field502 < 0) {
            this.field784[var2.field494][var2.field493] = null;
            var2.field502 = 0;
         }
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "91"
   )
   public static void method1486() {
      class244.field3278.method1816();
      class244.field3288.method1816();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1904581367"
   )
   public static int method1485() {
      return class96.field1051;
   }
}
