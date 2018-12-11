package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
public class class285 {
   @ObfuscatedName("p")
   static byte[][][] field3573;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 2022016867
   )
   int field3574;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 50457703
   )
   int field3570;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1086404361
   )
   int field3567;
   @ObfuscatedName("e")
   String field3572;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -837425621
   )
   int field3569;

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)Ljq;",
      garbageValue = "-972433077"
   )
   public static ObjectDef getObjectDef(int var0) {
      ObjectDef var1 = (ObjectDef)ObjectDef.field170.method1813((long)var0);
      if(var1 != null) {
         if (var0 == 36005) {
            var1.field165 = false;
            var1.field183 = 0;
            var1.field174 = 0;
            var1.field169 = true;
            //var1.field178 = new String[5];
            var1.field178[0] = "Test";
         }
         return var1;
      } else {
         byte[] var2 = ObjectDef.field182.method4398(6, var0, -825167704);
         var1 = new ObjectDef();
         var1.field155 = var0;
         if(var2 != null) {
            var1.method323(new Buffer(var2));
         }

         var1.method334();
         if(var1.field187) {
            var1.field173 = 0;
            var1.field166 = false;
         }
         if (var0 == 36005) {
            System.out.println("test");
            var1.field165 = false;
            var1.field183 = 0;
            var1.field174 = 0;
            var1.field169 = true;
            //var1.field178 = new String[5];
            var1.field178[0] = "Test";
         }
         ObjectDef.field170.method1820(var1, (long)var0);
         return var1;
      }
   }
}
