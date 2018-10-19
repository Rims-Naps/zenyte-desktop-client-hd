package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSName;

@ObfuscatedName("ka")
public class class49 implements Comparable, RSName {
   @ObfuscatedName("nw")
   @ObfuscatedGetter(
      intValue = -808143485
   )
   static int field370;
   @ObfuscatedName("f")
   String field369;
   @ObfuscatedName("l")
   String field367;

   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Lly;)V"
   )
   public class49(String var1, class179 var2) {
      this.field369 = var1;
      this.field367 = class275.method4915(var1, var2);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-1572146108"
   )
   public String method821() {
      return this.field369;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(S)Z",
      garbageValue = "21686"
   )
   public boolean method822() {
      return this.field367 != null;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lka;I)I",
      garbageValue = "-214557897"
   )
   public int method840(class49 var1) {
      return this.field367 == null?(var1.field367 == null?0:1):(var1.field367 == null?-1:this.field367.compareTo(var1.field367));
   }

   public boolean equals(Object var1) {
      if(var1 instanceof class49) {
         class49 var2 = (class49)var1;
         return this.field367 == null?var2.field367 == null:(var2.field367 == null?false:(this.hashCode() != var2.hashCode()?false:this.field367.equals(var2.field367)));
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.field367 == null?0:this.field367.hashCode();
   }

   public int compareTo(Object var1) {
      return this.method840((class49)var1);
   }

   public String toString() {
      return this.method821();
   }

   public String getName() {
      return this.field369;
   }
}
