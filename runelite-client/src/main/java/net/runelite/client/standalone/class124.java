package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSCacheableNode;
import net.runelite.rs.api.RSNodeCache;

@ObfuscatedName("gd")
public final class class124 implements RSNodeCache {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lhe;"
   )
   class193 field1179;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lgt;"
   )
   class134 field1180;
   @ObfuscatedName("l")
   int field1177;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   class310 field1176;
   @ObfuscatedName("w")
   int field1178;

   public class124(int var1) {
      this.field1179 = new class193();
      this.field1180 = new class134();
      this.field1177 = var1;
      this.field1178 = var1;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
         ;
      }

      this.field1176 = new class310(var2);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(J)Lhe;"
   )
   public class193 method2268(long var1) {
      class193 var3 = (class193)this.field1176.method5310(var1);
      if(var3 != null) {
         this.field1180.method2470(var3);
      }

      return var3;
   }

   @ObfuscatedName("l")
   public void method2269(long var1) {
      class193 var3 = (class193)this.field1176.method5310(var1);
      if(var3 != null) {
         var3.method1186();
         var3.method3298();
         ++this.field1178;
      }

   }

   @ObfuscatedName("s")
   public void method2271() {
      this.field1180.method2484();
      this.field1176.method5311();
      this.field1179 = new class193();
      this.field1178 = this.field1177;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lhe;J)V"
   )
   public void method2275(class193 var1, long var2) {
      if(this.field1178 == 0) {
         class193 var4 = this.field1180.method2473();
         var4.method1186();
         var4.method3298();
         if(var4 == this.field1179) {
            var4 = this.field1180.method2473();
            var4.method1186();
            var4.method3298();
         }
      } else {
         --this.field1178;
      }

      this.field1176.method5309(var1, var2);
      this.field1180.method2470(var1);
   }

   public RSCacheableNode get(long var1) {
      return this.method2268(var1);
   }

   public void reset() {
      this.method2271();
   }
}
