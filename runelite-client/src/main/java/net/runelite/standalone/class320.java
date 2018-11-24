package net.runelite.standalone;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
public abstract class class320 implements Comparator {
   @ObfuscatedName("l")
   Comparator field3922;

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Ljava/util/Comparator;I)V",
      garbageValue = "-2088226781"
   )
   final void method6238(Comparator var1) {
      if(this.field3922 == null) {
         this.field3922 = var1;
      } else if(this.field3922 instanceof class320) {
         ((class320)this.field3922).method6238(var1);
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Ljb;Ljb;B)I",
      garbageValue = "-9"
   )
   protected final int method6239(class330 var1, class330 var2) {
      return this.field3922 == null?0:this.field3922.compare(var1, var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(CI)Z",
      garbageValue = "866462615"
   )
   public static boolean method6246(char var0) {
      return var0 >= '0' && var0 <= '9';
   }
}
