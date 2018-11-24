package net.runelite.standalone;

import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
public class class38 {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lga;"
   )
   static final class235 field366;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -511422791
   )
   static int field369;
   @ObfuscatedName("f")
   static final Map field367;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -685465319
   )
   static int field370;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lhf;"
   )
   static final class120 field368;

   static {
      field367 = new HashMap();
      field366 = new class235(1024);
      field368 = new class120();
      field369 = 0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([Lgo;II)Lgo;",
      garbageValue = "-737466097"
   )
   public static class26 method678(class26[] var0, int var1) {
      class26[] var2 = var0;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class26 var4 = var2[var3];
         if(var1 == var4.vmethod6234()) {
            return var4;
         }
      }

      return null;
   }
}
