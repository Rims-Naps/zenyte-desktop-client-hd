package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
public class class34 {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1109878989
   )
   public int field267;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 830474509
   )
   public int field268;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1058484939
   )
   public int field266;

   @ObfuscatedSignature(
      signature = "(Lhx;)V"
   )
   public class34(class34 var1) {
      this.field267 = var1.field267;
      this.field268 = var1.field268;
      this.field266 = var1.field266;
   }

   public class34(int var1, int var2, int var3) {
      this.field267 = var1;
      this.field268 = var2;
      this.field266 = var3;
   }

   public class34() {
      this.field267 = -1;
   }

   public class34(int var1) {
      if(var1 == -1) {
         this.field267 = -1;
      } else {
         this.field267 = var1 >> 28 & 3;
         this.field268 = var1 >> 14 & 16383;
         this.field266 = var1 & 16383;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "1543859539"
   )
   public void method566(int var1, int var2, int var3) {
      this.field267 = var1;
      this.field268 = var2;
      this.field266 = var3;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "16"
   )
   public int method555() {
      return this.field267 << 28 | this.field268 << 14 | this.field266;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "1"
   )
   String method564(String var1) {
      return this.field267 + var1 + (this.field268 >> 6) + var1 + (this.field266 >> 6) + var1 + (this.field268 & 63) + var1 + (this.field266 & 63);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lhx;I)Z",
      garbageValue = "-339655228"
   )
   boolean method556(class34 var1) {
      return this.field267 != var1.field267?false:(this.field268 != var1.field268?false:this.field266 == var1.field266);
   }

   public int hashCode() {
      return this.method555();
   }

   public boolean equals(Object var1) {
      return this == var1?true:(!(var1 instanceof class34)?false:this.method556((class34)var1));
   }

   public String toString() {
      return this.method564(",");
   }
}
