package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSIgnoreContainer;

@ObfuscatedName("kh")
public class class142 extends class209 implements RSIgnoreContainer {
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   final class179 field1389;

   @ObfuscatedSignature(
      signature = "(Lly;)V"
   )
   public class142(class179 var1) {
      super(400);
      this.field1389 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Ljb;",
      garbageValue = "893739968"
   )
   class242 vmethod3645() {
      return new class250();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IS)[Ljb;",
      garbageValue = "14604"
   )
   class242[] vmethod3641(int var1) {
      return new class250[var1];
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgm;II)V",
      garbageValue = "-557798195"
   )
   public void method2534(Buffer var1, int var2) {
      while(true) {
         if(var1.field1073 < var2) {
            int var3 = var1.readUnsignedByte();
            boolean var4 = (var3 & 1) == 1;
            class49 var5 = new class49(var1.readString(), this.field1389);
            class49 var6 = new class49(var1.readString(), this.field1389);
            var1.readString();
            if(var5 != null && var5.method822()) {
               class250 var7 = (class250)this.method3626(var5);
               if(var4) {
                  class250 var8 = (class250)this.method3626(var6);
                  if(var8 != null && var8 != var7) {
                     if(var7 != null) {
                        this.method3629(var8);
                     } else {
                        var7 = var8;
                     }
                  }
               }

               if(var7 != null) {
                  this.method3690(var7, var5, var6);
                  continue;
               }

               if(this.method3635() < 400) {
                  int var9 = this.method3635();
                  var7 = (class250)this.method3648(var5, var6);
                  var7.field2475 = var9;
               }
               continue;
            }

            throw new IllegalStateException();
         }

         return;
      }
   }
}
