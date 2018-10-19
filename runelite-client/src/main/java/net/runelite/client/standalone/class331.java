package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
public enum class331 implements class91 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3700(0, 0),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3699(1, 0),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3702(2, 0),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3710(3, 0),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3720(9, 2),
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3703(4, 1),
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3714(5, 1),
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3705(6, 1),
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3706(7, 1),
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3707(8, 1),
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3708(12, 2),
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3709(13, 2),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3701(14, 2),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3711(15, 2),
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3712(16, 2),
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3698(17, 2),
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3713(18, 2),
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3715(19, 2),
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3716(20, 2),
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3717(21, 2),
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3718(10, 2),
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3719(11, 2),
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   field3704(22, 3);

   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 171004927
   )
   public final int field3721;

   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "0"
   )
   class331(int var3, int var4) {
      this.field3721 = var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "87"
   )
   public int vmethod5937() {
      return this.field3721;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "1"
   )
   public static String method5936(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for(int var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if(var3 == 0) {
            var5 = Character.toLowerCase(var5);
         } else if(var3 == 2 || Character.isUpperCase(var5)) {
            var5 = class203.method3475(var5);
         }

         if(Character.isLetter(var5)) {
            var3 = 0;
         } else if(var5 != '.' && var5 != '?' && var5 != '!') {
            if(Character.isSpaceChar(var5)) {
               if(var3 != 2) {
                  var3 = 1;
               }
            } else {
               var3 = 1;
            }
         } else {
            var3 = 2;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }

   @ObfuscatedName("iq")
   @ObfuscatedSignature(
      signature = "([Lhw;IIIIIIIS)V",
      garbageValue = "-10952"
   )
   static final void method5945(class329[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = 0; var8 < var0.length; ++var8) {
         class329 var9 = var0[var8];
         if(var9 != null && var9.field3563 == var1 && (!var9.field3543 || var9.field3546 == 0 || var9.field3630 || class104.method1771(var9) != 0 || var9 == client.field3914 || var9.field3548 == 1338)) {
            if(var9.field3543) {
               if(class125.method2286(var9)) {
                  continue;
               }
            } else if(var9.field3546 == 0 && var9 != class281.field3036 && class125.method2286(var9)) {
               continue;
            }

            int var10 = var9.field3620 + var6;
            int var11 = var7 + var9.field3558;
            int var12;
            int var13;
            int var14;
            int var15;
            int var17;
            int var18;
            if(var9.field3546 == 2) {
               var12 = var2;
               var13 = var3;
               var14 = var4;
               var15 = var5;
            } else {
               int var16;
               if(var9.field3546 == 9) {
                  var16 = var10;
                  var17 = var11;
                  var18 = var10 + var9.field3559;
                  int var19 = var11 + var9.field3560;
                  if(var18 < var10) {
                     var16 = var18;
                     var18 = var10;
                  }

                  if(var19 < var11) {
                     var17 = var19;
                     var19 = var11;
                  }

                  ++var18;
                  ++var19;
                  var12 = var16 > var2?var16:var2;
                  var13 = var17 > var3?var17:var3;
                  var14 = var18 < var4?var18:var4;
                  var15 = var19 < var5?var19:var5;
               } else {
                  var16 = var10 + var9.field3559;
                  var17 = var11 + var9.field3560;
                  var12 = var10 > var2?var10:var2;
                  var13 = var11 > var3?var11:var3;
                  var14 = var16 < var4?var16:var4;
                  var15 = var17 < var5?var17:var5;
               }
            }

            if(var9 == client.field3905) {
               client.field3913 = true;
               client.field3783 = var10;
               client.field3860 = var11;
            }

            boolean var32 = false;
            if(var9.field3618) {
               switch(client.field3915) {
               case 0:
                  var32 = true;
               case 1:
               default:
                  break;
               case 2:
                  if(client.field3895 == var9.field3607 >>> 16) {
                     var32 = true;
                  }
                  break;
               case 3:
                  if(var9.field3607 == client.field3895) {
                     var32 = true;
                  }
               }
            }

            if(var32 || !var9.field3543 || var12 < var14 && var13 < var15) {
               if(var9.field3543) {
                  class9 var26;
                  if(var9.field3684) {
                     if(class226.field2215 >= var12 && class226.field2216 >= var13 && class226.field2215 < var14 && class226.field2216 < var15) {
                        for(var26 = (class9)client.field3811.method5604(); var26 != null; var26 = (class9)client.field3811.method5606()) {
                           if(var26.field62) {
                              var26.method1186();
                              var26.field63.field3675 = false;
                           }
                        }

                        if(class49.field370 == 0) {
                           client.field3905 = null;
                           client.field3914 = null;
                        }

                        if(!client.field3939) {
                           class5.method69();
                        }
                     }
                  } else if(var9.field3685 && class226.field2215 >= var12 && class226.field2216 >= var13 && class226.field2215 < var14 && class226.field2216 < var15) {
                     for(var26 = (class9)client.field3811.method5604(); var26 != null; var26 = (class9)client.field3811.method5606()) {
                        if(var26.field62 && var26.field63.field3651 == var26.field69) {
                           var26.method1186();
                        }
                     }
                  }
               }

               var17 = class226.field2215;
               var18 = class226.field2216;
               if(class226.field2222 != 0) {
                  var17 = class226.field2220;
                  var18 = class226.field2224;
               }

               boolean var33 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15;
               if(var9.field3548 == 1337) {
                  if(!client.field3794 && !client.field3939 && var33) {
                     class48.method817(var17, var18, var12, var13);
                  }
               } else if(var9.field3548 == 1338) {
                  class184.method3220(var9, var10, var11);
               } else {
                  if(var9.field3548 == 1400) {
                     class63.field587.method1332(class226.field2215, class226.field2216, var33, var10, var11, var9.field3559, var9.field3560);
                  }

                  if(!client.field3939 && var33) {
                     if(var9.field3548 == 1400) {
                        class63.field587.method1494(var10, var11, var9.field3559, var9.field3560, var17, var18);
                     } else {
                        class268.method4862(var9, var17 - var10, var18 - var11);
                     }
                  }

                  boolean var21;
                  int var23;
                  if(var32) {
                     for(int var20 = 0; var20 < var9.field3529.length; ++var20) {
                        var21 = false;
                        boolean var22 = false;
                        if(!var21 && var9.field3529[var20] != null) {
                           for(var23 = 0; var23 < var9.field3529[var20].length; ++var23) {
                              boolean var24 = false;
                              if(var9.field3557 != null) {
                                 var24 = class135.field1332[var9.field3529[var20][var23]];
                              }

                              if(class31.method498(var9.field3529[var20][var23]) || var24) {
                                 var21 = true;
                                 if(var9.field3557 != null && var9.field3557[var20] > client.field3744) {
                                    break;
                                 }

                                 byte var25 = var9.field3648[var20][var23];
                                 if(var25 == 0 || ((var25 & 8) == 0 || !class135.field1332[86] && !class135.field1332[82] && !class135.field1332[81]) && ((var25 & 2) == 0 || class135.field1332[86]) && ((var25 & 1) == 0 || class135.field1332[82]) && ((var25 & 4) == 0 || class135.field1332[81])) {
                                    var22 = true;
                                    break;
                                 }
                              }
                           }
                        }

                        if(var22) {
                           if(var20 < 10) {
                              class21.method217(var20 + 1, var9.field3607, var9.field3606, var9.field3662, "");
                           } else if(var20 == 10) {
                              class272.method4899();
                              class313.method5511(var9.field3607, var9.field3606, class148.method2674(class104.method1771(var9)), var9.field3662);
                              client.field3890 = class129.method2384(var9);
                              if(client.field3890 == null) {
                                 client.field3890 = "null";
                              }

                              client.field3891 = var9.field3669 + class294.method5136(16777215);
                           }

                           var23 = var9.field3621[var20];
                           if(var9.field3557 == null) {
                              var9.field3557 = new int[var9.field3529.length];
                           }

                           if(var9.field3622 == null) {
                              var9.field3622 = new int[var9.field3529.length];
                           }

                           if(var23 != 0) {
                              if(var9.field3557[var20] == 0) {
                                 var9.field3557[var20] = var23 + client.field3744 + var9.field3622[var20];
                              } else {
                                 var9.field3557[var20] = var23 + client.field3744;
                              }
                           } else {
                              var9.field3557[var20] = Integer.MAX_VALUE;
                           }
                        }

                        if(!var21 && var9.field3557 != null) {
                           var9.field3557[var20] = 0;
                        }
                     }
                  }

                  if(var9.field3543) {
                     if(class226.field2215 >= var12 && class226.field2216 >= var13 && class226.field2215 < var14 && class226.field2216 < var15) {
                        var33 = true;
                     } else {
                        var33 = false;
                     }

                     boolean var34 = false;
                     if((class226.field2223 == 1 || !class192.field1840 && class226.field2223 == 4) && var33) {
                        var34 = true;
                     }

                     var21 = false;
                     if((class226.field2222 == 1 || !class192.field1840 && class226.field2222 == 4) && class226.field2220 >= var12 && class226.field2224 >= var13 && class226.field2220 < var14 && class226.field2224 < var15) {
                        var21 = true;
                     }

                     if(var21) {
                        class38.method621(var9, class226.field2220 - var10, class226.field2224 - var11);
                     }

                     if(var9.field3548 == 1400) {
                        class63.field587.method1425(var17, var18, var33 & var34, var33 & var21);
                     }

                     if(client.field3905 != null && var9 != client.field3905 && var33 && class17.method194(class104.method1771(var9))) {
                        client.field3909 = var9;
                     }

                     if(var9 == client.field3914) {
                        client.field3910 = true;
                        client.field3827 = var10;
                        client.field3912 = var11;
                     }

                     if(var9.field3630) {
                        class9 var29;
                        if(var33 && client.field3974 != 0 && var9.field3651 != null) {
                           var29 = new class9();
                           var29.field62 = true;
                           var29.field63 = var9;
                           var29.field65 = client.field3974;
                           var29.field69 = var9.field3651;
                           client.field3811.method5600(var29);
                        }

                        if(client.field3905 != null || class38.field286 != null || client.field3939) {
                           var21 = false;
                           var34 = false;
                           var33 = false;
                        }

                        if(!var9.field3676 && var21) {
                           var9.field3676 = true;
                           if(var9.field3629 != null) {
                              var29 = new class9();
                              var29.field62 = true;
                              var29.field63 = var9;
                              var29.field68 = class226.field2220 - var10;
                              var29.field65 = class226.field2224 - var11;
                              var29.field69 = var9.field3629;
                              client.field3811.method5600(var29);
                           }
                        }

                        if(var9.field3676 && var34 && var9.field3654 != null) {
                           var29 = new class9();
                           var29.field62 = true;
                           var29.field63 = var9;
                           var29.field68 = class226.field2215 - var10;
                           var29.field65 = class226.field2216 - var11;
                           var29.field69 = var9.field3654;
                           client.field3811.method5600(var29);
                        }

                        if(var9.field3676 && !var34) {
                           var9.field3676 = false;
                           if(var9.field3542 != null) {
                              var29 = new class9();
                              var29.field62 = true;
                              var29.field63 = var9;
                              var29.field68 = class226.field2215 - var10;
                              var29.field65 = class226.field2216 - var11;
                              var29.field69 = var9.field3542;
                              client.field3933.method5600(var29);
                           }
                        }

                        if(var34 && var9.field3635 != null) {
                           var29 = new class9();
                           var29.field62 = true;
                           var29.field63 = var9;
                           var29.field68 = class226.field2215 - var10;
                           var29.field65 = class226.field2216 - var11;
                           var29.field69 = var9.field3635;
                           client.field3811.method5600(var29);
                        }

                        if(!var9.field3675 && var33) {
                           var9.field3675 = true;
                           if(var9.field3636 != null) {
                              var29 = new class9();
                              var29.field62 = true;
                              var29.field63 = var9;
                              var29.field68 = class226.field2215 - var10;
                              var29.field65 = class226.field2216 - var11;
                              var29.field69 = var9.field3636;
                              client.field3811.method5600(var29);
                           }
                        }

                        if(var9.field3675 && var33 && var9.field3608 != null) {
                           var29 = new class9();
                           var29.field62 = true;
                           var29.field63 = var9;
                           var29.field68 = class226.field2215 - var10;
                           var29.field65 = class226.field2216 - var11;
                           var29.field69 = var9.field3608;
                           client.field3811.method5600(var29);
                        }

                        if(var9.field3675 && !var33) {
                           var9.field3675 = false;
                           if(var9.field3634 != null) {
                              var29 = new class9();
                              var29.field62 = true;
                              var29.field63 = var9;
                              var29.field68 = class226.field2215 - var10;
                              var29.field65 = class226.field2216 - var11;
                              var29.field69 = var9.field3634;
                              client.field3933.method5600(var29);
                           }
                        }

                        if(var9.field3670 != null) {
                           var29 = new class9();
                           var29.field63 = var9;
                           var29.field69 = var9.field3670;
                           client.field3932.method5600(var29);
                        }

                        class9 var30;
                        int var35;
                        int var36;
                        if(var9.field3643 != null && client.field3919 > var9.field3612) {
                           if(var9.field3644 != null && client.field3919 - var9.field3612 <= 32) {
                              label880:
                              for(var35 = var9.field3612; var35 < client.field3919; ++var35) {
                                 var23 = client.field3918[var35 & 31];

                                 for(var36 = 0; var36 < var9.field3644.length; ++var36) {
                                    if(var23 == var9.field3644[var36]) {
                                       var30 = new class9();
                                       var30.field63 = var9;
                                       var30.field69 = var9.field3643;
                                       client.field3811.method5600(var30);
                                       break label880;
                                    }
                                 }
                              }
                           } else {
                              var29 = new class9();
                              var29.field63 = var9;
                              var29.field69 = var9.field3643;
                              client.field3811.method5600(var29);
                           }

                           var9.field3612 = client.field3919;
                        }

                        if(var9.field3645 != null && client.field3921 > var9.field3679) {
                           if(var9.field3646 != null && client.field3921 - var9.field3679 <= 32) {
                              label856:
                              for(var35 = var9.field3679; var35 < client.field3921; ++var35) {
                                 var23 = client.field3756[var35 & 31];

                                 for(var36 = 0; var36 < var9.field3646.length; ++var36) {
                                    if(var23 == var9.field3646[var36]) {
                                       var30 = new class9();
                                       var30.field63 = var9;
                                       var30.field69 = var9.field3645;
                                       client.field3811.method5600(var30);
                                       break label856;
                                    }
                                 }
                              }
                           } else {
                              var29 = new class9();
                              var29.field63 = var9;
                              var29.field69 = var9.field3645;
                              client.field3811.method5600(var29);
                           }

                           var9.field3679 = client.field3921;
                        }

                        if(var9.field3647 != null && client.field3995 > var9.field3680) {
                           if(var9.field3624 != null && client.field3995 - var9.field3680 <= 32) {
                              label832:
                              for(var35 = var9.field3680; var35 < client.field3995; ++var35) {
                                 var23 = client.field3868[var35 & 31];

                                 for(var36 = 0; var36 < var9.field3624.length; ++var36) {
                                    if(var23 == var9.field3624[var36]) {
                                       var30 = new class9();
                                       var30.field63 = var9;
                                       var30.field69 = var9.field3647;
                                       client.field3811.method5600(var30);
                                       break label832;
                                    }
                                 }
                              }
                           } else {
                              var29 = new class9();
                              var29.field63 = var9;
                              var29.field69 = var9.field3647;
                              client.field3811.method5600(var29);
                           }

                           var9.field3680 = client.field3995;
                        }

                        if(client.field3894 > var9.field3677 && var9.field3652 != null) {
                           var29 = new class9();
                           var29.field63 = var9;
                           var29.field69 = var9.field3652;
                           client.field3811.method5600(var29);
                        }

                        if(client.field3983 > var9.field3677 && var9.field3589 != null) {
                           var29 = new class9();
                           var29.field63 = var9;
                           var29.field69 = var9.field3589;
                           client.field3811.method5600(var29);
                        }

                        if(client.field3926 > var9.field3677 && var9.field3576 != null) {
                           var29 = new class9();
                           var29.field63 = var9;
                           var29.field69 = var9.field3576;
                           client.field3811.method5600(var29);
                        }

                        if(client.field3927 > var9.field3677 && var9.field3660 != null) {
                           var29 = new class9();
                           var29.field63 = var9;
                           var29.field69 = var9.field3660;
                           client.field3811.method5600(var29);
                        }

                        if(client.field3928 > var9.field3677 && var9.field3661 != null) {
                           var29 = new class9();
                           var29.field63 = var9;
                           var29.field69 = var9.field3661;
                           client.field3811.method5600(var29);
                        }

                        if(client.field3929 > var9.field3677 && var9.field3637 != null) {
                           var29 = new class9();
                           var29.field63 = var9;
                           var29.field69 = var9.field3637;
                           client.field3811.method5600(var29);
                        }

                        var9.field3677 = client.field3917;
                        if(var9.field3575 != null) {
                           for(var35 = 0; var35 < client.field3994; ++var35) {
                              class9 var31 = new class9();
                              var31.field63 = var9;
                              var31.field64 = client.field3955[var35];
                              var31.field75 = client.field3954[var35];
                              var31.field69 = var9.field3575;
                              client.field3811.method5600(var31);
                           }
                        }
                     }
                  }

                  if(!var9.field3543) {
                     if(client.field3905 != null || class38.field286 != null || client.field3939) {
                        continue;
                     }

                     if((var9.field3665 >= 0 || var9.field3683 != 0) && class226.field2215 >= var12 && class226.field2216 >= var13 && class226.field2215 < var14 && class226.field2216 < var15) {
                        if(var9.field3665 >= 0) {
                           class281.field3036 = var0[var9.field3665];
                        } else {
                           class281.field3036 = var9;
                        }
                     }

                     if(var9.field3546 == 8 && class226.field2215 >= var12 && class226.field2216 >= var13 && class226.field2215 < var14 && class226.field2216 < var15) {
                        class323.field3463 = var9;
                     }

                     if(var9.field3568 > var9.field3560) {
                        class2.method26(var9, var10 + var9.field3559, var11, var9.field3560, var9.field3568, class226.field2215, class226.field2216);
                     }
                  }

                  if(var9.field3546 == 0) {
                     method5945(var0, var9.field3607, var12, var13, var14, var15, var10 - var9.field3565, var11 - var9.field3566);
                     if(var9.field3674 != null) {
                        method5945(var9.field3674, var9.field3607, var12, var13, var14, var15, var10 - var9.field3565, var11 - var9.field3566);
                     }

                     class45 var27 = (class45)client.field3991.method5310((long)var9.field3607);
                     if(var27 != null) {
                        if(var27.field348 == 0 && class226.field2215 >= var12 && class226.field2216 >= var13 && class226.field2215 < var14 && class226.field2216 < var15 && !client.field3939) {
                           for(class9 var28 = (class9)client.field3811.method5604(); var28 != null; var28 = (class9)client.field3811.method5606()) {
                              if(var28.field62) {
                                 var28.method1186();
                                 var28.field63.field3675 = false;
                              }
                           }

                           if(class49.field370 == 0) {
                              client.field3905 = null;
                              client.field3914 = null;
                           }

                           if(!client.field3939) {
                              class5.method69();
                           }
                        }

                        class10.method115(var27.field351, var12, var13, var14, var15, var10, var11);
                     }
                  }
               }
            }
         }
      }

   }
}
