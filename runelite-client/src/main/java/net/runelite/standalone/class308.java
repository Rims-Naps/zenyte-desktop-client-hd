package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
public class class308 {
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1365269897
   )
   static int field3811;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Laz;"
   )
   public static final class308 field3804;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Laz;"
   )
   public static final class308 field3806;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Laz;"
   )
   public static final class308 field3808;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Laz;"
   )
   public static final class308 field3803;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Laz;"
   )
   public static final class308 field3807;
   @ObfuscatedName("a")
   public final String field3809;

   static {
      field3808 = new class308("details");
      field3804 = new class308("compositemap");
      field3807 = new class308("compositetexture");
      field3806 = new class308("area");
      field3803 = new class308("labels");
   }

   class308(String var1) {
      this.field3809 = var1;
   }

   @ObfuscatedName("im")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-1792182714"
   )
   static void method6053(boolean var0) {
      client.field2153 = var0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;Lik;I)I",
      garbageValue = "-846110006"
   )
   static int method6052(class217 var0, class217 var1) {
      int var2 = 0;
      if(var0.method4419("title.jpg", "")) {
         ++var2;
      }

      if(var1.method4419("logo", "")) {
         ++var2;
      }

      if(var1.method4419("logo_deadman_mode", "")) {
         ++var2;
      }

      if(var1.method4419("titlebox", "")) {
         ++var2;
      }

      if(var1.method4419("titlebutton", "")) {
         ++var2;
      }

      if(var1.method4419("runes", "")) {
         ++var2;
      }

      if(var1.method4419("title_mute", "")) {
         ++var2;
      }

      if(var1.method4419("options_radio_buttons,0", "")) {
         ++var2;
      }

      if(var1.method4419("options_radio_buttons,2", "")) {
         ++var2;
      }

      if(var1.method4419("options_radio_buttons,4", "")) {
         ++var2;
      }

      if(var1.method4419("options_radio_buttons,6", "")) {
         ++var2;
      }

      var1.method4419("sl_back", "");
      var1.method4419("sl_flags", "");
      var1.method4419("sl_arrows", "");
      var1.method4419("sl_stars", "");
      var1.method4419("sl_button", "");
      return var2;
   }
}
