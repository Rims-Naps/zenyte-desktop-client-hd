package net.runelite.standalone;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
public class class78 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1730580235"
   )
   static void method1073() {
      class203.username = class203.username.trim();
      Client.onUsernameChanged(-1);
      if(class203.username.length() == 0) {
         TextureProvider.method1169("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
      } else {
         long var1 = FriendManager.method2415();
         byte var0;
         if(var1 == 0L) {
            var0 = 5;
         } else {
            String var4 = class203.username;
            Random var5 = new Random();
            Packet var6 = new Packet(128);
            Packet var7 = new Packet(128);
            int[] var8 = new int[]{var5.nextInt(), var5.nextInt(), (int)(var1 >> 32), (int)var1};
            var6.writeByte(10);

            int var9;
            for(var9 = 0; var9 < 4; ++var9) {
               var6.writeInt(var5.nextInt());
            }

            var6.writeInt(var8[0]);
            var6.writeInt(var8[1]);
            var6.method5075(var1);
            var6.method5075(0L);

            for(var9 = 0; var9 < 4; ++var9) {
               var6.writeInt(var5.nextInt());
            }

            var6.method5109(class240.field1109, class240.field1110);
            var7.writeByte(10);

            for(var9 = 0; var9 < 3; ++var9) {
               var7.writeInt(var5.nextInt());
            }

            var7.method5075(var5.nextLong());
            var7.method5273(var5.nextLong());
            class15.method311(var7);
            var7.method5075(var5.nextLong());
            var7.method5109(class240.field1109, class240.field1110);
            var9 = OwnWorldComparator.method73(var4);
            if(var9 % 8 != 0) {
               var9 += 8 - var9 % 8;
            }

            Packet var10 = new Packet(var9);
            var10.method5077(var4);
            var10.offset = var9;
            var10.method5105(var8);
            Packet var11 = new Packet(var10.offset + var6.offset + var7.offset + 5);
            var11.writeByte(2);
            var11.writeByte(var6.offset);
            var11.method5080(var6.payload, 0, var6.offset);
            var11.writeByte(var7.offset);
            var11.method5080(var7.payload, 0, var7.offset);
            var11.writeShort(var10.offset);
            var11.method5080(var10.payload, 0, var10.offset);
            String var12 = ComponentType.method5691(var11.payload);

            byte var3;
            try {
               URL var13 = new URL(WorldComparator.method84("services", false) + "m=accountappeal/login.ws");
               URLConnection var14 = var13.openConnection();
               var14.setDoInput(true);
               var14.setDoOutput(true);
               var14.setConnectTimeout(5000);
               OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream());
               var15.write("data2=" + class155.method2208(var12) + "&dest=" + class155.method2208("passwordchoice.ws"));
               var15.flush();
               InputStream var16 = var14.getInputStream();
               var11 = new Packet(new byte[1000]);

               while(true) {
                  int var17 = var16.read(var11.payload, var11.offset, 1000 - var11.offset);
                  if(var17 == -1) {
                     var15.close();
                     var16.close();
                     String var18 = new String(var11.payload);
                     if(var18.startsWith("OFFLINE")) {
                        var3 = 4;
                     } else if(var18.startsWith("WRONG")) {
                        var3 = 7;
                     } else if(var18.startsWith("RELOAD")) {
                        var3 = 3;
                     } else if(var18.startsWith("Not permitted for social network accounts.")) {
                        var3 = 6;
                     } else {
                        var11.method5106(var8);

                        while(var11.offset > 0 && var11.payload[var11.offset - 1] == 0) {
                           --var11.offset;
                        }

                        var18 = new String(var11.payload, 0, var11.offset);
                        if(class2.method51(var18)) {
                           class129.method1898(var18, true, false);
                           var3 = 2;
                        } else {
                           var3 = 5;
                        }
                     }
                     break;
                  }

                  var11.offset += var17;
                  if(var11.offset >= 1000) {
                     var3 = 5;
                     break;
                  }
               }
            } catch (Throwable var19) {
               var19.printStackTrace();
               var3 = 5;
            }

            var0 = var3;
         }

         switch(var0) {
         case 2:
            TextureProvider.method1169(class200.field3139, class200.field3140, class200.field2901);
            class203.loginIndex = 6;
            break;
         case 3:
            TextureProvider.method1169("", "Error connecting to server.", "");
            break;
         case 4:
            TextureProvider.method1169("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
            break;
         case 5:
            TextureProvider.method1169("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
            break;
         case 6:
            TextureProvider.method1169("", "Error connecting to server.", "");
            break;
         case 7:
            TextureProvider.method1169("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
         }

      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "([BIII)I",
      garbageValue = "132012231"
   )
   static int method1072(byte[] var0, int var1, int var2) {
      int var3 = -1;

      for(int var4 = var1; var4 < var2; ++var4) {
         var3 = var3 >>> 8 ^ Packet.crc32Table[(var3 ^ var0[var4]) & 255];
      }

      var3 = ~var3;
      return var3;
   }
}
