package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

import net.runelite.mapping.Reflection;
import net.runelite.rs.api.RSNPCComposition;

@ObfuscatedName("ch")
public class class40 {
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lcn;"
   )
   static class99 field296;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 945608319
   )
   public static int field294;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "[Ldm;"
   )
   class3[] field313;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -552378659
   )
   int field300;
   @ObfuscatedName("v")
   protected int[] field304;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1123455505
   )
   int field314;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1848473859
   )
   int field311;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      longValue = -2893065377737393135L
   )
   long field309;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      longValue = 1975848928586178547L
   )
   long field305;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1565276207
   )
   int field308;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      longValue = -5385180788903926013L
   )
   long field301;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 667326527
   )
   int field303;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1994026869
   )
   int field306;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Ldm;"
   )
   class3 field299;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 779446601
   )
   int field298;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1064543423
   )
   int field307;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "[Ldm;"
   )
   class3[] field312;
   @ObfuscatedName("y")
   boolean field310;

   protected class40() {
      this.field300 = 32;
      this.field301 = class234.method4170();
      this.field305 = 0L;
      this.field306 = 0;
      this.field307 = 0;
      this.field298 = 0;
      this.field309 = 0L;
      this.field310 = true;
      this.field311 = 0;
      this.field312 = new class3[8];
      this.field313 = new class3[8];
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "351660541"
   )
   public final void method642() {
      this.field310 = true;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1185336736"
   )
   protected void vmethod2426() throws Exception {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(Ldm;B)V",
      garbageValue = "-63"
   )
   public final synchronized void method640(class3 var1) {
      this.field299 = var1;
   }

   @ObfuscatedName("ad")
   final void method658(int[] var1, int var2) {
      int var3 = var2;
      if(class137.field1362) {
         var3 = var2 << 1;
      }

      class196.method3317(var1, 0, var3);
      this.field311 -= var2;
      if(this.field299 != null && this.field311 <= 0) {
         this.field311 += field294 >> 4;
         class5.method72(this.field299);
         this.method647(this.field299, this.field299.vmethod4414());
         int var4 = 0;
         int var5 = 255;

         int var6;
         class3 var10;
         label104:
         for(var6 = 7; var5 != 0; --var6) {
            int var7;
            int var8;
            if(var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  class3 var11 = this.field312[var7];

                  label98:
                  while(true) {
                     while(true) {
                        if(var11 == null) {
                           break label98;
                        }

                        class81 var12 = var11.field28;
                        if(var12 != null && var12.field732 > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.field25;
                        } else {
                           var11.field27 = true;
                           int var13 = var11.vmethod4965();
                           var4 += var13;
                           if(var12 != null) {
                              var12.field732 += var13;
                           }

                           if(var4 >= this.field300) {
                              break label104;
                           }

                           class3 var14 = var11.vmethod4963();
                           if(var14 != null) {
                              for(int var15 = var11.field26; var14 != null; var14 = var11.vmethod4973()) {
                                 this.method647(var14, var15 * var14.vmethod4414() >> 8);
                              }
                           }

                           class3 var18 = var11.field25;
                           var11.field25 = null;
                           if(var10 == null) {
                              this.field312[var7] = var18;
                           } else {
                              var10.field25 = var18;
                           }

                           if(var18 == null) {
                              this.field313[var7] = var10;
                           }

                           var11 = var18;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            class3 var16 = this.field312[var6];
            class3[] var17 = this.field312;
            this.field313[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.field25;
               var16.field25 = null;
            }
         }
      }

      if(this.field311 < 0) {
         this.field311 = 0;
      }

      if(this.field299 != null) {
         this.field299.vmethod4966(var1, 0, var2);
      }

      this.field301 = class234.method4170();
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2020373641"
   )
   public final synchronized void method644() {
      if(field296 != null) {
         boolean var1 = true;

         for(int var2 = 0; var2 < 2; ++var2) {
            if(this == field296.field915[var2]) {
               field296.field915[var2] = null;
            }

            if(field296.field915[var2] != null) {
               var1 = false;
            }
         }

         if(var1) {
            class35.field271.shutdownNow();
            class35.field271 = null;
            field296 = null;
         }
      }

      this.vmethod2425();
      this.field304 = null;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(Ldm;II)V",
      garbageValue = "-804622392"
   )
   final void method647(class3 var1, int var2) {
      int var3 = var2 >> 5;
      class3 var4 = this.field313[var3];
      if(var4 == null) {
         this.field312[var3] = var1;
      } else {
         var4.field25 = var1;
      }

      this.field313[var3] = var1;
      var1.field26 = var2;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1732447930"
   )
   protected void vmethod2431() throws Exception {
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-18"
   )
   protected void vmethod2425() {
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1371354819"
   )
   protected void vmethod2427(int var1) throws Exception {
   }

   @ObfuscatedName("s")
   protected void vmethod2429() throws Exception {
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "16711935"
   )
   protected int vmethod2428() throws Exception {
      return this.field308;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-276015572"
   )
   public final synchronized void method639() {
      this.field310 = true;

      try {
         this.vmethod2431();
      } catch (Exception var2) {
         this.vmethod2425();
         this.field305 = class234.method4170() + 2000L;
      }

   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1928361113"
   )
   public final synchronized void method646() {
      if(this.field304 != null) {
         long var1 = class234.method4170();

         try {
            if(this.field305 != 0L) {
               if(var1 < this.field305) {
                  return;
               }

               this.vmethod2427(this.field308);
               this.field305 = 0L;
               this.field310 = true;
            }

            int var3 = this.vmethod2428();
            if(this.field298 - var3 > this.field306) {
               this.field306 = this.field298 - var3;
            }

            int var4 = this.field314 + this.field303;
            if(var4 + 256 > 16384) {
               var4 = 16128;
            }

            if(var4 + 256 > this.field308) {
               this.field308 += 1024;
               if(this.field308 > 16384) {
                  this.field308 = 16384;
               }

               this.vmethod2425();
               this.vmethod2427(this.field308);
               var3 = 0;
               this.field310 = true;
               if(var4 + 256 > this.field308) {
                  var4 = this.field308 - 256;
                  this.field314 = var4 - this.field303;
               }
            }

            while(var3 < var4) {
               this.method658(this.field304, 256);
               this.vmethod2429();
               var3 += 256;
            }

            if(var1 > this.field309) {
               if(!this.field310) {
                  if(this.field306 == 0 && this.field307 == 0) {
                     this.vmethod2425();
                     this.field305 = 2000L + var1;
                     return;
                  }

                  this.field314 = Math.min(this.field307, this.field306);
                  this.field307 = this.field306;
               } else {
                  this.field310 = false;
               }

               this.field306 = 0;
               this.field309 = 2000L + var1;
            }

            this.field298 = var3;
         } catch (Exception var7) {
            this.vmethod2425();
            this.field305 = var1 + 2000L;
         }

         try {
            if(var1 > this.field301 + 500000L) {
               var1 = this.field301;
            }

            while(var1 > 5000L + this.field301) {
               this.method678(256);
               this.field301 += (long)(256000 / field294);
            }
         } catch (Exception var6) {
            this.field301 = var1;
         }

      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-128"
   )
   final void method678(int var1) {
      this.field311 -= var1;
      if(this.field311 < 0) {
         this.field311 = 0;
      }

      if(this.field299 != null) {
         this.field299.vmethod4968(var1);
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-2079490806"
   )
   static int method693(int var0, class252 var1, boolean var2) {
      if(var0 == 3200) {
         class171.field1587 -= 3;
         class192.method3287(class55.field407[class171.field1587], class55.field407[class171.field1587 + 1], class55.field407[class171.field1587 + 2]);
         return 1;
      } else if(var0 == 3201) {
         class184.method3218(class55.field407[--class171.field1587]);
         return 1;
      } else if(var0 == 3202) {
         class171.field1587 -= 2;
         class135.method2500(class55.field407[class171.field1587], class55.field407[class171.field1587 + 1]);
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "([BI)Lkn;",
      garbageValue = "-1521600080"
   )
   static class277 method696(byte[] var0) {
      if(var0 == null) {
         return null;
      } else {
         class277 var1 = new class277(var0, class120.field1149, class112.field1055, class112.field1052, class167.field1544, class192.field1841, class161.field1507);
         class120.field1149 = null;
         class112.field1055 = null;
         class112.field1052 = null;
         class167.field1544 = null;
         class192.field1841 = null;
         class161.field1507 = null;
         return var1;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Ljava/lang/Class;",
      garbageValue = "2130603368"
   )
   static Class method695(String var0) throws ClassNotFoundException {
      return var0.equals("B")?Byte.TYPE:(var0.equals("I")?Integer.TYPE:(var0.equals("S")?Short.TYPE:(var0.equals("J")?Long.TYPE:(var0.equals("Z")?Boolean.TYPE:(var0.equals("F")?Float.TYPE:(var0.equals("D")?Double.TYPE:(var0.equals("C")?Character.TYPE:(var0.equals("void")?Void.TYPE:Reflection.findClass(var0)))))))));
   }

   @ObfuscatedName("he")
   @ObfuscatedSignature(
      signature = "(Lbw;IIBI)V",
      garbageValue = "1814280594"
   )
   static final void method661(class63 var0, int var1, int var2, byte var3) {
      int var4 = var0.field1288[0];
      int var5 = var0.field1315[0];
      int var6 = var0.method1089();
      if(var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) {
         if(var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) {
            int var8 = var0.method1089();
            class48 var9 = class237.method4199(var1, var2);
            class182 var10 = client.field3790[var0.field580];
            int[] var11 = client.field4005;
            int[] var12 = client.field4006;

            int var13;
            int var14;
            for(var13 = 0; var13 < 128; ++var13) {
               for(var14 = 0; var14 < 128; ++var14) {
                  class154.field1474[var13][var14] = 0;
                  class154.field1477[var13][var14] = 99999999;
               }
            }

            int var15;
            int var16;
            byte var18;
            int var19;
            int var20;
            int var22;
            int var24;
            int var25;
            int var26;
            int var27;
            boolean var33;
            int var35;
            int var36;
            int var38;
            if(var8 == 1) {
               var33 = class302.method5205(var4, var5, var9, var10);
            } else {
               byte var17;
               byte var21;
               int[][] var32;
               boolean var34;
               if(var8 == 2) {
                  var15 = var4;
                  var16 = var5;
                  var17 = 64;
                  var18 = 64;
                  var19 = var4 - var17;
                  var20 = var5 - var18;
                  class154.field1474[var17][var18] = 99;
                  class154.field1477[var17][var18] = 0;
                  var21 = 0;
                  var22 = 0;
                  class154.field1476[var21] = var4;
                  var38 = var21 + 1;
                  class154.field1472[var21] = var5;
                  var32 = var10.field1765;

                  while(true) {
                     if(var22 == var38) {
                        class114.field1066 = var15;
                        class1.field9 = var16;
                        var34 = false;
                        break;
                     }

                     var15 = class154.field1476[var22];
                     var16 = class154.field1472[var22];
                     var22 = var22 + 1 & 4095;
                     var35 = var15 - var19;
                     var36 = var16 - var20;
                     var24 = var15 - var10.field1761;
                     var25 = var16 - var10.field1762;
                     if(var9.vmethod2285(2, var15, var16, var10)) {
                        class114.field1066 = var15;
                        class1.field9 = var16;
                        var34 = true;
                        break;
                     }

                     var26 = class154.field1477[var35][var36] + 1;
                     if(var35 > 0 && class154.field1474[var35 - 1][var36] == 0 && (var32[var24 - 1][var25] & 19136782) == 0 && (var32[var24 - 1][var25 + 1] & 19136824) == 0) {
                        class154.field1476[var38] = var15 - 1;
                        class154.field1472[var38] = var16;
                        var38 = var38 + 1 & 4095;
                        class154.field1474[var35 - 1][var36] = 2;
                        class154.field1477[var35 - 1][var36] = var26;
                     }

                     if(var35 < 126 && class154.field1474[var35 + 1][var36] == 0 && (var32[var24 + 2][var25] & 19136899) == 0 && (var32[var24 + 2][var25 + 1] & 19136992) == 0) {
                        class154.field1476[var38] = var15 + 1;
                        class154.field1472[var38] = var16;
                        var38 = var38 + 1 & 4095;
                        class154.field1474[var35 + 1][var36] = 8;
                        class154.field1477[var35 + 1][var36] = var26;
                     }

                     if(var36 > 0 && class154.field1474[var35][var36 - 1] == 0 && (var32[var24][var25 - 1] & 19136782) == 0 && (var32[var24 + 1][var25 - 1] & 19136899) == 0) {
                        class154.field1476[var38] = var15;
                        class154.field1472[var38] = var16 - 1;
                        var38 = var38 + 1 & 4095;
                        class154.field1474[var35][var36 - 1] = 1;
                        class154.field1477[var35][var36 - 1] = var26;
                     }

                     if(var36 < 126 && class154.field1474[var35][var36 + 1] == 0 && (var32[var24][var25 + 2] & 19136824) == 0 && (var32[var24 + 1][var25 + 2] & 19136992) == 0) {
                        class154.field1476[var38] = var15;
                        class154.field1472[var38] = var16 + 1;
                        var38 = var38 + 1 & 4095;
                        class154.field1474[var35][var36 + 1] = 4;
                        class154.field1477[var35][var36 + 1] = var26;
                     }

                     if(var35 > 0 && var36 > 0 && class154.field1474[var35 - 1][var36 - 1] == 0 && (var32[var24 - 1][var25] & 19136830) == 0 && (var32[var24 - 1][var25 - 1] & 19136782) == 0 && (var32[var24][var25 - 1] & 19136911) == 0) {
                        class154.field1476[var38] = var15 - 1;
                        class154.field1472[var38] = var16 - 1;
                        var38 = var38 + 1 & 4095;
                        class154.field1474[var35 - 1][var36 - 1] = 3;
                        class154.field1477[var35 - 1][var36 - 1] = var26;
                     }

                     if(var35 < 126 && var36 > 0 && class154.field1474[var35 + 1][var36 - 1] == 0 && (var32[var24 + 1][var25 - 1] & 19136911) == 0 && (var32[var24 + 2][var25 - 1] & 19136899) == 0 && (var32[var24 + 2][var25] & 19136995) == 0) {
                        class154.field1476[var38] = var15 + 1;
                        class154.field1472[var38] = var16 - 1;
                        var38 = var38 + 1 & 4095;
                        class154.field1474[var35 + 1][var36 - 1] = 9;
                        class154.field1477[var35 + 1][var36 - 1] = var26;
                     }

                     if(var35 > 0 && var36 < 126 && class154.field1474[var35 - 1][var36 + 1] == 0 && (var32[var24 - 1][var25 + 1] & 19136830) == 0 && (var32[var24 - 1][var25 + 2] & 19136824) == 0 && (var32[var24][var25 + 2] & 19137016) == 0) {
                        class154.field1476[var38] = var15 - 1;
                        class154.field1472[var38] = var16 + 1;
                        var38 = var38 + 1 & 4095;
                        class154.field1474[var35 - 1][var36 + 1] = 6;
                        class154.field1477[var35 - 1][var36 + 1] = var26;
                     }

                     if(var35 < 126 && var36 < 126 && class154.field1474[var35 + 1][var36 + 1] == 0 && (var32[var24 + 1][var25 + 2] & 19137016) == 0 && (var32[var24 + 2][var25 + 2] & 19136992) == 0 && (var32[var24 + 2][var25 + 1] & 19136995) == 0) {
                        class154.field1476[var38] = var15 + 1;
                        class154.field1472[var38] = var16 + 1;
                        var38 = var38 + 1 & 4095;
                        class154.field1474[var35 + 1][var36 + 1] = 12;
                        class154.field1477[var35 + 1][var36 + 1] = var26;
                     }
                  }

                  var33 = var34;
               } else {
                  var15 = var4;
                  var16 = var5;
                  var17 = 64;
                  var18 = 64;
                  var19 = var4 - var17;
                  var20 = var5 - var18;
                  class154.field1474[var17][var18] = 99;
                  class154.field1477[var17][var18] = 0;
                  var21 = 0;
                  var22 = 0;
                  class154.field1476[var21] = var4;
                  var38 = var21 + 1;
                  class154.field1472[var21] = var5;
                  var32 = var10.field1765;

                  label661:
                  while(true) {
                     label659:
                     while(true) {
                        do {
                           do {
                              do {
                                 label636:
                                 do {
                                    if(var22 == var38) {
                                       class114.field1066 = var15;
                                       class1.field9 = var16;
                                       var34 = false;
                                       break label661;
                                    }

                                    var15 = class154.field1476[var22];
                                    var16 = class154.field1472[var22];
                                    var22 = var22 + 1 & 4095;
                                    var35 = var15 - var19;
                                    var36 = var16 - var20;
                                    var24 = var15 - var10.field1761;
                                    var25 = var16 - var10.field1762;
                                    if(var9.vmethod2285(var8, var15, var16, var10)) {
                                       class114.field1066 = var15;
                                       class1.field9 = var16;
                                       var34 = true;
                                       break label661;
                                    }

                                    var26 = class154.field1477[var35][var36] + 1;
                                    if(var35 > 0 && class154.field1474[var35 - 1][var36] == 0 && (var32[var24 - 1][var25] & 19136782) == 0 && (var32[var24 - 1][var25 + var8 - 1] & 19136824) == 0) {
                                       var27 = 1;

                                       while(true) {
                                          if(var27 >= var8 - 1) {
                                             class154.field1476[var38] = var15 - 1;
                                             class154.field1472[var38] = var16;
                                             var38 = var38 + 1 & 4095;
                                             class154.field1474[var35 - 1][var36] = 2;
                                             class154.field1477[var35 - 1][var36] = var26;
                                             break;
                                          }

                                          if((var32[var24 - 1][var27 + var25] & 19136830) != 0) {
                                             break;
                                          }

                                          ++var27;
                                       }
                                    }

                                    if(var35 < 128 - var8 && class154.field1474[var35 + 1][var36] == 0 && (var32[var24 + var8][var25] & 19136899) == 0 && (var32[var24 + var8][var25 + var8 - 1] & 19136992) == 0) {
                                       var27 = 1;

                                       while(true) {
                                          if(var27 >= var8 - 1) {
                                             class154.field1476[var38] = var15 + 1;
                                             class154.field1472[var38] = var16;
                                             var38 = var38 + 1 & 4095;
                                             class154.field1474[var35 + 1][var36] = 8;
                                             class154.field1477[var35 + 1][var36] = var26;
                                             break;
                                          }

                                          if((var32[var24 + var8][var27 + var25] & 19136995) != 0) {
                                             break;
                                          }

                                          ++var27;
                                       }
                                    }

                                    if(var36 > 0 && class154.field1474[var35][var36 - 1] == 0 && (var32[var24][var25 - 1] & 19136782) == 0 && (var32[var8 + var24 - 1][var25 - 1] & 19136899) == 0) {
                                       var27 = 1;

                                       while(true) {
                                          if(var27 >= var8 - 1) {
                                             class154.field1476[var38] = var15;
                                             class154.field1472[var38] = var16 - 1;
                                             var38 = var38 + 1 & 4095;
                                             class154.field1474[var35][var36 - 1] = 1;
                                             class154.field1477[var35][var36 - 1] = var26;
                                             break;
                                          }

                                          if((var32[var24 + var27][var25 - 1] & 19136911) != 0) {
                                             break;
                                          }

                                          ++var27;
                                       }
                                    }

                                    if(var36 < 128 - var8 && class154.field1474[var35][var36 + 1] == 0 && (var32[var24][var25 + var8] & 19136824) == 0 && (var32[var24 + var8 - 1][var8 + var25] & 19136992) == 0) {
                                       var27 = 1;

                                       while(true) {
                                          if(var27 >= var8 - 1) {
                                             class154.field1476[var38] = var15;
                                             class154.field1472[var38] = var16 + 1;
                                             var38 = var38 + 1 & 4095;
                                             class154.field1474[var35][var36 + 1] = 4;
                                             class154.field1477[var35][var36 + 1] = var26;
                                             break;
                                          }

                                          if((var32[var24 + var27][var25 + var8] & 19137016) != 0) {
                                             break;
                                          }

                                          ++var27;
                                       }
                                    }

                                    if(var35 > 0 && var36 > 0 && class154.field1474[var35 - 1][var36 - 1] == 0 && (var32[var24 - 1][var25 - 1] & 19136782) == 0) {
                                       var27 = 1;

                                       while(true) {
                                          if(var27 >= var8) {
                                             class154.field1476[var38] = var15 - 1;
                                             class154.field1472[var38] = var16 - 1;
                                             var38 = var38 + 1 & 4095;
                                             class154.field1474[var35 - 1][var36 - 1] = 3;
                                             class154.field1477[var35 - 1][var36 - 1] = var26;
                                             break;
                                          }

                                          if((var32[var24 - 1][var27 + (var25 - 1)] & 19136830) != 0 || (var32[var27 + (var24 - 1)][var25 - 1] & 19136911) != 0) {
                                             break;
                                          }

                                          ++var27;
                                       }
                                    }

                                    if(var35 < 128 - var8 && var36 > 0 && class154.field1474[var35 + 1][var36 - 1] == 0 && (var32[var8 + var24][var25 - 1] & 19136899) == 0) {
                                       var27 = 1;

                                       while(true) {
                                          if(var27 >= var8) {
                                             class154.field1476[var38] = var15 + 1;
                                             class154.field1472[var38] = var16 - 1;
                                             var38 = var38 + 1 & 4095;
                                             class154.field1474[var35 + 1][var36 - 1] = 9;
                                             class154.field1477[var35 + 1][var36 - 1] = var26;
                                             break;
                                          }

                                          if((var32[var24 + var8][var27 + (var25 - 1)] & 19136995) != 0 || (var32[var27 + var24][var25 - 1] & 19136911) != 0) {
                                             break;
                                          }

                                          ++var27;
                                       }
                                    }

                                    if(var35 > 0 && var36 < 128 - var8 && class154.field1474[var35 - 1][var36 + 1] == 0 && (var32[var24 - 1][var8 + var25] & 19136824) == 0) {
                                       for(var27 = 1; var27 < var8; ++var27) {
                                          if((var32[var24 - 1][var25 + var27] & 19136830) != 0 || (var32[var27 + (var24 - 1)][var8 + var25] & 19137016) != 0) {
                                             continue label636;
                                          }
                                       }

                                       class154.field1476[var38] = var15 - 1;
                                       class154.field1472[var38] = var16 + 1;
                                       var38 = var38 + 1 & 4095;
                                       class154.field1474[var35 - 1][var36 + 1] = 6;
                                       class154.field1477[var35 - 1][var36 + 1] = var26;
                                    }
                                 } while(var35 >= 128 - var8);
                              } while(var36 >= 128 - var8);
                           } while(class154.field1474[var35 + 1][var36 + 1] != 0);
                        } while((var32[var24 + var8][var25 + var8] & 19136992) != 0);

                        for(var27 = 1; var27 < var8; ++var27) {
                           if((var32[var24 + var27][var8 + var25] & 19137016) != 0 || (var32[var8 + var24][var25 + var27] & 19136995) != 0) {
                              continue label659;
                           }
                        }

                        class154.field1476[var38] = var15 + 1;
                        class154.field1472[var38] = var16 + 1;
                        var38 = var38 + 1 & 4095;
                        class154.field1474[var35 + 1][var36 + 1] = 12;
                        class154.field1477[var35 + 1][var36 + 1] = var26;
                     }
                  }

                  var33 = var34;
               }
            }

            int var7;
            label717: {
               var14 = var4 - 64;
               var15 = var5 - 64;
               var16 = class114.field1066;
               var35 = class1.field9;
               if(!var33) {
                  var36 = Integer.MAX_VALUE;
                  var19 = Integer.MAX_VALUE;
                  byte var37 = 10;
                  var38 = var9.field362;
                  var22 = var9.field361;
                  int var23 = var9.field360;
                  var24 = var9.field363;

                  for(var25 = var38 - var37; var25 <= var37 + var38; ++var25) {
                     for(var26 = var22 - var37; var26 <= var37 + var22; ++var26) {
                        var27 = var25 - var14;
                        int var28 = var26 - var15;
                        if(var27 >= 0 && var28 >= 0 && var27 < 128 && var28 < 128 && class154.field1477[var27][var28] < 100) {
                           int var29 = 0;
                           if(var25 < var38) {
                              var29 = var38 - var25;
                           } else if(var25 > var23 + var38 - 1) {
                              var29 = var25 - (var38 + var23 - 1);
                           }

                           int var30 = 0;
                           if(var26 < var22) {
                              var30 = var22 - var26;
                           } else if(var26 > var24 + var22 - 1) {
                              var30 = var26 - (var22 + var24 - 1);
                           }

                           int var31 = var29 * var29 + var30 * var30;
                           if(var31 < var36 || var31 == var36 && class154.field1477[var27][var28] < var19) {
                              var36 = var31;
                              var19 = class154.field1477[var27][var28];
                              var16 = var25;
                              var35 = var26;
                           }
                        }
                     }
                  }

                  if(var36 == Integer.MAX_VALUE) {
                     var7 = -1;
                     break label717;
                  }
               }

               if(var16 == var4 && var5 == var35) {
                  var7 = 0;
               } else {
                  var18 = 0;
                  class154.field1476[var18] = var16;
                  var36 = var18 + 1;
                  class154.field1472[var18] = var35;

                  for(var19 = var20 = class154.field1474[var16 - var14][var35 - var15]; var16 != var4 || var35 != var5; var19 = class154.field1474[var16 - var14][var35 - var15]) {
                     if(var20 != var19) {
                        var20 = var19;
                        class154.field1476[var36] = var16;
                        class154.field1472[var36++] = var35;
                     }

                     if((var19 & 2) != 0) {
                        ++var16;
                     } else if((var19 & 8) != 0) {
                        --var16;
                     }

                     if((var19 & 1) != 0) {
                        ++var35;
                     } else if((var19 & 4) != 0) {
                        --var35;
                     }
                  }

                  var38 = 0;

                  while(var36-- > 0) {
                     var11[var38] = class154.field1476[var36];
                     var12[var38++] = class154.field1472[var36];
                     if(var38 >= var11.length) {
                        break;
                     }
                  }

                  var7 = var38;
               }
            }

            var13 = var7;
            if(var7 >= 1) {
               for(var14 = 0; var14 < var13 - 1; ++var14) {
                  var0.method1128(client.field4005[var14], client.field4006[var14], var3);
               }

            }
         }
      }
   }

   @ObfuscatedName("gs")
   @ObfuscatedSignature(
      signature = "(ZLgl;I)V",
      garbageValue = "-2144123172"
   )
   static final void method692(boolean var0, class214 var1) {
      while(true) {
         if(var1.method3763(client.field3963.packetLength) >= 27) {
            int var2 = var1.readBits(15);
            if(var2 != 32767) {
               boolean var3 = false;
               if(client.field3774[var2] == null) {
                  client.field3774[var2] = new class237();
                  client.cachedNPCsChanged(var2);
                  var3 = true;
               }

               class237 var4 = client.field3774[var2];
               client.field3776[++client.field3775 - 1] = var2;
               var4.field1308 = client.field3744;
               int var5;
               if(var0) {
                  var5 = var1.readBits(8);
                  if(var5 > 127) {
                     var5 -= 256;
                  }
               } else {
                  var5 = var1.readBits(5);
                  if(var5 > 15) {
                     var5 -= 32;
                  }
               }

               int var6 = var1.readBits(1);//teleported
               int var7 = client.field3858[var1.readBits(3)];
               if(var3) {
                  var4.field1310 = var4.field1260 = var7;
               }

               int var8 = var1.readBits(1);//needupdate
               if(var8 == 1) {
                  client.field3778[++client.field3777 - 1] = var2;
               }

               int var9;
               if(var0) {
                  var9 = var1.readBits(8);
                  if(var9 > 127) {
                     var9 -= 256;
                  }
               } else {
                  var9 = var1.readBits(5);
                  if(var9 > 15) {
                     var9 -= 32;
                  }
               }

               class222 var10001 = class25.method361(var1.readBits(14));
               var4.onCompositionChanged((RSNPCComposition)var10001);
               var4.field2400 = var10001;
               var4.field1262 = var4.field2400.field2144;
               var4.field1312 = var4.field2400.field2142;
               if(var4.field1312 == 0) {
                  var4.field1260 = 0;
               }

               var4.field1290 = var4.field2400.field2150;
               var4.field1267 = var4.field2400.field2151;
               var4.field1264 = var4.field2400.field2152;
               var4.field1270 = var4.field2400.field2172;
               var4.field1276 = var4.field2400.field2147;
               var4.field1314 = var4.field2400.field2148;
               var4.field1309 = var4.field2400.field2160;
               var4.method4188(class5.field43.field1288[0] + var5, class5.field43.field1315[0] + var9, var6 == 1);
               continue;
            }
         }

         var1.method3759();
         return;
      }
   }
}
