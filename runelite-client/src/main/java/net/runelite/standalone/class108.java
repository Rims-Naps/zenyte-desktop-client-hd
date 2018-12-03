package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
public class class108 extends class175 {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1762715999
   )
   int field1174;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -2071135355
   )
   int field1170;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1707524619
   )
   int field1172;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1206053021
   )
   int field1173;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1103837850"
   )
   int method1905() {
      return this.field1172;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-121"
   )
   int method1914() {
      return this.field1170;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "596418511"
   )
   boolean method1894(int var1, int var2) {
      return var1 < this.field1172 * 8?false:(var2 < this.field1173 * 8?false:(var1 >= this.field1172 * 8 + 8?false:var2 < this.field1173 * 8 + 8));
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgm;Lgm;I)V",
      garbageValue = "-1534728828"
   )
   void method1893(Buffer var1, Buffer var2) {//regular map data
      int var3 = var2.readUnsignedByte();
      if(var3 != class174.field2131.field2128) {
         throw new IllegalStateException("");
      } else {
         super.field2146 = var2.readUnsignedByte();
         super.field2139 = var2.readUnsignedByte();
         super.field2150 = var2.readShort();
         super.field2144 = var2.readShort();
         this.field1174 = var2.readUnsignedByte();
         this.field1170 = var2.readUnsignedByte();
         super.field2138 = var2.readShort();
         super.field2137 = var2.readShort();
         this.field1172 = var2.readUnsignedByte();
         this.field1173 = var2.readUnsignedByte();
         super.field2139 = Math.min(super.field2139, 4);
         super.field2140 = new short[1][64][64];
         super.field2141 = new short[super.field2139][64][64];
         super.field2142 = new byte[super.field2139][64][64];
         super.field2143 = new byte[super.field2139][64][64];
         super.field2149 = new class127[super.field2139][64][64][];
         var3 = var1.readUnsignedByte();
         if(var3 != class286.field3577.field3578) {
            throw new IllegalStateException("");
         } else {
            int var4 = var1.readUnsignedByte();
            int var5 = var1.readUnsignedByte();
            int var6 = var1.readUnsignedByte();
            int var7 = var1.readUnsignedByte();
            if(var4 == super.field2138 && var5 == super.field2137 && var6 == this.field1172 && var7 == this.field1173) {
               for(int var8 = 0; var8 < 8; ++var8) {
                  for(int var9 = 0; var9 < 8; ++var9) {
                     this.method3224(var8 + this.field1172 * 8, var9 + this.field1173 * 8, var1);
                  }
               }

            } else {
               throw new IllegalStateException("");
            }
         }
      }
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof class108)) {
         return false;
      } else {
         class108 var2 = (class108)var1;
         return super.field2138 == var2.field2138 && super.field2137 == var2.field2137?this.field1172 == var2.field1172 && this.field1173 == var2.field1173:false;
      }
   }

   public int hashCode() {
      return super.field2138 | super.field2137 << 8 | this.field1172 << 16 | this.field1173 << 24;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "313816616"
   )
   int method1898() {
      return this.field1173;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1962551769"
   )
   int method1895() {
      return this.field1174;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "121800456"
   )
   static int method1918(int var0, class296 var1, boolean var2) {
      class187 var3;
      if(var0 >= 2000) {
         var0 -= 1000;
         var3 = class48.method1047(class249.field3312[--class308.field3811]);
      } else {
         var3 = var2?class3.field36:class284.field3565;
      }

      class230.method4617(var3);
      if(var0 != 1200 && var0 != 1205 && var0 != 1212) {
         if(var0 == 1201) {
            var3.field2566 = 2;
            var3.field2602 = class249.field3312[--class308.field3811];
            return 1;
         } else if(var0 == 1202) {
            var3.field2566 = 3;
            var3.field2602 = class32.field303.field2801.method6297();
            return 1;
         } else {
            return 2;
         }
      } else {
         class308.field3811 -= 2;
         int var4 = class249.field3312[class308.field3811];
         int var5 = class249.field3312[class308.field3811 + 1];
         var3.field2676 = var4;
         var3.field2685 = var5;
         class42 var6 = class164.method3014(var4);
         var3.field2687 = var6.field459;
         var3.field2610 = var6.field445;
         var3.field2671 = var6.field439;
         var3.field2607 = var6.field426;
         var3.field2608 = var6.field438;
         var3.field2612 = var6.field436;
         if(var0 == 1205) {
            var3.field2617 = 0;
         } else if(var0 == 1212 | var6.field435 == 1) {
            var3.field2617 = 1;
         } else {
            var3.field2617 = 2;
         }

         if(var3.field2613 > 0) {
            var3.field2612 = var3.field2612 * 32 / var3.field2613;
         } else if(var3.field2569 > 0) {
            var3.field2612 = var3.field2612 * 32 / var3.field2569;
         }

         return 1;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "-81"
   )
   static int method1919(int var0, int var1) {
      class93 var3 = (class93)class93.field1005.method1813((long)var0);
      class93 var2;
      if(var3 != null) {
         var2 = var3;
      } else {
         byte[] var4 = class93.field1012.method4398(4, var0, 548656037);
         var3 = new class93();
         if(var4 != null) {
            var3.method1721(new Buffer(var4), var0);
         }

         var3.method1720();
         class93.field1005.method1820(var3, (long)var0);
         var2 = var3;
      }

      if(var2 == null) {
         return var1;
      } else if(var2.field1004 >= 0) {
         return var2.field1004 | -16777216;
      } else if(var2.field1002 >= 0) {
         int var10 = class218.method4502(class211.field2895.vmethod5292(var2.field1002), 96);
         return class211.field2916[var10] | -16777216;
      } else if(var2.field1001 == 16711935) {
         return var1;
      } else {
         int var5 = var2.field1006;
         int var6 = var2.field1007;
         int var7 = var2.field999;
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
         int var9 = class218.method4502(var8, 96);
         return class211.field2916[var9] | -16777216;
      }
   }

   @ObfuscatedName("ir")
   @ObfuscatedSignature(
      signature = "(Lhw;IIB)V",
      garbageValue = "118"
   )
   static final void method1906(class187 var0, int var1, int var2) {
      if(var0.field2561 == 1) {
         class28.method484(var0.field2681, "", 24, 0, 0, var0.field2621);
      }

      String var3;
      if(var0.field2561 == 2 && !client.field2308) {
         var3 = class151.method2763(var0);
         if(var3 != null) {
            class28.method484(var3, class64.method1354(65280) + var0.field2564, 25, 0, -1, var0.field2621);
         }
      }

      if(var0.field2561 == 3) {
         class28.method484("Close", "", 26, 0, 0, var0.field2621);
      }

      if(var0.field2561 == 4) {
         class28.method484(var0.field2681, "", 28, 0, 0, var0.field2621);
      }

      if(var0.field2561 == 5) {
         class28.method484(var0.field2681, "", 29, 0, 0, var0.field2621);
      }

      if(var0.field2561 == 6 && client.field2319 == null) {
         class28.method484(var0.field2681, "", 30, 0, -1, var0.field2621);
      }

      int var4;
      int var5;
      int var6;
      int var7;
      int var19;
      if(var0.field2560 == 2) {
         var19 = 0;

         for(var4 = 0; var4 < var0.field2574; ++var4) {
            for(var5 = 0; var5 < var0.field2573; ++var5) {
               var6 = (var0.field2555 + 32) * var5;
               var7 = (var0.field2655 + 32) * var4;
               if(var19 < 20) {
                  var6 += var0.field2627[var19];
                  var7 += var0.field2628[var19];
               }

               if(var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) {
                  client.field2264 = var19;
                  ClientProt.field3258 = var0;
                  if(var0.field2682[var19] > 0) {
                     label388: {
                        class42 var8 = class164.method3014(var0.field2682[var19] - 1);
                        boolean var9;
                        int var10;
                        if(client.field2306 == 1) {
                           var10 = class203.method4026(var0);
                           var9 = (var10 >> 30 & 1) != 0;
                           if(var9) {
                              if(var0.field2621 != class314.field3853 || var19 != class72.field826) {
                                 class28.method484("Use", client.field2256 + " " + "->" + " " + class64.method1354(16748608) + var8.field446, 31, var8.field429, var19, var0.field2621);
                              }
                              break label388;
                           }
                        }

                        if(client.field2308) {
                           var10 = class203.method4026(var0);
                           var9 = (var10 >> 30 & 1) != 0;
                           if(var9) {
                              if((class230.field3072 & 16) == 16) {
                                 class28.method484(client.field2311, client.field2312 + " " + "->" + " " + class64.method1354(16748608) + var8.field446, 32, var8.field429, var19, var0.field2621);
                              }
                              break label388;
                           }
                        }

                        String[] var20 = var8.field455;
                        var10 = -1;
                        if(client.field2299 && class198.method3941()) {
                           var10 = var8.method789(-1709745435);
                        }

                        int var12 = class203.method4026(var0);
                        boolean var11 = (var12 >> 30 & 1) != 0;
                        if(var11) {
                           for(int var13 = 4; var13 >= 3; --var13) {
                              if(var10 != var13) {
                                 class32.method534(var0, var8, var19, var13, false);
                              }
                           }
                        }

                        int var14 = class203.method4026(var0);
                        boolean var27 = (var14 >> 31 & 1) != 0;
                        if(var27) {
                           class28.method484("Use", class64.method1354(16748608) + var8.field446, 38, var8.field429, var19, var0.field2621);
                        }

                        int var16 = class203.method4026(var0);
                        boolean var15 = (var16 >> 30 & 1) != 0;
                        int var17;
                        if(var15) {
                           for(var17 = 2; var17 >= 0; --var17) {
                              if(var17 != var10) {
                                 class32.method534(var0, var8, var19, var17, false);
                              }
                           }

                           if(var10 >= 0) {
                              class32.method534(var0, var8, var19, var10, true);
                           }
                        }

                        var20 = var0.field2567;
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

                                 class28.method484(var20[var17], class64.method1354(16748608) + var8.field446, var18, var8.field429, var19, var0.field2621);
                              }
                           }
                        }

                        class28.method484("Examine", class64.method1354(16748608) + var8.field446, 1005, var8.field429, var19, var0.field2621);
                     }
                  }
               }

               ++var19;
            }
         }
      }

      if(var0.field2557) {
         if(client.field2308) {
            var4 = class203.method4026(var0);
            boolean var28 = (var4 >> 21 & 1) != 0;
            if(var28 && (class230.field3072 & 32) == 32) {
               class28.method484(client.field2311, client.field2312 + " " + "->" + " " + var0.field2683, 58, 0, var0.field2620, var0.field2621);
            }
         } else {
            for(var19 = 9; var19 >= 5; --var19) {
               var6 = class203.method4026(var0);
               boolean var24 = (var6 >> var19 + 1 & 1) != 0;
               String var21;
               if(!var24 && var0.field2664 == null) {
                  var21 = null;
               } else if(var0.field2630 != null && var0.field2630.length > var19 && var0.field2630[var19] != null && var0.field2630[var19].trim().length() != 0) {
                  var21 = var0.field2630[var19];
               } else {
                  var21 = null;
               }

               if(var21 != null) {
                  class28.method484(var21, var0.field2683, 1007, var19 + 1, var0.field2620, var0.field2621);
               }
            }

            var3 = class151.method2763(var0);
            if(var3 != null) {
               class28.method484(var3, var0.field2683, 25, 0, var0.field2620, var0.field2621);
            }

            for(var4 = 4; var4 >= 0; --var4) {
               var7 = class203.method4026(var0);
               boolean var26 = (var7 >> var4 + 1 & 1) != 0;
               String var22;
               if(!var26 && var0.field2664 == null) {
                  var22 = null;
               } else if(var0.field2630 != null && var0.field2630.length > var4 && var0.field2630[var4] != null && var0.field2630[var4].trim().length() != 0) {
                  var22 = var0.field2630[var4];
               } else {
                  var22 = null;
               }

               if(var22 != null) {
                  class28.method484(var22, var0.field2683, 57, var4 + 1, var0.field2620, var0.field2621);
               }
            }

            var5 = class203.method4026(var0);
            boolean var25 = (var5 & 1) != 0;
            if(var25) {
               class28.method484("Continue", "", 30, 0, var0.field2620, var0.field2621);
            }
         }
      }

   }
}
