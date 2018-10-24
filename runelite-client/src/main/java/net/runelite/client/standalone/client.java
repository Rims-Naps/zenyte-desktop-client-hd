package net.runelite.client.standalone;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.awt.Canvas;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Inject;
import javax.inject.Named;
import net.runelite.api.ChatMessageType;
import net.runelite.api.ClanMember;
import net.runelite.api.Constants;
import net.runelite.api.Friend;
import net.runelite.api.GameState;
import net.runelite.api.GraphicsObject;
import net.runelite.api.HintArrowType;
import net.runelite.api.Ignore;
import net.runelite.api.IndexDataBase;
import net.runelite.api.IndexedSprite;
import net.runelite.api.InventoryID;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.NPC;
import net.runelite.api.Node;
import net.runelite.api.PacketBuffer;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.Skill;
import net.runelite.api.SpritePixels;
import net.runelite.api.Tile;
import net.runelite.api.VarClientInt;
import net.runelite.api.VarClientStr;
import net.runelite.api.VarPlayer;
import net.runelite.api.Varbits;
import net.runelite.api.WidgetNode;
import net.runelite.api.World;
import net.runelite.api.WorldType;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.BoostedLevelChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ClanChanged;
import net.runelite.api.events.DraggingWidgetChanged;
import net.runelite.api.events.ExperienceChanged;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GrandExchangeOfferChanged;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.events.MenuOpened;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.PlayerDespawned;
import net.runelite.api.events.PlayerMenuOptionsChanged;
import net.runelite.api.events.PlayerSpawned;
import net.runelite.api.events.ResizeableChanged;
import net.runelite.api.events.ScriptCallbackEvent;
import net.runelite.api.events.UsernameChanged;
import net.runelite.api.events.VarbitChanged;
import net.runelite.api.hooks.Callbacks;
import net.runelite.api.vars.AccountType;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.callback.Hooks;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSArea;
import net.runelite.rs.api.RSBufferProvider;
import net.runelite.rs.api.RSClanMemberManager;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSCollisionData;
import net.runelite.rs.api.RSDeque;
import net.runelite.rs.api.RSFrames;
import net.runelite.rs.api.RSFriendContainer;
import net.runelite.rs.api.RSFriendManager;
import net.runelite.rs.api.RSGrandExchangeOffer;
import net.runelite.rs.api.RSHashTable;
import net.runelite.rs.api.RSIgnoreContainer;
import net.runelite.rs.api.RSIndexDataBase;
import net.runelite.rs.api.RSIndexedSprite;
import net.runelite.rs.api.RSItem;
import net.runelite.rs.api.RSItemComposition;
import net.runelite.rs.api.RSItemContainer;
import net.runelite.rs.api.RSJagexLoginType;
import net.runelite.rs.api.RSNPC;
import net.runelite.rs.api.RSNPCComposition;
import net.runelite.rs.api.RSName;
import net.runelite.rs.api.RSNameable;
import net.runelite.rs.api.RSNode;
import net.runelite.rs.api.RSNodeCache;
import net.runelite.rs.api.RSObjectComposition;
import net.runelite.rs.api.RSPlayer;
import net.runelite.rs.api.RSPreferences;
import net.runelite.rs.api.RSRenderOverview;
import net.runelite.rs.api.RSScene;
import net.runelite.rs.api.RSScript;
import net.runelite.rs.api.RSScriptEvent;
import net.runelite.rs.api.RSSoundEffect;
import net.runelite.rs.api.RSSpritePixels;
import net.runelite.rs.api.RSVarbit;
import net.runelite.rs.api.RSVarcs;
import net.runelite.rs.api.RSWidget;
import net.runelite.rs.api.RSWorld;
import netscape.javascript.JSObject;
import org.slf4j.Logger;

