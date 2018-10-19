package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSSoundEffect;

@ObfuscatedName("cs")
public class class93 implements RSSoundEffect {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "[Ldv;"
   )
   class110[] field886;
   @ObfuscatedName("s")
   int field889;
   @ObfuscatedName("w")
   int field888;

   @ObfuscatedSignature(
      signature = "(Lgm;)V"
   )
   class93(Buffer var1) {
      this.field886 = new class110[10];

      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.readUnsignedByte();
         if(var3 != 0) {
            --var1.field1073;
            this.field886[var2] = new class110();
            this.field886[var2].method1839(var1);
         }
      }

      this.field888 = var1.readUnsignedShort();
      this.field889 = var1.readUnsignedShort();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "()Lcr;"
   )
   public class58 method1650() {
      byte[] var1 = this.method1647();
      return new class58(22050, var1, this.field888 * 22050 / 1000, this.field889 * 22050 / 1000);
   }

   @ObfuscatedName("s")
   final byte[] method1647() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(this.field886[var2] != null && this.field886[var2].field1045 + this.field886[var2].field1042 > var1) {
            var1 = this.field886[var2].field1045 + this.field886[var2].field1042;
         }
      }

      if(var1 == 0) {
         return new byte[0];
      } else {
         var2 = var1 * 22050 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if(this.field886[var4] != null) {
               int var5 = this.field886[var4].field1045 * 22050 / 1000;
               int var6 = this.field886[var4].field1042 * 22050 / 1000;
               int[] var7 = this.field886[var4].method1837(var5, this.field886[var4].field1045);

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
   public final int method1639() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(this.field886[var2] != null && this.field886[var2].field1042 / 20 < var1) {
            var1 = this.field886[var2].field1042 / 20;
         }
      }

      if(this.field888 < this.field889 && this.field888 / 20 < var1) {
         var1 = this.field888 / 20;
      }

      if(var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if(this.field886[var2] != null) {
               this.field886[var2].field1042 -= var1 * 20;
            }
         }

         if(this.field888 < this.field889) {
            this.field888 -= var1 * 20;
            this.field889 -= var1 * 20;
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
   public static class93 method1640(class148 var0, int var1, int var2) {
      byte[] var3 = var0.method2579(var1, var2, -313954055);
      return var3 == null?null:new class93(new Buffer(var3));
   }
}
