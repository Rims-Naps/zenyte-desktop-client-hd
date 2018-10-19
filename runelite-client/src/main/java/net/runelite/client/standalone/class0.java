package net.runelite.client.standalone;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
public class class0 {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lck;"
   )
   public static class174 field2;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      longValue = -8540096340213144691L
   )
   public static long field4;
   @ObfuscatedName("f")
   ExecutorService field1;
   @ObfuscatedName("l")
   Future field0;

   class0() {
      this.field1 = Executors.newSingleThreadExecutor();
      this.field0 = this.field1.submit(new class118());
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1749028438"
   )
   void method1() {
      this.field1.shutdown();
      this.field1 = null;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "122"
   )
   boolean method2() {
      return this.field0.isDone();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)Ljava/security/SecureRandom;",
      garbageValue = "21"
   )
   SecureRandom method6() {
      try {
         return (SecureRandom)this.field0.get();
      } catch (Exception var2) {
         return class168.method2865();
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/String;[SB)V",
      garbageValue = "32"
   )
   public static void method8(String[] var0, short[] var1) {
      class161.method2769(var0, var1, 0, var0.length - 1);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-127"
   )
   public static boolean method11() {
      try {
         if(class227.field2232 == 2) {
            if(class292.field3157 == null) {
               class292.field3157 = class144.method2547(class53.field391, class52.field386, class263.field2910);
               if(class292.field3157 == null) {
                  return false;
               }
            }

            if(class227.field2233 == null) {
               class227.field2233 = new class52(class227.field2230, class227.field2231);
            }

            if(class227.field2234.method245(class292.field3157, class227.field2229, class227.field2233, 22050)) {
               class227.field2234.method302();
               class227.field2234.method243(class78.field720);
               class227.field2234.method322(class292.field3157, class199.field1874);
               class227.field2232 = 0;
               class292.field3157 = null;
               class227.field2233 = null;
               class53.field391 = null;
               return true;
            }
         }
      } catch (Exception var1) {
         var1.printStackTrace();
         class227.field2234.method249();
         class227.field2232 = 0;
         class292.field3157 = null;
         class227.field2233 = null;
         class53.field391 = null;
      }

      return false;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(IZII)V",
      garbageValue = "1948036646"
   )
   public static final void method10(int var0, boolean var1, int var2) {
      if(var0 >= 8000 && var0 <= 48000) {
         class40.field294 = var0;
         class137.field1362 = var1;
         class2.field12 = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }
}
