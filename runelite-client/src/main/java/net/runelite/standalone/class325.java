package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
public class class325 implements Runnable {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   static class70 field3947;
   @ObfuscatedName("s")
   public static Object field3948;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   static class70 field3951;
   @ObfuscatedName("e")
   static Thread field3946;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1740356677
   )
   public static int field3950;

   static {
      field3951 = new class70();
      field3947 = new class70();
      field3950 = 0;
      field3948 = new Object();
   }

   public void run() {
      try {
         while(true) {
            class70 var2 = field3951;
            class192 var1;
            synchronized(field3951) {
               var1 = (class192)field3951.method1503();
            }

            Object var14;
            if(var1 != null) {
               if(var1.field2743 == 0) {
                  var1.field2741.method5236((int)var1.field2792, var1.field2742, var1.field2742.length);
                  var2 = field3951;
                  synchronized(field3951) {
                     var1.method3937();
                  }
               } else if(var1.field2743 == 1) {
                  var1.field2742 = var1.field2741.method5237((int)var1.field2792);
                  var2 = field3951;
                  synchronized(field3951) {
                     field3947.method1499(var1);
                  }
               }

               var14 = field3948;
               synchronized(field3948) {
                  if(field3950 <= 1) {
                     field3950 = 0;
                     field3948.notifyAll();
                     return;
                  }

                  field3950 = 600;
               }
            } else {
               class48.method1045(100L);
               var14 = field3948;
               synchronized(field3948) {
                  if(field3950 <= 1) {
                     field3950 = 0;
                     field3948.notifyAll();
                     return;
                  }

                  --field3950;
               }
            }
         }
      } catch (Exception var13) {
         class202.method4018((String)null, var13, 733006107);
      }
   }
}
