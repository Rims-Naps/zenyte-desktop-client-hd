package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
public class class223 extends class193 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   static class148 field2175;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   static class148 field2184;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class124 field2179;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1747557355
   )
   public static int field2176;
   @ObfuscatedName("m")
   short[] field2178;
   @ObfuscatedName("z")
   public boolean field2186;
   @ObfuscatedName("r")
   short[] field2183;
   @ObfuscatedName("p")
   short[] field2182;
   @ObfuscatedName("c")
   short[] field2181;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -379490503
   )
   public int field2177;
   @ObfuscatedName("a")
   int[] field2180;
   @ObfuscatedName("d")
   int[] field2185;

   static {
      field2179 = new class124(64);
   }

   class223() {
      this.field2177 = -1;
      this.field2185 = new int[]{-1, -1, -1, -1, -1};
      this.field2186 = false;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(B)Ldb;",
      garbageValue = "24"
   )
   public class218 method4012() {
      class218[] var1 = new class218[5];
      int var2 = 0;

      for(int var3 = 0; var3 < 5; ++var3) {
         if(this.field2185[var3] != -1) {
            var1[var2++] = class218.method3830(field2184, this.field2185[var3], 0);
         }
      }

      class218 var5 = new class218(var1, var2);
      int var4;
      if(this.field2181 != null) {
         for(var4 = 0; var4 < this.field2181.length; ++var4) {
            var5.method3842(this.field2181[var4], this.field2182[var4]);
         }
      }

      if(this.field2183 != null) {
         for(var4 = 0; var4 < this.field2183.length; ++var4) {
            var5.method3843(this.field2183[var4], this.field2178[var4]);
         }
      }

      return var5;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-73"
   )
   public boolean method3994() {
      boolean var1 = true;

      for(int var2 = 0; var2 < 5; ++var2) {
         if(this.field2185[var2] != -1 && !field2184.method2649(this.field2185[var2], 0)) {
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
   public class218 method3993() {
      if(this.field2180 == null) {
         return null;
      } else {
         class218[] var1 = new class218[this.field2180.length];

         for(int var2 = 0; var2 < this.field2180.length; ++var2) {
            var1[var2] = class218.method3830(field2184, this.field2180[var2], 0);
         }

         class218 var4;
         if(var1.length == 1) {
            var4 = var1[0];
         } else {
            var4 = new class218(var1, var1.length);
         }

         int var3;
         if(this.field2181 != null) {
            for(var3 = 0; var3 < this.field2181.length; ++var3) {
               var4.method3842(this.field2181[var3], this.field2182[var3]);
            }
         }

         if(this.field2183 != null) {
            for(var3 = 0; var3 < this.field2183.length; ++var3) {
               var4.method3843(this.field2183[var3], this.field2178[var3]);
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-39"
   )
   public boolean method3992() {
      if(this.field2180 == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.field2180.length; ++var2) {
            if(!field2184.method2649(this.field2180[var2], 0)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "1916457781"
   )
   void method3991(Buffer var1, int var2) {
      if(var2 == 1) {
         this.field2177 = var1.readUnsignedByte();
      } else {
         int var3;
         int var4;
         if(var2 == 2) {
            var3 = var1.readUnsignedByte();
            this.field2180 = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field2180[var4] = var1.readUnsignedShort();
            }
         } else if(var2 == 3) {
            this.field2186 = true;
         } else if(var2 == 40) {
            var3 = var1.readUnsignedByte();
            this.field2181 = new short[var3];
            this.field2182 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field2181[var4] = (short)var1.readUnsignedShort();
               this.field2182[var4] = (short)var1.readUnsignedShort();
            }
         } else if(var2 == 41) {
            var3 = var1.readUnsignedByte();
            this.field2183 = new short[var3];
            this.field2178 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field2183[var4] = (short)var1.readUnsignedShort();
               this.field2178[var4] = (short)var1.readUnsignedShort();
            }
         } else if(var2 >= 60 && var2 < 70) {
            this.field2185[var2 - 60] = var1.readUnsignedShort();
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "-82628385"
   )
   void method3990(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method3991(var1, var2);
      }
   }

   @ObfuscatedName("ed")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "187708412"
   )
   static final void method3995() {
      if(client.field3877 > 0) {
         class80.method1219();
      } else {
         client.field3977.method714();
         class188.method3239(40);
         ClientProt.field574 = client.field3963.method2248();
         client.field3963.method2238();
      }
   }
}
