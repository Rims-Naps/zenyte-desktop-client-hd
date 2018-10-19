package net.runelite.client.standalone;

import net.runelite.api.Tile;
import net.runelite.api.events.ItemQuantityChanged;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSItem;

@ObfuscatedName("cm")
public final class class161 extends class308 implements RSItem {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lfb;"
   )
   protected static class303 field1502;
   @ObfuscatedName("r")
   static byte[][] field1507;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 2123193197
   )
   int field1504;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -615984055
   )
   int field1503;
   public int rl$sceneY;
   public int rl$sceneX;

   class161() {
      this.rl$$init();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(S)Lds;"
   )
   protected final class200 vmethod5291(short var1) {
      return class67.method1152(this.field1504).method2159(this.field1503);
   }

   public void onUnlink() {
      if(this.rl$sceneX != -1 && class113.field1064.getLastItemDespawn() == null) {
         class113.field1064.setLastItemDespawn(this);
      }

   }

   private void rl$$init() {
      this.rl$sceneX = -1;
      this.rl$sceneY = -1;
   }

   public int getId() {
      return this.field1504;
   }

   public int getQuantity() {
      return this.field1503;
   }

   public Tile getTile() {
      int var1 = this.rl$sceneX;
      int var2 = this.rl$sceneY;
      if(var1 != -1 && var2 != -1) {
         Tile[][][] var3 = class113.field1064.getScene().getTiles();
         Tile var4 = var3[class113.field1064.getPlane()][var1][var2];
         return var4;
      } else {
         return null;
      }
   }

   public void quantityChanged(int var1) {
      if(this.rl$sceneX != -1) {
         class113.field1064.getLogger().debug("Item quantity changed: {} ({} -> {})", new Object[]{Integer.valueOf(this.getId()), Integer.valueOf(this.getQuantity()), Integer.valueOf(var1)});
         ItemQuantityChanged var2 = new ItemQuantityChanged(this, this.getTile(), this.getQuantity(), var1);
         class113.field1064.getCallbacks().post(var2);
      }

   }

   public int getX() {
      return this.rl$sceneX;
   }

   public void setX(int var1) {
      this.rl$sceneX = var1;
   }

   public int getY() {
      return this.rl$sceneY;
   }

   public void setY(int var1) {
      this.rl$sceneY = var1;
   }

   public void setId(int var1) {
      this.field1504 = var1;
   }

   public void setQuantity(int var1) {
      this.field1503 = var1;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "4"
   )
   public static final void method2768(int var0, int var1) {
      class327.field3512 = var0;
      class327.field3511 = var1;
      class327.field3519 = true;
      class327.field3509 = 0;
      class327.field3510 = false;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/String;[SIII)V",
      garbageValue = "-818857372"
   )
   static void method2769(String[] var0, short[] var1, int var2, int var3) {
      if(var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         short var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(int var8 = var2; var8 < var3; ++var8) {
            if(var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               short var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         method2769(var0, var1, var2, var5 - 1);
         method2769(var0, var1, var5 + 1, var3);
      }

   }

   @ObfuscatedName("if")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "108482571"
   )
   static final void method2770(int var0, int var1) {
      if(class267.method4843(var0)) {
         class303.method5213(class329.field3533[var0], var1);
      }
   }
}
