package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
public class class309 extends class193 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   static class148 field3287;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -243566811
   )
   public static int field3288;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   public static class124 field3284;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -439039829
   )
   public int field3282;

   static {
      field3284 = new class124(64);
   }

   class309() {
      this.field3282 = 0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "439756199"
   )
   void method5300(Buffer var1, int var2) {
      if(var2 == 5) {
         this.field3282 = var1.readUnsignedShort();
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "-2117448778"
   )
   void method5298(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method5300(var1, var2);
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-485340687"
   )
   static int method5308(int var0, class252 var1, boolean var2) {
      if(var0 == 3600) {
         if(class295.field3180.field3526 == 0) {
            class55.field407[++class171.field1587 - 1] = -2;
         } else if(class295.field3180.field3526 == 1) {
            class55.field407[++class171.field1587 - 1] = -1;
         } else {
            class55.field407[++class171.field1587 - 1] = class295.field3180.field3520.method3635();
         }

         return 1;
      } else {
         int var3;
         if(var0 == 3601) {
            var3 = class55.field407[--class171.field1587];
            if(class295.field3180.method5812() && var3 >= 0 && var3 < class295.field3180.field3520.method3635()) {
               class155 var8 = (class155)class295.field3180.field3520.method3620(var3);
               class55.field408[++class272.field2978 - 1] = var8.method4290();
               class55.field408[++class272.field2978 - 1] = var8.method4289();
            } else {
               class55.field408[++class272.field2978 - 1] = "";
               class55.field408[++class272.field2978 - 1] = "";
            }

            return 1;
         } else if(var0 == 3602) {
            var3 = class55.field407[--class171.field1587];
            if(class295.field3180.method5812() && var3 >= 0 && var3 < class295.field3180.field3520.method3635()) {
               class55.field407[++class171.field1587 - 1] = ((class305)class295.field3180.field3520.method3620(var3)).field3265;
            } else {
               class55.field407[++class171.field1587 - 1] = 0;
            }

            return 1;
         } else if(var0 == 3603) {
            var3 = class55.field407[--class171.field1587];
            if(class295.field3180.method5812() && var3 >= 0 && var3 < class295.field3180.field3520.method3635()) {
               class55.field407[++class171.field1587 - 1] = ((class305)class295.field3180.field3520.method3620(var3)).field3261;
            } else {
               class55.field407[++class171.field1587 - 1] = 0;
            }

            return 1;
         } else {
            String var5;
            if(var0 == 3604) {
               var5 = class55.field408[--class272.field2978];
               int var6 = class55.field407[--class171.field1587];
               class122.method2259(var5, var6);
               return 1;
            } else if(var0 == 3605) {
               var5 = class55.field408[--class272.field2978];
               class295.field3180.method5836(var5);
               return 1;
            } else if(var0 == 3606) {
               var5 = class55.field408[--class272.field2978];
               class295.field3180.method5823(var5);
               return 1;
            } else if(var0 == 3607) {
               var5 = class55.field408[--class272.field2978];
               class295.field3180.method5849(var5);
               return 1;
            } else if(var0 == 3608) {
               var5 = class55.field408[--class272.field2978];
               class295.field3180.method5824(var5);
               return 1;
            } else if(var0 == 3609) {
               var5 = class55.field408[--class272.field2978];
               var5 = class298.method5189(var5);
               class55.field407[++class171.field1587 - 1] = class295.field3180.method5817(new class49(var5, class36.field277), false)?1:0;
               return 1;
            } else if(var0 == 3611) {
               if(class165.field1533 != null) {
                  class55.field408[++class272.field2978 - 1] = class165.field1533.field1693;
               } else {
                  class55.field408[++class272.field2978 - 1] = "";
               }

               return 1;
            } else if(var0 == 3612) {
               if(class165.field1533 != null) {
                  class55.field407[++class171.field1587 - 1] = class165.field1533.method3635();
               } else {
                  class55.field407[++class171.field1587 - 1] = 0;
               }

               return 1;
            } else if(var0 == 3613) {
               var3 = class55.field407[--class171.field1587];
               if(class165.field1533 != null && var3 < class165.field1533.method3635()) {
                  class55.field408[++class272.field2978 - 1] = class165.field1533.method3620(var3).method4300().method821();
               } else {
                  class55.field408[++class272.field2978 - 1] = "";
               }

               return 1;
            } else if(var0 == 3614) {
               var3 = class55.field407[--class171.field1587];
               if(class165.field1533 != null && var3 < class165.field1533.method3635()) {
                  class55.field407[++class171.field1587 - 1] = ((class305)class165.field1533.method3620(var3)).method5266();
               } else {
                  class55.field407[++class171.field1587 - 1] = 0;
               }

               return 1;
            } else if(var0 == 3615) {
               var3 = class55.field407[--class171.field1587];
               if(class165.field1533 != null && var3 < class165.field1533.method3635()) {
                  class55.field407[++class171.field1587 - 1] = ((class305)class165.field1533.method3620(var3)).field3261;
               } else {
                  class55.field407[++class171.field1587 - 1] = 0;
               }

               return 1;
            } else if(var0 == 3616) {
               class55.field407[++class171.field1587 - 1] = class165.field1533 != null?class165.field1533.field1694:0;
               return 1;
            } else if(var0 == 3617) {
               var5 = class55.field408[--class272.field2978];
               class326.method5780(var5);
               return 1;
            } else if(var0 == 3618) {
               class55.field407[++class171.field1587 - 1] = class165.field1533 != null?class165.field1533.field1696:0;
               return 1;
            } else if(var0 == 3619) {
               var5 = class55.field408[--class272.field2978];
               class78.method1191(var5);
               return 1;
            } else if(var0 == 3620) {
               class41.method722();
               return 1;
            } else if(var0 == 3621) {
               if(!class295.field3180.method5812()) {
                  class55.field407[++class171.field1587 - 1] = -1;
               } else {
                  class55.field407[++class171.field1587 - 1] = class295.field3180.field3522.method3635();
               }

               return 1;
            } else if(var0 == 3622) {
               var3 = class55.field407[--class171.field1587];
               if(class295.field3180.method5812() && var3 >= 0 && var3 < class295.field3180.field3522.method3635()) {
                  class250 var4 = (class250)class295.field3180.field3522.method3620(var3);
                  class55.field408[++class272.field2978 - 1] = var4.method4290();
                  class55.field408[++class272.field2978 - 1] = var4.method4289();
               } else {
                  class55.field408[++class272.field2978 - 1] = "";
                  class55.field408[++class272.field2978 - 1] = "";
               }

               return 1;
            } else if(var0 == 3623) {
               var5 = class55.field408[--class272.field2978];
               var5 = class298.method5189(var5);
               class55.field407[++class171.field1587 - 1] = class295.field3180.method5818(new class49(var5, class36.field277))?1:0;
               return 1;
            } else if(var0 == 3624) {
               var3 = class55.field407[--class171.field1587];
               if(class165.field1533 != null && var3 < class165.field1533.method3635() && class165.field1533.method3620(var3).method4300().equals(class5.field43.field577)) {
                  class55.field407[++class171.field1587 - 1] = 1;
               } else {
                  class55.field407[++class171.field1587 - 1] = 0;
               }

               return 1;
            } else if(var0 == 3625) {
               if(class165.field1533 != null && class165.field1533.field1695 != null) {
                  class55.field408[++class272.field2978 - 1] = class165.field1533.field1695;
               } else {
                  class55.field408[++class272.field2978 - 1] = "";
               }

               return 1;
            } else if(var0 == 3626) {
               var3 = class55.field407[--class171.field1587];
               if(class165.field1533 != null && var3 < class165.field1533.method3635() && ((class241)class165.field1533.method3620(var3)).method4268()) {
                  class55.field407[++class171.field1587 - 1] = 1;
               } else {
                  class55.field407[++class171.field1587 - 1] = 0;
               }

               return 1;
            } else if(var0 != 3627) {
               if(var0 == 3628) {
                  class295.field3180.field3520.method3674();
                  return 1;
               } else {
                  boolean var7;
                  if(var0 == 3629) {
                     var7 = class55.field407[--class171.field1587] == 1;
                     class295.field3180.field3520.method3643(new class65(var7));
                     return 1;
                  } else if(var0 == 3630) {
                     var7 = class55.field407[--class171.field1587] == 1;
                     class295.field3180.field3520.method3643(new class162(var7));
                     return 1;
                  } else if(var0 == 3631) {
                     var7 = class55.field407[--class171.field1587] == 1;
                     class295.field3180.field3520.method3643(new class13(var7));
                     return 1;
                  } else if(var0 == 3632) {
                     var7 = class55.field407[--class171.field1587] == 1;
                     class295.field3180.field3520.method3643(new class318(var7));
                     return 1;
                  } else if(var0 == 3633) {
                     var7 = class55.field407[--class171.field1587] == 1;
                     class295.field3180.field3520.method3643(new class80(var7));
                     return 1;
                  } else if(var0 == 3634) {
                     var7 = class55.field407[--class171.field1587] == 1;
                     class295.field3180.field3520.method3643(new class35(var7));
                     return 1;
                  } else if(var0 == 3635) {
                     var7 = class55.field407[--class171.field1587] == 1;
                     class295.field3180.field3520.method3643(new class104(var7));
                     return 1;
                  } else if(var0 == 3636) {
                     var7 = class55.field407[--class171.field1587] == 1;
                     class295.field3180.field3520.method3643(new class247(var7));
                     return 1;
                  } else if(var0 == 3637) {
                     var7 = class55.field407[--class171.field1587] == 1;
                     class295.field3180.field3520.method3643(new class21(var7));
                     return 1;
                  } else if(var0 == 3638) {
                     var7 = class55.field407[--class171.field1587] == 1;
                     class295.field3180.field3520.method3643(new class17(var7));
                     return 1;
                  } else if(var0 == 3639) {
                     class295.field3180.field3520.method3633();
                     return 1;
                  } else if(var0 == 3640) {
                     class295.field3180.field3522.method3674();
                     return 1;
                  } else if(var0 == 3641) {
                     var7 = class55.field407[--class171.field1587] == 1;
                     class295.field3180.field3522.method3643(new class65(var7));
                     return 1;
                  } else if(var0 == 3642) {
                     var7 = class55.field407[--class171.field1587] == 1;
                     class295.field3180.field3522.method3643(new class162(var7));
                     return 1;
                  } else if(var0 == 3643) {
                     class295.field3180.field3522.method3633();
                     return 1;
                  } else if(var0 == 3644) {
                     if(class165.field1533 != null) {
                        class165.field1533.method3674();
                     }

                     return 1;
                  } else if(var0 == 3645) {
                     var7 = class55.field407[--class171.field1587] == 1;
                     if(class165.field1533 != null) {
                        class165.field1533.method3643(new class65(var7));
                     }

                     return 1;
                  } else if(var0 == 3646) {
                     var7 = class55.field407[--class171.field1587] == 1;
                     if(class165.field1533 != null) {
                        class165.field1533.method3643(new class162(var7));
                     }

                     return 1;
                  } else if(var0 == 3647) {
                     var7 = class55.field407[--class171.field1587] == 1;
                     if(class165.field1533 != null) {
                        class165.field1533.method3643(new class13(var7));
                     }

                     return 1;
                  } else if(var0 == 3648) {
                     var7 = class55.field407[--class171.field1587] == 1;
                     if(class165.field1533 != null) {
                        class165.field1533.method3643(new class318(var7));
                     }

                     return 1;
                  } else if(var0 == 3649) {
                     var7 = class55.field407[--class171.field1587] == 1;
                     if(class165.field1533 != null) {
                        class165.field1533.method3643(new class80(var7));
                     }

                     return 1;
                  } else if(var0 == 3650) {
                     var7 = class55.field407[--class171.field1587] == 1;
                     if(class165.field1533 != null) {
                        class165.field1533.method3643(new class35(var7));
                     }

                     return 1;
                  } else if(var0 == 3651) {
                     var7 = class55.field407[--class171.field1587] == 1;
                     if(class165.field1533 != null) {
                        class165.field1533.method3643(new class104(var7));
                     }

                     return 1;
                  } else if(var0 == 3652) {
                     var7 = class55.field407[--class171.field1587] == 1;
                     if(class165.field1533 != null) {
                        class165.field1533.method3643(new class247(var7));
                     }

                     return 1;
                  } else if(var0 == 3653) {
                     var7 = class55.field407[--class171.field1587] == 1;
                     if(class165.field1533 != null) {
                        class165.field1533.method3643(new class21(var7));
                     }

                     return 1;
                  } else if(var0 == 3654) {
                     var7 = class55.field407[--class171.field1587] == 1;
                     if(class165.field1533 != null) {
                        class165.field1533.method3643(new class17(var7));
                     }

                     return 1;
                  } else if(var0 == 3655) {
                     if(class165.field1533 != null) {
                        class165.field1533.method3633();
                     }

                     return 1;
                  } else if(var0 == 3656) {
                     var7 = class55.field407[--class171.field1587] == 1;
                     class295.field3180.field3520.method3643(new class199(var7));
                     return 1;
                  } else if(var0 == 3657) {
                     var7 = class55.field407[--class171.field1587] == 1;
                     if(class165.field1533 != null) {
                        class165.field1533.method3643(new class199(var7));
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var3 = class55.field407[--class171.field1587];
               if(class165.field1533 != null && var3 < class165.field1533.method3635() && ((class241)class165.field1533.method3620(var3)).method4273()) {
                  class55.field407[++class171.field1587 - 1] = 1;
               } else {
                  class55.field407[++class171.field1587 - 1] = 0;
               }

               return 1;
            }
         }
      }
   }
}
