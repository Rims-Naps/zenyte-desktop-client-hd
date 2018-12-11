package net.runelite.standalone;

import net.runelite.api.GrandExchangeOfferState;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSGrandExchangeOffer;

@ObfuscatedName("e")
public class class307 implements RSGrandExchangeOffer {
   @ObfuscatedName("ge")
   @ObfuscatedSignature(
      signature = "Llp;"
   )
   static SpritePixels field3798;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1242815419
   )
   public int field3792;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1068208425
   )
   public int field3794;
   @ObfuscatedName("f")
   byte field3800;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1080754691
   )
   public int field3796;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -147325229
   )
   public int field3795;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1854228693
   )
   public int field3799;

   public class307() {
   }

   @ObfuscatedSignature(
      signature = "(Lgm;Z)V",
      garbageValue = "0"
   )
   public class307(Buffer var1, boolean var2) {
      this.field3800 = var1.method2257();
      this.field3792 = var1.readUnsignedShort();
      this.field3799 = var1.readInt();
      this.field3794 = var1.readInt();
      this.field3795 = var1.readInt();
      this.field3796 = var1.readInt();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1180380057"
   )
   public int method6038() {
      return this.field3800 & 7;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-197641517"
   )
   void method6036(int var1) {
      this.field3800 &= -8;
      this.field3800 = (byte)(this.field3800 | var1 & 7);
   }

   public byte getRSState() {
      return this.field3800;
   }

   public int getQuantitySold() {
      return this.field3795;
   }

   public int getTotalQuantity() {
      return this.field3794;
   }

   public GrandExchangeOfferState getState() {
      byte var1 = this.getRSState();
      boolean var2 = (var1 & 8) == 8;
      boolean var3 = (var1 & 4) == 4;
      return var1 == 0?GrandExchangeOfferState.EMPTY:(var3 && this.getQuantitySold() < this.getTotalQuantity()?(var2?GrandExchangeOfferState.CANCELLED_SELL:GrandExchangeOfferState.CANCELLED_BUY):(var2?(var3?GrandExchangeOfferState.SOLD:GrandExchangeOfferState.SELLING):(var3?GrandExchangeOfferState.BOUGHT:GrandExchangeOfferState.BUYING)));
   }

   public int getItemId() {
      return this.field3792;
   }

   public int getPrice() {
      return this.field3799;
   }

   public int getSpent() {
      return this.field3796;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1710137770"
   )
   void method6041(int var1) {
      this.field3800 &= -9;
      if(var1 == 1) {
         this.field3800 = (byte)(this.field3800 | 8);
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "1"
   )
   public int method6039() {
      return (this.field3800 & 8) == 8?1:0;
   }

   @ObfuscatedName("ks")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "999388232"
   )
   static void method6051(Buffer var0, int var1) {
      byte[] var2 = var0.field1694;
      if(client.field2254 == null) {
         client.field2254 = new byte[24];
      }

      class29.method486(var2, var1, client.field2254, 0, 24);
      class317.method6213(var0, var1);
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2037429194"
   )
   static final void method6050() {
      WorldMapData.method2707("Your friend list is full. Max of 200 for free users, and 400 for members");
   }
}
