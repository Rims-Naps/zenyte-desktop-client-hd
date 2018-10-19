package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
public class class183 extends class193 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class148 field1772;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class124 field1767;
   @ObfuscatedName("e")
   public String field1771;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1449440461
   )
   public int field1770;
   @ObfuscatedName("a")
   boolean field1768;
   @ObfuscatedName("w")
   char field1769;

   static {
      field1767 = new class124(64);
   }

   class183() {
      this.field1768 = true;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "1"
   )
   public boolean method3207() {
      return this.field1769 == 's';
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-29"
   )
   void method3198() {
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgm;IB)V",
      garbageValue = "44"
   )
   void method3196(Buffer var1, int var2) {
      if(var2 == 1) {
         this.field1769 = class300.method5193(var1.method1906());
      } else if(var2 == 2) {
         this.field1770 = var1.readInt();
      } else if(var2 == 4) {
         this.field1768 = false;
      } else if(var2 == 5) {
         this.field1771 = var1.readString();
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "-1661276391"
   )
   void method3194(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method3196(var1, var2);
      }
   }
}
