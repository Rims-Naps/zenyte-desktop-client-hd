package net.runelite.client.standalone;

import java.io.File;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class class323 {
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Ldo;"
   )
   public static class211 field3458;
   @ObfuscatedName("lu")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   static class329 field3463;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Ldo;"
   )
   public static class211 field3456;
   @ObfuscatedName("e")
   static File field3453;
   @ObfuscatedName("b")
   static String[] field3459;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Ldo;"
   )
   public static class211 field3454;
   @ObfuscatedName("s")
   static File field3449;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1676815175
   )
   public static int field3452;

   static {
      field3456 = null;
      field3454 = null;
      field3458 = null;
   }

   @ObfuscatedName("go")
   @ObfuscatedSignature(
      signature = "(Lbn;II)V",
      garbageValue = "-1803926071"
   )
   static final void method5725(class133 var0, int var1) {
      class272.method4901(var0.field1277, var0.field1259, var1);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(ILhx;ZI)V",
      garbageValue = "-640327379"
   )
   static void method5724(int var0, class34 var1, boolean var2) {
      class87 var3 = class180.method3021().method1473(var0);
      int var4 = class5.field43.field580;
      int var5 = (class5.field43.field1277 >> 7) + class296.somex;
      int var6 = (class5.field43.field1259 >> 7) + class284.somey;
      class34 var7 = new class34(var4, var5, var6);
      class180.method3021().method1378(var3, var7, var1, var2);
   }
}
