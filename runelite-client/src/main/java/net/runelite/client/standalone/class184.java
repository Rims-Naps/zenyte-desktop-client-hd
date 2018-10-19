package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
public final class class184 {
   @ObfuscatedName("lr")
   @ObfuscatedGetter(
      intValue = 1925789719
   )
   static int field1776;
   @ObfuscatedName("l")
   final int[] field1775;

   class184() {
      this.field1775 = new int[4096];
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lam;I)V",
      garbageValue = "-1839236628"
   )
   final void method3211(class296 var1) {
      for(int var2 = 0; var2 < 64; ++var2) {
         for(int var3 = 0; var3 < 64; ++var3) {
            this.field1775[var2 * 64 + var3] = var1.method5148(var2, var3) | -16777216;
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-1494303787"
   )
   final int method3214(int var1, int var2) {
      return this.field1775[var2 + var1 * 64];
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Lgm;J)V"
   )
   static void method3221(Buffer var0, long var1) {
      var1 /= 10L;
      if(var1 < 0L) {
         var1 = 0L;
      } else if(var1 > 65535L) {
         var1 = 65535L;
      }

      var0.writeShort((int)var1);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-636544783"
   )
   static int method3213(int var0, class252 var1, boolean var2) {
      if(var0 == 5630) {
         client.field3877 = 250;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("jl")
   @ObfuscatedSignature(
      signature = "(IIII)Lbl;",
      garbageValue = "-1985952342"
   )
   static final class45 method3217(int var0, int var1, int var2) {
      class45 var3 = new class45();
      var3.field351 = var1;
      var3.field348 = var2;
      client.field3991.method5309(var3, (long)var0);
      class127.method2365(var1);
      class329 var4 = class189.getWidget(var0);
      method3216(var4);
      if(client.field3898 != null) {
         method3216(client.field3898);
         client.field3898 = null;
      }

      for(int var5 = 0; var5 < client.field3869; ++var5) {
         int var7 = client.field3872[var5];
         boolean var6 = var7 == 57 || var7 == 58 || var7 == 1007 || var7 == 25 || var7 == 30;
         if(var6) {
            if(var5 < client.field3869 - 1) {
               for(int var8 = var5; var8 < client.field3869 - 1; ++var8) {
                  client.field3874[var8] = client.field3874[var8 + 1];
                  client.field3875[var8] = client.field3875[var8 + 1];
                  client.field3872[var8] = client.field3872[var8 + 1];
                  client.field3947[var8] = client.field3947[var8 + 1];
                  client.field3870[var8] = client.field3870[var8 + 1];
                  client.field3871[var8] = client.field3871[var8 + 1];
                  client.field3906[var8] = client.field3906[var8 + 1];
               }
            }

            --var5;
            --client.field3869;
            client.onMenuOptionsChanged(-1);
         }
      }

      class263.method4816();
      class130.method2395(class329.field3533[var0 >> 16], var4, false);
      class285.method5036(var1, 294669053);
      if(client.field3892 != -1) {
         class161.method2770(client.field3892, 1);
      }

      return var3;
   }

   @ObfuscatedName("fi")
   @ObfuscatedSignature(
      signature = "(Lhw;III)V",
      garbageValue = "-1215534032"
   )
   static final void method3220(class329 var0, int var1, int var2) {
      if(client.minimapState == 0 || client.minimapState == 3) {
         if(!client.field3939 && (class226.field2222 == 1 || !class192.field1840 && class226.field2222 == 4)) {
            class123 var3 = var0.method5887(true);
            if(var3 == null) {
               return;
            }

            int var4 = class226.field2220 - var1;
            int var5 = class226.field2224 - var2;
            if(var3.method2260(var4, var5)) {
               var4 -= var3.field1174 / 2;
               var5 -= var3.field1171 / 2;
               int var6 = client.field3802 & 2047;
               int var7 = class257.field2564[var6];
               int var8 = class257.field2558[var6];
               int var9 = var4 * var8 + var5 * var7 >> 11;
               int var10 = var5 * var8 - var7 * var4 >> 11;
               int var11 = var9 + class5.field43.field1277 >> 7;
               int var12 = class5.field43.field1259 - var10 >> 7;
               class279 var13 = class95.writeClientProt(ClientProt.MINIMAP_WALK, client.field3963.field1162);
               var13.field3018.writeByte(18);
               var13.field3018.writeShort128(var12 + class284.somey);
               var13.field3018.writeShort128(var11 + class296.somex);
               var13.field3018.writeByte128(class135.field1332[82]?(class135.field1332[81]?2:1):0);
               var13.field3018.writeByte(var4);
               var13.field3018.writeByte(var5);
               var13.field3018.writeShort(client.field3802);
               var13.field3018.writeByte(57);
               var13.field3018.writeByte(0);
               var13.field3018.writeByte(0);
               var13.field3018.writeByte(89);
               var13.field3018.writeShort(class5.field43.field1277);
               var13.field3018.writeShort(class5.field43.field1259);
               var13.field3018.writeByte(63);
               client.field3963.method2235(var13);
               client.field3795 = var11;
               client.field3993 = var12;
            }
         }

      }
   }

   @ObfuscatedName("jv")
   @ObfuscatedSignature(
      signature = "(Lhw;I)V",
      garbageValue = "-18166832"
   )
   static void method3216(class329 var0) {
      if(var0.field3653 == client.field3959) {
         client.field3930[var0.field3681] = true;
      }

   }

   @ObfuscatedName("fb")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "611286336"
   )
   static void method3218(int var0) {
      if(var0 == -1 && !client.field3972) {
         class227.field2234.method249();
         class227.field2232 = 1;
         class53.field391 = null;
      } else if(var0 != -1 && var0 != client.field3907 && client.field3965 != 0 && !client.field3972) {
         class326.method5777(2, client.field4007, var0, 0, client.field3965, false);
      }

      client.field3907 = var0;
   }
}
