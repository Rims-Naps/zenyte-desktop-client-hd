package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
public class class51 {
   @ObfuscatedName("m")
   static final byte[] field563;
   @ObfuscatedName("c")
   int field569;
   @ObfuscatedName("l")
   int field564;
   @ObfuscatedName("s")
   int[] field566;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgm;"
   )
   Buffer field572;
   @ObfuscatedName("r")
   long field571;
   @ObfuscatedName("a")
   int[] field568;
   @ObfuscatedName("e")
   int[] field570;
   @ObfuscatedName("w")
   int[] field565;

   static {
      field563 = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)0, (byte)1, (byte)2, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
   }

   class51(byte[] var1) {
      this.field572 = new Buffer((byte[])null);
      this.method1075(var1);
   }

   class51() {
      this.field572 = new Buffer((byte[])null);
   }

   @ObfuscatedName("z")
   int method1108(int var1, int var2) {
      int var4;
      if(var2 == 255) {
         int var7 = this.field572.readUnsignedByte();
         var4 = this.field572.method2263();
         if(var7 == 47) {
            this.field572.field1693 += var4;
            return 1;
         } else if(var7 == 81) {
            int var5 = this.field572.method2260();
            var4 -= 3;
            int var6 = this.field570[var1];
            this.field571 += (long)var6 * (long)(this.field569 - var5);
            this.field569 = var5;
            this.field572.field1693 += var4;
            return 2;
         } else {
            this.field572.field1693 += var4;
            return 3;
         }
      } else {
         byte var3 = field563[var2 - 128];
         var4 = var2;
         if(var3 >= 1) {
            var4 = var2 | this.field572.readUnsignedByte() << 8;
         }

         if(var3 >= 2) {
            var4 |= this.field572.readUnsignedByte() << 16;
         }

         return var4;
      }
   }

   @ObfuscatedName("p")
   void method1073() {
      this.field572.field1693 = -1;
   }

   @ObfuscatedName("c")
   void method1080(int var1) {
      this.field566[var1] = this.field572.field1693;
   }

   @ObfuscatedName("l")
   void method1076() {
      this.field572.field1694 = null;
      this.field565 = null;
      this.field566 = null;
      this.field570 = null;
      this.field568 = null;
   }

   @ObfuscatedName("s")
   int method1109() {
      return this.field566.length;
   }

   @ObfuscatedName("f")
   void method1075(byte[] var1) {
      this.field572.field1694 = var1;
      this.field572.field1693 = 10;
      int var2 = this.field572.readShort();
      this.field564 = this.field572.readShort();
      this.field569 = 500000;
      this.field565 = new int[var2];

      int var3;
      int var5;
      for(var3 = 0; var3 < var2; this.field572.field1693 += var5) {
         int var4 = this.field572.readInt();
         var5 = this.field572.readInt();
         if(var4 == 1297379947) {
            this.field565[var3] = this.field572.field1693;
            ++var3;
         }
      }

      this.field571 = 0L;
      this.field566 = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.field566[var3] = this.field565[var3];
      }

      this.field570 = new int[var2];
      this.field568 = new int[var2];
   }

   @ObfuscatedName("r")
   void method1082(int var1) {
      int var2 = this.field572.method2263();
      this.field570[var1] += var2;
   }

   @ObfuscatedName("u")
   void method1089(long var1) {
      this.field571 = var1;
      int var3 = this.field566.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field570[var4] = 0;
         this.field568[var4] = 0;
         this.field572.field1693 = this.field565[var4];
         this.method1082(var4);
         this.field566[var4] = this.field572.field1693;
      }

   }

   @ObfuscatedName("m")
   int method1083(int var1) {
      int var2 = this.method1084(var1);
      return var2;
   }

   @ObfuscatedName("x")
   long method1086(int var1) {
      return this.field571 + (long)var1 * (long)this.field569;
   }

   @ObfuscatedName("v")
   int method1087() {
      int var1 = this.field566.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if(this.field566[var4] >= 0 && this.field570[var4] < var3) {
            var2 = var4;
            var3 = this.field570[var4];
         }
      }

      return var2;
   }

   @ObfuscatedName("d")
   int method1084(int var1) {
      byte var2 = this.field572.field1694[this.field572.field1693];
      int var5;
      if(var2 < 0) {
         var5 = var2 & 255;
         this.field568[var1] = var5;
         ++this.field572.field1693;
      } else {
         var5 = this.field568[var1];
      }

      if(var5 != 240 && var5 != 247) {
         return this.method1108(var1, var5);
      } else {
         int var3 = this.field572.method2263();
         if(var5 == 247 && var3 > 0) {
            int var4 = this.field572.field1694[this.field572.field1693] & 255;
            if(var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               ++this.field572.field1693;
               this.field568[var1] = var4;
               return this.method1108(var1, var4);
            }
         }

         this.field572.field1693 += var3;
         return 0;
      }
   }

   @ObfuscatedName("g")
   boolean method1096() {
      int var1 = this.field566.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if(this.field566[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @ObfuscatedName("e")
   void method1088(int var1) {
      this.field572.field1693 = this.field566[var1];
   }

   @ObfuscatedName("w")
   boolean method1094() {
      return this.field572.field1694 != null;
   }
}
