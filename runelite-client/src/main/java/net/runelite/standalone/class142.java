package net.runelite.standalone;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("s")
final class class142 implements Comparator {
   @ObfuscatedName("v")
   static int[] field1803;
   @ObfuscatedName("g")
   static int[][][] field1808;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "[Lle;"
   )
   static class303[] field1805;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lw;Lw;I)I",
      garbageValue = "1482728635"
   )
   int method2626(class317 var1, class317 var2) {
      return var1.field3899.field3794 < var2.field3899.field3794?-1:(var2.field3899.field3794 == var1.field3899.field3794?0:1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method2626((class317)var1, (class317)var2);
   }

   @ObfuscatedName("ge")
   @ObfuscatedSignature(
      signature = "(IIZI)V",
      garbageValue = "115051067"
   )
   static final void method2634(int var0, int var1, boolean var2) {
      if(!var2 || var0 != class322.field3936 || class118.field1631 != var1) {
         class322.field3936 = var0;
         class118.field1631 = var1;
         method2635(25);
         WorldMapRegion.method4369("Loading - please wait.", true);
         int var3 = class229.field3067;
         int var4 = class35.field360;
         class229.field3067 = (var0 - 6) * 8;
         class35.field360 = (var1 - 6) * 8;
         int var5 = class229.field3067 - var3;
         int var6 = class35.field360 - var4;
         var3 = class229.field3067;
         var4 = class35.field360;

         int var7;
         int var9;
         for(var7 = 0; var7 < 32768; ++var7) {
            class176 var8 = client.field2195[var7];
            if(var8 != null) {
               for(var9 = 0; var9 < 10; ++var9) {
                  var8.field1101[var9] -= var5;
                  var8.field1128[var9] -= var6;
               }

               var8.field1090 -= var5 * 128;
               var8.field1072 -= var6 * 128;
            }
         }

         for(var7 = 0; var7 < 2048; ++var7) {
            class199 var21 = client.field2269[var7];
            if(var21 != null) {
               for(var9 = 0; var9 < 10; ++var9) {
                  var21.field1101[var9] -= var5;
                  var21.field1128[var9] -= var6;
               }

               var21.field1090 -= var5 * 128;
               var21.field1072 -= var6 * 128;
            }
         }

         byte var20 = 0;
         byte var18 = 104;
         byte var22 = 1;
         if(var5 < 0) {
            var20 = 103;
            var18 = -1;
            var22 = -1;
         }

         byte var10 = 0;
         byte var11 = 104;
         byte var12 = 1;
         if(var6 < 0) {
            var10 = 103;
            var11 = -1;
            var12 = -1;
         }

         int var14;
         for(int var13 = var20; var18 != var13; var13 += var22) {
            for(var14 = var10; var14 != var11; var14 += var12) {
               int var15 = var13 + var5;
               int var16 = var14 + var6;

               for(int var17 = 0; var17 < 4; ++var17) {
                  if(var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                     client.field2182[var17][var13][var14] = client.field2182[var17][var15][var16];
                  } else {
                     client.field2182[var17][var13][var14] = null;
                  }
               }
            }
         }

         for(class87 var19 = (class87)client.field2282.method1503(); var19 != null; var19 = (class87)client.field2282.method1505()) {
            var19.field932 -= var5;
            var19.field933 -= var6;
            if(var19.field932 < 0 || var19.field933 < 0 || var19.field932 >= 104 || var19.field933 >= 104) {
               var19.method3937();
            }
         }

         if(client.field2216 != 0) {
            client.field2216 -= var5;
            client.field2414 -= var6;
         }

         client.field2391 = 0;
         client.field2397 = false;
         class85.field912 -= var5 << 7;
         class116.field1324 -= var6 << 7;
         class267.field3457 -= var5 << 7;
         class148.field1834 -= var6 << 7;
         client.field2194 = -1;
         client.field2284.method1520();
         client.field2283.method1520();

         for(var14 = 0; var14 < 4; ++var14) {
            client.field2211[var14].method42();
         }

      }
   }

   @ObfuscatedName("eb")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1157721442"
   )
   static void method2635(int var0) {
      if(var0 != client.field2161) {
         if(client.field2161 == 0) {
            class302.field3755.method5859();
         }

         if(var0 == 20 || var0 == 40 || var0 == 45) {
            client.field2187 = 0;
            client.field2297 = 0;
            client.field2189 = 0;
            client.field2398.method1200(var0);
            if(var0 != 20) {
               class272.method5365(false);
            }
         }

         if(var0 != 20 && var0 != 40 && ClientProt.field3259 != null) {
            ClientProt.field3259.vmethod2787();
            ClientProt.field3259 = null;
         }

         if(client.field2161 == 25) {
            client.field2210 = 0;
            client.field2344 = 0;
            client.field2207 = 1;
            client.field2202 = 0;
            client.field2209 = 1;
         }

         if(var0 != 5 && var0 != 10) {
            if(var0 == 20) {
               class316.method6200(class219.binaryIndex, class138.spritesIndex, true, client.field2161 == 11?4:0);
            } else if(var0 == 11) {
               class316.method6200(class219.binaryIndex, class138.spritesIndex, false, 4);
            } else if(class39.field395) {
               class39.field381 = null;
               class39.field374 = null;
               field1805 = null;
               class39.leftBackground = null;
               class107.rightBackground = null;
               class48.field545 = null;
               class121.field1651 = null;
               class39.field376 = null;
               class135.field1744 = null;
               class193.field2750 = null;
               MapIcon.field257 = null;
               class89.field972 = null;
               class316.field3893 = null;
               class210.field2892 = null;
               MapIcon.field249 = null;
               class103.field1147 = null;
               class302.field3754 = null;
               class179.field2462 = null;
               class219.field2983 = null;
               class218.field2972 = null;
               class31.field293 = null;
               class163.field1986 = null;
               class64.method1353(2);
               class134.method2561(true);
               class39.field395 = false;
            }
         } else {
            class316.method6200(class219.binaryIndex, class138.spritesIndex, true, 0);
         }

         client.field2161 = var0;
         client.gameStateChanged(-1);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "-1485500695"
   )
   public static void method2636(Buffer var0, int var1) {
      class121 var2 = new class121();
      var2.field1647 = var0.readUnsignedByte();
      var2.field1648 = var0.readInt();
      var2.field1645 = new int[var2.field1647];
      var2.field1646 = new int[var2.field1647];
      var2.field1644 = new Field[var2.field1647];
      var2.field1643 = new int[var2.field1647];
      var2.field1649 = new Method[var2.field1647];
      var2.field1650 = new byte[var2.field1647][][];

      for(int var3 = 0; var3 < var2.field1647; ++var3) {
         try {
            int var4 = var0.readUnsignedByte();
            String var5;
            String var6;
            int var7;
            if(var4 != 0 && var4 != 1 && var4 != 2) {
               if(var4 == 3 || var4 == 4) {
                  var5 = var0.readString();
                  var6 = var0.readString();
                  var7 = var0.readUnsignedByte();
                  String[] var8 = new String[var7];

                  for(int var9 = 0; var9 < var7; ++var9) {
                     var8[var9] = var0.readString();
                  }

                  String var20 = var0.readString();
                  byte[][] var10 = new byte[var7][];
                  int var12;
                  if(var4 == 3) {
                     for(int var11 = 0; var11 < var7; ++var11) {
                        var12 = var0.readInt();
                        var10[var11] = new byte[var12];
                        var0.method2295(var10[var11], 0, var12);
                     }
                  }

                  var2.field1645[var3] = var4;
                  Class[] var21 = new Class[var7];

                  for(var12 = 0; var12 < var7; ++var12) {
                     var21[var12] = class293.method5773(var8[var12]);
                  }

                  Class var22 = class293.method5773(var20);
                  if(class293.method5773(var5).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = class293.method5773(var5).getDeclaredMethods();
                  Method[] var14 = var13;

                  for(int var15 = 0; var15 < var14.length; ++var15) {
                     Method var16 = var14[var15];
                     if(Reflection.getMethodName(var16).equals(var6)) {
                        Class[] var17 = Reflection.getParameterTypes(var16);
                        if(var17.length == var21.length) {
                           boolean var18 = true;

                           for(int var19 = 0; var19 < var21.length; ++var19) {
                              if(var17[var19] != var21[var19]) {
                                 var18 = false;
                                 break;
                              }
                           }

                           if(var18 && var22 == var16.getReturnType()) {
                              var2.field1649[var3] = var16;
                           }
                        }
                     }
                  }

                  var2.field1650[var3] = var10;
               }
            } else {
               var5 = var0.readString();
               var6 = var0.readString();
               var7 = 0;
               if(var4 == 1) {
                  var7 = var0.readInt();
               }

               var2.field1645[var3] = var4;
               var2.field1643[var3] = var7;
               if(class293.method5773(var5).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.field1644[var3] = Reflection.findField(class293.method5773(var5), var6);
            }
         } catch (ClassNotFoundException var24) {
            var2.field1646[var3] = -1;
         } catch (SecurityException var25) {
            var2.field1646[var3] = -2;
         } catch (NullPointerException var26) {
            var2.field1646[var3] = -3;
         } catch (Exception var27) {
            var2.field1646[var3] = -4;
         } catch (Throwable var28) {
            var2.field1646[var3] = -5;
         }
      }

      class140.field1793.method748(var2);
   }
}
