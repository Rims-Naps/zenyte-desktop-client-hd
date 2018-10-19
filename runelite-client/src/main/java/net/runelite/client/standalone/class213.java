package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSVarbit;

@ObfuscatedName("jg")
public class class213 extends class193 implements RSVarbit {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class148 field2065;
   @ObfuscatedName("lg")
   @ObfuscatedGetter(
      intValue = -705992085
   )
   static int field2059;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   public static class124 field2060;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 402278997
   )
   public int field2064;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -118753729
   )
   public int field2063;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -893503857
   )
   public int field2061;

   static {
      field2060 = new class124(64);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgm;B)V",
      garbageValue = "34"
   )
   public void method3747(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method3748(var1, var2);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "1888141964"
   )
   void method3748(Buffer var1, int var2) {
      if(var2 == 1) {
         this.field2061 = var1.readUnsignedShort();
         this.field2063 = var1.readUnsignedByte();
         this.field2064 = var1.readUnsignedByte();
      }

   }

   public int getIndex() {
      return this.field2061;
   }

   public int getLeastSignificantBit() {
      return this.field2063;
   }

   public int getMostSignificantBit() {
      return this.field2064;
   }
}
