package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
public class class169 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lx;"
   )
   public static final class169 field1568;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lx;"
   )
   public static final class169 field1560;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lx;"
   )
   public static final class169 field1561;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1860972039
   )
   final int field1563;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 914363547
   )
   final int field1566;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1859459549
   )
   final int field1564;

   static {
      field1568 = new class169(2, 0, 4);
      field1560 = new class169(0, 1, 2);
      field1561 = new class169(1, 2, 0);
   }

   class169(int var1, int var2, int var3) {
      this.field1566 = var1;
      this.field1563 = var2;
      this.field1564 = var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(FI)Z",
      garbageValue = "1079940941"
   )
   boolean method2873(float var1) {
      return var1 >= (float)this.field1564;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "385464757"
   )
   static void method2880() {
      if(class160.field1500.toLowerCase().indexOf("microsoft") != -1) {
         class135.field1344[186] = 57;
         class135.field1344[187] = 27;
         class135.field1344[188] = 71;
         class135.field1344[189] = 26;
         class135.field1344[190] = 72;
         class135.field1344[191] = 73;
         class135.field1344[192] = 58;
         class135.field1344[219] = 42;
         class135.field1344[220] = 74;
         class135.field1344[221] = 43;
         class135.field1344[222] = 59;
         class135.field1344[223] = 28;
      } else {
         class135.field1344[44] = 71;
         class135.field1344[45] = 26;
         class135.field1344[46] = 72;
         class135.field1344[47] = 73;
         class135.field1344[59] = 57;
         class135.field1344[61] = 27;
         class135.field1344[91] = 42;
         class135.field1344[92] = 74;
         class135.field1344[93] = 43;
         class135.field1344[192] = 28;
         class135.field1344[222] = 58;
         class135.field1344[520] = 59;
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-2036569419"
   )
   static int method2877(int var0, class252 var1, boolean var2) {
      class329 var3 = var2?class182.field1766:class20.field155;
      if(var0 == 1500) {
         class55.field407[++class171.field1587 - 1] = var3.field3620;
         return 1;
      } else if(var0 == 1501) {
         class55.field407[++class171.field1587 - 1] = var3.field3558;
         return 1;
      } else if(var0 == 1502) {
         class55.field407[++class171.field1587 - 1] = var3.field3559;
         return 1;
      } else if(var0 == 1503) {
         class55.field407[++class171.field1587 - 1] = var3.field3560;
         return 1;
      } else if(var0 == 1504) {
         class55.field407[++class171.field1587 - 1] = var3.field3569?1:0;
         return 1;
      } else if(var0 == 1505) {
         class55.field407[++class171.field1587 - 1] = var3.field3563;
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
   static void method2874(int var0) {
      if(var0 == -3) {
         class226.method4059("Connection timed out.", "Please try using a different world.", "");
      } else if(var0 == -2) {
         class226.method4059("", "Error connecting to server.", "");
      } else if(var0 == -1) {
         class226.method4059("No response from server.", "Please try using a different world.", "");
      } else if(var0 == 3) {
         class325.field3492 = 3;
         class325.field3483 = 1;
      } else if(var0 == 4) {
         class325.field3492 = 12;
         class325.field3465 = 0;
      } else if(var0 == 5) {
         class325.field3483 = 2;
         class226.method4059("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
      } else if(var0 == 6) {
         class226.method4059("Zenyte has been updated!", "Please reload this page.", "");
      } else if(var0 == 7) {
         class226.method4059("This world is full.", "Please use a different world.", "");
      } else if(var0 == 8) {
         class226.method4059("Unable to connect.", "Login server offline.", "");
      } else if(var0 == 9) {
         class226.method4059("Login limit exceeded.", "Too many connections from your address.", "");
      } else if(var0 == 10) {
         class226.method4059("Unable to connect.", "Bad session id.", "");
      } else if(var0 == 11) {
         class226.method4059("We suspect someone knows your password.", "Press \'change your password\' on front page.", "");
      } else if(var0 == 12) {
         class226.method4059("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
      } else if(var0 == 13) {
         class226.method4059("Could not complete login.", "Please try using a different world.", "");
      } else if(var0 == 14) {
         class226.method4059("The server is being updated.", "Please wait 1 minute and try again.", "");
      } else if(var0 == 16) {
         class226.method4059("Too many login attempts.", "Please wait a few minutes before trying again.", "");
      } else if(var0 == 17) {
         class226.method4059("You are standing in a members-only area.", "To play on this world move to a free area first", "");
      } else if(var0 == 18) {
         class325.field3492 = 12;
         class325.field3465 = 1;
      } else if(var0 == 19) {
         class226.method4059("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
      } else if(var0 == 20) {
         class226.method4059("Invalid loginserver requested.", "Please try using a different world.", "");
      } else if(var0 == 22) {
         class226.method4059("Malformed login packet.", "Please try again.", "");
      } else if(var0 == 23) {
         class226.method4059("No reply from loginserver.", "Please wait 1 minute and try again.", "");
      } else if(var0 == 24) {
         class226.method4059("Error loading your profile.", "Please contact customer support.", "");
      } else if(var0 == 25) {
         class226.method4059("Unexpected loginserver response.", "Please try using a different world.", "");
      } else if(var0 == 26) {
         class226.method4059("This computers address has been blocked", "as it was used to break our rules.", "");
      } else if(var0 == 27) {
         class226.method4059("", "Service unavailable.", "");
      } else if(var0 == 31) {
         class226.method4059("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
      } else if(var0 == 32) {
         class226.method4059("Your attempt to log into your account was", "unsuccessful.  Don\'t worry, you can sort", "this out by visiting the billing system.");
      } else if(var0 == 37) {
         class226.method4059("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
      } else if(var0 == 38) {
         class226.method4059("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
      } else if(var0 == 55) {
         class325.field3492 = 8;
      } else {
         if(var0 == 56) {
            class226.method4059("Enter the 6-digit code generated by your", "authenticator app.", "");
            class188.method3239(11);
            return;
         }

         if(var0 == 57) {
            class226.method4059("The code you entered was incorrect.", "Please try again.", "");
            class188.method3239(11);
            return;
         }

         if(var0 == 61) {
            class325.field3492 = 7;
         } else {
            class226.method4059("Unexpected server response", "Please try using a different world.", "");
         }
      }

      class188.method3239(10);
   }

   @ObfuscatedName("ji")
   @ObfuscatedSignature(
      signature = "(IIIILlp;Lht;I)V",
      garbageValue = "2101027206"
   )
   static final void method2878(int var0, int var1, int var2, int var3, class26 var4, class123 var5) {
      int var6 = var3 * var3 + var2 * var2;
      if(var6 > 4225 && var6 < 90000) {
         int var7 = client.field3802 & 2047;
         int var8 = class257.field2564[var7];
         int var9 = class257.field2558[var7];
         int var10 = var3 * var8 + var9 * var2 >> 16;
         int var11 = var3 * var9 - var8 * var2 >> 16;
         double var12 = Math.atan2((double)var10, (double)var11);
         int var14 = var5.field1174 / 2 - 25;
         int var15 = (int)(Math.sin(var12) * (double)var14);
         int var16 = (int)(Math.cos(var12) * (double)var14);
         byte var17 = 20;
         class83.field748.method442(var15 + (var0 + var5.field1174 / 2 - var17 / 2), var5.field1171 / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
      } else {
         class278.method4944(var0, var1, var2, var3, var4, var5);
      }

   }
}
