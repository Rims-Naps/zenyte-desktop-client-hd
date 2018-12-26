package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.rs.api.RSIntegerNode;

@ObfuscatedName("hq")
public class IntegerNode extends Node implements RSIntegerNode {
   @ObfuscatedName("g")
   public int value;

   public IntegerNode(int var1) {
      this.value = var1;
   }

   public void setValue(int var1) {
      this.value = var1;
   }

   public int getValue() {
      return this.value;
   }
}
