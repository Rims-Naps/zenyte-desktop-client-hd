package net.runelite.client.standalone;

import java.util.Calendar;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
public class class55 {
   @ObfuscatedName("j")
   static final String[] field412;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -903115713
   )
   static int field404;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "[Lak;"
   )
   static class263[] field402;
   @ObfuscatedName("r")
   static String[] field408;
   @ObfuscatedName("u")
   static boolean field413;
   @ObfuscatedName("c")
   static int[] field407;
   @ObfuscatedName("e")
   static int[] field410;
   @ObfuscatedName("t")
   static boolean field414;
   @ObfuscatedName("a")
   static int[][] field415;
   @ObfuscatedName("g")
   static Calendar field411;
   @ObfuscatedName("w")
   static int[] field406;
   @ObfuscatedName("k")
   static final double field416;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1635220767
   )
   static int field409;

   static {
      field410 = new int[5];
      field415 = new int[5][5000];
      field407 = new int[1000];
      field408 = new String[1000];
      field409 = 0;
      field402 = new class263[50];
      field411 = Calendar.getInstance();
      field412 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
      field413 = false;
      field414 = false;
      field404 = 0;
      field416 = Math.log(2.0D);
   }

   @ObfuscatedName("ho")
   @ObfuscatedSignature(
      signature = "(II)Ljava/lang/String;",
      garbageValue = "-1280964873"
   )
   static String method991(int var0) {
      return var0 < 0?"":(client.field3875[var0].length() > 0?client.field3874[var0] + " " + client.field3875[var0]:client.field3874[var0]);
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-655885502"
   )
   static int method989(int var0, class252 var1, boolean var2) {
      class329 var3 = var2?class182.field1766:class20.field155;
      if(var0 == 1600) {
         field407[++class171.field1587 - 1] = var3.field3565;
         return 1;
      } else if(var0 == 1601) {
         field407[++class171.field1587 - 1] = var3.field3566;
         return 1;
      } else if(var0 == 1602) {
         field408[++class272.field2978 - 1] = var3.field3605;
         return 1;
      } else if(var0 == 1603) {
         field407[++class171.field1587 - 1] = var3.field3567;
         return 1;
      } else if(var0 == 1604) {
         field407[++class171.field1587 - 1] = var3.field3568;
         return 1;
      } else if(var0 == 1605) {
         field407[++class171.field1587 - 1] = var3.field3598;
         return 1;
      } else if(var0 == 1606) {
         field407[++class171.field1587 - 1] = var3.field3673;
         return 1;
      } else if(var0 == 1607) {
         field407[++class171.field1587 - 1] = var3.field3657;
         return 1;
      } else if(var0 == 1608) {
         field407[++class171.field1587 - 1] = var3.field3596;
         return 1;
      } else if(var0 == 1609) {
         field407[++class171.field1587 - 1] = var3.field3638;
         return 1;
      } else if(var0 == 1610) {
         field407[++class171.field1587 - 1] = var3.field3544;
         return 1;
      } else if(var0 == 1611) {
         field407[++class171.field1587 - 1] = var3.field3619;
         return 1;
      } else if(var0 == 1612) {
         field407[++class171.field1587 - 1] = var3.field3570;
         return 1;
      } else if(var0 == 1613) {
         field407[++class171.field1587 - 1] = var3.field3574.vmethod5937();
         return 1;
      } else if(var0 == 1614) {
         field407[++class171.field1587 - 1] = var3.field3602?1:0;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "80"
   )
   public static void method990() {
      if(class270.field2966 != null) {
         class270.field2966.vmethod5521();
      }

   }
}
