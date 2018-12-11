package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
public class class181 {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lx;"
   )
   public static final class181 field2472;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lx;"
   )
   public static final class181 field2480;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lx;"
   )
   public static final class181 field2473;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 914363547
   )
   final int field2478;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1859459549
   )
   final int field2476;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1860972039
   )
   final int field2475;

   static {
      field2480 = new class181(2, 0, 4);
      field2472 = new class181(0, 1, 2);
      field2473 = new class181(1, 2, 0);
   }

   class181(int var1, int var2, int var3) {
      this.field2478 = var1;
      this.field2475 = var2;
      this.field2476 = var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(FI)Z",
      garbageValue = "1079940941"
   )
   boolean method3695(float var1) {
      return var1 >= (float)this.field2476;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "385464757"
   )
   static void method3702() {
      if(class165.field1998.toLowerCase().indexOf("microsoft") != -1) {
         class96.field1052[186] = 57;
         class96.field1052[187] = 27;
         class96.field1052[188] = 71;
         class96.field1052[189] = 26;
         class96.field1052[190] = 72;
         class96.field1052[191] = 73;
         class96.field1052[192] = 58;
         class96.field1052[219] = 42;
         class96.field1052[220] = 74;
         class96.field1052[221] = 43;
         class96.field1052[222] = 59;
         class96.field1052[223] = 28;
      } else {
         class96.field1052[44] = 71;
         class96.field1052[45] = 26;
         class96.field1052[46] = 72;
         class96.field1052[47] = 73;
         class96.field1052[59] = 57;
         class96.field1052[61] = 27;
         class96.field1052[91] = 42;
         class96.field1052[92] = 74;
         class96.field1052[93] = 43;
         class96.field1052[192] = 28;
         class96.field1052[222] = 58;
         class96.field1052[520] = 59;
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-2036569419"
   )
   static int method3699(int var0, class296 var1, boolean var2) {
      class187 var3 = var2?class3.field36:class284.field3565;
      if(var0 == 1500) {
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2634;
         return 1;
      } else if(var0 == 1501) {
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2572;
         return 1;
      } else if(var0 == 1502) {
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2573;
         return 1;
      } else if(var0 == 1503) {
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2574;
         return 1;
      } else if(var0 == 1504) {
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2583?1:0;
         return 1;
      } else if(var0 == 1505) {
         class249.field3312[++MapCacheArchiveNames.field3811 - 1] = var3.field2577;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("en")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "2061159387"
   )
   static void method3696(int var0) {
      if(var0 == -3) {
         class163.method3007("Connection timed out.", "Please try using a different world.", "");
      } else if(var0 == -2) {
         class163.method3007("", "Error connecting to server.", "");
      } else if(var0 == -1) {
         class163.method3007("No response from server.", "Please try using a different world.", "");
      } else if(var0 == 3) {
         class39.field398 = 3;
         class39.field389 = 1;
      } else if(var0 == 4) {
         class39.field398 = 12;
         class39.field371 = 0;
      } else if(var0 == 5) {
         class39.field389 = 2;
         class163.method3007("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
      } else if(var0 == 6) {
         class163.method3007("RuneScape has been updated!", "Please reload this page.", "");
      } else if(var0 == 7) {
         class163.method3007("This world is full.", "Please use a different world.", "");
      } else if(var0 == 8) {
         class163.method3007("Unable to connect.", "Login server offline.", "");
      } else if(var0 == 9) {
         class163.method3007("Login limit exceeded.", "Too many connections from your address.", "");
      } else if(var0 == 10) {
         class163.method3007("Unable to connect.", "Bad session id.", "");
      } else if(var0 == 11) {
         class163.method3007("We suspect someone knows your password.", "Press \'change your password\' on front page.", "");
      } else if(var0 == 12) {
         class163.method3007("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
      } else if(var0 == 13) {
         class163.method3007("Could not complete login.", "Please try using a different world.", "");
      } else if(var0 == 14) {
         class163.method3007("The server is being updated.", "Please wait 1 minute and try again.", "");
      } else if(var0 == 16) {
         class163.method3007("Too many login attempts.", "Please wait a few minutes before trying again.", "");
      } else if(var0 == 17) {
         class163.method3007("You are standing in a members-only area.", "To play on this world move to a free area first", "");
      } else if(var0 == 18) {
         class39.field398 = 12;
         class39.field371 = 1;
      } else if(var0 == 19) {
         class163.method3007("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
      } else if(var0 == 20) {
         class163.method3007("Invalid loginserver requested.", "Please try using a different world.", "");
      } else if(var0 == 22) {
         class163.method3007("Malformed login packet.", "Please try again.", "");
      } else if(var0 == 23) {
         class163.method3007("No reply from loginserver.", "Please wait 1 minute and try again.", "");
      } else if(var0 == 24) {
         class163.method3007("Error loading your profile.", "Please contact customer support.", "");
      } else if(var0 == 25) {
         class163.method3007("Unexpected loginserver response.", "Please try using a different world.", "");
      } else if(var0 == 26) {
         class163.method3007("This computers address has been blocked", "as it was used to break our rules.", "");
      } else if(var0 == 27) {
         class163.method3007("", "Service unavailable.", "");
      } else if(var0 == 31) {
         class163.method3007("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
      } else if(var0 == 32) {
         class163.method3007("Your attempt to log into your account was", "unsuccessful.  Don\'t worry, you can sort", "this out by visiting the billing system.");
      } else if(var0 == 37) {
         class163.method3007("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
      } else if(var0 == 38) {
         class163.method3007("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
      } else if(var0 == 55) {
         class39.field398 = 8;
      } else {
         if(var0 == 56) {
            class163.method3007("Enter the 6-digit code generated by your", "authenticator app.", "");
            class142.method2635(11);
            return;
         }

         if(var0 == 57) {
            class163.method3007("The code you entered was incorrect.", "Please try again.", "");
            class142.method2635(11);
            return;
         }

         if(var0 == 61) {
            class39.field398 = 7;
         } else {
            class163.method3007("Unexpected server response", "Please try using a different world.", "");
         }
      }

      class142.method2635(10);
   }

   @ObfuscatedName("ji")
   @ObfuscatedSignature(
      signature = "(IIIILlp;Lht;I)V",
      garbageValue = "2101027206"
   )
   static final void method3700(int var0, int var1, int var2, int var3, SpritePixels var4, class198 var5) {
      int var6 = var3 * var3 + var2 * var2;
      if(var6 > 4225 && var6 < 90000) {
         int var7 = client.field2223 & 2047;
         int var8 = class211.field2920[var7];
         int var9 = class211.field2914[var7];
         int var10 = var3 * var8 + var9 * var2 >> 16;
         int var11 = var3 * var9 - var8 * var2 >> 16;
         double var12 = Math.atan2((double)var10, (double)var11);
         int var14 = var5.field2798 / 2 - 25;
         int var15 = (int)(Math.sin(var12) * (double)var14);
         int var16 = (int)(Math.cos(var12) * (double)var14);
         byte var17 = 20;
         class85.field922.method279(var15 + (var0 + var5.field2798 / 2 - var17 / 2), var5.field2795 / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
      } else {
         class277.method5381(var0, var1, var2, var3, var4, var5);
      }

   }
}
