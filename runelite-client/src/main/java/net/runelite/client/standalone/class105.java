package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
public class class105 extends class193 {
   @ObfuscatedName("np")
   @ObfuscatedSignature(
      signature = "Lfm;"
   )
   static class115 field978;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class148 field987;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   public static class124 field980;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1531483227
   )
   public int field983;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1949506889
   )
   public int field985;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1689669891
   )
   public int field974;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1456273155
   )
   public int field982;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1447256055
   )
   public int field981;
   @ObfuscatedName("e")
   public boolean field975;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1718437285
   )
   public int field977;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 584997475
   )
   public int field979;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1422220573
   )
   public int field976;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 912634359
   )
   public int field984;

   static {
      field980 = new class124(64);
   }

   public class105() {
      this.field976 = 0;
      this.field977 = -1;
      this.field975 = true;
      this.field979 = -1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "813392383"
   )
   public void method1773() {
      if(this.field979 != -1) {
         this.method1776(this.field979);
         this.field983 = this.field981;
         this.field984 = this.field982;
         this.field985 = this.field974;
      }

      this.method1776(this.field976);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "1617476895"
   )
   public void method1774(Buffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if(var3 == 0) {
            return;
         }

         this.method1772(var1, var3, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "6"
   )
   void method1776(int var1) {
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
      if(var8 != var10) {
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
            var12 = 4.0D + (var2 - var4) / (var10 - var8);
         }
      }

      var12 /= 6.0D;
      this.field981 = (int)(256.0D * var12);
      this.field982 = (int)(var14 * 256.0D);
      this.field974 = (int)(var16 * 256.0D);
      if(this.field982 < 0) {
         this.field982 = 0;
      } else if(this.field982 > 255) {
         this.field982 = 255;
      }

      if(this.field974 < 0) {
         this.field974 = 0;
      } else if(this.field974 > 255) {
         this.field974 = 255;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;IIS)V",
      garbageValue = "6627"
   )
   void method1772(Buffer var1, int var2, int var3) {
      if(var2 == 1) {
         this.field976 = var1.method1909();
      } else if(var2 == 2) {
         this.field977 = var1.readUnsignedByte();
      } else if(var2 == 5) {
         this.field975 = false;
      } else if(var2 == 7) {
         this.field979 = var1.method1909();
      } else if(var2 == 8) {
         ;
      }

   }
}
