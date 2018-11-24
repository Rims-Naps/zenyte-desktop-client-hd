package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSJagexLoginType;

@ObfuscatedName("ly")
public class class258 implements RSJagexLoginType {
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static final class258 field3372;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static final class258 field3371;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static final class258 field3366;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static final class258 field3368;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   public static final class258 field3374;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   public static final class258 field3373;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static final class258 field3370;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static final class258 field3369;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static final class258 field3365;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1791765443
   )
   public final int field3367;
   @ObfuscatedName("d")
   final String field3375;

   static {
      field3374 = new class258(1, 0, "", "");
      field3366 = new class258(2, 1, "", "");
      field3365 = new class258(7, 2, "", "");
      field3368 = new class258(3, 3, "", "");
      field3369 = new class258(5, 4, "", "");
      field3370 = new class258(4, 5, "", "");
      field3371 = new class258(0, 6, "", "");
      field3372 = new class258(8, 7, "", "");
      field3373 = new class258(6, -1, "", "", true, new class258[]{field3374, field3366, field3365, field3369, field3368});
   }

   class258(int var1, int var2, String var3, String var4) {
      this.field3367 = var1;
      this.field3375 = var4;
   }

   @ObfuscatedSignature(
      signature = "(IILjava/lang/String;Ljava/lang/String;Z[Lly;)V"
   )
   class258(int var1, int var2, String var3, String var4, boolean var5, class258[] var6) {
      this.field3367 = var1;
      this.field3375 = var4;
   }

   public String toString() {
      return this.field3375;
   }
}
