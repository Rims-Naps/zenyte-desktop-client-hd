package net.runelite.client.standalone;

import net.runelite.api.Tile;
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
import net.runelite.rs.api.RSWallObject;

@ObfuscatedName("dh")
public class class312 implements RSScene {
   @ObfuscatedName("af")
   static int field3333;
   @ObfuscatedName("aw")
   static int field3338;
   @ObfuscatedName("j")
   static int field3320;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   static class320 field3366;
   @ObfuscatedName("f")
   public static boolean field3340;
   @ObfuscatedName("n")
   static int field3324;
   @ObfuscatedName("ay")
   static final int[] field3343;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "[[Lel;"
   )
   static class109[][] field3347;
   @ObfuscatedName("ac")
   static boolean field3362;
   @ObfuscatedName("ad")
   static boolean field3342;
   @ObfuscatedName("bw")
   static int field3355;
   @ObfuscatedName("q")
   static int field3367;
   @ObfuscatedName("h")
   static int field3325;
   @ObfuscatedName("ag")
   static int field3332;
   @ObfuscatedName("as")
   public static int field3319;
   @ObfuscatedName("be")
   static final int[] field3357;
   @ObfuscatedName("bg")
   static boolean[][] field3365;
   @ObfuscatedName("bu")
   static int field3371;
   @ObfuscatedName("u")
   static int field3336;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "[Lel;"
   )
   static class109[] field3305;
   @ObfuscatedName("bn")
   static int field3369;
   @ObfuscatedName("b")
   static int field3329;
   @ObfuscatedName("t")
   static int field3359;
   @ObfuscatedName("az")
   static int field3334;
   @ObfuscatedName("ae")
   static int field3345;
   @ObfuscatedName("ab")
   static int field3349;
   @ObfuscatedName("ah")
   static final int[] field3348;
   @ObfuscatedName("o")
   static int field3321;
   @ObfuscatedName("bq")
   static int field3364;
   @ObfuscatedName("g")
   static int field3330;
   @ObfuscatedName("ai")
   static final int[] field3353;
   @ObfuscatedName("k")
   static int field3328;
   @ObfuscatedName("ak")
   static final int[] field3337;
   @ObfuscatedName("bv")
   static int field3370;
   @ObfuscatedName("aa")
   static int field3339;
   @ObfuscatedName("an")
   static final int[] field3354;
   @ObfuscatedName("bi")
   static int field3368;
   @ObfuscatedName("i")
   static int field3327;
   @ObfuscatedName("aj")
   static final int[] field3351;
   @ObfuscatedName("bm")
   static boolean[][][][] field3356;
   @ObfuscatedName("ap")
   static int[] field3346;
   @ObfuscatedName("am")
   static int field3311;
   @ObfuscatedName("y")
   static int field3352;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "[Lef;"
   )
   static class299[] field3335;
   @ObfuscatedName("al")
   public static int field3341;
   @ObfuscatedName("av")
   static int field3331;
   public static boolean isDrawingScene;
   @ObfuscatedName("bs")
   int[][] field3323;
   @ObfuscatedName("m")
   int[][][] field3314;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "[Lef;"
   )
   class299[] field3313;
   @ObfuscatedName("p")
   int field3312;
   @ObfuscatedName("c")
   int field3307;
   @ObfuscatedName("e")
   int[][][] field3309;
   @ObfuscatedName("l")
   int field3322;
   @ObfuscatedName("s")
   int field3308;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "[[[Ldx;"
   )
   class56[][][] field3310;
   @ObfuscatedName("w")
   int field3306;
   @ObfuscatedName("ba")
   int[][] field3363;

   static {
      field3340 = true;
      field3330 = 0;
      field3320 = 0;
      field3335 = new class299[100];
      field3362 = false;
      field3311 = 0;
      field3338 = 0;
      field3339 = 0;
      field3319 = -1;
      field3341 = -1;
      field3342 = false;
      field3345 = 4;
      field3346 = new int[field3345];
      field3347 = new class109[field3345][500];
      field3349 = 0;
      field3305 = new class109[500];
      field3366 = new class320();
      field3351 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
      field3348 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
      field3353 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
      field3354 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
      field3343 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
      field3337 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
      field3357 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
      field3356 = new boolean[8][32][51][51];
   }

   public class312(int var1, int var2, int var3, int[][][] var4) {
      this.field3307 = 0;
      this.field3312 = 0;
      this.field3313 = new class299[5000];
      this.field3323 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
      this.field3363 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
      this.field3322 = var1;
      this.field3306 = var2;
      this.field3308 = var3;
      this.field3310 = new class56[var1][var2][var3];
      this.field3314 = new int[var1][var2 + 1][var3 + 1];
      this.field3309 = var4;
      this.method5331();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(III)Leg;"
   )
   public class12 method5353(int var1, int var2, int var3) {
      class56 var4 = this.field3310[var1][var2][var3];
      return var4 == null?null:var4.field423;
   }

   @ObfuscatedName("aw")
   public long method5358(int var1, int var2, int var3) {
      class56 var4 = this.field3310[var1][var2][var3];
      return var4 != null && var4.field424 != null?var4.field424.field2202:0L;
   }

   @ObfuscatedName("f")
   public void method5331() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.field3322; ++var1) {
         for(var2 = 0; var2 < this.field3306; ++var2) {
            for(int var3 = 0; var3 < this.field3308; ++var3) {
               this.field3310[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < field3345; ++var1) {
         for(var2 = 0; var2 < field3346[var1]; ++var2) {
            field3347[var1][var2] = null;
         }

         field3346[var1] = 0;
      }

      for(var1 = 0; var1 < this.field3312; ++var1) {
         this.field3313[var1] = null;
      }

      this.field3312 = 0;

      for(var1 = 0; var1 < field3335.length; ++var1) {
         field3335[var1] = null;
      }

   }

   @ObfuscatedName("bs")
   boolean method5381(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if(var3 == var2 && var5 == var4) {
         if(!this.method5385(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.method5382(var7 + 1, this.field3309[var1][var2][var4] - var6, var8 + 1) && this.method5382(var7 + 128 - 1, this.field3309[var1][var2 + 1][var4] - var6, var8 + 1) && this.method5382(var7 + 128 - 1, this.field3309[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method5382(var7 + 1, this.field3309[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if(this.field3314[var1][var7][var8] == -field3329) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.field3309[var1][var2][var4] - var6;
         if(!this.method5382(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if(!this.method5382(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if(!this.method5382(var7, var9, var11)) {
                  return false;
               } else if(!this.method5382(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(IIIIILdj;IJIIII)Z"
   )
   public boolean method5343(int var1, int var2, int var3, int var4, int var5, class308 var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null?true:this.method5344(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(Ldp;IIIIII)V"
   )
   void method5374(class245 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.field2458.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field2458[var9] - field3328;
         var11 = var1.field2440[var9] - field3367;
         var12 = var1.field2441[var9] - field3352;
         var13 = var12 * var4 + var5 * var10 >> 16;
         var12 = var5 * var12 - var10 * var4 >> 16;
         var10 = var13;
         var13 = var3 * var11 - var12 * var2 >> 16;
         var12 = var11 * var2 + var3 * var12 >> 16;
         if(var12 < 50) {
            return;
         }

         if(var1.field2453 != null) {
            class245.field2456[var9] = var10;
            class245.field2457[var9] = var13;
            class245.field2451[var9] = var12;
         }

         class245.field2454[var9] = var10 * class257.field2550 / var12 + class257.field2551;
         class245.field2455[var9] = var13 * class257.field2550 / var12 + class257.field2541;
      }

      class257.field2543 = 0;
      var8 = var1.field2445.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field2445[var9];
         var11 = var1.field2446[var9];
         var12 = var1.field2447[var9];
         var13 = class245.field2454[var10];
         int var14 = class245.field2454[var11];
         int var15 = class245.field2454[var12];
         int var16 = class245.field2455[var10];
         int var17 = class245.field2455[var11];
         int var18 = class245.field2455[var12];
         if((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            class257.field2553 = false;
            if(var13 < 0 || var14 < 0 || var15 < 0 || var13 > class257.field2552 || var14 > class257.field2552 || var15 > class257.field2552) {
               class257.field2553 = true;
            }

            if(field3362 && method5376(field3338, field3339, var16, var17, var18, var13, var14, var15)) {
               field3319 = var6;
               field3341 = var7;
            }

            if(var1.field2453 != null && var1.field2453[var9] != -1) {
               if(!field3340) {
                  if(var1.field2449) {
                     class257.method4642(var16, var17, var18, var13, var14, var15, var1.field2439[var9], var1.field2443[var9], var1.field2444[var9], class245.field2456[0], class245.field2456[1], class245.field2456[3], class245.field2457[0], class245.field2457[1], class245.field2457[3], class245.field2451[0], class245.field2451[1], class245.field2451[3], var1.field2453[var9]);
                  } else {
                     class257.method4642(var16, var17, var18, var13, var14, var15, var1.field2439[var9], var1.field2443[var9], var1.field2444[var9], class245.field2456[var10], class245.field2456[var11], class245.field2456[var12], class245.field2457[var10], class245.field2457[var11], class245.field2457[var12], class245.field2451[var10], class245.field2451[var11], class245.field2451[var12], var1.field2453[var9]);
                  }
               } else {
                  int var19 = class257.field2539.vmethod4530(var1.field2453[var9]);
                  class257.method4579(var16, var17, var18, var13, var14, var15, method5393(var19, var1.field2439[var9]), method5393(var19, var1.field2443[var9]), method5393(var19, var1.field2444[var9]));
               }
            } else if(var1.field2439[var9] != 12345678) {
               class257.method4579(var16, var17, var18, var13, var14, var15, var1.field2439[var9], var1.field2443[var9], var1.field2444[var9]);
            }
         }
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(III)Ldw;"
   )
   public class195 method5356(int var1, int var2, int var3) {
      class56 var4 = this.field3310[var1][var2][var3];
      return var4 != null && var4.field425 != null?var4.field425:null;
   }

   @ObfuscatedName("bl")
   boolean method5380(int var1, int var2, int var3, int var4) {
      if(!this.method5385(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method5382(var5 + 1, this.field3309[var1][var2][var3] - var4, var6 + 1) && this.method5382(var5 + 128 - 1, this.field3309[var1][var2 + 1][var3] - var4, var6 + 1) && this.method5382(var5 + 128 - 1, this.field3309[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method5382(var5 + 1, this.field3309[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   @ObfuscatedName("ad")
   public void method5461(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field3322; ++var4) {
         for(int var5 = 0; var5 < this.field3306; ++var5) {
            for(int var6 = 0; var6 < this.field3308; ++var6) {
               class56 var7 = this.field3310[var4][var5][var6];
               if(var7 != null) {
                  class12 var8 = var7.field423;
                  class218 var10;
                  if(var8 != null && var8.field109 instanceof class218) {
                     class218 var9 = (class218)var8.field109;
                     this.method5389(var9, var4, var5, var6, 1, 1);
                     if(var8.field111 instanceof class218) {
                        var10 = (class218)var8.field111;
                        this.method5389(var10, var4, var5, var6, 1, 1);
                        class218.method3858(var9, var10, 0, 0, 0, false);
                        var8.field111 = var10.method3863(var10.field2113, var10.field2114, var1, var2, var3);
                     }

                     var8.field109 = var9.method3863(var9.field2113, var9.field2114, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.field427; ++var12) {
                     class299 var14 = var7.field439[var12];
                     if(var14 != null && var14.field3220 instanceof class218) {
                        class218 var11 = (class218)var14.field3220;
                        this.method5389(var11, var4, var5, var6, var14.field3214 - var14.field3213 + 1, var14.field3222 - var14.field3215 + 1);
                        var14.field3220 = var11.method3863(var11.field2113, var11.field2114, var1, var2, var3);
                     }
                  }

                  class195 var13 = var7.field425;
                  if(var13 != null && var13.field1849 instanceof class218) {
                     var10 = (class218)var13.field1849;
                     this.method5363(var10, var4, var5, var6);
                     var13.field1849 = var10.method3863(var10.field2113, var10.field2114, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIIILdj;Ldj;IIJI)V"
   )
   public void method5339(int var1, int var2, int var3, int var4, class308 var5, class308 var6, int var7, int var8, long var9, int var11) {
      this.copy$addBoundary(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11);
      Tile var12 = this.getTiles()[var1][var2][var3];
      if(var12 != null) {
         RSWallObject var13 = (RSWallObject)var12.getWallObject();
         if(var13 != null) {
            var13.setPlane(var1);
         }
      }

   }

   @ObfuscatedName("q")
   public void method5368(int var1, int var2, int var3) {
      class56 var4 = this.field3310[var1][var2][var3];
      if(var4 != null) {
         var4.field424 = null;
         var4.decorativeObjectChanged(-1);
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIIIIILdj;IJI)Z"
   )
   public boolean method5341(int var1, int var2, int var3, int var4, int var5, int var6, class308 var7, int var8, long var9, int var11) {
      if(var7 == null) {
         return true;
      } else {
         int var12 = var5 * 64 + var2 * 128;
         int var13 = var6 * 64 + var3 * 128;
         return this.method5344(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(IIIILdj;JLdj;Ldj;)V"
   )
   public void method5364(int var1, int var2, int var3, int var4, class308 var5, long var6, class308 var8, class308 var9) {
      this.copy$addItemPile(var1, var2, var3, var4, var5, var6, var8, var9);
      Tile var10 = this.getTiles()[var1][var2][var3];
      if(var10 != null) {
         RSItemLayer var11 = (RSItemLayer)var10.getItemLayer();
         if(var11 != null) {
            var11.setPlane(var1);
         }
      }

   }

   @ObfuscatedName("ag")
   public void method5409(int var1, int var2, int var3) {
      class56 var4 = this.field3310[var1][var2][var3];
      if(var4 != null) {
         var4.field431 = null;
         var4.itemLayerChanged(-1);
      }
   }

   @ObfuscatedName("as")
   public long method5398(int var1, int var2, int var3) {
      class56 var4 = this.field3310[var1][var2][var3];
      return var4 != null && var4.field425 != null?var4.field425.field1854:0L;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(IIIILdj;JI)V"
   )
   public void method5407(int var1, int var2, int var3, int var4, class308 var5, long var6, int var8) {
      this.copy$groundObjectSpawned(var1, var2, var3, var4, var5, var6, var8);
      Tile var9 = this.getTiles()[var1][var2][var3];
      if(var9 != null) {
         RSGroundObject var10 = (RSGroundObject)var9.getGroundObject();
         if(var10 != null) {
            var10.setPlane(var1);
         }
      }

   }

   @ObfuscatedName("u")
   public void method5345() {
      for(int var1 = 0; var1 < this.field3312; ++var1) {
         class299 var2 = this.field3313[var1];
         this.method5346(var2);
         this.field3313[var1] = null;
      }

      this.field3312 = 0;
   }

   @ObfuscatedName("aq")
   public void method5369() {
      field3342 = true;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(Ldb;IIIII)V"
   )
   void method5389(class218 var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if(var12 != this.field3322) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if(var13 >= 0 && var13 < this.field3306) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if(var14 >= 0 && var14 < this.field3308 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) {
                        class56 var15 = this.field3310[var12][var13][var14];
                        if(var15 != null) {
                           int var16 = (this.field3309[var12][var13 + 1][var14] + this.field3309[var12][var13 + 1][var14 + 1] + this.field3309[var12][var13][var14] + this.field3309[var12][var13][var14 + 1]) / 4 - (this.field3309[var2][var3 + 1][var4] + this.field3309[var2][var3][var4] + this.field3309[var2][var3 + 1][var4 + 1] + this.field3309[var2][var3][var4 + 1]) / 4;
                           class12 var17 = var15.field423;
                           if(var17 != null) {
                              class218 var18;
                              if(var17.field109 instanceof class218) {
                                 var18 = (class218)var17.field109;
                                 class218.method3858(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if(var17.field111 instanceof class218) {
                                 var18 = (class218)var17.field111;
                                 class218.method3858(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.field427; ++var23) {
                              class299 var19 = var15.field439[var23];
                              if(var19 != null && var19.field3220 instanceof class218) {
                                 class218 var20 = (class218)var19.field3220;
                                 int var21 = var19.field3214 - var19.field3213 + 1;
                                 int var22 = var19.field3222 - var19.field3215 + 1;
                                 class218.method3858(var1, var20, (var21 - var5) * 64 + (var19.field3213 - var3) * 128, var16, (var19.field3215 - var4) * 128 + (var22 - var6) * 64, var7);
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

   @ObfuscatedName("c")
   public void method5336(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      class18 var21;
      int var22;
      if(var4 == 0) {
         var21 = new class18(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.field3310[var22][var2][var3] == null) {
               this.field3310[var22][var2][var3] = new class56(var22, var2, var3);
            }
         }

         this.field3310[var1][var2][var3].field421 = var21;
      } else if(var4 != 1) {
         class245 var23 = new class245(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.field3310[var22][var2][var3] == null) {
               this.field3310[var22][var2][var3] = new class56(var22, var2, var3);
            }
         }

         this.field3310[var1][var2][var3].field422 = var23;
      } else {
         var21 = new class18(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7);

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.field3310[var22][var2][var3] == null) {
               this.field3310[var22][var2][var3] = new class56(var22, var2, var3);
            }
         }

         this.field3310[var1][var2][var3].field421 = var21;
      }
   }

   @ObfuscatedName("e")
   public void method5335(int var1, int var2, int var3, int var4) {
      class56 var5 = this.field3310[var1][var2][var3];
      if(var5 != null) {
         this.field3310[var1][var2][var3].field428 = var4;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIIIILdj;IJZ)Z"
   )
   public boolean method5342(int var1, int var2, int var3, int var4, int var5, class308 var6, int var7, long var8, boolean var10) {
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
         return this.method5344(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   @ObfuscatedName("l")
   public void method5481(int var1) {
      this.field3307 = var1;

      for(int var2 = 0; var2 < this.field3306; ++var2) {
         for(int var3 = 0; var3 < this.field3308; ++var3) {
            if(this.field3310[var1][var2][var3] == null) {
               this.field3310[var1][var2][var3] = new class56(var1, var2, var3);
            }
         }
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(III)Leo;"
   )
   public class225 method5354(int var1, int var2, int var3) {
      class56 var4 = this.field3310[var1][var2][var3];
      return var4 == null?null:var4.field424;
   }

   @ObfuscatedName("ae")
   public void method5365(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      class56 var7 = this.field3310[var4][var5][var6];
      if(var7 != null) {
         class18 var8 = var7.field421;
         int var10;
         if(var8 != null) {
            int var9 = var8.field148;
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
            class245 var18 = var7.field422;
            if(var18 != null) {
               var10 = var18.field2442;
               int var11 = var18.field2459;
               int var12 = var18.field2450;
               int var13 = var18.field2452;
               int[] var14 = this.field3323[var10];
               int[] var15 = this.field3363[var11];
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

   @ObfuscatedName("ab")
   public void method5502(int var1, int var2, int var3, boolean var4) {
      if(!method5370() || var4) {
         field3362 = true;
         field3342 = var4;
         field3311 = var1;
         field3338 = var2;
         field3339 = var3;
         field3319 = -1;
         field3341 = -1;
      }
   }

   @ObfuscatedName("ah")
   public void method5355(int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         isDrawingScene = true;
         this.copy$drawScene(var1, var2, var3, var4, var5, var6);
         class113.field1064.getCallbacks().drawScene();
      } finally {
         isDrawingScene = false;
      }

   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(Lef;)V"
   )
   void method5346(class299 var1) {
      for(int var2 = var1.field3213; var2 <= var1.field3214; ++var2) {
         for(int var3 = var1.field3215; var3 <= var1.field3222; ++var3) {
            class56 var4 = this.field3310[var1.field3209][var2][var3];
            if(var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.field427; ++var5) {
                  if(var4.field439[var5] == var1) {
                     --var4.field427;

                     for(int var6 = var5; var6 < var4.field427; ++var6) {
                        var4.field439[var6] = var4.field439[var6 + 1];
                        var4.gameObjectsChanged(var6);
                        var4.field417[var6] = var4.field417[var6 + 1];
                     }

                     var4.field439[var4.field427] = null;
                     var4.gameObjectsChanged(var4.field427);
                     break;
                  }
               }

               var4.field418 = 0;

               for(var5 = 0; var5 < var4.field427; ++var5) {
                  var4.field418 |= var4.field417[var5];
               }
            }
         }
      }

   }

   @ObfuscatedName("bo")
   void method5377() {
      int var1 = field3346[field3320];
      class109[] var2 = field3347[field3320];
      field3349 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         class109 var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var9;
         boolean var13;
         if(var4.field1013 == 1) {
            var5 = var4.field1007 - field3321 + 25;
            if(var5 >= 0 && var5 <= 50) {
               var6 = var4.field1009 - field3327 + 25;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field1008 - field3327 + 25;
               if(var7 > 50) {
                  var7 = 50;
               }

               var13 = false;

               while(var6 <= var7) {
                  if(field3365[var5][var6++]) {
                     var13 = true;
                     break;
                  }
               }

               if(var13) {
                  var9 = field3328 - var4.field1012;
                  if(var9 > 32) {
                     var4.field1018 = 1;
                  } else {
                     if(var9 >= -32) {
                        continue;
                     }

                     var4.field1018 = 2;
                     var9 = -var9;
                  }

                  var4.field1021 = (var4.field1011 - field3352 << 8) / var9;
                  var4.field1022 = (var4.field1010 - field3352 << 8) / var9;
                  var4.field1023 = (var4.field1016 - field3367 << 8) / var9;
                  var4.field1024 = (var4.field1015 - field3367 << 8) / var9;
                  field3305[field3349++] = var4;
               }
            }
         } else if(var4.field1013 == 2) {
            var5 = var4.field1009 - field3327 + 25;
            if(var5 >= 0 && var5 <= 50) {
               var6 = var4.field1007 - field3321 + 25;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field1020 - field3321 + 25;
               if(var7 > 50) {
                  var7 = 50;
               }

               var13 = false;

               while(var6 <= var7) {
                  if(field3365[var6++][var5]) {
                     var13 = true;
                     break;
                  }
               }

               if(var13) {
                  var9 = field3352 - var4.field1011;
                  if(var9 > 32) {
                     var4.field1018 = 3;
                  } else {
                     if(var9 >= -32) {
                        continue;
                     }

                     var4.field1018 = 4;
                     var9 = -var9;
                  }

                  var4.field1019 = (var4.field1012 - field3328 << 8) / var9;
                  var4.field1017 = (var4.field1014 - field3328 << 8) / var9;
                  var4.field1023 = (var4.field1016 - field3367 << 8) / var9;
                  var4.field1024 = (var4.field1015 - field3367 << 8) / var9;
                  field3305[field3349++] = var4;
               }
            }
         } else if(var4.field1013 == 4) {
            var5 = var4.field1016 - field3367;
            if(var5 > 128) {
               var6 = var4.field1009 - field3327 + 25;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field1008 - field3327 + 25;
               if(var7 > 50) {
                  var7 = 50;
               }

               if(var6 <= var7) {
                  int var8 = var4.field1007 - field3321 + 25;
                  if(var8 < 0) {
                     var8 = 0;
                  }

                  var9 = var4.field1020 - field3321 + 25;
                  if(var9 > 50) {
                     var9 = 50;
                  }

                  boolean var10 = false;

                  label144:
                  for(int var11 = var8; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if(field3365[var11][var12]) {
                           var10 = true;
                           break label144;
                        }
                     }
                  }

                  if(var10) {
                     var4.field1018 = 5;
                     var4.field1019 = (var4.field1012 - field3328 << 8) / var5;
                     var4.field1017 = (var4.field1014 - field3328 << 8) / var5;
                     var4.field1021 = (var4.field1011 - field3352 << 8) / var5;
                     var4.field1022 = (var4.field1010 - field3352 << 8) / var5;
                     field3305[field3349++] = var4;
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IIIIIIIILdj;IZJI)Z"
   )
   boolean method5344(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class308 var9, int var10, boolean var11, long var12, int var14) {
      boolean var15 = shouldDraw(var9, false);
      if(!var15) {
         int var16 = var6 >> 7;
         int var17 = var7 >> 7;
         class113.field1064.getOccupiedTilesTick()[var16][var17] = -1;
      }

      return var15 && this.copy$addEntityMarker(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var14);
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(Ldb;III)V"
   )
   void method5363(class218 var1, int var2, int var3, int var4) {
      class56 var5;
      class218 var6;
      if(var3 < this.field3306) {
         var5 = this.field3310[var2][var3 + 1][var4];
         if(var5 != null && var5.field425 != null && var5.field425.field1849 instanceof class218) {
            var6 = (class218)var5.field425.field1849;
            class218.method3858(var1, var6, 128, 0, 0, true);
         }
      }

      if(var4 < this.field3306) {
         var5 = this.field3310[var2][var3][var4 + 1];
         if(var5 != null && var5.field425 != null && var5.field425.field1849 instanceof class218) {
            var6 = (class218)var5.field425.field1849;
            class218.method3858(var1, var6, 0, 0, 128, true);
         }
      }

      if(var3 < this.field3306 && var4 < this.field3308) {
         var5 = this.field3310[var2][var3 + 1][var4 + 1];
         if(var5 != null && var5.field425 != null && var5.field425.field1849 instanceof class218) {
            var6 = (class218)var5.field425.field1849;
            class218.method3858(var1, var6, 128, 0, 128, true);
         }
      }

      if(var3 < this.field3306 && var4 > 0) {
         var5 = this.field3310[var2][var3 + 1][var4 - 1];
         if(var5 != null && var5.field425 != null && var5.field425.field1849 instanceof class218) {
            var6 = (class218)var5.field425.field1849;
            class218.method3858(var1, var6, 128, 0, -128, true);
         }
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(Ldx;Z)V"
   )
   void method5330(class56 var1, boolean var2) {
      field3366.method5600(var1);

      while(true) {
         class56 var3;
         int var4;
         int var5;
         int var6;
         int var7;
         class56[][] var8;
         class56 var9;
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
                              class12 var10;
                              class299 var12;
                              int var17;
                              int var18;
                              boolean var20;
                              int var21;
                              class56 var36;
                              while(true) {
                                 do {
                                    var3 = (class56)field3366.method5599();
                                    if(var3 == null) {
                                       return;
                                    }
                                 } while(!var3.field433);

                                 var4 = var3.field426;
                                 var5 = var3.field419;
                                 var6 = var3.field436;
                                 var7 = var3.field420;
                                 var8 = this.field3310[var6];
                                 if(!var3.field432) {
                                    break;
                                 }

                                 if(var2) {
                                    if(var6 > 0) {
                                       var9 = this.field3310[var6 - 1][var4][var5];
                                       if(var9 != null && var9.field433) {
                                          continue;
                                       }
                                    }

                                    if(var4 <= field3321 && var4 > field3336) {
                                       var9 = var8[var4 - 1][var5];
                                       if(var9 != null && var9.field433 && (var9.field432 || (var3.field418 & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if(var4 >= field3321 && var4 < field3359 - 1) {
                                       var9 = var8[var4 + 1][var5];
                                       if(var9 != null && var9.field433 && (var9.field432 || (var3.field418 & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if(var5 <= field3327 && var5 > field3324) {
                                       var9 = var8[var4][var5 - 1];
                                       if(var9 != null && var9.field433 && (var9.field432 || (var3.field418 & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if(var5 >= field3327 && var5 < field3325 - 1) {
                                       var9 = var8[var4][var5 + 1];
                                       if(var9 != null && var9.field433 && (var9.field432 || (var3.field418 & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var2 = true;
                                 }

                                 var3.field432 = false;
                                 if(var3.field430 != null) {
                                    var9 = var3.field430;
                                    if(var9.field421 != null) {
                                       if(!this.method5385(0, var4, var5)) {
                                          this.method5395(var9.field421, 0, field3331, field3332, field3333, field3334, var4, var5);
                                       }
                                    } else if(var9.field422 != null && !this.method5385(0, var4, var5)) {
                                       this.method5374(var9.field422, field3331, field3332, field3333, field3334, var4, var5);
                                    }

                                    var10 = var9.field423;
                                    if(var10 != null) {
                                       var10.field109.vmethod5292(0, field3331, field3332, field3333, field3334, var10.field106 - field3328, var10.field112 - field3367, var10.field107 - field3352, var10.field105);
                                    }

                                    for(var11 = 0; var11 < var9.field427; ++var11) {
                                       var12 = var9.field439[var11];
                                       if(var12 != null) {
                                          var12.field3220.vmethod5292(var12.field3212, field3331, field3332, field3333, field3334, var12.field3216 - field3328, var12.field3208 - field3367, var12.field3210 - field3352, var12.field3219);
                                       }
                                    }
                                 }

                                 var20 = false;
                                 if(var3.field421 != null) {
                                    if(!this.method5385(var7, var4, var5)) {
                                       var20 = true;
                                       if(var3.field421.field144 != 12345678 || field3362 && var6 <= field3311) {
                                          this.method5395(var3.field421, var7, field3331, field3332, field3333, field3334, var4, var5);
                                       }
                                    }
                                 } else if(var3.field422 != null && !this.method5385(var7, var4, var5)) {
                                    var20 = true;
                                    this.method5374(var3.field422, field3331, field3332, field3333, field3334, var4, var5);
                                 }

                                 var21 = 0;
                                 var11 = 0;
                                 class12 var31 = var3.field423;
                                 class225 var13 = var3.field424;
                                 if(var31 != null || var13 != null) {
                                    if(var4 == field3321) {
                                       ++var21;
                                    } else if(field3321 < var4) {
                                       var21 += 2;
                                    }

                                    if(var5 == field3327) {
                                       var21 += 3;
                                    } else if(field3327 > var5) {
                                       var21 += 6;
                                    }

                                    var11 = field3351[var21];
                                    var3.field438 = field3353[var21];
                                 }

                                 if(var31 != null) {
                                    if((var31.field108 & field3348[var21]) != 0) {
                                       if(var31.field108 == 16) {
                                          var3.field435 = 3;
                                          var3.field429 = field3354[var21];
                                          var3.field437 = 3 - var3.field429;
                                       } else if(var31.field108 == 32) {
                                          var3.field435 = 6;
                                          var3.field429 = field3343[var21];
                                          var3.field437 = 6 - var3.field429;
                                       } else if(var31.field108 == 64) {
                                          var3.field435 = 12;
                                          var3.field429 = field3337[var21];
                                          var3.field437 = 12 - var3.field429;
                                       } else {
                                          var3.field435 = 9;
                                          var3.field429 = field3357[var21];
                                          var3.field437 = 9 - var3.field429;
                                       }
                                    } else {
                                       var3.field435 = 0;
                                    }

                                    if((var31.field108 & var11) != 0 && !this.method5379(var7, var4, var5, var31.field108)) {
                                       var31.field109.vmethod5292(0, field3331, field3332, field3333, field3334, var31.field106 - field3328, var31.field112 - field3367, var31.field107 - field3352, var31.field105);
                                    }

                                    if((var31.field110 & var11) != 0 && !this.method5379(var7, var4, var5, var31.field110)) {
                                       var31.field111.vmethod5292(0, field3331, field3332, field3333, field3334, var31.field106 - field3328, var31.field112 - field3367, var31.field107 - field3352, var31.field105);
                                    }
                                 }

                                 if(var13 != null && !this.method5380(var7, var4, var5, var13.field2200.field3281)) {
                                    if((var13.field2194 & var11) != 0) {
                                       var13.field2200.vmethod5292(0, field3331, field3332, field3333, field3334, var13.field2205 - field3328 + var13.field2198, var13.field2195 - field3367, var13.field2201 - field3352 + var13.field2199, var13.field2202);
                                    } else if(var13.field2194 == 256) {
                                       var14 = var13.field2205 - field3328;
                                       var15 = var13.field2195 - field3367;
                                       var16 = var13.field2201 - field3352;
                                       var17 = var13.field2197;
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
                                          var13.field2200.vmethod5292(0, field3331, field3332, field3333, field3334, var14 + var13.field2198, var15, var16 + var13.field2199, var13.field2202);
                                       } else if(var13.field2193 != null) {
                                          var13.field2193.vmethod5292(0, field3331, field3332, field3333, field3334, var14, var15, var16, var13.field2202);
                                       }
                                    }
                                 }

                                 if(var20) {
                                    class195 var22 = var3.field425;
                                    if(var22 != null) {
                                       var22.field1849.vmethod5292(0, field3331, field3332, field3333, field3334, var22.field1850 - field3328, var22.field1853 - field3367, var22.field1851 - field3352, var22.field1854);
                                    }

                                    class204 var23 = var3.field431;
                                    if(var23 != null && var23.field1988 == 0) {
                                       if(var23.field1985 != null) {
                                          var23.field1985.vmethod5292(0, field3331, field3332, field3333, field3334, var23.field1982 - field3328, var23.field1981 - field3367, var23.field1986 - field3352, var23.field1987);
                                       }

                                       if(var23.field1983 != null) {
                                          var23.field1983.vmethod5292(0, field3331, field3332, field3333, field3334, var23.field1982 - field3328, var23.field1981 - field3367, var23.field1986 - field3352, var23.field1987);
                                       }

                                       if(var23.field1984 != null) {
                                          var23.field1984.vmethod5292(0, field3331, field3332, field3333, field3334, var23.field1982 - field3328, var23.field1981 - field3367, var23.field1986 - field3352, var23.field1987);
                                       }
                                    }
                                 }

                                 var14 = var3.field418;
                                 if(var14 != 0) {
                                    if(var4 < field3321 && (var14 & 4) != 0) {
                                       var36 = var8[var4 + 1][var5];
                                       if(var36 != null && var36.field433) {
                                          field3366.method5600(var36);
                                       }
                                    }

                                    if(var5 < field3327 && (var14 & 2) != 0) {
                                       var36 = var8[var4][var5 + 1];
                                       if(var36 != null && var36.field433) {
                                          field3366.method5600(var36);
                                       }
                                    }

                                    if(var4 > field3321 && (var14 & 1) != 0) {
                                       var36 = var8[var4 - 1][var5];
                                       if(var36 != null && var36.field433) {
                                          field3366.method5600(var36);
                                       }
                                    }

                                    if(var5 > field3327 && (var14 & 8) != 0) {
                                       var36 = var8[var4][var5 - 1];
                                       if(var36 != null && var36.field433) {
                                          field3366.method5600(var36);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if(var3.field435 != 0) {
                                 var20 = true;

                                 for(var21 = 0; var21 < var3.field427; ++var21) {
                                    if(var3.field439[var21].field3218 != field3329 && (var3.field417[var21] & var3.field435) == var3.field429) {
                                       var20 = false;
                                       break;
                                    }
                                 }

                                 if(var20) {
                                    var10 = var3.field423;
                                    if(!this.method5379(var7, var4, var5, var10.field108)) {
                                       var10.field109.vmethod5292(0, field3331, field3332, field3333, field3334, var10.field106 - field3328, var10.field112 - field3367, var10.field107 - field3352, var10.field105);
                                    }

                                    var3.field435 = 0;
                                 }
                              }

                              if(!var3.field434) {
                                 break;
                              }

                              try {
                                 int var34 = var3.field427;
                                 var3.field434 = false;
                                 var21 = 0;

                                 label563:
                                 for(var11 = 0; var11 < var34; ++var11) {
                                    var12 = var3.field439[var11];
                                    if(var12.field3218 != field3329) {
                                       for(var24 = var12.field3213; var24 <= var12.field3214; ++var24) {
                                          for(var14 = var12.field3215; var14 <= var12.field3222; ++var14) {
                                             var36 = var8[var24][var14];
                                             if(var36.field432) {
                                                var3.field434 = true;
                                                continue label563;
                                             }

                                             if(var36.field435 != 0) {
                                                var16 = 0;
                                                if(var24 > var12.field3213) {
                                                   ++var16;
                                                }

                                                if(var24 < var12.field3214) {
                                                   var16 += 4;
                                                }

                                                if(var14 > var12.field3215) {
                                                   var16 += 8;
                                                }

                                                if(var14 < var12.field3222) {
                                                   var16 += 2;
                                                }

                                                if((var16 & var36.field435) == var3.field437) {
                                                   var3.field434 = true;
                                                   continue label563;
                                                }
                                             }
                                          }
                                       }

                                       field3335[var21++] = var12;
                                       var24 = field3321 - var12.field3213;
                                       var14 = var12.field3214 - field3321;
                                       if(var14 > var24) {
                                          var24 = var14;
                                       }

                                       var15 = field3327 - var12.field3215;
                                       var16 = var12.field3222 - field3327;
                                       if(var16 > var15) {
                                          var12.field3207 = var24 + var16;
                                       } else {
                                          var12.field3207 = var24 + var15;
                                       }
                                    }
                                 }

                                 while(var21 > 0) {
                                    var11 = -50;
                                    var25 = -1;

                                    for(var24 = 0; var24 < var21; ++var24) {
                                       class299 var35 = field3335[var24];
                                       if(var35.field3218 != field3329) {
                                          if(var35.field3207 > var11) {
                                             var11 = var35.field3207;
                                             var25 = var24;
                                          } else if(var11 == var35.field3207) {
                                             var15 = var35.field3216 - field3328;
                                             var16 = var35.field3210 - field3352;
                                             var17 = field3335[var25].field3216 - field3328;
                                             var18 = field3335[var25].field3210 - field3352;
                                             if(var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                                                var25 = var24;
                                             }
                                          }
                                       }
                                    }

                                    if(var25 == -1) {
                                       break;
                                    }

                                    class299 var33 = field3335[var25];
                                    var33.field3218 = field3329;
                                    if(!this.method5381(var7, var33.field3213, var33.field3214, var33.field3215, var33.field3222, var33.field3220.field3281)) {
                                       var33.field3220.vmethod5292(var33.field3212, field3331, field3332, field3333, field3334, var33.field3216 - field3328, var33.field3208 - field3367, var33.field3210 - field3352, var33.field3219);
                                    }

                                    for(var14 = var33.field3213; var14 <= var33.field3214; ++var14) {
                                       for(var15 = var33.field3215; var15 <= var33.field3222; ++var15) {
                                          class56 var26 = var8[var14][var15];
                                          if(var26.field435 != 0) {
                                             field3366.method5600(var26);
                                          } else if((var14 != var4 || var15 != var5) && var26.field433) {
                                             field3366.method5600(var26);
                                          }
                                       }
                                    }
                                 }

                                 if(!var3.field434) {
                                    break;
                                 }
                              } catch (Exception var28) {
                                 var3.field434 = false;
                                 break;
                              }
                           }
                        } while(!var3.field433);
                     } while(var3.field435 != 0);

                     if(var4 > field3321 || var4 <= field3336) {
                        break;
                     }

                     var9 = var8[var4 - 1][var5];
                  } while(var9 != null && var9.field433);

                  if(var4 < field3321 || var4 >= field3359 - 1) {
                     break;
                  }

                  var9 = var8[var4 + 1][var5];
               } while(var9 != null && var9.field433);

               if(var5 > field3327 || var5 <= field3324) {
                  break;
               }

               var9 = var8[var4][var5 - 1];
            } while(var9 != null && var9.field433);

            if(var5 < field3327 || var5 >= field3325 - 1) {
               break;
            }

            var9 = var8[var4][var5 + 1];
         } while(var9 != null && var9.field433);

         var3.field433 = false;
         --field3330;
         class204 var32 = var3.field431;
         if(var32 != null && var32.field1988 != 0) {
            if(var32.field1985 != null) {
               var32.field1985.vmethod5292(0, field3331, field3332, field3333, field3334, var32.field1982 - field3328, var32.field1981 - field3367 - var32.field1988, var32.field1986 - field3352, var32.field1987);
            }

            if(var32.field1983 != null) {
               var32.field1983.vmethod5292(0, field3331, field3332, field3333, field3334, var32.field1982 - field3328, var32.field1981 - field3367 - var32.field1988, var32.field1986 - field3352, var32.field1987);
            }

            if(var32.field1984 != null) {
               var32.field1984.vmethod5292(0, field3331, field3332, field3333, field3334, var32.field1982 - field3328, var32.field1981 - field3367 - var32.field1988, var32.field1986 - field3352, var32.field1987);
            }
         }

         if(var3.field438 != 0) {
            class225 var29 = var3.field424;
            if(var29 != null && !this.method5380(var7, var4, var5, var29.field2200.field3281)) {
               if((var29.field2194 & var3.field438) != 0) {
                  var29.field2200.vmethod5292(0, field3331, field3332, field3333, field3334, var29.field2205 - field3328 + var29.field2198, var29.field2195 - field3367, var29.field2201 - field3352 + var29.field2199, var29.field2202);
               } else if(var29.field2194 == 256) {
                  var11 = var29.field2205 - field3328;
                  var25 = var29.field2195 - field3367;
                  var24 = var29.field2201 - field3352;
                  var14 = var29.field2197;
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
                     var29.field2200.vmethod5292(0, field3331, field3332, field3333, field3334, var11 + var29.field2198, var25, var24 + var29.field2199, var29.field2202);
                  } else if(var29.field2193 != null) {
                     var29.field2193.vmethod5292(0, field3331, field3332, field3333, field3334, var11, var25, var24, var29.field2202);
                  }
               }
            }

            class12 var27 = var3.field423;
            if(var27 != null) {
               if((var27.field110 & var3.field438) != 0 && !this.method5379(var7, var4, var5, var27.field110)) {
                  var27.field111.vmethod5292(0, field3331, field3332, field3333, field3334, var27.field106 - field3328, var27.field112 - field3367, var27.field107 - field3352, var27.field105);
               }

               if((var27.field108 & var3.field438) != 0 && !this.method5379(var7, var4, var5, var27.field108)) {
                  var27.field109.vmethod5292(0, field3331, field3332, field3333, field3334, var27.field106 - field3328, var27.field112 - field3367, var27.field107 - field3352, var27.field105);
               }
            }
         }

         class56 var30;
         if(var6 < this.field3322 - 1) {
            var30 = this.field3310[var6 + 1][var4][var5];
            if(var30 != null && var30.field433) {
               field3366.method5600(var30);
            }
         }

         if(var4 < field3321) {
            var30 = var8[var4 + 1][var5];
            if(var30 != null && var30.field433) {
               field3366.method5600(var30);
            }
         }

         if(var5 < field3327) {
            var30 = var8[var4][var5 + 1];
            if(var30 != null && var30.field433) {
               field3366.method5600(var30);
            }
         }

         if(var4 > field3321) {
            var30 = var8[var4 - 1][var5];
            if(var30 != null && var30.field433) {
               field3366.method5600(var30);
            }
         }

         if(var5 > field3327) {
            var30 = var8[var4][var5 - 1];
            if(var30 != null && var30.field433) {
               field3366.method5600(var30);
            }
         }
      }
   }

   @ObfuscatedName("w")
   public void method5445(int var1, int var2) {
      class56 var3 = this.field3310[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         class56 var5 = this.field3310[var4][var1][var2] = this.field3310[var4 + 1][var1][var2];
         if(var5 != null) {
            --var5.field436;

            for(int var6 = 0; var6 < var5.field427; ++var6) {
               class299 var7 = var5.field439[var6];
               long var9 = var7.field3219;
               boolean var8 = class87.method1255(var9) == 2;
               if(var8 && var7.field3213 == var1 && var2 == var7.field3215) {
                  --var7.field3209;
               }
            }
         }
      }

      if(this.field3310[0][var1][var2] == null) {
         this.field3310[0][var1][var2] = new class56(0, var1, var2);
      }

      this.field3310[0][var1][var2].field430 = var3;
      this.field3310[3][var1][var2] = null;
   }

   @ObfuscatedName("k")
   public void method5348(int var1, int var2, int var3) {
      class56 var4 = this.field3310[var1][var2][var3];
      if(var4 != null) {
         var4.field423 = null;
         var4.wallObjectChanged(-1);
      }
   }

   @ObfuscatedName("aa")
   public long method5387(int var1, int var2, int var3) {
      class56 var4 = this.field3310[var1][var2][var3];
      if(var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.field427; ++var5) {
            class299 var6 = var4.field439[var5];
            long var8 = var6.field3219;
            boolean var7 = class87.method1255(var8) == 2;
            if(var7 && var2 == var6.field3213 && var3 == var6.field3215) {
               return var6.field3219;
            }
         }

         return 0L;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Ldk;IIIIIII)V"
   )
   void method5395(class18 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         this.copy$drawTileUnderlay(var1, var2, var3, var4, var5, var6, var7, var8);
      } catch (Exception var10) {
         class113.field1064.getLogger().warn("error during tile underlay rendering", var10);
      }

   }

   @ObfuscatedName("i")
   public void method5478(int var1, int var2, int var3, int var4) {
      class56 var5 = this.field3310[var1][var2][var3];
      if(var5 != null) {
         class225 var6 = var5.field424;
         if(var6 != null) {
            var6.field2198 = var4 * var6.field2198 / 16;
            var6.field2199 = var4 * var6.field2199 / 16;
         }
      }
   }

   @ObfuscatedName("ba")
   boolean method5382(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < field3349; ++var4) {
         class109 var5 = field3305[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if(var5.field1018 == 1) {
            var6 = var5.field1012 - var1;
            if(var6 > 0) {
               var7 = (var6 * var5.field1021 >> 8) + var5.field1011;
               var8 = (var6 * var5.field1022 >> 8) + var5.field1010;
               var9 = (var6 * var5.field1023 >> 8) + var5.field1016;
               var10 = (var6 * var5.field1024 >> 8) + var5.field1015;
               if(var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field1018 == 2) {
            var6 = var1 - var5.field1012;
            if(var6 > 0) {
               var7 = (var6 * var5.field1021 >> 8) + var5.field1011;
               var8 = (var6 * var5.field1022 >> 8) + var5.field1010;
               var9 = (var6 * var5.field1023 >> 8) + var5.field1016;
               var10 = (var6 * var5.field1024 >> 8) + var5.field1015;
               if(var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field1018 == 3) {
            var6 = var5.field1011 - var3;
            if(var6 > 0) {
               var7 = (var6 * var5.field1019 >> 8) + var5.field1012;
               var8 = (var6 * var5.field1017 >> 8) + var5.field1014;
               var9 = (var6 * var5.field1023 >> 8) + var5.field1016;
               var10 = (var6 * var5.field1024 >> 8) + var5.field1015;
               if(var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field1018 == 4) {
            var6 = var3 - var5.field1011;
            if(var6 > 0) {
               var7 = (var6 * var5.field1019 >> 8) + var5.field1012;
               var8 = (var6 * var5.field1017 >> 8) + var5.field1014;
               var9 = (var6 * var5.field1023 >> 8) + var5.field1016;
               var10 = (var6 * var5.field1024 >> 8) + var5.field1015;
               if(var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field1018 == 5) {
            var6 = var2 - var5.field1016;
            if(var6 > 0) {
               var7 = (var6 * var5.field1019 >> 8) + var5.field1012;
               var8 = (var6 * var5.field1017 >> 8) + var5.field1014;
               var9 = (var6 * var5.field1021 >> 8) + var5.field1011;
               var10 = (var6 * var5.field1022 >> 8) + var5.field1010;
               if(var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @ObfuscatedName("bf")
   boolean method5379(int var1, int var2, int var3, int var4) {
      if(!this.method5385(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.field3309[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if(var4 < 16) {
            if(var4 == 1) {
               if(var5 > field3328) {
                  if(!this.method5382(var5, var7, var6)) {
                     return false;
                  }

                  if(!this.method5382(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method5382(var5, var8, var6)) {
                     return false;
                  }

                  if(!this.method5382(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method5382(var5, var9, var6)) {
                  return false;
               }

               if(!this.method5382(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 2) {
               if(var6 < field3352) {
                  if(!this.method5382(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if(!this.method5382(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method5382(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if(!this.method5382(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method5382(var5, var9, var6 + 128)) {
                  return false;
               }

               if(!this.method5382(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 4) {
               if(var5 < field3328) {
                  if(!this.method5382(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if(!this.method5382(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method5382(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if(!this.method5382(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method5382(var5 + 128, var9, var6)) {
                  return false;
               }

               if(!this.method5382(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 8) {
               if(var6 > field3352) {
                  if(!this.method5382(var5, var7, var6)) {
                     return false;
                  }

                  if(!this.method5382(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method5382(var5, var8, var6)) {
                     return false;
                  }

                  if(!this.method5382(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if(!this.method5382(var5, var9, var6)) {
                  return false;
               }

               if(!this.method5382(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         return !this.method5382(var5 + 64, var10, var6 + 64)?false:(var4 == 16?this.method5382(var5, var9, var6 + 128):(var4 == 32?this.method5382(var5 + 128, var9, var6 + 128):(var4 == 64?this.method5382(var5 + 128, var9, var6):(var4 == 128?this.method5382(var5, var9, var6):true))));
      }
   }

   @ObfuscatedName("bx")
   boolean method5385(int var1, int var2, int var3) {
      int var4 = this.field3314[var1][var2][var3];
      if(var4 == -field3329) {
         return false;
      } else if(var4 == field3329) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if(this.method5382(var5 + 1, this.field3309[var1][var2][var3], var6 + 1) && this.method5382(var5 + 128 - 1, this.field3309[var1][var2 + 1][var3], var6 + 1) && this.method5382(var5 + 128 - 1, this.field3309[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method5382(var5 + 1, this.field3309[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.field3314[var1][var2][var3] = field3329;
            return true;
         } else {
            this.field3314[var1][var2][var3] = -field3329;
            return false;
         }
      }
   }

   @ObfuscatedName("am")
   public long method5357(int var1, int var2, int var3) {
      class56 var4 = this.field3310[var1][var2][var3];
      return var4 != null && var4.field423 != null?var4.field423.field105:0L;
   }

   @ObfuscatedName("y")
   public void method5350(int var1, int var2, int var3) {
      class56 var4 = this.field3310[var1][var2][var3];
      if(var4 != null) {
         for(int var5 = 0; var5 < var4.field427; ++var5) {
            class299 var6 = var4.field439[var5];
            long var8 = var6.field3219;
            boolean var7 = class87.method1255(var8) == 2;
            if(var7 && var2 == var6.field3213 && var3 == var6.field3215) {
               this.method5346(var6);
               return;
            }
         }

      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(IIIILdj;Ldj;IIIIJI)V"
   )
   public void method5340(int var1, int var2, int var3, int var4, class308 var5, class308 var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      this.copy$addBoundaryDecoration(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var13);
      Tile var14 = this.getTiles()[var1][var2][var3];
      if(var14 != null) {
         RSDecorativeObject var15 = (RSDecorativeObject)var14.getDecorativeObject();
         if(var15 != null) {
            var15.setPlane(var1);
         }
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(III)Lef;"
   )
   public class299 method5476(int var1, int var2, int var3) {
      class56 var4 = this.field3310[var1][var2][var3];
      if(var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.field427; ++var5) {
            class299 var6 = var4.field439[var5];
            long var8 = var6.field3219;
            boolean var7 = class87.method1255(var8) == 2;
            if(var7 && var2 == var6.field3213 && var3 == var6.field3215) {
               return var6;
            }
         }

         return null;
      }
   }

   @ObfuscatedName("al")
   public int method5361(int var1, int var2, int var3, long var4) {
      class56 var6 = this.field3310[var1][var2][var3];
      if(var6 == null) {
         return -1;
      } else if(var6.field423 != null && var6.field423.field105 == var4) {
         return var6.field423.field113 & 255;
      } else if(var6.field424 != null && var6.field424.field2202 == var4) {
         return var6.field424.field2203 & 255;
      } else if(var6.field425 != null && var6.field425.field1854 == var4) {
         return var6.field425.field1852 & 255;
      } else {
         for(int var7 = 0; var7 < var6.field427; ++var7) {
            if(var6.field439[var7].field3219 == var4) {
               return var6.field439[var7].field3221 & 255;
            }
         }

         return -1;
      }
   }

   @ObfuscatedName("av")
   public void method5351(int var1, int var2, int var3) {
      class56 var4 = this.field3310[var1][var2][var3];
      if(var4 != null) {
         var4.field425 = null;
         var4.groundObjectChanged(-1);
      }
   }

   @ObfuscatedSignature(
      signature = "(IIIILdj;JLdj;Ldj;)V"
   )
   public void copy$addItemPile(int var1, int var2, int var3, int var4, class308 var5, long var6, class308 var8, class308 var9) {
      class204 var10 = new class204();
      var10.field1984 = var5;
      var10.field1982 = var2 * 128 + 64;
      var10.field1986 = var3 * 128 + 64;
      var10.field1981 = var4;
      var10.field1987 = var6;
      var10.field1985 = var8;
      var10.field1983 = var9;
      int var11 = 0;
      class56 var12 = this.field3310[var1][var2][var3];
      if(var12 != null) {
         for(int var13 = 0; var13 < var12.field427; ++var13) {
            if((var12.field439[var13].field3221 & 256) == 256 && var12.field439[var13].field3220 instanceof class200) {
               class200 var14 = (class200)var12.field439[var13].field3220;
               var14.method3374();
               if(var14.field3281 > var11) {
                  var11 = var14.field3281;
               }
            }
         }
      }

      var10.field1988 = var11;
      if(this.field3310[var1][var2][var3] == null) {
         this.field3310[var1][var2][var3] = new class56(var1, var2, var3);
      }

      this.field3310[var1][var2][var3].field431 = var10;
      this.field3310[var1][var2][var3].itemLayerChanged(-1);
   }

   @ObfuscatedSignature(
      signature = "(Ldk;IIIIIII)V"
   )
   public void copy$drawTileUnderlay(class18 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - field3328;
      int var11;
      int var12 = var11 = (var8 << 7) - field3352;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.field3309[var2][var7][var8] - field3367;
      int var18 = this.field3309[var2][var7 + 1][var8] - field3367;
      int var19 = this.field3309[var2][var7 + 1][var8 + 1] - field3367;
      int var20 = this.field3309[var2][var7][var8 + 1] - field3367;
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
                  int var22 = var10 * class257.field2550 / var12 + class257.field2551;
                  int var23 = var17 * class257.field2550 / var12 + class257.field2541;
                  int var24 = var14 * class257.field2550 / var11 + class257.field2551;
                  int var25 = var18 * class257.field2550 / var11 + class257.field2541;
                  int var26 = var13 * class257.field2550 / var16 + class257.field2551;
                  int var27 = var19 * class257.field2550 / var16 + class257.field2541;
                  int var28 = var9 * class257.field2550 / var15 + class257.field2551;
                  int var29 = var21 * class257.field2550 / var15 + class257.field2541;
                  class257.field2543 = 0;
                  int var30;
                  if((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                     class257.field2553 = false;
                     if(var26 < 0 || var28 < 0 || var24 < 0 || var26 > class257.field2552 || var28 > class257.field2552 || var24 > class257.field2552) {
                        class257.field2553 = true;
                     }

                     if(field3362 && method5376(field3338, field3339, var27, var29, var25, var26, var28, var24)) {
                        field3319 = var7;
                        field3341 = var8;
                     }

                     if(var1.field146 == -1) {
                        if(var1.field144 != 12345678) {
                           class257.method4579(var27, var29, var25, var26, var28, var24, var1.field144, var1.field143, var1.field142);
                        }
                     } else if(!field3340) {
                        if(var1.field149) {
                           class257.method4642(var27, var29, var25, var26, var28, var24, var1.field144, var1.field143, var1.field142, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field146);
                        } else {
                           class257.method4642(var27, var29, var25, var26, var28, var24, var1.field144, var1.field143, var1.field142, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.field146);
                        }
                     } else {
                        var30 = class257.field2539.vmethod4530(var1.field146);
                        class257.method4579(var27, var29, var25, var26, var28, var24, method5393(var30, var1.field144), method5393(var30, var1.field143), method5393(var30, var1.field142));
                     }
                  }

                  if((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     class257.field2553 = false;
                     if(var22 < 0 || var24 < 0 || var28 < 0 || var22 > class257.field2552 || var24 > class257.field2552 || var28 > class257.field2552) {
                        class257.field2553 = true;
                     }

                     if(field3362 && method5376(field3338, field3339, var23, var25, var29, var22, var24, var28)) {
                        field3319 = var7;
                        field3341 = var8;
                     }

                     if(var1.field146 == -1) {
                        if(var1.field145 != 12345678) {
                           class257.method4579(var23, var25, var29, var22, var24, var28, var1.field145, var1.field142, var1.field143);
                        }
                     } else if(!field3340) {
                        class257.method4642(var23, var25, var29, var22, var24, var28, var1.field145, var1.field142, var1.field143, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field146);
                     } else {
                        var30 = class257.field2539.vmethod4530(var1.field146);
                        class257.method4579(var23, var25, var29, var22, var24, var28, method5393(var30, var1.field145), method5393(var30, var1.field142), method5393(var30, var1.field143));
                     }
                  }

               }
            }
         }
      }
   }

   @ObfuscatedSignature(
      signature = "(IIIILdj;JI)V"
   )
   public void copy$groundObjectSpawned(int var1, int var2, int var3, int var4, class308 var5, long var6, int var8) {
      if(var5 != null) {
         class195 var9 = new class195();
         var9.field1849 = var5;
         var9.field1850 = var2 * 128 + 64;
         var9.field1851 = var3 * 128 + 64;
         var9.field1853 = var4;
         var9.field1854 = var6;
         var9.field1852 = var8;
         if(this.field3310[var1][var2][var3] == null) {
            this.field3310[var1][var2][var3] = new class56(var1, var2, var3);
         }

         this.field3310[var1][var2][var3].field425 = var9;
         this.field3310[var1][var2][var3].groundObjectChanged(-1);
      }
   }

   @ObfuscatedSignature(
      signature = "(IIIILdj;Ldj;IIJI)V"
   )
   public void copy$addBoundary(int var1, int var2, int var3, int var4, class308 var5, class308 var6, int var7, int var8, long var9, int var11) {
      if(var5 != null || var6 != null) {
         class12 var12 = new class12();
         var12.field105 = var9;
         var12.field113 = var11;
         var12.field106 = var2 * 128 + 64;
         var12.field107 = var3 * 128 + 64;
         var12.field112 = var4;
         var12.field109 = var5;
         var12.field111 = var6;
         var12.field108 = var7;
         var12.field110 = var8;

         for(int var13 = var1; var13 >= 0; --var13) {
            if(this.field3310[var13][var2][var3] == null) {
               this.field3310[var13][var2][var3] = new class56(var13, var2, var3);
            }
         }

         this.field3310[var1][var2][var3].field423 = var12;
         this.field3310[var1][var2][var3].wallObjectChanged(-1);
      }
   }

   @ObfuscatedSignature(
      signature = "(IIIILdj;Ldj;IIIIJI)V"
   )
   public void copy$addBoundaryDecoration(int var1, int var2, int var3, int var4, class308 var5, class308 var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if(var5 != null) {
         class225 var14 = new class225();
         var14.field2202 = var11;
         var14.field2203 = var13;
         var14.field2205 = var2 * 128 + 64;
         var14.field2201 = var3 * 128 + 64;
         var14.field2195 = var4;
         var14.field2200 = var5;
         var14.field2193 = var6;
         var14.field2194 = var7;
         var14.field2197 = var8;
         var14.field2198 = var9;
         var14.field2199 = var10;

         for(int var15 = var1; var15 >= 0; --var15) {
            if(this.field3310[var15][var2][var3] == null) {
               this.field3310[var15][var2][var3] = new class56(var15, var2, var3);
            }
         }

         this.field3310[var1][var2][var3].field424 = var14;
         this.field3310[var1][var2][var3].decorativeObjectChanged(-1);
      }
   }

   public void copy$drawScene(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 < 0) {
         var1 = 0;
      } else if(var1 >= this.field3306 * 128) {
         var1 = this.field3306 * 128 - 1;
      }

      if(var3 < 0) {
         var3 = 0;
      } else if(var3 >= this.field3308 * 128) {
         var3 = this.field3308 * 128 - 1;
      }

      if(var4 < 128) {
         var4 = 128;
      } else if(var4 > 383) {
         var4 = 383;
      }

      ++field3329;
      field3331 = class257.field2564[var4];
      client.onPitchSinChanged(-1);
      field3332 = class257.field2558[var4];
      client.onPitchCosChanged(-1);
      field3333 = class257.field2564[var5];
      field3334 = class257.field2558[var5];
      field3365 = field3356[(var4 - 128) / 32][var5 / 64];
      field3328 = var1;
      field3367 = var2;
      field3352 = var3;
      field3321 = var1 / 128;
      field3327 = var3 / 128;
      field3320 = var6;
      field3336 = field3321 - 25;
      if(field3336 < 0) {
         field3336 = 0;
      }

      field3324 = field3327 - 25;
      if(field3324 < 0) {
         field3324 = 0;
      }

      field3359 = field3321 + 25;
      if(field3359 > this.field3306) {
         field3359 = this.field3306;
      }

      field3325 = field3327 + 25;
      if(field3325 > this.field3308) {
         field3325 = this.field3308;
      }

      this.method5377();
      field3330 = 0;

      int var7;
      class56[][] var8;
      int var9;
      int var10;
      for(var7 = this.field3307; var7 < this.field3322; ++var7) {
         var8 = this.field3310[var7];

         for(var9 = field3336; var9 < field3359; ++var9) {
            for(var10 = field3324; var10 < field3325; ++var10) {
               class56 var11 = var8[var9][var10];
               if(var11 != null) {
                  if(var11.field428 <= var6 && (field3365[var9 - field3321 + 25][var10 - field3327 + 25] || this.field3309[var7][var9][var10] - var2 >= 2000)) {
                     var11.field432 = true;
                     var11.field433 = true;
                     if(var11.field427 > 0) {
                        var11.field434 = true;
                     } else {
                        var11.field434 = false;
                     }

                     ++field3330;
                  } else {
                     var11.field432 = false;
                     var11.field433 = false;
                     var11.field435 = 0;
                  }
               }
            }
         }
      }

      int var12;
      int var13;
      int var14;
      class56 var15;
      int var16;
      for(var7 = this.field3307; var7 < this.field3322; ++var7) {
         var8 = this.field3310[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = var9 + field3321;
            var16 = field3321 - var9;
            if(var10 >= field3336 || var16 < field3359) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = var12 + field3327;
                  var14 = field3327 - var12;
                  if(var10 >= field3336) {
                     if(var13 >= field3324) {
                        var15 = var8[var10][var13];
                        if(var15 != null && var15.field432) {
                           this.method5330(var15, true);
                        }
                     }

                     if(var14 < field3325) {
                        var15 = var8[var10][var14];
                        if(var15 != null && var15.field432) {
                           this.method5330(var15, true);
                        }
                     }
                  }

                  if(var16 < field3359) {
                     if(var13 >= field3324) {
                        var15 = var8[var16][var13];
                        if(var15 != null && var15.field432) {
                           this.method5330(var15, true);
                        }
                     }

                     if(var14 < field3325) {
                        var15 = var8[var16][var14];
                        if(var15 != null && var15.field432) {
                           this.method5330(var15, true);
                        }
                     }
                  }

                  if(field3330 == 0) {
                     field3362 = false;
                     return;
                  }
               }
            }
         }
      }

      for(var7 = this.field3307; var7 < this.field3322; ++var7) {
         var8 = this.field3310[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = var9 + field3321;
            var16 = field3321 - var9;
            if(var10 >= field3336 || var16 < field3359) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = var12 + field3327;
                  var14 = field3327 - var12;
                  if(var10 >= field3336) {
                     if(var13 >= field3324) {
                        var15 = var8[var10][var13];
                        if(var15 != null && var15.field432) {
                           this.method5330(var15, false);
                        }
                     }

                     if(var14 < field3325) {
                        var15 = var8[var10][var14];
                        if(var15 != null && var15.field432) {
                           this.method5330(var15, false);
                        }
                     }
                  }

                  if(var16 < field3359) {
                     if(var13 >= field3324) {
                        var15 = var8[var16][var13];
                        if(var15 != null && var15.field432) {
                           this.method5330(var15, false);
                        }
                     }

                     if(var14 < field3325) {
                        var15 = var8[var16][var14];
                        if(var15 != null && var15.field432) {
                           this.method5330(var15, false);
                        }
                     }
                  }

                  if(field3330 == 0) {
                     field3362 = false;
                     return;
                  }
               }
            }
         }
      }

      field3362 = false;
   }

   public Tile[][][] getTiles() {
      return this.field3310;
   }

   @ObfuscatedSignature(
      signature = "(IIIIIIIILdj;IZJI)Z"
   )
   public boolean copy$addEntityMarker(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class308 var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if(var15 < 0 || var16 < 0 || var15 >= this.field3306 || var16 >= this.field3308) {
               return false;
            }

            class56 var17 = this.field3310[var1][var15][var16];
            if(var17 != null && var17.field427 >= 5) {
               return false;
            }
         }
      }

      class299 var21 = new class299();
      var21.field3219 = var12;
      var21.field3221 = var14;
      var21.field3209 = var1;
      var21.field3216 = var6;
      var21.field3210 = var7;
      var21.field3208 = var8;
      var21.field3220 = var9;
      var21.field3212 = var10;
      var21.field3213 = var2;
      var21.field3215 = var3;
      var21.field3214 = var2 + var4 - 1;
      var21.field3222 = var3 + var5 - 1;

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
               if(this.field3310[var19][var16][var22] == null) {
                  this.field3310[var19][var16][var22] = new class56(var19, var16, var22);
               }
            }

            class56 var23 = this.field3310[var1][var16][var22];
            var23.field439[var23.field427] = var21;
            var23.gameObjectsChanged(var23.field427);
            var23.field417[var23.field427] = var18;
            var23.field418 |= var18;
            ++var23.field427;
         }
      }

      if(var11) {
         this.field3313[this.field3312++] = var21;
      }

      return true;
   }

   public RSGameObject[] getObjects() {
      return this.field3313;
   }

   public void drawTile(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      this.method5365(var1, var2, var3, var4, var5, var6);
   }

   @ObfuscatedName("au")
   public static boolean method5370() {
      return field3342 && field3319 != -1;
   }

   @ObfuscatedName("ar")
   static boolean method5367(int var0, int var1, int var2) {
      int var3 = var0 * field3334 + var2 * field3333 >> 16;
      int var4 = var2 * field3334 - var0 * field3333 >> 16;
      int var5 = var4 * field3332 + field3331 * var1 >> 16;
      int var6 = field3332 * var1 - var4 * field3331 >> 16;
      if(var5 >= 50 && var5 <= 3500) {
         int var7 = var3 * 128 / var5 + field3355;
         int var8 = var6 * 128 / var5 + field3364;
         return var7 >= field3368 && var7 <= field3370 && var8 >= field3369 && var8 <= field3371;
      } else {
         return false;
      }
   }

   @ObfuscatedName("be")
   static boolean method5376(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
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

   @ObfuscatedName("s")
   public static void method5334(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      class109 var8 = new class109();
      var8.field1007 = var2 / 128;
      var8.field1020 = var3 / 128;
      var8.field1009 = var4 / 128;
      var8.field1008 = var5 / 128;
      var8.field1013 = var1;
      var8.field1012 = var2;
      var8.field1014 = var3;
      var8.field1011 = var4;
      var8.field1010 = var5;
      var8.field1016 = var6;
      var8.field1015 = var7;
      field3347[var0][field3346[var0]++] = var8;
   }

   @ObfuscatedName("ak")
   static final int method5393(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   @ObfuscatedName("aj")
   public static void method5443() {
      field3319 = -1;
      field3342 = false;
   }

   @ObfuscatedName("ap")
   public static void method5378(int[] var0, int var1, int var2, int var3, int var4) {
      field3368 = 0;
      field3369 = 0;
      field3370 = var3;
      field3371 = var4;
      field3355 = var3 / 2;
      field3364 = var4 / 2;
      boolean[][][][] var5 = new boolean[var0.length][32][53][53];

      int var6;
      int var7;
      int var8;
      int var9;
      int var11;
      int var12;
      for(var6 = 128; var6 <= 383; var6 += 32) {
         for(var7 = 0; var7 < 2048; var7 += 64) {
            field3331 = class257.field2564[var6];
            client.onPitchSinChanged(-1);
            field3332 = class257.field2558[var6];
            client.onPitchCosChanged(-1);
            field3333 = class257.field2564[var7];
            field3334 = class257.field2558[var7];
            var8 = (var6 - 128) / 32;
            var9 = var7 / 64;

            for(int var10 = -26; var10 < 26; ++var10) {
               for(var11 = -26; var11 < 26; ++var11) {
                  var12 = var10 * 128;
                  int var13 = var11 * 128;
                  boolean var14 = false;

                  for(int var15 = -var1; var15 <= var2; var15 += 128) {
                     if(method5367(var12, var0[var8] + var15, var13)) {
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

                  field3356[var6][var7][var8 + 25][var9 + 25] = var16;
               }
            }
         }
      }

   }

   public static boolean shouldDraw(Object var0, boolean var1) {
      if(!client.isHidingEntities) {
         return true;
      } else {
         boolean var4;
         label90: {
            if(var0 instanceof RSPlayer) {
               boolean var2 = var1?client.hideLocalPlayer2D:client.hideLocalPlayer;
               boolean var3 = var1?client.hidePlayers2D:client.hidePlayers;
               var4 = var0 == class113.field1064.getLocalPlayer();
               if(var4) {
                  if(var2) {
                     break label90;
                  }
               } else if(var3) {
                  break label90;
               }
            } else {
               if(var0 instanceof RSNPC) {
                  RSNPC var6 = (RSNPC)var0;
                  if(!client.hideAttackers && var6.getInteracting() == class113.field1064.getLocalPlayer()) {
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
         return !client.hideAttackers && var5.getInteracting() == class113.field1064.getLocalPlayer()?true:!client.hideFriends && var5.isFriend() || !var4 && !client.hideClanMates && var5.isClanMember();
      }
   }

   @ObfuscatedSignature(
      signature = "(Lbn;IIIIII)V"
   )
   public static final void copy$draw2DExtras(class133 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var0 != null) {
         if(var6 != -1781715326) {
            return;
         }

         if(var0.vmethod4190()) {
            if(var0 instanceof class237) {
               class222 var7 = ((class237)var0).field2400;
               if(var7.field2168 != null) {
                  var7 = var7.method3970();
               }

               if(var7 == null) {
                  return;
               }
            }

            int var76 = class11.field90;
            int[] var8 = class11.field91;
            byte var9 = 0;
            if(var1 < var76 && var0.field1263 == client.field3744 && class318.method5585((class63)var0)) {
               class63 var10 = (class63)var0;
               if(var1 < var76) {
                  class323.method5725(var0, var0.field1258 + 15);
                  class207 var11 = (class207)client.field3784.get(class86.field775);
                  byte var12 = 9;
                  var11.method3590(var10.field577.method821(), var2 + client.field3831, var3 + client.field3832 - var12, 16777215, 0);
                  var9 = 18;
               }
            }

            int var77 = -2;
            int var16;
            int var23;
            int var24;
            if(!var0.field1284.method1063()) {
               class323.method5725(var0, var0.field1258 + 15);

               for(class189 var88 = (class189)var0.field1284.method1051(); var88 != null; var88 = (class189)var0.field1284.method1053()) {
                  class267 var78 = var88.method3242(client.field3744);
                  if(var78 == null) {
                     if(var88.method3243()) {
                        var88.method1186();
                     }
                  } else {
                     class14 var13 = var88.field1805;
                     class26 var14 = var13.method157();
                     class26 var15 = var13.method148();
                     int var17 = 0;
                     if(var14 != null && var15 != null) {
                        if(var13.field122 * 2 < var15.field202) {
                           var17 = var13.field122;
                        }

                        var16 = var15.field202 - var17 * 2;
                     } else {
                        var16 = var13.field124;
                     }

                     int var18 = 255;
                     boolean var19 = true;
                     int var20 = client.field3744 - var78.field2935;
                     int var21 = var16 * var78.field2934 / var13.field124;
                     int var22;
                     int var93;
                     if(var78.field2937 > var20) {
                        int var10000;
                        if(var13.field134 == 0) {
                           if(var6 != -1781715326) {
                              return;
                           }

                           var10000 = 0;
                        } else {
                           var10000 = var13.field134 * (var20 / var13.field134);
                        }

                        var22 = var10000;
                        var23 = var16 * var78.field2936 / var13.field124;
                        var93 = var22 * (var21 - var23) / var78.field2937 + var23;
                     } else {
                        var93 = var21;
                        var22 = var13.field130 + var78.field2937 - var20;
                        if(var13.field128 >= 0) {
                           var18 = (var22 << 8) / (var13.field130 - var13.field128);
                        }
                     }

                     if(var78.field2934 > 0 && var93 < 1) {
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

                           var22 = var14.field201;
                           var77 += var22;
                           var23 = var2 + client.field3831 - (var16 >> 1);
                           var24 = var3 + client.field3832 - var77;
                           var23 -= var17;
                           if(var18 >= 0 && var18 < 255) {
                              var14.method384(var23, var24, var18);
                              class89.method1552(var23, var24, var23 + var93, var24 + var22);
                              var15.method384(var23, var24, var18);
                           } else {
                              var14.method378(var23, var24);
                              class89.method1552(var23, var24, var23 + var93, var24 + var22);
                              var15.method378(var23, var24);
                           }

                           class89.method1532(var2, var3, var2 + var4, var3 + var5);
                           var77 += 2;
                           continue;
                        }
                     }

                     var77 += 5;
                     if(client.field3831 > -1) {
                        var22 = var2 + client.field3831 - (var16 >> 1);
                        var23 = var3 + client.field3832 - var77;
                        class89.method1561(var22, var23, var93, 5, 65280);
                        class89.method1561(var22 + var93, var23, var16 - var93, 5, 16711680);
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
               class63 var89 = (class63)var0;
               if(var89.field575) {
                  return;
               }

               label691: {
                  if(var89.field604 == -1) {
                     if(var6 != -1781715326) {
                        return;
                     }

                     if(var89.field578 == -1) {
                        break label691;
                     }
                  }

                  class323.method5725(var0, var0.field1258 + 15);
                  if(client.field3831 > -1) {
                     if(var89.field604 != -1) {
                        var77 += 25;
                        class247.field2471[var89.field604].method378(var2 + client.field3831 - 12, var3 + client.field3832 - var77);
                     }

                     if(var89.field578 != -1) {
                        var77 += 25;
                        class126.field1202[var89.field578].method378(var2 + client.field3831 - 12, var3 + client.field3832 - var77);
                     }
                  }
               }

               if(var1 >= 0 && client.field3752 == 10 && var8[var1] == client.field3799) {
                  if(var6 != -1781715326) {
                     return;
                  }

                  class323.method5725(var0, var0.field1258 + 15);
                  if(client.field3831 > -1) {
                     var77 += class131.field1253[1].field201;
                     class131.field1253[1].method378(var2 + client.field3831 - 12, var3 + client.field3832 - var77);
                  }
               }
            } else {
               class222 var90 = ((class237)var0).field2400;
               if(var90.field2168 != null) {
                  var90 = var90.method3970();
               }

               if(var90.field2166 >= 0) {
                  if(var6 != -1781715326) {
                     return;
                  }

                  if(var90.field2166 < class126.field1202.length) {
                     class323.method5725(var0, var0.field1258 + 15);
                     if(client.field3831 > -1) {
                        if(var6 != -1781715326) {
                           return;
                        }

                        class126.field1202[var90.field2166].method378(var2 + client.field3831 - 12, var3 + client.field3832 - 30);
                     }
                  }
               }

               if(client.field3752 == 1 && client.field3776[var1 - var76] == client.field3859) {
                  if(var6 != -1781715326) {
                     return;
                  }

                  if(client.field3744 % 20 < 10) {
                     class323.method5725(var0, var0.field1258 + 15);
                     if(client.field3831 > -1) {
                        class131.field1253[0].method378(var2 + client.field3831 - 12, var3 + client.field3832 - 28);
                     }
                  }
               }
            }

            if(var0.field1272 != null) {
               label684: {
                  if(var1 < var76) {
                     if(var0.field1274) {
                        break label684;
                     }

                     if(client.publicChatMode != 4) {
                        if(var0.field1269) {
                           break label684;
                        }

                        if(var6 != -1781715326) {
                           return;
                        }

                        if(client.publicChatMode != 0 && client.publicChatMode != 3) {
                           if(var6 != -1781715326) {
                              return;
                           }

                           if(client.publicChatMode != 1 || !((class63)var0).method1094()) {
                              break label684;
                           }
                        }
                     }
                  }

                  class323.method5725(var0, var0.field1258);
                  if(client.field3831 > -1) {
                     if(var6 != -1781715326) {
                        return;
                     }

                     if(client.field3819 < client.field3820) {
                        client.field3754[client.field3819] = class246.field2467.method3601(var0.field1272) / 2;
                        client.field3964[client.field3819] = class246.field2467.field2015;
                        client.field3821[client.field3819] = client.field3831;
                        client.field3852[client.field3819] = client.field3832;
                        client.field3825[client.field3819] = var0.field1266;
                        client.field3826[client.field3819] = var0.field1275;
                        client.field3925[client.field3819] = var0.field1268;
                        client.field3828[client.field3819] = var0.field1272;
                        ++client.field3819;
                     }
                  }
               }
            }

            for(int var79 = 0; var79 < 4; ++var79) {
               int var91 = var0.field1281[var79];
               int var80 = var0.field1287[var79];
               class231 var92 = null;
               int var81 = 0;
               if(var80 >= 0) {
                  if(var91 <= client.field3744) {
                     continue;
                  }

                  var92 = class296.method5157(var0.field1287[var79]);
                  var81 = var92.field2265;
                  if(var92 != null) {
                     if(var6 != -1781715326) {
                        return;
                     }

                     if(var92.field2269 != null) {
                        var92 = var92.method4150();
                        if(var92 == null) {
                           var0.field1281[var79] = -1;
                           continue;
                        }
                     }
                  }
               } else if(var91 < 0) {
                  continue;
               }

               var16 = var0.field1282[var79];
               class231 var82 = null;
               if(var16 >= 0) {
                  var82 = class296.method5157(var16);
                  if(var82 != null) {
                     if(var6 != -1781715326) {
                        return;
                     }

                     if(var82.field2269 != null) {
                        if(var6 != -1781715326) {
                           return;
                        }

                        var82 = var82.method4150();
                     }
                  }
               }

               if(var91 - var81 <= client.field3744) {
                  if(var92 == null) {
                     var0.field1281[var79] = -1;
                  } else {
                     class323.method5725(var0, var0.field1258 / 2);
                     if(client.field3831 > -1) {
                        if(var79 == 1) {
                           client.field3832 -= 20;
                        }

                        if(var79 == 2) {
                           client.field3831 -= 15;
                           client.field3832 -= 10;
                        }

                        if(var79 == 3) {
                           if(var6 != -1781715326) {
                              return;
                           }

                           client.field3831 += 15;
                           client.field3832 -= 10;
                        }

                        class26 var83 = null;
                        class26 var84 = null;
                        class26 var85 = null;
                        class26 var86 = null;
                        var23 = 0;
                        var24 = 0;
                        int var25 = 0;
                        int var26 = 0;
                        int var27 = 0;
                        int var28 = 0;
                        int var29 = 0;
                        int var30 = 0;
                        class26 var31 = null;
                        class26 var32 = null;
                        class26 var33 = null;
                        class26 var34 = null;
                        int var35 = 0;
                        int var36 = 0;
                        int var37 = 0;
                        int var38 = 0;
                        int var39 = 0;
                        int var40 = 0;
                        int var41 = 0;
                        int var42 = 0;
                        int var43 = 0;
                        var83 = var92.method4131();
                        int var44;
                        if(var83 != null) {
                           var23 = var83.field202;
                           var44 = var83.field201;
                           if(var44 > var43) {
                              var43 = var44;
                           }

                           var27 = var83.field204;
                        }

                        var84 = var92.method4126();
                        if(var84 != null) {
                           if(var6 != -1781715326) {
                              return;
                           }

                           var24 = var84.field202;
                           var44 = var84.field201;
                           if(var44 > var43) {
                              if(var6 != -1781715326) {
                                 return;
                              }

                              var43 = var44;
                           }

                           var28 = var84.field204;
                        }

                        var85 = var92.method4127();
                        if(var85 != null) {
                           var25 = var85.field202;
                           var44 = var85.field201;
                           if(var44 > var43) {
                              var43 = var44;
                           }

                           var29 = var85.field204;
                        }

                        var86 = var92.method4125();
                        if(var86 != null) {
                           var26 = var86.field202;
                           var44 = var86.field201;
                           if(var44 > var43) {
                              if(var6 != -1781715326) {
                                 return;
                              }

                              var43 = var44;
                           }

                           var30 = var86.field204;
                        }

                        if(var82 != null) {
                           var31 = var82.method4131();
                           if(var31 != null) {
                              var35 = var31.field202;
                              var44 = var31.field201;
                              if(var44 > var43) {
                                 var43 = var44;
                              }

                              var39 = var31.field204;
                           }

                           var32 = var82.method4126();
                           if(var32 != null) {
                              var36 = var32.field202;
                              var44 = var32.field201;
                              if(var44 > var43) {
                                 var43 = var44;
                              }

                              var40 = var32.field204;
                           }

                           var33 = var82.method4127();
                           if(var33 != null) {
                              var37 = var33.field202;
                              var44 = var33.field201;
                              if(var44 > var43) {
                                 var43 = var44;
                              }

                              var41 = var33.field204;
                           }

                           var34 = var82.method4125();
                           if(var34 != null) {
                              var38 = var34.field202;
                              var44 = var34.field201;
                              if(var44 > var43) {
                                 var43 = var44;
                              }

                              var42 = var34.field204;
                           }
                        }

                        class277 var87 = var92.method4137();
                        if(var87 == null) {
                           var87 = class272.field2981;
                        }

                        class277 var45;
                        if(var82 != null) {
                           if(var6 != -1781715326) {
                              return;
                           }

                           var45 = var82.method4137();
                           if(var45 == null) {
                              if(var6 != -1781715326) {
                                 return;
                              }

                              var45 = class272.field2981;
                           }
                        } else {
                           var45 = class272.field2981;
                        }

                        String var46 = null;
                        String var47 = null;
                        boolean var48 = false;
                        int var49 = 0;
                        var46 = var92.method4124(var0.field1291[var79]);
                        int var94 = var87.method3601(var46);
                        if(var82 != null) {
                           var47 = var82.method4124(var0.field1278[var79]);
                           var49 = var45.method3601(var47);
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

                        var63 = var0.field1281[var79] - client.field3744;
                        int var64 = var92.field2254 - var63 * var92.field2254 / var92.field2265;
                        int var65 = var63 * var92.field2271 / var92.field2265 + -var92.field2271;
                        int var66 = var64 + (var2 + client.field3831 - (var52 >> 1));
                        int var67 = var65 + (var3 + client.field3832 - 12);
                        int var68 = var67;
                        int var69 = var43 + var67;
                        int var70 = var67 + var92.field2275 + 15;
                        int var71 = var70 - var87.field2016;
                        int var72 = var70 + var87.field2017;
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
                           var73 = var67 + var82.field2275 + 15;
                           var74 = var73 - var45.field2016;
                           var75 = var73 + var45.field2017;
                           if(var74 < var68) {
                              ;
                           }

                           if(var75 > var69) {
                              ;
                           }
                        }

                        var74 = 255;
                        if(var92.field2272 >= 0) {
                           var74 = (var63 << 8) / (var92.field2265 - var92.field2272);
                        }

                        if(var74 >= 0 && var74 < 255) {
                           if(var83 != null) {
                              var83.method384(var66 + var53 - var27, var67, var74);
                           }

                           if(var85 != null) {
                              var85.method384(var54 + var66 - var29, var67, var74);
                           }

                           if(var84 != null) {
                              if(var6 != -1781715326) {
                                 return;
                              }

                              for(var75 = 0; var75 < var50; ++var75) {
                                 var84.method384(var24 * var75 + (var66 + var55 - var28), var67, var74);
                              }
                           }

                           if(var86 != null) {
                              var86.method384(var66 + var57 - var30, var67, var74);
                           }

                           var87.method3526(var46, var66 + var56, var70, var92.field2270, 0, var74);
                           if(var82 != null) {
                              if(var31 != null) {
                                 var31.method384(var66 + var58 - var39, var67, var74);
                              }

                              if(var33 != null) {
                                 var33.method384(var59 + var66 - var41, var67, var74);
                              }

                              if(var32 != null) {
                                 if(var6 != -1781715326) {
                                    return;
                                 }

                                 for(var75 = 0; var75 < var51; ++var75) {
                                    var32.method384(var75 * var36 + (var60 + var66 - var40), var67, var74);
                                 }
                              }

                              if(var34 != null) {
                                 var34.method384(var66 + var61 - var42, var67, var74);
                              }

                              var45.method3526(var47, var66 + var62, var73, var82.field2270, 0, var74);
                           }
                        } else {
                           if(var83 != null) {
                              var83.method378(var53 + var66 - var27, var67);
                           }

                           if(var85 != null) {
                              var85.method378(var54 + var66 - var29, var67);
                           }

                           if(var84 != null) {
                              for(var75 = 0; var75 < var50; ++var75) {
                                 var84.method378(var75 * var24 + (var55 + var66 - var28), var67);
                              }
                           }

                           if(var86 != null) {
                              var86.method378(var57 + var66 - var30, var67);
                           }

                           var87.method3543(var46, var66 + var56, var70, var92.field2270 | -16777216, 0);
                           if(var82 != null) {
                              if(var31 != null) {
                                 var31.method378(var66 + var58 - var39, var67);
                              }

                              if(var33 != null) {
                                 if(var6 != -1781715326) {
                                    return;
                                 }

                                 var33.method378(var66 + var59 - var41, var67);
                              }

                              if(var32 != null) {
                                 if(var6 != -1781715326) {
                                    return;
                                 }

                                 for(var75 = 0; var75 < var51; ++var75) {
                                    var32.method378(var36 * var75 + (var60 + var66 - var40), var67);
                                 }
                              }

                              if(var34 != null) {
                                 var34.method378(var61 + var66 - var42, var67);
                              }

                              var45.method3543(var47, var66 + var62, var73, var82.field2270 | -16777216, 0);
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
}
