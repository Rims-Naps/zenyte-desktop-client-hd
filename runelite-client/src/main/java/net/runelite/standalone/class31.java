package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public abstract class class31 {
   @ObfuscatedName("az")
   static int[] field293;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 789087021
   )
   public int field289;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1265705919
   )
   public int field291;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -859492175
   )
   public int field290;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -337605697
   )
   public int field288;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIILfr;B)Z",
      garbageValue = "7"
   )
   public abstract boolean vmethod5314(int var1, int var2, int var3, class3 var4);

   @ObfuscatedName("hk")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-1229788573"
   )
   static final void method526(int var0, int var1, int var2, int var3) {
      if(client.field2306 == 0 && !client.field2308) {
         class28.method484("Walk here", "", 23, 0, var0 - var2, var1 - var3);
      }

      long var4 = -1L;
      long var6 = -1L;
      int var8 = 0;

      while(true) {
         int var10 = class298.field3703;
         if(var8 >= var10) {
            if(var4 != -1L) {
               var8 = (int)(var4 >>> 0 & 127L);
               var10 = GameEngine.method5966(var4);
               class199 var11 = client.field2269[client.field2343];
               class175.method3241(var11, client.field2343, var8, var10);
            }

            return;
         }

         long var28 = class298.field3710[var8];
         if(var28 != var6) {
            label330: {
               var6 = var28;
               int var15 = class321.method6251(var8);
               int var16 = GameEngine.method5966(class298.field3710[var8]);
               int var17 = var16;
               long var20 = class298.field3710[var8];
               int var19 = (int)(var20 >>> 14 & 3L);
               int var30 = class178.method3682(class298.field3710[var8]);
               int var21 = var30;
               if(var19 == 2 && class269.field3464.method1955(class260.field3393, var15, var16, var28) >= 0) {
                  class15 var22 = class285.method5484(var30);
                  if(var22.field189 != null) {
                     var22 = var22.method325();
                  }

                  if(var22 == null) {
                     break label330;
                  }

                  if(client.field2306 == 1) {
                     class28.method484("Use", client.field2256 + " " + "->" + " " + class64.method1354(65535) + var22.field147, 1, var30, var15, var16);
                  } else if(client.field2308) {
                     if((class230.field3072 & 4) == 4) {
                        class28.method484(client.field2311, client.field2312 + " " + "->" + " " + class64.method1354(65535) + var22.field147, 2, var30, var15, var16);
                     }
                  } else {
                     String[] var31 = var22.field178;
                     if(var31 != null) {
                        for(int var32 = 4; var32 >= 0; --var32) {
                           if(var31[var32] != null) {
                              short var25 = 0;
                              if(var32 == 0) {
                                 var25 = 3;
                              }

                              if(var32 == 1) {
                                 var25 = 4;
                              }

                              if(var32 == 2) {
                                 var25 = 5;
                              }

                              if(var32 == 3) {
                                 var25 = 6;
                              }

                              if(var32 == 4) {
                                 var25 = 1001;
                              }

                              class28.method484(var31[var32], class64.method1354(65535) + var22.field147, var25, var21, var15, var17);
                           }
                        }
                     }

                     class28.method484("Examine", class64.method1354(65535) + var22.field147, 1002, var22.field155, var15, var17);
                  }
               }

               int var23;
               class176 var24;
               class199 var26;
               int[] var38;
               int var40;
               if(var19 == 1) {
                  class176 var35 = client.field2195[var21];
                  if(var35 == null) {
                     break label330;
                  }

                  if(var35.field2437.field3862 == 1 && (var35.field1090 & 127) == 64 && (var35.field1072 & 127) == 64) {
                     for(var23 = 0; var23 < client.field2196; ++var23) {
                        var24 = client.field2195[client.field2197[var23]];
                        if(var24 != null && var24 != var35 && var24.field2437.field3862 == 1 && var24.field1090 == var35.field1090 && var24.field1072 == var35.field1072) {
                           class67.method1487(var24.field2437, client.field2197[var23], var15, var17);
                        }
                     }

                     var23 = class152.field1874;
                     var38 = class152.field1875;

                     for(var40 = 0; var40 < var23; ++var40) {
                        var26 = client.field2269[var38[var40]];
                        if(var26 != null && var35.field1090 == var26.field1090 && var35.field1072 == var26.field1072) {
                           class175.method3241(var26, var38[var40], var15, var17);
                        }
                     }
                  }

                  class67.method1487(var35.field2437, var21, var15, var17);
               }

               if(var19 == 0) {
                  class199 var36 = client.field2269[var21];
                  if(var36 == null) {
                     break label330;
                  }

                  if((var36.field1090 & 127) == 64 && (var36.field1072 & 127) == 64) {
                     for(var23 = 0; var23 < client.field2196; ++var23) {
                        var24 = client.field2195[client.field2197[var23]];
                        if(var24 != null && var24.field2437.field3862 == 1 && var24.field1090 == var36.field1090 && var24.field1072 == var36.field1072) {
                           class67.method1487(var24.field2437, client.field2197[var23], var15, var17);
                        }
                     }

                     var23 = class152.field1874;
                     var38 = class152.field1875;

                     for(var40 = 0; var40 < var23; ++var40) {
                        var26 = client.field2269[var38[var40]];
                        if(var26 != null && var36 != var26 && var36.field1090 == var26.field1090 && var36.field1072 == var26.field1072) {
                           class175.method3241(var26, var38[var40], var15, var17);
                        }
                     }
                  }

                  if(var21 != client.field2343) {
                     class175.method3241(var36, var21, var15, var17);
                  } else {
                     var4 = var28;
                  }
               }

               if(var19 == 3) {
                  class70 var37 = client.field2182[class260.field3393][var15][var17];
                  if(var37 != null) {
                     for(class191 var41 = (class191)var37.method1504(); var41 != null; var41 = (class191)var37.method1506()) {
                        class42 var39 = class164.method3014(var41.field2737);
                        if(client.field2306 == 1) {
                           class28.method484("Use", client.field2256 + " " + "->" + " " + class64.method1354(16748608) + var39.field446, 16, var41.field2737, var15, var17);
                        } else if(client.field2308) {
                           if((class230.field3072 & 1) == 1) {
                              class28.method484(client.field2311, client.field2312 + " " + "->" + " " + class64.method1354(16748608) + var39.field446, 17, var41.field2737, var15, var17);
                           }
                        } else {
                           String[] var33 = var39.field469;

                           for(int var34 = 4; var34 >= 0; --var34) {
                              if(var33 != null && var33[var34] != null) {
                                 byte var27 = 0;
                                 if(var34 == 0) {
                                    var27 = 18;
                                 }

                                 if(var34 == 1) {
                                    var27 = 19;
                                 }

                                 if(var34 == 2) {
                                    var27 = 20;
                                 }

                                 if(var34 == 3) {
                                    var27 = 21;
                                 }

                                 if(var34 == 4) {
                                    var27 = 22;
                                 }

                                 class28.method484(var33[var34], class64.method1354(16748608) + var39.field446, var27, var41.field2737, var15, var17);
                              } else if(var34 == 2) {
                                 class28.method484("Take", class64.method1354(16748608) + var39.field446, 20, var41.field2737, var15, var17);
                              }
                           }

                           class28.method484("Examine", class64.method1354(16748608) + var39.field446, 1004, var41.field2737, var15, var17);
                        }
                     }
                  }
               }
            }
         }

         ++var8;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(CI)C",
      garbageValue = "2033628878"
   )
   static char method527(char var0) {
      return (char)(var0 == 198?69:(var0 == 230?101:(var0 == 223?115:(var0 == 338?69:(var0 == 339?'e':'\u0000')))));
   }
}
