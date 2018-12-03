package net.runelite.standalone;

import net.runelite.api.Perspective;
import net.runelite.api.Tile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.client.callback.Hooks;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSDecorativeObject;
import net.runelite.rs.api.RSGameObject;
import net.runelite.rs.api.RSGroundObject;
import net.runelite.rs.api.RSItemLayer;
import net.runelite.rs.api.RSNPC;
import net.runelite.rs.api.RSPlayer;
import net.runelite.rs.api.RSProjectile;
import net.runelite.rs.api.RSScene;
import net.runelite.rs.api.RSSceneTileModel;
import net.runelite.rs.api.RSTile;
import net.runelite.rs.api.RSWallObject;

@ObfuscatedName("dh")
public class class111 implements RSScene {
   @ObfuscatedName("af")
   static int field1248;
   @ObfuscatedName("j")
   static int field1235;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "[[Lel;"
   )
   static class332[][] field1262;
   @ObfuscatedName("k")
   static int field1243;
   @ObfuscatedName("ag")
   static int field1247;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "[Lel;"
   )
   static class332[] field1220;
   @ObfuscatedName("ac")
   static boolean field1277;
   @ObfuscatedName("bv")
   static int field1285;
   @ObfuscatedName("bi")
   static int field1283;
   @ObfuscatedName("bu")
   static int field1286;
   @ObfuscatedName("bn")
   static int field1284;
   @ObfuscatedName("an")
   static final int[] field1269;
   @ObfuscatedName("i")
   static int field1242;
   @ObfuscatedName("aa")
   static int field1254;
   @ObfuscatedName("n")
   static int field1239;
   @ObfuscatedName("aw")
   static int field1253;
   @ObfuscatedName("f")
   public static boolean field1255;
   @ObfuscatedName("h")
   static int field1240;
   @ObfuscatedName("u")
   static int field1251;
   @ObfuscatedName("ai")
   static final int[] field1268;
   @ObfuscatedName("y")
   static int field1267;
   @ObfuscatedName("b")
   static int field1244;
   public static int rl$drawDistance;
   public static int[] tmpX;
   public static int[] tmpY;
   @ObfuscatedName("ak")
   static final int[] field1252;
   @ObfuscatedName("be")
   static final int[] field1272;
   @ObfuscatedName("ay")
   static final int[] field1258;
   @ObfuscatedName("av")
   static int field1246;
   @ObfuscatedName("bw")
   static int field1270;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "[Lef;"
   )
   static class195[] field1250;
   @ObfuscatedName("as")
   public static int field1234;
   @ObfuscatedName("ae")
   static int field1260;
   @ObfuscatedName("ab")
   static int field1264;
   @ObfuscatedName("bm")
   static boolean[][][][] field1271;
   @ObfuscatedName("am")
   static int field1226;
   @ObfuscatedName("o")
   static int field1236;
   @ObfuscatedName("g")
   static int field1245;
   @ObfuscatedName("ad")
   static boolean field1257;
   @ObfuscatedName("ap")
   static int[] field1261;
   @ObfuscatedName("t")
   static int field1274;
   @ObfuscatedName("bg")
   static boolean[][] field1280;
   @ObfuscatedName("bq")
   static int field1279;
   @ObfuscatedName("q")
   static int field1282;
   @ObfuscatedName("al")
   public static int field1256;
   @ObfuscatedName("ah")
   static final int[] field1263;
   @ObfuscatedName("az")
   static int field1249;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   static class70 field1281;
   @ObfuscatedName("aj")
   static final int[] field1266;
   @ObfuscatedName("p")
   int field1227;
   @ObfuscatedName("c")
   int field1222;
   @ObfuscatedName("l")
   int field1237;
   @ObfuscatedName("s")
   int field1223;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "[Lef;"
   )
   class195[] field1228;
   @ObfuscatedName("m")
   int[][][] field1229;
   @ObfuscatedName("bs")
   int[][] field1238;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "[[[Ldx;"
   )
   class110[][][] field1225;
   @ObfuscatedName("ba")
   int[][] field1278;
   @ObfuscatedName("e")
   int[][][] field1224;
   @ObfuscatedName("w")
   int field1221;

   static {
      field1255 = true;
      field1245 = 0;
      field1235 = 0;
      field1250 = new class195[100];
      field1277 = false;
      field1226 = 0;
      field1253 = 0;
      field1254 = 0;
      field1234 = -1;
      field1256 = -1;
      field1257 = false;
      field1260 = 4;
      field1261 = new int[field1260];
      field1262 = new class332[field1260][500];
      field1264 = 0;
      field1220 = new class332[500];
      field1281 = new class70();
      field1266 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
      field1263 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
      field1268 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
      field1269 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
      field1258 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
      field1252 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
      field1272 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
      field1271 = new boolean[8][32][51][51];
      rl$$clinit();
   }

   public class111(int var1, int var2, int var3, int[][][] var4) {
      this.field1222 = 0;
      this.field1227 = 0;
      this.field1228 = new class195[5000];
      this.field1238 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
      this.field1278 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
      this.field1237 = var1;
      this.field1221 = var2;
      this.field1223 = var3;
      this.field1225 = new class110[var1][var2][var3];
      this.field1229 = new int[var1][var2 + 1][var3 + 1];
      this.field1224 = var4;
      this.method1925();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(III)Leg;"
   )
   public class162 method1947(int var1, int var2, int var3) {
      class110 var4 = this.field1225[var1][var2][var3];
      return var4 == null?null:var4.field1201;
   }

   @ObfuscatedName("k")
   public void method1942(int var1, int var2, int var3) {
      class110 var4 = this.field1225[var1][var2][var3];
      if(var4 != null) {
         var4.field1201 = null;
         var4.wallObjectChanged(-1);
      }
   }

   @ObfuscatedName("ag")
   public void method2003(int var1, int var2, int var3) {
      class110 var4 = this.field1225[var1][var2][var3];
      if(var4 != null) {
         var4.field1209 = null;
         var4.itemLayerChanged(-1);
      }
   }

   @ObfuscatedName("aq")
   public void method1963() {
      field1257 = true;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(III)Ldw;"
   )
   public class215 method1950(int var1, int var2, int var3) {
      class110 var4 = this.field1225[var1][var2][var3];
      return var4 != null && var4.field1203 != null?var4.field1203:null;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(Ldb;III)V"
   )
   void method1957(class34 var1, int var2, int var3, int var4) {
      class110 var5;
      class34 var6;
      if(var3 < this.field1221) {
         var5 = this.field1225[var2][var3 + 1][var4];
         if(var5 != null && var5.field1203 != null && var5.field1203.field2937 instanceof class34) {
            var6 = (class34)var5.field1203.field2937;
            class34.method568(var1, var6, 128, 0, 0, true);
         }
      }

      if(var4 < this.field1221) {
         var5 = this.field1225[var2][var3][var4 + 1];
         if(var5 != null && var5.field1203 != null && var5.field1203.field2937 instanceof class34) {
            var6 = (class34)var5.field1203.field2937;
            class34.method568(var1, var6, 0, 0, 128, true);
         }
      }

      if(var3 < this.field1221 && var4 < this.field1223) {
         var5 = this.field1225[var2][var3 + 1][var4 + 1];
         if(var5 != null && var5.field1203 != null && var5.field1203.field2937 instanceof class34) {
            var6 = (class34)var5.field1203.field2937;
            class34.method568(var1, var6, 128, 0, 128, true);
         }
      }

      if(var3 < this.field1221 && var4 > 0) {
         var5 = this.field1225[var2][var3 + 1][var4 - 1];
         if(var5 != null && var5.field1203 != null && var5.field1203.field2937 instanceof class34) {
            var6 = (class34)var5.field1203.field2937;
            class34.method568(var1, var6, 128, 0, -128, true);
         }
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIIIIILdj;IJI)Z"
   )
   public boolean method1935(int var1, int var2, int var3, int var4, int var5, int var6, class102 var7, int var8, long var9, int var11) {
      if(var7 == null) {
         return true;
      } else {
         int var12 = var5 * 64 + var2 * 128;
         int var13 = var6 * 64 + var3 * 128;
         return this.method1938(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(IIIILdj;JI)V"
   )
   public void method2001(int var1, int var2, int var3, int var4, class102 var5, long var6, int var8) {
      this.copy$groundObjectSpawned(var1, var2, var3, var4, var5, var6, var8);
      RSTile var9 = this.getTiles()[var1][var2][var3];
      if(var9 != null) {
         RSGroundObject var10 = (RSGroundObject)var9.getGroundObject();
         if(var10 != null) {
            var10.setPlane(var1);
         }
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(Ldb;IIIII)V"
   )
   void method1983(class34 var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if(var12 != this.field1237) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if(var13 >= 0 && var13 < this.field1221) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if(var14 >= 0 && var14 < this.field1223 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) {
                        class110 var15 = this.field1225[var12][var13][var14];
                        if(var15 != null) {
                           int var16 = (this.field1224[var12][var13 + 1][var14] + this.field1224[var12][var13 + 1][var14 + 1] + this.field1224[var12][var13][var14] + this.field1224[var12][var13][var14 + 1]) / 4 - (this.field1224[var2][var3 + 1][var4] + this.field1224[var2][var3][var4] + this.field1224[var2][var3 + 1][var4 + 1] + this.field1224[var2][var3][var4 + 1]) / 4;
                           class162 var17 = var15.field1201;
                           if(var17 != null) {
                              class34 var18;
                              if(var17.field1961 instanceof class34) {
                                 var18 = (class34)var17.field1961;
                                 class34.method568(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if(var17.field1963 instanceof class34) {
                                 var18 = (class34)var17.field1963;
                                 class34.method568(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.field1205; ++var23) {
                              class195 var19 = var15.field1217[var23];
                              if(var19 != null && var19.field2786 instanceof class34) {
                                 class34 var20 = (class34)var19.field2786;
                                 int var21 = var19.field2780 - var19.field2779 + 1;
                                 int var22 = var19.field2788 - var19.field2781 + 1;
                                 class34.method568(var1, var20, (var21 - var5) * 64 + (var19.field2779 - var3) * 128, var16, (var19.field2781 - var4) * 128 + (var22 - var6) * 64, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Ldk;IIIIIII)V"
   )
   void method1989(class189 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(!class302.field3755.isGpu()) {
         try {
            this.copy$drawTileUnderlay(var1, var2, var3, var4, var5, var6, var7, var8);
         } catch (Exception var41) {
            class302.field3755.getLogger().warn("error during tile underlay rendering", var41);
         }

      } else {
         DrawCallbacks var9 = class302.field3755.getDrawCallbacks();
         if(var9 != null) {
            try {
               int[][][] var10 = this.getTileHeights();
               int var11 = class302.field3755.getCameraX2();
               int var12 = class302.field3755.getCameraY2();
               int var13 = class302.field3755.getCameraZ2();
               int var14 = class302.field3755.get3dZoom();
               int var15 = class302.field3755.getCenterX();
               int var16 = class302.field3755.getCenterY();
               int var17 = class302.field3755.getMouseX2();
               int var18 = class302.field3755.getMouseY2();
               boolean var19 = class302.field3755.isCheckClick();
               int var20;
               int var21 = var20 = (var7 << 7) - var11;
               int var22;
               int var23 = var22 = (var8 << 7) - var13;
               int var24;
               int var25 = var24 = var21 + 128;
               int var26;
               int var27 = var26 = var23 + 128;
               int var28 = var10[var2][var7][var8] - var12;
               int var29 = var10[var2][var7 + 1][var8] - var12;
               int var30 = var10[var2][var7 + 1][var8 + 1] - var12;
               int var31 = var10[var2][var7][var8 + 1] - var12;
               int var32 = var21 * var6 + var5 * var23 >> 16;
               var23 = var23 * var6 - var5 * var21 >> 16;
               var21 = var32;
               var32 = var28 * var4 - var3 * var23 >> 16;
               var23 = var23 * var4 + var3 * var28 >> 16;
               var28 = var32;
               if(var23 >= 50) {
                  var32 = var25 * var6 + var5 * var22 >> 16;
                  var22 = var22 * var6 - var5 * var25 >> 16;
                  var25 = var32;
                  var32 = var29 * var4 - var3 * var22 >> 16;
                  var22 = var22 * var4 + var3 * var29 >> 16;
                  var29 = var32;
                  if(var22 >= 50) {
                     var32 = var24 * var6 + var5 * var27 >> 16;
                     var27 = var27 * var6 - var5 * var24 >> 16;
                     var24 = var32;
                     var32 = var30 * var4 - var3 * var27 >> 16;
                     var27 = var27 * var4 + var3 * var30 >> 16;
                     var30 = var32;
                     if(var27 >= 50) {
                        var32 = var20 * var6 + var5 * var26 >> 16;
                        var26 = var26 * var6 - var5 * var20 >> 16;
                        var20 = var32;
                        var32 = var31 * var4 - var3 * var26 >> 16;
                        var26 = var26 * var4 + var3 * var31 >> 16;
                        if(var26 >= 50) {
                           int var33 = var21 * var14 / var23 + var15;
                           int var34 = var28 * var14 / var23 + var16;
                           int var35 = var25 * var14 / var22 + var15;
                           int var36 = var29 * var14 / var22 + var16;
                           int var37 = var24 * var14 / var27 + var15;
                           int var38 = var30 * var14 / var27 + var16;
                           int var39 = var20 * var14 / var26 + var15;
                           int var40 = var32 * var14 / var26 + var16;
                           var9.drawScenePaint(0, var3, var4, var5, var6, -var11, -var12, -var13, var1, var2, var7, var8, var14, var15, var16);
                           if((var37 - var39) * (var36 - var40) - (var38 - var40) * (var35 - var39) > 0 && var19 && class302.field3755.containsBounds(var17, var18, var38, var40, var36, var37, var39, var35)) {
                              setTargetTile(var7, var8);
                           }

                           if((var33 - var35) * (var40 - var36) - (var34 - var36) * (var39 - var35) > 0 && var19 && class302.field3755.containsBounds(var17, var18, var34, var36, var40, var33, var35, var39)) {
                              setTargetTile(var7, var8);
                           }
                        }
                     }
                  }
               }
            } catch (Exception var42) {
               class302.field3755.getLogger().warn("error during underlay rendering", var42);
            }

         }
      }
   }

   @ObfuscatedName("i")
   public void method2072(int var1, int var2, int var3, int var4) {
      class110 var5 = this.field1225[var1][var2][var3];
      if(var5 != null) {
         class91 var6 = var5.field1202;
         if(var6 != null) {
            var6.field989 = var4 * var6.field989 / 16;
            var6.field990 = var4 * var6.field990 / 16;
         }
      }
   }

   @ObfuscatedName("aa")
   public long method1981(int var1, int var2, int var3) {
      class110 var4 = this.field1225[var1][var2][var3];
      if(var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.field1205; ++var5) {
            class195 var6 = var4.field1217[var5];
            long var8 = var6.field2785;
            boolean var7 = WorldMapData.method2687(var8) == 2;
            if(var7 && var2 == var6.field2779 && var3 == var6.field2781) {
               return var6.field2785;
            }
         }

         return 0L;
      }
   }

   @ObfuscatedName("bf")
   boolean method1973(int var1, int var2, int var3, int var4) {
      if(!this.method1979(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.field1224[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if(var4 < 16) {
            if(var4 == 1) {
               if(var5 > field1243) {
                  if(!this.method1976(var5, var7, var6)) {
                     return false;
                  }

                  if(!this.method1976(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method1976(var5, var8, var6)) {
                     return false;
                  }

                  if(!this.method1976(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method1976(var5, var9, var6)) {
                  return false;
               }

               if(!this.method1976(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 2) {
               if(var6 < field1267) {
                  if(!this.method1976(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if(!this.method1976(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method1976(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if(!this.method1976(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method1976(var5, var9, var6 + 128)) {
                  return false;
               }

               if(!this.method1976(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 4) {
               if(var5 < field1243) {
                  if(!this.method1976(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if(!this.method1976(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method1976(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if(!this.method1976(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method1976(var5 + 128, var9, var6)) {
                  return false;
               }

               if(!this.method1976(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 8) {
               if(var6 > field1267) {
                  if(!this.method1976(var5, var7, var6)) {
                     return false;
                  }

                  if(!this.method1976(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method1976(var5, var8, var6)) {
                     return false;
                  }

                  if(!this.method1976(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if(!this.method1976(var5, var9, var6)) {
                  return false;
               }

               if(!this.method1976(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         return !this.method1976(var5 + 64, var10, var6 + 64)?false:(var4 == 16?this.method1976(var5, var9, var6 + 128):(var4 == 32?this.method1976(var5 + 128, var9, var6 + 128):(var4 == 64?this.method1976(var5 + 128, var9, var6):(var4 == 128?this.method1976(var5, var9, var6):true))));
      }
   }

   @ObfuscatedName("c")
   public void method1930(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      class189 var21;
      int var22;
      if(var4 == 0) {
         var21 = new class189(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.field1225[var22][var2][var3] == null) {
               this.field1225[var22][var2][var3] = new class110(var22, var2, var3);
            }
         }

         this.field1225[var1][var2][var3].field1199 = var21;
      } else if(var4 != 1) {
         class114 var23 = new class114(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.field1225[var22][var2][var3] == null) {
               this.field1225[var22][var2][var3] = new class110(var22, var2, var3);
            }
         }

         this.field1225[var1][var2][var3].field1200 = var23;
      } else {
         var21 = new class189(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7);

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.field1225[var22][var2][var3] == null) {
               this.field1225[var22][var2][var3] = new class110(var22, var2, var3);
            }
         }

         this.field1225[var1][var2][var3].field1199 = var21;
      }
   }

   @ObfuscatedName("aw")
   public long method1952(int var1, int var2, int var3) {
      class110 var4 = this.field1225[var1][var2][var3];
      return var4 != null && var4.field1202 != null?var4.field1202.field993:0L;
   }

   @ObfuscatedName("bo")
   void method1971() {
      int var1 = field1261[field1235];
      class332[] var2 = field1262[field1235];
      field1264 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         class332 var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var9;
         boolean var13;
         if(var4.field3996 == 1) {
            var5 = var4.field3990 - field1236 + 90;
            if(var5 >= 0 && var5 <= 50) {
               var6 = var4.field3992 - field1242 + 90;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field3991 - field1242 + 90;
               if(var7 > 50) {
                  var7 = 50;
               }

               var13 = false;

               while(var6 <= var7) {
                  if(field1280[var5][var6++]) {
                     var13 = true;
                     break;
                  }
               }

               if(var13) {
                  var9 = field1243 - var4.field3995;
                  if(var9 > 32) {
                     var4.field4001 = 1;
                  } else {
                     if(var9 >= -32) {
                        continue;
                     }

                     var4.field4001 = 2;
                     var9 = -var9;
                  }

                  var4.field4004 = (var4.field3994 - field1267 << 8) / var9;
                  var4.field4005 = (var4.field3993 - field1267 << 8) / var9;
                  var4.field4006 = (var4.field3999 - field1282 << 8) / var9;
                  var4.field4007 = (var4.field3998 - field1282 << 8) / var9;
                  field1220[field1264++] = var4;
               }
            }
         } else if(var4.field3996 == 2) {
            var5 = var4.field3992 - field1242 + 90;
            if(var5 >= 0 && var5 <= 50) {
               var6 = var4.field3990 - field1236 + 90;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field4003 - field1236 + 90;
               if(var7 > 50) {
                  var7 = 50;
               }

               var13 = false;

               while(var6 <= var7) {
                  if(field1280[var6++][var5]) {
                     var13 = true;
                     break;
                  }
               }

               if(var13) {
                  var9 = field1267 - var4.field3994;
                  if(var9 > 32) {
                     var4.field4001 = 3;
                  } else {
                     if(var9 >= -32) {
                        continue;
                     }

                     var4.field4001 = 4;
                     var9 = -var9;
                  }

                  var4.field4002 = (var4.field3995 - field1243 << 8) / var9;
                  var4.field4000 = (var4.field3997 - field1243 << 8) / var9;
                  var4.field4006 = (var4.field3999 - field1282 << 8) / var9;
                  var4.field4007 = (var4.field3998 - field1282 << 8) / var9;
                  field1220[field1264++] = var4;
               }
            }
         } else if(var4.field3996 == 4) {
            var5 = var4.field3999 - field1282;
            if(var5 > 128) {
               var6 = var4.field3992 - field1242 + 90;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field3991 - field1242 + 90;
               if(var7 > 50) {
                  var7 = 50;
               }

               if(var6 <= var7) {
                  int var8 = var4.field3990 - field1236 + 90;
                  if(var8 < 0) {
                     var8 = 0;
                  }

                  var9 = var4.field4003 - field1236 + 90;
                  if(var9 > 50) {
                     var9 = 50;
                  }

                  boolean var10 = false;

                  label144:
                  for(int var11 = var8; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if(field1280[var11][var12]) {
                           var10 = true;
                           break label144;
                        }
                     }
                  }

                  if(var10) {
                     var4.field4001 = 5;
                     var4.field4002 = (var4.field3995 - field1243 << 8) / var5;
                     var4.field4000 = (var4.field3997 - field1243 << 8) / var5;
                     var4.field4004 = (var4.field3994 - field1267 << 8) / var5;
                     var4.field4005 = (var4.field3993 - field1267 << 8) / var5;
                     field1220[field1264++] = var4;
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("l")
   public void method2075(int var1) {
      this.field1222 = var1;

      for(int var2 = 0; var2 < this.field1221; ++var2) {
         for(int var3 = 0; var3 < this.field1223; ++var3) {
            if(this.field1225[var1][var2][var3] == null) {
               this.field1225[var1][var2][var3] = new class110(var1, var2, var3);
            }
         }
      }

   }

   @ObfuscatedName("f")
   public void method1925() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.field1237; ++var1) {
         for(var2 = 0; var2 < this.field1221; ++var2) {
            for(int var3 = 0; var3 < this.field1223; ++var3) {
               this.field1225[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < field1260; ++var1) {
         for(var2 = 0; var2 < field1261[var1]; ++var2) {
            field1262[var1][var2] = null;
         }

         field1261[var1] = 0;
      }

      for(var1 = 0; var1 < this.field1227; ++var1) {
         this.field1228[var1] = null;
      }

      this.field1227 = 0;

      for(var1 = 0; var1 < field1250.length; ++var1) {
         field1250[var1] = null;
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(IIIILdj;JLdj;Ldj;)V"
   )
   public void method1958(int var1, int var2, int var3, int var4, class102 var5, long var6, class102 var8, class102 var9) {
      this.copy$addItemPile(var1, var2, var3, var4, var5, var6, var8, var9);
      RSTile var10 = this.getTiles()[var1][var2][var3];
      if(var10 != null) {
         RSItemLayer var11 = (RSItemLayer)var10.getItemLayer();
         if(var11 != null) {
            var11.setPlane(var1);
         }
      }

   }

   @ObfuscatedName("u")
   public void method1939() {
      for(int var1 = 0; var1 < this.field1227; ++var1) {
         class195 var2 = this.field1228[var1];
         this.method1940(var2);
         this.field1228[var1] = null;
      }

      this.field1227 = 0;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(Ldx;Z)V"
   )
   void method1924(class110 var1, boolean var2) {
      field1281.method1499(var1);

      while(true) {
         class110 var3;
         int var4;
         int var5;
         int var6;
         int var7;
         class110[][] var8;
         class110 var9;
         int var11;
         int var14;
         int var15;
         int var16;
         int var24;
         int var25;
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           while(true) {
                              class162 var10;
                              class195 var12;
                              int var17;
                              int var18;
                              boolean var20;
                              int var21;
                              class110 var36;
                              while(true) {
                                 do {
                                    var3 = (class110)field1281.method1498();
                                    if(var3 == null) {
                                       return;
                                    }
                                 } while(!var3.field1211);

                                 var4 = var3.field1204;
                                 var5 = var3.field1197;
                                 var6 = var3.field1214;
                                 var7 = var3.field1198;
                                 var8 = this.field1225[var6];
                                 if(!var3.field1210) {
                                    break;
                                 }

                                 if(var2) {
                                    if(var6 > 0) {
                                       var9 = this.field1225[var6 - 1][var4][var5];
                                       if(var9 != null && var9.field1211) {
                                          continue;
                                       }
                                    }

                                    if(var4 <= field1236 && var4 > field1251) {
                                       var9 = var8[var4 - 1][var5];
                                       if(var9 != null && var9.field1211 && (var9.field1210 || (var3.field1196 & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if(var4 >= field1236 && var4 < field1274 - 1) {
                                       var9 = var8[var4 + 1][var5];
                                       if(var9 != null && var9.field1211 && (var9.field1210 || (var3.field1196 & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if(var5 <= field1242 && var5 > field1239) {
                                       var9 = var8[var4][var5 - 1];
                                       if(var9 != null && var9.field1211 && (var9.field1210 || (var3.field1196 & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if(var5 >= field1242 && var5 < field1240 - 1) {
                                       var9 = var8[var4][var5 + 1];
                                       if(var9 != null && var9.field1211 && (var9.field1210 || (var3.field1196 & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var2 = true;
                                 }

                                 var3.field1210 = false;
                                 if(var3.field1208 != null) {
                                    var9 = var3.field1208;
                                    if(var9.field1199 != null) {
                                       if(!this.method1979(0, var4, var5)) {
                                          this.method1989(var9.field1199, 0, field1246, field1247, field1248, field1249, var4, var5);
                                       }
                                    } else if(var9.field1200 != null && !this.method1979(0, var4, var5)) {
                                       this.method1968(var9.field1200, field1246, field1247, field1248, field1249, var4, var5);
                                    }

                                    var10 = var9.field1201;
                                    if(var10 != null) {
                                       Hooks.renderDraw(var10.field1961, 0, field1246, field1247, field1248, field1249, var10.field1958 - field1243, var10.field1964 - field1282, var10.field1959 - field1267, var10.field1957);
                                    }

                                    for(var11 = 0; var11 < var9.field1205; ++var11) {
                                       var12 = var9.field1217[var11];
                                       if(var12 != null) {
                                          Hooks.renderDraw(var12.field2786, var12.field2778, field1246, field1247, field1248, field1249, var12.field2782 - field1243, var12.field2774 - field1282, var12.field2776 - field1267, var12.field2785);
                                       }
                                    }
                                 }

                                 var20 = false;
                                 if(var3.field1199 != null) {
                                    if(!this.method1979(var7, var4, var5)) {
                                       var20 = true;
                                       if(var3.field1199.field2706 != 12345678 || field1277 && var6 <= field1226) {
                                          this.method1989(var3.field1199, var7, field1246, field1247, field1248, field1249, var4, var5);
                                       }
                                    }
                                 } else if(var3.field1200 != null && !this.method1979(var7, var4, var5)) {
                                    var20 = true;
                                    this.method1968(var3.field1200, field1246, field1247, field1248, field1249, var4, var5);
                                 }

                                 var21 = 0;
                                 var11 = 0;
                                 class162 var31 = var3.field1201;
                                 class91 var13 = var3.field1202;
                                 if(var31 != null || var13 != null) {
                                    if(var4 == field1236) {
                                       ++var21;
                                    } else if(field1236 < var4) {
                                       var21 += 2;
                                    }

                                    if(var5 == field1242) {
                                       var21 += 3;
                                    } else if(field1242 > var5) {
                                       var21 += 6;
                                    }

                                    var11 = field1266[var21];
                                    var3.field1216 = field1268[var21];
                                 }

                                 if(var31 != null) {
                                    if((var31.field1960 & field1263[var21]) != 0) {
                                       if(var31.field1960 == 16) {
                                          var3.field1213 = 3;
                                          var3.field1207 = field1269[var21];
                                          var3.field1215 = 3 - var3.field1207;
                                       } else if(var31.field1960 == 32) {
                                          var3.field1213 = 6;
                                          var3.field1207 = field1258[var21];
                                          var3.field1215 = 6 - var3.field1207;
                                       } else if(var31.field1960 == 64) {
                                          var3.field1213 = 12;
                                          var3.field1207 = field1252[var21];
                                          var3.field1215 = 12 - var3.field1207;
                                       } else {
                                          var3.field1213 = 9;
                                          var3.field1207 = field1272[var21];
                                          var3.field1215 = 9 - var3.field1207;
                                       }
                                    } else {
                                       var3.field1213 = 0;
                                    }

                                    if((var31.field1960 & var11) != 0 && !this.method1973(var7, var4, var5, var31.field1960)) {
                                       Hooks.renderDraw(var31.field1961, 0, field1246, field1247, field1248, field1249, var31.field1958 - field1243, var31.field1964 - field1282, var31.field1959 - field1267, var31.field1957);
                                    }

                                    if((var31.field1962 & var11) != 0 && !this.method1973(var7, var4, var5, var31.field1962)) {
                                       Hooks.renderDraw(var31.field1963, 0, field1246, field1247, field1248, field1249, var31.field1958 - field1243, var31.field1964 - field1282, var31.field1959 - field1267, var31.field1957);
                                    }
                                 }

                                 if(var13 != null && !this.method1974(var7, var4, var5, var13.field991.field1143)) {
                                    if((var13.field985 & var11) != 0) {
                                       Hooks.renderDraw(var13.field991, 0, field1246, field1247, field1248, field1249, var13.field996 - field1243 + var13.field989, var13.field986 - field1282, var13.field992 - field1267 + var13.field990, var13.field993);
                                    } else if(var13.field985 == 256) {
                                       var14 = var13.field996 - field1243;
                                       var15 = var13.field986 - field1282;
                                       var16 = var13.field992 - field1267;
                                       var17 = var13.field988;
                                       if(var17 != 1 && var17 != 2) {
                                          var18 = var14;
                                       } else {
                                          var18 = -var14;
                                       }

                                       int var19;
                                       if(var17 != 2 && var17 != 3) {
                                          var19 = var16;
                                       } else {
                                          var19 = -var16;
                                       }

                                       if(var19 < var18) {
                                          Hooks.renderDraw(var13.field991, 0, field1246, field1247, field1248, field1249, var14 + var13.field989, var15, var16 + var13.field990, var13.field993);
                                       } else if(var13.field984 != null) {
                                          Hooks.renderDraw(var13.field984, 0, field1246, field1247, field1248, field1249, var14, var15, var16, var13.field993);
                                       }
                                    }
                                 }

                                 if(var20) {
                                    class215 var22 = var3.field1203;
                                    if(var22 != null) {
                                       Hooks.renderDraw(var22.field2937, 0, field1246, field1247, field1248, field1249, var22.field2938 - field1243, var22.field2941 - field1282, var22.field2939 - field1267, var22.field2942);
                                    }

                                    class89 var23 = var3.field1209;
                                    if(var23 != null && var23.field971 == 0) {
                                       if(var23.field968 != null) {
                                          Hooks.renderDraw(var23.field968, 0, field1246, field1247, field1248, field1249, var23.field965 - field1243, var23.field964 - field1282, var23.field969 - field1267, var23.field970);
                                       }

                                       if(var23.field966 != null) {
                                          Hooks.renderDraw(var23.field966, 0, field1246, field1247, field1248, field1249, var23.field965 - field1243, var23.field964 - field1282, var23.field969 - field1267, var23.field970);
                                       }

                                       if(var23.field967 != null) {
                                          Hooks.renderDraw(var23.field967, 0, field1246, field1247, field1248, field1249, var23.field965 - field1243, var23.field964 - field1282, var23.field969 - field1267, var23.field970);
                                       }
                                    }
                                 }

                                 var14 = var3.field1196;
                                 if(var14 != 0) {
                                    if(var4 < field1236 && (var14 & 4) != 0) {
                                       var36 = var8[var4 + 1][var5];
                                       if(var36 != null && var36.field1211) {
                                          field1281.method1499(var36);
                                       }
                                    }

                                    if(var5 < field1242 && (var14 & 2) != 0) {
                                       var36 = var8[var4][var5 + 1];
                                       if(var36 != null && var36.field1211) {
                                          field1281.method1499(var36);
                                       }
                                    }

                                    if(var4 > field1236 && (var14 & 1) != 0) {
                                       var36 = var8[var4 - 1][var5];
                                       if(var36 != null && var36.field1211) {
                                          field1281.method1499(var36);
                                       }
                                    }

                                    if(var5 > field1242 && (var14 & 8) != 0) {
                                       var36 = var8[var4][var5 - 1];
                                       if(var36 != null && var36.field1211) {
                                          field1281.method1499(var36);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if(var3.field1213 != 0) {
                                 var20 = true;

                                 for(var21 = 0; var21 < var3.field1205; ++var21) {
                                    if(var3.field1217[var21].field2784 != field1244 && (var3.field1195[var21] & var3.field1213) == var3.field1207) {
                                       var20 = false;
                                       break;
                                    }
                                 }

                                 if(var20) {
                                    var10 = var3.field1201;
                                    if(!this.method1973(var7, var4, var5, var10.field1960)) {
                                       Hooks.renderDraw(var10.field1961, 0, field1246, field1247, field1248, field1249, var10.field1958 - field1243, var10.field1964 - field1282, var10.field1959 - field1267, var10.field1957);
                                    }

                                    var3.field1213 = 0;
                                 }
                              }

                              if(!var3.field1212) {
                                 break;
                              }

                              try {
                                 int var34 = var3.field1205;
                                 var3.field1212 = false;
                                 var21 = 0;

                                 label563:
                                 for(var11 = 0; var11 < var34; ++var11) {
                                    var12 = var3.field1217[var11];
                                    if(var12.field2784 != field1244) {
                                       for(var24 = var12.field2779; var24 <= var12.field2780; ++var24) {
                                          for(var14 = var12.field2781; var14 <= var12.field2788; ++var14) {
                                             var36 = var8[var24][var14];
                                             if(var36.field1210) {
                                                var3.field1212 = true;
                                                continue label563;
                                             }

                                             if(var36.field1213 != 0) {
                                                var16 = 0;
                                                if(var24 > var12.field2779) {
                                                   ++var16;
                                                }

                                                if(var24 < var12.field2780) {
                                                   var16 += 4;
                                                }

                                                if(var14 > var12.field2781) {
                                                   var16 += 8;
                                                }

                                                if(var14 < var12.field2788) {
                                                   var16 += 2;
                                                }

                                                if((var16 & var36.field1213) == var3.field1215) {
                                                   var3.field1212 = true;
                                                   continue label563;
                                                }
                                             }
                                          }
                                       }

                                       field1250[var21++] = var12;
                                       var24 = field1236 - var12.field2779;
                                       var14 = var12.field2780 - field1236;
                                       if(var14 > var24) {
                                          var24 = var14;
                                       }

                                       var15 = field1242 - var12.field2781;
                                       var16 = var12.field2788 - field1242;
                                       if(var16 > var15) {
                                          var12.field2773 = var24 + var16;
                                       } else {
                                          var12.field2773 = var24 + var15;
                                       }
                                    }
                                 }

                                 while(var21 > 0) {
                                    var11 = -50;
                                    var25 = -1;

                                    for(var24 = 0; var24 < var21; ++var24) {
                                       class195 var35 = field1250[var24];
                                       if(var35.field2784 != field1244) {
                                          if(var35.field2773 > var11) {
                                             var11 = var35.field2773;
                                             var25 = var24;
                                          } else if(var11 == var35.field2773) {
                                             var15 = var35.field2782 - field1243;
                                             var16 = var35.field2776 - field1267;
                                             var17 = field1250[var25].field2782 - field1243;
                                             var18 = field1250[var25].field2776 - field1267;
                                             if(var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                                                var25 = var24;
                                             }
                                          }
                                       }
                                    }

                                    if(var25 == -1) {
                                       break;
                                    }

                                    class195 var33 = field1250[var25];
                                    var33.field2784 = field1244;
                                    if(!this.method1975(var7, var33.field2779, var33.field2780, var33.field2781, var33.field2788, var33.field2786.field1143)) {
                                       Hooks.renderDraw(var33.field2786, var33.field2778, field1246, field1247, field1248, field1249, var33.field2782 - field1243, var33.field2774 - field1282, var33.field2776 - field1267, var33.field2785);
                                    }

                                    for(var14 = var33.field2779; var14 <= var33.field2780; ++var14) {
                                       for(var15 = var33.field2781; var15 <= var33.field2788; ++var15) {
                                          class110 var26 = var8[var14][var15];
                                          if(var26.field1213 != 0) {
                                             field1281.method1499(var26);
                                          } else if((var14 != var4 || var15 != var5) && var26.field1211) {
                                             field1281.method1499(var26);
                                          }
                                       }
                                    }
                                 }

                                 if(!var3.field1212) {
                                    break;
                                 }
                              } catch (Exception var28) {
                                 var3.field1212 = false;
                                 break;
                              }
                           }
                        } while(!var3.field1211);
                     } while(var3.field1213 != 0);

                     if(var4 > field1236 || var4 <= field1251) {
                        break;
                     }

                     var9 = var8[var4 - 1][var5];
                  } while(var9 != null && var9.field1211);

                  if(var4 < field1236 || var4 >= field1274 - 1) {
                     break;
                  }

                  var9 = var8[var4 + 1][var5];
               } while(var9 != null && var9.field1211);

               if(var5 > field1242 || var5 <= field1239) {
                  break;
               }

               var9 = var8[var4][var5 - 1];
            } while(var9 != null && var9.field1211);

            if(var5 < field1242 || var5 >= field1240 - 1) {
               break;
            }

            var9 = var8[var4][var5 + 1];
         } while(var9 != null && var9.field1211);

         var3.field1211 = false;
         --field1245;
         class89 var32 = var3.field1209;
         if(var32 != null && var32.field971 != 0) {
            if(var32.field968 != null) {
               Hooks.renderDraw(var32.field968, 0, field1246, field1247, field1248, field1249, var32.field965 - field1243, var32.field964 - field1282 - var32.field971, var32.field969 - field1267, var32.field970);
            }

            if(var32.field966 != null) {
               Hooks.renderDraw(var32.field966, 0, field1246, field1247, field1248, field1249, var32.field965 - field1243, var32.field964 - field1282 - var32.field971, var32.field969 - field1267, var32.field970);
            }

            if(var32.field967 != null) {
               Hooks.renderDraw(var32.field967, 0, field1246, field1247, field1248, field1249, var32.field965 - field1243, var32.field964 - field1282 - var32.field971, var32.field969 - field1267, var32.field970);
            }
         }

         if(var3.field1216 != 0) {
            class91 var29 = var3.field1202;
            if(var29 != null && !this.method1974(var7, var4, var5, var29.field991.field1143)) {
               if((var29.field985 & var3.field1216) != 0) {
                  Hooks.renderDraw(var29.field991, 0, field1246, field1247, field1248, field1249, var29.field996 - field1243 + var29.field989, var29.field986 - field1282, var29.field992 - field1267 + var29.field990, var29.field993);
               } else if(var29.field985 == 256) {
                  var11 = var29.field996 - field1243;
                  var25 = var29.field986 - field1282;
                  var24 = var29.field992 - field1267;
                  var14 = var29.field988;
                  if(var14 != 1 && var14 != 2) {
                     var15 = var11;
                  } else {
                     var15 = -var11;
                  }

                  if(var14 != 2 && var14 != 3) {
                     var16 = var24;
                  } else {
                     var16 = -var24;
                  }

                  if(var16 >= var15) {
                     Hooks.renderDraw(var29.field991, 0, field1246, field1247, field1248, field1249, var11 + var29.field989, var25, var24 + var29.field990, var29.field993);
                  } else if(var29.field984 != null) {
                     Hooks.renderDraw(var29.field984, 0, field1246, field1247, field1248, field1249, var11, var25, var24, var29.field993);
                  }
               }
            }

            class162 var27 = var3.field1201;
            if(var27 != null) {
               if((var27.field1962 & var3.field1216) != 0 && !this.method1973(var7, var4, var5, var27.field1962)) {
                  Hooks.renderDraw(var27.field1963, 0, field1246, field1247, field1248, field1249, var27.field1958 - field1243, var27.field1964 - field1282, var27.field1959 - field1267, var27.field1957);
               }

               if((var27.field1960 & var3.field1216) != 0 && !this.method1973(var7, var4, var5, var27.field1960)) {
                  Hooks.renderDraw(var27.field1961, 0, field1246, field1247, field1248, field1249, var27.field1958 - field1243, var27.field1964 - field1282, var27.field1959 - field1267, var27.field1957);
               }
            }
         }

         class110 var30;
         if(var6 < this.field1237 - 1) {
            var30 = this.field1225[var6 + 1][var4][var5];
            if(var30 != null && var30.field1211) {
               field1281.method1499(var30);
            }
         }

         if(var4 < field1236) {
            var30 = var8[var4 + 1][var5];
            if(var30 != null && var30.field1211) {
               field1281.method1499(var30);
            }
         }

         if(var5 < field1242) {
            var30 = var8[var4][var5 + 1];
            if(var30 != null && var30.field1211) {
               field1281.method1499(var30);
            }
         }

         if(var4 > field1236) {
            var30 = var8[var4 - 1][var5];
            if(var30 != null && var30.field1211) {
               field1281.method1499(var30);
            }
         }

         if(var5 > field1242) {
            var30 = var8[var4][var5 - 1];
            if(var30 != null && var30.field1211) {
               field1281.method1499(var30);
            }
         }
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIIILdj;Ldj;IIJI)V"
   )
   public void method1933(int var1, int var2, int var3, int var4, class102 var5, class102 var6, int var7, int var8, long var9, int var11) {
      this.copy$addBoundary(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11);
      RSTile var12 = this.getTiles()[var1][var2][var3];
      if(var12 != null) {
         RSWallObject var13 = (RSWallObject)var12.getWallObject();
         if(var13 != null) {
            var13.setPlane(var1);
         }
      }

   }

   @ObfuscatedName("y")
   public void method1944(int var1, int var2, int var3) {
      class110 var4 = this.field1225[var1][var2][var3];
      if(var4 != null) {
         for(int var5 = 0; var5 < var4.field1205; ++var5) {
            class195 var6 = var4.field1217[var5];
            long var8 = var6.field2785;
            boolean var7 = WorldMapData.method2687(var8) == 2;
            if(var7 && var2 == var6.field2779 && var3 == var6.field2781) {
               this.method1940(var6);
               return;
            }
         }

      }
   }

   @ObfuscatedSignature(
      signature = "(IIIILdj;JLdj;Ldj;)V"
   )
   public void copy$addItemPile(int var1, int var2, int var3, int var4, class102 var5, long var6, class102 var8, class102 var9) {
      class89 var10 = new class89();
      var10.field967 = var5;
      var10.field965 = var2 * 128 + 64;
      var10.field969 = var3 * 128 + 64;
      var10.field964 = var4;
      var10.field970 = var6;
      var10.field968 = var8;
      var10.field966 = var9;
      int var11 = 0;
      class110 var12 = this.field1225[var1][var2][var3];
      if(var12 != null) {
         for(int var13 = 0; var13 < var12.field1205; ++var13) {
            if((var12.field1217[var13].field2787 & 256) == 256 && var12.field1217[var13].field2786 instanceof class52) {
               class52 var14 = (class52)var12.field1217[var13].field2786;
               var14.method1126();
               if(var14.field1143 > var11) {
                  var11 = var14.field1143;
               }
            }
         }
      }

      var10.field971 = var11;
      if(this.field1225[var1][var2][var3] == null) {
         this.field1225[var1][var2][var3] = new class110(var1, var2, var3);
      }

      this.field1225[var1][var2][var3].field1209 = var10;
      this.field1225[var1][var2][var3].itemLayerChanged(-1);
   }

   @ObfuscatedSignature(
      signature = "(IIIILdj;JI)V"
   )
   public void copy$groundObjectSpawned(int var1, int var2, int var3, int var4, class102 var5, long var6, int var8) {
      if(var5 != null) {
         class215 var9 = new class215();
         var9.field2937 = var5;
         var9.field2938 = var2 * 128 + 64;
         var9.field2939 = var3 * 128 + 64;
         var9.field2941 = var4;
         var9.field2942 = var6;
         var9.field2940 = var8;
         if(this.field1225[var1][var2][var3] == null) {
            this.field1225[var1][var2][var3] = new class110(var1, var2, var3);
         }

         this.field1225[var1][var2][var3].field1203 = var9;
         this.field1225[var1][var2][var3].groundObjectChanged(-1);
      }
   }

   @ObfuscatedSignature(
      signature = "(IIIILdj;Ldj;IIJI)V"
   )
   public void copy$addBoundary(int var1, int var2, int var3, int var4, class102 var5, class102 var6, int var7, int var8, long var9, int var11) {
      if(var5 != null || var6 != null) {
         class162 var12 = new class162();
         var12.field1957 = var9;
         var12.field1965 = var11;
         var12.field1958 = var2 * 128 + 64;
         var12.field1959 = var3 * 128 + 64;
         var12.field1964 = var4;
         var12.field1961 = var5;
         var12.field1963 = var6;
         var12.field1960 = var7;
         var12.field1962 = var8;

         for(int var13 = var1; var13 >= 0; --var13) {
            if(this.field1225[var13][var2][var3] == null) {
               this.field1225[var13][var2][var3] = new class110(var13, var2, var3);
            }
         }

         this.field1225[var1][var2][var3].field1201 = var12;
         this.field1225[var1][var2][var3].wallObjectChanged(-1);
      }
   }

   @ObfuscatedSignature(
      signature = "(IIIILdj;Ldj;IIIIJI)V"
   )
   public void copy$addBoundaryDecoration(int var1, int var2, int var3, int var4, class102 var5, class102 var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if(var5 != null) {
         class91 var14 = new class91();
         var14.field993 = var11;
         var14.field994 = var13;
         var14.field996 = var2 * 128 + 64;
         var14.field992 = var3 * 128 + 64;
         var14.field986 = var4;
         var14.field991 = var5;
         var14.field984 = var6;
         var14.field985 = var7;
         var14.field988 = var8;
         var14.field989 = var9;
         var14.field990 = var10;

         for(int var15 = var1; var15 >= 0; --var15) {
            if(this.field1225[var15][var2][var3] == null) {
               this.field1225[var15][var2][var3] = new class110(var15, var2, var3);
            }
         }

         this.field1225[var1][var2][var3].field1202 = var14;
         this.field1225[var1][var2][var3].decorativeObjectChanged(-1);
      }
   }

   public RSTile[][][] getTiles() {
      return this.field1225;
   }

   @ObfuscatedSignature(
      signature = "(Ldp;IIIIII)V"
   )
   public void copy$drawTileOverlay(class114 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.field1316.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field1316[var9] - field1243;
         var11 = var1.field1298[var9] - field1282;
         var12 = var1.field1299[var9] - field1267;
         var13 = var12 * var4 + var5 * var10 >> 16;
         var12 = var5 * var12 - var10 * var4 >> 16;
         var10 = var13;
         var13 = var3 * var11 - var12 * var2 >> 16;
         var12 = var11 * var2 + var3 * var12 >> 16;
         if(var12 < 50) {
            return;
         }

         if(var1.field1311 != null) {
            class114.field1314[var9] = var10;
            class114.field1315[var9] = var13;
            class114.field1309[var9] = var12;
         }

         class114.field1312[var9] = var10 * class211.field2906 / var12 + class211.field2907;
         class114.field1313[var9] = var13 * class211.field2906 / var12 + class211.field2897;
      }

      class211.field2899 = 0;
      var8 = var1.field1303.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field1303[var9];
         var11 = var1.field1304[var9];
         var12 = var1.field1305[var9];
         var13 = class114.field1312[var10];
         int var14 = class114.field1312[var11];
         int var15 = class114.field1312[var12];
         int var16 = class114.field1313[var10];
         int var17 = class114.field1313[var11];
         int var18 = class114.field1313[var12];
         if((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            class211.field2909 = false;
            if(var13 < 0 || var14 < 0 || var15 < 0 || var13 > class211.field2908 || var14 > class211.field2908 || var15 > class211.field2908) {
               class211.field2909 = true;
            }

            if(field1277 && method1970(field1253, field1254, var16, var17, var18, var13, var14, var15)) {
               field1234 = var6;
               field1256 = var7;
            }

            if(var1.field1311 != null && var1.field1311[var9] != -1) {
               if(!field1255) {
                  if(var1.field1307) {
                     class211.method4319(var16, var17, var18, var13, var14, var15, var1.field1297[var9], var1.field1301[var9], var1.field1302[var9], class114.field1314[0], class114.field1314[1], class114.field1314[3], class114.field1315[0], class114.field1315[1], class114.field1315[3], class114.field1309[0], class114.field1309[1], class114.field1309[3], var1.field1311[var9]);
                  } else {
                     class211.method4319(var16, var17, var18, var13, var14, var15, var1.field1297[var9], var1.field1301[var9], var1.field1302[var9], class114.field1314[var10], class114.field1314[var11], class114.field1314[var12], class114.field1315[var10], class114.field1315[var11], class114.field1315[var12], class114.field1309[var10], class114.field1309[var11], class114.field1309[var12], var1.field1311[var9]);
                  }
               } else {
                  int var19 = class211.field2895.vmethod5292(var1.field1311[var9]);
                  class211.method4256(var16, var17, var18, var13, var14, var15, method1987(var19, var1.field1297[var9]), method1987(var19, var1.field1301[var9]), method1987(var19, var1.field1302[var9]));
               }
            } else if(var1.field1297[var9] != 12345678) {
               class211.method4256(var16, var17, var18, var13, var14, var15, var1.field1297[var9], var1.field1301[var9], var1.field1302[var9]);
            }
         }
      }

   }

   public int getMaxX() {
      return this.field1221;
   }

   @ObfuscatedSignature(
      signature = "(Ldk;IIIIIII)V"
   )
   public void copy$drawTileUnderlay(class189 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - field1243;
      int var11;
      int var12 = var11 = (var8 << 7) - field1267;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.field1224[var2][var7][var8] - field1282;
      int var18 = this.field1224[var2][var7 + 1][var8] - field1282;
      int var19 = this.field1224[var2][var7 + 1][var8 + 1] - field1282;
      int var20 = this.field1224[var2][var7][var8 + 1] - field1282;
      int var21 = var10 * var6 + var5 * var12 >> 16;
      var12 = var12 * var6 - var5 * var10 >> 16;
      var10 = var21;
      var21 = var17 * var4 - var3 * var12 >> 16;
      var12 = var12 * var4 + var3 * var17 >> 16;
      var17 = var21;
      if(var12 >= 50) {
         var21 = var14 * var6 + var5 * var11 >> 16;
         var11 = var11 * var6 - var5 * var14 >> 16;
         var14 = var21;
         var21 = var18 * var4 - var3 * var11 >> 16;
         var11 = var11 * var4 + var3 * var18 >> 16;
         var18 = var21;
         if(var11 >= 50) {
            var21 = var13 * var6 + var5 * var16 >> 16;
            var16 = var16 * var6 - var5 * var13 >> 16;
            var13 = var21;
            var21 = var19 * var4 - var3 * var16 >> 16;
            var16 = var16 * var4 + var3 * var19 >> 16;
            var19 = var21;
            if(var16 >= 50) {
               var21 = var9 * var6 + var5 * var15 >> 16;
               var15 = var15 * var6 - var5 * var9 >> 16;
               var9 = var21;
               var21 = var20 * var4 - var3 * var15 >> 16;
               var15 = var15 * var4 + var3 * var20 >> 16;
               if(var15 >= 50) {
                  int var22 = var10 * class211.field2906 / var12 + class211.field2907;
                  int var23 = var17 * class211.field2906 / var12 + class211.field2897;
                  int var24 = var14 * class211.field2906 / var11 + class211.field2907;
                  int var25 = var18 * class211.field2906 / var11 + class211.field2897;
                  int var26 = var13 * class211.field2906 / var16 + class211.field2907;
                  int var27 = var19 * class211.field2906 / var16 + class211.field2897;
                  int var28 = var9 * class211.field2906 / var15 + class211.field2907;
                  int var29 = var21 * class211.field2906 / var15 + class211.field2897;
                  class211.field2899 = 0;
                  int var30;
                  if((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                     class211.field2909 = false;
                     if(var26 < 0 || var28 < 0 || var24 < 0 || var26 > class211.field2908 || var28 > class211.field2908 || var24 > class211.field2908) {
                        class211.field2909 = true;
                     }

                     if(field1277 && method1970(field1253, field1254, var27, var29, var25, var26, var28, var24)) {
                        field1234 = var7;
                        field1256 = var8;
                     }

                     if(var1.field2708 == -1) {
                        if(var1.field2706 != 12345678) {
                           class211.method4256(var27, var29, var25, var26, var28, var24, var1.field2706, var1.field2705, var1.field2704);
                        }
                     } else if(!field1255) {
                        if(var1.field2711) {
                           class211.method4319(var27, var29, var25, var26, var28, var24, var1.field2706, var1.field2705, var1.field2704, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field2708);
                        } else {
                           class211.method4319(var27, var29, var25, var26, var28, var24, var1.field2706, var1.field2705, var1.field2704, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.field2708);
                        }
                     } else {
                        var30 = class211.field2895.vmethod5292(var1.field2708);
                        class211.method4256(var27, var29, var25, var26, var28, var24, method1987(var30, var1.field2706), method1987(var30, var1.field2705), method1987(var30, var1.field2704));
                     }
                  }

                  if((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     class211.field2909 = false;
                     if(var22 < 0 || var24 < 0 || var28 < 0 || var22 > class211.field2908 || var24 > class211.field2908 || var28 > class211.field2908) {
                        class211.field2909 = true;
                     }

                     if(field1277 && method1970(field1253, field1254, var23, var25, var29, var22, var24, var28)) {
                        field1234 = var7;
                        field1256 = var8;
                     }

                     if(var1.field2708 == -1) {
                        if(var1.field2707 != 12345678) {
                           class211.method4256(var23, var25, var29, var22, var24, var28, var1.field2707, var1.field2704, var1.field2705);
                        }
                     } else if(!field1255) {
                        class211.method4319(var23, var25, var29, var22, var24, var28, var1.field2707, var1.field2704, var1.field2705, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field2708);
                     } else {
                        var30 = class211.field2895.vmethod5292(var1.field2708);
                        class211.method4256(var23, var25, var29, var22, var24, var28, method1987(var30, var1.field2707), method1987(var30, var1.field2704), method1987(var30, var1.field2705));
                     }
                  }

               }
            }
         }
      }
   }

   @ObfuscatedSignature(
      signature = "(IIIIIIIILdj;IZJI)Z"
   )
   public boolean copy$addEntityMarker(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class102 var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if(var15 < 0 || var16 < 0 || var15 >= this.field1221 || var16 >= this.field1223) {
               return false;
            }

            class110 var17 = this.field1225[var1][var15][var16];
            if(var17 != null && var17.field1205 >= 5) {
               return false;
            }
         }
      }

      class195 var21 = new class195();
      var21.field2785 = var12;
      var21.field2787 = var14;
      var21.field2775 = var1;
      var21.field2782 = var6;
      var21.field2776 = var7;
      var21.field2774 = var8;
      var21.field2786 = var9;
      var21.field2778 = var10;
      var21.field2779 = var2;
      var21.field2781 = var3;
      var21.field2780 = var2 + var4 - 1;
      var21.field2788 = var3 + var5 - 1;

      for(var16 = var2; var16 < var2 + var4; ++var16) {
         for(int var22 = var3; var22 < var3 + var5; ++var22) {
            int var18 = 0;
            if(var16 > var2) {
               ++var18;
            }

            if(var16 < var2 + var4 - 1) {
               var18 += 4;
            }

            if(var22 > var3) {
               var18 += 8;
            }

            if(var22 < var3 + var5 - 1) {
               var18 += 2;
            }

            for(int var19 = var1; var19 >= 0; --var19) {
               if(this.field1225[var19][var16][var22] == null) {
                  this.field1225[var19][var16][var22] = new class110(var19, var16, var22);
               }
            }

            class110 var23 = this.field1225[var1][var16][var22];
            var23.field1217[var23.field1205] = var21;
            var23.gameObjectsChanged(var23.field1205);
            var23.field1195[var23.field1205] = var18;
            var23.field1196 |= var18;
            ++var23.field1205;
         }
      }

      if(var11) {
         this.field1228[this.field1227++] = var21;
      }

      return true;
   }

   public int getMaxY() {
      return this.field1237;
   }

   public int[][][] getTileHeights() {
      return this.field1224;
   }

   public int getMaxZ() {
      return this.field1223;
   }

   public int getMinLevel() {
      return this.field1222;
   }

   public void updateOccluders() {
      this.method1971();
   }

   public void draw(Tile var1, boolean var2) {
      this.method1924((class110)var1, var2);
   }

   public int getDrawDistance() {
      return rl$drawDistance;
   }

   public void setDrawDistance(int var1) {
      rl$drawDistance = var1;
   }

   public RSGameObject[] getObjects() {
      return this.field1228;
   }

   public void drawTile(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      this.method1959(var1, var2, var3, var4, var5, var6);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIIIILdj;IJZ)Z"
   )
   public boolean method1936(int var1, int var2, int var3, int var4, int var5, class102 var6, int var7, long var8, boolean var10) {
      if(var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var5 + var2;
         int var14 = var3 + var5;
         if(var10) {
            if(var7 > 640 && var7 < 1408) {
               var14 += 128;
            }

            if(var7 > 1152 && var7 < 1920) {
               var13 += 128;
            }

            if(var7 > 1664 || var7 < 384) {
               var12 -= 128;
            }

            if(var7 > 128 && var7 < 896) {
               var11 -= 128;
            }
         }

         var11 /= 128;
         var12 /= 128;
         var13 /= 128;
         var14 /= 128;
         return this.method1938(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(IIIIILdj;IJIIII)Z"
   )
   public boolean method1937(int var1, int var2, int var3, int var4, int var5, class102 var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null?true:this.method1938(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(Ldp;IIIIII)V"
   )
   void method1968(class114 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(!class302.field3755.isGpu()) {
         this.copy$drawTileOverlay(var1, var2, var3, var4, var5, var6, var7);
      } else {
         DrawCallbacks var8 = class302.field3755.getDrawCallbacks();
         if(var8 != null) {
            try {
               int var9 = class302.field3755.getCameraX2();
               int var10 = class302.field3755.getCameraY2();
               int var11 = class302.field3755.getCameraZ2();
               int var12 = class302.field3755.get3dZoom();
               int var13 = class302.field3755.getCenterX();
               int var14 = class302.field3755.getCenterY();
               var8.drawSceneModel(0, var2, var3, var4, var5, -var9, -var10, -var11, var1, class302.field3755.getPlane(), var6, var7, var12, var13, var14);
               boolean var15 = class302.field3755.isCheckClick();
               if(!var15) {
                  return;
               }

               RSSceneTileModel var16 = (RSSceneTileModel)var1;
               int[] var17 = var16.getFaceX();
               int[] var18 = var16.getFaceY();
               int[] var19 = var16.getFaceZ();
               int[] var20 = var16.getVertexX();
               int[] var21 = var16.getVertexY();
               int[] var22 = var16.getVertexZ();
               int var23 = var20.length;
               int var24 = var17.length;
               int var25 = class302.field3755.getMouseX2();
               int var26 = class302.field3755.getMouseY2();

               int var27;
               int var28;
               int var29;
               int var30;
               int var31;
               int var32;
               int var33;
               int var34;
               int var35;
               int var36;
               for(var27 = 0; var27 < var23; ++var27) {
                  var28 = var20[var27] - var9;
                  var29 = var21[var27] - var10;
                  var30 = var22[var27] - var11;
                  var31 = var30 * var4 + var5 * var28 >> 16;
                  var32 = var5 * var30 - var28 * var4 >> 16;
                  var33 = var3 * var29 - var32 * var2 >> 16;
                  var34 = var29 * var2 + var3 * var32 >> 16;
                  if(var34 < 50) {
                     return;
                  }

                  var35 = var31 * var12 / var34 + var13;
                  var36 = var33 * var12 / var34 + var14;
                  tmpX[var27] = var35;
                  tmpY[var27] = var36;
               }

               for(var27 = 0; var27 < var24; ++var27) {
                  var28 = var17[var27];
                  var29 = var18[var27];
                  var30 = var19[var27];
                  var31 = tmpX[var28];
                  var32 = tmpX[var29];
                  var33 = tmpX[var30];
                  var34 = tmpY[var28];
                  var35 = tmpY[var29];
                  var36 = tmpY[var30];
                  if((var31 - var32) * (var36 - var35) - (var34 - var35) * (var33 - var32) > 0 && class302.field3755.containsBounds(var25, var26, var34, var35, var36, var31, var32, var33)) {
                     setTargetTile(var6, var7);
                     break;
                  }
               }
            } catch (Exception var38) {
               class302.field3755.getLogger().warn("error during overlay rendering", var38);
            }

         }
      }
   }

   @ObfuscatedName("av")
   public void method1945(int var1, int var2, int var3) {
      class110 var4 = this.field1225[var1][var2][var3];
      if(var4 != null) {
         var4.field1203 = null;
         var4.groundObjectChanged(-1);
      }
   }

   @ObfuscatedName("bs")
   boolean method1975(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if(var3 == var2 && var5 == var4) {
         if(!this.method1979(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.method1976(var7 + 1, this.field1224[var1][var2][var4] - var6, var8 + 1) && this.method1976(var7 + 128 - 1, this.field1224[var1][var2 + 1][var4] - var6, var8 + 1) && this.method1976(var7 + 128 - 1, this.field1224[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method1976(var7 + 1, this.field1224[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if(this.field1229[var1][var7][var8] == -field1244) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.field1224[var1][var2][var4] - var6;
         if(!this.method1976(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if(!this.method1976(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if(!this.method1976(var7, var9, var11)) {
                  return false;
               } else if(!this.method1976(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(III)Lef;"
   )
   public class195 method2070(int var1, int var2, int var3) {
      class110 var4 = this.field1225[var1][var2][var3];
      if(var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.field1205; ++var5) {
            class195 var6 = var4.field1217[var5];
            long var8 = var6.field2785;
            boolean var7 = WorldMapData.method2687(var8) == 2;
            if(var7 && var2 == var6.field2779 && var3 == var6.field2781) {
               return var6;
            }
         }

         return null;
      }
   }

   @ObfuscatedName("as")
   public long method1992(int var1, int var2, int var3) {
      class110 var4 = this.field1225[var1][var2][var3];
      return var4 != null && var4.field1203 != null?var4.field1203.field2942:0L;
   }

   @ObfuscatedName("ae")
   public void method1959(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      class110 var7 = this.field1225[var4][var5][var6];
      if(var7 != null) {
         class189 var8 = var7.field1199;
         int var10;
         if(var8 != null) {
            int var9 = var8.field2710;
            if(var9 != 0) {
               for(var10 = 0; var10 < 4; ++var10) {
                  var1[var2] = var9;
                  var1[var2 + 1] = var9;
                  var1[var2 + 2] = var9;
                  var1[var2 + 3] = var9;
                  var2 += var3;
               }

            }
         } else {
            class114 var18 = var7.field1200;
            if(var18 != null) {
               var10 = var18.field1300;
               int var11 = var18.field1317;
               int var12 = var18.field1308;
               int var13 = var18.field1310;
               int[] var14 = this.field1238[var10];
               int[] var15 = this.field1278[var11];
               int var16 = 0;
               int var17;
               if(var12 != 0) {
                  for(var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var14[var15[var16++]] == 0?var12:var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0?var12:var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0?var12:var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0?var12:var13;
                     var2 += var3;
                  }
               } else {
                  for(var17 = 0; var17 < 4; ++var17) {
                     if(var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if(var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if(var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if(var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }

            }
         }
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(IIIILdj;Ldj;IIIIJI)V"
   )
   public void method1934(int var1, int var2, int var3, int var4, class102 var5, class102 var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      this.copy$addBoundaryDecoration(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var13);
      RSTile var14 = this.getTiles()[var1][var2][var3];
      if(var14 != null) {
         RSDecorativeObject var15 = (RSDecorativeObject)var14.getDecorativeObject();
         if(var15 != null) {
            var15.setPlane(var1);
         }
      }

   }

   @ObfuscatedName("ab")
   public void method2096(int var1, int var2, int var3, boolean var4) {
      if(!method1964() || var4) {
         field1277 = true;
         field1257 = var4;
         field1226 = var1;
         field1253 = var2;
         field1254 = var3;
         field1234 = -1;
         field1256 = -1;
      }
   }

   @ObfuscatedName("am")
   public long method1951(int var1, int var2, int var3) {
      class110 var4 = this.field1225[var1][var2][var3];
      return var4 != null && var4.field1201 != null?var4.field1201.field1957:0L;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(Lef;)V"
   )
   void method1940(class195 var1) {
      for(int var2 = var1.field2779; var2 <= var1.field2780; ++var2) {
         for(int var3 = var1.field2781; var3 <= var1.field2788; ++var3) {
            class110 var4 = this.field1225[var1.field2775][var2][var3];
            if(var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.field1205; ++var5) {
                  if(var4.field1217[var5] == var1) {
                     --var4.field1205;

                     for(int var6 = var5; var6 < var4.field1205; ++var6) {
                        var4.field1217[var6] = var4.field1217[var6 + 1];
                        var4.gameObjectsChanged(var6);
                        var4.field1195[var6] = var4.field1195[var6 + 1];
                     }

                     var4.field1217[var4.field1205] = null;
                     var4.gameObjectsChanged(var4.field1205);
                     break;
                  }
               }

               var4.field1196 = 0;

               for(var5 = 0; var5 < var4.field1205; ++var5) {
                  var4.field1196 |= var4.field1195[var5];
               }
            }
         }
      }

   }

   @ObfuscatedName("bx")
   boolean method1979(int var1, int var2, int var3) {
      int var4 = this.field1229[var1][var2][var3];
      if(var4 == -field1244) {
         return false;
      } else if(var4 == field1244) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if(this.method1976(var5 + 1, this.field1224[var1][var2][var3], var6 + 1) && this.method1976(var5 + 128 - 1, this.field1224[var1][var2 + 1][var3], var6 + 1) && this.method1976(var5 + 128 - 1, this.field1224[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method1976(var5 + 1, this.field1224[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.field1229[var1][var2][var3] = field1244;
            return true;
         } else {
            this.field1229[var1][var2][var3] = -field1244;
            return false;
         }
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IIIIIIIILdj;IZJI)Z"
   )
   boolean method1938(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class102 var9, int var10, boolean var11, long var12, int var14) {
      boolean var15 = shouldDraw(var9, false);
      if(!var15) {
         int var16 = var6 >> 7;
         int var17 = var7 >> 7;
         class302.field3755.getOccupiedTilesTick()[var16][var17] = -1;
      }

      return var15 && this.copy$addEntityMarker(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var14);
   }

   @ObfuscatedName("ad")
   public void method2055(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1237; ++var4) {
         for(int var5 = 0; var5 < this.field1221; ++var5) {
            for(int var6 = 0; var6 < this.field1223; ++var6) {
               class110 var7 = this.field1225[var4][var5][var6];
               if(var7 != null) {
                  class162 var8 = var7.field1201;
                  class34 var10;
                  if(var8 != null && var8.field1961 instanceof class34) {
                     class34 var9 = (class34)var8.field1961;
                     this.method1983(var9, var4, var5, var6, 1, 1);
                     if(var8.field1963 instanceof class34) {
                        var10 = (class34)var8.field1963;
                        this.method1983(var10, var4, var5, var6, 1, 1);
                        class34.method568(var9, var10, 0, 0, 0, false);
                        var8.field1963 = var10.method573(var10.field338, var10.field339, var1, var2, var3);
                     }

                     var8.field1961 = var9.method573(var9.field338, var9.field339, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.field1205; ++var12) {
                     class195 var14 = var7.field1217[var12];
                     if(var14 != null && var14.field2786 instanceof class34) {
                        class34 var11 = (class34)var14.field2786;
                        this.method1983(var11, var4, var5, var6, var14.field2780 - var14.field2779 + 1, var14.field2788 - var14.field2781 + 1);
                        var14.field2786 = var11.method573(var11.field338, var11.field339, var1, var2, var3);
                     }
                  }

                  class215 var13 = var7.field1203;
                  if(var13 != null && var13.field2937 instanceof class34) {
                     var10 = (class34)var13.field2937;
                     this.method1957(var10, var4, var5, var6);
                     var13.field2937 = var10.method573(var10.field338, var10.field339, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("ba")
   boolean method1976(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < field1264; ++var4) {
         class332 var5 = field1220[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if(var5.field4001 == 1) {
            var6 = var5.field3995 - var1;
            if(var6 > 0) {
               var7 = (var6 * var5.field4004 >> 8) + var5.field3994;
               var8 = (var6 * var5.field4005 >> 8) + var5.field3993;
               var9 = (var6 * var5.field4006 >> 8) + var5.field3999;
               var10 = (var6 * var5.field4007 >> 8) + var5.field3998;
               if(var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field4001 == 2) {
            var6 = var1 - var5.field3995;
            if(var6 > 0) {
               var7 = (var6 * var5.field4004 >> 8) + var5.field3994;
               var8 = (var6 * var5.field4005 >> 8) + var5.field3993;
               var9 = (var6 * var5.field4006 >> 8) + var5.field3999;
               var10 = (var6 * var5.field4007 >> 8) + var5.field3998;
               if(var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field4001 == 3) {
            var6 = var5.field3994 - var3;
            if(var6 > 0) {
               var7 = (var6 * var5.field4002 >> 8) + var5.field3995;
               var8 = (var6 * var5.field4000 >> 8) + var5.field3997;
               var9 = (var6 * var5.field4006 >> 8) + var5.field3999;
               var10 = (var6 * var5.field4007 >> 8) + var5.field3998;
               if(var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field4001 == 4) {
            var6 = var3 - var5.field3994;
            if(var6 > 0) {
               var7 = (var6 * var5.field4002 >> 8) + var5.field3995;
               var8 = (var6 * var5.field4000 >> 8) + var5.field3997;
               var9 = (var6 * var5.field4006 >> 8) + var5.field3999;
               var10 = (var6 * var5.field4007 >> 8) + var5.field3998;
               if(var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field4001 == 5) {
            var6 = var2 - var5.field3999;
            if(var6 > 0) {
               var7 = (var6 * var5.field4002 >> 8) + var5.field3995;
               var8 = (var6 * var5.field4000 >> 8) + var5.field3997;
               var9 = (var6 * var5.field4004 >> 8) + var5.field3994;
               var10 = (var6 * var5.field4005 >> 8) + var5.field3993;
               if(var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @ObfuscatedName("q")
   public void method1962(int var1, int var2, int var3) {
      class110 var4 = this.field1225[var1][var2][var3];
      if(var4 != null) {
         var4.field1202 = null;
         var4.decorativeObjectChanged(-1);
      }
   }

   @ObfuscatedName("al")
   public int method1955(int var1, int var2, int var3, long var4) {
      class110 var6 = this.field1225[var1][var2][var3];
      if(var6 == null) {
         return -1;
      } else if(var6.field1201 != null && var6.field1201.field1957 == var4) {
         return var6.field1201.field1965 & 255;
      } else if(var6.field1202 != null && var6.field1202.field993 == var4) {
         return var6.field1202.field994 & 255;
      } else if(var6.field1203 != null && var6.field1203.field2942 == var4) {
         return var6.field1203.field2940 & 255;
      } else {
         for(int var7 = 0; var7 < var6.field1205; ++var7) {
            if(var6.field1217[var7].field2785 == var4) {
               return var6.field1217[var7].field2787 & 255;
            }
         }

         return -1;
      }
   }

   @ObfuscatedName("ah")
   public void method1949(int var1, int var2, int var3, int var4, int var5, int var6) {
      DrawCallbacks var7 = class302.field3755.getDrawCallbacks();
      if(var7 != null) {
         var7.drawScene(var1, var2, var3, var4, var5, var6);
      }

      int var8 = this.getMaxX();
      int var9 = this.getMaxY();
      int var10 = this.getMaxZ();
      int var11 = this.getMinLevel();
      RSTile[][][] var12 = this.getTiles();
      boolean var13 = class302.field3755.isGpu();
      int var14 = var13?rl$drawDistance:25;
      if(var1 < 0) {
         var1 = 0;
      } else if(var1 >= var8 * 128) {
         var1 = var8 * 128 - 1;
      }

      if(var3 < 0) {
         var3 = 0;
      } else if(var3 >= var10 * 128) {
         var3 = var10 * 128 - 1;
      }

      int var15 = var4;
      if(var4 < 128) {
         var4 = 128;
      } else if(var4 > 383) {
         var4 = 383;
      }

      if(!client.pitchRelaxEnabled) {
         var15 = var4;
      }

      class302.field3755.setCycle(class302.field3755.getCycle() + 1);
      class302.field3755.setPitchSin(Perspective.SINE[var15]);
      class302.field3755.setPitchCos(Perspective.COSINE[var15]);
      class302.field3755.setYawSin(Perspective.SINE[var5]);
      class302.field3755.setYawCos(Perspective.COSINE[var5]);
      int[][][] var16 = class302.field3755.getTileHeights();
      boolean[][] var17 = class302.field3755.getVisibilityMaps()[(var4 - 128) / 32][var5 / 64];
      class302.field3755.setRenderArea(var17);
      class302.field3755.setCameraX2(var1);
      class302.field3755.setCameraY2(var2);
      class302.field3755.setCameraZ2(var3);
      int var18 = var1 / 128;
      int var19 = var3 / 128;
      class302.field3755.setScreenCenterX(var18);
      class302.field3755.setScreenCenterZ(var19);
      class302.field3755.setScenePlane(var6);
      int var20 = var18 - var14;
      if(var20 < 0) {
         var20 = 0;
      }

      int var21 = var19 - var14;
      if(var21 < 0) {
         var21 = 0;
      }

      int var22 = var18 + var14;
      if(var22 > var8) {
         var22 = var8;
      }

      int var23 = var19 + var14;
      if(var23 > var10) {
         var23 = var10;
      }

      class302.field3755.setMinTileX(var20);
      class302.field3755.setMinTileZ(var21);
      class302.field3755.setMaxTileX(var22);
      class302.field3755.setMaxTileZ(var23);
      this.updateOccluders();
      class302.field3755.setTileUpdateCount(0);

      int var24;
      RSTile[][] var25;
      int var26;
      int var27;
      for(var24 = var11; var24 < var9; ++var24) {
         var25 = var12[var24];

         for(var26 = var20; var26 < var22; ++var26) {
            for(var27 = var21; var27 < var23; ++var27) {
               RSTile var28 = var25[var26][var27];
               if(var28 != null) {
                  if(var28.getPhysicalLevel() > var6 || !var13 && !var17[var26 - var18 + 25][var27 - var19 + 25] && var16[var24][var26][var27] - var2 < 2000) {
                     var28.setDraw(false);
                     var28.setVisible(false);
                     var28.setWallCullDirection(0);
                  } else {
                     var28.setDraw(true);
                     var28.setVisible(true);
                     var28.setDrawEntities(true);
                     class302.field3755.setTileUpdateCount(class302.field3755.getTileUpdateCount() + 1);
                  }
               }
            }
         }
      }

      int var29;
      int var30;
      int var31;
      RSTile var32;
      int var33;
      for(var24 = var11; var24 < var9; ++var24) {
         var25 = var12[var24];

         for(var26 = -var14; var26 <= 0; ++var26) {
            var27 = var26 + var18;
            var33 = var18 - var26;
            if(var27 >= var20 || var33 < var22) {
               for(var29 = -var14; var29 <= 0; ++var29) {
                  var30 = var29 + var19;
                  var31 = var19 - var29;
                  if(var27 >= var20) {
                     if(var30 >= var21) {
                        var32 = var25[var27][var30];
                        if(var32 != null && var32.isDraw()) {
                           this.draw(var32, true);
                        }
                     }

                     if(var31 < var23) {
                        var32 = var25[var27][var31];
                        if(var32 != null && var32.isDraw()) {
                           this.draw(var32, true);
                        }
                     }
                  }

                  if(var33 < var22) {
                     if(var30 >= var21) {
                        var32 = var25[var33][var30];
                        if(var32 != null && var32.isDraw()) {
                           this.draw(var32, true);
                        }
                     }

                     if(var31 < var23) {
                        var32 = var25[var33][var31];
                        if(var32 != null && var32.isDraw()) {
                           this.draw(var32, true);
                        }
                     }
                  }

                  if(class302.field3755.getTileUpdateCount() == 0) {
                     class302.field3755.setCheckClick(false);
                     class302.field3755.getCallbacks().drawScene();
                     return;
                  }
               }
            }
         }
      }

      for(var24 = var11; var24 < var9; ++var24) {
         var25 = var12[var24];

         for(var26 = -var14; var26 <= 0; ++var26) {
            var27 = var26 + var18;
            var33 = var18 - var26;
            if(var27 >= var20 || var33 < var22) {
               for(var29 = -var14; var29 <= 0; ++var29) {
                  var30 = var29 + var19;
                  var31 = var19 - var29;
                  if(var27 >= var20) {
                     if(var30 >= var21) {
                        var32 = var25[var27][var30];
                        if(var32 != null && var32.isDraw()) {
                           this.draw(var32, false);
                        }
                     }

                     if(var31 < var23) {
                        var32 = var25[var27][var31];
                        if(var32 != null && var32.isDraw()) {
                           this.draw(var32, false);
                        }
                     }
                  }

                  if(var33 < var22) {
                     if(var30 >= var21) {
                        var32 = var25[var33][var30];
                        if(var32 != null && var32.isDraw()) {
                           this.draw(var32, false);
                        }
                     }

                     if(var31 < var23) {
                        var32 = var25[var33][var31];
                        if(var32 != null && var32.isDraw()) {
                           this.draw(var32, false);
                        }
                     }
                  }

                  if(class302.field3755.getTileUpdateCount() == 0) {
                     class302.field3755.setCheckClick(false);
                     class302.field3755.getCallbacks().drawScene();
                     return;
                  }
               }
            }
         }
      }

      class302.field3755.setCheckClick(false);
      class302.field3755.getCallbacks().drawScene();
   }

   @ObfuscatedName("e")
   public void method1929(int var1, int var2, int var3, int var4) {
      class110 var5 = this.field1225[var1][var2][var3];
      if(var5 != null) {
         this.field1225[var1][var2][var3].field1206 = var4;
      }
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(III)Leo;"
   )
   public class91 method1948(int var1, int var2, int var3) {
      class110 var4 = this.field1225[var1][var2][var3];
      return var4 == null?null:var4.field1202;
   }

   @ObfuscatedName("w")
   public void method2039(int var1, int var2) {
      class110 var3 = this.field1225[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         class110 var5 = this.field1225[var4][var1][var2] = this.field1225[var4 + 1][var1][var2];
         if(var5 != null) {
            --var5.field1214;

            for(int var6 = 0; var6 < var5.field1205; ++var6) {
               class195 var7 = var5.field1217[var6];
               long var9 = var7.field2785;
               boolean var8 = WorldMapData.method2687(var9) == 2;
               if(var8 && var7.field2779 == var1 && var2 == var7.field2781) {
                  --var7.field2775;
               }
            }
         }
      }

      if(this.field1225[0][var1][var2] == null) {
         this.field1225[0][var1][var2] = new class110(0, var1, var2);
      }

      this.field1225[0][var1][var2].field1208 = var3;
      this.field1225[3][var1][var2] = null;
   }

   @ObfuscatedName("bl")
   boolean method1974(int var1, int var2, int var3, int var4) {
      if(!this.method1979(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method1976(var5 + 1, this.field1224[var1][var2][var3] - var4, var6 + 1) && this.method1976(var5 + 128 - 1, this.field1224[var1][var2 + 1][var3] - var4, var6 + 1) && this.method1976(var5 + 128 - 1, this.field1224[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method1976(var5 + 1, this.field1224[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   @ObfuscatedName("ar")
   static boolean method1961(int var0, int var1, int var2) {
      int var3 = var0 * field1249 + var2 * field1248 >> 16;
      int var4 = var2 * field1249 - var0 * field1248 >> 16;
      int var5 = var4 * field1247 + field1246 * var1 >> 16;
      int var6 = field1247 * var1 - var4 * field1246 >> 16;
      if(var5 >= 50 && var5 <= 3500) {
         int var7 = var3 * 128 / var5 + field1270;
         int var8 = var6 * 128 / var5 + field1279;
         return var7 >= field1283 && var7 <= field1285 && var8 >= field1284 && var8 <= field1286;
      } else {
         return false;
      }
   }

   @ObfuscatedName("s")
   public static void method1928(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      class332 var8 = new class332();
      var8.field3990 = var2 / 128;
      var8.field4003 = var3 / 128;
      var8.field3992 = var4 / 128;
      var8.field3991 = var5 / 128;
      var8.field3996 = var1;
      var8.field3995 = var2;
      var8.field3997 = var3;
      var8.field3994 = var4;
      var8.field3993 = var5;
      var8.field3999 = var6;
      var8.field3998 = var7;
      field1262[var0][field1261[var0]++] = var8;
   }

   public static boolean shouldDraw(Object var0, boolean var1) {
      if(!client.isHidingEntities) {
         return true;
      } else {
         boolean var4;
         label94: {
            if(var0 instanceof RSPlayer) {
               boolean var2 = var1?client.hideLocalPlayer2D:client.hideLocalPlayer;
               boolean var3 = var1?client.hidePlayers2D:client.hidePlayers;
               var4 = var0 == class302.field3755.getLocalPlayer();
               if(var4) {
                  if(var2) {
                     break label94;
                  }
               } else if(var3) {
                  break label94;
               }
            } else {
               if(var0 instanceof RSNPC) {
                  RSNPC var6 = (RSNPC)var0;
                  if(!client.hideAttackers && var6.getInteracting() == class302.field3755.getLocalPlayer()) {
                     return true;
                  }

                  return var1?!client.hideNPCs2D:!client.hideNPCs;
               }

               if(var0 instanceof RSProjectile) {
                  return !client.hideProjectiles;
               }
            }

            return true;
         }

         RSPlayer var5 = (RSPlayer)var0;
         return !client.hideAttackers && var5.getInteracting() == class302.field3755.getLocalPlayer()?true:(var5.getName() == null?false:!client.hideFriends && var5.isFriend() || !var4 && !client.hideClanMates && var5.isClanMember());
      }
   }

   public static void setTargetTile(int var0, int var1) {
      LocalPoint var2 = class302.field3755.getLocalPlayer().getLocalLocation();
      int var3 = var2.getSceneX();
      int var4 = var2.getSceneY();
      boolean var7 = true;
      int var8 = (int)Math.hypot((double)(var3 - var0), (double)(var4 - var1)) - 45;
      int var9 = var0;
      int var10 = var1;
      if(var8 > 0) {
         var9 = (var8 * var3 + var0 * 45) / (var8 + 45);
         var10 = (var8 * var4 + var1 * 45) / (var8 + 45);
      }

      class302.field3755.setSelectedSceneTileX(var9);
      class302.field3755.setSelectedSceneTileY(var10);
   }

   private static void rl$$clinit() {
      tmpX = new int[6];
      tmpY = new int[6];
   }

   @ObfuscatedSignature(
      signature = "(Lbn;IIIIII)V"
   )
   public static final void copy$draw2DExtras(class99 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var0 != null) {
         if(var6 != -1781715326) {
            return;
         }

         if(var0.vmethod3957()) {
            if(var0 instanceof class176) {
               class315 var7 = ((class176)var0).field2437;
               if(var7.field3886 != null) {
                  var7 = var7.method6171();
               }

               if(var7 == null) {
                  return;
               }
            }

            int var76 = class152.field1874;
            int[] var8 = class152.field1875;
            byte var9 = 0;
            if(var1 < var76 && var0.field1076 == client.field2165 && class24.method449((class199)var0)) {
               class199 var10 = (class199)var0;
               if(var1 < var76) {
                  class305.method6014(var0, var0.field1071 + 15);
                  class190 var11 = (class190)client.field2205.get(class74.field837);
                  byte var12 = 9;
                  var11.method3879(var10.field2802.method2869(), var2 + client.field2252, var3 + client.field2253 - var12, 16777215, 0);
                  var9 = 18;
               }
            }

            int var77 = -2;
            int var16;
            int var23;
            int var24;
            if(!var0.field1097.method757()) {
               class305.method6014(var0, var0.field1071 + 15);

               for(class48 var88 = (class48)var0.field1097.method745(); var88 != null; var88 = (class48)var0.field1097.method747()) {
                  class80 var78 = var88.method1038(client.field2165);
                  if(var78 == null) {
                     if(var88.method1039()) {
                        var88.method3937();
                     }
                  } else {
                     class244 var13 = var88.field543;
                     SpritePixels var14 = var13.method4938();
                     SpritePixels var15 = var13.method4929();
                     int var17 = 0;
                     if(var14 != null && var15 != null) {
                        if(var13.field3277 * 2 < var15.width) {
                           var17 = var13.field3277;
                        }

                        var16 = var15.width - var17 * 2;
                     } else {
                        var16 = var13.field3279;
                     }

                     int var18 = 255;
                     boolean var19 = true;
                     int var20 = client.field2165 - var78.field889;
                     int var21 = var16 * var78.field888 / var13.field3279;
                     int var22;
                     int var93;
                     if(var78.field891 > var20) {
                        int var10000;
                        if(var13.field3289 == 0) {
                           if(var6 != -1781715326) {
                              return;
                           }

                           var10000 = 0;
                        } else {
                           var10000 = var13.field3289 * (var20 / var13.field3289);
                        }

                        var22 = var10000;
                        var23 = var16 * var78.field890 / var13.field3279;
                        var93 = var22 * (var21 - var23) / var78.field891 + var23;
                     } else {
                        var93 = var21;
                        var22 = var13.field3285 + var78.field891 - var20;
                        if(var13.field3283 >= 0) {
                           var18 = (var22 << 8) / (var13.field3285 - var13.field3283);
                        }
                     }

                     if(var78.field888 > 0 && var93 < 1) {
                        var93 = 1;
                     }

                     if(var14 != null) {
                        if(var6 != -1781715326) {
                           return;
                        }

                        if(var15 != null) {
                           if(var16 == var93) {
                              var93 += var17 * 2;
                           } else {
                              var93 += var17;
                           }

                           var22 = var14.height;
                           var77 += var22;
                           var23 = var2 + client.field2252 - (var16 >> 1);
                           var24 = var3 + client.field2253 - var77;
                           var23 -= var17;
                           if(var18 >= 0 && var18 < 255) {
                              var14.method221(var23, var24, var18);
                              class173.method3158(var23, var24, var23 + var93, var24 + var22);
                              var15.method221(var23, var24, var18);
                           } else {
                              var14.method215(var23, var24);
                              class173.method3158(var23, var24, var23 + var93, var24 + var22);
                              var15.method215(var23, var24);
                           }

                           class173.method3138(var2, var3, var2 + var4, var3 + var5);
                           var77 += 2;
                           continue;
                        }
                     }

                     var77 += 5;
                     if(client.field2252 > -1) {
                        var22 = var2 + client.field2252 - (var16 >> 1);
                        var23 = var3 + client.field2253 - var77;
                        class173.method3167(var22, var23, var93, 5, 65280);
                        class173.method3167(var22 + var93, var23, var16 - var93, 5, 16711680);
                     }

                     var77 += 2;
                  }
               }
            }

            if(var77 == -2) {
               var77 += 7;
            }

            var77 += var9;
            if(var1 < var76) {
               class199 var89 = (class199)var0;
               if(var89.field2800) {
                  return;
               }

               label691: {
                  if(var89.field2829 == -1) {
                     if(var6 != -1781715326) {
                        return;
                     }

                     if(var89.field2803 == -1) {
                        break label691;
                     }
                  }

                  class305.method6014(var0, var0.field1071 + 15);
                  if(client.field2252 > -1) {
                     if(var89.field2829 != -1) {
                        var77 += 25;
                        class86.field928[var89.field2829].method215(var2 + client.field2252 - 12, var3 + client.field2253 - var77);
                     }

                     if(var89.field2803 != -1) {
                        var77 += 25;
                        class88.field962[var89.field2803].method215(var2 + client.field2252 - 12, var3 + client.field2253 - var77);
                     }
                  }
               }

               if(var1 >= 0 && client.field2173 == 10 && var8[var1] == client.field2220) {
                  if(var6 != -1781715326) {
                     return;
                  }

                  class305.method6014(var0, var0.field1071 + 15);
                  if(client.field2252 > -1) {
                     var77 += class170.field2023[1].height;
                     class170.field2023[1].method215(var2 + client.field2252 - 12, var3 + client.field2253 - var77);
                  }
               }
            } else {
               class315 var90 = ((class176)var0).field2437;
               if(var90.field3886 != null) {
                  var90 = var90.method6171();
               }

               if(var90.field3884 >= 0) {
                  if(var6 != -1781715326) {
                     return;
                  }

                  if(var90.field3884 < class88.field962.length) {
                     class305.method6014(var0, var0.field1071 + 15);
                     if(client.field2252 > -1) {
                        if(var6 != -1781715326) {
                           return;
                        }

                        class88.field962[var90.field3884].method215(var2 + client.field2252 - 12, var3 + client.field2253 - 30);
                     }
                  }
               }

               if(client.field2173 == 1 && client.field2197[var1 - var76] == client.field2280) {
                  if(var6 != -1781715326) {
                     return;
                  }

                  if(client.field2165 % 20 < 10) {
                     class305.method6014(var0, var0.field1071 + 15);
                     if(client.field2252 > -1) {
                        class170.field2023[0].method215(var2 + client.field2252 - 12, var3 + client.field2253 - 28);
                     }
                  }
               }
            }

            if(var0.field1085 != null) {
               label684: {
                  if(var1 < var76) {
                     if(var0.field1087) {
                        break label684;
                     }

                     if(client.field2369 != 4) {
                        if(var0.field1082) {
                           break label684;
                        }

                        if(var6 != -1781715326) {
                           return;
                        }

                        if(client.field2369 != 0 && client.field2369 != 3) {
                           if(var6 != -1781715326) {
                              return;
                           }

                           if(client.field2369 != 1 || !((class199)var0).method3960()) {
                              break label684;
                           }
                        }
                     }
                  }

                  class305.method6014(var0, var0.field1071);
                  if(client.field2252 > -1) {
                     if(var6 != -1781715326) {
                        return;
                     }

                     if(client.field2240 < client.field2241) {
                        client.field2175[client.field2240] = class172.field2117.method3890(var0.field1085) / 2;
                        client.field2385[client.field2240] = class172.field2117.field2718;
                        client.field2242[client.field2240] = client.field2252;
                        client.field2273[client.field2240] = client.field2253;
                        client.field2246[client.field2240] = var0.field1079;
                        client.field2247[client.field2240] = var0.field1088;
                        client.field2346[client.field2240] = var0.field1081;
                        client.field2249[client.field2240] = var0.field1085;
                        ++client.field2240;
                     }
                  }
               }
            }

            for(int var79 = 0; var79 < 4; ++var79) {
               int var91 = var0.field1094[var79];
               int var80 = var0.field1100[var79];
               class224 var92 = null;
               int var81 = 0;
               if(var80 >= 0) {
                  if(var91 <= client.field2165) {
                     continue;
                  }

                  var92 = class229.method4609(var0.field1100[var79]);
                  var81 = var92.field3021;
                  if(var92 != null) {
                     if(var6 != -1781715326) {
                        return;
                     }

                     if(var92.field3025 != null) {
                        var92 = var92.method4553();
                        if(var92 == null) {
                           var0.field1094[var79] = -1;
                           continue;
                        }
                     }
                  }
               } else if(var91 < 0) {
                  continue;
               }

               var16 = var0.field1095[var79];
               class224 var82 = null;
               if(var16 >= 0) {
                  var82 = class229.method4609(var16);
                  if(var82 != null) {
                     if(var6 != -1781715326) {
                        return;
                     }

                     if(var82.field3025 != null) {
                        if(var6 != -1781715326) {
                           return;
                        }

                        var82 = var82.method4553();
                     }
                  }
               }

               if(var91 - var81 <= client.field2165) {
                  if(var92 == null) {
                     var0.field1094[var79] = -1;
                  } else {
                     class305.method6014(var0, var0.field1071 / 2);
                     if(client.field2252 > -1) {
                        if(var79 == 1) {
                           client.field2253 -= 20;
                        }

                        if(var79 == 2) {
                           client.field2252 -= 15;
                           client.field2253 -= 10;
                        }

                        if(var79 == 3) {
                           if(var6 != -1781715326) {
                              return;
                           }

                           client.field2252 += 15;
                           client.field2253 -= 10;
                        }

                        SpritePixels var83 = null;
                        SpritePixels var84 = null;
                        SpritePixels var85 = null;
                        SpritePixels var86 = null;
                        var23 = 0;
                        var24 = 0;
                        int var25 = 0;
                        int var26 = 0;
                        int var27 = 0;
                        int var28 = 0;
                        int var29 = 0;
                        int var30 = 0;
                        SpritePixels var31 = null;
                        SpritePixels var32 = null;
                        SpritePixels var33 = null;
                        SpritePixels var34 = null;
                        int var35 = 0;
                        int var36 = 0;
                        int var37 = 0;
                        int var38 = 0;
                        int var39 = 0;
                        int var40 = 0;
                        int var41 = 0;
                        int var42 = 0;
                        int var43 = 0;
                        var83 = var92.method4534();
                        int var44;
                        if(var83 != null) {
                           var23 = var83.width;
                           var44 = var83.height;
                           if(var44 > var43) {
                              var43 = var44;
                           }

                           var27 = var83.offsetX;
                        }

                        var84 = var92.method4529();
                        if(var84 != null) {
                           if(var6 != -1781715326) {
                              return;
                           }

                           var24 = var84.width;
                           var44 = var84.height;
                           if(var44 > var43) {
                              if(var6 != -1781715326) {
                                 return;
                              }

                              var43 = var44;
                           }

                           var28 = var84.offsetX;
                        }

                        var85 = var92.method4530();
                        if(var85 != null) {
                           var25 = var85.width;
                           var44 = var85.height;
                           if(var44 > var43) {
                              var43 = var44;
                           }

                           var29 = var85.offsetX;
                        }

                        var86 = var92.method4528();
                        if(var86 != null) {
                           var26 = var86.width;
                           var44 = var86.height;
                           if(var44 > var43) {
                              if(var6 != -1781715326) {
                                 return;
                              }

                              var43 = var44;
                           }

                           var30 = var86.offsetX;
                        }

                        if(var82 != null) {
                           var31 = var82.method4534();
                           if(var31 != null) {
                              var35 = var31.width;
                              var44 = var31.height;
                              if(var44 > var43) {
                                 var43 = var44;
                              }

                              var39 = var31.offsetX;
                           }

                           var32 = var82.method4529();
                           if(var32 != null) {
                              var36 = var32.width;
                              var44 = var32.height;
                              if(var44 > var43) {
                                 var43 = var44;
                              }

                              var40 = var32.offsetX;
                           }

                           var33 = var82.method4530();
                           if(var33 != null) {
                              var37 = var33.width;
                              var44 = var33.height;
                              if(var44 > var43) {
                                 var43 = var44;
                              }

                              var41 = var33.offsetX;
                           }

                           var34 = var82.method4528();
                           if(var34 != null) {
                              var38 = var34.width;
                              var44 = var34.height;
                              if(var44 > var43) {
                                 var43 = var44;
                              }

                              var42 = var34.offsetX;
                           }
                        }

                        class299 var87 = var92.method4540();
                        if(var87 == null) {
                           var87 = class103.field1149;
                        }

                        class299 var45;
                        if(var82 != null) {
                           if(var6 != -1781715326) {
                              return;
                           }

                           var45 = var82.method4540();
                           if(var45 == null) {
                              if(var6 != -1781715326) {
                                 return;
                              }

                              var45 = class103.field1149;
                           }
                        } else {
                           var45 = class103.field1149;
                        }

                        String var46 = null;
                        String var47 = null;
                        boolean var48 = false;
                        int var49 = 0;
                        var46 = var92.method4527(var0.field1104[var79]);
                        int var94 = var87.method3890(var46);
                        if(var82 != null) {
                           var47 = var82.method4527(var0.field1091[var79]);
                           var49 = var45.method3890(var47);
                        }

                        int var50 = 0;
                        int var51 = 0;
                        if(var24 > 0) {
                           if(var85 == null && var86 == null) {
                              var50 = 1;
                           } else {
                              var50 = var94 / var24 + 1;
                           }
                        }

                        if(var82 != null && var36 > 0) {
                           if(var33 == null && var34 == null) {
                              var51 = 1;
                           } else {
                              var51 = var49 / var36 + 1;
                           }
                        }

                        int var52 = 0;
                        int var53 = var52;
                        if(var23 > 0) {
                           var52 += var23;
                        }

                        var52 += 2;
                        int var54 = var52;
                        if(var25 > 0) {
                           var52 += var25;
                        }

                        int var55 = var52;
                        int var56 = var52;
                        int var57;
                        if(var24 > 0) {
                           var57 = var24 * var50;
                           var52 += var57;
                           var56 += (var57 - var94) / 2;
                        } else {
                           var52 += var94;
                        }

                        var57 = var52;
                        if(var26 > 0) {
                           var52 += var26;
                        }

                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63;
                        if(var82 != null) {
                           var52 += 2;
                           var58 = var52;
                           if(var35 > 0) {
                              var52 += var35;
                           }

                           var52 += 2;
                           var59 = var52;
                           if(var37 > 0) {
                              if(var6 != -1781715326) {
                                 return;
                              }

                              var52 += var37;
                           }

                           var60 = var52;
                           var62 = var52;
                           if(var36 > 0) {
                              var63 = var51 * var36;
                              var52 += var63;
                              var62 += (var63 - var49) / 2;
                           } else {
                              var52 += var49;
                           }

                           var61 = var52;
                           if(var38 > 0) {
                              var52 += var38;
                           }
                        }

                        var63 = var0.field1094[var79] - client.field2165;
                        int var64 = var92.field3010 - var63 * var92.field3010 / var92.field3021;
                        int var65 = var63 * var92.field3027 / var92.field3021 + -var92.field3027;
                        int var66 = var64 + (var2 + client.field2252 - (var52 >> 1));
                        int var67 = var65 + (var3 + client.field2253 - 12);
                        int var68 = var67;
                        int var69 = var43 + var67;
                        int var70 = var67 + var92.field3031 + 15;
                        int var71 = var70 - var87.field2719;
                        int var72 = var70 + var87.field2720;
                        if(var71 < var67) {
                           var68 = var71;
                        }

                        if(var72 > var69) {
                           var69 = var72;
                        }

                        int var73 = 0;
                        int var74;
                        int var75;
                        if(var82 != null) {
                           var73 = var67 + var82.field3031 + 15;
                           var74 = var73 - var45.field2719;
                           var75 = var73 + var45.field2720;
                           if(var74 < var68) {
                              ;
                           }

                           if(var75 > var69) {
                              ;
                           }
                        }

                        var74 = 255;
                        if(var92.field3028 >= 0) {
                           var74 = (var63 << 8) / (var92.field3021 - var92.field3028);
                        }

                        if(var74 >= 0 && var74 < 255) {
                           if(var83 != null) {
                              var83.method221(var66 + var53 - var27, var67, var74);
                           }

                           if(var85 != null) {
                              var85.method221(var54 + var66 - var29, var67, var74);
                           }

                           if(var84 != null) {
                              if(var6 != -1781715326) {
                                 return;
                              }

                              for(var75 = 0; var75 < var50; ++var75) {
                                 var84.method221(var24 * var75 + (var66 + var55 - var28), var67, var74);
                              }
                           }

                           if(var86 != null) {
                              var86.method221(var66 + var57 - var30, var67, var74);
                           }

                           var87.method3815(var46, var66 + var56, var70, var92.field3026, 0, var74);
                           if(var82 != null) {
                              if(var31 != null) {
                                 var31.method221(var66 + var58 - var39, var67, var74);
                              }

                              if(var33 != null) {
                                 var33.method221(var59 + var66 - var41, var67, var74);
                              }

                              if(var32 != null) {
                                 if(var6 != -1781715326) {
                                    return;
                                 }

                                 for(var75 = 0; var75 < var51; ++var75) {
                                    var32.method221(var75 * var36 + (var60 + var66 - var40), var67, var74);
                                 }
                              }

                              if(var34 != null) {
                                 var34.method221(var66 + var61 - var42, var67, var74);
                              }

                              var45.method3815(var47, var66 + var62, var73, var82.field3026, 0, var74);
                           }
                        } else {
                           if(var83 != null) {
                              var83.method215(var53 + var66 - var27, var67);
                           }

                           if(var85 != null) {
                              var85.method215(var54 + var66 - var29, var67);
                           }

                           if(var84 != null) {
                              for(var75 = 0; var75 < var50; ++var75) {
                                 var84.method215(var75 * var24 + (var55 + var66 - var28), var67);
                              }
                           }

                           if(var86 != null) {
                              var86.method215(var57 + var66 - var30, var67);
                           }

                           var87.method3832(var46, var66 + var56, var70, var92.field3026 | -16777216, 0);
                           if(var82 != null) {
                              if(var31 != null) {
                                 var31.method215(var66 + var58 - var39, var67);
                              }

                              if(var33 != null) {
                                 if(var6 != -1781715326) {
                                    return;
                                 }

                                 var33.method215(var66 + var59 - var41, var67);
                              }

                              if(var32 != null) {
                                 if(var6 != -1781715326) {
                                    return;
                                 }

                                 for(var75 = 0; var75 < var51; ++var75) {
                                    var32.method215(var36 * var75 + (var60 + var66 - var40), var67);
                                 }
                              }

                              if(var34 != null) {
                                 var34.method215(var61 + var66 - var42, var67);
                              }

                              var45.method3832(var47, var66 + var62, var73, var82.field3026 | -16777216, 0);
                           }
                        }
                     }
                  }
               }
            }

            return;
         }

         if(var6 != -1781715326) {
            return;
         }
      }

   }

   @ObfuscatedName("ak")
   static final int method1987(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   @ObfuscatedName("be")
   static boolean method1970(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if(var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if(var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if(var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var7 - var6) * (var1 - var3) - (var0 - var6) * (var4 - var3);
         int var10 = (var5 - var7) * (var1 - var4) - (var2 - var4) * (var0 - var7);
         return var8 == 0?(var9 != 0?(var9 < 0?var10 <= 0:var10 >= 0):true):(var8 < 0?var9 <= 0 && var10 <= 0:var9 >= 0 && var10 >= 0);
      }
   }

   @ObfuscatedName("ap")
   public static void method1972(int[] var0, int var1, int var2, int var3, int var4) {
      field1283 = 0;
      field1284 = 0;
      field1285 = var3;
      field1286 = var4;
      field1270 = var3 / 2;
      field1279 = var4 / 2;
      boolean[][][][] var5 = new boolean[var0.length][32][53][53];

      int var6;
      int var7;
      int var8;
      int var9;
      int var11;
      int var12;
      for(var6 = 128; var6 <= 383; var6 += 32) {
         for(var7 = 0; var7 < 2048; var7 += 64) {
            field1246 = class211.field2920[var6];
            field1247 = class211.field2914[var6];
            field1248 = class211.field2920[var7];
            field1249 = class211.field2914[var7];
            var8 = (var6 - 128) / 32;
            var9 = var7 / 64;

            for(int var10 = -26; var10 < 26; ++var10) {
               for(var11 = -26; var11 < 26; ++var11) {
                  var12 = var10 * 128;
                  int var13 = var11 * 128;
                  boolean var14 = false;

                  for(int var15 = -var1; var15 <= var2; var15 += 128) {
                     if(method1961(var12, var0[var8] + var15, var13)) {
                        var14 = true;
                        break;
                     }
                  }

                  var5[var8][var9][var10 + 1 + 25][var11 + 1 + 25] = var14;
               }
            }
         }
      }

      for(var6 = 0; var6 < 8; ++var6) {
         for(var7 = 0; var7 < 32; ++var7) {
            for(var8 = -25; var8 < 25; ++var8) {
               for(var9 = -25; var9 < 25; ++var9) {
                  boolean var16 = false;

                  label76:
                  for(var11 = -1; var11 <= 1; ++var11) {
                     for(var12 = -1; var12 <= 1; ++var12) {
                        if(var5[var6][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) {
                           var16 = true;
                           break label76;
                        }

                        if(var5[var6][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) {
                           var16 = true;
                           break label76;
                        }

                        if(var5[var6 + 1][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) {
                           var16 = true;
                           break label76;
                        }

                        if(var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) {
                           var16 = true;
                           break label76;
                        }
                     }
                  }

                  field1271[var6][var7][var8 + 25][var9 + 25] = var16;
               }
            }
         }
      }

   }

   @ObfuscatedName("au")
   public static boolean method1964() {
      return field1257 && field1234 != -1;
   }

   @ObfuscatedName("aj")
   public static void method2037() {
      field1234 = -1;
      field1257 = false;
   }
}
