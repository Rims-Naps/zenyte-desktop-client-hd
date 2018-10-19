package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFriendContainer;

@ObfuscatedName("kc")
public class class79 extends class209 implements RSFriendContainer {
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 600720795
   )
   int field722;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   final class179 field723;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Lhq;"
   )
   public class220 field725;

   @ObfuscatedSignature(
      signature = "(Lly;)V"
   )
   public class79(class179 var1) {
      super(400);
      this.field722 = 1;
      this.field725 = new class220();
      this.field723 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Ljb;",
      garbageValue = "893739968"
   )
   class242 vmethod3645() {
      return new class155();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgm;IB)V",
      garbageValue = "53"
   )
   public void method1198(Buffer var1, int var2) {
      while(true) {
         if(var1.field1073 < var2) {
            boolean var3 = var1.readUnsignedByte() == 1;
            class49 var4 = new class49(var1.readString(), this.field723);
            class49 var5 = new class49(var1.readString(), this.field723);
            int var6 = var1.readUnsignedShort();
            int var7 = var1.readUnsignedByte();
            int var8 = var1.readUnsignedByte();
            boolean var9 = (var8 & 2) != 0;
            boolean var10 = (var8 & 1) != 0;
            if(var6 > 0) {
               var1.readString();
               var1.readUnsignedByte();
               var1.readInt();
            }

            var1.readString();
            if(var4 != null && var4.method822()) {
               class155 var11 = (class155)this.method3626(var4);
               if(var3) {
                  class155 var12 = (class155)this.method3626(var5);
                  if(var12 != null && var12 != var11) {
                     if(var11 != null) {
                        this.method3629(var12);
                     } else {
                        var11 = var12;
                     }
                  }
               }

               if(var11 != null) {
                  this.method3690(var11, var4, var5);
                  if(var6 != var11.field3265) {
                     boolean var14 = true;

                     for(class70 var13 = (class70)this.field725.method3935(); var13 != null; var13 = (class70)this.field725.method3938()) {
                        if(var13.field649.equals(var4)) {
                           if(var6 != 0 && var13.field648 == 0) {
                              var13.method3742();
                              var14 = false;
                           } else if(var6 == 0 && var13.field648 != 0) {
                              var13.method3742();
                              var14 = false;
                           }
                        }
                     }

                     if(var14) {
                        this.field725.method3936(new class70(var4, var6));
                     }
                  }
               } else {
                  if(this.method3635() >= 400) {
                     continue;
                  }

                  var11 = (class155)this.method3648(var4, var5);
               }

               if(var6 != var11.field3265) {
                  var11.field3262 = ++this.field722 - 1;
                  if(var11.field3265 == -1 && var6 == 0) {
                     var11.field3262 = -(var11.field3262 * 1717545099) * 1607302947;
                  }

                  var11.field3265 = var6;
               }

               var11.field3261 = var7;
               var11.field1482 = var9;
               var11.field1481 = var10;
               continue;
            }

            throw new IllegalStateException();
         }

         this.method3633();
         return;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IS)[Ljb;",
      garbageValue = "14604"
   )
   class242[] vmethod3641(int var1) {
      return new class155[var1];
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lka;ZI)Z",
      garbageValue = "1004134805"
   )
   public boolean method1208(class49 var1, boolean var2) {
      class155 var3 = (class155)this.method3625(var1);
      return var3 == null?false:!var2 || var3.field3265 != 0;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)[Lle;",
      garbageValue = "-341579050"
   )
   static class32[] method1214() {
      class32[] var0 = new class32[class112.field1056];

      for(int var1 = 0; var1 < class112.field1056; ++var1) {
         class32 var2 = var0[var1] = new class32();
         var2.field261 = class112.field1057;
         var2.field262 = class112.field1054;
         var2.field259 = class120.field1149[var1];
         var2.field255 = class112.field1055[var1];
         var2.field257 = class112.field1052[var1];
         var2.field260 = class167.field1544[var1];
         var2.field256 = class192.field1841;
         var2.field258 = class161.field1507[var1];
      }

      class120.field1149 = null;
      class112.field1055 = null;
      class112.field1052 = null;
      class167.field1544 = null;
      class192.field1841 = null;
      class161.field1507 = null;
      return var0;
   }
}
