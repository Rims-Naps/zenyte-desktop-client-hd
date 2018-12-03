package net.runelite.standalone;

import java.awt.Image;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public class class294 {
   @ObfuscatedName("aa")
   static Image field3681;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lhx;"
   )
   public Location field3680;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 733802741
   )
   public int field3679;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lhx;"
   )
   public Location field3678;

   @ObfuscatedSignature(
      signature = "(ILhx;Lhx;)V"
   )
   public class294(int var1, Location var2, Location var3) {
      this.field3679 = var1;
      this.field3680 = var2;
      this.field3678 = var3;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(ILik;IIIZI)V",
      garbageValue = "-2028161028"
   )
   public static void method5775(int var0, class217 var1, int var2, int var3, int var4, boolean var5) {
      class43.field481 = 1;
      class270.field3480 = var1;
      class259.field3385 = var2;
      class177.field2443 = var3;
      class226.field3046 = var4;
      class113.field1296 = var5;
      class89.field974 = var0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1826674650"
   )
   static boolean method5776() {
      try {
         if(class296.field3696 == null) {
            class296.field3696 = class179.field2454.method2234(new URL(class82.field905));
         } else if(class296.field3696.method6191()) {
            byte[] var0 = class296.field3696.method6190();
            Buffer var1 = new Buffer(var0);
            var1.readInt();
            class88.field944 = var1.readShort();
            class88.field947 = new class88[class88.field944];

            class88 var3;
            for(int var2 = 0; var2 < class88.field944; var3.field961 = var2++) {
               var3 = class88.field947[var2] = new class88();
               var3.field958 = var1.readShort();
               var3.field953 = var1.readInt();
               var3.field955 = var1.readString();
               var3.field956 = var1.readString();
               var3.field957 = var1.readUnsignedByte();
               var3.field952 = var1.method2456();
               var3.playerCountChanged(-1);
            }

            class82.method1604(class88.field947, 0, class88.field947.length - 1, class88.field951, class88.field950);
            class296.field3696 = null;
            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         class296.field3696 = null;
      }

      return false;
   }

   @ObfuscatedName("jt")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "2108554312"
   )
   static final void method5778(String var0) {
      if(class250.field3328 != null) {
         class12 var1 = class150.method2761(ClientProt.field3169, client.field2384.field1770);
         var1.field121.method2288(class118.method2136(var0));
         var1.field121.writeString(var0);
         client.field2384.method2573(var1);
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(ILcz;ZB)I",
      garbageValue = "115"
   )
   static int method5777(int var0, class296 var1, boolean var2) {
      class187 var3 = var2?class3.field36:class284.field3565;
      if(var0 == 1800) {
         class249.field3312[++class308.field3811 - 1] = class217.method4493(class203.method4026(var3));
         return 1;
      } else if(var0 != 1801) {
         if(var0 == 1802) {
            if(var3.field2683 == null) {
               class249.field3313[++class103.field1146 - 1] = "";
            } else {
               class249.field3313[++class103.field1146 - 1] = var3.field2683;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = class249.field3312[--class308.field3811];
         --var4;
         if(var3.field2630 != null && var4 < var3.field2630.length && var3.field2630[var4] != null) {
            class249.field3313[++class103.field1146 - 1] = var3.field2630[var4];
         } else {
            class249.field3313[++class103.field1146 - 1] = "";
         }

         return 1;
      }
   }

   @ObfuscatedName("gv")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "35"
   )
   static final void method5779() {
      for(class279 var0 = (class279)client.field2283.method1503(); var0 != null; var0 = (class279)client.field2283.method1505()) {
         if(var0.field3521 == class260.field3393 && client.field2165 <= var0.field3541) {
            if(client.field2165 >= var0.field3526) {
               if(var0.field3530 > 0) {
                  class176 var1 = client.field2195[var0.field3530 - 1];
                  if(var1 != null && var1.field1090 >= 0 && var1.field1090 < 13312 && var1.field1072 >= 0 && var1.field1072 < 13312) {
                     var0.method5406(var1.field1090, var1.field1072, class314.method6140(var1.field1090, var1.field1072, var0.field3521) - var0.field3525, client.field2165);
                  }
               }

               if(var0.field3530 < 0) {
                  int var2 = -var0.field3530 - 1;
                  class199 var3;
                  if(var2 == client.field2186) {
                     var3 = class32.field303;
                  } else {
                     var3 = client.field2269[var2];
                  }

                  if(var3 != null && var3.field1090 >= 0 && var3.field1090 < 13312 && var3.field1072 >= 0 && var3.field1072 < 13312) {
                     var0.method5406(var3.field1090, var3.field1072, class314.method6140(var3.field1090, var3.field1072, var0.field3521) - var0.field3525, client.field2165);
                  }
               }

               var0.method5399(client.field2410);
               class269.field3464.method1936(class260.field3393, (int)var0.field3540, (int)var0.field3533, (int)var0.field3534, 60, var0, var0.field3544, -1L, false);
            }
         } else {
            var0.method3937();
         }
      }

   }
}
