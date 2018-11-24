package net.runelite.standalone;

import java.security.SecureRandom;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
public class class265 implements class61 {
   @ObfuscatedName("qf")
   @ObfuscatedGetter(
      intValue = -215507679
   )
   static int field3447;
   @ObfuscatedName("jc")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   static class187 field3448;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1680355133
   )
   int field3442;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -425743195
   )
   int field3444;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1358664481
   )
   int field3436;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1741002609
   )
   int field3437;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1478617083
   )
   int field3445;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -339587985
   )
   int field3443;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -7892127
   )
   int field3446;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1695834977
   )
   int field3440;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1956625221
   )
   int field3439;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 879720505
   )
   int field3435;

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-26"
   )
   void method5274() {
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "116686342"
   )
   public void vmethod5267(class125 var1) {
      this.field3445 = var1.method2256();
      this.field3436 = var1.method2256();
      this.field3435 = var1.method2258();
      this.field3437 = var1.method2258();
      this.field3439 = var1.method2258();
      this.field3440 = var1.method2258();
      this.field3444 = var1.method2258();
      this.field3442 = var1.method2258();
      this.field3443 = var1.method2258();
      this.field3446 = var1.method2258();
      this.method5274();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIIB)Z",
      garbageValue = "37"
   )
   public boolean vmethod5263(int var1, int var2, int var3) {
      return var1 >= this.field3445 && var1 < this.field3436 + this.field3445?var2 >> 6 >= this.field3435 && var2 >> 6 <= this.field3439 && var3 >> 6 >= this.field3437 && var3 >> 6 <= this.field3440:false;
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
         int[] var4 = new int[]{this.field3444 * 64 - this.field3435 * 64 + var2, var3 + (this.field3442 * 64 - this.field3437 * 64)};
         return var4;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lh;B)V",
      garbageValue = "-105"
   )
   public void vmethod5276(class149 var1) {
      if(var1.field1843 > this.field3444) {
         var1.field1843 = this.field3444;
      }

      if(var1.field1844 < this.field3443) {
         var1.field1844 = this.field3443;
      }

      if(var1.field1839 > this.field3442) {
         var1.field1839 = this.field3442;
      }

      if(var1.field1846 < this.field3446) {
         var1.field1846 = this.field3446;
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIB)Lhx;",
      garbageValue = "26"
   )
   public class58 vmethod5264(int var1, int var2) {
      if(!this.vmethod5282(var1, var2)) {
         return null;
      } else {
         int var3 = this.field3435 * 64 - this.field3444 * 64 + var1;
         int var4 = this.field3437 * 64 - this.field3442 * 64 + var2;
         return new class58(this.field3445, var3, var4);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)Z",
      garbageValue = "16"
   )
   public boolean vmethod5282(int var1, int var2) {
      return var1 >> 6 >= this.field3444 && var1 >> 6 <= this.field3443 && var2 >> 6 >= this.field3442 && var2 >> 6 <= this.field3446;
   }

   @ObfuscatedName("fa")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-350753717"
   )
   static void method5288() {
      int var0 = class152.field1874;
      int[] var1 = class152.field1875;

      for(int var2 = 0; var2 < var0; ++var2) {
         if(var1[var2] != client.field2343 && var1[var2] != client.field2186) {
            class213.method4359(client.field2269[var1[var2]], true);
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "1"
   )
   public static int method5286(int var0, int var1) {
      return (var0 + 40000 << 8) + var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)Ljava/security/SecureRandom;",
      garbageValue = "80"
   )
   static SecureRandom method5281() {
      SecureRandom var0 = new SecureRandom();
      var0.nextInt();
      return var0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Lil;",
      garbageValue = "1309066214"
   )
   public static class4 method5287(int var0) {
      class4 var1 = (class4)class4.field40.method1813((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class56.field704.method4398(15, var0, -1060101723);
         var1 = new class4();
         if(var2 != null) {
            var1.method84(new class125(var2));
         }

         class4.field40.method1820(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-2141620427"
   )
   public static boolean method5285(int var0, int var1) {
      return (var0 >> var1 + 1 & 1) != 0;
   }
}
