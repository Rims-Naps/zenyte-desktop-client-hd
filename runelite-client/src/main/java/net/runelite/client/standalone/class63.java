package net.runelite.client.standalone;

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
public final class class63 extends class133 implements RSPlayer {
   @ObfuscatedName("sg")
   @ObfuscatedSignature(
      signature = "Lla;"
   )
   static class88 field587;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 623345189
   )
   int field581;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 532457385
   )
   int field590;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lka;"
   )
   class49 field577;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 2094977081
   )
   int field596;
   @ObfuscatedName("n")
   boolean field579;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1630265411
   )
   int field584;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lkg;"
   )
   class149 field591;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 73469129
   )
   int field586;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1478392897
   )
   int field595;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 985003807
   )
   int field583;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 661281363
   )
   int field602;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -615787089
   )
   int field597;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -336086241
   )
   int field592;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 18019069
   )
   int field582;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -845086725
   )
   int field603;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1624263701
   )
   int field593;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -540265619
   )
   int field594;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lho;"
   )
   class44 field576;
   @ObfuscatedName("o")
   boolean field575;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1541387549
   )
   int field578;
   @ObfuscatedName("a")
   String[] field588;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lds;"
   )
   class200 field589;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -2036198963
   )
   int field604;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1400386905
   )
   int field598;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1362326237
   )
   int field580;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "Lkg;"
   )
   class149 field600;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 72571007
   )
   int field585;
   @ObfuscatedName("av")
   boolean field601;

   class63() {
      this.field604 = -1;
      this.field578 = -1;
      this.field588 = new String[3];

      for(int var1 = 0; var1 < 3; ++var1) {
         this.field588[var1] = "";
      }

      this.field582 = 0;
      this.field597 = 0;
      this.field584 = 0;
      this.field585 = 0;
      this.field579 = false;
      this.field595 = 0;
      this.field575 = false;
      this.field591 = class149.field1427;
      this.field600 = class149.field1427;
      this.field601 = false;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "410478966"
   )
   final void method1082(Buffer var1) {
      var1.field1073 = 0;
      int var2 = var1.readUnsignedByte();
      this.field604 = var1.method1906();
      this.field578 = var1.method1906();
      int var3 = -1;
      this.field595 = 0;
      int[] var4 = new int[12];

      int var6;
      int var7;
      for(int var5 = 0; var5 < 12; ++var5) {
         var6 = var1.readUnsignedByte();
         if(var6 == 0) {
            var4[var5] = 0;
         } else {
            var7 = var1.readUnsignedByte();
            var4[var5] = var7 + (var6 << 8);
            if(var5 == 0 && var4[0] == 65535) {
               var3 = var1.readUnsignedShort();
               break;
            }

            if(var4[var5] >= 512) {
               int var8 = class67.method1152(var4[var5] - 512).field1115;
               if(var8 != 0) {
                  this.field595 = var8;
               }
            }
         }
      }

      int[] var9 = new int[5];

      for(var6 = 0; var6 < 5; ++var6) {
         var7 = var1.readUnsignedByte();
         if(var7 < 0 || var7 >= class44.field343[var6].length) {
            var7 = 0;
         }

         var9[var6] = var7;
      }

      super.field1276 = var1.readUnsignedShort();
      if(super.field1276 == 65535) {
         super.field1276 = -1;
      }

      super.field1314 = var1.readUnsignedShort();
      if(super.field1314 == 65535) {
         super.field1314 = -1;
      }

      super.field1309 = super.field1314;
      super.field1290 = var1.readUnsignedShort();
      if(super.field1290 == 65535) {
         super.field1290 = -1;
      }

      super.field1267 = var1.readUnsignedShort();
      if(super.field1267 == 65535) {
         super.field1267 = -1;
      }

      super.field1264 = var1.readUnsignedShort();
      if(super.field1264 == 65535) {
         super.field1264 = -1;
      }

      super.field1270 = var1.readUnsignedShort();
      if(super.field1270 == 65535) {
         super.field1270 = -1;
      }

      super.field1271 = var1.readUnsignedShort();
      if(super.field1271 == 65535) {
         super.field1271 = -1;
      }

      this.field577 = new class49(var1.readString(), class36.field277);
      this.method1107();
      this.method1092();
      if(this == class5.field43) {
         class302.field3232 = this.field577.method821();
      }

      this.field582 = var1.readUnsignedByte();
      this.field597 = var1.readUnsignedShort();
      this.field575 = var1.readUnsignedByte() == 1;
      if(client.field3734 == 0 && client.field3842 >= 2) {
         this.field575 = false;
      }

      if(this.field576 == null) {
         this.field576 = new class44();
      }

      this.field576.method776(var4, var9, var2 == 1, var3);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-68"
   )
   final boolean vmethod4190() {
      return this.field576 != null;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(S)Lds;"
   )
   protected final class200 vmethod5291(short var1) {
      if(!class113.field1064.isInterpolatePlayerAnimations()) {
         return (class200)this.copy$getModel(var1);
      } else {
         int var2 = this.getActionFrame();
         int var3 = this.getPoseFrame();
         int var4 = this.getSpotAnimFrame();

         class200 var5;
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

         return (class200)var5;
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "920570384"
   )
   void method1095(int var1, int var2) {
      super.field1279 = 0;
      super.field1318 = 0;
      super.field1307 = 0;
      super.field1288[0] = var1;
      super.field1315[0] = var2;
      int var3 = this.method1089();
      super.field1277 = super.field1288[0] * 128 + var3 * 64;
      super.field1259 = var3 * 64 + super.field1315[0] * 128;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1131689357"
   )
   int method1089() {
      return this.field576 != null && this.field576.field339 != -1?class25.method361(this.field576.field339).field2144:1;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-127"
   )
   void method1088() {
      this.field600 = class165.field1533 != null && class165.field1533.method3624(this.field577)?class149.field1426:class149.field1428;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1503992179"
   )
   void method1092() {
      this.field600 = class149.field1427;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "931949283"
   )
   boolean method1086() {
      if(this.field600 == class149.field1427) {
         this.method1088();
      }

      return this.field600 == class149.field1426;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIBB)V",
      garbageValue = "75"
   )
   final void method1128(int var1, int var2, byte var3) {
      if(super.field1279 < 9) {
         ++super.field1279;
      }

      for(int var4 = super.field1279; var4 > 0; --var4) {
         super.field1288[var4] = super.field1288[var4 - 1];
         super.field1315[var4] = super.field1315[var4 - 1];
         super.field1316[var4] = super.field1316[var4 - 1];
      }

      super.field1288[0] = var1;
      super.field1315[0] = var2;
      super.field1316[0] = var3;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1312043462"
   )
   boolean method1094() {
      if(this.field591 == class149.field1427) {
         this.method1085();
      }

      return this.field591 == class149.field1426;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   void method1085() {
      this.field591 = class295.field3180.method5825(this.field577)?class149.field1426:class149.field1428;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "284047858"
   )
   void method1107() {
      this.field591 = class149.field1427;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(IIBI)V",
      garbageValue = "27817211"
   )
   final void method1081(int var1, int var2, byte var3) {
      if(super.field1273 != -1 && class182.method3192(super.field1273).field3411 == 1) {
         super.field1273 = -1;
         this.animationChanged(-1);
      }

      super.field1301 = -1;
      if(var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if(super.field1288[0] >= 0 && super.field1288[0] < 104 && super.field1315[0] >= 0 && super.field1315[0] < 104) {
            if(var3 == 2) {
               class40.method661(this, var1, var2, (byte)2);
            }

            this.method1128(var1, var2, var3);
         } else {
            this.method1095(var1, var2);
         }
      } else {
         this.method1095(var1, var2);
      }

   }

   public RSName getRsName() {
      return this.field577;
   }

   public int getRsOverheadIcon() {
      return this.field578;
   }

   @ObfuscatedSignature(
      signature = "(S)Lds;"
   )
   public final class200 copy$getModel(short var1) {
      if(this.field576 == null) {
         return null;
      } else {
         class321 var2 = super.field1273 != -1 && super.field1294 == 0?class182.method3192(super.field1273):null;
         class321 var3 = super.field1265 == -1 || this.field579 || super.field1276 == super.field1265 && var2 != null?null:class182.method3192(super.field1265);
         class200 var4 = this.field576.method761(var2, super.field1292, var3, super.field1289);
         if(var4 == null) {
            return null;
         } else {
            var4.method3374();
            super.field1258 = var4.field3281;
            class200 var5;
            class200[] var6;
            if(!this.field579 && super.field1296 != -1 && super.field1297 != -1) {
               var5 = class38.method619(super.field1296).method1615(super.field1297);
               if(var5 != null) {
                  var5.method3405(0, -super.field1286, 0);
                  var6 = new class200[]{var4, var5};
                  var4 = new class200(var6, 2);
               }
            }

            if(!this.field579 && this.field589 != null) {
               if(client.field3744 >= this.field585) {
                  this.field589 = null;
               }

               if(client.field3744 >= this.field584 && client.field3744 < this.field585) {
                  var5 = this.field589;
                  var5.method3405(this.field586 - super.field1277, this.field594 - this.field583, this.field596 - super.field1259);
                  if(super.field1310 == 512) {
                     var5.method3427();
                     var5.method3427();
                     var5.method3427();
                  } else if(super.field1310 == 1024) {
                     var5.method3427();
                     var5.method3427();
                  } else if(super.field1310 == 1536) {
                     var5.method3427();
                  }

                  var6 = new class200[]{var4, var5};
                  var4 = new class200(var6, 2);
                  if(super.field1310 == 512) {
                     var5.method3427();
                  } else if(super.field1310 == 1024) {
                     var5.method3427();
                     var5.method3427();
                  } else if(super.field1310 == 1536) {
                     var5.method3427();
                     var5.method3427();
                     var5.method3427();
                  }

                  var5.method3405(super.field1277 - this.field586, this.field583 - this.field594, super.field1259 - this.field596);
               }
            }

            var4.field1901 = true;
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
            Point var12 = Perspective.localToCanvas(class113.field1064, new LocalPoint(var2 - var9.getX(), var3 - var9.getZ()), class113.field1064.getPlane(), -var9.getY());
            Point var13 = Perspective.localToCanvas(class113.field1064, new LocalPoint(var2 - var10.getX(), var3 - var10.getZ()), class113.field1064.getPlane(), -var10.getY());
            Point var14 = Perspective.localToCanvas(class113.field1064, new LocalPoint(var2 - var11.getX(), var3 - var11.getZ()), class113.field1064.getPlane(), -var11.getY());
            int[] var15 = new int[]{var12.getX(), var13.getX(), var14.getX()};
            int[] var16 = new int[]{var12.getY(), var13.getY(), var14.getY()};
            var6.add(new Polygon(var15, var16, 3));
         }

         return (Polygon[])var6.toArray(new Polygon[var6.size()]);
      }
   }

   public RSPlayerComposition getPlayerComposition() {
      return this.field576;
   }

   public int getCombatLevel() {
      return this.field582;
   }

   public int getTotalLevel() {
      return this.field597;
   }

   public int getTeam() {
      return this.field595;
   }

   public int getPlayerId() {
      return this.field598;
   }

   public boolean isFriend() {
      return this.method1094();
   }

   public boolean isClanMember() {
      return this.method1086();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1465772698"
   )
   static void method1109() {
      for(class282 var0 = (class282)class282.field3050.method5604(); var0 != null; var0 = (class282)class282.field3050.method5606()) {
         if(var0.field3052 != null) {
            var0.method5018();
         }
      }

   }

   @ObfuscatedName("ei")
   @ObfuscatedSignature(
      signature = "(IZZZI)Lim;",
      garbageValue = "-1565771343"
   )
   static class108 method1087(int var0, boolean var1, boolean var2, boolean var3) {
      class281 var4 = null;
      if(class323.field3454 != null) {
         var4 = new class281(var0, class323.field3454, class128.field1220[var0], 1000000);
      }

      return new class108(var4, class67.field619, var0, var1, var2, var3);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "([BIIB)Ljava/lang/String;",
      garbageValue = "-5"
   )
   public static String method1129(byte[] var0, int var1, int var2) {
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
}
