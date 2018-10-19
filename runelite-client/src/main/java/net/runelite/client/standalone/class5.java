package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
public enum class5 implements class91 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lj;"
   )
   field45(1, (byte)0),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lj;"
   )
   field35(0, (byte)1),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lj;"
   )
   field36(3, (byte)2),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lj;"
   )
   field38(2, (byte)3);

   @ObfuscatedName("pf")
   @ObfuscatedSignature(
      signature = "Llp;"
   )
   static class26 field44;
   @ObfuscatedName("je")
   @ObfuscatedSignature(
      signature = "Lbw;"
   )
   static class63 field43;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Lle;"
   )
   static class32 field37;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1996670107
   )
   final int field34;
   @ObfuscatedName("a")
   final byte field39;

   class5(int var3, byte var4) {
      this.field34 = var3;
      this.field39 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "87"
   )
   public int vmethod5937() {
      return this.field39;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;Lik;ZB)V",
      garbageValue = "33"
   )
   public static void method74(class148 var0, class148 var1, boolean var2) {
      class172.field1624 = var0;
      class172.field1591 = var1;
      class172.field1617 = var2;
   }

   @ObfuscatedName("ik")
   @ObfuscatedSignature(
      signature = "(Lhw;Ljs;IIZI)V",
      garbageValue = "1580177790"
   )
   static final void method73(class329 var0, class120 var1, int var2, int var3, boolean var4) {
      String[] var5 = var1.field1128;
      byte var6 = -1;
      String var7 = null;
      if(var5 != null && var5[var3] != null) {
         if(var3 == 0) {
            var6 = 33;
         } else if(var3 == 1) {
            var6 = 34;
         } else if(var3 == 2) {
            var6 = 35;
         } else if(var3 == 3) {
            var6 = 36;
         } else {
            var6 = 37;
         }

         var7 = var5[var3];
      } else if(var3 == 4) {
         var6 = 37;
         var7 = "Drop";
      }

      if(var6 != -1 && var7 != null) {
         class322.method5705(var7, class294.method5136(16748608) + var1.field1119, var6, var1.field1102, var2, var0.field3607, var4);
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(Ldm;B)V",
      garbageValue = "111"
   )
   static final void method72(class3 var0) {
      var0.field27 = false;
      if(var0.field28 != null) {
         var0.field28.field732 = 0;
      }

      for(class3 var1 = var0.vmethod4963(); var1 != null; var1 = var0.vmethod4973()) {
         method72(var1);
      }

   }

   @ObfuscatedName("hq")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "-7783"
   )
   static void method69() {
      client.field3869 = 0;
      client.onMenuOptionsChanged(-1);
      client.field3939 = false;
      client.field3874[0] = "Cancel";
      client.field3875[0] = "";
      client.field3872[0] = 1006;
      client.field3906[0] = false;
      client.field3869 = 1;
      client.onMenuOptionsChanged(-1);
   }
}
