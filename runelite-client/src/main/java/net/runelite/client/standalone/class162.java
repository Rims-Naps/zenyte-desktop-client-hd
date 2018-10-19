package net.runelite.client.standalone;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
public class class162 implements Comparator {
   @ObfuscatedName("f")
   final boolean field1509;

   public class162(boolean var1) {
      this.field1509 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljb;Ljb;I)I",
      garbageValue = "-1684081345"
   )
   int method2772(class242 var1, class242 var2) {
      return this.field1509?var1.method4300().method840(var2.method4300()):var2.method4300().method840(var1.method4300());
   }

   public int compare(Object var1, Object var2) {
      return this.method2772((class242)var1, (class242)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
