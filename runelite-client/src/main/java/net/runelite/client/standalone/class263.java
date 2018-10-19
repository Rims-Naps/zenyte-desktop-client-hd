package net.runelite.client.standalone;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
public class class263 {
   @ObfuscatedName("sd")
   @ObfuscatedSignature(
      signature = "Lip;"
   )
   public static class219 field2912;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -961404071
   )
   static int field2910;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lcz;"
   )
   class252 field2908;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -486870561
   )
   int field2906;
   @ObfuscatedName("s")
   String[] field2905;
   @ObfuscatedName("w")
   int[] field2907;

   class263() {
      this.field2906 = -1;
   }

   @ObfuscatedName("ix")
   @ObfuscatedSignature(
      signature = "(II)Ljava/lang/String;",
      garbageValue = "-1362223544"
   )
   static final String method4815(int var0) {
      String var1 = Integer.toString(var0);

      for(int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
         var1 = var1.substring(0, var2) + "," + var1.substring(var2);
      }

      return var1.length() > 9?" " + class294.method5136(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>":(var1.length() > 6?" " + class294.method5136(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>":" " + class294.method5136(16776960) + var1 + "</col>");
   }

   @ObfuscatedName("hh")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-963654605"
   )
   static void method4816() {
      class140.method2524(client.field3779 / 2 + class170.field1571, class319.field3406);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lga;III)I",
      garbageValue = "283886816"
   )
   static int method4819(class46 var0, int var1, int var2) {
      if(var0 == null) {
         return var2;
      } else {
         class262 var3 = (class262)var0.method792((long)var1);
         return var3 == null?var2:var3.field2904;
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "434636237"
   )
   static int method4814(int var0) {
      return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F));
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;ZI)Lda;",
      garbageValue = "-978776883"
   )
   public static class38 method4817(String var0, String var1, boolean var2) {
      File var3 = new File(class323.field3453, "preferences" + var0 + ".dat");
      if(var3.exists()) {
         try {
            class38 var10 = new class38(var3, "rw", 10000L);
            return var10;
         } catch (IOException var9) {
            ;
         }
      }

      String var4 = "";
      if(class135.field1346 == 33) {
         var4 = "_rc";
      } else if(class135.field1346 == 34) {
         var4 = "_wip";
      }

      File var5 = new File(class135.field1333, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
      class38 var6;
      if(!var2 && var5.exists()) {
         try {
            var6 = new class38(var5, "rw", 10000L);
            return var6;
         } catch (IOException var8) {
            ;
         }
      }

      try {
         var6 = new class38(var3, "rw", 10000L);
         return var6;
      } catch (IOException var7) {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("jw")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "633349511"
   )
   static final void method4818() {
      for(int var0 = 0; var0 < class11.field90; ++var0) {
         class63 var1 = client.field3848[class11.field91[var0]];
         var1.method1107();
      }

      Iterator var2 = class297.field3193.iterator();

      while(var2.hasNext()) {
         class286 var3 = (class286)var2.next();
         var3.method5063();
      }

      if(class165.field1533 != null) {
         class165.field1533.method2983();
      }

   }
}
