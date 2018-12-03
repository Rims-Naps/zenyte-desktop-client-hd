package net.runelite.standalone;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class118 implements Runnable {
   @ObfuscatedName("hx")
   @ObfuscatedGetter(
      intValue = -1390194635
   )
   static int field1632;
   @ObfuscatedName("l")
   public static String field1626;
   @ObfuscatedName("fq")
   @ObfuscatedGetter(
      intValue = 2104627481
   )
   static int field1631;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Led;"
   )
   class128 field1623;
   @ObfuscatedName("a")
   boolean field1625;
   @ObfuscatedName("e")
   Thread field1624;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Led;"
   )
   class128 field1621;

   public class118() {
      this.field1621 = null;
      this.field1623 = null;
      this.field1625 = false;
      class165.field1998 = "Unknown";
      field1626 = "1.6";

      try {
         class165.field1998 = System.getProperty("java.vendor");
         field1626 = System.getProperty("java.version");
      } catch (Exception var2) {
         ;
      }

      this.field1625 = false;
      this.field1624 = new Thread(this);
      this.field1624.setPriority(10);
      this.field1624.setDaemon(true);
      this.field1624.start();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIILjava/lang/Object;S)Led;",
      garbageValue = "176"
   )
   final class128 method2130(int var1, int var2, int var3, Object var4) {
      class128 var5 = new class128();
      var5.field1717 = var1;
      var5.field1712 = var2;
      var5.field1719 = var4;
      synchronized(this) {
         if(this.field1623 != null) {
            this.field1623.field1715 = var5;
            this.field1623 = var5;
         } else {
            this.field1623 = this.field1621 = var5;
         }

         this.notify();
         return var5;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Runnable;IB)Led;",
      garbageValue = "-95"
   )
   public final class128 method2138(Runnable var1, int var2) {
      return this.method2130(2, var2, 0, var1);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1821799274"
   )
   public final void method2135() {
      synchronized(this) {
         this.field1625 = true;
         this.notifyAll();
      }

      try {
         this.field1624.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   public final void run() {
      while(true) {
         class128 var1;
         synchronized(this) {
            while(true) {
               if(this.field1625) {
                  return;
               }

               if(this.field1621 != null) {
                  var1 = this.field1621;
                  this.field1621 = this.field1621.field1715;
                  if(this.field1621 == null) {
                     this.field1623 = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var8) {
                  ;
               }
            }
         }

         try {
            int var5 = var1.field1717;
            if(var5 == 1) {
               var1.field1718 = new Socket(InetAddress.getByName((String)var1.field1719), var1.field1712);
            } else if(var5 == 2) {
               Thread var3 = new Thread((Runnable)var1.field1719);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.field1712);
               var1.field1718 = var3;
            } else if(var5 == 4) {
               var1.field1718 = new DataInputStream(((URL)var1.field1719).openStream());
            }

            var1.field1716 = 1;
         } catch (ThreadDeath var6) {
            throw var6;
         } catch (Throwable var7) {
            var1.field1716 = 2;
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;IB)Led;",
      garbageValue = "-18"
   )
   public final class128 method2147(String var1, int var2) {
      return this.method2130(1, var2, 0, var1);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(CI)B",
      garbageValue = "-2061353300"
   )
   public static byte method2151(char var0) {
      byte var1;
      if(var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
         var1 = (byte)var0;
      } else if(var0 == 8364) {
         var1 = -128;
      } else if(var0 == 8218) {
         var1 = -126;
      } else if(var0 == 402) {
         var1 = -125;
      } else if(var0 == 8222) {
         var1 = -124;
      } else if(var0 == 8230) {
         var1 = -123;
      } else if(var0 == 8224) {
         var1 = -122;
      } else if(var0 == 8225) {
         var1 = -121;
      } else if(var0 == 710) {
         var1 = -120;
      } else if(var0 == 8240) {
         var1 = -119;
      } else if(var0 == 352) {
         var1 = -118;
      } else if(var0 == 8249) {
         var1 = -117;
      } else if(var0 == 338) {
         var1 = -116;
      } else if(var0 == 381) {
         var1 = -114;
      } else if(var0 == 8216) {
         var1 = -111;
      } else if(var0 == 8217) {
         var1 = -110;
      } else if(var0 == 8220) {
         var1 = -109;
      } else if(var0 == 8221) {
         var1 = -108;
      } else if(var0 == 8226) {
         var1 = -107;
      } else if(var0 == 8211) {
         var1 = -106;
      } else if(var0 == 8212) {
         var1 = -105;
      } else if(var0 == 732) {
         var1 = -104;
      } else if(var0 == 8482) {
         var1 = -103;
      } else if(var0 == 353) {
         var1 = -102;
      } else if(var0 == 8250) {
         var1 = -101;
      } else if(var0 == 339) {
         var1 = -100;
      } else if(var0 == 382) {
         var1 = -98;
      } else if(var0 == 376) {
         var1 = -97;
      } else {
         var1 = 63;
      }

      return var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "42196030"
   )
   static boolean method2149(int var0, int var1) {
      return var0 != 4 || var1 < 8;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Ljl;",
      garbageValue = "1583206518"
   )
   public static class269 method2150(int var0) {
      class269 var1 = (class269)class269.field3474.method1813((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class269.field3469.method4398(8, var0, -2125037424);
         var1 = new class269();
         if(var2 != null) {
            var1.method5318(new Buffer(var2));
         }

         class269.field3474.method1820(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "([BZI)Ljava/lang/Object;",
      garbageValue = "-946181887"
   )
   public static Object method2132(byte[] var0, boolean var1) {
      if(var0 == null) {
         return null;
      } else {
         if(var0.length > 136 && !class132.field1735) {
            try {
               class238 var2 = new class238();
               var2.vmethod4714(var0);
               return var2;
            } catch (Throwable var3) {
               class132.field1735 = true;
            }
         }

         return var0;
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)I",
      garbageValue = "240949578"
   )
   public static int method2136(String var0) {
      return var0.length() + 1;
   }
}
