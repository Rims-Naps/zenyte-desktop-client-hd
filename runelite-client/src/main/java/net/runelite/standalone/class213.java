package net.runelite.standalone;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public class class213 implements class232 {
   @ObfuscatedName("p")
   static boolean field2928;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = 1052686647
   )
   static int field2929;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Lch;",
      garbageValue = "-1848788016"
   )
   public class293 vmethod4638() {
      return new class60();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "-13231"
   )
   static void method4360() {
      if(client.field2192 && class39.field386 != null && class39.field386.length() > 0) {
         class39.field400 = 1;
      } else {
         class39.field400 = 0;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)[Lfw;",
      garbageValue = "-54"
   )
   public static ServerProt[] method4365() {
      return new ServerProt[]{ServerProt.field2040, ServerProt.field2025, ServerProt.field2091, ServerProt.field2110, ServerProt.field2028, ServerProt.field2085, ServerProt.field2030, ServerProt.field2031, ServerProt.field2032, ServerProt.field2084, ServerProt.field2034, ServerProt.field2035, ServerProt.field2026, ServerProt.field2037, ServerProt.field2058, ServerProt.field2077, ServerProt.field2027, ServerProt.field2041, ServerProt.field2042, ServerProt.field2043, ServerProt.field2044, ServerProt.field2045, ServerProt.field2063, ServerProt.field2047, ServerProt.field2046, ServerProt.field2049, ServerProt.field2105, ServerProt.field2051, ServerProt.field2052, ServerProt.field2053, ServerProt.field2060, ServerProt.field2055, ServerProt.field2056, ServerProt.field2057, ServerProt.field2079, ServerProt.field2059, ServerProt.field2087, ServerProt.field2102, ServerProt.field2048, ServerProt.field2080, ServerProt.field2064, ServerProt.field2065, ServerProt.field2066, ServerProt.field2067, ServerProt.field2024, ServerProt.field2038, ServerProt.field2070, ServerProt.field2071, ServerProt.field2072, ServerProt.field2036, ServerProt.field2081, ServerProt.field2075, ServerProt.field2076, ServerProt.field2033, ServerProt.field2078, ServerProt.field2069, ServerProt.field2073, ServerProt.field2100, ServerProt.field2082, ServerProt.field2083, ServerProt.field2074, ServerProt.field2039, ServerProt.field2086, ServerProt.field2062, ServerProt.field2088, ServerProt.field2089, ServerProt.field2090, ServerProt.field2029, ServerProt.field2092, ServerProt.field2093, ServerProt.field2094, ServerProt.field2095, ServerProt.field2096, ServerProt.field2097, ServerProt.field2098, ServerProt.field2099, ServerProt.field2068, ServerProt.field2101, ServerProt.field2061, ServerProt.field2103, ServerProt.field2104, ServerProt.field2054, ServerProt.field2106, ServerProt.field2107, ServerProt.field2108};
   }

   @ObfuscatedName("ff")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "-28647"
   )
   static final void method4366() {
      int var0 = class152.field1874;
      int[] var1 = class152.field1875;

      for(int var2 = 0; var2 < var0; ++var2) {
         class199 var3 = client.field2269[var1[var2]];
         if(var3 != null) {
            class225.method4562(var3, 1);
         }
      }

   }

   @ObfuscatedName("fc")
   @ObfuscatedSignature(
      signature = "(Lbw;ZB)V",
      garbageValue = "-90"
   )
   static void method4359(class199 var0, boolean var1) {
      if(var0 != null && var0.vmethod3957() && !var0.field2800) {
         var0.field2804 = false;
         if((client.field2157 && class152.field1874 > 50 || class152.field1874 > 200) && var1 && var0.field1078 == var0.field1089) {
            var0.field2804 = true;
         }

         int var2 = var0.field1090 >> 7;
         int var3 = var0.field1072 >> 7;
         if(var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
            long var4 = class282.method5439(0, 0, 0, false, var0.field2823);
            if(var0.field2814 != null && client.field2165 >= var0.field2809 && client.field2165 < var0.field2810) {
               var0.field2804 = false;
               var0.field2808 = class314.method6140(var0.field1090, var0.field1072, class260.field3393);
               var0.field1076 = client.field2165;
               class269.field3464.method1937(class260.field3393, var0.field1090, var0.field1072, var0.field2808, 60, var0, var0.field1073, var4, var0.field2815, var0.field2828, var0.field2817, var0.field2818);
            } else {
               if((var0.field1090 & 127) == 64 && (var0.field1072 & 127) == 64) {
                  if(client.field2314[var2][var3] == client.field2251) {
                     return;
                  }

                  client.field2314[var2][var3] = client.field2251;
               }

               var0.field2808 = class314.method6140(var0.field1090, var0.field1072, class260.field3393);
               var0.field1076 = client.field2165;
               class269.field3464.method1936(class260.field3393, var0.field1090, var0.field1072, var0.field2808, 60, var0, var0.field1073, var4, var0.field1074);
            }
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgl;I)I",
      garbageValue = "1548589281"
   )
   static int method4367(class1 var0) {
      int var1 = var0.method8(2);
      int var2;
      if(var1 == 0) {
         var2 = 0;
      } else if(var1 == 1) {
         var2 = var0.method8(5);
      } else if(var1 == 2) {
         var2 = var0.method8(8);
      } else {
         var2 = var0.method8(11);
      }

      return var2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZLjava/lang/String;ZB)V",
      garbageValue = "-99"
   )
   static void method4363(String var0, boolean var1, String var2, boolean var3) {
      if(var1) {
         if(!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var5) {
               ;
            }
         }

         if(class314.field3850.startsWith("win") && !var3) {
            class247.method4958(var0, 0);
            return;
         }

         if(class314.field3850.startsWith("mac")) {
            class95.method1748(var0, 1, var2);
            return;
         }

         class247.method4958(var0, 2);
      } else {
         class95.method1748(var0, 3, "openjs");
      }

   }
}
