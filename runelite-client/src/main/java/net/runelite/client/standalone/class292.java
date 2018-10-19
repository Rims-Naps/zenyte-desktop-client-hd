package net.runelite.client.standalone;

import net.runelite.api.Item;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSItem;
import net.runelite.rs.api.RSItemContainer;

@ObfuscatedName("bx")
public class class292 extends class76 implements RSItemContainer {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   static class310 field3153;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lhg;"
   )
   static class144 field3157;
   @ObfuscatedName("ao")
   protected static String field3155;
   @ObfuscatedName("l")
   int[] field3150;
   @ObfuscatedName("w")
   int[] field3154;
   public int rl$lastCycle;

   static {
      field3153 = new class310(32);
   }

   class292() {
      this.field3150 = new int[]{-1};
      this.field3154 = new int[]{0};
      this.stackSizesChanged(-1);
   }

   public int[] getItemIds() {
      return this.field3150;
   }

   public int[] getStackSizes() {
      return this.field3154;
   }

   public void stackSizesChanged(int var1) {
      int var2 = class113.field1064.getGameCycle();
      if(var2 != this.rl$lastCycle) {
         this.rl$lastCycle = var2;
         ItemContainerChanged var3 = new ItemContainerChanged(this);
         class113.field1064.getCallbacks().postDeferred(var3);
      }
   }

   public Item[] getItems() {
      int[] var1 = this.getItemIds();
      int[] var2 = this.getStackSizes();
      Item[] var3 = new Item[var1.length];

      for(int var4 = 0; var4 < var1.length; ++var4) {
         RSItem var5 = class113.field1064.createItem();
         var5.setId(var1[var4]);
         var5.setQuantity(var2[var4]);
         var3[var4] = var5;
      }

      return var3;
   }
}
