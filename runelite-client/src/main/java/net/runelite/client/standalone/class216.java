package net.runelite.client.standalone;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
public class class216 implements Runnable {
   @ObfuscatedName("f")
   Thread field2077;
   @ObfuscatedName("c")
   IOException field2081;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 2109164139
   )
   int field2079;
   @ObfuscatedName("l")
   InputStream field2080;
   @ObfuscatedName("s")
   byte[] field2078;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 448245065
   )
   int field2076;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1570544241
   )
   int field2075;

   class216(InputStream var1, int var2) {
      this.field2079 = 0;
      this.field2076 = 0;
      this.field2080 = var1;
      this.field2075 = var2 + 1;
      this.field2078 = new byte[this.field2075];
      this.field2077 = new Thread(this);
      this.field2077.setDaemon(true);
      this.field2077.start();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "117"
   )
   boolean method3799(int var1) throws IOException {
      if(var1 == 0) {
         return true;
      } else if(var1 > 0 && var1 < this.field2075) {
         synchronized(this) {
            int var3;
            if(this.field2079 <= this.field2076) {
               var3 = this.field2076 - this.field2079;
            } else {
               var3 = this.field2075 - this.field2079 + this.field2076;
            }

            if(var3 < var1) {
               if(this.field2081 != null) {
                  throw new IOException(this.field2081.toString());
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

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "121"
   )
   void method3807() {
      synchronized(this) {
         if(this.field2081 == null) {
            this.field2081 = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.field2077.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1954803948"
   )
   int method3817() throws IOException {
      synchronized(this) {
         int var2;
         if(this.field2079 <= this.field2076) {
            var2 = this.field2076 - this.field2079;
         } else {
            var2 = this.field2075 - this.field2079 + this.field2076;
         }

         if(var2 <= 0 && this.field2081 != null) {
            throw new IOException(this.field2081.toString());
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
   int method3798(byte[] var1, int var2, int var3) throws IOException {
      if(var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            int var5;
            if(this.field2079 <= this.field2076) {
               var5 = this.field2076 - this.field2079;
            } else {
               var5 = this.field2075 - this.field2079 + this.field2076;
            }

            if(var3 > var5) {
               var3 = var5;
            }

            if(var3 == 0 && this.field2081 != null) {
               throw new IOException(this.field2081.toString());
            } else {
               if(var3 + this.field2079 <= this.field2075) {
                  System.arraycopy(this.field2078, this.field2079, var1, var2, var3);
               } else {
                  int var6 = this.field2075 - this.field2079;
                  System.arraycopy(this.field2078, this.field2079, var1, var2, var6);
                  System.arraycopy(this.field2078, 0, var1, var6 + var2, var3 - var6);
               }

               this.field2079 = (var3 + this.field2079) % this.field2075;
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1756235687"
   )
   int method3797() throws IOException {
      synchronized(this) {
         if(this.field2076 == this.field2079) {
            if(this.field2081 != null) {
               throw new IOException(this.field2081.toString());
            } else {
               return -1;
            }
         } else {
            int var2 = this.field2078[this.field2079] & 255;
            this.field2079 = (this.field2079 + 1) % this.field2075;
            this.notifyAll();
            return var2;
         }
      }
   }

   public void run() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if(this.field2081 != null) {
                  return;
               }

               if(this.field2079 == 0) {
                  var1 = this.field2075 - this.field2076 - 1;
               } else if(this.field2079 <= this.field2076) {
                  var1 = this.field2075 - this.field2076;
               } else {
                  var1 = this.field2079 - this.field2076 - 1;
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
            var7 = this.field2080.read(this.field2078, this.field2076, var1);
            if(var7 == -1) {
               throw new EOFException();
            }
         } catch (IOException var11) {
            IOException var3 = var11;
            synchronized(this) {
               this.field2081 = var3;
               return;
            }
         }

         synchronized(this) {
            this.field2076 = (var7 + this.field2076) % this.field2075;
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIIZIB)J",
      garbageValue = "67"
   )
   public static long method3818(int var0, int var1, int var2, boolean var3, int var4) {
      long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
      if(var3) {
         var5 |= 65536L;
      }

      return var5;
   }
}
