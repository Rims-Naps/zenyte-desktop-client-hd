package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
public final class WorldMapRectangle {
   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      signature = "Lih;"
   )
   static Js5 textures;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 567457275
   )
   int worldMapRegionHeight;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -307962233
   )
   int worldMapRegionX;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -966817739
   )
   int worldMapRegionY;
   // $FF: synthetic field
   @ObfuscatedSignature(
      signature = "Lae;"
   )
   final WorldMapManager this$0;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -954209651
   )
   int worldMapRegionWidth;

   @ObfuscatedSignature(
      signature = "(Lae;)V"
   )
   WorldMapRectangle(WorldMapManager var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)Lbe;",
      garbageValue = "-53"
   )
   static World method124() {
      return World.field1014 < World.worldCount?World.worldList[++World.field1014 - 1]:null;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2108105930"
   )
   public static void method126() {
      IDKType.identKits.method952();
   }

   @ObfuscatedName("jl")
   @ObfuscatedSignature(
      signature = "(IIIB)Lbp;",
      garbageValue = "68"
   )
   static final SubInterface method125(int var0, int var1, int var2) {
      SubInterface var3 = new SubInterface();
      var3.id = var1;
      var3.mode = var2;
      Client.subInterfaces.method382(var3, (long)var0);
      class76.method1149(var1);
      ComponentType var4 = WorldMapType1.method2440(var0);
      class208.method4144(var4);
      if(Client.field880 != null) {
         class208.method4144(Client.field880);
         Client.field880 = null;
      }

      for(int var5 = 0; var5 < Client.menuOptionCount; ++var5) {
         if(VarClientStringType.method184(Client.menuTypes[var5])) {
            if(var5 < Client.menuOptionCount - 1) {
               for(int var6 = var5; var6 < Client.menuOptionCount - 1; ++var6) {
                  Client.menuOptions[var6] = Client.menuOptions[var6 + 1];
                  Client.menuTargets[var6] = Client.menuTargets[var6 + 1];
                  Client.menuTypes[var6] = Client.menuTypes[var6 + 1];
                  Client.menuIdentifiers[var6] = Client.menuIdentifiers[var6 + 1];
                  Client.menuActionParams0[var6] = Client.menuActionParams0[var6 + 1];
                  Client.menuActionParams1[var6] = Client.menuActionParams1[var6 + 1];
                  Client.menuBooleanArray[var6] = Client.menuBooleanArray[var6 + 1];
               }
            }

            --var5;
            --Client.menuOptionCount;
            Client.onMenuOptionsChanged(-1);
         }
      }

      class261.method5015();
      class196.method4011(class36.interfaces[var0 >> 16], var4, false);
      class134.method2204(var1, -1672363479);
      if(Client.toplevel != -1) {
         class124.method2087(Client.toplevel, 1);
      }

      return var3;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Liu;IIB)Z",
      garbageValue = "1"
   )
   public static boolean method128(Js5Index var0, int var1, int var2) {
      byte[] var3 = var0.method1516(var1, var2, 1789634852);
      if(var3 == null) {
         return false;
      } else {
         SceneTilePaint.method667(var3);
         return true;
      }
   }

   @ObfuscatedName("gj")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1993334484"
   )
   static int method127() {
      return Client.isResized?2:1;
   }
}
