package net.runelite.standalone;

import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
public class class317 {
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      longValue = 644221176751913133L
   )
   public final long field3905;
   @ObfuscatedName("s")
   String field3902;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -2124775599
   )
   public final int field3900;
   @ObfuscatedName("e")
   String field3903;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Le;"
   )
   public final class307 field3899;

   @ObfuscatedSignature(
      signature = "(Lgm;BI)V"
   )
   class317(Buffer var1, byte var2, int var3) {
      this.field3902 = var1.readString();
      this.field3903 = var1.readString();
      this.field3900 = var1.readUnsignedShort();
      this.field3905 = var1.method2349();
      int var4 = var1.readInt();
      int var5 = var1.readInt();
      this.field3899 = new class307();
      this.field3899.method6036(2);
      this.field3899.method6041(var2);
      this.field3899.field3799 = var4;
      this.field3899.field3794 = var5;
      this.field3899.field3795 = 0;
      this.field3899.field3796 = 0;
      this.field3899.field3792 = var3;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "1854517809"
   )
   public String method6211() {
      return this.field3903;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-1570653547"
   )
   public String method6206() {
      return this.field3902;
   }

   @ObfuscatedName("js")
   @ObfuscatedSignature(
      signature = "(Lhw;IIIB)V",
      garbageValue = "0"
   )
   static final void method6212(class187 var0, int var1, int var2, int var3) {
      class185.method3733();
      class198 var4 = var0.method3762(false);
      if(var4 != null) {
         Rasterizer2D.method3138(var1, var2, var4.field2798 + var1, var2 + var4.field2795);
         if(client.field2411 != 2 && client.field2411 != 5) {
            int var5 = client.field2223 & 2047;
            int var6 = class32.field303.field1090 / 32 + 48;
            int var7 = 464 - class32.field303.field1072 / 32;
            class32.field304.method231(var1, var2, var4.field2798, var4.field2795, var6, var7, var5, 256, var4.field2796, var4.field2793);

            int var8;
            int var9;
            int var10;
            for(var8 = 0; var8 < client.field2379; ++var8) {
               var9 = client.field2190[var8] * 4 + 2 - class32.field303.field1090 / 32;
               var10 = client.field2381[var8] * 4 + 2 - class32.field303.field1072 / 32;
               class277.method5381(var1, var2, var9, var10, client.field2382[var8], var4);
            }

            int var11;
            int var12;
            for(var8 = 0; var8 < 104; ++var8) {
               for(var9 = 0; var9 < 104; ++var9) {
                  class70 var15 = client.field2182[class260.field3393][var8][var9];
                  if(var15 != null) {
                     var11 = var8 * 4 + 2 - class32.field303.field1090 / 32;
                     var12 = var9 * 4 + 2 - class32.field303.field1072 / 32;
                     class277.method5381(var1, var2, var11, var12, class272.field3484[0], var4);
                  }
               }
            }

            for(var8 = 0; var8 < client.field2196; ++var8) {
               class176 var16 = client.field2195[client.field2197[var8]];
               if(var16 != null && var16.vmethod3957()) {
                  class315 var18 = var16.field2437;
                  if(var18 != null && var18.field3886 != null) {
                     var18 = var18.method6171();
                  }

                  if(var18 != null && var18.field3873 && var18.field3889) {
                     var11 = var16.field1090 / 32 - class32.field303.field1090 / 32;
                     var12 = var16.field1072 / 32 - class32.field303.field1072 / 32;
                     class277.method5381(var1, var2, var11, var12, class272.field3484[1], var4);
                  }
               }
            }

            var8 = class152.field1874;
            int[] var19 = class152.field1875;

            for(var10 = 0; var10 < var8; ++var10) {
               class199 var17 = client.field2269[var19[var10]];
               if(var17 != null && var17.vmethod3957() && !var17.field2800 && var17 != class32.field303) {
                  var12 = var17.field1090 / 32 - class32.field303.field1090 / 32;
                  int var13 = var17.field1072 / 32 - class32.field303.field1072 / 32;
                  boolean var14 = false;
                  if(class32.field303.field2820 != 0 && var17.field2820 != 0 && var17.field2820 == class32.field303.field2820) {
                     var14 = true;
                  }

                  if(var17.method3960()) {
                     class277.method5381(var1, var2, var12, var13, class272.field3484[3], var4);
                  } else if(var14) {
                     class277.method5381(var1, var2, var12, var13, class272.field3484[4], var4);
                  } else if(var17.method3952()) {
                     class277.method5381(var1, var2, var12, var13, class272.field3484[5], var4);
                  } else {
                     class277.method5381(var1, var2, var12, var13, class272.field3484[2], var4);
                  }
               }
            }

            if(client.field2173 != 0 && client.field2165 % 20 < 10) {
               if(client.field2173 == 1 && client.field2280 >= 0 && client.field2280 < client.field2195.length) {
                  class176 var20 = client.field2195[client.field2280];
                  if(var20 != null) {
                     var11 = var20.field1090 / 32 - class32.field303.field1090 / 32;
                     var12 = var20.field1072 / 32 - class32.field303.field1072 / 32;
                     class181.method3700(var1, var2, var11, var12, class222.field3000[1], var4);
                  }
               }

               if(client.field2173 == 2) {
                  var10 = client.field2176 * 4 - class229.field3067 * 4 + 2 - class32.field303.field1090 / 32;
                  var11 = client.field2320 * 4 - class35.field360 * 4 + 2 - class32.field303.field1072 / 32;
                  class181.method3700(var1, var2, var10, var11, class222.field3000[1], var4);
               }

               if(client.field2173 == 10 && client.field2220 >= 0 && client.field2220 < client.field2269.length) {
                  class199 var21 = client.field2269[client.field2220];
                  if(var21 != null) {
                     var11 = var21.field1090 / 32 - class32.field303.field1090 / 32;
                     var12 = var21.field1072 / 32 - class32.field303.field1072 / 32;
                     class181.method3700(var1, var2, var11, var12, class222.field3000[1], var4);
                  }
               }
            }

            if(client.field2216 != 0) {
               var10 = client.field2216 * 4 + 2 - class32.field303.field1090 / 32;
               var11 = client.field2414 * 4 + 2 - class32.field303.field1072 / 32;
               class277.method5381(var1, var2, var10, var11, class222.field3000[0], var4);
            }

            if(!class32.field303.field2800) {
               Rasterizer2D.method3167(var4.field2798 / 2 + var1 - 1, var4.field2795 / 2 + var2 - 1, 3, 3, 16777215);
            }
         } else {
            Rasterizer2D.method3157(var1, var2, 0, var4.field2796, var4.field2793);
         }

         client.field2287[var3] = true;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Ljava/io/File;",
      garbageValue = "-1489002572"
   )
   static File method6215(String var0) {
      if(!class328.field3970) {
         throw new RuntimeException("");
      } else {
         File var1 = (File)class328.field3969.get(var0);
         if(var1 != null) {
            return var1;
         } else {
            File var2 = new File(class328.field3968, var0);
            RandomAccessFile var3 = null;

            try {
               File var4 = new File(var2.getParent());
               if(!var4.exists()) {
                  throw new RuntimeException("");
               } else {
                  var3 = new RandomAccessFile(var2, "rw");
                  int var5 = var3.read();
                  var3.seek(0L);
                  var3.write(var5);
                  var3.seek(0L);
                  var3.close();
                  class328.field3969.put(var0, var2);
                  return var2;
               }
            } catch (Exception var8) {
               try {
                  if(var3 != null) {
                     var3.close();
                     var3 = null;
                  }
               } catch (Exception var7) {
                  ;
               }

               throw new RuntimeException();
            }
         }
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1187177447"
   )
   static final int method6214() {
      return class298.field3705;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Lgm;IB)V",
      garbageValue = "-70"
   )
   public static void method6213(Buffer var0, int var1) {
      if(class305.field3779 != null) {
         try {
            class305.field3779.method387(0L);
            class305.field3779.method376(var0.field1694, var1, 24);
         } catch (Exception var3) {
            ;
         }
      }

   }
}
