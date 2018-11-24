package net.runelite.standalone;

import java.awt.Polygon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.HeadIcon;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.model.Triangle;
import net.runelite.api.model.Vertex;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSName;
import net.runelite.rs.api.RSPlayer;
import net.runelite.rs.api.RSPlayerComposition;

@ObfuscatedName("bw")
public final class class199 extends class99 implements RSPlayer {
   @ObfuscatedName("sg")
   @ObfuscatedSignature(
      signature = "Lla;"
   )
   static class287 field2812;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 623345189
   )
   int field2806;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 532457385
   )
   int field2815;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1400386905
   )
   int field2823;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 661281363
   )
   int field2827;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 73469129
   )
   int field2811;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -615787089
   )
   int field2822;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1362326237
   )
   int field2805;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 18019069
   )
   int field2807;
   @ObfuscatedName("n")
   boolean field2804;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lho;"
   )
   class327 field2801;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1541387549
   )
   int field2803;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lka;"
   )
   class158 field2802;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1478392897
   )
   int field2820;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 985003807
   )
   int field2808;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -336086241
   )
   int field2817;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1630265411
   )
   int field2809;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "Lkg;"
   )
   class75 field2825;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -845086725
   )
   int field2828;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -540265619
   )
   int field2819;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 2094977081
   )
   int field2821;
   @ObfuscatedName("av")
   boolean field2826;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 72571007
   )
   int field2810;
   @ObfuscatedName("a")
   String[] field2813;
   @ObfuscatedName("o")
   boolean field2800;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lds;"
   )
   class52 field2814;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1624263701
   )
   int field2818;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lkg;"
   )
   class75 field2816;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -2036198963
   )
   int field2829;

   class199() {
      this.field2829 = -1;
      this.field2803 = -1;
      this.field2813 = new String[3];

      for(int var1 = 0; var1 < 3; ++var1) {
         this.field2813[var1] = "";
      }

      this.field2807 = 0;
      this.field2822 = 0;
      this.field2809 = 0;
      this.field2810 = 0;
      this.field2804 = false;
      this.field2820 = 0;
      this.field2800 = false;
      this.field2816 = class75.field850;
      this.field2825 = class75.field850;
      this.field2826 = false;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "920570384"
   )
   void method3961(int var1, int var2) {
      super.field1092 = 0;
      super.field1131 = 0;
      super.field1120 = 0;
      super.field1101[0] = var1;
      super.field1128[0] = var2;
      int var3 = this.method3955();
      super.field1090 = super.field1101[0] * 128 + var3 * 64;
      super.field1072 = var3 * 64 + super.field1128[0] * 128;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-127"
   )
   void method3954() {
      this.field2825 = class250.field3328 != null && class250.field3328.method3030(this.field2802)?class75.field849:class75.field851;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1503992179"
   )
   void method3958() {
      this.field2825 = class75.field850;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-959674114"
   )
   boolean method3960() {
      if(this.field2816 == class75.field850) {
         this.method3951();
      }

      return this.field2816 == class75.field849;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   void method3951() {
      this.field2816 = class202.field2845.method2905(this.field2802)?class75.field849:class75.field851;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "410478966"
   )
   final void method3948(class125 var1) {
      var1.field1693 = 0;
      int var2 = var1.method2256();
      this.field2829 = var1.method2257();
      this.field2803 = var1.method2257();
      int var3 = -1;
      this.field2820 = 0;
      int[] var4 = new int[12];

      int var6;
      int var7;
      for(int var5 = 0; var5 < 12; ++var5) {
         var6 = var1.method2256();
         if(var6 == 0) {
            var4[var5] = 0;
         } else {
            var7 = var1.method2256();
            var4[var5] = var7 + (var6 << 8);
            if(var5 == 0 && var4[0] == 65535) {
               var3 = var1.method2258();
               break;
            }

            if(var4[var5] >= 512) {
               int var8 = class164.method3014(var4[var5] - 512).field442;
               if(var8 != 0) {
                  this.field2820 = var8;
               }
            }
         }
      }

      int[] var9 = new int[5];

      for(var6 = 0; var6 < 5; ++var6) {
         var7 = var1.method2256();
         if(var7 < 0 || var7 >= class327.field3963[var6].length) {
            var7 = 0;
         }

         var9[var6] = var7;
      }

      super.field1089 = var1.method2258();
      if(super.field1089 == 65535) {
         super.field1089 = -1;
      }

      super.field1127 = var1.method2258();
      if(super.field1127 == 65535) {
         super.field1127 = -1;
      }

      super.field1122 = super.field1127;
      super.field1103 = var1.method2258();
      if(super.field1103 == 65535) {
         super.field1103 = -1;
      }

      super.field1080 = var1.method2258();
      if(super.field1080 == 65535) {
         super.field1080 = -1;
      }

      super.field1077 = var1.method2258();
      if(super.field1077 == 65535) {
         super.field1077 = -1;
      }

      super.field1083 = var1.method2258();
      if(super.field1083 == 65535) {
         super.field1083 = -1;
      }

      super.field1084 = var1.method2258();
      if(super.field1084 == 65535) {
         super.field1084 = -1;
      }

      this.field2802 = new class158(var1.method2265(), class140.field1794);
      this.method3973();
      this.method3958();
      if(this == class32.field303) {
         class57.field706 = this.field2802.method2869();
      }

      this.field2807 = var1.method2256();
      this.field2822 = var1.method2258();
      this.field2800 = var1.method2256() == 1;
      if(client.field2155 == 0 && client.field2263 >= 2) {
         this.field2800 = false;
      }

      if(this.field2801 == null) {
         this.field2801 = new class327();
      }

      this.field2801.method6303(var4, var9, var2 == 1, var3);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1131689357"
   )
   int method3955() {
      return this.field2801 != null && this.field2801.field3959 != -1?class127.method2480(this.field2801.field3959).field3862:1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(S)Lds;"
   )
   protected final class52 vmethod6253(short var1) {
      if(!class302.field3755.isInterpolatePlayerAnimations()) {
         return (class52)this.copy$getModel(var1);
      } else {
         int var2 = this.getActionFrame();
         int var3 = this.getPoseFrame();
         int var4 = this.getSpotAnimFrame();

         class52 var5;
         try {
            this.setActionFrame(Integer.MIN_VALUE | this.getActionFrameCycle() << 16 | var2);
            this.setPoseFrame(Integer.MIN_VALUE | this.getPoseFrameCycle() << 16 | var3);
            this.setSpotAnimFrame(Integer.MIN_VALUE | this.getSpotAnimFrameCycle() << 16 | var4);
            var5 = this.copy$getModel(var1);
         } finally {
            this.setActionFrame(var2);
            this.setPoseFrame(var3);
            this.setSpotAnimFrame(var4);
         }

         return (class52)var5;
      }
   }

   public RSName getRsName() {
      return this.field2802;
   }

   public int getRsOverheadIcon() {
      return this.field2803;
   }

   @ObfuscatedSignature(
      signature = "(S)Lds;"
   )
   public final class52 copy$getModel(short var1) {
      if(this.field2801 == null) {
         return null;
      } else {
         class312 var2 = super.field1086 != -1 && super.field1107 == 0?class3.method74(super.field1086):null;
         class312 var3 = super.field1078 == -1 || this.field2804 || super.field1089 == super.field1078 && var2 != null?null:class3.method74(super.field1078);
         class52 var4 = this.field2801.method6288(var2, super.field1105, var3, super.field1102);
         if(var4 == null) {
            return null;
         } else {
            var4.method1126();
            super.field1071 = var4.field1143;
            class52 var5;
            class52[] var6;
            if(!this.field2804 && super.field1109 != -1 && super.field1110 != -1) {
               var5 = class283.method5464(super.field1109).method1529(super.field1110);
               if(var5 != null) {
                  var5.method1157(0, -super.field1099, 0);
                  var6 = new class52[]{var4, var5};
                  var4 = new class52(var6, 2);
               }
            }

            if(!this.field2804 && this.field2814 != null) {
               if(client.field2165 >= this.field2810) {
                  this.field2814 = null;
               }

               if(client.field2165 >= this.field2809 && client.field2165 < this.field2810) {
                  var5 = this.field2814;
                  var5.method1157(this.field2811 - super.field1090, this.field2819 - this.field2808, this.field2821 - super.field1072);
                  if(super.field1123 == 512) {
                     var5.method1179();
                     var5.method1179();
                     var5.method1179();
                  } else if(super.field1123 == 1024) {
                     var5.method1179();
                     var5.method1179();
                  } else if(super.field1123 == 1536) {
                     var5.method1179();
                  }

                  var6 = new class52[]{var4, var5};
                  var4 = new class52(var6, 2);
                  if(super.field1123 == 512) {
                     var5.method1179();
                  } else if(super.field1123 == 1024) {
                     var5.method1179();
                     var5.method1179();
                  } else if(super.field1123 == 1536) {
                     var5.method1179();
                     var5.method1179();
                     var5.method1179();
                  }

                  var5.method1157(super.field1090 - this.field2811, this.field2808 - this.field2819, super.field1072 - this.field2821);
               }
            }

            var4.field603 = true;
            return var4;
         }
      }
   }

   public List rotate(List var1, int var2) {
      ArrayList var3 = new ArrayList();
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         Triangle var5 = (Triangle)var4.next();
         Vertex var6 = var5.getA();
         Vertex var7 = var5.getB();
         Vertex var8 = var5.getC();
         Triangle var9 = new Triangle(var6.rotate(var2), var7.rotate(var2), var8.rotate(var2));
         var3.add(var9);
      }

      return var3;
   }

   public String getName() {
      RSName var1 = this.getRsName();
      if(var1 == null) {
         return null;
      } else {
         String var2 = var1.getName();
         return var2 == null?null:var2.replace(' ', ' ');
      }
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
         return HeadIcon.RETRIBUTION;
      case 4:
         return HeadIcon.SMITE;
      case 5:
         return HeadIcon.REDEMPTION;
      default:
         return null;
      }
   }

   public Polygon[] getPolygons() {
      RSModel var1 = this.getModel();
      if(var1 == null) {
         return null;
      } else {
         int var2 = this.getX();
         int var3 = this.getY();
         int var4 = this.getOrientation();
         List var5 = var1.getTriangles();
         var5 = this.rotate(var5, var4);
         ArrayList var6 = new ArrayList();
         Iterator var7 = var5.iterator();

         while(var7.hasNext()) {
            Triangle var8 = (Triangle)var7.next();
            Vertex var9 = var8.getA();
            Vertex var10 = var8.getB();
            Vertex var11 = var8.getC();
            Point var12 = Perspective.localToCanvas(class302.field3755, new LocalPoint(var2 - var9.getX(), var3 - var9.getZ()), class302.field3755.getPlane(), -var9.getY());
            Point var13 = Perspective.localToCanvas(class302.field3755, new LocalPoint(var2 - var10.getX(), var3 - var10.getZ()), class302.field3755.getPlane(), -var10.getY());
            Point var14 = Perspective.localToCanvas(class302.field3755, new LocalPoint(var2 - var11.getX(), var3 - var11.getZ()), class302.field3755.getPlane(), -var11.getY());
            int[] var15 = new int[]{var12.getX(), var13.getX(), var14.getX()};
            int[] var16 = new int[]{var12.getY(), var13.getY(), var14.getY()};
            var6.add(new Polygon(var15, var16, 3));
         }

         return (Polygon[])var6.toArray(new Polygon[var6.size()]);
      }
   }

   public RSPlayerComposition getPlayerComposition() {
      return this.field2801;
   }

   public int getCombatLevel() {
      return this.field2807;
   }

   public int getTotalLevel() {
      return this.field2822;
   }

   public int getTeam() {
      return this.field2820;
   }

   public int getPlayerId() {
      return this.field2823;
   }

   public boolean isFriend() {
      return this.method3960();
   }

   public boolean isClanMember() {
      return this.method3952();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIBB)V",
      garbageValue = "75"
   )
   final void method3994(int var1, int var2, byte var3) {
      if(super.field1092 < 9) {
         ++super.field1092;
      }

      for(int var4 = super.field1092; var4 > 0; --var4) {
         super.field1101[var4] = super.field1101[var4 - 1];
         super.field1128[var4] = super.field1128[var4 - 1];
         super.field1129[var4] = super.field1129[var4 - 1];
      }

      super.field1101[0] = var1;
      super.field1128[0] = var2;
      super.field1129[0] = var3;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-68"
   )
   final boolean vmethod3957() {
      return this.field2801 != null;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(IIBI)V",
      garbageValue = "27817211"
   )
   final void method3947(int var1, int var2, byte var3) {
      if(super.field1086 != -1 && class3.method74(super.field1086).field3829 == 1) {
         super.field1086 = -1;
         this.animationChanged(-1);
      }

      super.field1114 = -1;
      if(var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if(super.field1101[0] >= 0 && super.field1101[0] < 104 && super.field1128[0] >= 0 && super.field1128[0] < 104) {
            if(var3 == 2) {
               class293.method5739(this, var1, var2, (byte)2);
            }

            this.method3994(var1, var2, var3);
         } else {
            this.method3961(var1, var2);
         }
      } else {
         this.method3961(var1, var2);
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "931949283"
   )
   boolean method3952() {
      if(this.field2825 == class75.field850) {
         this.method3954();
      }

      return this.field2825 == class75.field849;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "284047858"
   )
   void method3973() {
      this.field2816 = class75.field850;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "([BIIB)Ljava/lang/String;",
      garbageValue = "-5"
   )
   public static String method3995(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;
      int var5 = var1;

      int var8;
      for(int var6 = var2 + var1; var5 < var6; var3[var4++] = (char)var8) {
         int var7 = var0[var5++] & 255;
         if(var7 < 128) {
            if(var7 == 0) {
               var8 = 65533;
            } else {
               var8 = var7;
            }
         } else if(var7 < 192) {
            var8 = 65533;
         } else if(var7 < 224) {
            if(var5 < var6 && (var0[var5] & 192) == 128) {
               var8 = (var7 & 31) << 6 | var0[var5++] & 63;
               if(var8 < 128) {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else if(var7 < 240) {
            if(var5 + 1 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128) {
               var8 = (var7 & 15) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
               if(var8 < 2048) {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else if(var7 < 248) {
            if(var5 + 2 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128 && (var0[var5 + 2] & 192) == 128) {
               var8 = (var7 & 7) << 18 | (var0[var5++] & 63) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
               if(var8 >= 65536 && var8 <= 1114111) {
                  var8 = 65533;
               } else {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else {
            var8 = 65533;
         }
      }

      return new String(var3, 0, var4);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1465772698"
   )
   static void method3975() {
      for(class186 var0 = (class186)class186.field2540.method1503(); var0 != null; var0 = (class186)class186.field2540.method1505()) {
         if(var0.field2542 != null) {
            var0.method3749();
         }
      }

   }

   @ObfuscatedName("ei")
   @ObfuscatedSignature(
      signature = "(IZZZI)Lim;",
      garbageValue = "-1565771343"
   )
   static class6 method3953(int var0, boolean var1, boolean var2, boolean var3) {
      class263 var4 = null;
      if(class305.field3777 != null) {
         var4 = new class263(var0, class305.field3777, class95.field1024[var0], 1000000);
      }

      return new class6(var4, class164.field1989, var0, var1, var2, var3);
   }
}
