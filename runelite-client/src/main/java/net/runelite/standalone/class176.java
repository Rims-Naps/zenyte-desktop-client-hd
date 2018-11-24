package net.runelite.standalone;

import net.runelite.api.NPCComposition;
import net.runelite.api.events.NpcDespawned;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSNPC;
import net.runelite.rs.api.RSNPCComposition;

@ObfuscatedName("bd")
public final class class176 extends class99 implements RSNPC {
   @ObfuscatedName("jw")
   @ObfuscatedSignature(
      signature = "Ldr;"
   )
   static class266 field2433;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lji;"
   )
   class315 field2437;
   public int npcIndex;
   public boolean dead;

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIZI)V",
      garbageValue = "279535242"
   )
   final void method3662(int var1, int var2, boolean var3) {
      if(super.field1086 != -1 && class3.method74(super.field1086).field3829 == 1) {
         super.field1086 = -1;
         this.animationChanged(-1);
      }

      if(!var3) {
         int var4 = var1 - super.field1101[0];
         int var5 = var2 - super.field1128[0];
         if(var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
            if(super.field1092 < 9) {
               ++super.field1092;
            }

            for(int var6 = super.field1092; var6 > 0; --var6) {
               super.field1101[var6] = super.field1101[var6 - 1];
               super.field1128[var6] = super.field1128[var6 - 1];
               super.field1129[var6] = super.field1129[var6 - 1];
            }

            super.field1101[0] = var1;
            super.field1128[0] = var2;
            super.field1129[0] = 1;
            return;
         }
      }

      super.field1092 = 0;
      super.field1131 = 0;
      super.field1120 = 0;
      super.field1101[0] = var1;
      super.field1128[0] = var2;
      super.field1090 = super.field1075 * 64 + super.field1101[0] * 128;
      super.field1072 = super.field1075 * 64 + super.field1128[0] * 128;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IBI)V",
      garbageValue = "464573042"
   )
   final void method3661(int var1, byte var2) {
      int var3 = super.field1101[0];
      int var4 = super.field1128[0];
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

      if(super.field1086 != -1 && class3.method74(super.field1086).field3829 == 1) {
         super.field1086 = -1;
         this.animationChanged(-1);
      }

      if(super.field1092 < 9) {
         ++super.field1092;
      }

      for(int var5 = super.field1092; var5 > 0; --var5) {
         super.field1101[var5] = super.field1101[var5 - 1];
         super.field1128[var5] = super.field1128[var5 - 1];
         super.field1129[var5] = super.field1129[var5 - 1];
      }

      super.field1101[0] = var3;
      super.field1128[0] = var4;
      super.field1129[0] = var2;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(S)Lds;"
   )
   protected final class52 vmethod6253(short var1) {
      if(class302.field3755.isInterpolateNpcAnimations() && this.getAnimation() != 6566) {
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
      } else {
         return (class52)this.copy$getModel(var1);
      }
   }

   public RSNPCComposition getComposition() {
      return this.field2437;
   }

   @ObfuscatedSignature(
      signature = "(S)Lds;"
   )
   public final class52 copy$getModel(short var1) {
      if(this.field2437 == null) {
         return null;
      } else {
         class312 var2 = super.field1086 != -1 && super.field1107 == 0?class3.method74(super.field1086):null;
         class312 var3 = super.field1078 != -1 && (super.field1089 != super.field1078 || var2 == null)?class3.method74(super.field1078):null;
         class52 var4 = this.field2437.method6152(var2, super.field1105, var3, super.field1102);
         if(var4 == null) {
            return null;
         } else {
            var4.method1126();
            super.field1071 = var4.field1143;
            if(super.field1109 != -1 && super.field1110 != -1) {
               class52 var5 = class283.method5464(super.field1109).method1529(super.field1110);
               if(var5 != null) {
                  var5.method1157(0, -super.field1099, 0);
                  class52[] var6 = new class52[]{var4, var5};
                  var4 = new class52(var6, 2);
               }
            }

            if(this.field2437.field3862 == 1) {
               var4.field603 = true;
            }

            return var4;
         }
      }
   }

   public void onCompositionChanged(RSNPCComposition var1) {
      if(var1 == null) {
         class302.field3755.getCallbacks().post(new NpcDespawned(this));
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

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-68"
   )
   final boolean vmethod3957() {
      return this.field2437 != null;
   }

   @ObfuscatedName("hd")
   @ObfuscatedSignature(
      signature = "(III)Lfh;",
      garbageValue = "-1283853956"
   )
   static class31 method3673(int var0, int var1) {
      client.field2425.field290 = var0;
      client.field2425.field289 = var1;
      client.field2425.field288 = 1;
      client.field2425.field291 = 1;
      return client.field2425;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;B)V",
      garbageValue = "60"
   )
   public static void method3675(class217 var0) {
      class278.field3518 = var0;
      class278.field3519 = class278.field3518.method4435(16);
   }
}
