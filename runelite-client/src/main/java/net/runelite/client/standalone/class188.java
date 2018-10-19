package net.runelite.client.standalone;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Reflection;

@ObfuscatedName("s")
final class class188 implements Comparator {
   @ObfuscatedName("v")
   static int[] field1796;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "[Lle;"
   )
   static class32[] field1798;
   @ObfuscatedName("g")
   static int[][][] field1801;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lw;Lw;I)I",
      garbageValue = "1482728635"
   )
   int method3230(class230 var1, class230 var2) {
      return var1.field2246.field1432 < var2.field2246.field1432?-1:(var2.field2246.field1432 == var1.field2246.field1432?0:1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method3230((class230)var1, (class230)var2);
   }

   @ObfuscatedName("eb")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1157721442"
   )
   static void method3239(int var0) {
      if(var0 != client.field3740) {
         if(client.field3740 == 0) {
            class113.field1064.method3051();
         }

         if(var0 == 20 || var0 == 40 || var0 == 45) {
            client.field3766 = 0;
            client.field3876 = 0;
            client.field3768 = 0;
            client.field3977.method699(var0);
            if(var0 != 20) {
               class241.method4288(false);
            }
         }

         if(var0 != 20 && var0 != 40 && ClientProt.field574 != null) {
            ClientProt.field574.vmethod5521();
            ClientProt.field574 = null;
         }

         if(client.field3740 == 25) {
            client.field3789 = 0;
            client.field3923 = 0;
            client.field3786 = 1;
            client.field3781 = 0;
            client.field3788 = 1;
         }

         if(var0 != 5 && var0 != 10) {
            if(var0 == 20) {
               class156.method2737(class293.field3165, class170.field1577, true, client.field3740 == 11?4:0);
            } else if(var0 == 11) {
               class156.method2737(class293.field3165, class170.field1577, false, 4);
            } else if(class325.field3489) {
               class325.field3475 = null;
               class325.field3468 = null;
               field1798 = null;
               class325.field3500 = null;
               class275.field3008 = null;
               class189.logoSprite = null;
               class306.field3274 = null;
               class325.field3470 = null;
               class201.field1946 = null;
               class330.field3691 = null;
               class2.field22 = null;
               class204.field1989 = null;
               class156.field1484 = null;
               class102.field962 = null;
               class2.field14 = null;
               class272.field2979 = null;
               class113.field1063 = null;
               class118.field1089 = null;
               class293.field3166 = null;
               class180.field1713 = null;
               class48.field365 = null;
               class226.field2226 = null;
               class294.method5135(2);
               class70.method1170(true);
               class325.field3489 = false;
            }
         } else {
            class156.method2737(class293.field3165, class170.field1577, true, 0);
         }

         client.field3740 = var0;
         client.gameStateChanged(-1);
      }
   }

   @ObfuscatedName("ge")
   @ObfuscatedSignature(
      signature = "(IIZI)V",
      garbageValue = "115051067"
   )
   static final void method3238(int var0, int var1, boolean var2) {
      if(!var2 || var0 != class45.field350 || class164.field1525 != var1) {
         class45.field350 = var0;
         class164.field1525 = var1;
         method3239(25);
         class319.method5587("Loading - please wait.", true);
         int var3 = class296.somex;
         int var4 = class284.somey;
         class296.somex = (var0 - 6) * 8;
         class284.somey = (var1 - 6) * 8;
         int var5 = class296.somex - var3;
         int var6 = class284.somey - var4;
         var3 = class296.somex;
         var4 = class284.somey;

         int var7;
         int var9;
         for(var7 = 0; var7 < 32768; ++var7) {
            class237 var8 = client.field3774[var7];
            if(var8 != null) {
               for(var9 = 0; var9 < 10; ++var9) {
                  var8.field1288[var9] -= var5;
                  var8.field1315[var9] -= var6;
               }

               var8.field1277 -= var5 * 128;
               var8.field1259 -= var6 * 128;
            }
         }

         for(var7 = 0; var7 < 2048; ++var7) {
            class63 var21 = client.field3848[var7];
            if(var21 != null) {
               for(var9 = 0; var9 < 10; ++var9) {
                  var21.field1288[var9] -= var5;
                  var21.field1315[var9] -= var6;
               }

               var21.field1277 -= var5 * 128;
               var21.field1259 -= var6 * 128;
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
                     client.field3761[var17][var13][var14] = client.field3761[var17][var15][var16];
                  } else {
                     client.field3761[var17][var13][var14] = null;
                  }
               }
            }
         }

         for(class274 var19 = (class274)client.field3861.method5604(); var19 != null; var19 = (class274)client.field3861.method5606()) {
            var19.field2992 -= var5;
            var19.field2993 -= var6;
            if(var19.field2992 < 0 || var19.field2993 < 0 || var19.field2992 >= 104 || var19.field2993 >= 104) {
               var19.method1186();
            }
         }

         if(client.field3795 != 0) {
            client.field3795 -= var5;
            client.field3993 -= var6;
         }

         client.field3970 = 0;
         client.field3976 = false;
         class83.field738 -= var5 << 7;
         class50.field375 -= var6 << 7;
         class125.field1181 -= var5 << 7;
         class303.field3244 -= var6 << 7;
         client.field3773 = -1;
         client.field3863.method5621();
         client.field3862.method5621();

         for(var14 = 0; var14 < 4; ++var14) {
            client.field3790[var14].method3160();
         }

      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "-1485500695"
   )
   public static void method3240(Buffer var0, int var1) {
      class306 var2 = new class306();
      var2.field3270 = var0.readUnsignedByte();
      var2.field3271 = var0.readInt();
      var2.field3268 = new int[var2.field3270];
      var2.field3269 = new int[var2.field3270];
      var2.field3267 = new Field[var2.field3270];
      var2.field3266 = new int[var2.field3270];
      var2.field3272 = new Method[var2.field3270];
      var2.field3273 = new byte[var2.field3270][][];

      for(int var3 = 0; var3 < var2.field3270; ++var3) {
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
                        var0.readBytes(var10[var11], 0, var12);
                     }
                  }

                  var2.field3268[var3] = var4;
                  Class[] var21 = new Class[var7];

                  for(var12 = 0; var12 < var7; ++var12) {
                     var21[var12] = class40.method695(var8[var12]);
                  }

                  Class var22 = class40.method695(var20);
                  if(class40.method695(var5).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = class40.method695(var5).getDeclaredMethods();
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
                              var2.field3272[var3] = var16;
                           }
                        }
                     }
                  }

                  var2.field3273[var3] = var10;
               }
            } else {
               var5 = var0.readString();
               var6 = var0.readString();
               var7 = 0;
               if(var4 == 1) {
                  var7 = var0.readInt();
               }

               var2.field3268[var3] = var4;
               var2.field3266[var3] = var7;
               if(class40.method695(var5).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.field3267[var3] = Reflection.findField(class40.method695(var5), var6);
            }
         } catch (ClassNotFoundException var24) {
            var2.field3269[var3] = -1;
         } catch (SecurityException var25) {
            var2.field3269[var3] = -2;
         } catch (NullPointerException var26) {
            var2.field3269[var3] = -3;
         } catch (Exception var27) {
            var2.field3269[var3] = -4;
         } catch (Throwable var28) {
            var2.field3269[var3] = -5;
         }
      }

      class36.field276.method1054(var2);
   }
}
