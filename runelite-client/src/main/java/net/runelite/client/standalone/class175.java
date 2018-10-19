package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
public class class175 extends class76 {
   @ObfuscatedName("aw")
   boolean field1659;
   @ObfuscatedName("au")
   String field1656;
   @ObfuscatedName("bs")
   String field1682;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -1403213631
   )
   int field1675;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = 624690117
   )
   int field1681;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 805681549
   )
   int field1670;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1483607073
   )
   int field1661;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -384370897
   )
   int field1677;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 852966299
   )
   int field1648;
   @ObfuscatedName("ao")
   boolean field1652;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1343108663
   )
   int field1680;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -375892939
   )
   int field1668;
   @ObfuscatedName("ah")
   String field1669;
   @ObfuscatedName("bo")
   String field1662;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -717589021
   )
   int field1664;
   @ObfuscatedName("ai")
   String field1666;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 301994693
   )
   int field1676;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 583757859
   )
   int field1660;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1933293469
   )
   int field1646;
   @ObfuscatedName("aj")
   String field1671;
   @ObfuscatedName("bf")
   int[] field1672;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1929413353
   )
   int field1667;
   @ObfuscatedName("bx")
   String field1679;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -441600825
   )
   int field1658;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1053591547
   )
   int field1663;

   class175(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
      this.field1672 = new int[3];
      this.field1658 = var1;
      this.field1659 = var2;
      this.field1660 = var3;
      this.field1661 = var4;
      this.field1663 = var5;
      this.field1670 = var6;
      this.field1664 = var7;
      this.field1652 = var8;
      this.field1680 = var9;
      this.field1667 = var10;
      this.field1668 = var11;
      this.field1648 = var12;
      this.field1656 = var13;
      this.field1671 = var14;
      this.field1669 = var15;
      this.field1666 = var16;
      this.field1646 = var17;
      this.field1675 = var18;
      this.field1676 = var19;
      this.field1677 = var20;
      this.field1662 = var21;
      this.field1679 = var22;
      this.field1672 = var23;
      this.field1681 = var24;
      this.field1682 = var25;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgm;I)V",
      garbageValue = "470741095"
   )
   public void method2949(Buffer var1) {
      var1.writeByte(7);
      var1.writeByte(this.field1658);
      var1.writeByte(this.field1659?1:0);
      var1.writeByte(this.field1660);
      var1.writeByte(this.field1661);
      var1.writeByte(this.field1663);
      var1.writeByte(this.field1670);
      var1.writeByte(this.field1664);
      var1.writeByte(this.field1652?1:0);
      var1.writeShort(this.field1680);
      var1.writeByte(this.field1667);
      var1.writeMedium(this.field1668);
      var1.writeShort(this.field1648);
      var1.writeJAGString(this.field1656);
      var1.writeJAGString(this.field1671);
      var1.writeJAGString(this.field1669);
      var1.writeJAGString(this.field1666);
      var1.writeByte(this.field1675);
      var1.writeShort(this.field1646);
      var1.writeJAGString(this.field1662);
      var1.writeJAGString(this.field1679);
      var1.writeByte(this.field1676);
      var1.writeByte(this.field1677);

      for(int var2 = 0; var2 < this.field1672.length; ++var2) {
         var1.writeInt(this.field1672[var2]);
      }

      var1.writeInt(this.field1681);
      var1.writeJAGString(this.field1682);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1868287804"
   )
   public int method2951() {
      byte var1 = 38;
      int var2 = var1 + class12.method138(this.field1656);
      var2 += class12.method138(this.field1671);
      var2 += class12.method138(this.field1669);
      var2 += class12.method138(this.field1666);
      var2 += class12.method138(this.field1662);
      var2 += class12.method138(this.field1679);
      var2 += class12.method138(this.field1682);
      return var2;
   }
}
