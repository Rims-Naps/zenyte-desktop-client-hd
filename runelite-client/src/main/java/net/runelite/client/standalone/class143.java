package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
public class class143 {
   @ObfuscatedName("m")
   static final int[] field1392;
   @ObfuscatedName("es")
   static String field1395;
   @ObfuscatedName("d")
   static final int[] field1393;

   static {
      field1392 = new int[2048];
      field1393 = new int[2048];
      double var0 = 0.0030679615757712823D;

      for(int var2 = 0; var2 < 2048; ++var2) {
         field1392[var2] = (int)(65536.0D * Math.sin((double)var2 * var0));
         field1393[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-1331984177"
   )
   static int method2543(int var0, class252 var1, boolean var2) {
      class329 var3 = class189.getWidget(class55.field407[--class171.field1587]);
      if(var0 == 2800) {
         class55.field407[++class171.field1587 - 1] = class148.method2674(class104.method1771(var3));
         return 1;
      } else if(var0 != 2801) {
         if(var0 == 2802) {
            if(var3.field3669 == null) {
               class55.field408[++class272.field2978 - 1] = "";
            } else {
               class55.field408[++class272.field2978 - 1] = var3.field3669;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = class55.field407[--class171.field1587];
         --var4;
         if(var3.field3616 != null && var4 < var3.field3616.length && var3.field3616[var4] != null) {
            class55.field408[++class272.field2978 - 1] = var3.field3616[var4];
         } else {
            class55.field408[++class272.field2978 - 1] = "";
         }

         return 1;
      }
   }
}
