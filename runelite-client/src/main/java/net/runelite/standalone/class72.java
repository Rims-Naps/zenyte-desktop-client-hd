package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSVarbit;

@ObfuscatedName("jg")
public class class72 extends class324 implements RSVarbit {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   public static class100 field827;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static Js5Index field832;
   @ObfuscatedName("lg")
   @ObfuscatedGetter(
      intValue = -705992085
   )
   static int field826;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -118753729
   )
   public int field830;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 402278997
   )
   public int field831;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -893503857
   )
   public int field828;

   static {
      field827 = new class100(64);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "1888141964"
   )
   void method1544(Buffer var1, int var2) {
      if(var2 == 1) {
         this.field828 = var1.readUnsignedShort();
         this.field830 = var1.readUnsignedByte();
         this.field831 = var1.readUnsignedByte();
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgm;B)V",
      garbageValue = "34"
   )
   public void method1543(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method1544(var1, var2);
      }
   }

   public int getIndex() {
      return this.field828;
   }

   public int getLeastSignificantBit() {
      return this.field830;
   }

   public int getMostSignificantBit() {
      return this.field831;
   }
}
