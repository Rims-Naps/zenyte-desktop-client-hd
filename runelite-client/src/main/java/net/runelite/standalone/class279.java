package net.runelite.standalone;

import net.runelite.api.Actor;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.ProjectileMoved;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSNPC;
import net.runelite.rs.api.RSPlayer;
import net.runelite.rs.api.RSProjectile;

@ObfuscatedName("cu")
public final class class279 extends class102 implements RSProjectile {
   @ObfuscatedName("j")
   double field3535;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1056086609
   )
   int field3543;
   @ObfuscatedName("z")
   boolean field3536;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 2086149233
   )
   int field3541;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Ljw;"
   )
   class312 field3542;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 791155207
   )
   int field3526;
   @ObfuscatedName("n")
   double field3539;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -339928559
   )
   int field3521;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1908018201
   )
   int field3523;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1975165683
   )
   int field3545;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -388070041
   )
   int field3544;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1092154499
   )
   int field3528;
   @ObfuscatedName("u")
   double field3537;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 158303435
   )
   int field3524;
   @ObfuscatedName("b")
   double field3527;
   @ObfuscatedName("x")
   double field3540;
   @ObfuscatedName("v")
   double field3533;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1294297049
   )
   int field3530;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 23691669
   )
   int field3525;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 413519043
   )
   int field3532;
   @ObfuscatedName("g")
   double field3534;
   @ObfuscatedName("t")
   double field3538;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -2082750287
   )
   int field3531;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 765614089
   )
   int field3529;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1078438503
   )
   int field3522;

   class279(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.field3536 = false;
      this.field3543 = 0;
      this.field3531 = 0;
      this.field3545 = var1;
      this.field3521 = var2;
      this.field3522 = var3;
      this.field3523 = var4;
      this.field3529 = var5;
      this.field3526 = var6;
      this.field3541 = var7;
      this.field3528 = var8;
      this.field3524 = var9;
      this.field3530 = var10;
      this.field3525 = var11;
      this.field3536 = false;
      int var12 = class283.method5464(this.field3545).field813;
      if(var12 != -1) {
         this.field3542 = class3.method74(var12);
      } else {
         this.field3542 = null;
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "11659523"
   )
   final void method5399(int var1) {
      this.field3536 = true;
      this.field3540 += (double)var1 * this.field3535;
      this.field3533 += this.field3527 * (double)var1;
      this.field3534 += 0.5D * this.field3539 * (double)var1 * (double)var1 + (double)var1 * this.field3538;
      this.field3538 += (double)var1 * this.field3539;
      this.field3544 = (int)(Math.atan2(this.field3535, this.field3527) * 325.949D) + 1024 & 2047;
      this.field3532 = (int)(Math.atan2(this.field3538, this.field3537) * 325.949D) & 2047;
      if(this.field3542 != null) {
         this.field3531 += var1;

         while(true) {
            do {
               do {
                  if(this.field3531 <= this.field3542.field3836[this.field3543]) {
                     return;
                  }

                  this.field3531 -= this.field3542.field3836[this.field3543];
                  ++this.field3543;
               } while(this.field3543 < this.field3542.field3844.length);

               this.field3543 -= this.field3542.field3838;
            } while(this.field3543 >= 0 && this.field3543 < this.field3542.field3844.length);

            this.field3543 = 0;
         }
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-29195413"
   )
   final void method5406(int var1, int var2, int var3, int var4) {
      this.projectileMoved(var1, var2, var3, var4);
      double var5;
      if(!this.field3536) {
         var5 = (double)(var1 - this.field3522);
         double var7 = (double)(var2 - this.field3523);
         double var9 = Math.sqrt(var5 * var5 + var7 * var7);
         this.field3540 = (double)this.field3522 + (double)this.field3524 * var5 / var9;
         this.field3533 = (double)this.field3523 + (double)this.field3524 * var7 / var9;
         this.field3534 = (double)this.field3529;
      }

      var5 = (double)(this.field3541 + 1 - var4);
      this.field3535 = ((double)var1 - this.field3540) / var5;
      this.field3527 = ((double)var2 - this.field3533) / var5;
      this.field3537 = Math.sqrt(this.field3535 * this.field3535 + this.field3527 * this.field3527);
      if(!this.field3536) {
         this.field3538 = -this.field3537 * Math.tan(0.02454369D * (double)this.field3528);
      }

      this.field3539 = ((double)var3 - this.field3534 - this.field3538 * var5) * 2.0D / (var5 * var5);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(S)Lds;"
   )
   protected final class52 vmethod6253(short var1) {
      class71 var2 = class283.method5464(this.field3545);
      class52 var3 = var2.method1529(this.field3543);
      if(var3 == null) {
         return null;
      } else {
         var3.method1136(this.field3532);
         return var3;
      }
   }

   public int getRsInteracting() {
      return this.field3530;
   }

   public void projectileMoved(int var1, int var2, int var3, int var4) {
      LocalPoint var5 = new LocalPoint(var1, var2);
      ProjectileMoved var6 = new ProjectileMoved();
      var6.setProjectile(this);
      var6.setPosition(var5);
      var6.setZ(var3);
      class302.field3755.getCallbacks().post(var6);
   }

   public int getEndCycle() {
      return this.field3541;
   }

   public int getRemainingCycles() {
      int var1 = class302.field3755.getGameCycle();
      return this.getEndCycle() - var1;
   }

   public Actor getInteracting() {
      int var1 = this.getRsInteracting();
      if(var1 == 0) {
         return null;
      } else {
         int var2;
         if(var1 > 0) {
            var2 = var1 - 1;
            RSNPC[] var4 = class302.field3755.getCachedNPCs();
            return var4[var2];
         } else {
            var2 = -var1 - 1;
            if(var2 == class302.field3755.getLocalInteractingIndex()) {
               return class302.field3755.getLocalPlayer();
            } else {
               RSPlayer[] var3 = class302.field3755.getCachedPlayers();
               return var3[var2];
            }
         }
      }
   }

   public int getId() {
      return this.field3545;
   }

   public int getFloor() {
      return this.field3521;
   }

   public int getX1() {
      return this.field3522;
   }

   public int getY1() {
      return this.field3523;
   }

   public int getHeight() {
      return this.field3529;
   }

   public int getEndHeight() {
      return this.field3525;
   }

   public int getStartMovementCycle() {
      return this.field3526;
   }

   public int getSlope() {
      return this.field3528;
   }

   public int getStartHeight() {
      return this.field3524;
   }

   public double getX() {
      return this.field3540;
   }

   public double getY() {
      return this.field3533;
   }

   public double getZ() {
      return this.field3534;
   }

   public double getVelocityX() {
      return this.field3535;
   }

   public double getVelocityY() {
      return this.field3527;
   }

   public double getScalar() {
      return this.field3537;
   }

   public double getVelocityZ() {
      return this.field3538;
   }

   @ObfuscatedName("f")
   static double method5409(double var0) {
      return Math.exp(-var0 * var0 / 2.0D) / Math.sqrt(6.283185307179586D);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(CI)C",
      garbageValue = "1998091092"
   )
   static char method5408(char var0) {
      return var0 != 181 && var0 != 131?Character.toTitleCase(var0):var0;
   }
}
