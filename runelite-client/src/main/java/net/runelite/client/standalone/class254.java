package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSTextureProvider;

@ObfuscatedName("dr")
public class class254 implements class202, RSTextureProvider {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "[Ldu;"
   )
   class69[] field2524;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   class148 field2517;
   @ObfuscatedName("e")
   double field2521;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   class320 field2518;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 2134722619
   )
   int field2520;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -773872445
   )
   int field2519;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1550288627
   )
   int field2523;

   @ObfuscatedSignature(
      signature = "(Lik;Lik;IDI)V"
   )
   public class254(class148 var1, class148 var2, int var3, double var4, int var6) {
      this.field2518 = new class320();
      this.field2520 = 0;
      this.field2521 = 1.0D;
      this.field2519 = 128;
      this.field2517 = var2;
      this.field2523 = var3;
      this.field2520 = this.field2523;
      this.field2521 = var4;
      this.field2519 = var6;
      int[] var7 = var1.method2656(0);
      int var8 = var7.length;
      this.field2524 = new class69[var1.method2616(0)];

      for(int var9 = 0; var9 < var8; ++var9) {
         Buffer var10 = new Buffer(var1.method2579(0, var7[var9], -199223155));
         this.field2524[var7[var9]] = new class69(var10);
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(S)I",
      garbageValue = "32360"
   )
   public int method4528() {
      int var1 = 0;
      int var2 = 0;
      class69[] var3 = this.field2524;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         class69 var5 = var3[var4];
         if(var5 != null && var5.field639 != null) {
            var1 += var5.field639.length;
            int[] var6 = var5.field639;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               int var8 = var6[var7];
               if(this.field2517.method2582(var8)) {
                  ++var2;
               }
            }
         }
      }

      if(var1 == 0) {
         return 0;
      } else {
         return var2 * 100 / var1;
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1108147567"
   )
   public void method4534(int var1) {
      for(int var2 = 0; var2 < this.field2524.length; ++var2) {
         class69 var3 = this.field2524[var2];
         if(var3 != null && var3.field643 != 0 && var3.field646) {
            var3.method1162(var1);
            var3.field646 = false;
         }
      }

      this.checkTextures(var1);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1220758971"
   )
   public void method4533() {
      for(int var1 = 0; var1 < this.field2524.length; ++var1) {
         if(this.field2524[var1] != null) {
            this.field2524[var1].method1168();
         }
      }

      this.field2518 = new class320();
      this.field2520 = this.field2523;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "359300581"
   )
   public boolean vmethod4532(int var1) {
      return this.field2519 == 64;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "-656235485"
   )
   public boolean vmethod4531(int var1) {
      return this.field2524[var1].field642;
   }

   @ObfuscatedName("l")
   public void method4542(double var1) {
      this.field2521 = var1;
      this.method4533();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-2044307018"
   )
   public int vmethod4530(int var1) {
      return this.field2524[var1] != null?this.field2524[var1].field637:0;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)[I",
      garbageValue = "-1678600032"
   )
   public int[] vmethod4529(int var1) {
      class69 var2 = this.field2524[var1];
      if(var2 != null) {
         if(var2.field644 != null) {
            this.field2518.method5601(var2);
            var2.field646 = true;
            return var2.field644;
         }

         boolean var3 = var2.method1160(this.field2521, this.field2519, this.field2517);
         if(var3) {
            if(this.field2520 == 0) {
               class69 var4 = (class69)this.field2518.method5603();
               var4.method1168();
            } else {
               --this.field2520;
            }

            this.field2518.method5601(var2);
            var2.field646 = true;
            return var2.field644;
         }
      }

      return null;
   }

   public void checkTextures(int var1) {
      class113.field1064.getCallbacks().drawAboveOverheads();
   }
}
