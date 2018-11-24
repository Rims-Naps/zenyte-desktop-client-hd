package net.runelite.standalone;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.awt.Container;
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
import net.runelite.api.Model;
import net.runelite.api.NPC;
import net.runelite.api.Node;
import net.runelite.api.PacketBuffer;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.Skill;
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
import net.runelite.api.events.CanvasSizeChanged;
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
import net.runelite.api.hooks.DrawCallbacks;
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
import net.runelite.rs.api.RSModel;
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
import net.runelite.rs.api.RSTextureProvider;
import net.runelite.rs.api.RSVarbit;
import net.runelite.rs.api.RSVarcs;
import net.runelite.rs.api.RSWidget;
import net.runelite.rs.api.RSWorld;
import netscape.javascript.JSObject;
import org.slf4j.Logger;

public final class client extends GameEngine implements class146, RSClient {
   @ObfuscatedName("pi")
   @ObfuscatedSignature(
      signature = "[Llp;"
   )
   static SpritePixels[] field2382;
   @ObfuscatedName("mj")
   @ObfuscatedGetter(
      intValue = 1901601165
   )
   static int field2163;
   @ObfuscatedName("nd")
   static int[] field2289;
   @ObfuscatedName("mi")
   @ObfuscatedGetter(
      intValue = -1486020785
   )
   static int field2321;
   @ObfuscatedName("rh")
   @ObfuscatedGetter(
      intValue = -1067277261
   )
   static int field2237;
   @ObfuscatedName("rr")
   @ObfuscatedGetter(
      intValue = 229234797
   )
   static int field2244;
   @ObfuscatedName("oz")
   @ObfuscatedGetter(
      intValue = 1349505107
   )
   static int field2365;
   @ObfuscatedName("ra")
   @ObfuscatedGetter(
      intValue = 628675183
   )
   static int field2230;
   @ObfuscatedName("nl")
   @ObfuscatedGetter(
      intValue = -2138207893
   )
   static int field2315;
   @ObfuscatedName("sw")
   @ObfuscatedSignature(
      signature = "[Le;"
   )
   static class307[] field2420;
   @ObfuscatedName("nc")
   static boolean field2337;
   @ObfuscatedName("qg")
   static int[] field2294;
   @ObfuscatedName("qs")
   @ObfuscatedSignature(
      signature = "[Lcs;"
   )
   static class130[] field2188;
   @ObfuscatedName("qy")
   static int[] field2345;
   @ObfuscatedName("rj")
   @ObfuscatedGetter(
      intValue = 1791706257
   )
   static int field2359;
   @ObfuscatedName("re")
   @ObfuscatedGetter(
      intValue = 2006690739
   )
   static int field2413;
   @ObfuscatedName("nz")
   @ObfuscatedGetter(
      intValue = -2132276027
   )
   static int field2416;
   @ObfuscatedName("qo")
   static int[] field2429;
   @ObfuscatedName("qv")
   static int[] field2394;
   @ObfuscatedName("ms")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   static class187 field2330;
   @ObfuscatedName("ng")
   @ObfuscatedGetter(
      intValue = -494655909
   )
   static int field2338;
   @ObfuscatedName("ok")
   static boolean field2367;
   @ObfuscatedName("ov")
   static int[] field2362;
   @ObfuscatedName("oj")
   static int[] field2322;
   @ObfuscatedName("mc")
   @ObfuscatedGetter(
      intValue = 698570637
   )
   static int field2313;
   @ObfuscatedName("oe")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   static class98 field2355;
   @ObfuscatedName("pm")
   @ObfuscatedGetter(
      intValue = -2050474235
   )
   static int field2414;
   @ObfuscatedName("pe")
   @ObfuscatedGetter(
      intValue = 1948657599
   )
   static int field2216;
   @ObfuscatedName("mu")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   static class187 field2326;
   @ObfuscatedName("mw")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   static class98 field2412;
   @ObfuscatedName("qx")
   @ObfuscatedGetter(
      intValue = -237297995
   )
   static int field2391;
   @ObfuscatedName("ot")
   @ObfuscatedGetter(
      intValue = -1713626641
   )
   static int field2356;
   @ObfuscatedName("or")
   @ObfuscatedGetter(
      intValue = 1890888555
   )
   static int field2380;
   @ObfuscatedName("oi")
   @ObfuscatedGetter(
      longValue = -8512295860083041717L
   )
   static long field2366;
   @ObfuscatedName("oq")
   static boolean[] field2351;
   @ObfuscatedName("oy")
   static boolean[] field2168;
   @ObfuscatedName("oo")
   static boolean[] field2287;
   @ObfuscatedName("nn")
   static boolean field2334;
   @ObfuscatedName("mq")
   static boolean field2331;
   @ObfuscatedName("sb")
   @ObfuscatedGetter(
      intValue = 255917231
   )
   public static int field2422;
   @ObfuscatedName("no")
   @ObfuscatedGetter(
      intValue = 1557987687
   )
   static int field2404;
   @ObfuscatedName("qu")
   static boolean field2393;
   @ObfuscatedName("mr")
   @ObfuscatedGetter(
      intValue = 1410632695
   )
   static int field2304;
   @ObfuscatedName("md")
   @ObfuscatedGetter(
      intValue = -1148718769
   )
   static int field2307;
   @ObfuscatedName("ma")
   @ObfuscatedGetter(
      intValue = -1197296523
   )
   static int field2248;
   @ObfuscatedName("mm")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   static class187 field2335;
   @ObfuscatedName("od")
   static int[] field2363;
   @ObfuscatedName("ol")
   @ObfuscatedGetter(
      intValue = 764680107
   )
   static int field2369;
   @ObfuscatedName("nq")
   @ObfuscatedGetter(
      intValue = -1836240185
   )
   static int field2333;
   @ObfuscatedName("mv")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   static class187 field2325;
   @ObfuscatedName("os")
   static int[] field2364;
   @ObfuscatedName("mo")
   @ObfuscatedGetter(
      intValue = -1685668045
   )
   static int field2263;
   @ObfuscatedName("ru")
   static boolean[] field2208;
   @ObfuscatedName("om")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   static class70 field2232;
   @ObfuscatedName("so")
   @ObfuscatedSignature(
      signature = "Lbg;"
   )
   static final class267 field2425;
   @ObfuscatedName("ni")
   @ObfuscatedGetter(
      intValue = 263723183
   )
   static int field2204;
   @ObfuscatedName("rt")
   static int[] field2201;
   @ObfuscatedName("nk")
   @ObfuscatedGetter(
      intValue = -1425696153
   )
   static int field2281;
   @ObfuscatedName("rs")
   static int[] field2400;
   @ObfuscatedName("rp")
   static int[] field2401;
   @ObfuscatedName("rz")
   static int[] field2402;
   @ObfuscatedName("sy")
   static int[] field2426;
   @ObfuscatedName("to")
   static int[] field2427;
   @ObfuscatedName("oc")
   @ObfuscatedGetter(
      intValue = 1631067835
   )
   static int field2395;
   @ObfuscatedName("me")
   static String field2311;
   @ObfuscatedName("lw")
   @ObfuscatedGetter(
      intValue = -2118199251
   )
   static int field2309;
   @ObfuscatedName("mf")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   static class187 field2319;
   @ObfuscatedName("ml")
   static String field2312;
   @ObfuscatedName("rw")
   @ObfuscatedSignature(
      signature = "Lho;"
   )
   static class327 field2275;
   @ObfuscatedName("qd")
   static boolean field2397;
   @ObfuscatedName("na")
   @ObfuscatedGetter(
      intValue = 839559075
   )
   static int field2350;
   @ObfuscatedName("py")
   static long[] field2372;
   @ObfuscatedName("qn")
   @ObfuscatedGetter(
      intValue = 1406270833
   )
   static int field2328;
   @ObfuscatedName("rg")
   @ObfuscatedGetter(
      intValue = -40906797
   )
   static int field2417;
   @ObfuscatedName("lt")
   @ObfuscatedGetter(
      intValue = 1268198779
   )
   static int field2310;
   @ObfuscatedName("qk")
   @ObfuscatedGetter(
      intValue = 959095685
   )
   static int field2389;
   @ObfuscatedName("qz")
   @ObfuscatedGetter(
      intValue = 374339515
   )
   static int field2386;
   @ObfuscatedName("qj")
   @ObfuscatedGetter(
      intValue = 1654292191
   )
   static int field2390;
   @ObfuscatedName("rx")
   @ObfuscatedGetter(
      intValue = 201273211
   )
   static int field2418;
   @ObfuscatedName("ri")
   static short field2259;
   @ObfuscatedName("rq")
   static short field2407;
   @ObfuscatedName("mn")
   static boolean field2250;
   @ObfuscatedName("pl")
   @ObfuscatedGetter(
      intValue = -1233478957
   )
   static int field2358;
   @ObfuscatedName("rk")
   static short field2396;
   @ObfuscatedName("pb")
   @ObfuscatedGetter(
      intValue = -557188255
   )
   static int field2373;
   @ObfuscatedName("qi")
   @ObfuscatedGetter(
      intValue = -953994919
   )
   static int field2411;
   @ObfuscatedName("rv")
   static short field2405;
   @ObfuscatedName("rm")
   static short field2409;
   @ObfuscatedName("rb")
   static short field2406;
   @ObfuscatedName("pd")
   static String field2371;
   @ObfuscatedName("mz")
   @ObfuscatedGetter(
      intValue = 84522019
   )
   static int field2317;
   @ObfuscatedName("rc")
   static short field2408;
   @ObfuscatedName("rn")
   static short field2341;
   @ObfuscatedName("sc")
   @ObfuscatedSignature(
      signature = "Lbq;"
   )
   static class276 field2357;
   @ObfuscatedName("my")
   @ObfuscatedGetter(
      intValue = -129595375
   )
   static int field2318;
   @ObfuscatedName("mb")
   @ObfuscatedGetter(
      intValue = -694453479
   )
   static int field2336;
   @ObfuscatedName("st")
   static ArrayList field2270;
   @ObfuscatedName("mh")
   @ObfuscatedGetter(
      intValue = -1601287277
   )
   static int field2316;
   @ObfuscatedName("su")
   @ObfuscatedGetter(
      intValue = 460102891
   )
   static int field2424;
   @ObfuscatedName("pj")
   @ObfuscatedGetter(
      intValue = -1505758575
   )
   static int field2194;
   @ObfuscatedName("ns")
   @ObfuscatedGetter(
      intValue = 2035380467
   )
   static int field2347;
   @ObfuscatedName("px")
   @ObfuscatedGetter(
      longValue = -5747543072635697441L
   )
   static long field2377;
   @ObfuscatedName("mg")
   @ObfuscatedGetter(
      intValue = 345515089
   )
   static int field2323;
   @ObfuscatedName("nv")
   static int[] field2177;
   @ObfuscatedName("ny")
   @ObfuscatedGetter(
      intValue = -1473528221
   )
   static int field2342;
   @ObfuscatedName("sq")
   @ObfuscatedSignature(
      signature = "Lld;"
   )
   static class160 field2419;
   @ObfuscatedName("pq")
   @ObfuscatedGetter(
      intValue = 914532571
   )
   static int field2379;
   @ObfuscatedName("nb")
   @ObfuscatedGetter(
      intValue = 1781457339
   )
   static int field2340;
   @ObfuscatedName("pr")
   static int[] field2190;
   @ObfuscatedName("pn")
   static int[] field2381;
   @ObfuscatedName("ne")
   static int[] field2339;
   @ObfuscatedName("pv")
   @ObfuscatedGetter(
      intValue = 165705467
   )
   static int field2415;
   @ObfuscatedName("nh")
   @ObfuscatedGetter(
      intValue = 602191859
   )
   static int field2349;
   @ObfuscatedName("pw")
   static int[] field2376;
   @ObfuscatedName("ps")
   static int[] field2375;
   @ObfuscatedName("oh")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   static class70 field2353;
   @ObfuscatedName("og")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   static class70 field2354;
   @ObfuscatedName("nx")
   @ObfuscatedGetter(
      intValue = 2056559641
   )
   static int field2348;
   @ObfuscatedName("on")
   static int[] field2243;
   @ObfuscatedName("gl")
   static final int[] field2399;
   @ObfuscatedName("ew")
   static byte[] field2254;
   @ObfuscatedName("il")
   @ObfuscatedGetter(
      intValue = 891947869
   )
   static int field2255;
   @ObfuscatedName("im")
   static int[] field2346;
   @ObfuscatedName("lq")
   static int[] field2293;
   @ObfuscatedName("ej")
   @ObfuscatedGetter(
      intValue = -974927457
   )
   static int field2297;
   @ObfuscatedName("hd")
   @ObfuscatedGetter(
      intValue = 1068397973
   )
   static int field2219;
   @ObfuscatedName("dv")
   @ObfuscatedGetter(
      intValue = 492465375
   )
   static int field2184;
   @ObfuscatedName("ke")
   @ObfuscatedGetter(
      intValue = -119981787
   )
   static int field2288;
   @ObfuscatedName("lp")
   static boolean field2301;
   @ObfuscatedName("jq")
   @ObfuscatedGetter(
      intValue = -55777941
   )
   static int field2352;
   @ObfuscatedName("ih")
   static int[] field2273;
   @ObfuscatedName("ic")
   @ObfuscatedGetter(
      intValue = 516940403
   )
   static int field2370;
   @ObfuscatedName("go")
   static int[][][] field2213;
   @ObfuscatedName("dd")
   @ObfuscatedGetter(
      intValue = 1582011029
   )
   static int field2183;
   @ObfuscatedName("ju")
   static boolean field2268;
   @ObfuscatedName("jp")
   static boolean field2265;
   @ObfuscatedName("cr")
   @ObfuscatedGetter(
      intValue = 1331313895
   )
   static int field2280;
   @ObfuscatedName("hy")
   @ObfuscatedGetter(
      intValue = -2141797571
   )
   static int field2239;
   @ObfuscatedName("fo")
   @ObfuscatedSignature(
      signature = "Lcq;"
   )
   public static final class137 field2384;
   @ObfuscatedName("kz")
   static boolean field2360;
   @ObfuscatedName("cv")
   @ObfuscatedGetter(
      intValue = 274943707
   )
   static int field2165;
   @ObfuscatedName("jv")
   @ObfuscatedGetter(
      intValue = 1291332481
   )
   static int field2257;
   @ObfuscatedName("js")
   @ObfuscatedGetter(
      intValue = -1102270627
   )
   static int field2264;
   @ObfuscatedName("hs")
   @ObfuscatedGetter(
      intValue = 1919471887
   )
   static int field2222;
   @ObfuscatedName("hz")
   @ObfuscatedGetter(
      intValue = 783001733
   )
   static int field2224;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = 1049765697
   )
   static int field2320;
   @ObfuscatedName("ib")
   @ObfuscatedGetter(
      intValue = -1435074867
   )
   static int field2267;
   @ObfuscatedName("hm")
   @ObfuscatedGetter(
      intValue = -1049142943
   )
   static int field2164;
   @ObfuscatedName("co")
   @ObfuscatedGetter(
      intValue = -126898941
   )
   static int field2167;
   @ObfuscatedName("lc")
   static String[] field2295;
   @ObfuscatedName("ep")
   static int[] field2197;
   @ObfuscatedName("kj")
   @ObfuscatedGetter(
      intValue = 1157008491
   )
   static int field2274;
   @ObfuscatedName("du")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class6 field2428;
   @ObfuscatedName("hc")
   @ObfuscatedGetter(
      intValue = 35510501
   )
   static int field2223;
   @ObfuscatedName("gs")
   @ObfuscatedGetter(
      intValue = 724238505
   )
   static int field2217;
   @ObfuscatedName("jd")
   @ObfuscatedGetter(
      intValue = -780646987
   )
   static int field2245;
   @ObfuscatedName("jg")
   @ObfuscatedGetter(
      intValue = -1144663281
   )
   static int field2260;
   @ObfuscatedName("kk")
   static boolean[] field2278;
   @ObfuscatedName("kq")
   @ObfuscatedSignature(
      signature = "[[[Lgs;"
   )
   static class70[][][] field2182;
   @ObfuscatedName("kw")
   @ObfuscatedGetter(
      intValue = -34734081
   )
   static int field2290;
   @ObfuscatedName("bv")
   static boolean field2160;
   @ObfuscatedName("in")
   @ObfuscatedGetter(
      intValue = -711581805
   )
   static int field2214;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = -1612597775
   )
   static int field2161;
   @ObfuscatedName("cg")
   static boolean field2215;
   @ObfuscatedName("eo")
   @ObfuscatedGetter(
      intValue = 1414632653
   )
   static int field2392;
   @ObfuscatedName("fa")
   @ObfuscatedGetter(
      intValue = 1535555329
   )
   static int field2202;
   @ObfuscatedName("jy")
   @ObfuscatedGetter(
      intValue = -2074295169
   )
   static int field2329;
   @ObfuscatedName("io")
   static int[] field2242;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = 329786505
   )
   static int field2388;
   @ObfuscatedName("iq")
   @ObfuscatedGetter(
      intValue = -1451608881
   )
   static int field2251;
   @ObfuscatedName("kv")
   @ObfuscatedGetter(
      intValue = -1684670717
   )
   static int field2200;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = -1133534755
   )
   static int field2155;
   @ObfuscatedName("hk")
   @ObfuscatedGetter(
      intValue = 1091916273
   )
   static int field2403;
   @ObfuscatedName("it")
   static String field2256;
   @ObfuscatedName("fd")
   static int[] field2199;
   @ObfuscatedName("dt")
   @ObfuscatedSignature(
      signature = "Lcf;"
   )
   static class302 field2174;
   @ObfuscatedName("hf")
   @ObfuscatedGetter(
      intValue = -280712713
   )
   static int field2430;
   @ObfuscatedName("lx")
   static String[] field2296;
   @ObfuscatedName("if")
   @ObfuscatedGetter(
      intValue = 212665001
   )
   static int field2253;
   @ObfuscatedName("ed")
   @ObfuscatedGetter(
      intValue = -1078971255
   )
   static int field2198;
   @ObfuscatedName("cs")
   @ObfuscatedGetter(
      intValue = -302870735
   )
   static int field2172;
   @ObfuscatedName("fj")
   @ObfuscatedGetter(
      intValue = 782126659
   )
   static int field2298;
   @ObfuscatedName("ky")
   @ObfuscatedGetter(
      intValue = 287260825
   )
   static int field2343;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = 1288293695
   )
   static int field2154;
   @ObfuscatedName("ln")
   static boolean field2299;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = -1820115521
   )
   static int field2151;
   @ObfuscatedName("lh")
   static boolean[] field2327;
   @ObfuscatedName("ko")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   static class70 field2283;
   @ObfuscatedName("cd")
   @ObfuscatedGetter(
      intValue = -1976635089
   )
   static int field2220;
   @ObfuscatedName("lv")
   static boolean field2308;
   @ObfuscatedName("kt")
   static int[] field2226;
   @ObfuscatedName("fb")
   static boolean field2421;
   @ObfuscatedName("fy")
   static boolean field2203;
   @ObfuscatedName("kb")
   static int[] field2286;
   @ObfuscatedName("ce")
   @ObfuscatedGetter(
      intValue = -312178591
   )
   static int field2173;
   @ObfuscatedName("ka")
   static String[] field2277;
   @ObfuscatedName("hu")
   @ObfuscatedGetter(
      intValue = 1186959339
   )
   static int field2221;
   @ObfuscatedName("eg")
   @ObfuscatedGetter(
      intValue = -1193443425
   )
   static int field2305;
   @ObfuscatedName("ia")
   @ObfuscatedGetter(
      intValue = 210585457
   )
   static int field2240;
   @ObfuscatedName("hr")
   @ObfuscatedGetter(
      intValue = -870875055
   )
   static int field2231;
   @ObfuscatedName("cx")
   @ObfuscatedGetter(
      intValue = -761031931
   )
   static int field2180;
   @ObfuscatedName("lo")
   static int[] field2368;
   @ObfuscatedName("fw")
   static HashMap field2205;
   @ObfuscatedName("ig")
   @ObfuscatedGetter(
      intValue = 1671085411
   )
   static int field2233;
   @ObfuscatedName("lz")
   static boolean field2387;
   public static int tickCount;
   public static boolean interpolatePlayerAnimations;
   public static boolean interpolateNpcAnimations;
   public static boolean interpolateObjectAnimations;
   public static RSItem lastItemDespawn;
   public static boolean stretchedFast;
   public static boolean stretchedKeepAspectRatio;
   public static boolean stretchedEnabled;
   public static boolean isHidingEntities;
   public static boolean hidePlayers;
   public static boolean hideFriends;
   public static boolean hideLocalPlayer;
   public static boolean hideLocalPlayer2D;
   public static boolean hideNPCs;
   public static boolean hideProjectiles;
   public static int inventoryDragDelay;
   public static boolean stretchedIntegerScaling;
   public static boolean hidePlayers2D;
   public static boolean hideClanMates;
   public static boolean hideNPCs2D;
   public static Map widgetSpriteOverrides;
   public static int[] rl$modelViewportXs;
   public static Dimension cachedStretchedDimensions;
   public static Map spriteOverrides;
   public static boolean hideAttackers;
   // $FF: synthetic field
   public static boolean $assertionsDisabled;
   public static int oldMenuEntryCount;
   public static boolean pitchRelaxEnabled;
   public static double scalingFactor;
   public static boolean oldIsResized;
   public static int[] rl$modelViewportYs;
   public static Dimension cachedRealDimensions;
   public static RSScript currentScript;
   public static int lastPitch;
   public static int itemPressedDurationBuffer;
   public static RSPlayer[] oldPlayers;
   public static int lastPitchTarget;
   public static int currentScriptPC;
   @ObfuscatedName("ak")
   static boolean field2152;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = 1781919273
   )
   public static int field2206;
   @ObfuscatedName("jh")
   @ObfuscatedGetter(
      intValue = -1474278951
   )
   static int field2271;
   @ObfuscatedName("ii")
   static boolean field2236;
   @ObfuscatedName("hw")
   @ObfuscatedGetter(
      intValue = -1777342791
   )
   static int field2193;
   @ObfuscatedName("kd")
   static int[] field2361;
   @ObfuscatedName("iu")
   static int[] field2385;
   @ObfuscatedName("ef")
   @ObfuscatedSignature(
      signature = "Lew;"
   )
   static class2 field2191;
   @ObfuscatedName("gu")
   @ObfuscatedGetter(
      intValue = -1912692861
   )
   static int field2159;
   @ObfuscatedName("ht")
   @ObfuscatedGetter(
      intValue = -160348481
   )
   static int field2229;
   @ObfuscatedName("cb")
   static boolean field2171;
   @ObfuscatedName("lf")
   @ObfuscatedGetter(
      intValue = 1810391111
   )
   static int field2306;
   @ObfuscatedName("et")
   @ObfuscatedGetter(
      intValue = -2064714623
   )
   static int field2187;
   @ObfuscatedName("hp")
   @ObfuscatedGetter(
      intValue = 1136244785
   )
   static int field2227;
   @ObfuscatedName("ip")
   static int[][] field2314;
   @ObfuscatedName("ll")
   static int[] field2292;
   @ObfuscatedName("li")
   @ObfuscatedGetter(
      intValue = -815598285
   )
   static int field2302;
   @ObfuscatedName("ik")
   static int[] field2246;
   @ObfuscatedName("jk")
   @ObfuscatedGetter(
      intValue = 991796541
   )
   static int field2431;
   @ObfuscatedName("jt")
   @ObfuscatedSignature(
      signature = "[Lbw;"
   )
   static class199[] field2269;
   @ObfuscatedName("is")
   @ObfuscatedGetter(
      intValue = -1934202447
   )
   static int field2241;
   @ObfuscatedName("km")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   static class70 field2282;
   @ObfuscatedName("jz")
   @ObfuscatedGetter(
      intValue = 691803225
   )
   static int field2262;
   @ObfuscatedName("bm")
   static boolean field2157;
   @ObfuscatedName("ck")
   static boolean field2178;
   @ObfuscatedName("fm")
   @ObfuscatedSignature(
      signature = "Led;"
   )
   static class128 field2225;
   @ObfuscatedName("ij")
   static String[] field2249;
   @ObfuscatedName("hg")
   @ObfuscatedGetter(
      intValue = 1192902631
   )
   static int field2228;
   @ObfuscatedName("jn")
   static boolean field2258;
   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      signature = "Lcf;"
   )
   static class302 field2181;
   @ObfuscatedName("ie")
   static boolean field2238;
   @ObfuscatedName("gj")
   @ObfuscatedGetter(
      intValue = 1622095653
   )
   static int field2410;
   @ObfuscatedName("ki")
   static int[] field2279;
   @ObfuscatedName("fp")
   @ObfuscatedGetter(
      intValue = 1596167271
   )
   static int field2207;
   @ObfuscatedName("ly")
   @ObfuscatedGetter(
      intValue = 1713289981
   )
   static int field2332;
   @ObfuscatedName("ct")
   @ObfuscatedGetter(
      intValue = 146676437
   )
   static int field2179;
   @ObfuscatedName("eh")
   @ObfuscatedSignature(
      signature = "[Lbd;"
   )
   static class176[] field2195;
   @ObfuscatedName("lk")
   @ObfuscatedGetter(
      intValue = -1557040993
   )
   static int field2303;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      longValue = 4712604639809803875L
   )
   static long field2169;
   @ObfuscatedName("fi")
   @ObfuscatedSignature(
      signature = "Lje;"
   )
   static class53 field2398;
   @ObfuscatedName("iv")
   @ObfuscatedGetter(
      intValue = -407059041
   )
   static int field2234;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 358046815
   )
   static int field2158;
   @ObfuscatedName("id")
   @ObfuscatedGetter(
      intValue = 487837195
   )
   public static int field2235;
   @ObfuscatedName("jl")
   @ObfuscatedGetter(
      intValue = -96975487
   )
   static int field2261;
   @ObfuscatedName("fv")
   @ObfuscatedGetter(
      intValue = -1900507003
   )
   static int field2344;
   @ObfuscatedName("ja")
   static boolean field2272;
   @ObfuscatedName("jr")
   @ObfuscatedGetter(
      intValue = 58785275
   )
   static int field2186;
   @ObfuscatedName("ba")
   public static boolean field2156;
   @ObfuscatedName("iy")
   @ObfuscatedGetter(
      intValue = -184753419
   )
   static int field2252;
   @ObfuscatedName("dn")
   @ObfuscatedGetter(
      intValue = 78155071
   )
   static int field2185;
   @ObfuscatedName("en")
   @ObfuscatedGetter(
      intValue = -764713721
   )
   static int field2196;
   @ObfuscatedName("kx")
   static int[] field2218;
   @ObfuscatedName("la")
   @ObfuscatedGetter(
      intValue = -1430360849
   )
   static int field2374;
   @ObfuscatedName("hq")
   static boolean field2300;
   @ObfuscatedName("eq")
   @ObfuscatedSignature(
      signature = "Lcj;"
   )
   static class129 field2324;
   @ObfuscatedName("fc")
   @ObfuscatedGetter(
      intValue = 957355905
   )
   static int field2209;
   @ObfuscatedName("kl")
   @ObfuscatedGetter(
      intValue = 385744931
   )
   static int field2383;
   @ObfuscatedName("ch")
   @ObfuscatedGetter(
      intValue = -1553084451
   )
   static int field2176;
   @ObfuscatedName("cz")
   @ObfuscatedGetter(
      longValue = -6468747586321673221L
   )
   static long field2166;
   @ObfuscatedName("cn")
   @ObfuscatedGetter(
      intValue = -2124292063
   )
   static int field2423;
   @ObfuscatedName("kn")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   static class70 field2284;
   @ObfuscatedName("le")
   static boolean field2153;
   @ObfuscatedName("kc")
   static final int[] field2276;
   @ObfuscatedName("er")
   static boolean field2192;
   @ObfuscatedName("fs")
   @ObfuscatedGetter(
      intValue = -319090217
   )
   static int field2210;
   @ObfuscatedName("ji")
   @ObfuscatedGetter(
      intValue = 899905929
   )
   static int field2266;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "[Lfr;"
   )
   static class3[] field2211;
   @ObfuscatedName("lj")
   static int[] field2291;
   @ObfuscatedName("gn")
   static boolean field2212;
   @ObfuscatedName("he")
   @ObfuscatedGetter(
      intValue = 1177666745
   )
   static int field2285;
   @ObfuscatedName("ir")
   static int[] field2247;
   @ObfuscatedName("iw")
   static int[] field2175;
   @ObfuscatedName("el")
   @ObfuscatedGetter(
      intValue = -436279813
   )
   static int field2189;
   @Inject
   @Named("Core Logger")
   public Logger logger;
   public DrawCallbacks drawCallbacks;
   public boolean gpu;
   @Inject
   public Callbacks callbacks;
   public Cache varbitCache;

   static {
      field2152 = true;
      field2206 = 1;
      field2154 = 0;
      field2155 = 0;
      field2156 = false;
      field2157 = false;
      field2158 = 0;
      field2388 = -1;
      field2160 = false;
      field2161 = 0;
      field2215 = true;
      field2165 = 0;
      field2166 = 1L;
      field2167 = -1;
      field2151 = -1;
      field2169 = -1L;
      field2178 = true;
      field2171 = false;
      field2172 = 0;
      field2173 = 0;
      field2280 = 0;
      field2220 = 0;
      field2176 = 0;
      field2320 = 0;
      field2423 = 0;
      field2179 = 0;
      field2180 = 0;
      field2181 = class302.field3752;
      field2174 = class302.field3752;
      field2183 = 0;
      field2184 = 0;
      field2185 = 0;
      field2305 = 0;
      field2187 = 0;
      field2297 = 0;
      field2189 = 0;
      field2392 = 0;
      field2191 = class2.field16;
      field2192 = false;
      field2324 = new class129();
      field2254 = null;
      field2195 = new class176['耀'];
      field2196 = 0;
      field2197 = new int['耀'];
      field2198 = 0;
      field2199 = new int[250];
      field2384 = new class137();
      field2298 = 0;
      field2421 = false;
      field2203 = true;
      field2398 = new class53();
      field2205 = new HashMap();
      field2344 = 0;
      field2207 = 1;
      field2202 = 0;
      field2209 = 1;
      field2210 = 0;
      field2211 = new class3[4];
      field2212 = false;
      field2213 = new int[4][13][13];
      field2399 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      field2410 = 0;
      field2159 = 2301979;
      field2217 = 5063219;
      field2285 = 3353893;
      field2219 = 7759444;
      field2300 = false;
      field2221 = 0;
      field2222 = 128;
      field2223 = 0;
      field2224 = 0;
      field2164 = 0;
      field2239 = 0;
      field2227 = 0;
      field2228 = 0;
      field2229 = 50;
      field2403 = 0;
      field2231 = 0;
      field2193 = 0;
      field2233 = 12;
      field2234 = 6;
      field2235 = 0;
      field2236 = false;
      field2214 = 0;
      field2238 = false;
      field2267 = 0;
      field2240 = 0;
      field2241 = 50;
      field2242 = new int[field2241];
      field2273 = new int[field2241];
      field2385 = new int[field2241];
      field2175 = new int[field2241];
      field2246 = new int[field2241];
      field2247 = new int[field2241];
      field2346 = new int[field2241];
      field2249 = new String[field2241];
      field2314 = new int[104][104];
      field2251 = 0;
      field2252 = -1;
      field2253 = -1;
      field2370 = 0;
      field2255 = 0;
      field2245 = 0;
      field2257 = 0;
      field2258 = true;
      field2431 = 0;
      field2260 = 0;
      field2261 = 0;
      field2262 = 0;
      field2352 = 0;
      field2264 = 0;
      field2265 = false;
      field2266 = 0;
      field2329 = 0;
      field2268 = true;
      field2269 = new class199[2048];
      field2186 = -1;
      field2271 = 0;
      field2272 = true;
      field2383 = 0;
      field2274 = 0;
      field2226 = new int[1000];
      field2276 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
      field2277 = new String[8];
      field2278 = new boolean[8];
      field2279 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
      field2343 = -1;
      field2182 = new class70[4][104][104];
      field2282 = new class70();
      field2283 = new class70();
      field2284 = new class70();
      field2361 = new int[25];
      field2286 = new int[25];
      field2218 = new int[25];
      field2288 = 0;
      field2360 = false;
      field2290 = 0;
      field2291 = new int[500];
      field2292 = new int[500];
      field2293 = new int[500];
      field2368 = new int[500];
      field2295 = new String[500];
      field2296 = new String[500];
      field2327 = new boolean[500];
      field2387 = false;
      field2299 = false;
      field2153 = false;
      field2301 = true;
      field2302 = -1;
      field2303 = -1;
      field2374 = 0;
      field2332 = 50;
      field2306 = 0;
      field2256 = null;
      field2308 = false;
      field2309 = -1;
      field2310 = -1;
      field2311 = null;
      field2312 = null;
      field2313 = -1;
      field2412 = new class98(8);
      field2336 = 0;
      field2316 = -1;
      field2317 = 0;
      field2318 = 0;
      field2319 = null;
      field2163 = 0;
      field2321 = 0;
      field2263 = 0;
      field2323 = -1;
      field2250 = false;
      field2325 = null;
      field2326 = null;
      field2335 = null;
      field2304 = 0;
      field2307 = 0;
      field2330 = null;
      field2331 = false;
      field2248 = -1;
      field2333 = -1;
      field2334 = false;
      field2204 = -1;
      field2281 = -1;
      field2337 = false;
      field2338 = 1;
      field2339 = new int[32];
      field2340 = 0;
      field2177 = new int[32];
      field2342 = 0;
      field2289 = new int[32];
      field2416 = 0;
      field2315 = 0;
      field2404 = 0;
      field2347 = 0;
      field2348 = 0;
      field2349 = 0;
      field2350 = 0;
      field2395 = 0;
      field2232 = new class70();
      field2353 = new class70();
      field2354 = new class70();
      field2355 = new class98(512);
      field2356 = 0;
      field2380 = -2;
      field2351 = new boolean[100];
      field2287 = new boolean[100];
      field2168 = new boolean[100];
      field2322 = new int[100];
      field2362 = new int[100];
      field2363 = new int[100];
      field2364 = new int[100];
      field2365 = 0;
      field2366 = 0L;
      field2367 = true;
      field2243 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      field2369 = 0;
      field2358 = 0;
      field2371 = "";
      field2372 = new long[100];
      field2373 = 0;
      field2415 = 0;
      field2375 = new int[128];
      field2376 = new int[128];
      field2377 = -1L;
      field2194 = -1;
      field2379 = 0;
      field2190 = new int[1000];
      field2381 = new int[1000];
      field2382 = new SpritePixels[1000];
      field2216 = 0;
      field2414 = 0;
      field2411 = 0;
      field2386 = 255;
      field2328 = -1;
      field2393 = false;
      field2389 = 127;
      field2390 = 127;
      field2391 = 0;
      field2294 = new int[50];
      field2345 = new int[50];
      field2394 = new int[50];
      field2429 = new int[50];
      field2188 = new class130[50];
      field2397 = false;
      field2208 = new boolean[5];
      field2201 = new int[5];
      field2400 = new int[5];
      field2401 = new int[5];
      field2402 = new int[5];
      field2396 = 256;
      field2405 = 205;
      field2259 = 256;
      field2406 = 320;
      field2407 = 1;
      field2408 = 32767;
      field2409 = 1;
      field2341 = 32767;
      field2244 = 0;
      field2237 = 0;
      field2413 = 0;
      field2359 = 0;
      field2230 = 0;
      field2275 = new class327();
      field2417 = -1;
      field2418 = -1;
      field2419 = new class261();
      field2420 = new class307[8];
      field2357 = new class276();
      field2422 = -1;
      field2270 = new ArrayList(10);
      field2424 = 0;
      field2425 = new class267();
      field2426 = new int[50];
      field2427 = new int[50];
      rl$$clinit();
      rl$$clinit1();
      rl$$clinit2();
      rl$$clinit3();
      rl$$clinit4();
      rl$$clinit5();
   }

   public client() {
      this.rl$$init();
   }

   @ObfuscatedName("fl")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1795154637"
   )
   void method3255() {
      int var1 = class167.field2010;
      int var2 = class193.field2748;
      if(super.field3736 < var1) {
         var1 = super.field3736;
      }

      if(super.field3725 < var2) {
         var2 = super.field3725;
      }

      if(class175.field2134 != null) {
         try {
            class248.method4960(class302.field3755, "resize", new Object[]{Integer.valueOf(class214.method4379())});
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
   final boolean method3257(class137 var1) {
      class36 var2 = var1.method2586();
      class1 var3 = var1.field1764;
      if(var2 == null) {
         return false;
      } else {
         int var6;
         String var29;
         try {
            int var5;
            if(var1.field1759 == null) {
               if(var1.field1766) {
                  if(!var2.vmethod2817(1)) {
                     return false;
                  }

                  var2.vmethod2803(var1.field1764.field1694, 0, 1);
                  var1.field1767 = 0;
                  var1.field1766 = false;
               }

               var3.field1693 = 0;
               if(var3.method38()) {
                  if(!var2.vmethod2817(1)) {
                     return false;
                  }

                  var2.vmethod2803(var1.field1764.field1694, 1, 1);
                  var1.field1767 = 0;
               }

               var1.field1766 = true;
               ServerProt[] var4 = class213.method4365();
               var5 = var3.method17();
               if(var5 < 0 || var5 >= var4.length) {
                  throw new IOException(var5 + " " + var3.field1693);
               }

               var1.field1759 = var4[var5];
               var1.field1768 = var1.field1759.field2050;
            }

            if(var1.field1768 == -1) {
               if(!var2.vmethod2817(1)) {
                  return false;
               }

               var1.method2586().vmethod2803(var3.field1694, 0, 1);
               var1.field1768 = var3.field1694[0] & 255;
            }

            if(var1.field1768 == -2) {
               if(!var2.vmethod2817(2)) {
                  return false;
               }

               var1.method2586().vmethod2803(var3.field1694, 0, 2);
               var3.field1693 = 0;
               var1.field1768 = var3.method2258();
            }

            if(!var2.vmethod2817(var1.field1768)) {
               return false;
            }

            var3.field1693 = 0;
            var2.vmethod2803(var3.field1694, 0, var1.field1768);
            var1.field1767 = 0;
            field2398.method1199();
            var1.field1771 = var1.field1758;
            var1.field1758 = var1.field1769;
            var1.field1769 = var1.field1759;
            int var7;
            int var45;
            if(ServerProt.field2080 == var1.field1759) {
               var45 = var3.method2256();
               var5 = var3.method2256();
               var6 = var3.method2256();
               var7 = var3.method2256();
               field2208[var45] = true;
               field2201[var45] = var5;
               field2400[var45] = var6;
               field2401[var45] = var7;
               field2402[var45] = 0;
               var1.field1759 = null;
               return true;
            }

            long var9;
            long var12;
            long var17;
            long var19;
            String var38;
            if(ServerProt.field2078 == var1.field1759) {
               var38 = var3.method2265();
               var17 = var3.method2349();
               var19 = (long)var3.method2258();
               var9 = (long)var3.method2260();
               class222 var42 = (class222)class38.method678(class198.method3946(), var3.method2256());
               var12 = var9 + (var19 << 32);
               boolean var44 = false;

               for(int var15 = 0; var15 < 100; ++var15) {
                  if(var12 == field2372[var15]) {
                     var44 = true;
                     break;
                  }
               }

               if(var42.field2999 && class202.field2845.method2898(new class158(var38, class140.field1794))) {
                  var44 = true;
               }

               if(!var44 && field2329 == 0) {
                  field2372[field2373] = var12;
                  field2373 = (field2373 + 1) % 100;
                  String var21 = class190.method3813(class264.method5250(class217.method4432(var3)));
                  if(var42.field2992 != -1) {
                     class96.method1753(9, class164.method3009(var42.field2992) + var38, var21, class124.method2230(var17));
                  } else {
                     class96.method1753(9, var38, var21, class124.method2230(var17));
                  }
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2034 == var1.field1759) {
               var38 = var3.method2265();
               var17 = (long)var3.method2258();
               var19 = (long)var3.method2260();
               class222 var22 = (class222)class38.method678(class198.method3946(), var3.method2256());
               long var10 = var19 + (var17 << 32);
               boolean var23 = false;

               for(int var13 = 0; var13 < 100; ++var13) {
                  if(var10 == field2372[var13]) {
                     var23 = true;
                     break;
                  }
               }

               if(class202.field2845.method2898(new class158(var38, class140.field1794))) {
                  var23 = true;
               }

               if(!var23 && field2329 == 0) {
                  field2372[field2373] = var10;
                  field2373 = (field2373 + 1) % 100;
                  String var24 = class190.method3813(class264.method5250(class217.method4432(var3)));
                  byte var14;
                  if(var22.field2998) {
                     var14 = 7;
                  } else {
                     var14 = 3;
                  }

                  if(var22.field2992 != -1) {
                     ServerProt.method3131(var14, class164.method3009(var22.field2992) + var38, var24);
                  } else {
                     ServerProt.method3131(var14, var38, var24);
                  }
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2066 == var1.field1759) {
               class193.method3911(class329.field3973);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2108 == var1.field1759) {
               var45 = var3.method2332();
               field2313 = var45;
               this.method3261(false);
               class154.method2819(var45);
               class54.method1224(field2313, 1305326689);

               for(var5 = 0; var5 < 100; ++var5) {
                  field2351[var5] = true;
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2103 == var1.field1759) {
               class49.method1051(var3, var1.field1768);
               class148.method2685();
               var1.field1759 = null;
               return true;
            }

            class187 var8;
            if(ServerProt.field2081 == var1.field1759) {
               var45 = var3.method2332();
               var5 = var3.method2332();
               var6 = var3.method2332();
               var7 = var3.method2305();
               var8 = class48.method1047(var7);
               if(var45 != var8.field2687 || var6 != var8.field2610 || var5 != var8.field2612) {
                  var8.field2687 = var45;
                  var8.field2610 = var6;
                  var8.field2612 = var5;
                  class230.method4617(var8);
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2075 == var1.field1759) {
               class4.method76(true, var1.field1764);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2032 == var1.field1759) {
               class193.method3911(class329.field3976);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2053 == var1.field1759) {
               class202.field2845.method2893();
               field2404 = field2338;
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2095 == var1.field1759) {
               class90.method1712();
               field2321 = var3.method2456();
               field2350 = field2338;
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2054 == var1.field1759) {
               class35.method627(true, var3);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2099 == var1.field1759) {
               field2397 = true;
               class149.field1850 = var3.method2256();
               class36.field362 = var3.method2256();
               class276.field3504 = var3.method2258();
               class175.field2135 = var3.method2256();
               class208.field2887 = var3.method2256();
               if(class208.field2887 >= 100) {
                  class85.field912 = class149.field1850 * 128 + 64;
                  class116.field1324 = class36.field362 * 128 + 64;
                  class229.field3068 = class314.method6140(class85.field912, class116.field1324, class260.field3393) - class276.field3504;
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2030 == var1.field1759) {
               class193.method3911(class329.field3982);
               var1.field1759 = null;
               return true;
            }

            class187 var48;
            if(ServerProt.field2044 == var1.field1759) {
               var45 = var3.method2344();
               var5 = var3.method2258();
               if(var5 == 65535) {
                  var5 = -1;
               }

               var6 = var3.method2305();
               var48 = class48.method1047(var45);
               class42 var40;
               if(!var48.field2557) {
                  if(var5 == -1) {
                     var48.field2566 = 0;
                     var1.field1759 = null;
                     return true;
                  }

                  var40 = class164.method3014(var5);
                  var48.field2566 = 4;
                  var48.field2602 = var5;
                  var48.field2687 = var40.field459;
                  var48.field2610 = var40.field445;
                  var48.field2612 = var40.field436 * 100 / var6;
                  class230.method4617(var48);
               } else {
                  var48.field2676 = var5;
                  var48.field2685 = var6;
                  var40 = class164.method3014(var5);
                  var48.field2687 = var40.field459;
                  var48.field2610 = var40.field445;
                  var48.field2671 = var40.field439;
                  var48.field2607 = var40.field426;
                  var48.field2608 = var40.field438;
                  var48.field2612 = var40.field436;
                  if(var40.field435 == 1) {
                     var48.field2617 = 1;
                  } else {
                     var48.field2617 = 2;
                  }

                  if(var48.field2613 > 0) {
                     var48.field2612 = var48.field2612 * 32 / var48.field2613;
                  } else if(var48.field2569 > 0) {
                     var48.field2612 = var48.field2612 * 32 / var48.field2569;
                  }

                  class230.method4617(var48);
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2025 == var1.field1759) {
               class310.method6085();
               var1.field1759 = null;
               return false;
            }

            if(ServerProt.field2083 == var1.field1759) {
               var45 = var3.method2304();
               var5 = var3.method2298();
               var6 = var3.method2297();
               var48 = class48.method1047(var45);
               if(var6 != var48.field2625 || var5 != var48.field2568 || var48.field2585 != 0 || var48.field2559 != 0) {
                  var48.field2625 = var6;
                  var48.field2568 = var5;
                  var48.field2585 = 0;
                  var48.field2559 = 0;
                  class230.method4617(var48);
                  this.method3614(var48);
                  if(var48.field2560 == 0) {
                     class79.method1593(class187.field2547[var45 >> 16], var48, false);
                  }
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2092 == var1.field1759) {
               class85.field924 = class94.method1735(var3.method2256());
               var1.field1759 = null;
               return true;
            }

            class322 var47;
            if(ServerProt.field2101 == var1.field1759) {
               var45 = var3.method2285();
               var5 = var3.method2304();
               var6 = var3.method2332();
               var47 = (class322)field2412.method1776((long)var5);
               if(var47 != null) {
                  class30.method523(var47, var6 != var47.field3937);
               }

               class230.method4618(var5, var6, var45);
               var1.field1759 = null;
               return true;
            }

            int var26;
            int var27;
            if(ServerProt.field2046 == var1.field1759) {
               var45 = var3.method2304();
               var5 = var3.method2460();
               var6 = var5 >> 10 & 31;
               var7 = var5 >> 5 & 31;
               var26 = var5 & 31;
               var27 = (var7 << 11) + (var6 << 19) + (var26 << 3);
               class187 var49 = class48.method1047(var45);
               if(var27 != var49.field2633) {
                  var49.field2633 = var27;
                  class230.method4617(var49);
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2098 == var1.field1759) {
               field2411 = var3.method2256();
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2072 == var1.field1759) {
               var45 = var3.method2303();
               var5 = var3.method2460();
               if(var5 == 65535) {
                  var5 = -1;
               }

               var6 = var3.method2305();
               var7 = var3.method2258();
               if(var7 == 65535) {
                  var7 = -1;
               }

               for(var26 = var7; var26 <= var5; ++var26) {
                  var9 = (long)var26 + ((long)var6 << 32);
                  class197 var11 = field2355.method1776(var9);
                  if(var11 != null) {
                     var11.method3937();
                  }

                  field2355.method1775(new class228(var45), var9);
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2041 == var1.field1759) {
               class122.field1660 = var3.method2287();
               class252.field3336 = var3.method2286();

               while(var3.field1693 < var1.field1768) {
                  var45 = var3.method2256();
                  class329 var58 = class23.method442()[var45];
                  class193.method3911(var58);
               }

               var1.field1759 = null;
               return true;
            }

            class187 var51;
            if(ServerProt.field2031 == var1.field1759) {
               var45 = var3.method2304();
               var51 = class48.method1047(var45);

               for(var6 = 0; var6 < var51.field2682.length; ++var6) {
                  var51.field2682[var6] = -1;
                  var51.field2682[var6] = 0;
               }

               class230.method4617(var51);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2074 == var1.field1759) {
               class90.method1712();
               field2163 = var3.method2256();
               field2350 = field2338;
               var1.field1759 = null;
               return true;
            }

            class187 var30;
            if(ServerProt.field2024 == var1.field1759) {
               var45 = var3.method2344();
               var5 = var3.method2258();
               if(var45 < -70000) {
                  var5 += 32768;
               }

               if(var45 >= 0) {
                  var30 = class48.method1047(var45);
               } else {
                  var30 = null;
               }

               for(; var3.field1693 < var1.field1768; class208.method4154(var5, var7, var26 - 1, var27)) {
                  var7 = var3.method2270();
                  var26 = var3.method2258();
                  var27 = 0;
                  if(var26 != 0) {
                     var27 = var3.method2256();
                     if(var27 == 255) {
                        var27 = var3.method2344();
                     }
                  }

                  if(var30 != null && var7 >= 0 && var7 < var30.field2682.length) {
                     var30.field2682[var7] = var26;
                     var30.field2696[var7] = var27;
                  }
               }

               if(var30 != null) {
                  class230.method4617(var30);
               }

               class90.method1712();
               field2177[++field2342 - 1 & 31] = var5 & 32767;
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2091 == var1.field1759) {
               field2397 = false;

               for(var45 = 0; var45 < 5; ++var45) {
                  field2208[var45] = false;
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2038 == var1.field1759) {
               if(class250.field3328 != null) {
                  class250.field3328.method5087(var3);
               }

               class215.method4380();
               var1.field1759 = null;
               return true;
            }

            boolean var43;
            String var52;
            if(ServerProt.field2110 == var1.field1759) {
               var45 = var3.method2270();
               var43 = var3.method2256() == 1;
               var52 = "";
               boolean var41 = false;
               if(var43) {
                  var52 = var3.method2265();
                  if(class202.field2845.method2898(new class158(var52, class140.field1794))) {
                     var41 = true;
                  }
               }

               String var39 = var3.method2265();
               if(!var41) {
                  ServerProt.method3131(var45, var52, var39);
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2090 == var1.field1759) {
               var45 = var3.method2285();
               var5 = var3.method2285();
               var52 = var3.method2265();
               if(var5 >= 1 && var5 <= 8) {
                  if(var52.equalsIgnoreCase("null")) {
                     var52 = null;
                  }

                  field2277[var5 - 1] = var52;
                  playerOptionsChanged(var5 - 1);
                  field2278[var5 - 1] = var45 == 0;
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2082 == var1.field1759) {
               class202.field2845.method2894(var3, var1.field1768);
               field2404 = field2338;
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2102 == var1.field1759) {
               class296.method5789(var3.method2265());
               var1.field1759 = null;
               return true;
            }

            int var31;
            if(ServerProt.field2094 == var1.field1759) {
               var45 = var3.method2344();
               var5 = var3.method2258();
               if(var45 < -70000) {
                  var5 += 32768;
               }

               if(var45 >= 0) {
                  var30 = class48.method1047(var45);
               } else {
                  var30 = null;
               }

               if(var30 != null) {
                  for(var7 = 0; var7 < var30.field2682.length; ++var7) {
                     var30.field2682[var7] = 0;
                     var30.field2696[var7] = 0;
                  }
               }

               class214.method4378(var5);
               var7 = var3.method2258();

               for(var26 = 0; var26 < var7; ++var26) {
                  var27 = var3.method2258();
                  var31 = var3.method2256();
                  if(var31 == 255) {
                     var31 = var3.method2305();
                  }

                  if(var30 != null && var26 < var30.field2682.length) {
                     var30.field2682[var26] = var27;
                     var30.field2696[var26] = var31;
                  }

                  class208.method4154(var5, var26, var27 - 1, var31);
               }

               if(var30 != null) {
                  class230.method4617(var30);
               }

               class90.method1712();
               field2177[++field2342 - 1 & 31] = var5 & 32767;
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2035 == var1.field1759) {
               class193.method3911(class329.field3974);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2065 == var1.field1759) {
               var45 = var3.method2460();
               var5 = var3.method2268();
               var6 = var3.method2304();
               var48 = class48.method1047(var6);
               var48.field2614 = var45 + (var5 << 16);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2061 == var1.field1759) {
               for(var45 = 0; var45 < class278.field3519; ++var45) {
                  class278 var56 = class113.method2120(var45);
                  if(var56 != null) {
                     class81.field896[var45] = 0;
                     class81.field898[var45] = 0;
                     settingsChanged(var45);
                  }
               }

               class90.method1712();
               field2340 += 32;
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2105 == var1.field1759) {
               class193.method3911(class329.field3980);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2028 == var1.field1759) {
               var45 = var3.method2258();
               var5 = var3.method2344();
               class81.field896[var45] = var5;
               if(class81.field898[var45] != var5) {
                  class81.field898[var45] = var5;
                  settingsChanged(var45);
               }

               class47.method896(var45);
               field2339[++field2340 - 1 & 31] = var45;
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2039 == var1.field1759) {
               var45 = var3.method2456();
               var5 = var3.method2305();
               var30 = class48.method1047(var5);
               if(var45 != var30.field2605 || var45 == -1) {
                  var30.field2605 = var45;
                  var30.field2686 = 0;
                  var30.field2663 = 0;
                  class230.method4617(var30);
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2073 == var1.field1759) {
               var45 = var3.field1693 + var1.field1768;
               var5 = var3.method2258();
               var6 = var3.method2258();
               if(var5 != field2313) {
                  field2313 = var5;
                  this.method3261(false);
                  class154.method2819(field2313);
                  class54.method1224(field2313, -148985526);

                  for(var7 = 0; var7 < 100; ++var7) {
                     field2351[var7] = true;
                  }
               }

               class322 var28;
               for(; var6-- > 0; var28.field3935 = true) {
                  var7 = var3.method2344();
                  var26 = var3.method2258();
                  var27 = var3.method2256();
                  var28 = (class322)field2412.method1776((long)var7);
                  if(var28 != null && var26 != var28.field3937) {
                     class30.method523(var28, true);
                     var28 = null;
                  }

                  if(var28 == null) {
                     var28 = class230.method4618(var7, var26, var27);
                  }
               }

               for(var47 = (class322)field2412.method1783(); var47 != null; var47 = (class322)field2412.method1779()) {
                  if(var47.field3935) {
                     var47.field3935 = false;
                  } else {
                     class30.method523(var47, true);
                  }
               }

               field2355 = new class98(512);

               while(var3.field1693 < var45) {
                  var7 = var3.method2344();
                  var26 = var3.method2258();
                  var27 = var3.method2258();
                  var31 = var3.method2344();

                  for(int var32 = var26; var32 <= var27; ++var32) {
                     var12 = ((long)var7 << 32) + (long)var32;
                     field2355.method1775(new class228(var31), var12);
                  }
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2084 == var1.field1759) {
               var45 = var3.method2344();
               class322 var55 = (class322)field2412.method1776((long)var45);
               if(var55 != null) {
                  class30.method523(var55, true);
               }

               if(field2319 != null) {
                  class230.method4617(field2319);
                  field2319 = null;
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2079 == var1.field1759) {
               var45 = var3.method2256();
               class329.method6323(var45);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2107 == var1.field1759) {
               field2397 = true;
               class159.field1954 = var3.method2256();
               class265.field3447 = var3.method2256();
               class43.field484 = var3.method2258();
               class12.field129 = var3.method2256();
               class225.field3038 = var3.method2256();
               if(class225.field3038 >= 100) {
                  var45 = class159.field1954 * 128 + 64;
                  var5 = class265.field3447 * 128 + 64;
                  var6 = class314.method6140(var45, var5, class260.field3393) - class43.field484;
                  var7 = var45 - class85.field912;
                  var26 = var6 - class229.field3068;
                  var27 = var5 - class116.field1324;
                  var31 = (int)Math.sqrt((double)(var7 * var7 + var27 * var27));
                  field2430 = (int)(Math.atan2((double)var26, (double)var31) * 325.949D) & 2047;
                  onCameraPitchChanged(-1);
                  class220.field2986 = (int)(Math.atan2((double)var7, (double)var27) * -325.949D) & 2047;
                  if(field2430 < 128) {
                     field2430 = 128;
                     onCameraPitchChanged(-1);
                  }

                  if(field2430 > 383) {
                     field2430 = 383;
                     onCameraPitchChanged(-1);
                  }
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2026 == var1.field1759) {
               class193.method3911(class329.field3978);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2076 == var1.field1759) {
               if(field2313 != -1) {
                  class191.method3910(field2313, 0);
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2045 == var1.field1759) {
               var45 = var3.method2344();
               var43 = var3.method2256() == 1;
               var30 = class48.method1047(var45);
               if(var43 != var30.field2583) {
                  var30.field2583 = var43;
                  var30.onHiddenChanged(-1);
                  class230.method4617(var30);
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2088 == var1.field1759) {
               class252.field3336 = var3.method2286();
               class122.field1660 = var3.method2287();
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2100 == var1.field1759) {
               var3.field1693 += 28;
               if(var3.method2281()) {
                  class307.method6051(var3, var3.field1693 - 28);
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2070 == var1.field1759) {
               var45 = var3.method2268();
               class107.method1887(var45);
               field2177[++field2342 - 1 & 31] = var45 & 32767;
               var1.field1759 = null;
               return true;
            }

            boolean var46;
            if(ServerProt.field2051 == var1.field1759) {
               var46 = var3.method2256() == 1;
               if(var46) {
                  class152.field1884 = class321.method6252() - var3.method2349();
                  class141.field1801 = new class138(var3, true);
               } else {
                  class141.field1801 = null;
               }

               field2349 = field2338;
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2106 == var1.field1759) {
               var45 = var3.method2344();
               var5 = var3.method2344();
               class322 var57 = (class322)field2412.method1776((long)var5);
               var47 = (class322)field2412.method1776((long)var45);
               if(var47 != null) {
                  class30.method523(var47, var57 == null || var47.field3937 != var57.field3937);
               }

               if(var57 != null) {
                  var57.method3937();
                  field2412.method1775(var57, (long)var45);
               }

               var8 = class48.method1047(var5);
               if(var8 != null) {
                  class230.method4617(var8);
               }

               var8 = class48.method1047(var45);
               if(var8 != null) {
                  class230.method4617(var8);
                  class79.method1593(class187.field2547[var8.field2621 >>> 16], var8, true);
               }

               if(field2313 != -1) {
                  class191.method3910(field2313, 1);
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2055 == var1.field1759) {
               var45 = var3.method2305();
               var5 = var3.method2332();
               var30 = class48.method1047(var45);
               if(var30.field2566 != 1 || var5 != var30.field2602) {
                  var30.field2566 = 1;
                  var30.field2602 = var5;
                  class230.method4617(var30);
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2057 == var1.field1759) {
               class35.method627(false, var3);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2087 == var1.field1759) {
               field2173 = var3.method2256();
               if(field2173 == 1) {
                  field2280 = var3.method2258();
               }

               if(field2173 >= 2 && field2173 <= 6) {
                  if(field2173 == 2) {
                     field2179 = 64;
                     field2180 = 64;
                  }

                  if(field2173 == 3) {
                     field2179 = 0;
                     field2180 = 64;
                  }

                  if(field2173 == 4) {
                     field2179 = 128;
                     field2180 = 64;
                  }

                  if(field2173 == 5) {
                     field2179 = 64;
                     field2180 = 0;
                  }

                  if(field2173 == 6) {
                     field2179 = 64;
                     field2180 = 128;
                  }

                  field2173 = 2;
                  field2176 = var3.method2258();
                  field2320 = var3.method2258();
                  field2423 = var3.method2256();
               }

               if(field2173 == 10) {
                  field2220 = var3.method2258();
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2056 == var1.field1759) {
               class202.field2845.field1948.method164(var3, var1.field1768);
               class316.method6199();
               field2404 = field2338;
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2058 == var1.field1759) {
               class193.method3911(class329.field3975);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2068 == var1.field1759) {
               var45 = var3.method2305();
               var5 = var3.method2332();
               var30 = class48.method1047(var45);
               if(var30 != null && var30.field2560 == 0) {
                  if(var5 > var30.field2582 - var30.field2574) {
                     var5 = var30.field2582 - var30.field2574;
                  }

                  if(var5 < 0) {
                     var5 = 0;
                  }

                  if(var5 != var30.field2580) {
                     var30.field2580 = var5;
                     class230.method4617(var30);
                  }
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2048 == var1.field1759) {
               var38 = var3.method2265();
               var29 = class190.method3813(class264.method5250(class217.method4432(var3)));
               ServerProt.method3131(6, var38, var29);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2047 == var1.field1759) {
               var45 = var3.method2332();
               if(var45 == 65535) {
                  var45 = -1;
               }

               class230.method4619(var45);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2064 == var1.field1759) {
               var45 = var3.method2299();
               var5 = var3.method2460();
               if(var5 == 65535) {
                  var5 = -1;
               }

               class96.method1765(var5, var45);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2085 == var1.field1759) {
               var45 = var3.method2344();
               if(var45 != field2235) {
                  field2235 = var45;
                  class164.method3008();
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2077 == var1.field1759) {
               class193.method3911(class329.field3981);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2040 == var1.field1759) {
               class4.method76(false, var1.field1764);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2036 == var1.field1759) {
               class193.method3911(class329.field3977);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2059 == var1.field1759) {
               var45 = var3.method2332();
               var5 = var3.method2305();
               var30 = class48.method1047(var5);
               if(var30.field2566 != 2 || var45 != var30.field2602) {
                  var30.field2566 = 2;
                  var30.field2602 = var45;
                  class230.method4617(var30);
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2097 == var1.field1759) {
               for(var45 = 0; var45 < class81.field898.length; ++var45) {
                  if(class81.field898[var45] != class81.field896[var45]) {
                     class81.field898[var45] = class81.field896[var45];
                     settingsChanged(var45);
                     class47.method896(var45);
                     field2339[++field2340 - 1 & 31] = var45;
                  }
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2027 == var1.field1759) {
               var46 = var3.method2439();
               if(var46) {
                  if(class177.field2445 == null) {
                     class177.field2445 = new class206();
                  }
               } else {
                  class177.field2445 = null;
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2086 == var1.field1759) {
               var38 = var3.method2265();
               Object[] var53 = new Object[var38.length() + 1];

               for(var6 = var38.length() - 1; var6 >= 0; --var6) {
                  if(var38.charAt(var6) == 's') {
                     var53[var6 + 1] = var3.method2265();
                  } else {
                     var53[var6 + 1] = new Integer(var3.method2344());
                  }
               }

               var53[0] = new Integer(var3.method2344());
               class194 var54 = new class194();
               var54.field2765 = var53;
               class209.method4198(var54);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2093 == var1.field1759) {
               var45 = var3.method2344();
               var5 = var3.method2344();
               var6 = class260.method5179();
               class12 var25 = class150.method2761(ClientProt.field3167, field2384.field1770);
               var25.field121.method2283(var6);
               var25.field121.method2288(GameEngine.field3723);
               var25.field121.method2301(var45);
               var25.field121.method2300(var5);
               field2384.method2573(var25);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2104 == var1.field1759) {
               field2358 = var3.method2286();
               field2369 = var3.method2286();
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2063 == var1.field1759) {
               class90.method1712();
               var45 = var3.method2303();
               var5 = var3.method2286();
               var6 = var3.method2256();
               field2218[var5] = var45;
               experiencedChanged(var5);
               field2361[var5] = var6;
               boostedSkillLevelsChanged(var5);
               field2286[var5] = 1;

               for(var7 = 0; var7 < 98; ++var7) {
                  if(var45 >= class268.field3461[var7]) {
                     field2286[var5] = var7 + 2;
                  }
               }

               field2289[++field2416 - 1 & 31] = var5;
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2089 == var1.field1759) {
               var45 = var3.method2258();
               var5 = var3.method2256();
               var6 = var3.method2258();
               class225.method4556(var45, var5, var6);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2060 == var1.field1759) {
               var45 = var3.method2305();
               var51 = class48.method1047(var45);
               var51.field2566 = 3;
               var51.field2602 = class32.field303.field2801.method6297();
               class230.method4617(var51);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2042 == var1.field1759) {
               byte[] var37 = new byte[var1.field1768];
               var3.method0(var37, 0, var37.length);
               class125 var50 = new class125(var37);
               var52 = var50.method2265();
               class212.method4358(var52, true, false);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2052 == var1.field1759) {
               for(var45 = 0; var45 < field2269.length; ++var45) {
                  if(field2269[var45] != null) {
                     field2269[var45].field1086 = -1;
                     field2269[var45].animationChanged(-1);
                  }
               }

               for(var45 = 0; var45 < field2195.length; ++var45) {
                  if(field2195[var45] != null) {
                     field2195[var45].field1086 = -1;
                     field2195[var45].animationChanged(-1);
                  }
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2067 == var1.field1759) {
               if(var1.field1768 == 0) {
                  class250.field3328 = null;
                  clanMemberManagerChanged(-1);
               } else {
                  if(class250.field3328 == null) {
                     class250.field3328 = new class254(class140.field1794, class302.field3755);
                     clanMemberManagerChanged(-1);
                  }

                  class250.field3328.method5086(var3);
               }

               class215.method4380();
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2069 == var1.field1759) {
               var45 = var3.method2256();
               if(var3.method2256() == 0) {
                  field2420[var45] = new class307();
                  onGrandExchangeOffersChanged(var45);
                  var3.field1693 += 18;
               } else {
                  --var3.field1693;
                  field2420[var45] = new class307(var3, false);
                  onGrandExchangeOffersChanged(var45);
               }

               field2348 = field2338;
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2029 == var1.field1759) {
               field2216 = var3.method2256();
               if(field2216 == 255) {
                  field2216 = 0;
               }

               field2414 = var3.method2256();
               if(field2414 == 255) {
                  field2414 = 0;
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2033 == var1.field1759) {
               class142.method2636(var3, var1.field1768);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2043 == var1.field1759) {
               var45 = var3.method2344();
               var29 = var3.method2265();
               var30 = class48.method1047(var45);
               if(!var29.equals(var30.field2619)) {
                  var30.field2619 = var29;
                  class230.method4617(var30);
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2037 == var1.field1759) {
               class193.method3911(class329.field3979);
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2049 == var1.field1759) {
               class122.field1660 = var3.method2286();
               class252.field3336 = var3.method2256();

               for(var45 = class252.field3336; var45 < class252.field3336 + 8; ++var45) {
                  for(var5 = class122.field1660; var5 < class122.field1660 + 8; ++var5) {
                     if(field2182[class260.field3393][var45][var5] != null) {
                        field2182[class260.field3393][var45][var5] = null;
                        class236.method4712(var45, var5);
                     }
                  }
               }

               for(class87 var36 = (class87)field2282.method1503(); var36 != null; var36 = (class87)field2282.method1505()) {
                  if(var36.field932 >= class252.field3336 && var36.field932 < class252.field3336 + 8 && var36.field933 >= class122.field1660 && var36.field933 < class122.field1660 + 8 && var36.field938 == class260.field3393) {
                     var36.field939 = 0;
                  }
               }

               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2071 == var1.field1759) {
               class88 var35 = new class88();
               var35.field955 = var3.method2265();
               var35.field958 = var3.method2258();
               var5 = var3.method2344();
               var35.field953 = var5;
               class142.method2635(45);
               var2.vmethod2787();
               var2 = null;
               class74.method1558(var35);
               var1.field1759 = null;
               return false;
            }

            if(ServerProt.field2096 == var1.field1759) {
               field2172 = var3.method2258() * 30;
               field2350 = field2338;
               var1.field1759 = null;
               return true;
            }

            if(ServerProt.field2062 == var1.field1759) {
               byte var16 = var3.method2434();
               var5 = var3.method2460();
               class81.field896[var5] = var16;
               if(class81.field898[var5] != var16) {
                  class81.field898[var5] = var16;
                  settingsChanged(var5);
               }

               class47.method896(var5);
               field2339[++field2340 - 1 & 31] = var5;
               var1.field1759 = null;
               return true;
            }

            class202.method4018("" + (var1.field1759 != null?var1.field1759.field2109:-1) + "," + (var1.field1758 != null?var1.field1758.field2109:-1) + "," + (var1.field1771 != null?var1.field1771.field2109:-1) + "," + var1.field1768, (Throwable)null, -1953733731);
            class310.method6085();
         } catch (IOException var33) {
            class241.method4744();
         } catch (Exception var34) {
            var29 = "" + (var1.field1759 != null?var1.field1759.field2109:-1) + "," + (var1.field1758 != null?var1.field1758.field2109:-1) + "," + (var1.field1771 != null?var1.field1771.field2109:-1) + "," + var1.field1768 + "," + (class32.field303.field1101[0] + class229.field3067) + "," + (class32.field303.field1128[0] + class35.field360) + ",";

            for(var6 = 0; var6 < var1.field1768 && var6 < 50; ++var6) {
               var29 = var29 + var3.field1694[var6] + ",";
            }

            class202.method4018(var29, var34, 699505788);
            class310.method6085();
         }

         return true;
      }
   }

   @ObfuscatedName("jd")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1950026471"
   )
   final void method3263() {
      class230.method4617(field2326);
      ++class158.field1945;
      if(field2334 && field2331) {
         int var1 = class163.field1975;
         int var2 = class163.field1976;
         var1 -= field2304;
         var2 -= field2307;
         if(var1 < field2248) {
            var1 = field2248;
         }

         if(var1 + field2326.field2573 > field2248 + field2335.field2573) {
            var1 = field2248 + field2335.field2573 - field2326.field2573;
         }

         if(var2 < field2333) {
            var2 = field2333;
         }

         if(var2 + field2326.field2574 > field2333 + field2335.field2574) {
            var2 = field2333 + field2335.field2574 - field2326.field2574;
         }

         int var3 = var1 - field2204;
         int var4 = var2 - field2281;
         int var5 = field2326.field2670;
         if(class158.field1945 > field2326.field2641 && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
            field2337 = true;
            draggingWidgetChanged(-1);
         }

         int var6 = var1 - field2248 + field2335.field2579;
         int var7 = var2 - field2333 + field2335.field2580;
         class194 var8;
         if(field2326.field2653 != null && field2337) {
            var8 = new class194();
            var8.field2759 = field2326;
            var8.field2764 = var6;
            var8.field2761 = var7;
            var8.field2765 = field2326.field2653;
            class209.method4198(var8);
         }

         if(class163.field1983 == 0) {
            if(field2337) {
               if(field2326.field2654 != null) {
                  var8 = new class194();
                  var8.field2759 = field2326;
                  var8.field2764 = var6;
                  var8.field2761 = var7;
                  var8.field2767 = field2330;
                  var8.field2765 = field2326.field2654;
                  class209.method4198(var8);
               }

               if(field2330 != null) {
                  class187 var9 = field2326;
                  int var11 = class203.method4026(var9);
                  int var10 = var11 >> 17 & 7;
                  int var12 = var10;
                  class187 var17;
                  if(var10 == 0) {
                     var17 = null;
                  } else {
                     int var13 = 0;

                     while(true) {
                        if(var13 >= var12) {
                           var17 = var9;
                           break;
                        }

                        var9 = class48.method1047(var9.field2577);
                        if(var9 == null) {
                           var17 = null;
                           break;
                        }

                        ++var13;
                     }
                  }

                  if(var17 != null) {
                     class12 var14 = class150.method2761(ClientProt.field3213, field2384.field1770);
                     var14.field121.method2292(field2326.field2620);
                     var14.field121.method2292(field2330.field2676);
                     var14.field121.method2242(field2330.field2620);
                     var14.field121.method2300(field2326.field2621);
                     var14.field121.method2301(field2330.field2621);
                     var14.field121.method2242(field2326.field2676);
                     field2384.method2573(var14);
                  }
               }
            } else if(this.method3259()) {
               this.method3320(field2304 + field2204, field2281 + field2307);
            } else if(field2290 > 0) {
               int var15 = field2304 + field2204;
               int var16 = field2307 + field2281;
               class185.method3742(class322.field3939, var15, var16);
               class322.field3939 = null;
            }

            field2326 = null;
         }

      } else {
         if(class158.field1945 > 1) {
            field2326 = null;
         }

      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-22347014"
   )
   protected final void vmethod5857(boolean var1) {
      this.methodDraw(var1);
      boolean var2 = class129.method2496();
      if(var2 && field2393 && class175.field2147 != null) {
         class175.field2147.method5717();
      }

      if((field2161 == 10 || field2161 == 20 || field2161 == 30) && field2366 != 0L && class321.method6252() > field2366) {
         class109.method1920(class214.method4379());
      }

      int var3;
      if(var1) {
         for(var3 = 0; var3 < 100; ++var3) {
            field2351[var3] = true;
         }
      }

      if(field2161 == 0) {
         this.method5862(class39.field375, class39.field387, var1);
      } else if(field2161 == 5) {
         class85.method1628(class172.field2117, class103.field1149, class194.field2772, var1);
      } else if(field2161 != 10 && field2161 != 11) {
         if(field2161 == 20) {
            class85.method1628(class172.field2117, class103.field1149, class194.field2772, var1);
         } else if(field2161 == 25) {
            if(field2210 == 1) {
               if(field2344 > field2207) {
                  field2207 = field2344;
               }

               var3 = (field2207 * 50 - field2344 * 50) / field2207;
               class214.method4369("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
            } else if(field2210 == 2) {
               if(field2202 > field2209) {
                  field2209 = field2202;
               }

               var3 = (field2209 * 50 - field2202 * 50) / field2209 + 50;
               class214.method4369("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
            } else {
               class214.method4369("Loading - please wait.", false);
            }
         } else if(field2161 == 30) {
            this.method3313();
         } else if(field2161 == 40) {
            class214.method4369("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
         } else if(field2161 == 45) {
            class214.method4369("Please wait...", false);
         }
      } else {
         class85.method1628(class172.field2117, class103.field1149, class194.field2772, var1);
      }

      if(field2161 == 30 && field2365 == 0 && !var1 && !field2367) {
         for(var3 = 0; var3 < field2356; ++var3) {
            if(field2287[var3]) {
               class124.field1689.vmethod6369(field2322[var3], field2362[var3], field2363[var3], field2364[var3]);
               field2287[var3] = false;
            }
         }
      } else if(field2161 > 0) {
         class124.field1689.vmethod6366(0, 0);

         for(var3 = 0; var3 < field2356; ++var3) {
            field2287[var3] = false;
         }
      }

   }

   @ObfuscatedName("ft")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "216497367"
   )
   final void method3313() {
      int var1;
      if(field2313 != -1) {
         var1 = field2313;
         if(class80.method1596(var1)) {
            class74.method1559(class187.field2547[var1], -1);
         }
      }

      for(var1 = 0; var1 < field2356; ++var1) {
         if(field2351[var1]) {
            field2287[var1] = true;
         }

         field2168[var1] = field2351[var1];
         field2351[var1] = false;
      }

      field2380 = field2165;
      field2302 = -1;
      field2303 = -1;
      ClientProt.field3258 = null;
      if(field2313 != -1) {
         field2356 = 0;
         class88.method1679(field2313, 0, 0, class167.field2010, class193.field2748, 0, 0, -1);
      }

      Hooks.drawAfterWidgets();
      class173.method3151();
      if(field2258) {
         if(field2257 == 1) {
            class184.field2505[field2245 / 100].method215(field2370 - 8, field2255 - 8);
         }

         if(field2257 == 2) {
            class184.field2505[field2245 / 100 + 4].method215(field2370 - 8, field2255 - 8);
         }
      }

      int var2;
      int var3;
      if(!field2360) {
         if(field2302 != -1) {
            var1 = field2302;
            var2 = field2303;
            if((field2290 >= 2 || field2306 != 0 || field2308) && field2301) {
               var3 = field2290 - 1;
               String var11;
               if(field2306 == 1 && field2290 < 2) {
                  var11 = "Use" + " " + field2256 + " " + "->";
               } else if(field2308 && field2290 < 2) {
                  var11 = field2311 + " " + field2312 + " " + "->";
               } else {
                  var11 = class249.method5057(var3);
               }

               if(field2290 > 2) {
                  var11 = var11 + class64.method1354(16777215) + " " + '/' + " " + (field2290 - 2) + " more options";
               }

               class172.field2117.method3822(var11, var1 + 4, var2 + 15, 16777215, 0, field2165 / 1000);
            }
         }
      } else {
         var1 = class138.field1776;
         var2 = class214.field2934;
         var3 = field2200;
         int var4 = class246.field3300;
         int var5 = 6116423;
         class173.method3167(var1, var2, var3, var4, var5);
         class173.method3167(var1 + 1, var2 + 1, var3 - 2, 16, 0);
         class173.method3149(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
         class172.field2117.method3832("Choose Option", var1 + 3, var2 + 14, var5, -1);
         int var6 = class163.field1975;
         int var7 = class163.field1976;

         for(int var8 = 0; var8 < field2290; ++var8) {
            int var9 = (field2290 - 1 - var8) * 15 + var2 + 31;
            int var10 = 16777215;
            if(var6 > var1 && var6 < var3 + var1 && var7 > var9 - 13 && var7 < var9 + 3) {
               var10 = 16776960;
            }

            class172.field2117.method3832(class249.method5057(var8), var1 + 3, var9, var10, 0);
         }

         class277.method5384(class138.field1776, class214.field2934, field2200, class246.field3300);
      }

      if(field2365 == 3) {
         for(var1 = 0; var1 < field2356; ++var1) {
            if(field2168[var1]) {
               class173.method3145(field2322[var1], field2362[var1], field2363[var1], field2364[var1], 16711935, 128);
            } else if(field2287[var1]) {
               class173.method3145(field2322[var1], field2362[var1], field2363[var1], field2364[var1], 16711680, 128);
            }
         }
      }

      class23.method441(class260.field3393, class32.field303.field1090, class32.field303.field1072, field2410);
      field2410 = 0;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1325491268"
   )
   protected final void vmethod5854() {
      if(class267.field3459.method1691()) {
         class267.field3459.method1688();
      }

      if(class208.field2882 != null) {
         class208.field2882.field3512 = false;
      }

      class208.field2882 = null;
      field2384.method2592();
      if(class96.field1057 != null) {
         class96 var1 = class96.field1057;
         synchronized(class96.field1057) {
            class96.field1057 = null;
         }
      }

      if(class163.field1968 != null) {
         class163 var11 = class163.field1968;
         synchronized(class163.field1968) {
            class163.field1968 = null;
         }
      }

      class93.field1003 = null;
      if(class175.field2147 != null) {
         class175.field2147.method5722();
      }

      if(class49.field553 != null) {
         class49.field553.method5722();
      }

      class249.method5056();
      Object var12 = class325.field3948;
      synchronized(class325.field3948) {
         if(class325.field3950 != 0) {
            class325.field3950 = 1;

            try {
               class325.field3948.wait();
            } catch (InterruptedException var6) {
               ;
            }
         }
      }

      if(class179.field2454 != null) {
         class179.field2454.method2225();
         class179.field2454 = null;
      }

      try {
         class305.field3777.method370();

         for(int var5 = 0; var5 < class305.field3775; ++var5) {
            class95.field1024[var5].method370();
         }

         class305.field3781.method370();
         class305.field3779.method370();
      } catch (Exception var9) {
         ;
      }

   }

   @ObfuscatedName("hn")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1713626641"
   )
   final void method3258() {
      boolean var1 = false;

      int var2;
      int var5;
      while(!var1) {
         var1 = true;

         for(var2 = 0; var2 < field2290 - 1; ++var2) {
            if(field2293[var2] < 1000 && field2293[var2 + 1] > 1000) {
               String var3 = field2296[var2];
               field2296[var2] = field2296[var2 + 1];
               field2296[var2 + 1] = var3;
               String var4 = field2295[var2];
               field2295[var2] = field2295[var2 + 1];
               field2295[var2 + 1] = var4;
               var5 = field2293[var2];
               field2293[var2] = field2293[var2 + 1];
               field2293[var2 + 1] = var5;
               var5 = field2291[var2];
               field2291[var2] = field2291[var2 + 1];
               field2291[var2 + 1] = var5;
               var5 = field2292[var2];
               field2292[var2] = field2292[var2 + 1];
               field2292[var2 + 1] = var5;
               var5 = field2368[var2];
               field2368[var2] = field2368[var2 + 1];
               field2368[var2 + 1] = var5;
               boolean var6 = field2327[var2];
               field2327[var2] = field2327[var2 + 1];
               field2327[var2 + 1] = var6;
               var1 = false;
            }
         }
      }

      if(class283.field3562 == null) {
         if(field2326 == null) {
            int var16 = class163.field1982;
            int var9;
            int var14;
            int var17;
            int var18;
            if(field2360) {
               int var7;
               int var13;
               if(var16 != 1 && (class225.field3039 || var16 != 4)) {
                  var2 = class163.field1975;
                  var13 = class163.field1976;
                  if(var2 < class138.field1776 - 10 || var2 > field2200 + class138.field1776 + 10 || var13 < class214.field2934 - 10 || var13 > class214.field2934 + class246.field3300 + 10) {
                     field2360 = false;
                     var14 = class138.field1776;
                     var5 = class214.field2934;
                     var17 = field2200;
                     var7 = class246.field3300;

                     for(var18 = 0; var18 < field2356; ++var18) {
                        if(field2363[var18] + field2322[var18] > var14 && field2322[var18] < var14 + var17 && field2364[var18] + field2362[var18] > var5 && field2362[var18] < var7 + var5) {
                           field2351[var18] = true;
                        }
                     }
                  }
               }

               if(var16 == 1 || !class225.field3039 && var16 == 4) {
                  var2 = class138.field1776;
                  var13 = class214.field2934;
                  var14 = field2200;
                  var5 = class163.field1980;
                  var17 = class163.field1984;
                  var7 = -1;

                  for(var18 = 0; var18 < field2290; ++var18) {
                     var9 = var13 + (field2290 - 1 - var18) * 15 + 31;
                     if(var5 > var2 && var5 < var14 + var2 && var17 > var9 - 13 && var17 < var9 + 3) {
                        var7 = var18;
                     }
                  }

                  if(var7 != -1) {
                     class269.method5330(var7);
                  }

                  field2360 = false;
                  var18 = class138.field1776;
                  var9 = class214.field2934;
                  int var10 = field2200;
                  int var11 = class246.field3300;

                  for(int var12 = 0; var12 < field2356; ++var12) {
                     if(field2363[var12] + field2322[var12] > var18 && field2322[var12] < var10 + var18 && field2364[var12] + field2362[var12] > var9 && field2362[var12] < var11 + var9) {
                        field2351[var12] = true;
                     }
                  }
               }
            } else {
               var2 = field2290 - 1;
               if((var16 == 1 || !class225.field3039 && var16 == 4) && var2 >= 0) {
                  var14 = field2293[var2];
                  if(var14 == 39 || var14 == 40 || var14 == 41 || var14 == 42 || var14 == 43 || var14 == 33 || var14 == 34 || var14 == 35 || var14 == 36 || var14 == 37 || var14 == 38 || var14 == 1005) {
                     label323: {
                        var5 = field2291[var2];
                        var17 = field2292[var2];
                        class187 var15 = class48.method1047(var17);
                        if(!class95.method1745(class203.method4026(var15))) {
                           var9 = class203.method4026(var15);
                           boolean var8 = (var9 >> 29 & 1) != 0;
                           if(!var8) {
                              break label323;
                           }
                        }

                        if(class283.field3562 != null && !field2265 && field2290 > 0 && !this.method3259()) {
                           var18 = field2262;
                           var9 = field2352;
                           class185.method3742(class322.field3939, var18, var9);
                           class322.field3939 = null;
                        }

                        field2265 = false;
                        field2266 = 0;
                        itemPressedDurationChanged(-1);
                        if(class283.field3562 != null) {
                           class230.method4617(class283.field3562);
                        }

                        class283.field3562 = class48.method1047(var17);
                        field2261 = var5;
                        field2262 = class163.field1980;
                        field2352 = class163.field1984;
                        if(var2 >= 0) {
                           class322.field3939 = new class285();
                           class322.field3939.field3567 = field2291[var2];
                           class322.field3939.field3574 = field2292[var2];
                           class322.field3939.field3569 = field2293[var2];
                           class322.field3939.field3570 = field2368[var2];
                           class322.field3939.field3572 = field2295[var2];
                        }

                        class230.method4617(class283.field3562);
                        return;
                     }
                  }
               }

               if((var16 == 1 || !class225.field3039 && var16 == 4) && this.method3259()) {
                  var16 = 2;
               }

               if((var16 == 1 || !class225.field3039 && var16 == 4) && field2290 > 0) {
                  class269.method5330(var2);
               }

               if(var16 == 2 && field2290 > 0) {
                  this.method3320(class163.field1980, class163.field1984);
               }
            }

         }
      }
   }

   @ObfuscatedName("ez")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "32"
   )
   final void method3252() {
      Object var1 = field2384.method2586();
      class1 var2 = field2384.field1764;

      try {
         if(field2187 == 0) {
            if(class138.field1779 == null && (field2324.method2487() || field2297 > 250)) {
               class138.field1779 = field2324.method2491();
               field2324.method2486();
               field2324 = null;
            }

            if(class138.field1779 != null) {
               if(var1 != null) {
                  ((class36)var1).vmethod2787();
                  var1 = null;
               }

               field2225 = null;
               field2421 = false;
               field2297 = 0;
               field2187 = 1;
            }
         }

         if(field2187 == 1) {
            if(field2225 == null) {
               field2225 = GameEngine.field3741.method2147(class256.field3356, class45.field509);
            }

            if(field2225.field1716 == 2) {
               throw new IOException();
            }

            if(field2225.field1716 == 1) {
               if(field2203) {
                  var1 = class193.method3918((Socket)field2225.field1718, 40000, 5000);
               } else {
                  var1 = new class154((Socket)field2225.field1718, GameEngine.field3741, 5000);
               }

               field2384.method2574((class36)var1);
               field2225 = null;
               field2187 = 2;
            }
         }

         if(field2187 == 2) {
            field2384.method2571();
            class12 var3 = class59.method1280();
            var3.field121.method2288(class275.field3502.field3498);
            field2384.method2573(var3);
            field2384.method2591();
            var2.field1693 = 0;
            field2187 = 3;
         }

         int var4;
         boolean var13;
         if(field2187 == 3) {
            if(class175.field2147 != null) {
               class175.field2147.method5720();
            }

            if(class49.field553 != null) {
               class49.field553.method5720();
            }

            var13 = true;
            if(field2203 && !((class36)var1).vmethod2817(1)) {
               var13 = false;
            }

            if(var13) {
               var4 = ((class36)var1).vmethod2793();
               if(class175.field2147 != null) {
                  class175.field2147.method5720();
               }

               if(class49.field553 != null) {
                  class49.field553.method5720();
               }

               if(var4 != 0) {
                  class181.method3696(var4);
                  return;
               }

               var2.field1693 = 0;
               field2187 = 4;
            }
         }

         int var29;
         if(field2187 == 4) {
            if(var2.field1693 < 8) {
               var29 = ((class36)var1).vmethod2789();
               if(var29 > 8 - var2.field1693) {
                  var29 = 8 - var2.field1693;
               }

               if(var29 > 0) {
                  ((class36)var1).vmethod2803(var2.field1694, var2.field1693, var29);
                  var2.field1693 += var29;
               }
            }

            if(var2.field1693 == 8) {
               var2.field1693 = 0;
               class283.field3563 = var2.method2349();
               field2187 = 5;
            }
         }

         int var6;
         if(field2187 == 5) {
            field2384.field1764.field1693 = 0;
            field2384.method2571();
            class1 var22 = new class1(500);
            int[] var14 = new int[]{class138.field1779.nextInt(), class138.field1779.nextInt(), class138.field1779.nextInt(), class138.field1779.nextInt()};
            var22.field1693 = 0;
            var22.method2288(1);
            var22.method2334(var14[0]);
            var22.method2334(var14[1]);
            var22.method2334(var14[2]);
            var22.method2334(var14[3]);
            var22.method2246(class283.field3563);
            if(field2161 == 40) {
               var22.method2334(class102.field1142[0]);
               var22.method2334(class102.field1142[1]);
               var22.method2334(class102.field1142[2]);
               var22.method2334(class102.field1142[3]);
            } else {
               var22.method2288(field2191.vmethod6234());
               switch(field2191.field15) {
               case 0:
                  var22.field1693 += 4;
                  break;
               case 1:
                  var22.method2334(((Integer)class175.field2134.field853.get(Integer.valueOf(class143.method2637(class39.field386)))).intValue());
                  break;
               case 2:
               case 3:
                  var22.method2412(class84.field909);
                  ++var22.field1693;
               }

               var22.method2288(class319.field3919.vmethod6234());
               var22.method2358(class39.field396);
            }

            var22.method2279(class178.field2449, class178.field2447);
            class102.field1142 = var14;
            class12 var5 = class59.method1280();
            var5.field121.field1693 = 0;
            if(field2161 == 40) {
               var5.field121.method2288(class275.field3497.field3498);
            } else {
               var5.field121.method2288(class275.field3496.field3498);
            }

            var5.field121.method2242(0);
            var6 = var5.field121.field1693;
            var5.field121.method2334(176);
            var5.field121.method2251(var22.field1694, 0, var22.field1693);
            int var7 = var5.field121.field1693;
            var5.field121.method2358(class39.field386);
            var5.field121.method2288((field2367?1:0) << 1 | (field2157?1:0));
            var5.field121.method2242(class167.field2010);
            var5.field121.method2242(class193.field2748);
            class1 var8 = var5.field121;
            int var11;
            if(field2254 != null) {
               var8.method2251(field2254, 0, field2254.length);
            } else {
               byte[] var10 = new byte[24];

               try {
                  class305.field3779.method387(0L);
                  class305.field3779.method373(var10);

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

               var8.method2251(var10, 0, var10.length);
            }

            var5.field121.method2358(class193.field2752);
            var5.field121.method2334(class23.field254);
            class125 var9 = new class125(class229.field3061.method90());
            class229.field3061.method88(var9);
            var5.field121.method2251(var9.field1694, 0, var9.field1694.length);
            var5.field121.method2288(field2388);
            var5.field121.method2334(0);
            var5.field121.method2334(class286.field3576.field2953);
            var5.field121.method2334(class193.field2749.field2953);
            var5.field121.method2334(class202.field2840.field2953);
            var5.field121.method2334(class233.field3084.field2953);
            var5.field121.method2334(class203.field2849.field2953);
            var5.field121.method2334(class152.field1869.field2953);
            var5.field121.method2334(field2428.field2953);
            var5.field121.method2334(class149.field1851.field2953);
            var5.field121.method2334(class138.field1782.field2953);
            var5.field121.method2334(class94.field1014.field2953);
            var5.field121.method2334(class219.field2982.field2953);
            var5.field121.method2334(class226.field3043.field2953);
            var5.field121.method2334(class88.field954.field2953);
            var5.field121.method2334(class20.field231.field2953);
            var5.field121.method2334(class47.field535.field2953);
            var5.field121.method2334(class119.field1640.field2953);
            var5.field121.method2334(class174.field2126.field2953);
            var5.field121.method2334(class99.field1132.field2953);
            var5.field121.method2277(var14, var7, var5.field121.field1693);
            var5.field121.method2253(var5.field121.field1693 - var6);
            field2384.method2573(var5);
            field2384.method2591();
            field2384.field1770 = new class216(var14);
            int[] var28 = new int[4];

            for(var11 = 0; var11 < 4; ++var11) {
               var28[var11] = var14[var11] + 50;
            }

            var2.method2(var28);
            field2187 = 6;
         }

         if(field2187 == 6 && ((class36)var1).vmethod2789() > 0) {
            var29 = ((class36)var1).vmethod2793();
            if(var29 == 21 && field2161 == 20) {
               field2187 = 9;
            } else if(var29 == 2) {
               field2187 = 11;
            } else if(var29 == 15 && field2161 == 40) {
               field2384.field1768 = -1;
               field2187 = 16;
            } else if(var29 == 64) {
               field2187 = 7;
            } else if(var29 == 23 && field2189 < 1) {
               ++field2189;
               field2187 = 0;
            } else {
               if(var29 != 29) {
                  class181.method3696(var29);
                  return;
               }

               field2187 = 14;
            }
         }

         if(field2187 == 7 && ((class36)var1).vmethod2789() > 0) {
            class124.field1692 = ((class36)var1).vmethod2793();
            field2187 = 8;
         }

         if(field2187 == 8 && ((class36)var1).vmethod2789() >= class124.field1692) {
            ((class36)var1).vmethod2803(var2.field1694, 0, class124.field1692);
            var2.field1693 = 0;
            field2187 = 6;
         }

         if(field2187 == 9 && ((class36)var1).vmethod2789() > 0) {
            field2392 = (((class36)var1).vmethod2793() + 3) * 60;
            field2187 = 10;
         }

         if(field2187 == 10) {
            field2297 = 0;
            class163.method3007("You have only just left another world.", "Your profile will be transferred in:", field2392 / 60 + " seconds.");
            if(--field2392 <= 0) {
               field2187 = 0;
            }

         } else {
            if(field2187 == 11 && ((class36)var1).vmethod2789() >= 1) {
               class164.field1988 = ((class36)var1).vmethod2793();
               field2187 = 12;
            }

            int var16;
            if(field2187 == 12 && ((class36)var1).vmethod2789() >= class164.field1988) {
               var13 = ((class36)var1).vmethod2793() == 1;
               ((class36)var1).vmethod2803(var2.field1694, 0, 4);
               var2.field1693 = 0;
               boolean var24 = false;
               if(var13) {
                  var4 = var2.method12() << 24;
                  var4 |= var2.method12() << 16;
                  var4 |= var2.method12() << 8;
                  var4 |= var2.method12();
                  var16 = class143.method2637(class39.field386);
                  if(class175.field2134.field853.size() >= 10 && !class175.field2134.field853.containsKey(Integer.valueOf(var16))) {
                     Iterator var17 = class175.field2134.field853.entrySet().iterator();
                     var17.next();
                     var17.remove();
                  }

                  class175.field2134.field853.put(Integer.valueOf(var16), Integer.valueOf(var4));
               }

               if(field2192) {
                  class175.field2134.field858 = class39.field386;
               } else {
                  class175.field2134.field858 = null;
               }

               class236.method4709();
               field2263 = ((class36)var1).vmethod2793();
               field2250 = ((class36)var1).vmethod2793() == 1;
               field2186 = ((class36)var1).vmethod2793();
               field2186 <<= 8;
               field2186 += ((class36)var1).vmethod2793();
               field2271 = ((class36)var1).vmethod2793();
               ((class36)var1).vmethod2803(var2.field1694, 0, 1);
               var2.field1693 = 0;
               ServerProt[] var26 = class213.method4365();
               var6 = var2.method17();
               if(var6 < 0 || var6 >= var26.length) {
                  throw new IOException(var6 + " " + var2.field1693);
               }

               field2384.field1759 = var26[var6];
               field2384.field1768 = field2384.field1759.field2050;
               ((class36)var1).vmethod2803(var2.field1694, 0, 2);
               var2.field1693 = 0;
               field2384.field1768 = var2.method2258();

               try {
                  client var18 = class302.field3755;
                  JSObject.getWindow(var18).call("zap", (Object[])null);
               } catch (Throwable var19) {
                  ;
               }

               field2187 = 13;
            }

            if(field2187 != 13) {
               if(field2187 == 14 && ((class36)var1).vmethod2789() >= 2) {
                  var2.field1693 = 0;
                  ((class36)var1).vmethod2803(var2.field1694, 0, 2);
                  var2.field1693 = 0;
                  class44.field487 = var2.method2258();
                  field2187 = 15;
               }

               if(field2187 == 15 && ((class36)var1).vmethod2789() >= class44.field487) {
                  var2.field1693 = 0;
                  ((class36)var1).vmethod2803(var2.field1694, 0, class44.field487);
                  var2.field1693 = 0;
                  String var25 = var2.method2265();
                  String var31 = var2.method2265();
                  String var27 = var2.method2265();
                  class163.method3007(var25, var31, var27);
                  class142.method2635(10);
               }

               if(field2187 == 16) {
                  if(field2384.field1768 == -1) {
                     if(((class36)var1).vmethod2789() < 2) {
                        return;
                     }

                     ((class36)var1).vmethod2803(var2.field1694, 0, 2);
                     var2.field1693 = 0;
                     field2384.field1768 = var2.method2258();
                  }

                  if(((class36)var1).vmethod2789() >= field2384.field1768) {
                     ((class36)var1).vmethod2803(var2.field1694, 0, field2384.field1768);
                     var2.field1693 = 0;
                     var29 = field2384.field1768;
                     field2398.method1219();
                     class194.method3933();
                     class208.method4128(var2);
                     if(var29 != var2.field1693) {
                        throw new RuntimeException();
                     }
                  }
               } else {
                  ++field2297;
                  if(field2297 > 2000) {
                     if(field2189 < 1) {
                        if(class121.field1652 == class45.field509) {
                           class45.field509 = class179.field2455;
                        } else {
                           class45.field509 = class121.field1652;
                        }

                        ++field2189;
                        field2187 = 0;
                     } else {
                        class181.method3696(-3);
                     }
                  }
               }
            } else {
               if(((class36)var1).vmethod2789() >= field2384.field1768) {
                  var2.field1693 = 0;
                  ((class36)var1).vmethod2803(var2.field1694, 0, field2384.field1768);
                  field2398.method1206();
                  field2166 = 1L;
                  class208.field2882.field3509 = 0;
                  class318.field3915 = true;
                  field2178 = true;
                  field2377 = -1L;
                  class140.field1793 = new class41();
                  field2384.method2571();
                  field2384.field1764.field1693 = 0;
                  field2384.field1759 = null;
                  field2384.field1769 = null;
                  field2384.field1758 = null;
                  field2384.field1771 = null;
                  field2384.field1768 = 0;
                  field2384.field1767 = 0;
                  field2172 = 0;
                  field2298 = 0;
                  field2173 = 0;
                  field2290 = 0;
                  onMenuOptionsChanged(-1);
                  field2360 = false;
                  class316.method6193(0);
                  class38.field367.clear();
                  class38.field366.method4673();
                  class38.field368.method2166();
                  class38.field369 = 0;
                  field2306 = 0;
                  field2308 = false;
                  field2391 = 0;
                  field2223 = 0;
                  field2228 = 0;
                  class177.field2445 = null;
                  field2411 = 0;
                  field2194 = -1;
                  field2216 = 0;
                  field2414 = 0;
                  field2181 = class302.field3752;
                  field2174 = class302.field3752;
                  field2196 = 0;
                  class164.method3013();

                  for(var29 = 0; var29 < 2048; ++var29) {
                     field2269[var29] = null;
                     cachedPlayersChanged(var29);
                  }

                  for(var29 = 0; var29 < 32768; ++var29) {
                     field2195[var29] = null;
                     cachedNPCsChanged(var29);
                  }

                  field2343 = -1;
                  field2283.method1520();
                  field2284.method1520();

                  for(var29 = 0; var29 < 4; ++var29) {
                     for(var4 = 0; var4 < 104; ++var4) {
                        for(var16 = 0; var16 < 104; ++var16) {
                           field2182[var29][var4][var16] = null;
                        }
                     }
                  }

                  field2282 = new class70();
                  class202.field2845.method2896();

                  for(var29 = 0; var29 < class278.field3519; ++var29) {
                     class278 var30 = class113.method2120(var29);
                     if(var30 != null) {
                        class81.field896[var29] = 0;
                        class81.field898[var29] = 0;
                        settingsChanged(var29);
                     }
                  }

                  class267.field3459.method1710();
                  field2323 = -1;
                  if(field2313 != -1) {
                     class127.method2484(field2313);
                  }

                  for(class322 var23 = (class322)field2412.method1783(); var23 != null; var23 = (class322)field2412.method1779()) {
                     class30.method523(var23, true);
                  }

                  field2313 = -1;
                  field2412 = new class98(8);
                  field2319 = null;
                  field2290 = 0;
                  onMenuOptionsChanged(-1);
                  field2360 = false;
                  field2275.method6303((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

                  for(var29 = 0; var29 < 8; ++var29) {
                     field2277[var29] = null;
                     playerOptionsChanged(var29);
                     field2278[var29] = false;
                  }

                  class231.field3079 = new class98(32);
                  field2215 = true;

                  for(var29 = 0; var29 < 100; ++var29) {
                     field2351[var29] = true;
                  }

                  class198.method3945();
                  class250.field3328 = null;
                  clanMemberManagerChanged(-1);

                  for(var29 = 0; var29 < 8; ++var29) {
                     field2420[var29] = new class307();
                     onGrandExchangeOffersChanged(var29);
                  }

                  class141.field1801 = null;
                  class208.method4128(var2);
                  class322.field3936 = -1;
                  class4.method76(false, var2);
                  field2384.field1759 = null;
               }

            }
         }
      } catch (IOException var21) {
         if(field2189 < 1) {
            if(class121.field1652 == class45.field509) {
               class45.field509 = class179.field2455;
            } else {
               class45.field509 = class121.field1652;
            }

            ++field2189;
            field2187 = 0;
         } else {
            class181.method3696(-2);
         }
      }
   }

   @ObfuscatedName("it")
   @ObfuscatedSignature(
      signature = "(Lhw;B)V",
      garbageValue = "-36"
   )
   void method3614(class187 var1) {
      class187 var2 = var1.field2577 == -1?null:class48.method1047(var1.field2577);
      int var3;
      int var4;
      if(var2 == null) {
         var3 = class167.field2010;
         var4 = class193.field2748;
      } else {
         var3 = var2.field2573;
         var4 = var2.field2574;
      }

      class286.method5486(var1, var3, var4, false);
      class155.method2830(var1, var3, var4);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1416113915"
   )
   protected final void vmethod5858() {
      field2366 = class321.method6252() + 500L;
      this.method3255();
      if(field2313 != -1) {
         this.method3261(true);
      }

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
      int[] var8 = this.getQueuedSoundEffectDelays();
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

   public int getPlayerIndexesCount() {
      return class152.field1874;
   }

   public int getSelectedSceneTileX() {
      return class111.field1234;
   }

   public void setRSModIcons(RSIndexedSprite[] var1) {
      class190.field2728 = (class303[])var1;
   }

   public int getMouseX() {
      return class163.field1971;
   }

   public int getWidgetRoot() {
      return field2313;
   }

   public int getCycleCntr() {
      return field2338;
   }

   public int getDestinationX() {
      return field2216;
   }

   public int getFlags() {
      return field2154;
   }

   public void setLowMemory(boolean var1) {
      field2157 = var1;
   }

   public int getRSGameState() {
      return field2161;
   }

   public int getNpcIndexesCount() {
      return field2196;
   }

   public int[] getBoostedSkillLevels() {
      return field2361;
   }

   public int[] getRealSkillLevels() {
      return field2286;
   }

   public int[] getSkillExperiences() {
      return field2218;
   }

   public boolean isStretchedEnabled() {
      return stretchedEnabled;
   }

   public int[] getIntVarcs() {
      return this.getVarcs().getIntVarcs();
   }

   public String[] getStrVarcs() {
      return this.getVarcs().getStrVarcs();
   }

   public RSSpritePixels createSpritePixels(int[] var1, int var2, int var3) {
      return new SpritePixels(var1, var2, var3);
   }

   public RSHashTable getItemContainers() {
      return class231.field3079;
   }

   public int getMenuOptionCount() {
      return field2290;
   }

   public RSJagexLoginType getLoginType() {
      return class140.field1794;
   }

   public HintArrowType getHintArrowType() {
      int var1 = class302.field3755.getHintArrowTargetType();
      return var1 == HintArrowType.NPC.getValue()?HintArrowType.NPC:(var1 == HintArrowType.PLAYER.getValue()?HintArrowType.PLAYER:(var1 == HintArrowType.WORLD_POSITION.getValue()?HintArrowType.WORLD_POSITION:HintArrowType.NONE));
   }

   public void menuOpened(int var1, int var2) {
      MenuOpened var3 = new MenuOpened();
      var3.setMenuEntries(this.getMenuEntries());
      this.callbacks.post(var3);
   }

   public int getVar(Varbits var1) {
      int var2 = var1.getId();
      return this.getVarbitValue(this.getVarps(), var2);
   }

   public String[] getMenuOptions() {
      return field2295;
   }

   public RSClanMemberManager getClanMemberManager() {
      return class250.field3328;
   }

   public RSWidget[][] getWidgets() {
      return class187.field2547;
   }

   public boolean isResized() {
      return field2367;
   }

   public RSFriendManager getFriendManager() {
      return class202.field2845;
   }

   public int[] getVarps() {
      return class81.field898;
   }

   public RSVarcs getVarcs() {
      return class267.field3459;
   }

   public void addChatMessage(int var1, String var2, String var3, String var4) {
      class96.method1753(var1, var2, var3, var4);
   }

   public void setMouseCanvasHoverPositionX(int var1) {
      class111.field1253 = var1;
   }

   public RSDeque getProjectilesDeque() {
      return field2283;
   }

   public RSDeque getGraphicsObjectDeque() {
      return field2284;
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

   public int[] getPlayerIndices() {
      return class152.field1875;
   }

   public void setSceneLowMemory(boolean var1) {
      class111.field1255 = var1;
   }

   public int getSelectedSceneTileY() {
      return class111.field1256;
   }

   public int getMouseY() {
      return class163.field1972;
   }

   public int getDestinationY() {
      return field2414;
   }

   public void setChatCycle(int var1) {
      field2315 = var1;
   }

   public int[] getNpcIndices() {
      return field2197;
   }

   public RSName createName(String var1, RSJagexLoginType var2) {
      return new class158(var1, (class258)var2);
   }

   public RSSpritePixels getMinimapSprite() {
      return class32.field304;
   }

   public int get3dZoom() {
      return class211.field2906;
   }

   public int[] getQueuedSoundEffectIDs() {
      return field2294;
   }

   public void _protect$menuAction/* $FF was: 1protect$menuAction*/(int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
      class28.method483(var1, var2, var3, var4, var5, var6, var7, var8, (byte)102);
   }

   public String[] getMenuTargets() {
      return field2296;
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
         class302.field3755.getVarbit(var2);
         RSNodeCache var5 = class302.field3755.getVarbitCache();
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
      if(!$assertionsDisabled && !class302.field3755.isClientThread()) {
         throw new AssertionError();
      } else {
         RSVarbit var3 = (RSVarbit)this.varbitCache.getIfPresent(Integer.valueOf(var2));
         if(var3 == null) {
            class302.field3755.getVarbit(var2);
            RSNodeCache var4 = class302.field3755.getVarbitCache();
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

   public void setMouseCanvasHoverPositionY(int var1) {
      class111.field1254 = var1;
   }

   public RSNPC[] getCachedNPCs() {
      return field2195;
   }

   public RSPlayer[] getCachedPlayers() {
      return field2269;
   }

   public void setAudioHighMemory(boolean var1) {
      class268.field3462 = var1;
   }

   public int[] getUnknownSoundValues1() {
      return field2345;
   }

   public RSScene getScene() {
      return class269.field3464;
   }

   public int[] getMenuIdentifiers() {
      return field2368;
   }

   public void set3dZoom(int var1) {
      class211.field2906 = var1;
   }

   public void setObjectCompositionLowDetail(boolean var1) {
      class15.field175 = var1;
   }

   public RSSpritePixels createItemSprite(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      return class64.method1356(var1, var2, var3, var4, var5, var6);
   }

   public int[] getQueuedSoundEffectDelays() {
      return field2394;
   }

   public int[] getMenuTypes() {
      return field2293;
   }

   public Dimension getRealDimensions() {
      if(!this.isStretchedEnabled()) {
         return this.getCanvas().getSize();
      } else {
         if(cachedRealDimensions == null) {
            if(this.isResized()) {
               Container var1 = this.getCanvas().getParent();
               int var2 = var1.getWidth();
               int var3 = var1.getHeight();
               int var4 = (int)((double)var2 / scalingFactor);
               int var5 = (int)((double)var3 / scalingFactor);
               if(var4 < 765 || var5 < 503) {
                  double var6 = (double)var2 / 765.0D;
                  double var8 = (double)var3 / 503.0D;
                  double var10 = Math.min(var6, var8);
                  var4 = (int)((double)var2 / var10);
                  var5 = (int)((double)var3 / var10);
               }

               cachedRealDimensions = new Dimension(var4, var5);
            } else {
               cachedRealDimensions = Constants.GAME_FIXED_SIZE;
            }
         }

         return cachedRealDimensions;
      }
   }

   public byte[][][] getTileSettings() {
      return class185.field2512;
   }

   public RSScriptEvent createScriptEvent() {
      return new class194();
   }

   public RSSoundEffect[] getAudioEffects() {
      return field2188;
   }

   public int[] getMenuActionParams0() {
      return field2291;
   }

   public int getPlane() {
      return class260.field3393;
   }

   public RSBufferProvider getBufferProvider() {
      return class124.field1689;
   }

   public void setMinimapSprite(net.runelite.api.SpritePixels var1) {
      class32.field304 = (SpritePixels)var1;
   }

   public boolean boundingboxCheck(Model var1, int var2, int var3, int var4) {
      int var5 = class302.field3755.getCameraPitch();
      int var6 = class302.field3755.getCameraYaw();
      int var7 = Perspective.SINE[var5];
      int var8 = Perspective.COSINE[var5];
      int var9 = Perspective.SINE[var6];
      int var10 = Perspective.COSINE[var6];
      int var11 = class302.field3755.getCenterX();
      int var12 = class302.field3755.getCenterY();
      int var13 = class302.field3755.getViewportMouseX();
      int var14 = class302.field3755.getViewportMouseY();
      int var15 = class302.field3755.get3dZoom();
      int var16 = (var13 - var11) * 50 / var15;
      int var17 = (var14 - var12) * 50 / var15;
      int var18 = (var13 - var11) * 3500 / var15;
      int var19 = (var14 - var12) * 3500 / var15;
      int var20 = rl$rot1(var17, 50, var8, var7);
      int var21 = rl$rot2(var17, 50, var8, var7);
      var17 = var20;
      var20 = rl$rot1(var19, 3500, var8, var7);
      int var22 = rl$rot2(var19, 3500, var8, var7);
      var19 = var20;
      var20 = rl$rot3(var16, var21, var10, var9);
      var21 = rl$rot4(var16, var21, var10, var9);
      var16 = var20;
      var20 = rl$rot3(var18, var22, var10, var9);
      var22 = rl$rot4(var18, var22, var10, var9);
      int var23 = (var20 - var16) / 2;
      int var24 = (var19 - var17) / 2;
      int var25 = (var22 - var21) / 2;
      int var26 = Math.abs(var23);
      int var27 = Math.abs(var24);
      int var28 = Math.abs(var25);
      int var29 = var2 + var1.getCenterX();
      int var30 = var3 + var1.getCenterY();
      int var31 = var4 + var1.getCenterZ();
      int var32 = var1.getExtremeX();
      int var33 = var1.getExtremeY();
      int var34 = var1.getExtremeZ();
      int var35 = (var16 + var20) / 2;
      int var36 = (var17 + var19) / 2;
      int var37 = (var22 + var21) / 2;
      int var38 = var35 - var29;
      int var39 = var36 - var30;
      int var40 = var37 - var31;
      boolean var41;
      if(Math.abs(var38) > var32 + var26) {
         var41 = false;
      } else if(Math.abs(var39) > var33 + var27) {
         var41 = false;
      } else if(Math.abs(var40) > var34 + var28) {
         var41 = false;
      } else if(Math.abs(var40 * var24 - var39 * var25) > var33 * var28 + var34 * var27) {
         var41 = false;
      } else if(Math.abs(var38 * var25 - var40 * var23) > var34 * var26 + var32 * var28) {
         var41 = false;
      } else if(Math.abs(var39 * var23 - var38 * var24) > var33 * var26 + var32 * var27) {
         var41 = false;
      } else {
         var41 = true;
      }

      return var41;
   }

   public int[] getSoundLocations() {
      return field2429;
   }

   public int[] getMenuActionParams1() {
      return field2292;
   }

   public void runScript(RSScriptEvent var1, int var2) {
      class259.method5166((class194)var1, var2, (byte)68);
   }

   public int getQueuedSoundEffectCount() {
      return field2391;
   }

   public void setMenuOptionCount(int var1) {
      field2290 = var1;
   }

   public void addHashAtMouse(long var1) {
      long[] var3 = class302.field3755.getEntitiesAtMouse();
      int var4 = class302.field3755.getEntitiesAtMouseCount();
      if(var4 < 1000) {
         var3[var4] = var1;
         class302.field3755.setEntitiesAtMouseCount(var4 + 1);
      }

   }

   public void setQueuedSoundEffectCount(int var1) {
      field2391 = var1;
   }

   public void drawObject(int var1, int var2, int var3, int var4, int var5) {
      class301.method5972(var1, var2, var3, var4, var5);
   }

   public final void init() {
      try {
         if(this.method5839()) {
            class182[] var1 = new class182[]{class182.field2483, class182.field2487, class182.field2493, class182.field2481, class182.field2482, class182.field2490, class182.field2486, class182.field2491, class182.field2495, class182.field2484, class182.field2489, class182.field2496, class182.field2494, class182.field2488, class182.field2485, class182.field2492, class182.field2498, class182.field2497};
            class182[] var2 = var1;

            for(int var3 = 0; var3 < var2.length; ++var3) {
               class182 var4 = var2[var3];
               String var5 = this.getParameter(var4.field2499);
               if(var5 != null) {
                  switch(Integer.parseInt(var4.field2499)) {
                  case 1:
                     field2203 = Integer.parseInt(var5) != 0;
                  case 2:
                  case 11:
                  case 13:
                  case 16:
                  default:
                     break;
                  case 3:
                     if(var5.equalsIgnoreCase("true")) {
                        field2156 = true;
                     } else {
                        field2156 = false;
                     }
                     break;
                  case 4:
                     if(field2388 == -1) {
                        field2388 = Integer.parseInt(var5);
                     }
                     break;
                  case 5:
                     field2154 = Integer.parseInt(var5);
                     break;
                  case 6:
                     field2158 = Integer.parseInt(var5);
                     break;
                  case 7:
                     class209.field2888 = class82.method1603(Integer.parseInt(var5));
                     break;
                  case 8:
                     if(var5.equalsIgnoreCase("true")) {
                        ;
                     }
                     break;
                  case 9:
                     class193.field2752 = var5;
                     break;
                  case 10:
                     class21[] var6 = new class21[]{class21.field236, class21.field234, class21.field235, class21.field232, class21.field233, class21.field237};
                     class210.field2889 = (class21)class38.method678(var6, Integer.parseInt(var5));
                     if(class210.field2889 == class21.field237) {
                        class140.field1794 = class258.field3374;
                     } else {
                        class140.field1794 = class258.field3373;
                     }
                     break;
                  case 12:
                     field2206 = Integer.parseInt(var5);
                     break;
                  case 14:
                     class23.field254 = Integer.parseInt(var5);
                     break;
                  case 15:
                     field2155 = Integer.parseInt(var5);
                     break;
                  case 17:
                     class82.field905 = var5;
                  }
               }
            }

            class111.field1255 = false;
            field2157 = false;
            class256.field3356 = this.getCodeBase().getHost();
            String var11 = class209.field2888.field1017;
            byte var7 = 0;

            try {
               class131.method2521("oldschool", var11, var7, 18);
            } catch (Exception var9) {
               class202.method4018((String)null, var9, -1983450225);
            }

            class302.field3755 = this;
            class57.field705 = field2388;
            this.method5844(765, 503, 176);
         }
      } catch (RuntimeException var10) {
         throw class194.method3922(var10, "client.init(" + ')');
      }
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

   public void checkClickbox(Model var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10) {
      RSModel var12 = (RSModel)var1;
      boolean var13 = var10 != 0L && (int)(var10 >>> 16 & 1L) != 1;
      boolean var14 = class302.field3755.getViewportContainsMouse();
      if(var13 && var14 && class302.field3755.getOculusOrbState() == 0) {
         boolean var15 = this.boundingboxCheck(var12, var7, var8, var9);
         if(var15) {
            if(Math.sqrt((double)(var7 * var7 + var9 * var9)) <= 4480.0D) {
               if(var12.isClickable()) {
                  this.addHashAtMouse(var10);
               } else {
                  int var16 = var12.getVerticesCount();
                  int var17 = var12.getTrianglesCount();
                  int[] var18 = var12.getVerticesX();
                  int[] var19 = var12.getVerticesY();
                  int[] var20 = var12.getVerticesZ();
                  int[] var21 = var12.getTrianglesX();
                  int[] var22 = var12.getTrianglesY();
                  int[] var23 = var12.getTrianglesZ();
                  int[] var24 = var12.getFaceColors3();
                  int var25 = class302.field3755.get3dZoom();
                  int var26 = class302.field3755.getCenterX();
                  int var27 = class302.field3755.getCenterY();
                  int var28 = 0;
                  int var29 = 0;
                  if(var2 != 0) {
                     var28 = Perspective.SINE[var2];
                     var29 = Perspective.COSINE[var2];
                  }

                  int var30;
                  int var31;
                  int var32;
                  int var33;
                  int var34;
                  for(var30 = 0; var30 < var16; ++var30) {
                     var31 = var18[var30];
                     var32 = var19[var30];
                     var33 = var20[var30];
                     if(var2 != 0) {
                        var34 = var33 * var28 + var31 * var29 >> 16;
                        var33 = var33 * var29 - var31 * var28 >> 16;
                        var31 = var34;
                     }

                     var31 += var7;
                     var32 += var8;
                     var33 += var9;
                     var34 = var31 * var6 + var5 * var33 >> 16;
                     var33 = var33 * var6 - var5 * var31 >> 16;
                     var31 = var34;
                     var34 = var32 * var4 - var3 * var33 >> 16;
                     var33 = var33 * var4 + var3 * var32 >> 16;
                     if(var33 >= 50) {
                        rl$modelViewportYs[var30] = var31 * var25 / var33 + var26;
                        rl$modelViewportXs[var30] = var34 * var25 / var33 + var27;
                     } else {
                        rl$modelViewportYs[var30] = -5000;
                     }
                  }

                  var30 = class302.field3755.getViewportMouseX();
                  var31 = class302.field3755.getViewportMouseY();

                  for(var32 = 0; var32 < var17; ++var32) {
                     if(var24[var32] != -2) {
                        var33 = var21[var32];
                        var34 = var22[var32];
                        int var35 = var23[var32];
                        int var36 = rl$modelViewportYs[var33];
                        int var37 = rl$modelViewportYs[var34];
                        int var38 = rl$modelViewportYs[var35];
                        int var39 = rl$modelViewportXs[var33];
                        int var40 = rl$modelViewportXs[var34];
                        int var41 = rl$modelViewportXs[var35];
                        if(var36 != -5000 && var37 != -5000 && var38 != -5000) {
                           int var42 = var12.isClickable()?20:5;
                           int var43 = var42 + var31;
                           boolean var44;
                           if(var43 < var39 && var43 < var40 && var43 < var41) {
                              var44 = false;
                           } else {
                              var43 = var31 - var42;
                              if(var43 > var39 && var43 > var40 && var43 > var41) {
                                 var44 = false;
                              } else {
                                 var43 = var42 + var30;
                                 if(var43 < var36 && var43 < var37 && var43 < var38) {
                                    var44 = false;
                                 } else {
                                    var43 = var30 - var42;
                                    if(var43 > var36 && var43 > var37 && var43 > var38) {
                                       var44 = false;
                                    } else {
                                       var44 = true;
                                    }
                                 }
                              }
                           }

                           if(var44) {
                              this.addHashAtMouse(var10);
                              break;
                           }
                        }
                     }
                  }

               }
            }
         }
      }
   }

   public void openWorldHopper() {
      this._protect$menuAction(-1, WidgetInfo.WORLD_SWITCHER_BUTTON.getId(), MenuAction.WIDGET_DEFAULT.getId(), 1, "World Switcher", "", 658, 384);
   }

   public void hopToWorld(World var1) {
      int var2 = var1.getId();
      this._protect$menuAction(var2, WidgetInfo.WORLD_SWITCHER_LIST.getId(), MenuAction.WIDGET_DEFAULT.getId(), 1, "Switch", "<col=ff9040>" + (var2 - 300) + "</col>", 683, 244);
   }

   public Callbacks getCallbacks() {
      return this.callbacks;
   }

   public DrawCallbacks getDrawCallbacks() {
      return this.drawCallbacks;
   }

   public void setDrawCallbacks(DrawCallbacks var1) {
      this.drawCallbacks = var1;
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
      int[] var2 = class302.field3755.getRealSkillLevels();
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

   public net.runelite.api.SpritePixels createItemSprite(int var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
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
      return class302.field3755.getHintArrowTargetType() != HintArrowType.NONE.getValue();
   }

   public void clearHintArrow() {
      class302.field3755.setHintArrowTargetType(HintArrowType.NONE.getValue());
   }

   public void setHintArrow(NPC var1) {
      class302.field3755.setHintArrowTargetType(HintArrowType.NPC.getValue());
      class302.field3755.setHintArrowNpcTargetIdx(var1.getIndex());
   }

   public void setHintArrow(Player var1) {
      class302.field3755.setHintArrowTargetType(HintArrowType.PLAYER.getValue());
      class302.field3755.setHintArrowPlayerTargetIdx(((RSPlayer)var1).getPlayerId());
   }

   public void setHintArrow(WorldPoint var1) {
      class302.field3755.setHintArrowTargetType(HintArrowType.WORLD_POSITION.getValue());
      class302.field3755.setHintArrowX(var1.getX());
      class302.field3755.setHintArrowY(var1.getY());
      class302.field3755.setHintArrowOffsetX(64);
      class302.field3755.setHintArrowOffsetY(64);
   }

   public WorldPoint getHintArrowPoint() {
      if(this.getHintArrowType() == HintArrowType.WORLD_POSITION) {
         int var1 = class302.field3755.getHintArrowX();
         int var2 = class302.field3755.getHintArrowY();
         return new WorldPoint(var1, var2, class302.field3755.getPlane());
      } else {
         return null;
      }
   }

   public Player getHintArrowPlayer() {
      if(this.getHintArrowType() == HintArrowType.PLAYER) {
         int var1 = class302.field3755.getHintArrowPlayerTargetIdx();
         RSPlayer[] var2 = class302.field3755.getCachedPlayers();
         return var1 >= 0 && var1 < var2.length?var2[var1]:null;
      } else {
         return null;
      }
   }

   public NPC getHintArrowNpc() {
      if(this.getHintArrowType() == HintArrowType.NPC) {
         int var1 = class302.field3755.getHintArrowNpcTargetIdx();
         RSNPC[] var2 = class302.field3755.getCachedNPCs();
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

   public boolean isGpu() {
      return this.gpu;
   }

   public void setGpu(boolean var1) {
      this.gpu = var1;
   }

   public void queueChangedSkill(Skill var1) {
      int[] var2 = class302.field3755.getChangedSkills();
      int var3 = class302.field3755.getChangedSkillsCount();
      ++var3;
      var2[var3 - 1 & 31] = var1.ordinal();
      class302.field3755.setChangedSkillsCount(var3);
   }

   public void playSoundEffect(int var1) {
      this.playSoundEffect(var1, 0, 0, 0);
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
   }

   public void setStretchedKeepAspectRatio(boolean var1) {
      stretchedKeepAspectRatio = var1;
   }

   public void setScalingFactor(int var1) {
      scalingFactor = 1.0D + (double)var1 / 100.0D;
   }

   public Dimension getStretchedDimensions() {
      if(cachedStretchedDimensions == null) {
         Container var1 = this.getCanvas().getParent();
         int var2 = var1.getWidth();
         int var3 = var1.getHeight();
         Dimension var4 = this.getRealDimensions();
         if(stretchedKeepAspectRatio) {
            double var5 = var4.getWidth() / var4.getHeight();
            int var7 = (int)((double)var3 * var5);
            if(var7 > var2) {
               var3 = (int)((double)var2 / var5);
            } else {
               var2 = var7;
            }
         }

         if(stretchedIntegerScaling) {
            if(var2 > var4.width) {
               var2 -= var2 % var4.width;
            }

            if(var3 > var4.height) {
               var3 -= var3 % var4.height;
            }
         }

         cachedStretchedDimensions = new Dimension(var2, var3);
      }

      return cachedStretchedDimensions;
   }

   public void invalidateStretching(boolean var1) {
      cachedStretchedDimensions = null;
      cachedRealDimensions = null;
      if(var1 && this.isResized()) {
         this.setResizeCanvasNextFrame(true);
      }

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

   public void setCameraPitchRelaxerEnabled(boolean var1) {
      if(pitchRelaxEnabled != var1) {
         pitchRelaxEnabled = var1;
         if(!var1) {
            int var2 = class302.field3755.getCameraPitchTarget();
            if(var2 > 383) {
               class302.field3755.setCameraPitchTarget(383);
            }
         }

      }
   }

   public RSItem createItem() {
      return new class191();
   }

   public RSIndexedSprite createIndexedSprite() {
      return new class303();
   }

   public RSWorld createWorld() {
      return new class88();
   }

   public RSWidget createWidget() {
      return new class187();
   }

   public RSFrames getFrames(int var1) {
      return class178.method3683(var1);
   }

   public RSIndexedSprite[] getMapScene() {
      return class64.field748;
   }

   public void setAnimOffsetX(int var1) {
      class52.field635 = var1;
   }

   public void setAnimOffsetY(int var1) {
      class52.field636 = var1;
   }

   public void setAnimOffsetZ(int var1) {
      class52.field629 = var1;
   }

   public int getCanvasHeight() {
      return class193.field2748;
   }

   public int getBaseY() {
      return class35.field360;
   }

   public void setCompass(net.runelite.api.SpritePixels var1) {
      class307.field3798 = (SpritePixels)var1;
   }

   public int getCameraX() {
      return class85.field912;
   }

   public int[] getIntStack() {
      return class249.field3312;
   }

   public String[] getStringStack() {
      return class249.field3313;
   }

   public RSRenderOverview getRenderOverview() {
      return class199.field2812;
   }

   public int getKeyboardIdleTicks() {
      return class96.field1051;
   }

   public RSNodeCache getCachedModels2() {
      return class15.field153;
   }

   public RSArea[] getMapAreas() {
      return class123.field1680;
   }

   public void setUsername(String var1) {
      class39.field386 = var1;
   }

   public String getUsername() {
      return class39.field386;
   }

   public void setPassword(String var1) {
      class39.field396 = var1;
   }

   public int getCurrentLoginField() {
      return class39.field400;
   }

   public void setIntStackSize(int var1) {
      class308.field3811 = var1;
   }

   public int getIntStackSize() {
      return class308.field3811;
   }

   public RSItemComposition getItemDefinition(int var1) {
      return class164.method3014(var1);
   }

   public int getRevision() {
      return class57.field707;
   }

   public int getCanvasWidth() {
      return class167.field2010;
   }

   public int[][] getXteaKeys() {
      return class286.field3582;
   }

   public int getCameraY() {
      return class116.field1324;
   }

   public void setStringStackSize(int var1) {
      class103.field1146 = var1;
   }

   public int getStringStackSize() {
      return class103.field1146;
   }

   public RSSpritePixels[] getSprites(IndexDataBase var1, int var2, int var3) {
      return class103.method1851((class217)var1, var2, var3);
   }

   public Map getChatLineMap() {
      return class38.field367;
   }

   public int[][][] getTileHeights() {
      return class185.field2522;
   }

   public RSIndexDataBase getIndexSprites() {
      return class138.field1782;
   }

   public RSNodeCache getVarbitCache() {
      return class72.field827;
   }

   public void setTileUpdateCount(int var1) {
      class111.field1245 = var1;
   }

   public int getTileUpdateCount() {
      return class111.field1245;
   }

   public void setScenePlane(int var1) {
      class111.field1235 = var1;
   }

   public void setCycle(int var1) {
      class111.field1244 = var1;
   }

   public int getCycle() {
      return class111.field1244;
   }

   public void setMinTileX(int var1) {
      class111.field1251 = var1;
   }

   public void setMaxTileX(int var1) {
      class111.field1274 = var1;
   }

   public void setMinTileZ(int var1) {
      class111.field1239 = var1;
   }

   public void setMaxTileZ(int var1) {
      class111.field1240 = var1;
   }

   public void setScreenCenterX(int var1) {
      class111.field1236 = var1;
   }

   public void setScreenCenterZ(int var1) {
      class111.field1242 = var1;
   }

   public void setCameraX2(int var1) {
      class111.field1243 = var1;
   }

   public int getCameraX2() {
      return class111.field1243;
   }

   public void setCameraY2(int var1) {
      class111.field1282 = var1;
   }

   public int getCameraY2() {
      return class111.field1282;
   }

   public void setCameraZ2(int var1) {
      class111.field1267 = var1;
   }

   public int getCameraZ2() {
      return class111.field1267;
   }

   public void setPitchSin(int var1) {
      class111.field1246 = var1;
   }

   public void setPitchCos(int var1) {
      class111.field1247 = var1;
   }

   public void setYawSin(int var1) {
      class111.field1248 = var1;
   }

   public void setYawCos(int var1) {
      class111.field1249 = var1;
   }

   public void setCheckClick(boolean var1) {
      class111.field1277 = var1;
   }

   public boolean isCheckClick() {
      return class111.field1277;
   }

   public int getMouseX2() {
      return class111.field1253;
   }

   public int getMouseY2() {
      return class111.field1254;
   }

   public void setSelectedSceneTileX(int var1) {
      class111.field1234 = var1;
   }

   public void setSelectedSceneTileY(int var1) {
      class111.field1256 = var1;
   }

   public boolean[][][][] getVisibilityMaps() {
      return class111.field1271;
   }

   public void setRenderArea(boolean[][] var1) {
      class111.field1280 = var1;
   }

   public boolean containsBounds(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      return class111.method1970(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public RSWorld[] getWorldList() {
      return class88.field947;
   }

   public RSIndexDataBase getIndexScripts() {
      return class88.field954;
   }

   public int[] getGraphicsPixels() {
      return class173.field2121;
   }

   public int getGraphicsPixelsWidth() {
      return class173.field2119;
   }

   public int getGraphicsPixelsHeight() {
      return class173.field2120;
   }

   public int getStartY() {
      return class173.field2122;
   }

   public int getEndY() {
      return class173.field2123;
   }

   public int getStartX() {
      return class173.field2124;
   }

   public int getEndX() {
      return class173.field2125;
   }

   public RSPreferences getPreferences() {
      return class175.field2134;
   }

   public RSObjectComposition getObjectDefinition(int var1) {
      return class285.method5484(var1);
   }

   public void changeWorld(World var1) {
      class74.method1558((class88)var1);
   }

   public RSIndexedSprite[] getModIcons() {
      return class190.field2728;
   }

   public RSPlayer getLocalPlayer() {
      return class32.field303;
   }

   public int getMouseIdleTicks() {
      return class163.field1969;
   }

   public int getMouseCurrentButton() {
      return class163.field1983;
   }

   public long getMouseLastPressedMillis() {
      return class163.field1985;
   }

   public int[] getMapRegions() {
      return class23.field255;
   }

   public RSNodeCache getWidgetSpriteCache() {
      return class187.field2552;
   }

   public int getVarbit(int var1) {
      return class259.method5178(var1);
   }

   public void revalidateWidgetScroll(Widget[] var1, Widget var2, boolean var3) {
      class79.method1593((class187[])var1, (class187)var2, var3);
   }

   public RSTextureProvider getTextureProvider() {
      return class176.field2433;
   }

   public int getCenterX() {
      return class211.field2907;
   }

   public int getCenterY() {
      return class211.field2897;
   }

   public int getRasterizer3D_clipNegativeMidX() {
      return class211.field2915;
   }

   public int getRasterizer3D_clipMidX2() {
      return class211.field2912;
   }

   public int getRasterizer3D_clipNegativeMidY() {
      return class211.field2911;
   }

   public int getRasterizer3D_clipMidY2() {
      return class211.field2913;
   }

   public RSWidget getDraggedWidget() {
      return field2326;
   }

   public RSHashTable getWidgetFlags() {
      return field2355;
   }

   public RSHashTable getComponentTable() {
      return field2412;
   }

   public int[] getWidgetPositionsX() {
      return field2322;
   }

   public void setGameDrawingMode(int var1) {
      field2365 = var1;
   }

   public int getGameDrawingMode() {
      return field2365;
   }

   public int[] getWidgetPositionsY() {
      return field2362;
   }

   public boolean isDraggingWidget() {
      return field2337;
   }

   public int getEnergy() {
      return field2163;
   }

   public int getWeight() {
      return field2321;
   }

   public void setDraggedOnWidget(Widget var1) {
      field2330 = (class187)var1;
   }

   public RSWidget getDraggedOnWidget() {
      return field2330;
   }

   public RSSpritePixels[] getMapIcons() {
      return field2382;
   }

   public int getScale() {
      return field2230;
   }

   public int getViewportWidth() {
      return field2413;
   }

   public int getViewportHeight() {
      return field2359;
   }

   public int getViewportXOffset() {
      return field2244;
   }

   public int getViewportYOffset() {
      return field2237;
   }

   public int[] getChangedSkills() {
      return field2289;
   }

   public void setChangedSkillsCount(int var1) {
      field2416 = var1;
   }

   public int getChangedSkillsCount() {
      return field2416;
   }

   public RSGrandExchangeOffer[] getGrandExchangeOffers() {
      return field2420;
   }

   public RSCollisionData[] getCollisionMaps() {
      return field2211;
   }

   public int getWorld() {
      return field2206;
   }

   public int getGameCycle() {
      return field2165;
   }

   public void setHintArrowTargetType(int var1) {
      field2173 = var1;
   }

   public int getHintArrowTargetType() {
      return field2173;
   }

   public void setHintArrowNpcTargetIdx(int var1) {
      field2280 = var1;
   }

   public int getHintArrowNpcTargetIdx() {
      return field2280;
   }

   public void setHintArrowPlayerTargetIdx(int var1) {
      field2220 = var1;
   }

   public int getHintArrowPlayerTargetIdx() {
      return field2220;
   }

   public void setHintArrowX(int var1) {
      field2176 = var1;
   }

   public int getHintArrowX() {
      return field2176;
   }

   public void setHintArrowY(int var1) {
      field2320 = var1;
   }

   public int getHintArrowY() {
      return field2320;
   }

   public void setHintArrowOffsetX(int var1) {
      field2179 = var1;
   }

   public void setHintArrowOffsetY(int var1) {
      field2180 = var1;
   }

   public boolean isInInstancedRegion() {
      return field2212;
   }

   public int[][][] getInstanceTemplateChunks() {
      return field2213;
   }

   public void setCameraPitch(int var1) {
      field2430 = var1;
   }

   public int getCameraPitch() {
      return field2430;
   }

   public void setCameraPitchTarget(int var1) {
      field2222 = var1;
   }

   public int getCameraPitchTarget() {
      return field2222;
   }

   public int getMapAngle() {
      return field2223;
   }

   public void setOculusOrbState(int var1) {
      field2228 = var1;
   }

   public int getOculusOrbState() {
      return field2228;
   }

   public void setOculusOrbNormalSpeed(int var1) {
      field2233 = var1;
   }

   public int[][] getOccupiedTilesTick() {
      return field2314;
   }

   public void setItemPressedDuration(int var1) {
      field2266 = var1;
   }

   public int getItemPressedDuration() {
      return field2266;
   }

   public int getLocalInteractingIndex() {
      return field2186;
   }

   public int[] getPlayerMenuTypes() {
      return field2276;
   }

   public String[] getPlayerOptions() {
      return field2277;
   }

   public boolean[] getPlayerOptionsPriorities() {
      return field2278;
   }

   public RSDeque[][][] getGroundItemDeque() {
      return field2182;
   }

   public boolean isMenuOpen() {
      return field2360;
   }

   public void packetHandler() {
      this.vmethod5856();
   }

   public void revalidateWidget(Widget var1) {
      this.method3614((class187)var1);
   }

   public int getCameraYaw() {
      return class220.field2986;
   }

   public boolean getViewportContainsMouse() {
      return class298.field3713;
   }

   public int getViewportMouseX() {
      return class298.field3706;
   }

   public int getViewportMouseY() {
      return class298.field3705;
   }

   public void setEntitiesAtMouseCount(int var1) {
      class298.field3703 = var1;
   }

   public int getEntitiesAtMouseCount() {
      return class298.field3703;
   }

   public long[] getEntitiesAtMouse() {
      return class298.field3710;
   }

   public RSNPCComposition getNpcDefinition(int var1) {
      return class127.method2480(var1);
   }

   public int getBaseX() {
      return class229.field3067;
   }

   public int getCameraZ() {
      return class229.field3068;
   }

   public RSSpritePixels[] getMapDots() {
      return class272.field3484;
   }

   public int getFPS() {
      return GameEngine.field3723;
   }

   @ObfuscatedName("ii")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "717270702"
   )
   final void method3261(boolean var1) {
      class85.method1627(field2313, class167.field2010, class193.field2748, var1);
   }

   @ObfuscatedName("ee")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-848478347"
   )
   void method3249() {
      if(field2161 != 1000) {
         long var2 = class321.method6252();
         int var4 = (int)(var2 - class129.field1725);
         class129.field1725 = var2;
         if(var4 > 200) {
            var4 = 200;
         }

         class239.field3130 += var4;
         boolean var1;
         if(class239.field3123 == 0 && class239.field3122 == 0 && class239.field3133 == 0 && class239.field3124 == 0) {
            var1 = true;
         } else if(class239.field3135 == null) {
            var1 = false;
         } else {
            try {
               label243: {
                  if(class239.field3130 > 30000) {
                     throw new IOException();
                  }

                  class326 var5;
                  class125 var6;
                  while(class239.field3122 < 200 && class239.field3124 > 0) {
                     var5 = (class326)class239.field3132.method1783();
                     var6 = new class125(4);
                     var6.method2288(1);
                     var6.method2412((int)var5.field2792);
                     class239.field3135.vmethod2791(var6.field1694, 0, 4);
                     class239.field3126.method1775(var5, var5.field2792);
                     --class239.field3124;
                     ++class239.field3122;
                  }

                  while(class239.field3123 < 200 && class239.field3133 > 0) {
                     var5 = (class326)class239.field3128.method1061();
                     var6 = new class125(4);
                     var6.method2288(0);
                     var6.method2412((int)var5.field2792);
                     class239.field3135.vmethod2791(var6.field1694, 0, 4);
                     var5.method6268();
                     class239.field3131.method1775(var5, var5.field2792);
                     --class239.field3133;
                     ++class239.field3123;
                  }

                  for(int var17 = 0; var17 < 100; ++var17) {
                     int var18 = class239.field3135.vmethod2789();
                     if(var18 < 0) {
                        throw new IOException();
                     }

                     if(var18 == 0) {
                        break;
                     }

                     class239.field3130 = 0;
                     byte var7 = 0;
                     if(class239.field3134 == null) {
                        var7 = 8;
                     } else if(class239.field3136 == 0) {
                        var7 = 1;
                     }

                     int var8;
                     int var9;
                     int var10;
                     int var12;
                     if(var7 > 0) {
                        var8 = var7 - class239.field3125.field1693;
                        if(var8 > var18) {
                           var8 = var18;
                        }

                        class239.field3135.vmethod2803(class239.field3125.field1694, class239.field3125.field1693, var8);
                        if(class239.field3139 != 0) {
                           for(var9 = 0; var9 < var8; ++var9) {
                              class239.field3125.field1694[class239.field3125.field1693 + var9] ^= class239.field3139;
                           }
                        }

                        class239.field3125.field1693 += var8;
                        if(class239.field3125.field1693 < var7) {
                           break;
                        }

                        if(class239.field3134 == null) {
                           class239.field3125.field1693 = 0;
                           var9 = class239.field3125.method2256();
                           var10 = class239.field3125.method2258();
                           int var11 = class239.field3125.method2256();
                           var12 = class239.field3125.method2344();
                           long var13 = (long)(var10 + (var9 << 16));
                           class326 var15 = (class326)class239.field3126.method1776(var13);
                           class239.field3140 = true;
                           if(var15 == null) {
                              var15 = (class326)class239.field3131.method1776(var13);
                              class239.field3140 = false;
                           }

                           if(var15 == null) {
                              throw new IOException();
                           }

                           int var16 = var11 == 0?5:9;
                           class239.field3134 = var15;
                           class236.field3118 = new class125(var16 + var12 + class239.field3134.field3954);
                           class236.field3118.method2288(var11);
                           class236.field3118.method2334(var12);
                           class239.field3136 = 8;
                           class239.field3125.field1693 = 0;
                        } else if(class239.field3136 == 0) {
                           if(class239.field3125.field1694[0] == -1) {
                              class239.field3136 = 1;
                              class239.field3125.field1693 = 0;
                           } else {
                              class239.field3134 = null;
                           }
                        }
                     } else {
                        var8 = class236.field3118.field1694.length - class239.field3134.field3954;
                        var9 = 512 - class239.field3136;
                        if(var9 > var8 - class236.field3118.field1693) {
                           var9 = var8 - class236.field3118.field1693;
                        }

                        if(var9 > var18) {
                           var9 = var18;
                        }

                        class239.field3135.vmethod2803(class236.field3118.field1694, class236.field3118.field1693, var9);
                        if(class239.field3139 != 0) {
                           for(var10 = 0; var10 < var9; ++var10) {
                              class236.field3118.field1694[class236.field3118.field1693 + var10] ^= class239.field3139;
                           }
                        }

                        class236.field3118.field1693 += var9;
                        class239.field3136 += var9;
                        if(var8 == class236.field3118.field1693) {
                           if(16711935L == class239.field3134.field2792) {
                              class57.field714 = class236.field3118;

                              for(var10 = 0; var10 < 256; ++var10) {
                                 class6 var19 = class239.field3138[var10];
                                 if(var19 != null) {
                                    class57.field714.field1693 = var10 * 8 + 5;
                                    var12 = class57.field714.method2344();
                                    int var20 = class57.field714.method2344();
                                    var19.method128(var12, var20);
                                 }
                              }
                           } else {
                              class239.field3137.reset();
                              class239.field3137.update(class236.field3118.field1694, 0, var8);
                              var10 = (int)class239.field3137.getValue();
                              if(var10 != class239.field3134.field3952) {
                                 try {
                                    class239.field3135.vmethod2787();
                                 } catch (Exception var23) {
                                    ;
                                 }

                                 ++class239.field3129;
                                 class239.field3135 = null;
                                 class239.field3139 = (byte)((int)(Math.random() * 255.0D + 1.0D));
                                 var1 = false;
                                 break label243;
                              }

                              class239.field3129 = 0;
                              class239.field3141 = 0;
                              class239.field3134.field3953.method101((int)(class239.field3134.field2792 & 65535L), class236.field3118.field1694, 16711680L == (class239.field3134.field2792 & 16711680L), class239.field3140);
                           }

                           class239.field3134.method3937();
                           if(class239.field3140) {
                              --class239.field3122;
                           } else {
                              --class239.field3123;
                           }

                           class239.field3136 = 0;
                           class239.field3134 = null;
                           class236.field3118 = null;
                        } else {
                           if(class239.field3136 != 512) {
                              break;
                           }

                           class239.field3136 = 0;
                        }
                     }
                  }

                  var1 = true;
               }
            } catch (IOException var24) {
               try {
                  class239.field3135.vmethod2787();
               } catch (Exception var22) {
                  ;
               }

               ++class239.field3141;
               class239.field3135 = null;
               var1 = false;
            }
         }

         if(!var1) {
            this.method3250();
         }

      }
   }

   @ObfuscatedName("hl")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1630117902"
   )
   final boolean method3259() {
      int var1 = field2290 - 1;
      return (field2288 == 1 && field2290 > 2 || class233.method4664(var1)) && !field2327[var1];
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1563482433"
   )
   protected final void vmethod5856() {
      ++field2165;
      this.method3249();
      class227.method4585();
      class95.method1744();
      class185.method3733();
      class96 var1 = class96.field1057;
      int var2;
      synchronized(class96.field1057) {
         ++class96.field1051;
         class96.field1055 = class96.field1037;
         class96.field1047 = 0;
         if(class96.field1030 >= 0) {
            while(class96.field1030 != class96.field1042) {
               var2 = class96.field1053[class96.field1042];
               class96.field1042 = class96.field1042 + 1 & 127;
               if(var2 < 0) {
                  class96.field1040[~var2] = false;
               } else {
                  if(!class96.field1040[var2] && class96.field1047 < class96.field1046.length - 1) {
                     class96.field1046[++class96.field1047 - 1] = var2;
                  }

                  class96.field1040[var2] = true;
               }
            }
         } else {
            for(var2 = 0; var2 < 112; ++var2) {
               class96.field1040[var2] = false;
            }

            class96.field1030 = class96.field1042;
         }

         if(class96.field1047 > 0) {
            class96.field1051 = 0;
         }

         class96.field1037 = class96.field1049;
      }

      class163 var35 = class163.field1968;
      synchronized(class163.field1968) {
         class163.field1983 = class163.field1970;
         class163.field1975 = class163.field1971;
         class163.field1976 = class163.field1972;
         class163.field1974 = class163.field1973;
         class163.field1982 = class163.field1967;
         class163.field1980 = class163.field1979;
         class163.field1984 = class163.field1966;
         class163.field1985 = class163.field1981;
         class163.field1967 = 0;
      }

      int var24;
      if(class93.field1003 != null) {
         var24 = class93.field1003.vmethod4669();
         field2395 = var24;
      }

      if(field2161 == 0) {
         class151.method2762();
         class191.field2735.vmethod5184();

         for(var24 = 0; var24 < 32; ++var24) {
            GameEngine.field3724[var24] = 0L;
         }

         for(var24 = 0; var24 < 32; ++var24) {
            GameEngine.field3738[var24] = 0L;
         }

         GameEngine.field3720 = 0;
      } else if(field2161 == 5) {
         class92.method1717(this);
         class151.method2762();
         class191.field2735.vmethod5184();

         for(var24 = 0; var24 < 32; ++var24) {
            GameEngine.field3724[var24] = 0L;
         }

         for(var24 = 0; var24 < 32; ++var24) {
            GameEngine.field3738[var24] = 0L;
         }

         GameEngine.field3720 = 0;
      } else if(field2161 != 10 && field2161 != 11) {
         if(field2161 == 20) {
            class92.method1717(this);
            this.method3252();
         } else if(field2161 == 25) {
            class226.method4569(false);
            field2344 = 0;
            boolean var42 = true;

            for(var2 = 0; var2 < class178.field2452.length; ++var2) {
               if(class54.field697[var2] != -1 && class178.field2452[var2] == null) {
                  class178.field2452[var2] = class152.field1869.method4398(class54.field697[var2], 0, 1035482844);
                  if(class178.field2452[var2] == null) {
                     var42 = false;
                     ++field2344;
                  }
               }

               if(class226.field3047[var2] != -1 && class59.field727[var2] == null) {
                  try {
                     class59.field727[var2] = class152.field1869.method4399(class226.field3047[var2], 0, class286.field3582[var2]);
                     if (class59.field727[var2] == null) {
                        var42 = false;
                        ++field2344;
                     }
                  } catch (Exception e) {

                  }
               }
            }

            if(!var42) {
               field2210 = 1;
            } else {
               field2202 = 0;
               var42 = true;

               int var5;
               class125 var9;
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
               for(var2 = 0; var2 < class178.field2452.length; ++var2) {
                  byte[] var3 = class59.field727[var2];
                  if(var3 != null) {
                     var25 = (class23.field255[var2] >> 8) * 64 - class229.field3067;
                     var5 = (class23.field255[var2] & 255) * 64 - class35.field360;
                     if(field2212) {
                        var25 = 10;
                        var5 = 10;
                     }

                     boolean var8 = true;
                     var9 = new class125(var3);
                     var10 = -1;

                     label725:
                     while(true) {
                        var11 = var9.method2315();
                        if(var11 == 0) {
                           var42 &= var8;
                           break;
                        }

                        var10 += var11;
                        var12 = 0;
                        boolean var13 = false;

                        while(true) {
                           while(!var13) {
                              var14 = var9.method2270();
                              if(var14 == 0) {
                                 continue label725;
                              }

                              var12 += var14 - 1;
                              var15 = var12 & 63;
                              var16 = var12 >> 6 & 63;
                              var17 = var9.method2256() >> 2;
                              var18 = var25 + var16;
                              var19 = var15 + var5;
                              if(var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                                 class15 var20 = class285.method5484(var10);
                                 if(var17 != 22 || !field2157 || var20.field167 != 0 || var20.field173 == 1 || var20.field186) {
                                    if(!var20.method329()) {
                                       ++field2202;
                                       var8 = false;
                                    }

                                    var13 = true;
                                 }
                              }
                           }

                           var14 = var9.method2270();
                           if(var14 == 0) {
                              break;
                           }

                           var9.method2256();
                        }
                     }
                  }
               }

               if(!var42) {
                  field2210 = 2;
               } else {
                  if(field2210 != 0) {
                     class214.method4369("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
                  }

                  class185.method3733();
                  class269.field3464.method1925();

                  for(var2 = 0; var2 < 4; ++var2) {
                     field2211[var2].method42();
                  }

                  int var26;
                  for(var2 = 0; var2 < 4; ++var2) {
                     for(var26 = 0; var26 < 104; ++var26) {
                        for(var25 = 0; var25 < 104; ++var25) {
                           class185.field2512[var2][var26][var25] = 0;
                        }
                     }
                  }

                  class185.method3733();
                  class107.method1890();
                  var2 = class178.field2452.length;

                  for(class186 var36 = (class186)class186.field2540.method1503(); var36 != null; var36 = (class186)class186.field2540.method1505()) {
                     if(var36.field2536 != null) {
                        class220.field2985.method5197(var36.field2536);
                        var36.field2536 = null;
                     }

                     if(var36.field2541 != null) {
                        class220.field2985.method5197(var36.field2541);
                        var36.field2541 = null;
                     }
                  }

                  class186.field2540.method1520();
                  class226.method4569(true);
                  int var6;
                  int var7;
                  int var39;
                  int var41;
                  if(!field2212) {
                     var26 = 0;

                     label657:
                     while(true) {
                        byte[] var27;
                        if(var26 >= var2) {
                           for(var26 = 0; var26 < var2; ++var26) {
                              var25 = (class23.field255[var26] >> 8) * 64 - class229.field3067;
                              var5 = (class23.field255[var26] & 255) * 64 - class35.field360;
                              var27 = class178.field2452[var26];
                              if(var27 == null && class118.field1631 < 800) {
                                 class185.method3733();
                                 class47.method1034(var25, var5, 64, 64);
                              }
                           }

                           class226.method4569(true);
                           var26 = 0;

                           while(true) {
                              if(var26 >= var2) {
                                 break label657;
                              }

                              byte[] var4 = class59.field727[var26];
                              if(var4 != null) {
                                 var5 = (class23.field255[var26] >> 8) * 64 - class229.field3067;
                                 var6 = (class23.field255[var26] & 255) * 64 - class35.field360;
                                 class185.method3733();
                                 class111 var29 = class269.field3464;
                                 class3[] var30 = field2211;
                                 var9 = new class125(var4);
                                 var10 = -1;

                                 while(true) {
                                    var11 = var9.method2315();
                                    if(var11 == 0) {
                                       break;
                                    }

                                    var10 += var11;
                                    var12 = 0;

                                    while(true) {
                                       var41 = var9.method2270();
                                       if(var41 == 0) {
                                          break;
                                       }

                                       var12 += var41 - 1;
                                       var14 = var12 & 63;
                                       var15 = var12 >> 6 & 63;
                                       var16 = var12 >> 12;
                                       var17 = var9.method2256();
                                       var18 = var17 >> 2;
                                       var19 = var17 & 3;
                                       int var31 = var5 + var15;
                                       int var21 = var6 + var14;
                                       if(var31 > 0 && var21 > 0 && var31 < 103 && var21 < 103) {
                                          int var22 = var16;
                                          if((class185.field2512[1][var31][var21] & 2) == 2) {
                                             var22 = var16 - 1;
                                          }

                                          class3 var23 = null;
                                          if(var22 >= 0) {
                                             var23 = var30[var22];
                                          }

                                          class35.method624(var16, var31, var21, var10, var19, var18, var29, var23);
                                       }
                                    }
                                 }
                              }

                              ++var26;
                           }
                        }

                        var25 = (class23.field255[var26] >> 8) * 64 - class229.field3067;
                        var5 = (class23.field255[var26] & 255) * 64 - class35.field360;
                        var27 = class178.field2452[var26];
                        if(var27 != null) {
                           class185.method3733();
                           var7 = class322.field3936 * 8 - 48;
                           var39 = class118.field1631 * 8 - 48;
                           class3[] var40 = field2211;
                           var10 = 0;

                           label654:
                           while(true) {
                              if(var10 >= 4) {
                                 class125 var28 = new class125(var27);
                                 var11 = 0;

                                 while(true) {
                                    if(var11 >= 4) {
                                       break label654;
                                    }

                                    for(var12 = 0; var12 < 64; ++var12) {
                                       for(var41 = 0; var41 < 64; ++var41) {
                                          class216.method4389(var28, var11, var25 + var12, var41 + var5, var7, var39, 0);
                                       }
                                    }

                                    ++var11;
                                 }
                              }

                              for(var11 = 0; var11 < 64; ++var11) {
                                 for(var12 = 0; var12 < 64; ++var12) {
                                    if(var11 + var25 > 0 && var11 + var25 < 103 && var5 + var12 > 0 && var12 + var5 < 103) {
                                       var40[var10].field35[var11 + var25][var12 + var5] &= -16777217;
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
                  if(field2212) {
                     var26 = 0;

                     label590:
                     while(true) {
                        if(var26 >= 4) {
                           for(var26 = 0; var26 < 13; ++var26) {
                              for(var25 = 0; var25 < 13; ++var25) {
                                 var5 = field2213[0][var26][var25];
                                 if(var5 == -1) {
                                    class47.method1034(var26 * 8, var25 * 8, 8, 8);
                                 }
                              }
                           }

                           class226.method4569(true);
                           var26 = 0;

                           while(true) {
                              if(var26 >= 4) {
                                 break label590;
                              }

                              class185.method3733();

                              for(var25 = 0; var25 < 13; ++var25) {
                                 for(var5 = 0; var5 < 13; ++var5) {
                                    var6 = field2213[var26][var25][var5];
                                    if(var6 != -1) {
                                       var7 = var6 >> 24 & 3;
                                       var39 = var6 >> 1 & 3;
                                       var32 = var6 >> 14 & 1023;
                                       var10 = var6 >> 3 & 2047;
                                       var11 = (var32 / 8 << 8) + var10 / 8;

                                       for(var12 = 0; var12 < class23.field255.length; ++var12) {
                                          if(class23.field255[var12] == var11 && class59.field727[var12] != null) {
                                             class253.method5079(class59.field727[var12], var26, var25 * 8, var5 * 8, var7, (var32 & 7) * 8, (var10 & 7) * 8, var39, class269.field3464, field2211);
                                             break;
                                          }
                                       }
                                    }
                                 }
                              }

                              ++var26;
                           }
                        }

                        class185.method3733();

                        for(var25 = 0; var25 < 13; ++var25) {
                           for(var5 = 0; var5 < 13; ++var5) {
                              boolean var38 = false;
                              var7 = field2213[var26][var25][var5];
                              if(var7 != -1) {
                                 var39 = var7 >> 24 & 3;
                                 var32 = var7 >> 1 & 3;
                                 var10 = var7 >> 14 & 1023;
                                 var11 = var7 >> 3 & 2047;
                                 var12 = (var10 / 8 << 8) + var11 / 8;

                                 for(var41 = 0; var41 < class23.field255.length; ++var41) {
                                    if(class23.field255[var41] == var12 && class178.field2452[var41] != null) {
                                       class255.method5128(class178.field2452[var41], var26, var25 * 8, var5 * 8, var39, (var10 & 7) * 8, (var11 & 7) * 8, var32, field2211);
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
                                       class185.field2522[var39][var11 + var32][var10 + var12] = 0;
                                    }
                                 }

                                 if(var32 > 0) {
                                    for(var11 = 1; var11 < 8; ++var11) {
                                       class185.field2522[var39][var32][var11 + var10] = class185.field2522[var39][var32 - 1][var11 + var10];
                                    }
                                 }

                                 if(var10 > 0) {
                                    for(var11 = 1; var11 < 8; ++var11) {
                                       class185.field2522[var39][var11 + var32][var10] = class185.field2522[var39][var32 + var11][var10 - 1];
                                    }
                                 }

                                 if(var32 > 0 && class185.field2522[var39][var32 - 1][var10] != 0) {
                                    class185.field2522[var39][var32][var10] = class185.field2522[var39][var32 - 1][var10];
                                 } else if(var10 > 0 && class185.field2522[var39][var32][var10 - 1] != 0) {
                                    class185.field2522[var39][var32][var10] = class185.field2522[var39][var32][var10 - 1];
                                 } else if(var32 > 0 && var10 > 0 && class185.field2522[var39][var32 - 1][var10 - 1] != 0) {
                                    class185.field2522[var39][var32][var10] = class185.field2522[var39][var32 - 1][var10 - 1];
                                 }
                              }
                           }
                        }

                        ++var26;
                     }
                  }

                  class226.method4569(true);
                  class185.method3733();
                  class276.method5376(class269.field3464, field2211);
                  class226.method4569(true);
                  var26 = class185.field2519;
                  if(var26 > class260.field3393) {
                     var26 = class260.field3393;
                  }

                  if(var26 < class260.field3393 - 1) {
                     var26 = class260.field3393 - 1;
                  }

                  if(field2157) {
                     class269.field3464.method2075(class185.field2519);
                  } else {
                     class269.field3464.method2075(0);
                  }

                  for(var25 = 0; var25 < 104; ++var25) {
                     for(var5 = 0; var5 < 104; ++var5) {
                        class236.method4712(var25, var5);
                     }
                  }

                  class185.method3733();
                  class310.method6087();
                  class15.field157.method1816();
                  class12 var37;
                  if(class302.field3755.method5934()) {
                     var37 = class150.method2761(ClientProt.field3165, field2384.field1770);
                     var37.field121.method2334(1057001181);
                     field2384.method2573(var37);
                  }

                  if(!field2212) {
                     var25 = (class322.field3936 - 6) / 8;
                     var5 = (class322.field3936 + 6) / 8;
                     var6 = (class118.field1631 - 6) / 8;
                     var7 = (class118.field1631 + 6) / 8;

                     for(var39 = var25 - 1; var39 <= var5 + 1; ++var39) {
                        for(var32 = var6 - 1; var32 <= var7 + 1; ++var32) {
                           if(var39 < var25 || var39 > var5 || var32 < var6 || var32 > var7) {
                              class152.field1869.method4477("m" + var39 + "_" + var32);
                              class152.field1869.method4477("l" + var39 + "_" + var32);
                           }
                        }
                     }
                  }

                  class142.method2635(30);
                  class185.method3733();
                  class304.method5996();
                  var37 = class150.method2761(ClientProt.field3232, field2384.field1770);
                  field2384.method2573(var37);
                  class191.field2735.vmethod5184();

                  for(var5 = 0; var5 < 32; ++var5) {
                     GameEngine.field3724[var5] = 0L;
                  }

                  for(var5 = 0; var5 < 32; ++var5) {
                     GameEngine.field3738[var5] = 0L;
                  }

                  GameEngine.field3720 = 0;
               }
            }
         }
      } else {
         class92.method1717(this);
      }

      if(field2161 == 30) {
         this.method3253();
      } else if(field2161 == 40 || field2161 == 45) {
         this.method3252();
      }

   }

   @ObfuscatedName("hv")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-41"
   )
   final void method3320(int var1, int var2) {
      this.menuOpened(var1, var2);
      class17.method367(var1, var2);
      class269.field3464.method2096(class260.field3393, var1, var2, false);
      field2360 = true;
   }

   @ObfuscatedName("eq")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "14"
   )
   void method3270(int var1) {
      class184.field2503 = null;
      class184.field2507 = null;
      field2184 = 0;
      if(class121.field1652 == class45.field509) {
         class45.field509 = class179.field2455;
      } else {
         class45.field509 = class121.field1652;
      }

      ++field2305;
      if(field2305 >= 2 && (var1 == 7 || var1 == 9)) {
         if(field2161 <= 5) {
            this.method5860("js5connect_full");
            field2161 = 1000;
            gameStateChanged(-1);
         } else {
            field2185 = 3000;
         }
      } else if(field2305 >= 2 && var1 == 6) {
         this.method5860("js5connect_outofdate");
         field2161 = 1000;
         gameStateChanged(-1);
      } else if(field2305 >= 4) {
         if(field2161 <= 5) {
            this.method5860("js5connect");
            field2161 = 1000;
            gameStateChanged(-1);
         } else {
            field2185 = 3000;
         }
      }

   }

   @ObfuscatedName("kl")
   @ObfuscatedSignature(
      signature = "(I)Lka;",
      garbageValue = "-186448518"
   )
   public class158 vmethod3264() {
      return class32.field303 != null?class32.field303.field2802:null;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1159305348"
   )
   protected final void vmethod5855() {
      int[] var1 = new int[]{20, 260, 10000};
      int[] var2 = new int[]{1000, 100, 500};
      if(var1 != null && var2 != null) {
         class122.field1659 = var1;
         class122.field1657 = new int[var1.length];
         class260.field3392 = new byte[var1.length][][];

         for(int var3 = 0; var3 < class122.field1659.length; ++var3) {
            class260.field3392[var3] = new byte[var2[var3]][];
         }
      } else {
         class122.field1659 = null;
         class122.field1657 = null;
         class260.field3392 = null;
      }

      class121.field1652 = field2155 == 0?43594:field2206 + 40000;
      class179.field2455 = field2155 == 0?443:field2206 + 50000;
      class45.field509 = class121.field1652;
      class327.field3956 = class112.field1288;
      class327.field3963 = class112.field1287;
      class327.field3961 = class112.field1289;
      class95.field1025 = class112.field1290;
      class179.field2454 = new class124();
      this.method5924();
      this.method5881();
      class93.field1003 = this.method5880();
      class164.field1989 = new class263(255, class305.field3777, class305.field3781, 500000);
      class283 var4 = null;
      class77 var5 = new class77();

      try {
         var4 = class177.method3679("", class210.field2889.field238, false);
         byte[] var6 = new byte[(int)var4.method5445()];

         int var8;
         for(int var7 = 0; var7 < var6.length; var7 += var8) {
            var8 = var4.method5446(var6, var7, var6.length - var7);
            if(var8 == -1) {
               throw new IOException();
            }
         }

         var5 = new class77(new class125(var6));
      } catch (Exception var11) {
         ;
      }

      try {
         if(var4 != null) {
            var4.method5454();
         }
      } catch (Exception var10) {
         ;
      }

      class175.field2134 = var5;
      this.method5836();
      class23.method440(this, class231.field3081);
      if(field2155 != 0) {
         field2171 = true;
      }

      class109.method1920(class175.field2134.field859);
      class202.field2845 = new class159(class140.field1794);
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1829775887"
   )
   protected final void vmethod5864() {
   }

   @ObfuscatedName("fk")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-36"
   )
   final void method3253() {
      if(field2172 > 1) {
         --field2172;
      }

      if(field2298 > 0) {
         --field2298;
      }

      if(field2421) {
         field2421 = false;
         class241.method4744();
      } else {
         if(!field2360) {
            class32.method530();
         }

         int var1;
         for(var1 = 0; var1 < 100 && this.method3257(field2384); ++var1) {
            ;
         }

         if(field2161 == 30) {
            int var2;
            class12 var14;
            while(class3.method75()) {
               var14 = class150.method2761(ClientProt.field3247, field2384.field1770);
               var14.field121.method2288(0);
               var2 = var14.field121.field1693;
               class174.method3222(var14.field121);
               var14.field121.method2254(var14.field121.field1693 - var2);
               field2384.method2573(var14);
            }

            if(field2398.field653) {
               var14 = class150.method2761(ClientProt.field3160, field2384.field1770);
               var14.field121.method2288(0);
               var2 = var14.field121.field1693;
               field2398.method1205(var14.field121);
               var14.field121.method2254(var14.field121.field1693 - var2);
               field2384.method2573(var14);
               field2398.method1203();
            }

            Object var35 = class208.field2882.field3511;
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
            synchronized(class208.field2882.field3511) {
               if(!field2152) {
                  class208.field2882.field3509 = 0;
               } else if(class163.field1982 != 0 || class208.field2882.field3509 >= 40) {
                  class12 var15 = null;
                  var3 = 0;
                  var4 = 0;
                  var5 = 0;
                  var6 = 0;

                  for(var7 = 0; var7 < class208.field2882.field3509 && (var15 == null || var15.field121.field1693 - var3 < 246); ++var7) {
                     var4 = var7;
                     var8 = class208.field2882.field3507[var7];
                     if(var8 < -1) {
                        var8 = -1;
                     } else if(var8 > 65534) {
                        var8 = 65534;
                     }

                     var9 = class208.field2882.field3510[var7];
                     if(var9 < -1) {
                        var9 = -1;
                     } else if(var9 > 65534) {
                        var9 = 65534;
                     }

                     if(var9 != field2167 || var8 != field2151) {
                        if(var15 == null) {
                           var15 = class150.method2761(ClientProt.field3190, field2384.field1770);
                           var15.field121.method2288(0);
                           var3 = var15.field121.field1693;
                           var15.field121.field1693 += 2;
                           var5 = 0;
                           var6 = 0;
                        }

                        if(field2169 != -1L) {
                           var10 = var9 - field2167;
                           var11 = var8 - field2151;
                           var12 = (int)((class208.field2882.field3508[var7] - field2169) / 20L);
                           var5 = (int)((long)var5 + (class208.field2882.field3508[var7] - field2169) % 20L);
                        } else {
                           var10 = var9;
                           var11 = var8;
                           var12 = Integer.MAX_VALUE;
                        }

                        field2167 = var9;
                        field2151 = var8;
                        if(var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                           var10 += 32;
                           var11 += 32;
                           var15.field121.method2242((var12 << 12) + var11 + (var10 << 6));
                        } else if(var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
                           var10 += 128;
                           var11 += 128;
                           var15.field121.method2288(var12 + 128);
                           var15.field121.method2242(var11 + (var10 << 8));
                        } else if(var12 < 32) {
                           var15.field121.method2288(var12 + 192);
                           if(var9 != -1 && var8 != -1) {
                              var15.field121.method2334(var9 | var8 << 16);
                           } else {
                              var15.field121.method2334(Integer.MIN_VALUE);
                           }
                        } else {
                           var15.field121.method2242((var12 & 8191) + 57344);
                           if(var9 != -1 && var8 != -1) {
                              var15.field121.method2334(var9 | var8 << 16);
                           } else {
                              var15.field121.method2334(Integer.MIN_VALUE);
                           }
                        }

                        ++var6;
                        field2169 = class208.field2882.field3508[var7];
                     }
                  }

                  if(var15 != null) {
                     var15.field121.method2254(var15.field121.field1693 - var3);
                     var7 = var15.field121.field1693;
                     var15.field121.field1693 = var3;
                     var15.field121.method2288(var5 / var6);
                     var15.field121.method2288(var5 % var6);
                     var15.field121.field1693 = var7;
                     field2384.method2573(var15);
                  }

                  if(var4 >= class208.field2882.field3509) {
                     class208.field2882.field3509 = 0;
                  } else {
                     class208.field2882.field3509 -= var4;
                     System.arraycopy(class208.field2882.field3510, var4, class208.field2882.field3510, 0, class208.field2882.field3509);
                     System.arraycopy(class208.field2882.field3507, var4, class208.field2882.field3507, 0, class208.field2882.field3509);
                     System.arraycopy(class208.field2882.field3508, var4, class208.field2882.field3508, 0, class208.field2882.field3509);
                  }
               }
            }

            class12 var18;
            if(class163.field1982 == 1 || !class225.field3039 && class163.field1982 == 4 || class163.field1982 == 2) {
               long var16 = (class163.field1985 - field2166 * -1L) / 50L;
               if(var16 > 4095L) {
                  var16 = 4095L;
               }

               field2166 = class163.field1985 * -1L;
               var3 = class163.field1984;
               if(var3 < 0) {
                  var3 = 0;
               } else if(var3 > class193.field2748) {
                  var3 = class193.field2748;
               }

               var4 = class163.field1980;
               if(var4 < 0) {
                  var4 = 0;
               } else if(var4 > class167.field2010) {
                  var4 = class167.field2010;
               }

               var5 = (int)var16;
               var18 = class150.method2761(ClientProt.field3219, field2384.field1770);
               var18.field121.method2242((var5 << 1) + (class163.field1982 == 2?1:0));
               var18.field121.method2242(var4);
               var18.field121.method2242(var3);
               field2384.method2573(var18);
            }

            if(class96.field1047 > 0) {
               var14 = class150.method2761(ClientProt.field3211, field2384.field1770);
               var14.field121.method2242(0);
               var2 = var14.field121.field1693;
               long var19 = class321.method6252();

               for(var5 = 0; var5 < class96.field1047; ++var5) {
                  long var21 = var19 - field2377;
                  if(var21 > 16777215L) {
                     var21 = 16777215L;
                  }

                  field2377 = var19;
                  var14.field121.method2283(class96.field1046[var5]);
                  var14.field121.method2412((int)var21);
               }

               var14.field121.method2253(var14.field121.field1693 - var2);
               field2384.method2573(var14);
            }

            if(field2214 > 0) {
               --field2214;
            }

            if(class96.field1040[96] || class96.field1040[97] || class96.field1040[98] || class96.field1040[99]) {
               field2238 = true;
            }

            if(field2238 && field2214 <= 0) {
               field2214 = 20;
               field2238 = false;
               var14 = class150.method2761(ClientProt.field3195, field2384.field1770);
               var14.field121.method2369(field2222);
               var14.field121.method2255(field2223);
               field2384.method2573(var14);
            }

            if(class318.field3915 && !field2178) {
               field2178 = true;
               var14 = class150.method2761(ClientProt.field3208, field2384.field1770);
               var14.field121.method2288(1);
               field2384.method2573(var14);
            }

            if(!class318.field3915 && field2178) {
               field2178 = false;
               var14 = class150.method2761(ClientProt.field3208, field2384.field1770);
               var14.field121.method2288(0);
               field2384.method2573(var14);
            }

            if(class199.field2812 != null) {
               class199.field2812.method5490();
            }

            if(class301.field3748) {
               if(class250.field3328 != null) {
                  class250.field3328.method3039();
               }

               for(var1 = 0; var1 < class152.field1874; ++var1) {
                  class199 var38 = field2269[class152.field1875[var1]];
                  var38.method3958();
               }

               class301.field3748 = false;
            }

            if(class260.field3393 != field2194) {
               field2194 = class260.field3393;
               var1 = class260.field3393;
               int[] var39 = class32.field304.pixels;
               var3 = var39.length;

               for(var4 = 0; var4 < var3; ++var4) {
                  var39[var4] = 0;
               }

               for(var4 = 1; var4 < 103; ++var4) {
                  var5 = (103 - var4) * 2048 + 24628;

                  for(var6 = 1; var6 < 103; ++var6) {
                     if((class185.field2512[var1][var6][var4] & 24) == 0) {
                        class269.field3464.method1959(var39, var5, 512, var1, var6, var4);
                     }

                     if(var1 < 3 && (class185.field2512[var1 + 1][var6][var4] & 8) != 0) {
                        class269.field3464.method1959(var39, var5, 512, var1 + 1, var6, var4);
                     }

                     var5 += 4;
                  }
               }

               var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
               var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
               class32.field304.method304();

               for(var6 = 1; var6 < 103; ++var6) {
                  for(var7 = 1; var7 < 103; ++var7) {
                     if((class185.field2512[var1][var7][var6] & 24) == 0) {
                        class301.method5972(var1, var7, var6, var4, var5);
                     }

                     if(var1 < 3 && (class185.field2512[var1 + 1][var7][var6] & 8) != 0) {
                        class301.method5972(var1 + 1, var7, var6, var4, var5);
                     }
                  }
               }

               field2379 = 0;

               for(var6 = 0; var6 < 104; ++var6) {
                  for(var7 = 0; var7 < 104; ++var7) {
                     long var23 = class269.field3464.method1992(class260.field3393, var6, var7);
                     if(0L != var23) {
                        var10 = class178.method3682(var23);
                        var11 = class285.method5484(var10).field148;
                        if(var11 >= 0) {
                           field2382[field2379] = class133.method2550(var11).method2202(false);
                           field2190[field2379] = var6;
                           field2381[field2379] = var7;
                           ++field2379;
                        }
                     }
                  }
               }

               class124.field1689.method6367();
            }

            if(field2161 == 30) {
               class269.method5329();
               class327.method6314();
               ++field2384.field1767;
               if(field2384.field1767 > 750) {
                  class241.method4744();
               } else {
                  class213.method4366();

                  for(var1 = 0; var1 < field2196; ++var1) {
                     var2 = field2197[var1];
                     class176 var25 = field2195[var2];
                     if(var25 != null) {
                        class225.method4562(var25, var25.field2437.field3862);
                     }
                  }

                  int[] var36 = class152.field1875;

                  for(var2 = 0; var2 < class152.field1874; ++var2) {
                     class199 var42 = field2269[var36[var2]];
                     if(var42 != null && var42.field1081 > 0) {
                        --var42.field1081;
                        if(var42.field1081 == 0) {
                           var42.field1085 = null;
                        }
                     }
                  }

                  for(var2 = 0; var2 < field2196; ++var2) {
                     var3 = field2197[var2];
                     class176 var26 = field2195[var3];
                     if(var26 != null && var26.field1081 > 0) {
                        --var26.field1081;
                        if(var26.field1081 == 0) {
                           var26.field1085 = null;
                        }
                     }
                  }

                  ++field2410;
                  if(field2257 != 0) {
                     field2245 += 20;
                     if(field2245 >= 400) {
                        field2257 = 0;
                     }
                  }

                  if(class265.field3448 != null) {
                     ++field2431;
                     if(field2431 >= 15) {
                        class230.method4617(class265.field3448);
                        class265.field3448 = null;
                     }
                  }

                  class187 var37 = class263.field3408;
                  class187 var40 = class305.field3786;
                  class263.field3408 = null;
                  class305.field3786 = null;
                  field2330 = null;
                  field2334 = false;
                  field2331 = false;
                  field2415 = 0;

                  while(ServerProt.method3134() && field2415 < 128) {
                     if(field2263 >= 2 && class96.field1040[82] && class286.field3584 == 66) {
                        String var44 = "";

                        class227 var41;
                        for(Iterator var27 = class38.field366.iterator(); var27.hasNext(); var44 = var44 + var41.field3053 + ':' + var41.field3051 + '\n') {
                           var41 = (class227)var27.next();
                        }

                        class302.field3755.method5837(var44);
                     } else if(field2228 != 1 || class71.field824 <= 0) {
                        field2376[field2415] = class286.field3584;
                        field2375[field2415] = class71.field824;
                        ++field2415;
                     }
                  }

                  if(class239.method4720() && class96.field1040[82] && class96.field1040[81] && field2395 != 0) {
                     var3 = class32.field303.field2805 - field2395;
                     if(var3 < 0) {
                        var3 = 0;
                     } else if(var3 > 3) {
                        var3 = 3;
                     }

                     if(var3 != class32.field303.field2805) {
                        var4 = class32.field303.field1101[0] + class229.field3067;
                        var5 = class32.field303.field1128[0] + class35.field360;
                        var18 = class150.method2761(ClientProt.field3217, field2384.field1770);
                        var18.field121.method2301(0);
                        var18.field121.method2255(var5);
                        var18.field121.method2283(var3);
                        var18.field121.method2242(var4);
                        field2384.method2573(var18);
                     }

                     field2395 = 0;
                  }

                  if(field2313 != -1) {
                     class184.method3709(field2313, 0, 0, class167.field2010, class193.field2748, 0, 0);
                  }

                  ++field2338;

                  while(true) {
                     class194 var43;
                     class187 var46;
                     class187 var47;
                     do {
                        var43 = (class194)field2353.method1498();
                        if(var43 == null) {
                           while(true) {
                              do {
                                 var43 = (class194)field2354.method1498();
                                 if(var43 == null) {
                                    while(true) {
                                       do {
                                          var43 = (class194)field2232.method1498();
                                          if(var43 == null) {
                                             this.method3258();
                                             if(class199.field2812 != null) {
                                                class199.field2812.method5500(class260.field3393, (class32.field303.field1090 >> 7) + class229.field3067, (class32.field303.field1072 >> 7) + class35.field360, false);
                                                class199.field2812.method5533();
                                             }

                                             if(field2326 != null) {
                                                this.method3263();
                                             }

                                             if(class283.field3562 != null) {
                                                class230.method4617(class283.field3562);
                                                ++field2266;
                                                itemPressedDurationChanged(-1);
                                                if(class163.field1983 == 0) {
                                                   if(field2265) {
                                                      if(class283.field3562 == ClientProt.field3258 && field2261 != field2264) {
                                                         class187 var45 = class283.field3562;
                                                         byte var31 = 0;
                                                         if(field2318 == 1 && var45.field2562 == 206) {
                                                            var31 = 1;
                                                         }

                                                         if(var45.field2682[field2264] <= 0) {
                                                            var31 = 0;
                                                         }

                                                         var6 = class203.method4026(var45);
                                                         boolean var33 = (var6 >> 29 & 1) != 0;
                                                         if(var33) {
                                                            var7 = field2261;
                                                            var8 = field2264;
                                                            var45.field2682[var8] = var45.field2682[var7];
                                                            var45.field2696[var8] = var45.field2696[var7];
                                                            var45.field2682[var7] = -1;
                                                            var45.field2696[var7] = 0;
                                                         } else if(var31 == 1) {
                                                            var7 = field2261;
                                                            var8 = field2264;

                                                            while(var8 != var7) {
                                                               if(var7 > var8) {
                                                                  var45.method3757(var7 - 1, var7);
                                                                  --var7;
                                                               } else if(var7 < var8) {
                                                                  var45.method3757(var7 + 1, var7);
                                                                  ++var7;
                                                               }
                                                            }
                                                         } else {
                                                            var45.method3757(field2264, field2261);
                                                         }

                                                         class12 var28 = class150.method2761(ClientProt.field3236, field2384.field1770);
                                                         var28.field121.method2242(field2264);
                                                         var28.field121.method2255(field2261);
                                                         var28.field121.method2334(class283.field3562.field2621);
                                                         var28.field121.method2283(var31);
                                                         field2384.method2573(var28);
                                                      }
                                                   } else if(this.method3259()) {
                                                      this.method3320(field2262, field2352);
                                                   } else if(field2290 > 0) {
                                                      var3 = field2262;
                                                      var4 = field2352;
                                                      class185.method3742(class322.field3939, var3, var4);
                                                      class322.field3939 = null;
                                                   }

                                                   field2431 = 10;
                                                   class163.field1982 = 0;
                                                   class283.field3562 = null;
                                                } else if(field2266 >= 5 && (class163.field1975 > field2262 + 5 || class163.field1975 < field2262 - 5 || class163.field1976 > field2352 + 5 || class163.field1976 < field2352 - 5)) {
                                                   field2265 = true;
                                                }
                                             }

                                             if(class111.method1964()) {
                                                var3 = class111.field1234;
                                                var4 = class111.field1256;
                                                class12 var48 = class150.method2761(ClientProt.field3252, field2384.field1770);
                                                var48.field121.method2288(5);
                                                var48.field121.method2292(var4 + class35.field360);
                                                var48.field121.method2292(var3 + class229.field3067);
                                                var48.field121.method2282(class96.field1040[82]?(class96.field1040[81]?2:1):0);
                                                field2384.method2573(var48);
                                                class111.method2037();
                                                field2370 = class163.field1980;
                                                field2255 = class163.field1984;
                                                field2257 = 1;
                                                field2245 = 0;
                                                field2216 = var3;
                                                field2414 = var4;
                                             }

                                             if(var37 != class263.field3408) {
                                                if(var37 != null) {
                                                   class230.method4617(var37);
                                                }

                                                if(class263.field3408 != null) {
                                                   class230.method4617(class263.field3408);
                                                }
                                             }

                                             if(var40 != class305.field3786 && field2374 == field2332) {
                                                if(var40 != null) {
                                                   class230.method4617(var40);
                                                }

                                                if(class305.field3786 != null) {
                                                   class230.method4617(class305.field3786);
                                                }
                                             }

                                             if(class305.field3786 != null) {
                                                if(field2374 < field2332) {
                                                   ++field2374;
                                                   if(field2374 == field2332) {
                                                      class230.method4617(class305.field3786);
                                                   }
                                                }
                                             } else if(field2374 > 0) {
                                                --field2374;
                                             }

                                             if(field2228 == 0) {
                                                var3 = class32.field303.field1090;
                                                var4 = class32.field303.field1072;
                                                if(class267.field3457 - var3 < -500 || class267.field3457 - var3 > 500 || class148.field1834 - var4 < -500 || class148.field1834 - var4 > 500) {
                                                   class267.field3457 = var3;
                                                   class148.field1834 = var4;
                                                }

                                                if(var3 != class267.field3457) {
                                                   class267.field3457 += (var3 - class267.field3457) / 16;
                                                }

                                                if(var4 != class148.field1834) {
                                                   class148.field1834 += (var4 - class148.field1834) / 16;
                                                }

                                                var5 = class267.field3457 >> 7;
                                                var6 = class148.field1834 >> 7;
                                                var7 = class314.method6140(class267.field3457, class148.field1834, class260.field3393);
                                                var8 = 0;
                                                if(var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
                                                   for(var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                                                      for(var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                                                         var11 = class260.field3393;
                                                         if(var11 < 3 && (class185.field2512[1][var9][var10] & 2) == 2) {
                                                            ++var11;
                                                         }

                                                         var12 = var7 - class185.field2522[var11][var9][var10];
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

                                                if(var9 > field2267) {
                                                   field2267 += (var9 - field2267) / 24;
                                                } else if(var9 < field2267) {
                                                   field2267 += (var9 - field2267) / 80;
                                                }

                                                class118.field1632 = class314.method6140(class32.field303.field1090, class32.field303.field1072, class260.field3393) - field2229;
                                             } else if(field2228 == 1) {
                                                if(field2236 && class32.field303 != null) {
                                                   var3 = class32.field303.field1101[0];
                                                   var4 = class32.field303.field1128[0];
                                                   if(var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                                                      class267.field3457 = class32.field303.field1090;
                                                      var5 = class314.method6140(class32.field303.field1090, class32.field303.field1072, class260.field3393) - field2229;
                                                      if(var5 < class118.field1632) {
                                                         class118.field1632 = var5;
                                                      }

                                                      class148.field1834 = class32.field303.field1072;
                                                      field2236 = false;
                                                   }
                                                }

                                                short var32 = -1;
                                                if(class96.field1040[33]) {
                                                   var32 = 0;
                                                } else if(class96.field1040[49]) {
                                                   var32 = 1024;
                                                }

                                                if(class96.field1040[48]) {
                                                   if(var32 == 0) {
                                                      var32 = 1792;
                                                   } else if(var32 == 1024) {
                                                      var32 = 1280;
                                                   } else {
                                                      var32 = 1536;
                                                   }
                                                } else if(class96.field1040[50]) {
                                                   if(var32 == 0) {
                                                      var32 = 256;
                                                   } else if(var32 == 1024) {
                                                      var32 = 768;
                                                   } else {
                                                      var32 = 512;
                                                   }
                                                }

                                                byte var34 = 0;
                                                if(class96.field1040[35]) {
                                                   var34 = -1;
                                                } else if(class96.field1040[51]) {
                                                   var34 = 1;
                                                }

                                                var5 = 0;
                                                if(var32 >= 0 || var34 != 0) {
                                                   var5 = class96.field1040[81]?field2234:field2233;
                                                   var5 *= 16;
                                                   field2231 = var32;
                                                   field2193 = var34;
                                                }

                                                if(field2403 < var5) {
                                                   field2403 += var5 / 8;
                                                   if(field2403 > var5) {
                                                      field2403 = var5;
                                                   }
                                                } else if(field2403 > var5) {
                                                   field2403 = field2403 * 9 / 10;
                                                }

                                                if(field2403 > 0) {
                                                   var6 = field2403 / 16;
                                                   if(field2231 >= 0) {
                                                      var3 = field2231 - class220.field2986 & 2047;
                                                      var7 = class211.field2920[var3];
                                                      var8 = class211.field2914[var3];
                                                      class267.field3457 += var7 * var6 / 65536;
                                                      class148.field1834 += var8 * var6 / 65536;
                                                   }

                                                   if(field2193 != 0) {
                                                      class118.field1632 += var6 * field2193;
                                                      if(class118.field1632 > 0) {
                                                         class118.field1632 = 0;
                                                      }
                                                   }
                                                } else {
                                                   field2231 = -1;
                                                   field2193 = -1;
                                                }

                                                if(class96.field1040[13]) {
                                                   field2384.method2573(class150.method2761(ClientProt.field3175, field2384.field1770));
                                                   field2228 = 0;
                                                }
                                             }

                                             if(class163.field1983 == 4 && class225.field3039) {
                                                var3 = class163.field1976 - field2227;
                                                field2164 = var3 * 2;
                                                field2227 = var3 != -1 && var3 != 1?(field2227 + class163.field1976) / 2:class163.field1976;
                                                var4 = field2239 - class163.field1975;
                                                field2224 = var4 * 2;
                                                field2239 = var4 != -1 && var4 != 1?(class163.field1975 + field2239) / 2:class163.field1975;
                                             } else {
                                                if(class96.field1040[96]) {
                                                   field2224 += (-24 - field2224) / 2;
                                                } else if(class96.field1040[97]) {
                                                   field2224 += (24 - field2224) / 2;
                                                } else {
                                                   field2224 /= 2;
                                                }

                                                if(class96.field1040[98]) {
                                                   field2164 += (12 - field2164) / 2;
                                                } else if(class96.field1040[99]) {
                                                   field2164 += (-12 - field2164) / 2;
                                                } else {
                                                   field2164 /= 2;
                                                }

                                                field2227 = class163.field1976;
                                                field2239 = class163.field1975;
                                             }

                                             field2223 = field2224 / 2 + field2223 & 2047;
                                             field2222 += field2164 / 2;
                                             onCameraPitchTargetChanged(-1);
                                             if(field2222 < 128) {
                                                field2222 = 128;
                                                onCameraPitchTargetChanged(-1);
                                             }

                                             if(field2222 > 383) {
                                                field2222 = 383;
                                                onCameraPitchTargetChanged(-1);
                                             }

                                             if(field2397) {
                                                class318.method6218();
                                             }

                                             for(var3 = 0; var3 < 5; ++var3) {
                                                ++field2402[var3];
                                             }

                                             class267.field3459.method1690();
                                             var3 = ++class163.field1969 - 1;
                                             var5 = class66.method1485();
                                             if(var3 > 15000 && var5 > 15000) {
                                                field2298 = 250;
                                                class316.method6193(14500);
                                                var18 = class150.method2761(ClientProt.field3205, field2384.field1770);
                                                field2384.method2573(var18);
                                             }

                                             class202.field2845.method2902();
                                             ++field2384.field1762;
                                             if(field2384.field1762 > 50) {
                                                var18 = class150.method2761(ClientProt.field3178, field2384.field1770);
                                                field2384.method2573(var18);
                                             }

                                             try {
                                                field2384.method2591();
                                             } catch (IOException var29) {
                                                class241.method4744();
                                             }

                                             return;
                                          }

                                          var46 = var43.field2759;
                                          if(var46.field2620 < 0) {
                                             break;
                                          }

                                          var47 = class48.method1047(var46.field2577);
                                       } while(var47 == null || var47.field2688 == null || var46.field2620 >= var47.field2688.length || var46 != var47.field2688[var46.field2620]);

                                       class209.method4198(var43);
                                    }
                                 }

                                 var46 = var43.field2759;
                                 if(var46.field2620 < 0) {
                                    break;
                                 }

                                 var47 = class48.method1047(var46.field2577);
                              } while(var47 == null || var47.field2688 == null || var46.field2620 >= var47.field2688.length || var46 != var47.field2688[var46.field2620]);

                              class209.method4198(var43);
                           }
                        }

                        var46 = var43.field2759;
                        if(var46.field2620 < 0) {
                           break;
                        }

                        var47 = class48.method1047(var46.field2577);
                     } while(var47 == null || var47.field2688 == null || var46.field2620 >= var47.field2688.length || var46 != var47.field2688[var46.field2620]);

                     class209.method4198(var43);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("er")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1310601373"
   )
   void method3250() {
      if(class239.field3129 >= 4) {
         this.method5860("js5crc");
         field2161 = 1000;
         gameStateChanged(-1);
      } else {
         if(class239.field3141 >= 4) {
            if(field2161 <= 5) {
               this.method5860("js5io");
               field2161 = 1000;
               gameStateChanged(-1);
               return;
            }

            field2185 = 3000;
            class239.field3141 = 3;
         }

         if(--field2185 + 1 <= 0) {
            try {
               if(field2184 == 0) {
                  class184.field2503 = GameEngine.field3741.method2147(class256.field3356, class45.field509);
                  ++field2184;
               }

               if(field2184 == 1) {
                  if(class184.field2503.field1716 == 2) {
                     this.method3270(-1);
                     return;
                  }

                  if(class184.field2503.field1716 == 1) {
                     ++field2184;
                  }
               }

               if(field2184 == 2) {
                  if(field2203) {
                     class184.field2507 = class193.method3918((Socket)class184.field2503.field1718, 40000, 5000);
                  } else {
                     class184.field2507 = new class154((Socket)class184.field2503.field1718, GameEngine.field3741, 5000);
                  }

                  class125 var1 = new class125(5);
                  var1.method2288(15);
                  var1.method2334(176);
                  class184.field2507.vmethod2791(var1.field1694, 0, 5);
                  ++field2184;
                  class270.field3479 = class321.method6252();
               }

               if(field2184 == 3) {
                  if(class184.field2507.vmethod2789() > 0 || !field2203 && field2161 <= 5) {
                     int var5 = class184.field2507.vmethod2793();
                     if(var5 != 0) {
                        this.method3270(var5);
                        return;
                     }

                     ++field2184;
                  } else if(class321.method6252() - class270.field3479 > 30000L) {
                     this.method3270(-2);
                     return;
                  }
               }

               if(field2184 == 4) {
                  class36 var10 = class184.field2507;
                  boolean var2 = field2161 > 20;
                  if(class239.field3135 != null) {
                     try {
                        class239.field3135.vmethod2787();
                     } catch (Exception var8) {
                        ;
                     }

                     class239.field3135 = null;
                  }

                  class239.field3135 = var10;
                  class134.method2561(var2);
                  class239.field3125.field1693 = 0;
                  class239.field3134 = null;
                  class236.field3118 = null;
                  class239.field3136 = 0;

                  while(true) {
                     class326 var3 = (class326)class239.field3126.method1783();
                     if(var3 == null) {
                        while(true) {
                           var3 = (class326)class239.field3131.method1783();
                           if(var3 == null) {
                              if(class239.field3139 != 0) {
                                 try {
                                    class125 var11 = new class125(4);
                                    var11.method2288(4);
                                    var11.method2288(class239.field3139);
                                    var11.method2242(0);
                                    class239.field3135.vmethod2791(var11.field1694, 0, 4);
                                 } catch (IOException var7) {
                                    try {
                                       class239.field3135.vmethod2787();
                                    } catch (Exception var6) {
                                       ;
                                    }

                                    ++class239.field3141;
                                    class239.field3135 = null;
                                 }
                              }

                              class239.field3130 = 0;
                              class129.field1725 = class321.method6252();
                              class184.field2503 = null;
                              class184.field2507 = null;
                              field2184 = 0;
                              field2305 = 0;
                              return;
                           }

                           class239.field3128.method1056(var3);
                           class239.field3127.method1775(var3, var3.field2792);
                           ++class239.field3133;
                           --class239.field3123;
                        }
                     }

                     class239.field3132.method1775(var3, var3.field2792);
                     ++class239.field3124;
                     --class239.field3122;
                  }
               }
            } catch (IOException var9) {
               this.method3270(-3);
            }

         }
      }
   }

   public static void onAddChatMessage(int var0, String var1, String var2, String var3) {
      Logger var4 = class302.field3755.getLogger();
      if(var4.isDebugEnabled()) {
         var4.debug("Chat message type {}: {}", ChatMessageType.of(var0), var2);
      }

      ChatMessageType var5 = ChatMessageType.of(var0);
      ChatMessage var6 = new ChatMessage(var5, var1, var2, var3);
      class302.field3755.getCallbacks().post(var6);
   }

   public static void copy$processClientError(String var0, Throwable var1, int var2) {
      try {
         String var3 = "";
         if(var1 != null) {
            Throwable var5 = var1;
            String var6;
            if(var1 instanceof class57) {
               if(var2 == -1921706377) {
                  return;
               }

               class57 var7 = (class57)var1;
               var6 = var7.field709 + " | ";
               var5 = var7.field708;
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
         if(class57.field710 == null) {
            return;
         }

         URL var4 = new URL(class57.field710.getCodeBase(), "clienterror.ws?c=" + class57.field707 + "&u=" + class57.field706 + "&v1=" + class165.field1998 + "&v2=" + class118.field1626 + "&ct=" + class57.field705 + "&e=" + var3);
         DataInputStream var18 = new DataInputStream(var4.openStream());
         var18.read();
         var18.close();
      } catch (Exception var17) {
         ;
      }

   }

   @ObfuscatedSignature(
      signature = "(Lbs;IB)V"
   )
   public static void copy$runScript(class194 var0, int var1, byte var2) {
      Object[] var3 = var0.field2765;
      Object var4;
      int var18;
      if(class135.method2564(var0.field2768)) {
         class185.field2527 = (class294)var3[0];
         class123 var5 = class133.method2550(class185.field2527.field3679);
         var4 = currentScript = class263.method5245(var0.field2768, var5.field1682, var5.field1684);
      } else {
         var18 = currentScriptPC = ((Integer)var3[0]).intValue();
         var4 = currentScript = class208.method4156(var18);
      }

      if(var4 != null) {
         class308.field3811 = 0;
         class103.field1146 = 0;
         currentScriptPC = -1;
         var18 = -1;
         int[] var6 = ((class296)var4).field3697;
         int[] var7 = ((class296)var4).field3689;
         byte var8 = -1;
         class249.field3314 = 0;
         class249.field3318 = false;
         boolean var28 = false;

         label895: {
            label896: {
               try {
                  int var11;
                  try {
                     label945: {
                        var28 = true;
                        class249.field3311 = new int[((class296)var4).field3691];
                        int var9 = 0;
                        class95.field1023 = new String[((class296)var4).field3700];
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
                                 var12 = var0.field2764;
                              }

                              if(var12 == -2147483646) {
                                 var12 = var0.field2761;
                              }

                              if(var12 == -2147483645) {
                                 var12 = var0.field2759 != null?var0.field2759.field2621:-1;
                              }

                              if(var12 == -2147483644) {
                                 var12 = var0.field2762;
                              }

                              if(var12 == -2147483643) {
                                 var12 = var0.field2759 != null?var0.field2759.field2620:-1;
                              }

                              if(var12 == -2147483642) {
                                 if(var0.field2767 != null) {
                                    if(var2 <= 1) {
                                       return;
                                    }

                                    var10000 = var0.field2767.field2621;
                                 } else {
                                    var10000 = -1;
                                 }

                                 var12 = var10000;
                              }

                              if(var12 == -2147483641) {
                                 if(var2 <= 1) {
                                    return;
                                 }

                                 if(var0.field2767 != null) {
                                    if(var2 <= 1) {
                                       return;
                                    }

                                    var10000 = var0.field2767.field2620;
                                 } else {
                                    var10000 = -1;
                                 }

                                 var12 = var10000;
                              }

                              if(var12 == -2147483640) {
                                 if(var2 <= 1) {
                                    return;
                                 }

                                 var12 = var0.field2760;
                              }

                              if(var12 == -2147483639) {
                                 if(var2 <= 1) {
                                    return;
                                 }

                                 var12 = var0.field2771;
                              }

                              class249.field3311[var9++] = var12;
                           } else if(var3[var11] instanceof String) {
                              if(var2 <= 1) {
                                 return;
                              }

                              var19 = (String)var3[var11];
                              if(var19.equals("event_opbase")) {
                                 var19 = var0.field2766;
                              }

                              class95.field1023[var10++] = var19;
                           }
                        }

                        var11 = 0;
                        class249.field3309 = var0.field2769;

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
                              if(((class296)var4).field3689[var18] == 1) {
                                 var35 = true;
                              } else {
                                 var35 = false;
                              }

                              var21 = class236.method4710(var31, (class296)var4, var35);
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
                                 class249.field3312[++class308.field3811 - 1] = var7[var18];
                              } else if(var31 == 1) {
                                 var12 = var7[var18];
                                 class249.field3312[++class308.field3811 - 1] = class81.field898[var12];
                              } else if(var31 == 2) {
                                 var12 = var7[var18];
                                 class81.field898[var12] = class249.field3312[--class308.field3811];
                                 settingsChanged(var12);
                                 class47.method896(var12);
                              } else if(var31 == 3) {
                                 class249.field3313[++class103.field1146 - 1] = ((class296)var4).field3690[var18];
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
                                    class308.field3811 -= 2;
                                    if(class249.field3312[class308.field3811] != class249.field3312[class308.field3811 + 1]) {
                                       var10001 = var7[var18];
                                       var10000 = var18 + var7[var18];
                                       currentScriptPC = var18 + var10001;
                                       var18 = var10000;
                                    }
                                 } else if(var31 == 8) {
                                    class308.field3811 -= 2;
                                    if(class249.field3312[class308.field3811] == class249.field3312[class308.field3811 + 1]) {
                                       var10001 = var7[var18];
                                       var10000 = var18 + var7[var18];
                                       currentScriptPC = var18 + var10001;
                                       var18 = var10000;
                                    }
                                 } else if(var31 == 9) {
                                    class308.field3811 -= 2;
                                    if(class249.field3312[class308.field3811] < class249.field3312[class308.field3811 + 1]) {
                                       var10001 = var7[var18];
                                       var10000 = var18 + var7[var18];
                                       currentScriptPC = var18 + var10001;
                                       var18 = var10000;
                                    }
                                 } else if(var31 == 10) {
                                    class308.field3811 -= 2;
                                    if(class249.field3312[class308.field3811] > class249.field3312[class308.field3811 + 1]) {
                                       var10001 = var7[var18];
                                       var10000 = var18 + var7[var18];
                                       currentScriptPC = var18 + var10001;
                                       var18 = var10000;
                                    }
                                 } else if(var31 == 21) {
                                    if(class249.field3314 == 0) {
                                       var28 = false;
                                       break label896;
                                    }

                                    class177 var36 = class249.field3307[--class249.field3314];
                                    var4 = currentScript = var36.field2441;
                                    var6 = ((class296)var4).field3697;
                                    var7 = ((class296)var4).field3689;
                                    var18 = currentScriptPC = var36.field2439;
                                    class249.field3311 = var36.field2440;
                                    class95.field1023 = var36.field2438;
                                 } else if(var31 == 25) {
                                    var12 = var7[var18];
                                    class249.field3312[++class308.field3811 - 1] = class259.method5178(var12);
                                 } else if(var31 == 27) {
                                    var12 = var7[var18];
                                    class127.method2483(var12, class249.field3312[--class308.field3811]);
                                 } else if(var31 == 31) {
                                    class308.field3811 -= 2;
                                    if(class249.field3312[class308.field3811] <= class249.field3312[class308.field3811 + 1]) {
                                       var10001 = var7[var18];
                                       var10000 = var18 + var7[var18];
                                       currentScriptPC = var18 + var10001;
                                       var18 = var10000;
                                    }
                                 } else if(var31 == 32) {
                                    class308.field3811 -= 2;
                                    if(class249.field3312[class308.field3811] >= class249.field3312[class308.field3811 + 1]) {
                                       var10001 = var7[var18];
                                       var10000 = var18 + var7[var18];
                                       currentScriptPC = var18 + var10001;
                                       var18 = var10000;
                                    }
                                 } else if(var31 == 33) {
                                    class249.field3312[++class308.field3811 - 1] = class249.field3311[var7[var18]];
                                 } else if(var31 == 34) {
                                    class249.field3311[var7[var18]] = class249.field3312[--class308.field3811];
                                 } else if(var31 == 35) {
                                    class249.field3313[++class103.field1146 - 1] = class95.field1023[var7[var18]];
                                 } else if(var31 == 36) {
                                    class95.field1023[var7[var18]] = class249.field3313[--class103.field1146];
                                 } else if(var31 == 37) {
                                    var12 = var7[var18];
                                    class103.field1146 -= var12;
                                    String var33 = class89.method1680(class249.field3313, class103.field1146, var12);
                                    class249.field3313[++class103.field1146 - 1] = var33;
                                 } else if(var31 == 38) {
                                    if(var2 <= 1) {
                                       return;
                                    }

                                    --class308.field3811;
                                 } else if(var31 == 39) {
                                    --class103.field1146;
                                 } else {
                                    int var16;
                                    if(var31 != 40) {
                                       if(var31 == 42) {
                                          if(var2 <= 1) {
                                             return;
                                          }

                                          class249.field3312[++class308.field3811 - 1] = class267.field3459.method1683(var7[var18]);
                                       } else if(var31 == 43) {
                                          class267.field3459.method1682(var7[var18], class249.field3312[--class308.field3811]);
                                       } else if(var31 == 44) {
                                          var12 = var7[var18] >> 16;
                                          var21 = var7[var18] & 65535;
                                          int var22 = class249.field3312[--class308.field3811];
                                          if(var22 < 0 || var22 > 5000) {
                                             throw new RuntimeException();
                                          }

                                          class249.field3315[var12] = var22;
                                          byte var23 = -1;
                                          if(var21 == 105) {
                                             var23 = 0;
                                          }

                                          for(var16 = 0; var16 < var22; ++var16) {
                                             class249.field3320[var12][var16] = var23;
                                          }
                                       } else if(var31 == 45) {
                                          if(var2 <= 1) {
                                             return;
                                          }

                                          var12 = var7[var18];
                                          var21 = class249.field3312[--class308.field3811];
                                          if(var21 < 0) {
                                             break;
                                          }

                                          if(var21 >= class249.field3315[var12]) {
                                             if(var2 <= 1) {
                                                return;
                                             }
                                             break;
                                          }

                                          class249.field3312[++class308.field3811 - 1] = class249.field3320[var12][var21];
                                       } else if(var31 == 46) {
                                          var12 = var7[var18];
                                          class308.field3811 -= 2;
                                          var21 = class249.field3312[class308.field3811];
                                          if(var21 < 0 || var21 >= class249.field3315[var12]) {
                                             throw new RuntimeException();
                                          }

                                          class249.field3320[var12][var21] = class249.field3312[class308.field3811 + 1];
                                       } else if(var31 == 47) {
                                          if(var2 <= 1) {
                                             return;
                                          }

                                          var19 = class267.field3459.method1708(var7[var18]);
                                          if(var19 == null) {
                                             var19 = "null";
                                          }

                                          class249.field3313[++class103.field1146 - 1] = var19;
                                       } else if(var31 == 48) {
                                          class267.field3459.method1684(var7[var18], class249.field3313[--class103.field1146]);
                                       } else {
                                          if(var31 != 60) {
                                             throw new IllegalStateException();
                                          }

                                          class235 var34 = ((class296)var4).field3695[var7[var18]];
                                          class228 var32 = (class228)var34.method4670((long)class249.field3312[--class308.field3811]);
                                          if(var32 != null) {
                                             var18 = currentScriptPC = var18 + var32.field3057;
                                          }
                                       }
                                    } else {
                                       var12 = var7[var18];
                                       class296 var13 = class208.method4156(var12);
                                       int[] var14 = new int[var13.field3691];
                                       String[] var15 = new String[var13.field3700];

                                       for(var16 = 0; var16 < var13.field3693; ++var16) {
                                          var14[var16] = class249.field3312[var16 + (class308.field3811 - var13.field3693)];
                                       }

                                       for(var16 = 0; var16 < var13.field3692; ++var16) {
                                          if(var2 <= 1) {
                                             return;
                                          }

                                          var15[var16] = class249.field3313[var16 + (class103.field1146 - var13.field3692)];
                                       }

                                       class308.field3811 -= var13.field3693;
                                       class103.field1146 -= var13.field3692;
                                       class177 var20 = new class177();
                                       var20.field2441 = (class296)var4;
                                       var20.field2439 = var18;
                                       var20.field2440 = class249.field3311;
                                       var20.field2438 = class95.field1023;
                                       class249.field3307[++class249.field3314 - 1] = var20;
                                       currentScript = var13;
                                       var4 = var13;
                                       var6 = var13.field3697;
                                       var7 = var13.field3689;
                                       currentScriptPC = -1;
                                       var18 = -1;
                                       class249.field3311 = var14;
                                       class95.field1023 = var15;
                                    }
                                 }
                              }
                           }
                        }

                        throw new RuntimeException();
                     }
                  } catch (Exception var29) {
                     StringBuilder var25 = new StringBuilder(30);
                     var25.append("").append(((class197)var4).field2792).append(" ");

                     for(var11 = class249.field3314 - 1; var11 >= 0; --var11) {
                        var25.append("").append(class249.field3307[var11].field2441.field2792).append(" ");
                     }

                     var25.append("").append(var8);
                     class202.method4018(var25.toString(), var29, 1543025593);
                     var28 = false;
                     break label895;
                  }
               } finally {
                  if(var28) {
                     if(class249.field3318) {
                        class249.field3319 = true;
                        class36.method654();
                        class249.field3319 = false;
                        class249.field3318 = false;
                     }

                  }
               }

               if(class249.field3318) {
                  class249.field3319 = true;
                  class36.method654();
                  class249.field3319 = false;
                  class249.field3318 = false;
               }

               return;
            }

            if(class249.field3318) {
               class249.field3319 = true;
               class36.method654();
               class249.field3319 = false;
               class249.field3318 = false;
            }

            return;
         }

         if(class249.field3318) {
            if(var2 <= 1) {
               return;
            }

            class249.field3319 = true;
            class36.method654();
            class249.field3319 = false;
            class249.field3318 = false;
         }

      }
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void canvasWidthChanged(int var0) {
      class302.field3755.getCallbacks().post(new CanvasSizeChanged());
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void gameStateChanged(int var0) {
      GameStateChanged var1 = new GameStateChanged();
      var1.setGameState(class302.field3755.getGameState());
      class302.field3755.getCallbacks().post(var1);
   }

   @ObfuscatedSignature(
      signature = "(Lik;IIB)Llp;"
   )
   public static SpritePixels copy$getSpriteAsSpritePixels(class217 var0, int var1, int var2, byte var3) {
      byte[] var5 = var0.method4398(var1, var2, -2010426741);
      boolean var4;
      if(var5 == null) {
         var4 = false;
      } else {
         class253.method5080(var5);
         var4 = true;
      }

      if(!var4) {
         return null;
      } else {
         SpritePixels var6 = new SpritePixels();
         var6.maxWidth = class212.field2927;
         var6.maxHeight = class212.field2924;
         var6.offsetX = class42.field476[0];
         var6.offsetY = class212.field2925[0];
         var6.width = class212.field2922[0];
         var6.height = class192.field2745[0];
         int var7 = var6.height * var6.width;
         byte[] var8 = class191.field2740[0];
         var6.pixels = new int[var7];

         for(int var9 = 0; var9 < var7; ++var9) {
            var6.pixels[var9] = class225.field3040[var8[var9] & 255];
         }

         class42.field476 = null;
         class212.field2925 = null;
         class212.field2922 = null;
         class192.field2745 = null;
         class225.field3040 = null;
         class191.field2740 = null;
         return var6;
      }
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void canvasHeightChanged(int var0) {
      class302.field3755.getCallbacks().post(new CanvasSizeChanged());
   }

   public static final void copy$menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7, byte var8) {
      if(var2 >= 2000) {
         if(var8 <= 0) {
            return;
         }

         var2 -= 2000;
      }

      class12 var9;
      if(var2 == 1) {
         field2370 = var6;
         field2255 = var7;
         field2257 = 2;
         field2245 = 0;
         field2216 = var0;
         field2414 = var1;
         var9 = class150.method2761(ClientProt.field3246, field2384.field1770);
         var9.field121.method2369(class35.field360 + var1);
         var9.field121.method2255(class72.field826);
         var9.field121.method2282(class96.field1040[82]?1:0);
         var9.field121.method2300(class314.field3853);
         var9.field121.method2369(var0 + class229.field3067);
         var9.field121.method2242(var3);
         var9.field121.method2255(class53.field657);
         field2384.method2573(var9);
      } else if(var2 == 2) {
         field2370 = var6;
         field2255 = var7;
         field2257 = 2;
         field2245 = 0;
         field2216 = var0;
         field2414 = var1;
         var9 = class150.method2761(ClientProt.field3229, field2384.field1770);
         var9.field121.method2288(class96.field1040[82]?1:0);
         var9.field121.method2242(var0 + class229.field3067);
         var9.field121.method2292(var3);
         var9.field121.method2302(class28.field281);
         var9.field121.method2242(field2309);
         var9.field121.method2255(class35.field360 + var1);
         field2384.method2573(var9);
      } else if(var2 == 3) {
         field2370 = var6;
         field2255 = var7;
         field2257 = 2;
         field2245 = 0;
         field2216 = var0;
         field2414 = var1;
         var9 = class150.method2761(ClientProt.field3166, field2384.field1770);
         var9.field121.method2242(class35.field360 + var1);
         var9.field121.method2284(class96.field1040[82]?1:0);
         var9.field121.method2292(var3);
         var9.field121.method2369(var0 + class229.field3067);
         field2384.method2573(var9);
      } else {
         class1 var10000;
         byte var10001;
         if(var2 == 4) {
            field2370 = var6;
            field2255 = var7;
            field2257 = 2;
            field2245 = 0;
            field2216 = var0;
            field2414 = var1;
            var9 = class150.method2761(ClientProt.field3235, field2384.field1770);
            var10000 = var9.field121;
            if(class96.field1040[82]) {
               if(var8 <= 0) {
                  return;
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            var10000.method2282(var10001);
            var9.field121.method2242(var3);
            var9.field121.method2242(class35.field360 + var1);
            var9.field121.method2242(var0 + class229.field3067);
            field2384.method2573(var9);
         } else if(var2 == 5) {
            field2370 = var6;
            field2255 = var7;
            field2257 = 2;
            field2245 = 0;
            field2216 = var0;
            field2414 = var1;
            var9 = class150.method2761(ClientProt.field3245, field2384.field1770);
            var9.field121.method2369(var0 + class229.field3067);
            var9.field121.method2292(var3);
            var9.field121.method2369(class35.field360 + var1);
            var9.field121.method2282(class96.field1040[82]?1:0);
            field2384.method2573(var9);
         } else if(var2 == 6) {
            field2370 = var6;
            field2255 = var7;
            field2257 = 2;
            field2245 = 0;
            field2216 = var0;
            field2414 = var1;
            var9 = class150.method2761(ClientProt.field3159, field2384.field1770);
            var9.field121.method2282(class96.field1040[82]?1:0);
            var9.field121.method2292(class35.field360 + var1);
            var9.field121.method2292(var0 + class229.field3067);
            var9.field121.method2255(var3);
            field2384.method2573(var9);
         } else {
            class12 var10;
            class176 var14;
            if(var2 == 7) {
               var14 = field2195[var3];
               if(var14 != null) {
                  field2370 = var6;
                  field2255 = var7;
                  field2257 = 2;
                  field2245 = 0;
                  field2216 = var0;
                  field2414 = var1;
                  var10 = class150.method2761(ClientProt.field3179, field2384.field1770);
                  var10.field121.method2369(class53.field657);
                  var10.field121.method2242(class72.field826);
                  var10.field121.method2369(var3);
                  var10.field121.method2283(class96.field1040[82]?1:0);
                  var10.field121.method2334(class314.field3853);
                  field2384.method2573(var10);
               }
            } else if(var2 == 8) {
               var14 = field2195[var3];
               if(var14 != null) {
                  if(var8 <= 0) {
                     return;
                  }

                  field2370 = var6;
                  field2255 = var7;
                  field2257 = 2;
                  field2245 = 0;
                  field2216 = var0;
                  field2414 = var1;
                  var10 = class150.method2761(ClientProt.field3242, field2384.field1770);
                  var10.field121.method2369(var3);
                  var10.field121.method2283(class96.field1040[82]?1:0);
                  var10.field121.method2300(class28.field281);
                  var10.field121.method2292(field2309);
                  field2384.method2573(var10);
               }
            } else if(var2 == 9) {
               var14 = field2195[var3];
               if(var14 != null) {
                  field2370 = var6;
                  field2255 = var7;
                  field2257 = 2;
                  field2245 = 0;
                  field2216 = var0;
                  field2414 = var1;
                  var10 = class150.method2761(ClientProt.field3227, field2384.field1770);
                  var10.field121.method2283(class96.field1040[82]?1:0);
                  var10.field121.method2255(var3);
                  field2384.method2573(var10);
               }
            } else if(var2 == 10) {
               var14 = field2195[var3];
               if(var14 != null) {
                  field2370 = var6;
                  field2255 = var7;
                  field2257 = 2;
                  field2245 = 0;
                  field2216 = var0;
                  field2414 = var1;
                  var10 = class150.method2761(ClientProt.field3157, field2384.field1770);
                  var10.field121.method2292(var3);
                  var10.field121.method2288(class96.field1040[82]?1:0);
                  field2384.method2573(var10);
               }
            } else if(var2 == 11) {
               var14 = field2195[var3];
               if(var14 != null) {
                  if(var8 <= 0) {
                     return;
                  }

                  field2370 = var6;
                  field2255 = var7;
                  field2257 = 2;
                  field2245 = 0;
                  field2216 = var0;
                  field2414 = var1;
                  var10 = class150.method2761(ClientProt.field3189, field2384.field1770);
                  var10.field121.method2369(var3);
                  var10.field121.method2288(class96.field1040[82]?1:0);
                  field2384.method2573(var10);
               }
            } else if(var2 == 12) {
               var14 = field2195[var3];
               if(var14 != null) {
                  field2370 = var6;
                  field2255 = var7;
                  field2257 = 2;
                  field2245 = 0;
                  field2216 = var0;
                  field2414 = var1;
                  var10 = class150.method2761(ClientProt.field3215, field2384.field1770);
                  var10.field121.method2242(var3);
                  var10.field121.method2282(class96.field1040[82]?1:0);
                  field2384.method2573(var10);
               }
            } else if(var2 == 13) {
               var14 = field2195[var3];
               if(var14 != null) {
                  if(var8 <= 0) {
                     return;
                  }

                  field2370 = var6;
                  field2255 = var7;
                  field2257 = 2;
                  field2245 = 0;
                  field2216 = var0;
                  field2414 = var1;
                  var10 = class150.method2761(ClientProt.field3187, field2384.field1770);
                  var10000 = var10.field121;
                  if(class96.field1040[82]) {
                     if(var8 <= 0) {
                        return;
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 0;
                  }

                  var10000.method2288(var10001);
                  var10.field121.method2292(var3);
                  field2384.method2573(var10);
               }
            } else {
               class199 var16;
               if(var2 == 14) {
                  var16 = field2269[var3];
                  if(var16 != null) {
                     field2370 = var6;
                     field2255 = var7;
                     field2257 = 2;
                     field2245 = 0;
                     field2216 = var0;
                     field2414 = var1;
                     var10 = class150.method2761(ClientProt.field3237, field2384.field1770);
                     var10.field121.method2369(class72.field826);
                     var10.field121.method2284(class96.field1040[82]?1:0);
                     var10.field121.method2301(class314.field3853);
                     var10.field121.method2242(var3);
                     var10.field121.method2242(class53.field657);
                     field2384.method2573(var10);
                  }
               } else if(var2 == 15) {
                  var16 = field2269[var3];
                  if(var16 != null) {
                     if(var8 <= 0) {
                        return;
                     }

                     field2370 = var6;
                     field2255 = var7;
                     field2257 = 2;
                     field2245 = 0;
                     field2216 = var0;
                     field2414 = var1;
                     var10 = class150.method2761(ClientProt.field3156, field2384.field1770);
                     var10.field121.method2302(class28.field281);
                     var10000 = var10.field121;
                     if(class96.field1040[82]) {
                        if(var8 <= 0) {
                           return;
                        }

                        var10001 = 1;
                     } else {
                        var10001 = 0;
                     }

                     var10000.method2284(var10001);
                     var10.field121.method2292(field2309);
                     var10.field121.method2242(var3);
                     field2384.method2573(var10);
                  }
               } else if(var2 == 16) {
                  field2370 = var6;
                  field2255 = var7;
                  field2257 = 2;
                  field2245 = 0;
                  field2216 = var0;
                  field2414 = var1;
                  var9 = class150.method2761(ClientProt.field3233, field2384.field1770);
                  var9.field121.method2301(class314.field3853);
                  var9.field121.method2369(class53.field657);
                  var9.field121.method2282(class96.field1040[82]?1:0);
                  var9.field121.method2255(class72.field826);
                  var9.field121.method2369(var3);
                  var9.field121.method2369(var0 + class229.field3067);
                  var9.field121.method2255(class35.field360 + var1);
                  field2384.method2573(var9);
               } else if(var2 == 17) {
                  field2370 = var6;
                  field2255 = var7;
                  field2257 = 2;
                  field2245 = 0;
                  field2216 = var0;
                  field2414 = var1;
                  var9 = class150.method2761(ClientProt.field3201, field2384.field1770);
                  var9.field121.method2301(class28.field281);
                  var9.field121.method2242(field2309);
                  var9.field121.method2292(class35.field360 + var1);
                  var9.field121.method2292(var0 + class229.field3067);
                  var9.field121.method2282(class96.field1040[82]?1:0);
                  var9.field121.method2255(var3);
                  field2384.method2573(var9);
               } else if(var2 == 18) {
                  field2370 = var6;
                  field2255 = var7;
                  field2257 = 2;
                  field2245 = 0;
                  field2216 = var0;
                  field2414 = var1;
                  var9 = class150.method2761(ClientProt.field3161, field2384.field1770);
                  var9.field121.method2369(class35.field360 + var1);
                  var9.field121.method2255(var3);
                  var9.field121.method2255(var0 + class229.field3067);
                  var9.field121.method2288(class96.field1040[82]?1:0);
                  field2384.method2573(var9);
               } else if(var2 == 19) {
                  field2370 = var6;
                  field2255 = var7;
                  field2257 = 2;
                  field2245 = 0;
                  field2216 = var0;
                  field2414 = var1;
                  var9 = class150.method2761(ClientProt.field3230, field2384.field1770);
                  var9.field121.method2369(var3);
                  var9.field121.method2292(var0 + class229.field3067);
                  var9.field121.method2242(class35.field360 + var1);
                  var9.field121.method2288(class96.field1040[82]?1:0);
                  field2384.method2573(var9);
               } else if(var2 == 20) {
                  field2370 = var6;
                  field2255 = var7;
                  field2257 = 2;
                  field2245 = 0;
                  field2216 = var0;
                  field2414 = var1;
                  var9 = class150.method2761(ClientProt.field3162, field2384.field1770);
                  var9.field121.method2255(class35.field360 + var1);
                  var9.field121.method2284(class96.field1040[82]?1:0);
                  var9.field121.method2255(var0 + class229.field3067);
                  var9.field121.method2255(var3);
                  field2384.method2573(var9);
               } else if(var2 == 21) {
                  field2370 = var6;
                  field2255 = var7;
                  field2257 = 2;
                  field2245 = 0;
                  field2216 = var0;
                  field2414 = var1;
                  var9 = class150.method2761(ClientProt.field3183, field2384.field1770);
                  var9.field121.method2292(class35.field360 + var1);
                  var9.field121.method2255(var3);
                  var9.field121.method2242(var0 + class229.field3067);
                  var9.field121.method2284(class96.field1040[82]?1:0);
                  field2384.method2573(var9);
               } else if(var2 == 22) {
                  if(var8 <= 0) {
                     return;
                  }

                  field2370 = var6;
                  field2255 = var7;
                  field2257 = 2;
                  field2245 = 0;
                  field2216 = var0;
                  field2414 = var1;
                  var9 = class150.method2761(ClientProt.field3200, field2384.field1770);
                  var9.field121.method2288(class96.field1040[82]?1:0);
                  var9.field121.method2369(var3);
                  var9.field121.method2292(class35.field360 + var1);
                  var9.field121.method2242(var0 + class229.field3067);
                  field2384.method2573(var9);
               } else if(var2 == 23) {
                  if(field2360) {
                     if(var8 <= 0) {
                        return;
                     }

                     class269.field3464.method1963();
                  } else {
                     class269.field3464.method2096(class260.field3393, var0, var1, true);
                  }
               } else {
                  class12 var11;
                  class187 var17;
                  if(var2 == 24) {
                     var17 = class48.method1047(var1);
                     boolean var12 = true;
                     if(var17.field2562 > 0) {
                        if(var8 <= 0) {
                           return;
                        }

                        var12 = class107.method1888(var17);
                     }

                     if(var12) {
                        if(var8 <= 0) {
                           return;
                        }

                        var11 = class150.method2761(ClientProt.field3225, field2384.field1770);
                        var11.field121.method2334(var1);
                        field2384.method2573(var11);
                     }
                  } else {
                     if(var2 == 25) {
                        var17 = class174.method3220(var1, var0);
                        if(var17 != null) {
                           if(var8 <= 0) {
                              return;
                           }

                           class103.method1853();
                           class174.method3219(var1, var0, class217.method4493(class203.method4026(var17)), var17.field2676);
                           field2306 = 0;
                           field2311 = class151.method2763(var17);
                           if(field2311 == null) {
                              field2311 = "null";
                           }

                           if(var17.field2557) {
                              field2312 = var17.field2683 + class64.method1354(16777215);
                           } else {
                              field2312 = class64.method1354(65280) + var17.field2564 + class64.method1354(16777215);
                           }
                        }

                        return;
                     }

                     if(var2 == 26) {
                        class36.method654();
                     } else {
                        int var13;
                        class187 var15;
                        if(var2 == 28) {
                           var9 = class150.method2761(ClientProt.field3225, field2384.field1770);
                           var9.field121.method2334(var1);
                           field2384.method2573(var9);
                           var15 = class48.method1047(var1);
                           if(var15.field2645 != null && var15.field2645[0][0] == 5) {
                              var13 = var15.field2645[0][1];
                              class81.field898[var13] = 1 - class81.field898[var13];
                              settingsChanged(var13);
                              class47.method896(var13);
                           }
                        } else if(var2 == 29) {
                           if(var8 <= 0) {
                              return;
                           }

                           var9 = class150.method2761(ClientProt.field3225, field2384.field1770);
                           var9.field121.method2334(var1);
                           field2384.method2573(var9);
                           var15 = class48.method1047(var1);
                           if(var15.field2645 != null && var15.field2645[0][0] == 5) {
                              var13 = var15.field2645[0][1];
                              if(class81.field898[var13] != var15.field2678[0]) {
                                 if(var8 <= 0) {
                                    return;
                                 }

                                 class81.field898[var13] = var15.field2678[0];
                                 settingsChanged(var13);
                                 class47.method896(var13);
                              }
                           }
                        } else if(var2 == 30) {
                           if(var8 <= 0) {
                              return;
                           }

                           if(field2319 == null) {
                              class103.method1854(var1, var0);
                              field2319 = class174.method3220(var1, var0);
                              class230.method4617(field2319);
                           }
                        } else if(var2 == 31) {
                           var9 = class150.method2761(ClientProt.field3249, field2384.field1770);
                           var9.field121.method2301(var1);
                           var9.field121.method2302(class314.field3853);
                           var9.field121.method2369(class72.field826);
                           var9.field121.method2255(class53.field657);
                           var9.field121.method2255(var0);
                           var9.field121.method2369(var3);
                           field2384.method2573(var9);
                           field2431 = 0;
                           class265.field3448 = class48.method1047(var1);
                           field2260 = var0;
                        } else if(var2 == 32) {
                           var9 = class150.method2761(ClientProt.field3174, field2384.field1770);
                           var9.field121.method2301(class28.field281);
                           var9.field121.method2334(var1);
                           var9.field121.method2242(var0);
                           var9.field121.method2255(var3);
                           var9.field121.method2255(field2309);
                           field2384.method2573(var9);
                           field2431 = 0;
                           class265.field3448 = class48.method1047(var1);
                           field2260 = var0;
                        } else if(var2 == 33) {
                           var9 = class150.method2761(ClientProt.field3243, field2384.field1770);
                           var9.field121.method2255(var3);
                           var9.field121.method2301(var1);
                           var9.field121.method2242(var0);
                           field2384.method2573(var9);
                           field2431 = 0;
                           class265.field3448 = class48.method1047(var1);
                           field2260 = var0;
                        } else if(var2 == 34) {
                           var9 = class150.method2761(ClientProt.field3212, field2384.field1770);
                           var9.field121.method2292(var3);
                           var9.field121.method2302(var1);
                           var9.field121.method2369(var0);
                           field2384.method2573(var9);
                           field2431 = 0;
                           class265.field3448 = class48.method1047(var1);
                           field2260 = var0;
                        } else if(var2 == 35) {
                           var9 = class150.method2761(ClientProt.field3244, field2384.field1770);
                           var9.field121.method2300(var1);
                           var9.field121.method2369(var0);
                           var9.field121.method2369(var3);
                           field2384.method2573(var9);
                           field2431 = 0;
                           class265.field3448 = class48.method1047(var1);
                           field2260 = var0;
                        } else if(var2 == 36) {
                           var9 = class150.method2761(ClientProt.field3163, field2384.field1770);
                           var9.field121.method2369(var3);
                           var9.field121.method2334(var1);
                           var9.field121.method2369(var0);
                           field2384.method2573(var9);
                           field2431 = 0;
                           class265.field3448 = class48.method1047(var1);
                           field2260 = var0;
                        } else if(var2 == 37) {
                           var9 = class150.method2761(ClientProt.field3223, field2384.field1770);
                           var9.field121.method2334(var1);
                           var9.field121.method2242(var0);
                           var9.field121.method2242(var3);
                           field2384.method2573(var9);
                           field2431 = 0;
                           class265.field3448 = class48.method1047(var1);
                           field2260 = var0;
                        } else {
                           if(var2 == 38) {
                              class103.method1853();
                              var17 = class48.method1047(var1);
                              field2306 = 1;
                              class72.field826 = var0;
                              class314.field3853 = var1;
                              class53.field657 = var3;
                              class230.method4617(var17);
                              field2256 = class64.method1354(16748608) + class164.method3014(var3).field446 + class64.method1354(16777215);
                              if(field2256 == null) {
                                 field2256 = "null";
                              }

                              return;
                           }

                           if(var2 == 39) {
                              var9 = class150.method2761(ClientProt.field3202, field2384.field1770);
                              var9.field121.method2369(var3);
                              var9.field121.method2302(var1);
                              var9.field121.method2255(var0);
                              field2384.method2573(var9);
                              field2431 = 0;
                              class265.field3448 = class48.method1047(var1);
                              field2260 = var0;
                           } else if(var2 == 40) {
                              if(var8 <= 0) {
                                 return;
                              }

                              var9 = class150.method2761(ClientProt.field3182, field2384.field1770);
                              var9.field121.method2302(var1);
                              var9.field121.method2255(var0);
                              var9.field121.method2292(var3);
                              field2384.method2573(var9);
                              field2431 = 0;
                              class265.field3448 = class48.method1047(var1);
                              field2260 = var0;
                           } else if(var2 == 41) {
                              var9 = class150.method2761(ClientProt.field3221, field2384.field1770);
                              var9.field121.method2300(var1);
                              var9.field121.method2292(var0);
                              var9.field121.method2242(var3);
                              field2384.method2573(var9);
                              field2431 = 0;
                              class265.field3448 = class48.method1047(var1);
                              field2260 = var0;
                           } else if(var2 == 42) {
                              var9 = class150.method2761(ClientProt.field3220, field2384.field1770);
                              var9.field121.method2334(var1);
                              var9.field121.method2292(var0);
                              var9.field121.method2242(var3);
                              field2384.method2573(var9);
                              field2431 = 0;
                              class265.field3448 = class48.method1047(var1);
                              field2260 = var0;
                           } else if(var2 == 43) {
                              if(var8 <= 0) {
                                 return;
                              }

                              var9 = class150.method2761(ClientProt.field3199, field2384.field1770);
                              var9.field121.method2242(var3);
                              var9.field121.method2301(var1);
                              var9.field121.method2242(var0);
                              field2384.method2573(var9);
                              field2431 = 0;
                              class265.field3448 = class48.method1047(var1);
                              field2260 = var0;
                           } else if(var2 == 44) {
                              if(var8 <= 0) {
                                 return;
                              }

                              var16 = field2269[var3];
                              if(var16 != null) {
                                 field2370 = var6;
                                 field2255 = var7;
                                 field2257 = 2;
                                 field2245 = 0;
                                 field2216 = var0;
                                 field2414 = var1;
                                 var10 = class150.method2761(ClientProt.field3203, field2384.field1770);
                                 var10.field121.method2242(var3);
                                 var10.field121.method2283(class96.field1040[82]?1:0);
                                 field2384.method2573(var10);
                              }
                           } else if(var2 == 45) {
                              var16 = field2269[var3];
                              if(var16 != null) {
                                 field2370 = var6;
                                 field2255 = var7;
                                 field2257 = 2;
                                 field2245 = 0;
                                 field2216 = var0;
                                 field2414 = var1;
                                 var10 = class150.method2761(ClientProt.field3222, field2384.field1770);
                                 var10.field121.method2282(class96.field1040[82]?1:0);
                                 var10.field121.method2292(var3);
                                 field2384.method2573(var10);
                              }
                           } else if(var2 == 46) {
                              var16 = field2269[var3];
                              if(var16 != null) {
                                 field2370 = var6;
                                 field2255 = var7;
                                 field2257 = 2;
                                 field2245 = 0;
                                 field2216 = var0;
                                 field2414 = var1;
                                 var10 = class150.method2761(ClientProt.field3218, field2384.field1770);
                                 var10.field121.method2292(var3);
                                 var10.field121.method2288(class96.field1040[82]?1:0);
                                 field2384.method2573(var10);
                              }
                           } else if(var2 == 47) {
                              var16 = field2269[var3];
                              if(var16 != null) {
                                 field2370 = var6;
                                 field2255 = var7;
                                 field2257 = 2;
                                 field2245 = 0;
                                 field2216 = var0;
                                 field2414 = var1;
                                 var10 = class150.method2761(ClientProt.field3207, field2384.field1770);
                                 var10.field121.method2369(var3);
                                 var10.field121.method2283(class96.field1040[82]?1:0);
                                 field2384.method2573(var10);
                              }
                           } else if(var2 == 48) {
                              var16 = field2269[var3];
                              if(var16 != null) {
                                 field2370 = var6;
                                 field2255 = var7;
                                 field2257 = 2;
                                 field2245 = 0;
                                 field2216 = var0;
                                 field2414 = var1;
                                 var10 = class150.method2761(ClientProt.field3239, field2384.field1770);
                                 var10.field121.method2282(class96.field1040[82]?1:0);
                                 var10.field121.method2292(var3);
                                 field2384.method2573(var10);
                              }
                           } else if(var2 == 49) {
                              if(var8 <= 0) {
                                 return;
                              }

                              var16 = field2269[var3];
                              if(var16 != null) {
                                 if(var8 <= 0) {
                                    return;
                                 }

                                 field2370 = var6;
                                 field2255 = var7;
                                 field2257 = 2;
                                 field2245 = 0;
                                 field2216 = var0;
                                 field2414 = var1;
                                 var10 = class150.method2761(ClientProt.field3209, field2384.field1770);
                                 var10.field121.method2292(var3);
                                 var10.field121.method2284(class96.field1040[82]?1:0);
                                 field2384.method2573(var10);
                              }
                           } else if(var2 == 50) {
                              var16 = field2269[var3];
                              if(var16 != null) {
                                 field2370 = var6;
                                 field2255 = var7;
                                 field2257 = 2;
                                 field2245 = 0;
                                 field2216 = var0;
                                 field2414 = var1;
                                 var10 = class150.method2761(ClientProt.field3238, field2384.field1770);
                                 var10000 = var10.field121;
                                 if(class96.field1040[82]) {
                                    if(var8 <= 0) {
                                       return;
                                    }

                                    var10001 = 1;
                                 } else {
                                    var10001 = 0;
                                 }

                                 var10000.method2284(var10001);
                                 var10.field121.method2255(var3);
                                 field2384.method2573(var10);
                              }
                           } else if(var2 == 51) {
                              var16 = field2269[var3];
                              if(var16 != null) {
                                 field2370 = var6;
                                 field2255 = var7;
                                 field2257 = 2;
                                 field2245 = 0;
                                 field2216 = var0;
                                 field2414 = var1;
                                 var10 = class150.method2761(ClientProt.field3206, field2384.field1770);
                                 var10.field121.method2283(class96.field1040[82]?1:0);
                                 var10.field121.method2369(var3);
                                 field2384.method2573(var10);
                              }
                           } else {
                              label861: {
                                 if(var2 != 57) {
                                    if(var2 == 58) {
                                       var17 = class174.method3220(var1, var0);
                                       if(var17 != null) {
                                          var10 = class150.method2761(ClientProt.field3170, field2384.field1770);
                                          var10.field121.method2255(field2309);
                                          var10.field121.method2302(var1);
                                          var10.field121.method2255(field2310);
                                          var10.field121.method2369(var0);
                                          var10.field121.method2334(class28.field281);
                                          var10.field121.method2369(var17.field2676);
                                          field2384.method2573(var10);
                                       }
                                       break label861;
                                    }

                                    if(var2 == 1001) {
                                       field2370 = var6;
                                       field2255 = var7;
                                       field2257 = 2;
                                       field2245 = 0;
                                       field2216 = var0;
                                       field2414 = var1;
                                       var9 = class150.method2761(ClientProt.field3250, field2384.field1770);
                                       var9.field121.method2242(var3);
                                       var9.field121.method2282(class96.field1040[82]?1:0);
                                       var9.field121.method2292(var0 + class229.field3067);
                                       var9.field121.method2369(class35.field360 + var1);
                                       field2384.method2573(var9);
                                       break label861;
                                    }

                                    if(var2 == 1002) {
                                       if(var8 <= 0) {
                                          return;
                                       }

                                       field2370 = var6;
                                       field2255 = var7;
                                       field2257 = 2;
                                       field2245 = 0;
                                       var9 = class150.method2761(ClientProt.field3256, field2384.field1770);
                                       var9.field121.method2292(var3);
                                       field2384.method2573(var9);
                                       break label861;
                                    }

                                    if(var2 == 1003) {
                                       field2370 = var6;
                                       field2255 = var7;
                                       field2257 = 2;
                                       field2245 = 0;
                                       var14 = field2195[var3];
                                       if(var14 != null) {
                                          class315 var18 = var14.field2437;
                                          if(var18.field3886 != null) {
                                             if(var8 <= 0) {
                                                return;
                                             }

                                             var18 = var18.method6171();
                                          }

                                          if(var18 != null) {
                                             if(var8 <= 0) {
                                                return;
                                             }

                                             var11 = class150.method2761(ClientProt.field3186, field2384.field1770);
                                             var11.field121.method2292(var18.field3875);
                                             field2384.method2573(var11);
                                          }
                                       }
                                       break label861;
                                    }

                                    if(var2 == 1004) {
                                       field2370 = var6;
                                       field2255 = var7;
                                       field2257 = 2;
                                       field2245 = 0;
                                       var9 = class150.method2761(ClientProt.field3180, field2384.field1770);
                                       var9.field121.method2255(var3);
                                       field2384.method2573(var9);
                                       break label861;
                                    }

                                    if(var2 == 1005) {
                                       var17 = class48.method1047(var1);
                                       if(var17 != null && var17.field2696[var0] >= 100000) {
                                          ServerProt.method3131(27, "", var17.field2696[var0] + " x " + class164.method3014(var3).field446);
                                       } else {
                                          var10 = class150.method2761(ClientProt.field3180, field2384.field1770);
                                          var10.field121.method2255(var3);
                                          field2384.method2573(var10);
                                       }

                                       field2431 = 0;
                                       class265.field3448 = class48.method1047(var1);
                                       field2260 = var0;
                                       break label861;
                                    }

                                    if(var2 != 1007) {
                                       if(var2 == 1010 || var2 == 1009 || var2 == 1011 || var2 == 1008 || var2 == 1012) {
                                          class199.field2812.method5664(var2, var3, new class58(var0), new class58(var1));
                                       }
                                       break label861;
                                    }

                                    if(var8 <= 0) {
                                       return;
                                    }
                                 }

                                 var17 = class174.method3220(var1, var0);
                                 if(var17 != null) {
                                    class255.method5124(var3, var1, var0, var17.field2676, var5);
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

      if(field2306 != 0) {
         field2306 = 0;
         class230.method4617(class48.method1047(class314.field3853));
      }

      if(field2308) {
         class103.method1853();
      }

      if(class265.field3448 != null && field2431 == 0) {
         if(var8 <= 0) {
            return;
         }

         class230.method4617(class265.field3448);
      }

   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void onMenuOptionsChanged(int var0) {
      int var1 = oldMenuEntryCount;
      int var2 = class302.field3755.getMenuOptionCount();
      oldMenuEntryCount = var2;
      if(var2 == var1 + 1) {
         MenuEntryAdded var3 = new MenuEntryAdded(class302.field3755.getMenuOptions()[var2 - 1], class302.field3755.getMenuTargets()[var2 - 1], class302.field3755.getMenuTypes()[var2 - 1], class302.field3755.getMenuIdentifiers()[var2 - 1], class302.field3755.getMenuActionParams0()[var2 - 1], class302.field3755.getMenuActionParams1()[var2 - 1]);
         class302.field3755.getCallbacks().post(var3);
      }

   }

   public static void copy$raster2d7(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if(var0 + var2 >= 0 && var3 + var1 >= 0) {
         if(var0 < class173.field2119 && var1 < class173.field2120) {
            int var9 = 0;
            int var10 = 0;
            if(var0 < 0) {
               var9 -= var0;
               var2 += var0;
            }

            if(var1 < 0) {
               var10 -= var1;
               var3 += var1;
            }

            if(var0 + var2 > class173.field2119) {
               var2 = class173.field2119 - var0;
            }

            if(var3 + var1 > class173.field2120) {
               var3 = class173.field2120 - var1;
            }

            int var11 = var6.length / var7;
            int var12 = class173.field2119 - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if(!var8 || var13 == 255 && var14 == 255) {
               var15 = var0 + var9 + (var10 + var1) * class173.field2119;

               for(var16 = var10 + var1; var16 < var3 + var10 + var1; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     if(var6[var19 + var18 * var7] != 0) {
                        class173.field2121[var15++] = var5;
                     } else {
                        class173.field2121[var15++] = var4;
                     }
                  }

                  var15 += var12;
               }
            } else {
               var15 = var0 + var9 + (var10 + var1) * class173.field2119;

               for(var16 = var10 + var1; var16 < var3 + var10 + var1; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     int var20 = var4;
                     if(var6[var19 + var18 * var7] != 0) {
                        var20 = var5;
                     }

                     int var21 = var20 >>> 24;
                     int var22 = 255 - var21;
                     int var23 = class173.field2121[var15];
                     int var24 = (var21 * (var20 & 65280) + var22 * (var23 & 65280) & 16711680) + ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936) >> 8;
                     class173.field2121[var15++] = var24;
                  }

                  var15 += var12;
               }
            }

         }
      }
   }

   public static int rl$rot1(int var0, int var1, int var2, int var3) {
      return var0 * var2 + var3 * var1 >> 16;
   }

   public static int rl$rot2(int var0, int var1, int var2, int var3) {
      return var2 * var1 - var3 * var0 >> 16;
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
            RSHashTable var14 = class302.field3755.getComponentTable();
            WidgetNode var15 = (WidgetNode)var14.get((long)var13.getId());
            if(var15 != null) {
               int var16 = var13.getId();
               int var17 = var15.getId();
               RSWidget[] var18 = class302.field3755.getWidgets()[var17];
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

   public static int rl$rot3(int var0, int var1, int var2, int var3) {
      return var0 * var2 - var3 * var1 >> 16;
   }

   public static int rl$rot4(int var0, int var1, int var2, int var3) {
      return var2 * var1 + var3 * var0 >> 16;
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void itemPressedDurationChanged(int var0) {
      if(class302.field3755.getItemPressedDuration() > 0) {
         ++itemPressedDurationBuffer;
         if(itemPressedDurationBuffer >= inventoryDragDelay) {
            class302.field3755.setItemPressedDuration(itemPressedDurationBuffer);
         } else {
            class302.field3755.setItemPressedDuration(0);
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
            int var1 = class302.field3755.getStringStackSize();
            String[] var10000 = class302.field3755.getStringStack();
            --var1;
            String var2 = var10000[var1];
            class302.field3755.setStringStackSize(var1);
            if("debug".equals(var2)) {
               int var3 = class302.field3755.getIntStackSize();
               var10000 = class302.field3755.getStringStack();
               --var1;
               String var4 = var10000[var1];
               StringBuffer var5 = new StringBuffer();
               Matcher var6 = Pattern.compile("%(.)").matcher(var4);

               while(var6.find()) {
                  var6.appendReplacement(var5, "");
                  switch(var6.group(1).charAt(0)) {
                  case 'd':
                  case 'i':
                     int[] var8 = class302.field3755.getIntStack();
                     --var3;
                     var5.append(var8[var3]);
                     break;
                  case 's':
                     String[] var10001 = class302.field3755.getStringStack();
                     --var1;
                     var5.append(var10001[var1]);
                     break;
                  default:
                     var5.append(var6.group(0)).append("=unknown");
                  }
               }

               var6.appendTail(var5);
               class302.field3755.getLogger().debug(var5.toString());
               class302.field3755.setStringStackSize(var1);
               class302.field3755.setIntStackSize(var3);
               return true;
            } else {
               ScriptCallbackEvent var7 = new ScriptCallbackEvent();
               var7.setScript(currentScript);
               var7.setEventName(var2);
               class302.field3755.getCallbacks().post(var7);
               return true;
            }
         }
      } else {
         return false;
      }
   }

   public static void drawAlpha(int[] var0, int var1, int var2, int var3, int var4) {
      if(class302.field3755.isGpu() && var0 == class302.field3755.getBufferProvider().getPixels()) {
         if(var4 != 0) {
            int var5 = var0[var1];
            if((var5 & -16777216) != 0 && var4 != 255) {
               if((var5 & -16777216) == -16777216) {
                  var0[var1] = var2 | -16777216;
               } else {
                  int var6 = (255 - var4) * (var5 >>> 24) >>> 8;
                  int var7 = var6 + var4;
                  int var8 = (var4 << 8) / var7;
                  int var9 = (var6 << 8) / var7;
                  int var10 = ((var5 & 16711935) * var9 + (var3 & 16711935) * var8 & -16711936 | var8 * (var3 & 65280) + var9 * (var5 & 65280) & 16711680) >>> 8;
                  var0[var1] = var10 | var7 << 24;
               }
            } else {
               var0[var1] = var3 & 16777215 | var4 << 24;
            }
         }
      } else {
         var0[var1] = var2;
      }
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void resizeChanged(int var0) {
      boolean var1 = class302.field3755.isResized();
      if(var1 != oldIsResized) {
         ResizeableChanged var2 = new ResizeableChanged();
         var2.setResized(var1);
         class302.field3755.getCallbacks().post(var2);
         oldIsResized = var1;
      }

   }

   public static void settingsChanged(int var0) {
      VarbitChanged var1 = new VarbitChanged();
      class302.field3755.getCallbacks().post(var1);
   }

   public static void copy$runWidgetOnLoadListener(int var0, int var1) {
      if(var0 == -1) {
         if(var1 > -1502856382) {
            ;
         }
      } else if(!class80.method1596(var0)) {
         if(var1 > -1502856382) {
            ;
         }
      } else {
         class187[] var2 = class187.field2547[var0];

         for(int var3 = 0; var3 < var2.length; ++var3) {
            class187 var4 = var2[var3];
            if(var4.field2576 != null) {
               class194 var5 = new class194();
               var5.field2759 = var4;
               var5.field2765 = var4.field2576;
               class259.method5166(var5, 5000000, (byte)83);
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
      var1.setDraggingWidget(class302.field3755.isDraggingWidget());
      class302.field3755.getCallbacks().post(var1);
   }

   public static void updateNpcs(boolean var0, PacketBuffer var1) {
      class302.field3755.getCallbacks().updateNpcs();
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void onCameraPitchTargetChanged(int var0) {
      int var1 = class302.field3755.getCameraPitchTarget();
      int var2 = var1;
      if(pitchRelaxEnabled && lastPitchTarget > 383 && var1 == 383) {
         var2 = lastPitchTarget;
         if(var2 > 512) {
            var2 = 512;
         }

         class302.field3755.setCameraPitchTarget(var2);
      }

      lastPitchTarget = var2;
   }

   public static void cachedNPCsChanged(int var0) {
      RSNPC[] var1 = class302.field3755.getCachedNPCs();
      if(var0 >= 0 && var0 < var1.length) {
         RSNPC var2 = var1[var0];
         if(var2 != null) {
            var2.setIndex(var0);
            class302.field3755.getCallbacks().postDeferred(new NpcSpawned(var2));
         }

      }
   }

   public static void cachedPlayersChanged(int var0) {
      RSPlayer[] var1 = class302.field3755.getCachedPlayers();
      if(var0 >= 0 && var0 < var1.length) {
         RSPlayer var2 = var1[var0];
         RSPlayer var3 = oldPlayers[var0];
         oldPlayers[var0] = var2;
         if(var3 != null) {
            class302.field3755.getCallbacks().post(new PlayerDespawned(var3));
         }

         if(var2 != null) {
            class302.field3755.getCallbacks().postDeferred(new PlayerSpawned(var2));
         }

      }
   }

   public static void playerOptionsChanged(int var0) {
      MenuAction[] var1 = new MenuAction[]{MenuAction.PLAYER_FIRST_OPTION, MenuAction.PLAYER_SECOND_OPTION, MenuAction.PLAYER_THIRD_OPTION, MenuAction.PLAYER_FOURTH_OPTION, MenuAction.PLAYER_FIFTH_OPTION, MenuAction.PLAYER_SIXTH_OPTION, MenuAction.PLAYER_SEVENTH_OPTION, MenuAction.PLAYER_EIGTH_OPTION};
      if(var0 >= 0 && var0 < var1.length) {
         MenuAction var2 = var1[var0];
         class302.field3755.getPlayerMenuTypes()[var0] = var2.getId();
      }

      PlayerMenuOptionsChanged var3 = new PlayerMenuOptionsChanged();
      var3.setIndex(var0);
      class302.field3755.getCallbacks().post(var3);
   }

   public static void copy$drawGradientAlpha(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = 65536 / var3;
         if(var0 < class173.field2124) {
            var2 -= class173.field2124 - var0;
            var0 = class173.field2124;
         }

         if(var1 < class173.field2122) {
            var8 += (class173.field2122 - var1) * var9;
            var3 -= class173.field2122 - var1;
            var1 = class173.field2122;
         }

         if(var0 + var2 > class173.field2125) {
            var2 = class173.field2125 - var0;
         }

         if(var3 + var1 > class173.field2123) {
            var3 = class173.field2123 - var1;
         }

         int var10 = class173.field2119 - var2;
         int var11 = class173.field2119 * var1 + var0;

         for(int var12 = -var3; var12 < 0; ++var12) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (var13 * var6 + var14 * var7 & 65280) >>> 8;
            if(var15 == 0) {
               var11 += class173.field2119;
               var8 += var9;
            } else {
               int var16 = (var13 * (var4 & 65280) + var14 * (var5 & 65280) & 16711680) + (var13 * (var4 & 16711935) + var14 * (var5 & 16711935) & -16711936) >>> 8;
               int var17 = 255 - var15;
               int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + (var15 * (var16 & 65280) >> 8 & 65280);

               for(int var19 = -var2; var19 < 0; ++var19) {
                  int var20 = class173.field2121[var11];
                  if(var20 == 0) {
                     class173.field2121[var11++] = var18;
                  } else {
                     var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + (var17 * (var20 & 65280) >> 8 & 65280);
                     class173.field2121[var11++] = var18 + var20;
                  }
               }

               var11 += var10;
               var8 += var9;
            }
         }

      }
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void onUsernameChanged(int var0) {
      class302.field3755.getCallbacks().post(new UsernameChanged());
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void onCameraPitchChanged(int var0) {
      int var1 = class302.field3755.getCameraPitch();
      int var2 = var1;
      if(pitchRelaxEnabled && lastPitch > 383 && var1 == 383) {
         var2 = lastPitch;
         if(var2 > 512) {
            var2 = 512;
         }

         class302.field3755.setCameraPitch(var2);
      }

      lastPitch = var2;
   }

   public static void experiencedChanged(int var0) {
      ExperienceChanged var1 = new ExperienceChanged();
      Skill[] var2 = Skill.values();
      if(var0 < var2.length - 1) {
         Skill var3 = var2[var0];
         var1.setSkill(var3);
         class302.field3755.getCallbacks().post(var1);
      }

   }

   public static void boostedSkillLevelsChanged(int var0) {
      Skill[] var1 = Skill.values();
      if(var0 >= 0 && var0 < var1.length - 1) {
         Skill var2 = var1[var0];
         BoostedLevelChanged var3 = new BoostedLevelChanged();
         var3.setSkill(var2);
         class302.field3755.getCallbacks().post(var3);
      }

   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void clanMemberManagerChanged(int var0) {
      class302.field3755.getCallbacks().post(new ClanChanged(class302.field3755.getClanMemberManager() != null));
   }

   public static void onGrandExchangeOffersChanged(int var0) {
      if(var0 != -1) {
         RSGrandExchangeOffer var1 = class302.field3755.getGrandExchangeOffers()[var0];
         if(var1 != null) {
            GrandExchangeOfferChanged var2 = new GrandExchangeOfferChanged();
            var2.setOffer(var1);
            var2.setSlot(var0);
            class302.field3755.getCallbacks().post(var2);
         }
      }
   }

   private static void rl$$clinit() {
      spriteOverrides = new HashMap();
      widgetSpriteOverrides = new HashMap();
   }

   private static void rl$$clinit1() {
      $assertionsDisabled = !client.class.desiredAssertionStatus();
   }

   private static void rl$$clinit2() {
      rl$modelViewportXs = new int[4700];
      rl$modelViewportYs = new int[4700];
   }

   private static void rl$$clinit3() {
      $assertionsDisabled = !client.class.desiredAssertionStatus();
      oldPlayers = new class199[2048];
   }

   private static void rl$$clinit4() {
      $assertionsDisabled = !client.class.desiredAssertionStatus();
   }

   private static void rl$$clinit5() {
      pitchRelaxEnabled = false;
      lastPitch = 128;
      lastPitchTarget = 128;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-758986826"
   )
   static int method3658(int var0, class296 var1, boolean var2) {
      class187 var3;
      if(var0 >= 2000) {
         var0 -= 1000;
         var3 = class48.method1047(class249.field3312[--class308.field3811]);
      } else {
         var3 = var2?class3.field36:class284.field3565;
      }

      String var4 = class249.field3313[--class103.field1146];
      int[] var5 = null;
      if(var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
         int var6 = class249.field3312[--class308.field3811];
         if(var6 > 0) {
            for(var5 = new int[var6]; var6-- > 0; var5[var6] = class249.field3312[--class308.field3811]) {
               ;
            }
         }

         var4 = var4.substring(0, var4.length() - 1);
      }

      Object[] var8 = new Object[var4.length() + 1];

      int var7;
      for(var7 = var8.length - 1; var7 >= 1; --var7) {
         if(var4.charAt(var7 - 1) == 's') {
            var8[var7] = class249.field3313[--class103.field1146];
         } else {
            var8[var7] = new Integer(class249.field3312[--class308.field3811]);
         }
      }

      var7 = class249.field3312[--class308.field3811];
      if(var7 != -1) {
         var8[0] = new Integer(var7);
      } else {
         var8 = null;
      }

      if(var0 == 1400) {
         var3.field2643 = var8;
      } else if(var0 == 1401) {
         var3.field2649 = var8;
      } else if(var0 == 1402) {
         var3.field2556 = var8;
      } else if(var0 == 1403) {
         var3.field2650 = var8;
      } else if(var0 == 1404) {
         var3.field2648 = var8;
      } else if(var0 == 1405) {
         var3.field2653 = var8;
      } else if(var0 == 1406) {
         var3.field2656 = var8;
      } else if(var0 == 1407) {
         var3.field2657 = var8;
         var3.field2658 = var5;
      } else if(var0 == 1408) {
         var3.field2684 = var8;
      } else if(var0 == 1409) {
         var3.field2664 = var8;
      } else if(var0 == 1410) {
         var3.field2654 = var8;
      } else if(var0 == 1411) {
         var3.field2668 = var8;
      } else if(var0 == 1412) {
         var3.field2622 = var8;
      } else if(var0 == 1414) {
         var3.field2659 = var8;
         var3.field2660 = var5;
      } else if(var0 == 1415) {
         var3.field2661 = var8;
         var3.field2638 = var5;
      } else if(var0 == 1416) {
         var3.field2680 = var8;
      } else if(var0 == 1417) {
         var3.field2665 = var8;
      } else if(var0 == 1418) {
         var3.field2666 = var8;
      } else if(var0 == 1419) {
         var3.field2589 = var8;
      } else if(var0 == 1420) {
         var3.field2603 = var8;
      } else if(var0 == 1421) {
         var3.field2590 = var8;
      } else if(var0 == 1422) {
         var3.field2651 = var8;
      } else if(var0 == 1423) {
         var3.field2609 = var8;
      } else if(var0 == 1424) {
         var3.field2672 = var8;
      } else if(var0 == 1425) {
         var3.field2674 = var8;
      } else if(var0 == 1426) {
         var3.field2675 = var8;
      } else {
         if(var0 != 1427) {
            return 2;
         }

         var3.field2673 = var8;
      }

      var3.field2644 = true;
      return 1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "-80"
   )
   static int method3659(int var0, int var1) {
      class231 var2 = (class231)class231.field3079.method1776((long)var0);
      if(var2 == null) {
         return 0;
      } else if(var1 == -1) {
         return 0;
      } else {
         int var3 = 0;

         for(int var4 = 0; var4 < var2.field3080.length; ++var4) {
            if(var2.field3076[var4] == var1) {
               var3 += var2.field3080[var4];
            }
         }

         return var3;
      }
   }

   @Override
   public void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
      this.menuAction(var0, var1, var2, var3, var4, var5, var6, var7);
   }
}
