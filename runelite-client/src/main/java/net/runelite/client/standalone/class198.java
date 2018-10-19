package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
public enum class198 implements class91 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Ljp;"
   )
   field1869(1, 0),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Ljp;"
   )
   field1865(0, 1),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Ljp;"
   )
   field1866(2, 2);

   @ObfuscatedName("r")
   static int[][] field1868;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1231062461
   )
   final int field1864;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 824262487
   )
   public final int field1867;

   class198(int var3, int var4) {
      this.field1867 = var3;
      this.field1864 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "87"
   )
   public int vmethod5937() {
      return this.field1864;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(ILcz;ZB)I",
      garbageValue = "15"
   )
   static int method3356(int var0, class252 var1, boolean var2) {
      int var3;
      int var4;
      if(var0 == 4000) {
         class171.field1587 -= 2;
         var3 = class55.field407[class171.field1587];
         var4 = class55.field407[class171.field1587 + 1];
         class55.field407[++class171.field1587 - 1] = var4 + var3;
         return 1;
      } else if(var0 == 4001) {
         class171.field1587 -= 2;
         var3 = class55.field407[class171.field1587];
         var4 = class55.field407[class171.field1587 + 1];
         class55.field407[++class171.field1587 - 1] = var3 - var4;
         return 1;
      } else if(var0 == 4002) {
         class171.field1587 -= 2;
         var3 = class55.field407[class171.field1587];
         var4 = class55.field407[class171.field1587 + 1];
         class55.field407[++class171.field1587 - 1] = var3 * var4;
         return 1;
      } else if(var0 == 4003) {
         class171.field1587 -= 2;
         var3 = class55.field407[class171.field1587];
         var4 = class55.field407[class171.field1587 + 1];
         class55.field407[++class171.field1587 - 1] = var3 / var4;
         return 1;
      } else if(var0 == 4004) {
         var3 = class55.field407[--class171.field1587];
         class55.field407[++class171.field1587 - 1] = (int)(Math.random() * (double)var3);
         return 1;
      } else if(var0 == 4005) {
         var3 = class55.field407[--class171.field1587];
         class55.field407[++class171.field1587 - 1] = (int)(Math.random() * (double)(var3 + 1));
         return 1;
      } else if(var0 == 4006) {
         class171.field1587 -= 5;
         var3 = class55.field407[class171.field1587];
         var4 = class55.field407[class171.field1587 + 1];
         int var5 = class55.field407[class171.field1587 + 2];
         int var6 = class55.field407[class171.field1587 + 3];
         int var7 = class55.field407[class171.field1587 + 4];
         class55.field407[++class171.field1587 - 1] = var3 + (var7 - var5) * (var4 - var3) / (var6 - var5);
         return 1;
      } else if(var0 == 4007) {
         class171.field1587 -= 2;
         var3 = class55.field407[class171.field1587];
         var4 = class55.field407[class171.field1587 + 1];
         class55.field407[++class171.field1587 - 1] = var3 + var3 * var4 / 100;
         return 1;
      } else if(var0 == 4008) {
         class171.field1587 -= 2;
         var3 = class55.field407[class171.field1587];
         var4 = class55.field407[class171.field1587 + 1];
         class55.field407[++class171.field1587 - 1] = var3 | 1 << var4;
         return 1;
      } else if(var0 == 4009) {
         class171.field1587 -= 2;
         var3 = class55.field407[class171.field1587];
         var4 = class55.field407[class171.field1587 + 1];
         class55.field407[++class171.field1587 - 1] = var3 & -1 - (1 << var4);
         return 1;
      } else if(var0 == 4010) {
         class171.field1587 -= 2;
         var3 = class55.field407[class171.field1587];
         var4 = class55.field407[class171.field1587 + 1];
         class55.field407[++class171.field1587 - 1] = (var3 & 1 << var4) != 0?1:0;
         return 1;
      } else if(var0 == 4011) {
         class171.field1587 -= 2;
         var3 = class55.field407[class171.field1587];
         var4 = class55.field407[class171.field1587 + 1];
         class55.field407[++class171.field1587 - 1] = var3 % var4;
         return 1;
      } else if(var0 == 4012) {
         class171.field1587 -= 2;
         var3 = class55.field407[class171.field1587];
         var4 = class55.field407[class171.field1587 + 1];
         if(var3 == 0) {
            class55.field407[++class171.field1587 - 1] = 0;
         } else {
            class55.field407[++class171.field1587 - 1] = (int)Math.pow((double)var3, (double)var4);
         }

         return 1;
      } else if(var0 == 4013) {
         class171.field1587 -= 2;
         var3 = class55.field407[class171.field1587];
         var4 = class55.field407[class171.field1587 + 1];
         if(var3 == 0) {
            class55.field407[++class171.field1587 - 1] = 0;
            return 1;
         } else {
            switch(var4) {
            case 0:
               class55.field407[++class171.field1587 - 1] = Integer.MAX_VALUE;
               break;
            case 1:
               class55.field407[++class171.field1587 - 1] = var3;
               break;
            case 2:
               class55.field407[++class171.field1587 - 1] = (int)Math.sqrt((double)var3);
               break;
            case 3:
               class55.field407[++class171.field1587 - 1] = (int)Math.cbrt((double)var3);
               break;
            case 4:
               class55.field407[++class171.field1587 - 1] = (int)Math.sqrt(Math.sqrt((double)var3));
               break;
            default:
               class55.field407[++class171.field1587 - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4);
            }

            return 1;
         }
      } else if(var0 == 4014) {
         class171.field1587 -= 2;
         var3 = class55.field407[class171.field1587];
         var4 = class55.field407[class171.field1587 + 1];
         class55.field407[++class171.field1587 - 1] = var3 & var4;
         return 1;
      } else if(var0 == 4015) {
         class171.field1587 -= 2;
         var3 = class55.field407[class171.field1587];
         var4 = class55.field407[class171.field1587 + 1];
         class55.field407[++class171.field1587 - 1] = var3 | var4;
         return 1;
      } else if(var0 == 4018) {
         class171.field1587 -= 3;
         long var9 = (long)class55.field407[class171.field1587];
         long var11 = (long)class55.field407[class171.field1587 + 1];
         long var13 = (long)class55.field407[class171.field1587 + 2];
         class55.field407[++class171.field1587 - 1] = (int)(var9 * var13 / var11);
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("jz")
   @ObfuscatedSignature(
      signature = "(Lbl;ZI)V",
      garbageValue = "-1364592305"
   )
   static final void method3355(class45 var0, boolean var1) {
      int var2 = var0.field351;
      int var3 = (int)var0.field704;
      var0.method1186();
      if(var1) {
         class25.method365(var2);
      }

      for(class262 var4 = (class262)client.field3934.method5317(); var4 != null; var4 = (class262)client.field3934.method5313()) {
         if((var4.field704 >> 48 & 65535L) == (long)var2) {
            var4.method1186();
         }
      }

      class329 var9 = class189.getWidget(var3);
      if(var9 != null) {
         class184.method3216(var9);
      }

      for(int var5 = 0; var5 < client.field3869; ++var5) {
         int var7 = client.field3872[var5];
         boolean var6 = var7 == 57 || var7 == 58 || var7 == 1007 || var7 == 25 || var7 == 30;
         if(var6) {
            if(var5 < client.field3869 - 1) {
               for(int var8 = var5; var8 < client.field3869 - 1; ++var8) {
                  client.field3874[var8] = client.field3874[var8 + 1];
                  client.field3875[var8] = client.field3875[var8 + 1];
                  client.field3872[var8] = client.field3872[var8 + 1];
                  client.field3947[var8] = client.field3947[var8 + 1];
                  client.field3870[var8] = client.field3870[var8 + 1];
                  client.field3871[var8] = client.field3871[var8 + 1];
                  client.field3906[var8] = client.field3906[var8 + 1];
               }
            }

            --var5;
            --client.field3869;
            client.onMenuOptionsChanged(-1);
         }
      }

      class263.method4816();
      if(client.field3892 != -1) {
         class161.method2770(client.field3892, 1);
      }

   }
}
