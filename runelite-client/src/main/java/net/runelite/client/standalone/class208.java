package net.runelite.client.standalone;

import java.lang.ref.SoftReference;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hd")
public class class208 extends class238 {
   @ObfuscatedName("f")
   SoftReference field2031;

   class208(Object var1, int var2) {
      super(var2);
      this.field2031 = new SoftReference(var1);
   }

   @ObfuscatedName("f")
   Object vmethod5023() {
      return this.field2031.get();
   }

   @ObfuscatedName("l")
   boolean vmethod5024() {
      return true;
   }
}
