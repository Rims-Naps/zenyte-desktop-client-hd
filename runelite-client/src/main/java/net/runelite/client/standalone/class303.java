package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public abstract class class303 {
   @ObfuscatedName("ho")
   @ObfuscatedGetter(
      intValue = -663104395
   )
   static int field3244;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   static class148 field3243;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1412174677"
   )
   public abstract void vmethod5547();

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-673206051"
   )
   public abstract int vmethod5544(int var1, int var2);

   @ObfuscatedName("ka")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-275108302"
   )
   static void method5215() {
      if(class263.field2912 != null) {
         client.field4001 = client.field3744;
         class263.field2912.method3910();

         for(int var0 = 0; var0 < client.field3848.length; ++var0) {
            if(client.field3848[var0] != null) {
               class263.field2912.method3930((client.field3848[var0].field1277 >> 7) + class296.somex, (client.field3848[var0].field1259 >> 7) + class284.somey);
            }
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)[Lln;",
      garbageValue = "-1721026151"
   )
   public static class82[] method5216() {
      return new class82[]{class82.field734, class82.field737, class82.field735};
   }

   @ObfuscatedName("ic")
   @ObfuscatedSignature(
      signature = "([Lhw;IB)V",
      garbageValue = "16"
   )
   static final void method5213(class329[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         class329 var3 = var0[var2];
         if(var3 != null) {
            if(var3.field3546 == 0) {
               if(var3.field3674 != null) {
                  method5213(var3.field3674, var1);
               }

               class45 var4 = (class45)client.field3991.method5310((long)var3.field3607);
               if(var4 != null) {
                  class161.method2770(var4.field351, var1);
               }
            }

            class9 var5;
            if(var1 == 0 && var3.field3595 != null) {
               var5 = new class9();
               var5.field63 = var3;
               var5.field69 = var3.field3595;
               class240.method4263(var5);
            }

            if(var1 == 1 && var3.field3658 != null) {
               if(var3.field3606 >= 0) {
                  class329 var6 = class189.getWidget(var3.field3607);
                  if(var6 == null || var6.field3674 == null || var3.field3606 >= var6.field3674.length || var3 != var6.field3674[var3.field3606]) {
                     continue;
                  }
               }

               var5 = new class9();
               var5.field63 = var3;
               var5.field69 = var3.field3658;
               class240.method4263(var5);
            }
         }
      }

   }
}
