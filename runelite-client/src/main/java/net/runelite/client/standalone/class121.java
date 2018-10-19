package net.runelite.client.standalone;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
public class class121 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lfo;"
   )
   class314 field1157;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Lfw;"
   )
   ServerProt field1163;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 146041465
   )
   int field1159;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lfw;"
   )
   ServerProt field1161;
   @ObfuscatedName("r")
   boolean field1158;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1247040265
   )
   int packetLength;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lfw;"
   )
   ServerProt field1151;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lgy;"
   )
   public class298 field1162;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lfw;"
   )
   ServerProt field1150;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgk;"
   )
   class60 field1155;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgm;"
   )
   Buffer field1153;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lgl;"
   )
   class214 field1156;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -678213983
   )
   int field1152;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1799795707
   )
   int field1154;

   class121() {
      this.field1155 = new class60();
      this.field1152 = 0;
      this.field1153 = new Buffer(5000);
      this.field1156 = new class214(40000);
      this.field1151 = null;
      this.packetLength = 0;
      this.field1158 = true;
      this.field1159 = 0;
      this.field1154 = 0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1956041059"
   )
   final void method2233() {
      this.field1155.method1059();
      this.field1152 = 0;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)Lfo;",
      garbageValue = "1800182922"
   )
   class314 method2248() {
      return this.field1157;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-25"
   )
   void method2238() {
      this.field1157 = null;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1432854054"
   )
   void method2254() {
      if(this.field1157 != null) {
         this.field1157.vmethod5521();
         this.field1157 = null;
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1205802932"
   )
   final void method2253() throws IOException {
      if(this.field1157 != null && this.field1152 > 0) {
         this.field1153.field1073 = 0;

         while(true) {
            class279 var1 = (class279)this.field1155.method1051();
            if(var1 == null || var1.field3020 > this.field1153.field1074.length - this.field1153.field1073) {
               this.field1157.vmethod5520(this.field1153.field1074, 0, this.field1153.field1073);
               this.field1154 = 0;
               break;
            }

            this.field1153.method1900(var1.field3018.field1074, 0, var1.field3020);
            this.field1152 -= var1.field3020;
            var1.method1186();
            var1.field3018.method1889();
            var1.method4949();
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lfo;B)V",
      garbageValue = "-91"
   )
   void method2236(class314 var1) {
      this.field1157 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lfl;B)V",
      garbageValue = "2"
   )
   public final void method2235(class279 var1) {
      this.field1155.method1054(var1);
      var1.field3020 = var1.field3018.field1073;
      var1.field3018.field1073 = 0;
      this.field1152 += var1.field3020;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "-67"
   )
   static int method2250(int var0) {
      class210 var1 = (class210)class297.field3194.get(Integer.valueOf(var0));
      return var1 == null?0:var1.method3703();
   }
}
