package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFrame;
import net.runelite.rs.api.RSFrames;
import net.runelite.rs.api.RSRunException;

@ObfuscatedName("et")
public class class295 extends class193 implements RSFrames {
   @ObfuscatedName("rl")
   @ObfuscatedSignature(
      signature = "Lbt;"
   )
   public static class328 field3180;
   @ObfuscatedName("dc")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class108 field3175;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "[Ldg;"
   )
   class66[] field3179;

   @ObfuscatedSignature(
      signature = "(Lik;Lik;IZ)V"
   )
   class295(class148 var1, class148 var2, int var3, boolean var4) {
      class320 var5 = new class320();
      int var6 = var1.method2616(var3);
      this.field3179 = new class66[var6];
      int[] var7 = var1.method2656(var3);

      for(int var8 = 0; var8 < var7.length; ++var8) {
         byte[] var9 = var1.method2579(var3, var7[var8], -746969239);
         class29 var10 = null;
         int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

         for(class29 var12 = (class29)var5.method5604(); var12 != null; var12 = (class29)var5.method5606()) {
            if(var11 == var12.field220) {
               var10 = var12;
               break;
            }
         }

         if(var10 == null) {
            byte[] var13;
            if(var4) {
               var13 = var2.method2676(0, var11);
            } else {
               var13 = var2.method2676(var11, 0);
            }

            var10 = new class29(var11, var13);
            var5.method5600(var10);
         }

         this.field3179[var7[var8]] = new class66(var9, var10);
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "2010442786"
   )
   public boolean method5141(int var1) {
      return this.field3179[var1].field607;
   }

   public RSFrame[] getFrames() {
      return this.field3179;
   }

   @ObfuscatedName("f")
   public static void method5145(String var0, Throwable var1, int var2) {
      if(var1 != null) {
         Throwable var3 = var1;
         if(var1 instanceof RSRunException) {
            var3 = ((RSRunException)var1).getParent();
         }

         class113.field1064.getLogger().error("Game crash", var3);
         StackTraceElement[] var4 = var3.getStackTrace();
         StackTraceElement[] var5 = var4;
         int var6 = var4.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            StackTraceElement var8 = var5[var7];
            if(var8.getClassName().contains("runelite")) {
               return;
            }
         }
      }

      client.copy$processClientError(var0, var1, var2);
   }

   @ObfuscatedName("fx")
   @ObfuscatedSignature(
      signature = "(Lbn;I)V",
      garbageValue = "176236599"
   )
   static final void method5144(class133 var0) {
      int var1 = var0.field1305 - client.field3744;
      int var2 = var0.field1313 * 128 + var0.field1262 * 64;
      int var3 = var0.field1303 * 128 + var0.field1262 * 64;
      var0.field1277 += (var2 - var0.field1277) / var1;
      var0.field1259 += (var3 - var0.field1259) / var1;
      var0.field1307 = 0;
      var0.field1310 = var0.field1300;
   }
}
