package net.runelite.standalone;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
public class class129 {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lck;"
   )
   public static class232 field1723;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      longValue = -8540096340213144691L
   )
   public static long field1725;
   @ObfuscatedName("l")
   Future field1721;
   @ObfuscatedName("f")
   ExecutorService field1722;

   class129() {
      this.field1722 = Executors.newSingleThreadExecutor();
      this.field1721 = this.field1722.submit(new class179());
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "122"
   )
   boolean method2487() {
      return this.field1721.isDone();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1749028438"
   )
   void method2486() {
      this.field1722.shutdown();
      this.field1722 = null;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)Ljava/security/SecureRandom;",
      garbageValue = "21"
   )
   SecureRandom method2491() {
      try {
         return (SecureRandom)this.field1721.get();
      } catch (Exception var2) {
         return class265.method5281();
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/String;[SB)V",
      garbageValue = "32"
   )
   public static void method2493(String[] var0, short[] var1) {
      class191.method3909(var0, var1, 0, var0.length - 1);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-127"
   )
   public static boolean method2496() {
      try {
         if(class43.field481 == 2) {
            if(class231.field3083 == null) {
               class231.field3083 = class240.method4730(class270.field3480, class259.field3385, class177.field2443);
               if(class231.field3083 == null) {
                  return false;
               }
            }

            if(class43.field482 == null) {
               class43.field482 = new class259(class43.field479, class43.field480);
            }

            if(class43.field483.method1371(class231.field3083, class43.field478, class43.field482, 22050)) {
               class43.field483.method1428();
               class43.field483.method1369(class226.field3046);
               class43.field483.method1448(class231.field3083, class113.field1296);
               class43.field481 = 0;
               class231.field3083 = null;
               class43.field482 = null;
               class270.field3480 = null;
               return true;
            }
         }
      } catch (Exception var1) {
         var1.printStackTrace();
         class43.field483.method1375();
         class43.field481 = 0;
         class231.field3083 = null;
         class43.field482 = null;
         class270.field3480 = null;
      }

      return false;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(IZII)V",
      garbageValue = "1948036646"
   )
   public static final void method2495(int var0, boolean var1, int var2) {
      if(var0 >= 8000 && var0 <= 48000) {
         class293.field3657 = var0;
         class268.field3462 = var1;
         MapIcon.field247 = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }
}
