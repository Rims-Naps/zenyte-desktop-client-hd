package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public abstract class class48 {
   @ObfuscatedName("az")
   static int[] field365;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -859492175
   )
   public int field362;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 789087021
   )
   public int field361;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1265705919
   )
   public int field363;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -337605697
   )
   public int field360;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIILfr;B)Z",
      garbageValue = "7"
   )
   public abstract boolean vmethod2285(int var1, int var2, int var3, class182 var4);

   @ObfuscatedName("hk")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-1229788573"
   )
   static final void method817(int var0, int var1, int var2, int var3) {
      if(client.field3885 == 0 && !client.field3887) {
         class98.method1687("Walk here", "", 23, 0, var0 - var2, var1 - var3);
      }

      long var4 = -1L;
      long var6 = -1L;
      int var8 = 0;

      while(true) {
         int var10 = class327.field3509;
         if(var8 >= var10) {
            if(var4 != -1L) {
               var8 = (int)(var4 >>> 0 & 127L);
               var10 = class181.method3158(var4);
               class63 var11 = client.field3848[client.field3922];
               class153.method2715(var11, client.field3922, var8, var10);
            }

            return;
         }

         long var28 = class327.field3516[var8];
         if(var28 != var6) {
            label330: {
               var6 = var28;
               int var15 = class234.method4169(var8);
               int var16 = class181.method3158(class327.field3516[var8]);
               int var17 = var16;
               long var20 = class327.field3516[var8];
               int var19 = (int)(var20 >>> 14 & 3L);
               int var30 = class233.method4163(class327.field3516[var8]);
               int var21 = var30;
               if(var19 == 2 && class258.field2566.method5361(class315.plane, var15, var16, var28) >= 0) {
                  class172 var22 = class152.method2696(var30);
                  if(var22.field1631 != null) {
                     var22 = var22.method2898();
                  }

                  if(var22 == null) {
                     break label330;
                  }

                  if(client.field3885 == 1) {
                     class98.method1687("Use", client.field3835 + " " + "->" + " " + class294.method5136(65535) + var22.field1589, 1, var30, var15, var16);
                  } else if(client.field3887) {
                     if((class184.field1776 & 4) == 4) {
                        class98.method1687(client.field3890, client.field3891 + " " + "->" + " " + class294.method5136(65535) + var22.field1589, 2, var30, var15, var16);
                     }
                  } else {
                     String[] var31 = var22.field1620;
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

                              class98.method1687(var31[var32], class294.method5136(65535) + var22.field1589, var25, var21, var15, var17);
                           }
                        }
                     }

                     class98.method1687("Examine", class294.method5136(65535) + var22.field1589, 1002, var22.field1597, var15, var17);
                  }
               }

               int var23;
               class237 var24;
               class63 var26;
               int[] var38;
               int var40;
               if(var19 == 1) {
                  class237 var35 = client.field3774[var21];
                  if(var35 == null) {
                     break label330;
                  }

                  if(var35.field2400.field2144 == 1 && (var35.field1277 & 127) == 64 && (var35.field1259 & 127) == 64) {
                     for(var23 = 0; var23 < client.field3775; ++var23) {
                        var24 = client.field3774[client.field3776[var23]];
                        if(var24 != null && var24 != var35 && var24.field2400.field2144 == 1 && var24.field1277 == var35.field1277 && var24.field1259 == var35.field1259) {
                           class136.method2510(var24.field2400, client.field3776[var23], var15, var17);
                        }
                     }

                     var23 = class11.field90;
                     var38 = class11.field91;

                     for(var40 = 0; var40 < var23; ++var40) {
                        var26 = client.field3848[var38[var40]];
                        if(var26 != null && var35.field1277 == var26.field1277 && var35.field1259 == var26.field1259) {
                           class153.method2715(var26, var38[var40], var15, var17);
                        }
                     }
                  }

                  class136.method2510(var35.field2400, var21, var15, var17);
               }

               if(var19 == 0) {
                  class63 var36 = client.field3848[var21];
                  if(var36 == null) {
                     break label330;
                  }

                  if((var36.field1277 & 127) == 64 && (var36.field1259 & 127) == 64) {
                     for(var23 = 0; var23 < client.field3775; ++var23) {
                        var24 = client.field3774[client.field3776[var23]];
                        if(var24 != null && var24.field2400.field2144 == 1 && var24.field1277 == var36.field1277 && var24.field1259 == var36.field1259) {
                           class136.method2510(var24.field2400, client.field3776[var23], var15, var17);
                        }
                     }

                     var23 = class11.field90;
                     var38 = class11.field91;

                     for(var40 = 0; var40 < var23; ++var40) {
                        var26 = client.field3848[var38[var40]];
                        if(var26 != null && var36 != var26 && var36.field1277 == var26.field1277 && var36.field1259 == var26.field1259) {
                           class153.method2715(var26, var38[var40], var15, var17);
                        }
                     }
                  }

                  if(var21 != client.field3922) {
                     class153.method2715(var36, var21, var15, var17);
                  } else {
                     var4 = var28;
                  }
               }

               if(var19 == 3) {
                  class320 var37 = client.field3761[class315.plane][var15][var17];
                  if(var37 != null) {
                     for(class161 var41 = (class161)var37.method5605(); var41 != null; var41 = (class161)var37.method5607()) {
                        class120 var39 = class67.method1152(var41.field1504);
                        if(client.field3885 == 1) {
                           class98.method1687("Use", client.field3835 + " " + "->" + " " + class294.method5136(16748608) + var39.field1119, 16, var41.field1504, var15, var17);
                        } else if(client.field3887) {
                           if((class184.field1776 & 1) == 1) {
                              class98.method1687(client.field3890, client.field3891 + " " + "->" + " " + class294.method5136(16748608) + var39.field1119, 17, var41.field1504, var15, var17);
                           }
                        } else {
                           String[] var33 = var39.field1142;

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

                                 class98.method1687(var33[var34], class294.method5136(16748608) + var39.field1119, var27, var41.field1504, var15, var17);
                              } else if(var34 == 2) {
                                 class98.method1687("Take", class294.method5136(16748608) + var39.field1119, 20, var41.field1504, var15, var17);
                              }
                           }

                           class98.method1687("Examine", class294.method5136(16748608) + var39.field1119, 1004, var41.field1504, var15, var17);
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
   static char method818(char var0) {
      return (char)(var0 == 198?69:(var0 == 230?101:(var0 == 223?115:(var0 == 338?69:(var0 == 339?'e':'\u0000')))));
   }
}
