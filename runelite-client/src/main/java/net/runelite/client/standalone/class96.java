package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
public class class96 implements class43 {
   @ObfuscatedName("gx")
   static byte[][] field909;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -454208051
   )
   int field910;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1077051675
   )
   int field907;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1882213079
   )
   int field904;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -2096361565
   )
   int field908;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1344968629
   )
   int field903;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1204338173
   )
   int field906;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lh;B)V",
      garbageValue = "-105"
   )
   public void vmethod3479(class87 var1) {
      if(var1.field793 > this.field907) {
         var1.field793 = this.field907;
      }

      if(var1.field794 < this.field907) {
         var1.field794 = this.field907;
      }

      if(var1.field789 > this.field903) {
         var1.field789 = this.field903;
      }

      if(var1.field796 < this.field903) {
         var1.field796 = this.field903;
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-552683838"
   )
   void method1668() {
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "116686342"
   )
   public void vmethod3484(Buffer var1) {
      this.field910 = var1.readUnsignedByte();
      this.field904 = var1.readUnsignedByte();
      this.field906 = var1.readUnsignedShort();
      this.field908 = var1.readUnsignedShort();
      this.field907 = var1.readUnsignedShort();
      this.field903 = var1.readUnsignedShort();
      this.method1668();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIB)Lhx;",
      garbageValue = "26"
   )
   public class34 vmethod3483(int var1, int var2) {
      if(!this.vmethod3489(var1, var2)) {
         return null;
      } else {
         int var3 = this.field906 * 64 - this.field907 * 64 + var1;
         int var4 = this.field908 * 64 - this.field903 * 64 + var2;
         return new class34(this.field910, var3, var4);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIIB)Z",
      garbageValue = "37"
   )
   public boolean vmethod3480(int var1, int var2, int var3) {
      return var1 >= this.field910 && var1 < this.field910 + this.field904?var2 >> 6 == this.field906 && var3 >> 6 == this.field908:false;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIII)[I",
      garbageValue = "-161024515"
   )
   public int[] vmethod3482(int var1, int var2, int var3) {
      if(!this.vmethod3480(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field907 * 64 - this.field906 * 64 + var2, var3 + (this.field903 * 64 - this.field908 * 64)};
         return var4;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)Z",
      garbageValue = "16"
   )
   public boolean vmethod3489(int var1, int var2) {
      return var1 >> 6 == this.field907 && var2 >> 6 == this.field903;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1564402340"
   )
   public static boolean method1684() {
      return class227.field2232 != 0?true:class227.field2234.method307();
   }

   @ObfuscatedName("jx")
   @ObfuscatedSignature(
      signature = "(Lhw;I)V",
      garbageValue = "173105541"
   )
   static final void method1673(class329 var0) {
      int var1 = var0.field3548;
      if(var1 == 324) {
         if(client.field3996 == -1) {
            client.field3996 = var0.field3579;
            client.field3997 = var0.field3626;
         }

         if(client.field3854.field344) {
            var0.field3579 = client.field3996;
         } else {
            var0.field3579 = client.field3997;
         }

      } else if(var1 == 325) {
         if(client.field3996 == -1) {
            client.field3996 = var0.field3579;
            client.field3997 = var0.field3626;
         }

         if(client.field3854.field344) {
            var0.field3579 = client.field3997;
         } else {
            var0.field3579 = client.field3996;
         }

      } else if(var1 == 327) {
         var0.field3673 = 150;
         var0.field3596 = (int)(Math.sin((double)client.field3744 / 40.0D) * 256.0D) & 2047;
         var0.field3552 = 5;
         var0.field3588 = 0;
      } else if(var1 == 328) {
         var0.field3673 = 150;
         var0.field3596 = (int)(Math.sin((double)client.field3744 / 40.0D) * 256.0D) & 2047;
         var0.field3552 = 5;
         var0.field3588 = 1;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)Lfl;",
      garbageValue = "305300105"
   )
   public static class279 method1671() {
      class279 var0 = class57.method1017();
      var0.field3024 = null;
      var0.field3017 = 0;
      var0.field3018 = new class214(5000);
      return var0;
   }
}
