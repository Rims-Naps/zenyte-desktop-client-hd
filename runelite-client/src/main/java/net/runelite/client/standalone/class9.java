package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSScriptEvent;

@ObfuscatedName("bs")
public class class9 extends class76 implements RSScriptEvent {
   @ObfuscatedName("fh")
   @ObfuscatedSignature(
      signature = "Lkn;"
   )
   static class277 field76;
   @ObfuscatedName("f")
   Object[] field69;
   @ObfuscatedName("m")
   String field70;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -105003155
   )
   int field72;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -117761267
   )
   int field75;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 455058847
   )
   int field64;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   class329 field71;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 358647689
   )
   int field65;
   @ObfuscatedName("l")
   boolean field62;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 293784095
   )
   int field68;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1586730767
   )
   int field66;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   class329 field63;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1068802945
   )
   int field73;

   public class9() {
      this.field72 = 76;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/Object;I)V",
      garbageValue = "-1825244821"
   )
   public void method101(Object[] var1) {
      this.field69 = var1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "568781177"
   )
   public void method102(int var1) {
      this.field72 = var1;
   }

   public void setArguments(Object[] var1) {
      this.field69 = var1;
   }

   public Object[] getArguments() {
      return this.field69;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;Lik;Lik;Lhc;I)Z",
      garbageValue = "-1086198552"
   )
   public static boolean method100(class148 var0, class148 var1, class148 var2, class24 var3) {
      class227.field2229 = var0;
      class227.field2231 = var1;
      class227.field2230 = var2;
      class227.field2234 = var3;
      return true;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "1661017438"
   )
   static int method112(int var0, class252 var1, boolean var2) {
      if(var0 == 5306) {
         class55.field407[++class171.field1587 - 1] = class319.method5597();
         return 1;
      } else {
         int var3;
         if(var0 == 5307) {
            var3 = class55.field407[--class171.field1587];
            if(var3 == 1 || var3 == 2) {
               class289.method5106(var3);
            }

            return 1;
         } else if(var0 == 5308) {
            class55.field407[++class171.field1587 - 1] = class153.field1455.field1861;
            return 1;
         } else if(var0 != 5309) {
            return 2;
         } else {
            var3 = class55.field407[--class171.field1587];
            if(var3 == 1 || var3 == 2) {
               class153.field1455.field1861 = var3;
               class57.method1015();
            }

            return 1;
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Throwable;Ljava/lang/String;)Lep;"
   )
   public static class302 method103(Throwable var0, String var1) {
      class302 var2;
      if(var0 instanceof class302) {
         var2 = (class302)var0;
         var2.field3235 = var2.field3235 + ' ' + var1;
      } else {
         var2 = new class302(var0, var1);
      }

      return var2;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIIIIIB)I",
      garbageValue = "-75"
   )
   public static int method110(int var0, int var1, int var2, int var3, int var4, int var5) {
      if((var5 & 1) == 1) {
         int var6 = var3;
         var3 = var4;
         var4 = var6;
      }

      var2 &= 3;
      return var2 == 0?var0:(var2 == 1?var1:(var2 == 2?7 - var0 - (var3 - 1):7 - var1 - (var4 - 1)));
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "1185916841"
   )
   static int method113(int var0, class252 var1, boolean var2) {
      class329 var3 = class189.getWidget(class55.field407[--class171.field1587]);
      if(var0 == 2500) {
         class55.field407[++class171.field1587 - 1] = var3.field3620;
         return 1;
      } else if(var0 == 2501) {
         class55.field407[++class171.field1587 - 1] = var3.field3558;
         return 1;
      } else if(var0 == 2502) {
         class55.field407[++class171.field1587 - 1] = var3.field3559;
         return 1;
      } else if(var0 == 2503) {
         class55.field407[++class171.field1587 - 1] = var3.field3560;
         return 1;
      } else if(var0 == 2504) {
         class55.field407[++class171.field1587 - 1] = var3.field3569?1:0;
         return 1;
      } else if(var0 == 2505) {
         class55.field407[++class171.field1587 - 1] = var3.field3563;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("eh")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2142917472"
   )
   static void method114() {
      client.field3963.method2233();
      client.field3963.field1156.field1073 = 0;
      client.field3963.field1151 = null;
      client.field3963.field1161 = null;
      client.field3963.field1150 = null;
      client.field3963.field1163 = null;
      client.field3963.packetLength = 0;
      client.field3963.field1159 = 0;
      client.field3751 = 0;
      client.field3869 = 0;
      client.onMenuOptionsChanged(-1);
      client.field3939 = false;
      client.minimapState = 0;
      client.field3795 = 0;

      int var0;
      for(var0 = 0; var0 < 2048; ++var0) {
         client.field3848[var0] = null;
         client.cachedPlayersChanged(var0);
      }

      class5.field43 = null;

      for(var0 = 0; var0 < client.field3774.length; ++var0) {
         class237 var1 = client.field3774[var0];
         if(var1 != null) {
            var1.field1285 = -1;
            var1.interactingChanged(-1);
            var1.field1283 = false;
         }
      }

      class292.field3153 = new class310(32);
      class188.method3239(30);

      for(var0 = 0; var0 < 100; ++var0) {
         client.field3930[var0] = true;
      }

      class123.method2265();
   }
}
