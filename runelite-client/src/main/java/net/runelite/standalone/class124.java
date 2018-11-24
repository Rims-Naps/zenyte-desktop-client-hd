package net.runelite.standalone;

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
public class class124 implements Runnable {
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "Llb;"
   )
   public static class333 field1689;
   @ObfuscatedName("eb")
   @ObfuscatedGetter(
      intValue = -1909119923
   )
   static int field1692;
   @ObfuscatedName("l")
   volatile boolean field1686;
   @ObfuscatedName("f")
   final Thread field1688;
   @ObfuscatedName("w")
   Queue field1687;

   public class124() {
      this.field1687 = new LinkedList();
      this.field1688 = new Thread(this);
      this.field1688.setPriority(1);
      this.field1688.start();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2011982011"
   )
   public void method2225() {
      this.field1686 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field1688.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/net/URL;I)Lea;",
      garbageValue = "-944776092"
   )
   public class316 method2234(URL var1) {
      class316 var2 = new class316(var1);
      synchronized(this) {
         this.field1687.add(var2);
         this.notify();
         return var2;
      }
   }

   public void run() {
      while(!this.field1686) {
         try {
            class316 var1;
            synchronized(this) {
               var1 = (class316)this.field1687.poll();
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
               var3 = var1.field3898.openConnection();
               var3.setConnectTimeout(5000);
               var3.setReadTimeout(5000);
               var3.setUseCaches(false);
               var3.setRequestProperty("Connection", "close");
               int var7 = var3.getContentLength();
               if(var7 >= 0) {
                  byte[] var5 = new byte[var7];
                  var2 = new DataInputStream(var3.getInputStream());
                  var2.readFully(var5);
                  var1.field3895 = var5;
               }

               var1.field3894 = true;
            } catch (IOException var14) {
               var1.field3894 = true;
            } finally {
               if(var2 != null) {
                  var2.close();
               }

               if(var3 != null && var3 instanceof HttpURLConnection) {
                  ((HttpURLConnection)var3).disconnect();
               }

            }
         } catch (Exception var17) {
            class202.method4018((String)null, var17, -1193703961);
         }
      }

   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-428862632"
   )
   public static void method2236(boolean var0) {
      if(var0 != class213.field2928) {
         class42.field441.method1816();
         class42.field421.method1816();
         class42.field449.method1816();
         class213.field2928 = var0;
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "320951798"
   )
   static void method2235() {
      class39.field386 = class39.field386.trim();
      client.onUsernameChanged(-1);
      if(class39.field386.length() == 0) {
         class163.method3007("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
      } else {
         long var1 = class322.method6257();
         byte var0;
         if(var1 == 0L) {
            var0 = 5;
         } else {
            String var4 = class39.field386;
            Random var5 = new Random();
            class125 var6 = new class125(128);
            class125 var7 = new class125(128);
            int[] var8 = new int[]{var5.nextInt(), var5.nextInt(), (int)(var1 >> 32), (int)var1};
            var6.method2288(10);

            int var9;
            for(var9 = 0; var9 < 4; ++var9) {
               var6.method2334(var5.nextInt());
            }

            var6.method2334(var8[0]);
            var6.method2334(var8[1]);
            var6.method2246(var1);
            var6.method2246(0L);

            for(var9 = 0; var9 < 4; ++var9) {
               var6.method2334(var5.nextInt());
            }

            var6.method2279(class17.field210, class17.field204);
            var7.method2288(10);

            for(var9 = 0; var9 < 3; ++var9) {
               var7.method2334(var5.nextInt());
            }

            var7.method2246(var5.nextLong());
            var7.method2371(var5.nextLong());
            if(client.field2254 != null) {
               var7.method2251(client.field2254, 0, client.field2254.length);
            } else {
               byte[] var10 = new byte[24];

               try {
                  class305.field3779.method387(0L);
                  class305.field3779.method373(var10);

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

               var7.method2251(var10, 0, var10.length);
            }

            var7.method2246(var5.nextLong());
            var7.method2279(class17.field210, class17.field204);
            var9 = class118.method2136(var4);
            if(var9 % 8 != 0) {
               var9 += 8 - var9 % 8;
            }

            class125 var26 = new class125(var9);
            var26.method2358(var4);
            var26.field1693 = var9;
            var26.method2275(var8);
            class125 var20 = new class125(var26.field1693 + var6.field1693 + var7.field1693 + 5);
            var20.method2288(2);
            var20.method2288(var6.field1693);
            var20.method2251(var6.field1694, 0, var6.field1693);
            var20.method2288(var7.field1693);
            var20.method2251(var7.field1694, 0, var7.field1693);
            var20.method2242(var26.field1693);
            var20.method2251(var26.field1694, 0, var26.field1693);
            byte[] var13 = var20.field1694;
            String var22 = class179.method3689(var13, 0, var13.length);
            String var14 = var22;

            byte var3;
            try {
               URL var15 = new URL(class205.method4077("services", false) + "m=accountappeal/login.ws");
               URLConnection var16 = var15.openConnection();
               var16.setDoInput(true);
               var16.setDoOutput(true);
               var16.setConnectTimeout(5000);
               OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream());
               var17.write("data2=" + class122.method2197(var14) + "&dest=" + class122.method2197("passwordchoice.ws"));
               var17.flush();
               InputStream var18 = var16.getInputStream();
               var20 = new class125(new byte[1000]);

               while(true) {
                  int var19 = var18.read(var20.field1694, var20.field1693, 1000 - var20.field1693);
                  if(var19 == -1) {
                     var17.close();
                     var18.close();
                     String var23 = new String(var20.field1694);
                     if(var23.startsWith("OFFLINE")) {
                        var3 = 4;
                     } else if(var23.startsWith("WRONG")) {
                        var3 = 7;
                     } else if(var23.startsWith("RELOAD")) {
                        var3 = 3;
                     } else if(var23.startsWith("Not permitted for social network accounts.")) {
                        var3 = 6;
                     } else {
                        var20.method2276(var8);

                        while(var20.field1693 > 0 && var20.field1694[var20.field1693 - 1] == 0) {
                           --var20.field1693;
                        }

                        var23 = new String(var20.field1694, 0, var20.field1693);
                        if(class107.method1886(var23)) {
                           class212.method4358(var23, true, false);
                           var3 = 2;
                        } else {
                           var3 = 5;
                        }
                     }
                     break;
                  }

                  var20.field1693 += var19;
                  if(var20.field1693 >= 1000) {
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
            class163.method3007(class117.field1588, class117.field1354, class117.field1590);
            class39.field398 = 6;
            break;
         case 3:
            class163.method3007("", "Error connecting to server.", "");
            break;
         case 4:
            class163.method3007("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
            break;
         case 5:
            class163.method3007("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
            break;
         case 6:
            class163.method3007("", "Error connecting to server.", "");
            break;
         case 7:
            class163.method3007("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
         }

      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lik;Ljava/lang/String;Ljava/lang/String;B)Lle;",
      garbageValue = "-2"
   )
   public static class303 method2237(class217 var0, String var1, String var2) {
      int var3 = var0.method4421(var1);
      int var4 = var0.method4400(var3, var2);
      return class125.method2473(var0, var3, var4);
   }

   @ObfuscatedName("l")
   public static String method2230(long var0) {
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
               var8 = class37.field364[(int)(var6 - var0 * 37L)];
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
