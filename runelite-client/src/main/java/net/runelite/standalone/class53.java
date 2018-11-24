package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
public class class53 {
   @ObfuscatedName("iz")
   @ObfuscatedGetter(
      intValue = 1300706815
   )
   static int field657;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1817037721
   )
   int field649;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -2021029939
   )
   int field647;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      longValue = -735996441414952023L
   )
   long field648;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      longValue = -294433682679960665L
   )
   long field650;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      longValue = 2956917020021793085L
   )
   long field658;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 532442409
   )
   int field655;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 2026383073
   )
   int field656;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      longValue = -9180982686570912283L
   )
   long field652;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      longValue = -4473892607294140087L
   )
   long field651;
   @ObfuscatedName("w")
   public boolean field653;

   public class53() {
      this.field658 = -1L;
      this.field648 = -1L;
      this.field653 = false;
      this.field650 = 0L;
      this.field651 = 0L;
      this.field652 = 0L;
      this.field647 = 0;
      this.field649 = 0;
      this.field655 = 0;
      this.field656 = 0;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "1903194256"
   )
   public void method1205(class125 var1) {
      class230.method4622(var1, this.field651);
      class230.method4622(var1, this.field650);
      class230.method4622(var1, this.field652);
      var1.method2242(this.field647);
      var1.method2242(this.field649);
      var1.method2242(this.field655);
      var1.method2242(this.field656);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-81"
   )
   public void method1219() {
      this.method1206();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2132974529"
   )
   public void method1215() {
      if(-1L != this.field658) {
         this.field651 = class321.method6252() - this.field658;
         this.field658 = -1L;
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1050473015"
   )
   public void method1206() {
      if(-1L != this.field648) {
         this.field650 = class321.method6252() - this.field648;
         this.field648 = -1L;
      }

      ++this.field655;
      this.field653 = true;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1805055792"
   )
   public void method1199() {
      this.field658 = class321.method6252();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1047926968"
   )
   public void method1203() {
      this.field653 = false;
      this.field649 = 0;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1270832105"
   )
   public void method1200(int var1) {
      this.field648 = class321.method6252();
      this.field647 = var1;
   }

   @ObfuscatedName("jr")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "3"
   )
   static final void method1223() {
      class12 var0 = class150.method2761(ClientProt.field3234, client.field2384.field1770);
      var0.field121.method2288(0);
      client.field2384.method2573(var0);
   }
}
