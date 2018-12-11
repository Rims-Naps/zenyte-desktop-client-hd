package net.runelite.standalone;

import java.util.Calendar;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
public class class249 {
   @ObfuscatedName("j")
   static final String[] field3317;
   @ObfuscatedName("k")
   static final double field3321;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "[Lak;"
   )
   static class177[] field3307;
   @ObfuscatedName("c")
   static int[] field3312;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -903115713
   )
   static int field3309;
   @ObfuscatedName("r")
   static String[] field3313;
   @ObfuscatedName("u")
   static boolean field3318;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1635220767
   )
   static int field3314;
   @ObfuscatedName("a")
   static int[][] field3320;
   @ObfuscatedName("g")
   static Calendar field3316;
   @ObfuscatedName("t")
   static boolean field3319;
   @ObfuscatedName("e")
   static int[] field3315;
   @ObfuscatedName("w")
   static int[] field3311;

   static {
      field3315 = new int[5];
      field3320 = new int[5][5000];
      field3312 = new int[1000];
      field3313 = new String[1000];
      field3314 = 0;
      field3307 = new class177[50];
      field3316 = Calendar.getInstance();
      field3317 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
      field3318 = false;
      field3319 = false;
      field3309 = 0;
      field3321 = Math.log(2.0D);
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-655885502"
   )
   static int method5055(int var0, class296 var1, boolean var2) {
      class187 var3 = var2?class3.field36:class284.field3565;
      if(var0 == 1600) {
         field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2579;
         return 1;
      } else if(var0 == 1601) {
         field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2580;
         return 1;
      } else if(var0 == 1602) {
         field3313[++class103.field1146 - 1] = var3.field2619;
         return 1;
      } else if(var0 == 1603) {
         field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2581;
         return 1;
      } else if(var0 == 1604) {
         field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2582;
         return 1;
      } else if(var0 == 1605) {
         field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2612;
         return 1;
      } else if(var0 == 1606) {
         field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2687;
         return 1;
      } else if(var0 == 1607) {
         field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2671;
         return 1;
      } else if(var0 == 1608) {
         field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2610;
         return 1;
      } else if(var0 == 1609) {
         field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2652;
         return 1;
      } else if(var0 == 1610) {
         field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2558;
         return 1;
      } else if(var0 == 1611) {
         field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2633;
         return 1;
      } else if(var0 == 1612) {
         field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2584;
         return 1;
      } else if(var0 == 1613) {
         field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2588.vmethod6234();
         return 1;
      } else if(var0 == 1614) {
         field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2616?1:0;
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
   public static void method5056() {
      if(class239.field3135 != null) {
         class239.field3135.vmethod2787();
      }

   }

   @ObfuscatedName("ho")
   @ObfuscatedSignature(
      signature = "(II)Ljava/lang/String;",
      garbageValue = "-1280964873"
   )
   static String method5057(int var0) {
      return var0 < 0?"":(client.field2296[var0].length() > 0?client.field2295[var0] + " " + client.field2296[var0]:client.field2295[var0]);
   }
}
