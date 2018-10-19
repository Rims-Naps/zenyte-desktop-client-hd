package net.runelite.client.standalone;

import java.util.Calendar;
import java.util.TimeZone;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class106 {
   @ObfuscatedName("f")
   static final String[][] field989;
   @ObfuscatedName("l")
   static final String[] field991;
   @ObfuscatedName("w")
   static Calendar field990;
   @ObfuscatedName("gy")
   @ObfuscatedGetter(
      intValue = 821069027
   )
   static int field992;

   static {
      field989 = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}};
      field991 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
      Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
      field990 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Object;ZI)[B",
      garbageValue = "1303679022"
   )
   public static byte[] method1788(Object var0, boolean var1) {
      if(var0 == null) {
         return null;
      } else if(var0 instanceof byte[]) {
         byte[] var3 = (byte[])((byte[])var0);
         return var1?class286.method5062(var3):var3;
      } else if(var0 instanceof class324) {
         class324 var2 = (class324)var0;
         return var2.vmethod5727();
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-1270339874"
   )
   static int method1787(int var0, class252 var1, boolean var2) {
      class329 var3 = class189.getWidget(class55.field407[--class171.field1587]);
      if(var0 == 2600) {
         class55.field407[++class171.field1587 - 1] = var3.field3565;
         return 1;
      } else if(var0 == 2601) {
         class55.field407[++class171.field1587 - 1] = var3.field3566;
         return 1;
      } else if(var0 == 2602) {
         class55.field408[++class272.field2978 - 1] = var3.field3605;
         return 1;
      } else if(var0 == 2603) {
         class55.field407[++class171.field1587 - 1] = var3.field3567;
         return 1;
      } else if(var0 == 2604) {
         class55.field407[++class171.field1587 - 1] = var3.field3568;
         return 1;
      } else if(var0 == 2605) {
         class55.field407[++class171.field1587 - 1] = var3.field3598;
         return 1;
      } else if(var0 == 2606) {
         class55.field407[++class171.field1587 - 1] = var3.field3673;
         return 1;
      } else if(var0 == 2607) {
         class55.field407[++class171.field1587 - 1] = var3.field3657;
         return 1;
      } else if(var0 == 2608) {
         class55.field407[++class171.field1587 - 1] = var3.field3596;
         return 1;
      } else if(var0 == 2609) {
         class55.field407[++class171.field1587 - 1] = var3.field3638;
         return 1;
      } else if(var0 == 2610) {
         class55.field407[++class171.field1587 - 1] = var3.field3544;
         return 1;
      } else if(var0 == 2611) {
         class55.field407[++class171.field1587 - 1] = var3.field3619;
         return 1;
      } else if(var0 == 2612) {
         class55.field407[++class171.field1587 - 1] = var3.field3570;
         return 1;
      } else if(var0 == 2613) {
         class55.field407[++class171.field1587 - 1] = var3.field3574.vmethod5937();
         return 1;
      } else if(var0 == 2614) {
         class55.field407[++class171.field1587 - 1] = var3.field3602?1:0;
         return 1;
      } else {
         return 2;
      }
   }
}
