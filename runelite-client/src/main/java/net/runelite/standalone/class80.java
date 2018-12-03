package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSCombatInfo1;

@ObfuscatedName("bv")
public class class80 extends class197 implements RSCombatInfo1 {
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -351498997
   )
   int field890;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1574813061
   )
   int field891;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1638102181
   )
   int field889;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1560280923
   )
   int field888;

   class80(int var1, int var2, int var3, int var4) {
      this.field889 = var1;
      this.field890 = var2;
      this.field888 = var3;
      this.field891 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "1404558733"
   )
   void method1599(int var1, int var2, int var3, int var4) {
      this.field889 = var1;
      this.field890 = var2;
      this.field888 = var3;
      this.field891 = var4;
   }

   public int getHealthRatio() {
      return this.field890;
   }

   public int getHealth() {
      return this.field888;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "51"
   )
   public static boolean method1596(int var0) {
      if(class210.field2893[var0]) {
         return true;
      } else if(!class187.field2586.method4450(var0)) {
         return false;
      } else {
         int var1 = class187.field2586.method4435(var0);
         if(var1 == 0) {
            class210.field2893[var0] = true;
            return true;
         } else {
            if(class187.field2547[var0] == null) {
               class187.field2547[var0] = new class187[var1];
            }

            for(int var2 = 0; var2 < var1; ++var2) {
               if(class187.field2547[var0][var2] == null) {
                  byte[] var3 = class187.field2586.method4398(var0, var2, -476986570);
                  if(var3 != null) {
                     class187.field2547[var0][var2] = new class187();
                     class187.field2547[var0][var2].field2621 = var2 + (var0 << 16);
                     if(var3[0] == -1) {
                        class187.field2547[var0][var2].method3768(new Buffer(var3));
                     } else {
                        class187.field2547[var0][var2].method3795(new Buffer(var3));
                     }
                  }
               }
            }

            class210.field2893[var0] = true;
            return true;
         }
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;B)V",
      garbageValue = "0"
   )
   public static void method1600(class217 var0) {
      class101.field1138 = var0;
   }
}
