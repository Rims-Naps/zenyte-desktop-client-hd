package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSCombatInfo2;

@ObfuscatedName("jc")
public class class244 extends class324 implements RSCombatInfo2 {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   static class217 field3276;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class100 field3288;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class217 field3280;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   public static class100 field3278;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 161010643
   )
   public int field3277;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1911793667
   )
   public int field3285;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 605597161
   )
   public int field3284;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -968684683
   )
   public int field3282;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1025636039
   )
   public int field3283;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -2069570007
   )
   int field3286;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1134433951
   )
   int field3287;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 2146323479
   )
   public int field3289;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1222199023
   )
   public int field3279;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1667952951
   )
   public int field3275;

   static {
      field3278 = new class100(64);
      field3288 = new class100(64);
   }

   public class244() {
      this.field3284 = 255;
      this.field3282 = 255;
      this.field3283 = -1;
      this.field3289 = 1;
      this.field3285 = 70;
      this.field3286 = -1;
      this.field3287 = -1;
      this.field3279 = 30;
      this.field3277 = 0;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(B)Llp;",
      garbageValue = "102"
   )
   public SpritePixels method4938() {
      if(this.field3287 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field3288.method1813((long)this.field3287);
         if(var1 != null) {
            return var1;
         } else {
            var1 = class91.method1715(field3276, this.field3287, 0, (byte)48);
            if(var1 != null) {
               field3288.method1820(var1, (long)this.field3287);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgm;IB)V",
      garbageValue = "87"
   )
   void method4928(Buffer var1, int var2) {
      if(var2 == 1) {
         var1.readShort();
      } else if(var2 == 2) {
         this.field3284 = var1.readUnsignedByte();
      } else if(var2 == 3) {
         this.field3282 = var1.readUnsignedByte();
      } else if(var2 == 4) {
         this.field3283 = 0;
      } else if(var2 == 5) {
         this.field3285 = var1.readShort();
      } else if(var2 == 6) {
         var1.readUnsignedByte();
      } else if(var2 == 7) {
         this.field3286 = var1.method2293();
      } else if(var2 == 8) {
         this.field3287 = var1.method2293();
      } else if(var2 == 11) {
         this.field3283 = var1.readShort();
      } else if(var2 == 14) {
         this.field3279 = var1.readUnsignedByte();
      } else if(var2 == 15) {
         this.field3277 = var1.readUnsignedByte();
      }

   }

   public int getHealthScale() {
      return this.field3279;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Llp;",
      garbageValue = "-1015211348"
   )
   public SpritePixels method4929() {
      if(this.field3286 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field3288.method1813((long)this.field3286);
         if(var1 != null) {
            return var1;
         } else {
            var1 = class91.method1715(field3276, this.field3286, 0, (byte)47);
            if(var1 != null) {
               field3288.method1820(var1, (long)this.field3286);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "911400937"
   )
   public void method4941(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method4928(var1, var2);
      }
   }
}
