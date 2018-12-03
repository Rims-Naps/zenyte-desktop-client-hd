package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFrames;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSSequence;

@ObfuscatedName("jw")
public class class312 extends class324 implements RSSequence {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class217 field3839;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class100 field3832;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class217 field3834;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class100 field3833;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class217 field3831;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1242202945
   )
   public int field3840;
   @ObfuscatedName("z")
   public boolean field3842;
   @ObfuscatedName("p")
   public int[] field3836;
   @ObfuscatedName("c")
   int[] field3835;
   @ObfuscatedName("r")
   public int[] field3837;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1844661999
   )
   public int field3829;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 58077279
   )
   public int field3838;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 830242843
   )
   public int field3845;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1268934879
   )
   public int field3841;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1382572151
   )
   public int field3847;
   @ObfuscatedName("d")
   int[] field3846;
   @ObfuscatedName("a")
   public int[] field3844;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 736194087
   )
   public int field3843;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 1476626261
   )
   public int field3830;

   static {
      field3832 = new class100(64);
      field3833 = new class100(100);
   }

   class312() {
      this.field3838 = -1;
      this.field3842 = false;
      this.field3841 = 5;
      this.field3847 = -1;
      this.field3843 = -1;
      this.field3840 = 99;
      this.field3845 = -1;
      this.field3829 = -1;
      this.field3830 = 2;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Lds;IB)Lds;"
   )
   class52 method6105(class52 var1, int var2, byte var3) {
      if(var2 < 0) {
         int var4 = var2 ^ Integer.MIN_VALUE;
         int var5 = var4 >> 16;
         var2 = var4 & 65535;
         int var6 = var2 + 1;
         if(var6 >= this.getFrameIDs().length) {
            var6 = -1;
         }

         int[] var7 = this.getFrameIDs();
         int var8 = var7[var2];
         RSFrames var9 = class302.field3755.getFrames(var8 >> 16);
         int var10 = var8 & 65535;
         int var11 = -1;
         RSFrames var12 = null;
         if(var6 != -1) {
            int var13 = var7[var6];
            var12 = class302.field3755.getFrames(var13 >> 16);
            var11 = var13 & 65535;
         }

         if(var9 == null) {
            return (class52)var1.toSharedSpotAnimModel(true);
         } else {
            RSModel var14 = var1.toSharedSpotAnimModel(!var9.getFrames()[var10].isShowing());
            var14.interpolateFrames(var9, var10, var12, var11, var5, this.getFrameLenths()[var2]);
            return (class52)var14;
         }
      } else {
         return (class52)this.copy$transformSpotAnimModel(var1, var2, var3);
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lds;III)Lds;"
   )
   class52 method6120(class52 var1, int var2, int var3, int var4) {
      if(var2 < 0) {
         int var5 = var2 ^ Integer.MIN_VALUE;
         int var6 = var5 >> 16;
         var2 = var5 & 65535;
         int var7 = var2 + 1;
         if(var7 >= this.getFrameIDs().length) {
            var7 = -1;
         }

         int[] var8 = this.getFrameIDs();
         int var9 = var8[var2];
         RSFrames var10 = class302.field3755.getFrames(var9 >> 16);
         int var11 = var9 & 65535;
         int var12 = -1;
         RSFrames var13 = null;
         if(var7 != -1) {
            int var14 = var8[var7];
            var13 = class302.field3755.getFrames(var14 >> 16);
            var12 = var14 & 65535;
         }

         if(var10 == null) {
            return (class52)var1.toSharedModel(true);
         } else {
            RSModel var15 = var1.toSharedModel(!var10.getFrames()[var11].isShowing());
            var3 &= 3;
            if(var3 == 1) {
               var15.rotateY270Ccw();
            } else if(var3 == 2) {
               var15.rotateY180Ccw();
            } else if(var3 == 3) {
               var15.rotateY90Ccw();
            }

            var15.interpolateFrames(var10, var11, var13, var12, var6, this.getFrameLenths()[var2]);
            if(var3 == 1) {
               var15.rotateY90Ccw();
            } else if(var3 == 2) {
               var15.rotateY180Ccw();
            } else if(var3 == 3) {
               var15.rotateY270Ccw();
            }

            return (class52)var15;
         }
      } else {
         return (class52)this.copy$transformObjectModel(var1, var2, var3, var4);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "-1166655253"
   )
   void method6096(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method6097(var1, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1012107845"
   )
   void method6104() {
      if(this.field3845 == -1) {
         if(this.field3846 != null) {
            this.field3845 = 2;
         } else {
            this.field3845 = 0;
         }
      }

      if(this.field3829 == -1) {
         if(this.field3846 != null) {
            this.field3829 = 2;
         } else {
            this.field3829 = 0;
         }
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Lds;ILjw;IS)Lds;"
   )
   public class52 method6121(class52 var1, int var2, class312 var3, int var4, short var5) {
      int var6;
      if(var2 < 0) {
         var6 = var2 ^ Integer.MIN_VALUE;
         var2 = var6 & 65535;
      }

      if(var4 < 0) {
         var6 = var4 ^ Integer.MIN_VALUE;
         var4 = var6 & 65535;
      }

      return (class52)this.copy$applyTransformations(var1, var2, var3, var4, var5);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lds;II)Lds;",
      garbageValue = "-2003020681"
   )
   public class52 method6102(class52 var1, int var2) {
      int var3 = this.field3844[var2];
      class202 var4 = class178.method3683(var3 >> 16);
      var3 &= 65535;
      if(var4 == null) {
         return var1.method1127(true);
      } else {
         class202 var5 = null;
         int var6 = 0;
         if(this.field3835 != null && var2 < this.field3835.length) {
            var6 = this.field3835[var2];
            var5 = class178.method3683(var6 >> 16);
            var6 &= 65535;
         }

         class52 var7;
         if(var5 != null && var6 != 65535) {
            var7 = var1.method1127(!var4.method4014(var3) & !var5.method4014(var6));
            var7.method1130(var4, var3);
            var7.method1130(var5, var6);
            return var7;
         } else {
            var7 = var1.method1127(!var4.method4014(var3));
            var7.method1130(var4, var3);
            return var7;
         }
      }
   }

   @ObfuscatedSignature(
      signature = "(Lds;III)Lds;"
   )
   public class52 copy$transformObjectModel(class52 var1, int var2, int var3, int var4) {
      var2 = this.field3844[var2];
      class202 var5 = class178.method3683(var2 >> 16);
      var2 &= 65535;
      if(var5 == null) {
         return var1.method1127(true);
      } else {
         class52 var6 = var1.method1127(!var5.method4014(var2));
         var3 &= 3;
         if(var3 == 1) {
            var6.method1135();
         } else if(var3 == 2) {
            var6.method1134();
         } else if(var3 == 3) {
            var6.method1179();
         }

         var6.method1130(var5, var2);
         if(var3 == 1) {
            var6.method1179();
         } else if(var3 == 2) {
            var6.method1134();
         } else if(var3 == 3) {
            var6.method1135();
         }

         return var6;
      }
   }

   @ObfuscatedSignature(
      signature = "(Lds;IB)Lds;"
   )
   public class52 copy$transformSpotAnimModel(class52 var1, int var2, byte var3) {
      var2 = this.field3844[var2];
      class202 var4 = class178.method3683(var2 >> 16);
      var2 &= 65535;
      if(var4 == null) {
         return var1.method1123(true);
      } else {
         class52 var5 = var1.method1123(!var4.method4014(var2));
         var5.method1130(var4, var2);
         return var5;
      }
   }

   @ObfuscatedSignature(
      signature = "(Lds;II)Lds;"
   )
   public class52 copy$transformActorModel(class52 var1, int var2, int var3) {
      var2 = this.field3844[var2];
      class202 var4 = class178.method3683(var2 >> 16);
      var2 &= 65535;
      if(var4 == null) {
         return var1.method1127(true);
      } else {
         class52 var5 = var1.method1127(!var4.method4014(var2));
         var5.method1130(var4, var2);
         return var5;
      }
   }

   @ObfuscatedSignature(
      signature = "(Lds;ILjw;IS)Lds;"
   )
   public class52 copy$applyTransformations(class52 var1, int var2, class312 var3, int var4, short var5) {
      var2 = this.field3844[var2];
      class202 var6 = class178.method3683(var2 >> 16);
      var2 &= 65535;
      if(var6 == null) {
         return var3.method6098(var1, var4, 928911062);
      } else {
         var4 = var3.field3844[var4];
         class202 var7 = class178.method3683(var4 >> 16);
         var4 &= 65535;
         class52 var8;
         if(var7 == null) {
            var8 = var1.method1127(!var6.method4014(var2));
            var8.method1130(var6, var2);
            return var8;
         } else {
            var8 = var1.method1127(!var6.method4014(var2) & !var7.method4014(var4));
            var8.method1131(var6, var2, var7, var4, this.field3846);
            return var8;
         }
      }
   }

   public int[] getFrameIDs() {
      return this.field3844;
   }

   public int[] getFrameLenths() {
      return this.field3836;
   }

   public int[] getInterleaveLeave() {
      return this.field3846;
   }

   public boolean getStretches() {
      return this.field3842;
   }

   public int getMaxLoops() {
      return this.field3840;
   }

   public int getPrecedenceAnimating() {
      return this.field3845;
   }

   public int getReplyMode() {
      return this.field3830;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Lds;II)Lds;"
   )
   public class52 method6098(class52 var1, int var2, int var3) {
      if(var2 < 0) {
         int var4 = var2 ^ Integer.MIN_VALUE;
         int var5 = var4 >> 16;
         var2 = var4 & 65535;
         int var6 = var2 + 1;
         if(var6 >= this.getFrameIDs().length) {
            var6 = -1;
         }

         int[] var7 = this.getFrameIDs();
         int var8 = var7[var2];
         RSFrames var9 = class302.field3755.getFrames(var8 >> 16);
         int var10 = var8 & 65535;
         int var11 = -1;
         RSFrames var12 = null;
         if(var6 != -1) {
            int var13 = var7[var6];
            var12 = class302.field3755.getFrames(var13 >> 16);
            var11 = var13 & 65535;
         }

         if(var9 == null) {
            return (class52)var1.toSharedModel(true);
         } else {
            RSModel var14 = var1.toSharedModel(!var9.getFrames()[var10].isShowing());
            var14.interpolateFrames(var9, var10, var12, var11, var5, this.getFrameLenths()[var2]);
            return (class52)var14;
         }
      } else {
         return (class52)this.copy$transformActorModel(var1, var2, var3);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "1619814780"
   )
   void method6097(Buffer var1, int var2) {
      int var3;
      int var4;
      if(var2 == 1) {
         var3 = var1.readShort();
         this.field3836 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3836[var4] = var1.readShort();
         }

         this.field3844 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3844[var4] = var1.readShort();
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3844[var4] += var1.readShort() << 16;
         }
      } else if(var2 == 2) {
         this.field3838 = var1.readShort();
      } else if(var2 == 3) {
         var3 = var1.readUnsignedByte();
         this.field3846 = new int[var3 + 1];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3846[var4] = var1.readUnsignedByte();
         }

         this.field3846[var3] = 9999999;
      } else if(var2 == 4) {
         this.field3842 = true;
      } else if(var2 == 5) {
         this.field3841 = var1.readUnsignedByte();
      } else if(var2 == 6) {
         this.field3847 = var1.readShort();
      } else if(var2 == 7) {
         this.field3843 = var1.readShort();
      } else if(var2 == 8) {
         this.field3840 = var1.readUnsignedByte();
      } else if(var2 == 9) {
         this.field3845 = var1.readUnsignedByte();
      } else if(var2 == 10) {
         this.field3829 = var1.readUnsignedByte();
      } else if(var2 == 11) {
         this.field3830 = var1.readUnsignedByte();
      } else if(var2 == 12) {
         var3 = var1.readUnsignedByte();
         this.field3835 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3835[var4] = var1.readShort();
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3835[var4] += var1.readShort() << 16;
         }
      } else if(var2 == 13) {
         var3 = var1.readUnsignedByte();
         this.field3837 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3837[var4] = var1.method2260();
         }
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(B)Lbu;",
      garbageValue = "0"
   )
   static class88 method6130() {
      return class88.field963 < class88.field944?class88.field947[++class88.field963 - 1]:null;
   }
}
