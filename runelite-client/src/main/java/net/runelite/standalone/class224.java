package net.runelite.standalone;

import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
public class class224 extends class324 {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class217 field3033;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class100 field3012;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class217 field3016;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class100 field3014;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class100 field3013;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class217 field3011;
   @ObfuscatedName("aj")
   static GarbageCollectorMXBean field3018;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 47667953
   )
   int field3023;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 722130559
   )
   public int field3031;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -408333299
   )
   int field3019;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 367417065
   )
   public int field3030;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -599911367
   )
   public int field3027;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 215749425
   )
   public int field3028;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1194857713
   )
   int field3020;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -809808179
   )
   int field3029;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1566372213
   )
   int field3024;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1681926631
   )
   public int field3026;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1275432689
   )
   public int field3021;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1908299319
   )
   int field3034;
   @ObfuscatedName("o")
   String field3022;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -560163707
   )
   int field3009;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -715394499
   )
   public int field3010;
   @ObfuscatedName("q")
   public int[] field3025;

   static {
      field3012 = new class100(64);
      field3013 = new class100(64);
      field3014 = new class100(20);
   }

   class224() {
      this.field3019 = -1;
      this.field3026 = 16777215;
      this.field3021 = 70;
      this.field3009 = -1;
      this.field3023 = -1;
      this.field3024 = -1;
      this.field3020 = -1;
      this.field3010 = 0;
      this.field3027 = 0;
      this.field3028 = -1;
      this.field3022 = "";
      this.field3030 = -1;
      this.field3031 = 0;
      this.field3029 = -1;
      this.field3034 = -1;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)Llp;",
      garbageValue = "-1159767687"
   )
   public SpritePixels method4529() {
      if(this.field3023 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field3013.method1813((long)this.field3023);
         if(var1 != null) {
            return var1;
         } else {
            var1 = class91.method1715(field3033, this.field3023, 0, (byte)-18);
            if(var1 != null) {
               field3013.method1820(var1, (long)this.field3023);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)Llp;",
      garbageValue = "-2031586191"
   )
   public SpritePixels method4534() {
      if(this.field3009 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field3013.method1813((long)this.field3009);
         if(var1 != null) {
            return var1;
         } else {
            var1 = class91.method1715(field3033, this.field3009, 0, (byte)53);
            if(var1 != null) {
               field3013.method1820(var1, (long)this.field3009);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "-1827082512"
   )
   void method4524(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method4525(var1, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)Ljz;",
      garbageValue = "-1754548787"
   )
   public final class224 method4553() {
      int var1 = -1;
      if(this.field3029 != -1) {
         var1 = class259.method5178(this.field3029);
      } else if(this.field3034 != -1) {
         var1 = class81.field898[this.field3034];
      }

      int var2;
      if(var1 >= 0 && var1 < this.field3025.length - 1) {
         var2 = this.field3025[var1];
      } else {
         var2 = this.field3025[this.field3025.length - 1];
      }

      return var2 != -1?class229.method4609(var2):null;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(B)Llp;",
      garbageValue = "45"
   )
   public SpritePixels method4530() {
      if(this.field3024 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field3013.method1813((long)this.field3024);
         if(var1 != null) {
            return var1;
         } else {
            var1 = class91.method1715(field3033, this.field3024, 0, (byte)-28);
            if(var1 != null) {
               field3013.method1820(var1, (long)this.field3024);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)Llp;",
      garbageValue = "-28"
   )
   public SpritePixels method4528() {
      if(this.field3020 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field3013.method1813((long)this.field3020);
         if(var1 != null) {
            return var1;
         } else {
            var1 = class91.method1715(field3033, this.field3020, 0, (byte)-93);
            if(var1 != null) {
               field3013.method1820(var1, (long)this.field3020);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)Lkn;",
      garbageValue = "-1074151775"
   )
   public class299 method4540() {
      if(this.field3019 == -1) {
         return null;
      } else {
         class299 var1 = (class299)field3014.method1813((long)this.field3019);
         if(var1 != null) {
            return var1;
         } else {
            var1 = class314.method6147(field3033, field3011, this.field3019, 0);
            if(var1 != null) {
               field3014.method1820(var1, (long)this.field3019);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(II)Ljava/lang/String;",
      garbageValue = "-1423533395"
   )
   public String method4527(int var1) {
      String var2 = this.field3022;

      while(true) {
         int var3 = var2.indexOf("%1");
         if(var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + class73.method1557(var1, false) + var2.substring(var3 + 2);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "457061005"
   )
   void method4525(Buffer var1, int var2) {
      if(var2 == 1) {
         this.field3019 = var1.method2293();
      } else if(var2 == 2) {
         this.field3026 = var1.method2260();
      } else if(var2 == 3) {
         this.field3009 = var1.method2293();
      } else if(var2 == 4) {
         this.field3024 = var1.method2293();
      } else if(var2 == 5) {
         this.field3023 = var1.method2293();
      } else if(var2 == 6) {
         this.field3020 = var1.method2293();
      } else if(var2 == 7) {
         this.field3010 = var1.method2456();
      } else if(var2 == 8) {
         this.field3022 = var1.method2266();
      } else if(var2 == 9) {
         this.field3021 = var1.readShort();
      } else if(var2 == 10) {
         this.field3027 = var1.method2456();
      } else if(var2 == 11) {
         this.field3028 = 0;
      } else if(var2 == 12) {
         this.field3030 = var1.readUnsignedByte();
      } else if(var2 == 13) {
         this.field3031 = var1.method2456();
      } else if(var2 == 14) {
         this.field3028 = var1.readShort();
      } else if(var2 == 17 || var2 == 18) {
         this.field3029 = var1.readShort();
         if(this.field3029 == 65535) {
            this.field3029 = -1;
         }

         this.field3034 = var1.readShort();
         if(this.field3034 == 65535) {
            this.field3034 = -1;
         }

         int var3 = -1;
         if(var2 == 18) {
            var3 = var1.readShort();
            if(var3 == 65535) {
               var3 = -1;
            }
         }

         int var4 = var1.readUnsignedByte();
         this.field3025 = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.field3025[var5] = var1.readShort();
            if(this.field3025[var5] == 65535) {
               this.field3025[var5] = -1;
            }
         }

         this.field3025[var4 + 1] = var3;
      }

   }
}
