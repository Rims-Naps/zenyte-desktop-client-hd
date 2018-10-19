package net.runelite.client.standalone;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("k")
public class class261 {
   @ObfuscatedName("dq")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class108 field2898;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lgq;"
   )
   public static class119 field2899;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lhx;"
   )
   static final class34 field2901;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lgq;"
   )
   public static class119 field2890;
   @ObfuscatedName("j")
   HashMap field2896;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -451375885
   )
   int field2897;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -81783129
   )
   int field2895;
   @ObfuscatedName("z")
   LinkedList field2903;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1839357723
   )
   int field2892;
   @ObfuscatedName("b")
   final HashMap field2900;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1838639537
   )
   int field2902;
   @ObfuscatedName("g")
   List field2886;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Ld;"
   )
   class319 field2894;

   static {
      field2890 = new class119(37748736, 256);
      field2899 = new class119(256, 256);
      field2901 = new class34();
   }

   class261(int var1, int var2, int var3, HashMap var4) {
      this.field2892 = var1;
      this.field2895 = var2;
      this.field2903 = new LinkedList();
      this.field2886 = new LinkedList();
      this.field2896 = new HashMap();
      this.field2902 = var3 | -16777216;
      this.field2900 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(IILb;Lo;I)I",
      garbageValue = "-173206436"
   )
   int method4686(int var1, int var2, class153 var3, class184 var4) {
      return var3.field1461[0][var1][var2] == 0?this.field2902:var4.method3214(var1, var2);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(Lif;IIIII)V",
      garbageValue = "837564636"
   )
   void method4691(class191 var1, int var2, int var3, int var4, int var5) {
      class26 var6 = var1.method3266(false);
      if(var6 != null) {
         var6.method378(var2 - var6.field202 / 2, var3 - var6.field201 / 2);
         if(var4 % var5 < var5 / 2) {
            class89.method1538(var2, var3, 15, 16776960, 128);
            class89.method1538(var2, var3, 7, 16777215, 256);
         }

      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(IIIIII)Ljava/util/List;",
      garbageValue = "390437180"
   )
   List method4791(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var6 = new LinkedList();
      if(var4 >= var1 && var5 >= var2) {
         if(var4 < var3 + var1 && var5 < var3 + var2) {
            Iterator var7 = this.field2896.values().iterator();

            class2 var8;
            while(var7.hasNext()) {
               var8 = (class2)var7.next();
               if(var8.method18(var4, var5)) {
                  var6.add(var8);
               }
            }

            var7 = this.field2886.iterator();

            while(var7.hasNext()) {
               var8 = (class2)var7.next();
               if(var8.method18(var4, var5)) {
                  var6.add(var8);
               }
            }

            return var6;
         } else {
            return var6;
         }
      } else {
         return var6;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(Las;[Lk;[Lle;Lo;S)V",
      garbageValue = "-12000"
   )
   void method4676(class102 var1, class261[] var2, class32[] var3, class184 var4) {
      int var5;
      int var6;
      for(var5 = 0; var5 < 64; ++var5) {
         for(var6 = 0; var6 < 64; ++var6) {
            this.method4688(var5, var6, this.field2894, var1, var4);
            this.method4680(var5, var6, this.field2894, var1);
         }
      }

      for(var5 = 0; var5 < 64; ++var5) {
         for(var6 = 0; var6 < 64; ++var6) {
            this.method4735(var5, var6, this.field2894, var1, var3);
         }
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(IS)Lif;",
      garbageValue = "8305"
   )
   class191 method4700(int var1) {
      class172 var2 = class152.method2696(var1);
      if(var2.field1631 != null) {
         var2 = var2.method2898();
         if(var2 == null) {
            return null;
         }
      }

      return var2.field1590 != -1?class59.method1036(var2.field1590):null;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(IILjava/util/HashSet;IB)V",
      garbageValue = "-102"
   )
   void method4756(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      float var6 = var5 / 2.0F;
      Iterator var7 = this.field2896.entrySet().iterator();

      while(var7.hasNext()) {
         Entry var8 = (Entry)var7.next();
         class34 var9 = (class34)var8.getKey();
         int var10 = (int)((float)var9.field268 * var5 + (float)var1 - var6);
         int var11 = (int)((float)(var2 + var4) - (float)var9.field266 * var5 - var6);
         class2 var12 = (class2)var8.getValue();
         if(var12 != null) {
            var12.field15 = var10;
            var12.field18 = var11;
            class191 var13 = class59.method1036(var12.field23);
            if(!var3.contains(Integer.valueOf(var13.method3268()))) {
               this.method4692(var12, var10, var11, var5);
            }
         }
      }

   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(IILjava/util/HashSet;IB)V",
      garbageValue = "2"
   )
   void method4695(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      Iterator var6 = this.field2886.iterator();

      while(var6.hasNext()) {
         class2 var7 = (class2)var6.next();
         int var8 = var7.field24.field268 % 64;
         int var9 = var7.field24.field266 % 64;
         var7.field15 = (int)((float)var8 * var5 + (float)var1);
         var7.field18 = (int)((float)var2 + (float)(63 - var9) * var5);
         if(!var3.contains(Integer.valueOf(var7.field23))) {
            this.method4692(var7, var7.field15, var7.field18, var5);
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Ljava/util/List;I)V",
      garbageValue = "-2053212279"
   )
   void method4672(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         class10 var3 = (class10)var2.next();
         if(var3.field83.field268 >> 6 == this.field2892 && var3.field83.field266 >> 6 == this.field2895) {
            class2 var4 = new class2(var3.field82, var3.field83, var3.field83, this.method4701(var3.field82));
            this.field2886.add(var4);
         }
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "([Lk;B)Lo;",
      garbageValue = "1"
   )
   class184 method4679(class261[] var1) {
      class296 var2 = new class296(64, 64);
      if(this.field2894 != null) {
         this.method4684(0, 0, 64, 64, this.field2894, var2);
      } else {
         Iterator var3 = this.field2903.iterator();

         while(var3.hasNext()) {
            class268 var4 = (class268)var3.next();
            this.method4684(var4.method4861() * 8, var4.method4854() * 8, 8, 8, var4, var2);
         }
      }

      this.method4721(var1, var2);
      class184 var5 = new class184();
      var5.method3211(var2);
      return var5;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIILjava/util/HashSet;I)V",
      garbageValue = "209732074"
   )
   void method4770(int var1, int var2, int var3, HashSet var4) {
      if(var4 == null) {
         var4 = new HashSet();
      }

      this.method4756(var1, var2, var4, var3);
      this.method4695(var1, var2, var4, var3);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(IIIILb;I)V",
      garbageValue = "1204222033"
   )
   void method4671(int var1, int var2, int var3, int var4, class153 var5) {
      for(int var6 = var1; var6 < var3 + var1; ++var6) {
         label54:
         for(int var7 = var2; var7 < var2 + var4; ++var7) {
            class34 var8 = new class34(0, var6, var7);

            for(int var9 = 0; var9 < var5.field1460; ++var9) {
               class25[] var10 = var5.field1470[var9][var6][var7];
               if(var10 != null && var10.length != 0) {
                  class25[] var11 = var10;

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     class25 var13 = var11[var12];
                     class191 var14 = this.method4700(var13.field196);
                     if(var14 != null) {
                        class34 var15 = new class34(var9, this.field2892 * 64 + var6, this.field2895 * 64 + var7);
                        class34 var16 = null;
                        if(this.field2894 != null) {
                           var16 = new class34(this.field2894.field1467 + var9, var6 + this.field2894.field1471 * 64, var7 + this.field2894.field1465 * 64);
                        } else {
                           class268 var17 = (class268)var5;
                           var16 = new class34(var9 + var17.field1467, var6 + var17.field1471 * 64 + var17.method4851() * 8, var17.field1465 * 64 + var7 + var17.method4870() * 8);
                        }

                        class2 var18 = new class2(var14.field1835, var16, var15, this.method4702(var14));
                        this.field2896.put(var8, var18);
                        continue label54;
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(IIIIIILk;Lam;B)V",
      garbageValue = "109"
   )
   void method4685(int var1, int var2, int var3, int var4, int var5, int var6, class261 var7, class296 var8) {
      for(int var9 = 0; var9 < var5; ++var9) {
         for(int var10 = 0; var10 < var6; ++var10) {
            int var11 = var7.method4706(var9 + var1, var10 + var2);
            if(var11 != -1) {
               class287 var12 = class199.method3367(var11);
               var8.method5147(var3 + var9, var10 + var4, 5, var12);
            }
         }
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(Lif;III)V",
      garbageValue = "34597031"
   )
   void method4731(class191 var1, int var2, int var3) {
      class26 var4 = var1.method3266(false);
      if(var4 != null) {
         int var5 = this.method4733(var4, var1.field1826);
         int var6 = this.method4699(var4, var1.field1820);
         var4.method378(var5 + var2, var3 + var6);
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Ljava/util/HashSet;Ljava/util/List;I)V",
      garbageValue = "296004276"
   )
   void method4670(HashSet var1, List var2) {
      this.field2896.clear();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         class268 var4 = (class268)var3.next();
         if(var4.method2702() == this.field2892 && var4.method2703() == this.field2895) {
            this.field2903.add(var4);
            this.method4671(var4.method4861() * 8, var4.method4854() * 8, 8, 8, var4);
         }
      }

      this.method4672(var2);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(IILb;Las;[Lle;I)V",
      garbageValue = "1794470870"
   )
   void method4735(int var1, int var2, class153 var3, class102 var4, class32[] var5) {
      this.method4812(var1, var2, var3);
      this.method4687(var1, var2, var3, var5);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(Lif;S)Li;",
      garbageValue = "300"
   )
   class275 method4702(class191 var1) {
      if(var1.field1821 != null && this.field2900 != null && this.field2900.get(class169.field1568) != null) {
         int var3 = var1.field1825;
         class169[] var4 = new class169[]{class169.field1568, class169.field1561, class169.field1560};
         class169[] var5 = var4;
         int var6 = 0;

         class169 var2;
         while(true) {
            if(var6 >= var5.length) {
               var2 = null;
               break;
            }

            class169 var7 = var5[var6];
            if(var3 == var7.field1563) {
               var2 = var7;
               break;
            }

            ++var6;
         }

         if(var2 == null) {
            return null;
         } else {
            class277 var14 = (class277)this.field2900.get(var2);
            if(var14 == null) {
               return null;
            } else {
               var6 = var14.method3523(var1.field1821, 1000000);
               String[] var15 = new String[var6];
               var14.method3521(var1.field1821, (int[])null, var15);
               int var8 = var15.length * var14.field2015 / 2;
               int var9 = 0;
               String[] var10 = var15;

               for(int var11 = 0; var11 < var10.length; ++var11) {
                  String var12 = var10[var11];
                  int var13 = var14.method3601(var12);
                  if(var13 > var9) {
                     var9 = var13;
                  }
               }

               return new class275(var1.field1821, var9, var8, var2);
            }
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(IILb;I)V",
      garbageValue = "946373230"
   )
   void method4697(int var1, int var2, class153 var3) {
      field2901.method566(0, var1, var2);

      for(int var4 = 0; var4 < var3.field1460; ++var4) {
         class25[] var5 = var3.field1470[var4][var1][var2];
         if(var5 != null && var5.length != 0) {
            class25[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               class25 var8 = var6[var7];
               class191 var9 = this.method4700(var8.field196);
               if(var9 != null) {
                  class2 var10 = (class2)this.field2896.get(field2901);
                  if(var10 != null) {
                     if(var9.field1835 != var10.field23) {
                        class2 var16 = new class2(var9.field1835, var10.field13, var10.field24, this.method4702(var9));
                        this.field2896.put(new class34(field2901), var16);
                        var10 = var16;
                     }

                     int var15 = var10.field13.field267 - var10.field24.field267;
                     var10.field24.field267 = var4;
                     var10.field13.field267 = var15 + var4;
                     return;
                  }

                  class34 var11 = new class34(var4, this.field2892 * 64 + var1, this.field2895 * 64 + var2);
                  class34 var12 = null;
                  if(this.field2894 != null) {
                     var12 = new class34(this.field2894.field1467 + var4, this.field2894.field1471 * 64 + var1, var2 + this.field2894.field1465 * 64);
                  } else {
                     Iterator var13 = this.field2903.iterator();

                     while(var13.hasNext()) {
                        class268 var14 = (class268)var13.next();
                        if(var14.method4850(var1, var2)) {
                           var12 = new class34(var4 + var14.field1467, var14.field1471 * 64 + var1 + var14.method4851() * 8, var2 + var14.field1465 * 64 + var14.method4870() * 8);
                           break;
                        }
                     }
                  }

                  if(var12 != null) {
                     var10 = new class2(var9.field1835, var12, var11, this.method4702(var9));
                     this.field2896.put(new class34(field2901), var10);
                     return;
                  }
               }
            }
         }
      }

      this.field2896.remove(field2901);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Ld;Ljava/util/List;I)V",
      garbageValue = "395616986"
   )
   void method4669(class319 var1, List var2) {
      this.field2896.clear();
      this.field2894 = var1;
      this.method4671(0, 0, 64, 64, this.field2894);
      this.method4672(var2);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "-1372308550"
   )
   void method4668(int var1, int var2, int var3) {
      class26 var4 = class222.method3988(this.field2892, this.field2895, this.field2897);
      if(var4 != null) {
         if(var3 == this.field2897 * 64) {
            var4.method376(var1, var2);
         } else {
            var4.method427(var1, var2, var3, var3);
         }

      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Ljava/util/HashSet;III)V",
      garbageValue = "1388066070"
   )
   void method4709(HashSet var1, int var2, int var3) {
      Iterator var4 = this.field2896.values().iterator();

      while(var4.hasNext()) {
         class2 var5 = (class2)var4.next();
         if(var1.contains(Integer.valueOf(var5.field23))) {
            class191 var6 = class59.method1036(var5.field23);
            this.method4691(var6, var5.field15, var5.field18, var2, var3);
         }
      }

      this.method4690(var1, var2, var3);
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(IILb;[Lle;B)V",
      garbageValue = "-125"
   )
   void method4687(int var1, int var2, class153 var3, class32[] var4) {
      for(int var5 = 0; var5 < var3.field1460; ++var5) {
         class25[] var6 = var3.field1470[var5][var1][var2];
         if(var6 != null && var6.length != 0) {
            class25[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               class25 var9 = var7[var8];
               if(class205.method3491(var9.field197) || class10.method116(var9.field197)) {
                  class172 var10 = class152.method2696(var9.field196);
                  if(var10.field1600 != -1) {
                     if(var10.field1600 != 46 && var10.field1600 != 52) {
                        var4[var10.field1600].method542(this.field2897 * var1, this.field2897 * (63 - var2), this.field2897 * 2, this.field2897 * 2);
                     } else {
                        var4[var10.field1600].method542(this.field2897 * var1, this.field2897 * (63 - var2), this.field2897 * 2 + 1, this.field2897 * 2 + 1);
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(Llp;Ljp;I)I",
      garbageValue = "849389753"
   )
   int method4733(class26 var1, class198 var2) {
      switch(var2.field1867) {
      case 0:
         return -var1.field202 / 2;
      case 1:
         return 0;
      default:
         return -var1.field202;
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(IB)Li;",
      garbageValue = "2"
   )
   class275 method4701(int var1) {
      class191 var2 = class59.method1036(var1);
      return this.method4702(var2);
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-1658116130"
   )
   void method4705(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if(var3 == 0) {
         class89.method1600(this.field2897 * var1, this.field2897 * (63 - var2), this.field2897, var4);
      }

      if(var3 == 1) {
         class89.method1607(this.field2897 * var1, this.field2897 * (63 - var2), this.field2897, var4);
      }

      if(var3 == 2) {
         class89.method1600(this.field2897 + this.field2897 * var1 - 1, this.field2897 * (63 - var2), this.field2897, var4);
      }

      if(var3 == 3) {
         class89.method1607(this.field2897 * var1, this.field2897 * (63 - var2) + this.field2897 - 1, this.field2897, var4);
      }

   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(IILb;Las;Lo;B)V",
      garbageValue = "30"
   )
   void method4688(int var1, int var2, class153 var3, class102 var4, class184 var5) {
      int var6 = var3.field1461[0][var1][var2] - 1;
      int var7 = var3.field1462[0][var1][var2] - 1;
      if(var6 == -1 && var7 == -1) {
         class89.method1561(this.field2897 * var1, this.field2897 * (63 - var2), this.field2897, this.field2897, this.field2902);
      }

      int var8 = 16711935;
      if(var7 != -1) {
         var8 = class268.method4875(var7, this.field2902);
      }

      if(var7 > -1 && var3.field1463[0][var1][var2] == 0) {
         class89.method1561(this.field2897 * var1, this.field2897 * (63 - var2), this.field2897, this.field2897, var8);
      } else {
         int var9 = this.method4686(var1, var2, var3, var5);
         if(var7 == -1) {
            class89.method1561(this.field2897 * var1, this.field2897 * (63 - var2), this.field2897, this.field2897, var9);
         } else {
            var4.method1720(this.field2897 * var1, this.field2897 * (63 - var2), var9, var8, this.field2897, this.field2897, var3.field1463[0][var1][var2], var3.field1464[0][var1][var2]);
         }
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Las;[Lle;Lo;I)V",
      garbageValue = "827191858"
   )
   void method4677(class102 var1, class32[] var2, class184 var3) {
      Iterator var4 = this.field2903.iterator();

      class268 var5;
      int var6;
      int var7;
      while(var4.hasNext()) {
         var5 = (class268)var4.next();

         for(var6 = var5.method4861() * 8; var6 < var5.method4861() * 8 + 8; ++var6) {
            for(var7 = var5.method4854() * 8; var7 < var5.method4854() * 8 + 8; ++var7) {
               this.method4688(var6, var7, var5, var1, var3);
               this.method4680(var6, var7, var5, var1);
            }
         }
      }

      var4 = this.field2903.iterator();

      while(var4.hasNext()) {
         var5 = (class268)var4.next();

         for(var6 = var5.method4861() * 8; var6 < var5.method4861() * 8 + 8; ++var6) {
            for(var7 = var5.method4854() * 8; var7 < var5.method4854() * 8 + 8; ++var7) {
               this.method4735(var6, var7, var5, var1, var2);
            }
         }
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2047299227"
   )
   void method4667() {
      if(this.field2894 != null) {
         for(int var1 = 0; var1 < 64; ++var1) {
            for(int var2 = 0; var2 < 64; ++var2) {
               this.method4697(var1, var2, this.field2894);
            }
         }
      } else {
         Iterator var5 = this.field2903.iterator();

         while(var5.hasNext()) {
            class268 var6 = (class268)var5.next();

            for(int var3 = var6.method4861() * 8; var3 < var6.method4861() * 8 + 8; ++var3) {
               for(int var4 = var6.method4854() * 8; var4 < var6.method4854() * 8 + 8; ++var4) {
                  this.method4697(var3, var4, var6);
               }
            }
         }
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1458113715"
   )
   int method4706(int var1, int var2) {
      if(this.field2894 != null) {
         return this.field2894.method2701(var1, var2);
      } else {
         if(!this.field2903.isEmpty()) {
            Iterator var3 = this.field2903.iterator();

            while(var3.hasNext()) {
               class268 var4 = (class268)var3.next();
               if(var4.method4850(var1, var2)) {
                  return var4.method2701(var1, var2);
               }
            }
         }

         return -1;
      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(II[Lk;S)Lo;",
      garbageValue = "9639"
   )
   class184 method4681(int var1, int var2, class261[] var3) {
      class184 var4 = class87.method1325(var1, var2);
      if(var4 == null) {
         var4 = this.method4679(var3);
         class119 var5 = field2899;
         long var7 = (long)(0 | var1 << 8 | var2);
         var5.method2136(var4, var7);
      }

      return var4;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(Laf;IIFB)V",
      garbageValue = "-121"
   )
   void method4692(class2 var1, int var2, int var3, float var4) {
      class191 var5 = class59.method1036(var1.field23);
      this.method4731(var5, var2, var3);
      this.method4694(var1, var5, var2, var3, var4);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(IILb;Las;I)V",
      garbageValue = "-1033742365"
   )
   void method4680(int var1, int var2, class153 var3, class102 var4) {
      for(int var5 = 1; var5 < var3.field1460; ++var5) {
         int var6 = var3.field1462[var5][var1][var2] - 1;
         if(var6 > -1) {
            int var7 = class268.method4875(var6, this.field2902);
            if(var3.field1463[var5][var1][var2] == 0) {
               class89.method1561(this.field2897 * var1, this.field2897 * (63 - var2), this.field2897, this.field2897, var7);
            } else {
               var4.method1720(this.field2897 * var1, this.field2897 * (63 - var2), 0, var7, this.field2897, this.field2897, var3.field1463[var5][var1][var2], var3.field1464[var5][var1][var2]);
            }
         }
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(I)Ljava/util/List;",
      garbageValue = "-1823690673"
   )
   List method4730() {
      LinkedList var1 = new LinkedList();
      var1.addAll(this.field2886);
      var1.addAll(this.field2896.values());
      return var1;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Llp;Liz;I)I",
      garbageValue = "-1555212344"
   )
   int method4699(class26 var1, class264 var2) {
      switch(var2.field2916) {
      case 1:
         return 0;
      case 2:
         return -var1.field201 / 2;
      default:
         return -var1.field201;
      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(Ljava/util/HashSet;IIB)V",
      garbageValue = "-65"
   )
   void method4690(HashSet var1, int var2, int var3) {
      Iterator var4 = this.field2886.iterator();

      while(var4.hasNext()) {
         class2 var5 = (class2)var4.next();
         class191 var6 = class59.method1036(var5.field23);
         if(var6 != null && var1.contains(Integer.valueOf(var6.method3268()))) {
            this.method4691(var6, var5.field15, var5.field18, var2, var3);
         }
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "([Lk;Lam;I)V",
      garbageValue = "1222996099"
   )
   void method4721(class261[] var1, class296 var2) {
      class311[] var3 = new class311[]{class311.field3297, class311.field3300, class311.field3295, class311.field3298, class311.field3299, class311.field3304, class311.field3302, class311.field3294};
      class311[] var5 = var3;

      for(int var6 = 0; var6 < var5.length; ++var6) {
         class311 var7 = var5[var6];
         if(var1[var7.vmethod5937()] != null) {
            byte var8 = 0;
            byte var9 = 0;
            byte var10 = 64;
            byte var11 = 64;
            byte var12 = 0;
            byte var13 = 0;
            switch(var7.field3301) {
            case 0:
               var9 = 59;
               var11 = 5;
               var8 = 59;
               var10 = 5;
               break;
            case 1:
               var12 = 59;
               var10 = 5;
               break;
            case 2:
               var13 = 59;
               var11 = 5;
               var8 = 59;
               var10 = 5;
               break;
            case 3:
               var9 = 59;
               var11 = 5;
               var12 = 59;
               var10 = 5;
               break;
            case 4:
               var8 = 59;
               var10 = 5;
               break;
            case 5:
               var9 = 59;
               var11 = 5;
               break;
            case 6:
               var13 = 59;
               var11 = 5;
               break;
            case 7:
               var12 = 59;
               var13 = 59;
               var10 = 5;
               var11 = 5;
            }

            this.method4685(var12, var13, var8, var9, var10, var11, var1[var7.vmethod5937()], var2);
         }
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(ILas;[Lk;[Lle;B)V",
      garbageValue = "8"
   )
   void method4781(int var1, class102 var2, class261[] var3, class32[] var4) {
      this.field2897 = var1;
      if(this.field2894 != null || !this.field2903.isEmpty()) {
         if(class222.method3988(this.field2892, this.field2895, var1) == null) {
            class184 var5 = this.method4681(this.field2892, this.field2895, var3);
            class26 var6 = new class26(this.field2897 * 64, this.field2897 * 64);
            var6.method467();
            if(this.field2894 != null) {
               this.method4676(var2, var3, var4, var5);
            } else {
               this.method4677(var2, var4, var5);
            }

            class68.method1158(var6, this.field2892, this.field2895, this.field2897);
         }
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(IILb;I)V",
      garbageValue = "-240020829"
   )
   void method4812(int var1, int var2, class153 var3) {
      for(int var4 = 0; var4 < var3.field1460; ++var4) {
         class25[] var5 = var3.field1470[var4][var1][var2];
         if(var5 != null && var5.length != 0) {
            class25[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               class25 var8 = var6[var7];
               if(class260.method4666(var8.field197)) {
                  class172 var9 = class152.method2696(var8.field196);
                  int var10 = var9.field1609 != 0?-3407872:-3355444;
                  if(var8.field197 == class331.field3700.field3721) {
                     this.method4705(var1, var2, var8.field199, var10);
                  }

                  if(var8.field197 == class331.field3702.field3721) {
                     this.method4705(var1, var2, var8.field199, -3355444);
                     this.method4705(var1, var2, var8.field199 + 1, var10);
                  }

                  if(var8.field197 == class331.field3710.field3721) {
                     if(var8.field199 == 0) {
                        class89.method1607(this.field2897 * var1, this.field2897 * (63 - var2), 1, var10);
                     }

                     if(var8.field199 == 1) {
                        class89.method1607(this.field2897 * var1 + this.field2897 - 1, this.field2897 * (63 - var2), 1, var10);
                     }

                     if(var8.field199 == 2) {
                        class89.method1607(this.field2897 + this.field2897 * var1 - 1, this.field2897 * (63 - var2) + this.field2897 - 1, 1, var10);
                     }

                     if(var8.field199 == 3) {
                        class89.method1607(this.field2897 * var1, this.field2897 * (63 - var2) + this.field2897 - 1, 1, var10);
                     }
                  }

                  if(var8.field197 == class331.field3720.field3721) {
                     int var11 = var8.field199 % 2;
                     int var12;
                     if(var11 == 0) {
                        for(var12 = 0; var12 < this.field2897; ++var12) {
                           class89.method1607(var12 + this.field2897 * var1, (64 - var2) * this.field2897 - 1 - var12, 1, var10);
                        }
                     } else {
                        for(var12 = 0; var12 < this.field2897; ++var12) {
                           class89.method1607(var12 + this.field2897 * var1, var12 + this.field2897 * (63 - var2), 1, var10);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(Laf;Lif;IIFB)V",
      garbageValue = "7"
   )
   void method4694(class2 var1, class191 var2, int var3, int var4, float var5) {
      if(var1.field16 != null) {
         if(var1.field16.field3007.method2873(var5)) {
            class277 var6 = (class277)this.field2900.get(var1.field16.field3007);
            var6.method3579(var1.field16.field3005, var3 - var1.field16.field3004 / 2, var4, var1.field16.field3004, var1.field16.field3006, -16777216 | var2.field1818, 0, 1, 0, var6.field2015 / 2);
         }
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(IIIILb;Lam;I)V",
      garbageValue = "1251786460"
   )
   void method4684(int var1, int var2, int var3, int var4, class153 var5, class296 var6) {
      for(int var7 = var1; var7 < var3 + var1; ++var7) {
         for(int var8 = var2; var8 < var2 + var4; ++var8) {
            int var9 = var5.field1461[0][var7][var8] - 1;
            if(var9 != -1) {
               class287 var10 = class199.method3367(var9);
               var6.method5147(var7, var8, 5, var10);
            }
         }
      }

   }

   @ObfuscatedName("jg")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "12"
   )
   static final void method4673(int var0) {
      class54.method895();
      class63.method1109();
      int var1 = class199.method3366(var0).field3282;
      if(var1 != 0) {
         int var2 = class215.field2071[var0];
         if(var1 == 1) {
            if(var2 == 1) {
               class257.method4575(0.9D);
               ((class254)class257.field2539).method4542(0.9D);
            }

            if(var2 == 2) {
               class257.method4575(0.8D);
               ((class254)class257.field2539).method4542(0.8D);
            }

            if(var2 == 3) {
               class257.method4575(0.7D);
               ((class254)class257.field2539).method4542(0.7D);
            }

            if(var2 == 4) {
               class257.method4575(0.6D);
               ((class254)class257.field2539).method4542(0.6D);
            }

            class109.method1835();
         }

         if(var1 == 3) {
            short var3 = 0;
            if(var2 == 0) {
               var3 = 255;
            }

            if(var2 == 1) {
               var3 = 192;
            }

            if(var2 == 2) {
               var3 = 128;
            }

            if(var2 == 3) {
               var3 = 64;
            }

            if(var2 == 4) {
               var3 = 0;
            }

            if(var3 != client.field3965) {
               if(client.field3965 == 0 && client.field3907 != -1) {
                  class136.method2511(client.field4007, client.field3907, 0, var3, false);
                  client.field3972 = false;
               } else if(var3 == 0) {
                  class227.field2234.method249();
                  class227.field2232 = 1;
                  class53.field391 = null;
                  client.field3972 = false;
               } else if(class227.field2232 != 0) {
                  class78.field720 = var3;
               } else {
                  class227.field2234.method243(var3);
               }

               client.field3965 = var3;
            }
         }

         if(var1 == 4) {
            if(var2 == 0) {
               client.field3968 = 127;
            }

            if(var2 == 1) {
               client.field3968 = 96;
            }

            if(var2 == 2) {
               client.field3968 = 64;
            }

            if(var2 == 3) {
               client.field3968 = 32;
            }

            if(var2 == 4) {
               client.field3968 = 0;
            }
         }

         if(var1 == 5) {
            client.field3867 = var2;
         }

         if(var1 == 6) {
            client.field3896 = var2;
         }

         if(var1 == 9) {
            client.field3897 = var2;
         }

         if(var1 == 10) {
            if(var2 == 0) {
               client.field3969 = 127;
            }

            if(var2 == 1) {
               client.field3969 = 96;
            }

            if(var2 == 2) {
               client.field3969 = 64;
            }

            if(var2 == 3) {
               client.field3969 = 32;
            }

            if(var2 == 4) {
               client.field3969 = 0;
            }
         }

         if(var1 == 17) {
            client.field3902 = var2 & 65535;
         }

         class113[] var4;
         if(var1 == 18) {
            var4 = new class113[]{class113.field1061, class113.field1060, class113.field1059, class113.field1065};
            client.field3760 = (class113)class297.method5176(var4, var2);
            if(client.field3760 == null) {
               client.field3760 = class113.field1059;
            }
         }

         if(var1 == 19) {
            if(var2 == -1) {
               client.field3922 = -1;
            } else {
               client.field3922 = var2 & 2047;
            }
         }

         if(var1 == 22) {
            var4 = new class113[]{class113.field1061, class113.field1060, class113.field1059, class113.field1065};
            client.field3753 = (class113)class297.method5176(var4, var2);
            if(client.field3753 == null) {
               client.field3753 = class113.field1059;
            }
         }

      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)Lbm;",
      garbageValue = "19"
   )
   static class286 method4813(int var0, int var1) {
      class210 var2 = (class210)class297.field3194.get(Integer.valueOf(var0));
      return var2.method3700(var1);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "224351210"
   )
   static final void method4811(int var0, int var1, int var2, int var3) {
      for(int var4 = var1; var4 <= var3 + var1; ++var4) {
         for(int var5 = var0; var5 <= var0 + var2; ++var5) {
            if(var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
               class152.field1452[0][var5][var4] = 127;
               if(var0 == var5 && var5 > 0) {
                  class31.field249[0][var5][var4] = class31.field249[0][var5 - 1][var4];
               }

               if(var0 + var2 == var5 && var5 < 103) {
                  class31.field249[0][var5][var4] = class31.field249[0][var5 + 1][var4];
               }

               if(var4 == var1 && var4 > 0) {
                  class31.field249[0][var5][var4] = class31.field249[0][var5][var4 - 1];
               }

               if(var4 == var3 + var1 && var4 < 103) {
                  class31.field249[0][var5][var4] = class31.field249[0][var5][var4 + 1];
               }
            }
         }
      }

   }
}
