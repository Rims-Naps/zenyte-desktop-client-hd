package net.runelite.standalone;

import java.io.EOFException;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
public final class class263 {
   @ObfuscatedName("ls")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   static class187 field3408;
   @ObfuscatedName("f")
   static byte[] field3404;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Ldo;"
   )
   class18 field3409;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1698358095
   )
   int field3406;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1713542611
   )
   int field3407;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Ldo;"
   )
   class18 field3405;

   static {
      field3404 = new byte[520];
   }

   @ObfuscatedSignature(
      signature = "(ILdo;Ldo;I)V"
   )
   public class263(int var1, class18 var2, class18 var3, int var4) {
      this.field3409 = null;
      this.field3405 = null;
      this.field3407 = 65000;
      this.field3406 = var1;
      this.field3409 = var2;
      this.field3405 = var3;
      this.field3407 = var4;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I[BII)Z",
      garbageValue = "-147040195"
   )
   public boolean method5236(int var1, byte[] var2, int var3) {
      class18 var4 = this.field3409;
      synchronized(this.field3409) {
         if(var3 >= 0 && var3 <= this.field3407) {
            boolean var5 = this.method5238(var1, var2, var3, true);
            if(!var5) {
               var5 = this.method5238(var1, var2, var3, false);
            }

            return var5;
         } else {
            throw new IllegalArgumentException();
         }
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)[B",
      garbageValue = "814176446"
   )
   public byte[] method5237(int var1) {
      class18 var2 = this.field3409;
      synchronized(this.field3409) {
         try {
            Object var10000;
            if(this.field3405.method372() < (long)(var1 * 6 + 6)) {
               var10000 = null;
               return (byte[])var10000;
            } else {
               this.field3405.method387((long)(var1 * 6));
               this.field3405.method374(field3404, 0, 6);
               int var3 = ((field3404[0] & 255) << 16) + (field3404[2] & 255) + ((field3404[1] & 255) << 8);
               int var4 = (field3404[5] & 255) + ((field3404[3] & 255) << 16) + ((field3404[4] & 255) << 8);
               if(var3 < 0 || var3 > this.field3407) {
                  var10000 = null;
                  return (byte[])var10000;
               } else if(var4 <= 0 || (long)var4 > this.field3409.method372() / 520L) {
                  var10000 = null;
                  return (byte[])var10000;
               } else {
                  byte[] var5 = new byte[var3];
                  int var6 = 0;
                  int var7 = 0;

                  while(var6 < var3) {
                     if(var4 == 0) {
                        var10000 = null;
                        return (byte[])var10000;
                     }

                     this.field3409.method387((long)(var4 * 520));
                     int var8 = var3 - var6;
                     if(var8 > 512) {
                        var8 = 512;
                     }

                     this.field3409.method374(field3404, 0, var8 + 8);
                     int var9 = (field3404[1] & 255) + ((field3404[0] & 255) << 8);
                     int var10 = (field3404[3] & 255) + ((field3404[2] & 255) << 8);
                     int var11 = ((field3404[5] & 255) << 8) + ((field3404[4] & 255) << 16) + (field3404[6] & 255);
                     int var12 = field3404[7] & 255;
                     if(var9 == var1 && var7 == var10 && var12 == this.field3406) {
                        if(var11 >= 0 && (long)var11 <= this.field3409.method372() / 520L) {
                           for(int var13 = 0; var13 < var8; ++var13) {
                              var5[var6++] = field3404[var13 + 8];
                           }

                           var4 = var11;
                           ++var7;
                           continue;
                        }

                        var10000 = null;
                        return (byte[])var10000;
                     }

                     var10000 = null;
                     return (byte[])var10000;
                  }

                  byte[] var18 = var5;
                  return var18;
               }
            }
         } catch (IOException var16) {
            return null;
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I[BIZB)Z",
      garbageValue = "-1"
   )
   boolean method5238(int var1, byte[] var2, int var3, boolean var4) {
      class18 var5 = this.field3409;
      synchronized(this.field3409) {
         try {
            int var6;
            boolean var10000;
            if(var4) {
               if(this.field3405.method372() < (long)(var1 * 6 + 6)) {
                  var10000 = false;
                  return var10000;
               }

               this.field3405.method387((long)(var1 * 6));
               this.field3405.method374(field3404, 0, 6);
               var6 = (field3404[5] & 255) + ((field3404[3] & 255) << 16) + ((field3404[4] & 255) << 8);
               if(var6 <= 0 || (long)var6 > this.field3409.method372() / 520L) {
                  var10000 = false;
                  return var10000;
               }
            } else {
               var6 = (int)((this.field3409.method372() + 519L) / 520L);
               if(var6 == 0) {
                  var6 = 1;
               }
            }

            field3404[0] = (byte)(var3 >> 16);
            field3404[1] = (byte)(var3 >> 8);
            field3404[2] = (byte)var3;
            field3404[3] = (byte)(var6 >> 16);
            field3404[4] = (byte)(var6 >> 8);
            field3404[5] = (byte)var6;
            this.field3405.method387((long)(var1 * 6));
            this.field3405.method376(field3404, 0, 6);
            int var7 = 0;
            int var8 = 0;

            while(true) {
               if(var7 < var3) {
                  label139: {
                     int var9 = 0;
                     int var14;
                     if(var4) {
                        this.field3409.method387((long)(var6 * 520));

                        try {
                           this.field3409.method374(field3404, 0, 8);
                        } catch (EOFException var16) {
                           break label139;
                        }

                        var14 = (field3404[1] & 255) + ((field3404[0] & 255) << 8);
                        int var11 = (field3404[3] & 255) + ((field3404[2] & 255) << 8);
                        var9 = ((field3404[5] & 255) << 8) + ((field3404[4] & 255) << 16) + (field3404[6] & 255);
                        int var12 = field3404[7] & 255;
                        if(var14 != var1 || var11 != var8 || var12 != this.field3406) {
                           var10000 = false;
                           return var10000;
                        }

                        if(var9 < 0 || (long)var9 > this.field3409.method372() / 520L) {
                           var10000 = false;
                           return var10000;
                        }
                     }

                     if(var9 == 0) {
                        var4 = false;
                        var9 = (int)((this.field3409.method372() + 519L) / 520L);
                        if(var9 == 0) {
                           ++var9;
                        }

                        if(var9 == var6) {
                           ++var9;
                        }
                     }

                     if(var3 - var7 <= 512) {
                        var9 = 0;
                     }

                     field3404[0] = (byte)(var1 >> 8);
                     field3404[1] = (byte)var1;
                     field3404[2] = (byte)(var8 >> 8);
                     field3404[3] = (byte)var8;
                     field3404[4] = (byte)(var9 >> 16);
                     field3404[5] = (byte)(var9 >> 8);
                     field3404[6] = (byte)var9;
                     field3404[7] = (byte)this.field3406;
                     this.field3409.method387((long)(var6 * 520));
                     this.field3409.method376(field3404, 0, 8);
                     var14 = var3 - var7;
                     if(var14 > 512) {
                        var14 = 512;
                     }

                     this.field3409.method376(var2, var7, var14);
                     var7 += var14;
                     var6 = var9;
                     ++var8;
                     continue;
                  }
               }

               var10000 = true;
               return var10000;
            }
         } catch (IOException var17) {
            return false;
         }
      }
   }

   @ObfuscatedName("gp")
   @ObfuscatedSignature(
      signature = "(IIIIIIIB)V",
      garbageValue = "4"
   )
   static final void method5239(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
         if(client.field2157 && var0 != class260.field3393) {
            return;
         }

         long var7 = 0L;
         boolean var9 = true;
         boolean var10 = false;
         boolean var11 = false;
         if(var1 == 0) {
            var7 = class269.field3464.method1951(var0, var2, var3);
         }

         if(var1 == 1) {
            var7 = class269.field3464.method1952(var0, var2, var3);
         }

         if(var1 == 2) {
            var7 = class269.field3464.method1981(var0, var2, var3);
         }

         if(var1 == 3) {
            var7 = class269.field3464.method1992(var0, var2, var3);
         }

         int var12;
         if(0L != var7) {
            var12 = class269.field3464.method1955(var0, var2, var3, var7);
            int var39 = class178.method3682(var7);
            int var40 = var12 & 31;
            int var41 = var12 >> 6 & 3;
            class15 var13;
            if(var1 == 0) {
               class269.field3464.method1942(var0, var2, var3);
               var13 = class285.method5484(var39);
               if(var13.field173 != 0) {
                  client.field2211[var0].method50(var2, var3, var40, var41, var13.field166);
               }
            }

            if(var1 == 1) {
               class269.field3464.method1962(var0, var2, var3);
            }

            if(var1 == 2) {
               class269.field3464.method1944(var0, var2, var3);
               var13 = class285.method5484(var39);
               if(var2 + var13.field150 > 103 || var3 + var13.field150 > 103 || var2 + var13.field193 > 103 || var3 + var13.field193 > 103) {
                  return;
               }

               if(var13.field173 != 0) {
                  client.field2211[var0].method57(var2, var3, var13.field150, var13.field193, var41, var13.field166);
               }
            }

            if(var1 == 3) {
               class269.field3464.method1945(var0, var2, var3);
               var13 = class285.method5484(var39);
               if(var13.field173 == 1) {
                  client.field2211[var0].method52(var2, var3);
               }
            }
         }

         if(var4 >= 0) {
            var12 = var0;
            if(var0 < 3 && (class185.field2512[1][var2][var3] & 2) == 2) {
               var12 = var0 + 1;
            }

            class111 var42 = class269.field3464;
            class3 var14 = client.field2211[var0];
            class15 var15 = class285.method5484(var4);
            int var16;
            int var17;
            if(var5 != 1 && var5 != 3) {
               var16 = var15.field150;
               var17 = var15.field193;
            } else {
               var16 = var15.field193;
               var17 = var15.field150;
            }

            int var18;
            int var19;
            if(var16 + var2 <= 104) {
               var18 = (var16 >> 1) + var2;
               var19 = var2 + (var16 + 1 >> 1);
            } else {
               var18 = var2;
               var19 = var2 + 1;
            }

            int var20;
            int var21;
            if(var3 + var17 <= 104) {
               var20 = var3 + (var17 >> 1);
               var21 = var3 + (var17 + 1 >> 1);
            } else {
               var20 = var3;
               var21 = var3 + 1;
            }

            int[][] var22 = class185.field2522[var12];
            int var23 = var22[var19][var21] + var22[var19][var20] + var22[var18][var20] + var22[var18][var21] >> 2;
            int var24 = (var2 << 7) + (var16 << 6);
            int var25 = (var3 << 7) + (var17 << 6);
            long var26 = class282.method5439(var2, var3, 2, var15.field167 == 0, var4);
            int var28 = (var5 << 6) + var6;
            if(var15.field188 == 1) {
               var28 += 256;
            }

            Object var29;
            if(var6 == 22) {
               if(var15.field171 == -1 && var15.field189 == null) {
                  var29 = var15.method322(22, var5, var22, var24, var23, var25);
               } else {
                  var29 = new class321(var4, 22, var5, var12, var2, var3, var15.field171, true, (class102)null);
               }

               var42.method2001(var0, var2, var3, var23, (class102)var29, var26, var28);
               if(var15.field173 == 1) {
                  var14.method47(var2, var3);
               }
            } else if(var6 != 10 && var6 != 11) {
               if(var6 >= 12) {
                  if(var15.field171 == -1 && var15.field189 == null) {
                     var29 = var15.method322(var6, var5, var22, var24, var23, var25);
                  } else {
                     var29 = new class321(var4, var6, var5, var12, var2, var3, var15.field171, true, (class102)null);
                  }

                  var42.method1935(var0, var2, var3, var23, 1, 1, (class102)var29, 0, var26, var28);
                  if(var15.field173 != 0) {
                     var14.method45(var2, var3, var16, var17, var15.field166);
                  }
               } else if(var6 == 0) {
                  if(var15.field171 == -1 && var15.field189 == null) {
                     var29 = var15.method322(0, var5, var22, var24, var23, var25);
                  } else {
                     var29 = new class321(var4, 0, var5, var12, var2, var3, var15.field171, true, (class102)null);
                  }

                  var42.method1933(var0, var2, var3, var23, (class102)var29, (class102)null, class185.field2518[var5], 0, var26, var28);
                  if(var15.field173 != 0) {
                     var14.method44(var2, var3, var6, var5, var15.field166);
                  }
               } else if(var6 == 1) {
                  if(var15.field171 == -1 && var15.field189 == null) {
                     var29 = var15.method322(1, var5, var22, var24, var23, var25);
                  } else {
                     var29 = new class321(var4, 1, var5, var12, var2, var3, var15.field171, true, (class102)null);
                  }

                  var42.method1933(var0, var2, var3, var23, (class102)var29, (class102)null, class185.field2511[var5], 0, var26, var28);
                  if(var15.field173 != 0) {
                     var14.method44(var2, var3, var6, var5, var15.field166);
                  }
               } else {
                  int var35;
                  if(var6 == 2) {
                     var35 = var5 + 1 & 3;
                     Object var30;
                     Object var31;
                     if(var15.field171 == -1 && var15.field189 == null) {
                        var30 = var15.method322(2, var5 + 4, var22, var24, var23, var25);
                        var31 = var15.method322(2, var35, var22, var24, var23, var25);
                     } else {
                        var30 = new class321(var4, 2, var5 + 4, var12, var2, var3, var15.field171, true, (class102)null);
                        var31 = new class321(var4, 2, var35, var12, var2, var3, var15.field171, true, (class102)null);
                     }

                     var42.method1933(var0, var2, var3, var23, (class102)var30, (class102)var31, class185.field2518[var5], class185.field2518[var35], var26, var28);
                     if(var15.field173 != 0) {
                        var14.method44(var2, var3, var6, var5, var15.field166);
                     }
                  } else if(var6 == 3) {
                     if(var15.field171 == -1 && var15.field189 == null) {
                        var29 = var15.method322(3, var5, var22, var24, var23, var25);
                     } else {
                        var29 = new class321(var4, 3, var5, var12, var2, var3, var15.field171, true, (class102)null);
                     }

                     var42.method1933(var0, var2, var3, var23, (class102)var29, (class102)null, class185.field2511[var5], 0, var26, var28);
                     if(var15.field173 != 0) {
                        var14.method44(var2, var3, var6, var5, var15.field166);
                     }
                  } else if(var6 == 9) {
                     if(var15.field171 == -1 && var15.field189 == null) {
                        var29 = var15.method322(var6, var5, var22, var24, var23, var25);
                     } else {
                        var29 = new class321(var4, var6, var5, var12, var2, var3, var15.field171, true, (class102)null);
                     }

                     var42.method1935(var0, var2, var3, var23, 1, 1, (class102)var29, 0, var26, var28);
                     if(var15.field173 != 0) {
                        var14.method45(var2, var3, var16, var17, var15.field166);
                     }
                  } else if(var6 == 4) {
                     if(var15.field171 == -1 && var15.field189 == null) {
                        var29 = var15.method322(4, var5, var22, var24, var23, var25);
                     } else {
                        var29 = new class321(var4, 4, var5, var12, var2, var3, var15.field171, true, (class102)null);
                     }

                     var42.method1934(var0, var2, var3, var23, (class102)var29, (class102)null, class185.field2518[var5], 0, 0, 0, var26, var28);
                  } else {
                     Object var32;
                     long var36;
                     if(var6 == 5) {
                        var35 = 16;
                        var36 = var42.method1951(var0, var2, var3);
                        if(0L != var36) {
                           var35 = class285.method5484(class178.method3682(var36)).field172;
                        }

                        if(var15.field171 == -1 && var15.field189 == null) {
                           var32 = var15.method322(4, var5, var22, var24, var23, var25);
                        } else {
                           var32 = new class321(var4, 4, var5, var12, var2, var3, var15.field171, true, (class102)null);
                        }

                        var42.method1934(var0, var2, var3, var23, (class102)var32, (class102)null, class185.field2518[var5], 0, var35 * class185.field2513[var5], var35 * class185.field2521[var5], var26, var28);
                     } else if(var6 == 6) {
                        var35 = 8;
                        var36 = var42.method1951(var0, var2, var3);
                        if(0L != var36) {
                           var35 = class285.method5484(class178.method3682(var36)).field172 / 2;
                        }

                        if(var15.field171 == -1 && var15.field189 == null) {
                           var32 = var15.method322(4, var5 + 4, var22, var24, var23, var25);
                        } else {
                           var32 = new class321(var4, 4, var5 + 4, var12, var2, var3, var15.field171, true, (class102)null);
                        }

                        var42.method1934(var0, var2, var3, var23, (class102)var32, (class102)null, 256, var5, var35 * class185.field2526[var5], var35 * class185.field2523[var5], var26, var28);
                     } else if(var6 == 7) {
                        int var38 = var5 + 2 & 3;
                        if(var15.field171 == -1 && var15.field189 == null) {
                           var29 = var15.method322(4, var38 + 4, var22, var24, var23, var25);
                        } else {
                           var29 = new class321(var4, 4, var38 + 4, var12, var2, var3, var15.field171, true, (class102)null);
                        }

                        var42.method1934(var0, var2, var3, var23, (class102)var29, (class102)null, 256, var38, 0, 0, var26, var28);
                     } else if(var6 == 8) {
                        var35 = 8;
                        var36 = var42.method1951(var0, var2, var3);
                        if(var36 != 0L) {
                           var35 = class285.method5484(class178.method3682(var36)).field172 / 2;
                        }

                        int var34 = var5 + 2 & 3;
                        Object var33;
                        if(var15.field171 == -1 && var15.field189 == null) {
                           var32 = var15.method322(4, var5 + 4, var22, var24, var23, var25);
                           var33 = var15.method322(4, var34 + 4, var22, var24, var23, var25);
                        } else {
                           var32 = new class321(var4, 4, var5 + 4, var12, var2, var3, var15.field171, true, (class102)null);
                           var33 = new class321(var4, 4, var34 + 4, var12, var2, var3, var15.field171, true, (class102)null);
                        }

                        var42.method1934(var0, var2, var3, var23, (class102)var32, (class102)var33, 256, var5, var35 * class185.field2526[var5], var35 * class185.field2523[var5], var26, var28);
                     }
                  }
               }
            } else {
               if(var15.field171 == -1 && var15.field189 == null) {
                  var29 = var15.method322(10, var5, var22, var24, var23, var25);
               } else {
                  var29 = new class321(var4, 10, var5, var12, var2, var3, var15.field171, true, (class102)null);
               }

               if(var29 != null) {
                  var42.method1935(var0, var2, var3, var23, var16, var17, (class102)var29, var6 == 11?256:0, var26, var28);
               }

               if(var15.field173 != 0) {
                  var14.method45(var2, var3, var16, var17, var15.field166);
               }
            }
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIII)Lcz;",
      garbageValue = "1852397109"
   )
   static class296 method5245(int var0, int var1, int var2) {
      int var3 = class95.method1750(var1, var0);
      class296 var5 = (class296)class296.field3698.method1813((long)(var3 << 16));
      class296 var4;
      if(var5 != null) {
         var4 = var5;
      } else {
         String var6 = String.valueOf(var3);
         int var7 = class88.field954.method4421(var6);
         if(var7 == -1) {
            var4 = null;
         } else {
            label57: {
               byte[] var8 = class88.field954.method4405(var7);
               if(var8 != null) {
                  if(var8.length <= 1) {
                     var4 = null;
                     break label57;
                  }

                  var5 = class229.method4604(var8);
                  if(var5 != null) {
                     class296.field3698.method1820(var5, (long)(var3 << 16));
                     var4 = var5;
                     break label57;
                  }
               }

               var4 = null;
            }
         }
      }

      if(var4 != null) {
         return var4;
      } else {
         var3 = class265.method5286(var2, var0);
         class296 var11 = (class296)class296.field3698.method1813((long)(var3 << 16));
         class296 var12;
         if(var11 != null) {
            var12 = var11;
         } else {
            String var13 = String.valueOf(var3);
            int var9 = class88.field954.method4421(var13);
            if(var9 == -1) {
               var12 = null;
            } else {
               byte[] var10 = class88.field954.method4405(var9);
               if(var10 != null) {
                  if(var10.length <= 1) {
                     var12 = null;
                     return var12 != null?var12:null;
                  }

                  var11 = class229.method4604(var10);
                  if(var11 != null) {
                     class296.field3698.method1820(var11, (long)(var3 << 16));
                     var12 = var11;
                     return var12 != null?var12:null;
                  }
               }

               var12 = null;
            }
         }

         return var12 != null?var12:null;
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "639412753"
   )
   static final void method5247(String var0) {
      class149.method2707("Please remove " + var0 + " from your friend list first");
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IIIB)I",
      garbageValue = "14"
   )
   static final int method5248(int var0, int var1, int var2) {
      if(var2 > 179) {
         var1 /= 2;
      }

      if(var2 > 192) {
         var1 /= 2;
      }

      if(var2 > 217) {
         var1 /= 2;
      }

      if(var2 > 243) {
         var1 /= 2;
      }

      int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
      return var3;
   }
}
