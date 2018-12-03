package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFrame;
import net.runelite.rs.api.RSFrames;
import net.runelite.rs.api.RSRunException;

@ObfuscatedName("et")
public class class202 extends class324 implements RSFrames {
   @ObfuscatedName("rl")
   @ObfuscatedSignature(
      signature = "Lbt;"
   )
   public static class159 field2845;
   @ObfuscatedName("dc")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class6 configsIndex;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "[Ldg;"
   )
   class0[] field2844;

   @ObfuscatedSignature(
      signature = "(Lik;Lik;IZ)V"
   )
   class202(class217 var1, class217 var2, int var3, boolean var4) {
      class70 var5 = new class70();
      int var6 = var1.method4435(var3);
      this.field2844 = new class0[var6];
      int[] var7 = var1.method4475(var3);

      for(int var8 = 0; var8 < var7.length; ++var8) {
         byte[] var9 = var1.method4398(var3, var7[var8], -746969239);
         class141 var10 = null;
         int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

         for(class141 var12 = (class141)var5.method1503(); var12 != null; var12 = (class141)var5.method1505()) {
            if(var11 == var12.field1796) {
               var10 = var12;
               break;
            }
         }

         if(var10 == null) {
            byte[] var13;
            if(var4) {
               var13 = var2.method4495(0, var11);
            } else {
               var13 = var2.method4495(var11, 0);
            }

            var10 = new class141(var11, var13);
            var5.method1499(var10);
         }

         this.field2844[var7[var8]] = new class0(var9, var10);
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "2010442786"
   )
   public boolean method4014(int var1) {
      return this.field2844[var1].field0;
   }

   public RSFrame[] getFrames() {
      return this.field2844;
   }

   @ObfuscatedName("f")
   public static void method4018(String var0, Throwable var1, int var2) {
      if(var1 != null) {
         Throwable var3 = var1;
         if(var1 instanceof RSRunException) {
            var3 = ((RSRunException)var1).getParent();
         }

         class302.field3755.getLogger().error("Game crash", var3);
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
   static final void method4017(class99 var0) {
      int var1 = var0.field1118 - client.field2165;
      int var2 = var0.field1126 * 128 + var0.field1075 * 64;
      int var3 = var0.field1116 * 128 + var0.field1075 * 64;
      var0.field1090 += (var2 - var0.field1090) / var1;
      var0.field1072 += (var3 - var0.field1072) / var1;
      var0.field1120 = 0;
      var0.field1123 = var0.field1113;
   }
}
