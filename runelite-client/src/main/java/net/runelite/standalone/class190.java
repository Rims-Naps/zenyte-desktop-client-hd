package net.runelite.standalone;

import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFontTypeFace;

@ObfuscatedName("kd")
public abstract class class190 extends class173 implements RSFontTypeFace {
   @ObfuscatedName("j")
   static int field2733;
   @ObfuscatedName("z")
   static int field2723;
   @ObfuscatedName("n")
   static int field2732;
   @ObfuscatedName("h")
   static Random field2721;
   @ObfuscatedName("u")
   static int field2729;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "[Lle;"
   )
   public static class303[] field2728;
   @ObfuscatedName("b")
   static int field2726;
   @ObfuscatedName("x")
   static int field2731;
   @ObfuscatedName("v")
   static int field2725;
   @ObfuscatedName("o")
   static String[] field2712;
   @ObfuscatedName("g")
   static int field2727;
   @ObfuscatedName("t")
   static int field2730;
   @ObfuscatedName("p")
   public int field2719;
   @ObfuscatedName("c")
   public int field2718;
   @ObfuscatedName("l")
   int[] field2713;
   @ObfuscatedName("s")
   int[] field2724;
   @ObfuscatedName("f")
   byte[][] field2715;
   @ObfuscatedName("r")
   public int field2720;
   @ObfuscatedName("d")
   byte[] field2722;
   @ObfuscatedName("a")
   int[] field2717;
   @ObfuscatedName("e")
   int[] field2716;
   @ObfuscatedName("w")
   int[] field2714;

   static {
      field2723 = -1;
      field2731 = -1;
      field2725 = -1;
      field2727 = -1;
      field2733 = 0;
      field2726 = 0;
      field2729 = 256;
      field2730 = 0;
      field2732 = 0;
      field2721 = new Random();
      field2712 = new String[100];
   }

   class190(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      this.field2715 = new byte[256][];
      this.field2718 = 0;
      this.field2716 = var2;
      this.field2717 = var3;
      this.field2714 = var4;
      this.field2724 = var5;
      this.method3807(var1);
      this.field2715 = var7;
      int var8 = Integer.MAX_VALUE;
      int var9 = Integer.MIN_VALUE;

      for(int var10 = 0; var10 < 256; ++var10) {
         if(this.field2717[var10] < var8 && this.field2724[var10] != 0) {
            var8 = this.field2717[var10];
         }

         if(this.field2717[var10] + this.field2724[var10] > var9) {
            var9 = this.field2717[var10] + this.field2724[var10];
         }
      }

      this.field2719 = this.field2718 - var8;
      this.field2720 = var9 - this.field2718;
   }

   class190(byte[] var1) {
      this.field2715 = new byte[256][];
      this.field2718 = 0;
      this.method3807(var1);
   }

   @ObfuscatedName("af")
   public void method3811(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 != null) {
         this.method3861(var4, var5);
         double var8 = 7.0D - (double)var7 / 8.0D;
         if(var8 < 0.0D) {
            var8 = 0.0D;
         }

         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var10[var11] = (int)(Math.sin((double)var11 / 1.5D + (double)var6 / 1.0D) * var8);
         }

         this.method3827(var1, var2 - this.method3890(var1) / 2, var3, (int[])null, var10);
      }
   }

   @ObfuscatedName("k")
   public void method3816(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method3861(var4, var5);
         this.method3826(var1, var2 - this.method3890(var1), var3);
      }
   }

   @ObfuscatedName("ag")
   public void method3820(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method3861(var4, var5);
         int[] var7 = new int[var1.length()];
         int[] var8 = new int[var1.length()];

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = (int)(Math.sin((double)var9 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var8[var9] = (int)(Math.sin((double)var9 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method3827(var1, var2 - this.method3890(var1) / 2, var3, var7, var8);
      }
   }

   @ObfuscatedName("ac")
   void method3824(String var1) {
      try {
         if(var1.startsWith("col=")) {
            field2726 = class42.method790(var1.substring(4), 16);
         } else if(var1.equals("/col")) {
            field2726 = field2733;
         } else if(var1.startsWith("str=")) {
            field2723 = class42.method790(var1.substring(4), 16);
         } else if(var1.equals("str")) {
            field2723 = 8388608;
         } else if(var1.equals("/str")) {
            field2723 = -1;
         } else if(var1.startsWith("u=")) {
            field2731 = class42.method790(var1.substring(2), 16);
         } else if(var1.equals("u")) {
            field2731 = 0;
         } else if(var1.equals("/u")) {
            field2731 = -1;
         } else if(var1.startsWith("shad=")) {
            field2727 = class42.method790(var1.substring(5), 16);
         } else if(var1.equals("shad")) {
            field2727 = 0;
         } else if(var1.equals("/shad")) {
            field2727 = field2725;
         } else if(var1.equals("br")) {
            this.method3861(field2733, field2725);
         }
      } catch (Exception var3) {
         ;
      }

   }

   @ObfuscatedName("z")
   public int method3890(String var1) {
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
                              int var8 = class17.method368(var7.substring(4));
                              var4 += field2728[var8].field3763;
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
                  var4 += this.field2713[(char)(class118.method2151(var6) & 255)];
                  if(this.field2722 != null && var3 != -1) {
                     var4 += this.field2722[var6 + (var3 << 8)];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("i")
   public void method3815(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method3861(var4, var5);
         field2729 = var6;
         this.method3826(var1, var2, var3);
      }
   }

   @ObfuscatedName("aa")
   void method3827(String var1, int var2, int var3, int[] var4, int[] var5) {
      var3 -= this.field2718;
      int var6 = -1;
      int var7 = -1;
      int var8 = 0;

      for(int var9 = 0; var9 < var1.length(); ++var9) {
         if(var1.charAt(var9) != 0) {
            char var10 = (char)(class118.method2151(var1.charAt(var9)) & 255);
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
                              var14 = class17.method368(var11.substring(4));
                              class303 var15 = field2728[var14];
                              var15.method5980(var12 + var2, var13 + (var3 + this.field2718 - var15.field3764));
                              var2 += var15.field3763;
                              var7 = -1;
                           } catch (Exception var19) {
                              ;
                           }
                        } else {
                           this.method3824(var11);
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
                  if(this.field2722 != null && var7 != -1) {
                     var2 += this.field2722[var10 + (var7 << 8)];
                  }

                  int var17 = this.field2714[var10];
                  var12 = this.field2724[var10];
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
                     if(field2729 == 256) {
                        if(field2727 != -1) {
                           method3830(this.field2715[var10], var13 + var2 + this.field2716[var10] + 1, var3 + var14 + this.field2717[var10] + 1, var17, var12, field2727);
                        }

                        this.vmethod5828(this.field2715[var10], var13 + var2 + this.field2716[var10], var3 + var14 + this.field2717[var10], var17, var12, field2726);
                     } else {
                        if(field2727 != -1) {
                           method3887(this.field2715[var10], var13 + var2 + this.field2716[var10] + 1, var3 + var14 + this.field2717[var10] + 1, var17, var12, field2727, field2729);
                        }

                        this.vmethod5826(this.field2715[var10], var13 + var2 + this.field2716[var10], var3 + var14 + this.field2717[var10], var17, var12, field2726, field2729);
                     }
                  } else if(field2730 > 0) {
                     field2732 += field2730;
                     var2 += field2732 >> 8;
                     field2732 &= 255;
                  }

                  int var18 = this.field2713[var10];
                  if(field2723 != -1) {
                     class173.method3213(var2, var3 + (int)((double)this.field2718 * 0.7D), var18, field2723);
                  }

                  if(field2731 != -1) {
                     class173.method3213(var2, var3 + this.field2718, var18, field2731);
                  }

                  var2 += var18;
                  var7 = var10;
               }
            }
         }
      }

   }

   @ObfuscatedName("aw")
   void method3826(String var1, int var2, int var3) {
      var3 -= this.field2718;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if(var1.charAt(var6) != 0) {
            char var7 = (char)(class118.method2151(var1.charAt(var6)) & 255);
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
                              var9 = class17.method368(var8.substring(4));
                              class303 var10 = field2728[var9];
                              var10.method5980(var2, var3 + this.field2718 - var10.field3764);
                              var2 += var10.field3763;
                              var5 = -1;
                           } catch (Exception var14) {
                              ;
                           }
                        } else {
                           this.method3824(var8);
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
                  if(this.field2722 != null && var5 != -1) {
                     var2 += this.field2722[var7 + (var5 << 8)];
                  }

                  int var12 = this.field2714[var7];
                  var9 = this.field2724[var7];
                  if(var7 != ' ') {
                     if(field2729 == 256) {
                        if(field2727 != -1) {
                           method3830(this.field2715[var7], var2 + this.field2716[var7] + 1, var3 + this.field2717[var7] + 1, var12, var9, field2727);
                        }

                        this.vmethod5828(this.field2715[var7], var2 + this.field2716[var7], var3 + this.field2717[var7], var12, var9, field2726);
                     } else {
                        if(field2727 != -1) {
                           method3887(this.field2715[var7], var2 + this.field2716[var7] + 1, var3 + this.field2717[var7] + 1, var12, var9, field2727, field2729);
                        }

                        this.vmethod5826(this.field2715[var7], var2 + this.field2716[var7], var3 + this.field2717[var7], var12, var9, field2726, field2729);
                     }
                  } else if(field2730 > 0) {
                     field2732 += field2730;
                     var2 += field2732 >> 8;
                     field2732 &= 255;
                  }

                  int var13 = this.field2713[var7];
                  if(field2723 != -1) {
                     class173.method3213(var2, var3 + (int)((double)this.field2718 * 0.7D), var13, field2723);
                  }

                  if(field2731 != -1) {
                     class173.method3213(var2, var3 + this.field2718 + 1, var13, field2731);
                  }

                  var2 += var13;
                  var5 = var7;
               }
            }
         }
      }

   }

   @ObfuscatedName("l")
   abstract void vmethod5826(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   @ObfuscatedName("f")
   abstract void vmethod5828(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   @ObfuscatedName("r")
   void method3807(byte[] var1) {
      this.field2713 = new int[256];
      int var2;
      if(var1.length == 257) {
         for(var2 = 0; var2 < this.field2713.length; ++var2) {
            this.field2713[var2] = var1[var2] & 255;
         }

         this.field2718 = var1[256] & 255;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 256; ++var3) {
            this.field2713[var3] = var1[var2++] & 255;
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

         this.field2722 = new byte[65536];

         for(var13 = 0; var13 < 256; ++var13) {
            if(var13 != 32 && var13 != 160) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if(var8 != 32 && var8 != 160) {
                     this.field2722[var8 + (var13 << 8)] = (byte)method3884(var11, var12, var4, this.field2713, var10, var13, var8);
                  }
               }
            }
         }

         this.field2718 = var4[32] + var10[32];
      }

   }

   @ObfuscatedName("y")
   public int method3868(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if(var1 == null) {
         return 0;
      } else {
         this.method3861(var6, var7);
         if(var10 == 0) {
            var10 = this.field2718;
         }

         int[] var11 = new int[]{var4};
         if(var5 < var10 + this.field2719 + this.field2720 && var5 < var10 + var10) {
            var11 = null;
         }

         int var12 = this.method3810(var1, var11, field2712);
         if(var9 == 3 && var12 == 1) {
            var9 = 1;
         }

         int var13;
         int var14;
         if(var9 == 0) {
            var13 = var3 + this.field2719;
         } else if(var9 == 1) {
            var13 = var3 + (var5 - this.field2719 - this.field2720 - var10 * (var12 - 1)) / 2 + this.field2719;
         } else if(var9 == 2) {
            var13 = var3 + var5 - this.field2720 - var10 * (var12 - 1);
         } else {
            var14 = (var5 - this.field2719 - this.field2720 - var10 * (var12 - 1)) / (var12 + 1);
            if(var14 < 0) {
               var14 = 0;
            }

            var13 = var3 + var14 + this.field2719;
            var10 += var14;
         }

         for(var14 = 0; var14 < var12; ++var14) {
            if(var8 == 0) {
               this.method3826(field2712[var14], var2, var13);
            } else if(var8 == 1) {
               this.method3826(field2712[var14], var2 + (var4 - this.method3890(field2712[var14])) / 2, var13);
            } else if(var8 == 2) {
               this.method3826(field2712[var14], var2 + var4 - this.method3890(field2712[var14]), var13);
            } else if(var14 == var12 - 1) {
               this.method3826(field2712[var14], var2, var13);
            } else {
               this.method3825(field2712[var14], var4);
               this.method3826(field2712[var14], var2, var13);
               field2730 = 0;
            }

            var13 += var10;
         }

         return var12;
      }
   }

   public int getBaseline() {
      return this.field2718;
   }

   public int getTextWidth(String var1) {
      return this.method3890(var1);
   }

   @ObfuscatedName("x")
   public int method3810(String var1, int[] var2, String[] var3) {
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
                     var4 += this.method3808('<');
                     if(this.field2722 != null && var11 != -1) {
                        var4 += this.field2722[(var11 << '\b') + 60];
                     }

                     var11 = '<';
                  } else if(var16.equals("gt")) {
                     var4 += this.method3808('>');
                     if(this.field2722 != null && var11 != -1) {
                        var4 += this.field2722[(var11 << '\b') + 62];
                     }

                     var11 = '>';
                  } else if(var16.startsWith("img=")) {
                     try {
                        int var17 = class17.method368(var16.substring(4));
                        var4 += field2728[var17].field3763;
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
                     var4 += this.method3808(var15);
                     if(this.field2722 != null && var11 != -1) {
                        var4 += this.field2722[var15 + (var11 << '\b')];
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

   @ObfuscatedName("v")
   public int method3857(String var1, int var2) {
      int var3 = this.method3810(var1, new int[]{var2}, field2712);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.method3890(field2712[var5]);
         if(var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   @ObfuscatedName("av")
   public void method3819(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method3861(var4, var5);
         int[] var7 = new int[var1.length()];

         for(int var8 = 0; var8 < var1.length(); ++var8) {
            var7[var8] = (int)(Math.sin((double)var8 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method3827(var1, var2 - this.method3890(var1) / 2, var3, (int[])null, var7);
      }
   }

   @ObfuscatedName("at")
   void method3861(int var1, int var2) {
      field2723 = -1;
      field2731 = -1;
      field2725 = var2;
      field2727 = var2;
      field2733 = var1;
      field2726 = var1;
      field2729 = 256;
      field2730 = 0;
      field2732 = 0;
   }

   @ObfuscatedName("d")
   int method3808(char var1) {
      if(var1 == 160) {
         var1 = ' ';
      }

      return this.field2713[class118.method2151(var1) & 255];
   }

   @ObfuscatedName("am")
   void method3825(String var1, int var2) {
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
         field2730 = (var2 - this.method3890(var1) << 8) / var3;
      }

   }

   @ObfuscatedName("o")
   public void method3832(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method3861(var4, var5);
         this.method3826(var1, var2, var3);
      }
   }

   @ObfuscatedName("g")
   public int method3812(String var1, int var2) {
      return this.method3810(var1, new int[]{var2}, field2712);
   }

   @ObfuscatedName("q")
   public void method3879(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method3861(var4, var5);
         this.method3826(var1, var2 - this.method3890(var1) / 2, var3);
      }
   }

   @ObfuscatedName("az")
   public void method3822(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method3861(var4, var5);
         field2721.setSeed((long)var6);
         field2729 = 192 + (field2721.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = var8;
            if((field2721.nextInt() & 3) == 0) {
               ++var8;
            }
         }

         this.method3827(var1, var2, var3, var7, (int[])null);
      }
   }

   @ObfuscatedName("ax")
   static void method3814(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var13 = var2;
      var2 = ((var2 & 65280) * var9 & 16711680) + (var9 * (var2 & 16711935) & -16711936) >> 8;
      var9 = 256 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               int var12 = var0[var4];
               client.drawAlpha(var0, var4++, (((var12 & 65280) * var9 & 16711680) + ((var12 & 16711935) * var9 & -16711936) >> 8) + var2, var13, 255 - var9);
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfuscatedName("u")
   public static String method3813(String var0) {
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

   @ObfuscatedName("m")
   static int method3884(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
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
   static void method3830(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * class173.field2119;
      int var7 = class173.field2119 - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if(var2 < class173.field2122) {
         var10 = class173.field2122 - var2;
         var4 -= var10;
         var2 = class173.field2122;
         var9 += var3 * var10;
         var6 += var10 * class173.field2119;
      }

      if(var2 + var4 > class173.field2123) {
         var4 -= var2 + var4 - class173.field2123;
      }

      if(var1 < class173.field2124) {
         var10 = class173.field2124 - var1;
         var3 -= var10;
         var1 = class173.field2124;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if(var3 + var1 > class173.field2125) {
         var10 = var3 + var1 - class173.field2125;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if(var3 > 0 && var4 > 0) {
         method3883(class173.field2121, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   @ObfuscatedName("ad")
   static void method3887(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * class173.field2119;
      int var8 = class173.field2119 - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if(var2 < class173.field2122) {
         var11 = class173.field2122 - var2;
         var4 -= var11;
         var2 = class173.field2122;
         var10 += var3 * var11;
         var7 += var11 * class173.field2119;
      }

      if(var2 + var4 > class173.field2123) {
         var4 -= var2 + var4 - class173.field2123;
      }

      if(var1 < class173.field2124) {
         var11 = class173.field2124 - var1;
         var3 -= var11;
         var1 = class173.field2124;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if(var3 + var1 > class173.field2125) {
         var11 = var3 + var1 - class173.field2125;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if(var3 > 0 && var4 > 0) {
         method3814(class173.field2121, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   @ObfuscatedName("al")
   static void method3883(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2 | -16777216;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2 | -16777216;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2 | -16777216;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2 | -16777216;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2 | -16777216;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }
}
