package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSSceneTilePaint;

@ObfuscatedName("dk")
public final class class18 implements RSSceneTilePaint {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1617246319
   )
   static int field147;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -627188309
   )
   int field145;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -821575969
   )
   int field148;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -2082943897
   )
   int field146;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -747354359
   )
   int field142;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1389343993
   )
   int field143;
   @ObfuscatedName("a")
   boolean field149;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -166635317
   )
   int field144;

   class18(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.field149 = true;
      this.field145 = var1;
      this.field142 = var2;
      this.field144 = var3;
      this.field143 = var4;
      this.field146 = var5;
      this.field148 = var6;
      this.field149 = var7;
   }

   public int getRBG() {
      return this.field148;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "1893873597"
   )
   static int method195(int var0, class252 var1, boolean var2) {
      boolean var3 = true;
      class329 var4;
      if(var0 >= 2000) {
         var0 -= 1000;
         var4 = class189.getWidget(class55.field407[--class171.field1587]);
         var3 = false;
      } else {
         var4 = var2?class182.field1766:class20.field155;
      }

      int var11;
      if(var0 == 1300) {
         var11 = class55.field407[--class171.field1587] - 1;
         if(var11 >= 0 && var11 <= 9) {
            var4.method5888(var11, class55.field408[--class272.field2978]);
            return 1;
         } else {
            --class272.field2978;
            return 1;
         }
      } else {
         int var6;
         if(var0 == 1301) {
            class171.field1587 -= 2;
            var11 = class55.field407[class171.field1587];
            var6 = class55.field407[class171.field1587 + 1];
            var4.field3625 = class313.method5512(var11, var6);
            return 1;
         } else if(var0 == 1302) {
            var4.field3632 = class55.field407[--class171.field1587] == 1;
            return 1;
         } else if(var0 == 1303) {
            var4.field3656 = class55.field407[--class171.field1587];
            return 1;
         } else if(var0 == 1304) {
            var4.field3627 = class55.field407[--class171.field1587];
            return 1;
         } else if(var0 == 1305) {
            var4.field3669 = class55.field408[--class272.field2978];
            return 1;
         } else if(var0 == 1306) {
            var4.field3633 = class55.field408[--class272.field2978];
            return 1;
         } else if(var0 == 1307) {
            var4.field3616 = null;
            return 1;
         } else {
            int var7;
            byte[] var9;
            if(var0 != 1350) {
               byte var5;
               if(var0 == 1351) {
                  class171.field1587 -= 2;
                  var5 = 10;
                  var9 = new byte[]{(byte)class55.field407[class171.field1587]};
                  byte[] var10 = new byte[]{(byte)class55.field407[class171.field1587 + 1]};
                  class45.method789(var4, var5, var9, var10);
                  return 1;
               } else if(var0 == 1352) {
                  class171.field1587 -= 3;
                  var11 = class55.field407[class171.field1587] - 1;
                  var6 = class55.field407[class171.field1587 + 1];
                  var7 = class55.field407[class171.field1587 + 2];
                  if(var11 >= 0 && var11 <= 9) {
                     class37.method594(var4, var11, var6, var7);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if(var0 == 1353) {
                  var5 = 10;
                  var6 = class55.field407[--class171.field1587];
                  var7 = class55.field407[--class171.field1587];
                  class37.method594(var4, var5, var6, var7);
                  return 1;
               } else if(var0 == 1354) {
                  --class171.field1587;
                  var11 = class55.field407[class171.field1587] - 1;
                  if(var11 >= 0 && var11 <= 9) {
                     class318.method5581(var4, var11);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if(var0 == 1355) {
                  var5 = 10;
                  class318.method5581(var4, var5);
                  return 1;
               } else {
                  return 2;
               }
            } else {
               byte[] var8 = null;
               var9 = null;
               if(var3) {
                  class171.field1587 -= 10;

                  for(var7 = 0; var7 < 10 && class55.field407[var7 + class171.field1587] >= 0; var7 += 2) {
                     ;
                  }

                  if(var7 > 0) {
                     var8 = new byte[var7 / 2];
                     var9 = new byte[var7 / 2];

                     for(var7 -= 2; var7 >= 0; var7 -= 2) {
                        var8[var7 / 2] = (byte)class55.field407[var7 + class171.field1587];
                        var9[var7 / 2] = (byte)class55.field407[var7 + class171.field1587 + 1];
                     }
                  }
               } else {
                  class171.field1587 -= 2;
                  var8 = new byte[]{(byte)class55.field407[class171.field1587]};
                  var9 = new byte[]{(byte)class55.field407[class171.field1587 + 1]};
               }

               var7 = class55.field407[--class171.field1587] - 1;
               if(var7 >= 0 && var7 <= 9) {
                  class45.method789(var4, var7, var8, var9);
                  return 1;
               } else {
                  throw new RuntimeException();
               }
            }
         }
      }
   }
}
