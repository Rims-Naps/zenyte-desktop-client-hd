package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
public class class163 extends class3 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lhc;"
   )
   class24 field1512;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   class320 field1511;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lcw;"
   )
   class280 field1513;

   @ObfuscatedSignature(
      signature = "(Lhc;)V"
   )
   class163(class24 var1) {
      this.field1511 = new class320();
      this.field1513 = new class280();
      this.field1512 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lhz;[IIIII)V",
      garbageValue = "-1103416882"
   )
   void method2782(class75 var1, int[] var2, int var3, int var4, int var5) {
      if((this.field1512.field181[var1.field686] & 4) != 0 && var1.field694 < 0) {
         int var6 = this.field1512.field186[var1.field686] / class40.field294;

         while(true) {
            int var7 = (var6 + 1048575 - var1.field700) / var6;
            if(var7 > var4) {
               var1.field700 += var6 * var4;
               break;
            }

            var1.field695.vmethod4966(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.field700 += var7 * var6 - 1048576;
            int var8 = class40.field294 / 100;
            int var9 = 262144 / var6;
            if(var9 < var8) {
               var8 = var9;
            }

            class243 var10 = var1.field695;
            if(this.field1512.field184[var1.field686] == 0) {
               var1.field695 = class243.method4315(var1.field682, var10.method4329(), var10.method4320(), var10.method4419());
            } else {
               var1.field695 = class243.method4315(var1.field682, var10.method4329(), 0, var10.method4419());
               this.field1512.method255(var1, var1.field687.field3054[var1.field685] < 0);
               var1.field695.method4325(var8, var10.method4320());
            }

            if(var1.field687.field3054[var1.field685] < 0) {
               var1.field695.method4316(-1);
            }

            var10.method4327(var8);
            var10.vmethod4966(var2, var3, var5 - var3);
            if(var10.method4404()) {
               this.field1513.method4958(var10);
            }
         }
      }

      var1.field695.vmethod4966(var2, var3, var4);
   }

   @ObfuscatedName("m")
   protected void vmethod4966(int[] var1, int var2, int var3) {
      this.field1513.vmethod4966(var1, var2, var3);

      for(class75 var6 = (class75)this.field1511.method5604(); var6 != null; var6 = (class75)this.field1511.method5606()) {
         if(!this.field1512.method276(var6)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if(var5 <= var6.field683) {
                  this.method2782(var6, var1, var4, var5, var4 + var5);
                  var6.field683 -= var5;
                  break;
               }

               this.method2782(var6, var1, var4, var6.field683, var4 + var5);
               var4 += var6.field683;
               var5 -= var6.field683;
            } while(!this.field1512.method349(var6, var1, var4, var5));
         }
      }

   }

   @ObfuscatedName("z")
   protected void vmethod4968(int var1) {
      this.field1513.vmethod4968(var1);

      for(class75 var3 = (class75)this.field1511.method5604(); var3 != null; var3 = (class75)this.field1511.method5606()) {
         if(!this.field1512.method276(var3)) {
            int var2 = var1;

            do {
               if(var2 <= var3.field683) {
                  this.method2787(var3, var2);
                  var3.field683 -= var2;
                  break;
               }

               this.method2787(var3, var3.field683);
               var2 -= var3.field683;
            } while(!this.field1512.method349(var3, (int[])null, 0, var2));
         }
      }

   }

   @ObfuscatedName("r")
   protected int vmethod4965() {
      return 0;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "()Ldm;"
   )
   protected class3 vmethod4973() {
      class75 var1;
      do {
         var1 = (class75)this.field1511.method5606();
         if(var1 == null) {
            return null;
         }
      } while(var1.field695 == null);

      return var1.field695;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "()Ldm;"
   )
   protected class3 vmethod4963() {
      class75 var1 = (class75)this.field1511.method5604();
      return (class3)(var1 == null?null:(var1.field695 != null?var1.field695:this.vmethod4973()));
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lhz;IB)V",
      garbageValue = "-51"
   )
   void method2787(class75 var1, int var2) {
      if((this.field1512.field181[var1.field686] & 4) != 0 && var1.field694 < 0) {
         int var3 = this.field1512.field186[var1.field686] / class40.field294;
         int var4 = (var3 + 1048575 - var1.field700) / var3;
         var1.field700 = var3 * var2 + var1.field700 & 1048575;
         if(var4 <= var2) {
            if(this.field1512.field184[var1.field686] == 0) {
               var1.field695 = class243.method4315(var1.field682, var1.field695.method4329(), var1.field695.method4320(), var1.field695.method4419());
            } else {
               var1.field695 = class243.method4315(var1.field682, var1.field695.method4329(), 0, var1.field695.method4419());
               this.field1512.method255(var1, var1.field687.field3054[var1.field685] < 0);
            }

            if(var1.field687.field3054[var1.field685] < 0) {
               var1.field695.method4316(-1);
            }

            var2 = var1.field700 / var3;
         }
      }

      var1.field695.vmethod4968(var2);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)I",
      garbageValue = "-1004071523"
   )
   public static int method2781(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + class164.method2834(var0.charAt(var3));
      }

      return var2;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2146420868"
   )
   public static void method2784() {
      class105.field980.method2271();
   }

   @ObfuscatedName("jb")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZB)Ljava/lang/String;",
      garbageValue = "-6"
   )
   static String method2811(String var0, boolean var1) {
      String var2 = var1?"https://":"http://";
      if(client.field3734 == 1) {
         var0 = var0 + "-wtrc";
      } else if(client.field3734 == 2) {
         var0 = var0 + "-wtqa";
      } else if(client.field3734 == 3) {
         var0 = var0 + "-wtwip";
      } else if(client.field3734 == 5) {
         var0 = var0 + "-wti";
      } else if(client.field3734 == 4) {
         var0 = "local";
      }

      String var3 = "";
      if(class330.field3693 != null) {
         var3 = "/p=" + class330.field3693;
      }

      String var4 = "runescape.com";
      return var2 + var0 + "." + var4 + "/l=" + client.field3737 + "/a=" + class2.field19 + var3 + "/";
   }
}
