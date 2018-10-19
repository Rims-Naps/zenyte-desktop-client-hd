package net.runelite.client.standalone;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public class class146 implements Runnable {
   @ObfuscatedName("eb")
   @ObfuscatedGetter(
      intValue = -1909119923
   )
   static int field1407;
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "Llb;"
   )
   public static class6 field1404;
   @ObfuscatedName("f")
   final Thread field1403;
   @ObfuscatedName("l")
   volatile boolean field1401;
   @ObfuscatedName("w")
   Queue field1402;

   public class146() {
      this.field1402 = new LinkedList();
      this.field1403 = new Thread(this);
      this.field1403.setPriority(1);
      this.field1403.start();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/net/URL;I)Lea;",
      garbageValue = "-944776092"
   )
   public class156 method2571(URL var1) {
      class156 var2 = new class156(var1);
      synchronized(this) {
         this.field1402.add(var2);
         this.notify();
         return var2;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2011982011"
   )
   public void method2562() {
      this.field1401 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field1403.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   public void run() {
      while(!this.field1401) {
         try {
            class156 var1;
            synchronized(this) {
               var1 = (class156)this.field1402.poll();
               if(var1 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var13) {
                     ;
                  }
                  continue;
               }
            }

            DataInputStream var2 = null;
            URLConnection var3 = null;

            try {
               var3 = var1.field1489.openConnection();
               var3.setConnectTimeout(5000);
               var3.setReadTimeout(5000);
               var3.setUseCaches(false);
               var3.setRequestProperty("Connection", "close");
               int var7 = var3.getContentLength();
               if(var7 >= 0) {
                  byte[] var5 = new byte[var7];
                  var2 = new DataInputStream(var3.getInputStream());
                  var2.readFully(var5);
                  var1.field1486 = var5;
               }

               var1.field1485 = true;
            } catch (IOException var14) {
               var1.field1485 = true;
            } finally {
               if(var2 != null) {
                  var2.close();
               }

               if(var3 != null && var3 instanceof HttpURLConnection) {
                  ((HttpURLConnection)var3).disconnect();
               }

            }
         } catch (Exception var17) {
            class295.method5145((String)null, var17, -1193703961);
         }
      }

   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-428862632"
   )
   public static void method2573(boolean var0) {
      if(var0 != class176.field1683) {
         class120.field1114.method2271();
         class120.field1094.method2271();
         class120.field1122.method2271();
         class176.field1683 = var0;
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "320951798"
   )
   static void method2572() {
      class325.field3480 = class325.field3480.trim();
      client.onUsernameChanged(-1);
      if(class325.field3480.length() == 0) {
         class226.method4059("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
      } else {
         long var1 = class45.method791();
         byte var0;
         if(var1 == 0L) {
            var0 = 5;
         } else {
            String var4 = class325.field3480;
            Random var5 = new Random();
            Buffer var6 = new Buffer(128);
            Buffer var7 = new Buffer(128);
            int[] var8 = new int[]{var5.nextInt(), var5.nextInt(), (int)(var1 >> 32), (int)var1};
            var6.writeByte(10);

            int var9;
            for(var9 = 0; var9 < 4; ++var9) {
               var6.writeInt(var5.nextInt());
            }

            var6.writeInt(var8[0]);
            var6.writeInt(var8[1]);
            var6.method1895(var1);
            var6.method1895(0L);

            for(var9 = 0; var9 < 4; ++var9) {
               var6.writeInt(var5.nextInt());
            }

            var6.encryptRSA(class140.field1386, class140.field1380);
            var7.writeByte(10);

            for(var9 = 0; var9 < 3; ++var9) {
               var7.writeInt(var5.nextInt());
            }

            var7.method1895(var5.nextLong());
            var7.method2020(var5.nextLong());
            if(client.field3833 != null) {
               var7.method1900(client.field3833, 0, client.field3833.length);
            } else {
               byte[] var10 = new byte[24];

               try {
                  class323.field3456.method3730(0L);
                  class323.field3456.method3716(var10);

                  int var11;
                  for(var11 = 0; var11 < 24 && var10[var11] == 0; ++var11) {
                     ;
                  }

                  if(var11 >= 24) {
                     throw new IOException();
                  }
               } catch (Exception var25) {
                  for(int var12 = 0; var12 < 24; ++var12) {
                     var10[var12] = -1;
                  }
               }

               var7.method1900(var10, 0, var10.length);
            }

            var7.method1895(var5.nextLong());
            var7.encryptRSA(class140.field1386, class140.field1380);
            var9 = class164.method2819(var4);
            if(var9 % 8 != 0) {
               var9 += 8 - var9 % 8;
            }

            Buffer var26 = new Buffer(var9);
            var26.writeString(var4);
            var26.field1073 = var9;
            var26.method1924(var8);
            Buffer var20 = new Buffer(var26.field1073 + var6.field1073 + var7.field1073 + 5);
            var20.writeByte(2);
            var20.writeByte(var6.field1073);
            var20.method1900(var6.field1074, 0, var6.field1073);
            var20.writeByte(var7.field1073);
            var20.method1900(var7.field1074, 0, var7.field1073);
            var20.writeShort(var26.field1073);
            var20.method1900(var26.field1074, 0, var26.field1073);
            byte[] var13 = var20.field1074;
            String var22 = class118.method2128(var13, 0, var13.length);
            String var14 = var22;

            byte var3;
            try {
               URL var15 = new URL(class163.method2811("services", false) + "m=accountappeal/login.ws");
               URLConnection var16 = var15.openConnection();
               var16.setDoInput(true);
               var16.setDoOutput(true);
               var16.setConnectTimeout(5000);
               OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream());
               var17.write("data2=" + class232.method4162(var14) + "&dest=" + class232.method4162("passwordchoice.ws"));
               var17.flush();
               InputStream var18 = var16.getInputStream();
               var20 = new Buffer(new byte[1000]);

               while(true) {
                  int var19 = var18.read(var20.field1074, var20.field1073, 1000 - var20.field1073);
                  if(var19 == -1) {
                     var17.close();
                     var18.close();
                     String var23 = new String(var20.field1074);
                     if(var23.startsWith("OFFLINE")) {
                        var3 = 4;
                     } else if(var23.startsWith("WRONG")) {
                        var3 = 7;
                     } else if(var23.startsWith("RELOAD")) {
                        var3 = 3;
                     } else if(var23.startsWith("Not permitted for social network accounts.")) {
                        var3 = 6;
                     } else {
                        var20.method1925(var8);

                        while(var20.field1073 > 0 && var20.field1074[var20.field1073 - 1] == 0) {
                           --var20.field1073;
                        }

                        var23 = new String(var20.field1074, 0, var20.field1073);
                        if(class275.method4910(var23)) {
                           class112.method1875(var23, true, false);
                           var3 = 2;
                        } else {
                           var3 = 5;
                        }
                     }
                     break;
                  }

                  var20.field1073 += var19;
                  if(var20.field1073 >= 1000) {
                     var3 = 5;
                     break;
                  }
               }
            } catch (Throwable var24) {
               var24.printStackTrace();
               var3 = 5;
            }

            var0 = var3;
         }

         switch(var0) {
         case 2:
            class226.method4059(class259.field2841, class259.field2607, class259.field2843);
            class325.field3492 = 6;
            break;
         case 3:
            class226.method4059("", "Error connecting to server.", "");
            break;
         case 4:
            class226.method4059("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
            break;
         case 5:
            class226.method4059("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
            break;
         case 6:
            class226.method4059("", "Error connecting to server.", "");
            break;
         case 7:
            class226.method4059("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
         }

      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lik;Ljava/lang/String;Ljava/lang/String;B)Lle;",
      garbageValue = "-57"
   )
   public static class32 method2574(class148 var0, String var1, String var2) {
      int var3 = var0.method2602(var1);
      int var4 = var0.method2581(var3, var2);
      return Buffer.method2122(var0, var3, var4);
   }

   @ObfuscatedName("l")
   public static String method2567(long var0) {
      if(var0 > 0L && var0 < 6582952005840035281L) {
         if(0L == var0 % 37L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; 0L != var3; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            char var8;
            for(var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = class145.field1398[(int)(var6 - var0 * 37L)];
               if(var8 == '_') {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }
}
