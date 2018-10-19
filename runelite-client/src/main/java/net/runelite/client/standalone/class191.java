package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSArea;
import net.runelite.rs.api.RSSpritePixels;

@ObfuscatedName("if")
public class class191 extends class193 implements RSArea {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   static class148 field1824;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "[Lif;"
   )
   static class191[] field1833;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   public static class124 field1819;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1616296645
   )
   public static int field1816;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1039843319
   )
   int field1830;
   @ObfuscatedName("v")
   int[] field1828;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   public class264 field1820;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 270833919
   )
   public int field1825;
   @ObfuscatedName("z")
   public String[] field1834;
   @ObfuscatedName("h")
   int[] field1823;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 435503137
   )
   public int field1818;
   @ObfuscatedName("p")
   public String field1821;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -19355185
   )
   int field1832;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 776129755
   )
   int field1822;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1245579525
   )
   public final int field1835;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1583839267
   )
   int field1831;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Ljp;"
   )
   public class198 field1826;
   @ObfuscatedName("x")
   public String field1827;
   @ObfuscatedName("o")
   byte[] field1836;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -531879739
   )
   public int field1817;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1808309051
   )
   int field1829;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 192841577
   )
   public int field1837;

   static {
      field1819 = new class124(256);
   }

   class191(int var1) {
      this.field1817 = -1;
      this.field1822 = -1;
      this.field1825 = 0;
      this.field1834 = new String[5];
      this.field1829 = Integer.MAX_VALUE;
      this.field1830 = Integer.MAX_VALUE;
      this.field1831 = Integer.MIN_VALUE;
      this.field1832 = Integer.MIN_VALUE;
      this.field1826 = class198.field1865;
      this.field1820 = class264.field2913;
      this.field1837 = -1;
      this.field1835 = var1;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1953465964"
   )
   public int method3268() {
      return this.field1835;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(II)Llp;",
      garbageValue = "14202468"
   )
   class26 method3267(int var1) {
      if(var1 < 0) {
         return null;
      } else {
         class26 var2 = (class26)field1819.method2268((long)var1);
         if(var2 != null) {
            return var2;
         } else {
            var2 = class225.method4022(field1824, var1, 0, (byte)88);
            if(var2 != null) {
               field1819.method2275(var2, (long)var1);
            }

            return var2;
         }
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(ZI)Llp;",
      garbageValue = "-1385555038"
   )
   public class26 method3266(boolean var1) {
      int var2 = var1?this.field1822:this.field1817;
      return this.method3267(var2);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1492289506"
   )
   void method3265() {
      if(this.field1828 != null) {
         for(int var1 = 0; var1 < this.field1828.length; var1 += 2) {
            if(this.field1828[var1] < this.field1829) {
               this.field1829 = this.field1828[var1];
            } else if(this.field1828[var1] > this.field1831) {
               this.field1831 = this.field1828[var1];
            }

            if(this.field1828[var1 + 1] < this.field1830) {
               this.field1830 = this.field1828[var1 + 1];
            } else if(this.field1828[var1 + 1] > this.field1832) {
               this.field1832 = this.field1828[var1 + 1];
            }
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "2104259651"
   )
   void method3264(Buffer var1, int var2) {
      if(var2 == 1) {
         this.field1817 = var1.method1942();
      } else if(var2 == 2) {
         this.field1822 = var1.method1942();
      } else if(var2 == 3) {
         this.field1821 = var1.readString();
      } else if(var2 == 4) {
         this.field1818 = var1.method1909();
      } else if(var2 == 5) {
         var1.method1909();
      } else if(var2 == 6) {
         this.field1825 = var1.readUnsignedByte();
      } else {
         int var3;
         if(var2 == 7) {
            var3 = var1.readUnsignedByte();
            if((var3 & 1) == 0) {
               ;
            }

            if((var3 & 2) == 2) {
               ;
            }
         } else if(var2 == 8) {
            var1.readUnsignedByte();
         } else if(var2 >= 10 && var2 <= 14) {
            this.field1834[var2 - 10] = var1.readString();
         } else if(var2 == 15) {
            var3 = var1.readUnsignedByte();
            this.field1828 = new int[var3 * 2];

            int var4;
            for(var4 = 0; var4 < var3 * 2; ++var4) {
               this.field1828[var4] = var1.readShort();
            }

            var1.readInt();
            var4 = var1.readUnsignedByte();
            this.field1823 = new int[var4];

            int var5;
            for(var5 = 0; var5 < this.field1823.length; ++var5) {
               this.field1823[var5] = var1.readInt();
            }

            this.field1836 = new byte[var3];

            for(var5 = 0; var5 < var3; ++var5) {
               this.field1836[var5] = var1.method1906();
            }
         } else if(var2 != 16) {
            if(var2 == 17) {
               this.field1827 = var1.readString();
            } else if(var2 == 18) {
               var1.method1942();
            } else if(var2 == 19) {
               this.field1837 = var1.readUnsignedShort();
            } else if(var2 == 21) {
               var1.readInt();
            } else if(var2 == 22) {
               var1.readInt();
            } else if(var2 == 23) {
               var1.readUnsignedByte();
               var1.readUnsignedByte();
               var1.readUnsignedByte();
            } else if(var2 == 24) {
               var1.readShort();
               var1.readShort();
            } else if(var2 == 25) {
               var1.method1942();
            } else if(var2 == 28) {
               var1.readUnsignedByte();
            } else if(var2 == 29) {
               class198[] var6 = new class198[]{class198.field1865, class198.field1869, class198.field1866};
               this.field1826 = (class198)class297.method5176(var6, var1.readUnsignedByte());
            } else if(var2 == 30) {
               class264[] var7 = new class264[]{class264.field2915, class264.field2917, class264.field2913};
               this.field1820 = (class264)class297.method5176(var7, var1.readUnsignedByte());
            }
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "-479665182"
   )
   void method3263(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method3264(var1, var2);
      }
   }

   public RSSpritePixels getMapIcon(boolean var1) {
      return this.method3266(var1);
   }
}
