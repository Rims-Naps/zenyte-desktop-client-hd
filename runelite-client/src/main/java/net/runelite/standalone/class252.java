package net.runelite.standalone;

import java.util.Calendar;
import java.util.TimeZone;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class252 {
   @ObfuscatedName("l")
   static final String[] field3335;
   @ObfuscatedName("f")
   static final String[][] field3333;
   @ObfuscatedName("gy")
   @ObfuscatedGetter(
      intValue = 821069027
   )
   static int field3336;
   @ObfuscatedName("w")
   static Calendar field3334;

   static {
      field3333 = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}};
      field3335 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
      Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
      field3334 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Object;ZI)[B",
      garbageValue = "1303679022"
   )
   public static byte[] method5078(Object var0, boolean var1) {
      if(var0 == null) {
         return null;
      } else if(var0 instanceof byte[]) {
         byte[] var3 = (byte[])((byte[])var0);
         return var1?class227.method4595(var3):var3;
      } else if(var0 instanceof class132) {
         class132 var2 = (class132)var0;
         return var2.vmethod4715();
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-1270339874"
   )
   static int method5077(int var0, class296 var1, boolean var2) {
      class187 var3 = class48.method1047(class249.field3312[--class308.field3811]);
      if(var0 == 2600) {
         class249.field3312[++class308.field3811 - 1] = var3.field2579;
         return 1;
      } else if(var0 == 2601) {
         class249.field3312[++class308.field3811 - 1] = var3.field2580;
         return 1;
      } else if(var0 == 2602) {
         class249.field3313[++class103.field1146 - 1] = var3.field2619;
         return 1;
      } else if(var0 == 2603) {
         class249.field3312[++class308.field3811 - 1] = var3.field2581;
         return 1;
      } else if(var0 == 2604) {
         class249.field3312[++class308.field3811 - 1] = var3.field2582;
         return 1;
      } else if(var0 == 2605) {
         class249.field3312[++class308.field3811 - 1] = var3.field2612;
         return 1;
      } else if(var0 == 2606) {
         class249.field3312[++class308.field3811 - 1] = var3.field2687;
         return 1;
      } else if(var0 == 2607) {
         class249.field3312[++class308.field3811 - 1] = var3.field2671;
         return 1;
      } else if(var0 == 2608) {
         class249.field3312[++class308.field3811 - 1] = var3.field2610;
         return 1;
      } else if(var0 == 2609) {
         class249.field3312[++class308.field3811 - 1] = var3.field2652;
         return 1;
      } else if(var0 == 2610) {
         class249.field3312[++class308.field3811 - 1] = var3.field2558;
         return 1;
      } else if(var0 == 2611) {
         class249.field3312[++class308.field3811 - 1] = var3.field2633;
         return 1;
      } else if(var0 == 2612) {
         class249.field3312[++class308.field3811 - 1] = var3.field2584;
         return 1;
      } else if(var0 == 2613) {
         class249.field3312[++class308.field3811 - 1] = var3.field2588.vmethod6234();
         return 1;
      } else if(var0 == 2614) {
         class249.field3312[++class308.field3811 - 1] = var3.field2616?1:0;
         return 1;
      } else {
         return 2;
      }
   }
}
