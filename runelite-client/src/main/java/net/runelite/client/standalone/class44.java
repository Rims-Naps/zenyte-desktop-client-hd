package net.runelite.client.standalone;

import net.runelite.api.kit.KitType;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSPlayerComposition;

@ObfuscatedName("ho")
public class class44 implements RSPlayerComposition {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   public static class124 field346;
   @ObfuscatedName("r")
   public static short[] field341;
   @ObfuscatedName("p")
   public static short[][] field343;
   @ObfuscatedName("c")
   public static short[] field336;
   @ObfuscatedName("d")
   static final int[] field345;
   @ObfuscatedName("f")
   int[] field342;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      longValue = 7470724076630085677L
   )
   long field340;
   @ObfuscatedName("l")
   int[] field337;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1015231567
   )
   public int field339;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      longValue = -5005867225396267419L
   )
   long field338;
   @ObfuscatedName("w")
   public boolean field344;

   static {
      field345 = new int[]{8, 11, 4, 6, 9, 7, 10};
      field346 = new class124(260);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([I[IZIB)V",
      garbageValue = "51"
   )
   public void method776(int[] var1, int[] var2, boolean var3, int var4) {
      if(var1 == null) {
         var1 = new int[12];

         for(int var5 = 0; var5 < 7; ++var5) {
            for(int var6 = 0; var6 < class223.field2176; ++var6) {
               class223 var7 = Buffer.method2121(var6);
               if(var7 != null && !var7.field2186 && var7.field2177 == (var3?7:0) + var5) {
                  var1[field345[var5]] = var6 + 256;
                  break;
               }
            }
         }
      }

      this.field342 = var1;
      this.field337 = var2;
      this.field344 = var3;
      this.field339 = var4;
      this.method763();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-667597464"
   )
   public int method770() {
      return this.field339 == -1?(this.field342[0] << 15) + this.field342[1] + (this.field342[11] << 5) + (this.field342[8] << 10) + (this.field337[0] << 25) + (this.field337[4] << 20):305419896 + class25.method361(this.field339).field2157;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(B)Ldb;",
      garbageValue = "-108"
   )
   class218 method762() {
      if(this.field339 != -1) {
         return class25.method361(this.field339).method3980();
      } else {
         boolean var1 = false;

         int var3;
         for(int var2 = 0; var2 < 12; ++var2) {
            var3 = this.field342[var2];
            if(var3 >= 256 && var3 < 512 && !Buffer.method2121(var3 - 256).method3994()) {
               var1 = true;
            }

            if(var3 >= 512 && !class67.method1152(var3 - 512).method2152(this.field344)) {
               var1 = true;
            }
         }

         if(var1) {
            return null;
         } else {
            class218[] var7 = new class218[12];
            var3 = 0;

            int var5;
            for(int var4 = 0; var4 < 12; ++var4) {
               var5 = this.field342[var4];
               class218 var6;
               if(var5 >= 256 && var5 < 512) {
                  var6 = Buffer.method2121(var5 - 256).method4012();
                  if(var6 != null) {
                     var7[var3++] = var6;
                  }
               }

               if(var5 >= 512) {
                  var6 = class67.method1152(var5 - 512).method2164(this.field344);
                  if(var6 != null) {
                     var7[var3++] = var6;
                  }
               }
            }

            class218 var8 = new class218(var7, var3);

            for(var5 = 0; var5 < 5; ++var5) {
               if(this.field337[var5] < field343[var5].length) {
                  var8.method3842(field336[var5], field343[var5][this.field337[var5]]);
               }

               if(this.field337[var5] < class128.field1221[var5].length) {
                  var8.method3842(field341[var5], class128.field1221[var5][this.field337[var5]]);
               }
            }

            return var8;
         }
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Ljw;ILjw;II)Lds;",
      garbageValue = "538542097"
   )
   public class200 method761(class321 var1, int var2, class321 var3, int var4) {
      if(this.field339 != -1) {
         return class25.method361(this.field339).method3951(var1, var2, var3, var4);
      } else {
         long var5 = this.field340;
         int[] var7 = this.field342;
         if(var1 != null && (var1.field3429 >= 0 || var1.field3425 >= 0)) {
            var7 = new int[12];

            for(int var15 = 0; var15 < 12; ++var15) {
               var7[var15] = this.field342[var15];
            }

            if(var1.field3429 >= 0) {
               var5 += (long)(var1.field3429 - this.field342[5] << 40);
               var7[5] = var1.field3429;
            }

            if(var1.field3425 >= 0) {
               var5 += (long)(var1.field3425 - this.field342[3] << 48);
               var7[3] = var1.field3425;
            }
         }

         class200 var8 = (class200)field346.method2268(var5);
         if(var8 == null) {
            boolean var9 = false;

            int var11;
            for(int var10 = 0; var10 < 12; ++var10) {
               var11 = var7[var10];
               if(var11 >= 256 && var11 < 512 && !Buffer.method2121(var11 - 256).method3992()) {
                  var9 = true;
               }

               if(var11 >= 512 && !class67.method1152(var11 - 512).method2161(this.field344)) {
                  var9 = true;
               }
            }

            if(var9) {
               if(-1L != this.field338) {
                  var8 = (class200)field346.method2268(this.field338);
               }

               if(var8 == null) {
                  return null;
               }
            }

            if(var8 == null) {
               class218[] var16 = new class218[12];
               var11 = 0;

               int var13;
               for(int var12 = 0; var12 < 12; ++var12) {
                  var13 = var7[var12];
                  class218 var14;
                  if(var13 >= 256 && var13 < 512) {
                     var14 = Buffer.method2121(var13 - 256).method3993();
                     if(var14 != null) {
                        var16[var11++] = var14;
                     }
                  }

                  if(var13 >= 512) {
                     var14 = class67.method1152(var13 - 512).method2162(this.field344);
                     if(var14 != null) {
                        var16[var11++] = var14;
                     }
                  }
               }

               class218 var17 = new class218(var16, var11);

               for(var13 = 0; var13 < 5; ++var13) {
                  if(this.field337[var13] < field343[var13].length) {
                     var17.method3842(field336[var13], field343[var13][this.field337[var13]]);
                  }

                  if(this.field337[var13] < class128.field1221[var13].length) {
                     var17.method3842(field341[var13], class128.field1221[var13][this.field337[var13]]);
                  }
               }

               var8 = var17.method3863(64, 850, -30, -50, -30);
               field346.method2275(var8, var5);
               this.field338 = var5;
            }
         }

         if(var1 == null && var3 == null) {
            return var8;
         } else {
            class200 var18;
            if(var1 != null && var3 != null) {
               var18 = var1.method5654(var8, var2, var3, var4, (short)-1214);
            } else if(var1 != null) {
               var18 = var1.method5631(var8, var2, 1101942767);
            } else {
               var18 = var3.method5631(var8, var4, 2054105230);
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
   void method763() {
      long var1 = this.field340;
      int var3 = this.field342[5];
      int var4 = this.field342[9];
      this.field342[5] = var4;
      this.field342[9] = var3;
      this.field340 = 0L;

      int var5;
      for(var5 = 0; var5 < 12; ++var5) {
         this.field340 <<= 4;
         if(this.field342[var5] >= 256) {
            this.field340 += (long)(this.field342[var5] - 256);
         }
      }

      if(this.field342[0] >= 256) {
         this.field340 += (long)(this.field342[0] - 256 >> 4);
      }

      if(this.field342[1] >= 256) {
         this.field340 += (long)(this.field342[1] - 256 >> 8);
      }

      for(var5 = 0; var5 < 5; ++var5) {
         this.field340 <<= 3;
         this.field340 += (long)this.field337[var5];
      }

      this.field340 <<= 1;
      this.field340 += (long)(this.field344?1:0);
      this.field342[5] = var3;
      this.field342[9] = var4;
      if(var1 != 0L && var1 != this.field340) {
         field346.method2269(var1);
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Lgm;B)V",
      garbageValue = "-15"
   )
   public void method760(Buffer var1) {
      var1.writeByte(this.field344?1:0);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         int var3 = this.field342[field345[var2]];
         if(var3 == 0) {
            var1.writeByte(-1);
         } else {
            var1.writeByte(var3 - 256);
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var1.writeByte(this.field337[var2]);
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IZI)V",
      garbageValue = "1472533668"
   )
   public void method786(int var1, boolean var2) {
      if(var1 != 1 || !this.field344) {
         int var3 = this.field342[field345[var1]];
         if(var3 != 0) {
            var3 -= 256;

            class223 var4;
            do {
               if(!var2) {
                  --var3;
                  if(var3 < 0) {
                     var3 = class223.field2176 - 1;
                  }
               } else {
                  ++var3;
                  if(var3 >= class223.field2176) {
                     var3 = 0;
                  }
               }

               var4 = Buffer.method2121(var3);
            } while(var4 == null || var4.field2186 || var1 + (this.field344?7:0) != var4.field2177);

            this.field342[field345[var1]] = var3 + 256;
            this.method763();
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-290302744"
   )
   public void method758(boolean var1) {
      if(this.field344 != var1) {
         this.method776((int[])null, this.field337, var1, -1);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IZB)V",
      garbageValue = "-30"
   )
   public void method755(int var1, boolean var2) {
      int var3 = this.field337[var1];
      if(!var2) {
         do {
            --var3;
            if(var3 < 0) {
               var3 = field343[var1].length - 1;
            }
         } while(!class164.method2832(var1, var3));
      } else {
         do {
            ++var3;
            if(var3 >= field343[var1].length) {
               var3 = 0;
            }
         } while(!class164.method2832(var1, var3));
      }

      this.field337[var1] = var3;
      this.method763();
   }

   public int[] getEquipmentIds() {
      return this.field342;
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
      return this.field337;
   }

   public boolean isFemale() {
      return this.field344;
   }

   public void setTransformedNpcId(int var1) {
      this.field339 = var1;
   }

   @ObfuscatedName("fo")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1363956072"
   )
   static final void method787() {
      for(int var0 = 0; var0 < client.field3970; ++var0) {
         --client.field3973[var0];
         if(client.field3973[var0] >= -10) {
            class93 var9 = client.field3767[var0];
            if(var9 == null) {
               Object var10000 = null;
               var9 = class93.method1640(class104.field971, client.field3873[var0], 0);
               if(var9 == null) {
                  continue;
               }

               client.field3973[var0] += var9.method1639();
               client.field3767[var0] = var9;
            }

            if(client.field3973[var0] < 0) {
               int var2;
               if(client.field4008[var0] != 0) {
                  int var3 = (client.field4008[var0] & 255) * 128;
                  int var4 = client.field4008[var0] >> 16 & 255;
                  int var5 = var4 * 128 + 64 - class5.field43.field1277;
                  if(var5 < 0) {
                     var5 = -var5;
                  }

                  int var6 = client.field4008[var0] >> 8 & 255;
                  int var7 = var6 * 128 + 64 - class5.field43.field1259;
                  if(var7 < 0) {
                     var7 = -var7;
                  }

                  int var8 = var5 + var7 - 128;
                  if(var8 > var3) {
                     client.field3973[var0] = -100;
                     continue;
                  }

                  if(var8 < 0) {
                     var8 = 0;
                  }

                  var2 = (var3 - var8) * client.field3969 / var3;
               } else {
                  var2 = client.field3968;
               }

               if(var2 > 0) {
                  class58 var10 = var9.method1650().method1020(class287.field3121);
                  class243 var11 = class243.method4313(var10, 100, var2);
                  var11.method4316(client.field3924[var0] - 1);
                  class61.field468.method4958(var11);
               }

               client.field3973[var0] = -100;
            }
         } else {
            --client.field3970;

            for(int var1 = var0; var1 < client.field3970; ++var1) {
               client.field3873[var1] = client.field3873[var1 + 1];
               client.field3767[var1] = client.field3767[var1 + 1];
               client.field3924[var1] = client.field3924[var1 + 1];
               client.field3973[var1] = client.field3973[var1 + 1];
               client.field4008[var1] = client.field4008[var1 + 1];
            }

            --var0;
         }
      }

      if(client.field3972 && !class96.method1684()) {
         if(client.field3965 != 0 && client.field3907 != -1) {
            class136.method2511(client.field4007, client.field3907, 0, client.field3965, false);
         }

         client.field3972 = false;
      }

   }
}
