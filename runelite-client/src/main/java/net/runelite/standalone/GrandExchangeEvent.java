package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
public class GrandExchangeEvent {
   @ObfuscatedName("ez")
   @ObfuscatedGetter(
      intValue = -651470897
   )
   static int port2;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      longValue = -6223239709977332663L
   )
   public final long field16;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lc;"
   )
   public final GrandExchangeOffer grandExchangeOffer;
   @ObfuscatedName("q")
   String string1;
   @ObfuscatedName("c")
   String string2;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 269597171
   )
   public final int world;

   @ObfuscatedSignature(
      signature = "(Lgl;BI)V"
   )
   GrandExchangeEvent(Packet var1, byte var2, int var3) {
      this.string1 = var1.readString();
      this.string2 = var1.readString();
      this.world = var1.method6080();
      this.field16 = var1.method6084();
      int var4 = var1.method6201();
      int var5 = var1.method6201();
      this.grandExchangeOffer = new GrandExchangeOffer();
      this.grandExchangeOffer.method2887(2);
      this.grandExchangeOffer.method2869(var2);
      this.grandExchangeOffer.price = var4;
      this.grandExchangeOffer.totalQuantity = var5;
      this.grandExchangeOffer.quantitySold = 0;
      this.grandExchangeOffer.spent = 0;
      this.grandExchangeOffer.itemId = var3;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-1458167475"
   )
   public String method807() {
      return this.string2;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-1729189061"
   )
   public String method806() {
      return this.string1;
   }

   @ObfuscatedName("fg")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "613630657"
   )
   static void method812() {
      Client.serverConnection.method5882();
      Client.serverConnection.clientPacket.offset = 0;
      Client.serverConnection.currentPacket = null;
      Client.serverConnection.field1295 = null;
      Client.serverConnection.field1284 = null;
      Client.serverConnection.field1278 = null;
      Client.serverConnection.currentPacketSize = 0;
      Client.serverConnection.field1287 = 0;
      Client.rebootTimer = 0;
      Client.menuOptionCount = 0;
      Client.onMenuOptionsChanged(-1);
      Client.isMenuOpen = false;
      Client.minimapRenderType = 0;
      Client.destinationX = 0;

      int var0;
      for(var0 = 0; var0 < 2048; ++var0) {
         Client.players[var0] = null;
         Client.cachedPlayersChanged(var0);
      }

      class4.localPlayer = null;

      for(var0 = 0; var0 < Client.npcs.length; ++var0) {
         NPCEntity var1 = Client.npcs[var0];
         if(var1 != null) {
            var1.interacting = -1;
            var1.interactingChanged(-1);
            var1.field966 = false;
         }
      }

      Size.method4688();
      class310.method5922(30);

      for(var0 = 0; var0 < 100; ++var0) {
         Client.field848[var0] = true;
      }

      class48.method778();
   }

   @ObfuscatedName("jr")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   static final void method808() {
      class166.method2810();
      if(TotalQuantityComparator.clanMemberManager != null) {
         TotalQuantityComparator.clanMemberManager.method4644();
      }

   }
}
