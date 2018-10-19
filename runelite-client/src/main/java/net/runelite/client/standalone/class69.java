package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class69 extends class76 {
   @ObfuscatedName("g")
   static int[] field647;
   @ObfuscatedName("v")
   boolean field646;
   @ObfuscatedName("m")
   int[] field633;
   @ObfuscatedName("z")
   int field634;
   @ObfuscatedName("r")
   int[] field641;
   @ObfuscatedName("p")
   int[] field640;
   @ObfuscatedName("c")
   int[] field639;
   @ObfuscatedName("e")
   int field637;
   @ObfuscatedName("x")
   int[] field644;
   @ObfuscatedName("a")
   boolean field642;
   @ObfuscatedName("d")
   int field643;

   @ObfuscatedSignature(
      signature = "(Lgm;)V"
   )
   class69(Buffer var1) {
      this.field646 = false;
      this.field637 = var1.readUnsignedShort();
      this.field642 = var1.readUnsignedByte() == 1;
      int var2 = var1.readUnsignedByte();
      if(var2 >= 1 && var2 <= 4) {
         this.field639 = new int[var2];

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            this.field639[var3] = var1.readUnsignedShort();
         }

         if(var2 > 1) {
            this.field640 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field640[var3] = var1.readUnsignedByte();
            }
         }

         if(var2 > 1) {
            this.field641 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field641[var3] = var1.readUnsignedByte();
            }
         }

         this.field633 = new int[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            this.field633[var3] = var1.readInt();
         }

         this.field643 = var1.readUnsignedByte();
         this.field634 = var1.readUnsignedByte();
         this.field644 = null;
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(DILik;)Z"
   )
   boolean method1160(double var1, int var3, class148 var4) {
      int var5;
      for(var5 = 0; var5 < this.field639.length; ++var5) {
         if(var4.method2588(this.field639[var5]) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.field644 = new int[var5];

      for(int var6 = 0; var6 < this.field639.length; ++var6) {
         class32 var7 = class61.method1080(var4, this.field639[var6]);
         var7.method531();
         byte[] var8 = var7.field258;
         int[] var9 = var7.field256;
         int var10 = this.field633[var6];
         if((var10 & -16777216) == 16777216) {
            ;
         }

         if((var10 & -16777216) == 33554432) {
            ;
         }

         int var11;
         int var12;
         int var13;
         int var14;
         if((var10 & -16777216) == 50331648) {
            var11 = var10 & 16711935;
            var12 = var10 >> 8 & 255;

            for(var13 = 0; var13 < var9.length; ++var13) {
               var14 = var9[var13];
               if(var14 >> 8 == (var14 & 65535)) {
                  var14 &= 255;
                  var9[var13] = var11 * var14 >> 8 & 16711935 | var12 * var14 & 65280;
               }
            }
         }

         for(var11 = 0; var11 < var9.length; ++var11) {
            var9[var11] = class257.method4577(var9[var11], var1);
         }

         if(var6 == 0) {
            var11 = 0;
         } else {
            var11 = this.field640[var6 - 1];
         }

         if(var11 == 0) {
            if(var3 == var7.field257) {
               for(var12 = 0; var12 < var5; ++var12) {
                  this.field644[var12] = var9[var8[var12] & 255];
               }
            } else if(var7.field257 == 64 && var3 == 128) {
               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.field644[var12++] = var9[var8[(var13 >> 1 << 6) + (var14 >> 1)] & 255];
                  }
               }
            } else {
               if(var7.field257 != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.field644[var12++] = var9[var8[(var14 << 1) + (var13 << 1 << 7)] & 255];
                  }
               }
            }
         }

         if(var11 == 1) {
            ;
         }

         if(var11 == 2) {
            ;
         }

         if(var11 == 3) {
            ;
         }
      }

      return true;
   }

   @ObfuscatedName("l")
   void method1168() {
      this.field644 = null;
   }

   @ObfuscatedName("w")
   void method1162(int var1) {
      if(this.field644 != null) {
         short var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var10;
         if(this.field643 == 1 || this.field643 == 3) {
            if(field647 == null || field647.length < this.field644.length) {
               field647 = new int[this.field644.length];
            }

            if(this.field644.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field644.length;
            var4 = var2 * this.field634 * var1;
            var5 = var3 - 1;
            if(this.field643 == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               field647[var6] = this.field644[var7];
            }

            var10 = this.field644;
            this.field644 = field647;
            field647 = var10;
         }

         if(this.field643 == 2 || this.field643 == 4) {
            if(field647 == null || field647.length < this.field644.length) {
               field647 = new int[this.field644.length];
            }

            if(this.field644.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field644.length;
            var4 = this.field634 * var1;
            var5 = var2 - 1;
            if(this.field643 == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  field647[var8] = this.field644[var9];
               }
            }

            var10 = this.field644;
            this.field644 = field647;
            field647 = var10;
         }

      }
   }
}
