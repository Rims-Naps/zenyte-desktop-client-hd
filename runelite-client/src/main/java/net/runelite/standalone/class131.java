package net.runelite.standalone;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
public class class131 extends WorldMapData {
   @ObfuscatedName("x")
   HashSet field1731;
   @ObfuscatedName("v")
   HashSet field1734;
   @ObfuscatedName("g")
   List field1730;

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      signature = "(Lgm;Lgm;Lgm;IZI)V",
      garbageValue = "-1795123622"
   )
   void initialize(Buffer var1, Buffer var2, Buffer var3, int var4, boolean var5) {
      this.loadMapData(var1, var4);//decode worldmap details (name, etc)
      int var6 = var3.readShort();
      this.field1731 = new HashSet(var6);

      int var7;
      for(var7 = 0; var7 < var6; ++var7) {
         class214 var8 = new class214();

         try {
            var8.method4368(var2, var3);//decode something
         } catch (IllegalStateException var13) {
            continue;
         }

         this.field1731.add(var8);
      }

      var7 = var3.readShort();
      this.field1734 = new HashSet(var7);

      for(int var11 = 0; var11 < var7; ++var11) {
         class108 var9 = new class108();

         try {
            var9.method1893(var2, var3);//decode something
         } catch (IllegalStateException var12) {
            continue;
         }

         this.field1734.add(var9);
      }

      this.method2512(var2, var5);
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      signature = "(Lgm;ZB)V",
      garbageValue = "13"
   )
   void method2512(Buffer var1, boolean var2) {
      this.field1730 = new LinkedList();
      int var3 = var1.readShort();

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var1.method2293();
         Location var6 = new Location(var1.readInt());
         boolean var7 = var1.readUnsignedByte() == 1;
         if(var2 || !var7) {
            this.field1730.add(new class184(var5, var6));
         }
      }

   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "101"
   )
   static final void method2522(String var0) {
      class12 var1 = class150.method2761(ClientProt.field3164, client.field2384.field1770);
      var1.field121.method2288(class118.method2136(var0));
      var1.field121.writeString(var0);
      client.field2384.method2573(var1);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;IIB)V",
      garbageValue = "45"
   )
   public static void method2521(String var0, String var1, int var2, int var3) throws IOException {
      class305.field3775 = var3;
      class96.field1054 = var2;

      try {
         class163.field1987 = System.getProperty("os.name");
      } catch (Exception var30) {
         class163.field1987 = "Unknown";
      }

      class12.field122 = class163.field1987.toLowerCase();

      try {
         class96.field1041 = System.getProperty("user.home");
         if(class96.field1041 != null) {
            class96.field1041 = class96.field1041 + "/";
         }
      } catch (Exception var29) {
         ;
      }

      try {
         if(class12.field122.startsWith("win")) {
            if(class96.field1041 == null) {
               class96.field1041 = System.getenv("USERPROFILE");
            }
         } else if(class96.field1041 == null) {
            class96.field1041 = System.getenv("HOME");
         }

         if(class96.field1041 != null) {
            class96.field1041 = class96.field1041 + "/";
         }
      } catch (Exception var28) {
         ;
      }

      if(class96.field1041 == null) {
         class96.field1041 = "~/";
      }

      class305.field3782 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class96.field1041, "/tmp/", ""};
      class159.field1953 = new String[]{".jagex_cache_" + class96.field1054, ".file_store_" + class96.field1054};
      int var18 = 0;

      File var5;
      label283:
      while(var18 < 4) {
         String var6 = var18 == 0?"":"" + var18;
         class305.field3772 = new File(class96.field1041, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat");
         String var7 = null;
         String var8 = null;
         boolean var9 = false;
         File var38;
         if(class305.field3772.exists()) {
            try {
               class283 var10 = new class283(class305.field3772, "rw", 10000L);

               Buffer var11;
               int var12;
               for(var11 = new Buffer((int)var10.method5445()); var11.field1693 < var11.field1694.length; var11.field1693 += var12) {
                  var12 = var10.method5446(var11.field1694, var11.field1693, var11.field1694.length - var11.field1693);
                  if(var12 == -1) {
                     throw new IOException();
                  }
               }

               var11.field1693 = 0;
               var12 = var11.readUnsignedByte();
               if(var12 < 1 || var12 > 3) {
                  throw new IOException("" + var12);
               }

               int var13 = 0;
               if(var12 > 1) {
                  var13 = var11.readUnsignedByte();
               }

               if(var12 <= 2) {
                  var7 = var11.method2266();
                  if(var13 == 1) {
                     var8 = var11.method2266();
                  }
               } else {
                  var7 = var11.method2267();
                  if(var13 == 1) {
                     var8 = var11.method2267();
                  }
               }

               var10.method5454();
            } catch (IOException var33) {
               var33.printStackTrace();
            }

            if(var7 != null) {
               var38 = new File(var7);
               if(!var38.exists()) {
                  var7 = null;
               }
            }

            if(var7 != null) {
               var38 = new File(var7, "test.dat");
               if(!class210.method4225(var38, true)) {
                  var7 = null;
               }
            }
         }

         if(var7 == null && var18 == 0) {
            label258:
            for(int var19 = 0; var19 < class159.field1953.length; ++var19) {
               for(int var20 = 0; var20 < class305.field3782.length; ++var20) {
                  File var21 = new File(class305.field3782[var20] + class159.field1953[var19] + File.separatorChar + var0 + File.separatorChar);
                  if(var21.exists() && class210.method4225(new File(var21, "test.dat"), true)) {
                     var7 = var21.toString();
                     var9 = true;
                     break label258;
                  }
               }
            }
         }

         if(var7 == null) {
            var7 = class96.field1041 + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
            var9 = true;
         }

         if(var8 != null) {
            File var37 = new File(var8);
            var38 = new File(var7);

            try {
               File[] var40 = var37.listFiles();
               File[] var22 = var40;

               for(int var14 = 0; var14 < var22.length; ++var14) {
                  File var15 = var22[var14];
                  File var16 = new File(var38, var15.getName());
                  boolean var17 = var15.renameTo(var16);
                  if(!var17) {
                     throw new IOException();
                  }
               }
            } catch (Exception var32) {
               var32.printStackTrace();
            }

            var9 = true;
         }

         if(var9) {
            class206.method4091(new File(var7), (File)null);
         }

         var5 = new File(var7);
         class305.field3776 = var5;
         if(!class305.field3776.exists()) {
            class305.field3776.mkdirs();
         }

         File[] var34 = class305.field3776.listFiles();
         if(var34 != null) {
            File[] var39 = var34;

            for(int var23 = 0; var23 < var39.length; ++var23) {
               File var24 = var39[var23];
               if(!class210.method4225(var24, false)) {
                  ++var18;
                  continue label283;
               }
            }
         }
         break;
      }

      File var4 = class305.field3776;
      class328.field3968 = var4;
      if(!class328.field3968.exists()) {
         throw new RuntimeException("");
      } else {
         class328.field3970 = true;

         try {
            var5 = new File(class96.field1041, "random.dat");
            int var26;
            if(var5.exists()) {
               class305.field3779 = new class18(new class283(var5, "rw", 25L), 24, 0);
            } else {
               label209:
               for(int var25 = 0; var25 < class159.field1953.length; ++var25) {
                  for(var26 = 0; var26 < class305.field3782.length; ++var26) {
                     File var36 = new File(class305.field3782[var26] + class159.field1953[var25] + File.separatorChar + "random.dat");
                     if(var36.exists()) {
                        class305.field3779 = new class18(new class283(var36, "rw", 25L), 24, 0);
                        break label209;
                     }
                  }
               }
            }

            if(class305.field3779 == null) {
               RandomAccessFile var35 = new RandomAccessFile(var5, "rw");
               var26 = var35.read();
               var35.seek(0L);
               var35.write(var26);
               var35.seek(0L);
               var35.close();
               class305.field3779 = new class18(new class283(var5, "rw", 25L), 24, 0);
            }
         } catch (IOException var31) {
            ;
         }

         class305.field3777 = new class18(new class283(class317.method6215("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
         class305.field3781 = new class18(new class283(class317.method6215("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
         class95.field1024 = new class18[class305.field3775];

         for(int var27 = 0; var27 < class305.field3775; ++var27) {
            class95.field1024[var27] = new class18(new class283(class317.method6215("main_file_cache.idx" + var27), "rw", 1048576L), 6000, 0);
         }

      }
   }
}
