package net.runelite.client.standalone;

import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
public class class278 implements Runnable {
   @ObfuscatedName("f")
   boolean field3016;
   @ObfuscatedName("e")
   int[] field3011;
   @ObfuscatedName("l")
   Object field3015;
   @ObfuscatedName("s")
   int[] field3014;
   @ObfuscatedName("a")
   long[] field3012;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -602861203
   )
   int field3013;

   class278() {
      this.field3016 = true;
      this.field3015 = new Object();
      this.field3013 = 0;
      this.field3014 = new int[500];
      this.field3011 = new int[500];
      this.field3012 = new long[500];
   }

   public void run() {
      for(; this.field3016; class189.method3249(50L)) {
         Object var1 = this.field3015;
         synchronized(this.field3015) {
            if(this.field3013 < 500) {
               this.field3014[this.field3013] = class226.field2215;
               this.field3011[this.field3013] = class226.field2216;
               this.field3012[this.field3013] = class226.field2214;
               ++this.field3013;
            }
         }
      }

   }

   @ObfuscatedName("jy")
   @ObfuscatedSignature(
      signature = "(IIIILlp;Lht;I)V",
      garbageValue = "-157924081"
   )
   static final void method4944(int var0, int var1, int var2, int var3, class26 var4, class123 var5) {
      if(var4 != null) {
         int var6 = client.field3802 & 2047;
         int var7 = var3 * var3 + var2 * var2;
         if(var7 <= 6400) {
            int var8 = class257.field2564[var6];
            int var9 = class257.field2558[var6];
            int var10 = var9 * var2 + var3 * var8 >> 16;
            int var11 = var3 * var9 - var8 * var2 >> 16;
            if(var7 > 2500) {
               var4.method398(var10 + var5.field1174 / 2 - var4.field207 / 2, var5.field1171 / 2 - var11 - var4.field210 / 2, var0, var1, var5.field1174, var5.field1171, var5.field1172, var5.field1169);
            } else {
               var4.method378(var0 + var10 + var5.field1174 / 2 - var4.field207 / 2, var5.field1171 / 2 + var1 - var11 - var4.field210 / 2);
            }

         }
      }
   }

   @ObfuscatedName("hu")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-1718985240"
   )
   static final void method4947(int var0, int var1, int var2, int var3) {
      for(int var4 = 0; var4 < client.field3935; ++var4) {
         if(client.field3942[var4] + client.field3901[var4] > var0 && client.field3901[var4] < var0 + var2 && client.field3943[var4] + client.field3941[var4] > var1 && client.field3941[var4] < var3 + var1) {
            client.field3866[var4] = true;
         }
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(ILcz;ZI)I",
      garbageValue = "355877661"
   )
   static int method4946(int var0, class252 var1, boolean var2) {
      String var3;
      int var4;
      if(var0 == 4100) {
         var3 = class55.field408[--class272.field2978];
         var4 = class55.field407[--class171.field1587];
         class55.field408[++class272.field2978 - 1] = var3 + var4;
         return 1;
      } else {
         String var9;
         if(var0 == 4101) {
            class272.field2978 -= 2;
            var3 = class55.field408[class272.field2978];
            var9 = class55.field408[class272.field2978 + 1];
            class55.field408[++class272.field2978 - 1] = var3 + var9;
            return 1;
         } else if(var0 == 4102) {
            var3 = class55.field408[--class272.field2978];
            var4 = class55.field407[--class171.field1587];
            class55.field408[++class272.field2978 - 1] = var3 + class155.method2726(var4, true);
            return 1;
         } else if(var0 == 4103) {
            var3 = class55.field408[--class272.field2978];
            class55.field408[++class272.field2978 - 1] = var3.toLowerCase();
            return 1;
         } else {
            int var6;
            int var10;
            if(var0 == 4104) {
               var10 = class55.field407[--class171.field1587];
               long var11 = 86400000L * (11745L + (long)var10);
               class55.field411.setTime(new Date(var11));
               var6 = class55.field411.get(5);
               int var16 = class55.field411.get(2);
               int var8 = class55.field411.get(1);
               class55.field408[++class272.field2978 - 1] = var6 + "-" + class55.field412[var16] + "-" + var8;
               return 1;
            } else if(var0 != 4105) {
               if(var0 == 4106) {
                  var10 = class55.field407[--class171.field1587];
                  class55.field408[++class272.field2978 - 1] = Integer.toString(var10);
                  return 1;
               } else if(var0 == 4107) {
                  class272.field2978 -= 2;
                  class55.field407[++class171.field1587 - 1] = class181.method3159(class25.method363(class55.field408[class272.field2978], class55.field408[class272.field2978 + 1], client.field3737));
                  return 1;
               } else {
                  int var5;
                  byte[] var13;
                  class277 var14;
                  if(var0 == 4108) {
                     var3 = class55.field408[--class272.field2978];
                     class171.field1587 -= 2;
                     var4 = class55.field407[class171.field1587];
                     var5 = class55.field407[class171.field1587 + 1];
                     var13 = class288.field3128.method2579(var5, 0, 549820083);
                     var14 = new class277(var13);
                     class55.field407[++class171.field1587 - 1] = var14.method3523(var3, var4);
                     return 1;
                  } else if(var0 == 4109) {
                     var3 = class55.field408[--class272.field2978];
                     class171.field1587 -= 2;
                     var4 = class55.field407[class171.field1587];
                     var5 = class55.field407[class171.field1587 + 1];
                     var13 = class288.field3128.method2579(var5, 0, -32568540);
                     var14 = new class277(var13);
                     class55.field407[++class171.field1587 - 1] = var14.method3568(var3, var4);
                     return 1;
                  } else if(var0 == 4110) {
                     class272.field2978 -= 2;
                     var3 = class55.field408[class272.field2978];
                     var9 = class55.field408[class272.field2978 + 1];
                     if(class55.field407[--class171.field1587] == 1) {
                        class55.field408[++class272.field2978 - 1] = var3;
                     } else {
                        class55.field408[++class272.field2978 - 1] = var9;
                     }

                     return 1;
                  } else if(var0 == 4111) {
                     var3 = class55.field408[--class272.field2978];
                     class55.field408[++class272.field2978 - 1] = class207.method3524(var3);
                     return 1;
                  } else if(var0 == 4112) {
                     var3 = class55.field408[--class272.field2978];
                     var4 = class55.field407[--class171.field1587];
                     class55.field408[++class272.field2978 - 1] = var3 + (char)var4;
                     return 1;
                  } else if(var0 == 4113) {
                     var10 = class55.field407[--class171.field1587];
                     class55.field407[++class171.field1587 - 1] = class299.method5191((char)var10)?1:0;
                     return 1;
                  } else if(var0 == 4114) {
                     var10 = class55.field407[--class171.field1587];
                     class55.field407[++class171.field1587 - 1] = class244.method4480((char)var10)?1:0;
                     return 1;
                  } else if(var0 == 4115) {
                     var10 = class55.field407[--class171.field1587];
                     class55.field407[++class171.field1587 - 1] = class300.method5192((char)var10)?1:0;
                     return 1;
                  } else if(var0 == 4116) {
                     var10 = class55.field407[--class171.field1587];
                     class55.field407[++class171.field1587 - 1] = class236.method4185((char)var10)?1:0;
                     return 1;
                  } else if(var0 == 4117) {
                     var3 = class55.field408[--class272.field2978];
                     if(var3 != null) {
                        class55.field407[++class171.field1587 - 1] = var3.length();
                     } else {
                        class55.field407[++class171.field1587 - 1] = 0;
                     }

                     return 1;
                  } else if(var0 == 4118) {
                     var3 = class55.field408[--class272.field2978];
                     class171.field1587 -= 2;
                     var4 = class55.field407[class171.field1587];
                     var5 = class55.field407[class171.field1587 + 1];
                     class55.field408[++class272.field2978 - 1] = var3.substring(var4, var5);
                     return 1;
                  } else if(var0 == 4119) {
                     var3 = class55.field408[--class272.field2978];
                     StringBuilder var17 = new StringBuilder(var3.length());
                     boolean var15 = false;

                     for(var6 = 0; var6 < var3.length(); ++var6) {
                        char var7 = var3.charAt(var6);
                        if(var7 == '<') {
                           var15 = true;
                        } else if(var7 == '>') {
                           var15 = false;
                        } else if(!var15) {
                           var17.append(var7);
                        }
                     }

                     class55.field408[++class272.field2978 - 1] = var17.toString();
                     return 1;
                  } else if(var0 == 4120) {
                     var3 = class55.field408[--class272.field2978];
                     var4 = class55.field407[--class171.field1587];
                     class55.field407[++class171.field1587 - 1] = var3.indexOf(var4);
                     return 1;
                  } else if(var0 == 4121) {
                     class272.field2978 -= 2;
                     var3 = class55.field408[class272.field2978];
                     var9 = class55.field408[class272.field2978 + 1];
                     var5 = class55.field407[--class171.field1587];
                     class55.field407[++class171.field1587 - 1] = var3.indexOf(var9, var5);
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               class272.field2978 -= 2;
               var3 = class55.field408[class272.field2978];
               var9 = class55.field408[class272.field2978 + 1];
               if(class5.field43.field576 != null && class5.field43.field576.field344) {
                  class55.field408[++class272.field2978 - 1] = var9;
               } else {
                  class55.field408[++class272.field2978 - 1] = var3;
               }

               return 1;
            }
         }
      }
   }

   @ObfuscatedName("iv")
   @ObfuscatedSignature(
      signature = "(IIIIIIB)V",
      garbageValue = "0"
   )
   static final void method4941(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 - var0;
      int var7 = var3 - var1;
      int var8 = var6 >= 0?var6:-var6;
      int var9 = var7 >= 0?var7:-var7;
      int var10 = var8;
      if(var8 < var9) {
         var10 = var9;
      }

      if(var10 != 0) {
         int var11 = (var6 << 16) / var10;
         int var12 = (var7 << 16) / var10;
         if(var12 <= var11) {
            var11 = -var11;
         } else {
            var12 = -var12;
         }

         int var13 = var5 * var12 >> 17;
         int var14 = var5 * var12 + 1 >> 17;
         int var15 = var5 * var11 >> 17;
         int var16 = var5 * var11 + 1 >> 17;
         var0 -= class89.field867;
         var1 -= class89.field865;
         int var17 = var0 + var13;
         int var18 = var0 - var14;
         int var19 = var0 + var6 - var14;
         int var20 = var0 + var6 + var13;
         int var21 = var15 + var1;
         int var22 = var1 - var16;
         int var23 = var7 + var1 - var16;
         int var24 = var7 + var15 + var1;
         class257.method4585(var17, var18, var19);
         class257.method4648(var21, var22, var23, var17, var18, var19, var4);
         class257.method4585(var17, var19, var20);
         class257.method4648(var21, var23, var24, var17, var19, var20, var4);
      }
   }
}
