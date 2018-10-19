package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
public class class136 {
   @ObfuscatedName("f")
   byte[] field1350;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1756624839
   )
   int field1358;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1495691563
   )
   int field1357;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 629093119
   )
   int field1352;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 942194751
   )
   int field1354;
   @ObfuscatedName("l")
   byte[] field1351;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1414156353
   )
   int field1353;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -312746407
   )
   int field1355;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -2123317383
   )
   int field1359;

   @ObfuscatedName("hr")
   @ObfuscatedSignature(
      signature = "(Lji;IIII)V",
      garbageValue = "2133416906"
   )
   static final void method2510(class222 var0, int var1, int var2, int var3) {
      if(client.field3869 < 400) {
         if(var0.field2168 != null) {
            var0 = var0.method3970();
         }

         if(var0 != null) {
            if(var0.field2171) {
               if(!var0.field2161 || client.field3902 == var1) {
                  String var4 = var0.field2143;
                  int var7;
                  int var8;
                  if(var0.field2159 != 0) {
                     var7 = var0.field2159;
                     var8 = class5.field43.field582;
                     int var9 = var8 - var7;
                     String var6;
                     if(var9 < -9) {
                        var6 = class294.method5136(16711680);
                     } else if(var9 < -6) {
                        var6 = class294.method5136(16723968);
                     } else if(var9 < -3) {
                        var6 = class294.method5136(16740352);
                     } else if(var9 < 0) {
                        var6 = class294.method5136(16756736);
                     } else if(var9 > 9) {
                        var6 = class294.method5136(65280);
                     } else if(var9 > 6) {
                        var6 = class294.method5136(4259584);
                     } else if(var9 > 3) {
                        var6 = class294.method5136(8453888);
                     } else if(var9 > 0) {
                        var6 = class294.method5136(12648192);
                     } else {
                        var6 = class294.method5136(16776960);
                     }

                     var4 = var4 + var6 + " " + " (" + "level-" + var0.field2159 + ")";
                  }

                  if(var0.field2161 && client.field3966) {
                     class98.method1687("Examine", class294.method5136(16776960) + var4, 1003, var1, var2, var3);
                  }

                  if(client.field3885 == 1) {
                     class98.method1687("Use", client.field3835 + " " + "->" + " " + class294.method5136(16776960) + var4, 7, var1, var2, var3);
                  } else if(client.field3887) {
                     if((class184.field1776 & 2) == 2) {
                        class98.method1687(client.field3890, client.field3891 + " " + "->" + " " + class294.method5136(16776960) + var4, 8, var1, var2, var3);
                     }
                  } else {
                     int var10 = var0.field2161 && client.field3966?2000:0;
                     String[] var11 = var0.field2158;
                     if(var11 != null) {
                        for(var7 = 4; var7 >= 0; --var7) {
                           if(var11[var7] != null && !var11[var7].equalsIgnoreCase("Attack")) {
                              var8 = 0;
                              if(var7 == 0) {
                                 var8 = var10 + 9;
                              }

                              if(var7 == 1) {
                                 var8 = var10 + 10;
                              }

                              if(var7 == 2) {
                                 var8 = var10 + 11;
                              }

                              if(var7 == 3) {
                                 var8 = var10 + 12;
                              }

                              if(var7 == 4) {
                                 var8 = var10 + 13;
                              }

                              class98.method1687(var11[var7], class294.method5136(16776960) + var4, var8, var1, var2, var3);
                           }
                        }
                     }

                     if(var11 != null) {
                        for(var7 = 4; var7 >= 0; --var7) {
                           if(var11[var7] != null && var11[var7].equalsIgnoreCase("Attack")) {
                              short var12 = 0;
                              if(class113.field1061 != client.field3753) {
                                 if(client.field3753 == class113.field1065 || client.field3753 == class113.field1059 && var0.field2159 > class5.field43.field582) {
                                    var12 = 2000;
                                 }

                                 var8 = 0;
                                 if(var7 == 0) {
                                    var8 = var12 + 9;
                                 }

                                 if(var7 == 1) {
                                    var8 = var12 + 10;
                                 }

                                 if(var7 == 2) {
                                    var8 = var12 + 11;
                                 }

                                 if(var7 == 3) {
                                    var8 = var12 + 12;
                                 }

                                 if(var7 == 4) {
                                    var8 = var12 + 13;
                                 }

                                 class98.method1687(var11[var7], class294.method5136(16776960) + var4, var8, var1, var2, var3);
                              }
                           }
                        }
                     }

                     if(!var0.field2161 || !client.field3966) {
                        class98.method1687("Examine", class294.method5136(16776960) + var4, 1003, var1, var2, var3);
                     }
                  }

               }
            }
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "19"
   )
   public static int method2513(int var0, int var1) {
      int var2;
      if(var1 > var0) {
         var2 = var0;
         var0 = var1;
         var1 = var2;
      }

      while(var1 != 0) {
         var2 = var0 % var1;
         var0 = var1;
         var1 = var2;
      }

      return var0;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)Z",
      garbageValue = "1786471188"
   )
   public static boolean method2512(CharSequence var0) {
      boolean var2 = false;
      boolean var3 = false;
      int var4 = 0;
      int var5 = var0.length();
      int var6 = 0;

      boolean var1;
      while(true) {
         if(var6 >= var5) {
            var1 = var3;
            break;
         }

         label83: {
            char var7 = var0.charAt(var6);
            if(var6 == 0) {
               if(var7 == '-') {
                  var2 = true;
                  break label83;
               }

               if(var7 == '+') {
                  break label83;
               }
            }

            int var9;
            if(var7 >= '0' && var7 <= '9') {
               var9 = var7 - '0';
            } else if(var7 >= 'A' && var7 <= 'Z') {
               var9 = var7 - '7';
            } else {
               if(var7 < 'a' || var7 > 'z') {
                  var1 = false;
                  break;
               }

               var9 = var7 - 'W';
            }

            if(var9 >= 10) {
               var1 = false;
               break;
            }

            if(var2) {
               var9 = -var9;
            }

            int var8 = var4 * 10 + var9;
            if(var4 != var8 / 10) {
               var1 = false;
               break;
            }

            var4 = var8;
            var3 = true;
         }

         ++var6;
      }

      return var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lik;IIIZI)V",
      garbageValue = "-1573418912"
   )
   public static void method2511(class148 var0, int var1, int var2, int var3, boolean var4) {
      class227.field2232 = 1;
      class53.field391 = var0;
      class52.field386 = var1;
      class263.field2910 = var2;
      class78.field720 = var3;
      class199.field1874 = var4;
      class204.field1991 = 10000;
   }
}
