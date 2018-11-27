package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
public class class4 extends class324 {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class100 field40;
   @ObfuscatedName("w")
   public boolean field38;

   static {
      field40 = new class100(64);
   }

   class4() {
      this.field38 = false;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgm;B)V",
      garbageValue = "-50"
   )
   void method84(class125 var1) {
      while(true) {
         int var2 = var1.method2256();
         if(var2 == 0) {
            return;
         }

         this.method82(var1, var2);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "-184195944"
   )
   void method82(class125 var1, int var2) {
      if(var2 == 2) {
         this.field38 = true;
      }

   }

   @ObfuscatedName("gj")
   @ObfuscatedSignature(
      signature = "(ZLgl;B)V",
      garbageValue = "4"
   )
   static final void buildRegion(boolean var0, class1 var1) {
      client.field2212 = var0;
      int var2;
      int var3;
      int var5;
      int var6;
      int var7;
      int var8;
      if(!client.field2212) {
         var2 = var1.method2332();
         var3 = var1.method2460();
         int var4 = var1.method2258();
         class286.field3582 = new int[var4][4];

         for(var5 = 0; var5 < var4; ++var5) {
            for(var6 = 0; var6 < 4; ++var6) {
               class286.field3582[var5][var6] = var1.method2344();
            }
         }

         class23.field255 = new int[var4];
         class54.field697 = new int[var4];
         class226.field3047 = new int[var4];
         class178.field2452 = new byte[var4][];
         class59.field727 = new byte[var4][];
         boolean var16 = false;
         if((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
            var16 = true;
         }

         if(var3 / 8 == 48 && var2 / 8 == 148) {
            var16 = true;
         }

         var4 = 0;

         for(var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
            for(var7 = (var2 - 6) / 8; var7 <= (var2 + 6) / 8; ++var7) {
               var8 = var7 + (var6 << 8);
               if(!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) {
                  class23.field255[var4] = var8;
                  class54.field697[var4] = class152.field1869.method4421("m" + var6 + "_" + var7);
                  class226.field3047[var4] = class152.field1869.method4421("l" + var6 + "_" + var7);
                  ++var4;
               }
            }
         }

         class142.method2634(var3, var2, true);
      } else {
         var2 = var1.method2460();
         var3 = var1.method2332();
         boolean var15 = var1.method2256() == 1;
         var5 = var1.method2258();
         var1.method7();

         int var9;
         for(var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < 13; ++var7) {
               for(var8 = 0; var8 < 13; ++var8) {
                  var9 = var1.method8(1);
                  if(var9 == 1) {
                     client.field2213[var6][var7][var8] = var1.method8(26);
                  } else {
                     client.field2213[var6][var7][var8] = -1;
                  }
               }
            }
         }

         var1.method6();
         class286.field3582 = new int[var5][4];

         for(var6 = 0; var6 < var5; ++var6) {
            for(var7 = 0; var7 < 4; ++var7) {
               class286.field3582[var6][var7] = var1.method2344();
            }
         }

         class23.field255 = new int[var5];
         class54.field697 = new int[var5];
         class226.field3047 = new int[var5];
         class178.field2452 = new byte[var5][];
         class59.field727 = new byte[var5][];
         var5 = 0;

         for(var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < 13; ++var7) {
               for(var8 = 0; var8 < 13; ++var8) {
                  var9 = client.field2213[var6][var7][var8];
                  if(var9 != -1) {
                     int var10 = var9 >> 14 & 1023;
                     int var11 = var9 >> 3 & 2047;
                     int var12 = (var10 / 8 << 8) + var11 / 8;

                     int var13;
                     for(var13 = 0; var13 < var5; ++var13) {
                        if(class23.field255[var13] == var12) {
                           var12 = -1;
                           break;
                        }
                     }

                     if(var12 != -1) {
                        class23.field255[var5] = var12;
                        var13 = var12 >> 8 & 255;
                        int var14 = var12 & 255;
                        class54.field697[var5] = class152.field1869.method4421("m" + var13 + "_" + var14);
                        class226.field3047[var5] = class152.field1869.method4421("l" + var13 + "_" + var14);
                        ++var5;
                     }
                  }
               }
            }
         }

         class142.method2634(var3, var2, !var15);
      }

   }
}
