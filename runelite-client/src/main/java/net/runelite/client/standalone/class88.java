package net.runelite.client.standalone;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.api.Point;
import net.runelite.api.WorldMapData;
import net.runelite.api.coords.WorldPoint;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSRenderOverview;
import net.runelite.rs.api.RSWorldMapData;
import net.runelite.rs.api.RSWorldMapManager;

@ObfuscatedName("la")
public class class88 implements RSRenderOverview {
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   static final class86 field822;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   static final class86 field810;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   static final class86 field817;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1338709777
   )
   int field830;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1870868691
   )
   int field811;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "Lh;"
   )
   class87 field851;
   @ObfuscatedName("au")
   HashSet field849;
   @ObfuscatedName("bs")
   public boolean field856;
   @ObfuscatedName("v")
   HashMap field815;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1786790823
   )
   int field821;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 408889125
   )
   int field850;
   @ObfuscatedName("ar")
   boolean field844;
   @ObfuscatedName("ac")
   boolean field847;
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "Lhx;"
   )
   class34 field804;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 269267657
   )
   int field839;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = 480288715
   )
   int field829;
   @ObfuscatedName("q")
   float field826;
   @ObfuscatedName("z")
   HashMap field813;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1730989969
   )
   int field836;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1965823923
   )
   int field825;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1215273679
   )
   int field852;
   @ObfuscatedName("be")
   final int[] field833;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 1959014059
   )
   int field859;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lat;"
   )
   class322 field819;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      longValue = 5485629690108429551L
   )
   long field841;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   class148 field808;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lh;"
   )
   class87 field818;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Llu;"
   )
   class42 field820;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "[Lle;"
   )
   class32[] field824;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -1235674833
   )
   int field831;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1980325907
   )
   int field845;
   @ObfuscatedName("ah")
   HashSet field853;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1479771611
   )
   int field823;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 2114053751
   )
   int field861;
   @ObfuscatedName("bo")
   List field835;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lh;"
   )
   class87 field816;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 165577371
   )
   int field840;
   @ObfuscatedName("ai")
   HashSet field848;
   @ObfuscatedName("k")
   float field842;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -286426449
   )
   int field805;
   @ObfuscatedName("an")
   boolean field837;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -101167141
   )
   int field860;
   @ObfuscatedName("aj")
   HashSet field814;
   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      signature = "Llp;"
   )
   class26 field857;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = -788723543
   )
   int field858;
   @ObfuscatedName("bf")
   HashSet field854;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1413747755
   )
   int field843;
   @ObfuscatedName("bx")
   Iterator field855;
   @ObfuscatedName("am")
   HashSet field834;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 462410171
   )
   int field827;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Lkn;"
   )
   class277 field812;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 888959241
   )
   int field832;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1020785493
   )
   int field838;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -2054609209
   )
   int field828;

   static {
      field817 = class86.field778;
      field810 = class86.field779;
      field822 = class86.field780;
   }

   public class88() {
      this.field823 = -1;
      this.field860 = -1;
      this.field827 = -1;
      this.field828 = -1;
      this.field825 = -1;
      this.field830 = -1;
      this.field831 = 3;
      this.field832 = 50;
      this.field847 = false;
      this.field834 = null;
      this.field811 = -1;
      this.field805 = -1;
      this.field852 = -1;
      this.field838 = -1;
      this.field839 = -1;
      this.field840 = -1;
      this.field844 = true;
      this.field849 = new HashSet();
      this.field814 = new HashSet();
      this.field853 = new HashSet();
      this.field848 = new HashSet();
      this.field837 = false;
      this.field850 = 0;
      this.field833 = new int[]{1008, 1009, 1010, 1011, 1012};
      this.field854 = new HashSet();
      this.field804 = null;
      this.field856 = false;
      this.field859 = -1;
      this.field829 = -1;
      this.field861 = -1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(IIIIIII)V",
      garbageValue = "1972429751"
   )
   void method1452(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(class263.field2912 != null) {
         int var7 = 512 / (this.field819.field3443 * 2);
         int var8 = var3 + 512;
         int var9 = var4 + 512;
         float var10 = 1.0F;
         var8 = (int)((float)var8 / var10);
         var9 = (int)((float)var9 / var10);
         int var11 = this.method1364() - var5 / 2 - var7;
         int var12 = this.method1365() - var6 / 2 - var7;
         int var13 = var1 - (var11 + var7 - this.field859) * this.field819.field3443;
         int var14 = var2 - this.field819.field3443 * (var7 - (var12 - this.field829));
         if(this.method1440(var8, var9, var13, var14, var3, var4)) {
            if(this.field857 != null && this.field857.field202 == var8 && this.field857.field201 == var9) {
               Arrays.fill(this.field857.field203, 0);
            } else {
               this.field857 = new class26(var8, var9);
            }

            this.field859 = this.method1364() - var5 / 2 - var7;
            this.field829 = this.method1365() - var6 / 2 - var7;
            this.field858 = this.field819.field3443;
            class263.field2912.method3913(this.field859, this.field829, this.field857, (float)this.field858 / var10);
            this.field861 = client.field4001;
            var13 = var1 - (var7 + var11 - this.field859) * this.field819.field3443;
            var14 = var2 - this.field819.field3443 * (var7 - (var12 - this.field829));
         }

         class89.method1539(var1, var2, var3, var4, 0, 128);
         if(1.0F == var10) {
            this.field857.method388(var13, var14, 192);
         } else {
            this.field857.method391(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 192);
         }
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "2052576257"
   )
   public int method1356() {
      return 1.0D == (double)this.field826?25:((double)this.field826 == 1.5D?37:((double)this.field826 == 2.0D?50:(3.0D == (double)this.field826?75:((double)this.field826 == 4.0D?100:200))));
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-39"
   )
   public int method1368() {
      return this.field828;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;Lkn;Ljava/util/HashMap;[Lle;B)V",
      garbageValue = "-39"
   )
   public void method1329(class148 var1, class277 var2, HashMap var3, class32[] var4) {
      this.field824 = var4;
      this.field808 = var1;
      this.field812 = var2;
      this.field813 = new HashMap();
      this.field813.put(class169.field1568, var3.get(field817));
      this.field813.put(class169.field1560, var3.get(field810));
      this.field813.put(class169.field1561, var3.get(field822));
      this.field820 = new class42(var1);
      int var5 = this.field808.method2602(class171.field1584.field1585);
      int[] var6 = this.field808.method2656(var5);
      this.field815 = new HashMap(var6.length);

      for(int var7 = 0; var7 < var6.length; ++var7) {
         Buffer var8 = new Buffer(this.field808.method2579(var5, var6[var7], 1123144256));
         class87 var9 = new class87();
         var9.method1281(var8, var6[var7]);
         this.field815.put(var9.method1265(), var9);
         if(var9.method1309()) {
            this.field816 = var9;
         }
      }

      this.method1447(this.field816);
      this.field818 = null;
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "917143613"
   )
   public boolean method1380() {
      return !this.field837;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(IIIZI)V",
      garbageValue = "1137086625"
   )
   public void method1341(int var1, int var2, int var3, boolean var4) {
      class87 var5 = this.method1383(var1, var2, var3);
      if(var5 == null) {
         if(!var4) {
            return;
         }

         var5 = this.field816;
      }

      boolean var6 = false;
      if(var5 != this.field818 || var4) {
         this.field818 = var5;
         this.method1447(var5);
         var6 = true;
      }

      if(var6 || var4) {
         this.method1398(var1, var2, var3);
      }

   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "2132846886"
   )
   public void method1373(boolean var1) {
      this.field847 = var1;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "47"
   )
   public int method1365() {
      return this.field851 == null?-1:this.field836 + this.field851.method1302() * 64;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(IIIIII)V",
      garbageValue = "-719337132"
   )
   void method1463(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = 20;
      int var7 = var3 / 2 + var1;
      int var8 = var4 / 2 + var2 - 18 - var6;
      class89.method1561(var1, var2, var3, var4, -16777216);
      class89.method1543(var7 - 152, var8, 304, 34, -65536);
      class89.method1561(var7 - 150, var8 + 2, var5 * 3, 30, -65536);
      this.field812.method3590("Loading...", var7, var6 + var8, -1, -1);
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "(IZI)V",
      garbageValue = "626971960"
   )
   public void method1379(int var1, boolean var2) {
      if(!var2) {
         this.field814.add(Integer.valueOf(var1));
      } else {
         this.field814.remove(Integer.valueOf(var1));
      }

      for(int var3 = 0; var3 < class191.field1816; ++var3) {
         if(class59.method1036(var3) != null && class59.method1036(var3).field1837 == var1) {
            int var4 = class59.method1036(var3).field1835;
            if(!var2) {
               this.field853.add(Integer.valueOf(var4));
            } else {
               this.field853.remove(Integer.valueOf(var4));
            }
         }
      }

      this.method1391();
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "30"
   )
   public void method1438(int var1, int var2) {
      if(this.field851 != null && this.field851.method1259(var1, var2)) {
         this.field823 = var1 - this.field851.method1269() * 64;
         this.field860 = var2 - this.field851.method1302() * 64;
      }
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      signature = "(IIIIIII)V",
      garbageValue = "-1679403640"
   )
   public void method1494(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(this.field820.method726()) {
         int var7 = (int)Math.ceil((double)((float)var3 / this.field842));
         int var8 = (int)Math.ceil((double)((float)var4 / this.field842));
         List var9 = this.field819.method5672(this.field821 - var7 / 2 - 1, this.field836 - var8 / 2 - 1, var7 / 2 + this.field821 + 1, var8 / 2 + this.field836 + 1, var1, var2, var3, var4, var5, var6);
         if(!var9.isEmpty()) {
            Iterator var10 = var9.iterator();

            boolean var13;
            do {
               if(!var10.hasNext()) {
                  return;
               }

               class2 var11 = (class2)var10.next();
               class191 var12 = class59.method1036(var11.field23);
               var13 = false;

               for(int var14 = this.field833.length - 1; var14 >= 0; --var14) {
                  if(var12.field1834[var14] != null) {
                     class98.method1687(var12.field1834[var14], var12.field1827, this.field833[var14], var11.field23, var11.field13.method555(), var11.field24.method555());
                     var13 = true;
                  }
               }
            } while(!var13);

         }
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIZI)V",
      garbageValue = "-622135473"
   )
   final void method1337(int var1, int var2, boolean var3) {
      this.field821 = var1;
      this.field836 = var2;
      class234.method4170();
      if(var3) {
         this.method1338();
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lh;Lhx;Lhx;ZI)V",
      garbageValue = "-50267692"
   )
   public void method1378(class87 var1, class34 var2, class34 var3, boolean var4) {
      if(var1 != null) {
         if(this.field851 == null || var1 != this.field851) {
            this.method1458(var1);
         }

         if(!var4 && this.field851.method1258(var2.field267, var2.field268, var2.field266)) {
            this.method1398(var2.field267, var2.field268, var2.field266);
         } else {
            this.method1398(var3.field267, var3.field268, var3.field266);
         }

      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "22"
   )
   boolean method1339() {
      return this.field823 != -1 && this.field860 != -1;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-312963257"
   )
   void method1336() {
      if(this.method1339()) {
         int var1 = this.field823 - this.field821;
         int var2 = this.field860 - this.field836;
         if(var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
         }

         if(var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         this.method1337(var1 + this.field821, var2 + this.field836, true);
         if(this.field821 == this.field823 && this.field836 == this.field860) {
            this.field823 = -1;
            this.field860 = -1;
         }

      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(IIIIIII)Z",
      garbageValue = "-1975921120"
   )
   boolean method1440(int var1, int var2, int var3, int var4, int var5, int var6) {
      return this.field857 == null?true:(this.field857.field202 == var1 && this.field857.field201 == var2?(this.field819.field3443 != this.field858?true:(this.field861 != client.field4001?true:(var3 <= 0 && var4 <= 0?var3 + var1 < var5 || var2 + var4 < var6:true))):true);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "0"
   )
   public boolean method1451() {
      return this.field820.method726();
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "342591570"
   )
   public void method1375(int var1) {
      this.field834 = new HashSet();
      this.field811 = 0;
      this.field805 = 0;

      for(int var2 = 0; var2 < class191.field1816; ++var2) {
         if(class59.method1036(var2) != null && class59.method1036(var2).field1837 == var1) {
            this.field834.add(Integer.valueOf(class59.method1036(var2).field1835));
         }
      }

   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "74"
   )
   void method1391() {
      this.field848.clear();
      this.field848.addAll(this.field849);
      this.field848.addAll(this.field853);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1167261992"
   )
   void method1335() {
      if(class263.field2912 != null) {
         this.field842 = this.field826;
      } else {
         if(this.field842 < this.field826) {
            this.field842 = Math.min(this.field826, this.field842 / 30.0F + this.field842);
         }

         if(this.field842 > this.field826) {
            this.field842 = Math.max(this.field826, this.field842 - this.field842 / 30.0F);
         }

      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "334970540"
   )
   public int method1343() {
      return this.field851 == null?-1:this.field851.method1294();
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-202286445"
   )
   public int method1367() {
      return this.field827;
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      signature = "(I)Laf;",
      garbageValue = "-787307296"
   )
   public class2 method1387() {
      if(!this.field820.method726()) {
         return null;
      } else if(!this.field819.method5689()) {
         return null;
      } else {
         HashMap var1 = this.field819.method5666();
         this.field835 = new LinkedList();
         Iterator var2 = var1.values().iterator();

         while(var2.hasNext()) {
            List var3 = (List)var2.next();
            this.field835.addAll(var3);
         }

         this.field855 = this.field835.iterator();
         return this.method1468();
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(IIIB)V",
      garbageValue = "56"
   )
   public void method1362(int var1, int var2, int var3) {
      if(this.field851 != null) {
         int[] var4 = this.field851.method1260(var1, var2, var3);
         if(var4 != null) {
            this.method1438(var4[0], var4[1]);
         }

      }
   }

   @ObfuscatedName("c")
   void method1334(int var1, int var2, boolean var3, long var4) {
      if(this.field851 != null) {
         int var6 = (int)((float)this.field821 + ((float)(var1 - this.field825) - (float)this.method1367() * this.field842 / 2.0F) / this.field842);
         int var7 = (int)((float)this.field836 - ((float)(var2 - this.field830) - (float)this.method1368() * this.field842 / 2.0F) / this.field842);
         this.field804 = this.field851.method1280(var6 + this.field851.method1269() * 64, var7 + this.field851.method1302() * 64);
         if(this.field804 != null && var3) {
            int var9;
            int var10;
            if(class270.method4879() && class135.field1332[82] && class135.field1332[81]) {
               int var13 = this.field804.field268;
               var9 = this.field804.field266;
               var10 = this.field804.field267;
               class279 var11 = class95.writeClientProt(ClientProt.WORLD_MAP_CLICK, client.field3963.field1162);
               var11.field3018.writeIntV1(0);
               var11.field3018.writeShortLE(var9);
               var11.field3018.writeByteC(var10);
               var11.field3018.writeShort(var13);
               client.field3963.method2235(var11);
            } else {
               boolean var8 = true;
               if(this.field844) {
                  var9 = var1 - this.field845;
                  var10 = var2 - this.field843;
                  if(var4 - this.field841 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                     var8 = false;
                  }
               }

               if(var8) {
                  class279 var12 = class95.writeClientProt(ClientProt.WORLD_MAP_DOUBLE_CLICK, client.field3963.field1162);
                  var12.field3018.writeIntV1(this.field804.method555());
                  client.field3963.method2235(var12);
                  this.field841 = 0L;
               }
            }
         }
      } else {
         this.field804 = null;
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIZZI)V",
      garbageValue = "-1791453291"
   )
   public void method1425(int var1, int var2, boolean var3, boolean var4) {
      long var5 = class234.method4170();
      this.method1334(var1, var2, var4, var5);
      if(!this.method1339() && (var4 || var3)) {
         if(var4) {
            this.field839 = var1;
            this.field840 = var2;
            this.field852 = this.field821;
            this.field838 = this.field836;
         }

         if(this.field852 != -1) {
            int var7 = var1 - this.field839;
            int var8 = var2 - this.field840;
            this.method1337(this.field852 - (int)((float)var7 / this.field826), (int)((float)var8 / this.field826) + this.field838, false);
         }
      } else {
         this.method1338();
      }

      if(var4) {
         this.field841 = var5;
         this.field845 = var1;
         this.field843 = var2;
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIII)Lh;",
      garbageValue = "-1307363583"
   )
   public class87 method1383(int var1, int var2, int var3) {
      Iterator var4 = this.field815.values().iterator();

      class87 var5;
      do {
         if(!var4.hasNext()) {
            return null;
         }

         var5 = (class87)var4.next();
      } while(!var5.method1258(var1, var2, var3));

      return var5;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "162689456"
   )
   public int method1330() {
      return this.field808.method2600(this.field816.method1265(), class171.field1582.field1585)?100:this.field808.method2594(this.field816.method1265());
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(IIIIB)V",
      garbageValue = "23"
   )
   public void method1352(int var1, int var2, int var3, int var4) {
      if(this.field820.method726()) {
         if(!this.field819.method5689()) {
            this.field819.method5665(this.field808, this.field851.method1265(), client.field3735);
            if(!this.field819.method5689()) {
               return;
            }
         }

         this.field819.method5692(var1, var2, var3, var4, this.field834, this.field805, this.field832);
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "744082520"
   )
   public void method1363(int var1, int var2, int var3) {
      if(this.field851 != null) {
         int[] var4 = this.field851.method1260(var1, var2, var3);
         if(var4 != null) {
            this.method1465(var4[0], var4[1]);
         }

      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(B)Lhx;",
      garbageValue = "75"
   )
   public class34 method1366() {
      return this.field851 == null?null:this.field851.method1280(this.method1364(), this.method1365());
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1811851351"
   )
   public void method1370() {
      this.field831 = 3;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(B)Lh;",
      garbageValue = "56"
   )
   public class87 method1344() {
      return this.field851;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIZIIIII)V",
      garbageValue = "-1512775489"
   )
   public void method1332(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if(this.field820.method726()) {
         this.method1335();
         this.method1336();
         if(var3) {
            int var8 = (int)Math.ceil((double)((float)var6 / this.field842));
            int var9 = (int)Math.ceil((double)((float)var7 / this.field842));
            List var10 = this.field819.method5672(this.field821 - var8 / 2 - 1, this.field836 - var9 / 2 - 1, var8 / 2 + this.field821 + 1, var9 / 2 + this.field836 + 1, var4, var5, var6, var7, var1, var2);
            HashSet var11 = new HashSet();

            Iterator var12;
            class2 var13;
            class9 var14;
            class326 var15;
            for(var12 = var10.iterator(); var12.hasNext(); class240.method4263(var14)) {
               var13 = (class2)var12.next();
               var11.add(var13);
               var14 = new class9();
               var15 = new class326(var13.field23, var13.field13, var13.field24);
               var14.method101(new Object[]{var15, Integer.valueOf(var1), Integer.valueOf(var2)});
               if(this.field854.contains(var13)) {
                  var14.method102(17);
               } else {
                  var14.method102(15);
               }
            }

            var12 = this.field854.iterator();

            while(var12.hasNext()) {
               var13 = (class2)var12.next();
               if(!var11.contains(var13)) {
                  var14 = new class9();
                  var15 = new class326(var13.field23, var13.field13, var13.field24);
                  var14.method101(new Object[]{var15, Integer.valueOf(var1), Integer.valueOf(var2)});
                  var14.method102(16);
                  class240.method4263(var14);
               }
            }

            this.field854 = var11;
         }
      }
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      signature = "(ILhx;I)Lhx;",
      garbageValue = "-1543923399"
   )
   public class34 method1376(int var1, class34 var2) {
      if(!this.field820.method726()) {
         return null;
      } else if(!this.field819.method5689()) {
         return null;
      } else if(!this.field851.method1259(var2.field268, var2.field266)) {
         return null;
      } else {
         HashMap var3 = this.field819.method5666();
         List var4 = (List)var3.get(Integer.valueOf(var1));
         if(var4 != null && !var4.isEmpty()) {
            class2 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();

            while(true) {
               class2 var8;
               int var11;
               do {
                  if(!var7.hasNext()) {
                     return var5.field24;
                  }

                  var8 = (class2)var7.next();
                  int var9 = var8.field24.field268 - var2.field268;
                  int var10 = var8.field24.field266 - var2.field266;
                  var11 = var9 * var9 + var10 * var10;
                  if(var11 == 0) {
                     return var8.field24;
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

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1137741214"
   )
   public void method1357() {
      this.field834 = null;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "346884099"
   )
   public void method1345(int var1) {
      class87 var2 = this.method1473(var1);
      if(var2 != null) {
         this.method1447(var2);
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "7"
   )
   public void method1465(int var1, int var2) {
      if(this.field851 != null) {
         this.method1337(var1 - this.field851.method1269() * 64, var2 - this.field851.method1302() * 64, true);
         this.field823 = -1;
         this.field860 = -1;
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "56"
   )
   public void method1371(int var1) {
      if(var1 >= 1) {
         this.field832 = var1;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "73"
   )
   public void method1331() {
      class261.field2890.method2134(5);
      class261.field2899.method2134(5);
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(Lh;I)V",
      garbageValue = "-328620867"
   )
   void method1458(class87 var1) {
      this.field851 = var1;
      this.field819 = new class322(this.field824, this.field813);
      this.field820.method733(this.field851.method1265());
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-2110931036"
   )
   public void method1385(int var1) {
      this.field834 = new HashSet();
      this.field834.add(Integer.valueOf(var1));
      this.field811 = 0;
      this.field805 = 0;
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      signature = "(S)Laf;",
      garbageValue = "1733"
   )
   public class2 method1468() {
      return this.field855 == null?null:(!this.field855.hasNext()?null:(class2)this.field855.next());
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1514376948"
   )
   public void method1374() {
      this.field820.method725();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   public void method1372() {
      this.field832 = 50;
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      signature = "(IILhx;Lhx;I)V",
      garbageValue = "1316026379"
   )
   public void method1505(int var1, int var2, class34 var3, class34 var4) {
      class9 var5 = new class9();
      class326 var6 = new class326(var2, var3, var4);
      var5.method101(new Object[]{var6});
      switch(var1) {
      case 1008:
         var5.method102(10);
         break;
      case 1009:
         var5.method102(11);
         break;
      case 1010:
         var5.method102(12);
         break;
      case 1011:
         var5.method102(13);
         break;
      case 1012:
         var5.method102(14);
      }

      class240.method4263(var5);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Lh;I)V",
      garbageValue = "-34734081"
   )
   void method1447(class87 var1) {
      if(this.field851 == null || var1 != this.field851) {
         this.method1458(var1);
         this.method1398(-1, -1, -1);
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "14"
   )
   public void method1369(int var1) {
      if(var1 >= 1) {
         this.field831 = var1;
      }

   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "-64"
   )
   public boolean method1340(int var1) {
      return !this.field849.contains(Integer.valueOf(var1));
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "821069027"
   )
   public boolean method1382(int var1) {
      return !this.field814.contains(Integer.valueOf(var1));
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "(IZB)V",
      garbageValue = "-22"
   )
   public void method1497(int var1, boolean var2) {
      if(!var2) {
         this.field849.add(Integer.valueOf(var1));
      } else {
         this.field849.remove(Integer.valueOf(var1));
      }

      this.method1391();
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-58"
   )
   public int method1364() {
      return this.field851 == null?-1:this.field821 + this.field851.method1269() * 64;
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-1336153947"
   )
   public void method1377(boolean var1) {
      this.field837 = !var1;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(IB)F",
      garbageValue = "5"
   )
   float method1355(int var1) {
      return var1 == 25?1.0F:(var1 == 37?1.5F:(var1 == 50?2.0F:(var1 == 75?3.0F:(var1 == 100?4.0F:8.0F))));
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "-304990478"
   )
   void method1398(int var1, int var2, int var3) {
      if(this.field851 != null) {
         int[] var4 = this.field851.method1260(var1, var2, var3);
         if(var4 == null) {
            var4 = this.field851.method1260(this.field851.method1274(), this.field851.method1273(), this.field851.method1301());
         }

         this.method1337(var4[0] - this.field851.method1269() * 64, var4[1] - this.field851.method1302() * 64, true);
         this.field823 = -1;
         this.field860 = -1;
         this.field842 = this.method1355(this.field851.method1293());
         this.field826 = this.field842;
         this.field835 = null;
         this.field855 = null;
         this.field819.method5675();
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   final void method1338() {
      this.field840 = -1;
      this.field839 = -1;
      this.field838 = -1;
      this.field852 = -1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1127865316"
   )
   public void method1353(int var1) {
      this.field826 = this.method1355(var1);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(II)Lh;",
      garbageValue = "-1697049345"
   )
   public class87 method1473(int var1) {
      Iterator var2 = this.field815.values().iterator();

      class87 var3;
      do {
         if(!var2.hasNext()) {
            return null;
         }

         var3 = (class87)var2.next();
      } while(var3.method1294() != var1);

      return var3;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(IIIIII)V",
      garbageValue = "1485367918"
   )
   public void method1401(int var1, int var2, int var3, int var4, int var5) {
      int[] var6 = new int[4];
      class89.method1583(var6);
      class89.method1532(var1, var2, var3 + var1, var2 + var4);
      class89.method1561(var1, var2, var3, var4, -16777216);
      int var7 = this.field820.method727();
      if(var7 < 100) {
         this.method1463(var1, var2, var3, var4, var7);
      } else {
         if(!this.field819.method5689()) {
            this.field819.method5665(this.field808, this.field851.method1265(), client.field3735);
            if(!this.field819.method5689()) {
               return;
            }
         }

         if(this.field834 != null) {
            ++this.field805;
            if(this.field805 % this.field832 == 0) {
               this.field805 = 0;
               ++this.field811;
            }

            if(this.field811 >= this.field831 && !this.field847) {
               this.field834 = null;
            }
         }

         int var8 = (int)Math.ceil((double)((float)var3 / this.field842));
         int var9 = (int)Math.ceil((double)((float)var4 / this.field842));
         this.field819.method5667(this.field821 - var8 / 2, this.field836 - var9 / 2, var8 / 2 + this.field821, var9 / 2 + this.field836, var1, var2, var3 + var1, var2 + var4);
         if(!this.field837) {
            boolean var10 = false;
            if(var5 - this.field850 > 100) {
               this.field850 = var5;
               var10 = true;
            }

            this.field819.method5668(this.field821 - var8 / 2, this.field836 - var9 / 2, var8 / 2 + this.field821, var9 / 2 + this.field836, var1, var2, var3 + var1, var2 + var4, this.field848, this.field834, this.field805, this.field832, var10);
         }

         this.method1452(var1, var2, var3, var4, var8, var9);
         if(class270.method4879() && this.field856 && this.field804 != null) {
            this.field812.method3543("Coord: " + this.field804, class89.field867 + 10, class89.field865 + 20, 16776960, -1);
         }

         this.field827 = var8;
         this.field828 = var9;
         this.field825 = var1;
         this.field830 = var2;
         class89.method1535(var6);
      }
   }

   public RSWorldMapManager getWorldMapManager() {
      return this.field819;
   }

   public int getWorldMapX() {
      return this.field821;
   }

   public void setWorldMapPositionTarget(int var1, int var2) {
      this.method1438(var1, var2);
   }

   public int getWorldMapY() {
      return this.field836;
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
      return this.field851;
   }

   public int getWorldMapTargetX() {
      return this.field823;
   }

   public int getWorldMapTargetY() {
      return this.field860;
   }

   public float getWorldMapZoom() {
      return this.field842;
   }

   public int getWorldMapDisplayWidth() {
      return this.field827;
   }

   public int getWorldMapDisplayHeight() {
      return this.field828;
   }

   public int getWorldMapDisplayX() {
      return this.field825;
   }

   public int getWorldMapDisplayY() {
      return this.field830;
   }

   public void setWorldMapPosition(int var1, int var2, boolean var3) {
      this.method1337(var1, var2, var3);
   }

   public void initializeWorldMap(WorldMapData var1) {
      this.method1458((class87)var1);
   }
}
