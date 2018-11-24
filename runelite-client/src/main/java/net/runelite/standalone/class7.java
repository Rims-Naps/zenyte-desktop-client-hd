package net.runelite.standalone;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
public class class7 implements Comparator {
   @ObfuscatedName("f")
   final boolean field89;

   public class7(boolean var1) {
      this.field89 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljb;Ljb;I)I",
      garbageValue = "-1684081345"
   )
   int method139(class330 var1, class330 var2) {
      return this.field89?var1.method6338().method2888(var2.method6338()):var2.method6338().method2888(var1.method6338());
   }

   public int compare(Object var1, Object var2) {
      return this.method139((class330)var1, (class330)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
