package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSJagexLoginType;

@ObfuscatedName("ly")
public class class179 implements RSJagexLoginType {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   public static final class179 field1708;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   public static final class179 field1707;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static final class179 field1706;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static final class179 field1705;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static final class179 field1703;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static final class179 field1700;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static final class179 field1702;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static final class179 field1704;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   static final class179 field1699;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1791765443
   )
   public final int field1701;
   @ObfuscatedName("d")
   final String field1709;

   static {
      field1708 = new class179(1, 0, "", "");
      field1700 = new class179(2, 1, "", "");
      field1699 = new class179(7, 2, "", "");
      field1702 = new class179(3, 3, "", "");
      field1703 = new class179(5, 4, "", "");
      field1704 = new class179(4, 5, "", "");
      field1705 = new class179(0, 6, "", "");
      field1706 = new class179(8, 7, "", "");
      field1707 = new class179(6, -1, "", "", true, new class179[]{field1708, field1700, field1699, field1703, field1702});
   }

   class179(int var1, int var2, String var3, String var4) {
      this.field1701 = var1;
      this.field1709 = var4;
   }

   @ObfuscatedSignature(
      signature = "(IILjava/lang/String;Ljava/lang/String;Z[Lly;)V"
   )
   class179(int var1, int var2, String var3, String var4, boolean var5, class179[] var6) {
      this.field1701 = var1;
      this.field1709 = var4;
   }

   public String toString() {
      return this.field1709;
   }
}
