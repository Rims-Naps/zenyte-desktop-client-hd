package net.runelite.client.standalone;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSClassInfo;

@ObfuscatedName("lx")
public class class306 extends class76 implements RSClassInfo {
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "[Lle;"
   )
   static class32[] field3274;
   @ObfuscatedName("ea")
   @ObfuscatedGetter(
      intValue = 695627089
   )
   static int field3275;
   @ObfuscatedName("f")
   int[] field3266;
   @ObfuscatedName("p")
   byte[][][] field3273;
   @ObfuscatedName("c")
   Method[] field3272;
   @ObfuscatedName("e")
   int[] field3269;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 233747665
   )
   int field3271;
   @ObfuscatedName("s")
   int[] field3268;
   @ObfuscatedName("a")
   Field[] field3267;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -266708631
   )
   int field3270;

   public Field[] getFields() {
      return this.field3267;
   }

   public Method[] getMethods() {
      return this.field3272;
   }

   public byte[][][] getArgs() {
      return this.field3273;
   }
}
