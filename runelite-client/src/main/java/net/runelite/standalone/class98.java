package net.runelite.standalone;

import java.util.ArrayList;
import java.util.Collection;
import net.runelite.api.Node;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSHashTable;
import net.runelite.rs.api.RSNode;

@ObfuscatedName("gp")
public final class class98 implements RSHashTable {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "[Lgu;"
   )
   class197[] field1067;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   class197 field1066;
   @ObfuscatedName("f")
   int field1068;
   @ObfuscatedName("e")
   int field1070;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   class197 field1069;

   public class98(int var1) {
      this.field1070 = 0;
      this.field1068 = var1;
      this.field1067 = new class197[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class197 var3 = this.field1067[var2] = new class197();
         var3.field2790 = var3;
         var3.field2791 = var3;
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgu;J)V"
   )
   public void method1775(class197 var1, long var2) {
      if(var1.field2791 != null) {
         var1.method3937();
      }

      class197 var4 = this.field1067[(int)(var2 & (long)(this.field1068 - 1))];
      var1.field2791 = var4.field2791;
      var1.field2790 = var4;
      var1.field2791.field2790 = var1;
      var1.field2790.field2791 = var1;
      var1.field2792 = var2;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "()Lgu;"
   )
   public class197 method1783() {
      this.field1070 = 0;
      return this.method1779();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(J)Lgu;"
   )
   public class197 method1776(long var1) {
      class197 var3 = this.field1067[(int)(var1 & (long)(this.field1068 - 1))];

      for(this.field1069 = var3.field2790; var3 != this.field1069; this.field1069 = this.field1069.field2790) {
         if(this.field1069.field2792 == var1) {
            class197 var4 = this.field1069;
            this.field1069 = this.field1069.field2790;
            return var4;
         }
      }

      this.field1069 = null;
      return null;
   }

   public RSNode[] getBuckets() {
      return this.field1067;
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
      return this.field1068;
   }

   public RSNode get(long var1) {
      return this.method1776(var1);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "()Lgu;"
   )
   public class197 method1779() {
      class197 var1;
      if(this.field1070 > 0 && this.field1067[this.field1070 - 1] != this.field1066) {
         var1 = this.field1066;
         this.field1066 = var1.field2790;
         return var1;
      } else {
         do {
            if(this.field1070 >= this.field1068) {
               return null;
            }

            var1 = this.field1067[this.field1070++].field2790;
         } while(var1 == this.field1067[this.field1070 - 1]);

         this.field1066 = var1.field2790;
         return var1;
      }
   }

   @ObfuscatedName("w")
   void method1777() {
      for(int var1 = 0; var1 < this.field1068; ++var1) {
         class197 var2 = this.field1067[var1];

         while(true) {
            class197 var3 = var2.field2790;
            if(var3 == var2) {
               break;
            }

            var3.method3937();
         }
      }

      this.field1069 = null;
      this.field1066 = null;
   }
}
