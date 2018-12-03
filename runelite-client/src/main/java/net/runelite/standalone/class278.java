package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
public class class278 extends class324 {
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -243566811
   )
   public static int field3519;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   static class217 field3518;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   public static class100 field3515;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -439039829
   )
   public int field3513;

   static {
      field3515 = new class100(64);
   }

   class278() {
      this.field3513 = 0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "439756199"
   )
   void method5388(Buffer var1, int var2) {
      if(var2 == 5) {
         this.field3513 = var1.readShort();
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "-2117448778"
   )
   void method5386(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method5388(var1, var2);
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-485340687"
   )
   static int method5396(int var0, class296 var1, boolean var2) {
      if(var0 == 3600) {
         if(class202.field2845.field1952 == 0) {
            class249.field3312[++class308.field3811 - 1] = -2;
         } else if(class202.field2845.field1952 == 1) {
            class249.field3312[++class308.field3811 - 1] = -1;
         } else {
            class249.field3312[++class308.field3811 - 1] = class202.field2845.field1946.method3041();
         }

         return 1;
      } else {
         int var3;
         if(var0 == 3601) {
            var3 = class249.field3312[--class308.field3811];
            if(class202.field2845.method2892() && var3 >= 0 && var3 < class202.field2845.field1946.method3041()) {
               class73 var8 = (class73)class202.field2845.field1946.method3026(var3);
               class249.field3313[++class103.field1146 - 1] = var8.method6328();
               class249.field3313[++class103.field1146 - 1] = var8.method6327();
            } else {
               class249.field3313[++class103.field1146 - 1] = "";
               class249.field3313[++class103.field1146 - 1] = "";
            }

            return 1;
         } else if(var0 == 3602) {
            var3 = class249.field3312[--class308.field3811];
            if(class202.field2845.method2892() && var3 >= 0 && var3 < class202.field2845.field1946.method3041()) {
               class249.field3312[++class308.field3811 - 1] = ((class62)class202.field2845.field1946.method3026(var3)).field737;
            } else {
               class249.field3312[++class308.field3811 - 1] = 0;
            }

            return 1;
         } else if(var0 == 3603) {
            var3 = class249.field3312[--class308.field3811];
            if(class202.field2845.method2892() && var3 >= 0 && var3 < class202.field2845.field1946.method3041()) {
               class249.field3312[++class308.field3811 - 1] = ((class62)class202.field2845.field1946.method3026(var3)).field733;
            } else {
               class249.field3312[++class308.field3811 - 1] = 0;
            }

            return 1;
         } else {
            String var5;
            if(var0 == 3604) {
               var5 = class249.field3313[--class103.field1146];
               int var6 = class249.field3312[--class308.field3811];
               class295.method5781(var5, var6);
               return 1;
            } else if(var0 == 3605) {
               var5 = class249.field3313[--class103.field1146];
               class202.field2845.method2916(var5);
               return 1;
            } else if(var0 == 3606) {
               var5 = class249.field3313[--class103.field1146];
               class202.field2845.method2903(var5);
               return 1;
            } else if(var0 == 3607) {
               var5 = class249.field3313[--class103.field1146];
               class202.field2845.method2929(var5);
               return 1;
            } else if(var0 == 3608) {
               var5 = class249.field3313[--class103.field1146];
               class202.field2845.method2904(var5);
               return 1;
            } else if(var0 == 3609) {
               var5 = class249.field3313[--class103.field1146];
               var5 = class216.method4394(var5);
               class249.field3312[++class308.field3811 - 1] = class202.field2845.method2897(new class158(var5, class140.field1794), false)?1:0;
               return 1;
            } else if(var0 == 3611) {
               if(class250.field3328 != null) {
                  class249.field3313[++class103.field1146 - 1] = class250.field3328.field3343;
               } else {
                  class249.field3313[++class103.field1146 - 1] = "";
               }

               return 1;
            } else if(var0 == 3612) {
               if(class250.field3328 != null) {
                  class249.field3312[++class308.field3811 - 1] = class250.field3328.method3041();
               } else {
                  class249.field3312[++class308.field3811 - 1] = 0;
               }

               return 1;
            } else if(var0 == 3613) {
               var3 = class249.field3312[--class308.field3811];
               if(class250.field3328 != null && var3 < class250.field3328.method3041()) {
                  class249.field3313[++class103.field1146 - 1] = class250.field3328.method3026(var3).method6338().method2869();
               } else {
                  class249.field3313[++class103.field1146 - 1] = "";
               }

               return 1;
            } else if(var0 == 3614) {
               var3 = class249.field3312[--class308.field3811];
               if(class250.field3328 != null && var3 < class250.field3328.method3041()) {
                  class249.field3312[++class308.field3811 - 1] = ((class62)class250.field3328.method3026(var3)).method1339();
               } else {
                  class249.field3312[++class308.field3811 - 1] = 0;
               }

               return 1;
            } else if(var0 == 3615) {
               var3 = class249.field3312[--class308.field3811];
               if(class250.field3328 != null && var3 < class250.field3328.method3041()) {
                  class249.field3312[++class308.field3811 - 1] = ((class62)class250.field3328.method3026(var3)).field733;
               } else {
                  class249.field3312[++class308.field3811 - 1] = 0;
               }

               return 1;
            } else if(var0 == 3616) {
               class249.field3312[++class308.field3811 - 1] = class250.field3328 != null?class250.field3328.field3344:0;
               return 1;
            } else if(var0 == 3617) {
               var5 = class249.field3313[--class103.field1146];
               class294.method5778(var5);
               return 1;
            } else if(var0 == 3618) {
               class249.field3312[++class308.field3811 - 1] = class250.field3328 != null?class250.field3328.field3346:0;
               return 1;
            } else if(var0 == 3619) {
               var5 = class249.field3313[--class103.field1146];
               class226.method4567(var5);
               return 1;
            } else if(var0 == 3620) {
               class53.method1223();
               return 1;
            } else if(var0 == 3621) {
               if(!class202.field2845.method2892()) {
                  class249.field3312[++class308.field3811 - 1] = -1;
               } else {
                  class249.field3312[++class308.field3811 - 1] = class202.field2845.field1948.method3041();
               }

               return 1;
            } else if(var0 == 3622) {
               var3 = class249.field3312[--class308.field3811];
               if(class202.field2845.method2892() && var3 >= 0 && var3 < class202.field2845.field1948.method3041()) {
                  class292 var4 = (class292)class202.field2845.field1948.method3026(var3);
                  class249.field3313[++class103.field1146 - 1] = var4.method6328();
                  class249.field3313[++class103.field1146 - 1] = var4.method6327();
               } else {
                  class249.field3313[++class103.field1146 - 1] = "";
                  class249.field3313[++class103.field1146 - 1] = "";
               }

               return 1;
            } else if(var0 == 3623) {
               var5 = class249.field3313[--class103.field1146];
               var5 = class216.method4394(var5);
               class249.field3312[++class308.field3811 - 1] = class202.field2845.method2898(new class158(var5, class140.field1794))?1:0;
               return 1;
            } else if(var0 == 3624) {
               var3 = class249.field3312[--class308.field3811];
               if(class250.field3328 != null && var3 < class250.field3328.method3041() && class250.field3328.method3026(var3).method6338().equals(class32.field303.field2802)) {
                  class249.field3312[++class308.field3811 - 1] = 1;
               } else {
                  class249.field3312[++class308.field3811 - 1] = 0;
               }

               return 1;
            } else if(var0 == 3625) {
               if(class250.field3328 != null && class250.field3328.field3345 != null) {
                  class249.field3313[++class103.field1146 - 1] = class250.field3328.field3345;
               } else {
                  class249.field3313[++class103.field1146 - 1] = "";
               }

               return 1;
            } else if(var0 == 3626) {
               var3 = class249.field3312[--class308.field3811];
               if(class250.field3328 != null && var3 < class250.field3328.method3041() && ((class272)class250.field3328.method3026(var3)).method5345()) {
                  class249.field3312[++class308.field3811 - 1] = 1;
               } else {
                  class249.field3312[++class308.field3811 - 1] = 0;
               }

               return 1;
            } else if(var0 != 3627) {
               if(var0 == 3628) {
                  class202.field2845.field1946.method3080();
                  return 1;
               } else {
                  boolean var7;
                  if(var0 == 3629) {
                     var7 = class249.field3312[--class308.field3811] == 1;
                     class202.field2845.field1946.method3049(new class207(var7));
                     return 1;
                  } else if(var0 == 3630) {
                     var7 = class249.field3312[--class308.field3811] == 1;
                     class202.field2845.field1946.method3049(new class7(var7));
                     return 1;
                  } else if(var0 == 3631) {
                     var7 = class249.field3312[--class308.field3811] == 1;
                     class202.field2845.field1946.method3049(new class290(var7));
                     return 1;
                  } else if(var0 == 3632) {
                     var7 = class249.field3312[--class308.field3811] == 1;
                     class202.field2845.field1946.method3049(new class24(var7));
                     return 1;
                  } else if(var0 == 3633) {
                     var7 = class249.field3312[--class308.field3811] == 1;
                     class202.field2845.field1946.method3049(new class310(var7));
                     return 1;
                  } else if(var0 == 3634) {
                     var7 = class249.field3312[--class308.field3811] == 1;
                     class202.field2845.field1946.method3049(new class311(var7));
                     return 1;
                  } else if(var0 == 3635) {
                     var7 = class249.field3312[--class308.field3811] == 1;
                     class202.field2845.field1946.method3049(new class203(var7));
                     return 1;
                  } else if(var0 == 3636) {
                     var7 = class249.field3312[--class308.field3811] == 1;
                     class202.field2845.field1946.method3049(new class86(var7));
                     return 1;
                  } else if(var0 == 3637) {
                     var7 = class249.field3312[--class308.field3811] == 1;
                     class202.field2845.field1946.method3049(new class255(var7));
                     return 1;
                  } else if(var0 == 3638) {
                     var7 = class249.field3312[--class308.field3811] == 1;
                     class202.field2845.field1946.method3049(new class271(var7));
                     return 1;
                  } else if(var0 == 3639) {
                     class202.field2845.field1946.method3039();
                     return 1;
                  } else if(var0 == 3640) {
                     class202.field2845.field1948.method3080();
                     return 1;
                  } else if(var0 == 3641) {
                     var7 = class249.field3312[--class308.field3811] == 1;
                     class202.field2845.field1948.method3049(new class207(var7));
                     return 1;
                  } else if(var0 == 3642) {
                     var7 = class249.field3312[--class308.field3811] == 1;
                     class202.field2845.field1948.method3049(new class7(var7));
                     return 1;
                  } else if(var0 == 3643) {
                     class202.field2845.field1948.method3039();
                     return 1;
                  } else if(var0 == 3644) {
                     if(class250.field3328 != null) {
                        class250.field3328.method3080();
                     }

                     return 1;
                  } else if(var0 == 3645) {
                     var7 = class249.field3312[--class308.field3811] == 1;
                     if(class250.field3328 != null) {
                        class250.field3328.method3049(new class207(var7));
                     }

                     return 1;
                  } else if(var0 == 3646) {
                     var7 = class249.field3312[--class308.field3811] == 1;
                     if(class250.field3328 != null) {
                        class250.field3328.method3049(new class7(var7));
                     }

                     return 1;
                  } else if(var0 == 3647) {
                     var7 = class249.field3312[--class308.field3811] == 1;
                     if(class250.field3328 != null) {
                        class250.field3328.method3049(new class290(var7));
                     }

                     return 1;
                  } else if(var0 == 3648) {
                     var7 = class249.field3312[--class308.field3811] == 1;
                     if(class250.field3328 != null) {
                        class250.field3328.method3049(new class24(var7));
                     }

                     return 1;
                  } else if(var0 == 3649) {
                     var7 = class249.field3312[--class308.field3811] == 1;
                     if(class250.field3328 != null) {
                        class250.field3328.method3049(new class310(var7));
                     }

                     return 1;
                  } else if(var0 == 3650) {
                     var7 = class249.field3312[--class308.field3811] == 1;
                     if(class250.field3328 != null) {
                        class250.field3328.method3049(new class311(var7));
                     }

                     return 1;
                  } else if(var0 == 3651) {
                     var7 = class249.field3312[--class308.field3811] == 1;
                     if(class250.field3328 != null) {
                        class250.field3328.method3049(new class203(var7));
                     }

                     return 1;
                  } else if(var0 == 3652) {
                     var7 = class249.field3312[--class308.field3811] == 1;
                     if(class250.field3328 != null) {
                        class250.field3328.method3049(new class86(var7));
                     }

                     return 1;
                  } else if(var0 == 3653) {
                     var7 = class249.field3312[--class308.field3811] == 1;
                     if(class250.field3328 != null) {
                        class250.field3328.method3049(new class255(var7));
                     }

                     return 1;
                  } else if(var0 == 3654) {
                     var7 = class249.field3312[--class308.field3811] == 1;
                     if(class250.field3328 != null) {
                        class250.field3328.method3049(new class271(var7));
                     }

                     return 1;
                  } else if(var0 == 3655) {
                     if(class250.field3328 != null) {
                        class250.field3328.method3039();
                     }

                     return 1;
                  } else if(var0 == 3656) {
                     var7 = class249.field3312[--class308.field3811] == 1;
                     class202.field2845.field1946.method3049(new class113(var7));
                     return 1;
                  } else if(var0 == 3657) {
                     var7 = class249.field3312[--class308.field3811] == 1;
                     if(class250.field3328 != null) {
                        class250.field3328.method3049(new class113(var7));
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var3 = class249.field3312[--class308.field3811];
               if(class250.field3328 != null && var3 < class250.field3328.method3041() && ((class272)class250.field3328.method3026(var3)).method5350()) {
                  class249.field3312[++class308.field3811 - 1] = 1;
               } else {
                  class249.field3312[++class308.field3811 - 1] = 0;
               }

               return 1;
            }
         }
      }
   }
}
