package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSNPCComposition;

@ObfuscatedName("hy")
public class class35 extends class197 {
   @ObfuscatedName("fl")
   @ObfuscatedGetter(
      intValue = 246175447
   )
   static int field360;
   @ObfuscatedName("p")
   int[] field358;
   @ObfuscatedName("c")
   byte[] field357;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "[Lcr;"
   )
   class33[] field352;
   @ObfuscatedName("s")
   byte[] field354;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -709017225
   )
   int field361;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "[Lhi;"
   )
   class67[] field356;
   @ObfuscatedName("e")
   byte[] field355;
   @ObfuscatedName("w")
   short[] field351;

   class35(byte[] var1) {
      this.field352 = new class33[128];
      this.field351 = new short[128];
      this.field354 = new byte[128];
      this.field355 = new byte[128];
      this.field356 = new class67[128];
      this.field357 = new byte[128];
      this.field358 = new int[128];
      class125 var2 = new class125(var1);

      int var3;
      for(var3 = 0; var2.field1694[var3 + var2.field1693] != 0; ++var3) {
         ;
      }

      byte[] var4 = new byte[var3];

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         var4[var5] = var2.method2257();
      }

      ++var2.field1693;
      ++var3;
      var5 = var2.field1693;
      var2.field1693 += var3;

      int var6;
      for(var6 = 0; var2.field1694[var6 + var2.field1693] != 0; ++var6) {
         ;
      }

      byte[] var7 = new byte[var6];

      int var8;
      for(var8 = 0; var8 < var6; ++var8) {
         var7[var8] = var2.method2257();
      }

      ++var2.field1693;
      ++var6;
      var8 = var2.field1693;
      var2.field1693 += var6;

      int var9;
      for(var9 = 0; var2.field1694[var9 + var2.field1693] != 0; ++var9) {
         ;
      }

      byte[] var10 = new byte[var9];

      for(int var11 = 0; var11 < var9; ++var11) {
         var10[var11] = var2.method2257();
      }

      ++var2.field1693;
      ++var9;
      byte[] var36 = new byte[var9];
      int var12;
      int var14;
      if(var9 > 1) {
         var36[1] = 1;
         int var13 = 1;
         var12 = 2;

         for(var14 = 2; var14 < var9; ++var14) {
            int var15 = var2.method2256();
            if(var15 == 0) {
               var13 = var12++;
            } else {
               if(var15 <= var13) {
                  --var15;
               }

               var13 = var15;
            }

            var36[var14] = (byte)var13;
         }
      } else {
         var12 = var9;
      }

      class67[] var37 = new class67[var12];

      class67 var38;
      for(var14 = 0; var14 < var37.length; ++var14) {
         var38 = var37[var14] = new class67();
         int var16 = var2.method2256();
         if(var16 > 0) {
            var38.field793 = new byte[var16 * 2];
         }

         var16 = var2.method2256();
         if(var16 > 0) {
            var38.field794 = new byte[var16 * 2 + 2];
            var38.field794[1] = 64;
         }
      }

      var14 = var2.method2256();
      byte[] var45 = var14 > 0?new byte[var14 * 2]:null;
      var14 = var2.method2256();
      byte[] var39 = var14 > 0?new byte[var14 * 2]:null;

      int var17;
      for(var17 = 0; var2.field1694[var17 + var2.field1693] != 0; ++var17) {
         ;
      }

      byte[] var18 = new byte[var17];

      int var19;
      for(var19 = 0; var19 < var17; ++var19) {
         var18[var19] = var2.method2257();
      }

      ++var2.field1693;
      ++var17;
      var19 = 0;

      int var20;
      for(var20 = 0; var20 < 128; ++var20) {
         var19 += var2.method2256();
         this.field351[var20] = (short)var19;
      }

      var19 = 0;

      for(var20 = 0; var20 < 128; ++var20) {
         var19 += var2.method2256();
         this.field351[var20] = (short)(this.field351[var20] + (var19 << 8));
      }

      var20 = 0;
      int var21 = 0;
      int var22 = 0;

      int var23;
      for(var23 = 0; var23 < 128; ++var23) {
         if(var20 == 0) {
            if(var21 < var18.length) {
               var20 = var18[var21++];
            } else {
               var20 = -1;
            }

            var22 = var2.method2263();
         }

         this.field351[var23] = (short)(this.field351[var23] + ((var22 - 1 & 2) << 14));
         this.field358[var23] = var22;
         --var20;
      }

      var20 = 0;
      var21 = 0;
      var23 = 0;

      int var24;
      for(var24 = 0; var24 < 128; ++var24) {
         if(this.field358[var24] != 0) {
            if(var20 == 0) {
               if(var21 < var4.length) {
                  var20 = var4[var21++];
               } else {
                  var20 = -1;
               }

               var23 = var2.field1694[var5++] - 1;
            }

            this.field357[var24] = (byte)var23;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      var24 = 0;

      for(int var25 = 0; var25 < 128; ++var25) {
         if(this.field358[var25] != 0) {
            if(var20 == 0) {
               if(var21 < var7.length) {
                  var20 = var7[var21++];
               } else {
                  var20 = -1;
               }

               var24 = var2.field1694[var8++] + 16 << 2;
            }

            this.field355[var25] = (byte)var24;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      class67 var40 = null;

      int var26;
      for(var26 = 0; var26 < 128; ++var26) {
         if(this.field358[var26] != 0) {
            if(var20 == 0) {
               var40 = var37[var36[var21]];
               if(var21 < var10.length) {
                  var20 = var10[var21++];
               } else {
                  var20 = -1;
               }
            }

            this.field356[var26] = var40;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      var26 = 0;

      int var27;
      for(var27 = 0; var27 < 128; ++var27) {
         if(var20 == 0) {
            if(var21 < var18.length) {
               var20 = var18[var21++];
            } else {
               var20 = -1;
            }

            if(this.field358[var27] > 0) {
               var26 = var2.method2256() + 1;
            }
         }

         this.field354[var27] = (byte)var26;
         --var20;
      }

      this.field361 = var2.method2256() + 1;

      class67 var28;
      int var29;
      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if(var28.field793 != null) {
            for(var29 = 1; var29 < var28.field793.length; var29 += 2) {
               var28.field793[var29] = var2.method2257();
            }
         }

         if(var28.field794 != null) {
            for(var29 = 3; var29 < var28.field794.length - 2; var29 += 2) {
               var28.field794[var29] = var2.method2257();
            }
         }
      }

      if(var45 != null) {
         for(var27 = 1; var27 < var45.length; var27 += 2) {
            var45[var27] = var2.method2257();
         }
      }

      if(var39 != null) {
         for(var27 = 1; var27 < var39.length; var27 += 2) {
            var39[var27] = var2.method2257();
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if(var28.field794 != null) {
            var19 = 0;

            for(var29 = 2; var29 < var28.field794.length; var29 += 2) {
               var19 = 1 + var19 + var2.method2256();
               var28.field794[var29] = (byte)var19;
            }
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if(var28.field793 != null) {
            var19 = 0;

            for(var29 = 2; var29 < var28.field793.length; var29 += 2) {
               var19 = 1 + var19 + var2.method2256();
               var28.field793[var29] = (byte)var19;
            }
         }
      }

      byte var30;
      int var32;
      int var33;
      int var34;
      int var42;
      byte var44;
      if(var45 != null) {
         var19 = var2.method2256();
         var45[0] = (byte)var19;

         for(var27 = 2; var27 < var45.length; var27 += 2) {
            var19 = var19 + 1 + var2.method2256();
            var45[var27] = (byte)var19;
         }

         var44 = var45[0];
         byte var41 = var45[1];

         for(var29 = 0; var29 < var44; ++var29) {
            this.field354[var29] = (byte)(var41 * this.field354[var29] + 32 >> 6);
         }

         for(var29 = 2; var29 < var45.length; var29 += 2) {
            var30 = var45[var29];
            byte var31 = var45[var29 + 1];
            var32 = var41 * (var30 - var44) + (var30 - var44) / 2;

            for(var33 = var44; var33 < var30; ++var33) {
               var34 = class154.method2821(var32, var30 - var44);
               this.field354[var33] = (byte)(var34 * this.field354[var33] + 32 >> 6);
               var32 += var31 - var41;
            }

            var44 = var30;
            var41 = var31;
         }

         for(var42 = var44; var42 < 128; ++var42) {
            this.field354[var42] = (byte)(var41 * this.field354[var42] + 32 >> 6);
         }

         var38 = null;
      }

      if(var39 != null) {
         var19 = var2.method2256();
         var39[0] = (byte)var19;

         for(var27 = 2; var27 < var39.length; var27 += 2) {
            var19 = 1 + var19 + var2.method2256();
            var39[var27] = (byte)var19;
         }

         var44 = var39[0];
         int var47 = var39[1] << 1;

         for(var29 = 0; var29 < var44; ++var29) {
            var42 = var47 + (this.field355[var29] & 255);
            if(var42 < 0) {
               var42 = 0;
            }

            if(var42 > 128) {
               var42 = 128;
            }

            this.field355[var29] = (byte)var42;
         }

         int var43;
         for(var29 = 2; var29 < var39.length; var29 += 2) {
            var30 = var39[var29];
            var43 = var39[var29 + 1] << 1;
            var32 = var47 * (var30 - var44) + (var30 - var44) / 2;

            for(var33 = var44; var33 < var30; ++var33) {
               var34 = class154.method2821(var32, var30 - var44);
               int var35 = var34 + (this.field355[var33] & 255);
               if(var35 < 0) {
                  var35 = 0;
               }

               if(var35 > 128) {
                  var35 = 128;
               }

               this.field355[var33] = (byte)var35;
               var32 += var43 - var47;
            }

            var44 = var30;
            var47 = var43;
         }

         for(var42 = var44; var42 < 128; ++var42) {
            var43 = var47 + (this.field355[var42] & 255);
            if(var43 < 0) {
               var43 = 0;
            }

            if(var43 > 128) {
               var43 = 128;
            }

            this.field355[var42] = (byte)var43;
         }

         Object var46 = null;
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var37[var27].field802 = var2.method2256();
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if(var28.field793 != null) {
            var28.field796 = var2.method2256();
         }

         if(var28.field794 != null) {
            var28.field797 = var2.method2256();
         }

         if(var28.field802 > 0) {
            var28.field798 = var2.method2256();
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var37[var27].field800 = var2.method2256();
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if(var28.field800 > 0) {
            var28.field795 = var2.method2256();
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if(var28.field795 > 0) {
            var28.field801 = var2.method2256();
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "4927975"
   )
   void method620() {
      this.field358 = null;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lct;[B[II)Z",
      garbageValue = "1428523324"
   )
   boolean method622(class259 var1, byte[] var2, int[] var3) {
      boolean var4 = true;
      int var5 = 0;
      class33 var6 = null;

      for(int var7 = 0; var7 < 128; ++var7) {
         if(var2 == null || var2[var7] != 0) {
            int var8 = this.field358[var7];
            if(var8 != 0) {
               if(var8 != var5) {
                  var5 = var8--;
                  if((var8 & 1) == 0) {
                     var6 = var1.method5173(var8 >> 2, var3);
                  } else {
                     var6 = var1.method5176(var8 >> 2, var3);
                  }

                  if(var6 == null) {
                     var4 = false;
                  }
               }

               if(var6 != null) {
                  this.field352[var7] = var6;
                  this.field358[var7] = 0;
               }
            }
         }
      }

      return var4;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(IIIIIILdh;Lfr;B)V",
      garbageValue = "11"
   )
   static final void method624(int var0, int var1, int var2, int var3, int var4, int var5, class111 var6, class3 var7) {
      if(!client.field2157 || (class185.field2512[0][var1][var2] & 2) != 0 || (class185.field2512[var0][var1][var2] & 16) == 0) {
         if(var0 < class185.field2519) {
            class185.field2519 = var0;
         }

         class15 var8 = class285.method5484(var3);
         int var9;
         int var10;
         if(var4 != 1 && var4 != 3) {
            var9 = var8.field150;
            var10 = var8.field193;
         } else {
            var9 = var8.field193;
            var10 = var8.field150;
         }

         int var11;
         int var12;
         if(var9 + var1 <= 104) {
            var11 = (var9 >> 1) + var1;
            var12 = (var9 + 1 >> 1) + var1;
         } else {
            var11 = var1;
            var12 = var1 + 1;
         }

         int var13;
         int var14;
         if(var10 + var2 <= 104) {
            var13 = (var10 >> 1) + var2;
            var14 = var2 + (var10 + 1 >> 1);
         } else {
            var13 = var2;
            var14 = var2 + 1;
         }

         int[][] var15 = class185.field2522[var0];
         int var16 = var15[var12][var13] + var15[var11][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
         int var17 = (var1 << 7) + (var9 << 6);
         int var18 = (var2 << 7) + (var10 << 6);
         long var19 = class282.method5439(var1, var2, 2, var8.field167 == 0, var3);
         int var21 = var5 + (var4 << 6);
         if(var8.field188 == 1) {
            var21 += 256;
         }

         int var23;
         int var24;
         if(var8.method328()) {
            class186 var22 = new class186();
            var22.field2529 = var0;
            var22.field2530 = var1 * 128;
            var22.field2531 = var2 * 128;
            var23 = var8.field150;
            var24 = var8.field193;
            if(var4 == 1 || var4 == 3) {
               var23 = var8.field193;
               var24 = var8.field150;
            }

            var22.field2539 = (var23 + var1) * 128;
            var22.field2533 = (var24 + var2) * 128;
            var22.field2532 = var8.field192;
            var22.field2534 = var8.field151 * 128;
            var22.field2537 = var8.field194;
            var22.field2538 = var8.field195;
            var22.field2528 = var8.field160;
            if(var8.field189 != null) {
               var22.field2542 = var8;
               var22.method3749();
            }

            class186.field2540.method1499(var22);
            if(var22.field2528 != null) {
               var22.field2535 = var22.field2537 + (int)(Math.random() * (double)(var22.field2538 - var22.field2537));
            }
         }

         Object var34;
         if(var5 == 22) {
            if(!client.field2157 || var8.field167 != 0 || var8.field173 == 1 || var8.field186) {
               if(var8.field171 == -1 && var8.field189 == null) {
                  var34 = var8.method321(22, var4, var15, var17, var16, var18);
               } else {
                  var34 = new class321(var3, 22, var4, var0, var1, var2, var8.field171, true, (class102)null);
               }

               var6.method2001(var0, var1, var2, var16, (class102)var34, var19, var21);
               if(var8.field173 == 1 && var7 != null) {
                  var7.method47(var1, var2);
               }

            }
         } else if(var5 != 10 && var5 != 11) {
            if(var5 >= 12) {
               if(var8.field171 == -1 && var8.field189 == null) {
                  var34 = var8.method321(var5, var4, var15, var17, var16, var18);
               } else {
                  var34 = new class321(var3, var5, var4, var0, var1, var2, var8.field171, true, (class102)null);
               }

               var6.method1935(var0, var1, var2, var16, 1, 1, (class102)var34, 0, var19, var21);
               if(var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                  class142.field1808[var0][var1][var2] |= 2340;
               }

               if(var8.field173 != 0 && var7 != null) {
                  var7.method45(var1, var2, var9, var10, var8.field166);
               }

            } else if(var5 == 0) {
               if(var8.field171 == -1 && var8.field189 == null) {
                  var34 = var8.method321(0, var4, var15, var17, var16, var18);
               } else {
                  var34 = new class321(var3, 0, var4, var0, var1, var2, var8.field171, true, (class102)null);
               }

               var6.method1933(var0, var1, var2, var16, (class102)var34, (class102)null, class185.field2518[var4], 0, var19, var21);
               if(var4 == 0) {
                  if(var8.field165) {
                     class285.field3573[var0][var1][var2] = 50;
                     class285.field3573[var0][var1][var2 + 1] = 50;
                  }

                  if(var8.field164) {
                     class142.field1808[var0][var1][var2] |= 585;
                  }
               } else if(var4 == 1) {
                  if(var8.field165) {
                     class285.field3573[var0][var1][var2 + 1] = 50;
                     class285.field3573[var0][var1 + 1][var2 + 1] = 50;
                  }

                  if(var8.field164) {
                     class142.field1808[var0][var1][1 + var2] |= 1170;
                  }
               } else if(var4 == 2) {
                  if(var8.field165) {
                     class285.field3573[var0][var1 + 1][var2] = 50;
                     class285.field3573[var0][var1 + 1][var2 + 1] = 50;
                  }

                  if(var8.field164) {
                     class142.field1808[var0][var1 + 1][var2] |= 585;
                  }
               } else if(var4 == 3) {
                  if(var8.field165) {
                     class285.field3573[var0][var1][var2] = 50;
                     class285.field3573[var0][var1 + 1][var2] = 50;
                  }

                  if(var8.field164) {
                     class142.field1808[var0][var1][var2] |= 1170;
                  }
               }

               if(var8.field173 != 0 && var7 != null) {
                  var7.method44(var1, var2, var5, var4, var8.field166);
               }

               if(var8.field172 != 16) {
                  var6.method2072(var0, var1, var2, var8.field172);
               }

            } else if(var5 == 1) {
               if(var8.field171 == -1 && var8.field189 == null) {
                  var34 = var8.method321(1, var4, var15, var17, var16, var18);
               } else {
                  var34 = new class321(var3, 1, var4, var0, var1, var2, var8.field171, true, (class102)null);
               }

               var6.method1933(var0, var1, var2, var16, (class102)var34, (class102)null, class185.field2511[var4], 0, var19, var21);
               if(var8.field165) {
                  if(var4 == 0) {
                     class285.field3573[var0][var1][var2 + 1] = 50;
                  } else if(var4 == 1) {
                     class285.field3573[var0][var1 + 1][var2 + 1] = 50;
                  } else if(var4 == 2) {
                     class285.field3573[var0][var1 + 1][var2] = 50;
                  } else if(var4 == 3) {
                     class285.field3573[var0][var1][var2] = 50;
                  }
               }

               if(var8.field173 != 0 && var7 != null) {
                  var7.method44(var1, var2, var5, var4, var8.field166);
               }

            } else {
               int var28;
               if(var5 == 2) {
                  var28 = var4 + 1 & 3;
                  Object var29;
                  Object var30;
                  if(var8.field171 == -1 && var8.field189 == null) {
                     var29 = var8.method321(2, var4 + 4, var15, var17, var16, var18);
                     var30 = var8.method321(2, var28, var15, var17, var16, var18);
                  } else {
                     var29 = new class321(var3, 2, var4 + 4, var0, var1, var2, var8.field171, true, (class102)null);
                     var30 = new class321(var3, 2, var28, var0, var1, var2, var8.field171, true, (class102)null);
                  }

                  var6.method1933(var0, var1, var2, var16, (class102)var29, (class102)var30, class185.field2518[var4], class185.field2518[var28], var19, var21);
                  if(var8.field164) {
                     if(var4 == 0) {
                        class142.field1808[var0][var1][var2] |= 585;
                        class142.field1808[var0][var1][var2 + 1] |= 1170;
                     } else if(var4 == 1) {
                        class142.field1808[var0][var1][1 + var2] |= 1170;
                        class142.field1808[var0][var1 + 1][var2] |= 585;
                     } else if(var4 == 2) {
                        class142.field1808[var0][var1 + 1][var2] |= 585;
                        class142.field1808[var0][var1][var2] |= 1170;
                     } else if(var4 == 3) {
                        class142.field1808[var0][var1][var2] |= 1170;
                        class142.field1808[var0][var1][var2] |= 585;
                     }
                  }

                  if(var8.field173 != 0 && var7 != null) {
                     var7.method44(var1, var2, var5, var4, var8.field166);
                  }

                  if(var8.field172 != 16) {
                     var6.method2072(var0, var1, var2, var8.field172);
                  }

               } else if(var5 == 3) {
                  if(var8.field171 == -1 && var8.field189 == null) {
                     var34 = var8.method321(3, var4, var15, var17, var16, var18);
                  } else {
                     var34 = new class321(var3, 3, var4, var0, var1, var2, var8.field171, true, (class102)null);
                  }

                  var6.method1933(var0, var1, var2, var16, (class102)var34, (class102)null, class185.field2511[var4], 0, var19, var21);
                  if(var8.field165) {
                     if(var4 == 0) {
                        class285.field3573[var0][var1][var2 + 1] = 50;
                     } else if(var4 == 1) {
                        class285.field3573[var0][var1 + 1][var2 + 1] = 50;
                     } else if(var4 == 2) {
                        class285.field3573[var0][var1 + 1][var2] = 50;
                     } else if(var4 == 3) {
                        class285.field3573[var0][var1][var2] = 50;
                     }
                  }

                  if(var8.field173 != 0 && var7 != null) {
                     var7.method44(var1, var2, var5, var4, var8.field166);
                  }

               } else if(var5 == 9) {
                  if(var8.field171 == -1 && var8.field189 == null) {
                     var34 = var8.method321(var5, var4, var15, var17, var16, var18);
                  } else {
                     var34 = new class321(var3, var5, var4, var0, var1, var2, var8.field171, true, (class102)null);
                  }

                  var6.method1935(var0, var1, var2, var16, 1, 1, (class102)var34, 0, var19, var21);
                  if(var8.field173 != 0 && var7 != null) {
                     var7.method45(var1, var2, var9, var10, var8.field166);
                  }

                  if(var8.field172 != 16) {
                     var6.method2072(var0, var1, var2, var8.field172);
                  }

               } else if(var5 == 4) {
                  if(var8.field171 == -1 && var8.field189 == null) {
                     var34 = var8.method321(4, var4, var15, var17, var16, var18);
                  } else {
                     var34 = new class321(var3, 4, var4, var0, var1, var2, var8.field171, true, (class102)null);
                  }

                  var6.method1934(var0, var1, var2, var16, (class102)var34, (class102)null, class185.field2518[var4], 0, 0, 0, var19, var21);
               } else {
                  long var31;
                  Object var33;
                  if(var5 == 5) {
                     var28 = 16;
                     var31 = var6.method1951(var0, var1, var2);
                     if(0L != var31) {
                        var28 = class285.method5484(class178.method3682(var31)).field172;
                     }

                     if(var8.field171 == -1 && var8.field189 == null) {
                        var33 = var8.method321(4, var4, var15, var17, var16, var18);
                     } else {
                        var33 = new class321(var3, 4, var4, var0, var1, var2, var8.field171, true, (class102)null);
                     }

                     var6.method1934(var0, var1, var2, var16, (class102)var33, (class102)null, class185.field2518[var4], 0, var28 * class185.field2513[var4], var28 * class185.field2521[var4], var19, var21);
                  } else if(var5 == 6) {
                     var28 = 8;
                     var31 = var6.method1951(var0, var1, var2);
                     if(0L != var31) {
                        var28 = class285.method5484(class178.method3682(var31)).field172 / 2;
                     }

                     if(var8.field171 == -1 && var8.field189 == null) {
                        var33 = var8.method321(4, var4 + 4, var15, var17, var16, var18);
                     } else {
                        var33 = new class321(var3, 4, var4 + 4, var0, var1, var2, var8.field171, true, (class102)null);
                     }

                     var6.method1934(var0, var1, var2, var16, (class102)var33, (class102)null, 256, var4, var28 * class185.field2526[var4], var28 * class185.field2523[var4], var19, var21);
                  } else if(var5 == 7) {
                     var23 = var4 + 2 & 3;
                     if(var8.field171 == -1 && var8.field189 == null) {
                        var34 = var8.method321(4, var23 + 4, var15, var17, var16, var18);
                     } else {
                        var34 = new class321(var3, 4, var23 + 4, var0, var1, var2, var8.field171, true, (class102)null);
                     }

                     var6.method1934(var0, var1, var2, var16, (class102)var34, (class102)null, 256, var23, 0, 0, var19, var21);
                  } else if(var5 == 8) {
                     var28 = 8;
                     var31 = var6.method1951(var0, var1, var2);
                     if(var31 != 0L) {
                        var28 = class285.method5484(class178.method3682(var31)).field172 / 2;
                     }

                     int var27 = var4 + 2 & 3;
                     Object var26;
                     if(var8.field171 == -1 && var8.field189 == null) {
                        var33 = var8.method321(4, var4 + 4, var15, var17, var16, var18);
                        var26 = var8.method321(4, var27 + 4, var15, var17, var16, var18);
                     } else {
                        var33 = new class321(var3, 4, var4 + 4, var0, var1, var2, var8.field171, true, (class102)null);
                        var26 = new class321(var3, 4, var27 + 4, var0, var1, var2, var8.field171, true, (class102)null);
                     }

                     var6.method1934(var0, var1, var2, var16, (class102)var33, (class102)var26, 256, var4, var28 * class185.field2526[var4], var28 * class185.field2523[var4], var19, var21);
                  }
               }
            }
         } else {
            if(var8.field171 == -1 && var8.field189 == null) {
               var34 = var8.method321(10, var4, var15, var17, var16, var18);
            } else {
               var34 = new class321(var3, 10, var4, var0, var1, var2, var8.field171, true, (class102)null);
            }

            if(var34 != null && var6.method1935(var0, var1, var2, var16, var9, var10, (class102)var34, var5 == 11?256:0, var19, var21) && var8.field165) {
               var23 = 15;
               if(var34 instanceof class52) {
                  var23 = ((class52)var34).method1128() / 4;
                  if(var23 > 30) {
                     var23 = 30;
                  }
               }

               for(var24 = 0; var24 <= var9; ++var24) {
                  for(int var25 = 0; var25 <= var10; ++var25) {
                     if(var23 > class285.field3573[var0][var24 + var1][var25 + var2]) {
                        class285.field3573[var0][var24 + var1][var25 + var2] = (byte)var23;
                     }
                  }
               }
            }

            if(var8.field173 != 0 && var7 != null) {
               var7.method45(var1, var2, var9, var10, var8.field166);
            }

         }
      }
   }

   @ObfuscatedName("gu")
   @ObfuscatedSignature(
      signature = "(ZLgl;I)V",
      garbageValue = "1516887721"
   )
   static final void method627(boolean var0, class1 var1) {
      client.updateNpcs(var0, var1);
      client.field2274 = 0;
      client.field2198 = 0;
      class1 var2 = client.field2384.field1764;
      var2.method7();
      int var3 = var2.method8(8);
      int var4;
      if(var3 < client.field2196) {
         for(var4 = var3; var4 < client.field2196; ++var4) {
            client.field2226[++client.field2274 - 1] = client.field2197[var4];
         }
      }

      if(var3 > client.field2196) {
         throw new RuntimeException("");
      } else {
         client.field2196 = 0;

         int var5;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         for(var4 = 0; var4 < var3; ++var4) {
            var5 = client.field2197[var4];
            class176 var6 = client.field2195[var5];
            var7 = var2.method8(1);
            if(var7 == 0) {
               client.field2197[++client.field2196 - 1] = var5;
               var6.field1121 = client.field2165;
            } else {
               var8 = var2.method8(2);
               if(var8 == 0) {
                  client.field2197[++client.field2196 - 1] = var5;
                  var6.field1121 = client.field2165;
                  client.field2199[++client.field2198 - 1] = var5;
               } else if(var8 == 1) {
                  client.field2197[++client.field2196 - 1] = var5;
                  var6.field1121 = client.field2165;
                  var9 = var2.method8(3);
                  var6.method3661(var9, (byte)1);
                  var10 = var2.method8(1);
                  if(var10 == 1) {
                     client.field2199[++client.field2198 - 1] = var5;
                  }
               } else if(var8 == 2) {
                  client.field2197[++client.field2196 - 1] = var5;
                  var6.field1121 = client.field2165;
                  var9 = var2.method8(3);
                  var6.method3661(var9, (byte)2);
                  var10 = var2.method8(3);
                  var6.method3661(var10, (byte)2);
                  var11 = var2.method8(1);
                  if(var11 == 1) {
                     client.field2199[++client.field2198 - 1] = var5;
                  }
               } else if(var8 == 3) {
                  client.field2226[++client.field2274 - 1] = var5;
               }
            }
         }

         class293.method5770(var0, var1);

         int var14;
         for(var14 = 0; var14 < client.field2198; ++var14) {
            var3 = client.field2199[var14];
            class176 var15 = client.field2195[var3];
            var5 = var1.method2256();
            if((var5 & 1) != 0) {
               var15.field1098 = var1.method2268();
               var15.interactingChanged(-1);
               if(var15.field1098 == 65535) {
                  var15.field1098 = -1;
                  var15.interactingChanged(-1);
               }
            }

            int var16;
            if((var5 & 64) != 0) {
               var16 = var1.method2332();
               var7 = var1.method2332();
               var8 = var15.field1090 - (var16 - class229.field3067 - class229.field3067) * 64;
               var9 = var15.field1072 - (var7 - field360 - field360) * 64;
               if(var8 != 0 || var9 != 0) {
                  var15.field1114 = (int)(Math.atan2((double)var8, (double)var9) * 325.949D) & 2047;
               }
            }

            if((var5 & 32) != 0) {
               var16 = var1.method2258();
               if(var16 == 65535) {
                  var16 = -1;
               }

               var7 = var1.method2287();
               if(var16 == var15.field1086 && var16 != -1) {
                  var8 = class3.method74(var16).field3830;
                  if(var8 == 1) {
                     var15.field1105 = 0;
                     var15.field1130 = 0;
                     var15.field1107 = var7;
                     var15.field1108 = 0;
                  }

                  if(var8 == 2) {
                     var15.field1108 = 0;
                  }
               } else if(var16 == -1 || var15.field1086 == -1 || class3.method74(var16).field3841 >= class3.method74(var15.field1086).field3841) {
                  var15.field1086 = var16;
                  var15.animationChanged(-1);
                  var15.field1105 = 0;
                  var15.field1130 = 0;
                  var15.field1107 = var7;
                  var15.field1108 = 0;
                  var15.field1131 = var15.field1092;
               }
            }

            if((var5 & 4) != 0) {
               class315 var10001 = class127.method2480(var1.method2258());
               var15.onCompositionChanged((RSNPCComposition)var10001);
               var15.field2437 = var10001;
               var15.field1075 = var15.field2437.field3862;
               var15.field1125 = var15.field2437.field3860;
               var15.field1103 = var15.field2437.field3868;
               var15.field1080 = var15.field2437.field3869;
               var15.field1077 = var15.field2437.field3870;
               var15.field1083 = var15.field2437.field3890;
               var15.field1089 = var15.field2437.field3865;
               var15.field1127 = var15.field2437.field3866;
               var15.field1122 = var15.field2437.field3878;
            }

            if((var5 & 16) != 0) {
               var16 = var1.method2286();
               int var12;
               if(var16 > 0) {
                  for(var7 = 0; var7 < var16; ++var7) {
                     var9 = -1;
                     var10 = -1;
                     var11 = -1;
                     var8 = var1.method2270();
                     if(var8 == 32767) {
                        var8 = var1.method2270();
                        var10 = var1.method2270();
                        var9 = var1.method2270();
                        var11 = var1.method2270();
                     } else if(var8 != 32766) {
                        var10 = var1.method2270();
                     } else {
                        var8 = -1;
                     }

                     var12 = var1.method2270();
                     var15.method1794(var8, var10, var9, var11, client.field2165, var12);
                  }
               }

               var7 = var1.method2285();
               if(var7 > 0) {
                  for(var8 = 0; var8 < var7; ++var8) {
                     var9 = var1.method2270();
                     var10 = var1.method2270();
                     if(var10 != 32767) {
                        var11 = var1.method2270();
                        var12 = var1.method2256();
                        int var13 = var10 > 0?var1.method2287():var12;
                        var15.method1804(var9, client.field2165, var10, var11, var12, var13);
                     } else {
                        var15.method1791(var9);
                     }
                  }
               }
            }

            if((var5 & 8) != 0) {
               var15.field1109 = var1.method2268();
               var15.graphicChanged(-1);
               var16 = var1.method2304();
               var15.field1099 = var16 >> 16;
               var15.field1112 = (var16 & 65535) + client.field2165;
               var15.field1110 = 0;
               var15.field1111 = 0;
               if(var15.field1112 > client.field2165) {
                  var15.field1110 = -1;
               }

               if(var15.field1109 == 65535) {
                  var15.field1109 = -1;
                  var15.graphicChanged(-1);
               }
            }

            if((var5 & 2) != 0) {
               var15.field1085 = var1.method2265();
               var15.field1081 = 100;
            }

             if ((var5 & 0x80) != 0) {//options
                 int mask = var1.method2257();//read unsigned byte
                 String[] options = var15.field2437.changedOptions;
                 for (int i = 0; i < 5; i++) {
                     if ((mask >> i & 0x1) != 0) {
                         options[i] = var1.method2265();//read string.
                     }
                 }
             }

         }

         for(var14 = 0; var14 < client.field2274; ++var14) {
            var3 = client.field2226[var14];
            if(client.field2195[var3].field1121 != client.field2165) {
               class176 var10000 = client.field2195[var3];
               client.field2195[var3].onCompositionChanged((RSNPCComposition)null);
               var10000.field2437 = null;
               client.field2195[var3] = null;
               client.cachedNPCsChanged(var3);
            }
         }

         if(var1.field1693 != client.field2384.field1768) {
            throw new RuntimeException(var1.field1693 + "," + client.field2384.field1768);
         } else {
            for(var14 = 0; var14 < client.field2196; ++var14) {
               if(client.field2195[client.field2197[var14]] == null) {
                  throw new RuntimeException(var14 + "," + client.field2196);
               }
            }

         }
      }
   }
}
