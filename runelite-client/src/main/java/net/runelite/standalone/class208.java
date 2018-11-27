package net.runelite.standalone;

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
public final class class208 implements RSWorldMapManager {
   @ObfuscatedName("qt")
   @ObfuscatedGetter(
      intValue = -2070372005
   )
   static int field2887;
   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      signature = "Lba;"
   )
   static class277 field2882;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1616500339
   )
   int field2881;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "[Lle;"
   )
   class303[] field2877;
   @ObfuscatedName("c")
   HashMap field2876;
   @ObfuscatedName("l")
   boolean field2871;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Llp;"
   )
   SpritePixels field2884;
   @ObfuscatedName("f")
   boolean field2873;
   @ObfuscatedName("r")
   final HashMap field2878;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1242375309
   )
   int field2879;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1402576327
   )
   int field2874;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -95590909
   )
   public int field2883;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1508391715
   )
   int field2880;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "[[Lk;"
   )
   class47[][] field2875;
   @ObfuscatedName("e")
   HashMap field2885;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Law;"
   )
   class131 field2870;

   @ObfuscatedSignature(
      signature = "([Lle;Ljava/util/HashMap;)V"
   )
   public class208(class303[] var1, HashMap var2) {
      this.field2873 = false;
      this.field2871 = false;
      this.field2876 = new HashMap();
      this.field2883 = 0;
      this.field2877 = var1;
      this.field2878 = var2;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-40"
   )
   void method4124() {
      if(this.field2885 == null) {
         this.field2885 = new HashMap();
      }

      this.field2885.clear();

      for(int var1 = 0; var1 < this.field2875.length; ++var1) {
         for(int var2 = 0; var2 < this.field2875[var1].length; ++var2) {
            List var3 = this.field2875[var1][var2].method953();
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               class23 var5 = (class23)var4.next();
               if(!this.field2885.containsKey(Integer.valueOf(var5.field258))) {
                  LinkedList var6 = new LinkedList();
                  var6.add(var5);
                  this.field2885.put(Integer.valueOf(var5.field258), var6);
               } else {
                  List var7 = (List)this.field2885.get(Integer.valueOf(var5.field258));
                  var7.add(var5);
               }
            }
         }
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(IIIIIIIIIIB)Ljava/util/List;",
      garbageValue = "81"
   )
   public List method4122(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var11 = new LinkedList();
      if(!this.field2873) {
         return var11;
      } else {
         class151 var12 = this.method4137(var1, var2, var3, var4);
         float var13 = this.method4143(var7, var3 - var1);
         int var14 = (int)(64.0F * var13);
         int var15 = this.field2879 + var1;
         int var16 = var2 + this.field2880;

         for(int var17 = var12.field1863; var17 < var12.field1862 + var12.field1863; ++var17) {
            for(int var18 = var12.field1864; var18 < var12.field1864 + var12.field1861; ++var18) {
               List var19 = this.field2875[var17][var18].method1014(var5 + var14 * (this.field2875[var17][var18].field529 * 64 - var15) / 64, var8 + var6 - var14 * (this.field2875[var17][var18].field532 * 64 - var16 + 64) / 64, var14, var9, var10);
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
   public void method4142(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if(this.field2884 != null) {
         this.field2884.method294(var1, var2, var3, var4);
         if(var6 > 0 && var6 % var7 < var7 / 2) {
            if(this.field2885 == null) {
               this.method4124();
            }

            Iterator var8 = var5.iterator();

            while(true) {
               List var10;
               do {
                  if(!var8.hasNext()) {
                     return;
                  }

                  int var9 = ((Integer)var8.next()).intValue();
                  var10 = (List)this.field2885.get(Integer.valueOf(var9));
               } while(var10 == null);

               Iterator var11 = var10.iterator();

               while(var11.hasNext()) {
                  class23 var12 = (class23)var11.next();
                  int var13 = var3 * (var12.field259.field719 - this.field2879) / this.field2881;
                  int var14 = var4 - (var12.field259.field717 - this.field2880) * var4 / this.field2874;
                  class173.method3144(var13 + var1, var14 + var2, 2, 16776960, 256);
               }
            }
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "14238"
   )
   public final void method4125() {
      this.field2885 = null;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
      garbageValue = "-912276726"
   )
   public final void method4118(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      class151 var14 = this.method4137(var1, var2, var3, var4);
      float var15 = this.method4143(var7 - var5, var3 - var1);
      int var16 = (int)(64.0F * var15);
      int var17 = this.field2879 + var1;
      int var18 = var2 + this.field2880;

      int var19;
      int var20;
      for(var19 = var14.field1863; var19 < var14.field1863 + var14.field1862; ++var19) {
         for(var20 = var14.field1864; var20 < var14.field1864 + var14.field1861; ++var20) {
            if(var13) {
               this.field2875[var19][var20].method890();
            }

            this.field2875[var19][var20].method993(var5 + var16 * (this.field2875[var19][var20].field529 * 64 - var17) / 64, var8 - var16 * (this.field2875[var19][var20].field532 * 64 - var18 + 64) / 64, var16, var9);
         }
      }

      if(var10 != null && var11 > 0) {
         for(var19 = var14.field1863; var19 < var14.field1862 + var14.field1863; ++var19) {
            for(var20 = var14.field1864; var20 < var14.field1861 + var14.field1864; ++var20) {
               this.field2875[var19][var20].method932(var10, var11, var12);
            }
         }
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;Ljava/lang/String;ZB)V",
      garbageValue = "32"
   )
   public void method4115(class217 var1, String var2, boolean var3) {
      if(!this.field2871) {
         this.field2873 = false;
         this.field2871 = true;
         System.nanoTime();
         int var4 = var1.method4421(class308.field3808.field3809);
         int var5 = var1.method4400(var4, var2);
         class125 var6 = new class125(var1.method4418(class308.field3808.field3809, var2));
         class125 var7 = new class125(var1.method4418(class308.field3804.field3809, var2));
         class125 var8 = new class125(var1.method4418(var2, class308.field3806.field3809));
         System.nanoTime();
         System.nanoTime();
         this.field2870 = new class131();

         try {
            this.field2870.method2514(var6, var8, var7, var5, var3);
         } catch (IllegalStateException var20) {
            return;
         }

         this.field2870.method2705();
         this.field2870.method2706();
         this.field2870.method2733();
         this.field2879 = this.field2870.method2701() * 64;
         this.field2880 = this.field2870.method2734() * 64;
         this.field2881 = (this.field2870.method2702() - this.field2870.method2701() + 1) * 64;
         this.field2874 = (this.field2870.method2704() - this.field2870.method2734() + 1) * 64;
         int var17 = this.field2870.method2702() - this.field2870.method2701() + 1;
         int var10 = this.field2870.method2704() - this.field2870.method2734() + 1;
         System.nanoTime();
         System.nanoTime();
         class150.method2760();
         this.field2875 = new class47[var17][var10];
         Iterator var11 = this.field2870.field1731.iterator();

         while(var11.hasNext()) {
            class214 var12 = (class214)var11.next();
            int var13 = var12.field2150;
            int var14 = var12.field2144;
            int var15 = var13 - this.field2870.method2701();
            int var16 = var14 - this.field2870.method2734();
            this.field2875[var15][var16] = new class47(var13, var14, this.field2870.method2693(), this.field2878);
            this.field2875[var15][var16].method892(var12, this.field2870.field1730);
         }

         for(int var18 = 0; var18 < var17; ++var18) {
            for(int var19 = 0; var19 < var10; ++var19) {
               if(this.field2875[var18][var19] == null) {
                  this.field2875[var18][var19] = new class47(this.field2870.method2701() + var18, this.field2870.method2734() + var19, this.field2870.method2693(), this.field2878);
                  this.field2875[var18][var19].method893(this.field2870.field1734, this.field2870.field1730);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if(var1.method4417(class308.field3807.field3809, var2)) {
            byte[] var21 = var1.method4418(class308.field3807.field3809, var2);
            this.field2884 = class96.method1774(var21);
         }

         System.nanoTime();
         var1.method4412();
         var1.method4414();
         this.field2873 = true;
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(IIIII)Lu;",
      garbageValue = "-1237255769"
   )
   class151 method4137(int var1, int var2, int var3, int var4) {
      class151 var5 = new class151(this);
      int var6 = this.field2879 + var1;
      int var7 = var2 + this.field2880;
      int var8 = var3 + this.field2879;
      int var9 = var4 + this.field2880;
      int var10 = var6 / 64;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      var5.field1862 = var12 - var10 + 1;
      var5.field1861 = var13 - var11 + 1;
      var5.field1863 = var10 - this.field2870.method2701();
      var5.field1864 = var11 - this.field2870.method2734();
      if(var5.field1863 < 0) {
         var5.field1862 += var5.field1863;
         var5.field1863 = 0;
      }

      if(var5.field1863 > this.field2875.length - var5.field1862) {
         var5.field1862 = this.field2875.length - var5.field1863;
      }

      if(var5.field1864 < 0) {
         var5.field1861 += var5.field1864;
         var5.field1864 = 0;
      }

      if(var5.field1864 > this.field2875[0].length - var5.field1861) {
         var5.field1861 = this.field2875[0].length - var5.field1864;
      }

      var5.field1862 = Math.min(var5.field1862, this.field2875.length);
      var5.field1861 = Math.min(var5.field1861, this.field2875[0].length);
      return var5;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "2133000051"
   )
   public boolean method4139() {
      return this.field2873;
   }

   public boolean isLoaded() {
      return this.field2873;
   }

   public int getSurfaceOffsetX() {
      return this.field2879;
   }

   public int getSurfaceOffsetY() {
      return this.field2880;
   }

   public float getPixelsPerTile(int var1, int var2) {
      return this.method4143(var1, var2);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIB)F",
      garbageValue = "30"
   )
   float method4143(int var1, int var2) {
      return class302.field3755.getRenderOverview().getWorldMapZoom();
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(B)Ljava/util/HashMap;",
      garbageValue = "36"
   )
   public HashMap method4116() {
      this.method4124();
      return this.field2885;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(II[Lk;I)V",
      garbageValue = "825758332"
   )
   void method4119(int var1, int var2, class47[] var3) {
      boolean var4 = var1 <= 0;
      boolean var5 = var1 >= this.field2875.length - 1;
      boolean var6 = var2 <= 0;
      boolean var7 = var2 >= this.field2875[0].length - 1;
      if(var7) {
         var3[class49.field554.vmethod6234()] = null;
      } else {
         var3[class49.field554.vmethod6234()] = this.field2875[var1][var2 + 1];
      }

      var3[class49.field552.vmethod6234()] = !var7 && !var5?this.field2875[var1 + 1][var2 + 1]:null;
      var3[class49.field561.vmethod6234()] = !var7 && !var4?this.field2875[var1 - 1][var2 + 1]:null;
      var3[class49.field559.vmethod6234()] = var5?null:this.field2875[var1 + 1][var2];
      var3[class49.field557.vmethod6234()] = var4?null:this.field2875[var1 - 1][var2];
      var3[class49.field555.vmethod6234()] = var6?null:this.field2875[var1][var2 - 1];
      var3[class49.field551.vmethod6234()] = !var6 && !var5?this.field2875[var1 + 1][var2 - 1]:null;
      var3[class49.field556.vmethod6234()] = !var6 && !var4?this.field2875[var1 - 1][var2 - 1]:null;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIIIIIIII)V",
      garbageValue = "876209306"
   )
   public final void method4117(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var9 = class173.field2121;
      int var10 = class173.field2119;
      int var11 = class173.field2120;
      int[] var12 = new int[4];
      class173.method3189(var12);
      class151 var13 = this.method4137(var1, var2, var3, var4);
      float var14 = this.method4143(var7 - var5, var3 - var1);
      int var15 = (int)Math.ceil((double)var14);
      this.field2883 = var15;
      if(!this.field2876.containsKey(Integer.valueOf(var15))) {
         class210 var16 = new class210(var15);
         var16.method4205();
         this.field2876.put(Integer.valueOf(var15), var16);
      }

      class47[] var22 = new class47[8];

      int var17;
      int var18;
      for(var17 = var13.field1863; var17 < var13.field1862 + var13.field1863; ++var17) {
         for(var18 = var13.field1864; var18 < var13.field1864 + var13.field1861; ++var18) {
            this.method4119(var17, var18, var22);
            this.field2875[var17][var18].method1004(var15, (class210)this.field2876.get(Integer.valueOf(var15)), var22, this.field2877);
         }
      }

      class173.method3136(var9, var10, var11);
      class173.method3141(var12);
      var17 = (int)(64.0F * var14);
      var18 = this.field2879 + var1;
      int var19 = var2 + this.field2880;

      for(int var20 = var13.field1863; var20 < var13.field1862 + var13.field1863; ++var20) {
         for(int var21 = var13.field1864; var21 < var13.field1864 + var13.field1861; ++var21) {
            this.field2875[var20][var21].method891(var5 + var17 * (this.field2875[var20][var21].field529 * 64 - var18) / 64, var8 - var17 * (this.field2875[var20][var21].field532 * 64 - var19 + 64) / 64, var17);
         }
      }

   }

   @ObfuscatedName("hj")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;IIIIZI)V",
      garbageValue = "1337884029"
   )
   static final void method4155(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(!client.field2360) {
         if(client.field2290 < 500) {
            client.field2295[client.field2290] = var0;
            client.field2296[client.field2290] = var1;
            client.field2293[client.field2290] = var2;
            client.field2368[client.field2290] = var3;
            client.field2291[client.field2290] = var4;
            client.field2292[client.field2290] = var5;
            client.field2327[client.field2290] = var6;
            ++client.field2290;
            client.onMenuOptionsChanged(-1);
         }

      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "1321724409"
   )
   static void method4154(int var0, int var1, int var2, int var3) {
      class231 var4 = (class231)class231.field3079.method1776((long)var0);
      if(var4 == null) {
         var4 = new class231();
         class231.field3079.method1775(var4, (long)var0);
      }

      if(var4.field3076.length <= var1) {
         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[var1 + 1];

         int var7;
         for(var7 = 0; var7 < var4.field3076.length; ++var7) {
            var5[var7] = var4.field3076[var7];
            var6[var7] = var4.field3080[var7];
         }

         for(var7 = var4.field3076.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.field3076 = var5;
         var4.field3080 = var6;
         var4.stackSizesChanged(-1);
      }

      var4.field3076[var1] = var2;
      var4.field3080[var1] = var3;
      var4.stackSizesChanged(var1);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Lcz;",
      garbageValue = "-401295793"
   )
   static class296 method4156(int var0) {
      class296 var1 = (class296)class296.field3698.method1813((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class88.field954.method4398(var0, 0, 585941188);
         if(var2 == null) {
            return null;
         } else {
            var1 = class229.method4604(var2);
            class296.field3698.method1820(var1, (long)var0);
            return var1;
         }
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgl;I)V",
      garbageValue = "924642163"
   )
   static final void initializeGPI(class1 var0) {
      var0.method7();
      int var1 = client.field2186;
      class199 var10000 = client.field2269[var1] = new class199();
      client.cachedPlayersChanged(var1);
      class32.field303 = var10000;
      class199 var2 = var10000;
      var2.field2823 = var1;
      int var3 = var0.method8(30);
      byte var4 = (byte)(var3 >> 28);
      int var5 = var3 >> 14 & 16383;
      int var6 = var3 & 16383;
      var2.field1101[0] = var5 - class229.field3067;
      var2.field1090 = (var2.field1101[0] << 7) + (var2.method3955() << 6);
      var2.field1128[0] = var6 - class35.field360;
      var2.field1072 = (var2.field1128[0] << 7) + (var2.method3955() << 6);
      class260.field3393 = var2.field2805 = var4;
      if(class152.field1888[var1] != null) {
         var2.method3948(class152.field1888[var1]);
      }

      class152.field1874 = 0;
      class152.field1875[++class152.field1874 - 1] = var1;
      class152.field1871[var1] = 0;
      class152.field1876 = 0;

      for(int var7 = 1; var7 < 2048; ++var7) {
         if(var1 != var7) {
            int var8 = var0.method8(18);
            int var9 = var8 >> 16;
            int var10 = var8 >> 8 & 597;
            int var11 = var8 & 597;
            class152.field1873[var7] = (var10 << 14) + var11 + (var9 << 28);
            class152.field1879[var7] = 0;
            class152.field1880[var7] = -1;
            class152.field1887[++class152.field1876 - 1] = var7;
            class152.field1871[var7] = 0;
         }
      }

      var0.method6();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(IB)Ljava/lang/String;",
      garbageValue = "-70"
   )
   static final String method4123(int var0) {
      return var0 < 100000?"<col=ffff00>" + var0 + "</col>":(var0 < 10000000?"<col=ffffff>" + var0 / 1000 + "K" + "</col>":"<col=00ff80>" + var0 / 1000000 + "M" + "</col>");
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIIIIII)I",
      garbageValue = "1575172745"
   )
   public static int method4158(int var0, int var1, int var2, int var3, int var4, int var5) {
      if((var5 & 1) == 1) {
         int var6 = var3;
         var3 = var4;
         var4 = var6;
      }

      var2 &= 3;
      return var2 == 0?var1:(var2 == 1?7 - var0 - (var3 - 1):(var2 == 2?7 - var1 - (var4 - 1):var0));
   }
}
