package net.runelite.standalone;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSGraphicsObject;

@ObfuscatedName("by")
public final class class79 extends class102 implements RSGraphicsObject {
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1922009023
   )
   int field887;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Ljw;"
   )
   class312 field879;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -814673119
   )
   int field874;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -320711417
   )
   int field876;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1257957751
   )
   int field875;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1330309303
   )
   int field882;
   @ObfuscatedName("m")
   boolean field884;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1277209531
   )
   int field878;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 2027400707
   )
   int field877;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1864600825
   )
   int field886;

   class79(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field887 = 0;
      this.field882 = 0;
      this.field884 = false;
      this.field875 = var1;
      this.field886 = var2;
      this.field876 = var3;
      this.field877 = var4;
      this.field878 = var5;
      this.field874 = var7 + var6;
      int var8 = class283.method5464(this.field875).field813;
      if(var8 != -1) {
         this.field884 = false;
         this.field879 = class3.method74(var8);
      } else {
         this.field884 = true;
      }

      this.rl$$init();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IS)V",
      garbageValue = "20492"
   )
   final void method1585(int var1) {
      if(!this.field884) {
         this.field882 += var1;

         while(this.field882 > this.field879.field3836[this.field887]) {
            this.field882 -= this.field879.field3836[this.field887];
            ++this.field887;
            if(this.field887 >= this.field879.field3844.length) {
               this.field884 = true;
               break;
            }
         }

      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(S)Lds;"
   )
   protected final class52 vmethod6253(short var1) {
      class71 var2 = class283.method5464(this.field875);
      class52 var3;
      if(!this.field884) {
         var3 = var2.method1529(this.field887);
      } else {
         var3 = var2.method1529(-1);
      }

      return var3 == null?null:var3;
   }

   public int getX() {
      return this.field876;
   }

   public int getY() {
      return this.field877;
   }

   private void rl$$init() {
      GraphicsObjectCreated var1 = new GraphicsObjectCreated(this);
      class302.field3755.getCallbacks().post(var1);
   }

   public LocalPoint getLocation() {
      return new LocalPoint(this.getX(), this.getY());
   }

   public int getId() {
      return this.field875;
   }

   public int getStartCycle() {
      return this.field874;
   }

   public int getLevel() {
      return this.field886;
   }

   public int getHeight() {
      return this.field878;
   }

   @ObfuscatedName("hz")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)V",
      garbageValue = "-1609692187"
   )
   static void method1594(int var0, String var1) {
      int var2 = class152.field1874;
      int[] var3 = class152.field1875;
      boolean var4 = false;
      class158 var5 = new class158(var1, class140.field1794);

      for(int var6 = 0; var6 < var2; ++var6) {
         class199 var7 = client.field2269[var3[var6]];
         if(var7 != null && var7 != class32.field303 && var7.field2802 != null && var7.field2802.equals(var5)) {
            class12 var8;
            if(var0 == 1) {
               var8 = class150.method2761(ClientProt.field3203, client.field2384.field1770);
               var8.field121.method2242(var3[var6]);
               var8.field121.method2283(0);
               client.field2384.method2573(var8);
            } else if(var0 == 4) {
               var8 = class150.method2761(ClientProt.field3207, client.field2384.field1770);
               var8.field121.method2369(var3[var6]);
               var8.field121.method2283(0);
               client.field2384.method2573(var8);
            } else if(var0 == 6) {
               var8 = class150.method2761(ClientProt.field3209, client.field2384.field1770);
               var8.field121.method2292(var3[var6]);
               var8.field121.method2284(0);
               client.field2384.method2573(var8);
            } else if(var0 == 7) {
               var8 = class150.method2761(ClientProt.field3238, client.field2384.field1770);
               var8.field121.method2284(0);
               var8.field121.method2255(var3[var6]);
               client.field2384.method2573(var8);
            }

            var4 = true;
            break;
         }
      }

      if(!var4) {
         ServerProt.method3131(4, "", "Unable to find " + var1);
      }

   }

   @ObfuscatedName("in")
   @ObfuscatedSignature(
      signature = "([Lhw;Lhw;ZI)V",
      garbageValue = "1914110848"
   )
   static void method1593(class187[] var0, class187 var1, boolean var2) {
      int var3 = var1.field2581 != 0?var1.field2581:var1.field2573;
      int var4 = var1.field2582 != 0?var1.field2582:var1.field2574;
      class216.method4387(var0, var1.field2621, var3, var4, var2);
      if(var1.field2688 != null) {
         class216.method4387(var1.field2688, var1.field2621, var3, var4, var2);
      }

      class322 var5 = (class322)client.field2412.method1776((long)var1.field2621);
      if(var5 != null) {
         class85.method1627(var5.field3937, var3, var4, var2);
      }

      if(var1.field2562 == 1337) {
         ;
      }

   }

   @ObfuscatedName("l")
   static double method1592(double var0, double var2, double var4) {
      return class279.method5409((var0 - var2) / var4) / var4;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "-115"
   )
   static int method1591(int var0) {
      class227 var1 = (class227)class38.field366.method4670((long)var0);
      return var1 == null?-1:(var1.field3944 == class38.field368.field1641?-1:((class227)var1.field3944).field3056);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(Lfd;III)Lch;",
      garbageValue = "-12909794"
   )
   public static final class293 method1589(class118 var0, int var1, int var2) {
      if(class293.field3657 == 0) {
         throw new IllegalStateException();
      } else if(var1 >= 0 && var1 < 2) {
         if(var2 < 256) {
            var2 = 256;
         }

         try {
            class293 var3 = class129.field1723.vmethod4638();
            var3.field3667 = new int[(class268.field3462?2:1) * 256];
            var3.field3666 = var2;
            var3.vmethod5726();
            var3.field3671 = (var2 & -1024) + 1024;
            if(var3.field3671 > 16384) {
               var3.field3671 = 16384;
            }

            var3.vmethod5727(var3.field3671);
            if(MapIcon.field247 > 0 && class293.field3659 == null) {
               class293.field3659 = new class297();
               class311.field3824 = Executors.newScheduledThreadPool(1);
               class311.field3824.scheduleAtFixedRate(class293.field3659, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if(class293.field3659 != null) {
               if(class293.field3659.field3702[var1] != null) {
                  throw new IllegalArgumentException();
               }

               class293.field3659.field3702[var1] = var3;
            }

            return var3;
         } catch (Throwable var4) {
            return new class293();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }
}
