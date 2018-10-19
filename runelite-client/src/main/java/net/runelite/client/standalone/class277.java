package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("kn")
public final class class277 extends class207 {
   public class277(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   public class277(byte[] var1) {
      super(var1);
   }

   @ObfuscatedName("f")
   final void vmethod4936(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var3 * class89.field862 + var2;
      int var8 = class89.field862 - var4;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if(var3 < class89.field865) {
         var11 = class89.field865 - var3;
         var5 -= var11;
         var3 = class89.field865;
         var10 += var11 * var4;
         var7 += var11 * class89.field862;
      }

      if(var3 + var5 > class89.field866) {
         var5 -= var3 + var5 - class89.field866;
      }

      if(var2 < class89.field867) {
         var11 = class89.field867 - var2;
         var4 -= var11;
         var2 = class89.field867;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if(var2 + var4 > class89.field868) {
         var11 = var2 + var4 - class89.field868;
         var4 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if(var4 > 0 && var5 > 0) {
         class207.method3594(class89.field864, var1, var6, var10, var7, var4, var5, var8, var9);
      }
   }

   @ObfuscatedName("l")
   final void vmethod4934(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var3 * class89.field862 + var2;
      int var9 = class89.field862 - var4;
      int var10 = 0;
      int var11 = 0;
      int var12;
      if(var3 < class89.field865) {
         var12 = class89.field865 - var3;
         var5 -= var12;
         var3 = class89.field865;
         var11 += var12 * var4;
         var8 += var12 * class89.field862;
      }

      if(var3 + var5 > class89.field866) {
         var5 -= var3 + var5 - class89.field866;
      }

      if(var2 < class89.field867) {
         var12 = class89.field867 - var2;
         var4 -= var12;
         var2 = class89.field867;
         var11 += var12;
         var8 += var12;
         var10 += var12;
         var9 += var12;
      }

      if(var2 + var4 > class89.field868) {
         var12 = var2 + var4 - class89.field868;
         var4 -= var12;
         var10 += var12;
         var9 += var12;
      }

      if(var4 > 0 && var5 > 0) {
         class207.method3525(class89.field864, var1, var6, var11, var8, var4, var5, var9, var10, var7);
      }
   }
}
