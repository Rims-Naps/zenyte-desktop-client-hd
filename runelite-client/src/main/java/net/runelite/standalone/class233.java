package net.runelite.standalone;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
public class class233 implements class61 {
   @ObfuscatedName("db")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class6 field3084;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -242921939
   )
   int field3095;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1005411413
   )
   int field3098;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1299278933
   )
   int field3094;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -448445123
   )
   int field3096;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1632971871
   )
   int field3085;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1071848565
   )
   int field3087;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1854374911
   )
   int field3092;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 832136827
   )
   int field3093;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1503941649
   )
   int field3090;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -54467315
   )
   int field3091;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 736522203
   )
   int field3088;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 2083214567
   )
   int field3089;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -768600013
   )
   int field3097;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -587962701
   )
   int field3086;

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-33"
   )
   void method4647() {
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "116686342"
   )
   public void vmethod5267(class125 var1) {
      this.field3087 = var1.method2256();
      this.field3096 = var1.method2256();
      this.field3086 = var1.method2258();
      this.field3094 = var1.method2256();
      this.field3092 = var1.method2256();
      this.field3085 = var1.method2258();
      this.field3098 = var1.method2256();
      this.field3093 = var1.method2256();
      this.field3097 = var1.method2258();
      this.field3088 = var1.method2256();
      this.field3090 = var1.method2256();
      this.field3089 = var1.method2258();
      this.field3095 = var1.method2256();
      this.field3091 = var1.method2256();
      this.method4647();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIIB)Z",
      garbageValue = "37"
   )
   public boolean vmethod5263(int var1, int var2, int var3) {
      return var1 >= this.field3087 && var1 < this.field3096 + this.field3087?var2 >= (this.field3086 << 6) + (this.field3094 << 3) && var2 <= (this.field3086 << 6) + (this.field3092 << 3) + 7 && var3 >= (this.field3085 << 6) + (this.field3098 << 3) && var3 <= (this.field3085 << 6) + (this.field3093 << 3) + 7:false;
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
         int[] var4 = new int[]{this.field3097 * 64 - this.field3086 * 64 + var2 + (this.field3088 * 8 - this.field3094 * 8), var3 + (this.field3089 * 64 - this.field3085 * 64) + (this.field3095 * 8 - this.field3098 * 8)};
         return var4;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lh;B)V",
      garbageValue = "-105"
   )
   public void vmethod5276(class149 var1) {
      if(var1.field1843 > this.field3097) {
         var1.field1843 = this.field3097;
      }

      if(var1.field1844 < this.field3097) {
         var1.field1844 = this.field3097;
      }

      if(var1.field1839 > this.field3089) {
         var1.field1839 = this.field3089;
      }

      if(var1.field1846 < this.field3089) {
         var1.field1846 = this.field3089;
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
         int var3 = this.field3086 * 64 - this.field3097 * 64 + (this.field3094 * 8 - this.field3088 * 8) + var1;
         int var4 = this.field3085 * 64 - this.field3089 * 64 + var2 + (this.field3098 * 8 - this.field3095 * 8);
         return new class58(this.field3087, var3, var4);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)Z",
      garbageValue = "16"
   )
   public boolean vmethod5282(int var1, int var2) {
      return var1 >= (this.field3097 << 6) + (this.field3088 << 3) && var1 <= (this.field3097 << 6) + (this.field3090 << 3) + 7 && var2 >= (this.field3089 << 6) + (this.field3095 << 3) && var2 <= (this.field3089 << 6) + (this.field3091 << 3) + 7;
   }

   @ObfuscatedName("hf")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "92"
   )
   static final boolean method4664(int var0) {
      if(var0 < 0) {
         return false;
      } else {
         int var1 = client.field2293[var0];
         if(var1 >= 2000) {
            var1 -= 2000;
         }

         return var1 == 1007;
      }
   }

   @ObfuscatedName("gw")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "892381008"
   )
   static boolean method4667() {
      return (client.field2383 & 8) != 0;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "28"
   )
   static void method4665() {
      Iterator var0 = class38.field366.iterator();

      while(var0.hasNext()) {
         class227 var1 = (class227)var0.next();
         var1.method4591();
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1478845197"
   )
   static final int method4663(int var0, int var1) {
      int var2 = class91.method1714(var0 - 1, var1 - 1) + class91.method1714(var0 + 1, var1 - 1) + class91.method1714(var0 - 1, var1 + 1) + class91.method1714(var0 + 1, 1 + var1);
      int var3 = class91.method1714(var0 - 1, var1) + class91.method1714(1 + var0, var1) + class91.method1714(var0, var1 - 1) + class91.method1714(var0, 1 + var1);
      int var4 = class91.method1714(var0, var1);
      return var2 / 16 + var3 / 8 + var4 / 4;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1486686086"
   )
   public static boolean method4653(int var0) {
      return var0 >= class264.field3430.field3433 && var0 <= class264.field3431.field3433;
   }
}
