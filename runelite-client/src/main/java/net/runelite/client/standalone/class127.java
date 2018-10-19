package net.runelite.client.standalone;

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
public final class class127 extends class314 implements Runnable {
   @ObfuscatedName("f")
   InputStream field1213;
   @ObfuscatedName("m")
   boolean field1215;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -124509413
   )
   final int field1208;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -370958097
   )
   int field1216;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -38963123
   )
   int field1211;
   @ObfuscatedName("c")
   byte[] field1210;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lfd;"
   )
   class164 field1209;
   @ObfuscatedName("l")
   OutputStream field1212;
   @ObfuscatedName("s")
   boolean field1207;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Led;"
   )
   class100 field1205;
   @ObfuscatedName("w")
   Socket field1206;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -2063151429
   )
   final int field1214;

   @ObfuscatedSignature(
      signature = "(Ljava/net/Socket;Lfd;I)V"
   )
   public class127(Socket var1, class164 var2, int var3) throws IOException {
      this.field1207 = false;
      this.field1211 = 0;
      this.field1216 = 0;
      this.field1215 = false;
      this.field1209 = var2;
      this.field1206 = var1;
      this.field1214 = var3;
      this.field1208 = var3 - 100;
      this.field1206.setSoTimeout(30000);
      this.field1206.setTcpNoDelay(true);
      this.field1206.setReceiveBufferSize(65536);
      this.field1206.setSendBufferSize(65536);
      this.field1213 = this.field1206.getInputStream();
      this.field1212 = this.field1206.getOutputStream();
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1713323068"
   )
   public void vmethod5521() {
      if(!this.field1207) {
         synchronized(this) {
            this.field1207 = true;
            this.notifyAll();
         }

         if(this.field1205 != null) {
            while(this.field1205.field920 == 0) {
               class189.method3249(1L);
            }

            if(this.field1205.field920 == 1) {
               try {
                  ((Thread)this.field1205.field922).join();
               } catch (InterruptedException var3) {
                  ;
               }
            }
         }

         this.field1205 = null;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "639255468"
   )
   public void vmethod5520(byte[] var1, int var2, int var3) throws IOException {
      this.method2338(var1, var2, var3);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "([BIIS)I",
      garbageValue = "-23781"
   )
   public int vmethod5519(byte[] var1, int var2, int var3) throws IOException {
      if(this.field1207) {
         return 0;
      } else {
         int var4;
         int var5;
         for(var4 = var3; var3 > 0; var3 -= var5) {
            var5 = this.field1213.read(var1, var2, var3);
            if(var5 <= 0) {
               throw new EOFException();
            }

            var2 += var5;
         }

         return var4;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1634520966"
   )
   public boolean vmethod5527(int var1) throws IOException {
      return this.field1207?false:this.field1213.available() >= var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1393494996"
   )
   public int vmethod5518() throws IOException {
      return this.field1207?0:this.field1213.read();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1692386525"
   )
   public int vmethod5516() throws IOException {
      return this.field1207?0:this.field1213.available();
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "([BIIB)V",
      garbageValue = "-81"
   )
   void method2338(byte[] var1, int var2, int var3) throws IOException {
      if(!this.field1207) {
         if(this.field1215) {
            this.field1215 = false;
            throw new IOException();
         } else {
            if(this.field1210 == null) {
               this.field1210 = new byte[this.field1214];
            }

            synchronized(this) {
               for(int var5 = 0; var5 < var3; ++var5) {
                  this.field1210[this.field1216] = var1[var5 + var2];
                  this.field1216 = (this.field1216 + 1) % this.field1214;
                  if((this.field1211 + this.field1208) % this.field1214 == this.field1216) {
                     throw new IOException();
                  }
               }

               if(this.field1205 == null) {
                  this.field1205 = this.field1209.method2821(this, 3);
               }

               this.notifyAll();
            }
         }
      }
   }

   protected void finalize() {
      this.vmethod5521();
   }

   public void run() {
      try {
         while(true) {
            label84: {
               int var1;
               int var2;
               synchronized(this) {
                  if(this.field1211 == this.field1216) {
                     if(this.field1207) {
                        break label84;
                     }

                     try {
                        this.wait();
                     } catch (InterruptedException var10) {
                        ;
                     }
                  }

                  var2 = this.field1211;
                  if(this.field1216 >= this.field1211) {
                     var1 = this.field1216 - this.field1211;
                  } else {
                     var1 = this.field1214 - this.field1211;
                  }
               }

               if(var1 <= 0) {
                  continue;
               }

               try {
                  this.field1212.write(this.field1210, var2, var1);
               } catch (IOException var9) {
                  this.field1215 = true;
               }

               this.field1211 = (var1 + this.field1211) % this.field1214;

               try {
                  if(this.field1216 == this.field1211) {
                     this.field1212.flush();
                  }
               } catch (IOException var8) {
                  this.field1215 = true;
               }
               continue;
            }

            try {
               if(this.field1213 != null) {
                  this.field1213.close();
               }

               if(this.field1212 != null) {
                  this.field1212.close();
               }

               if(this.field1206 != null) {
                  this.field1206.close();
               }
            } catch (IOException var7) {
               ;
            }

            this.field1210 = null;
            break;
         }
      } catch (Exception var12) {
         class295.method5145((String)null, var12, -1545522440);
      }

   }

   @ObfuscatedName("jc")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-18"
   )
   static final void method2365(int var0) {
      if(class267.method4843(var0)) {
         class329[] var1 = class329.field3533[var0];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            class329 var3 = var1[var2];
            if(var3 != null) {
               var3.field3672 = 0;
               var3.field3649 = 0;
            }
         }

      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-911494366"
   )
   public static int method2367(int var0, int var1) {
      int var2 = var0 >>> 31;
      return (var0 + var2) / var1 - var2;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;I)V",
      garbageValue = "1750272217"
   )
   static void method2364(Component var0) {
      var0.removeMouseListener(class226.field2208);
      var0.removeMouseMotionListener(class226.field2208);
      var0.removeFocusListener(class226.field2208);
      class226.field2210 = 0;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1650794017"
   )
   static void method2366(int var0, int var1) {
      int[] var2 = new int[4];
      int[] var3 = new int[4];
      var2[0] = var0;
      var3[0] = var1;
      int var4 = 1;

      for(int var5 = 0; var5 < 4; ++var5) {
         if(class126.field1191[var5] != var0) {
            var2[var4] = class126.field1191[var5];
            var3[var4] = class126.field1190[var5];
            ++var4;
         }
      }

      class126.field1191 = var2;
      class126.field1190 = var3;
      class74.method1179(class126.field1187, 0, class126.field1187.length - 1, class126.field1191, class126.field1190);
   }
}
