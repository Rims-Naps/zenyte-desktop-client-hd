package net.runelite.client.standalone;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
public class class65 implements Comparator {
   @ObfuscatedName("f")
   final boolean field606;

   public class65(boolean var1) {
      this.field606 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljb;Ljb;I)I",
      garbageValue = "-90686477"
   )
   int method1137(class242 var1, class242 var2) {
      return this.field606?var1.vmethod4496(var2):var2.vmethod4496(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method1137((class242)var1, (class242)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
