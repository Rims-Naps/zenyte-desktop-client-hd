package net.runelite.standalone;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.FocusListener;
import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.rs.api.RSGameCanvas;

@ObfuscatedName("ar")
public final class class44 extends Canvas implements RSGameCanvas {
   public static boolean shouldNotHaveFocus;
   @ObfuscatedName("ee")
   @ObfuscatedGetter(
      intValue = 750655135
   )
   static int field487;
   @ObfuscatedName("f")
   Component field485;

   class44(Component var1) {
      this.field485 = var1;
   }

   public final void update(Graphics var1) {
      this.field485.update(var1);
   }

   public final void paint(Graphics var1) {
      this.field485.paint(var1);
   }

   public void removeFocusListener(FocusListener var1) {
      super.removeFocusListener(var1);
      shouldNotHaveFocus = !this.hasFocus();
   }

   public void requestFocus() {
      if(!shouldNotHaveFocus) {
         this.requestFocusInWindow();
      }

   }

   public void setSize(int var1, int var2) {
      if(class302.field3755.isStretchedEnabled()) {
         super.setSize(class302.field3755.getStretchedDimensions().width, class302.field3755.getStretchedDimensions().height);
      } else {
         super.setSize(var1, var2);
      }

   }

   public void setLocation(int var1, int var2) {
      if(class302.field3755.isStretchedEnabled()) {
         super.setLocation((this.getParent().getWidth() - class302.field3755.getStretchedDimensions().width) / 2, 0);
      } else {
         super.setLocation(var1, var2);
      }

   }

   @ObfuscatedName("f")
   public static String method873(long var0) {
      class252.field3334.setTime(new Date(var0));
      int var2 = class252.field3334.get(7);
      int var3 = class252.field3334.get(5);
      int var4 = class252.field3334.get(2);
      int var5 = class252.field3334.get(1);
      int var6 = class252.field3334.get(11);
      int var7 = class252.field3334.get(12);
      int var8 = class252.field3334.get(13);
      return class252.field3335[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + class252.field3333[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
   }
}
