package net.runelite.standalone;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
public class class226 {
   @ObfuscatedName("gm")
   static int[] field3047;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -985001373
   )
   public static int field3046;
   @ObfuscatedName("di")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class6 field3043;

   @ObfuscatedName("gt")
   @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "-47"
   )
   static final void method4569(boolean var0) {
      class185.method3733();
      ++client.field2384.field1762;
      if(client.field2384.field1762 >= 50 || var0) {
         client.field2384.field1762 = 0;
         if(!client.field2421 && client.field2384.method2586() != null) {
            class12 var1 = class150.method2761(ClientProt.field3178, client.field2384.field1770);
            client.field2384.method2573(var1);

            try {
               client.field2384.method2591();
            } catch (IOException var3) {
               client.field2421 = true;
            }
         }

      }
   }

   @ObfuscatedName("jj")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "841118834"
   )
   static final void method4567(String var0) {
      if(!var0.equals("")) {
         class12 var1 = class150.method2761(ClientProt.field3234, client.field2384.field1770);
         var1.field121.method2288(class118.method2136(var0));
         var1.field121.writeString(var0);
         client.field2384.method2573(var1);
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1802767349"
   )
   public static void method4568() {
      class104.field1151.method1816();
   }
}
