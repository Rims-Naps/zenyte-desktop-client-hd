package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSNPCComposition;

@ObfuscatedName("hy")
public class class284 extends class76 {
   @ObfuscatedName("fl")
   @ObfuscatedGetter(
      intValue = 246175447
   )
   static int somey;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -709017225
   )
   int field3064;
   @ObfuscatedName("p")
   int[] field3061;
   @ObfuscatedName("c")
   byte[] field3060;
   @ObfuscatedName("e")
   byte[] field3058;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "[Lcr;"
   )
   class58[] field3055;
   @ObfuscatedName("s")
   byte[] field3057;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "[Lhi;"
   )
   class136[] field3059;
   @ObfuscatedName("w")
   short[] field3054;

   class284(byte[] var1) {
      this.field3055 = new class58[128];
      this.field3054 = new short[128];
      this.field3057 = new byte[128];
      this.field3058 = new byte[128];
      this.field3059 = new class136[128];
      this.field3060 = new byte[128];
      this.field3061 = new int[128];
      Buffer var2 = new Buffer(var1);

      int var3;
      for(var3 = 0; var2.field1074[var3 + var2.field1073] != 0; ++var3) {
         ;
      }

      byte[] var4 = new byte[var3];

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         var4[var5] = var2.method1906();
      }

      ++var2.field1073;
      ++var3;
      var5 = var2.field1073;
      var2.field1073 += var3;

      int var6;
      for(var6 = 0; var2.field1074[var6 + var2.field1073] != 0; ++var6) {
         ;
      }

      byte[] var7 = new byte[var6];

      int var8;
      for(var8 = 0; var8 < var6; ++var8) {
         var7[var8] = var2.method1906();
      }

      ++var2.field1073;
      ++var6;
      var8 = var2.field1073;
      var2.field1073 += var6;

      int var9;
      for(var9 = 0; var2.field1074[var9 + var2.field1073] != 0; ++var9) {
         ;
      }

      byte[] var10 = new byte[var9];

      for(int var11 = 0; var11 < var9; ++var11) {
         var10[var11] = var2.method1906();
      }

      ++var2.field1073;
      ++var9;
      byte[] var36 = new byte[var9];
      int var12;
      int var14;
      if(var9 > 1) {
         var36[1] = 1;
         int var13 = 1;
         var12 = 2;

         for(var14 = 2; var14 < var9; ++var14) {
            int var15 = var2.readUnsignedByte();
            if(var15 == 0) {
               var13 = var12++;
            } else {
               if(var15 <= var13) {
                  --var15;
               }

               var13 = var15;
            }

            var36[var14] = (byte)var13;
         }
      } else {
         var12 = var9;
      }

      class136[] var37 = new class136[var12];

      class136 var38;
      for(var14 = 0; var14 < var37.length; ++var14) {
         var38 = var37[var14] = new class136();
         int var16 = var2.readUnsignedByte();
         if(var16 > 0) {
            var38.field1350 = new byte[var16 * 2];
         }

         var16 = var2.readUnsignedByte();
         if(var16 > 0) {
            var38.field1351 = new byte[var16 * 2 + 2];
            var38.field1351[1] = 64;
         }
      }

      var14 = var2.readUnsignedByte();
      byte[] var45 = var14 > 0?new byte[var14 * 2]:null;
      var14 = var2.readUnsignedByte();
      byte[] var39 = var14 > 0?new byte[var14 * 2]:null;

      int var17;
      for(var17 = 0; var2.field1074[var17 + var2.field1073] != 0; ++var17) {
         ;
      }

      byte[] var18 = new byte[var17];

      int var19;
      for(var19 = 0; var19 < var17; ++var19) {
         var18[var19] = var2.method1906();
      }

      ++var2.field1073;
      ++var17;
      var19 = 0;

      int var20;
      for(var20 = 0; var20 < 128; ++var20) {
         var19 += var2.readUnsignedByte();
         this.field3054[var20] = (short)var19;
      }

      var19 = 0;

      for(var20 = 0; var20 < 128; ++var20) {
         var19 += var2.readUnsignedByte();
         this.field3054[var20] = (short)(this.field3054[var20] + (var19 << 8));
      }

      var20 = 0;
      int var21 = 0;
      int var22 = 0;

      int var23;
      for(var23 = 0; var23 < 128; ++var23) {
         if(var20 == 0) {
            if(var21 < var18.length) {
               var20 = var18[var21++];
            } else {
               var20 = -1;
            }

            var22 = var2.method1912();
         }

         this.field3054[var23] = (short)(this.field3054[var23] + ((var22 - 1 & 2) << 14));
         this.field3061[var23] = var22;
         --var20;
      }

      var20 = 0;
      var21 = 0;
      var23 = 0;

      int var24;
      for(var24 = 0; var24 < 128; ++var24) {
         if(this.field3061[var24] != 0) {
            if(var20 == 0) {
               if(var21 < var4.length) {
                  var20 = var4[var21++];
               } else {
                  var20 = -1;
               }

               var23 = var2.field1074[var5++] - 1;
            }

            this.field3060[var24] = (byte)var23;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      var24 = 0;

      for(int var25 = 0; var25 < 128; ++var25) {
         if(this.field3061[var25] != 0) {
            if(var20 == 0) {
               if(var21 < var7.length) {
                  var20 = var7[var21++];
               } else {
                  var20 = -1;
               }

               var24 = var2.field1074[var8++] + 16 << 2;
            }

            this.field3058[var25] = (byte)var24;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      class136 var40 = null;

      int var26;
      for(var26 = 0; var26 < 128; ++var26) {
         if(this.field3061[var26] != 0) {
            if(var20 == 0) {
               var40 = var37[var36[var21]];
               if(var21 < var10.length) {
                  var20 = var10[var21++];
               } else {
                  var20 = -1;
               }
            }

            this.field3059[var26] = var40;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      var26 = 0;

      int var27;
      for(var27 = 0; var27 < 128; ++var27) {
         if(var20 == 0) {
            if(var21 < var18.length) {
               var20 = var18[var21++];
            } else {
               var20 = -1;
            }

            if(this.field3061[var27] > 0) {
               var26 = var2.readUnsignedByte() + 1;
            }
         }

         this.field3057[var27] = (byte)var26;
         --var20;
      }

      this.field3064 = var2.readUnsignedByte() + 1;

      class136 var28;
      int var29;
      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if(var28.field1350 != null) {
            for(var29 = 1; var29 < var28.field1350.length; var29 += 2) {
               var28.field1350[var29] = var2.method1906();
            }
         }

         if(var28.field1351 != null) {
            for(var29 = 3; var29 < var28.field1351.length - 2; var29 += 2) {
               var28.field1351[var29] = var2.method1906();
            }
         }
      }

      if(var45 != null) {
         for(var27 = 1; var27 < var45.length; var27 += 2) {
            var45[var27] = var2.method1906();
         }
      }

      if(var39 != null) {
         for(var27 = 1; var27 < var39.length; var27 += 2) {
            var39[var27] = var2.method1906();
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if(var28.field1351 != null) {
            var19 = 0;

            for(var29 = 2; var29 < var28.field1351.length; var29 += 2) {
               var19 = 1 + var19 + var2.readUnsignedByte();
               var28.field1351[var29] = (byte)var19;
            }
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if(var28.field1350 != null) {
            var19 = 0;

            for(var29 = 2; var29 < var28.field1350.length; var29 += 2) {
               var19 = 1 + var19 + var2.readUnsignedByte();
               var28.field1350[var29] = (byte)var19;
            }
         }
      }

      byte var30;
      int var32;
      int var33;
      int var34;
      int var42;
      byte var44;
      if(var45 != null) {
         var19 = var2.readUnsignedByte();
         var45[0] = (byte)var19;

         for(var27 = 2; var27 < var45.length; var27 += 2) {
            var19 = var19 + 1 + var2.readUnsignedByte();
            var45[var27] = (byte)var19;
         }

         var44 = var45[0];
         byte var41 = var45[1];

         for(var29 = 0; var29 < var44; ++var29) {
            this.field3057[var29] = (byte)(var41 * this.field3057[var29] + 32 >> 6);
         }

         for(var29 = 2; var29 < var45.length; var29 += 2) {
            var30 = var45[var29];
            byte var31 = var45[var29 + 1];
            var32 = var41 * (var30 - var44) + (var30 - var44) / 2;

            for(var33 = var44; var33 < var30; ++var33) {
               var34 = class127.method2367(var32, var30 - var44);
               this.field3057[var33] = (byte)(var34 * this.field3057[var33] + 32 >> 6);
               var32 += var31 - var41;
            }

            var44 = var30;
            var41 = var31;
         }

         for(var42 = var44; var42 < 128; ++var42) {
            this.field3057[var42] = (byte)(var41 * this.field3057[var42] + 32 >> 6);
         }

         var38 = null;
      }

      if(var39 != null) {
         var19 = var2.readUnsignedByte();
         var39[0] = (byte)var19;

         for(var27 = 2; var27 < var39.length; var27 += 2) {
            var19 = 1 + var19 + var2.readUnsignedByte();
            var39[var27] = (byte)var19;
         }

         var44 = var39[0];
         int var47 = var39[1] << 1;

         for(var29 = 0; var29 < var44; ++var29) {
            var42 = var47 + (this.field3058[var29] & 255);
            if(var42 < 0) {
               var42 = 0;
            }

            if(var42 > 128) {
               var42 = 128;
            }

            this.field3058[var29] = (byte)var42;
         }

         int var43;
         for(var29 = 2; var29 < var39.length; var29 += 2) {
            var30 = var39[var29];
            var43 = var39[var29 + 1] << 1;
            var32 = var47 * (var30 - var44) + (var30 - var44) / 2;

            for(var33 = var44; var33 < var30; ++var33) {
               var34 = class127.method2367(var32, var30 - var44);
               int var35 = var34 + (this.field3058[var33] & 255);
               if(var35 < 0) {
                  var35 = 0;
               }

               if(var35 > 128) {
                  var35 = 128;
               }

               this.field3058[var33] = (byte)var35;
               var32 += var43 - var47;
            }

            var44 = var30;
            var47 = var43;
         }

         for(var42 = var44; var42 < 128; ++var42) {
            var43 = var47 + (this.field3058[var42] & 255);
            if(var43 < 0) {
               var43 = 0;
            }

            if(var43 > 128) {
               var43 = 128;
            }

            this.field3058[var42] = (byte)var43;
         }

         Object var46 = null;
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var37[var27].field1359 = var2.readUnsignedByte();
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if(var28.field1350 != null) {
            var28.field1353 = var2.readUnsignedByte();
         }

         if(var28.field1351 != null) {
            var28.field1354 = var2.readUnsignedByte();
         }

         if(var28.field1359 > 0) {
            var28.field1355 = var2.readUnsignedByte();
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var37[var27].field1357 = var2.readUnsignedByte();
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if(var28.field1357 > 0) {
            var28.field1352 = var2.readUnsignedByte();
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if(var28.field1352 > 0) {
            var28.field1358 = var2.readUnsignedByte();
         }
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lct;[B[II)Z",
      garbageValue = "1428523324"
   )
   boolean method5030(class52 var1, byte[] var2, int[] var3) {
      boolean var4 = true;
      int var5 = 0;
      class58 var6 = null;

      for(int var7 = 0; var7 < 128; ++var7) {
         if(var2 == null || var2[var7] != 0) {
            int var8 = this.field3061[var7];
            if(var8 != 0) {
               if(var8 != var5) {
                  var5 = var8--;
                  if((var8 & 1) == 0) {
                     var6 = var1.method854(var8 >> 2, var3);
                  } else {
                     var6 = var1.method857(var8 >> 2, var3);
                  }

                  if(var6 == null) {
                     var4 = false;
                  }
               }

               if(var6 != null) {
                  this.field3055[var7] = var6;
                  this.field3061[var7] = 0;
               }
            }
         }
      }

      return var4;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "4927975"
   )
   void method5028() {
      this.field3061 = null;
   }

   @ObfuscatedName("gu")
   @ObfuscatedSignature(
      signature = "(ZLgl;I)V",
      garbageValue = "1516887721"
   )
   static final void updateNPCs(boolean var0, class214 var1) {
      client.updateNpcs(var0, var1);
      client.field3853 = 0;
      client.field3777 = 0;
      class214 var2 = client.field3963.field1156;
      var2.method3760();
      int var3 = var2.readBits(8);
      int var4;
      if(var3 < client.field3775) {
         for(var4 = var3; var4 < client.field3775; ++var4) {
            client.field3805[++client.field3853 - 1] = client.field3776[var4];
         }
      }

      if(var3 > client.field3775) {
         throw new RuntimeException("");
      } else {
         client.field3775 = 0;

         int var5;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         for(var4 = 0; var4 < var3; ++var4) {
            var5 = client.field3776[var4];
            class237 var6 = client.field3774[var5];
            var7 = var2.readBits(1);
            if(var7 == 0) {
               client.field3776[++client.field3775 - 1] = var5;
               var6.field1308 = client.field3744;
            } else {
               var8 = var2.readBits(2);
               if(var8 == 0) {
                  client.field3776[++client.field3775 - 1] = var5;
                  var6.field1308 = client.field3744;
                  client.field3778[++client.field3777 - 1] = var5;
               } else if(var8 == 1) {
                  client.field3776[++client.field3775 - 1] = var5;
                  var6.field1308 = client.field3744;
                  var9 = var2.readBits(3);
                  var6.method4187(var9, (byte)1);
                  var10 = var2.readBits(1);
                  if(var10 == 1) {
                     client.field3778[++client.field3777 - 1] = var5;
                  }
               } else if(var8 == 2) {
                  client.field3776[++client.field3775 - 1] = var5;
                  var6.field1308 = client.field3744;
                  var9 = var2.readBits(3);
                  var6.method4187(var9, (byte)2);
                  var10 = var2.readBits(3);
                  var6.method4187(var10, (byte)2);
                  var11 = var2.readBits(1);
                  if(var11 == 1) {
                     client.field3778[++client.field3777 - 1] = var5;
                  }
               } else if(var8 == 3) {
                  client.field3805[++client.field3853 - 1] = var5;
               }
            }
         }

         class40.method692(var0, var1);

         int var14;
         for(var14 = 0; var14 < client.field3777; ++var14) {
            var3 = client.field3778[var14];
            class237 var15 = client.field3774[var3];
            var5 = var1.readUnsignedByte();
            if((var5 & 1) != 0) { //face entity
               var15.field1285 = var1.readUnsignedShortLE();
               var15.interactingChanged(-1);
               if(var15.field1285 == 65535) {
                  var15.field1285 = -1;
                  var15.interactingChanged(-1);
               }
            }

            int var16;
            if((var5 & 64) != 0) { //face coord
               var16 = var1.readUnsignedShortLE128();
               var7 = var1.readUnsignedShortLE128();
               var8 = var15.field1277 - (var16 - class296.somex - class296.somex) * 64;
               var9 = var15.field1259 - (var7 - somey - somey) * 64;
               if(var8 != 0 || var9 != 0) {
                  var15.field1301 = (int)(Math.atan2((double)var8, (double)var9) * 325.949D) & 2047;
               }
            }

            if((var5 & 32) != 0) { //anim
               var16 = var1.readUnsignedShort();
               if(var16 == 65535) {
                  var16 = -1;
               }

               var7 = var1.readUnsigned128Byte();
               if(var16 == var15.field1273 && var16 != -1) {
                  var8 = class182.method3192(var16).field3412;
                  if(var8 == 1) {
                     var15.field1292 = 0;
                     var15.field1317 = 0;
                     var15.field1294 = var7;
                     var15.field1295 = 0;
                  }

                  if(var8 == 2) {
                     var15.field1295 = 0;
                  }
               } else if(var16 == -1 || var15.field1273 == -1 || class182.method3192(var16).field3423 >= class182.method3192(var15.field1273).field3423) {
                  var15.field1273 = var16;
                  var15.animationChanged(-1);
                  var15.field1292 = 0;
                  var15.field1317 = 0;
                  var15.field1294 = var7;
                  var15.field1295 = 0;
                  var15.field1318 = var15.field1279;
               }
            }

            if((var5 & 4) != 0) { //transform
               class222 var10001 = class25.method361(var1.readUnsignedShort());
               var15.onCompositionChanged((RSNPCComposition)var10001);
               var15.field2400 = var10001;
               var15.field1262 = var15.field2400.field2144;
               var15.field1312 = var15.field2400.field2142;
               var15.field1290 = var15.field2400.field2150;
               var15.field1267 = var15.field2400.field2151;
               var15.field1264 = var15.field2400.field2152;
               var15.field1270 = var15.field2400.field2172;
               var15.field1276 = var15.field2400.field2147;
               var15.field1314 = var15.field2400.field2148;
               var15.field1309 = var15.field2400.field2160;
            }

            if((var5 & 16) != 0) { //hits
               var16 = var1.readUnsignedByteC();
               int var12;
               if(var16 > 0) {
                  for(var7 = 0; var7 < var16; ++var7) {
                     var9 = -1;
                     var10 = -1;
                     var11 = -1;
                     var8 = var1.readSmart();
                     if(var8 == 32767) {
                        var8 = var1.readSmart();
                        var10 = var1.readSmart();
                        var9 = var1.readSmart();
                        var11 = var1.readSmart();
                     } else if(var8 != 32766) {
                        var10 = var1.readSmart();
                     } else {
                        var8 = -1;
                     }

                     var12 = var1.readSmart();
                     var15.method2451(var8, var10, var9, var11, client.field3744, var12);
                  }
               }

               var7 = var1.readUnsignedByte128();
               if(var7 > 0) {
                  for(var8 = 0; var8 < var7; ++var8) {
                     var9 = var1.readSmart();
                     var10 = var1.readSmart();
                     if(var10 != 32767) {
                        var11 = var1.readSmart();
                        var12 = var1.readUnsignedByte();
                        int var13 = var10 > 0?var1.readUnsigned128Byte():var12;
                        var15.method2461(var9, client.field3744, var10, var11, var12, var13);
                     } else {
                        var15.method2448(var9);
                     }
                  }
               }
            }

            if((var5 & 8) != 0) { //graphics
               var15.field1296 = var1.readUnsignedShortLE();
               var15.graphicChanged(-1);
               var16 = var1.readIntV1();
               var15.field1286 = var16 >> 16;
               var15.field1299 = (var16 & 65535) + client.field3744;
               var15.field1297 = 0;
               var15.field1298 = 0;
               if(var15.field1299 > client.field3744) {
                  var15.field1297 = -1;
               }

               if(var15.field1296 == 65535) {
                  var15.field1296 = -1;
                  var15.graphicChanged(-1);
               }
            }

            if((var5 & 2) != 0) { //force chat
               var15.field1272 = var1.readString();
               var15.field1268 = 100;
            }
         }

         for(var14 = 0; var14 < client.field3853; ++var14) {
            var3 = client.field3805[var14];
            if(client.field3774[var3].field1308 != client.field3744) {
               class237 var10000 = client.field3774[var3];
               client.field3774[var3].onCompositionChanged((RSNPCComposition)null);
               var10000.field2400 = null;
               client.field3774[var3] = null;
               client.cachedNPCsChanged(var3);
            }
         }

         if(var1.field1073 != client.field3963.packetLength) {
            throw new RuntimeException(var1.field1073 + "," + client.field3963.packetLength);
         } else {
            for(var14 = 0; var14 < client.field3775; ++var14) {
               if(client.field3774[client.field3776[var14]] == null) {
                  throw new RuntimeException(var14 + "," + client.field3775);
               }
            }

         }
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(IIIIIILdh;Lfr;B)V",
      garbageValue = "11"
   )
   static final void method5032(int var0, int var1, int var2, int var3, int var4, int var5, class312 var6, class182 var7) {
      if(!client.field3736 || (class31.field239[0][var1][var2] & 2) != 0 || (class31.field239[var0][var1][var2] & 16) == 0) {
         if(var0 < class31.field246) {
            class31.field246 = var0;
         }

         class172 var8 = class152.method2696(var3);
         int var9;
         int var10;
         if(var4 != 1 && var4 != 3) {
            var9 = var8.field1592;
            var10 = var8.field1635;
         } else {
            var9 = var8.field1635;
            var10 = var8.field1592;
         }

         int var11;
         int var12;
         if(var9 + var1 <= 104) {
            var11 = (var9 >> 1) + var1;
            var12 = (var9 + 1 >> 1) + var1;
         } else {
            var11 = var1;
            var12 = var1 + 1;
         }

         int var13;
         int var14;
         if(var10 + var2 <= 104) {
            var13 = (var10 >> 1) + var2;
            var14 = var2 + (var10 + 1 >> 1);
         } else {
            var13 = var2;
            var14 = var2 + 1;
         }

         int[][] var15 = class31.field249[var0];
         int var16 = var15[var12][var13] + var15[var11][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
         int var17 = (var1 << 7) + (var9 << 6);
         int var18 = (var2 << 7) + (var10 << 6);
         long var19 = class216.method3818(var1, var2, 2, var8.field1609 == 0, var3);
         int var21 = var5 + (var4 << 6);
         if(var8.field1630 == 1) {
            var21 += 256;
         }

         int var23;
         int var24;
         if(var8.method2901()) {
            class282 var22 = new class282();
            var22.field3039 = var0;
            var22.field3040 = var1 * 128;
            var22.field3041 = var2 * 128;
            var23 = var8.field1592;
            var24 = var8.field1635;
            if(var4 == 1 || var4 == 3) {
               var23 = var8.field1635;
               var24 = var8.field1592;
            }

            var22.field3049 = (var23 + var1) * 128;
            var22.field3043 = (var24 + var2) * 128;
            var22.field3042 = var8.field1634;
            var22.field3044 = var8.field1593 * 128;
            var22.field3047 = var8.field1636;
            var22.field3048 = var8.field1637;
            var22.field3038 = var8.field1602;
            if(var8.field1631 != null) {
               var22.field3052 = var8;
               var22.method5018();
            }

            class282.field3050.method5600(var22);
            if(var22.field3038 != null) {
               var22.field3045 = var22.field3047 + (int)(Math.random() * (double)(var22.field3048 - var22.field3047));
            }
         }

         Object var34;
         if(var5 == 22) {
            if(!client.field3736 || var8.field1609 != 0 || var8.field1615 == 1 || var8.field1628) {
               if(var8.field1613 == -1 && var8.field1631 == null) {
                  var34 = var8.method2894(22, var4, var15, var17, var16, var18);
               } else {
                  var34 = new class234(var3, 22, var4, var0, var1, var2, var8.field1613, true, (class308)null);
               }

               var6.method5407(var0, var1, var2, var16, (class308)var34, var19, var21);
               if(var8.field1615 == 1 && var7 != null) {
                  var7.method3165(var1, var2);
               }

            }
         } else if(var5 != 10 && var5 != 11) {
            if(var5 >= 12) {
               if(var8.field1613 == -1 && var8.field1631 == null) {
                  var34 = var8.method2894(var5, var4, var15, var17, var16, var18);
               } else {
                  var34 = new class234(var3, var5, var4, var0, var1, var2, var8.field1613, true, (class308)null);
               }

               var6.method5341(var0, var1, var2, var16, 1, 1, (class308)var34, 0, var19, var21);
               if(var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                  class188.field1801[var0][var1][var2] |= 2340;
               }

               if(var8.field1615 != 0 && var7 != null) {
                  var7.method3163(var1, var2, var9, var10, var8.field1608);
               }

            } else if(var5 == 0) {
               if(var8.field1613 == -1 && var8.field1631 == null) {
                  var34 = var8.method2894(0, var4, var15, var17, var16, var18);
               } else {
                  var34 = new class234(var3, 0, var4, var0, var1, var2, var8.field1613, true, (class308)null);
               }

               var6.method5339(var0, var1, var2, var16, (class308)var34, (class308)null, class31.field245[var4], 0, var19, var21);
               if(var4 == 0) {
                  if(var8.field1607) {
                     class152.field1452[var0][var1][var2] = 50;
                     class152.field1452[var0][var1][var2 + 1] = 50;
                  }

                  if(var8.field1606) {
                     class188.field1801[var0][var1][var2] |= 585;
                  }
               } else if(var4 == 1) {
                  if(var8.field1607) {
                     class152.field1452[var0][var1][var2 + 1] = 50;
                     class152.field1452[var0][var1 + 1][var2 + 1] = 50;
                  }

                  if(var8.field1606) {
                     class188.field1801[var0][var1][1 + var2] |= 1170;
                  }
               } else if(var4 == 2) {
                  if(var8.field1607) {
                     class152.field1452[var0][var1 + 1][var2] = 50;
                     class152.field1452[var0][var1 + 1][var2 + 1] = 50;
                  }

                  if(var8.field1606) {
                     class188.field1801[var0][var1 + 1][var2] |= 585;
                  }
               } else if(var4 == 3) {
                  if(var8.field1607) {
                     class152.field1452[var0][var1][var2] = 50;
                     class152.field1452[var0][var1 + 1][var2] = 50;
                  }

                  if(var8.field1606) {
                     class188.field1801[var0][var1][var2] |= 1170;
                  }
               }

               if(var8.field1615 != 0 && var7 != null) {
                  var7.method3162(var1, var2, var5, var4, var8.field1608);
               }

               if(var8.field1614 != 16) {
                  var6.method5478(var0, var1, var2, var8.field1614);
               }

            } else if(var5 == 1) {
               if(var8.field1613 == -1 && var8.field1631 == null) {
                  var34 = var8.method2894(1, var4, var15, var17, var16, var18);
               } else {
                  var34 = new class234(var3, 1, var4, var0, var1, var2, var8.field1613, true, (class308)null);
               }

               var6.method5339(var0, var1, var2, var16, (class308)var34, (class308)null, class31.field238[var4], 0, var19, var21);
               if(var8.field1607) {
                  if(var4 == 0) {
                     class152.field1452[var0][var1][var2 + 1] = 50;
                  } else if(var4 == 1) {
                     class152.field1452[var0][var1 + 1][var2 + 1] = 50;
                  } else if(var4 == 2) {
                     class152.field1452[var0][var1 + 1][var2] = 50;
                  } else if(var4 == 3) {
                     class152.field1452[var0][var1][var2] = 50;
                  }
               }

               if(var8.field1615 != 0 && var7 != null) {
                  var7.method3162(var1, var2, var5, var4, var8.field1608);
               }

            } else {
               int var28;
               if(var5 == 2) {
                  var28 = var4 + 1 & 3;
                  Object var29;
                  Object var30;
                  if(var8.field1613 == -1 && var8.field1631 == null) {
                     var29 = var8.method2894(2, var4 + 4, var15, var17, var16, var18);
                     var30 = var8.method2894(2, var28, var15, var17, var16, var18);
                  } else {
                     var29 = new class234(var3, 2, var4 + 4, var0, var1, var2, var8.field1613, true, (class308)null);
                     var30 = new class234(var3, 2, var28, var0, var1, var2, var8.field1613, true, (class308)null);
                  }

                  var6.method5339(var0, var1, var2, var16, (class308)var29, (class308)var30, class31.field245[var4], class31.field245[var28], var19, var21);
                  if(var8.field1606) {
                     if(var4 == 0) {
                        class188.field1801[var0][var1][var2] |= 585;
                        class188.field1801[var0][var1][var2 + 1] |= 1170;
                     } else if(var4 == 1) {
                        class188.field1801[var0][var1][1 + var2] |= 1170;
                        class188.field1801[var0][var1 + 1][var2] |= 585;
                     } else if(var4 == 2) {
                        class188.field1801[var0][var1 + 1][var2] |= 585;
                        class188.field1801[var0][var1][var2] |= 1170;
                     } else if(var4 == 3) {
                        class188.field1801[var0][var1][var2] |= 1170;
                        class188.field1801[var0][var1][var2] |= 585;
                     }
                  }

                  if(var8.field1615 != 0 && var7 != null) {
                     var7.method3162(var1, var2, var5, var4, var8.field1608);
                  }

                  if(var8.field1614 != 16) {
                     var6.method5478(var0, var1, var2, var8.field1614);
                  }

               } else if(var5 == 3) {
                  if(var8.field1613 == -1 && var8.field1631 == null) {
                     var34 = var8.method2894(3, var4, var15, var17, var16, var18);
                  } else {
                     var34 = new class234(var3, 3, var4, var0, var1, var2, var8.field1613, true, (class308)null);
                  }

                  var6.method5339(var0, var1, var2, var16, (class308)var34, (class308)null, class31.field238[var4], 0, var19, var21);
                  if(var8.field1607) {
                     if(var4 == 0) {
                        class152.field1452[var0][var1][var2 + 1] = 50;
                     } else if(var4 == 1) {
                        class152.field1452[var0][var1 + 1][var2 + 1] = 50;
                     } else if(var4 == 2) {
                        class152.field1452[var0][var1 + 1][var2] = 50;
                     } else if(var4 == 3) {
                        class152.field1452[var0][var1][var2] = 50;
                     }
                  }

                  if(var8.field1615 != 0 && var7 != null) {
                     var7.method3162(var1, var2, var5, var4, var8.field1608);
                  }

               } else if(var5 == 9) {
                  if(var8.field1613 == -1 && var8.field1631 == null) {
                     var34 = var8.method2894(var5, var4, var15, var17, var16, var18);
                  } else {
                     var34 = new class234(var3, var5, var4, var0, var1, var2, var8.field1613, true, (class308)null);
                  }

                  var6.method5341(var0, var1, var2, var16, 1, 1, (class308)var34, 0, var19, var21);
                  if(var8.field1615 != 0 && var7 != null) {
                     var7.method3163(var1, var2, var9, var10, var8.field1608);
                  }

                  if(var8.field1614 != 16) {
                     var6.method5478(var0, var1, var2, var8.field1614);
                  }

               } else if(var5 == 4) {
                  if(var8.field1613 == -1 && var8.field1631 == null) {
                     var34 = var8.method2894(4, var4, var15, var17, var16, var18);
                  } else {
                     var34 = new class234(var3, 4, var4, var0, var1, var2, var8.field1613, true, (class308)null);
                  }

                  var6.method5340(var0, var1, var2, var16, (class308)var34, (class308)null, class31.field245[var4], 0, 0, 0, var19, var21);
               } else {
                  long var31;
                  Object var33;
                  if(var5 == 5) {
                     var28 = 16;
                     var31 = var6.method5357(var0, var1, var2);
                     if(0L != var31) {
                        var28 = class152.method2696(class233.method4163(var31)).field1614;
                     }

                     if(var8.field1613 == -1 && var8.field1631 == null) {
                        var33 = var8.method2894(4, var4, var15, var17, var16, var18);
                     } else {
                        var33 = new class234(var3, 4, var4, var0, var1, var2, var8.field1613, true, (class308)null);
                     }

                     var6.method5340(var0, var1, var2, var16, (class308)var33, (class308)null, class31.field245[var4], 0, var28 * class31.field240[var4], var28 * class31.field248[var4], var19, var21);
                  } else if(var5 == 6) {
                     var28 = 8;
                     var31 = var6.method5357(var0, var1, var2);
                     if(0L != var31) {
                        var28 = class152.method2696(class233.method4163(var31)).field1614 / 2;
                     }

                     if(var8.field1613 == -1 && var8.field1631 == null) {
                        var33 = var8.method2894(4, var4 + 4, var15, var17, var16, var18);
                     } else {
                        var33 = new class234(var3, 4, var4 + 4, var0, var1, var2, var8.field1613, true, (class308)null);
                     }

                     var6.method5340(var0, var1, var2, var16, (class308)var33, (class308)null, 256, var4, var28 * class31.field253[var4], var28 * class31.field250[var4], var19, var21);
                  } else if(var5 == 7) {
                     var23 = var4 + 2 & 3;
                     if(var8.field1613 == -1 && var8.field1631 == null) {
                        var34 = var8.method2894(4, var23 + 4, var15, var17, var16, var18);
                     } else {
                        var34 = new class234(var3, 4, var23 + 4, var0, var1, var2, var8.field1613, true, (class308)null);
                     }

                     var6.method5340(var0, var1, var2, var16, (class308)var34, (class308)null, 256, var23, 0, 0, var19, var21);
                  } else if(var5 == 8) {
                     var28 = 8;
                     var31 = var6.method5357(var0, var1, var2);
                     if(var31 != 0L) {
                        var28 = class152.method2696(class233.method4163(var31)).field1614 / 2;
                     }

                     int var27 = var4 + 2 & 3;
                     Object var26;
                     if(var8.field1613 == -1 && var8.field1631 == null) {
                        var33 = var8.method2894(4, var4 + 4, var15, var17, var16, var18);
                        var26 = var8.method2894(4, var27 + 4, var15, var17, var16, var18);
                     } else {
                        var33 = new class234(var3, 4, var4 + 4, var0, var1, var2, var8.field1613, true, (class308)null);
                        var26 = new class234(var3, 4, var27 + 4, var0, var1, var2, var8.field1613, true, (class308)null);
                     }

                     var6.method5340(var0, var1, var2, var16, (class308)var33, (class308)var26, 256, var4, var28 * class31.field253[var4], var28 * class31.field250[var4], var19, var21);
                  }
               }
            }
         } else {
            if(var8.field1613 == -1 && var8.field1631 == null) {
               var34 = var8.method2894(10, var4, var15, var17, var16, var18);
            } else {
               var34 = new class234(var3, 10, var4, var0, var1, var2, var8.field1613, true, (class308)null);
            }

            if(var34 != null && var6.method5341(var0, var1, var2, var16, var9, var10, (class308)var34, var5 == 11?256:0, var19, var21) && var8.field1607) {
               var23 = 15;
               if(var34 instanceof class200) {
                  var23 = ((class200)var34).method3376() / 4;
                  if(var23 > 30) {
                     var23 = 30;
                  }
               }

               for(var24 = 0; var24 <= var9; ++var24) {
                  for(int var25 = 0; var25 <= var10; ++var25) {
                     if(var23 > class152.field1452[var0][var24 + var1][var25 + var2]) {
                        class152.field1452[var0][var24 + var1][var25 + var2] = (byte)var23;
                     }
                  }
               }
            }

            if(var8.field1615 != 0 && var7 != null) {
               var7.method3163(var1, var2, var9, var10, var8.field1608);
            }

         }
      }
   }
}
