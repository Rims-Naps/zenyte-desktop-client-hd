package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSCombatInfo2;
import net.runelite.rs.api.RSCombatInfoList;
import net.runelite.rs.api.RSCombatInfoListHolder;

@ObfuscatedName("bz")
public class class48 extends class197 implements RSCombatInfoListHolder {
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lle;"
   )
   static class303 field545;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgk;"
   )
   class41 field548;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Ljc;"
   )
   class244 field543;

   @ObfuscatedSignature(
      signature = "(Ljc;)V"
   )
   class48(class244 var1) {
      this.field548 = new class41();
      this.field543 = var1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)Lbv;",
      garbageValue = "-1858892659"
   )
   class80 method1038(int var1) {
      class80 var2 = (class80)this.field548.method745();
      if(var2 != null && var2.field889 <= var1) {
         for(class80 var3 = (class80)this.field548.method747(); var3 != null && var3.field889 <= var1; var3 = (class80)this.field548.method747()) {
            var2.method3937();
            var2 = var3;
         }

         if(this.field543.field3285 + var2.field889 + var2.field891 > var1) {
            return var2;
         } else {
            var2.method3937();
            return null;
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIIIB)V",
      garbageValue = "-18"
   )
   void method1037(int var1, int var2, int var3, int var4) {
      class80 var5 = null;
      int var6 = 0;

      for(class80 var7 = (class80)this.field548.method745(); var7 != null; var7 = (class80)this.field548.method747()) {
         ++var6;
         if(var7.field889 == var1) {
            var7.method1599(var1, var2, var3, var4);
            return;
         }

         if(var7.field889 <= var1) {
            var5 = var7;
         }
      }

      if(var5 == null) {
         if(var6 < 4) {
            this.field548.method762(new class80(var1, var2, var3, var4));
         }

      } else {
         class41.method744(new class80(var1, var2, var3, var4), var5);
         if(var6 >= 4) {
            this.field548.method745().method3937();
         }

      }
   }

   public RSCombatInfo2 getCombatInfo2() {
      return this.field543;
   }

   public RSCombatInfoList getCombatInfo1() {
      return this.field548;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-103532155"
   )
   boolean method1039() {
      return this.field548.method757();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IB)Lhw;",
      garbageValue = "89"
   )
   public static class187 method1047(int var0) {
      int var1 = var0 >> 16;
      int var2 = var0 & 65535;
      if(class187.field2547[var1] == null || class187.field2547[var1][var2] == null) {
         boolean var3 = class80.method1596(var1);
         if(!var3) {
            return null;
         }
      }

      return class187.field2547[var1][var2];
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lim;IIIBZI)V",
      garbageValue = "1428614126"
   )
   static void method1049(class6 var0, int var1, int var2, int var3, byte var4, boolean var5) {
      long var6 = (long)((var1 << 16) + var2);
      class326 var8 = (class326)class239.field3132.method1776(var6);
      if(var8 == null) {
         var8 = (class326)class239.field3126.method1776(var6);
         if(var8 == null) {
            var8 = (class326)class239.field3127.method1776(var6);
            if(var8 != null) {
               if(var5) {
                  var8.method6268();
                  class239.field3132.method1775(var8, var6);
                  --class239.field3133;
                  ++class239.field3124;
               }

            } else {
               if(!var5) {
                  var8 = (class326)class239.field3131.method1776(var6);
                  if(var8 != null) {
                     return;
                  }
               }

               var8 = new class326();
               var8.field3953 = var0;
               var8.field3952 = var3;
               var8.field3954 = var4;
               if(var5) {
                  class239.field3132.method1775(var8, var6);
                  ++class239.field3124;
               } else {
                  class239.field3128.method1057(var8);
                  class239.field3127.method1775(var8, var6);
                  ++class239.field3133;
               }

            }
         }
      }
   }

   @ObfuscatedName("f")
   public static final void method1045(long var0) {
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
}
