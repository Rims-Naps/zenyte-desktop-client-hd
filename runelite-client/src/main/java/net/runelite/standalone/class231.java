package net.runelite.standalone;

import net.runelite.api.Item;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSItem;
import net.runelite.rs.api.RSItemContainer;

@ObfuscatedName("bx")
public class class231 extends class197 implements RSItemContainer {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lhg;"
   )
   static class240 field3083;
   @ObfuscatedName("ao")
   protected static String field3081;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   static class98 field3079;
   @ObfuscatedName("l")
   int[] field3076;
   public int rl$lastCycle;
   @ObfuscatedName("w")
   int[] field3080;

   static {
      field3079 = new class98(32);
   }

   class231() {
      this.field3076 = new int[]{-1};
      this.field3080 = new int[]{0};
      this.stackSizesChanged(-1);
   }

   public int[] getItemIds() {
      return this.field3076;
   }

   public int[] getStackSizes() {
      return this.field3080;
   }

   public void stackSizesChanged(int var1) {
      int var2 = class302.field3755.getGameCycle();
      if(var2 != this.rl$lastCycle) {
         this.rl$lastCycle = var2;
         ItemContainerChanged var3 = new ItemContainerChanged(this);
         class302.field3755.getCallbacks().postDeferred(var3);
      }
   }

   public Item[] getItems() {
      int[] var1 = this.getItemIds();
      int[] var2 = this.getStackSizes();
      Item[] var3 = new Item[var1.length];

      for(int var4 = 0; var4 < var1.length; ++var4) {
         RSItem var5 = class302.field3755.createItem();
         var5.setId(var1[var4]);
         var5.setQuantity(var2[var4]);
         var3[var4] = var5;
      }

      return var3;
   }
}
