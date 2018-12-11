package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public enum class49 implements class26 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   field554(5, 0),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   field552(0, 1),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   field559(4, 2),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   field551(2, 3),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   field555(6, 4),
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   field556(7, 5),
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   field557(1, 6),
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   field561(3, 7);

   @ObfuscatedName("qc")
   @ObfuscatedSignature(
      signature = "Lch;"
   )
   static class293 field553;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -178072777
   )
   public final int field558;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -2109245987
   )
   final int field560;

   class49(int var3, int var4) {
      this.field558 = var3;
      this.field560 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "87"
   )
   public int vmethod6234() {
      return this.field560;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgl;IB)V",
      garbageValue = "1"
   )
   static final void method1051(class1 var0, int var1) {
      int var2 = var0.position;
      class152.field1881 = 0;
      int var3 = 0;
      var0.method7();

      int var4;
      int var5;
      int var6;
      for(var4 = 0; var4 < class152.field1874; ++var4) {
         var5 = class152.field1875[var4];
         if((class152.field1871[var5] & 1) == 0) {
            if(var3 > 0) {
               --var3;
               class152.field1871[var5] = (byte)(class152.field1871[var5] | 2);
            } else {
               var6 = var0.method8(1);
               if(var6 == 0) {
                  var3 = class213.method4367(var0);
                  class152.field1871[var5] = (byte)(class152.field1871[var5] | 2);
               } else {
                  class316.method6192(var0, var5);
               }
            }
         }
      }

      var0.method6();
      if(var3 != 0) {
         throw new RuntimeException();
      } else {
         var0.method7();

         for(var4 = 0; var4 < class152.field1874; ++var4) {
            var5 = class152.field1875[var4];
            if((class152.field1871[var5] & 1) != 0) {
               if(var3 > 0) {
                  --var3;
                  class152.field1871[var5] = (byte)(class152.field1871[var5] | 2);
               } else {
                  var6 = var0.method8(1);
                  if(var6 == 0) {
                     var3 = class213.method4367(var0);
                     class152.field1871[var5] = (byte)(class152.field1871[var5] | 2);
                  } else {
                     class316.method6192(var0, var5);
                  }
               }
            }
         }

         var0.method6();
         if(var3 != 0) {
            throw new RuntimeException();
         } else {
            var0.method7();

            for(var4 = 0; var4 < class152.field1876; ++var4) {
               var5 = class152.field1887[var4];
               if((class152.field1871[var5] & 1) != 0) {
                  if(var3 > 0) {
                     --var3;
                     class152.field1871[var5] = (byte)(class152.field1871[var5] | 2);
                  } else {
                     var6 = var0.method8(1);
                     if(var6 == 0) {
                        var3 = class213.method4367(var0);
                        class152.field1871[var5] = (byte)(class152.field1871[var5] | 2);
                     } else if(class225.method4564(var0, var5)) {
                        class152.field1871[var5] = (byte)(class152.field1871[var5] | 2);
                     }
                  }
               }
            }

            var0.method6();
            if(var3 != 0) {
               throw new RuntimeException();
            } else {
               var0.method7();

               for(var4 = 0; var4 < class152.field1876; ++var4) {
                  var5 = class152.field1887[var4];
                  if((class152.field1871[var5] & 1) == 0) {
                     if(var3 > 0) {
                        --var3;
                        class152.field1871[var5] = (byte)(class152.field1871[var5] | 2);
                     } else {
                        var6 = var0.method8(1);
                        if(var6 == 0) {
                           var3 = class213.method4367(var0);
                           class152.field1871[var5] = (byte)(class152.field1871[var5] | 2);
                        } else if(class225.method4564(var0, var5)) {
                           class152.field1871[var5] = (byte)(class152.field1871[var5] | 2);
                        }
                     }
                  }
               }

               var0.method6();
               if(var3 != 0) {
                  throw new RuntimeException();
               } else {
                  class152.field1874 = 0;
                  class152.field1876 = 0;

                  class199 var7;
                  for(var4 = 1; var4 < 2048; ++var4) {
                     class152.field1871[var4] = (byte)(class152.field1871[var4] >> 1);
                     var7 = client.field2269[var4];
                     if(var7 != null) {
                        class152.field1875[++class152.field1874 - 1] = var4;
                     } else {
                        class152.field1887[++class152.field1876 - 1] = var4;
                     }
                  }

                  for(var3 = 0; var3 < class152.field1881; ++var3) {
                     var4 = class152.field1878[var3];
                     var7 = client.field2269[var4];
                     var6 = var0.readUnsignedByte();
                     if((var6 & 8) != 0) {
                        var6 += var0.readUnsignedByte() << 8;
                     }

                     class329.method6324(var0, var4, var7, var6);
                  }

                  if(var0.position - var2 != var1) {
                     throw new RuntimeException(var0.position - var2 + " " + var1);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("fz")
   @ObfuscatedSignature(
      signature = "(Ljw;IIIS)V",
      garbageValue = "5183"
   )
   static void method1055(class312 var0, int var1, int var2, int var3) {
      if(client.field2391 < 50 && client.field2390 != 0) {
         if(var0.field3837 != null && var1 < var0.field3837.length) {
            int var4 = var0.field3837[var1];
            if(var4 != 0) {
               int var5 = var4 >> 8;
               int var6 = var4 >> 4 & 7;
               int var7 = var4 & 15;
               client.field2294[client.field2391] = var5;
               client.field2345[client.field2391] = var6;
               client.field2394[client.field2391] = 0;
               client.field2188[client.field2391] = null;
               int var8 = (var2 - 64) / 128;
               int var9 = (var3 - 64) / 128;
               client.field2429[client.field2391] = var7 + (var9 << 8) + (var8 << 16);
               ++client.field2391;
            }
         }
      }
   }
}
