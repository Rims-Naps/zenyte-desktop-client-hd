package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.api.RSNPCComposition;

@ObfuscatedName("ch")
public class class293 {
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lcn;"
   )
   static class297 field3659;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 945608319
   )
   public static int field3657;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -552378659
   )
   int field3663;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 779446601
   )
   int field3661;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1848473859
   )
   int field3674;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1064543423
   )
   int field3670;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1123455505
   )
   int field3677;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "[Ldm;"
   )
   class309[] field3676;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      longValue = 1975848928586178547L
   )
   long field3668;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1565276207
   )
   int field3671;
   @ObfuscatedName("y")
   boolean field3673;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      longValue = -5385180788903926013L
   )
   long field3664;
   @ObfuscatedName("v")
   protected int[] field3667;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "[Ldm;"
   )
   class309[] field3675;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1994026869
   )
   int field3669;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Ldm;"
   )
   class309 field3662;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 667326527
   )
   int field3666;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      longValue = -2893065377737393135L
   )
   long field3672;

   protected class293() {
      this.field3663 = 32;
      this.field3664 = class321.method6252();
      this.field3668 = 0L;
      this.field3669 = 0;
      this.field3670 = 0;
      this.field3661 = 0;
      this.field3672 = 0L;
      this.field3673 = true;
      this.field3674 = 0;
      this.field3675 = new class309[8];
      this.field3676 = new class309[8];
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(Ldm;B)V",
      garbageValue = "-63"
   )
   public final synchronized void method5718(class309 var1) {
      this.field3662 = var1;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(Ldm;II)V",
      garbageValue = "-804622392"
   )
   final void method5725(class309 var1, int var2) {
      int var3 = var2 >> 5;
      class309 var4 = this.field3676[var3];
      if(var4 == null) {
         this.field3675[var3] = var1;
      } else {
         var4.field3813 = var1;
      }

      this.field3676[var3] = var1;
      var1.field3814 = var2;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-276015572"
   )
   public final synchronized void method5717() {
      this.field3673 = true;

      try {
         this.vmethod5728();
      } catch (Exception var2) {
         this.vmethod5730();
         this.field3668 = class321.method6252() + 2000L;
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1732447930"
   )
   protected void vmethod5728() throws Exception {
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "351660541"
   )
   public final void method5720() {
      this.field3673 = true;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1371354819"
   )
   protected void vmethod5727(int var1) throws Exception {
   }

   @ObfuscatedName("s")
   protected void vmethod5723() throws Exception {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1185336736"
   )
   protected void vmethod5726() throws Exception {
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2020373641"
   )
   public final synchronized void method5722() {
      if(field3659 != null) {
         boolean var1 = true;

         for(int var2 = 0; var2 < 2; ++var2) {
            if(this == field3659.field3702[var2]) {
               field3659.field3702[var2] = null;
            }

            if(field3659.field3702[var2] != null) {
               var1 = false;
            }
         }

         if(var1) {
            class311.field3824.shutdownNow();
            class311.field3824 = null;
            field3659 = null;
         }
      }

      this.vmethod5730();
      this.field3667 = null;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1928361113"
   )
   public final synchronized void method5724() {
      if(this.field3667 != null) {
         long var1 = class321.method6252();

         try {
            if(this.field3668 != 0L) {
               if(var1 < this.field3668) {
                  return;
               }

               this.vmethod5727(this.field3671);
               this.field3668 = 0L;
               this.field3673 = true;
            }

            int var3 = this.vmethod5754();
            if(this.field3661 - var3 > this.field3669) {
               this.field3669 = this.field3661 - var3;
            }

            int var4 = this.field3677 + this.field3666;
            if(var4 + 256 > 16384) {
               var4 = 16128;
            }

            if(var4 + 256 > this.field3671) {
               this.field3671 += 1024;
               if(this.field3671 > 16384) {
                  this.field3671 = 16384;
               }

               this.vmethod5730();
               this.vmethod5727(this.field3671);
               var3 = 0;
               this.field3673 = true;
               if(var4 + 256 > this.field3671) {
                  var4 = this.field3671 - 256;
                  this.field3677 = var4 - this.field3666;
               }
            }

            while(var3 < var4) {
               this.method5736(this.field3667, 256);
               this.vmethod5723();
               var3 += 256;
            }

            if(var1 > this.field3672) {
               if(!this.field3673) {
                  if(this.field3669 == 0 && this.field3670 == 0) {
                     this.vmethod5730();
                     this.field3668 = 2000L + var1;
                     return;
                  }

                  this.field3677 = Math.min(this.field3670, this.field3669);
                  this.field3670 = this.field3669;
               } else {
                  this.field3673 = false;
               }

               this.field3669 = 0;
               this.field3672 = 2000L + var1;
            }

            this.field3661 = var3;
         } catch (Exception var7) {
            this.vmethod5730();
            this.field3668 = var1 + 2000L;
         }

         try {
            if(var1 > this.field3664 + 500000L) {
               var1 = this.field3664;
            }

            while(var1 > 5000L + this.field3664) {
               this.method5756(256);
               this.field3664 += (long)(256000 / field3657);
            }
         } catch (Exception var6) {
            this.field3664 = var1;
         }

      }
   }

   @ObfuscatedName("ad")
   final void method5736(int[] var1, int var2) {
      int var3 = var2;
      if(class268.field3462) {
         var3 = var2 << 1;
      }

      class29.method495(var1, 0, var3);
      this.field3674 -= var2;
      if(this.field3662 != null && this.field3674 <= 0) {
         this.field3674 += field3657 >> 4;
         class32.method533(this.field3662);
         this.method5725(this.field3662, this.field3662.vmethod6079());
         int var4 = 0;
         int var5 = 255;

         int var6;
         class309 var10;
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
                  class309 var11 = this.field3675[var7];

                  label98:
                  while(true) {
                     while(true) {
                        if(var11 == null) {
                           break label98;
                        }

                        class280 var12 = var11.field3816;
                        if(var12 != null && var12.field3546 > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.field3813;
                        } else {
                           var11.field3815 = true;
                           int var13 = var11.vmethod6057();
                           var4 += var13;
                           if(var12 != null) {
                              var12.field3546 += var13;
                           }

                           if(var4 >= this.field3663) {
                              break label104;
                           }

                           class309 var14 = var11.vmethod6056();
                           if(var14 != null) {
                              for(int var15 = var11.field3814; var14 != null; var14 = var11.vmethod6059()) {
                                 this.method5725(var14, var15 * var14.vmethod6079() >> 8);
                              }
                           }

                           class309 var18 = var11.field3813;
                           var11.field3813 = null;
                           if(var10 == null) {
                              this.field3675[var7] = var18;
                           } else {
                              var10.field3813 = var18;
                           }

                           if(var18 == null) {
                              this.field3676[var7] = var10;
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
            class309 var16 = this.field3675[var6];
            class309[] var17 = this.field3675;
            this.field3676[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.field3813;
               var16.field3813 = null;
            }
         }
      }

      if(this.field3674 < 0) {
         this.field3674 = 0;
      }

      if(this.field3662 != null) {
         this.field3662.vmethod6060(var1, 0, var2);
      }

      this.field3664 = class321.method6252();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-128"
   )
   final void method5756(int var1) {
      this.field3674 -= var1;
      if(this.field3674 < 0) {
         this.field3674 = 0;
      }

      if(this.field3662 != null) {
         this.field3662.vmethod6061(var1);
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-18"
   )
   protected void vmethod5730() {
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "16711935"
   )
   protected int vmethod5754() throws Exception {
      return this.field3671;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-2079490806"
   )
   static int method5771(int var0, class296 var1, boolean var2) {
      if(var0 == 3200) {
         MapCacheArchiveNames.field3811 -= 3;
         class225.method4556(class249.field3312[MapCacheArchiveNames.field3811], class249.field3312[MapCacheArchiveNames.field3811 + 1], class249.field3312[MapCacheArchiveNames.field3811 + 2]);
         return 1;
      } else if(var0 == 3201) {
         class230.method4619(class249.field3312[--MapCacheArchiveNames.field3811]);
         return 1;
      } else if(var0 == 3202) {
         MapCacheArchiveNames.field3811 -= 2;
         class96.method1765(class249.field3312[MapCacheArchiveNames.field3811], class249.field3312[MapCacheArchiveNames.field3811 + 1]);
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("gs")
   @ObfuscatedSignature(
      signature = "(ZLgl;I)V",
      garbageValue = "-2144123172"
   )
   static final void method5770(boolean var0, class1 var1) {
      while(true) {
         if(var1.method10(client.field2384.field1768) >= 27) {
            int var2 = var1.method8(15);
            if(var2 != 32767) {
               boolean var3 = false;
               if(client.field2195[var2] == null) {
                  client.field2195[var2] = new class176();
                  client.cachedNPCsChanged(var2);
                  var3 = true;
               }

               class176 var4 = client.field2195[var2];
               client.field2197[++client.field2196 - 1] = var2;
               var4.field1121 = client.field2165;
               int var5;
               if(var0) {
                  var5 = var1.method8(8);
                  if(var5 > 127) {
                     var5 -= 256;
                  }
               } else {
                  var5 = var1.method8(5);
                  if(var5 > 15) {
                     var5 -= 32;
                  }
               }

               int var6 = var1.method8(1);
               int var7 = client.field2279[var1.method8(3)];
               if(var3) {
                  var4.field1123 = var4.field1073 = var7;
               }

               int var8 = var1.method8(1);
               if(var8 == 1) {
                  client.field2199[++client.field2198 - 1] = var2;
               }

               int var9;
               if(var0) {
                  var9 = var1.method8(8);
                  if(var9 > 127) {
                     var9 -= 256;
                  }
               } else {
                  var9 = var1.method8(5);
                  if(var9 > 15) {
                     var9 -= 32;
                  }
               }

               class315 var10001 = WorldMapGameObject.method2480(var1.method8(14));
               var4.onCompositionChanged((RSNPCComposition)var10001);
               var4.field2437 = var10001;
               var4.field1075 = var4.field2437.field3862;
               var4.field1125 = var4.field2437.field3860;
               if(var4.field1125 == 0) {
                  var4.field1073 = 0;
               }

               var4.field1103 = var4.field2437.field3868;
               var4.field1080 = var4.field2437.field3869;
               var4.field1077 = var4.field2437.field3870;
               var4.field1083 = var4.field2437.field3890;
               var4.field1089 = var4.field2437.field3865;
               var4.field1127 = var4.field2437.field3866;
               var4.field1122 = var4.field2437.field3878;
               var4.method3662(class32.field303.field1101[0] + var5, class32.field303.field1128[0] + var9, var6 == 1);
               continue;
            }
         }

         var1.method6();
         return;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Ljava/lang/Class;",
      garbageValue = "2130603368"
   )
   static Class method5773(String var0) throws ClassNotFoundException {
      return var0.equals("B")?Byte.TYPE:(var0.equals("I")?Integer.TYPE:(var0.equals("S")?Short.TYPE:(var0.equals("J")?Long.TYPE:(var0.equals("Z")?Boolean.TYPE:(var0.equals("F")?Float.TYPE:(var0.equals("D")?Double.TYPE:(var0.equals("C")?Character.TYPE:(var0.equals("void")?Void.TYPE:Reflection.findClass(var0)))))))));
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "([BI)Lkn;",
      garbageValue = "-1521600080"
   )
   static class299 method5774(byte[] var0) {
      if(var0 == null) {
         return null;
      } else {
         class299 var1 = new class299(var0, class42.field476, class212.field2925, class212.field2922, class192.field2745, class225.field3040, class191.field2740);
         class42.field476 = null;
         class212.field2925 = null;
         class212.field2922 = null;
         class192.field2745 = null;
         class225.field3040 = null;
         class191.field2740 = null;
         return var1;
      }
   }

   @ObfuscatedName("he")
   @ObfuscatedSignature(
      signature = "(Lbw;IIBI)V",
      garbageValue = "1814280594"
   )
   static final void method5739(class199 var0, int var1, int var2, byte var3) {
      int var4 = var0.field1101[0];
      int var5 = var0.field1128[0];
      int var6 = var0.method3955();
      if(var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) {
         if(var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) {
            int var8 = var0.method3955();
            class31 var9 = class176.method3673(var1, var2);
            class3 var10 = client.field2211[var0.field2805];
            int[] var11 = client.field2426;
            int[] var12 = client.field2427;

            int var13;
            int var14;
            for(var13 = 0; var13 < 128; ++var13) {
               for(var14 = 0; var14 < 128; ++var14) {
                  class180.field2465[var13][var14] = 0;
                  class180.field2468[var13][var14] = 99999999;
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
               var33 = class57.method1249(var4, var5, var9, var10);
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
                  class180.field2465[var17][var18] = 99;
                  class180.field2468[var17][var18] = 0;
                  var21 = 0;
                  var22 = 0;
                  class180.field2467[var21] = var4;
                  var38 = var21 + 1;
                  class180.field2463[var21] = var5;
                  var32 = var10.field35;

                  while(true) {
                     if(var22 == var38) {
                        class22.field240 = var15;
                        class328.field3971 = var16;
                        var34 = false;
                        break;
                     }

                     var15 = class180.field2467[var22];
                     var16 = class180.field2463[var22];
                     var22 = var22 + 1 & 4095;
                     var35 = var15 - var19;
                     var36 = var16 - var20;
                     var24 = var15 - var10.field31;
                     var25 = var16 - var10.field32;
                     if(var9.vmethod5314(2, var15, var16, var10)) {
                        class22.field240 = var15;
                        class328.field3971 = var16;
                        var34 = true;
                        break;
                     }

                     var26 = class180.field2468[var35][var36] + 1;
                     if(var35 > 0 && class180.field2465[var35 - 1][var36] == 0 && (var32[var24 - 1][var25] & 19136782) == 0 && (var32[var24 - 1][var25 + 1] & 19136824) == 0) {
                        class180.field2467[var38] = var15 - 1;
                        class180.field2463[var38] = var16;
                        var38 = var38 + 1 & 4095;
                        class180.field2465[var35 - 1][var36] = 2;
                        class180.field2468[var35 - 1][var36] = var26;
                     }

                     if(var35 < 126 && class180.field2465[var35 + 1][var36] == 0 && (var32[var24 + 2][var25] & 19136899) == 0 && (var32[var24 + 2][var25 + 1] & 19136992) == 0) {
                        class180.field2467[var38] = var15 + 1;
                        class180.field2463[var38] = var16;
                        var38 = var38 + 1 & 4095;
                        class180.field2465[var35 + 1][var36] = 8;
                        class180.field2468[var35 + 1][var36] = var26;
                     }

                     if(var36 > 0 && class180.field2465[var35][var36 - 1] == 0 && (var32[var24][var25 - 1] & 19136782) == 0 && (var32[var24 + 1][var25 - 1] & 19136899) == 0) {
                        class180.field2467[var38] = var15;
                        class180.field2463[var38] = var16 - 1;
                        var38 = var38 + 1 & 4095;
                        class180.field2465[var35][var36 - 1] = 1;
                        class180.field2468[var35][var36 - 1] = var26;
                     }

                     if(var36 < 126 && class180.field2465[var35][var36 + 1] == 0 && (var32[var24][var25 + 2] & 19136824) == 0 && (var32[var24 + 1][var25 + 2] & 19136992) == 0) {
                        class180.field2467[var38] = var15;
                        class180.field2463[var38] = var16 + 1;
                        var38 = var38 + 1 & 4095;
                        class180.field2465[var35][var36 + 1] = 4;
                        class180.field2468[var35][var36 + 1] = var26;
                     }

                     if(var35 > 0 && var36 > 0 && class180.field2465[var35 - 1][var36 - 1] == 0 && (var32[var24 - 1][var25] & 19136830) == 0 && (var32[var24 - 1][var25 - 1] & 19136782) == 0 && (var32[var24][var25 - 1] & 19136911) == 0) {
                        class180.field2467[var38] = var15 - 1;
                        class180.field2463[var38] = var16 - 1;
                        var38 = var38 + 1 & 4095;
                        class180.field2465[var35 - 1][var36 - 1] = 3;
                        class180.field2468[var35 - 1][var36 - 1] = var26;
                     }

                     if(var35 < 126 && var36 > 0 && class180.field2465[var35 + 1][var36 - 1] == 0 && (var32[var24 + 1][var25 - 1] & 19136911) == 0 && (var32[var24 + 2][var25 - 1] & 19136899) == 0 && (var32[var24 + 2][var25] & 19136995) == 0) {
                        class180.field2467[var38] = var15 + 1;
                        class180.field2463[var38] = var16 - 1;
                        var38 = var38 + 1 & 4095;
                        class180.field2465[var35 + 1][var36 - 1] = 9;
                        class180.field2468[var35 + 1][var36 - 1] = var26;
                     }

                     if(var35 > 0 && var36 < 126 && class180.field2465[var35 - 1][var36 + 1] == 0 && (var32[var24 - 1][var25 + 1] & 19136830) == 0 && (var32[var24 - 1][var25 + 2] & 19136824) == 0 && (var32[var24][var25 + 2] & 19137016) == 0) {
                        class180.field2467[var38] = var15 - 1;
                        class180.field2463[var38] = var16 + 1;
                        var38 = var38 + 1 & 4095;
                        class180.field2465[var35 - 1][var36 + 1] = 6;
                        class180.field2468[var35 - 1][var36 + 1] = var26;
                     }

                     if(var35 < 126 && var36 < 126 && class180.field2465[var35 + 1][var36 + 1] == 0 && (var32[var24 + 1][var25 + 2] & 19137016) == 0 && (var32[var24 + 2][var25 + 2] & 19136992) == 0 && (var32[var24 + 2][var25 + 1] & 19136995) == 0) {
                        class180.field2467[var38] = var15 + 1;
                        class180.field2463[var38] = var16 + 1;
                        var38 = var38 + 1 & 4095;
                        class180.field2465[var35 + 1][var36 + 1] = 12;
                        class180.field2468[var35 + 1][var36 + 1] = var26;
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
                  class180.field2465[var17][var18] = 99;
                  class180.field2468[var17][var18] = 0;
                  var21 = 0;
                  var22 = 0;
                  class180.field2467[var21] = var4;
                  var38 = var21 + 1;
                  class180.field2463[var21] = var5;
                  var32 = var10.field35;

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
                                       class22.field240 = var15;
                                       class328.field3971 = var16;
                                       var34 = false;
                                       break label661;
                                    }

                                    var15 = class180.field2467[var22];
                                    var16 = class180.field2463[var22];
                                    var22 = var22 + 1 & 4095;
                                    var35 = var15 - var19;
                                    var36 = var16 - var20;
                                    var24 = var15 - var10.field31;
                                    var25 = var16 - var10.field32;
                                    if(var9.vmethod5314(var8, var15, var16, var10)) {
                                       class22.field240 = var15;
                                       class328.field3971 = var16;
                                       var34 = true;
                                       break label661;
                                    }

                                    var26 = class180.field2468[var35][var36] + 1;
                                    if(var35 > 0 && class180.field2465[var35 - 1][var36] == 0 && (var32[var24 - 1][var25] & 19136782) == 0 && (var32[var24 - 1][var25 + var8 - 1] & 19136824) == 0) {
                                       var27 = 1;

                                       while(true) {
                                          if(var27 >= var8 - 1) {
                                             class180.field2467[var38] = var15 - 1;
                                             class180.field2463[var38] = var16;
                                             var38 = var38 + 1 & 4095;
                                             class180.field2465[var35 - 1][var36] = 2;
                                             class180.field2468[var35 - 1][var36] = var26;
                                             break;
                                          }

                                          if((var32[var24 - 1][var27 + var25] & 19136830) != 0) {
                                             break;
                                          }

                                          ++var27;
                                       }
                                    }

                                    if(var35 < 128 - var8 && class180.field2465[var35 + 1][var36] == 0 && (var32[var24 + var8][var25] & 19136899) == 0 && (var32[var24 + var8][var25 + var8 - 1] & 19136992) == 0) {
                                       var27 = 1;

                                       while(true) {
                                          if(var27 >= var8 - 1) {
                                             class180.field2467[var38] = var15 + 1;
                                             class180.field2463[var38] = var16;
                                             var38 = var38 + 1 & 4095;
                                             class180.field2465[var35 + 1][var36] = 8;
                                             class180.field2468[var35 + 1][var36] = var26;
                                             break;
                                          }

                                          if((var32[var24 + var8][var27 + var25] & 19136995) != 0) {
                                             break;
                                          }

                                          ++var27;
                                       }
                                    }

                                    if(var36 > 0 && class180.field2465[var35][var36 - 1] == 0 && (var32[var24][var25 - 1] & 19136782) == 0 && (var32[var8 + var24 - 1][var25 - 1] & 19136899) == 0) {
                                       var27 = 1;

                                       while(true) {
                                          if(var27 >= var8 - 1) {
                                             class180.field2467[var38] = var15;
                                             class180.field2463[var38] = var16 - 1;
                                             var38 = var38 + 1 & 4095;
                                             class180.field2465[var35][var36 - 1] = 1;
                                             class180.field2468[var35][var36 - 1] = var26;
                                             break;
                                          }

                                          if((var32[var24 + var27][var25 - 1] & 19136911) != 0) {
                                             break;
                                          }

                                          ++var27;
                                       }
                                    }

                                    if(var36 < 128 - var8 && class180.field2465[var35][var36 + 1] == 0 && (var32[var24][var25 + var8] & 19136824) == 0 && (var32[var24 + var8 - 1][var8 + var25] & 19136992) == 0) {
                                       var27 = 1;

                                       while(true) {
                                          if(var27 >= var8 - 1) {
                                             class180.field2467[var38] = var15;
                                             class180.field2463[var38] = var16 + 1;
                                             var38 = var38 + 1 & 4095;
                                             class180.field2465[var35][var36 + 1] = 4;
                                             class180.field2468[var35][var36 + 1] = var26;
                                             break;
                                          }

                                          if((var32[var24 + var27][var25 + var8] & 19137016) != 0) {
                                             break;
                                          }

                                          ++var27;
                                       }
                                    }

                                    if(var35 > 0 && var36 > 0 && class180.field2465[var35 - 1][var36 - 1] == 0 && (var32[var24 - 1][var25 - 1] & 19136782) == 0) {
                                       var27 = 1;

                                       while(true) {
                                          if(var27 >= var8) {
                                             class180.field2467[var38] = var15 - 1;
                                             class180.field2463[var38] = var16 - 1;
                                             var38 = var38 + 1 & 4095;
                                             class180.field2465[var35 - 1][var36 - 1] = 3;
                                             class180.field2468[var35 - 1][var36 - 1] = var26;
                                             break;
                                          }

                                          if((var32[var24 - 1][var27 + (var25 - 1)] & 19136830) != 0 || (var32[var27 + (var24 - 1)][var25 - 1] & 19136911) != 0) {
                                             break;
                                          }

                                          ++var27;
                                       }
                                    }

                                    if(var35 < 128 - var8 && var36 > 0 && class180.field2465[var35 + 1][var36 - 1] == 0 && (var32[var8 + var24][var25 - 1] & 19136899) == 0) {
                                       var27 = 1;

                                       while(true) {
                                          if(var27 >= var8) {
                                             class180.field2467[var38] = var15 + 1;
                                             class180.field2463[var38] = var16 - 1;
                                             var38 = var38 + 1 & 4095;
                                             class180.field2465[var35 + 1][var36 - 1] = 9;
                                             class180.field2468[var35 + 1][var36 - 1] = var26;
                                             break;
                                          }

                                          if((var32[var24 + var8][var27 + (var25 - 1)] & 19136995) != 0 || (var32[var27 + var24][var25 - 1] & 19136911) != 0) {
                                             break;
                                          }

                                          ++var27;
                                       }
                                    }

                                    if(var35 > 0 && var36 < 128 - var8 && class180.field2465[var35 - 1][var36 + 1] == 0 && (var32[var24 - 1][var8 + var25] & 19136824) == 0) {
                                       for(var27 = 1; var27 < var8; ++var27) {
                                          if((var32[var24 - 1][var25 + var27] & 19136830) != 0 || (var32[var27 + (var24 - 1)][var8 + var25] & 19137016) != 0) {
                                             continue label636;
                                          }
                                       }

                                       class180.field2467[var38] = var15 - 1;
                                       class180.field2463[var38] = var16 + 1;
                                       var38 = var38 + 1 & 4095;
                                       class180.field2465[var35 - 1][var36 + 1] = 6;
                                       class180.field2468[var35 - 1][var36 + 1] = var26;
                                    }
                                 } while(var35 >= 128 - var8);
                              } while(var36 >= 128 - var8);
                           } while(class180.field2465[var35 + 1][var36 + 1] != 0);
                        } while((var32[var24 + var8][var25 + var8] & 19136992) != 0);

                        for(var27 = 1; var27 < var8; ++var27) {
                           if((var32[var24 + var27][var8 + var25] & 19137016) != 0 || (var32[var8 + var24][var25 + var27] & 19136995) != 0) {
                              continue label659;
                           }
                        }

                        class180.field2467[var38] = var15 + 1;
                        class180.field2463[var38] = var16 + 1;
                        var38 = var38 + 1 & 4095;
                        class180.field2465[var35 + 1][var36 + 1] = 12;
                        class180.field2468[var35 + 1][var36 + 1] = var26;
                     }
                  }

                  var33 = var34;
               }
            }

            int var7;
            label717: {
               var14 = var4 - 64;
               var15 = var5 - 64;
               var16 = class22.field240;
               var35 = class328.field3971;
               if(!var33) {
                  var36 = Integer.MAX_VALUE;
                  var19 = Integer.MAX_VALUE;
                  byte var37 = 10;
                  var38 = var9.field290;
                  var22 = var9.field289;
                  int var23 = var9.field288;
                  var24 = var9.field291;

                  for(var25 = var38 - var37; var25 <= var37 + var38; ++var25) {
                     for(var26 = var22 - var37; var26 <= var37 + var22; ++var26) {
                        var27 = var25 - var14;
                        int var28 = var26 - var15;
                        if(var27 >= 0 && var28 >= 0 && var27 < 128 && var28 < 128 && class180.field2468[var27][var28] < 100) {
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
                           if(var31 < var36 || var31 == var36 && class180.field2468[var27][var28] < var19) {
                              var36 = var31;
                              var19 = class180.field2468[var27][var28];
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
                  class180.field2467[var18] = var16;
                  var36 = var18 + 1;
                  class180.field2463[var18] = var35;

                  for(var19 = var20 = class180.field2465[var16 - var14][var35 - var15]; var16 != var4 || var35 != var5; var19 = class180.field2465[var16 - var14][var35 - var15]) {
                     if(var20 != var19) {
                        var20 = var19;
                        class180.field2467[var36] = var16;
                        class180.field2463[var36++] = var35;
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
                     var11[var38] = class180.field2467[var36];
                     var12[var38++] = class180.field2463[var36];
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
                  var0.method3994(client.field2426[var14], client.field2427[var14], var3);
               }

            }
         }
      }
   }
}
