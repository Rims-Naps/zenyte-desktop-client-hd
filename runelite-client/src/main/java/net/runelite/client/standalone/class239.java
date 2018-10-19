package net.runelite.client.standalone;

import java.io.IOException;
import java.io.OutputStream;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
public class class239 implements Runnable {
   @ObfuscatedName("au")
   protected static boolean field2411;
   @ObfuscatedName("f")
   Thread field2406;
   @ObfuscatedName("p")
   boolean field2404;
   @ObfuscatedName("c")
   IOException field2408;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1147346427
   )
   int field2409;
   @ObfuscatedName("l")
   OutputStream field2407;
   @ObfuscatedName("s")
   byte[] field2405;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 886457493
   )
   int field2412;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 421964543
   )
   int field2403;

   class239(OutputStream var1, int var2) {
      this.field2409 = 0;
      this.field2412 = 0;
      this.field2407 = var1;
      this.field2403 = var2 + 1;
      this.field2405 = new byte[this.field2403];
      this.field2406 = new Thread(this);
      this.field2406.setDaemon(true);
      this.field2406.start();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "16"
   )
   boolean method4208() {
      if(this.field2404) {
         try {
            this.field2407.close();
            if(this.field2408 == null) {
               this.field2408 = new IOException("");
            }
         } catch (IOException var2) {
            if(this.field2408 == null) {
               this.field2408 = new IOException(var2);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "([BIIB)V",
      garbageValue = "-1"
   )
   void method4224(byte[] var1, int var2, int var3) throws IOException {
      if(var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            if(this.field2408 != null) {
               throw new IOException(this.field2408.toString());
            } else {
               int var5;
               if(this.field2409 <= this.field2412) {
                  var5 = this.field2403 - this.field2412 + this.field2409 - 1;
               } else {
                  var5 = this.field2409 - this.field2412 - 1;
               }

               if(var5 < var3) {
                  throw new IOException("");
               } else {
                  if(var3 + this.field2412 <= this.field2403) {
                     System.arraycopy(var1, var2, this.field2405, this.field2412, var3);
                  } else {
                     int var6 = this.field2403 - this.field2412;
                     System.arraycopy(var1, var2, this.field2405, this.field2412, var6);
                     System.arraycopy(var1, var6 + var2, this.field2405, 0, var3 - var6);
                  }

                  this.field2412 = (var3 + this.field2412) % this.field2403;
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-29981693"
   )
   void method4211() {
      synchronized(this) {
         this.field2404 = true;
         this.notifyAll();
      }

      try {
         this.field2406.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   public void run() {
      do {
         int var1;
         synchronized(this) {
            while(true) {
               if(this.field2408 != null) {
                  return;
               }

               if(this.field2409 <= this.field2412) {
                  var1 = this.field2412 - this.field2409;
               } else {
                  var1 = this.field2403 - this.field2409 + this.field2412;
               }

               if(var1 > 0) {
                  break;
               }

               try {
                  this.field2407.flush();
               } catch (IOException var11) {
                  this.field2408 = var11;
                  return;
               }

               if(this.method4208()) {
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
            if(var1 + this.field2409 <= this.field2403) {
               this.field2407.write(this.field2405, this.field2409, var1);
            } else {
               int var7 = this.field2403 - this.field2409;
               this.field2407.write(this.field2405, this.field2409, var7);
               this.field2407.write(this.field2405, 0, var1 - var7);
            }
         } catch (IOException var10) {
            IOException var2 = var10;
            synchronized(this) {
               this.field2408 = var2;
               return;
            }
         }

         synchronized(this) {
            this.field2409 = (var1 + this.field2409) % this.field2403;
         }
      } while(!this.method4208());

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "125"
   )
   static final void method4220() {
      short var0 = 256;
      int var1;
      if(class325.field3474 > 0) {
         for(var1 = 0; var1 < 256; ++var1) {
            if(class325.field3474 > 768) {
               class118.field1089[var1] = class113.method1876(class2.field14[var1], class272.field2979[var1], 1024 - class325.field3474);
            } else if(class325.field3474 > 256) {
               class118.field1089[var1] = class272.field2979[var1];
            } else {
               class118.field1089[var1] = class113.method1876(class272.field2979[var1], class2.field14[var1], 256 - class325.field3474);
            }
         }
      } else if(class325.field3479 > 0) {
         for(var1 = 0; var1 < 256; ++var1) {
            if(class325.field3479 > 768) {
               class118.field1089[var1] = class113.method1876(class2.field14[var1], class113.field1063[var1], 1024 - class325.field3479);
            } else if(class325.field3479 > 256) {
               class118.field1089[var1] = class113.field1063[var1];
            } else {
               class118.field1089[var1] = class113.method1876(class113.field1063[var1], class2.field14[var1], 256 - class325.field3479);
            }
         }
      } else {
         for(var1 = 0; var1 < 256; ++var1) {
            class118.field1089[var1] = class2.field14[var1];
         }
      }

      class89.method1532(class325.field3501, 9, class325.field3501 + 128, var0 + 7);
      class325.field3500.method376(class325.field3501, 0);
      class89.method1545();
      var1 = 0;
      int var2 = class146.field1404.field47 * 9 + class325.field3501;

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      for(var3 = 1; var3 < var0 - 1; ++var3) {
         var4 = class325.field3473[var3] * (var0 - var3) / var0;
         var5 = var4 + 22;
         if(var5 < 0) {
            var5 = 0;
         }

         var1 += var5;

         for(var6 = var5; var6 < 128; ++var6) {
            var7 = class48.field365[var1++];
            if(var7 != 0) {
               var8 = var7;
               var9 = 256 - var7;
               var7 = class118.field1089[var7];
               var10 = class146.field1404.field48[var2];
               class146.field1404.field48[var2++] = ((var7 & 16711935) * var8 + (var10 & 16711935) * var9 & -16711936) + (var8 * (var7 & 65280) + var9 * (var10 & 65280) & 16711680) >> 8;
            } else {
               ++var2;
            }
         }

         var2 += var5 + class146.field1404.field47 - 128;
      }

      class89.method1532(class325.field3501 + 765 - 128, 9, class325.field3501 + 765, var0 + 7);
      class275.field3008.method376(class325.field3501 + 382, 0);
      class89.method1545();
      var1 = 0;
      var2 = class146.field1404.field47 * 9 + class325.field3501 + 637 + 24;

      for(var3 = 1; var3 < var0 - 1; ++var3) {
         var4 = class325.field3473[var3] * (var0 - var3) / var0;
         var5 = 103 - var4;
         var2 += var4;

         for(var6 = 0; var6 < var5; ++var6) {
            var7 = class48.field365[var1++];
            if(var7 != 0) {
               var8 = var7;
               var9 = 256 - var7;
               var7 = class118.field1089[var7];
               var10 = class146.field1404.field48[var2];
               class146.field1404.field48[var2++] = (var8 * (var7 & 65280) + var9 * (var10 & 65280) & 16711680) + ((var7 & 16711935) * var8 + (var10 & 16711935) * var9 & -16711936) >> 8;
            } else {
               ++var2;
            }
         }

         var1 += 128 - var5;
         var2 += class146.field1404.field47 - var5 - var4;
      }

   }

   @ObfuscatedName("fr")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1849962835"
   )
   static final void method4209() {
      int var0 = class87.field800 * 128 + 64;
      int var1 = class314.field3380 * 128 + 64;
      int var2 = class7.method85(var0, var1, class315.plane) - class190.field1813;
      if(class83.field738 < var0) {
         class83.field738 = (var0 - class83.field738) * class322.field3447 / 1000 + class83.field738 + class153.field1456;
         if(class83.field738 > var0) {
            class83.field738 = var0;
         }
      }

      if(class83.field738 > var0) {
         class83.field738 -= class322.field3447 * (class83.field738 - var0) / 1000 + class153.field1456;
         if(class83.field738 < var0) {
            class83.field738 = var0;
         }
      }

      if(class296.field3191 < var2) {
         class296.field3191 = (var2 - class296.field3191) * class322.field3447 / 1000 + class296.field3191 + class153.field1456;
         if(class296.field3191 > var2) {
            class296.field3191 = var2;
         }
      }

      if(class296.field3191 > var2) {
         class296.field3191 -= class322.field3447 * (class296.field3191 - var2) / 1000 + class153.field1456;
         if(class296.field3191 < var2) {
            class296.field3191 = var2;
         }
      }

      if(class50.field375 < var1) {
         class50.field375 = (var1 - class50.field375) * class322.field3447 / 1000 + class50.field375 + class153.field1456;
         if(class50.field375 > var1) {
            class50.field375 = var1;
         }
      }

      if(class50.field375 > var1) {
         class50.field375 -= class322.field3447 * (class50.field375 - var1) / 1000 + class153.field1456;
         if(class50.field375 < var1) {
            class50.field375 = var1;
         }
      }

      var0 = class328.field3528 * 128 + 64;
      var1 = class168.field1557 * 128 + 64;
      var2 = class7.method85(var0, var1, class315.plane) - class227.field2235;
      int var3 = var0 - class83.field738;
      int var4 = var2 - class296.field3191;
      int var5 = var1 - class50.field375;
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var5 * var5));
      int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.949D) & 2047;
      int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.949D) & 2047;
      if(var7 < 128) {
         var7 = 128;
      }

      if(var7 > 383) {
         var7 = 383;
      }

      if(client.field4009 < var7) {
         client.field4009 = (var7 - client.field4009) * class192.field1839 / 1000 + client.field4009 + class279.field3026;
         client.onCameraPitchChanged(-1);
         if(client.field4009 > var7) {
            client.field4009 = var7;
            client.onCameraPitchChanged(-1);
         }
      }

      if(client.field4009 > var7) {
         client.field4009 -= class192.field1839 * (client.field4009 - var7) / 1000 + class279.field3026;
         client.onCameraPitchChanged(-1);
         if(client.field4009 < var7) {
            client.field4009 = var7;
            client.onCameraPitchChanged(-1);
         }
      }

      int var9 = var8 - class61.field469;
      if(var9 > 1024) {
         var9 -= 2048;
      }

      if(var9 < -1024) {
         var9 += 2048;
      }

      if(var9 > 0) {
         class61.field469 = class61.field469 + class279.field3026 + var9 * class192.field1839 / 1000;
         class61.field469 &= 2047;
      }

      if(var9 < 0) {
         class61.field469 -= class279.field3026 + -var9 * class192.field1839 / 1000;
         class61.field469 &= 2047;
      }

      int var10 = var8 - class61.field469;
      if(var10 > 1024) {
         var10 -= 2048;
      }

      if(var10 < -1024) {
         var10 += 2048;
      }

      if(var10 < 0 && var9 > 0 || var10 > 0 && var9 < 0) {
         class61.field469 = var8;
      }

   }
}
