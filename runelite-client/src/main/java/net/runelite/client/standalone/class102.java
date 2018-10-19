package net.runelite.client.standalone;

import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
public class class102 {
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "Lih;"
   )
   static class317 field959;
   @ObfuscatedName("c")
   static boolean[] field963;
   @ObfuscatedName("e")
   static byte[][][] field961;
   @ObfuscatedName("br")
   @ObfuscatedSignature(
      signature = "Lle;"
   )
   static class32 field962;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1904201751
   )
   int field964;
   @ObfuscatedName("l")
   byte[][][] field960;

   class102(int var1) {
      this.field964 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIIIIIIII)V",
      garbageValue = "-1324338732"
   )
   void method1720(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(var7 != 0 && this.field964 != 0 && this.field960 != null) {
         var8 = this.method1721(var8, var7);
         var7 = this.method1722(var7);
         class89.method1542(var1, var2, var5, var6, var3, var4, this.field960[var7 - 1][var8], this.field964);
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "359956988"
   )
   void method1728() {
      byte[] var1 = new byte[this.field964 * this.field964];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field964 - 1; var3 >= 0; --var3) {
         for(var4 = this.field964 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field960[4][0] = var1;
      var1 = new byte[this.field964 * this.field964];
      var2 = 0;

      for(var3 = this.field964 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field964; ++var4) {
            if(var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field960[4][1] = var1;
      var1 = new byte[this.field964 * this.field964];
      var2 = 0;

      for(var3 = 0; var3 < this.field964; ++var3) {
         for(var4 = 0; var4 < this.field964; ++var4) {
            if(var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field960[4][2] = var1;
      var1 = new byte[this.field964 * this.field964];
      var2 = 0;

      for(var3 = 0; var3 < this.field964; ++var3) {
         for(var4 = this.field964 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field960[4][3] = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1672731882"
   )
   void method1733() {
      byte[] var1 = new byte[this.field964 * this.field964];
      boolean var2 = false;
      var1 = new byte[this.field964 * this.field964];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field964; ++var3) {
         for(var4 = 0; var4 < this.field964; ++var4) {
            if(var4 <= var3 - this.field964 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field960[6][0] = var1;
      var1 = new byte[this.field964 * this.field964];
      var5 = 0;

      for(var3 = this.field964 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field964; ++var4) {
            if(var4 <= var3 - this.field964 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field960[6][1] = var1;
      var1 = new byte[this.field964 * this.field964];
      var5 = 0;

      for(var3 = this.field964 - 1; var3 >= 0; --var3) {
         for(var4 = this.field964 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 - this.field964 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field960[6][2] = var1;
      var1 = new byte[this.field964 * this.field964];
      var5 = 0;

      for(var3 = 0; var3 < this.field964; ++var3) {
         for(var4 = this.field964 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 - this.field964 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field960[6][3] = var1;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2067883983"
   )
   void method1763() {
      byte[] var1 = new byte[this.field964 * this.field964];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field964 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field964; ++var4) {
            if(var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field960[3][0] = var1;
      var1 = new byte[this.field964 * this.field964];
      var2 = 0;

      for(var3 = 0; var3 < this.field964; ++var3) {
         for(var4 = 0; var4 < this.field964; ++var4) {
            if(var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field960[3][1] = var1;
      var1 = new byte[this.field964 * this.field964];
      var2 = 0;

      for(var3 = 0; var3 < this.field964; ++var3) {
         for(var4 = this.field964 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field960[3][2] = var1;
      var1 = new byte[this.field964 * this.field964];
      var2 = 0;

      for(var3 = this.field964 - 1; var3 >= 0; --var3) {
         for(var4 = this.field964 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field960[3][3] = var1;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1087120621"
   )
   void method1726() {
      byte[] var1 = new byte[this.field964 * this.field964];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field964 - 1; var3 >= 0; --var3) {
         for(var4 = this.field964 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field960[2][0] = var1;
      var1 = new byte[this.field964 * this.field964];
      var2 = 0;

      for(var3 = this.field964 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field964; ++var4) {
            if(var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field960[2][1] = var1;
      var1 = new byte[this.field964 * this.field964];
      var2 = 0;

      for(var3 = 0; var3 < this.field964; ++var3) {
         for(var4 = 0; var4 < this.field964; ++var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field960[2][2] = var1;
      var1 = new byte[this.field964 * this.field964];
      var2 = 0;

      for(var3 = 0; var3 < this.field964; ++var3) {
         for(var4 = this.field964 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field960[2][3] = var1;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "2"
   )
   void method1725() {
      byte[] var1 = new byte[this.field964 * this.field964];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field964 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field964; ++var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field960[1][0] = var1;
      var1 = new byte[this.field964 * this.field964];
      var2 = 0;

      for(var3 = 0; var3 < this.field964; ++var3) {
         for(var4 = 0; var4 < this.field964; ++var4) {
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

      this.field960[1][1] = var1;
      var1 = new byte[this.field964 * this.field964];
      var2 = 0;

      for(var3 = 0; var3 < this.field964; ++var3) {
         for(var4 = this.field964 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field960[1][2] = var1;
      var1 = new byte[this.field964 * this.field964];
      var2 = 0;

      for(var3 = this.field964 - 1; var3 >= 0; --var3) {
         for(var4 = this.field964 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field960[1][3] = var1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1459987752"
   )
   void method1724() {
      byte[] var1 = new byte[this.field964 * this.field964];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field964; ++var3) {
         for(var4 = 0; var4 < this.field964; ++var4) {
            if(var4 <= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field960[0][0] = var1;
      var1 = new byte[this.field964 * this.field964];
      var2 = 0;

      for(var3 = this.field964 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field964; ++var4) {
            if(var4 <= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field960[0][1] = var1;
      var1 = new byte[this.field964 * this.field964];
      var2 = 0;

      for(var3 = 0; var3 < this.field964; ++var3) {
         for(var4 = 0; var4 < this.field964; ++var4) {
            if(var4 >= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field960[0][2] = var1;
      var1 = new byte[this.field964 * this.field964];
      var2 = 0;

      for(var3 = this.field964 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field964; ++var4) {
            if(var4 >= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field960[0][3] = var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1507483910"
   )
   void method1731() {
      byte[] var1 = new byte[this.field964 * this.field964];
      boolean var2 = false;
      var1 = new byte[this.field964 * this.field964];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field964; ++var3) {
         for(var4 = 0; var4 < this.field964; ++var4) {
            if(var4 >= var3 - this.field964 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field960[7][0] = var1;
      var1 = new byte[this.field964 * this.field964];
      var5 = 0;

      for(var3 = this.field964 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field964; ++var4) {
            if(var4 >= var3 - this.field964 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field960[7][1] = var1;
      var1 = new byte[this.field964 * this.field964];
      var5 = 0;

      for(var3 = this.field964 - 1; var3 >= 0; --var3) {
         for(var4 = this.field964 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 - this.field964 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field960[7][2] = var1;
      var1 = new byte[this.field964 * this.field964];
      var5 = 0;

      for(var3 = 0; var3 < this.field964; ++var3) {
         for(var4 = this.field964 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 - this.field964 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field960[7][3] = var1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1902310189"
   )
   int method1721(int var1, int var2) {
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
   void method1723() {
      if(this.field960 == null) {
         this.field960 = new byte[8][4][];
         this.method1724();
         this.method1725();
         this.method1726();
         this.method1763();
         this.method1728();
         this.method1729();
         this.method1733();
         this.method1731();
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "2107488362"
   )
   int method1722(int var1) {
      return var1 != 9 && var1 != 10?(var1 == 11?8:var1):1;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "53"
   )
   void method1729() {
      byte[] var1 = new byte[this.field964 * this.field964];
      boolean var2 = false;
      var1 = new byte[this.field964 * this.field964];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field964; ++var3) {
         for(var4 = 0; var4 < this.field964; ++var4) {
            if(var4 <= this.field964 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field960[5][0] = var1;
      var1 = new byte[this.field964 * this.field964];
      var5 = 0;

      for(var3 = 0; var3 < this.field964; ++var3) {
         for(var4 = 0; var4 < this.field964; ++var4) {
            if(var3 <= this.field964 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field960[5][1] = var1;
      var1 = new byte[this.field964 * this.field964];
      var5 = 0;

      for(var3 = 0; var3 < this.field964; ++var3) {
         for(var4 = 0; var4 < this.field964; ++var4) {
            if(var4 >= this.field964 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field960[5][2] = var1;
      var1 = new byte[this.field964 * this.field964];
      var5 = 0;

      for(var3 = 0; var3 < this.field964; ++var3) {
         for(var4 = 0; var4 < this.field964; ++var4) {
            if(var3 >= this.field964 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field960[5][3] = var1;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1505952805"
   )
   static final boolean method1761() {
      return class327.field3519;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/io/File;ZI)Z",
      garbageValue = "196129611"
   )
   static boolean method1743(File var0, boolean var1) {
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

   @ObfuscatedName("gc")
   @ObfuscatedSignature(
      signature = "(IIIIIIIIII)V",
      garbageValue = "2087616706"
   )
   static final void method1757(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      class274 var9 = null;

      for(class274 var10 = (class274)client.field3861.method5604(); var10 != null; var10 = (class274)client.field3861.method5606()) {
         if(var0 == var10.field2998 && var10.field2992 == var1 && var2 == var10.field2993 && var3 == var10.field2991) {
            var9 = var10;
            break;
         }
      }

      if(var9 == null) {
         var9 = new class274();
         var9.field2998 = var0;
         var9.field2991 = var3;
         var9.field2992 = var1;
         var9.field2993 = var2;
         class135.method2508(var9);
         client.field3861.method5600(var9);
      }

      var9.field2997 = var4;
      var9.field2994 = var5;
      var9.field2990 = var6;
      var9.field3000 = var7;
      var9.field2999 = var8;
   }
}
