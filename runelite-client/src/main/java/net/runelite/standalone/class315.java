package net.runelite.standalone;

import net.runelite.api.HeadIcon;
import net.runelite.api.events.NpcActionChanged;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSNPCComposition;

@ObfuscatedName("ji")
public class class315 extends class324 implements RSNPCComposition {
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class100 field3871;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   static class217 field3891;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class100 field3858;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1324071265
   )
   public int field3884;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 976426429
   )
   public int field3890;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1600770913
   )
   int field3885;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -2009228473
   )
   int field3883;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1593037617
   )
   int field3887;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1779111437
   )
   public int field3878;
   @ObfuscatedName("p")
   int[] field3863;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -853285613
   )
   public int field3877;
   @ObfuscatedName("aa")
   public boolean field3867;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -373332111
   )
   public int field3862;
   @ObfuscatedName("n")
   short[] field3872;
   @ObfuscatedName("aw")
   public boolean field3889;
   @ObfuscatedName("h")
   public String[] field3876;
    /**
     * For options mask
     */

    public String[] changedOptions = new String[5];
   @ObfuscatedName("r")
   int[] field3864;
   @ObfuscatedName("u")
   short[] field3859;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1494334745
   )
   public int field3865;
   @ObfuscatedName("y")
   public boolean field3881;
   @ObfuscatedName("b")
   short[] field3857;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -618790785
   )
   public int field3868;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1444145985
   )
   public int field3869;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1387780823
   )
   int field3882;
   @ObfuscatedName("at")
   public int[] field3886;
   @ObfuscatedName("as")
   public boolean field3879;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 2031845867
   )
   public int field3866;
   @ObfuscatedName("a")
   public String field3861;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1209459025
   )
   int field3888;
   @ObfuscatedName("o")
   public boolean field3873;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1032266537
   )
   public int field3870;
   @ObfuscatedName("t")
   short[] field3874;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 2097582135
   )
   int field3880;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "Lga;"
   )
   class235 field3892;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 697346469
   )
   public int field3875;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -351450429
   )
   public int field3860;

   static {
      field3858 = new class100(64);
      field3871 = new class100(50);
   }

   class315() {
      this.field3861 = "null";
      this.field3862 = 1;
      this.field3865 = -1;
      this.field3866 = -1;
      this.field3878 = -1;
      this.field3868 = -1;
      this.field3869 = -1;
      this.field3870 = -1;
      this.field3890 = -1;
      this.field3876 = new String[5];
      this.actionsHook(-1);
      this.field3873 = true;
      this.field3877 = -1;
      this.field3885 = 128;
      this.field3880 = 128;
      this.field3881 = false;
      this.field3882 = 0;
      this.field3883 = 0;
      this.field3884 = -1;
      this.field3860 = 32;
      this.field3887 = -1;
      this.field3888 = -1;
      this.field3889 = true;
      this.field3867 = true;
      this.field3879 = false;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;B)Ljava/lang/String;",
      garbageValue = "71"
   )
   public String method6173(int var1, String var2) {
      class235 var4 = this.field3892;
      String var3;
      if(var4 == null) {
         var3 = var2;
      } else {
         class196 var5 = (class196)var4.method4670((long)var1);
         if(var5 == null) {
            var3 = var2;
         } else {
            var3 = (String)var5.field2789;
         }
      }

      return var3;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)Ldb;",
      garbageValue = "-1027851279"
   )
   public final class34 method6181() {
      if(this.field3886 != null) {
         class315 var1 = this.method6171();
         return var1 == null?null:var1.method6181();
      } else if(this.field3864 == null) {
         return null;
      } else {
         boolean var5 = false;

         for(int var2 = 0; var2 < this.field3864.length; ++var2) {
            if(!class323.field3940.method4468(this.field3864[var2], 0)) {
               var5 = true;
            }
         }

         if(var5) {
            return null;
         } else {
            class34[] var6 = new class34[this.field3864.length];

            for(int var3 = 0; var3 < this.field3864.length; ++var3) {
               var6[var3] = class34.method540(class323.field3940, this.field3864[var3], 0);
            }

            class34 var7;
            if(var6.length == 1) {
               var7 = var6[0];
            } else {
               var7 = new class34(var6, var6.length);
            }

            int var4;
            if(this.field3857 != null) {
               for(var4 = 0; var4 < this.field3857.length; ++var4) {
                  var7.method552(this.field3857[var4], this.field3859[var4]);
               }
            }

            if(this.field3874 != null) {
               for(var4 = 0; var4 < this.field3874.length; ++var4) {
                  var7.method553(this.field3874[var4], this.field3872[var4]);
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
   public final class52 method6152(class312 var1, int var2, class312 var3, int var4) {
      if(this.field3886 != null) {
         class315 var12 = this.method6171();
         return var12 == null?null:var12.method6152(var1, var2, var3, var4);
      } else {
         class52 var5 = (class52)field3871.method1813((long)this.field3875);
         if(var5 == null) {
            boolean var6 = false;

            for(int var7 = 0; var7 < this.field3863.length; ++var7) {
               if(!class323.field3940.method4468(this.field3863[var7], 0)) {
                  var6 = true;
               }
            }

            if(var6) {
               return null;
            }

            class34[] var8 = new class34[this.field3863.length];

            int var9;
            for(var9 = 0; var9 < this.field3863.length; ++var9) {
               var8[var9] = class34.method540(class323.field3940, this.field3863[var9], 0);
            }

            class34 var11;
            if(var8.length == 1) {
               var11 = var8[0];
            } else {
               var11 = new class34(var8, var8.length);
            }

            if(this.field3857 != null) {
               for(var9 = 0; var9 < this.field3857.length; ++var9) {
                  var11.method552(this.field3857[var9], this.field3859[var9]);
               }
            }

            if(this.field3874 != null) {
               for(var9 = 0; var9 < this.field3874.length; ++var9) {
                  var11.method553(this.field3874[var9], this.field3872[var9]);
               }
            }

            var5 = var11.method573(this.field3882 + 64, this.field3883 + 850, -30, -50, -30);
            field3871.method1820(var5, (long)this.field3875);
         }

         class52 var10;
         if(var1 != null && var3 != null) {
            var10 = var1.method6121(var5, var2, var3, var4, (short)18166);
         } else if(var1 != null) {
            var10 = var1.method6098(var5, var2, 1287963470);
         } else if(var3 != null) {
            var10 = var3.method6098(var5, var4, 2141668375);
         } else {
            var10 = var5.method1127(true);
         }

         if(this.field3885 != 128 || this.field3880 != 128) {
            var10.method1172(this.field3885, this.field3880, this.field3885);
         }

         return var10;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgm;B)V",
      garbageValue = "-27"
   )
   void method6150(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method6151(var1, var2);
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)Lji;",
      garbageValue = "-128916498"
   )
   public final class315 method6171() {
      int var1 = -1;
      if(this.field3887 != -1) {
         var1 = class259.method5178(this.field3887);
      } else if(this.field3888 != -1) {
         var1 = class81.field898[this.field3888];
      }

      int var2;
      if(var1 >= 0 && var1 < this.field3886.length - 1) {
         var2 = this.field3886[var1];
      } else {
         var2 = this.field3886[this.field3886.length - 1];
      }

      return var2 != -1?class127.method2480(var2):null;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-167426075"
   )
   public boolean method6157() {
      if(this.field3886 == null) {
         return true;
      } else {
         int var1 = -1;
         if(this.field3887 != -1) {
            var1 = class259.method5178(this.field3887);
         } else if(this.field3888 != -1) {
            var1 = class81.field898[this.field3888];
         }

         return var1 >= 0 && var1 < this.field3886.length?this.field3886[var1] != -1:this.field3886[this.field3886.length - 1] != -1;
      }
   }

   public int getRsOverheadIcon() {
      return this.field3884;
   }

   public void actionsHook(int var1) {
      NpcActionChanged var2 = new NpcActionChanged();
      var2.setNpcComposition(this);
      var2.setIdx(var1);
      class302.field3755.getCallbacks().post(var2);
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
      return this.field3875;
   }

   public String getName() {
      return this.field3861;
   }

   public int getSize() {
      return this.field3862;
   }

   public int[] getModels() {
      return this.field3863;
   }

   public String[] getActions() {
      return this.field3876;
   }

   public boolean isMinimapVisable() {
      return this.field3873;
   }

   public int getCombatLevel() {
      return this.field3877;
   }

   public boolean isVisable() {
      return this.field3881;
   }

   public int[] getConfigs() {
      return this.field3886;
   }

   public boolean isClickable() {
      return this.field3867;
   }

   public RSNPCComposition transform() {
      return this.method6171();
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "988605697"
   )
   public int method6166(int var1, int var2) {
      return class177.method3681(this.field3892, var1, var2);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Lgm;IB)V",
      garbageValue = "6"
   )
   void method6151(Buffer var1, int var2) {
      int var3;
      int var4;
      if(var2 == 1) {
         var3 = var1.readUnsignedByte();
         this.field3863 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3863[var4] = var1.readShort();
         }
      } else if(var2 == 2) {
         this.field3861 = var1.readString();
      } else if(var2 == 12) {
         this.field3862 = var1.readUnsignedByte();
      } else if(var2 == 13) {
         this.field3865 = var1.readShort();
      } else if(var2 == 14) {
         this.field3868 = var1.readShort();
      } else if(var2 == 15) {
         this.field3866 = var1.readShort();
      } else if(var2 == 16) {
         this.field3878 = var1.readShort();
      } else if(var2 == 17) {
         this.field3868 = var1.readShort();
         this.field3869 = var1.readShort();
         this.field3870 = var1.readShort();
         this.field3890 = var1.readShort();
      } else if(var2 >= 30 && var2 < 35) {
         this.field3876[var2 - 30] = var1.readString();
         this.actionsHook(var2 - 30);
         if(this.field3876[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.field3876[var2 - 30] = null;
            this.actionsHook(var2 - 30);
         }
      } else if(var2 == 40) {
         var3 = var1.readUnsignedByte();
         this.field3857 = new short[var3];
         this.field3859 = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3857[var4] = (short)var1.readShort();
            this.field3859[var4] = (short)var1.readShort();
         }
      } else if(var2 == 41) {
         var3 = var1.readUnsignedByte();
         this.field3874 = new short[var3];
         this.field3872 = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3874[var4] = (short)var1.readShort();
            this.field3872[var4] = (short)var1.readShort();
         }
      } else if(var2 == 60) {
         var3 = var1.readUnsignedByte();
         this.field3864 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3864[var4] = var1.readShort();
         }
      } else if(var2 == 93) {
         this.field3873 = false;
      } else if(var2 == 95) {
         this.field3877 = var1.readShort();
      } else if(var2 == 97) {
         this.field3885 = var1.readShort();
      } else if(var2 == 98) {
         this.field3880 = var1.readShort();
      } else if(var2 == 99) {
         this.field3881 = true;
      } else if(var2 == 100) {
         this.field3882 = var1.method2257();
      } else if(var2 == 101) {
         this.field3883 = var1.method2257() * 5;
      } else if(var2 == 102) {
         this.field3884 = var1.readShort();
      } else if(var2 == 103) {
         this.field3860 = var1.readShort();
      } else if(var2 != 106 && var2 != 118) {
         if(var2 == 107) {
            this.field3889 = false;
         } else if(var2 == 109) {
            this.field3867 = false;
         } else if(var2 == 111) {
            this.field3879 = true;
         } else if(var2 == 249) {
            this.field3892 = class227.method4570(var1, this.field3892);
         }
      } else {
         this.field3887 = var1.readShort();
         if(this.field3887 == 65535) {
            this.field3887 = -1;
         }

         this.field3888 = var1.readShort();
         if(this.field3888 == 65535) {
            this.field3888 = -1;
         }

         var3 = -1;
         if(var2 == 118) {
            var3 = var1.readShort();
            if(var3 == 65535) {
               var3 = -1;
            }
         }

         var4 = var1.readUnsignedByte();
         this.field3886 = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.field3886[var5] = var1.readShort();
            if(this.field3886[var5] == 65535) {
               this.field3886[var5] = -1;
            }
         }

         this.field3886[var4 + 1] = var3;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "83"
   )
   void method6149() {
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgm;Ljava/lang/String;I)I",
      garbageValue = "1930788497"
   )
   public static int method6188(Buffer var0, String var1) {
      int var2 = var0.field1693;
      byte[] var3 = class329.method6325(var1);
      var0.method2449(var3.length);
      var0.field1693 += class155.field1905.method5062(var3, 0, var3.length, var0.field1694, var0.field1693);
      return var0.field1693 - var2;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIII)Llp;",
      garbageValue = "1365269897"
   )
   static SpritePixels method6189(int var0, int var1, int var2) {
      class204 var3 = WorldMapRegion.field527;
      long var4 = (long)(var2 << 16 | var0 << 8 | var1);
      return (SpritePixels)var3.method4028(var4);
   }
}
