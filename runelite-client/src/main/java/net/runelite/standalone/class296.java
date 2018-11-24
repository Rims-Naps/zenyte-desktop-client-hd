package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSScript;
import netscape.javascript.JSObject;

@ObfuscatedName("cz")
public class class296 extends class324 implements RSScript {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class100 field3698;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lea;"
   )
   static class316 field3696;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1321724409
   )
   int field3692;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1131760193
   )
   int field3693;
   @ObfuscatedName("l")
   int[] field3697;
   @ObfuscatedName("s")
   String[] field3690;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "[Lga;"
   )
   class235[] field3695;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 184730681
   )
   int field3700;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 83431041
   )
   int field3691;
   @ObfuscatedName("w")
   int[] field3689;

   static {
      field3698 = new class100(128);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IS)[Lga;",
      garbageValue = "908"
   )
   class235[] method5783(int var1) {
      return new class235[var1];
   }

   public int[] getInstructions() {
      return this.field3697;
   }

   public int[] getIntOperands() {
      return this.field3689;
   }

   @ObfuscatedName("jm")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "-98"
   )
   static void method5789(String var0) {
      class193.field2752 = var0;

      try {
         String var1 = class302.field3755.getParameter(class182.field2497.field2499);
         String var2 = class302.field3755.getParameter(class182.field2494.field2499);
         String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
         if(var0.length() == 0) {
            var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
         } else {
            var3 = var3 + "; Expires=" + class44.method873(class321.method6252() + 94608000000L) + "; Max-Age=" + 94608000L;
         }

         client var4 = class302.field3755;
         String var5 = "document.cookie=\"" + var3 + "\"";
         JSObject.getWindow(var4).eval(var5);
      } catch (Throwable var6) {
         ;
      }

   }
}
