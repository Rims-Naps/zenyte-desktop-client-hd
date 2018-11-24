package net.runelite.standalone;

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
public class class163 implements MouseListener, MouseMotionListener, FocusListener, RSMouseInput {
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 678124457
   )
   public static volatile int field1966;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 805376175
   )
   public static int field1976;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 572385303
   )
   public static volatile int field1972;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1508519289
   )
   public static volatile int field1971;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1294614313
   )
   public static int field1984;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lai;"
   )
   public static class163 field1968;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      longValue = -7928109937571890123L
   )
   public static long field1985;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      longValue = -8250534395643385033L
   )
   public static volatile long field1973;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -943887211
   )
   public static int field1982;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -462759435
   )
   public static int field1983;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      longValue = 6560376633049224193L
   )
   public static volatile long field1981;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      longValue = 5872196956972912703L
   )
   public static long field1974;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1197583457
   )
   public static volatile int field1967;
   @ObfuscatedName("at")
   static int[] field1986;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -29981693
   )
   public static int field1975;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -123614231
   )
   public static volatile int field1970;
   @ObfuscatedName("o")
   static String field1987;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 238301101
   )
   public static volatile int field1979;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -2060221495
   )
   public static int field1980;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -901386581
   )
   public static volatile int field1969;
   public int isInEvent;

   static {
      field1968 = new class163();
      field1969 = 0;
      field1970 = 0;
      field1971 = -1;
      field1972 = -1;
      field1973 = -1L;
      field1983 = 0;
      field1975 = 0;
      field1976 = 0;
      field1974 = 0L;
      field1967 = 0;
      field1979 = 0;
      field1966 = 0;
      field1981 = 0L;
      field1982 = 0;
      field1980 = 0;
      field1984 = 0;
      field1985 = 0L;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/event/MouseEvent;I)I",
      garbageValue = "-1754548787"
   )
   final int method2972(MouseEvent var1) {
      int var2 = var1.getButton();
      return !var1.isAltDown() && var2 != 2?(!var1.isMetaDown() && var2 != 3?1:2):4;
   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if(this.isInEvent == 0) {
         var1 = class302.field3755.getCallbacks().mouseMoved(var1);
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
      if(field1968 != null) {
         field1969 = 0;
         field1979 = var1.getX();
         field1966 = var1.getY();
         field1981 = class321.method6252();
         field1967 = this.method2972(var1);
         if(field1967 != 0) {
            field1970 = field1967;
         }
      }

      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void copy$mouseReleased(MouseEvent var1) {
      if(field1968 != null) {
         field1969 = 0;
         field1970 = 0;
      }

      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void copy$mouseEntered(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void copy$mouseExited(MouseEvent var1) {
      if(field1968 != null) {
         field1969 = 0;
         field1971 = -1;
         field1972 = -1;
         field1973 = var1.getWhen();
      }

   }

   public final synchronized void copy$mouseDragged(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void copy$mouseMoved(MouseEvent var1) {
      if(field1968 != null) {
         field1969 = 0;
         field1971 = var1.getX();
         field1972 = var1.getY();
         field1973 = var1.getWhen();
      }

   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if(this.isInEvent == 0) {
         var1 = class302.field3755.getCallbacks().mouseReleased(var1);
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
      var1 = class302.field3755.getCallbacks().mouseClicked(var1);
      if(!var1.isConsumed()) {
         this.copy$mouseClicked(var1);
      }

   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      if(this.isInEvent == 0) {
         var1 = class302.field3755.getCallbacks().mouseEntered(var1);
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
         var1 = class302.field3755.getCallbacks().mouseExited(var1);
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
         var1 = class302.field3755.getCallbacks().mouseDragged(var1);
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
         var1 = class302.field3755.getCallbacks().mousePressed(var1);
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
      if(field1968 != null) {
         field1970 = 0;
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "1496084799"
   )
   static void method3007(String var0, String var1, String var2) {
      class39.field392 = var0;
      class39.field393 = var1;
      class39.field394 = var2;
   }
}
