package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
public class class90 extends class193 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class148 field884;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class124 field871;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class124 field870;
   @ObfuscatedName("cc")
   public static char field883;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1314194881
   )
   int field874;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1246474037
   )
   int field881;
   @ObfuscatedName("m")
   short[] field877;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1193184467
   )
   int field875;
   @ObfuscatedName("r")
   short[] field876;
   @ObfuscatedName("p")
   short[] field869;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1901442543
   )
   public int field872;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1755403993
   )
   int field879;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 496048081
   )
   int field880;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1904549589
   )
   int field873;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1415442433
   )
   int field882;
   @ObfuscatedName("d")
   short[] field878;

   static {
      field870 = new class124(64);
      field871 = new class124(30);
   }

   class90() {
      this.field872 = -1;
      this.field875 = 128;
      this.field880 = 128;
      this.field881 = 0;
      this.field882 = 0;
      this.field874 = 0;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "16711680"
   )
   void method1613(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method1620(var1, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)Lds;",
      garbageValue = "0"
   )
   public final class200 method1615(int var1) {
      class200 var2 = (class200)field871.method2268((long)this.field879);
      if(var2 == null) {
         class218 var3 = class218.method3830(class128.field1223, this.field873, 0);
         if(var3 == null) {
            return null;
         }

         int var4;
         if(this.field869 != null) {
            for(var4 = 0; var4 < this.field869.length; ++var4) {
               var3.method3842(this.field869[var4], this.field876[var4]);
            }
         }

         if(this.field877 != null) {
            for(var4 = 0; var4 < this.field877.length; ++var4) {
               var3.method3843(this.field877[var4], this.field878[var4]);
            }
         }

         var2 = var3.method3863(this.field882 + 64, this.field874 + 850, -30, -50, -30);
         field871.method2275(var2, (long)this.field879);
      }

      class200 var5;
      if(this.field872 != -1 && var1 != -1) {
         var5 = class182.method3192(this.field872).method5638(var2, var1, (byte)-1);
      } else {
         var5 = var2.method3371(true);
      }

      if(this.field875 != 128 || this.field880 != 128) {
         var5.method3420(this.field875, this.field880, this.field875);
      }

      if(this.field881 != 0) {
         if(this.field881 == 90) {
            var5.method3427();
         }

         if(this.field881 == 180) {
            var5.method3427();
            var5.method3427();
         }

         if(this.field881 == 270) {
            var5.method3427();
            var5.method3427();
            var5.method3427();
         }
      }

      return var5;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "1752020775"
   )
   void method1620(Buffer var1, int var2) {
      if(var2 == 1) {
         this.field873 = var1.readUnsignedShort();
      } else if(var2 == 2) {
         this.field872 = var1.readUnsignedShort();
      } else if(var2 == 4) {
         this.field875 = var1.readUnsignedShort();
      } else if(var2 == 5) {
         this.field880 = var1.readUnsignedShort();
      } else if(var2 == 6) {
         this.field881 = var1.readUnsignedShort();
      } else if(var2 == 7) {
         this.field882 = var1.readUnsignedByte();
      } else if(var2 == 8) {
         this.field874 = var1.readUnsignedByte();
      } else {
         int var3;
         int var4;
         if(var2 == 40) {
            var3 = var1.readUnsignedByte();
            this.field869 = new short[var3];
            this.field876 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field869[var4] = (short)var1.readUnsignedShort();
               this.field876[var4] = (short)var1.readUnsignedShort();
            }
         } else if(var2 == 41) {
            var3 = var1.readUnsignedByte();
            this.field877 = new short[var3];
            this.field878 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field877[var4] = (short)var1.readUnsignedShort();
               this.field878[var4] = (short)var1.readUnsignedShort();
            }
         }
      }

   }
}
