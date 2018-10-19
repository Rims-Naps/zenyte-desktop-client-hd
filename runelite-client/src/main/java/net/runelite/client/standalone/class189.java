package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSCombatInfo2;
import net.runelite.rs.api.RSCombatInfoList;
import net.runelite.rs.api.RSCombatInfoListHolder;

@ObfuscatedName("bz")
public class class189 extends class76 implements RSCombatInfoListHolder {
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lle;"
   )
   static class32 logoSprite;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgk;"
   )
   class60 field1810;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Ljc;"
   )
   class14 field1805;

   @ObfuscatedSignature(
      signature = "(Ljc;)V"
   )
   class189(class14 var1) {
      this.field1810 = new class60();
      this.field1805 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIIIB)V",
      garbageValue = "-18"
   )
   void method3241(int var1, int var2, int var3, int var4) {
      class267 var5 = null;
      int var6 = 0;

      for(class267 var7 = (class267)this.field1810.method1051(); var7 != null; var7 = (class267)this.field1810.method1053()) {
         ++var6;
         if(var7.field2935 == var1) {
            var7.method4846(var1, var2, var3, var4);
            return;
         }

         if(var7.field2935 <= var1) {
            var5 = var7;
         }
      }

      if(var5 == null) {
         if(var6 < 4) {
            this.field1810.method1068(new class267(var1, var2, var3, var4));
         }

      } else {
         class60.method1050(new class267(var1, var2, var3, var4), var5);
         if(var6 >= 4) {
            this.field1810.method1051().method1186();
         }

      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)Lbv;",
      garbageValue = "-1858892659"
   )
   class267 method3242(int var1) {
      class267 var2 = (class267)this.field1810.method1051();
      if(var2 != null && var2.field2935 <= var1) {
         for(class267 var3 = (class267)this.field1810.method1053(); var3 != null && var3.field2935 <= var1; var3 = (class267)this.field1810.method1053()) {
            var2.method1186();
            var2 = var3;
         }

         if(this.field1805.field130 + var2.field2935 + var2.field2937 > var1) {
            return var2;
         } else {
            var2.method1186();
            return null;
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-103532155"
   )
   boolean method3243() {
      return this.field1810.method1063();
   }

   public RSCombatInfo2 getCombatInfo2() {
      return this.field1805;
   }

   public RSCombatInfoList getCombatInfo1() {
      return this.field1810;
   }

   @ObfuscatedName("f")
   public static final void method3249(long var0) {
      if(var0 > 0L) {
         if(0L == var0 % 10L) {
            long var2 = var0 - 1L;

            try {
               Thread.sleep(var2);
            } catch (InterruptedException var8) {
               ;
            }

            try {
               Thread.sleep(1L);
            } catch (InterruptedException var7) {
               ;
            }
         } else {
            try {
               Thread.sleep(var0);
            } catch (InterruptedException var6) {
               ;
            }
         }

      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IB)Lhw;",
      garbageValue = "89"
   )
   public static class329 getWidget(int var0) {
      int var1 = var0 >> 16;
      int var2 = var0 & 65535;
      if(class329.field3533[var1] == null || class329.field3533[var1][var2] == null) {
         boolean var3 = class267.method4843(var1);
         if(!var3) {
            return null;
         }
      }

      return class329.field3533[var1][var2];
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lim;IIIBZI)V",
      garbageValue = "1428614126"
   )
   static void method3253(class108 var0, int var1, int var2, int var3, byte var4, boolean var5) {
      long var6 = (long)((var1 << 16) + var2);
      class332 var8 = (class332)class270.field2963.method5310(var6);
      if(var8 == null) {
         var8 = (class332)class270.field2957.method5310(var6);
         if(var8 == null) {
            var8 = (class332)class270.field2958.method5310(var6);
            if(var8 != null) {
               if(var5) {
                  var8.method3298();
                  class270.field2963.method5309(var8, var6);
                  --class270.field2964;
                  ++class270.field2955;
               }

            } else {
               if(!var5) {
                  var8 = (class332)class270.field2962.method5310(var6);
                  if(var8 != null) {
                     return;
                  }
               }

               var8 = new class332();
               var8.field3724 = var0;
               var8.field3723 = var3;
               var8.field3725 = var4;
               if(var5) {
                  class270.field2963.method5309(var8, var6);
                  ++class270.field2955;
               } else {
                  class270.field2959.method2470(var8);
                  class270.field2958.method5309(var8, var6);
                  ++class270.field2964;
               }

            }
         }
      }
   }
}
