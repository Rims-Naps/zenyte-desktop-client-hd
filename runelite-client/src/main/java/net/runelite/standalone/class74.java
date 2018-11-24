package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
public class class74 {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   public static final class74 field837;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   public static final class74 field840;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   public static final class74 field845;
   @ObfuscatedName("d")
   static int[] field839;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   public static final class74 field842;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   public static final class74 field841;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   public static final class74 field838;
   @ObfuscatedName("c")
   String field843;

   static {
      field845 = new class74("p11_full");
      field837 = new class74("p12_full");
      field838 = new class74("b12_full");
      field840 = new class74("verdana_11pt_regular");
      field841 = new class74("verdana_13pt_regular");
      field842 = new class74("verdana_15pt_regular");
   }

   class74(String var1) {
      this.field843 = var1;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1678777503"
   )
   public static void method1560() {
      class40.field409.method1816();
   }

   @ObfuscatedName("jk")
   @ObfuscatedSignature(
      signature = "([Lhw;II)V",
      garbageValue = "-687373472"
   )
   static final void method1559(class187[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         class187 var3 = var0[var2];
         if(var3 != null && var3.field2577 == var1 && (!var3.field2557 || !class267.method5315(var3))) {
            int var5;
            if(var3.field2560 == 0) {
               if(!var3.field2557 && class267.method5315(var3) && var3 != class263.field3408) {
                  continue;
               }

               method1559(var0, var3.field2621);
               if(var3.field2688 != null) {
                  method1559(var3.field2688, var3.field2621);
               }

               class322 var4 = (class322)client.field2412.method1776((long)var3.field2621);
               if(var4 != null) {
                  var5 = var4.field3937;
                  if(class80.method1596(var5)) {
                     method1559(class187.field2547[var5], -1);
                  }
               }
            }

            if(var3.field2560 == 6) {
               if(var3.field2605 != -1 || var3.field2606 != -1) {
                  boolean var7 = class188.method3803(var3);
                  if(var7) {
                     var5 = var3.field2606;
                  } else {
                     var5 = var3.field2605;
                  }

                  if(var5 != -1) {
                     class312 var6 = class3.method74(var5);

                     for(var3.field2663 += client.field2410; var3.field2663 > var6.field3836[var3.field2686]; class230.method4617(var3)) {
                        var3.field2663 -= var6.field3836[var3.field2686];
                        ++var3.field2686;
                        if(var3.field2686 >= var6.field3844.length) {
                           var3.field2686 -= var6.field3838;
                           if(var3.field2686 < 0 || var3.field2686 >= var6.field3844.length) {
                              var3.field2686 = 0;
                           }
                        }
                     }
                  }
               }

               if(var3.field2614 != 0 && !var3.field2557) {
                  int var8 = var3.field2614 >> 16;
                  var5 = var3.field2614 << 16 >> 16;
                  var8 *= client.field2410;
                  var5 *= client.field2410;
                  var3.field2687 = var8 + var3.field2687 & 2047;
                  var3.field2610 = var5 + var3.field2610 & 2047;
                  class230.method4617(var3);
               }
            }
         }
      }

   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(Lbu;I)V",
      garbageValue = "437597844"
   )
   static void method1558(class88 var0) {
      if(var0.method1636() != client.field2156) {
         client.field2156 = var0.method1636();
         class124.method2236(var0.method1636());
      }

      class256.field3356 = var0.field955;
      client.field2206 = var0.field958;
      client.field2154 = var0.field953;
      class121.field1652 = client.field2155 == 0?43594:var0.field958 + 40000;
      class179.field2455 = client.field2155 == 0?443:var0.field958 + 50000;
      class45.field509 = class121.field1652;
   }
}
