package net.runelite.client.standalone;

import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
public class class166 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   class148 field1537;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   class148 field1535;
   @ObfuscatedName("w")
   HashMap field1536;

   @ObfuscatedSignature(
      signature = "(Lik;Lik;)V"
   )
   public class166(class148 var1, class148 var2) {
      this.field1537 = var1;
      this.field1535 = var2;
      this.field1536 = new HashMap();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([Lkq;I)Ljava/util/HashMap;",
      garbageValue = "757214"
   )
   public HashMap method2843(class86[] var1) {
      HashMap var2 = new HashMap();
      class86[] var3 = var1;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         class86 var5 = var3[var4];
         if(this.field1536.containsKey(var5)) {
            var2.put(var5, this.field1536.get(var5));
         } else {
            class148 var7 = this.field1537;
            class148 var8 = this.field1535;
            String var9 = var5.field781;
            int var10 = var7.method2602(var9);
            int var11 = var7.method2581(var10, "");
            class277 var6 = class7.method92(var7, var8, var10, var11);
            if(var6 != null) {
               this.field1536.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }
}
