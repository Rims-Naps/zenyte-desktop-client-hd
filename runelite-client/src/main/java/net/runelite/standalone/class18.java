package net.runelite.standalone;

import java.io.EOFException;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public class class18 {
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      longValue = -5977887878615074529L
   )
   long field219;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -555996177
   )
   int field218;
   @ObfuscatedName("l")
   byte[] field213;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1435131349
   )
   int field217;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lda;"
   )
   class283 field221;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      longValue = 3487748473826920097L
   )
   long field220;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      longValue = -7146423913003863787L
   )
   long field216;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      longValue = 8966130704572477473L
   )
   long field212;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      longValue = -5926945327877745361L
   )
   long field215;
   @ObfuscatedName("e")
   byte[] field222;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      longValue = -234688271656307923L
   )
   long field214;

   @ObfuscatedSignature(
      signature = "(Lda;II)V"
   )
   public class18(class283 var1, int var2, int var3) throws IOException {
      this.field214 = -1L;
      this.field215 = -1L;
      this.field218 = 0;
      this.field221 = var1;
      this.field216 = this.field220 = var1.method5445();
      this.field213 = new byte[var2];
      this.field222 = new byte[var3];
      this.field219 = 0L;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "46416090"
   )
   public void method376(byte[] var1, int var2, int var3) throws IOException {
      try {
         if((long)var3 + this.field219 > this.field216) {
            this.field216 = this.field219 + (long)var3;
         }

         if(-1L != this.field215 && (this.field219 < this.field215 || this.field219 > this.field215 + (long)this.field218)) {
            this.method377();
         }

         if(this.field215 != -1L && this.field219 + (long)var3 > this.field215 + (long)this.field222.length) {
            int var4 = (int)((long)this.field222.length - (this.field219 - this.field215));
            System.arraycopy(var1, var2, this.field222, (int)(this.field219 - this.field215), var4);
            this.field219 += (long)var4;
            var2 += var4;
            var3 -= var4;
            this.field218 = this.field222.length;
            this.method377();
         }

         if(var3 <= this.field222.length) {
            if(var3 > 0) {
               if(this.field215 == -1L) {
                  this.field215 = this.field219;
               }

               System.arraycopy(var1, var2, this.field222, (int)(this.field219 - this.field215), var3);
               this.field219 += (long)var3;
               if(this.field219 - this.field215 > (long)this.field218) {
                  this.field218 = (int)(this.field219 - this.field215);
               }

            }
         } else {
            if(this.field212 != this.field219) {
               this.field221.method5441(this.field219);
               this.field212 = this.field219;
            }

            this.field221.method5442(var1, var2, var3);
            this.field212 += (long)var3;
            if(this.field212 > this.field220) {
               this.field220 = this.field212;
            }

            long var9 = -1L;
            long var6 = -1L;
            if(this.field219 >= this.field214 && this.field219 < (long)this.field217 + this.field214) {
               var9 = this.field219;
            } else if(this.field214 >= this.field219 && this.field214 < this.field219 + (long)var3) {
               var9 = this.field214;
            }

            if((long)var3 + this.field219 > this.field214 && (long)var3 + this.field219 <= (long)this.field217 + this.field214) {
               var6 = this.field219 + (long)var3;
            } else if(this.field214 + (long)this.field217 > this.field219 && this.field214 + (long)this.field217 <= (long)var3 + this.field219) {
               var6 = (long)this.field217 + this.field214;
            }

            if(var9 > -1L && var6 > var9) {
               int var8 = (int)(var6 - var9);
               System.arraycopy(var1, (int)(var9 + (long)var2 - this.field219), this.field213, (int)(var9 - this.field214), var8);
            }

            this.field219 += (long)var3;
         }
      } catch (IOException var12) {
         this.field212 = -1L;
         throw var12;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-366827332"
   )
   void method375() throws IOException {
      this.field217 = 0;
      if(this.field219 != this.field212) {
         this.field221.method5441(this.field219);
         this.field212 = this.field219;
      }

      int var1;
      for(this.field214 = this.field219; this.field217 < this.field213.length; this.field217 += var1) {
         var1 = this.field221.method5446(this.field213, this.field217, this.field213.length - this.field217);
         if(var1 == -1) {
            break;
         }

         this.field212 += (long)var1;
      }

   }

   @ObfuscatedName("l")
   public void method387(long var1) throws IOException {
      if(var1 < 0L) {
         throw new IOException("");
      } else {
         this.field219 = var1;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "1663827175"
   )
   public void method373(byte[] var1) throws IOException {
      this.method374(var1, 0, var1.length);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-39"
   )
   public void method370() throws IOException {
      this.method377();
      this.field221.method5454();
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1779914537"
   )
   void method377() throws IOException {
      if(-1L != this.field215) {
         if(this.field215 != this.field212) {
            this.field221.method5441(this.field215);
            this.field212 = this.field215;
         }

         this.field221.method5442(this.field222, 0, this.field218);
         this.field212 += (long)(this.field218 * -911973617) * -555996177L;
         if(this.field212 > this.field220) {
            this.field220 = this.field212;
         }

         long var1 = -1L;
         long var3 = -1L;
         if(this.field215 >= this.field214 && this.field215 < this.field214 + (long)this.field217) {
            var1 = this.field215;
         } else if(this.field214 >= this.field215 && this.field214 < (long)this.field218 + this.field215) {
            var1 = this.field214;
         }

         if((long)this.field218 + this.field215 > this.field214 && (long)this.field218 + this.field215 <= (long)this.field217 + this.field214) {
            var3 = (long)this.field218 + this.field215;
         } else if(this.field214 + (long)this.field217 > this.field215 && this.field214 + (long)this.field217 <= (long)this.field218 + this.field215) {
            var3 = (long)this.field217 + this.field214;
         }

         if(var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.field222, (int)(var1 - this.field215), this.field213, (int)(var1 - this.field214), var5);
         }

         this.field215 = -1L;
         this.field218 = 0;
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "([BIIS)V",
      garbageValue = "-1617"
   )
   public void method374(byte[] var1, int var2, int var3) throws IOException {
      try {
         if(var3 + var2 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
         }

         if(-1L != this.field215 && this.field219 >= this.field215 && (long)var3 + this.field219 <= (long)this.field218 + this.field215) {
            System.arraycopy(this.field222, (int)(this.field219 - this.field215), var1, var2, var3);
            this.field219 += (long)var3;
            return;
         }

         long var4 = this.field219;
         int var7 = var3;
         int var8;
         if(this.field219 >= this.field214 && this.field219 < (long)this.field217 + this.field214) {
            var8 = (int)((long)this.field217 - (this.field219 - this.field214));
            if(var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.field213, (int)(this.field219 - this.field214), var1, var2, var8);
            this.field219 += (long)var8;
            var2 += var8;
            var3 -= var8;
         }

         if(var3 > this.field213.length) {
            this.field221.method5441(this.field219);

            for(this.field212 = this.field219; var3 > 0; var3 -= var8) {
               var8 = this.field221.method5446(var1, var2, var3);
               if(var8 == -1) {
                  break;
               }

               this.field212 += (long)var8;
               this.field219 += (long)var8;
               var2 += var8;
            }
         } else if(var3 > 0) {
            this.method375();
            var8 = var3;
            if(var3 > this.field217) {
               var8 = this.field217;
            }

            System.arraycopy(this.field213, 0, var1, var2, var8);
            var2 += var8;
            var3 -= var8;
            this.field219 += (long)var8;
         }

         if(-1L != this.field215) {
            if(this.field215 > this.field219 && var3 > 0) {
               var8 = var2 + (int)(this.field215 - this.field219);
               if(var8 > var3 + var2) {
                  var8 = var3 + var2;
               }

               while(var2 < var8) {
                  var1[var2++] = 0;
                  --var3;
                  ++this.field219;
               }
            }

            long var13 = -1L;
            long var10 = -1L;
            if(this.field215 >= var4 && this.field215 < var4 + (long)var7) {
               var13 = this.field215;
            } else if(var4 >= this.field215 && var4 < (long)this.field218 + this.field215) {
               var13 = var4;
            }

            if((long)this.field218 + this.field215 > var4 && this.field215 + (long)this.field218 <= var4 + (long)var7) {
               var10 = (long)this.field218 + this.field215;
            } else if(var4 + (long)var7 > this.field215 && (long)var7 + var4 <= (long)this.field218 + this.field215) {
               var10 = (long)var7 + var4;
            }

            if(var13 > -1L && var10 > var13) {
               int var12 = (int)(var10 - var13);
               System.arraycopy(this.field222, (int)(var13 - this.field215), var1, (int)(var13 - var4) + var2, var12);
               if(var10 > this.field219) {
                  var3 = (int)((long)var3 - (var10 - this.field219));
                  this.field219 = var10;
               }
            }
         }
      } catch (IOException var16) {
         this.field212 = -1L;
         throw var16;
      }

      if(var3 > 0) {
         throw new EOFException();
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)J",
      garbageValue = "-16"
   )
   public long method372() {
      return this.field216;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;Lik;I)V",
      garbageValue = "1388502952"
   )
   public static void method382(Js5Index var0, Js5Index var1) {
      class244.field3280 = var0;
      class244.field3276 = var1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   public static void method397() {
      class71.field811.method1816();
      class71.field812.method1816();
   }
}
