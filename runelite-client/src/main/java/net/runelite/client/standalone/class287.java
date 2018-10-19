package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
public class class287 extends class193 {
   @ObfuscatedName("ql")
   @ObfuscatedSignature(
      signature = "Ldt;"
   )
   static class157 field3121;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class148 field3123;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class124 field3114;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1215508119
   )
   public int field3120;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1331975325
   )
   public int field3118;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 194919499
   )
   public int field3119;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -944216879
   )
   public int field3117;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -2118683643
   )
   int field3116;

   static {
      field3114 = new class124(64);
   }

   class287() {
      this.field3116 = 0;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1095745556"
   )
   void method5084(int var1) {
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
      this.field3118 = (int)(var14 * 256.0D);
      this.field3117 = (int)(var16 * 256.0D);
      if(this.field3118 < 0) {
         this.field3118 = 0;
      } else if(this.field3118 > 255) {
         this.field3118 = 255;
      }

      if(this.field3117 < 0) {
         this.field3117 = 0;
      } else if(this.field3117 > 255) {
         this.field3117 = 255;
      }

      if(var16 > 0.5D) {
         this.field3120 = (int)(512.0D * var14 * (1.0D - var16));
      } else {
         this.field3120 = (int)(var16 * var14 * 512.0D);
      }

      if(this.field3120 < 1) {
         this.field3120 = 1;
      }

      this.field3119 = (int)((double)this.field3120 * var12);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "100"
   )
   void method5068() {
      this.method5084(this.field3116);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgm;III)V",
      garbageValue = "1130789086"
   )
   void method5067(Buffer var1, int var2, int var3) {
      if(var2 == 1) {
         this.field3116 = var1.method1909();
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "1163409727"
   )
   void method5066(Buffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if(var3 == 0) {
            return;
         }

         this.method5067(var1, var3, var2);
      }
   }
}
