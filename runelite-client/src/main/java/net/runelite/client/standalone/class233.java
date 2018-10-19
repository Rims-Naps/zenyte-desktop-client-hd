package net.runelite.client.standalone;

import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
public class class233 {
   @ObfuscatedName("f")
   static final BigInteger field2294;
   @ObfuscatedName("l")
   static final BigInteger field2292;
   @ObfuscatedName("gi")
   static byte[][] field2297;

   static {
      field2294 = new BigInteger("10001", 16);
      field2292 = new BigInteger("147926487101535673874481304996273029446680384572900776356741718541029295833056728580689225626839331109889051098340610277259374021239154392825073133579283354307195571644831952411288119469259428730829525599875738883869187086987379074879572536962975657340434949610404032466451957196559061637505086995393354666349");
   }

   @ObfuscatedName("s")
   public static int method4163(long var0) {
      return (int)(var0 >>> 17 & 4294967295L);
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(IB)Let;",
      garbageValue = "-113"
   )
   static class295 method4164(int var0) {
      class295 var1 = (class295)class321.field3415.method2268((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         var1 = class140.method2523(class321.field3421, class321.field3413, var0, false);
         if(var1 != null) {
            class321.field3415.method2275(var1, (long)var0);
         }

         return var1;
      }
   }
}
