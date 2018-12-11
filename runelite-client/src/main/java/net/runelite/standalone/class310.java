package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
public class class310 extends class320 {
   @ObfuscatedName("f")
   final boolean field3817;

   public class310(boolean var1) {
      this.field3817 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lkj;Lkj;I)I",
      garbageValue = "833771244"
   )
   int method6082(class62 var1, class62 var2) {
      if(var1.field737 != 0) {
         if(var2.field737 == 0) {
            return this.field3817?-1:1;
         }
      } else if(var2.field737 != 0) {
         return this.field3817?1:-1;
      }

      return this.method6239(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method6082((class62)var1, (class62)var2);
   }

   @ObfuscatedName("ep")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-183074190"
   )
   static final void method6085() {
      client.field2384.method2592();
      class205.method4050();
      class74.method1560();
      class39.method681();
      ObjectDef.field170.method1816();
      ObjectDef.field157.method1816();
      ObjectDef.field152.method1816();
      ObjectDef.field153.method1816();
      class25.method451();
      class42.field441.method1816();
      class42.field421.method1816();
      class42.field449.method1816();
      class164.method3015();
      class18.method397();
      class72.field827.method1816();
      class278.field3515.method1816();
      class255.method5122();
      class66.method1486();
      class20.field230.method1816();
      class226.method4568();
      class123.field1666.method1816();
      class327.field3966.method1816();
      class291.method5707();
      ((class266)class211.field2895).method5295();
      class296.field3698.method1816();
      class286.field3576.method4414();
      class193.field2749.method4414();
      class233.field3084.method4414();
      class203.field2849.method4414();
      class152.mapsIndex.method4414();
      client.field2428.method4414();
      WorldMapData.field1851.method4414();
      class138.spritesIndex.method4414();
      class94.field1014.method4414();
      class219.binaryIndex.method4414();
      class226.field3043.method4414();
      class88.clientScriptIndex.method4414();
      class269.field3464.method1925();

      for(int var0 = 0; var0 < 4; ++var0) {
         client.field2211[var0].method42();
      }

      System.gc();
      class64.method1353(2);
      client.field2328 = -1;
      client.field2393 = false;

      for(class186 var1 = (class186)class186.field2540.method1503(); var1 != null; var1 = (class186)class186.field2540.method1505()) {
         if(var1.field2536 != null) {
            class220.field2985.method5197(var1.field2536);
            var1.field2536 = null;
         }

         if(var1.field2541 != null) {
            class220.field2985.method5197(var1.field2541);
            var1.field2541 = null;
         }
      }

      class186.field2540.method1520();
      class142.method2635(10);
   }

   @ObfuscatedName("gg")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "2"
   )
   static final void method6087() {
      for(class87 var0 = (class87)client.field2282.method1503(); var0 != null; var0 = (class87)client.field2282.method1505()) {
         if(var0.field939 == -1) {
            var0.field940 = 0;
            class96.method1773(var0);
         } else {
            var0.method3937();
         }
      }

   }
}
