package net.runelite.client.standalone;

import net.runelite.api.HeadIcon;
import net.runelite.api.events.NpcActionChanged;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSNPCComposition;

@ObfuscatedName("ji")
public class class222 extends class193 implements RSNPCComposition {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   static class148 field2173;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class124 field2153;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class124 field2140;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1324071265
   )
   public int field2166;
   @ObfuscatedName("aw")
   public boolean field2171;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 976426429
   )
   public int field2172;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1444145985
   )
   public int field2151;
   @ObfuscatedName("n")
   short[] field2154;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1593037617
   )
   int field2169;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1494334745
   )
   public int field2147;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 2097582135
   )
   int field2162;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1779111437
   )
   public int field2160;
   @ObfuscatedName("h")
   public String[] field2158;
   @ObfuscatedName("r")
   int[] field2146;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -2009228473
   )
   int field2165;
   @ObfuscatedName("as")
   public boolean field2161;
   @ObfuscatedName("p")
   int[] field2145;
   @ObfuscatedName("u")
   short[] field2141;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -373332111
   )
   public int field2144;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 697346469
   )
   public int field2157;
   @ObfuscatedName("b")
   short[] field2139;
   @ObfuscatedName("t")
   short[] field2156;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -618790785
   )
   public int field2150;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -351450429
   )
   public int field2142;
   @ObfuscatedName("o")
   public boolean field2155;
   @ObfuscatedName("a")
   public String field2143;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1032266537
   )
   public int field2152;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1600770913
   )
   int field2167;
   @ObfuscatedName("aa")
   public boolean field2149;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -853285613
   )
   public int field2159;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1209459025
   )
   int field2170;
   @ObfuscatedName("y")
   public boolean field2163;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 2031845867
   )
   public int field2148;
   @ObfuscatedName("at")
   public int[] field2168;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "Lga;"
   )
   class46 field2174;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1387780823
   )
   int field2164;

   static {
      field2140 = new class124(64);
      field2153 = new class124(50);
   }

   class222() {
      this.field2143 = "null";
      this.field2144 = 1;
      this.field2147 = -1;
      this.field2148 = -1;
      this.field2160 = -1;
      this.field2150 = -1;
      this.field2151 = -1;
      this.field2152 = -1;
      this.field2172 = -1;
      this.field2158 = new String[5];
      this.actionsHook(-1);
      this.field2155 = true;
      this.field2159 = -1;
      this.field2167 = 128;
      this.field2162 = 128;
      this.field2163 = false;
      this.field2164 = 0;
      this.field2165 = 0;
      this.field2166 = -1;
      this.field2142 = 32;
      this.field2169 = -1;
      this.field2170 = -1;
      this.field2171 = true;
      this.field2149 = true;
      this.field2161 = false;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-167426075"
   )
   public boolean method3956() {
      if(this.field2168 == null) {
         return true;
      } else {
         int var1 = -1;
         if(this.field2169 != -1) {
            var1 = class52.method859(this.field2169);
         } else if(this.field2170 != -1) {
            var1 = class215.field2071[this.field2170];
         }

         return var1 >= 0 && var1 < this.field2168.length?this.field2168[var1] != -1:this.field2168[this.field2168.length - 1] != -1;
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;B)Ljava/lang/String;",
      garbageValue = "71"
   )
   public String method3972(int var1, String var2) {
      class46 var4 = this.field2174;
      String var3;
      if(var4 == null) {
         var3 = var2;
      } else {
         class97 var5 = (class97)var4.method792((long)var1);
         if(var5 == null) {
            var3 = var2;
         } else {
            var3 = (String)var5.field911;
         }
      }

      return var3;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)Lji;",
      garbageValue = "1076383655"
   )
   public final class222 method3970() {
      int var1 = -1;
      if(this.field2169 != -1) {
         var1 = class52.method859(this.field2169);
      } else if(this.field2170 != -1) {
         var1 = class215.field2071[this.field2170];
      }

      int var2;
      if(var1 >= 0 && var1 < this.field2168.length - 1) {
         var2 = this.field2168[var1];
      } else {
         var2 = this.field2168[this.field2168.length - 1];
      }

      return var2 != -1?class25.method361(var2):null;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)Ldb;",
      garbageValue = "-1027851279"
   )
   public final class218 method3980() {
      if(this.field2168 != null) {
         class222 var1 = this.method3970();
         return var1 == null?null:var1.method3980();
      } else if(this.field2146 == null) {
         return null;
      } else {
         boolean var5 = false;

         for(int var2 = 0; var2 < this.field2146.length; ++var2) {
            if(!class333.field3727.method2649(this.field2146[var2], 0)) {
               var5 = true;
            }
         }

         if(var5) {
            return null;
         } else {
            class218[] var6 = new class218[this.field2146.length];

            for(int var3 = 0; var3 < this.field2146.length; ++var3) {
               var6[var3] = class218.method3830(class333.field3727, this.field2146[var3], 0);
            }

            class218 var7;
            if(var6.length == 1) {
               var7 = var6[0];
            } else {
               var7 = new class218(var6, var6.length);
            }

            int var4;
            if(this.field2139 != null) {
               for(var4 = 0; var4 < this.field2139.length; ++var4) {
                  var7.method3842(this.field2139[var4], this.field2141[var4]);
               }
            }

            if(this.field2156 != null) {
               for(var4 = 0; var4 < this.field2156.length; ++var4) {
                  var7.method3843(this.field2156[var4], this.field2154[var4]);
               }
            }

            return var7;
         }
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Ljw;ILjw;II)Lds;",
      garbageValue = "306578551"
   )
   public final class200 method3951(class321 var1, int var2, class321 var3, int var4) {
      if(this.field2168 != null) {
         class222 var12 = this.method3970();
         return var12 == null?null:var12.method3951(var1, var2, var3, var4);
      } else {
         class200 var5 = (class200)field2153.method2268((long)this.field2157);
         if(var5 == null) {
            boolean var6 = false;

            for(int var7 = 0; var7 < this.field2145.length; ++var7) {
               if(!class333.field3727.method2649(this.field2145[var7], 0)) {
                  var6 = true;
               }
            }

            if(var6) {
               return null;
            }

            class218[] var8 = new class218[this.field2145.length];

            int var9;
            for(var9 = 0; var9 < this.field2145.length; ++var9) {
               var8[var9] = class218.method3830(class333.field3727, this.field2145[var9], 0);
            }

            class218 var11;
            if(var8.length == 1) {
               var11 = var8[0];
            } else {
               var11 = new class218(var8, var8.length);
            }

            if(this.field2139 != null) {
               for(var9 = 0; var9 < this.field2139.length; ++var9) {
                  var11.method3842(this.field2139[var9], this.field2141[var9]);
               }
            }

            if(this.field2156 != null) {
               for(var9 = 0; var9 < this.field2156.length; ++var9) {
                  var11.method3843(this.field2156[var9], this.field2154[var9]);
               }
            }

            var5 = var11.method3863(this.field2164 + 64, this.field2165 + 850, -30, -50, -30);
            field2153.method2275(var5, (long)this.field2157);
         }

         class200 var10;
         if(var1 != null && var3 != null) {
            var10 = var1.method5654(var5, var2, var3, var4, (short)18166);
         } else if(var1 != null) {
            var10 = var1.method5631(var5, var2, 1287963470);
         } else if(var3 != null) {
            var10 = var3.method5631(var5, var4, 2141668375);
         } else {
            var10 = var5.method3375(true);
         }

         if(this.field2167 != 128 || this.field2162 != 128) {
            var10.method3420(this.field2167, this.field2162, this.field2167);
         }

         return var10;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Lgm;IB)V",
      garbageValue = "6"
   )
   void method3950(Buffer var1, int var2) {
      int var3;
      int var4;
      if(var2 == 1) {
         var3 = var1.readUnsignedByte();
         this.field2145 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field2145[var4] = var1.readUnsignedShort();
         }
      } else if(var2 == 2) {
         this.field2143 = var1.readString();
      } else if(var2 == 12) {
         this.field2144 = var1.readUnsignedByte();
      } else if(var2 == 13) {
         this.field2147 = var1.readUnsignedShort();
      } else if(var2 == 14) {
         this.field2150 = var1.readUnsignedShort();
      } else if(var2 == 15) {
         this.field2148 = var1.readUnsignedShort();
      } else if(var2 == 16) {
         this.field2160 = var1.readUnsignedShort();
      } else if(var2 == 17) {
         this.field2150 = var1.readUnsignedShort();
         this.field2151 = var1.readUnsignedShort();
         this.field2152 = var1.readUnsignedShort();
         this.field2172 = var1.readUnsignedShort();
      } else if(var2 >= 30 && var2 < 35) {
         this.field2158[var2 - 30] = var1.readString();
         this.actionsHook(var2 - 30);
         if(this.field2158[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.field2158[var2 - 30] = null;
            this.actionsHook(var2 - 30);
         }
      } else if(var2 == 40) {
         var3 = var1.readUnsignedByte();
         this.field2139 = new short[var3];
         this.field2141 = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field2139[var4] = (short)var1.readUnsignedShort();
            this.field2141[var4] = (short)var1.readUnsignedShort();
         }
      } else if(var2 == 41) {
         var3 = var1.readUnsignedByte();
         this.field2156 = new short[var3];
         this.field2154 = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field2156[var4] = (short)var1.readUnsignedShort();
            this.field2154[var4] = (short)var1.readUnsignedShort();
         }
      } else if(var2 == 60) {
         var3 = var1.readUnsignedByte();
         this.field2146 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field2146[var4] = var1.readUnsignedShort();
         }
      } else if(var2 == 93) {
         this.field2155 = false;
      } else if(var2 == 95) {
         this.field2159 = var1.readUnsignedShort();
      } else if(var2 == 97) {
         this.field2167 = var1.readUnsignedShort();
      } else if(var2 == 98) {
         this.field2162 = var1.readUnsignedShort();
      } else if(var2 == 99) {
         this.field2163 = true;
      } else if(var2 == 100) {
         this.field2164 = var1.method1906();
      } else if(var2 == 101) {
         this.field2165 = var1.method1906() * 5;
      } else if(var2 == 102) {
         this.field2166 = var1.readUnsignedShort();
      } else if(var2 == 103) {
         this.field2142 = var1.readUnsignedShort();
      } else if(var2 != 106 && var2 != 118) {
         if(var2 == 107) {
            this.field2171 = false;
         } else if(var2 == 109) {
            this.field2149 = false;
         } else if(var2 == 111) {
            this.field2161 = true;
         } else if(var2 == 249) {
            this.field2174 = class286.method5037(var1, this.field2174);
         }
      } else {
         this.field2169 = var1.readUnsignedShort();
         if(this.field2169 == 65535) {
            this.field2169 = -1;
         }

         this.field2170 = var1.readUnsignedShort();
         if(this.field2170 == 65535) {
            this.field2170 = -1;
         }

         var3 = -1;
         if(var2 == 118) {
            var3 = var1.readUnsignedShort();
            if(var3 == 65535) {
               var3 = -1;
            }
         }

         var4 = var1.readUnsignedByte();
         this.field2168 = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.field2168[var5] = var1.readUnsignedShort();
            if(this.field2168[var5] == 65535) {
               this.field2168[var5] = -1;
            }
         }

         this.field2168[var4 + 1] = var3;
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgm;B)V",
      garbageValue = "-27"
   )
   void method3949(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method3950(var1, var2);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "83"
   )
   void method3948() {
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "988605697"
   )
   public int method3965(int var1, int var2) {
      return class263.method4819(this.field2174, var1, var2);
   }

   public int getRsOverheadIcon() {
      return this.field2166;
   }

   public void actionsHook(int var1) {
      NpcActionChanged var2 = new NpcActionChanged();
      var2.setNpcComposition(this);
      var2.setIdx(var1);
      class113.field1064.getCallbacks().post(var2);
   }

   public HeadIcon getOverheadIcon() {
      switch(this.getRsOverheadIcon()) {
      case 0:
         return HeadIcon.MELEE;
      case 1:
         return HeadIcon.RANGED;
      case 2:
         return HeadIcon.MAGIC;
      case 3:
      case 4:
      case 5:
      default:
         return null;
      case 6:
         return HeadIcon.RANGE_MAGE;
      }
   }

   public int getId() {
      return this.field2157;
   }

   public String getName() {
      return this.field2143;
   }

   public int getSize() {
      return this.field2144;
   }

   public int[] getModels() {
      return this.field2145;
   }

   public String[] getActions() {
      return this.field2158;
   }

   public boolean isMinimapVisable() {
      return this.field2155;
   }

   public int getCombatLevel() {
      return this.field2159;
   }

   public boolean isVisable() {
      return this.field2163;
   }

   public int[] getConfigs() {
      return this.field2168;
   }

   public boolean isClickable() {
      return this.field2149;
   }

   public RSNPCComposition transform() {
      return this.method3970();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIII)Llp;",
      garbageValue = "1365269897"
   )
   static class26 method3988(int var0, int var1, int var2) {
      class119 var3 = class261.field2890;
      long var4 = (long)(var2 << 16 | var0 << 8 | var1);
      return (class26)var3.method2133(var4);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgm;Ljava/lang/String;I)I",
      garbageValue = "1930788497"
   )
   public static int method3987(Buffer var0, String var1) {
      int var2 = var0.field1073;
      byte[] var3 = class251.method4509(var1);
      var0.method2098(var3.length);
      var0.field1073 += class256.field2538.method2839(var3, 0, var3.length, var0.field1074, var0.field1073);
      return var0.field1073 - var2;
   }
}
