package net.runelite.client.standalone;

import java.awt.Color;
import java.awt.image.BufferedImage;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSSpritePixels;

@ObfuscatedName("lp")
public final class class26 extends class89 implements RSSpritePixels {
   @ObfuscatedName("f")
   public int[] field203;
   @ObfuscatedName("c")
   public int field210;
   @ObfuscatedName("e")
   int field205;
   @ObfuscatedName("l")
   public int field202;
   @ObfuscatedName("s")
   public int field204;
   @ObfuscatedName("a")
   public int field207;
   @ObfuscatedName("w")
   public int field201;

   public class26(int[] var1, int var2, int var3) {
      this.field203 = var1;
      this.field202 = this.field207 = var2;
      this.field201 = this.field210 = var3;
      this.field205 = 0;
      this.field204 = 0;
   }

   public class26(int var1, int var2) {
      this(new int[var2 * var1], var1, var2);
   }

   class26() {
   }

   @ObfuscatedName("aw")
   public void method398(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = var2 < 0?-var2:0;
      int var10 = var2 + this.field201 <= var6?this.field201:var6 - var2;
      int var11 = var1 < 0?-var1:0;
      int var10000;
      if(this.field202 + var1 <= var5) {
         var10000 = this.field202;
      } else {
         var10000 = var5 - var1;
      }

      int var13 = var3 + var11 + (var9 + var2 + var4) * class89.field862 + var1;
      int var14 = var9 + var2;

      for(int var15 = var9; var15 < var10; ++var15) {
         int var16 = var7[var14];
         int var17 = var8[var14++];
         int var18 = var13;
         int var19;
         if(var1 < var16) {
            var19 = var16 - var1;
            var18 = var13 + (var19 - var11);
         } else {
            var19 = var11;
         }

         int var12;
         if(this.field202 + var1 <= var16 + var17) {
            var12 = this.field202;
         } else {
            var12 = var16 + var17 - var1;
         }

         for(int var20 = var19; var20 < var12; ++var20) {
            int var21 = this.field203[var20 + var15 * this.field202];
            if(var21 != 0) {
               class89.field864[var18++] = var21;
            } else {
               ++var18;
            }
         }

         var13 += class89.field862;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "()Llp;"
   )
   public class26 method383() {
      class26 var1 = new class26(this.field202, this.field201);
      var1.field207 = this.field207;
      var1.field210 = this.field210;
      var1.field204 = this.field207 - this.field202 - this.field204;
      var1.field205 = this.field205;

      for(int var2 = 0; var2 < this.field201; ++var2) {
         for(int var3 = 0; var3 < this.field202; ++var3) {
            var1.field203[var3 + var2 * this.field202] = this.field203[var2 * this.field202 + this.field202 - 1 - var3];
         }
      }

      return var1;
   }

   @ObfuscatedName("ad")
   void method397(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var6 != 0) {
         var1 -= this.field204 << 4;
         var2 -= this.field205 << 4;
         double var7 = (double)(var5 & 65535) * 9.587379924285257E-5D;
         int var9 = (int)Math.floor(Math.sin(var7) * (double)var6 + 0.5D);
         int var10 = (int)Math.floor(Math.cos(var7) * (double)var6 + 0.5D);
         int var11 = var10 * -var1 + -var2 * var9;
         int var12 = -var2 * var10 + var9 * -(-var1);
         int var13 = var10 * ((this.field202 << 4) - var1) + -var2 * var9;
         int var14 = var9 * -((this.field202 << 4) - var1) + -var2 * var10;
         int var15 = ((this.field201 << 4) - var2) * var9 + var10 * -var1;
         int var16 = ((this.field201 << 4) - var2) * var10 + var9 * -(-var1);
         int var17 = ((this.field201 << 4) - var2) * var9 + var10 * ((this.field202 << 4) - var1);
         int var18 = ((this.field201 << 4) - var2) * var10 + var9 * -((this.field202 << 4) - var1);
         int var19;
         int var20;
         if(var11 < var13) {
            var19 = var11;
            var20 = var13;
         } else {
            var19 = var13;
            var20 = var11;
         }

         if(var15 < var19) {
            var19 = var15;
         }

         if(var17 < var19) {
            var19 = var17;
         }

         if(var15 > var20) {
            var20 = var15;
         }

         if(var17 > var20) {
            var20 = var17;
         }

         int var21;
         int var22;
         if(var12 < var14) {
            var21 = var12;
            var22 = var14;
         } else {
            var21 = var14;
            var22 = var12;
         }

         if(var16 < var21) {
            var21 = var16;
         }

         if(var18 < var21) {
            var21 = var18;
         }

         if(var16 > var22) {
            var22 = var16;
         }

         if(var18 > var22) {
            var22 = var18;
         }

         var19 >>= 12;
         var20 = var20 + 4095 >> 12;
         var21 >>= 12;
         var22 = var22 + 4095 >> 12;
         var19 += var3;
         var20 += var3;
         var21 += var4;
         var22 += var4;
         var19 >>= 4;
         var20 = var20 + 15 >> 4;
         var21 >>= 4;
         var22 = var22 + 15 >> 4;
         if(var19 < class89.field867) {
            var19 = class89.field867;
         }

         if(var20 > class89.field868) {
            var20 = class89.field868;
         }

         if(var21 < class89.field865) {
            var21 = class89.field865;
         }

         if(var22 > class89.field866) {
            var22 = class89.field866;
         }

         var20 = var19 - var20;
         if(var20 < 0) {
            var22 = var21 - var22;
            if(var22 < 0) {
               int var23 = var19 + var21 * class89.field862;
               double var24 = 1.6777216E7D / (double)var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5D);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5D);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var29 * var27 >> 4) + (var2 << 8);
               int var32;
               int var33;
               int var34;
               int var35;
               int var36;
               int var37;
               int var38;
               if(var27 == 0) {
                  if(var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += class89.field862) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31;
                        var37 = var20;
                        if(var30 >= 0 && var31 >= 0 && var30 - (this.field202 << 12) < 0 && var31 - (this.field201 << 12) < 0) {
                           for(; var37 < 0; ++var37) {
                              var38 = this.field203[(var35 >> 12) + (var36 >> 12) * this.field202];
                              if(var38 != 0) {
                                 class89.field864[var34++] = var38;
                              } else {
                                 ++var34;
                              }
                           }
                        }

                        ++var33;
                     }
                  } else if(var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += class89.field862) {
                        var34 = var23;
                        var35 = var30;
                        var36 = (var28 * var26 >> 4) + var31;
                        var37 = var20;
                        if(var30 >= 0 && var30 - (this.field202 << 12) < 0) {
                           if((var32 = var36 - (this.field201 << 12)) >= 0) {
                              var32 = (var26 - var32) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if((var32 = (var36 - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.field203[(var35 >> 12) + (var36 >> 12) * this.field202];
                              if(var38 != 0) {
                                 class89.field864[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += class89.field862) {
                        var34 = var23;
                        var35 = var30;
                        var36 = (var28 * var26 >> 4) + var31;
                        var37 = var20;
                        if(var30 >= 0 && var30 - (this.field202 << 12) < 0) {
                           if(var36 < 0) {
                              var32 = (var26 - 1 - var36) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if((var32 = (var36 + 1 - (this.field201 << 12) - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.field203[(var35 >> 12) + (var36 >> 12) * this.field202];
                              if(var38 != 0) {
                                 class89.field864[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  }
               } else if(var27 < 0) {
                  if(var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += class89.field862) {
                        var34 = var23;
                        var35 = (var28 * var27 >> 4) + var30;
                        var36 = var31;
                        var37 = var20;
                        if(var31 >= 0 && var31 - (this.field201 << 12) < 0) {
                           if((var32 = var35 - (this.field202 << 12)) >= 0) {
                              var32 = (var27 - var32) / var27;
                              var37 = var20 + var32;
                              var35 += var27 * var32;
                              var34 = var23 + var32;
                           }

                           if((var32 = (var35 - var27) / var27) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.field203[(var35 >> 12) + (var36 >> 12) * this.field202];
                              if(var38 != 0) {
                                 class89.field864[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var35 += var27;
                              ++var37;
                           }
                        }

                        ++var33;
                        var31 += var27;
                     }
                  } else if(var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += class89.field862) {
                        var34 = var23;
                        var35 = (var28 * var27 >> 4) + var30;
                        var36 = (var28 * var26 >> 4) + var31;
                        var37 = var20;
                        if((var32 = var35 - (this.field202 << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if((var32 = var36 - (this.field201 << 12)) >= 0) {
                           var32 = (var26 - var32) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if((var32 = (var36 - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.field203[(var35 >> 12) + (var36 >> 12) * this.field202];
                           if(var38 != 0) {
                              class89.field864[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += class89.field862) {
                        var34 = var23;
                        var35 = (var28 * var27 >> 4) + var30;
                        var36 = (var28 * var26 >> 4) + var31;
                        var37 = var20;
                        if((var32 = var35 - (this.field202 << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if(var36 < 0) {
                           var32 = (var26 - 1 - var36) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if((var32 = (var36 + 1 - (this.field201 << 12) - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.field203[(var35 >> 12) + (var36 >> 12) * this.field202];
                           if(var38 != 0) {
                              class89.field864[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  }
               } else if(var26 == 0) {
                  for(var33 = var22; var33 < 0; var23 += class89.field862) {
                     var34 = var23;
                     var35 = (var28 * var27 >> 4) + var30;
                     var36 = var31;
                     var37 = var20;
                     if(var31 >= 0 && var31 - (this.field201 << 12) < 0) {
                        if(var35 < 0) {
                           var32 = (var27 - 1 - var35) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var34 = var23 + var32;
                        }

                        if((var32 = (var35 + 1 - (this.field202 << 12) - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.field203[(var35 >> 12) + (var36 >> 12) * this.field202];
                           if(var38 != 0) {
                              class89.field864[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           ++var37;
                        }
                     }

                     ++var33;
                     var31 += var27;
                  }
               } else if(var26 < 0) {
                  for(var33 = var22; var33 < 0; var23 += class89.field862) {
                     var34 = var23;
                     var35 = (var28 * var27 >> 4) + var30;
                     var36 = (var28 * var26 >> 4) + var31;
                     var37 = var20;
                     if(var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if((var32 = (var35 + 1 - (this.field202 << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if((var32 = var36 - (this.field201 << 12)) >= 0) {
                        var32 = (var26 - var32) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if((var32 = (var36 - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.field203[(var35 >> 12) + (var36 >> 12) * this.field202];
                        if(var38 != 0) {
                           class89.field864[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               } else {
                  for(var33 = var22; var33 < 0; var23 += class89.field862) {
                     var34 = var23;
                     var35 = (var28 * var27 >> 4) + var30;
                     var36 = (var28 * var26 >> 4) + var31;
                     var37 = var20;
                     if(var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if((var32 = (var35 + 1 - (this.field202 << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if(var36 < 0) {
                        var32 = (var26 - 1 - var36) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if((var32 = (var36 + 1 - (this.field201 << 12) - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.field203[(var35 >> 12) + (var36 >> 12) * this.field202];
                        if(var38 != 0) {
                           class89.field864[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               }

            }
         }
      }
   }

   @ObfuscatedName("m")
   public void method447(int var1) {
      for(int var2 = this.field201 - 1; var2 > 0; --var2) {
         int var3 = var2 * this.field202;

         for(int var4 = this.field202 - 1; var4 > 0; --var4) {
            if(this.field203[var4 + var3] == 0 && this.field203[var4 + var3 - 1 - this.field202] != 0) {
               this.field203[var4 + var3] = var1;
            }
         }
      }

   }

   @ObfuscatedName("r")
   public void method374(int var1) {
      int[] var2 = new int[this.field202 * this.field201];
      int var3 = 0;

      for(int var4 = 0; var4 < this.field201; ++var4) {
         for(int var5 = 0; var5 < this.field202; ++var5) {
            int var6 = this.field203[var3];
            if(var6 == 0) {
               if(var5 > 0 && this.field203[var3 - 1] != 0) {
                  var6 = var1;
               } else if(var4 > 0 && this.field203[var3 - this.field202] != 0) {
                  var6 = var1;
               } else if(var5 < this.field202 - 1 && this.field203[var3 + 1] != 0) {
                  var6 = var1;
               } else if(var4 < this.field201 - 1 && this.field203[var3 + this.field202] != 0) {
                  var6 = var1;
               }
            }

            var2[var3++] = var6;
         }
      }

      this.field203 = var2;
   }

   @ObfuscatedName("ag")
   public void method388(int var1, int var2, int var3) {
      var1 += this.field204;
      var2 += this.field205;
      int var4 = var1 + var2 * class89.field862;
      int var5 = 0;
      int var6 = this.field201;
      int var7 = this.field202;
      int var8 = class89.field862 - var7;
      int var9 = 0;
      int var10;
      if(var2 < class89.field865) {
         var10 = class89.field865 - var2;
         var6 -= var10;
         var2 = class89.field865;
         var5 += var10 * var7;
         var4 += var10 * class89.field862;
      }

      if(var6 + var2 > class89.field866) {
         var6 -= var6 + var2 - class89.field866;
      }

      if(var1 < class89.field867) {
         var10 = class89.field867 - var1;
         var7 -= var10;
         var1 = class89.field867;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if(var7 + var1 > class89.field868) {
         var10 = var7 + var1 - class89.field868;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if(var7 > 0 && var6 > 0) {
         if(var3 == 256) {
            method468(0, 0, 0, class89.field864, this.field203, var5, 0, var4, 0, var7, var6, var8, var9);
         } else {
            method390(0, 0, 0, class89.field864, this.field203, var5, 0, var4, 0, var7, var6, var8, var9, var3);
         }

      }
   }

   @ObfuscatedName("as")
   public void method442(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0D);
         int var13 = (int)(Math.cos(var7) * 65536.0D);
         var12 = var12 * var9 >> 8;
         var13 = var13 * var9 >> 8;
         int var14 = var11 * var12 + var10 * var13 + (var5 << 16);
         int var15 = var11 * var13 - var10 * var12 + (var6 << 16);
         int var16 = var1 + var2 * class89.field862;

         for(var2 = 0; var2 < var4; ++var2) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for(var1 = -var3; var1 < 0; ++var1) {
               int var20 = this.field203[this.field202 * (var19 >> 16) + (var18 >> 16)];
               if(var20 != 0) {
                  class89.field864[var17++] = var20;
               } else {
                  ++var17;
               }

               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += class89.field862;
         }
      } catch (Exception var22) {
         ;
      }

   }

   @ObfuscatedName("p")
   public void method373() {
      int[] var1 = new int[this.field202 * this.field201];
      int var2 = 0;

      for(int var3 = this.field201 - 1; var3 >= 0; --var3) {
         for(int var4 = 0; var4 < this.field202; ++var4) {
            var1[var2++] = this.field203[var4 + var3 * this.field202];
         }
      }

      this.field203 = var1;
      this.field205 = this.field210 - this.field201 - this.field205;
   }

   @ObfuscatedName("c")
   public void method372() {
      int[] var1 = new int[this.field202 * this.field201];
      int var2 = 0;

      for(int var3 = 0; var3 < this.field201; ++var3) {
         for(int var4 = this.field202 - 1; var4 >= 0; --var4) {
            var1[var2++] = this.field203[var4 + var3 * this.field202];
         }
      }

      this.field203 = var1;
      this.field204 = this.field207 - this.field202 - this.field204;
   }

   @ObfuscatedName("e")
   public void method371(int var1) {
      if(this.field202 != this.field207 || this.field201 != this.field210) {
         int var2 = var1;
         if(var1 > this.field204) {
            var2 = this.field204;
         }

         int var3 = var1;
         if(var1 + this.field204 + this.field202 > this.field207) {
            var3 = this.field207 - this.field204 - this.field202;
         }

         int var4 = var1;
         if(var1 > this.field205) {
            var4 = this.field205;
         }

         int var5 = var1;
         if(var1 + this.field205 + this.field201 > this.field210) {
            var5 = this.field210 - this.field205 - this.field201;
         }

         int var6 = var2 + var3 + this.field202;
         int var7 = var4 + var5 + this.field201;
         int[] var8 = new int[var6 * var7];

         for(int var9 = 0; var9 < this.field201; ++var9) {
            for(int var10 = 0; var10 < this.field202; ++var10) {
               var8[var6 * (var9 + var4) + var10 + var2] = this.field203[var10 + var9 * this.field202];
            }
         }

         this.field203 = var8;
         this.field202 = var6;
         this.field201 = var7;
         this.field204 -= var2;
         this.field205 -= var4;
      }
   }

   @ObfuscatedName("x")
   public void method378(int var1, int var2) {
      var1 += this.field204;
      var2 += this.field205;
      int var3 = var1 + var2 * class89.field862;
      int var4 = 0;
      int var5 = this.field201;
      int var6 = this.field202;
      int var7 = class89.field862 - var6;
      int var8 = 0;
      int var9;
      if(var2 < class89.field865) {
         var9 = class89.field865 - var2;
         var5 -= var9;
         var2 = class89.field865;
         var4 += var9 * var6;
         var3 += var9 * class89.field862;
      }

      if(var5 + var2 > class89.field866) {
         var5 -= var5 + var2 - class89.field866;
      }

      if(var1 < class89.field867) {
         var9 = class89.field867 - var1;
         var6 -= var9;
         var1 = class89.field867;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 + var1 > class89.field868) {
         var9 = var6 + var1 - class89.field868;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 > 0 && var5 > 0) {
         method395(class89.field864, this.field203, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "()Llp;"
   )
   public class26 method368() {
      class26 var1 = new class26(this.field207, this.field210);

      for(int var2 = 0; var2 < this.field201; ++var2) {
         for(int var3 = 0; var3 < this.field202; ++var3) {
            var1.field203[var3 + (var2 + this.field205) * this.field207 + this.field204] = this.field203[var3 + var2 * this.field202];
         }
      }

      return var1;
   }

   @ObfuscatedName("o")
   public void method450(int var1, int var2, int var3, int var4) {
      if(var3 == 256) {
         this.method378(var1, var2);
      } else {
         var1 += this.field204;
         var2 += this.field205;
         int var5 = var1 + var2 * class89.field862;
         int var6 = 0;
         int var7 = this.field201;
         int var8 = this.field202;
         int var9 = class89.field862 - var8;
         int var10 = 0;
         int var11;
         if(var2 < class89.field865) {
            var11 = class89.field865 - var2;
            var7 -= var11;
            var2 = class89.field865;
            var6 += var11 * var8;
            var5 += var11 * class89.field862;
         }

         if(var7 + var2 > class89.field866) {
            var7 -= var7 + var2 - class89.field866;
         }

         if(var1 < class89.field867) {
            var11 = class89.field867 - var1;
            var8 -= var11;
            var1 = class89.field867;
            var6 += var11;
            var5 += var11;
            var10 += var11;
            var9 += var11;
         }

         if(var8 + var1 > class89.field868) {
            var11 = var8 + var1 - class89.field868;
            var8 -= var11;
            var10 += var11;
            var9 += var11;
         }

         if(var8 > 0 && var7 > 0) {
            method379(class89.field864, this.field203, 0, var6, var5, var8, var7, var9, var10, var3, var4);
         }
      }
   }

   @ObfuscatedName("s")
   public void method370() {
      if(this.field202 != this.field207 || this.field201 != this.field210) {
         int[] var1 = new int[this.field207 * this.field210];

         for(int var2 = 0; var2 < this.field201; ++var2) {
            for(int var3 = 0; var3 < this.field202; ++var3) {
               var1[var3 + (var2 + this.field205) * this.field207 + this.field204] = this.field203[var3 + var2 * this.field202];
            }
         }

         this.field203 = var1;
         this.field202 = this.field207;
         this.field201 = this.field210;
         this.field204 = 0;
         this.field205 = 0;
      }
   }

   @ObfuscatedName("g")
   public void method457(int var1, int var2, int var3, int var4) {
      if(var3 > 0 && var4 > 0) {
         int var5 = this.field202;
         int var6 = this.field201;
         int var7 = 0;
         int var8 = 0;
         int var9 = this.field207;
         int var10 = this.field210;
         int var11 = (var9 << 16) / var3;
         int var12 = (var10 << 16) / var4;
         int var13;
         if(this.field204 > 0) {
            var13 = (var11 + (this.field204 << 16) - 1) / var11;
            var1 += var13;
            var7 += var13 * var11 - (this.field204 << 16);
         }

         if(this.field205 > 0) {
            var13 = (var12 + (this.field205 << 16) - 1) / var12;
            var2 += var13;
            var8 += var13 * var12 - (this.field205 << 16);
         }

         if(var5 < var9) {
            var3 = (var11 + ((var5 << 16) - var7) - 1) / var11;
         }

         if(var6 < var10) {
            var4 = (var12 + ((var6 << 16) - var8) - 1) / var12;
         }

         var13 = var1 + var2 * class89.field862;
         int var14 = class89.field862 - var3;
         if(var2 + var4 > class89.field866) {
            var4 -= var2 + var4 - class89.field866;
         }

         int var15;
         if(var2 < class89.field865) {
            var15 = class89.field865 - var2;
            var4 -= var15;
            var13 += var15 * class89.field862;
            var8 += var12 * var15;
         }

         if(var3 + var1 > class89.field868) {
            var15 = var3 + var1 - class89.field868;
            var3 -= var15;
            var14 += var15;
         }

         if(var1 < class89.field867) {
            var15 = class89.field867 - var1;
            var3 -= var15;
            var13 += var15;
            var7 += var11 * var15;
            var14 += var15;
         }

         method381(class89.field864, this.field203, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
      }
   }

   @ObfuscatedName("ax")
   public void method427(int var1, int var2, int var3, int var4) {
      if(var3 <= this.field207 && var4 <= this.field210) {
         int var5 = var3 * this.field204 / this.field207 + var1;
         int var6 = (var3 * (this.field204 + this.field202) + this.field207 - 1) / this.field207 + var1;
         int var7 = var2 + var4 * this.field205 / this.field210;
         int var8 = var2 + (this.field210 + (this.field205 + this.field201) * var4 - 1) / this.field210;
         if(var5 < class89.field867) {
            var5 = class89.field867;
         }

         if(var6 > class89.field868) {
            var6 = class89.field868;
         }

         if(var7 < class89.field865) {
            var7 = class89.field865;
         }

         if(var8 > class89.field866) {
            var8 = class89.field866;
         }

         if(var5 < var6 && var7 < var8) {
            int var9 = var5 + var7 * class89.field862;
            int var10 = class89.field862 - (var6 - var5);
            if(var9 < class89.field864.length) {
               for(int var11 = var7; var11 < var8; ++var11) {
                  for(int var12 = var5; var12 < var6; ++var12) {
                     int var13 = var12 - var1 << 4;
                     int var14 = var11 - var2 << 4;
                     int var15 = var13 * this.field207 / var3 - (this.field204 << 4);
                     int var16 = (var13 + 16) * this.field207 / var3 - (this.field204 << 4);
                     int var17 = var14 * this.field210 / var4 - (this.field205 << 4);
                     int var18 = (var14 + 16) * this.field210 / var4 - (this.field205 << 4);
                     int var19 = (var16 - var15) * (var18 - var17) >> 1;
                     if(var19 != 0) {
                        if(var15 < 0) {
                           var15 = 0;
                        }

                        if(var16 >= this.field202 << 4) {
                           var16 = this.field202 << 4;
                        }

                        if(var17 < 0) {
                           var17 = 0;
                        }

                        if(var18 >= this.field201 << 4) {
                           var18 = this.field201 << 4;
                        }

                        --var16;
                        --var18;
                        int var20 = 16 - (var15 & 15);
                        int var21 = (var16 & 15) + 1;
                        int var22 = 16 - (var17 & 15);
                        int var23 = (var18 & 15) + 1;
                        var15 >>= 4;
                        var16 >>= 4;
                        var17 >>= 4;
                        var18 >>= 4;
                        int var24 = 0;
                        int var25 = 0;
                        int var26 = 0;
                        int var27 = 0;

                        int var28;
                        for(var28 = var17; var28 <= var18; ++var28) {
                           int var29 = 16;
                           if(var28 == var17) {
                              var29 = var22;
                           }

                           if(var28 == var18) {
                              var29 = var23;
                           }

                           for(int var30 = var15; var30 <= var16; ++var30) {
                              int var31 = this.field203[var30 + var28 * this.field202];
                              if(var31 != 0) {
                                 int var32;
                                 if(var30 == var15) {
                                    var32 = var29 * var20;
                                 } else if(var30 == var16) {
                                    var32 = var29 * var21;
                                 } else {
                                    var32 = var29 << 4;
                                 }

                                 var27 += var32;
                                 var24 += var32 * (var31 >> 16 & 255);
                                 var25 += var32 * (var31 >> 8 & 255);
                                 var26 += (var31 & 255) * var32;
                              }
                           }
                        }

                        if(var27 >= var19) {
                           var28 = var26 / var27 + (var24 / var27 << 16) + (var25 / var27 << 8);
                           if(var28 == 0) {
                              var28 = 1;
                           }

                           class89.field864[var9] = var28;
                        }

                        ++var9;
                     }
                  }

                  var9 += var10;
               }

            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("w")
   public void method467() {
      class89.method1530(this.field203, this.field202, this.field201);
   }

   @ObfuscatedName("k")
   public void method384(int var1, int var2, int var3) {
      var1 += this.field204;
      var2 += this.field205;
      int var4 = var1 + var2 * class89.field862;
      int var5 = 0;
      int var6 = this.field201;
      int var7 = this.field202;
      int var8 = class89.field862 - var7;
      int var9 = 0;
      int var10;
      if(var2 < class89.field865) {
         var10 = class89.field865 - var2;
         var6 -= var10;
         var2 = class89.field865;
         var5 += var10 * var7;
         var4 += var10 * class89.field862;
      }

      if(var6 + var2 > class89.field866) {
         var6 -= var6 + var2 - class89.field866;
      }

      if(var1 < class89.field867) {
         var10 = class89.field867 - var1;
         var7 -= var10;
         var1 = class89.field867;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if(var7 + var1 > class89.field868) {
         var10 = var7 + var1 - class89.field868;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if(var7 > 0 && var6 > 0) {
         method385(class89.field864, this.field203, 0, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   @ObfuscatedName("aa")
   public void method394(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
      try {
         int var11 = -var3 / 2;
         int var12 = -var4 / 2;
         int var13 = (int)(Math.sin((double)var7 / 326.11D) * 65536.0D);
         int var14 = (int)(Math.cos((double)var7 / 326.11D) * 65536.0D);
         var13 = var13 * var8 >> 8;
         var14 = var14 * var8 >> 8;
         int var15 = var12 * var13 + var11 * var14 + (var5 << 16);
         int var16 = var12 * var14 - var11 * var13 + (var6 << 16);
         int var17 = var1 + var2 * class89.field862;

         for(var2 = 0; var2 < var4; ++var2) {
            int var18 = var9[var2];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for(var1 = -var10[var2]; var1 < 0; ++var1) {
               class89.field864[var19++] = this.field203[this.field202 * (var21 >> 16) + (var20 >> 16)];
               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += class89.field862;
         }
      } catch (Exception var23) {
         ;
      }

   }

   @ObfuscatedName("y")
   public void method463(int var1, int var2, int var3, int var4, int var5) {
      if(var3 > 0 && var4 > 0) {
         int var6 = this.field202;
         int var7 = this.field201;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.field207;
         int var11 = this.field210;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if(this.field204 > 0) {
            var14 = (var12 + (this.field204 << 16) - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.field204 << 16);
         }

         if(this.field205 > 0) {
            var14 = (var13 + (this.field205 << 16) - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.field205 << 16);
         }

         if(var6 < var10) {
            var3 = (var12 + ((var6 << 16) - var8) - 1) / var12;
         }

         if(var7 < var11) {
            var4 = (var13 + ((var7 << 16) - var9) - 1) / var13;
         }

         var14 = var1 + var2 * class89.field862;
         int var15 = class89.field862 - var3;
         if(var2 + var4 > class89.field866) {
            var4 -= var2 + var4 - class89.field866;
         }

         int var16;
         if(var2 < class89.field865) {
            var16 = class89.field865 - var2;
            var4 -= var16;
            var14 += var16 * class89.field862;
            var9 += var13 * var16;
         }

         if(var3 + var1 > class89.field868) {
            var16 = var3 + var1 - class89.field868;
            var3 -= var16;
            var15 += var16;
         }

         if(var1 < class89.field867) {
            var16 = class89.field867 - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         method366(class89.field864, this.field203, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   @ObfuscatedName("d")
   public void method376(int var1, int var2) {
      var1 += this.field204;
      var2 += this.field205;
      int var3 = var1 + var2 * class89.field862;
      int var4 = 0;
      int var5 = this.field201;
      int var6 = this.field202;
      int var7 = class89.field862 - var6;
      int var8 = 0;
      int var9;
      if(var2 < class89.field865) {
         var9 = class89.field865 - var2;
         var5 -= var9;
         var2 = class89.field865;
         var4 += var9 * var6;
         var3 += var9 * class89.field862;
      }

      if(var5 + var2 > class89.field866) {
         var5 -= var5 + var2 - class89.field866;
      }

      if(var1 < class89.field867) {
         var9 = class89.field867 - var1;
         var6 -= var9;
         var1 = class89.field867;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 + var1 > class89.field868) {
         var9 = var6 + var1 - class89.field868;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 > 0 && var5 > 0) {
         method377(class89.field864, this.field203, var4, var3, var6, var5, var7, var8);
      }
   }

   @ObfuscatedName("at")
   public void method391(int var1, int var2, int var3, int var4, int var5) {
      if(var3 > 0 && var4 > 0) {
         int var6 = this.field202;
         int var7 = this.field201;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.field207;
         int var11 = this.field210;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if(this.field204 > 0) {
            var14 = (var12 + (this.field204 << 16) - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.field204 << 16);
         }

         if(this.field205 > 0) {
            var14 = (var13 + (this.field205 << 16) - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.field205 << 16);
         }

         if(var6 < var10) {
            var3 = (var12 + ((var6 << 16) - var8) - 1) / var12;
         }

         if(var7 < var11) {
            var4 = (var13 + ((var7 << 16) - var9) - 1) / var13;
         }

         var14 = var1 + var2 * class89.field862;
         int var15 = class89.field862 - var3;
         if(var2 + var4 > class89.field866) {
            var4 -= var2 + var4 - class89.field866;
         }

         int var16;
         if(var2 < class89.field865) {
            var16 = class89.field865 - var2;
            var4 -= var16;
            var14 += var16 * class89.field862;
            var9 += var13 * var16;
         }

         if(var3 + var1 > class89.field868) {
            var16 = var3 + var1 - class89.field868;
            var3 -= var16;
            var15 += var16;
         }

         if(var1 < class89.field867) {
            var16 = class89.field867 - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         if(var5 == 256) {
            method409(0, 0, 0, var8, this.field203, class89.field864, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6);
         } else {
            method392(0, 0, 0, var8, this.field203, class89.field864, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6, var5);
         }

      }
   }

   @ObfuscatedName("al")
   public void method396(int var1, int var2, int var3, int var4) {
      this.method397(this.field207 << 3, this.field210 << 3, var1 << 4, var2 << 4, var3, var4);
   }

   public int getWidth() {
      return this.field202;
   }

   public int getHeight() {
      return this.field201;
   }

   public void toBufferedImage(BufferedImage var1) {
      int var2 = this.getWidth();
      int var3 = this.getHeight();
      if(var1.getWidth() == var2 && var1.getHeight() == var3) {
         int[] var4 = this.getPixels();
         int[] var5 = new int[var4.length];

         for(int var6 = 0; var6 < var4.length; ++var6) {
            if(var4[var6] != 0) {
               var5[var6] = var4[var6] | -16777216;
            }
         }

         var1.setRGB(0, 0, var2, var3, var5, 0, var2);
      } else {
         throw new IllegalArgumentException("Image bounds do not match SpritePixels");
      }
   }

   public void toBufferedOutline(BufferedImage var1, int var2) {
      int var3 = this.getWidth();
      int var4 = this.getHeight();
      if(var1.getWidth() == var3 && var1.getHeight() == var4) {
         int[] var5 = this.getPixels();
         int[] var6 = new int[var3 * var4];
         int var7 = 0;

         for(int var8 = 0; var8 < var4; ++var8) {
            for(int var9 = 0; var9 < var3; ++var9) {
               int var10 = var5[var7];
               if(var10 == 16777215 || var10 == 0) {
                  if(var9 > 0 && var5[var7 - 1] != 0) {
                     var10 = var2;
                  } else if(var8 > 0 && var5[var7 - var3] != 0) {
                     var10 = var2;
                  } else if(var9 < var3 - 1 && var5[var7 + 1] != 0) {
                     var10 = var2;
                  } else if(var8 < var4 - 1 && var5[var7 + var3] != 0) {
                     var10 = var2;
                  }

                  var6[var7] = var10;
               }

               ++var7;
            }
         }

         var1.setRGB(0, 0, var3, var4, var6, 0, var3);
      } else {
         throw new IllegalArgumentException("Image bounds do not match SpritePixels");
      }
   }

   public int[] getPixels() {
      return this.field203;
   }

   public BufferedImage toBufferedImage() {
      BufferedImage var1 = new BufferedImage(this.getWidth(), this.getHeight(), 2);
      this.toBufferedImage(var1);
      return var1;
   }

   public BufferedImage toBufferedOutline(Color var1) {
      BufferedImage var2 = new BufferedImage(this.getWidth(), this.getHeight(), 2);
      this.toBufferedOutline(var2, var1.getRGB());
      return var2;
   }

   public void setRaster() {
      this.method467();
   }

   public void drawAt(int var1, int var2) {
      this.method378(var1, var2);
   }

   @ObfuscatedName("af")
   static void method468(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if(var0 != 0) {
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   @ObfuscatedName("v")
   static void method395(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfuscatedName("ac")
   static void method409(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      for(int var16 = var3; var8 < 0; ++var8) {
         var7 = var15 * (var9 >> 16);

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if(var0 != 0) {
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var16;
         var10 += var11;
      }

   }

   @ObfuscatedName("q")
   static void method385(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if(var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var13 & 16711935) * var10 + var9 * (var2 & 16711935) & -16711936) + ((var2 & 65280) * var9 + var10 * (var13 & 65280) & 16711680) >> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfuscatedName("z")
   static void method377(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = -var5; var8 < 0; ++var8) {
         int var9;
         for(var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
         }

         for(var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
            ;
         }

         var3 += var6;
         var2 += var7;
      }

   }

   @ObfuscatedName("u")
   static void method381(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = var11 * (var4 >> 16);

         for(int var15 = -var7; var15 < 0; ++var15) {
            var2 = var1[(var3 >> 16) + var14];
            if(var2 != 0) {
               var0[var5++] = var2;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }

   }

   @ObfuscatedName("az")
   static void method390(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if(var0 != 0) {
               var1 = var13 * (var0 & 16711935);
               var0 = (var1 & -16711936) + (var13 * var0 - var1 & 16711680) >>> 8;
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   @ObfuscatedName("i")
   static void method379(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      int var11 = 256 - var9;
      int var12 = (var10 & 16711935) * var11 & -16711936;
      int var13 = (var10 & 65280) * var11 & 16711680;
      var10 = (var12 | var13) >>> 8;

      for(int var14 = -var6; var14 < 0; ++var14) {
         for(int var15 = -var5; var15 < 0; ++var15) {
            var2 = var1[var3++];
            if(var2 != 0) {
               var12 = var9 * (var2 & 16711935) & -16711936;
               var13 = (var2 & 65280) * var9 & 16711680;
               var0[var4++] = var10 + ((var12 | var13) >>> 8);
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfuscatedName("am")
   static void method392(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
      for(int var17 = var3; var8 < 0; ++var8) {
         var7 = var15 * (var9 >> 16);

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if(var0 != 0) {
               var1 = (var0 & 16711935) * var16;
               var0 = (var1 & -16711936) + (var0 * var16 - var1 & 16711680) >>> 8;
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var17;
         var10 += var11;
      }

   }

   @ObfuscatedName("av")
   static void method366(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      int var13 = 256 - var12;
      int var14 = var3;

      for(int var15 = -var8; var15 < 0; ++var15) {
         int var16 = var11 * (var4 >> 16);

         for(int var17 = -var7; var17 < 0; ++var17) {
            var2 = var1[(var3 >> 16) + var16];
            if(var2 != 0) {
               int var18 = var0[var5];
               var0[var5++] = ((var2 & 65280) * var12 + var13 * (var18 & 65280) & 16711680) + ((var18 & 16711935) * var13 + var12 * (var2 & 16711935) & -16711936) >> 8;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var14;
         var5 += var6;
      }

   }
}
