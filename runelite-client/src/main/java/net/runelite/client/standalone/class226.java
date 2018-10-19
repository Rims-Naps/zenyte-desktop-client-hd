package net.runelite.client.standalone;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSMouseInput;

@ObfuscatedName("ai")
public class class226 implements MouseListener, MouseMotionListener, FocusListener, RSMouseInput {
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 678124457
   )
   public static volatile int field2206;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1197583457
   )
   public static volatile int field2207;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1294614313
   )
   public static int field2224;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -462759435
   )
   public static int field2223;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 805376175
   )
   public static int field2216;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      longValue = -7928109937571890123L
   )
   public static long field2225;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      longValue = -8250534395643385033L
   )
   public static volatile long field2213;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 572385303
   )
   public static volatile int field2212;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -943887211
   )
   public static int field2222;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1508519289
   )
   public static volatile int field2211;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -901386581
   )
   public static volatile int field2209;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      longValue = 6560376633049224193L
   )
   public static volatile long field2221;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -2060221495
   )
   public static int field2220;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      longValue = 5872196956972912703L
   )
   public static long field2214;
   @ObfuscatedName("o")
   static String field2227;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lai;"
   )
   public static class226 field2208;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -123614231
   )
   public static volatile int field2210;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 238301101
   )
   public static volatile int field2219;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -29981693
   )
   public static int field2215;
   @ObfuscatedName("at")
   static int[] field2226;
   public int isInEvent;

   static {
      field2208 = new class226();
      field2209 = 0;
      field2210 = 0;
      field2211 = -1;
      field2212 = -1;
      field2213 = -1L;
      field2223 = 0;
      field2215 = 0;
      field2216 = 0;
      field2214 = 0L;
      field2207 = 0;
      field2219 = 0;
      field2206 = 0;
      field2221 = 0L;
      field2222 = 0;
      field2220 = 0;
      field2224 = 0;
      field2225 = 0L;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/event/MouseEvent;I)I",
      garbageValue = "-1754548787"
   )
   final int method4024(MouseEvent var1) {
      int var2 = var1.getButton();
      return !var1.isAltDown() && var2 != 2?(!var1.isMetaDown() && var2 != 3?1:2):4;
   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if(this.isInEvent == 0) {
         var1 = class113.field1064.getCallbacks().mouseMoved(var1);
      }

      if(!var1.isConsumed()) {
         ++this.isInEvent;

         try {
            this.copy$mouseMoved(var1);
         } finally {
            --this.isInEvent;
         }
      }

   }

   public final void copy$mouseClicked(MouseEvent var1) {
      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void copy$mousePressed(MouseEvent var1) {
      if(field2208 != null) {
         field2209 = 0;
         field2219 = var1.getX();
         field2206 = var1.getY();
         field2221 = class234.method4170();
         field2207 = this.method4024(var1);
         if(field2207 != 0) {
            field2210 = field2207;
         }
      }

      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void copy$mouseReleased(MouseEvent var1) {
      if(field2208 != null) {
         field2209 = 0;
         field2210 = 0;
      }

      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void copy$mouseEntered(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void copy$mouseExited(MouseEvent var1) {
      if(field2208 != null) {
         field2209 = 0;
         field2211 = -1;
         field2212 = -1;
         field2213 = var1.getWhen();
      }

   }

   public final synchronized void copy$mouseDragged(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void copy$mouseMoved(MouseEvent var1) {
      if(field2208 != null) {
         field2209 = 0;
         field2211 = var1.getX();
         field2212 = var1.getY();
         field2213 = var1.getWhen();
      }

   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if(this.isInEvent == 0) {
         var1 = class113.field1064.getCallbacks().mouseReleased(var1);
      }

      if(!var1.isConsumed()) {
         ++this.isInEvent;

         try {
            this.copy$mouseReleased(var1);
         } finally {
            --this.isInEvent;
         }
      }

   }

   public final void mouseClicked(MouseEvent var1) {
      var1 = class113.field1064.getCallbacks().mouseClicked(var1);
      if(!var1.isConsumed()) {
         this.copy$mouseClicked(var1);
      }

   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      if(this.isInEvent == 0) {
         var1 = class113.field1064.getCallbacks().mouseEntered(var1);
      }

      if(!var1.isConsumed()) {
         ++this.isInEvent;

         try {
            this.copy$mouseEntered(var1);
         } finally {
            --this.isInEvent;
         }
      }

   }

   public final synchronized void mouseExited(MouseEvent var1) {
      if(this.isInEvent == 0) {
         var1 = class113.field1064.getCallbacks().mouseExited(var1);
      }

      if(!var1.isConsumed()) {
         ++this.isInEvent;

         try {
            this.copy$mouseExited(var1);
         } finally {
            --this.isInEvent;
         }
      }

   }

   public final void focusGained(FocusEvent var1) {
   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      if(this.isInEvent == 0) {
         var1 = class113.field1064.getCallbacks().mouseDragged(var1);
      }

      if(!var1.isConsumed()) {
         ++this.isInEvent;

         try {
            this.copy$mouseDragged(var1);
         } finally {
            --this.isInEvent;
         }
      }

   }

   public final synchronized void mousePressed(MouseEvent var1) {
      if(this.isInEvent == 0) {
         var1 = class113.field1064.getCallbacks().mousePressed(var1);
      }

      if(!var1.isConsumed()) {
         ++this.isInEvent;

         try {
            this.copy$mousePressed(var1);
         } finally {
            --this.isInEvent;
         }
      }

   }

   public final synchronized void focusLost(FocusEvent var1) {
      if(field2208 != null) {
         field2210 = 0;
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "1496084799"
   )
   static void method4059(String var0, String var1, String var2) {
      class325.field3486 = var0;
      class325.field3487 = var1;
      class325.field3488 = var2;
   }
}
