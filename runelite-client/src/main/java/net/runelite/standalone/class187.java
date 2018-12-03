package net.runelite.standalone;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import net.runelite.api.Node;
import net.runelite.api.Point;
import net.runelite.api.WidgetNode;
import net.runelite.api.events.WidgetHiddenChanged;
import net.runelite.api.events.WidgetPositioned;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFontTypeFace;
import net.runelite.rs.api.RSHashTable;
import net.runelite.rs.api.RSNode;
import net.runelite.rs.api.RSSpritePixels;
import net.runelite.rs.api.RSWidget;

@ObfuscatedName("hw")
public class class187 extends class197 implements RSWidget {
   @ObfuscatedName("j")
   public static boolean field2578;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class100 field2552;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   static class217 field2586;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   static class217 field2549;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   static class217 field2550;
   // $FF: synthetic field
   public static boolean $assertionsDisabled;
   public static int rl$widgetLastPosChanged;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class100 field2553;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class100 field2595;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   static class217 field2551;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "[[Lhw;"
   )
   public static class187[][] field2547;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class100 field2596;
   @ObfuscatedName("dg")
   public Object[] field2653;
   @ObfuscatedName("ew")
   public int[] field2682;
   @ObfuscatedName("ej")
   public Object[] field2589;
   @ObfuscatedName("dv")
   public String field2647;
   @ObfuscatedName("dy")
   public boolean field2646;
   @ObfuscatedName("bc")
   public boolean field2615;
   @ObfuscatedName("do")
   public Object[] field2576;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1965769659
   )
   public int field2569;
   @ObfuscatedName("ec")
   public Object[] field2673;
   @ObfuscatedName("dd")
   @ObfuscatedGetter(
      intValue = -1489793593
   )
   public int field2670;
   @ObfuscatedName("cr")
   public byte[][] field2543;
   @ObfuscatedName("db")
   public Object[] field2649;
   @ObfuscatedName("fo")
   @ObfuscatedGetter(
      intValue = 68602407
   )
   public int field2693;
   @ObfuscatedName("cv")
   @ObfuscatedGetter(
      intValue = 2031775649
   )
   public int field2655;
   @ObfuscatedName("ci")
   public String field2669;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1250992329
   )
   public int field2633;
   @ObfuscatedName("cl")
   public int[] field2636;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1506445757
   )
   public int field2559;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = -1095395367
   )
   public int field2613;
   @ObfuscatedName("ds")
   public Object[] field2680;
   @ObfuscatedName("co")
   public int[] field2629;
   @ObfuscatedName("ep")
   @ObfuscatedSignature(
      signature = "[Lhw;"
   )
   public class187[] field2688;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -1266861631
   )
   public int field2568;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -545180251
   )
   public int field2697;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -552261697
   )
   public int field2572;
   @ObfuscatedName("ey")
   public Object[] field2665;
   @ObfuscatedName("du")
   public Object[] field2648;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -451868253
   )
   public int field2579;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -578324031
   )
   public int field2608;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = 78569745
   )
   public int field2612;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = 1722269255
   )
   public int field2606;
   @ObfuscatedName("eu")
   public Object[] field2675;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = 731777287
   )
   int field2604;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = 2013632121
   )
   public int field2607;
   @ObfuscatedName("dc")
   public Object[] field2556;
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = -1504934257
   )
   public int field2555;
   @ObfuscatedName("eo")
   public Object[] field2590;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 2131081465
   )
   public int field2580;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = -978776883
   )
   public int field2605;
   @ObfuscatedName("dj")
   public Object[] field2684;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 939634915
   )
   public int field2558;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1396071577
   )
   public int field2585;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1902419107
   )
   public int field2575;
   @ObfuscatedName("bf")
   public boolean field2637;
   @ObfuscatedName("dx")
   public Object[] field2654;
   @ObfuscatedName("dh")
   public Object[] field2661;
   @ObfuscatedName("ev")
   public String field2564;
   @ObfuscatedName("dp")
   public Object[] field2650;
   @ObfuscatedName("ez")
   @ObfuscatedGetter(
      intValue = -1956313403
   )
   public int field2685;
   @ObfuscatedName("fd")
   public boolean field2690;
   @ObfuscatedName("dt")
   public String[] field2630;
   @ObfuscatedName("es")
   public Object[] field2609;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -202286445
   )
   public int field2560;
   @ObfuscatedName("ed")
   public boolean field2689;
   @ObfuscatedName("cj")
   @ObfuscatedGetter(
      intValue = 1210342177
   )
   public int field2623;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1836529789
   )
   public int field2574;
   @ObfuscatedName("fj")
   @ObfuscatedGetter(
      intValue = -265825069
   )
   public int field2695;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = 1409600695
   )
   public int field2640;
   @ObfuscatedName("cq")
   public String[] field2567;
   @ObfuscatedName("dq")
   public int[] field2660;
   @ObfuscatedName("cd")
   public byte[][] field2662;
   @ObfuscatedName("fb")
   @ObfuscatedGetter(
      intValue = 1740953889
   )
   public int field2667;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1629249107
   )
   public int field2561;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -142812563
   )
   public int field2621;
   @ObfuscatedName("cy")
   public boolean field2624;
   @ObfuscatedName("fy")
   public int[] field2571;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = 1657830653
   )
   public int field2687;
   @ObfuscatedName("eg")
   public Object[] field2664;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -746653365
   )
   public int field2652;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1893196075
   )
   public int field2692;
   @ObfuscatedName("b")
   public boolean field2557;
   public int rl$x;
   public int rl$y;
   public int rl$parentId;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = 346597581
   )
   public int field2614;
   @ObfuscatedName("ak")
   public boolean field2618;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = -1337341139
   )
   public int field2642;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = 1229180585
   )
   public int field2593;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -1596126381
   )
   public int field2591;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = -284536533
   )
   public int field2610;
   @ObfuscatedName("dk")
   public Object[] field2659;
   @ObfuscatedName("cm")
   @ObfuscatedGetter(
      intValue = -1065924947
   )
   public int field2601;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1547931167
   )
   public int field2625;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = -148663123
   )
   public int field2598;
   @ObfuscatedName("ef")
   public Object[] field2651;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = 2102078723
   )
   public int field2602;
   @ObfuscatedName("et")
   public Object[] field2666;
   @ObfuscatedName("ee")
   public int[] field2677;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -238362499
   )
   public int field2634;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -749404937
   )
   public int field2563;
   @ObfuscatedName("dz")
   public int[] field2658;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1053259381
   )
   public int field2581;
   @ObfuscatedName("dw")
   public Object[] field2622;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -2110036369
   )
   public int field2584;
   @ObfuscatedName("br")
   public boolean field2616;
   @ObfuscatedName("df")
   public int[] field2638;
   @ObfuscatedName("bm")
   public boolean field2600;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -72207201
   )
   public int field2573;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 1127096019
   )
   public int field2562;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = 583148705
   )
   public int field2592;
   @ObfuscatedName("ck")
   public boolean field2632;
   @ObfuscatedName("fm")
   @ObfuscatedGetter(
      intValue = -374739463
   )
   public int field2626;
   @ObfuscatedName("ad")
   public boolean field2583;
   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   public class187 field2639;
   @ObfuscatedName("ca")
   public String field2683;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1278786479
   )
   public int field2582;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = -97024043
   )
   public int field2671;
   @ObfuscatedName("ex")
   public Object[] field2674;
   @ObfuscatedName("eh")
   @ObfuscatedGetter(
      intValue = 1116896155
   )
   public int field2686;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = 20478079
   )
   public int field2631;
   @ObfuscatedName("fi")
   public boolean field2698;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 911400937
   )
   public int field2620;
   @ObfuscatedName("dr")
   public Object[] field2668;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = -493965817
   )
   public int field2566;
   @ObfuscatedName("eb")
   public int[][] field2645;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = -1101283989
   )
   int field2548;
   @ObfuscatedName("ba")
   public boolean field2599;
   @ObfuscatedName("cu")
   @ObfuscatedGetter(
      intValue = 1024364003
   )
   public int field2597;
   @ObfuscatedName("dn")
   public boolean field2644;
   @ObfuscatedName("en")
   @ObfuscatedGetter(
      intValue = 1463933173
   )
   public int field2663;
   @ObfuscatedName("da")
   public Object[] field2643;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = 2109467015
   )
   public int field2617;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -795531255
   )
   public int field2565;
   @ObfuscatedName("ek")
   public int[] field2696;
   @ObfuscatedName("eq")
   @ObfuscatedGetter(
      intValue = 911021259
   )
   public int field2679;
   @ObfuscatedName("ch")
   public int[] field2635;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1096444687
   )
   public int field2577;
   @ObfuscatedName("ei")
   @ObfuscatedGetter(
      intValue = -1794469075
   )
   public int field2676;
   @ObfuscatedName("cz")
   public int[] field2627;
   @ObfuscatedName("de")
   public Object[] field2656;
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "Lln;"
   )
   public class136 field2588;
   @ObfuscatedName("cf")
   public String field2619;
   @ObfuscatedName("di")
   public Object[] field2657;
   @ObfuscatedName("fk")
   @ObfuscatedGetter(
      intValue = -1011916107
   )
   public int field2691;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 1127952993
   )
   public int field2570;
   @ObfuscatedName("dm")
   @ObfuscatedGetter(
      intValue = 1849058365
   )
   public int field2641;
   @ObfuscatedName("er")
   public int[] field2678;
   @ObfuscatedName("em")
   public String field2681;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 196926435
   )
   public int field2554;
   @ObfuscatedName("ea")
   public Object[] field2672;
   @ObfuscatedName("fe")
   public boolean field2699;
   @ObfuscatedName("cc")
   public int[] field2628;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = -958018481
   )
   public int field2594;
   @ObfuscatedName("fz")
   @ObfuscatedGetter(
      intValue = -894113755
   )
   public int field2694;
   @ObfuscatedName("aj")
   public boolean field2587;
   @ObfuscatedName("el")
   public Object[] field2603;

   static {
      field2552 = new class100(200);
      field2553 = new class100(50);
      field2595 = new class100(20);
      field2596 = new class100(8);
      field2578 = false;
      rl$$clinit();
   }

   public class187() {
      this.field2557 = false;
      this.field2621 = -1;
      this.field2620 = -1;
      this.field2561 = 0;
      this.field2562 = 0;
      this.field2585 = 0;
      this.field2559 = 0;
      this.field2565 = 0;
      this.field2692 = 0;
      this.field2625 = 0;
      this.field2568 = 0;
      this.field2569 = 0;
      this.field2570 = 0;
      this.field2634 = 0;
      this.field2572 = 0;
      this.onPositionChanged(-1);
      this.field2573 = 0;
      this.field2574 = 0;
      this.field2575 = 1;
      this.field2563 = 1;
      this.field2577 = -1;
      this.field2583 = false;
      this.onHiddenChanged(-1);
      this.field2579 = 0;
      this.field2580 = 0;
      this.field2581 = 0;
      this.field2582 = 0;
      this.field2633 = 0;
      this.field2584 = 0;
      this.field2697 = 0;
      this.field2554 = 0;
      this.field2587 = false;
      this.field2588 = class136.field1757;
      this.field2652 = 0;
      this.field2558 = 0;
      this.field2591 = 1;
      this.field2618 = false;
      this.field2593 = -1;
      this.field2640 = -1;
      this.field2592 = 0;
      this.field2637 = false;
      this.field2594 = 0;
      this.field2598 = 0;
      this.field2566 = 1;
      this.field2602 = -1;
      this.field2548 = 1;
      this.field2604 = -1;
      this.field2605 = -1;
      this.field2606 = -1;
      this.field2607 = 0;
      this.field2608 = 0;
      this.field2687 = 0;
      this.field2610 = 0;
      this.field2671 = 0;
      this.field2612 = 100;
      this.field2613 = 0;
      this.field2614 = 0;
      this.field2615 = false;
      this.field2616 = false;
      this.field2617 = 2;
      this.field2642 = -1;
      this.field2619 = "";
      this.field2669 = "";
      this.field2597 = 0;
      this.field2601 = 0;
      this.field2623 = 0;
      this.field2624 = false;
      this.field2555 = 0;
      this.field2655 = 0;
      this.field2631 = 0;
      this.field2632 = false;
      this.field2683 = "";
      this.field2639 = null;
      this.field2670 = 0;
      this.field2641 = 0;
      this.field2646 = false;
      this.field2647 = "";
      this.field2644 = false;
      this.field2679 = -1;
      this.field2564 = "";
      this.field2681 = "Ok";
      this.field2676 = -1;
      this.field2685 = 0;
      this.field2686 = 0;
      this.field2663 = 0;
      this.field2689 = false;
      this.field2690 = false;
      this.field2691 = -1;
      this.field2626 = 0;
      this.field2693 = 0;
      this.field2694 = 0;
      this.field2695 = -1;
      this.field2667 = -1;
      this.field2698 = false;
      this.field2699 = false;
      this.rl$$init();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(ZI)Llp;"
   )
   public SpritePixels method3758(boolean var1, int var2) {
      if(this.getSpriteId() != -1) {
         net.runelite.api.SpritePixels var3 = (net.runelite.api.SpritePixels)client.widgetSpriteOverrides.get(Integer.valueOf(this.getId()));
         if(var3 != null) {
            return (SpritePixels)((RSSpritePixels)var3);
         }
      }

      return (SpritePixels)this.copy$getWidgetSprite(var1, var2);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "-1733745784"
   )
   void method3768(Buffer var1) {
      var1.readUnsignedByte();
      this.field2557 = true;
      this.field2560 = var1.readUnsignedByte();
      this.field2562 = var1.readShort();
      this.field2625 = var1.method2456();
      this.field2568 = var1.method2456();
      this.field2569 = var1.readShort();
      if(this.field2560 == 9) {
         this.field2570 = var1.method2456();
      } else {
         this.field2570 = var1.readShort();
      }

      this.field2565 = var1.method2257();
      this.field2692 = var1.method2257();
      this.field2585 = var1.method2257();
      this.field2559 = var1.method2257();
      this.field2577 = var1.readShort();
      if(this.field2577 == 65535) {
         this.field2577 = -1;
      } else {
         this.field2577 += this.field2621 & -65536;
      }

      this.field2583 = var1.readUnsignedByte() == 1;
      this.onHiddenChanged(-1);
      if(this.field2560 == 0) {
         this.field2581 = var1.readShort();
         this.field2582 = var1.readShort();
         this.field2698 = var1.readUnsignedByte() == 1;
      }

      if(this.field2560 == 5) {
         this.field2593 = var1.readInt();
         this.field2592 = var1.readShort();
         this.field2637 = var1.readUnsignedByte() == 1;
         this.field2652 = var1.readUnsignedByte();
         this.field2594 = var1.readUnsignedByte();
         this.field2598 = var1.readInt();
         this.field2599 = var1.readUnsignedByte() == 1;
         this.field2600 = var1.readUnsignedByte() == 1;
      }

      if(this.field2560 == 6) {
         this.field2566 = 1;
         this.field2602 = var1.readShort();
         if(this.field2602 == 65535) {
            this.field2602 = -1;
         }

         this.field2607 = var1.method2456();
         this.field2608 = var1.method2456();
         this.field2687 = var1.readShort();
         this.field2610 = var1.readShort();
         this.field2671 = var1.readShort();
         this.field2612 = var1.readShort();
         this.field2605 = var1.readShort();
         if(this.field2605 == 65535) {
            this.field2605 = -1;
         }

         this.field2615 = var1.readUnsignedByte() == 1;
         var1.readShort();
         if(this.field2565 != 0) {
            this.field2613 = var1.readShort();
         }

         if(this.field2692 != 0) {
            var1.readShort();
         }
      }

      if(this.field2560 == 4) {
         this.field2642 = var1.readShort();
         if(this.field2642 == 65535) {
            this.field2642 = -1;
         }

         this.field2619 = var1.readString();
         this.field2597 = var1.readUnsignedByte();
         this.field2601 = var1.readUnsignedByte();
         this.field2623 = var1.readUnsignedByte();
         this.field2624 = var1.readUnsignedByte() == 1;
         this.field2633 = var1.readInt();
      }

      if(this.field2560 == 3) {
         this.field2633 = var1.readInt();
         this.field2587 = var1.readUnsignedByte() == 1;
         this.field2652 = var1.readUnsignedByte();
      }

      if(this.field2560 == 9) {
         this.field2591 = var1.readUnsignedByte();
         this.field2633 = var1.readInt();
         this.field2618 = var1.readUnsignedByte() == 1;
      }

      this.field2631 = var1.method2260();
      this.field2683 = var1.readString();
      int var2 = var1.readUnsignedByte();
      if(var2 > 0) {
         this.field2630 = new String[var2];

         for(int var3 = 0; var3 < var2; ++var3) {
            this.field2630[var3] = var1.readString();
         }
      }

      this.field2670 = var1.readUnsignedByte();
      this.field2641 = var1.readUnsignedByte();
      this.field2646 = var1.readUnsignedByte() == 1;
      this.field2647 = var1.readString();
      this.field2576 = this.method3755(var1);
      this.field2650 = this.method3755(var1);
      this.field2648 = this.method3755(var1);
      this.field2656 = this.method3755(var1);
      this.field2680 = this.method3755(var1);
      this.field2657 = this.method3755(var1);
      this.field2659 = this.method3755(var1);
      this.field2661 = this.method3755(var1);
      this.field2684 = this.method3755(var1);
      this.field2664 = this.method3755(var1);
      this.field2622 = this.method3755(var1);
      this.field2643 = this.method3755(var1);
      this.field2668 = this.method3755(var1);
      this.field2556 = this.method3755(var1);
      this.field2649 = this.method3755(var1);
      this.field2653 = this.method3755(var1);
      this.field2654 = this.method3755(var1);
      this.field2665 = this.method3755(var1);
      this.field2658 = this.method3756(var1);
      this.field2660 = this.method3756(var1);
      this.field2638 = this.method3756(var1);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)V",
      garbageValue = "1365269897"
   )
   public void method3763(int var1, String var2) {
      if(this.field2630 == null || this.field2630.length <= var1) {
         String[] var3 = new String[var1 + 1];
         if(this.field2630 != null) {
            for(int var4 = 0; var4 < this.field2630.length; ++var4) {
               var3[var4] = this.field2630[var4];
            }
         }

         this.field2630 = var3;
      }

      this.field2630[var1] = var2;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "-2134900885"
   )
   void method3795(Buffer var1) {
      this.field2557 = false;
      this.field2560 = var1.readUnsignedByte();
      this.field2561 = var1.readUnsignedByte();
      this.field2562 = var1.readShort();
      this.field2625 = var1.method2456();
      this.field2568 = var1.method2456();
      this.field2569 = var1.readShort();
      this.field2570 = var1.readShort();
      this.field2652 = var1.readUnsignedByte();
      this.field2577 = var1.readShort();
      if(this.field2577 == 65535) {
         this.field2577 = -1;
      } else {
         this.field2577 += this.field2621 & -65536;
      }

      this.field2679 = var1.readShort();
      if(this.field2679 == 65535) {
         this.field2679 = -1;
      }

      int var2 = var1.readUnsignedByte();
      int var3;
      if(var2 > 0) {
         this.field2677 = new int[var2];
         this.field2678 = new int[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            this.field2677[var3] = var1.readUnsignedByte();
            this.field2678[var3] = var1.readShort();
         }
      }

      var3 = var1.readUnsignedByte();
      int var4;
      int var5;
      int var6;
      if(var3 > 0) {
         this.field2645 = new int[var3][];

         for(var4 = 0; var4 < var3; ++var4) {
            var5 = var1.readShort();
            this.field2645[var4] = new int[var5];

            for(var6 = 0; var6 < var5; ++var6) {
               this.field2645[var4][var6] = var1.readShort();
               if(this.field2645[var4][var6] == 65535) {
                  this.field2645[var4][var6] = -1;
               }
            }
         }
      }

      if(this.field2560 == 0) {
         this.field2582 = var1.readShort();
         this.field2583 = var1.readUnsignedByte() == 1;
         this.onHiddenChanged(-1);
      }

      if(this.field2560 == 1) {
         var1.readShort();
         var1.readUnsignedByte();
      }

      if(this.field2560 == 2) {
         this.field2682 = new int[this.field2569 * this.field2570];
         this.field2696 = new int[this.field2569 * this.field2570];
         var4 = var1.readUnsignedByte();
         if(var4 == 1) {
            this.field2631 |= 268435456;
         }

         var5 = var1.readUnsignedByte();
         if(var5 == 1) {
            this.field2631 |= 1073741824;
         }

         var6 = var1.readUnsignedByte();
         if(var6 == 1) {
            this.field2631 |= Integer.MIN_VALUE;
         }

         int var7 = var1.readUnsignedByte();
         if(var7 == 1) {
            this.field2631 |= 536870912;
         }

         this.field2555 = var1.readUnsignedByte();
         this.field2655 = var1.readUnsignedByte();
         this.field2627 = new int[20];
         this.field2628 = new int[20];
         this.field2629 = new int[20];

         int var8;
         for(var8 = 0; var8 < 20; ++var8) {
            int var9 = var1.readUnsignedByte();
            if(var9 == 1) {
               this.field2627[var8] = var1.method2456();
               this.field2628[var8] = var1.method2456();
               this.field2629[var8] = var1.readInt();
            } else {
               this.field2629[var8] = -1;
            }
         }

         this.field2567 = new String[5];

         for(var8 = 0; var8 < 5; ++var8) {
            String var11 = var1.readString();
            if(var11.length() > 0) {
               this.field2567[var8] = var11;
               this.field2631 |= 1 << var8 + 23;
            }
         }
      }

      if(this.field2560 == 3) {
         this.field2587 = var1.readUnsignedByte() == 1;
      }

      if(this.field2560 == 4 || this.field2560 == 1) {
         this.field2601 = var1.readUnsignedByte();
         this.field2623 = var1.readUnsignedByte();
         this.field2597 = var1.readUnsignedByte();
         this.field2642 = var1.readShort();
         if(this.field2642 == 65535) {
            this.field2642 = -1;
         }

         this.field2624 = var1.readUnsignedByte() == 1;
      }

      if(this.field2560 == 4) {
         this.field2619 = var1.readString();
         this.field2669 = var1.readString();
      }

      if(this.field2560 == 1 || this.field2560 == 3 || this.field2560 == 4) {
         this.field2633 = var1.readInt();
      }

      if(this.field2560 == 3 || this.field2560 == 4) {
         this.field2584 = var1.readInt();
         this.field2697 = var1.readInt();
         this.field2554 = var1.readInt();
      }

      if(this.field2560 == 5) {
         this.field2593 = var1.readInt();
         this.field2640 = var1.readInt();
      }

      if(this.field2560 == 6) {
         this.field2566 = 1;
         this.field2602 = var1.readShort();
         if(this.field2602 == 65535) {
            this.field2602 = -1;
         }

         this.field2548 = 1;
         this.field2604 = var1.readShort();
         if(this.field2604 == 65535) {
            this.field2604 = -1;
         }

         this.field2605 = var1.readShort();
         if(this.field2605 == 65535) {
            this.field2605 = -1;
         }

         this.field2606 = var1.readShort();
         if(this.field2606 == 65535) {
            this.field2606 = -1;
         }

         this.field2612 = var1.readShort();
         this.field2687 = var1.readShort();
         this.field2610 = var1.readShort();
      }

      if(this.field2560 == 7) {
         this.field2682 = new int[this.field2569 * this.field2570];
         this.field2696 = new int[this.field2569 * this.field2570];
         this.field2601 = var1.readUnsignedByte();
         this.field2642 = var1.readShort();
         if(this.field2642 == 65535) {
            this.field2642 = -1;
         }

         this.field2624 = var1.readUnsignedByte() == 1;
         this.field2633 = var1.readInt();
         this.field2555 = var1.method2456();
         this.field2655 = var1.method2456();
         var4 = var1.readUnsignedByte();
         if(var4 == 1) {
            this.field2631 |= 1073741824;
         }

         this.field2567 = new String[5];

         for(var5 = 0; var5 < 5; ++var5) {
            String var10 = var1.readString();
            if(var10.length() > 0) {
               this.field2567[var5] = var10;
               this.field2631 |= 1 << var5 + 23;
            }
         }
      }

      if(this.field2560 == 8) {
         this.field2619 = var1.readString();
      }

      if(this.field2561 == 2 || this.field2560 == 2) {
         this.field2647 = var1.readString();
         this.field2564 = var1.readString();
         var4 = var1.readShort() & 63;
         this.field2631 |= var4 << 11;
      }

      if(this.field2561 == 1 || this.field2561 == 4 || this.field2561 == 5 || this.field2561 == 6) {
         this.field2681 = var1.readString();
         if(this.field2681.length() == 0) {
            if(this.field2561 == 1) {
               this.field2681 = "Ok";
            }

            if(this.field2561 == 4) {
               this.field2681 = "Select";
            }

            if(this.field2561 == 5) {
               this.field2681 = "Select";
            }

            if(this.field2561 == 6) {
               this.field2681 = "Continue";
            }
         }
      }

      if(this.field2561 == 1 || this.field2561 == 4 || this.field2561 == 5) {
         this.field2631 |= 4194304;
      }

      if(this.field2561 == 6) {
         this.field2631 |= 1;
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Lgm;I)[Ljava/lang/Object;",
      garbageValue = "1758998692"
   )
   Object[] method3755(Buffer var1) {
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

         this.field2644 = true;
         return var3;
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(ZI)Lht;",
      garbageValue = "1950329585"
   )
   public class198 method3762(boolean var1) {
      if(this.field2640 == -1) {
         var1 = false;
      }

      int var2 = var1?this.field2640:this.field2593;
      if(var2 == -1) {
         return null;
      } else {
         long var3 = ((long)this.field2598 << 40) + ((this.field2600?1L:0L) << 39) + (long)var2 + ((long)this.field2594 << 36) + ((this.field2599?1L:0L) << 38);
         class198 var5 = (class198)field2596.method1813(var3);
         if(var5 != null) {
            return var5;
         } else {
            SpritePixels var6 = this.method3758(var1, 1854687350);
            if(var6 == null) {
               return null;
            } else {
               SpritePixels var7 = var6.method205();
               int[] var8 = new int[var7.height];
               int[] var9 = new int[var7.height];

               for(int var10 = 0; var10 < var7.height; ++var10) {
                  int var11 = 0;
                  int var12 = var7.width;

                  int var13;
                  for(var13 = 0; var13 < var7.width; ++var13) {
                     if(var7.pixels[var13 + var10 * var7.width] == 0) {
                        var11 = var13;
                        break;
                     }
                  }

                  for(var13 = var7.width - 1; var13 >= var11; --var13) {
                     if(var7.pixels[var13 + var10 * var7.width] == 0) {
                        var12 = var13 + 1;
                        break;
                     }
                  }

                  var8[var10] = var11;
                  var9[var10] = var12 - var11;
               }

               var5 = new class198(var7.width, var7.height, var9, var8, var2);
               field2596.method1820(var5, var3);
               return var5;
            }
         }
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lgm;I)[I",
      garbageValue = "-1172910031"
   )
   int[] method3756(Buffer var1) {
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

   public Rectangle getBounds() {
      Point var1 = this.getCanvasLocation();
      return new Rectangle(var1.getX(), var1.getY(), this.getWidth(), this.getHeight());
   }

   public String getRSText() {
      return this.field2619;
   }

   public String getRSName() {
      return this.field2683;
   }

   public int getParentId() {
      if(!$assertionsDisabled && !class302.field3755.isClientThread()) {
         throw new AssertionError();
      } else {
         int var1 = this.getRSParentId();
         if(var1 != -1) {
            return var1;
         } else {
            int var2 = this.getId();
            if(WidgetInfo.TO_GROUP(var2) == class302.field3755.getWidgetRoot()) {
               return -1;
            } else {
               int var3 = this.rl$parentId;
               if(var3 != -1) {
                  RSHashTable var4 = class302.field3755.getComponentTable();
                  WidgetNode var5 = (WidgetNode)var4.get((long)var3);
                  if(var5 != null && var5.getId() == WidgetInfo.TO_GROUP(var2)) {
                     return var3;
                  }

                  this.rl$parentId = -1;
               }

               int var13 = WidgetInfo.TO_GROUP(this.getId());
               RSHashTable var14 = class302.field3755.getComponentTable();
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
      return this.field2682;
   }

   public Point getCanvasLocation() {
      return new Point(this.rl$x, this.rl$y);
   }

   public int getSpriteId() {
      return this.field2593;
   }

   public RSWidget[] getChildren() {
      return this.field2688;
   }

   public int getRSParentId() {
      return this.field2577;
   }

   public int getId() {
      return this.field2621;
   }

   public void setRSName(String var1) {
      this.field2683 = var1;
   }

   public int[] getItemQuantities() {
      return this.field2696;
   }

   public boolean isSelfHidden() {
      return this.field2583;
   }

   public Widget getParent() {
      int var1 = this.getParentId();
      return var1 == -1?null:class302.field3755.getWidget(WidgetInfo.TO_GROUP(var1), WidgetInfo.TO_CHILD(var1));
   }

   @ObfuscatedSignature(
      signature = "(ZI)Llp;"
   )
   public SpritePixels copy$getWidgetSprite(boolean var1, int var2) {
      field2578 = false;
      int var3;
      if(var1) {
         var3 = this.field2640;
      } else {
         var3 = this.field2593;
      }

      if(var3 == -1) {
         return null;
      } else {
         long var4 = ((this.field2599?1L:0L) << 38) + ((long)this.field2594 << 36) + (long)var3 + ((this.field2600?1L:0L) << 39) + ((long)this.field2598 << 40);
         SpritePixels var6 = (SpritePixels)field2552.method1813(var4);
         if(var6 != null) {
            return var6;
         } else {
            var6 = class91.method1715(field2550, var3, 0, (byte)-82);
            if(var6 == null) {
               field2578 = true;
               return null;
            } else {
               if(this.field2599) {
                  var6.method210();
               }

               if(this.field2600) {
                  var6.method209();
               }

               if(this.field2594 > 0) {
                  var6.method208(this.field2594);
               }

               if(this.field2594 >= 1) {
                  var6.method211(1);
               }

               if(this.field2594 >= 2) {
                  var6.method211(16777215);
               }

               if(this.field2598 != 0) {
                  var6.method284(this.field2598);
               }

               field2552.method1820(var6, var4);
               return var6;
            }
         }
      }
   }

   public int getWidth() {
      return this.field2573;
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
      return this.field2574;
   }

   public int getXPitch() {
      return this.field2555;
   }

   public Widget[] getNestedChildren() {
      if(!$assertionsDisabled && !class302.field3755.isClientThread()) {
         throw new AssertionError();
      } else if(this.getRSParentId() == this.getId()) {
         return new Widget[0];
      } else {
         RSHashTable var1 = class302.field3755.getComponentTable();
         WidgetNode var2 = (WidgetNode)var1.get((long)this.getId());
         if(var2 == null) {
            return new class187[0];
         } else {
            int var3 = var2.getId();
            ArrayList var4 = new ArrayList();
            RSWidget[] var5 = class302.field3755.getGroup(var3);
            int var6 = var5.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               RSWidget var8 = var5[var7];
               if(var8 != null && var8.getRSParentId() == -1) {
                  var4.add(var8);
               }
            }

            return (Widget[])var4.toArray(new class187[var4.size()]);
         }
      }
   }

   public int getYPitch() {
      return this.field2655;
   }

   public void broadcastHidden(boolean var1) {
      WidgetHiddenChanged var2 = new WidgetHiddenChanged();
      var2.setWidget(this);
      var2.setHidden(var1);
      class302.field3755.getCallbacks().post(var2);
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
      this.field2688 = (class187[])var1;
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void onPositionChanged(int var1) {
      int var2 = this.getId();
      if(var2 != -1) {
         int var3 = class302.field3755.getGameCycle();
         if(var3 != rl$widgetLastPosChanged) {
            rl$widgetLastPosChanged = var3;
            class302.field3755.getLogger().trace("Posting widget position changed");
            WidgetPositioned var4 = new WidgetPositioned();
            class302.field3755.getCallbacks().postDeferred(var4);
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
         } else if(WidgetInfo.TO_GROUP(var2) != class302.field3755.getWidgetRoot()) {
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
      if(!$assertionsDisabled && !class302.field3755.isClientThread()) {
         throw new AssertionError();
      } else if(this.isSelfHidden()) {
         return true;
      } else {
         Widget var1 = this.getParent();
         if(var1 == null) {
            if(WidgetInfo.TO_GROUP(this.getId()) != class302.field3755.getWidgetRoot()) {
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
         RSWidget[] var2 = class302.field3755.getGroup(WidgetInfo.TO_GROUP(this.getId()));
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            RSWidget var5 = var2[var4];
            if(var5 != null && var5.getRSParentId() == this.getId()) {
               var1.add(var5);
            }
         }

         return (Widget[])var1.toArray(new class187[var1.size()]);
      }
   }

   public boolean contains(Point var1) {
      Rectangle var2 = this.getBounds();
      return var2 != null && var2.contains(new java.awt.Point(var1.getX(), var1.getY()));
   }

   public Widget createChild(int var1, int var2) {
      if(!$assertionsDisabled && !class302.field3755.isClientThread()) {
         throw new AssertionError();
      } else {
         RSWidget var3 = class302.field3755.createWidget();
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
            var4 = new class187[var1 + 1];
            this.setChildren((Widget[])var4);
         } else if(((Object[])var4).length <= var1) {
            class187[] var5 = new class187[var1 + 1];
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
      if(!$assertionsDisabled && !class302.field3755.isClientThread()) {
         throw new AssertionError();
      } else {
         class302.field3755.revalidateWidget(this);
      }
   }

   public void revalidateScroll() {
      if(!$assertionsDisabled && !class302.field3755.isClientThread()) {
         throw new AssertionError();
      } else {
         class302.field3755.revalidateWidget(this);
         class302.field3755.revalidateWidgetScroll(class302.field3755.getWidgets()[WidgetInfo.TO_GROUP(this.getId())], this, false);
      }
   }

   public void deleteAllChildren() {
      if(this.getChildren() != null) {
         Arrays.fill(this.getChildren(), (Object)null);
      }

   }

   public void setIsIf3(boolean var1) {
      this.field2557 = var1;
   }

   public boolean isIf3() {
      return this.field2557;
   }

   public void setId(int var1) {
      this.field2621 = var1;
   }

   public void setIndex(int var1) {
      this.field2620 = var1;
   }

   public int getIndex() {
      return this.field2620;
   }

   public void setType(int var1) {
      this.field2560 = var1;
   }

   public int getType() {
      return this.field2560;
   }

   public void setContentType(int var1) {
      this.field2562 = var1;
   }

   public int getContentType() {
      return this.field2562;
   }

   public void setXPositionMode(int var1) {
      this.field2585 = var1;
   }

   public int getXPositionMode() {
      return this.field2585;
   }

   public void setYPositionMode(int var1) {
      this.field2559 = var1;
   }

   public int getYPositionMode() {
      return this.field2559;
   }

   public void setWidthMode(int var1) {
      this.field2565 = var1;
   }

   public int getWidthMode() {
      return this.field2565;
   }

   public void setHeightMode(int var1) {
      this.field2692 = var1;
   }

   public int getHeightMode() {
      return this.field2692;
   }

   public void setOriginalX(int var1) {
      this.field2625 = var1;
   }

   public int getOriginalX() {
      return this.field2625;
   }

   public void setOriginalY(int var1) {
      this.field2568 = var1;
   }

   public int getOriginalY() {
      return this.field2568;
   }

   public void setOriginalWidth(int var1) {
      this.field2569 = var1;
   }

   public int getOriginalWidth() {
      return this.field2569;
   }

   public void setOriginalHeight(int var1) {
      this.field2570 = var1;
   }

   public int getOriginalHeight() {
      return this.field2570;
   }

   public void setRelativeX(int var1) {
      this.field2634 = var1;
   }

   public int getRelativeX() {
      return this.field2634;
   }

   public void setRelativeY(int var1) {
      this.field2572 = var1;
   }

   public int getRelativeY() {
      return this.field2572;
   }

   public void setWidth(int var1) {
      this.field2573 = var1;
   }

   public void setHeight(int var1) {
      this.field2574 = var1;
   }

   public void setParentId(int var1) {
      this.field2577 = var1;
   }

   public void setHidden(boolean var1) {
      this.field2583 = var1;
   }

   public void setScrollX(int var1) {
      this.field2579 = var1;
   }

   public int getScrollX() {
      return this.field2579;
   }

   public void setScrollY(int var1) {
      this.field2580 = var1;
   }

   public int getScrollY() {
      return this.field2580;
   }

   public void setScrollWidth(int var1) {
      this.field2581 = var1;
   }

   public int getScrollWidth() {
      return this.field2581;
   }

   public void setScrollHeight(int var1) {
      this.field2582 = var1;
   }

   public int getScrollHeight() {
      return this.field2582;
   }

   public void setTextColor(int var1) {
      this.field2633 = var1;
   }

   public int getTextColor() {
      return this.field2633;
   }

   public void setFilled(boolean var1) {
      this.field2587 = var1;
   }

   public boolean isFilled() {
      return this.field2587;
   }

   public void setOpacity(int var1) {
      this.field2652 = var1;
   }

   public int getOpacity() {
      return this.field2652;
   }

   public void setSpriteId(int var1) {
      this.field2593 = var1;
   }

   public void setBorderType(int var1) {
      this.field2594 = var1;
   }

   public int getBorderType() {
      return this.field2594;
   }

   public int getModelType() {
      return this.field2566;
   }

   public int getModelId() {
      return this.field2602;
   }

   public int getRotationX() {
      return this.field2687;
   }

   public int getRotationZ() {
      return this.field2610;
   }

   public int getRotationY() {
      return this.field2671;
   }

   public void setItemQuantityMode(int var1) {
      this.field2617 = var1;
   }

   public int getItemQuantityMode() {
      return this.field2617;
   }

   public void setFontId(int var1) {
      this.field2642 = var1;
   }

   public int getFontId() {
      return this.field2642;
   }

   public void setText(String var1) {
      this.field2619 = var1;
   }

   public void setXTextAlignment(int var1) {
      this.field2601 = var1;
   }

   public int getXTextAlignment() {
      return this.field2601;
   }

   public void setYTextAlignment(int var1) {
      this.field2623 = var1;
   }

   public int getYTextAlignment() {
      return this.field2623;
   }

   public void setTextShadowed(boolean var1) {
      this.field2624 = var1;
   }

   public boolean getTextShadowed() {
      return this.field2624;
   }

   public void setClickMask(int var1) {
      this.field2631 = var1;
   }

   public int getClickMask() {
      return this.field2631;
   }

   public String[] getActions() {
      return this.field2630;
   }

   public void setDragDeadZone(int var1) {
      this.field2670 = var1;
   }

   public int getDragDeadZone() {
      return this.field2670;
   }

   public void setDragDeadTime(int var1) {
      this.field2641 = var1;
   }

   public int getDragDeadTime() {
      return this.field2641;
   }

   public void setHasListener(boolean var1) {
      this.field2644 = var1;
   }

   public boolean hasListener() {
      return this.field2644;
   }

   public Object[] getOnLoadListener() {
      return this.field2576;
   }

   public void setOnMouseOverListener(Object[] var1) {
      this.field2650 = var1;
   }

   public void setOnMouseLeaveListener(Object[] var1) {
      this.field2648 = var1;
   }

   public void setOnTimerListener(Object[] var1) {
      this.field2684 = var1;
   }

   public void setOnOpListener(Object[] var1) {
      this.field2664 = var1;
   }

   public void setOnKeyListener(Object[] var1) {
      this.field2589 = var1;
   }

   public Object[] getOnKeyListener() {
      return this.field2589;
   }

   public void setOnDialogAbortListener(Object[] var1) {
      this.field2609 = var1;
   }

   public void setItemId(int var1) {
      this.field2676 = var1;
   }

   public int getItemId() {
      return this.field2676;
   }

   public void setItemQuantity(int var1) {
      this.field2685 = var1;
   }

   public int getItemQuantity() {
      return this.field2685;
   }

   public int getBoundsIndex() {
      return this.field2695;
   }

   public RSFontTypeFace getFont() {
      return this.method3759();
   }

   public void setAction(int var1, String var2) {
      this.method3763(var1, var2);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)Lkn;",
      garbageValue = "1380272555"
   )
   public class299 method3759() {
      field2578 = false;
      if(this.field2642 == -1) {
         return null;
      } else {
         class299 var1 = (class299)field2595.method1813((long)this.field2642);
         if(var1 != null) {
            return var1;
         } else {
            var1 = class314.method6147(field2550, field2551, this.field2642, 0);
            if(var1 != null) {
               field2595.method1820(var1, (long)this.field2642);
            } else {
               field2578 = true;
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(II)Llp;",
      garbageValue = "-1469800884"
   )
   public SpritePixels method3760(int var1) {
      field2578 = false;
      if(var1 >= 0 && var1 < this.field2629.length) {
         int var2 = this.field2629[var1];
         if(var2 == -1) {
            return null;
         } else {
            SpritePixels var3 = (SpritePixels)field2552.method1813((long)var2);
            if(var3 != null) {
               return var3;
            } else {
               var3 = class91.method1715(field2550, var2, 0, (byte)4);
               if(var3 != null) {
                  field2552.method1820(var3, (long)var2);
               } else {
                  field2578 = true;
               }

               return var3;
            }
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "2094258914"
   )
   public void method3757(int var1, int var2) {
      int var3 = this.field2682[var2];
      this.field2682[var2] = this.field2682[var1];
      this.field2682[var1] = var3;
      var3 = this.field2696[var2];
      this.field2696[var2] = this.field2696[var1];
      this.field2696[var1] = var3;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Ljw;IZLho;I)Lds;",
      garbageValue = "-2127551871"
   )
   public class52 method3761(class312 var1, int var2, boolean var3, class327 var4) {
      field2578 = false;
      int var5;
      int var6;
      if(var3) {
         var5 = this.field2548;
         var6 = this.field2604;
      } else {
         var5 = this.field2566;
         var6 = this.field2602;
      }

      if(var5 == 0) {
         return null;
      } else if(var5 == 1 && var6 == -1) {
         return null;
      } else {
         class52 var7 = (class52)field2553.method1813((long)(var6 + (var5 << 16)));
         if(var7 == null) {
            class34 var8;
            if(var5 == 1) {
               var8 = class34.method540(field2549, var6, 0);
               if(var8 == null) {
                  field2578 = true;
                  return null;
               }

               var7 = var8.method573(64, 768, -50, -10, -50);
            }

            if(var5 == 2) {
               var8 = class127.method2480(var6).method6181();
               if(var8 == null) {
                  field2578 = true;
                  return null;
               }

               var7 = var8.method573(64, 768, -50, -10, -50);
            }

            if(var5 == 3) {
               if(var4 == null) {
                  return null;
               }

               var8 = var4.method6289();
               if(var8 == null) {
                  field2578 = true;
                  return null;
               }

               var7 = var8.method573(64, 768, -50, -10, -50);
            }

            if(var5 == 4) {
               class42 var9 = class164.method3014(var6);
               var8 = var9.method842(10);
               if(var8 == null) {
                  field2578 = true;
                  return null;
               }

               var7 = var8.method573(var9.field467 + 64, var9.field430 + 768, -50, -10, -50);
            }

            field2553.method1820(var7, (long)(var6 + (var5 << 16)));
         }

         if(var1 != null) {
            var7 = var1.method6102(var7, var2);
         }

         return var7;
      }
   }

   private static void rl$$clinit() {
      $assertionsDisabled = !client.class.desiredAssertionStatus();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIIZIZI)V",
      garbageValue = "-1142805753"
   )
   static void method3802(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if(var0 < var1) {
         int var6 = (var0 + var1) / 2;
         int var7 = var0;
         class88 var8 = class88.field947[var6];
         class88.field947[var6] = class88.field947[var1];
         class88.field947[var1] = var8;

         for(int var9 = var0; var9 < var1; ++var9) {
            class88 var11 = class88.field947[var9];
            int var12 = class260.method5187(var11, var8, var2, var3);
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
               int var13 = class260.method5187(var11, var8, var4, var5);
               if(var5) {
                  var10 = -var13;
               } else {
                  var10 = var13;
               }
            }

            if(var10 <= 0) {
               class88 var14 = class88.field947[var9];
               class88.field947[var9] = class88.field947[var7];
               class88.field947[var7++] = var14;
            }
         }

         class88.field947[var1] = class88.field947[var7];
         class88.field947[var7] = var8;
         method3802(var0, var7 - 1, var2, var3, var4, var5);
         method3802(var7 + 1, var1, var2, var3, var4, var5);
      }

   }
}
