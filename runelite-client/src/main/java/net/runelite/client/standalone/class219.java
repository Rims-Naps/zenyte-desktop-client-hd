package net.runelite.client.standalone;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
public class class219 {
   @ObfuscatedName("r")
   static int[] field2133;
   @ObfuscatedName("f")
   final HashMap field2127;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1763078903
   )
   int field2130;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Llo;"
   )
   class131 field2134;
   @ObfuscatedName("s")
   int[] field2126;
   @ObfuscatedName("w")
   int[] field2128;

   public class219() {
      this.field2127 = new HashMap();
      this.field2134 = new class131(0, 0);
      this.field2128 = new int[2048];
      this.field2126 = new int[2048];
      this.field2130 = 0;
      class199.method3365();
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Llp;Llp;Llo;B)V",
      garbageValue = "-123"
   )
   void method3914(class26 var1, class26 var2, class131 var3) {
      if(var3.field1250 != 0 && var3.field1251 != 0) {
         int var4 = 0;
         int var5 = 0;
         if(var3.field1248 == 0) {
            var4 = var1.field202 - var3.field1250;
         }

         if(var3.field1249 == 0) {
            var5 = var1.field201 - var3.field1251;
         }

         int var6 = var4 + var5 * var1.field202;
         int var7 = var2.field202 * var3.field1249 + var3.field1248;

         for(int var8 = 0; var8 < var3.field1251; ++var8) {
            for(int var9 = 0; var9 < var3.field1250; ++var9) {
               int var10001 = var7++;
               var2.field203[var10001] += var1.field203[var6++];
            }

            var6 += var1.field202 - var3.field1250;
            var7 += var2.field202 - var3.field1250;
         }

      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(IILlp;FI)V",
      garbageValue = "-827661759"
   )
   public final void method3913(int var1, int var2, class26 var3, float var4) {
      int var5 = (int)(var4 * 18.0F);
      class26 var6 = this.method3911(var5);
      int var7 = var5 * 2 + 1;
      class131 var8 = new class131(0, 0, var3.field202, var3.field201);
      class131 var9 = new class131(0, 0);
      this.field2134.method2400(var7, var7);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < this.field2130; ++var10) {
         var11 = this.field2128[var10];
         var12 = this.field2126[var10];
         int var13 = (int)(var4 * (float)(var11 - var1)) - var5;
         int var14 = (int)((float)var3.field201 - var4 * (float)(var12 - var2)) - var5;
         this.field2134.method2399(var13, var14);
         this.field2134.method2422(var8, var9);
         this.method3914(var6, var3, var9);
      }

      System.nanoTime();
      System.nanoTime();

      for(var10 = 0; var10 < var3.field203.length; ++var10) {
         if(var3.field203[var10] == 0) {
            var3.field203[var10] = -16777216;
         } else {
            var11 = (var3.field203[var10] + 64 - 1) / 256;
            if(var11 <= 0) {
               var3.field203[var10] = -16777216;
            } else {
               if(var11 > field2133.length) {
                  var11 = field2133.length;
               }

               var12 = field2133[var11 - 1];
               var3.field203[var10] = -16777216 | var12;
            }
         }
      }

      System.nanoTime();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "99"
   )
   public final void method3910() {
      this.field2130 = 0;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "225563841"
   )
   void method3928(int var1) {
      int var2 = var1 * 2 + 1;
      double[] var3 = class315.method5552(0.0D, (double)((float)var1 / 3.0F), var1);
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

      class26 var11 = new class26(var6, var2, var2);
      this.field2127.put(Integer.valueOf(var1), var11);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-2022855372"
   )
   public final void method3930(int var1, int var2) {
      if(this.field2130 < this.field2128.length) {
         this.field2128[this.field2130] = var1;
         this.field2126[this.field2130] = var2;
         ++this.field2130;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)Llp;",
      garbageValue = "0"
   )
   class26 method3911(int var1) {
      if(!this.field2127.containsKey(Integer.valueOf(var1))) {
         this.method3928(var1);
      }

      return (class26)this.field2127.get(Integer.valueOf(var1));
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/io/File;Ljava/io/File;I)V",
      garbageValue = "1734563723"
   )
   static void method3921(File var0, File var1) {
      try {
         class38 var2 = new class38(class323.field3449, "rw", 10000L);
         Buffer var3 = new Buffer(500);
         var3.writeByte(3);
         var3.writeByte(var1 != null?1:0);
         var3.method1899(var0.getPath());
         if(var1 != null) {
            var3.method1899("");
         }

         var2.method597(var3.field1074, 0, var3.field1073);
         var2.method609();
      } catch (IOException var4) {
         var4.printStackTrace();
      }

   }
}
