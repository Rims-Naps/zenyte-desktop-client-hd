package net.runelite.client.standalone;

import java.util.ArrayList;
import java.util.Collection;
import net.runelite.api.Node;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSHashTable;
import net.runelite.rs.api.RSNode;

@ObfuscatedName("gp")
public final class class310 implements RSHashTable {
   @ObfuscatedName("f")
   int field3291;
   @ObfuscatedName("e")
   int field3293;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "[Lgu;"
   )
   class76[] field3290;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   class76 field3289;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   class76 field3292;

   public class310(int var1) {
      this.field3293 = 0;
      this.field3291 = var1;
      this.field3290 = new class76[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class76 var3 = this.field3290[var2] = new class76();
         var3.field702 = var3;
         var3.field703 = var3;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(J)Lgu;"
   )
   public class76 method5310(long var1) {
      class76 var3 = this.field3290[(int)(var1 & (long)(this.field3291 - 1))];

      for(this.field3292 = var3.field702; var3 != this.field3292; this.field3292 = this.field3292.field702) {
         if(this.field3292.field704 == var1) {
            class76 var4 = this.field3292;
            this.field3292 = this.field3292.field702;
            return var4;
         }
      }

      this.field3292 = null;
      return null;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "()Lgu;"
   )
   public class76 method5313() {
      class76 var1;
      if(this.field3293 > 0 && this.field3290[this.field3293 - 1] != this.field3289) {
         var1 = this.field3289;
         this.field3289 = var1.field702;
         return var1;
      } else {
         do {
            if(this.field3293 >= this.field3291) {
               return null;
            }

            var1 = this.field3290[this.field3293++].field702;
         } while(var1 == this.field3290[this.field3293 - 1]);

         this.field3289 = var1.field702;
         return var1;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgu;J)V"
   )
   public void method5309(class76 var1, long var2) {
      if(var1.field703 != null) {
         var1.method1186();
      }

      class76 var4 = this.field3290[(int)(var2 & (long)(this.field3291 - 1))];
      var1.field703 = var4.field703;
      var1.field702 = var4;
      var1.field703.field702 = var1;
      var1.field702.field703 = var1;
      var1.field704 = var2;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "()Lgu;"
   )
   public class76 method5317() {
      this.field3293 = 0;
      return this.method5313();
   }

   @ObfuscatedName("w")
   void method5311() {
      for(int var1 = 0; var1 < this.field3291; ++var1) {
         class76 var2 = this.field3290[var1];

         while(true) {
            class76 var3 = var2.field702;
            if(var3 == var2) {
               break;
            }

            var3.method1186();
         }
      }

      this.field3292 = null;
      this.field3289 = null;
   }

   public RSNode[] getBuckets() {
      return this.field3290;
   }

   public Collection getNodes() {
      ArrayList var1 = new ArrayList();
      RSNode[] var2 = this.getBuckets();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         RSNode var4 = var2[var3];

         for(Node var5 = var4.getNext(); var5 != var4; var5 = var5.getNext()) {
            var1.add(var5);
         }
      }

      return var1;
   }

   public int getSize() {
      return this.field3291;
   }

   public RSNode get(long var1) {
      return this.method5310(var1);
   }
}
