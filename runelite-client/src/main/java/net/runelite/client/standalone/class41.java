package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
public class class41 {
   @ObfuscatedName("iz")
   @ObfuscatedGetter(
      intValue = 1300706815
   )
   static int field325;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      longValue = 2956917020021793085L
   )
   long field326;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 2026383073
   )
   int field324;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 532442409
   )
   int field323;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1817037721
   )
   int field317;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -2021029939
   )
   int field315;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      longValue = -4473892607294140087L
   )
   long field319;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      longValue = -735996441414952023L
   )
   long field316;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      longValue = -294433682679960665L
   )
   long field318;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      longValue = -9180982686570912283L
   )
   long field320;
   @ObfuscatedName("w")
   public boolean field321;

   public class41() {
      this.field326 = -1L;
      this.field316 = -1L;
      this.field321 = false;
      this.field318 = 0L;
      this.field319 = 0L;
      this.field320 = 0L;
      this.field315 = 0;
      this.field317 = 0;
      this.field323 = 0;
      this.field324 = 0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1805055792"
   )
   public void method698() {
      this.field326 = class234.method4170();
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "1903194256"
   )
   public void method704(Buffer var1) {
      class184.method3221(var1, this.field319);
      class184.method3221(var1, this.field318);
      class184.method3221(var1, this.field320);
      var1.writeShort(this.field315);
      var1.writeShort(this.field317);
      var1.writeShort(this.field323);
      var1.writeShort(this.field324);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-81"
   )
   public void method718() {
      this.method705();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1047926968"
   )
   public void method702() {
      this.field321 = false;
      this.field317 = 0;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2132974529"
   )
   public void method714() {
      if(-1L != this.field326) {
         this.field319 = class234.method4170() - this.field326;
         this.field326 = -1L;
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1050473015"
   )
   public void method705() {
      if(-1L != this.field316) {
         this.field318 = class234.method4170() - this.field316;
         this.field316 = -1L;
      }

      ++this.field323;
      this.field321 = true;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1270832105"
   )
   public void method699(int var1) {
      this.field316 = class234.method4170();
      this.field315 = var1;
   }

   @ObfuscatedName("jr")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "3"
   )
   static final void method722() {
      class279 var0 = class95.writeClientProt(ClientProt.JOIN_CLAN_CHAT, client.field3963.field1162);
      var0.field3018.writeByte(0);
      client.field3963.method2235(var0);
   }
}
