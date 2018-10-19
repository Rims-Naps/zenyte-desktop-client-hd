package net.runelite.client.standalone;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
public abstract class class236 implements Comparator {
   @ObfuscatedName("l")
   Comparator field2395;

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Ljb;Ljb;B)I",
      garbageValue = "-14"
   )
   protected final int method4178(class242 var1, class242 var2) {
      return this.field2395 == null?0:this.field2395.compare(var1, var2);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Ljava/util/Comparator;I)V",
      garbageValue = "-2088226781"
   )
   final void method4177(Comparator var1) {
      if(this.field2395 == null) {
         this.field2395 = var1;
      } else if(this.field2395 instanceof class236) {
         ((class236)this.field2395).method4177(var1);
      }

   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(CI)Z",
      garbageValue = "866462615"
   )
   public static boolean method4185(char var0) {
      return var0 >= '0' && var0 <= '9';
   }
}
