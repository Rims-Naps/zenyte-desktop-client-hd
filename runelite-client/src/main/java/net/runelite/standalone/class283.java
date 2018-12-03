package net.runelite.standalone;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFileOnDisk;

@ObfuscatedName("da")
public final class class283 implements RSFileOnDisk {
   @ObfuscatedName("jx")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   static class187 field3562;
   @ObfuscatedName("fk")
   @ObfuscatedGetter(
      longValue = 204967730347306863L
   )
   static long field3563;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      longValue = -471004502122884367L
   )
   long field3557;
   @ObfuscatedName("f")
   RandomAccessFile field3561;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      longValue = -8631779964323264085L
   )
   long field3558;

   public class283(File var1, String var2, long var3) throws IOException {
      if(-1L == var3) {
         var3 = Long.MAX_VALUE;
      }

      if(var1.length() >= var3) {
         var1.delete();
      }

      this.field3561 = new RandomAccessFile(var1, var2);
      this.field3557 = var3;
      this.field3558 = 0L;
      int var5 = this.field3561.read();
      if(var5 != -1 && !var2.equals("r")) {
         this.field3561.seek(0L);
         this.field3561.write(var5);
      }

      this.field3561.seek(0L);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "([BIIS)I",
      garbageValue = "1264"
   )
   public final int method5446(byte[] var1, int var2, int var3) throws IOException {
      int var4 = this.field3561.read(var1, var2, var3);
      if(var4 > 0) {
         this.field3558 += (long)var4;
      }

      return var4;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "-622466464"
   )
   public final void method5442(byte[] var1, int var2, int var3) throws IOException {
      if(this.field3558 + (long)var3 > this.field3557) {
         this.field3561.seek(this.field3557 + 1L);
         this.field3561.write(1);
         throw new EOFException();
      } else {
         this.field3561.write(var1, var2, var3);
         this.field3558 += (long)var3;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-2117213601"
   )
   public final void method5444(boolean var1) throws IOException {
      if(this.field3561 != null) {
         if(var1) {
            try {
               this.field3561.getFD().sync();
            } catch (SyncFailedException var3) {
               ;
            }
         }

         this.field3561.close();
         this.field3561 = null;
      }

   }

   @ObfuscatedName("f")
   final void method5441(long var1) throws IOException {
      this.field3561.seek(var1);
      this.field3558 = var1;
   }

   protected void finalize() throws Throwable {
      if(this.field3561 != null) {
         System.out.println("");
         this.method5454();
      }

   }

   public RandomAccessFile getFile() {
      return this.field3561;
   }

   public long getLength() {
      return this.field3557;
   }

   public long getPosition() {
      return this.field3558;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)J",
      garbageValue = "-71"
   )
   public final long method5445() throws IOException {
      return this.field3561.length();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-301088923"
   )
   public final void method5454() throws IOException {
      this.method5444(false);
   }

   @ObfuscatedName("il")
   @ObfuscatedSignature(
      signature = "(Lhw;III)V",
      garbageValue = "169167610"
   )
   static final void method5466(class187 var0, int var1, int var2) {
      if(client.field2326 == null && !client.field2360) {
         if(var0 != null) {
            class187 var5 = var0;
            int var7 = class203.method4026(var0);
            int var6 = var7 >> 17 & 7;
            int var8 = var6;
            class187 var4;
            int var9;
            if(var6 == 0) {
               var4 = null;
            } else {
               var9 = 0;

               while(true) {
                  if(var9 >= var8) {
                     var4 = var5;
                     break;
                  }

                  var5 = class48.method1047(var5.field2577);
                  if(var5 == null) {
                     var4 = null;
                     break;
                  }

                  ++var9;
               }
            }

            class187 var10 = var4;
            if(var4 == null) {
               var10 = var0.field2639;
            }

            if(var10 != null) {
               client.field2326 = var0;
               var5 = var0;
               var7 = class203.method4026(var0);
               var6 = var7 >> 17 & 7;
               var8 = var6;
               if(var6 == 0) {
                  var4 = null;
               } else {
                  var9 = 0;

                  while(true) {
                     if(var9 >= var8) {
                        var4 = var5;
                        break;
                     }

                     var5 = class48.method1047(var5.field2577);
                     if(var5 == null) {
                        var4 = null;
                        break;
                     }

                     ++var9;
                  }
               }

               var10 = var4;
               if(var4 == null) {
                  var10 = var0.field2639;
               }

               client.field2335 = var10;
               client.field2304 = var1;
               client.field2307 = var2;
               class158.field1945 = 0;
               client.field2337 = false;
               client.draggingWidgetChanged(-1);
               int var11 = class195.method3934();
               if(var11 != -1) {
                  class322.field3939 = new class285();
                  class322.field3939.field3567 = client.field2291[var11];
                  class322.field3939.field3574 = client.field2292[var11];
                  class322.field3939.field3569 = client.field2293[var11];
                  class322.field3939.field3570 = client.field2368[var11];
                  class322.field3939.field3572 = client.field2295[var11];
               }

               return;
            }
         }

      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Ljd;",
      garbageValue = "1777378117"
   )
   public static class71 method5464(int var0) {
      class71 var1 = (class71)class71.field811.method1813((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class71.field825.method4398(13, var0, 479571266);
         var1 = new class71();
         var1.field820 = var0;
         if(var2 != null) {
            var1.method1527(new Buffer(var2));
         }

         class71.field811.method1820(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
      garbageValue = "13401829"
   )
   public static String method5468(CharSequence var0) {
      String var1 = class124.method2230(class329.method6326(var0));
      if(var1 == null) {
         var1 = "";
      }

      return var1;
   }
}
