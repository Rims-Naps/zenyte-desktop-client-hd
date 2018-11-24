package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSName;

@ObfuscatedName("ka")
public class class158 implements Comparable, RSName {
   @ObfuscatedName("nw")
   @ObfuscatedGetter(
      intValue = -808143485
   )
   static int field1945;
   @ObfuscatedName("l")
   String field1942;
   @ObfuscatedName("f")
   String field1944;

   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Lly;)V"
   )
   public class158(String var1, class258 var2) {
      this.field1944 = var1;
      this.field1942 = class107.method1891(var1, var2);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(S)Z",
      garbageValue = "21686"
   )
   public boolean method2870() {
      return this.field1942 != null;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "833079625"
   )
   public String method2869() {
      return this.field1944;
   }

   public boolean equals(Object var1) {
      if(var1 instanceof class158) {
         class158 var2 = (class158)var1;
         return this.field1942 == null?var2.field1942 == null:(var2.field1942 == null?false:(this.hashCode() != var2.hashCode()?false:this.field1942.equals(var2.field1942)));
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.field1942 == null?0:this.field1942.hashCode();
   }

   public int compareTo(Object var1) {
      return this.method2888((class158)var1);
   }

   public String toString() {
      return this.method2869();
   }

   public String getName() {
      return this.field1944;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lka;I)I",
      garbageValue = "-214557897"
   )
   public int method2888(class158 var1) {
      return this.field1942 == null?(var1.field1942 == null?0:1):(var1.field1942 == null?-1:this.field1942.compareTo(var1.field1942));
   }
}
