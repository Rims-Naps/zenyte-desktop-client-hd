package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
public class class78 {
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1730404637
   )
   public int field869;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1691321545
   )
   public int field868;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 894711017
   )
   public int field863;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 413476637
   )
   public int field870;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 256503451
   )
   public int field867;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1989421783
   )
   public int field865;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1906910519
   )
   public int field871;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1065000831
   )
   public int field872;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1122196817
   )
   public int field862;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -537863113
   )
   public int field866;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -168396461
   )
   public int field864;

   public class78() {
      this.field867 = -1;
      this.field863 = -1;
      this.field864 = -1;
      this.field870 = -1;
      this.field866 = -1;
      this.field862 = -1;
      this.field868 = -1;
      this.field869 = -1;
      this.field865 = -1;
      this.field871 = -1;
      this.field872 = -1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lik;I)V",
      garbageValue = "-1506588001"
   )
   public void method1584(class217 var1) {
      byte[] var2 = var1.method4405(class188.field2703.field2702);
      Buffer var3 = new Buffer(var2);

      while(true) {
         int var4 = var3.readUnsignedByte();
         if(var4 == 0) {
            return;
         }

         switch(var4) {
         case 1:
            var3.method2260();
            break;
         case 2:
            this.field867 = var3.method2293();
            this.field863 = var3.method2293();
            this.field864 = var3.method2293();
            this.field870 = var3.method2293();
            this.field866 = var3.method2293();
            this.field862 = var3.method2293();
            this.field868 = var3.method2293();
            this.field869 = var3.method2293();
            this.field865 = var3.method2293();
            this.field871 = var3.method2293();
            this.field872 = var3.method2293();
         }
      }
   }
}
