package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFrames;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSSequence;

@ObfuscatedName("jw")
public class class321 extends class193 implements RSSequence {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class148 field3416;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class124 field3415;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class148 field3421;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class124 field3414;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class148 field3413;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1242202945
   )
   public int field3422;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1382572151
   )
   public int field3429;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 58077279
   )
   public int field3420;
   @ObfuscatedName("z")
   public boolean field3424;
   @ObfuscatedName("r")
   public int[] field3419;
   @ObfuscatedName("p")
   public int[] field3418;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1844661999
   )
   public int field3411;
   @ObfuscatedName("c")
   int[] field3417;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 830242843
   )
   public int field3427;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 1476626261
   )
   public int field3412;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1268934879
   )
   public int field3423;
   @ObfuscatedName("a")
   public int[] field3426;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 736194087
   )
   public int field3425;
   @ObfuscatedName("d")
   int[] field3428;

   static {
      field3414 = new class124(64);
      field3415 = new class124(100);
   }

   class321() {
      this.field3420 = -1;
      this.field3424 = false;
      this.field3423 = 5;
      this.field3429 = -1;
      this.field3425 = -1;
      this.field3422 = 99;
      this.field3427 = -1;
      this.field3411 = -1;
      this.field3412 = 2;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lds;II)Lds;",
      garbageValue = "-2003020681"
   )
   public class200 method5635(class200 var1, int var2) {
      int var3 = this.field3426[var2];
      class295 var4 = class233.method4164(var3 >> 16);
      var3 &= 65535;
      if(var4 == null) {
         return var1.method3375(true);
      } else {
         class295 var5 = null;
         int var6 = 0;
         if(this.field3417 != null && var2 < this.field3417.length) {
            var6 = this.field3417[var2];
            var5 = class233.method4164(var6 >> 16);
            var6 &= 65535;
         }

         class200 var7;
         if(var5 != null && var6 != 65535) {
            var7 = var1.method3375(!var4.method5141(var3) & !var5.method5141(var6));
            var7.method3378(var4, var3);
            var7.method3378(var5, var6);
            return var7;
         } else {
            var7 = var1.method3375(!var4.method5141(var3));
            var7.method3378(var4, var3);
            return var7;
         }
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Lds;ILjw;IS)Lds;"
   )
   public class200 method5654(class200 var1, int var2, class321 var3, int var4, short var5) {
      int var6;
      if(var2 < 0) {
         var6 = var2 ^ Integer.MIN_VALUE;
         var2 = var6 & 65535;
      }

      if(var4 < 0) {
         var6 = var4 ^ Integer.MIN_VALUE;
         var4 = var6 & 65535;
      }

      return (class200)this.copy$applyTransformations(var1, var2, var3, var4, var5);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Lds;IB)Lds;"
   )
   class200 method5638(class200 var1, int var2, byte var3) {
      if(var2 < 0) {
         int var4 = var2 ^ Integer.MIN_VALUE;
         int var5 = var4 >> 16;
         var2 = var4 & 65535;
         int var6 = var2 + 1;
         if(var6 >= this.getFrameIDs().length) {
            var6 = -1;
         }

         int[] var7 = this.getFrameIDs();
         int var8 = var7[var2];
         RSFrames var9 = class113.field1064.getFrames(var8 >> 16);
         int var10 = var8 & 65535;
         int var11 = -1;
         RSFrames var12 = null;
         if(var6 != -1) {
            int var13 = var7[var6];
            var12 = class113.field1064.getFrames(var13 >> 16);
            var11 = var13 & 65535;
         }

         if(var9 == null) {
            return (class200)var1.toSharedSpotAnimModel(true);
         } else {
            RSModel var14 = var1.toSharedSpotAnimModel(!var9.getFrames()[var10].isShowing());
            var14.interpolateFrames(var9, var10, var12, var11, var5, this.getFrameLenths()[var2]);
            return (class200)var14;
         }
      } else {
         return (class200)this.copy$transformSpotAnimModel(var1, var2, var3);
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lds;III)Lds;"
   )
   class200 method5653(class200 var1, int var2, int var3, int var4) {
      if(var2 < 0) {
         int var5 = var2 ^ Integer.MIN_VALUE;
         int var6 = var5 >> 16;
         var2 = var5 & 65535;
         int var7 = var2 + 1;
         if(var7 >= this.getFrameIDs().length) {
            var7 = -1;
         }

         int[] var8 = this.getFrameIDs();
         int var9 = var8[var2];
         RSFrames var10 = class113.field1064.getFrames(var9 >> 16);
         int var11 = var9 & 65535;
         int var12 = -1;
         RSFrames var13 = null;
         if(var7 != -1) {
            int var14 = var8[var7];
            var13 = class113.field1064.getFrames(var14 >> 16);
            var12 = var14 & 65535;
         }

         if(var10 == null) {
            return (class200)var1.toSharedModel(true);
         } else {
            RSModel var15 = var1.toSharedModel(!var10.getFrames()[var11].isShowing());
            var3 &= 3;
            if(var3 == 1) {
               var15.rotateY270Ccw();
            } else if(var3 == 2) {
               var15.rotateY180Ccw();
            } else if(var3 == 3) {
               var15.rotateY90Ccw();
            }

            var15.interpolateFrames(var10, var11, var13, var12, var6, this.getFrameLenths()[var2]);
            if(var3 == 1) {
               var15.rotateY90Ccw();
            } else if(var3 == 2) {
               var15.rotateY180Ccw();
            } else if(var3 == 3) {
               var15.rotateY270Ccw();
            }

            return (class200)var15;
         }
      } else {
         return (class200)this.copy$transformObjectModel(var1, var2, var3, var4);
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Lds;II)Lds;"
   )
   public class200 method5631(class200 var1, int var2, int var3) {
      if(var2 < 0) {
         int var4 = var2 ^ Integer.MIN_VALUE;
         int var5 = var4 >> 16;
         var2 = var4 & 65535;
         int var6 = var2 + 1;
         if(var6 >= this.getFrameIDs().length) {
            var6 = -1;
         }

         int[] var7 = this.getFrameIDs();
         int var8 = var7[var2];
         RSFrames var9 = class113.field1064.getFrames(var8 >> 16);
         int var10 = var8 & 65535;
         int var11 = -1;
         RSFrames var12 = null;
         if(var6 != -1) {
            int var13 = var7[var6];
            var12 = class113.field1064.getFrames(var13 >> 16);
            var11 = var13 & 65535;
         }

         if(var9 == null) {
            return (class200)var1.toSharedModel(true);
         } else {
            RSModel var14 = var1.toSharedModel(!var9.getFrames()[var10].isShowing());
            var14.interpolateFrames(var9, var10, var12, var11, var5, this.getFrameLenths()[var2]);
            return (class200)var14;
         }
      } else {
         return (class200)this.copy$transformActorModel(var1, var2, var3);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "-1166655253"
   )
   void method5629(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method5630(var1, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1012107845"
   )
   void method5637() {
      if(this.field3427 == -1) {
         if(this.field3428 != null) {
            this.field3427 = 2;
         } else {
            this.field3427 = 0;
         }
      }

      if(this.field3411 == -1) {
         if(this.field3428 != null) {
            this.field3411 = 2;
         } else {
            this.field3411 = 0;
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "1619814780"
   )
   void method5630(Buffer var1, int var2) {
      int var3;
      int var4;
      if(var2 == 1) {
         var3 = var1.readUnsignedShort();
         this.field3418 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3418[var4] = var1.readUnsignedShort();
         }

         this.field3426 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3426[var4] = var1.readUnsignedShort();
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3426[var4] += var1.readUnsignedShort() << 16;
         }
      } else if(var2 == 2) {
         this.field3420 = var1.readUnsignedShort();
      } else if(var2 == 3) {
         var3 = var1.readUnsignedByte();
         this.field3428 = new int[var3 + 1];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3428[var4] = var1.readUnsignedByte();
         }

         this.field3428[var3] = 9999999;
      } else if(var2 == 4) {
         this.field3424 = true;
      } else if(var2 == 5) {
         this.field3423 = var1.readUnsignedByte();
      } else if(var2 == 6) {
         this.field3429 = var1.readUnsignedShort();
      } else if(var2 == 7) {
         this.field3425 = var1.readUnsignedShort();
      } else if(var2 == 8) {
         this.field3422 = var1.readUnsignedByte();
      } else if(var2 == 9) {
         this.field3427 = var1.readUnsignedByte();
      } else if(var2 == 10) {
         this.field3411 = var1.readUnsignedByte();
      } else if(var2 == 11) {
         this.field3412 = var1.readUnsignedByte();
      } else if(var2 == 12) {
         var3 = var1.readUnsignedByte();
         this.field3417 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3417[var4] = var1.readUnsignedShort();
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3417[var4] += var1.readUnsignedShort() << 16;
         }
      } else if(var2 == 13) {
         var3 = var1.readUnsignedByte();
         this.field3419 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3419[var4] = var1.method1909();
         }
      }

   }

   @ObfuscatedSignature(
      signature = "(Lds;III)Lds;"
   )
   public class200 copy$transformObjectModel(class200 var1, int var2, int var3, int var4) {
      var2 = this.field3426[var2];
      class295 var5 = class233.method4164(var2 >> 16);
      var2 &= 65535;
      if(var5 == null) {
         return var1.method3375(true);
      } else {
         class200 var6 = var1.method3375(!var5.method5141(var2));
         var3 &= 3;
         if(var3 == 1) {
            var6.method3383();
         } else if(var3 == 2) {
            var6.method3382();
         } else if(var3 == 3) {
            var6.method3427();
         }

         var6.method3378(var5, var2);
         if(var3 == 1) {
            var6.method3427();
         } else if(var3 == 2) {
            var6.method3382();
         } else if(var3 == 3) {
            var6.method3383();
         }

         return var6;
      }
   }

   @ObfuscatedSignature(
      signature = "(Lds;IB)Lds;"
   )
   public class200 copy$transformSpotAnimModel(class200 var1, int var2, byte var3) {
      var2 = this.field3426[var2];
      class295 var4 = class233.method4164(var2 >> 16);
      var2 &= 65535;
      if(var4 == null) {
         return var1.method3371(true);
      } else {
         class200 var5 = var1.method3371(!var4.method5141(var2));
         var5.method3378(var4, var2);
         return var5;
      }
   }

   @ObfuscatedSignature(
      signature = "(Lds;II)Lds;"
   )
   public class200 copy$transformActorModel(class200 var1, int var2, int var3) {
      var2 = this.field3426[var2];
      class295 var4 = class233.method4164(var2 >> 16);
      var2 &= 65535;
      if(var4 == null) {
         return var1.method3375(true);
      } else {
         class200 var5 = var1.method3375(!var4.method5141(var2));
         var5.method3378(var4, var2);
         return var5;
      }
   }

   @ObfuscatedSignature(
      signature = "(Lds;ILjw;IS)Lds;"
   )
   public class200 copy$applyTransformations(class200 var1, int var2, class321 var3, int var4, short var5) {
      var2 = this.field3426[var2];
      class295 var6 = class233.method4164(var2 >> 16);
      var2 &= 65535;
      if(var6 == null) {
         return var3.method5631(var1, var4, 928911062);
      } else {
         var4 = var3.field3426[var4];
         class295 var7 = class233.method4164(var4 >> 16);
         var4 &= 65535;
         class200 var8;
         if(var7 == null) {
            var8 = var1.method3375(!var6.method5141(var2));
            var8.method3378(var6, var2);
            return var8;
         } else {
            var8 = var1.method3375(!var6.method5141(var2) & !var7.method5141(var4));
            var8.method3379(var6, var2, var7, var4, this.field3428);
            return var8;
         }
      }
   }

   public int[] getFrameIDs() {
      return this.field3426;
   }

   public int[] getFrameLenths() {
      return this.field3418;
   }

   public int[] getInterleaveLeave() {
      return this.field3428;
   }

   public boolean getStretches() {
      return this.field3424;
   }

   public int getMaxLoops() {
      return this.field3422;
   }

   public int getPrecedenceAnimating() {
      return this.field3427;
   }

   public int getReplyMode() {
      return this.field3412;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(B)Lbu;",
      garbageValue = "0"
   )
   static class126 method5663() {
      return class126.field1203 < class126.field1184?class126.field1187[++class126.field1203 - 1]:null;
   }
}
