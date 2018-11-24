package net.runelite.standalone;

import java.awt.Component;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public final class class154 extends class36 implements Runnable {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -124509413
   )
   final int field1894;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -38963123
   )
   int field1897;
   @ObfuscatedName("c")
   byte[] field1896;
   @ObfuscatedName("l")
   OutputStream field1898;
   @ObfuscatedName("s")
   boolean field1893;
   @ObfuscatedName("f")
   InputStream field1899;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -370958097
   )
   int field1902;
   @ObfuscatedName("m")
   boolean field1901;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -2063151429
   )
   final int field1900;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Led;"
   )
   class128 field1891;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lfd;"
   )
   class118 field1895;
   @ObfuscatedName("w")
   Socket field1892;

   @ObfuscatedSignature(
      signature = "(Ljava/net/Socket;Lfd;I)V"
   )
   public class154(Socket var1, class118 var2, int var3) throws IOException {
      this.field1893 = false;
      this.field1897 = 0;
      this.field1902 = 0;
      this.field1901 = false;
      this.field1895 = var2;
      this.field1892 = var1;
      this.field1900 = var3;
      this.field1894 = var3 - 100;
      this.field1892.setSoTimeout(30000);
      this.field1892.setTcpNoDelay(true);
      this.field1892.setReceiveBufferSize(65536);
      this.field1892.setSendBufferSize(65536);
      this.field1899 = this.field1892.getInputStream();
      this.field1898 = this.field1892.getOutputStream();
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1713323068"
   )
   public void vmethod2787() {
      if(!this.field1893) {
         synchronized(this) {
            this.field1893 = true;
            this.notifyAll();
         }

         if(this.field1891 != null) {
            while(this.field1891.field1716 == 0) {
               class48.method1045(1L);
            }

            if(this.field1891.field1716 == 1) {
               try {
                  ((Thread)this.field1891.field1718).join();
               } catch (InterruptedException var3) {
                  ;
               }
            }
         }

         this.field1891 = null;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "639255468"
   )
   public void vmethod2791(byte[] var1, int var2, int var3) throws IOException {
      this.method2792(var1, var2, var3);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1634520966"
   )
   public boolean vmethod2817(int var1) throws IOException {
      return this.field1893?false:this.field1899.available() >= var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1393494996"
   )
   public int vmethod2793() throws IOException {
      return this.field1893?0:this.field1899.read();
   }

   protected void finalize() {
      this.vmethod2787();
   }

   public void run() {
      try {
         while(true) {
            label84: {
               int var1;
               int var2;
               synchronized(this) {
                  if(this.field1897 == this.field1902) {
                     if(this.field1893) {
                        break label84;
                     }

                     try {
                        this.wait();
                     } catch (InterruptedException var10) {
                        ;
                     }
                  }

                  var2 = this.field1897;
                  if(this.field1902 >= this.field1897) {
                     var1 = this.field1902 - this.field1897;
                  } else {
                     var1 = this.field1900 - this.field1897;
                  }
               }

               if(var1 <= 0) {
                  continue;
               }

               try {
                  this.field1898.write(this.field1896, var2, var1);
               } catch (IOException var9) {
                  this.field1901 = true;
               }

               this.field1897 = (var1 + this.field1897) % this.field1900;

               try {
                  if(this.field1902 == this.field1897) {
                     this.field1898.flush();
                  }
               } catch (IOException var8) {
                  this.field1901 = true;
               }
               continue;
            }

            try {
               if(this.field1899 != null) {
                  this.field1899.close();
               }

               if(this.field1898 != null) {
                  this.field1898.close();
               }

               if(this.field1892 != null) {
                  this.field1892.close();
               }
            } catch (IOException var7) {
               ;
            }

            this.field1896 = null;
            break;
         }
      } catch (Exception var12) {
         class202.method4018((String)null, var12, -1545522440);
      }

   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "([BIIB)V",
      garbageValue = "-81"
   )
   void method2792(byte[] var1, int var2, int var3) throws IOException {
      if(!this.field1893) {
         if(this.field1901) {
            this.field1901 = false;
            throw new IOException();
         } else {
            if(this.field1896 == null) {
               this.field1896 = new byte[this.field1900];
            }

            synchronized(this) {
               for(int var5 = 0; var5 < var3; ++var5) {
                  this.field1896[this.field1902] = var1[var5 + var2];
                  this.field1902 = (this.field1902 + 1) % this.field1900;
                  if((this.field1897 + this.field1894) % this.field1900 == this.field1902) {
                     throw new IOException();
                  }
               }

               if(this.field1891 == null) {
                  this.field1891 = this.field1895.method2138(this, 3);
               }

               this.notifyAll();
            }
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "([BIIS)I",
      garbageValue = "-23781"
   )
   public int vmethod2803(byte[] var1, int var2, int var3) throws IOException {
      if(this.field1893) {
         return 0;
      } else {
         int var4;
         int var5;
         for(var4 = var3; var3 > 0; var3 -= var5) {
            var5 = this.field1899.read(var1, var2, var3);
            if(var5 <= 0) {
               throw new EOFException();
            }

            var2 += var5;
         }

         return var4;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1692386525"
   )
   public int vmethod2789() throws IOException {
      return this.field1893?0:this.field1899.available();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;I)V",
      garbageValue = "1750272217"
   )
   static void method2818(Component var0) {
      var0.removeMouseListener(class163.field1968);
      var0.removeMouseMotionListener(class163.field1968);
      var0.removeFocusListener(class163.field1968);
      class163.field1970 = 0;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1650794017"
   )
   static void method2820(int var0, int var1) {
      int[] var2 = new int[4];
      int[] var3 = new int[4];
      var2[0] = var0;
      var3[0] = var1;
      int var4 = 1;

      for(int var5 = 0; var5 < 4; ++var5) {
         if(class88.field951[var5] != var0) {
            var2[var4] = class88.field951[var5];
            var3[var4] = class88.field950[var5];
            ++var4;
         }
      }

      class88.field951 = var2;
      class88.field950 = var3;
      class82.method1604(class88.field947, 0, class88.field947.length - 1, class88.field951, class88.field950);
   }

   @ObfuscatedName("jc")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-18"
   )
   static final void method2819(int var0) {
      if(class80.method1596(var0)) {
         class187[] var1 = class187.field2547[var0];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            class187 var3 = var1[var2];
            if(var3 != null) {
               var3.field2686 = 0;
               var3.field2663 = 0;
            }
         }

      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-911494366"
   )
   public static int method2821(int var0, int var1) {
      int var2 = var0 >>> 31;
      return (var0 + var2) / var1 - var2;
   }
}
