package net.runelite.client.standalone;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.FocusListener;
import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.rs.api.RSGameCanvas;

@ObfuscatedName("ar")
public final class class33 extends Canvas implements RSGameCanvas {
   @ObfuscatedName("ee")
   @ObfuscatedGetter(
      intValue = 750655135
   )
   static int field265;
   public static boolean shouldNotHaveFocus;
   @ObfuscatedName("f")
   Component field263;

   class33(Component var1) {
      this.field263 = var1;
   }

   public final void update(Graphics var1) {
      this.field263.update(var1);
   }

   public final void paint(Graphics var1) {
      this.field263.paint(var1);
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
      if(!class113.field1064.isResized() && class113.field1064.isStretchedEnabled()) {
         super.setSize(class113.field1064.getStretchedDimensions().width, class113.field1064.getStretchedDimensions().height);
      } else {
         super.setSize(var1, var2);
      }

   }

   public void setLocation(int var1, int var2) {
      if(!class113.field1064.isResized() && class113.field1064.isStretchedEnabled()) {
         super.setLocation((this.getParent().getWidth() - class113.field1064.getStretchedDimensions().width) / 2, 0);
      } else {
         super.setLocation(var1, var2);
      }

   }

   @ObfuscatedName("f")
   public static String method552(long var0) {
      class106.field990.setTime(new Date(var0));
      int var2 = class106.field990.get(7);
      int var3 = class106.field990.get(5);
      int var4 = class106.field990.get(2);
      int var5 = class106.field990.get(1);
      int var6 = class106.field990.get(11);
      int var7 = class106.field990.get(12);
      int var8 = class106.field990.get(13);
      return class106.field991[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + class106.field989[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
   }
}
