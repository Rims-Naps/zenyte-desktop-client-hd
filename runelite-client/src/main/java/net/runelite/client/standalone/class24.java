package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
public class class24 extends class3 {
   @ObfuscatedName("af")
   boolean field182;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "Lhp;"
   )
   class163 field195;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   class310 field178;
   @ObfuscatedName("n")
   int[] field181;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      longValue = -6038031989989024739L
   )
   long field170;
   @ObfuscatedName("m")
   int[] field176;
   @ObfuscatedName("q")
   int[] field186;
   @ObfuscatedName("z")
   int[] field175;
   @ObfuscatedName("h")
   int[] field168;
   @ObfuscatedName("r")
   int[] field191;
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "Lhm;"
   )
   class304 field189;
   @ObfuscatedName("p")
   int[] field174;
   @ObfuscatedName("c")
   int[] field173;
   @ObfuscatedName("e")
   int[] field171;
   @ObfuscatedName("x")
   int[] field179;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 594844751
   )
   int field169;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -1062757509
   )
   int field193;
   @ObfuscatedName("o")
   int[] field183;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1810487307
   )
   int field190;
   @ObfuscatedName("a")
   int[] field172;
   @ObfuscatedName("k")
   int[] field185;
   @ObfuscatedName("i")
   int[] field184;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      longValue = -7188249514793649391L
   )
   long field194;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "[[Lhz;"
   )
   class75[][] field187;
   @ObfuscatedName("d")
   int[] field177;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1977262305
   )
   int field192;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "[[Lhz;"
   )
   class75[][] field188;

   public class24() {
      this.field169 = 256;
      this.field190 = 1000000;
      this.field171 = new int[16];
      this.field172 = new int[16];
      this.field173 = new int[16];
      this.field174 = new int[16];
      this.field191 = new int[16];
      this.field176 = new int[16];
      this.field177 = new int[16];
      this.field175 = new int[16];
      this.field179 = new int[16];
      this.field181 = new int[16];
      this.field168 = new int[16];
      this.field183 = new int[16];
      this.field184 = new int[16];
      this.field185 = new int[16];
      this.field186 = new int[16];
      this.field187 = new class75[16][128];
      this.field188 = new class75[16][128];
      this.field189 = new class304();
      this.field195 = new class163(this);
      this.field178 = new class310(128);
      this.method262();
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "75"
   )
   void method350(int var1) {
      if(var1 >= 0) {
         this.field171[var1] = 12800;
         this.field172[var1] = 8192;
         this.field173[var1] = 16383;
         this.field177[var1] = 8192;
         this.field175[var1] = 0;
         this.field179[var1] = 8192;
         this.method263(var1);
         this.method264(var1);
         this.field181[var1] = 0;
         this.field168[var1] = 32767;
         this.field183[var1] = 256;
         this.field184[var1] = 0;
         this.method266(var1, 8192);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.method350(var1);
         }

      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-2083173787"
   )
   public synchronized void method243(int var1) {
      this.field169 = var1;
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      signature = "(Lhz;B)Z",
      garbageValue = "87"
   )
   boolean method276(class75 var1) {
      if(var1.field695 == null) {
         if(var1.field694 >= 0) {
            var1.method1186();
            if(var1.field684 > 0 && var1 == this.field188[var1.field686][var1.field684]) {
               this.field188[var1.field686][var1.field684] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1946705854"
   )
   synchronized boolean method307() {
      return this.field189.method5238();
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1445162097"
   )
   void method264(int var1) {
      if((this.field181[var1] & 4) != 0) {
         for(class75 var2 = (class75)this.field195.field1511.method5604(); var2 != null; var2 = (class75)this.field195.field1511.method5606()) {
            if(var2.field686 == var1) {
               var2.field700 = 0;
            }
         }
      }

   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1359219141"
   )
   void method288() {
      int var1 = this.field193;
      int var2 = this.field192;

      long var3;
      for(var3 = this.field194; var2 == this.field192; var3 = this.field189.method5230(var2)) {
         while(var2 == this.field189.field3254[var1]) {
            this.field189.method5232(var1);
            int var5 = this.field189.method5227(var1);
            if(var5 == 1) {
               this.field189.method5217();
               this.field189.method5224(var1);
               if(this.field189.method5240()) {
                  if(!this.field182 || var2 == 0) {
                     this.method262();
                     this.field189.method5220();
                     return;
                  }

                  this.field189.method5233(var3);
               }
               break;
            }

            if((var5 & 128) != 0) {
               this.method265(var5);
            }

            this.field189.method5226(var1);
            this.field189.method5224(var1);
         }

         var1 = this.field189.method5231();
         var2 = this.field189.field3254[var1];
      }

      this.field193 = var1;
      this.field192 = var2;
      this.field194 = var3;
   }

   @ObfuscatedName("m")
   protected synchronized void vmethod4966(int[] var1, int var2, int var3) {
      if(this.field189.method5238()) {
         int var4 = this.field189.field3248 * this.field190 / class40.field294;

         do {
            long var5 = this.field170 + (long)var4 * (long)var3;
            if(this.field194 - var5 >= 0L) {
               this.field170 = var5;
               break;
            }

            int var7 = (int)((this.field194 - this.field170 + (long)var4 - 1L) / (long)var4);
            this.field170 += (long)var4 * (long)var7;
            this.field195.vmethod4966(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method288();
         } while(this.field189.method5238());
      }

      this.field195.vmethod4966(var1, var2, var3);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "1874011993"
   )
   void method244(int var1, int var2, int var3) {
      class75 var4 = this.field187[var1][var2];
      if(var4 != null) {
         this.field187[var1][var2] = null;
         if((this.field181[var1] & 2) != 0) {
            for(class75 var5 = (class75)this.field195.field1511.method5604(); var5 != null; var5 = (class75)this.field195.field1511.method5606()) {
               if(var5.field686 == var4.field686 && var5.field694 < 0 && var5 != var4) {
                  var4.field694 = 0;
                  break;
               }
            }
         } else {
            var4.field694 = 0;
         }

      }
   }

   @ObfuscatedName("z")
   protected synchronized void vmethod4968(int var1) {
      if(this.field189.method5238()) {
         int var2 = this.field189.field3248 * this.field190 / class40.field294;

         do {
            long var3 = (long)var1 * (long)var2 + this.field170;
            if(this.field194 - var3 >= 0L) {
               this.field170 = var3;
               break;
            }

            int var5 = (int)((this.field194 - this.field170 + (long)var2 - 1L) / (long)var2);
            this.field170 += (long)var5 * (long)var2;
            this.field195.vmethod4968(var5);
            var1 -= var5;
            this.method288();
         } while(this.field189.method5238());
      }

      this.field195.vmethod4968(var1);
   }

   @ObfuscatedName("r")
   protected synchronized int vmethod4965() {
      return 0;
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1812489578"
   )
   void method266(int var1, int var2) {
      this.field185[var1] = var2;
      this.field186[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "()Ldm;"
   )
   protected synchronized class3 vmethod4973() {
      return null;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-2078105163"
   )
   void method252(int var1, int var2) {
      this.field174[var1] = var2;
      this.field176[var1] = var2 & -128;
      this.method253(var1, var2);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "()Ldm;"
   )
   protected synchronized class3 vmethod4963() {
      return this.field195;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-39"
   )
   synchronized void method277() {
      for(class284 var1 = (class284)this.field178.method5317(); var1 != null; var1 = (class284)this.field178.method5313()) {
         var1.method1186();
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1113474101"
   )
   public synchronized void method249() {
      this.field189.method5220();
      this.method262();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1870795976"
   )
   int method268() {
      return this.field169;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-1"
   )
   void method341(int var1, int var2) {
      this.field177[var1] = var2;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "324796583"
   )
   void method253(int var1, int var2) {
      if(var2 != this.field191[var1]) {
         this.field191[var1] = var2;

         for(int var3 = 0; var3 < 128; ++var3) {
            this.field188[var1][var3] = null;
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "100"
   )
   synchronized void method302() {
      for(class284 var1 = (class284)this.field178.method5317(); var1 != null; var1 = (class284)this.field178.method5313()) {
         var1.method5028();
      }

   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "(Lhz;I)I",
      garbageValue = "1669351248"
   )
   int method267(class75 var1) {
      int var2 = (var1.field689 * var1.field690 >> 12) + var1.field688;
      var2 += (this.field177[var1.field686] - 8192) * this.field183[var1.field686] >> 12;
      class136 var3 = var1.field698;
      int var4;
      if(var3.field1357 > 0 && (var3.field1352 > 0 || this.field175[var1.field686] > 0)) {
         var4 = var3.field1352 << 2;
         int var5 = var3.field1358 << 1;
         if(var1.field680 < var5) {
            var4 = var4 * var1.field680 / var5;
         }

         var4 += this.field175[var1.field686] >> 7;
         double var6 = Math.sin((double)(var1.field692 & 511) * 0.01227184630308513D);
         var2 += (int)(var6 * (double)var4);
      }

      var4 = (int)((double)(var1.field682.field461 * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)class40.field294 + 0.5D);
      return var4 < 1?1:var4;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "1"
   )
   public synchronized void method251(int var1, int var2) {
      this.method252(var1, var2);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-106"
   )
   void method262() {
      this.method260(-1);
      this.method350(-1);

      int var1;
      for(var1 = 0; var1 < 16; ++var1) {
         this.field191[var1] = this.field174[var1];
      }

      for(var1 = 0; var1 < 16; ++var1) {
         this.field176[var1] = this.field174[var1] & -128;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lhg;Lik;Lct;II)Z",
      garbageValue = "-64816948"
   )
   synchronized boolean method245(class144 var1, class148 var2, class52 var3, int var4) {
      var1.method2545();
      boolean var5 = true;
      int[] var6 = null;
      if(var4 > 0) {
         var6 = new int[]{var4};
      }

      for(class158 var7 = (class158)var1.field1396.method5317(); var7 != null; var7 = (class158)var1.field1396.method5313()) {
         int var8 = (int)var7.field704;
         class284 var9 = (class284)this.field178.method5310((long)var8);
         if(var9 == null) {
            byte[] var11 = var2.method2586(var8);
            class284 var10;
            if(var11 == null) {
               var10 = null;
            } else {
               var10 = new class284(var11);
            }

            var9 = var10;
            if(var10 == null) {
               var5 = false;
               continue;
            }

            this.field178.method5309(var10, (long)var8);
         }

         if(!var9.method5030(var3, var7.field1498, var6)) {
            var5 = false;
         }
      }

      if(var5) {
         var1.method2553();
      }

      return var5;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(Lhz;ZI)V",
      garbageValue = "-1597523624"
   )
   void method255(class75 var1, boolean var2) {
      int var3 = var1.field682.field458.length;
      int var4;
      if(var2 && var1.field682.field460) {
         int var5 = var3 + var3 - var1.field682.field459;
         var4 = (int)((long)var5 * (long)this.field184[var1.field686] >> 6);
         var3 <<= 8;
         if(var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.field695.method4370();
         }
      } else {
         var4 = (int)((long)this.field184[var1.field686] * (long)var3 >> 6);
      }

      var1.field695.method4322(var4);
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-11"
   )
   void method265(int var1) {
      int var2 = var1 & 240;
      int var3;
      int var4;
      int var5;
      if(var2 == 128) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method244(var3, var4, var5);
      } else if(var2 == 144) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if(var5 > 0) {
            this.method295(var3, var4, var5);
         } else {
            this.method244(var3, var4, 64);
         }

      } else if(var2 == 160) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method257(var3, var4, var5);
      } else if(var2 == 176) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if(var4 == 0) {
            this.field176[var3] = (var5 << 14) + (this.field176[var3] & -2080769);
         }

         if(var4 == 32) {
            this.field176[var3] = (var5 << 7) + (this.field176[var3] & -16257);
         }

         if(var4 == 1) {
            this.field175[var3] = (var5 << 7) + (this.field175[var3] & -16257);
         }

         if(var4 == 33) {
            this.field175[var3] = var5 + (this.field175[var3] & -128);
         }

         if(var4 == 5) {
            this.field179[var3] = (var5 << 7) + (this.field179[var3] & -16257);
         }

         if(var4 == 37) {
            this.field179[var3] = var5 + (this.field179[var3] & -128);
         }

         if(var4 == 7) {
            this.field171[var3] = (var5 << 7) + (this.field171[var3] & -16257);
         }

         if(var4 == 39) {
            this.field171[var3] = var5 + (this.field171[var3] & -128);
         }

         if(var4 == 10) {
            this.field172[var3] = (var5 << 7) + (this.field172[var3] & -16257);
         }

         if(var4 == 42) {
            this.field172[var3] = var5 + (this.field172[var3] & -128);
         }

         if(var4 == 11) {
            this.field173[var3] = (var5 << 7) + (this.field173[var3] & -16257);
         }

         if(var4 == 43) {
            this.field173[var3] = var5 + (this.field173[var3] & -128);
         }

         if(var4 == 64) {
            if(var5 >= 64) {
               this.field181[var3] |= 1;
            } else {
               this.field181[var3] &= -2;
            }
         }

         if(var4 == 65) {
            if(var5 >= 64) {
               this.field181[var3] |= 2;
            } else {
               this.method263(var3);
               this.field181[var3] &= -3;
            }
         }

         if(var4 == 99) {
            this.field168[var3] = (var5 << 7) + (this.field168[var3] & 127);
         }

         if(var4 == 98) {
            this.field168[var3] = (this.field168[var3] & 16256) + var5;
         }

         if(var4 == 101) {
            this.field168[var3] = (var5 << 7) + (this.field168[var3] & 127) + 16384;
         }

         if(var4 == 100) {
            this.field168[var3] = (this.field168[var3] & 16256) + var5 + 16384;
         }

         if(var4 == 120) {
            this.method260(var3);
         }

         if(var4 == 121) {
            this.method350(var3);
         }

         if(var4 == 123) {
            this.method312(var3);
         }

         int var6;
         if(var4 == 6) {
            var6 = this.field168[var3];
            if(var6 == 16384) {
               this.field183[var3] = (var5 << 7) + (this.field183[var3] & -16257);
            }
         }

         if(var4 == 38) {
            var6 = this.field168[var3];
            if(var6 == 16384) {
               this.field183[var3] = var5 + (this.field183[var3] & -128);
            }
         }

         if(var4 == 16) {
            this.field184[var3] = (var5 << 7) + (this.field184[var3] & -16257);
         }

         if(var4 == 48) {
            this.field184[var3] = var5 + (this.field184[var3] & -128);
         }

         if(var4 == 81) {
            if(var5 >= 64) {
               this.field181[var3] |= 4;
            } else {
               this.method264(var3);
               this.field181[var3] &= -5;
            }
         }

         if(var4 == 17) {
            this.method266(var3, (var5 << 7) + (this.field185[var3] & -16257));
         }

         if(var4 == 49) {
            this.method266(var3, var5 + (this.field185[var3] & -128));
         }

      } else if(var2 == 192) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.method253(var3, var4 + this.field176[var3]);
      } else if(var2 == 208) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.method258(var3, var4);
      } else if(var2 == 224) {
         var3 = var1 & 15;
         var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
         this.method341(var3, var4);
      } else {
         var2 = var1 & 255;
         if(var2 == 255) {
            this.method262();
         }
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1492080524"
   )
   void method263(int var1) {
      if((this.field181[var1] & 2) != 0) {
         for(class75 var2 = (class75)this.field195.field1511.method5604(); var2 != null; var2 = (class75)this.field195.field1511.method5606()) {
            if(var2.field686 == var1 && this.field187[var1][var2.field685] == null && var2.field694 < 0) {
               var2.field694 = 0;
            }
         }
      }

   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "-908964981"
   )
   void method295(int var1, int var2, int var3) {
      this.method244(var1, var2, 64);
      if((this.field181[var1] & 2) != 0) {
         for(class75 var4 = (class75)this.field195.field1511.method5605(); var4 != null; var4 = (class75)this.field195.field1511.method5607()) {
            if(var4.field686 == var1 && var4.field694 < 0) {
               this.field187[var1][var4.field685] = null;
               this.field187[var1][var2] = var4;
               int var5 = (var4.field689 * var4.field690 >> 12) + var4.field688;
               var4.field688 += var2 - var4.field685 << 8;
               var4.field689 = var5 - var4.field688;
               var4.field690 = 4096;
               var4.field685 = var2;
               return;
            }
         }
      }

      class284 var9 = (class284)this.field178.method5310((long)this.field191[var1]);
      if(var9 != null) {
         class58 var8 = var9.field3055[var2];
         if(var8 != null) {
            class75 var6 = new class75();
            var6.field686 = var1;
            var6.field687 = var9;
            var6.field682 = var8;
            var6.field698 = var9.field3059[var2];
            var6.field684 = var9.field3060[var2];
            var6.field685 = var2;
            var6.field696 = var3 * var3 * var9.field3057[var2] * var9.field3064 + 1024 >> 11;
            var6.field699 = var9.field3058[var2] & 255;
            var6.field688 = (var2 << 8) - (var9.field3054[var2] & 32767);
            var6.field691 = 0;
            var6.field681 = 0;
            var6.field697 = 0;
            var6.field694 = -1;
            var6.field693 = 0;
            if(this.field184[var1] == 0) {
               var6.field695 = class243.method4315(var8, this.method267(var6), this.method256(var6), this.method269(var6));
            } else {
               var6.field695 = class243.method4315(var8, this.method267(var6), 0, this.method269(var6));
               this.method255(var6, var9.field3054[var2] < 0);
            }

            if(var9.field3054[var2] < 0) {
               var6.field695.method4316(-1);
            }

            if(var6.field684 >= 0) {
               class75 var7 = this.field188[var1][var6.field684];
               if(var7 != null && var7.field694 < 0) {
                  this.field187[var1][var7.field685] = null;
                  var7.field694 = 0;
               }

               this.field188[var1][var6.field684] = var6;
            }

            this.field195.field1511.method5600(var6);
            this.field187[var1][var2] = var6;
         }
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1327453608"
   )
   void method312(int var1) {
      for(class75 var2 = (class75)this.field195.field1511.method5604(); var2 != null; var2 = (class75)this.field195.field1511.method5606()) {
         if((var1 < 0 || var2.field686 == var1) && var2.field694 < 0) {
            this.field187[var2.field686][var2.field685] = null;
            var2.field694 = 0;
         }
      }

   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      signature = "(Lhz;[IIII)Z",
      garbageValue = "-1999971207"
   )
   boolean method349(class75 var1, int[] var2, int var3, int var4) {
      var1.field683 = class40.field294 / 100;
      if(var1.field694 < 0 || var1.field695 != null && !var1.field695.method4330()) {
         int var5 = var1.field690;
         if(var5 > 0) {
            var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field179[var1.field686]) + 0.5D);
            if(var5 < 0) {
               var5 = 0;
            }

            var1.field690 = var5;
         }

         var1.field695.method4328(this.method267(var1));
         class136 var6 = var1.field698;
         boolean var7 = false;
         ++var1.field680;
         var1.field692 += var6.field1357;
         double var8 = 5.086263020833333E-6D * (double)((var1.field685 - 60 << 8) + (var1.field689 * var1.field690 >> 12));
         if(var6.field1359 > 0) {
            if(var6.field1355 > 0) {
               var1.field691 += (int)(128.0D * Math.pow(2.0D, (double)var6.field1355 * var8) + 0.5D);
            } else {
               var1.field691 += 128;
            }
         }

         if(var6.field1350 != null) {
            if(var6.field1353 > 0) {
               var1.field681 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field1353) + 0.5D);
            } else {
               var1.field681 += 128;
            }

            while(var1.field697 < var6.field1350.length - 2 && var1.field681 > (var6.field1350[var1.field697 + 2] & 255) << 8) {
               var1.field697 += 2;
            }

            if(var6.field1350.length - 2 == var1.field697 && var6.field1350[var1.field697 + 1] == 0) {
               var7 = true;
            }
         }

         if(var1.field694 >= 0 && var6.field1351 != null && (this.field181[var1.field686] & 1) == 0 && (var1.field684 < 0 || var1 != this.field188[var1.field686][var1.field684])) {
            if(var6.field1354 > 0) {
               var1.field694 += (int)(128.0D * Math.pow(2.0D, (double)var6.field1354 * var8) + 0.5D);
            } else {
               var1.field694 += 128;
            }

            while(var1.field693 < var6.field1351.length - 2 && var1.field694 > (var6.field1351[var1.field693 + 2] & 255) << 8) {
               var1.field693 += 2;
            }

            if(var6.field1351.length - 2 == var1.field693) {
               var7 = true;
            }
         }

         if(var7) {
            var1.field695.method4327(var1.field683);
            if(var2 != null) {
               var1.field695.vmethod4966(var2, var3, var4);
            } else {
               var1.field695.vmethod4968(var4);
            }

            if(var1.field695.method4404()) {
               this.field195.field1513.method4958(var1.field695);
            }

            var1.method1180();
            if(var1.field694 >= 0) {
               var1.method1186();
               if(var1.field684 > 0 && var1 == this.field188[var1.field686][var1.field684]) {
                  this.field188[var1.field686][var1.field684] = null;
               }
            }

            return true;
         } else {
            var1.field695.method4407(var1.field683, this.method256(var1), this.method269(var1));
            return false;
         }
      } else {
         var1.method1180();
         var1.method1186();
         if(var1.field684 > 0 && var1 == this.field188[var1.field686][var1.field684]) {
            this.field188[var1.field686][var1.field684] = null;
         }

         return true;
      }
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "(Lhz;I)I",
      garbageValue = "-477399288"
   )
   int method269(class75 var1) {
      int var2 = this.field172[var1.field686];
      return var2 < 8192?var2 * var1.field699 + 32 >> 6:16384 - ((128 - var1.field699) * (16384 - var2) + 32 >> 6);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "2083214567"
   )
   void method260(int var1) {
      for(class75 var2 = (class75)this.field195.field1511.method5604(); var2 != null; var2 = (class75)this.field195.field1511.method5606()) {
         if(var1 < 0 || var2.field686 == var1) {
            if(var2.field695 != null) {
               var2.field695.method4327(class40.field294 / 100);
               if(var2.field695.method4404()) {
                  this.field195.field1513.method4958(var2.field695);
               }

               var2.method1180();
            }

            if(var2.field694 < 0) {
               this.field187[var2.field686][var2.field685] = null;
            }

            var2.method1186();
         }
      }

   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      signature = "(Lhz;B)I",
      garbageValue = "-68"
   )
   int method256(class75 var1) {
      class136 var2 = var1.field698;
      int var3 = this.field171[var1.field686] * this.field173[var1.field686] + 4096 >> 13;
      var3 = var3 * var3 + 16384 >> 15;
      var3 = var3 * var1.field696 + 16384 >> 15;
      var3 = var3 * this.field169 + 128 >> 8;
      if(var2.field1359 > 0) {
         var3 = (int)((double)var3 * Math.pow(0.5D, 1.953125E-5D * (double)var1.field691 * (double)var2.field1359) + 0.5D);
      }

      int var4;
      int var5;
      int var6;
      int var7;
      if(var2.field1350 != null) {
         var4 = var1.field681;
         var5 = var2.field1350[var1.field697 + 1];
         if(var1.field697 < var2.field1350.length - 2) {
            var6 = (var2.field1350[var1.field697] & 255) << 8;
            var7 = (var2.field1350[var1.field697 + 2] & 255) << 8;
            var5 += (var4 - var6) * (var2.field1350[var1.field697 + 3] - var5) / (var7 - var6);
         }

         var3 = var5 * var3 + 32 >> 6;
      }

      if(var1.field694 > 0 && var2.field1351 != null) {
         var4 = var1.field694;
         var5 = var2.field1351[var1.field693 + 1];
         if(var1.field693 < var2.field1351.length - 2) {
            var6 = (var2.field1351[var1.field693] & 255) << 8;
            var7 = (var2.field1351[var1.field693 + 2] & 255) << 8;
            var5 += (var4 - var6) * (var2.field1351[var1.field693 + 3] - var5) / (var7 - var6);
         }

         var3 = var3 * var5 + 32 >> 6;
      }

      return var3;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(IIIB)V",
      garbageValue = "20"
   )
   void method257(int var1, int var2, int var3) {
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Lhg;ZB)V",
      garbageValue = "-113"
   )
   synchronized void method322(class144 var1, boolean var2) {
      this.method249();
      this.field189.method5219(var1.field1397);
      this.field182 = var2;
      this.field170 = 0L;
      int var3 = this.field189.method5253();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field189.method5232(var4);
         this.field189.method5226(var4);
         this.field189.method5224(var4);
      }

      this.field193 = this.field189.method5231();
      this.field192 = this.field189.field3254[this.field193];
      this.field194 = this.field189.method5230(this.field192);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-122"
   )
   void method258(int var1, int var2) {
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "91"
   )
   public static void method360() {
      class14.field123.method2271();
      class14.field133.method2271();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1904581367"
   )
   public static int method359() {
      return class135.field1343;
   }
}
