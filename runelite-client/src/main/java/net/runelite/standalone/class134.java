package net.runelite.standalone;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
public class class134 extends class161 {
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lka;"
   )
   public class158 field1741;
   @ObfuscatedName("e")
   public short field1740;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -541591571
   )
   public int field1742;

   @ObfuscatedSignature(
      signature = "(Lka;I)V"
   )
   class134(class158 var1, int var2) {
      this.field1742 = (int)(class321.method6252() / 1000L);
      this.field1741 = var1;
      this.field1740 = (short)var2;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-1610436519"
   )
   public static void method2561(boolean var0) {
      if(class239.field3135 != null) {
         try {
            Buffer var1 = new Buffer(4);
            var1.method2288(var0?2:3);
            var1.method2412(0);
            class239.field3135.vmethod2791(var1.field1694, 0, 4);
         } catch (IOException var4) {
            try {
               class239.field3135.vmethod2787();
            } catch (Exception var3) {
               ;
            }

            ++class239.field3141;
            class239.field3135 = null;
         }

      }
   }
}
