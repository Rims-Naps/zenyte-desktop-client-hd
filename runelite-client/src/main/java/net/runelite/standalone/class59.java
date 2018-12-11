package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
public class class59 implements class61 {
   @ObfuscatedName("gx")
   static byte[][] field727;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1882213079
   )
   int field722;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -2096361565
   )
   int field726;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -454208051
   )
   int field728;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1344968629
   )
   int field721;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1077051675
   )
   int field725;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1204338173
   )
   int field724;

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-552683838"
   )
   void method1277() {
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "116686342"
   )
   public void vmethod5267(Buffer var1) {
      this.field728 = var1.readUnsignedByte();
      this.field722 = var1.readUnsignedByte();
      this.field724 = var1.readUnsignedShort();
      this.field726 = var1.readUnsignedShort();
      this.field725 = var1.readUnsignedShort();
      this.field721 = var1.readUnsignedShort();
      this.method1277();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIIB)Z",
      garbageValue = "37"
   )
   public boolean vmethod5263(int var1, int var2, int var3) {
      return var1 >= this.field728 && var1 < this.field728 + this.field722?var2 >> 6 == this.field724 && var3 >> 6 == this.field726:false;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIII)[I",
      garbageValue = "-161024515"
   )
   public int[] vmethod5265(int var1, int var2, int var3) {
      if(!this.vmethod5263(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field725 * 64 - this.field724 * 64 + var2, var3 + (this.field721 * 64 - this.field726 * 64)};
         return var4;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lh;B)V",
      garbageValue = "-105"
   )
   public void vmethod5276(WorldMapData var1) {
      if(var1.field1843 > this.field725) {
         var1.field1843 = this.field725;
      }

      if(var1.field1844 < this.field725) {
         var1.field1844 = this.field725;
      }

      if(var1.field1839 > this.field721) {
         var1.field1839 = this.field721;
      }

      if(var1.field1846 < this.field721) {
         var1.field1846 = this.field721;
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIB)Lhx;",
      garbageValue = "26"
   )
   public Location vmethod5264(int var1, int var2) {
      if(!this.vmethod5282(var1, var2)) {
         return null;
      } else {
         int var3 = this.field724 * 64 - this.field725 * 64 + var1;
         int var4 = this.field726 * 64 - this.field721 * 64 + var2;
         return new Location(this.field728, var3, var4);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)Z",
      garbageValue = "16"
   )
   public boolean vmethod5282(int var1, int var2) {
      return var1 >> 6 == this.field725 && var2 >> 6 == this.field721;
   }

   @ObfuscatedName("jx")
   @ObfuscatedSignature(
      signature = "(Lhw;I)V",
      garbageValue = "173105541"
   )
   static final void method1282(class187 var0) {
      int var1 = var0.field2562;
      if(var1 == 324) {
         if(client.field2417 == -1) {
            client.field2417 = var0.field2593;
            client.field2418 = var0.field2640;
         }

         if(client.field2275.field3964) {
            var0.field2593 = client.field2417;
         } else {
            var0.field2593 = client.field2418;
         }

      } else if(var1 == 325) {
         if(client.field2417 == -1) {
            client.field2417 = var0.field2593;
            client.field2418 = var0.field2640;
         }

         if(client.field2275.field3964) {
            var0.field2593 = client.field2418;
         } else {
            var0.field2593 = client.field2417;
         }

      } else if(var1 == 327) {
         var0.field2687 = 150;
         var0.field2610 = (int)(Math.sin((double)client.field2165 / 40.0D) * 256.0D) & 2047;
         var0.field2566 = 5;
         var0.field2602 = 0;
      } else if(var1 == 328) {
         var0.field2687 = 150;
         var0.field2610 = (int)(Math.sin((double)client.field2165 / 40.0D) * 256.0D) & 2047;
         var0.field2566 = 5;
         var0.field2602 = 1;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1564402340"
   )
   public static boolean method1293() {
      return class43.field481 != 0?true:class43.field483.method1433();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)Lfl;",
      garbageValue = "305300105"
   )
   public static class12 method1280() {
      class12 var0 = class236.method4711();
      var0.field127 = null;
      var0.field120 = 0;
      var0.field121 = new class1(5000);
      return var0;
   }
}
