package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFriendContainer;

@ObfuscatedName("kc")
public class class306 extends class168 implements RSFriendContainer {
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 600720795
   )
   int field3787;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Lhq;"
   )
   public class289 field3790;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lly;"
   )
   final class258 field3788;

   @ObfuscatedSignature(
      signature = "(Lly;)V"
   )
   public class306(class258 var1) {
      super(400);
      this.field3787 = 1;
      this.field3790 = new class289();
      this.field3788 = var1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IS)[Ljb;",
      garbageValue = "14604"
   )
   class330[] vmethod6017(int var1) {
      return new class73[var1];
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Ljb;",
      garbageValue = "893739968"
   )
   class330 vmethod6016() {
      return new class73();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgm;IB)V",
      garbageValue = "53"
   )
   public void method6019(Buffer var1, int var2) {
      while(true) {
         if(var1.field1693 < var2) {
            boolean var3 = var1.readUnsignedByte() == 1;
            class158 var4 = new class158(var1.readString(), this.field3788);
            class158 var5 = new class158(var1.readString(), this.field3788);
            int var6 = var1.readShort();
            int var7 = var1.readUnsignedByte();
            int var8 = var1.readUnsignedByte();
            boolean var9 = (var8 & 2) != 0;
            boolean var10 = (var8 & 1) != 0;
            if(var6 > 0) {
               var1.readString();
               var1.readUnsignedByte();
               var1.readInt();
            }

            var1.readString();
            if(var4 != null && var4.method2870()) {
               class73 var11 = (class73)this.method3032(var4);
               if(var3) {
                  class73 var12 = (class73)this.method3032(var5);
                  if(var12 != null && var12 != var11) {
                     if(var11 != null) {
                        this.method3035(var12);
                     } else {
                        var11 = var12;
                     }
                  }
               }

               if(var11 != null) {
                  this.method3096(var11, var4, var5);
                  if(var6 != var11.field737) {
                     boolean var14 = true;

                     for(class134 var13 = (class134)this.field3790.method5688(); var13 != null; var13 = (class134)this.field3790.method5691()) {
                        if(var13.field1741.equals(var4)) {
                           if(var6 != 0 && var13.field1740 == 0) {
                              var13.method2964();
                              var14 = false;
                           } else if(var6 == 0 && var13.field1740 != 0) {
                              var13.method2964();
                              var14 = false;
                           }
                        }
                     }

                     if(var14) {
                        this.field3790.method5689(new class134(var4, var6));
                     }
                  }
               } else {
                  if(this.method3041() >= 400) {
                     continue;
                  }

                  var11 = (class73)this.method3054(var4, var5);
               }

               if(var6 != var11.field737) {
                  var11.field734 = ++this.field3787 - 1;
                  if(var11.field737 == -1 && var6 == 0) {
                     var11.field734 = -(var11.field734 * 1717545099) * 1607302947;
                  }

                  var11.field737 = var6;
               }

               var11.field733 = var7;
               var11.field835 = var9;
               var11.field834 = var10;
               continue;
            }

            throw new IllegalStateException();
         }

         this.method3039();
         return;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lka;ZI)Z",
      garbageValue = "1004134805"
   )
   public boolean method6029(class158 var1, boolean var2) {
      class73 var3 = (class73)this.method3031(var1);
      return var3 == null?false:!var2 || var3.field737 != 0;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)[Lle;",
      garbageValue = "-341579050"
   )
   static class303[] method6035() {
      class303[] var0 = new class303[class212.field2926];

      for(int var1 = 0; var1 < class212.field2926; ++var1) {
         class303 var2 = var0[var1] = new class303();
         var2.field3763 = class212.field2927;
         var2.field3764 = class212.field2924;
         var2.field3761 = class42.field476[var1];
         var2.field3757 = class212.field2925[var1];
         var2.field3759 = class212.field2922[var1];
         var2.field3762 = class192.field2745[var1];
         var2.field3758 = class225.field3040;
         var2.field3760 = class191.field2740[var1];
      }

      class42.field476 = null;
      class212.field2925 = null;
      class212.field2922 = null;
      class192.field2745 = null;
      class225.field3040 = null;
      class191.field2740 = null;
      return var0;
   }
}
