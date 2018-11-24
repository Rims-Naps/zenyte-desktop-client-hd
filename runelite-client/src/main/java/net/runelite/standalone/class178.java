package net.runelite.standalone;

import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
public class class178 {
   @ObfuscatedName("l")
   static final BigInteger field2447;
   @ObfuscatedName("f")
   static final BigInteger field2449;
   @ObfuscatedName("gi")
   static byte[][] field2452;

   static {
      field2449 = new BigInteger("10001", 16);
      field2447 = new BigInteger("147926487101535673874481304996273029446680384572900776356741718541029295833056728580689225626839331109889051098340610277259374021239154392825073133579283354307195571644831952411288119469259428730829525599875738883869187086987379074879572536962975657340434949610404032466451957196559061637505086995393354666349");
   }

   @ObfuscatedName("s")
   public static int method3682(long var0) {
      return (int)(var0 >>> 17 & 4294967295L);
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(IB)Let;",
      garbageValue = "-49"
   )
   static class202 method3683(int var0) {
      class202 var1 = (class202)class312.field3833.method1813((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         var1 = class17.method366(class312.field3839, class312.field3831, var0, false);
         if(var1 != null) {
            class312.field3833.method1820(var1, (long)var0);
         }

         return var1;
      }
   }
}
