package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
public final class class272 {
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 588085773
   )
   static int field2978;
   @ObfuscatedName("ff")
   @ObfuscatedSignature(
      signature = "Lkn;"
   )
   static class277 field2981;
   @ObfuscatedName("k")
   static int[] field2979;

   @ObfuscatedName("hp")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-49"
   )
   static void method4900(int var0, int var1) {
      class279 var2 = class95.writeClientProt(ClientProt.DIALOGUE_CONTINUE, client.field3963.field1162);
      var2.field3018.writeIntV2(var0);
      var2.field3018.writeShort128(var1);
      client.field3963.method2235(var2);
   }

   @ObfuscatedName("gl")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "-1261897990"
   )
   static final void method4901(int var0, int var1, int var2) {
      if(var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         int var3 = class7.method85(var0, var1, class315.plane) - var2;
         var0 -= class83.field738;
         var3 -= class296.field3191;
         var1 -= class50.field375;
         int var4 = class257.field2564[client.field4009];
         int var5 = class257.field2558[client.field4009];
         int var6 = class257.field2564[class61.field469];
         int var7 = class257.field2558[class61.field469];
         int var8 = var6 * var1 + var0 * var7 >> 16;
         var1 = var7 * var1 - var0 * var6 >> 16;
         var0 = var8;
         var8 = var5 * var3 - var4 * var1 >> 16;
         var1 = var5 * var1 + var3 * var4 >> 16;
         if(var1 >= 50) {
            client.field3831 = var0 * client.field3809 / var1 + client.field3992 / 2;
            client.field3832 = client.field3938 / 2 + var8 * client.field3809 / var1;
         } else {
            client.field3831 = -1;
            client.field3832 = -1;
         }

      } else {
         client.field3831 = -1;
         client.field3832 = -1;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lik;IIB)[Llp;",
      garbageValue = "-26"
   )
   public static class26[] method4897(class148 var0, int var1, int var2) {
      byte[] var4 = var0.method2579(var1, var2, -206190060);
      boolean var3;
      if(var4 == null) {
         var3 = false;
      } else {
         class194.method3303(var4);
         var3 = true;
      }

      if(!var3) {
         return null;
      } else {
         class26[] var5 = new class26[class112.field1056];

         for(int var6 = 0; var6 < class112.field1056; ++var6) {
            class26 var7 = var5[var6] = new class26();
            var7.field207 = class112.field1057;
            var7.field210 = class112.field1054;
            var7.field204 = class120.field1149[var6];
            var7.field205 = class112.field1055[var6];
            var7.field202 = class112.field1052[var6];
            var7.field201 = class167.field1544[var6];
            int var8 = var7.field202 * var7.field201;
            byte[] var9 = class161.field1507[var6];
            var7.field203 = new int[var8];

            for(int var10 = 0; var10 < var8; ++var10) {
               var7.field203[var10] = class192.field1841[var9[var10] & 255];
            }
         }

         class120.field1149 = null;
         class112.field1055 = null;
         class112.field1052 = null;
         class167.field1544 = null;
         class192.field1841 = null;
         class161.field1507 = null;
         return var5;
      }
   }

   @ObfuscatedName("hy")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1102483836"
   )
   static void method4899() {
      if(client.field3887) {
         class329 var0 = class313.method5512(class98.field914, client.field3888);
         if(var0 != null && var0.field3642 != null) {
            class9 var1 = new class9();
            var1.field63 = var0;
            var1.field69 = var0.field3642;
            class240.method4263(var1);
         }

         client.field3887 = false;
         class184.method3216(var0);
      }
   }
}
