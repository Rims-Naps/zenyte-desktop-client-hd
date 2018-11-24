package net.runelite.standalone;

import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSWorldMapData;

@ObfuscatedName("h")
public class class149 implements RSWorldMapData {
   @ObfuscatedName("nm")
   @ObfuscatedGetter(
      intValue = 1690039883
   )
   static int field1849;
   @ObfuscatedName("qw")
   @ObfuscatedGetter(
      intValue = 163584913
   )
   static int field1850;
   @ObfuscatedName("dg")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class6 field1851;
   @ObfuscatedName("z")
   LinkedList field1841;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1333984045
   )
   int field1844;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 63566349
   )
   int field1843;
   @ObfuscatedName("l")
   String field1838;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 68760845
   )
   int field1840;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 670438557
   )
   int field1847;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1043074569
   )
   int field1839;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1385637027
   )
   int field1846;
   @ObfuscatedName("d")
   boolean field1837;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lhx;"
   )
   class58 field1842;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 447055441
   )
   int field1848;
   @ObfuscatedName("w")
   String field1845;

   public class149() {
      this.field1847 = -1;
      this.field1840 = -1;
      this.field1848 = -1;
      this.field1842 = null;
      this.field1843 = Integer.MAX_VALUE;
      this.field1844 = 0;
      this.field1839 = Integer.MAX_VALUE;
      this.field1846 = 0;
      this.field1837 = false;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1345359554"
   )
   public int method2705() {
      return this.field1842.field719;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-1902930857"
   )
   public String method2698() {
      return this.field1845;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "798333679"
   )
   void method2694() {
      Iterator var1 = this.field1841.iterator();

      while(var1.hasNext()) {
         class61 var2 = (class61)var1.next();
         var2.vmethod5276(this);
      }

   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "336834937"
   )
   public int method2704() {
      return this.field1846;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(III)Lhx;",
      garbageValue = "-1214772113"
   )
   public class58 method2712(int var1, int var2) {
      Iterator var3 = this.field1841.iterator();

      class61 var4;
      do {
         if(!var3.hasNext()) {
            return null;
         }

         var4 = (class61)var3.next();
      } while(!var4.vmethod5282(var1, var2));

      return var4.vmethod5264(var1, var2);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgm;I)Lac;",
      garbageValue = "-345544303"
   )
   class61 method2689(class125 var1) {
      int var2 = var1.method2256();
      class32[] var3 = new class32[]{class32.field298, class32.field305, class32.field296, class32.field295};
      class32 var4 = (class32)class38.method678(var3, var2);
      Object var5 = null;
      switch(var4.field294) {
      case 0:
         var5 = new class59();
         break;
      case 1:
         var5 = new class265();
         break;
      case 2:
         var5 = new class236();
         break;
      case 3:
         var5 = new class233();
         break;
      default:
         throw new IllegalStateException("");
      }

      ((class61)var5).vmethod5267(var1);
      return (class61)var5;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-239348312"
   )
   public boolean method2691(int var1, int var2) {
      int var3 = var1 / 64;
      int var4 = var2 / 64;
      if(var3 >= this.field1843 && var3 <= this.field1844) {
         if(var4 >= this.field1839 && var4 <= this.field1846) {
            Iterator var5 = this.field1841.iterator();

            class61 var6;
            do {
               if(!var5.hasNext()) {
                  return false;
               }

               var6 = (class61)var5.next();
            } while(!var6.vmethod5282(var1, var2));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "1047760222"
   )
   public void method2713(class125 var1, int var2) {
      this.field1847 = var2;
      this.field1838 = var1.method2265();
      this.field1845 = var1.method2265();
      this.field1842 = new class58(var1.method2344());
      this.field1840 = var1.method2344();
      var1.method2256();
      this.field1837 = var1.method2256() == 1;
      this.field1848 = var1.method2256();
      int var3 = var1.method2256();
      this.field1841 = new LinkedList();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field1841.add(this.method2689(var1));
      }

      this.method2694();
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(S)I",
      garbageValue = "9985"
   )
   public int method2726() {
      return this.field1847;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "89"
   )
   public int method2702() {
      return this.field1844;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-142812563"
   )
   public boolean method2741() {
      return this.field1837;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-50"
   )
   public int method2733() {
      return this.field1842.field717;
   }

   public boolean surfaceContainsPosition(int var1, int var2) {
      return this.method2691(var1, var2);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "0"
   )
   int method2693() {
      return this.field1840;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "86"
   )
   public int method2725() {
      return this.field1848;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(I)Lhx;",
      garbageValue = "65599732"
   )
   public class58 method2735() {
      return new class58(this.field1842);
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-1660504817"
   )
   public String method2697() {
      return this.field1838;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1001653162"
   )
   public int method2734() {
      return this.field1839;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1543384319"
   )
   public int method2701() {
      return this.field1843;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1458528915"
   )
   public int method2706() {
      return this.field1842.field718;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIII)[I",
      garbageValue = "1385008316"
   )
   public int[] method2692(int var1, int var2, int var3) {
      Iterator var4 = this.field1841.iterator();

      class61 var5;
      do {
         if(!var4.hasNext()) {
            return null;
         }

         var5 = (class61)var4.next();
      } while(!var5.vmethod5263(var1, var2, var3));

      return var5.vmethod5265(var1, var2, var3);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIII)Z",
      garbageValue = "1800450648"
   )
   public boolean method2690(int var1, int var2, int var3) {
      Iterator var4 = this.field1841.iterator();

      class61 var5;
      do {
         if(!var4.hasNext()) {
            return false;
         }

         var5 = (class61)var4.next();
      } while(!var5.vmethod5263(var1, var2, var3));

      return true;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "1740579437"
   )
   static final void method2707(String var0) {
      ServerProt.method3131(30, "", var0);
   }

   @ObfuscatedName("em")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-2122569231"
   )
   static int method2740(int var0) {
      return var0 * 3 + 600;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(III)Lo;",
      garbageValue = "1229095151"
   )
   static class230 method2757(int var0, int var1) {
      class204 var2 = class47.field536;
      long var3 = (long)(0 | var0 << 8 | var1);
      return (class230)var2.method4028(var3);
   }

   @ObfuscatedName("w")
   static int method2687(long var0) {
      return (int)(var0 >>> 14 & 3L);
   }
}
