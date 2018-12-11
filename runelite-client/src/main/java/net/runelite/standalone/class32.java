package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
public enum class32 implements class26 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lj;"
   )
   field305(1, (byte)0),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lj;"
   )
   field295(0, (byte)1),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lj;"
   )
   field296(3, (byte)2),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lj;"
   )
   field298(2, (byte)3);

   @ObfuscatedName("pf")
   @ObfuscatedSignature(
      signature = "Llp;"
   )
   static SpritePixels field304;
   @ObfuscatedName("je")
   @ObfuscatedSignature(
      signature = "Lbw;"
   )
   static class199 field303;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Lle;"
   )
   static class303 field297;
   @ObfuscatedName("a")
   final byte field299;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1996670107
   )
   final int field294;

   class32(int var3, byte var4) {
      this.field294 = var3;
      this.field299 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "87"
   )
   public int vmethod6234() {
      return this.field299;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(Ldm;B)V",
      garbageValue = "111"
   )
   static final void method533(class309 var0) {
      var0.field3815 = false;
      if(var0.field3816 != null) {
         var0.field3816.field3546 = 0;
      }

      for(class309 var1 = var0.vmethod6056(); var1 != null; var1 = var0.vmethod6059()) {
         method533(var1);
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;Lik;ZB)V",
      garbageValue = "33"
   )
   public static void method535(Js5Index var0, Js5Index var1, boolean var2) {
      ObjectDef.field182 = var0;
      ObjectDef.field149 = var1;
      ObjectDef.field175 = var2;
   }

   @ObfuscatedName("ik")
   @ObfuscatedSignature(
      signature = "(Lhw;Ljs;IIZI)V",
      garbageValue = "1580177790"
   )
   static final void method534(class187 var0, class42 var1, int var2, int var3, boolean var4) {
      String[] var5 = var1.field455;
      byte var6 = -1;
      String var7 = null;
      if(var5 != null && var5[var3] != null) {
         if(var3 == 0) {
            var6 = 33;
         } else if(var3 == 1) {
            var6 = 34;
         } else if(var3 == 2) {
            var6 = 35;
         } else if(var3 == 3) {
            var6 = 36;
         } else {
            var6 = 37;
         }

         var7 = var5[var3];
      } else if(var3 == 4) {
         var6 = 37;
         var7 = "Drop";
      }

      if(var6 != -1 && var7 != null) {
         WorldMapManager.method4155(var7, class64.method1354(16748608) + var1.field446, var6, var1.field429, var2, var0.field2621, var4);
      }

   }

   @ObfuscatedName("hq")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "-7783"
   )
   static void method530() {
      client.field2290 = 0;
      client.onMenuOptionsChanged(-1);
      client.field2360 = false;
      client.field2295[0] = "Cancel";
      client.field2296[0] = "";
      client.field2293[0] = 1006;
      client.field2327[0] = false;
      client.field2290 = 1;
      client.onMenuOptionsChanged(-1);
   }
}
