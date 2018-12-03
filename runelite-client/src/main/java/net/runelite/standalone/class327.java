package net.runelite.standalone;

import net.runelite.api.kit.KitType;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSPlayerComposition;

@ObfuscatedName("ho")
public class class327 implements RSPlayerComposition {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   public static class100 field3966;
   @ObfuscatedName("p")
   public static short[][] field3963;
   @ObfuscatedName("c")
   public static short[] field3956;
   @ObfuscatedName("r")
   public static short[] field3961;
   @ObfuscatedName("d")
   static final int[] field3965;
   @ObfuscatedName("l")
   int[] field3957;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1015231567
   )
   public int field3959;
   @ObfuscatedName("f")
   int[] field3962;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      longValue = -5005867225396267419L
   )
   long field3958;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      longValue = 7470724076630085677L
   )
   long field3960;
   @ObfuscatedName("w")
   public boolean field3964;

   static {
      field3965 = new int[]{8, 11, 4, 6, 9, 7, 10};
      field3966 = new class100(260);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Ljw;ILjw;II)Lds;",
      garbageValue = "538542097"
   )
   public class52 method6288(class312 var1, int var2, class312 var3, int var4) {
      if(this.field3959 != -1) {
         return class127.method2480(this.field3959).method6152(var1, var2, var3, var4);
      } else {
         long var5 = this.field3960;
         int[] var7 = this.field3962;
         if(var1 != null && (var1.field3847 >= 0 || var1.field3843 >= 0)) {
            var7 = new int[12];

            for(int var15 = 0; var15 < 12; ++var15) {
               var7[var15] = this.field3962[var15];
            }

            if(var1.field3847 >= 0) {
               var5 += (long)(var1.field3847 - this.field3962[5] << 40);
               var7[5] = var1.field3847;
            }

            if(var1.field3843 >= 0) {
               var5 += (long)(var1.field3843 - this.field3962[3] << 48);
               var7[3] = var1.field3843;
            }
         }

         class52 var8 = (class52)field3966.method1813(var5);
         if(var8 == null) {
            boolean var9 = false;

            int var11;
            for(int var10 = 0; var10 < 12; ++var10) {
               var11 = var7[var10];
               if(var11 >= 256 && var11 < 512 && !Buffer.method2472(var11 - 256).method4741()) {
                  var9 = true;
               }

               if(var11 >= 512 && !class164.method3014(var11 - 512).method779(this.field3964)) {
                  var9 = true;
               }
            }

            if(var9) {
               if(-1L != this.field3958) {
                  var8 = (class52)field3966.method1813(this.field3958);
               }

               if(var8 == null) {
                  return null;
               }
            }

            if(var8 == null) {
               class34[] var16 = new class34[12];
               var11 = 0;

               int var13;
               for(int var12 = 0; var12 < 12; ++var12) {
                  var13 = var7[var12];
                  class34 var14;
                  if(var13 >= 256 && var13 < 512) {
                     var14 = Buffer.method2472(var13 - 256).method4742();
                     if(var14 != null) {
                        var16[var11++] = var14;
                     }
                  }

                  if(var13 >= 512) {
                     var14 = class164.method3014(var13 - 512).method780(this.field3964);
                     if(var14 != null) {
                        var16[var11++] = var14;
                     }
                  }
               }

               class34 var17 = new class34(var16, var11);

               for(var13 = 0; var13 < 5; ++var13) {
                  if(this.field3957[var13] < field3963[var13].length) {
                     var17.method552(field3956[var13], field3963[var13][this.field3957[var13]]);
                  }

                  if(this.field3957[var13] < class95.field1025[var13].length) {
                     var17.method552(field3961[var13], class95.field1025[var13][this.field3957[var13]]);
                  }
               }

               var8 = var17.method573(64, 850, -30, -50, -30);
               field3966.method1820(var8, var5);
               this.field3958 = var5;
            }
         }

         if(var1 == null && var3 == null) {
            return var8;
         } else {
            class52 var18;
            if(var1 != null && var3 != null) {
               var18 = var1.method6121(var8, var2, var3, var4, (short)-1214);
            } else if(var1 != null) {
               var18 = var1.method6098(var8, var2, 1101942767);
            } else {
               var18 = var3.method6098(var8, var4, 2054105230);
            }

            return var18;
         }
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1708319491"
   )
   void method6290() {
      long var1 = this.field3960;
      int var3 = this.field3962[5];
      int var4 = this.field3962[9];
      this.field3962[5] = var4;
      this.field3962[9] = var3;
      this.field3960 = 0L;

      int var5;
      for(var5 = 0; var5 < 12; ++var5) {
         this.field3960 <<= 4;
         if(this.field3962[var5] >= 256) {
            this.field3960 += (long)(this.field3962[var5] - 256);
         }
      }

      if(this.field3962[0] >= 256) {
         this.field3960 += (long)(this.field3962[0] - 256 >> 4);
      }

      if(this.field3962[1] >= 256) {
         this.field3960 += (long)(this.field3962[1] - 256 >> 8);
      }

      for(var5 = 0; var5 < 5; ++var5) {
         this.field3960 <<= 3;
         this.field3960 += (long)this.field3957[var5];
      }

      this.field3960 <<= 1;
      this.field3960 += (long)(this.field3964?1:0);
      this.field3962[5] = var3;
      this.field3962[9] = var4;
      if(var1 != 0L && var1 != this.field3960) {
         field3966.method1814(var1);
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IZI)V",
      garbageValue = "1472533668"
   )
   public void method6313(int var1, boolean var2) {
      if(var1 != 1 || !this.field3964) {
         int var3 = this.field3962[field3965[var1]];
         if(var3 != 0) {
            var3 -= 256;

            class241 var4;
            do {
               if(!var2) {
                  --var3;
                  if(var3 < 0) {
                     var3 = class241.field3145 - 1;
                  }
               } else {
                  ++var3;
                  if(var3 >= class241.field3145) {
                     var3 = 0;
                  }
               }

               var4 = Buffer.method2472(var3);
            } while(var4 == null || var4.field3155 || var1 + (this.field3964?7:0) != var4.field3146);

            this.field3962[field3965[var1]] = var3 + 256;
            this.method6290();
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-290302744"
   )
   public void method6285(boolean var1) {
      if(this.field3964 != var1) {
         this.method6303((int[])null, this.field3957, var1, -1);
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([I[IZIB)V",
      garbageValue = "51"
   )
   public void method6303(int[] var1, int[] var2, boolean var3, int var4) {
      if(var1 == null) {
         var1 = new int[12];

         for(int var5 = 0; var5 < 7; ++var5) {
            for(int var6 = 0; var6 < class241.field3145; ++var6) {
               class241 var7 = Buffer.method2472(var6);
               if(var7 != null && !var7.field3155 && var7.field3146 == (var3?7:0) + var5) {
                  var1[field3965[var5]] = var6 + 256;
                  break;
               }
            }
         }
      }

      this.field3962 = var1;
      this.field3957 = var2;
      this.field3964 = var3;
      this.field3959 = var4;
      this.method6290();
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(B)Ldb;",
      garbageValue = "-108"
   )
   class34 method6289() {
      if(this.field3959 != -1) {
         return class127.method2480(this.field3959).method6181();
      } else {
         boolean var1 = false;

         int var3;
         for(int var2 = 0; var2 < 12; ++var2) {
            var3 = this.field3962[var2];
            if(var3 >= 256 && var3 < 512 && !Buffer.method2472(var3 - 256).method4743()) {
               var1 = true;
            }

            if(var3 >= 512 && !class164.method3014(var3 - 512).method770(this.field3964)) {
               var1 = true;
            }
         }

         if(var1) {
            return null;
         } else {
            class34[] var7 = new class34[12];
            var3 = 0;

            int var5;
            for(int var4 = 0; var4 < 12; ++var4) {
               var5 = this.field3962[var4];
               class34 var6;
               if(var5 >= 256 && var5 < 512) {
                  var6 = Buffer.method2472(var5 - 256).method4761();
                  if(var6 != null) {
                     var7[var3++] = var6;
                  }
               }

               if(var5 >= 512) {
                  var6 = class164.method3014(var5 - 512).method782(this.field3964);
                  if(var6 != null) {
                     var7[var3++] = var6;
                  }
               }
            }

            class34 var8 = new class34(var7, var3);

            for(var5 = 0; var5 < 5; ++var5) {
               if(this.field3957[var5] < field3963[var5].length) {
                  var8.method552(field3956[var5], field3963[var5][this.field3957[var5]]);
               }

               if(this.field3957[var5] < class95.field1025[var5].length) {
                  var8.method552(field3961[var5], class95.field1025[var5][this.field3957[var5]]);
               }
            }

            return var8;
         }
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-667597464"
   )
   public int method6297() {
      return this.field3959 == -1?(this.field3962[0] << 15) + this.field3962[1] + (this.field3962[11] << 5) + (this.field3962[8] << 10) + (this.field3957[0] << 25) + (this.field3957[4] << 20):305419896 + class127.method2480(this.field3959).field3875;
   }

   public int[] getEquipmentIds() {
      return this.field3962;
   }

   public int getEquipmentId(KitType var1) {
      int var2 = this.getEquipmentIds()[var1.getIndex()];
      return var2 < 512?-1:var2 - 512;
   }

   public int getKitId(KitType var1) {
      int var2 = this.getEquipmentIds()[var1.getIndex()];
      return var2 >= 256 && var2 < 512?var2 - 256:-1;
   }

   public int[] getBodyPartColours() {
      return this.field3957;
   }

   public boolean isFemale() {
      return this.field3964;
   }

   public void setTransformedNpcId(int var1) {
      this.field3959 = var1;
   }

   public void setHash() {
      this.method6290();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Lgm;B)V",
      garbageValue = "-15"
   )
   public void method6287(Buffer var1) {
      var1.method2288(this.field3964?1:0);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         int var3 = this.field3962[field3965[var2]];
         if(var3 == 0) {
            var1.method2288(-1);
         } else {
            var1.method2288(var3 - 256);
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var1.method2288(this.field3957[var2]);
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IZB)V",
      garbageValue = "-30"
   )
   public void method6282(int var1, boolean var2) {
      int var3 = this.field3957[var1];
      if(!var2) {
         do {
            --var3;
            if(var3 < 0) {
               var3 = field3963[var1].length - 1;
            }
         } while(!class118.method2149(var1, var3));
      } else {
         do {
            ++var3;
            if(var3 >= field3963[var1].length) {
               var3 = 0;
            }
         } while(!class118.method2149(var1, var3));
      }

      this.field3957[var1] = var3;
      this.method6290();
   }

   @ObfuscatedName("fo")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1363956072"
   )
   static final void method6314() {
      for(int var0 = 0; var0 < client.field2391; ++var0) {
         --client.field2394[var0];
         if(client.field2394[var0] >= -10) {
            class130 var9 = client.field2188[var0];
            if(var9 == null) {
               Object var10000 = null;
               var9 = class130.method2499(class203.field2849, client.field2294[var0], 0);
               if(var9 == null) {
                  continue;
               }

               client.field2394[var0] += var9.method2498();
               client.field2188[var0] = var9;
            }

            if(client.field2394[var0] < 0) {
               int var2;
               if(client.field2429[var0] != 0) {
                  int var3 = (client.field2429[var0] & 255) * 128;
                  int var4 = client.field2429[var0] >> 16 & 255;
                  int var5 = var4 * 128 + 64 - class32.field303.field1090;
                  if(var5 < 0) {
                     var5 = -var5;
                  }

                  int var6 = client.field2429[var0] >> 8 & 255;
                  int var7 = var6 * 128 + 64 - class32.field303.field1072;
                  if(var7 < 0) {
                     var7 = -var7;
                  }

                  int var8 = var5 + var7 - 128;
                  if(var8 > var3) {
                     client.field2394[var0] = -100;
                     continue;
                  }

                  if(var8 < 0) {
                     var8 = 0;
                  }

                  var2 = (var3 - var8) * client.field2390 / var3;
               } else {
                  var2 = client.field2389;
               }

               if(var2 > 0) {
                  class33 var10 = var9.method2509().method537(class40.field416);
                  class243 var11 = class243.method4769(var10, 100, var2);
                  var11.method4772(client.field2345[var0] - 1);
                  class220.field2985.method5195(var11);
               }

               client.field2394[var0] = -100;
            }
         } else {
            --client.field2391;

            for(int var1 = var0; var1 < client.field2391; ++var1) {
               client.field2294[var1] = client.field2294[var1 + 1];
               client.field2188[var1] = client.field2188[var1 + 1];
               client.field2345[var1] = client.field2345[var1 + 1];
               client.field2394[var1] = client.field2394[var1 + 1];
               client.field2429[var1] = client.field2429[var1 + 1];
            }

            --var0;
         }
      }

      if(client.field2393 && !class59.method1293()) {
         if(client.field2386 != 0 && client.field2328 != -1) {
            class67.method1488(client.field2428, client.field2328, 0, client.field2386, false);
         }

         client.field2393 = false;
      }

   }
}
