package net.runelite.client.standalone;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSWorldMapManager;

@ObfuscatedName("at")
public final class class322 implements RSWorldMapManager {
   @ObfuscatedName("qt")
   @ObfuscatedGetter(
      intValue = -2070372005
   )
   static int field3447;
   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      signature = "Lba;"
   )
   static class278 field3442;
   @ObfuscatedName("f")
   boolean field3433;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -95590909
   )
   public int field3443;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1242375309
   )
   int field3439;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1616500339
   )
   int field3441;
   @ObfuscatedName("r")
   final HashMap field3438;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "[Lle;"
   )
   class32[] field3437;
   @ObfuscatedName("c")
   HashMap field3436;
   @ObfuscatedName("e")
   HashMap field3445;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1402576327
   )
   int field3434;
   @ObfuscatedName("l")
   boolean field3431;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Llp;"
   )
   class26 field3444;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "[[Lk;"
   )
   class261[][] field3435;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Law;"
   )
   class4 field3430;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1508391715
   )
   int field3440;

   @ObfuscatedSignature(
      signature = "([Lle;Ljava/util/HashMap;)V"
   )
   public class322(class32[] var1, HashMap var2) {
      this.field3433 = false;
      this.field3431 = false;
      this.field3436 = new HashMap();
      this.field3443 = 0;
      this.field3437 = var1;
      this.field3438 = var2;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;Ljava/lang/String;ZB)V",
      garbageValue = "32"
   )
   public void method5665(class148 var1, String var2, boolean var3) {
      if(!this.field3431) {
         this.field3433 = false;
         this.field3431 = true;
         System.nanoTime();
         int var4 = var1.method2602(class171.field1584.field1585);
         int var5 = var1.method2581(var4, var2);
         Buffer var6 = new Buffer(var1.method2599(class171.field1584.field1585, var2));
         Buffer var7 = new Buffer(var1.method2599(class171.field1580.field1585, var2));
         Buffer var8 = new Buffer(var1.method2599(var2, class171.field1582.field1585));
         System.nanoTime();
         System.nanoTime();
         this.field3430 = new class4();

         try {
            this.field3430.method59(var6, var8, var7, var5, var3);
         } catch (IllegalStateException var20) {
            return;
         }

         this.field3430.method1273();
         this.field3430.method1274();
         this.field3430.method1301();
         this.field3439 = this.field3430.method1269() * 64;
         this.field3440 = this.field3430.method1302() * 64;
         this.field3441 = (this.field3430.method1270() - this.field3430.method1269() + 1) * 64;
         this.field3434 = (this.field3430.method1272() - this.field3430.method1302() + 1) * 64;
         int var17 = this.field3430.method1270() - this.field3430.method1269() + 1;
         int var10 = this.field3430.method1272() - this.field3430.method1302() + 1;
         System.nanoTime();
         System.nanoTime();
         class95.method1661();
         this.field3435 = new class261[var17][var10];
         Iterator var11 = this.field3430.field30.iterator();

         while(var11.hasNext()) {
            class319 var12 = (class319)var11.next();
            int var13 = var12.field1471;
            int var14 = var12.field1465;
            int var15 = var13 - this.field3430.method1269();
            int var16 = var14 - this.field3430.method1302();
            this.field3435[var15][var16] = new class261(var13, var14, this.field3430.method1261(), this.field3438);
            this.field3435[var15][var16].method4669(var12, this.field3430.field29);
         }

         for(int var18 = 0; var18 < var17; ++var18) {
            for(int var19 = 0; var19 < var10; ++var19) {
               if(this.field3435[var18][var19] == null) {
                  this.field3435[var18][var19] = new class261(this.field3430.method1269() + var18, this.field3430.method1302() + var19, this.field3430.method1261(), this.field3438);
                  this.field3435[var18][var19].method4670(this.field3430.field33, this.field3430.field29);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if(var1.method2598(class171.field1583.field1585, var2)) {
            byte[] var21 = var1.method2599(class171.field1583.field1585, var2);
            this.field3444 = class135.method2509(var21);
         }

         System.nanoTime();
         var1.method2593();
         var1.method2595();
         this.field3433 = true;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "2133000051"
   )
   public boolean method5689() {
      return this.field3433;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-40"
   )
   void method5674() {
      if(this.field3445 == null) {
         this.field3445 = new HashMap();
      }

      this.field3445.clear();

      for(int var1 = 0; var1 < this.field3435.length; ++var1) {
         for(int var2 = 0; var2 < this.field3435[var1].length; ++var2) {
            List var3 = this.field3435[var1][var2].method4730();
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               class2 var5 = (class2)var4.next();
               if(!this.field3445.containsKey(Integer.valueOf(var5.field23))) {
                  LinkedList var6 = new LinkedList();
                  var6.add(var5);
                  this.field3445.put(Integer.valueOf(var5.field23), var6);
               } else {
                  List var7 = (List)this.field3445.get(Integer.valueOf(var5.field23));
                  var7.add(var5);
               }
            }
         }
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(IIIII)Lu;",
      garbageValue = "-1237255769"
   )
   class129 method5687(int var1, int var2, int var3, int var4) {
      class129 var5 = new class129(this);
      int var6 = this.field3439 + var1;
      int var7 = var2 + this.field3440;
      int var8 = var3 + this.field3439;
      int var9 = var4 + this.field3440;
      int var10 = var6 / 64;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      var5.field1226 = var12 - var10 + 1;
      var5.field1225 = var13 - var11 + 1;
      var5.field1227 = var10 - this.field3430.method1269();
      var5.field1228 = var11 - this.field3430.method1302();
      if(var5.field1227 < 0) {
         var5.field1226 += var5.field1227;
         var5.field1227 = 0;
      }

      if(var5.field1227 > this.field3435.length - var5.field1226) {
         var5.field1226 = this.field3435.length - var5.field1227;
      }

      if(var5.field1228 < 0) {
         var5.field1225 += var5.field1228;
         var5.field1228 = 0;
      }

      if(var5.field1228 > this.field3435[0].length - var5.field1225) {
         var5.field1225 = this.field3435[0].length - var5.field1228;
      }

      var5.field1226 = Math.min(var5.field1226, this.field3435.length);
      var5.field1225 = Math.min(var5.field1225, this.field3435[0].length);
      return var5;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(IIIIIIIIIIB)Ljava/util/List;",
      garbageValue = "81"
   )
   public List method5672(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var11 = new LinkedList();
      if(!this.field3433) {
         return var11;
      } else {
         class129 var12 = this.method5687(var1, var2, var3, var4);
         float var13 = this.method5693(var7, var3 - var1);
         int var14 = (int)(64.0F * var13);
         int var15 = this.field3439 + var1;
         int var16 = var2 + this.field3440;

         for(int var17 = var12.field1227; var17 < var12.field1226 + var12.field1227; ++var17) {
            for(int var18 = var12.field1228; var18 < var12.field1228 + var12.field1225; ++var18) {
               List var19 = this.field3435[var17][var18].method4791(var5 + var14 * (this.field3435[var17][var18].field2892 * 64 - var15) / 64, var8 + var6 - var14 * (this.field3435[var17][var18].field2895 * 64 - var16 + 64) / 64, var14, var9, var10);
               if(!var19.isEmpty()) {
                  var11.addAll(var19);
               }
            }
         }

         return var11;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(IIIILjava/util/HashSet;IIB)V",
      garbageValue = "1"
   )
   public void method5692(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if(this.field3444 != null) {
         this.field3444.method457(var1, var2, var3, var4);
         if(var6 > 0 && var6 % var7 < var7 / 2) {
            if(this.field3445 == null) {
               this.method5674();
            }

            Iterator var8 = var5.iterator();

            while(true) {
               List var10;
               do {
                  if(!var8.hasNext()) {
                     return;
                  }

                  int var9 = ((Integer)var8.next()).intValue();
                  var10 = (List)this.field3445.get(Integer.valueOf(var9));
               } while(var10 == null);

               Iterator var11 = var10.iterator();

               while(var11.hasNext()) {
                  class2 var12 = (class2)var11.next();
                  int var13 = var3 * (var12.field24.field268 - this.field3439) / this.field3441;
                  int var14 = var4 - (var12.field24.field266 - this.field3440) * var4 / this.field3434;
                  class89.method1538(var13 + var1, var14 + var2, 2, 16776960, 256);
               }
            }
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(II[Lk;I)V",
      garbageValue = "825758332"
   )
   void method5669(int var1, int var2, class261[] var3) {
      boolean var4 = var1 <= 0;
      boolean var5 = var1 >= this.field3435.length - 1;
      boolean var6 = var2 <= 0;
      boolean var7 = var2 >= this.field3435[0].length - 1;
      if(var7) {
         var3[class311.field3297.vmethod5937()] = null;
      } else {
         var3[class311.field3297.vmethod5937()] = this.field3435[var1][var2 + 1];
      }

      var3[class311.field3295.vmethod5937()] = !var7 && !var5?this.field3435[var1 + 1][var2 + 1]:null;
      var3[class311.field3304.vmethod5937()] = !var7 && !var4?this.field3435[var1 - 1][var2 + 1]:null;
      var3[class311.field3302.vmethod5937()] = var5?null:this.field3435[var1 + 1][var2];
      var3[class311.field3300.vmethod5937()] = var4?null:this.field3435[var1 - 1][var2];
      var3[class311.field3298.vmethod5937()] = var6?null:this.field3435[var1][var2 - 1];
      var3[class311.field3294.vmethod5937()] = !var6 && !var5?this.field3435[var1 + 1][var2 - 1]:null;
      var3[class311.field3299.vmethod5937()] = !var6 && !var4?this.field3435[var1 - 1][var2 - 1]:null;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIB)F",
      garbageValue = "30"
   )
   float method5693(int var1, int var2) {
      return class113.field1064.getRenderOverview().getWorldMapZoom();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "14238"
   )
   public final void method5675() {
      this.field3445 = null;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
      garbageValue = "-912276726"
   )
   public final void method5668(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      class129 var14 = this.method5687(var1, var2, var3, var4);
      float var15 = this.method5693(var7 - var5, var3 - var1);
      int var16 = (int)(64.0F * var15);
      int var17 = this.field3439 + var1;
      int var18 = var2 + this.field3440;

      int var19;
      int var20;
      for(var19 = var14.field1227; var19 < var14.field1227 + var14.field1226; ++var19) {
         for(var20 = var14.field1228; var20 < var14.field1228 + var14.field1225; ++var20) {
            if(var13) {
               this.field3435[var19][var20].method4667();
            }

            this.field3435[var19][var20].method4770(var5 + var16 * (this.field3435[var19][var20].field2892 * 64 - var17) / 64, var8 - var16 * (this.field3435[var19][var20].field2895 * 64 - var18 + 64) / 64, var16, var9);
         }
      }

      if(var10 != null && var11 > 0) {
         for(var19 = var14.field1227; var19 < var14.field1226 + var14.field1227; ++var19) {
            for(var20 = var14.field1228; var20 < var14.field1225 + var14.field1228; ++var20) {
               this.field3435[var19][var20].method4709(var10, var11, var12);
            }
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIIIIIIII)V",
      garbageValue = "876209306"
   )
   public final void method5667(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var9 = class89.field864;
      int var10 = class89.field862;
      int var11 = class89.field863;
      int[] var12 = new int[4];
      class89.method1583(var12);
      class129 var13 = this.method5687(var1, var2, var3, var4);
      float var14 = this.method5693(var7 - var5, var3 - var1);
      int var15 = (int)Math.ceil((double)var14);
      this.field3443 = var15;
      if(!this.field3436.containsKey(Integer.valueOf(var15))) {
         class102 var16 = new class102(var15);
         var16.method1723();
         this.field3436.put(Integer.valueOf(var15), var16);
      }

      class261[] var22 = new class261[8];

      int var17;
      int var18;
      for(var17 = var13.field1227; var17 < var13.field1226 + var13.field1227; ++var17) {
         for(var18 = var13.field1228; var18 < var13.field1228 + var13.field1225; ++var18) {
            this.method5669(var17, var18, var22);
            this.field3435[var17][var18].method4781(var15, (class102)this.field3436.get(Integer.valueOf(var15)), var22, this.field3437);
         }
      }

      class89.method1530(var9, var10, var11);
      class89.method1535(var12);
      var17 = (int)(64.0F * var14);
      var18 = this.field3439 + var1;
      int var19 = var2 + this.field3440;

      for(int var20 = var13.field1227; var20 < var13.field1226 + var13.field1227; ++var20) {
         for(int var21 = var13.field1228; var21 < var13.field1228 + var13.field1225; ++var21) {
            this.field3435[var20][var21].method4668(var5 + var17 * (this.field3435[var20][var21].field2892 * 64 - var18) / 64, var8 - var17 * (this.field3435[var20][var21].field2895 * 64 - var19 + 64) / 64, var17);
         }
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(B)Ljava/util/HashMap;",
      garbageValue = "36"
   )
   public HashMap method5666() {
      this.method5674();
      return this.field3445;
   }

   public boolean isLoaded() {
      return this.field3433;
   }

   public int getSurfaceOffsetX() {
      return this.field3439;
   }

   public int getSurfaceOffsetY() {
      return this.field3440;
   }

   public float getPixelsPerTile(int var1, int var2) {
      return this.method5693(var1, var2);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Lcz;",
      garbageValue = "-401295793"
   )
   static class252 method5706(int var0) {
      class252 var1 = (class252)class252.field2500.method2268((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class126.field1194.method2579(var0, 0, 585941188);
         if(var2 == null) {
            return null;
         } else {
            var1 = class296.method5152(var2);
            class252.field2500.method2275(var1, (long)var0);
            return var1;
         }
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgl;I)V",
      garbageValue = "924642163"
   )
   static final void initializeGPI(class214 var0) {
      var0.method3760();
      int var1 = client.field3765;
      class63 var10000 = client.field3848[var1] = new class63();
      client.cachedPlayersChanged(var1);
      class5.field43 = var10000;
      class63 var2 = var10000;
      var2.field598 = var1;
      int var3 = var0.readBits(30);
      byte var4 = (byte)(var3 >> 28);
      int var5 = var3 >> 14 & 16383;
      int var6 = var3 & 16383;
      var2.field1288[0] = var5 - class296.somex;
      var2.field1277 = (var2.field1288[0] << 7) + (var2.method1089() << 6);
      var2.field1315[0] = var6 - class284.somey;
      var2.field1259 = (var2.field1315[0] << 7) + (var2.method1089() << 6);
      class315.plane = var2.field580 = var4;
      if(class11.field104[var1] != null) {
         var2.method1082(class11.field104[var1]);
      }

      class11.field90 = 0;
      class11.field91[++class11.field90 - 1] = var1;
      class11.field87[var1] = 0;
      class11.field92 = 0;

      for(int var7 = 1; var7 < 2048; ++var7) {
         if(var1 != var7) {
            int var8 = var0.readBits(18);
            int var9 = var8 >> 16;
            int var10 = var8 >> 8 & 597;
            int var11 = var8 & 597;
            class11.field89[var7] = (var10 << 14) + var11 + (var9 << 28);
            class11.field95[var7] = 0;
            class11.field96[var7] = -1;
            class11.field103[++class11.field92 - 1] = var7;
            class11.field87[var7] = 0;
         }
      }

      var0.method3759();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(IB)Ljava/lang/String;",
      garbageValue = "-70"
   )
   static final String method5673(int var0) {
      return var0 < 100000?"<col=ffff00>" + var0 + "</col>":(var0 < 10000000?"<col=ffffff>" + var0 / 1000 + "K" + "</col>":"<col=00ff80>" + var0 / 1000000 + "M" + "</col>");
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "1321724409"
   )
   static void method5704(int var0, int var1, int var2, int var3) {
      class292 var4 = (class292)class292.field3153.method5310((long)var0);
      if(var4 == null) {
         var4 = new class292();
         class292.field3153.method5309(var4, (long)var0);
      }

      if(var4.field3150.length <= var1) {
         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[var1 + 1];

         int var7;
         for(var7 = 0; var7 < var4.field3150.length; ++var7) {
            var5[var7] = var4.field3150[var7];
            var6[var7] = var4.field3154[var7];
         }

         for(var7 = var4.field3150.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.field3150 = var5;
         var4.field3154 = var6;
         var4.stackSizesChanged(-1);
      }

      var4.field3150[var1] = var2;
      var4.field3154[var1] = var3;
      var4.stackSizesChanged(var1);
   }

   @ObfuscatedName("hj")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;IIIIZI)V",
      garbageValue = "1337884029"
   )
   static final void method5705(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(!client.field3939) {
         if(client.field3869 < 500) {
            client.field3874[client.field3869] = var0;
            client.field3875[client.field3869] = var1;
            client.field3872[client.field3869] = var2;
            client.field3947[client.field3869] = var3;
            client.field3870[client.field3869] = var4;
            client.field3871[client.field3869] = var5;
            client.field3906[client.field3869] = var6;
            ++client.field3869;
            client.onMenuOptionsChanged(-1);
         }

      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIIIIII)I",
      garbageValue = "1575172745"
   )
   public static int method5708(int var0, int var1, int var2, int var3, int var4, int var5) {
      if((var5 & 1) == 1) {
         int var6 = var3;
         var3 = var4;
         var4 = var6;
      }

      var2 &= 3;
      return var2 == 0?var1:(var2 == 1?7 - var0 - (var3 - 1):(var2 == 2?7 - var1 - (var4 - 1):var0));
   }
}
