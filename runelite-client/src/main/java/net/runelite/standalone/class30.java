package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
public enum class30 implements class26 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Ljp;"
   )
   field287(1, 0),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Ljp;"
   )
   field283(0, 1),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Ljp;"
   )
   field284(2, 2);

   @ObfuscatedName("r")
   static int[][] field286;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 824262487
   )
   public final int field285;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1231062461
   )
   final int field282;

   class30(int var3, int var4) {
      this.field285 = var3;
      this.field282 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "87"
   )
   public int vmethod6234() {
      return this.field282;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(ILcz;ZB)I",
      garbageValue = "15"
   )
   static int method524(int var0, class296 var1, boolean var2) {
      int var3;
      int var4;
      if(var0 == 4000) {
         MapCacheArchiveNames.field3811 -= 2;
         var3 = class249.field3312[MapCacheArchiveNames.field3811];
         var4 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var4 + var3;
         return 1;
      } else if(var0 == 4001) {
         MapCacheArchiveNames.field3811 -= 2;
         var3 = class249.field3312[MapCacheArchiveNames.field3811];
         var4 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3 - var4;
         return 1;
      } else if(var0 == 4002) {
         MapCacheArchiveNames.field3811 -= 2;
         var3 = class249.field3312[MapCacheArchiveNames.field3811];
         var4 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3 * var4;
         return 1;
      } else if(var0 == 4003) {
         MapCacheArchiveNames.field3811 -= 2;
         var3 = class249.field3312[MapCacheArchiveNames.field3811];
         var4 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3 / var4;
         return 1;
      } else if(var0 == 4004) {
         var3 = class249.field3312[--MapCacheArchiveNames.field3811];
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = (int)(Math.random() * (double)var3);
         return 1;
      } else if(var0 == 4005) {
         var3 = class249.field3312[--MapCacheArchiveNames.field3811];
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = (int)(Math.random() * (double)(var3 + 1));
         return 1;
      } else if(var0 == 4006) {
         MapCacheArchiveNames.field3811 -= 5;
         var3 = class249.field3312[MapCacheArchiveNames.field3811];
         var4 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
         int var5 = class249.field3312[MapCacheArchiveNames.field3811 + 2];
         int var6 = class249.field3312[MapCacheArchiveNames.field3811 + 3];
         int var7 = class249.field3312[MapCacheArchiveNames.field3811 + 4];
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3 + (var7 - var5) * (var4 - var3) / (var6 - var5);
         return 1;
      } else if(var0 == 4007) {
         MapCacheArchiveNames.field3811 -= 2;
         var3 = class249.field3312[MapCacheArchiveNames.field3811];
         var4 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3 + var3 * var4 / 100;
         return 1;
      } else if(var0 == 4008) {
         MapCacheArchiveNames.field3811 -= 2;
         var3 = class249.field3312[MapCacheArchiveNames.field3811];
         var4 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3 | 1 << var4;
         return 1;
      } else if(var0 == 4009) {
         MapCacheArchiveNames.field3811 -= 2;
         var3 = class249.field3312[MapCacheArchiveNames.field3811];
         var4 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3 & -1 - (1 << var4);
         return 1;
      } else if(var0 == 4010) {
         MapCacheArchiveNames.field3811 -= 2;
         var3 = class249.field3312[MapCacheArchiveNames.field3811];
         var4 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = (var3 & 1 << var4) != 0?1:0;
         return 1;
      } else if(var0 == 4011) {
         MapCacheArchiveNames.field3811 -= 2;
         var3 = class249.field3312[MapCacheArchiveNames.field3811];
         var4 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3 % var4;
         return 1;
      } else if(var0 == 4012) {
         MapCacheArchiveNames.field3811 -= 2;
         var3 = class249.field3312[MapCacheArchiveNames.field3811];
         var4 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
         if(var3 == 0) {
            class249.field3312[++MapCacheArchiveNames.field3811 - 1] = 0;
         } else {
            class249.field3312[++MapCacheArchiveNames.field3811 - 1] = (int)Math.pow((double)var3, (double)var4);
         }

         return 1;
      } else if(var0 == 4013) {
         MapCacheArchiveNames.field3811 -= 2;
         var3 = class249.field3312[MapCacheArchiveNames.field3811];
         var4 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
         if(var3 == 0) {
            class249.field3312[++MapCacheArchiveNames.field3811 - 1] = 0;
            return 1;
         } else {
            switch(var4) {
            case 0:
               class249.field3312[++MapCacheArchiveNames.field3811 - 1] = Integer.MAX_VALUE;
               break;
            case 1:
               class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3;
               break;
            case 2:
               class249.field3312[++MapCacheArchiveNames.field3811 - 1] = (int)Math.sqrt((double)var3);
               break;
            case 3:
               class249.field3312[++MapCacheArchiveNames.field3811 - 1] = (int)Math.cbrt((double)var3);
               break;
            case 4:
               class249.field3312[++MapCacheArchiveNames.field3811 - 1] = (int)Math.sqrt(Math.sqrt((double)var3));
               break;
            default:
               class249.field3312[++MapCacheArchiveNames.field3811 - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4);
            }

            return 1;
         }
      } else if(var0 == 4014) {
         MapCacheArchiveNames.field3811 -= 2;
         var3 = class249.field3312[MapCacheArchiveNames.field3811];
         var4 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3 & var4;
         return 1;
      } else if(var0 == 4015) {
         MapCacheArchiveNames.field3811 -= 2;
         var3 = class249.field3312[MapCacheArchiveNames.field3811];
         var4 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3 | var4;
         return 1;
      } else if(var0 == 4018) {
         MapCacheArchiveNames.field3811 -= 3;
         long var9 = (long)class249.field3312[MapCacheArchiveNames.field3811];
         long var11 = (long)class249.field3312[MapCacheArchiveNames.field3811 + 1];
         long var13 = (long)class249.field3312[MapCacheArchiveNames.field3811 + 2];
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = (int)(var9 * var13 / var11);
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("jz")
   @ObfuscatedSignature(
      signature = "(Lbl;ZI)V",
      garbageValue = "-1364592305"
   )
   static final void method523(class322 var0, boolean var1) {
      int var2 = var0.field3937;
      int var3 = (int)var0.field2792;
      var0.method3937();
      if(var1) {
         WorldMapGameObject.method2484(var2);
      }

      for(class228 var4 = (class228)client.field2355.method1783(); var4 != null; var4 = (class228)client.field2355.method1779()) {
         if((var4.field2792 >> 48 & 65535L) == (long)var2) {
            var4.method3937();
         }
      }

      class187 var9 = class48.method1047(var3);
      if(var9 != null) {
         class230.method4617(var9);
      }

      for(int var5 = 0; var5 < client.field2290; ++var5) {
         int var7 = client.field2293[var5];
         boolean var6 = var7 == 57 || var7 == 58 || var7 == 1007 || var7 == 25 || var7 == 30;
         if(var6) {
            if(var5 < client.field2290 - 1) {
               for(int var8 = var5; var8 < client.field2290 - 1; ++var8) {
                  client.field2295[var8] = client.field2295[var8 + 1];
                  client.field2296[var8] = client.field2296[var8 + 1];
                  client.field2293[var8] = client.field2293[var8 + 1];
                  client.field2368[var8] = client.field2368[var8 + 1];
                  client.field2291[var8] = client.field2291[var8 + 1];
                  client.field2292[var8] = client.field2292[var8 + 1];
                  client.field2327[var8] = client.field2327[var8 + 1];
               }
            }

            --var5;
            --client.field2290;
            client.onMenuOptionsChanged(-1);
         }
      }

      class177.method3678();
      if(client.field2313 != -1) {
         class191.method3910(client.field2313, 1);
      }

   }
}
