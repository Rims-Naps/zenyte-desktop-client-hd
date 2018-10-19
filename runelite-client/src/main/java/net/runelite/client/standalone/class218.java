package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
public class class218 extends class308 {
   @ObfuscatedName("ad")
   static int field2123;
   @ObfuscatedName("as")
   static int[] field2121;
   @ObfuscatedName("ao")
   static int[] field2125;
   @ObfuscatedName("ax")
   static int[] field2120;
   @ObfuscatedName("al")
   static int[] field2122;
   @ObfuscatedName("af")
   public short field2114;
   @ObfuscatedName("aw")
   int field2101;
   @ObfuscatedName("j")
   int field2110;
   @ObfuscatedName("f")
   int field2087;
   @ObfuscatedName("v")
   short[] field2099;
   @ObfuscatedName("n")
   short[] field2105;
   @ObfuscatedName("ac")
   int field2117;
   @ObfuscatedName("m")
   byte[] field2095;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "[Ley;"
   )
   class294[] field2106;
   @ObfuscatedName("z")
   byte[] field2097;
   @ObfuscatedName("h")
   int[] field2109;
   @ObfuscatedName("r")
   byte[] field2094;
   @ObfuscatedName("ag")
   public short field2113;
   @ObfuscatedName("p")
   int[] field2093;
   @ObfuscatedName("u")
   short[] field2103;
   @ObfuscatedName("c")
   int[] field2100;
   @ObfuscatedName("e")
   int field2107;
   @ObfuscatedName("b")
   byte[] field2102;
   @ObfuscatedName("t")
   short[] field2104;
   @ObfuscatedName("x")
   short[] field2086;
   @ObfuscatedName("l")
   int[] field2111;
   @ObfuscatedName("az")
   boolean field2115;
   @ObfuscatedName("o")
   int[] field2124;
   @ObfuscatedName("s")
   int[] field2089;
   @ObfuscatedName("a")
   int[] field2091;
   @ObfuscatedName("g")
   byte field2118;
   @ObfuscatedName("w")
   int[] field2088;
   @ObfuscatedName("k")
   int[][] field2119;
   @ObfuscatedName("aa")
   int field2098;
   @ObfuscatedName("i")
   int[][] field2108;
   @ObfuscatedName("am")
   int field2092;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "[Ldi;"
   )
   class224[] field2096;
   @ObfuscatedName("d")
   byte[] field2090;
   @ObfuscatedName("at")
   int field2116;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "[Ldi;"
   )
   class224[] field2112;

   static {
      field2121 = new int[10000];
      field2122 = new int[10000];
      field2123 = 0;
      field2120 = class257.field2564;
      field2125 = class257.field2558;
   }

   class218() {
      this.field2087 = 0;
      this.field2107 = 0;
      this.field2118 = 0;
      this.field2115 = false;
   }

   @ObfuscatedSignature(
      signature = "([Ldb;I)V"
   )
   public class218(class218[] var1, int var2) {
      this.field2087 = 0;
      this.field2107 = 0;
      this.field2118 = 0;
      this.field2115 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      this.field2087 = 0;
      this.field2107 = 0;
      this.field2110 = 0;
      this.field2118 = -1;

      int var9;
      class218 var10;
      for(var9 = 0; var9 < var2; ++var9) {
         var10 = var1[var9];
         if(var10 != null) {
            this.field2087 += var10.field2087;
            this.field2107 += var10.field2107;
            this.field2110 += var10.field2110;
            if(var10.field2095 != null) {
               var4 = true;
            } else {
               if(this.field2118 == -1) {
                  this.field2118 = var10.field2118;
               }

               if(this.field2118 != var10.field2118) {
                  var4 = true;
               }
            }

            var3 |= var10.field2094 != null;
            var5 |= var10.field2090 != null;
            var6 |= var10.field2124 != null;
            var7 |= var10.field2099 != null;
            var8 |= var10.field2097 != null;
         }
      }

      this.field2111 = new int[this.field2087];
      this.field2088 = new int[this.field2087];
      this.field2089 = new int[this.field2087];
      this.field2109 = new int[this.field2087];
      this.field2091 = new int[this.field2107];
      this.field2100 = new int[this.field2107];
      this.field2093 = new int[this.field2107];
      if(var3) {
         this.field2094 = new byte[this.field2107];
      }

      if(var4) {
         this.field2095 = new byte[this.field2107];
      }

      if(var5) {
         this.field2090 = new byte[this.field2107];
      }

      if(var6) {
         this.field2124 = new int[this.field2107];
      }

      if(var7) {
         this.field2099 = new short[this.field2107];
      }

      if(var8) {
         this.field2097 = new byte[this.field2107];
      }

      this.field2086 = new short[this.field2107];
      if(this.field2110 > 0) {
         this.field2102 = new byte[this.field2110];
         this.field2103 = new short[this.field2110];
         this.field2104 = new short[this.field2110];
         this.field2105 = new short[this.field2110];
      }

      this.field2087 = 0;
      this.field2107 = 0;
      this.field2110 = 0;

      for(var9 = 0; var9 < var2; ++var9) {
         var10 = var1[var9];
         if(var10 != null) {
            int var11;
            for(var11 = 0; var11 < var10.field2107; ++var11) {
               if(var3 && var10.field2094 != null) {
                  this.field2094[this.field2107] = var10.field2094[var11];
               }

               if(var4) {
                  if(var10.field2095 != null) {
                     this.field2095[this.field2107] = var10.field2095[var11];
                  } else {
                     this.field2095[this.field2107] = var10.field2118;
                  }
               }

               if(var5 && var10.field2090 != null) {
                  this.field2090[this.field2107] = var10.field2090[var11];
               }

               if(var6 && var10.field2124 != null) {
                  this.field2124[this.field2107] = var10.field2124[var11];
               }

               if(var7) {
                  if(var10.field2099 != null) {
                     this.field2099[this.field2107] = var10.field2099[var11];
                  } else {
                     this.field2099[this.field2107] = -1;
                  }
               }

               if(var8) {
                  if(var10.field2097 != null && var10.field2097[var11] != -1) {
                     this.field2097[this.field2107] = (byte)(this.field2110 + var10.field2097[var11]);
                  } else {
                     this.field2097[this.field2107] = -1;
                  }
               }

               this.field2086[this.field2107] = var10.field2086[var11];
               this.field2091[this.field2107] = this.method3868(var10, var10.field2091[var11]);
               this.field2100[this.field2107] = this.method3868(var10, var10.field2100[var11]);
               this.field2093[this.field2107] = this.method3868(var10, var10.field2093[var11]);
               ++this.field2107;
            }

            for(var11 = 0; var11 < var10.field2110; ++var11) {
               byte var12 = this.field2102[this.field2110] = var10.field2102[var11];
               if(var12 == 0) {
                  this.field2103[this.field2110] = (short)this.method3868(var10, var10.field2103[var11]);
                  this.field2104[this.field2110] = (short)this.method3868(var10, var10.field2104[var11]);
                  this.field2105[this.field2110] = (short)this.method3868(var10, var10.field2105[var11]);
               }

               ++this.field2110;
            }
         }
      }

   }

   class218(byte[] var1) {
      this.field2087 = 0;
      this.field2107 = 0;
      this.field2118 = 0;
      this.field2115 = false;
      if(var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         this.method3860(var1);
      } else {
         this.method3832(var1);
      }

   }

   @ObfuscatedSignature(
      signature = "(Ldb;ZZZZ)V",
      garbageValue = "1"
   )
   public class218(class218 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.field2087 = 0;
      this.field2107 = 0;
      this.field2118 = 0;
      this.field2115 = false;
      this.field2087 = var1.field2087;
      this.field2107 = var1.field2107;
      this.field2110 = var1.field2110;
      int var6;
      if(var2) {
         this.field2111 = var1.field2111;
         this.field2088 = var1.field2088;
         this.field2089 = var1.field2089;
      } else {
         this.field2111 = new int[this.field2087];
         this.field2088 = new int[this.field2087];
         this.field2089 = new int[this.field2087];

         for(var6 = 0; var6 < this.field2087; ++var6) {
            this.field2111[var6] = var1.field2111[var6];
            this.field2088[var6] = var1.field2088[var6];
            this.field2089[var6] = var1.field2089[var6];
         }
      }

      if(var3) {
         this.field2086 = var1.field2086;
      } else {
         this.field2086 = new short[this.field2107];

         for(var6 = 0; var6 < this.field2107; ++var6) {
            this.field2086[var6] = var1.field2086[var6];
         }
      }

      if(!var4 && var1.field2099 != null) {
         this.field2099 = new short[this.field2107];

         for(var6 = 0; var6 < this.field2107; ++var6) {
            this.field2099[var6] = var1.field2099[var6];
         }
      } else {
         this.field2099 = var1.field2099;
      }

      this.field2090 = var1.field2090;
      this.field2091 = var1.field2091;
      this.field2100 = var1.field2100;
      this.field2093 = var1.field2093;
      this.field2094 = var1.field2094;
      this.field2095 = var1.field2095;
      this.field2097 = var1.field2097;
      this.field2118 = var1.field2118;
      this.field2102 = var1.field2102;
      this.field2103 = var1.field2103;
      this.field2104 = var1.field2104;
      this.field2105 = var1.field2105;
      this.field2109 = var1.field2109;
      this.field2124 = var1.field2124;
      this.field2108 = var1.field2108;
      this.field2119 = var1.field2119;
      this.field2096 = var1.field2096;
      this.field2106 = var1.field2106;
      this.field2112 = var1.field2112;
      this.field2113 = var1.field2113;
      this.field2114 = var1.field2114;
   }

   @ObfuscatedName("v")
   public void method3841(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2087; ++var4) {
         this.field2111[var4] += var1;
         this.field2088[var4] += var2;
         this.field2089[var4] += var3;
      }

      this.method3847();
   }

   @ObfuscatedName("q")
   void method3847() {
      this.field2096 = null;
      this.field2112 = null;
      this.field2106 = null;
      this.field2115 = false;
   }

   @ObfuscatedName("z")
   public void method3839() {
      for(int var1 = 0; var1 < this.field2087; ++var1) {
         int var2 = this.field2089[var1];
         this.field2089[var1] = this.field2111[var1];
         this.field2111[var1] = -var2;
      }

      this.method3847();
   }

   @ObfuscatedName("r")
   public void method3837() {
      for(int var1 = 0; var1 < this.field2087; ++var1) {
         int var2 = this.field2111[var1];
         this.field2111[var1] = this.field2089[var1];
         this.field2089[var1] = -var2;
      }

      this.method3847();
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(IIIII)Lds;"
   )
   public final class200 method3863(int var1, int var2, int var3, int var4, int var5) {
      this.method3846();
      int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3 + var4 * var4));
      int var7 = var6 * var2 >> 8;
      class200 var8 = new class200();
      var8.field1887 = new int[this.field2107];
      var8.field1888 = new int[this.field2107];
      var8.field1875 = new int[this.field2107];
      if(this.field2110 > 0 && this.field2097 != null) {
         int[] var9 = new int[this.field2110];

         int var10;
         for(var10 = 0; var10 < this.field2107; ++var10) {
            if(this.field2097[var10] != -1) {
               ++var9[this.field2097[var10] & 255];
            }
         }

         var8.field1889 = 0;

         for(var10 = 0; var10 < this.field2110; ++var10) {
            if(var9[var10] > 0 && this.field2102[var10] == 0) {
               ++var8.field1889;
            }
         }

         var8.field1910 = new int[var8.field1889];
         var8.field1895 = new int[var8.field1889];
         var8.field1898 = new int[var8.field1889];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.field2110; ++var11) {
            if(var9[var11] > 0 && this.field2102[var11] == 0) {
               var8.field1910[var10] = this.field2103[var11] & '\uffff';
               var8.field1895[var10] = this.field2104[var11] & '\uffff';
               var8.field1898[var10] = this.field2105[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.field1892 = new byte[this.field2107];

         for(var11 = 0; var11 < this.field2107; ++var11) {
            if(this.field2097[var11] != -1) {
               var8.field1892[var11] = (byte)var9[this.field2097[var11] & 255];
            } else {
               var8.field1892[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.field2107; ++var16) {
         byte var17;
         if(this.field2094 == null) {
            var17 = 0;
         } else {
            var17 = this.field2094[var16];
         }

         byte var18;
         if(this.field2090 == null) {
            var18 = 0;
         } else {
            var18 = this.field2090[var16];
         }

         short var12;
         if(this.field2099 == null) {
            var12 = -1;
         } else {
            var12 = this.field2099[var16];
         }

         if(var18 == -2) {
            var17 = 3;
         }

         if(var18 == -1) {
            var17 = 2;
         }

         class224 var13;
         int var14;
         class294 var19;
         if(var12 == -1) {
            if(var17 != 0) {
               if(var17 == 1) {
                  var19 = this.field2106[var16];
                  var14 = (var4 * var19.field3168 + var5 * var19.field3170 + var3 * var19.field3169) / (var7 / 2 + var7) + var1;
                  var8.field1887[var16] = method3901(this.field2086[var16] & '\uffff', var14);
                  var8.field1875[var16] = -1;
               } else if(var17 == 3) {
                  var8.field1887[var16] = 128;
                  var8.field1875[var16] = -1;
               } else {
                  var8.field1875[var16] = -2;
               }
            } else {
               int var15 = this.field2086[var16] & '\uffff';
               if(this.field2112 != null && this.field2112[this.field2091[var16]] != null) {
                  var13 = this.field2112[this.field2091[var16]];
               } else {
                  var13 = this.field2096[this.field2091[var16]];
               }

               var14 = (var4 * var13.field2188 + var5 * var13.field2192 + var3 * var13.field2187) / (var7 * var13.field2190) + var1;
               var8.field1887[var16] = method3901(var15, var14);
               if(this.field2112 != null && this.field2112[this.field2100[var16]] != null) {
                  var13 = this.field2112[this.field2100[var16]];
               } else {
                  var13 = this.field2096[this.field2100[var16]];
               }

               var14 = (var4 * var13.field2188 + var5 * var13.field2192 + var3 * var13.field2187) / (var7 * var13.field2190) + var1;
               var8.field1888[var16] = method3901(var15, var14);
               if(this.field2112 != null && this.field2112[this.field2093[var16]] != null) {
                  var13 = this.field2112[this.field2093[var16]];
               } else {
                  var13 = this.field2096[this.field2093[var16]];
               }

               var14 = (var4 * var13.field2188 + var5 * var13.field2192 + var3 * var13.field2187) / (var7 * var13.field2190) + var1;
               var8.field1875[var16] = method3901(var15, var14);
            }
         } else if(var17 != 0) {
            if(var17 == 1) {
               var19 = this.field2106[var16];
               var14 = (var4 * var19.field3168 + var5 * var19.field3170 + var3 * var19.field3169) / (var7 / 2 + var7) + var1;
               var8.field1887[var16] = method3907(var14);
               var8.field1875[var16] = -1;
            } else {
               var8.field1875[var16] = -2;
            }
         } else {
            if(this.field2112 != null && this.field2112[this.field2091[var16]] != null) {
               var13 = this.field2112[this.field2091[var16]];
            } else {
               var13 = this.field2096[this.field2091[var16]];
            }

            var14 = (var4 * var13.field2188 + var5 * var13.field2192 + var3 * var13.field2187) / (var7 * var13.field2190) + var1;
            var8.field1887[var16] = method3907(var14);
            if(this.field2112 != null && this.field2112[this.field2100[var16]] != null) {
               var13 = this.field2112[this.field2100[var16]];
            } else {
               var13 = this.field2096[this.field2100[var16]];
            }

            var14 = (var4 * var13.field2188 + var5 * var13.field2192 + var3 * var13.field2187) / (var7 * var13.field2190) + var1;
            var8.field1888[var16] = method3907(var14);
            if(this.field2112 != null && this.field2112[this.field2093[var16]] != null) {
               var13 = this.field2112[this.field2093[var16]];
            } else {
               var13 = this.field2096[this.field2093[var16]];
            }

            var14 = (var4 * var13.field2188 + var5 * var13.field2192 + var3 * var13.field2187) / (var7 * var13.field2190) + var1;
            var8.field1875[var16] = method3907(var14);
         }
      }

      this.method3836();
      var8.field1942 = this.field2087;
      var8.field1880 = this.field2111;
      var8.field1943 = this.field2088;
      var8.field1882 = this.field2089;
      var8.field1883 = this.field2107;
      var8.field1884 = this.field2091;
      var8.field1922 = this.field2100;
      var8.field1886 = this.field2093;
      var8.field1921 = this.field2095;
      var8.field1891 = this.field2090;
      var8.field1894 = this.field2118;
      var8.field1925 = this.field2108;
      var8.field1900 = this.field2119;
      var8.field1893 = this.field2099;
      return var8;
   }

   @ObfuscatedName("p")
   void method3836() {
      int[] var1;
      int var2;
      int var3;
      int var4;
      if(this.field2109 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field2087; ++var3) {
            var4 = this.field2109[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.field2108 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field2108[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field2087; this.field2108[var4][var1[var4]++] = var3++) {
            var4 = this.field2109[var3];
         }

         this.field2109 = null;
      }

      if(this.field2124 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field2107; ++var3) {
            var4 = this.field2124[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.field2119 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field2119[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field2107; this.field2119[var4][var1[var4]++] = var3++) {
            var4 = this.field2124[var3];
         }

         this.field2124 = null;
      }

   }

   @ObfuscatedName("u")
   public void method3843(short var1, short var2) {
      if(this.field2099 != null) {
         for(int var3 = 0; var3 < this.field2107; ++var3) {
            if(this.field2099[var3] == var1) {
               this.field2099[var3] = var2;
            }
         }

      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "([[IIIIZI)Ldb;"
   )
   public class218 method3835(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method3848();
      int var7 = var2 + this.field2117;
      int var8 = var2 + this.field2092;
      int var9 = var4 + this.field2098;
      int var10 = var4 + this.field2101;
      if(var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if(var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
            return this;
         } else {
            class218 var11 = new class218();
            var11.field2087 = this.field2087;
            var11.field2107 = this.field2107;
            var11.field2110 = this.field2110;
            var11.field2111 = this.field2111;
            var11.field2089 = this.field2089;
            var11.field2091 = this.field2091;
            var11.field2100 = this.field2100;
            var11.field2093 = this.field2093;
            var11.field2094 = this.field2094;
            var11.field2095 = this.field2095;
            var11.field2090 = this.field2090;
            var11.field2097 = this.field2097;
            var11.field2086 = this.field2086;
            var11.field2099 = this.field2099;
            var11.field2118 = this.field2118;
            var11.field2102 = this.field2102;
            var11.field2103 = this.field2103;
            var11.field2104 = this.field2104;
            var11.field2105 = this.field2105;
            var11.field2109 = this.field2109;
            var11.field2124 = this.field2124;
            var11.field2108 = this.field2108;
            var11.field2119 = this.field2119;
            var11.field2113 = this.field2113;
            var11.field2114 = this.field2114;
            var11.field2088 = new int[var11.field2087];
            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if(var6 == 0) {
               for(var12 = 0; var12 < var11.field2087; ++var12) {
                  var13 = var2 + this.field2111[var12];
                  var14 = var4 + this.field2089[var12];
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field2088[var12] = var21 + this.field2088[var12] - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field2087; ++var12) {
                  var13 = (-this.field2088[var12] << 16) / super.field3281;
                  if(var13 < var6) {
                     var14 = var2 + this.field2111[var12];
                     var15 = var4 + this.field2089[var12];
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field2088[var12] = (var6 - var13) * (var22 - var3) / var6 + this.field2088[var12];
                  }
               }
            }

            var11.method3847();
            return var11;
         }
      } else {
         return this;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "()Ldb;"
   )
   public class218 method3834() {
      class218 var1 = new class218();
      if(this.field2094 != null) {
         var1.field2094 = new byte[this.field2107];

         for(int var2 = 0; var2 < this.field2107; ++var2) {
            var1.field2094[var2] = this.field2094[var2];
         }
      }

      var1.field2087 = this.field2087;
      var1.field2107 = this.field2107;
      var1.field2110 = this.field2110;
      var1.field2111 = this.field2111;
      var1.field2088 = this.field2088;
      var1.field2089 = this.field2089;
      var1.field2091 = this.field2091;
      var1.field2100 = this.field2100;
      var1.field2093 = this.field2093;
      var1.field2095 = this.field2095;
      var1.field2090 = this.field2090;
      var1.field2097 = this.field2097;
      var1.field2086 = this.field2086;
      var1.field2099 = this.field2099;
      var1.field2118 = this.field2118;
      var1.field2102 = this.field2102;
      var1.field2103 = this.field2103;
      var1.field2104 = this.field2104;
      var1.field2105 = this.field2105;
      var1.field2109 = this.field2109;
      var1.field2124 = this.field2124;
      var1.field2108 = this.field2108;
      var1.field2119 = this.field2119;
      var1.field2096 = this.field2096;
      var1.field2106 = this.field2106;
      var1.field2113 = this.field2113;
      var1.field2114 = this.field2114;
      return var1;
   }

   @ObfuscatedName("x")
   public void method3840(int var1) {
      int var2 = field2120[var1];
      int var3 = field2125[var1];

      for(int var4 = 0; var4 < this.field2087; ++var4) {
         int var5 = var2 * this.field2089[var4] + var3 * this.field2111[var4] >> 16;
         this.field2089[var4] = var3 * this.field2089[var4] - var2 * this.field2111[var4] >> 16;
         this.field2111[var4] = var5;
      }

      this.method3847();
   }

   @ObfuscatedName("l")
   void method3860(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var2.field1073 = var1.length - 23;
      int var9 = var2.readUnsignedShort();
      int var10 = var2.readUnsignedShort();
      int var11 = var2.readUnsignedByte();
      int var12 = var2.readUnsignedByte();
      int var13 = var2.readUnsignedByte();
      int var14 = var2.readUnsignedByte();
      int var15 = var2.readUnsignedByte();
      int var16 = var2.readUnsignedByte();
      int var17 = var2.readUnsignedByte();
      int var18 = var2.readUnsignedShort();
      int var19 = var2.readUnsignedShort();
      int var20 = var2.readUnsignedShort();
      int var21 = var2.readUnsignedShort();
      int var22 = var2.readUnsignedShort();
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if(var11 > 0) {
         this.field2102 = new byte[var11];
         var2.field1073 = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.field2102[var26] = var2.method1906();
            if(var27 == 0) {
               ++var23;
            }

            if(var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if(var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if(var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if(var13 == 255) {
         var26 += var10;
      }

      int var31 = var26;
      if(var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if(var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if(var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if(var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.field2087 = var9;
      this.field2107 = var10;
      this.field2110 = var11;
      this.field2111 = new int[var9];
      this.field2088 = new int[var9];
      this.field2089 = new int[var9];
      this.field2091 = new int[var10];
      this.field2100 = new int[var10];
      this.field2093 = new int[var10];
      if(var17 == 1) {
         this.field2109 = new int[var9];
      }

      if(var12 == 1) {
         this.field2094 = new byte[var10];
      }

      if(var13 == 255) {
         this.field2095 = new byte[var10];
      } else {
         this.field2118 = (byte)var13;
      }

      if(var14 == 1) {
         this.field2090 = new byte[var10];
      }

      if(var15 == 1) {
         this.field2124 = new int[var10];
      }

      if(var16 == 1) {
         this.field2099 = new short[var10];
      }

      if(var16 == 1 && var11 > 0) {
         this.field2097 = new byte[var10];
      }

      this.field2086 = new short[var10];
      if(var11 > 0) {
         this.field2103 = new short[var11];
         this.field2104 = new short[var11];
         this.field2105 = new short[var11];
      }

      var2.field1073 = var11;
      var3.field1073 = var38;
      var4.field1073 = var39;
      var5.field1073 = var40;
      var6.field1073 = var32;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.readUnsignedByte();
         var53 = 0;
         if((var52 & 1) != 0) {
            var53 = var3.method1988();
         }

         var54 = 0;
         if((var52 & 2) != 0) {
            var54 = var4.method1988();
         }

         var55 = 0;
         if((var52 & 4) != 0) {
            var55 = var5.method1988();
         }

         this.field2111[var51] = var48 + var53;
         this.field2088[var51] = var49 + var54;
         this.field2089[var51] = var50 + var55;
         var48 = this.field2111[var51];
         var49 = this.field2088[var51];
         var50 = this.field2089[var51];
         if(var17 == 1) {
            this.field2109[var51] = var6.readUnsignedByte();
         }
      }

      var2.field1073 = var37;
      var3.field1073 = var28;
      var4.field1073 = var30;
      var5.field1073 = var33;
      var6.field1073 = var31;
      var7.field1073 = var35;
      var8.field1073 = var36;

      for(var51 = 0; var51 < var10; ++var51) {
         this.field2086[var51] = (short)var2.readUnsignedShort();
         if(var12 == 1) {
            this.field2094[var51] = var3.method1906();
         }

         if(var13 == 255) {
            this.field2095[var51] = var4.method1906();
         }

         if(var14 == 1) {
            this.field2090[var51] = var5.method1906();
         }

         if(var15 == 1) {
            this.field2124[var51] = var6.readUnsignedByte();
         }

         if(var16 == 1) {
            this.field2099[var51] = (short)(var7.readUnsignedShort() - 1);
         }

         if(this.field2097 != null && this.field2099[var51] != -1) {
            this.field2097[var51] = (byte)(var8.readUnsignedByte() - 1);
         }
      }

      var2.field1073 = var34;
      var3.field1073 = var29;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.readUnsignedByte();
         if(var56 == 1) {
            var51 = var2.method1988() + var54;
            var52 = var2.method1988() + var51;
            var53 = var2.method1988() + var52;
            var54 = var53;
            this.field2091[var55] = var51;
            this.field2100[var55] = var52;
            this.field2093[var55] = var53;
         }

         if(var56 == 2) {
            var52 = var53;
            var53 = var2.method1988() + var54;
            var54 = var53;
            this.field2091[var55] = var51;
            this.field2100[var55] = var52;
            this.field2093[var55] = var53;
         }

         if(var56 == 3) {
            var51 = var53;
            var53 = var2.method1988() + var54;
            var54 = var53;
            this.field2091[var55] = var51;
            this.field2100[var55] = var52;
            this.field2093[var55] = var53;
         }

         if(var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.method1988() + var54;
            var54 = var53;
            this.field2091[var55] = var51;
            this.field2100[var55] = var57;
            this.field2093[var55] = var53;
         }
      }

      var2.field1073 = var41;
      var3.field1073 = var42;
      var4.field1073 = var43;
      var5.field1073 = var44;
      var6.field1073 = var45;
      var7.field1073 = var46;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.field2102[var55] & 255;
         if(var56 == 0) {
            this.field2103[var55] = (short)var2.readUnsignedShort();
            this.field2104[var55] = (short)var2.readUnsignedShort();
            this.field2105[var55] = (short)var2.readUnsignedShort();
         }
      }

      var2.field1073 = var26;
      var55 = var2.readUnsignedByte();
      if(var55 != 0) {
         new class78();
         var2.readUnsignedShort();
         var2.readUnsignedShort();
         var2.readUnsignedShort();
         var2.readInt();
      }

   }

   @ObfuscatedName("o")
   public void method3844() {
      int var1;
      for(var1 = 0; var1 < this.field2087; ++var1) {
         this.field2089[var1] = -this.field2089[var1];
      }

      for(var1 = 0; var1 < this.field2107; ++var1) {
         int var2 = this.field2091[var1];
         this.field2091[var1] = this.field2093[var1];
         this.field2093[var1] = var2;
      }

      this.method3847();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ldb;I)I"
   )
   final int method3868(class218 var1, int var2) {
      int var3 = -1;
      int var4 = var1.field2111[var2];
      int var5 = var1.field2088[var2];
      int var6 = var1.field2089[var2];

      for(int var7 = 0; var7 < this.field2087; ++var7) {
         if(var4 == this.field2111[var7] && var5 == this.field2088[var7] && var6 == this.field2089[var7]) {
            var3 = var7;
            break;
         }
      }

      if(var3 == -1) {
         this.field2111[this.field2087] = var4;
         this.field2088[this.field2087] = var5;
         this.field2089[this.field2087] = var6;
         if(var1.field2109 != null) {
            this.field2109[this.field2087] = var1.field2109[var2];
         }

         var3 = this.field2087++;
      }

      return var3;
   }

   @ObfuscatedName("g")
   public void method3842(short var1, short var2) {
      for(int var3 = 0; var3 < this.field2107; ++var3) {
         if(this.field2086[var3] == var1) {
            this.field2086[var3] = var2;
         }
      }

   }

   @ObfuscatedName("w")
   void method3832(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var4.field1073 = var1.length - 18;
      int var9 = var4.readUnsignedShort();
      int var10 = var4.readUnsignedShort();
      int var11 = var4.readUnsignedByte();
      int var12 = var4.readUnsignedByte();
      int var13 = var4.readUnsignedByte();
      int var14 = var4.readUnsignedByte();
      int var15 = var4.readUnsignedByte();
      int var16 = var4.readUnsignedByte();
      int var17 = var4.readUnsignedShort();
      int var18 = var4.readUnsignedShort();
      int var19 = var4.readUnsignedShort();
      int var20 = var4.readUnsignedShort();
      byte var21 = 0;
      int var45 = var21 + var9;
      int var23 = var45;
      var45 += var10;
      int var24 = var45;
      if(var13 == 255) {
         var45 += var10;
      }

      int var25 = var45;
      if(var15 == 1) {
         var45 += var10;
      }

      int var26 = var45;
      if(var12 == 1) {
         var45 += var10;
      }

      int var27 = var45;
      if(var16 == 1) {
         var45 += var9;
      }

      int var28 = var45;
      if(var14 == 1) {
         var45 += var10;
      }

      int var29 = var45;
      var45 += var20;
      int var30 = var45;
      var45 += var10 * 2;
      int var31 = var45;
      var45 += var11 * 6;
      int var32 = var45;
      var45 += var17;
      int var33 = var45;
      var45 += var18;
      int var10000 = var45 + var19;
      this.field2087 = var9;
      this.field2107 = var10;
      this.field2110 = var11;
      this.field2111 = new int[var9];
      this.field2088 = new int[var9];
      this.field2089 = new int[var9];
      this.field2091 = new int[var10];
      this.field2100 = new int[var10];
      this.field2093 = new int[var10];
      if(var11 > 0) {
         this.field2102 = new byte[var11];
         this.field2103 = new short[var11];
         this.field2104 = new short[var11];
         this.field2105 = new short[var11];
      }

      if(var16 == 1) {
         this.field2109 = new int[var9];
      }

      if(var12 == 1) {
         this.field2094 = new byte[var10];
         this.field2097 = new byte[var10];
         this.field2099 = new short[var10];
      }

      if(var13 == 255) {
         this.field2095 = new byte[var10];
      } else {
         this.field2118 = (byte)var13;
      }

      if(var14 == 1) {
         this.field2090 = new byte[var10];
      }

      if(var15 == 1) {
         this.field2124 = new int[var10];
      }

      this.field2086 = new short[var10];
      var4.field1073 = var21;
      var5.field1073 = var32;
      var6.field1073 = var33;
      var7.field1073 = var45;
      var8.field1073 = var27;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.readUnsignedByte();
         var40 = 0;
         if((var39 & 1) != 0) {
            var40 = var5.method1988();
         }

         var41 = 0;
         if((var39 & 2) != 0) {
            var41 = var6.method1988();
         }

         var42 = 0;
         if((var39 & 4) != 0) {
            var42 = var7.method1988();
         }

         this.field2111[var38] = var35 + var40;
         this.field2088[var38] = var36 + var41;
         this.field2089[var38] = var37 + var42;
         var35 = this.field2111[var38];
         var36 = this.field2088[var38];
         var37 = this.field2089[var38];
         if(var16 == 1) {
            this.field2109[var38] = var8.readUnsignedByte();
         }
      }

      var4.field1073 = var30;
      var5.field1073 = var26;
      var6.field1073 = var24;
      var7.field1073 = var28;
      var8.field1073 = var25;

      for(var38 = 0; var38 < var10; ++var38) {
         this.field2086[var38] = (short)var4.readUnsignedShort();
         if(var12 == 1) {
            var39 = var5.readUnsignedByte();
            if((var39 & 1) == 1) {
               this.field2094[var38] = 1;
               var2 = true;
            } else {
               this.field2094[var38] = 0;
            }

            if((var39 & 2) == 2) {
               this.field2097[var38] = (byte)(var39 >> 2);
               this.field2099[var38] = this.field2086[var38];
               this.field2086[var38] = 127;
               if(this.field2099[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.field2097[var38] = -1;
               this.field2099[var38] = -1;
            }
         }

         if(var13 == 255) {
            this.field2095[var38] = var6.method1906();
         }

         if(var14 == 1) {
            this.field2090[var38] = var7.method1906();
         }

         if(var15 == 1) {
            this.field2124[var38] = var8.readUnsignedByte();
         }
      }

      var4.field1073 = var29;
      var5.field1073 = var23;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.readUnsignedByte();
         if(var43 == 1) {
            var38 = var4.method1988() + var41;
            var39 = var4.method1988() + var38;
            var40 = var4.method1988() + var39;
            var41 = var40;
            this.field2091[var42] = var38;
            this.field2100[var42] = var39;
            this.field2093[var42] = var40;
         }

         if(var43 == 2) {
            var39 = var40;
            var40 = var4.method1988() + var41;
            var41 = var40;
            this.field2091[var42] = var38;
            this.field2100[var42] = var39;
            this.field2093[var42] = var40;
         }

         if(var43 == 3) {
            var38 = var40;
            var40 = var4.method1988() + var41;
            var41 = var40;
            this.field2091[var42] = var38;
            this.field2100[var42] = var39;
            this.field2093[var42] = var40;
         }

         if(var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.method1988() + var41;
            var41 = var40;
            this.field2091[var42] = var38;
            this.field2100[var42] = var44;
            this.field2093[var42] = var40;
         }
      }

      var4.field1073 = var31;

      for(var42 = 0; var42 < var11; ++var42) {
         this.field2102[var42] = 0;
         this.field2103[var42] = (short)var4.readUnsignedShort();
         this.field2104[var42] = (short)var4.readUnsignedShort();
         this.field2105[var42] = (short)var4.readUnsignedShort();
      }

      if(this.field2097 != null) {
         boolean var46 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.field2097[var43] & 255;
            if(var44 != 255) {
               if(this.field2091[var43] == (this.field2103[var44] & '\uffff') && this.field2100[var43] == (this.field2104[var44] & '\uffff') && this.field2093[var43] == (this.field2105[var44] & '\uffff')) {
                  this.field2097[var43] = -1;
               } else {
                  var46 = true;
               }
            }
         }

         if(!var46) {
            this.field2097 = null;
         }
      }

      if(!var3) {
         this.field2099 = null;
      }

      if(!var2) {
         this.field2094 = null;
      }

   }

   @ObfuscatedName("k")
   public void method3846() {
      if(this.field2096 == null) {
         this.field2096 = new class224[this.field2087];

         int var1;
         for(var1 = 0; var1 < this.field2087; ++var1) {
            this.field2096[var1] = new class224();
         }

         for(var1 = 0; var1 < this.field2107; ++var1) {
            int var2 = this.field2091[var1];
            int var3 = this.field2100[var1];
            int var4 = this.field2093[var1];
            int var5 = this.field2111[var3] - this.field2111[var2];
            int var6 = this.field2088[var3] - this.field2088[var2];
            int var7 = this.field2089[var3] - this.field2089[var2];
            int var8 = this.field2111[var4] - this.field2111[var2];
            int var9 = this.field2088[var4] - this.field2088[var2];
            int var10 = this.field2089[var4] - this.field2089[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if(var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if(this.field2094 == null) {
               var15 = 0;
            } else {
               var15 = this.field2094[var1];
            }

            if(var15 == 0) {
               class224 var16 = this.field2096[var2];
               var16.field2187 += var11;
               var16.field2188 += var12;
               var16.field2192 += var13;
               ++var16.field2190;
               var16 = this.field2096[var3];
               var16.field2187 += var11;
               var16.field2188 += var12;
               var16.field2192 += var13;
               ++var16.field2190;
               var16 = this.field2096[var4];
               var16.field2187 += var11;
               var16.field2188 += var12;
               var16.field2192 += var13;
               ++var16.field2190;
            } else if(var15 == 1) {
               if(this.field2106 == null) {
                  this.field2106 = new class294[this.field2107];
               }

               class294 var17 = this.field2106[var1] = new class294();
               var17.field3169 = var11;
               var17.field3168 = var12;
               var17.field3170 = var13;
            }
         }

      }
   }

   @ObfuscatedName("i")
   public void method3845(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2087; ++var4) {
         this.field2111[var4] = this.field2111[var4] * var1 / 128;
         this.field2088[var4] = var2 * this.field2088[var4] / 128;
         this.field2089[var4] = var3 * this.field2089[var4] / 128;
      }

      this.method3847();
   }

   @ObfuscatedName("y")
   void method3848() {
      if(!this.field2115) {
         super.field3281 = 0;
         this.field2116 = 0;
         this.field2117 = 999999;
         this.field2092 = -999999;
         this.field2101 = -99999;
         this.field2098 = 99999;

         for(int var1 = 0; var1 < this.field2087; ++var1) {
            int var2 = this.field2111[var1];
            int var3 = this.field2088[var1];
            int var4 = this.field2089[var1];
            if(var2 < this.field2117) {
               this.field2117 = var2;
            }

            if(var2 > this.field2092) {
               this.field2092 = var2;
            }

            if(var4 < this.field2098) {
               this.field2098 = var4;
            }

            if(var4 > this.field2101) {
               this.field2101 = var4;
            }

            if(-var3 > super.field3281) {
               super.field3281 = -var3;
            }

            if(var3 > this.field2116) {
               this.field2116 = var3;
            }
         }

         this.field2115 = true;
      }
   }

   @ObfuscatedName("d")
   public void method3871() {
      for(int var1 = 0; var1 < this.field2087; ++var1) {
         this.field2111[var1] = -this.field2111[var1];
         this.field2089[var1] = -this.field2089[var1];
      }

      this.method3847();
   }

   @ObfuscatedName("af")
   static final int method3901(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;II)Ldb;"
   )
   public static class218 method3830(class148 var0, int var1, int var2) {
      byte[] var3 = var0.method2579(var1, var2, -1448646867);
      return var3 == null?null:new class218(var3);
   }

   @ObfuscatedName("az")
   static final int method3907(int var0) {
      if(var0 < 2) {
         var0 = 2;
      } else if(var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(Ldb;Ldb;IIIZ)V"
   )
   static void method3858(class218 var0, class218 var1, int var2, int var3, int var4, boolean var5) {
      var0.method3848();
      var0.method3846();
      var1.method3848();
      var1.method3846();
      ++field2123;
      int var6 = 0;
      int[] var7 = var1.field2111;
      int var8 = var1.field2087;

      int var9;
      for(var9 = 0; var9 < var0.field2087; ++var9) {
         class224 var10 = var0.field2096[var9];
         if(var10.field2190 != 0) {
            int var11 = var0.field2088[var9] - var3;
            if(var11 <= var1.field2116) {
               int var12 = var0.field2111[var9] - var2;
               if(var12 >= var1.field2117 && var12 <= var1.field2092) {
                  int var13 = var0.field2089[var9] - var4;
                  if(var13 >= var1.field2098 && var13 <= var1.field2101) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        class224 var15 = var1.field2096[var14];
                        if(var12 == var7[var14] && var13 == var1.field2089[var14] && var11 == var1.field2088[var14] && var15.field2190 != 0) {
                           if(var0.field2112 == null) {
                              var0.field2112 = new class224[var0.field2087];
                           }

                           if(var1.field2112 == null) {
                              var1.field2112 = new class224[var8];
                           }

                           class224 var16 = var0.field2112[var9];
                           if(var16 == null) {
                              var16 = var0.field2112[var9] = new class224(var10);
                           }

                           class224 var17 = var1.field2112[var14];
                           if(var17 == null) {
                              var17 = var1.field2112[var14] = new class224(var15);
                           }

                           var16.field2187 += var15.field2187;
                           var16.field2188 += var15.field2188;
                           var16.field2192 += var15.field2192;
                           var16.field2190 += var15.field2190;
                           var17.field2187 += var10.field2187;
                           var17.field2188 += var10.field2188;
                           var17.field2192 += var10.field2192;
                           var17.field2190 += var10.field2190;
                           ++var6;
                           field2121[var9] = field2123;
                           field2122[var14] = field2123;
                        }
                     }
                  }
               }
            }
         }
      }

      if(var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.field2107; ++var9) {
            if(field2121[var0.field2091[var9]] == field2123 && field2121[var0.field2100[var9]] == field2123 && field2121[var0.field2093[var9]] == field2123) {
               if(var0.field2094 == null) {
                  var0.field2094 = new byte[var0.field2107];
               }

               var0.field2094[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.field2107; ++var9) {
            if(field2123 == field2122[var1.field2091[var9]] && field2123 == field2122[var1.field2100[var9]] && field2123 == field2122[var1.field2093[var9]]) {
               if(var1.field2094 == null) {
                  var1.field2094 = new byte[var1.field2107];
               }

               var1.field2094[var9] = 2;
            }
         }

      }
   }
}
