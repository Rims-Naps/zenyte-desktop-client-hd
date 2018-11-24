package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.rs.api.RSSceneTileModel;

@ObfuscatedName("dp")
public final class class114 implements RSSceneTileModel {
   @ObfuscatedName("j")
   static int[] field1312;
   @ObfuscatedName("n")
   static int[] field1309;
   @ObfuscatedName("h")
   static final int[][] field1306;
   @ObfuscatedName("u")
   static int[] field1314;
   @ObfuscatedName("b")
   static int[] field1313;
   @ObfuscatedName("o")
   static final int[][] field1318;
   @ObfuscatedName("t")
   static int[] field1315;
   @ObfuscatedName("z")
   int field1300;
   @ObfuscatedName("p")
   int[] field1304;
   @ObfuscatedName("c")
   int[] field1303;
   @ObfuscatedName("l")
   int[] field1298;
   @ObfuscatedName("s")
   int[] field1297;
   @ObfuscatedName("f")
   int[] field1316;
   @ObfuscatedName("r")
   int[] field1305;
   @ObfuscatedName("m")
   int[] field1311;
   public int rl$modelBufferOffset;
   public int rl$modelUvBufferOffset;
   public int rl$modelBufferLen;
   @ObfuscatedName("x")
   int field1317;
   @ObfuscatedName("v")
   int field1308;
   @ObfuscatedName("d")
   boolean field1307;
   @ObfuscatedName("a")
   int[] field1302;
   @ObfuscatedName("g")
   int field1310;
   @ObfuscatedName("e")
   int[] field1301;
   @ObfuscatedName("w")
   int[] field1299;

