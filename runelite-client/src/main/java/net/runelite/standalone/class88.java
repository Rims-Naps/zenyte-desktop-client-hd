package net.runelite.standalone;

import java.util.EnumSet;
import net.runelite.api.WorldType;
import net.runelite.api.events.WorldListLoad;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSWorld;

@ObfuscatedName("bu")
public class class88 implements RSWorld {
   @ObfuscatedName("p")
   static int[] field950;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1372734133
   )
   static int field963;
   @ObfuscatedName("r")
   static int[] field951;
   @ObfuscatedName("dz")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class6 field954;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1010996101
   )
   static int field944;
   @ObfuscatedName("ga")
   @ObfuscatedSignature(
      signature = "[Llp;"
   )
   static SpritePixels[] field962;
   @ObfuscatedName("q")
   static int[] field960;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "[Lbu;"
   )
   static class88[] field947;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 26445935
   )
   int field957;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -754573271
   )
   int field953;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -923758179
   )
   int field961;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1973213591
   )
   int field952;
   @ObfuscatedName("v")
   String field955;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -2070637625
   )
   int field958;
   @ObfuscatedName("g")
   String field956;

   static {
      field944 = 0;
      field963 = 0;
      field950 = new int[]{1, 1, 1, 1};
      field951 = new int[]{0, 1, 2, 3};
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2049142090"
   )
   boolean method1653() {
      return (4 & this.field953) != 0;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "2022084753"
   )
   boolean method1636() {
      return (1 & this.field953) != 0;
   }

   public int getMask() {
      return this.field953;
   }

   public void setMask(int var1) {
      this.field953 = var1;
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void playerCountChanged(int var1) {
      RSWorld[] var2 = class302.field3755.getWorldList();
      if(var2 != null && var2.length > 0 && this == var2[var2.length - 1]) {
         WorldListLoad var3 = new WorldListLoad(var2);
         class302.field3755.getCallbacks().post(var3);
      }

   }

   public EnumSet getTypes() {
      return WorldType.fromMask(this.getMask());
   }

   public void setTypes(EnumSet var1) {
      this.setMask(WorldType.toMask(var1));
   }

   public void setId(int var1) {
      this.field958 = var1;
   }

   public int getId() {
      return this.field958;
   }

   public void setPlayerCount(int var1) {
      this.field952 = var1;
   }

   public int getPlayerCount() {
      return this.field952;
   }

   public void setAddress(String var1) {
      this.field955 = var1;
   }

   public String getAddress() {
      return this.field955;
   }

   public void setActivity(String var1) {
      this.field956 = var1;
   }

   public String getActivity() {
      return this.field956;
   }

   public void setLocation(int var1) {
      this.field957 = var1;
   }

   public int getLocation() {
      return this.field957;
   }

   public void setIndex(int var1) {
      this.field961 = var1;
   }

   public int getIndex() {
      return this.field961;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "723191830"
   )
   boolean method1639() {
      return (8 & this.field953) != 0;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(S)Z",
      garbageValue = "-18132"
   )
   boolean method1640() {
      return (536870912 & this.field953) != 0;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "2120012669"
   )
   boolean method1637() {
      return (2 & this.field953) != 0;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "2111470573"
   )
   boolean method1641() {
      return (33554432 & this.field953) != 0;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(ILcz;ZB)I",
      garbageValue = "-42"
   )
   static int method1649(int var0, class296 var1, boolean var2) {
      if(var0 == 6500) {
         class249.field3312[++class308.field3811 - 1] = class294.method5776()?1:0;
         return 1;
      } else {
         class88 var3;
         if(var0 == 6501) {
            var3 = class322.method6254();
            if(var3 != null) {
               class249.field3312[++class308.field3811 - 1] = var3.field958;
               class249.field3312[++class308.field3811 - 1] = var3.field953;
               class249.field3313[++class103.field1146 - 1] = var3.field956;
               class249.field3312[++class308.field3811 - 1] = var3.field957;
               class249.field3312[++class308.field3811 - 1] = var3.field952;
               class249.field3313[++class103.field1146 - 1] = var3.field955;
            } else {
               class249.field3312[++class308.field3811 - 1] = -1;
               class249.field3312[++class308.field3811 - 1] = 0;
               class249.field3313[++class103.field1146 - 1] = "";
               class249.field3312[++class308.field3811 - 1] = 0;
               class249.field3312[++class308.field3811 - 1] = 0;
               class249.field3313[++class103.field1146 - 1] = "";
            }

            return 1;
         } else if(var0 == 6502) {
            var3 = class312.method6130();
            if(var3 != null) {
               class249.field3312[++class308.field3811 - 1] = var3.field958;
               class249.field3312[++class308.field3811 - 1] = var3.field953;
               class249.field3313[++class103.field1146 - 1] = var3.field956;
               class249.field3312[++class308.field3811 - 1] = var3.field957;
               class249.field3312[++class308.field3811 - 1] = var3.field952;
               class249.field3313[++class103.field1146 - 1] = var3.field955;
            } else {
               class249.field3312[++class308.field3811 - 1] = -1;
               class249.field3312[++class308.field3811 - 1] = 0;
               class249.field3313[++class103.field1146 - 1] = "";
               class249.field3312[++class308.field3811 - 1] = 0;
               class249.field3312[++class308.field3811 - 1] = 0;
               class249.field3313[++class103.field1146 - 1] = "";
            }

            return 1;
         } else {
            class88 var4;
            int var5;
            int var7;
            if(var0 == 6506) {
               var7 = class249.field3312[--class308.field3811];
               var4 = null;

               for(var5 = 0; var5 < field944; ++var5) {
                  if(var7 == field947[var5].field958) {
                     var4 = field947[var5];
                     break;
                  }
               }

               if(var4 != null) {
                  class249.field3312[++class308.field3811 - 1] = var4.field958;
                  class249.field3312[++class308.field3811 - 1] = var4.field953;
                  class249.field3313[++class103.field1146 - 1] = var4.field956;
                  class249.field3312[++class308.field3811 - 1] = var4.field957;
                  class249.field3312[++class308.field3811 - 1] = var4.field952;
                  class249.field3313[++class103.field1146 - 1] = var4.field955;
               } else {
                  class249.field3312[++class308.field3811 - 1] = -1;
                  class249.field3312[++class308.field3811 - 1] = 0;
                  class249.field3313[++class103.field1146 - 1] = "";
                  class249.field3312[++class308.field3811 - 1] = 0;
                  class249.field3312[++class308.field3811 - 1] = 0;
                  class249.field3313[++class103.field1146 - 1] = "";
               }

               return 1;
            } else if(var0 == 6507) {
               class308.field3811 -= 4;
               var7 = class249.field3312[class308.field3811];
               boolean var10 = class249.field3312[class308.field3811 + 1] == 1;
               var5 = class249.field3312[class308.field3811 + 2];
               boolean var6 = class249.field3312[class308.field3811 + 3] == 1;
               class321.method6248(var7, var10, var5, var6);
               return 1;
            } else if(var0 != 6511) {
               if(var0 == 6512) {
                  client.field2387 = class249.field3312[--class308.field3811] == 1;
                  return 1;
               } else {
                  int var8;
                  class104 var9;
                  if(var0 == 6513) {
                     class308.field3811 -= 2;
                     var7 = class249.field3312[class308.field3811];
                     var8 = class249.field3312[class308.field3811 + 1];
                     var9 = class107.method1889(var8);
                     if(var9.method1870()) {
                        class249.field3313[++class103.field1146 - 1] = class127.method2480(var7).method6173(var8, var9.field1155);
                     } else {
                        class249.field3312[++class308.field3811 - 1] = class127.method2480(var7).method6166(var8, var9.field1154);
                     }

                     return 1;
                  } else if(var0 == 6514) {
                     class308.field3811 -= 2;
                     var7 = class249.field3312[class308.field3811];
                     var8 = class249.field3312[class308.field3811 + 1];
                     var9 = class107.method1889(var8);
                     if(var9.method1870()) {
                        class249.field3313[++class103.field1146 - 1] = class285.method5484(var7).method336(var8, var9.field1155);
                     } else {
                        class249.field3312[++class308.field3811 - 1] = class285.method5484(var7).method326(var8, var9.field1154);
                     }

                     return 1;
                  } else if(var0 == 6515) {
                     class308.field3811 -= 2;
                     var7 = class249.field3312[class308.field3811];
                     var8 = class249.field3312[class308.field3811 + 1];
                     var9 = class107.method1889(var8);
                     if(var9.method1870()) {
                        class249.field3313[++class103.field1146 - 1] = class164.method3014(var7).method784(var8, var9.field1155);
                     } else {
                        class249.field3312[++class308.field3811 - 1] = class164.method3014(var7).method783(var8, var9.field1154);
                     }

                     return 1;
                  } else if(var0 == 6516) {
                     class308.field3811 -= 2;
                     var7 = class249.field3312[class308.field3811];
                     var8 = class249.field3312[class308.field3811 + 1];
                     var9 = class107.method1889(var8);
                     if(var9.method1870()) {
                        class249.field3313[++class103.field1146 - 1] = class275.method5368(var7).method414(var8, var9.field1155);
                     } else {
                        class249.field3312[++class308.field3811 - 1] = class275.method5368(var7).method406(var8, var9.field1154);
                     }

                     return 1;
                  } else if(var0 == 6518) {
                     class249.field3312[++class308.field3811 - 1] = client.field2160?1:0;
                     return 1;
                  } else if(var0 == 6519) {
                     class249.field3312[++class308.field3811 - 1] = client.field2388 & 3;
                     return 1;
                  } else if(var0 == 6520) {
                     return 1;
                  } else if(var0 == 6521) {
                     return 1;
                  } else if(var0 == 6522) {
                     --class103.field1146;
                     --class308.field3811;
                     return 1;
                  } else if(var0 == 6523) {
                     --class103.field1146;
                     --class308.field3811;
                     return 1;
                  } else if(var0 == 6524) {
                     class249.field3312[++class308.field3811 - 1] = -1;
                     return 1;
                  } else if(var0 == 6525) {
                     class249.field3312[++class308.field3811 - 1] = 1;
                     return 1;
                  } else if(var0 == 6526) {
                     class249.field3312[++class308.field3811 - 1] = 1;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var7 = class249.field3312[--class308.field3811];
               if(var7 >= 0 && var7 < field944) {
                  var4 = field947[var7];
                  class249.field3312[++class308.field3811 - 1] = var4.field958;
                  class249.field3312[++class308.field3811 - 1] = var4.field953;
                  class249.field3313[++class103.field1146 - 1] = var4.field956;
                  class249.field3312[++class308.field3811 - 1] = var4.field957;
                  class249.field3312[++class308.field3811 - 1] = var4.field952;
                  class249.field3313[++class103.field1146 - 1] = var4.field955;
               } else {
                  class249.field3312[++class308.field3811 - 1] = -1;
                  class249.field3312[++class308.field3811 - 1] = 0;
                  class249.field3313[++class103.field1146 - 1] = "";
                  class249.field3312[++class308.field3811 - 1] = 0;
                  class249.field3312[++class308.field3811 - 1] = 0;
                  class249.field3313[++class103.field1146 - 1] = "";
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
   static final void method1679(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(class80.method1596(var0)) {
         class218.field2973 = null;
         class304.method5998(class187.field2547[var0], -1, var1, var2, var3, var4, var5, var6, var7);
         if(class218.field2973 != null) {
            class304.method5998(class218.field2973, -1412584499, var1, var2, var3, var4, class149.field1849, class54.field661, var7);
            class218.field2973 = null;
         }

      } else {
         if(var7 != -1) {
            client.field2351[var7] = true;
         } else {
            for(int var8 = 0; var8 < 100; ++var8) {
               client.field2351[var8] = true;
            }
         }

      }
   }
}
