package net.runelite.client.standalone;

import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.DecorativeObject;
import net.runelite.api.GameObject;
import net.runelite.api.GroundObject;
import net.runelite.api.Item;
import net.runelite.api.ItemLayer;
import net.runelite.api.Node;
import net.runelite.api.Point;
import net.runelite.api.SceneTileModel;
import net.runelite.api.SceneTilePaint;
import net.runelite.api.Tile;
import net.runelite.api.WallObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.DecorativeObjectChanged;
import net.runelite.api.events.DecorativeObjectDespawned;
import net.runelite.api.events.DecorativeObjectSpawned;
import net.runelite.api.events.GameObjectChanged;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GroundObjectChanged;
import net.runelite.api.events.GroundObjectDespawned;
import net.runelite.api.events.GroundObjectSpawned;
import net.runelite.api.events.ItemDespawned;
import net.runelite.api.events.ItemSpawned;
import net.runelite.api.events.WallObjectChanged;
import net.runelite.api.events.WallObjectDespawned;
import net.runelite.api.events.WallObjectSpawned;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSCollisionData;
import net.runelite.rs.api.RSDeque;
import net.runelite.rs.api.RSGameObject;
import net.runelite.rs.api.RSItem;
import net.runelite.rs.api.RSItemLayer;
import net.runelite.rs.api.RSNode;
import net.runelite.rs.api.RSTile;

