package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class251 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lfu;"
   )
   public static final class251 OBJ_UPDATE;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lfu;"
   )
   public static final class251 LOC_ADD;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lfu;"
   )
   public static final class251 OBJ_ADD;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lfu;"
   )
   public static final class251 OBJ_DEL;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lfu;"
   )
   public static final class251 LOC_DEL;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lfu;"
   )
   public static final class251 LOC_ANIM;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1134395895
   )
   static int field2488;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lfu;"
   )
   public static final class251 MAP_PROJANIM;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lfu;"
   )
   public static final class251 SPOTANIM_SPECIFIC;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lfu;"
   )
   public static final class251 AREA_SOUND;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lfu;"
   )
   public static final class251 ATTACHED_PLAYER_OBJECT;

   static {
      OBJ_UPDATE = new class251(7);
      MAP_PROJANIM = new class251(15);
      ATTACHED_PLAYER_OBJECT = new class251(14);
      SPOTANIM_SPECIFIC = new class251(6);
      LOC_ANIM = new class251(4);
      AREA_SOUND = new class251(5);
      LOC_DEL = new class251(3);
      OBJ_DEL = new class251(3);
      OBJ_ADD = new class251(5);
      LOC_ADD = new class251(5);
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "7"
   )
   class251(int var1) {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)J",
      garbageValue = "2126448334"
   )
   static long method4510(CharSequence var0) {
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

   @ObfuscatedName("kt")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-48027244"
   )
   static void method4507(int var0) {
      client.field3807 = var0;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lgl;ILbw;II)V",
      garbageValue = "1265012407"
   )
   static final void decodeMasks(class214 var0, int var1, class63 var2, int var3) {
      byte var4 = -1;
      int var5;
      int var6;
      int var8;
      int var9;
      int var12;
      if((var3 & 64) != 0) { //hits
         var5 = var0.readUnsignedByte128();
         int var7;
         int var10;
         int var11;
         if(var5 > 0) {
            for(var6 = 0; var6 < var5; ++var6) {
               var8 = -1;
               var9 = -1;
               var10 = -1;
               var7 = var0.readSmart();
               if(var7 == 32767) {
                  var7 = var0.readSmart();
                  var9 = var0.readSmart();
                  var8 = var0.readSmart();
                  var10 = var0.readSmart();
               } else if(var7 != 32766) {
                  var9 = var0.readSmart();
               } else {
                  var7 = -1;
               }

               var11 = var0.readSmart();
               var2.method2451(var7, var9, var8, var10, client.field3744, var11);
            }
         }

         var6 = var0.readUnsignedByteC();
         if(var6 > 0) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var0.readSmart();
               var9 = var0.readSmart();
               if(var9 != 32767) {
                  var10 = var0.readSmart();
                  var11 = var0.readUnsignedByte128();
                  var12 = var9 > 0?var0.readUnsignedByte():var11;
                  var2.method2461(var8, client.field3744, var9, var10, var11, var12);
               } else {
                  var2.method2448(var8);
               }
            }
         }
      }

      if((var3 & 512) != 0) { //graphics
         var2.field1296 = var0.readUnsignedShortLE128();
         var2.graphicChanged(-1);
         var5 = var0.readIntV1();
         var2.field1286 = var5 >> 16;
         var2.field1299 = (var5 & 65535) + client.field3744;
         var2.field1297 = 0;
         var2.field1298 = 0;
         if(var2.field1299 > client.field3744) {
            var2.field1297 = -1;
         }

         if(var2.field1296 == 65535) {
            var2.field1296 = -1;
            var2.graphicChanged(-1);
         }
      }

      if((var3 & 4096) != 0) { //temp movement
         var4 = var0.readByte128();
      }

      if((var3 & 1024) != 0) { //forcemovement
         var2.field1313 = var0.read128Byte();
         var2.field1303 = var0.readByte128();
         var2.field1302 = var0.readByte128();
         var2.field1304 = var0.read128Byte();
         var2.field1305 = var0.readUnsignedShort128() + client.field3744;
         var2.field1306 = var0.readUnsignedShortLE() + client.field3744;
         var2.field1300 = var0.readUnsignedShort();
         if(var2.field601) {
            var2.field1313 += var2.field602;
            var2.field1303 += var2.field581;
            var2.field1302 += var2.field602;
            var2.field1304 += var2.field581;
            var2.field1279 = 0;
         } else {
            var2.field1313 += var2.field1288[0];
            var2.field1303 += var2.field1315[0];
            var2.field1302 += var2.field1288[0];
            var2.field1304 += var2.field1315[0];
            var2.field1279 = 1;
         }

         var2.field1318 = 0;
      }

      if((var3 & 32) != 0) { //forcechat
         var2.field1272 = var0.readString();
         if(var2.field1272.charAt(0) == '~') {
            var2.field1272 = var2.field1272.substring(1);
            ServerProt.method4172(2, var2.field577.method821(), var2.field1272);
         } else if(var2 == class5.field43) {
            ServerProt.method4172(2, var2.field577.method821(), var2.field1272);
         }

         var2.field1269 = false;
         var2.field1266 = 0;
         var2.field1275 = 0;
         var2.field1268 = 150;
      }

      if((var3 & 4) != 0) { //facecoord
         var2.field1301 = var0.readUnsignedShortLE();
         if(var2.field1279 == 0) {
            var2.field1310 = var2.field1301;
            var2.field1301 = -1;
         }
      }

      if((var3 & 1) != 0) {//appearance
         var5 = var0.readUnsigned128Byte();
         byte[] var13 = new byte[var5];
         Buffer var14 = new Buffer(var13);
         var0.readBytes(var13, 0, var5);
         class11.field104[var1] = var14;
         var2.method1082(var14);
      }

      if((var3 & 2) != 0) { //faceentity
         var2.field1285 = var0.readUnsignedShort128();
         var2.interactingChanged(-1);
         if(var2.field1285 == 65535) {
            var2.field1285 = -1;
            var2.interactingChanged(-1);
         }
      }

      if((var3 & 2048) != 0) { //movement
         class11.field93[var1] = var0.readByte128();
      }

      if((var3 & 16) != 0) { //chat
         var5 = var0.readUnsignedShort128();
         class253 var19 = (class253)class297.method5176(class123.method2266(), var0.readUnsignedByte());
         boolean var17 = var0.readUnsignedByteC() == 1;
         var8 = var0.readUnsignedByte();
         var9 = var0.field1073;
         if(var2.field577 != null && var2.field576 != null) {
            boolean var18 = false;
            if(var19.field2513 && class295.field3180.method5818(var2.field577)) {
               var18 = true;
            }

            if(!var18 && client.field3908 == 0 && !var2.field575) {
               class11.field99.field1073 = 0;
               var0.readBytes(class11.field99.field1074, 0, var8);
               class11.field99.field1073 = 0;
               String var15 = class207.method3524(class331.method5936(class148.method2613(class11.field99)));
               var2.field1272 = var15.trim();
               var2.field1266 = var5 >> 8;
               var2.field1275 = var5 & 255;
               var2.field1268 = 150;
               var2.field1269 = var17;
               var2.field1274 = var2 != class5.field43 && var19.field2513 && "" != client.field3950 && var15.toLowerCase().indexOf(client.field3950) == -1;
               if(var19.field2512) {
                  var12 = var17?91:1;
               } else {
                  var12 = var17?90:2;
               }

               if(var19.field2506 != -1) {
                  ServerProt.method4172(var12, class67.method1147(var19.field2506) + var2.field577.method821(), var15);
               } else {
                  ServerProt.method4172(var12, var2.field577.method821(), var15);
               }
            }
         }

         var0.field1073 = var8 + var9;
      }

      if((var3 & 256) != 0) { //name tags
         for(var5 = 0; var5 < 3; ++var5) {
            var2.field588[var5] = var0.readString();
         }
      }

      if((var3 & 128) != 0) { //animation
         var5 = var0.readUnsignedShort();
         if(var5 == 65535) {
            var5 = -1;
         }

         var6 = var0.readUnsignedByte();
         class8.method99(var2, var5, var6);
      }

      if(var2.field601) {
         if(var4 == 127) {
            var2.method1095(var2.field602, var2.field581);
         } else {
            byte var16;
            if(var4 != -1) {
               var16 = var4;
            } else {
               var16 = class11.field93[var1];
            }

            var2.method1081(var2.field602, var2.field581, var16);
         }
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)[B",
      garbageValue = "1453876103"
   )
   public static byte[] method4509(CharSequence var0) {
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
