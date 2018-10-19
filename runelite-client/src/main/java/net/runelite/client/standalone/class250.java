package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSIgnore;
import net.runelite.rs.api.RSName;

@ObfuscatedName("kl")
public class class250 extends class242 implements RSIgnore {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 754238223
   )
   int field2475;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lkl;I)I",
      garbageValue = "1437444012"
   )
   int method4495(class250 var1) {
      return this.field2475 - var1.field2475;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(Ljb;I)I",
      garbageValue = "-960653255"
   )
   public int vmethod4496(class242 var1) {
      return this.method4495((class250)var1);
   }

   public int compareTo(Object var1) {
      return this.method4495((class250)var1);
   }

   public String getName() {
      return this.getRsName().getName();
   }

   public String getPrevName() {
      RSName var1 = this.getRsPrevName();
      return var1 == null?null:var1.getName();
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-717940370"
   )
   static int method4501(int var0, class252 var1, boolean var2) {
      int var3;
      if(var0 == 6600) {
         var3 = class315.plane;
         int var9 = (class5.field43.field1277 >> 7) + class296.somex;
         int var5 = (class5.field43.field1259 >> 7) + class284.somey;
         class180.method3021().method1341(var3, var9, var5, true);
         return 1;
      } else {
         class87 var11;
         if(var0 == 6601) {
            var3 = class55.field407[--class171.field1587];
            String var16 = "";
            var11 = class180.method3021().method1473(var3);
            if(var11 != null) {
               var16 = var11.method1266();
            }

            class55.field408[++class272.field2978 - 1] = var16;
            return 1;
         } else if(var0 == 6602) {
            var3 = class55.field407[--class171.field1587];
            class180.method3021().method1345(var3);
            return 1;
         } else if(var0 == 6603) {
            class55.field407[++class171.field1587 - 1] = class180.method3021().method1356();
            return 1;
         } else if(var0 == 6604) {
            var3 = class55.field407[--class171.field1587];
            class180.method3021().method1353(var3);
            return 1;
         } else if(var0 == 6605) {
            class55.field407[++class171.field1587 - 1] = class180.method3021().method1451()?1:0;
            return 1;
         } else {
            class34 var15;
            if(var0 == 6606) {
               var15 = new class34(class55.field407[--class171.field1587]);
               class180.method3021().method1438(var15.field268, var15.field266);
               return 1;
            } else if(var0 == 6607) {
               var15 = new class34(class55.field407[--class171.field1587]);
               class180.method3021().method1465(var15.field268, var15.field266);
               return 1;
            } else if(var0 == 6608) {
               var15 = new class34(class55.field407[--class171.field1587]);
               class180.method3021().method1362(var15.field267, var15.field268, var15.field266);
               return 1;
            } else if(var0 == 6609) {
               var15 = new class34(class55.field407[--class171.field1587]);
               class180.method3021().method1363(var15.field267, var15.field268, var15.field266);
               return 1;
            } else if(var0 == 6610) {
               class55.field407[++class171.field1587 - 1] = class180.method3021().method1364();
               class55.field407[++class171.field1587 - 1] = class180.method3021().method1365();
               return 1;
            } else {
               class87 var13;
               if(var0 == 6611) {
                  var3 = class55.field407[--class171.field1587];
                  var13 = class180.method3021().method1473(var3);
                  if(var13 == null) {
                     class55.field407[++class171.field1587 - 1] = 0;
                  } else {
                     class55.field407[++class171.field1587 - 1] = var13.method1303().method555();
                  }

                  return 1;
               } else if(var0 == 6612) {
                  var3 = class55.field407[--class171.field1587];
                  var13 = class180.method3021().method1473(var3);
                  if(var13 == null) {
                     class55.field407[++class171.field1587 - 1] = 0;
                     class55.field407[++class171.field1587 - 1] = 0;
                  } else {
                     class55.field407[++class171.field1587 - 1] = (var13.method1270() - var13.method1269() + 1) * 64;
                     class55.field407[++class171.field1587 - 1] = (var13.method1272() - var13.method1302() + 1) * 64;
                  }

                  return 1;
               } else if(var0 == 6613) {
                  var3 = class55.field407[--class171.field1587];
                  var13 = class180.method3021().method1473(var3);
                  if(var13 == null) {
                     class55.field407[++class171.field1587 - 1] = 0;
                     class55.field407[++class171.field1587 - 1] = 0;
                     class55.field407[++class171.field1587 - 1] = 0;
                     class55.field407[++class171.field1587 - 1] = 0;
                  } else {
                     class55.field407[++class171.field1587 - 1] = var13.method1269() * 64;
                     class55.field407[++class171.field1587 - 1] = var13.method1302() * 64;
                     class55.field407[++class171.field1587 - 1] = var13.method1270() * 64 + 64 - 1;
                     class55.field407[++class171.field1587 - 1] = var13.method1272() * 64 + 64 - 1;
                  }

                  return 1;
               } else if(var0 == 6614) {
                  var3 = class55.field407[--class171.field1587];
                  var13 = class180.method3021().method1473(var3);
                  if(var13 == null) {
                     class55.field407[++class171.field1587 - 1] = -1;
                  } else {
                     class55.field407[++class171.field1587 - 1] = var13.method1293();
                  }

                  return 1;
               } else if(var0 == 6615) {
                  var15 = class180.method3021().method1366();
                  if(var15 == null) {
                     class55.field407[++class171.field1587 - 1] = -1;
                     class55.field407[++class171.field1587 - 1] = -1;
                  } else {
                     class55.field407[++class171.field1587 - 1] = var15.field268;
                     class55.field407[++class171.field1587 - 1] = var15.field266;
                  }

                  return 1;
               } else if(var0 == 6616) {
                  class55.field407[++class171.field1587 - 1] = class180.method3021().method1343();
                  return 1;
               } else if(var0 == 6617) {
                  var15 = new class34(class55.field407[--class171.field1587]);
                  var13 = class180.method3021().method1344();
                  if(var13 == null) {
                     class55.field407[++class171.field1587 - 1] = -1;
                     class55.field407[++class171.field1587 - 1] = -1;
                     return 1;
                  } else {
                     int[] var14 = var13.method1260(var15.field267, var15.field268, var15.field266);
                     if(var14 == null) {
                        class55.field407[++class171.field1587 - 1] = -1;
                        class55.field407[++class171.field1587 - 1] = -1;
                     } else {
                        class55.field407[++class171.field1587 - 1] = var14[0];
                        class55.field407[++class171.field1587 - 1] = var14[1];
                     }

                     return 1;
                  }
               } else {
                  class34 var7;
                  if(var0 == 6618) {
                     var15 = new class34(class55.field407[--class171.field1587]);
                     var13 = class180.method3021().method1344();
                     if(var13 == null) {
                        class55.field407[++class171.field1587 - 1] = -1;
                        class55.field407[++class171.field1587 - 1] = -1;
                        return 1;
                     } else {
                        var7 = var13.method1280(var15.field268, var15.field266);
                        if(var7 == null) {
                           class55.field407[++class171.field1587 - 1] = -1;
                        } else {
                           class55.field407[++class171.field1587 - 1] = var7.method555();
                        }

                        return 1;
                     }
                  } else {
                     class34 var12;
                     if(var0 == 6619) {
                        class171.field1587 -= 2;
                        var3 = class55.field407[class171.field1587];
                        var12 = new class34(class55.field407[class171.field1587 + 1]);
                        class323.method5724(var3, var12, false);
                        return 1;
                     } else if(var0 == 6620) {
                        class171.field1587 -= 2;
                        var3 = class55.field407[class171.field1587];
                        var12 = new class34(class55.field407[class171.field1587 + 1]);
                        class323.method5724(var3, var12, true);
                        return 1;
                     } else if(var0 == 6621) {
                        class171.field1587 -= 2;
                        var3 = class55.field407[class171.field1587];
                        var12 = new class34(class55.field407[class171.field1587 + 1]);
                        var11 = class180.method3021().method1473(var3);
                        if(var11 == null) {
                           class55.field407[++class171.field1587 - 1] = 0;
                           return 1;
                        } else {
                           class55.field407[++class171.field1587 - 1] = var11.method1258(var12.field267, var12.field268, var12.field266)?1:0;
                           return 1;
                        }
                     } else if(var0 == 6622) {
                        class55.field407[++class171.field1587 - 1] = class180.method3021().method1367();
                        class55.field407[++class171.field1587 - 1] = class180.method3021().method1368();
                        return 1;
                     } else if(var0 == 6623) {
                        var15 = new class34(class55.field407[--class171.field1587]);
                        var13 = class180.method3021().method1383(var15.field267, var15.field268, var15.field266);
                        if(var13 == null) {
                           class55.field407[++class171.field1587 - 1] = -1;
                        } else {
                           class55.field407[++class171.field1587 - 1] = var13.method1294();
                        }

                        return 1;
                     } else if(var0 == 6624) {
                        class180.method3021().method1369(class55.field407[--class171.field1587]);
                        return 1;
                     } else if(var0 == 6625) {
                        class180.method3021().method1370();
                        return 1;
                     } else if(var0 == 6626) {
                        class180.method3021().method1371(class55.field407[--class171.field1587]);
                        return 1;
                     } else if(var0 == 6627) {
                        class180.method3021().method1372();
                        return 1;
                     } else {
                        boolean var10;
                        if(var0 == 6628) {
                           var10 = class55.field407[--class171.field1587] == 1;
                           class180.method3021().method1373(var10);
                           return 1;
                        } else if(var0 == 6629) {
                           var3 = class55.field407[--class171.field1587];
                           class180.method3021().method1385(var3);
                           return 1;
                        } else if(var0 == 6630) {
                           var3 = class55.field407[--class171.field1587];
                           class180.method3021().method1375(var3);
                           return 1;
                        } else if(var0 == 6631) {
                           class180.method3021().method1357();
                           return 1;
                        } else if(var0 == 6632) {
                           var10 = class55.field407[--class171.field1587] == 1;
                           class180.method3021().method1377(var10);
                           return 1;
                        } else {
                           boolean var4;
                           if(var0 == 6633) {
                              class171.field1587 -= 2;
                              var3 = class55.field407[class171.field1587];
                              var4 = class55.field407[class171.field1587 + 1] == 1;
                              class180.method3021().method1497(var3, var4);
                              return 1;
                           } else if(var0 == 6634) {
                              class171.field1587 -= 2;
                              var3 = class55.field407[class171.field1587];
                              var4 = class55.field407[class171.field1587 + 1] == 1;
                              class180.method3021().method1379(var3, var4);
                              return 1;
                           } else if(var0 == 6635) {
                              class55.field407[++class171.field1587 - 1] = class180.method3021().method1380()?1:0;
                              return 1;
                           } else if(var0 == 6636) {
                              var3 = class55.field407[--class171.field1587];
                              class55.field407[++class171.field1587 - 1] = class180.method3021().method1340(var3)?1:0;
                              return 1;
                           } else if(var0 == 6637) {
                              var3 = class55.field407[--class171.field1587];
                              class55.field407[++class171.field1587 - 1] = class180.method3021().method1382(var3)?1:0;
                              return 1;
                           } else if(var0 == 6638) {
                              class171.field1587 -= 2;
                              var3 = class55.field407[class171.field1587];
                              var12 = new class34(class55.field407[class171.field1587 + 1]);
                              var7 = class180.method3021().method1376(var3, var12);
                              if(var7 == null) {
                                 class55.field407[++class171.field1587 - 1] = -1;
                              } else {
                                 class55.field407[++class171.field1587 - 1] = var7.method555();
                              }

                              return 1;
                           } else {
                              class2 var8;
                              if(var0 == 6639) {
                                 var8 = class180.method3021().method1387();
                                 if(var8 == null) {
                                    class55.field407[++class171.field1587 - 1] = -1;
                                    class55.field407[++class171.field1587 - 1] = -1;
                                 } else {
                                    class55.field407[++class171.field1587 - 1] = var8.field23;
                                    class55.field407[++class171.field1587 - 1] = var8.field24.method555();
                                 }

                                 return 1;
                              } else if(var0 == 6640) {
                                 var8 = class180.method3021().method1468();
                                 if(var8 == null) {
                                    class55.field407[++class171.field1587 - 1] = -1;
                                    class55.field407[++class171.field1587 - 1] = -1;
                                 } else {
                                    class55.field407[++class171.field1587 - 1] = var8.field23;
                                    class55.field407[++class171.field1587 - 1] = var8.field24.method555();
                                 }

                                 return 1;
                              } else {
                                 class191 var6;
                                 if(var0 == 6693) {
                                    var3 = class55.field407[--class171.field1587];
                                    var6 = class59.method1036(var3);
                                    if(var6.field1821 == null) {
                                       class55.field408[++class272.field2978 - 1] = "";
                                    } else {
                                       class55.field408[++class272.field2978 - 1] = var6.field1821;
                                    }

                                    return 1;
                                 } else if(var0 == 6694) {
                                    var3 = class55.field407[--class171.field1587];
                                    var6 = class59.method1036(var3);
                                    class55.field407[++class171.field1587 - 1] = var6.field1825;
                                    return 1;
                                 } else if(var0 == 6695) {
                                    var3 = class55.field407[--class171.field1587];
                                    var6 = class59.method1036(var3);
                                    if(var6 == null) {
                                       class55.field407[++class171.field1587 - 1] = -1;
                                    } else {
                                       class55.field407[++class171.field1587 - 1] = var6.field1837;
                                    }

                                    return 1;
                                 } else if(var0 == 6696) {
                                    var3 = class55.field407[--class171.field1587];
                                    var6 = class59.method1036(var3);
                                    if(var6 == null) {
                                       class55.field407[++class171.field1587 - 1] = -1;
                                    } else {
                                       class55.field407[++class171.field1587 - 1] = var6.field1817;
                                    }

                                    return 1;
                                 } else if(var0 == 6697) {
                                    class55.field407[++class171.field1587 - 1] = class31.field254.field3504;
                                    return 1;
                                 } else if(var0 == 6698) {
                                    class55.field407[++class171.field1587 - 1] = class31.field254.field3505.method555();
                                    return 1;
                                 } else if(var0 == 6699) {
                                    class55.field407[++class171.field1587 - 1] = class31.field254.field3503.method555();
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
