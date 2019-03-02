package net.runelite.standalone;

import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
public final class PendingSpawn extends Node {
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -415095377
   )
   int field935;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1356360457
   )
   int type;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1473904323
   )
   int x;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1710743389
   )
   int id;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1920385997
   )
   int y;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -841286093
   )
   int hitpoints;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1284652045
   )
   int delay;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1965909109
   )
   int field924;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -96414903
   )
   int orientation;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1115768889
   )
   int field923;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1158428137
   )
   int field931;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1360644167
   )
   int level;

   PendingSpawn() {
      this.delay = 0;
      this.hitpoints = -1;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(ILcx;ZI)I",
      garbageValue = "1607736663"
   )
   static int method5556(int var0, class106 var1, boolean var2) {
      ComponentType var3 = var2?class113.field75:class48.field1080;
      if(var0 == 1800) {
         class48.intStack[++class228.intStackSize - 1] = class192.method3781(class101.method1704(var3));
         return 1;
      } else if(var0 != 1801) {
         if(var0 == 1802) {
            if(var3.opBase == null) {
               class48.scriptStringStack[++class48.scriptStringStackSize - 1] = "";
            } else {
               class48.scriptStringStack[++class48.scriptStringStackSize - 1] = var3.opBase;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = class48.intStack[--class228.intStackSize];
         --var4;
         if(var3.ops != null && var4 < var3.ops.length && var3.ops[var4] != null) {
            class48.scriptStringStack[++class48.scriptStringStackSize - 1] = var3.ops[var4];
         } else {
            class48.scriptStringStack[++class48.scriptStringStackSize - 1] = "";
         }

         return 1;
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)[Lfz;",
      garbageValue = "816105871"
   )
   public static ServerProt[] method5554() {
      return new ServerProt[]{ServerProt.field2178, ServerProt.field2159, ServerProt.field2119, ServerProt.field2187, ServerProt.field2121, ServerProt.field2122, ServerProt.field2123, ServerProt.field2199, ServerProt.field2125, ServerProt.field2126, ServerProt.field2127, ServerProt.field2128, ServerProt.field2129, ServerProt.field2130, ServerProt.field2118, ServerProt.field2132, ServerProt.field2133, ServerProt.field2134, ServerProt.field2169, ServerProt.field2136, ServerProt.field2124, ServerProt.field2165, ServerProt.field2139, ServerProt.field2140, ServerProt.field2141, ServerProt.field2198, ServerProt.field2143, ServerProt.field2181, ServerProt.field2145, ServerProt.field2146, ServerProt.field2147, ServerProt.field2148, ServerProt.field2149, ServerProt.field2175, ServerProt.field2144, ServerProt.field2152, ServerProt.field2153, ServerProt.field2200, ServerProt.field2155, ServerProt.field2205, ServerProt.field2157, ServerProt.field2158, ServerProt.field2203, ServerProt.field2156, ServerProt.field2161, ServerProt.field2162, ServerProt.field2163, ServerProt.field2164, ServerProt.field2195, ServerProt.field2194, ServerProt.field2167, ServerProt.field2168, ServerProt.field2190, ServerProt.field2170, ServerProt.field2171, ServerProt.field2160, ServerProt.field2173, ServerProt.field2174, ServerProt.field2193, ServerProt.field2176, ServerProt.field2177, ServerProt.field2138, ServerProt.field2179, ServerProt.field2180, ServerProt.field2172, ServerProt.field2182, ServerProt.field2183, ServerProt.field2184, ServerProt.field2185, ServerProt.field2186, ServerProt.field2196, ServerProt.field2188, ServerProt.field2189, ServerProt.field2154, ServerProt.field2191, ServerProt.field2192, ServerProt.field2120, ServerProt.field2137, ServerProt.field2131, ServerProt.field2201, ServerProt.field2197, ServerProt.field2135, ServerProt.field2142, ServerProt.field2166, ServerProt.field2204, ServerProt.field3000};
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Ljava/net/Socket;III)Lfh;",
      garbageValue = "-1134752844"
   )
   public static class19 method5555(Socket var0, int var1, int var2) throws IOException {
      return new class139(var0, var1, var2);
   }
}
