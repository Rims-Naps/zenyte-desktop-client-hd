package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
public class Location {
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 830474509
   )
   public int field719;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1109878989
   )
   public int field718;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1058484939
   )
   public int field717;

   @ObfuscatedSignature(
      signature = "(Lhx;)V"
   )
   public Location(Location var1) {
      this.field718 = var1.field718;
      this.field719 = var1.field719;
      this.field717 = var1.field717;
   }

   public Location(int var1, int var2, int var3) {
      this.field718 = var1;
      this.field719 = var2;
      this.field717 = var3;
   }

   public Location() {
      this.field718 = -1;
   }

   public Location(int var1) {
      if(var1 == -1) {
         this.field718 = -1;
      } else {
         this.field718 = var1 >> 28 & 3;
         this.field719 = var1 >> 14 & 16383;
         this.field717 = var1 & 16383;
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "16"
   )
   public int method1252() {
      return this.field718 << 28 | this.field719 << 14 | this.field717;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "1"
   )
   String method1261(String var1) {
      return this.field718 + var1 + (this.field719 >> 6) + var1 + (this.field717 >> 6) + var1 + (this.field719 & 63) + var1 + (this.field717 & 63);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "1543859539"
   )
   public void method1263(int var1, int var2, int var3) {
      this.field718 = var1;
      this.field719 = var2;
      this.field717 = var3;
   }

   public int hashCode() {
      return this.method1252();
   }

   public boolean equals(Object var1) {
      return this == var1?true:(!(var1 instanceof Location)?false:this.method1253((Location)var1));
   }

   public String toString() {
      return this.method1261(",");
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lhx;I)Z",
      garbageValue = "-339655228"
   )
   boolean method1253(Location var1) {
      return this.field718 != var1.field718?false:(this.field719 != var1.field719?false:this.field717 == var1.field717);
   }
}
