package net.runelite.client.standalone;

import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
public class class230 {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -2124775599
   )
   public final int field2247;
   @ObfuscatedName("e")
   String field2250;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      longValue = 644221176751913133L
   )
   public final long field2252;
   @ObfuscatedName("s")
   String field2249;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Le;"
   )
   public final class150 field2246;

   @ObfuscatedSignature(
      signature = "(Lgm;BI)V"
   )
   class230(Buffer var1, byte var2, int var3) {
      this.field2249 = var1.readString();
      this.field2250 = var1.readString();
      this.field2247 = var1.readUnsignedShort();
      this.field2252 = var1.method1998();
      int var4 = var1.readInt();
      int var5 = var1.readInt();
      this.field2246 = new class150();
      this.field2246.method2677(2);
      this.field2246.method2682(var2);
      this.field2246.field1437 = var4;
      this.field2246.field1432 = var5;
      this.field2246.field1433 = 0;
      this.field2246.field1434 = 0;
      this.field2246.field1430 = var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-1570653547"
   )
   public String method4110() {
      return this.field2249;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "1854517809"
   )
   public String method4115() {
      return this.field2250;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Ljava/io/File;",
      garbageValue = "-1489002572"
   )
   static File method4119(String var0) {
      if(!class1.field8) {
         throw new RuntimeException("");
      } else {
         File var1 = (File)class1.field7.get(var0);
         if(var1 != null) {
            return var1;
         } else {
            File var2 = new File(class1.field6, var0);
            RandomAccessFile var3 = null;

            try {
               File var4 = new File(var2.getParent());
               if(!var4.exists()) {
                  throw new RuntimeException("");
               } else {
                  var3 = new RandomAccessFile(var2, "rw");
                  int var5 = var3.read();
                  var3.seek(0L);
                  var3.write(var5);
                  var3.seek(0L);
                  var3.close();
                  class1.field7.put(var0, var2);
                  return var2;
               }
            } catch (Exception var8) {
               try {
                  if(var3 != null) {
                     var3.close();
                     var3 = null;
                  }
               } catch (Exception var7) {
                  ;
               }

               throw new RuntimeException();
            }
         }
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1187177447"
   )
   static final int method4118() {
      return class327.field3511;
   }

   @ObfuscatedName("js")
   @ObfuscatedSignature(
      signature = "(Lhw;IIIB)V",
      garbageValue = "0"
   )
   static final void method4116(class329 var0, int var1, int var2, int var3) {
      class31.method519();
      class123 var4 = var0.method5887(false);
      if(var4 != null) {
         class89.method1532(var1, var2, var4.field1174 + var1, var2 + var4.field1171);
         if(client.minimapState != 2 && client.minimapState != 5) {
            int var5 = client.field3802 & 2047;
            int var6 = class5.field43.field1277 / 32 + 48;
            int var7 = 464 - class5.field43.field1259 / 32;
            class5.field44.method394(var1, var2, var4.field1174, var4.field1171, var6, var7, var5, 256, var4.field1172, var4.field1169);

            int var8;
            int var9;
            int var10;
            for(var8 = 0; var8 < client.field3958; ++var8) {
               var9 = client.field3769[var8] * 4 + 2 - class5.field43.field1277 / 32;
               var10 = client.field3960[var8] * 4 + 2 - class5.field43.field1259 / 32;
               class278.method4944(var1, var2, var9, var10, client.field3961[var8], var4);
            }

            int var11;
            int var12;
            for(var8 = 0; var8 < 104; ++var8) {
               for(var9 = 0; var9 < 104; ++var9) {
                  class320 var15 = client.field3761[class315.plane][var8][var9];
                  if(var15 != null) {
                     var11 = var8 * 4 + 2 - class5.field43.field1277 / 32;
                     var12 = var9 * 4 + 2 - class5.field43.field1259 / 32;
                     class278.method4944(var1, var2, var11, var12, class241.field2414[0], var4);
                  }
               }
            }

            for(var8 = 0; var8 < client.field3775; ++var8) {
               class237 var16 = client.field3774[client.field3776[var8]];
               if(var16 != null && var16.vmethod4190()) {
                  class222 var18 = var16.field2400;
                  if(var18 != null && var18.field2168 != null) {
                     var18 = var18.method3970();
                  }

                  if(var18 != null && var18.field2155 && var18.field2171) {
                     var11 = var16.field1277 / 32 - class5.field43.field1277 / 32;
                     var12 = var16.field1259 / 32 - class5.field43.field1259 / 32;
                     class278.method4944(var1, var2, var11, var12, class241.field2414[1], var4);
                  }
               }
            }

            var8 = class11.field90;
            int[] var19 = class11.field91;

            for(var10 = 0; var10 < var8; ++var10) {
               class63 var17 = client.field3848[var19[var10]];
               if(var17 != null && var17.vmethod4190() && !var17.field575 && var17 != class5.field43) {
                  var12 = var17.field1277 / 32 - class5.field43.field1277 / 32;
                  int var13 = var17.field1259 / 32 - class5.field43.field1259 / 32;
                  boolean var14 = false;
                  if(class5.field43.field595 != 0 && var17.field595 != 0 && var17.field595 == class5.field43.field595) {
                     var14 = true;
                  }

                  if(var17.method1094()) {
                     class278.method4944(var1, var2, var12, var13, class241.field2414[3], var4);
                  } else if(var14) {
                     class278.method4944(var1, var2, var12, var13, class241.field2414[4], var4);
                  } else if(var17.method1086()) {
                     class278.method4944(var1, var2, var12, var13, class241.field2414[5], var4);
                  } else {
                     class278.method4944(var1, var2, var12, var13, class241.field2414[2], var4);
                  }
               }
            }

            if(client.field3752 != 0 && client.field3744 % 20 < 10) {
               if(client.field3752 == 1 && client.field3859 >= 0 && client.field3859 < client.field3774.length) {
                  class237 var20 = client.field3774[client.field3859];
                  if(var20 != null) {
                     var11 = var20.field1277 / 32 - class5.field43.field1277 / 32;
                     var12 = var20.field1259 / 32 - class5.field43.field1259 / 32;
                     class169.method2878(var1, var2, var11, var12, class253.field2514[1], var4);
                  }
               }

               if(client.field3752 == 2) {
                  var10 = client.field3755 * 4 - class296.somex * 4 + 2 - class5.field43.field1277 / 32;
                  var11 = client.field3899 * 4 - class284.somey * 4 + 2 - class5.field43.field1259 / 32;
                  class169.method2878(var1, var2, var10, var11, class253.field2514[1], var4);
               }

               if(client.field3752 == 10 && client.field3799 >= 0 && client.field3799 < client.field3848.length) {
                  class63 var21 = client.field3848[client.field3799];
                  if(var21 != null) {
                     var11 = var21.field1277 / 32 - class5.field43.field1277 / 32;
                     var12 = var21.field1259 / 32 - class5.field43.field1259 / 32;
                     class169.method2878(var1, var2, var11, var12, class253.field2514[1], var4);
                  }
               }
            }

            if(client.field3795 != 0) {
               var10 = client.field3795 * 4 + 2 - class5.field43.field1277 / 32;
               var11 = client.field3993 * 4 + 2 - class5.field43.field1259 / 32;
               class278.method4944(var1, var2, var10, var11, class253.field2514[0], var4);
            }

            if(!class5.field43.field575) {
               class89.method1561(var4.field1174 / 2 + var1 - 1, var4.field1171 / 2 + var2 - 1, 3, 3, 16777215);
            }
         } else {
            class89.method1551(var1, var2, 0, var4.field1172, var4.field1169);
         }

         client.field3866[var3] = true;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Lgm;IB)V",
      garbageValue = "-70"
   )
   public static void method4117(Buffer var0, int var1) {
      if(class323.field3456 != null) {
         try {
            class323.field3456.method3730(0L);
            class323.field3456.method3719(var0.field1074, var1, 24);
         } catch (Exception var3) {
            ;
         }
      }

   }
}
