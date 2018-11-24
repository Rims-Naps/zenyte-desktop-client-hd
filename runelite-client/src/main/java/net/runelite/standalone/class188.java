package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class188 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lkf;"
   )
   static final class188 field2703;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -725225377
   )
   final int field2702;

   static {
      field2703 = new class188(3);
   }

   class188(int var1) {
      this.field2702 = var1;
   }

   @ObfuscatedName("iu")
   @ObfuscatedSignature(
      signature = "(Lhw;I)Z",
      garbageValue = "-1011758976"
   )
   static final boolean method3803(class187 var0) {
      if(var0.field2677 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < var0.field2677.length; ++var1) {
            int var2 = class255.method5123(var0, var1);
            int var3 = var0.field2678[var1];
            if(var0.field2677[var1] == 2) {
               if(var2 >= var3) {
                  return false;
               }
            } else if(var0.field2677[var1] == 3) {
               if(var2 <= var3) {
                  return false;
               }
            } else if(var0.field2677[var1] == 4) {
               if(var3 == var2) {
                  return false;
               }
            } else if(var2 != var3) {
               return false;
            }
         }

         return true;
      }
   }
}
