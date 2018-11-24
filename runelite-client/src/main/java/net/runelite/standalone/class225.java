package net.runelite.standalone;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
final class class225 implements Comparator {
   @ObfuscatedName("rd")
   @ObfuscatedGetter(
      intValue = -396366625
   )
   static int field3038;
   @ObfuscatedName("p")
   static int[] field3040;
   @ObfuscatedName("cp")
   static boolean field3039;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lw;Lw;I)I",
      garbageValue = "1047733294"
   )
   int method4557(class317 var1, class317 var2) {
      return var1.field3899.field3799 < var2.field3899.field3799?-1:(var2.field3899.field3799 == var1.field3899.field3799?0:1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method4557((class317)var1, (class317)var2);
   }

   @ObfuscatedName("fh")
   @ObfuscatedSignature(
      signature = "(Lbn;IS)V",
      garbageValue = "128"
   )
   static final void method4562(class99 var0, int var1) {
      int var2;
      int var3;
      int var4;
      class312 var11;
      if(var0.field1118 > client.field2165) {
         class202.method4017(var0);
      } else {
         int var5;
         int var7;
         if(var0.field1119 >= client.field2165) {
            if(var0.field1119 == client.field2165 || var0.field1086 == -1 || var0.field1107 != 0 || var0.field1130 + 1 > class3.method74(var0.field1086).field3836[var0.field1105]) {
               var2 = var0.field1119 - var0.field1118;
               var3 = client.field2165 - var0.field1118;
               var4 = var0.field1126 * 128 + var0.field1075 * 64;
               var5 = var0.field1116 * 128 + var0.field1075 * 64;
               int var6 = var0.field1115 * 128 + var0.field1075 * 64;
               var7 = var0.field1117 * 128 + var0.field1075 * 64;
               var0.field1090 = (var6 * var3 + var4 * (var2 - var3)) / var2;
               var0.field1072 = (var3 * var7 + var5 * (var2 - var3)) / var2;
            }

            var0.field1120 = 0;
            var0.field1123 = var0.field1113;
            var0.field1073 = var0.field1123;
         } else {
            var0.field1078 = var0.field1089;
            if(var0.field1092 == 0) {
               var0.field1120 = 0;
            } else {
               label560: {
                  if(var0.field1086 != -1 && var0.field1107 == 0) {
                     var11 = class3.method74(var0.field1086);
                     if(var0.field1131 > 0 && var11.field3845 == 0) {
                        ++var0.field1120;
                        break label560;
                     }

                     if(var0.field1131 <= 0 && var11.field3829 == 0) {
                        ++var0.field1120;
                        break label560;
                     }
                  }

                  var2 = var0.field1090;
                  var3 = var0.field1072;
                  var4 = var0.field1101[var0.field1092 - 1] * 128 + var0.field1075 * 64;
                  var5 = var0.field1128[var0.field1092 - 1] * 128 + var0.field1075 * 64;
                  if(var2 < var4) {
                     if(var3 < var5) {
                        var0.field1123 = 1280;
                     } else if(var3 > var5) {
                        var0.field1123 = 1792;
                     } else {
                        var0.field1123 = 1536;
                     }
                  } else if(var2 > var4) {
                     if(var3 < var5) {
                        var0.field1123 = 768;
                     } else if(var3 > var5) {
                        var0.field1123 = 256;
                     } else {
                        var0.field1123 = 512;
                     }
                  } else if(var3 < var5) {
                     var0.field1123 = 1024;
                  } else if(var3 > var5) {
                     var0.field1123 = 0;
                  }

                  byte var14 = var0.field1129[var0.field1092 - 1];
                  if(var4 - var2 <= 256 && var4 - var2 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) {
                     var7 = var0.field1123 - var0.field1073 & 2047;
                     if(var7 > 1024) {
                        var7 -= 2048;
                     }

                     int var8 = var0.field1080;
                     if(var7 >= -256 && var7 <= 256) {
                        var8 = var0.field1103;
                     } else if(var7 >= 256 && var7 < 768) {
                        var8 = var0.field1083;
                     } else if(var7 >= -768 && var7 <= -256) {
                        var8 = var0.field1077;
                     }

                     if(var8 == -1) {
                        var8 = var0.field1103;
                     }

                     var0.field1078 = var8;
                     int var9 = 4;
                     boolean var10 = true;
                     if(var0 instanceof class176) {
                        var10 = ((class176)var0).field2437.field3867;
                     }

                     if(var10) {
                        if(var0.field1073 != var0.field1123 && var0.field1098 == -1 && var0.field1125 != 0) {
                           var9 = 2;
                        }

                        if(var0.field1092 > 2) {
                           var9 = 6;
                        }

                        if(var0.field1092 > 3) {
                           var9 = 8;
                        }

                        if(var0.field1120 > 0 && var0.field1092 > 1) {
                           var9 = 8;
                           --var0.field1120;
                        }
                     } else {
                        if(var0.field1092 > 1) {
                           var9 = 6;
                        }

                        if(var0.field1092 > 2) {
                           var9 = 8;
                        }

                        if(var0.field1120 > 0 && var0.field1092 > 1) {
                           var9 = 8;
                           --var0.field1120;
                        }
                     }

                     if(var14 == 2) {
                        var9 <<= 1;
                     }

                     if(var9 >= 8 && var0.field1078 == var0.field1103 && var0.field1084 != -1) {
                        var0.field1078 = var0.field1084;
                     }

                     if(var4 != var2 || var3 != var5) {
                        if(var2 < var4) {
                           var0.field1090 += var9;
                           if(var0.field1090 > var4) {
                              var0.field1090 = var4;
                           }
                        } else if(var2 > var4) {
                           var0.field1090 -= var9;
                           if(var0.field1090 < var4) {
                              var0.field1090 = var4;
                           }
                        }

                        if(var3 < var5) {
                           var0.field1072 += var9;
                           if(var0.field1072 > var5) {
                              var0.field1072 = var5;
                           }
                        } else if(var3 > var5) {
                           var0.field1072 -= var9;
                           if(var0.field1072 < var5) {
                              var0.field1072 = var5;
                           }
                        }
                     }

                     if(var4 == var0.field1090 && var5 == var0.field1072) {
                        --var0.field1092;
                        if(var0.field1131 > 0) {
                           --var0.field1131;
                        }
                     }
                  } else {
                     var0.field1090 = var4;
                     var0.field1072 = var5;
                     --var0.field1092;
                     if(var0.field1131 > 0) {
                        --var0.field1131;
                     }
                  }
               }
            }
         }
      }

      if(var0.field1090 < 128 || var0.field1072 < 128 || var0.field1090 >= 13184 || var0.field1072 >= 13184) {
         var0.field1086 = -1;
         var0.animationChanged(-1);
         var0.field1109 = -1;
         var0.graphicChanged(-1);
         var0.field1118 = 0;
         var0.field1119 = 0;
         var0.field1090 = var0.field1101[0] * 128 + var0.field1075 * 64;
         var0.field1072 = var0.field1128[0] * 128 + var0.field1075 * 64;
         var0.method1803();
      }

      if(class32.field303 == var0 && (var0.field1090 < 1536 || var0.field1072 < 1536 || var0.field1090 >= 11776 || var0.field1072 >= 11776)) {
         var0.field1086 = -1;
         var0.animationChanged(-1);
         var0.field1109 = -1;
         var0.graphicChanged(-1);
         var0.field1118 = 0;
         var0.field1119 = 0;
         var0.field1090 = var0.field1101[0] * 128 + var0.field1075 * 64;
         var0.field1072 = var0.field1128[0] * 128 + var0.field1075 * 64;
         var0.method1803();
      }

      if(var0.field1125 != 0) {
         if(var0.field1098 != -1) {
            Object var15 = null;
            if(var0.field1098 < 32768) {
               var15 = client.field2195[var0.field1098];
            } else if(var0.field1098 >= 32768) {
               var15 = client.field2269[var0.field1098 - 32768];
            }

            if(var15 != null) {
               var3 = var0.field1090 - ((class99)var15).field1090;
               var4 = var0.field1072 - ((class99)var15).field1072;
               if(var3 != 0 || var4 != 0) {
                  var0.field1123 = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
               }
            } else if(var0.field1096) {
               var0.field1098 = -1;
               var0.interactingChanged(-1);
               var0.field1096 = false;
            }
         }

         if(var0.field1114 != -1 && (var0.field1092 == 0 || var0.field1120 > 0)) {
            var0.field1123 = var0.field1114;
            var0.field1114 = -1;
         }

         var2 = var0.field1123 - var0.field1073 & 2047;
         if(var2 == 0 && var0.field1096) {
            var0.field1098 = -1;
            var0.interactingChanged(-1);
            var0.field1096 = false;
         }

         if(var2 != 0) {
            ++var0.field1124;
            boolean var13;
            if(var2 > 1024) {
               var0.field1073 -= var0.field1125;
               var13 = true;
               if(var2 < var0.field1125 || var2 > 2048 - var0.field1125) {
                  var0.field1073 = var0.field1123;
                  var13 = false;
               }

               if(var0.field1089 == var0.field1078 && (var0.field1124 > 25 || var13)) {
                  if(var0.field1127 != -1) {
                     var0.field1078 = var0.field1127;
                  } else {
                     var0.field1078 = var0.field1103;
                  }
               }
            } else {
               var0.field1073 += var0.field1125;
               var13 = true;
               if(var2 < var0.field1125 || var2 > 2048 - var0.field1125) {
                  var0.field1073 = var0.field1123;
                  var13 = false;
               }

               if(var0.field1078 == var0.field1089 && (var0.field1124 > 25 || var13)) {
                  if(var0.field1122 != -1) {
                     var0.field1078 = var0.field1122;
                  } else {
                     var0.field1078 = var0.field1103;
                  }
               }
            }

            var0.field1073 &= 2047;
         } else {
            var0.field1124 = 0;
         }
      }

      var0.field1074 = false;
      if(var0.field1078 != -1) {
         var11 = class3.method74(var0.field1078);
         if(var11 != null && var11.field3844 != null) {
            ++var0.field1093;
            if(var0.field1102 < var11.field3844.length && var0.field1093 > var11.field3836[var0.field1102]) {
               var0.field1093 = 1;
               ++var0.field1102;
               class49.method1055(var11, var0.field1102, var0.field1090, var0.field1072);
            }

            if(var0.field1102 >= var11.field3844.length) {
               var0.field1093 = 0;
               var0.field1102 = 0;
               class49.method1055(var11, var0.field1102, var0.field1090, var0.field1072);
            }
         } else {
            var0.field1078 = -1;
         }
      }

      if(var0.field1109 != -1 && client.field2165 >= var0.field1112) {
         if(var0.field1110 < 0) {
            var0.field1110 = 0;
         }

         var2 = class283.method5464(var0.field1109).field813;
         if(var2 != -1) {
            class312 var12 = class3.method74(var2);
            if(var12 != null && var12.field3844 != null) {
               ++var0.field1111;
               if(var0.field1110 < var12.field3844.length && var0.field1111 > var12.field3836[var0.field1110]) {
                  var0.field1111 = 1;
                  ++var0.field1110;
                  class49.method1055(var12, var0.field1110, var0.field1090, var0.field1072);
               }

               if(var0.field1110 >= var12.field3844.length && (var0.field1110 < 0 || var0.field1110 >= var12.field3844.length)) {
                  var0.field1109 = -1;
                  var0.graphicChanged(-1);
               }
            } else {
               var0.field1109 = -1;
               var0.graphicChanged(-1);
            }
         } else {
            var0.field1109 = -1;
            var0.graphicChanged(-1);
         }
      }

      if(var0.field1086 != -1 && var0.field1107 <= 1) {
         var11 = class3.method74(var0.field1086);
         if(var11.field3845 == 1 && var0.field1131 > 0 && var0.field1118 <= client.field2165 && var0.field1119 < client.field2165) {
            var0.field1107 = 1;
            return;
         }
      }

      if(var0.field1086 != -1 && var0.field1107 == 0) {
         var11 = class3.method74(var0.field1086);
         if(var11 != null && var11.field3844 != null) {
            ++var0.field1130;
            if(var0.field1105 < var11.field3844.length && var0.field1130 > var11.field3836[var0.field1105]) {
               var0.field1130 = 1;
               ++var0.field1105;
               class49.method1055(var11, var0.field1105, var0.field1090, var0.field1072);
            }

            if(var0.field1105 >= var11.field3844.length) {
               var0.field1105 -= var11.field3838;
               ++var0.field1108;
               if(var0.field1108 >= var11.field3840) {
                  var0.field1086 = -1;
                  var0.animationChanged(-1);
               } else if(var0.field1105 >= 0 && var0.field1105 < var11.field3844.length) {
                  class49.method1055(var11, var0.field1105, var0.field1090, var0.field1072);
               } else {
                  var0.field1086 = -1;
                  var0.animationChanged(-1);
               }
            }

            var0.field1074 = var11.field3842;
         } else {
            var0.field1086 = -1;
            var0.animationChanged(-1);
         }
      }

      if(var0.field1107 > 0) {
         --var0.field1107;
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "([BIII)Ljava/lang/String;",
      garbageValue = "2104510009"
   )
   public static String method4566(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         int var6 = var0[var5 + var1] & 255;
         if(var6 != 0) {
            if(var6 >= 128 && var6 < 160) {
               char var7 = class284.field3566[var6 - 128];
               if(var7 == 0) {
                  var7 = '?';
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "2121314595"
   )
   static void method4563(boolean var0) {
      class39.field392 = "";
      class39.field393 = "Enter your username/email & password.";
      class39.field394 = "";
      class39.field398 = 2;
      if(var0) {
         class39.field396 = "";
      }

      class119.method2158();
      class213.method4360();
   }

   @ObfuscatedName("fj")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "-454360130"
   )
   static void method4556(int var0, int var1, int var2) {
      if(client.field2389 != 0 && var1 != 0 && client.field2391 < 50) {
         client.field2294[client.field2391] = var0;
         client.field2345[client.field2391] = var1;
         client.field2394[client.field2391] = var2;
         client.field2188[client.field2391] = null;
         client.field2429[client.field2391] = 0;
         ++client.field2391;
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Lgl;II)Z",
      garbageValue = "687115478"
   )
   static boolean method4564(class1 var0, int var1) {
      int var2 = var0.method8(2);
      int var3;
      int var4;
      int var7;
      int var8;
      int var9;
      int var10;
      if(var2 == 0) {
         if(var0.method8(1) != 0) {
            method4564(var0, var1);
         }

         var3 = var0.method8(13);
         var4 = var0.method8(13);
         boolean var12 = var0.method8(1) == 1;
         if(var12) {
            class152.field1878[++class152.field1881 - 1] = var1;
         }

         if(client.field2269[var1] != null) {
            throw new RuntimeException();
         } else {
            class199 var10000 = client.field2269[var1] = new class199();
            client.cachedPlayersChanged(var1);
            class199 var6 = var10000;
            var6.field2823 = var1;
            if(class152.field1888[var1] != null) {
               var6.method3948(class152.field1888[var1]);
            }

            var6.field1123 = class152.field1879[var1];
            var6.field1098 = class152.field1880[var1];
            var6.interactingChanged(-1);
            var7 = class152.field1873[var1];
            var8 = var7 >> 28;
            var9 = var7 >> 14 & 255;
            var10 = var7 & 255;
            var6.field1129[0] = class152.field1877[var1];
            var6.field2805 = (byte)var8;
            var6.method3961((var9 << 13) + var3 - class229.field3067, (var10 << 13) + var4 - class35.field360);
            var6.field2826 = false;
            return true;
         }
      } else if(var2 == 1) {
         var3 = var0.method8(2);
         var4 = class152.field1873[var1];
         class152.field1873[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28);
         return false;
      } else {
         int var5;
         int var11;
         if(var2 == 2) {
            var3 = var0.method8(5);
            var4 = var3 >> 3;
            var5 = var3 & 7;
            var11 = class152.field1873[var1];
            var7 = (var11 >> 28) + var4 & 3;
            var8 = var11 >> 14 & 255;
            var9 = var11 & 255;
            if(var5 == 0) {
               --var8;
               --var9;
            }

            if(var5 == 1) {
               --var9;
            }

            if(var5 == 2) {
               ++var8;
               --var9;
            }

            if(var5 == 3) {
               --var8;
            }

            if(var5 == 4) {
               ++var8;
            }

            if(var5 == 5) {
               --var8;
               ++var9;
            }

            if(var5 == 6) {
               ++var9;
            }

            if(var5 == 7) {
               ++var8;
               ++var9;
            }

            class152.field1873[var1] = (var8 << 14) + var9 + (var7 << 28);
            return false;
         } else {
            var3 = var0.method8(18);
            var4 = var3 >> 16;
            var5 = var3 >> 8 & 255;
            var11 = var3 & 255;
            var7 = class152.field1873[var1];
            var8 = (var7 >> 28) + var4 & 3;
            var9 = var5 + (var7 >> 14) & 255;
            var10 = var7 + var11 & 255;
            class152.field1873[var1] = (var9 << 14) + var10 + (var8 << 28);
            return false;
         }
      }
   }
}