@ObfuscatedName("dx")
public final class class56 extends class76 implements RSTile {
   @ObfuscatedName("aj")
   static String field440;
   public static RSDeque[][][] lastGroundItems;
   public static GameObject lastGameObject;
   @ObfuscatedName("j")
   boolean field432;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 878557669
   )
   int field436;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -560969609
   )
   int field418;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1492287699
   )
   int field429;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Ldc;"
   )
   class204 field431;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "[Lef;"
   )
   class299[] field439;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 427300145
   )
   int field437;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Ldw;"
   )
   class195 field425;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Leo;"
   )
   class225 field424;
   @ObfuscatedName("u")
   boolean field434;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Leg;"
   )
   class12 field423;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Ldk;"
   )
   class18 field421;
   @ObfuscatedName("b")
   boolean field433;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -837555063
   )
   int field435;
   @ObfuscatedName("x")
   int[] field417;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 285954099
   )
   int field426;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 876124777
   )
   int field438;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1569297257
   )
   int field420;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Ldp;"
   )
   class245 field422;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1699075729
   )
   int field428;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1276897055
   )
   int field419;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Ldx;"
   )
   class56 field430;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 345956177
   )
   int field427;
   public WallObject previousWallObject;
   public DecorativeObject previousDecorativeObject;
   public GroundObject previousGroundObject;
   public GameObject[] previousGameObjects;

   static {
      lastGroundItems = new RSDeque[4][104][104];
   }

   class56(int var1, int var2, int var3) {
      this.field439 = new class299[5];
      this.gameObjectsChanged(-1);
      this.field417 = new int[5];
      this.field418 = 0;
      this.field420 = this.field436 = var1;
      this.field426 = var2;
      this.field419 = var3;
   }

   public int getPlane() {
      return this.field436;
   }

   public int getX() {
      return this.field426;
   }

   public ItemLayer getItemLayer() {
      return this.field431;
   }

   public WallObject getWallObject() {
      return this.field423;
   }

   public DecorativeObject getDecorativeObject() {
      return this.field424;
   }

   public GroundObject getGroundObject() {
      return this.field425;
   }

   public int getY() {
      return this.field419;
   }

   public void gameObjectsChanged(int var1) {
      if(var1 != -1) {
         if(this.previousGameObjects == null) {
            this.previousGameObjects = new GameObject[5];
         }

         GameObject var2 = this.previousGameObjects[var1];
         RSGameObject var3 = (RSGameObject)this.getGameObjects()[var1];
         GameObject var4 = lastGameObject;
         lastGameObject = var3;
         this.previousGameObjects[var1] = var3;
         if(var3 == null || !var3.equals(var4)) {
            if(var3 == null || !(var3.getRenderable() instanceof Actor)) {
               if(var3 == null && var2 != null) {
                  GameObjectDespawned var7 = new GameObjectDespawned();
                  var7.setTile(this);
                  var7.setGameObject(var2);
                  class113.field1064.getCallbacks().post(var7);
               } else if(var3 != null && var2 == null) {
                  GameObjectSpawned var6 = new GameObjectSpawned();
                  var6.setTile(this);
                  var6.setGameObject(var3);
                  class113.field1064.getCallbacks().post(var6);
               } else if(var3 != null && var2 != null) {
                  GameObjectChanged var5 = new GameObjectChanged();
                  var5.setTile(this);
                  var5.setPrevious(var2);
                  var5.setGameObject(var3);
                  class113.field1064.getCallbacks().post(var5);
               }
            }

         }
      }
   }

   public GameObject[] getGameObjects() {
      return this.field439;
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void wallObjectChanged(int var1) {
      WallObject var2 = this.previousWallObject;
      WallObject var3 = this.getWallObject();
      this.previousWallObject = var3;
      if(var3 == null && var2 != null) {
         WallObjectDespawned var6 = new WallObjectDespawned();
         var6.setTile(this);
         var6.setWallObject(var2);
         class113.field1064.getCallbacks().post(var6);
      } else if(var3 != null && var2 == null) {
         WallObjectSpawned var5 = new WallObjectSpawned();
         var5.setTile(this);
         var5.setWallObject(var3);
         class113.field1064.getCallbacks().post(var5);
      } else if(var3 != null && var2 != null) {
         WallObjectChanged var4 = new WallObjectChanged();
         var4.setTile(this);
         var4.setPrevious(var2);
         var4.setWallObject(var3);
         class113.field1064.getCallbacks().post(var4);
      }

   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void decorativeObjectChanged(int var1) {
      DecorativeObject var2 = this.previousDecorativeObject;
      DecorativeObject var3 = this.getDecorativeObject();
      this.previousDecorativeObject = var3;
      if(var3 == null && var2 != null) {
         DecorativeObjectDespawned var6 = new DecorativeObjectDespawned();
         var6.setTile(this);
         var6.setDecorativeObject(var2);
         class113.field1064.getCallbacks().post(var6);
      } else if(var3 != null && var2 == null) {
         DecorativeObjectSpawned var5 = new DecorativeObjectSpawned();
         var5.setTile(this);
         var5.setDecorativeObject(var3);
         class113.field1064.getCallbacks().post(var5);
      } else if(var3 != null && var2 != null) {
         DecorativeObjectChanged var4 = new DecorativeObjectChanged();
         var4.setTile(this);
         var4.setPrevious(var2);
         var4.setDecorativeObject(var3);
         class113.field1064.getCallbacks().post(var4);
      }

   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void groundObjectChanged(int var1) {
      GroundObject var2 = this.previousGroundObject;
      GroundObject var3 = this.getGroundObject();
      this.previousGroundObject = var3;
      if(var3 == null && var2 != null) {
         GroundObjectDespawned var6 = new GroundObjectDespawned();
         var6.setTile(this);
         var6.setGroundObject(var2);
         class113.field1064.getCallbacks().post(var6);
      } else if(var3 != null && var2 == null) {
         GroundObjectSpawned var5 = new GroundObjectSpawned();
         var5.setTile(this);
         var5.setGroundObject(var3);
         class113.field1064.getCallbacks().post(var5);
      } else if(var3 != null && var2 != null) {
         GroundObjectChanged var4 = new GroundObjectChanged();
         var4.setTile(this);
         var4.setPrevious(var2);
         var4.setGroundObject(var3);
         class113.field1064.getCallbacks().post(var4);
      }

   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void itemLayerChanged(int var1) {
      int var2 = this.getX();
      int var3 = this.getY();
      int var4 = class113.field1064.getPlane();
      RSDeque[][][] var5 = class113.field1064.getGroundItemDeque();
      RSDeque var6 = lastGroundItems[var4][var2][var3];
      RSDeque var7 = var5[var4][var2][var3];
      ItemDespawned var11;
      if(var6 != var7) {
         if(var6 != null) {
            RSNode var8 = var6.getHead();

            for(RSNode var9 = var8.getNext(); var9 != var8; var9 = var9.getNext()) {
               RSItem var10 = (RSItem)var9;
               var11 = new ItemDespawned(this, var10);
               class113.field1064.getCallbacks().post(var11);
            }
         }

         lastGroundItems[var4][var2][var3] = var7;
      }

      RSItem var18 = class113.field1064.getLastItemDespawn();
      if(var18 != null) {
         class113.field1064.setLastItemDespawn((RSItem)null);
      }

      RSItemLayer var19 = (RSItemLayer)this.getItemLayer();
      if(var19 == null) {
         if(var18 != null) {
            ItemDespawned var20 = new ItemDespawned(this, var18);
            class113.field1064.getCallbacks().post(var20);
         }

      } else if(var7 == null) {
         if(var18 != null) {
            var11 = new ItemDespawned(this, var18);
            class113.field1064.getCallbacks().post(var11);
         }

      } else {
         RSNode var21 = var7.getHead();
         Object var12 = null;
         RSNode var13 = var21.getPrevious();
         boolean var14 = false;
         if(var21 != var13) {
            RSItem var15 = (RSItem)var13;
            if(var2 != var15.getX() || var3 != var15.getY()) {
               var12 = var15;
            }
         }

         RSNode var22 = var21.getNext();
         RSItem var16;
         if(var12 == null && var21 != var22) {
            var16 = (RSItem)var22;
            if(var2 != var16.getX() || var3 != var16.getY()) {
               var12 = var16;
               var14 = true;
            }
         }

         if(var18 != null && var18 != var13 && var18 != var22) {
            ItemDespawned var23 = new ItemDespawned(this, var18);
            class113.field1064.getCallbacks().post(var23);
         }

         if(var12 != null) {
            do {
               var16 = (RSItem)var12;
               var16.setX(var2);
               var16.setY(var3);
               ItemSpawned var17 = new ItemSpawned(this, var16);
               class113.field1064.getCallbacks().post(var17);
               var12 = var14?((RSNode)var12).getNext():((RSNode)var12).getPrevious();
            } while(var12 != var21 && (((RSItem)var12).getX() != var2 || ((RSItem)var12).getY() != var3));

         }
      }
   }

   public Point getSceneLocation() {
      return new Point(this.getX(), this.getY());
   }

   public WorldPoint getWorldLocation() {
      return WorldPoint.fromScene(class113.field1064, this.getX(), this.getY(), this.getPlane());
   }

   public LocalPoint getLocalLocation() {
      return LocalPoint.fromScene(this.getX(), this.getY());
   }

   public boolean hasLineOfSightTo(Tile var1) {
      if(this.getPlane() != var1.getPlane()) {
         return false;
      } else {
         RSCollisionData[] var2 = class113.field1064.getCollisionMaps();
         int var3 = this.getPlane();
         int[][] var4 = var2[var3].getFlags();
         Point var5 = this.getSceneLocation();
         Point var6 = var1.getSceneLocation();
         if(var5.getX() == var6.getX() && var5.getY() == var6.getY()) {
            return true;
         } else {
            int var7 = var6.getX() - var5.getX();
            int var8 = var6.getY() - var5.getY();
            int var9 = Math.abs(var7);
            int var10 = Math.abs(var8);
            int var11 = 131072;
            int var12 = 131072;
            if(var7 < 0) {
               var11 |= 4096;
            } else {
               var11 |= 65536;
            }

            if(var8 < 0) {
               var12 |= 1024;
            } else {
               var12 |= 16384;
            }

            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            if(var9 > var10) {
               var13 = var5.getX();
               var14 = var5.getY() << 16;
               var15 = (var8 << 16) / var9;
               var14 += 32768;
               if(var8 < 0) {
                  --var14;
               }

               var16 = var7 < 0?-1:1;

               while(var13 != var6.getX()) {
                  var13 += var16;
                  var17 = var14 >>> 16;
                  if((var4[var13][var17] & var11) != 0) {
                     return false;
                  }

                  var14 += var15;
                  var18 = var14 >>> 16;
                  if(var18 != var17 && (var4[var13][var18] & var12) != 0) {
                     return false;
                  }
               }
            } else {
               var13 = var5.getY();
               var14 = var5.getX() << 16;
               var15 = (var7 << 16) / var10;
               var14 += 32768;
               if(var7 < 0) {
                  --var14;
               }

               var16 = var8 < 0?-1:1;

               while(var13 != var6.getY()) {
                  var13 += var16;
                  var17 = var14 >>> 16;
                  if((var4[var17][var13] & var12) != 0) {
                     return false;
                  }

                  var14 += var15;
                  var18 = var14 >>> 16;
                  if(var18 != var17 && (var4[var18][var13] & var11) != 0) {
                     return false;
                  }
               }
            }

            return true;
         }
      }
   }

   public List getGroundItems() {
      ItemLayer var1 = this.getItemLayer();
      if(var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();

         for(Object var3 = var1.getBottom(); var3 instanceof Item; var3 = ((Node)var3).getNext()) {
            var2.add((Item)var3);
         }

         return var2;
      }
   }

   public SceneTilePaint getSceneTilePaint() {
      return this.field421;
   }

   public SceneTileModel getSceneTileModel() {
      return this.field422;
   }

   @ObfuscatedName("kh")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZI)V",
      garbageValue = "2128938423"
   )
   static void method992(String var0, boolean var1) {
      var0 = var0.toLowerCase();
      short[] var2 = new short[16];
      int var3 = 0;

      for(int var4 = 0; var4 < class120.field1098; ++var4) {
         class120 var5 = class67.method1152(var4);
         if((!var1 || var5.field1144) && var5.field1129 == -1 && var5.field1119.toLowerCase().indexOf(var0) != -1) {
            if(var3 >= 250) {
               class138.field1371 = -1;
               class289.field3147 = null;
               return;
            }

            if(var3 >= var2.length) {
               short[] var6 = new short[var2.length * 2];

               for(int var7 = 0; var7 < var3; ++var7) {
                  var6[var7] = var2[var7];
               }

               var2 = var6;
            }

            var2[var3++] = (short)var4;
         }
      }

      class289.field3147 = var2;
      class45.field352 = 0;
      class138.field1371 = var3;
      String[] var8 = new String[class138.field1371];

      for(int var9 = 0; var9 < class138.field1371; ++var9) {
         var8[var9] = class67.method1152(var2[var9]).field1119;
      }

      class0.method8(var8, class289.field3147);
   }
}
