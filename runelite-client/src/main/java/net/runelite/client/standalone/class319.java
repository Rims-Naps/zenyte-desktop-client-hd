package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
public class class319 extends class153 {
   @ObfuscatedName("kp")
   @ObfuscatedGetter(
      intValue = -1215790901
   )
   static int field3406;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgm;Lgm;I)V",
      garbageValue = "1377930482"
   )
   void method5586(Buffer var1, Buffer var2) {
      int var3 = var2.readUnsignedByte();
      if(var3 != class313.field3379.field3374) {
         throw new IllegalStateException("");
      } else {
         super.field1467 = var2.readUnsignedByte();
         super.field1460 = var2.readUnsignedByte();
         super.field1471 = var2.readUnsignedShort();
         super.field1465 = var2.readUnsignedShort();
         super.field1459 = var2.readUnsignedShort();
         super.field1458 = var2.readUnsignedShort();
         super.field1460 = Math.min(super.field1460, 4);
         super.field1461 = new short[1][64][64];
         super.field1462 = new short[super.field1460][64][64];
         super.field1463 = new byte[super.field1460][64][64];
         super.field1464 = new byte[super.field1460][64][64];
         super.field1470 = new class25[super.field1460][64][64][];
         var3 = var1.readUnsignedByte();
         if(var3 != class77.field710.field707) {
            throw new IllegalStateException("");
         } else {
            int var4 = var1.readUnsignedByte();
            int var5 = var1.readUnsignedByte();
            if(var4 == super.field1459 && var5 == super.field1458) {
               for(int var6 = 0; var6 < 64; ++var6) {
                  for(int var7 = 0; var7 < 64; ++var7) {
                     this.method2698(var6, var7, var1);
                  }
               }

            } else {
               throw new IllegalStateException("");
            }
         }
      }
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof class319)) {
         return false;
      } else {
         class319 var2 = (class319)var1;
         return super.field1459 == var2.field1459 && super.field1458 == var2.field1458;
      }
   }

   public int hashCode() {
      return super.field1459 | super.field1458 << 8;
   }

   @ObfuscatedName("fg")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1158038228"
   )
   static int method5597() {
      return client.field3946?2:1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1937485390"
   )
   static void method5596(int var0) {
      class292 var1 = (class292)class292.field3153.method5310((long)var0);
      if(var1 != null) {
         for(int var2 = 0; var2 < var1.field3150.length; ++var2) {
            var1.field3150[var2] = -1;
            var1.field3154[var2] = 0;
            var1.stackSizesChanged(var2);
         }

      }
   }

   @ObfuscatedName("fq")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZB)V",
      garbageValue = "16"
   )
   static final void method5587(String var0, boolean var1) {
      if(client.field3847) {
         byte var2 = 4;
         int var3 = var2 + 6;
         int var4 = var2 + 6;
         int var5 = class9.field76.method3568(var0, 250);
         int var6 = class9.field76.method3523(var0, 250) * 13;
         class89.method1561(var3 - var2, var4 - var2, var5 + var2 + var2, var6 + var2 + var2, 0);
         class89.method1543(var3 - var2, var4 - var2, var5 + var2 + var2, var6 + var2 + var2, 16777215);
         class9.field76.method3579(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
         int var7 = var3 - var2;
         int var8 = var4 - var2;
         int var9 = var2 + var2 + var5;
         int var10 = var6 + var2 + var2;

         for(int var11 = 0; var11 < client.field3935; ++var11) {
            if(client.field3901[var11] + client.field3942[var11] > var7 && client.field3901[var11] < var7 + var9 && client.field3941[var11] + client.field3943[var11] > var8 && client.field3941[var11] < var8 + var10) {
               client.field3930[var11] = true;
            }
         }

         if(var1) {
            class146.field1404.vmethod4918(0, 0);
         } else {
            class278.method4947(var3, var4, var5, var6);
         }

      }
   }
}
