package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
public class class80 extends class236 {
   @ObfuscatedName("f")
   final boolean field726;

   public class80(boolean var1) {
      this.field726 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lkj;Lkj;I)I",
      garbageValue = "833771244"
   )
   int method1216(class305 var1, class305 var2) {
      if(var1.field3265 != 0) {
         if(var2.field3265 == 0) {
            return this.field726?-1:1;
         }
      } else if(var2.field3265 != 0) {
         return this.field726?1:-1;
      }

      return this.method4178(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method1216((class305)var1, (class305)var2);
   }

   @ObfuscatedName("gg")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "2"
   )
   static final void method1221() {
      for(class274 var0 = (class274)client.field3861.method5604(); var0 != null; var0 = (class274)client.field3861.method5606()) {
         if(var0.field2999 == -1) {
            var0.field3000 = 0;
            class135.method2508(var0);
         } else {
            var0.method1186();
         }
      }

   }

   @ObfuscatedName("ep")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-183074190"
   )
   static final void method1219() {
      client.field3963.method2254();
      class163.method2784();
      class86.method1254();
      class325.method5740();
      class172.field1612.method2271();
      class172.field1599.method2271();
      class172.field1594.method2271();
      class172.field1595.method2271();
      class244.method4472();
      class120.field1114.method2271();
      class120.field1094.method2271();
      class120.field1122.method2271();
      class67.method1153();
      class211.method3740();
      class213.field2060.method2271();
      class309.field3284.method2271();
      class21.method215();
      class24.method360();
      class288.field3127.method2271();
      class78.method1192();
      class191.field1819.method2271();
      class44.field346.method2271();
      class51.method843();
      ((class254)class257.field2539).method4533();
      class252.field2500.method2271();
      class77.field705.method2595();
      class330.field3690.method2595();
      class205.field1992.method2595();
      class104.field971.method2595();
      class11.field85.method2595();
      client.field4007.method2595();
      class87.field801.method2595();
      class170.field1577.method2595();
      class138.field1365.method2595();
      class293.field3165.method2595();
      class78.field717.method2595();
      class126.field1194.method2595();
      class258.field2566.method5331();

      for(int var0 = 0; var0 < 4; ++var0) {
         client.field3790[var0].method3160();
      }

      System.gc();
      class294.method5135(2);
      client.field3907 = -1;
      client.field3972 = false;

      for(class282 var1 = (class282)class282.field3050.method5604(); var1 != null; var1 = (class282)class282.field3050.method5606()) {
         if(var1.field3046 != null) {
            class61.field468.method4960(var1.field3046);
            var1.field3046 = null;
         }

         if(var1.field3051 != null) {
            class61.field468.method4960(var1.field3051);
            var1.field3051 = null;
         }
      }

      class282.field3050.method5621();
      class188.method3239(10);
   }
}
