package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSIgnore;
import net.runelite.rs.api.RSName;

@ObfuscatedName("kl")
public class class292 extends class330 implements RSIgnore {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 754238223
   )
   int field3655;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lkl;I)I",
      garbageValue = "1437444012"
   )
   int method5709(class292 var1) {
      return this.field3655 - var1.field3655;
   }

   public int compareTo(Object var1) {
      return this.method5709((class292)var1);
   }

   public String getName() {
      return this.getRsName().getName();
   }

   public String getPrevName() {
      RSName var1 = this.getRsPrevName();
      return var1 == null?null:var1.getName();
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(Ljb;I)I",
      garbageValue = "-960653255"
   )
   public int vmethod6331(class330 var1) {
      return this.method5709((class292)var1);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-717940370"
   )
   static int method5715(int var0, class296 var1, boolean var2) {
      int var3;
      if(var0 == 6600) {
         var3 = class260.field3393;
         int var9 = (class32.field303.field1090 >> 7) + class229.field3067;
         int var5 = (class32.field303.field1072 >> 7) + class35.field360;
         class218.method4500().method5500(var3, var9, var5, true);
         return 1;
      } else {
         class149 var11;
         if(var0 == 6601) {
            var3 = class249.field3312[--class308.field3811];
            String var16 = "";
            var11 = class218.method4500().method5632(var3);
            if(var11 != null) {
               var16 = var11.method2698();
            }

            class249.field3313[++class103.field1146 - 1] = var16;
            return 1;
         } else if(var0 == 6602) {
            var3 = class249.field3312[--class308.field3811];
            class218.method4500().method5504(var3);
            return 1;
         } else if(var0 == 6603) {
            class249.field3312[++class308.field3811 - 1] = class218.method4500().method5515();
            return 1;
         } else if(var0 == 6604) {
            var3 = class249.field3312[--class308.field3811];
            class218.method4500().method5512(var3);
            return 1;
         } else if(var0 == 6605) {
            class249.field3312[++class308.field3811 - 1] = class218.method4500().method5610()?1:0;
            return 1;
         } else {
            class58 var15;
            if(var0 == 6606) {
               var15 = new class58(class249.field3312[--class308.field3811]);
               class218.method4500().method5597(var15.field719, var15.field717);
               return 1;
            } else if(var0 == 6607) {
               var15 = new class58(class249.field3312[--class308.field3811]);
               class218.method4500().method5624(var15.field719, var15.field717);
               return 1;
            } else if(var0 == 6608) {
               var15 = new class58(class249.field3312[--class308.field3811]);
               class218.method4500().method5521(var15.field718, var15.field719, var15.field717);
               return 1;
            } else if(var0 == 6609) {
               var15 = new class58(class249.field3312[--class308.field3811]);
               class218.method4500().method5522(var15.field718, var15.field719, var15.field717);
               return 1;
            } else if(var0 == 6610) {
               class249.field3312[++class308.field3811 - 1] = class218.method4500().method5523();
               class249.field3312[++class308.field3811 - 1] = class218.method4500().method5524();
               return 1;
            } else {
               class149 var13;
               if(var0 == 6611) {
                  var3 = class249.field3312[--class308.field3811];
                  var13 = class218.method4500().method5632(var3);
                  if(var13 == null) {
                     class249.field3312[++class308.field3811 - 1] = 0;
                  } else {
                     class249.field3312[++class308.field3811 - 1] = var13.method2735().method1252();
                  }

                  return 1;
               } else if(var0 == 6612) {
                  var3 = class249.field3312[--class308.field3811];
                  var13 = class218.method4500().method5632(var3);
                  if(var13 == null) {
                     class249.field3312[++class308.field3811 - 1] = 0;
                     class249.field3312[++class308.field3811 - 1] = 0;
                  } else {
                     class249.field3312[++class308.field3811 - 1] = (var13.method2702() - var13.method2701() + 1) * 64;
                     class249.field3312[++class308.field3811 - 1] = (var13.method2704() - var13.method2734() + 1) * 64;
                  }

                  return 1;
               } else if(var0 == 6613) {
                  var3 = class249.field3312[--class308.field3811];
                  var13 = class218.method4500().method5632(var3);
                  if(var13 == null) {
                     class249.field3312[++class308.field3811 - 1] = 0;
                     class249.field3312[++class308.field3811 - 1] = 0;
                     class249.field3312[++class308.field3811 - 1] = 0;
                     class249.field3312[++class308.field3811 - 1] = 0;
                  } else {
                     class249.field3312[++class308.field3811 - 1] = var13.method2701() * 64;
                     class249.field3312[++class308.field3811 - 1] = var13.method2734() * 64;
                     class249.field3312[++class308.field3811 - 1] = var13.method2702() * 64 + 64 - 1;
                     class249.field3312[++class308.field3811 - 1] = var13.method2704() * 64 + 64 - 1;
                  }

                  return 1;
               } else if(var0 == 6614) {
                  var3 = class249.field3312[--class308.field3811];
                  var13 = class218.method4500().method5632(var3);
                  if(var13 == null) {
                     class249.field3312[++class308.field3811 - 1] = -1;
                  } else {
                     class249.field3312[++class308.field3811 - 1] = var13.method2725();
                  }

                  return 1;
               } else if(var0 == 6615) {
                  var15 = class218.method4500().method5525();
                  if(var15 == null) {
                     class249.field3312[++class308.field3811 - 1] = -1;
                     class249.field3312[++class308.field3811 - 1] = -1;
                  } else {
                     class249.field3312[++class308.field3811 - 1] = var15.field719;
                     class249.field3312[++class308.field3811 - 1] = var15.field717;
                  }

                  return 1;
               } else if(var0 == 6616) {
                  class249.field3312[++class308.field3811 - 1] = class218.method4500().method5502();
                  return 1;
               } else if(var0 == 6617) {
                  var15 = new class58(class249.field3312[--class308.field3811]);
                  var13 = class218.method4500().method5503();
                  if(var13 == null) {
                     class249.field3312[++class308.field3811 - 1] = -1;
                     class249.field3312[++class308.field3811 - 1] = -1;
                     return 1;
                  } else {
                     int[] var14 = var13.method2692(var15.field718, var15.field719, var15.field717);
                     if(var14 == null) {
                        class249.field3312[++class308.field3811 - 1] = -1;
                        class249.field3312[++class308.field3811 - 1] = -1;
                     } else {
                        class249.field3312[++class308.field3811 - 1] = var14[0];
                        class249.field3312[++class308.field3811 - 1] = var14[1];
                     }

                     return 1;
                  }
               } else {
                  class58 var7;
                  if(var0 == 6618) {
                     var15 = new class58(class249.field3312[--class308.field3811]);
                     var13 = class218.method4500().method5503();
                     if(var13 == null) {
                        class249.field3312[++class308.field3811 - 1] = -1;
                        class249.field3312[++class308.field3811 - 1] = -1;
                        return 1;
                     } else {
                        var7 = var13.method2712(var15.field719, var15.field717);
                        if(var7 == null) {
                           class249.field3312[++class308.field3811 - 1] = -1;
                        } else {
                           class249.field3312[++class308.field3811 - 1] = var7.method1252();
                        }

                        return 1;
                     }
                  } else {
                     class58 var12;
                     if(var0 == 6619) {
                        class308.field3811 -= 2;
                        var3 = class249.field3312[class308.field3811];
                        var12 = new class58(class249.field3312[class308.field3811 + 1]);
                        class305.method6013(var3, var12, false);
                        return 1;
                     } else if(var0 == 6620) {
                        class308.field3811 -= 2;
                        var3 = class249.field3312[class308.field3811];
                        var12 = new class58(class249.field3312[class308.field3811 + 1]);
                        class305.method6013(var3, var12, true);
                        return 1;
                     } else if(var0 == 6621) {
                        class308.field3811 -= 2;
                        var3 = class249.field3312[class308.field3811];
                        var12 = new class58(class249.field3312[class308.field3811 + 1]);
                        var11 = class218.method4500().method5632(var3);
                        if(var11 == null) {
                           class249.field3312[++class308.field3811 - 1] = 0;
                           return 1;
                        } else {
                           class249.field3312[++class308.field3811 - 1] = var11.method2690(var12.field718, var12.field719, var12.field717)?1:0;
                           return 1;
                        }
                     } else if(var0 == 6622) {
                        class249.field3312[++class308.field3811 - 1] = class218.method4500().method5526();
                        class249.field3312[++class308.field3811 - 1] = class218.method4500().method5527();
                        return 1;
                     } else if(var0 == 6623) {
                        var15 = new class58(class249.field3312[--class308.field3811]);
                        var13 = class218.method4500().method5542(var15.field718, var15.field719, var15.field717);
                        if(var13 == null) {
                           class249.field3312[++class308.field3811 - 1] = -1;
                        } else {
                           class249.field3312[++class308.field3811 - 1] = var13.method2726();
                        }

                        return 1;
                     } else if(var0 == 6624) {
                        class218.method4500().method5528(class249.field3312[--class308.field3811]);
                        return 1;
                     } else if(var0 == 6625) {
                        class218.method4500().method5529();
                        return 1;
                     } else if(var0 == 6626) {
                        class218.method4500().method5530(class249.field3312[--class308.field3811]);
                        return 1;
                     } else if(var0 == 6627) {
                        class218.method4500().method5531();
                        return 1;
                     } else {
                        boolean var10;
                        if(var0 == 6628) {
                           var10 = class249.field3312[--class308.field3811] == 1;
                           class218.method4500().method5532(var10);
                           return 1;
                        } else if(var0 == 6629) {
                           var3 = class249.field3312[--class308.field3811];
                           class218.method4500().method5544(var3);
                           return 1;
                        } else if(var0 == 6630) {
                           var3 = class249.field3312[--class308.field3811];
                           class218.method4500().method5534(var3);
                           return 1;
                        } else if(var0 == 6631) {
                           class218.method4500().method5516();
                           return 1;
                        } else if(var0 == 6632) {
                           var10 = class249.field3312[--class308.field3811] == 1;
                           class218.method4500().method5536(var10);
                           return 1;
                        } else {
                           boolean var4;
                           if(var0 == 6633) {
                              class308.field3811 -= 2;
                              var3 = class249.field3312[class308.field3811];
                              var4 = class249.field3312[class308.field3811 + 1] == 1;
                              class218.method4500().method5656(var3, var4);
                              return 1;
                           } else if(var0 == 6634) {
                              class308.field3811 -= 2;
                              var3 = class249.field3312[class308.field3811];
                              var4 = class249.field3312[class308.field3811 + 1] == 1;
                              class218.method4500().method5538(var3, var4);
                              return 1;
                           } else if(var0 == 6635) {
                              class249.field3312[++class308.field3811 - 1] = class218.method4500().method5539()?1:0;
                              return 1;
                           } else if(var0 == 6636) {
                              var3 = class249.field3312[--class308.field3811];
                              class249.field3312[++class308.field3811 - 1] = class218.method4500().method5499(var3)?1:0;
                              return 1;
                           } else if(var0 == 6637) {
                              var3 = class249.field3312[--class308.field3811];
                              class249.field3312[++class308.field3811 - 1] = class218.method4500().method5541(var3)?1:0;
                              return 1;
                           } else if(var0 == 6638) {
                              class308.field3811 -= 2;
                              var3 = class249.field3312[class308.field3811];
                              var12 = new class58(class249.field3312[class308.field3811 + 1]);
                              var7 = class218.method4500().method5535(var3, var12);
                              if(var7 == null) {
                                 class249.field3312[++class308.field3811 - 1] = -1;
                              } else {
                                 class249.field3312[++class308.field3811 - 1] = var7.method1252();
                              }

                              return 1;
                           } else {
                              class23 var8;
                              if(var0 == 6639) {
                                 var8 = class218.method4500().method5546();
                                 if(var8 == null) {
                                    class249.field3312[++class308.field3811 - 1] = -1;
                                    class249.field3312[++class308.field3811 - 1] = -1;
                                 } else {
                                    class249.field3312[++class308.field3811 - 1] = var8.field258;
                                    class249.field3312[++class308.field3811 - 1] = var8.field259.method1252();
                                 }

                                 return 1;
                              } else if(var0 == 6640) {
                                 var8 = class218.method4500().method5627();
                                 if(var8 == null) {
                                    class249.field3312[++class308.field3811 - 1] = -1;
                                    class249.field3312[++class308.field3811 - 1] = -1;
                                 } else {
                                    class249.field3312[++class308.field3811 - 1] = var8.field258;
                                    class249.field3312[++class308.field3811 - 1] = var8.field259.method1252();
                                 }

                                 return 1;
                              } else {
                                 class123 var6;
                                 if(var0 == 6693) {
                                    var3 = class249.field3312[--class308.field3811];
                                    var6 = class133.method2550(var3);
                                    if(var6.field1668 == null) {
                                       class249.field3313[++class103.field1146 - 1] = "";
                                    } else {
                                       class249.field3313[++class103.field1146 - 1] = var6.field1668;
                                    }

                                    return 1;
                                 } else if(var0 == 6694) {
                                    var3 = class249.field3312[--class308.field3811];
                                    var6 = class133.method2550(var3);
                                    class249.field3312[++class308.field3811 - 1] = var6.field1672;
                                    return 1;
                                 } else if(var0 == 6695) {
                                    var3 = class249.field3312[--class308.field3811];
                                    var6 = class133.method2550(var3);
                                    if(var6 == null) {
                                       class249.field3312[++class308.field3811 - 1] = -1;
                                    } else {
                                       class249.field3312[++class308.field3811 - 1] = var6.field1684;
                                    }

                                    return 1;
                                 } else if(var0 == 6696) {
                                    var3 = class249.field3312[--class308.field3811];
                                    var6 = class133.method2550(var3);
                                    if(var6 == null) {
                                       class249.field3312[++class308.field3811 - 1] = -1;
                                    } else {
                                       class249.field3312[++class308.field3811 - 1] = var6.field1664;
                                    }

                                    return 1;
                                 } else if(var0 == 6697) {
                                    class249.field3312[++class308.field3811 - 1] = class185.field2527.field3679;
                                    return 1;
                                 } else if(var0 == 6698) {
                                    class249.field3312[++class308.field3811 - 1] = class185.field2527.field3680.method1252();
                                    return 1;
                                 } else if(var0 == 6699) {
                                    class249.field3312[++class308.field3811 - 1] = class185.field2527.field3678.method1252();
                                    return 1;
                                 } else {
                                    return 2;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
