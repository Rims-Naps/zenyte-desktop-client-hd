package net.runelite.standalone;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSRenderOverview;
import net.runelite.rs.api.RSWorldMapData;
import net.runelite.rs.api.RSWorldMapManager;

@ObfuscatedName("la")
public class WorldMap implements RSRenderOverview {
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   static final class74 field3599;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   static final class74 field3592;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   static final class74 field3604;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1338709777
   )
   int field3612;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "Lh;"
   )
   WorldMapData field3633;
   @ObfuscatedName("ar")
   boolean field3626;
   @ObfuscatedName("k")
   float field3624;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1965823923
   )
   int field3607;
   @ObfuscatedName("ac")
   boolean field3629;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 165577371
   )
   int field3622;
   @ObfuscatedName("z")
   HashMap field3595;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      longValue = 5485629690108429551L
   )
   long field3623;
   @ObfuscatedName("an")
   boolean field3619;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -101167141
   )
   int field3642;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -286426449
   )
   int field3587;
   @ObfuscatedName("bf")
   HashSet field3636;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   class217 field3590;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1786790823
   )
   int field3603;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1870868691
   )
   int field3593;
   @ObfuscatedName("bo")
   List field3617;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1730989969
   )
   int field3618;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lat;"
   )
   WorldMapManager field3601;
   @ObfuscatedName("ai")
   HashSet field3630;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 462410171
   )
   int field3609;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lh;"
   )
   WorldMapData field3600;
   @ObfuscatedName("be")
   final int[] field3615;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "[Lle;"
   )
   class303[] field3606;
   @ObfuscatedName("v")
   HashMap field3597;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 408889125
   )
   int field3632;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -2054609209
   )
   int field3610;
   @ObfuscatedName("bs")
   public boolean field3638;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = 480288715
   )
   int field3611;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 888959241
   )
   int field3614;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1215273679
   )
   int field3634;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1980325907
   )
   int field3627;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Lkn;"
   )
   class299 field3594;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = -788723543
   )
   int field3640;
   @ObfuscatedName("am")
   HashSet field3616;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1479771611
   )
   int field3605;
   @ObfuscatedName("bx")
   Iterator field3637;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lh;"
   )
   WorldMapData field3598;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 269267657
   )
   int field3621;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1413747755
   )
   int field3625;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Llu;"
   )
   class139 field3602;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 1959014059
   )
   int field3641;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 2114053751
   )
   int field3643;
   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      signature = "Llp;"
   )
   SpritePixels field3639;
   @ObfuscatedName("q")
   float field3608;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1020785493
   )
   int field3620;
   @ObfuscatedName("ah")
   HashSet field3635;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -1235674833
   )
   int field3613;
   @ObfuscatedName("au")
   HashSet field3631;
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "Lhx;"
   )
   Location field3586;
   @ObfuscatedName("aj")
   HashSet field3596;

   static {
      field3599 = class74.field840;
      field3592 = class74.field841;
      field3604 = class74.field842;
   }

   public WorldMap() {
      this.field3605 = -1;
      this.field3642 = -1;
      this.field3609 = -1;
      this.field3610 = -1;
      this.field3607 = -1;
      this.field3612 = -1;
      this.field3613 = 3;
      this.field3614 = 50;
      this.field3629 = false;
      this.field3616 = null;
      this.field3593 = -1;
      this.field3587 = -1;
      this.field3634 = -1;
      this.field3620 = -1;
      this.field3621 = -1;
      this.field3622 = -1;
      this.field3626 = true;
      this.field3631 = new HashSet();
      this.field3596 = new HashSet();
      this.field3635 = new HashSet();
      this.field3630 = new HashSet();
      this.field3619 = false;
      this.field3632 = 0;
      this.field3615 = new int[]{1008, 1009, 1010, 1011, 1012};
      this.field3636 = new HashSet();
      this.field3586 = null;
      this.field3638 = false;
      this.field3641 = -1;
      this.field3611 = -1;
      this.field3643 = -1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(IIIIIII)V",
      garbageValue = "1972429751"
   )
   void method5611(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(class177.field2445 != null) {
         int var7 = 512 / (this.field3601.field2883 * 2);
         int var8 = var3 + 512;
         int var9 = var4 + 512;
         float var10 = 1.0F;
         var8 = (int)((float)var8 / var10);
         var9 = (int)((float)var9 / var10);
         int var11 = this.method5523() - var5 / 2 - var7;
         int var12 = this.method5524() - var6 / 2 - var7;
         int var13 = var1 - (var11 + var7 - this.field3641) * this.field3601.field2883;
         int var14 = var2 - this.field3601.field2883 * (var7 - (var12 - this.field3611));
         if(this.method5599(var8, var9, var13, var14, var3, var4)) {
            if(this.field3639 != null && this.field3639.width == var8 && this.field3639.height == var9) {
               Arrays.fill(this.field3639.pixels, 0);
            } else {
               this.field3639 = new SpritePixels(var8, var9);
            }

            this.field3641 = this.method5523() - var5 / 2 - var7;
            this.field3611 = this.method5524() - var6 / 2 - var7;
            this.field3640 = this.field3601.field2883;
            class177.field2445.method4083(this.field3641, this.field3611, this.field3639, (float)this.field3640 / var10);
            this.field3643 = client.field2422;
            var13 = var1 - (var7 + var11 - this.field3641) * this.field3601.field2883;
            var14 = var2 - this.field3601.field2883 * (var7 - (var12 - this.field3611));
         }

         class173.method3145(var1, var2, var3, var4, 0, 128);
         if(1.0F == var10) {
            this.field3639.method225(var13, var14, 192);
         } else {
            this.field3639.method228(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 192);
         }
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "47"
   )
   public int method5524() {
      return this.field3633 == null?-1:this.field3618 + this.field3633.method2734() * 64;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(Lh;I)V",
      garbageValue = "-328620867"
   )
   void method5617(WorldMapData var1) {
      this.field3633 = var1;
      this.field3601 = new WorldMapManager(this.field3606, this.field3595);
      this.field3602.method2612(this.field3633.method2697());
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(IIIIIII)Z",
      garbageValue = "-1975921120"
   )
   boolean method5599(int var1, int var2, int var3, int var4, int var5, int var6) {
      return this.field3639 == null?true:(this.field3639.width == var1 && this.field3639.height == var2?(this.field3601.field2883 != this.field3640?true:(this.field3643 != client.field2422?true:(var3 <= 0 && var4 <= 0?var3 + var1 < var5 || var2 + var4 < var6:true))):true);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-202286445"
   )
   public int method5526() {
      return this.field3609;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(IIIIII)V",
      garbageValue = "-719337132"
   )
   void method5622(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = 20;
      int var7 = var3 / 2 + var1;
      int var8 = var4 / 2 + var2 - 18 - var6;
      class173.method3167(var1, var2, var3, var4, -16777216);
      class173.method3149(var7 - 152, var8, 304, 34, -65536);
      class173.method3167(var7 - 150, var8 + 2, var5 * 3, 30, -65536);
      this.field3594.method3879("Loading...", var7, var6 + var8, -1, -1);
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "7"
   )
   public void method5624(int var1, int var2) {
      if(this.field3633 != null) {
         this.method5496(var1 - this.field3633.method2701() * 64, var2 - this.field3633.method2734() * 64, true);
         this.field3605 = -1;
         this.field3642 = -1;
      }
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      signature = "(S)Laf;",
      garbageValue = "1733"
   )
   public class23 method5627() {
      return this.field3637 == null?null:(!this.field3637.hasNext()?null:(class23)this.field3637.next());
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "22"
   )
   boolean method5498() {
      return this.field3605 != -1 && this.field3642 != -1;
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      signature = "(IILhx;Lhx;I)V",
      garbageValue = "1316026379"
   )
   public void method5664(int var1, int var2, Location var3, Location var4) {
      class194 var5 = new class194();
      class294 var6 = new class294(var2, var3, var4);
      var5.method3920(new Object[]{var6});
      switch(var1) {
      case 1008:
         var5.method3921(10);
         break;
      case 1009:
         var5.method3921(11);
         break;
      case 1010:
         var5.method3921(12);
         break;
      case 1011:
         var5.method3921(13);
         break;
      case 1012:
         var5.method3921(14);
      }

      class209.method4198(var5);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1167261992"
   )
   void method5494() {
      if(class177.field2445 != null) {
         this.field3624 = this.field3608;
      } else {
         if(this.field3624 < this.field3608) {
            this.field3624 = Math.min(this.field3608, this.field3624 / 30.0F + this.field3624);
         }

         if(this.field3624 > this.field3608) {
            this.field3624 = Math.max(this.field3608, this.field3624 - this.field3624 / 30.0F);
         }

      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(IIIB)V",
      garbageValue = "56"
   )
   public void method5521(int var1, int var2, int var3) {
      if(this.field3633 != null) {
         int[] var4 = this.field3633.method2692(var1, var2, var3);
         if(var4 != null) {
            this.method5597(var4[0], var4[1]);
         }

      }
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      signature = "(I)Laf;",
      garbageValue = "-787307296"
   )
   public class23 method5546() {
      if(!this.field3602.method2605()) {
         return null;
      } else if(!this.field3601.method4139()) {
         return null;
      } else {
         HashMap var1 = this.field3601.method4116();
         this.field3617 = new LinkedList();
         Iterator var2 = var1.values().iterator();

         while(var2.hasNext()) {
            List var3 = (List)var2.next();
            this.field3617.addAll(var3);
         }

         this.field3637 = this.field3617.iterator();
         return this.method5627();
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   public void method5531() {
      this.field3614 = 50;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Lh;I)V",
      garbageValue = "-34734081"
   )
   void method5606(WorldMapData var1) {
      if(this.field3633 == null || var1 != this.field3633) {
         this.method5617(var1);
         this.method5557(-1, -1, -1);
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1514376948"
   )
   public void method5533() {
      this.field3602.method2604();
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "(IZB)V",
      garbageValue = "-22"
   )
   public void method5656(int var1, boolean var2) {
      if(!var2) {
         this.field3631.add(Integer.valueOf(var1));
      } else {
         this.field3631.remove(Integer.valueOf(var1));
      }

      this.method5550();
   }

   @ObfuscatedName("c")
   void method5493(int var1, int var2, boolean var3, long var4) {
      if(this.field3633 != null) {
         int var6 = (int)((float)this.field3603 + ((float)(var1 - this.field3607) - (float)this.method5526() * this.field3624 / 2.0F) / this.field3624);
         int var7 = (int)((float)this.field3618 - ((float)(var2 - this.field3612) - (float)this.method5527() * this.field3624 / 2.0F) / this.field3624);
         this.field3586 = this.field3633.method2712(var6 + this.field3633.method2701() * 64, var7 + this.field3633.method2734() * 64);
         if(this.field3586 != null && var3) {
            int var9;
            int var10;
            if(class239.method4720() && class96.field1040[82] && class96.field1040[81]) {
               int var13 = this.field3586.field719;
               var9 = this.field3586.field717;
               var10 = this.field3586.field718;
               class12 var11 = class150.method2761(ClientProt.field3217, client.field2384.field1770);
               var11.field121.method2301(0);
               var11.field121.method2255(var9);
               var11.field121.method2283(var10);
               var11.field121.method2242(var13);
               client.field2384.method2573(var11);
            } else {
               boolean var8 = true;
               if(this.field3626) {
                  var9 = var1 - this.field3627;
                  var10 = var2 - this.field3625;
                  if(var4 - this.field3623 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                     var8 = false;
                  }
               }

               if(var8) {
                  class12 var12 = class150.method2761(ClientProt.field3194, client.field2384.field1770);
                  var12.field121.method2301(this.field3586.method1252());
                  client.field2384.method2573(var12);
                  this.field3623 = 0L;
               }
            }
         }
      } else {
         this.field3586 = null;
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "2052576257"
   )
   public int method5515() {
      return 1.0D == (double)this.field3608?25:((double)this.field3608 == 1.5D?37:((double)this.field3608 == 2.0D?50:(3.0D == (double)this.field3608?75:((double)this.field3608 == 4.0D?100:200))));
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1137741214"
   )
   public void method5516() {
      this.field3616 = null;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "162689456"
   )
   public int method5489() {
      return this.field3590.method4419(this.field3598.method2697(), class308.field3806.field3809)?100:this.field3590.method4413(this.field3598.method2697());
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIZIIIII)V",
      garbageValue = "-1512775489"
   )
   public void method5491(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if(this.field3602.method2605()) {
         this.method5494();
         this.method5495();
         if(var3) {
            int var8 = (int)Math.ceil((double)((float)var6 / this.field3624));
            int var9 = (int)Math.ceil((double)((float)var7 / this.field3624));
            List var10 = this.field3601.method4122(this.field3603 - var8 / 2 - 1, this.field3618 - var9 / 2 - 1, var8 / 2 + this.field3603 + 1, var9 / 2 + this.field3618 + 1, var4, var5, var6, var7, var1, var2);
            HashSet var11 = new HashSet();

            Iterator var12;
            class23 var13;
            class194 var14;
            class294 var15;
            for(var12 = var10.iterator(); var12.hasNext(); class209.method4198(var14)) {
               var13 = (class23)var12.next();
               var11.add(var13);
               var14 = new class194();
               var15 = new class294(var13.field258, var13.field248, var13.field259);
               var14.method3920(new Object[]{var15, Integer.valueOf(var1), Integer.valueOf(var2)});
               if(this.field3636.contains(var13)) {
                  var14.method3921(17);
               } else {
                  var14.method3921(15);
               }
            }

            var12 = this.field3636.iterator();

            while(var12.hasNext()) {
               var13 = (class23)var12.next();
               if(!var11.contains(var13)) {
                  var14 = new class194();
                  var15 = new class294(var13.field258, var13.field248, var13.field259);
                  var14.method3920(new Object[]{var15, Integer.valueOf(var1), Integer.valueOf(var2)});
                  var14.method3921(16);
                  class209.method4198(var14);
               }
            }

            this.field3636 = var11;
         }
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;Lkn;Ljava/util/HashMap;[Lle;B)V",
      garbageValue = "-39"
   )
   public void method5488(class217 var1, class299 var2, HashMap var3, class303[] var4) {
      this.field3606 = var4;
      this.field3590 = var1;
      this.field3594 = var2;
      this.field3595 = new HashMap();
      this.field3595.put(class181.field2480, var3.get(field3599));
      this.field3595.put(class181.field2472, var3.get(field3592));
      this.field3595.put(class181.field2473, var3.get(field3604));
      this.field3602 = new class139(var1);
      int var5 = this.field3590.method4421(class308.field3808.field3809);
      int[] var6 = this.field3590.method4475(var5);
      this.field3597 = new HashMap(var6.length);

      for(int var7 = 0; var7 < var6.length; ++var7) {
         Buffer var8 = new Buffer(this.field3590.method4398(var5, var6[var7], 1123144256));
         WorldMapData var9 = new WorldMapData();
         var9.loadMapData(var8, var6[var7]);
         this.field3597.put(var9.method2697(), var9);
         if(var9.method2741()) {
            this.field3598 = var9;
         }
      }

      this.method5606(this.field3598);
      this.field3600 = null;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-312963257"
   )
   void method5495() {
      if(this.method5498()) {
         int var1 = this.field3605 - this.field3603;
         int var2 = this.field3642 - this.field3618;
         if(var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
         }

         if(var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         this.method5496(var1 + this.field3603, var2 + this.field3618, true);
         if(this.field3603 == this.field3605 && this.field3618 == this.field3642) {
            this.field3605 = -1;
            this.field3642 = -1;
         }

      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "334970540"
   )
   public int method5502() {
      return this.field3633 == null?-1:this.field3633.method2726();
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "56"
   )
   public void method5530(int var1) {
      if(var1 >= 1) {
         this.field3614 = var1;
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIZI)V",
      garbageValue = "-622135473"
   )
   final void method5496(int var1, int var2, boolean var3) {
      this.field3603 = var1;
      this.field3618 = var2;
      class321.method6252();
      if(var3) {
         this.method5497();
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "-304990478"
   )
   void method5557(int var1, int var2, int var3) {
      if(this.field3633 != null) {
         int[] var4 = this.field3633.method2692(var1, var2, var3);
         if(var4 == null) {
            var4 = this.field3633.method2692(this.field3633.method2706(), this.field3633.method2705(), this.field3633.method2733());
         }

         this.method5496(var4[0] - this.field3633.method2701() * 64, var4[1] - this.field3633.method2734() * 64, true);
         this.field3605 = -1;
         this.field3642 = -1;
         this.field3624 = this.method5514(this.field3633.method2725());
         this.field3608 = this.field3624;
         this.field3617 = null;
         this.field3637 = null;
         this.field3601.method4125();
      }
   }

   public RSWorldMapManager getWorldMapManager() {
      return this.field3601;
   }

   public int getWorldMapX() {
      return this.field3603;
   }

   public void setWorldMapPositionTarget(int var1, int var2) {
      this.method5597(var1, var2);
   }

   public int getWorldMapY() {
      return this.field3618;
   }

   public Point getWorldMapPosition() {
      RSWorldMapManager var1 = this.getWorldMapManager();
      int var2 = this.getWorldMapX() + var1.getSurfaceOffsetX();
      int var3 = this.getWorldMapY() + var1.getSurfaceOffsetY();
      return new Point(var2, var3);
   }

   public void setWorldMapPositionTarget(WorldPoint var1) {
      this.setWorldMapPositionTarget(var1.getX(), var1.getY());
   }

   public RSWorldMapData getWorldMapData() {
      return this.field3633;
   }

   public int getWorldMapTargetX() {
      return this.field3605;
   }

   public int getWorldMapTargetY() {
      return this.field3642;
   }

   public float getWorldMapZoom() {
      return this.field3624;
   }

   public int getWorldMapDisplayWidth() {
      return this.field3609;
   }

   public int getWorldMapDisplayHeight() {
      return this.field3610;
   }

   public int getWorldMapDisplayX() {
      return this.field3607;
   }

   public int getWorldMapDisplayY() {
      return this.field3612;
   }

   public void setWorldMapPosition(int var1, int var2, boolean var3) {
      this.method5496(var1, var2, var3);
   }

   public void initializeWorldMap(net.runelite.api.WorldMapData var1) {
      this.method5617((WorldMapData)var1);
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-2110931036"
   )
   public void method5544(int var1) {
      this.field3616 = new HashSet();
      this.field3616.add(Integer.valueOf(var1));
      this.field3593 = 0;
      this.field3587 = 0;
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "342591570"
   )
   public void method5534(int var1) {
      this.field3616 = new HashSet();
      this.field3593 = 0;
      this.field3587 = 0;

      for(int var2 = 0; var2 < class123.field1663; ++var2) {
         if(class133.method2550(var2) != null && class133.method2550(var2).field1684 == var1) {
            this.field3616.add(Integer.valueOf(class133.method2550(var2).field1682));
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIII)Lh;",
      garbageValue = "-1307363583"
   )
   public WorldMapData method5542(int var1, int var2, int var3) {
      Iterator var4 = this.field3597.values().iterator();

      WorldMapData var5;
      do {
         if(!var4.hasNext()) {
            return null;
         }

         var5 = (WorldMapData)var4.next();
      } while(!var5.method2690(var1, var2, var3));

      return var5;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(IIIZI)V",
      garbageValue = "1137086625"
   )
   public void method5500(int var1, int var2, int var3, boolean var4) {
      WorldMapData var5 = this.method5542(var1, var2, var3);
      if(var5 == null) {
         if(!var4) {
            return;
         }

         var5 = this.field3598;
      }

      boolean var6 = false;
      if(var5 != this.field3600 || var4) {
         this.field3600 = var5;
         this.method5606(var5);
         var6 = true;
      }

      if(var6 || var4) {
         this.method5557(var1, var2, var3);
      }

   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "2132846886"
   )
   public void method5532(boolean var1) {
      this.field3629 = var1;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(IIIIII)V",
      garbageValue = "1485367918"
   )
   public void method5560(int var1, int var2, int var3, int var4, int var5) {
      int[] var6 = new int[4];
      class173.method3189(var6);
      class173.method3138(var1, var2, var3 + var1, var2 + var4);
      class173.method3167(var1, var2, var3, var4, -16777216);
      int var7 = this.field3602.method2606();
      if(var7 < 100) {
         this.method5622(var1, var2, var3, var4, var7);
      } else {
         if(!this.field3601.method4139()) {
            this.field3601.load(this.field3590, this.field3633.method2697(), client.field2156);
            if(!this.field3601.method4139()) {
               return;
            }
         }

         if(this.field3616 != null) {
            ++this.field3587;
            if(this.field3587 % this.field3614 == 0) {
               this.field3587 = 0;
               ++this.field3593;
            }

            if(this.field3593 >= this.field3613 && !this.field3629) {
               this.field3616 = null;
            }
         }

         int var8 = (int)Math.ceil((double)((float)var3 / this.field3624));
         int var9 = (int)Math.ceil((double)((float)var4 / this.field3624));
         this.field3601.drawMapRegion(this.field3603 - var8 / 2, this.field3618 - var9 / 2, var8 / 2 + this.field3603, var9 / 2 + this.field3618, var1, var2, var3 + var1, var2 + var4);
         if(!this.field3619) {
            boolean var10 = false;
            if(var5 - this.field3632 > 100) {
               this.field3632 = var5;
               var10 = true;
            }

            this.field3601.drawMapIcons(this.field3603 - var8 / 2, this.field3618 - var9 / 2, var8 / 2 + this.field3603, var9 / 2 + this.field3618, var1, var2, var3 + var1, var2 + var4, this.field3630, this.field3616, this.field3587, this.field3614, var10);
         }

         this.method5611(var1, var2, var3, var4, var8, var9);
         if(class239.method4720() && this.field3638 && this.field3586 != null) {
            this.field3594.method3832("Coord: " + this.field3586, class173.field2124 + 10, class173.field2122 + 20, 16776960, -1);
         }

         this.field3609 = var8;
         this.field3610 = var9;
         this.field3607 = var1;
         this.field3612 = var2;
         class173.method3141(var6);
      }
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "917143613"
   )
   public boolean method5539() {
      return !this.field3619;
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      signature = "(IIIIIII)V",
      garbageValue = "-1679403640"
   )
   public void method5653(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(this.field3602.method2605()) {
         int var7 = (int)Math.ceil((double)((float)var3 / this.field3624));
         int var8 = (int)Math.ceil((double)((float)var4 / this.field3624));
         List var9 = this.field3601.method4122(this.field3603 - var7 / 2 - 1, this.field3618 - var8 / 2 - 1, var7 / 2 + this.field3603 + 1, var8 / 2 + this.field3618 + 1, var1, var2, var3, var4, var5, var6);
         if(!var9.isEmpty()) {
            Iterator var10 = var9.iterator();

            boolean var13;
            do {
               if(!var10.hasNext()) {
                  return;
               }

               class23 var11 = (class23)var10.next();
               class123 var12 = class133.method2550(var11.field258);
               var13 = false;

               for(int var14 = this.field3615.length - 1; var14 >= 0; --var14) {
                  if(var12.field1681[var14] != null) {
                     class28.method484(var12.field1681[var14], var12.field1674, this.field3615[var14], var11.field258, var11.field248.method1252(), var11.field259.method1252());
                     var13 = true;
                  }
               }
            } while(!var13);

         }
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1127865316"
   )
   public void method5512(int var1) {
      this.field3608 = this.method5514(var1);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "0"
   )
   public boolean method5610() {
      return this.field3602.method2605();
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "744082520"
   )
   public void method5522(int var1, int var2, int var3) {
      if(this.field3633 != null) {
         int[] var4 = this.field3633.method2692(var1, var2, var3);
         if(var4 != null) {
            this.method5624(var4[0], var4[1]);
         }

      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   final void method5497() {
      this.field3622 = -1;
      this.field3621 = -1;
      this.field3620 = -1;
      this.field3634 = -1;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(B)Lhx;",
      garbageValue = "75"
   )
   public Location method5525() {
      return this.field3633 == null?null:this.field3633.method2712(this.method5523(), this.method5524());
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "821069027"
   )
   public boolean method5541(int var1) {
      return !this.field3596.contains(Integer.valueOf(var1));
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(IB)F",
      garbageValue = "5"
   )
   float method5514(int var1) {
      return var1 == 25?1.0F:(var1 == 37?1.5F:(var1 == 50?2.0F:(var1 == 75?3.0F:(var1 == 100?4.0F:8.0F))));
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(B)Lh;",
      garbageValue = "56"
   )
   public WorldMapData method5503() {
      return this.field3633;
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-1336153947"
   )
   public void method5536(boolean var1) {
      this.field3619 = !var1;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "346884099"
   )
   public void method5504(int var1) {
      WorldMapData var2 = this.method5632(var1);
      if(var2 != null) {
         this.method5606(var2);
      }

   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "30"
   )
   public void method5597(int var1, int var2) {
      if(this.field3633 != null && this.field3633.method2691(var1, var2)) {
         this.field3605 = var1 - this.field3633.method2701() * 64;
         this.field3642 = var2 - this.field3633.method2734() * 64;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-58"
   )
   public int method5523() {
      return this.field3633 == null?-1:this.field3603 + this.field3633.method2701() * 64;
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "74"
   )
   void method5550() {
      this.field3630.clear();
      this.field3630.addAll(this.field3631);
      this.field3630.addAll(this.field3635);
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      signature = "(ILhx;I)Lhx;",
      garbageValue = "-1543923399"
   )
   public Location method5535(int var1, Location var2) {
      if(!this.field3602.method2605()) {
         return null;
      } else if(!this.field3601.method4139()) {
         return null;
      } else if(!this.field3633.method2691(var2.field719, var2.field717)) {
         return null;
      } else {
         HashMap var3 = this.field3601.method4116();
         List var4 = (List)var3.get(Integer.valueOf(var1));
         if(var4 != null && !var4.isEmpty()) {
            class23 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();

            while(true) {
               class23 var8;
               int var11;
               do {
                  if(!var7.hasNext()) {
                     return var5.field259;
                  }

                  var8 = (class23)var7.next();
                  int var9 = var8.field259.field719 - var2.field719;
                  int var10 = var8.field259.field717 - var2.field717;
                  var11 = var9 * var9 + var10 * var10;
                  if(var11 == 0) {
                     return var8.field259;
                  }
               } while(var11 >= var6 && var5 != null);

               var5 = var8;
               var6 = var11;
            }
         } else {
            return null;
         }
      }
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "-64"
   )
   public boolean method5499(int var1) {
      return !this.field3631.contains(Integer.valueOf(var1));
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lh;Lhx;Lhx;ZI)V",
      garbageValue = "-50267692"
   )
   public void method5537(WorldMapData var1, Location var2, Location var3, boolean var4) {
      if(var1 != null) {
         if(this.field3633 == null || var1 != this.field3633) {
            this.method5617(var1);
         }

         if(!var4 && this.field3633.method2690(var2.field718, var2.field719, var2.field717)) {
            this.method5557(var2.field718, var2.field719, var2.field717);
         } else {
            this.method5557(var3.field718, var3.field719, var3.field717);
         }

      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(II)Lh;",
      garbageValue = "-1697049345"
   )
   public WorldMapData method5632(int var1) {
      Iterator var2 = this.field3597.values().iterator();

      WorldMapData var3;
      do {
         if(!var2.hasNext()) {
            return null;
         }

         var3 = (WorldMapData)var2.next();
      } while(var3.method2726() != var1);

      return var3;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1811851351"
   )
   public void method5529() {
      this.field3613 = 3;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIZZI)V",
      garbageValue = "-1791453291"
   )
   public void method5584(int var1, int var2, boolean var3, boolean var4) {
      long var5 = class321.method6252();
      this.method5493(var1, var2, var4, var5);
      if(!this.method5498() && (var4 || var3)) {
         if(var4) {
            this.field3621 = var1;
            this.field3622 = var2;
            this.field3634 = this.field3603;
            this.field3620 = this.field3618;
         }

         if(this.field3634 != -1) {
            int var7 = var1 - this.field3621;
            int var8 = var2 - this.field3622;
            this.method5496(this.field3634 - (int)((float)var7 / this.field3608), (int)((float)var8 / this.field3608) + this.field3620, false);
         }
      } else {
         this.method5497();
      }

      if(var4) {
         this.field3623 = var5;
         this.field3627 = var1;
         this.field3625 = var2;
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(IIIIB)V",
      garbageValue = "23"
   )
   public void method5511(int var1, int var2, int var3, int var4) {
      if(this.field3602.method2605()) {
         if(!this.field3601.method4139()) {
            this.field3601.load(this.field3590, this.field3633.method2697(), client.field2156);
            if(!this.field3601.method4139()) {
               return;
            }
         }

         this.field3601.method4142(var1, var2, var3, var4, this.field3616, this.field3587, this.field3614);
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-39"
   )
   public int method5527() {
      return this.field3610;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "73"
   )
   public void method5490() {
      WorldMapRegion.field527.method4029(5);
      WorldMapRegion.field536.method4029(5);
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "(IZI)V",
      garbageValue = "626971960"
   )
   public void method5538(int var1, boolean var2) {
      if(!var2) {
         this.field3596.add(Integer.valueOf(var1));
      } else {
         this.field3596.remove(Integer.valueOf(var1));
      }

      for(int var3 = 0; var3 < class123.field1663; ++var3) {
         if(class133.method2550(var3) != null && class133.method2550(var3).field1684 == var1) {
            int var4 = class133.method2550(var3).field1682;
            if(!var2) {
               this.field3635.add(Integer.valueOf(var4));
            } else {
               this.field3635.remove(Integer.valueOf(var4));
            }
         }
      }

      this.method5550();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "14"
   )
   public void method5528(int var1) {
      if(var1 >= 1) {
         this.field3613 = var1;
      }

   }
}
