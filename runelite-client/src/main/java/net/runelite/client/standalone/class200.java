package net.runelite.client.standalone;

import java.awt.Polygon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.model.Jarvis;
import net.runelite.api.model.Triangle;
import net.runelite.api.model.Vertex;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFrame;
import net.runelite.rs.api.RSFrameMap;
import net.runelite.rs.api.RSFrames;
import net.runelite.rs.api.RSModel;

@ObfuscatedName("ds")
public class class200 extends class308 implements RSModel {
   @ObfuscatedName("au")
   static int[] field1920;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lds;"
   )
   static class200 field1937;
   @ObfuscatedName("bs")
   static int[] field1932;
   @ObfuscatedName("ay")
   static int[] field1923;
   @ObfuscatedName("ar")
   static int[] field1917;
   @ObfuscatedName("bl")
   static int[] field1931;
   @ObfuscatedName("bw")
   static boolean field1936;
   @ObfuscatedName("be")
   static int[] field1879;
   @ObfuscatedName("bg")
   static int field1927;
   @ObfuscatedName("bu")
   static int[] field1930;
   @ObfuscatedName("aq")
   static int[] field1919;
   @ObfuscatedName("bn")
   static int[] field1939;
   @ObfuscatedName("ao")
   static boolean[] field1881;
   @ObfuscatedName("l")
   static byte[] field1876;
   @ObfuscatedName("ae")
   static boolean[] field1915;
   @ObfuscatedName("ab")
   static int[] field1918;
   @ObfuscatedName("s")
   static byte[] field1878;
   @ObfuscatedName("bk")
   static int[] field1885;
   @ObfuscatedName("bo")
   static int[] field1928;
   @ObfuscatedName("ai")
   static int[] field1890;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lds;"
   )
   static class200 field1899;
   @ObfuscatedName("ak")
   static int[][] field1926;
   @ObfuscatedName("bv")
   static int[] field1940;
   @ObfuscatedName("an")
   static int[][] field1896;
   @ObfuscatedName("aj")
   static int[] field1914;
   @ObfuscatedName("ba")
   static int field1933;
   @ObfuscatedName("bm")
   static int field1934;
   @ObfuscatedName("bf")
   static int[] field1941;
   @ObfuscatedName("ap")
   static int[] field1916;
   @ObfuscatedName("bx")
   static int[] field1929;
   @ObfuscatedName("af")
   int field1903;
   @ObfuscatedName("aw")
   int field1897;
   @ObfuscatedName("j")
   byte[] field1921;
   @ObfuscatedName("v")
   int[] field1888;
   @ObfuscatedName("n")
   byte field1894;
   @ObfuscatedName("ac")
   int field1906;
   @ObfuscatedName("ad")
   int field1912;
   @ObfuscatedName("m")
   int[] field1884;
   @ObfuscatedName("q")
   int[][] field1925;
   @ObfuscatedName("z")
   int[] field1886;
   @ObfuscatedName("h")
   int field1889;
   @ObfuscatedName("r")
   int field1883;
   @ObfuscatedName("ag")
   int field1902;
   @ObfuscatedName("as")
   int field1924;
   @ObfuscatedName("p")
   int[] field1882;
   @ObfuscatedName("u")
   byte[] field1892;
   @ObfuscatedName("c")
   int[] field1943;
   @ObfuscatedName("e")
   int field1942;
   @ObfuscatedName("b")
   byte[] field1891;
   @ObfuscatedName("t")
   short[] field1893;
   @ObfuscatedName("x")
   int[] field1887;
   @ObfuscatedName("az")
   int field1904;
   @ObfuscatedName("o")
   int[] field1910;
   @ObfuscatedName("a")
   int[] field1880;
   @ObfuscatedName("g")
   int[] field1875;
   @ObfuscatedName("k")
   int[] field1898;
   @ObfuscatedName("aa")
   int field1909;
   @ObfuscatedName("i")
   int[] field1895;
   @ObfuscatedName("am")
   int field1907;
   @ObfuscatedName("y")
   int[][] field1900;
   @ObfuscatedName("d")
   int[] field1922;
   @ObfuscatedName("at")
   int field1905;
   @ObfuscatedName("al")
   int field1911;
   @ObfuscatedName("av")
   public boolean field1901;

   static {
      field1937 = new class200();
      field1876 = new byte[1];
      field1899 = new class200();
      field1878 = new byte[1];
      field1881 = new boolean[4700];
      field1915 = new boolean[4700];
      field1916 = new int[4700];
      field1917 = new int[4700];
      field1918 = new int[4700];
      field1919 = new int[4700];
      field1920 = new int[4700];
      field1914 = new int[4700];
      field1890 = new int[1600];
      field1896 = new int[1600][512];
      field1923 = new int[12];
      field1926 = new int[12][2000];
      field1879 = new int[2000];
      field1928 = new int[2000];
      field1929 = new int[12];
      field1941 = new int[10];
      field1931 = new int[10];
      field1932 = new int[10];
      field1936 = true;
      field1939 = class257.field2564;
      field1940 = class257.field2558;
      field1930 = class257.field2560;
      field1885 = class257.field2549;
   }

   class200() {
      this.field1942 = 0;
      this.field1883 = 0;
      this.field1894 = 0;
      this.field1889 = 0;
      this.field1901 = false;
      this.field1924 = -1;
      this.field1911 = -1;
      this.field1912 = -1;
   }

   @ObfuscatedSignature(
      signature = "([Lds;I)V"
   )
   public class200(class200[] var1, int var2) {
      this.field1942 = 0;
      this.field1883 = 0;
      this.field1894 = 0;
      this.field1889 = 0;
      this.field1901 = false;
      this.field1924 = -1;
      this.field1911 = -1;
      this.field1912 = -1;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      this.field1942 = 0;
      this.field1883 = 0;
      this.field1889 = 0;
      this.field1894 = -1;

      int var7;
      class200 var8;
      for(var7 = 0; var7 < var2; ++var7) {
         var8 = var1[var7];
         if(var8 != null) {
            this.field1942 += var8.field1942;
            this.field1883 += var8.field1883;
            this.field1889 += var8.field1889;
            if(var8.field1921 != null) {
               var3 = true;
            } else {
               if(this.field1894 == -1) {
                  this.field1894 = var8.field1894;
               }

               if(this.field1894 != var8.field1894) {
                  var3 = true;
               }
            }

            var4 |= var8.field1891 != null;
            var5 |= var8.field1893 != null;
            var6 |= var8.field1892 != null;
         }
      }

      this.field1880 = new int[this.field1942];
      this.field1943 = new int[this.field1942];
      this.field1882 = new int[this.field1942];
      this.field1884 = new int[this.field1883];
      this.field1922 = new int[this.field1883];
      this.field1886 = new int[this.field1883];
      this.field1887 = new int[this.field1883];
      this.field1888 = new int[this.field1883];
      this.field1875 = new int[this.field1883];
      if(var3) {
         this.field1921 = new byte[this.field1883];
      }

      if(var4) {
         this.field1891 = new byte[this.field1883];
      }

      if(var5) {
         this.field1893 = new short[this.field1883];
      }

      if(var6) {
         this.field1892 = new byte[this.field1883];
      }

      if(this.field1889 > 0) {
         this.field1910 = new int[this.field1889];
         this.field1895 = new int[this.field1889];
         this.field1898 = new int[this.field1889];
      }

      this.field1942 = 0;
      this.field1883 = 0;
      this.field1889 = 0;

      for(var7 = 0; var7 < var2; ++var7) {
         var8 = var1[var7];
         if(var8 != null) {
            int var9;
            for(var9 = 0; var9 < var8.field1883; ++var9) {
               this.field1884[this.field1883] = this.field1942 + var8.field1884[var9];
               this.field1922[this.field1883] = this.field1942 + var8.field1922[var9];
               this.field1886[this.field1883] = this.field1942 + var8.field1886[var9];
               this.field1887[this.field1883] = var8.field1887[var9];
               this.field1888[this.field1883] = var8.field1888[var9];
               this.field1875[this.field1883] = var8.field1875[var9];
               if(var3) {
                  if(var8.field1921 != null) {
                     this.field1921[this.field1883] = var8.field1921[var9];
                  } else {
                     this.field1921[this.field1883] = var8.field1894;
                  }
               }

               if(var4 && var8.field1891 != null) {
                  this.field1891[this.field1883] = var8.field1891[var9];
               }

               if(var5) {
                  if(var8.field1893 != null) {
                     this.field1893[this.field1883] = var8.field1893[var9];
                  } else {
                     this.field1893[this.field1883] = -1;
                  }
               }

               if(var6) {
                  if(var8.field1892 != null && var8.field1892[var9] != -1) {
                     this.field1892[this.field1883] = (byte)(this.field1889 + var8.field1892[var9]);
                  } else {
                     this.field1892[this.field1883] = -1;
                  }
               }

               ++this.field1883;
            }

            for(var9 = 0; var9 < var8.field1889; ++var9) {
               this.field1910[this.field1889] = this.field1942 + var8.field1910[var9];
               this.field1895[this.field1889] = this.field1942 + var8.field1895[var9];
               this.field1898[this.field1889] = this.field1942 + var8.field1898[var9];
               ++this.field1889;
            }

            for(var9 = 0; var9 < var8.field1942; ++var9) {
               this.field1880[this.field1942] = var8.field1880[var9];
               this.field1943[this.field1942] = var8.field1943[var9];
               this.field1882[this.field1942] = var8.field1882[var9];
               ++this.field1942;
            }
         }
      }

   }

   @ObfuscatedName("af")
   final void method3391(int var1) {
      if(field1915[var1]) {
         this.method3431(var1);
      } else {
         int var2 = this.field1884[var1];
         int var3 = this.field1922[var1];
         int var4 = this.field1886[var1];
         class257.field2553 = field1881[var1];
         if(this.field1891 == null) {
            class257.field2543 = 0;
         } else {
            class257.field2543 = this.field1891[var1] & 255;
         }

         if(this.field1893 != null && this.field1893[var1] != -1) {
            int var5;
            int var6;
            int var7;
            if(this.field1892 != null && this.field1892[var1] != -1) {
               int var8 = this.field1892[var1] & 255;
               var5 = this.field1910[var8];
               var6 = this.field1895[var8];
               var7 = this.field1898[var8];
            } else {
               var5 = var2;
               var6 = var3;
               var7 = var4;
            }

            if(this.field1875[var1] == -1) {
               class257.method4583(field1917[var2], field1917[var3], field1917[var4], field1916[var2], field1916[var3], field1916[var4], this.field1887[var1], this.field1887[var1], this.field1887[var1], field1919[var5], field1919[var6], field1919[var7], field1920[var5], field1920[var6], field1920[var7], field1914[var5], field1914[var6], field1914[var7], this.field1893[var1]);
            } else {
               class257.method4583(field1917[var2], field1917[var3], field1917[var4], field1916[var2], field1916[var3], field1916[var4], this.field1887[var1], this.field1888[var1], this.field1875[var1], field1919[var5], field1919[var6], field1919[var7], field1920[var5], field1920[var6], field1920[var7], field1914[var5], field1914[var6], field1914[var7], this.field1893[var1]);
            }
         } else if(this.field1875[var1] == -1) {
            class257.method4648(field1917[var2], field1917[var3], field1917[var4], field1916[var2], field1916[var3], field1916[var4], field1930[this.field1887[var1]]);
         } else {
            class257.method4579(field1917[var2], field1917[var3], field1917[var4], field1916[var2], field1916[var3], field1916[var4], this.field1887[var1], this.field1888[var1], this.field1875[var1]);
         }

      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([[IIIIZI)Lds;"
   )
   public class200 method3369(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method3374();
      int var7 = var2 - this.field1904;
      int var8 = var2 + this.field1904;
      int var9 = var4 - this.field1904;
      int var10 = var4 + this.field1904;
      if(var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if(var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
            return this;
         } else {
            class200 var11;
            if(var5) {
               var11 = new class200();
               var11.field1942 = this.field1942;
               var11.field1883 = this.field1883;
               var11.field1889 = this.field1889;
               var11.field1880 = this.field1880;
               var11.field1882 = this.field1882;
               var11.field1884 = this.field1884;
               var11.field1922 = this.field1922;
               var11.field1886 = this.field1886;
               var11.field1887 = this.field1887;
               var11.field1888 = this.field1888;
               var11.field1875 = this.field1875;
               var11.field1921 = this.field1921;
               var11.field1891 = this.field1891;
               var11.field1892 = this.field1892;
               var11.field1893 = this.field1893;
               var11.field1894 = this.field1894;
               var11.field1910 = this.field1910;
               var11.field1895 = this.field1895;
               var11.field1898 = this.field1898;
               var11.field1925 = this.field1925;
               var11.field1900 = this.field1900;
               var11.field1901 = this.field1901;
               var11.field1943 = new int[var11.field1942];
            } else {
               var11 = this;
            }

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
               for(var12 = 0; var12 < var11.field1942; ++var12) {
                  var13 = var2 + this.field1880[var12];
                  var14 = var4 + this.field1882[var12];
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field1943[var12] = var21 + this.field1943[var12] - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field1942; ++var12) {
                  var13 = (-this.field1943[var12] << 16) / super.field3281;
                  if(var13 < var6) {
                     var14 = var2 + this.field1880[var12];
                     var15 = var4 + this.field1882[var12];
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field1943[var12] = (var6 - var13) * (var22 - var3) / var6 + this.field1943[var12];
                  }
               }
            }

            var11.method3377();
            return var11;
         }
      } else {
         return this;
      }
   }

   @ObfuscatedName("v")
   void method3394(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var11;
      int var12;
      if(var1 == 0) {
         var7 = 0;
         field1933 = 0;
         field1934 = 0;
         field1927 = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var9 = var2[var8];
            if(var9 < this.field1925.length) {
               int[] var10 = this.field1925[var9];

               for(var11 = 0; var11 < var10.length; ++var11) {
                  var12 = var10[var11];
                  field1933 += this.field1880[var12];
                  field1934 += this.field1943[var12];
                  field1927 += this.field1882[var12];
                  ++var7;
               }
            }
         }

         if(var7 > 0) {
            field1933 = var3 + field1933 / var7;
            field1934 = var4 + field1934 / var7;
            field1927 = var5 + field1927 / var7;
         } else {
            field1933 = var3;
            field1934 = var4;
            field1927 = var5;
         }

      } else {
         int[] var18;
         int var19;
         if(var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.field1925.length) {
                  var18 = this.field1925[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var11 = var18[var19];
                     this.field1880[var11] += var3;
                     this.field1943[var11] += var4;
                     this.field1882[var11] += var5;
                  }
               }
            }

         } else if(var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.field1925.length) {
                  var18 = this.field1925[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var11 = var18[var19];
                     this.field1880[var11] -= field1933;
                     this.field1943[var11] -= field1934;
                     this.field1882[var11] -= field1927;
                     var12 = (var3 & 255) * 8;
                     int var13 = (var4 & 255) * 8;
                     int var14 = (var5 & 255) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if(var14 != 0) {
                        var15 = field1939[var14];
                        var16 = field1940[var14];
                        var17 = var15 * this.field1943[var11] + var16 * this.field1880[var11] >> 16;
                        this.field1943[var11] = var16 * this.field1943[var11] - var15 * this.field1880[var11] >> 16;
                        this.field1880[var11] = var17;
                     }

                     if(var12 != 0) {
                        var15 = field1939[var12];
                        var16 = field1940[var12];
                        var17 = var16 * this.field1943[var11] - var15 * this.field1882[var11] >> 16;
                        this.field1882[var11] = var15 * this.field1943[var11] + var16 * this.field1882[var11] >> 16;
                        this.field1943[var11] = var17;
                     }

                     if(var13 != 0) {
                        var15 = field1939[var13];
                        var16 = field1940[var13];
                        var17 = var15 * this.field1882[var11] + var16 * this.field1880[var11] >> 16;
                        this.field1882[var11] = var16 * this.field1882[var11] - var15 * this.field1880[var11] >> 16;
                        this.field1880[var11] = var17;
                     }

                     this.field1880[var11] += field1933;
                     this.field1943[var11] += field1934;
                     this.field1882[var11] += field1927;
                  }
               }
            }

         } else if(var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.field1925.length) {
                  var18 = this.field1925[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var11 = var18[var19];
                     this.field1880[var11] -= field1933;
                     this.field1943[var11] -= field1934;
                     this.field1882[var11] -= field1927;
                     this.field1880[var11] = var3 * this.field1880[var11] / 128;
                     this.field1943[var11] = var4 * this.field1943[var11] / 128;
                     this.field1882[var11] = var5 * this.field1882[var11] / 128;
                     this.field1880[var11] += field1933;
                     this.field1943[var11] += field1934;
                     this.field1882[var11] += field1927;
                  }
               }
            }

         } else if(var1 == 5) {
            if(this.field1900 != null && this.field1891 != null) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var2[var7];
                  if(var8 < this.field1900.length) {
                     var18 = this.field1900[var8];

                     for(var19 = 0; var19 < var18.length; ++var19) {
                        var11 = var18[var19];
                        var12 = (this.field1891[var11] & 255) + var3 * 8;
                        if(var12 < 0) {
                           var12 = 0;
                        } else if(var12 > 255) {
                           var12 = 255;
                        }

                        this.field1891[var11] = (byte)var12;
                     }
                  }
               }
            }

         }
      }
   }

   @ObfuscatedName("q")
   public void method3420(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1942; ++var4) {
         this.field1880[var4] = this.field1880[var4] * var1 / 128;
         this.field1943[var4] = var2 * this.field1943[var4] / 128;
         this.field1882[var4] = var3 * this.field1882[var4] / 128;
      }

      this.method3377();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Let;I)V"
   )
   public void method3378(class295 var1, int var2) {
      if(this.field1925 != null) {
         if(var2 != -1) {
            class66 var3 = var1.field3179[var2];
            class29 var4 = var3.field611;
            field1933 = 0;
            field1934 = 0;
            field1927 = 0;

            for(int var5 = 0; var5 < var3.field612; ++var5) {
               int var6 = var3.field613[var5];
               this.method3394(var4.field222[var6], var4.field223[var6], var3.field617[var5], var3.field608[var5], var3.field616[var5]);
            }

            this.method3377();
         }
      }
   }

   @ObfuscatedName("r")
   public int method3376() {
      this.method3374();
      return this.field1904;
   }

   @ObfuscatedName("ag")
   final void method3390(boolean var1, boolean var2, boolean var3, long var4) {
      if(this.field1905 < 1600) {
         int var6;
         for(var6 = 0; var6 < this.field1905; ++var6) {
            field1890[var6] = 0;
         }

         var6 = var3?20:5;

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var16;
         int var18;
         for(var7 = 0; var7 < this.field1883; ++var7) {
            if(this.field1875[var7] != -2) {
               var8 = this.field1884[var7];
               var9 = this.field1922[var7];
               var10 = this.field1886[var7];
               var11 = field1916[var8];
               var12 = field1916[var9];
               var13 = field1916[var10];
               int var14;
               int var17;
               if(!var1 || var11 != -5000 && var12 != -5000 && var13 != -5000) {
                  if(var2) {
                     var15 = field1917[var8];
                     var16 = field1917[var9];
                     var17 = field1917[var10];
                     var18 = var6 + class327.field3511;
                     boolean var34;
                     if(var18 < var15 && var18 < var16 && var18 < var17) {
                        var34 = false;
                     } else {
                        var18 = class327.field3511 - var6;
                        if(var18 > var15 && var18 > var16 && var18 > var17) {
                           var34 = false;
                        } else {
                           var18 = var6 + class327.field3512;
                           if(var18 < var11 && var18 < var12 && var18 < var13) {
                              var34 = false;
                           } else {
                              var18 = class327.field3512 - var6;
                              if(var18 > var11 && var18 > var12 && var18 > var13) {
                                 var34 = false;
                              } else {
                                 var34 = true;
                              }
                           }
                        }
                     }

                     if(var34) {
                        class327.field3516[++class327.field3509 - 1] = var4;
                        var2 = false;
                     }
                  }

                  if((var11 - var12) * (field1917[var10] - field1917[var9]) - (var13 - var12) * (field1917[var8] - field1917[var9]) > 0) {
                     field1915[var7] = false;
                     if(var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= class257.field2552 && var12 <= class257.field2552 && var13 <= class257.field2552) {
                        field1881[var7] = false;
                     } else {
                        field1881[var7] = true;
                     }

                     var14 = (field1918[var8] + field1918[var9] + field1918[var10]) / 3 + this.field1906;
                     field1896[var14][field1890[var14]++] = var7;
                  }
               } else {
                  var14 = field1919[var8];
                  var15 = field1919[var9];
                  var16 = field1919[var10];
                  var17 = field1920[var8];
                  var18 = field1920[var9];
                  int var19 = field1920[var10];
                  int var20 = field1914[var8];
                  int var21 = field1914[var9];
                  int var22 = field1914[var10];
                  var14 -= var15;
                  var16 -= var15;
                  var17 -= var18;
                  var19 -= var18;
                  var20 -= var21;
                  var22 -= var21;
                  int var23 = var17 * var22 - var20 * var19;
                  int var24 = var20 * var16 - var14 * var22;
                  int var25 = var14 * var19 - var17 * var16;
                  if(var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                     field1915[var7] = true;
                     int var26 = (field1918[var8] + field1918[var9] + field1918[var10]) / 3 + this.field1906;
                     field1896[var26][field1890[var26]++] = var7;
                  }
               }
            }
         }

         int[] var27;
         if(this.field1921 == null) {
            for(var7 = this.field1905 - 1; var7 >= 0; --var7) {
               var8 = field1890[var7];
               if(var8 > 0) {
                  var27 = field1896[var7];

                  for(var10 = 0; var10 < var8; ++var10) {
                     this.method3391(var27[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               field1923[var7] = 0;
               field1929[var7] = 0;
            }

            for(var7 = this.field1905 - 1; var7 >= 0; --var7) {
               var8 = field1890[var7];
               if(var8 > 0) {
                  var27 = field1896[var7];

                  for(var10 = 0; var10 < var8; ++var10) {
                     var11 = var27[var10];
                     byte var33 = this.field1921[var11];
                     var13 = field1923[var33]++;
                     field1926[var33][var13] = var11;
                     if(var33 < 10) {
                        field1929[var33] += var7;
                     } else if(var33 == 10) {
                        field1879[var13] = var7;
                     } else {
                        field1928[var13] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if(field1923[1] > 0 || field1923[2] > 0) {
               var7 = (field1929[1] + field1929[2]) / (field1923[1] + field1923[2]);
            }

            var8 = 0;
            if(field1923[3] > 0 || field1923[4] > 0) {
               var8 = (field1929[3] + field1929[4]) / (field1923[3] + field1923[4]);
            }

            var9 = 0;
            if(field1923[6] > 0 || field1923[8] > 0) {
               var9 = (field1929[8] + field1929[6]) / (field1923[8] + field1923[6]);
            }

            var11 = 0;
            var12 = field1923[10];
            int[] var30 = field1926[10];
            int[] var31 = field1879;
            if(var11 == var12) {
               var11 = 0;
               var12 = field1923[11];
               var30 = field1926[11];
               var31 = field1928;
            }

            if(var11 < var12) {
               var10 = var31[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.method3391(var30[var11++]);
                  if(var11 == var12 && var30 != field1926[11]) {
                     var11 = 0;
                     var12 = field1923[11];
                     var30 = field1926[11];
                     var31 = field1928;
                  }

                  if(var11 < var12) {
                     var10 = var31[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.method3391(var30[var11++]);
                  if(var11 == var12 && var30 != field1926[11]) {
                     var11 = 0;
                     var12 = field1923[11];
                     var30 = field1926[11];
                     var31 = field1928;
                  }

                  if(var11 < var12) {
                     var10 = var31[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.method3391(var30[var11++]);
                  if(var11 == var12 && var30 != field1926[11]) {
                     var11 = 0;
                     var12 = field1923[11];
                     var30 = field1926[11];
                     var31 = field1928;
                  }

                  if(var11 < var12) {
                     var10 = var31[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = field1923[var15];
               int[] var32 = field1926[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.method3391(var32[var18]);
               }
            }

            while(var10 != -1000) {
               this.method3391(var30[var11++]);
               if(var11 == var12 && var30 != field1926[11]) {
                  var11 = 0;
                  var30 = field1926[11];
                  var12 = field1923[11];
                  var31 = field1928;
               }

               if(var11 < var12) {
                  var10 = var31[var11];
               } else {
                  var10 = -1000;
               }
            }

         }
      }
   }

   @ObfuscatedName("p")
   void method3392() {
      if(this.field1902 != 2) {
         this.field1902 = 2;
         this.field1904 = 0;

         for(int var1 = 0; var1 < this.field1942; ++var1) {
            int var2 = this.field1880[var1];
            int var3 = this.field1943[var1];
            int var4 = this.field1882[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if(var5 > this.field1904) {
               this.field1904 = var5;
            }
         }

         this.field1904 = (int)(Math.sqrt((double)this.field1904) + 0.99D);
         this.field1906 = this.field1904;
         this.field1905 = this.field1904 + this.field1904;
      }
   }

   @ObfuscatedName("u")
   public void method3382() {
      for(int var1 = 0; var1 < this.field1942; ++var1) {
         this.field1880[var1] = -this.field1880[var1];
         this.field1882[var1] = -this.field1882[var1];
      }

      this.method3377();
   }

   @ObfuscatedName("c")
   public void method3374() {
      if(this.field1902 != 1) {
         this.field1902 = 1;
         super.field3281 = 0;
         this.field1903 = 0;
         this.field1904 = 0;

         for(int var1 = 0; var1 < this.field1942; ++var1) {
            int var2 = this.field1880[var1];
            int var3 = this.field1943[var1];
            int var4 = this.field1882[var1];
            if(-var3 > super.field3281) {
               super.field3281 = -var3;
            }

            if(var3 > this.field1903) {
               this.field1903 = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if(var5 > this.field1904) {
               this.field1904 = var5;
            }
         }

         this.field1904 = (int)(Math.sqrt((double)this.field1904) + 0.99D);
         this.field1906 = (int)(Math.sqrt((double)(this.field1904 * this.field1904 + super.field3281 * super.field3281)) + 0.99D);
         this.field1905 = this.field1906 + (int)(Math.sqrt((double)(this.field1904 * this.field1904 + this.field1903 * this.field1903)) + 0.99D);
      }
   }

   @ObfuscatedName("e")
   void method3370(int var1) {
      if(this.field1924 == -1) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = field1940[var1];
         int var9 = field1939[var1];

         for(int var10 = 0; var10 < this.field1942; ++var10) {
            int var11 = class257.method4576(this.field1880[var10], this.field1882[var10], var8, var9);
            int var12 = this.field1943[var10];
            int var13 = class257.method4589(this.field1880[var10], this.field1882[var10], var8, var9);
            if(var11 < var2) {
               var2 = var11;
            }

            if(var11 > var5) {
               var5 = var11;
            }

            if(var12 < var3) {
               var3 = var12;
            }

            if(var12 > var6) {
               var6 = var12;
            }

            if(var13 < var4) {
               var4 = var13;
            }

            if(var13 > var7) {
               var7 = var13;
            }
         }

         this.field1907 = (var5 + var2) / 2;
         this.field1897 = (var6 + var3) / 2;
         this.field1909 = (var7 + var4) / 2;
         this.field1924 = (var5 - var2 + 1) / 2;
         this.field1911 = (var6 - var3 + 1) / 2;
         this.field1912 = (var7 - var4 + 1) / 2;
         if(this.field1924 < 32) {
            this.field1924 = 32;
         }

         if(this.field1912 < 32) {
            this.field1912 = 32;
         }

         if(this.field1901) {
            this.field1924 += 8;
            this.field1912 += 8;
         }

      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Let;ILet;I[I)V"
   )
   public void method3379(class295 var1, int var2, class295 var3, int var4, int[] var5) {
      if(var2 != -1) {
         if(var5 != null && var4 != -1) {
            class66 var6 = var1.field3179[var2];
            class66 var7 = var3.field3179[var4];
            class29 var8 = var6.field611;
            field1933 = 0;
            field1934 = 0;
            field1927 = 0;
            byte var9 = 0;
            int var13 = var9 + 1;
            int var10 = var5[var9];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.field612; ++var11) {
               for(var12 = var6.field613[var11]; var12 > var10; var10 = var5[var13++]) {
                  ;
               }

               if(var12 != var10 || var8.field222[var12] == 0) {
                  this.method3394(var8.field222[var12], var8.field223[var12], var6.field617[var11], var6.field608[var11], var6.field616[var11]);
               }
            }

            field1933 = 0;
            field1934 = 0;
            field1927 = 0;
            var9 = 0;
            var13 = var9 + 1;
            var10 = var5[var9];

            for(var11 = 0; var11 < var7.field612; ++var11) {
               for(var12 = var7.field613[var11]; var12 > var10; var10 = var5[var13++]) {
                  ;
               }

               if(var12 == var10 || var8.field222[var12] == 0) {
                  this.method3394(var8.field222[var12], var8.field223[var12], var7.field617[var11], var7.field608[var11], var7.field616[var11]);
               }
            }

            this.method3377();
         } else {
            this.method3378(var1, var2);
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Z)Lds;"
   )
   public class200 method3375(boolean var1) {
      if(!var1 && field1876.length < this.field1883) {
         field1876 = new byte[this.field1883 + 100];
      }

      return this.method3372(var1, field1937, field1876);
   }

   @ObfuscatedName("az")
   final void method3431(int var1) {
      int var2 = class257.field2551;
      int var3 = class257.field2541;
      int var4 = 0;
      int var5 = this.field1884[var1];
      int var6 = this.field1922[var1];
      int var7 = this.field1886[var1];
      int var8 = field1914[var5];
      int var9 = field1914[var6];
      int var10 = field1914[var7];
      if(this.field1891 == null) {
         class257.field2543 = 0;
      } else {
         class257.field2543 = this.field1891[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if(var8 >= 50) {
         field1941[var4] = field1916[var5];
         field1931[var4] = field1917[var5];
         field1932[var4++] = this.field1887[var1];
      } else {
         var11 = field1919[var5];
         var12 = field1920[var5];
         var13 = this.field1887[var1];
         if(var10 >= 50) {
            var14 = field1885[var10 - var8] * (50 - var8);
            field1941[var4] = var2 + class257.field2550 * (var11 + ((field1919[var7] - var11) * var14 >> 16)) / 50;
            field1931[var4] = var3 + class257.field2550 * (var12 + ((field1920[var7] - var12) * var14 >> 16)) / 50;
            field1932[var4++] = var13 + ((this.field1875[var1] - var13) * var14 >> 16);
         }

         if(var9 >= 50) {
            var14 = field1885[var9 - var8] * (50 - var8);
            field1941[var4] = var2 + class257.field2550 * (var11 + ((field1919[var6] - var11) * var14 >> 16)) / 50;
            field1931[var4] = var3 + class257.field2550 * (var12 + ((field1920[var6] - var12) * var14 >> 16)) / 50;
            field1932[var4++] = var13 + ((this.field1888[var1] - var13) * var14 >> 16);
         }
      }

      if(var9 >= 50) {
         field1941[var4] = field1916[var6];
         field1931[var4] = field1917[var6];
         field1932[var4++] = this.field1888[var1];
      } else {
         var11 = field1919[var6];
         var12 = field1920[var6];
         var13 = this.field1888[var1];
         if(var8 >= 50) {
            var14 = field1885[var8 - var9] * (50 - var9);
            field1941[var4] = var2 + class257.field2550 * (var11 + ((field1919[var5] - var11) * var14 >> 16)) / 50;
            field1931[var4] = var3 + class257.field2550 * (var12 + ((field1920[var5] - var12) * var14 >> 16)) / 50;
            field1932[var4++] = var13 + ((this.field1887[var1] - var13) * var14 >> 16);
         }

         if(var10 >= 50) {
            var14 = field1885[var10 - var9] * (50 - var9);
            field1941[var4] = var2 + class257.field2550 * (var11 + ((field1919[var7] - var11) * var14 >> 16)) / 50;
            field1931[var4] = var3 + class257.field2550 * (var12 + ((field1920[var7] - var12) * var14 >> 16)) / 50;
            field1932[var4++] = var13 + ((this.field1875[var1] - var13) * var14 >> 16);
         }
      }

      if(var10 >= 50) {
         field1941[var4] = field1916[var7];
         field1931[var4] = field1917[var7];
         field1932[var4++] = this.field1875[var1];
      } else {
         var11 = field1919[var7];
         var12 = field1920[var7];
         var13 = this.field1875[var1];
         if(var9 >= 50) {
            var14 = field1885[var9 - var10] * (50 - var10);
            field1941[var4] = var2 + class257.field2550 * (var11 + ((field1919[var6] - var11) * var14 >> 16)) / 50;
            field1931[var4] = var3 + class257.field2550 * (var12 + ((field1920[var6] - var12) * var14 >> 16)) / 50;
            field1932[var4++] = var13 + ((this.field1888[var1] - var13) * var14 >> 16);
         }

         if(var8 >= 50) {
            var14 = field1885[var8 - var10] * (50 - var10);
            field1941[var4] = var2 + class257.field2550 * (var11 + ((field1919[var5] - var11) * var14 >> 16)) / 50;
            field1931[var4] = var3 + class257.field2550 * (var12 + ((field1920[var5] - var12) * var14 >> 16)) / 50;
            field1932[var4++] = var13 + ((this.field1887[var1] - var13) * var14 >> 16);
         }
      }

      var11 = field1941[0];
      var12 = field1941[1];
      var13 = field1941[2];
      var14 = field1931[0];
      int var15 = field1931[1];
      int var16 = field1931[2];
      class257.field2553 = false;
      int var17;
      int var18;
      int var19;
      int var20;
      if(var4 == 3) {
         if(var11 < 0 || var12 < 0 || var13 < 0 || var11 > class257.field2552 || var12 > class257.field2552 || var13 > class257.field2552) {
            class257.field2553 = true;
         }

         if(this.field1893 != null && this.field1893[var1] != -1) {
            if(this.field1892 != null && this.field1892[var1] != -1) {
               var20 = this.field1892[var1] & 255;
               var17 = this.field1910[var20];
               var18 = this.field1895[var20];
               var19 = this.field1898[var20];
            } else {
               var17 = var5;
               var18 = var6;
               var19 = var7;
            }

            if(this.field1875[var1] == -1) {
               class257.method4583(var14, var15, var16, var11, var12, var13, this.field1887[var1], this.field1887[var1], this.field1887[var1], field1919[var17], field1919[var18], field1919[var19], field1920[var17], field1920[var18], field1920[var19], field1914[var17], field1914[var18], field1914[var19], this.field1893[var1]);
            } else {
               class257.method4583(var14, var15, var16, var11, var12, var13, field1932[0], field1932[1], field1932[2], field1919[var17], field1919[var18], field1919[var19], field1920[var17], field1920[var18], field1920[var19], field1914[var17], field1914[var18], field1914[var19], this.field1893[var1]);
            }
         } else if(this.field1875[var1] == -1) {
            class257.method4648(var14, var15, var16, var11, var12, var13, field1930[this.field1887[var1]]);
         } else {
            class257.method4579(var14, var15, var16, var11, var12, var13, field1932[0], field1932[1], field1932[2]);
         }
      }

      if(var4 == 4) {
         if(var11 < 0 || var12 < 0 || var13 < 0 || var11 > class257.field2552 || var12 > class257.field2552 || var13 > class257.field2552 || field1941[3] < 0 || field1941[3] > class257.field2552) {
            class257.field2553 = true;
         }

         if(this.field1893 != null && this.field1893[var1] != -1) {
            if(this.field1892 != null && this.field1892[var1] != -1) {
               var20 = this.field1892[var1] & 255;
               var17 = this.field1910[var20];
               var18 = this.field1895[var20];
               var19 = this.field1898[var20];
            } else {
               var17 = var5;
               var18 = var6;
               var19 = var7;
            }

            short var21 = this.field1893[var1];
            if(this.field1875[var1] == -1) {
               class257.method4583(var14, var15, var16, var11, var12, var13, this.field1887[var1], this.field1887[var1], this.field1887[var1], field1919[var17], field1919[var18], field1919[var19], field1920[var17], field1920[var18], field1920[var19], field1914[var17], field1914[var18], field1914[var19], var21);
               class257.method4583(var14, var16, field1931[3], var11, var13, field1941[3], this.field1887[var1], this.field1887[var1], this.field1887[var1], field1919[var17], field1919[var18], field1919[var19], field1920[var17], field1920[var18], field1920[var19], field1914[var17], field1914[var18], field1914[var19], var21);
            } else {
               class257.method4583(var14, var15, var16, var11, var12, var13, field1932[0], field1932[1], field1932[2], field1919[var17], field1919[var18], field1919[var19], field1920[var17], field1920[var18], field1920[var19], field1914[var17], field1914[var18], field1914[var19], var21);
               class257.method4583(var14, var16, field1931[3], var11, var13, field1941[3], field1932[0], field1932[2], field1932[3], field1919[var17], field1919[var18], field1919[var19], field1920[var17], field1920[var18], field1920[var19], field1914[var17], field1914[var18], field1914[var19], var21);
            }
         } else if(this.field1875[var1] == -1) {
            var17 = field1930[this.field1887[var1]];
            class257.method4648(var14, var15, var16, var11, var12, var13, var17);
            class257.method4648(var14, var16, field1931[3], var11, var13, field1941[3], var17);
         } else {
            class257.method4579(var14, var15, var16, var11, var12, var13, field1932[0], field1932[1], field1932[2]);
            class257.method4579(var14, var16, field1931[3], var11, var13, field1941[3], field1932[0], field1932[2], field1932[3]);
         }
      }

   }

   @ObfuscatedName("o")
   public void method3383() {
      for(int var1 = 0; var1 < this.field1942; ++var1) {
         int var2 = this.field1882[var1];
         this.field1882[var1] = this.field1880[var1];
         this.field1880[var1] = -var2;
      }

      this.method3377();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(ZLds;[B)Lds;"
   )
   class200 method3372(boolean var1, class200 var2, byte[] var3) {
      var2.field1942 = this.field1942;
      var2.field1883 = this.field1883;
      var2.field1889 = this.field1889;
      if(var2.field1880 == null || var2.field1880.length < this.field1942) {
         var2.field1880 = new int[this.field1942 + 100];
         var2.field1943 = new int[this.field1942 + 100];
         var2.field1882 = new int[this.field1942 + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.field1942; ++var4) {
         var2.field1880[var4] = this.field1880[var4];
         var2.field1943[var4] = this.field1943[var4];
         var2.field1882[var4] = this.field1882[var4];
      }

      if(var1) {
         var2.field1891 = this.field1891;
      } else {
         var2.field1891 = var3;
         if(this.field1891 == null) {
            for(var4 = 0; var4 < this.field1883; ++var4) {
               var2.field1891[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.field1883; ++var4) {
               var2.field1891[var4] = this.field1891[var4];
            }
         }
      }

      var2.field1884 = this.field1884;
      var2.field1922 = this.field1922;
      var2.field1886 = this.field1886;
      var2.field1887 = this.field1887;
      var2.field1888 = this.field1888;
      var2.field1875 = this.field1875;
      var2.field1921 = this.field1921;
      var2.field1892 = this.field1892;
      var2.field1893 = this.field1893;
      var2.field1894 = this.field1894;
      var2.field1910 = this.field1910;
      var2.field1895 = this.field1895;
      var2.field1898 = this.field1898;
      var2.field1925 = this.field1925;
      var2.field1900 = this.field1900;
      var2.field1901 = this.field1901;
      var2.method3377();
      return var2;
   }

   @ObfuscatedName("g")
   public void method3427() {
      for(int var1 = 0; var1 < this.field1942; ++var1) {
         int var2 = this.field1880[var1];
         this.field1880[var1] = this.field1882[var1];
         this.field1882[var1] = -var2;
      }

      this.method3377();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Z)Lds;"
   )
   public class200 method3371(boolean var1) {
      if(!var1 && field1878.length < this.field1883) {
         field1878 = new byte[this.field1883 + 100];
      }

      return this.method3372(var1, field1899, field1878);
   }

   @ObfuscatedName("k")
   public void method3405(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1942; ++var4) {
         this.field1880[var4] += var1;
         this.field1943[var4] += var2;
         this.field1882[var4] += var3;
      }

      this.method3377();
   }

   @ObfuscatedName("i")
   public void method3384(int var1) {
      int var2 = field1939[var1];
      int var3 = field1940[var1];

      for(int var4 = 0; var4 < this.field1942; ++var4) {
         int var5 = var3 * this.field1943[var4] - var2 * this.field1882[var4] >> 16;
         this.field1882[var4] = var2 * this.field1943[var4] + var3 * this.field1882[var4] >> 16;
         this.field1943[var4] = var5;
      }

      this.method3377();
   }

   @ObfuscatedName("cw")
   void vmethod5292(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      field1890[0] = -1;
      if(this.field1902 != 1) {
         this.method3374();
      }

      this.method3370(var1);
      int var11 = var5 * var8 - var4 * var6 >> 16;
      int var12 = var2 * var7 + var3 * var11 >> 16;
      int var13 = var3 * this.field1904 >> 16;
      int var14 = var12 + var13;
      if(var14 > 50 && var12 < 3500) {
         int var15 = var8 * var4 + var5 * var6 >> 16;
         int var16 = (var15 - this.field1904) * class257.field2550;
         if(var16 / var14 < class257.field2556) {
            int var17 = (var15 + this.field1904) * class257.field2550;
            if(var17 / var14 > class257.field2559) {
               int var18 = var3 * var7 - var11 * var2 >> 16;
               int var19 = var2 * this.field1904 >> 16;
               int var20 = (var18 + var19) * class257.field2550;
               if(var20 / var14 > class257.field2555) {
                  int var21 = (var3 * super.field3281 >> 16) + var19;
                  int var22 = (var18 - var21) * class257.field2550;
                  if(var22 / var14 < class257.field2557) {
                     int var23 = var13 + (var2 * super.field3281 >> 16);
                     boolean var24 = false;
                     boolean var25 = false;
                     if(var12 - var23 <= 50) {
                        var25 = true;
                     }

                     boolean var26 = var25 || this.field1889 > 0;
                     int var27 = class327.field3512;
                     int var29 = class230.method4118();
                     boolean var30 = class102.method1761();
                     boolean var32 = var9 != 0L;
                     boolean var33;
                     if(var32) {
                        var33 = (int)(var9 >>> 16 & 1L) == 1;
                        var32 = !var33;
                     }

                     var33 = false;
                     int var35;
                     int var36;
                     int var37;
                     if(var32 && var30) {
                        boolean var34 = false;
                        if(field1936) {
                           var34 = class67.method1154(this, var6, var7, var8);
                        } else {
                           var35 = var12 - var13;
                           if(var35 <= 50) {
                              var35 = 50;
                           }

                           if(var15 > 0) {
                              var16 /= var14;
                              var17 /= var35;
                           } else {
                              var17 /= var14;
                              var16 /= var35;
                           }

                           if(var18 > 0) {
                              var22 /= var14;
                              var20 /= var35;
                           } else {
                              var20 /= var14;
                              var22 /= var35;
                           }

                           var36 = var27 - class257.field2551;
                           var37 = var29 - class257.field2541;
                           if(var36 > var16 && var36 < var17 && var37 > var22 && var37 < var20) {
                              var34 = true;
                           }
                        }

                        if(var34) {
                           if(this.field1901) {
                              class197.method3350(var9);
                           } else {
                              var33 = true;
                           }
                        }
                     }

                     int var45 = class257.field2551;
                     var35 = class257.field2541;
                     var36 = 0;
                     var37 = 0;
                     if(var1 != 0) {
                        var36 = field1939[var1];
                        var37 = field1940[var1];
                     }

                     for(int var38 = 0; var38 < this.field1942; ++var38) {
                        int var39 = this.field1880[var38];
                        int var40 = this.field1943[var38];
                        int var41 = this.field1882[var38];
                        int var42;
                        if(var1 != 0) {
                           var42 = var41 * var36 + var39 * var37 >> 16;
                           var41 = var41 * var37 - var39 * var36 >> 16;
                           var39 = var42;
                        }

                        var39 += var6;
                        var40 += var7;
                        var41 += var8;
                        var42 = var41 * var4 + var5 * var39 >> 16;
                        var41 = var5 * var41 - var39 * var4 >> 16;
                        var39 = var42;
                        var42 = var3 * var40 - var41 * var2 >> 16;
                        var41 = var40 * var2 + var3 * var41 >> 16;
                        field1918[var38] = var41 - var12;
                        if(var41 >= 50) {
                           field1916[var38] = var39 * class257.field2550 / var41 + var45;
                           field1917[var38] = var42 * class257.field2550 / var41 + var35;
                        } else {
                           field1916[var38] = -5000;
                           var24 = true;
                        }

                        if(var26) {
                           field1919[var38] = var39;
                           field1920[var38] = var42;
                           field1914[var38] = var41;
                        }
                     }

                     try {
                        this.method3390(var24, var33, this.field1901, var9);
                     } catch (Exception var44) {
                        ;
                     }

                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("y")
   public final void method3387(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      field1890[0] = -1;
      if(this.field1902 != 2 && this.field1902 != 1) {
         this.method3392();
      }

      int var8 = class257.field2551;
      int var9 = class257.field2541;
      int var10 = field1939[var1];
      int var11 = field1940[var1];
      int var12 = field1939[var2];
      int var13 = field1940[var2];
      int var14 = field1939[var3];
      int var15 = field1940[var3];
      int var16 = field1939[var4];
      int var17 = field1940[var4];
      int var18 = var16 * var6 + var17 * var7 >> 16;

      for(int var19 = 0; var19 < this.field1942; ++var19) {
         int var20 = this.field1880[var19];
         int var21 = this.field1943[var19];
         int var22 = this.field1882[var19];
         int var23;
         if(var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if(var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if(var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         field1918[var19] = var22 - var18;
         field1916[var19] = var20 * class257.field2550 / var22 + var8;
         field1917[var19] = var23 * class257.field2550 / var22 + var9;
         if(this.field1889 > 0) {
            field1919[var19] = var20;
            field1920[var19] = var23;
            field1914[var19] = var22;
         }
      }

      try {
         this.method3390(false, false, false, 0L);
      } catch (Exception var25) {
         ;
      }

   }

   @ObfuscatedName("d")
   void method3377() {
      this.field1902 = 0;
      this.field1924 = -1;
   }

   @ObfuscatedName("av")
   public final void method3388(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      field1890[0] = -1;
      if(this.field1902 != 2 && this.field1902 != 1) {
         this.method3392();
      }

      int var9 = class257.field2551;
      int var10 = class257.field2541;
      int var11 = field1939[var1];
      int var12 = field1940[var1];
      int var13 = field1939[var2];
      int var14 = field1940[var2];
      int var15 = field1939[var3];
      int var16 = field1940[var3];
      int var17 = field1939[var4];
      int var18 = field1940[var4];
      int var19 = var17 * var6 + var18 * var7 >> 16;

      for(int var20 = 0; var20 < this.field1942; ++var20) {
         int var21 = this.field1880[var20];
         int var22 = this.field1943[var20];
         int var23 = this.field1882[var20];
         int var24;
         if(var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if(var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if(var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         field1918[var20] = var23 - var19;
         field1916[var20] = var9 + var21 * class257.field2550 / var8;
         field1917[var20] = var10 + var24 * class257.field2550 / var8;
         if(this.field1889 > 0) {
            field1919[var20] = var21;
            field1920[var20] = var24;
            field1914[var20] = var23;
         }
      }

      try {
         this.method3390(false, false, false, 0L);
      } catch (Exception var26) {
         ;
      }

   }

   public int[] getTrianglesX() {
      return this.field1884;
   }

   public int[][] getVertexGroups() {
      return this.field1925;
   }

   public List getVertices() {
      int[] var1 = this.getVerticesX();
      int[] var2 = this.getVerticesY();
      int[] var3 = this.getVerticesZ();
      ArrayList var4 = new ArrayList();

      for(int var5 = 0; var5 < this.getVerticesCount(); ++var5) {
         Vertex var6 = new Vertex(var1[var5], var2[var5], var3[var5]);
         var4.add(var6);
      }

      return var4;
   }

   public int[] getVerticesX() {
      return this.field1880;
   }

   public int[] getTrianglesY() {
      return this.field1922;
   }

   public int[] getVerticesY() {
      return this.field1943;
   }

   public int[] getTrianglesZ() {
      return this.field1886;
   }

   public int[] getVerticesZ() {
      return this.field1882;
   }

   public int getVerticesCount() {
      return this.field1942;
   }

   public int getTrianglesCount() {
      return this.field1883;
   }

   public void interpolateFrames(RSFrameMap var1, RSFrame var2, RSFrame var3, int var4, int var5) {
      int var6;
      int var7;
      if(var3 != null && var4 != 0) {
         var6 = 0;
         var7 = 0;

         for(int var8 = 0; var8 < var1.getCount(); ++var8) {
            boolean var9 = false;
            if(var6 < var2.getTransformCount() && var2.getTransformTypes()[var6] == var8) {
               var9 = true;
            }

            boolean var10 = false;
            if(var7 < var3.getTransformCount() && var3.getTransformTypes()[var7] == var8) {
               var10 = true;
            }

            if(var9 || var10) {
               short var11 = 0;
               int var12 = var1.getTypes()[var8];
               if(var12 == 3 || var12 == 10) {
                  var11 = 128;
               }

               int var13 = var11;
               int var14 = var11;
               int var15 = var11;
               if(var9) {
                  var13 = var2.getTranslatorX()[var6];
                  var14 = var2.getTranslatorY()[var6];
                  var15 = var2.getTranslatorZ()[var6];
                  ++var6;
               }

               int var16 = var11;
               int var17 = var11;
               int var18 = var11;
               if(var10) {
                  var16 = var3.getTranslatorX()[var7];
                  var17 = var3.getTranslatorY()[var7];
                  var18 = var3.getTranslatorZ()[var7];
                  ++var7;
               }

               int var19;
               int var20;
               int var21;
               if(var12 == 2) {
                  int var22 = var16 - var13 & 255;
                  int var23 = var17 - var14 & 255;
                  int var24 = var18 - var15 & 255;
                  if(var22 >= 128) {
                     var22 -= 256;
                  }

                  if(var23 >= 128) {
                     var23 -= 256;
                  }

                  if(var24 >= 128) {
                     var24 -= 256;
                  }

                  var19 = var13 + var22 * var4 / var5 & 255;
                  var20 = var14 + var23 * var4 / var5 & 255;
                  var21 = var15 + var24 * var4 / var5 & 255;
               } else if(var12 == 5) {
                  var19 = var13;
                  var20 = 0;
                  var21 = 0;
               } else {
                  var19 = var13 + (var16 - var13) * var4 / var5;
                  var20 = var14 + (var17 - var14) * var4 / var5;
                  var21 = var15 + (var18 - var15) * var4 / var5;
               }

               this.animate(var12, var1.getList()[var8], var19, var20, var21);
            }
         }
      } else {
         for(var6 = 0; var6 < var2.getTransformCount(); ++var6) {
            var7 = var2.getTransformTypes()[var6];
            this.animate(var1.getTypes()[var7], var1.getList()[var7], var2.getTranslatorX()[var6], var2.getTranslatorY()[var6], var2.getTranslatorZ()[var6]);
         }
      }

   }

   public void resetBounds() {
      this.method3377();
   }

   public void animate(int var1, int[] var2, int var3, int var4, int var5) {
      this.method3394(var1, var2, var3, var4, var5);
   }

   public List getTriangles() {
      int[] var1 = this.getTrianglesX();
      int[] var2 = this.getTrianglesY();
      int[] var3 = this.getTrianglesZ();
      List var4 = this.getVertices();
      ArrayList var5 = new ArrayList(this.getTrianglesCount());

      for(int var6 = 0; var6 < this.getTrianglesCount(); ++var6) {
         int var7 = var1[var6];
         int var8 = var2[var6];
         int var9 = var3[var6];
         Triangle var10 = new Triangle((Vertex)var4.get(var7), (Vertex)var4.get(var8), (Vertex)var4.get(var9));
         var5.add(var10);
      }

      return var5;
   }

   public void interpolateFrames(RSFrames var1, int var2, RSFrames var3, int var4, int var5, int var6) {
      if(this.getVertexGroups() != null && var2 != -1) {
         RSFrame var7 = var1.getFrames()[var2];
         RSFrameMap var8 = var7.getSkin();
         RSFrame var9 = null;
         if(var3 != null) {
            var9 = var3.getFrames()[var4];
            if(var9.getSkin() != var8) {
               var9 = null;
            }
         }

         class113.field1064.setAnimOffsetX(0);
         class113.field1064.setAnimOffsetY(0);
         class113.field1064.setAnimOffsetZ(0);
         this.interpolateFrames(var8, var7, var9, var5, var6);
         this.resetBounds();
      }

   }

   public Polygon getConvexHull(int var1, int var2, int var3) {
      List var4 = this.getVertices();

      for(int var5 = 0; var5 < var4.size(); ++var5) {
         Vertex var6 = (Vertex)var4.get(var5);
         var4.set(var5, var6.rotate(var3));
      }

      ArrayList var9 = new ArrayList();
      Iterator var10 = var4.iterator();

      Point var8;
      while(var10.hasNext()) {
         Vertex var7 = (Vertex)var10.next();
         var8 = Perspective.localToCanvas(class113.field1064, new LocalPoint(var1 - var7.getX(), var2 - var7.getZ()), class113.field1064.getPlane(), -var7.getY());
         if(var8 != null) {
            var9.add(var8);
         }
      }

      List var13 = Jarvis.convexHull(var9);
      if(var13 == null) {
         return null;
      } else {
         Polygon var11 = new Polygon();
         Iterator var12 = var13.iterator();

         while(var12.hasNext()) {
            var8 = (Point)var12.next();
            var11.addPoint(var8.getX(), var8.getY());
         }

         return var11;
      }
   }

   public RSModel toSharedModel(boolean var1) {
      return this.method3375(var1);
   }

   public RSModel toSharedSpotAnimModel(boolean var1) {
      return this.method3371(var1);
   }

   public void rotateY90Ccw() {
      this.method3427();
   }

   public void rotateY180Ccw() {
      this.method3382();
   }

   public void rotateY270Ccw() {
      this.method3383();
   }
}
