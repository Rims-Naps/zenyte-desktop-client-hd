package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public enum class311 implements class91 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   field3297(5, 0),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   field3295(0, 1),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   field3302(4, 2),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   field3294(2, 3),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   field3298(6, 4),
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   field3299(7, 5),
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   field3300(1, 6),
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   field3304(3, 7);

   @ObfuscatedName("qc")
   @ObfuscatedSignature(
      signature = "Lch;"
   )
   static class40 field3296;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -2109245987
   )
   final int field3303;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -178072777
   )
   public final int field3301;

   class311(int var3, int var4) {
      this.field3301 = var3;
      this.field3303 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "87"
   )
   public int vmethod5937() {
      return this.field3303;
   }

   @ObfuscatedName("fz")
   @ObfuscatedSignature(
      signature = "(Ljw;IIIS)V",
      garbageValue = "5183"
   )
   static void method5329(class321 var0, int var1, int var2, int var3) {
      if(client.field3970 < 50 && client.field3969 != 0) {
         if(var0.field3419 != null && var1 < var0.field3419.length) {
            int var4 = var0.field3419[var1];
            if(var4 != 0) {
               int var5 = var4 >> 8;
               int var6 = var4 >> 4 & 7;
               int var7 = var4 & 15;
               client.field3873[client.field3970] = var5;
               client.field3924[client.field3970] = var6;
               client.field3973[client.field3970] = 0;
               client.field3767[client.field3970] = null;
               int var8 = (var2 - 64) / 128;
               int var9 = (var3 - 64) / 128;
               client.field4008[client.field3970] = var7 + (var9 << 8) + (var8 << 16);
               ++client.field3970;
            }
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgl;IB)V",
      garbageValue = "1"
   )
   static final void updatePlayer(class214 var0, int var1) {
      int var2 = var0.field1073;
      class11.field97 = 0;
      int var3 = 0;
      var0.method3760();

      int var4;
      int var5;
      int var6;
      for(var4 = 0; var4 < class11.field90; ++var4) {
         var5 = class11.field91[var4];
         if((class11.field87[var5] & 1) == 0) {
            if(var3 > 0) {
               --var3;
               class11.field87[var5] = (byte)(class11.field87[var5] | 2);
            } else {
               var6 = var0.readBits(1);
               if(var6 == 0) {
                  var3 = class176.method2964(var0);
                  class11.field87[var5] = (byte)(class11.field87[var5] | 2);
               } else {
                  class156.method2729(var0, var5);
               }
            }
         }
      }

      var0.method3759();
      if(var3 != 0) {
         throw new RuntimeException();
      } else {
         var0.method3760();

         for(var4 = 0; var4 < class11.field90; ++var4) {
            var5 = class11.field91[var4];
            if((class11.field87[var5] & 1) != 0) {
               if(var3 > 0) {
                  --var3;
                  class11.field87[var5] = (byte)(class11.field87[var5] | 2);
               } else {
                  var6 = var0.readBits(1);
                  if(var6 == 0) {
                     var3 = class176.method2964(var0);
                     class11.field87[var5] = (byte)(class11.field87[var5] | 2);
                  } else {
                     class156.method2729(var0, var5);
                  }
               }
            }
         }

         var0.method3759();
         if(var3 != 0) {
            throw new RuntimeException();
         } else {
            var0.method3760();

            for(var4 = 0; var4 < class11.field92; ++var4) {
               var5 = class11.field103[var4];
               if((class11.field87[var5] & 1) != 0) {
                  if(var3 > 0) {
                     --var3;
                     class11.field87[var5] = (byte)(class11.field87[var5] | 2);
                  } else {
                     var6 = var0.readBits(1);
                     if(var6 == 0) {
                        var3 = class176.method2964(var0);
                        class11.field87[var5] = (byte)(class11.field87[var5] | 2);
                     } else if(class192.method3295(var0, var5)) {
                        class11.field87[var5] = (byte)(class11.field87[var5] | 2);
                     }
                  }
               }
            }

            var0.method3759();
            if(var3 != 0) {
               throw new RuntimeException();
            } else {
               var0.method3760();

               for(var4 = 0; var4 < class11.field92; ++var4) {
                  var5 = class11.field103[var4];
                  if((class11.field87[var5] & 1) == 0) {
                     if(var3 > 0) {
                        --var3;
                        class11.field87[var5] = (byte)(class11.field87[var5] | 2);
                     } else {
                        var6 = var0.readBits(1);
                        if(var6 == 0) {
                           var3 = class176.method2964(var0);
                           class11.field87[var5] = (byte)(class11.field87[var5] | 2);
                        } else if(class192.method3295(var0, var5)) {
                           class11.field87[var5] = (byte)(class11.field87[var5] | 2);
                        }
                     }
                  }
               }

               var0.method3759();
               if(var3 != 0) {
                  throw new RuntimeException();
               } else {
                  class11.field90 = 0;
                  class11.field92 = 0;

                  class63 var7;
                  for(var4 = 1; var4 < 2048; ++var4) {
                     class11.field87[var4] = (byte)(class11.field87[var4] >> 1);
                     var7 = client.field3848[var4];
                     if(var7 != null) {
                        class11.field91[++class11.field90 - 1] = var4;
                     } else {
                        class11.field103[++class11.field92 - 1] = var4;
                     }
                  }

                  for(var3 = 0; var3 < class11.field97; ++var3) {
                     var4 = class11.field94[var3];
                     var7 = client.field3848[var4];
                     var6 = var0.readUnsignedByte();
                     if((var6 & 8) != 0) {
                        var6 += var0.readUnsignedByte() << 8;
                     }

                     class251.decodeMasks(var0, var4, var7, var6);
                  }

                  if(var0.field1073 - var2 != var1) {
                     throw new RuntimeException(var0.field1073 - var2 + " " + var1);
                  }
               }
            }
         }
      }
   }
}
