package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class329 {
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lfu;"
   )
   public static final class329 field3975;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lfu;"
   )
   public static final class329 field3979;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lfu;"
   )
   public static final class329 field3974;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lfu;"
   )
   public static final class329 field3976;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lfu;"
   )
   public static final class329 field3981;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lfu;"
   )
   public static final class329 field3980;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lfu;"
   )
   public static final class329 field3982;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lfu;"
   )
   public static final class329 field3978;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1134395895
   )
   static int field3984;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lfu;"
   )
   public static final class329 field3977;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lfu;"
   )
   public static final class329 field3973;

   static {
      field3981 = new class329(7);
      field3974 = new class329(15);
      field3973 = new class329(14);
      field3976 = new class329(6);
      field3977 = new class329(4);
      field3978 = new class329(5);
      field3979 = new class329(2);
      field3975 = new class329(3);
      field3980 = new class329(5);
      field3982 = new class329(4);
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "7"
   )
   class329(int var1) {
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lgl;ILbw;II)V",
      garbageValue = "1265012407"
   )
   static final void method6324(class1 var0, int var1, class199 var2, int var3) {
      byte var4 = -1;
      int var5;
      int var6;
      int var8;
      int var9;
      int var12;
      if((var3 & 64) != 0) {
         var5 = var0.method2285();
         int var7;
         int var10;
         int var11;
         if(var5 > 0) {
            for(var6 = 0; var6 < var5; ++var6) {
               var8 = -1;
               var9 = -1;
               var10 = -1;
               var7 = var0.method2270();
               if(var7 == 32767) {
                  var7 = var0.method2270();
                  var9 = var0.method2270();
                  var8 = var0.method2270();
                  var10 = var0.method2270();
               } else if(var7 != 32766) {
                  var9 = var0.method2270();
               } else {
                  var7 = -1;
               }

               var11 = var0.method2270();
               var2.method1794(var7, var9, var8, var10, client.field2165, var11);
            }
         }

         var6 = var0.method2286();
         if(var6 > 0) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var0.method2270();
               var9 = var0.method2270();
               if(var9 != 32767) {
                  var10 = var0.method2270();
                  var11 = var0.method2285();
                  var12 = var9 > 0?var0.readUnsignedByte():var11;
                  var2.method1804(var8, client.field2165, var9, var10, var11, var12);
               } else {
                  var2.method1791(var8);
               }
            }
         }
      }

      if((var3 & 512) != 0) {
         var2.field1109 = var0.method2332();
         var2.graphicChanged(-1);
         var5 = var0.method2304();
         var2.field1099 = var5 >> 16;
         var2.field1112 = (var5 & 65535) + client.field2165;
         var2.field1110 = 0;
         var2.field1111 = 0;
         if(var2.field1112 > client.field2165) {
            var2.field1110 = -1;
         }

         if(var2.field1109 == 65535) {
            var2.field1109 = -1;
            var2.graphicChanged(-1);
         }
      }

      if((var3 & 4096) != 0) {
         var4 = var0.method2434();
      }

      if((var3 & 1024) != 0) {
         var2.field1126 = var0.method2290();
         var2.field1116 = var0.method2434();
         var2.field1115 = var0.method2434();
         var2.field1117 = var0.method2290();
         var2.field1118 = var0.method2460() + client.field2165;
         var2.field1119 = var0.method2268() + client.field2165;
         var2.field1113 = var0.readUnsignedShort();
         if(var2.field2826) {
            var2.field1126 += var2.field2827;
            var2.field1116 += var2.field2806;
            var2.field1115 += var2.field2827;
            var2.field1117 += var2.field2806;
            var2.field1092 = 0;
         } else {
            var2.field1126 += var2.field1101[0];
            var2.field1116 += var2.field1128[0];
            var2.field1115 += var2.field1101[0];
            var2.field1117 += var2.field1128[0];
            var2.field1092 = 1;
         }

         var2.field1131 = 0;
      }

      if((var3 & 32) != 0) {
         var2.field1085 = var0.readString();
         if(var2.field1085.charAt(0) == '~') {
            var2.field1085 = var2.field1085.substring(1);
            ServerProt.method3131(2, var2.field2802.method2869(), var2.field1085);
         } else if(var2 == class32.field303) {
            ServerProt.method3131(2, var2.field2802.method2869(), var2.field1085);
         }

         var2.field1082 = false;
         var2.field1079 = 0;
         var2.field1088 = 0;
         var2.field1081 = 150;
      }

      if((var3 & 4) != 0) {
         var2.field1114 = var0.method2268();
         if(var2.field1092 == 0) {
            var2.field1123 = var2.field1114;
            var2.field1114 = -1;
         }
      }

      if((var3 & 1) != 0) {
         var5 = var0.method2287();
         byte[] var13 = new byte[var5];
         Buffer var14 = new Buffer(var13);
         var0.method2295(var13, 0, var5);
         class152.field1888[var1] = var14;
         var2.method3948(var14);
      }

      if((var3 & 2) != 0) {
         var2.field1098 = var0.method2460();
         var2.interactingChanged(-1);
         if(var2.field1098 == 65535) {
            var2.field1098 = -1;
            var2.interactingChanged(-1);
         }
      }

      if((var3 & 2048) != 0) {
         class152.field1877[var1] = var0.method2434();
      }

      if((var3 & 16) != 0) {
         var5 = var0.method2460();
         class222 var19 = (class222)class38.method678(class198.method3946(), var0.readUnsignedByte());
         boolean var17 = var0.method2286() == 1;
         var8 = var0.readUnsignedByte();
         var9 = var0.position;
         if(var2.field2802 != null && var2.field2801 != null) {
            boolean var18 = false;
            if(var19.field2999 && class202.field2845.method2898(var2.field2802)) {
               var18 = true;
            }

            if(!var18 && client.field2329 == 0 && !var2.field2800) {
               class152.field1883.position = 0;
               var0.method2295(class152.field1883.field1694, 0, var8);
               class152.field1883.position = 0;
               String var15 = class190.method3813(class264.method5250(Js5Index.method4432(class152.field1883)));
               var2.field1085 = var15.trim();
               var2.field1079 = var5 >> 8;
               var2.field1088 = var5 & 255;
               var2.field1081 = 150;
               var2.field1082 = var17;
               var2.field1087 = var2 != class32.field303 && var19.field2999 && "" != client.field2371 && var15.toLowerCase().indexOf(client.field2371) == -1;
               if(var19.field2998) {
                  var12 = var17?91:1;
               } else {
                  var12 = var17?90:2;
               }

               if(var19.field2992 != -1) {
                  ServerProt.method3131(var12, class164.method3009(var19.field2992) + var2.field2802.method2869(), var15);
               } else {
                  ServerProt.method3131(var12, var2.field2802.method2869(), var15);
               }
            }
         }

         var0.position = var8 + var9;
      }

      if((var3 & 256) != 0) {
         for(var5 = 0; var5 < 3; ++var5) {
            var2.field2813[var5] = var0.readString();
         }
      }

      if((var3 & 128) != 0) {
         var5 = var0.readUnsignedShort();
         if(var5 == 65535) {
            var5 = -1;
         }

         var6 = var0.readUnsignedByte();
         class147.method2675(var2, var5, var6);
      }

      if(var2.field2826) {
         if(var4 == 127) {
            var2.method3961(var2.field2827, var2.field2806);
         } else {
            byte var16;
            if(var4 != -1) {
               var16 = var4;
            } else {
               var16 = class152.field1877[var1];
            }

            var2.method3947(var2.field2827, var2.field2806, var16);
         }
      }

   }

   @ObfuscatedName("kt")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-48027244"
   )
   static void method6323(int var0) {
      client.field2228 = var0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)J",
      garbageValue = "2126448334"
   )
   static long method6326(CharSequence var0) {
      long var1 = 0L;
      int var3 = var0.length();

      for(int var4 = 0; var4 < var3; ++var4) {
         var1 *= 37L;
         char var5 = var0.charAt(var4);
         if(var5 >= 'A' && var5 <= 'Z') {
            var1 += (long)(var5 + 1 - 65);
         } else if(var5 >= 'a' && var5 <= 'z') {
            var1 += (long)(var5 + 1 - 97);
         } else if(var5 >= '0' && var5 <= '9') {
            var1 += (long)(var5 + 27 - 48);
         }

         if(var1 >= 177917621779460413L) {
            break;
         }
      }

      while(var1 % 37L == 0L && var1 != 0L) {
         var1 /= 37L;
      }

      return var1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)[B",
      garbageValue = "1453876103"
   )
   public static byte[] method6325(CharSequence var0) {
      int var1 = var0.length();
      byte[] var2 = new byte[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if(var4 > 0 && var4 < 128 || var4 >= 160 && var4 <= 255) {
            var2[var3] = (byte)var4;
         } else if(var4 == 8364) {
            var2[var3] = -128;
         } else if(var4 == 8218) {
            var2[var3] = -126;
         } else if(var4 == 402) {
            var2[var3] = -125;
         } else if(var4 == 8222) {
            var2[var3] = -124;
         } else if(var4 == 8230) {
            var2[var3] = -123;
         } else if(var4 == 8224) {
            var2[var3] = -122;
         } else if(var4 == 8225) {
            var2[var3] = -121;
         } else if(var4 == 710) {
            var2[var3] = -120;
         } else if(var4 == 8240) {
            var2[var3] = -119;
         } else if(var4 == 352) {
            var2[var3] = -118;
         } else if(var4 == 8249) {
            var2[var3] = -117;
         } else if(var4 == 338) {
            var2[var3] = -116;
         } else if(var4 == 381) {
            var2[var3] = -114;
         } else if(var4 == 8216) {
            var2[var3] = -111;
         } else if(var4 == 8217) {
            var2[var3] = -110;
         } else if(var4 == 8220) {
            var2[var3] = -109;
         } else if(var4 == 8221) {
            var2[var3] = -108;
         } else if(var4 == 8226) {
            var2[var3] = -107;
         } else if(var4 == 8211) {
            var2[var3] = -106;
         } else if(var4 == 8212) {
            var2[var3] = -105;
         } else if(var4 == 732) {
            var2[var3] = -104;
         } else if(var4 == 8482) {
            var2[var3] = -103;
         } else if(var4 == 353) {
            var2[var3] = -102;
         } else if(var4 == 8250) {
            var2[var3] = -101;
         } else if(var4 == 339) {
            var2[var3] = -100;
         } else if(var4 == 382) {
            var2[var3] = -98;
         } else if(var4 == 376) {
            var2[var3] = -97;
         } else {
            var2[var3] = 63;
         }
      }

      return var2;
   }
}
