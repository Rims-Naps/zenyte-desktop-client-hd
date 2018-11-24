package net.runelite.standalone;

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
public abstract class class217 implements RSIndexDataBase {
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1513495793
   )
   static int field2969;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Lfv;"
   )
   static class270 field2952;
   @ObfuscatedName("j")
   boolean field2967;
   @ObfuscatedName("z")
   Object[] field2963;
   @ObfuscatedName("p")
   int[] field2966;
   @ObfuscatedName("c")
   int[] field2958;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1961341997
   )
   int field2965;
   @ObfuscatedName("s")
   int[] field2959;
   @ObfuscatedName("r")
   int[][] field2955;
   @ObfuscatedName("m")
   int[][] field2961;
   @ObfuscatedName("b")
   boolean field2968;
   public boolean overlayOutdated;
   @ObfuscatedName("x")
   Object[][] field2964;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "[Lgc;"
   )
   class68[] field2962;
   @ObfuscatedName("a")
   int[] field2957;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 829165449
   )
   public int field2953;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lgc;"
   )
   class68 field2956;
   @ObfuscatedName("w")
   int[] field2954;

   static {
      field2952 = new class270();
      field2969 = 0;
   }

   class217(boolean var1, boolean var2) {
      this.field2967 = var1;
      this.field2968 = var2;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;I)Z",
      garbageValue = "1825696773"
   )
   public boolean method4417(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field2956.method1492(class205.method4047(var1));
      if(var3 < 0) {
         return false;
      } else {
         int var4 = this.field2962[var3].method1492(class205.method4047(var2));
         return var4 >= 0;
      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-208323389"
   )
   public void method4458(int var1) {
      for(int var2 = 0; var2 < this.field2964[var1].length; ++var2) {
         this.field2964[var1][var2] = null;
      }

   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)I",
      garbageValue = "-1929783439"
   )
   public int method4400(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.field2962[var1].method1492(class205.method4047(var2));
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)Z",
      garbageValue = "-1"
   )
   public boolean method4420(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field2956.method1492(class205.method4047(var1));
      return this.method4450(var2);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(III)[B",
      garbageValue = "1319994235"
   )
   public byte[] method4495(int var1, int var2) {
      if(var1 >= 0 && var1 < this.field2964.length && this.field2964[var1] != null && var2 >= 0 && var2 < this.field2964[var1].length) {
         if(this.field2964[var1][var2] == null) {
            boolean var3 = this.method4415(var1, (int[])null);
            if(!var3) {
               this.vmethod4430(var1);
               var3 = this.method4415(var1, (int[])null);
               if(!var3) {
                  return null;
               }
            }
         }

         byte[] var4 = class252.method5078(this.field2964[var1][var2], false);
         return var4;
      } else {
         return null;
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "-8"
   )
   public boolean method4450(int var1) {
      if(this.field2963[var1] != null) {
         return true;
      } else {
         this.vmethod4430(var1);
         return this.field2963[var1] != null;
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1422108582"
   )
   public void method4412() {
      for(int var1 = 0; var1 < this.field2963.length; ++var1) {
         this.field2963[var1] = null;
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1300706815"
   )
   public boolean method4401(int var1) {
      if(this.field2964.length == 1) {
         return this.method4468(0, var1);
      } else if(this.field2964[var1].length == 1) {
         return this.method4468(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)I",
      garbageValue = "1348807448"
   )
   public int method4413(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field2956.method1492(class205.method4047(var1));
      return this.vmethod4404(var2);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "545333176"
   )
   void vmethod4397(int var1) {
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II[IB)[B",
      garbageValue = "60"
   )
   public byte[] method4399(int var1, int var2, int[] var3) {
      if(var1 >= 0 && var1 < this.field2964.length && this.field2964[var1] != null && var2 >= 0 && var2 < this.field2964[var1].length) {
         if(this.field2964[var1][var2] == null) {
            boolean var4 = this.method4415(var1, var3);
            if(!var4) {
               this.vmethod4430(var1);
               var4 = this.method4415(var1, var3);
               if(!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = class252.method5078(this.field2964[var1][var2], false);
         if(this.field2968) {
            this.field2964[var1][var2] = null;
         }

         return var5;
      } else {
         return null;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "-567416343"
   )
   void method4396(byte[] var1) {
      int var3 = var1.length;
      int var2 = class36.method653(var1, 0, var3);
      this.field2953 = var2;
      class125 var4 = new class125(class84.method1618(var1));
      int var5 = var4.method2256();
      if(var5 >= 5 && var5 <= 7) {
         if(var5 >= 6) {
            var4.method2344();
         }

         int var6 = var4.method2256();
         if(var5 >= 7) {
            this.field2965 = var4.method2272();
         } else {
            this.field2965 = var4.method2258();
         }

         int var7 = 0;
         int var8 = -1;
         this.field2954 = new int[this.field2965];
         int var9;
         if(var5 >= 7) {
            for(var9 = 0; var9 < this.field2965; ++var9) {
               this.field2954[var9] = var7 += var4.method2272();
               if(this.field2954[var9] > var8) {
                  var8 = this.field2954[var9];
               }
            }
         } else {
            for(var9 = 0; var9 < this.field2965; ++var9) {
               this.field2954[var9] = var7 += var4.method2258();
               if(this.field2954[var9] > var8) {
                  var8 = this.field2954[var9];
               }
            }
         }

         this.field2957 = new int[var8 + 1];
         this.field2958 = new int[var8 + 1];
         this.field2966 = new int[var8 + 1];
         this.field2955 = new int[var8 + 1][];
         this.field2963 = new Object[var8 + 1];
         this.field2964 = new Object[var8 + 1][];
         if(var6 != 0) {
            this.field2959 = new int[var8 + 1];

            for(var9 = 0; var9 < this.field2965; ++var9) {
               this.field2959[this.field2954[var9]] = var4.method2344();
            }

            this.field2956 = new class68(this.field2959);
         }

         for(var9 = 0; var9 < this.field2965; ++var9) {
            this.field2957[this.field2954[var9]] = var4.method2344();
         }

         for(var9 = 0; var9 < this.field2965; ++var9) {
            this.field2958[this.field2954[var9]] = var4.method2344();
         }

         for(var9 = 0; var9 < this.field2965; ++var9) {
            this.field2966[this.field2954[var9]] = var4.method2258();
         }

         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         if(var5 >= 7) {
            for(var9 = 0; var9 < this.field2965; ++var9) {
               var10 = this.field2954[var9];
               var11 = this.field2966[var10];
               var7 = 0;
               var12 = -1;
               this.field2955[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.field2955[var10][var13] = var7 += var4.method2272();
                  if(var14 > var12) {
                     var12 = var14;
                  }
               }

               this.field2964[var10] = new Object[var12 + 1];
            }
         } else {
            for(var9 = 0; var9 < this.field2965; ++var9) {
               var10 = this.field2954[var9];
               var11 = this.field2966[var10];
               var7 = 0;
               var12 = -1;
               this.field2955[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.field2955[var10][var13] = var7 += var4.method2258();
                  if(var14 > var12) {
                     var12 = var14;
                  }
               }

               this.field2964[var10] = new Object[var12 + 1];
            }
         }

         if(var6 != 0) {
            this.field2961 = new int[var8 + 1][];
            this.field2962 = new class68[var8 + 1];

            for(var9 = 0; var9 < this.field2965; ++var9) {
               var10 = this.field2954[var9];
               var11 = this.field2966[var10];
               this.field2961[var10] = new int[this.field2964[var10].length];

               for(var12 = 0; var12 < var11; ++var12) {
                  this.field2961[var10][this.field2955[var10][var12]] = var4.method2344();
               }

               this.field2962[var10] = new class68(this.field2961[var10]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "181902242"
   )
   public boolean method4403() {
      boolean var1 = true;

      for(int var2 = 0; var2 < this.field2954.length; ++var2) {
         int var3 = this.field2954[var2];
         if(this.field2963[var3] == null) {
            this.vmethod4430(var3);
            if(this.field2963[var3] == null) {
               var1 = false;
            }
         }
      }

      return var1;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-1614863185"
   )
   public int method4435(int var1) {
      return this.field2964[var1].length;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "0"
   )
   int vmethod4404(int var1) {
      return this.field2963[var1] != null?100:0;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(I[II)Z",
      garbageValue = "-1913660556"
   )
   boolean method4415(int var1, int[] var2) {
      if(this.field2963[var1] == null) {
         return false;
      } else {
         int var3 = this.field2966[var1];
         int[] var4 = this.field2955[var1];
         Object[] var5 = this.field2964[var1];
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
               var18 = class252.method5078(this.field2963[var1], true);
               class125 var8 = new class125(var18);
               var8.method2463(var2, 5, var8.field1694.length);
            } else {
               var18 = class252.method5078(this.field2963[var1], false);
            }

            byte[] var20 = class84.method1618(var18);
            if(this.field2967) {
               this.field2963[var1] = null;
            }

            if(var3 > 1) {
               int var9 = var20.length;
               --var9;
               int var10 = var20[var9] & 255;
               var9 -= var3 * var10 * 4;
               class125 var11 = new class125(var20);
               int[] var12 = new int[var3];
               var11.field1693 = var9;

               int var14;
               int var15;
               for(int var13 = 0; var13 < var10; ++var13) {
                  var14 = 0;

                  for(var15 = 0; var15 < var3; ++var15) {
                     var14 += var11.method2344();
                     var12[var15] += var14;
                  }
               }

               byte[][] var19 = new byte[var3][];

               for(var14 = 0; var14 < var3; ++var14) {
                  var19[var14] = new byte[var12[var14]];
                  var12[var14] = 0;
               }

               var11.field1693 = var9;
               var14 = 0;

               for(var15 = 0; var15 < var10; ++var15) {
                  int var16 = 0;

                  for(int var17 = 0; var17 < var3; ++var17) {
                     var16 += var11.method2344();
                     System.arraycopy(var20, var14, var19[var17], var12[var17], var16);
                     var12[var17] += var16;
                     var14 += var16;
                  }
               }

               for(var15 = 0; var15 < var3; ++var15) {
                  if(!this.field2968) {
                     var5[var4[var15]] = class118.method2132(var19[var15], false);
                  } else {
                     var5[var4[var15]] = var19[var15];
                  }
               }
            } else if(!this.field2968) {
               var5[var4[0]] = class118.method2132(var20, false);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   public byte[] copy$getConfigData(int var1, int var2, int var3) {
      return this.method4399(var1, var2, (int[])null);
   }

   public boolean isOverlayOutdated() {
      return this.overlayOutdated;
   }

   public byte[] getConfigData(int var1, int var2) {
      return this.method4398(var1, var2, 1035482844);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(II)[B",
      garbageValue = "-475458891"
   )
   public byte[] method4407(int var1) {
      if(this.field2964.length == 1) {
         return this.method4495(0, var1);
      } else if(this.field2964[var1].length == 1) {
         return this.method4495(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1205100077"
   )
   void vmethod4430(int var1) {
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)I",
      garbageValue = "-901257565"
   )
   public int method4421(String var1) {
      var1 = var1.toLowerCase();
      return this.field2956.method1492(class205.method4047(var1));
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;B)Z",
      garbageValue = "1"
   )
   public boolean method4419(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field2956.method1492(class205.method4047(var1));
      int var4 = this.field2962[var3].method1492(class205.method4047(var2));
      return this.method4468(var3, var4);
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(II)[B",
      garbageValue = "-1549282975"
   )
   public byte[] method4405(int var1) {
      if(this.field2964.length == 1) {
         return this.method4398(0, var1, -1062048703);
      } else if(this.field2964[var1].length == 1) {
         return this.method4398(var1, 0, -929869171);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "504092146"
   )
   public void method4477(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field2956.method1492(class205.method4047(var1));
      if(var2 >= 0) {
         this.vmethod4397(var2);
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "31"
   )
   public int method4411() {
      return this.field2964.length;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(II)[I",
      garbageValue = "-1958918395"
   )
   public int[] method4475(int var1) {
      return this.field2955[var1];
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1564969535"
   )
   public void method4414() {
      for(int var1 = 0; var1 < this.field2964.length; ++var1) {
         if(this.field2964[var1] != null) {
            for(int var2 = 0; var2 < this.field2964[var1].length; ++var2) {
               this.field2964[var1][var2] = null;
            }
         }
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "342627562"
   )
   public boolean method4468(int var1, int var2) {
      if(var1 >= 0 && var1 < this.field2964.length && this.field2964[var1] != null && var2 >= 0 && var2 < this.field2964[var1].length) {
         if(this.field2964[var1][var2] != null) {
            return true;
         } else if(this.field2963[var1] != null) {
            return true;
         } else {
            this.vmethod4430(var1);
            return this.field2963[var1] != null;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;I)[B",
      garbageValue = "231489877"
   )
   public byte[] method4418(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field2956.method1492(class205.method4047(var1));
      int var4 = this.field2962[var3].method1492(class205.method4047(var2));
      return this.method4398(var3, var4, -67742742);
   }

   @ObfuscatedName("w")
   public byte[] method4398(int var1, int var2, int var3) {
      byte[] var4 = this.copy$getConfigData(var1, var2, var3);
      RSIndexData var5 = (RSIndexData)this;
      if(!OverlayIndex.hasOverlay(var5.getIndex(), var1)) {
         return var4;
      } else {
         Logger var6 = class302.field3755.getLogger();
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

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1945490709"
   )
   public static int method4493(int var0) {
      return var0 >> 11 & 63;
   }

   @ObfuscatedName("gx")
   @ObfuscatedSignature(
      signature = "(Lbn;IIIIII)V"
   )
   static final void method4494(class99 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if(class111.shouldDraw(var0, true)) {
         class111.copy$draw2DExtras(var0, var1, var2, var3, var4, var5, var6);
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;I)Ljava/lang/String;",
      garbageValue = "1639178141"
   )
   public static String method4432(class125 var0) {
      String var1;
      try {
         int var2 = var0.method2270();
         if(var2 > 32767) {
            var2 = 32767;
         }

         byte[] var3 = new byte[var2];
         var0.field1693 += class155.field1905.method5059(var0.field1694, var0.field1693, var3, 0, var2);
         String var4 = class225.method4566(var3, 0, var2);
         var1 = var4;
      } catch (Exception var6) {
         var1 = "Cabbage";
      }

      return var1;
   }
}
