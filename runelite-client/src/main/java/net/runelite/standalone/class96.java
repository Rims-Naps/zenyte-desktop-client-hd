package net.runelite.standalone;

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
public final class class96 implements KeyListener, FocusListener, RSKeyFocusListener {
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 978955095
   )
   static int field1054;
   @ObfuscatedName("cr")
   @ObfuscatedGetter(
      intValue = -2130936079
   )
   public static int field1047;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = 1499388091
   )
   public static int field1037;
   @ObfuscatedName("i")
   static String field1041;
   @ObfuscatedName("cs")
   static int[] field1045;
   @ObfuscatedName("cq")
   public static int[] field1053;
   @ObfuscatedName("cd")
   @ObfuscatedGetter(
      intValue = 42808581
   )
   public static int field1055;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lao;"
   )
   public static class96 field1057;
   @ObfuscatedName("ce")
   public static int[] field1046;
   @ObfuscatedName("cb")
   static char[] field1044;
   @ObfuscatedName("ck")
   @ObfuscatedGetter(
      intValue = -569458333
   )
   public static int field1030;
   @ObfuscatedName("ct")
   static int[] field1052;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = -1337835921
   )
   public static int field1042;
   @ObfuscatedName("ch")
   @ObfuscatedGetter(
      intValue = 1692011759
   )
   public static int field1049;
   @ObfuscatedName("cz")
   public static boolean[] field1040;
   @ObfuscatedName("cn")
   @ObfuscatedGetter(
      intValue = 1151633825
   )
   public static volatile int field1051;

   static {
      field1057 = new class96();
      field1040 = new boolean[112];
      field1053 = new int[128];
      field1042 = 0;
      field1030 = 0;
      field1044 = new char[128];
      field1045 = new int[128];
      field1046 = new int[128];
      field1047 = 0;
      field1055 = 0;
      field1049 = 0;
      field1037 = 0;
      field1051 = 0;
      field1052 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
   }

   public void onFocusLost(FocusEvent var1) {
      FocusChanged var2 = new FocusChanged();
      var2.setFocused(false);
      class302.field3755.getCallbacks().post(var2);
   }

   public final synchronized void copy$keyPressed(KeyEvent var1) {
      if(field1057 != null) {
         int var2 = var1.getKeyCode();
         if(var2 >= 0 && var2 < field1052.length) {
            var2 = field1052[var2];
            if((var2 & 128) != 0) {
               var2 = -1;
            }
         } else {
            var2 = -1;
         }

         if(field1030 >= 0 && var2 >= 0) {
            field1053[field1030] = var2;
            field1030 = field1030 + 1 & 127;
            if(field1042 == field1030) {
               field1030 = -1;
            }
         }

         int var3;
         if(var2 >= 0) {
            var3 = field1049 + 1 & 127;
            if(var3 != field1055) {
               field1045[field1049] = var2;
               field1044[field1049] = 0;
               field1049 = var3;
            }
         }

         var3 = var1.getModifiers();
         if((var3 & 10) != 0 || var2 == 85 || var2 == 10) {
            var1.consume();
         }
      }

   }

   public final synchronized void copy$keyReleased(KeyEvent var1) {
      if(field1057 != null) {
         int var2 = var1.getKeyCode();
         if(var2 >= 0 && var2 < field1052.length) {
            var2 = field1052[var2] & -129;
         } else {
            var2 = -1;
         }

         if(field1030 >= 0 && var2 >= 0) {
            field1053[field1030] = ~var2;
            field1030 = field1030 + 1 & 127;
            if(field1030 == field1042) {
               field1030 = -1;
            }
         }
      }

      var1.consume();
   }

   public final void copy$keyTyped(KeyEvent var1) {
      if(field1057 != null) {
         char var2 = var1.getKeyChar();
         if(var2 != 0 && var2 != '\uffff' && class316.method6204(var2)) {
            int var3 = field1049 + 1 & 127;
            if(var3 != field1055) {
               field1045[field1049] = -1;
               field1044[field1049] = var2;
               field1049 = var3;
            }
         }
      }

      var1.consume();
   }

   public final synchronized void keyPressed(KeyEvent var1) {
      class302.field3755.getCallbacks().keyPressed(var1);
      if(!var1.isConsumed()) {
         this.copy$keyPressed(var1);
      }

   }

   public final synchronized void focusLost(FocusEvent var1) {
      this.onFocusLost(var1);
      if(field1057 != null) {
         field1030 = -1;
      }

   }

   public final void keyTyped(KeyEvent var1) {
      class302.field3755.getCallbacks().keyTyped(var1);
      if(!var1.isConsumed()) {
         this.copy$keyTyped(var1);
      }

   }

   public final void focusGained(FocusEvent var1) {
   }

   public final synchronized void keyReleased(KeyEvent var1) {
      class302.field3755.getCallbacks().keyReleased(var1);
      if(!var1.isConsumed()) {
         this.copy$keyReleased(var1);
      }

   }

   @ObfuscatedName("gd")
   @ObfuscatedSignature(
      signature = "(Lbi;I)V",
      garbageValue = "-1921766669"
   )
   static final void method1773(class87 var0) {
      long var1 = 0L;
      int var3 = -1;
      int var4 = 0;
      int var5 = 0;
      if(var0.field931 == 0) {
         var1 = class269.field3464.method1951(var0.field938, var0.field932, var0.field933);
      }

      if(var0.field931 == 1) {
         var1 = class269.field3464.method1952(var0.field938, var0.field932, var0.field933);
      }

      if(var0.field931 == 2) {
         var1 = class269.field3464.method1981(var0.field938, var0.field932, var0.field933);
      }

      if(var0.field931 == 3) {
         var1 = class269.field3464.method1992(var0.field938, var0.field932, var0.field933);
      }

      if(var1 != 0L) {
         int var6 = class269.field3464.method1955(var0.field938, var0.field932, var0.field933, var1);
         var3 = class178.method3682(var1);
         var4 = var6 & 31;
         var5 = var6 >> 6 & 3;
      }

      var0.field943 = var3;
      var0.field936 = var4;
      var0.field935 = var5;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "1794712804"
   )
   static void method1753(int var0, String var1, String var2, String var3) {
      client.onAddChatMessage(var0, var1, var2, var3);
      class55 var4 = (class55)class38.field367.get(Integer.valueOf(var0));
      if(var4 == null) {
         var4 = new class55();
         class38.field367.put(Integer.valueOf(var0), var4);
      }

      class227 var5 = var4.method1231(var0, var1, var2, var3);
      class38.field366.method4672(var5, (long)var5.field3056);
      class38.field368.method2168(var5);
      client.field2315 = client.field2338;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([BI)Llp;",
      garbageValue = "1565648443"
   )
   public static final SpritePixels method1774(byte[] var0) {
      BufferedImage var1 = null;

      try {
         var1 = ImageIO.read(new ByteArrayInputStream(var0));
         int var2 = var1.getWidth();
         int var3 = var1.getHeight();
         int[] var4 = new int[var2 * var3];
         PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2);
         var5.grabPixels();
         return new SpritePixels(var4, var2, var3);
      } catch (IOException var7) {
         ;
      } catch (InterruptedException var8) {
         ;
      }

      return new SpritePixels(0, 0);
   }

   @ObfuscatedName("fy")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-69"
   )
   static void method1765(int var0, int var1) {
      if(client.field2386 != 0 && var0 != -1) {
         class67.method1488(class226.field3043, var0, 0, client.field2386, false);
         client.field2393 = true;
      }

   }
}
