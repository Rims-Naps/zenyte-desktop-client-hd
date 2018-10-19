package net.runelite.client.standalone;

import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
public abstract class class207 extends class89 {
   @ObfuscatedName("j")
   static int field2030;
   @ObfuscatedName("v")
   static int field2022;
   @ObfuscatedName("n")
   static int field2029;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "[Lle;"
   )
   public static class32[] field2025;
   @ObfuscatedName("z")
   static int field2020;
   @ObfuscatedName("h")
   static Random field2018;
   @ObfuscatedName("u")
   static int field2026;
   @ObfuscatedName("b")
   static int field2023;
   @ObfuscatedName("t")
   static int field2027;
   @ObfuscatedName("x")
   static int field2028;
   @ObfuscatedName("o")
   static String[] field2009;
   @ObfuscatedName("g")
   static int field2024;
   @ObfuscatedName("f")
   byte[][] field2012;
   @ObfuscatedName("r")
   public int field2017;
   @ObfuscatedName("p")
   public int field2016;
   @ObfuscatedName("c")
   public int field2015;
   @ObfuscatedName("e")
   int[] field2013;
   @ObfuscatedName("l")
   int[] field2010;
   @ObfuscatedName("s")
   int[] field2021;
   @ObfuscatedName("a")
   int[] field2014;
   @ObfuscatedName("w")
   int[] field2011;
   @ObfuscatedName("d")
   byte[] field2019;

   static {
      field2020 = -1;
      field2028 = -1;
      field2022 = -1;
      field2024 = -1;
      field2030 = 0;
      field2023 = 0;
      field2026 = 256;
      field2027 = 0;
      field2029 = 0;
      field2018 = new Random();
      field2009 = new String[100];
   }

   class207(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      this.field2012 = new byte[256][];
      this.field2015 = 0;
      this.field2013 = var2;
      this.field2014 = var3;
      this.field2011 = var4;
      this.field2021 = var5;
      this.method3518(var1);
      this.field2012 = var7;
      int var8 = Integer.MAX_VALUE;
      int var9 = Integer.MIN_VALUE;

      for(int var10 = 0; var10 < 256; ++var10) {
         if(this.field2014[var10] < var8 && this.field2021[var10] != 0) {
            var8 = this.field2014[var10];
         }

         if(this.field2014[var10] + this.field2021[var10] > var9) {
            var9 = this.field2014[var10] + this.field2021[var10];
         }
      }

      this.field2016 = this.field2015 - var8;
      this.field2017 = var9 - this.field2015;
   }

   class207(byte[] var1) {
      this.field2012 = new byte[256][];
      this.field2015 = 0;
      this.method3518(var1);
   }

   @ObfuscatedName("af")
   public void method3522(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 != null) {
         this.method3572(var4, var5);
         double var8 = 7.0D - (double)var7 / 8.0D;
         if(var8 < 0.0D) {
            var8 = 0.0D;
         }

         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var10[var11] = (int)(Math.sin((double)var11 / 1.5D + (double)var6 / 1.0D) * var8);
         }

         this.method3538(var1, var2 - this.method3601(var1) / 2, var3, (int[])null, var10);
      }
   }

   @ObfuscatedName("aw")
   void method3537(String var1, int var2, int var3) {
      var3 -= this.field2015;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if(var1.charAt(var6) != 0) {
            char var7 = (char)(class164.method2834(var1.charAt(var6)) & 255);
            if(var7 == '<') {
               var4 = var6;
            } else {
               int var9;
               if(var7 == '>' && var4 != -1) {
                  String var8 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if(var8.equals("lt")) {
                     var7 = '<';
                  } else {
                     if(!var8.equals("gt")) {
                        if(var8.startsWith("img=")) {
                           try {
                              var9 = class140.method2525(var8.substring(4));
                              class32 var10 = field2025[var9];
                              var10.method530(var2, var3 + this.field2015 - var10.field262);
                              var2 += var10.field261;
                              var5 = -1;
                           } catch (Exception var14) {
                              ;
                           }
                        } else {
                           this.method3535(var8);
                        }
                        continue;
                     }

                     var7 = '>';
                  }
               }

               if(var7 == 160) {
                  var7 = ' ';
               }

               if(var4 == -1) {
                  if(this.field2019 != null && var5 != -1) {
                     var2 += this.field2019[var7 + (var5 << 8)];
                  }

                  int var12 = this.field2011[var7];
                  var9 = this.field2021[var7];
                  if(var7 != ' ') {
                     if(field2026 == 256) {
                        if(field2024 != -1) {
                           method3541(this.field2012[var7], var2 + this.field2013[var7] + 1, var3 + this.field2014[var7] + 1, var12, var9, field2024);
                        }

                        this.vmethod4936(this.field2012[var7], var2 + this.field2013[var7], var3 + this.field2014[var7], var12, var9, field2023);
                     } else {
                        if(field2024 != -1) {
                           method3598(this.field2012[var7], var2 + this.field2013[var7] + 1, var3 + this.field2014[var7] + 1, var12, var9, field2024, field2026);
                        }

                        this.vmethod4934(this.field2012[var7], var2 + this.field2013[var7], var3 + this.field2014[var7], var12, var9, field2023, field2026);
                     }
                  } else if(field2027 > 0) {
                     field2029 += field2027;
                     var2 += field2029 >> 8;
                     field2029 &= 255;
                  }

                  int var13 = this.field2010[var7];
                  if(field2020 != -1) {
                     class89.method1607(var2, var3 + (int)((double)this.field2015 * 0.7D), var13, field2020);
                  }

                  if(field2028 != -1) {
                     class89.method1607(var2, var3 + this.field2015 + 1, var13, field2028);
                  }

                  var2 += var13;
                  var5 = var7;
               }
            }
         }
      }

   }

   @ObfuscatedName("f")
   abstract void vmethod4936(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   @ObfuscatedName("v")
   public int method3568(String var1, int var2) {
      int var3 = this.method3521(var1, new int[]{var2}, field2009);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.method3601(field2009[var5]);
         if(var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   @ObfuscatedName("ac")
   void method3535(String var1) {
      try {
         if(var1.startsWith("col=")) {
            field2023 = class120.method2172(var1.substring(4), 16);
         } else if(var1.equals("/col")) {
            field2023 = field2030;
         } else if(var1.startsWith("str=")) {
            field2020 = class120.method2172(var1.substring(4), 16);
         } else if(var1.equals("str")) {
            field2020 = 8388608;
         } else if(var1.equals("/str")) {
            field2020 = -1;
         } else if(var1.startsWith("u=")) {
            field2028 = class120.method2172(var1.substring(2), 16);
         } else if(var1.equals("u")) {
            field2028 = 0;
         } else if(var1.equals("/u")) {
            field2028 = -1;
         } else if(var1.startsWith("shad=")) {
            field2024 = class120.method2172(var1.substring(5), 16);
         } else if(var1.equals("shad")) {
            field2024 = 0;
         } else if(var1.equals("/shad")) {
            field2024 = field2022;
         } else if(var1.equals("br")) {
            this.method3572(field2030, field2022);
         }
      } catch (Exception var3) {
         ;
      }

   }

   @ObfuscatedName("q")
   public void method3590(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method3572(var4, var5);
         this.method3537(var1, var2 - this.method3601(var1) / 2, var3);
      }
   }

   @ObfuscatedName("z")
   public int method3601(String var1) {
      if(var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for(int var5 = 0; var5 < var1.length(); ++var5) {
            char var6 = var1.charAt(var5);
            if(var6 == '<') {
               var2 = var5;
            } else {
               if(var6 == '>' && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var5);
                  var2 = -1;
                  if(var7.equals("lt")) {
                     var6 = '<';
                  } else {
                     if(!var7.equals("gt")) {
                        if(var7.startsWith("img=")) {
                           try {
                              int var8 = class140.method2525(var7.substring(4));
                              var4 += field2025[var8].field261;
                              var3 = -1;
                           } catch (Exception var10) {
                              ;
                           }
                        }
                        continue;
                     }

                     var6 = '>';
                  }
               }

               if(var6 == 160) {
                  var6 = ' ';
               }

               if(var2 == -1) {
                  var4 += this.field2010[(char)(class164.method2834(var6) & 255)];
                  if(this.field2019 != null && var3 != -1) {
                     var4 += this.field2019[var6 + (var3 << 8)];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("r")
   void method3518(byte[] var1) {
      this.field2010 = new int[256];
      int var2;
      if(var1.length == 257) {
         for(var2 = 0; var2 < this.field2010.length; ++var2) {
            this.field2010[var2] = var1[var2] & 255;
         }

         this.field2015 = var1[256] & 255;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 256; ++var3) {
            this.field2010[var3] = var1[var2++] & 255;
         }

         int[] var10 = new int[256];
         int[] var4 = new int[256];

         int var5;
         for(var5 = 0; var5 < 256; ++var5) {
            var10[var5] = var1[var2++] & 255;
         }

         for(var5 = 0; var5 < 256; ++var5) {
            var4[var5] = var1[var2++] & 255;
         }

         byte[][] var11 = new byte[256][];

         int var8;
         for(int var6 = 0; var6 < 256; ++var6) {
            var11[var6] = new byte[var10[var6]];
            byte var7 = 0;

            for(var8 = 0; var8 < var11[var6].length; ++var8) {
               var7 += var1[var2++];
               var11[var6][var8] = var7;
            }
         }

         byte[][] var12 = new byte[256][];

         int var13;
         for(var13 = 0; var13 < 256; ++var13) {
            var12[var13] = new byte[var10[var13]];
            byte var14 = 0;

            for(int var9 = 0; var9 < var12[var13].length; ++var9) {
               var14 += var1[var2++];
               var12[var13][var9] = var14;
            }
         }

         this.field2019 = new byte[65536];

         for(var13 = 0; var13 < 256; ++var13) {
            if(var13 != 32 && var13 != 160) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if(var8 != 32 && var8 != 160) {
                     this.field2019[var8 + (var13 << 8)] = (byte)method3595(var11, var12, var4, this.field2010, var10, var13, var8);
                  }
               }
            }
         }

         this.field2015 = var4[32] + var10[32];
      }

   }

   @ObfuscatedName("ag")
   public void method3531(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method3572(var4, var5);
         int[] var7 = new int[var1.length()];
         int[] var8 = new int[var1.length()];

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = (int)(Math.sin((double)var9 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var8[var9] = (int)(Math.sin((double)var9 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method3538(var1, var2 - this.method3601(var1) / 2, var3, var7, var8);
      }
   }

   @ObfuscatedName("x")
   public int method3521(String var1, int[] var2, String[] var3) {
      if(var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(100);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         int var10 = -1;
         char var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for(int var14 = 0; var14 < var13; ++var14) {
            char var15 = var1.charAt(var14);
            if(var15 == '<') {
               var10 = var14;
            } else {
               if(var15 == '>' && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append('>');
                  if(var16.equals("br")) {
                     var3[var12] = var6.toString().substring(var5, var6.length());
                     ++var12;
                     var5 = var6.length();
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if(var16.equals("lt")) {
                     var4 += this.method3519('<');
                     if(this.field2019 != null && var11 != -1) {
                        var4 += this.field2019[(var11 << '\b') + 60];
                     }

                     var11 = '<';
                  } else if(var16.equals("gt")) {
                     var4 += this.method3519('>');
                     if(this.field2019 != null && var11 != -1) {
                        var4 += this.field2019[(var11 << '\b') + 62];
                     }

                     var11 = '>';
                  } else if(var16.startsWith("img=")) {
                     try {
                        int var17 = class140.method2525(var16.substring(4));
                        var4 += field2025[var17].field261;
                        var11 = 0;
                     } catch (Exception var20) {
                        ;
                     }
                  }

                  var15 = 0;
               }

               if(var10 == -1) {
                  if(var15 != 0) {
                     var6.append(var15);
                     var4 += this.method3519(var15);
                     if(this.field2019 != null && var11 != -1) {
                        var4 += this.field2019[var15 + (var11 << '\b')];
                     }

                     var11 = var15;
                  }

                  if(var15 == ' ') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                  }

                  if(var2 != null && var4 > var2[var12 < var2.length?var12:var2.length - 1] && var7 >= 0) {
                     var3[var12] = var6.toString().substring(var5, var7 - var9);
                     ++var12;
                     var5 = var7;
                     var7 = -1;
                     var4 -= var8;
                     var11 = 0;
                  }

                  if(var15 == '-') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                  }
               }
            }
         }

         String var19 = var6.toString();
         if(var19.length() > var5) {
            var3[var12++] = var19.substring(var5, var19.length());
         }

         return var12;
      }
   }

   @ObfuscatedName("l")
   abstract void vmethod4934(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   @ObfuscatedName("az")
   public void method3533(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method3572(var4, var5);
         field2018.setSeed((long)var6);
         field2026 = 192 + (field2018.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = var8;
            if((field2018.nextInt() & 3) == 0) {
               ++var8;
            }
         }

         this.method3538(var1, var2, var3, var7, (int[])null);
      }
   }

   @ObfuscatedName("o")
   public void method3543(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method3572(var4, var5);
         this.method3537(var1, var2, var3);
      }
   }

   @ObfuscatedName("g")
   public int method3523(String var1, int var2) {
      return this.method3521(var1, new int[]{var2}, field2009);
   }

   @ObfuscatedName("k")
   public void method3527(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method3572(var4, var5);
         this.method3537(var1, var2 - this.method3601(var1), var3);
      }
   }

   @ObfuscatedName("aa")
   void method3538(String var1, int var2, int var3, int[] var4, int[] var5) {
      var3 -= this.field2015;
      int var6 = -1;
      int var7 = -1;
      int var8 = 0;

      for(int var9 = 0; var9 < var1.length(); ++var9) {
         if(var1.charAt(var9) != 0) {
            char var10 = (char)(class164.method2834(var1.charAt(var9)) & 255);
            if(var10 == '<') {
               var6 = var9;
            } else {
               int var12;
               int var13;
               int var14;
               if(var10 == '>' && var6 != -1) {
                  String var11 = var1.substring(var6 + 1, var9);
                  var6 = -1;
                  if(var11.equals("lt")) {
                     var10 = '<';
                  } else {
                     if(!var11.equals("gt")) {
                        if(var11.startsWith("img=")) {
                           try {
                              if(var4 != null) {
                                 var12 = var4[var8];
                              } else {
                                 var12 = 0;
                              }

                              if(var5 != null) {
                                 var13 = var5[var8];
                              } else {
                                 var13 = 0;
                              }

                              ++var8;
                              var14 = class140.method2525(var11.substring(4));
                              class32 var15 = field2025[var14];
                              var15.method530(var12 + var2, var13 + (var3 + this.field2015 - var15.field262));
                              var2 += var15.field261;
                              var7 = -1;
                           } catch (Exception var19) {
                              ;
                           }
                        } else {
                           this.method3535(var11);
                        }
                        continue;
                     }

                     var10 = '>';
                  }
               }

               if(var10 == 160) {
                  var10 = ' ';
               }

               if(var6 == -1) {
                  if(this.field2019 != null && var7 != -1) {
                     var2 += this.field2019[var10 + (var7 << 8)];
                  }

                  int var17 = this.field2011[var10];
                  var12 = this.field2021[var10];
                  if(var4 != null) {
                     var13 = var4[var8];
                  } else {
                     var13 = 0;
                  }

                  if(var5 != null) {
                     var14 = var5[var8];
                  } else {
                     var14 = 0;
                  }

                  ++var8;
                  if(var10 != ' ') {
                     if(field2026 == 256) {
                        if(field2024 != -1) {
                           method3541(this.field2012[var10], var13 + var2 + this.field2013[var10] + 1, var3 + var14 + this.field2014[var10] + 1, var17, var12, field2024);
                        }

                        this.vmethod4936(this.field2012[var10], var13 + var2 + this.field2013[var10], var3 + var14 + this.field2014[var10], var17, var12, field2023);
                     } else {
                        if(field2024 != -1) {
                           method3598(this.field2012[var10], var13 + var2 + this.field2013[var10] + 1, var3 + var14 + this.field2014[var10] + 1, var17, var12, field2024, field2026);
                        }

                        this.vmethod4934(this.field2012[var10], var13 + var2 + this.field2013[var10], var3 + var14 + this.field2014[var10], var17, var12, field2023, field2026);
                     }
                  } else if(field2027 > 0) {
                     field2029 += field2027;
                     var2 += field2029 >> 8;
                     field2029 &= 255;
                  }

                  int var18 = this.field2010[var10];
                  if(field2020 != -1) {
                     class89.method1607(var2, var3 + (int)((double)this.field2015 * 0.7D), var18, field2020);
                  }

                  if(field2028 != -1) {
                     class89.method1607(var2, var3 + this.field2015, var18, field2028);
                  }

                  var2 += var18;
                  var7 = var10;
               }
            }
         }
      }

   }

   @ObfuscatedName("i")
   public void method3526(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method3572(var4, var5);
         field2026 = var6;
         this.method3537(var1, var2, var3);
      }
   }

   @ObfuscatedName("am")
   void method3536(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6 = var1.charAt(var5);
         if(var6 == '<') {
            var4 = true;
         } else if(var6 == '>') {
            var4 = false;
         } else if(!var4 && var6 == ' ') {
            ++var3;
         }
      }

      if(var3 > 0) {
         field2027 = (var2 - this.method3601(var1) << 8) / var3;
      }

   }

   @ObfuscatedName("y")
   public int method3579(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if(var1 == null) {
         return 0;
      } else {
         this.method3572(var6, var7);
         if(var10 == 0) {
            var10 = this.field2015;
         }

         int[] var11 = new int[]{var4};
         if(var5 < var10 + this.field2016 + this.field2017 && var5 < var10 + var10) {
            var11 = null;
         }

         int var12 = this.method3521(var1, var11, field2009);
         if(var9 == 3 && var12 == 1) {
            var9 = 1;
         }

         int var13;
         int var14;
         if(var9 == 0) {
            var13 = var3 + this.field2016;
         } else if(var9 == 1) {
            var13 = var3 + (var5 - this.field2016 - this.field2017 - var10 * (var12 - 1)) / 2 + this.field2016;
         } else if(var9 == 2) {
            var13 = var3 + var5 - this.field2017 - var10 * (var12 - 1);
         } else {
            var14 = (var5 - this.field2016 - this.field2017 - var10 * (var12 - 1)) / (var12 + 1);
            if(var14 < 0) {
               var14 = 0;
            }

            var13 = var3 + var14 + this.field2016;
            var10 += var14;
         }

         for(var14 = 0; var14 < var12; ++var14) {
            if(var8 == 0) {
               this.method3537(field2009[var14], var2, var13);
            } else if(var8 == 1) {
               this.method3537(field2009[var14], var2 + (var4 - this.method3601(field2009[var14])) / 2, var13);
            } else if(var8 == 2) {
               this.method3537(field2009[var14], var2 + var4 - this.method3601(field2009[var14]), var13);
            } else if(var14 == var12 - 1) {
               this.method3537(field2009[var14], var2, var13);
            } else {
               this.method3536(field2009[var14], var4);
               this.method3537(field2009[var14], var2, var13);
               field2027 = 0;
            }

            var13 += var10;
         }

         return var12;
      }
   }

   @ObfuscatedName("d")
   int method3519(char var1) {
      if(var1 == 160) {
         var1 = ' ';
      }

      return this.field2010[class164.method2834(var1) & 255];
   }

   @ObfuscatedName("at")
   void method3572(int var1, int var2) {
      field2020 = -1;
      field2028 = -1;
      field2022 = var2;
      field2024 = var2;
      field2030 = var1;
      field2023 = var1;
      field2026 = 256;
      field2027 = 0;
      field2029 = 0;
   }

   @ObfuscatedName("av")
   public void method3530(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method3572(var4, var5);
         int[] var7 = new int[var1.length()];

         for(int var8 = 0; var8 < var1.length(); ++var8) {
            var7[var8] = (int)(Math.sin((double)var8 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method3538(var1, var2 - this.method3601(var1) / 2, var3, (int[])null, var7);
      }
   }

   @ObfuscatedName("ad")
   static void method3598(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * class89.field862;
      int var8 = class89.field862 - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if(var2 < class89.field865) {
         var11 = class89.field865 - var2;
         var4 -= var11;
         var2 = class89.field865;
         var10 += var3 * var11;
         var7 += var11 * class89.field862;
      }

      if(var2 + var4 > class89.field866) {
         var4 -= var2 + var4 - class89.field866;
      }

      if(var1 < class89.field867) {
         var11 = class89.field867 - var1;
         var3 -= var11;
         var1 = class89.field867;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if(var3 + var1 > class89.field868) {
         var11 = var3 + var1 - class89.field868;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if(var3 > 0 && var4 > 0) {
         method3525(class89.field864, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   @ObfuscatedName("m")
   static int method3595(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if(var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if(var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if(var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for(int var18 = var11; var18 < var12; ++var18) {
         int var19 = var14[var16++] + var15[var17++];
         if(var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   @ObfuscatedName("as")
   static void method3541(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * class89.field862;
      int var7 = class89.field862 - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if(var2 < class89.field865) {
         var10 = class89.field865 - var2;
         var4 -= var10;
         var2 = class89.field865;
         var9 += var3 * var10;
         var6 += var10 * class89.field862;
      }

      if(var2 + var4 > class89.field866) {
         var4 -= var2 + var4 - class89.field866;
      }

      if(var1 < class89.field867) {
         var10 = class89.field867 - var1;
         var3 -= var10;
         var1 = class89.field867;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if(var3 + var1 > class89.field868) {
         var10 = var3 + var1 - class89.field868;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if(var3 > 0 && var4 > 0) {
         method3594(class89.field864, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   @ObfuscatedName("u")
   public static String method3524(String var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if(var4 == '<' || var4 == '>') {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for(int var7 = 0; var7 < var1; ++var7) {
         char var5 = var0.charAt(var7);
         if(var5 == '<') {
            var6.append("<lt>");
         } else if(var5 == '>') {
            var6.append("<gt>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }

   @ObfuscatedName("ax")
   static void method3525(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & 65280) * var9 & 16711680) + (var9 * (var2 & 16711935) & -16711936) >> 8;
      var9 = 256 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & 65280) * var9 & 16711680) + ((var12 & 16711935) * var9 & -16711936) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfuscatedName("al")
   static void method3594(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }
}
