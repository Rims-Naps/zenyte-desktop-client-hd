package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public class Task {
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -606649597
   )
   int type;
   @ObfuscatedName("w")
   Object objectArgument;
   @ObfuscatedName("b")
   public int intArgument;
   @ObfuscatedName("n")
   public volatile Object value;
   @ObfuscatedName("c")
   public volatile int status;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Let;"
   )
   Task task;

   Task() {
      this.status = 0;
   }
}
