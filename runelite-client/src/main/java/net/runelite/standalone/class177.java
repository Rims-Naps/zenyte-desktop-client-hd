package net.runelite.standalone;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
public class class177 {
   @ObfuscatedName("sd")
   @ObfuscatedSignature(
      signature = "Lip;"
   )
   public static class206 field2445;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -961404071
   )
   static int field2443;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -486870561
   )
   int field2439;
   @ObfuscatedName("s")
   String[] field2438;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lcz;"
   )
   class296 field2441;
   @ObfuscatedName("w")
   int[] field2440;

   class177() {
      this.field2439 = -1;
   }

   @ObfuscatedName("ix")
   @ObfuscatedSignature(
      signature = "(II)Ljava/lang/String;",
      garbageValue = "-1362223544"
   )
   static final String method3677(int var0) {
      String var1 = Integer.toString(var0);

      for(int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
         var1 = var1.substring(0, var2) + "," + var1.substring(var2);
      }

      return var1.length() > 9?" " + class64.method1354(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>":(var1.length() > 6?" " + class64.method1354(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>":" " + class64.method1354(16776960) + var1 + "</col>");
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lga;III)I",
      garbageValue = "283886816"
   )
   static int method3681(class235 var0, int var1, int var2) {
      if(var0 == null) {
         return var2;
      } else {
         class228 var3 = (class228)var0.method4670((long)var1);
         return var3 == null?var2:var3.field3057;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;ZI)Lda;",
      garbageValue = "-978776883"
   )
   public static class283 method3679(String var0, String var1, boolean var2) {
      File var3 = new File(class305.field3776, "preferences" + var0 + ".dat");
      if(var3.exists()) {
         try {
            class283 var10 = new class283(var3, "rw", 10000L);
            return var10;
         } catch (IOException var9) {
            ;
         }
      }

      String var4 = "";
      if(class96.field1054 == 33) {
         var4 = "_rc";
      } else if(class96.field1054 == 34) {
         var4 = "_wip";
      }

      File var5 = new File(class96.field1041, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
      class283 var6;
      if(!var2 && var5.exists()) {
         try {
            var6 = new class283(var5, "rw", 10000L);
            return var6;
         } catch (IOException var8) {
            ;
         }
      }

      try {
         var6 = new class283(var3, "rw", 10000L);
         return var6;
      } catch (IOException var7) {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "434636237"
   )
   static int method3676(int var0) {
      return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F));
   }

   @ObfuscatedName("hh")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-963654605"
   )
   static void method3678() {
      class17.method367(client.field2200 / 2 + class138.field1776, class214.field2934);
   }

   @ObfuscatedName("jw")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "633349511"
   )
   static final void method3680() {
      for(int var0 = 0; var0 < class152.field1874; ++var0) {
         class199 var1 = client.field2269[class152.field1875[var0]];
         var1.method3973();
      }

      Iterator var2 = class38.field366.iterator();

      while(var2.hasNext()) {
         class227 var3 = (class227)var2.next();
         var3.method4596();
      }

      if(class250.field3328 != null) {
         class250.field3328.method5088();
      }

   }
}
