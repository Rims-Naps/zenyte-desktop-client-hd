package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
public class class241 extends class324 {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   static class217 field3153;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class100 field3148;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   static class217 field3144;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1747557355
   )
   public static int field3145;
   @ObfuscatedName("z")
   public boolean field3155;
   @ObfuscatedName("p")
   short[] field3151;
   @ObfuscatedName("c")
   short[] field3150;
   @ObfuscatedName("r")
   short[] field3152;
   @ObfuscatedName("m")
   short[] field3147;
   @ObfuscatedName("d")
   int[] field3154;
   @ObfuscatedName("a")
   int[] field3149;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -379490503
   )
   public int field3146;

   static {
      field3148 = new class100(64);
   }

   class241() {
      this.field3146 = -1;
      this.field3154 = new int[]{-1, -1, -1, -1, -1};
      this.field3155 = false;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-73"
   )
   public boolean method4743() {
      boolean var1 = true;

      for(int var2 = 0; var2 < 5; ++var2) {
         if(this.field3154[var2] != -1 && !field3153.method4468(this.field3154[var2], 0)) {
            var1 = false;
         }
      }

      return var1;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)Ldb;",
      garbageValue = "1923257969"
   )
   public class34 method4742() {
      if(this.field3149 == null) {
         return null;
      } else {
         class34[] var1 = new class34[this.field3149.length];

         for(int var2 = 0; var2 < this.field3149.length; ++var2) {
            var1[var2] = class34.method540(field3153, this.field3149[var2], 0);
         }

         class34 var4;
         if(var1.length == 1) {
            var4 = var1[0];
         } else {
            var4 = new class34(var1, var1.length);
         }

         int var3;
         if(this.field3150 != null) {
            for(var3 = 0; var3 < this.field3150.length; ++var3) {
               var4.method552(this.field3150[var3], this.field3151[var3]);
            }
         }

         if(this.field3152 != null) {
            for(var3 = 0; var3 < this.field3152.length; ++var3) {
               var4.method553(this.field3152[var3], this.field3147[var3]);
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "1916457781"
   )
   void method4740(class125 var1, int var2) {
      if(var2 == 1) {
         this.field3146 = var1.method2256();
      } else {
         int var3;
         int var4;
         if(var2 == 2) {
            var3 = var1.method2256();
            this.field3149 = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3149[var4] = var1.method2258();
            }
         } else if(var2 == 3) {
            this.field3155 = true;
         } else if(var2 == 40) {
            var3 = var1.method2256();
            this.field3150 = new short[var3];
            this.field3151 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3150[var4] = (short)var1.method2258();
               this.field3151[var4] = (short)var1.method2258();
            }
         } else if(var2 == 41) {
            var3 = var1.method2256();
            this.field3152 = new short[var3];
            this.field3147 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3152[var4] = (short)var1.method2258();
               this.field3147[var4] = (short)var1.method2258();
            }
         } else if(var2 >= 60 && var2 < 70) {
            this.field3154[var2 - 60] = var1.method2258();
         }
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(B)Ldb;",
      garbageValue = "24"
   )
   public class34 method4761() {
      class34[] var1 = new class34[5];
      int var2 = 0;

      for(int var3 = 0; var3 < 5; ++var3) {
         if(this.field3154[var3] != -1) {
            var1[var2++] = class34.method540(field3153, this.field3154[var3], 0);
         }
      }

      class34 var5 = new class34(var1, var2);
      int var4;
      if(this.field3150 != null) {
         for(var4 = 0; var4 < this.field3150.length; ++var4) {
            var5.method552(this.field3150[var4], this.field3151[var4]);
         }
      }

      if(this.field3152 != null) {
         for(var4 = 0; var4 < this.field3152.length; ++var4) {
            var5.method553(this.field3152[var4], this.field3147[var4]);
         }
      }

      return var5;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-39"
   )
   public boolean method4741() {
      if(this.field3149 == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.field3149.length; ++var2) {
            if(!field3153.method4468(this.field3149[var2], 0)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "-82628385"
   )
   void method4739(class125 var1) {
      while(true) {
         int var2 = var1.method2256();
         if(var2 == 0) {
            return;
         }

         this.method4740(var1, var2);
      }
   }

   @ObfuscatedName("ed")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "187708412"
   )
   static final void method4744() {
      if(client.field2298 > 0) {
         class310.method6085();
      } else {
         client.field2398.method1215();
         class142.method2635(40);
         ClientProt.field3259 = client.field2384.method2586();
         client.field2384.method2576();
      }
   }
}
