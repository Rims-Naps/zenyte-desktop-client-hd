package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSRenderable;

@ObfuscatedName("dj")
public abstract class class102 extends class324 implements RSRenderable {
   @ObfuscatedName("em")
   static int[] field1142;
   @ObfuscatedName("ck")
   @ObfuscatedGetter(
      intValue = 1290356413
   )
   public int field1143;

   protected class102() {
      this.field1143 = 1000;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(S)Lds;"
   )
   protected class52 vmethod6253(short var1) {
      return null;
   }

   public RSModel getModel() {
      return this.vmethod6253((short)-24950);
   }

   public void setModelHeight(int var1) {
      this.field1143 = var1;
   }

   public int getModelHeight() {
      return this.field1143;
   }

   public void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      this.vmethod1845(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @ObfuscatedName("cw")
   void vmethod1845(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      class52 var11 = this.vmethod6253((short)-27660);
      if(var11 != null) {
         this.field1143 = var11.field1143;
         var11.vmethod1845(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }

   }
}
