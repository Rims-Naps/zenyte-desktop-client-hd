package net.runelite.client.standalone;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
public class class205 implements class43 {
   @ObfuscatedName("db")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class108 field1992;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1071848565
   )
   int field1995;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -54467315
   )
   int field1999;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 832136827
   )
   int field2001;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -242921939
   )
   int field2003;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1854374911
   )
   int field2000;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1005411413
   )
   int field2006;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1299278933
   )
   int field2002;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -768600013
   )
   int field2005;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1503941649
   )
   int field1998;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -448445123
   )
   int field2004;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1632971871
   )
   int field1993;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 2083214567
   )
   int field1997;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -587962701
   )
   int field1994;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 736522203
   )
   int field1996;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lh;B)V",
      garbageValue = "-105"
   )
   public void vmethod3479(class87 var1) {
      if(var1.field793 > this.field2005) {
         var1.field793 = this.field2005;
      }

      if(var1.field794 < this.field2005) {
         var1.field794 = this.field2005;
      }

      if(var1.field789 > this.field1997) {
         var1.field789 = this.field1997;
      }

      if(var1.field796 < this.field1997) {
         var1.field796 = this.field1997;
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-33"
   )
   void method3485() {
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "116686342"
   )
   public void vmethod3484(Buffer var1) {
      this.field1995 = var1.readUnsignedByte();
      this.field2004 = var1.readUnsignedByte();
      this.field1994 = var1.readUnsignedShort();
      this.field2002 = var1.readUnsignedByte();
      this.field2000 = var1.readUnsignedByte();
      this.field1993 = var1.readUnsignedShort();
      this.field2006 = var1.readUnsignedByte();
      this.field2001 = var1.readUnsignedByte();
      this.field2005 = var1.readUnsignedShort();
      this.field1996 = var1.readUnsignedByte();
      this.field1998 = var1.readUnsignedByte();
      this.field1997 = var1.readUnsignedShort();
      this.field2003 = var1.readUnsignedByte();
      this.field1999 = var1.readUnsignedByte();
      this.method3485();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIB)Lhx;",
      garbageValue = "26"
   )
   public class34 vmethod3483(int var1, int var2) {
      if(!this.vmethod3489(var1, var2)) {
         return null;
      } else {
         int var3 = this.field1994 * 64 - this.field2005 * 64 + (this.field2002 * 8 - this.field1996 * 8) + var1;
         int var4 = this.field1993 * 64 - this.field1997 * 64 + var2 + (this.field2006 * 8 - this.field2003 * 8);
         return new class34(this.field1995, var3, var4);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIIB)Z",
      garbageValue = "37"
   )
   public boolean vmethod3480(int var1, int var2, int var3) {
      return var1 >= this.field1995 && var1 < this.field2004 + this.field1995?var2 >= (this.field1994 << 6) + (this.field2002 << 3) && var2 <= (this.field1994 << 6) + (this.field2000 << 3) + 7 && var3 >= (this.field1993 << 6) + (this.field2006 << 3) && var3 <= (this.field1993 << 6) + (this.field2001 << 3) + 7:false;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIII)[I",
      garbageValue = "-161024515"
   )
   public int[] vmethod3482(int var1, int var2, int var3) {
      if(!this.vmethod3480(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field2005 * 64 - this.field1994 * 64 + var2 + (this.field1996 * 8 - this.field2002 * 8), var3 + (this.field1997 * 64 - this.field1993 * 64) + (this.field2003 * 8 - this.field2006 * 8)};
         return var4;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)Z",
      garbageValue = "16"
   )
   public boolean vmethod3489(int var1, int var2) {
      return var1 >= (this.field2005 << 6) + (this.field1996 << 3) && var1 <= (this.field2005 << 6) + (this.field1998 << 3) + 7 && var2 >= (this.field1997 << 6) + (this.field2003 << 3) && var2 <= (this.field1997 << 6) + (this.field1999 << 3) + 7;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "28"
   )
   static void method3503() {
      Iterator var0 = class297.field3193.iterator();

      while(var0.hasNext()) {
         class286 var1 = (class286)var0.next();
         var1.method5058();
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1486686086"
   )
   public static boolean method3491(int var0) {
      return var0 >= class331.field3718.field3721 && var0 <= class331.field3719.field3721;
   }

   @ObfuscatedName("gw")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "892381008"
   )
   static boolean method3505() {
      return (client.field3962 & 8) != 0;
   }

   @ObfuscatedName("hf")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "92"
   )
   static final boolean method3502(int var0) {
      if(var0 < 0) {
         return false;
      } else {
         int var1 = client.field3872[var0];
         if(var1 >= 2000) {
            var1 -= 2000;
         }

         return var1 == 1007;
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1478845197"
   )
   static final int method3501(int var0, int var1) {
      int var2 = class225.method4021(var0 - 1, var1 - 1) + class225.method4021(var0 + 1, var1 - 1) + class225.method4021(var0 - 1, var1 + 1) + class225.method4021(var0 + 1, 1 + var1);
      int var3 = class225.method4021(var0 - 1, var1) + class225.method4021(1 + var0, var1) + class225.method4021(var0, var1 - 1) + class225.method4021(var0, 1 + var1);
      int var4 = class225.method4021(var0, var1);
      return var2 / 16 + var3 / 8 + var4 / 4;
   }
}
