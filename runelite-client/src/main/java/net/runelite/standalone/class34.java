package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSModelData;

@ObfuscatedName("db")
public class class34 extends class102 implements RSModelData {
   @ObfuscatedName("ax")
   static int[] field345;
   @ObfuscatedName("ao")
   static int[] field350;
   @ObfuscatedName("as")
   static int[] field346;
   @ObfuscatedName("ad")
   static int field348;
   @ObfuscatedName("al")
   static int[] field347;
   @ObfuscatedName("af")
   public short field339;
   @ObfuscatedName("j")
   int field335;
   @ObfuscatedName("k")
   int[][] field344;
   @ObfuscatedName("ag")
   public short field338;
   @ObfuscatedName("ac")
   int field342;
   @ObfuscatedName("z")
   byte[] field322;
   @ObfuscatedName("p")
   int[] field318;
   @ObfuscatedName("i")
   int[][] field333;
   @ObfuscatedName("aa")
   int field323;
   @ObfuscatedName("c")
   int[] field325;
   @ObfuscatedName("n")
   short[] field330;
   @ObfuscatedName("aw")
   int field326;
   @ObfuscatedName("l")
   int[] field336;
   @ObfuscatedName("s")
   int[] field314;
   @ObfuscatedName("f")
   int field312;
   @ObfuscatedName("h")
   int[] field334;
   @ObfuscatedName("r")
   byte[] field319;
   @ObfuscatedName("u")
   short[] field328;
   @ObfuscatedName("m")
   byte[] field320;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "[Ldi;"
   )
   class304[] field321;
   @ObfuscatedName("b")
   byte[] field327;
   public float[][] faceTextureUCoordinates;
   public float[][] faceTextureVCoordinates;
   @ObfuscatedName("x")
   short[] field311;
   @ObfuscatedName("v")
   short[] field324;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "[Ldi;"
   )
   class304[] field337;
   @ObfuscatedName("at")
   int field341;
   @ObfuscatedName("d")
   byte[] field315;
   @ObfuscatedName("a")
   int[] field316;
   @ObfuscatedName("am")
   int field317;
   @ObfuscatedName("o")
   int[] field349;
   @ObfuscatedName("g")
   byte field343;
   @ObfuscatedName("t")
   short[] field329;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "[Ley;"
   )
   class64[] field331;
   @ObfuscatedName("e")
   int field332;
   @ObfuscatedName("az")
   boolean field340;
   @ObfuscatedName("w")
   int[] field313;

   static {
      field346 = new int[10000];
      field347 = new int[10000];
      field348 = 0;
      field345 = class211.field2920;
      field350 = class211.field2914;
   }

   class34() {
      this.field312 = 0;
      this.field332 = 0;
      this.field343 = 0;
      this.field340 = false;
   }

   @ObfuscatedSignature(
      signature = "([Ldb;I)V"
   )
   public class34(class34[] var1, int var2) {
      this.field312 = 0;
      this.field332 = 0;
      this.field343 = 0;
      this.field340 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      this.field312 = 0;
      this.field332 = 0;
      this.field335 = 0;
      this.field343 = -1;

      int var9;
      class34 var10;
      for(var9 = 0; var9 < var2; ++var9) {
         var10 = var1[var9];
         if(var10 != null) {
            this.field312 += var10.field312;
            this.field332 += var10.field332;
            this.field335 += var10.field335;
            if(var10.field320 != null) {
               var4 = true;
            } else {
               if(this.field343 == -1) {
                  this.field343 = var10.field343;
               }

               if(this.field343 != var10.field343) {
                  var4 = true;
               }
            }

            var3 |= var10.field319 != null;
            var5 |= var10.field315 != null;
            var6 |= var10.field349 != null;
            var7 |= var10.field324 != null;
            var8 |= var10.field322 != null;
         }
      }

      this.field336 = new int[this.field312];
      this.field313 = new int[this.field312];
      this.field314 = new int[this.field312];
      this.field334 = new int[this.field312];
      this.field316 = new int[this.field332];
      this.field325 = new int[this.field332];
      this.field318 = new int[this.field332];
      if(var3) {
         this.field319 = new byte[this.field332];
      }

      if(var4) {
         this.field320 = new byte[this.field332];
      }

      if(var5) {
         this.field315 = new byte[this.field332];
      }

      if(var6) {
         this.field349 = new int[this.field332];
      }

      if(var7) {
         this.field324 = new short[this.field332];
      }

      if(var8) {
         this.field322 = new byte[this.field332];
      }

      this.field311 = new short[this.field332];
      if(this.field335 > 0) {
         this.field327 = new byte[this.field335];
         this.field328 = new short[this.field335];
         this.field329 = new short[this.field335];
         this.field330 = new short[this.field335];
      }

      this.field312 = 0;
      this.field332 = 0;
      this.field335 = 0;

      for(var9 = 0; var9 < var2; ++var9) {
         var10 = var1[var9];
         if(var10 != null) {
            int var11;
            for(var11 = 0; var11 < var10.field332; ++var11) {
               if(var3 && var10.field319 != null) {
                  this.field319[this.field332] = var10.field319[var11];
               }

               if(var4) {
                  if(var10.field320 != null) {
                     this.field320[this.field332] = var10.field320[var11];
                  } else {
                     this.field320[this.field332] = var10.field343;
                  }
               }

               if(var5 && var10.field315 != null) {
                  this.field315[this.field332] = var10.field315[var11];
               }

               if(var6 && var10.field349 != null) {
                  this.field349[this.field332] = var10.field349[var11];
               }

               if(var7) {
                  if(var10.field324 != null) {
                     this.field324[this.field332] = var10.field324[var11];
                  } else {
                     this.field324[this.field332] = -1;
                  }
               }

               if(var8) {
                  if(var10.field322 != null && var10.field322[var11] != -1) {
                     this.field322[this.field332] = (byte)(this.field335 + var10.field322[var11]);
                  } else {
                     this.field322[this.field332] = -1;
                  }
               }

               this.field311[this.field332] = var10.field311[var11];
               this.field316[this.field332] = this.method578(var10, var10.field316[var11]);
               this.field325[this.field332] = this.method578(var10, var10.field325[var11]);
               this.field318[this.field332] = this.method578(var10, var10.field318[var11]);
               ++this.field332;
            }

            for(var11 = 0; var11 < var10.field335; ++var11) {
               byte var12 = this.field327[this.field335] = var10.field327[var11];
               if(var12 == 0) {
                  this.field328[this.field335] = (short)this.method578(var10, var10.field328[var11]);
                  this.field329[this.field335] = (short)this.method578(var10, var10.field329[var11]);
                  this.field330[this.field335] = (short)this.method578(var10, var10.field330[var11]);
               }

               ++this.field335;
            }
         }
      }

   }

   class34(byte[] var1) {
      this.field312 = 0;
      this.field332 = 0;
      this.field343 = 0;
      this.field340 = false;
      if(var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         this.method570(var1);
      } else {
         this.method542(var1);
      }

   }

   @ObfuscatedSignature(
      signature = "(Ldb;ZZZZ)V",
      garbageValue = "1"
   )
   public class34(class34 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.field312 = 0;
      this.field332 = 0;
      this.field343 = 0;
      this.field340 = false;
      this.field312 = var1.field312;
      this.field332 = var1.field332;
      this.field335 = var1.field335;
      int var6;
      if(var2) {
         this.field336 = var1.field336;
         this.field313 = var1.field313;
         this.field314 = var1.field314;
      } else {
         this.field336 = new int[this.field312];
         this.field313 = new int[this.field312];
         this.field314 = new int[this.field312];

         for(var6 = 0; var6 < this.field312; ++var6) {
            this.field336[var6] = var1.field336[var6];
            this.field313[var6] = var1.field313[var6];
            this.field314[var6] = var1.field314[var6];
         }
      }

      if(var3) {
         this.field311 = var1.field311;
      } else {
         this.field311 = new short[this.field332];

         for(var6 = 0; var6 < this.field332; ++var6) {
            this.field311[var6] = var1.field311[var6];
         }
      }

      if(!var4 && var1.field324 != null) {
         this.field324 = new short[this.field332];

         for(var6 = 0; var6 < this.field332; ++var6) {
            this.field324[var6] = var1.field324[var6];
         }
      } else {
         this.field324 = var1.field324;
      }

      this.field315 = var1.field315;
      this.field316 = var1.field316;
      this.field325 = var1.field325;
      this.field318 = var1.field318;
      this.field319 = var1.field319;
      this.field320 = var1.field320;
      this.field322 = var1.field322;
      this.field343 = var1.field343;
      this.field327 = var1.field327;
      this.field328 = var1.field328;
      this.field329 = var1.field329;
      this.field330 = var1.field330;
      this.field334 = var1.field334;
      this.field349 = var1.field349;
      this.field333 = var1.field333;
      this.field344 = var1.field344;
      this.field321 = var1.field321;
      this.field331 = var1.field331;
      this.field337 = var1.field337;
      this.field338 = var1.field338;
      this.field339 = var1.field339;
   }

   @ObfuscatedName("k")
   public void method556() {
      if(this.field321 == null) {
         this.field321 = new class304[this.field312];

         int var1;
         for(var1 = 0; var1 < this.field312; ++var1) {
            this.field321[var1] = new class304();
         }

         for(var1 = 0; var1 < this.field332; ++var1) {
            int var2 = this.field316[var1];
            int var3 = this.field325[var1];
            int var4 = this.field318[var1];
            int var5 = this.field336[var3] - this.field336[var2];
            int var6 = this.field313[var3] - this.field313[var2];
            int var7 = this.field314[var3] - this.field314[var2];
            int var8 = this.field336[var4] - this.field336[var2];
            int var9 = this.field313[var4] - this.field313[var2];
            int var10 = this.field314[var4] - this.field314[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if(var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if(this.field319 == null) {
               var15 = 0;
            } else {
               var15 = this.field319[var1];
            }

            if(var15 == 0) {
               class304 var16 = this.field321[var2];
               var16.field3765 += var11;
               var16.field3766 += var12;
               var16.field3770 += var13;
               ++var16.field3768;
               var16 = this.field321[var3];
               var16.field3765 += var11;
               var16.field3766 += var12;
               var16.field3770 += var13;
               ++var16.field3768;
               var16 = this.field321[var4];
               var16.field3765 += var11;
               var16.field3766 += var12;
               var16.field3770 += var13;
               ++var16.field3768;
            } else if(var15 == 1) {
               if(this.field331 == null) {
                  this.field331 = new class64[this.field332];
               }

               class64 var17 = this.field331[var1] = new class64();
               var17.field744 = var11;
               var17.field743 = var12;
               var17.field745 = var13;
            }
         }

      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(IIIII)Lds;"
   )
   public final class52 method573(int var1, int var2, int var3, int var4, int var5) {
      class302.field3755.getLogger().debug("Lighting model {}", this);
      class52 var6 = this.copy$light(var1, var2, var3, var4, var5);
      if(var6 == null) {
         return null;
      } else {
         if(this.faceTextureUCoordinates == null) {
            this.computeTextureUVCoordinates();
         }

         RSModel var7 = (RSModel)var6;
         var7.setFaceTextureUCoordinates(this.faceTextureUCoordinates);
         var7.setFaceTextureVCoordinates(this.faceTextureVCoordinates);
         return var6;
      }
   }

   @ObfuscatedName("z")
   public void method549() {
      for(int var1 = 0; var1 < this.field312; ++var1) {
         int var2 = this.field314[var1];
         this.field314[var1] = this.field336[var1];
         this.field336[var1] = -var2;
      }

      this.method557();
   }

   @ObfuscatedName("p")
   void method546() {
      int[] var1;
      int var2;
      int var3;
      int var4;
      if(this.field334 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field312; ++var3) {
            var4 = this.field334[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.field333 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field333[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field312; this.field333[var4][var1[var4]++] = var3++) {
            var4 = this.field334[var3];
         }

         this.field334 = null;
      }

      if(this.field349 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field332; ++var3) {
            var4 = this.field349[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.field344 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field344[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field332; this.field344[var4][var1[var4]++] = var3++) {
            var4 = this.field349[var3];
         }

         this.field349 = null;
      }

   }

   @ObfuscatedName("i")
   public void method555(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field312; ++var4) {
         this.field336[var4] = this.field336[var4] * var1 / 128;
         this.field313[var4] = var2 * this.field313[var4] / 128;
         this.field314[var4] = var3 * this.field314[var4] / 128;
      }

      this.method557();
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "([[IIIIZI)Ldb;"
   )
   public class34 method545(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method558();
      int var7 = var2 + this.field342;
      int var8 = var2 + this.field317;
      int var9 = var4 + this.field323;
      int var10 = var4 + this.field326;
      if(var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if(var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
            return this;
         } else {
            class34 var11 = new class34();
            var11.field312 = this.field312;
            var11.field332 = this.field332;
            var11.field335 = this.field335;
            var11.field336 = this.field336;
            var11.field314 = this.field314;
            var11.field316 = this.field316;
            var11.field325 = this.field325;
            var11.field318 = this.field318;
            var11.field319 = this.field319;
            var11.field320 = this.field320;
            var11.field315 = this.field315;
            var11.field322 = this.field322;
            var11.field311 = this.field311;
            var11.field324 = this.field324;
            var11.field343 = this.field343;
            var11.field327 = this.field327;
            var11.field328 = this.field328;
            var11.field329 = this.field329;
            var11.field330 = this.field330;
            var11.field334 = this.field334;
            var11.field349 = this.field349;
            var11.field333 = this.field333;
            var11.field344 = this.field344;
            var11.field338 = this.field338;
            var11.field339 = this.field339;
            var11.field313 = new int[var11.field312];
            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if(var6 == 0) {
               for(var12 = 0; var12 < var11.field312; ++var12) {
                  var13 = var2 + this.field336[var12];
                  var14 = var4 + this.field314[var12];
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field313[var12] = var21 + this.field313[var12] - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field312; ++var12) {
                  var13 = (-this.field313[var12] << 16) / super.field1143;
                  if(var13 < var6) {
                     var14 = var2 + this.field336[var12];
                     var15 = var4 + this.field314[var12];
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field313[var12] = (var6 - var13) * (var22 - var3) / var6 + this.field313[var12];
                  }
               }
            }

            var11.method557();
            return var11;
         }
      } else {
         return this;
      }
   }

   @ObfuscatedName("l")
   void method570(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var2.position = var1.length - 23;
      int var9 = var2.readUnsignedShort();
      int var10 = var2.readUnsignedShort();
      int var11 = var2.readUnsignedByte();
      int var12 = var2.readUnsignedByte();
      int var13 = var2.readUnsignedByte();
      int var14 = var2.readUnsignedByte();
      int var15 = var2.readUnsignedByte();
      int var16 = var2.readUnsignedByte();
      int var17 = var2.readUnsignedByte();
      int var18 = var2.readUnsignedShort();
      int var19 = var2.readUnsignedShort();
      int var20 = var2.readUnsignedShort();
      int var21 = var2.readUnsignedShort();
      int var22 = var2.readUnsignedShort();
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if(var11 > 0) {
         this.field327 = new byte[var11];
         var2.position = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.field327[var26] = var2.method2257();
            if(var27 == 0) {
               ++var23;
            }

            if(var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if(var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if(var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if(var13 == 255) {
         var26 += var10;
      }

      int var31 = var26;
      if(var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if(var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if(var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if(var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.field312 = var9;
      this.field332 = var10;
      this.field335 = var11;
      this.field336 = new int[var9];
      this.field313 = new int[var9];
      this.field314 = new int[var9];
      this.field316 = new int[var10];
      this.field325 = new int[var10];
      this.field318 = new int[var10];
      if(var17 == 1) {
         this.field334 = new int[var9];
      }

      if(var12 == 1) {
         this.field319 = new byte[var10];
      }

      if(var13 == 255) {
         this.field320 = new byte[var10];
      } else {
         this.field343 = (byte)var13;
      }

      if(var14 == 1) {
         this.field315 = new byte[var10];
      }

      if(var15 == 1) {
         this.field349 = new int[var10];
      }

      if(var16 == 1) {
         this.field324 = new short[var10];
      }

      if(var16 == 1 && var11 > 0) {
         this.field322 = new byte[var10];
      }

      this.field311 = new short[var10];
      if(var11 > 0) {
         this.field328 = new short[var11];
         this.field329 = new short[var11];
         this.field330 = new short[var11];
      }

      var2.position = var11;
      var3.position = var38;
      var4.position = var39;
      var5.position = var40;
      var6.position = var32;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.readUnsignedByte();
         var53 = 0;
         if((var52 & 1) != 0) {
            var53 = var3.method2339();
         }

         var54 = 0;
         if((var52 & 2) != 0) {
            var54 = var4.method2339();
         }

         var55 = 0;
         if((var52 & 4) != 0) {
            var55 = var5.method2339();
         }

         this.field336[var51] = var48 + var53;
         this.field313[var51] = var49 + var54;
         this.field314[var51] = var50 + var55;
         var48 = this.field336[var51];
         var49 = this.field313[var51];
         var50 = this.field314[var51];
         if(var17 == 1) {
            this.field334[var51] = var6.readUnsignedByte();
         }
      }

      var2.position = var37;
      var3.position = var28;
      var4.position = var30;
      var5.position = var33;
      var6.position = var31;
      var7.position = var35;
      var8.position = var36;

      for(var51 = 0; var51 < var10; ++var51) {
         this.field311[var51] = (short)var2.readUnsignedShort();
         if(var12 == 1) {
            this.field319[var51] = var3.method2257();
         }

         if(var13 == 255) {
            this.field320[var51] = var4.method2257();
         }

         if(var14 == 1) {
            this.field315[var51] = var5.method2257();
         }

         if(var15 == 1) {
            this.field349[var51] = var6.readUnsignedByte();
         }

         if(var16 == 1) {
            this.field324[var51] = (short)(var7.readUnsignedShort() - 1);
         }

         if(this.field322 != null && this.field324[var51] != -1) {
            this.field322[var51] = (byte)(var8.readUnsignedByte() - 1);
         }
      }

      var2.position = var34;
      var3.position = var29;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.readUnsignedByte();
         if(var56 == 1) {
            var51 = var2.method2339() + var54;
            var52 = var2.method2339() + var51;
            var53 = var2.method2339() + var52;
            var54 = var53;
            this.field316[var55] = var51;
            this.field325[var55] = var52;
            this.field318[var55] = var53;
         }

         if(var56 == 2) {
            var52 = var53;
            var53 = var2.method2339() + var54;
            var54 = var53;
            this.field316[var55] = var51;
            this.field325[var55] = var52;
            this.field318[var55] = var53;
         }

         if(var56 == 3) {
            var51 = var53;
            var53 = var2.method2339() + var54;
            var54 = var53;
            this.field316[var55] = var51;
            this.field325[var55] = var52;
            this.field318[var55] = var53;
         }

         if(var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.method2339() + var54;
            var54 = var53;
            this.field316[var55] = var51;
            this.field325[var55] = var57;
            this.field318[var55] = var53;
         }
      }

      var2.position = var41;
      var3.position = var42;
      var4.position = var43;
      var5.position = var44;
      var6.position = var45;
      var7.position = var46;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.field327[var55] & 255;
         if(var56 == 0) {
            this.field328[var55] = (short)var2.readUnsignedShort();
            this.field329[var55] = (short)var2.readUnsignedShort();
            this.field330[var55] = (short)var2.readUnsignedShort();
         }
      }

      var2.position = var26;
      var55 = var2.readUnsignedByte();
      if(var55 != 0) {
         new class226();
         var2.readUnsignedShort();
         var2.readUnsignedShort();
         var2.readUnsignedShort();
         var2.readInt();
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ldb;I)I"
   )
   final int method578(class34 var1, int var2) {
      int var3 = -1;
      int var4 = var1.field336[var2];
      int var5 = var1.field313[var2];
      int var6 = var1.field314[var2];

      for(int var7 = 0; var7 < this.field312; ++var7) {
         if(var4 == this.field336[var7] && var5 == this.field313[var7] && var6 == this.field314[var7]) {
            var3 = var7;
            break;
         }
      }

      if(var3 == -1) {
         this.field336[this.field312] = var4;
         this.field313[this.field312] = var5;
         this.field314[this.field312] = var6;
         if(var1.field334 != null) {
            this.field334[this.field312] = var1.field334[var2];
         }

         var3 = this.field312++;
      }

      return var3;
   }

   @ObfuscatedName("r")
   public void method547() {
      for(int var1 = 0; var1 < this.field312; ++var1) {
         int var2 = this.field336[var1];
         this.field336[var1] = this.field314[var1];
         this.field314[var1] = -var2;
      }

      this.method557();
   }

   @ObfuscatedName("u")
   public void method553(short var1, short var2) {
      if(this.field324 != null) {
         for(int var3 = 0; var3 < this.field332; ++var3) {
            if(this.field324[var3] == var1) {
               this.field324[var3] = var2;
            }
         }

      }
   }

   @ObfuscatedName("y")
   void method558() {
      if(!this.field340) {
         super.field1143 = 0;
         this.field341 = 0;
         this.field342 = 999999;
         this.field317 = -999999;
         this.field326 = -99999;
         this.field323 = 99999;

         for(int var1 = 0; var1 < this.field312; ++var1) {
            int var2 = this.field336[var1];
            int var3 = this.field313[var1];
            int var4 = this.field314[var1];
            if(var2 < this.field342) {
               this.field342 = var2;
            }

            if(var2 > this.field317) {
               this.field317 = var2;
            }

            if(var4 < this.field323) {
               this.field323 = var4;
            }

            if(var4 > this.field326) {
               this.field326 = var4;
            }

            if(-var3 > super.field1143) {
               super.field1143 = -var3;
            }

            if(var3 > this.field341) {
               this.field341 = var3;
            }
         }

         this.field340 = true;
      }
   }

   public short[] getFaceTextures() {
      return this.field324;
   }

   public int[] getVertexX() {
      return this.field336;
   }

   @ObfuscatedSignature(
      signature = "(IIIII)Lds;"
   )
   public final class52 copy$light(int var1, int var2, int var3, int var4, int var5) {
      this.method556();
      int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3 + var4 * var4));
      int var7 = var6 * var2 >> 8;
      class52 var8 = new class52();
      var8.field589 = new int[this.field332];
      var8.field590 = new int[this.field332];
      var8.field577 = new int[this.field332];
      if(this.field335 > 0 && this.field322 != null) {
         int[] var9 = new int[this.field335];

         int var10;
         for(var10 = 0; var10 < this.field332; ++var10) {
            if(this.field322[var10] != -1) {
               ++var9[this.field322[var10] & 255];
            }
         }

         var8.field591 = 0;

         for(var10 = 0; var10 < this.field335; ++var10) {
            if(var9[var10] > 0 && this.field327[var10] == 0) {
               ++var8.field591;
            }
         }

         var8.field612 = new int[var8.field591];
         var8.field597 = new int[var8.field591];
         var8.field600 = new int[var8.field591];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.field335; ++var11) {
            if(var9[var11] > 0 && this.field327[var11] == 0) {
               var8.field612[var10] = this.field328[var11] & '\uffff';
               var8.field597[var10] = this.field329[var11] & '\uffff';
               var8.field600[var10] = this.field330[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.field594 = new byte[this.field332];

         for(var11 = 0; var11 < this.field332; ++var11) {
            if(this.field322[var11] != -1) {
               var8.field594[var11] = (byte)var9[this.field322[var11] & 255];
            } else {
               var8.field594[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.field332; ++var16) {
         byte var17;
         if(this.field319 == null) {
            var17 = 0;
         } else {
            var17 = this.field319[var16];
         }

         byte var18;
         if(this.field315 == null) {
            var18 = 0;
         } else {
            var18 = this.field315[var16];
         }

         short var12;
         if(this.field324 == null) {
            var12 = -1;
         } else {
            var12 = this.field324[var16];
         }

         if(var18 == -2) {
            var17 = 3;
         }

         if(var18 == -1) {
            var17 = 2;
         }

         class304 var13;
         int var14;
         class64 var19;
         if(var12 == -1) {
            if(var17 != 0) {
               if(var17 == 1) {
                  var19 = this.field331[var16];
                  var14 = (var4 * var19.field743 + var5 * var19.field745 + var3 * var19.field744) / (var7 / 2 + var7) + var1;
                  var8.field589[var16] = method611(this.field311[var16] & '\uffff', var14);
                  var8.field577[var16] = -1;
               } else if(var17 == 3) {
                  var8.field589[var16] = 128;
                  var8.field577[var16] = -1;
               } else {
                  var8.field577[var16] = -2;
               }
            } else {
               int var15 = this.field311[var16] & '\uffff';
               if(this.field337 != null && this.field337[this.field316[var16]] != null) {
                  var13 = this.field337[this.field316[var16]];
               } else {
                  var13 = this.field321[this.field316[var16]];
               }

               var14 = (var4 * var13.field3766 + var5 * var13.field3770 + var3 * var13.field3765) / (var7 * var13.field3768) + var1;
               var8.field589[var16] = method611(var15, var14);
               if(this.field337 != null && this.field337[this.field325[var16]] != null) {
                  var13 = this.field337[this.field325[var16]];
               } else {
                  var13 = this.field321[this.field325[var16]];
               }

               var14 = (var4 * var13.field3766 + var5 * var13.field3770 + var3 * var13.field3765) / (var7 * var13.field3768) + var1;
               var8.field590[var16] = method611(var15, var14);
               if(this.field337 != null && this.field337[this.field318[var16]] != null) {
                  var13 = this.field337[this.field318[var16]];
               } else {
                  var13 = this.field321[this.field318[var16]];
               }

               var14 = (var4 * var13.field3766 + var5 * var13.field3770 + var3 * var13.field3765) / (var7 * var13.field3768) + var1;
               var8.field577[var16] = method611(var15, var14);
            }
         } else if(var17 != 0) {
            if(var17 == 1) {
               var19 = this.field331[var16];
               var14 = (var4 * var19.field743 + var5 * var19.field745 + var3 * var19.field744) / (var7 / 2 + var7) + var1;
               var8.field589[var16] = method617(var14);
               var8.field577[var16] = -1;
            } else {
               var8.field577[var16] = -2;
            }
         } else {
            if(this.field337 != null && this.field337[this.field316[var16]] != null) {
               var13 = this.field337[this.field316[var16]];
            } else {
               var13 = this.field321[this.field316[var16]];
            }

            var14 = (var4 * var13.field3766 + var5 * var13.field3770 + var3 * var13.field3765) / (var7 * var13.field3768) + var1;
            var8.field589[var16] = method617(var14);
            if(this.field337 != null && this.field337[this.field325[var16]] != null) {
               var13 = this.field337[this.field325[var16]];
            } else {
               var13 = this.field321[this.field325[var16]];
            }

            var14 = (var4 * var13.field3766 + var5 * var13.field3770 + var3 * var13.field3765) / (var7 * var13.field3768) + var1;
            var8.field590[var16] = method617(var14);
            if(this.field337 != null && this.field337[this.field318[var16]] != null) {
               var13 = this.field337[this.field318[var16]];
            } else {
               var13 = this.field321[this.field318[var16]];
            }

            var14 = (var4 * var13.field3766 + var5 * var13.field3770 + var3 * var13.field3765) / (var7 * var13.field3768) + var1;
            var8.field577[var16] = method617(var14);
         }
      }

      this.method546();
      var8.field644 = this.field312;
      var8.field582 = this.field336;
      var8.field645 = this.field313;
      var8.field584 = this.field314;
      var8.field585 = this.field332;
      var8.field586 = this.field316;
      var8.field624 = this.field325;
      var8.field588 = this.field318;
      var8.field623 = this.field320;
      var8.field593 = this.field315;
      var8.field596 = this.field343;
      var8.field627 = this.field333;
      var8.field602 = this.field344;
      var8.field595 = this.field324;
      return var8;
   }

   public int[] getVertexY() {
      return this.field313;
   }

   public int[] getVertexZ() {
      return this.field314;
   }

   public void computeTextureUVCoordinates() {
      short[] var1 = this.getFaceTextures();
      if(var1 != null) {
         int[] var2 = this.getVertexX();
         int[] var3 = this.getVertexY();
         int[] var4 = this.getVertexZ();
         int[] var5 = this.getTrianglePointsX();
         int[] var6 = this.getTrianglePointsY();
         int[] var7 = this.getTrianglePointsZ();
         short[] var8 = this.getTexTriangleX();
         short[] var9 = this.getTexTriangleY();
         short[] var10 = this.getTexTriangleZ();
         byte[] var11 = this.getTextureCoords();
         byte[] var12 = this.getTextureRenderTypes();
         int var13 = this.getTriangleFaceCount();
         this.faceTextureUCoordinates = new float[var13][];
         this.faceTextureVCoordinates = new float[var13][];

         for(int var14 = 0; var14 < var13; ++var14) {
            byte var15;
            if(var11 == null) {
               var15 = -1;
            } else {
               var15 = var11[var14];
            }

            short var16 = var1[var14];
            if(var16 != -1) {
               float[] var17 = new float[3];
               float[] var18 = new float[3];
               if(var15 == -1) {
                  var17[0] = 0.0F;
                  var18[0] = 1.0F;
                  var17[1] = 1.0F;
                  var18[1] = 1.0F;
                  var17[2] = 0.0F;
                  var18[2] = 0.0F;
               } else {
                  int var51 = var15 & 255;
                  byte var19 = 0;
                  if(var12 != null) {
                     var19 = var12[var51];
                  }

                  if(var19 == 0) {
                     int var20 = var5[var14];
                     int var21 = var6[var14];
                     int var22 = var7[var14];
                     short var23 = var8[var51];
                     short var24 = var9[var51];
                     short var25 = var10[var51];
                     float var26 = (float)var2[var23];
                     float var27 = (float)var3[var23];
                     float var28 = (float)var4[var23];
                     float var29 = (float)var2[var24] - var26;
                     float var30 = (float)var3[var24] - var27;
                     float var31 = (float)var4[var24] - var28;
                     float var32 = (float)var2[var25] - var26;
                     float var33 = (float)var3[var25] - var27;
                     float var34 = (float)var4[var25] - var28;
                     float var35 = (float)var2[var20] - var26;
                     float var36 = (float)var3[var20] - var27;
                     float var37 = (float)var4[var20] - var28;
                     float var38 = (float)var2[var21] - var26;
                     float var39 = (float)var3[var21] - var27;
                     float var40 = (float)var4[var21] - var28;
                     float var41 = (float)var2[var22] - var26;
                     float var42 = (float)var3[var22] - var27;
                     float var43 = (float)var4[var22] - var28;
                     float var44 = var30 * var34 - var31 * var33;
                     float var45 = var31 * var32 - var29 * var34;
                     float var46 = var29 * var33 - var30 * var32;
                     float var47 = var33 * var46 - var34 * var45;
                     float var48 = var34 * var44 - var32 * var46;
                     float var49 = var32 * var45 - var33 * var44;
                     float var50 = 1.0F / (var47 * var29 + var48 * var30 + var49 * var31);
                     var17[0] = (var47 * var35 + var48 * var36 + var49 * var37) * var50;
                     var17[1] = (var47 * var38 + var48 * var39 + var49 * var40) * var50;
                     var17[2] = (var47 * var41 + var48 * var42 + var49 * var43) * var50;
                     var47 = var30 * var46 - var31 * var45;
                     var48 = var31 * var44 - var29 * var46;
                     var49 = var29 * var45 - var30 * var44;
                     var50 = 1.0F / (var47 * var32 + var48 * var33 + var49 * var34);
                     var18[0] = (var47 * var35 + var48 * var36 + var49 * var37) * var50;
                     var18[1] = (var47 * var38 + var48 * var39 + var49 * var40) * var50;
                     var18[2] = (var47 * var41 + var48 * var42 + var49 * var43) * var50;
                  }
               }

               this.faceTextureUCoordinates[var14] = var17;
               this.faceTextureVCoordinates[var14] = var18;
            }
         }

      }
   }

   public int[] getTrianglePointsX() {
      return this.field316;
   }

   public int[] getTrianglePointsY() {
      return this.field325;
   }

   public int[] getTrianglePointsZ() {
      return this.field318;
   }

   public short[] getTexTriangleX() {
      return this.field328;
   }

   public short[] getTexTriangleY() {
      return this.field329;
   }

   public short[] getTexTriangleZ() {
      return this.field330;
   }

   public byte[] getTextureCoords() {
      return this.field322;
   }

   public byte[] getTextureRenderTypes() {
      return this.field327;
   }

   public int getTriangleFaceCount() {
      return this.field332;
   }

   @ObfuscatedName("x")
   public void method550(int var1) {
      int var2 = field345[var1];
      int var3 = field350[var1];

      for(int var4 = 0; var4 < this.field312; ++var4) {
         int var5 = var2 * this.field314[var4] + var3 * this.field336[var4] >> 16;
         this.field314[var4] = var3 * this.field314[var4] - var2 * this.field336[var4] >> 16;
         this.field336[var4] = var5;
      }

      this.method557();
   }

   @ObfuscatedName("v")
   public void method551(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field312; ++var4) {
         this.field336[var4] += var1;
         this.field313[var4] += var2;
         this.field314[var4] += var3;
      }

      this.method557();
   }

   @ObfuscatedName("d")
   public void method581() {
      for(int var1 = 0; var1 < this.field312; ++var1) {
         this.field336[var1] = -this.field336[var1];
         this.field314[var1] = -this.field314[var1];
      }

      this.method557();
   }

   @ObfuscatedName("o")
   public void method554() {
      int var1;
      for(var1 = 0; var1 < this.field312; ++var1) {
         this.field314[var1] = -this.field314[var1];
      }

      for(var1 = 0; var1 < this.field332; ++var1) {
         int var2 = this.field316[var1];
         this.field316[var1] = this.field318[var1];
         this.field318[var1] = var2;
      }

      this.method557();
   }

   @ObfuscatedName("g")
   public void method552(short var1, short var2) {
      for(int var3 = 0; var3 < this.field332; ++var3) {
         if(this.field311[var3] == var1) {
            this.field311[var3] = var2;
         }
      }

   }

   @ObfuscatedName("q")
   void method557() {
      this.field321 = null;
      this.field337 = null;
      this.field331 = null;
      this.field340 = false;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "()Ldb;"
   )
   public class34 method544() {
      class34 var1 = new class34();
      if(this.field319 != null) {
         var1.field319 = new byte[this.field332];

         for(int var2 = 0; var2 < this.field332; ++var2) {
            var1.field319[var2] = this.field319[var2];
         }
      }

      var1.field312 = this.field312;
      var1.field332 = this.field332;
      var1.field335 = this.field335;
      var1.field336 = this.field336;
      var1.field313 = this.field313;
      var1.field314 = this.field314;
      var1.field316 = this.field316;
      var1.field325 = this.field325;
      var1.field318 = this.field318;
      var1.field320 = this.field320;
      var1.field315 = this.field315;
      var1.field322 = this.field322;
      var1.field311 = this.field311;
      var1.field324 = this.field324;
      var1.field343 = this.field343;
      var1.field327 = this.field327;
      var1.field328 = this.field328;
      var1.field329 = this.field329;
      var1.field330 = this.field330;
      var1.field334 = this.field334;
      var1.field349 = this.field349;
      var1.field333 = this.field333;
      var1.field344 = this.field344;
      var1.field321 = this.field321;
      var1.field331 = this.field331;
      var1.field338 = this.field338;
      var1.field339 = this.field339;
      return var1;
   }

   @ObfuscatedName("w")
   void method542(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var4.position = var1.length - 18;
      int var9 = var4.readUnsignedShort();
      int var10 = var4.readUnsignedShort();
      int var11 = var4.readUnsignedByte();
      int var12 = var4.readUnsignedByte();
      int var13 = var4.readUnsignedByte();
      int var14 = var4.readUnsignedByte();
      int var15 = var4.readUnsignedByte();
      int var16 = var4.readUnsignedByte();
      int var17 = var4.readUnsignedShort();
      int var18 = var4.readUnsignedShort();
      int var19 = var4.readUnsignedShort();
      int var20 = var4.readUnsignedShort();
      byte var21 = 0;
      int var45 = var21 + var9;
      int var23 = var45;
      var45 += var10;
      int var24 = var45;
      if(var13 == 255) {
         var45 += var10;
      }

      int var25 = var45;
      if(var15 == 1) {
         var45 += var10;
      }

      int var26 = var45;
      if(var12 == 1) {
         var45 += var10;
      }

      int var27 = var45;
      if(var16 == 1) {
         var45 += var9;
      }

      int var28 = var45;
      if(var14 == 1) {
         var45 += var10;
      }

      int var29 = var45;
      var45 += var20;
      int var30 = var45;
      var45 += var10 * 2;
      int var31 = var45;
      var45 += var11 * 6;
      int var32 = var45;
      var45 += var17;
      int var33 = var45;
      var45 += var18;
      int var10000 = var45 + var19;
      this.field312 = var9;
      this.field332 = var10;
      this.field335 = var11;
      this.field336 = new int[var9];
      this.field313 = new int[var9];
      this.field314 = new int[var9];
      this.field316 = new int[var10];
      this.field325 = new int[var10];
      this.field318 = new int[var10];
      if(var11 > 0) {
         this.field327 = new byte[var11];
         this.field328 = new short[var11];
         this.field329 = new short[var11];
         this.field330 = new short[var11];
      }

      if(var16 == 1) {
         this.field334 = new int[var9];
      }

      if(var12 == 1) {
         this.field319 = new byte[var10];
         this.field322 = new byte[var10];
         this.field324 = new short[var10];
      }

      if(var13 == 255) {
         this.field320 = new byte[var10];
      } else {
         this.field343 = (byte)var13;
      }

      if(var14 == 1) {
         this.field315 = new byte[var10];
      }

      if(var15 == 1) {
         this.field349 = new int[var10];
      }

      this.field311 = new short[var10];
      var4.position = var21;
      var5.position = var32;
      var6.position = var33;
      var7.position = var45;
      var8.position = var27;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.readUnsignedByte();
         var40 = 0;
         if((var39 & 1) != 0) {
            var40 = var5.method2339();
         }

         var41 = 0;
         if((var39 & 2) != 0) {
            var41 = var6.method2339();
         }

         var42 = 0;
         if((var39 & 4) != 0) {
            var42 = var7.method2339();
         }

         this.field336[var38] = var35 + var40;
         this.field313[var38] = var36 + var41;
         this.field314[var38] = var37 + var42;
         var35 = this.field336[var38];
         var36 = this.field313[var38];
         var37 = this.field314[var38];
         if(var16 == 1) {
            this.field334[var38] = var8.readUnsignedByte();
         }
      }

      var4.position = var30;
      var5.position = var26;
      var6.position = var24;
      var7.position = var28;
      var8.position = var25;

      for(var38 = 0; var38 < var10; ++var38) {
         this.field311[var38] = (short)var4.readUnsignedShort();
         if(var12 == 1) {
            var39 = var5.readUnsignedByte();
            if((var39 & 1) == 1) {
               this.field319[var38] = 1;
               var2 = true;
            } else {
               this.field319[var38] = 0;
            }

            if((var39 & 2) == 2) {
               this.field322[var38] = (byte)(var39 >> 2);
               this.field324[var38] = this.field311[var38];
               this.field311[var38] = 127;
               if(this.field324[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.field322[var38] = -1;
               this.field324[var38] = -1;
            }
         }

         if(var13 == 255) {
            this.field320[var38] = var6.method2257();
         }

         if(var14 == 1) {
            this.field315[var38] = var7.method2257();
         }

         if(var15 == 1) {
            this.field349[var38] = var8.readUnsignedByte();
         }
      }

      var4.position = var29;
      var5.position = var23;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.readUnsignedByte();
         if(var43 == 1) {
            var38 = var4.method2339() + var41;
            var39 = var4.method2339() + var38;
            var40 = var4.method2339() + var39;
            var41 = var40;
            this.field316[var42] = var38;
            this.field325[var42] = var39;
            this.field318[var42] = var40;
         }

         if(var43 == 2) {
            var39 = var40;
            var40 = var4.method2339() + var41;
            var41 = var40;
            this.field316[var42] = var38;
            this.field325[var42] = var39;
            this.field318[var42] = var40;
         }

         if(var43 == 3) {
            var38 = var40;
            var40 = var4.method2339() + var41;
            var41 = var40;
            this.field316[var42] = var38;
            this.field325[var42] = var39;
            this.field318[var42] = var40;
         }

         if(var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.method2339() + var41;
            var41 = var40;
            this.field316[var42] = var38;
            this.field325[var42] = var44;
            this.field318[var42] = var40;
         }
      }

      var4.position = var31;

      for(var42 = 0; var42 < var11; ++var42) {
         this.field327[var42] = 0;
         this.field328[var42] = (short)var4.readUnsignedShort();
         this.field329[var42] = (short)var4.readUnsignedShort();
         this.field330[var42] = (short)var4.readUnsignedShort();
      }

      if(this.field322 != null) {
         boolean var46 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.field322[var43] & 255;
            if(var44 != 255) {
               if(this.field316[var43] == (this.field328[var44] & '\uffff') && this.field325[var43] == (this.field329[var44] & '\uffff') && this.field318[var43] == (this.field330[var44] & '\uffff')) {
                  this.field322[var43] = -1;
               } else {
                  var46 = true;
               }
            }
         }

         if(!var46) {
            this.field322 = null;
         }
      }

      if(!var3) {
         this.field324 = null;
      }

      if(!var2) {
         this.field319 = null;
      }

   }

   @ObfuscatedName("af")
   static final int method611(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;II)Ldb;"
   )
   public static class34 method540(Js5Index var0, int var1, int var2) {
      byte[] var3 = var0.method4398(var1, var2, -1448646867);
      return var3 == null?null:new class34(var3);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(Ldb;Ldb;IIIZ)V"
   )
   static void method568(class34 var0, class34 var1, int var2, int var3, int var4, boolean var5) {
      var0.method558();
      var0.method556();
      var1.method558();
      var1.method556();
      ++field348;
      int var6 = 0;
      int[] var7 = var1.field336;
      int var8 = var1.field312;

      int var9;
      for(var9 = 0; var9 < var0.field312; ++var9) {
         class304 var10 = var0.field321[var9];
         if(var10.field3768 != 0) {
            int var11 = var0.field313[var9] - var3;
            if(var11 <= var1.field341) {
               int var12 = var0.field336[var9] - var2;
               if(var12 >= var1.field342 && var12 <= var1.field317) {
                  int var13 = var0.field314[var9] - var4;
                  if(var13 >= var1.field323 && var13 <= var1.field326) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        class304 var15 = var1.field321[var14];
                        if(var12 == var7[var14] && var13 == var1.field314[var14] && var11 == var1.field313[var14] && var15.field3768 != 0) {
                           if(var0.field337 == null) {
                              var0.field337 = new class304[var0.field312];
                           }

                           if(var1.field337 == null) {
                              var1.field337 = new class304[var8];
                           }

                           class304 var16 = var0.field337[var9];
                           if(var16 == null) {
                              var16 = var0.field337[var9] = new class304(var10);
                           }

                           class304 var17 = var1.field337[var14];
                           if(var17 == null) {
                              var17 = var1.field337[var14] = new class304(var15);
                           }

                           var16.field3765 += var15.field3765;
                           var16.field3766 += var15.field3766;
                           var16.field3770 += var15.field3770;
                           var16.field3768 += var15.field3768;
                           var17.field3765 += var10.field3765;
                           var17.field3766 += var10.field3766;
                           var17.field3770 += var10.field3770;
                           var17.field3768 += var10.field3768;
                           ++var6;
                           field346[var9] = field348;
                           field347[var14] = field348;
                        }
                     }
                  }
               }
            }
         }
      }

      if(var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.field332; ++var9) {
            if(field346[var0.field316[var9]] == field348 && field346[var0.field325[var9]] == field348 && field346[var0.field318[var9]] == field348) {
               if(var0.field319 == null) {
                  var0.field319 = new byte[var0.field332];
               }

               var0.field319[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.field332; ++var9) {
            if(field348 == field347[var1.field316[var9]] && field348 == field347[var1.field325[var9]] && field348 == field347[var1.field318[var9]]) {
               if(var1.field319 == null) {
                  var1.field319 = new byte[var1.field332];
               }

               var1.field319[var9] = 2;
            }
         }

      }
   }

   @ObfuscatedName("az")
   static final int method617(int var0) {
      if(var0 < 2) {
         var0 = 2;
      } else if(var0 > 126) {
         var0 = 126;
      }

      return var0;
   }
}
