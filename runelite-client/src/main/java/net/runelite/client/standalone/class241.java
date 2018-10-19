package net.runelite.client.standalone;

import net.runelite.api.ClanMemberRank;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSClanMember;

@ObfuscatedName("ja")
public class class241 extends class305 implements RSClanMember {
   @ObfuscatedName("gq")
   @ObfuscatedSignature(
      signature = "[Llp;"
   )
   static class26[] field2414;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lkg;"
   )
   class149 field2416;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lkg;"
   )
   class149 field2415;

   class241() {
      this.field2416 = class149.field1427;
      this.field2415 = class149.field1427;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-128"
   )
   void method4267() {
      this.field2416 = class149.field1427;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1269355004"
   )
   void method4272() {
      this.field2415 = class295.field3180.field3522.method3624(super.field2417)?class149.field1426:class149.field1428;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-958288408"
   )
   public final boolean method4273() {
      if(this.field2415 == class149.field1427) {
         this.method4272();
      }

      return this.field2415 == class149.field1426;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-359434466"
   )
   public final boolean method4268() {
      if(this.field2416 == class149.field1427) {
         this.method4287();
      }

      return this.field2416 == class149.field1426;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-466866806"
   )
   void method4270() {
      this.field2415 = class149.field1427;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1005792798"
   )
   void method4287() {
      this.field2416 = class295.field3180.field3520.method3624(super.field2417)?class149.field1426:class149.field1428;
   }

   public String getUsername() {
      return this.getRsName().getName();
   }

   public ClanMemberRank getRank() {
      return ClanMemberRank.valueOf(this.getRSRank());
   }

   @ObfuscatedName("fd")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "1387379837"
   )
   static final void method4288(boolean var0) {
      if(var0) {
         client.field3770 = class325.field3493?class269.field2947:class269.field2950;
      } else {
         client.field3770 = class153.field1455.field1855.containsKey(Integer.valueOf(class273.method4903(class325.field3480)))?class269.field2952:class269.field2949;
      }

   }
}
