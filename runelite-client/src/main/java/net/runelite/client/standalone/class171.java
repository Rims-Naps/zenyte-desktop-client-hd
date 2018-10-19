package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
public class class171 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Laz;"
   )
   public static final class171 field1584;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1365269897
   )
   static int field1587;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Laz;"
   )
   public static final class171 field1579;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Laz;"
   )
   public static final class171 field1580;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Laz;"
   )
   public static final class171 field1582;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Laz;"
   )
   public static final class171 field1583;
   @ObfuscatedName("a")
   public final String field1585;

   static {
      field1584 = new class171("details");
      field1580 = new class171("compositemap");
      field1583 = new class171("compositetexture");
      field1582 = new class171("area");
      field1579 = new class171("labels");
   }

   class171(String var1) {
      this.field1585 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;Lik;I)I",
      garbageValue = "-846110006"
   )
   static int method2887(class148 var0, class148 var1) {
      int var2 = 0;
      if(var0.method2600("title.jpg", "")) {
         ++var2;
      }

      if(var1.method2600("logo", "")) {
         ++var2;
      }

      if(var1.method2600("logo_deadman_mode", "")) {
         ++var2;
      }

      if(var1.method2600("titlebox", "")) {
         ++var2;
      }

      if(var1.method2600("titlebutton", "")) {
         ++var2;
      }

      if(var1.method2600("runes", "")) {
         ++var2;
      }

      if(var1.method2600("title_mute", "")) {
         ++var2;
      }

      if(var1.method2600("options_radio_buttons,0", "")) {
         ++var2;
      }

      if(var1.method2600("options_radio_buttons,2", "")) {
         ++var2;
      }

      if(var1.method2600("options_radio_buttons,4", "")) {
         ++var2;
      }

      if(var1.method2600("options_radio_buttons,6", "")) {
         ++var2;
      }

      var1.method2600("sl_back", "");
      var1.method2600("sl_flags", "");
      var1.method2600("sl_arrows", "");
      var1.method2600("sl_stars", "");
      var1.method2600("sl_button", "");
      return var2;
   }

   @ObfuscatedName("im")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-1792182714"
   )
   static void method2888(boolean var0) {
      client.field3732 = var0;
   }
}
