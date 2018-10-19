package net.runelite.client.standalone;

import net.runelite.api.GrandExchangeOfferState;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSGrandExchangeOffer;

@ObfuscatedName("e")
public class class150 implements RSGrandExchangeOffer {
   @ObfuscatedName("ge")
   @ObfuscatedSignature(
      signature = "Llp;"
   )
   static class26 field1436;
   @ObfuscatedName("f")
   byte field1438;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -147325229
   )
   public int field1433;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1242815419
   )
   public int field1430;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1068208425
   )
   public int field1432;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1080754691
   )
   public int field1434;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1854228693
   )
   public int field1437;

   public class150() {
   }

   @ObfuscatedSignature(
      signature = "(Lgm;Z)V",
      garbageValue = "0"
   )
   public class150(Buffer var1, boolean var2) {
      this.field1438 = var1.method1906();
      this.field1430 = var1.readUnsignedShort();
      this.field1437 = var1.readInt();
      this.field1432 = var1.readInt();
      this.field1433 = var1.readInt();
      this.field1434 = var1.readInt();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1710137770"
   )
   void method2682(int var1) {
      this.field1438 &= -9;
      if(var1 == 1) {
         this.field1438 = (byte)(this.field1438 | 8);
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1180380057"
   )
   public int method2679() {
      return this.field1438 & 7;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-197641517"
   )
   void method2677(int var1) {
      this.field1438 &= -8;
      this.field1438 = (byte)(this.field1438 | var1 & 7);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "1"
   )
   public int method2680() {
      return (this.field1438 & 8) == 8?1:0;
   }

   public byte getRSState() {
      return this.field1438;
   }

   public int getQuantitySold() {
      return this.field1433;
   }

   public int getTotalQuantity() {
      return this.field1432;
   }

   public GrandExchangeOfferState getState() {
      byte var1 = this.getRSState();
      boolean var2 = (var1 & 8) == 8;
      boolean var3 = (var1 & 4) == 4;
      return var1 == 0?GrandExchangeOfferState.EMPTY:(var3 && this.getQuantitySold() < this.getTotalQuantity()?(var2?GrandExchangeOfferState.CANCELLED_SELL:GrandExchangeOfferState.CANCELLED_BUY):(var2?(var3?GrandExchangeOfferState.SOLD:GrandExchangeOfferState.SELLING):(var3?GrandExchangeOfferState.BOUGHT:GrandExchangeOfferState.BUYING)));
   }

   public int getItemId() {
      return this.field1430;
   }

   public int getPrice() {
      return this.field1437;
   }

   public int getSpent() {
      return this.field1434;
   }

   @ObfuscatedName("ks")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "999388232"
   )
   static void method2692(Buffer var0, int var1) {
      byte[] var2 = var0.field1074;
      if(client.field3833 == null) {
         client.field3833 = new byte[24];
      }

      class196.method3308(var2, var1, client.field3833, 0, 24);
      class230.method4117(var0, var1);
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2037429194"
   )
   static final void method2691() {
      class87.method1275("Your friend list is full. Max of 200 for free users, and 400 for members");
   }
}
