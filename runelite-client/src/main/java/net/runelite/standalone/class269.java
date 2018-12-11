package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
public class class269 extends class324 {
   @ObfuscatedName("gf")
   @ObfuscatedSignature(
      signature = "Ldh;"
   )
   static class111 field3464;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class100 field3474;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static Js5Index field3469;
   @ObfuscatedName("p")
   public int[] field3471;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1214249825
   )
   public int field3472;
   @ObfuscatedName("s")
   public char field3467;
   @ObfuscatedName("r")
   public int[] field3465;
   @ObfuscatedName("m")
   public String[] field3473;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1952840673
   )
   public int field3470;
   @ObfuscatedName("e")
   public String field3468;
   @ObfuscatedName("w")
   public char field3466;

   static {
      field3474 = new class100(64);
   }

   class269() {
      this.field3468 = "null";
      this.field3472 = 0;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lgm;B)V",
      garbageValue = "-40"
   )
   void method5318(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method5319(var1, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-445321263"
   )
   public int method5317() {
      return this.field3472;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "-1822828035"
   )
   void method5319(Buffer var1, int var2) {
      if(var2 == 1) {
         this.field3466 = (char)var1.readUnsignedByte();
      } else if(var2 == 2) {
         this.field3467 = (char)var1.readUnsignedByte();
      } else if(var2 == 3) {
         this.field3468 = var1.readString();
      } else if(var2 == 4) {
         this.field3470 = var1.readInt();
      } else {
         int var3;
         if(var2 == 5) {
            this.field3472 = var1.readUnsignedShort();
            this.field3471 = new int[this.field3472];
            this.field3473 = new String[this.field3472];

            for(var3 = 0; var3 < this.field3472; ++var3) {
               this.field3471[var3] = var1.readInt();
               this.field3473[var3] = var1.readString();
            }
         } else if(var2 == 6) {
            this.field3472 = var1.readUnsignedShort();
            this.field3471 = new int[this.field3472];
            this.field3465 = new int[this.field3472];

            for(var3 = 0; var3 < this.field3472; ++var3) {
               this.field3471[var3] = var1.readInt();
               this.field3465[var3] = var1.readInt();
            }
         }
      }

   }

   @ObfuscatedName("hi")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-38"
   )
   static final void method5330(int var0) {
      if(var0 >= 0) {
         int var1 = client.field2291[var0];
         int var2 = client.field2292[var0];
         int var3 = client.field2293[var0];
         int var4 = client.field2368[var0];
         String var5 = client.field2295[var0];
         String var6 = client.field2296[var0];
         class28.method483(var1, var2, var3, var4, var5, var6, class163.field1980, class163.field1984, (byte)9);
      }
   }

   @ObfuscatedName("gq")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1524052955"
   )
   static final void method5329() {
      for(class87 var0 = (class87)client.field2282.method1503(); var0 != null; var0 = (class87)client.field2282.method1505()) {
         if(var0.field939 > 0) {
            --var0.field939;
         }

         if(var0.field939 == 0) {
            if(var0.field943 < 0 || class313.method6139(var0.field943, var0.field936)) {
               class263.method5239(var0.field938, var0.field931, var0.field932, var0.field933, var0.field943, var0.field935, var0.field936);
               var0.method3937();
            }
         } else {
            if(var0.field940 > 0) {
               --var0.field940;
            }

            if(var0.field940 == 0 && var0.field932 >= 1 && var0.field933 >= 1 && var0.field932 <= 102 && var0.field933 <= 102 && (var0.field937 < 0 || class313.method6139(var0.field937, var0.field934))) {
               class263.method5239(var0.field938, var0.field931, var0.field932, var0.field933, var0.field937, var0.field930, var0.field934);
               var0.field940 = -1;
               if(var0.field937 == var0.field943 && var0.field943 == -1) {
                  var0.method3937();
               } else if(var0.field937 == var0.field943 && var0.field935 == var0.field930 && var0.field934 == var0.field936) {
                  var0.method3937();
               }
            }
         }
      }

   }
}
