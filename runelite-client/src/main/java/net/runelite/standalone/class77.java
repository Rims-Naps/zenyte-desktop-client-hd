package net.runelite.standalone;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSPreferences;

@ObfuscatedName("bk")
public class class77 implements RSPreferences {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1643252537
   )
   static int field857;
   @ObfuscatedName("p")
   LinkedHashMap field853;
   @ObfuscatedName("c")
   boolean field861;
   @ObfuscatedName("s")
   boolean field855;
   @ObfuscatedName("a")
   String field858;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1522670303
   )
   int field859;
   @ObfuscatedName("w")
   boolean field854;

   static {
      field857 = 6;
   }

   class77() {
      this.field859 = 1;
      this.field858 = null;
      this.field861 = false;
      this.field853 = new LinkedHashMap();
      this.method1572(true);
   }

   @ObfuscatedSignature(
      signature = "(Lgm;)V"
   )
   class77(class125 var1) {
      this.field859 = 1;
      this.field858 = null;
      this.field861 = false;
      this.field853 = new LinkedHashMap();
      if(var1 != null && var1.field1694 != null) {
         int var2 = var1.method2256();
         if(var2 >= 0 && var2 <= field857) {
            if(var1.method2256() == 1) {
               this.field854 = true;
            }

            if(var2 > 1) {
               this.field855 = var1.method2256() == 1;
            }

            if(var2 > 3) {
               this.field859 = var1.method2256();
            }

            if(var2 > 2) {
               int var3 = var1.method2256();

               for(int var4 = 0; var4 < var3; ++var4) {
                  int var5 = var1.method2344();
                  int var6 = var1.method2344();
                  this.field853.put(Integer.valueOf(var5), Integer.valueOf(var6));
               }
            }

            if(var2 > 4) {
               this.field858 = var1.method2264();
            }

            if(var2 > 5) {
               this.field861 = var1.method2439();
            }
         } else {
            this.method1572(true);
         }
      } else {
         this.method1572(true);
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)Lgm;",
      garbageValue = "1992408959"
   )
   class125 method1573() {
      class125 var1 = new class125(100);
      var1.method2288(field857);
      var1.method2288(this.field854?1:0);
      var1.method2288(this.field855?1:0);
      var1.method2288(this.field859);
      var1.method2288(this.field853.size());
      Iterator var2 = this.field853.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.method2334(((Integer)var3.getKey()).intValue());
         var1.method2334(((Integer)var3.getValue()).intValue());
      }

      var1.method2358(this.field858 != null?this.field858:"");
      var1.method2247(this.field861);
      return var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "544874772"
   )
   void method1572(boolean var1) {
   }

   public void setRememberedUsername(String var1) {
      this.field858 = var1;
   }

   public String getRememberedUsername() {
      return this.field858;
   }

   @ObfuscatedName("p")
   static final void method1579(long var0) {
      class298.field3710[++class298.field3703 - 1] = var0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "-782334958"
   )
   static int method1580(int var0, class296 var1, boolean var2) {
      int var3;
      int var4;
      if(var0 == 100) {
         class308.field3811 -= 3;
         var3 = class249.field3312[class308.field3811];
         var4 = class249.field3312[class308.field3811 + 1];
         int var5 = class249.field3312[class308.field3811 + 2];
         if(var4 == 0) {
            throw new RuntimeException();
         } else {
            class187 var6 = class48.method1047(var3);
            if(var6.field2688 == null) {
               var6.field2688 = new class187[var5 + 1];
            }

            if(var6.field2688.length <= var5) {
               class187[] var7 = new class187[var5 + 1];

               for(int var8 = 0; var8 < var6.field2688.length; ++var8) {
                  var7[var8] = var6.field2688[var8];
               }

               var6.field2688 = var7;
            }

            if(var5 > 0 && var6.field2688[var5 - 1] == null) {
               throw new RuntimeException("" + (var5 - 1));
            } else {
               class187 var12 = new class187();
               var12.field2560 = var4;
               var12.field2577 = var12.field2621 = var6.field2621;
               var12.field2620 = var5;
               var12.field2557 = true;
               var6.field2688[var5] = var12;
               if(var2) {
                  class3.field36 = var12;
               } else {
                  class284.field3565 = var12;
               }

               class230.method4617(var6);
               return 1;
            }
         }
      } else {
         class187 var9;
         if(var0 == 101) {
            var9 = var2?class3.field36:class284.field3565;
            class187 var10 = class48.method1047(var9.field2621);
            var10.field2688[var9.field2620] = null;
            class230.method4617(var10);
            return 1;
         } else if(var0 == 102) {
            var9 = class48.method1047(class249.field3312[--class308.field3811]);
            var9.field2688 = null;
            class230.method4617(var9);
            return 1;
         } else if(var0 != 200) {
            if(var0 == 201) {
               var9 = class48.method1047(class249.field3312[--class308.field3811]);
               if(var9 != null) {
                  class249.field3312[++class308.field3811 - 1] = 1;
                  if(var2) {
                     class3.field36 = var9;
                  } else {
                     class284.field3565 = var9;
                  }
               } else {
                  class249.field3312[++class308.field3811 - 1] = 0;
               }

               return 1;
            } else {
               return 2;
            }
         } else {
            class308.field3811 -= 2;
            var3 = class249.field3312[class308.field3811];
            var4 = class249.field3312[class308.field3811 + 1];
            class187 var11 = class174.method3220(var3, var4);
            if(var11 != null && var4 != -1) {
               class249.field3312[++class308.field3811 - 1] = 1;
               if(var2) {
                  class3.field36 = var11;
               } else {
                  class284.field3565 = var11;
               }
            } else {
               class249.field3312[++class308.field3811 - 1] = 0;
            }

            return 1;
         }
      }
   }
}
