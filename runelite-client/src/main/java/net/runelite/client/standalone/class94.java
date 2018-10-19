package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
public class class94 implements Runnable {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   static class320 field895;
   @ObfuscatedName("e")
   static Thread field890;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   static class320 field891;
   @ObfuscatedName("s")
   public static Object field892;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1740356677
   )
   public static int field894;

   static {
      field895 = new class320();
      field891 = new class320();
      field894 = 0;
      field892 = new Object();
   }

   public void run() {
      try {
         while(true) {
            class320 var2 = field895;
            class167 var1;
            synchronized(field895) {
               var1 = (class167)field895.method5604();
            }

            Object var14;
            if(var1 != null) {
               if(var1.field1542 == 0) {
                  var1.field1540.method4999((int)var1.field704, var1.field1541, var1.field1541.length);
                  var2 = field895;
                  synchronized(field895) {
                     var1.method1186();
                  }
               } else if(var1.field1542 == 1) {
                  var1.field1541 = var1.field1540.method5000((int)var1.field704);
                  var2 = field895;
                  synchronized(field895) {
                     field891.method5600(var1);
                  }
               }

               var14 = field892;
               synchronized(field892) {
                  if(field894 <= 1) {
                     field894 = 0;
                     field892.notifyAll();
                     return;
                  }

                  field894 = 600;
               }
            } else {
               class189.method3249(100L);
               var14 = field892;
               synchronized(field892) {
                  if(field894 <= 1) {
                     field894 = 0;
                     field892.notifyAll();
                     return;
                  }

                  --field894;
               }
            }
         }
      } catch (Exception var13) {
         class295.method5145((String)null, var13, 733006107);
      }
   }
}
