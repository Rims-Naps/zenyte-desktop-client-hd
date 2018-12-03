package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
public class class71 extends class324 {
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class100 field812;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class217 field825;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class100 field811;
   @ObfuscatedName("cc")
   public static char field824;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1314194881
   )
   int field815;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1193184467
   )
   int field816;
   @ObfuscatedName("p")
   short[] field810;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1901442543
   )
   public int field813;
   @ObfuscatedName("r")
   short[] field817;
   @ObfuscatedName("m")
   short[] field818;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 496048081
   )
   int field821;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1246474037
   )
   int field822;
   @ObfuscatedName("d")
   short[] field819;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1904549589
   )
   int field814;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1415442433
   )
   int field823;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1755403993
   )
   int field820;

   static {
      field811 = new class100(64);
      field812 = new class100(30);
   }

   class71() {
      this.field813 = -1;
      this.field816 = 128;
      this.field821 = 128;
      this.field822 = 0;
      this.field823 = 0;
      this.field815 = 0;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "16711680"
   )
   void method1527(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method1534(var1, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)Lds;",
      garbageValue = "0"
   )
   public final class52 method1529(int var1) {
      class52 var2 = (class52)field812.method1813((long)this.field820);
      if(var2 == null) {
         class34 var3 = class34.method540(class95.field1027, this.field814, 0);
         if(var3 == null) {
            return null;
         }

         int var4;
         if(this.field810 != null) {
            for(var4 = 0; var4 < this.field810.length; ++var4) {
               var3.method552(this.field810[var4], this.field817[var4]);
            }
         }

         if(this.field818 != null) {
            for(var4 = 0; var4 < this.field818.length; ++var4) {
               var3.method553(this.field818[var4], this.field819[var4]);
            }
         }

         var2 = var3.method573(this.field823 + 64, this.field815 + 850, -30, -50, -30);
         field812.method1820(var2, (long)this.field820);
      }

      class52 var5;
      if(this.field813 != -1 && var1 != -1) {
         var5 = class3.method74(this.field813).method6105(var2, var1, (byte)-1);
      } else {
         var5 = var2.method1123(true);
      }

      if(this.field816 != 128 || this.field821 != 128) {
         var5.method1172(this.field816, this.field821, this.field816);
      }

      if(this.field822 != 0) {
         if(this.field822 == 90) {
            var5.method1179();
         }

         if(this.field822 == 180) {
            var5.method1179();
            var5.method1179();
         }

         if(this.field822 == 270) {
            var5.method1179();
            var5.method1179();
            var5.method1179();
         }
      }

      return var5;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "1752020775"
   )
   void method1534(Buffer var1, int var2) {
      if(var2 == 1) {
         this.field814 = var1.readShort();
      } else if(var2 == 2) {
         this.field813 = var1.readShort();
      } else if(var2 == 4) {
         this.field816 = var1.readShort();
      } else if(var2 == 5) {
         this.field821 = var1.readShort();
      } else if(var2 == 6) {
         this.field822 = var1.readShort();
      } else if(var2 == 7) {
         this.field823 = var1.readUnsignedByte();
      } else if(var2 == 8) {
         this.field815 = var1.readUnsignedByte();
      } else {
         int var3;
         int var4;
         if(var2 == 40) {
            var3 = var1.readUnsignedByte();
            this.field810 = new short[var3];
            this.field817 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field810[var4] = (short)var1.readShort();
               this.field817[var4] = (short)var1.readShort();
            }
         } else if(var2 == 41) {
            var3 = var1.readUnsignedByte();
            this.field818 = new short[var3];
            this.field819 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field818[var4] = (short)var1.readShort();
               this.field819[var4] = (short)var1.readShort();
            }
         }
      }

   }
}
