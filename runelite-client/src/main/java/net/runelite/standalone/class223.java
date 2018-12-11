package net.runelite.standalone;

import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
public class class223 {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   Js5Index field3004;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   Js5Index field3006;
   @ObfuscatedName("w")
   HashMap field3005;

   @ObfuscatedSignature(
      signature = "(Lik;Lik;)V"
   )
   public class223(Js5Index var1, Js5Index var2) {
      this.field3006 = var1;
      this.field3004 = var2;
      this.field3005 = new HashMap();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([Lkq;I)Ljava/util/HashMap;",
      garbageValue = "757214"
   )
   public HashMap method4521(class74[] var1) {
      HashMap var2 = new HashMap();
      class74[] var3 = var1;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         class74 var5 = var3[var4];
         if(this.field3005.containsKey(var5)) {
            var2.put(var5, this.field3005.get(var5));
         } else {
            Js5Index var7 = this.field3006;
            Js5Index var8 = this.field3004;
            String var9 = var5.field843;
            int var10 = var7.getGroupId(var9);
            int var11 = var7.getChild(var10, "");
            class299 var6 = class314.method6147(var7, var8, var10, var11);
            if(var6 != null) {
               this.field3005.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }
}
