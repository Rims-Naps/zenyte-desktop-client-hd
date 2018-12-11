package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
public class class256 {
   @ObfuscatedName("es")
   static String field3356;
   @ObfuscatedName("m")
   static final int[] field3353;
   @ObfuscatedName("d")
   static final int[] field3354;

   static {
      field3353 = new int[2048];
      field3354 = new int[2048];
      double var0 = 0.0030679615757712823D;

      for(int var2 = 0; var2 < 2048; ++var2) {
         field3353[var2] = (int)(65536.0D * Math.sin((double)var2 * var0));
         field3354[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-1331984177"
   )
   static int method5129(int var0, class296 var1, boolean var2) {
      class187 var3 = class48.method1047(class249.field3312[--MapCacheArchiveNames.field3811]);
      if(var0 == 2800) {
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = Js5Index.method4493(class203.method4026(var3));
         return 1;
      } else if(var0 != 2801) {
         if(var0 == 2802) {
            if(var3.field2683 == null) {
               class249.field3313[++class103.field1146 - 1] = "";
            } else {
               class249.field3313[++class103.field1146 - 1] = var3.field2683;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = class249.field3312[--MapCacheArchiveNames.field3811];
         --var4;
         if(var3.field2630 != null && var4 < var3.field2630.length && var3.field2630[var4] != null) {
            class249.field3313[++class103.field1146 - 1] = var3.field2630[var4];
         } else {
            class249.field3313[++class103.field1146 - 1] = "";
         }

         return 1;
      }
   }
}
