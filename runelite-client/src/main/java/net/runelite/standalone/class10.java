package net.runelite.standalone;

import java.lang.ref.SoftReference;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hd")
public class class10 extends class281 {
   @ObfuscatedName("f")
   SoftReference field93;

   class10(Object var1, int var2) {
      super(var2);
      this.field93 = new SoftReference(var1);
   }

   @ObfuscatedName("l")
   boolean vmethod5410() {
      return true;
   }

   @ObfuscatedName("f")
   Object vmethod5411() {
      return this.field93.get();
   }
}
