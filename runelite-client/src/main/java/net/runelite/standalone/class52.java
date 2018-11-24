package net.runelite.standalone;

import java.awt.Polygon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Model;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.model.Jarvis;
import net.runelite.api.model.Triangle;
import net.runelite.api.model.Vertex;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFrame;
import net.runelite.rs.api.RSFrameMap;
import net.runelite.rs.api.RSFrames;
import net.runelite.rs.api.RSModel;

@ObfuscatedName("ds")
public class class52 extends class102 implements RSModel {
   @ObfuscatedName("ar")
   static int[] field619;
   @ObfuscatedName("aq")
   static int[] field621;
   @ObfuscatedName("bk")
   static int[] field587;
   @ObfuscatedName("bv")
   static int[] field642;
   @ObfuscatedName("bu")
   static int[] field632;
   @ObfuscatedName("ao")
   static boolean[] field583;
   @ObfuscatedName("bn")
   static int[] field641;
   @ObfuscatedName("an")
   static int[][] field598;
   @ObfuscatedName("bf")
   static int[] field643;
   @ObfuscatedName("bo")
   static int[] field630;
   @ObfuscatedName("l")
   static byte[] field578;
   @ObfuscatedName("s")
   static byte[] field580;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lds;"
   )
   static class52 field639;
   @ObfuscatedName("ai")
   static int[] field592;
   @ObfuscatedName("ak")
   static int[][] field628;
   @ObfuscatedName("be")
   static int[] field581;
   @ObfuscatedName("ay")
   static int[] field625;
   @ObfuscatedName("bs")
   static int[] field634;
   @ObfuscatedName("bw")
   static boolean field638;
   @ObfuscatedName("ae")
   static boolean[] field617;
   @ObfuscatedName("ab")
   static int[] field620;
   @ObfuscatedName("bm")
   static int field636;
   @ObfuscatedName("bx")
   static int[] field631;
   @ObfuscatedName("ap")
   static int[] field618;
   @ObfuscatedName("bg")
   static int field629;
   @ObfuscatedName("ba")
   static int field635;
   @ObfuscatedName("au")
   static int[] field622;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lds;"
   )
   static class52 field601;
   @ObfuscatedName("bl")
   static int[] field633;
   @ObfuscatedName("aj")
   static int[] field616;
   @ObfuscatedName("af")
   int field605;
   @ObfuscatedName("j")
   byte[] field623;
   @ObfuscatedName("k")
   int[] field600;
   @ObfuscatedName("ag")
   int field604;
   @ObfuscatedName("ac")
   int field608;
   @ObfuscatedName("z")
   int[] field588;
   @ObfuscatedName("p")
   int[] field584;
   @ObfuscatedName("i")
   int[] field597;
   @ObfuscatedName("aa")
   int field611;
   @ObfuscatedName("c")
   int[] field645;
   @ObfuscatedName("n")
   byte field596;
   @ObfuscatedName("aw")
   int field599;
   @ObfuscatedName("h")
   int field591;
   @ObfuscatedName("r")
   int field585;
   @ObfuscatedName("u")
   byte[] field594;
   @ObfuscatedName("m")
   int[] field586;
   @ObfuscatedName("y")
   int[][] field602;
   @ObfuscatedName("b")
   byte[] field593;
   public int rl$sceneId;
   public int rl$bufferOffset;
   public int rl$uvBufferOffset;
   public float[][] rl$faceTextureUCoordinates;
   public float[][] rl$faceTextureVCoordinates;
   @ObfuscatedName("x")
   int[] field589;
   @ObfuscatedName("v")
   int[] field590;
   @ObfuscatedName("av")
   public boolean field603;
   @ObfuscatedName("at")
   int field607;
   @ObfuscatedName("as")
   int field626;
   @ObfuscatedName("d")
   int[] field624;
   @ObfuscatedName("a")
   int[] field582;
   @ObfuscatedName("am")
   int field609;
   @ObfuscatedName("o")
   int[] field612;
   @ObfuscatedName("g")
   int[] field577;
   @ObfuscatedName("ad")
   int field614;
   @ObfuscatedName("t")
   short[] field595;
   @ObfuscatedName("q")
   int[][] field627;
   @ObfuscatedName("al")
   int field613;
   @ObfuscatedName("e")
   int field644;
   @ObfuscatedName("az")
   int field606;

   static {
      field639 = new class52();
      field578 = new byte[1];
      field601 = new class52();
      field580 = new byte[1];
      field583 = new boolean[4700];
      field617 = new boolean[4700];
      field618 = new int[4700];
      field619 = new int[4700];
      field620 = new int[4700];
      field621 = new int[4700];
      field622 = new int[4700];
      field616 = new int[4700];
      field592 = new int[1600];
      field598 = new int[1600][512];
      field625 = new int[12];
      field628 = new int[12][2000];
      field581 = new int[2000];
      field630 = new int[2000];
      field631 = new int[12];
      field643 = new int[10];
      field633 = new int[10];
      field634 = new int[10];
      field638 = true;
      field641 = class211.field2920;
      field642 = class211.field2914;
      field632 = class211.field2916;
      field587 = class211.field2905;
   }

   class52() {
      this.field644 = 0;
      this.field585 = 0;
      this.field596 = 0;
      this.field591 = 0;
      this.field603 = false;
      this.field626 = -1;
      this.field613 = -1;
      this.field614 = -1;
   }

   @ObfuscatedSignature(
      signature = "([Lds;I)V"
   )
   public class52(class52[] var1, int var2) {
      this.field644 = 0;
      this.field585 = 0;
      this.field596 = 0;
      this.field591 = 0;
      this.field603 = false;
      this.field626 = -1;
      this.field613 = -1;
      this.field614 = -1;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      this.field644 = 0;
      this.field585 = 0;
      this.field591 = 0;
      this.field596 = -1;

      int var7;
      class52 var8;
      for(var7 = 0; var7 < var2; ++var7) {
         var8 = var1[var7];
         if(var8 != null) {
            this.field644 += var8.field644;
            this.field585 += var8.field585;
            this.field591 += var8.field591;
            if(var8.field623 != null) {
               var3 = true;
            } else {
               if(this.field596 == -1) {
                  this.field596 = var8.field596;
               }

               if(this.field596 != var8.field596) {
                  var3 = true;
               }
            }

            var4 |= var8.field593 != null;
            var5 |= var8.field595 != null;
            var6 |= var8.field594 != null;
         }
      }

      this.field582 = new int[this.field644];
      this.field645 = new int[this.field644];
      this.field584 = new int[this.field644];
      this.field586 = new int[this.field585];
      this.field624 = new int[this.field585];
      this.field588 = new int[this.field585];
      this.field589 = new int[this.field585];
      this.field590 = new int[this.field585];
      this.field577 = new int[this.field585];
      if(var3) {
         this.field623 = new byte[this.field585];
      }

      if(var4) {
         this.field593 = new byte[this.field585];
      }

      if(var5) {
         this.field595 = new short[this.field585];
      }

      if(var6) {
         this.field594 = new byte[this.field585];
      }

      if(this.field591 > 0) {
         this.field612 = new int[this.field591];
         this.field597 = new int[this.field591];
         this.field600 = new int[this.field591];
      }

      this.field644 = 0;
      this.field585 = 0;
      this.field591 = 0;

      for(var7 = 0; var7 < var2; ++var7) {
         var8 = var1[var7];
         if(var8 != null) {
            int var9;
            for(var9 = 0; var9 < var8.field585; ++var9) {
               this.field586[this.field585] = this.field644 + var8.field586[var9];
               this.field624[this.field585] = this.field644 + var8.field624[var9];
               this.field588[this.field585] = this.field644 + var8.field588[var9];
               this.field589[this.field585] = var8.field589[var9];
               this.field590[this.field585] = var8.field590[var9];
               this.field577[this.field585] = var8.field577[var9];
               if(var3) {
                  if(var8.field623 != null) {
                     this.field623[this.field585] = var8.field623[var9];
                  } else {
                     this.field623[this.field585] = var8.field596;
                  }
               }

               if(var4 && var8.field593 != null) {
                  this.field593[this.field585] = var8.field593[var9];
               }

               if(var5) {
                  if(var8.field595 != null) {
                     this.field595[this.field585] = var8.field595[var9];
                  } else {
                     this.field595[this.field585] = -1;
                  }
               }

               if(var6) {
                  if(var8.field594 != null && var8.field594[var9] != -1) {
                     this.field594[this.field585] = (byte)(this.field591 + var8.field594[var9]);
                  } else {
                     this.field594[this.field585] = -1;
                  }
               }

               ++this.field585;
            }

            for(var9 = 0; var9 < var8.field591; ++var9) {
               this.field612[this.field591] = this.field644 + var8.field612[var9];
               this.field597[this.field591] = this.field644 + var8.field597[var9];
               this.field600[this.field591] = this.field644 + var8.field600[var9];
               ++this.field591;
            }

            for(var9 = 0; var9 < var8.field644; ++var9) {
               this.field582[this.field644] = var8.field582[var9];
               this.field645[this.field644] = var8.field645[var9];
               this.field584[this.field644] = var8.field584[var9];
               ++this.field644;
            }
         }
      }

      this.rl$init(var1, var2);
   }

   @ObfuscatedName("af")
   final void method1143(int var1) {
      if(field617[var1]) {
         this.method1183(var1);
      } else {
         int var2 = this.field586[var1];
         int var3 = this.field624[var1];
         int var4 = this.field588[var1];
         class211.field2909 = field583[var1];
         if(this.field593 == null) {
            class211.field2899 = 0;
         } else {
            class211.field2899 = this.field593[var1] & 255;
         }

         if(this.field595 != null && this.field595[var1] != -1) {
            int var5;
            int var6;
            int var7;
            if(this.field594 != null && this.field594[var1] != -1) {
               int var8 = this.field594[var1] & 255;
               var5 = this.field612[var8];
               var6 = this.field597[var8];
               var7 = this.field600[var8];
            } else {
               var5 = var2;
               var6 = var3;
               var7 = var4;
            }

            if(this.field577[var1] == -1) {
               class211.method4260(field619[var2], field619[var3], field619[var4], field618[var2], field618[var3], field618[var4], this.field589[var1], this.field589[var1], this.field589[var1], field621[var5], field621[var6], field621[var7], field622[var5], field622[var6], field622[var7], field616[var5], field616[var6], field616[var7], this.field595[var1]);
            } else {
               class211.method4260(field619[var2], field619[var3], field619[var4], field618[var2], field618[var3], field618[var4], this.field589[var1], this.field590[var1], this.field577[var1], field621[var5], field621[var6], field621[var7], field622[var5], field622[var6], field622[var7], field616[var5], field616[var6], field616[var7], this.field595[var1]);
            }
         } else if(this.field577[var1] == -1) {
            class211.method4325(field619[var2], field619[var3], field619[var4], field618[var2], field618[var3], field618[var4], field632[this.field589[var1]]);
         } else {
            class211.method4256(field619[var2], field619[var3], field619[var4], field618[var2], field618[var3], field618[var4], this.field589[var1], this.field590[var1], this.field577[var1]);
         }

      }
   }

   @ObfuscatedName("k")
   public void method1157(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field644; ++var4) {
         this.field582[var4] += var1;
         this.field645[var4] += var2;
         this.field584[var4] += var3;
      }

      this.method1129();
   }

   @ObfuscatedName("ag")
   final void method1142(boolean var1, boolean var2, boolean var3, long var4) {
      if(this.field607 < 1600) {
         int var6;
         for(var6 = 0; var6 < this.field607; ++var6) {
            field592[var6] = 0;
         }

         var6 = var3?20:5;

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var16;
         int var18;
         for(var7 = 0; var7 < this.field585; ++var7) {
            if(this.field577[var7] != -2) {
               var8 = this.field586[var7];
               var9 = this.field624[var7];
               var10 = this.field588[var7];
               var11 = field618[var8];
               var12 = field618[var9];
               var13 = field618[var10];
               int var14;
               int var17;
               if(!var1 || var11 != -5000 && var12 != -5000 && var13 != -5000) {
                  if(var2) {
                     var15 = field619[var8];
                     var16 = field619[var9];
                     var17 = field619[var10];
                     var18 = var6 + class298.field3705;
                     boolean var34;
                     if(var18 < var15 && var18 < var16 && var18 < var17) {
                        var34 = false;
                     } else {
                        var18 = class298.field3705 - var6;
                        if(var18 > var15 && var18 > var16 && var18 > var17) {
                           var34 = false;
                        } else {
                           var18 = var6 + class298.field3706;
                           if(var18 < var11 && var18 < var12 && var18 < var13) {
                              var34 = false;
                           } else {
                              var18 = class298.field3706 - var6;
                              if(var18 > var11 && var18 > var12 && var18 > var13) {
                                 var34 = false;
                              } else {
                                 var34 = true;
                              }
                           }
                        }
                     }

                     if(var34) {
                        class298.field3710[++class298.field3703 - 1] = var4;
                        var2 = false;
                     }
                  }

                  if((var11 - var12) * (field619[var10] - field619[var9]) - (var13 - var12) * (field619[var8] - field619[var9]) > 0) {
                     field617[var7] = false;
                     if(var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= class211.field2908 && var12 <= class211.field2908 && var13 <= class211.field2908) {
                        field583[var7] = false;
                     } else {
                        field583[var7] = true;
                     }

                     var14 = (field620[var8] + field620[var9] + field620[var10]) / 3 + this.field608;
                     field598[var14][field592[var14]++] = var7;
                  }
               } else {
                  var14 = field621[var8];
                  var15 = field621[var9];
                  var16 = field621[var10];
                  var17 = field622[var8];
                  var18 = field622[var9];
                  int var19 = field622[var10];
                  int var20 = field616[var8];
                  int var21 = field616[var9];
                  int var22 = field616[var10];
                  var14 -= var15;
                  var16 -= var15;
                  var17 -= var18;
                  var19 -= var18;
                  var20 -= var21;
                  var22 -= var21;
                  int var23 = var17 * var22 - var20 * var19;
                  int var24 = var20 * var16 - var14 * var22;
                  int var25 = var14 * var19 - var17 * var16;
                  if(var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                     field617[var7] = true;
                     int var26 = (field620[var8] + field620[var9] + field620[var10]) / 3 + this.field608;
                     field598[var26][field592[var26]++] = var7;
                  }
               }
            }
         }

         int[] var27;
         if(this.field623 == null) {
            for(var7 = this.field607 - 1; var7 >= 0; --var7) {
               var8 = field592[var7];
               if(var8 > 0) {
                  var27 = field598[var7];

                  for(var10 = 0; var10 < var8; ++var10) {
                     this.method1143(var27[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               field625[var7] = 0;
               field631[var7] = 0;
            }

            for(var7 = this.field607 - 1; var7 >= 0; --var7) {
               var8 = field592[var7];
               if(var8 > 0) {
                  var27 = field598[var7];

                  for(var10 = 0; var10 < var8; ++var10) {
                     var11 = var27[var10];
                     byte var33 = this.field623[var11];
                     var13 = field625[var33]++;
                     field628[var33][var13] = var11;
                     if(var33 < 10) {
                        field631[var33] += var7;
                     } else if(var33 == 10) {
                        field581[var13] = var7;
                     } else {
                        field630[var13] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if(field625[1] > 0 || field625[2] > 0) {
               var7 = (field631[1] + field631[2]) / (field625[1] + field625[2]);
            }

            var8 = 0;
            if(field625[3] > 0 || field625[4] > 0) {
               var8 = (field631[3] + field631[4]) / (field625[3] + field625[4]);
            }

            var9 = 0;
            if(field625[6] > 0 || field625[8] > 0) {
               var9 = (field631[8] + field631[6]) / (field625[8] + field625[6]);
            }

            var11 = 0;
            var12 = field625[10];
            int[] var30 = field628[10];
            int[] var31 = field581;
            if(var11 == var12) {
               var11 = 0;
               var12 = field625[11];
               var30 = field628[11];
               var31 = field630;
            }

            if(var11 < var12) {
               var10 = var31[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.method1143(var30[var11++]);
                  if(var11 == var12 && var30 != field628[11]) {
                     var11 = 0;
                     var12 = field625[11];
                     var30 = field628[11];
                     var31 = field630;
                  }

                  if(var11 < var12) {
                     var10 = var31[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.method1143(var30[var11++]);
                  if(var11 == var12 && var30 != field628[11]) {
                     var11 = 0;
                     var12 = field625[11];
                     var30 = field628[11];
                     var31 = field630;
                  }

                  if(var11 < var12) {
                     var10 = var31[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.method1143(var30[var11++]);
                  if(var11 == var12 && var30 != field628[11]) {
                     var11 = 0;
                     var12 = field625[11];
                     var30 = field628[11];
                     var31 = field630;
                  }

                  if(var11 < var12) {
                     var10 = var31[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = field625[var15];
               int[] var32 = field628[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.method1143(var32[var18]);
               }
            }

            while(var10 != -1000) {
               this.method1143(var30[var11++]);
               if(var11 == var12 && var30 != field628[11]) {
                  var11 = 0;
                  var30 = field628[11];
                  var12 = field625[11];
                  var31 = field630;
               }

               if(var11 < var12) {
                  var10 = var31[var11];
               } else {
                  var10 = -1000;
               }
            }

         }
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Let;I)V"
   )
   public void method1130(class202 var1, int var2) {
      if(this.field627 != null) {
         if(var2 != -1) {
            class0 var3 = var1.field2844[var2];
            class141 var4 = var3.field4;
            field635 = 0;
            field636 = 0;
            field629 = 0;

            for(int var5 = 0; var5 < var3.field5; ++var5) {
               int var6 = var3.field6[var5];
               this.method1146(var4.field1798[var6], var4.field1799[var6], var3.field10[var5], var3.field1[var5], var3.field9[var5]);
            }

            this.method1129();
         }
      }
   }

   @ObfuscatedName("p")
   void method1144() {
      if(this.field604 != 2) {
         this.field604 = 2;
         this.field606 = 0;

         for(int var1 = 0; var1 < this.field644; ++var1) {
            int var2 = this.field582[var1];
            int var3 = this.field645[var1];
            int var4 = this.field584[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if(var5 > this.field606) {
               this.field606 = var5;
            }
         }

         this.field606 = (int)(Math.sqrt((double)this.field606) + 0.99D);
         this.field608 = this.field606;
         this.field607 = this.field606 + this.field606;
      }
   }

   @ObfuscatedName("i")
   public void method1136(int var1) {
      int var2 = field641[var1];
      int var3 = field642[var1];

      for(int var4 = 0; var4 < this.field644; ++var4) {
         int var5 = var3 * this.field645[var4] - var2 * this.field584[var4] >> 16;
         this.field584[var4] = var2 * this.field645[var4] + var3 * this.field584[var4] >> 16;
         this.field645[var4] = var5;
      }

      this.method1129();
   }

   @ObfuscatedName("c")
   public void method1126() {
      if(this.field604 != 1) {
         this.field604 = 1;
         super.field1143 = 0;
         this.field605 = 0;
         this.field606 = 0;

         for(int var1 = 0; var1 < this.field644; ++var1) {
            int var2 = this.field582[var1];
            int var3 = this.field645[var1];
            int var4 = this.field584[var1];
            if(-var3 > super.field1143) {
               super.field1143 = -var3;
            }

            if(var3 > this.field605) {
               this.field605 = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if(var5 > this.field606) {
               this.field606 = var5;
            }
         }

         this.field606 = (int)(Math.sqrt((double)this.field606) + 0.99D);
         this.field608 = (int)(Math.sqrt((double)(this.field606 * this.field606 + super.field1143 * super.field1143)) + 0.99D);
         this.field607 = this.field608 + (int)(Math.sqrt((double)(this.field606 * this.field606 + this.field605 * this.field605)) + 0.99D);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Z)Lds;"
   )
   public class52 method1127(boolean var1) {
      if(!var1 && field578.length < this.field585) {
         field578 = new byte[this.field585 + 100];
      }

      return this.method1124(var1, field639, field578);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(ZLds;[B)Lds;"
   )
   class52 method1124(boolean var1, class52 var2, byte[] var3) {
      this.rl$buildSharedModel(var1, var2, var3);
      var2.field644 = this.field644;
      var2.field585 = this.field585;
      var2.field591 = this.field591;
      if(var2.field582 == null || var2.field582.length < this.field644) {
         var2.field582 = new int[this.field644 + 100];
         var2.field645 = new int[this.field644 + 100];
         var2.field584 = new int[this.field644 + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.field644; ++var4) {
         var2.field582[var4] = this.field582[var4];
         var2.field645[var4] = this.field645[var4];
         var2.field584[var4] = this.field584[var4];
      }

      if(var1) {
         var2.field593 = this.field593;
      } else {
         var2.field593 = var3;
         if(this.field593 == null) {
            for(var4 = 0; var4 < this.field585; ++var4) {
               var2.field593[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.field585; ++var4) {
               var2.field593[var4] = this.field593[var4];
            }
         }
      }

      var2.field586 = this.field586;
      var2.field624 = this.field624;
      var2.field588 = this.field588;
      var2.field589 = this.field589;
      var2.field590 = this.field590;
      var2.field577 = this.field577;
      var2.field623 = this.field623;
      var2.field594 = this.field594;
      var2.field595 = this.field595;
      var2.field596 = this.field596;
      var2.field612 = this.field612;
      var2.field597 = this.field597;
      var2.field600 = this.field600;
      var2.field627 = this.field627;
      var2.field602 = this.field602;
      var2.field603 = this.field603;
      var2.method1129();
      return var2;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([[IIIIZI)Lds;"
   )
   public class52 method1121(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      class52 var7 = this.copy$contourGround(var1, var2, var3, var4, var5, var6);
      if(var7 != null && var7 != this) {
         RSModel var8 = (RSModel)var7;
         var8.setFaceTextureUCoordinates(this.rl$faceTextureUCoordinates);
         var8.setFaceTextureVCoordinates(this.rl$faceTextureVCoordinates);
      }

      return var7;
   }

   @ObfuscatedName("r")
   public int method1128() {
      this.method1126();
      return this.field606;
   }

   @ObfuscatedName("u")
   public void method1134() {
      for(int var1 = 0; var1 < this.field644; ++var1) {
         this.field582[var1] = -this.field582[var1];
         this.field584[var1] = -this.field584[var1];
      }

      this.method1129();
   }

   @ObfuscatedName("y")
   public final void method1139(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      field592[0] = -1;
      if(this.field604 != 2 && this.field604 != 1) {
         this.method1144();
      }

      int var8 = class211.field2907;
      int var9 = class211.field2897;
      int var10 = field641[var1];
      int var11 = field642[var1];
      int var12 = field641[var2];
      int var13 = field642[var2];
      int var14 = field641[var3];
      int var15 = field642[var3];
      int var16 = field641[var4];
      int var17 = field642[var4];
      int var18 = var16 * var6 + var17 * var7 >> 16;

      for(int var19 = 0; var19 < this.field644; ++var19) {
         int var20 = this.field582[var19];
         int var21 = this.field645[var19];
         int var22 = this.field584[var19];
         int var23;
         if(var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if(var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if(var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         field620[var19] = var22 - var18;
         field618[var19] = var20 * class211.field2906 / var22 + var8;
         field619[var19] = var23 * class211.field2906 / var22 + var9;
         if(this.field591 > 0) {
            field621[var19] = var20;
            field622[var19] = var23;
            field616[var19] = var22;
         }
      }

      try {
         this.method1142(false, false, false, 0L);
      } catch (Exception var25) {
         ;
      }

   }

   public int[] getTrianglesX() {
      return this.field586;
   }

   public int[][] getVertexGroups() {
      return this.field627;
   }

   public List getVertices() {
      int[] var1 = this.getVerticesX();
      int[] var2 = this.getVerticesY();
      int[] var3 = this.getVerticesZ();
      ArrayList var4 = new ArrayList();

      for(int var5 = 0; var5 < this.getVerticesCount(); ++var5) {
         Vertex var6 = new Vertex(var1[var5], var2[var5], var3[var5]);
         var4.add(var6);
      }

      return var4;
   }

   public void rl$buildSharedModel(boolean var1, Model var2, byte[] var3) {
      RSModel var4 = (RSModel)var2;
      var4.setFaceTextureUCoordinates(this.rl$faceTextureUCoordinates);
      var4.setFaceTextureVCoordinates(this.rl$faceTextureVCoordinates);
   }

   @ObfuscatedSignature(
      signature = "([[IIIIZI)Lds;"
   )
   public class52 copy$contourGround(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method1126();
      int var7 = var2 - this.field606;
      int var8 = var2 + this.field606;
      int var9 = var4 - this.field606;
      int var10 = var4 + this.field606;
      if(var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if(var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
            return this;
         } else {
            class52 var11;
            if(var5) {
               var11 = new class52();
               var11.field644 = this.field644;
               var11.field585 = this.field585;
               var11.field591 = this.field591;
               var11.field582 = this.field582;
               var11.field584 = this.field584;
               var11.field586 = this.field586;
               var11.field624 = this.field624;
               var11.field588 = this.field588;
               var11.field589 = this.field589;
               var11.field590 = this.field590;
               var11.field577 = this.field577;
               var11.field623 = this.field623;
               var11.field593 = this.field593;
               var11.field594 = this.field594;
               var11.field595 = this.field595;
               var11.field596 = this.field596;
               var11.field612 = this.field612;
               var11.field597 = this.field597;
               var11.field600 = this.field600;
               var11.field627 = this.field627;
               var11.field602 = this.field602;
               var11.field603 = this.field603;
               var11.field645 = new int[var11.field644];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if(var6 == 0) {
               for(var12 = 0; var12 < var11.field644; ++var12) {
                  var13 = var2 + this.field582[var12];
                  var14 = var4 + this.field584[var12];
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field645[var12] = var21 + this.field645[var12] - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field644; ++var12) {
                  var13 = (-this.field645[var12] << 16) / super.field1143;
                  if(var13 < var6) {
                     var14 = var2 + this.field582[var12];
                     var15 = var4 + this.field584[var12];
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field645[var12] = (var6 - var13) * (var22 - var3) / var6 + this.field645[var12];
                  }
               }
            }

            var11.method1129();
            return var11;
         }
      } else {
         return this;
      }
   }

   public int[] getVerticesX() {
      return this.field582;
   }

   public int[] getTrianglesY() {
      return this.field624;
   }

   public void setFaceTextureUCoordinates(float[][] var1) {
      this.rl$faceTextureUCoordinates = var1;
   }

   public int[] getVerticesY() {
      return this.field645;
   }

   public int[] getTrianglesZ() {
      return this.field588;
   }

   public void setFaceTextureVCoordinates(float[][] var1) {
      this.rl$faceTextureVCoordinates = var1;
   }

   public int[] getVerticesZ() {
      return this.field584;
   }

   public int getVerticesCount() {
      return this.field644;
   }

   public int getTrianglesCount() {
      return this.field585;
   }

   public void interpolateFrames(RSFrameMap var1, RSFrame var2, RSFrame var3, int var4, int var5) {
      int var6;
      int var7;
      if(var3 != null && var4 != 0) {
         var6 = 0;
         var7 = 0;

         for(int var8 = 0; var8 < var1.getCount(); ++var8) {
            boolean var9 = false;
            if(var6 < var2.getTransformCount() && var2.getTransformTypes()[var6] == var8) {
               var9 = true;
            }

            boolean var10 = false;
            if(var7 < var3.getTransformCount() && var3.getTransformTypes()[var7] == var8) {
               var10 = true;
            }

            if(var9 || var10) {
               short var11 = 0;
               int var12 = var1.getTypes()[var8];
               if(var12 == 3 || var12 == 10) {
                  var11 = 128;
               }

               int var13 = var11;
               int var14 = var11;
               int var15 = var11;
               if(var9) {
                  var13 = var2.getTranslatorX()[var6];
                  var14 = var2.getTranslatorY()[var6];
                  var15 = var2.getTranslatorZ()[var6];
                  ++var6;
               }

               int var16 = var11;
               int var17 = var11;
               int var18 = var11;
               if(var10) {
                  var16 = var3.getTranslatorX()[var7];
                  var17 = var3.getTranslatorY()[var7];
                  var18 = var3.getTranslatorZ()[var7];
                  ++var7;
               }

               int var19;
               int var20;
               int var21;
               if(var12 == 2) {
                  int var22 = var16 - var13 & 255;
                  int var23 = var17 - var14 & 255;
                  int var24 = var18 - var15 & 255;
                  if(var22 >= 128) {
                     var22 -= 256;
                  }

                  if(var23 >= 128) {
                     var23 -= 256;
                  }

                  if(var24 >= 128) {
                     var24 -= 256;
                  }

                  var19 = var13 + var22 * var4 / var5 & 255;
                  var20 = var14 + var23 * var4 / var5 & 255;
                  var21 = var15 + var24 * var4 / var5 & 255;
               } else if(var12 == 5) {
                  var19 = var13;
                  var20 = 0;
                  var21 = 0;
               } else {
                  var19 = var13 + (var16 - var13) * var4 / var5;
                  var20 = var14 + (var17 - var14) * var4 / var5;
                  var21 = var15 + (var18 - var15) * var4 / var5;
               }

               this.animate(var12, var1.getList()[var8], var19, var20, var21);
            }
         }
      } else {
         for(var6 = 0; var6 < var2.getTransformCount(); ++var6) {
            var7 = var2.getTransformTypes()[var6];
            this.animate(var1.getTypes()[var7], var1.getList()[var7], var2.getTranslatorX()[var6], var2.getTranslatorY()[var6], var2.getTranslatorZ()[var6]);
         }
      }

   }

   public void resetBounds() {
      this.method1129();
   }

   public void animate(int var1, int[] var2, int var3, int var4, int var5) {
      this.method1146(var1, var2, var3, var4, var5);
   }

   public void rl$init(RSModel[] var1, int var2) {
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         RSModel var5 = var1[var4];
         if(var5 != null) {
            var3 += var5.getTrianglesCount();
         }
      }

      float[][] var12 = new float[var3][];
      float[][] var13 = new float[var3][];
      int var6 = 0;

      for(int var7 = 0; var7 < var2; ++var7) {
         RSModel var8 = var1[var7];
         if(var8 != null) {
            float[][] var9 = var8.getFaceTextureUCoordinates();
            float[][] var10 = var8.getFaceTextureVCoordinates();

            for(int var11 = 0; var11 < var8.getTrianglesCount(); ++var11) {
               if(var9 != null && var10 != null) {
                  var12[var6] = var9[var11];
                  var13[var6] = var10[var11];
               }

               ++var6;
            }
         }
      }

      this.setFaceTextureUCoordinates(var12);
      this.setFaceTextureVCoordinates(var13);
   }

   public List getTriangles() {
      int[] var1 = this.getTrianglesX();
      int[] var2 = this.getTrianglesY();
      int[] var3 = this.getTrianglesZ();
      List var4 = this.getVertices();
      ArrayList var5 = new ArrayList(this.getTrianglesCount());

      for(int var6 = 0; var6 < this.getTrianglesCount(); ++var6) {
         int var7 = var1[var6];
         int var8 = var2[var6];
         int var9 = var3[var6];
         Triangle var10 = new Triangle((Vertex)var4.get(var7), (Vertex)var4.get(var8), (Vertex)var4.get(var9));
         var5.add(var10);
      }

      return var5;
   }

   public void interpolateFrames(RSFrames var1, int var2, RSFrames var3, int var4, int var5, int var6) {
      if(this.getVertexGroups() != null && var2 != -1) {
         RSFrame var7 = var1.getFrames()[var2];
         RSFrameMap var8 = var7.getSkin();
         RSFrame var9 = null;
         if(var3 != null) {
            var9 = var3.getFrames()[var4];
            if(var9.getSkin() != var8) {
               var9 = null;
            }
         }

         class302.field3755.setAnimOffsetX(0);
         class302.field3755.setAnimOffsetY(0);
         class302.field3755.setAnimOffsetZ(0);
         this.interpolateFrames(var8, var7, var9, var5, var6);
         this.resetBounds();
      }

   }

   public Polygon getConvexHull(int var1, int var2, int var3) {
      List var4 = this.getVertices();

      for(int var5 = 0; var5 < var4.size(); ++var5) {
         Vertex var6 = (Vertex)var4.get(var5);
         var4.set(var5, var6.rotate(var3));
      }

      ArrayList var9 = new ArrayList();
      Iterator var10 = var4.iterator();

      Point var8;
      while(var10.hasNext()) {
         Vertex var7 = (Vertex)var10.next();
         var8 = Perspective.localToCanvas(class302.field3755, new LocalPoint(var1 - var7.getX(), var2 - var7.getZ()), class302.field3755.getPlane(), -var7.getY());
         if(var8 != null) {
            var9.add(var8);
         }
      }

      List var13 = Jarvis.convexHull(var9);
      if(var13 == null) {
         return null;
      } else {
         Polygon var11 = new Polygon();
         Iterator var12 = var13.iterator();

         while(var12.hasNext()) {
            var8 = (Point)var12.next();
            var11.addPoint(var8.getX(), var8.getY());
         }

         return var11;
      }
   }

   public int getSceneId() {
      return this.rl$sceneId;
   }

   public void setSceneId(int var1) {
      this.rl$sceneId = var1;
   }

   public int getBufferOffset() {
      return this.rl$bufferOffset;
   }

   public void setBufferOffset(int var1) {
      this.rl$bufferOffset = var1;
   }

   public int getUvBufferOffset() {
      return this.rl$uvBufferOffset;
   }

   public void setUvBufferOffset(int var1) {
      this.rl$uvBufferOffset = var1;
   }

   public float[][] getFaceTextureUCoordinates() {
      return this.rl$faceTextureUCoordinates;
   }

   public float[][] getFaceTextureVCoordinates() {
      return this.rl$faceTextureVCoordinates;
   }

   public int[] getFaceColors1() {
      return this.field589;
   }

   public int[] getFaceColors2() {
      return this.field590;
   }

   public int[] getFaceColors3() {
      return this.field577;
   }

   public byte[] getFaceRenderPriorities() {
      return this.field623;
   }

   public byte[] getTriangleTransparencies() {
      return this.field593;
   }

   public short[] getFaceTextures() {
      return this.field595;
   }

   public boolean isClickable() {
      return this.field603;
   }

   public int getXYZMag() {
      return this.field606;
   }

   public int getRadius() {
      return this.field608;
   }

   public int getCenterX() {
      return this.field609;
   }

   public int getCenterY() {
      return this.field599;
   }

   public int getCenterZ() {
      return this.field611;
   }

   public int getExtremeX() {
      return this.field626;
   }

   public int getExtremeY() {
      return this.field613;
   }

   public int getExtremeZ() {
      return this.field614;
   }

   public RSModel toSharedModel(boolean var1) {
      return this.method1127(var1);
   }

   public RSModel toSharedSpotAnimModel(boolean var1) {
      return this.method1123(var1);
   }

   public void calculateExtreme(int var1) {
      this.method1122(var1);
   }

   public void calculateBoundsCylinder() {
      this.method1126();
   }

   public void rotateY90Ccw() {
      this.method1179();
   }

   public void rotateY180Ccw() {
      this.method1134();
   }

   public void rotateY270Ccw() {
      this.method1135();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Let;ILet;I[I)V"
   )
   public void method1131(class202 var1, int var2, class202 var3, int var4, int[] var5) {
      if(var2 != -1) {
         if(var5 != null && var4 != -1) {
            class0 var6 = var1.field2844[var2];
            class0 var7 = var3.field2844[var4];
            class141 var8 = var6.field4;
            field635 = 0;
            field636 = 0;
            field629 = 0;
            byte var9 = 0;
            int var13 = var9 + 1;
            int var10 = var5[var9];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.field5; ++var11) {
               for(var12 = var6.field6[var11]; var12 > var10; var10 = var5[var13++]) {
                  ;
               }

               if(var12 != var10 || var8.field1798[var12] == 0) {
                  this.method1146(var8.field1798[var12], var8.field1799[var12], var6.field10[var11], var6.field1[var11], var6.field9[var11]);
               }
            }

            field635 = 0;
            field636 = 0;
            field629 = 0;
            var9 = 0;
            var13 = var9 + 1;
            var10 = var5[var9];

            for(var11 = 0; var11 < var7.field5; ++var11) {
               for(var12 = var7.field6[var11]; var12 > var10; var10 = var5[var13++]) {
                  ;
               }

               if(var12 == var10 || var8.field1798[var12] == 0) {
                  this.method1146(var8.field1798[var12], var8.field1799[var12], var7.field10[var11], var7.field1[var11], var7.field9[var11]);
               }
            }

            this.method1129();
         } else {
            this.method1130(var1, var2);
         }
      }
   }

   @ObfuscatedName("v")
   void method1146(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var11;
      int var12;
      if(var1 == 0) {
         var7 = 0;
         field635 = 0;
         field636 = 0;
         field629 = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var9 = var2[var8];
            if(var9 < this.field627.length) {
               int[] var10 = this.field627[var9];

               for(var11 = 0; var11 < var10.length; ++var11) {
                  var12 = var10[var11];
                  field635 += this.field582[var12];
                  field636 += this.field645[var12];
                  field629 += this.field584[var12];
                  ++var7;
               }
            }
         }

         if(var7 > 0) {
            field635 = var3 + field635 / var7;
            field636 = var4 + field636 / var7;
            field629 = var5 + field629 / var7;
         } else {
            field635 = var3;
            field636 = var4;
            field629 = var5;
         }

      } else {
         int[] var18;
         int var19;
         if(var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.field627.length) {
                  var18 = this.field627[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var11 = var18[var19];
                     this.field582[var11] += var3;
                     this.field645[var11] += var4;
                     this.field584[var11] += var5;
                  }
               }
            }

         } else if(var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.field627.length) {
                  var18 = this.field627[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var11 = var18[var19];
                     this.field582[var11] -= field635;
                     this.field645[var11] -= field636;
                     this.field584[var11] -= field629;
                     var12 = (var3 & 255) * 8;
                     int var13 = (var4 & 255) * 8;
                     int var14 = (var5 & 255) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if(var14 != 0) {
                        var15 = field641[var14];
                        var16 = field642[var14];
                        var17 = var15 * this.field645[var11] + var16 * this.field582[var11] >> 16;
                        this.field645[var11] = var16 * this.field645[var11] - var15 * this.field582[var11] >> 16;
                        this.field582[var11] = var17;
                     }

                     if(var12 != 0) {
                        var15 = field641[var12];
                        var16 = field642[var12];
                        var17 = var16 * this.field645[var11] - var15 * this.field584[var11] >> 16;
                        this.field584[var11] = var15 * this.field645[var11] + var16 * this.field584[var11] >> 16;
                        this.field645[var11] = var17;
                     }

                     if(var13 != 0) {
                        var15 = field641[var13];
                        var16 = field642[var13];
                        var17 = var15 * this.field584[var11] + var16 * this.field582[var11] >> 16;
                        this.field584[var11] = var16 * this.field584[var11] - var15 * this.field582[var11] >> 16;
                        this.field582[var11] = var17;
                     }

                     this.field582[var11] += field635;
                     this.field645[var11] += field636;
                     this.field584[var11] += field629;
                  }
               }
            }

         } else if(var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.field627.length) {
                  var18 = this.field627[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var11 = var18[var19];
                     this.field582[var11] -= field635;
                     this.field645[var11] -= field636;
                     this.field584[var11] -= field629;
                     this.field582[var11] = var3 * this.field582[var11] / 128;
                     this.field645[var11] = var4 * this.field645[var11] / 128;
                     this.field584[var11] = var5 * this.field584[var11] / 128;
                     this.field582[var11] += field635;
                     this.field645[var11] += field636;
                     this.field584[var11] += field629;
                  }
               }
            }

         } else if(var1 == 5) {
            if(this.field602 != null && this.field593 != null) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var2[var7];
                  if(var8 < this.field602.length) {
                     var18 = this.field602[var8];

                     for(var19 = 0; var19 < var18.length; ++var19) {
                        var11 = var18[var19];
                        var12 = (this.field593[var11] & 255) + var3 * 8;
                        if(var12 < 0) {
                           var12 = 0;
                        } else if(var12 > 255) {
                           var12 = 255;
                        }

                        this.field593[var11] = (byte)var12;
                     }
                  }
               }
            }

         }
      }
   }

   @ObfuscatedName("av")
   public final void method1140(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      field592[0] = -1;
      if(this.field604 != 2 && this.field604 != 1) {
         this.method1144();
      }

      int var9 = class211.field2907;
      int var10 = class211.field2897;
      int var11 = field641[var1];
      int var12 = field642[var1];
      int var13 = field641[var2];
      int var14 = field642[var2];
      int var15 = field641[var3];
      int var16 = field642[var3];
      int var17 = field641[var4];
      int var18 = field642[var4];
      int var19 = var17 * var6 + var18 * var7 >> 16;

      for(int var20 = 0; var20 < this.field644; ++var20) {
         int var21 = this.field582[var20];
         int var22 = this.field645[var20];
         int var23 = this.field584[var20];
         int var24;
         if(var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if(var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if(var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         field620[var20] = var23 - var19;
         field618[var20] = var9 + var21 * class211.field2906 / var8;
         field619[var20] = var10 + var24 * class211.field2906 / var8;
         if(this.field591 > 0) {
            field621[var20] = var21;
            field622[var20] = var24;
            field616[var20] = var23;
         }
      }

      try {
         this.method1142(false, false, false, 0L);
      } catch (Exception var26) {
         ;
      }

   }

   @ObfuscatedName("d")
   void method1129() {
      this.field604 = 0;
      this.field626 = -1;
   }

   @ObfuscatedName("o")
   public void method1135() {
      for(int var1 = 0; var1 < this.field644; ++var1) {
         int var2 = this.field584[var1];
         this.field584[var1] = this.field582[var1];
         this.field582[var1] = -var2;
      }

      this.method1129();
   }

   @ObfuscatedName("g")
   public void method1179() {
      for(int var1 = 0; var1 < this.field644; ++var1) {
         int var2 = this.field582[var1];
         this.field582[var1] = this.field584[var1];
         this.field584[var1] = -var2;
      }

      this.method1129();
   }

   @ObfuscatedName("cw")
   void vmethod1845(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      field592[0] = -1;
      if(this.field604 != 1) {
         this.method1126();
      }

      this.method1122(var1);
      int var11 = var5 * var8 - var4 * var6 >> 16;
      int var12 = var2 * var7 + var3 * var11 >> 16;
      int var13 = var3 * this.field606 >> 16;
      int var14 = var12 + var13;
      if(var14 > 50 && var12 < 3500) {
         int var15 = var8 * var4 + var5 * var6 >> 16;
         int var16 = (var15 - this.field606) * class211.field2906;
         if(var16 / var14 < class211.field2912) {
            int var17 = (var15 + this.field606) * class211.field2906;
            if(var17 / var14 > class211.field2915) {
               int var18 = var3 * var7 - var11 * var2 >> 16;
               int var19 = var2 * this.field606 >> 16;
               int var20 = (var18 + var19) * class211.field2906;
               if(var20 / var14 > class211.field2911) {
                  int var21 = (var3 * super.field1143 >> 16) + var19;
                  int var22 = (var18 - var21) * class211.field2906;
                  if(var22 / var14 < class211.field2913) {
                     int var23 = var13 + (var2 * super.field1143 >> 16);
                     boolean var24 = false;
                     boolean var25 = false;
                     if(var12 - var23 <= 50) {
                        var25 = true;
                     }

                     boolean var26 = var25 || this.field591 > 0;
                     int var27 = class298.field3706;
                     int var29 = class317.method6214();
                     boolean var30 = class210.method4243();
                     boolean var32 = var9 != 0L;
                     boolean var33;
                     if(var32) {
                        var33 = (int)(var9 >>> 16 & 1L) == 1;
                        var32 = !var33;
                     }

                     var33 = false;
                     int var35;
                     int var36;
                     int var37;
                     if(var32 && var30) {
                        boolean var34 = false;
                        if(field638) {
                           var34 = class164.method3016(this, var6, var7, var8);
                        } else {
                           var35 = var12 - var13;
                           if(var35 <= 50) {
                              var35 = 50;
                           }

                           if(var15 > 0) {
                              var16 /= var14;
                              var17 /= var35;
                           } else {
                              var17 /= var14;
                              var16 /= var35;
                           }

                           if(var18 > 0) {
                              var22 /= var14;
                              var20 /= var35;
                           } else {
                              var20 /= var14;
                              var22 /= var35;
                           }

                           var36 = var27 - class211.field2907;
                           var37 = var29 - class211.field2897;
                           if(var36 > var16 && var36 < var17 && var37 > var22 && var37 < var20) {
                              var34 = true;
                           }
                        }

                        if(var34) {
                           if(this.field603) {
                              class77.method1579(var9);
                           } else {
                              var33 = true;
                           }
                        }
                     }

                     int var45 = class211.field2907;
                     var35 = class211.field2897;
                     var36 = 0;
                     var37 = 0;
                     if(var1 != 0) {
                        var36 = field641[var1];
                        var37 = field642[var1];
                     }

                     for(int var38 = 0; var38 < this.field644; ++var38) {
                        int var39 = this.field582[var38];
                        int var40 = this.field645[var38];
                        int var41 = this.field584[var38];
                        int var42;
                        if(var1 != 0) {
                           var42 = var41 * var36 + var39 * var37 >> 16;
                           var41 = var41 * var37 - var39 * var36 >> 16;
                           var39 = var42;
                        }

                        var39 += var6;
                        var40 += var7;
                        var41 += var8;
                        var42 = var41 * var4 + var5 * var39 >> 16;
                        var41 = var5 * var41 - var39 * var4 >> 16;
                        var39 = var42;
                        var42 = var3 * var40 - var41 * var2 >> 16;
                        var41 = var40 * var2 + var3 * var41 >> 16;
                        field620[var38] = var41 - var12;
                        if(var41 >= 50) {
                           field618[var38] = var39 * class211.field2906 / var41 + var45;
                           field619[var38] = var42 * class211.field2906 / var41 + var35;
                        } else {
                           field618[var38] = -5000;
                           var24 = true;
                        }

                        if(var26) {
                           field621[var38] = var39;
                           field622[var38] = var42;
                           field616[var38] = var41;
                        }
                     }

                     try {
                        this.method1142(var24, var33, this.field603, var9);
                     } catch (Exception var44) {
                        ;
                     }

                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("q")
   public void method1172(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field644; ++var4) {
         this.field582[var4] = this.field582[var4] * var1 / 128;
         this.field645[var4] = var2 * this.field645[var4] / 128;
         this.field584[var4] = var3 * this.field584[var4] / 128;
      }

      this.method1129();
   }

   @ObfuscatedName("e")
   void method1122(int var1) {
      if(this.field626 == -1) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = field642[var1];
         int var9 = field641[var1];

         for(int var10 = 0; var10 < this.field644; ++var10) {
            int var11 = class211.method4253(this.field582[var10], this.field584[var10], var8, var9);
            int var12 = this.field645[var10];
            int var13 = class211.method4266(this.field582[var10], this.field584[var10], var8, var9);
            if(var11 < var2) {
               var2 = var11;
            }

            if(var11 > var5) {
               var5 = var11;
            }

            if(var12 < var3) {
               var3 = var12;
            }

            if(var12 > var6) {
               var6 = var12;
            }

            if(var13 < var4) {
               var4 = var13;
            }

            if(var13 > var7) {
               var7 = var13;
            }
         }

         this.field609 = (var5 + var2) / 2;
         this.field599 = (var6 + var3) / 2;
         this.field611 = (var7 + var4) / 2;
         this.field626 = (var5 - var2 + 1) / 2;
         this.field613 = (var6 - var3 + 1) / 2;
         this.field614 = (var7 - var4 + 1) / 2;
         if(this.field626 < 32) {
            this.field626 = 32;
         }

         if(this.field614 < 32) {
            this.field614 = 32;
         }

         if(this.field603) {
            this.field626 += 8;
            this.field614 += 8;
         }

      }
   }

   @ObfuscatedName("az")
   final void method1183(int var1) {
      int var2 = class211.field2907;
      int var3 = class211.field2897;
      int var4 = 0;
      int var5 = this.field586[var1];
      int var6 = this.field624[var1];
      int var7 = this.field588[var1];
      int var8 = field616[var5];
      int var9 = field616[var6];
      int var10 = field616[var7];
      if(this.field593 == null) {
         class211.field2899 = 0;
      } else {
         class211.field2899 = this.field593[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if(var8 >= 50) {
         field643[var4] = field618[var5];
         field633[var4] = field619[var5];
         field634[var4++] = this.field589[var1];
      } else {
         var11 = field621[var5];
         var12 = field622[var5];
         var13 = this.field589[var1];
         if(var10 >= 50) {
            var14 = field587[var10 - var8] * (50 - var8);
            field643[var4] = var2 + class211.field2906 * (var11 + ((field621[var7] - var11) * var14 >> 16)) / 50;
            field633[var4] = var3 + class211.field2906 * (var12 + ((field622[var7] - var12) * var14 >> 16)) / 50;
            field634[var4++] = var13 + ((this.field577[var1] - var13) * var14 >> 16);
         }

         if(var9 >= 50) {
            var14 = field587[var9 - var8] * (50 - var8);
            field643[var4] = var2 + class211.field2906 * (var11 + ((field621[var6] - var11) * var14 >> 16)) / 50;
            field633[var4] = var3 + class211.field2906 * (var12 + ((field622[var6] - var12) * var14 >> 16)) / 50;
            field634[var4++] = var13 + ((this.field590[var1] - var13) * var14 >> 16);
         }
      }

      if(var9 >= 50) {
         field643[var4] = field618[var6];
         field633[var4] = field619[var6];
         field634[var4++] = this.field590[var1];
      } else {
         var11 = field621[var6];
         var12 = field622[var6];
         var13 = this.field590[var1];
         if(var8 >= 50) {
            var14 = field587[var8 - var9] * (50 - var9);
            field643[var4] = var2 + class211.field2906 * (var11 + ((field621[var5] - var11) * var14 >> 16)) / 50;
            field633[var4] = var3 + class211.field2906 * (var12 + ((field622[var5] - var12) * var14 >> 16)) / 50;
            field634[var4++] = var13 + ((this.field589[var1] - var13) * var14 >> 16);
         }

         if(var10 >= 50) {
            var14 = field587[var10 - var9] * (50 - var9);
            field643[var4] = var2 + class211.field2906 * (var11 + ((field621[var7] - var11) * var14 >> 16)) / 50;
            field633[var4] = var3 + class211.field2906 * (var12 + ((field622[var7] - var12) * var14 >> 16)) / 50;
            field634[var4++] = var13 + ((this.field577[var1] - var13) * var14 >> 16);
         }
      }

      if(var10 >= 50) {
         field643[var4] = field618[var7];
         field633[var4] = field619[var7];
         field634[var4++] = this.field577[var1];
      } else {
         var11 = field621[var7];
         var12 = field622[var7];
         var13 = this.field577[var1];
         if(var9 >= 50) {
            var14 = field587[var9 - var10] * (50 - var10);
            field643[var4] = var2 + class211.field2906 * (var11 + ((field621[var6] - var11) * var14 >> 16)) / 50;
            field633[var4] = var3 + class211.field2906 * (var12 + ((field622[var6] - var12) * var14 >> 16)) / 50;
            field634[var4++] = var13 + ((this.field590[var1] - var13) * var14 >> 16);
         }

         if(var8 >= 50) {
            var14 = field587[var8 - var10] * (50 - var10);
            field643[var4] = var2 + class211.field2906 * (var11 + ((field621[var5] - var11) * var14 >> 16)) / 50;
            field633[var4] = var3 + class211.field2906 * (var12 + ((field622[var5] - var12) * var14 >> 16)) / 50;
            field634[var4++] = var13 + ((this.field589[var1] - var13) * var14 >> 16);
         }
      }

      var11 = field643[0];
      var12 = field643[1];
      var13 = field643[2];
      var14 = field633[0];
      int var15 = field633[1];
      int var16 = field633[2];
      class211.field2909 = false;
      int var17;
      int var18;
      int var19;
      int var20;
      if(var4 == 3) {
         if(var11 < 0 || var12 < 0 || var13 < 0 || var11 > class211.field2908 || var12 > class211.field2908 || var13 > class211.field2908) {
            class211.field2909 = true;
         }

         if(this.field595 != null && this.field595[var1] != -1) {
            if(this.field594 != null && this.field594[var1] != -1) {
               var20 = this.field594[var1] & 255;
               var17 = this.field612[var20];
               var18 = this.field597[var20];
               var19 = this.field600[var20];
            } else {
               var17 = var5;
               var18 = var6;
               var19 = var7;
            }

            if(this.field577[var1] == -1) {
               class211.method4260(var14, var15, var16, var11, var12, var13, this.field589[var1], this.field589[var1], this.field589[var1], field621[var17], field621[var18], field621[var19], field622[var17], field622[var18], field622[var19], field616[var17], field616[var18], field616[var19], this.field595[var1]);
            } else {
               class211.method4260(var14, var15, var16, var11, var12, var13, field634[0], field634[1], field634[2], field621[var17], field621[var18], field621[var19], field622[var17], field622[var18], field622[var19], field616[var17], field616[var18], field616[var19], this.field595[var1]);
            }
         } else if(this.field577[var1] == -1) {
            class211.method4325(var14, var15, var16, var11, var12, var13, field632[this.field589[var1]]);
         } else {
            class211.method4256(var14, var15, var16, var11, var12, var13, field634[0], field634[1], field634[2]);
         }
      }

      if(var4 == 4) {
         if(var11 < 0 || var12 < 0 || var13 < 0 || var11 > class211.field2908 || var12 > class211.field2908 || var13 > class211.field2908 || field643[3] < 0 || field643[3] > class211.field2908) {
            class211.field2909 = true;
         }

         if(this.field595 != null && this.field595[var1] != -1) {
            if(this.field594 != null && this.field594[var1] != -1) {
               var20 = this.field594[var1] & 255;
               var17 = this.field612[var20];
               var18 = this.field597[var20];
               var19 = this.field600[var20];
            } else {
               var17 = var5;
               var18 = var6;
               var19 = var7;
            }

            short var21 = this.field595[var1];
            if(this.field577[var1] == -1) {
               class211.method4260(var14, var15, var16, var11, var12, var13, this.field589[var1], this.field589[var1], this.field589[var1], field621[var17], field621[var18], field621[var19], field622[var17], field622[var18], field622[var19], field616[var17], field616[var18], field616[var19], var21);
               class211.method4260(var14, var16, field633[3], var11, var13, field643[3], this.field589[var1], this.field589[var1], this.field589[var1], field621[var17], field621[var18], field621[var19], field622[var17], field622[var18], field622[var19], field616[var17], field616[var18], field616[var19], var21);
            } else {
               class211.method4260(var14, var15, var16, var11, var12, var13, field634[0], field634[1], field634[2], field621[var17], field621[var18], field621[var19], field622[var17], field622[var18], field622[var19], field616[var17], field616[var18], field616[var19], var21);
               class211.method4260(var14, var16, field633[3], var11, var13, field643[3], field634[0], field634[2], field634[3], field621[var17], field621[var18], field621[var19], field622[var17], field622[var18], field622[var19], field616[var17], field616[var18], field616[var19], var21);
            }
         } else if(this.field577[var1] == -1) {
            var17 = field632[this.field589[var1]];
            class211.method4325(var14, var15, var16, var11, var12, var13, var17);
            class211.method4325(var14, var16, field633[3], var11, var13, field643[3], var17);
         } else {
            class211.method4256(var14, var15, var16, var11, var12, var13, field634[0], field634[1], field634[2]);
            class211.method4256(var14, var16, field633[3], var11, var13, field643[3], field634[0], field634[2], field634[3]);
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Z)Lds;"
   )
   public class52 method1123(boolean var1) {
      if(!var1 && field580.length < this.field585) {
         field580 = new byte[this.field585 + 100];
      }

      return this.method1124(var1, field601, field580);
   }
}
