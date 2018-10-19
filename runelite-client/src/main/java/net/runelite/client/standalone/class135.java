package net.runelite.client.standalone;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.api.events.FocusChanged;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSKeyFocusListener;

@ObfuscatedName("ao")
public final class class135 implements KeyListener, FocusListener, RSKeyFocusListener {
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 978955095
   )
   static int field1346;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lao;"
   )
   public static class135 field1349;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = 1499388091
   )
   public static int field1329;
   @ObfuscatedName("cb")
   static char[] field1336;
   @ObfuscatedName("ch")
   @ObfuscatedGetter(
      intValue = 1692011759
   )
   public static int field1341;
   @ObfuscatedName("ct")
   static int[] field1344;
   @ObfuscatedName("cr")
   @ObfuscatedGetter(
      intValue = -2130936079
   )
   public static int field1339;
   @ObfuscatedName("cd")
   @ObfuscatedGetter(
      intValue = 42808581
   )
   public static int field1347;
   @ObfuscatedName("cs")
   static int[] field1337;
   @ObfuscatedName("cn")
   @ObfuscatedGetter(
      intValue = 1151633825
   )
   public static volatile int field1343;
   @ObfuscatedName("ce")
   public static int[] field1338;
   @ObfuscatedName("cq")
   public static int[] field1345;
   @ObfuscatedName("ck")
   @ObfuscatedGetter(
      intValue = -569458333
   )
   public static int field1322;
   @ObfuscatedName("cz")
   public static boolean[] field1332;
   @ObfuscatedName("i")
   static String field1333;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = -1337835921
   )
   public static int field1334;

   static {
      field1349 = new class135();
      field1332 = new boolean[112];
      field1345 = new int[128];
      field1334 = 0;
      field1322 = 0;
      field1336 = new char[128];
      field1337 = new int[128];
      field1338 = new int[128];
      field1339 = 0;
      field1347 = 0;
      field1341 = 0;
      field1329 = 0;
      field1343 = 0;
      field1344 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
   }

   public void onFocusLost(FocusEvent var1) {
      FocusChanged var2 = new FocusChanged();
      var2.setFocused(false);
      class113.field1064.getCallbacks().post(var2);
   }

   public final synchronized void copy$keyPressed(KeyEvent var1) {
      if(field1349 != null) {
         int var2 = var1.getKeyCode();
         if(var2 >= 0 && var2 < field1344.length) {
            var2 = field1344[var2];
            if((var2 & 128) != 0) {
               var2 = -1;
            }
         } else {
            var2 = -1;
         }

         if(field1322 >= 0 && var2 >= 0) {
            field1345[field1322] = var2;
            field1322 = field1322 + 1 & 127;
            if(field1334 == field1322) {
               field1322 = -1;
            }
         }

         int var3;
         if(var2 >= 0) {
            var3 = field1341 + 1 & 127;
            if(var3 != field1347) {
               field1337[field1341] = var2;
               field1336[field1341] = 0;
               field1341 = var3;
            }
         }

         var3 = var1.getModifiers();
         if((var3 & 10) != 0 || var2 == 85 || var2 == 10) {
            var1.consume();
         }
      }

   }

   public final synchronized void copy$keyReleased(KeyEvent var1) {
      if(field1349 != null) {
         int var2 = var1.getKeyCode();
         if(var2 >= 0 && var2 < field1344.length) {
            var2 = field1344[var2] & -129;
         } else {
            var2 = -1;
         }

         if(field1322 >= 0 && var2 >= 0) {
            field1345[field1322] = ~var2;
            field1322 = field1322 + 1 & 127;
            if(field1322 == field1334) {
               field1322 = -1;
            }
         }
      }

      var1.consume();
   }

   public final void copy$keyTyped(KeyEvent var1) {
      if(field1349 != null) {
         char var2 = var1.getKeyChar();
         if(var2 != 0 && var2 != '\uffff' && class156.method2741(var2)) {
            int var3 = field1341 + 1 & 127;
            if(var3 != field1347) {
               field1337[field1341] = -1;
               field1336[field1341] = var2;
               field1341 = var3;
            }
         }
      }

      var1.consume();
   }

   public final synchronized void keyPressed(KeyEvent var1) {
      class113.field1064.getCallbacks().keyPressed(var1);
      if(!var1.isConsumed()) {
         this.copy$keyPressed(var1);
      }

   }

   public final synchronized void focusLost(FocusEvent var1) {
      this.onFocusLost(var1);
      if(field1349 != null) {
         field1322 = -1;
      }

   }

   public final void keyTyped(KeyEvent var1) {
      class113.field1064.getCallbacks().keyTyped(var1);
      if(!var1.isConsumed()) {
         this.copy$keyTyped(var1);
      }

   }

   public final void focusGained(FocusEvent var1) {
   }

   public final synchronized void keyReleased(KeyEvent var1) {
      class113.field1064.getCallbacks().keyReleased(var1);
      if(!var1.isConsumed()) {
         this.copy$keyReleased(var1);
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([BI)Llp;",
      garbageValue = "1565648443"
   )
   public static final class26 method2509(byte[] var0) {
      BufferedImage var1 = null;

      try {
         var1 = ImageIO.read(new ByteArrayInputStream(var0));
         int var2 = var1.getWidth();
         int var3 = var1.getHeight();
         int[] var4 = new int[var2 * var3];
         PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2);
         var5.grabPixels();
         return new class26(var4, var2, var3);
      } catch (IOException var7) {
         ;
      } catch (InterruptedException var8) {
         ;
      }

      return new class26(0, 0);
   }

   @ObfuscatedName("gd")
   @ObfuscatedSignature(
      signature = "(Lbi;I)V",
      garbageValue = "-1921766669"
   )
   static final void method2508(class274 var0) {
      long var1 = 0L;
      int var3 = -1;
      int var4 = 0;
      int var5 = 0;
      if(var0.field2991 == 0) {
         var1 = class258.field2566.method5357(var0.field2998, var0.field2992, var0.field2993);
      }

      if(var0.field2991 == 1) {
         var1 = class258.field2566.method5358(var0.field2998, var0.field2992, var0.field2993);
      }

      if(var0.field2991 == 2) {
         var1 = class258.field2566.method5387(var0.field2998, var0.field2992, var0.field2993);
      }

      if(var0.field2991 == 3) {
         var1 = class258.field2566.method5398(var0.field2998, var0.field2992, var0.field2993);
      }

      if(var1 != 0L) {
         int var6 = class258.field2566.method5361(var0.field2998, var0.field2992, var0.field2993, var1);
         var3 = class233.method4163(var1);
         var4 = var6 & 31;
         var5 = var6 >> 6 & 3;
      }

      var0.field3003 = var3;
      var0.field2996 = var4;
      var0.field2995 = var5;
   }

   @ObfuscatedName("fy")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-69"
   )
   static void method2500(int var0, int var1) {
      if(client.field3965 != 0 && var0 != -1) {
         class136.method2511(class78.field717, var0, 0, client.field3965, false);
         client.field3972 = true;
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "1794712804"
   )
   static void method2488(int var0, String var1, String var2, String var3) {
      client.onAddChatMessage(var0, var1, var2, var3);
      class210 var4 = (class210)class297.field3194.get(Integer.valueOf(var0));
      if(var4 == null) {
         var4 = new class210();
         class297.field3194.put(Integer.valueOf(var0), var4);
      }

      class286 var5 = var4.method3704(var0, var1, var2, var3);
      class297.field3193.method794(var5, (long)var5.field3113);
      class297.field3195.method5556(var5);
      client.field3894 = client.field3917;
   }
}
