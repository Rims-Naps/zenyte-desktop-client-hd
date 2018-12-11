package net.runelite.standalone;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSWidgetNode;

@ObfuscatedName("bl")
public class class322 extends class197 implements RSWidgetNode {
   @ObfuscatedName("sh")
   @ObfuscatedGetter(
      intValue = -2080449195
   )
   static int field3938;
   @ObfuscatedName("ft")
   @ObfuscatedGetter(
      intValue = -1875848335
   )
   static int field3936;
   @ObfuscatedName("ld")
   @ObfuscatedSignature(
      signature = "Lbh;"
   )
   static class285 field3939;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1423086359
   )
   int field3934;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 818106581
   )
   int field3937;
   @ObfuscatedName("w")
   boolean field3935;

   class322() {
      this.field3935 = false;
   }

   public int getId() {
      return this.field3937;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)Lbu;",
      garbageValue = "4"
   )
   static class88 method6254() {
      class88.field963 = 0;
      return class312.method6130();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-2057986175"
   )
   static int method6256(int var0, class296 var1, boolean var2) {
      class187 var3;
      if(var0 >= 2000) {
         var0 -= 1000;
         var3 = class48.method1047(class249.field3312[--MapCacheArchiveNames.field3811]);
      } else {
         var3 = var2?class3.field36:class284.field3565;
      }

      if(var0 == 1927) {
         if(class249.field3309 >= 10) {
            throw new RuntimeException();
         } else if(var3.field2673 == null) {
            return 0;
         } else {
            class194 var4 = new class194();
            var4.field2759 = var3;
            var4.field2765 = var3.field2673;
            var4.field2769 = class249.field3309 + 1;
            client.field2232.method1499(var4);
            return 1;
         }
      } else {
         return 2;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "499457985"
   )
   static long method6257() {
      try {
         URL var0 = new URL(class205.method4077("services", false) + "m=accountappeal/login.ws");
         URLConnection var1 = var0.openConnection();
         var1.setRequestProperty("connection", "close");
         var1.setDoInput(true);
         var1.setDoOutput(true);
         var1.setConnectTimeout(5000);
         OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
         var2.write("data1=req");
         var2.flush();
         InputStream var3 = var1.getInputStream();
         Buffer var4 = new Buffer(new byte[1000]);

         do {
            int var5 = var3.read(var4.field1694, var4.position, 1000 - var4.position);
            if(var5 == -1) {
               var4.position = 0;
               long var7 = var4.method2349();
               return var7;
            }

            var4.position += var5;
         } while(var4.position < 1000);

         return 0L;
      } catch (Exception var9) {
         return 0L;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lhw;I[B[BI)V",
      garbageValue = "-1870400424"
   )
   static final void method6255(class187 var0, int var1, byte[] var2, byte[] var3) {
      if(var0.field2543 == null) {
         if(var2 == null) {
            return;
         }

         var0.field2543 = new byte[11][];
         var0.field2662 = new byte[11][];
         var0.field2635 = new int[11];
         var0.field2636 = new int[11];
      }

      var0.field2543[var1] = var2;
      if(var2 != null) {
         var0.field2632 = true;
      } else {
         var0.field2632 = false;

         for(int var4 = 0; var4 < var0.field2543.length; ++var4) {
            if(var0.field2543[var4] != null) {
               var0.field2632 = true;
               break;
            }
         }
      }

      var0.field2662[var1] = var3;
   }
}
