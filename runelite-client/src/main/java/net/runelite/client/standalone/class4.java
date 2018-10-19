package net.runelite.client.standalone;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
public class class4 extends class87 {
   @ObfuscatedName("v")
   HashSet field33;
   @ObfuscatedName("x")
   HashSet field30;
   @ObfuscatedName("g")
   List field29;

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      signature = "(Lgm;ZB)V",
      garbageValue = "13"
   )
   void method57(Buffer var1, boolean var2) {
      this.field29 = new LinkedList();
      int var3 = var1.readUnsignedShort();

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var1.method1942();
         class34 var6 = new class34(var1.readInt());
         boolean var7 = var1.readUnsignedByte() == 1;
         if(var2 || !var7) {
            this.field29.add(new class10(var5, var6));
         }
      }

   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      signature = "(Lgm;Lgm;Lgm;IZI)V",
      garbageValue = "-1795123622"
   )
   void method59(Buffer var1, Buffer var2, Buffer var3, int var4, boolean var5) {
      this.method1281(var1, var4);
      int var6 = var3.readUnsignedShort();
      this.field30 = new HashSet(var6);

      int var7;
      for(var7 = 0; var7 < var6; ++var7) {
         class319 var8 = new class319();

         try {
            var8.method5586(var2, var3);
         } catch (IllegalStateException var13) {
            continue;
         }

         this.field30.add(var8);
      }

      var7 = var3.readUnsignedShort();
      this.field33 = new HashSet(var7);

      for(int var11 = 0; var11 < var7; ++var11) {
         class268 var9 = new class268();

         try {
            var9.method4849(var2, var3);
         } catch (IllegalStateException var12) {
            continue;
         }

         this.field33.add(var9);
      }

      this.method57(var2, var5);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;IIB)V",
      garbageValue = "45"
   )
   public static void method66(String var0, String var1, int var2, int var3) throws IOException {
      class323.field3452 = var3;
      class135.field1346 = var2;

      try {
         class226.field2227 = System.getProperty("os.name");
      } catch (Exception var30) {
         class226.field2227 = "Unknown";
      }

      class279.field3019 = class226.field2227.toLowerCase();

      try {
         class135.field1333 = System.getProperty("user.home");
         if(class135.field1333 != null) {
            class135.field1333 = class135.field1333 + "/";
         }
      } catch (Exception var29) {
         ;
      }

      try {
         if(class279.field3019.startsWith("win")) {
            if(class135.field1333 == null) {
               class135.field1333 = System.getenv("USERPROFILE");
            }
         } else if(class135.field1333 == null) {
            class135.field1333 = System.getenv("HOME");
         }

         if(class135.field1333 != null) {
            class135.field1333 = class135.field1333 + "/";
         }
      } catch (Exception var28) {
         ;
      }

      if(class135.field1333 == null) {
         class135.field1333 = "~/";
      }

      class323.field3459 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class135.field1333, "/tmp/", ""};
      class328.field3527 = new String[]{".jagex_cache_" + class135.field1346, ".file_store_" + class135.field1346};
      int var18 = 0;

      File var5;
      label283:
      while(var18 < 4) {
         String var6 = var18 == 0?"":"" + var18;
         class323.field3449 = new File(class135.field1333, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat");
         String var7 = null;
         String var8 = null;
         boolean var9 = false;
         File var38;
         if(class323.field3449.exists()) {
            try {
               class38 var10 = new class38(class323.field3449, "rw", 10000L);

               Buffer var11;
               int var12;
               for(var11 = new Buffer((int)var10.method600()); var11.field1073 < var11.field1074.length; var11.field1073 += var12) {
                  var12 = var10.method601(var11.field1074, var11.field1073, var11.field1074.length - var11.field1073);
                  if(var12 == -1) {
                     throw new IOException();
                  }
               }

               var11.field1073 = 0;
               var12 = var11.readUnsignedByte();
               if(var12 < 1 || var12 > 3) {
                  throw new IOException("" + var12);
               }

               int var13 = 0;
               if(var12 > 1) {
                  var13 = var11.readUnsignedByte();
               }

               if(var12 <= 2) {
                  var7 = var11.method1915();
                  if(var13 == 1) {
                     var8 = var11.method1915();
                  }
               } else {
                  var7 = var11.method1916();
                  if(var13 == 1) {
                     var8 = var11.method1916();
                  }
               }

               var10.method609();
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
               if(!class102.method1743(var38, true)) {
                  var7 = null;
               }
            }
         }

         if(var7 == null && var18 == 0) {
            label258:
            for(int var19 = 0; var19 < class328.field3527.length; ++var19) {
               for(int var20 = 0; var20 < class323.field3459.length; ++var20) {
                  File var21 = new File(class323.field3459[var20] + class328.field3527[var19] + File.separatorChar + var0 + File.separatorChar);
                  if(var21.exists() && class102.method1743(new File(var21, "test.dat"), true)) {
                     var7 = var21.toString();
                     var9 = true;
                     break label258;
                  }
               }
            }
         }

         if(var7 == null) {
            var7 = class135.field1333 + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
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
            class219.method3921(new File(var7), (File)null);
         }

         var5 = new File(var7);
         class323.field3453 = var5;
         if(!class323.field3453.exists()) {
            class323.field3453.mkdirs();
         }

         File[] var34 = class323.field3453.listFiles();
         if(var34 != null) {
            File[] var39 = var34;

            for(int var23 = 0; var23 < var39.length; ++var23) {
               File var24 = var39[var23];
               if(!class102.method1743(var24, false)) {
                  ++var18;
                  continue label283;
               }
            }
         }
         break;
      }

      File var4 = class323.field3453;
      class1.field6 = var4;
      if(!class1.field6.exists()) {
         throw new RuntimeException("");
      } else {
         class1.field8 = true;

         try {
            var5 = new File(class135.field1333, "random.dat");
            int var26;
            if(var5.exists()) {
               class323.field3456 = new class211(new class38(var5, "rw", 25L), 24, 0);
            } else {
               label209:
               for(int var25 = 0; var25 < class328.field3527.length; ++var25) {
                  for(var26 = 0; var26 < class323.field3459.length; ++var26) {
                     File var36 = new File(class323.field3459[var26] + class328.field3527[var25] + File.separatorChar + "random.dat");
                     if(var36.exists()) {
                        class323.field3456 = new class211(new class38(var36, "rw", 25L), 24, 0);
                        break label209;
                     }
                  }
               }
            }

            if(class323.field3456 == null) {
               RandomAccessFile var35 = new RandomAccessFile(var5, "rw");
               var26 = var35.read();
               var35.seek(0L);
               var35.write(var26);
               var35.seek(0L);
               var35.close();
               class323.field3456 = new class211(new class38(var5, "rw", 25L), 24, 0);
            }
         } catch (IOException var31) {
            ;
         }

         class323.field3454 = new class211(new class38(class230.method4119("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
         class323.field3458 = new class211(new class38(class230.method4119("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
         class128.field1220 = new class211[class323.field3452];

         for(int var27 = 0; var27 < class323.field3452; ++var27) {
            class128.field1220[var27] = new class211(new class38(class230.method4119("main_file_cache.idx" + var27), "rw", 1048576L), 6000, 0);
         }

      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "101"
   )
   static final void method67(String var0) {
      class279 var1 = class95.writeClientProt(ClientProt.ADD_IGNORE, client.field3963.field1162);
      var1.field3018.writeByte(class164.method2819(var0));
      var1.field3018.writeString(var0);
      client.field3963.method2235(var1);
   }
}
