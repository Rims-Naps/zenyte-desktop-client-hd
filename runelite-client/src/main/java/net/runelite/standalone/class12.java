package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class12 extends class197 {
   @ObfuscatedName("rf")
   @ObfuscatedGetter(
      intValue = -938240223
   )
   static int field129;
   @ObfuscatedName("h")
   public static String field122;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1079467491
   )
   static int field125;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "[Lfl;"
   )
   static class12[] field124;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1039559281
   )
   int field120;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 457219733
   )
   public int field123;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lfg;"
   )
   ClientProt field127;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgl;"
   )
   public class1 field121;

   static {
      field124 = new class12[300];
      field125 = 0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1703472942"
   )
   public void method188() {
      if(field125 < field124.length) {
         field124[++field125 - 1] = this;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lfq;I)V",
      garbageValue = "1868085296"
   )
   public static void method196(class250 var0) {
      class155.field1905 = var0;
   }
}
