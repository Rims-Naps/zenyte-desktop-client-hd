package net.runelite.client.standalone;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSMouseWheelHandler;

@ObfuscatedName("ax")
public final class class206 implements class115, MouseWheelListener, RSMouseWheelHandler {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 692523279
   )
   int field2008;

   class206() {
      this.field2008 = 0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;I)V",
      garbageValue = "-1750651331"
   )
   void method3506(Component var1) {
      var1.addMouseWheelListener(this);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;B)V",
      garbageValue = "-36"
   )
   void method3507(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1682512698"
   )
   public synchronized int vmethod3509() {
      int var1 = this.field2008;
      this.field2008 = 0;
      return var1;
   }

   public synchronized void copy$mouseWheelMoved(MouseWheelEvent var1) {
      this.field2008 += var1.getWheelRotation();
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      var1 = class113.field1064.getCallbacks().mouseWheelMoved(var1);
      if(!var1.isConsumed()) {
         this.copy$mouseWheelMoved(var1);
      }

   }
}
