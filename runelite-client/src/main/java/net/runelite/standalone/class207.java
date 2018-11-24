package net.runelite.standalone;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
public class class207 implements Comparator {
   @ObfuscatedName("f")
   final boolean field2869;

   public class207(boolean var1) {
      this.field2869 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljb;Ljb;I)I",
      garbageValue = "-90686477"
   )
   int method4105(class330 var1, class330 var2) {
      return this.field2869?var1.vmethod6331(var2):var2.vmethod6331(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method4105((class330)var1, (class330)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
