package net.runelite.client.standalone;

import java.security.SecureRandom;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
public class class168 implements class43 {
   @ObfuscatedName("qf")
   @ObfuscatedGetter(
      intValue = -215507679
   )
   static int field1557;
   @ObfuscatedName("jc")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   static class329 field1558;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1478617083
   )
   int field1555;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -7892127
   )
   int field1556;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -339587985
   )
   int field1553;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1680355133
   )
   int field1552;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -425743195
   )
   int field1554;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1956625221
   )
   int field1549;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1358664481
   )
   int field1546;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1741002609
   )
   int field1547;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1695834977
   )
   int field1550;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 879720505
   )
   int field1545;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lh;B)V",
      garbageValue = "-105"
   )
   public void vmethod3479(class87 var1) {
      if(var1.field793 > this.field1554) {
         var1.field793 = this.field1554;
      }

      if(var1.field794 < this.field1553) {
         var1.field794 = this.field1553;
      }

      if(var1.field789 > this.field1552) {
         var1.field789 = this.field1552;
      }

      if(var1.field796 < this.field1556) {
         var1.field796 = this.field1556;
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-26"
   )
   void method2858() {
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "116686342"
   )
   public void vmethod3484(Buffer var1) {
      this.field1555 = var1.readUnsignedByte();
      this.field1546 = var1.readUnsignedByte();
      this.field1545 = var1.readUnsignedShort();
      this.field1547 = var1.readUnsignedShort();
      this.field1549 = var1.readUnsignedShort();
      this.field1550 = var1.readUnsignedShort();
      this.field1554 = var1.readUnsignedShort();
      this.field1552 = var1.readUnsignedShort();
      this.field1553 = var1.readUnsignedShort();
      this.field1556 = var1.readUnsignedShort();
      this.method2858();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIB)Lhx;",
      garbageValue = "26"
   )
   public class34 vmethod3483(int var1, int var2) {
      if(!this.vmethod3489(var1, var2)) {
         return null;
      } else {
         int var3 = this.field1545 * 64 - this.field1554 * 64 + var1;
         int var4 = this.field1547 * 64 - this.field1552 * 64 + var2;
         return new class34(this.field1555, var3, var4);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIIB)Z",
      garbageValue = "37"
   )
   public boolean vmethod3480(int var1, int var2, int var3) {
      return var1 >= this.field1555 && var1 < this.field1546 + this.field1555?var2 >> 6 >= this.field1545 && var2 >> 6 <= this.field1549 && var3 >> 6 >= this.field1547 && var3 >> 6 <= this.field1550:false;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIII)[I",
      garbageValue = "-161024515"
   )
   public int[] vmethod3482(int var1, int var2, int var3) {
      if(!this.vmethod3480(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field1554 * 64 - this.field1545 * 64 + var2, var3 + (this.field1552 * 64 - this.field1547 * 64)};
         return var4;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)Z",
      garbageValue = "16"
   )
   public boolean vmethod3489(int var1, int var2) {
      return var1 >> 6 >= this.field1554 && var1 >> 6 <= this.field1553 && var2 >> 6 >= this.field1552 && var2 >> 6 <= this.field1556;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)Ljava/security/SecureRandom;",
      garbageValue = "80"
   )
   static SecureRandom method2865() {
      SecureRandom var0 = new SecureRandom();
      var0.nextInt();
      return var0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Lil;",
      garbageValue = "1309066214"
   )
   public static class15 method2871(int var0) {
      class15 var1 = (class15)class15.field138.method2268((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class16.field139.method2579(15, var0, -1060101723);
         var1 = new class15();
         if(var2 != null) {
            var1.method176(new Buffer(var2));
         }

         class15.field138.method2275(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-2141620427"
   )
   public static boolean method2869(int var0, int var1) {
      return (var0 >> var1 + 1 & 1) != 0;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "1"
   )
   public static int method2870(int var0, int var1) {
      return (var0 + 40000 << 8) + var1;
   }

   @ObfuscatedName("fa")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-350753717"
   )
   static void method2872() {
      int var0 = class11.field90;
      int[] var1 = class11.field91;

      for(int var2 = 0; var2 < var0; ++var2) {
         if(var1[var2] != client.field3922 && var1[var2] != client.field3765) {
            class176.method2956(client.field3848[var1[var2]], true);
         }
      }

   }
}
