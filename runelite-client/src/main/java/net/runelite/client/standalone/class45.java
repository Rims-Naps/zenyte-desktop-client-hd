package net.runelite.client.standalone;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSWidgetNode;

@ObfuscatedName("bl")
public class class45 extends class76 implements RSWidgetNode {
   @ObfuscatedName("sh")
   @ObfuscatedGetter(
      intValue = -2080449195
   )
   static int field352;
   @ObfuscatedName("ld")
   @ObfuscatedSignature(
      signature = "Lbh;"
   )
   static class152 field353;
   @ObfuscatedName("ft")
   @ObfuscatedGetter(
      intValue = -1875848335
   )
   static int field350;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 818106581
   )
   int field351;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1423086359
   )
   int field348;
   @ObfuscatedName("w")
   boolean field349;

   class45() {
      this.field349 = false;
   }

   public int getId() {
      return this.field351;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "499457985"
   )
   static long method791() {
      try {
         URL var0 = new URL(class163.method2811("services", false) + "m=accountappeal/login.ws");
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
            int var5 = var3.read(var4.field1074, var4.field1073, 1000 - var4.field1073);
            if(var5 == -1) {
               var4.field1073 = 0;
               long var7 = var4.method1998();
               return var7;
            }

            var4.field1073 += var5;
         } while(var4.field1073 < 1000);

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
   static final void method789(class329 var0, int var1, byte[] var2, byte[] var3) {
      if(var0.field3529 == null) {
         if(var2 == null) {
            return;
         }

         var0.field3529 = new byte[11][];
         var0.field3648 = new byte[11][];
         var0.field3621 = new int[11];
         var0.field3622 = new int[11];
      }

      var0.field3529[var1] = var2;
      if(var2 != null) {
         var0.field3618 = true;
      } else {
         var0.field3618 = false;

         for(int var4 = 0; var4 < var0.field3529.length; ++var4) {
            if(var0.field3529[var4] != null) {
               var0.field3618 = true;
               break;
            }
         }
      }

      var0.field3648[var1] = var3;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)Lbu;",
      garbageValue = "4"
   )
   static class126 method788() {
      class126.field1203 = 0;
      return class321.method5663();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-2057986175"
   )
   static int method790(int var0, class252 var1, boolean var2) {
      class329 var3;
      if(var0 >= 2000) {
         var0 -= 1000;
         var3 = class189.getWidget(class55.field407[--class171.field1587]);
      } else {
         var3 = var2?class182.field1766:class20.field155;
      }

      if(var0 == 1927) {
         if(class55.field404 >= 10) {
            throw new RuntimeException();
         } else if(var3.field3659 == null) {
            return 0;
         } else {
            class9 var4 = new class9();
            var4.field63 = var3;
            var4.field69 = var3.field3659;
            var4.field73 = class55.field404 + 1;
            client.field3811.method5600(var4);
            return 1;
         }
      } else {
         return 2;
      }
   }
}
