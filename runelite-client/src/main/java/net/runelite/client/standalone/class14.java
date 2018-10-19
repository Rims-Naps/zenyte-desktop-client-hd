package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSCombatInfo2;

@ObfuscatedName("jc")
public class class14 extends class193 implements RSCombatInfo2 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class148 field125;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   static class148 field121;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class124 field133;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   public static class124 field123;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 161010643
   )
   public int field122;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1134433951
   )
   int field132;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1025636039
   )
   public int field128;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1911793667
   )
   public int field130;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -968684683
   )
   public int field127;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 605597161
   )
   public int field129;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1667952951
   )
   public int field120;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -2069570007
   )
   int field131;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1222199023
   )
   public int field124;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 2146323479
   )
   public int field134;

   static {
      field123 = new class124(64);
      field133 = new class124(64);
   }

   public class14() {
      this.field129 = 255;
      this.field127 = 255;
      this.field128 = -1;
      this.field134 = 1;
      this.field130 = 70;
      this.field131 = -1;
      this.field132 = -1;
      this.field124 = 30;
      this.field122 = 0;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(B)Llp;",
      garbageValue = "102"
   )
   public class26 method157() {
      if(this.field132 < 0) {
         return null;
      } else {
         class26 var1 = (class26)field133.method2268((long)this.field132);
         if(var1 != null) {
            return var1;
         } else {
            var1 = class225.method4022(field121, this.field132, 0, (byte)48);
            if(var1 != null) {
               field133.method2275(var1, (long)this.field132);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Llp;",
      garbageValue = "-1015211348"
   )
   public class26 method148() {
      if(this.field131 < 0) {
         return null;
      } else {
         class26 var1 = (class26)field133.method2268((long)this.field131);
         if(var1 != null) {
            return var1;
         } else {
            var1 = class225.method4022(field121, this.field131, 0, (byte)47);
            if(var1 != null) {
               field133.method2275(var1, (long)this.field131);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgm;IB)V",
      garbageValue = "87"
   )
   void method147(Buffer var1, int var2) {
      if(var2 == 1) {
         var1.readUnsignedShort();
      } else if(var2 == 2) {
         this.field129 = var1.readUnsignedByte();
      } else if(var2 == 3) {
         this.field127 = var1.readUnsignedByte();
      } else if(var2 == 4) {
         this.field128 = 0;
      } else if(var2 == 5) {
         this.field130 = var1.readUnsignedShort();
      } else if(var2 == 6) {
         var1.readUnsignedByte();
      } else if(var2 == 7) {
         this.field131 = var1.method1942();
      } else if(var2 == 8) {
         this.field132 = var1.method1942();
      } else if(var2 == 11) {
         this.field128 = var1.readUnsignedShort();
      } else if(var2 == 14) {
         this.field124 = var1.readUnsignedByte();
      } else if(var2 == 15) {
         this.field122 = var1.readUnsignedByte();
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "911400937"
   )
   public void method160(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method147(var1, var2);
      }
   }

   public int getHealthScale() {
      return this.field124;
   }
}
