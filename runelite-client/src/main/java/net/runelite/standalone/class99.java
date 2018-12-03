package net.runelite.standalone;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.image.BufferedImage;
import net.runelite.api.Actor;
import net.runelite.api.Hitsplat;
import net.runelite.api.NPC;
import net.runelite.api.NPCComposition;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.Hitsplat.HitsplatType;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GraphicChanged;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.api.events.InteractingChanged;
import net.runelite.api.events.LocalPlayerDeath;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSActor;
import net.runelite.rs.api.RSCombatInfo1;
import net.runelite.rs.api.RSCombatInfo2;
import net.runelite.rs.api.RSCombatInfoList;
import net.runelite.rs.api.RSCombatInfoListHolder;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSNPC;
import net.runelite.rs.api.RSNode;
import net.runelite.rs.api.RSPlayer;

@ObfuscatedName("bn")
public abstract class class99 extends class102 implements RSActor {
   @ObfuscatedName("dj")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class6 field1132;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = 1063277653
   )
   int field1115;
   @ObfuscatedName("cv")
   @ObfuscatedGetter(
      intValue = -1352977729
   )
   int field1092;
   @ObfuscatedName("ci")
   @ObfuscatedGetter(
      intValue = -943540817
   )
   int field1113;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -178303379
   )
   int field1084;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = 352877695
   )
   int field1099;
   @ObfuscatedName("co")
   byte[] field1129;
   @ObfuscatedName("aq")
   boolean field1082;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1131039407
   )
   int field1073;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1853717925
   )
   int field1103;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = 1266723475
   )
   int field1108;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = 1752150415
   )
   int field1112;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = -1594415473
   )
   int field1130;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = -1427163441
   )
   int field1086;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = 1472899325
   )
   int field1107;
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = -1222454025
   )
   int field1125;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 937712625
   )
   int field1080;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = -709956735
   )
   int field1105;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 363822935
   )
   int field1076;
   @ObfuscatedName("bf")
   int[] field1091;
   @ObfuscatedName("cj")
   @ObfuscatedGetter(
      intValue = -1054816437
   )
   int field1123;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 34597031
   )
   int field1075;
   @ObfuscatedName("bo")
   int[] field1094;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = 1778164701
   )
   int field1120;
   @ObfuscatedName("cy")
   @ObfuscatedGetter(
      intValue = 681775971
   )
   int field1124;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = -1691884633
   )
   int field1109;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1066707515
   )
   int field1088;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = -916803587
   )
   int field1126;
   @ObfuscatedName("ak")
   int[] field1100;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = -2104663915
   )
   int field1118;
   @ObfuscatedName("be")
   int[] field1104;
   @ObfuscatedName("ay")
   byte field1106;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = 654411139
   )
   int field1110;
   @ObfuscatedName("cm")
   @ObfuscatedGetter(
      intValue = -1478198075
   )
   int field1071;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = -1086778649
   )
   int field1098;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = -1708403531
   )
   int field1102;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1795154637
   )
   int field1072;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1003460435
   )
   int field1089;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1760280365
   )
   int field1077;
   @ObfuscatedName("ab")
   String field1085;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = 2134323767
   )
   int field1116;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = -1234507945
   )
   int field1114;
   @ObfuscatedName("am")
   boolean field1074;
   @ObfuscatedName("bx")
   int[] field1095;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 1105673611
   )
   int field1122;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 893153133
   )
   int field1083;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = -705973881
   )
   int field1111;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = -1111949755
   )
   int field1131;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 2009608591
   )
   int field1078;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 481552619
   )
   int field1093;
   @ObfuscatedName("ba")
   boolean field1096;
   @ObfuscatedName("cu")
   @ObfuscatedGetter(
      intValue = -2004690889
   )
   int field1121;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = 948217365
   )
   int field1117;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1413474097
   )
   int field1127;
   @ObfuscatedName("cz")
   int[] field1101;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -897421831
   )
   int field1079;
   @ObfuscatedName("cf")
   @ObfuscatedGetter(
      intValue = -860617977
   )
   int field1119;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 1309349057
   )
   int field1090;
   @ObfuscatedName("au")
   boolean field1087;
   @ObfuscatedName("cc")
   int[] field1128;
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "Lgk;"
   )
   class41 field1097;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 291849969
   )
   int field1081;

   class99() {
      this.field1074 = false;
      this.field1075 = 1;
      this.field1089 = -1;
      this.field1127 = -1;
      this.field1122 = -1;
      this.field1103 = -1;
      this.field1080 = -1;
      this.field1077 = -1;
      this.field1083 = -1;
      this.field1084 = -1;
      this.field1085 = null;
      this.field1087 = false;
      this.field1081 = 100;
      this.field1079 = 0;
      this.field1088 = 0;
      this.field1106 = 0;
      this.field1100 = new int[4];
      this.field1104 = new int[4];
      this.field1094 = new int[4];
      this.field1095 = new int[4];
      this.field1091 = new int[4];
      this.field1097 = new class41();
      this.field1098 = -1;
      this.interactingChanged(-1);
      this.field1096 = false;
      this.field1114 = -1;
      this.field1078 = -1;
      this.field1102 = 0;
      this.field1093 = 0;
      this.field1086 = -1;
      this.animationChanged(-1);
      this.field1105 = 0;
      this.field1130 = 0;
      this.field1107 = 0;
      this.field1108 = 0;
      this.field1109 = -1;
      this.graphicChanged(-1);
      this.field1110 = 0;
      this.field1111 = 0;
      this.field1121 = 0;
      this.field1071 = 200;
      this.field1124 = 0;
      this.field1125 = 32;
      this.field1092 = 0;
      this.field1101 = new int[10];
      this.field1128 = new int[10];
      this.field1129 = new byte[10];
      this.field1120 = 0;
      this.field1131 = 0;
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "(IIIIIII)V",
      garbageValue = "484065628"
   )
   final void method1804(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.setCombatInfo(var1, var2, var3, var4, var5, var6);
      class244 var8 = (class244)class244.field3278.method1813((long)var1);
      class244 var7;
      if(var8 != null) {
         var7 = var8;
      } else {
         byte[] var9 = class244.field3280.method4398(33, var1, 444408472);
         var8 = new class244();
         if(var9 != null) {
            var8.method4941(new Buffer(var9));
         }

         class244.field3278.method1820(var8, (long)var1);
         var7 = var8;
      }

      var8 = var7;
      class48 var14 = null;
      class48 var10 = null;
      int var11 = var7.field3282;
      int var12 = 0;

      class48 var13;
      for(var13 = (class48)this.field1097.method745(); var13 != null; var13 = (class48)this.field1097.method747()) {
         ++var12;
         if(var13.field543.field3275 == var8.field3275) {
            var13.method1037(var2 + var4, var5, var6, var3);
            return;
         }

         if(var13.field543.field3284 <= var8.field3284) {
            var14 = var13;
         }

         if(var13.field543.field3282 > var11) {
            var10 = var13;
            var11 = var13.field543.field3282;
         }
      }

      if(var10 != null || var12 < 4) {
         var13 = new class48(var8);
         if(var14 == null) {
            this.field1097.method762(var13);
         } else {
            class41.method744(var13, var14);
         }

         var13.method1037(var2 + var4, var5, var6, var3);
         if(var12 >= 4) {
            var10.method3937();
         }

      }
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1754777280"
   )
   final void method1803() {
      this.field1092 = 0;
      this.field1131 = 0;
   }

   public void setCombatInfo(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var5 == 0) {
         if(this == class302.field3755.getLocalPlayer()) {
            class302.field3755.getLogger().debug("You died!");
            LocalPlayerDeath var7 = new LocalPlayerDeath();
            class302.field3755.getCallbacks().post(var7);
         } else if(this instanceof RSNPC) {
            ((RSNPC)this).setDead(true);
         }
      }

   }

   public RSCombatInfoList getCombatInfoList() {
      return this.field1097;
   }

   public int getRSInteracting() {
      return this.field1098;
   }

   public int getX() {
      return this.field1090;
   }

   public Actor getInteracting() {
      int var1 = this.getRSInteracting();
      if(var1 != -1 && var1 != 65535) {
         if(var1 < 32768) {
            RSNPC[] var3 = class302.field3755.getCachedNPCs();
            return var3[var1];
         } else {
            var1 -= 32768;
            RSPlayer[] var2 = class302.field3755.getCachedPlayers();
            return var2[var1];
         }
      } else {
         return null;
      }
   }

   public int[] getPathX() {
      return this.field1101;
   }

   public WorldPoint getWorldLocation() {
      return WorldPoint.fromLocal(class302.field3755, this.getPathX()[0] * 128 + 64, this.getPathY()[0] * 128 + 64, class302.field3755.getPlane());
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY());
   }

   public int getY() {
      return this.field1072;
   }

   public int getAnimation() {
      return this.field1086;
   }

   public int getActionFrame() {
      return this.field1105;
   }

   public void applyActorHitsplat(int var1, int var2, int var3, int var4, int var5, int var6) {
      Hitsplat var7 = new Hitsplat(HitsplatType.fromInteger(var1), var2, var5 + var6);
      HitsplatApplied var8 = new HitsplatApplied();
      var8.setActor(this);
      var8.setHitsplat(var7);
      class302.field3755.getCallbacks().post(var8);
   }

   public int[] getPathY() {
      return this.field1128;
   }

   public int getPoseFrame() {
      return this.field1102;
   }

   public int getOrientation() {
      return this.field1123;
   }

   public int getSpotAnimFrame() {
      return this.field1110;
   }

   public int getActionFrameCycle() {
      return this.field1130;
   }

   public void setActionFrame(int var1) {
      this.field1105 = var1;
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void animationChanged(int var1) {
      AnimationChanged var2 = new AnimationChanged();
      var2.setActor(this);
      class302.field3755.getCallbacks().post(var2);
   }

   public void setPoseFrame(int var1) {
      this.field1102 = var1;
   }

   public int getPoseFrameCycle() {
      return this.field1093;
   }

   public void setSpotAnimFrame(int var1) {
      this.field1110 = var1;
   }

   public int getSpotAnimFrameCycle() {
      return this.field1111;
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void interactingChanged(int var1) {
      InteractingChanged var2 = new InteractingChanged(this, this.getInteracting());
      class302.field3755.getCallbacks().post(var2);
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void graphicChanged(int var1) {
      GraphicChanged var2 = new GraphicChanged();
      var2.setActor(this);
      class302.field3755.getCallbacks().post(var2);
   }

   public int getHealthRatio() {
      RSCombatInfoList var1 = this.getCombatInfoList();
      if(var1 != null) {
         RSNode var2 = var1.getNode();
         RSNode var3 = var2.getNext();
         if(var3 instanceof RSCombatInfoListHolder) {
            RSCombatInfoListHolder var4 = (RSCombatInfoListHolder)var3;
            RSCombatInfoList var5 = var4.getCombatInfo1();
            RSNode var6 = var5.getNode();
            RSNode var7 = var6.getNext();
            if(var7 instanceof RSCombatInfo1) {
               RSCombatInfo1 var8 = (RSCombatInfo1)var7;
               return var8.getHealthRatio();
            }
         }
      }

      return -1;
   }

   public int getHealth() {
      RSCombatInfoList var1 = this.getCombatInfoList();
      if(var1 != null) {
         RSNode var2 = var1.getNode();
         RSNode var3 = var2.getNext();
         if(var3 instanceof RSCombatInfoListHolder) {
            RSCombatInfoListHolder var4 = (RSCombatInfoListHolder)var3;
            RSCombatInfo2 var5 = var4.getCombatInfo2();
            return var5.getHealthScale();
         }
      }

      return -1;
   }

   public Polygon getCanvasTilePoly() {
      return Perspective.getCanvasTilePoly(class302.field3755, this.getLocalLocation());
   }

   public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
      return Perspective.getCanvasTextLocation(class302.field3755, var1, this.getLocalLocation(), var2, var3);
   }

   public Point getCanvasImageLocation(BufferedImage var1, int var2) {
      return Perspective.getCanvasImageLocation(class302.field3755, this.getLocalLocation(), var1, var2);
   }

   public Point getCanvasSpriteLocation(net.runelite.api.SpritePixels var1, int var2) {
      return Perspective.getCanvasSpriteLocation(class302.field3755, this.getLocalLocation(), var1, var2);
   }

   public Point getMinimapLocation() {
      return Perspective.localToMinimap(class302.field3755, this.getLocalLocation());
   }

   public Polygon getConvexHull() {
      RSModel var1 = this.getModel();
      return var1 == null?null:var1.getConvexHull(this.getX(), this.getY(), this.getOrientation());
   }

   public WorldArea getWorldArea() {
      int var1 = 1;
      if(this instanceof NPC) {
         NPCComposition var2 = ((NPC)this).getComposition();
         if(var2 != null && var2.getConfigs() != null) {
            var2 = var2.transform();
         }

         if(var2 != null) {
            var1 = var2.getSize();
         }
      }

      return new WorldArea(this.getWorldLocation(), var1, var1);
   }

   public void setIdlePoseAnimation(int var1) {
      this.field1089 = var1;
   }

   public String getOverhead() {
      return this.field1085;
   }

   public int[] getHitsplatTypes() {
      return this.field1100;
   }

   public int[] getHitsplatValues() {
      return this.field1104;
   }

   public int[] getHitsplatCycles() {
      return this.field1094;
   }

   public void setPoseAnimation(int var1) {
      this.field1078 = var1;
   }

   public void setAnimation(int var1) {
      this.field1086 = var1;
   }

   public void setGraphic(int var1) {
      this.field1109 = var1;
   }

   public int getGraphic() {
      return this.field1109;
   }

   public int getLogicalHeight() {
      return this.field1071;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-68"
   )
   boolean vmethod3957() {
      return false;
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      signature = "(IIIIIIB)V",
      garbageValue = "-122"
   )
   final void method1794(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      boolean var8 = true;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
         if(this.field1094[var9] > var5) {
            var7 = false;
         } else {
            var8 = false;
         }
      }

      var9 = -1;
      int var10 = -1;
      int var11 = 0;
      if(var1 >= 0) {
         class224 var12 = class229.method4609(var1);
         var10 = var12.field3030;
         var11 = var12.field3021;
      }

      int var14;
      if(var8) {
         if(var10 == -1) {
            this.applyActorHitsplat(var1, var2, var3, var4, var5, var6);
            return;
         }

         var9 = 0;
         var14 = 0;
         if(var10 == 0) {
            var14 = this.field1094[0];
         } else if(var10 == 1) {
            var14 = this.field1104[0];
         }

         for(int var13 = 1; var13 < 4; ++var13) {
            if(var10 == 0) {
               if(this.field1094[var13] < var14) {
                  var9 = var13;
                  var14 = this.field1094[var13];
               }
            } else if(var10 == 1 && this.field1104[var13] < var14) {
               var9 = var13;
               var14 = this.field1104[var13];
            }
         }

         if(var10 == 1 && var14 >= var2) {
            this.applyActorHitsplat(var1, var2, var3, var4, var5, var6);
            return;
         }
      } else {
         if(var7) {
            this.field1106 = 0;
         }

         for(var14 = 0; var14 < 4; ++var14) {
            byte var15 = this.field1106;
            this.field1106 = (byte)((this.field1106 + 1) % 4);
            if(this.field1094[var15] <= var5) {
               var9 = var15;
               break;
            }
         }
      }

      if(var9 < 0) {
         this.applyActorHitsplat(var1, var2, var3, var4, var5, var6);
      } else {
         this.field1100[var9] = var1;
         this.field1104[var9] = var2;
         this.field1095[var9] = var3;
         this.field1091[var9] = var4;
         this.field1094[var9] = var5 + var11 + var6;
         this.applyActorHitsplat(var1, var2, var3, var4, var5, var6);
      }
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "79536373"
   )
   final void method1791(int var1) {
      class244 var2 = class91.method1713(var1);

      for(class48 var3 = (class48)this.field1097.method745(); var3 != null; var3 = (class48)this.field1097.method747()) {
         if(var2 == var3.field543) {
            var3.method3937();
            return;
         }
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lkn;Lkn;I)V",
      garbageValue = "1114161864"
   )
   static void method1796(class299 var0, class299 var1) {
      class6 var3;
      int var4;
      int var5;
      if(class193.field2750 == null) {
         var3 = class138.spritesIndex;
         var4 = var3.method4421("sl_back");
         var5 = var3.method4400(var4, "");
         SpritePixels[] var2 = class103.method1851(var3, var4, var5);
         class193.field2750 = var2;
      }

      class303[] var23;
      if(class23.field257 == null) {
         var3 = class138.spritesIndex;
         var4 = var3.method4421("sl_flags");
         var5 = var3.method4400(var4, "");
         var23 = class159.method2957(var3, var4, var5);
         class23.field257 = var23;
      }

      if(class89.field972 == null) {
         var3 = class138.spritesIndex;
         var4 = var3.method4421("sl_arrows");
         var5 = var3.method4400(var4, "");
         var23 = class159.method2957(var3, var4, var5);
         class89.field972 = var23;
      }

      if(class316.field3893 == null) {
         var3 = class138.spritesIndex;
         var4 = var3.method4421("sl_stars");
         var5 = var3.method4400(var4, "");
         var23 = class159.method2957(var3, var4, var5);
         class316.field3893 = var23;
      }

      class173.method3167(class39.field407, 23, 765, 480, 0);
      class173.method3142(class39.field407, 0, 125, 23, 12425273, 9135624);
      class173.method3142(class39.field407 + 125, 0, 640, 23, 5197647, 2697513);
      var0.method3879("Select a world", class39.field407 + 62, 15, 0, -1);
      if(class316.field3893 != null) {
         class316.field3893[1].method5980(class39.field407 + 140, 1);
         var1.method3832("Members only world", class39.field407 + 152, 10, 16777215, -1);
         class316.field3893[0].method5980(class39.field407 + 140, 12);
         var1.method3832("Free world", class39.field407 + 152, 21, 16777215, -1);
      }

      if(class89.field972 != null) {
         int var20 = class39.field407 + 280;
         if(class88.field951[0] == 0 && class88.field950[0] == 0) {
            class89.field972[2].method5980(var20, 4);
         } else {
            class89.field972[0].method5980(var20, 4);
         }

         if(class88.field951[0] == 0 && class88.field950[0] == 1) {
            class89.field972[3].method5980(var20 + 15, 4);
         } else {
            class89.field972[1].method5980(var20 + 15, 4);
         }

         var0.method3832("World", var20 + 32, 17, 16777215, -1);
         int var21 = class39.field407 + 390;
         if(class88.field951[0] == 1 && class88.field950[0] == 0) {
            class89.field972[2].method5980(var21, 4);
         } else {
            class89.field972[0].method5980(var21, 4);
         }

         if(class88.field951[0] == 1 && class88.field950[0] == 1) {
            class89.field972[3].method5980(var21 + 15, 4);
         } else {
            class89.field972[1].method5980(var21 + 15, 4);
         }

         var0.method3832("Players", var21 + 32, 17, 16777215, -1);
         var4 = class39.field407 + 500;
         if(class88.field951[0] == 2 && class88.field950[0] == 0) {
            class89.field972[2].method5980(var4, 4);
         } else {
            class89.field972[0].method5980(var4, 4);
         }

         if(class88.field951[0] == 2 && class88.field950[0] == 1) {
            class89.field972[3].method5980(var4 + 15, 4);
         } else {
            class89.field972[1].method5980(var4 + 15, 4);
         }

         var0.method3832("Location", var4 + 32, 17, 16777215, -1);
         var5 = class39.field407 + 610;
         if(class88.field951[0] == 3 && class88.field950[0] == 0) {
            class89.field972[2].method5980(var5, 4);
         } else {
            class89.field972[0].method5980(var5, 4);
         }

         if(class88.field951[0] == 3 && class88.field950[0] == 1) {
            class89.field972[3].method5980(var5 + 15, 4);
         } else {
            class89.field972[1].method5980(var5 + 15, 4);
         }

         var0.method3832("Type", var5 + 32, 17, 16777215, -1);
      }

      class173.method3167(class39.field407 + 708, 4, 50, 16, 0);
      var1.method3879("Cancel", class39.field407 + 708 + 25, 16, 16777215, -1);
      class39.field404 = -1;
      if(class193.field2750 != null) {
         byte var24 = 88;
         byte var25 = 19;
         var4 = 765 / (var24 + 1);
         var5 = 480 / (var25 + 1);

         int var6;
         int var7;
         do {
            var6 = var5;
            var7 = var4;
            if(var5 * (var4 - 1) >= class88.field944) {
               --var4;
            }

            if(var4 * (var5 - 1) >= class88.field944) {
               --var5;
            }

            if(var4 * (var5 - 1) >= class88.field944) {
               --var5;
            }
         } while(var5 != var6 || var7 != var4);

         var6 = (765 - var4 * var24) / (var4 + 1);
         if(var6 > 5) {
            var6 = 5;
         }

         var7 = (480 - var25 * var5) / (var5 + 1);
         if(var7 > 5) {
            var7 = 5;
         }

         int var8 = (765 - var4 * var24 - var6 * (var4 - 1)) / 2;
         int var9 = (480 - var25 * var5 - var7 * (var5 - 1)) / 2;
         int var10 = var9 + 23;
         int var11 = var8 + class39.field407;
         int var12 = 0;
         boolean var13 = false;

         int var14;
         for(var14 = 0; var14 < class88.field944; ++var14) {
            class88 var15 = class88.field947[var14];
            boolean var16 = true;
            String var17 = Integer.toString(var15.field952);
            if(var15.field952 == -1) {
               var17 = "OFF";
               var16 = false;
            } else if(var15.field952 > 1980) {
               var17 = "FULL";
               var16 = false;
            }

            int var19 = 0;
            byte var18;
            if(var15.method1641()) {
               if(var15.method1636()) {
                  var18 = 7;
               } else {
                  var18 = 6;
               }
            } else if(var15.method1640()) {
               var19 = 16711680;
               if(var15.method1636()) {
                  var18 = 5;
               } else {
                  var18 = 4;
               }
            } else if(var15.method1653()) {
               if(var15.method1636()) {
                  var18 = 3;
               } else {
                  var18 = 2;
               }
            } else if(var15.method1636()) {
               var18 = 1;
            } else {
               var18 = 0;
            }

            if(class163.field1975 >= var11 && class163.field1976 >= var10 && class163.field1975 < var24 + var11 && class163.field1976 < var25 + var10 && var16) {
               class39.field404 = var14;
               class193.field2750[var18].method287(var11, var10, 128, 16777215);
               var13 = true;
            } else {
               class193.field2750[var18].method213(var11, var10);
            }

            if(class23.field257 != null) {
               class23.field257[(var15.method1636()?8:0) + var15.field957].method5980(var11 + 29, var10);
            }

            var0.method3879(Integer.toString(var15.field958), var11 + 15, var25 / 2 + var10 + 5, var19, -1);
            var1.method3879(var17, var11 + 60, var25 / 2 + var10 + 5, 268435455, -1);
            var10 = var10 + var25 + var7;
            ++var12;
            if(var12 >= var5) {
               var10 = var9 + 23;
               var11 = var11 + var24 + var6;
               var12 = 0;
            }
         }

         if(var13) {
            var14 = var1.method3890(class88.field947[class39.field404].field956) + 6;
            int var22 = var1.field2718 + 8;
            class173.method3167(class163.field1975 - var14 / 2, class163.field1976 + 20 + 5, var14, var22, 16777120);
            class173.method3149(class163.field1975 - var14 / 2, class163.field1976 + 20 + 5, var14, var22, 0);
            var1.method3879(class88.field947[class39.field404].field956, class163.field1975, class163.field1976 + var1.field2718 + 20 + 5 + 4, 0, -1);
         }
      }

      class124.field1689.vmethod6366(0, 0);
   }
}
