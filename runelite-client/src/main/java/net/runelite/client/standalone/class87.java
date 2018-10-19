package net.runelite.client.standalone;

import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSWorldMapData;

@ObfuscatedName("h")
public class class87 implements RSWorldMapData {
   @ObfuscatedName("nm")
   @ObfuscatedGetter(
      intValue = 1690039883
   )
   static int field799;
   @ObfuscatedName("qw")
   @ObfuscatedGetter(
      intValue = 163584913
   )
   static int field800;
   @ObfuscatedName("dg")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class108 field801;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 670438557
   )
   int field797;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1385637027
   )
   int field796;
   @ObfuscatedName("z")
   LinkedList field791;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1043074569
   )
   int field789;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1333984045
   )
   int field794;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 63566349
   )
   int field793;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 447055441
   )
   int field798;
   @ObfuscatedName("l")
   String field788;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 68760845
   )
   int field790;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lhx;"
   )
   class34 field792;
   @ObfuscatedName("w")
   String field795;
   @ObfuscatedName("d")
   boolean field787;

   public class87() {
      this.field797 = -1;
      this.field790 = -1;
      this.field798 = -1;
      this.field792 = null;
      this.field793 = Integer.MAX_VALUE;
      this.field794 = 0;
      this.field789 = Integer.MAX_VALUE;
      this.field796 = 0;
      this.field787 = false;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "1047760222"
   )
   public void method1281(Buffer var1, int var2) {
      this.field797 = var2;
      this.field788 = var1.readString();
      this.field795 = var1.readString();
      this.field792 = new class34(var1.readInt());
      this.field790 = var1.readInt();
      var1.readUnsignedByte();
      this.field787 = var1.readUnsignedByte() == 1;
      this.field798 = var1.readUnsignedByte();
      int var3 = var1.readUnsignedByte();
      this.field791 = new LinkedList();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field791.add(this.method1257(var1));
      }

      this.method1262();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "86"
   )
   public int method1293() {
      return this.field798;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-142812563"
   )
   public boolean method1309() {
      return this.field787;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1458528915"
   )
   public int method1274() {
      return this.field792.field267;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-1902930857"
   )
   public String method1266() {
      return this.field795;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(S)I",
      garbageValue = "9985"
   )
   public int method1294() {
      return this.field797;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "798333679"
   )
   void method1262() {
      Iterator var1 = this.field791.iterator();

      while(var1.hasNext()) {
         class43 var2 = (class43)var1.next();
         var2.vmethod3479(this);
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "89"
   )
   public int method1270() {
      return this.field794;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(III)Lhx;",
      garbageValue = "-1214772113"
   )
   public class34 method1280(int var1, int var2) {
      Iterator var3 = this.field791.iterator();

      class43 var4;
      do {
         if(!var3.hasNext()) {
            return null;
         }

         var4 = (class43)var3.next();
      } while(!var4.vmethod3489(var1, var2));

      return var4.vmethod3483(var1, var2);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIII)[I",
      garbageValue = "1385008316"
   )
   public int[] method1260(int var1, int var2, int var3) {
      Iterator var4 = this.field791.iterator();

      class43 var5;
      do {
         if(!var4.hasNext()) {
            return null;
         }

         var5 = (class43)var4.next();
      } while(!var5.vmethod3480(var1, var2, var3));

      return var5.vmethod3482(var1, var2, var3);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "0"
   )
   int method1261() {
      return this.field790;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgm;I)Lac;",
      garbageValue = "-345544303"
   )
   class43 method1257(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      class5[] var3 = new class5[]{class5.field38, class5.field45, class5.field36, class5.field35};
      class5 var4 = (class5)class297.method5176(var3, var2);
      Object var5 = null;
      switch(var4.field34) {
      case 0:
         var5 = new class96();
         break;
      case 1:
         var5 = new class168();
         break;
      case 2:
         var5 = new class57();
         break;
      case 3:
         var5 = new class205();
         break;
      default:
         throw new IllegalStateException("");
      }

      ((class43)var5).vmethod3484(var1);
      return (class43)var5;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1001653162"
   )
   public int method1302() {
      return this.field789;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-239348312"
   )
   public boolean method1259(int var1, int var2) {
      int var3 = var1 / 64;
      int var4 = var2 / 64;
      if(var3 >= this.field793 && var3 <= this.field794) {
         if(var4 >= this.field789 && var4 <= this.field796) {
            Iterator var5 = this.field791.iterator();

            class43 var6;
            do {
               if(!var5.hasNext()) {
                  return false;
               }

               var6 = (class43)var5.next();
            } while(!var6.vmethod3489(var1, var2));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1543384319"
   )
   public int method1269() {
      return this.field793;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIII)Z",
      garbageValue = "1800450648"
   )
   public boolean method1258(int var1, int var2, int var3) {
      Iterator var4 = this.field791.iterator();

      class43 var5;
      do {
         if(!var4.hasNext()) {
            return false;
         }

         var5 = (class43)var4.next();
      } while(!var5.vmethod3480(var1, var2, var3));

      return true;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1345359554"
   )
   public int method1273() {
      return this.field792.field268;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "336834937"
   )
   public int method1272() {
      return this.field796;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-50"
   )
   public int method1301() {
      return this.field792.field266;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-1660504817"
   )
   public String method1265() {
      return this.field788;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(I)Lhx;",
      garbageValue = "65599732"
   )
   public class34 method1303() {
      return new class34(this.field792);
   }

   public boolean surfaceContainsPosition(int var1, int var2) {
      return this.method1259(var1, var2);
   }

   @ObfuscatedName("em")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-2122569231"
   )
   static int method1308(int var0) {
      return var0 * 3 + 600;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "1740579437"
   )
   static final void method1275(String var0) {
      ServerProt.method4172(30, "", var0);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(III)Lo;",
      garbageValue = "1229095151"
   )
   static class184 method1325(int var0, int var1) {
      class119 var2 = class261.field2899;
      long var3 = (long)(0 | var0 << 8 | var1);
      return (class184)var2.method2133(var3);
   }

   @ObfuscatedName("w")
   static int method1255(long var0) {
      return (int)(var0 >>> 14 & 3L);
   }
}
