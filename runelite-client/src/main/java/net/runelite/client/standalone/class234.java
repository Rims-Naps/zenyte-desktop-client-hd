package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSDynamicObject;

@ObfuscatedName("cc")
public class class234 extends class308 implements RSDynamicObject {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1503529355
   )
   int field2304;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 461770659
   )
   int field2306;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1423533395
   )
   int field2298;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Ljw;"
   )
   class321 field2305;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1194337141
   )
   int field2302;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 197919955
   )
   int field2300;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 319176309
   )
   int field2301;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 264554179
   )
   int field2303;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1496936641
   )
   int field2299;

   @ObfuscatedSignature(
      signature = "(IIIIIIIZLdj;)V"
   )
   class234(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, class308 var9) {
      this.field2304 = var1;
      this.field2300 = var2;
      this.field2299 = var3;
      this.field2301 = var4;
      this.field2302 = var5;
      this.field2303 = var6;
      if(var7 != -1) {
         this.field2305 = class182.method3192(var7);
         this.field2298 = 0;
         this.field2306 = client.field3744 - 1;
         this.onAnimCycleCountChanged(-1);
         if(this.field2305.field3412 == 0 && var9 != null && var9 instanceof class234) {
            class234 var10 = (class234)var9;
            if(this.field2305 == var10.field2305) {
               this.field2298 = var10.field2298;
               this.field2306 = var10.field2306;
               this.onAnimCycleCountChanged(-1);
               return;
            }
         }

         if(var8 && this.field2305.field3420 != -1) {
            this.field2298 = (int)(Math.random() * (double)this.field2305.field3426.length);
            this.field2306 -= (int)(Math.random() * (double)this.field2305.field3418[this.field2298]);
            this.onAnimCycleCountChanged(-1);
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(S)Lds;"
   )
   protected final class200 vmethod5291(short var1) {
      boolean var8 = false;

      class200 var3;
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

      return (class200)var3;
   }

   public int getAnimFrame() {
      return this.field2298;
   }

   @ObfuscatedSignature(
      signature = "(S)Lds;"
   )
   public final class200 copy$getModel(short var1) {
      if(this.field2305 != null) {
         int var2 = client.field3744 - this.field2306;
         if(var2 > 100 && this.field2305.field3420 > 0) {
            var2 = 100;
         }

         label56: {
            do {
               do {
                  if(var2 <= this.field2305.field3418[this.field2298]) {
                     break label56;
                  }

                  var2 -= this.field2305.field3418[this.field2298];
                  ++this.field2298;
               } while(this.field2298 < this.field2305.field3426.length);

               this.field2298 -= this.field2305.field3420;
            } while(this.field2298 >= 0 && this.field2298 < this.field2305.field3426.length);

            this.field2305 = null;
         }

         this.field2306 = client.field3744 - var2;
         this.onAnimCycleCountChanged(-1);
      }

      class172 var13 = class152.method2696(this.field2304);
      if(var13.field1631 != null) {
         var13 = var13.method2898();
      }

      if(var13 == null) {
         return null;
      } else {
         int var3;
         int var4;
         if(this.field2299 != 1 && this.field2299 != 3) {
            var3 = var13.field1592;
            var4 = var13.field1635;
         } else {
            var3 = var13.field1635;
            var4 = var13.field1592;
         }

         int var5 = (var3 >> 1) + this.field2302;
         int var6 = (var3 + 1 >> 1) + this.field2302;
         int var7 = (var4 >> 1) + this.field2303;
         int var8 = (var4 + 1 >> 1) + this.field2303;
         int[][] var9 = class31.field249[this.field2301];
         int var10 = var9[var6][var8] + var9[var6][var7] + var9[var5][var7] + var9[var5][var8] >> 2;
         int var11 = (this.field2302 << 7) + (var3 << 6);
         int var12 = (this.field2303 << 7) + (var4 << 6);
         return var13.method2900(this.field2300, this.field2299, var9, var11, var10, var12, this.field2305, this.field2298);
      }
   }

   public void setAnimFrame(int var1) {
      this.field2298 = var1;
   }

   public int getAnimCycleCount() {
      return this.field2306;
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void onAnimCycleCountChanged(int var1) {
      if(class113.field1064.isInterpolateObjectAnimations()) {
         int var2 = class113.field1064.getGameCycle() - this.getAnimCycleCount();
         this.setAnimFrame(Integer.MIN_VALUE | var2 << 16 | this.getAnimFrame());
      }

   }

   public int getId() {
      return this.field2304;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "572838858"
   )
   public static synchronized long method4170() {
      long var0 = System.currentTimeMillis();
      if(var0 < class194.field1848) {
         class194.field1846 += class194.field1848 - var0;
      }

      class194.field1848 = var0;
      return class194.field1846 + var0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "597580269"
   )
   public static int method4169(int var0) {
      long var2 = class327.field3516[var0];
      int var1 = (int)(var2 >>> 0 & 127L);
      return var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IZIZI)V",
      garbageValue = "833654752"
   )
   static void method4166(int var0, boolean var1, int var2, boolean var3) {
      if(class126.field1187 != null) {
         class329.method5927(0, class126.field1187.length - 1, var0, var1, var2, var3);
      }

   }
}