   static {
      field1312 = new int[6];
      field1313 = new int[6];
      field1314 = new int[6];
      field1315 = new int[6];
      field1309 = new int[6];
      field1306 = new int[][]{{1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 2, 6}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 13, 14}};
      field1318 = new int[][]{{0, 1, 2, 3, 0, 0, 1, 3}, {1, 1, 2, 3, 1, 0, 1, 3}, {0, 1, 2, 3, 1, 0, 1, 3}, {0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3}, {0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4}, {0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4}, {0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3}, {0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3}, {0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5}, {0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5}, {0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3}, {1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3}, {1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}};
   }

   class114(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19) {
      this.field1307 = true;
      if(var7 != var6 || var8 != var6 || var9 != var6) {
         this.field1307 = false;
      }

      this.field1300 = var1;
      this.field1317 = var2;
      this.field1308 = var18;
      this.field1310 = var19;
      short var20 = 128;
      int var21 = var20 / 2;
      int var22 = var20 / 4;
      int var23 = var20 * 3 / 4;
      int[] var24 = field1306[var1];
      int var25 = var24.length;
      this.field1316 = new int[var25];
      this.field1298 = new int[var25];
      this.field1299 = new int[var25];
      int[] var26 = new int[var25];
      int[] var27 = new int[var25];
      int var28 = var20 * var4;
      int var29 = var5 * var20;

      int var31;
      int var32;
      int var33;
      int var34;
      int var35;
      int var36;
      for(int var30 = 0; var30 < var25; ++var30) {
         var31 = var24[var30];
         if((var31 & 1) == 0 && var31 <= 8) {
            var31 = (var31 - var2 - var2 - 1 & 7) + 1;
         }

         if(var31 > 8 && var31 <= 12) {
            var31 = (var31 - 9 - var2 & 3) + 9;
         }

         if(var31 > 12 && var31 <= 16) {
            var31 = (var31 - 13 - var2 & 3) + 13;
         }

         if(var31 == 1) {
            var32 = var28;
            var33 = var29;
            var34 = var6;
            var35 = var10;
            var36 = var14;
         } else if(var31 == 2) {
            var32 = var28 + var21;
            var33 = var29;
            var34 = var7 + var6 >> 1;
            var35 = var11 + var10 >> 1;
            var36 = var15 + var14 >> 1;
         } else if(var31 == 3) {
            var32 = var28 + var20;
            var33 = var29;
            var34 = var7;
            var35 = var11;
            var36 = var15;
         } else if(var31 == 4) {
            var32 = var28 + var20;
            var33 = var29 + var21;
            var34 = var8 + var7 >> 1;
            var35 = var11 + var12 >> 1;
            var36 = var15 + var16 >> 1;
         } else if(var31 == 5) {
            var32 = var28 + var20;
            var33 = var29 + var20;
            var34 = var8;
            var35 = var12;
            var36 = var16;
         } else if(var31 == 6) {
            var32 = var28 + var21;
            var33 = var29 + var20;
            var34 = var8 + var9 >> 1;
            var35 = var13 + var12 >> 1;
            var36 = var17 + var16 >> 1;
         } else if(var31 == 7) {
            var32 = var28;
            var33 = var29 + var20;
            var34 = var9;
            var35 = var13;
            var36 = var17;
         } else if(var31 == 8) {
            var32 = var28;
            var33 = var29 + var21;
            var34 = var9 + var6 >> 1;
            var35 = var13 + var10 >> 1;
            var36 = var17 + var14 >> 1;
         } else if(var31 == 9) {
            var32 = var28 + var21;
            var33 = var29 + var22;
            var34 = var7 + var6 >> 1;
            var35 = var11 + var10 >> 1;
            var36 = var15 + var14 >> 1;
         } else if(var31 == 10) {
            var32 = var28 + var23;
            var33 = var29 + var21;
            var34 = var8 + var7 >> 1;
            var35 = var11 + var12 >> 1;
            var36 = var15 + var16 >> 1;
         } else if(var31 == 11) {
            var32 = var28 + var21;
            var33 = var29 + var23;
            var34 = var8 + var9 >> 1;
            var35 = var13 + var12 >> 1;
            var36 = var17 + var16 >> 1;
         } else if(var31 == 12) {
            var32 = var28 + var22;
            var33 = var29 + var21;
            var34 = var9 + var6 >> 1;
            var35 = var13 + var10 >> 1;
            var36 = var17 + var14 >> 1;
         } else if(var31 == 13) {
            var32 = var28 + var22;
            var33 = var29 + var22;
            var34 = var6;
            var35 = var10;
            var36 = var14;
         } else if(var31 == 14) {
            var32 = var28 + var23;
            var33 = var29 + var22;
            var34 = var7;
            var35 = var11;
            var36 = var15;
         } else if(var31 == 15) {
            var32 = var28 + var23;
            var33 = var29 + var23;
            var34 = var8;
            var35 = var12;
            var36 = var16;
         } else {
            var32 = var28 + var22;
            var33 = var29 + var23;
            var34 = var9;
            var35 = var13;
            var36 = var17;
         }

         this.field1316[var30] = var32;
         this.field1298[var30] = var34;
         this.field1299[var30] = var33;
         var26[var30] = var35;
         var27[var30] = var36;
      }

      int[] var38 = field1318[var1];
      var31 = var38.length / 4;
      this.field1303 = new int[var31];
      this.field1304 = new int[var31];
      this.field1305 = new int[var31];
      this.field1297 = new int[var31];
      this.field1301 = new int[var31];
      this.field1302 = new int[var31];
      if(var3 != -1) {
         this.field1311 = new int[var31];
      }

      var32 = 0;

      for(var33 = 0; var33 < var31; ++var33) {
         var34 = var38[var32];
         var35 = var38[var32 + 1];
         var36 = var38[var32 + 2];
         int var37 = var38[var32 + 3];
         var32 += 4;
         if(var35 < 4) {
            var35 = var35 - var2 & 3;
         }

         if(var36 < 4) {
            var36 = var36 - var2 & 3;
         }

         if(var37 < 4) {
            var37 = var37 - var2 & 3;
         }

         this.field1303[var33] = var35;
         this.field1304[var33] = var36;
         this.field1305[var33] = var37;
         if(var34 == 0) {
            this.field1297[var33] = var26[var35];
            this.field1301[var33] = var26[var36];
            this.field1302[var33] = var26[var37];
            if(this.field1311 != null) {
               this.field1311[var33] = -1;
            }
         } else {
            this.field1297[var33] = var27[var35];
            this.field1301[var33] = var27[var36];
            this.field1302[var33] = var27[var37];
            if(this.field1311 != null) {
               this.field1311[var33] = var3;
            }
         }
      }

      var33 = var6;
      var34 = var7;
      if(var7 < var6) {
         var33 = var7;
      }

      if(var7 > var7) {
         var34 = var7;
      }

      if(var8 < var33) {
         var33 = var8;
      }

      if(var8 > var34) {
         var34 = var8;
      }

      if(var9 < var33) {
         var33 = var9;
      }

      if(var9 > var34) {
         var34 = var9;
      }

      var33 /= 14;
      var34 /= 14;
   }

   public int getBufferOffset() {
      return this.rl$modelBufferOffset;
   }

   public void setBufferOffset(int var1) {
      this.rl$modelBufferOffset = var1;
   }

   public int getUvBufferOffset() {
      return this.rl$modelUvBufferOffset;
   }

   public void setUvBufferOffset(int var1) {
      this.rl$modelUvBufferOffset = var1;
   }

   public int getBufferLen() {
      return this.rl$modelBufferLen;
   }

   public void setBufferLen(int var1) {
      this.rl$modelBufferLen = var1;
   }

   public int[] getVertexX() {
      return this.field1316;
   }

   public int[] getVertexY() {
      return this.field1298;
   }

   public int[] getVertexZ() {
      return this.field1299;
   }

   public int[] getTriangleColorA() {
      return this.field1297;
   }

   public int[] getTriangleColorB() {
      return this.field1301;
   }

   public int[] getTriangleColorC() {
      return this.field1302;
   }

   public int[] getFaceX() {
      return this.field1303;
   }

   public int[] getFaceY() {
      return this.field1304;
   }

   public int[] getFaceZ() {
      return this.field1305;
   }

   public int[] getTriangleTextureId() {
      return this.field1311;
   }

   public int getShape() {
      return this.field1300;
   }

   public int getRotation() {
      return this.field1317;
   }

   public int getModelUnderlay() {
      return this.field1308;
   }

   public int getModelOverlay() {
      return this.field1310;
   }
}