public final class client extends class181 implements class27, RSClient {
   @ObfuscatedName("pi")
   @ObfuscatedSignature(
      signature = "[Llp;"
   )
   static class26[] field3961;
   @ObfuscatedName("mj")
   @ObfuscatedGetter(
      intValue = 1901601165
   )
   static int energy;
   @ObfuscatedName("nd")
   static int[] field3868;
   @ObfuscatedName("mi")
   @ObfuscatedGetter(
      intValue = -1486020785
   )
   static int weight;
   @ObfuscatedName("rh")
   @ObfuscatedGetter(
      intValue = -1067277261
   )
   static int field3816;
   @ObfuscatedName("rr")
   @ObfuscatedGetter(
      intValue = 229234797
   )
   static int field3823;
   @ObfuscatedName("oz")
   @ObfuscatedGetter(
      intValue = 1349505107
   )
   static int field3944;
   @ObfuscatedName("ra")
   @ObfuscatedGetter(
      intValue = 628675183
   )
   static int field3809;
   @ObfuscatedName("nl")
   @ObfuscatedGetter(
      intValue = -2138207893
   )
   static int field3894;
   @ObfuscatedName("sw")
   @ObfuscatedSignature(
      signature = "[Le;"
   )
   static class150[] field3999;
   @ObfuscatedName("nc")
   static boolean field3916;
   @ObfuscatedName("qg")
   static int[] field3873;
   @ObfuscatedName("qs")
   @ObfuscatedSignature(
      signature = "[Lcs;"
   )
   static class93[] field3767;
   @ObfuscatedName("qy")
   static int[] field3924;
   @ObfuscatedName("rj")
   @ObfuscatedGetter(
      intValue = 1791706257
   )
   static int field3938;
   @ObfuscatedName("re")
   @ObfuscatedGetter(
      intValue = 2006690739
   )
   static int field3992;
   @ObfuscatedName("nz")
   @ObfuscatedGetter(
      intValue = -2132276027
   )
   static int field3995;
   @ObfuscatedName("qo")
   static int[] field4008;
   @ObfuscatedName("qv")
   static int[] field3973;
   @ObfuscatedName("ms")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   static class329 field3909;
   @ObfuscatedName("ng")
   @ObfuscatedGetter(
      intValue = -494655909
   )
   static int field3917;
   @ObfuscatedName("ok")
   static boolean field3946;
   @ObfuscatedName("ov")
   static int[] field3941;
   @ObfuscatedName("oj")
   static int[] field3901;
   @ObfuscatedName("mc")
   @ObfuscatedGetter(
      intValue = 698570637
   )
   static int field3892;
   @ObfuscatedName("oe")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   static class310 field3934;
   @ObfuscatedName("pm")
   @ObfuscatedGetter(
      intValue = -2050474235
   )
   static int field3993;
   @ObfuscatedName("pe")
   @ObfuscatedGetter(
      intValue = 1948657599
   )
   static int field3795;
   @ObfuscatedName("mu")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   static class329 field3905;
   @ObfuscatedName("mw")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   static class310 field3991;
   @ObfuscatedName("qx")
   @ObfuscatedGetter(
      intValue = -237297995
   )
   static int field3970;
   @ObfuscatedName("ot")
   @ObfuscatedGetter(
      intValue = -1713626641
   )
   static int field3935;
   @ObfuscatedName("or")
   @ObfuscatedGetter(
      intValue = 1890888555
   )
   static int field3959;
   @ObfuscatedName("oi")
   @ObfuscatedGetter(
      longValue = -8512295860083041717L
   )
   static long field3945;
   @ObfuscatedName("oq")
   static boolean[] field3930;
   @ObfuscatedName("oy")
   static boolean[] field3747;
   @ObfuscatedName("oo")
   static boolean[] field3866;
   @ObfuscatedName("nn")
   static boolean field3913;
   @ObfuscatedName("mq")
   static boolean field3910;
   @ObfuscatedName("sb")
   @ObfuscatedGetter(
      intValue = 255917231
   )
   public static int field4001;
   @ObfuscatedName("no")
   @ObfuscatedGetter(
      intValue = 1557987687
   )
   static int field3983;
   @ObfuscatedName("qu")
   static boolean field3972;
   @ObfuscatedName("mr")
   @ObfuscatedGetter(
      intValue = 1410632695
   )
   static int field3883;
   @ObfuscatedName("md")
   @ObfuscatedGetter(
      intValue = -1148718769
   )
   static int field3886;
   @ObfuscatedName("ma")
   @ObfuscatedGetter(
      intValue = -1197296523
   )
   static int field3827;
   @ObfuscatedName("mm")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   static class329 field3914;
   @ObfuscatedName("od")
   static int[] field3942;
   @ObfuscatedName("ol")
   @ObfuscatedGetter(
      intValue = 764680107
   )
   static int publicChatMode;
   @ObfuscatedName("nq")
   @ObfuscatedGetter(
      intValue = -1836240185
   )
   static int field3912;
   @ObfuscatedName("mv")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   static class329 field3904;
   @ObfuscatedName("os")
   static int[] field3943;
   @ObfuscatedName("mo")
   @ObfuscatedGetter(
      intValue = -1685668045
   )
   static int field3842;
   @ObfuscatedName("ru")
   static boolean[] field3787;
   @ObfuscatedName("om")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   static class320 field3811;
   @ObfuscatedName("so")
   @ObfuscatedSignature(
      signature = "Lbg;"
   )
   static final class125 field4004;
   @ObfuscatedName("ni")
   @ObfuscatedGetter(
      intValue = 263723183
   )
   static int field3783;
   @ObfuscatedName("rt")
   static int[] field3780;
   @ObfuscatedName("nk")
   @ObfuscatedGetter(
      intValue = -1425696153
   )
   static int field3860;
   @ObfuscatedName("rs")
   static int[] field3979;
   @ObfuscatedName("rp")
   static int[] field3980;
   @ObfuscatedName("rz")
   static int[] field3981;
   @ObfuscatedName("sy")
   static int[] field4005;
   @ObfuscatedName("to")
   static int[] field4006;
   @ObfuscatedName("me")
   static String field3890;
   @ObfuscatedName("lw")
   @ObfuscatedGetter(
      intValue = -2118199251
   )
   static int field3888;
   @ObfuscatedName("mf")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   static class329 field3898;
   @ObfuscatedName("ml")
   static String field3891;
   @ObfuscatedName("rw")
   @ObfuscatedSignature(
      signature = "Lho;"
   )
   static class44 field3854;
   @ObfuscatedName("qd")
   static boolean field3976;
   @ObfuscatedName("oc")
   @ObfuscatedGetter(
      intValue = 1631067835
   )
   static int field3974;
   @ObfuscatedName("na")
   @ObfuscatedGetter(
      intValue = 839559075
   )
   static int field3929;
   @ObfuscatedName("py")
   static long[] field3951;
   @ObfuscatedName("qn")
   @ObfuscatedGetter(
      intValue = 1406270833
   )
   static int field3907;
   @ObfuscatedName("rg")
   @ObfuscatedGetter(
      intValue = -40906797
   )
   static int field3996;
   @ObfuscatedName("lt")
   @ObfuscatedGetter(
      intValue = 1268198779
   )
   static int field3889;
   @ObfuscatedName("qk")
   @ObfuscatedGetter(
      intValue = 959095685
   )
   static int field3968;
   @ObfuscatedName("qz")
   @ObfuscatedGetter(
      intValue = 374339515
   )
   static int field3965;
   @ObfuscatedName("qj")
   @ObfuscatedGetter(
      intValue = 1654292191
   )
   static int field3969;
   @ObfuscatedName("rx")
   @ObfuscatedGetter(
      intValue = 201273211
   )
   static int field3997;
   @ObfuscatedName("ri")
   static short field3838;
   @ObfuscatedName("rq")
   static short field3986;
   @ObfuscatedName("mn")
   static boolean field3829;
   @ObfuscatedName("pl")
   @ObfuscatedGetter(
      intValue = -1233478957
   )
   static int field3937;
   @ObfuscatedName("rk")
   static short field3975;
   @ObfuscatedName("pb")
   @ObfuscatedGetter(
      intValue = -557188255
   )
   static int field3952;
   @ObfuscatedName("qi")
   @ObfuscatedGetter(
      intValue = -953994919
   )
   static int minimapState;
   @ObfuscatedName("rv")
   static short field3984;
   @ObfuscatedName("rm")
   static short field3988;
   @ObfuscatedName("rb")
   static short field3985;
   @ObfuscatedName("pd")
   static String field3950;
   @ObfuscatedName("mz")
   @ObfuscatedGetter(
      intValue = 84522019
   )
   static int field3896;
   @ObfuscatedName("rc")
   static short field3987;
   @ObfuscatedName("rn")
   static short field3920;
   @ObfuscatedName("sc")
   @ObfuscatedSignature(
      signature = "Lbq;"
   )
   static class190 field3936;
   @ObfuscatedName("my")
   @ObfuscatedGetter(
      intValue = -129595375
   )
   static int field3897;
   @ObfuscatedName("mb")
   @ObfuscatedGetter(
      intValue = -694453479
   )
   static int field3915;
   @ObfuscatedName("st")
   static ArrayList field3849;
   @ObfuscatedName("mh")
   @ObfuscatedGetter(
      intValue = -1601287277
   )
   static int field3895;
   @ObfuscatedName("su")
   @ObfuscatedGetter(
      intValue = 460102891
   )
   static int field4003;
   @ObfuscatedName("pj")
   @ObfuscatedGetter(
      intValue = -1505758575
   )
   static int field3773;
   @ObfuscatedName("ns")
   @ObfuscatedGetter(
      intValue = 2035380467
   )
   static int field3926;
   @ObfuscatedName("px")
   @ObfuscatedGetter(
      longValue = -5747543072635697441L
   )
   static long field3956;
   @ObfuscatedName("mg")
   @ObfuscatedGetter(
      intValue = 345515089
   )
   static int field3902;
   @ObfuscatedName("nv")
   static int[] field3756;
   @ObfuscatedName("ny")
   @ObfuscatedGetter(
      intValue = -1473528221
   )
   static int field3921;
   @ObfuscatedName("sq")
   @ObfuscatedSignature(
      signature = "Lld;"
   )
   static class141 field3998;
   @ObfuscatedName("pq")
   @ObfuscatedGetter(
      intValue = 914532571
   )
   static int field3958;
   @ObfuscatedName("nb")
   @ObfuscatedGetter(
      intValue = 1781457339
   )
   static int field3919;
   @ObfuscatedName("pr")
   static int[] field3769;
   @ObfuscatedName("pn")
   static int[] field3960;
   @ObfuscatedName("ne")
   static int[] field3918;
   @ObfuscatedName("pv")
   @ObfuscatedGetter(
      intValue = 165705467
   )
   static int field3994;
   @ObfuscatedName("nh")
   @ObfuscatedGetter(
      intValue = 602191859
   )
   static int field3928;
   @ObfuscatedName("pw")
   static int[] field3955;
   @ObfuscatedName("ps")
   static int[] field3954;
   @ObfuscatedName("oh")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   static class320 field3932;
   @ObfuscatedName("og")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   static class320 field3933;
   @ObfuscatedName("nx")
   @ObfuscatedGetter(
      intValue = 2056559641
   )
   static int field3927;
   @ObfuscatedName("on")
   static int[] field3822;
   @ObfuscatedName("eg")
   @ObfuscatedGetter(
      intValue = -1193443425
   )
   static int field3884;
   @ObfuscatedName("eq")
   @ObfuscatedSignature(
      signature = "Lcj;"
   )
   static class0 field3903;
   @ObfuscatedName("il")
   @ObfuscatedGetter(
      intValue = 891947869
   )
   static int field3834;
   @ObfuscatedName("lc")
   static String[] field3874;
   @ObfuscatedName("kx")
   static int[] field3797;
   @ObfuscatedName("hk")
   @ObfuscatedGetter(
      intValue = 1091916273
   )
   static int field3982;
   @ObfuscatedName("hc")
   @ObfuscatedGetter(
      intValue = 35510501
   )
   static int field3802;
   @ObfuscatedName("lp")
   static boolean field3880;
   @ObfuscatedName("kt")
   static int[] field3805;
   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      signature = "Lcf;"
   )
   static class113 field3760;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = 1049765697
   )
   static int field3899;
   @ObfuscatedName("le")
   static boolean field3732;
   @ObfuscatedName("lh")
   static boolean[] field3906;
   @ObfuscatedName("cb")
   static boolean field3750;
   @ObfuscatedName("ch")
   @ObfuscatedGetter(
      intValue = -1553084451
   )
   static int field3755;
   @ObfuscatedName("hr")
   @ObfuscatedGetter(
      intValue = -870875055
   )
   static int field3810;
   @ObfuscatedName("ka")
   static String[] field3856;
   @ObfuscatedName("fc")
   @ObfuscatedGetter(
      intValue = 957355905
   )
   static int field3788;
   @ObfuscatedName("ct")
   @ObfuscatedGetter(
      intValue = 146676437
   )
   static int field3758;
   @ObfuscatedName("fv")
   @ObfuscatedGetter(
      intValue = -1900507003
   )
   static int field3923;
   @ObfuscatedName("cg")
   static boolean field3794;
   @ObfuscatedName("cr")
   @ObfuscatedGetter(
      intValue = 1331313895
   )
   static int field3859;
   @ObfuscatedName("fj")
   @ObfuscatedGetter(
      intValue = 782126659
   )
   static int field3877;
   @ObfuscatedName("jk")
   @ObfuscatedGetter(
      intValue = 991796541
   )
   static int field4010;
   @ObfuscatedName("ll")
   static int[] field3871;
   @ObfuscatedName("du")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class108 field4007;
   @ObfuscatedName("ky")
   @ObfuscatedGetter(
      intValue = 287260825
   )
   static int field3922;
   @ObfuscatedName("jh")
   @ObfuscatedGetter(
      intValue = -1474278951
   )
   static int field3850;
   @ObfuscatedName("ii")
   static boolean field3815;
   @ObfuscatedName("in")
   @ObfuscatedGetter(
      intValue = -711581805
   )
   static int field3793;
   @ObfuscatedName("hz")
   @ObfuscatedGetter(
      intValue = 783001733
   )
   static int field3803;
   @ObfuscatedName("gu")
   @ObfuscatedGetter(
      intValue = -1912692861
   )
   static int field3738;
   @ObfuscatedName("kc")
   static final int[] field3855;
   @ObfuscatedName("er")
   static boolean field3771;
   @ObfuscatedName("dn")
   @ObfuscatedGetter(
      intValue = 78155071
   )
   static int field3764;
   @ObfuscatedName("ln")
   static boolean field3878;
   @ObfuscatedName("ia")
   @ObfuscatedGetter(
      intValue = 210585457
   )
   static int field3819;
   @ObfuscatedName("cd")
   @ObfuscatedGetter(
      intValue = -1976635089
   )
   static int field3799;
   @ObfuscatedName("kq")
   @ObfuscatedSignature(
      signature = "[[[Lgs;"
   )
   static class320[][][] field3761;
   @ObfuscatedName("la")
   @ObfuscatedGetter(
      intValue = -1430360849
   )
   static int field3953;
   @ObfuscatedName("lz")
   static boolean field3966;
   @ObfuscatedName("jd")
   @ObfuscatedGetter(
      intValue = -780646987
   )
   static int field3824;
   @ObfuscatedName("go")
   static int[][][] field3792;
   @ObfuscatedName("cs")
   @ObfuscatedGetter(
      intValue = -302870735
   )
   static int field3751;
   @ObfuscatedName("ir")
   static int[] field3826;
   @ObfuscatedName("ju")
   static boolean field3847;
   @ObfuscatedName("cn")
   @ObfuscatedGetter(
      intValue = -2124292063
   )
   static int field4002;
   @ObfuscatedName("ed")
   @ObfuscatedGetter(
      intValue = -1078971255
   )
   static int field3777;
   @ObfuscatedName("ce")
   @ObfuscatedGetter(
      intValue = -312178591
   )
   static int field3752;
   @ObfuscatedName("kv")
   @ObfuscatedGetter(
      intValue = -1684670717
   )
   static int field3779;
   @ObfuscatedName("jy")
   @ObfuscatedGetter(
      intValue = -2074295169
   )
   static int field3908;
   @ObfuscatedName("gj")
   @ObfuscatedGetter(
      intValue = 1622095653
   )
   static int field3989;
   @ObfuscatedName("im")
   static int[] field3925;
   @ObfuscatedName("el")
   @ObfuscatedGetter(
      intValue = -436279813
   )
   static int field3768;
   @ObfuscatedName("dv")
   @ObfuscatedGetter(
      intValue = 492465375
   )
   static int field3763;
   @ObfuscatedName("li")
   @ObfuscatedGetter(
      intValue = -815598285
   )
   static int field3881;
   @ObfuscatedName("fm")
   @ObfuscatedSignature(
      signature = "Led;"
   )
   static class100 field3804;
   @ObfuscatedName("cx")
   @ObfuscatedGetter(
      intValue = -761031931
   )
   static int field3759;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = 1781919273
   )
   public static int field3785;
   @ObfuscatedName("js")
   @ObfuscatedGetter(
      intValue = -1102270627
   )
   static int field3843;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = -1820115521
   )
   static int field3730;
   @ObfuscatedName("ht")
   @ObfuscatedGetter(
      intValue = -160348481
   )
   static int field3808;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 358046815
   )
   static int field3737;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = -1612597775
   )
   static int field3740;
   @ObfuscatedName("fy")
   static boolean field3782;
   @ObfuscatedName("lo")
   static int[] field3947;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = 329786505
   )
   static int field3967;
   @ObfuscatedName("id")
   @ObfuscatedGetter(
      intValue = 487837195
   )
   public static int field3814;
   @ObfuscatedName("io")
   static int[] field3821;
   @ObfuscatedName("hg")
   @ObfuscatedGetter(
      intValue = 1192902631
   )
   static int field3807;
   @ObfuscatedName("kz")
   static boolean field3939;
   @ObfuscatedName("lv")
   static boolean field3887;
   @ObfuscatedName("ik")
   static int[] field3825;
   @ObfuscatedName("lj")
   static int[] field3870;
   @ObfuscatedName("kk")
   static boolean[] field3857;
   @ObfuscatedName("dt")
   @ObfuscatedSignature(
      signature = "Lcf;"
   )
   static class113 field3753;
   @ObfuscatedName("lq")
   static int[] field3872;
   @ObfuscatedName("hp")
   @ObfuscatedGetter(
      intValue = 1136244785
   )
   static int field3806;
   @ObfuscatedName("fd")
   static int[] field3778;
   @ObfuscatedName("km")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   static class320 field3861;
   @ObfuscatedName("iu")
   static int[] field3964;
   @ObfuscatedName("jq")
   @ObfuscatedGetter(
      intValue = -55777941
   )
   static int field3931;
   @ObfuscatedName("ke")
   @ObfuscatedGetter(
      intValue = -119981787
   )
   static int field3867;
   @ObfuscatedName("ck")
   static boolean field3757;
   @ObfuscatedName("ki")
   static int[] field3858;
   @ObfuscatedName("ly")
   @ObfuscatedGetter(
      intValue = 1713289981
   )
   static int field3911;
   @ObfuscatedName("lk")
   @ObfuscatedGetter(
      intValue = -1557040993
   )
   static int field3882;
   @ObfuscatedName("ie")
   static boolean field3817;
   @ObfuscatedName("if")
   @ObfuscatedGetter(
      intValue = 212665001
   )
   static int field3832;
   @ObfuscatedName("he")
   @ObfuscatedGetter(
      intValue = 1177666745
   )
   static int field3864;
   @ObfuscatedName("jp")
   static boolean field3844;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = 1288293695
   )
   static int field3733;
   @ObfuscatedName("ej")
   @ObfuscatedGetter(
      intValue = -974927457
   )
   static int field3876;
   @ObfuscatedName("kd")
   static int[] field3940;
   @ObfuscatedName("hd")
   @ObfuscatedGetter(
      intValue = 1068397973
   )
   static int field3798;
   @ObfuscatedName("co")
   @ObfuscatedGetter(
      intValue = -126898941
   )
   static int field3746;
   @ObfuscatedName("hu")
   @ObfuscatedGetter(
      intValue = 1186959339
   )
   static int field3800;
   @ObfuscatedName("jg")
   @ObfuscatedGetter(
      intValue = -1144663281
   )
   static int field3839;
   @ObfuscatedName("gl")
   static final int[] field3978;
   @ObfuscatedName("en")
   @ObfuscatedGetter(
      intValue = -764713721
   )
   static int field3775;
   @ObfuscatedName("ip")
   static int[][] field3893;
   @ObfuscatedName("hq")
   static boolean field3879;
   @ObfuscatedName("jt")
   @ObfuscatedSignature(
      signature = "[Lbw;"
   )
   static class63[] field3848;
   @ObfuscatedName("ji")
   @ObfuscatedGetter(
      intValue = 899905929
   )
   static int field3845;
   @ObfuscatedName("jn")
   static boolean field3837;
   @ObfuscatedName("eo")
   @ObfuscatedGetter(
      intValue = 1414632653
   )
   static int field3971;
   @ObfuscatedName("hs")
   @ObfuscatedGetter(
      intValue = 1919471887
   )
   static int field3801;
   @ObfuscatedName("fp")
   @ObfuscatedGetter(
      intValue = 1596167271
   )
   static int field3786;
   @ObfuscatedName("fa")
   @ObfuscatedGetter(
      intValue = 1535555329
   )
   static int field3781;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "[Lfr;"
   )
   static class182[] field3790;
   @ObfuscatedName("jz")
   @ObfuscatedGetter(
      intValue = 691803225
   )
   static int field3841;
   @ObfuscatedName("fw")
   static HashMap field3784;
   @ObfuscatedName("ja")
   static boolean field3851;
   @ObfuscatedName("ic")
   @ObfuscatedGetter(
      intValue = 516940403
   )
   static int field3949;
   @ObfuscatedName("ig")
   @ObfuscatedGetter(
      intValue = 1671085411
   )
   static int field3812;
   @ObfuscatedName("kl")
   @ObfuscatedGetter(
      intValue = 385744931
   )
   static int field3962;
   @ObfuscatedName("cz")
   @ObfuscatedGetter(
      longValue = -6468747586321673221L
   )
   static long field3745;
   @ObfuscatedName("is")
   @ObfuscatedGetter(
      intValue = -1934202447
   )
   static int field3820;
   @ObfuscatedName("kw")
   @ObfuscatedGetter(
      intValue = -34734081
   )
   static int field3869;
   @ObfuscatedName("kb")
   static int[] field3865;
   @ObfuscatedName("jl")
   @ObfuscatedGetter(
      intValue = -96975487
   )
   static int field3840;
   @ObfuscatedName("it")
   static String field3835;
   @ObfuscatedName("ak")
   static boolean field3731;
   @ObfuscatedName("dd")
   @ObfuscatedGetter(
      intValue = 1582011029
   )
   static int field3762;
   @ObfuscatedName("lf")
   @ObfuscatedGetter(
      intValue = 1810391111
   )
   static int field3885;
   @ObfuscatedName("bv")
   static boolean field3739;
   @ObfuscatedName("ew")
   static byte[] field3833;
   @ObfuscatedName("ij")
   static String[] field3828;
   @ObfuscatedName("ko")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   static class320 field3862;
   @ObfuscatedName("kn")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   static class320 field3863;
   @ObfuscatedName("ba")
   public static boolean field3735;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      longValue = 4712604639809803875L
   )
   static long field3748;
   @ObfuscatedName("fi")
   @ObfuscatedSignature(
      signature = "Lje;"
   )
   static class41 field3977;
   @ObfuscatedName("hy")
   @ObfuscatedGetter(
      intValue = -2141797571
   )
   static int field3818;
   @ObfuscatedName("bm")
   static boolean field3736;
   @ObfuscatedName("jv")
   @ObfuscatedGetter(
      intValue = 1291332481
   )
   static int field3836;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = -1133534755
   )
   static int field3734;
   @ObfuscatedName("et")
   @ObfuscatedGetter(
      intValue = -2064714623
   )
   static int field3766;
   @ObfuscatedName("cv")
   @ObfuscatedGetter(
      intValue = 274943707
   )
   static int field3744;
   @ObfuscatedName("ef")
   @ObfuscatedSignature(
      signature = "Lew;"
   )
   static class269 field3770;
   @ObfuscatedName("jr")
   @ObfuscatedGetter(
      intValue = 58785275
   )
   static int field3765;
   @ObfuscatedName("fs")
   @ObfuscatedGetter(
      intValue = -319090217
   )
   static int field3789;
   @ObfuscatedName("ep")
   static int[] field3776;
   @ObfuscatedName("fb")
   static boolean field4000;
   @ObfuscatedName("hm")
   @ObfuscatedGetter(
      intValue = -1049142943
   )
   static int field3743;
   @ObfuscatedName("kj")
   @ObfuscatedGetter(
      intValue = 1157008491
   )
   static int field3853;
   @ObfuscatedName("lx")
   static String[] field3875;
   @ObfuscatedName("iq")
   @ObfuscatedGetter(
      intValue = -1451608881
   )
   static int field3830;
   @ObfuscatedName("iy")
   @ObfuscatedGetter(
      intValue = -184753419
   )
   static int field3831;
   @ObfuscatedName("ib")
   @ObfuscatedGetter(
      intValue = -1435074867
   )
   static int field3846;
   @ObfuscatedName("fo")
   @ObfuscatedSignature(
      signature = "Lcq;"
   )
   public static final class121 field3963;
   @ObfuscatedName("eh")
   @ObfuscatedSignature(
      signature = "[Lbd;"
   )
   static class237[] field3774;
   @ObfuscatedName("hf")
   @ObfuscatedGetter(
      intValue = -280712713
   )
   static int field4009;
   @ObfuscatedName("ih")
   static int[] field3852;
   @ObfuscatedName("gs")
   @ObfuscatedGetter(
      intValue = 724238505
   )
   static int field3796;
   @ObfuscatedName("hw")
   @ObfuscatedGetter(
      intValue = -1777342791
   )
   static int field3772;
   @ObfuscatedName("iv")
   @ObfuscatedGetter(
      intValue = -407059041
   )
   static int field3813;
   @ObfuscatedName("iw")
   static int[] field3754;
   @ObfuscatedName("gn")
   static boolean field3791;
   public static boolean stretchedFast;
   public static int tickCount;
   public static boolean interpolatePlayerAnimations;
   public static boolean interpolateNpcAnimations;
   public static boolean interpolateObjectAnimations;
   public static RSItem lastItemDespawn;
   public static boolean stretchedEnabled;
   public static boolean stretchedKeepAspectRatio;
   public static int inventoryDragDelay;
   public static boolean isHidingEntities;
   public static boolean hidePlayers;
   public static boolean hideLocalPlayer;
   public static boolean hideLocalPlayer2D;
   public static boolean hideNPCs;
   public static boolean hideProjectiles;
   public static boolean stretchedIntegerScaling;
   public static boolean hidePlayers2D;
   public static boolean hideFriends;
   public static boolean hideClanMates;
   public static boolean hideNPCs2D;
   public static Map widgetSpriteOverrides;
   public static Map spriteOverrides;
   public static boolean hideAttackers;
   // $FF: synthetic field
   public static boolean $assertionsDisabled;
   public static int oldMenuEntryCount;
   public static boolean pitchRelaxEnabled;
   public static RSScript currentScript;
   public static Dimension cachedStretchedDimensions;
   public static int lastPitch;
   public static int itemPressedDurationBuffer;
   public static RSPlayer[] oldPlayers;
   public static int lastPitchTarget;
   public static int currentScriptPC;
   public static Dimension lastCanvasDimensions;
   @Inject
   @Named("Core Logger")
   public Logger logger;
   @Inject
   public Callbacks callbacks;
   public Cache varbitCache;

   static {
      field3731 = true;
      field3785 = 1;
      field3733 = 0;
      field3734 = 0;
      field3735 = false;
      field3736 = false;
      field3737 = 0;
      field3967 = -1;
      field3739 = false;
      field3740 = 0;
      field3794 = true;
      field3744 = 0;
      field3745 = 1L;
      field3746 = -1;
      field3730 = -1;
      field3748 = -1L;
      field3757 = true;
      field3750 = false;
      field3751 = 0;
      field3752 = 0;
      field3859 = 0;
      field3799 = 0;
      field3755 = 0;
      field3899 = 0;
      field4002 = 0;
      field3758 = 0;
      field3759 = 0;
      field3760 = class113.field1061;
      field3753 = class113.field1061;
      field3762 = 0;
      field3763 = 0;
      field3764 = 0;
      field3884 = 0;
      field3766 = 0;
      field3876 = 0;
      field3768 = 0;
      field3971 = 0;
      field3770 = class269.field2949;
      field3771 = false;
      field3903 = new class0();
      field3833 = null;
      field3774 = new class237['耀'];
      field3775 = 0;
      field3776 = new int['耀'];
      field3777 = 0;
      field3778 = new int[250];
      field3963 = new class121();
      field3877 = 0;
      field4000 = false;
      field3782 = true;
      field3977 = new class41();
      field3784 = new HashMap();
      field3923 = 0;
      field3786 = 1;
      field3781 = 0;
      field3788 = 1;
      field3789 = 0;
      field3790 = new class182[4];
      field3791 = false;
      field3792 = new int[4][13][13];
      field3978 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      field3989 = 0;
      field3738 = 2301979;
      field3796 = 5063219;
      field3864 = 3353893;
      field3798 = 7759444;
      field3879 = false;
      field3800 = 0;
      field3801 = 128;
      field3802 = 0;
      field3803 = 0;
      field3743 = 0;
      field3818 = 0;
      field3806 = 0;
      field3807 = 0;
      field3808 = 50;
      field3982 = 0;
      field3810 = 0;
      field3772 = 0;
      field3812 = 12;
      field3813 = 6;
      field3814 = 0;
      field3815 = false;
      field3793 = 0;
      field3817 = false;
      field3846 = 0;
      field3819 = 0;
      field3820 = 50;
      field3821 = new int[field3820];
      field3852 = new int[field3820];
      field3964 = new int[field3820];
      field3754 = new int[field3820];
      field3825 = new int[field3820];
      field3826 = new int[field3820];
      field3925 = new int[field3820];
      field3828 = new String[field3820];
      field3893 = new int[104][104];
      field3830 = 0;
      field3831 = -1;
      field3832 = -1;
      field3949 = 0;
      field3834 = 0;
      field3824 = 0;
      field3836 = 0;
      field3837 = true;
      field4010 = 0;
      field3839 = 0;
      field3840 = 0;
      field3841 = 0;
      field3931 = 0;
      field3843 = 0;
      field3844 = false;
      field3845 = 0;
      field3908 = 0;
      field3847 = true;
      field3848 = new class63[2048];
      field3765 = -1;
      field3850 = 0;
      field3851 = true;
      field3962 = 0;
      field3853 = 0;
      field3805 = new int[1000];
      field3855 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
      field3856 = new String[8];
      field3857 = new boolean[8];
      field3858 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
      field3922 = -1;
      field3761 = new class320[4][104][104];
      field3861 = new class320();
      field3862 = new class320();
      field3863 = new class320();
      field3940 = new int[25];
      field3865 = new int[25];
      field3797 = new int[25];
      field3867 = 0;
      field3939 = false;
      field3869 = 0;
      field3870 = new int[500];
      field3871 = new int[500];
      field3872 = new int[500];
      field3947 = new int[500];
      field3874 = new String[500];
      field3875 = new String[500];
      field3906 = new boolean[500];
      field3966 = false;
      field3878 = false;
      field3732 = false;
      field3880 = true;
      field3881 = -1;
      field3882 = -1;
      field3953 = 0;
      field3911 = 50;
      field3885 = 0;
      field3835 = null;
      field3887 = false;
      field3888 = -1;
      field3889 = -1;
      field3890 = null;
      field3891 = null;
      field3892 = -1;
      field3991 = new class310(8);
      field3915 = 0;
      field3895 = -1;
      field3896 = 0;
      field3897 = 0;
      field3898 = null;
      energy = 0;
      weight = 0;
      field3842 = 0;
      field3902 = -1;
      field3829 = false;
      field3904 = null;
      field3905 = null;
      field3914 = null;
      field3883 = 0;
      field3886 = 0;
      field3909 = null;
      field3910 = false;
      field3827 = -1;
      field3912 = -1;
      field3913 = false;
      field3783 = -1;
      field3860 = -1;
      field3916 = false;
      field3917 = 1;
      field3918 = new int[32];
      field3919 = 0;
      field3756 = new int[32];
      field3921 = 0;
      field3868 = new int[32];
      field3995 = 0;
      field3894 = 0;
      field3983 = 0;
      field3926 = 0;
      field3927 = 0;
      field3928 = 0;
      field3929 = 0;
      field3974 = 0;
      field3811 = new class320();
      field3932 = new class320();
      field3933 = new class320();
      field3934 = new class310(512);
      field3935 = 0;
      field3959 = -2;
      field3930 = new boolean[100];
      field3866 = new boolean[100];
      field3747 = new boolean[100];
      field3901 = new int[100];
      field3941 = new int[100];
      field3942 = new int[100];
      field3943 = new int[100];
      field3944 = 0;
      field3945 = 0L;
      field3946 = true;
      field3822 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      publicChatMode = 0;
      field3937 = 0;
      field3950 = "";
      field3951 = new long[100];
      field3952 = 0;
      field3994 = 0;
      field3954 = new int[128];
      field3955 = new int[128];
      field3956 = -1L;
      field3773 = -1;
      field3958 = 0;
      field3769 = new int[1000];
      field3960 = new int[1000];
      field3961 = new class26[1000];
      field3795 = 0;
      field3993 = 0;
      minimapState = 0;
      field3965 = 255;
      field3907 = -1;
      field3972 = false;
      field3968 = 127;
      field3969 = 127;
      field3970 = 0;
      field3873 = new int[50];
      field3924 = new int[50];
      field3973 = new int[50];
      field4008 = new int[50];
      field3767 = new class93[50];
      field3976 = false;
      field3787 = new boolean[5];
      field3780 = new int[5];
      field3979 = new int[5];
      field3980 = new int[5];
      field3981 = new int[5];
      field3975 = 256;
      field3984 = 205;
      field3838 = 256;
      field3985 = 320;
      field3986 = 1;
      field3987 = 32767;
      field3988 = 1;
      field3920 = 32767;
      field3823 = 0;
      field3816 = 0;
      field3992 = 0;
      field3938 = 0;
      field3809 = 0;
      field3854 = new class44();
      field3996 = -1;
      field3997 = -1;
      field3998 = new class185();
      field3999 = new class150[8];
      field3936 = new class190();
      field4001 = -1;
      field3849 = new ArrayList(10);
      field4003 = 0;
      field4004 = new class125();
      field4005 = new int[50];
      field4006 = new int[50];
      rl$$clinit();
      rl$$clinit1();
      rl$$clinit2();
      rl$$clinit3();
      rl$$clinit4();
   }

   public client() {
      this.rl$$init();
   }

   @ObfuscatedName("eq")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "14"
   )
   void method5986(int var1) {
      class10.field77 = null;
      class10.field81 = null;
      field3763 = 0;
      if(class306.field3275 == class75.field701) {
         class75.field701 = class118.field1082;
      } else {
         class75.field701 = class306.field3275;
      }

      ++field3884;
      if(field3884 >= 2 && (var1 == 7 || var1 == 9)) {
         if(field3740 <= 5) {
            this.method3052("js5connect_full");
            field3740 = 1000;
            gameStateChanged(-1);
         } else {
            field3764 = 3000;
         }
      } else if(field3884 >= 2 && var1 == 6) {
         this.method3052("js5connect_outofdate");
         field3740 = 1000;
         gameStateChanged(-1);
      } else if(field3884 >= 4) {
         if(field3740 <= 5) {
            this.method3052("js5connect");
            field3740 = 1000;
            gameStateChanged(-1);
         } else {
            field3764 = 3000;
         }
      }

   }

   @ObfuscatedName("hn")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1713626641"
   )
   final void method5974() {
      boolean var1 = false;

      int var2;
      int var5;
      while(!var1) {
         var1 = true;

         for(var2 = 0; var2 < field3869 - 1; ++var2) {
            if(field3872[var2] < 1000 && field3872[var2 + 1] > 1000) {
               String var3 = field3875[var2];
               field3875[var2] = field3875[var2 + 1];
               field3875[var2 + 1] = var3;
               String var4 = field3874[var2];
               field3874[var2] = field3874[var2 + 1];
               field3874[var2 + 1] = var4;
               var5 = field3872[var2];
               field3872[var2] = field3872[var2 + 1];
               field3872[var2 + 1] = var5;
               var5 = field3870[var2];
               field3870[var2] = field3870[var2 + 1];
               field3870[var2 + 1] = var5;
               var5 = field3871[var2];
               field3871[var2] = field3871[var2 + 1];
               field3871[var2 + 1] = var5;
               var5 = field3947[var2];
               field3947[var2] = field3947[var2 + 1];
               field3947[var2 + 1] = var5;
               boolean var6 = field3906[var2];
               field3906[var2] = field3906[var2 + 1];
               field3906[var2 + 1] = var6;
               var1 = false;
            }
         }
      }

      if(class38.field286 == null) {
         if(field3905 == null) {
            int var16 = class226.field2222;
            int var9;
            int var14;
            int var17;
            int var18;
            if(field3939) {
               int var7;
               int var13;
               if(var16 != 1 && (class192.field1840 || var16 != 4)) {
                  var2 = class226.field2215;
                  var13 = class226.field2216;
                  if(var2 < class170.field1571 - 10 || var2 > field3779 + class170.field1571 + 10 || var13 < class319.field3406 - 10 || var13 > class319.field3406 + class68.field631 + 10) {
                     field3939 = false;
                     var14 = class170.field1571;
                     var5 = class319.field3406;
                     var17 = field3779;
                     var7 = class68.field631;

                     for(var18 = 0; var18 < field3935; ++var18) {
                        if(field3942[var18] + field3901[var18] > var14 && field3901[var18] < var14 + var17 && field3943[var18] + field3941[var18] > var5 && field3941[var18] < var7 + var5) {
                           field3930[var18] = true;
                        }
                     }
                  }
               }

               if(var16 == 1 || !class192.field1840 && var16 == 4) {
                  var2 = class170.field1571;
                  var13 = class319.field3406;
                  var14 = field3779;
                  var5 = class226.field2220;
                  var17 = class226.field2224;
                  var7 = -1;

                  for(var18 = 0; var18 < field3869; ++var18) {
                     var9 = var13 + (field3869 - 1 - var18) * 15 + 31;
                     if(var5 > var2 && var5 < var14 + var2 && var17 > var9 - 13 && var17 < var9 + 3) {
                        var7 = var18;
                     }
                  }

                  if(var7 != -1) {
                     class258.method4664(var7);
                  }

                  field3939 = false;
                  var18 = class170.field1571;
                  var9 = class319.field3406;
                  int var10 = field3779;
                  int var11 = class68.field631;

                  for(int var12 = 0; var12 < field3935; ++var12) {
                     if(field3942[var12] + field3901[var12] > var18 && field3901[var12] < var10 + var18 && field3943[var12] + field3941[var12] > var9 && field3941[var12] < var11 + var9) {
                        field3930[var12] = true;
                     }
                  }
               }
            } else {
               var2 = field3869 - 1;
               if((var16 == 1 || !class192.field1840 && var16 == 4) && var2 >= 0) {
                  var14 = field3872[var2];
                  if(var14 == 39 || var14 == 40 || var14 == 41 || var14 == 42 || var14 == 43 || var14 == 33 || var14 == 34 || var14 == 35 || var14 == 36 || var14 == 37 || var14 == 38 || var14 == 1005) {
                     label323: {
                        var5 = field3870[var2];
                        var17 = field3871[var2];
                        class329 var15 = class189.getWidget(var17);
                        if(!class128.method2377(class104.method1771(var15))) {
                           var9 = class104.method1771(var15);
                           boolean var8 = (var9 >> 29 & 1) != 0;
                           if(!var8) {
                              break label323;
                           }
                        }

                        if(class38.field286 != null && !field3844 && field3869 > 0 && !this.method5975()) {
                           var18 = field3841;
                           var9 = field3931;
                           class31.method528(class45.field353, var18, var9);
                           class45.field353 = null;
                        }

                        field3844 = false;
                        field3845 = 0;
                        itemPressedDurationChanged(-1);
                        if(class38.field286 != null) {
                           class184.method3216(class38.field286);
                        }

                        class38.field286 = class189.getWidget(var17);
                        field3840 = var5;
                        field3841 = class226.field2220;
                        field3931 = class226.field2224;
                        if(var2 >= 0) {
                           class45.field353 = new class152();
                           class45.field353.field1446 = field3870[var2];
                           class45.field353.field1453 = field3871[var2];
                           class45.field353.field1448 = field3872[var2];
                           class45.field353.field1449 = field3947[var2];
                           class45.field353.field1451 = field3874[var2];
                        }

                        class184.method3216(class38.field286);
                        return;
                     }
                  }
               }

               if((var16 == 1 || !class192.field1840 && var16 == 4) && this.method5975()) {
                  var16 = 2;
               }

               if((var16 == 1 || !class192.field1840 && var16 == 4) && field3869 > 0) {
                  class258.method4664(var2);
               }

               if(var16 == 2 && field3869 > 0) {
                  this.method6036(class226.field2220, class226.field2224);
               }
            }

         }
      }
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1563482433"
   )
   protected final void vmethod5962() {
      ++field3744;
      this.method5965();
      class286.method5052();
      class128.method2376();
      class31.method519();
      class135 var1 = class135.field1349;
      int var2;
      synchronized(class135.field1349) {
         ++class135.field1343;
         class135.field1347 = class135.field1329;
         class135.field1339 = 0;
         if(class135.field1322 >= 0) {
            while(class135.field1322 != class135.field1334) {
               var2 = class135.field1345[class135.field1334];
               class135.field1334 = class135.field1334 + 1 & 127;
               if(var2 < 0) {
                  class135.field1332[~var2] = false;
               } else {
                  if(!class135.field1332[var2] && class135.field1339 < class135.field1338.length - 1) {
                     class135.field1338[++class135.field1339 - 1] = var2;
                  }

                  class135.field1332[var2] = true;
               }
            }
         } else {
            for(var2 = 0; var2 < 112; ++var2) {
               class135.field1332[var2] = false;
            }

            class135.field1322 = class135.field1334;
         }

         if(class135.field1339 > 0) {
            class135.field1343 = 0;
         }

         class135.field1329 = class135.field1341;
      }

      class226 var35 = class226.field2208;
      synchronized(class226.field2208) {
         class226.field2223 = class226.field2210;
         class226.field2215 = class226.field2211;
         class226.field2216 = class226.field2212;
         class226.field2214 = class226.field2213;
         class226.field2222 = class226.field2207;
         class226.field2220 = class226.field2219;
         class226.field2224 = class226.field2206;
         class226.field2225 = class226.field2221;
         class226.field2207 = 0;
      }

      int var24;
      if(class105.field978 != null) {
         var24 = class105.field978.vmethod3509();
         field3974 = var24;
      }

      if(field3740 == 0) {
         class129.method2383();
         class161.field1502.vmethod5547();

         for(var24 = 0; var24 < 32; ++var24) {
            class181.field1726[var24] = 0L;
         }

         for(var24 = 0; var24 < 32; ++var24) {
            class181.field1740[var24] = 0L;
         }

         class181.field1722 = 0;
      } else if(field3740 == 5) {
         class229.method4107(this);
         class129.method2383();
         class161.field1502.vmethod5547();

         for(var24 = 0; var24 < 32; ++var24) {
            class181.field1726[var24] = 0L;
         }

         for(var24 = 0; var24 < 32; ++var24) {
            class181.field1740[var24] = 0L;
         }

         class181.field1722 = 0;
      } else if(field3740 != 10 && field3740 != 11) {
         if(field3740 == 20) {
            class229.method4107(this);
            this.method5968();
         } else if(field3740 == 25) {
            class78.method1193(false);
            field3923 = 0;
            boolean var42 = true;

            for(var2 = 0; var2 < class233.field2297.length; ++var2) {
               if(class285.field3103[var2] != -1 && class233.field2297[var2] == null) {
                  class233.field2297[var2] = class11.field85.method2579(class285.field3103[var2], 0, 1035482844);
                  if(class233.field2297[var2] == null) {
                     var42 = false;
                     ++field3923;
                  }
               }

               if(class78.field721[var2] != -1 && class96.field909[var2] == null) {
                  try {
                     class96.field909[var2] = class11.field85.method2580(class78.field721[var2], 0, class77.field711[var2]);
                     if (class96.field909[var2] == null) {
                        var42 = false;
                        ++field3923;
                     }
                  } catch (Exception e) {

                  }
               }
            }

            if(!var42) {
               field3789 = 1;
            } else {
               field3781 = 0;
               var42 = true;

               int var5;
               Buffer var9;
               int var10;
               int var11;
               int var12;
               int var14;
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               int var25;
               for(var2 = 0; var2 < class233.field2297.length; ++var2) {
                  byte[] var3 = class96.field909[var2];
                  if(var3 != null) {
                     var25 = (class2.field20[var2] >> 8) * 64 - class296.somex;
                     var5 = (class2.field20[var2] & 255) * 64 - class284.somey;
                     if(field3791) {
                        var25 = 10;
                        var5 = 10;
                     }

                     boolean var8 = true;
                     var9 = new Buffer(var3);
                     var10 = -1;

                     label725:
                     while(true) {
                        var11 = var9.method1964();
                        if(var11 == 0) {
                           var42 &= var8;
                           break;
                        }

                        var10 += var11;
                        var12 = 0;
                        boolean var13 = false;

                        while(true) {
                           while(!var13) {
                              var14 = var9.readSmart();
                              if(var14 == 0) {
                                 continue label725;
                              }

                              var12 += var14 - 1;
                              var15 = var12 & 63;
                              var16 = var12 >> 6 & 63;
                              var17 = var9.readUnsignedByte() >> 2;
                              var18 = var25 + var16;
                              var19 = var15 + var5;
                              if(var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                                 class172 var20 = class152.method2696(var10);
                                 if(var17 != 22 || !field3736 || var20.field1609 != 0 || var20.field1615 == 1 || var20.field1628) {
                                    if(!var20.method2902()) {
                                       ++field3781;
                                       var8 = false;
                                    }

                                    var13 = true;
                                 }
                              }
                           }

                           var14 = var9.readSmart();
                           if(var14 == 0) {
                              break;
                           }

                           var9.readUnsignedByte();
                        }
                     }
                  }
               }

               if(!var42) {
                  field3789 = 2;
               } else {
                  if(field3789 != 0) {
                     class319.method5587("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
                  }

                  class31.method519();
                  class258.field2566.method5331();

                  for(var2 = 0; var2 < 4; ++var2) {
                     field3790[var2].method3160();
                  }

                  int var26;
                  for(var2 = 0; var2 < 4; ++var2) {
                     for(var26 = 0; var26 < 104; ++var26) {
                        for(var25 = 0; var25 < 104; ++var25) {
                           class31.field239[var2][var26][var25] = 0;
                        }
                     }
                  }

                  class31.method519();
                  class275.method4914();
                  var2 = class233.field2297.length;

                  for(class282 var36 = (class282)class282.field3050.method5604(); var36 != null; var36 = (class282)class282.field3050.method5606()) {
                     if(var36.field3046 != null) {
                        class61.field468.method4960(var36.field3046);
                        var36.field3046 = null;
                     }

                     if(var36.field3051 != null) {
                        class61.field468.method4960(var36.field3051);
                        var36.field3051 = null;
                     }
                  }

                  class282.field3050.method5621();
                  class78.method1193(true);
                  int var6;
                  int var7;
                  int var39;
                  int var41;
                  if(!field3791) {
                     var26 = 0;

                     label657:
                     while(true) {
                        byte[] var27;
                        if(var26 >= var2) {
                           for(var26 = 0; var26 < var2; ++var26) {
                              var25 = (class2.field20[var26] >> 8) * 64 - class296.somex;
                              var5 = (class2.field20[var26] & 255) * 64 - class284.somey;
                              var27 = class233.field2297[var26];
                              if(var27 == null && class164.field1525 < 800) {
                                 class31.method519();
                                 class261.method4811(var25, var5, 64, 64);
                              }
                           }

                           class78.method1193(true);
                           var26 = 0;

                           while(true) {
                              if(var26 >= var2) {
                                 break label657;
                              }

                              byte[] var4 = class96.field909[var26];
                              if(var4 != null) {
                                 var5 = (class2.field20[var26] >> 8) * 64 - class296.somex;
                                 var6 = (class2.field20[var26] & 255) * 64 - class284.somey;
                                 class31.method519();
                                 class312 var29 = class258.field2566;
                                 class182[] var30 = field3790;
                                 var9 = new Buffer(var4);
                                 var10 = -1;

                                 while(true) {
                                    var11 = var9.method1964();
                                    if(var11 == 0) {
                                       break;
                                    }

                                    var10 += var11;
                                    var12 = 0;

                                    while(true) {
                                       var41 = var9.readSmart();
                                       if(var41 == 0) {
                                          break;
                                       }

                                       var12 += var41 - 1;
                                       var14 = var12 & 63;
                                       var15 = var12 >> 6 & 63;
                                       var16 = var12 >> 12;
                                       var17 = var9.readUnsignedByte();
                                       var18 = var17 >> 2;
                                       var19 = var17 & 3;
                                       int var31 = var5 + var15;
                                       int var21 = var6 + var14;
                                       if(var31 > 0 && var21 > 0 && var31 < 103 && var21 < 103) {
                                          int var22 = var16;
                                          if((class31.field239[1][var31][var21] & 2) == 2) {
                                             var22 = var16 - 1;
                                          }

                                          class182 var23 = null;
                                          if(var22 >= 0) {
                                             var23 = var30[var22];
                                          }

                                          class284.method5032(var16, var31, var21, var10, var19, var18, var29, var23);
                                       }
                                    }
                                 }
                              }

                              ++var26;
                           }
                        }

                        var25 = (class2.field20[var26] >> 8) * 64 - class296.somex;
                        var5 = (class2.field20[var26] & 255) * 64 - class284.somey;
                        var27 = class233.field2297[var26];
                        if(var27 != null) {
                           class31.method519();
                           var7 = class45.field350 * 8 - 48;
                           var39 = class164.field1525 * 8 - 48;
                           class182[] var40 = field3790;
                           var10 = 0;

                           label654:
                           while(true) {
                              if(var10 >= 4) {
                                 Buffer var28 = new Buffer(var27);
                                 var11 = 0;

                                 while(true) {
                                    if(var11 >= 4) {
                                       break label654;
                                    }

                                    for(var12 = 0; var12 < 64; ++var12) {
                                       for(var41 = 0; var41 < 64; ++var41) {
                                          class298.method5184(var28, var11, var25 + var12, var41 + var5, var7, var39, 0);
                                       }
                                    }

                                    ++var11;
                                 }
                              }

                              for(var11 = 0; var11 < 64; ++var11) {
                                 for(var12 = 0; var12 < 64; ++var12) {
                                    if(var11 + var25 > 0 && var11 + var25 < 103 && var5 + var12 > 0 && var12 + var5 < 103) {
                                       var40[var10].field1765[var11 + var25][var12 + var5] &= -16777217;
                                    }
                                 }
                              }

                              ++var10;
                           }
                        }

                        ++var26;
                     }
                  }

                  int var32;
                  if(field3791) {
                     var26 = 0;

                     label590:
                     while(true) {
                        if(var26 >= 4) {
                           for(var26 = 0; var26 < 13; ++var26) {
                              for(var25 = 0; var25 < 13; ++var25) {
                                 var5 = field3792[0][var26][var25];
                                 if(var5 == -1) {
                                    class261.method4811(var26 * 8, var25 * 8, 8, 8);
                                 }
                              }
                           }

                           class78.method1193(true);
                           var26 = 0;

                           while(true) {
                              if(var26 >= 4) {
                                 break label590;
                              }

                              class31.method519();

                              for(var25 = 0; var25 < 13; ++var25) {
                                 for(var5 = 0; var5 < 13; ++var5) {
                                    var6 = field3792[var26][var25][var5];
                                    if(var6 != -1) {
                                       var7 = var6 >> 24 & 3;
                                       var39 = var6 >> 1 & 3;
                                       var32 = var6 >> 14 & 1023;
                                       var10 = var6 >> 3 & 2047;
                                       var11 = (var32 / 8 << 8) + var10 / 8;

                                       for(var12 = 0; var12 < class2.field20.length; ++var12) {
                                          if(class2.field20[var12] == var11 && class96.field909[var12] != null) {
                                             class194.method3302(class96.field909[var12], var26, var25 * 8, var5 * 8, var7, (var32 & 7) * 8, (var10 & 7) * 8, var39, class258.field2566, field3790);
                                             break;
                                          }
                                       }
                                    }
                                 }
                              }

                              ++var26;
                           }
                        }

                        class31.method519();

                        for(var25 = 0; var25 < 13; ++var25) {
                           for(var5 = 0; var5 < 13; ++var5) {
                              boolean var38 = false;
                              var7 = field3792[var26][var25][var5];
                              if(var7 != -1) {
                                 var39 = var7 >> 24 & 3;
                                 var32 = var7 >> 1 & 3;
                                 var10 = var7 >> 14 & 1023;
                                 var11 = var7 >> 3 & 2047;
                                 var12 = (var10 / 8 << 8) + var11 / 8;

                                 for(var41 = 0; var41 < class2.field20.length; ++var41) {
                                    if(class2.field20[var41] == var12 && class233.field2297[var41] != null) {
                                       class21.method221(class233.field2297[var41], var26, var25 * 8, var5 * 8, var39, (var10 & 7) * 8, (var11 & 7) * 8, var32, field3790);
                                       var38 = true;
                                       break;
                                    }
                                 }
                              }

                              if(!var38) {
                                 var39 = var26;
                                 var32 = var25 * 8;
                                 var10 = var5 * 8;

                                 for(var11 = 0; var11 < 8; ++var11) {
                                    for(var12 = 0; var12 < 8; ++var12) {
                                       class31.field249[var39][var11 + var32][var10 + var12] = 0;
                                    }
                                 }

                                 if(var32 > 0) {
                                    for(var11 = 1; var11 < 8; ++var11) {
                                       class31.field249[var39][var32][var11 + var10] = class31.field249[var39][var32 - 1][var11 + var10];
                                    }
                                 }

                                 if(var10 > 0) {
                                    for(var11 = 1; var11 < 8; ++var11) {
                                       class31.field249[var39][var11 + var32][var10] = class31.field249[var39][var32 + var11][var10 - 1];
                                    }
                                 }

                                 if(var32 > 0 && class31.field249[var39][var32 - 1][var10] != 0) {
                                    class31.field249[var39][var32][var10] = class31.field249[var39][var32 - 1][var10];
                                 } else if(var10 > 0 && class31.field249[var39][var32][var10 - 1] != 0) {
                                    class31.field249[var39][var32][var10] = class31.field249[var39][var32][var10 - 1];
                                 } else if(var32 > 0 && var10 > 0 && class31.field249[var39][var32 - 1][var10 - 1] != 0) {
                                    class31.field249[var39][var32][var10] = class31.field249[var39][var32 - 1][var10 - 1];
                                 }
                              }
                           }
                        }

                        ++var26;
                     }
                  }

                  class78.method1193(true);
                  class31.method519();
                  class190.method3261(class258.field2566, field3790);
                  class78.method1193(true);
                  var26 = class31.field246;
                  if(var26 > class315.plane) {
                     var26 = class315.plane;
                  }

                  if(var26 < class315.plane - 1) {
                     var26 = class315.plane - 1;
                  }

                  if(field3736) {
                     class258.field2566.method5481(class31.field246);
                  } else {
                     class258.field2566.method5481(0);
                  }

                  for(var25 = 0; var25 < 104; ++var25) {
                     for(var5 = 0; var5 < 104; ++var5) {
                        class57.method1018(var25, var5);
                     }
                  }

                  class31.method519();
                  class80.method1221();
                  class172.field1599.method2271();
                  class279 var37;
                  if(class113.field1064.method3126()) {
                     var37 = class95.writeClientProt(ClientProt.field480, field3963.field1162);
                     var37.field3018.writeInt(1057001181);
                     field3963.method2235(var37);
                  }

                  if(!field3791) {
                     var25 = (class45.field350 - 6) / 8;
                     var5 = (class45.field350 + 6) / 8;
                     var6 = (class164.field1525 - 6) / 8;
                     var7 = (class164.field1525 + 6) / 8;

                     for(var39 = var25 - 1; var39 <= var5 + 1; ++var39) {
                        for(var32 = var6 - 1; var32 <= var7 + 1; ++var32) {
                           if(var39 < var25 || var39 > var5 || var32 < var6 || var32 > var7) {
                              class11.field85.method2658("m" + var39 + "_" + var32);
                              class11.field85.method2658("l" + var39 + "_" + var32);
                           }
                        }
                     }
                  }

                  class188.method3239(30);
                  class31.method519();
                  class224.method4017();
                  var37 = class95.writeClientProt(ClientProt.MAP_BUILD_COMPLETE, field3963.field1162);
                  field3963.method2235(var37);
                  class161.field1502.vmethod5547();

                  for(var5 = 0; var5 < 32; ++var5) {
                     class181.field1726[var5] = 0L;
                  }

                  for(var5 = 0; var5 < 32; ++var5) {
                     class181.field1740[var5] = 0L;
                  }

                  class181.field1722 = 0;
               }
            }
         }
      } else {
         class229.method4107(this);
      }

      if(field3740 == 30) {
         this.method5969();
      } else if(field3740 == 40 || field3740 == 45) {
         this.method5968();
      }

   }

   @ObfuscatedName("ii")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-2067508942"
   )
   final void method5977(boolean var1) {
      class83.method1227(field3892, class47.field359, class330.field3689, var1);
   }

   @ObfuscatedName("er")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1310601373"
   )
   void method5966() {
      if(class270.field2960 >= 4) {
         this.method3052("js5crc");
         field3740 = 1000;
         gameStateChanged(-1);
      } else {
         if(class270.field2972 >= 4) {
            if(field3740 <= 5) {
               this.method3052("js5io");
               field3740 = 1000;
               gameStateChanged(-1);
               return;
            }

            field3764 = 3000;
            class270.field2972 = 3;
         }

         if(--field3764 + 1 <= 0) {
            try {
               if(field3763 == 0) {
                  class10.field77 = class181.field1743.method2830(class143.field1395, class75.field701);
                  ++field3763;
               }

               if(field3763 == 1) {
                  if(class10.field77.field920 == 2) {
                     this.method5986(-1);
                     return;
                  }

                  if(class10.field77.field920 == 1) {
                     ++field3763;
                  }
               }

               if(field3763 == 2) {
                  if(field3782) {
                     class10.field81 = class330.method5935((Socket)class10.field77.field922, 40000, 5000);
                  } else {
                     class10.field81 = new class127((Socket)class10.field77.field922, class181.field1743, 5000);
                  }

                  Buffer var1 = new Buffer(5);
                  var1.writeByte(15);
                  var1.writeInt(176);
                  class10.field81.vmethod5520(var1.field1074, 0, 5);
                  ++field3763;
                  class53.field390 = class234.method4170();
               }

               if(field3763 == 3) {
                  if(class10.field81.vmethod5516() > 0 || !field3782 && field3740 <= 5) {
                     int var5 = class10.field81.vmethod5518();
                     if(var5 != 0) {
                        this.method5986(var5);
                        return;
                     }

                     ++field3763;
                  } else if(class234.method4170() - class53.field390 > 30000L) {
                     this.method5986(-2);
                     return;
                  }
               }

               if(field3763 == 4) {
                  class314 var10 = class10.field81;
                  boolean var2 = field3740 > 20;
                  if(class270.field2966 != null) {
                     try {
                        class270.field2966.vmethod5521();
                     } catch (Exception var8) {
                        ;
                     }

                     class270.field2966 = null;
                  }

                  class270.field2966 = var10;
                  class70.method1170(var2);
                  class270.field2956.field1073 = 0;
                  class270.field2965 = null;
                  class57.field455 = null;
                  class270.field2967 = 0;

                  while(true) {
                     class332 var3 = (class332)class270.field2957.method5317();
                     if(var3 == null) {
                        while(true) {
                           var3 = (class332)class270.field2962.method5317();
                           if(var3 == null) {
                              if(class270.field2970 != 0) {
                                 try {
                                    Buffer var11 = new Buffer(4);
                                    var11.writeByte(4);
                                    var11.writeByte(class270.field2970);
                                    var11.writeShort(0);
                                    class270.field2966.vmethod5520(var11.field1074, 0, 4);
                                 } catch (IOException var7) {
                                    try {
                                       class270.field2966.vmethod5521();
                                    } catch (Exception var6) {
                                       ;
                                    }

                                    ++class270.field2972;
                                    class270.field2966 = null;
                                 }
                              }

                              class270.field2961 = 0;
                              class0.field4 = class234.method4170();
                              class10.field77 = null;
                              class10.field81 = null;
                              field3763 = 0;
                              field3884 = 0;
                              return;
                           }

                           class270.field2959.method2469(var3);
                           class270.field2958.method5309(var3, var3.field704);
                           ++class270.field2964;
                           --class270.field2954;
                        }
                     }

                     class270.field2963.method5309(var3, var3.field704);
                     ++class270.field2955;
                     --class270.field2953;
                  }
               }
            } catch (IOException var9) {
               this.method5986(-3);
            }

         }
      }
   }

   @ObfuscatedName("jd")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1950026471"
   )
   final void method5979() {
      class184.method3216(field3905);
      ++class49.field370;
      if(field3913 && field3910) {
         int var1 = class226.field2215;
         int var2 = class226.field2216;
         var1 -= field3883;
         var2 -= field3886;
         if(var1 < field3827) {
            var1 = field3827;
         }

         if(var1 + field3905.field3559 > field3827 + field3914.field3559) {
            var1 = field3827 + field3914.field3559 - field3905.field3559;
         }

         if(var2 < field3912) {
            var2 = field3912;
         }

         if(var2 + field3905.field3560 > field3912 + field3914.field3560) {
            var2 = field3912 + field3914.field3560 - field3905.field3560;
         }

         int var3 = var1 - field3783;
         int var4 = var2 - field3860;
         int var5 = field3905.field3656;
         if(class49.field370 > field3905.field3627 && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
            field3916 = true;
            draggingWidgetChanged(-1);
         }

         int var6 = var1 - field3827 + field3914.field3565;
         int var7 = var2 - field3912 + field3914.field3566;
         class9 var8;
         if(field3905.field3639 != null && field3916) {
            var8 = new class9();
            var8.field63 = field3905;
            var8.field68 = var6;
            var8.field65 = var7;
            var8.field69 = field3905.field3639;
            class240.method4263(var8);
         }

         if(class226.field2223 == 0) {
            if(field3916) {
               if(field3905.field3640 != null) {
                  var8 = new class9();
                  var8.field63 = field3905;
                  var8.field68 = var6;
                  var8.field65 = var7;
                  var8.field71 = field3909;
                  var8.field69 = field3905.field3640;
                  class240.method4263(var8);
               }

               if(field3909 != null) {
                  class329 var9 = field3905;
                  int var11 = class104.method1771(var9);
                  int var10 = var11 >> 17 & 7;
                  int var12 = var10;
                  class329 var17;
                  if(var10 == 0) {
                     var17 = null;
                  } else {
                     int var13 = 0;

                     while(true) {
                        if(var13 >= var12) {
                           var17 = var9;
                           break;
                        }

                        var9 = class189.getWidget(var9.field3563);
                        if(var9 == null) {
                           var17 = null;
                           break;
                        }

                        ++var13;
                     }
                  }

                  if(var17 != null) {
                     class279 var14 = class95.writeClientProt(ClientProt.SWITCH_ITEM_LARGE, field3963.field1162);
                     var14.field3018.writeShort128(field3905.field3606);
                     var14.field3018.writeShort128(field3909.field3662);
                     var14.field3018.writeShort(field3909.field3606);
                     var14.field3018.writeIntLE(field3905.field3607);
                     var14.field3018.writeIntV1(field3909.field3607);
                     var14.field3018.writeShort(field3905.field3662);
                     field3963.method2235(var14);
                  }
               }
            } else if(this.method5975()) {
               this.method6036(field3883 + field3783, field3860 + field3886);
            } else if(field3869 > 0) {
               int var15 = field3883 + field3783;
               int var16 = field3886 + field3860;
               class31.method528(class45.field353, var15, var16);
               class45.field353 = null;
            }

            field3905 = null;
         }

      } else {
         if(class49.field370 > 1) {
            field3905 = null;
         }

      }
   }

   @ObfuscatedName("ez")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "32"
   )
   final void method5968() {
      Object var1 = field3963.method2248();
      class214 var2 = field3963.field1156;

      try {
         if(field3766 == 0) {
            if(class170.field1574 == null && (field3903.method2() || field3876 > 250)) {
               class170.field1574 = field3903.method6();
               field3903.method1();
               field3903 = null;
            }

            if(class170.field1574 != null) {
               if(var1 != null) {
                  ((class314)var1).vmethod5521();
                  var1 = null;
               }

               field3804 = null;
               field4000 = false;
               field3876 = 0;
               field3766 = 1;
            }
         }

         if(field3766 == 1) {
            if(field3804 == null) {
               field3804 = class181.field1743.method2830(class143.field1395, class75.field701);
            }

            if(field3804.field920 == 2) {
               throw new IOException();
            }

            if(field3804.field920 == 1) {
               if(field3782) {
                  var1 = class330.method5935((Socket)field3804.field922, 40000, 5000);
               } else {
                  var1 = new class127((Socket)field3804.field922, class181.field1743, 5000);
               }

               field3963.method2236((class314)var1);
               field3804 = null;
               field3766 = 2;
            }
         }

         if(field3766 == 2) {
            field3963.method2233();
            class279 var3 = class96.method1671();
            var3.field3018.writeByte(class260.field2882.field2878);
            field3963.method2235(var3);
            field3963.method2253();
            var2.field1073 = 0;
            field3766 = 3;
         }

         int var4;
         boolean var13;
         if(field3766 == 3) {
            if(class153.field1468 != null) {
               class153.field1468.method642();
            }

            if(class311.field3296 != null) {
               class311.field3296.method642();
            }

            var13 = true;
            if(field3782 && !((class314)var1).vmethod5527(1)) {
               var13 = false;
            }

            if(var13) {
               var4 = ((class314)var1).vmethod5518();
               if(class153.field1468 != null) {
                  class153.field1468.method642();
               }

               if(class311.field3296 != null) {
                  class311.field3296.method642();
               }

               if(var4 != 0) {
                  class169.method2874(var4);
                  return;
               }

               var2.field1073 = 0;
               field3766 = 4;
            }
         }

         int var29;
         if(field3766 == 4) {
            if(var2.field1073 < 8) {
               var29 = ((class314)var1).vmethod5516();
               if(var29 > 8 - var2.field1073) {
                  var29 = 8 - var2.field1073;
               }

               if(var29 > 0) {
                  ((class314)var1).vmethod5519(var2.field1074, var2.field1073, var29);
                  var2.field1073 += var29;
               }
            }

            if(var2.field1073 == 8) {
               var2.field1073 = 0;
               class38.field287 = var2.method1998();
               field3766 = 5;
            }
         }

         int var6;
         if(field3766 == 5) {
            field3963.field1156.field1073 = 0;
            field3963.method2233();
            class214 var22 = new class214(500);
            int[] var14 = new int[]{class170.field1574.nextInt(), class170.field1574.nextInt(), class170.field1574.nextInt(), class170.field1574.nextInt()};
            var22.field1073 = 0;
            var22.writeByte(1);
            var22.writeInt(var14[0]);
            var22.writeInt(var14[1]);
            var22.writeInt(var14[2]);
            var22.writeInt(var14[3]);
            var22.method1895(class38.field287);
            if(field3740 == 40) {
               var22.writeInt(class308.field3280[0]);
               var22.writeInt(class308.field3280[1]);
               var22.writeInt(class308.field3280[2]);
               var22.writeInt(class308.field3280[3]);
            } else {
               var22.writeByte(field3770.vmethod5937());
               switch(field3770.field2948) {
               case 0:
                  var22.field1073 += 4;
                  break;
               case 1:
                  var22.writeInt(((Integer)class153.field1455.field1855.get(Integer.valueOf(class273.method4903(class325.field3480)))).intValue());
                  break;
               case 2:
               case 3:
                  var22.writeMedium(class177.field1688);
                  ++var22.field1073;
               }

               var22.writeByte(class151.field1443.vmethod5937());
               var22.writeString(class325.field3490);
            }

            var22.encryptRSA(class233.field2294, class233.field2292);
            class308.field3280 = var14;
            class279 var5 = class96.method1671();
            var5.field3018.field1073 = 0;
            if(field3740 == 40) {
               var5.field3018.writeByte(class260.field2877.field2878);
            } else {
               var5.field3018.writeByte(class260.field2876.field2878);
            }

            var5.field3018.writeShort(0);
            var6 = var5.field3018.field1073;
            var5.field3018.writeInt(176);
            var5.field3018.method1900(var22.field1074, 0, var22.field1073);
            int var7 = var5.field3018.field1073;
            var5.field3018.writeString(class325.field3480);
            var5.field3018.writeByte((field3946?1:0) << 1 | (field3736?1:0));
            var5.field3018.writeShort(class47.field359);
            var5.field3018.writeShort(class330.field3689);
            class214 var8 = var5.field3018;
            int var11;
            if(field3833 != null) {
               var8.method1900(field3833, 0, field3833.length);
            } else {
               byte[] var10 = new byte[24];

               try {
                  class323.field3456.method3730(0L);
                  class323.field3456.method3716(var10);

                  for(var11 = 0; var11 < 24 && var10[var11] == 0; ++var11) {
                     ;
                  }

                  if(var11 >= 24) {
                     throw new IOException();
                  }
               } catch (Exception var20) {
                  for(int var12 = 0; var12 < 24; ++var12) {
                     var10[var12] = -1;
                  }
               }

               var8.method1900(var10, 0, var10.length);
            }

            var5.field3018.writeString(class330.field3693);
            var5.field3018.writeInt(class2.field19);
            Buffer var9 = new Buffer(class296.field3184.method2951());
            class296.field3184.method2949(var9);
            var5.field3018.method1900(var9.field1074, 0, var9.field1074.length);
            var5.field3018.writeByte(field3967);
            var5.field3018.writeInt(0);
            var5.field3018.writeInt(class77.field705.field1409);
            var5.field3018.writeInt(class330.field3690.field1409);
            var5.field3018.writeInt(class295.field3175.field1409);
            var5.field3018.writeInt(class205.field1992.field1409);
            var5.field3018.writeInt(class104.field971.field1409);
            var5.field3018.writeInt(class11.field85.field1409);
            var5.field3018.writeInt(field4007.field1409);
            var5.field3018.writeInt(class87.field801.field1409);
            var5.field3018.writeInt(class170.field1577.field1409);
            var5.field3018.writeInt(class138.field1365.field1409);
            var5.field3018.writeInt(class293.field3165.field1409);
            var5.field3018.writeInt(class78.field717.field1409);
            var5.field3018.writeInt(class126.field1194.field1409);
            var5.field3018.writeInt(class288.field3128.field1409);
            var5.field3018.writeInt(class261.field2898.field1409);
            var5.field3018.writeInt(class157.field1497.field1409);
            var5.field3018.writeInt(class313.field3372.field1409);
            var5.field3018.writeInt(class133.field1319.field1409);
            var5.field3018.method1926(var14, var7, var5.field3018.field1073);
            var5.field3018.method1902(var5.field3018.field1073 - var6);
            field3963.method2235(var5);
            field3963.method2253();
            field3963.field1162 = new class298(var14);
            int[] var28 = new int[4];

            for(var11 = 0; var11 < 4; ++var11) {
               var28[var11] = var14[var11] + 50;
            }

            var2.method3755(var28);
            field3766 = 6;
         }

         if(field3766 == 6 && ((class314)var1).vmethod5516() > 0) {
            var29 = ((class314)var1).vmethod5518();
            if(var29 == 21 && field3740 == 20) {
               field3766 = 9;
            } else if(var29 == 2) {
               field3766 = 11;
            } else if(var29 == 15 && field3740 == 40) {
               field3963.packetLength = -1;
               field3766 = 16;
            } else if(var29 == 64) {
               field3766 = 7;
            } else if(var29 == 23 && field3768 < 1) {
               ++field3768;
               field3766 = 0;
            } else {
               if(var29 != 29) {
                  class169.method2874(var29);
                  return;
               }

               field3766 = 14;
            }
         }

         if(field3766 == 7 && ((class314)var1).vmethod5516() > 0) {
            class146.field1407 = ((class314)var1).vmethod5518();
            field3766 = 8;
         }

         if(field3766 == 8 && ((class314)var1).vmethod5516() >= class146.field1407) {
            ((class314)var1).vmethod5519(var2.field1074, 0, class146.field1407);
            var2.field1073 = 0;
            field3766 = 6;
         }

         if(field3766 == 9 && ((class314)var1).vmethod5516() > 0) {
            field3971 = (((class314)var1).vmethod5518() + 3) * 60;
            field3766 = 10;
         }

         if(field3766 == 10) {
            field3876 = 0;
            class226.method4059("You have only just left another world.", "Your profile will be transferred in:", field3971 / 60 + " seconds.");
            if(--field3971 <= 0) {
               field3766 = 0;
            }

         } else {
            if(field3766 == 11 && ((class314)var1).vmethod5516() >= 1) {
               class67.field618 = ((class314)var1).vmethod5518();
               field3766 = 12;
            }

            int var16;
            if(field3766 == 12 && ((class314)var1).vmethod5516() >= class67.field618) {
               var13 = ((class314)var1).vmethod5518() == 1;
               ((class314)var1).vmethod5519(var2.field1074, 0, 4);
               var2.field1073 = 0;
               boolean var24 = false;
               if(var13) {
                  var4 = var2.method3765() << 24;
                  var4 |= var2.method3765() << 16;
                  var4 |= var2.method3765() << 8;
                  var4 |= var2.method3765();
                  var16 = class273.method4903(class325.field3480);
                  if(class153.field1455.field1855.size() >= 10 && !class153.field1455.field1855.containsKey(Integer.valueOf(var16))) {
                     Iterator var17 = class153.field1455.field1855.entrySet().iterator();
                     var17.next();
                     var17.remove();
                  }

                  class153.field1455.field1855.put(Integer.valueOf(var16), Integer.valueOf(var4));
               }

               if(field3771) {
                  class153.field1455.field1860 = class325.field3480;
               } else {
                  class153.field1455.field1860 = null;
               }

               class57.method1015();
               field3842 = ((class314)var1).vmethod5518();
               field3829 = ((class314)var1).vmethod5518() == 1;
               field3765 = ((class314)var1).vmethod5518();
               field3765 <<= 8;
               field3765 += ((class314)var1).vmethod5518();
               field3850 = ((class314)var1).vmethod5518();
               ((class314)var1).vmethod5519(var2.field1074, 0, 1);
               var2.field1073 = 0;
               ServerProt[] var26 = class176.method2962();
               var6 = var2.method3770();
               if(var6 < 0 || var6 >= var26.length) {
                  throw new IOException(var6 + " " + var2.field1073);
               }

               field3963.field1151 = var26[var6];
               field3963.packetLength = field3963.field1151.field2334;
               ((class314)var1).vmethod5519(var2.field1074, 0, 2);
               var2.field1073 = 0;
               field3963.packetLength = var2.readUnsignedShort();

               try {
                  client var18 = class113.field1064;
                  JSObject.getWindow(var18).call("zap", (Object[])null);
               } catch (Throwable var19) {
                  ;
               }

               field3766 = 13;
            }

            if(field3766 != 13) {
               if(field3766 == 14 && ((class314)var1).vmethod5516() >= 2) {
                  var2.field1073 = 0;
                  ((class314)var1).vmethod5519(var2.field1074, 0, 2);
                  var2.field1073 = 0;
                  class33.field265 = var2.readUnsignedShort();
                  field3766 = 15;
               }

               if(field3766 == 15 && ((class314)var1).vmethod5516() >= class33.field265) {
                  var2.field1073 = 0;
                  ((class314)var1).vmethod5519(var2.field1074, 0, class33.field265);
                  var2.field1073 = 0;
                  String var25 = var2.readString();
                  String var31 = var2.readString();
                  String var27 = var2.readString();
                  class226.method4059(var25, var31, var27);
                  class188.method3239(10);
               }

               if(field3766 == 16) {
                  if(field3963.packetLength == -1) {
                     if(((class314)var1).vmethod5516() < 2) {
                        return;
                     }

                     ((class314)var1).vmethod5519(var2.field1074, 0, 2);
                     var2.field1073 = 0;
                     field3963.packetLength = var2.readUnsignedShort();
                  }

                  if(((class314)var1).vmethod5516() >= field3963.packetLength) {
                     ((class314)var1).vmethod5519(var2.field1074, 0, field3963.packetLength);
                     var2.field1073 = 0;
                     var29 = field3963.packetLength;
                     field3977.method718();
                     class9.method114();
                     class322.initializeGPI(var2);
                     if(var29 != var2.field1073) {
                        throw new RuntimeException();
                     }
                  }
               } else {
                  ++field3876;
                  if(field3876 > 2000) {
                     if(field3768 < 1) {
                        if(class306.field3275 == class75.field701) {
                           class75.field701 = class118.field1082;
                        } else {
                           class75.field701 = class306.field3275;
                        }

                        ++field3768;
                        field3766 = 0;
                     } else {
                        class169.method2874(-3);
                     }
                  }
               }
            } else {
               if(((class314)var1).vmethod5516() >= field3963.packetLength) {
                  var2.field1073 = 0;
                  ((class314)var1).vmethod5519(var2.field1074, 0, field3963.packetLength);
                  field3977.method705();
                  field3745 = 1L;
                  class322.field3442.field3013 = 0;
                  class239.field2411 = true;
                  field3757 = true;
                  field3956 = -1L;
                  class36.field276 = new class60();
                  field3963.method2233();
                  field3963.field1156.field1073 = 0;
                  field3963.field1151 = null;
                  field3963.field1161 = null;
                  field3963.field1150 = null;
                  field3963.field1163 = null;
                  field3963.packetLength = 0;
                  field3963.field1159 = 0;
                  field3751 = 0;
                  field3877 = 0;
                  field3752 = 0;
                  field3869 = 0;
                  onMenuOptionsChanged(-1);
                  field3939 = false;
                  class156.method2730(0);
                  class297.field3194.clear();
                  class297.field3193.method795();
                  class297.field3195.method5554();
                  class297.field3196 = 0;
                  field3885 = 0;
                  field3887 = false;
                  field3970 = 0;
                  field3802 = 0;
                  field3807 = 0;
                  class263.field2912 = null;
                  minimapState = 0;
                  field3773 = -1;
                  field3795 = 0;
                  field3993 = 0;
                  field3760 = class113.field1061;
                  field3753 = class113.field1061;
                  field3775 = 0;
                  class67.method1151();

                  for(var29 = 0; var29 < 2048; ++var29) {
                     field3848[var29] = null;
                     cachedPlayersChanged(var29);
                  }

                  for(var29 = 0; var29 < 32768; ++var29) {
                     field3774[var29] = null;
                     cachedNPCsChanged(var29);
                  }

                  field3922 = -1;
                  field3862.method5621();
                  field3863.method5621();

                  for(var29 = 0; var29 < 4; ++var29) {
                     for(var4 = 0; var4 < 104; ++var4) {
                        for(var16 = 0; var16 < 104; ++var16) {
                           field3761[var29][var4][var16] = null;
                        }
                     }
                  }

                  field3861 = new class320();
                  class295.field3180.method5816();

                  for(var29 = 0; var29 < class309.field3288; ++var29) {
                     class309 var30 = class199.method3366(var29);
                     if(var30 != null) {
                        class215.field2069[var29] = 0;
                        class215.field2071[var29] = 0;
                        settingsChanged(var29);
                     }
                  }

                  class125.field1183.method893();
                  field3902 = -1;
                  if(field3892 != -1) {
                     class25.method365(field3892);
                  }

                  for(class45 var23 = (class45)field3991.method5317(); var23 != null; var23 = (class45)field3991.method5313()) {
                     class198.method3355(var23, true);
                  }

                  field3892 = -1;
                  field3991 = new class310(8);
                  field3898 = null;
                  field3869 = 0;
                  onMenuOptionsChanged(-1);
                  field3939 = false;
                  field3854.method776((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

                  for(var29 = 0; var29 < 8; ++var29) {
                     field3856[var29] = null;
                     playerOptionsChanged(var29);
                     field3857[var29] = false;
                  }

                  class292.field3153 = new class310(32);
                  field3794 = true;

                  for(var29 = 0; var29 < 100; ++var29) {
                     field3930[var29] = true;
                  }

                  class123.method2265();
                  class165.field1533 = null;
                  clanMemberManagerChanged(-1);

                  for(var29 = 0; var29 < 8; ++var29) {
                     field3999[var29] = new class150();
                     onGrandExchangeOffersChanged(var29);
                  }

                  class29.field225 = null;
                  class322.initializeGPI(var2);
                  class45.field350 = -1;
                  class15.buildRegion(false, var2);
                  field3963.field1151 = null;
               }

            }
         }
      } catch (IOException var21) {
         if(field3768 < 1) {
            if(class306.field3275 == class75.field701) {
               class75.field701 = class118.field1082;
            } else {
               class75.field701 = class306.field3275;
            }

            ++field3768;
            field3766 = 0;
         } else {
            class169.method2874(-2);
         }
      }
   }

   @ObfuscatedName("ee")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-848478347"
   )
   void method5965() {
      if(field3740 != 1000) {
         long var2 = class234.method4170();
         int var4 = (int)(var2 - class0.field4);
         class0.field4 = var2;
         if(var4 > 200) {
            var4 = 200;
         }

         class270.field2961 += var4;
         boolean var1;
         if(class270.field2954 == 0 && class270.field2953 == 0 && class270.field2964 == 0 && class270.field2955 == 0) {
            var1 = true;
         } else if(class270.field2966 == null) {
            var1 = false;
         } else {
            try {
               label243: {
                  if(class270.field2961 > 30000) {
                     throw new IOException();
                  }

                  class332 var5;
                  Buffer var6;
                  while(class270.field2953 < 200 && class270.field2955 > 0) {
                     var5 = (class332)class270.field2963.method5317();
                     var6 = new Buffer(4);
                     var6.writeByte(1);
                     var6.writeMedium((int)var5.field704);
                     class270.field2966.vmethod5520(var6.field1074, 0, 4);
                     class270.field2957.method5309(var5, var5.field704);
                     --class270.field2955;
                     ++class270.field2953;
                  }

                  while(class270.field2954 < 200 && class270.field2964 > 0) {
                     var5 = (class332)class270.field2959.method2474();
                     var6 = new Buffer(4);
                     var6.writeByte(0);
                     var6.writeMedium((int)var5.field704);
                     class270.field2966.vmethod5520(var6.field1074, 0, 4);
                     var5.method3298();
                     class270.field2962.method5309(var5, var5.field704);
                     --class270.field2964;
                     ++class270.field2954;
                  }

                  for(int var17 = 0; var17 < 100; ++var17) {
                     int var18 = class270.field2966.vmethod5516();
                     if(var18 < 0) {
                        throw new IOException();
                     }

                     if(var18 == 0) {
                        break;
                     }

                     class270.field2961 = 0;
                     byte var7 = 0;
                     if(class270.field2965 == null) {
                        var7 = 8;
                     } else if(class270.field2967 == 0) {
                        var7 = 1;
                     }

                     int var8;
                     int var9;
                     int var10;
                     int var12;
                     if(var7 > 0) {
                        var8 = var7 - class270.field2956.field1073;
                        if(var8 > var18) {
                           var8 = var18;
                        }

                        class270.field2966.vmethod5519(class270.field2956.field1074, class270.field2956.field1073, var8);
                        if(class270.field2970 != 0) {
                           for(var9 = 0; var9 < var8; ++var9) {
                              class270.field2956.field1074[class270.field2956.field1073 + var9] ^= class270.field2970;
                           }
                        }

                        class270.field2956.field1073 += var8;
                        if(class270.field2956.field1073 < var7) {
                           break;
                        }

                        if(class270.field2965 == null) {
                           class270.field2956.field1073 = 0;
                           var9 = class270.field2956.readUnsignedByte();
                           var10 = class270.field2956.readUnsignedShort();
                           int var11 = class270.field2956.readUnsignedByte();
                           var12 = class270.field2956.readInt();
                           long var13 = (long)(var10 + (var9 << 16));
                           class332 var15 = (class332)class270.field2957.method5310(var13);
                           class270.field2971 = true;
                           if(var15 == null) {
                              var15 = (class332)class270.field2962.method5310(var13);
                              class270.field2971 = false;
                           }

                           if(var15 == null) {
                              throw new IOException();
                           }

                           int var16 = var11 == 0?5:9;
                           class270.field2965 = var15;
                           class57.field455 = new Buffer(var16 + var12 + class270.field2965.field3725);
                           class57.field455.writeByte(var11);
                           class57.field455.writeInt(var12);
                           class270.field2967 = 8;
                           class270.field2956.field1073 = 0;
                        } else if(class270.field2967 == 0) {
                           if(class270.field2956.field1074[0] == -1) {
                              class270.field2967 = 1;
                              class270.field2956.field1073 = 0;
                           } else {
                              class270.field2965 = null;
                           }
                        }
                     } else {
                        var8 = class57.field455.field1074.length - class270.field2965.field3725;
                        var9 = 512 - class270.field2967;
                        if(var9 > var8 - class57.field455.field1073) {
                           var9 = var8 - class57.field455.field1073;
                        }

                        if(var9 > var18) {
                           var9 = var18;
                        }

                        class270.field2966.vmethod5519(class57.field455.field1074, class57.field455.field1073, var9);
                        if(class270.field2970 != 0) {
                           for(var10 = 0; var10 < var9; ++var10) {
                              class57.field455.field1074[class57.field455.field1073 + var10] ^= class270.field2970;
                           }
                        }

                        class57.field455.field1073 += var9;
                        class270.field2967 += var9;
                        if(var8 == class57.field455.field1073) {
                           if(16711935L == class270.field2965.field704) {
                              class302.field3240 = class57.field455;

                              for(var10 = 0; var10 < 256; ++var10) {
                                 class108 var19 = class270.field2969[var10];
                                 if(var19 != null) {
                                    class302.field3240.field1073 = var10 * 8 + 5;
                                    var12 = class302.field3240.readInt();
                                    int var20 = class302.field3240.readInt();
                                    var19.method1825(var12, var20);
                                 }
                              }
                           } else {
                              class270.field2968.reset();
                              class270.field2968.update(class57.field455.field1074, 0, var8);
                              var10 = (int)class270.field2968.getValue();
                              if(var10 != class270.field2965.field3723) {
                                 try {
                                    class270.field2966.vmethod5521();
                                 } catch (Exception var23) {
                                    ;
                                 }

                                 ++class270.field2960;
                                 class270.field2966 = null;
                                 class270.field2970 = (byte)((int)(Math.random() * 255.0D + 1.0D));
                                 var1 = false;
                                 break label243;
                              }

                              class270.field2960 = 0;
                              class270.field2972 = 0;
                              class270.field2965.field3724.method1798((int)(class270.field2965.field704 & 65535L), class57.field455.field1074, 16711680L == (class270.field2965.field704 & 16711680L), class270.field2971);
                           }

                           class270.field2965.method1186();
                           if(class270.field2971) {
                              --class270.field2953;
                           } else {
                              --class270.field2954;
                           }

                           class270.field2967 = 0;
                           class270.field2965 = null;
                           class57.field455 = null;
                        } else {
                           if(class270.field2967 != 512) {
                              break;
                           }

                           class270.field2967 = 0;
                        }
                     }
                  }

                  var1 = true;
               }
            } catch (IOException var24) {
               try {
                  class270.field2966.vmethod5521();
               } catch (Exception var22) {
                  ;
               }

               ++class270.field2972;
               class270.field2966 = null;
               var1 = false;
            }
         }

         if(!var1) {
            this.method5966();
         }

      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1416113915"
   )
   protected final void vmethod5970() {
      field3945 = class234.method4170() + 500L;
      this.method5971();
      if(field3892 != -1) {
         this.method5977(true);
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1325491268"
   )
   protected final void vmethod6193() {
      if(class125.field1183.method874()) {
         class125.field1183.method871();
      }

      if(class322.field3442 != null) {
         class322.field3442.field3016 = false;
      }

      class322.field3442 = null;
      field3963.method2254();
      if(class135.field1349 != null) {
         class135 var1 = class135.field1349;
         synchronized(class135.field1349) {
            class135.field1349 = null;
         }
      }

      if(class226.field2208 != null) {
         class226 var11 = class226.field2208;
         synchronized(class226.field2208) {
            class226.field2208 = null;
         }
      }

      class105.field978 = null;
      if(class153.field1468 != null) {
         class153.field1468.method644();
      }

      if(class311.field3296 != null) {
         class311.field3296.method644();
      }

      class55.method990();
      Object var12 = class94.field892;
      synchronized(class94.field892) {
         if(class94.field894 != 0) {
            class94.field894 = 1;

            try {
               class94.field892.wait();
            } catch (InterruptedException var6) {
               ;
            }
         }
      }

      if(class118.field1081 != null) {
         class118.field1081.method2562();
         class118.field1081 = null;
      }

      try {
         class323.field3454.method3713();

         for(int var5 = 0; var5 < class323.field3452; ++var5) {
            class128.field1220[var5].method3713();
         }

         class323.field3458.method3713();
         class323.field3456.method3713();
      } catch (Exception var9) {
         ;
      }

   }

   @ObfuscatedName("ft")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "216497367"
   )
   final void method6029() {
      int var1;
      if(field3892 != -1) {
         var1 = field3892;
         if(class267.method4843(var1)) {
            class86.method1253(class329.field3533[var1], -1);
         }
      }

      for(var1 = 0; var1 < field3935; ++var1) {
         if(field3930[var1]) {
            field3866[var1] = true;
         }

         field3747[var1] = field3930[var1];
         field3930[var1] = false;
      }

      field3959 = field3744;
      field3881 = -1;
      field3882 = -1;
      ClientProt.field573 = null;
      if(field3892 != -1) {
         field3935 = 0;
         class126.method2331(field3892, 0, 0, class47.field359, class330.field3689, 0, 0, -1);
      }

      Hooks.drawAfterWidgets();
      class89.method1545();
      if(field3837) {
         if(field3836 == 1) {
            class10.field79[field3824 / 100].method378(field3949 - 8, field3834 - 8);
         }

         if(field3836 == 2) {
            class10.field79[field3824 / 100 + 4].method378(field3949 - 8, field3834 - 8);
         }
      }

      int var2;
      int var3;
      if(!field3939) {
         if(field3881 != -1) {
            var1 = field3881;
            var2 = field3882;
            if((field3869 >= 2 || field3885 != 0 || field3887) && field3880) {
               var3 = field3869 - 1;
               String var11;
               if(field3885 == 1 && field3869 < 2) {
                  var11 = "Use" + " " + field3835 + " " + "->";
               } else if(field3887 && field3869 < 2) {
                  var11 = field3890 + " " + field3891 + " " + "->";
               } else {
                  var11 = class55.method991(var3);
               }

               if(field3869 > 2) {
                  var11 = var11 + class294.method5136(16777215) + " " + '/' + " " + (field3869 - 2) + " more options";
               }

               class246.field2467.method3533(var11, var1 + 4, var2 + 15, 16777215, 0, field3744 / 1000);
            }
         }
      } else {
         var1 = class170.field1571;
         var2 = class319.field3406;
         var3 = field3779;
         int var4 = class68.field631;
         int var5 = 6116423;
         class89.method1561(var1, var2, var3, var4, var5);
         class89.method1561(var1 + 1, var2 + 1, var3 - 2, 16, 0);
         class89.method1543(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
         class246.field2467.method3543("Choose Option", var1 + 3, var2 + 14, var5, -1);
         int var6 = class226.field2215;
         int var7 = class226.field2216;

         for(int var8 = 0; var8 < field3869; ++var8) {
            int var9 = (field3869 - 1 - var8) * 15 + var2 + 31;
            int var10 = 16777215;
            if(var6 > var1 && var6 < var3 + var1 && var7 > var9 - 13 && var7 < var9 + 3) {
               var10 = 16776960;
            }

            class246.field2467.method3543(class55.method991(var8), var1 + 3, var9, var10, 0);
         }

         class278.method4947(class170.field1571, class319.field3406, field3779, class68.field631);
      }

      if(field3944 == 3) {
         for(var1 = 0; var1 < field3935; ++var1) {
            if(field3747[var1]) {
               class89.method1539(field3901[var1], field3941[var1], field3942[var1], field3943[var1], 16711935, 128);
            } else if(field3866[var1]) {
               class89.method1539(field3901[var1], field3941[var1], field3942[var1], field3943[var1], 16711680, 128);
            }
         }
      }

      class2.method28(class315.plane, class5.field43.field1277, class5.field43.field1259, field3989);
      field3989 = 0;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1829775887"
   )
   protected final void vmethod6070() {
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-22347014"
   )
   protected final void vmethod5963(boolean var1) {
      this.methodDraw(var1);
      boolean var2 = class0.method11();
      if(var2 && field3972 && class153.field1468 != null) {
         class153.field1468.method639();
      }

      if((field3740 == 10 || field3740 == 20 || field3740 == 30) && field3945 != 0L && class234.method4170() > field3945) {
         class289.method5106(class319.method5597());
      }

      int var3;
      if(var1) {
         for(var3 = 0; var3 < 100; ++var3) {
            field3930[var3] = true;
         }
      }

      if(field3740 == 0) {
         this.method3054(class325.field3469, class325.field3481, var1);
      } else if(field3740 == 5) {
         class83.method1228(class246.field2467, class272.field2981, class9.field76, var1);
      } else if(field3740 != 10 && field3740 != 11) {
         if(field3740 == 20) {
            class83.method1228(class246.field2467, class272.field2981, class9.field76, var1);
         } else if(field3740 == 25) {
            if(field3789 == 1) {
               if(field3923 > field3786) {
                  field3786 = field3923;
               }

               var3 = (field3786 * 50 - field3923 * 50) / field3786;
               class319.method5587("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
            } else if(field3789 == 2) {
               if(field3781 > field3788) {
                  field3788 = field3781;
               }

               var3 = (field3788 * 50 - field3781 * 50) / field3788 + 50;
               class319.method5587("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
            } else {
               class319.method5587("Loading - please wait.", false);
            }
         } else if(field3740 == 30) {
            this.method6029();
         } else if(field3740 == 40) {
            class319.method5587("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
         } else if(field3740 == 45) {
            class319.method5587("Please wait...", false);
         }
      } else {
         class83.method1228(class246.field2467, class272.field2981, class9.field76, var1);
      }

      if(field3740 == 30 && field3944 == 0 && !var1 && !field3946) {
         for(var3 = 0; var3 < field3935; ++var3) {
            if(field3866[var3]) {
               class146.field1404.vmethod4919(field3901[var3], field3941[var3], field3942[var3], field3943[var3]);
               field3866[var3] = false;
            }
         }
      } else if(field3740 > 0) {
         class146.field1404.vmethod4918(0, 0);

         for(var3 = 0; var3 < field3935; ++var3) {
            field3866[var3] = false;
         }
      }

   }

   @ObfuscatedName("hv")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-41"
   )
   final void method6036(int var1, int var2) {
      this.menuOpened(var1, var2);
      class140.method2524(var1, var2);
      class258.field2566.method5502(class315.plane, var1, var2, false);
      field3939 = true;
   }

   @ObfuscatedName("kl")
   @ObfuscatedSignature(
      signature = "(I)Lka;",
      garbageValue = "-186448518"
   )
   public class49 vmethod5980() {
      return class5.field43 != null?class5.field43.field577:null;
   }

   @ObfuscatedName("it")
   @ObfuscatedSignature(
      signature = "(Lhw;B)V",
      garbageValue = "-36"
   )
   void method6330(class329 var1) {
      class329 var2 = var1.field3563 == -1?null:class189.getWidget(var1.field3563);
      int var3;
      int var4;
      if(var2 == null) {
         var3 = class47.field359;
         var4 = class330.field3689;
      } else {
         var3 = var2.field3559;
         var4 = var2.field3560;
      }

      class77.method1190(var1, var3, var4, false);
      class256.method4564(var1, var3, var4);
   }

   @ObfuscatedName("hl")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1630117902"
   )
   final boolean method5975() {
      int var1 = field3869 - 1;
      return (field3867 == 1 && field3869 > 2 || class205.method3502(var1)) && !field3906[var1];
   }

   @ObfuscatedName("fl")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1795154637"
   )
   void method5971() {
      int var1 = class47.field359;
      int var2 = class330.field3689;
      if(super.field1738 < var1) {
         var1 = super.field1738;
      }

      if(super.field1727 < var2) {
         var2 = super.field1727;
      }

      if(class153.field1455 != null) {
         try {
            class290.method5110(class113.field1064, "resize", new Object[]{Integer.valueOf(class319.method5597())});
         } catch (Throwable var4) {
            ;
         }
      }

   }

   @ObfuscatedName("gz")
   @ObfuscatedSignature(
      signature = "(Lcq;I)Z",
      garbageValue = "1163639042"
   )
   final boolean method5973(class121 var1) {
      class314 var2 = var1.method2248();
      class214 var3 = var1.field1156;
      if(var2 == null) {
         return false;
      } else {
         int var6;
         String var29;
         try {
            int var5;
            if(var1.field1151 == null) {
               if(var1.field1158) {
                  if(!var2.vmethod5527(1)) {
                     return false;
                  }

                  var2.vmethod5519(var1.field1156.field1074, 0, 1);
                  var1.field1159 = 0;
                  var1.field1158 = false;
               }

               var3.field1073 = 0;
               if(var3.method3791()) {
                  if(!var2.vmethod5527(1)) {
                     return false;
                  }

                  var2.vmethod5519(var1.field1156.field1074, 1, 1);
                  var1.field1159 = 0;
               }

               var1.field1158 = true;
               ServerProt[] var4 = class176.method2962();
               var5 = var3.method3770();
               if(var5 < 0 || var5 >= var4.length) {
                  throw new IOException(var5 + " " + var3.field1073);
               }

               var1.field1151 = var4[var5];
               var1.packetLength = var1.field1151.field2334;
            }

            if(var1.packetLength == -1) {
               if(!var2.vmethod5527(1)) {
                  return false;
               }

               var1.method2248().vmethod5519(var3.field1074, 0, 1);
               var1.packetLength = var3.field1074[0] & 255;
            }

            if(var1.packetLength == -2) {
               if(!var2.vmethod5527(2)) {
                  return false;
               }

               var1.method2248().vmethod5519(var3.field1074, 0, 2);
               var3.field1073 = 0;
               var1.packetLength = var3.readUnsignedShort();
            }

            if(!var2.vmethod5527(var1.packetLength)) {
               return false;
            }

            var3.field1073 = 0;
            var2.vmethod5519(var3.field1074, 0, var1.packetLength);
            var1.field1159 = 0;
            field3977.method698();
            var1.field1163 = var1.field1150;
            var1.field1150 = var1.field1161;
            var1.field1161 = var1.field1151;
            int var7;
            int var45;
            if(ServerProt.CAM_SHAKE == var1.field1151) {
               var45 = var3.readUnsignedByte();
               var5 = var3.readUnsignedByte();
               var6 = var3.readUnsignedByte();
               var7 = var3.readUnsignedByte();
               field3787[var45] = true;
               field3780[var45] = var5;
               field3979[var45] = var6;
               field3980[var45] = var7;
               field3981[var45] = 0;
               var1.field1151 = null;
               return true;
            }

            long var9;
            long var12;
            long var17;
            long var19;
            String var38;
            if(ServerProt.MESSAGE_CLANCHANNEL == var1.field1151) {
               var38 = var3.readString();
               var17 = var3.method1998();
               var19 = (long)var3.readUnsignedShort();
               var9 = (long)var3.method1909();
               class253 var42 = (class253)class297.method5176(class123.method2266(), var3.readUnsignedByte());
               var12 = var9 + (var19 << 32);
               boolean var44 = false;

               for(int var15 = 0; var15 < 100; ++var15) {
                  if(var12 == field3951[var15]) {
                     var44 = true;
                     break;
                  }
               }

               if(var42.field2513 && class295.field3180.method5818(new class49(var38, class36.field277))) {
                  var44 = true;
               }

               if(!var44 && field3908 == 0) {
                  field3951[field3952] = var12;
                  field3952 = (field3952 + 1) % 100;
                  String var21 = class207.method3524(class331.method5936(class148.method2613(var3)));
                  if(var42.field2506 != -1) {
                     class135.method2488(9, class67.method1147(var42.field2506) + var38, var21, class146.method2567(var17));
                  } else {
                     class135.method2488(9, var38, var21, class146.method2567(var17));
                  }
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.MESSAGE_PRIVATE == var1.field1151) {
               var38 = var3.readString();
               var17 = (long)var3.readUnsignedShort();
               var19 = (long)var3.method1909();
               class253 var22 = (class253)class297.method5176(class123.method2266(), var3.readUnsignedByte());
               long var10 = var19 + (var17 << 32);
               boolean var23 = false;

               for(int var13 = 0; var13 < 100; ++var13) {
                  if(var10 == field3951[var13]) {
                     var23 = true;
                     break;
                  }
               }

               if(class295.field3180.method5818(new class49(var38, class36.field277))) {
                  var23 = true;
               }

               if(!var23 && field3908 == 0) {
                  field3951[field3952] = var10;
                  field3952 = (field3952 + 1) % 100;
                  String var24 = class207.method3524(class331.method5936(class148.method2613(var3)));
                  byte var14;
                  if(var22.field2512) {
                     var14 = 7;
                  } else {
                     var14 = 3;
                  }

                  if(var22.field2506 != -1) {
                     ServerProt.method4172(var14, class67.method1147(var22.field2506) + var38, var24);
                  } else {
                     ServerProt.method4172(var14, var38, var24);
                  }
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.ATTACHED_PLAYER_OBJECT == var1.field1151) {
               class330.method5928(class251.ATTACHED_PLAYER_OBJECT);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.IF_OPENTOP == var1.field1151) {
               var45 = var3.readUnsignedShortLE128();
               field3892 = var45;
               this.method5977(false);
               class127.method2365(var45);
               class285.method5036(field3892, 1305326689);

               for(var5 = 0; var5 < 100; ++var5) {
                  field3930[var5] = true;
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.PLAYER_INFO == var1.field1151) {
               class311.updatePlayer(var3, var1.packetLength);
               class303.method5215();
               var1.field1151 = null;
               return true;
            }

            class329 var8;
            if(ServerProt.IF_SETANGLE == var1.field1151) {
               var45 = var3.readUnsignedShortLE128();
               var5 = var3.readUnsignedShortLE128();
               var6 = var3.readUnsignedShortLE128();
               var7 = var3.readIntV2();
               var8 = class189.getWidget(var7);
               if(var45 != var8.field3673 || var6 != var8.field3596 || var5 != var8.field3598) {
                  var8.field3673 = var45;//rotx
                  var8.field3596 = var6;//y
                  var8.field3598 = var5;//zoom
                  class184.method3216(var8);
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.REBUILD_REGION == var1.field1151) {
               class15.buildRegion(true, var1.field1156);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.SPOTANIM_SPECIFIC == var1.field1151) {
               class330.method5928(class251.SPOTANIM_SPECIFIC);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.field2337 == var1.field1151) {
               class295.field3180.method5813();
               field3983 = field3917;
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.UPDATE_RUNWEIGHT == var1.field1151) {
               class54.method895();
               weight = var3.readShort();
               field3929 = field3917;
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.NPC_INFO_LARGE == var1.field1151) {
               class284.updateNPCs(true, var3);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.CAM_POS == var1.field1151) {
               field3976 = true;
               class87.field800 = var3.readUnsignedByte();
               class314.field3380 = var3.readUnsignedByte();
               class190.field1813 = var3.readUnsignedShort();
               class153.field1456 = var3.readUnsignedByte();
               class322.field3447 = var3.readUnsignedByte();
               if(class322.field3447 >= 100) {
                  class83.field738 = class87.field800 * 128 + 64;
                  class50.field375 = class314.field3380 * 128 + 64;
                  class296.field3191 = class7.method85(class83.field738, class50.field375, class315.plane) - class190.field1813;
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.LOC_ADD == var1.field1151) {
               class330.method5928(class251.LOC_ADD);
               var1.field1151 = null;
               return true;
            }

            class329 var48;
            if(ServerProt.IF_SETOBJECT == var1.field1151) {
               var45 = var3.readInt();
               var5 = var3.readUnsignedShort();
               if(var5 == 65535) {
                  var5 = -1;
               }

               var6 = var3.readIntV2();
               var48 = class189.getWidget(var45);
               class120 var40;
               if(!var48.field3543) {
                  if(var5 == -1) {
                     var48.field3552 = 0;
                     var1.field1151 = null;
                     return true;
                  }

                  var40 = class67.method1152(var5);
                  var48.field3552 = 4;
                  var48.field3588 = var5;
                  var48.field3673 = var40.field1132;
                  var48.field3596 = var40.field1118;
                  var48.field3598 = var40.field1109 * 100 / var6;
                  class184.method3216(var48);
               } else {
                  var48.field3662 = var5;
                  var48.field3671 = var6;
                  var40 = class67.method1152(var5);
                  var48.field3673 = var40.field1132;
                  var48.field3596 = var40.field1118;
                  var48.field3657 = var40.field1112;
                  var48.field3593 = var40.field1099;
                  var48.field3594 = var40.field1111;
                  var48.field3598 = var40.field1109;
                  if(var40.field1108 == 1) {
                     var48.field3603 = 1;
                  } else {
                     var48.field3603 = 2;
                  }

                  if(var48.field3599 > 0) {
                     var48.field3598 = var48.field3598 * 32 / var48.field3599;
                  } else if(var48.field3555 > 0) {
                     var48.field3598 = var48.field3598 * 32 / var48.field3555;
                  }

                  class184.method3216(var48);
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.LOGOUT == var1.field1151) {
               class80.method1219();
               var1.field1151 = null;
               return false;
            }

            if(ServerProt.IF_SETPOSITION == var1.field1151) {
               var45 = var3.readIntV1();
               var5 = var3.readShortLE128();
               var6 = var3.readShortLE();
               var48 = class189.getWidget(var45);
               if(var6 != var48.field3611 || var5 != var48.field3554 || var48.field3571 != 0 || var48.field3545 != 0) {
                  var48.field3611 = var6;
                  var48.field3554 = var5;
                  var48.field3571 = 0;
                  var48.field3545 = 0;
                  class184.method3216(var48);
                  this.method6330(var48);
                  if(var48.field3546 == 0) {
                     class130.method2395(class329.field3533[var45 >> 16], var48, false);
                  }
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.SET_PRIVATE_CHAT_FILTER == var1.field1151) {
               class83.field750 = class138.method2516(var3.readUnsignedByte());
               var1.field1151 = null;
               return true;
            }

            class45 var47;
            if(ServerProt.IF_OPENSUB == var1.field1151) {
               var45 = var3.readUnsignedByte128();
               var5 = var3.readIntV1();
               var6 = var3.readUnsignedShortLE128();
               var47 = (class45)field3991.method5310((long)var5);
               if(var47 != null) {
                  class198.method3355(var47, var6 != var47.field351);
               }

               class184.method3217(var5, var6, var45);
               var1.field1151 = null;
               return true;
            }

            int var26;
            int var27;
            if(ServerProt.IF_SETTEXTCOLOUR == var1.field1151) {
               var45 = var3.readIntV1();
               var5 = var3.readUnsignedShort128();
               var6 = var5 >> 10 & 31;
               var7 = var5 >> 5 & 31;
               var26 = var5 & 31;
               var27 = (var7 << 11) + (var6 << 19) + (var26 << 3);
               class329 var49 = class189.getWidget(var45);
               if(var27 != var49.field3619) {
                  var49.field3619 = var27;
                  class184.method3216(var49);
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.SET_MINIMAP_STATE == var1.field1151) {
               minimapState = var3.readUnsignedByte();
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.IF_SETTARGETPARAM == var1.field1151) {
               var45 = var3.readIntLE();
               var5 = var3.readUnsignedShort128();
               if(var5 == 65535) {
                  var5 = -1;
               }

               var6 = var3.readIntV2();
               var7 = var3.readUnsignedShort();
               if(var7 == 65535) {
                  var7 = -1;
               }

               for(var26 = var7; var26 <= var5; ++var26) {
                  var9 = (long)var26 + ((long)var6 << 32);
                  class76 var11 = field3934.method5310(var9);
                  if(var11 != null) {
                     var11.method1186();
                  }

                  field3934.method5309(new class262(var45), var9);
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.UPDATE_ZONE_FULL_FOLLOWS == var1.field1151) {
               class232.field2288 = var3.readUnsigned128Byte();
               class106.field992 = var3.readUnsignedByteC();

               while(var3.field1073 < var1.packetLength) {
                  var45 = var3.readUnsignedByte();
                  class251 var58 = class2.method29()[var45];
                  class330.method5928(var58);
               }

               var1.field1151 = null;
               return true;
            }

            class329 var51;
            if(ServerProt.IF_CLEARITEMS == var1.field1151) {
               var45 = var3.readIntV1();
               var51 = class189.getWidget(var45);

               for(var6 = 0; var6 < var51.field3668.length; ++var6) {
                  var51.field3668[var6] = -1;
                  var51.field3668[var6] = 0;
               }

               class184.method3216(var51);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.UPDATE_RUNENERGY == var1.field1151) {
               class54.method895();
               energy = var3.readUnsignedByte();
               field3929 = field3917;
               var1.field1151 = null;
               return true;
            }

            class329 var30;
            if(ServerProt.UPDATE_INV_PARTIAL == var1.field1151) {
               var45 = var3.readInt();
               var5 = var3.readUnsignedShort();
               if(var45 < -70000) {
                  var5 += 32768;
               }

               if(var45 >= 0) {
                  var30 = class189.getWidget(var45);
               } else {
                  var30 = null;
               }

               for(; var3.field1073 < var1.packetLength; class322.method5704(var5, var7, var26 - 1, var27)) {
                  var7 = var3.readSmart();
                  var26 = var3.readUnsignedShort();
                  var27 = 0;
                  if(var26 != 0) {
                     var27 = var3.readUnsignedByte();
                     if(var27 == 255) {
                        var27 = var3.readInt();
                     }
                  }

                  if(var30 != null && var7 >= 0 && var7 < var30.field3668.length) {
                     var30.field3668[var7] = var26;
                     var30.field3682[var7] = var27;
                  }
               }

               if(var30 != null) {
                  class184.method3216(var30);
               }

               class54.method895();
               field3756[++field3921 - 1 & 31] = var5 & 32767;
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.CAM_RESET == var1.field1151) {
               field3976 = false;

               for(var45 = 0; var45 < 5; ++var45) {
                  field3787[var45] = false;
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.CLANCHANNEL_MEMBER == var1.field1151) {
               if(class165.field1533 != null) {
                  class165.field1533.method2982(var3);
               }

               class195.method3304();
               var1.field1151 = null;
               return true;
            }

            boolean var43;
            String var52;
            if(ServerProt.MESSAGE_GAME == var1.field1151) {
               var45 = var3.readSmart();
               var43 = var3.readUnsignedByte() == 1;
               var52 = "";
               boolean var41 = false;
               if(var43) {
                  var52 = var3.readString();
                  if(class295.field3180.method5818(new class49(var52, class36.field277))) {
                     var41 = true;
                  }
               }

               String var39 = var3.readString();
               if(!var41) {
                  ServerProt.method4172(var45, var52, var39);
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.SET_PLAYER_OP == var1.field1151) {
               var45 = var3.readUnsignedByte128();
               var5 = var3.readUnsignedByte128();
               var52 = var3.readString();
               if(var5 >= 1 && var5 <= 8) {
                  if(var52.equalsIgnoreCase("null")) {
                     var52 = null;
                  }

                  field3856[var5 - 1] = var52;
                  playerOptionsChanged(var5 - 1);
                  field3857[var5 - 1] = var45 == 0;
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.UPDATE_FRIENDLIST == var1.field1151) {
               class295.field3180.method5814(var3, var1.packetLength);
               field3983 = field3917;
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.field2386 == var1.field1151) {
               class252.method4518(var3.readString());
               var1.field1151 = null;
               return true;
            }

            int var31;
            if(ServerProt.UPDATE_INV_FULL == var1.field1151) {
               var45 = var3.readInt();
               var5 = var3.readUnsignedShort();
               if(var45 < -70000) {
                  var5 += 32768;
               }

               if(var45 >= 0) {
                  var30 = class189.getWidget(var45);
               } else {
                  var30 = null;
               }

               if(var30 != null) {
                  for(var7 = 0; var7 < var30.field3668.length; ++var7) {
                     var30.field3668[var7] = 0;
                     var30.field3682[var7] = 0;
                  }
               }

               class319.method5596(var5);
               var7 = var3.readUnsignedShort();

               for(var26 = 0; var26 < var7; ++var26) {
                  var27 = var3.readUnsignedShort();
                  var31 = var3.readUnsignedByte();
                  if(var31 == 255) {
                     var31 = var3.readIntV2();
                  }

                  if(var30 != null && var26 < var30.field3668.length) {
                     var30.field3668[var26] = var27;
                     var30.field3682[var26] = var31;
                  }

                  class322.method5704(var5, var26, var27 - 1, var31);
               }

               if(var30 != null) {
                  class184.method3216(var30);
               }

               class54.method895();
               field3756[++field3921 - 1 & 31] = var5 & 32767;
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.MAP_PROJANIM == var1.field1151) {
               class330.method5928(class251.MAP_PROJANIM);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.field2349 == var1.field1151) {
               var45 = var3.readUnsignedShort128();
               var5 = var3.readUnsignedShortLE();
               var6 = var3.readIntV1();
               var48 = class189.getWidget(var6);
               var48.field3600 = var45 + (var5 << 16);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.field2345 == var1.field1151) {
               for(var45 = 0; var45 < class309.field3288; ++var45) {
                  class309 var56 = class199.method3366(var45);
                  if(var56 != null) {
                     class215.field2069[var45] = 0;
                     class215.field2071[var45] = 0;
                     settingsChanged(var45);
                  }
               }

               class54.method895();
               field3919 += 32;
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.OBJ_ADD == var1.field1151) {
               class330.method5928(class251.OBJ_ADD);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.VARP_LARGE == var1.field1151) {
               var45 = var3.readUnsignedShort();
               var5 = var3.readInt();
               class215.field2069[var45] = var5;
               if(class215.field2071[var45] != var5) {
                  class215.field2071[var45] = var5;
                  settingsChanged(var45);
               }

               class261.method4673(var45);
               field3918[++field3919 - 1 & 31] = var45;
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.IF_SETANIM == var1.field1151) {
               var45 = var3.readShort();
               var5 = var3.readIntV2();
               var30 = class189.getWidget(var5);
               if(var45 != var30.field3591 || var45 == -1) {
                  var30.field3591 = var45;
                  var30.field3672 = 0;
                  var30.field3649 = 0;
                  class184.method3216(var30);
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.field2357 == var1.field1151) {
               var45 = var3.field1073 + var1.packetLength;
               var5 = var3.readUnsignedShort();
               var6 = var3.readUnsignedShort();
               if(var5 != field3892) {
                  field3892 = var5;
                  this.method5977(false);
                  class127.method2365(field3892);
                  class285.method5036(field3892, -148985526);

                  for(var7 = 0; var7 < 100; ++var7) {
                     field3930[var7] = true;
                  }
               }

               class45 var28;
               for(; var6-- > 0; var28.field349 = true) {
                  var7 = var3.readInt();
                  var26 = var3.readUnsignedShort();
                  var27 = var3.readUnsignedByte();
                  var28 = (class45)field3991.method5310((long)var7);
                  if(var28 != null && var26 != var28.field351) {
                     class198.method3355(var28, true);
                     var28 = null;
                  }

                  if(var28 == null) {
                     var28 = class184.method3217(var7, var26, var27);
                  }
               }

               for(var47 = (class45)field3991.method5317(); var47 != null; var47 = (class45)field3991.method5313()) {
                  if(var47.field349) {
                     var47.field349 = false;
                  } else {
                     class198.method3355(var47, true);
                  }
               }

               field3934 = new class310(512);

               while(var3.field1073 < var45) {
                  var7 = var3.readInt();
                  var26 = var3.readUnsignedShort();
                  var27 = var3.readUnsignedShort();
                  var31 = var3.readInt();

                  for(int var32 = var26; var32 <= var27; ++var32) {
                     var12 = ((long)var7 << 32) + (long)var32;
                     field3934.method5309(new class262(var31), var12);
                  }
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.IF_CLOSESUB == var1.field1151) {
               var45 = var3.readInt();
               class45 var55 = (class45)field3991.method5310((long)var45);
               if(var55 != null) {
                  class198.method3355(var55, true);
               }

               if(field3898 != null) {
                  class184.method3216(field3898);
                  field3898 = null;
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.FREECAM == var1.field1151) {
               var45 = var3.readUnsignedByte();
               class251.method4507(var45);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.CAM_LOOKAT == var1.field1151) {
               field3976 = true;
               class328.field3528 = var3.readUnsignedByte();
               class168.field1557 = var3.readUnsignedByte();
               class227.field2235 = var3.readUnsignedShort();
               class279.field3026 = var3.readUnsignedByte();
               class192.field1839 = var3.readUnsignedByte();
               if(class192.field1839 >= 100) {
                  var45 = class328.field3528 * 128 + 64;
                  var5 = class168.field1557 * 128 + 64;
                  var6 = class7.method85(var45, var5, class315.plane) - class227.field2235;
                  var7 = var45 - class83.field738;
                  var26 = var6 - class296.field3191;
                  var27 = var5 - class50.field375;
                  var31 = (int)Math.sqrt((double)(var7 * var7 + var27 * var27));
                  field4009 = (int)(Math.atan2((double)var26, (double)var31) * 325.949D) & 2047;
                  onCameraPitchChanged(-1);
                  class61.field469 = (int)(Math.atan2((double)var7, (double)var27) * -325.949D) & 2047;
                  if(field4009 < 128) {
                     field4009 = 128;
                     onCameraPitchChanged(-1);
                  }

                  if(field4009 > 383) {
                     field4009 = 383;
                     onCameraPitchChanged(-1);
                  }
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.AREA_SOUND == var1.field1151) {
               class330.method5928(class251.AREA_SOUND);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.field2360 == var1.field1151) {
               if(field3892 != -1) {
                  class161.method2770(field3892, 0);
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.IF_SETHIDE == var1.field1151) {
               var45 = var3.readInt();
               var43 = var3.readUnsignedByte() == 1;
               var30 = class189.getWidget(var45);
               if(var43 != var30.field3569) {
                  var30.field3569 = var43;
                  var30.onHiddenChanged(-1);
                  class184.method3216(var30);
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.UPDATE_ZONE_PARTIAL_FOLLOWS == var1.field1151) {
               class106.field992 = var3.readUnsignedByteC();
               class232.field2288 = var3.readUnsigned128Byte();
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.field2384 == var1.field1151) {
               var3.field1073 += 28;
               if(var3.method1930()) {
                  class150.method2692(var3, var3.field1073 - 28);
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.RESET_CONTAINER == var1.field1151) {
               var45 = var3.readUnsignedShortLE();
               class275.method4911(var45);
               field3756[++field3921 - 1 & 31] = var45 & 32767;
               var1.field1151 = null;
               return true;
            }

            boolean var46;
            if(ServerProt.field2335 == var1.field1151) {
               var46 = var3.readUnsignedByte() == 1;
               if(var46) {
                  class11.field100 = class234.method4170() - var3.method1998();
                  class29.field225 = new class170(var3, true);
               } else {
                  class29.field225 = null;
               }

               field3928 = field3917;
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.IF_MOVESUB == var1.field1151) {
               var45 = var3.readInt();
               var5 = var3.readInt();
               class45 var57 = (class45)field3991.method5310((long)var5);
               var47 = (class45)field3991.method5310((long)var45);
               if(var47 != null) {
                  class198.method3355(var47, var57 == null || var47.field351 != var57.field351);
               }

               if(var57 != null) {
                  var57.method1186();
                  field3991.method5309(var57, (long)var45);
               }

               var8 = class189.getWidget(var5);
               if(var8 != null) {
                  class184.method3216(var8);
               }

               var8 = class189.getWidget(var45);
               if(var8 != null) {
                  class184.method3216(var8);
                  class130.method2395(class329.field3533[var8.field3607 >>> 16], var8, true);
               }

               if(field3892 != -1) {
                  class161.method2770(field3892, 1);
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.IF_SETMODEL == var1.field1151) {
               var45 = var3.readIntV2();
               var5 = var3.readUnsignedShortLE128();
               var30 = class189.getWidget(var45);
               if(var30.field3552 != 1 || var5 != var30.field3588) {
                  var30.field3552 = 1;
                  var30.field3588 = var5;
                  class184.method3216(var30);
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.NPC_INFO_SMALL == var1.field1151) {
               class284.updateNPCs(false, var3);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.SET_HINTARROW == var1.field1151) {
               field3752 = var3.readUnsignedByte();
               if(field3752 == 1) {
                  field3859 = var3.readUnsignedShort();
               }

               if(field3752 >= 2 && field3752 <= 6) {
                  if(field3752 == 2) {
                     field3758 = 64;
                     field3759 = 64;
                  }

                  if(field3752 == 3) {
                     field3758 = 0;
                     field3759 = 64;
                  }

                  if(field3752 == 4) {
                     field3758 = 128;
                     field3759 = 64;
                  }

                  if(field3752 == 5) {
                     field3758 = 64;
                     field3759 = 0;
                  }

                  if(field3752 == 6) {
                     field3758 = 64;
                     field3759 = 128;
                  }

                  field3752 = 2;
                  field3755 = var3.readUnsignedShort();
                  field3899 = var3.readUnsignedShort();
                  field4002 = var3.readUnsignedByte();
               }

               if(field3752 == 10) {
                  field3799 = var3.readUnsignedShort();
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.UPDATE_IGNORELIST == var1.field1151) {
               class295.field3180.field3522.method2534(var3, var1.packetLength);
               class156.method2736();
               field3983 = field3917;
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.OBJ_DEL == var1.field1151) {
               class330.method5928(class251.OBJ_DEL);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.field2352 == var1.field1151) {
               var45 = var3.readIntV2();
               var5 = var3.readUnsignedShortLE128();
               var30 = class189.getWidget(var45);
               if(var30 != null && var30.field3546 == 0) {
                  if(var5 > var30.field3568 - var30.field3560) {
                     var5 = var30.field3568 - var30.field3560;
                  }

                  if(var5 < 0) {
                     var5 = 0;
                  }

                  if(var5 != var30.field3566) {
                     var30.field3566 = var5;
                     class184.method3216(var30);
                  }
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.MESSAGE_PRIVATE_ECHO == var1.field1151) {
               var38 = var3.readString();
               var29 = class207.method3524(class331.method5936(class148.method2613(var3)));
               ServerProt.method4172(6, var38, var29);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.MIDI_SONG == var1.field1151) {
               var45 = var3.readUnsignedShortLE128();
               if(var45 == 65535) {
                  var45 = -1;
               }

               class184.method3218(var45);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.MIDI_SONG_LOCATION == var1.field1151) {
               var45 = var3.readMedium();
               var5 = var3.readUnsignedShort128();
               if(var5 == 65535) {
                  var5 = -1;
               }

               class135.method2500(var5, var45);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.field2369 == var1.field1151) {
               var45 = var3.readInt();
               if(var45 != field3814) {
                  field3814 = var45;
                  class67.method1146();
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.OBJ_UPDATE == var1.field1151) {
               class330.method5928(class251.OBJ_UPDATE);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.REBUILD_NORMAL == var1.field1151) {
               class15.buildRegion(false, var1.field1156);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.LOC_ANIM == var1.field1151) {
               class330.method5928(class251.LOC_ANIM);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.IF_SETNPCHEAD == var1.field1151) {
               var45 = var3.readUnsignedShortLE128();
               var5 = var3.readIntV2();
               var30 = class189.getWidget(var5);
               if(var30.field3552 != 2 || var45 != var30.field3588) {
                  var30.field3552 = 2;
                  var30.field3588 = var45;
                  class184.method3216(var30);
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.field2381 == var1.field1151) {
               for(var45 = 0; var45 < class215.field2071.length; ++var45) {
                  if(class215.field2071[var45] != class215.field2069[var45]) {
                     class215.field2071[var45] = class215.field2069[var45];
                     settingsChanged(var45);
                     class261.method4673(var45);
                     field3918[++field3919 - 1 & 31] = var45;
                  }
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.field2311 == var1.field1151) {
               var46 = var3.method2088();
               if(var46) {
                  if(class263.field2912 == null) {
                     class263.field2912 = new class219();
                  }
               } else {
                  class263.field2912 = null;
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.RUN_CLIENTSCRIPT == var1.field1151) {
               var38 = var3.readString();
               Object[] var53 = new Object[var38.length() + 1];

               for(var6 = var38.length() - 1; var6 >= 0; --var6) {
                  if(var38.charAt(var6) == 's') {
                     var53[var6 + 1] = var3.readString();
                  } else {
                     var53[var6 + 1] = new Integer(var3.readInt());
                  }
               }

               var53[0] = new Integer(var3.readInt());
               class9 var54 = new class9();
               var54.field69 = var53;
               class240.method4263(var54);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.SEND_PING == var1.field1151) {
               var45 = var3.readInt();
               var5 = var3.readInt();
               var6 = class315.method5542();
               class279 var25 = class95.writeClientProt(ClientProt.PING_STATISTICS, field3963.field1162);
               var25.field3018.writeByteC(var6);
               var25.field3018.writeByte(class181.field1725);
               var25.field3018.writeIntV1(var45);
               var25.field3018.writeIntLE(var5);
               field3963.method2235(var25);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.SET_CHAT_FILTER == var1.field1151) {
               field3937 = var3.readUnsignedByteC();
               publicChatMode = var3.readUnsignedByteC();
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.UPDATE_STAT == var1.field1151) {
               class54.method895();
               var45 = var3.readIntLE();
               var5 = var3.readUnsignedByteC();
               var6 = var3.readUnsignedByte();
               field3797[var5] = var45;
               experiencedChanged(var5);
               field3940[var5] = var6;
               boostedSkillLevelsChanged(var5);
               field3865[var5] = 1;

               for(var7 = 0; var7 < 98; ++var7) {
                  if(var45 >= class137.field1361[var7]) {
                     field3865[var5] = var7 + 2;
                  }
               }

               field3868[++field3995 - 1 & 31] = var5;
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.SYNTH_SOUND == var1.field1151) {
               var45 = var3.readUnsignedShort();
               var5 = var3.readUnsignedByte();
               var6 = var3.readUnsignedShort();
               class192.method3287(var45, var5, var6);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.IF_SETPLAYERHEAD == var1.field1151) {
               var45 = var3.readIntV2();
               var51 = class189.getWidget(var45);
               var51.field3552 = 3;
               var51.field3588 = class5.field43.field576.method770();
               class184.method3216(var51);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.field2326 == var1.field1151) {
               byte[] var37 = new byte[var1.packetLength];
               var3.method3753(var37, 0, var37.length);
               Buffer var50 = new Buffer(var37);
               var52 = var50.readString();
               class112.method1875(var52, true, false);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.FULL_SEQUENCE_RESET == var1.field1151) {
               for(var45 = 0; var45 < field3848.length; ++var45) {
                  if(field3848[var45] != null) {
                     field3848[var45].field1273 = -1;
                     field3848[var45].animationChanged(-1);
                  }
               }

               for(var45 = 0; var45 < field3774.length; ++var45) {
                  if(field3774[var45] != null) {
                     field3774[var45].field1273 = -1;
                     field3774[var45].animationChanged(-1);
                  }
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.CLANCHANNEL_FULL == var1.field1151) {
               if(var1.packetLength == 0) {
                  class165.field1533 = null;
                  clanMemberManagerChanged(-1);
               } else {
                  if(class165.field1533 == null) {
                     class165.field1533 = new class178(class36.field277, class113.field1064);
                     clanMemberManagerChanged(-1);
                  }

                  class165.field1533.method2981(var3);
               }

               class195.method3304();
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.GRAND_EXCHANGE_OFFER == var1.field1151) {
               var45 = var3.readUnsignedByte();
               if(var3.readUnsignedByte() == 0) {
                  field3999[var45] = new class150();
                  onGrandExchangeOffersChanged(var45);
                  var3.field1073 += 18;
               } else {
                  --var3.field1073;
                  field3999[var45] = new class150(var3, false);
                  onGrandExchangeOffersChanged(var45);
               }

               field3927 = field3917;
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.SET_MAP_FLAG == var1.field1151) {
               field3795 = var3.readUnsignedByte();
               if(field3795 == 255) {
                  field3795 = 0;
               }

               field3993 = var3.readUnsignedByte();
               if(field3993 == 255) {
                  field3993 = 0;
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.field2317 == var1.field1151) {
               class188.method3240(var3, var1.packetLength);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.IF_SETTEXT == var1.field1151) {
               var45 = var3.readInt();
               var29 = var3.readString();
               var30 = class189.getWidget(var45);
               if(!var29.equals(var30.field3605)) {
                  var30.field3605 = var29;
                  class184.method3216(var30);
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.LOC_DEL == var1.field1151) {
               class330.method5928(class251.LOC_DEL);
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.OBJ_CHUNK_CLEAR == var1.field1151) {
               class232.field2288 = var3.readUnsignedByteC();
               class106.field992 = var3.readUnsignedByte();

               for(var45 = class106.field992; var45 < class106.field992 + 8; ++var45) {
                  for(var5 = class232.field2288; var5 < class232.field2288 + 8; ++var5) {
                     if(field3761[class315.plane][var45][var5] != null) {
                        field3761[class315.plane][var45][var5] = null;
                        class57.method1018(var45, var5);
                     }
                  }
               }

               for(class274 var36 = (class274)field3861.method5604(); var36 != null; var36 = (class274)field3861.method5606()) {
                  if(var36.field2992 >= class106.field992 && var36.field2992 < class106.field992 + 8 && var36.field2993 >= class232.field2288 && var36.field2993 < class232.field2288 + 8 && var36.field2998 == class315.plane) {
                     var36.field2999 = 0;
                  }
               }

               var1.field1151 = null;
               return true;
            }

            if(ServerProt.field2355 == var1.field1151) {
               class126 var35 = new class126();
               var35.field1195 = var3.readString();
               var35.field1198 = var3.readUnsignedShort();
               var5 = var3.readInt();
               var35.field1193 = var5;
               class188.method3239(45);
               var2.vmethod5521();
               var2 = null;
               class86.method1252(var35);
               var1.field1151 = null;
               return false;
            }

            if(ServerProt.UPDATE_REBOOT_TIMER == var1.field1151) {
               field3751 = var3.readUnsignedShort() * 30;
               field3929 = field3917;
               var1.field1151 = null;
               return true;
            }

            if(ServerProt.VARP_SMALL == var1.field1151) {
               byte var16 = var3.readByte128();
               var5 = var3.readUnsignedShort128();
               class215.field2069[var5] = var16;
               if(class215.field2071[var5] != var16) {
                  class215.field2071[var5] = var16;
                  settingsChanged(var5);
               }

               class261.method4673(var5);
               field3918[++field3919 - 1 & 31] = var5;
               var1.field1151 = null;
               return true;
            }

            class295.method5145("" + (var1.field1151 != null?var1.field1151.field2393:-1) + "," + (var1.field1150 != null?var1.field1150.field2393:-1) + "," + (var1.field1163 != null?var1.field1163.field2393:-1) + "," + var1.packetLength, (Throwable)null, -1953733731);
            class80.method1219();
         } catch (IOException var33) {
            class223.method3995();
         } catch (Exception var34) {
            var29 = "" + (var1.field1151 != null?var1.field1151.field2393:-1) + "," + (var1.field1150 != null?var1.field1150.field2393:-1) + "," + (var1.field1163 != null?var1.field1163.field2393:-1) + "," + var1.packetLength + "," + (class5.field43.field1288[0] + class296.somex) + "," + (class5.field43.field1315[0] + class284.somey) + ",";

            for(var6 = 0; var6 < var1.packetLength && var6 < 50; ++var6) {
               var29 = var29 + var3.field1074[var6] + ",";
            }

            class295.method5145(var29, var34, 699505788);
            class80.method1219();
         }

         return true;
      }
   }

   @ObfuscatedName("fk")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-36"
   )
   final void method5969() {
      if(field3751 > 1) {
         --field3751;
      }

      if(field3877 > 0) {
         --field3877;
      }

      if(field4000) {
         field4000 = false;
         class223.method3995();
      } else {
         if(!field3939) {
            class5.method69();
         }

         int var1;
         for(var1 = 0; var1 < 100 && this.method5973(field3963); ++var1) {
            ;
         }

         if(field3740 == 30) {
            int var2;
            class279 var14;
            while(class182.method3193()) {
               var14 = class95.writeClientProt(ClientProt.field562, field3963.field1162);
               var14.field3018.writeByte(0);
               var2 = var14.field3018.field1073;
               class313.method5514(var14.field3018);
               var14.field3018.method1903(var14.field3018.field1073 - var2);
               field3963.method2235(var14);
            }

            if(field3977.field321) {
               var14 = class95.writeClientProt(ClientProt.LOGIN_INFO, field3963.field1162);
               var14.field3018.writeByte(0);
               var2 = var14.field3018.field1073;
               field3977.method704(var14.field3018);
               var14.field3018.method1903(var14.field3018.field1073 - var2);
               field3963.method2235(var14);
               field3977.method702();
            }

            Object var35 = class322.field3442.field3015;
            int var3;
            int var4;
            int var5;
            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            synchronized(class322.field3442.field3015) {
               if(!field3731) {
                  class322.field3442.field3013 = 0;
               } else if(class226.field2222 != 0 || class322.field3442.field3013 >= 40) {
                  class279 var15 = null;
                  var3 = 0;
                  var4 = 0;
                  var5 = 0;
                  var6 = 0;

                  for(var7 = 0; var7 < class322.field3442.field3013 && (var15 == null || var15.field3018.field1073 - var3 < 246); ++var7) {
                     var4 = var7;
                     var8 = class322.field3442.field3011[var7];
                     if(var8 < -1) {
                        var8 = -1;
                     } else if(var8 > 65534) {
                        var8 = 65534;
                     }

                     var9 = class322.field3442.field3014[var7];
                     if(var9 < -1) {
                        var9 = -1;
                     } else if(var9 > 65534) {
                        var9 = 65534;
                     }

                     if(var9 != field3746 || var8 != field3730) {
                        if(var15 == null) {
                           var15 = class95.writeClientProt(ClientProt.EVENT_MOUSE_MOVE, field3963.field1162);
                           var15.field3018.writeByte(0);
                           var3 = var15.field3018.field1073;
                           var15.field3018.field1073 += 2;
                           var5 = 0;
                           var6 = 0;
                        }

                        if(field3748 != -1L) {
                           var10 = var9 - field3746;
                           var11 = var8 - field3730;
                           var12 = (int)((class322.field3442.field3012[var7] - field3748) / 20L);
                           var5 = (int)((long)var5 + (class322.field3442.field3012[var7] - field3748) % 20L);
                        } else {
                           var10 = var9;
                           var11 = var8;
                           var12 = Integer.MAX_VALUE;
                        }

                        field3746 = var9;
                        field3730 = var8;
                        if(var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                           var10 += 32;
                           var11 += 32;
                           var15.field3018.writeShort((var12 << 12) + var11 + (var10 << 6));
                        } else if(var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
                           var10 += 128;
                           var11 += 128;
                           var15.field3018.writeByte(var12 + 128);
                           var15.field3018.writeShort(var11 + (var10 << 8));
                        } else if(var12 < 32) {
                           var15.field3018.writeByte(var12 + 192);
                           if(var9 != -1 && var8 != -1) {
                              var15.field3018.writeInt(var9 | var8 << 16);
                           } else {
                              var15.field3018.writeInt(Integer.MIN_VALUE);
                           }
                        } else {
                           var15.field3018.writeShort((var12 & 8191) + 57344);
                           if(var9 != -1 && var8 != -1) {
                              var15.field3018.writeInt(var9 | var8 << 16);
                           } else {
                              var15.field3018.writeInt(Integer.MIN_VALUE);
                           }
                        }

                        ++var6;
                        field3748 = class322.field3442.field3012[var7];
                     }
                  }

                  if(var15 != null) {
                     var15.field3018.method1903(var15.field3018.field1073 - var3);
                     var7 = var15.field3018.field1073;
                     var15.field3018.field1073 = var3;
                     var15.field3018.writeByte(var5 / var6);
                     var15.field3018.writeByte(var5 % var6);
                     var15.field3018.field1073 = var7;
                     field3963.method2235(var15);
                  }

                  if(var4 >= class322.field3442.field3013) {
                     class322.field3442.field3013 = 0;
                  } else {
                     class322.field3442.field3013 -= var4;
                     System.arraycopy(class322.field3442.field3014, var4, class322.field3442.field3014, 0, class322.field3442.field3013);
                     System.arraycopy(class322.field3442.field3011, var4, class322.field3442.field3011, 0, class322.field3442.field3013);
                     System.arraycopy(class322.field3442.field3012, var4, class322.field3442.field3012, 0, class322.field3442.field3013);
                  }
               }
            }

            class279 var18;
            if(class226.field2222 == 1 || !class192.field1840 && class226.field2222 == 4 || class226.field2222 == 2) {
               long var16 = (class226.field2225 - field3745 * -1L) / 50L;
               if(var16 > 4095L) {
                  var16 = 4095L;
               }

               field3745 = class226.field2225 * -1L;
               var3 = class226.field2224;
               if(var3 < 0) {
                  var3 = 0;
               } else if(var3 > class330.field3689) {
                  var3 = class330.field3689;
               }

               var4 = class226.field2220;
               if(var4 < 0) {
                  var4 = 0;
               } else if(var4 > class47.field359) {
                  var4 = class47.field359;
               }

               var5 = (int)var16;
               var18 = class95.writeClientProt(ClientProt.EVENT_MOUSE_CLICK, field3963.field1162);
               var18.field3018.writeShort((var5 << 1) + (class226.field2222 == 2?1:0));
               var18.field3018.writeShort(var4);
               var18.field3018.writeShort(var3);
               field3963.method2235(var18);
            }

            if(class135.field1339 > 0) {
               var14 = class95.writeClientProt(ClientProt.EVENT_KEYBOARD, field3963.field1162);
               var14.field3018.writeShort(0);
               var2 = var14.field3018.field1073;
               long var19 = class234.method4170();

               for(var5 = 0; var5 < class135.field1339; ++var5) {
                  long var21 = var19 - field3956;
                  if(var21 > 16777215L) {
                     var21 = 16777215L;
                  }

                  field3956 = var19;
                  var14.field3018.writeByteC(class135.field1338[var5]);
                  var14.field3018.writeMedium((int)var21);
               }

               var14.field3018.method1902(var14.field3018.field1073 - var2);
               field3963.method2235(var14);
            }

            if(field3793 > 0) {
               --field3793;
            }

            if(class135.field1332[96] || class135.field1332[97] || class135.field1332[98] || class135.field1332[99]) {
               field3817 = true;
            }

            if(field3817 && field3793 <= 0) {
               field3793 = 20;
               field3817 = false;
               var14 = class95.writeClientProt(ClientProt.CAMERA_POSITION, field3963.field1162);
               var14.field3018.writeShortLE128(field3801);
               var14.field3018.writeShortLE(field3802);
               field3963.method2235(var14);
            }

            if(class239.field2411 && !field3757) {
               field3757 = true;
               var14 = class95.writeClientProt(ClientProt.EVENT_APPLET_FOCUS, field3963.field1162);
               var14.field3018.writeByte(1);
               field3963.method2235(var14);
            }

            if(!class239.field2411 && field3757) {
               field3757 = false;
               var14 = class95.writeClientProt(ClientProt.EVENT_APPLET_FOCUS, field3963.field1162);
               var14.field3018.writeByte(0);
               field3963.method2235(var14);
            }

            if(class63.field587 != null) {
               class63.field587.method1331();
            }

            if(class248.field2473) {
               if(class165.field1533 != null) {
                  class165.field1533.method3633();
               }

               for(var1 = 0; var1 < class11.field90; ++var1) {
                  class63 var38 = field3848[class11.field91[var1]];
                  var38.method1092();
               }

               class248.field2473 = false;
            }

            if(class315.plane != field3773) {
               field3773 = class315.plane;
               var1 = class315.plane;
               int[] var39 = class5.field44.field203;
               var3 = var39.length;

               for(var4 = 0; var4 < var3; ++var4) {
                  var39[var4] = 0;
               }

               for(var4 = 1; var4 < 103; ++var4) {
                  var5 = (103 - var4) * 2048 + 24628;

                  for(var6 = 1; var6 < 103; ++var6) {
                     if((class31.field239[var1][var6][var4] & 24) == 0) {
                        class258.field2566.method5365(var39, var5, 512, var1, var6, var4);
                     }

                     if(var1 < 3 && (class31.field239[var1 + 1][var6][var4] & 8) != 0) {
                        class258.field2566.method5365(var39, var5, 512, var1 + 1, var6, var4);
                     }

                     var5 += 4;
                  }
               }

               var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
               var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
               class5.field44.method467();

               for(var6 = 1; var6 < 103; ++var6) {
                  for(var7 = 1; var7 < 103; ++var7) {
                     if((class31.field239[var1][var7][var6] & 24) == 0) {
                        class248.method4490(var1, var7, var6, var4, var5);
                     }

                     if(var1 < 3 && (class31.field239[var1 + 1][var7][var6] & 8) != 0) {
                        class248.method4490(var1 + 1, var7, var6, var4, var5);
                     }
                  }
               }

               field3958 = 0;

               for(var6 = 0; var6 < 104; ++var6) {
                  for(var7 = 0; var7 < 104; ++var7) {
                     long var23 = class258.field2566.method5398(class315.plane, var6, var7);
                     if(0L != var23) {
                        var10 = class233.method4163(var23);
                        var11 = class152.method2696(var10).field1590;
                        if(var11 >= 0) {
                           field3961[field3958] = class59.method1036(var11).method3266(false);
                           field3769[field3958] = var6;
                           field3960[field3958] = var7;
                           ++field3958;
                        }
                     }
                  }
               }

               class146.field1404.method76();
            }

            if(field3740 == 30) {
               class258.method4663();
               class44.method787();
               ++field3963.field1159;
               if(field3963.field1159 > 750) {
                  class223.method3995();
               } else {
                  class176.method2963();

                  for(var1 = 0; var1 < field3775; ++var1) {
                     var2 = field3776[var1];
                     class237 var25 = field3774[var2];
                     if(var25 != null) {
                        class192.method3293(var25, var25.field2400.field2144);
                     }
                  }

                  int[] var36 = class11.field91;

                  for(var2 = 0; var2 < class11.field90; ++var2) {
                     class63 var42 = field3848[var36[var2]];
                     if(var42 != null && var42.field1268 > 0) {
                        --var42.field1268;
                        if(var42.field1268 == 0) {
                           var42.field1272 = null;
                        }
                     }
                  }

                  for(var2 = 0; var2 < field3775; ++var2) {
                     var3 = field3776[var2];
                     class237 var26 = field3774[var3];
                     if(var26 != null && var26.field1268 > 0) {
                        --var26.field1268;
                        if(var26.field1268 == 0) {
                           var26.field1272 = null;
                        }
                     }
                  }

                  ++field3989;
                  if(field3836 != 0) {
                     field3824 += 20;
                     if(field3824 >= 400) {
                        field3836 = 0;
                     }
                  }

                  if(class168.field1558 != null) {
                     ++field4010;
                     if(field4010 >= 15) {
                        class184.method3216(class168.field1558);
                        class168.field1558 = null;
                     }
                  }

                  class329 var37 = class281.field3036;
                  class329 var40 = class323.field3463;
                  class281.field3036 = null;
                  class323.field3463 = null;
                  field3909 = null;
                  field3913 = false;
                  field3910 = false;
                  field3994 = 0;

                  while(ServerProt.method4175() && field3994 < 128) {
                     if(field3842 >= 2 && class135.field1332[82] && class77.field713 == 66) {
                        String var44 = "";

                        class286 var41;
                        for(Iterator var27 = class297.field3193.iterator(); var27.hasNext(); var44 = var44 + var41.field3110 + ':' + var41.field3108 + '\n') {
                           var41 = (class286)var27.next();
                        }

                        class113.field1064.method3029(var44);
                     } else if(field3807 != 1 || class90.field883 <= 0) {
                        field3955[field3994] = class77.field713;
                        field3954[field3994] = class90.field883;
                        ++field3994;
                     }
                  }

                  if(class270.method4879() && class135.field1332[82] && class135.field1332[81] && field3974 != 0) {
                     var3 = class5.field43.field580 - field3974;
                     if(var3 < 0) {
                        var3 = 0;
                     } else if(var3 > 3) {
                        var3 = 3;
                     }

                     if(var3 != class5.field43.field580) {
                        var4 = class5.field43.field1288[0] + class296.somex;
                        var5 = class5.field43.field1315[0] + class284.somey;
                        var18 = class95.writeClientProt(ClientProt.WORLD_MAP_CLICK, field3963.field1162);
                        var18.field3018.writeIntV1(0);
                        var18.field3018.writeShortLE(var5);
                        var18.field3018.writeByteC(var3);
                        var18.field3018.writeShort(var4);
                        field3963.method2235(var18);
                     }

                     field3974 = 0;
                  }

                  if(field3892 != -1) {
                     class10.method115(field3892, 0, 0, class47.field359, class330.field3689, 0, 0);
                  }

                  ++field3917;

                  while(true) {
                     class9 var43;
                     class329 var46;
                     class329 var47;
                     do {
                        var43 = (class9)field3932.method5599();
                        if(var43 == null) {
                           while(true) {
                              do {
                                 var43 = (class9)field3933.method5599();
                                 if(var43 == null) {
                                    while(true) {
                                       do {
                                          var43 = (class9)field3811.method5599();
                                          if(var43 == null) {
                                             this.method5974();
                                             if(class63.field587 != null) {
                                                class63.field587.method1341(class315.plane, (class5.field43.field1277 >> 7) + class296.somex, (class5.field43.field1259 >> 7) + class284.somey, false);
                                                class63.field587.method1374();
                                             }

                                             if(field3905 != null) {
                                                this.method5979();
                                             }

                                             if(class38.field286 != null) {
                                                class184.method3216(class38.field286);
                                                ++field3845;
                                                itemPressedDurationChanged(-1);
                                                if(class226.field2223 == 0) {
                                                   if(field3844) {
                                                      if(class38.field286 == ClientProt.field573 && field3840 != field3843) {
                                                         class329 var45 = class38.field286;
                                                         byte var31 = 0;
                                                         if(field3897 == 1 && var45.field3548 == 206) {
                                                            var31 = 1;
                                                         }

                                                         if(var45.field3668[field3843] <= 0) {
                                                            var31 = 0;
                                                         }

                                                         var6 = class104.method1771(var45);
                                                         boolean var33 = (var6 >> 29 & 1) != 0;
                                                         if(var33) {
                                                            var7 = field3840;
                                                            var8 = field3843;
                                                            var45.field3668[var8] = var45.field3668[var7];
                                                            var45.field3682[var8] = var45.field3682[var7];
                                                            var45.field3668[var7] = -1;
                                                            var45.field3682[var7] = 0;
                                                         } else if(var31 == 1) {
                                                            var7 = field3840;
                                                            var8 = field3843;

                                                            while(var8 != var7) {
                                                               if(var7 > var8) {
                                                                  var45.method5882(var7 - 1, var7);
                                                                  --var7;
                                                               } else if(var7 < var8) {
                                                                  var45.method5882(var7 + 1, var7);
                                                                  ++var7;
                                                               }
                                                            }
                                                         } else {
                                                            var45.method5882(field3843, field3840);
                                                         }

                                                         class279 var28 = class95.writeClientProt(ClientProt.SWITCH_ITEM_SMALL, field3963.field1162);
                                                         var28.field3018.writeShort(field3843);
                                                         var28.field3018.writeShortLE(field3840);
                                                         var28.field3018.writeInt(class38.field286.field3607);
                                                         var28.field3018.writeByteC(var31);
                                                         field3963.method2235(var28);
                                                      }
                                                   } else if(this.method5975()) {
                                                      this.method6036(field3841, field3931);
                                                   } else if(field3869 > 0) {
                                                      var3 = field3841;
                                                      var4 = field3931;
                                                      class31.method528(class45.field353, var3, var4);
                                                      class45.field353 = null;
                                                   }

                                                   field4010 = 10;
                                                   class226.field2222 = 0;
                                                   class38.field286 = null;
                                                } else if(field3845 >= 5 && (class226.field2215 > field3841 + 5 || class226.field2215 < field3841 - 5 || class226.field2216 > field3931 + 5 || class226.field2216 < field3931 - 5)) {
                                                   field3844 = true;
                                                }
                                             }

                                             if(class312.method5370()) {
                                                var3 = class312.field3319;
                                                var4 = class312.field3341;
                                                class279 var48 = class95.writeClientProt(ClientProt.WALKING, field3963.field1162);
                                                var48.field3018.writeByte(5);
                                                var48.field3018.writeShort128(var4 + class284.somey);
                                                var48.field3018.writeShort128(var3 + class296.somex);
                                                var48.field3018.writeByte128(class135.field1332[82]?(class135.field1332[81]?2:1):0);
                                                field3963.method2235(var48);
                                                class312.method5443();
                                                field3949 = class226.field2220;
                                                field3834 = class226.field2224;
                                                field3836 = 1;
                                                field3824 = 0;
                                                field3795 = var3;
                                                field3993 = var4;
                                             }

                                             if(var37 != class281.field3036) {
                                                if(var37 != null) {
                                                   class184.method3216(var37);
                                                }

                                                if(class281.field3036 != null) {
                                                   class184.method3216(class281.field3036);
                                                }
                                             }

                                             if(var40 != class323.field3463 && field3953 == field3911) {
                                                if(var40 != null) {
                                                   class184.method3216(var40);
                                                }

                                                if(class323.field3463 != null) {
                                                   class184.method3216(class323.field3463);
                                                }
                                             }

                                             if(class323.field3463 != null) {
                                                if(field3953 < field3911) {
                                                   ++field3953;
                                                   if(field3953 == field3911) {
                                                      class184.method3216(class323.field3463);
                                                   }
                                                }
                                             } else if(field3953 > 0) {
                                                --field3953;
                                             }

                                             if(field3807 == 0) {
                                                var3 = class5.field43.field1277;
                                                var4 = class5.field43.field1259;
                                                if(class125.field1181 - var3 < -500 || class125.field1181 - var3 > 500 || class303.field3244 - var4 < -500 || class303.field3244 - var4 > 500) {
                                                   class125.field1181 = var3;
                                                   class303.field3244 = var4;
                                                }

                                                if(var3 != class125.field1181) {
                                                   class125.field1181 += (var3 - class125.field1181) / 16;
                                                }

                                                if(var4 != class303.field3244) {
                                                   class303.field3244 += (var4 - class303.field3244) / 16;
                                                }

                                                var5 = class125.field1181 >> 7;
                                                var6 = class303.field3244 >> 7;
                                                var7 = class7.method85(class125.field1181, class303.field3244, class315.plane);
                                                var8 = 0;
                                                if(var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
                                                   for(var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                                                      for(var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                                                         var11 = class315.plane;
                                                         if(var11 < 3 && (class31.field239[1][var9][var10] & 2) == 2) {
                                                            ++var11;
                                                         }

                                                         var12 = var7 - class31.field249[var11][var9][var10];
                                                         if(var12 > var8) {
                                                            var8 = var12;
                                                         }
                                                      }
                                                   }
                                                }

                                                var9 = var8 * 192;
                                                if(var9 > 98048) {
                                                   var9 = 98048;
                                                }

                                                if(var9 < 32768) {
                                                   var9 = 32768;
                                                }

                                                if(var9 > field3846) {
                                                   field3846 += (var9 - field3846) / 24;
                                                } else if(var9 < field3846) {
                                                   field3846 += (var9 - field3846) / 80;
                                                }

                                                class164.field1526 = class7.method85(class5.field43.field1277, class5.field43.field1259, class315.plane) - field3808;
                                             } else if(field3807 == 1) {
                                                if(field3815 && class5.field43 != null) {
                                                   var3 = class5.field43.field1288[0];
                                                   var4 = class5.field43.field1315[0];
                                                   if(var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                                                      class125.field1181 = class5.field43.field1277;
                                                      var5 = class7.method85(class5.field43.field1277, class5.field43.field1259, class315.plane) - field3808;
                                                      if(var5 < class164.field1526) {
                                                         class164.field1526 = var5;
                                                      }

                                                      class303.field3244 = class5.field43.field1259;
                                                      field3815 = false;
                                                   }
                                                }

                                                short var32 = -1;
                                                if(class135.field1332[33]) {
                                                   var32 = 0;
                                                } else if(class135.field1332[49]) {
                                                   var32 = 1024;
                                                }

                                                if(class135.field1332[48]) {
                                                   if(var32 == 0) {
                                                      var32 = 1792;
                                                   } else if(var32 == 1024) {
                                                      var32 = 1280;
                                                   } else {
                                                      var32 = 1536;
                                                   }
                                                } else if(class135.field1332[50]) {
                                                   if(var32 == 0) {
                                                      var32 = 256;
                                                   } else if(var32 == 1024) {
                                                      var32 = 768;
                                                   } else {
                                                      var32 = 512;
                                                   }
                                                }

                                                byte var34 = 0;
                                                if(class135.field1332[35]) {
                                                   var34 = -1;
                                                } else if(class135.field1332[51]) {
                                                   var34 = 1;
                                                }

                                                var5 = 0;
                                                if(var32 >= 0 || var34 != 0) {
                                                   var5 = class135.field1332[81]?field3813:field3812;
                                                   var5 *= 16;
                                                   field3810 = var32;
                                                   field3772 = var34;
                                                }

                                                if(field3982 < var5) {
                                                   field3982 += var5 / 8;
                                                   if(field3982 > var5) {
                                                      field3982 = var5;
                                                   }
                                                } else if(field3982 > var5) {
                                                   field3982 = field3982 * 9 / 10;
                                                }

                                                if(field3982 > 0) {
                                                   var6 = field3982 / 16;
                                                   if(field3810 >= 0) {
                                                      var3 = field3810 - class61.field469 & 2047;
                                                      var7 = class257.field2564[var3];
                                                      var8 = class257.field2558[var3];
                                                      class125.field1181 += var7 * var6 / 65536;
                                                      class303.field3244 += var8 * var6 / 65536;
                                                   }

                                                   if(field3772 != 0) {
                                                      class164.field1526 += var6 * field3772;
                                                      if(class164.field1526 > 0) {
                                                         class164.field1526 = 0;
                                                      }
                                                   }
                                                } else {
                                                   field3810 = -1;
                                                   field3772 = -1;
                                                }

                                                if(class135.field1332[13]) {
                                                   field3963.method2235(class95.writeClientProt(ClientProt.FREECAM_RESET, field3963.field1162));
                                                   field3807 = 0;
                                                }
                                             }

                                             if(class226.field2223 == 4 && class192.field1840) {
                                                var3 = class226.field2216 - field3806;
                                                field3743 = var3 * 2;
                                                field3806 = var3 != -1 && var3 != 1?(field3806 + class226.field2216) / 2:class226.field2216;
                                                var4 = field3818 - class226.field2215;
                                                field3803 = var4 * 2;
                                                field3818 = var4 != -1 && var4 != 1?(class226.field2215 + field3818) / 2:class226.field2215;
                                             } else {
                                                if(class135.field1332[96]) {
                                                   field3803 += (-24 - field3803) / 2;
                                                } else if(class135.field1332[97]) {
                                                   field3803 += (24 - field3803) / 2;
                                                } else {
                                                   field3803 /= 2;
                                                }

                                                if(class135.field1332[98]) {
                                                   field3743 += (12 - field3743) / 2;
                                                } else if(class135.field1332[99]) {
                                                   field3743 += (-12 - field3743) / 2;
                                                } else {
                                                   field3743 /= 2;
                                                }

                                                field3806 = class226.field2216;
                                                field3818 = class226.field2215;
                                             }

                                             field3802 = field3803 / 2 + field3802 & 2047;
                                             field3801 += field3743 / 2;
                                             onCameraPitchTargetChanged(-1);
                                             if(field3801 < 128) {
                                                field3801 = 128;
                                                onCameraPitchTargetChanged(-1);
                                             }

                                             if(field3801 > 383) {
                                                field3801 = 383;
                                                onCameraPitchTargetChanged(-1);
                                             }

                                             if(field3976) {
                                                class239.method4209();
                                             }

                                             for(var3 = 0; var3 < 5; ++var3) {
                                                ++field3981[var3];
                                             }

                                             class125.field1183.method873();
                                             var3 = ++class226.field2209 - 1;
                                             var5 = class24.method359();
                                             if(var3 > 15000 && var5 > 15000) {
                                                field3877 = 250;
                                                class156.method2730(14500);
                                                var18 = class95.writeClientProt(ClientProt.EVENT_MOUSE_IDLE, field3963.field1162);
                                                field3963.method2235(var18);
                                             }

                                             class295.field3180.method5822();
                                             ++field3963.field1154;
                                             if(field3963.field1154 > 50) {
                                                var18 = class95.writeClientProt(ClientProt.NO_TIME_OUT, field3963.field1162);
                                                field3963.method2235(var18);
                                             }

                                             try {
                                                field3963.method2253();
                                             } catch (IOException var29) {
                                                class223.method3995();
                                             }

                                             return;
                                          }

                                          var46 = var43.field63;
                                          if(var46.field3606 < 0) {
                                             break;
                                          }

                                          var47 = class189.getWidget(var46.field3563);
                                       } while(var47 == null || var47.field3674 == null || var46.field3606 >= var47.field3674.length || var46 != var47.field3674[var46.field3606]);

                                       class240.method4263(var43);
                                    }
                                 }

                                 var46 = var43.field63;
                                 if(var46.field3606 < 0) {
                                    break;
                                 }

                                 var47 = class189.getWidget(var46.field3563);
                              } while(var47 == null || var47.field3674 == null || var46.field3606 >= var47.field3674.length || var46 != var47.field3674[var46.field3606]);

                              class240.method4263(var43);
                           }
                        }

                        var46 = var43.field63;
                        if(var46.field3606 < 0) {
                           break;
                        }

                        var47 = class189.getWidget(var46.field3563);
                     } while(var47 == null || var47.field3674 == null || var46.field3606 >= var47.field3674.length || var46 != var47.field3674[var46.field3606]);

                     class240.method4263(var43);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1159305348"
   )
   protected final void vmethod6335() {
      int[] var1 = new int[]{20, 260, 10000};
      int[] var2 = new int[]{1000, 100, 500};
      if(var1 != null && var2 != null) {
         class232.field2287 = var1;
         class232.field2285 = new int[var1.length];
         class315.field3388 = new byte[var1.length][][];

         for(int var3 = 0; var3 < class232.field2287.length; ++var3) {
            class315.field3388[var3] = new byte[var2[var3]][];
         }
      } else {
         class232.field2287 = null;
         class232.field2285 = null;
         class315.field3388 = null;
      }

      class306.field3275 = field3734 == 0?43594:field3785 + 40000;
      class118.field1082 = field3734 == 0?443:field3785 + 50000;
      class75.field701 = class306.field3275;
      class44.field336 = class22.field160;
      class44.field343 = class22.field159;
      class44.field341 = class22.field161;
      class128.field1221 = class22.field162;
      class118.field1081 = new class146();
      this.method3116();
      this.method3073();
      class105.field978 = this.method3072();
      class67.field619 = new class281(255, class323.field3454, class323.field3458, 500000);
      class38 var4 = null;
      class197 var5 = new class197();

      try {
         var4 = class263.method4817("", class102.field959.field3400, false);
         byte[] var6 = new byte[(int)var4.method600()];

         int var8;
         for(int var7 = 0; var7 < var6.length; var7 += var8) {
            var8 = var4.method601(var6, var7, var6.length - var7);
            if(var8 == -1) {
               throw new IOException();
            }
         }

         var5 = new class197(new Buffer(var6));
      } catch (Exception var11) {
         ;
      }

      try {
         if(var4 != null) {
            var4.method609();
         }
      } catch (Exception var10) {
         ;
      }

      class153.field1455 = var5;
      this.method3028();
      class2.method27(this, class292.field3155);
      if(field3734 != 0) {
         field3750 = true;
      }

      class289.method5106(class153.field1455.field1861);
      class295.field3180 = new class328(class36.field277);
   }

   public RSSpritePixels drawInstanceMap(int var1) {
      RSSpritePixels var2 = this.createSpritePixels(new int[262144], 512, 512);
      RSSpritePixels var3 = this.getMinimapSprite();
      RSScene var4 = this.getScene();
      int[] var5 = var2.getPixels();
      byte[][][] var6 = this.getTileSettings();

      try {
         this.setMinimapSprite(var2);

         int var8;
         int var9;
         for(var8 = 1; var8 < 103; ++var8) {
            int var7 = (103 - var8) * 2048 + 24628;

            for(var9 = 1; var9 < 103; ++var9) {
               if((var6[var1][var9][var8] & 24) == 0) {
                  var4.drawTile(var5, var7, 512, var1, var9, var8);
               }

               if(var1 < 3 && (var6[var1 + 1][var9][var8] & 8) != 0) {
                  var4.drawTile(var5, var7, 512, var1 + 1, var9, var8);
               }

               var7 += 4;
            }
         }

         var8 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
         var9 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
         var2.setRaster();

         for(int var10 = 1; var10 < 103; ++var10) {
            for(int var11 = 1; var11 < 103; ++var11) {
               if((var6[var1][var11][var10] & 24) == 0) {
                  this.drawObject(var1, var11, var10, var8, var9);
               }

               if(var1 < 3 && (var6[var1 + 1][var11][var10] & 8) != 0) {
                  this.drawObject(var1 + 1, var11, var10, var8, var9);
               }
            }
         }
      } finally {
         this.getBufferProvider().setRaster();
         this.setMinimapSprite(var3);
      }

      return var2;
   }

   public boolean isStretchedEnabled() {
      return stretchedEnabled;
   }

   public RSItemContainer getItemContainer(InventoryID var1) {
      RSHashTable var2 = this.getItemContainers();
      return (RSItemContainer)var2.get((long)var1.getId());
   }

   public void methodDraw(boolean var1) {
      this.callbacks.clientMainLoop();
   }

   public void playSoundEffect(int var1, int var2, int var3, int var4) {
      int var5 = ((var2 & 255) << 16) + ((var3 & 255) << 8) + (var4 & 255);
      int[] var6 = this.getQueuedSoundEffectIDs();
      int[] var7 = this.getUnknownSoundValues1();
      int[] var8 = this.getUnknownSoundValues2();
      RSSoundEffect[] var9 = this.getAudioEffects();
      int[] var10 = this.getSoundLocations();
      int var11 = this.getQueuedSoundEffectCount();
      var6[var11] = var1;
      var7[var11] = 0;
      var8[var11] = 0;
      var9[var11] = null;
      var10[var11] = var5;
      this.setQueuedSoundEffectCount(var11 + 1);
   }

   public void setRSModIcons(RSIndexedSprite[] var1) {
      class207.field2025 = (class32[])var1;
   }

   public int getSelectedSceneTileX() {
      return class312.field3319;
   }

   public int getWidgetRoot() {
      return field3892;
   }

   public int getCycleCntr() {
      return field3917;
   }

   public int getDestinationX() {
      return field3795;
   }

   public int getFlags() {
      return field3733;
   }

   public void setLowMemory(boolean var1) {
      field3736 = var1;
   }

   public int getRSGameState() {
      return field3740;
   }

   public int getNpcIndexesCount() {
      return field3775;
   }

   public int[] getBoostedSkillLevels() {
      return field3940;
   }

   public int[] getRealSkillLevels() {
      return field3865;
   }

   public int[] getSkillExperiences() {
      return field3797;
   }

   public int getPlayerIndexesCount() {
      return class11.field90;
   }

   public int getMouseX() {
      return class226.field2211;
   }

   public int[] getIntVarcs() {
      return this.getVarcs().getIntVarcs();
   }

   public String[] getStrVarcs() {
      return this.getVarcs().getStrVarcs();
   }

   public RSSpritePixels createSpritePixels(int[] var1, int var2, int var3) {
      return new class26(var1, var2, var3);
   }

   public RSJagexLoginType getLoginType() {
      return class36.field277;
   }

   public boolean isResized() {
      return field3946;
   }

   public int getMenuOptionCount() {
      return field3869;
   }

   public RSHashTable getItemContainers() {
      return class292.field3153;
   }

   public int getVar(Varbits var1) {
      int var2 = var1.getId();
      return this.getVarbitValue(this.getVarps(), var2);
   }

   public HintArrowType getHintArrowType() {
      int var1 = class113.field1064.getHintArrowTargetType();
      return var1 == HintArrowType.NPC.getValue()?HintArrowType.NPC:(var1 == HintArrowType.PLAYER.getValue()?HintArrowType.PLAYER:(var1 == HintArrowType.WORLD_POSITION.getValue()?HintArrowType.WORLD_POSITION:HintArrowType.NONE));
   }

   public void menuOpened(int var1, int var2) {
      MenuOpened var3 = new MenuOpened();
      var3.setMenuEntries(this.getMenuEntries());
      this.callbacks.post(var3);
   }

   public String[] getMenuOptions() {
      return field3874;
   }

   public RSWidget[][] getWidgets() {
      return class329.field3533;
   }

   public RSClanMemberManager getClanMemberManager() {
      return class165.field1533;
   }

   public RSFriendManager getFriendManager() {
      return class295.field3180;
   }

   public int[] getVarps() {
      return class215.field2071;
   }

   public RSVarcs getVarcs() {
      return class125.field1183;
   }

   public void addChatMessage(int var1, String var2, String var3, String var4) {
      class135.method2488(var1, var2, var3, var4);
   }

   public void setMouseCanvasHoverPositionX(int var1) {
      class312.field3338 = var1;
   }

   public RSDeque getProjectilesDeque() {
      return field3862;
   }

   public RSDeque getGraphicsObjectDeque() {
      return field3863;
   }

   public MenuEntry[] getMenuEntries() {
      int var1 = this.getMenuOptionCount();
      String[] var2 = this.getMenuOptions();
      String[] var3 = this.getMenuTargets();
      int[] var4 = this.getMenuIdentifiers();
      int[] var5 = this.getMenuTypes();
      int[] var6 = this.getMenuActionParams0();
      int[] var7 = this.getMenuActionParams1();
      MenuEntry[] var8 = new MenuEntry[var1];

      for(int var9 = 0; var9 < var1; ++var9) {
         MenuEntry var10 = var8[var9] = new MenuEntry();
         var10.setOption(var2[var9]);
         var10.setTarget(var3[var9]);
         var10.setIdentifier(var4[var9]);
         var10.setType(var5[var9]);
         var10.setParam0(var6[var9]);
         var10.setParam1(var7[var9]);
      }

      return var8;
   }

   private void rl$$init() {
      this.varbitCache = CacheBuilder.newBuilder().maximumSize(128L).build();
   }

   public void setSceneLowMemory(boolean var1) {
      class312.field3340 = var1;
   }

   public int getSelectedSceneTileY() {
      return class312.field3341;
   }

   public int getDestinationY() {
      return field3993;
   }

   public void setChatCycle(int var1) {
      field3894 = var1;
   }

   public int[] getNpcIndices() {
      return field3776;
   }

   public int[] getPlayerIndices() {
      return class11.field91;
   }

   public int getMouseY() {
      return class226.field2212;
   }

   public RSName createName(String var1, RSJagexLoginType var2) {
      return new class49(var1, (class179)var2);
   }

   public int get3dZoom() {
      return class257.field2550;
   }

   public void _protect$menuAction/* $FF was: 1protect$menuAction*/(int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
      class98.method1686(var1, var2, var3, var4, var5, var6, var7, var8, (byte)102);
   }

   public int[] getQueuedSoundEffectIDs() {
      return field3873;
   }

   public RSSpritePixels getMinimapSprite() {
      return class5.field44;
   }

   public String[] getMenuTargets() {
      return field3875;
   }

   public Widget getWidget(int var1, int var2) {
      RSWidget[][] var3 = this.getWidgets();
      if(var3 != null && var3.length > var1) {
         RSWidget[] var4 = var3[var1];
         return var4 != null && var4.length > var2?var4[var2]:null;
      } else {
         return null;
      }
   }

   public void setVarbitValue(int[] var1, int var2, int var3) {
      RSVarbit var4 = (RSVarbit)this.varbitCache.getIfPresent(Integer.valueOf(var2));
      if(var4 == null) {
         class113.field1064.getVarbit(var2);
         RSNodeCache var5 = class113.field1064.getVarbitCache();
         var4 = (RSVarbit)var5.get((long)var2);
         this.varbitCache.put(Integer.valueOf(var2), var4);
      }

      int var8 = var4.getLeastSignificantBit();
      int var6 = var4.getMostSignificantBit();
      int var7 = (1 << var6 - var8 + 1) - 1;
      var1[var4.getIndex()] = var1[var4.getIndex()] & ~(var7 << var8) | (var3 & var7) << var8;
   }

   public Widget getWidget(WidgetInfo var1) {
      int var2 = var1.getGroupId();
      int var3 = var1.getChildId();
      return this.getWidget(var2, var3);
   }

   public int getVarbitValue(int[] var1, int var2) {
      if(!$assertionsDisabled && !class113.field1064.isClientThread()) {
         throw new AssertionError();
      } else {
         RSVarbit var3 = (RSVarbit)this.varbitCache.getIfPresent(Integer.valueOf(var2));
         if(var3 == null) {
            class113.field1064.getVarbit(var2);
            RSNodeCache var4 = class113.field1064.getVarbitCache();
            var3 = (RSVarbit)var4.get((long)var2);
            this.varbitCache.put(Integer.valueOf(var2), var3);
         }

         if(var3.getIndex() == 0 && var3.getLeastSignificantBit() == 0 && var3.getMostSignificantBit() == 0) {
            throw new IndexOutOfBoundsException("Varbit " + var2 + " does not exist");
         } else {
            int var8 = var1[var3.getIndex()];
            int var5 = var3.getLeastSignificantBit();
            int var6 = var3.getMostSignificantBit();
            int var7 = (1 << var6 - var5 + 1) - 1;
            return var8 >> var5 & var7;
         }
      }
   }

   public void setAudioHighMemory(boolean var1) {
      class137.field1362 = var1;
   }

   public void setMouseCanvasHoverPositionY(int var1) {
      class312.field3339 = var1;
   }

   public RSNPC[] getCachedNPCs() {
      return field3774;
   }

   public RSPlayer[] getCachedPlayers() {
      return field3848;
   }

   public int[] getUnknownSoundValues1() {
      return field3924;
   }

   public int[] getMenuIdentifiers() {
      return field3947;
   }

   public RSScene getScene() {
      return class258.field2566;
   }

   public void set3dZoom(int var1) {
      class257.field2550 = var1;
   }

   public void setObjectCompositionLowDetail(boolean var1) {
      class172.field1617 = var1;
   }

   public int[] getUnknownSoundValues2() {
      return field3973;
   }

   public RSSpritePixels createItemSprite(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      return class294.method5138(var1, var2, var3, var4, var5, var6);
   }

   public int[] getMenuTypes() {
      return field3872;
   }

   public byte[][][] getTileSettings() {
      return class31.field239;
   }

   public RSScriptEvent createScriptEvent() {
      return new class9();
   }

   public RSSoundEffect[] getAudioEffects() {
      return field3767;
   }

   public int[] getMenuActionParams0() {
      return field3870;
   }

   public int getPlane() {
      return class315.plane;
   }

   public RSBufferProvider getBufferProvider() {
      return class146.field1404;
   }

   public void setMinimapSprite(SpritePixels var1) {
      class5.field44 = (class26)var1;
   }

   public int[] getSoundLocations() {
      return field4008;
   }

   public int[] getMenuActionParams1() {
      return field3871;
   }

   public void runScript(RSScriptEvent var1, int var2) {
      class52.method847((class9)var1, var2, (byte)68);
   }

   public int getQueuedSoundEffectCount() {
      return field3970;
   }

   public void setMenuOptionCount(int var1) {
      field3869 = var1;
   }

   public void setQueuedSoundEffectCount(int var1) {
      field3970 = var1;
   }

   public void drawObject(int var1, int var2, int var3, int var4, int var5) {
      class248.method4490(var1, var2, var3, var4, var5);
   }

   public final void init() {
      try {
         if(this.method3031()) {
            class71[] var1 = new class71[]{class71.field653, class71.field657, class71.field663, class71.field651, class71.field652, class71.field660, class71.field656, class71.field661, class71.field665, class71.field654, class71.field659, class71.field666, class71.field664, class71.field658, class71.field655, class71.field662, class71.field668, class71.field667};
            class71[] var2 = var1;

            for(int var3 = 0; var3 < var2.length; ++var3) {
               class71 var4 = var2[var3];
               String var5 = this.getParameter(var4.field669);
               if(var5 != null) {
                  switch(Integer.parseInt(var4.field669)) {
                  case 1:
                     field3782 = Integer.parseInt(var5) != 0;
                  case 2:
                  case 11:
                  case 13:
                  case 16:
                  default:
                     break;
                  case 3:
                     if(var5.equalsIgnoreCase("true")) {
                        field3735 = true;
                     } else {
                        field3735 = false;
                     }
                     break;
                  case 4:
                     if(field3967 == -1) {
                        field3967 = Integer.parseInt(var5);
                     }
                     break;
                  case 5:
                     field3733 = Integer.parseInt(var5);
                     break;
                  case 6:
                     field3737 = Integer.parseInt(var5);
                     break;
                  case 7:
                     class240.field2413 = class74.method1178(Integer.parseInt(var5));
                     break;
                  case 8:
                     if(var5.equalsIgnoreCase("true")) {
                        ;
                     }
                     break;
                  case 9:
                     class330.field3693 = var5;
                     break;
                  case 10:
                     class317[] var6 = new class317[]{class317.field3398, class317.field3396, class317.field3397, class317.field3394, class317.field3395, class317.field3399};
                     class102.field959 = (class317)class297.method5176(var6, Integer.parseInt(var5));
                     if(class102.field959 == class317.field3399) {
                        class36.field277 = class179.field1708;
                     } else {
                        class36.field277 = class179.field1707;
                     }
                     break;
                  case 12:
                     field3785 = Integer.parseInt(var5);
                     break;
                  case 14:
                     class2.field19 = Integer.parseInt(var5);
                     break;
                  case 15:
                     field3734 = Integer.parseInt(var5);
                     break;
                  case 17:
                     class74.field679 = var5;
                  }
               }
            }

            class312.field3340 = false;
            field3736 = false;
            class143.field1395 = this.getCodeBase().getHost();
            String var11 = class240.field2413.field1368;
            byte var7 = 0;

            try {
               class4.method66("oldschool", var11, var7, 18);
            } catch (Exception var9) {
               class295.method5145((String)null, var9, -1983450225);
            }

            class113.field1064 = this;
            class302.field3231 = field3967;
            this.method3036(765, 503, 176);
         }
      } catch (RuntimeException var10) {
         throw class9.method103(var10, "client.init(" + ')');
      }
   }

   public void openWorldHopper() {
      this._protect$menuAction(-1, WidgetInfo.WORLD_SWITCHER_BUTTON.getId(), MenuAction.WIDGET_DEFAULT.getId(), 1, "World Switcher", "", 658, 384);
   }

   public void hopToWorld(World var1) {
      int var2 = var1.getId();
      this._protect$menuAction(var2, WidgetInfo.WORLD_SWITCHER_LIST.getId(), MenuAction.WIDGET_DEFAULT.getId(), 1, "Switch", "<col=ff9040>" + (var2 - 300) + "</col>", 683, 244);
   }

   public void runScript(int var1, Object... var2) {
      if(!$assertionsDisabled && !this.isClientThread()) {
         throw new AssertionError();
      } else if(!$assertionsDisabled && currentScript != null) {
         throw new AssertionError();
      } else {
         Object[] var3 = new Object[var2.length + 1];
         var3[0] = Integer.valueOf(var1);
         System.arraycopy(var2, 0, var3, 1, var2.length);
         RSScriptEvent var4 = this.createScriptEvent();
         var4.setArguments(var3);
         this.runScript(var4, 200000);
      }
   }

   public void setStretchedEnabled(boolean var1) {
      stretchedEnabled = var1;
   }

   public boolean isStretchedFast() {
      return stretchedFast;
   }

   public void setStretchedFast(boolean var1) {
      stretchedFast = var1;
   }

   public void setStretchedIntegerScaling(boolean var1) {
      stretchedIntegerScaling = var1;
      cachedStretchedDimensions = null;
   }

   public void setStretchedKeepAspectRatio(boolean var1) {
      stretchedKeepAspectRatio = var1;
      cachedStretchedDimensions = null;
   }

   public Dimension getRealDimensions() {
      return this.isStretchedEnabled() && !this.isResized()?Constants.GAME_FIXED_SIZE:this.getCanvas().getSize();
   }

   public Dimension getStretchedDimensions() {
      Canvas var1 = this.getCanvas();
      int var2 = var1.getParent().getWidth();
      int var3 = var1.getParent().getHeight();
      if(cachedStretchedDimensions == null || var2 != lastCanvasDimensions.width || var3 != lastCanvasDimensions.height) {
         if(stretchedKeepAspectRatio) {
            int var4 = (int)((double)var3 * 1.5208747514910537D);
            if(var4 > var1.getWidth()) {
               var3 = (int)((double)var2 / 1.5208747514910537D);
            } else {
               var2 = var4;
            }
         }

         if(stretchedIntegerScaling) {
            if(var2 > 765) {
               var2 -= var2 % 765;
            }

            if(var3 > 503) {
               var3 -= var3 % 503;
            }
         }

         cachedStretchedDimensions = new Dimension(var2, var3);
         lastCanvasDimensions = new Dimension(var2, var3);
      }

      return cachedStretchedDimensions;
   }

   public void setSetting(Varbits var1, int var2) {
      int var3 = var1.getId();
      this.setVarbitValue(this.getVarps(), var3, var2);
   }

   public int getVar(VarClientInt var1) {
      return this.getIntVarcs()[var1.getIndex()];
   }

   public String getVar(VarClientStr var1) {
      return this.getStrVarcs()[var1.getIndex()];
   }

   public void setVar(VarClientStr var1, String var2) {
      String[] var3 = this.getStrVarcs();
      var3[var1.getIndex()] = var2;
   }

   public void setVar(VarClientInt var1, int var2) {
      int[] var3 = this.getIntVarcs();
      var3[var1.getIndex()] = var2;
   }

   public Callbacks getCallbacks() {
      return this.callbacks;
   }

   public Logger getLogger() {
      return this.logger;
   }

   public boolean isInterpolatePlayerAnimations() {
      return interpolatePlayerAnimations;
   }

   public void setInterpolatePlayerAnimations(boolean var1) {
      interpolatePlayerAnimations = var1;
   }

   public boolean isInterpolateNpcAnimations() {
      return interpolateNpcAnimations;
   }

   public void setInterpolateNpcAnimations(boolean var1) {
      interpolateNpcAnimations = var1;
   }

   public boolean isInterpolateObjectAnimations() {
      return interpolateObjectAnimations;
   }

   public void setInterpolateObjectAnimations(boolean var1) {
      interpolateObjectAnimations = var1;
   }

   public void setInventoryDragDelay(int var1) {
      inventoryDragDelay = var1;
   }

   public AccountType getAccountType() {
      int var1 = this.getVar(Varbits.ACCOUNT_TYPE);
      switch(var1) {
      case 1:
         return AccountType.IRONMAN;
      case 2:
         return AccountType.ULTIMATE_IRONMAN;
      case 3:
         return AccountType.HARDCORE_IRONMAN;
      default:
         return AccountType.NORMAL;
      }
   }

   public void setMouseCanvasHoverPosition(Point var1) {
      this.setMouseCanvasHoverPositionX(var1.getX());
      this.setMouseCanvasHoverPositionY(var1.getY());
   }

   public Tile getSelectedSceneTile() {
      int var1 = this.getSelectedSceneTileX();
      int var2 = this.getSelectedSceneTileY();
      return var1 != -1 && var2 != -1?this.getScene().getTiles()[this.getPlane()][var1][var2]:null;
   }

   public List getPlayers() {
      int var1 = this.getPlayerIndexesCount();
      int[] var2 = this.getPlayerIndices();
      RSPlayer[] var3 = this.getCachedPlayers();
      ArrayList var4 = new ArrayList(var1);

      for(int var5 = 0; var5 < var1; ++var5) {
         var4.add(var3[var2[var5]]);
      }

      return var4;
   }

   public List getNpcs() {
      int var1 = this.getNpcIndexesCount();
      int[] var2 = this.getNpcIndices();
      RSNPC[] var3 = this.getCachedNPCs();
      ArrayList var4 = new ArrayList(var1);

      for(int var5 = 0; var5 < var1; ++var5) {
         var4.add(var3[var2[var5]]);
      }

      return var4;
   }

   public int getBoostedSkillLevel(Skill var1) {
      int[] var2 = this.getBoostedSkillLevels();
      return var2[var1.ordinal()];
   }

   public int getRealSkillLevel(Skill var1) {
      int[] var2 = this.getRealSkillLevels();
      return var2[var1.ordinal()];
   }

   public int getTotalLevel() {
      int var1 = 0;
      int[] var2 = class113.field1064.getRealSkillLevels();
      int var3 = Skill.CONSTRUCTION.ordinal();

      for(int var4 = 0; var4 < var2.length; ++var4) {
         if(var4 <= var3) {
            var1 += var2[var4];
         }
      }

      return var1;
   }

   public void addChatMessage(ChatMessageType var1, String var2, String var3, String var4) {
      this.addChatMessage(var1.getType(), var2, var3, var4);
   }

   public GameState getGameState() {
      return GameState.of(this.getRSGameState());
   }

   public Point getMouseCanvasPosition() {
      return new Point(this.getMouseX(), this.getMouseY());
   }

   public Widget[] getWidgetRoots() {
      int var1 = this.getWidgetRoot();
      ArrayList var2 = new ArrayList();
      RSWidget[] var3 = this.getWidgets()[var1];
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         RSWidget var6 = var3[var5];
         if(var6 != null && var6.getRSParentId() == -1) {
            var2.add(var6);
         }
      }

      return (Widget[])var2.toArray(new Widget[var2.size()]);
   }

   public RSWidget[] getGroup(int var1) {
      RSWidget[][] var2 = this.getWidgets();
      return var2 != null && var1 >= 0 && var1 < var2.length && var2[var1] != null?var2[var1]:null;
   }

   public int getVar(VarPlayer var1) {
      int[] var2 = this.getVarps();
      return var2[var1.getId()];
   }

   public int getVarpValue(int[] var1, int var2) {
      return var1[var2];
   }

   public void setVarpValue(int[] var1, int var2, int var3) {
      var1[var2] = var3;
   }

   public boolean isPrayerActive(Prayer var1) {
      return this.getVar(var1.getVarbit()) == 1;
   }

   public int getSkillExperience(Skill var1) {
      int[] var2 = this.getSkillExperiences();
      int var3;
      if(var1 != Skill.OVERALL) {
         var3 = var1.ordinal();
         return var3 >= var2.length?-1:var2[var3];
      } else {
         var3 = 0;
         int[] var4 = var2;
         int var5 = var2.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            int var7 = var4[var6];
            var3 += var7;
         }

         return var3;
      }
   }

   public void refreshChat() {
      this.setChatCycle(this.getCycleCntr());
   }

   public Widget getViewportWidget() {
      return this.isResized()?(this.getVar(Varbits.SIDE_PANELS) == 1?this.getWidget(WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE):this.getWidget(WidgetInfo.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX)):this.getWidget(WidgetInfo.FIXED_VIEWPORT);
   }

   public void setMenuEntries(MenuEntry[] var1) {
      int var2 = 0;
      String[] var3 = this.getMenuOptions();
      String[] var4 = this.getMenuTargets();
      int[] var5 = this.getMenuIdentifiers();
      int[] var6 = this.getMenuTypes();
      int[] var7 = this.getMenuActionParams0();
      int[] var8 = this.getMenuActionParams1();
      MenuEntry[] var9 = var1;
      int var10 = var1.length;

      for(int var11 = 0; var11 < var10; ++var11) {
         MenuEntry var12 = var9[var11];
         var3[var2] = var12.getOption();
         var4[var2] = var12.getTarget();
         var5[var2] = var12.getIdentifier();
         var6[var2] = var12.getType();
         var7[var2] = var12.getParam0();
         var8[var2] = var12.getParam1();
         ++var2;
      }

      this.setMenuOptionCount(var2);
      oldMenuEntryCount = var2;
   }

   public List getProjectiles() {
      ArrayList var1 = new ArrayList();
      RSDeque var2 = this.getProjectilesDeque();
      RSNode var3 = var2.getHead();

      for(Node var4 = var3.getNext(); var4 != var3; var4 = var4.getNext()) {
         var1.add((Projectile)var4);
      }

      return var1;
   }

   public List getGraphicsObjects() {
      ArrayList var1 = new ArrayList();
      RSDeque var2 = this.getGraphicsObjectDeque();
      RSNode var3 = var2.getHead();

      for(Node var4 = var3.getNext(); var4 != var3; var4 = var4.getNext()) {
         var1.add((GraphicsObject)var4);
      }

      return var1;
   }

   public void setModIcons(IndexedSprite[] var1) {
      this.setRSModIcons((RSIndexedSprite[])((RSIndexedSprite[])var1));
   }

   public LocalPoint getLocalDestinationLocation() {
      int var1 = this.getDestinationX();
      int var2 = this.getDestinationY();
      return var1 != 0 && var2 != 0?LocalPoint.fromScene(var1, var2):null;
   }

   public void changeMemoryMode(boolean var1) {
      this.setLowMemory(var1);
      this.setSceneLowMemory(var1);
      this.setAudioHighMemory(true);
      this.setObjectCompositionLowDetail(var1);
   }

   public boolean isFriended(String var1, boolean var2) {
      RSName var3 = this.createName(var1, this.getLoginType());
      return this.getFriendManager().isFriended(var3, var2);
   }

   public int getClanChatCount() {
      RSClanMemberManager var1 = this.getClanMemberManager();
      return var1 != null?var1.getCount():0;
   }

   public ClanMember[] getClanMembers() {
      RSClanMemberManager var1 = this.getClanMemberManager();
      return var1 != null?(ClanMember[])((ClanMember[])this.getClanMemberManager().getNameables()):null;
   }

   public Friend[] getFriends() {
      RSFriendManager var1 = this.getFriendManager();
      if(var1 == null) {
         return null;
      } else {
         RSFriendContainer var2 = var1.getFriendContainer();
         if(var2 == null) {
            return null;
         } else {
            RSNameable[] var3 = var2.getNameables();
            return (Friend[])((Friend[])var3);
         }
      }
   }

   public int getFriendsCount() {
      RSFriendManager var1 = this.getFriendManager();
      if(var1 == null) {
         return -1;
      } else {
         RSFriendContainer var2 = var1.getFriendContainer();
         return var2 == null?-1:var2.getCount();
      }
   }

   public Ignore[] getIgnores() {
      RSFriendManager var1 = this.getFriendManager();
      if(var1 == null) {
         return null;
      } else {
         RSIgnoreContainer var2 = var1.getIgnoreContainer();
         if(var2 == null) {
            return null;
         } else {
            RSNameable[] var3 = var2.getNameables();
            return (Ignore[])((Ignore[])var3);
         }
      }
   }

   public int getIgnoreCount() {
      RSFriendManager var1 = this.getFriendManager();
      if(var1 == null) {
         return -1;
      } else {
         RSIgnoreContainer var2 = var1.getIgnoreContainer();
         return var2 == null?-1:var2.getCount();
      }
   }

   public boolean isClanMember(String var1) {
      RSClanMemberManager var2 = this.getClanMemberManager();
      return var2 != null && var2.isMember(this.createName(var1, this.getLoginType()));
   }

   public SpritePixels createItemSprite(int var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      if(!$assertionsDisabled && !this.isClientThread()) {
         throw new AssertionError();
      } else {
         int var8 = this.get3dZoom();
         this.set3dZoom(var7);

         RSSpritePixels var9;
         try {
            var9 = this.createItemSprite(var1, var2, var3, var4, var5, var6);
         } finally {
            this.set3dZoom(var8);
         }

         return var9;
      }
   }

   public boolean hasHintArrow() {
      return class113.field1064.getHintArrowTargetType() != HintArrowType.NONE.getValue();
   }

   public void clearHintArrow() {
      class113.field1064.setHintArrowTargetType(HintArrowType.NONE.getValue());
   }

   public void setHintArrow(NPC var1) {
      class113.field1064.setHintArrowTargetType(HintArrowType.NPC.getValue());
      class113.field1064.setHintArrowNpcTargetIdx(var1.getIndex());
   }

   public void setHintArrow(Player var1) {
      class113.field1064.setHintArrowTargetType(HintArrowType.PLAYER.getValue());
      class113.field1064.setHintArrowPlayerTargetIdx(((RSPlayer)var1).getPlayerId());
   }

   public void setHintArrow(WorldPoint var1) {
      class113.field1064.setHintArrowTargetType(HintArrowType.WORLD_POSITION.getValue());
      class113.field1064.setHintArrowX(var1.getX());
      class113.field1064.setHintArrowY(var1.getY());
      class113.field1064.setHintArrowOffsetX(64);
      class113.field1064.setHintArrowOffsetY(64);
   }

   public WorldPoint getHintArrowPoint() {
      if(this.getHintArrowType() == HintArrowType.WORLD_POSITION) {
         int var1 = class113.field1064.getHintArrowX();
         int var2 = class113.field1064.getHintArrowY();
         return new WorldPoint(var1, var2, class113.field1064.getPlane());
      } else {
         return null;
      }
   }

   public Player getHintArrowPlayer() {
      if(this.getHintArrowType() == HintArrowType.PLAYER) {
         int var1 = class113.field1064.getHintArrowPlayerTargetIdx();
         RSPlayer[] var2 = class113.field1064.getCachedPlayers();
         return var1 >= 0 && var1 < var2.length?var2[var1]:null;
      } else {
         return null;
      }
   }

   public NPC getHintArrowNpc() {
      if(this.getHintArrowType() == HintArrowType.NPC) {
         int var1 = class113.field1064.getHintArrowNpcTargetIdx();
         RSNPC[] var2 = class113.field1064.getCachedNPCs();
         return var1 >= 0 && var1 < var2.length?var2[var1]:null;
      } else {
         return null;
      }
   }

   public int getTickCount() {
      return tickCount;
   }

   public void setTickCount(int var1) {
      tickCount = var1;
   }

   public EnumSet getWorldType() {
      int var1 = this.getFlags();
      return WorldType.fromMask(var1);
   }

   public RSItem getLastItemDespawn() {
      return lastItemDespawn;
   }

   public void setLastItemDespawn(RSItem var1) {
      lastItemDespawn = var1;
   }

   public void queueChangedSkill(Skill var1) {
      int[] var2 = class113.field1064.getChangedSkills();
      int var3 = class113.field1064.getChangedSkillsCount();
      ++var3;
      var2[var3 - 1 & 31] = var1.ordinal();
      class113.field1064.setChangedSkillsCount(var3);
   }

   public void setIsHidingEntities(boolean var1) {
      isHidingEntities = var1;
   }

   public void setPlayersHidden(boolean var1) {
      hidePlayers = var1;
   }

   public void setPlayersHidden2D(boolean var1) {
      hidePlayers2D = var1;
   }

   public void setFriendsHidden(boolean var1) {
      hideFriends = var1;
   }

   public void setClanMatesHidden(boolean var1) {
      hideClanMates = var1;
   }

   public void setLocalPlayerHidden(boolean var1) {
      hideLocalPlayer = var1;
   }

   public void setLocalPlayerHidden2D(boolean var1) {
      hideLocalPlayer2D = var1;
   }

   public void setNPCsHidden(boolean var1) {
      hideNPCs = var1;
   }

   public void setNPCsHidden2D(boolean var1) {
      hideNPCs2D = var1;
   }

   public void setAttackersHidden(boolean var1) {
      hideAttackers = var1;
   }

   public void setProjectilesHidden(boolean var1) {
      hideProjectiles = var1;
   }

   public Map getSpriteOverrides() {
      return spriteOverrides;
   }

   public Map getWidgetSpriteOverrides() {
      return widgetSpriteOverrides;
   }

   public void playSoundEffect(int var1) {
      this.playSoundEffect(var1, 0, 0, 0);
   }

   public void setCameraPitchRelaxerEnabled(boolean var1) {
      if(pitchRelaxEnabled != var1) {
         pitchRelaxEnabled = var1;
         if(!var1) {
            int var2 = class113.field1064.getCameraPitchTarget();
            if(var2 > 383) {
               class113.field1064.setCameraPitchTarget(383);
            }
         }

      }
   }

   public RSWorld createWorld() {
      return new class126();
   }

   public RSIndexedSprite createIndexedSprite() {
      return new class32();
   }

   public RSWidget createWidget() {
      return new class329();
   }

   public RSItem createItem() {
      return new class161();
   }

   public Map getChatLineMap() {
      return class297.field3194;
   }

   public int[] getIntStack() {
      return class55.field407;
   }

   public String[] getStringStack() {
      return class55.field408;
   }

   public RSFrames getFrames(int var1) {
      return class233.method4164(var1);
   }

   public int getVarbit(int var1) {
      return class52.method859(var1);
   }

   public int getKeyboardIdleTicks() {
      return class135.field1343;
   }

   public RSSpritePixels[] getMapDots() {
      return class241.field2414;
   }

   public RSArea[] getMapAreas() {
      return class191.field1833;
   }

   public RSNodeCache getWidgetSpriteCache() {
      return class329.field3538;
   }

   public RSIndexedSprite[] getModIcons() {
      return class207.field2025;
   }

   public void setStringStackSize(int var1) {
      class272.field2978 = var1;
   }

   public int getStringStackSize() {
      return class272.field2978;
   }

   public RSSpritePixels[] getSprites(IndexDataBase var1, int var2, int var3) {
      return class272.method4897((class148)var1, var2, var3);
   }

   public void setPitchSin(int var1) {
      class312.field3331 = var1;
   }

   public void setPitchCos(int var1) {
      class312.field3332 = var1;
   }

   public void setCheckClick(boolean var1) {
      class312.field3362 = var1;
   }

   public int getBaseX() {
      return class296.somex;
   }

   public int getCameraZ() {
      return class296.field3191;
   }

   public int getFPS() {
      return class181.field1725;
   }

   public RSWidget getDraggedWidget() {
      return field3905;
   }

   public RSHashTable getWidgetFlags() {
      return field3934;
   }

   public RSHashTable getComponentTable() {
      return field3991;
   }

   public int[] getWidgetPositionsX() {
      return field3901;
   }

   public void setGameDrawingMode(int var1) {
      field3944 = var1;
   }

   public int getGameDrawingMode() {
      return field3944;
   }

   public int[] getWidgetPositionsY() {
      return field3941;
   }

   public boolean isDraggingWidget() {
      return field3916;
   }

   public int getEnergy() {
      return energy;
   }

   public int getWeight() {
      return weight;
   }

   public void setDraggedOnWidget(Widget var1) {
      field3909 = (class329)var1;
   }

   public RSWidget getDraggedOnWidget() {
      return field3909;
   }

   public RSSpritePixels[] getMapIcons() {
      return field3961;
   }

   public int getScale() {
      return field3809;
   }

   public int getViewportWidth() {
      return field3992;
   }

   public int getViewportHeight() {
      return field3938;
   }

   public int getViewportXOffset() {
      return field3823;
   }

   public int getViewportYOffset() {
      return field3816;
   }

   public int[] getChangedSkills() {
      return field3868;
   }

   public void setChangedSkillsCount(int var1) {
      field3995 = var1;
   }

   public int getChangedSkillsCount() {
      return field3995;
   }

   public RSGrandExchangeOffer[] getGrandExchangeOffers() {
      return field3999;
   }

   public RSCollisionData[] getCollisionMaps() {
      return field3790;
   }

   public int getWorld() {
      return field3785;
   }

   public int getGameCycle() {
      return field3744;
   }

   public void setHintArrowTargetType(int var1) {
      field3752 = var1;
   }

   public int getHintArrowTargetType() {
      return field3752;
   }

   public void setHintArrowNpcTargetIdx(int var1) {
      field3859 = var1;
   }

   public int getHintArrowNpcTargetIdx() {
      return field3859;
   }

   public void setHintArrowPlayerTargetIdx(int var1) {
      field3799 = var1;
   }

   public int getHintArrowPlayerTargetIdx() {
      return field3799;
   }

   public void setHintArrowX(int var1) {
      field3755 = var1;
   }

   public int getHintArrowX() {
      return field3755;
   }

   public void setHintArrowY(int var1) {
      field3899 = var1;
   }

   public int getHintArrowY() {
      return field3899;
   }

   public void setHintArrowOffsetX(int var1) {
      field3758 = var1;
   }

   public void setHintArrowOffsetY(int var1) {
      field3759 = var1;
   }

   public boolean isInInstancedRegion() {
      return field3791;
   }

   public int[][][] getInstanceTemplateChunks() {
      return field3792;
   }

   public void setCameraPitch(int var1) {
      field4009 = var1;
   }

   public int getCameraPitch() {
      return field4009;
   }

   public void setCameraPitchTarget(int var1) {
      field3801 = var1;
   }

   public int getCameraPitchTarget() {
      return field3801;
   }

   public int getMapAngle() {
      return field3802;
   }

   public void setOculusOrbState(int var1) {
      field3807 = var1;
   }

   public void setOculusOrbNormalSpeed(int var1) {
      field3812 = var1;
   }

   public int[][] getOccupiedTilesTick() {
      return field3893;
   }

   public void setItemPressedDuration(int var1) {
      field3845 = var1;
   }

   public int getItemPressedDuration() {
      return field3845;
   }

   public int getLocalInteractingIndex() {
      return field3765;
   }

   public int[] getPlayerMenuTypes() {
      return field3855;
   }

   public String[] getPlayerOptions() {
      return field3856;
   }

   public boolean[] getPlayerOptionsPriorities() {
      return field3857;
   }

   public RSDeque[][][] getGroundItemDeque() {
      return field3761;
   }

   public boolean isMenuOpen() {
      return field3939;
   }

   public void packetHandler() {
      this.vmethod5962();
   }

   public void revalidateWidget(Widget var1) {
      this.method6330((class329)var1);
   }

   public RSIndexedSprite[] getMapScene() {
      return class294.field3173;
   }

   public RSPlayer getLocalPlayer() {
      return class5.field43;
   }

   public void setAnimOffsetX(int var1) {
      class200.field1933 = var1;
   }

   public void setAnimOffsetY(int var1) {
      class200.field1934 = var1;
   }

   public void setAnimOffsetZ(int var1) {
      class200.field1927 = var1;
   }

   public RSWorld[] getWorldList() {
      return class126.field1187;
   }

   public RSIndexDataBase getIndexScripts() {
      return class126.field1194;
   }

   public void changeWorld(World var1) {
      class86.method1252((class126)var1);
   }

   public void revalidateWidgetScroll(Widget[] var1, Widget var2, boolean var3) {
      class130.method2395((class329[])var1, (class329)var2, var3);
   }

   @Override
   public void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
      this.menuAction(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   public RSObjectComposition getObjectDefinition(int var1) {
      return class152.method2696(var1);
   }

   public void setIntStackSize(int var1) {
      class171.field1587 = var1;
   }

   public int getIntStackSize() {
      return class171.field1587;
   }

   public int[] getMapRegions() {
      return class2.field20;
   }

   public RSRenderOverview getRenderOverview() {
      return class63.field587;
   }

   public int getBaseY() {
      return class284.somey;
   }

   public RSNPCComposition getNpcDefinition(int var1) {
      return class25.method361(var1);
   }

   public RSNodeCache getVarbitCache() {
      return class213.field2060;
   }

   public RSItemComposition getItemDefinition(int var1) {
      return class67.method1152(var1);
   }

   public void setCompass(SpritePixels var1) {
      class150.field1436 = (class26)var1;
   }

   public int[][] getXteaKeys() {
      return class77.field711;
   }

   public RSIndexDataBase getIndexSprites() {
      return class170.field1577;
   }

   public int getMouseIdleTicks() {
      return class226.field2209;
   }

   public int getMouseCurrentButton() {
      return class226.field2223;
   }

   public long getMouseLastPressedMillis() {
      return class226.field2225;
   }

   public int getCameraY() {
      return class50.field375;
   }

   public RSPreferences getPreferences() {
      return class153.field1455;
   }

   public int getCameraYaw() {
      return class61.field469;
   }

   public int getCameraX() {
      return class83.field738;
   }

   public int getRevision() {
      return class302.field3233;
   }

   public void setUsername(String var1) {
      class325.field3480 = var1;
   }

   public String getUsername() {
      return class325.field3480;
   }

   public int[][][] getTileHeights() {
      return class31.field249;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-758986826"
   )
   static int method6374(int var0, class252 var1, boolean var2) {
      class329 var3;
      if(var0 >= 2000) {
         var0 -= 1000;
         var3 = class189.getWidget(class55.field407[--class171.field1587]);
      } else {
         var3 = var2?class182.field1766:class20.field155;
      }

      String var4 = class55.field408[--class272.field2978];
      int[] var5 = null;
      if(var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
         int var6 = class55.field407[--class171.field1587];
         if(var6 > 0) {
            for(var5 = new int[var6]; var6-- > 0; var5[var6] = class55.field407[--class171.field1587]) {
               ;
            }
         }

         var4 = var4.substring(0, var4.length() - 1);
      }

      Object[] var8 = new Object[var4.length() + 1];

      int var7;
      for(var7 = var8.length - 1; var7 >= 1; --var7) {
         if(var4.charAt(var7 - 1) == 's') {
            var8[var7] = class55.field408[--class272.field2978];
         } else {
            var8[var7] = new Integer(class55.field407[--class171.field1587]);
         }
      }

      var7 = class55.field407[--class171.field1587];
      if(var7 != -1) {
         var8[0] = new Integer(var7);
      } else {
         var8 = null;
      }

      if(var0 == 1400) {
         var3.field3629 = var8;
      } else if(var0 == 1401) {
         var3.field3635 = var8;
      } else if(var0 == 1402) {
         var3.field3542 = var8;
      } else if(var0 == 1403) {
         var3.field3636 = var8;
      } else if(var0 == 1404) {
         var3.field3634 = var8;
      } else if(var0 == 1405) {
         var3.field3639 = var8;
      } else if(var0 == 1406) {
         var3.field3642 = var8;
      } else if(var0 == 1407) {
         var3.field3643 = var8;
         var3.field3644 = var5;
      } else if(var0 == 1408) {
         var3.field3670 = var8;
      } else if(var0 == 1409) {
         var3.field3650 = var8;
      } else if(var0 == 1410) {
         var3.field3640 = var8;
      } else if(var0 == 1411) {
         var3.field3654 = var8;
      } else if(var0 == 1412) {
         var3.field3608 = var8;
      } else if(var0 == 1414) {
         var3.field3645 = var8;
         var3.field3646 = var5;
      } else if(var0 == 1415) {
         var3.field3647 = var8;
         var3.field3624 = var5;
      } else if(var0 == 1416) {
         var3.field3666 = var8;
      } else if(var0 == 1417) {
         var3.field3651 = var8;
      } else if(var0 == 1418) {
         var3.field3652 = var8;
      } else if(var0 == 1419) {
         var3.field3575 = var8;
      } else if(var0 == 1420) {
         var3.field3589 = var8;
      } else if(var0 == 1421) {
         var3.field3576 = var8;
      } else if(var0 == 1422) {
         var3.field3637 = var8;
      } else if(var0 == 1423) {
         var3.field3595 = var8;
      } else if(var0 == 1424) {
         var3.field3658 = var8;
      } else if(var0 == 1425) {
         var3.field3660 = var8;
      } else if(var0 == 1426) {
         var3.field3661 = var8;
      } else {
         if(var0 != 1427) {
            return 2;
         }

         var3.field3659 = var8;
      }

      var3.field3630 = true;
      return 1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "-80"
   )
   static int method6375(int var0, int var1) {
      class292 var2 = (class292)class292.field3153.method5310((long)var0);
      if(var2 == null) {
         return 0;
      } else if(var1 == -1) {
         return 0;
      } else {
         int var3 = 0;

         for(int var4 = 0; var4 < var2.field3154.length; ++var4) {
            if(var2.field3150[var4] == var1) {
               var3 += var2.field3154[var4];
            }
         }

         return var3;
      }
   }

   @ObfuscatedSignature(
      signature = "(Lbs;IB)V"
   )
   public static void copy$runScript(class9 var0, int var1, byte var2) {
      Object[] var3 = var0.field69;
      Object var4;
      int var18;
      if(class201.method3448(var0.field72)) {
         class31.field254 = (class326)var3[0];
         class191 var5 = class59.method1036(class31.field254.field3504);
         var4 = currentScript = class281.method5008(var0.field72, var5.field1835, var5.field1837);
      } else {
         var18 = currentScriptPC = ((Integer)var3[0]).intValue();
         var4 = currentScript = class322.method5706(var18);
      }

      if(var4 != null) {
         class171.field1587 = 0;
         class272.field2978 = 0;
         currentScriptPC = -1;
         var18 = -1;
         int[] var6 = ((class252)var4).field2499;
         int[] var7 = ((class252)var4).field2491;
         byte var8 = -1;
         class55.field409 = 0;
         class55.field413 = false;
         boolean var28 = false;

         label895: {
            label896: {
               try {
                  int var11;
                  try {
                     label945: {
                        var28 = true;
                        class55.field406 = new int[((class252)var4).field2493];
                        int var9 = 0;
                        class128.field1219 = new String[((class252)var4).field2502];
                        int var10 = 0;

                        int var12;
                        int var10000;
                        String var19;
                        for(var11 = 1; var11 < var3.length; ++var11) {
                           if(var2 <= 1) {
                              return;
                           }

                           if(var3[var11] instanceof Integer) {
                              var12 = ((Integer)var3[var11]).intValue();
                              if(var12 == -2147483647) {
                                 var12 = var0.field68;
                              }

                              if(var12 == -2147483646) {
                                 var12 = var0.field65;
                              }

                              if(var12 == -2147483645) {
                                 var12 = var0.field63 != null?var0.field63.field3607:-1;
                              }

                              if(var12 == -2147483644) {
                                 var12 = var0.field66;
                              }

                              if(var12 == -2147483643) {
                                 var12 = var0.field63 != null?var0.field63.field3606:-1;
                              }

                              if(var12 == -2147483642) {
                                 if(var0.field71 != null) {
                                    if(var2 <= 1) {
                                       return;
                                    }

                                    var10000 = var0.field71.field3607;
                                 } else {
                                    var10000 = -1;
                                 }

                                 var12 = var10000;
                              }

                              if(var12 == -2147483641) {
                                 if(var2 <= 1) {
                                    return;
                                 }

                                 if(var0.field71 != null) {
                                    if(var2 <= 1) {
                                       return;
                                    }

                                    var10000 = var0.field71.field3606;
                                 } else {
                                    var10000 = -1;
                                 }

                                 var12 = var10000;
                              }

                              if(var12 == -2147483640) {
                                 if(var2 <= 1) {
                                    return;
                                 }

                                 var12 = var0.field64;
                              }

                              if(var12 == -2147483639) {
                                 if(var2 <= 1) {
                                    return;
                                 }

                                 var12 = var0.field75;
                              }

                              class55.field406[var9++] = var12;
                           } else if(var3[var11] instanceof String) {
                              if(var2 <= 1) {
                                 return;
                              }

                              var19 = (String)var3[var11];
                              if(var19.equals("event_opbase")) {
                                 var19 = var0.field70;
                              }

                              class128.field1219[var10++] = var19;
                           }
                        }

                        var11 = 0;
                        class55.field404 = var0.field73;

                        while(true) {
                           ++var11;
                           if(var11 > var1) {
                              throw new RuntimeException();
                           }

                           int var31;
                           do {
                              ++var18;
                              currentScriptPC = var18;
                              var31 = var6[var18];
                           } while(vmExecuteOpcode(var31));

                           int var21;
                           if(var31 >= 100) {
                              boolean var35;
                              if(((class252)var4).field2491[var18] == 1) {
                                 var35 = true;
                              } else {
                                 var35 = false;
                              }

                              var21 = class57.method1016(var31, (class252)var4, var35);
                              switch(var21) {
                              case 0:
                                 var28 = false;
                                 break label945;
                              case 1:
                              default:
                                 break;
                              case 2:
                                 throw new IllegalStateException();
                              }
                           } else {
                              if(var2 <= 1) {
                                 return;
                              }

                              if(var31 == 0) {
                                 class55.field407[++class171.field1587 - 1] = var7[var18];
                              } else if(var31 == 1) {
                                 var12 = var7[var18];
                                 class55.field407[++class171.field1587 - 1] = class215.field2071[var12];
                              } else if(var31 == 2) {
                                 var12 = var7[var18];
                                 class215.field2071[var12] = class55.field407[--class171.field1587];
                                 settingsChanged(var12);
                                 class261.method4673(var12);
                              } else if(var31 == 3) {
                                 class55.field408[++class272.field2978 - 1] = ((class252)var4).field2492[var18];
                              } else {
                                 int var10001;
                                 if(var31 == 6) {
                                    if(var2 <= 1) {
                                       return;
                                    }

                                    var10001 = var7[var18];
                                    var10000 = var18 + var7[var18];
                                    currentScriptPC = var18 + var10001;
                                    var18 = var10000;
                                 } else if(var31 == 7) {
                                    class171.field1587 -= 2;
                                    if(class55.field407[class171.field1587] != class55.field407[class171.field1587 + 1]) {
                                       var10001 = var7[var18];
                                       var10000 = var18 + var7[var18];
                                       currentScriptPC = var18 + var10001;
                                       var18 = var10000;
                                    }
                                 } else if(var31 == 8) {
                                    class171.field1587 -= 2;
                                    if(class55.field407[class171.field1587] == class55.field407[class171.field1587 + 1]) {
                                       var10001 = var7[var18];
                                       var10000 = var18 + var7[var18];
                                       currentScriptPC = var18 + var10001;
                                       var18 = var10000;
                                    }
                                 } else if(var31 == 9) {
                                    class171.field1587 -= 2;
                                    if(class55.field407[class171.field1587] < class55.field407[class171.field1587 + 1]) {
                                       var10001 = var7[var18];
                                       var10000 = var18 + var7[var18];
                                       currentScriptPC = var18 + var10001;
                                       var18 = var10000;
                                    }
                                 } else if(var31 == 10) {
                                    class171.field1587 -= 2;
                                    if(class55.field407[class171.field1587] > class55.field407[class171.field1587 + 1]) {
                                       var10001 = var7[var18];
                                       var10000 = var18 + var7[var18];
                                       currentScriptPC = var18 + var10001;
                                       var18 = var10000;
                                    }
                                 } else if(var31 == 21) {
                                    if(class55.field409 == 0) {
                                       var28 = false;
                                       break label896;
                                    }

                                    class263 var36 = class55.field402[--class55.field409];
                                    var4 = currentScript = var36.field2908;
                                    var6 = ((class252)var4).field2499;
                                    var7 = ((class252)var4).field2491;
                                    var18 = currentScriptPC = var36.field2906;
                                    class55.field406 = var36.field2907;
                                    class128.field1219 = var36.field2905;
                                 } else if(var31 == 25) {
                                    var12 = var7[var18];
                                    class55.field407[++class171.field1587 - 1] = class52.method859(var12);
                                 } else if(var31 == 27) {
                                    var12 = var7[var18];
                                    class25.method364(var12, class55.field407[--class171.field1587]);
                                 } else if(var31 == 31) {
                                    class171.field1587 -= 2;
                                    if(class55.field407[class171.field1587] <= class55.field407[class171.field1587 + 1]) {
                                       var10001 = var7[var18];
                                       var10000 = var18 + var7[var18];
                                       currentScriptPC = var18 + var10001;
                                       var18 = var10000;
                                    }
                                 } else if(var31 == 32) {
                                    class171.field1587 -= 2;
                                    if(class55.field407[class171.field1587] >= class55.field407[class171.field1587 + 1]) {
                                       var10001 = var7[var18];
                                       var10000 = var18 + var7[var18];
                                       currentScriptPC = var18 + var10001;
                                       var18 = var10000;
                                    }
                                 } else if(var31 == 33) {
                                    class55.field407[++class171.field1587 - 1] = class55.field406[var7[var18]];
                                 } else if(var31 == 34) {
                                    class55.field406[var7[var18]] = class55.field407[--class171.field1587];
                                 } else if(var31 == 35) {
                                    class55.field408[++class272.field2978 - 1] = class128.field1219[var7[var18]];
                                 } else if(var31 == 36) {
                                    class128.field1219[var7[var18]] = class55.field408[--class272.field2978];
                                 } else if(var31 == 37) {
                                    var12 = var7[var18];
                                    class272.field2978 -= var12;
                                    String var33 = class204.method3477(class55.field408, class272.field2978, var12);
                                    class55.field408[++class272.field2978 - 1] = var33;
                                 } else if(var31 == 38) {
                                    if(var2 <= 1) {
                                       return;
                                    }

                                    --class171.field1587;
                                 } else if(var31 == 39) {
                                    --class272.field2978;
                                 } else {
                                    int var16;
                                    if(var31 != 40) {
                                       if(var31 == 42) {
                                          if(var2 <= 1) {
                                             return;
                                          }

                                          class55.field407[++class171.field1587 - 1] = class125.field1183.method866(var7[var18]);
                                       } else if(var31 == 43) {
                                          class125.field1183.method865(var7[var18], class55.field407[--class171.field1587]);
                                       } else if(var31 == 44) {
                                          var12 = var7[var18] >> 16;
                                          var21 = var7[var18] & 65535;
                                          int var22 = class55.field407[--class171.field1587];
                                          if(var22 < 0 || var22 > 5000) {
                                             throw new RuntimeException();
                                          }

                                          class55.field410[var12] = var22;
                                          byte var23 = -1;
                                          if(var21 == 105) {
                                             var23 = 0;
                                          }

                                          for(var16 = 0; var16 < var22; ++var16) {
                                             class55.field415[var12][var16] = var23;
                                          }
                                       } else if(var31 == 45) {
                                          if(var2 <= 1) {
                                             return;
                                          }

                                          var12 = var7[var18];
                                          var21 = class55.field407[--class171.field1587];
                                          if(var21 < 0) {
                                             break;
                                          }

                                          if(var21 >= class55.field410[var12]) {
                                             if(var2 <= 1) {
                                                return;
                                             }
                                             break;
                                          }

                                          class55.field407[++class171.field1587 - 1] = class55.field415[var12][var21];
                                       } else if(var31 == 46) {
                                          var12 = var7[var18];
                                          class171.field1587 -= 2;
                                          var21 = class55.field407[class171.field1587];
                                          if(var21 < 0 || var21 >= class55.field410[var12]) {
                                             throw new RuntimeException();
                                          }

                                          class55.field415[var12][var21] = class55.field407[class171.field1587 + 1];
                                       } else if(var31 == 47) {
                                          if(var2 <= 1) {
                                             return;
                                          }

                                          var19 = class125.field1183.method891(var7[var18]);
                                          if(var19 == null) {
                                             var19 = "null";
                                          }

                                          class55.field408[++class272.field2978 - 1] = var19;
                                       } else if(var31 == 48) {
                                          class125.field1183.method867(var7[var18], class55.field408[--class272.field2978]);
                                       } else {
                                          if(var31 != 60) {
                                             throw new IllegalStateException();
                                          }

                                          class46 var34 = ((class252)var4).field2497[var7[var18]];
                                          class262 var32 = (class262)var34.method792((long)class55.field407[--class171.field1587]);
                                          if(var32 != null) {
                                             var18 = currentScriptPC = var18 + var32.field2904;
                                          }
                                       }
                                    } else {
                                       var12 = var7[var18];
                                       class252 var13 = class322.method5706(var12);
                                       int[] var14 = new int[var13.field2493];
                                       String[] var15 = new String[var13.field2502];

                                       for(var16 = 0; var16 < var13.field2495; ++var16) {
                                          var14[var16] = class55.field407[var16 + (class171.field1587 - var13.field2495)];
                                       }

                                       for(var16 = 0; var16 < var13.field2494; ++var16) {
                                          if(var2 <= 1) {
                                             return;
                                          }

                                          var15[var16] = class55.field408[var16 + (class272.field2978 - var13.field2494)];
                                       }

                                       class171.field1587 -= var13.field2495;
                                       class272.field2978 -= var13.field2494;
                                       class263 var20 = new class263();
                                       var20.field2908 = (class252)var4;
                                       var20.field2906 = var18;
                                       var20.field2907 = class55.field406;
                                       var20.field2905 = class128.field1219;
                                       class55.field402[++class55.field409 - 1] = var20;
                                       currentScript = var13;
                                       var4 = var13;
                                       var6 = var13.field2499;
                                       var7 = var13.field2491;
                                       currentScriptPC = -1;
                                       var18 = -1;
                                       class55.field406 = var14;
                                       class128.field1219 = var15;
                                    }
                                 }
                              }
                           }
                        }

                        throw new RuntimeException();
                     }
                  } catch (Exception var29) {
                     StringBuilder var25 = new StringBuilder(30);
                     var25.append("").append(((class76)var4).field704).append(" ");

                     for(var11 = class55.field409 - 1; var11 >= 0; --var11) {
                        var25.append("").append(class55.field402[var11].field2908.field704).append(" ");
                     }

                     var25.append("").append(var8);
                     class295.method5145(var25.toString(), var29, 1543025593);
                     var28 = false;
                     break label895;
                  }
               } finally {
                  if(var28) {
                     if(class55.field413) {
                        class55.field414 = true;
                        class314.method5541();
                        class55.field414 = false;
                        class55.field413 = false;
                     }

                  }
               }

               if(class55.field413) {
                  class55.field414 = true;
                  class314.method5541();
                  class55.field414 = false;
                  class55.field413 = false;
               }

               return;
            }

            if(class55.field413) {
               class55.field414 = true;
               class314.method5541();
               class55.field414 = false;
               class55.field413 = false;
            }

            return;
         }

         if(class55.field413) {
            if(var2 <= 1) {
               return;
            }

            class55.field414 = true;
            class314.method5541();
            class55.field414 = false;
            class55.field413 = false;
         }

      }
   }

   public static void onAddChatMessage(int var0, String var1, String var2, String var3) {
      Logger var4 = class113.field1064.getLogger();
      if(var4.isDebugEnabled()) {
         var4.debug("Chat message type {}: {}", ChatMessageType.of(var0), var2);
      }

      ChatMessageType var5 = ChatMessageType.of(var0);
      ChatMessage var6 = new ChatMessage(var5, var1, var2, var3);
      class113.field1064.getCallbacks().post(var6);
   }

   public static void copy$processClientError(String var0, Throwable var1, int var2) {
      try {
         String var3 = "";
         if(var1 != null) {
            Throwable var5 = var1;
            String var6;
            if(var1 instanceof class302) {
               if(var2 == -1921706377) {
                  return;
               }

               class302 var7 = (class302)var1;
               var6 = var7.field3235 + " | ";
               var5 = var7.field3234;
            } else {
               var6 = "";
            }

            StringWriter var19 = new StringWriter();
            PrintWriter var8 = new PrintWriter(var19);
            var5.printStackTrace(var8);
            var8.close();
            String var9 = var19.toString();
            BufferedReader var10 = new BufferedReader(new StringReader(var9));
            String var11 = var10.readLine();

            while(true) {
               String var12 = var10.readLine();
               if(var12 == null) {
                  if(var2 == -1921706377) {
                     return;
                  }

                  var6 = var6 + "| " + var11;
                  var3 = var6;
                  break;
               }

               int var13 = var12.indexOf(40);
               int var14 = var12.indexOf(41, var13 + 1);
               if(var13 >= 0) {
                  if(var2 == -1921706377) {
                     return;
                  }

                  if(var14 >= 0) {
                     if(var2 == -1921706377) {
                        return;
                     }

                     String var15 = var12.substring(var13 + 1, var14);
                     int var16 = var15.indexOf(".java:");
                     if(var16 >= 0) {
                        var15 = var15.substring(0, var16) + var15.substring(var16 + 5);
                        var6 = var6 + var15 + ' ';
                        continue;
                     }

                     var12 = var12.substring(0, var13);
                  }
               }

               var12 = var12.trim();
               var12 = var12.substring(var12.lastIndexOf(32) + 1);
               var12 = var12.substring(var12.lastIndexOf(9) + 1);
               var6 = var6 + var12 + ' ';
            }
         }

         if(var0 != null) {
            if(var1 != null) {
               var3 = var3 + " | ";
            }

            var3 = var3 + var0;
         }

         System.out.println("Error: " + var3);
         var3 = var3.replace(':', '.');
         var3 = var3.replace('@', '_');
         var3 = var3.replace('&', '_');
         var3 = var3.replace('#', '_');
         if(class302.field3236 == null) {
            return;
         }

         URL var4 = new URL(class302.field3236.getCodeBase(), "clienterror.ws?c=" + class302.field3233 + "&u=" + class302.field3232 + "&v1=" + class160.field1500 + "&v2=" + class164.field1520 + "&ct=" + class302.field3231 + "&e=" + var3);
         DataInputStream var18 = new DataInputStream(var4.openStream());
         var18.read();
         var18.close();
      } catch (Exception var17) {
         ;
      }

   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void gameStateChanged(int var0) {
      GameStateChanged var1 = new GameStateChanged();
      var1.setGameState(class113.field1064.getGameState());
      class113.field1064.getCallbacks().post(var1);
   }

   @ObfuscatedSignature(
      signature = "(Lik;IIB)Llp;"
   )
   public static class26 copy$getSpriteAsSpritePixels(class148 var0, int var1, int var2, byte var3) {
      byte[] var5 = var0.method2579(var1, var2, -2010426741);
      boolean var4;
      if(var5 == null) {
         var4 = false;
      } else {
         class194.method3303(var5);
         var4 = true;
      }

      if(!var4) {
         return null;
      } else {
         class26 var6 = new class26();
         var6.field207 = class112.field1057;
         var6.field210 = class112.field1054;
         var6.field204 = class120.field1149[0];
         var6.field205 = class112.field1055[0];
         var6.field202 = class112.field1052[0];
         var6.field201 = class167.field1544[0];
         int var7 = var6.field201 * var6.field202;
         byte[] var8 = class161.field1507[0];
         var6.field203 = new int[var7];

         for(int var9 = 0; var9 < var7; ++var9) {
            var6.field203[var9] = class192.field1841[var8[var9] & 255];
         }

         class120.field1149 = null;
         class112.field1055 = null;
         class112.field1052 = null;
         class167.field1544 = null;
         class192.field1841 = null;
         class161.field1507 = null;
         return var6;
      }
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void onPitchSinChanged(int var0) {
      if(pitchRelaxEnabled && class312.isDrawingScene) {
         class113.field1064.setPitchSin(Perspective.SINE[class113.field1064.getCameraPitch()]);
      }

   }

   public static final void copy$menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7, byte var8) {
      if(var2 >= 2000) {
         if(var8 <= 0) {
            return;
         }

         var2 -= 2000;
      }

      class279 var9;
      if(var2 == 1) {
         field3949 = var6;
         field3834 = var7;
         field3836 = 2;
         field3824 = 0;
         field3795 = var0;
         field3993 = var1;
         var9 = class95.writeClientProt(ClientProt.ITEM_ON_OBJECT, field3963.field1162);
         var9.field3018.writeShortLE128(class284.somey + var1);
         var9.field3018.writeShortLE(class213.field2059);
         var9.field3018.writeByte128(class135.field1332[82]?1:0);
         var9.field3018.writeIntLE(class7.field53);
         var9.field3018.writeShortLE128(var0 + class296.somex);
         var9.field3018.writeShort(var3);
         var9.field3018.writeShortLE(class41.field325);
         field3963.method2235(var9);
      } else if(var2 == 2) {
         field3949 = var6;
         field3834 = var7;
         field3836 = 2;
         field3824 = 0;
         field3795 = var0;
         field3993 = var1;
         var9 = class95.writeClientProt(ClientProt.INTERFACE_ON_OBJECT, field3963.field1162);
         var9.field3018.writeByte(class135.field1332[82]?1:0);
         var9.field3018.writeShort(var0 + class296.somex);
         var9.field3018.writeShort128(var3);
         var9.field3018.writeIntV2(class98.field914);
         var9.field3018.writeShort(field3888);
         var9.field3018.writeShortLE(class284.somey + var1);
         field3963.method2235(var9);
      } else if(var2 == 3) {
         field3949 = var6;
         field3834 = var7;
         field3836 = 2;
         field3824 = 0;
         field3795 = var0;
         field3993 = var1;
         var9 = class95.writeClientProt(ClientProt.OBJECT_ACTION1, field3963.field1162);
         var9.field3018.writeShort(class284.somey + var1);
         var9.field3018.write128Byte(class135.field1332[82]?1:0);
         var9.field3018.writeShort128(var3);
         var9.field3018.writeShortLE128(var0 + class296.somex);
         field3963.method2235(var9);
      } else {
         class214 var10000;
         byte var10001;
         if(var2 == 4) {
            field3949 = var6;
            field3834 = var7;
            field3836 = 2;
            field3824 = 0;
            field3795 = var0;
            field3993 = var1;
            var9 = class95.writeClientProt(ClientProt.OBJECT_ACTION2, field3963.field1162);
            var10000 = var9.field3018;
            if(class135.field1332[82]) {
               if(var8 <= 0) {
                  return;
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            var10000.writeByte128(var10001);
            var9.field3018.writeShort(var3);
            var9.field3018.writeShort(class284.somey + var1);
            var9.field3018.writeShort(var0 + class296.somex);
            field3963.method2235(var9);
         } else if(var2 == 5) {
            field3949 = var6;
            field3834 = var7;
            field3836 = 2;
            field3824 = 0;
            field3795 = var0;
            field3993 = var1;
            var9 = class95.writeClientProt(ClientProt.OBJECT_ACTION3, field3963.field1162);
            var9.field3018.writeShortLE128(var0 + class296.somex);
            var9.field3018.writeShort128(var3);
            var9.field3018.writeShortLE128(class284.somey + var1);
            var9.field3018.writeByte128(class135.field1332[82]?1:0);
            field3963.method2235(var9);
         } else if(var2 == 6) {
            field3949 = var6;
            field3834 = var7;
            field3836 = 2;
            field3824 = 0;
            field3795 = var0;
            field3993 = var1;
            var9 = class95.writeClientProt(ClientProt.OBJECT_ACTION4, field3963.field1162);
            var9.field3018.writeByte128(class135.field1332[82]?1:0);
            var9.field3018.writeShort128(class284.somey + var1);
            var9.field3018.writeShort128(var0 + class296.somex);
            var9.field3018.writeShortLE(var3);
            field3963.method2235(var9);
         } else {
            class279 var10;
            class237 var14;
            if(var2 == 7) {
               var14 = field3774[var3];
               if(var14 != null) {
                  field3949 = var6;
                  field3834 = var7;
                  field3836 = 2;
                  field3824 = 0;
                  field3795 = var0;
                  field3993 = var1;
                  var10 = class95.writeClientProt(ClientProt.ITEM_ON_NPC, field3963.field1162);
                  var10.field3018.writeShortLE128(class41.field325);
                  var10.field3018.writeShort(class213.field2059);
                  var10.field3018.writeShortLE128(var3);
                  var10.field3018.writeByteC(class135.field1332[82]?1:0);
                  var10.field3018.writeInt(class7.field53);
                  field3963.method2235(var10);
               }
            } else if(var2 == 8) {
               var14 = field3774[var3];
               if(var14 != null) {
                  if(var8 <= 0) {
                     return;
                  }

                  field3949 = var6;
                  field3834 = var7;
                  field3836 = 2;
                  field3824 = 0;
                  field3795 = var0;
                  field3993 = var1;
                  var10 = class95.writeClientProt(ClientProt.INTERFACE_ON_NPC, field3963.field1162);
                  var10.field3018.writeShortLE128(var3);
                  var10.field3018.writeByteC(class135.field1332[82]?1:0);
                  var10.field3018.writeIntLE(class98.field914);
                  var10.field3018.writeShort128(field3888);
                  field3963.method2235(var10);
               }
            } else if(var2 == 9) {
               var14 = field3774[var3];
               if(var14 != null) {
                  field3949 = var6;
                  field3834 = var7;
                  field3836 = 2;
                  field3824 = 0;
                  field3795 = var0;
                  field3993 = var1;
                  var10 = class95.writeClientProt(ClientProt.NPC_ACTION1, field3963.field1162);
                  var10.field3018.writeByteC(class135.field1332[82]?1:0);
                  var10.field3018.writeShortLE(var3);
                  field3963.method2235(var10);
               }
            } else if(var2 == 10) {
               var14 = field3774[var3];
               if(var14 != null) {
                  field3949 = var6;
                  field3834 = var7;
                  field3836 = 2;
                  field3824 = 0;
                  field3795 = var0;
                  field3993 = var1;
                  var10 = class95.writeClientProt(ClientProt.NPC_ATTACK, field3963.field1162);
                  var10.field3018.writeShort128(var3);
                  var10.field3018.writeByte(class135.field1332[82]?1:0);
                  field3963.method2235(var10);
               }
            } else if(var2 == 11) {
               var14 = field3774[var3];
               if(var14 != null) {
                  if(var8 <= 0) {
                     return;
                  }

                  field3949 = var6;
                  field3834 = var7;
                  field3836 = 2;
                  field3824 = 0;
                  field3795 = var0;
                  field3993 = var1;
                  var10 = class95.writeClientProt(ClientProt.NPC_ACTION2, field3963.field1162);
                  var10.field3018.writeShortLE128(var3);
                  var10.field3018.writeByte(class135.field1332[82]?1:0);
                  field3963.method2235(var10);
               }
            } else if(var2 == 12) {
               var14 = field3774[var3];
               if(var14 != null) {
                  field3949 = var6;
                  field3834 = var7;
                  field3836 = 2;
                  field3824 = 0;
                  field3795 = var0;
                  field3993 = var1;
                  var10 = class95.writeClientProt(ClientProt.NPC_ACTION3, field3963.field1162);
                  var10.field3018.writeShort(var3);
                  var10.field3018.writeByte128(class135.field1332[82]?1:0);
                  field3963.method2235(var10);
               }
            } else if(var2 == 13) {
               var14 = field3774[var3];
               if(var14 != null) {
                  if(var8 <= 0) {
                     return;
                  }

                  field3949 = var6;
                  field3834 = var7;
                  field3836 = 2;
                  field3824 = 0;
                  field3795 = var0;
                  field3993 = var1;
                  var10 = class95.writeClientProt(ClientProt.NPC_ACTION4, field3963.field1162);
                  var10000 = var10.field3018;
                  if(class135.field1332[82]) {
                     if(var8 <= 0) {
                        return;
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 0;
                  }

                  var10000.writeByte(var10001);
                  var10.field3018.writeShort128(var3);
                  field3963.method2235(var10);
               }
            } else {
               class63 var16;
               if(var2 == 14) {
                  var16 = field3848[var3];
                  if(var16 != null) {
                     field3949 = var6;
                     field3834 = var7;
                     field3836 = 2;
                     field3824 = 0;
                     field3795 = var0;
                     field3993 = var1;
                     var10 = class95.writeClientProt(ClientProt.ITEM_ON_PLAYER, field3963.field1162);
                     var10.field3018.writeShortLE128(class213.field2059);
                     var10.field3018.write128Byte(class135.field1332[82]?1:0);
                     var10.field3018.writeIntV1(class7.field53);
                     var10.field3018.writeShort(var3);
                     var10.field3018.writeShort(class41.field325);
                     field3963.method2235(var10);
                  }
               } else if(var2 == 15) {
                  var16 = field3848[var3];
                  if(var16 != null) {
                     if(var8 <= 0) {
                        return;
                     }

                     field3949 = var6;
                     field3834 = var7;
                     field3836 = 2;
                     field3824 = 0;
                     field3795 = var0;
                     field3993 = var1;
                     var10 = class95.writeClientProt(ClientProt.INTERFACE_ON_PLAYER, field3963.field1162);
                     var10.field3018.writeIntV2(class98.field914);
                     var10000 = var10.field3018;
                     if(class135.field1332[82]) {
                        if(var8 <= 0) {
                           return;
                        }

                        var10001 = 1;
                     } else {
                        var10001 = 0;
                     }

                     var10000.write128Byte(var10001);
                     var10.field3018.writeShort128(field3888);
                     var10.field3018.writeShort(var3);
                     field3963.method2235(var10);
                  }
               } else if(var2 == 16) {
                  field3949 = var6;
                  field3834 = var7;
                  field3836 = 2;
                  field3824 = 0;
                  field3795 = var0;
                  field3993 = var1;
                  var9 = class95.writeClientProt(ClientProt.ITEM_ON_FLOORITEM, field3963.field1162);
                  var9.field3018.writeIntV1(class7.field53);
                  var9.field3018.writeShortLE128(class41.field325);
                  var9.field3018.writeByte128(class135.field1332[82]?1:0);
                  var9.field3018.writeShortLE(class213.field2059);
                  var9.field3018.writeShortLE128(var3);
                  var9.field3018.writeShortLE128(var0 + class296.somex);
                  var9.field3018.writeShortLE(class284.somey + var1);
                  field3963.method2235(var9);
               } else if(var2 == 17) {
                  field3949 = var6;
                  field3834 = var7;
                  field3836 = 2;
                  field3824 = 0;
                  field3795 = var0;
                  field3993 = var1;
                  var9 = class95.writeClientProt(ClientProt.INTERFACE_ON_FLOORITEM, field3963.field1162);
                  var9.field3018.writeIntV1(class98.field914);
                  var9.field3018.writeShort(field3888);
                  var9.field3018.writeShort128(class284.somey + var1);
                  var9.field3018.writeShort128(var0 + class296.somex);
                  var9.field3018.writeByte128(class135.field1332[82]?1:0);
                  var9.field3018.writeShortLE(var3);
                  field3963.method2235(var9);
               } else if(var2 == 18) {
                  field3949 = var6;
                  field3834 = var7;
                  field3836 = 2;
                  field3824 = 0;
                  field3795 = var0;
                  field3993 = var1;
                  var9 = class95.writeClientProt(ClientProt.FLOORITEM_ACTION1, field3963.field1162);
                  var9.field3018.writeShortLE128(class284.somey + var1);
                  var9.field3018.writeShortLE(var3);
                  var9.field3018.writeShortLE(var0 + class296.somex);
                  var9.field3018.writeByte(class135.field1332[82]?1:0);
                  field3963.method2235(var9);
               } else if(var2 == 19) {
                  field3949 = var6;
                  field3834 = var7;
                  field3836 = 2;
                  field3824 = 0;
                  field3795 = var0;
                  field3993 = var1;
                  var9 = class95.writeClientProt(ClientProt.FLOORITEM_ACTION2, field3963.field1162);
                  var9.field3018.writeShortLE128(var3);
                  var9.field3018.writeShort128(var0 + class296.somex);
                  var9.field3018.writeShort(class284.somey + var1);
                  var9.field3018.writeByte(class135.field1332[82]?1:0);
                  field3963.method2235(var9);
               } else if(var2 == 20) {
                  field3949 = var6;
                  field3834 = var7;
                  field3836 = 2;
                  field3824 = 0;
                  field3795 = var0;
                  field3993 = var1;
                  var9 = class95.writeClientProt(ClientProt.FLOORITEM_ACTION3, field3963.field1162);
                  var9.field3018.writeShortLE(class284.somey + var1);
                  var9.field3018.write128Byte(class135.field1332[82]?1:0);
                  var9.field3018.writeShortLE(var0 + class296.somex);
                  var9.field3018.writeShortLE(var3);
                  field3963.method2235(var9);
               } else if(var2 == 21) {
                  field3949 = var6;
                  field3834 = var7;
                  field3836 = 2;
                  field3824 = 0;
                  field3795 = var0;
                  field3993 = var1;
                  var9 = class95.writeClientProt(ClientProt.FLOORITEM_ACTION4, field3963.field1162);
                  var9.field3018.writeShort128(class284.somey + var1);
                  var9.field3018.writeShortLE(var3);
                  var9.field3018.writeShort(var0 + class296.somex);
                  var9.field3018.write128Byte(class135.field1332[82]?1:0);
                  field3963.method2235(var9);
               } else if(var2 == 22) {
                  if(var8 <= 0) {
                     return;
                  }

                  field3949 = var6;
                  field3834 = var7;
                  field3836 = 2;
                  field3824 = 0;
                  field3795 = var0;
                  field3993 = var1;
                  var9 = class95.writeClientProt(ClientProt.FLOORITEM_ACTION5, field3963.field1162);
                  var9.field3018.writeByte(class135.field1332[82]?1:0);
                  var9.field3018.writeShortLE128(var3);
                  var9.field3018.writeShort128(class284.somey + var1);
                  var9.field3018.writeShort(var0 + class296.somex);
                  field3963.method2235(var9);
               } else if(var2 == 23) {
                  if(field3939) {
                     if(var8 <= 0) {
                        return;
                     }

                     class258.field2566.method5369();
                  } else {
                     class258.field2566.method5502(class315.plane, var0, var1, true);
                  }
               } else {
                  class279 var11;
                  class329 var17;
                  if(var2 == 24) {
                     var17 = class189.getWidget(var1);
                     boolean var12 = true;
                     if(var17.field3548 > 0) {
                        if(var8 <= 0) {
                           return;
                        }

                        var12 = class275.method4912(var17);
                     }

                     if(var12) {
                        if(var8 <= 0) {
                           return;
                        }

                        var11 = class95.writeClientProt(ClientProt.MODEL_ACTION, field3963.field1162);
                        var11.field3018.writeInt(var1);
                        field3963.method2235(var11);
                     }
                  } else {
                     if(var2 == 25) {
                        var17 = class313.method5512(var1, var0);
                        if(var17 != null) {
                           if(var8 <= 0) {
                              return;
                           }

                           class272.method4899();
                           class313.method5511(var1, var0, class148.method2674(class104.method1771(var17)), var17.field3662);
                           field3885 = 0;
                           field3890 = class129.method2384(var17);
                           if(field3890 == null) {
                              field3890 = "null";
                           }

                           if(var17.field3543) {
                              field3891 = var17.field3669 + class294.method5136(16777215);
                           } else {
                              field3891 = class294.method5136(65280) + var17.field3550 + class294.method5136(16777215);
                           }
                        }

                        return;
                     }

                     if(var2 == 26) {
                        class314.method5541();
                     } else {
                        int var13;
                        class329 var15;
                        if(var2 == 28) {
                           var9 = class95.writeClientProt(ClientProt.MODEL_ACTION, field3963.field1162);
                           var9.field3018.writeInt(var1);
                           field3963.method2235(var9);
                           var15 = class189.getWidget(var1);
                           if(var15.field3631 != null && var15.field3631[0][0] == 5) {
                              var13 = var15.field3631[0][1];
                              class215.field2071[var13] = 1 - class215.field2071[var13];
                              settingsChanged(var13);
                              class261.method4673(var13);
                           }
                        } else if(var2 == 29) {
                           if(var8 <= 0) {
                              return;
                           }

                           var9 = class95.writeClientProt(ClientProt.MODEL_ACTION, field3963.field1162);
                           var9.field3018.writeInt(var1);
                           field3963.method2235(var9);
                           var15 = class189.getWidget(var1);
                           if(var15.field3631 != null && var15.field3631[0][0] == 5) {
                              var13 = var15.field3631[0][1];
                              if(class215.field2071[var13] != var15.field3664[0]) {
                                 if(var8 <= 0) {
                                    return;
                                 }

                                 class215.field2071[var13] = var15.field3664[0];
                                 settingsChanged(var13);
                                 class261.method4673(var13);
                              }
                           }
                        } else if(var2 == 30) {
                           if(var8 <= 0) {
                              return;
                           }

                           if(field3898 == null) {
                              class272.method4900(var1, var0);
                              field3898 = class313.method5512(var1, var0);
                              class184.method3216(field3898);
                           }
                        } else if(var2 == 31) {
                           var9 = class95.writeClientProt(ClientProt.ITEM_ON_ITEM, field3963.field1162);
                           var9.field3018.writeIntV1(var1);
                           var9.field3018.writeIntV2(class7.field53);
                           var9.field3018.writeShortLE128(class213.field2059);
                           var9.field3018.writeShortLE(class41.field325);
                           var9.field3018.writeShortLE(var0);
                           var9.field3018.writeShortLE128(var3);
                           field3963.method2235(var9);
                           field4010 = 0;
                           class168.field1558 = class189.getWidget(var1);
                           field3839 = var0;
                        } else if(var2 == 32) {
                           var9 = class95.writeClientProt(ClientProt.INTERFACE_ON_INVENTORY, field3963.field1162);
                           var9.field3018.writeIntV1(class98.field914);
                           var9.field3018.writeInt(var1);
                           var9.field3018.writeShort(var0);
                           var9.field3018.writeShortLE(var3);
                           var9.field3018.writeShortLE(field3888);
                           field3963.method2235(var9);
                           field4010 = 0;
                           class168.field1558 = class189.getWidget(var1);
                           field3839 = var0;
                        } else if(var2 == 33) {
                           var9 = class95.writeClientProt(ClientProt.ITEM_ACTION1, field3963.field1162);
                           var9.field3018.writeShortLE(var3);
                           var9.field3018.writeIntV1(var1);
                           var9.field3018.writeShort(var0);
                           field3963.method2235(var9);
                           field4010 = 0;
                           class168.field1558 = class189.getWidget(var1);
                           field3839 = var0;
                        } else if(var2 == 34) {
                           var9 = class95.writeClientProt(ClientProt.ITEM_ACTION2, field3963.field1162);
                           var9.field3018.writeShort128(var3);
                           var9.field3018.writeIntV2(var1);
                           var9.field3018.writeShortLE128(var0);
                           field3963.method2235(var9);
                           field4010 = 0;
                           class168.field1558 = class189.getWidget(var1);
                           field3839 = var0;
                        } else if(var2 == 35) {
                           var9 = class95.writeClientProt(ClientProt.ITEM_ACTION3, field3963.field1162);
                           var9.field3018.writeIntLE(var1);
                           var9.field3018.writeShortLE128(var0);
                           var9.field3018.writeShortLE128(var3);
                           field3963.method2235(var9);
                           field4010 = 0;
                           class168.field1558 = class189.getWidget(var1);
                           field3839 = var0;
                        } else if(var2 == 36) {
                           var9 = class95.writeClientProt(ClientProt.ITEM_ACTION4, field3963.field1162);
                           var9.field3018.writeShortLE128(var3);
                           var9.field3018.writeInt(var1);
                           var9.field3018.writeShortLE128(var0);
                           field3963.method2235(var9);
                           field4010 = 0;
                           class168.field1558 = class189.getWidget(var1);
                           field3839 = var0;
                        } else if(var2 == 37) {
                           var9 = class95.writeClientProt(ClientProt.ITEM_ACTION5, field3963.field1162);
                           var9.field3018.writeInt(var1);
                           var9.field3018.writeShort(var0);
                           var9.field3018.writeShort(var3);
                           field3963.method2235(var9);
                           field4010 = 0;
                           class168.field1558 = class189.getWidget(var1);
                           field3839 = var0;
                        } else {
                           if(var2 == 38) {
                              class272.method4899();
                              var17 = class189.getWidget(var1);
                              field3885 = 1;
                              class213.field2059 = var0;
                              class7.field53 = var1;
                              class41.field325 = var3;
                              class184.method3216(var17);
                              field3835 = class294.method5136(16748608) + class67.method1152(var3).field1119 + class294.method5136(16777215);
                              if(field3835 == null) {
                                 field3835 = "null";
                              }

                              return;
                           }

                           if(var2 == 39) {
                              var9 = class95.writeClientProt(ClientProt.IF1_ACTION1, field3963.field1162);
                              var9.field3018.writeShortLE128(var3);
                              var9.field3018.writeIntV2(var1);
                              var9.field3018.writeShortLE(var0);
                              field3963.method2235(var9);
                              field4010 = 0;
                              class168.field1558 = class189.getWidget(var1);
                              field3839 = var0;
                           } else if(var2 == 40) {
                              if(var8 <= 0) {
                                 return;
                              }

                              var9 = class95.writeClientProt(ClientProt.IF1_ACTION2, field3963.field1162);
                              var9.field3018.writeIntV2(var1);
                              var9.field3018.writeShortLE(var0);
                              var9.field3018.writeShort128(var3);
                              field3963.method2235(var9);
                              field4010 = 0;
                              class168.field1558 = class189.getWidget(var1);
                              field3839 = var0;
                           } else if(var2 == 41) {
                              var9 = class95.writeClientProt(ClientProt.IF1_ACTION3, field3963.field1162);
                              var9.field3018.writeIntLE(var1);
                              var9.field3018.writeShort128(var0);
                              var9.field3018.writeShort(var3);
                              field3963.method2235(var9);
                              field4010 = 0;
                              class168.field1558 = class189.getWidget(var1);
                              field3839 = var0;
                           } else if(var2 == 42) {
                              var9 = class95.writeClientProt(ClientProt.IF1_ACTION4, field3963.field1162);
                              var9.field3018.writeInt(var1);
                              var9.field3018.writeShort128(var0);
                              var9.field3018.writeShort(var3);
                              field3963.method2235(var9);
                              field4010 = 0;
                              class168.field1558 = class189.getWidget(var1);
                              field3839 = var0;
                           } else if(var2 == 43) {
                              if(var8 <= 0) {
                                 return;
                              }

                              var9 = class95.writeClientProt(ClientProt.IF1_ACTION5, field3963.field1162);
                              var9.field3018.writeShort(var3);
                              var9.field3018.writeIntV1(var1);
                              var9.field3018.writeShort(var0);
                              field3963.method2235(var9);
                              field4010 = 0;
                              class168.field1558 = class189.getWidget(var1);
                              field3839 = var0;
                           } else if(var2 == 44) {
                              if(var8 <= 0) {
                                 return;
                              }

                              var16 = field3848[var3];
                              if(var16 != null) {
                                 field3949 = var6;
                                 field3834 = var7;
                                 field3836 = 2;
                                 field3824 = 0;
                                 field3795 = var0;
                                 field3993 = var1;
                                 var10 = class95.writeClientProt(ClientProt.PLAYER_ACTION1, field3963.field1162);
                                 var10.field3018.writeShort(var3);
                                 var10.field3018.writeByteC(class135.field1332[82]?1:0);
                                 field3963.method2235(var10);
                              }
                           } else if(var2 == 45) {
                              var16 = field3848[var3];
                              if(var16 != null) {
                                 field3949 = var6;
                                 field3834 = var7;
                                 field3836 = 2;
                                 field3824 = 0;
                                 field3795 = var0;
                                 field3993 = var1;
                                 var10 = class95.writeClientProt(ClientProt.PLAYER_ACTION2, field3963.field1162);
                                 var10.field3018.writeByte128(class135.field1332[82]?1:0);
                                 var10.field3018.writeShort128(var3);
                                 field3963.method2235(var10);
                              }
                           } else if(var2 == 46) {
                              var16 = field3848[var3];
                              if(var16 != null) {
                                 field3949 = var6;
                                 field3834 = var7;
                                 field3836 = 2;
                                 field3824 = 0;
                                 field3795 = var0;
                                 field3993 = var1;
                                 var10 = class95.writeClientProt(ClientProt.PLAYER_ACTION3, field3963.field1162);
                                 var10.field3018.writeShort128(var3);
                                 var10.field3018.writeByte(class135.field1332[82]?1:0);
                                 field3963.method2235(var10);
                              }
                           } else if(var2 == 47) {
                              var16 = field3848[var3];
                              if(var16 != null) {
                                 field3949 = var6;
                                 field3834 = var7;
                                 field3836 = 2;
                                 field3824 = 0;
                                 field3795 = var0;
                                 field3993 = var1;
                                 var10 = class95.writeClientProt(ClientProt.PLAYER_ACTION4, field3963.field1162);
                                 var10.field3018.writeShortLE128(var3);
                                 var10.field3018.writeByteC(class135.field1332[82]?1:0);
                                 field3963.method2235(var10);
                              }
                           } else if(var2 == 48) {
                              var16 = field3848[var3];
                              if(var16 != null) {
                                 field3949 = var6;
                                 field3834 = var7;
                                 field3836 = 2;
                                 field3824 = 0;
                                 field3795 = var0;
                                 field3993 = var1;
                                 var10 = class95.writeClientProt(ClientProt.PLAYER_ACTION5, field3963.field1162);
                                 var10.field3018.writeByte128(class135.field1332[82]?1:0);
                                 var10.field3018.writeShort128(var3);
                                 field3963.method2235(var10);
                              }
                           } else if(var2 == 49) {
                              if(var8 <= 0) {
                                 return;
                              }

                              var16 = field3848[var3];
                              if(var16 != null) {
                                 if(var8 <= 0) {
                                    return;
                                 }

                                 field3949 = var6;
                                 field3834 = var7;
                                 field3836 = 2;
                                 field3824 = 0;
                                 field3795 = var0;
                                 field3993 = var1;
                                 var10 = class95.writeClientProt(ClientProt.PLAYER_ACTION6, field3963.field1162);
                                 var10.field3018.writeShort128(var3);
                                 var10.field3018.write128Byte(class135.field1332[82]?1:0);
                                 field3963.method2235(var10);
                              }
                           } else if(var2 == 50) {
                              var16 = field3848[var3];
                              if(var16 != null) {
                                 field3949 = var6;
                                 field3834 = var7;
                                 field3836 = 2;
                                 field3824 = 0;
                                 field3795 = var0;
                                 field3993 = var1;
                                 var10 = class95.writeClientProt(ClientProt.PLAYER_ACTION7, field3963.field1162);
                                 var10000 = var10.field3018;
                                 if(class135.field1332[82]) {
                                    if(var8 <= 0) {
                                       return;
                                    }

                                    var10001 = 1;
                                 } else {
                                    var10001 = 0;
                                 }

                                 var10000.write128Byte(var10001);
                                 var10.field3018.writeShortLE(var3);
                                 field3963.method2235(var10);
                              }
                           } else if(var2 == 51) {
                              var16 = field3848[var3];
                              if(var16 != null) {
                                 field3949 = var6;
                                 field3834 = var7;
                                 field3836 = 2;
                                 field3824 = 0;
                                 field3795 = var0;
                                 field3993 = var1;
                                 var10 = class95.writeClientProt(ClientProt.PLAYER_ACTION8, field3963.field1162);
                                 var10.field3018.writeByteC(class135.field1332[82]?1:0);
                                 var10.field3018.writeShortLE128(var3);
                                 field3963.method2235(var10);
                              }
                           } else {
                              label861: {
                                 if(var2 != 57) {
                                    if(var2 == 58) {
                                       var17 = class313.method5512(var1, var0);
                                       if(var17 != null) {
                                          var10 = class95.writeClientProt(ClientProt.field485, field3963.field1162);
                                          var10.field3018.writeShortLE(field3888);
                                          var10.field3018.writeIntV2(var1);
                                          var10.field3018.writeShortLE(field3889);
                                          var10.field3018.writeShortLE128(var0);
                                          var10.field3018.writeInt(class98.field914);
                                          var10.field3018.writeShortLE128(var17.field3662);
                                          field3963.method2235(var10);
                                       }
                                       break label861;
                                    }

                                    if(var2 == 1001) {
                                       field3949 = var6;
                                       field3834 = var7;
                                       field3836 = 2;
                                       field3824 = 0;
                                       field3795 = var0;
                                       field3993 = var1;
                                       var9 = class95.writeClientProt(ClientProt.OBJECT_ACTION5, field3963.field1162);
                                       var9.field3018.writeShort(var3);
                                       var9.field3018.writeByte128(class135.field1332[82]?1:0);
                                       var9.field3018.writeShort128(var0 + class296.somex);
                                       var9.field3018.writeShortLE128(class284.somey + var1);
                                       field3963.method2235(var9);
                                       break label861;
                                    }

                                    if(var2 == 1002) {
                                       if(var8 <= 0) {
                                          return;
                                       }

                                       field3949 = var6;
                                       field3834 = var7;
                                       field3836 = 2;
                                       field3824 = 0;
                                       var9 = class95.writeClientProt(ClientProt.OBJECT_EXAMINE, field3963.field1162);
                                       var9.field3018.writeShort128(var3);
                                       field3963.method2235(var9);
                                       break label861;
                                    }

                                    if(var2 == 1003) {
                                       field3949 = var6;
                                       field3834 = var7;
                                       field3836 = 2;
                                       field3824 = 0;
                                       var14 = field3774[var3];
                                       if(var14 != null) {
                                          class222 var18 = var14.field2400;
                                          if(var18.field2168 != null) {
                                             if(var8 <= 0) {
                                                return;
                                             }

                                             var18 = var18.method3970();
                                          }

                                          if(var18 != null) {
                                             if(var8 <= 0) {
                                                return;
                                             }

                                             var11 = class95.writeClientProt(ClientProt.NPC_EXAMINE, field3963.field1162);
                                             var11.field3018.writeShort128(var18.field2157);
                                             field3963.method2235(var11);
                                          }
                                       }
                                       break label861;
                                    }

                                    if(var2 == 1004) {
                                       field3949 = var6;
                                       field3834 = var7;
                                       field3836 = 2;
                                       field3824 = 0;
                                       var9 = class95.writeClientProt(ClientProt.ITEM_EXAMINE, field3963.field1162);
                                       var9.field3018.writeShortLE(var3);
                                       field3963.method2235(var9);
                                       break label861;
                                    }

                                    if(var2 == 1005) {
                                       var17 = class189.getWidget(var1);
                                       if(var17 != null && var17.field3682[var0] >= 100000) {
                                          ServerProt.method4172(27, "", var17.field3682[var0] + " x " + class67.method1152(var3).field1119);
                                       } else {
                                          var10 = class95.writeClientProt(ClientProt.ITEM_EXAMINE, field3963.field1162);
                                          var10.field3018.writeShortLE(var3);
                                          field3963.method2235(var10);
                                       }

                                       field4010 = 0;
                                       class168.field1558 = class189.getWidget(var1);
                                       field3839 = var0;
                                       break label861;
                                    }

                                    if(var2 != 1007) {
                                       if(var2 == 1011 || var2 == 1010 || var2 == 1009 || var2 == 1008 || var2 == 1012) {
                                          class63.field587.method1505(var2, var3, new class34(var0), new class34(var1));
                                       }
                                       break label861;
                                    }

                                    if(var8 <= 0) {
                                       return;
                                    }
                                 }

                                 var17 = class313.method5512(var1, var0);
                                 if(var17 != null) {
                                    class21.method217(var3, var1, var0, var17.field3662, var5);
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

      if(field3885 != 0) {
         field3885 = 0;
         class184.method3216(class189.getWidget(class7.field53));
      }

      if(field3887) {
         class272.method4899();
      }

      if(class168.field1558 != null && field4010 == 0) {
         if(var8 <= 0) {
            return;
         }

         class184.method3216(class168.field1558);
      }

   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void onPitchCosChanged(int var0) {
      if(pitchRelaxEnabled && class312.isDrawingScene) {
         class113.field1064.setPitchCos(Perspective.COSINE[class113.field1064.getCameraPitch()]);
      }

   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void onMenuOptionsChanged(int var0) {
      int var1 = oldMenuEntryCount;
      int var2 = class113.field1064.getMenuOptionCount();
      oldMenuEntryCount = var2;
      if(var2 == var1 + 1) {
         MenuEntryAdded var3 = new MenuEntryAdded(class113.field1064.getMenuOptions()[var2 - 1], class113.field1064.getMenuTargets()[var2 - 1], class113.field1064.getMenuTypes()[var2 - 1], class113.field1064.getMenuIdentifiers()[var2 - 1], class113.field1064.getMenuActionParams0()[var2 - 1], class113.field1064.getMenuActionParams1()[var2 - 1]);
         class113.field1064.getCallbacks().post(var3);
      }

   }

   public static void gameDraw(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      Widget[] var9 = var0;
      int var10 = var0.length;

      for(int var11 = 0; var11 < var10; ++var11) {
         Widget var12 = var9[var11];
         RSWidget var13 = (RSWidget)var12;
         if(var13 != null && var13.getRSParentId() == var1) {
            if(var1 != -1) {
               var13.setRenderParentId(var1);
            }

            var13.setRenderX(var6 + var13.getRelativeX());
            var13.setRenderY(var7 + var13.getRelativeY());
            RSHashTable var14 = class113.field1064.getComponentTable();
            WidgetNode var15 = (WidgetNode)var14.get((long)var13.getId());
            if(var15 != null) {
               int var16 = var13.getId();
               int var17 = var15.getId();
               RSWidget[] var18 = class113.field1064.getWidgets()[var17];
               RSWidget[] var19 = var18;
               int var20 = var18.length;

               for(int var21 = 0; var21 < var20; ++var21) {
                  RSWidget var22 = var19[var21];
                  if(var22.getRSParentId() == -1) {
                     var22.setRenderParentId(var16);
                  }
               }
            }
         }
      }

   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void itemPressedDurationChanged(int var0) {
      if(class113.field1064.getItemPressedDuration() > 0) {
         ++itemPressedDurationBuffer;
         if(itemPressedDurationBuffer >= inventoryDragDelay) {
            class113.field1064.setItemPressedDuration(itemPressedDurationBuffer);
         } else {
            class113.field1064.setItemPressedDuration(0);
         }
      } else {
         itemPressedDurationBuffer = 0;
      }

   }

   public static boolean vmExecuteOpcode(int var0) {
      if(var0 == 6599) {
         if(!$assertionsDisabled && currentScript.getInstructions()[currentScriptPC] != 6599) {
            throw new AssertionError();
         } else {
            int var1 = class113.field1064.getStringStackSize();
            String[] var10000 = class113.field1064.getStringStack();
            --var1;
            String var2 = var10000[var1];
            class113.field1064.setStringStackSize(var1);
            if("debug".equals(var2)) {
               int var3 = class113.field1064.getIntStackSize();
               var10000 = class113.field1064.getStringStack();
               --var1;
               String var4 = var10000[var1];
               StringBuffer var5 = new StringBuffer();
               Matcher var6 = Pattern.compile("%(.)").matcher(var4);

               while(var6.find()) {
                  var6.appendReplacement(var5, "");
                  switch(var6.group(1).charAt(0)) {
                  case 'd':
                  case 'i':
                     int[] var8 = class113.field1064.getIntStack();
                     --var3;
                     var5.append(var8[var3]);
                     break;
                  case 's':
                     String[] var10001 = class113.field1064.getStringStack();
                     --var1;
                     var5.append(var10001[var1]);
                     break;
                  default:
                     var5.append(var6.group(0)).append("=unknown");
                  }
               }

               var6.appendTail(var5);
               class113.field1064.getLogger().debug(var5.toString());
               class113.field1064.setStringStackSize(var1);
               class113.field1064.setIntStackSize(var3);
               return true;
            } else {
               ScriptCallbackEvent var7 = new ScriptCallbackEvent();
               var7.setScript(currentScript);
               var7.setEventName(var2);
               class113.field1064.getCallbacks().post(var7);
               return true;
            }
         }
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void resizeChanged(int var0) {
      ResizeableChanged var1 = new ResizeableChanged();
      var1.setResized(class113.field1064.isResized());
      class113.field1064.getCallbacks().post(var1);
   }

   public static void settingsChanged(int var0) {
      VarbitChanged var1 = new VarbitChanged();
      class113.field1064.getCallbacks().post(var1);
   }

   public static void copy$runWidgetOnLoadListener(int var0, int var1) {
      if(var0 == -1) {
         if(var1 > -1502856382) {
            ;
         }
      } else if(!class267.method4843(var0)) {
         if(var1 > -1502856382) {
            ;
         }
      } else {
         class329[] var2 = class329.field3533[var0];

         for(int var3 = 0; var3 < var2.length; ++var3) {
            class329 var4 = var2[var3];
            if(var4.field3562 != null) {
               class9 var5 = new class9();
               var5.field63 = var4;
               var5.field69 = var4.field3562;
               class52.method847(var5, 5000000, (byte)83);
            }
         }

      }
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void draggingWidgetChanged(int var0) {
      DraggingWidgetChanged var1 = new DraggingWidgetChanged();
      var1.setDraggingWidget(class113.field1064.isDraggingWidget());
      class113.field1064.getCallbacks().post(var1);
   }

   public static void updateNpcs(boolean var0, PacketBuffer var1) {
      class113.field1064.getCallbacks().updateNpcs();
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void onCameraPitchTargetChanged(int var0) {
      int var1 = class113.field1064.getCameraPitchTarget();
      int var2 = var1;
      if(pitchRelaxEnabled && lastPitchTarget > 383 && var1 == 383) {
         var2 = lastPitchTarget;
         if(var2 > 512) {
            var2 = 512;
         }

         class113.field1064.setCameraPitchTarget(var2);
      }

      lastPitchTarget = var2;
   }

   public static void cachedNPCsChanged(int var0) {
      RSNPC[] var1 = class113.field1064.getCachedNPCs();
      if(var0 >= 0 && var0 < var1.length) {
         RSNPC var2 = var1[var0];
         if(var2 != null) {
            var2.setIndex(var0);
            class113.field1064.getCallbacks().postDeferred(new NpcSpawned(var2));
         }

      }
   }

   public static void cachedPlayersChanged(int var0) {
      RSPlayer[] var1 = class113.field1064.getCachedPlayers();
      if(var0 >= 0 && var0 < var1.length) {
         RSPlayer var2 = var1[var0];
         RSPlayer var3 = oldPlayers[var0];
         oldPlayers[var0] = var2;
         if(var3 != null) {
            class113.field1064.getCallbacks().post(new PlayerDespawned(var3));
         }

         if(var2 != null) {
            class113.field1064.getCallbacks().postDeferred(new PlayerSpawned(var2));
         }

      }
   }

   public static void playerOptionsChanged(int var0) {
      MenuAction[] var1 = new MenuAction[]{MenuAction.PLAYER_FIRST_OPTION, MenuAction.PLAYER_SECOND_OPTION, MenuAction.PLAYER_THIRD_OPTION, MenuAction.PLAYER_FOURTH_OPTION, MenuAction.PLAYER_FIFTH_OPTION, MenuAction.PLAYER_SIXTH_OPTION, MenuAction.PLAYER_SEVENTH_OPTION, MenuAction.PLAYER_EIGTH_OPTION};
      if(var0 >= 0 && var0 < var1.length) {
         MenuAction var2 = var1[var0];
         class113.field1064.getPlayerMenuTypes()[var0] = var2.getId();
      }

      PlayerMenuOptionsChanged var3 = new PlayerMenuOptionsChanged();
      var3.setIndex(var0);
      class113.field1064.getCallbacks().post(var3);
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void onUsernameChanged(int var0) {
      class113.field1064.getCallbacks().post(new UsernameChanged());
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void onCameraPitchChanged(int var0) {
      int var1 = class113.field1064.getCameraPitch();
      int var2 = var1;
      if(pitchRelaxEnabled && lastPitch > 383 && var1 == 383) {
         var2 = lastPitch;
         if(var2 > 512) {
            var2 = 512;
         }

         class113.field1064.setCameraPitch(var2);
      }

      lastPitch = var2;
   }

   public static void experiencedChanged(int var0) {
      ExperienceChanged var1 = new ExperienceChanged();
      Skill[] var2 = Skill.values();
      if(var0 < var2.length - 1) {
         Skill var3 = var2[var0];
         var1.setSkill(var3);
         class113.field1064.getCallbacks().post(var1);
      }

   }

   public static void boostedSkillLevelsChanged(int var0) {
      Skill[] var1 = Skill.values();
      if(var0 >= 0 && var0 < var1.length - 1) {
         Skill var2 = var1[var0];
         BoostedLevelChanged var3 = new BoostedLevelChanged();
         var3.setSkill(var2);
         class113.field1064.getCallbacks().post(var3);
      }

   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void clanMemberManagerChanged(int var0) {
      class113.field1064.getCallbacks().post(new ClanChanged(class113.field1064.getClanMemberManager() != null));
   }

   public static void onGrandExchangeOffersChanged(int var0) {
      if(var0 != -1) {
         RSGrandExchangeOffer var1 = class113.field1064.getGrandExchangeOffers()[var0];
         if(var1 != null) {
            GrandExchangeOfferChanged var2 = new GrandExchangeOfferChanged();
            var2.setOffer(var1);
            var2.setSlot(var0);
            class113.field1064.getCallbacks().post(var2);
         }
      }
   }

   private static void rl$$clinit() {
      $assertionsDisabled = !client.class.desiredAssertionStatus();
   }

   private static void rl$$clinit1() {
      $assertionsDisabled = !client.class.desiredAssertionStatus();
   }

   private static void rl$$clinit2() {
      $assertionsDisabled = !client.class.desiredAssertionStatus();
      oldPlayers = new class63[2048];
   }

   private static void rl$$clinit3() {
      spriteOverrides = new HashMap();
      widgetSpriteOverrides = new HashMap();
   }

   private static void rl$$clinit4() {
      pitchRelaxEnabled = false;
      lastPitch = 128;
      lastPitchTarget = 128;
   }
}
