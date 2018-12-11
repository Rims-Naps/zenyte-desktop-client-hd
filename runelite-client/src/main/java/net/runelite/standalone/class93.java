package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
public class class93 extends class324 {
   @ObfuscatedName("np")
   @ObfuscatedSignature(
      signature = "Lfm;"
   )
   static class234 field1003;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   public static class100 field1005;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static Js5Index field1012;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1949506889
   )
   public int field1010;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1456273155
   )
   public int field1007;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1447256055
   )
   public int field1006;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1718437285
   )
   public int field1002;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1689669891
   )
   public int field999;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1531483227
   )
   public int field1008;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 912634359
   )
   public int field1009;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 584997475
   )
   public int field1004;
   @ObfuscatedName("e")
   public boolean field1000;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1422220573
   )
   public int field1001;

   static {
      field1005 = new class100(64);
   }

   public class93() {
      this.field1001 = 0;
      this.field1002 = -1;
      this.field1000 = true;
      this.field1004 = -1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "1617476895"
   )
   public void method1721(Buffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if(var3 == 0) {
            return;
         }

         this.method1719(var1, var3, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "6"
   )
   void method1723(int var1) {
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
      this.field1006 = (int)(256.0D * var12);
      this.field1007 = (int)(var14 * 256.0D);
      this.field999 = (int)(var16 * 256.0D);
      if(this.field1007 < 0) {
         this.field1007 = 0;
      } else if(this.field1007 > 255) {
         this.field1007 = 255;
      }

      if(this.field999 < 0) {
         this.field999 = 0;
      } else if(this.field999 > 255) {
         this.field999 = 255;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "813392383"
   )
   public void method1720() {
      if(this.field1004 != -1) {
         this.method1723(this.field1004);
         this.field1008 = this.field1006;
         this.field1009 = this.field1007;
         this.field1010 = this.field999;
      }

      this.method1723(this.field1001);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;IIS)V",
      garbageValue = "6627"
   )
   void method1719(Buffer var1, int var2, int var3) {
      if(var2 == 1) {
         this.field1001 = var1.method2260();
      } else if(var2 == 2) {
         this.field1002 = var1.readUnsignedByte();
      } else if(var2 == 5) {
         this.field1000 = false;
      } else if(var2 == 7) {
         this.field1004 = var1.method2260();
      } else if(var2 == 8) {
         ;
      }

   }
}
