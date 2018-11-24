package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSArea;
import net.runelite.rs.api.RSSpritePixels;

@ObfuscatedName("if")
public class class123 extends class324 implements RSArea {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "[Lif;"
   )
   static class123[] field1680;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   public static class100 field1666;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   static class217 field1671;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1616296645
   )
   public static int field1663;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1039843319
   )
   int field1677;
   @ObfuscatedName("z")
   public String[] field1681;
   @ObfuscatedName("p")
   public String field1668;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 192841577
   )
   public int field1684;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 776129755
   )
   int field1669;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   public class63 field1667;
   @ObfuscatedName("h")
   int[] field1670;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 435503137
   )
   public int field1665;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -19355185
   )
   int field1679;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 270833919
   )
   public int field1672;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1583839267
   )
   int field1678;
   @ObfuscatedName("x")
   public String field1674;
   @ObfuscatedName("v")
   int[] field1675;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -531879739
   )
   public int field1664;
   @ObfuscatedName("o")
   byte[] field1683;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1808309051
   )
   int field1676;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Ljp;"
   )
   public class30 field1673;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1245579525
   )
   public final int field1682;

   static {
      field1666 = new class100(256);
   }

   class123(int var1) {
      this.field1664 = -1;
      this.field1669 = -1;
      this.field1672 = 0;
      this.field1681 = new String[5];
      this.field1676 = Integer.MAX_VALUE;
      this.field1677 = Integer.MAX_VALUE;
      this.field1678 = Integer.MIN_VALUE;
      this.field1679 = Integer.MIN_VALUE;
      this.field1673 = class30.field283;
      this.field1667 = class63.field738;
      this.field1684 = -1;
      this.field1682 = var1;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(II)Llp;",
      garbageValue = "14202468"
   )
   SpritePixels method2203(int var1) {
      if(var1 < 0) {
         return null;
      } else {
         SpritePixels var2 = (SpritePixels)field1666.method1813((long)var1);
         if(var2 != null) {
            return var2;
         } else {
            var2 = class91.method1715(field1671, var1, 0, (byte)88);
            if(var2 != null) {
               field1666.method1820(var2, (long)var1);
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
   public SpritePixels method2202(boolean var1) {
      int var2 = var1?this.field1669:this.field1664;
      return this.method2203(var2);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "2104259651"
   )
   void method2200(class125 var1, int var2) {
      if(var2 == 1) {
         this.field1664 = var1.method2293();
      } else if(var2 == 2) {
         this.field1669 = var1.method2293();
      } else if(var2 == 3) {
         this.field1668 = var1.method2265();
      } else if(var2 == 4) {
         this.field1665 = var1.method2260();
      } else if(var2 == 5) {
         var1.method2260();
      } else if(var2 == 6) {
         this.field1672 = var1.method2256();
      } else {
         int var3;
         if(var2 == 7) {
            var3 = var1.method2256();
            if((var3 & 1) == 0) {
               ;
            }

            if((var3 & 2) == 2) {
               ;
            }
         } else if(var2 == 8) {
            var1.method2256();
         } else if(var2 >= 10 && var2 <= 14) {
            this.field1681[var2 - 10] = var1.method2265();
         } else if(var2 == 15) {
            var3 = var1.method2256();
            this.field1675 = new int[var3 * 2];

            int var4;
            for(var4 = 0; var4 < var3 * 2; ++var4) {
               this.field1675[var4] = var1.method2456();
            }

            var1.method2344();
            var4 = var1.method2256();
            this.field1670 = new int[var4];

            int var5;
            for(var5 = 0; var5 < this.field1670.length; ++var5) {
               this.field1670[var5] = var1.method2344();
            }

            this.field1683 = new byte[var3];

            for(var5 = 0; var5 < var3; ++var5) {
               this.field1683[var5] = var1.method2257();
            }
         } else if(var2 != 16) {
            if(var2 == 17) {
               this.field1674 = var1.method2265();
            } else if(var2 == 18) {
               var1.method2293();
            } else if(var2 == 19) {
               this.field1684 = var1.method2258();
            } else if(var2 == 21) {
               var1.method2344();
            } else if(var2 == 22) {
               var1.method2344();
            } else if(var2 == 23) {
               var1.method2256();
               var1.method2256();
               var1.method2256();
            } else if(var2 == 24) {
               var1.method2456();
               var1.method2456();
            } else if(var2 == 25) {
               var1.method2293();
            } else if(var2 == 28) {
               var1.method2256();
            } else if(var2 == 29) {
               class30[] var6 = new class30[]{class30.field283, class30.field287, class30.field284};
               this.field1673 = (class30)class38.method678(var6, var1.method2256());
            } else if(var2 == 30) {
               class63[] var7 = new class63[]{class63.field740, class63.field742, class63.field738};
               this.field1667 = (class63)class38.method678(var7, var1.method2256());
            }
         }
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1953465964"
   )
   public int method2204() {
      return this.field1682;
   }

   public RSSpritePixels getMapIcon(boolean var1) {
      return this.method2202(var1);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1492289506"
   )
   void method2201() {
      if(this.field1675 != null) {
         for(int var1 = 0; var1 < this.field1675.length; var1 += 2) {
            if(this.field1675[var1] < this.field1676) {
               this.field1676 = this.field1675[var1];
            } else if(this.field1675[var1] > this.field1678) {
               this.field1678 = this.field1675[var1];
            }

            if(this.field1675[var1 + 1] < this.field1677) {
               this.field1677 = this.field1675[var1 + 1];
            } else if(this.field1675[var1 + 1] > this.field1679) {
               this.field1679 = this.field1675[var1 + 1];
            }
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "-479665182"
   )
   void method2199(class125 var1) {
      while(true) {
         int var2 = var1.method2256();
         if(var2 == 0) {
            return;
         }

         this.method2200(var1, var2);
      }
   }
}
