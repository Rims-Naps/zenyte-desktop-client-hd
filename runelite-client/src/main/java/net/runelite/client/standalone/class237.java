package net.runelite.client.standalone;

import net.runelite.api.NPCComposition;
import net.runelite.api.events.NpcDespawned;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSNPC;
import net.runelite.rs.api.RSNPCComposition;

@ObfuscatedName("bd")
public final class class237 extends class133 implements RSNPC {
   @ObfuscatedName("jw")
   @ObfuscatedSignature(
      signature = "Ldr;"
   )
   static class254 field2396;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lji;"
   )
   class222 field2400;
   public int npcIndex;
   public boolean dead;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IBI)V",
      garbageValue = "464573042"
   )
   final void method4187(int var1, byte var2) {
      int var3 = super.field1288[0];
      int var4 = super.field1315[0];
      if(var1 == 0) {
         --var3;
         ++var4;
      }

      if(var1 == 1) {
         ++var4;
      }

      if(var1 == 2) {
         ++var3;
         ++var4;
      }

      if(var1 == 3) {
         --var3;
      }

      if(var1 == 4) {
         ++var3;
      }

      if(var1 == 5) {
         --var3;
         --var4;
      }

      if(var1 == 6) {
         --var4;
      }

      if(var1 == 7) {
         ++var3;
         --var4;
      }

      if(super.field1273 != -1 && class182.method3192(super.field1273).field3411 == 1) {
         super.field1273 = -1;
         this.animationChanged(-1);
      }

      if(super.field1279 < 9) {
         ++super.field1279;
      }

      for(int var5 = super.field1279; var5 > 0; --var5) {
         super.field1288[var5] = super.field1288[var5 - 1];
         super.field1315[var5] = super.field1315[var5 - 1];
         super.field1316[var5] = super.field1316[var5 - 1];
      }

      super.field1288[0] = var3;
      super.field1315[0] = var4;
      super.field1316[0] = var2;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-68"
   )
   final boolean vmethod4190() {
      return this.field2400 != null;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(S)Lds;"
   )
   protected final class200 vmethod5291(short var1) {
      if(class113.field1064.isInterpolateNpcAnimations() && this.getAnimation() != 6566) {
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
      } else {
         return (class200)this.copy$getModel(var1);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIZI)V",
      garbageValue = "279535242"
   )
   final void method4188(int var1, int var2, boolean var3) {
      if(super.field1273 != -1 && class182.method3192(super.field1273).field3411 == 1) {
         super.field1273 = -1;
         this.animationChanged(-1);
      }

      if(!var3) {
         int var4 = var1 - super.field1288[0];
         int var5 = var2 - super.field1315[0];
         if(var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
            if(super.field1279 < 9) {
               ++super.field1279;
            }

            for(int var6 = super.field1279; var6 > 0; --var6) {
               super.field1288[var6] = super.field1288[var6 - 1];
               super.field1315[var6] = super.field1315[var6 - 1];
               super.field1316[var6] = super.field1316[var6 - 1];
            }

            super.field1288[0] = var1;
            super.field1315[0] = var2;
            super.field1316[0] = 1;
            return;
         }
      }

      super.field1279 = 0;
      super.field1318 = 0;
      super.field1307 = 0;
      super.field1288[0] = var1;
      super.field1315[0] = var2;
      super.field1277 = super.field1262 * 64 + super.field1288[0] * 128;
      super.field1259 = super.field1262 * 64 + super.field1315[0] * 128;
   }

   public RSNPCComposition getComposition() {
      return this.field2400;
   }

   @ObfuscatedSignature(
      signature = "(S)Lds;"
   )
   public final class200 copy$getModel(short var1) {
      if(this.field2400 == null) {
         return null;
      } else {
         class321 var2 = super.field1273 != -1 && super.field1294 == 0?class182.method3192(super.field1273):null;
         class321 var3 = super.field1265 != -1 && (super.field1276 != super.field1265 || var2 == null)?class182.method3192(super.field1265):null;
         class200 var4 = this.field2400.method3951(var2, super.field1292, var3, super.field1289);
         if(var4 == null) {
            return null;
         } else {
            var4.method3374();
            super.field1258 = var4.field3281;
            if(super.field1296 != -1 && super.field1297 != -1) {
               class200 var5 = class38.method619(super.field1296).method1615(super.field1297);
               if(var5 != null) {
                  var5.method3405(0, -super.field1286, 0);
                  class200[] var6 = new class200[]{var4, var5};
                  var4 = new class200(var6, 2);
               }
            }

            if(this.field2400.field2144 == 1) {
               var4.field1901 = true;
            }

            return var4;
         }
      }
   }

   public void onCompositionChanged(RSNPCComposition var1) {
      if(var1 == null) {
         class113.field1064.getCallbacks().post(new NpcDespawned(this));
      }

   }

   public int getId() {
      RSNPCComposition var1 = this.getComposition();
      if(var1 != null && var1.getConfigs() != null) {
         var1 = var1.transform();
      }

      return var1 == null?-1:var1.getId();
   }

   public String getName() {
      RSNPCComposition var1 = this.getComposition();
      if(var1 != null && var1.getConfigs() != null) {
         var1 = var1.transform();
      }

      return var1 == null?null:var1.getName().replace(' ', ' ');
   }

   public int getCombatLevel() {
      RSNPCComposition var1 = this.getComposition();
      if(var1 != null && var1.getConfigs() != null) {
         var1 = var1.transform();
      }

      return var1 == null?-1:var1.getCombatLevel();
   }

   public int getIndex() {
      return this.npcIndex;
   }

   public void setIndex(int var1) {
      this.npcIndex = var1;
   }

   public NPCComposition getTransformedComposition() {
      RSNPCComposition var1 = this.getComposition();
      if(var1 != null && var1.getConfigs() != null) {
         var1 = var1.transform();
      }

      return var1;
   }

   public boolean isDead() {
      return this.dead;
   }

   public void setDead(boolean var1) {
      this.dead = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;B)V",
      garbageValue = "60"
   )
   public static void method4201(class148 var0) {
      class309.field3287 = var0;
      class309.field3288 = class309.field3287.method2616(16);
   }

   @ObfuscatedName("hd")
   @ObfuscatedSignature(
      signature = "(III)Lfh;",
      garbageValue = "-1283853956"
   )
   static class48 method4199(int var0, int var1) {
      client.field4004.field362 = var0;
      client.field4004.field361 = var1;
      client.field4004.field360 = 1;
      client.field4004.field363 = 1;
      return client.field4004;
   }
}
