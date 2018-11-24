package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dy")
public class class16 {
   @ObfuscatedName("l")
   int field199;
   @ObfuscatedName("s")
   int[] field200;
   @ObfuscatedName("f")
   int field202;
   @ObfuscatedName("w")
   int[] field201;

   class16() {
      class157.method2842(16);
      this.field202 = class157.method2843() != 0?class157.method2842(4) + 1:1;
      if(class157.method2843() != 0) {
         class157.method2842(8);
      }

      class157.method2842(2);
      if(this.field202 > 1) {
         this.field199 = class157.method2842(4);
      }

      this.field201 = new int[this.field202];
      this.field200 = new int[this.field202];

      for(int var1 = 0; var1 < this.field202; ++var1) {
         class157.method2842(8);
         this.field201[var1] = class157.method2842(8);
         this.field200[var1] = class157.method2842(8);
      }

   }
}
