package net.runelite.client.standalone;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
public class class70 extends class212 {
   @ObfuscatedName("e")
   public short field648;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lka;"
   )
   public class49 field649;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -541591571
   )
   public int field650;

   @ObfuscatedSignature(
      signature = "(Lka;I)V"
   )
   class70(class49 var1, int var2) {
      this.field650 = (int)(class234.method4170() / 1000L);
      this.field649 = var1;
      this.field648 = (short)var2;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-1610436519"
   )
   public static void method1170(boolean var0) {
      if(class270.field2966 != null) {
         try {
            Buffer var1 = new Buffer(4);
            var1.writeByte(var0?2:3);
            var1.writeMedium(0);
            class270.field2966.vmethod5520(var1.field1074, 0, 4);
         } catch (IOException var4) {
            try {
               class270.field2966.vmethod5521();
            } catch (Exception var3) {
               ;
            }

            ++class270.field2972;
            class270.field2966 = null;
         }

      }
   }
}
