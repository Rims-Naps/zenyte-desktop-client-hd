package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class72 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lkf;"
   )
   static final class72 field672;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -725225377
   )
   final int field671;

   static {
      field672 = new class72(3);
   }

   class72(int var1) {
      this.field671 = var1;
   }

   @ObfuscatedName("iu")
   @ObfuscatedSignature(
      signature = "(Lhw;I)Z",
      garbageValue = "-1011758976"
   )
   static final boolean method1171(class329 var0) {
      if(var0.field3663 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < var0.field3663.length; ++var1) {
            int var2 = class21.method216(var0, var1);
            int var3 = var0.field3664[var1];
            if(var0.field3663[var1] == 2) {
               if(var2 >= var3) {
                  return false;
               }
            } else if(var0.field3663[var1] == 3) {
               if(var2 <= var3) {
                  return false;
               }
            } else if(var0.field3663[var1] == 4) {
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
