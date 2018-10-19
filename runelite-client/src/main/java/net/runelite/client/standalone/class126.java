package net.runelite.client.standalone;

import java.util.EnumSet;
import net.runelite.api.WorldType;
import net.runelite.api.events.WorldListLoad;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSWorld;

@ObfuscatedName("bu")
public class class126 implements RSWorld {
   @ObfuscatedName("ga")
   @ObfuscatedSignature(
      signature = "[Llp;"
   )
   static class26[] field1202;
   @ObfuscatedName("q")
   static int[] field1200;
   @ObfuscatedName("r")
   static int[] field1191;
   @ObfuscatedName("p")
   static int[] field1190;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1372734133
   )
   static int field1203;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "[Lbu;"
   )
   static class126[] field1187;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1010996101
   )
   static int field1184;
   @ObfuscatedName("dz")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class108 field1194;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 26445935
   )
   int field1197;
   @ObfuscatedName("v")
   String field1195;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -754573271
   )
   int field1193;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -923758179
   )
   int field1201;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1973213591
   )
   int field1192;
   @ObfuscatedName("g")
   String field1196;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -2070637625
   )
   int field1198;

   static {
      field1184 = 0;
      field1203 = 0;
      field1190 = new int[]{1, 1, 1, 1};
      field1191 = new int[]{0, 1, 2, 3};
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(S)Z",
      garbageValue = "-18132"
   )
   boolean method2292() {
      return (536870912 & this.field1193) != 0;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "2022084753"
   )
   boolean method2288() {
      return (1 & this.field1193) != 0;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2049142090"
   )
   boolean method2305() {
      return (4 & this.field1193) != 0;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "723191830"
   )
   boolean method2291() {
      return (8 & this.field1193) != 0;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "2111470573"
   )
   boolean method2293() {
      return (33554432 & this.field1193) != 0;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "2120012669"
   )
   boolean method2289() {
      return (2 & this.field1193) != 0;
   }

   public int getMask() {
      return this.field1193;
   }

   public void setMask(int var1) {
      this.field1193 = var1;
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void playerCountChanged(int var1) {
      RSWorld[] var2 = class113.field1064.getWorldList();
      if(var2 != null && var2.length > 0 && this == var2[var2.length - 1]) {
         WorldListLoad var3 = new WorldListLoad(var2);
         class113.field1064.getCallbacks().post(var3);
      }

   }

   public EnumSet getTypes() {
      return WorldType.fromMask(this.getMask());
   }

   public void setTypes(EnumSet var1) {
      this.setMask(WorldType.toMask(var1));
   }

   public void setId(int var1) {
      this.field1198 = var1;
   }

   public int getId() {
      return this.field1198;
   }

   public void setPlayerCount(int var1) {
      this.field1192 = var1;
   }

   public int getPlayerCount() {
      return this.field1192;
   }

   public void setAddress(String var1) {
      this.field1195 = var1;
   }

   public String getAddress() {
      return this.field1195;
   }

   public void setActivity(String var1) {
      this.field1196 = var1;
   }

   public String getActivity() {
      return this.field1196;
   }

   public void setLocation(int var1) {
      this.field1197 = var1;
   }

   public int getLocation() {
      return this.field1197;
   }

   public void setIndex(int var1) {
      this.field1201 = var1;
   }

   public int getIndex() {
      return this.field1201;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(ILcz;ZB)I",
      garbageValue = "-42"
   )
   static int method2301(int var0, class252 var1, boolean var2) {
      if(var0 == 6500) {
         class55.field407[++class171.field1587 - 1] = class326.method5778()?1:0;
         return 1;
      } else {
         class126 var3;
         if(var0 == 6501) {
            var3 = class45.method788();
            if(var3 != null) {
               class55.field407[++class171.field1587 - 1] = var3.field1198;
               class55.field407[++class171.field1587 - 1] = var3.field1193;
               class55.field408[++class272.field2978 - 1] = var3.field1196;
               class55.field407[++class171.field1587 - 1] = var3.field1197;
               class55.field407[++class171.field1587 - 1] = var3.field1192;
               class55.field408[++class272.field2978 - 1] = var3.field1195;
            } else {
               class55.field407[++class171.field1587 - 1] = -1;
               class55.field407[++class171.field1587 - 1] = 0;
               class55.field408[++class272.field2978 - 1] = "";
               class55.field407[++class171.field1587 - 1] = 0;
               class55.field407[++class171.field1587 - 1] = 0;
               class55.field408[++class272.field2978 - 1] = "";
            }

            return 1;
         } else if(var0 == 6502) {
            var3 = class321.method5663();
            if(var3 != null) {
               class55.field407[++class171.field1587 - 1] = var3.field1198;
               class55.field407[++class171.field1587 - 1] = var3.field1193;
               class55.field408[++class272.field2978 - 1] = var3.field1196;
               class55.field407[++class171.field1587 - 1] = var3.field1197;
               class55.field407[++class171.field1587 - 1] = var3.field1192;
               class55.field408[++class272.field2978 - 1] = var3.field1195;
            } else {
               class55.field407[++class171.field1587 - 1] = -1;
               class55.field407[++class171.field1587 - 1] = 0;
               class55.field408[++class272.field2978 - 1] = "";
               class55.field407[++class171.field1587 - 1] = 0;
               class55.field407[++class171.field1587 - 1] = 0;
               class55.field408[++class272.field2978 - 1] = "";
            }

            return 1;
         } else {
            class126 var4;
            int var5;
            int var7;
            if(var0 == 6506) {
               var7 = class55.field407[--class171.field1587];
               var4 = null;

               for(var5 = 0; var5 < field1184; ++var5) {
                  if(var7 == field1187[var5].field1198) {
                     var4 = field1187[var5];
                     break;
                  }
               }

               if(var4 != null) {
                  class55.field407[++class171.field1587 - 1] = var4.field1198;
                  class55.field407[++class171.field1587 - 1] = var4.field1193;
                  class55.field408[++class272.field2978 - 1] = var4.field1196;
                  class55.field407[++class171.field1587 - 1] = var4.field1197;
                  class55.field407[++class171.field1587 - 1] = var4.field1192;
                  class55.field408[++class272.field2978 - 1] = var4.field1195;
               } else {
                  class55.field407[++class171.field1587 - 1] = -1;
                  class55.field407[++class171.field1587 - 1] = 0;
                  class55.field408[++class272.field2978 - 1] = "";
                  class55.field407[++class171.field1587 - 1] = 0;
                  class55.field407[++class171.field1587 - 1] = 0;
                  class55.field408[++class272.field2978 - 1] = "";
               }

               return 1;
            } else if(var0 == 6507) {
               class171.field1587 -= 4;
               var7 = class55.field407[class171.field1587];
               boolean var10 = class55.field407[class171.field1587 + 1] == 1;
               var5 = class55.field407[class171.field1587 + 2];
               boolean var6 = class55.field407[class171.field1587 + 3] == 1;
               class234.method4166(var7, var10, var5, var6);
               return 1;
            } else if(var0 != 6511) {
               if(var0 == 6512) {
                  client.field3966 = class55.field407[--class171.field1587] == 1;
                  return 1;
               } else {
                  int var8;
                  class183 var9;
                  if(var0 == 6513) {
                     class171.field1587 -= 2;
                     var7 = class55.field407[class171.field1587];
                     var8 = class55.field407[class171.field1587 + 1];
                     var9 = class275.method4913(var8);
                     if(var9.method3207()) {
                        class55.field408[++class272.field2978 - 1] = class25.method361(var7).method3972(var8, var9.field1771);
                     } else {
                        class55.field407[++class171.field1587 - 1] = class25.method361(var7).method3965(var8, var9.field1770);
                     }

                     return 1;
                  } else if(var0 == 6514) {
                     class171.field1587 -= 2;
                     var7 = class55.field407[class171.field1587];
                     var8 = class55.field407[class171.field1587 + 1];
                     var9 = class275.method4913(var8);
                     if(var9.method3207()) {
                        class55.field408[++class272.field2978 - 1] = class152.method2696(var7).method2909(var8, var9.field1771);
                     } else {
                        class55.field407[++class171.field1587 - 1] = class152.method2696(var7).method2899(var8, var9.field1770);
                     }

                     return 1;
                  } else if(var0 == 6515) {
                     class171.field1587 -= 2;
                     var7 = class55.field407[class171.field1587];
                     var8 = class55.field407[class171.field1587 + 1];
                     var9 = class275.method4913(var8);
                     if(var9.method3207()) {
                        class55.field408[++class272.field2978 - 1] = class67.method1152(var7).method2166(var8, var9.field1771);
                     } else {
                        class55.field407[++class171.field1587 - 1] = class67.method1152(var7).method2165(var8, var9.field1770);
                     }

                     return 1;
                  } else if(var0 == 6516) {
                     class171.field1587 -= 2;
                     var7 = class55.field407[class171.field1587];
                     var8 = class55.field407[class171.field1587 + 1];
                     var9 = class275.method4913(var8);
                     if(var9.method3207()) {
                        class55.field408[++class272.field2978 - 1] = class260.method4665(var7).method5099(var8, var9.field1771);
                     } else {
                        class55.field407[++class171.field1587 - 1] = class260.method4665(var7).method5091(var8, var9.field1770);
                     }

                     return 1;
                  } else if(var0 == 6518) {
                     class55.field407[++class171.field1587 - 1] = client.field3739?1:0;
                     return 1;
                  } else if(var0 == 6519) {
                     class55.field407[++class171.field1587 - 1] = client.field3967 & 3;
                     return 1;
                  } else if(var0 == 6520) {
                     return 1;
                  } else if(var0 == 6521) {
                     return 1;
                  } else if(var0 == 6522) {
                     --class272.field2978;
                     --class171.field1587;
                     return 1;
                  } else if(var0 == 6523) {
                     --class272.field2978;
                     --class171.field1587;
                     return 1;
                  } else if(var0 == 6524) {
                     class55.field407[++class171.field1587 - 1] = -1;
                     return 1;
                  } else if(var0 == 6525) {
                     class55.field407[++class171.field1587 - 1] = 1;
                     return 1;
                  } else if(var0 == 6526) {
                     class55.field407[++class171.field1587 - 1] = 1;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var7 = class55.field407[--class171.field1587];
               if(var7 >= 0 && var7 < field1184) {
                  var4 = field1187[var7];
                  class55.field407[++class171.field1587 - 1] = var4.field1198;
                  class55.field407[++class171.field1587 - 1] = var4.field1193;
                  class55.field408[++class272.field2978 - 1] = var4.field1196;
                  class55.field407[++class171.field1587 - 1] = var4.field1197;
                  class55.field407[++class171.field1587 - 1] = var4.field1192;
                  class55.field408[++class272.field2978 - 1] = var4.field1195;
               } else {
                  class55.field407[++class171.field1587 - 1] = -1;
                  class55.field407[++class171.field1587 - 1] = 0;
                  class55.field408[++class272.field2978 - 1] = "";
                  class55.field407[++class171.field1587 - 1] = 0;
                  class55.field407[++class171.field1587 - 1] = 0;
                  class55.field408[++class272.field2978 - 1] = "";
               }

               return 1;
            }
         }
      }
   }

   @ObfuscatedName("ha")
   @ObfuscatedSignature(
      signature = "(IIIIIIIII)V",
      garbageValue = "2076889933"
   )
   static final void method2331(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(class267.method4843(var0)) {
         class180.field1714 = null;
         class224.method4019(class329.field3533[var0], -1, var1, var2, var3, var4, var5, var6, var7);
         if(class180.field1714 != null) {
            class224.method4019(class180.field1714, -1412584499, var1, var2, var3, var4, class87.field799, class285.field3067, var7);
            class180.field1714 = null;
         }

      } else {
         if(var7 != -1) {
            client.field3930[var7] = true;
         } else {
            for(int var8 = 0; var8 < 100; ++var8) {
               client.field3930[var8] = true;
            }
         }

      }
   }
}
