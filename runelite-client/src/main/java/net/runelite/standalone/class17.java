package net.runelite.standalone;

import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
public class class17 {
   @ObfuscatedName("a")
   static final BigInteger field204;
   @ObfuscatedName("e")
   static final BigInteger field210;

   static {
      field210 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
      field204 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;Lik;IZI)Let;",
      garbageValue = "1151852438"
   )
   public static class202 method366(Js5Index var0, Js5Index var1, int var2, boolean var3) {
      boolean var4 = true;
      int[] var5 = var0.method4475(var2);

      for(int var6 = 0; var6 < var5.length; ++var6) {
         byte[] var7 = var0.method4495(var2, var5[var6]);
         if(var7 == null) {
            var4 = false;
         } else {
            int var8 = (var7[0] & 255) << 8 | var7[1] & 255;
            byte[] var9;
            if(var3) {
               var9 = var1.method4495(0, var8);
            } else {
               var9 = var1.method4495(var8, 0);
            }

            if(var9 == null) {
               var4 = false;
            }
         }
      }

      if(!var4) {
         return null;
      } else {
         try {
            return new class202(var0, var1, var2, var3);
         } catch (Exception var11) {
            return null;
         }
      }
   }

   @ObfuscatedName("hb")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-676412858"
   )
   static void method367(int var0, int var1) {
      int var2 = class172.field2117.method3890("Choose Option");

      int var3;
      int var4;
      for(var3 = 0; var3 < client.field2290; ++var3) {
         var4 = class172.field2117.method3890(class249.method5057(var3));
         if(var4 > var2) {
            var2 = var4;
         }
      }

      var2 += 8;
      var3 = client.field2290 * 15 + 22;
      var4 = var0 - var2 / 2;
      if(var4 + var2 > class167.field2010) {
         var4 = class167.field2010 - var2;
      }

      if(var4 < 0) {
         var4 = 0;
      }

      int var5 = var1;
      if(var3 + var1 > class193.field2748) {
         var5 = class193.field2748 - var3;
      }

      if(var5 < 0) {
         var5 = 0;
      }

      class138.field1776 = var4;
      WorldMapRegion.field2934 = var5;
      client.field2200 = var2;
      class246.field3300 = client.field2290 * 15 + 22;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)I",
      garbageValue = "-267872578"
   )
   public static int method368(CharSequence var0) {
      return class113.method2115(var0, 10, true);
   }
}
