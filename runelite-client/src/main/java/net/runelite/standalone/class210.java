package net.runelite.standalone;

import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
public class class210 {
   @ObfuscatedName("c")
   static boolean[] field2893;
   @ObfuscatedName("br")
   @ObfuscatedSignature(
      signature = "Lle;"
   )
   static class303 field2892;
   @ObfuscatedName("e")
   static byte[][][] field2891;
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "Lih;"
   )
   static class21 field2889;
   @ObfuscatedName("l")
   byte[][][] field2890;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1904201751
   )
   int field2894;

   class210(int var1) {
      this.field2894 = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1672731882"
   )
   void method4215() {
      byte[] var1 = new byte[this.field2894 * this.field2894];
      boolean var2 = false;
      var1 = new byte[this.field2894 * this.field2894];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field2894; ++var3) {
         for(var4 = 0; var4 < this.field2894; ++var4) {
            if(var4 <= var3 - this.field2894 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field2890[6][0] = var1;
      var1 = new byte[this.field2894 * this.field2894];
      var5 = 0;

      for(var3 = this.field2894 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field2894; ++var4) {
            if(var4 <= var3 - this.field2894 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field2890[6][1] = var1;
      var1 = new byte[this.field2894 * this.field2894];
      var5 = 0;

      for(var3 = this.field2894 - 1; var3 >= 0; --var3) {
         for(var4 = this.field2894 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 - this.field2894 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field2890[6][2] = var1;
      var1 = new byte[this.field2894 * this.field2894];
      var5 = 0;

      for(var3 = 0; var3 < this.field2894; ++var3) {
         for(var4 = this.field2894 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 - this.field2894 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field2890[6][3] = var1;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1087120621"
   )
   void method4208() {
      byte[] var1 = new byte[this.field2894 * this.field2894];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field2894 - 1; var3 >= 0; --var3) {
         for(var4 = this.field2894 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field2890[2][0] = var1;
      var1 = new byte[this.field2894 * this.field2894];
      var2 = 0;

      for(var3 = this.field2894 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field2894; ++var4) {
            if(var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field2890[2][1] = var1;
      var1 = new byte[this.field2894 * this.field2894];
      var2 = 0;

      for(var3 = 0; var3 < this.field2894; ++var3) {
         for(var4 = 0; var4 < this.field2894; ++var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field2890[2][2] = var1;
      var1 = new byte[this.field2894 * this.field2894];
      var2 = 0;

      for(var3 = 0; var3 < this.field2894; ++var3) {
         for(var4 = this.field2894 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field2890[2][3] = var1;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "2"
   )
   void method4207() {
      byte[] var1 = new byte[this.field2894 * this.field2894];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field2894 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field2894; ++var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field2890[1][0] = var1;
      var1 = new byte[this.field2894 * this.field2894];
      var2 = 0;

      for(var3 = 0; var3 < this.field2894; ++var3) {
         for(var4 = 0; var4 < this.field2894; ++var4) {
            if(var2 >= 0 && var2 < var1.length) {
               if(var4 >= var3 << 1) {
                  var1[var2] = -1;
               }

               ++var2;
            } else {
               ++var2;
            }
         }
      }

      this.field2890[1][1] = var1;
      var1 = new byte[this.field2894 * this.field2894];
      var2 = 0;

      for(var3 = 0; var3 < this.field2894; ++var3) {
         for(var4 = this.field2894 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field2890[1][2] = var1;
      var1 = new byte[this.field2894 * this.field2894];
      var2 = 0;

      for(var3 = this.field2894 - 1; var3 >= 0; --var3) {
         for(var4 = this.field2894 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field2890[1][3] = var1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1902310189"
   )
   int method4203(int var1, int var2) {
      if(var2 == 9) {
         var1 = var1 + 1 & 3;
      }

      if(var2 == 10) {
         var1 = var1 + 3 & 3;
      }

      if(var2 == 11) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1779988406"
   )
   void method4205() {
      if(this.field2890 == null) {
         this.field2890 = new byte[8][4][];
         this.method4206();
         this.method4207();
         this.method4208();
         this.method4245();
         this.method4210();
         this.method4211();
         this.method4215();
         this.method4213();
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIIIIIIII)V",
      garbageValue = "-1324338732"
   )
   void method4202(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(var7 != 0 && this.field2894 != 0 && this.field2890 != null) {
         var8 = this.method4203(var8, var7);
         var7 = this.method4204(var7);
         Rasterizer2D.method3148(var1, var2, var5, var6, var3, var4, this.field2890[var7 - 1][var8], this.field2894, true);
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2067883983"
   )
   void method4245() {
      byte[] var1 = new byte[this.field2894 * this.field2894];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field2894 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field2894; ++var4) {
            if(var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field2890[3][0] = var1;
      var1 = new byte[this.field2894 * this.field2894];
      var2 = 0;

      for(var3 = 0; var3 < this.field2894; ++var3) {
         for(var4 = 0; var4 < this.field2894; ++var4) {
            if(var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field2890[3][1] = var1;
      var1 = new byte[this.field2894 * this.field2894];
      var2 = 0;

      for(var3 = 0; var3 < this.field2894; ++var3) {
         for(var4 = this.field2894 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field2890[3][2] = var1;
      var1 = new byte[this.field2894 * this.field2894];
      var2 = 0;

      for(var3 = this.field2894 - 1; var3 >= 0; --var3) {
         for(var4 = this.field2894 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field2890[3][3] = var1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "359956988"
   )
   void method4210() {
      byte[] var1 = new byte[this.field2894 * this.field2894];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field2894 - 1; var3 >= 0; --var3) {
         for(var4 = this.field2894 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field2890[4][0] = var1;
      var1 = new byte[this.field2894 * this.field2894];
      var2 = 0;

      for(var3 = this.field2894 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field2894; ++var4) {
            if(var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field2890[4][1] = var1;
      var1 = new byte[this.field2894 * this.field2894];
      var2 = 0;

      for(var3 = 0; var3 < this.field2894; ++var3) {
         for(var4 = 0; var4 < this.field2894; ++var4) {
            if(var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field2890[4][2] = var1;
      var1 = new byte[this.field2894 * this.field2894];
      var2 = 0;

      for(var3 = 0; var3 < this.field2894; ++var3) {
         for(var4 = this.field2894 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field2890[4][3] = var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1507483910"
   )
   void method4213() {
      byte[] var1 = new byte[this.field2894 * this.field2894];
      boolean var2 = false;
      var1 = new byte[this.field2894 * this.field2894];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field2894; ++var3) {
         for(var4 = 0; var4 < this.field2894; ++var4) {
            if(var4 >= var3 - this.field2894 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field2890[7][0] = var1;
      var1 = new byte[this.field2894 * this.field2894];
      var5 = 0;

      for(var3 = this.field2894 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field2894; ++var4) {
            if(var4 >= var3 - this.field2894 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field2890[7][1] = var1;
      var1 = new byte[this.field2894 * this.field2894];
      var5 = 0;

      for(var3 = this.field2894 - 1; var3 >= 0; --var3) {
         for(var4 = this.field2894 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 - this.field2894 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field2890[7][2] = var1;
      var1 = new byte[this.field2894 * this.field2894];
      var5 = 0;

      for(var3 = 0; var3 < this.field2894; ++var3) {
         for(var4 = this.field2894 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 - this.field2894 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field2890[7][3] = var1;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "53"
   )
   void method4211() {
      byte[] var1 = new byte[this.field2894 * this.field2894];
      boolean var2 = false;
      var1 = new byte[this.field2894 * this.field2894];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field2894; ++var3) {
         for(var4 = 0; var4 < this.field2894; ++var4) {
            if(var4 <= this.field2894 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field2890[5][0] = var1;
      var1 = new byte[this.field2894 * this.field2894];
      var5 = 0;

      for(var3 = 0; var3 < this.field2894; ++var3) {
         for(var4 = 0; var4 < this.field2894; ++var4) {
            if(var3 <= this.field2894 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field2890[5][1] = var1;
      var1 = new byte[this.field2894 * this.field2894];
      var5 = 0;

      for(var3 = 0; var3 < this.field2894; ++var3) {
         for(var4 = 0; var4 < this.field2894; ++var4) {
            if(var4 >= this.field2894 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field2890[5][2] = var1;
      var1 = new byte[this.field2894 * this.field2894];
      var5 = 0;

      for(var3 = 0; var3 < this.field2894; ++var3) {
         for(var4 = 0; var4 < this.field2894; ++var4) {
            if(var3 >= this.field2894 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field2890[5][3] = var1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1459987752"
   )
   void method4206() {
      byte[] var1 = new byte[this.field2894 * this.field2894];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field2894; ++var3) {
         for(var4 = 0; var4 < this.field2894; ++var4) {
            if(var4 <= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field2890[0][0] = var1;
      var1 = new byte[this.field2894 * this.field2894];
      var2 = 0;

      for(var3 = this.field2894 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field2894; ++var4) {
            if(var4 <= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field2890[0][1] = var1;
      var1 = new byte[this.field2894 * this.field2894];
      var2 = 0;

      for(var3 = 0; var3 < this.field2894; ++var3) {
         for(var4 = 0; var4 < this.field2894; ++var4) {
            if(var4 >= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field2890[0][2] = var1;
      var1 = new byte[this.field2894 * this.field2894];
      var2 = 0;

      for(var3 = this.field2894 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field2894; ++var4) {
            if(var4 >= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field2890[0][3] = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "2107488362"
   )
   int method4204(int var1) {
      return var1 != 9 && var1 != 10?(var1 == 11?8:var1):1;
   }

   @ObfuscatedName("gc")
   @ObfuscatedSignature(
      signature = "(IIIIIIIIII)V",
      garbageValue = "2087616706"
   )
   static final void method4239(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      class87 var9 = null;

      for(class87 var10 = (class87)client.field2282.method1503(); var10 != null; var10 = (class87)client.field2282.method1505()) {
         if(var0 == var10.field938 && var10.field932 == var1 && var2 == var10.field933 && var3 == var10.field931) {
            var9 = var10;
            break;
         }
      }

      if(var9 == null) {
         var9 = new class87();
         var9.field938 = var0;
         var9.field931 = var3;
         var9.field932 = var1;
         var9.field933 = var2;
         class96.method1773(var9);
         client.field2282.method1499(var9);
      }

      var9.field937 = var4;
      var9.field934 = var5;
      var9.field930 = var6;
      var9.field940 = var7;
      var9.field939 = var8;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1505952805"
   )
   static final boolean method4243() {
      return class298.field3713;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/io/File;ZI)Z",
      garbageValue = "196129611"
   )
   static boolean method4225(File var0, boolean var1) {
      try {
         RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
         int var3 = var2.read();
         var2.seek(0L);
         var2.write(var3);
         var2.seek(0L);
         var2.close();
         if(var1) {
            var0.delete();
         }

         return true;
      } catch (Exception var4) {
         return false;
      }
   }
}
