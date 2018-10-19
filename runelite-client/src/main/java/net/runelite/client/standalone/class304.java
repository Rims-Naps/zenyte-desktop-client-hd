package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
public class class304 {
   @ObfuscatedName("m")
   static final byte[] field3247;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgm;"
   )
   Buffer field3256;
   @ObfuscatedName("r")
   long field3255;
   @ObfuscatedName("c")
   int field3253;
   @ObfuscatedName("e")
   int[] field3254;
   @ObfuscatedName("l")
   int field3248;
   @ObfuscatedName("s")
   int[] field3250;
   @ObfuscatedName("a")
   int[] field3252;
   @ObfuscatedName("w")
   int[] field3249;

   static {
      field3247 = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)0, (byte)1, (byte)2, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
   }

   class304(byte[] var1) {
      this.field3256 = new Buffer((byte[])null);
      this.method5219(var1);
   }

   class304() {
      this.field3256 = new Buffer((byte[])null);
   }

   @ObfuscatedName("f")
   void method5219(byte[] var1) {
      this.field3256.field1074 = var1;
      this.field3256.field1073 = 10;
      int var2 = this.field3256.readUnsignedShort();
      this.field3248 = this.field3256.readUnsignedShort();
      this.field3253 = 500000;
      this.field3249 = new int[var2];

      int var3;
      int var5;
      for(var3 = 0; var3 < var2; this.field3256.field1073 += var5) {
         int var4 = this.field3256.readInt();
         var5 = this.field3256.readInt();
         if(var4 == 1297379947) {
            this.field3249[var3] = this.field3256.field1073;
            ++var3;
         }
      }

      this.field3255 = 0L;
      this.field3250 = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.field3250[var3] = this.field3249[var3];
      }

      this.field3254 = new int[var2];
      this.field3252 = new int[var2];
   }

   @ObfuscatedName("v")
   int method5231() {
      int var1 = this.field3250.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if(this.field3250[var4] >= 0 && this.field3254[var4] < var3) {
            var2 = var4;
            var3 = this.field3254[var4];
         }
      }

      return var2;
   }

   @ObfuscatedName("m")
   int method5227(int var1) {
      int var2 = this.method5228(var1);
      return var2;
   }

   @ObfuscatedName("z")
   int method5252(int var1, int var2) {
      int var4;
      if(var2 == 255) {
         int var7 = this.field3256.readUnsignedByte();
         var4 = this.field3256.method1912();
         if(var7 == 47) {
            this.field3256.field1073 += var4;
            return 1;
         } else if(var7 == 81) {
            int var5 = this.field3256.method1909();
            var4 -= 3;
            int var6 = this.field3254[var1];
            this.field3255 += (long)var6 * (long)(this.field3253 - var5);
            this.field3253 = var5;
            this.field3256.field1073 += var4;
            return 2;
         } else {
            this.field3256.field1073 += var4;
            return 3;
         }
      } else {
         byte var3 = field3247[var2 - 128];
         var4 = var2;
         if(var3 >= 1) {
            var4 = var2 | this.field3256.readUnsignedByte() << 8;
         }

         if(var3 >= 2) {
            var4 |= this.field3256.readUnsignedByte() << 16;
         }

         return var4;
      }
   }

   @ObfuscatedName("r")
   void method5226(int var1) {
      int var2 = this.field3256.method1912();
      this.field3254[var1] += var2;
   }

   @ObfuscatedName("p")
   void method5217() {
      this.field3256.field1073 = -1;
   }

   @ObfuscatedName("u")
   void method5233(long var1) {
      this.field3255 = var1;
      int var3 = this.field3250.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field3254[var4] = 0;
         this.field3252[var4] = 0;
         this.field3256.field1073 = this.field3249[var4];
         this.method5226(var4);
         this.field3250[var4] = this.field3256.field1073;
      }

   }

   @ObfuscatedName("c")
   void method5224(int var1) {
      this.field3250[var1] = this.field3256.field1073;
   }

   @ObfuscatedName("e")
   void method5232(int var1) {
      this.field3256.field1073 = this.field3250[var1];
   }

   @ObfuscatedName("x")
   long method5230(int var1) {
      return this.field3255 + (long)var1 * (long)this.field3253;
   }

   @ObfuscatedName("l")
   void method5220() {
      this.field3256.field1074 = null;
      this.field3249 = null;
      this.field3250 = null;
      this.field3254 = null;
      this.field3252 = null;
   }

   @ObfuscatedName("s")
   int method5253() {
      return this.field3250.length;
   }

   @ObfuscatedName("g")
   boolean method5240() {
      int var1 = this.field3250.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if(this.field3250[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @ObfuscatedName("w")
   boolean method5238() {
      return this.field3256.field1074 != null;
   }

   @ObfuscatedName("d")
   int method5228(int var1) {
      byte var2 = this.field3256.field1074[this.field3256.field1073];
      int var5;
      if(var2 < 0) {
         var5 = var2 & 255;
         this.field3252[var1] = var5;
         ++this.field3256.field1073;
      } else {
         var5 = this.field3252[var1];
      }

      if(var5 != 240 && var5 != 247) {
         return this.method5252(var1, var5);
      } else {
         int var3 = this.field3256.method1912();
         if(var5 == 247 && var3 > 0) {
            int var4 = this.field3256.field1074[this.field3256.field1073] & 255;
            if(var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               ++this.field3256.field1073;
               this.field3252[var1] = var4;
               return this.method5252(var1, var4);
            }
         }

         this.field3256.field1073 += var3;
         return 0;
      }
   }
}
