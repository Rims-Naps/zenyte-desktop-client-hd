package net.runelite.standalone;

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
public class class159 implements RSFriendManager {
   @ObfuscatedName("qq")
   @ObfuscatedGetter(
      intValue = 2026649547
   )
   static int field1954;
   @ObfuscatedName("u")
   static String[] field1953;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 466401421
   )
   int field1952;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   final class258 field1950;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lkh;"
   )
   public final class9 field1948;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lkc;"
   )
   public final class306 field1946;

   @ObfuscatedSignature(
      signature = "(Lly;)V"
   )
   class159(class258 var1) {
      this.field1952 = 0;
      this.field1950 = var1;
      this.field1946 = new class306(var1);
      this.field1948 = new class9(var1);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(Lka;I)Z",
      garbageValue = "-2043355866"
   )
   final boolean method2905(class158 var1) {
      class73 var2 = (class73)this.field1946.method3031(var1);
      return var2 != null && var2.method1346();
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Lka;B)Z",
      garbageValue = "71"
   )
   final boolean method2898(class158 var1) {
      return var1 == null?false:this.field1948.method3030(var1);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lka;ZI)Z",
      garbageValue = "745769580"
   )
   final boolean method2897(class158 var1, boolean var2) {
      return var1 == null?false:(var1.equals(class32.field303.field2802)?true:this.field1946.method6029(var1, var2));
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "70"
   )
   final void method2893() {
      this.field1952 = 1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "80"
   )
   final void method2902() {
      for(class134 var1 = (class134)this.field1946.field3790.method5688(); var1 != null; var1 = (class134)this.field1946.field3790.method5691()) {
         if((long)var1.field1742 < class321.method6252() / 1000L - 5L) {
            if(var1.field1740 > 0) {
               ServerProt.method3131(5, "", var1.field1741 + " has logged in.");
            }

            if(var1.field1740 == 0) {
               ServerProt.method3131(5, "", var1.field1741 + " has logged out.");
            }

            var1.method2964();
         }
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1908829615"
   )
   boolean method2892() {
      return this.field1952 == 2;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-150220185"
   )
   final void method2916(String var1) {
      if(var1 != null) {
         class158 var2 = new class158(var1, this.field1950);
         if(var2.method2870()) {
            if(this.method2900()) {
               class307.method6050();
            } else if(class32.field303.field2802.equals(var2)) {
               class64.method1355();
            } else if(this.method2897(var2, false)) {
               WorldMapData.method2707(var1 + " is already on your friend list");
            } else if(this.method2898(var2)) {
               class290.method5706(var1);
            } else {
               class12 var3 = class150.method2761(ClientProt.field3197, client.field2384.field1770);
               var3.field121.method2288(class118.method2136(var1));
               var3.field121.writeString(var1);
               client.field2384.method2573(var3);
            }
         }
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-737399252"
   )
   final void method2903(String var1) {
      this.rl$removeFriend(var1);
      if(var1 != null) {
         class158 var2 = new class158(var1, this.field1950);
         if(var2.method2870()) {
            if(this.field1946.method3034(var2)) {
               client.field2404 = client.field2338;
               class12 var3 = class150.method2761(ClientProt.field3210, client.field2384.field1770);
               var3.field121.method2288(class118.method2136(var1));
               var3.field121.writeString(var1);
               client.field2384.method2573(var3);
            }

            for(int var5 = 0; var5 < class152.field1874; ++var5) {
               class199 var4 = client.field2269[class152.field1875[var5]];
               var4.method3973();
            }

            Iterator var6 = class38.field366.iterator();

            while(var6.hasNext()) {
               class227 var7 = (class227)var6.next();
               var7.method4596();
            }

            if(class250.field3328 != null) {
               class250.field3328.method5088();
            }

         }
      }
   }

   public void rl$removeFriend(String var1) {
      RemovedFriend var2 = new RemovedFriend(var1);
      class302.field3755.getCallbacks().post(var2);
   }

   public RSFriendContainer getFriendContainer() {
      return this.field1946;
   }

   public RSIgnoreContainer getIgnoreContainer() {
      return this.field1948;
   }

   public boolean isFriended(RSName var1, boolean var2) {
      return this.method2897((class158)var1, var2);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "91"
   )
   final boolean method2900() {
      return this.field1946.method3029() || this.field1946.method3041() >= 200 && client.field2271 != 1;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "-15"
   )
   final void method2904(String var1) {
      if(var1 != null) {
         class158 var2 = new class158(var1, this.field1950);
         if(var2.method2870()) {
            if(this.field1948.method3034(var2)) {
               client.field2404 = client.field2338;
               class12 var3 = class150.method2761(ClientProt.field3228, client.field2384.field1770);
               var3.field121.method2288(class118.method2136(var1));
               var3.field121.writeString(var1);
               client.field2384.method2573(var3);
            }

            class316.method6199();
         }
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "774209927"
   )
   final void method2929(String var1) {
      if(var1 != null) {
         class158 var2 = new class158(var1, this.field1950);
         if(var2.method2870()) {
            if(this.method2944()) {
               class218.method4501();
            } else if(class32.field303.field2802.equals(var2)) {
               class92.method1716();
            } else if(this.method2898(var2)) {
               WorldMapData.method2707(var1 + " is already on your ignore list");
            } else if(this.method2897(var2, false)) {
               class263.method5247(var1);
            } else {
               class131.method2522(var1);
            }
         }
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "280844374"
   )
   final boolean method2944() {
      return this.field1948.method3029() || this.field1948.method3041() >= 100 && client.field2271 != 1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-303310762"
   )
   final void method2896() {
      this.field1952 = 0;
      this.field1946.method3027();
      this.field1948.method3027();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;IB)V",
      garbageValue = "17"
   )
   final void method2894(Buffer var1, int var2) {
      this.field1946.method6019(var1, var2);
      this.field1952 = 2;
      class177.method3680();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;III)[Lle;",
      garbageValue = "1930936171"
   )
   public static class303[] method2957(class217 var0, int var1, int var2) {
      byte[] var4 = var0.method4398(var1, var2, -449231794);
      boolean var3;
      if(var4 == null) {
         var3 = false;
      } else {
         class253.method5080(var4);
         var3 = true;
      }

      return !var3?null:class306.method6035();
   }
}
