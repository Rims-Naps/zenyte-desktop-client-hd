package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSRenderable;

@ObfuscatedName("dd")
public abstract class Entity extends CacheableNode implements RSRenderable {
   @ObfuscatedName("co")
   @ObfuscatedGetter(
      intValue = -1806935189
   )
   public int modelHeight;

   protected Entity() {
      this.modelHeight = 1000;
   }

   public RSModel getModel() {
      return this.vmethod5584(-2070069362);
   }

   public void setModelHeight(int var1) {
      this.modelHeight = var1;
   }

   public int getModelHeight() {
      return this.modelHeight;
   }

   public void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      this.vmethod5472(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)Ldl;"
   )
   protected Model vmethod5584(int var1) {
      return null;
   }

   @ObfuscatedName("cf")
   void vmethod5472(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      Model var11 = this.vmethod5584(-1785592773);
      if(var11 != null) {
         this.modelHeight = var11.modelHeight;
         var11.vmethod5472(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }

   }
}
