package net.runelite.standalone;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSClassInfo;

@ObfuscatedName("lx")
public class class121 extends class197 implements RSClassInfo {
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "[Lle;"
   )
   static class303[] field1651;
   @ObfuscatedName("ea")
   @ObfuscatedGetter(
      intValue = 695627089
   )
   static int field1652;
   @ObfuscatedName("p")
   byte[][][] field1650;
   @ObfuscatedName("c")
   Method[] field1649;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 233747665
   )
   int field1648;
   @ObfuscatedName("s")
   int[] field1645;
   @ObfuscatedName("f")
   int[] field1643;
   @ObfuscatedName("a")
   Field[] field1644;
   @ObfuscatedName("e")
   int[] field1646;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -266708631
   )
   int field1647;

   public Field[] getFields() {
      return this.field1644;
   }

   public Method[] getMethods() {
      return this.field1649;
   }

   public byte[][][] getArgs() {
      return this.field1650;
   }
}
