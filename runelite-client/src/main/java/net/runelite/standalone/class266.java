package net.runelite.standalone;

import net.runelite.api.IndexDataBase;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSTexture;
import net.runelite.rs.api.RSTextureProvider;

@ObfuscatedName("dr")
public class class266 implements class8, RSTextureProvider {
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   Js5Index field3449;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   class70 field3450;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 2134722619
   )
   int field3452;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "[Ldu;"
   )
   class65[] field3456;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -773872445
   )
   int field3451;
   @ObfuscatedName("e")
   double field3453;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1550288627
   )
   int field3455;

   @ObfuscatedSignature(
      signature = "(Lik;Lik;IDI)V"
   )
   public class266(Js5Index var1, Js5Index var2, int var3, double var4, int var6) {
      this.field3450 = new class70();
      this.field3452 = 0;
      this.field3453 = 1.0D;
      this.field3451 = 128;
      this.field3449 = var2;
      this.field3455 = var3;
      this.field3452 = this.field3455;
      this.field3453 = var4;
      this.field3451 = var6;
      int[] var7 = var1.method4475(0);
      int var8 = var7.length;
      this.field3456 = new class65[var1.method4435(0)];

      for(int var9 = 0; var9 < var8; ++var9) {
         Buffer var10 = new Buffer(var1.method4398(0, var7[var9], -199223155));
         this.field3456[var7[var9]] = new class65(var10);
      }

      this.rl$init(var1, var2, var3, var4, var6);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1220758971"
   )
   public void method5295() {
      for(int var1 = 0; var1 < this.field3456.length; ++var1) {
         if(this.field3456[var1] != null) {
            this.field3456[var1].method1366();
         }
      }

      this.field3450 = new class70();
      this.field3452 = this.field3455;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "359300581"
   )
   public boolean vmethod5294(int var1) {
      return this.field3451 == 64;
   }

   @ObfuscatedName("l")
   public void method5304(double var1) {
      this.field3453 = var1;
      this.method5295();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-2044307018"
   )
   public int vmethod5292(int var1) {
      return this.field3456[var1] != null?this.field3456[var1].field754:0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(S)I",
      garbageValue = "32360"
   )
   public int method5290() {
      int var1 = 0;
      int var2 = 0;
      class65[] var3 = this.field3456;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         class65 var5 = var3[var4];
         if(var5 != null && var5.field756 != null) {
            var1 += var5.field756.length;
            int[] var6 = var5.field756;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               int var8 = var6[var7];
               if(this.field3449.method4401(var8)) {
                  ++var2;
               }
            }
         }
      }

      if(var1 == 0) {
         return 0;
      } else {
         return var2 * 100 / var1;
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1108147567"
   )
   public void method5296(int var1) {
      for(int var2 = 0; var2 < this.field3456.length; ++var2) {
         class65 var3 = this.field3456[var2];
         if(var3 != null && var3.field760 != 0 && var3.field763) {
            var3.method1360(var1);
            var3.field763 = false;
         }
      }

      this.checkTextures(var1);
   }

   public void setMaxSize(int var1) {
      this.field3455 = var1;
   }

   public void checkTextures(int var1) {
      class302.field3755.getCallbacks().drawAboveOverheads();
   }

   public void setSize(int var1) {
      this.field3452 = var1;
   }

   public void rl$init(IndexDataBase var1, IndexDataBase var2, int var3, double var4, int var6) {
      this.setMaxSize(64);
      this.setSize(64);
   }

   public RSTexture[] getTextures() {
      return this.field3456;
   }

   public double getBrightness() {
      return this.field3453;
   }

   public void setBrightness(double var1) {
      this.method5304(var1);
   }

   public int[] load(int var1) {
      return this.vmethod5291(var1);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "-656235485"
   )
   public boolean vmethod5293(int var1) {
      return this.field3456[var1].field759;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)[I",
      garbageValue = "-1678600032"
   )
   public int[] vmethod5291(int var1) {
      class65 var2 = this.field3456[var1];
      if(var2 != null) {
         if(var2.field761 != null) {
            this.field3450.method1500(var2);
            var2.field763 = true;
            return var2.field761;
         }

         boolean var3 = var2.method1358(this.field3453, this.field3451, this.field3449);
         if(var3) {
            if(this.field3452 == 0) {
               class65 var4 = (class65)this.field3450.method1502();
               var4.method1366();
            } else {
               --this.field3452;
            }

            this.field3450.method1500(var2);
            var2.field763 = true;
            return var2.field761;
         }
      }

      return null;
   }
}
