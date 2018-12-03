package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSClanMemberManager;

@ObfuscatedName("ki")
public class class254 extends class168 implements RSClanMemberManager {
   @ObfuscatedName("z")
   public byte field3344;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   final class258 field3348;
   @ObfuscatedName("m")
   public String field3343;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 334532311
   )
   public int field3346;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1604002151
   )
   int field3347;
   @ObfuscatedName("d")
   public String field3345;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lkt;"
   )
   final class146 field3342;

   @ObfuscatedSignature(
      signature = "(Lly;Lkt;)V"
   )
   public class254(class258 var1, class146 var2) {
      super(100);
      this.field3343 = null;
      this.field3345 = null;
      this.field3347 = 1;
      this.field3348 = var1;
      this.field3342 = var2;
   }

   @ObfuscatedName("co")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1314872350"
   )
   public final void method5088() {
      for(int var1 = 0; var1 < this.method3041(); ++var1) {
         ((class272)this.method3026(var1)).method5344();
      }

   }

   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "883278984"
   )
   public final void method5089() {
      for(int var1 = 0; var1 < this.method3041(); ++var1) {
         ((class272)this.method3026(var1)).method5347();
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IS)[Ljb;",
      garbageValue = "14604"
   )
   class330[] vmethod6017(int var1) {
      return new class272[var1];
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Ljb;",
      garbageValue = "893739968"
   )
   class330 vmethod6016() {
      return new class272();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1880818015"
   )
   final void method5084(String var1) {
      this.field3345 = class283.method5468(var1);
   }

   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      signature = "(Lja;I)V",
      garbageValue = "262451209"
   )
   final void method5090(class272 var1) {
      if(var1.method6338().equals(this.field3342.vmethod3264())) {
         this.field3346 = var1.field733;
      }

   }

   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      signature = "(Lgm;B)V",
      garbageValue = "-19"
   )
   public final void method5086(Buffer var1) {
      this.method5084(var1.readString());
      long var2 = var1.method2349();
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
               var15.append(class37.field364[(int)(var11 - 37L * var5)]);
            }

            var4 = var15.reverse().toString();
         }
      } else {
         var4 = null;
      }

      this.method5111(var4);
      this.field3344 = var1.method2257();
      var7 = var1.readUnsignedByte();
      if(var7 != 255) {
         this.method3027();

         for(int var8 = 0; var8 < var7; ++var8) {
            class272 var9 = (class272)this.method3036(new class158(var1.readString(), this.field3348));
            int var10 = var1.readShort();
            var9.method1338(var10, ++this.field3347 - 1);
            var9.field733 = var1.method2257();
            var1.readString();
            this.method5090(var9);
         }

      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "478480697"
   )
   final void method5111(String var1) {
      this.field3343 = class283.method5468(var1);
   }

   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      signature = "(Lgm;S)V",
      garbageValue = "381"
   )
   public final void method5087(Buffer var1) {
      class158 var2 = new class158(var1.readString(), this.field3348);
      int var3 = var1.readShort();
      byte var4 = var1.method2257();
      boolean var5 = false;
      if(var4 == -128) {
         var5 = true;
      }

      class272 var6;
      if(var5) {
         if(this.method3041() == 0) {
            return;
         }

         var6 = (class272)this.method3032(var2);
         if(var6 != null && var6.method1339() == var3) {
            this.method3035(var6);
         }
      } else {
         var1.readString();
         var6 = (class272)this.method3032(var2);
         if(var6 == null) {
            if(this.method3041() > super.field2015) {
               return;
            }

            var6 = (class272)this.method3036(var2);
         }

         var6.method1338(var3, ++this.field3347 - 1);
         var6.field733 = var4;
         this.method5090(var6);
      }

   }
}
