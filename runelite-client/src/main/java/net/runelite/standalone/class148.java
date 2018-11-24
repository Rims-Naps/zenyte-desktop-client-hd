package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public abstract class class148 {
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   static class217 field1833;
   @ObfuscatedName("ho")
   @ObfuscatedGetter(
      intValue = -663104395
   )
   static int field1834;

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-673206051"
   )
   public abstract int vmethod5181(int var1, int var2);

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1412174677"
   )
   public abstract void vmethod5184();

   @ObfuscatedName("ic")
   @ObfuscatedSignature(
      signature = "([Lhw;IB)V",
      garbageValue = "16"
   )
   static final void method2683(class187[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         class187 var3 = var0[var2];
         if(var3 != null) {
            if(var3.field2560 == 0) {
               if(var3.field2688 != null) {
                  method2683(var3.field2688, var1);
               }

               class322 var4 = (class322)client.field2412.method1776((long)var3.field2621);
               if(var4 != null) {
                  class191.method3910(var4.field3937, var1);
               }
            }

            class194 var5;
            if(var1 == 0 && var3.field2609 != null) {
               var5 = new class194();
               var5.field2759 = var3;
               var5.field2765 = var3.field2609;
               class209.method4198(var5);
            }

            if(var1 == 1 && var3.field2672 != null) {
               if(var3.field2620 >= 0) {
                  class187 var6 = class48.method1047(var3.field2621);
                  if(var6 == null || var6.field2688 == null || var3.field2620 >= var6.field2688.length || var3 != var6.field2688[var3.field2620]) {
                     continue;
                  }
               }

               var5 = new class194();
               var5.field2759 = var3;
               var5.field2765 = var3.field2672;
               class209.method4198(var5);
            }
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)[Lln;",
      garbageValue = "-1721026151"
   )
   public static class136[] method2686() {
      return new class136[]{class136.field1754, class136.field1757, class136.field1755};
   }

   @ObfuscatedName("ka")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-275108302"
   )
   static void method2685() {
      if(class177.field2445 != null) {
         client.field2422 = client.field2165;
         class177.field2445.method4080();

         for(int var0 = 0; var0 < client.field2269.length; ++var0) {
            if(client.field2269[var0] != null) {
               class177.field2445.method4100((client.field2269[var0].field1090 >> 7) + class229.field3067, (client.field2269[var0].field1072 >> 7) + class35.field360);
            }
         }
      }

   }
}
