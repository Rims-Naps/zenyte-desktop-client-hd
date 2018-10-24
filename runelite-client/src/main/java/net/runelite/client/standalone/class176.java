package net.runelite.client.standalone;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public class class176 implements class174 {
   @ObfuscatedName("p")
   static boolean field1683;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = 1052686647
   )
   static int field1684;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Lch;",
      garbageValue = "-1848788016"
   )
   public class40 vmethod2961() {
      return new class132();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)[Lfw;",
      garbageValue = "-54"
   )
   public static ServerProt[] method2962() {
      return new ServerProt[]{ServerProt.REBUILD_NORMAL, ServerProt.LOGOUT, ServerProt.CAM_RESET, ServerProt.MESSAGE_GAME, ServerProt.VARP_LARGE, ServerProt.field2369, ServerProt.LOC_ADD, ServerProt.IF_CLEARITEMS, ServerProt.SPOTANIM_SPECIFIC, ServerProt.IF_CLOSESUB, ServerProt.MESSAGE_PRIVATE, ServerProt.MAP_PROJANIM, ServerProt.AREA_SOUND, ServerProt.LOC_DEL, ServerProt.OBJ_DEL, ServerProt.OBJ_UPDATE, ServerProt.field2311, ServerProt.UPDATE_ZONE_FULL_FOLLOWS, ServerProt.field2326, ServerProt.IF_SETTEXT, ServerProt.IF_SETOBJECT, ServerProt.IF_SETHIDE, ServerProt.UPDATE_STAT, ServerProt.MIDI_SONG, ServerProt.IF_SETTEXTCOLOUR, ServerProt.OBJ_CHUNK_CLEAR, ServerProt.OBJ_ADD, ServerProt.field2335, ServerProt.FULL_SEQUENCE_RESET, ServerProt.field2337, ServerProt.IF_SETPLAYERHEAD, ServerProt.IF_SETMODEL, ServerProt.UPDATE_IGNORELIST, ServerProt.NPC_INFO_SMALL, ServerProt.FREECAM, ServerProt.IF_SETNPCHEAD, ServerProt.SET_HINTARROW, ServerProt.field2386, ServerProt.MESSAGE_PRIVATE_ECHO, ServerProt.CAM_SHAKE, ServerProt.MIDI_SONG_LOCATION, ServerProt.field2349, ServerProt.ATTACHED_PLAYER_OBJECT, ServerProt.CLANCHANNEL_FULL, ServerProt.UPDATE_INV_PARTIAL, ServerProt.CLANCHANNEL_MEMBER, ServerProt.RESET_CONTAINER, ServerProt.field2355, ServerProt.IF_SETTARGETPARAM, ServerProt.LOC_ANIM, ServerProt.IF_SETANGLE, ServerProt.REBUILD_REGION, ServerProt.field2360, ServerProt.field2317, ServerProt.MESSAGE_CLANCHANNEL, ServerProt.GRAND_EXCHANGE_OFFER, ServerProt.field2357, ServerProt.field2384, ServerProt.UPDATE_FRIENDLIST, ServerProt.IF_SETPOSITION, ServerProt.UPDATE_RUNENERGY, ServerProt.IF_SETANIM, ServerProt.RUN_CLIENTSCRIPT, ServerProt.VARP_SMALL, ServerProt.UPDATE_ZONE_PARTIAL_FOLLOWS, ServerProt.SYNTH_SOUND, ServerProt.SET_PLAYER_OP, ServerProt.SET_MAP_FLAG, ServerProt.SET_PRIVATE_CHAT_FILTER, ServerProt.SEND_PING, ServerProt.UPDATE_INV_FULL, ServerProt.UPDATE_RUNWEIGHT, ServerProt.UPDATE_REBOOT_TIMER, ServerProt.field2381, ServerProt.SET_MINIMAP_STATE, ServerProt.CAM_POS, ServerProt.field2352, ServerProt.IF_OPENSUB, ServerProt.field2345, ServerProt.PLAYER_INFO, ServerProt.SET_CHAT_FILTER, ServerProt.NPC_INFO_LARGE, ServerProt.IF_MOVESUB, ServerProt.CAM_LOOKAT, ServerProt.IF_OPENTOP};
   }

   @ObfuscatedName("fc")
   @ObfuscatedSignature(
      signature = "(Lbw;ZB)V",
      garbageValue = "-90"
   )
   static void method2956(class63 var0, boolean var1) {
      if(var0 != null && var0.vmethod4190() && !var0.field575) {
         var0.field579 = false;
         if((client.field3736 && class11.field90 > 50 || class11.field90 > 200) && var1 && var0.field1265 == var0.field1276) {
            var0.field579 = true;
         }

         int var2 = var0.field1277 >> 7;
         int var3 = var0.field1259 >> 7;
         if(var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
            long var4 = class216.method3818(0, 0, 0, false, var0.field598);
            if(var0.field589 != null && client.field3744 >= var0.field584 && client.field3744 < var0.field585) {
               var0.field579 = false;
               var0.field583 = class7.method85(var0.field1277, var0.field1259, class315.plane);
               var0.field1263 = client.field3744;
               class258.field2566.method5343(class315.plane, var0.field1277, var0.field1259, var0.field583, 60, var0, var0.field1260, var4, var0.field590, var0.field603, var0.field592, var0.field593);
            } else {
               if((var0.field1277 & 127) == 64 && (var0.field1259 & 127) == 64) {
                  if(client.field3893[var2][var3] == client.field3830) {
                     return;
                  }

                  client.field3893[var2][var3] = client.field3830;
               }

               var0.field583 = class7.method85(var0.field1277, var0.field1259, class315.plane);
               var0.field1263 = client.field3744;
               class258.field2566.method5342(class315.plane, var0.field1277, var0.field1259, var0.field583, 60, var0, var0.field1260, var4, var0.field1261);
            }
         }
      }

   }

   @ObfuscatedName("ff")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "-28647"
   )
   static final void method2963() {
      int var0 = class11.field90;
      int[] var1 = class11.field91;

      for(int var2 = 0; var2 < var0; ++var2) {
         class63 var3 = client.field3848[var1[var2]];
         if(var3 != null) {
            class192.method3293(var3, 1);
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "-13231"
   )
   static void method2957() {
      if(client.field3771 && class325.field3480 != null && class325.field3480.length() > 0) {
         class325.field3494 = 1;
      } else {
         class325.field3494 = 0;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgl;I)I",
      garbageValue = "1548589281"
   )
   static int method2964(class214 var0) {
      int var1 = var0.readBits(2);
      int var2;
      if(var1 == 0) {
         var2 = 0;
      } else if(var1 == 1) {
         var2 = var0.readBits(5);
      } else if(var1 == 2) {
         var2 = var0.readBits(8);
      } else {
         var2 = var0.readBits(11);
      }

      return var2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZLjava/lang/String;ZB)V",
      garbageValue = "-99"
   )
   static void method2960(String var0, boolean var1, String var2, boolean var3) {
      if(var1) {
         if(!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var5) {
               ;
            }
         }

         if(class7.field50.startsWith("win") && !var3) {
            class187.method3229(var0, 0);
            return;
         }

         if(class7.field50.startsWith("mac")) {
            class128.method2380(var0, 1, var2);
            return;
         }

         class187.method3229(var0, 2);
      } else {
         class128.method2380(var0, 3, "openjs");
      }

   }
}
