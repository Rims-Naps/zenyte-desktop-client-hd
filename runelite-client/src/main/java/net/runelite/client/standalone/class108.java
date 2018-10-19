package net.runelite.client.standalone;

import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSIndexData;

@ObfuscatedName("im")
public class class108 extends class148 implements RSIndexData {
   @ObfuscatedName("af")
   static CRC32 field1003;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 497704231
   )
   int field1002;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1276342047
   )
   int field999;
   @ObfuscatedName("ag")
   volatile boolean[] field1005;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 157898609
   )
   int field1004;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lfi;"
   )
   class281 field997;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Lfi;"
   )
   class281 field1006;
   @ObfuscatedName("y")
   volatile boolean field1000;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1414234227
   )
   int field998;
   @ObfuscatedName("av")
   boolean field1001;

   static {
      field1003 = new CRC32();
   }

   @ObfuscatedSignature(
      signature = "(Lfi;Lfi;IZZZ)V"
   )
   public class108(class281 var1, class281 var2, int var3, boolean var4, boolean var5, boolean var6) {
      super(var4, var5);
      this.field1000 = false;
      this.field1001 = false;
      this.field1002 = -1;
      this.field1006 = var1;
      this.field997 = var2;
      this.field999 = var3;
      this.field1001 = var6;
      int var8 = this.field999;
      if(class302.field3240 != null) {
         class302.field3240.field1073 = var8 * 8 + 5;
         int var9 = class302.field3240.readInt();
         int var10 = class302.field3240.readInt();
         this.method1825(var9, var10);
      } else {
         class189.method3253((class108)null, 255, 255, 0, (byte)0, true);
         class270.field2969[var8] = this;
      }

   }

   @ObfuscatedName("dm")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1365269897"
   )
   public void method1825(int var1, int var2) {
      this.field1004 = var1;
      this.field998 = var2;
      if(this.field997 != null) {
         int var3 = this.field999;
         class281 var4 = this.field997;
         byte[] var6 = null;
         class320 var7 = class94.field895;
         synchronized(class94.field895) {
            for(class167 var8 = (class167)class94.field895.method5604(); var8 != null; var8 = (class167)class94.field895.method5606()) {
               if((long)var3 == var8.field704 && var4 == var8.field1540 && var8.field1542 == 0) {
                  var6 = var8.field1541;
                  break;
               }
            }
         }

         if(var6 != null) {
            this.method1799(var4, var3, var6, true);
         } else {
            byte[] var11 = var4.method5000(var3);
            this.method1799(var4, var3, var11, true);
         }
      } else {
         class189.method3253(this, 255, this.field999, this.field1004, (byte)0, true);
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1205100077"
   )
   void vmethod2611(int var1) {
      if(this.field1006 != null && this.field1005 != null && this.field1005[var1]) {
         class281 var2 = this.field1006;
         byte[] var4 = null;
         class320 var5 = class94.field895;
         synchronized(class94.field895) {
            for(class167 var6 = (class167)class94.field895.method5604(); var6 != null; var6 = (class167)class94.field895.method5606()) {
               if(var6.field704 == (long)var1 && var2 == var6.field1540 && var6.field1542 == 0) {
                  var4 = var6.field1541;
                  break;
               }
            }
         }

         if(var4 != null) {
            this.method1799(var2, var1, var4, true);
         } else {
            byte[] var9 = var2.method5000(var1);
            this.method1799(var2, var1, var9, true);
         }
      } else {
         class189.method3253(this, this.field999, var1, super.field1413[var1], (byte)2, true);
      }

   }

   @ObfuscatedName("dy")
   @ObfuscatedSignature(
      signature = "(I[BZZI)V",
      garbageValue = "-1612597775"
   )
   public void method1798(int var1, byte[] var2, boolean var3, boolean var4) {
      if(var3) {
         if(this.field1000) {
            throw new RuntimeException();
         }

         if(this.field997 != null) {
            int var5 = this.field999;
            class281 var6 = this.field997;
            class167 var7 = new class167();
            var7.field1542 = 0;
            var7.field704 = (long)var5;
            var7.field1541 = var2;
            var7.field1540 = var6;
            class320 var8 = class94.field895;
            synchronized(class94.field895) {
               class94.field895.method5600(var7);
            }

            class187.method3228();
         }

         this.method2577(var2);
         this.method1818();
      } else {
         var2[var2.length - 2] = (byte)(super.field1414[var1] >> 8);
         var2[var2.length - 1] = (byte)super.field1414[var1];
         if(this.field1006 != null) {
            class281 var11 = this.field1006;
            class167 var14 = new class167();
            var14.field1542 = 0;
            var14.field704 = (long)var1;
            var14.field1541 = var2;
            var14.field1540 = var11;
            class320 var15 = class94.field895;
            synchronized(class94.field895) {
               class94.field895.method5600(var14);
            }

            class187.method3228();
            this.field1005[var1] = true;
         }

         if(var4) {
            super.field1419[var1] = class164.method2815(var2, false);
         }
      }

   }

   @ObfuscatedName("da")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "-1282766272"
   )
   public boolean method1803(int var1) {
      return this.method2656(var1) != null;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "0"
   )
   int vmethod2585(int var1) {
      if(super.field1419[var1] != null) {
         return 100;
      } else if(this.field1005[var1]) {
         return 100;
      } else {
         int var3 = this.field999;
         long var4 = (long)((var3 << 16) + var1);
         int var2;
         if(class270.field2965 != null && var4 == class270.field2965.field704) {
            var2 = class57.field455.field1073 * 99 / (class57.field455.field1074.length - class270.field2965.field3725) + 1;
         } else {
            var2 = 0;
         }

         return var2;
      }
   }

   @ObfuscatedName("dn")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "59"
   )
   void method1818() {
      this.field1005 = new boolean[super.field1419.length];

      int var1;
      for(var1 = 0; var1 < this.field1005.length; ++var1) {
         this.field1005[var1] = false;
      }

      if(this.field1006 == null) {
         this.field1000 = true;
      } else {
         this.field1002 = -1;

         for(var1 = 0; var1 < this.field1005.length; ++var1) {
            if(super.field1422[var1] > 0) {
               class281 var2 = this.field1006;
               class167 var4 = new class167();
               var4.field1542 = 1;
               var4.field704 = (long)var1;
               var4.field1540 = var2;
               var4.field1543 = this;
               class320 var5 = class94.field895;
               synchronized(class94.field895) {
                  class94.field895.method5600(var4);
               }

               class187.method3228();
               this.field1002 = var1;
            }
         }

         if(this.field1002 == -1) {
            this.field1000 = true;
         }

      }
   }

   @ObfuscatedName("dv")
   @ObfuscatedSignature(
      signature = "(Lfi;I[BZI)V",
      garbageValue = "1100028617"
   )
   void method1799(class281 var1, int var2, byte[] var3, boolean var4) {
      int var5;
      if(var1 == this.field997) {
         if(this.field1000) {
            throw new RuntimeException();
         }

         if(var3 == null) {
            class189.method3253(this, 255, this.field999, this.field1004, (byte)0, true);
            return;
         }

         field1003.reset();
         field1003.update(var3, 0, var3.length);
         var5 = (int)field1003.getValue();
         if(var5 != this.field1004) {
            class189.method3253(this, 255, this.field999, this.field1004, (byte)0, true);
            return;
         }

         Buffer var9 = new Buffer(class177.method2968(var3));
         int var7 = var9.readUnsignedByte();
         if(var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field999 + "," + var2);
         }

         int var8 = 0;
         if(var7 >= 6) {
            var8 = var9.readInt();
         }

         if(var8 != this.field998) {
            class189.method3253(this, 255, this.field999, this.field1004, (byte)0, true);
            return;
         }

         this.method2577(var3);
         this.method1818();
      } else {
         if(!var4 && var2 == this.field1002) {
            this.field1000 = true;
         }

         if(var3 == null || var3.length <= 2) {
            this.field1005[var2] = false;
            if(this.field1001 || var4) {
               class189.method3253(this, this.field999, var2, super.field1413[var2], (byte)2, var4);
            }

            return;
         }

         field1003.reset();
         field1003.update(var3, 0, var3.length - 2);
         var5 = (int)field1003.getValue();
         int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
         if(var5 != super.field1413[var2] || var6 != super.field1414[var2]) {
            this.field1005[var2] = false;
            if(this.field1001 || var4) {
               class189.method3253(this, this.field999, var2, super.field1413[var2], (byte)2, var4);
            }

            return;
         }

         this.field1005[var2] = true;
         if(var4) {
            super.field1419[var2] = class164.method2815(var3, false);
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "545333176"
   )
   void vmethod2578(int var1) {
      int var2 = this.field999;
      long var3 = (long)((var2 << 16) + var1);
      class332 var5 = (class332)class270.field2958.method5310(var3);
      if(var5 != null) {
         class270.field2959.method2469(var5);
      }

   }

   @ObfuscatedName("do")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "-2134918163"
   )
   public boolean method1802(int var1) {
      return this.field1005[var1];
   }

   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "1"
   )
   public boolean method1793() {
      return this.field1000;
   }

   @ObfuscatedName("dr")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "86"
   )
   public int method1792() {
      int var1 = 0;
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < super.field1419.length; ++var3) {
         if(super.field1422[var3] > 0) {
            var1 += 100;
            var2 += this.vmethod2585(var3);
         }
      }

      if(var1 == 0) {
         return 100;
      } else {
         var3 = var2 * 100 / var1;
         return var3;
      }
   }

   @ObfuscatedName("dd")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-637071204"
   )
   public int method1808() {
      if(this.field1000) {
         return 100;
      } else if(super.field1419 != null) {
         return 99;
      } else {
         int var2 = this.field999;
         long var3 = (long)(var2 + 16711680);
         int var1;
         if(class270.field2965 != null && class270.field2965.field704 == var3) {
            var1 = class57.field455.field1073 * 99 / (class57.field455.field1074.length - class270.field2965.field3725) + 1;
         } else {
            var1 = 0;
         }

         int var5 = var1;
         if(var1 >= 100) {
            var5 = 99;
         }

         return var5;
      }
   }

   public int getIndex() {
      return this.field999;
   }
}
