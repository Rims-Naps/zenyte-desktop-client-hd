package net.runelite.client.standalone;

import java.io.EOFException;
import net.runelite.api.events.VarClientIntChanged;
import net.runelite.api.events.VarClientStrChanged;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSVarcs;

@ObfuscatedName("cg")
public class class54 implements RSVarcs {
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      longValue = -3858353641867567465L
   )
   long field398;
   @ObfuscatedName("c")
   boolean field399;
   @ObfuscatedName("e")
   int[] field397;
   @ObfuscatedName("s")
   boolean[] field396;
   @ObfuscatedName("a")
   String[] field394;
   @ObfuscatedName("w")
   boolean[] field400;

   class54() {
      this.field399 = false;
      this.field397 = new int[class295.field3175.method2616(19)];
      this.onVarCIntChanged(-1);
      this.field394 = new String[class295.field3175.method2616(15)];
      this.onVarCStrChanged(-1);
      this.field400 = new boolean[this.field397.length];

      int var1;
      for(var1 = 0; var1 < this.field397.length; ++var1) {
         class244 var2 = class47.method815(var1);
         this.field400[var1] = var2.field2437;
      }

      this.field396 = new boolean[this.field394.length];

      for(var1 = 0; var1 < this.field394.length; ++var1) {
         class15 var3 = class168.method2871(var1);
         this.field396[var1] = var3.field136;
      }

      for(var1 = 0; var1 < this.field397.length; ++var1) {
         this.field397[var1] = -1;
         this.onVarCIntChanged(var1);
      }

      this.method890();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1714543331"
   )
   void method865(int var1, int var2) {
      this.field397[var1] = var2;
      this.onVarCIntChanged(var1);
      if(this.field400[var1]) {
         this.field399 = true;
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1737511634"
   )
   void method873() {
      if(this.field399 && this.field398 < class234.method4170() - 60000L) {
         this.method871();
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2021993805"
   )
   void method890() {
      class38 var1 = this.method885(false);

      label192: {
         try {
            byte[] var2 = new byte[(int)var1.method600()];

            int var4;
            for(int var3 = 0; var3 < var2.length; var3 += var4) {
               var4 = var1.method601(var2, var3, var2.length - var3);
               if(var4 == -1) {
                  throw new EOFException();
               }
            }

            Buffer var13 = new Buffer(var2);
            if(var13.field1074.length - var13.field1073 >= 1) {
               int var14 = var13.readUnsignedByte();
               if(var14 < 0 || var14 > 1) {
                  return;
               }

               int var15 = var13.readUnsignedShort();

               int var7;
               int var8;
               int var9;
               for(var7 = 0; var7 < var15; ++var7) {
                  var8 = var13.readUnsignedShort();
                  var9 = var13.readInt();
                  if(this.field400[var8]) {
                     this.field397[var8] = var9;
                     this.onVarCIntChanged(var8);
                  }
               }

               var7 = var13.readUnsignedShort();
               var8 = 0;

               while(true) {
                  if(var8 >= var7) {
                     break label192;
                  }

                  var9 = var13.readUnsignedShort();
                  String var10 = var13.readString();
                  if(this.field396[var9]) {
                     this.field394[var9] = var10;
                     this.onVarCStrChanged(var9);
                  }

                  ++var8;
               }
            }
         } catch (Exception var24) {
            break label192;
         } finally {
            try {
               var1.method609();
            } catch (Exception var23) {
               ;
            }

         }

         return;
      }

      this.field399 = false;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-335671228"
   )
   void method871() {
      class38 var1 = this.method885(true);

      try {
         int var2 = 3;
         int var3 = 0;

         int var4;
         for(var4 = 0; var4 < this.field397.length; ++var4) {
            if(this.field400[var4] && this.field397[var4] != -1) {
               var2 += 6;
               ++var3;
            }
         }

         var2 += 2;
         var4 = 0;

         for(int var5 = 0; var5 < this.field394.length; ++var5) {
            if(this.field396[var5] && this.field394[var5] != null) {
               var2 += 2 + class164.method2819(this.field394[var5]);
               ++var4;
            }
         }

         Buffer var9 = new Buffer(var2);
         var9.writeByte(1);
         var9.writeShort(var3);

         int var6;
         for(var6 = 0; var6 < this.field397.length; ++var6) {
            if(this.field400[var6] && this.field397[var6] != -1) {
               var9.writeShort(var6);
               var9.writeInt(this.field397[var6]);
            }
         }

         var9.writeShort(var4);

         for(var6 = 0; var6 < this.field394.length; ++var6) {
            if(this.field396[var6] && this.field394[var6] != null) {
               var9.writeShort(var6);
               var9.writeString(this.field394[var6]);
            }
         }

         var1.method597(var9.field1074, 0, var9.field1073);
      } catch (Exception var17) {
         ;
      } finally {
         try {
            var1.method609();
         } catch (Exception var16) {
            ;
         }

      }

      this.field399 = false;
      this.field398 = class234.method4170();
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(ZI)Lda;",
      garbageValue = "1676208391"
   )
   class38 method885(boolean var1) {
      return class263.method4817("2", class102.field959.field3400, var1);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1634705255"
   )
   void method893() {
      int var1;
      for(var1 = 0; var1 < this.field397.length; ++var1) {
         if(!this.field400[var1]) {
            this.field397[var1] = -1;
            this.onVarCIntChanged(var1);
         }
      }

      for(var1 = 0; var1 < this.field394.length; ++var1) {
         if(!this.field396[var1]) {
            this.field394[var1] = null;
            this.onVarCStrChanged(var1);
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "2009281963"
   )
   int method866(int var1) {
      return this.field397[var1];
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)Ljava/lang/String;",
      garbageValue = "-90"
   )
   String method891(int var1) {
      return this.field394[var1];
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)V",
      garbageValue = "-93616515"
   )
   void method867(int var1, String var2) {
      this.field394[var1] = var2;
      this.onVarCStrChanged(var1);
      if(this.field396[var1]) {
         this.field399 = true;
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-531006108"
   )
   boolean method874() {
      return this.field399;
   }

   public void onVarCStrChanged(int var1) {
      class113.field1064.getCallbacks().post(new VarClientStrChanged(var1));
   }

   public void onVarCIntChanged(int var1) {
      class113.field1064.getCallbacks().post(new VarClientIntChanged(var1));
   }

   public int[] getIntVarcs() {
      return this.field397;
   }

   public String[] getStrVarcs() {
      return this.field394;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(CII)C",
      garbageValue = "-1293162758"
   )
   static char method894(char var0, int var1) {
      if(var0 >= 192 && var0 <= 255) {
         if(var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if(var0 == 199) {
            return 'C';
         }

         if(var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if(var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if(var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if(var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if(var0 == 221) {
            return 'Y';
         }

         if(var0 == 223) {
            return 's';
         }

         if(var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if(var0 == 231) {
            return 'c';
         }

         if(var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if(var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if(var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if(var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if(var0 == 253 || var0 == 255) {
            return 'y';
         }
      }

      return var0 == 338?'O':(var0 == 339?'o':(var0 == 376?'Y':var0));
   }

   @ObfuscatedName("jn")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1777925112"
   )
   static void method895() {
      for(class45 var0 = (class45)client.field3991.method5317(); var0 != null; var0 = (class45)client.field3991.method5313()) {
         int var1 = var0.field351;
         if(class267.method4843(var1)) {
            boolean var2 = true;
            class329[] var3 = class329.field3533[var1];

            int var4;
            for(var4 = 0; var4 < var3.length; ++var4) {
               if(var3[var4] != null) {
                  var2 = var3[var4].field3543;
                  break;
               }
            }

            if(!var2) {
               var4 = (int)var0.field704;
               class329 var5 = class189.getWidget(var4);
               if(var5 != null) {
                  class184.method3216(var5);
               }
            }
         }
      }

   }
}
