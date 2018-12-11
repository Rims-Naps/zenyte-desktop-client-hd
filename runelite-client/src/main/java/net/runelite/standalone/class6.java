package net.runelite.standalone;

import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSIndexData;

@ObfuscatedName("im")
public class class6 extends Js5Index implements RSIndexData {
   @ObfuscatedName("af")
   static CRC32 field84;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lfi;"
   )
   class263 field78;
   @ObfuscatedName("ag")
   volatile boolean[] field86;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 497704231
   )
   int field83;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Lfi;"
   )
   class263 field87;
   @ObfuscatedName("y")
   volatile boolean field81;
   @ObfuscatedName("av")
   boolean field82;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1414234227
   )
   int field79;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1276342047
   )
   int field80;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 157898609
   )
   int field85;

   static {
      field84 = new CRC32();
   }

   @ObfuscatedSignature(
      signature = "(Lfi;Lfi;IZZZ)V"
   )
   public class6(class263 var1, class263 var2, int var3, boolean var4, boolean var5, boolean var6) {
      super(var4, var5);
      this.field81 = false;
      this.field82 = false;
      this.field83 = -1;
      this.field87 = var1;
      this.field78 = var2;
      this.field80 = var3;
      this.field82 = var6;
      int var8 = this.field80;
      if(class57.field714 != null) {
         class57.field714.position = var8 * 8 + 5;
         int var9 = class57.field714.readInt();
         int var10 = class57.field714.readInt();
         this.method128(var9, var10);
      } else {
         class48.method1049((class6)null, 255, 255, 0, (byte)0, true);
         class239.field3138[var8] = this;
      }

   }

   @ObfuscatedName("dv")
   @ObfuscatedSignature(
      signature = "(Lfi;I[BZI)V",
      garbageValue = "1398577258"
   )
   void method102(class263 var1, int var2, byte[] var3, boolean var4) {
      int var5;
      if(var1 == this.field78) {
         if(this.field81) {
            throw new RuntimeException();
         }

         if(var3 == null) {
            class48.method1049(this, 255, this.field80, this.field85, (byte)0, true);
            return;
         }

         field84.reset();
         field84.update(var3, 0, var3.length);
         var5 = (int)field84.getValue();
         if(var5 != this.field85) {
            class48.method1049(this, 255, this.field80, this.field85, (byte)0, true);
            return;
         }

         Buffer var9 = new Buffer(class84.method1618(var3));
         int var7 = var9.readUnsignedByte();
         if(var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field80 + "," + var2);
         }

         int var8 = 0;
         if(var7 >= 6) {
            var8 = var9.readInt();
         }

         if(var8 != this.field79) {
            class48.method1049(this, 255, this.field80, this.field85, (byte)0, true);
            return;
         }

         this.method4396(var3);
         this.method121();
      } else {
         if(!var4 && var2 == this.field83) {
            this.field81 = true;
         }

         if(var3 == null || var3.length <= 2) {
            this.field86[var2] = false;
            if(this.field82 || var4) {
               class48.method1049(this, this.field80, var2, super.field2957[var2], (byte)2, var4);
            }

            return;
         }

         field84.reset();
         field84.update(var3, 0, var3.length - 2);
         var5 = (int)field84.getValue();
         int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
         if(var5 != super.field2957[var2] || var6 != super.field2958[var2]) {
            this.field86[var2] = false;
            if(this.field82 || var4) {
               class48.method1049(this, this.field80, var2, super.field2957[var2], (byte)2, var4);
            }

            return;
         }

         this.field86[var2] = true;
         if(var4) {
            super.field2963[var2] = class118.method2132(var3, false);
         }
      }

   }

   @ObfuscatedName("dy")
   @ObfuscatedSignature(
      signature = "(I[BZZI)V",
      garbageValue = "-1612597775"
   )
   public void method101(int var1, byte[] var2, boolean var3, boolean var4) {
      if(var3) {
         if(this.field81) {
            throw new RuntimeException();
         }

         if(this.field78 != null) {
            int var5 = this.field80;
            class263 var6 = this.field78;
            class192 var7 = new class192();
            var7.field2743 = 0;
            var7.field2792 = (long)var5;
            var7.field2742 = var2;
            var7.field2741 = var6;
            class70 var8 = class325.field3951;
            synchronized(class325.field3951) {
               class325.field3951.method1499(var7);
            }

            class247.method4957();
         }

         this.method4396(var2);
         this.method121();
      } else {
         var2[var2.length - 2] = (byte)(super.field2958[var1] >> 8);
         var2[var2.length - 1] = (byte)super.field2958[var1];
         if(this.field87 != null) {
            class263 var11 = this.field87;
            class192 var14 = new class192();
            var14.field2743 = 0;
            var14.field2792 = (long)var1;
            var14.field2742 = var2;
            var14.field2741 = var11;
            class70 var15 = class325.field3951;
            synchronized(class325.field3951) {
               class325.field3951.method1499(var14);
            }

            class247.method4957();
            this.field86[var1] = true;
         }

         if(var4) {
            super.field2963[var1] = class118.method2132(var2, false);
         }
      }

   }

   @ObfuscatedName("do")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "-2134918163"
   )
   public boolean method105(int var1) {
      return this.field86[var1];
   }

   @ObfuscatedName("dd")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-637071204"
   )
   public int method111() {
      if(this.field81) {
         return 100;
      } else if(super.field2963 != null) {
         return 99;
      } else {
         int var2 = this.field80;
         long var3 = (long)(var2 + 16711680);
         int var1;
         if(class239.field3134 != null && class239.field3134.field2792 == var3) {
            var1 = class236.field3118.position * 99 / (class236.field3118.field1694.length - class239.field3134.field3954) + 1;
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

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "545333176"
   )
   void vmethod4397(int var1) {
      int var2 = this.field80;
      long var3 = (long)((var2 << 16) + var1);
      class326 var5 = (class326)class239.field3127.method1776(var3);
      if(var5 != null) {
         class239.field3128.method1056(var5);
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "0"
   )
   int vmethod4404(int var1) {
      if(super.field2963[var1] != null) {
         return 100;
      } else if(this.field86[var1]) {
         return 100;
      } else {
         int var3 = this.field80;
         long var4 = (long)((var3 << 16) + var1);
         int var2;
         if(class239.field3134 != null && var4 == class239.field3134.field2792) {
            var2 = class236.field3118.position * 99 / (class236.field3118.field1694.length - class239.field3134.field3954) + 1;
         } else {
            var2 = 0;
         }

         return var2;
      }
   }

   public int getIndex() {
      return this.field80;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1205100077"
   )
   void vmethod4430(int var1) {
      if(this.field87 != null && this.field86 != null && this.field86[var1]) {
         class263 var2 = this.field87;
         byte[] var4 = null;
         class70 var5 = class325.field3951;
         synchronized(class325.field3951) {
            for(class192 var6 = (class192)class325.field3951.method1503(); var6 != null; var6 = (class192)class325.field3951.method1505()) {
               if(var6.field2792 == (long)var1 && var2 == var6.field2741 && var6.field2743 == 0) {
                  var4 = var6.field2742;
                  break;
               }
            }
         }

         if(var4 != null) {
            this.method102(var2, var1, var4, true);
         } else {
            byte[] var9 = var2.method5237(var1);
            this.method102(var2, var1, var9, true);
         }
      } else {
         class48.method1049(this, this.field80, var1, super.field2957[var1], (byte)2, true);
      }

   }

   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "1"
   )
   public boolean method96() {
      return this.field81;
   }

   @ObfuscatedName("dr")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "86"
   )
   public int method95() {
      int var1 = 0;
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < super.field2963.length; ++var3) {
         if(super.field2966[var3] > 0) {
            var1 += 100;
            var2 += this.vmethod4404(var3);
         }
      }

      if(var1 == 0) {
         return 100;
      } else {
         var3 = var2 * 100 / var1;
         return var3;
      }
   }

   @ObfuscatedName("dn")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "100"
   )
   void method121() {
      this.field86 = new boolean[super.field2963.length];

      int var1;
      for(var1 = 0; var1 < this.field86.length; ++var1) {
         this.field86[var1] = false;
      }

      if(this.field87 == null) {
         this.field81 = true;
      } else {
         this.field83 = -1;

         for(var1 = 0; var1 < this.field86.length; ++var1) {
            if(super.field2966[var1] > 0) {
               class263 var2 = this.field87;
               class192 var4 = new class192();
               var4.field2743 = 1;
               var4.field2792 = (long)var1;
               var4.field2741 = var2;
               var4.field2744 = this;
               class70 var5 = class325.field3951;
               synchronized(class325.field3951) {
                  class325.field3951.method1499(var4);
               }

               class247.method4957();
               this.field83 = var1;
            }
         }

         if(this.field83 == -1) {
            this.field81 = true;
         }

      }
   }

   @ObfuscatedName("da")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "-1282766272"
   )
   public boolean method106(int var1) {
      return this.method4475(var1) != null;
   }

   @ObfuscatedName("dm")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1365269897"
   )
   public void method128(int var1, int var2) {
      this.field85 = var1;
      this.field79 = var2;
      if(this.field78 != null) {
         int var3 = this.field80;
         class263 var4 = this.field78;
         byte[] var6 = null;
         class70 var7 = class325.field3951;
         synchronized(class325.field3951) {
            for(class192 var8 = (class192)class325.field3951.method1503(); var8 != null; var8 = (class192)class325.field3951.method1505()) {
               if((long)var3 == var8.field2792 && var4 == var8.field2741 && var8.field2743 == 0) {
                  var6 = var8.field2742;
                  break;
               }
            }
         }

         if(var6 != null) {
            this.method102(var4, var3, var6, true);
         } else {
            byte[] var11 = var4.method5237(var3);
            this.method102(var4, var3, var11, true);
         }
      } else {
         class48.method1049(this, 255, this.field80, this.field85, (byte)0, true);
      }

   }
}
