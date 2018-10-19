package net.runelite.client.standalone;

import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.google.common.io.BaseEncoding;
import com.google.common.io.ByteStreams;
import com.google.common.io.CharStreams;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import net.runelite.api.overlay.OverlayIndex;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSIndexData;
import net.runelite.rs.api.RSIndexDataBase;
import org.slf4j.Logger;

@ObfuscatedName("ik")
public abstract class class148 implements RSIndexDataBase {
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Lfv;"
   )
   static class53 field1408;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1513495793
   )
   static int field1425;
   @ObfuscatedName("j")
   boolean field1423;
   @ObfuscatedName("m")
   int[][] field1417;
   @ObfuscatedName("z")
   Object[] field1419;
   @ObfuscatedName("r")
   int[][] field1411;
   @ObfuscatedName("p")
   int[] field1422;
   @ObfuscatedName("c")
   int[] field1414;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lgc;"
   )
   class291 field1412;
   @ObfuscatedName("b")
   boolean field1424;
   @ObfuscatedName("x")
   Object[][] field1420;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1961341997
   )
   int field1421;
   @ObfuscatedName("s")
   int[] field1415;
   @ObfuscatedName("a")
   int[] field1413;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 829165449
   )
   public int field1409;
   @ObfuscatedName("w")
   int[] field1410;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "[Lgc;"
   )
   class291[] field1418;
   public boolean overlayOutdated;

   static {
      field1408 = new class53();
      field1425 = 0;
   }

   class148(boolean var1, boolean var2) {
      this.field1423 = var1;
      this.field1424 = var2;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;I)Z",
      garbageValue = "1825696773"
   )
   public boolean method2598(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field1412.method5113(class163.method2781(var1));
      if(var3 < 0) {
         return false;
      } else {
         int var4 = this.field1418[var3].method5113(class163.method2781(var2));
         return var4 >= 0;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)I",
      garbageValue = "1348807448"
   )
   public int method2594(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field1412.method5113(class163.method2781(var1));
      return this.vmethod2585(var2);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "-1199774911"
   )
   void method2577(byte[] var1) {
      int var3 = var1.length;
      int var2 = class314.method5540(var1, 0, var3);
      this.field1409 = var2;
      Buffer var4 = new Buffer(class177.method2968(var1));
      int var5 = var4.readUnsignedByte();
      if(var5 >= 5 && var5 <= 7) {
         if(var5 >= 6) {
            var4.readInt();
         }

         int var6 = var4.readUnsignedByte();
         if(var5 >= 7) {
            this.field1421 = var4.method1921();
         } else {
            this.field1421 = var4.readUnsignedShort();
         }

         int var7 = 0;
         int var8 = -1;
         this.field1410 = new int[this.field1421];
         int var9;
         if(var5 >= 7) {
            for(var9 = 0; var9 < this.field1421; ++var9) {
               this.field1410[var9] = var7 += var4.method1921();
               if(this.field1410[var9] > var8) {
                  var8 = this.field1410[var9];
               }
            }
         } else {
            for(var9 = 0; var9 < this.field1421; ++var9) {
               this.field1410[var9] = var7 += var4.readUnsignedShort();
               if(this.field1410[var9] > var8) {
                  var8 = this.field1410[var9];
               }
            }
         }

         this.field1413 = new int[var8 + 1];
         this.field1414 = new int[var8 + 1];
         this.field1422 = new int[var8 + 1];
         this.field1411 = new int[var8 + 1][];
         this.field1419 = new Object[var8 + 1];
         this.field1420 = new Object[var8 + 1][];
         if(var6 != 0) {
            this.field1415 = new int[var8 + 1];

            for(var9 = 0; var9 < this.field1421; ++var9) {
               this.field1415[this.field1410[var9]] = var4.readInt();
            }

            this.field1412 = new class291(this.field1415);
         }

         for(var9 = 0; var9 < this.field1421; ++var9) {
            this.field1413[this.field1410[var9]] = var4.readInt();
         }

         for(var9 = 0; var9 < this.field1421; ++var9) {
            this.field1414[this.field1410[var9]] = var4.readInt();
         }

         for(var9 = 0; var9 < this.field1421; ++var9) {
            this.field1422[this.field1410[var9]] = var4.readUnsignedShort();
         }

         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         if(var5 >= 7) {
            for(var9 = 0; var9 < this.field1421; ++var9) {
               var10 = this.field1410[var9];
               var11 = this.field1422[var10];
               var7 = 0;
               var12 = -1;
               this.field1411[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.field1411[var10][var13] = var7 += var4.method1921();
                  if(var14 > var12) {
                     var12 = var14;
                  }
               }

               this.field1420[var10] = new Object[var12 + 1];
            }
         } else {
            for(var9 = 0; var9 < this.field1421; ++var9) {
               var10 = this.field1410[var9];
               var11 = this.field1422[var10];
               var7 = 0;
               var12 = -1;
               this.field1411[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.field1411[var10][var13] = var7 += var4.readUnsignedShort();
                  if(var14 > var12) {
                     var12 = var14;
                  }
               }

               this.field1420[var10] = new Object[var12 + 1];
            }
         }

         if(var6 != 0) {
            this.field1417 = new int[var8 + 1][];
            this.field1418 = new class291[var8 + 1];

            for(var9 = 0; var9 < this.field1421; ++var9) {
               var10 = this.field1410[var9];
               var11 = this.field1422[var10];
               this.field1417[var10] = new int[this.field1420[var10].length];

               for(var12 = 0; var12 < var11; ++var12) {
                  this.field1417[var10][this.field1411[var10][var12]] = var4.readInt();
               }

               this.field1418[var10] = new class291(this.field1417[var10]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1205100077"
   )
   void vmethod2611(int var1) {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)Z",
      garbageValue = "-1"
   )
   public boolean method2601(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field1412.method5113(class163.method2781(var1));
      return this.method2631(var2);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "0"
   )
   int vmethod2585(int var1) {
      return this.field1419[var1] != null?100:0;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1564969535"
   )
   public void method2595() {
      for(int var1 = 0; var1 < this.field1420.length; ++var1) {
         if(this.field1420[var1] != null) {
            for(int var2 = 0; var2 < this.field1420[var1].length; ++var2) {
               this.field1420[var1][var2] = null;
            }
         }
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(III)[B",
      garbageValue = "1319994235"
   )
   public byte[] method2676(int var1, int var2) {
      if(var1 >= 0 && var1 < this.field1420.length && this.field1420[var1] != null && var2 >= 0 && var2 < this.field1420[var1].length) {
         if(this.field1420[var1][var2] == null) {
            boolean var3 = this.method2596(var1, (int[])null);
            if(!var3) {
               this.vmethod2611(var1);
               var3 = this.method2596(var1, (int[])null);
               if(!var3) {
                  return null;
               }
            }
         }

         byte[] var4 = class106.method1788(this.field1420[var1][var2], false);
         return var4;
      } else {
         return null;
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "181902242"
   )
   public boolean method2584() {
      boolean var1 = true;

      for(int var2 = 0; var2 < this.field1410.length; ++var2) {
         int var3 = this.field1410[var2];
         if(this.field1419[var3] == null) {
            this.vmethod2611(var3);
            if(this.field1419[var3] == null) {
               var1 = false;
            }
         }
      }

      return var1;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)I",
      garbageValue = "-1929783439"
   )
   public int method2581(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.field1418[var1].method5113(class163.method2781(var2));
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "-8"
   )
   public boolean method2631(int var1) {
      if(this.field1419[var1] != null) {
         return true;
      } else {
         this.vmethod2611(var1);
         return this.field1419[var1] != null;
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-1614863185"
   )
   public int method2616(int var1) {
      return this.field1420[var1].length;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1300706815"
   )
   public boolean method2582(int var1) {
      if(this.field1420.length == 1) {
         return this.method2649(0, var1);
      } else if(this.field1420[var1].length == 1) {
         return this.method2649(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "342627562"
   )
   public boolean method2649(int var1, int var2) {
      if(var1 >= 0 && var1 < this.field1420.length && this.field1420[var1] != null && var2 >= 0 && var2 < this.field1420[var1].length) {
         if(this.field1420[var1][var2] != null) {
            return true;
         } else if(this.field1419[var1] != null) {
            return true;
         } else {
            this.vmethod2611(var1);
            return this.field1419[var1] != null;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(II)[B",
      garbageValue = "-475458891"
   )
   public byte[] method2588(int var1) {
      if(this.field1420.length == 1) {
         return this.method2676(0, var1);
      } else if(this.field1420[var1].length == 1) {
         return this.method2676(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "545333176"
   )
   void vmethod2578(int var1) {
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;I)[B",
      garbageValue = "231489877"
   )
   public byte[] method2599(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field1412.method5113(class163.method2781(var1));
      int var4 = this.field1418[var3].method5113(class163.method2781(var2));
      return this.method2579(var3, var4, -67742742);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "31"
   )
   public int method2592() {
      return this.field1420.length;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II[IB)[B",
      garbageValue = "60"
   )
   public byte[] method2580(int var1, int var2, int[] var3) {
      if(var1 >= 0 && var1 < this.field1420.length && this.field1420[var1] != null && var2 >= 0 && var2 < this.field1420[var1].length) {
         if(this.field1420[var1][var2] == null) {
            boolean var4 = this.method2596(var1, var3);
            if(!var4) {
               this.vmethod2611(var1);
               var4 = this.method2596(var1, var3);
               if(!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = class106.method1788(this.field1420[var1][var2], false);
         if(this.field1424) {
            this.field1420[var1][var2] = null;
         }

         return var5;
      } else {
         return null;
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(II)[I",
      garbageValue = "-1958918395"
   )
   public int[] method2656(int var1) {
      return this.field1411[var1];
   }

   @ObfuscatedName("w")
   public byte[] method2579(int var1, int var2, int var3) {
      byte[] var4 = this.copy$getConfigData(var1, var2, var3);
      RSIndexData var5 = (RSIndexData)this;
      if(!OverlayIndex.hasOverlay(var5.getIndex(), var1)) {
         return var4;
      } else {
         Logger var6 = class113.field1064.getLogger();
         InputStream var7 = this.getClass().getResourceAsStream("/runelite/" + var5.getIndex() + "/" + var1);
         if(var7 == null) {
            var6.warn("Missing overlay data for {}/{}", Integer.valueOf(var5.getIndex()), Integer.valueOf(var1));
            return var4;
         } else {
            InputStream var8 = this.getClass().getResourceAsStream("/runelite/" + var5.getIndex() + "/" + var1 + ".hash");
            if(var4 == null) {
               if(var8 != null) {
                  var6.warn("Hash file for non existing archive {}/{}", Integer.valueOf(var5.getIndex()), Integer.valueOf(var1));
                  return null;
               } else {
                  var6.debug("Adding archive {}/{}", Integer.valueOf(var5.getIndex()), Integer.valueOf(var1));

                  try {
                     return ByteStreams.toByteArray(var7);
                  } catch (IOException var12) {
                     var6.warn("error loading archive replacement", var12);
                     return null;
                  }
               }
            } else if(var8 == null) {
               var6.warn("Missing hash file for {}/{}", Integer.valueOf(var5.getIndex()), Integer.valueOf(var1));
               return var4;
            } else {
               HashCode var9 = Hashing.sha256().hashBytes(var4);
               String var10 = BaseEncoding.base16().encode(var9.asBytes());

               try {
                  String var11 = CharStreams.toString(new InputStreamReader(var8));
                  if(var11.equals(var10)) {
                     var6.debug("Replacing archive {}/{}", Integer.valueOf(var5.getIndex()), Integer.valueOf(var1));
                     return ByteStreams.toByteArray(var7);
                  }

                  var6.warn("Mismatch in overlaid cache archive hash for {}/{}: {} != {}", new Object[]{Integer.valueOf(var5.getIndex()), Integer.valueOf(var1), var11, var10});
                  this.overlayOutdated = true;
               } catch (IOException var13) {
                  var6.warn("error checking hash", var13);
               }

               return var4;
            }
         }
      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-208323389"
   )
   public void method2639(int var1) {
      for(int var2 = 0; var2 < this.field1420[var1].length; ++var2) {
         this.field1420[var1][var2] = null;
      }

   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1422108582"
   )
   public void method2593() {
      for(int var1 = 0; var1 < this.field1419.length; ++var1) {
         this.field1419[var1] = null;
      }

   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "504092146"
   )
   public void method2658(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field1412.method5113(class163.method2781(var1));
      if(var2 >= 0) {
         this.vmethod2578(var2);
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(I[II)Z",
      garbageValue = "-1913660556"
   )
   boolean method2596(int var1, int[] var2) {
      if(this.field1419[var1] == null) {
         return false;
      } else {
         int var3 = this.field1422[var1];
         int[] var4 = this.field1411[var1];
         Object[] var5 = this.field1420[var1];
         boolean var6 = true;

         for(int var7 = 0; var7 < var3; ++var7) {
            if(var5[var4[var7]] == null) {
               var6 = false;
               break;
            }
         }

         if(var6) {
            return true;
         } else {
            byte[] var18;
            if(var2 != null && (var2[0] != 0 || var2[1] != 0 || var2[2] != 0 || var2[3] != 0)) {
               var18 = class106.method1788(this.field1419[var1], true);
               Buffer var8 = new Buffer(var18);
               var8.method2112(var2, 5, var8.field1074.length);
            } else {
               var18 = class106.method1788(this.field1419[var1], false);
            }

            byte[] var20 = class177.method2968(var18);
            if(this.field1423) {
               this.field1419[var1] = null;
            }

            if(var3 > 1) {
               int var9 = var20.length;
               --var9;
               int var10 = var20[var9] & 255;
               var9 -= var3 * var10 * 4;
               Buffer var11 = new Buffer(var20);
               int[] var12 = new int[var3];
               var11.field1073 = var9;

               int var14;
               int var15;
               for(int var13 = 0; var13 < var10; ++var13) {
                  var14 = 0;

                  for(var15 = 0; var15 < var3; ++var15) {
                     var14 += var11.readInt();
                     var12[var15] += var14;
                  }
               }

               byte[][] var19 = new byte[var3][];

               for(var14 = 0; var14 < var3; ++var14) {
                  var19[var14] = new byte[var12[var14]];
                  var12[var14] = 0;
               }

               var11.field1073 = var9;
               var14 = 0;

               for(var15 = 0; var15 < var10; ++var15) {
                  int var16 = 0;

                  for(int var17 = 0; var17 < var3; ++var17) {
                     var16 += var11.readInt();
                     System.arraycopy(var20, var14, var19[var17], var12[var17], var16);
                     var12[var17] += var16;
                     var14 += var16;
                  }
               }

               for(var15 = 0; var15 < var3; ++var15) {
                  if(!this.field1424) {
                     var5[var4[var15]] = class164.method2815(var19[var15], false);
                  } else {
                     var5[var4[var15]] = var19[var15];
                  }
               }
            } else if(!this.field1424) {
               var5[var4[0]] = class164.method2815(var20, false);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(II)[B",
      garbageValue = "-1549282975"
   )
   public byte[] method2586(int var1) {
      if(this.field1420.length == 1) {
         return this.method2579(0, var1, -1062048703);
      } else if(this.field1420[var1].length == 1) {
         return this.method2579(var1, 0, -929869171);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;B)Z",
      garbageValue = "1"
   )
   public boolean method2600(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field1412.method5113(class163.method2781(var1));
      int var4 = this.field1418[var3].method5113(class163.method2781(var2));
      return this.method2649(var3, var4);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)I",
      garbageValue = "-901257565"
   )
   public int method2602(String var1) {
      var1 = var1.toLowerCase();
      return this.field1412.method5113(class163.method2781(var1));
   }

   public byte[] copy$getConfigData(int var1, int var2, int var3) {
      return this.method2580(var1, var2, (int[])null);
   }

   public boolean isOverlayOutdated() {
      return this.overlayOutdated;
   }

   public byte[] getConfigData(int var1, int var2) {
      return this.method2579(var1, var2, 1035482844);
   }

   @ObfuscatedName("gx")
   @ObfuscatedSignature(
      signature = "(Lbn;IIIIII)V"
   )
   static final void method2675(class133 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if(class312.shouldDraw(var0, true)) {
         class312.copy$draw2DExtras(var0, var1, var2, var3, var4, var5, var6);
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1945490709"
   )
   public static int method2674(int var0) {
      return var0 >> 11 & 63;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;I)Ljava/lang/String;",
      garbageValue = "1639178141"
   )
   public static String method2613(Buffer var0) {
      String var1;
      try {
         int var2 = var0.readSmart();
         if(var2 > 32767) {
            var2 = 32767;
         }

         byte[] var3 = new byte[var2];
         var0.field1073 += class256.field2538.method2836(var0.field1074, var0.field1073, var3, 0, var2);
         String var4 = class192.method3297(var3, 0, var2);
         var1 = var4;
      } catch (Exception var6) {
         var1 = "Cabbage";
      }

      return var1;
   }
}
