package net.runelite.standalone;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
public class class282 implements Runnable {
   @ObfuscatedName("c")
   IOException field3554;
   @ObfuscatedName("l")
   InputStream field3553;
   @ObfuscatedName("s")
   byte[] field3551;
   @ObfuscatedName("f")
   Thread field3550;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 448245065
   )
   int field3549;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 2109164139
   )
   int field3552;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1570544241
   )
   int field3548;

   class282(InputStream var1, int var2) {
      this.field3552 = 0;
      this.field3549 = 0;
      this.field3553 = var1;
      this.field3548 = var2 + 1;
      this.field3551 = new byte[this.field3548];
      this.field3550 = new Thread(this);
      this.field3550.setDaemon(true);
      this.field3550.start();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1954803948"
   )
   int method5438() throws IOException {
      synchronized(this) {
         int var2;
         if(this.field3552 <= this.field3549) {
            var2 = this.field3549 - this.field3552;
         } else {
            var2 = this.field3548 - this.field3552 + this.field3549;
         }

         if(var2 <= 0 && this.field3554 != null) {
            throw new IOException(this.field3554.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "([BIIB)I",
      garbageValue = "37"
   )
   int method5419(byte[] var1, int var2, int var3) throws IOException {
      if(var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            int var5;
            if(this.field3552 <= this.field3549) {
               var5 = this.field3549 - this.field3552;
            } else {
               var5 = this.field3548 - this.field3552 + this.field3549;
            }

            if(var3 > var5) {
               var3 = var5;
            }

            if(var3 == 0 && this.field3554 != null) {
               throw new IOException(this.field3554.toString());
            } else {
               if(var3 + this.field3552 <= this.field3548) {
                  System.arraycopy(this.field3551, this.field3552, var1, var2, var3);
               } else {
                  int var6 = this.field3548 - this.field3552;
                  System.arraycopy(this.field3551, this.field3552, var1, var2, var6);
                  System.arraycopy(this.field3551, 0, var1, var6 + var2, var3 - var6);
               }

               this.field3552 = (var3 + this.field3552) % this.field3548;
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "117"
   )
   boolean method5420(int var1) throws IOException {
      if(var1 == 0) {
         return true;
      } else if(var1 > 0 && var1 < this.field3548) {
         synchronized(this) {
            int var3;
            if(this.field3552 <= this.field3549) {
               var3 = this.field3549 - this.field3552;
            } else {
               var3 = this.field3548 - this.field3552 + this.field3549;
            }

            if(var3 < var1) {
               if(this.field3554 != null) {
                  throw new IOException(this.field3554.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   public void run() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if(this.field3554 != null) {
                  return;
               }

               if(this.field3552 == 0) {
                  var1 = this.field3548 - this.field3549 - 1;
               } else if(this.field3552 <= this.field3549) {
                  var1 = this.field3548 - this.field3549;
               } else {
                  var1 = this.field3552 - this.field3549 - 1;
               }

               if(var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var10) {
                  ;
               }
            }
         }

         int var7;
         try {
            var7 = this.field3553.read(this.field3551, this.field3549, var1);
            if(var7 == -1) {
               throw new EOFException();
            }
         } catch (IOException var11) {
            IOException var3 = var11;
            synchronized(this) {
               this.field3554 = var3;
               return;
            }
         }

         synchronized(this) {
            this.field3549 = (var7 + this.field3549) % this.field3548;
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "121"
   )
   void method5428() {
      synchronized(this) {
         if(this.field3554 == null) {
            this.field3554 = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.field3550.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1756235687"
   )
   int method5418() throws IOException {
      synchronized(this) {
         if(this.field3549 == this.field3552) {
            if(this.field3554 != null) {
               throw new IOException(this.field3554.toString());
            } else {
               return -1;
            }
         } else {
            int var2 = this.field3551[this.field3552] & 255;
            this.field3552 = (this.field3552 + 1) % this.field3548;
            this.notifyAll();
            return var2;
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIIZIB)J",
      garbageValue = "67"
   )
   public static long method5439(int var0, int var1, int var2, boolean var3, int var4) {
      long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
      if(var3) {
         var5 |= 65536L;
      }

      return var5;
   }
}
