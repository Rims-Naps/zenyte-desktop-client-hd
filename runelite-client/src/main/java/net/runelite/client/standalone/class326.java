package net.runelite.client.standalone;

import java.awt.Image;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public class class326 {
   @ObfuscatedName("aa")
   static Image field3506;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 733802741
   )
   public int field3504;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lhx;"
   )
   public class34 field3505;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lhx;"
   )
   public class34 field3503;

   @ObfuscatedSignature(
      signature = "(ILhx;Lhx;)V"
   )
   public class326(int var1, class34 var2, class34 var3) {
      this.field3504 = var1;
      this.field3505 = var2;
      this.field3503 = var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1826674650"
   )
   static boolean method5778() {
      try {
         if(class252.field2498 == null) {
            class252.field2498 = class118.field1081.method2571(new URL(class74.field679));
         } else if(class252.field2498.method2728()) {
            byte[] var0 = class252.field2498.method2727();
            Buffer var1 = new Buffer(var0);
            var1.readInt();
            class126.field1184 = var1.readUnsignedShort();
            class126.field1187 = new class126[class126.field1184];

            class126 var3;
            for(int var2 = 0; var2 < class126.field1184; var3.field1201 = var2++) {
               var3 = class126.field1187[var2] = new class126();
               var3.field1198 = var1.readUnsignedShort();
               var3.field1193 = var1.readInt();
               var3.field1195 = var1.readString();
               var3.field1196 = var1.readString();
               var3.field1197 = var1.readUnsignedByte();
               var3.field1192 = var1.readShort();
               var3.playerCountChanged(-1);
            }

            class74.method1179(class126.field1187, 0, class126.field1187.length - 1, class126.field1191, class126.field1190);
            class252.field2498 = null;
            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         class252.field2498 = null;
      }

      return false;
   }

   @ObfuscatedName("gv")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "35"
   )
   static final void method5781() {
      for(class203 var0 = (class203)client.field3862.method5604(); var0 != null; var0 = (class203)client.field3862.method5606()) {
         if(var0.field1956 == class315.plane && client.field3744 <= var0.field1976) {
            if(client.field3744 >= var0.field1961) {
               if(var0.field1965 > 0) {
                  class237 var1 = client.field3774[var0.field1965 - 1];
                  if(var1 != null && var1.field1277 >= 0 && var1.field1277 < 13312 && var1.field1259 >= 0 && var1.field1259 < 13312) {
                     var0.method3473(var1.field1277, var1.field1259, class7.method85(var1.field1277, var1.field1259, var0.field1956) - var0.field1960, client.field3744);
                  }
               }

               if(var0.field1965 < 0) {
                  int var2 = -var0.field1965 - 1;
                  class63 var3;
                  if(var2 == client.field3765) {
                     var3 = class5.field43;
                  } else {
                     var3 = client.field3848[var2];
                  }

                  if(var3 != null && var3.field1277 >= 0 && var3.field1277 < 13312 && var3.field1259 >= 0 && var3.field1259 < 13312) {
                     var0.method3473(var3.field1277, var3.field1259, class7.method85(var3.field1277, var3.field1259, var0.field1956) - var0.field1960, client.field3744);
                  }
               }

               var0.method3466(client.field3989);
               class258.field2566.method5342(class315.plane, (int)var0.field1975, (int)var0.field1968, (int)var0.field1969, 60, var0, var0.field1979, -1L, false);
            }
         } else {
            var0.method1186();
         }
      }

   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(ILcz;ZB)I",
      garbageValue = "115"
   )
   static int method5779(int var0, class252 var1, boolean var2) {
      class329 var3 = var2?class182.field1766:class20.field155;
      if(var0 == 1800) {
         class55.field407[++class171.field1587 - 1] = class148.method2674(class104.method1771(var3));
         return 1;
      } else if(var0 != 1801) {
         if(var0 == 1802) {
            if(var3.field3669 == null) {
               class55.field408[++class272.field2978 - 1] = "";
            } else {
               class55.field408[++class272.field2978 - 1] = var3.field3669;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = class55.field407[--class171.field1587];
         --var4;
         if(var3.field3616 != null && var4 < var3.field3616.length && var3.field3616[var4] != null) {
            class55.field408[++class272.field2978 - 1] = var3.field3616[var4];
         } else {
            class55.field408[++class272.field2978 - 1] = "";
         }

         return 1;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(ILik;IIIZI)V",
      garbageValue = "-2028161028"
   )
   public static void method5777(int var0, class148 var1, int var2, int var3, int var4, boolean var5) {
      class227.field2232 = 1;
      class53.field391 = var1;
      class52.field386 = var2;
      class263.field2910 = var3;
      class78.field720 = var4;
      class199.field1874 = var5;
      class204.field1991 = var0;
   }

   @ObfuscatedName("jt")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "2108554312"
   )
   static final void method5780(String var0) {
      if(class165.field1533 != null) {
         class279 var1 = class95.writeClientProt(ClientProt.CLAN_KICKUSER, client.field3963.field1162);
         var1.field3018.writeByte(class164.method2819(var0));
         var1.field3018.writeString(var0);
         client.field3963.method2235(var1);
      }
   }
}
