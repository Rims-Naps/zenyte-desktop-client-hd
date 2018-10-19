package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
public class class294 {
   @ObfuscatedName("gb")
   @ObfuscatedSignature(
      signature = "[Lle;"
   )
   static class32[] field3173;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -270990651
   )
   int field3169;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1396018901
   )
   int field3168;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 2128822717
   )
   int field3170;

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1427355182"
   )
   public static void method5135(int var0) {
      class227.field2232 = 1;
      class53.field391 = null;
      class52.field386 = -1;
      class263.field2910 = -1;
      class78.field720 = 0;
      class199.field1874 = false;
      class204.field1991 = var0;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIIIIZI)Llp;",
      garbageValue = "1331080378"
   )
   public static final class26 method5138(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if(var1 == -1) {
         var4 = 0;
      } else if(var4 == 2 && var1 != 1) {
         var4 = 1;
      }

      long var6 = ((long)var1 << 16) + (long)var0 + ((long)var2 << 38) + ((long)var4 << 40) + ((long)var3 << 42);
      class26 var8;
      if(!var5) {
         var8 = (class26)class120.field1122.method2268(var6);
         if(var8 != null) {
            return var8;
         }
      }

      class120 var9 = class67.method1152(var0);
      if(var1 > 1 && var9.field1141 != null) {
         int var10 = -1;

         for(int var11 = 0; var11 < 10; ++var11) {
            if(var1 >= var9.field1134[var11] && var9.field1134[var11] != 0) {
               var10 = var9.field1141[var11];
            }
         }

         if(var10 != -1) {
            var9 = class67.method1152(var10);
         }
      }

      class200 var19 = var9.method2159(1);
      if(var19 == null) {
         return null;
      } else {
         class26 var20 = null;
         if(var9.field1129 != -1) {
            var20 = method5138(var9.field1135, 10, 1, 0, 0, true);
            if(var20 == null) {
               return null;
            }
         } else if(var9.field1146 != -1) {
            var20 = method5138(var9.field1145, var1, var2, var3, 0, false);
            if(var20 == null) {
               return null;
            }
         } else if(var9.field1148 != -1) {
            var20 = method5138(var9.field1147, var1, 0, 0, 0, false);
            if(var20 == null) {
               return null;
            }
         }

         int[] var12 = class89.field864;
         int var13 = class89.field862;
         int var14 = class89.field863;
         int[] var15 = new int[4];
         class89.method1583(var15);
         var8 = new class26(36, 32);
         class89.method1530(var8.field203, 36, 32);
         class89.method1531();
         class257.method4570();
         class257.method4573(16, 16);
         class257.field2542 = false;
         if(var9.field1148 != -1) {
            var20.method378(0, 0);
         }

         int var16 = var9.field1109;
         if(var5) {
            var16 = (int)((double)var16 * 1.5D);
         } else if(var2 == 2) {
            var16 = (int)(1.04D * (double)var16);
         }

         int var17 = var16 * class257.field2564[var9.field1132] >> 16;
         int var18 = var16 * class257.field2558[var9.field1132] >> 16;
         var19.method3374();
         var19.method3387(0, var9.field1118, var9.field1112, var9.field1132, var9.field1099, var19.field3281 / 2 + var17 + var9.field1111, var18 + var9.field1111);
         if(var9.field1146 != -1) {
            var20.method378(0, 0);
         }

         if(var2 >= 1) {
            var8.method374(1);
         }

         if(var2 >= 2) {
            var8.method374(16777215);
         }

         if(var3 != 0) {
            var8.method447(var3);
         }

         class89.method1530(var8.field203, 36, 32);
         if(var9.field1129 != -1) {
            var20.method378(0, 0);
         }

         if(var4 == 1 || var4 == 2 && var9.field1108 == 1) {
            class95.field900.method3543(class322.method5673(var1), 0, 9, 16776960, 1);
         }

         if(!var5) {
            class120.field1122.method2275(var8, var6);
         }

         class89.method1530(var12, var13, var14);
         class89.method1535(var15);
         class257.method4570();
         class257.field2542 = true;
         return var8;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "97"
   )
   static final void method5137() {
      class87.method1275("You can\'t add yourself to your own friend list");
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IB)Ljava/lang/String;",
      garbageValue = "-69"
   )
   static String method5136(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }
}
