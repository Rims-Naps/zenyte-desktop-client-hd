package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSDynamicObject;

@ObfuscatedName("cc")
public class class321 extends class102 implements RSDynamicObject {
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1423533395
   )
   int field3923;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Ljw;"
   )
   class312 field3930;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 197919955
   )
   int field3925;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 319176309
   )
   int field3926;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1503529355
   )
   int field3929;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 461770659
   )
   int field3931;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 264554179
   )
   int field3928;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1194337141
   )
   int field3927;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1496936641
   )
   int field3924;

   @ObfuscatedSignature(
      signature = "(IIIIIIIZLdj;)V"
   )
   class321(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, class102 var9) {
      this.field3929 = var1;
      this.field3925 = var2;
      this.field3924 = var3;
      this.field3926 = var4;
      this.field3927 = var5;
      this.field3928 = var6;
      if(var7 != -1) {
         this.field3930 = class3.method74(var7);
         this.field3923 = 0;
         this.field3931 = client.field2165 - 1;
         this.onAnimCycleCountChanged(-1);
         if(this.field3930.field3830 == 0 && var9 != null && var9 instanceof class321) {
            class321 var10 = (class321)var9;
            if(this.field3930 == var10.field3930) {
               this.field3923 = var10.field3923;
               this.field3931 = var10.field3931;
               this.onAnimCycleCountChanged(-1);
               return;
            }
         }

         if(var8 && this.field3930.field3838 != -1) {
            this.field3923 = (int)(Math.random() * (double)this.field3930.field3844.length);
            this.field3931 -= (int)(Math.random() * (double)this.field3930.field3836[this.field3923]);
            this.onAnimCycleCountChanged(-1);
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(S)Lds;"
   )
   protected final class52 vmethod6253(short var1) {
      boolean var8 = false;

      class52 var3;
      try {
         var8 = true;
         int var2 = this.getAnimFrame();
         if(var2 < 0) {
            this.setAnimFrame((var2 ^ Integer.MIN_VALUE) & 65535);
         }

         var3 = this.copy$getModel(var1);
         var8 = false;
      } finally {
         if(var8) {
            int var6 = this.getAnimFrame();
            if(var6 < 0) {
               this.setAnimFrame((var6 ^ Integer.MIN_VALUE) & 65535);
            }

         }
      }

      int var4 = this.getAnimFrame();
      if(var4 < 0) {
         this.setAnimFrame((var4 ^ Integer.MIN_VALUE) & 65535);
      }

      return (class52)var3;
   }

   public int getAnimFrame() {
      return this.field3923;
   }

   @ObfuscatedSignature(
      signature = "(S)Lds;"
   )
   public final class52 copy$getModel(short var1) {
      if(this.field3930 != null) {
         int var2 = client.field2165 - this.field3931;
         if(var2 > 100 && this.field3930.field3838 > 0) {
            var2 = 100;
         }

         label56: {
            do {
               do {
                  if(var2 <= this.field3930.field3836[this.field3923]) {
                     break label56;
                  }

                  var2 -= this.field3930.field3836[this.field3923];
                  ++this.field3923;
               } while(this.field3923 < this.field3930.field3844.length);

               this.field3923 -= this.field3930.field3838;
            } while(this.field3923 >= 0 && this.field3923 < this.field3930.field3844.length);

            this.field3930 = null;
         }

         this.field3931 = client.field2165 - var2;
         this.onAnimCycleCountChanged(-1);
      }

      ObjectDef var13 = class285.getObjectDef(this.field3929);
      if(var13.multiLocs != null) {
         var13 = var13.getMultiLoc();
      }

      if(var13 == null) {
         return null;
      } else {
         int var3;
         int var4;
         if(this.field3924 != 1 && this.field3924 != 3) {
            var3 = var13.field150;
            var4 = var13.field193;
         } else {
            var3 = var13.field193;
            var4 = var13.field150;
         }

         int var5 = (var3 >> 1) + this.field3927;
         int var6 = (var3 + 1 >> 1) + this.field3927;
         int var7 = (var4 >> 1) + this.field3928;
         int var8 = (var4 + 1 >> 1) + this.field3928;
         int[][] var9 = class185.field2522[this.field3926];
         int var10 = var9[var6][var8] + var9[var6][var7] + var9[var5][var7] + var9[var5][var8] >> 2;
         int var11 = (this.field3927 << 7) + (var3 << 6);
         int var12 = (this.field3928 << 7) + (var4 << 6);
         return var13.method327(this.field3925, this.field3924, var9, var11, var10, var12, this.field3930, this.field3923);
      }
   }

   public void setAnimFrame(int var1) {
      this.field3923 = var1;
   }

   public int getAnimCycleCount() {
      return this.field3931;
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void onAnimCycleCountChanged(int var1) {
      if(class302.field3755.isInterpolateObjectAnimations()) {
         int var2 = class302.field3755.getGameCycle() - this.getAnimCycleCount();
         this.setAnimFrame(Integer.MIN_VALUE | var2 << 16 | this.getAnimFrame());
      }

   }

   public int getId() {
      return this.field3929;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IZIZI)V",
      garbageValue = "833654752"
   )
   static void method6248(int var0, boolean var1, int var2, boolean var3) {
      if(class88.field947 != null) {
         class187.method3802(0, class88.field947.length - 1, var0, var1, var2, var3);
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "1310720053"
   )
   public static synchronized long method6252() {
      long var0 = System.currentTimeMillis();
      if(var0 < class253.field3340) {
         class253.field3338 += class253.field3340 - var0;
      }

      class253.field3340 = var0;
      return class253.field3338 + var0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "597580269"
   )
   public static int method6251(int var0) {
      long var2 = class298.field3710[var0];
      int var1 = (int)(var2 >>> 0 & 127L);
      return var1;
   }
}
