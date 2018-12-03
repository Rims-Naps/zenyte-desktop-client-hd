package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("v")
public class class184 {
   @ObfuscatedName("dy")
   @ObfuscatedSignature(
      signature = "Lfo;"
   )
   static class36 field2507;
   @ObfuscatedName("bn")
   static String field2510;
   @ObfuscatedName("gd")
   @ObfuscatedSignature(
      signature = "[Llp;"
   )
   static SpritePixels[] field2505;
   @ObfuscatedName("dm")
   @ObfuscatedSignature(
      signature = "Led;"
   )
   static class128 field2503;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lhx;"
   )
   Location field2509;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1177274657
   )
   int field2508;

   @ObfuscatedSignature(
      signature = "(ILhx;)V"
   )
   class184(int var1, Location var2) {
      this.field2508 = var1;
      this.field2509 = var2;
   }

   @ObfuscatedName("iz")
   @ObfuscatedSignature(
      signature = "(IIIIIIII)V",
      garbageValue = "-1383210428"
   )
   static final void method3709(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if(class80.method1596(var0)) {
         class264.method5259(class187.field2547[var0], -1, var1, var2, var3, var4, var5, var6);
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1556609852"
   )
   public static boolean method3710(int var0) {
      return var0 == class264.field3416.field3433;
   }
}
