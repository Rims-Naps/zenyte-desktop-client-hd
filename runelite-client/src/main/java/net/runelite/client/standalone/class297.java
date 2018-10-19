package net.runelite.client.standalone;

import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
public class class297 {
   @ObfuscatedName("f")
   static final Map field3194;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -685465319
   )
   static int field3197;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lga;"
   )
   static final class46 field3193;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -511422791
   )
   static int field3196;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lhf;"
   )
   static final class316 field3195;

   static {
      field3194 = new HashMap();
      field3193 = new class46(1024);
      field3195 = new class316();
      field3196 = 0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([Lgo;II)Lgo;",
      garbageValue = "-737466097"
   )
   public static class91 method5176(class91[] var0, int var1) {
      class91[] var2 = var0;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class91 var4 = var2[var3];
         if(var1 == var4.vmethod5937()) {
            return var4;
         }
      }

      return null;
   }
}
