package net.runelite.client.standalone;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;
import net.runelite.api.events.FocusChanged;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSGameEngine;

@ObfuscatedName("ah")
public abstract class class181 extends Applet implements Runnable, FocusListener, WindowListener, RSGameEngine {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lfd;"
   )
   protected static class164 field1743;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -540489959
   )
   static int field1724;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1068889553
   )
   static int field1723;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -2044897665
   )
   static int field1749;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1228887025
   )
   protected static int field1722;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 517023389
   )
   static int field1717;
   @ObfuscatedName("aq")
   static volatile boolean field1747;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      longValue = -5097467891478221559L
   )
   static long field1719;
   @ObfuscatedName("b")
   protected static long[] field1740;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lah;"
   )
   static class181 field1716;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      longValue = 2376053673371603621L
   )
   static long field1748;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1458519311
   )
   static int field1718;
   @ObfuscatedName("a")
   static boolean field1720;
   @ObfuscatedName("g")
   protected static long[] field1726;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      longValue = 5275126401206555233L
   )
   static long field1744;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1502747363
   )
   protected static int field1725;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 116140259
   )
   int field1736;
   @ObfuscatedName("aw")
   volatile boolean field1739;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -645909577
   )
   protected int field1727;
   @ObfuscatedName("ar")
   Clipboard field1745;
   @ObfuscatedName("ac")
   Frame field1737;
   @ObfuscatedName("ad")
   volatile boolean field1742;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1253326815
   )
   int field1735;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1311494455
   )
   int field1731;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1882001431
   )
   int field1730;
   @ObfuscatedName("c")
   boolean field1721;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -284112835
   )
   protected int field1738;
   @ObfuscatedName("ab")
   final EventQueue field1746;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1304015289
   )
   int field1728;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      longValue = 5308197136600064711L
   )
   volatile long field1732;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lax;"
   )
   class206 field1741;
   @ObfuscatedName("am")
   Canvas field1729;
   @ObfuscatedName("al")
   boolean field1733;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 312997889
   )
   int field1734;
   public Thread thread;

   static {
      field1716 = null;
      field1718 = 0;
      field1719 = 0L;
      field1720 = false;
      field1723 = 20;
      field1724 = 1;
      field1725 = 0;
      field1726 = new long[32];
      field1740 = new long[32];
      field1749 = 500;
      field1747 = true;
      field1748 = -1L;
      field1744 = -1L;
   }

   protected class181() {
      this.field1721 = false;
      this.field1731 = 0;
      this.field1728 = 0;
      this.field1739 = true;
      this.field1733 = false;
      this.field1742 = false;
      this.field1732 = 0L;
      EventQueue var1 = null;

      try {
         var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var3) {
         ;
      }

      this.field1746 = var1;
      class176 var2 = new class176();
      class0.field2 = var2;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-5213658"
   )
   final void method3042() {
      class131 var1 = this.method3060();
      if(var1.field1250 != this.field1738 || this.field1727 != var1.field1251 || this.field1733) {
         this.method3032();
         this.field1733 = false;
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "135419805"
   )
   protected final boolean method3126() {
      return this.field1737 != null;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "2"
   )
   protected final void method3073() {
      class224.method4018(this.field1729);
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "-101"
   )
   protected void method3052(String var1) {
      if(!this.field1721) {
         this.field1721 = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
            ;
         }

      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1423808337"
   )
   void method3040() {
      long var1 = class234.method4170();
      long var3 = field1740[field1717];
      field1740[field1717] = var1;
      field1717 = field1717 + 1 & 31;
      if(0L != var3 && var1 > var3) {
         ;
      }

      synchronized(this) {
         class239.field2411 = field1747;
      }

      this.vmethod5962();
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1563482433"
   )
   protected abstract void vmethod5962();

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)Lfm;",
      garbageValue = "-2081469008"
   )
   protected class115 method3072() {
      if(this.field1741 == null) {
         this.field1741 = new class206();
         this.field1741.method3506(this.field1729);
      }

      return this.field1741;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "605617896"
   )
   final synchronized void method3033() {
      Container var1 = this.method3065();
      if(this.field1729 != null) {
         this.field1729.removeFocusListener(this);
         var1.remove(this.field1729);
      }

      class47.field359 = Math.max(var1.getWidth(), this.field1735);
      class330.field3689 = Math.max(var1.getHeight(), this.field1734);
      Insets var2;
      if(this.field1737 != null) {
         var2 = this.field1737.getInsets();
         class47.field359 -= var2.left + var2.right;
         class330.field3689 -= var2.top + var2.bottom;
      }

      this.field1729 = new class33(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout((LayoutManager)null);
      var1.add(this.field1729);
      this.field1729.setSize(class47.field359, class330.field3689);
      this.field1729.setVisible(true);
      this.field1729.setBackground(Color.BLACK);
      if(var1 == this.field1737) {
         var2 = this.field1737.getInsets();
         this.field1729.setLocation(var2.left + this.field1731, this.field1728 + var2.top);
      } else {
         this.field1729.setLocation(this.field1731, this.field1728);
      }

      this.field1729.addFocusListener(this);
      this.field1729.requestFocus();
      this.field1739 = true;
      if(class146.field1404 != null && class47.field359 == class146.field1404.field47 && class330.field3689 == class146.field1404.field46) {
         ((class276)class146.field1404).method4917(this.field1729);
         class146.field1404.vmethod4918(0, 0);
      } else {
         class146.field1404 = new class276(class47.field359, class330.field3689, this.field1729);
      }

      this.field1742 = false;
      this.field1732 = class234.method4170();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;S)V",
      garbageValue = "11786"
   )
   protected void method3029(String var1) {
      this.field1745.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Object;I)V",
      garbageValue = "2006690739"
   )
   final void method3026(Object var1) {
      if(this.field1746 != null) {
         for(int var2 = 0; var2 < 50 && this.field1746.peekEvent() != null; ++var2) {
            class189.method3249(1L);
         }

         if(var1 != null) {
            this.field1746.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-200857415"
   )
   final synchronized void method3123() {
      if(!field1720) {
         field1720 = true;

         try {
            this.field1729.removeFocusListener(this);
         } catch (Exception var5) {
            ;
         }

         try {
            this.vmethod6193();
         } catch (Exception var4) {
            ;
         }

         if(this.field1737 != null) {
            try {
               System.exit(0);
            } catch (Throwable var3) {
               ;
            }
         }

         if(field1743 != null) {
            try {
               field1743.method2818();
            } catch (Exception var2) {
               ;
            }
         }

         this.vmethod6070();
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "11"
   )
   protected final void method3025(int var1, int var2) {
      if(this.field1730 != var1 || var2 != this.field1736) {
         this.method3108();
      }

      this.field1730 = var1;
      this.field1736 = var2;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1416113915"
   )
   protected abstract void vmethod5970();

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(I)Llo;",
      garbageValue = "2058386109"
   )
   class131 method3060() {
      Container var1 = this.method3065();
      int var2 = Math.max(var1.getWidth(), this.field1735);
      int var3 = Math.max(var1.getHeight(), this.field1734);
      if(this.field1737 != null) {
         Insets var4 = this.field1737.getInsets();
         var2 -= var4.right + var4.left;
         var3 -= var4.bottom + var4.top;
      }

      return new class131(var2, var3);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1325491268"
   )
   protected abstract void vmethod6193();

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2017418544"
   )
   protected final void method3116() {
      class169.method2880();
      class35.method576(this.field1729);
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;ZB)V",
      garbageValue = "32"
   )
   protected final void method3054(int var1, String var2, boolean var3) {
      try {
         Graphics var4 = this.field1729.getGraphics();
         if(class199.field1870 == null) {
            class199.field1870 = new Font("Helvetica", 1, 13);
            class83.field742 = this.field1729.getFontMetrics(class199.field1870);
         }

         if(var3) {
            var4.setColor(Color.black);
            var4.fillRect(0, 0, class47.field359, class330.field3689);
         }

         Color var5 = new Color(140, 17, 17);

         try {
            if(class326.field3506 == null) {
               class326.field3506 = this.field1729.createImage(304, 34);
            }

            Graphics var6 = class326.field3506.getGraphics();
            var6.setColor(var5);
            var6.drawRect(0, 0, 303, 33);
            var6.fillRect(2, 2, var1 * 3, 30);
            var6.setColor(Color.black);
            var6.drawRect(1, 1, 301, 31);
            var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
            var6.setFont(class199.field1870);
            var6.setColor(Color.white);
            var6.drawString(var2, (304 - class83.field742.stringWidth(var2)) / 2, 22);
            var4.drawImage(class326.field3506, class47.field359 / 2 - 152, class330.field3689 / 2 - 18, (ImageObserver)null);
         } catch (Exception var9) {
            int var7 = class47.field359 / 2 - 152;
            int var8 = class330.field3689 / 2 - 18;
            var4.setColor(var5);
            var4.drawRect(var7, var8, 303, 33);
            var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
            var4.setColor(Color.black);
            var4.drawRect(var7 + 1, var8 + 1, 301, 31);
            var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30);
            var4.setFont(class199.field1870);
            var4.setColor(Color.white);
            var4.drawString(var2, var7 + (304 - class83.field742.stringWidth(var2)) / 2, var8 + 22);
         }
      } catch (Exception var10) {
         this.field1729.repaint();
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(I)Ljava/awt/Container;",
      garbageValue = "-576656053"
   )
   Container method3065() {
      return (Container)(this.field1737 != null?this.field1737:this);
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1829775887"
   )
   protected abstract void vmethod6070();

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "579288689"
   )
   void method3034() {
      int var1 = this.field1731;
      int var2 = this.field1728;
      int var3 = this.field1738 - class47.field359 - var1;
      int var4 = this.field1727 - class330.field3689 - var2;
      if(var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
         try {
            Container var5 = this.method3065();
            int var6 = 0;
            int var7 = 0;
            if(var5 == this.field1737) {
               Insets var8 = this.field1737.getInsets();
               var6 = var8.left;
               var7 = var8.top;
            }

            Graphics var10 = var5.getGraphics();
            var10.setColor(Color.black);
            if(var1 > 0) {
               var10.fillRect(var6, var7, var1, this.field1727);
            }

            if(var2 > 0) {
               var10.fillRect(var6, var7, this.field1738, var2);
            }

            if(var3 > 0) {
               var10.fillRect(var6 + this.field1738 - var3, var7, var3, this.field1727);
            }

            if(var4 > 0) {
               var10.fillRect(var6, var7 + this.field1727 - var4, this.field1738, var4);
            }
         } catch (Exception var9) {
            ;
         }
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "235454039"
   )
   final void method3032() {
      Container var1 = this.method3065();
      if(var1 != null) {
         class131 var2 = this.method3060();
         this.field1738 = Math.max(var2.field1250, this.field1735);
         this.field1727 = Math.max(var2.field1251, this.field1734);
         if(this.field1738 <= 0) {
            this.field1738 = 1;
         }

         if(this.field1727 <= 0) {
            this.field1727 = 1;
         }

         class47.field359 = Math.min(this.field1738, this.field1730);
         class330.field3689 = Math.min(this.field1727, this.field1736);
         this.field1731 = (this.field1738 - class47.field359) / 2;
         this.field1728 = 0;
         this.field1729.setSize(class47.field359, class330.field3689);
         class146.field1404 = new class276(class47.field359, class330.field3689, this.field1729);
         if(var1 == this.field1737) {
            Insets var3 = this.field1737.getInsets();
            this.field1729.setLocation(var3.left + this.field1731, var3.top + this.field1728);
         } else {
            this.field1729.setLocation(this.field1731, this.field1728);
         }

         this.field1739 = true;
         this.vmethod5970();
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-22347014"
   )
   protected abstract void vmethod5963(boolean var1);

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(IIIB)V",
      garbageValue = "1"
   )
   protected final void method3036(int var1, int var2, int var3) {
      try {
         if(field1716 != null) {
            ++field1718;
            if(field1718 >= 3) {
               this.method3052("alreadyloaded");
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         field1716 = this;
         class47.field359 = var1;
         class330.field3689 = var2;
         class302.field3233 = var3;
         class302.field3236 = this;
         if(field1743 == null) {
            field1743 = new class164();
         }

         field1743.method2821(this, 1);
      } catch (Exception var5) {
         class295.method5145((String)null, var5, 1707649355);
         this.method3052("crash");
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "30"
   )
   final void method3108() {
      this.field1733 = true;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2030541843"
   )
   final void method3039() {
      Canvas var1 = this.field1729;
      var1.removeKeyListener(class135.field1349);
      var1.removeFocusListener(class135.field1349);
      class135.field1322 = -1;
      class127.method2364(this.field1729);
      if(this.field1741 != null) {
         this.field1741.method3507(this.field1729);
      }

      this.method3033();
      class35.method576(this.field1729);
      class224.method4018(this.field1729);
      if(this.field1741 != null) {
         this.field1741.method3506(this.field1729);
      }

      this.method3108();
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1441434133"
   )
   protected final void method3051() {
      class326.field3506 = null;
      class199.field1870 = null;
      class83.field742 = null;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-43"
   )
   void method3041() {
      Container var1 = this.method3065();
      long var2 = class234.method4170();
      long var4 = field1726[class302.field3241];
      field1726[class302.field3241] = var2;
      class302.field3241 = class302.field3241 + 1 & 31;
      if(0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         field1725 = ((var6 >> 1) + 32000) / var6;
      }

      if(++field1749 - 1 > 50) {
         field1749 -= 50;
         this.field1739 = true;
         this.field1729.setSize(class47.field359, class330.field3689);
         this.field1729.setVisible(true);
         if(var1 == this.field1737) {
            Insets var7 = this.field1737.getInsets();
            this.field1729.setLocation(this.field1731 + var7.left, this.field1728 + var7.top);
         } else {
            this.field1729.setLocation(this.field1731, this.field1728);
         }
      }

      if(this.field1742) {
         this.method3039();
      }

      this.method3042();
      this.vmethod5963(this.field1739);
      if(this.field1739) {
         this.method3034();
      }

      this.field1739 = false;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1745698608"
   )
   protected void method3028() {
      this.field1745 = this.getToolkit().getSystemClipboard();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2013942788"
   )
   protected final boolean method3031() {
      String var1 = this.getDocumentBase().getHost().toLowerCase();
      if(!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
         if(!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
            if(var1.endsWith("127.0.0.1") || var1.endsWith("192.154.213.172")) {
               return true;
            } else {
               while(var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
                  var1 = var1.substring(0, var1.length() - 1);
               }

               if(var1.endsWith("192.168.1.")) {
                  return true;
               } else {
                  this.method3052("invalidhost");
                  return false;
               }
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1159305348"
   )
   protected abstract void vmethod6335();

   public final void destroy() {
      if(this == field1716 && !field1720) {
         field1719 = class234.method4170();
         class189.method3249(5000L);
         this.method3123();
      }
   }

   public final synchronized void paint(Graphics var1) {
      if(this == field1716 && !field1720) {
         this.field1739 = true;
         if(class234.method4170() - this.field1732 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if(var2 == null || var2.width >= class47.field359 && var2.height >= class330.field3689) {
               this.field1742 = true;
            }
         }

      }
   }

   public void onRun() {
      this.thread = Thread.currentThread();
   }

   public void onFocusGained(FocusEvent var1) {
      FocusChanged var2 = new FocusChanged();
      var2.setFocused(true);
      class113.field1064.getCallbacks().post(var2);
   }

   public Canvas getCanvas() {
      return this.field1729;
   }

   public boolean isClientThread() {
      return this.thread == Thread.currentThread();
   }

   public final void start() {
      if(this == field1716 && !field1720) {
         field1719 = 0L;
      }
   }

   public final void stop() {
      if(this == field1716 && !field1720) {
         field1719 = class234.method4170() + 4000L;
      }
   }

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   public final void focusGained(FocusEvent var1) {
      this.onFocusGained(var1);
      field1747 = true;
      this.field1739 = true;
   }

   public final void windowActivated(WindowEvent var1) {
   }

   public final void windowClosed(WindowEvent var1) {
   }

   public final void windowDeactivated(WindowEvent var1) {
   }

   public final void windowDeiconified(WindowEvent var1) {
   }

   public final void windowIconified(WindowEvent var1) {
   }

   public final void windowOpened(WindowEvent var1) {
   }

   public abstract void init();

   public void run() {
      this.onRun();

      try {
         if(class160.field1500 != null) {
            String var1 = class160.field1500.toLowerCase();
            if(var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = class164.field1520;
               if(var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.method3052("wrongjava");
                  return;
               }

               if(var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && class236.method4185(var2.charAt(var3)); ++var3) {
                     ;
                  }

                  String var4 = var2.substring(6, var3);
                  if(class136.method2512(var4) && class140.method2525(var4) < 10) {
                     this.method3052("wrongjava");
                     return;
                  }
               }

               field1724 = 5;
            }
         }

         this.setFocusCycleRoot(true);
         this.method3033();
         this.vmethod6335();

         Object var8;
         try {
            var8 = new class92();
         } catch (Throwable var6) {
            var8 = new class315();
         }

         class161.field1502 = (class303)var8;

         while(0L == field1719 || class234.method4170() < field1719) {
            field1722 = class161.field1502.vmethod5544(field1723, field1724);

            for(int var5 = 0; var5 < field1722; ++var5) {
               this.method3040();
            }

            this.method3041();
            this.method3026(this.field1729);
         }
      } catch (Exception var7) {
         class295.method5145((String)null, var7, 932617702);
         this.method3052("crash");
      }

      this.method3123();
   }

   public final void focusLost(FocusEvent var1) {
      field1747 = false;
   }

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public Thread getClientThread() {
      return this.thread;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1537106502"
   )
   public static int method3159(int var0) {
      return var0 > 0?1:(var0 < 0?-1:0);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-1725253081"
   )
   static int method3055(int var0, int var1) {
      class292 var2 = (class292)class292.field3153.method5310((long)var0);
      return var2 == null?0:(var1 >= 0 && var1 < var2.field3154.length?var2.field3154[var1]:0);
   }

   @ObfuscatedName("l")
   public static int method3158(long var0) {
      return (int)(var0 >>> 7 & 127L);
   }
}
