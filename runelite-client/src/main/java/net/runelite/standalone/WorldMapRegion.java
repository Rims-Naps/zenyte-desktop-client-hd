package net.runelite.standalone;

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
public class WorldMapRegion {
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lgq;"
   )
   public static class204 field536;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lgq;"
   )
   public static class204 field527;
   @ObfuscatedName("dq")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class6 field535;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lhx;"
   )
   static final Location field538;
   @ObfuscatedName("j")
   HashMap field533;
   @ObfuscatedName("z")
   LinkedList field540;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1839357723
   )
   int field529;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -81783129
   )
   int field532;
   @ObfuscatedName("b")
   final HashMap field537;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1838639537
   )
   int field539;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -451375885
   )
   int field534;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Ld;"
   )
   class214 field531;
   @ObfuscatedName("g")
   List field523;

   static {
      field527 = new class204(37748736, 256);
      field536 = new class204(256, 256);
      field538 = new Location();
   }

   WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
      this.field529 = var1;
      this.field532 = var2;
      this.field540 = new LinkedList();
      this.field523 = new LinkedList();
      this.field533 = new HashMap();
      this.field539 = var3 | -16777216;
      this.field537 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(IILb;Lo;I)I",
      garbageValue = "-173206436"
   )
   int method909(int var1, int var2, class175 var3, class230 var4) {
      return var3.field2140[0][var1][var2] == 0?this.field539:var4.method4615(var1, var2);
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(IS)Lif;",
      garbageValue = "8305"
   )
   class123 method923(int var1) {
      class15 var2 = class285.method5484(var1);
      if(var2.field189 != null) {
         var2 = var2.method325();
         if(var2 == null) {
            return null;
         }
      }

      return var2.field148 != -1?class133.method2550(var2.field148):null;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(II[Lk;S)Lo;",
      garbageValue = "9639"
   )
   class230 method904(int var1, int var2, WorldMapRegion[] var3) {
      class230 var4 = WorldMapData.method2757(var1, var2);
      if(var4 == null) {
         var4 = this.method902(var3);
         class204 var5 = field536;
         long var7 = (long)(0 | var1 << 8 | var2);
         var5.method4031(var4, var7);
      }

      return var4;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(IIIIIILk;Lam;B)V",
      garbageValue = "109"
   )
   void method908(int var1, int var2, int var3, int var4, int var5, int var6, WorldMapRegion var7, class229 var8) {
      for(int var9 = 0; var9 < var5; ++var9) {
         for(int var10 = 0; var10 < var6; ++var10) {
            int var11 = var7.method929(var9 + var1, var10 + var2);
            if(var11 != -1) {
               class40 var12 = class113.method2121(var11);
               var8.method4599(var3 + var9, var10 + var4, 5, var12);
            }
         }
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(Lif;S)Li;",
      garbageValue = "300"
   )
   class107 method925(class123 var1) {
      if(var1.field1668 != null && this.field537 != null && this.field537.get(class181.field2480) != null) {
         int var3 = var1.field1672;
         class181[] var4 = new class181[]{class181.field2480, class181.field2473, class181.field2472};
         class181[] var5 = var4;
         int var6 = 0;

         class181 var2;
         while(true) {
            if(var6 >= var5.length) {
               var2 = null;
               break;
            }

            class181 var7 = var5[var6];
            if(var3 == var7.field2475) {
               var2 = var7;
               break;
            }

            ++var6;
         }

         if(var2 == null) {
            return null;
         } else {
            class299 var14 = (class299)this.field537.get(var2);
            if(var14 == null) {
               return null;
            } else {
               var6 = var14.method3812(var1.field1668, 1000000);
               String[] var15 = new String[var6];
               var14.method3810(var1.field1668, (int[])null, var15);
               int var8 = var15.length * var14.field2718 / 2;
               int var9 = 0;
               String[] var10 = var15;

               for(int var11 = 0; var11 < var10.length; ++var11) {
                  String var12 = var10[var11];
                  int var13 = var14.method3890(var12);
                  if(var13 > var9) {
                     var9 = var13;
                  }
               }

               return new class107(var1.field1668, var9, var8, var2);
            }
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(IILjava/util/HashSet;IB)V",
      garbageValue = "-102"
   )
   void method979(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      float var6 = var5 / 2.0F;
      Iterator var7 = this.field533.entrySet().iterator();

      while(var7.hasNext()) {
         Entry var8 = (Entry)var7.next();
         Location var9 = (Location)var8.getKey();
         int var10 = (int)((float)var9.field719 * var5 + (float)var1 - var6);
         int var11 = (int)((float)(var2 + var4) - (float)var9.field717 * var5 - var6);
         class23 var12 = (class23)var8.getValue();
         if(var12 != null) {
            var12.field250 = var10;
            var12.field253 = var11;
            class123 var13 = class133.method2550(var12.field258);
            if(!var3.contains(Integer.valueOf(var13.method2204()))) {
               this.method915(var12, var10, var11, var5);
            }
         }
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2047299227"
   )
   void method890() {
      if(this.field531 != null) {
         for(int var1 = 0; var1 < 64; ++var1) {
            for(int var2 = 0; var2 < 64; ++var2) {
               this.method920(var1, var2, this.field531);
            }
         }
      } else {
         Iterator var5 = this.field540.iterator();

         while(var5.hasNext()) {
            class108 var6 = (class108)var5.next();

            for(int var3 = var6.method1905() * 8; var3 < var6.method1905() * 8 + 8; ++var3) {
               for(int var4 = var6.method1898() * 8; var4 < var6.method1898() * 8 + 8; ++var4) {
                  this.method920(var3, var4, var6);
               }
            }
         }
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIILjava/util/HashSet;I)V",
      garbageValue = "209732074"
   )
   void method993(int var1, int var2, int var3, HashSet var4) {
      if(var4 == null) {
         var4 = new HashSet();
      }

      this.method979(var1, var2, var4, var3);
      this.method918(var1, var2, var4, var3);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Ljava/util/HashSet;Ljava/util/List;I)V",
      garbageValue = "296004276"
   )
   void method893(HashSet var1, List var2) {
      this.field533.clear();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         class108 var4 = (class108)var3.next();
         if(var4.method3228() == this.field529 && var4.method3229() == this.field532) {
            this.field540.add(var4);
            this.method894(var4.method1905() * 8, var4.method1898() * 8, 8, 8, var4);
         }
      }

      this.method895(var2);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(IILb;I)V",
      garbageValue = "946373230"
   )
   void method920(int var1, int var2, class175 var3) {
      field538.method1263(0, var1, var2);

      for(int var4 = 0; var4 < var3.field2139; ++var4) {
         class127[] var5 = var3.field2149[var4][var1][var2];
         if(var5 != null && var5.length != 0) {
            class127[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               class127 var8 = var6[var7];
               class123 var9 = this.method923(var8.field1707);
               if(var9 != null) {
                  class23 var10 = (class23)this.field533.get(field538);
                  if(var10 != null) {
                     if(var9.field1682 != var10.field258) {
                        class23 var16 = new class23(var9.field1682, var10.field248, var10.field259, this.method925(var9));
                        this.field533.put(new Location(field538), var16);
                        var10 = var16;
                     }

                     int var15 = var10.field248.field718 - var10.field259.field718;
                     var10.field259.field718 = var4;
                     var10.field248.field718 = var15 + var4;
                     return;
                  }

                  Location var11 = new Location(var4, this.field529 * 64 + var1, this.field532 * 64 + var2);
                  Location var12 = null;
                  if(this.field531 != null) {
                     var12 = new Location(this.field531.field2146 + var4, this.field531.field2150 * 64 + var1, var2 + this.field531.field2144 * 64);
                  } else {
                     Iterator var13 = this.field540.iterator();

                     while(var13.hasNext()) {
                        class108 var14 = (class108)var13.next();
                        if(var14.method1894(var1, var2)) {
                           var12 = new Location(var4 + var14.field2146, var14.field2150 * 64 + var1 + var14.method1895() * 8, var2 + var14.field2144 * 64 + var14.method1914() * 8);
                           break;
                        }
                     }
                  }

                  if(var12 != null) {
                     var10 = new class23(var9.field1682, var12, var11, this.method925(var9));
                     this.field533.put(new Location(field538), var10);
                     return;
                  }
               }
            }
         }
      }

      this.field533.remove(field538);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(IILb;Las;I)V",
      garbageValue = "-1033742365"
   )
   void method903(int var1, int var2, class175 var3, class210 var4) {
      for(int var5 = 1; var5 < var3.field2139; ++var5) {
         int var6 = var3.field2141[var5][var1][var2] - 1;
         if(var6 > -1) {
            int var7 = class108.method1919(var6, this.field539);
            if(var3.field2142[var5][var1][var2] == 0) {
               class173.method3167(this.field534 * var1, this.field534 * (63 - var2), this.field534, this.field534, var7);
            } else {
               var4.method4202(this.field534 * var1, this.field534 * (63 - var2), 0, var7, this.field534, this.field534, var3.field2142[var5][var1][var2], var3.field2143[var5][var1][var2]);
            }
         }
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(Laf;IIFB)V",
      garbageValue = "-121"
   )
   void method915(class23 var1, int var2, int var3, float var4) {
      class123 var5 = class133.method2550(var1.field258);
      this.method954(var5, var2, var3);
      this.method917(var1, var5, var2, var3, var4);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Ld;Ljava/util/List;I)V",
      garbageValue = "395616986"
   )
   void method892(class214 var1, List var2) {
      this.field533.clear();
      this.field531 = var1;
      this.method894(0, 0, 64, 64, this.field531);
      this.method895(var2);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(Lif;IIIII)V",
      garbageValue = "837564636"
   )
   void method914(class123 var1, int var2, int var3, int var4, int var5) {
      SpritePixels var6 = var1.method2202(false);
      if(var6 != null) {
         var6.method215(var2 - var6.width / 2, var3 - var6.height / 2);
         if(var4 % var5 < var5 / 2) {
            class173.method3144(var2, var3, 15, 16776960, 128);
            class173.method3144(var2, var3, 7, 16777215, 256);
         }

      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(IIIILb;I)V",
      garbageValue = "1204222033"
   )
   void method894(int var1, int var2, int var3, int var4, class175 var5) {
      for(int var6 = var1; var6 < var3 + var1; ++var6) {
         label54:
         for(int var7 = var2; var7 < var2 + var4; ++var7) {
            Location var8 = new Location(0, var6, var7);

            for(int var9 = 0; var9 < var5.field2139; ++var9) {
               class127[] var10 = var5.field2149[var9][var6][var7];
               if(var10 != null && var10.length != 0) {
                  class127[] var11 = var10;

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     class127 var13 = var11[var12];
                     class123 var14 = this.method923(var13.field1707);
                     if(var14 != null) {
                        Location var15 = new Location(var9, this.field529 * 64 + var6, this.field532 * 64 + var7);
                        Location var16 = null;
                        if(this.field531 != null) {
                           var16 = new Location(this.field531.field2146 + var9, var6 + this.field531.field2150 * 64, var7 + this.field531.field2144 * 64);
                        } else {
                           class108 var17 = (class108)var5;
                           var16 = new Location(var9 + var17.field2146, var6 + var17.field2150 * 64 + var17.method1895() * 8, var17.field2144 * 64 + var7 + var17.method1914() * 8);
                        }

                        class23 var18 = new class23(var14.field1682, var16, var15, this.method925(var14));
                        this.field533.put(var8, var18);
                        continue label54;
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(IILb;Las;[Lle;I)V",
      garbageValue = "1794470870"
   )
   void method958(int var1, int var2, class175 var3, class210 var4, class303[] var5) {
      this.method1035(var1, var2, var3);
      this.method910(var1, var2, var3, var5);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1458113715"
   )
   int method929(int var1, int var2) {
      if(this.field531 != null) {
         return this.field531.method3227(var1, var2);
      } else {
         if(!this.field540.isEmpty()) {
            Iterator var3 = this.field540.iterator();

            while(var3.hasNext()) {
               class108 var4 = (class108)var3.next();
               if(var4.method1894(var1, var2)) {
                  return var4.method3227(var1, var2);
               }
            }
         }

         return -1;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Ljava/util/List;I)V",
      garbageValue = "-2053212279"
   )
   void method895(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         class184 var3 = (class184)var2.next();
         if(var3.field2509.field719 >> 6 == this.field529 && var3.field2509.field717 >> 6 == this.field532) {
            class23 var4 = new class23(var3.field2508, var3.field2509, var3.field2509, this.method924(var3.field2508));
            this.field523.add(var4);
         }
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "([Lk;Lam;I)V",
      garbageValue = "1222996099"
   )
   void method944(WorldMapRegion[] var1, class229 var2) {
      class49[] var3 = new class49[]{class49.field554, class49.field557, class49.field552, class49.field555, class49.field556, class49.field561, class49.field559, class49.field551};
      class49[] var5 = var3;

      for(int var6 = 0; var6 < var5.length; ++var6) {
         class49 var7 = var5[var6];
         if(var1[var7.vmethod6234()] != null) {
            byte var8 = 0;
            byte var9 = 0;
            byte var10 = 64;
            byte var11 = 64;
            byte var12 = 0;
            byte var13 = 0;
            switch(var7.field558) {
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

            this.method908(var12, var13, var8, var9, var10, var11, var1[var7.vmethod6234()], var2);
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Ljava/util/HashSet;III)V",
      garbageValue = "1388066070"
   )
   void method932(HashSet var1, int var2, int var3) {
      Iterator var4 = this.field533.values().iterator();

      while(var4.hasNext()) {
         class23 var5 = (class23)var4.next();
         if(var1.contains(Integer.valueOf(var5.field258))) {
            class123 var6 = class133.method2550(var5.field258);
            this.method914(var6, var5.field250, var5.field253, var2, var3);
         }
      }

      this.method913(var1, var2, var3);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(Las;[Lk;[Lle;Lo;S)V",
      garbageValue = "-12000"
   )
   void method899(class210 var1, WorldMapRegion[] var2, class303[] var3, class230 var4) {
      int var5;
      int var6;
      for(var5 = 0; var5 < 64; ++var5) {
         for(var6 = 0; var6 < 64; ++var6) {
            this.method911(var5, var6, this.field531, var1, var4);
            this.method903(var5, var6, this.field531, var1);
         }
      }

      for(var5 = 0; var5 < 64; ++var5) {
         for(var6 = 0; var6 < 64; ++var6) {
            this.method958(var5, var6, this.field531, var1, var3);
         }
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(IIIILb;Lam;I)V",
      garbageValue = "1251786460"
   )
   void method907(int var1, int var2, int var3, int var4, class175 var5, class229 var6) {
      for(int var7 = var1; var7 < var3 + var1; ++var7) {
         for(int var8 = var2; var8 < var2 + var4; ++var8) {
            int var9 = var5.field2140[0][var7][var8] - 1;
            if(var9 != -1) {
               class40 var10 = class113.method2121(var9);
               var6.method4599(var7, var8, 5, var10);
            }
         }
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(IILb;I)V",
      garbageValue = "-240020829"
   )
   void method1035(int var1, int var2, class175 var3) {
      for(int var4 = 0; var4 < var3.field2139; ++var4) {
         class127[] var5 = var3.field2149[var4][var1][var2];
         if(var5 != null && var5.length != 0) {
            class127[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               class127 var8 = var6[var7];
               if(class275.method5369(var8.field1708)) {
                  class15 var9 = class285.method5484(var8.field1707);
                  int var10 = var9.field167 != 0?-3407872:-3355444;
                  if(var8.field1708 == class264.field3412.field3433) {
                     this.method928(var1, var2, var8.field1710, var10);
                  }

                  if(var8.field1708 == class264.field3414.field3433) {
                     this.method928(var1, var2, var8.field1710, -3355444);
                     this.method928(var1, var2, var8.field1710 + 1, var10);
                  }

                  if(var8.field1708 == class264.field3422.field3433) {
                     if(var8.field1710 == 0) {
                        class173.method3213(this.field534 * var1, this.field534 * (63 - var2), 1, var10);
                     }

                     if(var8.field1710 == 1) {
                        class173.method3213(this.field534 * var1 + this.field534 - 1, this.field534 * (63 - var2), 1, var10);
                     }

                     if(var8.field1710 == 2) {
                        class173.method3213(this.field534 + this.field534 * var1 - 1, this.field534 * (63 - var2) + this.field534 - 1, 1, var10);
                     }

                     if(var8.field1710 == 3) {
                        class173.method3213(this.field534 * var1, this.field534 * (63 - var2) + this.field534 - 1, 1, var10);
                     }
                  }

                  if(var8.field1708 == class264.field3432.field3433) {
                     int var11 = var8.field1710 % 2;
                     int var12;
                     if(var11 == 0) {
                        for(var12 = 0; var12 < this.field534; ++var12) {
                           class173.method3213(var12 + this.field534 * var1, (64 - var2) * this.field534 - 1 - var12, 1, var10);
                        }
                     } else {
                        for(var12 = 0; var12 < this.field534; ++var12) {
                           class173.method3213(var12 + this.field534 * var1, var12 + this.field534 * (63 - var2), 1, var10);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(Lif;III)V",
      garbageValue = "34597031"
   )
   void method954(class123 var1, int var2, int var3) {
      SpritePixels var4 = var1.method2202(false);
      if(var4 != null) {
         int var5 = this.method956(var4, var1.field1673);
         int var6 = this.method922(var4, var1.field1667);
         var4.method215(var5 + var2, var3 + var6);
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(Llp;Ljp;I)I",
      garbageValue = "849389753"
   )
   int method956(SpritePixels var1, class30 var2) {
      switch(var2.field285) {
      case 0:
         return -var1.width / 2;
      case 1:
         return 0;
      default:
         return -var1.width;
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(ILas;[Lk;[Lle;B)V",
      garbageValue = "8"
   )
   void method1004(int var1, class210 var2, WorldMapRegion[] var3, class303[] var4) {
      this.field534 = var1;
      if(this.field531 != null || !this.field540.isEmpty()) {
         if(class315.method6189(this.field529, this.field532, var1) == null) {
            class230 var5 = this.method904(this.field529, this.field532, var3);
            SpritePixels var6 = new SpritePixels(this.field534 * 64, this.field534 * 64);
            var6.method304();
            if(this.field531 != null) {
               this.method899(var2, var3, var4, var5);
            } else {
               this.method900(var2, var4, var5);
            }

            class246.method4955(var6, this.field529, this.field532, this.field534);
         }
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(IB)Li;",
      garbageValue = "2"
   )
   class107 method924(int var1) {
      class123 var2 = class133.method2550(var1);
      return this.method925(var2);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(Ljava/util/HashSet;IIB)V",
      garbageValue = "-65"
   )
   void method913(HashSet var1, int var2, int var3) {
      Iterator var4 = this.field523.iterator();

      while(var4.hasNext()) {
         class23 var5 = (class23)var4.next();
         class123 var6 = class133.method2550(var5.field258);
         if(var6 != null && var1.contains(Integer.valueOf(var6.method2204()))) {
            this.method914(var6, var5.field250, var5.field253, var2, var3);
         }
      }

   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(IILb;Las;Lo;B)V",
      garbageValue = "30"
   )
   void method911(int var1, int var2, class175 var3, class210 var4, class230 var5) {
      int var6 = var3.field2140[0][var1][var2] - 1;
      int var7 = var3.field2141[0][var1][var2] - 1;
      if(var6 == -1 && var7 == -1) {
         class173.method3167(this.field534 * var1, this.field534 * (63 - var2), this.field534, this.field534, this.field539);
      }

      int var8 = 16711935;
      if(var7 != -1) {
         var8 = class108.method1919(var7, this.field539);
      }

      if(var7 > -1 && var3.field2142[0][var1][var2] == 0) {
         class173.method3167(this.field534 * var1, this.field534 * (63 - var2), this.field534, this.field534, var8);
      } else {
         int var9 = this.method909(var1, var2, var3, var5);
         if(var7 == -1) {
            class173.method3167(this.field534 * var1, this.field534 * (63 - var2), this.field534, this.field534, var9);
         } else {
            var4.method4202(this.field534 * var1, this.field534 * (63 - var2), var9, var8, this.field534, this.field534, var3.field2142[0][var1][var2], var3.field2143[0][var1][var2]);
         }
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Las;[Lle;Lo;I)V",
      garbageValue = "827191858"
   )
   void method900(class210 var1, class303[] var2, class230 var3) {
      Iterator var4 = this.field540.iterator();

      class108 var5;
      int var6;
      int var7;
      while(var4.hasNext()) {
         var5 = (class108)var4.next();

         for(var6 = var5.method1905() * 8; var6 < var5.method1905() * 8 + 8; ++var6) {
            for(var7 = var5.method1898() * 8; var7 < var5.method1898() * 8 + 8; ++var7) {
               this.method911(var6, var7, var5, var1, var3);
               this.method903(var6, var7, var5, var1);
            }
         }
      }

      var4 = this.field540.iterator();

      while(var4.hasNext()) {
         var5 = (class108)var4.next();

         for(var6 = var5.method1905() * 8; var6 < var5.method1905() * 8 + 8; ++var6) {
            for(var7 = var5.method1898() * 8; var7 < var5.method1898() * 8 + 8; ++var7) {
               this.method958(var6, var7, var5, var1, var2);
            }
         }
      }

   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(IILjava/util/HashSet;IB)V",
      garbageValue = "2"
   )
   void method918(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      Iterator var6 = this.field523.iterator();

      while(var6.hasNext()) {
         class23 var7 = (class23)var6.next();
         int var8 = var7.field259.field719 % 64;
         int var9 = var7.field259.field717 % 64;
         var7.field250 = (int)((float)var8 * var5 + (float)var1);
         var7.field253 = (int)((float)var2 + (float)(63 - var9) * var5);
         if(!var3.contains(Integer.valueOf(var7.field258))) {
            this.method915(var7, var7.field250, var7.field253, var5);
         }
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Llp;Liz;I)I",
      garbageValue = "-1555212344"
   )
   int method922(SpritePixels var1, class63 var2) {
      switch(var2.field741) {
      case 1:
         return 0;
      case 2:
         return -var1.height / 2;
      default:
         return -var1.height;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "([Lk;B)Lo;",
      garbageValue = "1"
   )
   class230 method902(WorldMapRegion[] var1) {
      class229 var2 = new class229(64, 64);
      if(this.field531 != null) {
         this.method907(0, 0, 64, 64, this.field531, var2);
      } else {
         Iterator var3 = this.field540.iterator();

         while(var3.hasNext()) {
            class108 var4 = (class108)var3.next();
            this.method907(var4.method1905() * 8, var4.method1898() * 8, 8, 8, var4, var2);
         }
      }

      this.method944(var1, var2);
      class230 var5 = new class230();
      var5.method4612(var2);
      return var5;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(Laf;Lif;IIFB)V",
      garbageValue = "7"
   )
   void method917(class23 var1, class123 var2, int var3, int var4, float var5) {
      if(var1.field251 != null) {
         if(var1.field251.field1168.method3695(var5)) {
            class299 var6 = (class299)this.field537.get(var1.field251.field1168);
            var6.method3868(var1.field251.field1166, var3 - var1.field251.field1165 / 2, var4, var1.field251.field1165, var1.field251.field1167, -16777216 | var2.field1665, 0, 1, 0, var6.field2718 / 2);
         }
      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-1658116130"
   )
   void method928(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if(var3 == 0) {
         class173.method3206(this.field534 * var1, this.field534 * (63 - var2), this.field534, var4);
      }

      if(var3 == 1) {
         class173.method3213(this.field534 * var1, this.field534 * (63 - var2), this.field534, var4);
      }

      if(var3 == 2) {
         class173.method3206(this.field534 + this.field534 * var1 - 1, this.field534 * (63 - var2), this.field534, var4);
      }

      if(var3 == 3) {
         class173.method3213(this.field534 * var1, this.field534 * (63 - var2) + this.field534 - 1, this.field534, var4);
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "-1372308550"
   )
   void method891(int var1, int var2, int var3) {
      SpritePixels var4 = class315.method6189(this.field529, this.field532, this.field534);
      if(var4 != null) {
         if(var3 == this.field534 * 64) {
            var4.method213(var1, var2);
         } else {
            var4.method264(var1, var2, var3, var3);
         }

      }
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(IILb;[Lle;B)V",
      garbageValue = "-125"
   )
   void method910(int var1, int var2, class175 var3, class303[] var4) {
      for(int var5 = 0; var5 < var3.field2139; ++var5) {
         class127[] var6 = var3.field2149[var5][var1][var2];
         if(var6 != null && var6.length != 0) {
            class127[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               class127 var9 = var7[var8];
               if(class233.method4653(var9.field1708) || class184.method3710(var9.field1708)) {
                  class15 var10 = class285.method5484(var9.field1707);
                  if(var10.field158 != -1) {
                     if(var10.field158 != 46 && var10.field158 != 52) {
                        var4[var10.field158].method5992(this.field534 * var1, this.field534 * (63 - var2), this.field534 * 2, this.field534 * 2);
                     } else {
                        var4[var10.field158].method5992(this.field534 * var1, this.field534 * (63 - var2), this.field534 * 2 + 1, this.field534 * 2 + 1);
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(IIIIII)Ljava/util/List;",
      garbageValue = "390437180"
   )
   List method1014(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var6 = new LinkedList();
      if(var4 >= var1 && var5 >= var2) {
         if(var4 < var3 + var1 && var5 < var3 + var2) {
            Iterator var7 = this.field533.values().iterator();

            class23 var8;
            while(var7.hasNext()) {
               var8 = (class23)var7.next();
               if(var8.method431(var4, var5)) {
                  var6.add(var8);
               }
            }

            var7 = this.field523.iterator();

            while(var7.hasNext()) {
               var8 = (class23)var7.next();
               if(var8.method431(var4, var5)) {
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

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(I)Ljava/util/List;",
      garbageValue = "-1823690673"
   )
   List method953() {
      LinkedList var1 = new LinkedList();
      var1.addAll(this.field523);
      var1.addAll(this.field533.values());
      return var1;
   }

   @ObfuscatedName("jg")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "12"
   )
   static final void method896(int var0) {
      class90.method1712();
      class199.method3975();
      int var1 = class113.method2120(var0).field3513;
      if(var1 != 0) {
         int var2 = class81.field898[var0];
         if(var1 == 1) {
            if(var2 == 1) {
               class211.method4252(0.9D);
               ((class266)class211.field2895).method5304(0.9D);
            }

            if(var2 == 2) {
               class211.method4252(0.8D);
               ((class266)class211.field2895).method5304(0.8D);
            }

            if(var2 == 3) {
               class211.method4252(0.7D);
               ((class266)class211.field2895).method5304(0.7D);
            }

            if(var2 == 4) {
               class211.method4252(0.6D);
               ((class266)class211.field2895).method5304(0.6D);
            }

            class332.method6365();
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

            if(var3 != client.field2386) {
               if(client.field2386 == 0 && client.field2328 != -1) {
                  class67.method1488(client.field2428, client.field2328, 0, var3, false);
                  client.field2393 = false;
               } else if(var3 == 0) {
                  class43.field483.method1375();
                  class43.field481 = 1;
                  class270.field3480 = null;
                  client.field2393 = false;
               } else if(class43.field481 != 0) {
                  class226.field3046 = var3;
               } else {
                  class43.field483.method1369(var3);
               }

               client.field2386 = var3;
            }
         }

         if(var1 == 4) {
            if(var2 == 0) {
               client.field2389 = 127;
            }

            if(var2 == 1) {
               client.field2389 = 96;
            }

            if(var2 == 2) {
               client.field2389 = 64;
            }

            if(var2 == 3) {
               client.field2389 = 32;
            }

            if(var2 == 4) {
               client.field2389 = 0;
            }
         }

         if(var1 == 5) {
            client.field2288 = var2;
         }

         if(var1 == 6) {
            client.field2317 = var2;
         }

         if(var1 == 9) {
            client.field2318 = var2;
         }

         if(var1 == 10) {
            if(var2 == 0) {
               client.field2390 = 127;
            }

            if(var2 == 1) {
               client.field2390 = 96;
            }

            if(var2 == 2) {
               client.field2390 = 64;
            }

            if(var2 == 3) {
               client.field2390 = 32;
            }

            if(var2 == 4) {
               client.field2390 = 0;
            }
         }

         if(var1 == 17) {
            client.field2323 = var2 & 65535;
         }

         class302[] var4;
         if(var1 == 18) {
            var4 = new class302[]{class302.field3752, class302.field3751, class302.field3750, class302.field3756};
            client.field2181 = (class302)class38.method678(var4, var2);
            if(client.field2181 == null) {
               client.field2181 = class302.field3750;
            }
         }

         if(var1 == 19) {
            if(var2 == -1) {
               client.field2343 = -1;
            } else {
               client.field2343 = var2 & 2047;
            }
         }

         if(var1 == 22) {
            var4 = new class302[]{class302.field3752, class302.field3751, class302.field3750, class302.field3756};
            client.field2174 = (class302)class38.method678(var4, var2);
            if(client.field2174 == null) {
               client.field2174 = class302.field3750;
            }
         }

      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)Lbm;",
      garbageValue = "19"
   )
   static class227 method1036(int var0, int var1) {
      class55 var2 = (class55)class38.field367.get(Integer.valueOf(var0));
      return var2.method1227(var1);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "224351210"
   )
   static final void method1034(int var0, int var1, int var2, int var3) {
      for(int var4 = var1; var4 <= var3 + var1; ++var4) {
         for(int var5 = var0; var5 <= var0 + var2; ++var5) {
            if(var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
               class285.field3573[0][var5][var4] = 127;
               if(var0 == var5 && var5 > 0) {
                  class185.field2522[0][var5][var4] = class185.field2522[0][var5 - 1][var4];
               }

               if(var0 + var2 == var5 && var5 < 103) {
                  class185.field2522[0][var5][var4] = class185.field2522[0][var5 + 1][var4];
               }

               if(var4 == var1 && var4 > 0) {
                  class185.field2522[0][var5][var4] = class185.field2522[0][var5][var4 - 1];
               }

               if(var4 == var3 + var1 && var4 < 103) {
                  class185.field2522[0][var5][var4] = class185.field2522[0][var5][var4 + 1];
               }
            }
         }
      }

   }
}
