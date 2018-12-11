package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSSceneTilePaint;

@ObfuscatedName("dk")
public final class class189 implements RSSceneTilePaint {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1617246319
   )
   static int field2709;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -821575969
   )
   int field2710;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -747354359
   )
   int field2704;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1389343993
   )
   int field2705;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -627188309
   )
   int field2707;
   public int rl$paintModelBufferOffset;
   public int rl$paintModelUvBufferOffset;
   public int rl$paintModelBufferLen;
   @ObfuscatedName("a")
   boolean field2711;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -2082943897
   )
   int field2708;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -166635317
   )
   int field2706;

   class189(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.field2711 = true;
      this.field2707 = var1;
      this.field2704 = var2;
      this.field2706 = var3;
      this.field2705 = var4;
      this.field2708 = var5;
      this.field2710 = var6;
      this.field2711 = var7;
   }

   public int getBufferOffset() {
      return this.rl$paintModelBufferOffset;
   }

   public void setBufferOffset(int var1) {
      this.rl$paintModelBufferOffset = var1;
   }

   public int getUvBufferOffset() {
      return this.rl$paintModelUvBufferOffset;
   }

   public void setUvBufferOffset(int var1) {
      this.rl$paintModelUvBufferOffset = var1;
   }

   public int getBufferLen() {
      return this.rl$paintModelBufferLen;
   }

   public void setBufferLen(int var1) {
      this.rl$paintModelBufferLen = var1;
   }

   public int getSwColor() {
      return this.field2707;
   }

   public int getNwColor() {
      return this.field2704;
   }

   public int getNeColor() {
      return this.field2706;
   }

   public int getSeColor() {
      return this.field2705;
   }

   public int getTexture() {
      return this.field2708;
   }

   public int getRBG() {
      return this.field2710;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "1893873597"
   )
   static int method3804(int var0, class296 var1, boolean var2) {
      boolean var3 = true;
      class187 var4;
      if(var0 >= 2000) {
         var0 -= 1000;
         var4 = class48.method1047(class249.field3312[--MapCacheArchiveNames.field3811]);
         var3 = false;
      } else {
         var4 = var2?class3.field36:class284.field3565;
      }

      int var11;
      if(var0 == 1300) {
         var11 = class249.field3312[--MapCacheArchiveNames.field3811] - 1;
         if(var11 >= 0 && var11 <= 9) {
            var4.method3763(var11, class249.field3313[--class103.field1146]);
            return 1;
         } else {
            --class103.field1146;
            return 1;
         }
      } else {
         int var6;
         if(var0 == 1301) {
            MapCacheArchiveNames.field3811 -= 2;
            var11 = class249.field3312[MapCacheArchiveNames.field3811];
            var6 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
            var4.field2639 = class174.method3220(var11, var6);
            return 1;
         } else if(var0 == 1302) {
            var4.field2646 = class249.field3312[--MapCacheArchiveNames.field3811] == 1;
            return 1;
         } else if(var0 == 1303) {
            var4.field2670 = class249.field3312[--MapCacheArchiveNames.field3811];
            return 1;
         } else if(var0 == 1304) {
            var4.field2641 = class249.field3312[--MapCacheArchiveNames.field3811];
            return 1;
         } else if(var0 == 1305) {
            var4.field2683 = class249.field3313[--class103.field1146];
            return 1;
         } else if(var0 == 1306) {
            var4.field2647 = class249.field3313[--class103.field1146];
            return 1;
         } else if(var0 == 1307) {
            var4.field2630 = null;
            return 1;
         } else {
            int var7;
            byte[] var9;
            if(var0 != 1350) {
               byte var5;
               if(var0 == 1351) {
                  MapCacheArchiveNames.field3811 -= 2;
                  var5 = 10;
                  var9 = new byte[]{(byte)class249.field3312[MapCacheArchiveNames.field3811]};
                  byte[] var10 = new byte[]{(byte)class249.field3312[MapCacheArchiveNames.field3811 + 1]};
                  class322.method6255(var4, var5, var9, var10);
                  return 1;
               } else if(var0 == 1352) {
                  MapCacheArchiveNames.field3811 -= 3;
                  var11 = class249.field3312[MapCacheArchiveNames.field3811] - 1;
                  var6 = class249.field3312[MapCacheArchiveNames.field3811 + 1];
                  var7 = class249.field3312[MapCacheArchiveNames.field3811 + 2];
                  if(var11 >= 0 && var11 <= 9) {
                     class153.method2785(var4, var11, var6, var7);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if(var0 == 1353) {
                  var5 = 10;
                  var6 = class249.field3312[--MapCacheArchiveNames.field3811];
                  var7 = class249.field3312[--MapCacheArchiveNames.field3811];
                  class153.method2785(var4, var5, var6, var7);
                  return 1;
               } else if(var0 == 1354) {
                  --MapCacheArchiveNames.field3811;
                  var11 = class249.field3312[MapCacheArchiveNames.field3811] - 1;
                  if(var11 >= 0 && var11 <= 9) {
                     class24.method445(var4, var11);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if(var0 == 1355) {
                  var5 = 10;
                  class24.method445(var4, var5);
                  return 1;
               } else {
                  return 2;
               }
            } else {
               byte[] var8 = null;
               var9 = null;
               if(var3) {
                  MapCacheArchiveNames.field3811 -= 10;

                  for(var7 = 0; var7 < 10 && class249.field3312[var7 + MapCacheArchiveNames.field3811] >= 0; var7 += 2) {
                     ;
                  }

                  if(var7 > 0) {
                     var8 = new byte[var7 / 2];
                     var9 = new byte[var7 / 2];

                     for(var7 -= 2; var7 >= 0; var7 -= 2) {
                        var8[var7 / 2] = (byte)class249.field3312[var7 + MapCacheArchiveNames.field3811];
                        var9[var7 / 2] = (byte)class249.field3312[var7 + MapCacheArchiveNames.field3811 + 1];
                     }
                  }
               } else {
                  MapCacheArchiveNames.field3811 -= 2;
                  var8 = new byte[]{(byte)class249.field3312[MapCacheArchiveNames.field3811]};
                  var9 = new byte[]{(byte)class249.field3312[MapCacheArchiveNames.field3811 + 1]};
               }

               var7 = class249.field3312[--MapCacheArchiveNames.field3811] - 1;
               if(var7 >= 0 && var7 <= 9) {
                  class322.method6255(var4, var7, var8, var9);
                  return 1;
               } else {
                  throw new RuntimeException();
               }
            }
         }
      }
   }
}
