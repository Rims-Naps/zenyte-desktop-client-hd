package net.runelite.client.standalone;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSPreferences;

@ObfuscatedName("bk")
public class class197 implements RSPreferences {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1643252537
   )
   static int field1859;
   @ObfuscatedName("p")
   LinkedHashMap field1855;
   @ObfuscatedName("c")
   boolean field1863;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1522670303
   )
   int field1861;
   @ObfuscatedName("s")
   boolean field1857;
   @ObfuscatedName("a")
   String field1860;
   @ObfuscatedName("w")
   boolean field1856;

   static {
      field1859 = 6;
   }

   class197() {
      this.field1861 = 1;
      this.field1860 = null;
      this.field1863 = false;
      this.field1855 = new LinkedHashMap();
      this.method3343(true);
   }

   @ObfuscatedSignature(
      signature = "(Lgm;)V"
   )
   class197(Buffer var1) {
      this.field1861 = 1;
      this.field1860 = null;
      this.field1863 = false;
      this.field1855 = new LinkedHashMap();
      if(var1 != null && var1.field1074 != null) {
         int var2 = var1.readUnsignedByte();
         if(var2 >= 0 && var2 <= field1859) {
            if(var1.readUnsignedByte() == 1) {
               this.field1856 = true;
            }

            if(var2 > 1) {
               this.field1857 = var1.readUnsignedByte() == 1;
            }

            if(var2 > 3) {
               this.field1861 = var1.readUnsignedByte();
            }

            if(var2 > 2) {
               int var3 = var1.readUnsignedByte();

               for(int var4 = 0; var4 < var3; ++var4) {
                  int var5 = var1.readInt();
                  int var6 = var1.readInt();
                  this.field1855.put(Integer.valueOf(var5), Integer.valueOf(var6));
               }
            }

            if(var2 > 4) {
               this.field1860 = var1.method1913();
            }

            if(var2 > 5) {
               this.field1863 = var1.method2088();
            }
         } else {
            this.method3343(true);
         }
      } else {
         this.method3343(true);
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "544874772"
   )
   void method3343(boolean var1) {
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)Lgm;",
      garbageValue = "1992408959"
   )
   Buffer method3344() {
      Buffer var1 = new Buffer(100);
      var1.writeByte(field1859);
      var1.writeByte(this.field1856?1:0);
      var1.writeByte(this.field1857?1:0);
      var1.writeByte(this.field1861);
      var1.writeByte(this.field1855.size());
      Iterator var2 = this.field1855.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.writeInt(((Integer)var3.getKey()).intValue());
         var1.writeInt(((Integer)var3.getValue()).intValue());
      }

      var1.writeString(this.field1860 != null?this.field1860:"");
      var1.method1896(this.field1863);
      return var1;
   }

   public void setRememberedUsername(String var1) {
      this.field1860 = var1;
   }

   public String getRememberedUsername() {
      return this.field1860;
   }

   @ObfuscatedName("p")
   static final void method3350(long var0) {
      class327.field3516[++class327.field3509 - 1] = var0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-782334958"
   )
   static int method3351(int var0, class252 var1, boolean var2) {
      int var3;
      int var4;
      if(var0 == 100) {
         class171.field1587 -= 3;
         var3 = class55.field407[class171.field1587];
         var4 = class55.field407[class171.field1587 + 1];
         int var5 = class55.field407[class171.field1587 + 2];
         if(var4 == 0) {
            throw new RuntimeException();
         } else {
            class329 var6 = class189.getWidget(var3);
            if(var6.field3674 == null) {
               var6.field3674 = new class329[var5 + 1];
            }

            if(var6.field3674.length <= var5) {
               class329[] var7 = new class329[var5 + 1];

               for(int var8 = 0; var8 < var6.field3674.length; ++var8) {
                  var7[var8] = var6.field3674[var8];
               }

               var6.field3674 = var7;
            }

            if(var5 > 0 && var6.field3674[var5 - 1] == null) {
               throw new RuntimeException("" + (var5 - 1));
            } else {
               class329 var12 = new class329();
               var12.field3546 = var4;
               var12.field3563 = var12.field3607 = var6.field3607;
               var12.field3606 = var5;
               var12.field3543 = true;
               var6.field3674[var5] = var12;
               if(var2) {
                  class182.field1766 = var12;
               } else {
                  class20.field155 = var12;
               }

               class184.method3216(var6);
               return 1;
            }
         }
      } else {
         class329 var9;
         if(var0 == 101) {
            var9 = var2?class182.field1766:class20.field155;
            class329 var10 = class189.getWidget(var9.field3607);
            var10.field3674[var9.field3606] = null;
            class184.method3216(var10);
            return 1;
         } else if(var0 == 102) {
            var9 = class189.getWidget(class55.field407[--class171.field1587]);
            var9.field3674 = null;
            class184.method3216(var9);
            return 1;
         } else if(var0 != 200) {
            if(var0 == 201) {
               var9 = class189.getWidget(class55.field407[--class171.field1587]);
               if(var9 != null) {
                  class55.field407[++class171.field1587 - 1] = 1;
                  if(var2) {
                     class182.field1766 = var9;
                  } else {
                     class20.field155 = var9;
                  }
               } else {
                  class55.field407[++class171.field1587 - 1] = 0;
               }

               return 1;
            } else {
               return 2;
            }
         } else {
            class171.field1587 -= 2;
            var3 = class55.field407[class171.field1587];
            var4 = class55.field407[class171.field1587 + 1];
            class329 var11 = class313.method5512(var3, var4);
            if(var11 != null && var4 != -1) {
               class55.field407[++class171.field1587 - 1] = 1;
               if(var2) {
                  class182.field1766 = var11;
               } else {
                  class20.field155 = var11;
               }
            } else {
               class55.field407[++class171.field1587 - 1] = 0;
            }

            return 1;
         }
      }
   }
}
