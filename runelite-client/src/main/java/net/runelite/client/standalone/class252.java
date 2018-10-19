package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSScript;
import netscape.javascript.JSObject;

@ObfuscatedName("cz")
public class class252 extends class193 implements RSScript {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class124 field2500;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lea;"
   )
   static class156 field2498;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "[Lga;"
   )
   class46[] field2497;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1321724409
   )
   int field2494;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1131760193
   )
   int field2495;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 83431041
   )
   int field2493;
   @ObfuscatedName("l")
   int[] field2499;
   @ObfuscatedName("s")
   String[] field2492;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 184730681
   )
   int field2502;
   @ObfuscatedName("w")
   int[] field2491;

   static {
      field2500 = new class124(128);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IS)[Lga;",
      garbageValue = "908"
   )
   class46[] method4512(int var1) {
      return new class46[var1];
   }

   public int[] getInstructions() {
      return this.field2499;
   }

   public int[] getIntOperands() {
      return this.field2491;
   }

   @ObfuscatedName("jm")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "-98"
   )
   static void method4518(String var0) {
      class330.field3693 = var0;

      try {
         String var1 = class113.field1064.getParameter(class71.field667.field669);
         String var2 = class113.field1064.getParameter(class71.field664.field669);
         String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
         if(var0.length() == 0) {
            var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
         } else {
            var3 = var3 + "; Expires=" + class33.method552(class234.method4170() + 94608000000L) + "; Max-Age=" + 94608000L;
         }

         client var4 = class113.field1064;
         String var5 = "document.cookie=\"" + var3 + "\"";
         JSObject.getWindow(var4).eval(var5);
      } catch (Throwable var6) {
         ;
      }

   }
}
