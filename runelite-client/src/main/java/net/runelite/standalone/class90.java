package net.runelite.standalone;

import java.io.EOFException;
import net.runelite.api.events.VarClientIntChanged;
import net.runelite.api.events.VarClientStrChanged;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSVarcs;

@ObfuscatedName("cg")
public class class90 implements RSVarcs {
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      longValue = -3858353641867567465L
   )
   long field980;
   @ObfuscatedName("c")
   boolean field981;
   @ObfuscatedName("s")
   boolean[] field978;
   @ObfuscatedName("a")
   String[] field976;
   @ObfuscatedName("e")
   int[] field979;
   @ObfuscatedName("w")
   boolean[] field982;

   class90() {
      this.field981 = false;
      this.field979 = new int[class202.configsIndex.method4435(19)];
      this.onVarCIntChanged(-1);
      this.field976 = new String[class202.configsIndex.method4435(15)];
      this.onVarCStrChanged(-1);
      this.field982 = new boolean[this.field979.length];

      int var1;
      for(var1 = 0; var1 < this.field979.length; ++var1) {
         class25 var2 = class167.method3025(var1);
         this.field982[var1] = var2.field265;
      }

      this.field978 = new boolean[this.field976.length];

      for(var1 = 0; var1 < this.field976.length; ++var1) {
         class4 var3 = class265.method5287(var1);
         this.field978[var1] = var3.field38;
      }

      for(var1 = 0; var1 < this.field979.length; ++var1) {
         this.field979[var1] = -1;
         this.onVarCIntChanged(var1);
      }

      this.method1707();
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-335671228"
   )
   void method1688() {
      class283 var1 = this.method1702(true);

      try {
         int var2 = 3;
         int var3 = 0;

         int var4;
         for(var4 = 0; var4 < this.field979.length; ++var4) {
            if(this.field982[var4] && this.field979[var4] != -1) {
               var2 += 6;
               ++var3;
            }
         }

         var2 += 2;
         var4 = 0;

         for(int var5 = 0; var5 < this.field976.length; ++var5) {
            if(this.field978[var5] && this.field976[var5] != null) {
               var2 += 2 + class118.method2136(this.field976[var5]);
               ++var4;
            }
         }

         Buffer var9 = new Buffer(var2);
         var9.method2288(1);
         var9.method2242(var3);

         int var6;
         for(var6 = 0; var6 < this.field979.length; ++var6) {
            if(this.field982[var6] && this.field979[var6] != -1) {
               var9.method2242(var6);
               var9.writeByte(this.field979[var6]);
            }
         }

         var9.method2242(var4);

         for(var6 = 0; var6 < this.field976.length; ++var6) {
            if(this.field978[var6] && this.field976[var6] != null) {
               var9.method2242(var6);
               var9.writeString(this.field976[var6]);
            }
         }

         var1.method5442(var9.field1694, 0, var9.field1693);
      } catch (Exception var17) {
         ;
      } finally {
         try {
            var1.method5454();
         } catch (Exception var16) {
            ;
         }

      }

      this.field981 = false;
      this.field980 = class321.method6252();
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(ZI)Lda;",
      garbageValue = "1676208391"
   )
   class283 method1702(boolean var1) {
      return class177.method3679("2", class210.field2889.field238, var1);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "2009281963"
   )
   int method1683(int var1) {
      return this.field979[var1];
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)Ljava/lang/String;",
      garbageValue = "-90"
   )
   String method1708(int var1) {
      return this.field976[var1];
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1714543331"
   )
   void method1682(int var1, int var2) {
      this.field979[var1] = var2;
      this.onVarCIntChanged(var1);
      if(this.field982[var1]) {
         this.field981 = true;
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2021993805"
   )
   void method1707() {
      class283 var1 = this.method1702(false);

      try {
         byte[] var2 = new byte[(int)var1.method5445()];

         int var4;
         for(int var3 = 0; var3 < var2.length; var3 += var4) {
            var4 = var1.method5446(var2, var3, var2.length - var3);
            if(var4 == -1) {
               throw new EOFException();
            }
         }

         Buffer var13 = new Buffer(var2);
         if(var13.field1694.length - var13.field1693 < 1) {
            return;
         }

         int var14 = var13.readUnsignedByte();
         if(var14 < 0 || var14 > 1) {
            return;
         }

         int var15 = var13.readShort();

         int var7;
         int var8;
         int var9;
         for(var7 = 0; var7 < var15; ++var7) {
            var8 = var13.readShort();
            var9 = var13.readInt();
            if(this.field982[var8]) {
               this.field979[var8] = var9;
               this.onVarCIntChanged(var8);
            }
         }

         var7 = var13.readShort();

         for(var8 = 0; var8 < var7; ++var8) {
            var9 = var13.readShort();
            String var10 = var13.readString();
            if(this.field978[var9]) {
               this.field976[var9] = var10;
               this.onVarCStrChanged(var9);
            }
         }
      } catch (Exception var24) {
         ;
      } finally {
         try {
            var1.method5454();
         } catch (Exception var23) {
            ;
         }

      }

      this.field981 = false;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1737511634"
   )
   void method1690() {
      if(this.field981 && this.field980 < class321.method6252() - 60000L) {
         this.method1688();
      }

   }

   public void onVarCStrChanged(int var1) {
      class302.field3755.getCallbacks().post(new VarClientStrChanged(var1));
   }

   public void onVarCIntChanged(int var1) {
      class302.field3755.getCallbacks().post(new VarClientIntChanged(var1));
   }

   public int[] getIntVarcs() {
      return this.field979;
   }

   public String[] getStrVarcs() {
      return this.field976;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-531006108"
   )
   boolean method1691() {
      return this.field981;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1634705255"
   )
   void method1710() {
      int var1;
      for(var1 = 0; var1 < this.field979.length; ++var1) {
         if(!this.field982[var1]) {
            this.field979[var1] = -1;
            this.onVarCIntChanged(var1);
         }
      }

      for(var1 = 0; var1 < this.field976.length; ++var1) {
         if(!this.field978[var1]) {
            this.field976[var1] = null;
            this.onVarCStrChanged(var1);
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)V",
      garbageValue = "-93616515"
   )
   void method1684(int var1, String var2) {
      this.field976[var1] = var2;
      this.onVarCStrChanged(var1);
      if(this.field978[var1]) {
         this.field981 = true;
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(CII)C",
      garbageValue = "-1293162758"
   )
   static char method1711(char var0, int var1) {
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
   static void method1712() {
      for(class322 var0 = (class322)client.field2412.method1783(); var0 != null; var0 = (class322)client.field2412.method1779()) {
         int var1 = var0.field3937;
         if(class80.method1596(var1)) {
            boolean var2 = true;
            class187[] var3 = class187.field2547[var1];

            int var4;
            for(var4 = 0; var4 < var3.length; ++var4) {
               if(var3[var4] != null) {
                  var2 = var3[var4].field2557;
                  break;
               }
            }

            if(!var2) {
               var4 = (int)var0.field2792;
               class187 var5 = class48.method1047(var4);
               if(var5 != null) {
                  class230.method4617(var5);
               }
            }
         }
      }

   }
}
