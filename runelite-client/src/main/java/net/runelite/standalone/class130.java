package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSSoundEffect;

@ObfuscatedName("cs")
public class class130 implements RSSoundEffect {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "[Ldv;"
   )
   class11[] field1726;
   @ObfuscatedName("s")
   int field1729;
   @ObfuscatedName("w")
   int field1728;

   @ObfuscatedSignature(
      signature = "(Lgm;)V"
   )
   class130(Buffer var1) {
      this.field1726 = new class11[10];

      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.readUnsignedByte();
         if(var3 != 0) {
            --var1.field1693;
            this.field1726[var2] = new class11();
            this.field1726[var2].method181(var1);
         }
      }

      this.field1728 = var1.readShort();
      this.field1729 = var1.readShort();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "()Lcr;"
   )
   public class33 method2509() {
      byte[] var1 = this.method2506();
      return new class33(22050, var1, this.field1728 * 22050 / 1000, this.field1729 * 22050 / 1000);
   }

   @ObfuscatedName("s")
   final byte[] method2506() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(this.field1726[var2] != null && this.field1726[var2].field113 + this.field1726[var2].field110 > var1) {
            var1 = this.field1726[var2].field113 + this.field1726[var2].field110;
         }
      }

      if(var1 == 0) {
         return new byte[0];
      } else {
         var2 = var1 * 22050 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if(this.field1726[var4] != null) {
               int var5 = this.field1726[var4].field113 * 22050 / 1000;
               int var6 = this.field1726[var4].field110 * 22050 / 1000;
               int[] var7 = this.field1726[var4].method179(var5, this.field1726[var4].field113);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = (var7[var8] >> 8) + var3[var8 + var6];
                  if((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }

   @ObfuscatedName("w")
   public final int method2498() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(this.field1726[var2] != null && this.field1726[var2].field110 / 20 < var1) {
            var1 = this.field1726[var2].field110 / 20;
         }
      }

      if(this.field1728 < this.field1729 && this.field1728 / 20 < var1) {
         var1 = this.field1728 / 20;
      }

      if(var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if(this.field1726[var2] != null) {
               this.field1726[var2].field110 -= var1 * 20;
            }
         }

         if(this.field1728 < this.field1729) {
            this.field1728 -= var1 * 20;
            this.field1729 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;II)Lcs;"
   )
   public static class130 method2499(class217 var0, int var1, int var2) {
      byte[] var3 = var0.method4398(var1, var2, -313954055);
      return var3 == null?null:new class130(new Buffer(var3));
   }
}
