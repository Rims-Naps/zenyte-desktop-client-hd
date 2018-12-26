package net.runelite.standalone;

import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
public class class79 {
   @ObfuscatedName("r")
   static final BigInteger RSA_MODULUS;
   @ObfuscatedName("g")
   static final BigInteger RSA_EXPONENT;

   static {
      RSA_EXPONENT = new BigInteger("10001", 16);
      RSA_MODULUS = new BigInteger("147926487101535673874481304996273029446680384572900776356741718541029295833056728580689225626839331109889051098340610277259374021239154392825073133579283354307195571644831952411288119469259428730829525599875738883869187086987379074879572536962975657340434949610404032466451957196559061637505086995393354666349");
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(IB)Ljk;",
      garbageValue = "99"
   )
   public static Varbit method1158(int var0) {
      Varbit var1 = (Varbit)Varbit.varbits.method951((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = Varbit.varbit_ref.method1516(14, var0, 1789634852);
         var1 = new Varbit();
         if(var2 != null) {
            var1.method3111(new Buffer(var2));
         }

         Varbit.varbits.method957(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-533880111"
   )
   static int method1159() {
      return 11;
   }
}
