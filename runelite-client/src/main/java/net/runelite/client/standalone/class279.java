package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class279 extends class76 {
   @ObfuscatedName("rf")
   @ObfuscatedGetter(
      intValue = -938240223
   )
   static int field3026;
   @ObfuscatedName("h")
   public static String field3019;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "[Lfl;"
   )
   static class279[] field3021;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1079467491
   )
   static int field3022;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lfg;"
   )
   ClientProt field3024;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1039559281
   )
   int field3017;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 457219733
   )
   public int field3020;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgl;"
   )
   public class214 field3018;

   static {
      field3021 = new class279[300];
      field3022 = 0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1703472942"
   )
   public void method4949() {
      if(field3022 < field3021.length) {
         field3021[++field3022 - 1] = this;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lfq;I)V",
      garbageValue = "1868085296"
   )
   public static void method4957(class165 var0) {
      class256.field2538 = var0;
   }
}
