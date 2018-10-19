package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSRenderable;

@ObfuscatedName("dj")
public abstract class class308 extends class193 implements RSRenderable {
   @ObfuscatedName("em")
   static int[] field3280;
   @ObfuscatedName("ck")
   @ObfuscatedGetter(
      intValue = 1290356413
   )
   public int field3281;

   protected class308() {
      this.field3281 = 1000;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(S)Lds;"
   )
   protected class200 vmethod5291(short var1) {
      return null;
   }

   @ObfuscatedName("cw")
   void vmethod5292(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      class200 var11 = this.vmethod5291((short)-27660);
      if(var11 != null) {
         this.field3281 = var11.field3281;
         var11.vmethod5292(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }

   }

   public RSModel getModel() {
      return this.vmethod5291((short)-24950);
   }

   public int getModelHeight() {
      return this.field3281;
   }
}
