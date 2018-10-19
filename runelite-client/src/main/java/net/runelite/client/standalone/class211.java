package net.runelite.client.standalone;

import java.io.EOFException;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public class class211 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lda;"
   )
   class38 field2052;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      longValue = -7146423913003863787L
   )
   long field2047;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      longValue = 3487748473826920097L
   )
   long field2051;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      longValue = -5977887878615074529L
   )
   long field2050;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -555996177
   )
   int field2049;
   @ObfuscatedName("e")
   byte[] field2053;
   @ObfuscatedName("l")
   byte[] field2044;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1435131349
   )
   int field2048;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      longValue = -5926945327877745361L
   )
   long field2046;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      longValue = -234688271656307923L
   )
   long field2045;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      longValue = 8966130704572477473L
   )
   long field2043;

   @ObfuscatedSignature(
      signature = "(Lda;II)V"
   )
   public class211(class38 var1, int var2, int var3) throws IOException {
      this.field2045 = -1L;
      this.field2046 = -1L;
      this.field2049 = 0;
      this.field2052 = var1;
      this.field2047 = this.field2051 = var1.method600();
      this.field2044 = new byte[var2];
      this.field2053 = new byte[var3];
      this.field2050 = 0L;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-39"
   )
   public void method3713() throws IOException {
      this.method3720();
      this.field2052.method609();
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1906238389"
   )
   void method3720() throws IOException {
      if(-1L != this.field2046) {
         if(this.field2046 != this.field2043) {
            this.field2052.method596(this.field2046);
            this.field2043 = this.field2046;
         }

         this.field2052.method597(this.field2053, 0, this.field2049);
         this.field2043 += (long)(this.field2049 * -911973617) * -555996177L;
         if(this.field2043 > this.field2051) {
            this.field2051 = this.field2043;
         }

         long var1 = -1L;
         long var3 = -1L;
         if(this.field2046 >= this.field2045 && this.field2046 < this.field2045 + (long)this.field2048) {
            var1 = this.field2046;
         } else if(this.field2045 >= this.field2046 && this.field2045 < (long)this.field2049 + this.field2046) {
            var1 = this.field2045;
         }

         if((long)this.field2049 + this.field2046 > this.field2045 && (long)this.field2049 + this.field2046 <= (long)this.field2048 + this.field2045) {
            var3 = (long)this.field2049 + this.field2046;
         } else if(this.field2045 + (long)this.field2048 > this.field2046 && this.field2045 + (long)this.field2048 <= (long)this.field2049 + this.field2046) {
            var3 = (long)this.field2048 + this.field2045;
         }

         if(var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.field2053, (int)(var1 - this.field2046), this.field2044, (int)(var1 - this.field2045), var5);
         }

         this.field2046 = -1L;
         this.field2049 = 0;
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "46416090"
   )
   public void method3719(byte[] var1, int var2, int var3) throws IOException {
      try {
         if((long)var3 + this.field2050 > this.field2047) {
            this.field2047 = this.field2050 + (long)var3;
         }

         if(-1L != this.field2046 && (this.field2050 < this.field2046 || this.field2050 > this.field2046 + (long)this.field2049)) {
            this.method3720();
         }

         if(this.field2046 != -1L && this.field2050 + (long)var3 > this.field2046 + (long)this.field2053.length) {
            int var4 = (int)((long)this.field2053.length - (this.field2050 - this.field2046));
            System.arraycopy(var1, var2, this.field2053, (int)(this.field2050 - this.field2046), var4);
            this.field2050 += (long)var4;
            var2 += var4;
            var3 -= var4;
            this.field2049 = this.field2053.length;
            this.method3720();
         }

         if(var3 <= this.field2053.length) {
            if(var3 > 0) {
               if(this.field2046 == -1L) {
                  this.field2046 = this.field2050;
               }

               System.arraycopy(var1, var2, this.field2053, (int)(this.field2050 - this.field2046), var3);
               this.field2050 += (long)var3;
               if(this.field2050 - this.field2046 > (long)this.field2049) {
                  this.field2049 = (int)(this.field2050 - this.field2046);
               }

            }
         } else {
            if(this.field2043 != this.field2050) {
               this.field2052.method596(this.field2050);
               this.field2043 = this.field2050;
            }

            this.field2052.method597(var1, var2, var3);
            this.field2043 += (long)var3;
            if(this.field2043 > this.field2051) {
               this.field2051 = this.field2043;
            }

            long var9 = -1L;
            long var6 = -1L;
            if(this.field2050 >= this.field2045 && this.field2050 < (long)this.field2048 + this.field2045) {
               var9 = this.field2050;
            } else if(this.field2045 >= this.field2050 && this.field2045 < this.field2050 + (long)var3) {
               var9 = this.field2045;
            }

            if((long)var3 + this.field2050 > this.field2045 && (long)var3 + this.field2050 <= (long)this.field2048 + this.field2045) {
               var6 = this.field2050 + (long)var3;
            } else if(this.field2045 + (long)this.field2048 > this.field2050 && this.field2045 + (long)this.field2048 <= (long)var3 + this.field2050) {
               var6 = (long)this.field2048 + this.field2045;
            }

            if(var9 > -1L && var6 > var9) {
               int var8 = (int)(var6 - var9);
               System.arraycopy(var1, (int)(var9 + (long)var2 - this.field2050), this.field2044, (int)(var9 - this.field2045), var8);
            }

            this.field2050 += (long)var3;
         }
      } catch (IOException var12) {
         this.field2043 = -1L;
         throw var12;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-366827332"
   )
   void method3718() throws IOException {
      this.field2048 = 0;
      if(this.field2050 != this.field2043) {
         this.field2052.method596(this.field2050);
         this.field2043 = this.field2050;
      }

      int var1;
      for(this.field2045 = this.field2050; this.field2048 < this.field2044.length; this.field2048 += var1) {
         var1 = this.field2052.method601(this.field2044, this.field2048, this.field2044.length - this.field2048);
         if(var1 == -1) {
            break;
         }

         this.field2043 += (long)var1;
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "([BIIS)V",
      garbageValue = "-1617"
   )
   public void method3717(byte[] var1, int var2, int var3) throws IOException {
      try {
         if(var3 + var2 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
         }

         if(-1L != this.field2046 && this.field2050 >= this.field2046 && (long)var3 + this.field2050 <= (long)this.field2049 + this.field2046) {
            System.arraycopy(this.field2053, (int)(this.field2050 - this.field2046), var1, var2, var3);
            this.field2050 += (long)var3;
            return;
         }

         long var4 = this.field2050;
         int var7 = var3;
         int var8;
         if(this.field2050 >= this.field2045 && this.field2050 < (long)this.field2048 + this.field2045) {
            var8 = (int)((long)this.field2048 - (this.field2050 - this.field2045));
            if(var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.field2044, (int)(this.field2050 - this.field2045), var1, var2, var8);
            this.field2050 += (long)var8;
            var2 += var8;
            var3 -= var8;
         }

         if(var3 > this.field2044.length) {
            this.field2052.method596(this.field2050);

            for(this.field2043 = this.field2050; var3 > 0; var3 -= var8) {
               var8 = this.field2052.method601(var1, var2, var3);
               if(var8 == -1) {
                  break;
               }

               this.field2043 += (long)var8;
               this.field2050 += (long)var8;
               var2 += var8;
            }
         } else if(var3 > 0) {
            this.method3718();
            var8 = var3;
            if(var3 > this.field2048) {
               var8 = this.field2048;
            }

            System.arraycopy(this.field2044, 0, var1, var2, var8);
            var2 += var8;
            var3 -= var8;
            this.field2050 += (long)var8;
         }

         if(-1L != this.field2046) {
            if(this.field2046 > this.field2050 && var3 > 0) {
               var8 = var2 + (int)(this.field2046 - this.field2050);
               if(var8 > var3 + var2) {
                  var8 = var3 + var2;
               }

               while(var2 < var8) {
                  var1[var2++] = 0;
                  --var3;
                  ++this.field2050;
               }
            }

            long var13 = -1L;
            long var10 = -1L;
            if(this.field2046 >= var4 && this.field2046 < var4 + (long)var7) {
               var13 = this.field2046;
            } else if(var4 >= this.field2046 && var4 < (long)this.field2049 + this.field2046) {
               var13 = var4;
            }

            if((long)this.field2049 + this.field2046 > var4 && this.field2046 + (long)this.field2049 <= var4 + (long)var7) {
               var10 = (long)this.field2049 + this.field2046;
            } else if(var4 + (long)var7 > this.field2046 && (long)var7 + var4 <= (long)this.field2049 + this.field2046) {
               var10 = (long)var7 + var4;
            }

            if(var13 > -1L && var10 > var13) {
               int var12 = (int)(var10 - var13);
               System.arraycopy(this.field2053, (int)(var13 - this.field2046), var1, (int)(var13 - var4) + var2, var12);
               if(var10 > this.field2050) {
                  var3 = (int)((long)var3 - (var10 - this.field2050));
                  this.field2050 = var10;
               }
            }
         }
      } catch (IOException var16) {
         this.field2043 = -1L;
         throw var16;
      }

      if(var3 > 0) {
         throw new EOFException();
      }
   }

   @ObfuscatedName("l")
   public void method3730(long var1) throws IOException {
      if(var1 < 0L) {
         throw new IOException("");
      } else {
         this.field2050 = var1;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "1663827175"
   )
   public void method3716(byte[] var1) throws IOException {
      this.method3717(var1, 0, var1.length);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)J",
      garbageValue = "-16"
   )
   public long method3715() {
      return this.field2047;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;Lik;I)V",
      garbageValue = "1388502952"
   )
   public static void method3725(class148 var0, class148 var1) {
      class14.field125 = var0;
      class14.field121 = var1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   public static void method3740() {
      class90.field870.method2271();
      class90.field871.method2271();
   }
}
