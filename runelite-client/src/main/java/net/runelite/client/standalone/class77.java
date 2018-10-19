package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
public class class77 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lq;"
   )
   static final class77 field710;
   @ObfuscatedName("da")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class108 field705;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lq;"
   )
   static final class77 field706;
   @ObfuscatedName("co")
   @ObfuscatedGetter(
      intValue = -171177635
   )
   public static int field713;
   @ObfuscatedName("gw")
   static int[][] field711;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1116137403
   )
   final int field707;

   static {
      field710 = new class77(0);
      field706 = new class77(1);
   }

   class77(int var1) {
      this.field707 = var1;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-1973531470"
   )
   static int method1189(int var0, class252 var1, boolean var2) {
      if(var0 == 6200) {
         class171.field1587 -= 2;
         client.field3975 = (short)class263.method4814(class55.field407[class171.field1587]);
         if(client.field3975 <= 0) {
            client.field3975 = 256;
         }

         client.field3984 = (short)class263.method4814(class55.field407[class171.field1587 + 1]);
         if(client.field3984 <= 0) {
            client.field3984 = 256;
         }

         return 1;
      } else if(var0 == 6201) {
         class171.field1587 -= 2;
         client.field3838 = (short)class55.field407[class171.field1587];
         if(client.field3838 <= 0) {
            client.field3838 = 256;
         }

         client.field3985 = (short)class55.field407[class171.field1587 + 1];
         if(client.field3985 <= 0) {
            client.field3985 = 320;
         }

         return 1;
      } else if(var0 == 6202) {
         class171.field1587 -= 4;
         client.field3986 = (short)class55.field407[class171.field1587];
         if(client.field3986 <= 0) {
            client.field3986 = 1;
         }

         client.field3987 = (short)class55.field407[class171.field1587 + 1];
         if(client.field3987 <= 0) {
            client.field3987 = 32767;
         } else if(client.field3987 < client.field3986) {
            client.field3987 = client.field3986;
         }

         client.field3988 = (short)class55.field407[class171.field1587 + 2];
         if(client.field3988 <= 0) {
            client.field3988 = 1;
         }

         client.field3920 = (short)class55.field407[class171.field1587 + 3];
         if(client.field3920 <= 0) {
            client.field3920 = 32767;
         } else if(client.field3920 < client.field3988) {
            client.field3920 = client.field3988;
         }

         return 1;
      } else if(var0 == 6203) {
         if(client.field3904 != null) {
            class12.method137(0, 0, client.field3904.field3559, client.field3904.field3560, false);
            class55.field407[++class171.field1587 - 1] = client.field3992;
            class55.field407[++class171.field1587 - 1] = client.field3938;
         } else {
            class55.field407[++class171.field1587 - 1] = -1;
            class55.field407[++class171.field1587 - 1] = -1;
         }

         return 1;
      } else if(var0 == 6204) {
         class55.field407[++class171.field1587 - 1] = client.field3838;
         class55.field407[++class171.field1587 - 1] = client.field3985;
         return 1;
      } else if(var0 == 6205) {
         class55.field407[++class171.field1587 - 1] = class104.method1770(client.field3975);
         class55.field407[++class171.field1587 - 1] = class104.method1770(client.field3984);
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("ia")
   @ObfuscatedSignature(
      signature = "(Lhw;IIZI)V",
      garbageValue = "-935605160"
   )
   static void method1190(class329 var0, int var1, int var2, boolean var3) {
      int var4 = var0.field3559;
      int var5 = var0.field3560;
      if(var0.field3551 == 0) {
         var0.field3559 = var0.field3555;
      } else if(var0.field3551 == 1) {
         var0.field3559 = var1 - var0.field3555;
      } else if(var0.field3551 == 2) {
         var0.field3559 = var0.field3555 * var1 >> 14;
      }

      if(var0.field3678 == 0) {
         var0.field3560 = var0.field3556;
      } else if(var0.field3678 == 1) {
         var0.field3560 = var2 - var0.field3556;
      } else if(var0.field3678 == 2) {
         var0.field3560 = var2 * var0.field3556 >> 14;
      }

      if(var0.field3551 == 4) {
         var0.field3559 = var0.field3560 * var0.field3561 / var0.field3549;
      }

      if(var0.field3678 == 4) {
         var0.field3560 = var0.field3559 * var0.field3549 / var0.field3561;
      }

      if(var0.field3548 == 1337) {
         client.field3904 = var0;
      }

      if(var3 && var0.field3659 != null && (var4 != var0.field3559 || var5 != var0.field3560)) {
         class9 var6 = new class9();
         var6.field63 = var0;
         var6.field69 = var0.field3659;
         client.field3811.method5600(var6);
      }

   }
}
