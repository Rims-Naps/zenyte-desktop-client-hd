package net.runelite.client.standalone;

import java.util.Iterator;
import net.runelite.api.events.RemovedFriend;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFriendContainer;
import net.runelite.rs.api.RSFriendManager;
import net.runelite.rs.api.RSIgnoreContainer;
import net.runelite.rs.api.RSName;

@ObfuscatedName("bt")
public class class328 implements RSFriendManager {
   @ObfuscatedName("qq")
   @ObfuscatedGetter(
      intValue = 2026649547
   )
   static int field3528;
   @ObfuscatedName("u")
   static String[] field3527;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 466401421
   )
   int field3526;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lkc;"
   )
   public final class79 field3520;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   final class179 field3524;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lkh;"
   )
   public final class142 field3522;

   @ObfuscatedSignature(
      signature = "(Lly;)V"
   )
   class328(class179 var1) {
      this.field3526 = 0;
      this.field3524 = var1;
      this.field3520 = new class79(var1);
      this.field3522 = new class142(var1);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(Lka;I)Z",
      garbageValue = "-2043355866"
   )
   final boolean method5825(class49 var1) {
      class155 var2 = (class155)this.field3520.method3625(var1);
      return var2 != null && var2.method5273();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1908829615"
   )
   boolean method5812() {
      return this.field3526 == 2;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "91"
   )
   final boolean method5820() {
      return this.field3520.method3623() || this.field3520.method3635() >= 200 && client.field3850 != 1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "280844374"
   )
   final boolean method5864() {
      return this.field3522.method3623() || this.field3522.method3635() >= 100 && client.field3850 != 1;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-150220185"
   )
   final void method5836(String var1) {
      if(var1 != null) {
         class49 var2 = new class49(var1, this.field3524);
         if(var2.method822()) {
            if(this.method5820()) {
               class150.method2691();
            } else if(class5.field43.field577.equals(var2)) {
               class294.method5137();
            } else if(this.method5817(var2, false)) {
               class87.method1275(var1 + " is already on your friend list");
            } else if(this.method5818(var2)) {
               class13.method145(var1);
            } else {
               class279 var3 = class95.writeClientProt(ClientProt.ADD_FRIEND, client.field3963.field1162);
               var3.field3018.writeByte(class164.method2819(var1));
               var3.field3018.writeString(var1);
               client.field3963.method2235(var3);
            }
         }
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Lka;B)Z",
      garbageValue = "71"
   )
   final boolean method5818(class49 var1) {
      return var1 == null?false:this.field3522.method3624(var1);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lka;ZI)Z",
      garbageValue = "745769580"
   )
   final boolean method5817(class49 var1, boolean var2) {
      return var1 == null?false:(var1.equals(class5.field43.field577)?true:this.field3520.method1208(var1, var2));
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-303310762"
   )
   final void method5816() {
      this.field3526 = 0;
      this.field3520.method3621();
      this.field3522.method3621();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "70"
   )
   final void method5813() {
      this.field3526 = 1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "80"
   )
   final void method5822() {
      for(class70 var1 = (class70)this.field3520.field725.method3935(); var1 != null; var1 = (class70)this.field3520.field725.method3938()) {
         if((long)var1.field650 < class234.method4170() / 1000L - 5L) {
            if(var1.field648 > 0) {
               ServerProt.method4172(5, "", var1.field649 + " has logged in.");
            }

            if(var1.field648 == 0) {
               ServerProt.method4172(5, "", var1.field649 + " has logged out.");
            }

            var1.method3742();
         }
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "774209927"
   )
   final void method5849(String var1) {
      if(var1 != null) {
         class49 var2 = new class49(var1, this.field3524);
         if(var2.method822()) {
            if(this.method5864()) {
               class180.method3022();
            } else if(class5.field43.field577.equals(var2)) {
               class229.method4106();
            } else if(this.method5818(var2)) {
               class87.method1275(var1 + " is already on your ignore list");
            } else if(this.method5817(var2, false)) {
               class281.method5010(var1);
            } else {
               class4.method67(var1);
            }
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;IB)V",
      garbageValue = "17"
   )
   final void method5814(Buffer var1, int var2) {
      this.field3520.method1198(var1, var2);
      this.field3526 = 2;
      class263.method4818();
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-737399252"
   )
   final void method5823(String var1) {
      this.rl$removeFriend(var1);
      if(var1 != null) {
         class49 var2 = new class49(var1, this.field3524);
         if(var2.method822()) {
            if(this.field3520.method3628(var2)) {
               client.field3983 = client.field3917;
               class279 var3 = class95.writeClientProt(ClientProt.field525, client.field3963.field1162);
               var3.field3018.writeByte(class164.method2819(var1));
               var3.field3018.writeString(var1);
               client.field3963.method2235(var3);
            }

            for(int var5 = 0; var5 < class11.field90; ++var5) {
               class63 var4 = client.field3848[class11.field91[var5]];
               var4.method1107();
            }

            Iterator var6 = class297.field3193.iterator();

            while(var6.hasNext()) {
               class286 var7 = (class286)var6.next();
               var7.method5063();
            }

            if(class165.field1533 != null) {
               class165.field1533.method2983();
            }

         }
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "-15"
   )
   final void method5824(String var1) {
      if(var1 != null) {
         class49 var2 = new class49(var1, this.field3524);
         if(var2.method822()) {
            if(this.field3522.method3628(var2)) {
               client.field3983 = client.field3917;
               class279 var3 = class95.writeClientProt(ClientProt.REMOVE_IGNORE, client.field3963.field1162);
               var3.field3018.writeByte(class164.method2819(var1));
               var3.field3018.writeString(var1);
               client.field3963.method2235(var3);
            }

            class156.method2736();
         }
      }
   }

   public void rl$removeFriend(String var1) {
      RemovedFriend var2 = new RemovedFriend(var1);
      class113.field1064.getCallbacks().post(var2);
   }

   public RSFriendContainer getFriendContainer() {
      return this.field3520;
   }

   public RSIgnoreContainer getIgnoreContainer() {
      return this.field3522;
   }

   public boolean isFriended(RSName var1, boolean var2) {
      return this.method5817((class49)var1, var2);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;III)[Lle;",
      garbageValue = "1930936171"
   )
   public static class32[] method5877(class148 var0, int var1, int var2) {
      byte[] var4 = var0.method2579(var1, var2, -449231794);
      boolean var3;
      if(var4 == null) {
         var3 = false;
      } else {
         class194.method3303(var4);
         var3 = true;
      }

      return !var3?null:class79.method1214();
   }
}
