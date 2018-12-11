package net.runelite.standalone;

import net.runelite.api.ClanMemberRank;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSClanMember;

@ObfuscatedName("ja")
public class class272 extends class62 implements RSClanMember {
   @ObfuscatedName("gq")
   @ObfuscatedSignature(
      signature = "[Llp;"
   )
   static SpritePixels[] field3484;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lkg;"
   )
   class75 field3485;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lkg;"
   )
   class75 field3486;

   class272() {
      this.field3486 = class75.field850;
      this.field3485 = class75.field850;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1269355004"
   )
   void method5349() {
      this.field3485 = class202.field2845.field1948.method3030(super.field3985)?class75.field849:class75.field851;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-359434466"
   )
   public final boolean method5345() {
      if(this.field3486 == class75.field850) {
         this.method5364();
      }

      return this.field3486 == class75.field849;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-466866806"
   )
   void method5347() {
      this.field3485 = class75.field850;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-128"
   )
   void method5344() {
      this.field3486 = class75.field850;
   }

   public String getUsername() {
      return this.getRsName().getName();
   }

   public ClanMemberRank getRank() {
      return ClanMemberRank.valueOf(this.getRSRank());
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-958288408"
   )
   public final boolean method5350() {
      if(this.field3485 == class75.field850) {
         this.method5349();
      }

      return this.field3485 == class75.field849;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1005792798"
   )
   void method5364() {
      this.field3486 = class202.field2845.field1946.method3030(super.field3985)?class75.field849:class75.field851;
   }

   @ObfuscatedName("fd")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "1387379837"
   )
   static final void method5365(boolean var0) {
      if(var0) {
         client.field2191 = class39.field399?class2.field14:class2.field17;
      } else {
         client.field2191 = WorldMapNode.field2134.field853.containsKey(Integer.valueOf(class143.method2637(class39.field386)))?class2.field19:class2.field16;
      }

   }
}
