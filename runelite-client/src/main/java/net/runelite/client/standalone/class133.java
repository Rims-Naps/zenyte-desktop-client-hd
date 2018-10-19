package net.runelite.client.standalone;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.image.BufferedImage;
import net.runelite.api.Actor;
import net.runelite.api.Hitsplat;
import net.runelite.api.NPC;
import net.runelite.api.NPCComposition;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.SpritePixels;
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
public abstract class class133 extends class308 implements RSActor {
   @ObfuscatedName("dj")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class108 field1319;
   @ObfuscatedName("cj")
   @ObfuscatedGetter(
      intValue = -1054816437
   )
   int field1310;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 34597031
   )
   int field1262;
   @ObfuscatedName("au")
   boolean field1274;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = -1086778649
   )
   int field1285;
   @ObfuscatedName("cy")
   @ObfuscatedGetter(
      intValue = 681775971
   )
   int field1311;
   @ObfuscatedName("ay")
   byte field1293;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -178303379
   )
   int field1271;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1131039407
   )
   int field1260;
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "Lgk;"
   )
   class60 field1284;
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = -1222454025
   )
   int field1312;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = -705973881
   )
   int field1298;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 1105673611
   )
   int field1309;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = -1708403531
   )
   int field1289;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1003460435
   )
   int field1276;
   @ObfuscatedName("cf")
   @ObfuscatedGetter(
      intValue = -860617977
   )
   int field1306;
   @ObfuscatedName("be")
   int[] field1291;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = 1778164701
   )
   int field1307;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 2009608591
   )
   int field1265;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = 1472899325
   )
   int field1294;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = 1752150415
   )
   int field1299;
   @ObfuscatedName("aq")
   boolean field1269;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = -709956735
   )
   int field1292;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 937712625
   )
   int field1267;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = 1063277653
   )
   int field1302;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = 948217365
   )
   int field1304;
   @ObfuscatedName("cm")
   @ObfuscatedGetter(
      intValue = -1478198075
   )
   int field1258;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 1309349057
   )
   int field1277;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1760280365
   )
   int field1264;
   @ObfuscatedName("ab")
   String field1272;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -897421831
   )
   int field1266;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = 352877695
   )
   int field1286;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 481552619
   )
   int field1280;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = 1266723475
   )
   int field1295;
   @ObfuscatedName("bo")
   int[] field1281;
   @ObfuscatedName("cu")
   @ObfuscatedGetter(
      intValue = -2004690889
   )
   int field1308;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1853717925
   )
   int field1290;
   @ObfuscatedName("co")
   byte[] field1316;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1066707515
   )
   int field1275;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = -2104663915
   )
   int field1305;
   @ObfuscatedName("cc")
   int[] field1315;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = -916803587
   )
   int field1313;
   @ObfuscatedName("cz")
   int[] field1288;
   @ObfuscatedName("ak")
   int[] field1287;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = -1594415473
   )
   int field1317;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 363822935
   )
   int field1263;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = -1427163441
   )
   int field1273;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 291849969
   )
   int field1268;
   @ObfuscatedName("ba")
   boolean field1283;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = -1111949755
   )
   int field1318;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = 654411139
   )
   int field1297;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = -1234507945
   )
   int field1301;
   @ObfuscatedName("bf")
   int[] field1278;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 893153133
   )
   int field1270;
   @ObfuscatedName("bx")
   int[] field1282;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = 2134323767
   )
   int field1303;
   @ObfuscatedName("am")
   boolean field1261;
   @ObfuscatedName("cv")
   @ObfuscatedGetter(
      intValue = -1352977729
   )
   int field1279;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1795154637
   )
   int field1259;
   @ObfuscatedName("ci")
   @ObfuscatedGetter(
      intValue = -943540817
   )
   int field1300;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1413474097
   )
   int field1314;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = -1691884633
   )
   int field1296;

   class133() {
      this.field1261 = false;
      this.field1262 = 1;
      this.field1276 = -1;
      this.field1314 = -1;
      this.field1309 = -1;
      this.field1290 = -1;
      this.field1267 = -1;
      this.field1264 = -1;
      this.field1270 = -1;
      this.field1271 = -1;
      this.field1272 = null;
      this.field1274 = false;
      this.field1268 = 100;
      this.field1266 = 0;
      this.field1275 = 0;
      this.field1293 = 0;
      this.field1287 = new int[4];
      this.field1291 = new int[4];
      this.field1281 = new int[4];
      this.field1282 = new int[4];
      this.field1278 = new int[4];
      this.field1284 = new class60();
      this.field1285 = -1;
      this.interactingChanged(-1);
      this.field1283 = false;
      this.field1301 = -1;
      this.field1265 = -1;
      this.field1289 = 0;
      this.field1280 = 0;
      this.field1273 = -1;
      this.animationChanged(-1);
      this.field1292 = 0;
      this.field1317 = 0;
      this.field1294 = 0;
      this.field1295 = 0;
      this.field1296 = -1;
      this.graphicChanged(-1);
      this.field1297 = 0;
      this.field1298 = 0;
      this.field1308 = 0;
      this.field1258 = 200;
      this.field1311 = 0;
      this.field1312 = 32;
      this.field1279 = 0;
      this.field1288 = new int[10];
      this.field1315 = new int[10];
      this.field1316 = new byte[10];
      this.field1307 = 0;
      this.field1318 = 0;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-68"
   )
   boolean vmethod4190() {
      return false;
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "79536373"
   )
   final void method2448(int var1) {
      class14 var2 = class225.method4020(var1);

      for(class189 var3 = (class189)this.field1284.method1051(); var3 != null; var3 = (class189)this.field1284.method1053()) {
         if(var2 == var3.field1805) {
            var3.method1186();
            return;
         }
      }

   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1754777280"
   )
   final void method2460() {
      this.field1279 = 0;
      this.field1318 = 0;
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "(IIIIIII)V",
      garbageValue = "484065628"
   )
   final void method2461(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.setCombatInfo(var1, var2, var3, var4, var5, var6);
      class14 var8 = (class14)class14.field123.method2268((long)var1);
      class14 var7;
      if(var8 != null) {
         var7 = var8;
      } else {
         byte[] var9 = class14.field125.method2579(33, var1, 444408472);
         var8 = new class14();
         if(var9 != null) {
            var8.method160(new Buffer(var9));
         }

         class14.field123.method2275(var8, (long)var1);
         var7 = var8;
      }

      var8 = var7;
      class189 var14 = null;
      class189 var10 = null;
      int var11 = var7.field127;
      int var12 = 0;

      class189 var13;
      for(var13 = (class189)this.field1284.method1051(); var13 != null; var13 = (class189)this.field1284.method1053()) {
         ++var12;
         if(var13.field1805.field120 == var8.field120) {
            var13.method3241(var2 + var4, var5, var6, var3);
            return;
         }

         if(var13.field1805.field129 <= var8.field129) {
            var14 = var13;
         }

         if(var13.field1805.field127 > var11) {
            var10 = var13;
            var11 = var13.field1805.field127;
         }
      }

      if(var10 != null || var12 < 4) {
         var13 = new class189(var8);
         if(var14 == null) {
            this.field1284.method1068(var13);
         } else {
            class60.method1050(var13, var14);
         }

         var13.method3241(var2 + var4, var5, var6, var3);
         if(var12 >= 4) {
            var10.method1186();
         }

      }
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      signature = "(IIIIIIB)V",
      garbageValue = "-122"
   )
   final void method2451(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      boolean var8 = true;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
         if(this.field1281[var9] > var5) {
            var7 = false;
         } else {
            var8 = false;
         }
      }

      var9 = -1;
      int var10 = -1;
      int var11 = 0;
      if(var1 >= 0) {
         class231 var12 = class296.method5157(var1);
         var10 = var12.field2274;
         var11 = var12.field2265;
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
            var14 = this.field1281[0];
         } else if(var10 == 1) {
            var14 = this.field1291[0];
         }

         for(int var13 = 1; var13 < 4; ++var13) {
            if(var10 == 0) {
               if(this.field1281[var13] < var14) {
                  var9 = var13;
                  var14 = this.field1281[var13];
               }
            } else if(var10 == 1 && this.field1291[var13] < var14) {
               var9 = var13;
               var14 = this.field1291[var13];
            }
         }

         if(var10 == 1 && var14 >= var2) {
            this.applyActorHitsplat(var1, var2, var3, var4, var5, var6);
            return;
         }
      } else {
         if(var7) {
            this.field1293 = 0;
         }

         for(var14 = 0; var14 < 4; ++var14) {
            byte var15 = this.field1293;
            this.field1293 = (byte)((this.field1293 + 1) % 4);
            if(this.field1281[var15] <= var5) {
               var9 = var15;
               break;
            }
         }
      }

      if(var9 < 0) {
         this.applyActorHitsplat(var1, var2, var3, var4, var5, var6);
      } else {
         this.field1287[var9] = var1;
         this.field1291[var9] = var2;
         this.field1282[var9] = var3;
         this.field1278[var9] = var4;
         this.field1281[var9] = var5 + var11 + var6;
         this.applyActorHitsplat(var1, var2, var3, var4, var5, var6);
      }
   }

   public void setCombatInfo(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var5 == 0) {
         if(this == class113.field1064.getLocalPlayer()) {
            class113.field1064.getLogger().debug("You died!");
            LocalPlayerDeath var7 = new LocalPlayerDeath();
            class113.field1064.getCallbacks().post(var7);
         } else if(this instanceof RSNPC) {
            ((RSNPC)this).setDead(true);
         }
      }

   }

   public RSCombatInfoList getCombatInfoList() {
      return this.field1284;
   }

   public int getRSInteracting() {
      return this.field1285;
   }

   public int getX() {
      return this.field1277;
   }

   public Actor getInteracting() {
      int var1 = this.getRSInteracting();
      if(var1 != -1 && var1 != 65535) {
         if(var1 < 32768) {
            RSNPC[] var3 = class113.field1064.getCachedNPCs();
            return var3[var1];
         } else {
            var1 -= 32768;
            RSPlayer[] var2 = class113.field1064.getCachedPlayers();
            return var2[var1];
         }
      } else {
         return null;
      }
   }

   public int[] getPathX() {
      return this.field1288;
   }

   public WorldPoint getWorldLocation() {
      return WorldPoint.fromLocal(class113.field1064, this.getPathX()[0] * 128 + 64, this.getPathY()[0] * 128 + 64, class113.field1064.getPlane());
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY());
   }

   public int getY() {
      return this.field1259;
   }

   public int getAnimation() {
      return this.field1273;
   }

   public int getActionFrame() {
      return this.field1292;
   }

   public void applyActorHitsplat(int var1, int var2, int var3, int var4, int var5, int var6) {
      Hitsplat var7 = new Hitsplat(HitsplatType.fromInteger(var1), var2, var5 + var6);
      HitsplatApplied var8 = new HitsplatApplied();
      var8.setActor(this);
      var8.setHitsplat(var7);
      class113.field1064.getCallbacks().post(var8);
   }

   public int[] getPathY() {
      return this.field1315;
   }

   public int getPoseFrame() {
      return this.field1289;
   }

   public int getOrientation() {
      return this.field1310;
   }

   public int getSpotAnimFrame() {
      return this.field1297;
   }

   public int getActionFrameCycle() {
      return this.field1317;
   }

   public void setActionFrame(int var1) {
      this.field1292 = var1;
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void animationChanged(int var1) {
      AnimationChanged var2 = new AnimationChanged();
      var2.setActor(this);
      class113.field1064.getCallbacks().post(var2);
   }

   public void setPoseFrame(int var1) {
      this.field1289 = var1;
   }

   public int getPoseFrameCycle() {
      return this.field1280;
   }

   public void setSpotAnimFrame(int var1) {
      this.field1297 = var1;
   }

   public int getSpotAnimFrameCycle() {
      return this.field1298;
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void interactingChanged(int var1) {
      InteractingChanged var2 = new InteractingChanged(this, this.getInteracting());
      class113.field1064.getCallbacks().post(var2);
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void graphicChanged(int var1) {
      GraphicChanged var2 = new GraphicChanged();
      var2.setActor(this);
      class113.field1064.getCallbacks().post(var2);
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
      return Perspective.getCanvasTilePoly(class113.field1064, this.getLocalLocation());
   }

   public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
      return Perspective.getCanvasTextLocation(class113.field1064, var1, this.getLocalLocation(), var2, var3);
   }

   public Point getCanvasImageLocation(BufferedImage var1, int var2) {
      return Perspective.getCanvasImageLocation(class113.field1064, this.getLocalLocation(), var1, var2);
   }

   public Point getCanvasSpriteLocation(SpritePixels var1, int var2) {
      return Perspective.getCanvasSpriteLocation(class113.field1064, this.getLocalLocation(), var1, var2);
   }

   public Point getMinimapLocation() {
      return Perspective.localToMinimap(class113.field1064, this.getLocalLocation());
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
      this.field1276 = var1;
   }

   public String getOverhead() {
      return this.field1272;
   }

   public int[] getHitsplatTypes() {
      return this.field1287;
   }

   public int[] getHitsplatValues() {
      return this.field1291;
   }

   public int[] getHitsplatCycles() {
      return this.field1281;
   }

   public void setPoseAnimation(int var1) {
      this.field1265 = var1;
   }

   public void setAnimation(int var1) {
      this.field1273 = var1;
   }

   public void setGraphic(int var1) {
      this.field1296 = var1;
   }

   public int getGraphic() {
      return this.field1296;
   }

   public int getLogicalHeight() {
      return this.field1258;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lkn;Lkn;I)V",
      garbageValue = "1114161864"
   )
   static void method2453(class277 var0, class277 var1) {
      class108 var3;
      int var4;
      int var5;
      if(class330.field3691 == null) {
         var3 = class170.field1577;
         var4 = var3.method2602("sl_back");
         var5 = var3.method2581(var4, "");
         class26[] var2 = class272.method4897(var3, var4, var5);
         class330.field3691 = var2;
      }

      class32[] var23;
      if(class2.field22 == null) {
         var3 = class170.field1577;
         var4 = var3.method2602("sl_flags");
         var5 = var3.method2581(var4, "");
         var23 = class328.method5877(var3, var4, var5);
         class2.field22 = var23;
      }

      if(class204.field1989 == null) {
         var3 = class170.field1577;
         var4 = var3.method2602("sl_arrows");
         var5 = var3.method2581(var4, "");
         var23 = class328.method5877(var3, var4, var5);
         class204.field1989 = var23;
      }

      if(class156.field1484 == null) {
         var3 = class170.field1577;
         var4 = var3.method2602("sl_stars");
         var5 = var3.method2581(var4, "");
         var23 = class328.method5877(var3, var4, var5);
         class156.field1484 = var23;
      }

      class89.method1561(class325.field3501, 23, 765, 480, 0);
      class89.method1536(class325.field3501, 0, 125, 23, 12425273, 9135624);
      class89.method1536(class325.field3501 + 125, 0, 640, 23, 5197647, 2697513);
      var0.method3590("Select a world", class325.field3501 + 62, 15, 0, -1);
      if(class156.field1484 != null) {
         class156.field1484[1].method530(class325.field3501 + 140, 1);
         var1.method3543("Members only world", class325.field3501 + 152, 10, 16777215, -1);
         class156.field1484[0].method530(class325.field3501 + 140, 12);
         var1.method3543("Free world", class325.field3501 + 152, 21, 16777215, -1);
      }

      if(class204.field1989 != null) {
         int var20 = class325.field3501 + 280;
         if(class126.field1191[0] == 0 && class126.field1190[0] == 0) {
            class204.field1989[2].method530(var20, 4);
         } else {
            class204.field1989[0].method530(var20, 4);
         }

         if(class126.field1191[0] == 0 && class126.field1190[0] == 1) {
            class204.field1989[3].method530(var20 + 15, 4);
         } else {
            class204.field1989[1].method530(var20 + 15, 4);
         }

         var0.method3543("World", var20 + 32, 17, 16777215, -1);
         int var21 = class325.field3501 + 390;
         if(class126.field1191[0] == 1 && class126.field1190[0] == 0) {
            class204.field1989[2].method530(var21, 4);
         } else {
            class204.field1989[0].method530(var21, 4);
         }

         if(class126.field1191[0] == 1 && class126.field1190[0] == 1) {
            class204.field1989[3].method530(var21 + 15, 4);
         } else {
            class204.field1989[1].method530(var21 + 15, 4);
         }

         var0.method3543("Players", var21 + 32, 17, 16777215, -1);
         var4 = class325.field3501 + 500;
         if(class126.field1191[0] == 2 && class126.field1190[0] == 0) {
            class204.field1989[2].method530(var4, 4);
         } else {
            class204.field1989[0].method530(var4, 4);
         }

         if(class126.field1191[0] == 2 && class126.field1190[0] == 1) {
            class204.field1989[3].method530(var4 + 15, 4);
         } else {
            class204.field1989[1].method530(var4 + 15, 4);
         }

         var0.method3543("Location", var4 + 32, 17, 16777215, -1);
         var5 = class325.field3501 + 610;
         if(class126.field1191[0] == 3 && class126.field1190[0] == 0) {
            class204.field1989[2].method530(var5, 4);
         } else {
            class204.field1989[0].method530(var5, 4);
         }

         if(class126.field1191[0] == 3 && class126.field1190[0] == 1) {
            class204.field1989[3].method530(var5 + 15, 4);
         } else {
            class204.field1989[1].method530(var5 + 15, 4);
         }

         var0.method3543("Type", var5 + 32, 17, 16777215, -1);
      }

      class89.method1561(class325.field3501 + 708, 4, 50, 16, 0);
      var1.method3590("Cancel", class325.field3501 + 708 + 25, 16, 16777215, -1);
      class325.field3498 = -1;
      if(class330.field3691 != null) {
         byte var24 = 88;
         byte var25 = 19;
         var4 = 765 / (var24 + 1);
         var5 = 480 / (var25 + 1);

         int var6;
         int var7;
         do {
            var6 = var5;
            var7 = var4;
            if(var5 * (var4 - 1) >= class126.field1184) {
               --var4;
            }

            if(var4 * (var5 - 1) >= class126.field1184) {
               --var5;
            }

            if(var4 * (var5 - 1) >= class126.field1184) {
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
         int var11 = var8 + class325.field3501;
         int var12 = 0;
         boolean var13 = false;

         int var14;
         for(var14 = 0; var14 < class126.field1184; ++var14) {
            class126 var15 = class126.field1187[var14];
            boolean var16 = true;
            String var17 = Integer.toString(var15.field1192);
            if(var15.field1192 == -1) {
               var17 = "OFF";
               var16 = false;
            } else if(var15.field1192 > 1980) {
               var17 = "FULL";
               var16 = false;
            }

            int var19 = 0;
            byte var18;
            if(var15.method2293()) {
               if(var15.method2288()) {
                  var18 = 7;
               } else {
                  var18 = 6;
               }
            } else if(var15.method2292()) {
               var19 = 16711680;
               if(var15.method2288()) {
                  var18 = 5;
               } else {
                  var18 = 4;
               }
            } else if(var15.method2305()) {
               if(var15.method2288()) {
                  var18 = 3;
               } else {
                  var18 = 2;
               }
            } else if(var15.method2288()) {
               var18 = 1;
            } else {
               var18 = 0;
            }

            if(class226.field2215 >= var11 && class226.field2216 >= var10 && class226.field2215 < var24 + var11 && class226.field2216 < var25 + var10 && var16) {
               class325.field3498 = var14;
               class330.field3691[var18].method450(var11, var10, 128, 16777215);
               var13 = true;
            } else {
               class330.field3691[var18].method376(var11, var10);
            }

            if(class2.field22 != null) {
               class2.field22[(var15.method2288()?8:0) + var15.field1197].method530(var11 + 29, var10);
            }

            var0.method3590(Integer.toString(var15.field1198), var11 + 15, var25 / 2 + var10 + 5, var19, -1);
            var1.method3590(var17, var11 + 60, var25 / 2 + var10 + 5, 268435455, -1);
            var10 = var10 + var25 + var7;
            ++var12;
            if(var12 >= var5) {
               var10 = var9 + 23;
               var11 = var11 + var24 + var6;
               var12 = 0;
            }
         }

         if(var13) {
            var14 = var1.method3601(class126.field1187[class325.field3498].field1196) + 6;
            int var22 = var1.field2015 + 8;
            class89.method1561(class226.field2215 - var14 / 2, class226.field2216 + 20 + 5, var14, var22, 16777120);
            class89.method1543(class226.field2215 - var14 / 2, class226.field2216 + 20 + 5, var14, var22, 0);
            var1.method3590(class126.field1187[class325.field3498].field1196, class226.field2215, class226.field2216 + var1.field2015 + 20 + 5 + 4, 0, -1);
         }
      }

      class146.field1404.vmethod4918(0, 0);
   }
}
