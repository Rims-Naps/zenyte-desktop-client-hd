package net.runelite.standalone;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
public class class206 {
   @ObfuscatedName("r")
   static int[] field2867;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Llo;"
   )
   class170 field2868;
   @ObfuscatedName("s")
   int[] field2860;
   @ObfuscatedName("f")
   final HashMap field2861;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1763078903
   )
   int field2864;
   @ObfuscatedName("w")
   int[] field2862;

   public class206() {
      this.field2861 = new HashMap();
      this.field2868 = new class170(0, 0);
      this.field2862 = new int[2048];
      this.field2860 = new int[2048];
      this.field2864 = 0;
      class113.method2119();
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Llp;Llp;Llo;B)V",
      garbageValue = "-123"
   )
   void method4084(SpritePixels var1, SpritePixels var2, class170 var3) {
      if(var3.field2020 != 0 && var3.field2021 != 0) {
         int var4 = 0;
         int var5 = 0;
         if(var3.field2018 == 0) {
            var4 = var1.width - var3.field2020;
         }

         if(var3.field2019 == 0) {
            var5 = var1.height - var3.field2021;
         }

         int var6 = var4 + var5 * var1.width;
         int var7 = var2.width * var3.field2019 + var3.field2018;

         for(int var8 = 0; var8 < var3.field2021; ++var8) {
            for(int var9 = 0; var9 < var3.field2020; ++var9) {
               int var10001 = var7++;
               var2.pixels[var10001] += var1.pixels[var6++];
            }

            var6 += var1.width - var3.field2020;
            var7 += var2.width - var3.field2020;
         }

      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(IILlp;FI)V",
      garbageValue = "-827661759"
   )
   public final void method4083(int var1, int var2, SpritePixels var3, float var4) {
      int var5 = (int)(var4 * 18.0F);
      SpritePixels var6 = this.method4081(var5);
      int var7 = var5 * 2 + 1;
      class170 var8 = new class170(0, 0, var3.width, var3.height);
      class170 var9 = new class170(0, 0);
      this.field2868.method3106(var7, var7);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < this.field2864; ++var10) {
         var11 = this.field2862[var10];
         var12 = this.field2860[var10];
         int var13 = (int)(var4 * (float)(var11 - var1)) - var5;
         int var14 = (int)((float)var3.height - var4 * (float)(var12 - var2)) - var5;
         this.field2868.method3105(var13, var14);
         this.field2868.method3128(var8, var9);
         this.method4084(var6, var3, var9);
      }

      System.nanoTime();
      System.nanoTime();

      for(var10 = 0; var10 < var3.pixels.length; ++var10) {
         if(var3.pixels[var10] == 0) {
            var3.pixels[var10] = -16777216;
         } else {
            var11 = (var3.pixels[var10] + 64 - 1) / 256;
            if(var11 <= 0) {
               var3.pixels[var10] = -16777216;
            } else {
               if(var11 > field2867.length) {
                  var11 = field2867.length;
               }

               var12 = field2867[var11 - 1];
               var3.pixels[var10] = -16777216 | var12;
            }
         }
      }

      System.nanoTime();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "225563841"
   )
   void method4098(int var1) {
      int var2 = var1 * 2 + 1;
      double[] var3 = class260.method5189(0.0D, (double)((float)var1 / 3.0F), var1);
      double var4 = var3[var1] * var3[var1];
      int[] var6 = new int[var2 * var2];
      boolean var7 = false;

      for(int var8 = 0; var8 < var2; ++var8) {
         for(int var9 = 0; var9 < var2; ++var9) {
            int var10 = var6[var9 + var8 * var2] = (int)(256.0D * (var3[var9] * var3[var8] / var4));
            if(!var7 && var10 > 0) {
               var7 = true;
            }
         }
      }

      SpritePixels var11 = new SpritePixels(var6, var2, var2);
      this.field2861.put(Integer.valueOf(var1), var11);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-2022855372"
   )
   public final void method4100(int var1, int var2) {
      if(this.field2864 < this.field2862.length) {
         this.field2862[this.field2864] = var1;
         this.field2860[this.field2864] = var2;
         ++this.field2864;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "99"
   )
   public final void method4080() {
      this.field2864 = 0;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)Llp;",
      garbageValue = "0"
   )
   SpritePixels method4081(int var1) {
      if(!this.field2861.containsKey(Integer.valueOf(var1))) {
         this.method4098(var1);
      }

      return (SpritePixels)this.field2861.get(Integer.valueOf(var1));
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/io/File;Ljava/io/File;I)V",
      garbageValue = "1734563723"
   )
   static void method4091(File var0, File var1) {
      try {
         class283 var2 = new class283(class305.field3772, "rw", 10000L);
         Buffer var3 = new Buffer(500);
         var3.method2288(3);
         var3.method2288(var1 != null?1:0);
         var3.method2250(var0.getPath());
         if(var1 != null) {
            var3.method2250("");
         }

         var2.method5442(var3.field1694, 0, var3.field1693);
         var2.method5454();
      } catch (IOException var4) {
         var4.printStackTrace();
      }

   }
}
