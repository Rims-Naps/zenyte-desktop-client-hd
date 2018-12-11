package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSIgnoreContainer;

@ObfuscatedName("kh")
public class class9 extends class168 implements RSIgnoreContainer {
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   final class258 field92;

   @ObfuscatedSignature(
      signature = "(Lly;)V"
   )
   public class9(class258 var1) {
      super(400);
      this.field92 = var1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IS)[Ljb;",
      garbageValue = "14604"
   )
   class330[] vmethod6017(int var1) {
      return new class292[var1];
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Ljb;",
      garbageValue = "893739968"
   )
   class330 vmethod6016() {
      return new class292();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "-557798195"
   )
   public void method164(Buffer var1, int var2) {
      while(true) {
         if(var1.position < var2) {
            int var3 = var1.readUnsignedByte();
            boolean var4 = (var3 & 1) == 1;
            class158 var5 = new class158(var1.readString(), this.field92);
            class158 var6 = new class158(var1.readString(), this.field92);
            var1.readString();
            if(var5 != null && var5.method2870()) {
               class292 var7 = (class292)this.method3032(var5);
               if(var4) {
                  class292 var8 = (class292)this.method3032(var6);
                  if(var8 != null && var8 != var7) {
                     if(var7 != null) {
                        this.method3035(var8);
                     } else {
                        var7 = var8;
                     }
                  }
               }

               if(var7 != null) {
                  this.method3096(var7, var5, var6);
                  continue;
               }

               if(this.method3041() < 400) {
                  int var9 = this.method3041();
                  var7 = (class292)this.method3054(var5, var6);
                  var7.field3655 = var9;
               }
               continue;
            }

            throw new IllegalStateException();
         }

         return;
      }
   }
}
