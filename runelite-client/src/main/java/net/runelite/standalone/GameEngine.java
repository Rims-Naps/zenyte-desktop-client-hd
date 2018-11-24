package net.runelite.standalone;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
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
import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSGameEngine;

@ObfuscatedName("ah")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener, RSGameEngine {
   @ObfuscatedName("aq")
   static volatile boolean field3745;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1228887025
   )
   protected static int field3720;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lah;"
   )
   public static GameEngine instance;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1458519311
   )
   static int field3716;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lfd;"
   )
   protected static class118 field3741;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1068889553
   )
   static int field3721;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 517023389
   )
   static int field3715;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      longValue = 5275126401206555233L
   )
   static long field3742;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -540489959
   )
   static int field3722;
   @ObfuscatedName("b")
   protected static long[] field3738;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -2044897665
   )
   static int field3747;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1502747363
   )
   protected static int field3723;
   @ObfuscatedName("a")
   static boolean field3718;
   @ObfuscatedName("g")
   protected static long[] field3724;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      longValue = 2376053673371603621L
   )
   static long field3746;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      longValue = -5097467891478221559L
   )
   static long field3717;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 116140259
   )
   int field3734;
   @ObfuscatedName("ar")
   Clipboard field3743;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1882001431
   )
   int field3728;
   @ObfuscatedName("ac")
   Frame field3735;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      longValue = 5308197136600064711L
   )
   volatile long field3730;
   @ObfuscatedName("c")
   boolean field3719;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -645909577
   )
   protected int field3725;
   @ObfuscatedName("aw")
   volatile boolean field3737;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1311494455
   )
   int field3729;
   public Thread thread;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 312997889
   )
   int field3732;
   @ObfuscatedName("ab")
   final EventQueue field3744;
   @ObfuscatedName("am")
   Canvas field3727;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1304015289
   )
   int field3726;
   @ObfuscatedName("ad")
   volatile boolean field3740;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lax;"
   )
   class76 field3739;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -284112835
   )
   protected int field3736;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1253326815
   )
   int field3733;
   @ObfuscatedName("al")
   boolean field3731;

   static {
      instance = null;
      field3716 = 0;
      field3717 = 0L;
      field3718 = false;
      field3721 = 20;
      field3722 = 1;
      field3723 = 0;
      field3724 = new long[32];
      field3738 = new long[32];
      field3747 = 500;
      field3745 = true;
      field3746 = -1L;
      field3742 = -1L;
   }

   protected GameEngine() {
      this.field3719 = false;
      this.field3729 = 0;
      this.field3726 = 0;
      this.field3737 = true;
      this.field3731 = false;
      this.field3740 = false;
      this.onReplaceCanvasNextFrameChanged(-1);
      this.field3730 = 0L;
      EventQueue var1 = null;

      try {
         var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var3) {
         ;
      }

      this.field3744 = var1;
      class213 var2 = new class213();
      class129.field1723 = var2;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "-101"
   )
   protected void method5860(String var1) {
      if(!this.field3719) {
         this.field3719 = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
            ;
         }

      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(IIIB)V",
      garbageValue = "1"
   )
   protected final void method5844(int var1, int var2, int var3) {
      try {
         if(instance != null) {
            ++field3716;
            if(field3716 >= 3) {
               this.method5860("alreadyloaded");
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         instance = this;
         class167.field2010 = var1;
         client.canvasWidthChanged(-1);
         class193.field2748 = var2;
         client.canvasHeightChanged(-1);
         class57.field707 = var3;
         class57.field710 = this;
         if(field3741 == null) {
            field3741 = new class118();
         }

         field3741.method2138(this, 1);
      } catch (Exception var5) {
         class202.method4018((String)null, var5, 1707649355);
         this.method5860("crash");
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(I)Llo;",
      garbageValue = "2015056952"
   )
   class170 method5868() {
      Container var1 = this.method5873();
      int var2 = Math.max(var1.getWidth(), this.field3733);
      int var3 = Math.max(var1.getHeight(), this.field3732);
      if(this.field3735 != null) {
         Insets var4 = this.field3735.getInsets();
         var2 -= var4.right + var4.left;
         var3 -= var4.bottom + var4.top;
      }

      return new class170(var2, var3);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1423808337"
   )
   void method5848() {
      long var1 = class321.method6252();
      long var3 = field3738[field3715];
      field3738[field3715] = var1;
      field3715 = field3715 + 1 & 31;
      if(0L != var3 && var1 > var3) {
         ;
      }

      synchronized(this) {
         class318.field3915 = field3745;
      }

      this.vmethod5856();
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-22347014"
   )
   protected abstract void vmethod5857(boolean var1);

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;S)V",
      garbageValue = "11786"
   )
   protected void method5837(String var1) {
      this.field3743.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   @ObfuscatedName("p")
   protected final void method5833(int var1, int var2, byte var3) {
      if(class302.field3755.isStretchedEnabled() && class302.field3755.isResized()) {
         Dimension var4 = class302.field3755.getRealDimensions();
         this.copy$setMaxCanvasSize(var4.width, var4.height, var3);
      } else {
         this.copy$setMaxCanvasSize(var1, var2, var3);
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1325491268"
   )
   protected abstract void vmethod5854();

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2030541843"
   )
   final void method5847() {
      Canvas var1 = this.field3727;
      var1.removeKeyListener(class96.field1057);
      var1.removeFocusListener(class96.field1057);
      class96.field1030 = -1;
      class154.method2818(this.field3727);
      if(this.field3739 != null) {
         this.field3739.method1562(this.field3727);
      }

      this.method5841();
      class311.method6089(this.field3727);
      class304.method5997(this.field3727);
      if(this.field3739 != null) {
         this.field3739.method1561(this.field3727);
      }

      this.method5916();
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "98"
   )
   final void method5916() {
      this.field3731 = true;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-5213658"
   )
   final void method5850() {
      class170 var1 = this.method5868();
      if(var1.field2020 != this.field3736 || this.field3725 != var1.field2021 || this.field3731) {
         this.method5840();
         this.field3731 = false;
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Object;I)V",
      garbageValue = "2006690739"
   )
   final void method5834(Object var1) {
      this.onPost(var1);
      if(this.field3744 != null) {
         for(int var2 = 0; var2 < 50 && this.field3744.peekEvent() != null; ++var2) {
            class48.method1045(1L);
         }

         if(var1 != null) {
            this.field3744.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1416113915"
   )
   protected abstract void vmethod5858();

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)Lfm;",
      garbageValue = "-2081469008"
   )
   protected class234 method5880() {
      if(this.field3739 == null) {
         this.field3739 = new class76();
         this.field3739.method1561(this.field3727);
      }

      return this.field3739;
   }

   public final void destroy() {
      if(this == instance && !field3718) {
         field3717 = class321.method6252();
         class48.method1045(5000L);
         this.method5931();
      }
   }

   public final synchronized void paint(Graphics var1) {
      if(this == instance && !field3718) {
         this.field3737 = true;
         if(class321.method6252() - this.field3730 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if(var2 == null || var2.width >= class167.field2010 && var2.height >= class193.field2748) {
               this.field3740 = true;
               this.onReplaceCanvasNextFrameChanged(-1);
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
      class302.field3755.getCallbacks().post(var2);
   }

   public void onPost(Object var1) {
      DrawCallbacks var2 = class302.field3755.getDrawCallbacks();
      if(var2 != null) {
         var2.draw();
      }

   }

   public boolean isClientThread() {
      return this.thread == Thread.currentThread();
   }

   public Canvas getCanvas() {
      return this.field3727;
   }

   public final void copy$setMaxCanvasSize(int var1, int var2, byte var3) {
      if(this.field3728 != var1 || var2 != this.field3734) {
         this.method5916();
      }

      this.field3728 = var1;
      this.field3734 = var2;
   }

   public boolean isReplaceCanvasNextFrame() {
      return this.field3740;
   }

   public void setReplaceCanvasNextFrame(boolean var1) {
      this.field3740 = var1;
   }

   public void setResizeCanvasNextFrame(boolean var1) {
      this.field3731 = var1;
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void onReplaceCanvasNextFrameChanged(int var1) {
      if(class302.field3755 != null && class302.field3755.isGpu() && this.isReplaceCanvasNextFrame()) {
         this.setReplaceCanvasNextFrame(false);
         this.setResizeCanvasNextFrame(true);
      }

   }

   public final void start() {
      if(this == instance && !field3718) {
         field3717 = 0L;
      }
   }

   public final void stop() {
      if(this == instance && !field3718) {
         field3717 = class321.method6252() + 4000L;
      }
   }

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   public final void focusGained(FocusEvent var1) {
      this.onFocusGained(var1);
      field3745 = true;
      this.field3737 = true;
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
         if(class165.field1998 != null) {
            String var1 = class165.field1998.toLowerCase();
            if(var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = class118.field1626;
               if(var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.method5860("wrongjava");
                  return;
               }

               if(var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && class320.method6246(var2.charAt(var3)); ++var3) {
                     ;
                  }

                  String var4 = var2.substring(6, var3);
                  if(class67.method1489(var4) && class17.method368(var4) < 10) {
                     this.method5860("wrongjava");
                     return;
                  }
               }

               field3722 = 5;
            }
         }

         this.setFocusCycleRoot(true);
         this.method5841();
         this.vmethod5855();

         Object var8;
         try {
            var8 = new class115();
         } catch (Throwable var6) {
            var8 = new class260();
         }

         class191.field2735 = (class148)var8;

         while(0L == field3717 || class321.method6252() < field3717) {
            field3720 = class191.field2735.vmethod5181(field3721, field3722);

            for(int var5 = 0; var5 < field3720; ++var5) {
               this.method5848();
            }

            this.method5849();
            this.method5834(this.field3727);
         }
      } catch (Exception var7) {
         class202.method4018((String)null, var7, 932617702);
         this.method5860("crash");
      }

      this.method5931();
   }

   public final void focusLost(FocusEvent var1) {
      field3745 = false;
   }

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public Thread getClientThread() {
      return this.thread;
   }

   public boolean isResizeCanvasNextFrame() {
      return this.field3731;
   }

   public void post(Object var1) {
      this.method5834(var1);
   }

   public void resizeCanvas() {
      this.method5840();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2017418544"
   )
   protected final void method5924() {
      class181.method3702();
      class311.method6089(this.field3727);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "2"
   )
   protected final void method5881() {
      class304.method5997(this.field3727);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2013942788"
   )
   protected final boolean method5839() {
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
                  this.method5860("invalidhost");
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

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-200857415"
   )
   final synchronized void method5931() {
      if(!field3718) {
         field3718 = true;

         try {
            this.field3727.removeFocusListener(this);
         } catch (Exception var5) {
            ;
         }

         try {
            this.vmethod5854();
         } catch (Exception var4) {
            ;
         }

         if(this.field3735 != null) {
            try {
               System.exit(0);
            } catch (Throwable var3) {
               ;
            }
         }

         if(field3741 != null) {
            try {
               field3741.method2135();
            } catch (Exception var2) {
               ;
            }
         }

         this.vmethod5864();
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;ZB)V",
      garbageValue = "32"
   )
   protected final void method5862(int var1, String var2, boolean var3) {
      try {
         Graphics var4 = this.field3727.getGraphics();
         if(class113.field1292 == null) {
            class113.field1292 = new Font("Helvetica", 1, 13);
            class85.field916 = this.field3727.getFontMetrics(class113.field1292);
         }

         if(var3) {
            var4.setColor(Color.black);
            var4.fillRect(0, 0, class167.field2010, class193.field2748);
         }

         Color var5 = new Color(140, 17, 17);

         try {
            if(class294.field3681 == null) {
               class294.field3681 = this.field3727.createImage(304, 34);
            }

            Graphics var6 = class294.field3681.getGraphics();
            var6.setColor(var5);
            var6.drawRect(0, 0, 303, 33);
            var6.fillRect(2, 2, var1 * 3, 30);
            var6.setColor(Color.black);
            var6.drawRect(1, 1, 301, 31);
            var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
            var6.setFont(class113.field1292);
            var6.setColor(Color.white);
            var6.drawString(var2, (304 - class85.field916.stringWidth(var2)) / 2, 22);
            var4.drawImage(class294.field3681, class167.field2010 / 2 - 152, class193.field2748 / 2 - 18, (ImageObserver)null);
         } catch (Exception var9) {
            int var7 = class167.field2010 / 2 - 152;
            int var8 = class193.field2748 / 2 - 18;
            var4.setColor(var5);
            var4.drawRect(var7, var8, 303, 33);
            var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
            var4.setColor(Color.black);
            var4.drawRect(var7 + 1, var8 + 1, 301, 31);
            var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30);
            var4.setFont(class113.field1292);
            var4.setColor(Color.white);
            var4.drawString(var2, var7 + (304 - class85.field916.stringWidth(var2)) / 2, var8 + 22);
         }
      } catch (Exception var10) {
         this.field3727.repaint();
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1745698608"
   )
   protected void method5836() {
      this.field3743 = this.getToolkit().getSystemClipboard();
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(I)Ljava/awt/Container;",
      garbageValue = "-576656053"
   )
   Container method5873() {
      return (Container)(this.field3735 != null?this.field3735:this);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-43"
   )
   void method5849() {
      Container var1 = this.method5873();
      long var2 = class321.method6252();
      long var4 = field3724[class57.field715];
      field3724[class57.field715] = var2;
      class57.field715 = class57.field715 + 1 & 31;
      if(0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         field3723 = ((var6 >> 1) + 32000) / var6;
      }

      if(++field3747 - 1 > 50) {
         field3747 -= 50;
         this.field3737 = true;
         this.field3727.setSize(class167.field2010, class193.field2748);
         this.field3727.setVisible(true);
         if(var1 == this.field3735) {
            Insets var7 = this.field3735.getInsets();
            this.field3727.setLocation(this.field3729 + var7.left, this.field3726 + var7.top);
         } else {
            this.field3727.setLocation(this.field3729, this.field3726);
         }
      }

      if(this.field3740) {
         this.method5847();
      }

      this.method5850();
      this.vmethod5857(this.field3737);
      if(this.field3737) {
         this.method5842();
      }

      this.field3737 = false;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "579288689"
   )
   void method5842() {
      int var1 = this.field3729;
      int var2 = this.field3726;
      int var3 = this.field3736 - class167.field2010 - var1;
      int var4 = this.field3725 - class193.field2748 - var2;
      if(var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
         try {
            Container var5 = this.method5873();
            int var6 = 0;
            int var7 = 0;
            if(var5 == this.field3735) {
               Insets var8 = this.field3735.getInsets();
               var6 = var8.left;
               var7 = var8.top;
            }

            Graphics var10 = var5.getGraphics();
            var10.setColor(Color.black);
            if(var1 > 0) {
               var10.fillRect(var6, var7, var1, this.field3725);
            }

            if(var2 > 0) {
               var10.fillRect(var6, var7, this.field3736, var2);
            }

            if(var3 > 0) {
               var10.fillRect(var6 + this.field3736 - var3, var7, var3, this.field3725);
            }

            if(var4 > 0) {
               var10.fillRect(var6, var7 + this.field3725 - var4, this.field3736, var4);
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
   final void method5840() {
      Container var1 = this.method5873();
      if(var1 != null) {
         class170 var2 = this.method5868();
         this.field3736 = Math.max(var2.field2020, this.field3733);
         this.field3725 = Math.max(var2.field2021, this.field3732);
         if(this.field3736 <= 0) {
            this.field3736 = 1;
         }

         if(this.field3725 <= 0) {
            this.field3725 = 1;
         }

         class167.field2010 = Math.min(this.field3736, this.field3728);
         client.canvasWidthChanged(-1);
         class193.field2748 = Math.min(this.field3725, this.field3734);
         client.canvasHeightChanged(-1);
         this.field3729 = (this.field3736 - class167.field2010) / 2;
         this.field3726 = 0;
         this.field3727.setSize(class167.field2010, class193.field2748);
         class124.field1689 = new class331(class167.field2010, class193.field2748, this.field3727);
         if(var1 == this.field3735) {
            Insets var3 = this.field3735.getInsets();
            this.field3727.setLocation(var3.left + this.field3729, var3.top + this.field3726);
         } else {
            this.field3727.setLocation(this.field3729, this.field3726);
         }

         this.field3737 = true;
         this.vmethod5858();
      }
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1563482433"
   )
   protected abstract void vmethod5856();

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1441434133"
   )
   protected final void method5859() {
      class294.field3681 = null;
      class113.field1292 = null;
      class85.field916 = null;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "605617896"
   )
   final synchronized void method5841() {
      Container var1 = this.method5873();
      if(this.field3727 != null) {
         this.field3727.removeFocusListener(this);
         var1.remove(this.field3727);
      }

      class167.field2010 = Math.max(var1.getWidth(), this.field3733);
      client.canvasWidthChanged(-1);
      class193.field2748 = Math.max(var1.getHeight(), this.field3732);
      client.canvasHeightChanged(-1);
      Insets var2;
      if(this.field3735 != null) {
         var2 = this.field3735.getInsets();
         class167.field2010 -= var2.left + var2.right;
         client.canvasWidthChanged(-1);
         class193.field2748 -= var2.top + var2.bottom;
         client.canvasHeightChanged(-1);
      }

      this.field3727 = new class44(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout((LayoutManager)null);
      var1.add(this.field3727);
      this.field3727.setSize(class167.field2010, class193.field2748);
      this.field3727.setVisible(true);
      this.field3727.setBackground(Color.BLACK);
      if(var1 == this.field3735) {
         var2 = this.field3735.getInsets();
         this.field3727.setLocation(var2.left + this.field3729, this.field3726 + var2.top);
      } else {
         this.field3727.setLocation(this.field3729, this.field3726);
      }

      this.field3727.addFocusListener(this);
      this.field3727.requestFocus();
      this.field3737 = true;
      if(class124.field1689 != null && class167.field2010 == class124.field1689.field4010 && class193.field2748 == class124.field1689.field4009) {
         ((class331)class124.field1689).method6349(this.field3727);
         class124.field1689.vmethod6366(0, 0);
      } else {
         class124.field1689 = new class331(class167.field2010, class193.field2748, this.field3727);
      }

      this.field3740 = false;
      this.onReplaceCanvasNextFrameChanged(-1);
      this.field3730 = class321.method6252();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1159305348"
   )
   protected abstract void vmethod5855();

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1829775887"
   )
   protected abstract void vmethod5864();

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "135419805"
   )
   protected final boolean method5934() {
      return this.field3735 != null;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-1725253081"
   )
   static int method5863(int var0, int var1) {
      class231 var2 = (class231)class231.field3079.method1776((long)var0);
      return var2 == null?0:(var1 >= 0 && var1 < var2.field3080.length?var2.field3080[var1]:0);
   }

   @ObfuscatedName("l")
   public static int method5966(long var0) {
      return (int)(var0 >>> 7 & 127L);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1537106502"
   )
   public static int method5967(int var0) {
      return var0 > 0?1:(var0 < 0?-1:0);
   }
}
