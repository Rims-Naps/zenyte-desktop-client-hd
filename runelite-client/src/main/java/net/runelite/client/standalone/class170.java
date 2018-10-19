package net.runelite.client.standalone;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
public class class170 {
   @ObfuscatedName("dx")
   @ObfuscatedSignature(
      signature = "Lim;"
   )
   static class108 field1577;
   @ObfuscatedName("ku")
   @ObfuscatedGetter(
      intValue = -498372521
   )
   static int field1571;
   @ObfuscatedName("e")
   public static Comparator field1573;
   @ObfuscatedName("l")
   public static Comparator field1570;
   @ObfuscatedName("s")
   public static Comparator field1572;
   @ObfuscatedName("ev")
   static SecureRandom field1574;
   @ObfuscatedName("w")
   public static Comparator field1575;
   @ObfuscatedName("f")
   public final List field1578;

   static {
      field1570 = new class128();
      new class8();
      field1575 = new class192();
      field1572 = new class139();
      field1573 = new class188();
   }

   @ObfuscatedSignature(
      signature = "(Lgm;Z)V",
      garbageValue = "1"
   )
   public class170(Buffer var1, boolean var2) {
      int var3 = var1.readUnsignedShort();
      boolean var4 = var1.readUnsignedByte() == 1;
      byte var5;
      if(var4) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      int var6 = var1.readUnsignedShort();
      this.field1578 = new ArrayList(var6);

      for(int var7 = 0; var7 < var6; ++var7) {
         this.field1578.add(new class230(var1, var5, var3));
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/util/Comparator;ZI)V",
      garbageValue = "-84030867"
   )
   public void method2882(Comparator var1, boolean var2) {
      if(var2) {
         Collections.sort(this.field1578, var1);
      } else {
         Collections.sort(this.field1578, Collections.reverseOrder(var1));
      }

   }
}
