package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSIgnore;
import net.runelite.rs.api.RSName;

@ObfuscatedName("ka")
public class Ignore extends Nameable implements RSIgnore {
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1574225871
   )
   int field3705;

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(Ljr;I)I",
      garbageValue = "889054617"
   )
   public int vmethod2733(Nameable var1) {
      return this.method1946((Ignore)var1);
   }

   public int compareTo(Object var1) {
      return this.method1946((Ignore)var1);
   }

   public String getName() {
      return this.getRsName().getName();
   }

   public String getPrevName() {
      RSName var1 = this.getRsPrevName();
      return var1 == null?null:var1.getName();
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lka;I)I",
      garbageValue = "-1395501104"
   )
   int method1946(Ignore var1) {
      return this.field3705 - var1.field3705;
   }
}
