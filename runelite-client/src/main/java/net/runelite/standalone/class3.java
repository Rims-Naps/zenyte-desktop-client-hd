package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSCollisionData;

@ObfuscatedName("fr")
public class class3 implements RSCollisionData {
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   static class187 field36;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1694548379
   )
   public int field32;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 390621607
   )
   public int field31;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1375085439
   )
   int field20;
   @ObfuscatedName("ad")
   public int[][] field35;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 346884099
   )
   int field34;

   public class3(int var1, int var2) {
      this.field31 = 0;
      this.field32 = 0;
      this.field20 = var1;
      this.field34 = var2;
      this.field35 = new int[this.field20][this.field34];
      this.method42();
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(IIIIZS)V",
      garbageValue = "-6845"
   )
   public void method50(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field31;
      var2 -= this.field32;
      if(var3 == 0) {
         if(var4 == 0) {
            this.method51(var1, var2, 128);
            this.method51(var1 - 1, var2, 8);
         }

         if(var4 == 1) {
            this.method51(var1, var2, 2);
            this.method51(var1, var2 + 1, 32);
         }

         if(var4 == 2) {
            this.method51(var1, var2, 8);
            this.method51(var1 + 1, var2, 128);
         }

         if(var4 == 3) {
            this.method51(var1, var2, 32);
            this.method51(var1, var2 - 1, 2);
         }
      }

      if(var3 == 1 || var3 == 3) {
         if(var4 == 0) {
            this.method51(var1, var2, 1);
            this.method51(var1 - 1, var2 + 1, 16);
         }

         if(var4 == 1) {
            this.method51(var1, var2, 4);
            this.method51(var1 + 1, var2 + 1, 64);
         }

         if(var4 == 2) {
            this.method51(var1, var2, 16);
            this.method51(var1 + 1, var2 - 1, 1);
         }

         if(var4 == 3) {
            this.method51(var1, var2, 64);
            this.method51(var1 - 1, var2 - 1, 4);
         }
      }

      if(var3 == 2) {
         if(var4 == 0) {
            this.method51(var1, var2, 130);
            this.method51(var1 - 1, var2, 8);
            this.method51(var1, var2 + 1, 32);
         }

         if(var4 == 1) {
            this.method51(var1, var2, 10);
            this.method51(var1, var2 + 1, 32);
            this.method51(var1 + 1, var2, 128);
         }

         if(var4 == 2) {
            this.method51(var1, var2, 40);
            this.method51(var1 + 1, var2, 128);
            this.method51(var1, var2 - 1, 2);
         }

         if(var4 == 3) {
            this.method51(var1, var2, 160);
            this.method51(var1, var2 - 1, 2);
            this.method51(var1 - 1, var2, 8);
         }
      }

      if(var5) {
         if(var3 == 0) {
            if(var4 == 0) {
               this.method51(var1, var2, 65536);
               this.method51(var1 - 1, var2, 4096);
            }

            if(var4 == 1) {
               this.method51(var1, var2, 1024);
               this.method51(var1, var2 + 1, 16384);
            }

            if(var4 == 2) {
               this.method51(var1, var2, 4096);
               this.method51(var1 + 1, var2, 65536);
            }

            if(var4 == 3) {
               this.method51(var1, var2, 16384);
               this.method51(var1, var2 - 1, 1024);
            }
         }

         if(var3 == 1 || var3 == 3) {
            if(var4 == 0) {
               this.method51(var1, var2, 512);
               this.method51(var1 - 1, var2 + 1, 8192);
            }

            if(var4 == 1) {
               this.method51(var1, var2, 2048);
               this.method51(var1 + 1, var2 + 1, 32768);
            }

            if(var4 == 2) {
               this.method51(var1, var2, 8192);
               this.method51(var1 + 1, var2 - 1, 512);
            }

            if(var4 == 3) {
               this.method51(var1, var2, 32768);
               this.method51(var1 - 1, var2 - 1, 2048);
            }
         }

         if(var3 == 2) {
            if(var4 == 0) {
               this.method51(var1, var2, 66560);
               this.method51(var1 - 1, var2, 4096);
               this.method51(var1, var2 + 1, 16384);
            }

            if(var4 == 1) {
               this.method51(var1, var2, 5120);
               this.method51(var1, var2 + 1, 16384);
               this.method51(var1 + 1, var2, 65536);
            }

            if(var4 == 2) {
               this.method51(var1, var2, 20480);
               this.method51(var1 + 1, var2, 65536);
               this.method51(var1, var2 - 1, 1024);
            }

            if(var4 == 3) {
               this.method51(var1, var2, 81920);
               this.method51(var1, var2 - 1, 1024);
               this.method51(var1 - 1, var2, 4096);
            }
         }
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(IIIB)V",
      garbageValue = "-76"
   )
   void method48(int var1, int var2, int var3) {
      this.field35[var1][var2] |= var3;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIIIZI)V",
      garbageValue = "-1839720609"
   )
   public void method44(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field31;
      var2 -= this.field32;
      if(var3 == 0) {
         if(var4 == 0) {
            this.method48(var1, var2, 128);
            this.method48(var1 - 1, var2, 8);
         }

         if(var4 == 1) {
            this.method48(var1, var2, 2);
            this.method48(var1, var2 + 1, 32);
         }

         if(var4 == 2) {
            this.method48(var1, var2, 8);
            this.method48(var1 + 1, var2, 128);
         }

         if(var4 == 3) {
            this.method48(var1, var2, 32);
            this.method48(var1, var2 - 1, 2);
         }
      }

      if(var3 == 1 || var3 == 3) {
         if(var4 == 0) {
            this.method48(var1, var2, 1);
            this.method48(var1 - 1, var2 + 1, 16);
         }

         if(var4 == 1) {
            this.method48(var1, var2, 4);
            this.method48(var1 + 1, var2 + 1, 64);
         }

         if(var4 == 2) {
            this.method48(var1, var2, 16);
            this.method48(var1 + 1, var2 - 1, 1);
         }

         if(var4 == 3) {
            this.method48(var1, var2, 64);
            this.method48(var1 - 1, var2 - 1, 4);
         }
      }

      if(var3 == 2) {
         if(var4 == 0) {
            this.method48(var1, var2, 130);
            this.method48(var1 - 1, var2, 8);
            this.method48(var1, var2 + 1, 32);
         }

         if(var4 == 1) {
            this.method48(var1, var2, 10);
            this.method48(var1, var2 + 1, 32);
            this.method48(var1 + 1, var2, 128);
         }

         if(var4 == 2) {
            this.method48(var1, var2, 40);
            this.method48(var1 + 1, var2, 128);
            this.method48(var1, var2 - 1, 2);
         }

         if(var4 == 3) {
            this.method48(var1, var2, 160);
            this.method48(var1, var2 - 1, 2);
            this.method48(var1 - 1, var2, 8);
         }
      }

      if(var5) {
         if(var3 == 0) {
            if(var4 == 0) {
               this.method48(var1, var2, 65536);
               this.method48(var1 - 1, var2, 4096);
            }

            if(var4 == 1) {
               this.method48(var1, var2, 1024);
               this.method48(var1, var2 + 1, 16384);
            }

            if(var4 == 2) {
               this.method48(var1, var2, 4096);
               this.method48(var1 + 1, var2, 65536);
            }

            if(var4 == 3) {
               this.method48(var1, var2, 16384);
               this.method48(var1, var2 - 1, 1024);
            }
         }

         if(var3 == 1 || var3 == 3) {
            if(var4 == 0) {
               this.method48(var1, var2, 512);
               this.method48(var1 - 1, var2 + 1, 8192);
            }

            if(var4 == 1) {
               this.method48(var1, var2, 2048);
               this.method48(var1 + 1, var2 + 1, 32768);
            }

            if(var4 == 2) {
               this.method48(var1, var2, 8192);
               this.method48(var1 + 1, var2 - 1, 512);
            }

            if(var4 == 3) {
               this.method48(var1, var2, 32768);
               this.method48(var1 - 1, var2 - 1, 2048);
            }
         }

         if(var3 == 2) {
            if(var4 == 0) {
               this.method48(var1, var2, 66560);
               this.method48(var1 - 1, var2, 4096);
               this.method48(var1, var2 + 1, 16384);
            }

            if(var4 == 1) {
               this.method48(var1, var2, 5120);
               this.method48(var1, var2 + 1, 16384);
               this.method48(var1 + 1, var2, 65536);
            }

            if(var4 == 2) {
               this.method48(var1, var2, 20480);
               this.method48(var1 + 1, var2, 65536);
               this.method48(var1, var2 - 1, 1024);
            }

            if(var4 == 3) {
               this.method48(var1, var2, 81920);
               this.method48(var1, var2 - 1, 1024);
               this.method48(var1 - 1, var2, 4096);
            }
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-60"
   )
   public void method49(int var1, int var2) {
      var1 -= this.field31;
      var2 -= this.field32;
      this.field35[var1][var2] |= 2097152;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "573734182"
   )
   public void method42() {
      for(int var1 = 0; var1 < this.field20; ++var1) {
         for(int var2 = 0; var2 < this.field34; ++var2) {
            if(var1 != 0 && var2 != 0 && var1 < this.field20 - 5 && var2 < this.field34 - 5) {
               this.field35[var1][var2] = 16777216;
            } else {
               this.field35[var1][var2] = 16777215;
            }
         }
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(IIIIIZI)V",
      garbageValue = "-1728799904"
   )
   public void method57(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 256;
      if(var6) {
         var7 += 131072;
      }

      var1 -= this.field31;
      var2 -= this.field32;
      int var8;
      if(var5 == 1 || var5 == 3) {
         var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for(var8 = var1; var8 < var3 + var1; ++var8) {
         if(var8 >= 0 && var8 < this.field20) {
            for(int var9 = var2; var9 < var2 + var4; ++var9) {
               if(var9 >= 0 && var9 < this.field34) {
                  this.method51(var8, var9, var7);
               }
            }
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIIB)V",
      garbageValue = "-110"
   )
   void method51(int var1, int var2, int var3) {
      this.field35[var1][var2] &= ~var3;
   }

   public int[][] getFlags() {
      return this.field35;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-789184813"
   )
   public void method52(int var1, int var2) {
      var1 -= this.field31;
      var2 -= this.field32;
      this.field35[var1][var2] &= -262145;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "959329394"
   )
   public void method47(int var1, int var2) {
      var1 -= this.field31;
      var2 -= this.field32;
      this.field35[var1][var2] |= 262144;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIIIZB)V",
      garbageValue = "106"
   )
   public void method45(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = 256;
      if(var5) {
         var6 += 131072;
      }

      var1 -= this.field31;
      var2 -= this.field32;

      for(int var7 = var1; var7 < var3 + var1; ++var7) {
         if(var7 >= 0 && var7 < this.field20) {
            for(int var8 = var2; var8 < var2 + var4; ++var8) {
               if(var8 >= 0 && var8 < this.field34) {
                  this.method48(var7, var8, var6);
               }
            }
         }
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Ljw;",
      garbageValue = "349363186"
   )
   public static class312 method74(int var0) {
      class312 var1 = (class312)class312.field3832.method1813((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class312.field3834.method4398(12, var0, 24177547);
         var1 = new class312();
         if(var2 != null) {
            var1.method6096(new class125(var2));
         }

         var1.method6104();
         class312.field3832.method1820(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-20"
   )
   public static boolean method75() {
      class121 var0 = (class121)class140.field1793.method745();
      return var0 != null;
   }
}
