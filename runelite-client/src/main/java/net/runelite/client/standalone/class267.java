package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSCombatInfo1;

@ObfuscatedName("bv")
public class class267 extends class76 implements RSCombatInfo1 {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1638102181
   )
   int field2935;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -351498997
   )
   int field2936;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1574813061
   )
   int field2937;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1560280923
   )
   int field2934;

   class267(int var1, int var2, int var3, int var4) {
      this.field2935 = var1;
      this.field2936 = var2;
      this.field2934 = var3;
      this.field2937 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "1404558733"
   )
   void method4846(int var1, int var2, int var3, int var4) {
      this.field2935 = var1;
      this.field2936 = var2;
      this.field2934 = var3;
      this.field2937 = var4;
   }

   public int getHealthRatio() {
      return this.field2936;
   }

   public int getHealth() {
      return this.field2934;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;B)V",
      garbageValue = "0"
   )
   public static void method4847(class148 var0) {
      class307.field3276 = var0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "51"
   )
   public static boolean method4843(int var0) {
      if(class102.field963[var0]) {
         return true;
      } else if(!class329.field3572.method2631(var0)) {
         return false;
      } else {
         int var1 = class329.field3572.method2616(var0);
         if(var1 == 0) {
            class102.field963[var0] = true;
            return true;
         } else {
            if(class329.field3533[var0] == null) {
               class329.field3533[var0] = new class329[var1];
            }

            for(int var2 = 0; var2 < var1; ++var2) {
               if(class329.field3533[var0][var2] == null) {
                  byte[] var3 = class329.field3572.method2579(var0, var2, -476986570);
                  if(var3 != null) {
                     class329.field3533[var0][var2] = new class329();
                     class329.field3533[var0][var2].field3607 = var2 + (var0 << 16);
                     if(var3[0] == -1) {
                        class329.field3533[var0][var2].method5893(new Buffer(var3));
                     } else {
                        class329.field3533[var0][var2].method5920(new Buffer(var3));
                     }
                  }
               }
            }

            class102.field963[var0] = true;
            return true;
         }
      }
   }
}
