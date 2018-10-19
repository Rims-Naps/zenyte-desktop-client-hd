package net.runelite.client.standalone;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
public class class318 implements Comparator {
   @ObfuscatedName("f")
   final boolean field3402;

   public class318(boolean var1) {
      this.field3402 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lkj;Lkj;I)I",
      garbageValue = "1066438088"
   )
   int method5579(class305 var1, class305 var2) {
      return this.field3402?var1.field3262 - var2.field3262:var2.field3262 - var1.field3262;
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method5579((class305)var1, (class305)var2);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lhw;II)V",
      garbageValue = "1868018367"
   )
   static final void method5581(class329 var0, int var1) {
      if(var0.field3529 == null) {
         throw new RuntimeException();
      } else {
         if(var0.field3557 == null) {
            var0.field3557 = new int[var0.field3529.length];
         }

         var0.field3557[var1] = Integer.MAX_VALUE;
      }
   }

   @ObfuscatedName("gi")
   @ObfuscatedSignature(
      signature = "(Lbw;B)Z",
      garbageValue = "2"
   )
   static boolean method5585(class63 var0) {
      if(client.field3962 == 0) {
         return false;
      } else if(class5.field43 != var0) {
         boolean var1 = (client.field3962 & 4) != 0;
         boolean var2 = var1;
         boolean var3;
         if(!var1) {
            var3 = (client.field3962 & 1) != 0;
            var2 = var3 && var0.method1094();
         }

         var3 = var2;
         if(!var2) {
            boolean var4 = (client.field3962 & 2) != 0;
            var3 = var4 && var0.method1086();
         }

         return var3;
      } else {
         return class205.method3505();
      }
   }
}
