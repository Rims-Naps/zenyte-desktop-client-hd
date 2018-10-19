package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
public class class268 extends class153 {
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1707524619
   )
   int field2944;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1762715999
   )
   int field2946;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -2071135355
   )
   int field2942;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1206053021
   )
   int field2945;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1103837850"
   )
   int method4861() {
      return this.field2944;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgm;Lgm;I)V",
      garbageValue = "-1534728828"
   )
   void method4849(Buffer var1, Buffer var2) {
      int var3 = var2.readUnsignedByte();
      if(var3 != class313.field3377.field3374) {
         throw new IllegalStateException("");
      } else {
         super.field1467 = var2.readUnsignedByte();
         super.field1460 = var2.readUnsignedByte();
         super.field1471 = var2.readUnsignedShort();
         super.field1465 = var2.readUnsignedShort();
         this.field2946 = var2.readUnsignedByte();
         this.field2942 = var2.readUnsignedByte();
         super.field1459 = var2.readUnsignedShort();
         super.field1458 = var2.readUnsignedShort();
         this.field2944 = var2.readUnsignedByte();
         this.field2945 = var2.readUnsignedByte();
         super.field1460 = Math.min(super.field1460, 4);
         super.field1461 = new short[1][64][64];
         super.field1462 = new short[super.field1460][64][64];
         super.field1463 = new byte[super.field1460][64][64];
         super.field1464 = new byte[super.field1460][64][64];
         super.field1470 = new class25[super.field1460][64][64][];
         var3 = var1.readUnsignedByte();
         if(var3 != class77.field706.field707) {
            throw new IllegalStateException("");
         } else {
            int var4 = var1.readUnsignedByte();
            int var5 = var1.readUnsignedByte();
            int var6 = var1.readUnsignedByte();
            int var7 = var1.readUnsignedByte();
            if(var4 == super.field1459 && var5 == super.field1458 && var6 == this.field2944 && var7 == this.field2945) {
               for(int var8 = 0; var8 < 8; ++var8) {
                  for(int var9 = 0; var9 < 8; ++var9) {
                     this.method2698(var8 + this.field2944 * 8, var9 + this.field2945 * 8, var1);
                  }
               }

            } else {
               throw new IllegalStateException("");
            }
         }
      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-121"
   )
   int method4870() {
      return this.field2942;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "596418511"
   )
   boolean method4850(int var1, int var2) {
      return var1 < this.field2944 * 8?false:(var2 < this.field2945 * 8?false:(var1 >= this.field2944 * 8 + 8?false:var2 < this.field2945 * 8 + 8));
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "313816616"
   )
   int method4854() {
      return this.field2945;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1962551769"
   )
   int method4851() {
      return this.field2946;
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof class268)) {
         return false;
      } else {
         class268 var2 = (class268)var1;
         return super.field1459 == var2.field1459 && super.field1458 == var2.field1458?this.field2944 == var2.field2944 && this.field2945 == var2.field2945:false;
      }
   }

   public int hashCode() {
      return super.field1459 | super.field1458 << 8 | this.field2944 << 16 | this.field2945 << 24;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "-81"
   )
   static int method4875(int var0, int var1) {
      class105 var3 = (class105)class105.field980.method2268((long)var0);
      class105 var2;
      if(var3 != null) {
         var2 = var3;
      } else {
         byte[] var4 = class105.field987.method2579(4, var0, 548656037);
         var3 = new class105();
         if(var4 != null) {
            var3.method1774(new Buffer(var4), var0);
         }

         var3.method1773();
         class105.field980.method2275(var3, (long)var0);
         var2 = var3;
      }

      if(var2 == null) {
         return var1;
      } else if(var2.field979 >= 0) {
         return var2.field979 | -16777216;
      } else if(var2.field977 >= 0) {
         int var10 = class180.method3023(class257.field2539.vmethod4530(var2.field977), 96);
         return class257.field2560[var10] | -16777216;
      } else if(var2.field976 == 16711935) {
         return var1;
      } else {
         int var5 = var2.field981;
         int var6 = var2.field982;
         int var7 = var2.field974;
         if(var7 > 179) {
            var6 /= 2;
         }

         if(var7 > 192) {
            var6 /= 2;
         }

         if(var7 > 217) {
            var6 /= 2;
         }

         if(var7 > 243) {
            var6 /= 2;
         }

         int var8 = (var6 / 32 << 7) + var7 / 2 + (var5 / 4 << 10);
         int var9 = class180.method3023(var8, 96);
         return class257.field2560[var9] | -16777216;
      }
   }

   @ObfuscatedName("ir")
   @ObfuscatedSignature(
      signature = "(Lhw;IIB)V",
      garbageValue = "118"
   )
   static final void method4862(class329 var0, int var1, int var2) {
      if(var0.field3547 == 1) {
         class98.method1687(var0.field3667, "", 24, 0, 0, var0.field3607);
      }

      String var3;
      if(var0.field3547 == 2 && !client.field3887) {
         var3 = class129.method2384(var0);
         if(var3 != null) {
            class98.method1687(var3, class294.method5136(65280) + var0.field3550, 25, 0, -1, var0.field3607);
         }
      }

      if(var0.field3547 == 3) {
         class98.method1687("Close", "", 26, 0, 0, var0.field3607);
      }

      if(var0.field3547 == 4) {
         class98.method1687(var0.field3667, "", 28, 0, 0, var0.field3607);
      }

      if(var0.field3547 == 5) {
         class98.method1687(var0.field3667, "", 29, 0, 0, var0.field3607);
      }

      if(var0.field3547 == 6 && client.field3898 == null) {
         class98.method1687(var0.field3667, "", 30, 0, -1, var0.field3607);
      }

      int var4;
      int var5;
      int var6;
      int var7;
      int var19;
      if(var0.field3546 == 2) {
         var19 = 0;

         for(var4 = 0; var4 < var0.field3560; ++var4) {
            for(var5 = 0; var5 < var0.field3559; ++var5) {
               var6 = (var0.field3541 + 32) * var5;
               var7 = (var0.field3641 + 32) * var4;
               if(var19 < 20) {
                  var6 += var0.field3613[var19];
                  var7 += var0.field3614[var19];
               }

               if(var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) {
                  client.field3843 = var19;
                  ClientProt.field573 = var0;
                  if(var0.field3668[var19] > 0) {
                     label388: {
                        class120 var8 = class67.method1152(var0.field3668[var19] - 1);
                        boolean var9;
                        int var10;
                        if(client.field3885 == 1) {
                           var10 = class104.method1771(var0);
                           var9 = (var10 >> 30 & 1) != 0;
                           if(var9) {
                              if(var0.field3607 != class7.field53 || var19 != class213.field2059) {
                                 class98.method1687("Use", client.field3835 + " " + "->" + " " + class294.method5136(16748608) + var8.field1119, 31, var8.field1102, var19, var0.field3607);
                              }
                              break label388;
                           }
                        }

                        if(client.field3887) {
                           var10 = class104.method1771(var0);
                           var9 = (var10 >> 30 & 1) != 0;
                           if(var9) {
                              if((class184.field1776 & 16) == 16) {
                                 class98.method1687(client.field3890, client.field3891 + " " + "->" + " " + class294.method5136(16748608) + var8.field1119, 32, var8.field1102, var19, var0.field3607);
                              }
                              break label388;
                           }
                        }

                        String[] var20 = var8.field1128;
                        var10 = -1;
                        if(client.field3878 && class123.method2261()) {
                           var10 = var8.method2171(-1709745435);
                        }

                        int var12 = class104.method1771(var0);
                        boolean var11 = (var12 >> 30 & 1) != 0;
                        if(var11) {
                           for(int var13 = 4; var13 >= 3; --var13) {
                              if(var10 != var13) {
                                 class5.method73(var0, var8, var19, var13, false);
                              }
                           }
                        }

                        int var14 = class104.method1771(var0);
                        boolean var27 = (var14 >> 31 & 1) != 0;
                        if(var27) {
                           class98.method1687("Use", class294.method5136(16748608) + var8.field1119, 38, var8.field1102, var19, var0.field3607);
                        }

                        int var16 = class104.method1771(var0);
                        boolean var15 = (var16 >> 30 & 1) != 0;
                        int var17;
                        if(var15) {
                           for(var17 = 2; var17 >= 0; --var17) {
                              if(var17 != var10) {
                                 class5.method73(var0, var8, var19, var17, false);
                              }
                           }

                           if(var10 >= 0) {
                              class5.method73(var0, var8, var19, var10, true);
                           }
                        }

                        var20 = var0.field3553;
                        if(var20 != null) {
                           for(var17 = 4; var17 >= 0; --var17) {
                              if(var20[var17] != null) {
                                 byte var18 = 0;
                                 if(var17 == 0) {
                                    var18 = 39;
                                 }

                                 if(var17 == 1) {
                                    var18 = 40;
                                 }

                                 if(var17 == 2) {
                                    var18 = 41;
                                 }

                                 if(var17 == 3) {
                                    var18 = 42;
                                 }

                                 if(var17 == 4) {
                                    var18 = 43;
                                 }

                                 class98.method1687(var20[var17], class294.method5136(16748608) + var8.field1119, var18, var8.field1102, var19, var0.field3607);
                              }
                           }
                        }

                        class98.method1687("Examine", class294.method5136(16748608) + var8.field1119, 1005, var8.field1102, var19, var0.field3607);
                     }
                  }
               }

               ++var19;
            }
         }
      }

      if(var0.field3543) {
         if(client.field3887) {
            var4 = class104.method1771(var0);
            boolean var28 = (var4 >> 21 & 1) != 0;
            if(var28 && (class184.field1776 & 32) == 32) {
               class98.method1687(client.field3890, client.field3891 + " " + "->" + " " + var0.field3669, 58, 0, var0.field3606, var0.field3607);
            }
         } else {
            for(var19 = 9; var19 >= 5; --var19) {
               var6 = class104.method1771(var0);
               boolean var24 = (var6 >> var19 + 1 & 1) != 0;
               String var21;
               if(!var24 && var0.field3650 == null) {
                  var21 = null;
               } else if(var0.field3616 != null && var0.field3616.length > var19 && var0.field3616[var19] != null && var0.field3616[var19].trim().length() != 0) {
                  var21 = var0.field3616[var19];
               } else {
                  var21 = null;
               }

               if(var21 != null) {
                  class98.method1687(var21, var0.field3669, 1007, var19 + 1, var0.field3606, var0.field3607);
               }
            }

            var3 = class129.method2384(var0);
            if(var3 != null) {
               class98.method1687(var3, var0.field3669, 25, 0, var0.field3606, var0.field3607);
            }

            for(var4 = 4; var4 >= 0; --var4) {
               var7 = class104.method1771(var0);
               boolean var26 = (var7 >> var4 + 1 & 1) != 0;
               String var22;
               if(!var26 && var0.field3650 == null) {
                  var22 = null;
               } else if(var0.field3616 != null && var0.field3616.length > var4 && var0.field3616[var4] != null && var0.field3616[var4].trim().length() != 0) {
                  var22 = var0.field3616[var4];
               } else {
                  var22 = null;
               }

               if(var22 != null) {
                  class98.method1687(var22, var0.field3669, 57, var4 + 1, var0.field3606, var0.field3607);
               }
            }

            var5 = class104.method1771(var0);
            boolean var25 = (var5 & 1) != 0;
            if(var25) {
               class98.method1687("Continue", "", 30, 0, var0.field3606, var0.field3607);
            }
         }
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "121800456"
   )
   static int method4874(int var0, class252 var1, boolean var2) {
      class329 var3;
      if(var0 >= 2000) {
         var0 -= 1000;
         var3 = class189.getWidget(class55.field407[--class171.field1587]);
      } else {
         var3 = var2?class182.field1766:class20.field155;
      }

      class184.method3216(var3);
      if(var0 != 1200 && var0 != 1205 && var0 != 1212) {
         if(var0 == 1201) {
            var3.field3552 = 2;
            var3.field3588 = class55.field407[--class171.field1587];
            return 1;
         } else if(var0 == 1202) {
            var3.field3552 = 3;
            var3.field3588 = class5.field43.field576.method770();
            return 1;
         } else {
            return 2;
         }
      } else {
         class171.field1587 -= 2;
         int var4 = class55.field407[class171.field1587];
         int var5 = class55.field407[class171.field1587 + 1];
         var3.field3662 = var4;
         var3.field3671 = var5;
         class120 var6 = class67.method1152(var4);
         var3.field3673 = var6.field1132;
         var3.field3596 = var6.field1118;
         var3.field3657 = var6.field1112;
         var3.field3593 = var6.field1099;
         var3.field3594 = var6.field1111;
         var3.field3598 = var6.field1109;
         if(var0 == 1205) {
            var3.field3603 = 0;
         } else if(var0 == 1212 | var6.field1108 == 1) {
            var3.field3603 = 1;
         } else {
            var3.field3603 = 2;
         }

         if(var3.field3599 > 0) {
            var3.field3598 = var3.field3598 * 32 / var3.field3599;
         } else if(var3.field3555 > 0) {
            var3.field3598 = var3.field3598 * 32 / var3.field3555;
         }

         return 1;
      }
   }
}
