package net.runelite.standalone;

import java.io.File;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class class305 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Ldo;"
   )
   public static class18 field3779;
   @ObfuscatedName("lu")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   static class187 field3786;
   @ObfuscatedName("s")
   static File field3772;
   @ObfuscatedName("b")
   static String[] field3782;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Ldo;"
   )
   public static class18 field3777;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Ldo;"
   )
   public static class18 field3781;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1676815175
   )
   public static int field3775;
   @ObfuscatedName("e")
   static File field3776;

   static {
      field3779 = null;
      field3777 = null;
      field3781 = null;
   }

   @ObfuscatedName("go")
   @ObfuscatedSignature(
      signature = "(Lbn;II)V",
      garbageValue = "-1803926071"
   )
   static final void method6014(class99 var0, int var1) {
      class103.method1855(var0.field1090, var0.field1072, var1);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(ILhx;ZI)V",
      garbageValue = "-640327379"
   )
   static void method6013(int var0, class58 var1, boolean var2) {
      class149 var3 = class218.method4500().method5632(var0);
      int var4 = class32.field303.field2805;
      int var5 = (class32.field303.field1090 >> 7) + class229.field3067;
      int var6 = (class32.field303.field1072 >> 7) + class35.field360;
      class58 var7 = new class58(var4, var5, var6);
      class218.method4500().method5537(var3, var7, var1, var2);
   }
}
