package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSCacheableNode;
import net.runelite.rs.api.RSNodeCache;

@ObfuscatedName("gd")
public final class class100 implements RSNodeCache {
   @ObfuscatedName("l")
   int field1134;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   class98 field1133;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lhe;"
   )
   class324 field1136;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lgt;"
   )
   class50 field1137;
   @ObfuscatedName("w")
   int field1135;

   public class100(int var1) {
      this.field1136 = new class324();
      this.field1137 = new class50();
      this.field1134 = var1;
      this.field1135 = var1;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
         ;
      }

      this.field1133 = new class98(var2);
   }

   @ObfuscatedName("l")
   public void method1814(long var1) {
      class324 var3 = (class324)this.field1133.method1776(var1);
      if(var3 != null) {
         var3.method3937();
         var3.method6268();
         ++this.field1135;
      }

   }

   @ObfuscatedName("s")
   public void method1816() {
      this.field1137.method1071();
      this.field1133.method1777();
      this.field1136 = new class324();
      this.field1135 = this.field1134;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(J)Lhe;"
   )
   public class324 method1813(long var1) {
      class324 var3 = (class324)this.field1133.method1776(var1);
      if(var3 != null) {
         this.field1137.method1057(var3);
      }

      return var3;
   }

   public void setCapacity(int var1) {
      this.field1134 = var1;
   }

   public void setRemainingCapacity(int var1) {
      this.field1135 = var1;
   }

   public RSCacheableNode get(long var1) {
      return this.method1813(var1);
   }

   public void reset() {
      this.method1816();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lhe;J)V"
   )
   public void method1820(class324 var1, long var2) {
      if(this.field1135 == 0) {
         class324 var4 = this.field1137.method1060();
         var4.method3937();
         var4.method6268();
         if(var4 == this.field1136) {
            var4 = this.field1137.method1060();
            var4.method3937();
            var4.method6268();
         }
      } else {
         --this.field1135;
      }

      this.field1133.method1775(var1, var2);
      this.field1137.method1057(var1);
   }
}
