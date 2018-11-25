package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
public class class67 {
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1495691563
   )
   int field800;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 629093119
   )
   int field795;
   @ObfuscatedName("l")
   byte[] field794;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1414156353
   )
   int field796;
   @ObfuscatedName("f")
   byte[] field793;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1756624839
   )
   int field801;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -312746407
   )
   int field798;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 942194751
   )
   int field797;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -2123317383
   )
   int field802;

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "19"
   )
   public static int method1490(int var0, int var1) {
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
   public static boolean method1489(CharSequence var0) {
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

   @ObfuscatedName("hr")
   @ObfuscatedSignature(
      signature = "(Lji;IIII)V",
      garbageValue = "2133416906"
   )
   static final void method1487(class315 var0, int var1, int var2, int var3) {
      if(client.field2290 < 400) {
          class315 old = var0;
         if(var0.field3886 != null) {
            var0 = var0.method6171();
         }

         if(var0 != null) {
            if(var0.field3889) {
               if(!var0.field3879 || client.field2323 == var1) {
                  String var4 = var0.field3861;
                  int var7;
                  int var8;
                  if(var0.field3877 != 0) {
                     var7 = var0.field3877;
                     var8 = class32.field303.field2807;
                     int var9 = var8 - var7;
                     String var6;
                     if(var9 < -9) {
                        var6 = class64.method1354(16711680);
                     } else if(var9 < -6) {
                        var6 = class64.method1354(16723968);
                     } else if(var9 < -3) {
                        var6 = class64.method1354(16740352);
                     } else if(var9 < 0) {
                        var6 = class64.method1354(16756736);
                     } else if(var9 > 9) {
                        var6 = class64.method1354(65280);
                     } else if(var9 > 6) {
                        var6 = class64.method1354(4259584);
                     } else if(var9 > 3) {
                        var6 = class64.method1354(8453888);
                     } else if(var9 > 0) {
                        var6 = class64.method1354(12648192);
                     } else {
                        var6 = class64.method1354(16776960);
                     }

                     var4 = var4 + var6 + " " + " (" + "level-" + var0.field3877 + ")";
                  }

                  if(var0.field3879 && client.field2387) {
                     class28.method484("Examine", class64.method1354(16776960) + var4, 1003, var1, var2, var3);
                  }

                  if(client.field2306 == 1) {
                     class28.method484("Use", client.field2256 + " " + "->" + " " + class64.method1354(16776960) + var4, 7, var1, var2, var3);
                  } else if(client.field2308) {
                     if((class230.field3072 & 2) == 2) {
                        class28.method484(client.field2311, client.field2312 + " " + "->" + " " + class64.method1354(16776960) + var4, 8, var1, var2, var3);
                     }
                  } else {
                     int var10 = var0.field3879 && client.field2387?2000:0;
                     String[] var11 = var0.field3876;
                     String[] oldVar11 = old.changedOptions;
                     if(var11 != null) {
                        for(var7 = 4; var7 >= 0; --var7) {
                            String option = oldVar11[var7] != null ? (oldVar11[var7].isEmpty() ? null :
                                    oldVar11[var7]) : var11[var7];
                           if(option != null && !option.equalsIgnoreCase("Attack")) {
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

                              class28.method484(option, class64.method1354(16776960) + var4, var8, var1, var2, var3);
                           }
                        }
                     }

                     if(var11 != null) {
                        for(var7 = 4; var7 >= 0; --var7) {
                           if(var11[var7] != null && var11[var7].equalsIgnoreCase("Attack")) {
                              short var12 = 0;
                              if(class302.field3752 != client.field2174) {
                                 if(client.field2174 == class302.field3756 || client.field2174 == class302.field3750 && var0.field3877 > class32.field303.field2807) {
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

                                 class28.method484(var11[var7], class64.method1354(16776960) + var4, var8, var1, var2, var3);
                              }
                           }
                        }
                     }

                     if(!var0.field3879 || !client.field2387) {
                        class28.method484("Examine", class64.method1354(16776960) + var4, 1003, var1, var2, var3);
                     }
                  }

               }
            }
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lik;IIIZI)V",
      garbageValue = "-1573418912"
   )
   public static void method1488(class217 var0, int var1, int var2, int var3, boolean var4) {
      class43.field481 = 1;
      class270.field3480 = var0;
      class259.field3385 = var1;
      class177.field2443 = var2;
      class226.field3046 = var3;
      class113.field1296 = var4;
      class89.field974 = 10000;
   }
}
