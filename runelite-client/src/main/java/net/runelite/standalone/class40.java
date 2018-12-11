package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
public class class40 extends class324 {
   @ObfuscatedName("ql")
   @ObfuscatedSignature(
      signature = "Ldt;"
   )
   static class119 field416;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class100 field409;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static Js5Index field418;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1215508119
   )
   public int field415;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 194919499
   )
   public int field414;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -944216879
   )
   public int field412;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1331975325
   )
   public int field413;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -2118683643
   )
   int field411;

   static {
      field409 = new class100(64);
   }

   class40() {
      this.field411 = 0;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "100"
   )
   void method721() {
      this.method737(this.field411);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgm;III)V",
      garbageValue = "1130789086"
   )
   void method720(Buffer var1, int var2, int var3) {
      if(var2 == 1) {
         this.field411 = var1.method2260();
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1095745556"
   )
   void method737(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0D;
      double var4 = (double)(var1 >> 8 & 255) / 256.0D;
      double var6 = (double)(var1 & 255) / 256.0D;
      double var8 = var2;
      if(var4 < var2) {
         var8 = var4;
      }

      if(var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if(var4 > var2) {
         var10 = var4;
      }

      if(var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var10 + var8) / 2.0D;
      if(var10 != var8) {
         if(var16 < 0.5D) {
            var14 = (var10 - var8) / (var8 + var10);
         }

         if(var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if(var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if(var4 == var10) {
            var12 = (var6 - var2) / (var10 - var8) + 2.0D;
         } else if(var10 == var6) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0D;
         }
      }

      var12 /= 6.0D;
      this.field413 = (int)(var14 * 256.0D);
      this.field412 = (int)(var16 * 256.0D);
      if(this.field413 < 0) {
         this.field413 = 0;
      } else if(this.field413 > 255) {
         this.field413 = 255;
      }

      if(this.field412 < 0) {
         this.field412 = 0;
      } else if(this.field412 > 255) {
         this.field412 = 255;
      }

      if(var16 > 0.5D) {
         this.field415 = (int)(512.0D * var14 * (1.0D - var16));
      } else {
         this.field415 = (int)(var16 * var14 * 512.0D);
      }

      if(this.field415 < 1) {
         this.field415 = 1;
      }

      this.field414 = (int)((double)this.field415 * var12);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "1163409727"
   )
   void method719(Buffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if(var3 == 0) {
            return;
         }

         this.method720(var1, var3, var2);
      }
   }
}
