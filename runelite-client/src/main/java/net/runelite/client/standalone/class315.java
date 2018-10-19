package net.runelite.client.standalone;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class class315 extends class303 {
   @ObfuscatedName("r")
   public static byte[][][] field3388;
   @ObfuscatedName("jj")
   @ObfuscatedGetter(
      intValue = -1565271221
   )
   static int plane;
   @ObfuscatedName("f")
   long[] field3382;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 372289911
   )
   int field3386;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -999514235
   )
   int field3383;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      longValue = -7820254455231475421L
   )
   long field3385;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 56780157
   )
   int field3390;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 2113850027
   )
   int field3384;

   public class315() {
      this.field3382 = new long[10];
      this.field3383 = 256;
      this.field3384 = 1;
      this.field3386 = 0;
      this.field3385 = class234.method4170();

      for(int var1 = 0; var1 < 10; ++var1) {
         this.field3382[var1] = this.field3385;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1412174677"
   )
   public void vmethod5547() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.field3382[var1] = 0L;
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-673206051"
   )
   public int vmethod5544(int var1, int var2) {
      int var3 = this.field3383;
      int var4 = this.field3384;
      this.field3383 = 300;
      this.field3384 = 1;
      this.field3385 = class234.method4170();
      if(0L == this.field3382[this.field3390]) {
         this.field3383 = var3;
         this.field3384 = var4;
      } else if(this.field3385 > this.field3382[this.field3390]) {
         this.field3383 = (int)((long)(var1 * 2560) / (this.field3385 - this.field3382[this.field3390]));
      }

      if(this.field3383 < 25) {
         this.field3383 = 25;
      }

      if(this.field3383 > 256) {
         this.field3383 = 256;
         this.field3384 = (int)((long)var1 - (this.field3385 - this.field3382[this.field3390]) / 10L);
      }

      if(this.field3384 > var1) {
         this.field3384 = var1;
      }

      this.field3382[this.field3390] = this.field3385;
      this.field3390 = (this.field3390 + 1) % 10;
      int var5;
      if(this.field3384 > 1) {
         for(var5 = 0; var5 < 10; ++var5) {
            if(this.field3382[var5] != 0L) {
               this.field3382[var5] += (long)this.field3384;
            }
         }
      }

      if(this.field3384 < var2) {
         this.field3384 = var2;
      }

      class189.method3249((long)this.field3384);

      for(var5 = 0; this.field3386 < 256; this.field3386 += this.field3383) {
         ++var5;
      }

      this.field3386 &= 255;
      return var5;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lbu;Lbu;IZI)I",
      garbageValue = "1327624388"
   )
   static int method5550(class126 var0, class126 var1, int var2, boolean var3) {
      if(var2 == 1) {
         int var4 = var0.field1192;
         int var5 = var1.field1192;
         if(!var3) {
            if(var4 == -1) {
               var4 = 2001;
            }

            if(var5 == -1) {
               var5 = 2001;
            }
         }

         return var4 - var5;
      } else {
         return var2 == 2?var0.field1197 - var1.field1197:(var2 == 3?(var0.field1196.equals("-")?(var1.field1196.equals("-")?0:(var3?-1:1)):(var1.field1196.equals("-")?(var3?1:-1):var0.field1196.compareTo(var1.field1196))):(var2 == 4?(var0.method2291()?(var1.method2291()?0:1):(var1.method2291()?-1:0)):(var2 == 5?(var0.method2289()?(var1.method2289()?0:1):(var1.method2289()?-1:0)):(var2 == 6?(var0.method2305()?(var1.method2305()?0:1):(var1.method2305()?-1:0)):(var2 == 7?(var0.method2288()?(var1.method2288()?0:1):(var1.method2288()?-1:0)):var0.field1198 - var1.field1198)))));
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(DDII)[D",
      garbageValue = "-998326877"
   )
   public static double[] method5552(double var0, double var2, int var4) {
      int var5 = var4 * 2 + 1;
      double[] var6 = new double[var5];
      int var7 = -var4;

      for(int var8 = 0; var7 <= var4; ++var8) {
         var6[var8] = class130.method2394((double)var7, var0, var2);
         ++var7;
      }

      return var6;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-133044740"
   )
   protected static int method5542() {
      int var0 = 0;
      if(class231.field2262 == null || !class231.field2262.isValid()) {
         try {
            Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var1.hasNext()) {
               GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
               if(var2.isValid()) {
                  class231.field2262 = var2;
                  class181.field1744 = -1L;
                  class181.field1748 = -1L;
               }
            }
         } catch (Throwable var11) {
            ;
         }
      }

      if(class231.field2262 != null) {
         long var9 = class234.method4170();
         long var3 = class231.field2262.getCollectionTime();
         if(class181.field1748 != -1L) {
            long var5 = var3 - class181.field1748;
            long var7 = var9 - class181.field1744;
            if(var7 != 0L) {
               var0 = (int)(var5 * 100L / var7);
            }
         }

         class181.field1748 = var3;
         class181.field1744 = var9;
      }

      return var0;
   }
}
