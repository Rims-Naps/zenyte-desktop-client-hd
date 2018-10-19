package net.runelite.client.standalone;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collection;
import net.runelite.api.Node;
import net.runelite.api.Point;
import net.runelite.api.SpritePixels;
import net.runelite.api.WidgetNode;
import net.runelite.api.events.WidgetHiddenChanged;
import net.runelite.api.events.WidgetPositioned;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSHashTable;
import net.runelite.rs.api.RSNode;
import net.runelite.rs.api.RSSpritePixels;
import net.runelite.rs.api.RSWidget;

@ObfuscatedName("hw")
public class class329 extends class76 implements RSWidget {
   @ObfuscatedName("j")
   public static boolean field3564;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class124 field3581;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   static class148 field3536;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class124 field3538;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   static class148 field3535;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   static class148 field3572;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class124 field3539;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "[[Lhw;"
   )
   public static class329[][] field3533;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class124 field3582;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   static class148 field3537;
   // $FF: synthetic field
   public static boolean $assertionsDisabled;
   public static int rl$widgetLastPosChanged;
   @ObfuscatedName("cj")
   @ObfuscatedGetter(
      intValue = 1210342177
   )
   public int field3609;
   @ObfuscatedName("fz")
   @ObfuscatedGetter(
      intValue = -894113755
   )
   public int field3680;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1965769659
   )
   public int field3555;
   @ObfuscatedName("dm")
   @ObfuscatedGetter(
      intValue = 1849058365
   )
   public int field3627;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1836529789
   )
   public int field3560;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 196926435
   )
   public int field3540;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = -148663123
   )
   public int field3584;
   @ObfuscatedName("cy")
   public boolean field3610;
   @ObfuscatedName("eg")
   public Object[] field3650;
   @ObfuscatedName("eq")
   @ObfuscatedGetter(
      intValue = 911021259
   )
   public int field3665;
   @ObfuscatedName("eb")
   public int[][] field3631;
   @ObfuscatedName("dk")
   public Object[] field3645;
   @ObfuscatedName("dy")
   public boolean field3632;
   @ObfuscatedName("ex")
   public Object[] field3660;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -202286445
   )
   public int field3546;
   @ObfuscatedName("ca")
   public String field3669;
   @ObfuscatedName("dq")
   public int[] field3646;
   @ObfuscatedName("cl")
   public int[] field3622;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -1596126381
   )
   public int field3577;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1250992329
   )
   public int field3619;
   @ObfuscatedName("em")
   public String field3667;
   @ObfuscatedName("da")
   public Object[] field3629;
   @ObfuscatedName("ch")
   public int[] field3621;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -552261697
   )
   public int field3558;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = -958018481
   )
   public int field3580;
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = -1504934257
   )
   public int field3541;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = -97024043
   )
   public int field3657;
   @ObfuscatedName("dx")
   public Object[] field3640;
   @ObfuscatedName("ad")
   public boolean field3569;
   @ObfuscatedName("cr")
   public byte[][] field3529;
   @ObfuscatedName("fj")
   @ObfuscatedGetter(
      intValue = -265825069
   )
   public int field3681;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = 2102078723
   )
   public int field3588;
   @ObfuscatedName("dg")
   public Object[] field3639;
   @ObfuscatedName("du")
   public Object[] field3634;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -795531255
   )
   public int field3551;
   @ObfuscatedName("df")
   public int[] field3624;
   @ObfuscatedName("er")
   public int[] field3664;
   @ObfuscatedName("dn")
   public boolean field3630;
   @ObfuscatedName("cd")
   public byte[][] field3648;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1629249107
   )
   public int field3547;
   @ObfuscatedName("ez")
   @ObfuscatedGetter(
      intValue = -1956313403
   )
   public int field3671;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -1266861631
   )
   public int field3554;
   @ObfuscatedName("ed")
   public boolean field3675;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -749404937
   )
   public int field3549;
   @ObfuscatedName("ee")
   public int[] field3663;
   @ObfuscatedName("el")
   public Object[] field3589;
   @ObfuscatedName("dv")
   public String field3633;
   @ObfuscatedName("ek")
   public int[] field3682;
   @ObfuscatedName("cf")
   public String field3605;
   @ObfuscatedName("fm")
   @ObfuscatedGetter(
      intValue = -374739463
   )
   public int field3612;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = 1229180585
   )
   public int field3579;
   @ObfuscatedName("cq")
   public String[] field3553;
   @ObfuscatedName("ei")
   @ObfuscatedGetter(
      intValue = -1794469075
   )
   public int field3662;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = -493965817
   )
   public int field3552;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = 2013632121
   )
   public int field3593;
   @ObfuscatedName("fy")
   public int[] field3557;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -142812563
   )
   public int field3607;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = 78569745
   )
   public int field3598;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -545180251
   )
   public int field3683;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = -978776883
   )
   public int field3591;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 2131081465
   )
   public int field3566;
   @ObfuscatedName("bc")
   public boolean field3601;
   @ObfuscatedName("es")
   public Object[] field3595;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = 2109467015
   )
   public int field3603;
   @ObfuscatedName("b")
   public boolean field3543;
   @ObfuscatedName("ea")
   public Object[] field3658;
   @ObfuscatedName("dt")
   public String[] field3616;
   @ObfuscatedName("cm")
   @ObfuscatedGetter(
      intValue = -1065924947
   )
   public int field3587;
   @ObfuscatedName("fd")
   public boolean field3676;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 911400937
   )
   public int field3606;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 1127952993
   )
   public int field3556;
   @ObfuscatedName("ck")
   public boolean field3618;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1053259381
   )
   public int field3567;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -2110036369
   )
   public int field3570;
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "Lln;"
   )
   public class82 field3574;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 1127096019
   )
   public int field3548;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = -1095395367
   )
   public int field3599;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = -1101283989
   )
   int field3534;
   @ObfuscatedName("dw")
   public Object[] field3608;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -578324031
   )
   public int field3594;
   @ObfuscatedName("ev")
   public String field3550;
   @ObfuscatedName("ds")
   public Object[] field3666;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = 1409600695
   )
   public int field3626;
   @ObfuscatedName("ej")
   public Object[] field3575;
   @ObfuscatedName("cu")
   @ObfuscatedGetter(
      intValue = 1024364003
   )
   public int field3583;
   @ObfuscatedName("dc")
   public Object[] field3542;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -451868253
   )
   public int field3565;
   @ObfuscatedName("co")
   public int[] field3615;
   @ObfuscatedName("do")
   public Object[] field3562;
   @ObfuscatedName("en")
   @ObfuscatedGetter(
      intValue = 1463933173
   )
   public int field3649;
   @ObfuscatedName("db")
   public Object[] field3635;
   @ObfuscatedName("di")
   public Object[] field3643;
   @ObfuscatedName("eo")
   public Object[] field3576;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -746653365
   )
   public int field3638;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = -1337341139
   )
   public int field3628;
   @ObfuscatedName("cc")
   public int[] field3614;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = 346597581
   )
   public int field3600;
   @ObfuscatedName("fe")
   public boolean field3685;
   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   public class329 field3625;
   @ObfuscatedName("dp")
   public Object[] field3636;
   @ObfuscatedName("eu")
   public Object[] field3661;
   @ObfuscatedName("cz")
   public int[] field3613;
   @ObfuscatedName("dr")
   public Object[] field3654;
   @ObfuscatedName("dz")
   public int[] field3644;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1506445757
   )
   public int field3545;
   @ObfuscatedName("ak")
   public boolean field3604;
   @ObfuscatedName("dd")
   @ObfuscatedGetter(
      intValue = -1489793593
   )
   public int field3656;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = 1722269255
   )
   public int field3592;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1902419107
   )
   public int field3561;
   @ObfuscatedName("ew")
   public int[] field3668;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 939634915
   )
   public int field3544;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = 731777287
   )
   int field3590;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1396071577
   )
   public int field3571;
   @ObfuscatedName("aj")
   public boolean field3573;
   @ObfuscatedName("ba")
   public boolean field3585;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = 20478079
   )
   public int field3617;
   @ObfuscatedName("fi")
   public boolean field3684;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = -284536533
   )
   public int field3596;
   @ObfuscatedName("bm")
   public boolean field3586;
   @ObfuscatedName("bf")
   public boolean field3623;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1278786479
   )
   public int field3568;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = 583148705
   )
   public int field3578;
   @ObfuscatedName("br")
   public boolean field3602;
   @ObfuscatedName("ey")
   public Object[] field3651;
   @ObfuscatedName("et")
   public Object[] field3652;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -72207201
   )
   public int field3559;
   @ObfuscatedName("cv")
   @ObfuscatedGetter(
      intValue = 2031775649
   )
   public int field3641;
   @ObfuscatedName("ef")
   public Object[] field3637;
   @ObfuscatedName("ep")
   @ObfuscatedSignature(
      signature = "[Lhw;"
   )
   public class329[] field3674;
   @ObfuscatedName("fb")
   @ObfuscatedGetter(
      intValue = 1740953889
   )
   public int field3653;
   @ObfuscatedName("dj")
   public Object[] field3670;
   @ObfuscatedName("dh")
   public Object[] field3647;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1893196075
   )
   public int field3678;
   @ObfuscatedName("fo")
   @ObfuscatedGetter(
      intValue = 68602407
   )
   public int field3679;
   @ObfuscatedName("eh")
   @ObfuscatedGetter(
      intValue = 1116896155
   )
   public int field3672;
   @ObfuscatedName("ec")
   public Object[] field3659;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -238362499
   )
   public int field3620;
   @ObfuscatedName("fk")
   @ObfuscatedGetter(
      intValue = -1011916107
   )
   public int field3677;
   @ObfuscatedName("ci")
   public String field3655;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1096444687
   )
   public int field3563;
   @ObfuscatedName("de")
   public Object[] field3642;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = 1657830653
   )
   public int field3673;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1547931167
   )
   public int field3611;
   public int rl$x;
   public int rl$y;
   public int rl$parentId;

   static {
      field3538 = new class124(200);
      field3539 = new class124(50);
      field3581 = new class124(20);
      field3582 = new class124(8);
      field3564 = false;
      rl$$clinit();
   }

   public class329() {
      this.field3543 = false;
      this.field3607 = -1;
      this.field3606 = -1;
      this.field3547 = 0;
      this.field3548 = 0;
      this.field3571 = 0;
      this.field3545 = 0;
      this.field3551 = 0;
      this.field3678 = 0;
      this.field3611 = 0;
      this.field3554 = 0;
      this.field3555 = 0;
      this.field3556 = 0;
      this.field3620 = 0;
      this.field3558 = 0;
      this.onPositionChanged(-1);
      this.field3559 = 0;
      this.field3560 = 0;
      this.field3561 = 1;
      this.field3549 = 1;
      this.field3563 = -1;
      this.field3569 = false;
      this.onHiddenChanged(-1);
      this.field3565 = 0;
      this.field3566 = 0;
      this.field3567 = 0;
      this.field3568 = 0;
      this.field3619 = 0;
      this.field3570 = 0;
      this.field3683 = 0;
      this.field3540 = 0;
      this.field3573 = false;
      this.field3574 = class82.field737;
      this.field3638 = 0;
      this.field3544 = 0;
      this.field3577 = 1;
      this.field3604 = false;
      this.field3579 = -1;
      this.field3626 = -1;
      this.field3578 = 0;
      this.field3623 = false;
      this.field3580 = 0;
      this.field3584 = 0;
      this.field3552 = 1;
      this.field3588 = -1;
      this.field3534 = 1;
      this.field3590 = -1;
      this.field3591 = -1;
      this.field3592 = -1;
      this.field3593 = 0;
      this.field3594 = 0;
      this.field3673 = 0;
      this.field3596 = 0;
      this.field3657 = 0;
      this.field3598 = 100;
      this.field3599 = 0;
      this.field3600 = 0;
      this.field3601 = false;
      this.field3602 = false;
      this.field3603 = 2;
      this.field3628 = -1;
      this.field3605 = "";
      this.field3655 = "";
      this.field3583 = 0;
      this.field3587 = 0;
      this.field3609 = 0;
      this.field3610 = false;
      this.field3541 = 0;
      this.field3641 = 0;
      this.field3617 = 0;
      this.field3618 = false;
      this.field3669 = "";
      this.field3625 = null;
      this.field3656 = 0;
      this.field3627 = 0;
      this.field3632 = false;
      this.field3633 = "";
      this.field3630 = false;
      this.field3665 = -1;
      this.field3550 = "";
      this.field3667 = "Ok";
      this.field3662 = -1;
      this.field3671 = 0;
      this.field3672 = 0;
      this.field3649 = 0;
      this.field3675 = false;
      this.field3676 = false;
      this.field3677 = -1;
      this.field3612 = 0;
      this.field3679 = 0;
      this.field3680 = 0;
      this.field3681 = -1;
      this.field3653 = -1;
      this.field3684 = false;
      this.field3685 = false;
      this.rl$$init();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(II)Llp;",
      garbageValue = "-1469800884"
   )
   public class26 method5885(int var1) {
      field3564 = false;
      if(var1 >= 0 && var1 < this.field3615.length) {
         int var2 = this.field3615[var1];
         if(var2 == -1) {
            return null;
         } else {
            class26 var3 = (class26)field3538.method2268((long)var2);
            if(var3 != null) {
               return var3;
            } else {
               var3 = class225.method4022(field3536, var2, 0, (byte)4);
               if(var3 != null) {
                  field3538.method2275(var3, (long)var2);
               } else {
                  field3564 = true;
               }

               return var3;
            }
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lgm;I)[I",
      garbageValue = "-1172910031"
   )
   int[] method5881(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      if(var2 == 0) {
         return null;
      } else {
         int[] var3 = new int[var2];

         for(int var4 = 0; var4 < var2; ++var4) {
            var3[var4] = var1.readInt();
         }

         return var3;
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(ZI)Llp;"
   )
   public class26 method5883(boolean var1, int var2) {
      if(this.getSpriteId() != -1) {
         SpritePixels var3 = (SpritePixels)client.widgetSpriteOverrides.get(Integer.valueOf(this.getId()));
         if(var3 != null) {
            return (class26)((RSSpritePixels)var3);
         }
      }

      return (class26)this.copy$getWidgetSprite(var1, var2);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Lgm;I)[Ljava/lang/Object;",
      garbageValue = "1758998692"
   )
   Object[] method5880(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      if(var2 == 0) {
         return null;
      } else {
         Object[] var3 = new Object[var2];

         for(int var4 = 0; var4 < var2; ++var4) {
            int var5 = var1.readUnsignedByte();
            if(var5 == 0) {
               var3[var4] = new Integer(var1.readInt());
            } else if(var5 == 1) {
               var3[var4] = var1.readString();
            }
         }

         this.field3630 = true;
         return var3;
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "-1733745784"
   )
   void method5893(Buffer var1) {
      var1.readUnsignedByte();
      this.field3543 = true;
      this.field3546 = var1.readUnsignedByte();
      this.field3548 = var1.readUnsignedShort();
      this.field3611 = var1.readShort();
      this.field3554 = var1.readShort();
      this.field3555 = var1.readUnsignedShort();
      if(this.field3546 == 9) {
         this.field3556 = var1.readShort();
      } else {
         this.field3556 = var1.readUnsignedShort();
      }

      this.field3551 = var1.method1906();
      this.field3678 = var1.method1906();
      this.field3571 = var1.method1906();
      this.field3545 = var1.method1906();
      this.field3563 = var1.readUnsignedShort();
      if(this.field3563 == 65535) {
         this.field3563 = -1;
      } else {
         this.field3563 += this.field3607 & -65536;
      }

      this.field3569 = var1.readUnsignedByte() == 1;
      this.onHiddenChanged(-1);
      if(this.field3546 == 0) {
         this.field3567 = var1.readUnsignedShort();
         this.field3568 = var1.readUnsignedShort();
         this.field3684 = var1.readUnsignedByte() == 1;
      }

      if(this.field3546 == 5) {
         this.field3579 = var1.readInt();
         this.field3578 = var1.readUnsignedShort();
         this.field3623 = var1.readUnsignedByte() == 1;
         this.field3638 = var1.readUnsignedByte();
         this.field3580 = var1.readUnsignedByte();
         this.field3584 = var1.readInt();
         this.field3585 = var1.readUnsignedByte() == 1;
         this.field3586 = var1.readUnsignedByte() == 1;
      }

      if(this.field3546 == 6) {
         this.field3552 = 1;
         this.field3588 = var1.readUnsignedShort();
         if(this.field3588 == 65535) {
            this.field3588 = -1;
         }

         this.field3593 = var1.readShort();
         this.field3594 = var1.readShort();
         this.field3673 = var1.readUnsignedShort();
         this.field3596 = var1.readUnsignedShort();
         this.field3657 = var1.readUnsignedShort();
         this.field3598 = var1.readUnsignedShort();
         this.field3591 = var1.readUnsignedShort();
         if(this.field3591 == 65535) {
            this.field3591 = -1;
         }

         this.field3601 = var1.readUnsignedByte() == 1;
         var1.readUnsignedShort();
         if(this.field3551 != 0) {
            this.field3599 = var1.readUnsignedShort();
         }

         if(this.field3678 != 0) {
            var1.readUnsignedShort();
         }
      }

      if(this.field3546 == 4) {
         this.field3628 = var1.readUnsignedShort();
         if(this.field3628 == 65535) {
            this.field3628 = -1;
         }

         this.field3605 = var1.readString();
         this.field3583 = var1.readUnsignedByte();
         this.field3587 = var1.readUnsignedByte();
         this.field3609 = var1.readUnsignedByte();
         this.field3610 = var1.readUnsignedByte() == 1;
         this.field3619 = var1.readInt();
      }

      if(this.field3546 == 3) {
         this.field3619 = var1.readInt();
         this.field3573 = var1.readUnsignedByte() == 1;
         this.field3638 = var1.readUnsignedByte();
      }

      if(this.field3546 == 9) {
         this.field3577 = var1.readUnsignedByte();
         this.field3619 = var1.readInt();
         this.field3604 = var1.readUnsignedByte() == 1;
      }

      this.field3617 = var1.method1909();
      this.field3669 = var1.readString();
      int var2 = var1.readUnsignedByte();
      if(var2 > 0) {
         this.field3616 = new String[var2];

         for(int var3 = 0; var3 < var2; ++var3) {
            this.field3616[var3] = var1.readString();
         }
      }

      this.field3656 = var1.readUnsignedByte();
      this.field3627 = var1.readUnsignedByte();
      this.field3632 = var1.readUnsignedByte() == 1;
      this.field3633 = var1.readString();
      this.field3562 = this.method5880(var1);
      this.field3636 = this.method5880(var1);
      this.field3634 = this.method5880(var1);
      this.field3642 = this.method5880(var1);
      this.field3666 = this.method5880(var1);
      this.field3643 = this.method5880(var1);
      this.field3645 = this.method5880(var1);
      this.field3647 = this.method5880(var1);
      this.field3670 = this.method5880(var1);
      this.field3650 = this.method5880(var1);
      this.field3608 = this.method5880(var1);
      this.field3629 = this.method5880(var1);
      this.field3654 = this.method5880(var1);
      this.field3542 = this.method5880(var1);
      this.field3635 = this.method5880(var1);
      this.field3639 = this.method5880(var1);
      this.field3640 = this.method5880(var1);
      this.field3651 = this.method5880(var1);
      this.field3644 = this.method5881(var1);
      this.field3646 = this.method5881(var1);
      this.field3624 = this.method5881(var1);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(ZI)Lht;",
      garbageValue = "1950329585"
   )
   public class123 method5887(boolean var1) {
      if(this.field3626 == -1) {
         var1 = false;
      }

      int var2 = var1?this.field3626:this.field3579;
      if(var2 == -1) {
         return null;
      } else {
         long var3 = ((long)this.field3584 << 40) + ((this.field3586?1L:0L) << 39) + (long)var2 + ((long)this.field3580 << 36) + ((this.field3585?1L:0L) << 38);
         class123 var5 = (class123)field3582.method2268(var3);
         if(var5 != null) {
            return var5;
         } else {
            class26 var6 = this.method5883(var1, 1854687350);
            if(var6 == null) {
               return null;
            } else {
               class26 var7 = var6.method368();
               int[] var8 = new int[var7.field201];
               int[] var9 = new int[var7.field201];

               for(int var10 = 0; var10 < var7.field201; ++var10) {
                  int var11 = 0;
                  int var12 = var7.field202;

                  int var13;
                  for(var13 = 0; var13 < var7.field202; ++var13) {
                     if(var7.field203[var13 + var10 * var7.field202] == 0) {
                        var11 = var13;
                        break;
                     }
                  }

                  for(var13 = var7.field202 - 1; var13 >= var11; --var13) {
                     if(var7.field203[var13 + var10 * var7.field202] == 0) {
                        var12 = var13 + 1;
                        break;
                     }
                  }

                  var8[var10] = var11;
                  var9[var10] = var12 - var11;
               }

               var5 = new class123(var7.field202, var7.field201, var9, var8, var2);
               field3582.method2275(var5, var3);
               return var5;
            }
         }
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "-2134900885"
   )
   void method5920(Buffer var1) {
      this.field3543 = false;
      this.field3546 = var1.readUnsignedByte();
      this.field3547 = var1.readUnsignedByte();
      this.field3548 = var1.readUnsignedShort();
      this.field3611 = var1.readShort();
      this.field3554 = var1.readShort();
      this.field3555 = var1.readUnsignedShort();
      this.field3556 = var1.readUnsignedShort();
      this.field3638 = var1.readUnsignedByte();
      this.field3563 = var1.readUnsignedShort();
      if(this.field3563 == 65535) {
         this.field3563 = -1;
      } else {
         this.field3563 += this.field3607 & -65536;
      }

      this.field3665 = var1.readUnsignedShort();
      if(this.field3665 == 65535) {
         this.field3665 = -1;
      }

      int var2 = var1.readUnsignedByte();
      int var3;
      if(var2 > 0) {
         this.field3663 = new int[var2];
         this.field3664 = new int[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            this.field3663[var3] = var1.readUnsignedByte();
            this.field3664[var3] = var1.readUnsignedShort();
         }
      }

      var3 = var1.readUnsignedByte();
      int var4;
      int var5;
      int var6;
      if(var3 > 0) {
         this.field3631 = new int[var3][];

         for(var4 = 0; var4 < var3; ++var4) {
            var5 = var1.readUnsignedShort();
            this.field3631[var4] = new int[var5];

            for(var6 = 0; var6 < var5; ++var6) {
               this.field3631[var4][var6] = var1.readUnsignedShort();
               if(this.field3631[var4][var6] == 65535) {
                  this.field3631[var4][var6] = -1;
               }
            }
         }
      }

      if(this.field3546 == 0) {
         this.field3568 = var1.readUnsignedShort();
         this.field3569 = var1.readUnsignedByte() == 1;
         this.onHiddenChanged(-1);
      }

      if(this.field3546 == 1) {
         var1.readUnsignedShort();
         var1.readUnsignedByte();
      }

      if(this.field3546 == 2) {
         this.field3668 = new int[this.field3555 * this.field3556];
         this.field3682 = new int[this.field3555 * this.field3556];
         var4 = var1.readUnsignedByte();
         if(var4 == 1) {
            this.field3617 |= 268435456;
         }

         var5 = var1.readUnsignedByte();
         if(var5 == 1) {
            this.field3617 |= 1073741824;
         }

         var6 = var1.readUnsignedByte();
         if(var6 == 1) {
            this.field3617 |= Integer.MIN_VALUE;
         }

         int var7 = var1.readUnsignedByte();
         if(var7 == 1) {
            this.field3617 |= 536870912;
         }

         this.field3541 = var1.readUnsignedByte();
         this.field3641 = var1.readUnsignedByte();
         this.field3613 = new int[20];
         this.field3614 = new int[20];
         this.field3615 = new int[20];

         int var8;
         for(var8 = 0; var8 < 20; ++var8) {
            int var9 = var1.readUnsignedByte();
            if(var9 == 1) {
               this.field3613[var8] = var1.readShort();
               this.field3614[var8] = var1.readShort();
               this.field3615[var8] = var1.readInt();
            } else {
               this.field3615[var8] = -1;
            }
         }

         this.field3553 = new String[5];

         for(var8 = 0; var8 < 5; ++var8) {
            String var11 = var1.readString();
            if(var11.length() > 0) {
               this.field3553[var8] = var11;
               this.field3617 |= 1 << var8 + 23;
            }
         }
      }

      if(this.field3546 == 3) {
         this.field3573 = var1.readUnsignedByte() == 1;
      }

      if(this.field3546 == 4 || this.field3546 == 1) {
         this.field3587 = var1.readUnsignedByte();
         this.field3609 = var1.readUnsignedByte();
         this.field3583 = var1.readUnsignedByte();
         this.field3628 = var1.readUnsignedShort();
         if(this.field3628 == 65535) {
            this.field3628 = -1;
         }

         this.field3610 = var1.readUnsignedByte() == 1;
      }

      if(this.field3546 == 4) {
         this.field3605 = var1.readString();
         this.field3655 = var1.readString();
      }

      if(this.field3546 == 1 || this.field3546 == 3 || this.field3546 == 4) {
         this.field3619 = var1.readInt();
      }

      if(this.field3546 == 3 || this.field3546 == 4) {
         this.field3570 = var1.readInt();
         this.field3683 = var1.readInt();
         this.field3540 = var1.readInt();
      }

      if(this.field3546 == 5) {
         this.field3579 = var1.readInt();
         this.field3626 = var1.readInt();
      }

      if(this.field3546 == 6) {
         this.field3552 = 1;
         this.field3588 = var1.readUnsignedShort();
         if(this.field3588 == 65535) {
            this.field3588 = -1;
         }

         this.field3534 = 1;
         this.field3590 = var1.readUnsignedShort();
         if(this.field3590 == 65535) {
            this.field3590 = -1;
         }

         this.field3591 = var1.readUnsignedShort();
         if(this.field3591 == 65535) {
            this.field3591 = -1;
         }

         this.field3592 = var1.readUnsignedShort();
         if(this.field3592 == 65535) {
            this.field3592 = -1;
         }

         this.field3598 = var1.readUnsignedShort();
         this.field3673 = var1.readUnsignedShort();
         this.field3596 = var1.readUnsignedShort();
      }

      if(this.field3546 == 7) {
         this.field3668 = new int[this.field3555 * this.field3556];
         this.field3682 = new int[this.field3555 * this.field3556];
         this.field3587 = var1.readUnsignedByte();
         this.field3628 = var1.readUnsignedShort();
         if(this.field3628 == 65535) {
            this.field3628 = -1;
         }

         this.field3610 = var1.readUnsignedByte() == 1;
         this.field3619 = var1.readInt();
         this.field3541 = var1.readShort();
         this.field3641 = var1.readShort();
         var4 = var1.readUnsignedByte();
         if(var4 == 1) {
            this.field3617 |= 1073741824;
         }

         this.field3553 = new String[5];

         for(var5 = 0; var5 < 5; ++var5) {
            String var10 = var1.readString();
            if(var10.length() > 0) {
               this.field3553[var5] = var10;
               this.field3617 |= 1 << var5 + 23;
            }
         }
      }

      if(this.field3546 == 8) {
         this.field3605 = var1.readString();
      }

      if(this.field3547 == 2 || this.field3546 == 2) {
         this.field3633 = var1.readString();
         this.field3550 = var1.readString();
         var4 = var1.readUnsignedShort() & 63;
         this.field3617 |= var4 << 11;
      }

      if(this.field3547 == 1 || this.field3547 == 4 || this.field3547 == 5 || this.field3547 == 6) {
         this.field3667 = var1.readString();
         if(this.field3667.length() == 0) {
            if(this.field3547 == 1) {
               this.field3667 = "Ok";
            }

            if(this.field3547 == 4) {
               this.field3667 = "Select";
            }

            if(this.field3547 == 5) {
               this.field3667 = "Select";
            }

            if(this.field3547 == 6) {
               this.field3667 = "Continue";
            }
         }
      }

      if(this.field3547 == 1 || this.field3547 == 4 || this.field3547 == 5) {
         this.field3617 |= 4194304;
      }

      if(this.field3547 == 6) {
         this.field3617 |= 1;
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)Lkn;",
      garbageValue = "1380272555"
   )
   public class277 method5884() {
      field3564 = false;
      if(this.field3628 == -1) {
         return null;
      } else {
         class277 var1 = (class277)field3581.method2268((long)this.field3628);
         if(var1 != null) {
            return var1;
         } else {
            var1 = class7.method92(field3536, field3537, this.field3628, 0);
            if(var1 != null) {
               field3581.method2275(var1, (long)this.field3628);
            } else {
               field3564 = true;
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Ljw;IZLho;I)Lds;",
      garbageValue = "-2127551871"
   )
   public class200 method5886(class321 var1, int var2, boolean var3, class44 var4) {
      field3564 = false;
      int var5;
      int var6;
      if(var3) {
         var5 = this.field3534;
         var6 = this.field3590;
      } else {
         var5 = this.field3552;
         var6 = this.field3588;
      }

      if(var5 == 0) {
         return null;
      } else if(var5 == 1 && var6 == -1) {
         return null;
      } else {
         class200 var7 = (class200)field3539.method2268((long)(var6 + (var5 << 16)));
         if(var7 == null) {
            class218 var8;
            if(var5 == 1) {
               var8 = class218.method3830(field3535, var6, 0);
               if(var8 == null) {
                  field3564 = true;
                  return null;
               }

               var7 = var8.method3863(64, 768, -50, -10, -50);
            }

            if(var5 == 2) {
               var8 = class25.method361(var6).method3980();
               if(var8 == null) {
                  field3564 = true;
                  return null;
               }

               var7 = var8.method3863(64, 768, -50, -10, -50);
            }

            if(var5 == 3) {
               if(var4 == null) {
                  return null;
               }

               var8 = var4.method762();
               if(var8 == null) {
                  field3564 = true;
                  return null;
               }

               var7 = var8.method3863(64, 768, -50, -10, -50);
            }

            if(var5 == 4) {
               class120 var9 = class67.method1152(var6);
               var8 = var9.method2224(10);
               if(var8 == null) {
                  field3564 = true;
                  return null;
               }

               var7 = var8.method3863(var9.field1140 + 64, var9.field1103 + 768, -50, -10, -50);
            }

            field3539.method2275(var7, (long)(var6 + (var5 << 16)));
         }

         if(var1 != null) {
            var7 = var1.method5635(var7, var2);
         }

         return var7;
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)V",
      garbageValue = "1365269897"
   )
   public void method5888(int var1, String var2) {
      if(this.field3616 == null || this.field3616.length <= var1) {
         String[] var3 = new String[var1 + 1];
         if(this.field3616 != null) {
            for(int var4 = 0; var4 < this.field3616.length; ++var4) {
               var3[var4] = this.field3616[var4];
            }
         }

         this.field3616 = var3;
      }

      this.field3616[var1] = var2;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "2094258914"
   )
   public void method5882(int var1, int var2) {
      int var3 = this.field3668[var2];
      this.field3668[var2] = this.field3668[var1];
      this.field3668[var1] = var3;
      var3 = this.field3682[var2];
      this.field3682[var2] = this.field3682[var1];
      this.field3682[var1] = var3;
   }

   public Rectangle getBounds() {
      Point var1 = this.getCanvasLocation();
      return new Rectangle(var1.getX(), var1.getY(), this.getWidth(), this.getHeight());
   }

   public String getRSText() {
      return this.field3605;
   }

   public String getRSName() {
      return this.field3669;
   }

   public int getParentId() {
      if(!$assertionsDisabled && !class113.field1064.isClientThread()) {
         throw new AssertionError();
      } else {
         int var1 = this.getRSParentId();
         if(var1 != -1) {
            return var1;
         } else {
            int var2 = this.getId();
            if(WidgetInfo.TO_GROUP(var2) == class113.field1064.getWidgetRoot()) {
               return -1;
            } else {
               int var3 = this.rl$parentId;
               if(var3 != -1) {
                  RSHashTable var4 = class113.field1064.getComponentTable();
                  WidgetNode var5 = (WidgetNode)var4.get((long)var3);
                  if(var5 != null && var5.getId() == WidgetInfo.TO_GROUP(var2)) {
                     return var3;
                  }

                  this.rl$parentId = -1;
               }

               int var13 = WidgetInfo.TO_GROUP(this.getId());
               RSHashTable var14 = class113.field1064.getComponentTable();
               RSNode[] var6 = var14.getBuckets();
               RSNode[] var7 = var6;
               int var8 = var6.length;

               for(int var9 = 0; var9 < var8; ++var9) {
                  RSNode var10 = var7[var9];

                  for(Object var11 = var10.getNext(); var11 != var10; var11 = ((Node)var11).getNext()) {
                     WidgetNode var12 = (WidgetNode)var11;
                     if(var13 == var12.getId()) {
                        return (int)var12.getHash();
                     }
                  }
               }

               return -1;
            }
         }
      }
   }

   public int[] getItemIds() {
      return this.field3668;
   }

   public Point getCanvasLocation() {
      return new Point(this.rl$x, this.rl$y);
   }

   public int getSpriteId() {
      return this.field3579;
   }

   public RSWidget[] getChildren() {
      return this.field3674;
   }

   public int getRSParentId() {
      return this.field3563;
   }

   public int getId() {
      return this.field3607;
   }

   public void setRSName(String var1) {
      this.field3669 = var1;
   }

   public int[] getItemQuantities() {
      return this.field3682;
   }

   public boolean isSelfHidden() {
      return this.field3569;
   }

   public Widget getParent() {
      int var1 = this.getParentId();
      return var1 == -1?null:class113.field1064.getWidget(WidgetInfo.TO_GROUP(var1), WidgetInfo.TO_CHILD(var1));
   }

   @ObfuscatedSignature(
      signature = "(ZI)Llp;"
   )
   public class26 copy$getWidgetSprite(boolean var1, int var2) {
      field3564 = false;
      int var3;
      if(var1) {
         var3 = this.field3626;
      } else {
         var3 = this.field3579;
      }

      if(var3 == -1) {
         return null;
      } else {
         long var4 = ((this.field3585?1L:0L) << 38) + ((long)this.field3580 << 36) + (long)var3 + ((this.field3586?1L:0L) << 39) + ((long)this.field3584 << 40);
         class26 var6 = (class26)field3538.method2268(var4);
         if(var6 != null) {
            return var6;
         } else {
            var6 = class225.method4022(field3536, var3, 0, (byte)-82);
            if(var6 == null) {
               field3564 = true;
               return null;
            } else {
               if(this.field3585) {
                  var6.method373();
               }

               if(this.field3586) {
                  var6.method372();
               }

               if(this.field3580 > 0) {
                  var6.method371(this.field3580);
               }

               if(this.field3580 >= 1) {
                  var6.method374(1);
               }

               if(this.field3580 >= 2) {
                  var6.method374(16777215);
               }

               if(this.field3584 != 0) {
                  var6.method447(this.field3584);
               }

               field3538.method2275(var6, var4);
               return var6;
            }
         }
      }
   }

   public int getWidth() {
      return this.field3559;
   }

   public WidgetItem getWidgetItem(int var1) {
      int[] var2 = this.getItemIds();
      int[] var3 = this.getItemQuantities();
      if(var2 != null && var3 != null) {
         int var4 = this.getWidth();
         int var5 = this.getXPitch();
         int var6 = this.getYPitch();
         int var7 = var2[var1];
         int var8 = var3[var1];
         Point var9 = this.getCanvasLocation();
         if(var7 > 0 && var8 > 0 && var4 > 0) {
            int var10 = var1 / var4;
            int var11 = var1 % var4;
            int var12 = var9.getX() + (32 + var5) * var11;
            int var13 = var9.getY() + (32 + var6) * var10;
            Rectangle var14 = new Rectangle(var12 - 1, var13 - 1, 32, 32);
            return new WidgetItem(var7 - 1, var8, var1, var14);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public int getHeight() {
      return this.field3560;
   }

   public int getXPitch() {
      return this.field3541;
   }

   public Widget[] getNestedChildren() {
      if(!$assertionsDisabled && !class113.field1064.isClientThread()) {
         throw new AssertionError();
      } else if(this.getRSParentId() == this.getId()) {
         return new Widget[0];
      } else {
         RSHashTable var1 = class113.field1064.getComponentTable();
         WidgetNode var2 = (WidgetNode)var1.get((long)this.getId());
         if(var2 == null) {
            return new class329[0];
         } else {
            int var3 = var2.getId();
            ArrayList var4 = new ArrayList();
            RSWidget[] var5 = class113.field1064.getGroup(var3);
            int var6 = var5.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               RSWidget var8 = var5[var7];
               if(var8 != null && var8.getRSParentId() == -1) {
                  var4.add(var8);
               }
            }

            return (Widget[])var4.toArray(new class329[var4.size()]);
         }
      }
   }

   public int getYPitch() {
      return this.field3641;
   }

   public void broadcastHidden(boolean var1) {
      WidgetHiddenChanged var2 = new WidgetHiddenChanged();
      var2.setWidget(this);
      var2.setHidden(var1);
      class113.field1064.getCallbacks().post(var2);
      RSWidget[] var3 = this.getChildren();
      int var6;
      if(var3 != null) {
         RSWidget[] var4 = var3;
         int var5 = var3.length;

         for(var6 = 0; var6 < var5; ++var6) {
            RSWidget var7 = var4[var6];
            if(var7 != null && !var7.isSelfHidden()) {
               var7.broadcastHidden(var1);
            }
         }
      }

      Widget[] var11 = this.getNestedChildren();
      Widget[] var9 = var11;
      var6 = var11.length;

      for(int var10 = 0; var10 < var6; ++var10) {
         Widget var8 = var9[var10];
         if(var8 != null && !var8.isSelfHidden()) {
            ((RSWidget)var8).broadcastHidden(var1);
         }
      }

   }

   public void setChildren(Widget[] var1) {
      this.field3674 = (class329[])var1;
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void onPositionChanged(int var1) {
      int var2 = this.getId();
      if(var2 != -1) {
         int var3 = class113.field1064.getGameCycle();
         if(var3 != rl$widgetLastPosChanged) {
            rl$widgetLastPosChanged = var3;
            class113.field1064.getLogger().trace("Posting widget position changed");
            WidgetPositioned var4 = new WidgetPositioned();
            class113.field1064.getCallbacks().postDeferred(var4);
         }
      }
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void onHiddenChanged(int var1) {
      int var2 = this.getId();
      if(var2 != -1) {
         Widget var3 = this.getParent();
         if(var3 != null) {
            if(var3.isHidden()) {
               return;
            }
         } else if(WidgetInfo.TO_GROUP(var2) != class113.field1064.getWidgetRoot()) {
            return;
         }

         this.broadcastHidden(this.isSelfHidden());
      }
   }

   private void rl$$init() {
      this.rl$parentId = -1;
      this.rl$x = -1;
      this.rl$y = -1;
   }

   public void setRenderParentId(int var1) {
      this.rl$parentId = var1;
   }

   public void setRenderX(int var1) {
      this.rl$x = var1;
   }

   public void setRenderY(int var1) {
      this.rl$y = var1;
   }

   public String getText() {
      return this.getRSText().replace(' ', ' ');
   }

   public String getName() {
      return this.getRSName().replace(' ', ' ');
   }

   public void setName(String var1) {
      this.setRSName(var1.replace(' ', ' '));
   }

   public boolean isHidden() {
      if(!$assertionsDisabled && !class113.field1064.isClientThread()) {
         throw new AssertionError();
      } else if(this.isSelfHidden()) {
         return true;
      } else {
         Widget var1 = this.getParent();
         if(var1 == null) {
            if(WidgetInfo.TO_GROUP(this.getId()) != class113.field1064.getWidgetRoot()) {
               return true;
            }
         } else if(var1.isHidden()) {
            return true;
         }

         return false;
      }
   }

   public Collection getWidgetItems() {
      int[] var1 = this.getItemIds();
      if(var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList(var1.length);

         for(int var3 = 0; var3 < var1.length; ++var3) {
            WidgetItem var4 = this.getWidgetItem(var3);
            if(var4 != null) {
               var2.add(var4);
            }
         }

         return var2;
      }
   }

   public Widget getChild(int var1) {
      RSWidget[] var2 = this.getChildren();
      return var2 != null && var2[var1] != null?var2[var1]:null;
   }

   public Widget[] getDynamicChildren() {
      RSWidget[] var1 = this.getChildren();
      if(var1 == null) {
         return new Widget[0];
      } else {
         ArrayList var2 = new ArrayList();
         RSWidget[] var3 = var1;
         int var4 = var1.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            RSWidget var6 = var3[var5];
            if(var6 != null && var6.getRSParentId() == this.getId()) {
               var2.add(var6);
            }
         }

         return (Widget[])var2.toArray(new Widget[var2.size()]);
      }
   }

   public Widget[] getStaticChildren() {
      if(this.getRSParentId() == this.getId()) {
         return new Widget[0];
      } else {
         ArrayList var1 = new ArrayList();
         RSWidget[] var2 = class113.field1064.getGroup(WidgetInfo.TO_GROUP(this.getId()));
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            RSWidget var5 = var2[var4];
            if(var5 != null && var5.getRSParentId() == this.getId()) {
               var1.add(var5);
            }
         }

         return (Widget[])var1.toArray(new class329[var1.size()]);
      }
   }

   public boolean contains(Point var1) {
      Rectangle var2 = this.getBounds();
      return var2 != null && var2.contains(new java.awt.Point(var1.getX(), var1.getY()));
   }

   public Widget createChild(int var1, int var2) {
      if(!$assertionsDisabled && !class113.field1064.isClientThread()) {
         throw new AssertionError();
      } else {
         RSWidget var3 = class113.field1064.createWidget();
         var3.setType(var2);
         var3.setParentId(this.getId());
         var3.setId(this.getId());
         var3.setIsIf3(true);
         Object var4 = this.getChildren();
         if(var1 < 0) {
            if(var4 == null) {
               var1 = 0;
            } else {
               var1 = ((Object[])var4).length;
            }
         }

         if(var4 == null) {
            var4 = new class329[var1 + 1];
            this.setChildren((Widget[])var4);
         } else if(((Object[])var4).length <= var1) {
            class329[] var5 = new class329[var1 + 1];
            System.arraycopy(var4, 0, var5, 0, ((Object[])var4).length);
            var4 = var5;
            this.setChildren(var5);
         }

         ((Object[])var4)[var1] = var3;
         var3.setIndex(var1);
         return var3;
      }
   }

   public void revalidate() {
      if(!$assertionsDisabled && !class113.field1064.isClientThread()) {
         throw new AssertionError();
      } else {
         class113.field1064.revalidateWidget(this);
      }
   }

   public void revalidateScroll() {
      if(!$assertionsDisabled && !class113.field1064.isClientThread()) {
         throw new AssertionError();
      } else {
         class113.field1064.revalidateWidget(this);
         class113.field1064.revalidateWidgetScroll(class113.field1064.getWidgets()[WidgetInfo.TO_GROUP(this.getId())], this, false);
      }
   }

   public void setIsIf3(boolean var1) {
      this.field3543 = var1;
   }

   public boolean isIf3() {
      return this.field3543;
   }

   public void setId(int var1) {
      this.field3607 = var1;
   }

   public void setIndex(int var1) {
      this.field3606 = var1;
   }

   public int getIndex() {
      return this.field3606;
   }

   public void setType(int var1) {
      this.field3546 = var1;
   }

   public int getType() {
      return this.field3546;
   }

   public void setContentType(int var1) {
      this.field3548 = var1;
   }

   public int getContentType() {
      return this.field3548;
   }

   public void setOriginalX(int var1) {
      this.field3611 = var1;
   }

   public int getOriginalX() {
      return this.field3611;
   }

   public void setOriginalY(int var1) {
      this.field3554 = var1;
   }

   public int getOriginalY() {
      return this.field3554;
   }

   public void setOriginalWidth(int var1) {
      this.field3555 = var1;
   }

   public int getOriginalWidth() {
      return this.field3555;
   }

   public void setOriginalHeight(int var1) {
      this.field3556 = var1;
   }

   public int getOriginalHeight() {
      return this.field3556;
   }

   public void setRelativeX(int var1) {
      this.field3620 = var1;
   }

   public int getRelativeX() {
      return this.field3620;
   }

   public void setRelativeY(int var1) {
      this.field3558 = var1;
   }

   public int getRelativeY() {
      return this.field3558;
   }

   public void setWidth(int var1) {
      this.field3559 = var1;
   }

   public void setHeight(int var1) {
      this.field3560 = var1;
   }

   public void setParentId(int var1) {
      this.field3563 = var1;
   }

   public void setHidden(boolean var1) {
      this.field3569 = var1;
   }

   public void setScrollX(int var1) {
      this.field3565 = var1;
   }

   public int getScrollX() {
      return this.field3565;
   }

   public void setScrollY(int var1) {
      this.field3566 = var1;
   }

   public int getScrollY() {
      return this.field3566;
   }

   public void setScrollWidth(int var1) {
      this.field3567 = var1;
   }

   public int getScrollWidth() {
      return this.field3567;
   }

   public void setScrollHeight(int var1) {
      this.field3568 = var1;
   }

   public int getScrollHeight() {
      return this.field3568;
   }

   public void setTextColor(int var1) {
      this.field3619 = var1;
   }

   public int getTextColor() {
      return this.field3619;
   }

   public int getOpacity() {
      return this.field3638;
   }

   public void setSpriteId(int var1) {
      this.field3579 = var1;
   }

   public void setBorderType(int var1) {
      this.field3580 = var1;
   }

   public int getBorderType() {
      return this.field3580;
   }

   public int getModelType() {
      return this.field3552;
   }

   public int getModelId() {
      return this.field3588;
   }

   public int getRotationX() {
      return this.field3673;
   }

   public int getRotationZ() {
      return this.field3596;
   }

   public int getRotationY() {
      return this.field3657;
   }

   public void setFontId(int var1) {
      this.field3628 = var1;
   }

   public int getFontId() {
      return this.field3628;
   }

   public void setText(String var1) {
      this.field3605 = var1;
   }

   public void setTextShadowed(boolean var1) {
      this.field3610 = var1;
   }

   public boolean getTextShadowed() {
      return this.field3610;
   }

   public void setClickMask(int var1) {
      this.field3617 = var1;
   }

   public int getClickMask() {
      return this.field3617;
   }

   public String[] getActions() {
      return this.field3616;
   }

   public void setDragDeadZone(int var1) {
      this.field3656 = var1;
   }

   public int getDragDeadZone() {
      return this.field3656;
   }

   public void setDragDeadTime(int var1) {
      this.field3627 = var1;
   }

   public int getDragDeadTime() {
      return this.field3627;
   }

   public void setHasListener(boolean var1) {
      this.field3630 = var1;
   }

   public boolean hasListener() {
      return this.field3630;
   }

   public Object[] getOnLoadListener() {
      return this.field3562;
   }

   public void setOnOpListener(Object[] var1) {
      this.field3650 = var1;
   }

   public Object[] getOnKeyListener() {
      return this.field3575;
   }

   public void setItemId(int var1) {
      this.field3662 = var1;
   }

   public int getItemId() {
      return this.field3662;
   }

   public void setItemQuantity(int var1) {
      this.field3671 = var1;
   }

   public int getItemQuantity() {
      return this.field3671;
   }

   public int getBoundsIndex() {
      return this.field3681;
   }

   public void setAction(int var1, String var2) {
      this.method5888(var1, var2);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIIZIZI)V",
      garbageValue = "-1142805753"
   )
   static void method5927(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if(var0 < var1) {
         int var6 = (var0 + var1) / 2;
         int var7 = var0;
         class126 var8 = class126.field1187[var6];
         class126.field1187[var6] = class126.field1187[var1];
         class126.field1187[var1] = var8;

         for(int var9 = var0; var9 < var1; ++var9) {
            class126 var11 = class126.field1187[var9];
            int var12 = class315.method5550(var11, var8, var2, var3);
            int var10;
            if(var12 != 0) {
               if(var3) {
                  var10 = -var12;
               } else {
                  var10 = var12;
               }
            } else if(var4 == -1) {
               var10 = 0;
            } else {
               int var13 = class315.method5550(var11, var8, var4, var5);
               if(var5) {
                  var10 = -var13;
               } else {
                  var10 = var13;
               }
            }

            if(var10 <= 0) {
               class126 var14 = class126.field1187[var9];
               class126.field1187[var9] = class126.field1187[var7];
               class126.field1187[var7++] = var14;
            }
         }

         class126.field1187[var1] = class126.field1187[var7];
         class126.field1187[var7] = var8;
         method5927(var0, var7 - 1, var2, var3, var4, var5);
         method5927(var7 + 1, var1, var2, var3, var4, var5);
      }

   }

   private static void rl$$clinit() {
      $assertionsDisabled = !class329.class.desiredAssertionStatus();
   }
}
