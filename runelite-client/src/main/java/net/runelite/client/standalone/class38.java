package net.runelite.client.standalone;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFileOnDisk;

@ObfuscatedName("da")
public final class class38 implements RSFileOnDisk {
   @ObfuscatedName("jx")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   static class329 field286;
   @ObfuscatedName("fk")
   @ObfuscatedGetter(
      longValue = 204967730347306863L
   )
   static long field287;
   @ObfuscatedName("f")
   RandomAccessFile field285;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      longValue = -471004502122884367L
   )
   long field281;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      longValue = -8631779964323264085L
   )
   long field282;

   public class38(File var1, String var2, long var3) throws IOException {
      if(-1L == var3) {
         var3 = Long.MAX_VALUE;
      }

      if(var1.length() >= var3) {
         var1.delete();
      }

      this.field285 = new RandomAccessFile(var1, var2);
      this.field281 = var3;
      this.field282 = 0L;
      int var5 = this.field285.read();
      if(var5 != -1 && !var2.equals("r")) {
         this.field285.seek(0L);
         this.field285.write(var5);
      }

      this.field285.seek(0L);
   }

   @ObfuscatedName("f")
   final void method596(long var1) throws IOException {
      this.field285.seek(var1);
      this.field282 = var1;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "([BIIS)I",
      garbageValue = "20168"
   )
   public final int method601(byte[] var1, int var2, int var3) throws IOException {
      int var4 = this.field285.read(var1, var2, var3);
      if(var4 > 0) {
         this.field282 += (long)var4;
      }

      return var4;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)J",
      garbageValue = "-93"
   )
   public final long method600() throws IOException {
      return this.field285.length();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "-622466464"
   )
   public final void method597(byte[] var1, int var2, int var3) throws IOException {
      if(this.field282 + (long)var3 > this.field281) {
         this.field285.seek(this.field281 + 1L);
         this.field285.write(1);
         throw new EOFException();
      } else {
         this.field285.write(var1, var2, var3);
         this.field282 += (long)var3;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-2117213601"
   )
   public final void method599(boolean var1) throws IOException {
      if(this.field285 != null) {
         if(var1) {
            try {
               this.field285.getFD().sync();
            } catch (SyncFailedException var3) {
               ;
            }
         }

         this.field285.close();
         this.field285 = null;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-301088923"
   )
   public final void method609() throws IOException {
      this.method599(false);
   }

   protected void finalize() throws Throwable {
      if(this.field285 != null) {
         System.out.println("");
         this.method609();
      }

   }

   public RandomAccessFile getFile() {
      return this.field285;
   }

   public long getLength() {
      return this.field281;
   }

   public long getPosition() {
      return this.field282;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Ljd;",
      garbageValue = "2111119689"
   )
   public static class90 method619(int var0) {
      class90 var1 = (class90)class90.field870.method2268((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class90.field884.method2579(13, var0, 479571266);
         var1 = new class90();
         var1.field879 = var0;
         if(var2 != null) {
            var1.method1613(new Buffer(var2));
         }

         class90.field870.method2275(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("il")
   @ObfuscatedSignature(
      signature = "(Lhw;III)V",
      garbageValue = "169167610"
   )
   static final void method621(class329 var0, int var1, int var2) {
      if(client.field3905 == null && !client.field3939) {
         if(var0 != null) {
            class329 var5 = var0;
            int var7 = class104.method1771(var0);
            int var6 = var7 >> 17 & 7;
            int var8 = var6;
            class329 var4;
            int var9;
            if(var6 == 0) {
               var4 = null;
            } else {
               var9 = 0;

               while(true) {
                  if(var9 >= var8) {
                     var4 = var5;
                     break;
                  }

                  var5 = class189.getWidget(var5.field3563);
                  if(var5 == null) {
                     var4 = null;
                     break;
                  }

                  ++var9;
               }
            }

            class329 var10 = var4;
            if(var4 == null) {
               var10 = var0.field3625;
            }

            if(var10 != null) {
               client.field3905 = var0;
               var5 = var0;
               var7 = class104.method1771(var0);
               var6 = var7 >> 17 & 7;
               var8 = var6;
               if(var6 == 0) {
                  var4 = null;
               } else {
                  var9 = 0;

                  while(true) {
                     if(var9 >= var8) {
                        var4 = var5;
                        break;
                     }

                     var5 = class189.getWidget(var5.field3563);
                     if(var5 == null) {
                        var4 = null;
                        break;
                     }

                     ++var9;
                  }
               }

               var10 = var4;
               if(var4 == null) {
                  var10 = var0.field3625;
               }

               client.field3914 = var10;
               client.field3883 = var1;
               client.field3886 = var2;
               class49.field370 = 0;
               client.field3916 = false;
               client.draggingWidgetChanged(-1);
               int var11 = class299.method5190();
               if(var11 != -1) {
                  class45.field353 = new class152();
                  class45.field353.field1446 = client.field3870[var11];
                  class45.field353.field1453 = client.field3871[var11];
                  class45.field353.field1448 = client.field3872[var11];
                  class45.field353.field1449 = client.field3947[var11];
                  class45.field353.field1451 = client.field3874[var11];
               }

               return;
            }
         }

      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
      garbageValue = "13401829"
   )
   public static String method623(CharSequence var0) {
      String var1 = class146.method2567(class251.method4510(var0));
      if(var1 == null) {
         var1 = "";
      }

      return var1;
   }
}
