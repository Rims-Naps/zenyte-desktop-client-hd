package net.runelite.standalone;

import net.runelite.api.widgets.Widget;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSScriptEvent;

@ObfuscatedName("bs")
public class class194 extends class197 implements RSScriptEvent {
   @ObfuscatedName("fh")
   @ObfuscatedSignature(
      signature = "Lkn;"
   )
   static class299 field2772;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -105003155
   )
   int field2768;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 455058847
   )
   int field2760;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   class187 field2767;
   @ObfuscatedName("l")
   boolean field2758;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 293784095
   )
   int field2764;
   @ObfuscatedName("f")
   Object[] field2765;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -117761267
   )
   int field2771;
   @ObfuscatedName("m")
   String field2766;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1068802945
   )
   int field2769;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1586730767
   )
   int field2762;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 358647689
   )
   int field2761;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   class187 field2759;

   public class194() {
      this.field2768 = 76;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "568781177"
   )
   public void method3921(int var1) {
      this.field2768 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/Object;I)V",
      garbageValue = "-1825244821"
   )
   public void method3920(Object[] var1) {
      this.field2765 = var1;
   }

   public void setArguments(Object[] var1) {
      this.field2765 = var1;
   }

   public Object[] getArguments() {
      return this.field2765;
   }

   public Widget getSource() {
      return this.field2759;
   }

   public int getOp() {
      return this.field2762;
   }

   public String getOpbase() {
      return this.field2766;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "1185916841"
   )
   static int method3932(int var0, class296 var1, boolean var2) {
      class187 var3 = class48.method1047(class249.field3312[--MapCacheArchiveNames.field3811]);
      if(var0 == 2500) {
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2634;
         return 1;
      } else if(var0 == 2501) {
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2572;
         return 1;
      } else if(var0 == 2502) {
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2573;
         return 1;
      } else if(var0 == 2503) {
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2574;
         return 1;
      } else if(var0 == 2504) {
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2583?1:0;
         return 1;
      } else if(var0 == 2505) {
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2577;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Throwable;Ljava/lang/String;)Lep;"
   )
   public static class57 method3922(Throwable var0, String var1) {
      class57 var2;
      if(var0 instanceof class57) {
         var2 = (class57)var0;
         var2.field709 = var2.field709 + ' ' + var1;
      } else {
         var2 = new class57(var0, var1);
      }

      return var2;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIIIIIB)I",
      garbageValue = "-75"
   )
   public static int method3929(int var0, int var1, int var2, int var3, int var4, int var5) {
      if((var5 & 1) == 1) {
         int var6 = var3;
         var3 = var4;
         var4 = var6;
      }

      var2 &= 3;
      return var2 == 0?var0:(var2 == 1?var1:(var2 == 2?7 - var0 - (var3 - 1):7 - var1 - (var4 - 1)));
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;Lik;Lik;Lhc;I)Z",
      garbageValue = "-1086198552"
   )
   public static boolean method3919(Js5Index var0, Js5Index var1, Js5Index var2, class66 var3) {
      class43.field478 = var0;
      class43.field480 = var1;
      class43.field479 = var2;
      class43.field483 = var3;
      return true;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "1661017438"
   )
   static int method3931(int var0, class296 var1, boolean var2) {
      if(var0 == 5306) {
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = WorldMapRegion.method4379();
         return 1;
      } else {
         int var3;
         if(var0 == 5307) {
            var3 = class249.field3312[--MapCacheArchiveNames.field3811];
            if(var3 == 1 || var3 == 2) {
               class109.method1920(var3);
            }

            return 1;
         } else if(var0 == 5308) {
            class249.field3312[++MapCacheArchiveNames.field3811 - 1] = WorldMapNode.field2134.field859;
            return 1;
         } else if(var0 != 5309) {
            return 2;
         } else {
            var3 = class249.field3312[--MapCacheArchiveNames.field3811];
            if(var3 == 1 || var3 == 2) {
               WorldMapNode.field2134.field859 = var3;
               class236.method4709();
            }

            return 1;
         }
      }
   }

   @ObfuscatedName("eh")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2142917472"
   )
   static void method3933() {
      client.field2384.method2571();
      client.field2384.field1764.position = 0;
      client.field2384.field1759 = null;
      client.field2384.field1769 = null;
      client.field2384.field1758 = null;
      client.field2384.field1771 = null;
      client.field2384.field1768 = 0;
      client.field2384.field1767 = 0;
      client.field2172 = 0;
      client.field2290 = 0;
      client.onMenuOptionsChanged(-1);
      client.field2360 = false;
      client.field2411 = 0;
      client.field2216 = 0;

      int var0;
      for(var0 = 0; var0 < 2048; ++var0) {
         client.field2269[var0] = null;
         client.cachedPlayersChanged(var0);
      }

      class32.field303 = null;

      for(var0 = 0; var0 < client.field2195.length; ++var0) {
         class176 var1 = client.field2195[var0];
         if(var1 != null) {
            var1.field1098 = -1;
            var1.interactingChanged(-1);
            var1.field1096 = false;
         }
      }

      class231.field3079 = new class98(32);
      class142.method2635(30);

      for(var0 = 0; var0 < 100; ++var0) {
         client.field2351[var0] = true;
      }

      class198.method3945();
   }
}
