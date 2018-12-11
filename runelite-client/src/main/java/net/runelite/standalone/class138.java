package net.runelite.standalone;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
public class class138 {
   @ObfuscatedName("ku")
   @ObfuscatedGetter(
      intValue = -498372521
   )
   static int field1776;
   @ObfuscatedName("dx")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class6 spritesIndex;
   @ObfuscatedName("ev")
   static SecureRandom field1779;
   @ObfuscatedName("l")
   public static Comparator field1775;
   @ObfuscatedName("s")
   public static Comparator field1777;
   @ObfuscatedName("e")
   public static Comparator field1778;
   @ObfuscatedName("w")
   public static Comparator field1780;
   @ObfuscatedName("f")
   public final List field1783;

   static {
      field1775 = new class95();
      new class147();
      field1780 = new class225();
      field1777 = new class126();
      field1778 = new class142();
   }

   @ObfuscatedSignature(
      signature = "(Lgm;Z)V",
      garbageValue = "1"
   )
   public class138(Buffer var1, boolean var2) {
      int var3 = var1.readUnsignedShort();
      boolean var4 = var1.readUnsignedByte() == 1;
      byte var5;
      if(var4) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      int var6 = var1.readUnsignedShort();
      this.field1783 = new ArrayList(var6);

      for(int var7 = 0; var7 < var6; ++var7) {
         this.field1783.add(new class317(var1, var5, var3));
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/util/Comparator;ZI)V",
      garbageValue = "-84030867"
   )
   public void method2597(Comparator var1, boolean var2) {
      if(var2) {
         Collections.sort(this.field1783, var1);
      } else {
         Collections.sort(this.field1783, Collections.reverseOrder(var1));
      }

   }
}
