package net.runelite.standalone;

import net.runelite.api.MenuAction;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
public class class28 {
   @ObfuscatedName("lm")
   @ObfuscatedGetter(
      intValue = -495987397
   )
   static int field281;

   @ObfuscatedName("hc")
   static final void method483(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7, byte var8) {
      if(var2 >= 2000) {
         var2 -= 2000;
      }

      MenuOptionClicked var9 = new MenuOptionClicked();
      var9.setActionParam(var0);
      var9.setMenuOption(var4);
      var9.setMenuTarget(var5);
      var9.setMenuAction(MenuAction.of(var2));
      var9.setId(var3);
      var9.setWidgetId(var1);
      class302.field3755.getCallbacks().post(var9);
      if(!var9.isConsumed()) {
         client.copy$menuAction(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      }
   }

   @ObfuscatedName("ht")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
      garbageValue = "-1614940408"
   )
   public static final void method484(String var0, String var1, int var2, int var3, int var4, int var5) {
      WorldMapManager.method4155(var0, var1, var2, var3, var4, var5, false);
   }
}
