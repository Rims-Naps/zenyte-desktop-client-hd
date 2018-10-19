package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
public class class15 extends class193 {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class124 field138;
   @ObfuscatedName("w")
   public boolean field136;

   static {
      field138 = new class124(64);
   }

   class15() {
      this.field136 = false;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgm;B)V",
      garbageValue = "-50"
   )
   void method176(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method174(var1, var2);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "-184195944"
   )
   void method174(Buffer var1, int var2) {
      if(var2 == 2) {
         this.field136 = true;
      }

   }

   @ObfuscatedName("gj")
   @ObfuscatedSignature(
      signature = "(ZLgl;B)V",
      garbageValue = "4"
   )
   static final void buildRegion(boolean var0, class214 var1) {
      client.field3791 = var0;
      int var2;
      int var3;
      int var5;
      int var6;
      int var7;
      int var8;
      if(!client.field3791) {
         var2 = var1.readUnsignedShortLE128();//y
         var3 = var1.readUnsignedShort128();//x
         int var4 = var1.readUnsignedShort();
         class77.field711 = new int[var4][4];

         for(var5 = 0; var5 < var4; ++var5) {
            for(var6 = 0; var6 < 4; ++var6) {
               class77.field711[var5][var6] = var1.readInt();
            }
         }

         class2.field20 = new int[var4];
         class285.field3103 = new int[var4];
         class78.field721 = new int[var4];
         class233.field2297 = new byte[var4][];
         class96.field909 = new byte[var4][];
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
                  class2.field20[var4] = var8;
                  class285.field3103[var4] = class11.field85.method2602("m" + var6 + "_" + var7);
                  class78.field721[var4] = class11.field85.method2602("l" + var6 + "_" + var7);
                  ++var4;
               }
            }
         }

         class188.method3238(var3, var2, true);
      } else {
         var2 = var1.readUnsignedShort128();
         var3 = var1.readUnsignedShortLE128();
         boolean var15 = var1.readUnsignedByte() == 1;
         var5 = var1.readUnsignedShort();
         var1.method3760();

         int var9;
         for(var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < 13; ++var7) {
               for(var8 = 0; var8 < 13; ++var8) {
                  var9 = var1.readBits(1);
                  if(var9 == 1) {
                     client.field3792[var6][var7][var8] = var1.readBits(26);
                  } else {
                     client.field3792[var6][var7][var8] = -1;
                  }
               }
            }
         }

         var1.method3759();
         class77.field711 = new int[var5][4];

         for(var6 = 0; var6 < var5; ++var6) {
            for(var7 = 0; var7 < 4; ++var7) {
               class77.field711[var6][var7] = var1.readInt();
            }
         }

         class2.field20 = new int[var5];
         class285.field3103 = new int[var5];
         class78.field721 = new int[var5];
         class233.field2297 = new byte[var5][];
         class96.field909 = new byte[var5][];
         var5 = 0;

         for(var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < 13; ++var7) {
               for(var8 = 0; var8 < 13; ++var8) {
                  var9 = client.field3792[var6][var7][var8];
                  if(var9 != -1) {
                     int var10 = var9 >> 14 & 1023;
                     int var11 = var9 >> 3 & 2047;
                     int var12 = (var10 / 8 << 8) + var11 / 8;

                     int var13;
                     for(var13 = 0; var13 < var5; ++var13) {
                        if(class2.field20[var13] == var12) {
                           var12 = -1;
                           break;
                        }
                     }

                     if(var12 != -1) {
                        class2.field20[var5] = var12;
                        var13 = var12 >> 8 & 255;
                        int var14 = var12 & 255;
                        class285.field3103[var5] = class11.field85.method2602("m" + var13 + "_" + var14);
                        class78.field721[var5] = class11.field85.method2602("l" + var13 + "_" + var14);
                        ++var5;
                     }
                  }
               }
            }
         }

         class188.method3238(var3, var2, !var15);
      }

   }
}
