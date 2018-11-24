package net.runelite.standalone;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class class260 extends class148 {
   @ObfuscatedName("jj")
   @ObfuscatedGetter(
      intValue = -1565271221
   )
   static int field3393;
   @ObfuscatedName("r")
   public static byte[][][] field3392;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -999514235
   )
   int field3387;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      longValue = -7820254455231475421L
   )
   long field3389;
   @ObfuscatedName("f")
   long[] field3386;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 56780157
   )
   int field3394;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 372289911
   )
   int field3390;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 2113850027
   )
   int field3388;

   public class260() {
      this.field3386 = new long[10];
      this.field3387 = 256;
      this.field3388 = 1;
      this.field3390 = 0;
      this.field3389 = class321.method6252();

      for(int var1 = 0; var1 < 10; ++var1) {
         this.field3386[var1] = this.field3389;
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-673206051"
   )
   public int vmethod5181(int var1, int var2) {
      int var3 = this.field3387;
      int var4 = this.field3388;
      this.field3387 = 300;
      this.field3388 = 1;
      this.field3389 = class321.method6252();
      if(0L == this.field3386[this.field3394]) {
         this.field3387 = var3;
         this.field3388 = var4;
      } else if(this.field3389 > this.field3386[this.field3394]) {
         this.field3387 = (int)((long)(var1 * 2560) / (this.field3389 - this.field3386[this.field3394]));
      }

      if(this.field3387 < 25) {
         this.field3387 = 25;
      }

      if(this.field3387 > 256) {
         this.field3387 = 256;
         this.field3388 = (int)((long)var1 - (this.field3389 - this.field3386[this.field3394]) / 10L);
      }

      if(this.field3388 > var1) {
         this.field3388 = var1;
      }

      this.field3386[this.field3394] = this.field3389;
      this.field3394 = (this.field3394 + 1) % 10;
      int var5;
      if(this.field3388 > 1) {
         for(var5 = 0; var5 < 10; ++var5) {
            if(this.field3386[var5] != 0L) {
               this.field3386[var5] += (long)this.field3388;
            }
         }
      }

      if(this.field3388 < var2) {
         this.field3388 = var2;
      }

      class48.method1045((long)this.field3388);

      for(var5 = 0; this.field3390 < 256; this.field3390 += this.field3387) {
         ++var5;
      }

      this.field3390 &= 255;
      return var5;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1412174677"
   )
   public void vmethod5184() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.field3386[var1] = 0L;
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lbu;Lbu;IZI)I",
      garbageValue = "1327624388"
   )
   static int method5187(class88 var0, class88 var1, int var2, boolean var3) {
      if(var2 == 1) {
         int var4 = var0.field952;
         int var5 = var1.field952;
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
         return var2 == 2?var0.field957 - var1.field957:(var2 == 3?(var0.field956.equals("-")?(var1.field956.equals("-")?0:(var3?-1:1)):(var1.field956.equals("-")?(var3?1:-1):var0.field956.compareTo(var1.field956))):(var2 == 4?(var0.method1639()?(var1.method1639()?0:1):(var1.method1639()?-1:0)):(var2 == 5?(var0.method1637()?(var1.method1637()?0:1):(var1.method1637()?-1:0)):(var2 == 6?(var0.method1653()?(var1.method1653()?0:1):(var1.method1653()?-1:0)):(var2 == 7?(var0.method1636()?(var1.method1636()?0:1):(var1.method1636()?-1:0)):var0.field958 - var1.field958)))));
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(DDII)[D",
      garbageValue = "-998326877"
   )
   public static double[] method5189(double var0, double var2, int var4) {
      int var5 = var4 * 2 + 1;
      double[] var6 = new double[var5];
      int var7 = -var4;

      for(int var8 = 0; var7 <= var4; ++var8) {
         var6[var8] = class79.method1592((double)var7, var0, var2);
         ++var7;
      }

      return var6;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-133044740"
   )
   protected static int method5179() {
      int var0 = 0;
      if(class224.field3018 == null || !class224.field3018.isValid()) {
         try {
            Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var1.hasNext()) {
               GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
               if(var2.isValid()) {
                  class224.field3018 = var2;
                  GameEngine.field3742 = -1L;
                  GameEngine.field3746 = -1L;
               }
            }
         } catch (Throwable var11) {
            ;
         }
      }

      if(class224.field3018 != null) {
         long var9 = class321.method6252();
         long var3 = class224.field3018.getCollectionTime();
         if(GameEngine.field3746 != -1L) {
            long var5 = var3 - GameEngine.field3746;
            long var7 = var9 - GameEngine.field3742;
            if(var7 != 0L) {
               var0 = (int)(var5 * 100L / var7);
            }
         }

         GameEngine.field3746 = var3;
         GameEngine.field3742 = var9;
      }

      return var0;
   }
}
