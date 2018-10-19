package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSClanMemberManager;

@ObfuscatedName("ki")
public class class178 extends class209 implements RSClanMemberManager {
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1604002151
   )
   int field1697;
   @ObfuscatedName("m")
   public String field1693;
   @ObfuscatedName("z")
   public byte field1694;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 334532311
   )
   public int field1696;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   final class179 field1698;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lkt;"
   )
   final class27 field1692;
   @ObfuscatedName("d")
   public String field1695;

   @ObfuscatedSignature(
      signature = "(Lly;Lkt;)V"
   )
   public class178(class179 var1, class27 var2) {
      super(100);
      this.field1693 = null;
      this.field1695 = null;
      this.field1697 = 1;
      this.field1698 = var1;
      this.field1692 = var2;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Ljb;",
      garbageValue = "893739968"
   )
   class242 vmethod3645() {
      return new class241();
   }

   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "883278984"
   )
   public final void method2984() {
      for(int var1 = 0; var1 < this.method3635(); ++var1) {
         ((class241)this.method3620(var1)).method4270();
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1880818015"
   )
   final void method2979(String var1) {
      this.field1695 = class38.method623(var1);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IS)[Ljb;",
      garbageValue = "14604"
   )
   class242[] vmethod3641(int var1) {
      return new class241[var1];
   }

   @ObfuscatedName("co")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1314872350"
   )
   public final void method2983() {
      for(int var1 = 0; var1 < this.method3635(); ++var1) {
         ((class241)this.method3620(var1)).method4267();
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "478480697"
   )
   final void method3006(String var1) {
      this.field1693 = class38.method623(var1);
   }

   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      signature = "(Lgm;S)V",
      garbageValue = "381"
   )
   public final void method2982(Buffer var1) {
      class49 var2 = new class49(var1.readString(), this.field1698);
      int var3 = var1.readUnsignedShort();
      byte var4 = var1.method1906();
      boolean var5 = false;
      if(var4 == -128) {
         var5 = true;
      }

      class241 var6;
      if(var5) {
         if(this.method3635() == 0) {
            return;
         }

         var6 = (class241)this.method3626(var2);
         if(var6 != null && var6.method5266() == var3) {
            this.method3629(var6);
         }
      } else {
         var1.readString();
         var6 = (class241)this.method3626(var2);
         if(var6 == null) {
            if(this.method3635() > super.field2036) {
               return;
            }

            var6 = (class241)this.method3630(var2);
         }

         var6.method5265(var3, ++this.field1697 - 1);
         var6.field3261 = var4;
         this.method2985(var6);
      }

   }

   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      signature = "(Lgm;B)V",
      garbageValue = "-19"
   )
   public final void method2981(Buffer var1) {
      this.method2979(var1.readString());
      long var2 = var1.method1998();
      long var5 = var2;
      String var4;
      int var7;
      if(var2 > 0L && var2 < 6582952005840035281L) {
         if(var2 % 37L == 0L) {
            var4 = null;
         } else {
            var7 = 0;

            for(long var13 = var2; var13 != 0L; var13 /= 37L) {
               ++var7;
            }

            StringBuilder var15 = new StringBuilder(var7);

            while(var5 != 0L) {
               long var11 = var5;
               var5 /= 37L;
               var15.append(class145.field1398[(int)(var11 - 37L * var5)]);
            }

            var4 = var15.reverse().toString();
         }
      } else {
         var4 = null;
      }

      this.method3006(var4);
      this.field1694 = var1.method1906();
      var7 = var1.readUnsignedByte();
      if(var7 != 255) {
         this.method3621();

         for(int var8 = 0; var8 < var7; ++var8) {
            class241 var9 = (class241)this.method3630(new class49(var1.readString(), this.field1698));
            int var10 = var1.readUnsignedShort();
            var9.method5265(var10, ++this.field1697 - 1);
            var9.field3261 = var1.method1906();
            var1.readString();
            this.method2985(var9);
         }

      }
   }

   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      signature = "(Lja;I)V",
      garbageValue = "262451209"
   )
   final void method2985(class241 var1) {
      if(var1.method4300().equals(this.field1692.vmethod5980())) {
         this.field1696 = var1.field3261;
      }

   }
}
