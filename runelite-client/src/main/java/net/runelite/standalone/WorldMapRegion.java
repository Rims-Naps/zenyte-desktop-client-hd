package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
public class WorldMapRegion extends WorldMapNode {
   @ObfuscatedName("kp")
   @ObfuscatedGetter(
      intValue = -1215790901
   )
   static int field2934;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgm;Lgm;I)V",
      garbageValue = "1377930482"
   )
   void decode(Buffer var1, Buffer var2) {
      int var3 = var2.readUnsignedByte();
      if(var3 != class174.field2133.field2128) {
         throw new IllegalStateException("");
      } else {
         super.field2146 = var2.readUnsignedByte();
         super.field2139 = var2.readUnsignedByte();
         super.field2150 = var2.readUnsignedShort();
         super.field2144 = var2.readUnsignedShort();
         super.field2138 = var2.readUnsignedShort();
         super.field2137 = var2.readUnsignedShort();
         super.field2139 = Math.min(super.field2139, 4);
         super.field2140 = new short[1][64][64];
         super.field2141 = new short[super.field2139][64][64];
         super.field2142 = new byte[super.field2139][64][64];
         super.field2143 = new byte[super.field2139][64][64];
         super.objects = new WorldMapGameObject[super.field2139][64][64][];
         var3 = var1.readUnsignedByte();
         if(var3 != class286.field3581.field3578) {
            throw new IllegalStateException("");
         } else {
            int var4 = var1.readUnsignedByte();
            int var5 = var1.readUnsignedByte();
            if(var4 == super.field2138 && var5 == super.field2137) {
               for(int var6 = 0; var6 < 64; ++var6) {
                  for(int var7 = 0; var7 < 64; ++var7) {
                     this.method3224(var6, var7, var1);
                  }
               }

            } else {
               throw new IllegalStateException("");
            }
         }
      }
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof WorldMapRegion)) {
         return false;
      } else {
         WorldMapRegion var2 = (WorldMapRegion)var1;
         return super.field2138 == var2.field2138 && super.field2137 == var2.field2137;
      }
   }

   public int hashCode() {
      return super.field2138 | super.field2137 << 8;
   }

   @ObfuscatedName("fg")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2092413800"
   )
   static int method4379() {
      return client.field2367?2:1;
   }

   @ObfuscatedName("fq")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZB)V",
      garbageValue = "16"
   )
   static final void method4369(String var0, boolean var1) {
      if(client.field2268) {
         byte var2 = 4;
         int var3 = var2 + 6;
         int var4 = var2 + 6;
         int var5 = class194.field2772.method3857(var0, 250);
         int var6 = class194.field2772.method3812(var0, 250) * 13;
         Rasterizer2D.method3167(var3 - var2, var4 - var2, var5 + var2 + var2, var6 + var2 + var2, 0);
         Rasterizer2D.method3149(var3 - var2, var4 - var2, var5 + var2 + var2, var6 + var2 + var2, 16777215);
         class194.field2772.method3868(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
         int var7 = var3 - var2;
         int var8 = var4 - var2;
         int var9 = var2 + var2 + var5;
         int var10 = var6 + var2 + var2;

         for(int var11 = 0; var11 < client.field2356; ++var11) {
            if(client.field2322[var11] + client.field2363[var11] > var7 && client.field2322[var11] < var7 + var9 && client.field2362[var11] + client.field2364[var11] > var8 && client.field2362[var11] < var8 + var10) {
               client.field2351[var11] = true;
            }
         }

         if(var1) {
            class124.field1689.vmethod6366(0, 0);
         } else {
            class277.method5384(var3, var4, var5, var6);
         }

      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1937485390"
   )
   static void method4378(int var0) {
      class231 var1 = (class231)class231.field3079.method1776((long)var0);
      if(var1 != null) {
         for(int var2 = 0; var2 < var1.field3076.length; ++var2) {
            var1.field3076[var2] = -1;
            var1.field3080[var2] = 0;
            var1.stackSizesChanged(var2);
         }

      }
   }
}
