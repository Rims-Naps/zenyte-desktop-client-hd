package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
public class class5 extends class197 {
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 852966299
   )
   int field43;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -717589021
   )
   int field59;
   @ObfuscatedName("ao")
   boolean field47;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1933293469
   )
   int field41;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 583757859
   )
   int field55;
   @ObfuscatedName("bf")
   int[] field67;
   @ObfuscatedName("aw")
   boolean field54;
   @ObfuscatedName("bo")
   String field57;
   @ObfuscatedName("ai")
   String field61;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 301994693
   )
   int field71;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -384370897
   )
   int field72;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -1403213631
   )
   int field70;
   @ObfuscatedName("bs")
   String field77;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1483607073
   )
   int field56;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1343108663
   )
   int field75;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -375892939
   )
   int field63;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -441600825
   )
   int field53;
   @ObfuscatedName("bx")
   String field74;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 805681549
   )
   int field65;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1929413353
   )
   int field62;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1053591547
   )
   int field58;
   @ObfuscatedName("ah")
   String field64;
   @ObfuscatedName("au")
   String field51;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = 624690117
   )
   int field76;
   @ObfuscatedName("aj")
   String field66;

   class5(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
      this.field67 = new int[3];
      this.field53 = var1;
      this.field54 = var2;
      this.field55 = var3;
      this.field56 = var4;
      this.field58 = var5;
      this.field65 = var6;
      this.field59 = var7;
      this.field47 = var8;
      this.field75 = var9;
      this.field62 = var10;
      this.field63 = var11;
      this.field43 = var12;
      this.field51 = var13;
      this.field66 = var14;
      this.field64 = var15;
      this.field61 = var16;
      this.field41 = var17;
      this.field70 = var18;
      this.field71 = var19;
      this.field72 = var20;
      this.field57 = var21;
      this.field74 = var22;
      this.field67 = var23;
      this.field76 = var24;
      this.field77 = var25;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1868287804"
   )
   public int method90() {
      byte var1 = 38;
      int var2 = var1 + class162.method2970(this.field51);
      var2 += class162.method2970(this.field66);
      var2 += class162.method2970(this.field64);
      var2 += class162.method2970(this.field61);
      var2 += class162.method2970(this.field57);
      var2 += class162.method2970(this.field74);
      var2 += class162.method2970(this.field77);
      return var2;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "470741095"
   )
   public void method88(class125 var1) {
      var1.method2288(7);
      var1.method2288(this.field53);
      var1.method2288(this.field54?1:0);
      var1.method2288(this.field55);
      var1.method2288(this.field56);
      var1.method2288(this.field58);
      var1.method2288(this.field65);
      var1.method2288(this.field59);
      var1.method2288(this.field47?1:0);
      var1.method2242(this.field75);
      var1.method2288(this.field62);
      var1.method2412(this.field63);
      var1.method2242(this.field43);
      var1.method2249(this.field51);
      var1.method2249(this.field66);
      var1.method2249(this.field64);
      var1.method2249(this.field61);
      var1.method2288(this.field70);
      var1.method2242(this.field41);
      var1.method2249(this.field57);
      var1.method2249(this.field74);
      var1.method2288(this.field71);
      var1.method2288(this.field72);

      for(int var2 = 0; var2 < this.field67.length; ++var2) {
         var1.method2334(this.field67[var2]);
      }

      var1.method2334(this.field76);
      var1.method2249(this.field77);
   }
}
