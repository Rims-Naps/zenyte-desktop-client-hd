package net.runelite.standalone;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSMouseWheelHandler;

@ObfuscatedName("ax")
public final class class76 implements class234, MouseWheelListener, RSMouseWheelHandler {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 692523279
   )
   int field852;

   class76() {
      this.field852 = 0;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;B)V",
      garbageValue = "-36"
   )
   void method1562(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;I)V",
      garbageValue = "-1750651331"
   )
   void method1561(Component var1) {
      var1.addMouseWheelListener(this);
   }

   public synchronized void copy$mouseWheelMoved(MouseWheelEvent var1) {
      this.field852 += var1.getWheelRotation();
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      var1 = class302.field3755.getCallbacks().mouseWheelMoved(var1);
      if(!var1.isConsumed()) {
         this.copy$mouseWheelMoved(var1);
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1682512698"
   )
   public synchronized int vmethod4669() {
      int var1 = this.field852;
      this.field852 = 0;
      return var1;
   }
}
