package net.runelite.client.standalone;

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
public final class class203 extends class308 implements RSProjectile {
   @ObfuscatedName("j")
   double field1970;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1975165683
   )
   int field1980;
   @ObfuscatedName("v")
   double field1968;
   @ObfuscatedName("n")
   double field1974;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 158303435
   )
   int field1959;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -2082750287
   )
   int field1966;
   @ObfuscatedName("z")
   boolean field1971;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -388070041
   )
   int field1979;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1092154499
   )
   int field1963;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 2086149233
   )
   int field1976;
   @ObfuscatedName("u")
   double field1972;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 791155207
   )
   int field1961;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 765614089
   )
   int field1964;
   @ObfuscatedName("b")
   double field1962;
   @ObfuscatedName("t")
   double field1973;
   @ObfuscatedName("x")
   double field1975;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -339928559
   )
   int field1956;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 413519043
   )
   int field1967;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1908018201
   )
   int field1958;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 23691669
   )
   int field1960;
   @ObfuscatedName("g")
   double field1969;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1078438503
   )
   int field1957;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1056086609
   )
   int field1978;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Ljw;"
   )
   class321 field1977;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1294297049
   )
   int field1965;

   class203(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.field1971 = false;
      this.field1978 = 0;
      this.field1966 = 0;
      this.field1980 = var1;
      this.field1956 = var2;
      this.field1957 = var3;
      this.field1958 = var4;
      this.field1964 = var5;
      this.field1961 = var6;
      this.field1976 = var7;
      this.field1963 = var8;
      this.field1959 = var9;
      this.field1965 = var10;
      this.field1960 = var11;
      this.field1971 = false;
      int var12 = class38.method619(this.field1980).field872;
      if(var12 != -1) {
         this.field1977 = class182.method3192(var12);
      } else {
         this.field1977 = null;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-29195413"
   )
   final void method3473(int var1, int var2, int var3, int var4) {
      this.projectileMoved(var1, var2, var3, var4);
      double var5;
      if(!this.field1971) {
         var5 = (double)(var1 - this.field1957);
         double var7 = (double)(var2 - this.field1958);
         double var9 = Math.sqrt(var5 * var5 + var7 * var7);
         this.field1975 = (double)this.field1957 + (double)this.field1959 * var5 / var9;
         this.field1968 = (double)this.field1958 + (double)this.field1959 * var7 / var9;
         this.field1969 = (double)this.field1964;
      }

      var5 = (double)(this.field1976 + 1 - var4);
      this.field1970 = ((double)var1 - this.field1975) / var5;
      this.field1962 = ((double)var2 - this.field1968) / var5;
      this.field1972 = Math.sqrt(this.field1970 * this.field1970 + this.field1962 * this.field1962);
      if(!this.field1971) {
         this.field1973 = -this.field1972 * Math.tan(0.02454369D * (double)this.field1963);
      }

      this.field1974 = ((double)var3 - this.field1969 - this.field1973 * var5) * 2.0D / (var5 * var5);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(S)Lds;"
   )
   protected final class200 vmethod5291(short var1) {
      class90 var2 = class38.method619(this.field1980);
      class200 var3 = var2.method1615(this.field1978);
      if(var3 == null) {
         return null;
      } else {
         var3.method3384(this.field1967);
         return var3;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "11659523"
   )
   final void method3466(int var1) {
      this.field1971 = true;
      this.field1975 += (double)var1 * this.field1970;
      this.field1968 += this.field1962 * (double)var1;
      this.field1969 += 0.5D * this.field1974 * (double)var1 * (double)var1 + (double)var1 * this.field1973;
      this.field1973 += (double)var1 * this.field1974;
      this.field1979 = (int)(Math.atan2(this.field1970, this.field1962) * 325.949D) + 1024 & 2047;
      this.field1967 = (int)(Math.atan2(this.field1973, this.field1972) * 325.949D) & 2047;
      if(this.field1977 != null) {
         this.field1966 += var1;

         while(true) {
            do {
               do {
                  if(this.field1966 <= this.field1977.field3418[this.field1978]) {
                     return;
                  }

                  this.field1966 -= this.field1977.field3418[this.field1978];
                  ++this.field1978;
               } while(this.field1978 < this.field1977.field3426.length);

               this.field1978 -= this.field1977.field3420;
            } while(this.field1978 >= 0 && this.field1978 < this.field1977.field3426.length);

            this.field1978 = 0;
         }
      }
   }

   public int getRsInteracting() {
      return this.field1965;
   }

   public void projectileMoved(int var1, int var2, int var3, int var4) {
      LocalPoint var5 = new LocalPoint(var1, var2);
      ProjectileMoved var6 = new ProjectileMoved();
      var6.setProjectile(this);
      var6.setPosition(var5);
      var6.setZ(var3);
      class113.field1064.getCallbacks().post(var6);
   }

   public int getEndCycle() {
      return this.field1976;
   }

   public int getRemainingCycles() {
      int var1 = class113.field1064.getGameCycle();
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
            RSNPC[] var4 = class113.field1064.getCachedNPCs();
            return var4[var2];
         } else {
            var2 = -var1 - 1;
            if(var2 == class113.field1064.getLocalInteractingIndex()) {
               return class113.field1064.getLocalPlayer();
            } else {
               RSPlayer[] var3 = class113.field1064.getCachedPlayers();
               return var3[var2];
            }
         }
      }
   }

   public int getId() {
      return this.field1980;
   }

   public int getFloor() {
      return this.field1956;
   }

   public int getX1() {
      return this.field1957;
   }

   public int getY1() {
      return this.field1958;
   }

   public int getHeight() {
      return this.field1964;
   }

   public int getEndHeight() {
      return this.field1960;
   }

   public int getStartMovementCycle() {
      return this.field1961;
   }

   public int getSlope() {
      return this.field1963;
   }

   public int getStartHeight() {
      return this.field1959;
   }

   public double getX() {
      return this.field1975;
   }

   public double getY() {
      return this.field1968;
   }

   public double getZ() {
      return this.field1969;
   }

   public double getVelocityX() {
      return this.field1970;
   }

   public double getVelocityY() {
      return this.field1962;
   }

   public double getScalar() {
      return this.field1972;
   }

   public double getVelocityZ() {
      return this.field1973;
   }

   @ObfuscatedName("f")
   static double method3476(double var0) {
      return Math.exp(-var0 * var0 / 2.0D) / Math.sqrt(6.283185307179586D);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(CI)C",
      garbageValue = "1998091092"
   )
   static char method3475(char var0) {
      return var0 != 181 && var0 != 131?Character.toTitleCase(var0):var0;
   }
}
