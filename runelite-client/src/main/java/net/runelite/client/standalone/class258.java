package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
public class class258 extends class193 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class148 field2571;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class124 field2576;
   @ObfuscatedName("gf")
   @ObfuscatedSignature(
      signature = "Ldh;"
   )
   static class312 field2566;
   @ObfuscatedName("m")
   public String[] field2575;
   @ObfuscatedName("r")
   public int[] field2567;
   @ObfuscatedName("p")
   public int[] field2573;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1214249825
   )
   public int field2574;
   @ObfuscatedName("e")
   public String field2570;
   @ObfuscatedName("s")
   public char field2569;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1952840673
   )
   public int field2572;
   @ObfuscatedName("w")
   public char field2568;

   static {
      field2576 = new class124(64);
   }

   class258() {
      this.field2570 = "null";
      this.field2574 = 0;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgm;B)V",
      garbageValue = "-40"
   )
   void method4652(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method4653(var1, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-445321263"
   )
   public int method4651() {
      return this.field2574;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "-1822828035"
   )
   void method4653(Buffer var1, int var2) {
      if(var2 == 1) {
         this.field2568 = (char)var1.readUnsignedByte();
      } else if(var2 == 2) {
         this.field2569 = (char)var1.readUnsignedByte();
      } else if(var2 == 3) {
         this.field2570 = var1.readString();
      } else if(var2 == 4) {
         this.field2572 = var1.readInt();
      } else {
         int var3;
         if(var2 == 5) {
            this.field2574 = var1.readUnsignedShort();
            this.field2573 = new int[this.field2574];
            this.field2575 = new String[this.field2574];

            for(var3 = 0; var3 < this.field2574; ++var3) {
               this.field2573[var3] = var1.readInt();
               this.field2575[var3] = var1.readString();
            }
         } else if(var2 == 6) {
            this.field2574 = var1.readUnsignedShort();
            this.field2573 = new int[this.field2574];
            this.field2567 = new int[this.field2574];

            for(var3 = 0; var3 < this.field2574; ++var3) {
               this.field2573[var3] = var1.readInt();
               this.field2567[var3] = var1.readInt();
            }
         }
      }

   }

   @ObfuscatedName("gq")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1524052955"
   )
   static final void method4663() {
      for(class274 var0 = (class274)client.field3861.method5604(); var0 != null; var0 = (class274)client.field3861.method5606()) {
         if(var0.field2999 > 0) {
            --var0.field2999;
         }

         if(var0.field2999 == 0) {
            if(var0.field3003 < 0 || class301.method5202(var0.field3003, var0.field2996)) {
               class281.method5002(var0.field2998, var0.field2991, var0.field2992, var0.field2993, var0.field3003, var0.field2995, var0.field2996);
               var0.method1186();
            }
         } else {
            if(var0.field3000 > 0) {
               --var0.field3000;
            }

            if(var0.field3000 == 0 && var0.field2992 >= 1 && var0.field2993 >= 1 && var0.field2992 <= 102 && var0.field2993 <= 102 && (var0.field2997 < 0 || class301.method5202(var0.field2997, var0.field2994))) {
               class281.method5002(var0.field2998, var0.field2991, var0.field2992, var0.field2993, var0.field2997, var0.field2990, var0.field2994);
               var0.field3000 = -1;
               if(var0.field2997 == var0.field3003 && var0.field3003 == -1) {
                  var0.method1186();
               } else if(var0.field2997 == var0.field3003 && var0.field2995 == var0.field2990 && var0.field2994 == var0.field2996) {
                  var0.method1186();
               }
            }
         }
      }

   }

   @ObfuscatedName("hi")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-38"
   )
   static final void method4664(int var0) {
      if(var0 >= 0) {
         int var1 = client.field3870[var0];
         int var2 = client.field3871[var0];
         int var3 = client.field3872[var0];
         int var4 = client.field3947[var0];
         String var5 = client.field3874[var0];
         String var6 = client.field3875[var0];
         class98.method1686(var1, var2, var3, var4, var5, var6, class226.field2220, class226.field2224, (byte)9);
      }
   }
}
