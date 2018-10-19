package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSCollisionData;

@ObfuscatedName("fr")
public class class182 implements RSCollisionData {
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   static class329 field1766;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 390621607
   )
   public int field1761;
   @ObfuscatedName("ad")
   public int[][] field1765;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1375085439
   )
   int field1750;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1694548379
   )
   public int field1762;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 346884099
   )
   int field1764;

   public class182(int var1, int var2) {
      this.field1761 = 0;
      this.field1762 = 0;
      this.field1750 = var1;
      this.field1764 = var2;
      this.field1765 = new int[this.field1750][this.field1764];
      this.method3160();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "573734182"
   )
   public void method3160() {
      for(int var1 = 0; var1 < this.field1750; ++var1) {
         for(int var2 = 0; var2 < this.field1764; ++var2) {
            if(var1 != 0 && var2 != 0 && var1 < this.field1750 - 5 && var2 < this.field1764 - 5) {
               this.field1765[var1][var2] = 16777216;
            } else {
               this.field1765[var1][var2] = 16777215;
            }
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIIB)V",
      garbageValue = "-110"
   )
   void method3169(int var1, int var2, int var3) {
      this.field1765[var1][var2] &= ~var3;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(IIIIIZI)V",
      garbageValue = "-1728799904"
   )
   public void method3175(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 256;
      if(var6) {
         var7 += 131072;
      }

      var1 -= this.field1761;
      var2 -= this.field1762;
      int var8;
      if(var5 == 1 || var5 == 3) {
         var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for(var8 = var1; var8 < var3 + var1; ++var8) {
         if(var8 >= 0 && var8 < this.field1750) {
            for(int var9 = var2; var9 < var2 + var4; ++var9) {
               if(var9 >= 0 && var9 < this.field1764) {
                  this.method3169(var8, var9, var7);
               }
            }
         }
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(IIIIZS)V",
      garbageValue = "-6845"
   )
   public void method3168(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field1761;
      var2 -= this.field1762;
      if(var3 == 0) {
         if(var4 == 0) {
            this.method3169(var1, var2, 128);
            this.method3169(var1 - 1, var2, 8);
         }

         if(var4 == 1) {
            this.method3169(var1, var2, 2);
            this.method3169(var1, var2 + 1, 32);
         }

         if(var4 == 2) {
            this.method3169(var1, var2, 8);
            this.method3169(var1 + 1, var2, 128);
         }

         if(var4 == 3) {
            this.method3169(var1, var2, 32);
            this.method3169(var1, var2 - 1, 2);
         }
      }

      if(var3 == 1 || var3 == 3) {
         if(var4 == 0) {
            this.method3169(var1, var2, 1);
            this.method3169(var1 - 1, var2 + 1, 16);
         }

         if(var4 == 1) {
            this.method3169(var1, var2, 4);
            this.method3169(var1 + 1, var2 + 1, 64);
         }

         if(var4 == 2) {
            this.method3169(var1, var2, 16);
            this.method3169(var1 + 1, var2 - 1, 1);
         }

         if(var4 == 3) {
            this.method3169(var1, var2, 64);
            this.method3169(var1 - 1, var2 - 1, 4);
         }
      }

      if(var3 == 2) {
         if(var4 == 0) {
            this.method3169(var1, var2, 130);
            this.method3169(var1 - 1, var2, 8);
            this.method3169(var1, var2 + 1, 32);
         }

         if(var4 == 1) {
            this.method3169(var1, var2, 10);
            this.method3169(var1, var2 + 1, 32);
            this.method3169(var1 + 1, var2, 128);
         }

         if(var4 == 2) {
            this.method3169(var1, var2, 40);
            this.method3169(var1 + 1, var2, 128);
            this.method3169(var1, var2 - 1, 2);
         }

         if(var4 == 3) {
            this.method3169(var1, var2, 160);
            this.method3169(var1, var2 - 1, 2);
            this.method3169(var1 - 1, var2, 8);
         }
      }

      if(var5) {
         if(var3 == 0) {
            if(var4 == 0) {
               this.method3169(var1, var2, 65536);
               this.method3169(var1 - 1, var2, 4096);
            }

            if(var4 == 1) {
               this.method3169(var1, var2, 1024);
               this.method3169(var1, var2 + 1, 16384);
            }

            if(var4 == 2) {
               this.method3169(var1, var2, 4096);
               this.method3169(var1 + 1, var2, 65536);
            }

            if(var4 == 3) {
               this.method3169(var1, var2, 16384);
               this.method3169(var1, var2 - 1, 1024);
            }
         }

         if(var3 == 1 || var3 == 3) {
            if(var4 == 0) {
               this.method3169(var1, var2, 512);
               this.method3169(var1 - 1, var2 + 1, 8192);
            }

            if(var4 == 1) {
               this.method3169(var1, var2, 2048);
               this.method3169(var1 + 1, var2 + 1, 32768);
            }

            if(var4 == 2) {
               this.method3169(var1, var2, 8192);
               this.method3169(var1 + 1, var2 - 1, 512);
            }

            if(var4 == 3) {
               this.method3169(var1, var2, 32768);
               this.method3169(var1 - 1, var2 - 1, 2048);
            }
         }

         if(var3 == 2) {
            if(var4 == 0) {
               this.method3169(var1, var2, 66560);
               this.method3169(var1 - 1, var2, 4096);
               this.method3169(var1, var2 + 1, 16384);
            }

            if(var4 == 1) {
               this.method3169(var1, var2, 5120);
               this.method3169(var1, var2 + 1, 16384);
               this.method3169(var1 + 1, var2, 65536);
            }

            if(var4 == 2) {
               this.method3169(var1, var2, 20480);
               this.method3169(var1 + 1, var2, 65536);
               this.method3169(var1, var2 - 1, 1024);
            }

            if(var4 == 3) {
               this.method3169(var1, var2, 81920);
               this.method3169(var1, var2 - 1, 1024);
               this.method3169(var1 - 1, var2, 4096);
            }
         }
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(IIIB)V",
      garbageValue = "-76"
   )
   void method3166(int var1, int var2, int var3) {
      this.field1765[var1][var2] |= var3;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "959329394"
   )
   public void method3165(int var1, int var2) {
      var1 -= this.field1761;
      var2 -= this.field1762;
      this.field1765[var1][var2] |= 262144;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIIIZI)V",
      garbageValue = "-1839720609"
   )
   public void method3162(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field1761;
      var2 -= this.field1762;
      if(var3 == 0) {
         if(var4 == 0) {
            this.method3166(var1, var2, 128);
            this.method3166(var1 - 1, var2, 8);
         }

         if(var4 == 1) {
            this.method3166(var1, var2, 2);
            this.method3166(var1, var2 + 1, 32);
         }

         if(var4 == 2) {
            this.method3166(var1, var2, 8);
            this.method3166(var1 + 1, var2, 128);
         }

         if(var4 == 3) {
            this.method3166(var1, var2, 32);
            this.method3166(var1, var2 - 1, 2);
         }
      }

      if(var3 == 1 || var3 == 3) {
         if(var4 == 0) {
            this.method3166(var1, var2, 1);
            this.method3166(var1 - 1, var2 + 1, 16);
         }

         if(var4 == 1) {
            this.method3166(var1, var2, 4);
            this.method3166(var1 + 1, var2 + 1, 64);
         }

         if(var4 == 2) {
            this.method3166(var1, var2, 16);
            this.method3166(var1 + 1, var2 - 1, 1);
         }

         if(var4 == 3) {
            this.method3166(var1, var2, 64);
            this.method3166(var1 - 1, var2 - 1, 4);
         }
      }

      if(var3 == 2) {
         if(var4 == 0) {
            this.method3166(var1, var2, 130);
            this.method3166(var1 - 1, var2, 8);
            this.method3166(var1, var2 + 1, 32);
         }

         if(var4 == 1) {
            this.method3166(var1, var2, 10);
            this.method3166(var1, var2 + 1, 32);
            this.method3166(var1 + 1, var2, 128);
         }

         if(var4 == 2) {
            this.method3166(var1, var2, 40);
            this.method3166(var1 + 1, var2, 128);
            this.method3166(var1, var2 - 1, 2);
         }

         if(var4 == 3) {
            this.method3166(var1, var2, 160);
            this.method3166(var1, var2 - 1, 2);
            this.method3166(var1 - 1, var2, 8);
         }
      }

      if(var5) {
         if(var3 == 0) {
            if(var4 == 0) {
               this.method3166(var1, var2, 65536);
               this.method3166(var1 - 1, var2, 4096);
            }

            if(var4 == 1) {
               this.method3166(var1, var2, 1024);
               this.method3166(var1, var2 + 1, 16384);
            }

            if(var4 == 2) {
               this.method3166(var1, var2, 4096);
               this.method3166(var1 + 1, var2, 65536);
            }

            if(var4 == 3) {
               this.method3166(var1, var2, 16384);
               this.method3166(var1, var2 - 1, 1024);
            }
         }

         if(var3 == 1 || var3 == 3) {
            if(var4 == 0) {
               this.method3166(var1, var2, 512);
               this.method3166(var1 - 1, var2 + 1, 8192);
            }

            if(var4 == 1) {
               this.method3166(var1, var2, 2048);
               this.method3166(var1 + 1, var2 + 1, 32768);
            }

            if(var4 == 2) {
               this.method3166(var1, var2, 8192);
               this.method3166(var1 + 1, var2 - 1, 512);
            }

            if(var4 == 3) {
               this.method3166(var1, var2, 32768);
               this.method3166(var1 - 1, var2 - 1, 2048);
            }
         }

         if(var3 == 2) {
            if(var4 == 0) {
               this.method3166(var1, var2, 66560);
               this.method3166(var1 - 1, var2, 4096);
               this.method3166(var1, var2 + 1, 16384);
            }

            if(var4 == 1) {
               this.method3166(var1, var2, 5120);
               this.method3166(var1, var2 + 1, 16384);
               this.method3166(var1 + 1, var2, 65536);
            }

            if(var4 == 2) {
               this.method3166(var1, var2, 20480);
               this.method3166(var1 + 1, var2, 65536);
               this.method3166(var1, var2 - 1, 1024);
            }

            if(var4 == 3) {
               this.method3166(var1, var2, 81920);
               this.method3166(var1, var2 - 1, 1024);
               this.method3166(var1 - 1, var2, 4096);
            }
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-60"
   )
   public void method3167(int var1, int var2) {
      var1 -= this.field1761;
      var2 -= this.field1762;
      this.field1765[var1][var2] |= 2097152;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIIIZB)V",
      garbageValue = "106"
   )
   public void method3163(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = 256;
      if(var5) {
         var6 += 131072;
      }

      var1 -= this.field1761;
      var2 -= this.field1762;

      for(int var7 = var1; var7 < var3 + var1; ++var7) {
         if(var7 >= 0 && var7 < this.field1750) {
            for(int var8 = var2; var8 < var2 + var4; ++var8) {
               if(var8 >= 0 && var8 < this.field1764) {
                  this.method3166(var7, var8, var6);
               }
            }
         }
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-789184813"
   )
   public void method3170(int var1, int var2) {
      var1 -= this.field1761;
      var2 -= this.field1762;
      this.field1765[var1][var2] &= -262145;
   }

   public int[][] getFlags() {
      return this.field1765;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Ljw;",
      garbageValue = "349363186"
   )
   public static class321 method3192(int var0) {
      class321 var1 = (class321)class321.field3414.method2268((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class321.field3416.method2579(12, var0, 24177547);
         var1 = new class321();
         if(var2 != null) {
            var1.method5629(new Buffer(var2));
         }

         var1.method5637();
         class321.field3414.method2275(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-20"
   )
   public static boolean method3193() {
      class306 var0 = (class306)class36.field276.method1051();
      return var0 != null;
   }
}
