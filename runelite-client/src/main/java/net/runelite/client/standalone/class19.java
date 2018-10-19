package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dy")
public class class19 {
   @ObfuscatedName("f")
   int field153;
   @ObfuscatedName("l")
   int field150;
   @ObfuscatedName("s")
   int[] field151;
   @ObfuscatedName("w")
   int[] field152;

   class19() {
      class101.method1693(16);
      this.field153 = class101.method1694() != 0?class101.method1693(4) + 1:1;
      if(class101.method1694() != 0) {
         class101.method1693(8);
      }

      class101.method1693(2);
      if(this.field153 > 1) {
         this.field150 = class101.method1693(4);
      }

      this.field152 = new int[this.field153];
      this.field151 = new int[this.field153];

      for(int var1 = 0; var1 < this.field153; ++var1) {
         class101.method1693(8);
         this.field152[var1] = class101.method1693(8);
         this.field151[var1] = class101.method1693(8);
      }

   }
}
