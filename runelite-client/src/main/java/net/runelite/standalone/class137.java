package net.runelite.standalone;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
public class class137 {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lfw;"
   )
   ServerProt field1769;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1247040265
   )
   int field1768;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lfw;"
   )
   ServerProt field1759;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgk;"
   )
   class41 field1763;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgm;"
   )
   class125 field1761;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lfo;"
   )
   class36 field1765;
   @ObfuscatedName("r")
   boolean field1766;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 146041465
   )
   int field1767;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lfw;"
   )
   ServerProt field1758;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Lfw;"
   )
   ServerProt field1771;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1799795707
   )
   int field1762;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lgl;"
   )
   class1 field1764;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lgy;"
   )
   public class216 field1770;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -678213983
   )
   int field1760;

   class137() {
      this.field1763 = new class41();
      this.field1760 = 0;
      this.field1761 = new class125(5000);
      this.field1764 = new class1(40000);
      this.field1759 = null;
      this.field1768 = 0;
      this.field1766 = true;
      this.field1767 = 0;
      this.field1762 = 0;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)Lfo;",
      garbageValue = "1800182922"
   )
   class36 method2586() {
      return this.field1765;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-25"
   )
   void method2576() {
      this.field1765 = null;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1205802932"
   )
   final void method2591() throws IOException {
      if(this.field1765 != null && this.field1760 > 0) {
         this.field1761.field1693 = 0;

         while(true) {
            class12 var1 = (class12)this.field1763.method745();
            if(var1 == null || var1.field123 > this.field1761.field1694.length - this.field1761.field1693) {
               this.field1765.vmethod2791(this.field1761.field1694, 0, this.field1761.field1693);
               this.field1762 = 0;
               break;
            }

            this.field1761.method2251(var1.field121.field1694, 0, var1.field123);
            this.field1760 -= var1.field123;
            var1.method3937();
            var1.field121.method2240();
            var1.method188();
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lfo;B)V",
      garbageValue = "-91"
   )
   void method2574(class36 var1) {
      this.field1765 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1956041059"
   )
   final void method2571() {
      this.field1763.method753();
      this.field1760 = 0;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1432854054"
   )
   void method2592() {
      if(this.field1765 != null) {
         this.field1765.vmethod2787();
         this.field1765 = null;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lfl;B)V",
      garbageValue = "2"
   )
   public final void method2573(class12 var1) {
      this.field1763.method748(var1);
      var1.field123 = var1.field121.field1693;
      var1.field121.field1693 = 0;
      this.field1760 += var1.field123;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "-67"
   )
   static int method2588(int var0) {
      class55 var1 = (class55)class38.field367.get(Integer.valueOf(var0));
      return var1 == null?0:var1.method1230();
   }
}
