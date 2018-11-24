package net.runelite.standalone;

import java.io.IOException;
import java.io.OutputStream;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
public class class318 implements Runnable {
   @ObfuscatedName("au")
   protected static boolean field3915;
   @ObfuscatedName("p")
   boolean field3908;
   @ObfuscatedName("c")
   IOException field3912;
   @ObfuscatedName("l")
   OutputStream field3911;
   @ObfuscatedName("s")
   byte[] field3909;
   @ObfuscatedName("f")
   Thread field3910;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 886457493
   )
   int field3916;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1147346427
   )
   int field3913;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 421964543
   )
   int field3907;

   class318(OutputStream var1, int var2) {
      this.field3913 = 0;
      this.field3916 = 0;
      this.field3911 = var1;
      this.field3907 = var2 + 1;
      this.field3909 = new byte[this.field3907];
      this.field3910 = new Thread(this);
      this.field3910.setDaemon(true);
      this.field3910.start();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "([BIIB)V",
      garbageValue = "-1"
   )
   void method6233(byte[] var1, int var2, int var3) throws IOException {
      if(var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            if(this.field3912 != null) {
               throw new IOException(this.field3912.toString());
            } else {
               int var5;
               if(this.field3913 <= this.field3916) {
                  var5 = this.field3907 - this.field3916 + this.field3913 - 1;
               } else {
                  var5 = this.field3913 - this.field3916 - 1;
               }

               if(var5 < var3) {
                  throw new IOException("");
               } else {
                  if(var3 + this.field3916 <= this.field3907) {
                     System.arraycopy(var1, var2, this.field3909, this.field3916, var3);
                  } else {
                     int var6 = this.field3907 - this.field3916;
                     System.arraycopy(var1, var2, this.field3909, this.field3916, var6);
                     System.arraycopy(var1, var6 + var2, this.field3909, 0, var3 - var6);
                  }

                  this.field3916 = (var3 + this.field3916) % this.field3907;
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "16"
   )
   boolean method6217() {
      if(this.field3908) {
         try {
            this.field3911.close();
            if(this.field3912 == null) {
               this.field3912 = new IOException("");
            }
         } catch (IOException var2) {
            if(this.field3912 == null) {
               this.field3912 = new IOException(var2);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void run() {
      do {
         int var1;
         synchronized(this) {
            while(true) {
               if(this.field3912 != null) {
                  return;
               }

               if(this.field3913 <= this.field3916) {
                  var1 = this.field3916 - this.field3913;
               } else {
                  var1 = this.field3907 - this.field3913 + this.field3916;
               }

               if(var1 > 0) {
                  break;
               }

               try {
                  this.field3911.flush();
               } catch (IOException var11) {
                  this.field3912 = var11;
                  return;
               }

               if(this.method6217()) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var12) {
                  ;
               }
            }
         }

         try {
            if(var1 + this.field3913 <= this.field3907) {
               this.field3911.write(this.field3909, this.field3913, var1);
            } else {
               int var7 = this.field3907 - this.field3913;
               this.field3911.write(this.field3909, this.field3913, var7);
               this.field3911.write(this.field3909, 0, var1 - var7);
            }
         } catch (IOException var10) {
            IOException var2 = var10;
            synchronized(this) {
               this.field3912 = var2;
               return;
            }
         }

         synchronized(this) {
            this.field3913 = (var1 + this.field3913) % this.field3907;
         }
      } while(!this.method6217());

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-29981693"
   )
   void method6220() {
      synchronized(this) {
         this.field3908 = true;
         this.notifyAll();
      }

      try {
         this.field3910.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   @ObfuscatedName("fr")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1849962835"
   )
   static final void method6218() {
      int var0 = class149.field1850 * 128 + 64;
      int var1 = class36.field362 * 128 + 64;
      int var2 = class314.method6140(var0, var1, class260.field3393) - class276.field3504;
      if(class85.field912 < var0) {
         class85.field912 = (var0 - class85.field912) * class208.field2887 / 1000 + class85.field912 + class175.field2135;
         if(class85.field912 > var0) {
            class85.field912 = var0;
         }
      }

      if(class85.field912 > var0) {
         class85.field912 -= class208.field2887 * (class85.field912 - var0) / 1000 + class175.field2135;
         if(class85.field912 < var0) {
            class85.field912 = var0;
         }
      }

      if(class229.field3068 < var2) {
         class229.field3068 = (var2 - class229.field3068) * class208.field2887 / 1000 + class229.field3068 + class175.field2135;
         if(class229.field3068 > var2) {
            class229.field3068 = var2;
         }
      }

      if(class229.field3068 > var2) {
         class229.field3068 -= class208.field2887 * (class229.field3068 - var2) / 1000 + class175.field2135;
         if(class229.field3068 < var2) {
            class229.field3068 = var2;
         }
      }

      if(class116.field1324 < var1) {
         class116.field1324 = (var1 - class116.field1324) * class208.field2887 / 1000 + class116.field1324 + class175.field2135;
         if(class116.field1324 > var1) {
            class116.field1324 = var1;
         }
      }

      if(class116.field1324 > var1) {
         class116.field1324 -= class208.field2887 * (class116.field1324 - var1) / 1000 + class175.field2135;
         if(class116.field1324 < var1) {
            class116.field1324 = var1;
         }
      }

      var0 = class159.field1954 * 128 + 64;
      var1 = class265.field3447 * 128 + 64;
      var2 = class314.method6140(var0, var1, class260.field3393) - class43.field484;
      int var3 = var0 - class85.field912;
      int var4 = var2 - class229.field3068;
      int var5 = var1 - class116.field1324;
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var5 * var5));
      int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.949D) & 2047;
      int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.949D) & 2047;
      if(var7 < 128) {
         var7 = 128;
      }

      if(var7 > 383) {
         var7 = 383;
      }

      if(client.field2430 < var7) {
         client.field2430 = (var7 - client.field2430) * class225.field3038 / 1000 + client.field2430 + class12.field129;
         client.onCameraPitchChanged(-1);
         if(client.field2430 > var7) {
            client.field2430 = var7;
            client.onCameraPitchChanged(-1);
         }
      }

      if(client.field2430 > var7) {
         client.field2430 -= class225.field3038 * (client.field2430 - var7) / 1000 + class12.field129;
         client.onCameraPitchChanged(-1);
         if(client.field2430 < var7) {
            client.field2430 = var7;
            client.onCameraPitchChanged(-1);
         }
      }

      int var9 = var8 - class220.field2986;
      if(var9 > 1024) {
         var9 -= 2048;
      }

      if(var9 < -1024) {
         var9 += 2048;
      }

      if(var9 > 0) {
         class220.field2986 = class220.field2986 + class12.field129 + var9 * class225.field3038 / 1000;
         class220.field2986 &= 2047;
      }

      if(var9 < 0) {
         class220.field2986 -= class12.field129 + -var9 * class225.field3038 / 1000;
         class220.field2986 &= 2047;
      }

      int var10 = var8 - class220.field2986;
      if(var10 > 1024) {
         var10 -= 2048;
      }

      if(var10 < -1024) {
         var10 += 2048;
      }

      if(var10 < 0 && var9 > 0 || var10 > 0 && var9 < 0) {
         class220.field2986 = var8;
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "125"
   )
   static final void method6229() {
      short var0 = 256;
      int var1;
      if(class39.field380 > 0) {
         for(var1 = 0; var1 < 256; ++var1) {
            if(class39.field380 > 768) {
               class179.field2462[var1] = class302.method5976(class23.field249[var1], class103.field1147[var1], 1024 - class39.field380);
            } else if(class39.field380 > 256) {
               class179.field2462[var1] = class103.field1147[var1];
            } else {
               class179.field2462[var1] = class302.method5976(class103.field1147[var1], class23.field249[var1], 256 - class39.field380);
            }
         }
      } else if(class39.field385 > 0) {
         for(var1 = 0; var1 < 256; ++var1) {
            if(class39.field385 > 768) {
               class179.field2462[var1] = class302.method5976(class23.field249[var1], class302.field3754[var1], 1024 - class39.field385);
            } else if(class39.field385 > 256) {
               class179.field2462[var1] = class302.field3754[var1];
            } else {
               class179.field2462[var1] = class302.method5976(class302.field3754[var1], class23.field249[var1], 256 - class39.field385);
            }
         }
      } else {
         for(var1 = 0; var1 < 256; ++var1) {
            class179.field2462[var1] = class23.field249[var1];
         }
      }

      class173.method3138(class39.field407, 9, class39.field407 + 128, var0 + 7);
      class39.leftBackground.method213(class39.field407, 0);
      class173.method3151();
      var1 = 0;
      int var2 = class124.field1689.field4010 * 9 + class39.field407;

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      for(var3 = 1; var3 < var0 - 1; ++var3) {
         var4 = class39.field379[var3] * (var0 - var3) / var0;
         var5 = var4 + 22;
         if(var5 < 0) {
            var5 = 0;
         }

         var1 += var5;

         for(var6 = var5; var6 < 128; ++var6) {
            var7 = class31.field293[var1++];
            if(var7 != 0) {
               var8 = var7;
               var9 = 256 - var7;
               var7 = class179.field2462[var7];
               var10 = class124.field1689.field4011[var2];
               class124.field1689.field4011[var2++] = ((var7 & 16711935) * var8 + (var10 & 16711935) * var9 & -16711936) + (var8 * (var7 & 65280) + var9 * (var10 & 65280) & 16711680) >> 8;
            } else {
               ++var2;
            }
         }

         var2 += var5 + class124.field1689.field4010 - 128;
      }

      class173.method3138(class39.field407 + 765 - 128, 9, class39.field407 + 765, var0 + 7);
      class107.rightBackground.method213(class39.field407 + 382, 0);
      class173.method3151();
      var1 = 0;
      var2 = class124.field1689.field4010 * 9 + class39.field407 + 637 + 24;

      for(var3 = 1; var3 < var0 - 1; ++var3) {
         var4 = class39.field379[var3] * (var0 - var3) / var0;
         var5 = 103 - var4;
         var2 += var4;

         for(var6 = 0; var6 < var5; ++var6) {
            var7 = class31.field293[var1++];
            if(var7 != 0) {
               var8 = var7;
               var9 = 256 - var7;
               var7 = class179.field2462[var7];
               var10 = class124.field1689.field4011[var2];
               class124.field1689.field4011[var2++] = (var8 * (var7 & 65280) + var9 * (var10 & 65280) & 16711680) + ((var7 & 16711935) * var8 + (var10 & 16711935) * var9 & -16711936) >> 8;
            } else {
               ++var2;
            }
         }

         var1 += 128 - var5;
         var2 += class124.field1689.field4010 - var5 - var4;
      }

   }
}
