package net.runelite.standalone;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
public class class24 implements Comparator {
   @ObfuscatedName("f")
   final boolean field260;

   public class24(boolean var1) {
      this.field260 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lkj;Lkj;I)I",
      garbageValue = "1066438088"
   )
   int method443(class62 var1, class62 var2) {
      return this.field260?var1.field734 - var2.field734:var2.field734 - var1.field734;
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method443((class62)var1, (class62)var2);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Lhw;II)V",
      garbageValue = "1868018367"
   )
   static final void method445(class187 var0, int var1) {
      if(var0.field2543 == null) {
         throw new RuntimeException();
      } else {
         if(var0.field2571 == null) {
            var0.field2571 = new int[var0.field2543.length];
         }

         var0.field2571[var1] = Integer.MAX_VALUE;
      }
   }

   @ObfuscatedName("gi")
   @ObfuscatedSignature(
      signature = "(Lbw;B)Z",
      garbageValue = "2"
   )
   static boolean method449(class199 var0) {
      if(client.field2383 == 0) {
         return false;
      } else if(class32.field303 != var0) {
         boolean var1 = (client.field2383 & 4) != 0;
         boolean var2 = var1;
         boolean var3;
         if(!var1) {
            var3 = (client.field2383 & 1) != 0;
            var2 = var3 && var0.method3960();
         }

         var3 = var2;
         if(!var2) {
            boolean var4 = (client.field2383 & 2) != 0;
            var3 = var4 && var0.method3952();
         }

         return var3;
      } else {
         return class233.method4667();
      }
   }
}
