package net.runelite.client.standalone;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSGraphicsObject;

@ObfuscatedName("by")
public final class class130 extends class308 implements RSGraphicsObject {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1257957751
   )
   int field1235;
   @ObfuscatedName("m")
   boolean field1244;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1330309303
   )
   int field1242;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1922009023
   )
   int field1247;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Ljw;"
   )
   class321 field1239;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 2027400707
   )
   int field1237;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -814673119
   )
   int field1234;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -320711417
   )
   int field1236;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1277209531
   )
   int field1238;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1864600825
   )
   int field1246;

   class130(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field1247 = 0;
      this.field1242 = 0;
      this.field1244 = false;
      this.field1235 = var1;
      this.field1246 = var2;
      this.field1236 = var3;
      this.field1237 = var4;
      this.field1238 = var5;
      this.field1234 = var7 + var6;
      int var8 = class38.method619(this.field1235).field872;
      if(var8 != -1) {
         this.field1244 = false;
         this.field1239 = class182.method3192(var8);
      } else {
         this.field1244 = true;
      }

      this.rl$$init();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IS)V",
      garbageValue = "20492"
   )
   final void method2387(int var1) {
      if(!this.field1244) {
         this.field1242 += var1;

         while(this.field1242 > this.field1239.field3418[this.field1247]) {
            this.field1242 -= this.field1239.field3418[this.field1247];
            ++this.field1247;
            if(this.field1247 >= this.field1239.field3426.length) {
               this.field1244 = true;
               break;
            }
         }

      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(S)Lds;"
   )
   protected final class200 vmethod5291(short var1) {
      class90 var2 = class38.method619(this.field1235);
      class200 var3;
      if(!this.field1244) {
         var3 = var2.method1615(this.field1247);
      } else {
         var3 = var2.method1615(-1);
      }

      return var3 == null?null:var3;
   }

   public int getX() {
      return this.field1236;
   }

   public int getY() {
      return this.field1237;
   }

   private void rl$$init() {
      GraphicsObjectCreated var1 = new GraphicsObjectCreated(this);
      class113.field1064.getCallbacks().post(var1);
   }

   public LocalPoint getLocation() {
      return new LocalPoint(this.getX(), this.getY());
   }

   public int getId() {
      return this.field1235;
   }

   public int getStartCycle() {
      return this.field1234;
   }

   public int getLevel() {
      return this.field1246;
   }

   public int getHeight() {
      return this.field1238;
   }

   @ObfuscatedName("in")
   @ObfuscatedSignature(
      signature = "([Lhw;Lhw;ZI)V",
      garbageValue = "1914110848"
   )
   static void method2395(class329[] var0, class329 var1, boolean var2) {
      int var3 = var1.field3567 != 0?var1.field3567:var1.field3559;
      int var4 = var1.field3568 != 0?var1.field3568:var1.field3560;
      class298.method5182(var0, var1.field3607, var3, var4, var2);
      if(var1.field3674 != null) {
         class298.method5182(var1.field3674, var1.field3607, var3, var4, var2);
      }

      class45 var5 = (class45)client.field3991.method5310((long)var1.field3607);
      if(var5 != null) {
         class83.method1227(var5.field351, var3, var4, var2);
      }

      if(var1.field3548 == 1337) {
         ;
      }

   }

   @ObfuscatedName("hz")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)V",
      garbageValue = "-1609692187"
   )
   static void method2396(int var0, String var1) {
      int var2 = class11.field90;
      int[] var3 = class11.field91;
      boolean var4 = false;
      class49 var5 = new class49(var1, class36.field277);

      for(int var6 = 0; var6 < var2; ++var6) {
         class63 var7 = client.field3848[var3[var6]];
         if(var7 != null && var7 != class5.field43 && var7.field577 != null && var7.field577.equals(var5)) {
            class279 var8;
            if(var0 == 1) {
               var8 = class95.writeClientProt(ClientProt.PLAYER_ACTION1, client.field3963.field1162);
               var8.field3018.writeShort(var3[var6]);
               var8.field3018.writeByteC(0);
               client.field3963.method2235(var8);
            } else if(var0 == 4) {
               var8 = class95.writeClientProt(ClientProt.PLAYER_ACTION4, client.field3963.field1162);
               var8.field3018.writeShortLE128(var3[var6]);
               var8.field3018.writeByteC(0);
               client.field3963.method2235(var8);
            } else if(var0 == 6) {
               var8 = class95.writeClientProt(ClientProt.PLAYER_ACTION6, client.field3963.field1162);
               var8.field3018.writeShort128(var3[var6]);
               var8.field3018.write128Byte(0);
               client.field3963.method2235(var8);
            } else if(var0 == 7) {
               var8 = class95.writeClientProt(ClientProt.PLAYER_ACTION7, client.field3963.field1162);
               var8.field3018.write128Byte(0);
               var8.field3018.writeShortLE(var3[var6]);
               client.field3963.method2235(var8);
            }

            var4 = true;
            break;
         }
      }

      if(!var4) {
         ServerProt.method4172(4, "", "Unable to find " + var1);
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "-115"
   )
   static int method2393(int var0) {
      class286 var1 = (class286)class297.field3193.method792((long)var0);
      return var1 == null?-1:(var1.field1843 == class297.field3195.field3392?-1:((class286)var1.field1843).field3113);
   }

   @ObfuscatedName("l")
   static double method2394(double var0, double var2, double var4) {
      return class203.method3476((var0 - var2) / var4) / var4;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(Lfd;III)Lch;",
      garbageValue = "-12909794"
   )
   public static final class40 method2391(class164 var0, int var1, int var2) {
      if(class40.field294 == 0) {
         throw new IllegalStateException();
      } else if(var1 >= 0 && var1 < 2) {
         if(var2 < 256) {
            var2 = 256;
         }

         try {
            class40 var3 = class0.field2.vmethod2961();
            var3.field304 = new int[(class137.field1362?2:1) * 256];
            var3.field303 = var2;
            var3.vmethod2426();
            var3.field308 = (var2 & -1024) + 1024;
            if(var3.field308 > 16384) {
               var3.field308 = 16384;
            }

            var3.vmethod2427(var3.field308);
            if(class2.field12 > 0 && class40.field296 == null) {
               class40.field296 = new class99();
               class35.field271 = Executors.newScheduledThreadPool(1);
               class35.field271.scheduleAtFixedRate(class40.field296, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if(class40.field296 != null) {
               if(class40.field296.field915[var1] != null) {
                  throw new IllegalArgumentException();
               }

               class40.field296.field915[var1] = var3;
            }

            return var3;
         } catch (Throwable var4) {
            return new class40();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }
}
